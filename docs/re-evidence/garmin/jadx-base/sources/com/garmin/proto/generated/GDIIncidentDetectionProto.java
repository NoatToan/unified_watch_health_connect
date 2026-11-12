package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
import com.google.common.net.HttpHeaders;
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
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

/* JADX INFO: loaded from: classes5.dex */
public final class GDIIncidentDetectionProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001aGDIIncidentDetection.proto\u0012\u001bGDI.Proto.IncidentDetection\u001a\u0012GDIDataTypes.proto\"¾\u0007\n\u0018IncidentDetectionService\u0012Z\n\u001bupdate_device_owner_request\u0018\u0001 \u0001(\u000b25.GDI.Proto.IncidentDetection.UpdateDeviceOwnerRequest\u0012\\\n\u001cupdate_device_owner_response\u0018\u0002 \u0001(\u000b26.GDI.Proto.IncidentDetection.UpdateDeviceOwnerResponse\u0012d\n update_incident_contacts_request\u0018\u0003 \u0001(\u000b2:.GDI.Proto.IncidentDetection.UpdateIncidentContactsRequest\u0012f\n!update_incident_contacts_response\u0018\u0004 \u0001(\u000b2;.GDI.Proto.IncidentDetection.UpdateIncidentContactsResponse\u0012W\n\u0019incident_detected_request\u0018\u0005 \u0001(\u000b24.GDI.Proto.IncidentDetection.IncidentDetectedRequest\u0012Y\n\u001aincident_detected_response\u0018\u0006 \u0001(\u000b25.GDI.Proto.IncidentDetection.IncidentDetectedResponse\u0012S\n\u0017cancel_incident_request\u0018\u0007 \u0001(\u000b22.GDI.Proto.IncidentDetection.CancelIncidentRequest\u0012U\n\u0018cancel_incident_response\u0018\b \u0001(\u000b23.GDI.Proto.IncidentDetection.CancelIncidentResponse\u0012]\n\u001cincident_status_notification\u0018\t \u0001(\u000b27.GDI.Proto.IncidentDetection.IncidentStatusNotification\u0012[\n\u001bincident_video_notification\u0018\n \u0001(\u000b26.GDI.Proto.IncidentDetection.IncidentVideoNotification\":\n\u0018UpdateDeviceOwnerRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0010\n\blocation\u0018\u0002 \u0001(\t\"¥\u0001\n\u0019UpdateDeviceOwnerResponse\u0012U\n\u0006status\u0018\u0001 \u0002(\u000e2E.GDI.Proto.IncidentDetection.UpdateDeviceOwnerResponse.ResponseStatus\"1\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\"V\n\u001dUpdateIncidentContactsRequest\u00125\n\u0007contact\u0018\u0001 \u0003(\u000b2$.GDI.Proto.IncidentDetection.Contact\"¯\u0001\n\u001eUpdateIncidentContactsResponse\u0012Z\n\u0006status\u0018\u0001 \u0002(\u000e2J.GDI.Proto.IncidentDetection.UpdateIncidentContactsResponse.ResponseStatus\"1\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\"M\n\u0007Contact\u0012\n\n\u0002id\u0018\u0001 \u0002(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u0011\n\ttelephone\u0018\u0003 \u0003(\t\u0012\u0015\n\remail_address\u0018\u0004 \u0003(\t\" \u0002\n\u0017IncidentDetectedRequest\u0012.\n\bposition\u0018\u0001 \u0002(\u000b2\u001c.GDI.Proto.DataTypes.ScPoint\u0012<\n1seconds_to_delay_before_notifying_contact_persons\u0018\u0002 \u0002(\r:\u00010\u0012N\n\u0004type\u0018\u0003 \u0001(\u000e2@.GDI.Proto.IncidentDetection.IncidentDetectedRequest.RequestType\"G\n\u000bRequestType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0014\n\u0010CYCLING_INCIDENT\u0010\u0001\u0012\u0015\n\u0011ASSISTANCE_NEEDED\u0010\u0002\"®\u0001\n\u0018IncidentDetectedResponse\u0012T\n\u0006status\u0018\u0001 \u0002(\u000e2D.GDI.Proto.IncidentDetection.IncidentDetectedResponse.ResponseStatus\"<\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0011\n\rTIMER_STARTED\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\"é\u0001\n\u001aIncidentStatusNotification\u0012N\n\u0006status\u0018\u0001 \u0002(\u000e2>.GDI.Proto.IncidentDetection.IncidentStatusNotification.Status\"{\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012*\n&SENT_NOTIFICATIONS_TO_CONTACTS_SUCCESS\u0010\u0001\u0012*\n&SENT_NOTIFICATIONS_TO_CONTACTS_FAILURE\u0010\u0002\u0012\f\n\bFINISHED\u0010\u0003\"\u0017\n\u0015CancelIncidentRequest\"¤\u0001\n\u0016CancelIncidentResponse\u0012R\n\u0006status\u0018\u0001 \u0002(\u000e2B.GDI.Proto.IncidentDetection.CancelIncidentResponse.ResponseStatus\"6\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\"\u001b\n\u0019IncidentVideoNotificationB9\n\u001acom.garmin.proto.generatedB\u0019GDIIncidentDetectionProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_CancelIncidentRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_CancelIncidentRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_CancelIncidentResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_CancelIncidentResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_Contact_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_Contact_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_IncidentDetectedRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_IncidentDetectedRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_IncidentDetectedResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_IncidentDetectedResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_IncidentDetectionService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_IncidentDetectionService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_IncidentStatusNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_IncidentStatusNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_IncidentVideoNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_IncidentVideoNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsResponse_fieldAccessorTable;

    public interface CancelIncidentRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CancelIncidentResponseOrBuilder extends MessageOrBuilder {
        CancelIncidentResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface ContactOrBuilder extends MessageOrBuilder {
        String getEmailAddress(int i14);

        ByteString getEmailAddressBytes(int i14);

        int getEmailAddressCount();

        List<String> getEmailAddressList();

        String getId();

        ByteString getIdBytes();

        String getName();

        ByteString getNameBytes();

        String getTelephone(int i14);

        ByteString getTelephoneBytes(int i14);

        int getTelephoneCount();

        List<String> getTelephoneList();

        boolean hasId();

        boolean hasName();
    }

    public interface IncidentDetectedRequestOrBuilder extends MessageOrBuilder {
        GDIDataTypes.ScPoint getPosition();

        GDIDataTypes.ScPointOrBuilder getPositionOrBuilder();

        int getSecondsToDelayBeforeNotifyingContactPersons();

        IncidentDetectedRequest.RequestType getType();

        boolean hasPosition();

        boolean hasSecondsToDelayBeforeNotifyingContactPersons();

        boolean hasType();
    }

    public interface IncidentDetectedResponseOrBuilder extends MessageOrBuilder {
        IncidentDetectedResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface IncidentDetectionServiceOrBuilder extends MessageOrBuilder {
        CancelIncidentRequest getCancelIncidentRequest();

        CancelIncidentRequestOrBuilder getCancelIncidentRequestOrBuilder();

        CancelIncidentResponse getCancelIncidentResponse();

        CancelIncidentResponseOrBuilder getCancelIncidentResponseOrBuilder();

        IncidentDetectedRequest getIncidentDetectedRequest();

        IncidentDetectedRequestOrBuilder getIncidentDetectedRequestOrBuilder();

        IncidentDetectedResponse getIncidentDetectedResponse();

        IncidentDetectedResponseOrBuilder getIncidentDetectedResponseOrBuilder();

        IncidentStatusNotification getIncidentStatusNotification();

        IncidentStatusNotificationOrBuilder getIncidentStatusNotificationOrBuilder();

        IncidentVideoNotification getIncidentVideoNotification();

        IncidentVideoNotificationOrBuilder getIncidentVideoNotificationOrBuilder();

        UpdateDeviceOwnerRequest getUpdateDeviceOwnerRequest();

        UpdateDeviceOwnerRequestOrBuilder getUpdateDeviceOwnerRequestOrBuilder();

        UpdateDeviceOwnerResponse getUpdateDeviceOwnerResponse();

        UpdateDeviceOwnerResponseOrBuilder getUpdateDeviceOwnerResponseOrBuilder();

        UpdateIncidentContactsRequest getUpdateIncidentContactsRequest();

        UpdateIncidentContactsRequestOrBuilder getUpdateIncidentContactsRequestOrBuilder();

        UpdateIncidentContactsResponse getUpdateIncidentContactsResponse();

        UpdateIncidentContactsResponseOrBuilder getUpdateIncidentContactsResponseOrBuilder();

        boolean hasCancelIncidentRequest();

        boolean hasCancelIncidentResponse();

        boolean hasIncidentDetectedRequest();

        boolean hasIncidentDetectedResponse();

        boolean hasIncidentStatusNotification();

        boolean hasIncidentVideoNotification();

        boolean hasUpdateDeviceOwnerRequest();

        boolean hasUpdateDeviceOwnerResponse();

        boolean hasUpdateIncidentContactsRequest();

        boolean hasUpdateIncidentContactsResponse();
    }

    public interface IncidentStatusNotificationOrBuilder extends MessageOrBuilder {
        IncidentStatusNotification.Status getStatus();

        boolean hasStatus();
    }

    public interface IncidentVideoNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface UpdateDeviceOwnerRequestOrBuilder extends MessageOrBuilder {
        String getLocation();

        ByteString getLocationBytes();

        String getName();

        ByteString getNameBytes();

        boolean hasLocation();

        boolean hasName();
    }

    public interface UpdateDeviceOwnerResponseOrBuilder extends MessageOrBuilder {
        UpdateDeviceOwnerResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface UpdateIncidentContactsRequestOrBuilder extends MessageOrBuilder {
        Contact getContact(int i14);

        int getContactCount();

        List<Contact> getContactList();

        ContactOrBuilder getContactOrBuilder(int i14);

        List<? extends ContactOrBuilder> getContactOrBuilderList();
    }

    public interface UpdateIncidentContactsResponseOrBuilder extends MessageOrBuilder {
        UpdateIncidentContactsResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_IncidentDetection_IncidentDetectionService_descriptor = descriptor2;
        internal_static_GDI_Proto_IncidentDetection_IncidentDetectionService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"UpdateDeviceOwnerRequest", "UpdateDeviceOwnerResponse", "UpdateIncidentContactsRequest", "UpdateIncidentContactsResponse", "IncidentDetectedRequest", "IncidentDetectedResponse", "CancelIncidentRequest", "CancelIncidentResponse", "IncidentStatusNotification", "IncidentVideoNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Name", HttpHeaders.LOCATION});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Contact"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_IncidentDetection_Contact_descriptor = descriptor7;
        internal_static_GDI_Proto_IncidentDetection_Contact_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Id", "Name", "Telephone", "EmailAddress"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_IncidentDetection_IncidentDetectedRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_IncidentDetection_IncidentDetectedRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Position", "SecondsToDelayBeforeNotifyingContactPersons", "Type"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_IncidentDetection_IncidentDetectedResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_IncidentDetection_IncidentDetectedResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_IncidentDetection_IncidentStatusNotification_descriptor = descriptor10;
        internal_static_GDI_Proto_IncidentDetection_IncidentStatusNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Status"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_IncidentDetection_CancelIncidentRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_IncidentDetection_CancelIncidentRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[0]);
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_IncidentDetection_CancelIncidentResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_IncidentDetection_CancelIncidentResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Status"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_IncidentDetection_IncidentVideoNotification_descriptor = descriptor13;
        internal_static_GDI_Proto_IncidentDetection_IncidentVideoNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[0]);
        GDIDataTypes.getDescriptor();
    }

    private GDIIncidentDetectionProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class CancelIncidentRequest extends GeneratedMessageV3 implements CancelIncidentRequestOrBuilder {
        private static final CancelIncidentRequest DEFAULT_INSTANCE = new CancelIncidentRequest();

        @Deprecated
        public static final Parser<CancelIncidentRequest> PARSER = new AbstractParser<CancelIncidentRequest>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.CancelIncidentRequest.1
            @Override // com.google.protobuf.Parser
            public CancelIncidentRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CancelIncidentRequest.newBuilder();
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

        private CancelIncidentRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CancelIncidentRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_CancelIncidentRequest_descriptor;
        }

        public static Builder newBuilder(CancelIncidentRequest cancelIncidentRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cancelIncidentRequest);
        }

        public static CancelIncidentRequest parseDelimitedFrom(InputStream inputStream) {
            return (CancelIncidentRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CancelIncidentRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CancelIncidentRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CancelIncidentRequest) {
                return getUnknownFields().equals(((CancelIncidentRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CancelIncidentRequest> getParserForType() {
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
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_CancelIncidentRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelIncidentRequest.class, Builder.class);
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
            return new CancelIncidentRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CancelIncidentRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_CancelIncidentRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelIncidentRequest build() {
                CancelIncidentRequest cancelIncidentRequestBuildPartial = buildPartial();
                if (cancelIncidentRequestBuildPartial.isInitialized()) {
                    return cancelIncidentRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cancelIncidentRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelIncidentRequest buildPartial() {
                CancelIncidentRequest cancelIncidentRequest = new CancelIncidentRequest(this);
                onBuilt();
                return cancelIncidentRequest;
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
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_CancelIncidentRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_CancelIncidentRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelIncidentRequest.class, Builder.class);
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
            public CancelIncidentRequest getDefaultInstanceForType() {
                return CancelIncidentRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CancelIncidentRequest) {
                    return mergeFrom((CancelIncidentRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CancelIncidentRequest cancelIncidentRequest) {
                if (cancelIncidentRequest == CancelIncidentRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(cancelIncidentRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CancelIncidentRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CancelIncidentRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CancelIncidentRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CancelIncidentRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelIncidentRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelIncidentRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CancelIncidentRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CancelIncidentRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CancelIncidentRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CancelIncidentRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CancelIncidentRequest parseFrom(InputStream inputStream) {
            return (CancelIncidentRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CancelIncidentRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelIncidentRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelIncidentRequest parseFrom(CodedInputStream codedInputStream) {
            return (CancelIncidentRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CancelIncidentRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelIncidentRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class IncidentVideoNotification extends GeneratedMessageV3 implements IncidentVideoNotificationOrBuilder {
        private static final IncidentVideoNotification DEFAULT_INSTANCE = new IncidentVideoNotification();

        @Deprecated
        public static final Parser<IncidentVideoNotification> PARSER = new AbstractParser<IncidentVideoNotification>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentVideoNotification.1
            @Override // com.google.protobuf.Parser
            public IncidentVideoNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = IncidentVideoNotification.newBuilder();
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

        private IncidentVideoNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IncidentVideoNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentVideoNotification_descriptor;
        }

        public static Builder newBuilder(IncidentVideoNotification incidentVideoNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(incidentVideoNotification);
        }

        public static IncidentVideoNotification parseDelimitedFrom(InputStream inputStream) {
            return (IncidentVideoNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IncidentVideoNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<IncidentVideoNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof IncidentVideoNotification) {
                return getUnknownFields().equals(((IncidentVideoNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<IncidentVideoNotification> getParserForType() {
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
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentVideoNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(IncidentVideoNotification.class, Builder.class);
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
            return new IncidentVideoNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IncidentVideoNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentVideoNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IncidentVideoNotification build() {
                IncidentVideoNotification incidentVideoNotificationBuildPartial = buildPartial();
                if (incidentVideoNotificationBuildPartial.isInitialized()) {
                    return incidentVideoNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) incidentVideoNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IncidentVideoNotification buildPartial() {
                IncidentVideoNotification incidentVideoNotification = new IncidentVideoNotification(this);
                onBuilt();
                return incidentVideoNotification;
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
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentVideoNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentVideoNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(IncidentVideoNotification.class, Builder.class);
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
            public IncidentVideoNotification getDefaultInstanceForType() {
                return IncidentVideoNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof IncidentVideoNotification) {
                    return mergeFrom((IncidentVideoNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(IncidentVideoNotification incidentVideoNotification) {
                if (incidentVideoNotification == IncidentVideoNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(incidentVideoNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IncidentVideoNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ IncidentVideoNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private IncidentVideoNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IncidentVideoNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentVideoNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IncidentVideoNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static IncidentVideoNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IncidentVideoNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static IncidentVideoNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static IncidentVideoNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static IncidentVideoNotification parseFrom(InputStream inputStream) {
            return (IncidentVideoNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static IncidentVideoNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentVideoNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IncidentVideoNotification parseFrom(CodedInputStream codedInputStream) {
            return (IncidentVideoNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static IncidentVideoNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentVideoNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CancelIncidentResponse extends GeneratedMessageV3 implements CancelIncidentResponseOrBuilder {
        private static final CancelIncidentResponse DEFAULT_INSTANCE = new CancelIncidentResponse();

        @Deprecated
        public static final Parser<CancelIncidentResponse> PARSER = new AbstractParser<CancelIncidentResponse>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.CancelIncidentResponse.1
            @Override // com.google.protobuf.Parser
            public CancelIncidentResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CancelIncidentResponse.newBuilder();
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

        private CancelIncidentResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CancelIncidentResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_CancelIncidentResponse_descriptor;
        }

        public static Builder newBuilder(CancelIncidentResponse cancelIncidentResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cancelIncidentResponse);
        }

        public static CancelIncidentResponse parseDelimitedFrom(InputStream inputStream) {
            return (CancelIncidentResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CancelIncidentResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CancelIncidentResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CancelIncidentResponse)) {
                return super.equals(obj);
            }
            CancelIncidentResponse cancelIncidentResponse = (CancelIncidentResponse) obj;
            if (hasStatus() != cancelIncidentResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == cancelIncidentResponse.status_) && getUnknownFields().equals(cancelIncidentResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CancelIncidentResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.CancelIncidentResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.CancelIncidentResponseOrBuilder
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
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_CancelIncidentResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelIncidentResponse.class, Builder.class);
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
            if (hasStatus()) {
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
            return new CancelIncidentResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CancelIncidentResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(CancelIncidentResponse cancelIncidentResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    cancelIncidentResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                cancelIncidentResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_CancelIncidentResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelIncidentResponse build() {
                CancelIncidentResponse cancelIncidentResponseBuildPartial = buildPartial();
                if (cancelIncidentResponseBuildPartial.isInitialized()) {
                    return cancelIncidentResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cancelIncidentResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelIncidentResponse buildPartial() {
                CancelIncidentResponse cancelIncidentResponse = new CancelIncidentResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cancelIncidentResponse);
                }
                onBuilt();
                return cancelIncidentResponse;
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
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_CancelIncidentResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.CancelIncidentResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.CancelIncidentResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_CancelIncidentResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelIncidentResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus();
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
                                    if (ResponseStatus.forNumber(i14) == null) {
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

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CancelIncidentResponse getDefaultInstanceForType() {
                return CancelIncidentResponse.getDefaultInstance();
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
                if (message instanceof CancelIncidentResponse) {
                    return mergeFrom((CancelIncidentResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CancelIncidentResponse cancelIncidentResponse) {
                if (cancelIncidentResponse == CancelIncidentResponse.getDefaultInstance()) {
                    return this;
                }
                if (cancelIncidentResponse.hasStatus()) {
                    setStatus(cancelIncidentResponse.getStatus());
                }
                mergeUnknownFields(cancelIncidentResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CancelIncidentResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CancelIncidentResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelIncidentResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelIncidentResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CancelIncidentResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CancelIncidentResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CancelIncidentResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CancelIncidentResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CancelIncidentResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CancelIncidentResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CancelIncidentResponse parseFrom(InputStream inputStream) {
            return (CancelIncidentResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CancelIncidentResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelIncidentResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelIncidentResponse parseFrom(CodedInputStream codedInputStream) {
            return (CancelIncidentResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CancelIncidentResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelIncidentResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            SUCCESS(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int SUCCESS_VALUE = 100;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.CancelIncidentResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 100) {
                    return SUCCESS;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CancelIncidentResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Contact extends GeneratedMessageV3 implements ContactOrBuilder {
        public static final int EMAIL_ADDRESS_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int TELEPHONE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LazyStringArrayList emailAddress_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private LazyStringArrayList telephone_;
        private static final Contact DEFAULT_INSTANCE = new Contact();

        @Deprecated
        public static final Parser<Contact> PARSER = new AbstractParser<Contact>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.Contact.1
            @Override // com.google.protobuf.Parser
            public Contact parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Contact.newBuilder();
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

        private Contact() {
            this.id_ = "";
            this.name_ = "";
            this.telephone_ = LazyStringArrayList.emptyList();
            this.emailAddress_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.name_ = "";
            this.telephone_ = LazyStringArrayList.emptyList();
            this.emailAddress_ = LazyStringArrayList.emptyList();
        }

        public static Contact getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_Contact_descriptor;
        }

        public static Builder newBuilder(Contact contact) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(contact);
        }

        public static Contact parseDelimitedFrom(InputStream inputStream) {
            return (Contact) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Contact parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Contact> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Contact)) {
                return super.equals(obj);
            }
            Contact contact = (Contact) obj;
            if (hasId() != contact.hasId()) {
                return false;
            }
            if ((!hasId() || getId().equals(contact.getId())) && hasName() == contact.hasName()) {
                return (!hasName() || getName().equals(contact.getName())) && getTelephoneList().equals(contact.getTelephoneList()) && getEmailAddressList().equals(contact.getEmailAddressList()) && getUnknownFields().equals(contact.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
        public String getEmailAddress(int i14) {
            return this.emailAddress_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
        public ByteString getEmailAddressBytes(int i14) {
            return this.emailAddress_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
        public int getEmailAddressCount() {
            return this.emailAddress_.size();
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.id_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
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

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
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
        public Parser<Contact> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            int iD = 0;
            for (int i15 = 0; i15 < this.telephone_.size(); i15++) {
                iD = f3.d(this.telephone_, i15, iD);
            }
            int size = getTelephoneList().size() + iComputeStringSize + iD;
            int iD2 = 0;
            for (int i16 = 0; i16 < this.emailAddress_.size(); i16++) {
                iD2 = f3.d(this.emailAddress_, i16, iD2);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getEmailAddressList().size() + size + iD2;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
        public String getTelephone(int i14) {
            return this.telephone_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
        public ByteString getTelephoneBytes(int i14) {
            return this.telephone_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
        public int getTelephoneCount() {
            return this.telephone_.size();
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
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
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId().hashCode();
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getName().hashCode();
            }
            if (getTelephoneCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTelephoneList().hashCode();
            }
            if (getEmailAddressCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getEmailAddressList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_Contact_fieldAccessorTable.ensureFieldAccessorsInitialized(Contact.class, Builder.class);
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
            if (hasId()) {
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
            return new Contact();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            int iE = 0;
            while (iE < this.telephone_.size()) {
                iE = f3.e(this.telephone_, iE, codedOutputStream, 3, iE, 1);
            }
            int iE2 = 0;
            while (iE2 < this.emailAddress_.size()) {
                iE2 = f3.e(this.emailAddress_, iE2, codedOutputStream, 4, iE2, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ContactOrBuilder {
            private int bitField0_;
            private LazyStringArrayList emailAddress_;
            private Object id_;
            private Object name_;
            private LazyStringArrayList telephone_;

            private Builder() {
                this.id_ = "";
                this.name_ = "";
                this.telephone_ = LazyStringArrayList.emptyList();
                this.emailAddress_ = LazyStringArrayList.emptyList();
            }

            private void buildPartial0(Contact contact) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    contact.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    contact.name_ = this.name_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    this.telephone_.makeImmutable();
                    contact.telephone_ = this.telephone_;
                }
                if ((i15 & 8) != 0) {
                    this.emailAddress_.makeImmutable();
                    contact.emailAddress_ = this.emailAddress_;
                }
                contact.bitField0_ |= i14;
            }

            private void ensureEmailAddressIsMutable() {
                if (!this.emailAddress_.isModifiable()) {
                    this.emailAddress_ = new LazyStringArrayList((LazyStringList) this.emailAddress_);
                }
                this.bitField0_ |= 8;
            }

            private void ensureTelephoneIsMutable() {
                if (!this.telephone_.isModifiable()) {
                    this.telephone_ = new LazyStringArrayList((LazyStringList) this.telephone_);
                }
                this.bitField0_ |= 4;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_Contact_descriptor;
            }

            public Builder addAllEmailAddress(Iterable<String> iterable) {
                ensureEmailAddressIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.emailAddress_);
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder addAllTelephone(Iterable<String> iterable) {
                ensureTelephoneIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.telephone_);
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder addEmailAddress(String str) {
                str.getClass();
                ensureEmailAddressIsMutable();
                this.emailAddress_.add(str);
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder addEmailAddressBytes(ByteString byteString) {
                byteString.getClass();
                ensureEmailAddressIsMutable();
                this.emailAddress_.add(byteString);
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addTelephone(String str) {
                str.getClass();
                ensureTelephoneIsMutable();
                this.telephone_.add(str);
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder addTelephoneBytes(ByteString byteString) {
                byteString.getClass();
                ensureTelephoneIsMutable();
                this.telephone_.add(byteString);
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Contact build() {
                Contact contactBuildPartial = buildPartial();
                if (contactBuildPartial.isInitialized()) {
                    return contactBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) contactBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Contact buildPartial() {
                Contact contact = new Contact(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(contact);
                }
                onBuilt();
                return contact;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.name_ = "";
                this.telephone_ = LazyStringArrayList.emptyList();
                this.emailAddress_ = LazyStringArrayList.emptyList();
                return this;
            }

            public Builder clearEmailAddress() {
                this.emailAddress_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.id_ = Contact.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = Contact.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTelephone() {
                this.telephone_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -5;
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
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_Contact_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public String getEmailAddress(int i14) {
                return this.emailAddress_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public ByteString getEmailAddressBytes(int i14) {
                return this.emailAddress_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public int getEmailAddressCount() {
                return this.emailAddress_.size();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public ProtocolStringList getEmailAddressList() {
                this.emailAddress_.makeImmutable();
                return this.emailAddress_;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.id_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
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

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public String getTelephone(int i14) {
                return this.telephone_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public ByteString getTelephoneBytes(int i14) {
                return this.telephone_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public int getTelephoneCount() {
                return this.telephone_.size();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public ProtocolStringList getTelephoneList() {
                this.telephone_.makeImmutable();
                return this.telephone_;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_Contact_fieldAccessorTable.ensureFieldAccessorsInitialized(Contact.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId();
            }

            public Builder mergeFrom(Contact contact) {
                if (contact == Contact.getDefaultInstance()) {
                    return this;
                }
                if (contact.hasId()) {
                    this.id_ = contact.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (contact.hasName()) {
                    this.name_ = contact.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!contact.telephone_.isEmpty()) {
                    if (this.telephone_.isEmpty()) {
                        this.telephone_ = contact.telephone_;
                        this.bitField0_ |= 4;
                    } else {
                        ensureTelephoneIsMutable();
                        this.telephone_.addAll(contact.telephone_);
                    }
                    onChanged();
                }
                if (!contact.emailAddress_.isEmpty()) {
                    if (this.emailAddress_.isEmpty()) {
                        this.emailAddress_ = contact.emailAddress_;
                        this.bitField0_ |= 8;
                    } else {
                        ensureEmailAddressIsMutable();
                        this.emailAddress_.addAll(contact.emailAddress_);
                    }
                    onChanged();
                }
                mergeUnknownFields(contact.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEmailAddress(int i14, String str) {
                str.getClass();
                ensureEmailAddressIsMutable();
                this.emailAddress_.set(i14, str);
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.id_ = byteString;
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

            public Builder setTelephone(int i14, String str) {
                str.getClass();
                ensureTelephoneIsMutable();
                this.telephone_.set(i14, str);
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Contact getDefaultInstanceForType() {
                return Contact.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.name_ = "";
                this.telephone_ = LazyStringArrayList.emptyList();
                this.emailAddress_ = LazyStringArrayList.emptyList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Contact) {
                    return mergeFrom((Contact) message);
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
                                    this.id_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureTelephoneIsMutable();
                                    this.telephone_.add(bytes);
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ByteString bytes2 = codedInputStream.readBytes();
                                    ensureEmailAddressIsMutable();
                                    this.emailAddress_.add(bytes2);
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

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
        public ProtocolStringList getEmailAddressList() {
            return this.emailAddress_;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.ContactOrBuilder
        public ProtocolStringList getTelephoneList() {
            return this.telephone_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Contact getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Contact parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Contact) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Contact parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Contact parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Contact parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Contact parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Contact parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Contact parseFrom(InputStream inputStream) {
            return (Contact) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Contact parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Contact) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Contact parseFrom(CodedInputStream codedInputStream) {
            return (Contact) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Contact parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Contact) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Contact(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.name_ = "";
            this.telephone_ = LazyStringArrayList.emptyList();
            this.emailAddress_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ Contact(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class IncidentDetectedRequest extends GeneratedMessageV3 implements IncidentDetectedRequestOrBuilder {
        private static final IncidentDetectedRequest DEFAULT_INSTANCE = new IncidentDetectedRequest();

        @Deprecated
        public static final Parser<IncidentDetectedRequest> PARSER = new AbstractParser<IncidentDetectedRequest>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequest.1
            @Override // com.google.protobuf.Parser
            public IncidentDetectedRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = IncidentDetectedRequest.newBuilder();
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
        public static final int POSITION_FIELD_NUMBER = 1;
        public static final int SECONDS_TO_DELAY_BEFORE_NOTIFYING_CONTACT_PERSONS_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private GDIDataTypes.ScPoint position_;
        private int secondsToDelayBeforeNotifyingContactPersons_;
        private int type_;

        private IncidentDetectedRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.secondsToDelayBeforeNotifyingContactPersons_ = 0;
            this.type_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IncidentDetectedRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectedRequest_descriptor;
        }

        public static Builder newBuilder(IncidentDetectedRequest incidentDetectedRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(incidentDetectedRequest);
        }

        public static IncidentDetectedRequest parseDelimitedFrom(InputStream inputStream) {
            return (IncidentDetectedRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IncidentDetectedRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<IncidentDetectedRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IncidentDetectedRequest)) {
                return super.equals(obj);
            }
            IncidentDetectedRequest incidentDetectedRequest = (IncidentDetectedRequest) obj;
            if (hasPosition() != incidentDetectedRequest.hasPosition()) {
                return false;
            }
            if ((hasPosition() && !getPosition().equals(incidentDetectedRequest.getPosition())) || hasSecondsToDelayBeforeNotifyingContactPersons() != incidentDetectedRequest.hasSecondsToDelayBeforeNotifyingContactPersons()) {
                return false;
            }
            if ((!hasSecondsToDelayBeforeNotifyingContactPersons() || getSecondsToDelayBeforeNotifyingContactPersons() == incidentDetectedRequest.getSecondsToDelayBeforeNotifyingContactPersons()) && hasType() == incidentDetectedRequest.hasType()) {
                return (!hasType() || this.type_ == incidentDetectedRequest.type_) && getUnknownFields().equals(incidentDetectedRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<IncidentDetectedRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
        public GDIDataTypes.ScPoint getPosition() {
            GDIDataTypes.ScPoint scPoint = this.position_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
        public GDIDataTypes.ScPointOrBuilder getPositionOrBuilder() {
            GDIDataTypes.ScPoint scPoint = this.position_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
        public int getSecondsToDelayBeforeNotifyingContactPersons() {
            return this.secondsToDelayBeforeNotifyingContactPersons_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPosition()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.secondsToDelayBeforeNotifyingContactPersons_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(3, this.type_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
        public RequestType getType() {
            RequestType requestTypeForNumber = RequestType.forNumber(this.type_);
            return requestTypeForNumber == null ? RequestType.UNKNOWN : requestTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
        public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
        public boolean hasSecondsToDelayBeforeNotifyingContactPersons() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 4) != 0;
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
            if (hasSecondsToDelayBeforeNotifyingContactPersons()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSecondsToDelayBeforeNotifyingContactPersons();
            }
            if (hasType()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.type_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectedRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(IncidentDetectedRequest.class, Builder.class);
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
            if (!hasPosition()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSecondsToDelayBeforeNotifyingContactPersons()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getPosition().isInitialized()) {
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
            return new IncidentDetectedRequest();
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
                codedOutputStream.writeUInt32(2, this.secondsToDelayBeforeNotifyingContactPersons_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.type_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IncidentDetectedRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> positionBuilder_;
            private GDIDataTypes.ScPoint position_;
            private int secondsToDelayBeforeNotifyingContactPersons_;
            private int type_;

            private Builder() {
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(IncidentDetectedRequest incidentDetectedRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                    incidentDetectedRequest.position_ = singleFieldBuilderV3 == null ? this.position_ : (GDIDataTypes.ScPoint) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    incidentDetectedRequest.secondsToDelayBeforeNotifyingContactPersons_ = this.secondsToDelayBeforeNotifyingContactPersons_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    incidentDetectedRequest.type_ = this.type_;
                    i14 |= 4;
                }
                incidentDetectedRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectedRequest_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> getPositionFieldBuilder() {
                if (this.positionBuilder_ == null) {
                    this.positionBuilder_ = new SingleFieldBuilderV3<>(getPosition(), getParentForChildren(), isClean());
                    this.position_ = null;
                }
                return this.positionBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPositionFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IncidentDetectedRequest build() {
                IncidentDetectedRequest incidentDetectedRequestBuildPartial = buildPartial();
                if (incidentDetectedRequestBuildPartial.isInitialized()) {
                    return incidentDetectedRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) incidentDetectedRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IncidentDetectedRequest buildPartial() {
                IncidentDetectedRequest incidentDetectedRequest = new IncidentDetectedRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(incidentDetectedRequest);
                }
                onBuilt();
                return incidentDetectedRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.position_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                this.secondsToDelayBeforeNotifyingContactPersons_ = 0;
                this.type_ = 0;
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

            public Builder clearPosition() {
                this.bitField0_ &= -2;
                this.position_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSecondsToDelayBeforeNotifyingContactPersons() {
                this.bitField0_ &= -3;
                this.secondsToDelayBeforeNotifyingContactPersons_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -5;
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
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectedRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
            public GDIDataTypes.ScPoint getPosition() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPoint) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.ScPoint scPoint = this.position_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            public GDIDataTypes.ScPoint.Builder getPositionBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.ScPoint.Builder) getPositionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
            public GDIDataTypes.ScPointOrBuilder getPositionOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.ScPoint scPoint = this.position_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
            public int getSecondsToDelayBeforeNotifyingContactPersons() {
                return this.secondsToDelayBeforeNotifyingContactPersons_;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
            public RequestType getType() {
                RequestType requestTypeForNumber = RequestType.forNumber(this.type_);
                return requestTypeForNumber == null ? RequestType.UNKNOWN : requestTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
            public boolean hasPosition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
            public boolean hasSecondsToDelayBeforeNotifyingContactPersons() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequestOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectedRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(IncidentDetectedRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPosition() && hasSecondsToDelayBeforeNotifyingContactPersons() && getPosition().isInitialized();
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
                                } else if (tag == 16) {
                                    this.secondsToDelayBeforeNotifyingContactPersons_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (RequestType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.type_ = i14;
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

            public Builder mergePosition(GDIDataTypes.ScPoint scPoint) {
                GDIDataTypes.ScPoint scPoint2;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 1) == 0 || (scPoint2 = this.position_) == null || scPoint2 == GDIDataTypes.ScPoint.getDefaultInstance()) {
                    this.position_ = scPoint;
                } else {
                    getPositionBuilder().mergeFrom(scPoint);
                }
                if (this.position_ != null) {
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

            public Builder setPosition(GDIDataTypes.ScPoint.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
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

            public Builder setSecondsToDelayBeforeNotifyingContactPersons(int i14) {
                this.secondsToDelayBeforeNotifyingContactPersons_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setType(RequestType requestType) {
                requestType.getClass();
                this.bitField0_ |= 4;
                this.type_ = requestType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public IncidentDetectedRequest getDefaultInstanceForType() {
                return IncidentDetectedRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setPosition(GDIDataTypes.ScPoint scPoint) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
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

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof IncidentDetectedRequest) {
                    return mergeFrom((IncidentDetectedRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(IncidentDetectedRequest incidentDetectedRequest) {
                if (incidentDetectedRequest == IncidentDetectedRequest.getDefaultInstance()) {
                    return this;
                }
                if (incidentDetectedRequest.hasPosition()) {
                    mergePosition(incidentDetectedRequest.getPosition());
                }
                if (incidentDetectedRequest.hasSecondsToDelayBeforeNotifyingContactPersons()) {
                    setSecondsToDelayBeforeNotifyingContactPersons(incidentDetectedRequest.getSecondsToDelayBeforeNotifyingContactPersons());
                }
                if (incidentDetectedRequest.hasType()) {
                    setType(incidentDetectedRequest.getType());
                }
                mergeUnknownFields(incidentDetectedRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IncidentDetectedRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static IncidentDetectedRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentDetectedRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IncidentDetectedRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static IncidentDetectedRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IncidentDetectedRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ IncidentDetectedRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static IncidentDetectedRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private IncidentDetectedRequest() {
            this.secondsToDelayBeforeNotifyingContactPersons_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
        }

        public static IncidentDetectedRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static IncidentDetectedRequest parseFrom(InputStream inputStream) {
            return (IncidentDetectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static IncidentDetectedRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentDetectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IncidentDetectedRequest parseFrom(CodedInputStream codedInputStream) {
            return (IncidentDetectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static IncidentDetectedRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentDetectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum RequestType implements ProtocolMessageEnum {
            UNKNOWN(0),
            CYCLING_INCIDENT(1),
            ASSISTANCE_NEEDED(2);

            public static final int ASSISTANCE_NEEDED_VALUE = 2;
            public static final int CYCLING_INCIDENT_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<RequestType> internalValueMap = new Internal.EnumLiteMap<RequestType>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedRequest.RequestType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RequestType findValueByNumber(int i14) {
                    return RequestType.forNumber(i14);
                }
            };
            private static final RequestType[] VALUES = values();

            RequestType(int i14) {
                this.value = i14;
            }

            public static RequestType forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return CYCLING_INCIDENT;
                }
                if (i14 != 2) {
                    return null;
                }
                return ASSISTANCE_NEEDED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return IncidentDetectedRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<RequestType> internalGetValueMap() {
                return internalValueMap;
            }

            public static RequestType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static RequestType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class IncidentDetectedResponse extends GeneratedMessageV3 implements IncidentDetectedResponseOrBuilder {
        private static final IncidentDetectedResponse DEFAULT_INSTANCE = new IncidentDetectedResponse();

        @Deprecated
        public static final Parser<IncidentDetectedResponse> PARSER = new AbstractParser<IncidentDetectedResponse>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedResponse.1
            @Override // com.google.protobuf.Parser
            public IncidentDetectedResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = IncidentDetectedResponse.newBuilder();
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

        private IncidentDetectedResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IncidentDetectedResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectedResponse_descriptor;
        }

        public static Builder newBuilder(IncidentDetectedResponse incidentDetectedResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(incidentDetectedResponse);
        }

        public static IncidentDetectedResponse parseDelimitedFrom(InputStream inputStream) {
            return (IncidentDetectedResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IncidentDetectedResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<IncidentDetectedResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IncidentDetectedResponse)) {
                return super.equals(obj);
            }
            IncidentDetectedResponse incidentDetectedResponse = (IncidentDetectedResponse) obj;
            if (hasStatus() != incidentDetectedResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == incidentDetectedResponse.status_) && getUnknownFields().equals(incidentDetectedResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<IncidentDetectedResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedResponseOrBuilder
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
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectedResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(IncidentDetectedResponse.class, Builder.class);
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
            if (hasStatus()) {
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
            return new IncidentDetectedResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IncidentDetectedResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(IncidentDetectedResponse incidentDetectedResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    incidentDetectedResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                incidentDetectedResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectedResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IncidentDetectedResponse build() {
                IncidentDetectedResponse incidentDetectedResponseBuildPartial = buildPartial();
                if (incidentDetectedResponseBuildPartial.isInitialized()) {
                    return incidentDetectedResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) incidentDetectedResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IncidentDetectedResponse buildPartial() {
                IncidentDetectedResponse incidentDetectedResponse = new IncidentDetectedResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(incidentDetectedResponse);
                }
                onBuilt();
                return incidentDetectedResponse;
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
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectedResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectedResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(IncidentDetectedResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus();
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
                                    if (ResponseStatus.forNumber(i14) == null) {
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

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public IncidentDetectedResponse getDefaultInstanceForType() {
                return IncidentDetectedResponse.getDefaultInstance();
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
                if (message instanceof IncidentDetectedResponse) {
                    return mergeFrom((IncidentDetectedResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(IncidentDetectedResponse incidentDetectedResponse) {
                if (incidentDetectedResponse == IncidentDetectedResponse.getDefaultInstance()) {
                    return this;
                }
                if (incidentDetectedResponse.hasStatus()) {
                    setStatus(incidentDetectedResponse.getStatus());
                }
                mergeUnknownFields(incidentDetectedResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IncidentDetectedResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static IncidentDetectedResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentDetectedResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IncidentDetectedResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ IncidentDetectedResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static IncidentDetectedResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private IncidentDetectedResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IncidentDetectedResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static IncidentDetectedResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static IncidentDetectedResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static IncidentDetectedResponse parseFrom(InputStream inputStream) {
            return (IncidentDetectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static IncidentDetectedResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentDetectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IncidentDetectedResponse parseFrom(CodedInputStream codedInputStream) {
            return (IncidentDetectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static IncidentDetectedResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentDetectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            TIMER_STARTED(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int TIMER_STARTED_VALUE = 100;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectedResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 100) {
                    return TIMER_STARTED;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return IncidentDetectedResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class IncidentDetectionService extends GeneratedMessageV3 implements IncidentDetectionServiceOrBuilder {
        public static final int CANCEL_INCIDENT_REQUEST_FIELD_NUMBER = 7;
        public static final int CANCEL_INCIDENT_RESPONSE_FIELD_NUMBER = 8;
        public static final int INCIDENT_DETECTED_REQUEST_FIELD_NUMBER = 5;
        public static final int INCIDENT_DETECTED_RESPONSE_FIELD_NUMBER = 6;
        public static final int INCIDENT_STATUS_NOTIFICATION_FIELD_NUMBER = 9;
        public static final int INCIDENT_VIDEO_NOTIFICATION_FIELD_NUMBER = 10;
        public static final int UPDATE_DEVICE_OWNER_REQUEST_FIELD_NUMBER = 1;
        public static final int UPDATE_DEVICE_OWNER_RESPONSE_FIELD_NUMBER = 2;
        public static final int UPDATE_INCIDENT_CONTACTS_REQUEST_FIELD_NUMBER = 3;
        public static final int UPDATE_INCIDENT_CONTACTS_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CancelIncidentRequest cancelIncidentRequest_;
        private CancelIncidentResponse cancelIncidentResponse_;
        private IncidentDetectedRequest incidentDetectedRequest_;
        private IncidentDetectedResponse incidentDetectedResponse_;
        private IncidentStatusNotification incidentStatusNotification_;
        private IncidentVideoNotification incidentVideoNotification_;
        private byte memoizedIsInitialized;
        private UpdateDeviceOwnerRequest updateDeviceOwnerRequest_;
        private UpdateDeviceOwnerResponse updateDeviceOwnerResponse_;
        private UpdateIncidentContactsRequest updateIncidentContactsRequest_;
        private UpdateIncidentContactsResponse updateIncidentContactsResponse_;
        private static final IncidentDetectionService DEFAULT_INSTANCE = new IncidentDetectionService();

        @Deprecated
        public static final Parser<IncidentDetectionService> PARSER = new AbstractParser<IncidentDetectionService>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionService.1
            @Override // com.google.protobuf.Parser
            public IncidentDetectionService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = IncidentDetectionService.newBuilder();
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

        private IncidentDetectionService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IncidentDetectionService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectionService_descriptor;
        }

        public static Builder newBuilder(IncidentDetectionService incidentDetectionService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(incidentDetectionService);
        }

        public static IncidentDetectionService parseDelimitedFrom(InputStream inputStream) {
            return (IncidentDetectionService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IncidentDetectionService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<IncidentDetectionService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IncidentDetectionService)) {
                return super.equals(obj);
            }
            IncidentDetectionService incidentDetectionService = (IncidentDetectionService) obj;
            if (hasUpdateDeviceOwnerRequest() != incidentDetectionService.hasUpdateDeviceOwnerRequest()) {
                return false;
            }
            if ((hasUpdateDeviceOwnerRequest() && !getUpdateDeviceOwnerRequest().equals(incidentDetectionService.getUpdateDeviceOwnerRequest())) || hasUpdateDeviceOwnerResponse() != incidentDetectionService.hasUpdateDeviceOwnerResponse()) {
                return false;
            }
            if ((hasUpdateDeviceOwnerResponse() && !getUpdateDeviceOwnerResponse().equals(incidentDetectionService.getUpdateDeviceOwnerResponse())) || hasUpdateIncidentContactsRequest() != incidentDetectionService.hasUpdateIncidentContactsRequest()) {
                return false;
            }
            if ((hasUpdateIncidentContactsRequest() && !getUpdateIncidentContactsRequest().equals(incidentDetectionService.getUpdateIncidentContactsRequest())) || hasUpdateIncidentContactsResponse() != incidentDetectionService.hasUpdateIncidentContactsResponse()) {
                return false;
            }
            if ((hasUpdateIncidentContactsResponse() && !getUpdateIncidentContactsResponse().equals(incidentDetectionService.getUpdateIncidentContactsResponse())) || hasIncidentDetectedRequest() != incidentDetectionService.hasIncidentDetectedRequest()) {
                return false;
            }
            if ((hasIncidentDetectedRequest() && !getIncidentDetectedRequest().equals(incidentDetectionService.getIncidentDetectedRequest())) || hasIncidentDetectedResponse() != incidentDetectionService.hasIncidentDetectedResponse()) {
                return false;
            }
            if ((hasIncidentDetectedResponse() && !getIncidentDetectedResponse().equals(incidentDetectionService.getIncidentDetectedResponse())) || hasCancelIncidentRequest() != incidentDetectionService.hasCancelIncidentRequest()) {
                return false;
            }
            if ((hasCancelIncidentRequest() && !getCancelIncidentRequest().equals(incidentDetectionService.getCancelIncidentRequest())) || hasCancelIncidentResponse() != incidentDetectionService.hasCancelIncidentResponse()) {
                return false;
            }
            if ((hasCancelIncidentResponse() && !getCancelIncidentResponse().equals(incidentDetectionService.getCancelIncidentResponse())) || hasIncidentStatusNotification() != incidentDetectionService.hasIncidentStatusNotification()) {
                return false;
            }
            if ((!hasIncidentStatusNotification() || getIncidentStatusNotification().equals(incidentDetectionService.getIncidentStatusNotification())) && hasIncidentVideoNotification() == incidentDetectionService.hasIncidentVideoNotification()) {
                return (!hasIncidentVideoNotification() || getIncidentVideoNotification().equals(incidentDetectionService.getIncidentVideoNotification())) && getUnknownFields().equals(incidentDetectionService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public CancelIncidentRequest getCancelIncidentRequest() {
            CancelIncidentRequest cancelIncidentRequest = this.cancelIncidentRequest_;
            return cancelIncidentRequest == null ? CancelIncidentRequest.getDefaultInstance() : cancelIncidentRequest;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public CancelIncidentRequestOrBuilder getCancelIncidentRequestOrBuilder() {
            CancelIncidentRequest cancelIncidentRequest = this.cancelIncidentRequest_;
            return cancelIncidentRequest == null ? CancelIncidentRequest.getDefaultInstance() : cancelIncidentRequest;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public CancelIncidentResponse getCancelIncidentResponse() {
            CancelIncidentResponse cancelIncidentResponse = this.cancelIncidentResponse_;
            return cancelIncidentResponse == null ? CancelIncidentResponse.getDefaultInstance() : cancelIncidentResponse;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public CancelIncidentResponseOrBuilder getCancelIncidentResponseOrBuilder() {
            CancelIncidentResponse cancelIncidentResponse = this.cancelIncidentResponse_;
            return cancelIncidentResponse == null ? CancelIncidentResponse.getDefaultInstance() : cancelIncidentResponse;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public IncidentDetectedRequest getIncidentDetectedRequest() {
            IncidentDetectedRequest incidentDetectedRequest = this.incidentDetectedRequest_;
            return incidentDetectedRequest == null ? IncidentDetectedRequest.getDefaultInstance() : incidentDetectedRequest;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public IncidentDetectedRequestOrBuilder getIncidentDetectedRequestOrBuilder() {
            IncidentDetectedRequest incidentDetectedRequest = this.incidentDetectedRequest_;
            return incidentDetectedRequest == null ? IncidentDetectedRequest.getDefaultInstance() : incidentDetectedRequest;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public IncidentDetectedResponse getIncidentDetectedResponse() {
            IncidentDetectedResponse incidentDetectedResponse = this.incidentDetectedResponse_;
            return incidentDetectedResponse == null ? IncidentDetectedResponse.getDefaultInstance() : incidentDetectedResponse;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public IncidentDetectedResponseOrBuilder getIncidentDetectedResponseOrBuilder() {
            IncidentDetectedResponse incidentDetectedResponse = this.incidentDetectedResponse_;
            return incidentDetectedResponse == null ? IncidentDetectedResponse.getDefaultInstance() : incidentDetectedResponse;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public IncidentStatusNotification getIncidentStatusNotification() {
            IncidentStatusNotification incidentStatusNotification = this.incidentStatusNotification_;
            return incidentStatusNotification == null ? IncidentStatusNotification.getDefaultInstance() : incidentStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public IncidentStatusNotificationOrBuilder getIncidentStatusNotificationOrBuilder() {
            IncidentStatusNotification incidentStatusNotification = this.incidentStatusNotification_;
            return incidentStatusNotification == null ? IncidentStatusNotification.getDefaultInstance() : incidentStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public IncidentVideoNotification getIncidentVideoNotification() {
            IncidentVideoNotification incidentVideoNotification = this.incidentVideoNotification_;
            return incidentVideoNotification == null ? IncidentVideoNotification.getDefaultInstance() : incidentVideoNotification;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public IncidentVideoNotificationOrBuilder getIncidentVideoNotificationOrBuilder() {
            IncidentVideoNotification incidentVideoNotification = this.incidentVideoNotification_;
            return incidentVideoNotification == null ? IncidentVideoNotification.getDefaultInstance() : incidentVideoNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<IncidentDetectionService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUpdateDeviceOwnerRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getUpdateDeviceOwnerResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getUpdateIncidentContactsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getUpdateIncidentContactsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getIncidentDetectedRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getIncidentDetectedResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getCancelIncidentRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getCancelIncidentResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getIncidentStatusNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getIncidentVideoNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public UpdateDeviceOwnerRequest getUpdateDeviceOwnerRequest() {
            UpdateDeviceOwnerRequest updateDeviceOwnerRequest = this.updateDeviceOwnerRequest_;
            return updateDeviceOwnerRequest == null ? UpdateDeviceOwnerRequest.getDefaultInstance() : updateDeviceOwnerRequest;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public UpdateDeviceOwnerRequestOrBuilder getUpdateDeviceOwnerRequestOrBuilder() {
            UpdateDeviceOwnerRequest updateDeviceOwnerRequest = this.updateDeviceOwnerRequest_;
            return updateDeviceOwnerRequest == null ? UpdateDeviceOwnerRequest.getDefaultInstance() : updateDeviceOwnerRequest;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public UpdateDeviceOwnerResponse getUpdateDeviceOwnerResponse() {
            UpdateDeviceOwnerResponse updateDeviceOwnerResponse = this.updateDeviceOwnerResponse_;
            return updateDeviceOwnerResponse == null ? UpdateDeviceOwnerResponse.getDefaultInstance() : updateDeviceOwnerResponse;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public UpdateDeviceOwnerResponseOrBuilder getUpdateDeviceOwnerResponseOrBuilder() {
            UpdateDeviceOwnerResponse updateDeviceOwnerResponse = this.updateDeviceOwnerResponse_;
            return updateDeviceOwnerResponse == null ? UpdateDeviceOwnerResponse.getDefaultInstance() : updateDeviceOwnerResponse;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public UpdateIncidentContactsRequest getUpdateIncidentContactsRequest() {
            UpdateIncidentContactsRequest updateIncidentContactsRequest = this.updateIncidentContactsRequest_;
            return updateIncidentContactsRequest == null ? UpdateIncidentContactsRequest.getDefaultInstance() : updateIncidentContactsRequest;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public UpdateIncidentContactsRequestOrBuilder getUpdateIncidentContactsRequestOrBuilder() {
            UpdateIncidentContactsRequest updateIncidentContactsRequest = this.updateIncidentContactsRequest_;
            return updateIncidentContactsRequest == null ? UpdateIncidentContactsRequest.getDefaultInstance() : updateIncidentContactsRequest;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public UpdateIncidentContactsResponse getUpdateIncidentContactsResponse() {
            UpdateIncidentContactsResponse updateIncidentContactsResponse = this.updateIncidentContactsResponse_;
            return updateIncidentContactsResponse == null ? UpdateIncidentContactsResponse.getDefaultInstance() : updateIncidentContactsResponse;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public UpdateIncidentContactsResponseOrBuilder getUpdateIncidentContactsResponseOrBuilder() {
            UpdateIncidentContactsResponse updateIncidentContactsResponse = this.updateIncidentContactsResponse_;
            return updateIncidentContactsResponse == null ? UpdateIncidentContactsResponse.getDefaultInstance() : updateIncidentContactsResponse;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public boolean hasCancelIncidentRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public boolean hasCancelIncidentResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public boolean hasIncidentDetectedRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public boolean hasIncidentDetectedResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public boolean hasIncidentStatusNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public boolean hasIncidentVideoNotification() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public boolean hasUpdateDeviceOwnerRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public boolean hasUpdateDeviceOwnerResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public boolean hasUpdateIncidentContactsRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
        public boolean hasUpdateIncidentContactsResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUpdateDeviceOwnerRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUpdateDeviceOwnerRequest().hashCode();
            }
            if (hasUpdateDeviceOwnerResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getUpdateDeviceOwnerResponse().hashCode();
            }
            if (hasUpdateIncidentContactsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getUpdateIncidentContactsRequest().hashCode();
            }
            if (hasUpdateIncidentContactsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getUpdateIncidentContactsResponse().hashCode();
            }
            if (hasIncidentDetectedRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getIncidentDetectedRequest().hashCode();
            }
            if (hasIncidentDetectedResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getIncidentDetectedResponse().hashCode();
            }
            if (hasCancelIncidentRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getCancelIncidentRequest().hashCode();
            }
            if (hasCancelIncidentResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getCancelIncidentResponse().hashCode();
            }
            if (hasIncidentStatusNotification()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getIncidentStatusNotification().hashCode();
            }
            if (hasIncidentVideoNotification()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getIncidentVideoNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectionService_fieldAccessorTable.ensureFieldAccessorsInitialized(IncidentDetectionService.class, Builder.class);
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
            if (hasUpdateDeviceOwnerResponse() && !getUpdateDeviceOwnerResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUpdateIncidentContactsRequest() && !getUpdateIncidentContactsRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUpdateIncidentContactsResponse() && !getUpdateIncidentContactsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasIncidentDetectedRequest() && !getIncidentDetectedRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasIncidentDetectedResponse() && !getIncidentDetectedResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCancelIncidentResponse() && !getCancelIncidentResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasIncidentStatusNotification() || getIncidentStatusNotification().isInitialized()) {
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
            return new IncidentDetectionService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUpdateDeviceOwnerRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getUpdateDeviceOwnerResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getUpdateIncidentContactsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getUpdateIncidentContactsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getIncidentDetectedRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getIncidentDetectedResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getCancelIncidentRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getCancelIncidentResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getIncidentStatusNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getIncidentVideoNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IncidentDetectionServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CancelIncidentRequest, CancelIncidentRequest.Builder, CancelIncidentRequestOrBuilder> cancelIncidentRequestBuilder_;
            private CancelIncidentRequest cancelIncidentRequest_;
            private SingleFieldBuilderV3<CancelIncidentResponse, CancelIncidentResponse.Builder, CancelIncidentResponseOrBuilder> cancelIncidentResponseBuilder_;
            private CancelIncidentResponse cancelIncidentResponse_;
            private SingleFieldBuilderV3<IncidentDetectedRequest, IncidentDetectedRequest.Builder, IncidentDetectedRequestOrBuilder> incidentDetectedRequestBuilder_;
            private IncidentDetectedRequest incidentDetectedRequest_;
            private SingleFieldBuilderV3<IncidentDetectedResponse, IncidentDetectedResponse.Builder, IncidentDetectedResponseOrBuilder> incidentDetectedResponseBuilder_;
            private IncidentDetectedResponse incidentDetectedResponse_;
            private SingleFieldBuilderV3<IncidentStatusNotification, IncidentStatusNotification.Builder, IncidentStatusNotificationOrBuilder> incidentStatusNotificationBuilder_;
            private IncidentStatusNotification incidentStatusNotification_;
            private SingleFieldBuilderV3<IncidentVideoNotification, IncidentVideoNotification.Builder, IncidentVideoNotificationOrBuilder> incidentVideoNotificationBuilder_;
            private IncidentVideoNotification incidentVideoNotification_;
            private SingleFieldBuilderV3<UpdateDeviceOwnerRequest, UpdateDeviceOwnerRequest.Builder, UpdateDeviceOwnerRequestOrBuilder> updateDeviceOwnerRequestBuilder_;
            private UpdateDeviceOwnerRequest updateDeviceOwnerRequest_;
            private SingleFieldBuilderV3<UpdateDeviceOwnerResponse, UpdateDeviceOwnerResponse.Builder, UpdateDeviceOwnerResponseOrBuilder> updateDeviceOwnerResponseBuilder_;
            private UpdateDeviceOwnerResponse updateDeviceOwnerResponse_;
            private SingleFieldBuilderV3<UpdateIncidentContactsRequest, UpdateIncidentContactsRequest.Builder, UpdateIncidentContactsRequestOrBuilder> updateIncidentContactsRequestBuilder_;
            private UpdateIncidentContactsRequest updateIncidentContactsRequest_;
            private SingleFieldBuilderV3<UpdateIncidentContactsResponse, UpdateIncidentContactsResponse.Builder, UpdateIncidentContactsResponseOrBuilder> updateIncidentContactsResponseBuilder_;
            private UpdateIncidentContactsResponse updateIncidentContactsResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(IncidentDetectionService incidentDetectionService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<UpdateDeviceOwnerRequest, UpdateDeviceOwnerRequest.Builder, UpdateDeviceOwnerRequestOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerRequestBuilder_;
                    incidentDetectionService.updateDeviceOwnerRequest_ = singleFieldBuilderV3 == null ? this.updateDeviceOwnerRequest_ : (UpdateDeviceOwnerRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<UpdateDeviceOwnerResponse, UpdateDeviceOwnerResponse.Builder, UpdateDeviceOwnerResponseOrBuilder> singleFieldBuilderV4 = this.updateDeviceOwnerResponseBuilder_;
                    incidentDetectionService.updateDeviceOwnerResponse_ = singleFieldBuilderV4 == null ? this.updateDeviceOwnerResponse_ : (UpdateDeviceOwnerResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<UpdateIncidentContactsRequest, UpdateIncidentContactsRequest.Builder, UpdateIncidentContactsRequestOrBuilder> singleFieldBuilderV5 = this.updateIncidentContactsRequestBuilder_;
                    incidentDetectionService.updateIncidentContactsRequest_ = singleFieldBuilderV5 == null ? this.updateIncidentContactsRequest_ : (UpdateIncidentContactsRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<UpdateIncidentContactsResponse, UpdateIncidentContactsResponse.Builder, UpdateIncidentContactsResponseOrBuilder> singleFieldBuilderV6 = this.updateIncidentContactsResponseBuilder_;
                    incidentDetectionService.updateIncidentContactsResponse_ = singleFieldBuilderV6 == null ? this.updateIncidentContactsResponse_ : (UpdateIncidentContactsResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<IncidentDetectedRequest, IncidentDetectedRequest.Builder, IncidentDetectedRequestOrBuilder> singleFieldBuilderV7 = this.incidentDetectedRequestBuilder_;
                    incidentDetectionService.incidentDetectedRequest_ = singleFieldBuilderV7 == null ? this.incidentDetectedRequest_ : (IncidentDetectedRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<IncidentDetectedResponse, IncidentDetectedResponse.Builder, IncidentDetectedResponseOrBuilder> singleFieldBuilderV8 = this.incidentDetectedResponseBuilder_;
                    incidentDetectionService.incidentDetectedResponse_ = singleFieldBuilderV8 == null ? this.incidentDetectedResponse_ : (IncidentDetectedResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<CancelIncidentRequest, CancelIncidentRequest.Builder, CancelIncidentRequestOrBuilder> singleFieldBuilderV9 = this.cancelIncidentRequestBuilder_;
                    incidentDetectionService.cancelIncidentRequest_ = singleFieldBuilderV9 == null ? this.cancelIncidentRequest_ : (CancelIncidentRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<CancelIncidentResponse, CancelIncidentResponse.Builder, CancelIncidentResponseOrBuilder> singleFieldBuilderV10 = this.cancelIncidentResponseBuilder_;
                    incidentDetectionService.cancelIncidentResponse_ = singleFieldBuilderV10 == null ? this.cancelIncidentResponse_ : (CancelIncidentResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<IncidentStatusNotification, IncidentStatusNotification.Builder, IncidentStatusNotificationOrBuilder> singleFieldBuilderV11 = this.incidentStatusNotificationBuilder_;
                    incidentDetectionService.incidentStatusNotification_ = singleFieldBuilderV11 == null ? this.incidentStatusNotification_ : (IncidentStatusNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<IncidentVideoNotification, IncidentVideoNotification.Builder, IncidentVideoNotificationOrBuilder> singleFieldBuilderV12 = this.incidentVideoNotificationBuilder_;
                    incidentDetectionService.incidentVideoNotification_ = singleFieldBuilderV12 == null ? this.incidentVideoNotification_ : (IncidentVideoNotification) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                incidentDetectionService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CancelIncidentRequest, CancelIncidentRequest.Builder, CancelIncidentRequestOrBuilder> getCancelIncidentRequestFieldBuilder() {
                if (this.cancelIncidentRequestBuilder_ == null) {
                    this.cancelIncidentRequestBuilder_ = new SingleFieldBuilderV3<>(getCancelIncidentRequest(), getParentForChildren(), isClean());
                    this.cancelIncidentRequest_ = null;
                }
                return this.cancelIncidentRequestBuilder_;
            }

            private SingleFieldBuilderV3<CancelIncidentResponse, CancelIncidentResponse.Builder, CancelIncidentResponseOrBuilder> getCancelIncidentResponseFieldBuilder() {
                if (this.cancelIncidentResponseBuilder_ == null) {
                    this.cancelIncidentResponseBuilder_ = new SingleFieldBuilderV3<>(getCancelIncidentResponse(), getParentForChildren(), isClean());
                    this.cancelIncidentResponse_ = null;
                }
                return this.cancelIncidentResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectionService_descriptor;
            }

            private SingleFieldBuilderV3<IncidentDetectedRequest, IncidentDetectedRequest.Builder, IncidentDetectedRequestOrBuilder> getIncidentDetectedRequestFieldBuilder() {
                if (this.incidentDetectedRequestBuilder_ == null) {
                    this.incidentDetectedRequestBuilder_ = new SingleFieldBuilderV3<>(getIncidentDetectedRequest(), getParentForChildren(), isClean());
                    this.incidentDetectedRequest_ = null;
                }
                return this.incidentDetectedRequestBuilder_;
            }

            private SingleFieldBuilderV3<IncidentDetectedResponse, IncidentDetectedResponse.Builder, IncidentDetectedResponseOrBuilder> getIncidentDetectedResponseFieldBuilder() {
                if (this.incidentDetectedResponseBuilder_ == null) {
                    this.incidentDetectedResponseBuilder_ = new SingleFieldBuilderV3<>(getIncidentDetectedResponse(), getParentForChildren(), isClean());
                    this.incidentDetectedResponse_ = null;
                }
                return this.incidentDetectedResponseBuilder_;
            }

            private SingleFieldBuilderV3<IncidentStatusNotification, IncidentStatusNotification.Builder, IncidentStatusNotificationOrBuilder> getIncidentStatusNotificationFieldBuilder() {
                if (this.incidentStatusNotificationBuilder_ == null) {
                    this.incidentStatusNotificationBuilder_ = new SingleFieldBuilderV3<>(getIncidentStatusNotification(), getParentForChildren(), isClean());
                    this.incidentStatusNotification_ = null;
                }
                return this.incidentStatusNotificationBuilder_;
            }

            private SingleFieldBuilderV3<IncidentVideoNotification, IncidentVideoNotification.Builder, IncidentVideoNotificationOrBuilder> getIncidentVideoNotificationFieldBuilder() {
                if (this.incidentVideoNotificationBuilder_ == null) {
                    this.incidentVideoNotificationBuilder_ = new SingleFieldBuilderV3<>(getIncidentVideoNotification(), getParentForChildren(), isClean());
                    this.incidentVideoNotification_ = null;
                }
                return this.incidentVideoNotificationBuilder_;
            }

            private SingleFieldBuilderV3<UpdateDeviceOwnerRequest, UpdateDeviceOwnerRequest.Builder, UpdateDeviceOwnerRequestOrBuilder> getUpdateDeviceOwnerRequestFieldBuilder() {
                if (this.updateDeviceOwnerRequestBuilder_ == null) {
                    this.updateDeviceOwnerRequestBuilder_ = new SingleFieldBuilderV3<>(getUpdateDeviceOwnerRequest(), getParentForChildren(), isClean());
                    this.updateDeviceOwnerRequest_ = null;
                }
                return this.updateDeviceOwnerRequestBuilder_;
            }

            private SingleFieldBuilderV3<UpdateDeviceOwnerResponse, UpdateDeviceOwnerResponse.Builder, UpdateDeviceOwnerResponseOrBuilder> getUpdateDeviceOwnerResponseFieldBuilder() {
                if (this.updateDeviceOwnerResponseBuilder_ == null) {
                    this.updateDeviceOwnerResponseBuilder_ = new SingleFieldBuilderV3<>(getUpdateDeviceOwnerResponse(), getParentForChildren(), isClean());
                    this.updateDeviceOwnerResponse_ = null;
                }
                return this.updateDeviceOwnerResponseBuilder_;
            }

            private SingleFieldBuilderV3<UpdateIncidentContactsRequest, UpdateIncidentContactsRequest.Builder, UpdateIncidentContactsRequestOrBuilder> getUpdateIncidentContactsRequestFieldBuilder() {
                if (this.updateIncidentContactsRequestBuilder_ == null) {
                    this.updateIncidentContactsRequestBuilder_ = new SingleFieldBuilderV3<>(getUpdateIncidentContactsRequest(), getParentForChildren(), isClean());
                    this.updateIncidentContactsRequest_ = null;
                }
                return this.updateIncidentContactsRequestBuilder_;
            }

            private SingleFieldBuilderV3<UpdateIncidentContactsResponse, UpdateIncidentContactsResponse.Builder, UpdateIncidentContactsResponseOrBuilder> getUpdateIncidentContactsResponseFieldBuilder() {
                if (this.updateIncidentContactsResponseBuilder_ == null) {
                    this.updateIncidentContactsResponseBuilder_ = new SingleFieldBuilderV3<>(getUpdateIncidentContactsResponse(), getParentForChildren(), isClean());
                    this.updateIncidentContactsResponse_ = null;
                }
                return this.updateIncidentContactsResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUpdateDeviceOwnerRequestFieldBuilder();
                    getUpdateDeviceOwnerResponseFieldBuilder();
                    getUpdateIncidentContactsRequestFieldBuilder();
                    getUpdateIncidentContactsResponseFieldBuilder();
                    getIncidentDetectedRequestFieldBuilder();
                    getIncidentDetectedResponseFieldBuilder();
                    getCancelIncidentRequestFieldBuilder();
                    getCancelIncidentResponseFieldBuilder();
                    getIncidentStatusNotificationFieldBuilder();
                    getIncidentVideoNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IncidentDetectionService build() {
                IncidentDetectionService incidentDetectionServiceBuildPartial = buildPartial();
                if (incidentDetectionServiceBuildPartial.isInitialized()) {
                    return incidentDetectionServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) incidentDetectionServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IncidentDetectionService buildPartial() {
                IncidentDetectionService incidentDetectionService = new IncidentDetectionService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(incidentDetectionService);
                }
                onBuilt();
                return incidentDetectionService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.updateDeviceOwnerRequest_ = null;
                SingleFieldBuilderV3<UpdateDeviceOwnerRequest, UpdateDeviceOwnerRequest.Builder, UpdateDeviceOwnerRequestOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateDeviceOwnerRequestBuilder_ = null;
                }
                this.updateDeviceOwnerResponse_ = null;
                SingleFieldBuilderV3<UpdateDeviceOwnerResponse, UpdateDeviceOwnerResponse.Builder, UpdateDeviceOwnerResponseOrBuilder> singleFieldBuilderV4 = this.updateDeviceOwnerResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.updateDeviceOwnerResponseBuilder_ = null;
                }
                this.updateIncidentContactsRequest_ = null;
                SingleFieldBuilderV3<UpdateIncidentContactsRequest, UpdateIncidentContactsRequest.Builder, UpdateIncidentContactsRequestOrBuilder> singleFieldBuilderV5 = this.updateIncidentContactsRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.updateIncidentContactsRequestBuilder_ = null;
                }
                this.updateIncidentContactsResponse_ = null;
                SingleFieldBuilderV3<UpdateIncidentContactsResponse, UpdateIncidentContactsResponse.Builder, UpdateIncidentContactsResponseOrBuilder> singleFieldBuilderV6 = this.updateIncidentContactsResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.updateIncidentContactsResponseBuilder_ = null;
                }
                this.incidentDetectedRequest_ = null;
                SingleFieldBuilderV3<IncidentDetectedRequest, IncidentDetectedRequest.Builder, IncidentDetectedRequestOrBuilder> singleFieldBuilderV7 = this.incidentDetectedRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.incidentDetectedRequestBuilder_ = null;
                }
                this.incidentDetectedResponse_ = null;
                SingleFieldBuilderV3<IncidentDetectedResponse, IncidentDetectedResponse.Builder, IncidentDetectedResponseOrBuilder> singleFieldBuilderV8 = this.incidentDetectedResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.incidentDetectedResponseBuilder_ = null;
                }
                this.cancelIncidentRequest_ = null;
                SingleFieldBuilderV3<CancelIncidentRequest, CancelIncidentRequest.Builder, CancelIncidentRequestOrBuilder> singleFieldBuilderV9 = this.cancelIncidentRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.cancelIncidentRequestBuilder_ = null;
                }
                this.cancelIncidentResponse_ = null;
                SingleFieldBuilderV3<CancelIncidentResponse, CancelIncidentResponse.Builder, CancelIncidentResponseOrBuilder> singleFieldBuilderV10 = this.cancelIncidentResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.cancelIncidentResponseBuilder_ = null;
                }
                this.incidentStatusNotification_ = null;
                SingleFieldBuilderV3<IncidentStatusNotification, IncidentStatusNotification.Builder, IncidentStatusNotificationOrBuilder> singleFieldBuilderV11 = this.incidentStatusNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.incidentStatusNotificationBuilder_ = null;
                }
                this.incidentVideoNotification_ = null;
                SingleFieldBuilderV3<IncidentVideoNotification, IncidentVideoNotification.Builder, IncidentVideoNotificationOrBuilder> singleFieldBuilderV12 = this.incidentVideoNotificationBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.incidentVideoNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearCancelIncidentRequest() {
                this.bitField0_ &= -65;
                this.cancelIncidentRequest_ = null;
                SingleFieldBuilderV3<CancelIncidentRequest, CancelIncidentRequest.Builder, CancelIncidentRequestOrBuilder> singleFieldBuilderV3 = this.cancelIncidentRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.cancelIncidentRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCancelIncidentResponse() {
                this.bitField0_ &= -129;
                this.cancelIncidentResponse_ = null;
                SingleFieldBuilderV3<CancelIncidentResponse, CancelIncidentResponse.Builder, CancelIncidentResponseOrBuilder> singleFieldBuilderV3 = this.cancelIncidentResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.cancelIncidentResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIncidentDetectedRequest() {
                this.bitField0_ &= -17;
                this.incidentDetectedRequest_ = null;
                SingleFieldBuilderV3<IncidentDetectedRequest, IncidentDetectedRequest.Builder, IncidentDetectedRequestOrBuilder> singleFieldBuilderV3 = this.incidentDetectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.incidentDetectedRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearIncidentDetectedResponse() {
                this.bitField0_ &= -33;
                this.incidentDetectedResponse_ = null;
                SingleFieldBuilderV3<IncidentDetectedResponse, IncidentDetectedResponse.Builder, IncidentDetectedResponseOrBuilder> singleFieldBuilderV3 = this.incidentDetectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.incidentDetectedResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearIncidentStatusNotification() {
                this.bitField0_ &= -257;
                this.incidentStatusNotification_ = null;
                SingleFieldBuilderV3<IncidentStatusNotification, IncidentStatusNotification.Builder, IncidentStatusNotificationOrBuilder> singleFieldBuilderV3 = this.incidentStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.incidentStatusNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearIncidentVideoNotification() {
                this.bitField0_ &= -513;
                this.incidentVideoNotification_ = null;
                SingleFieldBuilderV3<IncidentVideoNotification, IncidentVideoNotification.Builder, IncidentVideoNotificationOrBuilder> singleFieldBuilderV3 = this.incidentVideoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.incidentVideoNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearUpdateDeviceOwnerRequest() {
                this.bitField0_ &= -2;
                this.updateDeviceOwnerRequest_ = null;
                SingleFieldBuilderV3<UpdateDeviceOwnerRequest, UpdateDeviceOwnerRequest.Builder, UpdateDeviceOwnerRequestOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateDeviceOwnerRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateDeviceOwnerResponse() {
                this.bitField0_ &= -3;
                this.updateDeviceOwnerResponse_ = null;
                SingleFieldBuilderV3<UpdateDeviceOwnerResponse, UpdateDeviceOwnerResponse.Builder, UpdateDeviceOwnerResponseOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateDeviceOwnerResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateIncidentContactsRequest() {
                this.bitField0_ &= -5;
                this.updateIncidentContactsRequest_ = null;
                SingleFieldBuilderV3<UpdateIncidentContactsRequest, UpdateIncidentContactsRequest.Builder, UpdateIncidentContactsRequestOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateIncidentContactsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateIncidentContactsResponse() {
                this.bitField0_ &= -9;
                this.updateIncidentContactsResponse_ = null;
                SingleFieldBuilderV3<UpdateIncidentContactsResponse, UpdateIncidentContactsResponse.Builder, UpdateIncidentContactsResponseOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateIncidentContactsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public CancelIncidentRequest getCancelIncidentRequest() {
                SingleFieldBuilderV3<CancelIncidentRequest, CancelIncidentRequest.Builder, CancelIncidentRequestOrBuilder> singleFieldBuilderV3 = this.cancelIncidentRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelIncidentRequest) singleFieldBuilderV3.getMessage();
                }
                CancelIncidentRequest cancelIncidentRequest = this.cancelIncidentRequest_;
                return cancelIncidentRequest == null ? CancelIncidentRequest.getDefaultInstance() : cancelIncidentRequest;
            }

            public CancelIncidentRequest.Builder getCancelIncidentRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (CancelIncidentRequest.Builder) getCancelIncidentRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public CancelIncidentRequestOrBuilder getCancelIncidentRequestOrBuilder() {
                SingleFieldBuilderV3<CancelIncidentRequest, CancelIncidentRequest.Builder, CancelIncidentRequestOrBuilder> singleFieldBuilderV3 = this.cancelIncidentRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelIncidentRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CancelIncidentRequest cancelIncidentRequest = this.cancelIncidentRequest_;
                return cancelIncidentRequest == null ? CancelIncidentRequest.getDefaultInstance() : cancelIncidentRequest;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public CancelIncidentResponse getCancelIncidentResponse() {
                SingleFieldBuilderV3<CancelIncidentResponse, CancelIncidentResponse.Builder, CancelIncidentResponseOrBuilder> singleFieldBuilderV3 = this.cancelIncidentResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelIncidentResponse) singleFieldBuilderV3.getMessage();
                }
                CancelIncidentResponse cancelIncidentResponse = this.cancelIncidentResponse_;
                return cancelIncidentResponse == null ? CancelIncidentResponse.getDefaultInstance() : cancelIncidentResponse;
            }

            public CancelIncidentResponse.Builder getCancelIncidentResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (CancelIncidentResponse.Builder) getCancelIncidentResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public CancelIncidentResponseOrBuilder getCancelIncidentResponseOrBuilder() {
                SingleFieldBuilderV3<CancelIncidentResponse, CancelIncidentResponse.Builder, CancelIncidentResponseOrBuilder> singleFieldBuilderV3 = this.cancelIncidentResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelIncidentResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CancelIncidentResponse cancelIncidentResponse = this.cancelIncidentResponse_;
                return cancelIncidentResponse == null ? CancelIncidentResponse.getDefaultInstance() : cancelIncidentResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectionService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public IncidentDetectedRequest getIncidentDetectedRequest() {
                SingleFieldBuilderV3<IncidentDetectedRequest, IncidentDetectedRequest.Builder, IncidentDetectedRequestOrBuilder> singleFieldBuilderV3 = this.incidentDetectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IncidentDetectedRequest) singleFieldBuilderV3.getMessage();
                }
                IncidentDetectedRequest incidentDetectedRequest = this.incidentDetectedRequest_;
                return incidentDetectedRequest == null ? IncidentDetectedRequest.getDefaultInstance() : incidentDetectedRequest;
            }

            public IncidentDetectedRequest.Builder getIncidentDetectedRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (IncidentDetectedRequest.Builder) getIncidentDetectedRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public IncidentDetectedRequestOrBuilder getIncidentDetectedRequestOrBuilder() {
                SingleFieldBuilderV3<IncidentDetectedRequest, IncidentDetectedRequest.Builder, IncidentDetectedRequestOrBuilder> singleFieldBuilderV3 = this.incidentDetectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IncidentDetectedRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                IncidentDetectedRequest incidentDetectedRequest = this.incidentDetectedRequest_;
                return incidentDetectedRequest == null ? IncidentDetectedRequest.getDefaultInstance() : incidentDetectedRequest;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public IncidentDetectedResponse getIncidentDetectedResponse() {
                SingleFieldBuilderV3<IncidentDetectedResponse, IncidentDetectedResponse.Builder, IncidentDetectedResponseOrBuilder> singleFieldBuilderV3 = this.incidentDetectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IncidentDetectedResponse) singleFieldBuilderV3.getMessage();
                }
                IncidentDetectedResponse incidentDetectedResponse = this.incidentDetectedResponse_;
                return incidentDetectedResponse == null ? IncidentDetectedResponse.getDefaultInstance() : incidentDetectedResponse;
            }

            public IncidentDetectedResponse.Builder getIncidentDetectedResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (IncidentDetectedResponse.Builder) getIncidentDetectedResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public IncidentDetectedResponseOrBuilder getIncidentDetectedResponseOrBuilder() {
                SingleFieldBuilderV3<IncidentDetectedResponse, IncidentDetectedResponse.Builder, IncidentDetectedResponseOrBuilder> singleFieldBuilderV3 = this.incidentDetectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IncidentDetectedResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                IncidentDetectedResponse incidentDetectedResponse = this.incidentDetectedResponse_;
                return incidentDetectedResponse == null ? IncidentDetectedResponse.getDefaultInstance() : incidentDetectedResponse;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public IncidentStatusNotification getIncidentStatusNotification() {
                SingleFieldBuilderV3<IncidentStatusNotification, IncidentStatusNotification.Builder, IncidentStatusNotificationOrBuilder> singleFieldBuilderV3 = this.incidentStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IncidentStatusNotification) singleFieldBuilderV3.getMessage();
                }
                IncidentStatusNotification incidentStatusNotification = this.incidentStatusNotification_;
                return incidentStatusNotification == null ? IncidentStatusNotification.getDefaultInstance() : incidentStatusNotification;
            }

            public IncidentStatusNotification.Builder getIncidentStatusNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (IncidentStatusNotification.Builder) getIncidentStatusNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public IncidentStatusNotificationOrBuilder getIncidentStatusNotificationOrBuilder() {
                SingleFieldBuilderV3<IncidentStatusNotification, IncidentStatusNotification.Builder, IncidentStatusNotificationOrBuilder> singleFieldBuilderV3 = this.incidentStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IncidentStatusNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                IncidentStatusNotification incidentStatusNotification = this.incidentStatusNotification_;
                return incidentStatusNotification == null ? IncidentStatusNotification.getDefaultInstance() : incidentStatusNotification;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public IncidentVideoNotification getIncidentVideoNotification() {
                SingleFieldBuilderV3<IncidentVideoNotification, IncidentVideoNotification.Builder, IncidentVideoNotificationOrBuilder> singleFieldBuilderV3 = this.incidentVideoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IncidentVideoNotification) singleFieldBuilderV3.getMessage();
                }
                IncidentVideoNotification incidentVideoNotification = this.incidentVideoNotification_;
                return incidentVideoNotification == null ? IncidentVideoNotification.getDefaultInstance() : incidentVideoNotification;
            }

            public IncidentVideoNotification.Builder getIncidentVideoNotificationBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (IncidentVideoNotification.Builder) getIncidentVideoNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public IncidentVideoNotificationOrBuilder getIncidentVideoNotificationOrBuilder() {
                SingleFieldBuilderV3<IncidentVideoNotification, IncidentVideoNotification.Builder, IncidentVideoNotificationOrBuilder> singleFieldBuilderV3 = this.incidentVideoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IncidentVideoNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                IncidentVideoNotification incidentVideoNotification = this.incidentVideoNotification_;
                return incidentVideoNotification == null ? IncidentVideoNotification.getDefaultInstance() : incidentVideoNotification;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public UpdateDeviceOwnerRequest getUpdateDeviceOwnerRequest() {
                SingleFieldBuilderV3<UpdateDeviceOwnerRequest, UpdateDeviceOwnerRequest.Builder, UpdateDeviceOwnerRequestOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateDeviceOwnerRequest) singleFieldBuilderV3.getMessage();
                }
                UpdateDeviceOwnerRequest updateDeviceOwnerRequest = this.updateDeviceOwnerRequest_;
                return updateDeviceOwnerRequest == null ? UpdateDeviceOwnerRequest.getDefaultInstance() : updateDeviceOwnerRequest;
            }

            public UpdateDeviceOwnerRequest.Builder getUpdateDeviceOwnerRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (UpdateDeviceOwnerRequest.Builder) getUpdateDeviceOwnerRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public UpdateDeviceOwnerRequestOrBuilder getUpdateDeviceOwnerRequestOrBuilder() {
                SingleFieldBuilderV3<UpdateDeviceOwnerRequest, UpdateDeviceOwnerRequest.Builder, UpdateDeviceOwnerRequestOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateDeviceOwnerRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateDeviceOwnerRequest updateDeviceOwnerRequest = this.updateDeviceOwnerRequest_;
                return updateDeviceOwnerRequest == null ? UpdateDeviceOwnerRequest.getDefaultInstance() : updateDeviceOwnerRequest;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public UpdateDeviceOwnerResponse getUpdateDeviceOwnerResponse() {
                SingleFieldBuilderV3<UpdateDeviceOwnerResponse, UpdateDeviceOwnerResponse.Builder, UpdateDeviceOwnerResponseOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateDeviceOwnerResponse) singleFieldBuilderV3.getMessage();
                }
                UpdateDeviceOwnerResponse updateDeviceOwnerResponse = this.updateDeviceOwnerResponse_;
                return updateDeviceOwnerResponse == null ? UpdateDeviceOwnerResponse.getDefaultInstance() : updateDeviceOwnerResponse;
            }

            public UpdateDeviceOwnerResponse.Builder getUpdateDeviceOwnerResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (UpdateDeviceOwnerResponse.Builder) getUpdateDeviceOwnerResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public UpdateDeviceOwnerResponseOrBuilder getUpdateDeviceOwnerResponseOrBuilder() {
                SingleFieldBuilderV3<UpdateDeviceOwnerResponse, UpdateDeviceOwnerResponse.Builder, UpdateDeviceOwnerResponseOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateDeviceOwnerResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateDeviceOwnerResponse updateDeviceOwnerResponse = this.updateDeviceOwnerResponse_;
                return updateDeviceOwnerResponse == null ? UpdateDeviceOwnerResponse.getDefaultInstance() : updateDeviceOwnerResponse;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public UpdateIncidentContactsRequest getUpdateIncidentContactsRequest() {
                SingleFieldBuilderV3<UpdateIncidentContactsRequest, UpdateIncidentContactsRequest.Builder, UpdateIncidentContactsRequestOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateIncidentContactsRequest) singleFieldBuilderV3.getMessage();
                }
                UpdateIncidentContactsRequest updateIncidentContactsRequest = this.updateIncidentContactsRequest_;
                return updateIncidentContactsRequest == null ? UpdateIncidentContactsRequest.getDefaultInstance() : updateIncidentContactsRequest;
            }

            public UpdateIncidentContactsRequest.Builder getUpdateIncidentContactsRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (UpdateIncidentContactsRequest.Builder) getUpdateIncidentContactsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public UpdateIncidentContactsRequestOrBuilder getUpdateIncidentContactsRequestOrBuilder() {
                SingleFieldBuilderV3<UpdateIncidentContactsRequest, UpdateIncidentContactsRequest.Builder, UpdateIncidentContactsRequestOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateIncidentContactsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateIncidentContactsRequest updateIncidentContactsRequest = this.updateIncidentContactsRequest_;
                return updateIncidentContactsRequest == null ? UpdateIncidentContactsRequest.getDefaultInstance() : updateIncidentContactsRequest;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public UpdateIncidentContactsResponse getUpdateIncidentContactsResponse() {
                SingleFieldBuilderV3<UpdateIncidentContactsResponse, UpdateIncidentContactsResponse.Builder, UpdateIncidentContactsResponseOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateIncidentContactsResponse) singleFieldBuilderV3.getMessage();
                }
                UpdateIncidentContactsResponse updateIncidentContactsResponse = this.updateIncidentContactsResponse_;
                return updateIncidentContactsResponse == null ? UpdateIncidentContactsResponse.getDefaultInstance() : updateIncidentContactsResponse;
            }

            public UpdateIncidentContactsResponse.Builder getUpdateIncidentContactsResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (UpdateIncidentContactsResponse.Builder) getUpdateIncidentContactsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public UpdateIncidentContactsResponseOrBuilder getUpdateIncidentContactsResponseOrBuilder() {
                SingleFieldBuilderV3<UpdateIncidentContactsResponse, UpdateIncidentContactsResponse.Builder, UpdateIncidentContactsResponseOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateIncidentContactsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateIncidentContactsResponse updateIncidentContactsResponse = this.updateIncidentContactsResponse_;
                return updateIncidentContactsResponse == null ? UpdateIncidentContactsResponse.getDefaultInstance() : updateIncidentContactsResponse;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public boolean hasCancelIncidentRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public boolean hasCancelIncidentResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public boolean hasIncidentDetectedRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public boolean hasIncidentDetectedResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public boolean hasIncidentStatusNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public boolean hasIncidentVideoNotification() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public boolean hasUpdateDeviceOwnerRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public boolean hasUpdateDeviceOwnerResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public boolean hasUpdateIncidentContactsRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentDetectionServiceOrBuilder
            public boolean hasUpdateIncidentContactsResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentDetectionService_fieldAccessorTable.ensureFieldAccessorsInitialized(IncidentDetectionService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasUpdateDeviceOwnerResponse() && !getUpdateDeviceOwnerResponse().isInitialized()) {
                    return false;
                }
                if (hasUpdateIncidentContactsRequest() && !getUpdateIncidentContactsRequest().isInitialized()) {
                    return false;
                }
                if (hasUpdateIncidentContactsResponse() && !getUpdateIncidentContactsResponse().isInitialized()) {
                    return false;
                }
                if (hasIncidentDetectedRequest() && !getIncidentDetectedRequest().isInitialized()) {
                    return false;
                }
                if (hasIncidentDetectedResponse() && !getIncidentDetectedResponse().isInitialized()) {
                    return false;
                }
                if (!hasCancelIncidentResponse() || getCancelIncidentResponse().isInitialized()) {
                    return !hasIncidentStatusNotification() || getIncidentStatusNotification().isInitialized();
                }
                return false;
            }

            public Builder mergeCancelIncidentRequest(CancelIncidentRequest cancelIncidentRequest) {
                CancelIncidentRequest cancelIncidentRequest2;
                SingleFieldBuilderV3<CancelIncidentRequest, CancelIncidentRequest.Builder, CancelIncidentRequestOrBuilder> singleFieldBuilderV3 = this.cancelIncidentRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cancelIncidentRequest);
                } else if ((this.bitField0_ & 64) == 0 || (cancelIncidentRequest2 = this.cancelIncidentRequest_) == null || cancelIncidentRequest2 == CancelIncidentRequest.getDefaultInstance()) {
                    this.cancelIncidentRequest_ = cancelIncidentRequest;
                } else {
                    getCancelIncidentRequestBuilder().mergeFrom(cancelIncidentRequest);
                }
                if (this.cancelIncidentRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCancelIncidentResponse(CancelIncidentResponse cancelIncidentResponse) {
                CancelIncidentResponse cancelIncidentResponse2;
                SingleFieldBuilderV3<CancelIncidentResponse, CancelIncidentResponse.Builder, CancelIncidentResponseOrBuilder> singleFieldBuilderV3 = this.cancelIncidentResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cancelIncidentResponse);
                } else if ((this.bitField0_ & 128) == 0 || (cancelIncidentResponse2 = this.cancelIncidentResponse_) == null || cancelIncidentResponse2 == CancelIncidentResponse.getDefaultInstance()) {
                    this.cancelIncidentResponse_ = cancelIncidentResponse;
                } else {
                    getCancelIncidentResponseBuilder().mergeFrom(cancelIncidentResponse);
                }
                if (this.cancelIncidentResponse_ != null) {
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    codedInputStream.readMessage(getUpdateDeviceOwnerRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getUpdateDeviceOwnerResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getUpdateIncidentContactsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getUpdateIncidentContactsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getIncidentDetectedRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getIncidentDetectedResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getCancelIncidentRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getCancelIncidentResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getIncidentStatusNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getIncidentVideoNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
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

            public Builder mergeIncidentDetectedRequest(IncidentDetectedRequest incidentDetectedRequest) {
                IncidentDetectedRequest incidentDetectedRequest2;
                SingleFieldBuilderV3<IncidentDetectedRequest, IncidentDetectedRequest.Builder, IncidentDetectedRequestOrBuilder> singleFieldBuilderV3 = this.incidentDetectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(incidentDetectedRequest);
                } else if ((this.bitField0_ & 16) == 0 || (incidentDetectedRequest2 = this.incidentDetectedRequest_) == null || incidentDetectedRequest2 == IncidentDetectedRequest.getDefaultInstance()) {
                    this.incidentDetectedRequest_ = incidentDetectedRequest;
                } else {
                    getIncidentDetectedRequestBuilder().mergeFrom(incidentDetectedRequest);
                }
                if (this.incidentDetectedRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeIncidentDetectedResponse(IncidentDetectedResponse incidentDetectedResponse) {
                IncidentDetectedResponse incidentDetectedResponse2;
                SingleFieldBuilderV3<IncidentDetectedResponse, IncidentDetectedResponse.Builder, IncidentDetectedResponseOrBuilder> singleFieldBuilderV3 = this.incidentDetectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(incidentDetectedResponse);
                } else if ((this.bitField0_ & 32) == 0 || (incidentDetectedResponse2 = this.incidentDetectedResponse_) == null || incidentDetectedResponse2 == IncidentDetectedResponse.getDefaultInstance()) {
                    this.incidentDetectedResponse_ = incidentDetectedResponse;
                } else {
                    getIncidentDetectedResponseBuilder().mergeFrom(incidentDetectedResponse);
                }
                if (this.incidentDetectedResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeIncidentStatusNotification(IncidentStatusNotification incidentStatusNotification) {
                IncidentStatusNotification incidentStatusNotification2;
                SingleFieldBuilderV3<IncidentStatusNotification, IncidentStatusNotification.Builder, IncidentStatusNotificationOrBuilder> singleFieldBuilderV3 = this.incidentStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(incidentStatusNotification);
                } else if ((this.bitField0_ & 256) == 0 || (incidentStatusNotification2 = this.incidentStatusNotification_) == null || incidentStatusNotification2 == IncidentStatusNotification.getDefaultInstance()) {
                    this.incidentStatusNotification_ = incidentStatusNotification;
                } else {
                    getIncidentStatusNotificationBuilder().mergeFrom(incidentStatusNotification);
                }
                if (this.incidentStatusNotification_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeIncidentVideoNotification(IncidentVideoNotification incidentVideoNotification) {
                IncidentVideoNotification incidentVideoNotification2;
                SingleFieldBuilderV3<IncidentVideoNotification, IncidentVideoNotification.Builder, IncidentVideoNotificationOrBuilder> singleFieldBuilderV3 = this.incidentVideoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(incidentVideoNotification);
                } else if ((this.bitField0_ & 512) == 0 || (incidentVideoNotification2 = this.incidentVideoNotification_) == null || incidentVideoNotification2 == IncidentVideoNotification.getDefaultInstance()) {
                    this.incidentVideoNotification_ = incidentVideoNotification;
                } else {
                    getIncidentVideoNotificationBuilder().mergeFrom(incidentVideoNotification);
                }
                if (this.incidentVideoNotification_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeUpdateDeviceOwnerRequest(UpdateDeviceOwnerRequest updateDeviceOwnerRequest) {
                UpdateDeviceOwnerRequest updateDeviceOwnerRequest2;
                SingleFieldBuilderV3<UpdateDeviceOwnerRequest, UpdateDeviceOwnerRequest.Builder, UpdateDeviceOwnerRequestOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateDeviceOwnerRequest);
                } else if ((this.bitField0_ & 1) == 0 || (updateDeviceOwnerRequest2 = this.updateDeviceOwnerRequest_) == null || updateDeviceOwnerRequest2 == UpdateDeviceOwnerRequest.getDefaultInstance()) {
                    this.updateDeviceOwnerRequest_ = updateDeviceOwnerRequest;
                } else {
                    getUpdateDeviceOwnerRequestBuilder().mergeFrom(updateDeviceOwnerRequest);
                }
                if (this.updateDeviceOwnerRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUpdateDeviceOwnerResponse(UpdateDeviceOwnerResponse updateDeviceOwnerResponse) {
                UpdateDeviceOwnerResponse updateDeviceOwnerResponse2;
                SingleFieldBuilderV3<UpdateDeviceOwnerResponse, UpdateDeviceOwnerResponse.Builder, UpdateDeviceOwnerResponseOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateDeviceOwnerResponse);
                } else if ((this.bitField0_ & 2) == 0 || (updateDeviceOwnerResponse2 = this.updateDeviceOwnerResponse_) == null || updateDeviceOwnerResponse2 == UpdateDeviceOwnerResponse.getDefaultInstance()) {
                    this.updateDeviceOwnerResponse_ = updateDeviceOwnerResponse;
                } else {
                    getUpdateDeviceOwnerResponseBuilder().mergeFrom(updateDeviceOwnerResponse);
                }
                if (this.updateDeviceOwnerResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUpdateIncidentContactsRequest(UpdateIncidentContactsRequest updateIncidentContactsRequest) {
                UpdateIncidentContactsRequest updateIncidentContactsRequest2;
                SingleFieldBuilderV3<UpdateIncidentContactsRequest, UpdateIncidentContactsRequest.Builder, UpdateIncidentContactsRequestOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateIncidentContactsRequest);
                } else if ((this.bitField0_ & 4) == 0 || (updateIncidentContactsRequest2 = this.updateIncidentContactsRequest_) == null || updateIncidentContactsRequest2 == UpdateIncidentContactsRequest.getDefaultInstance()) {
                    this.updateIncidentContactsRequest_ = updateIncidentContactsRequest;
                } else {
                    getUpdateIncidentContactsRequestBuilder().mergeFrom(updateIncidentContactsRequest);
                }
                if (this.updateIncidentContactsRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUpdateIncidentContactsResponse(UpdateIncidentContactsResponse updateIncidentContactsResponse) {
                UpdateIncidentContactsResponse updateIncidentContactsResponse2;
                SingleFieldBuilderV3<UpdateIncidentContactsResponse, UpdateIncidentContactsResponse.Builder, UpdateIncidentContactsResponseOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateIncidentContactsResponse);
                } else if ((this.bitField0_ & 8) == 0 || (updateIncidentContactsResponse2 = this.updateIncidentContactsResponse_) == null || updateIncidentContactsResponse2 == UpdateIncidentContactsResponse.getDefaultInstance()) {
                    this.updateIncidentContactsResponse_ = updateIncidentContactsResponse;
                } else {
                    getUpdateIncidentContactsResponseBuilder().mergeFrom(updateIncidentContactsResponse);
                }
                if (this.updateIncidentContactsResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setCancelIncidentRequest(CancelIncidentRequest.Builder builder) {
                SingleFieldBuilderV3<CancelIncidentRequest, CancelIncidentRequest.Builder, CancelIncidentRequestOrBuilder> singleFieldBuilderV3 = this.cancelIncidentRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cancelIncidentRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCancelIncidentResponse(CancelIncidentResponse.Builder builder) {
                SingleFieldBuilderV3<CancelIncidentResponse, CancelIncidentResponse.Builder, CancelIncidentResponseOrBuilder> singleFieldBuilderV3 = this.cancelIncidentResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cancelIncidentResponse_ = builder.build();
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

            public Builder setIncidentDetectedRequest(IncidentDetectedRequest.Builder builder) {
                SingleFieldBuilderV3<IncidentDetectedRequest, IncidentDetectedRequest.Builder, IncidentDetectedRequestOrBuilder> singleFieldBuilderV3 = this.incidentDetectedRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.incidentDetectedRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setIncidentDetectedResponse(IncidentDetectedResponse.Builder builder) {
                SingleFieldBuilderV3<IncidentDetectedResponse, IncidentDetectedResponse.Builder, IncidentDetectedResponseOrBuilder> singleFieldBuilderV3 = this.incidentDetectedResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.incidentDetectedResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setIncidentStatusNotification(IncidentStatusNotification.Builder builder) {
                SingleFieldBuilderV3<IncidentStatusNotification, IncidentStatusNotification.Builder, IncidentStatusNotificationOrBuilder> singleFieldBuilderV3 = this.incidentStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.incidentStatusNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setIncidentVideoNotification(IncidentVideoNotification.Builder builder) {
                SingleFieldBuilderV3<IncidentVideoNotification, IncidentVideoNotification.Builder, IncidentVideoNotificationOrBuilder> singleFieldBuilderV3 = this.incidentVideoNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.incidentVideoNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
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

            public Builder setUpdateDeviceOwnerRequest(UpdateDeviceOwnerRequest.Builder builder) {
                SingleFieldBuilderV3<UpdateDeviceOwnerRequest, UpdateDeviceOwnerRequest.Builder, UpdateDeviceOwnerRequestOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateDeviceOwnerRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUpdateDeviceOwnerResponse(UpdateDeviceOwnerResponse.Builder builder) {
                SingleFieldBuilderV3<UpdateDeviceOwnerResponse, UpdateDeviceOwnerResponse.Builder, UpdateDeviceOwnerResponseOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateDeviceOwnerResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUpdateIncidentContactsRequest(UpdateIncidentContactsRequest.Builder builder) {
                SingleFieldBuilderV3<UpdateIncidentContactsRequest, UpdateIncidentContactsRequest.Builder, UpdateIncidentContactsRequestOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateIncidentContactsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUpdateIncidentContactsResponse(UpdateIncidentContactsResponse.Builder builder) {
                SingleFieldBuilderV3<UpdateIncidentContactsResponse, UpdateIncidentContactsResponse.Builder, UpdateIncidentContactsResponseOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateIncidentContactsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public IncidentDetectionService getDefaultInstanceForType() {
                return IncidentDetectionService.getDefaultInstance();
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

            public Builder setCancelIncidentRequest(CancelIncidentRequest cancelIncidentRequest) {
                SingleFieldBuilderV3<CancelIncidentRequest, CancelIncidentRequest.Builder, CancelIncidentRequestOrBuilder> singleFieldBuilderV3 = this.cancelIncidentRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cancelIncidentRequest.getClass();
                    this.cancelIncidentRequest_ = cancelIncidentRequest;
                } else {
                    singleFieldBuilderV3.setMessage(cancelIncidentRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCancelIncidentResponse(CancelIncidentResponse cancelIncidentResponse) {
                SingleFieldBuilderV3<CancelIncidentResponse, CancelIncidentResponse.Builder, CancelIncidentResponseOrBuilder> singleFieldBuilderV3 = this.cancelIncidentResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cancelIncidentResponse.getClass();
                    this.cancelIncidentResponse_ = cancelIncidentResponse;
                } else {
                    singleFieldBuilderV3.setMessage(cancelIncidentResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setIncidentDetectedRequest(IncidentDetectedRequest incidentDetectedRequest) {
                SingleFieldBuilderV3<IncidentDetectedRequest, IncidentDetectedRequest.Builder, IncidentDetectedRequestOrBuilder> singleFieldBuilderV3 = this.incidentDetectedRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    incidentDetectedRequest.getClass();
                    this.incidentDetectedRequest_ = incidentDetectedRequest;
                } else {
                    singleFieldBuilderV3.setMessage(incidentDetectedRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setIncidentDetectedResponse(IncidentDetectedResponse incidentDetectedResponse) {
                SingleFieldBuilderV3<IncidentDetectedResponse, IncidentDetectedResponse.Builder, IncidentDetectedResponseOrBuilder> singleFieldBuilderV3 = this.incidentDetectedResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    incidentDetectedResponse.getClass();
                    this.incidentDetectedResponse_ = incidentDetectedResponse;
                } else {
                    singleFieldBuilderV3.setMessage(incidentDetectedResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setIncidentStatusNotification(IncidentStatusNotification incidentStatusNotification) {
                SingleFieldBuilderV3<IncidentStatusNotification, IncidentStatusNotification.Builder, IncidentStatusNotificationOrBuilder> singleFieldBuilderV3 = this.incidentStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    incidentStatusNotification.getClass();
                    this.incidentStatusNotification_ = incidentStatusNotification;
                } else {
                    singleFieldBuilderV3.setMessage(incidentStatusNotification);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setIncidentVideoNotification(IncidentVideoNotification incidentVideoNotification) {
                SingleFieldBuilderV3<IncidentVideoNotification, IncidentVideoNotification.Builder, IncidentVideoNotificationOrBuilder> singleFieldBuilderV3 = this.incidentVideoNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    incidentVideoNotification.getClass();
                    this.incidentVideoNotification_ = incidentVideoNotification;
                } else {
                    singleFieldBuilderV3.setMessage(incidentVideoNotification);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setUpdateDeviceOwnerRequest(UpdateDeviceOwnerRequest updateDeviceOwnerRequest) {
                SingleFieldBuilderV3<UpdateDeviceOwnerRequest, UpdateDeviceOwnerRequest.Builder, UpdateDeviceOwnerRequestOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateDeviceOwnerRequest.getClass();
                    this.updateDeviceOwnerRequest_ = updateDeviceOwnerRequest;
                } else {
                    singleFieldBuilderV3.setMessage(updateDeviceOwnerRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUpdateDeviceOwnerResponse(UpdateDeviceOwnerResponse updateDeviceOwnerResponse) {
                SingleFieldBuilderV3<UpdateDeviceOwnerResponse, UpdateDeviceOwnerResponse.Builder, UpdateDeviceOwnerResponseOrBuilder> singleFieldBuilderV3 = this.updateDeviceOwnerResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateDeviceOwnerResponse.getClass();
                    this.updateDeviceOwnerResponse_ = updateDeviceOwnerResponse;
                } else {
                    singleFieldBuilderV3.setMessage(updateDeviceOwnerResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUpdateIncidentContactsRequest(UpdateIncidentContactsRequest updateIncidentContactsRequest) {
                SingleFieldBuilderV3<UpdateIncidentContactsRequest, UpdateIncidentContactsRequest.Builder, UpdateIncidentContactsRequestOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateIncidentContactsRequest.getClass();
                    this.updateIncidentContactsRequest_ = updateIncidentContactsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(updateIncidentContactsRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUpdateIncidentContactsResponse(UpdateIncidentContactsResponse updateIncidentContactsResponse) {
                SingleFieldBuilderV3<UpdateIncidentContactsResponse, UpdateIncidentContactsResponse.Builder, UpdateIncidentContactsResponseOrBuilder> singleFieldBuilderV3 = this.updateIncidentContactsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateIncidentContactsResponse.getClass();
                    this.updateIncidentContactsResponse_ = updateIncidentContactsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(updateIncidentContactsResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof IncidentDetectionService) {
                    return mergeFrom((IncidentDetectionService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(IncidentDetectionService incidentDetectionService) {
                if (incidentDetectionService == IncidentDetectionService.getDefaultInstance()) {
                    return this;
                }
                if (incidentDetectionService.hasUpdateDeviceOwnerRequest()) {
                    mergeUpdateDeviceOwnerRequest(incidentDetectionService.getUpdateDeviceOwnerRequest());
                }
                if (incidentDetectionService.hasUpdateDeviceOwnerResponse()) {
                    mergeUpdateDeviceOwnerResponse(incidentDetectionService.getUpdateDeviceOwnerResponse());
                }
                if (incidentDetectionService.hasUpdateIncidentContactsRequest()) {
                    mergeUpdateIncidentContactsRequest(incidentDetectionService.getUpdateIncidentContactsRequest());
                }
                if (incidentDetectionService.hasUpdateIncidentContactsResponse()) {
                    mergeUpdateIncidentContactsResponse(incidentDetectionService.getUpdateIncidentContactsResponse());
                }
                if (incidentDetectionService.hasIncidentDetectedRequest()) {
                    mergeIncidentDetectedRequest(incidentDetectionService.getIncidentDetectedRequest());
                }
                if (incidentDetectionService.hasIncidentDetectedResponse()) {
                    mergeIncidentDetectedResponse(incidentDetectionService.getIncidentDetectedResponse());
                }
                if (incidentDetectionService.hasCancelIncidentRequest()) {
                    mergeCancelIncidentRequest(incidentDetectionService.getCancelIncidentRequest());
                }
                if (incidentDetectionService.hasCancelIncidentResponse()) {
                    mergeCancelIncidentResponse(incidentDetectionService.getCancelIncidentResponse());
                }
                if (incidentDetectionService.hasIncidentStatusNotification()) {
                    mergeIncidentStatusNotification(incidentDetectionService.getIncidentStatusNotification());
                }
                if (incidentDetectionService.hasIncidentVideoNotification()) {
                    mergeIncidentVideoNotification(incidentDetectionService.getIncidentVideoNotification());
                }
                mergeUnknownFields(incidentDetectionService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IncidentDetectionService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ IncidentDetectionService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private IncidentDetectionService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IncidentDetectionService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentDetectionService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IncidentDetectionService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static IncidentDetectionService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IncidentDetectionService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static IncidentDetectionService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static IncidentDetectionService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static IncidentDetectionService parseFrom(InputStream inputStream) {
            return (IncidentDetectionService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static IncidentDetectionService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentDetectionService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IncidentDetectionService parseFrom(CodedInputStream codedInputStream) {
            return (IncidentDetectionService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static IncidentDetectionService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentDetectionService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class IncidentStatusNotification extends GeneratedMessageV3 implements IncidentStatusNotificationOrBuilder {
        private static final IncidentStatusNotification DEFAULT_INSTANCE = new IncidentStatusNotification();

        @Deprecated
        public static final Parser<IncidentStatusNotification> PARSER = new AbstractParser<IncidentStatusNotification>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentStatusNotification.1
            @Override // com.google.protobuf.Parser
            public IncidentStatusNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = IncidentStatusNotification.newBuilder();
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

        private IncidentStatusNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IncidentStatusNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentStatusNotification_descriptor;
        }

        public static Builder newBuilder(IncidentStatusNotification incidentStatusNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(incidentStatusNotification);
        }

        public static IncidentStatusNotification parseDelimitedFrom(InputStream inputStream) {
            return (IncidentStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IncidentStatusNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<IncidentStatusNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IncidentStatusNotification)) {
                return super.equals(obj);
            }
            IncidentStatusNotification incidentStatusNotification = (IncidentStatusNotification) obj;
            if (hasStatus() != incidentStatusNotification.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == incidentStatusNotification.status_) && getUnknownFields().equals(incidentStatusNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<IncidentStatusNotification> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentStatusNotificationOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentStatusNotificationOrBuilder
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
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(IncidentStatusNotification.class, Builder.class);
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
            if (hasStatus()) {
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
            return new IncidentStatusNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IncidentStatusNotificationOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(IncidentStatusNotification incidentStatusNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    incidentStatusNotification.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                incidentStatusNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentStatusNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IncidentStatusNotification build() {
                IncidentStatusNotification incidentStatusNotificationBuildPartial = buildPartial();
                if (incidentStatusNotificationBuildPartial.isInitialized()) {
                    return incidentStatusNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) incidentStatusNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IncidentStatusNotification buildPartial() {
                IncidentStatusNotification incidentStatusNotification = new IncidentStatusNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(incidentStatusNotification);
                }
                onBuilt();
                return incidentStatusNotification;
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
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentStatusNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentStatusNotificationOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentStatusNotificationOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_IncidentStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(IncidentStatusNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus();
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
            public IncidentStatusNotification getDefaultInstanceForType() {
                return IncidentStatusNotification.getDefaultInstance();
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
                if (message instanceof IncidentStatusNotification) {
                    return mergeFrom((IncidentStatusNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(IncidentStatusNotification incidentStatusNotification) {
                if (incidentStatusNotification == IncidentStatusNotification.getDefaultInstance()) {
                    return this;
                }
                if (incidentStatusNotification.hasStatus()) {
                    setStatus(incidentStatusNotification.getStatus());
                }
                mergeUnknownFields(incidentStatusNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IncidentStatusNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static IncidentStatusNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IncidentStatusNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ IncidentStatusNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static IncidentStatusNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private IncidentStatusNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IncidentStatusNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static IncidentStatusNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static IncidentStatusNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static IncidentStatusNotification parseFrom(InputStream inputStream) {
            return (IncidentStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static IncidentStatusNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IncidentStatusNotification parseFrom(CodedInputStream codedInputStream) {
            return (IncidentStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static IncidentStatusNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IncidentStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            SENT_NOTIFICATIONS_TO_CONTACTS_SUCCESS(1),
            SENT_NOTIFICATIONS_TO_CONTACTS_FAILURE(2),
            FINISHED(3);

            public static final int FINISHED_VALUE = 3;
            public static final int SENT_NOTIFICATIONS_TO_CONTACTS_FAILURE_VALUE = 2;
            public static final int SENT_NOTIFICATIONS_TO_CONTACTS_SUCCESS_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.IncidentStatusNotification.Status.1
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
                    return SENT_NOTIFICATIONS_TO_CONTACTS_SUCCESS;
                }
                if (i14 == 2) {
                    return SENT_NOTIFICATIONS_TO_CONTACTS_FAILURE;
                }
                if (i14 != 3) {
                    return null;
                }
                return FINISHED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return IncidentStatusNotification.getDescriptor().getEnumTypes().get(0);
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

    public static final class UpdateDeviceOwnerRequest extends GeneratedMessageV3 implements UpdateDeviceOwnerRequestOrBuilder {
        public static final int LOCATION_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object location_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private static final UpdateDeviceOwnerRequest DEFAULT_INSTANCE = new UpdateDeviceOwnerRequest();

        @Deprecated
        public static final Parser<UpdateDeviceOwnerRequest> PARSER = new AbstractParser<UpdateDeviceOwnerRequest>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequest.1
            @Override // com.google.protobuf.Parser
            public UpdateDeviceOwnerRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateDeviceOwnerRequest.newBuilder();
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

        private UpdateDeviceOwnerRequest() {
            this.name_ = "";
            this.location_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.location_ = "";
        }

        public static UpdateDeviceOwnerRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerRequest_descriptor;
        }

        public static Builder newBuilder(UpdateDeviceOwnerRequest updateDeviceOwnerRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateDeviceOwnerRequest);
        }

        public static UpdateDeviceOwnerRequest parseDelimitedFrom(InputStream inputStream) {
            return (UpdateDeviceOwnerRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateDeviceOwnerRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateDeviceOwnerRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateDeviceOwnerRequest)) {
                return super.equals(obj);
            }
            UpdateDeviceOwnerRequest updateDeviceOwnerRequest = (UpdateDeviceOwnerRequest) obj;
            if (hasName() != updateDeviceOwnerRequest.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(updateDeviceOwnerRequest.getName())) && hasLocation() == updateDeviceOwnerRequest.hasLocation()) {
                return (!hasLocation() || getLocation().equals(updateDeviceOwnerRequest.getLocation())) && getUnknownFields().equals(updateDeviceOwnerRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
        public String getLocation() {
            Object obj = this.location_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.location_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
        public ByteString getLocationBytes() {
            Object obj = this.location_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.location_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
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

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
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
        public Parser<UpdateDeviceOwnerRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.location_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
        public boolean hasLocation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getName().hashCode();
            }
            if (hasLocation()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLocation().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateDeviceOwnerRequest.class, Builder.class);
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
            return new UpdateDeviceOwnerRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.location_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateDeviceOwnerRequestOrBuilder {
            private int bitField0_;
            private Object location_;
            private Object name_;

            private Builder() {
                this.name_ = "";
                this.location_ = "";
            }

            private void buildPartial0(UpdateDeviceOwnerRequest updateDeviceOwnerRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    updateDeviceOwnerRequest.name_ = this.name_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    updateDeviceOwnerRequest.location_ = this.location_;
                    i14 |= 2;
                }
                updateDeviceOwnerRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateDeviceOwnerRequest build() {
                UpdateDeviceOwnerRequest updateDeviceOwnerRequestBuildPartial = buildPartial();
                if (updateDeviceOwnerRequestBuildPartial.isInitialized()) {
                    return updateDeviceOwnerRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateDeviceOwnerRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateDeviceOwnerRequest buildPartial() {
                UpdateDeviceOwnerRequest updateDeviceOwnerRequest = new UpdateDeviceOwnerRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateDeviceOwnerRequest);
                }
                onBuilt();
                return updateDeviceOwnerRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.name_ = "";
                this.location_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLocation() {
                this.location_ = UpdateDeviceOwnerRequest.getDefaultInstance().getLocation();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = UpdateDeviceOwnerRequest.getDefaultInstance().getName();
                this.bitField0_ &= -2;
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
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
            public String getLocation() {
                Object obj = this.location_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.location_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
            public ByteString getLocationBytes() {
                Object obj = this.location_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.location_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
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

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerRequestOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateDeviceOwnerRequest.class, Builder.class);
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
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.location_ = codedInputStream.readBytes();
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

            public Builder setLocation(String str) {
                str.getClass();
                this.location_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLocationBytes(ByteString byteString) {
                byteString.getClass();
                this.location_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
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
            public UpdateDeviceOwnerRequest getDefaultInstanceForType() {
                return UpdateDeviceOwnerRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.location_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateDeviceOwnerRequest) {
                    return mergeFrom((UpdateDeviceOwnerRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateDeviceOwnerRequest updateDeviceOwnerRequest) {
                if (updateDeviceOwnerRequest == UpdateDeviceOwnerRequest.getDefaultInstance()) {
                    return this;
                }
                if (updateDeviceOwnerRequest.hasName()) {
                    this.name_ = updateDeviceOwnerRequest.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (updateDeviceOwnerRequest.hasLocation()) {
                    this.location_ = updateDeviceOwnerRequest.location_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(updateDeviceOwnerRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateDeviceOwnerRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateDeviceOwnerRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateDeviceOwnerRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateDeviceOwnerRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateDeviceOwnerRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateDeviceOwnerRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateDeviceOwnerRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateDeviceOwnerRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateDeviceOwnerRequest parseFrom(InputStream inputStream) {
            return (UpdateDeviceOwnerRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateDeviceOwnerRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateDeviceOwnerRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private UpdateDeviceOwnerRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.location_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateDeviceOwnerRequest parseFrom(CodedInputStream codedInputStream) {
            return (UpdateDeviceOwnerRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateDeviceOwnerRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateDeviceOwnerRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ UpdateDeviceOwnerRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class UpdateDeviceOwnerResponse extends GeneratedMessageV3 implements UpdateDeviceOwnerResponseOrBuilder {
        private static final UpdateDeviceOwnerResponse DEFAULT_INSTANCE = new UpdateDeviceOwnerResponse();

        @Deprecated
        public static final Parser<UpdateDeviceOwnerResponse> PARSER = new AbstractParser<UpdateDeviceOwnerResponse>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerResponse.1
            @Override // com.google.protobuf.Parser
            public UpdateDeviceOwnerResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateDeviceOwnerResponse.newBuilder();
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

        private UpdateDeviceOwnerResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateDeviceOwnerResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerResponse_descriptor;
        }

        public static Builder newBuilder(UpdateDeviceOwnerResponse updateDeviceOwnerResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateDeviceOwnerResponse);
        }

        public static UpdateDeviceOwnerResponse parseDelimitedFrom(InputStream inputStream) {
            return (UpdateDeviceOwnerResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateDeviceOwnerResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateDeviceOwnerResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateDeviceOwnerResponse)) {
                return super.equals(obj);
            }
            UpdateDeviceOwnerResponse updateDeviceOwnerResponse = (UpdateDeviceOwnerResponse) obj;
            if (hasStatus() != updateDeviceOwnerResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == updateDeviceOwnerResponse.status_) && getUnknownFields().equals(updateDeviceOwnerResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateDeviceOwnerResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerResponseOrBuilder
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
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateDeviceOwnerResponse.class, Builder.class);
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
            if (hasStatus()) {
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
            return new UpdateDeviceOwnerResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateDeviceOwnerResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(UpdateDeviceOwnerResponse updateDeviceOwnerResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    updateDeviceOwnerResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                updateDeviceOwnerResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateDeviceOwnerResponse build() {
                UpdateDeviceOwnerResponse updateDeviceOwnerResponseBuildPartial = buildPartial();
                if (updateDeviceOwnerResponseBuildPartial.isInitialized()) {
                    return updateDeviceOwnerResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateDeviceOwnerResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateDeviceOwnerResponse buildPartial() {
                UpdateDeviceOwnerResponse updateDeviceOwnerResponse = new UpdateDeviceOwnerResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateDeviceOwnerResponse);
                }
                onBuilt();
                return updateDeviceOwnerResponse;
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
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateDeviceOwnerResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateDeviceOwnerResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus();
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
                                    if (ResponseStatus.forNumber(i14) == null) {
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

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UpdateDeviceOwnerResponse getDefaultInstanceForType() {
                return UpdateDeviceOwnerResponse.getDefaultInstance();
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
                if (message instanceof UpdateDeviceOwnerResponse) {
                    return mergeFrom((UpdateDeviceOwnerResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateDeviceOwnerResponse updateDeviceOwnerResponse) {
                if (updateDeviceOwnerResponse == UpdateDeviceOwnerResponse.getDefaultInstance()) {
                    return this;
                }
                if (updateDeviceOwnerResponse.hasStatus()) {
                    setStatus(updateDeviceOwnerResponse.getStatus());
                }
                mergeUnknownFields(updateDeviceOwnerResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateDeviceOwnerResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateDeviceOwnerResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateDeviceOwnerResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateDeviceOwnerResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ UpdateDeviceOwnerResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UpdateDeviceOwnerResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private UpdateDeviceOwnerResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateDeviceOwnerResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateDeviceOwnerResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateDeviceOwnerResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateDeviceOwnerResponse parseFrom(InputStream inputStream) {
            return (UpdateDeviceOwnerResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateDeviceOwnerResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateDeviceOwnerResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateDeviceOwnerResponse parseFrom(CodedInputStream codedInputStream) {
            return (UpdateDeviceOwnerResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateDeviceOwnerResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateDeviceOwnerResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateDeviceOwnerResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 100) {
                    return OK;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UpdateDeviceOwnerResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class UpdateIncidentContactsRequest extends GeneratedMessageV3 implements UpdateIncidentContactsRequestOrBuilder {
        public static final int CONTACT_FIELD_NUMBER = 1;
        private static final UpdateIncidentContactsRequest DEFAULT_INSTANCE = new UpdateIncidentContactsRequest();

        @Deprecated
        public static final Parser<UpdateIncidentContactsRequest> PARSER = new AbstractParser<UpdateIncidentContactsRequest>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsRequest.1
            @Override // com.google.protobuf.Parser
            public UpdateIncidentContactsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateIncidentContactsRequest.newBuilder();
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
        private List<Contact> contact_;
        private byte memoizedIsInitialized;

        private UpdateIncidentContactsRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.contact_ = Collections.EMPTY_LIST;
        }

        public static UpdateIncidentContactsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsRequest_descriptor;
        }

        public static Builder newBuilder(UpdateIncidentContactsRequest updateIncidentContactsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateIncidentContactsRequest);
        }

        public static UpdateIncidentContactsRequest parseDelimitedFrom(InputStream inputStream) {
            return (UpdateIncidentContactsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateIncidentContactsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateIncidentContactsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateIncidentContactsRequest)) {
                return super.equals(obj);
            }
            UpdateIncidentContactsRequest updateIncidentContactsRequest = (UpdateIncidentContactsRequest) obj;
            return getContactList().equals(updateIncidentContactsRequest.getContactList()) && getUnknownFields().equals(updateIncidentContactsRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsRequestOrBuilder
        public Contact getContact(int i14) {
            return this.contact_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsRequestOrBuilder
        public int getContactCount() {
            return this.contact_.size();
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsRequestOrBuilder
        public List<Contact> getContactList() {
            return this.contact_;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsRequestOrBuilder
        public ContactOrBuilder getContactOrBuilder(int i14) {
            return this.contact_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsRequestOrBuilder
        public List<? extends ContactOrBuilder> getContactOrBuilderList() {
            return this.contact_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateIncidentContactsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.contact_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.contact_.get(i15));
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
            if (getContactCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getContactList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateIncidentContactsRequest.class, Builder.class);
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
            for (int i14 = 0; i14 < getContactCount(); i14++) {
                if (!getContact(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
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
            return new UpdateIncidentContactsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.contact_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.contact_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateIncidentContactsRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> contactBuilder_;
            private List<Contact> contact_;

            private Builder() {
                this.contact_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(UpdateIncidentContactsRequest updateIncidentContactsRequest) {
            }

            private void buildPartialRepeatedFields(UpdateIncidentContactsRequest updateIncidentContactsRequest) {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    updateIncidentContactsRequest.contact_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.contact_ = Collections.unmodifiableList(this.contact_);
                    this.bitField0_ &= -2;
                }
                updateIncidentContactsRequest.contact_ = this.contact_;
            }

            private void ensureContactIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.contact_ = new ArrayList(this.contact_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> getContactFieldBuilder() {
                if (this.contactBuilder_ == null) {
                    this.contactBuilder_ = new RepeatedFieldBuilderV3<>(this.contact_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.contact_ = null;
                }
                return this.contactBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsRequest_descriptor;
            }

            public Builder addAllContact(Iterable<? extends Contact> iterable) {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureContactIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.contact_);
                onChanged();
                return this;
            }

            public Builder addContact(Contact.Builder builder) {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureContactIsMutable();
                this.contact_.add(builder.build());
                onChanged();
                return this;
            }

            public Contact.Builder addContactBuilder() {
                return (Contact.Builder) getContactFieldBuilder().addBuilder(Contact.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateIncidentContactsRequest build() {
                UpdateIncidentContactsRequest updateIncidentContactsRequestBuildPartial = buildPartial();
                if (updateIncidentContactsRequestBuildPartial.isInitialized()) {
                    return updateIncidentContactsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateIncidentContactsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateIncidentContactsRequest buildPartial() {
                UpdateIncidentContactsRequest updateIncidentContactsRequest = new UpdateIncidentContactsRequest(this);
                buildPartialRepeatedFields(updateIncidentContactsRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateIncidentContactsRequest);
                }
                onBuilt();
                return updateIncidentContactsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.contact_ = Collections.EMPTY_LIST;
                } else {
                    this.contact_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearContact() {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.contact_ = Collections.EMPTY_LIST;
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

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsRequestOrBuilder
            public Contact getContact(int i14) {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                return repeatedFieldBuilderV3 == null ? this.contact_.get(i14) : (Contact) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Contact.Builder getContactBuilder(int i14) {
                return (Contact.Builder) getContactFieldBuilder().getBuilder(i14);
            }

            public List<Contact.Builder> getContactBuilderList() {
                return getContactFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsRequestOrBuilder
            public int getContactCount() {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                return repeatedFieldBuilderV3 == null ? this.contact_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsRequestOrBuilder
            public List<Contact> getContactList() {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.contact_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsRequestOrBuilder
            public ContactOrBuilder getContactOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                return repeatedFieldBuilderV3 == null ? this.contact_.get(i14) : (ContactOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsRequestOrBuilder
            public List<? extends ContactOrBuilder> getContactOrBuilderList() {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.contact_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateIncidentContactsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getContactCount(); i14++) {
                    if (!getContact(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(UpdateIncidentContactsRequest updateIncidentContactsRequest) {
                if (updateIncidentContactsRequest == UpdateIncidentContactsRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.contactBuilder_ == null) {
                    if (!updateIncidentContactsRequest.contact_.isEmpty()) {
                        if (this.contact_.isEmpty()) {
                            this.contact_ = updateIncidentContactsRequest.contact_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureContactIsMutable();
                            this.contact_.addAll(updateIncidentContactsRequest.contact_);
                        }
                        onChanged();
                    }
                } else if (!updateIncidentContactsRequest.contact_.isEmpty()) {
                    boolean zIsEmpty = this.contactBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.contactBuilder_ = null;
                        this.contact_ = updateIncidentContactsRequest.contact_;
                        this.bitField0_ &= -2;
                        this.contactBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getContactFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(updateIncidentContactsRequest.contact_);
                    }
                }
                mergeUnknownFields(updateIncidentContactsRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeContact(int i14) {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureContactIsMutable();
                this.contact_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setContact(int i14, Contact.Builder builder) {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureContactIsMutable();
                this.contact_.set(i14, builder.build());
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
            public UpdateIncidentContactsRequest getDefaultInstanceForType() {
                return UpdateIncidentContactsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.contact_ = Collections.EMPTY_LIST;
            }

            public Contact.Builder addContactBuilder(int i14) {
                return (Contact.Builder) getContactFieldBuilder().addBuilder(i14, Contact.getDefaultInstance());
            }

            public Builder addContact(int i14, Contact contact) {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contact.getClass();
                    ensureContactIsMutable();
                    this.contact_.add(i14, contact);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, contact);
                return this;
            }

            public Builder setContact(int i14, Contact contact) {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contact.getClass();
                    ensureContactIsMutable();
                    this.contact_.set(i14, contact);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, contact);
                return this;
            }

            public Builder addContact(Contact contact) {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    contact.getClass();
                    ensureContactIsMutable();
                    this.contact_.add(contact);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(contact);
                return this;
            }

            public Builder addContact(int i14, Contact.Builder builder) {
                RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureContactIsMutable();
                    this.contact_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateIncidentContactsRequest) {
                    return mergeFrom((UpdateIncidentContactsRequest) message);
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
                                    Contact contact = (Contact) codedInputStream.readMessage(Contact.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilderV3 = this.contactBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureContactIsMutable();
                                        this.contact_.add(contact);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(contact);
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
        public UpdateIncidentContactsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateIncidentContactsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateIncidentContactsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateIncidentContactsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateIncidentContactsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private UpdateIncidentContactsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateIncidentContactsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateIncidentContactsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ UpdateIncidentContactsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UpdateIncidentContactsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateIncidentContactsRequest parseFrom(InputStream inputStream) {
            return (UpdateIncidentContactsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateIncidentContactsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateIncidentContactsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateIncidentContactsRequest parseFrom(CodedInputStream codedInputStream) {
            return (UpdateIncidentContactsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateIncidentContactsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateIncidentContactsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class UpdateIncidentContactsResponse extends GeneratedMessageV3 implements UpdateIncidentContactsResponseOrBuilder {
        private static final UpdateIncidentContactsResponse DEFAULT_INSTANCE = new UpdateIncidentContactsResponse();

        @Deprecated
        public static final Parser<UpdateIncidentContactsResponse> PARSER = new AbstractParser<UpdateIncidentContactsResponse>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsResponse.1
            @Override // com.google.protobuf.Parser
            public UpdateIncidentContactsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateIncidentContactsResponse.newBuilder();
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

        private UpdateIncidentContactsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateIncidentContactsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsResponse_descriptor;
        }

        public static Builder newBuilder(UpdateIncidentContactsResponse updateIncidentContactsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateIncidentContactsResponse);
        }

        public static UpdateIncidentContactsResponse parseDelimitedFrom(InputStream inputStream) {
            return (UpdateIncidentContactsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateIncidentContactsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateIncidentContactsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateIncidentContactsResponse)) {
                return super.equals(obj);
            }
            UpdateIncidentContactsResponse updateIncidentContactsResponse = (UpdateIncidentContactsResponse) obj;
            if (hasStatus() != updateIncidentContactsResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == updateIncidentContactsResponse.status_) && getUnknownFields().equals(updateIncidentContactsResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateIncidentContactsResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsResponseOrBuilder
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
            return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateIncidentContactsResponse.class, Builder.class);
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
            if (hasStatus()) {
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
            return new UpdateIncidentContactsResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateIncidentContactsResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(UpdateIncidentContactsResponse updateIncidentContactsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    updateIncidentContactsResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                updateIncidentContactsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateIncidentContactsResponse build() {
                UpdateIncidentContactsResponse updateIncidentContactsResponseBuildPartial = buildPartial();
                if (updateIncidentContactsResponseBuildPartial.isInitialized()) {
                    return updateIncidentContactsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateIncidentContactsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateIncidentContactsResponse buildPartial() {
                UpdateIncidentContactsResponse updateIncidentContactsResponse = new UpdateIncidentContactsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateIncidentContactsResponse);
                }
                onBuilt();
                return updateIncidentContactsResponse;
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
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIncidentDetectionProto.internal_static_GDI_Proto_IncidentDetection_UpdateIncidentContactsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateIncidentContactsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus();
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
                                    if (ResponseStatus.forNumber(i14) == null) {
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

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UpdateIncidentContactsResponse getDefaultInstanceForType() {
                return UpdateIncidentContactsResponse.getDefaultInstance();
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
                if (message instanceof UpdateIncidentContactsResponse) {
                    return mergeFrom((UpdateIncidentContactsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateIncidentContactsResponse updateIncidentContactsResponse) {
                if (updateIncidentContactsResponse == UpdateIncidentContactsResponse.getDefaultInstance()) {
                    return this;
                }
                if (updateIncidentContactsResponse.hasStatus()) {
                    setStatus(updateIncidentContactsResponse.getStatus());
                }
                mergeUnknownFields(updateIncidentContactsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateIncidentContactsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateIncidentContactsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateIncidentContactsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateIncidentContactsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ UpdateIncidentContactsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UpdateIncidentContactsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private UpdateIncidentContactsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateIncidentContactsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateIncidentContactsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateIncidentContactsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateIncidentContactsResponse parseFrom(InputStream inputStream) {
            return (UpdateIncidentContactsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateIncidentContactsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateIncidentContactsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateIncidentContactsResponse parseFrom(CodedInputStream codedInputStream) {
            return (UpdateIncidentContactsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateIncidentContactsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateIncidentContactsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIIncidentDetectionProto.UpdateIncidentContactsResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 100) {
                    return OK;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UpdateIncidentContactsResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
