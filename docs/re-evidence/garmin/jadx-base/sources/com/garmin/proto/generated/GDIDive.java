package com.garmin.proto.generated;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.f3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
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
import okhttp3.internal.http2.Http2Connection;
import vb.h;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDive {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rGDIDive.proto\u0012\u000eGDI.Proto.Dive\u001a\u0015GDIEventSharing.proto\"\u0019\n\u0017DiveActivityListRequest\"\u008c\u0001\n\fDiveActivity\u0012\u0012\n\nidentifier\u0018\u0001 \u0001(\r\u0012\r\n\u0005sport\u0018\u0002 \u0001(\r\u0012\u0011\n\tsub_sport\u0018\u0003 \u0001(\r\u0012\u0015\n\rdive_time_utc\u0018\u0004 \u0001(\r\u0012\u0019\n\u0011dive_time_seconds\u0018\u0005 \u0001(\r\u0012\u0014\n\fmax_depth_mm\u0018\u0006 \u0001(\r\"¸\u0001\n\u0018DiveActivityListResponse\u0012?\n\u0006status\u0018\u0001 \u0001(\u000e2/.GDI.Proto.Dive.DiveActivityListResponse.Status\u00120\n\nactivities\u0018\u0002 \u0003(\u000b2\u001c.GDI.Proto.Dive.DiveActivity\")\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\n\n\u0006FAILED\u0010\u0002\"<\n\u001cReleaseDivesForUploadRequest\u0012\u001c\n\u0014activity_identifiers\u0018\u0001 \u0003(\r\"\u0090\u0001\n\u001dReleaseDivesForUploadResponse\u0012D\n\u0006status\u0018\u0001 \u0001(\u000e24.GDI.Proto.Dive.ReleaseDivesForUploadResponse.Status\")\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\n\n\u0006FAILED\u0010\u0002\"Û\u0002\n\u000bDiveService\u0012K\n\u001adive_activity_list_request\u0018\u0001 \u0001(\u000b2'.GDI.Proto.Dive.DiveActivityListRequest\u0012M\n\u001bdive_activity_list_response\u0018\u0002 \u0001(\u000b2(.GDI.Proto.Dive.DiveActivityListResponse\u0012V\n release_dives_for_upload_request\u0018\u0003 \u0001(\u000b2,.GDI.Proto.Dive.ReleaseDivesForUploadRequest\u0012X\n!release_dives_for_upload_response\u0018\u0004 \u0001(\u000b2-.GDI.Proto.Dive.ReleaseDivesForUploadResponse\"Î\u0007\n\u0014DiveReadinessResults\u0012!\n\rtimestamp_utc\u0018\u0001 \u0001(\u0007:\n4294967295\u0012\u0012\n\u0005score\u0018\u0002 \u0001(\r:\u0003255\u0012\u001a\n\u000ffeedback_phrase\u0018\u0003 \u0001(\r:\u00010\u0012\u0019\n\u000eclassification\u0018\u0004 \u0001(\r:\u00010\u0012&\n\u001bclassification_factor_sleep\u0018\u0005 \u0001(\r:\u00010\u0012.\n#classification_factor_sleep_history\u0018\u0006 \u0001(\r:\u00010\u0012-\n\"classification_factor_body_battery\u0018\u0007 \u0001(\r:\u00010\u0012)\n\u001eclassification_factor_training\u0018\b \u0001(\r:\u00010\u0012.\n#classification_factor_recovery_time\u0018\t \u0001(\r:\u00010\u0012-\n\"classification_factor_dive_history\u0018\n \u0001(\r:\u00010\u0012'\n\u001cclassification_factor_jetlag\u0018\u000b \u0001(\r:\u00010\u0012\u001a\n\u000bdcs_warning\u0018\f \u0001(\b:\u0005false\u0012\u001b\n\rno_sleep_data\u0018\r \u0001(\b:\u0004true\u0012$\n\u0016no_recent_dive_history\u0018\u000e \u0001(\b:\u0004true\u0012%\n\u0016classification_blocked\u0018\u000f \u0001(\b:\u0005false\u0012#\n\u0014residual_tissue_load\u0018\u0010 \u0001(\b:\u0005false\u0012 \n\u0011recent_gauge_dive\u0018\u0011 \u0001(\b:\u0005false\u0012,\n!classification_factor_recent_dive\u0018\u0012 \u0001(\r:\u00010\u0012\u0018\n\u000bsleep_score\u0018e \u0001(\r:\u0003255\u0012\u0018\n\rsleep_quality\u0018f \u0001(\r:\u00010\u0012 \n\u0015sleep_history_quality\u0018g \u0001(\r:\u00010\u0012\u0019\n\fbody_battery\u0018h \u0001(\r:\u0003255\u0012\u001a\n\u000ftraining_status\u0018i \u0001(\r:\u00010\u0012\u001c\n\u0011recovery_time_min\u0018j \u0001(\r:\u00010\u0012\u001a\n\u000fjetlag_severity\u0018k \u0001(\r:\u00010\u0012\u000e\n\u0003cns\u0018l \u0001(\r:\u00010\u0012\u000f\n\u0004otus\u0018m \u0001(\r:\u00010\u0012+\n\u0017last_dive_timestamp_utc\u0018n \u0001(\r:\n4294967295\"æ\u0001\n DiveReadinessChangedNotification\u0012D\n\u0016dive_readiness_results\u0018\u0001 \u0001(\u000b2$.GDI.Proto.Dive.DiveReadinessResults2|\n\u0016dive_readiness_changed\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ò\u0007 \u0001(\u000b20.GDI.Proto.Dive.DiveReadinessChangedNotificationB'\n\u001acom.garmin.proto.generatedB\u0007GDIDiveH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dive_DiveActivityListRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dive_DiveActivityListRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dive_DiveActivityListResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dive_DiveActivityListResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dive_DiveActivity_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dive_DiveActivity_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dive_DiveReadinessChangedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dive_DiveReadinessChangedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dive_DiveReadinessResults_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dive_DiveReadinessResults_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dive_DiveService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dive_DiveService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dive_ReleaseDivesForUploadRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dive_ReleaseDivesForUploadRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dive_ReleaseDivesForUploadResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dive_ReleaseDivesForUploadResponse_fieldAccessorTable;

    public interface DiveActivityListRequestOrBuilder extends MessageOrBuilder {
    }

    public interface DiveActivityListResponseOrBuilder extends MessageOrBuilder {
        DiveActivity getActivities(int i14);

        int getActivitiesCount();

        List<DiveActivity> getActivitiesList();

        DiveActivityOrBuilder getActivitiesOrBuilder(int i14);

        List<? extends DiveActivityOrBuilder> getActivitiesOrBuilderList();

        DiveActivityListResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface DiveActivityOrBuilder extends MessageOrBuilder {
        int getDiveTimeSeconds();

        int getDiveTimeUtc();

        int getIdentifier();

        int getMaxDepthMm();

        int getSport();

        int getSubSport();

        boolean hasDiveTimeSeconds();

        boolean hasDiveTimeUtc();

        boolean hasIdentifier();

        boolean hasMaxDepthMm();

        boolean hasSport();

        boolean hasSubSport();
    }

    public interface DiveReadinessChangedNotificationOrBuilder extends MessageOrBuilder {
        DiveReadinessResults getDiveReadinessResults();

        DiveReadinessResultsOrBuilder getDiveReadinessResultsOrBuilder();

        boolean hasDiveReadinessResults();
    }

    public interface DiveReadinessResultsOrBuilder extends MessageOrBuilder {
        int getBodyBattery();

        int getClassification();

        boolean getClassificationBlocked();

        int getClassificationFactorBodyBattery();

        int getClassificationFactorDiveHistory();

        int getClassificationFactorJetlag();

        int getClassificationFactorRecentDive();

        int getClassificationFactorRecoveryTime();

        int getClassificationFactorSleep();

        int getClassificationFactorSleepHistory();

        int getClassificationFactorTraining();

        int getCns();

        boolean getDcsWarning();

        int getFeedbackPhrase();

        int getJetlagSeverity();

        int getLastDiveTimestampUtc();

        boolean getNoRecentDiveHistory();

        boolean getNoSleepData();

        int getOtus();

        boolean getRecentGaugeDive();

        int getRecoveryTimeMin();

        boolean getResidualTissueLoad();

        int getScore();

        int getSleepHistoryQuality();

        int getSleepQuality();

        int getSleepScore();

        int getTimestampUtc();

        int getTrainingStatus();

        boolean hasBodyBattery();

        boolean hasClassification();

        boolean hasClassificationBlocked();

        boolean hasClassificationFactorBodyBattery();

        boolean hasClassificationFactorDiveHistory();

        boolean hasClassificationFactorJetlag();

        boolean hasClassificationFactorRecentDive();

        boolean hasClassificationFactorRecoveryTime();

        boolean hasClassificationFactorSleep();

        boolean hasClassificationFactorSleepHistory();

        boolean hasClassificationFactorTraining();

        boolean hasCns();

        boolean hasDcsWarning();

        boolean hasFeedbackPhrase();

        boolean hasJetlagSeverity();

        boolean hasLastDiveTimestampUtc();

        boolean hasNoRecentDiveHistory();

        boolean hasNoSleepData();

        boolean hasOtus();

        boolean hasRecentGaugeDive();

        boolean hasRecoveryTimeMin();

        boolean hasResidualTissueLoad();

        boolean hasScore();

        boolean hasSleepHistoryQuality();

        boolean hasSleepQuality();

        boolean hasSleepScore();

        boolean hasTimestampUtc();

        boolean hasTrainingStatus();
    }

    public interface DiveServiceOrBuilder extends MessageOrBuilder {
        DiveActivityListRequest getDiveActivityListRequest();

        DiveActivityListRequestOrBuilder getDiveActivityListRequestOrBuilder();

        DiveActivityListResponse getDiveActivityListResponse();

        DiveActivityListResponseOrBuilder getDiveActivityListResponseOrBuilder();

        ReleaseDivesForUploadRequest getReleaseDivesForUploadRequest();

        ReleaseDivesForUploadRequestOrBuilder getReleaseDivesForUploadRequestOrBuilder();

        ReleaseDivesForUploadResponse getReleaseDivesForUploadResponse();

        ReleaseDivesForUploadResponseOrBuilder getReleaseDivesForUploadResponseOrBuilder();

        boolean hasDiveActivityListRequest();

        boolean hasDiveActivityListResponse();

        boolean hasReleaseDivesForUploadRequest();

        boolean hasReleaseDivesForUploadResponse();
    }

    public interface ReleaseDivesForUploadRequestOrBuilder extends MessageOrBuilder {
        int getActivityIdentifiers(int i14);

        int getActivityIdentifiersCount();

        List<Integer> getActivityIdentifiersList();
    }

    public interface ReleaseDivesForUploadResponseOrBuilder extends MessageOrBuilder {
        ReleaseDivesForUploadResponse.Status getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Dive_DiveActivityListRequest_descriptor = descriptor2;
        internal_static_GDI_Proto_Dive_DiveActivityListRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[0]);
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Dive_DiveActivity_descriptor = descriptor3;
        internal_static_GDI_Proto_Dive_DiveActivity_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Identifier", "Sport", "SubSport", "DiveTimeUtc", "DiveTimeSeconds", "MaxDepthMm"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Dive_DiveActivityListResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_Dive_DiveActivityListResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status", "Activities"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_Dive_ReleaseDivesForUploadRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_Dive_ReleaseDivesForUploadRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ActivityIdentifiers"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_Dive_ReleaseDivesForUploadResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_Dive_ReleaseDivesForUploadResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_Dive_DiveService_descriptor = descriptor7;
        internal_static_GDI_Proto_Dive_DiveService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"DiveActivityListRequest", "DiveActivityListResponse", "ReleaseDivesForUploadRequest", "ReleaseDivesForUploadResponse"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_Dive_DiveReadinessResults_descriptor = descriptor8;
        internal_static_GDI_Proto_Dive_DiveReadinessResults_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"TimestampUtc", "Score", "FeedbackPhrase", "Classification", "ClassificationFactorSleep", "ClassificationFactorSleepHistory", "ClassificationFactorBodyBattery", "ClassificationFactorTraining", "ClassificationFactorRecoveryTime", "ClassificationFactorDiveHistory", "ClassificationFactorJetlag", "DcsWarning", "NoSleepData", "NoRecentDiveHistory", "ClassificationBlocked", "ResidualTissueLoad", "RecentGaugeDive", "ClassificationFactorRecentDive", "SleepScore", "SleepQuality", "SleepHistoryQuality", "BodyBattery", "TrainingStatus", "RecoveryTimeMin", "JetlagSeverity", "Cns", "Otus", "LastDiveTimestampUtc"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_Dive_DiveReadinessChangedNotification_descriptor = descriptor9;
        internal_static_GDI_Proto_Dive_DiveReadinessChangedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"DiveReadinessResults"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDIDive() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(DiveReadinessChangedNotification.diveReadinessChanged);
    }

    public static final class DiveActivity extends GeneratedMessageV3 implements DiveActivityOrBuilder {
        public static final int DIVE_TIME_SECONDS_FIELD_NUMBER = 5;
        public static final int DIVE_TIME_UTC_FIELD_NUMBER = 4;
        public static final int IDENTIFIER_FIELD_NUMBER = 1;
        public static final int MAX_DEPTH_MM_FIELD_NUMBER = 6;
        public static final int SPORT_FIELD_NUMBER = 2;
        public static final int SUB_SPORT_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int diveTimeSeconds_;
        private int diveTimeUtc_;
        private int identifier_;
        private int maxDepthMm_;
        private byte memoizedIsInitialized;
        private int sport_;
        private int subSport_;
        private static final DiveActivity DEFAULT_INSTANCE = new DiveActivity();

        @Deprecated
        public static final Parser<DiveActivity> PARSER = new AbstractParser<DiveActivity>() { // from class: com.garmin.proto.generated.GDIDive.DiveActivity.1
            @Override // com.google.protobuf.Parser
            public DiveActivity parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DiveActivity.newBuilder();
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

        private DiveActivity(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.identifier_ = 0;
            this.sport_ = 0;
            this.subSport_ = 0;
            this.diveTimeUtc_ = 0;
            this.diveTimeSeconds_ = 0;
            this.maxDepthMm_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DiveActivity getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDive.internal_static_GDI_Proto_Dive_DiveActivity_descriptor;
        }

        public static Builder newBuilder(DiveActivity diveActivity) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(diveActivity);
        }

        public static DiveActivity parseDelimitedFrom(InputStream inputStream) {
            return (DiveActivity) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DiveActivity parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DiveActivity> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DiveActivity)) {
                return super.equals(obj);
            }
            DiveActivity diveActivity = (DiveActivity) obj;
            if (hasIdentifier() != diveActivity.hasIdentifier()) {
                return false;
            }
            if ((hasIdentifier() && getIdentifier() != diveActivity.getIdentifier()) || hasSport() != diveActivity.hasSport()) {
                return false;
            }
            if ((hasSport() && getSport() != diveActivity.getSport()) || hasSubSport() != diveActivity.hasSubSport()) {
                return false;
            }
            if ((hasSubSport() && getSubSport() != diveActivity.getSubSport()) || hasDiveTimeUtc() != diveActivity.hasDiveTimeUtc()) {
                return false;
            }
            if ((hasDiveTimeUtc() && getDiveTimeUtc() != diveActivity.getDiveTimeUtc()) || hasDiveTimeSeconds() != diveActivity.hasDiveTimeSeconds()) {
                return false;
            }
            if ((!hasDiveTimeSeconds() || getDiveTimeSeconds() == diveActivity.getDiveTimeSeconds()) && hasMaxDepthMm() == diveActivity.hasMaxDepthMm()) {
                return (!hasMaxDepthMm() || getMaxDepthMm() == diveActivity.getMaxDepthMm()) && getUnknownFields().equals(diveActivity.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public int getDiveTimeSeconds() {
            return this.diveTimeSeconds_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public int getDiveTimeUtc() {
            return this.diveTimeUtc_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public int getIdentifier() {
            return this.identifier_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public int getMaxDepthMm() {
            return this.maxDepthMm_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DiveActivity> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.identifier_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.sport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.subSport_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.diveTimeUtc_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.diveTimeSeconds_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.maxDepthMm_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public int getSport() {
            return this.sport_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public int getSubSport() {
            return this.subSport_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public boolean hasDiveTimeSeconds() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public boolean hasDiveTimeUtc() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public boolean hasIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public boolean hasMaxDepthMm() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public boolean hasSport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
        public boolean hasSubSport() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getIdentifier();
            }
            if (hasSport()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSport();
            }
            if (hasSubSport()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSubSport();
            }
            if (hasDiveTimeUtc()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getDiveTimeUtc();
            }
            if (hasDiveTimeSeconds()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getDiveTimeSeconds();
            }
            if (hasMaxDepthMm()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getMaxDepthMm();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDive.internal_static_GDI_Proto_Dive_DiveActivity_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveActivity.class, Builder.class);
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
            return new DiveActivity();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.identifier_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.sport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.subSport_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.diveTimeUtc_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.diveTimeSeconds_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.maxDepthMm_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DiveActivityOrBuilder {
            private int bitField0_;
            private int diveTimeSeconds_;
            private int diveTimeUtc_;
            private int identifier_;
            private int maxDepthMm_;
            private int sport_;
            private int subSport_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DiveActivity diveActivity) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    diveActivity.identifier_ = this.identifier_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    diveActivity.sport_ = this.sport_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    diveActivity.subSport_ = this.subSport_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    diveActivity.diveTimeUtc_ = this.diveTimeUtc_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    diveActivity.diveTimeSeconds_ = this.diveTimeSeconds_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    diveActivity.maxDepthMm_ = this.maxDepthMm_;
                    i14 |= 32;
                }
                diveActivity.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveActivity_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveActivity build() {
                DiveActivity diveActivityBuildPartial = buildPartial();
                if (diveActivityBuildPartial.isInitialized()) {
                    return diveActivityBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) diveActivityBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveActivity buildPartial() {
                DiveActivity diveActivity = new DiveActivity(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(diveActivity);
                }
                onBuilt();
                return diveActivity;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.identifier_ = 0;
                this.sport_ = 0;
                this.subSport_ = 0;
                this.diveTimeUtc_ = 0;
                this.diveTimeSeconds_ = 0;
                this.maxDepthMm_ = 0;
                return this;
            }

            public Builder clearDiveTimeSeconds() {
                this.bitField0_ &= -17;
                this.diveTimeSeconds_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDiveTimeUtc() {
                this.bitField0_ &= -9;
                this.diveTimeUtc_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIdentifier() {
                this.bitField0_ &= -2;
                this.identifier_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxDepthMm() {
                this.bitField0_ &= -33;
                this.maxDepthMm_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSport() {
                this.bitField0_ &= -3;
                this.sport_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSubSport() {
                this.bitField0_ &= -5;
                this.subSport_ = 0;
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
                return GDIDive.internal_static_GDI_Proto_Dive_DiveActivity_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public int getDiveTimeSeconds() {
                return this.diveTimeSeconds_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public int getDiveTimeUtc() {
                return this.diveTimeUtc_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public int getIdentifier() {
                return this.identifier_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public int getMaxDepthMm() {
                return this.maxDepthMm_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public int getSport() {
                return this.sport_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public int getSubSport() {
                return this.subSport_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public boolean hasDiveTimeSeconds() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public boolean hasDiveTimeUtc() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public boolean hasIdentifier() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public boolean hasMaxDepthMm() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public boolean hasSport() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityOrBuilder
            public boolean hasSubSport() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveActivity_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveActivity.class, Builder.class);
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
                                    this.identifier_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.sport_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.subSport_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.diveTimeUtc_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.diveTimeSeconds_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.maxDepthMm_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDiveTimeSeconds(int i14) {
                this.diveTimeSeconds_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDiveTimeUtc(int i14) {
                this.diveTimeUtc_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIdentifier(int i14) {
                this.identifier_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMaxDepthMm(int i14) {
                this.maxDepthMm_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSport(int i14) {
                this.sport_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSubSport(int i14) {
                this.subSport_ = i14;
                this.bitField0_ |= 4;
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
            public DiveActivity getDefaultInstanceForType() {
                return DiveActivity.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DiveActivity) {
                    return mergeFrom((DiveActivity) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DiveActivity diveActivity) {
                if (diveActivity == DiveActivity.getDefaultInstance()) {
                    return this;
                }
                if (diveActivity.hasIdentifier()) {
                    setIdentifier(diveActivity.getIdentifier());
                }
                if (diveActivity.hasSport()) {
                    setSport(diveActivity.getSport());
                }
                if (diveActivity.hasSubSport()) {
                    setSubSport(diveActivity.getSubSport());
                }
                if (diveActivity.hasDiveTimeUtc()) {
                    setDiveTimeUtc(diveActivity.getDiveTimeUtc());
                }
                if (diveActivity.hasDiveTimeSeconds()) {
                    setDiveTimeSeconds(diveActivity.getDiveTimeSeconds());
                }
                if (diveActivity.hasMaxDepthMm()) {
                    setMaxDepthMm(diveActivity.getMaxDepthMm());
                }
                mergeUnknownFields(diveActivity.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DiveActivity getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DiveActivity parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveActivity) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiveActivity parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DiveActivity parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DiveActivity parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DiveActivity parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DiveActivity parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DiveActivity parseFrom(InputStream inputStream) {
            return (DiveActivity) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DiveActivity parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveActivity) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiveActivity parseFrom(CodedInputStream codedInputStream) {
            return (DiveActivity) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ DiveActivity(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DiveActivity parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveActivity) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private DiveActivity() {
            this.identifier_ = 0;
            this.sport_ = 0;
            this.subSport_ = 0;
            this.diveTimeUtc_ = 0;
            this.diveTimeSeconds_ = 0;
            this.maxDepthMm_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class DiveActivityListRequest extends GeneratedMessageV3 implements DiveActivityListRequestOrBuilder {
        private static final DiveActivityListRequest DEFAULT_INSTANCE = new DiveActivityListRequest();

        @Deprecated
        public static final Parser<DiveActivityListRequest> PARSER = new AbstractParser<DiveActivityListRequest>() { // from class: com.garmin.proto.generated.GDIDive.DiveActivityListRequest.1
            @Override // com.google.protobuf.Parser
            public DiveActivityListRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DiveActivityListRequest.newBuilder();
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

        private DiveActivityListRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DiveActivityListRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDive.internal_static_GDI_Proto_Dive_DiveActivityListRequest_descriptor;
        }

        public static Builder newBuilder(DiveActivityListRequest diveActivityListRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(diveActivityListRequest);
        }

        public static DiveActivityListRequest parseDelimitedFrom(InputStream inputStream) {
            return (DiveActivityListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DiveActivityListRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DiveActivityListRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof DiveActivityListRequest) {
                return getUnknownFields().equals(((DiveActivityListRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DiveActivityListRequest> getParserForType() {
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
            return GDIDive.internal_static_GDI_Proto_Dive_DiveActivityListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveActivityListRequest.class, Builder.class);
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
            return new DiveActivityListRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DiveActivityListRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveActivityListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveActivityListRequest build() {
                DiveActivityListRequest diveActivityListRequestBuildPartial = buildPartial();
                if (diveActivityListRequestBuildPartial.isInitialized()) {
                    return diveActivityListRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) diveActivityListRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveActivityListRequest buildPartial() {
                DiveActivityListRequest diveActivityListRequest = new DiveActivityListRequest(this);
                onBuilt();
                return diveActivityListRequest;
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
                return GDIDive.internal_static_GDI_Proto_Dive_DiveActivityListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveActivityListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveActivityListRequest.class, Builder.class);
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
            public DiveActivityListRequest getDefaultInstanceForType() {
                return DiveActivityListRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DiveActivityListRequest) {
                    return mergeFrom((DiveActivityListRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DiveActivityListRequest diveActivityListRequest) {
                if (diveActivityListRequest == DiveActivityListRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(diveActivityListRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DiveActivityListRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DiveActivityListRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DiveActivityListRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DiveActivityListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveActivityListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiveActivityListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DiveActivityListRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DiveActivityListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DiveActivityListRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DiveActivityListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DiveActivityListRequest parseFrom(InputStream inputStream) {
            return (DiveActivityListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DiveActivityListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveActivityListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiveActivityListRequest parseFrom(CodedInputStream codedInputStream) {
            return (DiveActivityListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DiveActivityListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveActivityListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DiveActivityListResponse extends GeneratedMessageV3 implements DiveActivityListResponseOrBuilder {
        public static final int ACTIVITIES_FIELD_NUMBER = 2;
        private static final DiveActivityListResponse DEFAULT_INSTANCE = new DiveActivityListResponse();

        @Deprecated
        public static final Parser<DiveActivityListResponse> PARSER = new AbstractParser<DiveActivityListResponse>() { // from class: com.garmin.proto.generated.GDIDive.DiveActivityListResponse.1
            @Override // com.google.protobuf.Parser
            public DiveActivityListResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DiveActivityListResponse.newBuilder();
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
        private List<DiveActivity> activities_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;

        private DiveActivityListResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.activities_ = Collections.EMPTY_LIST;
        }

        public static DiveActivityListResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDive.internal_static_GDI_Proto_Dive_DiveActivityListResponse_descriptor;
        }

        public static Builder newBuilder(DiveActivityListResponse diveActivityListResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(diveActivityListResponse);
        }

        public static DiveActivityListResponse parseDelimitedFrom(InputStream inputStream) {
            return (DiveActivityListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DiveActivityListResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DiveActivityListResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DiveActivityListResponse)) {
                return super.equals(obj);
            }
            DiveActivityListResponse diveActivityListResponse = (DiveActivityListResponse) obj;
            if (hasStatus() != diveActivityListResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == diveActivityListResponse.status_) && getActivitiesList().equals(diveActivityListResponse.getActivitiesList()) && getUnknownFields().equals(diveActivityListResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
        public DiveActivity getActivities(int i14) {
            return this.activities_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
        public int getActivitiesCount() {
            return this.activities_.size();
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
        public List<DiveActivity> getActivitiesList() {
            return this.activities_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
        public DiveActivityOrBuilder getActivitiesOrBuilder(int i14) {
            return this.activities_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
        public List<? extends DiveActivityOrBuilder> getActivitiesOrBuilderList() {
            return this.activities_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DiveActivityListResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            for (int i15 = 0; i15 < this.activities_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.activities_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
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
            if (getActivitiesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getActivitiesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDive.internal_static_GDI_Proto_Dive_DiveActivityListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveActivityListResponse.class, Builder.class);
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
            return new DiveActivityListResponse();
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
            for (int i14 = 0; i14 < this.activities_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.activities_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DiveActivityListResponseOrBuilder {
            private RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> activitiesBuilder_;
            private List<DiveActivity> activities_;
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.activities_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(DiveActivityListResponse diveActivityListResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    diveActivityListResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                diveActivityListResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(DiveActivityListResponse diveActivityListResponse) {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    diveActivityListResponse.activities_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.activities_ = Collections.unmodifiableList(this.activities_);
                    this.bitField0_ &= -3;
                }
                diveActivityListResponse.activities_ = this.activities_;
            }

            private void ensureActivitiesIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.activities_ = new ArrayList(this.activities_);
                    this.bitField0_ |= 2;
                }
            }

            private RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> getActivitiesFieldBuilder() {
                if (this.activitiesBuilder_ == null) {
                    this.activitiesBuilder_ = new RepeatedFieldBuilderV3<>(this.activities_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.activities_ = null;
                }
                return this.activitiesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveActivityListResponse_descriptor;
            }

            public Builder addActivities(DiveActivity.Builder builder) {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureActivitiesIsMutable();
                this.activities_.add(builder.build());
                onChanged();
                return this;
            }

            public DiveActivity.Builder addActivitiesBuilder() {
                return (DiveActivity.Builder) getActivitiesFieldBuilder().addBuilder(DiveActivity.getDefaultInstance());
            }

            public Builder addAllActivities(Iterable<? extends DiveActivity> iterable) {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureActivitiesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.activities_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveActivityListResponse build() {
                DiveActivityListResponse diveActivityListResponseBuildPartial = buildPartial();
                if (diveActivityListResponseBuildPartial.isInitialized()) {
                    return diveActivityListResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) diveActivityListResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveActivityListResponse buildPartial() {
                DiveActivityListResponse diveActivityListResponse = new DiveActivityListResponse(this);
                buildPartialRepeatedFields(diveActivityListResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(diveActivityListResponse);
                }
                onBuilt();
                return diveActivityListResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.activities_ = Collections.EMPTY_LIST;
                } else {
                    this.activities_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearActivities() {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.activities_ = Collections.EMPTY_LIST;
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

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
            public DiveActivity getActivities(int i14) {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.activities_.get(i14) : (DiveActivity) repeatedFieldBuilderV3.getMessage(i14);
            }

            public DiveActivity.Builder getActivitiesBuilder(int i14) {
                return (DiveActivity.Builder) getActivitiesFieldBuilder().getBuilder(i14);
            }

            public List<DiveActivity.Builder> getActivitiesBuilderList() {
                return getActivitiesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
            public int getActivitiesCount() {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.activities_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
            public List<DiveActivity> getActivitiesList() {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.activities_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
            public DiveActivityOrBuilder getActivitiesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.activities_.get(i14) : (DiveActivityOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
            public List<? extends DiveActivityOrBuilder> getActivitiesOrBuilderList() {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.activities_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveActivityListResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveActivityListResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveActivityListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveActivityListResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(DiveActivityListResponse diveActivityListResponse) {
                if (diveActivityListResponse == DiveActivityListResponse.getDefaultInstance()) {
                    return this;
                }
                if (diveActivityListResponse.hasStatus()) {
                    setStatus(diveActivityListResponse.getStatus());
                }
                if (this.activitiesBuilder_ == null) {
                    if (!diveActivityListResponse.activities_.isEmpty()) {
                        if (this.activities_.isEmpty()) {
                            this.activities_ = diveActivityListResponse.activities_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureActivitiesIsMutable();
                            this.activities_.addAll(diveActivityListResponse.activities_);
                        }
                        onChanged();
                    }
                } else if (!diveActivityListResponse.activities_.isEmpty()) {
                    boolean zIsEmpty = this.activitiesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.activitiesBuilder_ = null;
                        this.activities_ = diveActivityListResponse.activities_;
                        this.bitField0_ &= -3;
                        this.activitiesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getActivitiesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(diveActivityListResponse.activities_);
                    }
                }
                mergeUnknownFields(diveActivityListResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeActivities(int i14) {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureActivitiesIsMutable();
                this.activities_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setActivities(int i14, DiveActivity.Builder builder) {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureActivitiesIsMutable();
                this.activities_.set(i14, builder.build());
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
            public DiveActivityListResponse getDefaultInstanceForType() {
                return DiveActivityListResponse.getDefaultInstance();
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
                this.activities_ = Collections.EMPTY_LIST;
            }

            public DiveActivity.Builder addActivitiesBuilder(int i14) {
                return (DiveActivity.Builder) getActivitiesFieldBuilder().addBuilder(i14, DiveActivity.getDefaultInstance());
            }

            public Builder addActivities(int i14, DiveActivity diveActivity) {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    diveActivity.getClass();
                    ensureActivitiesIsMutable();
                    this.activities_.add(i14, diveActivity);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, diveActivity);
                return this;
            }

            public Builder setActivities(int i14, DiveActivity diveActivity) {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    diveActivity.getClass();
                    ensureActivitiesIsMutable();
                    this.activities_.set(i14, diveActivity);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, diveActivity);
                return this;
            }

            public Builder addActivities(DiveActivity diveActivity) {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    diveActivity.getClass();
                    ensureActivitiesIsMutable();
                    this.activities_.add(diveActivity);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(diveActivity);
                return this;
            }

            public Builder addActivities(int i14, DiveActivity.Builder builder) {
                RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureActivitiesIsMutable();
                    this.activities_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DiveActivityListResponse) {
                    return mergeFrom((DiveActivityListResponse) message);
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
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    DiveActivity diveActivity = (DiveActivity) codedInputStream.readMessage(DiveActivity.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<DiveActivity, DiveActivity.Builder, DiveActivityOrBuilder> repeatedFieldBuilderV3 = this.activitiesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureActivitiesIsMutable();
                                        this.activities_.add(diveActivity);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(diveActivity);
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
        public DiveActivityListResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DiveActivityListResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveActivityListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiveActivityListResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DiveActivityListResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DiveActivityListResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DiveActivityListResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DiveActivityListResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private DiveActivityListResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DiveActivityListResponse parseFrom(InputStream inputStream) {
            return (DiveActivityListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DiveActivityListResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveActivityListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ DiveActivityListResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DiveActivityListResponse parseFrom(CodedInputStream codedInputStream) {
            return (DiveActivityListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DiveActivityListResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveActivityListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            FAILED(2);

            public static final int FAILED_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIDive.DiveActivityListResponse.Status.1
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
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return FAILED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DiveActivityListResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class DiveReadinessChangedNotification extends GeneratedMessageV3 implements DiveReadinessChangedNotificationOrBuilder {
        public static final int DIVE_READINESS_CHANGED_FIELD_NUMBER = 1010;
        public static final int DIVE_READINESS_RESULTS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DiveReadinessResults diveReadinessResults_;
        private byte memoizedIsInitialized;
        private static final DiveReadinessChangedNotification DEFAULT_INSTANCE = new DiveReadinessChangedNotification();

        @Deprecated
        public static final Parser<DiveReadinessChangedNotification> PARSER = new AbstractParser<DiveReadinessChangedNotification>() { // from class: com.garmin.proto.generated.GDIDive.DiveReadinessChangedNotification.1
            @Override // com.google.protobuf.Parser
            public DiveReadinessChangedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DiveReadinessChangedNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, DiveReadinessChangedNotification> diveReadinessChanged = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, DiveReadinessChangedNotification.class, getDefaultInstance());

        private DiveReadinessChangedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DiveReadinessChangedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDive.internal_static_GDI_Proto_Dive_DiveReadinessChangedNotification_descriptor;
        }

        public static Builder newBuilder(DiveReadinessChangedNotification diveReadinessChangedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(diveReadinessChangedNotification);
        }

        public static DiveReadinessChangedNotification parseDelimitedFrom(InputStream inputStream) {
            return (DiveReadinessChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DiveReadinessChangedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DiveReadinessChangedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DiveReadinessChangedNotification)) {
                return super.equals(obj);
            }
            DiveReadinessChangedNotification diveReadinessChangedNotification = (DiveReadinessChangedNotification) obj;
            if (hasDiveReadinessResults() != diveReadinessChangedNotification.hasDiveReadinessResults()) {
                return false;
            }
            return (!hasDiveReadinessResults() || getDiveReadinessResults().equals(diveReadinessChangedNotification.getDiveReadinessResults())) && getUnknownFields().equals(diveReadinessChangedNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessChangedNotificationOrBuilder
        public DiveReadinessResults getDiveReadinessResults() {
            DiveReadinessResults diveReadinessResults = this.diveReadinessResults_;
            return diveReadinessResults == null ? DiveReadinessResults.getDefaultInstance() : diveReadinessResults;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessChangedNotificationOrBuilder
        public DiveReadinessResultsOrBuilder getDiveReadinessResultsOrBuilder() {
            DiveReadinessResults diveReadinessResults = this.diveReadinessResults_;
            return diveReadinessResults == null ? DiveReadinessResults.getDefaultInstance() : diveReadinessResults;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DiveReadinessChangedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getDiveReadinessResults()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessChangedNotificationOrBuilder
        public boolean hasDiveReadinessResults() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDiveReadinessResults()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDiveReadinessResults().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDive.internal_static_GDI_Proto_Dive_DiveReadinessChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveReadinessChangedNotification.class, Builder.class);
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
            return new DiveReadinessChangedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getDiveReadinessResults());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DiveReadinessChangedNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DiveReadinessResults, DiveReadinessResults.Builder, DiveReadinessResultsOrBuilder> diveReadinessResultsBuilder_;
            private DiveReadinessResults diveReadinessResults_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DiveReadinessChangedNotification diveReadinessChangedNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<DiveReadinessResults, DiveReadinessResults.Builder, DiveReadinessResultsOrBuilder> singleFieldBuilderV3 = this.diveReadinessResultsBuilder_;
                    diveReadinessChangedNotification.diveReadinessResults_ = singleFieldBuilderV3 == null ? this.diveReadinessResults_ : (DiveReadinessResults) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                diveReadinessChangedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveReadinessChangedNotification_descriptor;
            }

            private SingleFieldBuilderV3<DiveReadinessResults, DiveReadinessResults.Builder, DiveReadinessResultsOrBuilder> getDiveReadinessResultsFieldBuilder() {
                if (this.diveReadinessResultsBuilder_ == null) {
                    this.diveReadinessResultsBuilder_ = new SingleFieldBuilderV3<>(getDiveReadinessResults(), getParentForChildren(), isClean());
                    this.diveReadinessResults_ = null;
                }
                return this.diveReadinessResultsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDiveReadinessResultsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveReadinessChangedNotification build() {
                DiveReadinessChangedNotification diveReadinessChangedNotificationBuildPartial = buildPartial();
                if (diveReadinessChangedNotificationBuildPartial.isInitialized()) {
                    return diveReadinessChangedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) diveReadinessChangedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveReadinessChangedNotification buildPartial() {
                DiveReadinessChangedNotification diveReadinessChangedNotification = new DiveReadinessChangedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(diveReadinessChangedNotification);
                }
                onBuilt();
                return diveReadinessChangedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.diveReadinessResults_ = null;
                SingleFieldBuilderV3<DiveReadinessResults, DiveReadinessResults.Builder, DiveReadinessResultsOrBuilder> singleFieldBuilderV3 = this.diveReadinessResultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.diveReadinessResultsBuilder_ = null;
                }
                return this;
            }

            public Builder clearDiveReadinessResults() {
                this.bitField0_ &= -2;
                this.diveReadinessResults_ = null;
                SingleFieldBuilderV3<DiveReadinessResults, DiveReadinessResults.Builder, DiveReadinessResultsOrBuilder> singleFieldBuilderV3 = this.diveReadinessResultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.diveReadinessResultsBuilder_ = null;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveReadinessChangedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessChangedNotificationOrBuilder
            public DiveReadinessResults getDiveReadinessResults() {
                SingleFieldBuilderV3<DiveReadinessResults, DiveReadinessResults.Builder, DiveReadinessResultsOrBuilder> singleFieldBuilderV3 = this.diveReadinessResultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DiveReadinessResults) singleFieldBuilderV3.getMessage();
                }
                DiveReadinessResults diveReadinessResults = this.diveReadinessResults_;
                return diveReadinessResults == null ? DiveReadinessResults.getDefaultInstance() : diveReadinessResults;
            }

            public DiveReadinessResults.Builder getDiveReadinessResultsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DiveReadinessResults.Builder) getDiveReadinessResultsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessChangedNotificationOrBuilder
            public DiveReadinessResultsOrBuilder getDiveReadinessResultsOrBuilder() {
                SingleFieldBuilderV3<DiveReadinessResults, DiveReadinessResults.Builder, DiveReadinessResultsOrBuilder> singleFieldBuilderV3 = this.diveReadinessResultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DiveReadinessResultsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DiveReadinessResults diveReadinessResults = this.diveReadinessResults_;
                return diveReadinessResults == null ? DiveReadinessResults.getDefaultInstance() : diveReadinessResults;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessChangedNotificationOrBuilder
            public boolean hasDiveReadinessResults() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveReadinessChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveReadinessChangedNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDiveReadinessResults(DiveReadinessResults diveReadinessResults) {
                DiveReadinessResults diveReadinessResults2;
                SingleFieldBuilderV3<DiveReadinessResults, DiveReadinessResults.Builder, DiveReadinessResultsOrBuilder> singleFieldBuilderV3 = this.diveReadinessResultsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(diveReadinessResults);
                } else if ((this.bitField0_ & 1) == 0 || (diveReadinessResults2 = this.diveReadinessResults_) == null || diveReadinessResults2 == DiveReadinessResults.getDefaultInstance()) {
                    this.diveReadinessResults_ = diveReadinessResults;
                } else {
                    getDiveReadinessResultsBuilder().mergeFrom(diveReadinessResults);
                }
                if (this.diveReadinessResults_ != null) {
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
                                    codedInputStream.readMessage(getDiveReadinessResultsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDiveReadinessResults(DiveReadinessResults.Builder builder) {
                SingleFieldBuilderV3<DiveReadinessResults, DiveReadinessResults.Builder, DiveReadinessResultsOrBuilder> singleFieldBuilderV3 = this.diveReadinessResultsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.diveReadinessResults_ = builder.build();
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
            public DiveReadinessChangedNotification getDefaultInstanceForType() {
                return DiveReadinessChangedNotification.getDefaultInstance();
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

            public Builder setDiveReadinessResults(DiveReadinessResults diveReadinessResults) {
                SingleFieldBuilderV3<DiveReadinessResults, DiveReadinessResults.Builder, DiveReadinessResultsOrBuilder> singleFieldBuilderV3 = this.diveReadinessResultsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    diveReadinessResults.getClass();
                    this.diveReadinessResults_ = diveReadinessResults;
                } else {
                    singleFieldBuilderV3.setMessage(diveReadinessResults);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DiveReadinessChangedNotification) {
                    return mergeFrom((DiveReadinessChangedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DiveReadinessChangedNotification diveReadinessChangedNotification) {
                if (diveReadinessChangedNotification == DiveReadinessChangedNotification.getDefaultInstance()) {
                    return this;
                }
                if (diveReadinessChangedNotification.hasDiveReadinessResults()) {
                    mergeDiveReadinessResults(diveReadinessChangedNotification.getDiveReadinessResults());
                }
                mergeUnknownFields(diveReadinessChangedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DiveReadinessChangedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DiveReadinessChangedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DiveReadinessChangedNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DiveReadinessChangedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveReadinessChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiveReadinessChangedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DiveReadinessChangedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DiveReadinessChangedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DiveReadinessChangedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DiveReadinessChangedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DiveReadinessChangedNotification parseFrom(InputStream inputStream) {
            return (DiveReadinessChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DiveReadinessChangedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveReadinessChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiveReadinessChangedNotification parseFrom(CodedInputStream codedInputStream) {
            return (DiveReadinessChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DiveReadinessChangedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveReadinessChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DiveReadinessResults extends GeneratedMessageV3 implements DiveReadinessResultsOrBuilder {
        public static final int BODY_BATTERY_FIELD_NUMBER = 104;
        public static final int CLASSIFICATION_BLOCKED_FIELD_NUMBER = 15;
        public static final int CLASSIFICATION_FACTOR_BODY_BATTERY_FIELD_NUMBER = 7;
        public static final int CLASSIFICATION_FACTOR_DIVE_HISTORY_FIELD_NUMBER = 10;
        public static final int CLASSIFICATION_FACTOR_JETLAG_FIELD_NUMBER = 11;
        public static final int CLASSIFICATION_FACTOR_RECENT_DIVE_FIELD_NUMBER = 18;
        public static final int CLASSIFICATION_FACTOR_RECOVERY_TIME_FIELD_NUMBER = 9;
        public static final int CLASSIFICATION_FACTOR_SLEEP_FIELD_NUMBER = 5;
        public static final int CLASSIFICATION_FACTOR_SLEEP_HISTORY_FIELD_NUMBER = 6;
        public static final int CLASSIFICATION_FACTOR_TRAINING_FIELD_NUMBER = 8;
        public static final int CLASSIFICATION_FIELD_NUMBER = 4;
        public static final int CNS_FIELD_NUMBER = 108;
        public static final int DCS_WARNING_FIELD_NUMBER = 12;
        public static final int FEEDBACK_PHRASE_FIELD_NUMBER = 3;
        public static final int JETLAG_SEVERITY_FIELD_NUMBER = 107;
        public static final int LAST_DIVE_TIMESTAMP_UTC_FIELD_NUMBER = 110;
        public static final int NO_RECENT_DIVE_HISTORY_FIELD_NUMBER = 14;
        public static final int NO_SLEEP_DATA_FIELD_NUMBER = 13;
        public static final int OTUS_FIELD_NUMBER = 109;
        public static final int RECENT_GAUGE_DIVE_FIELD_NUMBER = 17;
        public static final int RECOVERY_TIME_MIN_FIELD_NUMBER = 106;
        public static final int RESIDUAL_TISSUE_LOAD_FIELD_NUMBER = 16;
        public static final int SCORE_FIELD_NUMBER = 2;
        public static final int SLEEP_HISTORY_QUALITY_FIELD_NUMBER = 103;
        public static final int SLEEP_QUALITY_FIELD_NUMBER = 102;
        public static final int SLEEP_SCORE_FIELD_NUMBER = 101;
        public static final int TIMESTAMP_UTC_FIELD_NUMBER = 1;
        public static final int TRAINING_STATUS_FIELD_NUMBER = 105;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int bodyBattery_;
        private boolean classificationBlocked_;
        private int classificationFactorBodyBattery_;
        private int classificationFactorDiveHistory_;
        private int classificationFactorJetlag_;
        private int classificationFactorRecentDive_;
        private int classificationFactorRecoveryTime_;
        private int classificationFactorSleepHistory_;
        private int classificationFactorSleep_;
        private int classificationFactorTraining_;
        private int classification_;
        private int cns_;
        private boolean dcsWarning_;
        private int feedbackPhrase_;
        private int jetlagSeverity_;
        private int lastDiveTimestampUtc_;
        private byte memoizedIsInitialized;
        private boolean noRecentDiveHistory_;
        private boolean noSleepData_;
        private int otus_;
        private boolean recentGaugeDive_;
        private int recoveryTimeMin_;
        private boolean residualTissueLoad_;
        private int score_;
        private int sleepHistoryQuality_;
        private int sleepQuality_;
        private int sleepScore_;
        private int timestampUtc_;
        private int trainingStatus_;
        private static final DiveReadinessResults DEFAULT_INSTANCE = new DiveReadinessResults();

        @Deprecated
        public static final Parser<DiveReadinessResults> PARSER = new AbstractParser<DiveReadinessResults>() { // from class: com.garmin.proto.generated.GDIDive.DiveReadinessResults.1
            @Override // com.google.protobuf.Parser
            public DiveReadinessResults parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DiveReadinessResults.newBuilder();
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

        private DiveReadinessResults(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.timestampUtc_ = -1;
            this.score_ = 255;
            this.feedbackPhrase_ = 0;
            this.classification_ = 0;
            this.classificationFactorSleep_ = 0;
            this.classificationFactorSleepHistory_ = 0;
            this.classificationFactorBodyBattery_ = 0;
            this.classificationFactorTraining_ = 0;
            this.classificationFactorRecoveryTime_ = 0;
            this.classificationFactorDiveHistory_ = 0;
            this.classificationFactorJetlag_ = 0;
            this.dcsWarning_ = false;
            this.noSleepData_ = true;
            this.noRecentDiveHistory_ = true;
            this.classificationBlocked_ = false;
            this.residualTissueLoad_ = false;
            this.recentGaugeDive_ = false;
            this.classificationFactorRecentDive_ = 0;
            this.sleepScore_ = 255;
            this.sleepQuality_ = 0;
            this.sleepHistoryQuality_ = 0;
            this.bodyBattery_ = 255;
            this.trainingStatus_ = 0;
            this.recoveryTimeMin_ = 0;
            this.jetlagSeverity_ = 0;
            this.cns_ = 0;
            this.otus_ = 0;
            this.lastDiveTimestampUtc_ = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DiveReadinessResults getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDive.internal_static_GDI_Proto_Dive_DiveReadinessResults_descriptor;
        }

        public static Builder newBuilder(DiveReadinessResults diveReadinessResults) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(diveReadinessResults);
        }

        public static DiveReadinessResults parseDelimitedFrom(InputStream inputStream) {
            return (DiveReadinessResults) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DiveReadinessResults parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DiveReadinessResults> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DiveReadinessResults)) {
                return super.equals(obj);
            }
            DiveReadinessResults diveReadinessResults = (DiveReadinessResults) obj;
            if (hasTimestampUtc() != diveReadinessResults.hasTimestampUtc()) {
                return false;
            }
            if ((hasTimestampUtc() && getTimestampUtc() != diveReadinessResults.getTimestampUtc()) || hasScore() != diveReadinessResults.hasScore()) {
                return false;
            }
            if ((hasScore() && getScore() != diveReadinessResults.getScore()) || hasFeedbackPhrase() != diveReadinessResults.hasFeedbackPhrase()) {
                return false;
            }
            if ((hasFeedbackPhrase() && getFeedbackPhrase() != diveReadinessResults.getFeedbackPhrase()) || hasClassification() != diveReadinessResults.hasClassification()) {
                return false;
            }
            if ((hasClassification() && getClassification() != diveReadinessResults.getClassification()) || hasClassificationFactorSleep() != diveReadinessResults.hasClassificationFactorSleep()) {
                return false;
            }
            if ((hasClassificationFactorSleep() && getClassificationFactorSleep() != diveReadinessResults.getClassificationFactorSleep()) || hasClassificationFactorSleepHistory() != diveReadinessResults.hasClassificationFactorSleepHistory()) {
                return false;
            }
            if ((hasClassificationFactorSleepHistory() && getClassificationFactorSleepHistory() != diveReadinessResults.getClassificationFactorSleepHistory()) || hasClassificationFactorBodyBattery() != diveReadinessResults.hasClassificationFactorBodyBattery()) {
                return false;
            }
            if ((hasClassificationFactorBodyBattery() && getClassificationFactorBodyBattery() != diveReadinessResults.getClassificationFactorBodyBattery()) || hasClassificationFactorTraining() != diveReadinessResults.hasClassificationFactorTraining()) {
                return false;
            }
            if ((hasClassificationFactorTraining() && getClassificationFactorTraining() != diveReadinessResults.getClassificationFactorTraining()) || hasClassificationFactorRecoveryTime() != diveReadinessResults.hasClassificationFactorRecoveryTime()) {
                return false;
            }
            if ((hasClassificationFactorRecoveryTime() && getClassificationFactorRecoveryTime() != diveReadinessResults.getClassificationFactorRecoveryTime()) || hasClassificationFactorDiveHistory() != diveReadinessResults.hasClassificationFactorDiveHistory()) {
                return false;
            }
            if ((hasClassificationFactorDiveHistory() && getClassificationFactorDiveHistory() != diveReadinessResults.getClassificationFactorDiveHistory()) || hasClassificationFactorJetlag() != diveReadinessResults.hasClassificationFactorJetlag()) {
                return false;
            }
            if ((hasClassificationFactorJetlag() && getClassificationFactorJetlag() != diveReadinessResults.getClassificationFactorJetlag()) || hasDcsWarning() != diveReadinessResults.hasDcsWarning()) {
                return false;
            }
            if ((hasDcsWarning() && getDcsWarning() != diveReadinessResults.getDcsWarning()) || hasNoSleepData() != diveReadinessResults.hasNoSleepData()) {
                return false;
            }
            if ((hasNoSleepData() && getNoSleepData() != diveReadinessResults.getNoSleepData()) || hasNoRecentDiveHistory() != diveReadinessResults.hasNoRecentDiveHistory()) {
                return false;
            }
            if ((hasNoRecentDiveHistory() && getNoRecentDiveHistory() != diveReadinessResults.getNoRecentDiveHistory()) || hasClassificationBlocked() != diveReadinessResults.hasClassificationBlocked()) {
                return false;
            }
            if ((hasClassificationBlocked() && getClassificationBlocked() != diveReadinessResults.getClassificationBlocked()) || hasResidualTissueLoad() != diveReadinessResults.hasResidualTissueLoad()) {
                return false;
            }
            if ((hasResidualTissueLoad() && getResidualTissueLoad() != diveReadinessResults.getResidualTissueLoad()) || hasRecentGaugeDive() != diveReadinessResults.hasRecentGaugeDive()) {
                return false;
            }
            if ((hasRecentGaugeDive() && getRecentGaugeDive() != diveReadinessResults.getRecentGaugeDive()) || hasClassificationFactorRecentDive() != diveReadinessResults.hasClassificationFactorRecentDive()) {
                return false;
            }
            if ((hasClassificationFactorRecentDive() && getClassificationFactorRecentDive() != diveReadinessResults.getClassificationFactorRecentDive()) || hasSleepScore() != diveReadinessResults.hasSleepScore()) {
                return false;
            }
            if ((hasSleepScore() && getSleepScore() != diveReadinessResults.getSleepScore()) || hasSleepQuality() != diveReadinessResults.hasSleepQuality()) {
                return false;
            }
            if ((hasSleepQuality() && getSleepQuality() != diveReadinessResults.getSleepQuality()) || hasSleepHistoryQuality() != diveReadinessResults.hasSleepHistoryQuality()) {
                return false;
            }
            if ((hasSleepHistoryQuality() && getSleepHistoryQuality() != diveReadinessResults.getSleepHistoryQuality()) || hasBodyBattery() != diveReadinessResults.hasBodyBattery()) {
                return false;
            }
            if ((hasBodyBattery() && getBodyBattery() != diveReadinessResults.getBodyBattery()) || hasTrainingStatus() != diveReadinessResults.hasTrainingStatus()) {
                return false;
            }
            if ((hasTrainingStatus() && getTrainingStatus() != diveReadinessResults.getTrainingStatus()) || hasRecoveryTimeMin() != diveReadinessResults.hasRecoveryTimeMin()) {
                return false;
            }
            if ((hasRecoveryTimeMin() && getRecoveryTimeMin() != diveReadinessResults.getRecoveryTimeMin()) || hasJetlagSeverity() != diveReadinessResults.hasJetlagSeverity()) {
                return false;
            }
            if ((hasJetlagSeverity() && getJetlagSeverity() != diveReadinessResults.getJetlagSeverity()) || hasCns() != diveReadinessResults.hasCns()) {
                return false;
            }
            if ((hasCns() && getCns() != diveReadinessResults.getCns()) || hasOtus() != diveReadinessResults.hasOtus()) {
                return false;
            }
            if ((!hasOtus() || getOtus() == diveReadinessResults.getOtus()) && hasLastDiveTimestampUtc() == diveReadinessResults.hasLastDiveTimestampUtc()) {
                return (!hasLastDiveTimestampUtc() || getLastDiveTimestampUtc() == diveReadinessResults.getLastDiveTimestampUtc()) && getUnknownFields().equals(diveReadinessResults.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getBodyBattery() {
            return this.bodyBattery_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getClassification() {
            return this.classification_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean getClassificationBlocked() {
            return this.classificationBlocked_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getClassificationFactorBodyBattery() {
            return this.classificationFactorBodyBattery_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getClassificationFactorDiveHistory() {
            return this.classificationFactorDiveHistory_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getClassificationFactorJetlag() {
            return this.classificationFactorJetlag_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getClassificationFactorRecentDive() {
            return this.classificationFactorRecentDive_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getClassificationFactorRecoveryTime() {
            return this.classificationFactorRecoveryTime_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getClassificationFactorSleep() {
            return this.classificationFactorSleep_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getClassificationFactorSleepHistory() {
            return this.classificationFactorSleepHistory_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getClassificationFactorTraining() {
            return this.classificationFactorTraining_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getCns() {
            return this.cns_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean getDcsWarning() {
            return this.dcsWarning_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getFeedbackPhrase() {
            return this.feedbackPhrase_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getJetlagSeverity() {
            return this.jetlagSeverity_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getLastDiveTimestampUtc() {
            return this.lastDiveTimestampUtc_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean getNoRecentDiveHistory() {
            return this.noRecentDiveHistory_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean getNoSleepData() {
            return this.noSleepData_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getOtus() {
            return this.otus_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DiveReadinessResults> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean getRecentGaugeDive() {
            return this.recentGaugeDive_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getRecoveryTimeMin() {
            return this.recoveryTimeMin_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean getResidualTissueLoad() {
            return this.residualTissueLoad_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getScore() {
            return this.score_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFixed32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFixed32Size(1, this.timestampUtc_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(2, this.score_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(3, this.feedbackPhrase_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(4, this.classification_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(5, this.classificationFactorSleep_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(6, this.classificationFactorSleepHistory_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(7, this.classificationFactorBodyBattery_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(8, this.classificationFactorTraining_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(9, this.classificationFactorRecoveryTime_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(10, this.classificationFactorDiveHistory_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(11, this.classificationFactorJetlag_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeBoolSize(12, this.dcsWarning_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeBoolSize(13, this.noSleepData_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeBoolSize(14, this.noRecentDiveHistory_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeBoolSize(15, this.classificationBlocked_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeBoolSize(16, this.residualTissueLoad_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeBoolSize(17, this.recentGaugeDive_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(18, this.classificationFactorRecentDive_);
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(101, this.sleepScore_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(102, this.sleepQuality_);
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(103, this.sleepHistoryQuality_);
            }
            if ((this.bitField0_ & 2097152) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(104, this.bodyBattery_);
            }
            if ((this.bitField0_ & 4194304) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(105, this.trainingStatus_);
            }
            if ((this.bitField0_ & 8388608) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(106, this.recoveryTimeMin_);
            }
            if ((this.bitField0_ & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(107, this.jetlagSeverity_);
            }
            if ((this.bitField0_ & 33554432) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(108, this.cns_);
            }
            if ((this.bitField0_ & 67108864) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(109, this.otus_);
            }
            if ((this.bitField0_ & 134217728) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(110, this.lastDiveTimestampUtc_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFixed32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getSleepHistoryQuality() {
            return this.sleepHistoryQuality_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getSleepQuality() {
            return this.sleepQuality_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getSleepScore() {
            return this.sleepScore_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getTimestampUtc() {
            return this.timestampUtc_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public int getTrainingStatus() {
            return this.trainingStatus_;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasBodyBattery() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasClassification() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasClassificationBlocked() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasClassificationFactorBodyBattery() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasClassificationFactorDiveHistory() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasClassificationFactorJetlag() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasClassificationFactorRecentDive() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasClassificationFactorRecoveryTime() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasClassificationFactorSleep() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasClassificationFactorSleepHistory() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasClassificationFactorTraining() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasCns() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasDcsWarning() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasFeedbackPhrase() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasJetlagSeverity() {
            return (this.bitField0_ & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasLastDiveTimestampUtc() {
            return (this.bitField0_ & 134217728) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasNoRecentDiveHistory() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasNoSleepData() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasOtus() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasRecentGaugeDive() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasRecoveryTimeMin() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasResidualTissueLoad() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasScore() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasSleepHistoryQuality() {
            return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasSleepQuality() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasSleepScore() {
            return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasTimestampUtc() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
        public boolean hasTrainingStatus() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTimestampUtc()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTimestampUtc();
            }
            if (hasScore()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getScore();
            }
            if (hasFeedbackPhrase()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getFeedbackPhrase();
            }
            if (hasClassification()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getClassification();
            }
            if (hasClassificationFactorSleep()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getClassificationFactorSleep();
            }
            if (hasClassificationFactorSleepHistory()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getClassificationFactorSleepHistory();
            }
            if (hasClassificationFactorBodyBattery()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getClassificationFactorBodyBattery();
            }
            if (hasClassificationFactorTraining()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getClassificationFactorTraining();
            }
            if (hasClassificationFactorRecoveryTime()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getClassificationFactorRecoveryTime();
            }
            if (hasClassificationFactorDiveHistory()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getClassificationFactorDiveHistory();
            }
            if (hasClassificationFactorJetlag()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getClassificationFactorJetlag();
            }
            if (hasDcsWarning()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + Internal.hashBoolean(getDcsWarning());
            }
            if (hasNoSleepData()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + Internal.hashBoolean(getNoSleepData());
            }
            if (hasNoRecentDiveHistory()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + Internal.hashBoolean(getNoRecentDiveHistory());
            }
            if (hasClassificationBlocked()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + Internal.hashBoolean(getClassificationBlocked());
            }
            if (hasResidualTissueLoad()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + Internal.hashBoolean(getResidualTissueLoad());
            }
            if (hasRecentGaugeDive()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + Internal.hashBoolean(getRecentGaugeDive());
            }
            if (hasClassificationFactorRecentDive()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + getClassificationFactorRecentDive();
            }
            if (hasSleepScore()) {
                iHashCode = e5.c(iHashCode, 37, 101, 53) + getSleepScore();
            }
            if (hasSleepQuality()) {
                iHashCode = e5.c(iHashCode, 37, 102, 53) + getSleepQuality();
            }
            if (hasSleepHistoryQuality()) {
                iHashCode = e5.c(iHashCode, 37, 103, 53) + getSleepHistoryQuality();
            }
            if (hasBodyBattery()) {
                iHashCode = e5.c(iHashCode, 37, 104, 53) + getBodyBattery();
            }
            if (hasTrainingStatus()) {
                iHashCode = e5.c(iHashCode, 37, 105, 53) + getTrainingStatus();
            }
            if (hasRecoveryTimeMin()) {
                iHashCode = e5.c(iHashCode, 37, 106, 53) + getRecoveryTimeMin();
            }
            if (hasJetlagSeverity()) {
                iHashCode = e5.c(iHashCode, 37, 107, 53) + getJetlagSeverity();
            }
            if (hasCns()) {
                iHashCode = e5.c(iHashCode, 37, 108, 53) + getCns();
            }
            if (hasOtus()) {
                iHashCode = e5.c(iHashCode, 37, 109, 53) + getOtus();
            }
            if (hasLastDiveTimestampUtc()) {
                iHashCode = e5.c(iHashCode, 37, 110, 53) + getLastDiveTimestampUtc();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDive.internal_static_GDI_Proto_Dive_DiveReadinessResults_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveReadinessResults.class, Builder.class);
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
            return new DiveReadinessResults();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFixed32(1, this.timestampUtc_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.score_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.feedbackPhrase_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.classification_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.classificationFactorSleep_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.classificationFactorSleepHistory_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.classificationFactorBodyBattery_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.classificationFactorTraining_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt32(9, this.classificationFactorRecoveryTime_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(10, this.classificationFactorDiveHistory_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeUInt32(11, this.classificationFactorJetlag_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeBool(12, this.dcsWarning_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeBool(13, this.noSleepData_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeBool(14, this.noRecentDiveHistory_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeBool(15, this.classificationBlocked_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeBool(16, this.residualTissueLoad_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeBool(17, this.recentGaugeDive_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeUInt32(18, this.classificationFactorRecentDive_);
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                codedOutputStream.writeUInt32(101, this.sleepScore_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                codedOutputStream.writeUInt32(102, this.sleepQuality_);
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                codedOutputStream.writeUInt32(103, this.sleepHistoryQuality_);
            }
            if ((this.bitField0_ & 2097152) != 0) {
                codedOutputStream.writeUInt32(104, this.bodyBattery_);
            }
            if ((this.bitField0_ & 4194304) != 0) {
                codedOutputStream.writeUInt32(105, this.trainingStatus_);
            }
            if ((this.bitField0_ & 8388608) != 0) {
                codedOutputStream.writeUInt32(106, this.recoveryTimeMin_);
            }
            if ((this.bitField0_ & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
                codedOutputStream.writeUInt32(107, this.jetlagSeverity_);
            }
            if ((this.bitField0_ & 33554432) != 0) {
                codedOutputStream.writeUInt32(108, this.cns_);
            }
            if ((this.bitField0_ & 67108864) != 0) {
                codedOutputStream.writeUInt32(109, this.otus_);
            }
            if ((this.bitField0_ & 134217728) != 0) {
                codedOutputStream.writeUInt32(110, this.lastDiveTimestampUtc_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DiveReadinessResultsOrBuilder {
            private int bitField0_;
            private int bodyBattery_;
            private boolean classificationBlocked_;
            private int classificationFactorBodyBattery_;
            private int classificationFactorDiveHistory_;
            private int classificationFactorJetlag_;
            private int classificationFactorRecentDive_;
            private int classificationFactorRecoveryTime_;
            private int classificationFactorSleepHistory_;
            private int classificationFactorSleep_;
            private int classificationFactorTraining_;
            private int classification_;
            private int cns_;
            private boolean dcsWarning_;
            private int feedbackPhrase_;
            private int jetlagSeverity_;
            private int lastDiveTimestampUtc_;
            private boolean noRecentDiveHistory_;
            private boolean noSleepData_;
            private int otus_;
            private boolean recentGaugeDive_;
            private int recoveryTimeMin_;
            private boolean residualTissueLoad_;
            private int score_;
            private int sleepHistoryQuality_;
            private int sleepQuality_;
            private int sleepScore_;
            private int timestampUtc_;
            private int trainingStatus_;

            private Builder() {
                this.timestampUtc_ = -1;
                this.score_ = 255;
                this.noSleepData_ = true;
                this.noRecentDiveHistory_ = true;
                this.sleepScore_ = 255;
                this.bodyBattery_ = 255;
                this.lastDiveTimestampUtc_ = -1;
            }

            private void buildPartial0(DiveReadinessResults diveReadinessResults) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    diveReadinessResults.timestampUtc_ = this.timestampUtc_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    diveReadinessResults.score_ = this.score_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    diveReadinessResults.feedbackPhrase_ = this.feedbackPhrase_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    diveReadinessResults.classification_ = this.classification_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    diveReadinessResults.classificationFactorSleep_ = this.classificationFactorSleep_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    diveReadinessResults.classificationFactorSleepHistory_ = this.classificationFactorSleepHistory_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    diveReadinessResults.classificationFactorBodyBattery_ = this.classificationFactorBodyBattery_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    diveReadinessResults.classificationFactorTraining_ = this.classificationFactorTraining_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    diveReadinessResults.classificationFactorRecoveryTime_ = this.classificationFactorRecoveryTime_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    diveReadinessResults.classificationFactorDiveHistory_ = this.classificationFactorDiveHistory_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    diveReadinessResults.classificationFactorJetlag_ = this.classificationFactorJetlag_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    diveReadinessResults.dcsWarning_ = this.dcsWarning_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    diveReadinessResults.noSleepData_ = this.noSleepData_;
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    diveReadinessResults.noRecentDiveHistory_ = this.noRecentDiveHistory_;
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    diveReadinessResults.classificationBlocked_ = this.classificationBlocked_;
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    diveReadinessResults.residualTissueLoad_ = this.residualTissueLoad_;
                    i14 |= 32768;
                }
                if ((i15 & 65536) != 0) {
                    diveReadinessResults.recentGaugeDive_ = this.recentGaugeDive_;
                    i14 |= 65536;
                }
                if ((i15 & 131072) != 0) {
                    diveReadinessResults.classificationFactorRecentDive_ = this.classificationFactorRecentDive_;
                    i14 |= 131072;
                }
                if ((i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                    diveReadinessResults.sleepScore_ = this.sleepScore_;
                    i14 |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                }
                if ((i15 & 524288) != 0) {
                    diveReadinessResults.sleepQuality_ = this.sleepQuality_;
                    i14 |= 524288;
                }
                if ((i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                    diveReadinessResults.sleepHistoryQuality_ = this.sleepHistoryQuality_;
                    i14 |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
                if ((i15 & 2097152) != 0) {
                    diveReadinessResults.bodyBattery_ = this.bodyBattery_;
                    i14 |= 2097152;
                }
                if ((i15 & 4194304) != 0) {
                    diveReadinessResults.trainingStatus_ = this.trainingStatus_;
                    i14 |= 4194304;
                }
                if ((i15 & 8388608) != 0) {
                    diveReadinessResults.recoveryTimeMin_ = this.recoveryTimeMin_;
                    i14 |= 8388608;
                }
                if ((i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
                    diveReadinessResults.jetlagSeverity_ = this.jetlagSeverity_;
                    i14 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                }
                if ((i15 & 33554432) != 0) {
                    diveReadinessResults.cns_ = this.cns_;
                    i14 |= 33554432;
                }
                if ((i15 & 67108864) != 0) {
                    diveReadinessResults.otus_ = this.otus_;
                    i14 |= 67108864;
                }
                if ((i15 & 134217728) != 0) {
                    diveReadinessResults.lastDiveTimestampUtc_ = this.lastDiveTimestampUtc_;
                    i14 |= 134217728;
                }
                diveReadinessResults.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveReadinessResults_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveReadinessResults build() {
                DiveReadinessResults diveReadinessResultsBuildPartial = buildPartial();
                if (diveReadinessResultsBuildPartial.isInitialized()) {
                    return diveReadinessResultsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) diveReadinessResultsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveReadinessResults buildPartial() {
                DiveReadinessResults diveReadinessResults = new DiveReadinessResults(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(diveReadinessResults);
                }
                onBuilt();
                return diveReadinessResults;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.timestampUtc_ = -1;
                this.score_ = 255;
                this.feedbackPhrase_ = 0;
                this.classification_ = 0;
                this.classificationFactorSleep_ = 0;
                this.classificationFactorSleepHistory_ = 0;
                this.classificationFactorBodyBattery_ = 0;
                this.classificationFactorTraining_ = 0;
                this.classificationFactorRecoveryTime_ = 0;
                this.classificationFactorDiveHistory_ = 0;
                this.classificationFactorJetlag_ = 0;
                this.dcsWarning_ = false;
                this.noSleepData_ = true;
                this.noRecentDiveHistory_ = true;
                this.classificationBlocked_ = false;
                this.residualTissueLoad_ = false;
                this.recentGaugeDive_ = false;
                this.classificationFactorRecentDive_ = 0;
                this.sleepScore_ = 255;
                this.sleepQuality_ = 0;
                this.sleepHistoryQuality_ = 0;
                this.bodyBattery_ = 255;
                this.trainingStatus_ = 0;
                this.recoveryTimeMin_ = 0;
                this.jetlagSeverity_ = 0;
                this.cns_ = 0;
                this.otus_ = 0;
                this.lastDiveTimestampUtc_ = -1;
                return this;
            }

            public Builder clearBodyBattery() {
                this.bitField0_ &= -2097153;
                this.bodyBattery_ = 255;
                onChanged();
                return this;
            }

            public Builder clearClassification() {
                this.bitField0_ &= -9;
                this.classification_ = 0;
                onChanged();
                return this;
            }

            public Builder clearClassificationBlocked() {
                this.bitField0_ &= -16385;
                this.classificationBlocked_ = false;
                onChanged();
                return this;
            }

            public Builder clearClassificationFactorBodyBattery() {
                this.bitField0_ &= -65;
                this.classificationFactorBodyBattery_ = 0;
                onChanged();
                return this;
            }

            public Builder clearClassificationFactorDiveHistory() {
                this.bitField0_ &= -513;
                this.classificationFactorDiveHistory_ = 0;
                onChanged();
                return this;
            }

            public Builder clearClassificationFactorJetlag() {
                this.bitField0_ &= -1025;
                this.classificationFactorJetlag_ = 0;
                onChanged();
                return this;
            }

            public Builder clearClassificationFactorRecentDive() {
                this.bitField0_ &= -131073;
                this.classificationFactorRecentDive_ = 0;
                onChanged();
                return this;
            }

            public Builder clearClassificationFactorRecoveryTime() {
                this.bitField0_ &= -257;
                this.classificationFactorRecoveryTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearClassificationFactorSleep() {
                this.bitField0_ &= -17;
                this.classificationFactorSleep_ = 0;
                onChanged();
                return this;
            }

            public Builder clearClassificationFactorSleepHistory() {
                this.bitField0_ &= -33;
                this.classificationFactorSleepHistory_ = 0;
                onChanged();
                return this;
            }

            public Builder clearClassificationFactorTraining() {
                this.bitField0_ &= -129;
                this.classificationFactorTraining_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCns() {
                this.bitField0_ &= -33554433;
                this.cns_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDcsWarning() {
                this.bitField0_ &= -2049;
                this.dcsWarning_ = false;
                onChanged();
                return this;
            }

            public Builder clearFeedbackPhrase() {
                this.bitField0_ &= -5;
                this.feedbackPhrase_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearJetlagSeverity() {
                this.bitField0_ &= -16777217;
                this.jetlagSeverity_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLastDiveTimestampUtc() {
                this.bitField0_ &= -134217729;
                this.lastDiveTimestampUtc_ = -1;
                onChanged();
                return this;
            }

            public Builder clearNoRecentDiveHistory() {
                this.bitField0_ &= -8193;
                this.noRecentDiveHistory_ = true;
                onChanged();
                return this;
            }

            public Builder clearNoSleepData() {
                this.bitField0_ &= -4097;
                this.noSleepData_ = true;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearOtus() {
                this.bitField0_ &= -67108865;
                this.otus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRecentGaugeDive() {
                this.bitField0_ &= -65537;
                this.recentGaugeDive_ = false;
                onChanged();
                return this;
            }

            public Builder clearRecoveryTimeMin() {
                this.bitField0_ &= -8388609;
                this.recoveryTimeMin_ = 0;
                onChanged();
                return this;
            }

            public Builder clearResidualTissueLoad() {
                this.bitField0_ &= -32769;
                this.residualTissueLoad_ = false;
                onChanged();
                return this;
            }

            public Builder clearScore() {
                this.bitField0_ &= -3;
                this.score_ = 255;
                onChanged();
                return this;
            }

            public Builder clearSleepHistoryQuality() {
                this.bitField0_ &= -1048577;
                this.sleepHistoryQuality_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSleepQuality() {
                this.bitField0_ &= -524289;
                this.sleepQuality_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSleepScore() {
                this.bitField0_ &= -262145;
                this.sleepScore_ = 255;
                onChanged();
                return this;
            }

            public Builder clearTimestampUtc() {
                this.bitField0_ &= -2;
                this.timestampUtc_ = -1;
                onChanged();
                return this;
            }

            public Builder clearTrainingStatus() {
                this.bitField0_ &= -4194305;
                this.trainingStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getBodyBattery() {
                return this.bodyBattery_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getClassification() {
                return this.classification_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean getClassificationBlocked() {
                return this.classificationBlocked_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getClassificationFactorBodyBattery() {
                return this.classificationFactorBodyBattery_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getClassificationFactorDiveHistory() {
                return this.classificationFactorDiveHistory_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getClassificationFactorJetlag() {
                return this.classificationFactorJetlag_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getClassificationFactorRecentDive() {
                return this.classificationFactorRecentDive_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getClassificationFactorRecoveryTime() {
                return this.classificationFactorRecoveryTime_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getClassificationFactorSleep() {
                return this.classificationFactorSleep_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getClassificationFactorSleepHistory() {
                return this.classificationFactorSleepHistory_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getClassificationFactorTraining() {
                return this.classificationFactorTraining_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getCns() {
                return this.cns_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean getDcsWarning() {
                return this.dcsWarning_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveReadinessResults_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getFeedbackPhrase() {
                return this.feedbackPhrase_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getJetlagSeverity() {
                return this.jetlagSeverity_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getLastDiveTimestampUtc() {
                return this.lastDiveTimestampUtc_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean getNoRecentDiveHistory() {
                return this.noRecentDiveHistory_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean getNoSleepData() {
                return this.noSleepData_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getOtus() {
                return this.otus_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean getRecentGaugeDive() {
                return this.recentGaugeDive_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getRecoveryTimeMin() {
                return this.recoveryTimeMin_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean getResidualTissueLoad() {
                return this.residualTissueLoad_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getScore() {
                return this.score_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getSleepHistoryQuality() {
                return this.sleepHistoryQuality_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getSleepQuality() {
                return this.sleepQuality_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getSleepScore() {
                return this.sleepScore_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getTimestampUtc() {
                return this.timestampUtc_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public int getTrainingStatus() {
                return this.trainingStatus_;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasBodyBattery() {
                return (this.bitField0_ & 2097152) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasClassification() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasClassificationBlocked() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasClassificationFactorBodyBattery() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasClassificationFactorDiveHistory() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasClassificationFactorJetlag() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasClassificationFactorRecentDive() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasClassificationFactorRecoveryTime() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasClassificationFactorSleep() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasClassificationFactorSleepHistory() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasClassificationFactorTraining() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasCns() {
                return (this.bitField0_ & 33554432) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasDcsWarning() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasFeedbackPhrase() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasJetlagSeverity() {
                return (this.bitField0_ & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasLastDiveTimestampUtc() {
                return (this.bitField0_ & 134217728) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasNoRecentDiveHistory() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasNoSleepData() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasOtus() {
                return (this.bitField0_ & 67108864) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasRecentGaugeDive() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasRecoveryTimeMin() {
                return (this.bitField0_ & 8388608) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasResidualTissueLoad() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasScore() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasSleepHistoryQuality() {
                return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasSleepQuality() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasSleepScore() {
                return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasTimestampUtc() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveReadinessResultsOrBuilder
            public boolean hasTrainingStatus() {
                return (this.bitField0_ & 4194304) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveReadinessResults_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveReadinessResults.class, Builder.class);
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 13:
                                    this.timestampUtc_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.score_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.feedbackPhrase_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.classification_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.classificationFactorSleep_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.classificationFactorSleepHistory_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.classificationFactorBodyBattery_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.classificationFactorTraining_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    this.classificationFactorRecoveryTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.classificationFactorDiveHistory_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 88:
                                    this.classificationFactorJetlag_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 96:
                                    this.dcsWarning_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 104:
                                    this.noSleepData_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 112:
                                    this.noRecentDiveHistory_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 120:
                                    this.classificationBlocked_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 128:
                                    this.residualTissueLoad_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32768;
                                    continue;
                                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                    this.recentGaugeDive_ = codedInputStream.readBool();
                                    this.bitField0_ |= 65536;
                                    continue;
                                case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                    this.classificationFactorRecentDive_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 131072;
                                    continue;
                                case 808:
                                    this.sleepScore_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                                    continue;
                                case 816:
                                    this.sleepQuality_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 524288;
                                    continue;
                                case 824:
                                    this.sleepHistoryQuality_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                    continue;
                                case 832:
                                    this.bodyBattery_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2097152;
                                    continue;
                                case 840:
                                    this.trainingStatus_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4194304;
                                    continue;
                                case 848:
                                    this.recoveryTimeMin_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8388608;
                                    continue;
                                case 856:
                                    this.jetlagSeverity_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                                    continue;
                                case 864:
                                    this.cns_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 33554432;
                                    continue;
                                case 872:
                                    this.otus_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 67108864;
                                    continue;
                                case 880:
                                    this.lastDiveTimestampUtc_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 134217728;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBodyBattery(int i14) {
                this.bodyBattery_ = i14;
                this.bitField0_ |= 2097152;
                onChanged();
                return this;
            }

            public Builder setClassification(int i14) {
                this.classification_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setClassificationBlocked(boolean z14) {
                this.classificationBlocked_ = z14;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setClassificationFactorBodyBattery(int i14) {
                this.classificationFactorBodyBattery_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setClassificationFactorDiveHistory(int i14) {
                this.classificationFactorDiveHistory_ = i14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setClassificationFactorJetlag(int i14) {
                this.classificationFactorJetlag_ = i14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setClassificationFactorRecentDive(int i14) {
                this.classificationFactorRecentDive_ = i14;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setClassificationFactorRecoveryTime(int i14) {
                this.classificationFactorRecoveryTime_ = i14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setClassificationFactorSleep(int i14) {
                this.classificationFactorSleep_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setClassificationFactorSleepHistory(int i14) {
                this.classificationFactorSleepHistory_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setClassificationFactorTraining(int i14) {
                this.classificationFactorTraining_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setCns(int i14) {
                this.cns_ = i14;
                this.bitField0_ |= 33554432;
                onChanged();
                return this;
            }

            public Builder setDcsWarning(boolean z14) {
                this.dcsWarning_ = z14;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setFeedbackPhrase(int i14) {
                this.feedbackPhrase_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setJetlagSeverity(int i14) {
                this.jetlagSeverity_ = i14;
                this.bitField0_ |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                onChanged();
                return this;
            }

            public Builder setLastDiveTimestampUtc(int i14) {
                this.lastDiveTimestampUtc_ = i14;
                this.bitField0_ |= 134217728;
                onChanged();
                return this;
            }

            public Builder setNoRecentDiveHistory(boolean z14) {
                this.noRecentDiveHistory_ = z14;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setNoSleepData(boolean z14) {
                this.noSleepData_ = z14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setOtus(int i14) {
                this.otus_ = i14;
                this.bitField0_ |= 67108864;
                onChanged();
                return this;
            }

            public Builder setRecentGaugeDive(boolean z14) {
                this.recentGaugeDive_ = z14;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setRecoveryTimeMin(int i14) {
                this.recoveryTimeMin_ = i14;
                this.bitField0_ |= 8388608;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResidualTissueLoad(boolean z14) {
                this.residualTissueLoad_ = z14;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setScore(int i14) {
                this.score_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSleepHistoryQuality(int i14) {
                this.sleepHistoryQuality_ = i14;
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return this;
            }

            public Builder setSleepQuality(int i14) {
                this.sleepQuality_ = i14;
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setSleepScore(int i14) {
                this.sleepScore_ = i14;
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return this;
            }

            public Builder setTimestampUtc(int i14) {
                this.timestampUtc_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrainingStatus(int i14) {
                this.trainingStatus_ = i14;
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DiveReadinessResults getDefaultInstanceForType() {
                return DiveReadinessResults.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.timestampUtc_ = -1;
                this.score_ = 255;
                this.noSleepData_ = true;
                this.noRecentDiveHistory_ = true;
                this.sleepScore_ = 255;
                this.bodyBattery_ = 255;
                this.lastDiveTimestampUtc_ = -1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DiveReadinessResults) {
                    return mergeFrom((DiveReadinessResults) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DiveReadinessResults diveReadinessResults) {
                if (diveReadinessResults == DiveReadinessResults.getDefaultInstance()) {
                    return this;
                }
                if (diveReadinessResults.hasTimestampUtc()) {
                    setTimestampUtc(diveReadinessResults.getTimestampUtc());
                }
                if (diveReadinessResults.hasScore()) {
                    setScore(diveReadinessResults.getScore());
                }
                if (diveReadinessResults.hasFeedbackPhrase()) {
                    setFeedbackPhrase(diveReadinessResults.getFeedbackPhrase());
                }
                if (diveReadinessResults.hasClassification()) {
                    setClassification(diveReadinessResults.getClassification());
                }
                if (diveReadinessResults.hasClassificationFactorSleep()) {
                    setClassificationFactorSleep(diveReadinessResults.getClassificationFactorSleep());
                }
                if (diveReadinessResults.hasClassificationFactorSleepHistory()) {
                    setClassificationFactorSleepHistory(diveReadinessResults.getClassificationFactorSleepHistory());
                }
                if (diveReadinessResults.hasClassificationFactorBodyBattery()) {
                    setClassificationFactorBodyBattery(diveReadinessResults.getClassificationFactorBodyBattery());
                }
                if (diveReadinessResults.hasClassificationFactorTraining()) {
                    setClassificationFactorTraining(diveReadinessResults.getClassificationFactorTraining());
                }
                if (diveReadinessResults.hasClassificationFactorRecoveryTime()) {
                    setClassificationFactorRecoveryTime(diveReadinessResults.getClassificationFactorRecoveryTime());
                }
                if (diveReadinessResults.hasClassificationFactorDiveHistory()) {
                    setClassificationFactorDiveHistory(diveReadinessResults.getClassificationFactorDiveHistory());
                }
                if (diveReadinessResults.hasClassificationFactorJetlag()) {
                    setClassificationFactorJetlag(diveReadinessResults.getClassificationFactorJetlag());
                }
                if (diveReadinessResults.hasDcsWarning()) {
                    setDcsWarning(diveReadinessResults.getDcsWarning());
                }
                if (diveReadinessResults.hasNoSleepData()) {
                    setNoSleepData(diveReadinessResults.getNoSleepData());
                }
                if (diveReadinessResults.hasNoRecentDiveHistory()) {
                    setNoRecentDiveHistory(diveReadinessResults.getNoRecentDiveHistory());
                }
                if (diveReadinessResults.hasClassificationBlocked()) {
                    setClassificationBlocked(diveReadinessResults.getClassificationBlocked());
                }
                if (diveReadinessResults.hasResidualTissueLoad()) {
                    setResidualTissueLoad(diveReadinessResults.getResidualTissueLoad());
                }
                if (diveReadinessResults.hasRecentGaugeDive()) {
                    setRecentGaugeDive(diveReadinessResults.getRecentGaugeDive());
                }
                if (diveReadinessResults.hasClassificationFactorRecentDive()) {
                    setClassificationFactorRecentDive(diveReadinessResults.getClassificationFactorRecentDive());
                }
                if (diveReadinessResults.hasSleepScore()) {
                    setSleepScore(diveReadinessResults.getSleepScore());
                }
                if (diveReadinessResults.hasSleepQuality()) {
                    setSleepQuality(diveReadinessResults.getSleepQuality());
                }
                if (diveReadinessResults.hasSleepHistoryQuality()) {
                    setSleepHistoryQuality(diveReadinessResults.getSleepHistoryQuality());
                }
                if (diveReadinessResults.hasBodyBattery()) {
                    setBodyBattery(diveReadinessResults.getBodyBattery());
                }
                if (diveReadinessResults.hasTrainingStatus()) {
                    setTrainingStatus(diveReadinessResults.getTrainingStatus());
                }
                if (diveReadinessResults.hasRecoveryTimeMin()) {
                    setRecoveryTimeMin(diveReadinessResults.getRecoveryTimeMin());
                }
                if (diveReadinessResults.hasJetlagSeverity()) {
                    setJetlagSeverity(diveReadinessResults.getJetlagSeverity());
                }
                if (diveReadinessResults.hasCns()) {
                    setCns(diveReadinessResults.getCns());
                }
                if (diveReadinessResults.hasOtus()) {
                    setOtus(diveReadinessResults.getOtus());
                }
                if (diveReadinessResults.hasLastDiveTimestampUtc()) {
                    setLastDiveTimestampUtc(diveReadinessResults.getLastDiveTimestampUtc());
                }
                mergeUnknownFields(diveReadinessResults.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DiveReadinessResults getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DiveReadinessResults parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveReadinessResults) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiveReadinessResults parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DiveReadinessResults parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DiveReadinessResults parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DiveReadinessResults parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DiveReadinessResults parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DiveReadinessResults parseFrom(InputStream inputStream) {
            return (DiveReadinessResults) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DiveReadinessResults parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveReadinessResults) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiveReadinessResults parseFrom(CodedInputStream codedInputStream) {
            return (DiveReadinessResults) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DiveReadinessResults parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveReadinessResults) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ DiveReadinessResults(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DiveReadinessResults() {
            this.feedbackPhrase_ = 0;
            this.classification_ = 0;
            this.classificationFactorSleep_ = 0;
            this.classificationFactorSleepHistory_ = 0;
            this.classificationFactorBodyBattery_ = 0;
            this.classificationFactorTraining_ = 0;
            this.classificationFactorRecoveryTime_ = 0;
            this.classificationFactorDiveHistory_ = 0;
            this.classificationFactorJetlag_ = 0;
            this.dcsWarning_ = false;
            this.classificationBlocked_ = false;
            this.residualTissueLoad_ = false;
            this.recentGaugeDive_ = false;
            this.classificationFactorRecentDive_ = 0;
            this.sleepQuality_ = 0;
            this.sleepHistoryQuality_ = 0;
            this.trainingStatus_ = 0;
            this.recoveryTimeMin_ = 0;
            this.jetlagSeverity_ = 0;
            this.cns_ = 0;
            this.otus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.timestampUtc_ = -1;
            this.score_ = 255;
            this.noSleepData_ = true;
            this.noRecentDiveHistory_ = true;
            this.sleepScore_ = 255;
            this.bodyBattery_ = 255;
            this.lastDiveTimestampUtc_ = -1;
        }
    }

    public static final class DiveService extends GeneratedMessageV3 implements DiveServiceOrBuilder {
        public static final int DIVE_ACTIVITY_LIST_REQUEST_FIELD_NUMBER = 1;
        public static final int DIVE_ACTIVITY_LIST_RESPONSE_FIELD_NUMBER = 2;
        public static final int RELEASE_DIVES_FOR_UPLOAD_REQUEST_FIELD_NUMBER = 3;
        public static final int RELEASE_DIVES_FOR_UPLOAD_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DiveActivityListRequest diveActivityListRequest_;
        private DiveActivityListResponse diveActivityListResponse_;
        private byte memoizedIsInitialized;
        private ReleaseDivesForUploadRequest releaseDivesForUploadRequest_;
        private ReleaseDivesForUploadResponse releaseDivesForUploadResponse_;
        private static final DiveService DEFAULT_INSTANCE = new DiveService();

        @Deprecated
        public static final Parser<DiveService> PARSER = new AbstractParser<DiveService>() { // from class: com.garmin.proto.generated.GDIDive.DiveService.1
            @Override // com.google.protobuf.Parser
            public DiveService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DiveService.newBuilder();
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

        private DiveService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DiveService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDive.internal_static_GDI_Proto_Dive_DiveService_descriptor;
        }

        public static Builder newBuilder(DiveService diveService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(diveService);
        }

        public static DiveService parseDelimitedFrom(InputStream inputStream) {
            return (DiveService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DiveService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DiveService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DiveService)) {
                return super.equals(obj);
            }
            DiveService diveService = (DiveService) obj;
            if (hasDiveActivityListRequest() != diveService.hasDiveActivityListRequest()) {
                return false;
            }
            if ((hasDiveActivityListRequest() && !getDiveActivityListRequest().equals(diveService.getDiveActivityListRequest())) || hasDiveActivityListResponse() != diveService.hasDiveActivityListResponse()) {
                return false;
            }
            if ((hasDiveActivityListResponse() && !getDiveActivityListResponse().equals(diveService.getDiveActivityListResponse())) || hasReleaseDivesForUploadRequest() != diveService.hasReleaseDivesForUploadRequest()) {
                return false;
            }
            if ((!hasReleaseDivesForUploadRequest() || getReleaseDivesForUploadRequest().equals(diveService.getReleaseDivesForUploadRequest())) && hasReleaseDivesForUploadResponse() == diveService.hasReleaseDivesForUploadResponse()) {
                return (!hasReleaseDivesForUploadResponse() || getReleaseDivesForUploadResponse().equals(diveService.getReleaseDivesForUploadResponse())) && getUnknownFields().equals(diveService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public DiveActivityListRequest getDiveActivityListRequest() {
            DiveActivityListRequest diveActivityListRequest = this.diveActivityListRequest_;
            return diveActivityListRequest == null ? DiveActivityListRequest.getDefaultInstance() : diveActivityListRequest;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public DiveActivityListRequestOrBuilder getDiveActivityListRequestOrBuilder() {
            DiveActivityListRequest diveActivityListRequest = this.diveActivityListRequest_;
            return diveActivityListRequest == null ? DiveActivityListRequest.getDefaultInstance() : diveActivityListRequest;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public DiveActivityListResponse getDiveActivityListResponse() {
            DiveActivityListResponse diveActivityListResponse = this.diveActivityListResponse_;
            return diveActivityListResponse == null ? DiveActivityListResponse.getDefaultInstance() : diveActivityListResponse;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public DiveActivityListResponseOrBuilder getDiveActivityListResponseOrBuilder() {
            DiveActivityListResponse diveActivityListResponse = this.diveActivityListResponse_;
            return diveActivityListResponse == null ? DiveActivityListResponse.getDefaultInstance() : diveActivityListResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DiveService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public ReleaseDivesForUploadRequest getReleaseDivesForUploadRequest() {
            ReleaseDivesForUploadRequest releaseDivesForUploadRequest = this.releaseDivesForUploadRequest_;
            return releaseDivesForUploadRequest == null ? ReleaseDivesForUploadRequest.getDefaultInstance() : releaseDivesForUploadRequest;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public ReleaseDivesForUploadRequestOrBuilder getReleaseDivesForUploadRequestOrBuilder() {
            ReleaseDivesForUploadRequest releaseDivesForUploadRequest = this.releaseDivesForUploadRequest_;
            return releaseDivesForUploadRequest == null ? ReleaseDivesForUploadRequest.getDefaultInstance() : releaseDivesForUploadRequest;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public ReleaseDivesForUploadResponse getReleaseDivesForUploadResponse() {
            ReleaseDivesForUploadResponse releaseDivesForUploadResponse = this.releaseDivesForUploadResponse_;
            return releaseDivesForUploadResponse == null ? ReleaseDivesForUploadResponse.getDefaultInstance() : releaseDivesForUploadResponse;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public ReleaseDivesForUploadResponseOrBuilder getReleaseDivesForUploadResponseOrBuilder() {
            ReleaseDivesForUploadResponse releaseDivesForUploadResponse = this.releaseDivesForUploadResponse_;
            return releaseDivesForUploadResponse == null ? ReleaseDivesForUploadResponse.getDefaultInstance() : releaseDivesForUploadResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getDiveActivityListRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getDiveActivityListResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getReleaseDivesForUploadRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getReleaseDivesForUploadResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public boolean hasDiveActivityListRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public boolean hasDiveActivityListResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public boolean hasReleaseDivesForUploadRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
        public boolean hasReleaseDivesForUploadResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDiveActivityListRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDiveActivityListRequest().hashCode();
            }
            if (hasDiveActivityListResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDiveActivityListResponse().hashCode();
            }
            if (hasReleaseDivesForUploadRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getReleaseDivesForUploadRequest().hashCode();
            }
            if (hasReleaseDivesForUploadResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getReleaseDivesForUploadResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDive.internal_static_GDI_Proto_Dive_DiveService_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveService.class, Builder.class);
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
            return new DiveService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getDiveActivityListRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDiveActivityListResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getReleaseDivesForUploadRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getReleaseDivesForUploadResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DiveServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DiveActivityListRequest, DiveActivityListRequest.Builder, DiveActivityListRequestOrBuilder> diveActivityListRequestBuilder_;
            private DiveActivityListRequest diveActivityListRequest_;
            private SingleFieldBuilderV3<DiveActivityListResponse, DiveActivityListResponse.Builder, DiveActivityListResponseOrBuilder> diveActivityListResponseBuilder_;
            private DiveActivityListResponse diveActivityListResponse_;
            private SingleFieldBuilderV3<ReleaseDivesForUploadRequest, ReleaseDivesForUploadRequest.Builder, ReleaseDivesForUploadRequestOrBuilder> releaseDivesForUploadRequestBuilder_;
            private ReleaseDivesForUploadRequest releaseDivesForUploadRequest_;
            private SingleFieldBuilderV3<ReleaseDivesForUploadResponse, ReleaseDivesForUploadResponse.Builder, ReleaseDivesForUploadResponseOrBuilder> releaseDivesForUploadResponseBuilder_;
            private ReleaseDivesForUploadResponse releaseDivesForUploadResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DiveService diveService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DiveActivityListRequest, DiveActivityListRequest.Builder, DiveActivityListRequestOrBuilder> singleFieldBuilderV3 = this.diveActivityListRequestBuilder_;
                    diveService.diveActivityListRequest_ = singleFieldBuilderV3 == null ? this.diveActivityListRequest_ : (DiveActivityListRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DiveActivityListResponse, DiveActivityListResponse.Builder, DiveActivityListResponseOrBuilder> singleFieldBuilderV4 = this.diveActivityListResponseBuilder_;
                    diveService.diveActivityListResponse_ = singleFieldBuilderV4 == null ? this.diveActivityListResponse_ : (DiveActivityListResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ReleaseDivesForUploadRequest, ReleaseDivesForUploadRequest.Builder, ReleaseDivesForUploadRequestOrBuilder> singleFieldBuilderV5 = this.releaseDivesForUploadRequestBuilder_;
                    diveService.releaseDivesForUploadRequest_ = singleFieldBuilderV5 == null ? this.releaseDivesForUploadRequest_ : (ReleaseDivesForUploadRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ReleaseDivesForUploadResponse, ReleaseDivesForUploadResponse.Builder, ReleaseDivesForUploadResponseOrBuilder> singleFieldBuilderV6 = this.releaseDivesForUploadResponseBuilder_;
                    diveService.releaseDivesForUploadResponse_ = singleFieldBuilderV6 == null ? this.releaseDivesForUploadResponse_ : (ReleaseDivesForUploadResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                diveService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveService_descriptor;
            }

            private SingleFieldBuilderV3<DiveActivityListRequest, DiveActivityListRequest.Builder, DiveActivityListRequestOrBuilder> getDiveActivityListRequestFieldBuilder() {
                if (this.diveActivityListRequestBuilder_ == null) {
                    this.diveActivityListRequestBuilder_ = new SingleFieldBuilderV3<>(getDiveActivityListRequest(), getParentForChildren(), isClean());
                    this.diveActivityListRequest_ = null;
                }
                return this.diveActivityListRequestBuilder_;
            }

            private SingleFieldBuilderV3<DiveActivityListResponse, DiveActivityListResponse.Builder, DiveActivityListResponseOrBuilder> getDiveActivityListResponseFieldBuilder() {
                if (this.diveActivityListResponseBuilder_ == null) {
                    this.diveActivityListResponseBuilder_ = new SingleFieldBuilderV3<>(getDiveActivityListResponse(), getParentForChildren(), isClean());
                    this.diveActivityListResponse_ = null;
                }
                return this.diveActivityListResponseBuilder_;
            }

            private SingleFieldBuilderV3<ReleaseDivesForUploadRequest, ReleaseDivesForUploadRequest.Builder, ReleaseDivesForUploadRequestOrBuilder> getReleaseDivesForUploadRequestFieldBuilder() {
                if (this.releaseDivesForUploadRequestBuilder_ == null) {
                    this.releaseDivesForUploadRequestBuilder_ = new SingleFieldBuilderV3<>(getReleaseDivesForUploadRequest(), getParentForChildren(), isClean());
                    this.releaseDivesForUploadRequest_ = null;
                }
                return this.releaseDivesForUploadRequestBuilder_;
            }

            private SingleFieldBuilderV3<ReleaseDivesForUploadResponse, ReleaseDivesForUploadResponse.Builder, ReleaseDivesForUploadResponseOrBuilder> getReleaseDivesForUploadResponseFieldBuilder() {
                if (this.releaseDivesForUploadResponseBuilder_ == null) {
                    this.releaseDivesForUploadResponseBuilder_ = new SingleFieldBuilderV3<>(getReleaseDivesForUploadResponse(), getParentForChildren(), isClean());
                    this.releaseDivesForUploadResponse_ = null;
                }
                return this.releaseDivesForUploadResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDiveActivityListRequestFieldBuilder();
                    getDiveActivityListResponseFieldBuilder();
                    getReleaseDivesForUploadRequestFieldBuilder();
                    getReleaseDivesForUploadResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveService build() {
                DiveService diveServiceBuildPartial = buildPartial();
                if (diveServiceBuildPartial.isInitialized()) {
                    return diveServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) diveServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiveService buildPartial() {
                DiveService diveService = new DiveService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(diveService);
                }
                onBuilt();
                return diveService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.diveActivityListRequest_ = null;
                SingleFieldBuilderV3<DiveActivityListRequest, DiveActivityListRequest.Builder, DiveActivityListRequestOrBuilder> singleFieldBuilderV3 = this.diveActivityListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.diveActivityListRequestBuilder_ = null;
                }
                this.diveActivityListResponse_ = null;
                SingleFieldBuilderV3<DiveActivityListResponse, DiveActivityListResponse.Builder, DiveActivityListResponseOrBuilder> singleFieldBuilderV4 = this.diveActivityListResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.diveActivityListResponseBuilder_ = null;
                }
                this.releaseDivesForUploadRequest_ = null;
                SingleFieldBuilderV3<ReleaseDivesForUploadRequest, ReleaseDivesForUploadRequest.Builder, ReleaseDivesForUploadRequestOrBuilder> singleFieldBuilderV5 = this.releaseDivesForUploadRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.releaseDivesForUploadRequestBuilder_ = null;
                }
                this.releaseDivesForUploadResponse_ = null;
                SingleFieldBuilderV3<ReleaseDivesForUploadResponse, ReleaseDivesForUploadResponse.Builder, ReleaseDivesForUploadResponseOrBuilder> singleFieldBuilderV6 = this.releaseDivesForUploadResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.releaseDivesForUploadResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearDiveActivityListRequest() {
                this.bitField0_ &= -2;
                this.diveActivityListRequest_ = null;
                SingleFieldBuilderV3<DiveActivityListRequest, DiveActivityListRequest.Builder, DiveActivityListRequestOrBuilder> singleFieldBuilderV3 = this.diveActivityListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.diveActivityListRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDiveActivityListResponse() {
                this.bitField0_ &= -3;
                this.diveActivityListResponse_ = null;
                SingleFieldBuilderV3<DiveActivityListResponse, DiveActivityListResponse.Builder, DiveActivityListResponseOrBuilder> singleFieldBuilderV3 = this.diveActivityListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.diveActivityListResponseBuilder_ = null;
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

            public Builder clearReleaseDivesForUploadRequest() {
                this.bitField0_ &= -5;
                this.releaseDivesForUploadRequest_ = null;
                SingleFieldBuilderV3<ReleaseDivesForUploadRequest, ReleaseDivesForUploadRequest.Builder, ReleaseDivesForUploadRequestOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.releaseDivesForUploadRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearReleaseDivesForUploadResponse() {
                this.bitField0_ &= -9;
                this.releaseDivesForUploadResponse_ = null;
                SingleFieldBuilderV3<ReleaseDivesForUploadResponse, ReleaseDivesForUploadResponse.Builder, ReleaseDivesForUploadResponseOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.releaseDivesForUploadResponseBuilder_ = null;
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
                return GDIDive.internal_static_GDI_Proto_Dive_DiveService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public DiveActivityListRequest getDiveActivityListRequest() {
                SingleFieldBuilderV3<DiveActivityListRequest, DiveActivityListRequest.Builder, DiveActivityListRequestOrBuilder> singleFieldBuilderV3 = this.diveActivityListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DiveActivityListRequest) singleFieldBuilderV3.getMessage();
                }
                DiveActivityListRequest diveActivityListRequest = this.diveActivityListRequest_;
                return diveActivityListRequest == null ? DiveActivityListRequest.getDefaultInstance() : diveActivityListRequest;
            }

            public DiveActivityListRequest.Builder getDiveActivityListRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DiveActivityListRequest.Builder) getDiveActivityListRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public DiveActivityListRequestOrBuilder getDiveActivityListRequestOrBuilder() {
                SingleFieldBuilderV3<DiveActivityListRequest, DiveActivityListRequest.Builder, DiveActivityListRequestOrBuilder> singleFieldBuilderV3 = this.diveActivityListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DiveActivityListRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DiveActivityListRequest diveActivityListRequest = this.diveActivityListRequest_;
                return diveActivityListRequest == null ? DiveActivityListRequest.getDefaultInstance() : diveActivityListRequest;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public DiveActivityListResponse getDiveActivityListResponse() {
                SingleFieldBuilderV3<DiveActivityListResponse, DiveActivityListResponse.Builder, DiveActivityListResponseOrBuilder> singleFieldBuilderV3 = this.diveActivityListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DiveActivityListResponse) singleFieldBuilderV3.getMessage();
                }
                DiveActivityListResponse diveActivityListResponse = this.diveActivityListResponse_;
                return diveActivityListResponse == null ? DiveActivityListResponse.getDefaultInstance() : diveActivityListResponse;
            }

            public DiveActivityListResponse.Builder getDiveActivityListResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DiveActivityListResponse.Builder) getDiveActivityListResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public DiveActivityListResponseOrBuilder getDiveActivityListResponseOrBuilder() {
                SingleFieldBuilderV3<DiveActivityListResponse, DiveActivityListResponse.Builder, DiveActivityListResponseOrBuilder> singleFieldBuilderV3 = this.diveActivityListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DiveActivityListResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DiveActivityListResponse diveActivityListResponse = this.diveActivityListResponse_;
                return diveActivityListResponse == null ? DiveActivityListResponse.getDefaultInstance() : diveActivityListResponse;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public ReleaseDivesForUploadRequest getReleaseDivesForUploadRequest() {
                SingleFieldBuilderV3<ReleaseDivesForUploadRequest, ReleaseDivesForUploadRequest.Builder, ReleaseDivesForUploadRequestOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ReleaseDivesForUploadRequest) singleFieldBuilderV3.getMessage();
                }
                ReleaseDivesForUploadRequest releaseDivesForUploadRequest = this.releaseDivesForUploadRequest_;
                return releaseDivesForUploadRequest == null ? ReleaseDivesForUploadRequest.getDefaultInstance() : releaseDivesForUploadRequest;
            }

            public ReleaseDivesForUploadRequest.Builder getReleaseDivesForUploadRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ReleaseDivesForUploadRequest.Builder) getReleaseDivesForUploadRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public ReleaseDivesForUploadRequestOrBuilder getReleaseDivesForUploadRequestOrBuilder() {
                SingleFieldBuilderV3<ReleaseDivesForUploadRequest, ReleaseDivesForUploadRequest.Builder, ReleaseDivesForUploadRequestOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ReleaseDivesForUploadRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ReleaseDivesForUploadRequest releaseDivesForUploadRequest = this.releaseDivesForUploadRequest_;
                return releaseDivesForUploadRequest == null ? ReleaseDivesForUploadRequest.getDefaultInstance() : releaseDivesForUploadRequest;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public ReleaseDivesForUploadResponse getReleaseDivesForUploadResponse() {
                SingleFieldBuilderV3<ReleaseDivesForUploadResponse, ReleaseDivesForUploadResponse.Builder, ReleaseDivesForUploadResponseOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ReleaseDivesForUploadResponse) singleFieldBuilderV3.getMessage();
                }
                ReleaseDivesForUploadResponse releaseDivesForUploadResponse = this.releaseDivesForUploadResponse_;
                return releaseDivesForUploadResponse == null ? ReleaseDivesForUploadResponse.getDefaultInstance() : releaseDivesForUploadResponse;
            }

            public ReleaseDivesForUploadResponse.Builder getReleaseDivesForUploadResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ReleaseDivesForUploadResponse.Builder) getReleaseDivesForUploadResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public ReleaseDivesForUploadResponseOrBuilder getReleaseDivesForUploadResponseOrBuilder() {
                SingleFieldBuilderV3<ReleaseDivesForUploadResponse, ReleaseDivesForUploadResponse.Builder, ReleaseDivesForUploadResponseOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ReleaseDivesForUploadResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ReleaseDivesForUploadResponse releaseDivesForUploadResponse = this.releaseDivesForUploadResponse_;
                return releaseDivesForUploadResponse == null ? ReleaseDivesForUploadResponse.getDefaultInstance() : releaseDivesForUploadResponse;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public boolean hasDiveActivityListRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public boolean hasDiveActivityListResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public boolean hasReleaseDivesForUploadRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDive.DiveServiceOrBuilder
            public boolean hasReleaseDivesForUploadResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDive.internal_static_GDI_Proto_Dive_DiveService_fieldAccessorTable.ensureFieldAccessorsInitialized(DiveService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDiveActivityListRequest(DiveActivityListRequest diveActivityListRequest) {
                DiveActivityListRequest diveActivityListRequest2;
                SingleFieldBuilderV3<DiveActivityListRequest, DiveActivityListRequest.Builder, DiveActivityListRequestOrBuilder> singleFieldBuilderV3 = this.diveActivityListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(diveActivityListRequest);
                } else if ((this.bitField0_ & 1) == 0 || (diveActivityListRequest2 = this.diveActivityListRequest_) == null || diveActivityListRequest2 == DiveActivityListRequest.getDefaultInstance()) {
                    this.diveActivityListRequest_ = diveActivityListRequest;
                } else {
                    getDiveActivityListRequestBuilder().mergeFrom(diveActivityListRequest);
                }
                if (this.diveActivityListRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDiveActivityListResponse(DiveActivityListResponse diveActivityListResponse) {
                DiveActivityListResponse diveActivityListResponse2;
                SingleFieldBuilderV3<DiveActivityListResponse, DiveActivityListResponse.Builder, DiveActivityListResponseOrBuilder> singleFieldBuilderV3 = this.diveActivityListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(diveActivityListResponse);
                } else if ((this.bitField0_ & 2) == 0 || (diveActivityListResponse2 = this.diveActivityListResponse_) == null || diveActivityListResponse2 == DiveActivityListResponse.getDefaultInstance()) {
                    this.diveActivityListResponse_ = diveActivityListResponse;
                } else {
                    getDiveActivityListResponseBuilder().mergeFrom(diveActivityListResponse);
                }
                if (this.diveActivityListResponse_ != null) {
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
                                    codedInputStream.readMessage(getDiveActivityListRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDiveActivityListResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getReleaseDivesForUploadRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getReleaseDivesForUploadResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeReleaseDivesForUploadRequest(ReleaseDivesForUploadRequest releaseDivesForUploadRequest) {
                ReleaseDivesForUploadRequest releaseDivesForUploadRequest2;
                SingleFieldBuilderV3<ReleaseDivesForUploadRequest, ReleaseDivesForUploadRequest.Builder, ReleaseDivesForUploadRequestOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(releaseDivesForUploadRequest);
                } else if ((this.bitField0_ & 4) == 0 || (releaseDivesForUploadRequest2 = this.releaseDivesForUploadRequest_) == null || releaseDivesForUploadRequest2 == ReleaseDivesForUploadRequest.getDefaultInstance()) {
                    this.releaseDivesForUploadRequest_ = releaseDivesForUploadRequest;
                } else {
                    getReleaseDivesForUploadRequestBuilder().mergeFrom(releaseDivesForUploadRequest);
                }
                if (this.releaseDivesForUploadRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeReleaseDivesForUploadResponse(ReleaseDivesForUploadResponse releaseDivesForUploadResponse) {
                ReleaseDivesForUploadResponse releaseDivesForUploadResponse2;
                SingleFieldBuilderV3<ReleaseDivesForUploadResponse, ReleaseDivesForUploadResponse.Builder, ReleaseDivesForUploadResponseOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(releaseDivesForUploadResponse);
                } else if ((this.bitField0_ & 8) == 0 || (releaseDivesForUploadResponse2 = this.releaseDivesForUploadResponse_) == null || releaseDivesForUploadResponse2 == ReleaseDivesForUploadResponse.getDefaultInstance()) {
                    this.releaseDivesForUploadResponse_ = releaseDivesForUploadResponse;
                } else {
                    getReleaseDivesForUploadResponseBuilder().mergeFrom(releaseDivesForUploadResponse);
                }
                if (this.releaseDivesForUploadResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDiveActivityListRequest(DiveActivityListRequest.Builder builder) {
                SingleFieldBuilderV3<DiveActivityListRequest, DiveActivityListRequest.Builder, DiveActivityListRequestOrBuilder> singleFieldBuilderV3 = this.diveActivityListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.diveActivityListRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDiveActivityListResponse(DiveActivityListResponse.Builder builder) {
                SingleFieldBuilderV3<DiveActivityListResponse, DiveActivityListResponse.Builder, DiveActivityListResponseOrBuilder> singleFieldBuilderV3 = this.diveActivityListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.diveActivityListResponse_ = builder.build();
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

            public Builder setReleaseDivesForUploadRequest(ReleaseDivesForUploadRequest.Builder builder) {
                SingleFieldBuilderV3<ReleaseDivesForUploadRequest, ReleaseDivesForUploadRequest.Builder, ReleaseDivesForUploadRequestOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.releaseDivesForUploadRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setReleaseDivesForUploadResponse(ReleaseDivesForUploadResponse.Builder builder) {
                SingleFieldBuilderV3<ReleaseDivesForUploadResponse, ReleaseDivesForUploadResponse.Builder, ReleaseDivesForUploadResponseOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.releaseDivesForUploadResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DiveService getDefaultInstanceForType() {
                return DiveService.getDefaultInstance();
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

            public Builder setDiveActivityListRequest(DiveActivityListRequest diveActivityListRequest) {
                SingleFieldBuilderV3<DiveActivityListRequest, DiveActivityListRequest.Builder, DiveActivityListRequestOrBuilder> singleFieldBuilderV3 = this.diveActivityListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    diveActivityListRequest.getClass();
                    this.diveActivityListRequest_ = diveActivityListRequest;
                } else {
                    singleFieldBuilderV3.setMessage(diveActivityListRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDiveActivityListResponse(DiveActivityListResponse diveActivityListResponse) {
                SingleFieldBuilderV3<DiveActivityListResponse, DiveActivityListResponse.Builder, DiveActivityListResponseOrBuilder> singleFieldBuilderV3 = this.diveActivityListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    diveActivityListResponse.getClass();
                    this.diveActivityListResponse_ = diveActivityListResponse;
                } else {
                    singleFieldBuilderV3.setMessage(diveActivityListResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setReleaseDivesForUploadRequest(ReleaseDivesForUploadRequest releaseDivesForUploadRequest) {
                SingleFieldBuilderV3<ReleaseDivesForUploadRequest, ReleaseDivesForUploadRequest.Builder, ReleaseDivesForUploadRequestOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    releaseDivesForUploadRequest.getClass();
                    this.releaseDivesForUploadRequest_ = releaseDivesForUploadRequest;
                } else {
                    singleFieldBuilderV3.setMessage(releaseDivesForUploadRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setReleaseDivesForUploadResponse(ReleaseDivesForUploadResponse releaseDivesForUploadResponse) {
                SingleFieldBuilderV3<ReleaseDivesForUploadResponse, ReleaseDivesForUploadResponse.Builder, ReleaseDivesForUploadResponseOrBuilder> singleFieldBuilderV3 = this.releaseDivesForUploadResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    releaseDivesForUploadResponse.getClass();
                    this.releaseDivesForUploadResponse_ = releaseDivesForUploadResponse;
                } else {
                    singleFieldBuilderV3.setMessage(releaseDivesForUploadResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DiveService) {
                    return mergeFrom((DiveService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DiveService diveService) {
                if (diveService == DiveService.getDefaultInstance()) {
                    return this;
                }
                if (diveService.hasDiveActivityListRequest()) {
                    mergeDiveActivityListRequest(diveService.getDiveActivityListRequest());
                }
                if (diveService.hasDiveActivityListResponse()) {
                    mergeDiveActivityListResponse(diveService.getDiveActivityListResponse());
                }
                if (diveService.hasReleaseDivesForUploadRequest()) {
                    mergeReleaseDivesForUploadRequest(diveService.getReleaseDivesForUploadRequest());
                }
                if (diveService.hasReleaseDivesForUploadResponse()) {
                    mergeReleaseDivesForUploadResponse(diveService.getReleaseDivesForUploadResponse());
                }
                mergeUnknownFields(diveService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DiveService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DiveService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DiveService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DiveService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiveService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DiveService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DiveService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DiveService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DiveService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DiveService parseFrom(InputStream inputStream) {
            return (DiveService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DiveService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiveService parseFrom(CodedInputStream codedInputStream) {
            return (DiveService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DiveService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiveService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ReleaseDivesForUploadRequest extends GeneratedMessageV3 implements ReleaseDivesForUploadRequestOrBuilder {
        public static final int ACTIVITY_IDENTIFIERS_FIELD_NUMBER = 1;
        private static final ReleaseDivesForUploadRequest DEFAULT_INSTANCE = new ReleaseDivesForUploadRequest();

        @Deprecated
        public static final Parser<ReleaseDivesForUploadRequest> PARSER = new AbstractParser<ReleaseDivesForUploadRequest>() { // from class: com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadRequest.1
            @Override // com.google.protobuf.Parser
            public ReleaseDivesForUploadRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ReleaseDivesForUploadRequest.newBuilder();
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
        private Internal.IntList activityIdentifiers_;
        private byte memoizedIsInitialized;

        private ReleaseDivesForUploadRequest() {
            this.activityIdentifiers_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
            this.activityIdentifiers_ = GeneratedMessageV3.emptyIntList();
        }

        public static ReleaseDivesForUploadRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDive.internal_static_GDI_Proto_Dive_ReleaseDivesForUploadRequest_descriptor;
        }

        public static Builder newBuilder(ReleaseDivesForUploadRequest releaseDivesForUploadRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(releaseDivesForUploadRequest);
        }

        public static ReleaseDivesForUploadRequest parseDelimitedFrom(InputStream inputStream) {
            return (ReleaseDivesForUploadRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ReleaseDivesForUploadRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ReleaseDivesForUploadRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReleaseDivesForUploadRequest)) {
                return super.equals(obj);
            }
            ReleaseDivesForUploadRequest releaseDivesForUploadRequest = (ReleaseDivesForUploadRequest) obj;
            return getActivityIdentifiersList().equals(releaseDivesForUploadRequest.getActivityIdentifiersList()) && getUnknownFields().equals(releaseDivesForUploadRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadRequestOrBuilder
        public int getActivityIdentifiers(int i14) {
            return this.activityIdentifiers_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadRequestOrBuilder
        public int getActivityIdentifiersCount() {
            return this.activityIdentifiers_.size();
        }

        @Override // com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadRequestOrBuilder
        public List<Integer> getActivityIdentifiersList() {
            return this.activityIdentifiers_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ReleaseDivesForUploadRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iB = 0;
            for (int i15 = 0; i15 < this.activityIdentifiers_.size(); i15++) {
                iB = f3.b(this.activityIdentifiers_, i15, iB);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getActivityIdentifiersList().size() + iB;
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
            if (getActivityIdentifiersCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getActivityIdentifiersList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDive.internal_static_GDI_Proto_Dive_ReleaseDivesForUploadRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ReleaseDivesForUploadRequest.class, Builder.class);
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
            return new ReleaseDivesForUploadRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iC = 0;
            while (iC < this.activityIdentifiers_.size()) {
                iC = f3.c(this.activityIdentifiers_, iC, codedOutputStream, 1, iC, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReleaseDivesForUploadRequestOrBuilder {
            private Internal.IntList activityIdentifiers_;
            private int bitField0_;

            private Builder() {
                this.activityIdentifiers_ = GeneratedMessageV3.emptyIntList();
            }

            private void buildPartial0(ReleaseDivesForUploadRequest releaseDivesForUploadRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    this.activityIdentifiers_.makeImmutable();
                    releaseDivesForUploadRequest.activityIdentifiers_ = this.activityIdentifiers_;
                }
            }

            private void ensureActivityIdentifiersIsMutable() {
                if (!this.activityIdentifiers_.isModifiable()) {
                    this.activityIdentifiers_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.activityIdentifiers_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDive.internal_static_GDI_Proto_Dive_ReleaseDivesForUploadRequest_descriptor;
            }

            public Builder addActivityIdentifiers(int i14) {
                ensureActivityIdentifiersIsMutable();
                this.activityIdentifiers_.addInt(i14);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addAllActivityIdentifiers(Iterable<? extends Integer> iterable) {
                ensureActivityIdentifiersIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.activityIdentifiers_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ReleaseDivesForUploadRequest build() {
                ReleaseDivesForUploadRequest releaseDivesForUploadRequestBuildPartial = buildPartial();
                if (releaseDivesForUploadRequestBuildPartial.isInitialized()) {
                    return releaseDivesForUploadRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) releaseDivesForUploadRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ReleaseDivesForUploadRequest buildPartial() {
                ReleaseDivesForUploadRequest releaseDivesForUploadRequest = new ReleaseDivesForUploadRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(releaseDivesForUploadRequest);
                }
                onBuilt();
                return releaseDivesForUploadRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.activityIdentifiers_ = GeneratedMessageV3.emptyIntList();
                return this;
            }

            public Builder clearActivityIdentifiers() {
                this.activityIdentifiers_ = GeneratedMessageV3.emptyIntList();
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

            @Override // com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadRequestOrBuilder
            public int getActivityIdentifiers(int i14) {
                return this.activityIdentifiers_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadRequestOrBuilder
            public int getActivityIdentifiersCount() {
                return this.activityIdentifiers_.size();
            }

            @Override // com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadRequestOrBuilder
            public List<Integer> getActivityIdentifiersList() {
                this.activityIdentifiers_.makeImmutable();
                return this.activityIdentifiers_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDive.internal_static_GDI_Proto_Dive_ReleaseDivesForUploadRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDive.internal_static_GDI_Proto_Dive_ReleaseDivesForUploadRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ReleaseDivesForUploadRequest.class, Builder.class);
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
                                    ensureActivityIdentifiersIsMutable();
                                    this.activityIdentifiers_.addInt(uInt32);
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureActivityIdentifiersIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.activityIdentifiers_.addInt(codedInputStream.readUInt32());
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

            public Builder setActivityIdentifiers(int i14, int i15) {
                ensureActivityIdentifiersIsMutable();
                this.activityIdentifiers_.setInt(i14, i15);
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
            public ReleaseDivesForUploadRequest getDefaultInstanceForType() {
                return ReleaseDivesForUploadRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.activityIdentifiers_ = GeneratedMessageV3.emptyIntList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ReleaseDivesForUploadRequest) {
                    return mergeFrom((ReleaseDivesForUploadRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ReleaseDivesForUploadRequest releaseDivesForUploadRequest) {
                if (releaseDivesForUploadRequest == ReleaseDivesForUploadRequest.getDefaultInstance()) {
                    return this;
                }
                if (!releaseDivesForUploadRequest.activityIdentifiers_.isEmpty()) {
                    if (this.activityIdentifiers_.isEmpty()) {
                        Internal.IntList intList = releaseDivesForUploadRequest.activityIdentifiers_;
                        this.activityIdentifiers_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 1;
                    } else {
                        ensureActivityIdentifiersIsMutable();
                        this.activityIdentifiers_.addAll(releaseDivesForUploadRequest.activityIdentifiers_);
                    }
                    onChanged();
                }
                mergeUnknownFields(releaseDivesForUploadRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ReleaseDivesForUploadRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ReleaseDivesForUploadRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReleaseDivesForUploadRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ReleaseDivesForUploadRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ReleaseDivesForUploadRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ReleaseDivesForUploadRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ReleaseDivesForUploadRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ReleaseDivesForUploadRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ReleaseDivesForUploadRequest parseFrom(InputStream inputStream) {
            return (ReleaseDivesForUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ReleaseDivesForUploadRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReleaseDivesForUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ReleaseDivesForUploadRequest parseFrom(CodedInputStream codedInputStream) {
            return (ReleaseDivesForUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private ReleaseDivesForUploadRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.activityIdentifiers_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ReleaseDivesForUploadRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReleaseDivesForUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ ReleaseDivesForUploadRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ReleaseDivesForUploadResponse extends GeneratedMessageV3 implements ReleaseDivesForUploadResponseOrBuilder {
        private static final ReleaseDivesForUploadResponse DEFAULT_INSTANCE = new ReleaseDivesForUploadResponse();

        @Deprecated
        public static final Parser<ReleaseDivesForUploadResponse> PARSER = new AbstractParser<ReleaseDivesForUploadResponse>() { // from class: com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadResponse.1
            @Override // com.google.protobuf.Parser
            public ReleaseDivesForUploadResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ReleaseDivesForUploadResponse.newBuilder();
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

        private ReleaseDivesForUploadResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ReleaseDivesForUploadResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDive.internal_static_GDI_Proto_Dive_ReleaseDivesForUploadResponse_descriptor;
        }

        public static Builder newBuilder(ReleaseDivesForUploadResponse releaseDivesForUploadResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(releaseDivesForUploadResponse);
        }

        public static ReleaseDivesForUploadResponse parseDelimitedFrom(InputStream inputStream) {
            return (ReleaseDivesForUploadResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ReleaseDivesForUploadResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ReleaseDivesForUploadResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReleaseDivesForUploadResponse)) {
                return super.equals(obj);
            }
            ReleaseDivesForUploadResponse releaseDivesForUploadResponse = (ReleaseDivesForUploadResponse) obj;
            if (hasStatus() != releaseDivesForUploadResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == releaseDivesForUploadResponse.status_) && getUnknownFields().equals(releaseDivesForUploadResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ReleaseDivesForUploadResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadResponseOrBuilder
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
            return GDIDive.internal_static_GDI_Proto_Dive_ReleaseDivesForUploadResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ReleaseDivesForUploadResponse.class, Builder.class);
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
            return new ReleaseDivesForUploadResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReleaseDivesForUploadResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ReleaseDivesForUploadResponse releaseDivesForUploadResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    releaseDivesForUploadResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                releaseDivesForUploadResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDive.internal_static_GDI_Proto_Dive_ReleaseDivesForUploadResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ReleaseDivesForUploadResponse build() {
                ReleaseDivesForUploadResponse releaseDivesForUploadResponseBuildPartial = buildPartial();
                if (releaseDivesForUploadResponseBuildPartial.isInitialized()) {
                    return releaseDivesForUploadResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) releaseDivesForUploadResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ReleaseDivesForUploadResponse buildPartial() {
                ReleaseDivesForUploadResponse releaseDivesForUploadResponse = new ReleaseDivesForUploadResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(releaseDivesForUploadResponse);
                }
                onBuilt();
                return releaseDivesForUploadResponse;
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
                return GDIDive.internal_static_GDI_Proto_Dive_ReleaseDivesForUploadResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDive.internal_static_GDI_Proto_Dive_ReleaseDivesForUploadResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ReleaseDivesForUploadResponse.class, Builder.class);
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
            public ReleaseDivesForUploadResponse getDefaultInstanceForType() {
                return ReleaseDivesForUploadResponse.getDefaultInstance();
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
                if (message instanceof ReleaseDivesForUploadResponse) {
                    return mergeFrom((ReleaseDivesForUploadResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ReleaseDivesForUploadResponse releaseDivesForUploadResponse) {
                if (releaseDivesForUploadResponse == ReleaseDivesForUploadResponse.getDefaultInstance()) {
                    return this;
                }
                if (releaseDivesForUploadResponse.hasStatus()) {
                    setStatus(releaseDivesForUploadResponse.getStatus());
                }
                mergeUnknownFields(releaseDivesForUploadResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ReleaseDivesForUploadResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ReleaseDivesForUploadResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReleaseDivesForUploadResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ReleaseDivesForUploadResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ReleaseDivesForUploadResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ReleaseDivesForUploadResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ReleaseDivesForUploadResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ReleaseDivesForUploadResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ReleaseDivesForUploadResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ReleaseDivesForUploadResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ReleaseDivesForUploadResponse parseFrom(InputStream inputStream) {
            return (ReleaseDivesForUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ReleaseDivesForUploadResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReleaseDivesForUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ReleaseDivesForUploadResponse parseFrom(CodedInputStream codedInputStream) {
            return (ReleaseDivesForUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ReleaseDivesForUploadResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReleaseDivesForUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            FAILED(2);

            public static final int FAILED_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIDive.ReleaseDivesForUploadResponse.Status.1
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
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return FAILED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ReleaseDivesForUploadResponse.getDescriptor().getEnumTypes().get(0);
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

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
