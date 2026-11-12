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
public final class GDIEventSharingProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015GDIEventSharing.proto\u0012\u0016GDI.Proto.EventSharing\"ö\u0002\n\u0013EventSharingService\u0012C\n\u0011subscribe_request\u0018\u0001 \u0001(\u000b2(.GDI.Proto.EventSharing.SubscribeRequest\u0012E\n\u0012subscribe_response\u0018\u0002 \u0001(\u000b2).GDI.Proto.EventSharing.SubscribeResponse\u0012E\n\u0012alert_notification\u0018\u0003 \u0001(\u000b2).GDI.Proto.EventSharing.AlertNotification\u0012D\n\u000fsupport_request\u0018\u0004 \u0001(\u000b2+.GDI.Proto.EventSharing.AlertSupportRequest\u0012F\n\u0010support_response\u0018\u0005 \u0001(\u000b2,.GDI.Proto.EventSharing.AlertSupportResponse\"Q\n\fAlertMessage\u0012/\n\u0004type\u0018\u0001 \u0001(\u000e2!.GDI.Proto.EventSharing.AlertType\u0012\u0010\n\binterval\u0018\u0002 \u0001(\r\";\n\u0005Sport\u0012\u0016\n\u000esport_fit_type\u0018\u0001 \u0002(\r\u0012\u001a\n\u0012sport_fit_sub_type\u0018\u0002 \u0002(\r\"ð\u0002\n\u0014ActivityAlertDetails\u0012\u0016\n\u000etotal_distance\u0018\u0001 \u0001(\r\u0012\u0012\n\ntotal_time\u0018\u0002 \u0001(\r\u0012\u0010\n\blap_time\u0018\u0003 \u0001(\r\u0012\u0014\n\faverage_pace\u0018\u0004 \u0001(\r\u00121\n\nsport_type\u0018\u0005 \u0001(\u000b2\u001d.GDI.Proto.EventSharing.Sport\u0012\u0017\n\u000fest_finish_time\u0018\u0006 \u0001(\r\u0012\u0012\n\nlap_number\u0018\u0007 \u0001(\r\u0012\u0014\n\fsession_dist\u0018\b \u0001(\r\u0012\u0014\n\fsession_time\u0018\t \u0001(\r\u0012\u0012\n\nlocal_time\u0018\n \u0001(\r\u00126\n\u000flast_sport_type\u0018\u000b \u0001(\u000b2\u001d.GDI.Proto.EventSharing.Sport\u0012\u0015\n\rinterval_dist\u0018\f \u0001(\r\u0012\u0015\n\rinterval_time\u0018\r \u0001(\r\"a\n\u0010SubscribeRequest\u00124\n\u0006alerts\u0018\u0001 \u0003(\u000b2$.GDI.Proto.EventSharing.AlertMessage\u0012\u0017\n\u000ftarget_distance\u0018\u0002 \u0001(\r\"\u0015\n\u0013AlertSupportRequest\"²\u0002\n\u0011SubscribeResponse\u0012R\n\falert_status\u0018\u0001 \u0003(\u000b2<.GDI.Proto.EventSharing.SubscribeResponse.AlertStatusMessage\u001aÈ\u0001\n\u0012AlertStatusMessage\u0012]\n\u0010subscribe_status\u0018\u0001 \u0002(\u000e2C.GDI.Proto.EventSharing.SubscribeResponse.AlertStatusMessage.Status\u00122\n\u0004type\u0018\u0002 \u0001(\u000b2$.GDI.Proto.EventSharing.AlertMessage\"\u001f\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\b\n\u0004FAIL\u0010\u0001\"h\n\u0014AlertSupportResponse\u0012;\n\u0010supported_alerts\u0018\u0001 \u0003(\u000e2!.GDI.Proto.EventSharing.AlertType\u0012\u0013\n\u000bversion_num\u0018\u0002 \u0003(\r\"\u009d\u0001\n\u0011AlertNotification\u00125\n\nalert_type\u0018\u0001 \u0003(\u000e2!.GDI.Proto.EventSharing.AlertType\u0012F\n\u0010activity_details\u0018\u0002 \u0001(\u000b2,.GDI.Proto.EventSharing.ActivityAlertDetails*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002*ñ\u0007\n\tAlertType\u0012\u0012\n\u000eACTIVITY_START\u0010\u0000\u0012\u0011\n\rACTIVITY_STOP\u0010\u0001\u0012\u0015\n\u0011ACTIVITY_DISTANCE\u0010\u0002\u0012\u0011\n\rACTIVITY_TIME\u0010\u0003\u0012\u0015\n\u0011ACTIVITY_AUTO_LAP\u0010\u0004\u0012\u0017\n\u0013ACTIVITY_MANUAL_LAP\u0010\u0005\u0012\u0017\n\u0013ACTIVITY_TRANSITION\u0010\u0006\u0012\u001a\n\u0016SWITCHER_STATUS_CHANGE\u0010\u0007\u0012\u0012\n\u000eLAUNCH_MONITOR\u0010\b\u0012\u0015\n\u0011NAVIGATION_UPDATE\u0010\t\u0012\u001e\n\u001aBREAK_PLANNER_STATE_CHANGE\u0010\n\u0012\u0018\n\u0014DRIVING_STATE_CHANGE\u0010\u000b\u0012\"\n\u001eBLUETOOTH_CLASSIC_STATE_CHANGE\u0010\f\u0012\u0015\n\u0011GOLF_STATE_CHANGE\u0010\r\u0012\u001b\n\u0017RANGEFINDER_MEASUREMENT\u0010\u000e\u0012\u0014\n\u0010XERO_CHRONOGRAPH\u0010\u000f\u0012\u001b\n\u0017GOLF_CLUB_STATUS_CHANGE\u0010\u0010\u0012\u0019\n\u0015DIVE_READINESS_CHANGE\u0010\u0011\u0012\u0019\n\u0015RADAR_SETTINGS_CHANGE\u0010\u0012\u0012\u0010\n\fLIVE_SESSION\u0010\u0013\u0012\u001a\n\u0016HEART_RATE_MEASUREMENT\u0010\u0014\u0012\u0017\n\u0013RUNNING_MEASUREMENT\u0010\u0015\u0012&\n\"ACCESSORY_UTILITIES_ACTIVITY_STATE\u0010\u0016\u0012\u001b\n\u0017RUNNING_ALGORITHM_INPUT\u0010\u0017\u0012\u001a\n\u0016BIKE_POWER_MEASUREMENT\u0010\u0018\u0012\u0017\n\u0013DEVELOPMENT_TESTING\u0010\u0019\u0012\u000e\n\nPSA_SAMPLE\u0010\u001a\u0012\u0017\n\u0013VARIA_DEVICE_STATUS\u0010\u001b\u0012\u0010\n\fBUTTON_EVENT\u0010\u001c\u0012$\n CYCLING_TORSO_SENSOR_MEASUREMENT\u0010\u001d\u0012\u0011\n\rXCEL_STRENGTH\u0010\u001e\u0012$\n CONTROLLING_DEVICE_STATUS_CHANGE\u0010\u001f\u0012\u000f\n\u000bXCEL_SPRINT\u0010 \u0012\u0014\n\u0010XERO_RANGEFINDER\u0010!\u0012\u001c\n\u0018XCEL_SPRINT_SENSOR_STATE\u0010\"\u0012%\n!SOFTWARE_UPDATE_DOWNLOAD_PROGRESS\u0010#\u0012\"\n\u001eSOFTWARE_UPDATE_DOWNLOAD_READY\u0010$\u0012\u001d\n\u0019SOFTWARE_UPDATE_COMPLETED\u0010%B4\n\u001acom.garmin.proto.generatedB\u0014GDIEventSharingProtoH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_EventSharing_ActivityAlertDetails_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_EventSharing_ActivityAlertDetails_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_EventSharing_AlertMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_EventSharing_AlertMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_EventSharing_AlertNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_EventSharing_AlertNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_EventSharing_AlertSupportRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_EventSharing_AlertSupportRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_EventSharing_AlertSupportResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_EventSharing_AlertSupportResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_EventSharing_EventSharingService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_EventSharing_EventSharingService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_EventSharing_Sport_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_EventSharing_Sport_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_EventSharing_SubscribeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_EventSharing_SubscribeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_EventSharing_SubscribeResponse_AlertStatusMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_EventSharing_SubscribeResponse_AlertStatusMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_EventSharing_SubscribeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_EventSharing_SubscribeResponse_fieldAccessorTable;

    public interface ActivityAlertDetailsOrBuilder extends MessageOrBuilder {
        int getAveragePace();

        int getEstFinishTime();

        int getIntervalDist();

        int getIntervalTime();

        int getLapNumber();

        int getLapTime();

        Sport getLastSportType();

        SportOrBuilder getLastSportTypeOrBuilder();

        int getLocalTime();

        int getSessionDist();

        int getSessionTime();

        Sport getSportType();

        SportOrBuilder getSportTypeOrBuilder();

        int getTotalDistance();

        int getTotalTime();

        boolean hasAveragePace();

        boolean hasEstFinishTime();

        boolean hasIntervalDist();

        boolean hasIntervalTime();

        boolean hasLapNumber();

        boolean hasLapTime();

        boolean hasLastSportType();

        boolean hasLocalTime();

        boolean hasSessionDist();

        boolean hasSessionTime();

        boolean hasSportType();

        boolean hasTotalDistance();

        boolean hasTotalTime();
    }

    public interface AlertMessageOrBuilder extends MessageOrBuilder {
        int getInterval();

        AlertType getType();

        boolean hasInterval();

        boolean hasType();
    }

    public interface AlertNotificationOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder<AlertNotification> {
        ActivityAlertDetails getActivityDetails();

        ActivityAlertDetailsOrBuilder getActivityDetailsOrBuilder();

        AlertType getAlertType(int i14);

        int getAlertTypeCount();

        List<AlertType> getAlertTypeList();

        boolean hasActivityDetails();
    }

    public interface AlertSupportRequestOrBuilder extends MessageOrBuilder {
    }

    public interface AlertSupportResponseOrBuilder extends MessageOrBuilder {
        AlertType getSupportedAlerts(int i14);

        int getSupportedAlertsCount();

        List<AlertType> getSupportedAlertsList();

        int getVersionNum(int i14);

        int getVersionNumCount();

        List<Integer> getVersionNumList();
    }

    public interface EventSharingServiceOrBuilder extends MessageOrBuilder {
        AlertNotification getAlertNotification();

        AlertNotificationOrBuilder getAlertNotificationOrBuilder();

        SubscribeRequest getSubscribeRequest();

        SubscribeRequestOrBuilder getSubscribeRequestOrBuilder();

        SubscribeResponse getSubscribeResponse();

        SubscribeResponseOrBuilder getSubscribeResponseOrBuilder();

        AlertSupportRequest getSupportRequest();

        AlertSupportRequestOrBuilder getSupportRequestOrBuilder();

        AlertSupportResponse getSupportResponse();

        AlertSupportResponseOrBuilder getSupportResponseOrBuilder();

        boolean hasAlertNotification();

        boolean hasSubscribeRequest();

        boolean hasSubscribeResponse();

        boolean hasSupportRequest();

        boolean hasSupportResponse();
    }

    public interface SportOrBuilder extends MessageOrBuilder {
        int getSportFitSubType();

        int getSportFitType();

        boolean hasSportFitSubType();

        boolean hasSportFitType();
    }

    public interface SubscribeRequestOrBuilder extends MessageOrBuilder {
        AlertMessage getAlerts(int i14);

        int getAlertsCount();

        List<AlertMessage> getAlertsList();

        AlertMessageOrBuilder getAlertsOrBuilder(int i14);

        List<? extends AlertMessageOrBuilder> getAlertsOrBuilderList();

        int getTargetDistance();

        boolean hasTargetDistance();
    }

    public interface SubscribeResponseOrBuilder extends MessageOrBuilder {
        SubscribeResponse.AlertStatusMessage getAlertStatus(int i14);

        int getAlertStatusCount();

        List<SubscribeResponse.AlertStatusMessage> getAlertStatusList();

        SubscribeResponse.AlertStatusMessageOrBuilder getAlertStatusOrBuilder(int i14);

        List<? extends SubscribeResponse.AlertStatusMessageOrBuilder> getAlertStatusOrBuilderList();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_EventSharing_EventSharingService_descriptor = descriptor2;
        internal_static_GDI_Proto_EventSharing_EventSharingService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SubscribeRequest", "SubscribeResponse", "AlertNotification", "SupportRequest", "SupportResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_EventSharing_AlertMessage_descriptor = descriptor3;
        internal_static_GDI_Proto_EventSharing_AlertMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Type", "Interval"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_EventSharing_Sport_descriptor = descriptor4;
        internal_static_GDI_Proto_EventSharing_Sport_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"SportFitType", "SportFitSubType"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_EventSharing_ActivityAlertDetails_descriptor = descriptor5;
        internal_static_GDI_Proto_EventSharing_ActivityAlertDetails_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"TotalDistance", "TotalTime", "LapTime", "AveragePace", "SportType", "EstFinishTime", "LapNumber", "SessionDist", "SessionTime", "LocalTime", "LastSportType", "IntervalDist", "IntervalTime"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_EventSharing_SubscribeRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_EventSharing_SubscribeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Alerts", "TargetDistance"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_EventSharing_AlertSupportRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_EventSharing_AlertSupportRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_EventSharing_SubscribeResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_EventSharing_SubscribeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"AlertStatus"});
        Descriptors.Descriptor descriptor9 = descriptor8.getNestedTypes().get(0);
        internal_static_GDI_Proto_EventSharing_SubscribeResponse_AlertStatusMessage_descriptor = descriptor9;
        internal_static_GDI_Proto_EventSharing_SubscribeResponse_AlertStatusMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"SubscribeStatus", "Type"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_EventSharing_AlertSupportResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_EventSharing_AlertSupportResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"SupportedAlerts", "VersionNum"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_EventSharing_AlertNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_EventSharing_AlertNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"AlertType", "ActivityDetails"});
    }

    private GDIEventSharingProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class AlertSupportRequest extends GeneratedMessageV3 implements AlertSupportRequestOrBuilder {
        private static final AlertSupportRequest DEFAULT_INSTANCE = new AlertSupportRequest();

        @Deprecated
        public static final Parser<AlertSupportRequest> PARSER = new AbstractParser<AlertSupportRequest>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.AlertSupportRequest.1
            @Override // com.google.protobuf.Parser
            public AlertSupportRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlertSupportRequest.newBuilder();
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

        private AlertSupportRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlertSupportRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertSupportRequest_descriptor;
        }

        public static Builder newBuilder(AlertSupportRequest alertSupportRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alertSupportRequest);
        }

        public static AlertSupportRequest parseDelimitedFrom(InputStream inputStream) {
            return (AlertSupportRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlertSupportRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlertSupportRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AlertSupportRequest) {
                return getUnknownFields().equals(((AlertSupportRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlertSupportRequest> getParserForType() {
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
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertSupportRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertSupportRequest.class, Builder.class);
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
            return new AlertSupportRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertSupportRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertSupportRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertSupportRequest build() {
                AlertSupportRequest alertSupportRequestBuildPartial = buildPartial();
                if (alertSupportRequestBuildPartial.isInitialized()) {
                    return alertSupportRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alertSupportRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertSupportRequest buildPartial() {
                AlertSupportRequest alertSupportRequest = new AlertSupportRequest(this);
                onBuilt();
                return alertSupportRequest;
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
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertSupportRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertSupportRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertSupportRequest.class, Builder.class);
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
            public AlertSupportRequest getDefaultInstanceForType() {
                return AlertSupportRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlertSupportRequest) {
                    return mergeFrom((AlertSupportRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlertSupportRequest alertSupportRequest) {
                if (alertSupportRequest == AlertSupportRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(alertSupportRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlertSupportRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AlertSupportRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AlertSupportRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlertSupportRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertSupportRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertSupportRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlertSupportRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlertSupportRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlertSupportRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlertSupportRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AlertSupportRequest parseFrom(InputStream inputStream) {
            return (AlertSupportRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AlertSupportRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertSupportRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertSupportRequest parseFrom(CodedInputStream codedInputStream) {
            return (AlertSupportRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlertSupportRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertSupportRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Sport extends GeneratedMessageV3 implements SportOrBuilder {
        private static final Sport DEFAULT_INSTANCE = new Sport();

        @Deprecated
        public static final Parser<Sport> PARSER = new AbstractParser<Sport>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.Sport.1
            @Override // com.google.protobuf.Parser
            public Sport parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Sport.newBuilder();
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
        public static final int SPORT_FIT_SUB_TYPE_FIELD_NUMBER = 2;
        public static final int SPORT_FIT_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int sportFitSubType_;
        private int sportFitType_;

        private Sport(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sportFitType_ = 0;
            this.sportFitSubType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Sport getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_Sport_descriptor;
        }

        public static Builder newBuilder(Sport sport) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sport);
        }

        public static Sport parseDelimitedFrom(InputStream inputStream) {
            return (Sport) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Sport parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Sport> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Sport)) {
                return super.equals(obj);
            }
            Sport sport = (Sport) obj;
            if (hasSportFitType() != sport.hasSportFitType()) {
                return false;
            }
            if ((!hasSportFitType() || getSportFitType() == sport.getSportFitType()) && hasSportFitSubType() == sport.hasSportFitSubType()) {
                return (!hasSportFitSubType() || getSportFitSubType() == sport.getSportFitSubType()) && getUnknownFields().equals(sport.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Sport> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sportFitType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.sportFitSubType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SportOrBuilder
        public int getSportFitSubType() {
            return this.sportFitSubType_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SportOrBuilder
        public int getSportFitType() {
            return this.sportFitType_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SportOrBuilder
        public boolean hasSportFitSubType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SportOrBuilder
        public boolean hasSportFitType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSportFitType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSportFitType();
            }
            if (hasSportFitSubType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSportFitSubType();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_Sport_fieldAccessorTable.ensureFieldAccessorsInitialized(Sport.class, Builder.class);
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
            if (!hasSportFitType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSportFitSubType()) {
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
            return new Sport();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sportFitType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.sportFitSubType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SportOrBuilder {
            private int bitField0_;
            private int sportFitSubType_;
            private int sportFitType_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(Sport sport) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    sport.sportFitType_ = this.sportFitType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sport.sportFitSubType_ = this.sportFitSubType_;
                    i14 |= 2;
                }
                sport.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_Sport_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Sport build() {
                Sport sportBuildPartial = buildPartial();
                if (sportBuildPartial.isInitialized()) {
                    return sportBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sportBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Sport buildPartial() {
                Sport sport = new Sport(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sport);
                }
                onBuilt();
                return sport;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sportFitType_ = 0;
                this.sportFitSubType_ = 0;
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

            public Builder clearSportFitSubType() {
                this.bitField0_ &= -3;
                this.sportFitSubType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSportFitType() {
                this.bitField0_ &= -2;
                this.sportFitType_ = 0;
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
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_Sport_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SportOrBuilder
            public int getSportFitSubType() {
                return this.sportFitSubType_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SportOrBuilder
            public int getSportFitType() {
                return this.sportFitType_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SportOrBuilder
            public boolean hasSportFitSubType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SportOrBuilder
            public boolean hasSportFitType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_Sport_fieldAccessorTable.ensureFieldAccessorsInitialized(Sport.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSportFitType() && hasSportFitSubType();
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
                                    this.sportFitType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.sportFitSubType_ = codedInputStream.readUInt32();
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

            public Builder setSportFitSubType(int i14) {
                this.sportFitSubType_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSportFitType(int i14) {
                this.sportFitType_ = i14;
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
            public Sport getDefaultInstanceForType() {
                return Sport.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Sport) {
                    return mergeFrom((Sport) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Sport sport) {
                if (sport == Sport.getDefaultInstance()) {
                    return this;
                }
                if (sport.hasSportFitType()) {
                    setSportFitType(sport.getSportFitType());
                }
                if (sport.hasSportFitSubType()) {
                    setSportFitSubType(sport.getSportFitSubType());
                }
                mergeUnknownFields(sport.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Sport getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Sport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Sport) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Sport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Sport parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Sport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ Sport(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Sport parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private Sport() {
            this.sportFitType_ = 0;
            this.sportFitSubType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Sport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Sport parseFrom(InputStream inputStream) {
            return (Sport) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Sport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Sport) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Sport parseFrom(CodedInputStream codedInputStream) {
            return (Sport) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Sport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Sport) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SubscribeResponse extends GeneratedMessageV3 implements SubscribeResponseOrBuilder {
        public static final int ALERT_STATUS_FIELD_NUMBER = 1;
        private static final SubscribeResponse DEFAULT_INSTANCE = new SubscribeResponse();

        @Deprecated
        public static final Parser<SubscribeResponse> PARSER = new AbstractParser<SubscribeResponse>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.1
            @Override // com.google.protobuf.Parser
            public SubscribeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SubscribeResponse.newBuilder();
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
        private List<AlertStatusMessage> alertStatus_;
        private byte memoizedIsInitialized;

        public interface AlertStatusMessageOrBuilder extends MessageOrBuilder {
            AlertStatusMessage.Status getSubscribeStatus();

            AlertMessage getType();

            AlertMessageOrBuilder getTypeOrBuilder();

            boolean hasSubscribeStatus();

            boolean hasType();
        }

        private SubscribeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.alertStatus_ = Collections.EMPTY_LIST;
        }

        public static SubscribeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeResponse_descriptor;
        }

        public static Builder newBuilder(SubscribeResponse subscribeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(subscribeResponse);
        }

        public static SubscribeResponse parseDelimitedFrom(InputStream inputStream) {
            return (SubscribeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SubscribeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SubscribeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubscribeResponse)) {
                return super.equals(obj);
            }
            SubscribeResponse subscribeResponse = (SubscribeResponse) obj;
            return getAlertStatusList().equals(subscribeResponse.getAlertStatusList()) && getUnknownFields().equals(subscribeResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponseOrBuilder
        public AlertStatusMessage getAlertStatus(int i14) {
            return this.alertStatus_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponseOrBuilder
        public int getAlertStatusCount() {
            return this.alertStatus_.size();
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponseOrBuilder
        public List<AlertStatusMessage> getAlertStatusList() {
            return this.alertStatus_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponseOrBuilder
        public AlertStatusMessageOrBuilder getAlertStatusOrBuilder(int i14) {
            return this.alertStatus_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponseOrBuilder
        public List<? extends AlertStatusMessageOrBuilder> getAlertStatusOrBuilderList() {
            return this.alertStatus_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SubscribeResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.alertStatus_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.alertStatus_.get(i15));
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
            if (getAlertStatusCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAlertStatusList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getAlertStatusCount(); i14++) {
                if (!getAlertStatus(i14).isInitialized()) {
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
            return new SubscribeResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.alertStatus_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.alertStatus_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class AlertStatusMessage extends GeneratedMessageV3 implements AlertStatusMessageOrBuilder {
            private static final AlertStatusMessage DEFAULT_INSTANCE = new AlertStatusMessage();

            @Deprecated
            public static final Parser<AlertStatusMessage> PARSER = new AbstractParser<AlertStatusMessage>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessage.1
                @Override // com.google.protobuf.Parser
                public AlertStatusMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = AlertStatusMessage.newBuilder();
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
            public static final int SUBSCRIBE_STATUS_FIELD_NUMBER = 1;
            public static final int TYPE_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int subscribeStatus_;
            private AlertMessage type_;

            private AlertStatusMessage(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.subscribeStatus_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AlertStatusMessage getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeResponse_AlertStatusMessage_descriptor;
            }

            public static Builder newBuilder(AlertStatusMessage alertStatusMessage) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(alertStatusMessage);
            }

            public static AlertStatusMessage parseDelimitedFrom(InputStream inputStream) {
                return (AlertStatusMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AlertStatusMessage parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<AlertStatusMessage> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AlertStatusMessage)) {
                    return super.equals(obj);
                }
                AlertStatusMessage alertStatusMessage = (AlertStatusMessage) obj;
                if (hasSubscribeStatus() != alertStatusMessage.hasSubscribeStatus()) {
                    return false;
                }
                if ((!hasSubscribeStatus() || this.subscribeStatus_ == alertStatusMessage.subscribeStatus_) && hasType() == alertStatusMessage.hasType()) {
                    return (!hasType() || getType().equals(alertStatusMessage.getType())) && getUnknownFields().equals(alertStatusMessage.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<AlertStatusMessage> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.subscribeStatus_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getType());
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessageOrBuilder
            public Status getSubscribeStatus() {
                Status statusForNumber = Status.forNumber(this.subscribeStatus_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessageOrBuilder
            public AlertMessage getType() {
                AlertMessage alertMessage = this.type_;
                return alertMessage == null ? AlertMessage.getDefaultInstance() : alertMessage;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessageOrBuilder
            public AlertMessageOrBuilder getTypeOrBuilder() {
                AlertMessage alertMessage = this.type_;
                return alertMessage == null ? AlertMessage.getDefaultInstance() : alertMessage;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessageOrBuilder
            public boolean hasSubscribeStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessageOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasSubscribeStatus()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + this.subscribeStatus_;
                }
                if (hasType()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + getType().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeResponse_AlertStatusMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertStatusMessage.class, Builder.class);
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
                if (hasSubscribeStatus()) {
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
                return new AlertStatusMessage();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeEnum(1, this.subscribeStatus_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeMessage(2, getType());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertStatusMessageOrBuilder {
                private int bitField0_;
                private int subscribeStatus_;
                private SingleFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> typeBuilder_;
                private AlertMessage type_;

                private Builder() {
                    this.subscribeStatus_ = 0;
                    maybeForceBuilderInitialization();
                }

                private void buildPartial0(AlertStatusMessage alertStatusMessage) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        alertStatusMessage.subscribeStatus_ = this.subscribeStatus_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        SingleFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> singleFieldBuilderV3 = this.typeBuilder_;
                        alertStatusMessage.type_ = singleFieldBuilderV3 == null ? this.type_ : (AlertMessage) singleFieldBuilderV3.build();
                        i14 |= 2;
                    }
                    alertStatusMessage.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeResponse_AlertStatusMessage_descriptor;
                }

                private SingleFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> getTypeFieldBuilder() {
                    if (this.typeBuilder_ == null) {
                        this.typeBuilder_ = new SingleFieldBuilderV3<>(getType(), getParentForChildren(), isClean());
                        this.type_ = null;
                    }
                    return this.typeBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getTypeFieldBuilder();
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public AlertStatusMessage build() {
                    AlertStatusMessage alertStatusMessageBuildPartial = buildPartial();
                    if (alertStatusMessageBuildPartial.isInitialized()) {
                        return alertStatusMessageBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) alertStatusMessageBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public AlertStatusMessage buildPartial() {
                    AlertStatusMessage alertStatusMessage = new AlertStatusMessage(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(alertStatusMessage);
                    }
                    onBuilt();
                    return alertStatusMessage;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.subscribeStatus_ = 0;
                    this.type_ = null;
                    SingleFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> singleFieldBuilderV3 = this.typeBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.typeBuilder_ = null;
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

                public Builder clearSubscribeStatus() {
                    this.bitField0_ &= -2;
                    this.subscribeStatus_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearType() {
                    this.bitField0_ &= -3;
                    this.type_ = null;
                    SingleFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> singleFieldBuilderV3 = this.typeBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.typeBuilder_ = null;
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
                    return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeResponse_AlertStatusMessage_descriptor;
                }

                @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessageOrBuilder
                public Status getSubscribeStatus() {
                    Status statusForNumber = Status.forNumber(this.subscribeStatus_);
                    return statusForNumber == null ? Status.SUCCESS : statusForNumber;
                }

                @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessageOrBuilder
                public AlertMessage getType() {
                    SingleFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> singleFieldBuilderV3 = this.typeBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (AlertMessage) singleFieldBuilderV3.getMessage();
                    }
                    AlertMessage alertMessage = this.type_;
                    return alertMessage == null ? AlertMessage.getDefaultInstance() : alertMessage;
                }

                public AlertMessage.Builder getTypeBuilder() {
                    this.bitField0_ |= 2;
                    onChanged();
                    return (AlertMessage.Builder) getTypeFieldBuilder().getBuilder();
                }

                @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessageOrBuilder
                public AlertMessageOrBuilder getTypeOrBuilder() {
                    SingleFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> singleFieldBuilderV3 = this.typeBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (AlertMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    AlertMessage alertMessage = this.type_;
                    return alertMessage == null ? AlertMessage.getDefaultInstance() : alertMessage;
                }

                @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessageOrBuilder
                public boolean hasSubscribeStatus() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessageOrBuilder
                public boolean hasType() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeResponse_AlertStatusMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertStatusMessage.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasSubscribeStatus();
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
                                            this.subscribeStatus_ = i14;
                                            this.bitField0_ |= 1;
                                        }
                                    } else if (tag == 18) {
                                        codedInputStream.readMessage(getTypeFieldBuilder().getBuilder(), extensionRegistryLite);
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

                public Builder mergeType(AlertMessage alertMessage) {
                    AlertMessage alertMessage2;
                    SingleFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> singleFieldBuilderV3 = this.typeBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(alertMessage);
                    } else if ((this.bitField0_ & 2) == 0 || (alertMessage2 = this.type_) == null || alertMessage2 == AlertMessage.getDefaultInstance()) {
                        this.type_ = alertMessage;
                    } else {
                        getTypeBuilder().mergeFrom(alertMessage);
                    }
                    if (this.type_ != null) {
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

                public Builder setSubscribeStatus(Status status) {
                    status.getClass();
                    this.bitField0_ |= 1;
                    this.subscribeStatus_ = status.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setType(AlertMessage.Builder builder) {
                    SingleFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> singleFieldBuilderV3 = this.typeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.type_ = builder.build();
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
                public AlertStatusMessage getDefaultInstanceForType() {
                    return AlertStatusMessage.getDefaultInstance();
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.subscribeStatus_ = 0;
                    maybeForceBuilderInitialization();
                }

                public Builder setType(AlertMessage alertMessage) {
                    SingleFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> singleFieldBuilderV3 = this.typeBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        alertMessage.getClass();
                        this.type_ = alertMessage;
                    } else {
                        singleFieldBuilderV3.setMessage(alertMessage);
                    }
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof AlertStatusMessage) {
                        return mergeFrom((AlertStatusMessage) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AlertStatusMessage alertStatusMessage) {
                    if (alertStatusMessage == AlertStatusMessage.getDefaultInstance()) {
                        return this;
                    }
                    if (alertStatusMessage.hasSubscribeStatus()) {
                        setSubscribeStatus(alertStatusMessage.getSubscribeStatus());
                    }
                    if (alertStatusMessage.hasType()) {
                        mergeType(alertStatusMessage.getType());
                    }
                    mergeUnknownFields(alertStatusMessage.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlertStatusMessage getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static AlertStatusMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AlertStatusMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static AlertStatusMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public /* synthetic */ AlertStatusMessage(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }

            public static AlertStatusMessage parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            private AlertStatusMessage() {
                this.memoizedIsInitialized = (byte) -1;
                this.subscribeStatus_ = 0;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AlertStatusMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static AlertStatusMessage parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static AlertStatusMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static AlertStatusMessage parseFrom(InputStream inputStream) {
                return (AlertStatusMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static AlertStatusMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AlertStatusMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static AlertStatusMessage parseFrom(CodedInputStream codedInputStream) {
                return (AlertStatusMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static AlertStatusMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AlertStatusMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public enum Status implements ProtocolMessageEnum {
                SUCCESS(0),
                FAIL(1);

                public static final int FAIL_VALUE = 1;
                public static final int SUCCESS_VALUE = 0;
                private final int value;
                private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponse.AlertStatusMessage.Status.1
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
                    return FAIL;
                }

                public static final Descriptors.EnumDescriptor getDescriptor() {
                    return AlertStatusMessage.getDescriptor().getEnumTypes().get(0);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SubscribeResponseOrBuilder {
            private RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> alertStatusBuilder_;
            private List<AlertStatusMessage> alertStatus_;
            private int bitField0_;

            private Builder() {
                this.alertStatus_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SubscribeResponse subscribeResponse) {
            }

            private void buildPartialRepeatedFields(SubscribeResponse subscribeResponse) {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    subscribeResponse.alertStatus_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.alertStatus_ = Collections.unmodifiableList(this.alertStatus_);
                    this.bitField0_ &= -2;
                }
                subscribeResponse.alertStatus_ = this.alertStatus_;
            }

            private void ensureAlertStatusIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.alertStatus_ = new ArrayList(this.alertStatus_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> getAlertStatusFieldBuilder() {
                if (this.alertStatusBuilder_ == null) {
                    this.alertStatusBuilder_ = new RepeatedFieldBuilderV3<>(this.alertStatus_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.alertStatus_ = null;
                }
                return this.alertStatusBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeResponse_descriptor;
            }

            public Builder addAlertStatus(AlertStatusMessage.Builder builder) {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureAlertStatusIsMutable();
                this.alertStatus_.add(builder.build());
                onChanged();
                return this;
            }

            public AlertStatusMessage.Builder addAlertStatusBuilder() {
                return (AlertStatusMessage.Builder) getAlertStatusFieldBuilder().addBuilder(AlertStatusMessage.getDefaultInstance());
            }

            public Builder addAllAlertStatus(Iterable<? extends AlertStatusMessage> iterable) {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureAlertStatusIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.alertStatus_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeResponse build() {
                SubscribeResponse subscribeResponseBuildPartial = buildPartial();
                if (subscribeResponseBuildPartial.isInitialized()) {
                    return subscribeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) subscribeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeResponse buildPartial() {
                SubscribeResponse subscribeResponse = new SubscribeResponse(this);
                buildPartialRepeatedFields(subscribeResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(subscribeResponse);
                }
                onBuilt();
                return subscribeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.alertStatus_ = Collections.EMPTY_LIST;
                } else {
                    this.alertStatus_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearAlertStatus() {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.alertStatus_ = Collections.EMPTY_LIST;
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

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponseOrBuilder
            public AlertStatusMessage getAlertStatus(int i14) {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                return repeatedFieldBuilderV3 == null ? this.alertStatus_.get(i14) : (AlertStatusMessage) repeatedFieldBuilderV3.getMessage(i14);
            }

            public AlertStatusMessage.Builder getAlertStatusBuilder(int i14) {
                return (AlertStatusMessage.Builder) getAlertStatusFieldBuilder().getBuilder(i14);
            }

            public List<AlertStatusMessage.Builder> getAlertStatusBuilderList() {
                return getAlertStatusFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponseOrBuilder
            public int getAlertStatusCount() {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                return repeatedFieldBuilderV3 == null ? this.alertStatus_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponseOrBuilder
            public List<AlertStatusMessage> getAlertStatusList() {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.alertStatus_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponseOrBuilder
            public AlertStatusMessageOrBuilder getAlertStatusOrBuilder(int i14) {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                return repeatedFieldBuilderV3 == null ? this.alertStatus_.get(i14) : (AlertStatusMessageOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeResponseOrBuilder
            public List<? extends AlertStatusMessageOrBuilder> getAlertStatusOrBuilderList() {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.alertStatus_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getAlertStatusCount(); i14++) {
                    if (!getAlertStatus(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(SubscribeResponse subscribeResponse) {
                if (subscribeResponse == SubscribeResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.alertStatusBuilder_ == null) {
                    if (!subscribeResponse.alertStatus_.isEmpty()) {
                        if (this.alertStatus_.isEmpty()) {
                            this.alertStatus_ = subscribeResponse.alertStatus_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureAlertStatusIsMutable();
                            this.alertStatus_.addAll(subscribeResponse.alertStatus_);
                        }
                        onChanged();
                    }
                } else if (!subscribeResponse.alertStatus_.isEmpty()) {
                    boolean zIsEmpty = this.alertStatusBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.alertStatusBuilder_ = null;
                        this.alertStatus_ = subscribeResponse.alertStatus_;
                        this.bitField0_ &= -2;
                        this.alertStatusBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAlertStatusFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(subscribeResponse.alertStatus_);
                    }
                }
                mergeUnknownFields(subscribeResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeAlertStatus(int i14) {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureAlertStatusIsMutable();
                this.alertStatus_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setAlertStatus(int i14, AlertStatusMessage.Builder builder) {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureAlertStatusIsMutable();
                this.alertStatus_.set(i14, builder.build());
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
            public SubscribeResponse getDefaultInstanceForType() {
                return SubscribeResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.alertStatus_ = Collections.EMPTY_LIST;
            }

            public AlertStatusMessage.Builder addAlertStatusBuilder(int i14) {
                return (AlertStatusMessage.Builder) getAlertStatusFieldBuilder().addBuilder(i14, AlertStatusMessage.getDefaultInstance());
            }

            public Builder addAlertStatus(int i14, AlertStatusMessage alertStatusMessage) {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    alertStatusMessage.getClass();
                    ensureAlertStatusIsMutable();
                    this.alertStatus_.add(i14, alertStatusMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, alertStatusMessage);
                return this;
            }

            public Builder setAlertStatus(int i14, AlertStatusMessage alertStatusMessage) {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    alertStatusMessage.getClass();
                    ensureAlertStatusIsMutable();
                    this.alertStatus_.set(i14, alertStatusMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, alertStatusMessage);
                return this;
            }

            public Builder addAlertStatus(AlertStatusMessage alertStatusMessage) {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    alertStatusMessage.getClass();
                    ensureAlertStatusIsMutable();
                    this.alertStatus_.add(alertStatusMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(alertStatusMessage);
                return this;
            }

            public Builder addAlertStatus(int i14, AlertStatusMessage.Builder builder) {
                RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAlertStatusIsMutable();
                    this.alertStatus_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SubscribeResponse) {
                    return mergeFrom((SubscribeResponse) message);
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
                                    AlertStatusMessage alertStatusMessage = (AlertStatusMessage) codedInputStream.readMessage(AlertStatusMessage.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<AlertStatusMessage, AlertStatusMessage.Builder, AlertStatusMessageOrBuilder> repeatedFieldBuilderV3 = this.alertStatusBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureAlertStatusIsMutable();
                                        this.alertStatus_.add(alertStatusMessage);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(alertStatusMessage);
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
        public SubscribeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SubscribeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SubscribeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SubscribeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SubscribeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SubscribeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SubscribeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(InputStream inputStream) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SubscribeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(CodedInputStream codedInputStream) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SubscribeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ActivityAlertDetails extends GeneratedMessageV3 implements ActivityAlertDetailsOrBuilder {
        public static final int AVERAGE_PACE_FIELD_NUMBER = 4;
        public static final int EST_FINISH_TIME_FIELD_NUMBER = 6;
        public static final int INTERVAL_DIST_FIELD_NUMBER = 12;
        public static final int INTERVAL_TIME_FIELD_NUMBER = 13;
        public static final int LAP_NUMBER_FIELD_NUMBER = 7;
        public static final int LAP_TIME_FIELD_NUMBER = 3;
        public static final int LAST_SPORT_TYPE_FIELD_NUMBER = 11;
        public static final int LOCAL_TIME_FIELD_NUMBER = 10;
        public static final int SESSION_DIST_FIELD_NUMBER = 8;
        public static final int SESSION_TIME_FIELD_NUMBER = 9;
        public static final int SPORT_TYPE_FIELD_NUMBER = 5;
        public static final int TOTAL_DISTANCE_FIELD_NUMBER = 1;
        public static final int TOTAL_TIME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int averagePace_;
        private int bitField0_;
        private int estFinishTime_;
        private int intervalDist_;
        private int intervalTime_;
        private int lapNumber_;
        private int lapTime_;
        private Sport lastSportType_;
        private int localTime_;
        private byte memoizedIsInitialized;
        private int sessionDist_;
        private int sessionTime_;
        private Sport sportType_;
        private int totalDistance_;
        private int totalTime_;
        private static final ActivityAlertDetails DEFAULT_INSTANCE = new ActivityAlertDetails();

        @Deprecated
        public static final Parser<ActivityAlertDetails> PARSER = new AbstractParser<ActivityAlertDetails>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetails.1
            @Override // com.google.protobuf.Parser
            public ActivityAlertDetails parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ActivityAlertDetails.newBuilder();
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

        private ActivityAlertDetails(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.totalDistance_ = 0;
            this.totalTime_ = 0;
            this.lapTime_ = 0;
            this.averagePace_ = 0;
            this.estFinishTime_ = 0;
            this.lapNumber_ = 0;
            this.sessionDist_ = 0;
            this.sessionTime_ = 0;
            this.localTime_ = 0;
            this.intervalDist_ = 0;
            this.intervalTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActivityAlertDetails getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_ActivityAlertDetails_descriptor;
        }

        public static Builder newBuilder(ActivityAlertDetails activityAlertDetails) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(activityAlertDetails);
        }

        public static ActivityAlertDetails parseDelimitedFrom(InputStream inputStream) {
            return (ActivityAlertDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActivityAlertDetails parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ActivityAlertDetails> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityAlertDetails)) {
                return super.equals(obj);
            }
            ActivityAlertDetails activityAlertDetails = (ActivityAlertDetails) obj;
            if (hasTotalDistance() != activityAlertDetails.hasTotalDistance()) {
                return false;
            }
            if ((hasTotalDistance() && getTotalDistance() != activityAlertDetails.getTotalDistance()) || hasTotalTime() != activityAlertDetails.hasTotalTime()) {
                return false;
            }
            if ((hasTotalTime() && getTotalTime() != activityAlertDetails.getTotalTime()) || hasLapTime() != activityAlertDetails.hasLapTime()) {
                return false;
            }
            if ((hasLapTime() && getLapTime() != activityAlertDetails.getLapTime()) || hasAveragePace() != activityAlertDetails.hasAveragePace()) {
                return false;
            }
            if ((hasAveragePace() && getAveragePace() != activityAlertDetails.getAveragePace()) || hasSportType() != activityAlertDetails.hasSportType()) {
                return false;
            }
            if ((hasSportType() && !getSportType().equals(activityAlertDetails.getSportType())) || hasEstFinishTime() != activityAlertDetails.hasEstFinishTime()) {
                return false;
            }
            if ((hasEstFinishTime() && getEstFinishTime() != activityAlertDetails.getEstFinishTime()) || hasLapNumber() != activityAlertDetails.hasLapNumber()) {
                return false;
            }
            if ((hasLapNumber() && getLapNumber() != activityAlertDetails.getLapNumber()) || hasSessionDist() != activityAlertDetails.hasSessionDist()) {
                return false;
            }
            if ((hasSessionDist() && getSessionDist() != activityAlertDetails.getSessionDist()) || hasSessionTime() != activityAlertDetails.hasSessionTime()) {
                return false;
            }
            if ((hasSessionTime() && getSessionTime() != activityAlertDetails.getSessionTime()) || hasLocalTime() != activityAlertDetails.hasLocalTime()) {
                return false;
            }
            if ((hasLocalTime() && getLocalTime() != activityAlertDetails.getLocalTime()) || hasLastSportType() != activityAlertDetails.hasLastSportType()) {
                return false;
            }
            if ((hasLastSportType() && !getLastSportType().equals(activityAlertDetails.getLastSportType())) || hasIntervalDist() != activityAlertDetails.hasIntervalDist()) {
                return false;
            }
            if ((!hasIntervalDist() || getIntervalDist() == activityAlertDetails.getIntervalDist()) && hasIntervalTime() == activityAlertDetails.hasIntervalTime()) {
                return (!hasIntervalTime() || getIntervalTime() == activityAlertDetails.getIntervalTime()) && getUnknownFields().equals(activityAlertDetails.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public int getAveragePace() {
            return this.averagePace_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public int getEstFinishTime() {
            return this.estFinishTime_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public int getIntervalDist() {
            return this.intervalDist_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public int getIntervalTime() {
            return this.intervalTime_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public int getLapNumber() {
            return this.lapNumber_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public int getLapTime() {
            return this.lapTime_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public Sport getLastSportType() {
            Sport sport = this.lastSportType_;
            return sport == null ? Sport.getDefaultInstance() : sport;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public SportOrBuilder getLastSportTypeOrBuilder() {
            Sport sport = this.lastSportType_;
            return sport == null ? Sport.getDefaultInstance() : sport;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public int getLocalTime() {
            return this.localTime_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActivityAlertDetails> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.totalDistance_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.totalTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.lapTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.averagePace_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(5, getSportType());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.estFinishTime_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(7, this.lapNumber_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(8, this.sessionDist_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(9, this.sessionTime_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(10, this.localTime_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(11, getLastSportType());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(12, this.intervalDist_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(13, this.intervalTime_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public int getSessionDist() {
            return this.sessionDist_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public int getSessionTime() {
            return this.sessionTime_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public Sport getSportType() {
            Sport sport = this.sportType_;
            return sport == null ? Sport.getDefaultInstance() : sport;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public SportOrBuilder getSportTypeOrBuilder() {
            Sport sport = this.sportType_;
            return sport == null ? Sport.getDefaultInstance() : sport;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public int getTotalDistance() {
            return this.totalDistance_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public int getTotalTime() {
            return this.totalTime_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasAveragePace() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasEstFinishTime() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasIntervalDist() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasIntervalTime() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasLapNumber() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasLapTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasLastSportType() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasLocalTime() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasSessionDist() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasSessionTime() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasSportType() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasTotalDistance() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
        public boolean hasTotalTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTotalDistance()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTotalDistance();
            }
            if (hasTotalTime()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTotalTime();
            }
            if (hasLapTime()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getLapTime();
            }
            if (hasAveragePace()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getAveragePace();
            }
            if (hasSportType()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSportType().hashCode();
            }
            if (hasEstFinishTime()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getEstFinishTime();
            }
            if (hasLapNumber()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getLapNumber();
            }
            if (hasSessionDist()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getSessionDist();
            }
            if (hasSessionTime()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getSessionTime();
            }
            if (hasLocalTime()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getLocalTime();
            }
            if (hasLastSportType()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getLastSportType().hashCode();
            }
            if (hasIntervalDist()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getIntervalDist();
            }
            if (hasIntervalTime()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getIntervalTime();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_ActivityAlertDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityAlertDetails.class, Builder.class);
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
            if (hasSportType() && !getSportType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLastSportType() || getLastSportType().isInitialized()) {
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
            return new ActivityAlertDetails();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.totalDistance_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.totalTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.lapTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.averagePace_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSportType());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.estFinishTime_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.lapNumber_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.sessionDist_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt32(9, this.sessionTime_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(10, this.localTime_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getLastSportType());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeUInt32(12, this.intervalDist_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeUInt32(13, this.intervalTime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActivityAlertDetailsOrBuilder {
            private int averagePace_;
            private int bitField0_;
            private int estFinishTime_;
            private int intervalDist_;
            private int intervalTime_;
            private int lapNumber_;
            private int lapTime_;
            private SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> lastSportTypeBuilder_;
            private Sport lastSportType_;
            private int localTime_;
            private int sessionDist_;
            private int sessionTime_;
            private SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> sportTypeBuilder_;
            private Sport sportType_;
            private int totalDistance_;
            private int totalTime_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ActivityAlertDetails activityAlertDetails) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    activityAlertDetails.totalDistance_ = this.totalDistance_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    activityAlertDetails.totalTime_ = this.totalTime_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    activityAlertDetails.lapTime_ = this.lapTime_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    activityAlertDetails.averagePace_ = this.averagePace_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.sportTypeBuilder_;
                    activityAlertDetails.sportType_ = singleFieldBuilderV3 == null ? this.sportType_ : (Sport) singleFieldBuilderV3.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    activityAlertDetails.estFinishTime_ = this.estFinishTime_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    activityAlertDetails.lapNumber_ = this.lapNumber_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    activityAlertDetails.sessionDist_ = this.sessionDist_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    activityAlertDetails.sessionTime_ = this.sessionTime_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    activityAlertDetails.localTime_ = this.localTime_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV4 = this.lastSportTypeBuilder_;
                    activityAlertDetails.lastSportType_ = singleFieldBuilderV4 == null ? this.lastSportType_ : (Sport) singleFieldBuilderV4.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    activityAlertDetails.intervalDist_ = this.intervalDist_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    activityAlertDetails.intervalTime_ = this.intervalTime_;
                    i14 |= 4096;
                }
                activityAlertDetails.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_ActivityAlertDetails_descriptor;
            }

            private SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> getLastSportTypeFieldBuilder() {
                if (this.lastSportTypeBuilder_ == null) {
                    this.lastSportTypeBuilder_ = new SingleFieldBuilderV3<>(getLastSportType(), getParentForChildren(), isClean());
                    this.lastSportType_ = null;
                }
                return this.lastSportTypeBuilder_;
            }

            private SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> getSportTypeFieldBuilder() {
                if (this.sportTypeBuilder_ == null) {
                    this.sportTypeBuilder_ = new SingleFieldBuilderV3<>(getSportType(), getParentForChildren(), isClean());
                    this.sportType_ = null;
                }
                return this.sportTypeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSportTypeFieldBuilder();
                    getLastSportTypeFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActivityAlertDetails build() {
                ActivityAlertDetails activityAlertDetailsBuildPartial = buildPartial();
                if (activityAlertDetailsBuildPartial.isInitialized()) {
                    return activityAlertDetailsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) activityAlertDetailsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActivityAlertDetails buildPartial() {
                ActivityAlertDetails activityAlertDetails = new ActivityAlertDetails(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(activityAlertDetails);
                }
                onBuilt();
                return activityAlertDetails;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.totalDistance_ = 0;
                this.totalTime_ = 0;
                this.lapTime_ = 0;
                this.averagePace_ = 0;
                this.sportType_ = null;
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.sportTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sportTypeBuilder_ = null;
                }
                this.estFinishTime_ = 0;
                this.lapNumber_ = 0;
                this.sessionDist_ = 0;
                this.sessionTime_ = 0;
                this.localTime_ = 0;
                this.lastSportType_ = null;
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV4 = this.lastSportTypeBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.lastSportTypeBuilder_ = null;
                }
                this.intervalDist_ = 0;
                this.intervalTime_ = 0;
                return this;
            }

            public Builder clearAveragePace() {
                this.bitField0_ &= -9;
                this.averagePace_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEstFinishTime() {
                this.bitField0_ &= -33;
                this.estFinishTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIntervalDist() {
                this.bitField0_ &= -2049;
                this.intervalDist_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIntervalTime() {
                this.bitField0_ &= -4097;
                this.intervalTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLapNumber() {
                this.bitField0_ &= -65;
                this.lapNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLapTime() {
                this.bitField0_ &= -5;
                this.lapTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLastSportType() {
                this.bitField0_ &= -1025;
                this.lastSportType_ = null;
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.lastSportTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lastSportTypeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLocalTime() {
                this.bitField0_ &= -513;
                this.localTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionDist() {
                this.bitField0_ &= -129;
                this.sessionDist_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSessionTime() {
                this.bitField0_ &= -257;
                this.sessionTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSportType() {
                this.bitField0_ &= -17;
                this.sportType_ = null;
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.sportTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sportTypeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTotalDistance() {
                this.bitField0_ &= -2;
                this.totalDistance_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTotalTime() {
                this.bitField0_ &= -3;
                this.totalTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public int getAveragePace() {
                return this.averagePace_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_ActivityAlertDetails_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public int getEstFinishTime() {
                return this.estFinishTime_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public int getIntervalDist() {
                return this.intervalDist_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public int getIntervalTime() {
                return this.intervalTime_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public int getLapNumber() {
                return this.lapNumber_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public int getLapTime() {
                return this.lapTime_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public Sport getLastSportType() {
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.lastSportTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Sport) singleFieldBuilderV3.getMessage();
                }
                Sport sport = this.lastSportType_;
                return sport == null ? Sport.getDefaultInstance() : sport;
            }

            public Sport.Builder getLastSportTypeBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (Sport.Builder) getLastSportTypeFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public SportOrBuilder getLastSportTypeOrBuilder() {
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.lastSportTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SportOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Sport sport = this.lastSportType_;
                return sport == null ? Sport.getDefaultInstance() : sport;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public int getLocalTime() {
                return this.localTime_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public int getSessionDist() {
                return this.sessionDist_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public int getSessionTime() {
                return this.sessionTime_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public Sport getSportType() {
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.sportTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Sport) singleFieldBuilderV3.getMessage();
                }
                Sport sport = this.sportType_;
                return sport == null ? Sport.getDefaultInstance() : sport;
            }

            public Sport.Builder getSportTypeBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (Sport.Builder) getSportTypeFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public SportOrBuilder getSportTypeOrBuilder() {
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.sportTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SportOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Sport sport = this.sportType_;
                return sport == null ? Sport.getDefaultInstance() : sport;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public int getTotalDistance() {
                return this.totalDistance_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public int getTotalTime() {
                return this.totalTime_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasAveragePace() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasEstFinishTime() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasIntervalDist() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasIntervalTime() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasLapNumber() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasLapTime() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasLastSportType() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasLocalTime() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasSessionDist() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasSessionTime() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasSportType() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasTotalDistance() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.ActivityAlertDetailsOrBuilder
            public boolean hasTotalTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_ActivityAlertDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityAlertDetails.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasSportType() || getSportType().isInitialized()) {
                    return !hasLastSportType() || getLastSportType().isInitialized();
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.totalDistance_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.totalTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.lapTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.averagePace_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getSportTypeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.estFinishTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.lapNumber_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.sessionDist_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    this.sessionTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.localTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getLastSportTypeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 96:
                                    this.intervalDist_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 104:
                                    this.intervalTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4096;
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

            public Builder mergeLastSportType(Sport sport) {
                Sport sport2;
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.lastSportTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sport);
                } else if ((this.bitField0_ & 1024) == 0 || (sport2 = this.lastSportType_) == null || sport2 == Sport.getDefaultInstance()) {
                    this.lastSportType_ = sport;
                } else {
                    getLastSportTypeBuilder().mergeFrom(sport);
                }
                if (this.lastSportType_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSportType(Sport sport) {
                Sport sport2;
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.sportTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sport);
                } else if ((this.bitField0_ & 16) == 0 || (sport2 = this.sportType_) == null || sport2 == Sport.getDefaultInstance()) {
                    this.sportType_ = sport;
                } else {
                    getSportTypeBuilder().mergeFrom(sport);
                }
                if (this.sportType_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAveragePace(int i14) {
                this.averagePace_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEstFinishTime(int i14) {
                this.estFinishTime_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIntervalDist(int i14) {
                this.intervalDist_ = i14;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setIntervalTime(int i14) {
                this.intervalTime_ = i14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setLapNumber(int i14) {
                this.lapNumber_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setLapTime(int i14) {
                this.lapTime_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLastSportType(Sport.Builder builder) {
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.lastSportTypeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lastSportType_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setLocalTime(int i14) {
                this.localTime_ = i14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionDist(int i14) {
                this.sessionDist_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSessionTime(int i14) {
                this.sessionTime_ = i14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSportType(Sport.Builder builder) {
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.sportTypeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sportType_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTotalDistance(int i14) {
                this.totalDistance_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTotalTime(int i14) {
                this.totalTime_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActivityAlertDetails getDefaultInstanceForType() {
                return ActivityAlertDetails.getDefaultInstance();
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

            public Builder setLastSportType(Sport sport) {
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.lastSportTypeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sport.getClass();
                    this.lastSportType_ = sport;
                } else {
                    singleFieldBuilderV3.setMessage(sport);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setSportType(Sport sport) {
                SingleFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> singleFieldBuilderV3 = this.sportTypeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sport.getClass();
                    this.sportType_ = sport;
                } else {
                    singleFieldBuilderV3.setMessage(sport);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActivityAlertDetails) {
                    return mergeFrom((ActivityAlertDetails) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActivityAlertDetails activityAlertDetails) {
                if (activityAlertDetails == ActivityAlertDetails.getDefaultInstance()) {
                    return this;
                }
                if (activityAlertDetails.hasTotalDistance()) {
                    setTotalDistance(activityAlertDetails.getTotalDistance());
                }
                if (activityAlertDetails.hasTotalTime()) {
                    setTotalTime(activityAlertDetails.getTotalTime());
                }
                if (activityAlertDetails.hasLapTime()) {
                    setLapTime(activityAlertDetails.getLapTime());
                }
                if (activityAlertDetails.hasAveragePace()) {
                    setAveragePace(activityAlertDetails.getAveragePace());
                }
                if (activityAlertDetails.hasSportType()) {
                    mergeSportType(activityAlertDetails.getSportType());
                }
                if (activityAlertDetails.hasEstFinishTime()) {
                    setEstFinishTime(activityAlertDetails.getEstFinishTime());
                }
                if (activityAlertDetails.hasLapNumber()) {
                    setLapNumber(activityAlertDetails.getLapNumber());
                }
                if (activityAlertDetails.hasSessionDist()) {
                    setSessionDist(activityAlertDetails.getSessionDist());
                }
                if (activityAlertDetails.hasSessionTime()) {
                    setSessionTime(activityAlertDetails.getSessionTime());
                }
                if (activityAlertDetails.hasLocalTime()) {
                    setLocalTime(activityAlertDetails.getLocalTime());
                }
                if (activityAlertDetails.hasLastSportType()) {
                    mergeLastSportType(activityAlertDetails.getLastSportType());
                }
                if (activityAlertDetails.hasIntervalDist()) {
                    setIntervalDist(activityAlertDetails.getIntervalDist());
                }
                if (activityAlertDetails.hasIntervalTime()) {
                    setIntervalTime(activityAlertDetails.getIntervalTime());
                }
                mergeUnknownFields(activityAlertDetails.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActivityAlertDetails getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ActivityAlertDetails parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityAlertDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActivityAlertDetails parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ActivityAlertDetails parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActivityAlertDetails parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ActivityAlertDetails parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ActivityAlertDetails parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ActivityAlertDetails parseFrom(InputStream inputStream) {
            return (ActivityAlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ActivityAlertDetails parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityAlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActivityAlertDetails parseFrom(CodedInputStream codedInputStream) {
            return (ActivityAlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActivityAlertDetails parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityAlertDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ ActivityAlertDetails(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ActivityAlertDetails() {
            this.totalDistance_ = 0;
            this.totalTime_ = 0;
            this.lapTime_ = 0;
            this.averagePace_ = 0;
            this.estFinishTime_ = 0;
            this.lapNumber_ = 0;
            this.sessionDist_ = 0;
            this.sessionTime_ = 0;
            this.localTime_ = 0;
            this.intervalDist_ = 0;
            this.intervalTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class AlertMessage extends GeneratedMessageV3 implements AlertMessageOrBuilder {
        public static final int INTERVAL_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int interval_;
        private byte memoizedIsInitialized;
        private int type_;
        private static final AlertMessage DEFAULT_INSTANCE = new AlertMessage();

        @Deprecated
        public static final Parser<AlertMessage> PARSER = new AbstractParser<AlertMessage>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.AlertMessage.1
            @Override // com.google.protobuf.Parser
            public AlertMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlertMessage.newBuilder();
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

        private AlertMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.type_ = 0;
            this.interval_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlertMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertMessage_descriptor;
        }

        public static Builder newBuilder(AlertMessage alertMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alertMessage);
        }

        public static AlertMessage parseDelimitedFrom(InputStream inputStream) {
            return (AlertMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlertMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlertMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlertMessage)) {
                return super.equals(obj);
            }
            AlertMessage alertMessage = (AlertMessage) obj;
            if (hasType() != alertMessage.hasType()) {
                return false;
            }
            if ((!hasType() || this.type_ == alertMessage.type_) && hasInterval() == alertMessage.hasInterval()) {
                return (!hasInterval() || getInterval() == alertMessage.getInterval()) && getUnknownFields().equals(alertMessage.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertMessageOrBuilder
        public int getInterval() {
            return this.interval_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlertMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.interval_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertMessageOrBuilder
        public AlertType getType() {
            AlertType alertTypeForNumber = AlertType.forNumber(this.type_);
            return alertTypeForNumber == null ? AlertType.ACTIVITY_START : alertTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertMessageOrBuilder
        public boolean hasInterval() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertMessageOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.type_;
            }
            if (hasInterval()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getInterval();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertMessage.class, Builder.class);
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
            return new AlertMessage();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.interval_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertMessageOrBuilder {
            private int bitField0_;
            private int interval_;
            private int type_;

            private Builder() {
                this.type_ = 0;
            }

            private void buildPartial0(AlertMessage alertMessage) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    alertMessage.type_ = this.type_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    alertMessage.interval_ = this.interval_;
                    i14 |= 2;
                }
                alertMessage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertMessage_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertMessage build() {
                AlertMessage alertMessageBuildPartial = buildPartial();
                if (alertMessageBuildPartial.isInitialized()) {
                    return alertMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alertMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertMessage buildPartial() {
                AlertMessage alertMessage = new AlertMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(alertMessage);
                }
                onBuilt();
                return alertMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 0;
                this.interval_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInterval() {
                this.bitField0_ &= -3;
                this.interval_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
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
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertMessageOrBuilder
            public int getInterval() {
                return this.interval_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertMessageOrBuilder
            public AlertType getType() {
                AlertType alertTypeForNumber = AlertType.forNumber(this.type_);
                return alertTypeForNumber == null ? AlertType.ACTIVITY_START : alertTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertMessageOrBuilder
            public boolean hasInterval() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertMessageOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertMessage.class, Builder.class);
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
                                    if (AlertType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.type_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.interval_ = codedInputStream.readUInt32();
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

            public Builder setInterval(int i14) {
                this.interval_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setType(AlertType alertType) {
                alertType.getClass();
                this.bitField0_ |= 1;
                this.type_ = alertType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlertMessage getDefaultInstanceForType() {
                return AlertMessage.getDefaultInstance();
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
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlertMessage) {
                    return mergeFrom((AlertMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlertMessage alertMessage) {
                if (alertMessage == AlertMessage.getDefaultInstance()) {
                    return this;
                }
                if (alertMessage.hasType()) {
                    setType(alertMessage.getType());
                }
                if (alertMessage.hasInterval()) {
                    setInterval(alertMessage.getInterval());
                }
                mergeUnknownFields(alertMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlertMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AlertMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlertMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlertMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ AlertMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AlertMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private AlertMessage() {
            this.interval_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
        }

        public static AlertMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AlertMessage parseFrom(InputStream inputStream) {
            return (AlertMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AlertMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertMessage parseFrom(CodedInputStream codedInputStream) {
            return (AlertMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlertMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AlertNotification extends GeneratedMessageV3.ExtendableMessage<AlertNotification> implements AlertNotificationOrBuilder {
        public static final int ACTIVITY_DETAILS_FIELD_NUMBER = 2;
        public static final int ALERT_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private ActivityAlertDetails activityDetails_;
        private List<Integer> alertType_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private static final Internal.ListAdapter.Converter<Integer, AlertType> alertType_converter_ = new Internal.ListAdapter.Converter<Integer, AlertType>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.AlertNotification.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public AlertType convert(Integer num) {
                AlertType alertTypeForNumber = AlertType.forNumber(num.intValue());
                return alertTypeForNumber == null ? AlertType.ACTIVITY_START : alertTypeForNumber;
            }
        };
        private static final AlertNotification DEFAULT_INSTANCE = new AlertNotification();

        @Deprecated
        public static final Parser<AlertNotification> PARSER = new AbstractParser<AlertNotification>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.AlertNotification.2
            @Override // com.google.protobuf.Parser
            public AlertNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlertNotification.newBuilder();
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

        private AlertNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.alertType_ = Collections.EMPTY_LIST;
        }

        public static AlertNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertNotification_descriptor;
        }

        public static Builder newBuilder(AlertNotification alertNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alertNotification);
        }

        public static AlertNotification parseDelimitedFrom(InputStream inputStream) {
            return (AlertNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlertNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlertNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlertNotification)) {
                return super.equals(obj);
            }
            AlertNotification alertNotification = (AlertNotification) obj;
            if (this.alertType_.equals(alertNotification.alertType_) && hasActivityDetails() == alertNotification.hasActivityDetails()) {
                return (!hasActivityDetails() || getActivityDetails().equals(alertNotification.getActivityDetails())) && getUnknownFields().equals(alertNotification.getUnknownFields()) && getExtensionFields().equals(alertNotification.getExtensionFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
        public ActivityAlertDetails getActivityDetails() {
            ActivityAlertDetails activityAlertDetails = this.activityDetails_;
            return activityAlertDetails == null ? ActivityAlertDetails.getDefaultInstance() : activityAlertDetails;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
        public ActivityAlertDetailsOrBuilder getActivityDetailsOrBuilder() {
            ActivityAlertDetails activityAlertDetails = this.activityDetails_;
            return activityAlertDetails == null ? ActivityAlertDetails.getDefaultInstance() : activityAlertDetails;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
        public AlertType getAlertType(int i14) {
            return alertType_converter_.convert(this.alertType_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
        public int getAlertTypeCount() {
            return this.alertType_.size();
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
        public List<AlertType> getAlertTypeList() {
            return new Internal.ListAdapter(this.alertType_, alertType_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlertNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            List<Integer> list;
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iA = 0;
            while (true) {
                int size = this.alertType_.size();
                list = this.alertType_;
                if (i15 >= size) {
                    break;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
            int size2 = list.size() + iA;
            if ((this.bitField0_ & 1) != 0) {
                size2 += CodedOutputStream.computeMessageSize(2, getActivityDetails());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + size2;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
        public boolean hasActivityDetails() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getAlertTypeCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.alertType_.hashCode();
            }
            if (hasActivityDetails()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getActivityDetails().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (AbstractMessage.hashFields(iHashCode, getExtensionFields()) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertNotification.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (hasActivityDetails() && !getActivityDetails().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
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
            return new AlertNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            int iF = 0;
            while (iF < this.alertType_.size()) {
                iF = f3.f(this.alertType_.get(iF), codedOutputStream, 1, iF, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(2, getActivityDetails());
            }
            extensionWriterNewExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<AlertNotification, Builder> implements AlertNotificationOrBuilder {
            private SingleFieldBuilderV3<ActivityAlertDetails, ActivityAlertDetails.Builder, ActivityAlertDetailsOrBuilder> activityDetailsBuilder_;
            private ActivityAlertDetails activityDetails_;
            private List<Integer> alertType_;
            private int bitField0_;

            private Builder() {
                this.alertType_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AlertNotification alertNotification) {
                int i14;
                if ((this.bitField0_ & 2) != 0) {
                    SingleFieldBuilderV3<ActivityAlertDetails, ActivityAlertDetails.Builder, ActivityAlertDetailsOrBuilder> singleFieldBuilderV3 = this.activityDetailsBuilder_;
                    alertNotification.activityDetails_ = singleFieldBuilderV3 == null ? this.activityDetails_ : (ActivityAlertDetails) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                alertNotification.bitField0_ = i14 | alertNotification.bitField0_;
            }

            private void buildPartialRepeatedFields(AlertNotification alertNotification) {
                if ((this.bitField0_ & 1) != 0) {
                    this.alertType_ = Collections.unmodifiableList(this.alertType_);
                    this.bitField0_ &= -2;
                }
                alertNotification.alertType_ = this.alertType_;
            }

            private void ensureAlertTypeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.alertType_ = new ArrayList(this.alertType_);
                    this.bitField0_ |= 1;
                }
            }

            private SingleFieldBuilderV3<ActivityAlertDetails, ActivityAlertDetails.Builder, ActivityAlertDetailsOrBuilder> getActivityDetailsFieldBuilder() {
                if (this.activityDetailsBuilder_ == null) {
                    this.activityDetailsBuilder_ = new SingleFieldBuilderV3<>(getActivityDetails(), getParentForChildren(), isClean());
                    this.activityDetails_ = null;
                }
                return this.activityDetailsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getActivityDetailsFieldBuilder();
                }
            }

            public Builder addAlertType(AlertType alertType) {
                alertType.getClass();
                ensureAlertTypeIsMutable();
                this.alertType_.add(Integer.valueOf(alertType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addAllAlertType(Iterable<? extends AlertType> iterable) {
                ensureAlertTypeIsMutable();
                Iterator<? extends AlertType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.alertType_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder addExtension(GeneratedMessage.GeneratedExtension<AlertNotification, List<Type>> generatedExtension, Type type) {
                return (Builder) super.addExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertNotification build() {
                AlertNotification alertNotificationBuildPartial = buildPartial();
                if (alertNotificationBuildPartial.isInitialized()) {
                    return alertNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alertNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertNotification buildPartial() {
                AlertNotification alertNotification = new AlertNotification(this);
                buildPartialRepeatedFields(alertNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(alertNotification);
                }
                onBuilt();
                return alertNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.alertType_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                this.activityDetails_ = null;
                SingleFieldBuilderV3<ActivityAlertDetails, ActivityAlertDetails.Builder, ActivityAlertDetailsOrBuilder> singleFieldBuilderV3 = this.activityDetailsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.activityDetailsBuilder_ = null;
                }
                return this;
            }

            public Builder clearActivityDetails() {
                this.bitField0_ &= -3;
                this.activityDetails_ = null;
                SingleFieldBuilderV3<ActivityAlertDetails, ActivityAlertDetails.Builder, ActivityAlertDetailsOrBuilder> singleFieldBuilderV3 = this.activityDetailsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.activityDetailsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAlertType() {
                this.alertType_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <T> Builder clearExtension(GeneratedMessage.GeneratedExtension<AlertNotification, T> generatedExtension) {
                return (Builder) super.clearExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
            public ActivityAlertDetails getActivityDetails() {
                SingleFieldBuilderV3<ActivityAlertDetails, ActivityAlertDetails.Builder, ActivityAlertDetailsOrBuilder> singleFieldBuilderV3 = this.activityDetailsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActivityAlertDetails) singleFieldBuilderV3.getMessage();
                }
                ActivityAlertDetails activityAlertDetails = this.activityDetails_;
                return activityAlertDetails == null ? ActivityAlertDetails.getDefaultInstance() : activityAlertDetails;
            }

            public ActivityAlertDetails.Builder getActivityDetailsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ActivityAlertDetails.Builder) getActivityDetailsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
            public ActivityAlertDetailsOrBuilder getActivityDetailsOrBuilder() {
                SingleFieldBuilderV3<ActivityAlertDetails, ActivityAlertDetails.Builder, ActivityAlertDetailsOrBuilder> singleFieldBuilderV3 = this.activityDetailsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActivityAlertDetailsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ActivityAlertDetails activityAlertDetails = this.activityDetails_;
                return activityAlertDetails == null ? ActivityAlertDetails.getDefaultInstance() : activityAlertDetails;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
            public AlertType getAlertType(int i14) {
                return (AlertType) AlertNotification.alertType_converter_.convert(this.alertType_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
            public int getAlertTypeCount() {
                return this.alertType_.size();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
            public List<AlertType> getAlertTypeList() {
                return new Internal.ListAdapter(this.alertType_, AlertNotification.alertType_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertNotificationOrBuilder
            public boolean hasActivityDetails() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return (!hasActivityDetails() || getActivityDetails().isInitialized()) && extensionsAreInitialized();
            }

            public Builder mergeActivityDetails(ActivityAlertDetails activityAlertDetails) {
                ActivityAlertDetails activityAlertDetails2;
                SingleFieldBuilderV3<ActivityAlertDetails, ActivityAlertDetails.Builder, ActivityAlertDetailsOrBuilder> singleFieldBuilderV3 = this.activityDetailsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(activityAlertDetails);
                } else if ((this.bitField0_ & 2) == 0 || (activityAlertDetails2 = this.activityDetails_) == null || activityAlertDetails2 == ActivityAlertDetails.getDefaultInstance()) {
                    this.activityDetails_ = activityAlertDetails;
                } else {
                    getActivityDetailsBuilder().mergeFrom(activityAlertDetails);
                }
                if (this.activityDetails_ != null) {
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
                                    if (AlertType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureAlertTypeIsMutable();
                                        this.alertType_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (AlertType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureAlertTypeIsMutable();
                                            this.alertType_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getActivityDetailsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setActivityDetails(ActivityAlertDetails.Builder builder) {
                SingleFieldBuilderV3<ActivityAlertDetails, ActivityAlertDetails.Builder, ActivityAlertDetailsOrBuilder> singleFieldBuilderV3 = this.activityDetailsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.activityDetails_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAlertType(int i14, AlertType alertType) {
                alertType.getClass();
                ensureAlertTypeIsMutable();
                this.alertType_.set(i14, Integer.valueOf(alertType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<AlertNotification, Type> generatedExtension, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, Type>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlertNotification getDefaultInstanceForType() {
                return AlertNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return addExtension((GeneratedMessage.GeneratedExtension<AlertNotification, List<Object>>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<AlertNotification, Object>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, int i14, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<AlertNotification, List<Object>>) generatedExtension, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<AlertNotification, List<Type>> generatedExtension, int i14, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, i14, type);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.alertType_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder setActivityDetails(ActivityAlertDetails activityAlertDetails) {
                SingleFieldBuilderV3<ActivityAlertDetails, ActivityAlertDetails.Builder, ActivityAlertDetailsOrBuilder> singleFieldBuilderV3 = this.activityDetailsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    activityAlertDetails.getClass();
                    this.activityDetails_ = activityAlertDetails;
                } else {
                    singleFieldBuilderV3.setMessage(activityAlertDetails);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlertNotification) {
                    return mergeFrom((AlertNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlertNotification alertNotification) {
                if (alertNotification == AlertNotification.getDefaultInstance()) {
                    return this;
                }
                if (!alertNotification.alertType_.isEmpty()) {
                    if (this.alertType_.isEmpty()) {
                        this.alertType_ = alertNotification.alertType_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureAlertTypeIsMutable();
                        this.alertType_.addAll(alertNotification.alertType_);
                    }
                    onChanged();
                }
                if (alertNotification.hasActivityDetails()) {
                    mergeActivityDetails(alertNotification.getActivityDetails());
                }
                mergeExtensionFields(alertNotification);
                mergeUnknownFields(alertNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlertNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AlertNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlertNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AlertNotification(GeneratedMessageV3.ExtendableBuilder<AlertNotification, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlertNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlertNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ AlertNotification(Builder builder) {
            this((GeneratedMessageV3.ExtendableBuilder<AlertNotification, ?>) builder);
        }

        public static AlertNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AlertNotification parseFrom(InputStream inputStream) {
            return (AlertNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AlertNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertNotification parseFrom(CodedInputStream codedInputStream) {
            return (AlertNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlertNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AlertSupportResponse extends GeneratedMessageV3 implements AlertSupportResponseOrBuilder {
        public static final int SUPPORTED_ALERTS_FIELD_NUMBER = 1;
        public static final int VERSION_NUM_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<Integer> supportedAlerts_;
        private Internal.IntList versionNum_;
        private static final Internal.ListAdapter.Converter<Integer, AlertType> supportedAlerts_converter_ = new Internal.ListAdapter.Converter<Integer, AlertType>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponse.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public AlertType convert(Integer num) {
                AlertType alertTypeForNumber = AlertType.forNumber(num.intValue());
                return alertTypeForNumber == null ? AlertType.ACTIVITY_START : alertTypeForNumber;
            }
        };
        private static final AlertSupportResponse DEFAULT_INSTANCE = new AlertSupportResponse();

        @Deprecated
        public static final Parser<AlertSupportResponse> PARSER = new AbstractParser<AlertSupportResponse>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponse.2
            @Override // com.google.protobuf.Parser
            public AlertSupportResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlertSupportResponse.newBuilder();
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

        private AlertSupportResponse() {
            this.versionNum_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
            this.supportedAlerts_ = Collections.EMPTY_LIST;
            this.versionNum_ = GeneratedMessageV3.emptyIntList();
        }

        public static AlertSupportResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertSupportResponse_descriptor;
        }

        public static Builder newBuilder(AlertSupportResponse alertSupportResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alertSupportResponse);
        }

        public static AlertSupportResponse parseDelimitedFrom(InputStream inputStream) {
            return (AlertSupportResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlertSupportResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlertSupportResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlertSupportResponse)) {
                return super.equals(obj);
            }
            AlertSupportResponse alertSupportResponse = (AlertSupportResponse) obj;
            return this.supportedAlerts_.equals(alertSupportResponse.supportedAlerts_) && getVersionNumList().equals(alertSupportResponse.getVersionNumList()) && getUnknownFields().equals(alertSupportResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlertSupportResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            List<Integer> list;
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iA = 0;
            while (true) {
                int size = this.supportedAlerts_.size();
                list = this.supportedAlerts_;
                if (i15 >= size) {
                    break;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
            int size2 = list.size() + iA;
            int iB = 0;
            for (int i16 = 0; i16 < this.versionNum_.size(); i16++) {
                iB = f3.b(this.versionNum_, i16, iB);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getVersionNumList().size() + size2 + iB;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
        public AlertType getSupportedAlerts(int i14) {
            return supportedAlerts_converter_.convert(this.supportedAlerts_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
        public int getSupportedAlertsCount() {
            return this.supportedAlerts_.size();
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
        public List<AlertType> getSupportedAlertsList() {
            return new Internal.ListAdapter(this.supportedAlerts_, supportedAlerts_converter_);
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
        public int getVersionNum(int i14) {
            return this.versionNum_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
        public int getVersionNumCount() {
            return this.versionNum_.size();
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
        public List<Integer> getVersionNumList() {
            return this.versionNum_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSupportedAlertsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.supportedAlerts_.hashCode();
            }
            if (getVersionNumCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getVersionNumList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertSupportResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertSupportResponse.class, Builder.class);
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
            return new AlertSupportResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.supportedAlerts_.size()) {
                iF = f3.f(this.supportedAlerts_.get(iF), codedOutputStream, 1, iF, 1);
            }
            int iC = 0;
            while (iC < this.versionNum_.size()) {
                iC = f3.c(this.versionNum_, iC, codedOutputStream, 2, iC, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertSupportResponseOrBuilder {
            private int bitField0_;
            private List<Integer> supportedAlerts_;
            private Internal.IntList versionNum_;

            private Builder() {
                this.supportedAlerts_ = Collections.EMPTY_LIST;
                this.versionNum_ = GeneratedMessageV3.emptyIntList();
            }

            private void buildPartial0(AlertSupportResponse alertSupportResponse) {
                if ((this.bitField0_ & 2) != 0) {
                    this.versionNum_.makeImmutable();
                    alertSupportResponse.versionNum_ = this.versionNum_;
                }
            }

            private void buildPartialRepeatedFields(AlertSupportResponse alertSupportResponse) {
                if ((this.bitField0_ & 1) != 0) {
                    this.supportedAlerts_ = Collections.unmodifiableList(this.supportedAlerts_);
                    this.bitField0_ &= -2;
                }
                alertSupportResponse.supportedAlerts_ = this.supportedAlerts_;
            }

            private void ensureSupportedAlertsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.supportedAlerts_ = new ArrayList(this.supportedAlerts_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureVersionNumIsMutable() {
                if (!this.versionNum_.isModifiable()) {
                    this.versionNum_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.versionNum_);
                }
                this.bitField0_ |= 2;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertSupportResponse_descriptor;
            }

            public Builder addAllSupportedAlerts(Iterable<? extends AlertType> iterable) {
                ensureSupportedAlertsIsMutable();
                Iterator<? extends AlertType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedAlerts_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllVersionNum(Iterable<? extends Integer> iterable) {
                ensureVersionNumIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.versionNum_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSupportedAlerts(AlertType alertType) {
                alertType.getClass();
                ensureSupportedAlertsIsMutable();
                this.supportedAlerts_.add(Integer.valueOf(alertType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addVersionNum(int i14) {
                ensureVersionNumIsMutable();
                this.versionNum_.addInt(i14);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertSupportResponse build() {
                AlertSupportResponse alertSupportResponseBuildPartial = buildPartial();
                if (alertSupportResponseBuildPartial.isInitialized()) {
                    return alertSupportResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alertSupportResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertSupportResponse buildPartial() {
                AlertSupportResponse alertSupportResponse = new AlertSupportResponse(this);
                buildPartialRepeatedFields(alertSupportResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(alertSupportResponse);
                }
                onBuilt();
                return alertSupportResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.supportedAlerts_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                this.versionNum_ = GeneratedMessageV3.emptyIntList();
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

            public Builder clearSupportedAlerts() {
                this.supportedAlerts_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearVersionNum() {
                this.versionNum_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -3;
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
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertSupportResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
            public AlertType getSupportedAlerts(int i14) {
                return (AlertType) AlertSupportResponse.supportedAlerts_converter_.convert(this.supportedAlerts_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
            public int getSupportedAlertsCount() {
                return this.supportedAlerts_.size();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
            public List<AlertType> getSupportedAlertsList() {
                return new Internal.ListAdapter(this.supportedAlerts_, AlertSupportResponse.supportedAlerts_converter_);
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
            public int getVersionNum(int i14) {
                return this.versionNum_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
            public int getVersionNumCount() {
                return this.versionNum_.size();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.AlertSupportResponseOrBuilder
            public List<Integer> getVersionNumList() {
                this.versionNum_.makeImmutable();
                return this.versionNum_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_AlertSupportResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertSupportResponse.class, Builder.class);
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
                                    if (AlertType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureSupportedAlertsIsMutable();
                                        this.supportedAlerts_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (AlertType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureSupportedAlertsIsMutable();
                                            this.supportedAlerts_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 16) {
                                    int uInt32 = codedInputStream.readUInt32();
                                    ensureVersionNumIsMutable();
                                    this.versionNum_.addInt(uInt32);
                                } else if (tag == 18) {
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureVersionNumIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.versionNum_.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
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

            public Builder setSupportedAlerts(int i14, AlertType alertType) {
                alertType.getClass();
                ensureSupportedAlertsIsMutable();
                this.supportedAlerts_.set(i14, Integer.valueOf(alertType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setVersionNum(int i14, int i15) {
                ensureVersionNumIsMutable();
                this.versionNum_.setInt(i14, i15);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlertSupportResponse getDefaultInstanceForType() {
                return AlertSupportResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.supportedAlerts_ = Collections.EMPTY_LIST;
                this.versionNum_ = GeneratedMessageV3.emptyIntList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlertSupportResponse) {
                    return mergeFrom((AlertSupportResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlertSupportResponse alertSupportResponse) {
                if (alertSupportResponse == AlertSupportResponse.getDefaultInstance()) {
                    return this;
                }
                if (!alertSupportResponse.supportedAlerts_.isEmpty()) {
                    if (this.supportedAlerts_.isEmpty()) {
                        this.supportedAlerts_ = alertSupportResponse.supportedAlerts_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSupportedAlertsIsMutable();
                        this.supportedAlerts_.addAll(alertSupportResponse.supportedAlerts_);
                    }
                    onChanged();
                }
                if (!alertSupportResponse.versionNum_.isEmpty()) {
                    if (this.versionNum_.isEmpty()) {
                        Internal.IntList intList = alertSupportResponse.versionNum_;
                        this.versionNum_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 2;
                    } else {
                        ensureVersionNumIsMutable();
                        this.versionNum_.addAll(alertSupportResponse.versionNum_);
                    }
                    onChanged();
                }
                mergeUnknownFields(alertSupportResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlertSupportResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AlertSupportResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertSupportResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertSupportResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlertSupportResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlertSupportResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlertSupportResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlertSupportResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AlertSupportResponse parseFrom(InputStream inputStream) {
            return (AlertSupportResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AlertSupportResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertSupportResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertSupportResponse parseFrom(CodedInputStream codedInputStream) {
            return (AlertSupportResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlertSupportResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertSupportResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private AlertSupportResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.versionNum_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ AlertSupportResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class EventSharingService extends GeneratedMessageV3 implements EventSharingServiceOrBuilder {
        public static final int ALERT_NOTIFICATION_FIELD_NUMBER = 3;
        private static final EventSharingService DEFAULT_INSTANCE = new EventSharingService();

        @Deprecated
        public static final Parser<EventSharingService> PARSER = new AbstractParser<EventSharingService>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.EventSharingService.1
            @Override // com.google.protobuf.Parser
            public EventSharingService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EventSharingService.newBuilder();
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
        public static final int SUBSCRIBE_REQUEST_FIELD_NUMBER = 1;
        public static final int SUBSCRIBE_RESPONSE_FIELD_NUMBER = 2;
        public static final int SUPPORT_REQUEST_FIELD_NUMBER = 4;
        public static final int SUPPORT_RESPONSE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private AlertNotification alertNotification_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SubscribeRequest subscribeRequest_;
        private SubscribeResponse subscribeResponse_;
        private AlertSupportRequest supportRequest_;
        private AlertSupportResponse supportResponse_;

        private EventSharingService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EventSharingService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_EventSharingService_descriptor;
        }

        public static Builder newBuilder(EventSharingService eventSharingService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventSharingService);
        }

        public static EventSharingService parseDelimitedFrom(InputStream inputStream) {
            return (EventSharingService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EventSharingService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EventSharingService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EventSharingService)) {
                return super.equals(obj);
            }
            EventSharingService eventSharingService = (EventSharingService) obj;
            if (hasSubscribeRequest() != eventSharingService.hasSubscribeRequest()) {
                return false;
            }
            if ((hasSubscribeRequest() && !getSubscribeRequest().equals(eventSharingService.getSubscribeRequest())) || hasSubscribeResponse() != eventSharingService.hasSubscribeResponse()) {
                return false;
            }
            if ((hasSubscribeResponse() && !getSubscribeResponse().equals(eventSharingService.getSubscribeResponse())) || hasAlertNotification() != eventSharingService.hasAlertNotification()) {
                return false;
            }
            if ((hasAlertNotification() && !getAlertNotification().equals(eventSharingService.getAlertNotification())) || hasSupportRequest() != eventSharingService.hasSupportRequest()) {
                return false;
            }
            if ((!hasSupportRequest() || getSupportRequest().equals(eventSharingService.getSupportRequest())) && hasSupportResponse() == eventSharingService.hasSupportResponse()) {
                return (!hasSupportResponse() || getSupportResponse().equals(eventSharingService.getSupportResponse())) && getUnknownFields().equals(eventSharingService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public AlertNotification getAlertNotification() {
            AlertNotification alertNotification = this.alertNotification_;
            return alertNotification == null ? AlertNotification.getDefaultInstance() : alertNotification;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public AlertNotificationOrBuilder getAlertNotificationOrBuilder() {
            AlertNotification alertNotification = this.alertNotification_;
            return alertNotification == null ? AlertNotification.getDefaultInstance() : alertNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EventSharingService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSubscribeRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSubscribeResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getAlertNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getSupportRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getSupportResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public SubscribeRequest getSubscribeRequest() {
            SubscribeRequest subscribeRequest = this.subscribeRequest_;
            return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public SubscribeRequestOrBuilder getSubscribeRequestOrBuilder() {
            SubscribeRequest subscribeRequest = this.subscribeRequest_;
            return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public SubscribeResponse getSubscribeResponse() {
            SubscribeResponse subscribeResponse = this.subscribeResponse_;
            return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public SubscribeResponseOrBuilder getSubscribeResponseOrBuilder() {
            SubscribeResponse subscribeResponse = this.subscribeResponse_;
            return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public AlertSupportRequest getSupportRequest() {
            AlertSupportRequest alertSupportRequest = this.supportRequest_;
            return alertSupportRequest == null ? AlertSupportRequest.getDefaultInstance() : alertSupportRequest;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public AlertSupportRequestOrBuilder getSupportRequestOrBuilder() {
            AlertSupportRequest alertSupportRequest = this.supportRequest_;
            return alertSupportRequest == null ? AlertSupportRequest.getDefaultInstance() : alertSupportRequest;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public AlertSupportResponse getSupportResponse() {
            AlertSupportResponse alertSupportResponse = this.supportResponse_;
            return alertSupportResponse == null ? AlertSupportResponse.getDefaultInstance() : alertSupportResponse;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public AlertSupportResponseOrBuilder getSupportResponseOrBuilder() {
            AlertSupportResponse alertSupportResponse = this.supportResponse_;
            return alertSupportResponse == null ? AlertSupportResponse.getDefaultInstance() : alertSupportResponse;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public boolean hasAlertNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public boolean hasSubscribeRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public boolean hasSubscribeResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public boolean hasSupportRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
        public boolean hasSupportResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSubscribeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSubscribeRequest().hashCode();
            }
            if (hasSubscribeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSubscribeResponse().hashCode();
            }
            if (hasAlertNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAlertNotification().hashCode();
            }
            if (hasSupportRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSupportRequest().hashCode();
            }
            if (hasSupportResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSupportResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_EventSharingService_fieldAccessorTable.ensureFieldAccessorsInitialized(EventSharingService.class, Builder.class);
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
            if (hasSubscribeResponse() && !getSubscribeResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAlertNotification() || getAlertNotification().isInitialized()) {
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
            return new EventSharingService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSubscribeRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSubscribeResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getAlertNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSupportRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSupportResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EventSharingServiceOrBuilder {
            private SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> alertNotificationBuilder_;
            private AlertNotification alertNotification_;
            private int bitField0_;
            private SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> subscribeRequestBuilder_;
            private SubscribeRequest subscribeRequest_;
            private SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> subscribeResponseBuilder_;
            private SubscribeResponse subscribeResponse_;
            private SingleFieldBuilderV3<AlertSupportRequest, AlertSupportRequest.Builder, AlertSupportRequestOrBuilder> supportRequestBuilder_;
            private AlertSupportRequest supportRequest_;
            private SingleFieldBuilderV3<AlertSupportResponse, AlertSupportResponse.Builder, AlertSupportResponseOrBuilder> supportResponseBuilder_;
            private AlertSupportResponse supportResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(EventSharingService eventSharingService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                    eventSharingService.subscribeRequest_ = singleFieldBuilderV3 == null ? this.subscribeRequest_ : (SubscribeRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV4 = this.subscribeResponseBuilder_;
                    eventSharingService.subscribeResponse_ = singleFieldBuilderV4 == null ? this.subscribeResponse_ : (SubscribeResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV5 = this.alertNotificationBuilder_;
                    eventSharingService.alertNotification_ = singleFieldBuilderV5 == null ? this.alertNotification_ : (AlertNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<AlertSupportRequest, AlertSupportRequest.Builder, AlertSupportRequestOrBuilder> singleFieldBuilderV6 = this.supportRequestBuilder_;
                    eventSharingService.supportRequest_ = singleFieldBuilderV6 == null ? this.supportRequest_ : (AlertSupportRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<AlertSupportResponse, AlertSupportResponse.Builder, AlertSupportResponseOrBuilder> singleFieldBuilderV7 = this.supportResponseBuilder_;
                    eventSharingService.supportResponse_ = singleFieldBuilderV7 == null ? this.supportResponse_ : (AlertSupportResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                eventSharingService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> getAlertNotificationFieldBuilder() {
                if (this.alertNotificationBuilder_ == null) {
                    this.alertNotificationBuilder_ = new SingleFieldBuilderV3<>(getAlertNotification(), getParentForChildren(), isClean());
                    this.alertNotification_ = null;
                }
                return this.alertNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_EventSharingService_descriptor;
            }

            private SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> getSubscribeRequestFieldBuilder() {
                if (this.subscribeRequestBuilder_ == null) {
                    this.subscribeRequestBuilder_ = new SingleFieldBuilderV3<>(getSubscribeRequest(), getParentForChildren(), isClean());
                    this.subscribeRequest_ = null;
                }
                return this.subscribeRequestBuilder_;
            }

            private SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> getSubscribeResponseFieldBuilder() {
                if (this.subscribeResponseBuilder_ == null) {
                    this.subscribeResponseBuilder_ = new SingleFieldBuilderV3<>(getSubscribeResponse(), getParentForChildren(), isClean());
                    this.subscribeResponse_ = null;
                }
                return this.subscribeResponseBuilder_;
            }

            private SingleFieldBuilderV3<AlertSupportRequest, AlertSupportRequest.Builder, AlertSupportRequestOrBuilder> getSupportRequestFieldBuilder() {
                if (this.supportRequestBuilder_ == null) {
                    this.supportRequestBuilder_ = new SingleFieldBuilderV3<>(getSupportRequest(), getParentForChildren(), isClean());
                    this.supportRequest_ = null;
                }
                return this.supportRequestBuilder_;
            }

            private SingleFieldBuilderV3<AlertSupportResponse, AlertSupportResponse.Builder, AlertSupportResponseOrBuilder> getSupportResponseFieldBuilder() {
                if (this.supportResponseBuilder_ == null) {
                    this.supportResponseBuilder_ = new SingleFieldBuilderV3<>(getSupportResponse(), getParentForChildren(), isClean());
                    this.supportResponse_ = null;
                }
                return this.supportResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSubscribeRequestFieldBuilder();
                    getSubscribeResponseFieldBuilder();
                    getAlertNotificationFieldBuilder();
                    getSupportRequestFieldBuilder();
                    getSupportResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EventSharingService build() {
                EventSharingService eventSharingServiceBuildPartial = buildPartial();
                if (eventSharingServiceBuildPartial.isInitialized()) {
                    return eventSharingServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventSharingServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EventSharingService buildPartial() {
                EventSharingService eventSharingService = new EventSharingService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(eventSharingService);
                }
                onBuilt();
                return eventSharingService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.subscribeRequest_ = null;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.subscribeRequestBuilder_ = null;
                }
                this.subscribeResponse_ = null;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV4 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.subscribeResponseBuilder_ = null;
                }
                this.alertNotification_ = null;
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV5 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.alertNotificationBuilder_ = null;
                }
                this.supportRequest_ = null;
                SingleFieldBuilderV3<AlertSupportRequest, AlertSupportRequest.Builder, AlertSupportRequestOrBuilder> singleFieldBuilderV6 = this.supportRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.supportRequestBuilder_ = null;
                }
                this.supportResponse_ = null;
                SingleFieldBuilderV3<AlertSupportResponse, AlertSupportResponse.Builder, AlertSupportResponseOrBuilder> singleFieldBuilderV7 = this.supportResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.supportResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearAlertNotification() {
                this.bitField0_ &= -5;
                this.alertNotification_ = null;
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.alertNotificationBuilder_ = null;
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

            public Builder clearSubscribeRequest() {
                this.bitField0_ &= -2;
                this.subscribeRequest_ = null;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.subscribeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSubscribeResponse() {
                this.bitField0_ &= -3;
                this.subscribeResponse_ = null;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.subscribeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSupportRequest() {
                this.bitField0_ &= -9;
                this.supportRequest_ = null;
                SingleFieldBuilderV3<AlertSupportRequest, AlertSupportRequest.Builder, AlertSupportRequestOrBuilder> singleFieldBuilderV3 = this.supportRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSupportResponse() {
                this.bitField0_ &= -17;
                this.supportResponse_ = null;
                SingleFieldBuilderV3<AlertSupportResponse, AlertSupportResponse.Builder, AlertSupportResponseOrBuilder> singleFieldBuilderV3 = this.supportResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public AlertNotification getAlertNotification() {
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertNotification) singleFieldBuilderV3.getMessage();
                }
                AlertNotification alertNotification = this.alertNotification_;
                return alertNotification == null ? AlertNotification.getDefaultInstance() : alertNotification;
            }

            public AlertNotification.Builder getAlertNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (AlertNotification.Builder) getAlertNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public AlertNotificationOrBuilder getAlertNotificationOrBuilder() {
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlertNotification alertNotification = this.alertNotification_;
                return alertNotification == null ? AlertNotification.getDefaultInstance() : alertNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_EventSharingService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public SubscribeRequest getSubscribeRequest() {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeRequest) singleFieldBuilderV3.getMessage();
                }
                SubscribeRequest subscribeRequest = this.subscribeRequest_;
                return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
            }

            public SubscribeRequest.Builder getSubscribeRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SubscribeRequest.Builder) getSubscribeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public SubscribeRequestOrBuilder getSubscribeRequestOrBuilder() {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SubscribeRequest subscribeRequest = this.subscribeRequest_;
                return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public SubscribeResponse getSubscribeResponse() {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeResponse) singleFieldBuilderV3.getMessage();
                }
                SubscribeResponse subscribeResponse = this.subscribeResponse_;
                return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
            }

            public SubscribeResponse.Builder getSubscribeResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SubscribeResponse.Builder) getSubscribeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public SubscribeResponseOrBuilder getSubscribeResponseOrBuilder() {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SubscribeResponse subscribeResponse = this.subscribeResponse_;
                return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public AlertSupportRequest getSupportRequest() {
                SingleFieldBuilderV3<AlertSupportRequest, AlertSupportRequest.Builder, AlertSupportRequestOrBuilder> singleFieldBuilderV3 = this.supportRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertSupportRequest) singleFieldBuilderV3.getMessage();
                }
                AlertSupportRequest alertSupportRequest = this.supportRequest_;
                return alertSupportRequest == null ? AlertSupportRequest.getDefaultInstance() : alertSupportRequest;
            }

            public AlertSupportRequest.Builder getSupportRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (AlertSupportRequest.Builder) getSupportRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public AlertSupportRequestOrBuilder getSupportRequestOrBuilder() {
                SingleFieldBuilderV3<AlertSupportRequest, AlertSupportRequest.Builder, AlertSupportRequestOrBuilder> singleFieldBuilderV3 = this.supportRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertSupportRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlertSupportRequest alertSupportRequest = this.supportRequest_;
                return alertSupportRequest == null ? AlertSupportRequest.getDefaultInstance() : alertSupportRequest;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public AlertSupportResponse getSupportResponse() {
                SingleFieldBuilderV3<AlertSupportResponse, AlertSupportResponse.Builder, AlertSupportResponseOrBuilder> singleFieldBuilderV3 = this.supportResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertSupportResponse) singleFieldBuilderV3.getMessage();
                }
                AlertSupportResponse alertSupportResponse = this.supportResponse_;
                return alertSupportResponse == null ? AlertSupportResponse.getDefaultInstance() : alertSupportResponse;
            }

            public AlertSupportResponse.Builder getSupportResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (AlertSupportResponse.Builder) getSupportResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public AlertSupportResponseOrBuilder getSupportResponseOrBuilder() {
                SingleFieldBuilderV3<AlertSupportResponse, AlertSupportResponse.Builder, AlertSupportResponseOrBuilder> singleFieldBuilderV3 = this.supportResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertSupportResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlertSupportResponse alertSupportResponse = this.supportResponse_;
                return alertSupportResponse == null ? AlertSupportResponse.getDefaultInstance() : alertSupportResponse;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public boolean hasAlertNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public boolean hasSubscribeRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public boolean hasSubscribeResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public boolean hasSupportRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.EventSharingServiceOrBuilder
            public boolean hasSupportResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_EventSharingService_fieldAccessorTable.ensureFieldAccessorsInitialized(EventSharingService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasSubscribeResponse() || getSubscribeResponse().isInitialized()) {
                    return !hasAlertNotification() || getAlertNotification().isInitialized();
                }
                return false;
            }

            public Builder mergeAlertNotification(AlertNotification alertNotification) {
                AlertNotification alertNotification2;
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(alertNotification);
                } else if ((this.bitField0_ & 4) == 0 || (alertNotification2 = this.alertNotification_) == null || alertNotification2 == AlertNotification.getDefaultInstance()) {
                    this.alertNotification_ = alertNotification;
                } else {
                    getAlertNotificationBuilder().mergeFrom(alertNotification);
                }
                if (this.alertNotification_ != null) {
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
                                    codedInputStream.readMessage(getSubscribeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSubscribeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getAlertNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getSupportRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getSupportResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSubscribeRequest(SubscribeRequest subscribeRequest) {
                SubscribeRequest subscribeRequest2;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(subscribeRequest);
                } else if ((this.bitField0_ & 1) == 0 || (subscribeRequest2 = this.subscribeRequest_) == null || subscribeRequest2 == SubscribeRequest.getDefaultInstance()) {
                    this.subscribeRequest_ = subscribeRequest;
                } else {
                    getSubscribeRequestBuilder().mergeFrom(subscribeRequest);
                }
                if (this.subscribeRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSubscribeResponse(SubscribeResponse subscribeResponse) {
                SubscribeResponse subscribeResponse2;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(subscribeResponse);
                } else if ((this.bitField0_ & 2) == 0 || (subscribeResponse2 = this.subscribeResponse_) == null || subscribeResponse2 == SubscribeResponse.getDefaultInstance()) {
                    this.subscribeResponse_ = subscribeResponse;
                } else {
                    getSubscribeResponseBuilder().mergeFrom(subscribeResponse);
                }
                if (this.subscribeResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSupportRequest(AlertSupportRequest alertSupportRequest) {
                AlertSupportRequest alertSupportRequest2;
                SingleFieldBuilderV3<AlertSupportRequest, AlertSupportRequest.Builder, AlertSupportRequestOrBuilder> singleFieldBuilderV3 = this.supportRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(alertSupportRequest);
                } else if ((this.bitField0_ & 8) == 0 || (alertSupportRequest2 = this.supportRequest_) == null || alertSupportRequest2 == AlertSupportRequest.getDefaultInstance()) {
                    this.supportRequest_ = alertSupportRequest;
                } else {
                    getSupportRequestBuilder().mergeFrom(alertSupportRequest);
                }
                if (this.supportRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSupportResponse(AlertSupportResponse alertSupportResponse) {
                AlertSupportResponse alertSupportResponse2;
                SingleFieldBuilderV3<AlertSupportResponse, AlertSupportResponse.Builder, AlertSupportResponseOrBuilder> singleFieldBuilderV3 = this.supportResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(alertSupportResponse);
                } else if ((this.bitField0_ & 16) == 0 || (alertSupportResponse2 = this.supportResponse_) == null || alertSupportResponse2 == AlertSupportResponse.getDefaultInstance()) {
                    this.supportResponse_ = alertSupportResponse;
                } else {
                    getSupportResponseBuilder().mergeFrom(alertSupportResponse);
                }
                if (this.supportResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAlertNotification(AlertNotification.Builder builder) {
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.alertNotification_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSubscribeRequest(SubscribeRequest.Builder builder) {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.subscribeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSubscribeResponse(SubscribeResponse.Builder builder) {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.subscribeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSupportRequest(AlertSupportRequest.Builder builder) {
                SingleFieldBuilderV3<AlertSupportRequest, AlertSupportRequest.Builder, AlertSupportRequestOrBuilder> singleFieldBuilderV3 = this.supportRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.supportRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSupportResponse(AlertSupportResponse.Builder builder) {
                SingleFieldBuilderV3<AlertSupportResponse, AlertSupportResponse.Builder, AlertSupportResponseOrBuilder> singleFieldBuilderV3 = this.supportResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.supportResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EventSharingService getDefaultInstanceForType() {
                return EventSharingService.getDefaultInstance();
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

            public Builder setAlertNotification(AlertNotification alertNotification) {
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alertNotification.getClass();
                    this.alertNotification_ = alertNotification;
                } else {
                    singleFieldBuilderV3.setMessage(alertNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSubscribeRequest(SubscribeRequest subscribeRequest) {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    subscribeRequest.getClass();
                    this.subscribeRequest_ = subscribeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(subscribeRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSubscribeResponse(SubscribeResponse subscribeResponse) {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    subscribeResponse.getClass();
                    this.subscribeResponse_ = subscribeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(subscribeResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSupportRequest(AlertSupportRequest alertSupportRequest) {
                SingleFieldBuilderV3<AlertSupportRequest, AlertSupportRequest.Builder, AlertSupportRequestOrBuilder> singleFieldBuilderV3 = this.supportRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alertSupportRequest.getClass();
                    this.supportRequest_ = alertSupportRequest;
                } else {
                    singleFieldBuilderV3.setMessage(alertSupportRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSupportResponse(AlertSupportResponse alertSupportResponse) {
                SingleFieldBuilderV3<AlertSupportResponse, AlertSupportResponse.Builder, AlertSupportResponseOrBuilder> singleFieldBuilderV3 = this.supportResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alertSupportResponse.getClass();
                    this.supportResponse_ = alertSupportResponse;
                } else {
                    singleFieldBuilderV3.setMessage(alertSupportResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EventSharingService) {
                    return mergeFrom((EventSharingService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EventSharingService eventSharingService) {
                if (eventSharingService == EventSharingService.getDefaultInstance()) {
                    return this;
                }
                if (eventSharingService.hasSubscribeRequest()) {
                    mergeSubscribeRequest(eventSharingService.getSubscribeRequest());
                }
                if (eventSharingService.hasSubscribeResponse()) {
                    mergeSubscribeResponse(eventSharingService.getSubscribeResponse());
                }
                if (eventSharingService.hasAlertNotification()) {
                    mergeAlertNotification(eventSharingService.getAlertNotification());
                }
                if (eventSharingService.hasSupportRequest()) {
                    mergeSupportRequest(eventSharingService.getSupportRequest());
                }
                if (eventSharingService.hasSupportResponse()) {
                    mergeSupportResponse(eventSharingService.getSupportResponse());
                }
                mergeUnknownFields(eventSharingService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EventSharingService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ EventSharingService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EventSharingService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EventSharingService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EventSharingService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EventSharingService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EventSharingService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EventSharingService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EventSharingService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EventSharingService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EventSharingService parseFrom(InputStream inputStream) {
            return (EventSharingService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EventSharingService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EventSharingService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EventSharingService parseFrom(CodedInputStream codedInputStream) {
            return (EventSharingService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EventSharingService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EventSharingService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SubscribeRequest extends GeneratedMessageV3 implements SubscribeRequestOrBuilder {
        public static final int ALERTS_FIELD_NUMBER = 1;
        private static final SubscribeRequest DEFAULT_INSTANCE = new SubscribeRequest();

        @Deprecated
        public static final Parser<SubscribeRequest> PARSER = new AbstractParser<SubscribeRequest>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequest.1
            @Override // com.google.protobuf.Parser
            public SubscribeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SubscribeRequest.newBuilder();
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
        public static final int TARGET_DISTANCE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<AlertMessage> alerts_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int targetDistance_;

        private SubscribeRequest() {
            this.targetDistance_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.alerts_ = Collections.EMPTY_LIST;
        }

        public static SubscribeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeRequest_descriptor;
        }

        public static Builder newBuilder(SubscribeRequest subscribeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(subscribeRequest);
        }

        public static SubscribeRequest parseDelimitedFrom(InputStream inputStream) {
            return (SubscribeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SubscribeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SubscribeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubscribeRequest)) {
                return super.equals(obj);
            }
            SubscribeRequest subscribeRequest = (SubscribeRequest) obj;
            if (getAlertsList().equals(subscribeRequest.getAlertsList()) && hasTargetDistance() == subscribeRequest.hasTargetDistance()) {
                return (!hasTargetDistance() || getTargetDistance() == subscribeRequest.getTargetDistance()) && getUnknownFields().equals(subscribeRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
        public AlertMessage getAlerts(int i14) {
            return this.alerts_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
        public int getAlertsCount() {
            return this.alerts_.size();
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
        public List<AlertMessage> getAlertsList() {
            return this.alerts_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
        public AlertMessageOrBuilder getAlertsOrBuilder(int i14) {
            return this.alerts_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
        public List<? extends AlertMessageOrBuilder> getAlertsOrBuilderList() {
            return this.alerts_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SubscribeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = 0;
            for (int i15 = 0; i15 < this.alerts_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(1, this.alerts_.get(i15));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.targetDistance_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
        public int getTargetDistance() {
            return this.targetDistance_;
        }

        @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
        public boolean hasTargetDistance() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getAlertsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAlertsList().hashCode();
            }
            if (hasTargetDistance()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTargetDistance();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeRequest.class, Builder.class);
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
            return new SubscribeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.alerts_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.alerts_.get(i14));
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(2, this.targetDistance_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SubscribeRequestOrBuilder {
            private RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> alertsBuilder_;
            private List<AlertMessage> alerts_;
            private int bitField0_;
            private int targetDistance_;

            private Builder() {
                this.alerts_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SubscribeRequest subscribeRequest) {
                int i14;
                if ((this.bitField0_ & 2) != 0) {
                    subscribeRequest.targetDistance_ = this.targetDistance_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                subscribeRequest.bitField0_ = i14 | subscribeRequest.bitField0_;
            }

            private void buildPartialRepeatedFields(SubscribeRequest subscribeRequest) {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    subscribeRequest.alerts_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.alerts_ = Collections.unmodifiableList(this.alerts_);
                    this.bitField0_ &= -2;
                }
                subscribeRequest.alerts_ = this.alerts_;
            }

            private void ensureAlertsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.alerts_ = new ArrayList(this.alerts_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> getAlertsFieldBuilder() {
                if (this.alertsBuilder_ == null) {
                    this.alertsBuilder_ = new RepeatedFieldBuilderV3<>(this.alerts_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.alerts_ = null;
                }
                return this.alertsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeRequest_descriptor;
            }

            public Builder addAlerts(AlertMessage.Builder builder) {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureAlertsIsMutable();
                this.alerts_.add(builder.build());
                onChanged();
                return this;
            }

            public AlertMessage.Builder addAlertsBuilder() {
                return (AlertMessage.Builder) getAlertsFieldBuilder().addBuilder(AlertMessage.getDefaultInstance());
            }

            public Builder addAllAlerts(Iterable<? extends AlertMessage> iterable) {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureAlertsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.alerts_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeRequest build() {
                SubscribeRequest subscribeRequestBuildPartial = buildPartial();
                if (subscribeRequestBuildPartial.isInitialized()) {
                    return subscribeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) subscribeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeRequest buildPartial() {
                SubscribeRequest subscribeRequest = new SubscribeRequest(this);
                buildPartialRepeatedFields(subscribeRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(subscribeRequest);
                }
                onBuilt();
                return subscribeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.alerts_ = Collections.EMPTY_LIST;
                } else {
                    this.alerts_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                this.targetDistance_ = 0;
                return this;
            }

            public Builder clearAlerts() {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.alerts_ = Collections.EMPTY_LIST;
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

            public Builder clearTargetDistance() {
                this.bitField0_ &= -3;
                this.targetDistance_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
            public AlertMessage getAlerts(int i14) {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.alerts_.get(i14) : (AlertMessage) repeatedFieldBuilderV3.getMessage(i14);
            }

            public AlertMessage.Builder getAlertsBuilder(int i14) {
                return (AlertMessage.Builder) getAlertsFieldBuilder().getBuilder(i14);
            }

            public List<AlertMessage.Builder> getAlertsBuilderList() {
                return getAlertsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
            public int getAlertsCount() {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.alerts_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
            public List<AlertMessage> getAlertsList() {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.alerts_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
            public AlertMessageOrBuilder getAlertsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.alerts_.get(i14) : (AlertMessageOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
            public List<? extends AlertMessageOrBuilder> getAlertsOrBuilderList() {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.alerts_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
            public int getTargetDistance() {
                return this.targetDistance_;
            }

            @Override // com.garmin.proto.generated.GDIEventSharingProto.SubscribeRequestOrBuilder
            public boolean hasTargetDistance() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIEventSharingProto.internal_static_GDI_Proto_EventSharing_SubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(SubscribeRequest subscribeRequest) {
                if (subscribeRequest == SubscribeRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.alertsBuilder_ == null) {
                    if (!subscribeRequest.alerts_.isEmpty()) {
                        if (this.alerts_.isEmpty()) {
                            this.alerts_ = subscribeRequest.alerts_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureAlertsIsMutable();
                            this.alerts_.addAll(subscribeRequest.alerts_);
                        }
                        onChanged();
                    }
                } else if (!subscribeRequest.alerts_.isEmpty()) {
                    boolean zIsEmpty = this.alertsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.alertsBuilder_ = null;
                        this.alerts_ = subscribeRequest.alerts_;
                        this.bitField0_ &= -2;
                        this.alertsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAlertsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(subscribeRequest.alerts_);
                    }
                }
                if (subscribeRequest.hasTargetDistance()) {
                    setTargetDistance(subscribeRequest.getTargetDistance());
                }
                mergeUnknownFields(subscribeRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeAlerts(int i14) {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureAlertsIsMutable();
                this.alerts_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setAlerts(int i14, AlertMessage.Builder builder) {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureAlertsIsMutable();
                this.alerts_.set(i14, builder.build());
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

            public Builder setTargetDistance(int i14) {
                this.targetDistance_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SubscribeRequest getDefaultInstanceForType() {
                return SubscribeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.alerts_ = Collections.EMPTY_LIST;
            }

            public AlertMessage.Builder addAlertsBuilder(int i14) {
                return (AlertMessage.Builder) getAlertsFieldBuilder().addBuilder(i14, AlertMessage.getDefaultInstance());
            }

            public Builder addAlerts(int i14, AlertMessage alertMessage) {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    alertMessage.getClass();
                    ensureAlertsIsMutable();
                    this.alerts_.add(i14, alertMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, alertMessage);
                return this;
            }

            public Builder setAlerts(int i14, AlertMessage alertMessage) {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    alertMessage.getClass();
                    ensureAlertsIsMutable();
                    this.alerts_.set(i14, alertMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, alertMessage);
                return this;
            }

            public Builder addAlerts(AlertMessage alertMessage) {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    alertMessage.getClass();
                    ensureAlertsIsMutable();
                    this.alerts_.add(alertMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(alertMessage);
                return this;
            }

            public Builder addAlerts(int i14, AlertMessage.Builder builder) {
                RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAlertsIsMutable();
                    this.alerts_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SubscribeRequest) {
                    return mergeFrom((SubscribeRequest) message);
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
                                    AlertMessage alertMessage = (AlertMessage) codedInputStream.readMessage(AlertMessage.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<AlertMessage, AlertMessage.Builder, AlertMessageOrBuilder> repeatedFieldBuilderV3 = this.alertsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureAlertsIsMutable();
                                        this.alerts_.add(alertMessage);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(alertMessage);
                                    }
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.targetDistance_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
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
        public SubscribeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SubscribeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscribeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SubscribeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SubscribeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SubscribeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SubscribeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SubscribeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.targetDistance_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SubscribeRequest parseFrom(InputStream inputStream) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SubscribeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ SubscribeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SubscribeRequest parseFrom(CodedInputStream codedInputStream) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SubscribeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum AlertType implements ProtocolMessageEnum {
        ACTIVITY_START(0),
        ACTIVITY_STOP(1),
        ACTIVITY_DISTANCE(2),
        ACTIVITY_TIME(3),
        ACTIVITY_AUTO_LAP(4),
        ACTIVITY_MANUAL_LAP(5),
        ACTIVITY_TRANSITION(6),
        SWITCHER_STATUS_CHANGE(7),
        LAUNCH_MONITOR(8),
        NAVIGATION_UPDATE(9),
        BREAK_PLANNER_STATE_CHANGE(10),
        DRIVING_STATE_CHANGE(11),
        BLUETOOTH_CLASSIC_STATE_CHANGE(12),
        GOLF_STATE_CHANGE(13),
        RANGEFINDER_MEASUREMENT(14),
        XERO_CHRONOGRAPH(15),
        GOLF_CLUB_STATUS_CHANGE(16),
        DIVE_READINESS_CHANGE(17),
        RADAR_SETTINGS_CHANGE(18),
        LIVE_SESSION(19),
        HEART_RATE_MEASUREMENT(20),
        RUNNING_MEASUREMENT(21),
        ACCESSORY_UTILITIES_ACTIVITY_STATE(22),
        RUNNING_ALGORITHM_INPUT(23),
        BIKE_POWER_MEASUREMENT(24),
        DEVELOPMENT_TESTING(25),
        PSA_SAMPLE(26),
        VARIA_DEVICE_STATUS(27),
        BUTTON_EVENT(28),
        CYCLING_TORSO_SENSOR_MEASUREMENT(29),
        XCEL_STRENGTH(30),
        CONTROLLING_DEVICE_STATUS_CHANGE(31),
        XCEL_SPRINT(32),
        XERO_RANGEFINDER(33),
        XCEL_SPRINT_SENSOR_STATE(34),
        SOFTWARE_UPDATE_DOWNLOAD_PROGRESS(35),
        SOFTWARE_UPDATE_DOWNLOAD_READY(36),
        SOFTWARE_UPDATE_COMPLETED(37);

        public static final int ACCESSORY_UTILITIES_ACTIVITY_STATE_VALUE = 22;
        public static final int ACTIVITY_AUTO_LAP_VALUE = 4;
        public static final int ACTIVITY_DISTANCE_VALUE = 2;
        public static final int ACTIVITY_MANUAL_LAP_VALUE = 5;
        public static final int ACTIVITY_START_VALUE = 0;
        public static final int ACTIVITY_STOP_VALUE = 1;
        public static final int ACTIVITY_TIME_VALUE = 3;
        public static final int ACTIVITY_TRANSITION_VALUE = 6;
        public static final int BIKE_POWER_MEASUREMENT_VALUE = 24;
        public static final int BLUETOOTH_CLASSIC_STATE_CHANGE_VALUE = 12;
        public static final int BREAK_PLANNER_STATE_CHANGE_VALUE = 10;
        public static final int BUTTON_EVENT_VALUE = 28;
        public static final int CONTROLLING_DEVICE_STATUS_CHANGE_VALUE = 31;
        public static final int CYCLING_TORSO_SENSOR_MEASUREMENT_VALUE = 29;
        public static final int DEVELOPMENT_TESTING_VALUE = 25;
        public static final int DIVE_READINESS_CHANGE_VALUE = 17;
        public static final int DRIVING_STATE_CHANGE_VALUE = 11;
        public static final int GOLF_CLUB_STATUS_CHANGE_VALUE = 16;
        public static final int GOLF_STATE_CHANGE_VALUE = 13;
        public static final int HEART_RATE_MEASUREMENT_VALUE = 20;
        public static final int LAUNCH_MONITOR_VALUE = 8;
        public static final int LIVE_SESSION_VALUE = 19;
        public static final int NAVIGATION_UPDATE_VALUE = 9;
        public static final int PSA_SAMPLE_VALUE = 26;
        public static final int RADAR_SETTINGS_CHANGE_VALUE = 18;
        public static final int RANGEFINDER_MEASUREMENT_VALUE = 14;
        public static final int RUNNING_ALGORITHM_INPUT_VALUE = 23;
        public static final int RUNNING_MEASUREMENT_VALUE = 21;
        public static final int SOFTWARE_UPDATE_COMPLETED_VALUE = 37;
        public static final int SOFTWARE_UPDATE_DOWNLOAD_PROGRESS_VALUE = 35;
        public static final int SOFTWARE_UPDATE_DOWNLOAD_READY_VALUE = 36;
        public static final int SWITCHER_STATUS_CHANGE_VALUE = 7;
        public static final int VARIA_DEVICE_STATUS_VALUE = 27;
        public static final int XCEL_SPRINT_SENSOR_STATE_VALUE = 34;
        public static final int XCEL_SPRINT_VALUE = 32;
        public static final int XCEL_STRENGTH_VALUE = 30;
        public static final int XERO_CHRONOGRAPH_VALUE = 15;
        public static final int XERO_RANGEFINDER_VALUE = 33;
        private final int value;
        private static final Internal.EnumLiteMap<AlertType> internalValueMap = new Internal.EnumLiteMap<AlertType>() { // from class: com.garmin.proto.generated.GDIEventSharingProto.AlertType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AlertType findValueByNumber(int i14) {
                return AlertType.forNumber(i14);
            }
        };
        private static final AlertType[] VALUES = values();

        AlertType(int i14) {
            this.value = i14;
        }

        public static AlertType forNumber(int i14) {
            switch (i14) {
                case 0:
                    return ACTIVITY_START;
                case 1:
                    return ACTIVITY_STOP;
                case 2:
                    return ACTIVITY_DISTANCE;
                case 3:
                    return ACTIVITY_TIME;
                case 4:
                    return ACTIVITY_AUTO_LAP;
                case 5:
                    return ACTIVITY_MANUAL_LAP;
                case 6:
                    return ACTIVITY_TRANSITION;
                case 7:
                    return SWITCHER_STATUS_CHANGE;
                case 8:
                    return LAUNCH_MONITOR;
                case 9:
                    return NAVIGATION_UPDATE;
                case 10:
                    return BREAK_PLANNER_STATE_CHANGE;
                case 11:
                    return DRIVING_STATE_CHANGE;
                case 12:
                    return BLUETOOTH_CLASSIC_STATE_CHANGE;
                case 13:
                    return GOLF_STATE_CHANGE;
                case 14:
                    return RANGEFINDER_MEASUREMENT;
                case 15:
                    return XERO_CHRONOGRAPH;
                case 16:
                    return GOLF_CLUB_STATUS_CHANGE;
                case 17:
                    return DIVE_READINESS_CHANGE;
                case 18:
                    return RADAR_SETTINGS_CHANGE;
                case 19:
                    return LIVE_SESSION;
                case 20:
                    return HEART_RATE_MEASUREMENT;
                case 21:
                    return RUNNING_MEASUREMENT;
                case 22:
                    return ACCESSORY_UTILITIES_ACTIVITY_STATE;
                case 23:
                    return RUNNING_ALGORITHM_INPUT;
                case 24:
                    return BIKE_POWER_MEASUREMENT;
                case 25:
                    return DEVELOPMENT_TESTING;
                case 26:
                    return PSA_SAMPLE;
                case 27:
                    return VARIA_DEVICE_STATUS;
                case 28:
                    return BUTTON_EVENT;
                case 29:
                    return CYCLING_TORSO_SENSOR_MEASUREMENT;
                case 30:
                    return XCEL_STRENGTH;
                case 31:
                    return CONTROLLING_DEVICE_STATUS_CHANGE;
                case 32:
                    return XCEL_SPRINT;
                case 33:
                    return XERO_RANGEFINDER;
                case 34:
                    return XCEL_SPRINT_SENSOR_STATE;
                case 35:
                    return SOFTWARE_UPDATE_DOWNLOAD_PROGRESS;
                case 36:
                    return SOFTWARE_UPDATE_DOWNLOAD_READY;
                case 37:
                    return SOFTWARE_UPDATE_COMPLETED;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIEventSharingProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<AlertType> internalGetValueMap() {
            return internalValueMap;
        }

        public static AlertType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static AlertType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
