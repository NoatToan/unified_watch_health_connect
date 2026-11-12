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

/* JADX INFO: loaded from: classes5.dex */
public final class GDILimitedUi {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012GDILimitedUi.proto\u0012\u0013GDI.Proto.LimitedUi\u001a\rGDICore.proto\"\u0087\u0001\n\u0013CapabilitiesRequest2p\n\u0012limited_ui_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018% \u0001(\u000b2(.GDI.Proto.LimitedUi.CapabilitiesRequest\"Å\u0001\n\u0014CapabilitiesResponse\u00128\n\u0010supported_alerts\u0018\u0001 \u0003(\u000e2\u001e.GDI.Proto.LimitedUi.AlertType2s\n\u0013limited_ui_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018% \u0001(\u000b2).GDI.Proto.LimitedUi.CapabilitiesResponse\"Ó\u0001\n\u0011AlertNotification\u0012,\n\u0004type\u0018\u0001 \u0001(\u000e2\u001e.GDI.Proto.LimitedUi.AlertType\u0012\f\n\u0004data\u0018\u0002 \u0001(\r\u0012B\n\tgoal_data\u0018\u0003 \u0001(\u000b2/.GDI.Proto.LimitedUi.AlertNotification.GoalData\u001a>\n\bGoalData\u0012\f\n\u0004goal\u0018\u0001 \u0001(\r\u0012\u0010\n\bmultiple\u0018\u0002 \u0001(\r\u0012\u0012\n\nday_streak\u0018\u0003 \u0001(\r\"\u0016\n\u0014LogPermissionRequest\"+\n\u0015LogPermissionResponse\u0012\u0012\n\nis_allowed\u0018\u0001 \u0001(\b\"\u0011\n\u000fEndSleepRequest\"´\u0001\n\u0010EndSleepResponse\u0012C\n\bresponse\u0018\u0001 \u0001(\u000e21.GDI.Proto.LimitedUi.EndSleepResponse.SleepStatus\"[\n\u000bSleepStatus\u0012\u0012\n\u000eINVALID_STATUS\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u0018\n\u0014FAILURE_NOT_SLEEPING\u0010\u0002\u0012\u0011\n\rFAILURE_OTHER\u0010\u0003\"Ñ\b\n\u0007Service\u0012B\n\u0012alert_notification\u0018\u0001 \u0001(\u000b2&.GDI.Proto.LimitedUi.AlertNotification\u0012I\n\u0016log_permission_request\u0018\u0002 \u0001(\u000b2).GDI.Proto.LimitedUi.LogPermissionRequest\u0012K\n\u0017log_permission_response\u0018\u0003 \u0001(\u000b2*.GDI.Proto.LimitedUi.LogPermissionResponse\u0012?\n\u0011end_sleep_request\u0018\u0004 \u0001(\u000b2$.GDI.Proto.LimitedUi.EndSleepRequest\u0012A\n\u0012end_sleep_response\u0018\u0005 \u0001(\u000b2%.GDI.Proto.LimitedUi.EndSleepResponse\u0012U\n\u001cfavorite_sports_notification\u0018\u0006 \u0001(\u000b2/.GDI.Proto.LimitedUi.FavoriteSportsNotification\u0012K\n\u0017favorite_sports_request\u0018\u0007 \u0001(\u000b2*.GDI.Proto.LimitedUi.FavoriteSportsRequest\u0012M\n\u0018favorite_sports_response\u0018\b \u0001(\u000b2+.GDI.Proto.LimitedUi.FavoriteSportsResponse\u0012Y\n\u001cdistance_calibration_request\u0018\t \u0001(\u000b2/.GDI.Proto.LimitedUi.DistanceCalibrationRequestB\u0002\u0018\u0001\u0012[\n\u001ddistance_calibration_response\u0018\n \u0001(\u000b20.GDI.Proto.LimitedUi.DistanceCalibrationResponseB\u0002\u0018\u0001\u0012i\n!distance_calibration_notification\u0018\u000b \u0001(\u000b2:.GDI.Proto.LimitedUi.DistanceCalibrationCancelNotificationB\u0002\u0018\u0001\u0012b\n$distance_calibration_notification_v2\u0018\f \u0001(\u000b24.GDI.Proto.LimitedUi.DistanceCalibrationNotification\u0012l\n(distance_calibration_cancel_notification\u0018\r \u0001(\u000b2:.GDI.Proto.LimitedUi.DistanceCalibrationCancelNotification\"T\n\u001aFavoriteSportsNotification\u00126\n\u000ffavorite_sports\u0018\u0001 \u0003(\u000b2\u001d.GDI.Proto.LimitedUi.FitSport\"\u0017\n\u0015FavoriteSportsRequest\"P\n\u0016FavoriteSportsResponse\u00126\n\u000ffavorite_sports\u0018\u0001 \u0003(\u000b2\u001d.GDI.Proto.LimitedUi.FitSport\"4\n\bFitSport\u0012\u0011\n\tfit_sport\u0018\u0001 \u0002(\r\u0012\u0015\n\rfit_sub_sport\u0018\u0002 \u0002(\r\"8\n\u001aDistanceCalibrationRequest\u0012\u001a\n\u0012initial_distance_m\u0018\u0001 \u0001(\r\"7\n\u001bDistanceCalibrationResponse\u0012\u0018\n\u0010final_distance_m\u0018\u0001 \u0001(\r\"\u0097\u0001\n\u001fDistanceCalibrationNotification\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012\u001e\n\u0016is_initial_calibration\u0018\u0002 \u0001(\b\u0012\u0012\n\ndistance_m\u0018\u0003 \u0002(\r\u00124\n\ractivity_type\u0018\u0004 \u0001(\u000b2\u001d.GDI.Proto.LimitedUi.FitSport\"'\n%DistanceCalibrationCancelNotification*Ë\u0002\n\tAlertType\u0012\u000b\n\u0007INVALID\u0010\u0000\u0012\r\n\tSTEP_GOAL\u0010\u0001\u0012\u001a\n\u0016INTENSITY_MINUTES_GOAL\u0010\u0002\u0012\u000f\n\u000bFLOORS_GOAL\u0010\u0003\u0012\u000f\n\u000bPUSHES_GOAL\u0010\u0004\u0012\b\n\u0004MOVE\u0010\u0005\u0012\n\n\u0006STRESS\u0010\u0006\u0012\u0014\n\u0010ABNORMAL_HIGH_HR\u0010\u0007\u0012\u0013\n\u000fABNORMAL_LOW_HR\u0010\b\u0012\u000b\n\u0007JET_LAG\u0010\t\u0012\u0014\n\u0010SOFTWARE_UPDATED\u0010\n\u0012\u0012\n\u000eCHARGE_BATTERY\u0010\u000b\u0012\u0015\n\u0011SLEEP_SCORE_READY\u0010\f\u0012\u0016\n\u0012FITNESS_AGE_CHANGE\u0010\r\u0012\u0012\n\u000eVO2_MAX_CHANGE\u0010\u000e\u0012\u0010\n\fBROADCAST_HR\u0010\u000f\u0012\u0017\n\u0013BEDTIME_APPROACHING\u0010\u0010B,\n\u001acom.garmin.proto.generatedB\fGDILimitedUiH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_AlertNotification_GoalData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_AlertNotification_GoalData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_AlertNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_AlertNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_DistanceCalibrationCancelNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_DistanceCalibrationCancelNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_DistanceCalibrationNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_DistanceCalibrationNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_DistanceCalibrationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_DistanceCalibrationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_DistanceCalibrationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_DistanceCalibrationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_EndSleepRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_EndSleepRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_EndSleepResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_EndSleepResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_FavoriteSportsNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_FavoriteSportsNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_FavoriteSportsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_FavoriteSportsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_FavoriteSportsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_FavoriteSportsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_FitSport_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_FitSport_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_LogPermissionRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_LogPermissionRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_LogPermissionResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_LogPermissionResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LimitedUi_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LimitedUi_Service_fieldAccessorTable;

    public static final class AlertNotification extends GeneratedMessageV3 implements AlertNotificationOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        public static final int GOAL_DATA_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int data_;
        private GoalData goalData_;
        private byte memoizedIsInitialized;
        private int type_;
        private static final AlertNotification DEFAULT_INSTANCE = new AlertNotification();

        @Deprecated
        public static final Parser<AlertNotification> PARSER = new AbstractParser<AlertNotification>() { // from class: com.garmin.proto.generated.GDILimitedUi.AlertNotification.1
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

        public interface GoalDataOrBuilder extends MessageOrBuilder {
            int getDayStreak();

            int getGoal();

            int getMultiple();

            boolean hasDayStreak();

            boolean hasGoal();

            boolean hasMultiple();
        }

        private AlertNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.type_ = 0;
            this.data_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlertNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_AlertNotification_descriptor;
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
            if (hasType() != alertNotification.hasType()) {
                return false;
            }
            if ((hasType() && this.type_ != alertNotification.type_) || hasData() != alertNotification.hasData()) {
                return false;
            }
            if ((!hasData() || getData() == alertNotification.getData()) && hasGoalData() == alertNotification.hasGoalData()) {
                return (!hasGoalData() || getGoalData().equals(alertNotification.getGoalData())) && getUnknownFields().equals(alertNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
        public int getData() {
            return this.data_;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
        public GoalData getGoalData() {
            GoalData goalData = this.goalData_;
            return goalData == null ? GoalData.getDefaultInstance() : goalData;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
        public GoalDataOrBuilder getGoalDataOrBuilder() {
            GoalData goalData = this.goalData_;
            return goalData == null ? GoalData.getDefaultInstance() : goalData;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlertNotification> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.data_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getGoalData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
        public AlertType getType() {
            AlertType alertTypeForNumber = AlertType.forNumber(this.type_);
            return alertTypeForNumber == null ? AlertType.INVALID : alertTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
        public boolean hasGoalData() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
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
            if (hasData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getData();
            }
            if (hasGoalData()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getGoalData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_AlertNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertNotification.class, Builder.class);
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
            return new AlertNotification();
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
                codedOutputStream.writeUInt32(2, this.data_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getGoalData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class GoalData extends GeneratedMessageV3 implements GoalDataOrBuilder {
            public static final int DAY_STREAK_FIELD_NUMBER = 3;
            public static final int GOAL_FIELD_NUMBER = 1;
            public static final int MULTIPLE_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int dayStreak_;
            private int goal_;
            private byte memoizedIsInitialized;
            private int multiple_;
            private static final GoalData DEFAULT_INSTANCE = new GoalData();

            @Deprecated
            public static final Parser<GoalData> PARSER = new AbstractParser<GoalData>() { // from class: com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalData.1
                @Override // com.google.protobuf.Parser
                public GoalData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = GoalData.newBuilder();
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

            private GoalData(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.goal_ = 0;
                this.multiple_ = 0;
                this.dayStreak_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static GoalData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_AlertNotification_GoalData_descriptor;
            }

            public static Builder newBuilder(GoalData goalData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(goalData);
            }

            public static GoalData parseDelimitedFrom(InputStream inputStream) {
                return (GoalData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static GoalData parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<GoalData> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GoalData)) {
                    return super.equals(obj);
                }
                GoalData goalData = (GoalData) obj;
                if (hasGoal() != goalData.hasGoal()) {
                    return false;
                }
                if ((hasGoal() && getGoal() != goalData.getGoal()) || hasMultiple() != goalData.hasMultiple()) {
                    return false;
                }
                if ((!hasMultiple() || getMultiple() == goalData.getMultiple()) && hasDayStreak() == goalData.hasDayStreak()) {
                    return (!hasDayStreak() || getDayStreak() == goalData.getDayStreak()) && getUnknownFields().equals(goalData.getUnknownFields());
                }
                return false;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
            public int getDayStreak() {
                return this.dayStreak_;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
            public int getGoal() {
                return this.goal_;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
            public int getMultiple() {
                return this.multiple_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<GoalData> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.goal_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.multiple_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.dayStreak_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
            public boolean hasDayStreak() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
            public boolean hasGoal() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
            public boolean hasMultiple() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasGoal()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + getGoal();
                }
                if (hasMultiple()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + getMultiple();
                }
                if (hasDayStreak()) {
                    iHashCode = e5.c(iHashCode, 37, 3, 53) + getDayStreak();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_AlertNotification_GoalData_fieldAccessorTable.ensureFieldAccessorsInitialized(GoalData.class, Builder.class);
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
                return new GoalData();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeUInt32(1, this.goal_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeUInt32(2, this.multiple_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeUInt32(3, this.dayStreak_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GoalDataOrBuilder {
                private int bitField0_;
                private int dayStreak_;
                private int goal_;
                private int multiple_;

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private void buildPartial0(GoalData goalData) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        goalData.goal_ = this.goal_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        goalData.multiple_ = this.multiple_;
                        i14 |= 2;
                    }
                    if ((i15 & 4) != 0) {
                        goalData.dayStreak_ = this.dayStreak_;
                        i14 |= 4;
                    }
                    goalData.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_AlertNotification_GoalData_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public GoalData build() {
                    GoalData goalDataBuildPartial = buildPartial();
                    if (goalDataBuildPartial.isInitialized()) {
                        return goalDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) goalDataBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public GoalData buildPartial() {
                    GoalData goalData = new GoalData(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(goalData);
                    }
                    onBuilt();
                    return goalData;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.goal_ = 0;
                    this.multiple_ = 0;
                    this.dayStreak_ = 0;
                    return this;
                }

                public Builder clearDayStreak() {
                    this.bitField0_ &= -5;
                    this.dayStreak_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearGoal() {
                    this.bitField0_ &= -2;
                    this.goal_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearMultiple() {
                    this.bitField0_ &= -3;
                    this.multiple_ = 0;
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

                @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
                public int getDayStreak() {
                    return this.dayStreak_;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_AlertNotification_GoalData_descriptor;
                }

                @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
                public int getGoal() {
                    return this.goal_;
                }

                @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
                public int getMultiple() {
                    return this.multiple_;
                }

                @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
                public boolean hasDayStreak() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
                public boolean hasGoal() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotification.GoalDataOrBuilder
                public boolean hasMultiple() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_AlertNotification_GoalData_fieldAccessorTable.ensureFieldAccessorsInitialized(GoalData.class, Builder.class);
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
                                        this.goal_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 16) {
                                        this.multiple_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 24) {
                                        this.dayStreak_ = codedInputStream.readUInt32();
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

                public Builder setDayStreak(int i14) {
                    this.dayStreak_ = i14;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder setGoal(int i14) {
                    this.goal_ = i14;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setMultiple(int i14) {
                    this.multiple_ = i14;
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
                public GoalData getDefaultInstanceForType() {
                    return GoalData.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof GoalData) {
                        return mergeFrom((GoalData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(GoalData goalData) {
                    if (goalData == GoalData.getDefaultInstance()) {
                        return this;
                    }
                    if (goalData.hasGoal()) {
                        setGoal(goalData.getGoal());
                    }
                    if (goalData.hasMultiple()) {
                        setMultiple(goalData.getMultiple());
                    }
                    if (goalData.hasDayStreak()) {
                        setDayStreak(goalData.getDayStreak());
                    }
                    mergeUnknownFields(goalData.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GoalData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static GoalData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (GoalData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static GoalData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static GoalData parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static GoalData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static GoalData parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static GoalData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public /* synthetic */ GoalData(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }

            public static GoalData parseFrom(InputStream inputStream) {
                return (GoalData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            private GoalData() {
                this.goal_ = 0;
                this.multiple_ = 0;
                this.dayStreak_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static GoalData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (GoalData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static GoalData parseFrom(CodedInputStream codedInputStream) {
                return (GoalData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static GoalData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (GoalData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertNotificationOrBuilder {
            private int bitField0_;
            private int data_;
            private SingleFieldBuilderV3<GoalData, GoalData.Builder, GoalDataOrBuilder> goalDataBuilder_;
            private GoalData goalData_;
            private int type_;

            private Builder() {
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AlertNotification alertNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    alertNotification.type_ = this.type_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    alertNotification.data_ = this.data_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GoalData, GoalData.Builder, GoalDataOrBuilder> singleFieldBuilderV3 = this.goalDataBuilder_;
                    alertNotification.goalData_ = singleFieldBuilderV3 == null ? this.goalData_ : (GoalData) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                alertNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_AlertNotification_descriptor;
            }

            private SingleFieldBuilderV3<GoalData, GoalData.Builder, GoalDataOrBuilder> getGoalDataFieldBuilder() {
                if (this.goalDataBuilder_ == null) {
                    this.goalDataBuilder_ = new SingleFieldBuilderV3<>(getGoalData(), getParentForChildren(), isClean());
                    this.goalData_ = null;
                }
                return this.goalDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getGoalDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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
                if (this.bitField0_ != 0) {
                    buildPartial0(alertNotification);
                }
                onBuilt();
                return alertNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 0;
                this.data_ = 0;
                this.goalData_ = null;
                SingleFieldBuilderV3<GoalData, GoalData.Builder, GoalDataOrBuilder> singleFieldBuilderV3 = this.goalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.goalDataBuilder_ = null;
                }
                return this;
            }

            public Builder clearData() {
                this.bitField0_ &= -3;
                this.data_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGoalData() {
                this.bitField0_ &= -5;
                this.goalData_ = null;
                SingleFieldBuilderV3<GoalData, GoalData.Builder, GoalDataOrBuilder> singleFieldBuilderV3 = this.goalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.goalDataBuilder_ = null;
                }
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

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
            public int getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_AlertNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
            public GoalData getGoalData() {
                SingleFieldBuilderV3<GoalData, GoalData.Builder, GoalDataOrBuilder> singleFieldBuilderV3 = this.goalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GoalData) singleFieldBuilderV3.getMessage();
                }
                GoalData goalData = this.goalData_;
                return goalData == null ? GoalData.getDefaultInstance() : goalData;
            }

            public GoalData.Builder getGoalDataBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GoalData.Builder) getGoalDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
            public GoalDataOrBuilder getGoalDataOrBuilder() {
                SingleFieldBuilderV3<GoalData, GoalData.Builder, GoalDataOrBuilder> singleFieldBuilderV3 = this.goalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GoalDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GoalData goalData = this.goalData_;
                return goalData == null ? GoalData.getDefaultInstance() : goalData;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
            public AlertType getType() {
                AlertType alertTypeForNumber = AlertType.forNumber(this.type_);
                return alertTypeForNumber == null ? AlertType.INVALID : alertTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
            public boolean hasGoalData() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.AlertNotificationOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_AlertNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertNotification.class, Builder.class);
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
                                    this.data_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getGoalDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeGoalData(GoalData goalData) {
                GoalData goalData2;
                SingleFieldBuilderV3<GoalData, GoalData.Builder, GoalDataOrBuilder> singleFieldBuilderV3 = this.goalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(goalData);
                } else if ((this.bitField0_ & 4) == 0 || (goalData2 = this.goalData_) == null || goalData2 == GoalData.getDefaultInstance()) {
                    this.goalData_ = goalData;
                } else {
                    getGoalDataBuilder().mergeFrom(goalData);
                }
                if (this.goalData_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setData(int i14) {
                this.data_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGoalData(GoalData.Builder builder) {
                SingleFieldBuilderV3<GoalData, GoalData.Builder, GoalDataOrBuilder> singleFieldBuilderV3 = this.goalDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.goalData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
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
            public AlertNotification getDefaultInstanceForType() {
                return AlertNotification.getDefaultInstance();
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

            public Builder setGoalData(GoalData goalData) {
                SingleFieldBuilderV3<GoalData, GoalData.Builder, GoalDataOrBuilder> singleFieldBuilderV3 = this.goalDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    goalData.getClass();
                    this.goalData_ = goalData;
                } else {
                    singleFieldBuilderV3.setMessage(goalData);
                }
                this.bitField0_ |= 4;
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
                if (alertNotification.hasType()) {
                    setType(alertNotification.getType());
                }
                if (alertNotification.hasData()) {
                    setData(alertNotification.getData());
                }
                if (alertNotification.hasGoalData()) {
                    mergeGoalData(alertNotification.getGoalData());
                }
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

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlertNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ AlertNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AlertNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private AlertNotification() {
            this.data_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
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

    public interface AlertNotificationOrBuilder extends MessageOrBuilder {
        int getData();

        AlertNotification.GoalData getGoalData();

        AlertNotification.GoalDataOrBuilder getGoalDataOrBuilder();

        AlertType getType();

        boolean hasData();

        boolean hasGoalData();

        boolean hasType();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        AlertType getSupportedAlerts(int i14);

        int getSupportedAlertsCount();

        List<AlertType> getSupportedAlertsList();
    }

    public interface DistanceCalibrationCancelNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface DistanceCalibrationNotificationOrBuilder extends MessageOrBuilder {
        FitSport getActivityType();

        FitSportOrBuilder getActivityTypeOrBuilder();

        int getDistanceM();

        int getId();

        boolean getIsInitialCalibration();

        boolean hasActivityType();

        boolean hasDistanceM();

        boolean hasId();

        boolean hasIsInitialCalibration();
    }

    public interface DistanceCalibrationRequestOrBuilder extends MessageOrBuilder {
        int getInitialDistanceM();

        boolean hasInitialDistanceM();
    }

    public interface DistanceCalibrationResponseOrBuilder extends MessageOrBuilder {
        int getFinalDistanceM();

        boolean hasFinalDistanceM();
    }

    public interface EndSleepRequestOrBuilder extends MessageOrBuilder {
    }

    public interface EndSleepResponseOrBuilder extends MessageOrBuilder {
        EndSleepResponse.SleepStatus getResponse();

        boolean hasResponse();
    }

    public interface FavoriteSportsNotificationOrBuilder extends MessageOrBuilder {
        FitSport getFavoriteSports(int i14);

        int getFavoriteSportsCount();

        List<FitSport> getFavoriteSportsList();

        FitSportOrBuilder getFavoriteSportsOrBuilder(int i14);

        List<? extends FitSportOrBuilder> getFavoriteSportsOrBuilderList();
    }

    public interface FavoriteSportsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface FavoriteSportsResponseOrBuilder extends MessageOrBuilder {
        FitSport getFavoriteSports(int i14);

        int getFavoriteSportsCount();

        List<FitSport> getFavoriteSportsList();

        FitSportOrBuilder getFavoriteSportsOrBuilder(int i14);

        List<? extends FitSportOrBuilder> getFavoriteSportsOrBuilderList();
    }

    public interface FitSportOrBuilder extends MessageOrBuilder {
        int getFitSport();

        int getFitSubSport();

        boolean hasFitSport();

        boolean hasFitSubSport();
    }

    public interface LogPermissionRequestOrBuilder extends MessageOrBuilder {
    }

    public interface LogPermissionResponseOrBuilder extends MessageOrBuilder {
        boolean getIsAllowed();

        boolean hasIsAllowed();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        AlertNotification getAlertNotification();

        AlertNotificationOrBuilder getAlertNotificationOrBuilder();

        DistanceCalibrationCancelNotification getDistanceCalibrationCancelNotification();

        DistanceCalibrationCancelNotificationOrBuilder getDistanceCalibrationCancelNotificationOrBuilder();

        @Deprecated
        DistanceCalibrationCancelNotification getDistanceCalibrationNotification();

        @Deprecated
        DistanceCalibrationCancelNotificationOrBuilder getDistanceCalibrationNotificationOrBuilder();

        DistanceCalibrationNotification getDistanceCalibrationNotificationV2();

        DistanceCalibrationNotificationOrBuilder getDistanceCalibrationNotificationV2OrBuilder();

        @Deprecated
        DistanceCalibrationRequest getDistanceCalibrationRequest();

        @Deprecated
        DistanceCalibrationRequestOrBuilder getDistanceCalibrationRequestOrBuilder();

        @Deprecated
        DistanceCalibrationResponse getDistanceCalibrationResponse();

        @Deprecated
        DistanceCalibrationResponseOrBuilder getDistanceCalibrationResponseOrBuilder();

        EndSleepRequest getEndSleepRequest();

        EndSleepRequestOrBuilder getEndSleepRequestOrBuilder();

        EndSleepResponse getEndSleepResponse();

        EndSleepResponseOrBuilder getEndSleepResponseOrBuilder();

        FavoriteSportsNotification getFavoriteSportsNotification();

        FavoriteSportsNotificationOrBuilder getFavoriteSportsNotificationOrBuilder();

        FavoriteSportsRequest getFavoriteSportsRequest();

        FavoriteSportsRequestOrBuilder getFavoriteSportsRequestOrBuilder();

        FavoriteSportsResponse getFavoriteSportsResponse();

        FavoriteSportsResponseOrBuilder getFavoriteSportsResponseOrBuilder();

        LogPermissionRequest getLogPermissionRequest();

        LogPermissionRequestOrBuilder getLogPermissionRequestOrBuilder();

        LogPermissionResponse getLogPermissionResponse();

        LogPermissionResponseOrBuilder getLogPermissionResponseOrBuilder();

        boolean hasAlertNotification();

        boolean hasDistanceCalibrationCancelNotification();

        @Deprecated
        boolean hasDistanceCalibrationNotification();

        boolean hasDistanceCalibrationNotificationV2();

        @Deprecated
        boolean hasDistanceCalibrationRequest();

        @Deprecated
        boolean hasDistanceCalibrationResponse();

        boolean hasEndSleepRequest();

        boolean hasEndSleepResponse();

        boolean hasFavoriteSportsNotification();

        boolean hasFavoriteSportsRequest();

        boolean hasFavoriteSportsResponse();

        boolean hasLogPermissionRequest();

        boolean hasLogPermissionResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_LimitedUi_CapabilitiesRequest_descriptor = descriptor2;
        internal_static_GDI_Proto_LimitedUi_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[0]);
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_LimitedUi_CapabilitiesResponse_descriptor = descriptor3;
        internal_static_GDI_Proto_LimitedUi_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"SupportedAlerts"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_LimitedUi_AlertNotification_descriptor = descriptor4;
        internal_static_GDI_Proto_LimitedUi_AlertNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Type", "Data", "GoalData"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_GDI_Proto_LimitedUi_AlertNotification_GoalData_descriptor = descriptor5;
        internal_static_GDI_Proto_LimitedUi_AlertNotification_GoalData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Goal", "Multiple", "DayStreak"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_LimitedUi_LogPermissionRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_LimitedUi_LogPermissionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[0]);
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_LimitedUi_LogPermissionResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_LimitedUi_LogPermissionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"IsAllowed"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_LimitedUi_EndSleepRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_LimitedUi_EndSleepRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[0]);
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_LimitedUi_EndSleepResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_LimitedUi_EndSleepResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Response"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_LimitedUi_Service_descriptor = descriptor10;
        internal_static_GDI_Proto_LimitedUi_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"AlertNotification", "LogPermissionRequest", "LogPermissionResponse", "EndSleepRequest", "EndSleepResponse", "FavoriteSportsNotification", "FavoriteSportsRequest", "FavoriteSportsResponse", "DistanceCalibrationRequest", "DistanceCalibrationResponse", "DistanceCalibrationNotification", "DistanceCalibrationNotificationV2", "DistanceCalibrationCancelNotification"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_LimitedUi_FavoriteSportsNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_LimitedUi_FavoriteSportsNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"FavoriteSports"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_LimitedUi_FavoriteSportsRequest_descriptor = descriptor12;
        internal_static_GDI_Proto_LimitedUi_FavoriteSportsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[0]);
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_LimitedUi_FavoriteSportsResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_LimitedUi_FavoriteSportsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"FavoriteSports"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_LimitedUi_FitSport_descriptor = descriptor14;
        internal_static_GDI_Proto_LimitedUi_FitSport_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"FitSport", "FitSubSport"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_LimitedUi_DistanceCalibrationRequest_descriptor = descriptor15;
        internal_static_GDI_Proto_LimitedUi_DistanceCalibrationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"InitialDistanceM"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_LimitedUi_DistanceCalibrationResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_LimitedUi_DistanceCalibrationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"FinalDistanceM"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_LimitedUi_DistanceCalibrationNotification_descriptor = descriptor17;
        internal_static_GDI_Proto_LimitedUi_DistanceCalibrationNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Id", "IsInitialCalibration", "DistanceM", "ActivityType"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_LimitedUi_DistanceCalibrationCancelNotification_descriptor = descriptor18;
        internal_static_GDI_Proto_LimitedUi_DistanceCalibrationCancelNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[0]);
        GDICore.getDescriptor();
    }

    private GDILimitedUi() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.limitedUiRequest);
        extensionRegistryLite.add(CapabilitiesResponse.limitedUiResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int LIMITED_UI_REQUEST_FIELD_NUMBER = 37;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDILimitedUi.CapabilitiesRequest.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> limitedUiRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_CapabilitiesRequest_descriptor;
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
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_CapabilitiesRequest_descriptor;
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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

    public static final class DistanceCalibrationCancelNotification extends GeneratedMessageV3 implements DistanceCalibrationCancelNotificationOrBuilder {
        private static final DistanceCalibrationCancelNotification DEFAULT_INSTANCE = new DistanceCalibrationCancelNotification();

        @Deprecated
        public static final Parser<DistanceCalibrationCancelNotification> PARSER = new AbstractParser<DistanceCalibrationCancelNotification>() { // from class: com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationCancelNotification.1
            @Override // com.google.protobuf.Parser
            public DistanceCalibrationCancelNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DistanceCalibrationCancelNotification.newBuilder();
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

        private DistanceCalibrationCancelNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DistanceCalibrationCancelNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationCancelNotification_descriptor;
        }

        public static Builder newBuilder(DistanceCalibrationCancelNotification distanceCalibrationCancelNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(distanceCalibrationCancelNotification);
        }

        public static DistanceCalibrationCancelNotification parseDelimitedFrom(InputStream inputStream) {
            return (DistanceCalibrationCancelNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DistanceCalibrationCancelNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DistanceCalibrationCancelNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof DistanceCalibrationCancelNotification) {
                return getUnknownFields().equals(((DistanceCalibrationCancelNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DistanceCalibrationCancelNotification> getParserForType() {
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
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationCancelNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DistanceCalibrationCancelNotification.class, Builder.class);
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
            return new DistanceCalibrationCancelNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DistanceCalibrationCancelNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationCancelNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DistanceCalibrationCancelNotification build() {
                DistanceCalibrationCancelNotification distanceCalibrationCancelNotificationBuildPartial = buildPartial();
                if (distanceCalibrationCancelNotificationBuildPartial.isInitialized()) {
                    return distanceCalibrationCancelNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) distanceCalibrationCancelNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DistanceCalibrationCancelNotification buildPartial() {
                DistanceCalibrationCancelNotification distanceCalibrationCancelNotification = new DistanceCalibrationCancelNotification(this);
                onBuilt();
                return distanceCalibrationCancelNotification;
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationCancelNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationCancelNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DistanceCalibrationCancelNotification.class, Builder.class);
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
            public DistanceCalibrationCancelNotification getDefaultInstanceForType() {
                return DistanceCalibrationCancelNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DistanceCalibrationCancelNotification) {
                    return mergeFrom((DistanceCalibrationCancelNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DistanceCalibrationCancelNotification distanceCalibrationCancelNotification) {
                if (distanceCalibrationCancelNotification == DistanceCalibrationCancelNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(distanceCalibrationCancelNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DistanceCalibrationCancelNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DistanceCalibrationCancelNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DistanceCalibrationCancelNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DistanceCalibrationCancelNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationCancelNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DistanceCalibrationCancelNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DistanceCalibrationCancelNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DistanceCalibrationCancelNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DistanceCalibrationCancelNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DistanceCalibrationCancelNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DistanceCalibrationCancelNotification parseFrom(InputStream inputStream) {
            return (DistanceCalibrationCancelNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DistanceCalibrationCancelNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationCancelNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DistanceCalibrationCancelNotification parseFrom(CodedInputStream codedInputStream) {
            return (DistanceCalibrationCancelNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DistanceCalibrationCancelNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationCancelNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DistanceCalibrationRequest extends GeneratedMessageV3 implements DistanceCalibrationRequestOrBuilder {
        public static final int INITIAL_DISTANCE_M_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int initialDistanceM_;
        private byte memoizedIsInitialized;
        private static final DistanceCalibrationRequest DEFAULT_INSTANCE = new DistanceCalibrationRequest();

        @Deprecated
        public static final Parser<DistanceCalibrationRequest> PARSER = new AbstractParser<DistanceCalibrationRequest>() { // from class: com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationRequest.1
            @Override // com.google.protobuf.Parser
            public DistanceCalibrationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DistanceCalibrationRequest.newBuilder();
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

        private DistanceCalibrationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.initialDistanceM_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DistanceCalibrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationRequest_descriptor;
        }

        public static Builder newBuilder(DistanceCalibrationRequest distanceCalibrationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(distanceCalibrationRequest);
        }

        public static DistanceCalibrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (DistanceCalibrationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DistanceCalibrationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DistanceCalibrationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DistanceCalibrationRequest)) {
                return super.equals(obj);
            }
            DistanceCalibrationRequest distanceCalibrationRequest = (DistanceCalibrationRequest) obj;
            if (hasInitialDistanceM() != distanceCalibrationRequest.hasInitialDistanceM()) {
                return false;
            }
            return (!hasInitialDistanceM() || getInitialDistanceM() == distanceCalibrationRequest.getInitialDistanceM()) && getUnknownFields().equals(distanceCalibrationRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationRequestOrBuilder
        public int getInitialDistanceM() {
            return this.initialDistanceM_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DistanceCalibrationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.initialDistanceM_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationRequestOrBuilder
        public boolean hasInitialDistanceM() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasInitialDistanceM()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getInitialDistanceM();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DistanceCalibrationRequest.class, Builder.class);
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
            return new DistanceCalibrationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.initialDistanceM_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DistanceCalibrationRequestOrBuilder {
            private int bitField0_;
            private int initialDistanceM_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DistanceCalibrationRequest distanceCalibrationRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    distanceCalibrationRequest.initialDistanceM_ = this.initialDistanceM_;
                } else {
                    i14 = 0;
                }
                distanceCalibrationRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DistanceCalibrationRequest build() {
                DistanceCalibrationRequest distanceCalibrationRequestBuildPartial = buildPartial();
                if (distanceCalibrationRequestBuildPartial.isInitialized()) {
                    return distanceCalibrationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) distanceCalibrationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DistanceCalibrationRequest buildPartial() {
                DistanceCalibrationRequest distanceCalibrationRequest = new DistanceCalibrationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(distanceCalibrationRequest);
                }
                onBuilt();
                return distanceCalibrationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.initialDistanceM_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInitialDistanceM() {
                this.bitField0_ &= -2;
                this.initialDistanceM_ = 0;
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationRequestOrBuilder
            public int getInitialDistanceM() {
                return this.initialDistanceM_;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationRequestOrBuilder
            public boolean hasInitialDistanceM() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DistanceCalibrationRequest.class, Builder.class);
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
                                    this.initialDistanceM_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInitialDistanceM(int i14) {
                this.initialDistanceM_ = i14;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DistanceCalibrationRequest getDefaultInstanceForType() {
                return DistanceCalibrationRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DistanceCalibrationRequest) {
                    return mergeFrom((DistanceCalibrationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DistanceCalibrationRequest distanceCalibrationRequest) {
                if (distanceCalibrationRequest == DistanceCalibrationRequest.getDefaultInstance()) {
                    return this;
                }
                if (distanceCalibrationRequest.hasInitialDistanceM()) {
                    setInitialDistanceM(distanceCalibrationRequest.getInitialDistanceM());
                }
                mergeUnknownFields(distanceCalibrationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DistanceCalibrationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DistanceCalibrationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DistanceCalibrationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DistanceCalibrationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DistanceCalibrationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DistanceCalibrationRequest() {
            this.initialDistanceM_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DistanceCalibrationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DistanceCalibrationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DistanceCalibrationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DistanceCalibrationRequest parseFrom(InputStream inputStream) {
            return (DistanceCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DistanceCalibrationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DistanceCalibrationRequest parseFrom(CodedInputStream codedInputStream) {
            return (DistanceCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DistanceCalibrationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DistanceCalibrationResponse extends GeneratedMessageV3 implements DistanceCalibrationResponseOrBuilder {
        public static final int FINAL_DISTANCE_M_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int finalDistanceM_;
        private byte memoizedIsInitialized;
        private static final DistanceCalibrationResponse DEFAULT_INSTANCE = new DistanceCalibrationResponse();

        @Deprecated
        public static final Parser<DistanceCalibrationResponse> PARSER = new AbstractParser<DistanceCalibrationResponse>() { // from class: com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationResponse.1
            @Override // com.google.protobuf.Parser
            public DistanceCalibrationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DistanceCalibrationResponse.newBuilder();
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

        private DistanceCalibrationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.finalDistanceM_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DistanceCalibrationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationResponse_descriptor;
        }

        public static Builder newBuilder(DistanceCalibrationResponse distanceCalibrationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(distanceCalibrationResponse);
        }

        public static DistanceCalibrationResponse parseDelimitedFrom(InputStream inputStream) {
            return (DistanceCalibrationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DistanceCalibrationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DistanceCalibrationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DistanceCalibrationResponse)) {
                return super.equals(obj);
            }
            DistanceCalibrationResponse distanceCalibrationResponse = (DistanceCalibrationResponse) obj;
            if (hasFinalDistanceM() != distanceCalibrationResponse.hasFinalDistanceM()) {
                return false;
            }
            return (!hasFinalDistanceM() || getFinalDistanceM() == distanceCalibrationResponse.getFinalDistanceM()) && getUnknownFields().equals(distanceCalibrationResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationResponseOrBuilder
        public int getFinalDistanceM() {
            return this.finalDistanceM_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DistanceCalibrationResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.finalDistanceM_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationResponseOrBuilder
        public boolean hasFinalDistanceM() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFinalDistanceM()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getFinalDistanceM();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DistanceCalibrationResponse.class, Builder.class);
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
            return new DistanceCalibrationResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.finalDistanceM_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DistanceCalibrationResponseOrBuilder {
            private int bitField0_;
            private int finalDistanceM_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DistanceCalibrationResponse distanceCalibrationResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    distanceCalibrationResponse.finalDistanceM_ = this.finalDistanceM_;
                } else {
                    i14 = 0;
                }
                distanceCalibrationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DistanceCalibrationResponse build() {
                DistanceCalibrationResponse distanceCalibrationResponseBuildPartial = buildPartial();
                if (distanceCalibrationResponseBuildPartial.isInitialized()) {
                    return distanceCalibrationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) distanceCalibrationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DistanceCalibrationResponse buildPartial() {
                DistanceCalibrationResponse distanceCalibrationResponse = new DistanceCalibrationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(distanceCalibrationResponse);
                }
                onBuilt();
                return distanceCalibrationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.finalDistanceM_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFinalDistanceM() {
                this.bitField0_ &= -2;
                this.finalDistanceM_ = 0;
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationResponseOrBuilder
            public int getFinalDistanceM() {
                return this.finalDistanceM_;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationResponseOrBuilder
            public boolean hasFinalDistanceM() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DistanceCalibrationResponse.class, Builder.class);
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
                                    this.finalDistanceM_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFinalDistanceM(int i14) {
                this.finalDistanceM_ = i14;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DistanceCalibrationResponse getDefaultInstanceForType() {
                return DistanceCalibrationResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DistanceCalibrationResponse) {
                    return mergeFrom((DistanceCalibrationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DistanceCalibrationResponse distanceCalibrationResponse) {
                if (distanceCalibrationResponse == DistanceCalibrationResponse.getDefaultInstance()) {
                    return this;
                }
                if (distanceCalibrationResponse.hasFinalDistanceM()) {
                    setFinalDistanceM(distanceCalibrationResponse.getFinalDistanceM());
                }
                mergeUnknownFields(distanceCalibrationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DistanceCalibrationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DistanceCalibrationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DistanceCalibrationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DistanceCalibrationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DistanceCalibrationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DistanceCalibrationResponse() {
            this.finalDistanceM_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DistanceCalibrationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DistanceCalibrationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DistanceCalibrationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DistanceCalibrationResponse parseFrom(InputStream inputStream) {
            return (DistanceCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DistanceCalibrationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DistanceCalibrationResponse parseFrom(CodedInputStream codedInputStream) {
            return (DistanceCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DistanceCalibrationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EndSleepRequest extends GeneratedMessageV3 implements EndSleepRequestOrBuilder {
        private static final EndSleepRequest DEFAULT_INSTANCE = new EndSleepRequest();

        @Deprecated
        public static final Parser<EndSleepRequest> PARSER = new AbstractParser<EndSleepRequest>() { // from class: com.garmin.proto.generated.GDILimitedUi.EndSleepRequest.1
            @Override // com.google.protobuf.Parser
            public EndSleepRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EndSleepRequest.newBuilder();
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

        private EndSleepRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EndSleepRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_EndSleepRequest_descriptor;
        }

        public static Builder newBuilder(EndSleepRequest endSleepRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(endSleepRequest);
        }

        public static EndSleepRequest parseDelimitedFrom(InputStream inputStream) {
            return (EndSleepRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EndSleepRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EndSleepRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof EndSleepRequest) {
                return getUnknownFields().equals(((EndSleepRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EndSleepRequest> getParserForType() {
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
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_EndSleepRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EndSleepRequest.class, Builder.class);
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
            return new EndSleepRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EndSleepRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_EndSleepRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EndSleepRequest build() {
                EndSleepRequest endSleepRequestBuildPartial = buildPartial();
                if (endSleepRequestBuildPartial.isInitialized()) {
                    return endSleepRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) endSleepRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EndSleepRequest buildPartial() {
                EndSleepRequest endSleepRequest = new EndSleepRequest(this);
                onBuilt();
                return endSleepRequest;
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_EndSleepRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_EndSleepRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EndSleepRequest.class, Builder.class);
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
            public EndSleepRequest getDefaultInstanceForType() {
                return EndSleepRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EndSleepRequest) {
                    return mergeFrom((EndSleepRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EndSleepRequest endSleepRequest) {
                if (endSleepRequest == EndSleepRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(endSleepRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EndSleepRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ EndSleepRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EndSleepRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EndSleepRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EndSleepRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EndSleepRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EndSleepRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EndSleepRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EndSleepRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EndSleepRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EndSleepRequest parseFrom(InputStream inputStream) {
            return (EndSleepRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EndSleepRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EndSleepRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EndSleepRequest parseFrom(CodedInputStream codedInputStream) {
            return (EndSleepRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EndSleepRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EndSleepRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FavoriteSportsRequest extends GeneratedMessageV3 implements FavoriteSportsRequestOrBuilder {
        private static final FavoriteSportsRequest DEFAULT_INSTANCE = new FavoriteSportsRequest();

        @Deprecated
        public static final Parser<FavoriteSportsRequest> PARSER = new AbstractParser<FavoriteSportsRequest>() { // from class: com.garmin.proto.generated.GDILimitedUi.FavoriteSportsRequest.1
            @Override // com.google.protobuf.Parser
            public FavoriteSportsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FavoriteSportsRequest.newBuilder();
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

        private FavoriteSportsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FavoriteSportsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsRequest_descriptor;
        }

        public static Builder newBuilder(FavoriteSportsRequest favoriteSportsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(favoriteSportsRequest);
        }

        public static FavoriteSportsRequest parseDelimitedFrom(InputStream inputStream) {
            return (FavoriteSportsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FavoriteSportsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FavoriteSportsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof FavoriteSportsRequest) {
                return getUnknownFields().equals(((FavoriteSportsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FavoriteSportsRequest> getParserForType() {
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
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteSportsRequest.class, Builder.class);
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
            return new FavoriteSportsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FavoriteSportsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteSportsRequest build() {
                FavoriteSportsRequest favoriteSportsRequestBuildPartial = buildPartial();
                if (favoriteSportsRequestBuildPartial.isInitialized()) {
                    return favoriteSportsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) favoriteSportsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteSportsRequest buildPartial() {
                FavoriteSportsRequest favoriteSportsRequest = new FavoriteSportsRequest(this);
                onBuilt();
                return favoriteSportsRequest;
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteSportsRequest.class, Builder.class);
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
            public FavoriteSportsRequest getDefaultInstanceForType() {
                return FavoriteSportsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FavoriteSportsRequest) {
                    return mergeFrom((FavoriteSportsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FavoriteSportsRequest favoriteSportsRequest) {
                if (favoriteSportsRequest == FavoriteSportsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(favoriteSportsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FavoriteSportsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ FavoriteSportsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private FavoriteSportsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FavoriteSportsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteSportsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteSportsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FavoriteSportsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FavoriteSportsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FavoriteSportsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FavoriteSportsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FavoriteSportsRequest parseFrom(InputStream inputStream) {
            return (FavoriteSportsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FavoriteSportsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteSportsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteSportsRequest parseFrom(CodedInputStream codedInputStream) {
            return (FavoriteSportsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FavoriteSportsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteSportsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FitSport extends GeneratedMessageV3 implements FitSportOrBuilder {
        public static final int FIT_SPORT_FIELD_NUMBER = 1;
        public static final int FIT_SUB_SPORT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int fitSport_;
        private int fitSubSport_;
        private byte memoizedIsInitialized;
        private static final FitSport DEFAULT_INSTANCE = new FitSport();

        @Deprecated
        public static final Parser<FitSport> PARSER = new AbstractParser<FitSport>() { // from class: com.garmin.proto.generated.GDILimitedUi.FitSport.1
            @Override // com.google.protobuf.Parser
            public FitSport parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FitSport.newBuilder();
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

        private FitSport(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.fitSport_ = 0;
            this.fitSubSport_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FitSport getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FitSport_descriptor;
        }

        public static Builder newBuilder(FitSport fitSport) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fitSport);
        }

        public static FitSport parseDelimitedFrom(InputStream inputStream) {
            return (FitSport) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FitSport parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FitSport> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FitSport)) {
                return super.equals(obj);
            }
            FitSport fitSport = (FitSport) obj;
            if (hasFitSport() != fitSport.hasFitSport()) {
                return false;
            }
            if ((!hasFitSport() || getFitSport() == fitSport.getFitSport()) && hasFitSubSport() == fitSport.hasFitSubSport()) {
                return (!hasFitSubSport() || getFitSubSport() == fitSport.getFitSubSport()) && getUnknownFields().equals(fitSport.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FitSportOrBuilder
        public int getFitSport() {
            return this.fitSport_;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FitSportOrBuilder
        public int getFitSubSport() {
            return this.fitSubSport_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FitSport> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.fitSport_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.fitSubSport_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FitSportOrBuilder
        public boolean hasFitSport() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FitSportOrBuilder
        public boolean hasFitSubSport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFitSport()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getFitSport();
            }
            if (hasFitSubSport()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFitSubSport();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FitSport_fieldAccessorTable.ensureFieldAccessorsInitialized(FitSport.class, Builder.class);
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
            if (!hasFitSport()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFitSubSport()) {
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
            return new FitSport();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.fitSport_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.fitSubSport_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FitSportOrBuilder {
            private int bitField0_;
            private int fitSport_;
            private int fitSubSport_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(FitSport fitSport) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    fitSport.fitSport_ = this.fitSport_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    fitSport.fitSubSport_ = this.fitSubSport_;
                    i14 |= 2;
                }
                fitSport.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FitSport_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FitSport build() {
                FitSport fitSportBuildPartial = buildPartial();
                if (fitSportBuildPartial.isInitialized()) {
                    return fitSportBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fitSportBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FitSport buildPartial() {
                FitSport fitSport = new FitSport(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(fitSport);
                }
                onBuilt();
                return fitSport;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.fitSport_ = 0;
                this.fitSubSport_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFitSport() {
                this.bitField0_ &= -2;
                this.fitSport_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFitSubSport() {
                this.bitField0_ &= -3;
                this.fitSubSport_ = 0;
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FitSport_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FitSportOrBuilder
            public int getFitSport() {
                return this.fitSport_;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FitSportOrBuilder
            public int getFitSubSport() {
                return this.fitSubSport_;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FitSportOrBuilder
            public boolean hasFitSport() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FitSportOrBuilder
            public boolean hasFitSubSport() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FitSport_fieldAccessorTable.ensureFieldAccessorsInitialized(FitSport.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasFitSport() && hasFitSubSport();
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
                                    this.fitSport_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.fitSubSport_ = codedInputStream.readUInt32();
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

            public Builder setFitSport(int i14) {
                this.fitSport_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setFitSubSport(int i14) {
                this.fitSubSport_ = i14;
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
            public FitSport getDefaultInstanceForType() {
                return FitSport.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FitSport) {
                    return mergeFrom((FitSport) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FitSport fitSport) {
                if (fitSport == FitSport.getDefaultInstance()) {
                    return this;
                }
                if (fitSport.hasFitSport()) {
                    setFitSport(fitSport.getFitSport());
                }
                if (fitSport.hasFitSubSport()) {
                    setFitSubSport(fitSport.getFitSubSport());
                }
                mergeUnknownFields(fitSport.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FitSport getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FitSport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FitSport) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FitSport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FitSport parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FitSport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ FitSport(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FitSport parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private FitSport() {
            this.fitSport_ = 0;
            this.fitSubSport_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FitSport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FitSport parseFrom(InputStream inputStream) {
            return (FitSport) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FitSport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FitSport) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FitSport parseFrom(CodedInputStream codedInputStream) {
            return (FitSport) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FitSport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FitSport) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LogPermissionRequest extends GeneratedMessageV3 implements LogPermissionRequestOrBuilder {
        private static final LogPermissionRequest DEFAULT_INSTANCE = new LogPermissionRequest();

        @Deprecated
        public static final Parser<LogPermissionRequest> PARSER = new AbstractParser<LogPermissionRequest>() { // from class: com.garmin.proto.generated.GDILimitedUi.LogPermissionRequest.1
            @Override // com.google.protobuf.Parser
            public LogPermissionRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LogPermissionRequest.newBuilder();
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

        private LogPermissionRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LogPermissionRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_LogPermissionRequest_descriptor;
        }

        public static Builder newBuilder(LogPermissionRequest logPermissionRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(logPermissionRequest);
        }

        public static LogPermissionRequest parseDelimitedFrom(InputStream inputStream) {
            return (LogPermissionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LogPermissionRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LogPermissionRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof LogPermissionRequest) {
                return getUnknownFields().equals(((LogPermissionRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LogPermissionRequest> getParserForType() {
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
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_LogPermissionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LogPermissionRequest.class, Builder.class);
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
            return new LogPermissionRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LogPermissionRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_LogPermissionRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LogPermissionRequest build() {
                LogPermissionRequest logPermissionRequestBuildPartial = buildPartial();
                if (logPermissionRequestBuildPartial.isInitialized()) {
                    return logPermissionRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) logPermissionRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LogPermissionRequest buildPartial() {
                LogPermissionRequest logPermissionRequest = new LogPermissionRequest(this);
                onBuilt();
                return logPermissionRequest;
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_LogPermissionRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_LogPermissionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LogPermissionRequest.class, Builder.class);
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
            public LogPermissionRequest getDefaultInstanceForType() {
                return LogPermissionRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LogPermissionRequest) {
                    return mergeFrom((LogPermissionRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LogPermissionRequest logPermissionRequest) {
                if (logPermissionRequest == LogPermissionRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(logPermissionRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LogPermissionRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LogPermissionRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LogPermissionRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LogPermissionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LogPermissionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LogPermissionRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LogPermissionRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LogPermissionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LogPermissionRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LogPermissionRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LogPermissionRequest parseFrom(InputStream inputStream) {
            return (LogPermissionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LogPermissionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LogPermissionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LogPermissionRequest parseFrom(CodedInputStream codedInputStream) {
            return (LogPermissionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LogPermissionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LogPermissionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LogPermissionResponse extends GeneratedMessageV3 implements LogPermissionResponseOrBuilder {
        public static final int IS_ALLOWED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isAllowed_;
        private byte memoizedIsInitialized;
        private static final LogPermissionResponse DEFAULT_INSTANCE = new LogPermissionResponse();

        @Deprecated
        public static final Parser<LogPermissionResponse> PARSER = new AbstractParser<LogPermissionResponse>() { // from class: com.garmin.proto.generated.GDILimitedUi.LogPermissionResponse.1
            @Override // com.google.protobuf.Parser
            public LogPermissionResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LogPermissionResponse.newBuilder();
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

        private LogPermissionResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.isAllowed_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LogPermissionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_LogPermissionResponse_descriptor;
        }

        public static Builder newBuilder(LogPermissionResponse logPermissionResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(logPermissionResponse);
        }

        public static LogPermissionResponse parseDelimitedFrom(InputStream inputStream) {
            return (LogPermissionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LogPermissionResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LogPermissionResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LogPermissionResponse)) {
                return super.equals(obj);
            }
            LogPermissionResponse logPermissionResponse = (LogPermissionResponse) obj;
            if (hasIsAllowed() != logPermissionResponse.hasIsAllowed()) {
                return false;
            }
            return (!hasIsAllowed() || getIsAllowed() == logPermissionResponse.getIsAllowed()) && getUnknownFields().equals(logPermissionResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.LogPermissionResponseOrBuilder
        public boolean getIsAllowed() {
            return this.isAllowed_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LogPermissionResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.isAllowed_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.LogPermissionResponseOrBuilder
        public boolean hasIsAllowed() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIsAllowed()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getIsAllowed());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_LogPermissionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LogPermissionResponse.class, Builder.class);
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
            return new LogPermissionResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.isAllowed_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LogPermissionResponseOrBuilder {
            private int bitField0_;
            private boolean isAllowed_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(LogPermissionResponse logPermissionResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    logPermissionResponse.isAllowed_ = this.isAllowed_;
                } else {
                    i14 = 0;
                }
                logPermissionResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_LogPermissionResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LogPermissionResponse build() {
                LogPermissionResponse logPermissionResponseBuildPartial = buildPartial();
                if (logPermissionResponseBuildPartial.isInitialized()) {
                    return logPermissionResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) logPermissionResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LogPermissionResponse buildPartial() {
                LogPermissionResponse logPermissionResponse = new LogPermissionResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(logPermissionResponse);
                }
                onBuilt();
                return logPermissionResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.isAllowed_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsAllowed() {
                this.bitField0_ &= -2;
                this.isAllowed_ = false;
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_LogPermissionResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.LogPermissionResponseOrBuilder
            public boolean getIsAllowed() {
                return this.isAllowed_;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.LogPermissionResponseOrBuilder
            public boolean hasIsAllowed() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_LogPermissionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LogPermissionResponse.class, Builder.class);
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
                                    this.isAllowed_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIsAllowed(boolean z14) {
                this.isAllowed_ = z14;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LogPermissionResponse getDefaultInstanceForType() {
                return LogPermissionResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LogPermissionResponse) {
                    return mergeFrom((LogPermissionResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LogPermissionResponse logPermissionResponse) {
                if (logPermissionResponse == LogPermissionResponse.getDefaultInstance()) {
                    return this;
                }
                if (logPermissionResponse.hasIsAllowed()) {
                    setIsAllowed(logPermissionResponse.getIsAllowed());
                }
                mergeUnknownFields(logPermissionResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LogPermissionResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LogPermissionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LogPermissionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LogPermissionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LogPermissionResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LogPermissionResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LogPermissionResponse() {
            this.isAllowed_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LogPermissionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LogPermissionResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LogPermissionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LogPermissionResponse parseFrom(InputStream inputStream) {
            return (LogPermissionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LogPermissionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LogPermissionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LogPermissionResponse parseFrom(CodedInputStream codedInputStream) {
            return (LogPermissionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LogPermissionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LogPermissionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int LIMITED_UI_RESPONSE_FIELD_NUMBER = 37;
        public static final int SUPPORTED_ALERTS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<Integer> supportedAlerts_;
        private static final Internal.ListAdapter.Converter<Integer, AlertType> supportedAlerts_converter_ = new Internal.ListAdapter.Converter<Integer, AlertType>() { // from class: com.garmin.proto.generated.GDILimitedUi.CapabilitiesResponse.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public AlertType convert(Integer num) {
                AlertType alertTypeForNumber = AlertType.forNumber(num.intValue());
                return alertTypeForNumber == null ? AlertType.INVALID : alertTypeForNumber;
            }
        };
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDILimitedUi.CapabilitiesResponse.2
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> limitedUiResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.supportedAlerts_ = Collections.EMPTY_LIST;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_CapabilitiesResponse_descriptor;
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
            return this.supportedAlerts_.equals(capabilitiesResponse.supportedAlerts_) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
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
            int i15 = 0;
            int iA = 0;
            while (true) {
                int size = this.supportedAlerts_.size();
                List<Integer> list = this.supportedAlerts_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.CapabilitiesResponseOrBuilder
        public AlertType getSupportedAlerts(int i14) {
            return supportedAlerts_converter_.convert(this.supportedAlerts_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.CapabilitiesResponseOrBuilder
        public int getSupportedAlertsCount() {
            return this.supportedAlerts_.size();
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.CapabilitiesResponseOrBuilder
        public List<AlertType> getSupportedAlertsList() {
            return new Internal.ListAdapter(this.supportedAlerts_, supportedAlerts_converter_);
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
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            int iF = 0;
            while (iF < this.supportedAlerts_.size()) {
                iF = f3.f(this.supportedAlerts_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private List<Integer> supportedAlerts_;

            private Builder() {
                this.supportedAlerts_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
            }

            private void buildPartialRepeatedFields(CapabilitiesResponse capabilitiesResponse) {
                if ((this.bitField0_ & 1) != 0) {
                    this.supportedAlerts_ = Collections.unmodifiableList(this.supportedAlerts_);
                    this.bitField0_ &= -2;
                }
                capabilitiesResponse.supportedAlerts_ = this.supportedAlerts_;
            }

            private void ensureSupportedAlertsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.supportedAlerts_ = new ArrayList(this.supportedAlerts_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_CapabilitiesResponse_descriptor;
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
                buildPartialRepeatedFields(capabilitiesResponse);
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
                this.supportedAlerts_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.CapabilitiesResponseOrBuilder
            public AlertType getSupportedAlerts(int i14) {
                return (AlertType) CapabilitiesResponse.supportedAlerts_converter_.convert(this.supportedAlerts_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.CapabilitiesResponseOrBuilder
            public int getSupportedAlertsCount() {
                return this.supportedAlerts_.size();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.CapabilitiesResponseOrBuilder
            public List<AlertType> getSupportedAlertsList() {
                return new Internal.ListAdapter(this.supportedAlerts_, CapabilitiesResponse.supportedAlerts_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                this.supportedAlerts_ = Collections.EMPTY_LIST;
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
                if (!capabilitiesResponse.supportedAlerts_.isEmpty()) {
                    if (this.supportedAlerts_.isEmpty()) {
                        this.supportedAlerts_ = capabilitiesResponse.supportedAlerts_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSupportedAlertsIsMutable();
                        this.supportedAlerts_.addAll(capabilitiesResponse.supportedAlerts_);
                    }
                    onChanged();
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

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
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

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
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

    public static final class DistanceCalibrationNotification extends GeneratedMessageV3 implements DistanceCalibrationNotificationOrBuilder {
        public static final int ACTIVITY_TYPE_FIELD_NUMBER = 4;
        public static final int DISTANCE_M_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IS_INITIAL_CALIBRATION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private FitSport activityType_;
        private int bitField0_;
        private int distanceM_;
        private int id_;
        private boolean isInitialCalibration_;
        private byte memoizedIsInitialized;
        private static final DistanceCalibrationNotification DEFAULT_INSTANCE = new DistanceCalibrationNotification();

        @Deprecated
        public static final Parser<DistanceCalibrationNotification> PARSER = new AbstractParser<DistanceCalibrationNotification>() { // from class: com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotification.1
            @Override // com.google.protobuf.Parser
            public DistanceCalibrationNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DistanceCalibrationNotification.newBuilder();
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

        private DistanceCalibrationNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.isInitialCalibration_ = false;
            this.distanceM_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DistanceCalibrationNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationNotification_descriptor;
        }

        public static Builder newBuilder(DistanceCalibrationNotification distanceCalibrationNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(distanceCalibrationNotification);
        }

        public static DistanceCalibrationNotification parseDelimitedFrom(InputStream inputStream) {
            return (DistanceCalibrationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DistanceCalibrationNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DistanceCalibrationNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DistanceCalibrationNotification)) {
                return super.equals(obj);
            }
            DistanceCalibrationNotification distanceCalibrationNotification = (DistanceCalibrationNotification) obj;
            if (hasId() != distanceCalibrationNotification.hasId()) {
                return false;
            }
            if ((hasId() && getId() != distanceCalibrationNotification.getId()) || hasIsInitialCalibration() != distanceCalibrationNotification.hasIsInitialCalibration()) {
                return false;
            }
            if ((hasIsInitialCalibration() && getIsInitialCalibration() != distanceCalibrationNotification.getIsInitialCalibration()) || hasDistanceM() != distanceCalibrationNotification.hasDistanceM()) {
                return false;
            }
            if ((!hasDistanceM() || getDistanceM() == distanceCalibrationNotification.getDistanceM()) && hasActivityType() == distanceCalibrationNotification.hasActivityType()) {
                return (!hasActivityType() || getActivityType().equals(distanceCalibrationNotification.getActivityType())) && getUnknownFields().equals(distanceCalibrationNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
        public FitSport getActivityType() {
            FitSport fitSport = this.activityType_;
            return fitSport == null ? FitSport.getDefaultInstance() : fitSport;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
        public FitSportOrBuilder getActivityTypeOrBuilder() {
            FitSport fitSport = this.activityType_;
            return fitSport == null ? FitSport.getDefaultInstance() : fitSport;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
        public int getDistanceM() {
            return this.distanceM_;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
        public boolean getIsInitialCalibration() {
            return this.isInitialCalibration_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DistanceCalibrationNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.isInitialCalibration_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.distanceM_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, getActivityType());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
        public boolean hasActivityType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
        public boolean hasDistanceM() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
        public boolean hasIsInitialCalibration() {
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
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            if (hasIsInitialCalibration()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getIsInitialCalibration());
            }
            if (hasDistanceM()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDistanceM();
            }
            if (hasActivityType()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getActivityType().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DistanceCalibrationNotification.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDistanceM()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasActivityType() || getActivityType().isInitialized()) {
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
            return new DistanceCalibrationNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.isInitialCalibration_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.distanceM_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getActivityType());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DistanceCalibrationNotificationOrBuilder {
            private SingleFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> activityTypeBuilder_;
            private FitSport activityType_;
            private int bitField0_;
            private int distanceM_;
            private int id_;
            private boolean isInitialCalibration_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DistanceCalibrationNotification distanceCalibrationNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    distanceCalibrationNotification.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    distanceCalibrationNotification.isInitialCalibration_ = this.isInitialCalibration_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    distanceCalibrationNotification.distanceM_ = this.distanceM_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> singleFieldBuilderV3 = this.activityTypeBuilder_;
                    distanceCalibrationNotification.activityType_ = singleFieldBuilderV3 == null ? this.activityType_ : (FitSport) singleFieldBuilderV3.build();
                    i14 |= 8;
                }
                distanceCalibrationNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> getActivityTypeFieldBuilder() {
                if (this.activityTypeBuilder_ == null) {
                    this.activityTypeBuilder_ = new SingleFieldBuilderV3<>(getActivityType(), getParentForChildren(), isClean());
                    this.activityType_ = null;
                }
                return this.activityTypeBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getActivityTypeFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DistanceCalibrationNotification build() {
                DistanceCalibrationNotification distanceCalibrationNotificationBuildPartial = buildPartial();
                if (distanceCalibrationNotificationBuildPartial.isInitialized()) {
                    return distanceCalibrationNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) distanceCalibrationNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DistanceCalibrationNotification buildPartial() {
                DistanceCalibrationNotification distanceCalibrationNotification = new DistanceCalibrationNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(distanceCalibrationNotification);
                }
                onBuilt();
                return distanceCalibrationNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.isInitialCalibration_ = false;
                this.distanceM_ = 0;
                this.activityType_ = null;
                SingleFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> singleFieldBuilderV3 = this.activityTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.activityTypeBuilder_ = null;
                }
                return this;
            }

            public Builder clearActivityType() {
                this.bitField0_ &= -9;
                this.activityType_ = null;
                SingleFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> singleFieldBuilderV3 = this.activityTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.activityTypeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDistanceM() {
                this.bitField0_ &= -5;
                this.distanceM_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIsInitialCalibration() {
                this.bitField0_ &= -3;
                this.isInitialCalibration_ = false;
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

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
            public FitSport getActivityType() {
                SingleFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> singleFieldBuilderV3 = this.activityTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitSport) singleFieldBuilderV3.getMessage();
                }
                FitSport fitSport = this.activityType_;
                return fitSport == null ? FitSport.getDefaultInstance() : fitSport;
            }

            public FitSport.Builder getActivityTypeBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (FitSport.Builder) getActivityTypeFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
            public FitSportOrBuilder getActivityTypeOrBuilder() {
                SingleFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> singleFieldBuilderV3 = this.activityTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitSportOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FitSport fitSport = this.activityType_;
                return fitSport == null ? FitSport.getDefaultInstance() : fitSport;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
            public int getDistanceM() {
                return this.distanceM_;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
            public boolean getIsInitialCalibration() {
                return this.isInitialCalibration_;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
            public boolean hasActivityType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
            public boolean hasDistanceM() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.DistanceCalibrationNotificationOrBuilder
            public boolean hasIsInitialCalibration() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_DistanceCalibrationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DistanceCalibrationNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasId() && hasDistanceM()) {
                    return !hasActivityType() || getActivityType().isInitialized();
                }
                return false;
            }

            public Builder mergeActivityType(FitSport fitSport) {
                FitSport fitSport2;
                SingleFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> singleFieldBuilderV3 = this.activityTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fitSport);
                } else if ((this.bitField0_ & 8) == 0 || (fitSport2 = this.activityType_) == null || fitSport2 == FitSport.getDefaultInstance()) {
                    this.activityType_ = fitSport;
                } else {
                    getActivityTypeBuilder().mergeFrom(fitSport);
                }
                if (this.activityType_ != null) {
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
                                if (tag == 8) {
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.isInitialCalibration_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.distanceM_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getActivityTypeFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setActivityType(FitSport.Builder builder) {
                SingleFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> singleFieldBuilderV3 = this.activityTypeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.activityType_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDistanceM(int i14) {
                this.distanceM_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setId(int i14) {
                this.id_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIsInitialCalibration(boolean z14) {
                this.isInitialCalibration_ = z14;
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
            public DistanceCalibrationNotification getDefaultInstanceForType() {
                return DistanceCalibrationNotification.getDefaultInstance();
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

            public Builder setActivityType(FitSport fitSport) {
                SingleFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> singleFieldBuilderV3 = this.activityTypeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fitSport.getClass();
                    this.activityType_ = fitSport;
                } else {
                    singleFieldBuilderV3.setMessage(fitSport);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DistanceCalibrationNotification) {
                    return mergeFrom((DistanceCalibrationNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DistanceCalibrationNotification distanceCalibrationNotification) {
                if (distanceCalibrationNotification == DistanceCalibrationNotification.getDefaultInstance()) {
                    return this;
                }
                if (distanceCalibrationNotification.hasId()) {
                    setId(distanceCalibrationNotification.getId());
                }
                if (distanceCalibrationNotification.hasIsInitialCalibration()) {
                    setIsInitialCalibration(distanceCalibrationNotification.getIsInitialCalibration());
                }
                if (distanceCalibrationNotification.hasDistanceM()) {
                    setDistanceM(distanceCalibrationNotification.getDistanceM());
                }
                if (distanceCalibrationNotification.hasActivityType()) {
                    mergeActivityType(distanceCalibrationNotification.getActivityType());
                }
                mergeUnknownFields(distanceCalibrationNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DistanceCalibrationNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DistanceCalibrationNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DistanceCalibrationNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DistanceCalibrationNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DistanceCalibrationNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DistanceCalibrationNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DistanceCalibrationNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ DistanceCalibrationNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DistanceCalibrationNotification parseFrom(InputStream inputStream) {
            return (DistanceCalibrationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private DistanceCalibrationNotification() {
            this.id_ = 0;
            this.isInitialCalibration_ = false;
            this.distanceM_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DistanceCalibrationNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DistanceCalibrationNotification parseFrom(CodedInputStream codedInputStream) {
            return (DistanceCalibrationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DistanceCalibrationNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DistanceCalibrationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EndSleepResponse extends GeneratedMessageV3 implements EndSleepResponseOrBuilder {
        private static final EndSleepResponse DEFAULT_INSTANCE = new EndSleepResponse();

        @Deprecated
        public static final Parser<EndSleepResponse> PARSER = new AbstractParser<EndSleepResponse>() { // from class: com.garmin.proto.generated.GDILimitedUi.EndSleepResponse.1
            @Override // com.google.protobuf.Parser
            public EndSleepResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EndSleepResponse.newBuilder();
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
        public static final int RESPONSE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int response_;

        private EndSleepResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.response_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EndSleepResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_EndSleepResponse_descriptor;
        }

        public static Builder newBuilder(EndSleepResponse endSleepResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(endSleepResponse);
        }

        public static EndSleepResponse parseDelimitedFrom(InputStream inputStream) {
            return (EndSleepResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EndSleepResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EndSleepResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndSleepResponse)) {
                return super.equals(obj);
            }
            EndSleepResponse endSleepResponse = (EndSleepResponse) obj;
            if (hasResponse() != endSleepResponse.hasResponse()) {
                return false;
            }
            return (!hasResponse() || this.response_ == endSleepResponse.response_) && getUnknownFields().equals(endSleepResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EndSleepResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.EndSleepResponseOrBuilder
        public SleepStatus getResponse() {
            SleepStatus sleepStatusForNumber = SleepStatus.forNumber(this.response_);
            return sleepStatusForNumber == null ? SleepStatus.INVALID_STATUS : sleepStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.response_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.EndSleepResponseOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.response_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_EndSleepResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EndSleepResponse.class, Builder.class);
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
            return new EndSleepResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.response_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EndSleepResponseOrBuilder {
            private int bitField0_;
            private int response_;

            private Builder() {
                this.response_ = 0;
            }

            private void buildPartial0(EndSleepResponse endSleepResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    endSleepResponse.response_ = this.response_;
                } else {
                    i14 = 0;
                }
                endSleepResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_EndSleepResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EndSleepResponse build() {
                EndSleepResponse endSleepResponseBuildPartial = buildPartial();
                if (endSleepResponseBuildPartial.isInitialized()) {
                    return endSleepResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) endSleepResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EndSleepResponse buildPartial() {
                EndSleepResponse endSleepResponse = new EndSleepResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(endSleepResponse);
                }
                onBuilt();
                return endSleepResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.response_ = 0;
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

            public Builder clearResponse() {
                this.bitField0_ &= -2;
                this.response_ = 0;
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_EndSleepResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.EndSleepResponseOrBuilder
            public SleepStatus getResponse() {
                SleepStatus sleepStatusForNumber = SleepStatus.forNumber(this.response_);
                return sleepStatusForNumber == null ? SleepStatus.INVALID_STATUS : sleepStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.EndSleepResponseOrBuilder
            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_EndSleepResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EndSleepResponse.class, Builder.class);
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
                                    if (SleepStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.response_ = i14;
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

            public Builder setResponse(SleepStatus sleepStatus) {
                sleepStatus.getClass();
                this.bitField0_ |= 1;
                this.response_ = sleepStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EndSleepResponse getDefaultInstanceForType() {
                return EndSleepResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.response_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EndSleepResponse) {
                    return mergeFrom((EndSleepResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EndSleepResponse endSleepResponse) {
                if (endSleepResponse == EndSleepResponse.getDefaultInstance()) {
                    return this;
                }
                if (endSleepResponse.hasResponse()) {
                    setResponse(endSleepResponse.getResponse());
                }
                mergeUnknownFields(endSleepResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EndSleepResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EndSleepResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EndSleepResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EndSleepResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ EndSleepResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EndSleepResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private EndSleepResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.response_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EndSleepResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EndSleepResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EndSleepResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EndSleepResponse parseFrom(InputStream inputStream) {
            return (EndSleepResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EndSleepResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EndSleepResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EndSleepResponse parseFrom(CodedInputStream codedInputStream) {
            return (EndSleepResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EndSleepResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EndSleepResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum SleepStatus implements ProtocolMessageEnum {
            INVALID_STATUS(0),
            SUCCESS(1),
            FAILURE_NOT_SLEEPING(2),
            FAILURE_OTHER(3);

            public static final int FAILURE_NOT_SLEEPING_VALUE = 2;
            public static final int FAILURE_OTHER_VALUE = 3;
            public static final int INVALID_STATUS_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<SleepStatus> internalValueMap = new Internal.EnumLiteMap<SleepStatus>() { // from class: com.garmin.proto.generated.GDILimitedUi.EndSleepResponse.SleepStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SleepStatus findValueByNumber(int i14) {
                    return SleepStatus.forNumber(i14);
                }
            };
            private static final SleepStatus[] VALUES = values();

            SleepStatus(int i14) {
                this.value = i14;
            }

            public static SleepStatus forNumber(int i14) {
                if (i14 == 0) {
                    return INVALID_STATUS;
                }
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 == 2) {
                    return FAILURE_NOT_SLEEPING;
                }
                if (i14 != 3) {
                    return null;
                }
                return FAILURE_OTHER;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EndSleepResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SleepStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static SleepStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SleepStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class FavoriteSportsNotification extends GeneratedMessageV3 implements FavoriteSportsNotificationOrBuilder {
        public static final int FAVORITE_SPORTS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<FitSport> favoriteSports_;
        private byte memoizedIsInitialized;
        private static final FavoriteSportsNotification DEFAULT_INSTANCE = new FavoriteSportsNotification();

        @Deprecated
        public static final Parser<FavoriteSportsNotification> PARSER = new AbstractParser<FavoriteSportsNotification>() { // from class: com.garmin.proto.generated.GDILimitedUi.FavoriteSportsNotification.1
            @Override // com.google.protobuf.Parser
            public FavoriteSportsNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FavoriteSportsNotification.newBuilder();
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

        private FavoriteSportsNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.favoriteSports_ = Collections.EMPTY_LIST;
        }

        public static FavoriteSportsNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsNotification_descriptor;
        }

        public static Builder newBuilder(FavoriteSportsNotification favoriteSportsNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(favoriteSportsNotification);
        }

        public static FavoriteSportsNotification parseDelimitedFrom(InputStream inputStream) {
            return (FavoriteSportsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FavoriteSportsNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FavoriteSportsNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FavoriteSportsNotification)) {
                return super.equals(obj);
            }
            FavoriteSportsNotification favoriteSportsNotification = (FavoriteSportsNotification) obj;
            return getFavoriteSportsList().equals(favoriteSportsNotification.getFavoriteSportsList()) && getUnknownFields().equals(favoriteSportsNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsNotificationOrBuilder
        public FitSport getFavoriteSports(int i14) {
            return this.favoriteSports_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsNotificationOrBuilder
        public int getFavoriteSportsCount() {
            return this.favoriteSports_.size();
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsNotificationOrBuilder
        public List<FitSport> getFavoriteSportsList() {
            return this.favoriteSports_;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsNotificationOrBuilder
        public FitSportOrBuilder getFavoriteSportsOrBuilder(int i14) {
            return this.favoriteSports_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsNotificationOrBuilder
        public List<? extends FitSportOrBuilder> getFavoriteSportsOrBuilderList() {
            return this.favoriteSports_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FavoriteSportsNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.favoriteSports_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.favoriteSports_.get(i15));
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
            if (getFavoriteSportsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getFavoriteSportsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteSportsNotification.class, Builder.class);
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
            for (int i14 = 0; i14 < getFavoriteSportsCount(); i14++) {
                if (!getFavoriteSports(i14).isInitialized()) {
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
            return new FavoriteSportsNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.favoriteSports_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.favoriteSports_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FavoriteSportsNotificationOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> favoriteSportsBuilder_;
            private List<FitSport> favoriteSports_;

            private Builder() {
                this.favoriteSports_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(FavoriteSportsNotification favoriteSportsNotification) {
            }

            private void buildPartialRepeatedFields(FavoriteSportsNotification favoriteSportsNotification) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    favoriteSportsNotification.favoriteSports_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.favoriteSports_ = Collections.unmodifiableList(this.favoriteSports_);
                    this.bitField0_ &= -2;
                }
                favoriteSportsNotification.favoriteSports_ = this.favoriteSports_;
            }

            private void ensureFavoriteSportsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.favoriteSports_ = new ArrayList(this.favoriteSports_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsNotification_descriptor;
            }

            private RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> getFavoriteSportsFieldBuilder() {
                if (this.favoriteSportsBuilder_ == null) {
                    this.favoriteSportsBuilder_ = new RepeatedFieldBuilderV3<>(this.favoriteSports_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.favoriteSports_ = null;
                }
                return this.favoriteSportsBuilder_;
            }

            public Builder addAllFavoriteSports(Iterable<? extends FitSport> iterable) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureFavoriteSportsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.favoriteSports_);
                onChanged();
                return this;
            }

            public Builder addFavoriteSports(FitSport.Builder builder) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureFavoriteSportsIsMutable();
                this.favoriteSports_.add(builder.build());
                onChanged();
                return this;
            }

            public FitSport.Builder addFavoriteSportsBuilder() {
                return (FitSport.Builder) getFavoriteSportsFieldBuilder().addBuilder(FitSport.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteSportsNotification build() {
                FavoriteSportsNotification favoriteSportsNotificationBuildPartial = buildPartial();
                if (favoriteSportsNotificationBuildPartial.isInitialized()) {
                    return favoriteSportsNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) favoriteSportsNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteSportsNotification buildPartial() {
                FavoriteSportsNotification favoriteSportsNotification = new FavoriteSportsNotification(this);
                buildPartialRepeatedFields(favoriteSportsNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(favoriteSportsNotification);
                }
                onBuilt();
                return favoriteSportsNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.favoriteSports_ = Collections.EMPTY_LIST;
                } else {
                    this.favoriteSports_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearFavoriteSports() {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.favoriteSports_ = Collections.EMPTY_LIST;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsNotificationOrBuilder
            public FitSport getFavoriteSports(int i14) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.favoriteSports_.get(i14) : (FitSport) repeatedFieldBuilderV3.getMessage(i14);
            }

            public FitSport.Builder getFavoriteSportsBuilder(int i14) {
                return (FitSport.Builder) getFavoriteSportsFieldBuilder().getBuilder(i14);
            }

            public List<FitSport.Builder> getFavoriteSportsBuilderList() {
                return getFavoriteSportsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsNotificationOrBuilder
            public int getFavoriteSportsCount() {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.favoriteSports_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsNotificationOrBuilder
            public List<FitSport> getFavoriteSportsList() {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.favoriteSports_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsNotificationOrBuilder
            public FitSportOrBuilder getFavoriteSportsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.favoriteSports_.get(i14) : (FitSportOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsNotificationOrBuilder
            public List<? extends FitSportOrBuilder> getFavoriteSportsOrBuilderList() {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.favoriteSports_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteSportsNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getFavoriteSportsCount(); i14++) {
                    if (!getFavoriteSports(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(FavoriteSportsNotification favoriteSportsNotification) {
                if (favoriteSportsNotification == FavoriteSportsNotification.getDefaultInstance()) {
                    return this;
                }
                if (this.favoriteSportsBuilder_ == null) {
                    if (!favoriteSportsNotification.favoriteSports_.isEmpty()) {
                        if (this.favoriteSports_.isEmpty()) {
                            this.favoriteSports_ = favoriteSportsNotification.favoriteSports_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFavoriteSportsIsMutable();
                            this.favoriteSports_.addAll(favoriteSportsNotification.favoriteSports_);
                        }
                        onChanged();
                    }
                } else if (!favoriteSportsNotification.favoriteSports_.isEmpty()) {
                    boolean zIsEmpty = this.favoriteSportsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.favoriteSportsBuilder_ = null;
                        this.favoriteSports_ = favoriteSportsNotification.favoriteSports_;
                        this.bitField0_ &= -2;
                        this.favoriteSportsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFavoriteSportsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(favoriteSportsNotification.favoriteSports_);
                    }
                }
                mergeUnknownFields(favoriteSportsNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeFavoriteSports(int i14) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureFavoriteSportsIsMutable();
                this.favoriteSports_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setFavoriteSports(int i14, FitSport.Builder builder) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureFavoriteSportsIsMutable();
                this.favoriteSports_.set(i14, builder.build());
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
            public FavoriteSportsNotification getDefaultInstanceForType() {
                return FavoriteSportsNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.favoriteSports_ = Collections.EMPTY_LIST;
            }

            public FitSport.Builder addFavoriteSportsBuilder(int i14) {
                return (FitSport.Builder) getFavoriteSportsFieldBuilder().addBuilder(i14, FitSport.getDefaultInstance());
            }

            public Builder addFavoriteSports(int i14, FitSport fitSport) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    fitSport.getClass();
                    ensureFavoriteSportsIsMutable();
                    this.favoriteSports_.add(i14, fitSport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, fitSport);
                return this;
            }

            public Builder setFavoriteSports(int i14, FitSport fitSport) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    fitSport.getClass();
                    ensureFavoriteSportsIsMutable();
                    this.favoriteSports_.set(i14, fitSport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, fitSport);
                return this;
            }

            public Builder addFavoriteSports(FitSport fitSport) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    fitSport.getClass();
                    ensureFavoriteSportsIsMutable();
                    this.favoriteSports_.add(fitSport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(fitSport);
                return this;
            }

            public Builder addFavoriteSports(int i14, FitSport.Builder builder) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFavoriteSportsIsMutable();
                    this.favoriteSports_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FavoriteSportsNotification) {
                    return mergeFrom((FavoriteSportsNotification) message);
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
                                    FitSport fitSport = (FitSport) codedInputStream.readMessage(FitSport.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureFavoriteSportsIsMutable();
                                        this.favoriteSports_.add(fitSport);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(fitSport);
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
        public FavoriteSportsNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FavoriteSportsNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteSportsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteSportsNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FavoriteSportsNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private FavoriteSportsNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FavoriteSportsNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FavoriteSportsNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ FavoriteSportsNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FavoriteSportsNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FavoriteSportsNotification parseFrom(InputStream inputStream) {
            return (FavoriteSportsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FavoriteSportsNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteSportsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteSportsNotification parseFrom(CodedInputStream codedInputStream) {
            return (FavoriteSportsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FavoriteSportsNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteSportsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FavoriteSportsResponse extends GeneratedMessageV3 implements FavoriteSportsResponseOrBuilder {
        public static final int FAVORITE_SPORTS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<FitSport> favoriteSports_;
        private byte memoizedIsInitialized;
        private static final FavoriteSportsResponse DEFAULT_INSTANCE = new FavoriteSportsResponse();

        @Deprecated
        public static final Parser<FavoriteSportsResponse> PARSER = new AbstractParser<FavoriteSportsResponse>() { // from class: com.garmin.proto.generated.GDILimitedUi.FavoriteSportsResponse.1
            @Override // com.google.protobuf.Parser
            public FavoriteSportsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FavoriteSportsResponse.newBuilder();
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

        private FavoriteSportsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.favoriteSports_ = Collections.EMPTY_LIST;
        }

        public static FavoriteSportsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsResponse_descriptor;
        }

        public static Builder newBuilder(FavoriteSportsResponse favoriteSportsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(favoriteSportsResponse);
        }

        public static FavoriteSportsResponse parseDelimitedFrom(InputStream inputStream) {
            return (FavoriteSportsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FavoriteSportsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FavoriteSportsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FavoriteSportsResponse)) {
                return super.equals(obj);
            }
            FavoriteSportsResponse favoriteSportsResponse = (FavoriteSportsResponse) obj;
            return getFavoriteSportsList().equals(favoriteSportsResponse.getFavoriteSportsList()) && getUnknownFields().equals(favoriteSportsResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsResponseOrBuilder
        public FitSport getFavoriteSports(int i14) {
            return this.favoriteSports_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsResponseOrBuilder
        public int getFavoriteSportsCount() {
            return this.favoriteSports_.size();
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsResponseOrBuilder
        public List<FitSport> getFavoriteSportsList() {
            return this.favoriteSports_;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsResponseOrBuilder
        public FitSportOrBuilder getFavoriteSportsOrBuilder(int i14) {
            return this.favoriteSports_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsResponseOrBuilder
        public List<? extends FitSportOrBuilder> getFavoriteSportsOrBuilderList() {
            return this.favoriteSports_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FavoriteSportsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.favoriteSports_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.favoriteSports_.get(i15));
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
            if (getFavoriteSportsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getFavoriteSportsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteSportsResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getFavoriteSportsCount(); i14++) {
                if (!getFavoriteSports(i14).isInitialized()) {
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
            return new FavoriteSportsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.favoriteSports_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.favoriteSports_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FavoriteSportsResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> favoriteSportsBuilder_;
            private List<FitSport> favoriteSports_;

            private Builder() {
                this.favoriteSports_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(FavoriteSportsResponse favoriteSportsResponse) {
            }

            private void buildPartialRepeatedFields(FavoriteSportsResponse favoriteSportsResponse) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    favoriteSportsResponse.favoriteSports_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.favoriteSports_ = Collections.unmodifiableList(this.favoriteSports_);
                    this.bitField0_ &= -2;
                }
                favoriteSportsResponse.favoriteSports_ = this.favoriteSports_;
            }

            private void ensureFavoriteSportsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.favoriteSports_ = new ArrayList(this.favoriteSports_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> getFavoriteSportsFieldBuilder() {
                if (this.favoriteSportsBuilder_ == null) {
                    this.favoriteSportsBuilder_ = new RepeatedFieldBuilderV3<>(this.favoriteSports_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.favoriteSports_ = null;
                }
                return this.favoriteSportsBuilder_;
            }

            public Builder addAllFavoriteSports(Iterable<? extends FitSport> iterable) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureFavoriteSportsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.favoriteSports_);
                onChanged();
                return this;
            }

            public Builder addFavoriteSports(FitSport.Builder builder) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureFavoriteSportsIsMutable();
                this.favoriteSports_.add(builder.build());
                onChanged();
                return this;
            }

            public FitSport.Builder addFavoriteSportsBuilder() {
                return (FitSport.Builder) getFavoriteSportsFieldBuilder().addBuilder(FitSport.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteSportsResponse build() {
                FavoriteSportsResponse favoriteSportsResponseBuildPartial = buildPartial();
                if (favoriteSportsResponseBuildPartial.isInitialized()) {
                    return favoriteSportsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) favoriteSportsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteSportsResponse buildPartial() {
                FavoriteSportsResponse favoriteSportsResponse = new FavoriteSportsResponse(this);
                buildPartialRepeatedFields(favoriteSportsResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(favoriteSportsResponse);
                }
                onBuilt();
                return favoriteSportsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.favoriteSports_ = Collections.EMPTY_LIST;
                } else {
                    this.favoriteSports_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearFavoriteSports() {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.favoriteSports_ = Collections.EMPTY_LIST;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsResponseOrBuilder
            public FitSport getFavoriteSports(int i14) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.favoriteSports_.get(i14) : (FitSport) repeatedFieldBuilderV3.getMessage(i14);
            }

            public FitSport.Builder getFavoriteSportsBuilder(int i14) {
                return (FitSport.Builder) getFavoriteSportsFieldBuilder().getBuilder(i14);
            }

            public List<FitSport.Builder> getFavoriteSportsBuilderList() {
                return getFavoriteSportsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsResponseOrBuilder
            public int getFavoriteSportsCount() {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.favoriteSports_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsResponseOrBuilder
            public List<FitSport> getFavoriteSportsList() {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.favoriteSports_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsResponseOrBuilder
            public FitSportOrBuilder getFavoriteSportsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.favoriteSports_.get(i14) : (FitSportOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.FavoriteSportsResponseOrBuilder
            public List<? extends FitSportOrBuilder> getFavoriteSportsOrBuilderList() {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.favoriteSports_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_FavoriteSportsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteSportsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getFavoriteSportsCount(); i14++) {
                    if (!getFavoriteSports(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(FavoriteSportsResponse favoriteSportsResponse) {
                if (favoriteSportsResponse == FavoriteSportsResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.favoriteSportsBuilder_ == null) {
                    if (!favoriteSportsResponse.favoriteSports_.isEmpty()) {
                        if (this.favoriteSports_.isEmpty()) {
                            this.favoriteSports_ = favoriteSportsResponse.favoriteSports_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFavoriteSportsIsMutable();
                            this.favoriteSports_.addAll(favoriteSportsResponse.favoriteSports_);
                        }
                        onChanged();
                    }
                } else if (!favoriteSportsResponse.favoriteSports_.isEmpty()) {
                    boolean zIsEmpty = this.favoriteSportsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.favoriteSportsBuilder_ = null;
                        this.favoriteSports_ = favoriteSportsResponse.favoriteSports_;
                        this.bitField0_ &= -2;
                        this.favoriteSportsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFavoriteSportsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(favoriteSportsResponse.favoriteSports_);
                    }
                }
                mergeUnknownFields(favoriteSportsResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeFavoriteSports(int i14) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureFavoriteSportsIsMutable();
                this.favoriteSports_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setFavoriteSports(int i14, FitSport.Builder builder) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureFavoriteSportsIsMutable();
                this.favoriteSports_.set(i14, builder.build());
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
            public FavoriteSportsResponse getDefaultInstanceForType() {
                return FavoriteSportsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.favoriteSports_ = Collections.EMPTY_LIST;
            }

            public FitSport.Builder addFavoriteSportsBuilder(int i14) {
                return (FitSport.Builder) getFavoriteSportsFieldBuilder().addBuilder(i14, FitSport.getDefaultInstance());
            }

            public Builder addFavoriteSports(int i14, FitSport fitSport) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    fitSport.getClass();
                    ensureFavoriteSportsIsMutable();
                    this.favoriteSports_.add(i14, fitSport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, fitSport);
                return this;
            }

            public Builder setFavoriteSports(int i14, FitSport fitSport) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    fitSport.getClass();
                    ensureFavoriteSportsIsMutable();
                    this.favoriteSports_.set(i14, fitSport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, fitSport);
                return this;
            }

            public Builder addFavoriteSports(FitSport fitSport) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    fitSport.getClass();
                    ensureFavoriteSportsIsMutable();
                    this.favoriteSports_.add(fitSport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(fitSport);
                return this;
            }

            public Builder addFavoriteSports(int i14, FitSport.Builder builder) {
                RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFavoriteSportsIsMutable();
                    this.favoriteSports_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FavoriteSportsResponse) {
                    return mergeFrom((FavoriteSportsResponse) message);
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
                                    FitSport fitSport = (FitSport) codedInputStream.readMessage(FitSport.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<FitSport, FitSport.Builder, FitSportOrBuilder> repeatedFieldBuilderV3 = this.favoriteSportsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureFavoriteSportsIsMutable();
                                        this.favoriteSports_.add(fitSport);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(fitSport);
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
        public FavoriteSportsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FavoriteSportsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteSportsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteSportsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FavoriteSportsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private FavoriteSportsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FavoriteSportsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FavoriteSportsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ FavoriteSportsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FavoriteSportsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FavoriteSportsResponse parseFrom(InputStream inputStream) {
            return (FavoriteSportsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FavoriteSportsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteSportsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteSportsResponse parseFrom(CodedInputStream codedInputStream) {
            return (FavoriteSportsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FavoriteSportsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteSportsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int ALERT_NOTIFICATION_FIELD_NUMBER = 1;
        public static final int DISTANCE_CALIBRATION_CANCEL_NOTIFICATION_FIELD_NUMBER = 13;
        public static final int DISTANCE_CALIBRATION_NOTIFICATION_FIELD_NUMBER = 11;
        public static final int DISTANCE_CALIBRATION_NOTIFICATION_V2_FIELD_NUMBER = 12;
        public static final int DISTANCE_CALIBRATION_REQUEST_FIELD_NUMBER = 9;
        public static final int DISTANCE_CALIBRATION_RESPONSE_FIELD_NUMBER = 10;
        public static final int END_SLEEP_REQUEST_FIELD_NUMBER = 4;
        public static final int END_SLEEP_RESPONSE_FIELD_NUMBER = 5;
        public static final int FAVORITE_SPORTS_NOTIFICATION_FIELD_NUMBER = 6;
        public static final int FAVORITE_SPORTS_REQUEST_FIELD_NUMBER = 7;
        public static final int FAVORITE_SPORTS_RESPONSE_FIELD_NUMBER = 8;
        public static final int LOG_PERMISSION_REQUEST_FIELD_NUMBER = 2;
        public static final int LOG_PERMISSION_RESPONSE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private AlertNotification alertNotification_;
        private int bitField0_;
        private DistanceCalibrationCancelNotification distanceCalibrationCancelNotification_;
        private DistanceCalibrationNotification distanceCalibrationNotificationV2_;
        private DistanceCalibrationCancelNotification distanceCalibrationNotification_;
        private DistanceCalibrationRequest distanceCalibrationRequest_;
        private DistanceCalibrationResponse distanceCalibrationResponse_;
        private EndSleepRequest endSleepRequest_;
        private EndSleepResponse endSleepResponse_;
        private FavoriteSportsNotification favoriteSportsNotification_;
        private FavoriteSportsRequest favoriteSportsRequest_;
        private FavoriteSportsResponse favoriteSportsResponse_;
        private LogPermissionRequest logPermissionRequest_;
        private LogPermissionResponse logPermissionResponse_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDILimitedUi.Service.1
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
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_Service_descriptor;
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
            if (hasAlertNotification() != service.hasAlertNotification()) {
                return false;
            }
            if ((hasAlertNotification() && !getAlertNotification().equals(service.getAlertNotification())) || hasLogPermissionRequest() != service.hasLogPermissionRequest()) {
                return false;
            }
            if ((hasLogPermissionRequest() && !getLogPermissionRequest().equals(service.getLogPermissionRequest())) || hasLogPermissionResponse() != service.hasLogPermissionResponse()) {
                return false;
            }
            if ((hasLogPermissionResponse() && !getLogPermissionResponse().equals(service.getLogPermissionResponse())) || hasEndSleepRequest() != service.hasEndSleepRequest()) {
                return false;
            }
            if ((hasEndSleepRequest() && !getEndSleepRequest().equals(service.getEndSleepRequest())) || hasEndSleepResponse() != service.hasEndSleepResponse()) {
                return false;
            }
            if ((hasEndSleepResponse() && !getEndSleepResponse().equals(service.getEndSleepResponse())) || hasFavoriteSportsNotification() != service.hasFavoriteSportsNotification()) {
                return false;
            }
            if ((hasFavoriteSportsNotification() && !getFavoriteSportsNotification().equals(service.getFavoriteSportsNotification())) || hasFavoriteSportsRequest() != service.hasFavoriteSportsRequest()) {
                return false;
            }
            if ((hasFavoriteSportsRequest() && !getFavoriteSportsRequest().equals(service.getFavoriteSportsRequest())) || hasFavoriteSportsResponse() != service.hasFavoriteSportsResponse()) {
                return false;
            }
            if ((hasFavoriteSportsResponse() && !getFavoriteSportsResponse().equals(service.getFavoriteSportsResponse())) || hasDistanceCalibrationRequest() != service.hasDistanceCalibrationRequest()) {
                return false;
            }
            if ((hasDistanceCalibrationRequest() && !getDistanceCalibrationRequest().equals(service.getDistanceCalibrationRequest())) || hasDistanceCalibrationResponse() != service.hasDistanceCalibrationResponse()) {
                return false;
            }
            if ((hasDistanceCalibrationResponse() && !getDistanceCalibrationResponse().equals(service.getDistanceCalibrationResponse())) || hasDistanceCalibrationNotification() != service.hasDistanceCalibrationNotification()) {
                return false;
            }
            if ((hasDistanceCalibrationNotification() && !getDistanceCalibrationNotification().equals(service.getDistanceCalibrationNotification())) || hasDistanceCalibrationNotificationV2() != service.hasDistanceCalibrationNotificationV2()) {
                return false;
            }
            if ((!hasDistanceCalibrationNotificationV2() || getDistanceCalibrationNotificationV2().equals(service.getDistanceCalibrationNotificationV2())) && hasDistanceCalibrationCancelNotification() == service.hasDistanceCalibrationCancelNotification()) {
                return (!hasDistanceCalibrationCancelNotification() || getDistanceCalibrationCancelNotification().equals(service.getDistanceCalibrationCancelNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public AlertNotification getAlertNotification() {
            AlertNotification alertNotification = this.alertNotification_;
            return alertNotification == null ? AlertNotification.getDefaultInstance() : alertNotification;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public AlertNotificationOrBuilder getAlertNotificationOrBuilder() {
            AlertNotification alertNotification = this.alertNotification_;
            return alertNotification == null ? AlertNotification.getDefaultInstance() : alertNotification;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public DistanceCalibrationCancelNotification getDistanceCalibrationCancelNotification() {
            DistanceCalibrationCancelNotification distanceCalibrationCancelNotification = this.distanceCalibrationCancelNotification_;
            return distanceCalibrationCancelNotification == null ? DistanceCalibrationCancelNotification.getDefaultInstance() : distanceCalibrationCancelNotification;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public DistanceCalibrationCancelNotificationOrBuilder getDistanceCalibrationCancelNotificationOrBuilder() {
            DistanceCalibrationCancelNotification distanceCalibrationCancelNotification = this.distanceCalibrationCancelNotification_;
            return distanceCalibrationCancelNotification == null ? DistanceCalibrationCancelNotification.getDefaultInstance() : distanceCalibrationCancelNotification;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        @Deprecated
        public DistanceCalibrationCancelNotification getDistanceCalibrationNotification() {
            DistanceCalibrationCancelNotification distanceCalibrationCancelNotification = this.distanceCalibrationNotification_;
            return distanceCalibrationCancelNotification == null ? DistanceCalibrationCancelNotification.getDefaultInstance() : distanceCalibrationCancelNotification;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        @Deprecated
        public DistanceCalibrationCancelNotificationOrBuilder getDistanceCalibrationNotificationOrBuilder() {
            DistanceCalibrationCancelNotification distanceCalibrationCancelNotification = this.distanceCalibrationNotification_;
            return distanceCalibrationCancelNotification == null ? DistanceCalibrationCancelNotification.getDefaultInstance() : distanceCalibrationCancelNotification;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public DistanceCalibrationNotification getDistanceCalibrationNotificationV2() {
            DistanceCalibrationNotification distanceCalibrationNotification = this.distanceCalibrationNotificationV2_;
            return distanceCalibrationNotification == null ? DistanceCalibrationNotification.getDefaultInstance() : distanceCalibrationNotification;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public DistanceCalibrationNotificationOrBuilder getDistanceCalibrationNotificationV2OrBuilder() {
            DistanceCalibrationNotification distanceCalibrationNotification = this.distanceCalibrationNotificationV2_;
            return distanceCalibrationNotification == null ? DistanceCalibrationNotification.getDefaultInstance() : distanceCalibrationNotification;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        @Deprecated
        public DistanceCalibrationRequest getDistanceCalibrationRequest() {
            DistanceCalibrationRequest distanceCalibrationRequest = this.distanceCalibrationRequest_;
            return distanceCalibrationRequest == null ? DistanceCalibrationRequest.getDefaultInstance() : distanceCalibrationRequest;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        @Deprecated
        public DistanceCalibrationRequestOrBuilder getDistanceCalibrationRequestOrBuilder() {
            DistanceCalibrationRequest distanceCalibrationRequest = this.distanceCalibrationRequest_;
            return distanceCalibrationRequest == null ? DistanceCalibrationRequest.getDefaultInstance() : distanceCalibrationRequest;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        @Deprecated
        public DistanceCalibrationResponse getDistanceCalibrationResponse() {
            DistanceCalibrationResponse distanceCalibrationResponse = this.distanceCalibrationResponse_;
            return distanceCalibrationResponse == null ? DistanceCalibrationResponse.getDefaultInstance() : distanceCalibrationResponse;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        @Deprecated
        public DistanceCalibrationResponseOrBuilder getDistanceCalibrationResponseOrBuilder() {
            DistanceCalibrationResponse distanceCalibrationResponse = this.distanceCalibrationResponse_;
            return distanceCalibrationResponse == null ? DistanceCalibrationResponse.getDefaultInstance() : distanceCalibrationResponse;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public EndSleepRequest getEndSleepRequest() {
            EndSleepRequest endSleepRequest = this.endSleepRequest_;
            return endSleepRequest == null ? EndSleepRequest.getDefaultInstance() : endSleepRequest;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public EndSleepRequestOrBuilder getEndSleepRequestOrBuilder() {
            EndSleepRequest endSleepRequest = this.endSleepRequest_;
            return endSleepRequest == null ? EndSleepRequest.getDefaultInstance() : endSleepRequest;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public EndSleepResponse getEndSleepResponse() {
            EndSleepResponse endSleepResponse = this.endSleepResponse_;
            return endSleepResponse == null ? EndSleepResponse.getDefaultInstance() : endSleepResponse;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public EndSleepResponseOrBuilder getEndSleepResponseOrBuilder() {
            EndSleepResponse endSleepResponse = this.endSleepResponse_;
            return endSleepResponse == null ? EndSleepResponse.getDefaultInstance() : endSleepResponse;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public FavoriteSportsNotification getFavoriteSportsNotification() {
            FavoriteSportsNotification favoriteSportsNotification = this.favoriteSportsNotification_;
            return favoriteSportsNotification == null ? FavoriteSportsNotification.getDefaultInstance() : favoriteSportsNotification;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public FavoriteSportsNotificationOrBuilder getFavoriteSportsNotificationOrBuilder() {
            FavoriteSportsNotification favoriteSportsNotification = this.favoriteSportsNotification_;
            return favoriteSportsNotification == null ? FavoriteSportsNotification.getDefaultInstance() : favoriteSportsNotification;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public FavoriteSportsRequest getFavoriteSportsRequest() {
            FavoriteSportsRequest favoriteSportsRequest = this.favoriteSportsRequest_;
            return favoriteSportsRequest == null ? FavoriteSportsRequest.getDefaultInstance() : favoriteSportsRequest;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public FavoriteSportsRequestOrBuilder getFavoriteSportsRequestOrBuilder() {
            FavoriteSportsRequest favoriteSportsRequest = this.favoriteSportsRequest_;
            return favoriteSportsRequest == null ? FavoriteSportsRequest.getDefaultInstance() : favoriteSportsRequest;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public FavoriteSportsResponse getFavoriteSportsResponse() {
            FavoriteSportsResponse favoriteSportsResponse = this.favoriteSportsResponse_;
            return favoriteSportsResponse == null ? FavoriteSportsResponse.getDefaultInstance() : favoriteSportsResponse;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public FavoriteSportsResponseOrBuilder getFavoriteSportsResponseOrBuilder() {
            FavoriteSportsResponse favoriteSportsResponse = this.favoriteSportsResponse_;
            return favoriteSportsResponse == null ? FavoriteSportsResponse.getDefaultInstance() : favoriteSportsResponse;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public LogPermissionRequest getLogPermissionRequest() {
            LogPermissionRequest logPermissionRequest = this.logPermissionRequest_;
            return logPermissionRequest == null ? LogPermissionRequest.getDefaultInstance() : logPermissionRequest;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public LogPermissionRequestOrBuilder getLogPermissionRequestOrBuilder() {
            LogPermissionRequest logPermissionRequest = this.logPermissionRequest_;
            return logPermissionRequest == null ? LogPermissionRequest.getDefaultInstance() : logPermissionRequest;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public LogPermissionResponse getLogPermissionResponse() {
            LogPermissionResponse logPermissionResponse = this.logPermissionResponse_;
            return logPermissionResponse == null ? LogPermissionResponse.getDefaultInstance() : logPermissionResponse;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public LogPermissionResponseOrBuilder getLogPermissionResponseOrBuilder() {
            LogPermissionResponse logPermissionResponse = this.logPermissionResponse_;
            return logPermissionResponse == null ? LogPermissionResponse.getDefaultInstance() : logPermissionResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getAlertNotification()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getLogPermissionRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getLogPermissionResponse());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getEndSleepRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getEndSleepResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getFavoriteSportsNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getFavoriteSportsRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getFavoriteSportsResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getDistanceCalibrationRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getDistanceCalibrationResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getDistanceCalibrationNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getDistanceCalibrationNotificationV2());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getDistanceCalibrationCancelNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public boolean hasAlertNotification() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public boolean hasDistanceCalibrationCancelNotification() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        @Deprecated
        public boolean hasDistanceCalibrationNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public boolean hasDistanceCalibrationNotificationV2() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        @Deprecated
        public boolean hasDistanceCalibrationRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        @Deprecated
        public boolean hasDistanceCalibrationResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public boolean hasEndSleepRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public boolean hasEndSleepResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public boolean hasFavoriteSportsNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public boolean hasFavoriteSportsRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public boolean hasFavoriteSportsResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public boolean hasLogPermissionRequest() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
        public boolean hasLogPermissionResponse() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAlertNotification()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAlertNotification().hashCode();
            }
            if (hasLogPermissionRequest()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLogPermissionRequest().hashCode();
            }
            if (hasLogPermissionResponse()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getLogPermissionResponse().hashCode();
            }
            if (hasEndSleepRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getEndSleepRequest().hashCode();
            }
            if (hasEndSleepResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getEndSleepResponse().hashCode();
            }
            if (hasFavoriteSportsNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getFavoriteSportsNotification().hashCode();
            }
            if (hasFavoriteSportsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getFavoriteSportsRequest().hashCode();
            }
            if (hasFavoriteSportsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getFavoriteSportsResponse().hashCode();
            }
            if (hasDistanceCalibrationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getDistanceCalibrationRequest().hashCode();
            }
            if (hasDistanceCalibrationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getDistanceCalibrationResponse().hashCode();
            }
            if (hasDistanceCalibrationNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getDistanceCalibrationNotification().hashCode();
            }
            if (hasDistanceCalibrationNotificationV2()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getDistanceCalibrationNotificationV2().hashCode();
            }
            if (hasDistanceCalibrationCancelNotification()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getDistanceCalibrationCancelNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if (hasFavoriteSportsNotification() && !getFavoriteSportsNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFavoriteSportsResponse() && !getFavoriteSportsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDistanceCalibrationNotificationV2() || getDistanceCalibrationNotificationV2().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getAlertNotification());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getLogPermissionRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getLogPermissionResponse());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getEndSleepRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getEndSleepResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getFavoriteSportsNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getFavoriteSportsRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getFavoriteSportsResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getDistanceCalibrationRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getDistanceCalibrationResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getDistanceCalibrationNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getDistanceCalibrationNotificationV2());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getDistanceCalibrationCancelNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> alertNotificationBuilder_;
            private AlertNotification alertNotification_;
            private int bitField0_;
            private SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> distanceCalibrationCancelNotificationBuilder_;
            private DistanceCalibrationCancelNotification distanceCalibrationCancelNotification_;
            private SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> distanceCalibrationNotificationBuilder_;
            private SingleFieldBuilderV3<DistanceCalibrationNotification, DistanceCalibrationNotification.Builder, DistanceCalibrationNotificationOrBuilder> distanceCalibrationNotificationV2Builder_;
            private DistanceCalibrationNotification distanceCalibrationNotificationV2_;
            private DistanceCalibrationCancelNotification distanceCalibrationNotification_;
            private SingleFieldBuilderV3<DistanceCalibrationRequest, DistanceCalibrationRequest.Builder, DistanceCalibrationRequestOrBuilder> distanceCalibrationRequestBuilder_;
            private DistanceCalibrationRequest distanceCalibrationRequest_;
            private SingleFieldBuilderV3<DistanceCalibrationResponse, DistanceCalibrationResponse.Builder, DistanceCalibrationResponseOrBuilder> distanceCalibrationResponseBuilder_;
            private DistanceCalibrationResponse distanceCalibrationResponse_;
            private SingleFieldBuilderV3<EndSleepRequest, EndSleepRequest.Builder, EndSleepRequestOrBuilder> endSleepRequestBuilder_;
            private EndSleepRequest endSleepRequest_;
            private SingleFieldBuilderV3<EndSleepResponse, EndSleepResponse.Builder, EndSleepResponseOrBuilder> endSleepResponseBuilder_;
            private EndSleepResponse endSleepResponse_;
            private SingleFieldBuilderV3<FavoriteSportsNotification, FavoriteSportsNotification.Builder, FavoriteSportsNotificationOrBuilder> favoriteSportsNotificationBuilder_;
            private FavoriteSportsNotification favoriteSportsNotification_;
            private SingleFieldBuilderV3<FavoriteSportsRequest, FavoriteSportsRequest.Builder, FavoriteSportsRequestOrBuilder> favoriteSportsRequestBuilder_;
            private FavoriteSportsRequest favoriteSportsRequest_;
            private SingleFieldBuilderV3<FavoriteSportsResponse, FavoriteSportsResponse.Builder, FavoriteSportsResponseOrBuilder> favoriteSportsResponseBuilder_;
            private FavoriteSportsResponse favoriteSportsResponse_;
            private SingleFieldBuilderV3<LogPermissionRequest, LogPermissionRequest.Builder, LogPermissionRequestOrBuilder> logPermissionRequestBuilder_;
            private LogPermissionRequest logPermissionRequest_;
            private SingleFieldBuilderV3<LogPermissionResponse, LogPermissionResponse.Builder, LogPermissionResponseOrBuilder> logPermissionResponseBuilder_;
            private LogPermissionResponse logPermissionResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                    service.alertNotification_ = singleFieldBuilderV3 == null ? this.alertNotification_ : (AlertNotification) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<LogPermissionRequest, LogPermissionRequest.Builder, LogPermissionRequestOrBuilder> singleFieldBuilderV4 = this.logPermissionRequestBuilder_;
                    service.logPermissionRequest_ = singleFieldBuilderV4 == null ? this.logPermissionRequest_ : (LogPermissionRequest) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<LogPermissionResponse, LogPermissionResponse.Builder, LogPermissionResponseOrBuilder> singleFieldBuilderV5 = this.logPermissionResponseBuilder_;
                    service.logPermissionResponse_ = singleFieldBuilderV5 == null ? this.logPermissionResponse_ : (LogPermissionResponse) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<EndSleepRequest, EndSleepRequest.Builder, EndSleepRequestOrBuilder> singleFieldBuilderV6 = this.endSleepRequestBuilder_;
                    service.endSleepRequest_ = singleFieldBuilderV6 == null ? this.endSleepRequest_ : (EndSleepRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<EndSleepResponse, EndSleepResponse.Builder, EndSleepResponseOrBuilder> singleFieldBuilderV7 = this.endSleepResponseBuilder_;
                    service.endSleepResponse_ = singleFieldBuilderV7 == null ? this.endSleepResponse_ : (EndSleepResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<FavoriteSportsNotification, FavoriteSportsNotification.Builder, FavoriteSportsNotificationOrBuilder> singleFieldBuilderV8 = this.favoriteSportsNotificationBuilder_;
                    service.favoriteSportsNotification_ = singleFieldBuilderV8 == null ? this.favoriteSportsNotification_ : (FavoriteSportsNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<FavoriteSportsRequest, FavoriteSportsRequest.Builder, FavoriteSportsRequestOrBuilder> singleFieldBuilderV9 = this.favoriteSportsRequestBuilder_;
                    service.favoriteSportsRequest_ = singleFieldBuilderV9 == null ? this.favoriteSportsRequest_ : (FavoriteSportsRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<FavoriteSportsResponse, FavoriteSportsResponse.Builder, FavoriteSportsResponseOrBuilder> singleFieldBuilderV10 = this.favoriteSportsResponseBuilder_;
                    service.favoriteSportsResponse_ = singleFieldBuilderV10 == null ? this.favoriteSportsResponse_ : (FavoriteSportsResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<DistanceCalibrationRequest, DistanceCalibrationRequest.Builder, DistanceCalibrationRequestOrBuilder> singleFieldBuilderV11 = this.distanceCalibrationRequestBuilder_;
                    service.distanceCalibrationRequest_ = singleFieldBuilderV11 == null ? this.distanceCalibrationRequest_ : (DistanceCalibrationRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<DistanceCalibrationResponse, DistanceCalibrationResponse.Builder, DistanceCalibrationResponseOrBuilder> singleFieldBuilderV12 = this.distanceCalibrationResponseBuilder_;
                    service.distanceCalibrationResponse_ = singleFieldBuilderV12 == null ? this.distanceCalibrationResponse_ : (DistanceCalibrationResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV13 = this.distanceCalibrationNotificationBuilder_;
                    service.distanceCalibrationNotification_ = singleFieldBuilderV13 == null ? this.distanceCalibrationNotification_ : (DistanceCalibrationCancelNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<DistanceCalibrationNotification, DistanceCalibrationNotification.Builder, DistanceCalibrationNotificationOrBuilder> singleFieldBuilderV14 = this.distanceCalibrationNotificationV2Builder_;
                    service.distanceCalibrationNotificationV2_ = singleFieldBuilderV14 == null ? this.distanceCalibrationNotificationV2_ : (DistanceCalibrationNotification) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV15 = this.distanceCalibrationCancelNotificationBuilder_;
                    service.distanceCalibrationCancelNotification_ = singleFieldBuilderV15 == null ? this.distanceCalibrationCancelNotification_ : (DistanceCalibrationCancelNotification) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> getAlertNotificationFieldBuilder() {
                if (this.alertNotificationBuilder_ == null) {
                    this.alertNotificationBuilder_ = new SingleFieldBuilderV3<>(getAlertNotification(), getParentForChildren(), isClean());
                    this.alertNotification_ = null;
                }
                return this.alertNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_Service_descriptor;
            }

            private SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> getDistanceCalibrationCancelNotificationFieldBuilder() {
                if (this.distanceCalibrationCancelNotificationBuilder_ == null) {
                    this.distanceCalibrationCancelNotificationBuilder_ = new SingleFieldBuilderV3<>(getDistanceCalibrationCancelNotification(), getParentForChildren(), isClean());
                    this.distanceCalibrationCancelNotification_ = null;
                }
                return this.distanceCalibrationCancelNotificationBuilder_;
            }

            private SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> getDistanceCalibrationNotificationFieldBuilder() {
                if (this.distanceCalibrationNotificationBuilder_ == null) {
                    this.distanceCalibrationNotificationBuilder_ = new SingleFieldBuilderV3<>(getDistanceCalibrationNotification(), getParentForChildren(), isClean());
                    this.distanceCalibrationNotification_ = null;
                }
                return this.distanceCalibrationNotificationBuilder_;
            }

            private SingleFieldBuilderV3<DistanceCalibrationNotification, DistanceCalibrationNotification.Builder, DistanceCalibrationNotificationOrBuilder> getDistanceCalibrationNotificationV2FieldBuilder() {
                if (this.distanceCalibrationNotificationV2Builder_ == null) {
                    this.distanceCalibrationNotificationV2Builder_ = new SingleFieldBuilderV3<>(getDistanceCalibrationNotificationV2(), getParentForChildren(), isClean());
                    this.distanceCalibrationNotificationV2_ = null;
                }
                return this.distanceCalibrationNotificationV2Builder_;
            }

            private SingleFieldBuilderV3<DistanceCalibrationRequest, DistanceCalibrationRequest.Builder, DistanceCalibrationRequestOrBuilder> getDistanceCalibrationRequestFieldBuilder() {
                if (this.distanceCalibrationRequestBuilder_ == null) {
                    this.distanceCalibrationRequestBuilder_ = new SingleFieldBuilderV3<>(getDistanceCalibrationRequest(), getParentForChildren(), isClean());
                    this.distanceCalibrationRequest_ = null;
                }
                return this.distanceCalibrationRequestBuilder_;
            }

            private SingleFieldBuilderV3<DistanceCalibrationResponse, DistanceCalibrationResponse.Builder, DistanceCalibrationResponseOrBuilder> getDistanceCalibrationResponseFieldBuilder() {
                if (this.distanceCalibrationResponseBuilder_ == null) {
                    this.distanceCalibrationResponseBuilder_ = new SingleFieldBuilderV3<>(getDistanceCalibrationResponse(), getParentForChildren(), isClean());
                    this.distanceCalibrationResponse_ = null;
                }
                return this.distanceCalibrationResponseBuilder_;
            }

            private SingleFieldBuilderV3<EndSleepRequest, EndSleepRequest.Builder, EndSleepRequestOrBuilder> getEndSleepRequestFieldBuilder() {
                if (this.endSleepRequestBuilder_ == null) {
                    this.endSleepRequestBuilder_ = new SingleFieldBuilderV3<>(getEndSleepRequest(), getParentForChildren(), isClean());
                    this.endSleepRequest_ = null;
                }
                return this.endSleepRequestBuilder_;
            }

            private SingleFieldBuilderV3<EndSleepResponse, EndSleepResponse.Builder, EndSleepResponseOrBuilder> getEndSleepResponseFieldBuilder() {
                if (this.endSleepResponseBuilder_ == null) {
                    this.endSleepResponseBuilder_ = new SingleFieldBuilderV3<>(getEndSleepResponse(), getParentForChildren(), isClean());
                    this.endSleepResponse_ = null;
                }
                return this.endSleepResponseBuilder_;
            }

            private SingleFieldBuilderV3<FavoriteSportsNotification, FavoriteSportsNotification.Builder, FavoriteSportsNotificationOrBuilder> getFavoriteSportsNotificationFieldBuilder() {
                if (this.favoriteSportsNotificationBuilder_ == null) {
                    this.favoriteSportsNotificationBuilder_ = new SingleFieldBuilderV3<>(getFavoriteSportsNotification(), getParentForChildren(), isClean());
                    this.favoriteSportsNotification_ = null;
                }
                return this.favoriteSportsNotificationBuilder_;
            }

            private SingleFieldBuilderV3<FavoriteSportsRequest, FavoriteSportsRequest.Builder, FavoriteSportsRequestOrBuilder> getFavoriteSportsRequestFieldBuilder() {
                if (this.favoriteSportsRequestBuilder_ == null) {
                    this.favoriteSportsRequestBuilder_ = new SingleFieldBuilderV3<>(getFavoriteSportsRequest(), getParentForChildren(), isClean());
                    this.favoriteSportsRequest_ = null;
                }
                return this.favoriteSportsRequestBuilder_;
            }

            private SingleFieldBuilderV3<FavoriteSportsResponse, FavoriteSportsResponse.Builder, FavoriteSportsResponseOrBuilder> getFavoriteSportsResponseFieldBuilder() {
                if (this.favoriteSportsResponseBuilder_ == null) {
                    this.favoriteSportsResponseBuilder_ = new SingleFieldBuilderV3<>(getFavoriteSportsResponse(), getParentForChildren(), isClean());
                    this.favoriteSportsResponse_ = null;
                }
                return this.favoriteSportsResponseBuilder_;
            }

            private SingleFieldBuilderV3<LogPermissionRequest, LogPermissionRequest.Builder, LogPermissionRequestOrBuilder> getLogPermissionRequestFieldBuilder() {
                if (this.logPermissionRequestBuilder_ == null) {
                    this.logPermissionRequestBuilder_ = new SingleFieldBuilderV3<>(getLogPermissionRequest(), getParentForChildren(), isClean());
                    this.logPermissionRequest_ = null;
                }
                return this.logPermissionRequestBuilder_;
            }

            private SingleFieldBuilderV3<LogPermissionResponse, LogPermissionResponse.Builder, LogPermissionResponseOrBuilder> getLogPermissionResponseFieldBuilder() {
                if (this.logPermissionResponseBuilder_ == null) {
                    this.logPermissionResponseBuilder_ = new SingleFieldBuilderV3<>(getLogPermissionResponse(), getParentForChildren(), isClean());
                    this.logPermissionResponse_ = null;
                }
                return this.logPermissionResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAlertNotificationFieldBuilder();
                    getLogPermissionRequestFieldBuilder();
                    getLogPermissionResponseFieldBuilder();
                    getEndSleepRequestFieldBuilder();
                    getEndSleepResponseFieldBuilder();
                    getFavoriteSportsNotificationFieldBuilder();
                    getFavoriteSportsRequestFieldBuilder();
                    getFavoriteSportsResponseFieldBuilder();
                    getDistanceCalibrationRequestFieldBuilder();
                    getDistanceCalibrationResponseFieldBuilder();
                    getDistanceCalibrationNotificationFieldBuilder();
                    getDistanceCalibrationNotificationV2FieldBuilder();
                    getDistanceCalibrationCancelNotificationFieldBuilder();
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
                this.alertNotification_ = null;
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.alertNotificationBuilder_ = null;
                }
                this.logPermissionRequest_ = null;
                SingleFieldBuilderV3<LogPermissionRequest, LogPermissionRequest.Builder, LogPermissionRequestOrBuilder> singleFieldBuilderV4 = this.logPermissionRequestBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.logPermissionRequestBuilder_ = null;
                }
                this.logPermissionResponse_ = null;
                SingleFieldBuilderV3<LogPermissionResponse, LogPermissionResponse.Builder, LogPermissionResponseOrBuilder> singleFieldBuilderV5 = this.logPermissionResponseBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.logPermissionResponseBuilder_ = null;
                }
                this.endSleepRequest_ = null;
                SingleFieldBuilderV3<EndSleepRequest, EndSleepRequest.Builder, EndSleepRequestOrBuilder> singleFieldBuilderV6 = this.endSleepRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.endSleepRequestBuilder_ = null;
                }
                this.endSleepResponse_ = null;
                SingleFieldBuilderV3<EndSleepResponse, EndSleepResponse.Builder, EndSleepResponseOrBuilder> singleFieldBuilderV7 = this.endSleepResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.endSleepResponseBuilder_ = null;
                }
                this.favoriteSportsNotification_ = null;
                SingleFieldBuilderV3<FavoriteSportsNotification, FavoriteSportsNotification.Builder, FavoriteSportsNotificationOrBuilder> singleFieldBuilderV8 = this.favoriteSportsNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.favoriteSportsNotificationBuilder_ = null;
                }
                this.favoriteSportsRequest_ = null;
                SingleFieldBuilderV3<FavoriteSportsRequest, FavoriteSportsRequest.Builder, FavoriteSportsRequestOrBuilder> singleFieldBuilderV9 = this.favoriteSportsRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.favoriteSportsRequestBuilder_ = null;
                }
                this.favoriteSportsResponse_ = null;
                SingleFieldBuilderV3<FavoriteSportsResponse, FavoriteSportsResponse.Builder, FavoriteSportsResponseOrBuilder> singleFieldBuilderV10 = this.favoriteSportsResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.favoriteSportsResponseBuilder_ = null;
                }
                this.distanceCalibrationRequest_ = null;
                SingleFieldBuilderV3<DistanceCalibrationRequest, DistanceCalibrationRequest.Builder, DistanceCalibrationRequestOrBuilder> singleFieldBuilderV11 = this.distanceCalibrationRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.distanceCalibrationRequestBuilder_ = null;
                }
                this.distanceCalibrationResponse_ = null;
                SingleFieldBuilderV3<DistanceCalibrationResponse, DistanceCalibrationResponse.Builder, DistanceCalibrationResponseOrBuilder> singleFieldBuilderV12 = this.distanceCalibrationResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.distanceCalibrationResponseBuilder_ = null;
                }
                this.distanceCalibrationNotification_ = null;
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV13 = this.distanceCalibrationNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.distanceCalibrationNotificationBuilder_ = null;
                }
                this.distanceCalibrationNotificationV2_ = null;
                SingleFieldBuilderV3<DistanceCalibrationNotification, DistanceCalibrationNotification.Builder, DistanceCalibrationNotificationOrBuilder> singleFieldBuilderV14 = this.distanceCalibrationNotificationV2Builder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.distanceCalibrationNotificationV2Builder_ = null;
                }
                this.distanceCalibrationCancelNotification_ = null;
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV15 = this.distanceCalibrationCancelNotificationBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.distanceCalibrationCancelNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearAlertNotification() {
                this.bitField0_ &= -2;
                this.alertNotification_ = null;
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.alertNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDistanceCalibrationCancelNotification() {
                this.bitField0_ &= -4097;
                this.distanceCalibrationCancelNotification_ = null;
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationCancelNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.distanceCalibrationCancelNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Deprecated
            public Builder clearDistanceCalibrationNotification() {
                this.bitField0_ &= -1025;
                this.distanceCalibrationNotification_ = null;
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.distanceCalibrationNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDistanceCalibrationNotificationV2() {
                this.bitField0_ &= -2049;
                this.distanceCalibrationNotificationV2_ = null;
                SingleFieldBuilderV3<DistanceCalibrationNotification, DistanceCalibrationNotification.Builder, DistanceCalibrationNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationV2Builder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.distanceCalibrationNotificationV2Builder_ = null;
                }
                onChanged();
                return this;
            }

            @Deprecated
            public Builder clearDistanceCalibrationRequest() {
                this.bitField0_ &= -257;
                this.distanceCalibrationRequest_ = null;
                SingleFieldBuilderV3<DistanceCalibrationRequest, DistanceCalibrationRequest.Builder, DistanceCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.distanceCalibrationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Deprecated
            public Builder clearDistanceCalibrationResponse() {
                this.bitField0_ &= -513;
                this.distanceCalibrationResponse_ = null;
                SingleFieldBuilderV3<DistanceCalibrationResponse, DistanceCalibrationResponse.Builder, DistanceCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.distanceCalibrationResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEndSleepRequest() {
                this.bitField0_ &= -9;
                this.endSleepRequest_ = null;
                SingleFieldBuilderV3<EndSleepRequest, EndSleepRequest.Builder, EndSleepRequestOrBuilder> singleFieldBuilderV3 = this.endSleepRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.endSleepRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEndSleepResponse() {
                this.bitField0_ &= -17;
                this.endSleepResponse_ = null;
                SingleFieldBuilderV3<EndSleepResponse, EndSleepResponse.Builder, EndSleepResponseOrBuilder> singleFieldBuilderV3 = this.endSleepResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.endSleepResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFavoriteSportsNotification() {
                this.bitField0_ &= -33;
                this.favoriteSportsNotification_ = null;
                SingleFieldBuilderV3<FavoriteSportsNotification, FavoriteSportsNotification.Builder, FavoriteSportsNotificationOrBuilder> singleFieldBuilderV3 = this.favoriteSportsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.favoriteSportsNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFavoriteSportsRequest() {
                this.bitField0_ &= -65;
                this.favoriteSportsRequest_ = null;
                SingleFieldBuilderV3<FavoriteSportsRequest, FavoriteSportsRequest.Builder, FavoriteSportsRequestOrBuilder> singleFieldBuilderV3 = this.favoriteSportsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.favoriteSportsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFavoriteSportsResponse() {
                this.bitField0_ &= -129;
                this.favoriteSportsResponse_ = null;
                SingleFieldBuilderV3<FavoriteSportsResponse, FavoriteSportsResponse.Builder, FavoriteSportsResponseOrBuilder> singleFieldBuilderV3 = this.favoriteSportsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.favoriteSportsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLogPermissionRequest() {
                this.bitField0_ &= -3;
                this.logPermissionRequest_ = null;
                SingleFieldBuilderV3<LogPermissionRequest, LogPermissionRequest.Builder, LogPermissionRequestOrBuilder> singleFieldBuilderV3 = this.logPermissionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.logPermissionRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLogPermissionResponse() {
                this.bitField0_ &= -5;
                this.logPermissionResponse_ = null;
                SingleFieldBuilderV3<LogPermissionResponse, LogPermissionResponse.Builder, LogPermissionResponseOrBuilder> singleFieldBuilderV3 = this.logPermissionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.logPermissionResponseBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public AlertNotification getAlertNotification() {
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertNotification) singleFieldBuilderV3.getMessage();
                }
                AlertNotification alertNotification = this.alertNotification_;
                return alertNotification == null ? AlertNotification.getDefaultInstance() : alertNotification;
            }

            public AlertNotification.Builder getAlertNotificationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AlertNotification.Builder) getAlertNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
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
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public DistanceCalibrationCancelNotification getDistanceCalibrationCancelNotification() {
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationCancelNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DistanceCalibrationCancelNotification) singleFieldBuilderV3.getMessage();
                }
                DistanceCalibrationCancelNotification distanceCalibrationCancelNotification = this.distanceCalibrationCancelNotification_;
                return distanceCalibrationCancelNotification == null ? DistanceCalibrationCancelNotification.getDefaultInstance() : distanceCalibrationCancelNotification;
            }

            public DistanceCalibrationCancelNotification.Builder getDistanceCalibrationCancelNotificationBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (DistanceCalibrationCancelNotification.Builder) getDistanceCalibrationCancelNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public DistanceCalibrationCancelNotificationOrBuilder getDistanceCalibrationCancelNotificationOrBuilder() {
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationCancelNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DistanceCalibrationCancelNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DistanceCalibrationCancelNotification distanceCalibrationCancelNotification = this.distanceCalibrationCancelNotification_;
                return distanceCalibrationCancelNotification == null ? DistanceCalibrationCancelNotification.getDefaultInstance() : distanceCalibrationCancelNotification;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            @Deprecated
            public DistanceCalibrationCancelNotification getDistanceCalibrationNotification() {
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DistanceCalibrationCancelNotification) singleFieldBuilderV3.getMessage();
                }
                DistanceCalibrationCancelNotification distanceCalibrationCancelNotification = this.distanceCalibrationNotification_;
                return distanceCalibrationCancelNotification == null ? DistanceCalibrationCancelNotification.getDefaultInstance() : distanceCalibrationCancelNotification;
            }

            @Deprecated
            public DistanceCalibrationCancelNotification.Builder getDistanceCalibrationNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (DistanceCalibrationCancelNotification.Builder) getDistanceCalibrationNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            @Deprecated
            public DistanceCalibrationCancelNotificationOrBuilder getDistanceCalibrationNotificationOrBuilder() {
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DistanceCalibrationCancelNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DistanceCalibrationCancelNotification distanceCalibrationCancelNotification = this.distanceCalibrationNotification_;
                return distanceCalibrationCancelNotification == null ? DistanceCalibrationCancelNotification.getDefaultInstance() : distanceCalibrationCancelNotification;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public DistanceCalibrationNotification getDistanceCalibrationNotificationV2() {
                SingleFieldBuilderV3<DistanceCalibrationNotification, DistanceCalibrationNotification.Builder, DistanceCalibrationNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationV2Builder_;
                if (singleFieldBuilderV3 != null) {
                    return (DistanceCalibrationNotification) singleFieldBuilderV3.getMessage();
                }
                DistanceCalibrationNotification distanceCalibrationNotification = this.distanceCalibrationNotificationV2_;
                return distanceCalibrationNotification == null ? DistanceCalibrationNotification.getDefaultInstance() : distanceCalibrationNotification;
            }

            public DistanceCalibrationNotification.Builder getDistanceCalibrationNotificationV2Builder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (DistanceCalibrationNotification.Builder) getDistanceCalibrationNotificationV2FieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public DistanceCalibrationNotificationOrBuilder getDistanceCalibrationNotificationV2OrBuilder() {
                SingleFieldBuilderV3<DistanceCalibrationNotification, DistanceCalibrationNotification.Builder, DistanceCalibrationNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationV2Builder_;
                if (singleFieldBuilderV3 != null) {
                    return (DistanceCalibrationNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DistanceCalibrationNotification distanceCalibrationNotification = this.distanceCalibrationNotificationV2_;
                return distanceCalibrationNotification == null ? DistanceCalibrationNotification.getDefaultInstance() : distanceCalibrationNotification;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            @Deprecated
            public DistanceCalibrationRequest getDistanceCalibrationRequest() {
                SingleFieldBuilderV3<DistanceCalibrationRequest, DistanceCalibrationRequest.Builder, DistanceCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DistanceCalibrationRequest) singleFieldBuilderV3.getMessage();
                }
                DistanceCalibrationRequest distanceCalibrationRequest = this.distanceCalibrationRequest_;
                return distanceCalibrationRequest == null ? DistanceCalibrationRequest.getDefaultInstance() : distanceCalibrationRequest;
            }

            @Deprecated
            public DistanceCalibrationRequest.Builder getDistanceCalibrationRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (DistanceCalibrationRequest.Builder) getDistanceCalibrationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            @Deprecated
            public DistanceCalibrationRequestOrBuilder getDistanceCalibrationRequestOrBuilder() {
                SingleFieldBuilderV3<DistanceCalibrationRequest, DistanceCalibrationRequest.Builder, DistanceCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DistanceCalibrationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DistanceCalibrationRequest distanceCalibrationRequest = this.distanceCalibrationRequest_;
                return distanceCalibrationRequest == null ? DistanceCalibrationRequest.getDefaultInstance() : distanceCalibrationRequest;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            @Deprecated
            public DistanceCalibrationResponse getDistanceCalibrationResponse() {
                SingleFieldBuilderV3<DistanceCalibrationResponse, DistanceCalibrationResponse.Builder, DistanceCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DistanceCalibrationResponse) singleFieldBuilderV3.getMessage();
                }
                DistanceCalibrationResponse distanceCalibrationResponse = this.distanceCalibrationResponse_;
                return distanceCalibrationResponse == null ? DistanceCalibrationResponse.getDefaultInstance() : distanceCalibrationResponse;
            }

            @Deprecated
            public DistanceCalibrationResponse.Builder getDistanceCalibrationResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (DistanceCalibrationResponse.Builder) getDistanceCalibrationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            @Deprecated
            public DistanceCalibrationResponseOrBuilder getDistanceCalibrationResponseOrBuilder() {
                SingleFieldBuilderV3<DistanceCalibrationResponse, DistanceCalibrationResponse.Builder, DistanceCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DistanceCalibrationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DistanceCalibrationResponse distanceCalibrationResponse = this.distanceCalibrationResponse_;
                return distanceCalibrationResponse == null ? DistanceCalibrationResponse.getDefaultInstance() : distanceCalibrationResponse;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public EndSleepRequest getEndSleepRequest() {
                SingleFieldBuilderV3<EndSleepRequest, EndSleepRequest.Builder, EndSleepRequestOrBuilder> singleFieldBuilderV3 = this.endSleepRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EndSleepRequest) singleFieldBuilderV3.getMessage();
                }
                EndSleepRequest endSleepRequest = this.endSleepRequest_;
                return endSleepRequest == null ? EndSleepRequest.getDefaultInstance() : endSleepRequest;
            }

            public EndSleepRequest.Builder getEndSleepRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (EndSleepRequest.Builder) getEndSleepRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public EndSleepRequestOrBuilder getEndSleepRequestOrBuilder() {
                SingleFieldBuilderV3<EndSleepRequest, EndSleepRequest.Builder, EndSleepRequestOrBuilder> singleFieldBuilderV3 = this.endSleepRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EndSleepRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EndSleepRequest endSleepRequest = this.endSleepRequest_;
                return endSleepRequest == null ? EndSleepRequest.getDefaultInstance() : endSleepRequest;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public EndSleepResponse getEndSleepResponse() {
                SingleFieldBuilderV3<EndSleepResponse, EndSleepResponse.Builder, EndSleepResponseOrBuilder> singleFieldBuilderV3 = this.endSleepResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EndSleepResponse) singleFieldBuilderV3.getMessage();
                }
                EndSleepResponse endSleepResponse = this.endSleepResponse_;
                return endSleepResponse == null ? EndSleepResponse.getDefaultInstance() : endSleepResponse;
            }

            public EndSleepResponse.Builder getEndSleepResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (EndSleepResponse.Builder) getEndSleepResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public EndSleepResponseOrBuilder getEndSleepResponseOrBuilder() {
                SingleFieldBuilderV3<EndSleepResponse, EndSleepResponse.Builder, EndSleepResponseOrBuilder> singleFieldBuilderV3 = this.endSleepResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EndSleepResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EndSleepResponse endSleepResponse = this.endSleepResponse_;
                return endSleepResponse == null ? EndSleepResponse.getDefaultInstance() : endSleepResponse;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public FavoriteSportsNotification getFavoriteSportsNotification() {
                SingleFieldBuilderV3<FavoriteSportsNotification, FavoriteSportsNotification.Builder, FavoriteSportsNotificationOrBuilder> singleFieldBuilderV3 = this.favoriteSportsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FavoriteSportsNotification) singleFieldBuilderV3.getMessage();
                }
                FavoriteSportsNotification favoriteSportsNotification = this.favoriteSportsNotification_;
                return favoriteSportsNotification == null ? FavoriteSportsNotification.getDefaultInstance() : favoriteSportsNotification;
            }

            public FavoriteSportsNotification.Builder getFavoriteSportsNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (FavoriteSportsNotification.Builder) getFavoriteSportsNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public FavoriteSportsNotificationOrBuilder getFavoriteSportsNotificationOrBuilder() {
                SingleFieldBuilderV3<FavoriteSportsNotification, FavoriteSportsNotification.Builder, FavoriteSportsNotificationOrBuilder> singleFieldBuilderV3 = this.favoriteSportsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FavoriteSportsNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FavoriteSportsNotification favoriteSportsNotification = this.favoriteSportsNotification_;
                return favoriteSportsNotification == null ? FavoriteSportsNotification.getDefaultInstance() : favoriteSportsNotification;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public FavoriteSportsRequest getFavoriteSportsRequest() {
                SingleFieldBuilderV3<FavoriteSportsRequest, FavoriteSportsRequest.Builder, FavoriteSportsRequestOrBuilder> singleFieldBuilderV3 = this.favoriteSportsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FavoriteSportsRequest) singleFieldBuilderV3.getMessage();
                }
                FavoriteSportsRequest favoriteSportsRequest = this.favoriteSportsRequest_;
                return favoriteSportsRequest == null ? FavoriteSportsRequest.getDefaultInstance() : favoriteSportsRequest;
            }

            public FavoriteSportsRequest.Builder getFavoriteSportsRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (FavoriteSportsRequest.Builder) getFavoriteSportsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public FavoriteSportsRequestOrBuilder getFavoriteSportsRequestOrBuilder() {
                SingleFieldBuilderV3<FavoriteSportsRequest, FavoriteSportsRequest.Builder, FavoriteSportsRequestOrBuilder> singleFieldBuilderV3 = this.favoriteSportsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FavoriteSportsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FavoriteSportsRequest favoriteSportsRequest = this.favoriteSportsRequest_;
                return favoriteSportsRequest == null ? FavoriteSportsRequest.getDefaultInstance() : favoriteSportsRequest;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public FavoriteSportsResponse getFavoriteSportsResponse() {
                SingleFieldBuilderV3<FavoriteSportsResponse, FavoriteSportsResponse.Builder, FavoriteSportsResponseOrBuilder> singleFieldBuilderV3 = this.favoriteSportsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FavoriteSportsResponse) singleFieldBuilderV3.getMessage();
                }
                FavoriteSportsResponse favoriteSportsResponse = this.favoriteSportsResponse_;
                return favoriteSportsResponse == null ? FavoriteSportsResponse.getDefaultInstance() : favoriteSportsResponse;
            }

            public FavoriteSportsResponse.Builder getFavoriteSportsResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (FavoriteSportsResponse.Builder) getFavoriteSportsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public FavoriteSportsResponseOrBuilder getFavoriteSportsResponseOrBuilder() {
                SingleFieldBuilderV3<FavoriteSportsResponse, FavoriteSportsResponse.Builder, FavoriteSportsResponseOrBuilder> singleFieldBuilderV3 = this.favoriteSportsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FavoriteSportsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FavoriteSportsResponse favoriteSportsResponse = this.favoriteSportsResponse_;
                return favoriteSportsResponse == null ? FavoriteSportsResponse.getDefaultInstance() : favoriteSportsResponse;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public LogPermissionRequest getLogPermissionRequest() {
                SingleFieldBuilderV3<LogPermissionRequest, LogPermissionRequest.Builder, LogPermissionRequestOrBuilder> singleFieldBuilderV3 = this.logPermissionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LogPermissionRequest) singleFieldBuilderV3.getMessage();
                }
                LogPermissionRequest logPermissionRequest = this.logPermissionRequest_;
                return logPermissionRequest == null ? LogPermissionRequest.getDefaultInstance() : logPermissionRequest;
            }

            public LogPermissionRequest.Builder getLogPermissionRequestBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (LogPermissionRequest.Builder) getLogPermissionRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public LogPermissionRequestOrBuilder getLogPermissionRequestOrBuilder() {
                SingleFieldBuilderV3<LogPermissionRequest, LogPermissionRequest.Builder, LogPermissionRequestOrBuilder> singleFieldBuilderV3 = this.logPermissionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LogPermissionRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LogPermissionRequest logPermissionRequest = this.logPermissionRequest_;
                return logPermissionRequest == null ? LogPermissionRequest.getDefaultInstance() : logPermissionRequest;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public LogPermissionResponse getLogPermissionResponse() {
                SingleFieldBuilderV3<LogPermissionResponse, LogPermissionResponse.Builder, LogPermissionResponseOrBuilder> singleFieldBuilderV3 = this.logPermissionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LogPermissionResponse) singleFieldBuilderV3.getMessage();
                }
                LogPermissionResponse logPermissionResponse = this.logPermissionResponse_;
                return logPermissionResponse == null ? LogPermissionResponse.getDefaultInstance() : logPermissionResponse;
            }

            public LogPermissionResponse.Builder getLogPermissionResponseBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (LogPermissionResponse.Builder) getLogPermissionResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public LogPermissionResponseOrBuilder getLogPermissionResponseOrBuilder() {
                SingleFieldBuilderV3<LogPermissionResponse, LogPermissionResponse.Builder, LogPermissionResponseOrBuilder> singleFieldBuilderV3 = this.logPermissionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LogPermissionResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LogPermissionResponse logPermissionResponse = this.logPermissionResponse_;
                return logPermissionResponse == null ? LogPermissionResponse.getDefaultInstance() : logPermissionResponse;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public boolean hasAlertNotification() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public boolean hasDistanceCalibrationCancelNotification() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            @Deprecated
            public boolean hasDistanceCalibrationNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public boolean hasDistanceCalibrationNotificationV2() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            @Deprecated
            public boolean hasDistanceCalibrationRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            @Deprecated
            public boolean hasDistanceCalibrationResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public boolean hasEndSleepRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public boolean hasEndSleepResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public boolean hasFavoriteSportsNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public boolean hasFavoriteSportsRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public boolean hasFavoriteSportsResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public boolean hasLogPermissionRequest() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILimitedUi.ServiceOrBuilder
            public boolean hasLogPermissionResponse() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILimitedUi.internal_static_GDI_Proto_LimitedUi_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasFavoriteSportsNotification() && !getFavoriteSportsNotification().isInitialized()) {
                    return false;
                }
                if (!hasFavoriteSportsResponse() || getFavoriteSportsResponse().isInitialized()) {
                    return !hasDistanceCalibrationNotificationV2() || getDistanceCalibrationNotificationV2().isInitialized();
                }
                return false;
            }

            public Builder mergeAlertNotification(AlertNotification alertNotification) {
                AlertNotification alertNotification2;
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(alertNotification);
                } else if ((this.bitField0_ & 1) == 0 || (alertNotification2 = this.alertNotification_) == null || alertNotification2 == AlertNotification.getDefaultInstance()) {
                    this.alertNotification_ = alertNotification;
                } else {
                    getAlertNotificationBuilder().mergeFrom(alertNotification);
                }
                if (this.alertNotification_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDistanceCalibrationCancelNotification(DistanceCalibrationCancelNotification distanceCalibrationCancelNotification) {
                DistanceCalibrationCancelNotification distanceCalibrationCancelNotification2;
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationCancelNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(distanceCalibrationCancelNotification);
                } else if ((this.bitField0_ & 4096) == 0 || (distanceCalibrationCancelNotification2 = this.distanceCalibrationCancelNotification_) == null || distanceCalibrationCancelNotification2 == DistanceCalibrationCancelNotification.getDefaultInstance()) {
                    this.distanceCalibrationCancelNotification_ = distanceCalibrationCancelNotification;
                } else {
                    getDistanceCalibrationCancelNotificationBuilder().mergeFrom(distanceCalibrationCancelNotification);
                }
                if (this.distanceCalibrationCancelNotification_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            @Deprecated
            public Builder mergeDistanceCalibrationNotification(DistanceCalibrationCancelNotification distanceCalibrationCancelNotification) {
                DistanceCalibrationCancelNotification distanceCalibrationCancelNotification2;
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(distanceCalibrationCancelNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (distanceCalibrationCancelNotification2 = this.distanceCalibrationNotification_) == null || distanceCalibrationCancelNotification2 == DistanceCalibrationCancelNotification.getDefaultInstance()) {
                    this.distanceCalibrationNotification_ = distanceCalibrationCancelNotification;
                } else {
                    getDistanceCalibrationNotificationBuilder().mergeFrom(distanceCalibrationCancelNotification);
                }
                if (this.distanceCalibrationNotification_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDistanceCalibrationNotificationV2(DistanceCalibrationNotification distanceCalibrationNotification) {
                DistanceCalibrationNotification distanceCalibrationNotification2;
                SingleFieldBuilderV3<DistanceCalibrationNotification, DistanceCalibrationNotification.Builder, DistanceCalibrationNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationV2Builder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(distanceCalibrationNotification);
                } else if ((this.bitField0_ & 2048) == 0 || (distanceCalibrationNotification2 = this.distanceCalibrationNotificationV2_) == null || distanceCalibrationNotification2 == DistanceCalibrationNotification.getDefaultInstance()) {
                    this.distanceCalibrationNotificationV2_ = distanceCalibrationNotification;
                } else {
                    getDistanceCalibrationNotificationV2Builder().mergeFrom(distanceCalibrationNotification);
                }
                if (this.distanceCalibrationNotificationV2_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            @Deprecated
            public Builder mergeDistanceCalibrationRequest(DistanceCalibrationRequest distanceCalibrationRequest) {
                DistanceCalibrationRequest distanceCalibrationRequest2;
                SingleFieldBuilderV3<DistanceCalibrationRequest, DistanceCalibrationRequest.Builder, DistanceCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(distanceCalibrationRequest);
                } else if ((this.bitField0_ & 256) == 0 || (distanceCalibrationRequest2 = this.distanceCalibrationRequest_) == null || distanceCalibrationRequest2 == DistanceCalibrationRequest.getDefaultInstance()) {
                    this.distanceCalibrationRequest_ = distanceCalibrationRequest;
                } else {
                    getDistanceCalibrationRequestBuilder().mergeFrom(distanceCalibrationRequest);
                }
                if (this.distanceCalibrationRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            @Deprecated
            public Builder mergeDistanceCalibrationResponse(DistanceCalibrationResponse distanceCalibrationResponse) {
                DistanceCalibrationResponse distanceCalibrationResponse2;
                SingleFieldBuilderV3<DistanceCalibrationResponse, DistanceCalibrationResponse.Builder, DistanceCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(distanceCalibrationResponse);
                } else if ((this.bitField0_ & 512) == 0 || (distanceCalibrationResponse2 = this.distanceCalibrationResponse_) == null || distanceCalibrationResponse2 == DistanceCalibrationResponse.getDefaultInstance()) {
                    this.distanceCalibrationResponse_ = distanceCalibrationResponse;
                } else {
                    getDistanceCalibrationResponseBuilder().mergeFrom(distanceCalibrationResponse);
                }
                if (this.distanceCalibrationResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEndSleepRequest(EndSleepRequest endSleepRequest) {
                EndSleepRequest endSleepRequest2;
                SingleFieldBuilderV3<EndSleepRequest, EndSleepRequest.Builder, EndSleepRequestOrBuilder> singleFieldBuilderV3 = this.endSleepRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(endSleepRequest);
                } else if ((this.bitField0_ & 8) == 0 || (endSleepRequest2 = this.endSleepRequest_) == null || endSleepRequest2 == EndSleepRequest.getDefaultInstance()) {
                    this.endSleepRequest_ = endSleepRequest;
                } else {
                    getEndSleepRequestBuilder().mergeFrom(endSleepRequest);
                }
                if (this.endSleepRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEndSleepResponse(EndSleepResponse endSleepResponse) {
                EndSleepResponse endSleepResponse2;
                SingleFieldBuilderV3<EndSleepResponse, EndSleepResponse.Builder, EndSleepResponseOrBuilder> singleFieldBuilderV3 = this.endSleepResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(endSleepResponse);
                } else if ((this.bitField0_ & 16) == 0 || (endSleepResponse2 = this.endSleepResponse_) == null || endSleepResponse2 == EndSleepResponse.getDefaultInstance()) {
                    this.endSleepResponse_ = endSleepResponse;
                } else {
                    getEndSleepResponseBuilder().mergeFrom(endSleepResponse);
                }
                if (this.endSleepResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFavoriteSportsNotification(FavoriteSportsNotification favoriteSportsNotification) {
                FavoriteSportsNotification favoriteSportsNotification2;
                SingleFieldBuilderV3<FavoriteSportsNotification, FavoriteSportsNotification.Builder, FavoriteSportsNotificationOrBuilder> singleFieldBuilderV3 = this.favoriteSportsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(favoriteSportsNotification);
                } else if ((this.bitField0_ & 32) == 0 || (favoriteSportsNotification2 = this.favoriteSportsNotification_) == null || favoriteSportsNotification2 == FavoriteSportsNotification.getDefaultInstance()) {
                    this.favoriteSportsNotification_ = favoriteSportsNotification;
                } else {
                    getFavoriteSportsNotificationBuilder().mergeFrom(favoriteSportsNotification);
                }
                if (this.favoriteSportsNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFavoriteSportsRequest(FavoriteSportsRequest favoriteSportsRequest) {
                FavoriteSportsRequest favoriteSportsRequest2;
                SingleFieldBuilderV3<FavoriteSportsRequest, FavoriteSportsRequest.Builder, FavoriteSportsRequestOrBuilder> singleFieldBuilderV3 = this.favoriteSportsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(favoriteSportsRequest);
                } else if ((this.bitField0_ & 64) == 0 || (favoriteSportsRequest2 = this.favoriteSportsRequest_) == null || favoriteSportsRequest2 == FavoriteSportsRequest.getDefaultInstance()) {
                    this.favoriteSportsRequest_ = favoriteSportsRequest;
                } else {
                    getFavoriteSportsRequestBuilder().mergeFrom(favoriteSportsRequest);
                }
                if (this.favoriteSportsRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFavoriteSportsResponse(FavoriteSportsResponse favoriteSportsResponse) {
                FavoriteSportsResponse favoriteSportsResponse2;
                SingleFieldBuilderV3<FavoriteSportsResponse, FavoriteSportsResponse.Builder, FavoriteSportsResponseOrBuilder> singleFieldBuilderV3 = this.favoriteSportsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(favoriteSportsResponse);
                } else if ((this.bitField0_ & 128) == 0 || (favoriteSportsResponse2 = this.favoriteSportsResponse_) == null || favoriteSportsResponse2 == FavoriteSportsResponse.getDefaultInstance()) {
                    this.favoriteSportsResponse_ = favoriteSportsResponse;
                } else {
                    getFavoriteSportsResponseBuilder().mergeFrom(favoriteSportsResponse);
                }
                if (this.favoriteSportsResponse_ != null) {
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
                                    codedInputStream.readMessage(getAlertNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getLogPermissionRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getLogPermissionResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getEndSleepRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getEndSleepResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getFavoriteSportsNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getFavoriteSportsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getFavoriteSportsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getDistanceCalibrationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getDistanceCalibrationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getDistanceCalibrationNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getDistanceCalibrationNotificationV2FieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getDistanceCalibrationCancelNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLogPermissionRequest(LogPermissionRequest logPermissionRequest) {
                LogPermissionRequest logPermissionRequest2;
                SingleFieldBuilderV3<LogPermissionRequest, LogPermissionRequest.Builder, LogPermissionRequestOrBuilder> singleFieldBuilderV3 = this.logPermissionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(logPermissionRequest);
                } else if ((this.bitField0_ & 2) == 0 || (logPermissionRequest2 = this.logPermissionRequest_) == null || logPermissionRequest2 == LogPermissionRequest.getDefaultInstance()) {
                    this.logPermissionRequest_ = logPermissionRequest;
                } else {
                    getLogPermissionRequestBuilder().mergeFrom(logPermissionRequest);
                }
                if (this.logPermissionRequest_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLogPermissionResponse(LogPermissionResponse logPermissionResponse) {
                LogPermissionResponse logPermissionResponse2;
                SingleFieldBuilderV3<LogPermissionResponse, LogPermissionResponse.Builder, LogPermissionResponseOrBuilder> singleFieldBuilderV3 = this.logPermissionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(logPermissionResponse);
                } else if ((this.bitField0_ & 4) == 0 || (logPermissionResponse2 = this.logPermissionResponse_) == null || logPermissionResponse2 == LogPermissionResponse.getDefaultInstance()) {
                    this.logPermissionResponse_ = logPermissionResponse;
                } else {
                    getLogPermissionResponseBuilder().mergeFrom(logPermissionResponse);
                }
                if (this.logPermissionResponse_ != null) {
                    this.bitField0_ |= 4;
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
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDistanceCalibrationCancelNotification(DistanceCalibrationCancelNotification.Builder builder) {
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationCancelNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.distanceCalibrationCancelNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            @Deprecated
            public Builder setDistanceCalibrationNotification(DistanceCalibrationCancelNotification.Builder builder) {
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.distanceCalibrationNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setDistanceCalibrationNotificationV2(DistanceCalibrationNotification.Builder builder) {
                SingleFieldBuilderV3<DistanceCalibrationNotification, DistanceCalibrationNotification.Builder, DistanceCalibrationNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    this.distanceCalibrationNotificationV2_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            @Deprecated
            public Builder setDistanceCalibrationRequest(DistanceCalibrationRequest.Builder builder) {
                SingleFieldBuilderV3<DistanceCalibrationRequest, DistanceCalibrationRequest.Builder, DistanceCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.distanceCalibrationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Deprecated
            public Builder setDistanceCalibrationResponse(DistanceCalibrationResponse.Builder builder) {
                SingleFieldBuilderV3<DistanceCalibrationResponse, DistanceCalibrationResponse.Builder, DistanceCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.distanceCalibrationResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setEndSleepRequest(EndSleepRequest.Builder builder) {
                SingleFieldBuilderV3<EndSleepRequest, EndSleepRequest.Builder, EndSleepRequestOrBuilder> singleFieldBuilderV3 = this.endSleepRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.endSleepRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEndSleepResponse(EndSleepResponse.Builder builder) {
                SingleFieldBuilderV3<EndSleepResponse, EndSleepResponse.Builder, EndSleepResponseOrBuilder> singleFieldBuilderV3 = this.endSleepResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.endSleepResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setFavoriteSportsNotification(FavoriteSportsNotification.Builder builder) {
                SingleFieldBuilderV3<FavoriteSportsNotification, FavoriteSportsNotification.Builder, FavoriteSportsNotificationOrBuilder> singleFieldBuilderV3 = this.favoriteSportsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.favoriteSportsNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setFavoriteSportsRequest(FavoriteSportsRequest.Builder builder) {
                SingleFieldBuilderV3<FavoriteSportsRequest, FavoriteSportsRequest.Builder, FavoriteSportsRequestOrBuilder> singleFieldBuilderV3 = this.favoriteSportsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.favoriteSportsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setFavoriteSportsResponse(FavoriteSportsResponse.Builder builder) {
                SingleFieldBuilderV3<FavoriteSportsResponse, FavoriteSportsResponse.Builder, FavoriteSportsResponseOrBuilder> singleFieldBuilderV3 = this.favoriteSportsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.favoriteSportsResponse_ = builder.build();
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

            public Builder setLogPermissionRequest(LogPermissionRequest.Builder builder) {
                SingleFieldBuilderV3<LogPermissionRequest, LogPermissionRequest.Builder, LogPermissionRequestOrBuilder> singleFieldBuilderV3 = this.logPermissionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.logPermissionRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLogPermissionResponse(LogPermissionResponse.Builder builder) {
                SingleFieldBuilderV3<LogPermissionResponse, LogPermissionResponse.Builder, LogPermissionResponseOrBuilder> singleFieldBuilderV3 = this.logPermissionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.logPermissionResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
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

            public Builder setAlertNotification(AlertNotification alertNotification) {
                SingleFieldBuilderV3<AlertNotification, AlertNotification.Builder, AlertNotificationOrBuilder> singleFieldBuilderV3 = this.alertNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alertNotification.getClass();
                    this.alertNotification_ = alertNotification;
                } else {
                    singleFieldBuilderV3.setMessage(alertNotification);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDistanceCalibrationCancelNotification(DistanceCalibrationCancelNotification distanceCalibrationCancelNotification) {
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationCancelNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    distanceCalibrationCancelNotification.getClass();
                    this.distanceCalibrationCancelNotification_ = distanceCalibrationCancelNotification;
                } else {
                    singleFieldBuilderV3.setMessage(distanceCalibrationCancelNotification);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            @Deprecated
            public Builder setDistanceCalibrationNotification(DistanceCalibrationCancelNotification distanceCalibrationCancelNotification) {
                SingleFieldBuilderV3<DistanceCalibrationCancelNotification, DistanceCalibrationCancelNotification.Builder, DistanceCalibrationCancelNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    distanceCalibrationCancelNotification.getClass();
                    this.distanceCalibrationNotification_ = distanceCalibrationCancelNotification;
                } else {
                    singleFieldBuilderV3.setMessage(distanceCalibrationCancelNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setDistanceCalibrationNotificationV2(DistanceCalibrationNotification distanceCalibrationNotification) {
                SingleFieldBuilderV3<DistanceCalibrationNotification, DistanceCalibrationNotification.Builder, DistanceCalibrationNotificationOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationNotificationV2Builder_;
                if (singleFieldBuilderV3 == null) {
                    distanceCalibrationNotification.getClass();
                    this.distanceCalibrationNotificationV2_ = distanceCalibrationNotification;
                } else {
                    singleFieldBuilderV3.setMessage(distanceCalibrationNotification);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            @Deprecated
            public Builder setDistanceCalibrationRequest(DistanceCalibrationRequest distanceCalibrationRequest) {
                SingleFieldBuilderV3<DistanceCalibrationRequest, DistanceCalibrationRequest.Builder, DistanceCalibrationRequestOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    distanceCalibrationRequest.getClass();
                    this.distanceCalibrationRequest_ = distanceCalibrationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(distanceCalibrationRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Deprecated
            public Builder setDistanceCalibrationResponse(DistanceCalibrationResponse distanceCalibrationResponse) {
                SingleFieldBuilderV3<DistanceCalibrationResponse, DistanceCalibrationResponse.Builder, DistanceCalibrationResponseOrBuilder> singleFieldBuilderV3 = this.distanceCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    distanceCalibrationResponse.getClass();
                    this.distanceCalibrationResponse_ = distanceCalibrationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(distanceCalibrationResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setEndSleepRequest(EndSleepRequest endSleepRequest) {
                SingleFieldBuilderV3<EndSleepRequest, EndSleepRequest.Builder, EndSleepRequestOrBuilder> singleFieldBuilderV3 = this.endSleepRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    endSleepRequest.getClass();
                    this.endSleepRequest_ = endSleepRequest;
                } else {
                    singleFieldBuilderV3.setMessage(endSleepRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEndSleepResponse(EndSleepResponse endSleepResponse) {
                SingleFieldBuilderV3<EndSleepResponse, EndSleepResponse.Builder, EndSleepResponseOrBuilder> singleFieldBuilderV3 = this.endSleepResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    endSleepResponse.getClass();
                    this.endSleepResponse_ = endSleepResponse;
                } else {
                    singleFieldBuilderV3.setMessage(endSleepResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setFavoriteSportsNotification(FavoriteSportsNotification favoriteSportsNotification) {
                SingleFieldBuilderV3<FavoriteSportsNotification, FavoriteSportsNotification.Builder, FavoriteSportsNotificationOrBuilder> singleFieldBuilderV3 = this.favoriteSportsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    favoriteSportsNotification.getClass();
                    this.favoriteSportsNotification_ = favoriteSportsNotification;
                } else {
                    singleFieldBuilderV3.setMessage(favoriteSportsNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setFavoriteSportsRequest(FavoriteSportsRequest favoriteSportsRequest) {
                SingleFieldBuilderV3<FavoriteSportsRequest, FavoriteSportsRequest.Builder, FavoriteSportsRequestOrBuilder> singleFieldBuilderV3 = this.favoriteSportsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    favoriteSportsRequest.getClass();
                    this.favoriteSportsRequest_ = favoriteSportsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(favoriteSportsRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setFavoriteSportsResponse(FavoriteSportsResponse favoriteSportsResponse) {
                SingleFieldBuilderV3<FavoriteSportsResponse, FavoriteSportsResponse.Builder, FavoriteSportsResponseOrBuilder> singleFieldBuilderV3 = this.favoriteSportsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    favoriteSportsResponse.getClass();
                    this.favoriteSportsResponse_ = favoriteSportsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(favoriteSportsResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setLogPermissionRequest(LogPermissionRequest logPermissionRequest) {
                SingleFieldBuilderV3<LogPermissionRequest, LogPermissionRequest.Builder, LogPermissionRequestOrBuilder> singleFieldBuilderV3 = this.logPermissionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    logPermissionRequest.getClass();
                    this.logPermissionRequest_ = logPermissionRequest;
                } else {
                    singleFieldBuilderV3.setMessage(logPermissionRequest);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLogPermissionResponse(LogPermissionResponse logPermissionResponse) {
                SingleFieldBuilderV3<LogPermissionResponse, LogPermissionResponse.Builder, LogPermissionResponseOrBuilder> singleFieldBuilderV3 = this.logPermissionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    logPermissionResponse.getClass();
                    this.logPermissionResponse_ = logPermissionResponse;
                } else {
                    singleFieldBuilderV3.setMessage(logPermissionResponse);
                }
                this.bitField0_ |= 4;
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
                if (service.hasAlertNotification()) {
                    mergeAlertNotification(service.getAlertNotification());
                }
                if (service.hasLogPermissionRequest()) {
                    mergeLogPermissionRequest(service.getLogPermissionRequest());
                }
                if (service.hasLogPermissionResponse()) {
                    mergeLogPermissionResponse(service.getLogPermissionResponse());
                }
                if (service.hasEndSleepRequest()) {
                    mergeEndSleepRequest(service.getEndSleepRequest());
                }
                if (service.hasEndSleepResponse()) {
                    mergeEndSleepResponse(service.getEndSleepResponse());
                }
                if (service.hasFavoriteSportsNotification()) {
                    mergeFavoriteSportsNotification(service.getFavoriteSportsNotification());
                }
                if (service.hasFavoriteSportsRequest()) {
                    mergeFavoriteSportsRequest(service.getFavoriteSportsRequest());
                }
                if (service.hasFavoriteSportsResponse()) {
                    mergeFavoriteSportsResponse(service.getFavoriteSportsResponse());
                }
                if (service.hasDistanceCalibrationRequest()) {
                    mergeDistanceCalibrationRequest(service.getDistanceCalibrationRequest());
                }
                if (service.hasDistanceCalibrationResponse()) {
                    mergeDistanceCalibrationResponse(service.getDistanceCalibrationResponse());
                }
                if (service.hasDistanceCalibrationNotification()) {
                    mergeDistanceCalibrationNotification(service.getDistanceCalibrationNotification());
                }
                if (service.hasDistanceCalibrationNotificationV2()) {
                    mergeDistanceCalibrationNotificationV2(service.getDistanceCalibrationNotificationV2());
                }
                if (service.hasDistanceCalibrationCancelNotification()) {
                    mergeDistanceCalibrationCancelNotification(service.getDistanceCalibrationCancelNotification());
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

    public enum AlertType implements ProtocolMessageEnum {
        INVALID(0),
        STEP_GOAL(1),
        INTENSITY_MINUTES_GOAL(2),
        FLOORS_GOAL(3),
        PUSHES_GOAL(4),
        MOVE(5),
        STRESS(6),
        ABNORMAL_HIGH_HR(7),
        ABNORMAL_LOW_HR(8),
        JET_LAG(9),
        SOFTWARE_UPDATED(10),
        CHARGE_BATTERY(11),
        SLEEP_SCORE_READY(12),
        FITNESS_AGE_CHANGE(13),
        VO2_MAX_CHANGE(14),
        BROADCAST_HR(15),
        BEDTIME_APPROACHING(16);

        public static final int ABNORMAL_HIGH_HR_VALUE = 7;
        public static final int ABNORMAL_LOW_HR_VALUE = 8;
        public static final int BEDTIME_APPROACHING_VALUE = 16;
        public static final int BROADCAST_HR_VALUE = 15;
        public static final int CHARGE_BATTERY_VALUE = 11;
        public static final int FITNESS_AGE_CHANGE_VALUE = 13;
        public static final int FLOORS_GOAL_VALUE = 3;
        public static final int INTENSITY_MINUTES_GOAL_VALUE = 2;
        public static final int INVALID_VALUE = 0;
        public static final int JET_LAG_VALUE = 9;
        public static final int MOVE_VALUE = 5;
        public static final int PUSHES_GOAL_VALUE = 4;
        public static final int SLEEP_SCORE_READY_VALUE = 12;
        public static final int SOFTWARE_UPDATED_VALUE = 10;
        public static final int STEP_GOAL_VALUE = 1;
        public static final int STRESS_VALUE = 6;
        public static final int VO2_MAX_CHANGE_VALUE = 14;
        private final int value;
        private static final Internal.EnumLiteMap<AlertType> internalValueMap = new Internal.EnumLiteMap<AlertType>() { // from class: com.garmin.proto.generated.GDILimitedUi.AlertType.1
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
                    return INVALID;
                case 1:
                    return STEP_GOAL;
                case 2:
                    return INTENSITY_MINUTES_GOAL;
                case 3:
                    return FLOORS_GOAL;
                case 4:
                    return PUSHES_GOAL;
                case 5:
                    return MOVE;
                case 6:
                    return STRESS;
                case 7:
                    return ABNORMAL_HIGH_HR;
                case 8:
                    return ABNORMAL_LOW_HR;
                case 9:
                    return JET_LAG;
                case 10:
                    return SOFTWARE_UPDATED;
                case 11:
                    return CHARGE_BATTERY;
                case 12:
                    return SLEEP_SCORE_READY;
                case 13:
                    return FITNESS_AGE_CHANGE;
                case 14:
                    return VO2_MAX_CHANGE;
                case 15:
                    return BROADCAST_HR;
                case 16:
                    return BEDTIME_APPROACHING;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDILimitedUi.getDescriptor().getEnumTypes().get(0);
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
