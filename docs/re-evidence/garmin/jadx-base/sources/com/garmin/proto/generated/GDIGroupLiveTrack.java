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
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIGroupLiveTrack {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017GDIGroupLiveTrack.proto\u0012\u0018GDI.Proto.GroupLiveTrack\u001a\u0012GDIDataTypes.proto\"§\u0003\n\u0015GroupLiveTrackService\u0012d\n\"get_live_track_connections_request\u0018\u0001 \u0001(\u000b28.GDI.Proto.GroupLiveTrack.GetLiveTrackConnectionsRequest\u0012f\n#get_live_track_connections_response\u0018\u0002 \u0001(\u000b29.GDI.Proto.GroupLiveTrack.GetLiveTrackConnectionsResponse\u0012^\n\u001fget_last_known_location_request\u0018\u0003 \u0001(\u000b25.GDI.Proto.GroupLiveTrack.GetLastKnownLocationRequest\u0012`\n get_last_known_location_response\u0018\u0004 \u0001(\u000b26.GDI.Proto.GroupLiveTrack.GetLastKnownLocationResponse\"°\u0001\n\u001eGetLiveTrackConnectionsRequest\u0012.\n\bposition\u0018\u0001 \u0001(\u000b2\u001c.GDI.Proto.DataTypes.ScPoint\u0012\u000e\n\u0006radius\u0018\u0002 \u0001(\r\u0012N\n\ractivity_type\u0018\u0003 \u0003(\u000e27.GDI.Proto.GroupLiveTrack.FitnessPointData.ActivityType\"Ò\u0001\n\u001fGetLiveTrackConnectionsResponse\u0012J\n\u0014group_track_response\u0018\u0001 \u0002(\u000b2,.GDI.Proto.GroupLiveTrack.GroupTrackResponse\u0012L\n\ftrack_points\u0018\u0002 \u0003(\u000b26.GDI.Proto.GroupLiveTrack.LiveConnectionUserTrackPoint\u0012\u0015\n\rcall_interval\u0018\u0003 \u0001(\r\"m\n\u0012GroupTrackResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0002(\b\u0012F\n\rfailureStatus\u0018\u0002 \u0001(\u000e2/.GDI.Proto.GroupLiveTrack.ResponseFailureStatus\"M\n\u001bGetLastKnownLocationRequest\u0012\u0012\n\nsession_id\u0018\u0001 \u0003(\t\u0012\u001a\n\u000fuser_profile_pk\u0018\u0002 \u0001(\u0004:\u00010\"Ú\u0001\n\u001cGetLastKnownLocationResponse\u0012J\n\u0014group_track_response\u0018\u0001 \u0002(\u000b2,.GDI.Proto.GroupLiveTrack.GroupTrackResponse\u0012H\n\ftrack_points\u0018\u0002 \u0003(\u000b22.GDI.Proto.GroupLiveTrack.LiveConnectionTrackPoint\u0012\u0015\n\rcall_interval\u0018\u0003 \u0001(\r\u0012\r\n\u0005dirty\u0018\u0004 \u0001(\b\"¼\u0001\n\u0010FitnessPointData\"§\u0001\n\fActivityType\u0012\u000b\n\u0007CYCLING\u0010\u0000\u0012\u000b\n\u0007RUNNING\u0010\u0001\u0012\u000b\n\u0007WALKING\u0010\u0002\u0012\t\n\u0005OTHER\u0010\u0003\u0012\u000e\n\nTRANSITION\u0010\u0004\u0012\u0015\n\u0011FITNESS_EQUIPMENT\u0010\u0005\u0012\f\n\bSWIMMING\u0010\u0006\u0012\n\n\u0006HIKING\u0010\u0007\u0012\u0011\n\rUNCATEGORIZED\u0010\b\u0012\u0011\n\rMOTOR_CYCLING\u0010\t\"ñ\u0001\n\u0018LiveConnectionTrackPoint\u0012\u0012\n\nsession_id\u0018\u0001 \u0002(\t\u0012\u001a\n\u0012reported_timestamp\u0018\u0002 \u0001(\u0004\u0012.\n\bposition\u0018\u0003 \u0001(\u000b2\u001c.GDI.Proto.DataTypes.ScPoint\u0012\u0011\n\tspeed_mps\u0018\u0004 \u0001(\u0001\u0012\u0012\n\nheading_sc\u0018\u0005 \u0001(\u0011\u0012N\n\ractivity_type\u0018\u0006 \u0001(\u000e27.GDI.Proto.GroupLiveTrack.FitnessPointData.ActivityType\"¬\u0001\n\u001cLiveConnectionUserTrackPoint\u0012\u0019\n\u0011user_display_name\u0018\u0001 \u0002(\t\u0012G\n\u000btrack_point\u0018\u0002 \u0001(\u000b22.GDI.Proto.GroupLiveTrack.LiveConnectionTrackPoint\u0012(\n is_livetrack_messaging_available\u0018\u0003 \u0001(\b*v\n\u0015ResponseFailureStatus\u0012\r\n\tUNDEFINED\u0010\u0000\u0012\u0013\n\u000fNO_NETWORK_CONN\u0010\u0001\u0012\u000b\n\u0007TIMEOUT\u0010\u0002\u0012\u0010\n\fSERVER_ERROR\u0010\u0003\u0012\u001a\n\u0016EMPTY_SESSION_IDS_LIST\u0010\u0004B1\n\u001acom.garmin.proto.generatedB\u0011GDIGroupLiveTrackH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GroupLiveTrack_FitnessPointData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GroupLiveTrack_FitnessPointData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GroupLiveTrack_GroupLiveTrackService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GroupLiveTrack_GroupLiveTrackService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GroupLiveTrack_GroupTrackResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GroupLiveTrack_GroupTrackResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionTrackPoint_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionTrackPoint_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionUserTrackPoint_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionUserTrackPoint_fieldAccessorTable;

    public interface FitnessPointDataOrBuilder extends MessageOrBuilder {
    }

    public interface GetLastKnownLocationRequestOrBuilder extends MessageOrBuilder {
        String getSessionId(int i14);

        ByteString getSessionIdBytes(int i14);

        int getSessionIdCount();

        List<String> getSessionIdList();

        long getUserProfilePk();

        boolean hasUserProfilePk();
    }

    public interface GetLastKnownLocationResponseOrBuilder extends MessageOrBuilder {
        int getCallInterval();

        boolean getDirty();

        GroupTrackResponse getGroupTrackResponse();

        GroupTrackResponseOrBuilder getGroupTrackResponseOrBuilder();

        LiveConnectionTrackPoint getTrackPoints(int i14);

        int getTrackPointsCount();

        List<LiveConnectionTrackPoint> getTrackPointsList();

        LiveConnectionTrackPointOrBuilder getTrackPointsOrBuilder(int i14);

        List<? extends LiveConnectionTrackPointOrBuilder> getTrackPointsOrBuilderList();

        boolean hasCallInterval();

        boolean hasDirty();

        boolean hasGroupTrackResponse();
    }

    public interface GetLiveTrackConnectionsRequestOrBuilder extends MessageOrBuilder {
        FitnessPointData.ActivityType getActivityType(int i14);

        int getActivityTypeCount();

        List<FitnessPointData.ActivityType> getActivityTypeList();

        GDIDataTypes.ScPoint getPosition();

        GDIDataTypes.ScPointOrBuilder getPositionOrBuilder();

        int getRadius();

        boolean hasPosition();

        boolean hasRadius();
    }

    public interface GetLiveTrackConnectionsResponseOrBuilder extends MessageOrBuilder {
        int getCallInterval();

        GroupTrackResponse getGroupTrackResponse();

        GroupTrackResponseOrBuilder getGroupTrackResponseOrBuilder();

        LiveConnectionUserTrackPoint getTrackPoints(int i14);

        int getTrackPointsCount();

        List<LiveConnectionUserTrackPoint> getTrackPointsList();

        LiveConnectionUserTrackPointOrBuilder getTrackPointsOrBuilder(int i14);

        List<? extends LiveConnectionUserTrackPointOrBuilder> getTrackPointsOrBuilderList();

        boolean hasCallInterval();

        boolean hasGroupTrackResponse();
    }

    public interface GroupLiveTrackServiceOrBuilder extends MessageOrBuilder {
        GetLastKnownLocationRequest getGetLastKnownLocationRequest();

        GetLastKnownLocationRequestOrBuilder getGetLastKnownLocationRequestOrBuilder();

        GetLastKnownLocationResponse getGetLastKnownLocationResponse();

        GetLastKnownLocationResponseOrBuilder getGetLastKnownLocationResponseOrBuilder();

        GetLiveTrackConnectionsRequest getGetLiveTrackConnectionsRequest();

        GetLiveTrackConnectionsRequestOrBuilder getGetLiveTrackConnectionsRequestOrBuilder();

        GetLiveTrackConnectionsResponse getGetLiveTrackConnectionsResponse();

        GetLiveTrackConnectionsResponseOrBuilder getGetLiveTrackConnectionsResponseOrBuilder();

        boolean hasGetLastKnownLocationRequest();

        boolean hasGetLastKnownLocationResponse();

        boolean hasGetLiveTrackConnectionsRequest();

        boolean hasGetLiveTrackConnectionsResponse();
    }

    public interface GroupTrackResponseOrBuilder extends MessageOrBuilder {
        ResponseFailureStatus getFailureStatus();

        boolean getSuccess();

        boolean hasFailureStatus();

        boolean hasSuccess();
    }

    public interface LiveConnectionTrackPointOrBuilder extends MessageOrBuilder {
        FitnessPointData.ActivityType getActivityType();

        int getHeadingSc();

        GDIDataTypes.ScPoint getPosition();

        GDIDataTypes.ScPointOrBuilder getPositionOrBuilder();

        long getReportedTimestamp();

        String getSessionId();

        ByteString getSessionIdBytes();

        double getSpeedMps();

        boolean hasActivityType();

        boolean hasHeadingSc();

        boolean hasPosition();

        boolean hasReportedTimestamp();

        boolean hasSessionId();

        boolean hasSpeedMps();
    }

    /* JADX INFO: loaded from: classes5.dex */
    public interface LiveConnectionUserTrackPointOrBuilder extends MessageOrBuilder {
        boolean getIsLivetrackMessagingAvailable();

        LiveConnectionTrackPoint getTrackPoint();

        LiveConnectionTrackPointOrBuilder getTrackPointOrBuilder();

        String getUserDisplayName();

        ByteString getUserDisplayNameBytes();

        boolean hasIsLivetrackMessagingAvailable();

        boolean hasTrackPoint();

        boolean hasUserDisplayName();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_GroupLiveTrack_GroupLiveTrackService_descriptor = descriptor2;
        internal_static_GDI_Proto_GroupLiveTrack_GroupLiveTrackService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"GetLiveTrackConnectionsRequest", "GetLiveTrackConnectionsResponse", "GetLastKnownLocationRequest", "GetLastKnownLocationResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Position", "Radius", "ActivityType"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"GroupTrackResponse", "TrackPoints", "CallInterval"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_GroupLiveTrack_GroupTrackResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_GroupLiveTrack_GroupTrackResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Success", "FailureStatus"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"SessionId", "UserProfilePk"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"GroupTrackResponse", "TrackPoints", "CallInterval", "Dirty"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_GroupLiveTrack_FitnessPointData_descriptor = descriptor8;
        internal_static_GDI_Proto_GroupLiveTrack_FitnessPointData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[0]);
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionTrackPoint_descriptor = descriptor9;
        internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionTrackPoint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"SessionId", "ReportedTimestamp", "Position", "SpeedMps", "HeadingSc", "ActivityType"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionUserTrackPoint_descriptor = descriptor10;
        internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionUserTrackPoint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"UserDisplayName", "TrackPoint", "IsLivetrackMessagingAvailable"});
        GDIDataTypes.getDescriptor();
    }

    private GDIGroupLiveTrack() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class FitnessPointData extends GeneratedMessageV3 implements FitnessPointDataOrBuilder {
        private static final FitnessPointData DEFAULT_INSTANCE = new FitnessPointData();

        @Deprecated
        public static final Parser<FitnessPointData> PARSER = new AbstractParser<FitnessPointData>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.FitnessPointData.1
            @Override // com.google.protobuf.Parser
            public FitnessPointData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FitnessPointData.newBuilder();
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

        private FitnessPointData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FitnessPointData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_FitnessPointData_descriptor;
        }

        public static Builder newBuilder(FitnessPointData fitnessPointData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fitnessPointData);
        }

        public static FitnessPointData parseDelimitedFrom(InputStream inputStream) {
            return (FitnessPointData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FitnessPointData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FitnessPointData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof FitnessPointData) {
                return getUnknownFields().equals(((FitnessPointData) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FitnessPointData> getParserForType() {
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
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_FitnessPointData_fieldAccessorTable.ensureFieldAccessorsInitialized(FitnessPointData.class, Builder.class);
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
            return new FitnessPointData();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FitnessPointDataOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_FitnessPointData_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FitnessPointData build() {
                FitnessPointData fitnessPointDataBuildPartial = buildPartial();
                if (fitnessPointDataBuildPartial.isInitialized()) {
                    return fitnessPointDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fitnessPointDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FitnessPointData buildPartial() {
                FitnessPointData fitnessPointData = new FitnessPointData(this);
                onBuilt();
                return fitnessPointData;
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
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_FitnessPointData_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_FitnessPointData_fieldAccessorTable.ensureFieldAccessorsInitialized(FitnessPointData.class, Builder.class);
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
            public FitnessPointData getDefaultInstanceForType() {
                return FitnessPointData.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FitnessPointData) {
                    return mergeFrom((FitnessPointData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FitnessPointData fitnessPointData) {
                if (fitnessPointData == FitnessPointData.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(fitnessPointData.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FitnessPointData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ FitnessPointData(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private FitnessPointData() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FitnessPointData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FitnessPointData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FitnessPointData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FitnessPointData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FitnessPointData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FitnessPointData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FitnessPointData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FitnessPointData parseFrom(InputStream inputStream) {
            return (FitnessPointData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FitnessPointData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FitnessPointData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FitnessPointData parseFrom(CodedInputStream codedInputStream) {
            return (FitnessPointData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FitnessPointData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FitnessPointData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ActivityType implements ProtocolMessageEnum {
            CYCLING(0),
            RUNNING(1),
            WALKING(2),
            OTHER(3),
            TRANSITION(4),
            FITNESS_EQUIPMENT(5),
            SWIMMING(6),
            HIKING(7),
            UNCATEGORIZED(8),
            MOTOR_CYCLING(9);

            public static final int CYCLING_VALUE = 0;
            public static final int FITNESS_EQUIPMENT_VALUE = 5;
            public static final int HIKING_VALUE = 7;
            public static final int MOTOR_CYCLING_VALUE = 9;
            public static final int OTHER_VALUE = 3;
            public static final int RUNNING_VALUE = 1;
            public static final int SWIMMING_VALUE = 6;
            public static final int TRANSITION_VALUE = 4;
            public static final int UNCATEGORIZED_VALUE = 8;
            public static final int WALKING_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<ActivityType> internalValueMap = new Internal.EnumLiteMap<ActivityType>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.FitnessPointData.ActivityType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ActivityType findValueByNumber(int i14) {
                    return ActivityType.forNumber(i14);
                }
            };
            private static final ActivityType[] VALUES = values();

            ActivityType(int i14) {
                this.value = i14;
            }

            public static ActivityType forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return CYCLING;
                    case 1:
                        return RUNNING;
                    case 2:
                        return WALKING;
                    case 3:
                        return OTHER;
                    case 4:
                        return TRANSITION;
                    case 5:
                        return FITNESS_EQUIPMENT;
                    case 6:
                        return SWIMMING;
                    case 7:
                        return HIKING;
                    case 8:
                        return UNCATEGORIZED;
                    case 9:
                        return MOTOR_CYCLING;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FitnessPointData.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ActivityType> internalGetValueMap() {
                return internalValueMap;
            }

            public static ActivityType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ActivityType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class GetLastKnownLocationRequest extends GeneratedMessageV3 implements GetLastKnownLocationRequestOrBuilder {
        private static final GetLastKnownLocationRequest DEFAULT_INSTANCE = new GetLastKnownLocationRequest();

        @Deprecated
        public static final Parser<GetLastKnownLocationRequest> PARSER = new AbstractParser<GetLastKnownLocationRequest>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequest.1
            @Override // com.google.protobuf.Parser
            public GetLastKnownLocationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetLastKnownLocationRequest.newBuilder();
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
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int USER_PROFILE_PK_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private LazyStringArrayList sessionId_;
        private long userProfilePk_;

        private GetLastKnownLocationRequest() {
            this.sessionId_ = LazyStringArrayList.emptyList();
            this.userProfilePk_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.sessionId_ = LazyStringArrayList.emptyList();
        }

        public static GetLastKnownLocationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationRequest_descriptor;
        }

        public static Builder newBuilder(GetLastKnownLocationRequest getLastKnownLocationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getLastKnownLocationRequest);
        }

        public static GetLastKnownLocationRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetLastKnownLocationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetLastKnownLocationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetLastKnownLocationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetLastKnownLocationRequest)) {
                return super.equals(obj);
            }
            GetLastKnownLocationRequest getLastKnownLocationRequest = (GetLastKnownLocationRequest) obj;
            if (getSessionIdList().equals(getLastKnownLocationRequest.getSessionIdList()) && hasUserProfilePk() == getLastKnownLocationRequest.hasUserProfilePk()) {
                return (!hasUserProfilePk() || getUserProfilePk() == getLastKnownLocationRequest.getUserProfilePk()) && getUnknownFields().equals(getLastKnownLocationRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetLastKnownLocationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iD = 0;
            for (int i15 = 0; i15 < this.sessionId_.size(); i15++) {
                iD = f3.d(this.sessionId_, i15, iD);
            }
            int size = getSessionIdList().size() + iD;
            if ((this.bitField0_ & 1) != 0) {
                size += CodedOutputStream.computeUInt64Size(2, this.userProfilePk_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
        public String getSessionId(int i14) {
            return this.sessionId_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
        public ByteString getSessionIdBytes(int i14) {
            return this.sessionId_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
        public int getSessionIdCount() {
            return this.sessionId_.size();
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
        public long getUserProfilePk() {
            return this.userProfilePk_;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
        public boolean hasUserProfilePk() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSessionIdCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionIdList().hashCode();
            }
            if (hasUserProfilePk()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getUserProfilePk());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLastKnownLocationRequest.class, Builder.class);
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
            return new GetLastKnownLocationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iE = 0;
            while (iE < this.sessionId_.size()) {
                iE = f3.e(this.sessionId_, iE, codedOutputStream, 1, iE, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(2, this.userProfilePk_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetLastKnownLocationRequestOrBuilder {
            private int bitField0_;
            private LazyStringArrayList sessionId_;
            private long userProfilePk_;

            private Builder() {
                this.sessionId_ = LazyStringArrayList.emptyList();
            }

            private void buildPartial0(GetLastKnownLocationRequest getLastKnownLocationRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    this.sessionId_.makeImmutable();
                    getLastKnownLocationRequest.sessionId_ = this.sessionId_;
                }
                if ((i15 & 2) != 0) {
                    getLastKnownLocationRequest.userProfilePk_ = this.userProfilePk_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                getLastKnownLocationRequest.bitField0_ = i14 | getLastKnownLocationRequest.bitField0_;
            }

            private void ensureSessionIdIsMutable() {
                if (!this.sessionId_.isModifiable()) {
                    this.sessionId_ = new LazyStringArrayList((LazyStringList) this.sessionId_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationRequest_descriptor;
            }

            public Builder addAllSessionId(Iterable<String> iterable) {
                ensureSessionIdIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sessionId_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSessionId(String str) {
                str.getClass();
                ensureSessionIdIsMutable();
                this.sessionId_.add(str);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addSessionIdBytes(ByteString byteString) {
                byteString.getClass();
                ensureSessionIdIsMutable();
                this.sessionId_.add(byteString);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLastKnownLocationRequest build() {
                GetLastKnownLocationRequest getLastKnownLocationRequestBuildPartial = buildPartial();
                if (getLastKnownLocationRequestBuildPartial.isInitialized()) {
                    return getLastKnownLocationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getLastKnownLocationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLastKnownLocationRequest buildPartial() {
                GetLastKnownLocationRequest getLastKnownLocationRequest = new GetLastKnownLocationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getLastKnownLocationRequest);
                }
                onBuilt();
                return getLastKnownLocationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionId_ = LazyStringArrayList.emptyList();
                this.userProfilePk_ = 0L;
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

            public Builder clearSessionId() {
                this.sessionId_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUserProfilePk() {
                this.bitField0_ &= -3;
                this.userProfilePk_ = 0L;
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
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
            public String getSessionId(int i14) {
                return this.sessionId_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
            public ByteString getSessionIdBytes(int i14) {
                return this.sessionId_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
            public int getSessionIdCount() {
                return this.sessionId_.size();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
            public ProtocolStringList getSessionIdList() {
                this.sessionId_.makeImmutable();
                return this.sessionId_;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
            public long getUserProfilePk() {
                return this.userProfilePk_;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
            public boolean hasUserProfilePk() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLastKnownLocationRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(GetLastKnownLocationRequest getLastKnownLocationRequest) {
                if (getLastKnownLocationRequest == GetLastKnownLocationRequest.getDefaultInstance()) {
                    return this;
                }
                if (!getLastKnownLocationRequest.sessionId_.isEmpty()) {
                    if (this.sessionId_.isEmpty()) {
                        this.sessionId_ = getLastKnownLocationRequest.sessionId_;
                        this.bitField0_ |= 1;
                    } else {
                        ensureSessionIdIsMutable();
                        this.sessionId_.addAll(getLastKnownLocationRequest.sessionId_);
                    }
                    onChanged();
                }
                if (getLastKnownLocationRequest.hasUserProfilePk()) {
                    setUserProfilePk(getLastKnownLocationRequest.getUserProfilePk());
                }
                mergeUnknownFields(getLastKnownLocationRequest.getUnknownFields());
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

            public Builder setSessionId(int i14, String str) {
                str.getClass();
                ensureSessionIdIsMutable();
                this.sessionId_.set(i14, str);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUserProfilePk(long j8) {
                this.userProfilePk_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetLastKnownLocationRequest getDefaultInstanceForType() {
                return GetLastKnownLocationRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sessionId_ = LazyStringArrayList.emptyList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetLastKnownLocationRequest) {
                    return mergeFrom((GetLastKnownLocationRequest) message);
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
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureSessionIdIsMutable();
                                    this.sessionId_.add(bytes);
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.userProfilePk_ = codedInputStream.readUInt64();
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

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationRequestOrBuilder
        public ProtocolStringList getSessionIdList() {
            return this.sessionId_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetLastKnownLocationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetLastKnownLocationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLastKnownLocationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLastKnownLocationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetLastKnownLocationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetLastKnownLocationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetLastKnownLocationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetLastKnownLocationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetLastKnownLocationRequest parseFrom(InputStream inputStream) {
            return (GetLastKnownLocationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetLastKnownLocationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLastKnownLocationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLastKnownLocationRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetLastKnownLocationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetLastKnownLocationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLastKnownLocationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private GetLastKnownLocationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionId_ = LazyStringArrayList.emptyList();
            this.userProfilePk_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ GetLastKnownLocationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class GetLastKnownLocationResponse extends GeneratedMessageV3 implements GetLastKnownLocationResponseOrBuilder {
        public static final int CALL_INTERVAL_FIELD_NUMBER = 3;
        public static final int DIRTY_FIELD_NUMBER = 4;
        public static final int GROUP_TRACK_RESPONSE_FIELD_NUMBER = 1;
        public static final int TRACK_POINTS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int callInterval_;
        private boolean dirty_;
        private GroupTrackResponse groupTrackResponse_;
        private byte memoizedIsInitialized;
        private List<LiveConnectionTrackPoint> trackPoints_;
        private static final GetLastKnownLocationResponse DEFAULT_INSTANCE = new GetLastKnownLocationResponse();

        @Deprecated
        public static final Parser<GetLastKnownLocationResponse> PARSER = new AbstractParser<GetLastKnownLocationResponse>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponse.1
            @Override // com.google.protobuf.Parser
            public GetLastKnownLocationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetLastKnownLocationResponse.newBuilder();
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

        private GetLastKnownLocationResponse() {
            this.callInterval_ = 0;
            this.dirty_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.trackPoints_ = Collections.EMPTY_LIST;
        }

        public static GetLastKnownLocationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationResponse_descriptor;
        }

        public static Builder newBuilder(GetLastKnownLocationResponse getLastKnownLocationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getLastKnownLocationResponse);
        }

        public static GetLastKnownLocationResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetLastKnownLocationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetLastKnownLocationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetLastKnownLocationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetLastKnownLocationResponse)) {
                return super.equals(obj);
            }
            GetLastKnownLocationResponse getLastKnownLocationResponse = (GetLastKnownLocationResponse) obj;
            if (hasGroupTrackResponse() != getLastKnownLocationResponse.hasGroupTrackResponse()) {
                return false;
            }
            if ((hasGroupTrackResponse() && !getGroupTrackResponse().equals(getLastKnownLocationResponse.getGroupTrackResponse())) || !getTrackPointsList().equals(getLastKnownLocationResponse.getTrackPointsList()) || hasCallInterval() != getLastKnownLocationResponse.hasCallInterval()) {
                return false;
            }
            if ((!hasCallInterval() || getCallInterval() == getLastKnownLocationResponse.getCallInterval()) && hasDirty() == getLastKnownLocationResponse.hasDirty()) {
                return (!hasDirty() || getDirty() == getLastKnownLocationResponse.getDirty()) && getUnknownFields().equals(getLastKnownLocationResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public int getCallInterval() {
            return this.callInterval_;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public boolean getDirty() {
            return this.dirty_;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public GroupTrackResponse getGroupTrackResponse() {
            GroupTrackResponse groupTrackResponse = this.groupTrackResponse_;
            return groupTrackResponse == null ? GroupTrackResponse.getDefaultInstance() : groupTrackResponse;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public GroupTrackResponseOrBuilder getGroupTrackResponseOrBuilder() {
            GroupTrackResponse groupTrackResponse = this.groupTrackResponse_;
            return groupTrackResponse == null ? GroupTrackResponse.getDefaultInstance() : groupTrackResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetLastKnownLocationResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getGroupTrackResponse()) : 0;
            for (int i15 = 0; i15 < this.trackPoints_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.trackPoints_.get(i15));
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(3, this.callInterval_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(4, this.dirty_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public LiveConnectionTrackPoint getTrackPoints(int i14) {
            return this.trackPoints_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public int getTrackPointsCount() {
            return this.trackPoints_.size();
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public List<LiveConnectionTrackPoint> getTrackPointsList() {
            return this.trackPoints_;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public LiveConnectionTrackPointOrBuilder getTrackPointsOrBuilder(int i14) {
            return this.trackPoints_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public List<? extends LiveConnectionTrackPointOrBuilder> getTrackPointsOrBuilderList() {
            return this.trackPoints_;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public boolean hasCallInterval() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public boolean hasDirty() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
        public boolean hasGroupTrackResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGroupTrackResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGroupTrackResponse().hashCode();
            }
            if (getTrackPointsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTrackPointsList().hashCode();
            }
            if (hasCallInterval()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getCallInterval();
            }
            if (hasDirty()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getDirty());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLastKnownLocationResponse.class, Builder.class);
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
            if (!hasGroupTrackResponse()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getGroupTrackResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getTrackPointsCount(); i14++) {
                if (!getTrackPoints(i14).isInitialized()) {
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
            return new GetLastKnownLocationResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getGroupTrackResponse());
            }
            for (int i14 = 0; i14 < this.trackPoints_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.trackPoints_.get(i14));
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(3, this.callInterval_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(4, this.dirty_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetLastKnownLocationResponseOrBuilder {
            private int bitField0_;
            private int callInterval_;
            private boolean dirty_;
            private SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> groupTrackResponseBuilder_;
            private GroupTrackResponse groupTrackResponse_;
            private RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> trackPointsBuilder_;
            private List<LiveConnectionTrackPoint> trackPoints_;

            private Builder() {
                this.trackPoints_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GetLastKnownLocationResponse getLastKnownLocationResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                    getLastKnownLocationResponse.groupTrackResponse_ = singleFieldBuilderV3 == null ? this.groupTrackResponse_ : (GroupTrackResponse) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 4) != 0) {
                    getLastKnownLocationResponse.callInterval_ = this.callInterval_;
                    i14 |= 2;
                }
                if ((i15 & 8) != 0) {
                    getLastKnownLocationResponse.dirty_ = this.dirty_;
                    i14 |= 4;
                }
                getLastKnownLocationResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(GetLastKnownLocationResponse getLastKnownLocationResponse) {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    getLastKnownLocationResponse.trackPoints_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.trackPoints_ = Collections.unmodifiableList(this.trackPoints_);
                    this.bitField0_ &= -3;
                }
                getLastKnownLocationResponse.trackPoints_ = this.trackPoints_;
            }

            private void ensureTrackPointsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.trackPoints_ = new ArrayList(this.trackPoints_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationResponse_descriptor;
            }

            private SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> getGroupTrackResponseFieldBuilder() {
                if (this.groupTrackResponseBuilder_ == null) {
                    this.groupTrackResponseBuilder_ = new SingleFieldBuilderV3<>(getGroupTrackResponse(), getParentForChildren(), isClean());
                    this.groupTrackResponse_ = null;
                }
                return this.groupTrackResponseBuilder_;
            }

            private RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> getTrackPointsFieldBuilder() {
                if (this.trackPointsBuilder_ == null) {
                    this.trackPointsBuilder_ = new RepeatedFieldBuilderV3<>(this.trackPoints_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.trackPoints_ = null;
                }
                return this.trackPointsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getGroupTrackResponseFieldBuilder();
                    getTrackPointsFieldBuilder();
                }
            }

            public Builder addAllTrackPoints(Iterable<? extends LiveConnectionTrackPoint> iterable) {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureTrackPointsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.trackPoints_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addTrackPoints(LiveConnectionTrackPoint.Builder builder) {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureTrackPointsIsMutable();
                this.trackPoints_.add(builder.build());
                onChanged();
                return this;
            }

            public LiveConnectionTrackPoint.Builder addTrackPointsBuilder() {
                return (LiveConnectionTrackPoint.Builder) getTrackPointsFieldBuilder().addBuilder(LiveConnectionTrackPoint.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLastKnownLocationResponse build() {
                GetLastKnownLocationResponse getLastKnownLocationResponseBuildPartial = buildPartial();
                if (getLastKnownLocationResponseBuildPartial.isInitialized()) {
                    return getLastKnownLocationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getLastKnownLocationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLastKnownLocationResponse buildPartial() {
                GetLastKnownLocationResponse getLastKnownLocationResponse = new GetLastKnownLocationResponse(this);
                buildPartialRepeatedFields(getLastKnownLocationResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(getLastKnownLocationResponse);
                }
                onBuilt();
                return getLastKnownLocationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.groupTrackResponse_ = null;
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.groupTrackResponseBuilder_ = null;
                }
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.trackPoints_ = Collections.EMPTY_LIST;
                } else {
                    this.trackPoints_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                this.callInterval_ = 0;
                this.dirty_ = false;
                return this;
            }

            public Builder clearCallInterval() {
                this.bitField0_ &= -5;
                this.callInterval_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDirty() {
                this.bitField0_ &= -9;
                this.dirty_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGroupTrackResponse() {
                this.bitField0_ &= -2;
                this.groupTrackResponse_ = null;
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.groupTrackResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTrackPoints() {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.trackPoints_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public int getCallInterval() {
                return this.callInterval_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public boolean getDirty() {
                return this.dirty_;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public GroupTrackResponse getGroupTrackResponse() {
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GroupTrackResponse) singleFieldBuilderV3.getMessage();
                }
                GroupTrackResponse groupTrackResponse = this.groupTrackResponse_;
                return groupTrackResponse == null ? GroupTrackResponse.getDefaultInstance() : groupTrackResponse;
            }

            public GroupTrackResponse.Builder getGroupTrackResponseBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GroupTrackResponse.Builder) getGroupTrackResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public GroupTrackResponseOrBuilder getGroupTrackResponseOrBuilder() {
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GroupTrackResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GroupTrackResponse groupTrackResponse = this.groupTrackResponse_;
                return groupTrackResponse == null ? GroupTrackResponse.getDefaultInstance() : groupTrackResponse;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public LiveConnectionTrackPoint getTrackPoints(int i14) {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.trackPoints_.get(i14) : (LiveConnectionTrackPoint) repeatedFieldBuilderV3.getMessage(i14);
            }

            public LiveConnectionTrackPoint.Builder getTrackPointsBuilder(int i14) {
                return (LiveConnectionTrackPoint.Builder) getTrackPointsFieldBuilder().getBuilder(i14);
            }

            public List<LiveConnectionTrackPoint.Builder> getTrackPointsBuilderList() {
                return getTrackPointsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public int getTrackPointsCount() {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.trackPoints_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public List<LiveConnectionTrackPoint> getTrackPointsList() {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.trackPoints_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public LiveConnectionTrackPointOrBuilder getTrackPointsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.trackPoints_.get(i14) : (LiveConnectionTrackPointOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public List<? extends LiveConnectionTrackPointOrBuilder> getTrackPointsOrBuilderList() {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.trackPoints_);
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public boolean hasCallInterval() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public boolean hasDirty() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLastKnownLocationResponseOrBuilder
            public boolean hasGroupTrackResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLastKnownLocationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLastKnownLocationResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasGroupTrackResponse() || !getGroupTrackResponse().isInitialized()) {
                    return false;
                }
                for (int i14 = 0; i14 < getTrackPointsCount(); i14++) {
                    if (!getTrackPoints(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(GetLastKnownLocationResponse getLastKnownLocationResponse) {
                if (getLastKnownLocationResponse == GetLastKnownLocationResponse.getDefaultInstance()) {
                    return this;
                }
                if (getLastKnownLocationResponse.hasGroupTrackResponse()) {
                    mergeGroupTrackResponse(getLastKnownLocationResponse.getGroupTrackResponse());
                }
                if (this.trackPointsBuilder_ == null) {
                    if (!getLastKnownLocationResponse.trackPoints_.isEmpty()) {
                        if (this.trackPoints_.isEmpty()) {
                            this.trackPoints_ = getLastKnownLocationResponse.trackPoints_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureTrackPointsIsMutable();
                            this.trackPoints_.addAll(getLastKnownLocationResponse.trackPoints_);
                        }
                        onChanged();
                    }
                } else if (!getLastKnownLocationResponse.trackPoints_.isEmpty()) {
                    boolean zIsEmpty = this.trackPointsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.trackPointsBuilder_ = null;
                        this.trackPoints_ = getLastKnownLocationResponse.trackPoints_;
                        this.bitField0_ &= -3;
                        this.trackPointsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getTrackPointsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(getLastKnownLocationResponse.trackPoints_);
                    }
                }
                if (getLastKnownLocationResponse.hasCallInterval()) {
                    setCallInterval(getLastKnownLocationResponse.getCallInterval());
                }
                if (getLastKnownLocationResponse.hasDirty()) {
                    setDirty(getLastKnownLocationResponse.getDirty());
                }
                mergeUnknownFields(getLastKnownLocationResponse.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder mergeGroupTrackResponse(GroupTrackResponse groupTrackResponse) {
                GroupTrackResponse groupTrackResponse2;
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(groupTrackResponse);
                } else if ((this.bitField0_ & 1) == 0 || (groupTrackResponse2 = this.groupTrackResponse_) == null || groupTrackResponse2 == GroupTrackResponse.getDefaultInstance()) {
                    this.groupTrackResponse_ = groupTrackResponse;
                } else {
                    getGroupTrackResponseBuilder().mergeFrom(groupTrackResponse);
                }
                if (this.groupTrackResponse_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeTrackPoints(int i14) {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureTrackPointsIsMutable();
                this.trackPoints_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setCallInterval(int i14) {
                this.callInterval_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDirty(boolean z14) {
                this.dirty_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGroupTrackResponse(GroupTrackResponse.Builder builder) {
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.groupTrackResponse_ = builder.build();
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

            public Builder setTrackPoints(int i14, LiveConnectionTrackPoint.Builder builder) {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureTrackPointsIsMutable();
                this.trackPoints_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetLastKnownLocationResponse getDefaultInstanceForType() {
                return GetLastKnownLocationResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.trackPoints_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public LiveConnectionTrackPoint.Builder addTrackPointsBuilder(int i14) {
                return (LiveConnectionTrackPoint.Builder) getTrackPointsFieldBuilder().addBuilder(i14, LiveConnectionTrackPoint.getDefaultInstance());
            }

            public Builder addTrackPoints(int i14, LiveConnectionTrackPoint liveConnectionTrackPoint) {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    liveConnectionTrackPoint.getClass();
                    ensureTrackPointsIsMutable();
                    this.trackPoints_.add(i14, liveConnectionTrackPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, liveConnectionTrackPoint);
                return this;
            }

            public Builder setGroupTrackResponse(GroupTrackResponse groupTrackResponse) {
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    groupTrackResponse.getClass();
                    this.groupTrackResponse_ = groupTrackResponse;
                } else {
                    singleFieldBuilderV3.setMessage(groupTrackResponse);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrackPoints(int i14, LiveConnectionTrackPoint liveConnectionTrackPoint) {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    liveConnectionTrackPoint.getClass();
                    ensureTrackPointsIsMutable();
                    this.trackPoints_.set(i14, liveConnectionTrackPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, liveConnectionTrackPoint);
                return this;
            }

            public Builder addTrackPoints(LiveConnectionTrackPoint liveConnectionTrackPoint) {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    liveConnectionTrackPoint.getClass();
                    ensureTrackPointsIsMutable();
                    this.trackPoints_.add(liveConnectionTrackPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(liveConnectionTrackPoint);
                return this;
            }

            public Builder addTrackPoints(int i14, LiveConnectionTrackPoint.Builder builder) {
                RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureTrackPointsIsMutable();
                    this.trackPoints_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetLastKnownLocationResponse) {
                    return mergeFrom((GetLastKnownLocationResponse) message);
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
                                    codedInputStream.readMessage(getGroupTrackResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    LiveConnectionTrackPoint liveConnectionTrackPoint = (LiveConnectionTrackPoint) codedInputStream.readMessage(LiveConnectionTrackPoint.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureTrackPointsIsMutable();
                                        this.trackPoints_.add(liveConnectionTrackPoint);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(liveConnectionTrackPoint);
                                    }
                                } else if (tag == 24) {
                                    this.callInterval_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.dirty_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
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
        public GetLastKnownLocationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetLastKnownLocationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLastKnownLocationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLastKnownLocationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetLastKnownLocationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetLastKnownLocationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetLastKnownLocationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetLastKnownLocationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetLastKnownLocationResponse parseFrom(InputStream inputStream) {
            return (GetLastKnownLocationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private GetLastKnownLocationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.callInterval_ = 0;
            this.dirty_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetLastKnownLocationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLastKnownLocationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLastKnownLocationResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetLastKnownLocationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ GetLastKnownLocationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetLastKnownLocationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLastKnownLocationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetLiveTrackConnectionsRequest extends GeneratedMessageV3 implements GetLiveTrackConnectionsRequestOrBuilder {
        public static final int ACTIVITY_TYPE_FIELD_NUMBER = 3;
        public static final int POSITION_FIELD_NUMBER = 1;
        public static final int RADIUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<Integer> activityType_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private GDIDataTypes.ScPoint position_;
        private int radius_;
        private static final Internal.ListAdapter.Converter<Integer, FitnessPointData.ActivityType> activityType_converter_ = new Internal.ListAdapter.Converter<Integer, FitnessPointData.ActivityType>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequest.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public FitnessPointData.ActivityType convert(Integer num) {
                FitnessPointData.ActivityType activityTypeForNumber = FitnessPointData.ActivityType.forNumber(num.intValue());
                return activityTypeForNumber == null ? FitnessPointData.ActivityType.CYCLING : activityTypeForNumber;
            }
        };
        private static final GetLiveTrackConnectionsRequest DEFAULT_INSTANCE = new GetLiveTrackConnectionsRequest();

        @Deprecated
        public static final Parser<GetLiveTrackConnectionsRequest> PARSER = new AbstractParser<GetLiveTrackConnectionsRequest>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequest.2
            @Override // com.google.protobuf.Parser
            public GetLiveTrackConnectionsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetLiveTrackConnectionsRequest.newBuilder();
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

        private GetLiveTrackConnectionsRequest() {
            this.radius_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.activityType_ = Collections.EMPTY_LIST;
        }

        public static GetLiveTrackConnectionsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsRequest_descriptor;
        }

        public static Builder newBuilder(GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getLiveTrackConnectionsRequest);
        }

        public static GetLiveTrackConnectionsRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetLiveTrackConnectionsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetLiveTrackConnectionsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetLiveTrackConnectionsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetLiveTrackConnectionsRequest)) {
                return super.equals(obj);
            }
            GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest = (GetLiveTrackConnectionsRequest) obj;
            if (hasPosition() != getLiveTrackConnectionsRequest.hasPosition()) {
                return false;
            }
            if ((!hasPosition() || getPosition().equals(getLiveTrackConnectionsRequest.getPosition())) && hasRadius() == getLiveTrackConnectionsRequest.hasRadius()) {
                return (!hasRadius() || getRadius() == getLiveTrackConnectionsRequest.getRadius()) && this.activityType_.equals(getLiveTrackConnectionsRequest.activityType_) && getUnknownFields().equals(getLiveTrackConnectionsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
        public FitnessPointData.ActivityType getActivityType(int i14) {
            return activityType_converter_.convert(this.activityType_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
        public int getActivityTypeCount() {
            return this.activityType_.size();
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
        public List<FitnessPointData.ActivityType> getActivityTypeList() {
            return new Internal.ListAdapter(this.activityType_, activityType_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetLiveTrackConnectionsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
        public GDIDataTypes.ScPoint getPosition() {
            GDIDataTypes.ScPoint scPoint = this.position_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
        public GDIDataTypes.ScPointOrBuilder getPositionOrBuilder() {
            GDIDataTypes.ScPoint scPoint = this.position_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
        public int getRadius() {
            return this.radius_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPosition()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.radius_);
            }
            int iA = 0;
            while (true) {
                int size = this.activityType_.size();
                List<Integer> list = this.activityType_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iComputeMessageSize + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
        public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
        public boolean hasRadius() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasRadius()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getRadius();
            }
            if (getActivityTypeCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.activityType_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveTrackConnectionsRequest.class, Builder.class);
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
            if (!hasPosition() || getPosition().isInitialized()) {
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
            return new GetLiveTrackConnectionsRequest();
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
                codedOutputStream.writeUInt32(2, this.radius_);
            }
            int iF = 0;
            while (iF < this.activityType_.size()) {
                iF = f3.f(this.activityType_.get(iF), codedOutputStream, 3, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetLiveTrackConnectionsRequestOrBuilder {
            private List<Integer> activityType_;
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> positionBuilder_;
            private GDIDataTypes.ScPoint position_;
            private int radius_;

            private Builder() {
                this.activityType_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                    getLiveTrackConnectionsRequest.position_ = singleFieldBuilderV3 == null ? this.position_ : (GDIDataTypes.ScPoint) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    getLiveTrackConnectionsRequest.radius_ = this.radius_;
                    i14 |= 2;
                }
                getLiveTrackConnectionsRequest.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest) {
                if ((this.bitField0_ & 4) != 0) {
                    this.activityType_ = Collections.unmodifiableList(this.activityType_);
                    this.bitField0_ &= -5;
                }
                getLiveTrackConnectionsRequest.activityType_ = this.activityType_;
            }

            private void ensureActivityTypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.activityType_ = new ArrayList(this.activityType_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsRequest_descriptor;
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

            public Builder addActivityType(FitnessPointData.ActivityType activityType) {
                activityType.getClass();
                ensureActivityTypeIsMutable();
                this.activityType_.add(Integer.valueOf(activityType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addAllActivityType(Iterable<? extends FitnessPointData.ActivityType> iterable) {
                ensureActivityTypeIsMutable();
                Iterator<? extends FitnessPointData.ActivityType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.activityType_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLiveTrackConnectionsRequest build() {
                GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequestBuildPartial = buildPartial();
                if (getLiveTrackConnectionsRequestBuildPartial.isInitialized()) {
                    return getLiveTrackConnectionsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getLiveTrackConnectionsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLiveTrackConnectionsRequest buildPartial() {
                GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest = new GetLiveTrackConnectionsRequest(this);
                buildPartialRepeatedFields(getLiveTrackConnectionsRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(getLiveTrackConnectionsRequest);
                }
                onBuilt();
                return getLiveTrackConnectionsRequest;
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
                this.radius_ = 0;
                this.activityType_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                return this;
            }

            public Builder clearActivityType() {
                this.activityType_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
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

            public Builder clearRadius() {
                this.bitField0_ &= -3;
                this.radius_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
            public FitnessPointData.ActivityType getActivityType(int i14) {
                return (FitnessPointData.ActivityType) GetLiveTrackConnectionsRequest.activityType_converter_.convert(this.activityType_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
            public int getActivityTypeCount() {
                return this.activityType_.size();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
            public List<FitnessPointData.ActivityType> getActivityTypeList() {
                return new Internal.ListAdapter(this.activityType_, GetLiveTrackConnectionsRequest.activityType_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
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

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
            public GDIDataTypes.ScPointOrBuilder getPositionOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.ScPoint scPoint = this.position_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
            public int getRadius() {
                return this.radius_;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
            public boolean hasPosition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsRequestOrBuilder
            public boolean hasRadius() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveTrackConnectionsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasPosition() || getPosition().isInitialized();
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
                                    this.radius_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (FitnessPointData.ActivityType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        ensureActivityTypeIsMutable();
                                        this.activityType_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 26) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (FitnessPointData.ActivityType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(3, i15);
                                        } else {
                                            ensureActivityTypeIsMutable();
                                            this.activityType_.add(Integer.valueOf(i15));
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

            public Builder setActivityType(int i14, FitnessPointData.ActivityType activityType) {
                activityType.getClass();
                ensureActivityTypeIsMutable();
                this.activityType_.set(i14, Integer.valueOf(activityType.getNumber()));
                onChanged();
                return this;
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

            public Builder setRadius(int i14) {
                this.radius_ = i14;
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
            public GetLiveTrackConnectionsRequest getDefaultInstanceForType() {
                return GetLiveTrackConnectionsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.activityType_ = Collections.EMPTY_LIST;
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
                if (message instanceof GetLiveTrackConnectionsRequest) {
                    return mergeFrom((GetLiveTrackConnectionsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest) {
                if (getLiveTrackConnectionsRequest == GetLiveTrackConnectionsRequest.getDefaultInstance()) {
                    return this;
                }
                if (getLiveTrackConnectionsRequest.hasPosition()) {
                    mergePosition(getLiveTrackConnectionsRequest.getPosition());
                }
                if (getLiveTrackConnectionsRequest.hasRadius()) {
                    setRadius(getLiveTrackConnectionsRequest.getRadius());
                }
                if (!getLiveTrackConnectionsRequest.activityType_.isEmpty()) {
                    if (this.activityType_.isEmpty()) {
                        this.activityType_ = getLiveTrackConnectionsRequest.activityType_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureActivityTypeIsMutable();
                        this.activityType_.addAll(getLiveTrackConnectionsRequest.activityType_);
                    }
                    onChanged();
                }
                mergeUnknownFields(getLiveTrackConnectionsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetLiveTrackConnectionsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetLiveTrackConnectionsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackConnectionsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLiveTrackConnectionsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetLiveTrackConnectionsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetLiveTrackConnectionsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetLiveTrackConnectionsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetLiveTrackConnectionsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private GetLiveTrackConnectionsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.radius_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetLiveTrackConnectionsRequest parseFrom(InputStream inputStream) {
            return (GetLiveTrackConnectionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetLiveTrackConnectionsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackConnectionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ GetLiveTrackConnectionsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetLiveTrackConnectionsRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetLiveTrackConnectionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetLiveTrackConnectionsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackConnectionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetLiveTrackConnectionsResponse extends GeneratedMessageV3 implements GetLiveTrackConnectionsResponseOrBuilder {
        public static final int CALL_INTERVAL_FIELD_NUMBER = 3;
        public static final int GROUP_TRACK_RESPONSE_FIELD_NUMBER = 1;
        public static final int TRACK_POINTS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int callInterval_;
        private GroupTrackResponse groupTrackResponse_;
        private byte memoizedIsInitialized;
        private List<LiveConnectionUserTrackPoint> trackPoints_;
        private static final GetLiveTrackConnectionsResponse DEFAULT_INSTANCE = new GetLiveTrackConnectionsResponse();

        @Deprecated
        public static final Parser<GetLiveTrackConnectionsResponse> PARSER = new AbstractParser<GetLiveTrackConnectionsResponse>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponse.1
            @Override // com.google.protobuf.Parser
            public GetLiveTrackConnectionsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetLiveTrackConnectionsResponse.newBuilder();
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

        private GetLiveTrackConnectionsResponse() {
            this.callInterval_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.trackPoints_ = Collections.EMPTY_LIST;
        }

        public static GetLiveTrackConnectionsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsResponse_descriptor;
        }

        public static Builder newBuilder(GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getLiveTrackConnectionsResponse);
        }

        public static GetLiveTrackConnectionsResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetLiveTrackConnectionsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetLiveTrackConnectionsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetLiveTrackConnectionsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetLiveTrackConnectionsResponse)) {
                return super.equals(obj);
            }
            GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse = (GetLiveTrackConnectionsResponse) obj;
            if (hasGroupTrackResponse() != getLiveTrackConnectionsResponse.hasGroupTrackResponse()) {
                return false;
            }
            if ((!hasGroupTrackResponse() || getGroupTrackResponse().equals(getLiveTrackConnectionsResponse.getGroupTrackResponse())) && getTrackPointsList().equals(getLiveTrackConnectionsResponse.getTrackPointsList()) && hasCallInterval() == getLiveTrackConnectionsResponse.hasCallInterval()) {
                return (!hasCallInterval() || getCallInterval() == getLiveTrackConnectionsResponse.getCallInterval()) && getUnknownFields().equals(getLiveTrackConnectionsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
        public int getCallInterval() {
            return this.callInterval_;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
        public GroupTrackResponse getGroupTrackResponse() {
            GroupTrackResponse groupTrackResponse = this.groupTrackResponse_;
            return groupTrackResponse == null ? GroupTrackResponse.getDefaultInstance() : groupTrackResponse;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
        public GroupTrackResponseOrBuilder getGroupTrackResponseOrBuilder() {
            GroupTrackResponse groupTrackResponse = this.groupTrackResponse_;
            return groupTrackResponse == null ? GroupTrackResponse.getDefaultInstance() : groupTrackResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetLiveTrackConnectionsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getGroupTrackResponse()) : 0;
            for (int i15 = 0; i15 < this.trackPoints_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.trackPoints_.get(i15));
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(3, this.callInterval_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
        public LiveConnectionUserTrackPoint getTrackPoints(int i14) {
            return this.trackPoints_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
        public int getTrackPointsCount() {
            return this.trackPoints_.size();
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
        public List<LiveConnectionUserTrackPoint> getTrackPointsList() {
            return this.trackPoints_;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
        public LiveConnectionUserTrackPointOrBuilder getTrackPointsOrBuilder(int i14) {
            return this.trackPoints_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
        public List<? extends LiveConnectionUserTrackPointOrBuilder> getTrackPointsOrBuilderList() {
            return this.trackPoints_;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
        public boolean hasCallInterval() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
        public boolean hasGroupTrackResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGroupTrackResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGroupTrackResponse().hashCode();
            }
            if (getTrackPointsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTrackPointsList().hashCode();
            }
            if (hasCallInterval()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getCallInterval();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveTrackConnectionsResponse.class, Builder.class);
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
            if (!hasGroupTrackResponse()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getGroupTrackResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getTrackPointsCount(); i14++) {
                if (!getTrackPoints(i14).isInitialized()) {
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
            return new GetLiveTrackConnectionsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getGroupTrackResponse());
            }
            for (int i14 = 0; i14 < this.trackPoints_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.trackPoints_.get(i14));
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(3, this.callInterval_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetLiveTrackConnectionsResponseOrBuilder {
            private int bitField0_;
            private int callInterval_;
            private SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> groupTrackResponseBuilder_;
            private GroupTrackResponse groupTrackResponse_;
            private RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> trackPointsBuilder_;
            private List<LiveConnectionUserTrackPoint> trackPoints_;

            private Builder() {
                this.trackPoints_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                    getLiveTrackConnectionsResponse.groupTrackResponse_ = singleFieldBuilderV3 == null ? this.groupTrackResponse_ : (GroupTrackResponse) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 4) != 0) {
                    getLiveTrackConnectionsResponse.callInterval_ = this.callInterval_;
                    i14 |= 2;
                }
                getLiveTrackConnectionsResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse) {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    getLiveTrackConnectionsResponse.trackPoints_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.trackPoints_ = Collections.unmodifiableList(this.trackPoints_);
                    this.bitField0_ &= -3;
                }
                getLiveTrackConnectionsResponse.trackPoints_ = this.trackPoints_;
            }

            private void ensureTrackPointsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.trackPoints_ = new ArrayList(this.trackPoints_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsResponse_descriptor;
            }

            private SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> getGroupTrackResponseFieldBuilder() {
                if (this.groupTrackResponseBuilder_ == null) {
                    this.groupTrackResponseBuilder_ = new SingleFieldBuilderV3<>(getGroupTrackResponse(), getParentForChildren(), isClean());
                    this.groupTrackResponse_ = null;
                }
                return this.groupTrackResponseBuilder_;
            }

            private RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> getTrackPointsFieldBuilder() {
                if (this.trackPointsBuilder_ == null) {
                    this.trackPointsBuilder_ = new RepeatedFieldBuilderV3<>(this.trackPoints_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.trackPoints_ = null;
                }
                return this.trackPointsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getGroupTrackResponseFieldBuilder();
                    getTrackPointsFieldBuilder();
                }
            }

            public Builder addAllTrackPoints(Iterable<? extends LiveConnectionUserTrackPoint> iterable) {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureTrackPointsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.trackPoints_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addTrackPoints(LiveConnectionUserTrackPoint.Builder builder) {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureTrackPointsIsMutable();
                this.trackPoints_.add(builder.build());
                onChanged();
                return this;
            }

            public LiveConnectionUserTrackPoint.Builder addTrackPointsBuilder() {
                return (LiveConnectionUserTrackPoint.Builder) getTrackPointsFieldBuilder().addBuilder(LiveConnectionUserTrackPoint.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLiveTrackConnectionsResponse build() {
                GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponseBuildPartial = buildPartial();
                if (getLiveTrackConnectionsResponseBuildPartial.isInitialized()) {
                    return getLiveTrackConnectionsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getLiveTrackConnectionsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLiveTrackConnectionsResponse buildPartial() {
                GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse = new GetLiveTrackConnectionsResponse(this);
                buildPartialRepeatedFields(getLiveTrackConnectionsResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(getLiveTrackConnectionsResponse);
                }
                onBuilt();
                return getLiveTrackConnectionsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.groupTrackResponse_ = null;
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.groupTrackResponseBuilder_ = null;
                }
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.trackPoints_ = Collections.EMPTY_LIST;
                } else {
                    this.trackPoints_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                this.callInterval_ = 0;
                return this;
            }

            public Builder clearCallInterval() {
                this.bitField0_ &= -5;
                this.callInterval_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGroupTrackResponse() {
                this.bitField0_ &= -2;
                this.groupTrackResponse_ = null;
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.groupTrackResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTrackPoints() {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.trackPoints_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
            public int getCallInterval() {
                return this.callInterval_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
            public GroupTrackResponse getGroupTrackResponse() {
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GroupTrackResponse) singleFieldBuilderV3.getMessage();
                }
                GroupTrackResponse groupTrackResponse = this.groupTrackResponse_;
                return groupTrackResponse == null ? GroupTrackResponse.getDefaultInstance() : groupTrackResponse;
            }

            public GroupTrackResponse.Builder getGroupTrackResponseBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GroupTrackResponse.Builder) getGroupTrackResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
            public GroupTrackResponseOrBuilder getGroupTrackResponseOrBuilder() {
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GroupTrackResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GroupTrackResponse groupTrackResponse = this.groupTrackResponse_;
                return groupTrackResponse == null ? GroupTrackResponse.getDefaultInstance() : groupTrackResponse;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
            public LiveConnectionUserTrackPoint getTrackPoints(int i14) {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.trackPoints_.get(i14) : (LiveConnectionUserTrackPoint) repeatedFieldBuilderV3.getMessage(i14);
            }

            public LiveConnectionUserTrackPoint.Builder getTrackPointsBuilder(int i14) {
                return (LiveConnectionUserTrackPoint.Builder) getTrackPointsFieldBuilder().getBuilder(i14);
            }

            public List<LiveConnectionUserTrackPoint.Builder> getTrackPointsBuilderList() {
                return getTrackPointsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
            public int getTrackPointsCount() {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.trackPoints_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
            public List<LiveConnectionUserTrackPoint> getTrackPointsList() {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.trackPoints_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
            public LiveConnectionUserTrackPointOrBuilder getTrackPointsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.trackPoints_.get(i14) : (LiveConnectionUserTrackPointOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
            public List<? extends LiveConnectionUserTrackPointOrBuilder> getTrackPointsOrBuilderList() {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.trackPoints_);
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
            public boolean hasCallInterval() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GetLiveTrackConnectionsResponseOrBuilder
            public boolean hasGroupTrackResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GetLiveTrackConnectionsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveTrackConnectionsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasGroupTrackResponse() || !getGroupTrackResponse().isInitialized()) {
                    return false;
                }
                for (int i14 = 0; i14 < getTrackPointsCount(); i14++) {
                    if (!getTrackPoints(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse) {
                if (getLiveTrackConnectionsResponse == GetLiveTrackConnectionsResponse.getDefaultInstance()) {
                    return this;
                }
                if (getLiveTrackConnectionsResponse.hasGroupTrackResponse()) {
                    mergeGroupTrackResponse(getLiveTrackConnectionsResponse.getGroupTrackResponse());
                }
                if (this.trackPointsBuilder_ == null) {
                    if (!getLiveTrackConnectionsResponse.trackPoints_.isEmpty()) {
                        if (this.trackPoints_.isEmpty()) {
                            this.trackPoints_ = getLiveTrackConnectionsResponse.trackPoints_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureTrackPointsIsMutable();
                            this.trackPoints_.addAll(getLiveTrackConnectionsResponse.trackPoints_);
                        }
                        onChanged();
                    }
                } else if (!getLiveTrackConnectionsResponse.trackPoints_.isEmpty()) {
                    boolean zIsEmpty = this.trackPointsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.trackPointsBuilder_ = null;
                        this.trackPoints_ = getLiveTrackConnectionsResponse.trackPoints_;
                        this.bitField0_ &= -3;
                        this.trackPointsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getTrackPointsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(getLiveTrackConnectionsResponse.trackPoints_);
                    }
                }
                if (getLiveTrackConnectionsResponse.hasCallInterval()) {
                    setCallInterval(getLiveTrackConnectionsResponse.getCallInterval());
                }
                mergeUnknownFields(getLiveTrackConnectionsResponse.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder mergeGroupTrackResponse(GroupTrackResponse groupTrackResponse) {
                GroupTrackResponse groupTrackResponse2;
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(groupTrackResponse);
                } else if ((this.bitField0_ & 1) == 0 || (groupTrackResponse2 = this.groupTrackResponse_) == null || groupTrackResponse2 == GroupTrackResponse.getDefaultInstance()) {
                    this.groupTrackResponse_ = groupTrackResponse;
                } else {
                    getGroupTrackResponseBuilder().mergeFrom(groupTrackResponse);
                }
                if (this.groupTrackResponse_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeTrackPoints(int i14) {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureTrackPointsIsMutable();
                this.trackPoints_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setCallInterval(int i14) {
                this.callInterval_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGroupTrackResponse(GroupTrackResponse.Builder builder) {
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.groupTrackResponse_ = builder.build();
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

            public Builder setTrackPoints(int i14, LiveConnectionUserTrackPoint.Builder builder) {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureTrackPointsIsMutable();
                this.trackPoints_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetLiveTrackConnectionsResponse getDefaultInstanceForType() {
                return GetLiveTrackConnectionsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.trackPoints_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public LiveConnectionUserTrackPoint.Builder addTrackPointsBuilder(int i14) {
                return (LiveConnectionUserTrackPoint.Builder) getTrackPointsFieldBuilder().addBuilder(i14, LiveConnectionUserTrackPoint.getDefaultInstance());
            }

            public Builder addTrackPoints(int i14, LiveConnectionUserTrackPoint liveConnectionUserTrackPoint) {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    liveConnectionUserTrackPoint.getClass();
                    ensureTrackPointsIsMutable();
                    this.trackPoints_.add(i14, liveConnectionUserTrackPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, liveConnectionUserTrackPoint);
                return this;
            }

            public Builder setGroupTrackResponse(GroupTrackResponse groupTrackResponse) {
                SingleFieldBuilderV3<GroupTrackResponse, GroupTrackResponse.Builder, GroupTrackResponseOrBuilder> singleFieldBuilderV3 = this.groupTrackResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    groupTrackResponse.getClass();
                    this.groupTrackResponse_ = groupTrackResponse;
                } else {
                    singleFieldBuilderV3.setMessage(groupTrackResponse);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrackPoints(int i14, LiveConnectionUserTrackPoint liveConnectionUserTrackPoint) {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    liveConnectionUserTrackPoint.getClass();
                    ensureTrackPointsIsMutable();
                    this.trackPoints_.set(i14, liveConnectionUserTrackPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, liveConnectionUserTrackPoint);
                return this;
            }

            public Builder addTrackPoints(LiveConnectionUserTrackPoint liveConnectionUserTrackPoint) {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    liveConnectionUserTrackPoint.getClass();
                    ensureTrackPointsIsMutable();
                    this.trackPoints_.add(liveConnectionUserTrackPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(liveConnectionUserTrackPoint);
                return this;
            }

            public Builder addTrackPoints(int i14, LiveConnectionUserTrackPoint.Builder builder) {
                RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureTrackPointsIsMutable();
                    this.trackPoints_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetLiveTrackConnectionsResponse) {
                    return mergeFrom((GetLiveTrackConnectionsResponse) message);
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
                                    codedInputStream.readMessage(getGroupTrackResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    LiveConnectionUserTrackPoint liveConnectionUserTrackPoint = (LiveConnectionUserTrackPoint) codedInputStream.readMessage(LiveConnectionUserTrackPoint.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<LiveConnectionUserTrackPoint, LiveConnectionUserTrackPoint.Builder, LiveConnectionUserTrackPointOrBuilder> repeatedFieldBuilderV3 = this.trackPointsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureTrackPointsIsMutable();
                                        this.trackPoints_.add(liveConnectionUserTrackPoint);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(liveConnectionUserTrackPoint);
                                    }
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.callInterval_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
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
        public GetLiveTrackConnectionsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetLiveTrackConnectionsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackConnectionsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLiveTrackConnectionsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetLiveTrackConnectionsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetLiveTrackConnectionsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetLiveTrackConnectionsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetLiveTrackConnectionsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private GetLiveTrackConnectionsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.callInterval_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetLiveTrackConnectionsResponse parseFrom(InputStream inputStream) {
            return (GetLiveTrackConnectionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetLiveTrackConnectionsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackConnectionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ GetLiveTrackConnectionsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetLiveTrackConnectionsResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetLiveTrackConnectionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetLiveTrackConnectionsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackConnectionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GroupLiveTrackService extends GeneratedMessageV3 implements GroupLiveTrackServiceOrBuilder {
        public static final int GET_LAST_KNOWN_LOCATION_REQUEST_FIELD_NUMBER = 3;
        public static final int GET_LAST_KNOWN_LOCATION_RESPONSE_FIELD_NUMBER = 4;
        public static final int GET_LIVE_TRACK_CONNECTIONS_REQUEST_FIELD_NUMBER = 1;
        public static final int GET_LIVE_TRACK_CONNECTIONS_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GetLastKnownLocationRequest getLastKnownLocationRequest_;
        private GetLastKnownLocationResponse getLastKnownLocationResponse_;
        private GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest_;
        private GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse_;
        private byte memoizedIsInitialized;
        private static final GroupLiveTrackService DEFAULT_INSTANCE = new GroupLiveTrackService();

        @Deprecated
        public static final Parser<GroupLiveTrackService> PARSER = new AbstractParser<GroupLiveTrackService>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackService.1
            @Override // com.google.protobuf.Parser
            public GroupLiveTrackService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GroupLiveTrackService.newBuilder();
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

        private GroupLiveTrackService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GroupLiveTrackService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GroupLiveTrackService_descriptor;
        }

        public static Builder newBuilder(GroupLiveTrackService groupLiveTrackService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(groupLiveTrackService);
        }

        public static GroupLiveTrackService parseDelimitedFrom(InputStream inputStream) {
            return (GroupLiveTrackService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GroupLiveTrackService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GroupLiveTrackService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GroupLiveTrackService)) {
                return super.equals(obj);
            }
            GroupLiveTrackService groupLiveTrackService = (GroupLiveTrackService) obj;
            if (hasGetLiveTrackConnectionsRequest() != groupLiveTrackService.hasGetLiveTrackConnectionsRequest()) {
                return false;
            }
            if ((hasGetLiveTrackConnectionsRequest() && !getGetLiveTrackConnectionsRequest().equals(groupLiveTrackService.getGetLiveTrackConnectionsRequest())) || hasGetLiveTrackConnectionsResponse() != groupLiveTrackService.hasGetLiveTrackConnectionsResponse()) {
                return false;
            }
            if ((hasGetLiveTrackConnectionsResponse() && !getGetLiveTrackConnectionsResponse().equals(groupLiveTrackService.getGetLiveTrackConnectionsResponse())) || hasGetLastKnownLocationRequest() != groupLiveTrackService.hasGetLastKnownLocationRequest()) {
                return false;
            }
            if ((!hasGetLastKnownLocationRequest() || getGetLastKnownLocationRequest().equals(groupLiveTrackService.getGetLastKnownLocationRequest())) && hasGetLastKnownLocationResponse() == groupLiveTrackService.hasGetLastKnownLocationResponse()) {
                return (!hasGetLastKnownLocationResponse() || getGetLastKnownLocationResponse().equals(groupLiveTrackService.getGetLastKnownLocationResponse())) && getUnknownFields().equals(groupLiveTrackService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public GetLastKnownLocationRequest getGetLastKnownLocationRequest() {
            GetLastKnownLocationRequest getLastKnownLocationRequest = this.getLastKnownLocationRequest_;
            return getLastKnownLocationRequest == null ? GetLastKnownLocationRequest.getDefaultInstance() : getLastKnownLocationRequest;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public GetLastKnownLocationRequestOrBuilder getGetLastKnownLocationRequestOrBuilder() {
            GetLastKnownLocationRequest getLastKnownLocationRequest = this.getLastKnownLocationRequest_;
            return getLastKnownLocationRequest == null ? GetLastKnownLocationRequest.getDefaultInstance() : getLastKnownLocationRequest;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public GetLastKnownLocationResponse getGetLastKnownLocationResponse() {
            GetLastKnownLocationResponse getLastKnownLocationResponse = this.getLastKnownLocationResponse_;
            return getLastKnownLocationResponse == null ? GetLastKnownLocationResponse.getDefaultInstance() : getLastKnownLocationResponse;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public GetLastKnownLocationResponseOrBuilder getGetLastKnownLocationResponseOrBuilder() {
            GetLastKnownLocationResponse getLastKnownLocationResponse = this.getLastKnownLocationResponse_;
            return getLastKnownLocationResponse == null ? GetLastKnownLocationResponse.getDefaultInstance() : getLastKnownLocationResponse;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public GetLiveTrackConnectionsRequest getGetLiveTrackConnectionsRequest() {
            GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest = this.getLiveTrackConnectionsRequest_;
            return getLiveTrackConnectionsRequest == null ? GetLiveTrackConnectionsRequest.getDefaultInstance() : getLiveTrackConnectionsRequest;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public GetLiveTrackConnectionsRequestOrBuilder getGetLiveTrackConnectionsRequestOrBuilder() {
            GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest = this.getLiveTrackConnectionsRequest_;
            return getLiveTrackConnectionsRequest == null ? GetLiveTrackConnectionsRequest.getDefaultInstance() : getLiveTrackConnectionsRequest;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public GetLiveTrackConnectionsResponse getGetLiveTrackConnectionsResponse() {
            GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse = this.getLiveTrackConnectionsResponse_;
            return getLiveTrackConnectionsResponse == null ? GetLiveTrackConnectionsResponse.getDefaultInstance() : getLiveTrackConnectionsResponse;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public GetLiveTrackConnectionsResponseOrBuilder getGetLiveTrackConnectionsResponseOrBuilder() {
            GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse = this.getLiveTrackConnectionsResponse_;
            return getLiveTrackConnectionsResponse == null ? GetLiveTrackConnectionsResponse.getDefaultInstance() : getLiveTrackConnectionsResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GroupLiveTrackService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getGetLiveTrackConnectionsRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getGetLiveTrackConnectionsResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getGetLastKnownLocationRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getGetLastKnownLocationResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public boolean hasGetLastKnownLocationRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public boolean hasGetLastKnownLocationResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public boolean hasGetLiveTrackConnectionsRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
        public boolean hasGetLiveTrackConnectionsResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGetLiveTrackConnectionsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGetLiveTrackConnectionsRequest().hashCode();
            }
            if (hasGetLiveTrackConnectionsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getGetLiveTrackConnectionsResponse().hashCode();
            }
            if (hasGetLastKnownLocationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getGetLastKnownLocationRequest().hashCode();
            }
            if (hasGetLastKnownLocationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getGetLastKnownLocationResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GroupLiveTrackService_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupLiveTrackService.class, Builder.class);
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
            if (hasGetLiveTrackConnectionsRequest() && !getGetLiveTrackConnectionsRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGetLiveTrackConnectionsResponse() && !getGetLiveTrackConnectionsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasGetLastKnownLocationResponse() || getGetLastKnownLocationResponse().isInitialized()) {
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
            return new GroupLiveTrackService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getGetLiveTrackConnectionsRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getGetLiveTrackConnectionsResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getGetLastKnownLocationRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getGetLastKnownLocationResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GroupLiveTrackServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GetLastKnownLocationRequest, GetLastKnownLocationRequest.Builder, GetLastKnownLocationRequestOrBuilder> getLastKnownLocationRequestBuilder_;
            private GetLastKnownLocationRequest getLastKnownLocationRequest_;
            private SingleFieldBuilderV3<GetLastKnownLocationResponse, GetLastKnownLocationResponse.Builder, GetLastKnownLocationResponseOrBuilder> getLastKnownLocationResponseBuilder_;
            private GetLastKnownLocationResponse getLastKnownLocationResponse_;
            private SingleFieldBuilderV3<GetLiveTrackConnectionsRequest, GetLiveTrackConnectionsRequest.Builder, GetLiveTrackConnectionsRequestOrBuilder> getLiveTrackConnectionsRequestBuilder_;
            private GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest_;
            private SingleFieldBuilderV3<GetLiveTrackConnectionsResponse, GetLiveTrackConnectionsResponse.Builder, GetLiveTrackConnectionsResponseOrBuilder> getLiveTrackConnectionsResponseBuilder_;
            private GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GroupLiveTrackService groupLiveTrackService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GetLiveTrackConnectionsRequest, GetLiveTrackConnectionsRequest.Builder, GetLiveTrackConnectionsRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsRequestBuilder_;
                    groupLiveTrackService.getLiveTrackConnectionsRequest_ = singleFieldBuilderV3 == null ? this.getLiveTrackConnectionsRequest_ : (GetLiveTrackConnectionsRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GetLiveTrackConnectionsResponse, GetLiveTrackConnectionsResponse.Builder, GetLiveTrackConnectionsResponseOrBuilder> singleFieldBuilderV4 = this.getLiveTrackConnectionsResponseBuilder_;
                    groupLiveTrackService.getLiveTrackConnectionsResponse_ = singleFieldBuilderV4 == null ? this.getLiveTrackConnectionsResponse_ : (GetLiveTrackConnectionsResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GetLastKnownLocationRequest, GetLastKnownLocationRequest.Builder, GetLastKnownLocationRequestOrBuilder> singleFieldBuilderV5 = this.getLastKnownLocationRequestBuilder_;
                    groupLiveTrackService.getLastKnownLocationRequest_ = singleFieldBuilderV5 == null ? this.getLastKnownLocationRequest_ : (GetLastKnownLocationRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<GetLastKnownLocationResponse, GetLastKnownLocationResponse.Builder, GetLastKnownLocationResponseOrBuilder> singleFieldBuilderV6 = this.getLastKnownLocationResponseBuilder_;
                    groupLiveTrackService.getLastKnownLocationResponse_ = singleFieldBuilderV6 == null ? this.getLastKnownLocationResponse_ : (GetLastKnownLocationResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                groupLiveTrackService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GroupLiveTrackService_descriptor;
            }

            private SingleFieldBuilderV3<GetLastKnownLocationRequest, GetLastKnownLocationRequest.Builder, GetLastKnownLocationRequestOrBuilder> getGetLastKnownLocationRequestFieldBuilder() {
                if (this.getLastKnownLocationRequestBuilder_ == null) {
                    this.getLastKnownLocationRequestBuilder_ = new SingleFieldBuilderV3<>(getGetLastKnownLocationRequest(), getParentForChildren(), isClean());
                    this.getLastKnownLocationRequest_ = null;
                }
                return this.getLastKnownLocationRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetLastKnownLocationResponse, GetLastKnownLocationResponse.Builder, GetLastKnownLocationResponseOrBuilder> getGetLastKnownLocationResponseFieldBuilder() {
                if (this.getLastKnownLocationResponseBuilder_ == null) {
                    this.getLastKnownLocationResponseBuilder_ = new SingleFieldBuilderV3<>(getGetLastKnownLocationResponse(), getParentForChildren(), isClean());
                    this.getLastKnownLocationResponse_ = null;
                }
                return this.getLastKnownLocationResponseBuilder_;
            }

            private SingleFieldBuilderV3<GetLiveTrackConnectionsRequest, GetLiveTrackConnectionsRequest.Builder, GetLiveTrackConnectionsRequestOrBuilder> getGetLiveTrackConnectionsRequestFieldBuilder() {
                if (this.getLiveTrackConnectionsRequestBuilder_ == null) {
                    this.getLiveTrackConnectionsRequestBuilder_ = new SingleFieldBuilderV3<>(getGetLiveTrackConnectionsRequest(), getParentForChildren(), isClean());
                    this.getLiveTrackConnectionsRequest_ = null;
                }
                return this.getLiveTrackConnectionsRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetLiveTrackConnectionsResponse, GetLiveTrackConnectionsResponse.Builder, GetLiveTrackConnectionsResponseOrBuilder> getGetLiveTrackConnectionsResponseFieldBuilder() {
                if (this.getLiveTrackConnectionsResponseBuilder_ == null) {
                    this.getLiveTrackConnectionsResponseBuilder_ = new SingleFieldBuilderV3<>(getGetLiveTrackConnectionsResponse(), getParentForChildren(), isClean());
                    this.getLiveTrackConnectionsResponse_ = null;
                }
                return this.getLiveTrackConnectionsResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getGetLiveTrackConnectionsRequestFieldBuilder();
                    getGetLiveTrackConnectionsResponseFieldBuilder();
                    getGetLastKnownLocationRequestFieldBuilder();
                    getGetLastKnownLocationResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupLiveTrackService build() {
                GroupLiveTrackService groupLiveTrackServiceBuildPartial = buildPartial();
                if (groupLiveTrackServiceBuildPartial.isInitialized()) {
                    return groupLiveTrackServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) groupLiveTrackServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupLiveTrackService buildPartial() {
                GroupLiveTrackService groupLiveTrackService = new GroupLiveTrackService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(groupLiveTrackService);
                }
                onBuilt();
                return groupLiveTrackService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.getLiveTrackConnectionsRequest_ = null;
                SingleFieldBuilderV3<GetLiveTrackConnectionsRequest, GetLiveTrackConnectionsRequest.Builder, GetLiveTrackConnectionsRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getLiveTrackConnectionsRequestBuilder_ = null;
                }
                this.getLiveTrackConnectionsResponse_ = null;
                SingleFieldBuilderV3<GetLiveTrackConnectionsResponse, GetLiveTrackConnectionsResponse.Builder, GetLiveTrackConnectionsResponseOrBuilder> singleFieldBuilderV4 = this.getLiveTrackConnectionsResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.getLiveTrackConnectionsResponseBuilder_ = null;
                }
                this.getLastKnownLocationRequest_ = null;
                SingleFieldBuilderV3<GetLastKnownLocationRequest, GetLastKnownLocationRequest.Builder, GetLastKnownLocationRequestOrBuilder> singleFieldBuilderV5 = this.getLastKnownLocationRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.getLastKnownLocationRequestBuilder_ = null;
                }
                this.getLastKnownLocationResponse_ = null;
                SingleFieldBuilderV3<GetLastKnownLocationResponse, GetLastKnownLocationResponse.Builder, GetLastKnownLocationResponseOrBuilder> singleFieldBuilderV6 = this.getLastKnownLocationResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.getLastKnownLocationResponseBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGetLastKnownLocationRequest() {
                this.bitField0_ &= -5;
                this.getLastKnownLocationRequest_ = null;
                SingleFieldBuilderV3<GetLastKnownLocationRequest, GetLastKnownLocationRequest.Builder, GetLastKnownLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getLastKnownLocationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetLastKnownLocationResponse() {
                this.bitField0_ &= -9;
                this.getLastKnownLocationResponse_ = null;
                SingleFieldBuilderV3<GetLastKnownLocationResponse, GetLastKnownLocationResponse.Builder, GetLastKnownLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getLastKnownLocationResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetLiveTrackConnectionsRequest() {
                this.bitField0_ &= -2;
                this.getLiveTrackConnectionsRequest_ = null;
                SingleFieldBuilderV3<GetLiveTrackConnectionsRequest, GetLiveTrackConnectionsRequest.Builder, GetLiveTrackConnectionsRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getLiveTrackConnectionsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetLiveTrackConnectionsResponse() {
                this.bitField0_ &= -3;
                this.getLiveTrackConnectionsResponse_ = null;
                SingleFieldBuilderV3<GetLiveTrackConnectionsResponse, GetLiveTrackConnectionsResponse.Builder, GetLiveTrackConnectionsResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getLiveTrackConnectionsResponseBuilder_ = null;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GroupLiveTrackService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public GetLastKnownLocationRequest getGetLastKnownLocationRequest() {
                SingleFieldBuilderV3<GetLastKnownLocationRequest, GetLastKnownLocationRequest.Builder, GetLastKnownLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLastKnownLocationRequest) singleFieldBuilderV3.getMessage();
                }
                GetLastKnownLocationRequest getLastKnownLocationRequest = this.getLastKnownLocationRequest_;
                return getLastKnownLocationRequest == null ? GetLastKnownLocationRequest.getDefaultInstance() : getLastKnownLocationRequest;
            }

            public GetLastKnownLocationRequest.Builder getGetLastKnownLocationRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GetLastKnownLocationRequest.Builder) getGetLastKnownLocationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public GetLastKnownLocationRequestOrBuilder getGetLastKnownLocationRequestOrBuilder() {
                SingleFieldBuilderV3<GetLastKnownLocationRequest, GetLastKnownLocationRequest.Builder, GetLastKnownLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLastKnownLocationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetLastKnownLocationRequest getLastKnownLocationRequest = this.getLastKnownLocationRequest_;
                return getLastKnownLocationRequest == null ? GetLastKnownLocationRequest.getDefaultInstance() : getLastKnownLocationRequest;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public GetLastKnownLocationResponse getGetLastKnownLocationResponse() {
                SingleFieldBuilderV3<GetLastKnownLocationResponse, GetLastKnownLocationResponse.Builder, GetLastKnownLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLastKnownLocationResponse) singleFieldBuilderV3.getMessage();
                }
                GetLastKnownLocationResponse getLastKnownLocationResponse = this.getLastKnownLocationResponse_;
                return getLastKnownLocationResponse == null ? GetLastKnownLocationResponse.getDefaultInstance() : getLastKnownLocationResponse;
            }

            public GetLastKnownLocationResponse.Builder getGetLastKnownLocationResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (GetLastKnownLocationResponse.Builder) getGetLastKnownLocationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public GetLastKnownLocationResponseOrBuilder getGetLastKnownLocationResponseOrBuilder() {
                SingleFieldBuilderV3<GetLastKnownLocationResponse, GetLastKnownLocationResponse.Builder, GetLastKnownLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLastKnownLocationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetLastKnownLocationResponse getLastKnownLocationResponse = this.getLastKnownLocationResponse_;
                return getLastKnownLocationResponse == null ? GetLastKnownLocationResponse.getDefaultInstance() : getLastKnownLocationResponse;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public GetLiveTrackConnectionsRequest getGetLiveTrackConnectionsRequest() {
                SingleFieldBuilderV3<GetLiveTrackConnectionsRequest, GetLiveTrackConnectionsRequest.Builder, GetLiveTrackConnectionsRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLiveTrackConnectionsRequest) singleFieldBuilderV3.getMessage();
                }
                GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest = this.getLiveTrackConnectionsRequest_;
                return getLiveTrackConnectionsRequest == null ? GetLiveTrackConnectionsRequest.getDefaultInstance() : getLiveTrackConnectionsRequest;
            }

            public GetLiveTrackConnectionsRequest.Builder getGetLiveTrackConnectionsRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GetLiveTrackConnectionsRequest.Builder) getGetLiveTrackConnectionsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public GetLiveTrackConnectionsRequestOrBuilder getGetLiveTrackConnectionsRequestOrBuilder() {
                SingleFieldBuilderV3<GetLiveTrackConnectionsRequest, GetLiveTrackConnectionsRequest.Builder, GetLiveTrackConnectionsRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLiveTrackConnectionsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest = this.getLiveTrackConnectionsRequest_;
                return getLiveTrackConnectionsRequest == null ? GetLiveTrackConnectionsRequest.getDefaultInstance() : getLiveTrackConnectionsRequest;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public GetLiveTrackConnectionsResponse getGetLiveTrackConnectionsResponse() {
                SingleFieldBuilderV3<GetLiveTrackConnectionsResponse, GetLiveTrackConnectionsResponse.Builder, GetLiveTrackConnectionsResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLiveTrackConnectionsResponse) singleFieldBuilderV3.getMessage();
                }
                GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse = this.getLiveTrackConnectionsResponse_;
                return getLiveTrackConnectionsResponse == null ? GetLiveTrackConnectionsResponse.getDefaultInstance() : getLiveTrackConnectionsResponse;
            }

            public GetLiveTrackConnectionsResponse.Builder getGetLiveTrackConnectionsResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GetLiveTrackConnectionsResponse.Builder) getGetLiveTrackConnectionsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public GetLiveTrackConnectionsResponseOrBuilder getGetLiveTrackConnectionsResponseOrBuilder() {
                SingleFieldBuilderV3<GetLiveTrackConnectionsResponse, GetLiveTrackConnectionsResponse.Builder, GetLiveTrackConnectionsResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLiveTrackConnectionsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse = this.getLiveTrackConnectionsResponse_;
                return getLiveTrackConnectionsResponse == null ? GetLiveTrackConnectionsResponse.getDefaultInstance() : getLiveTrackConnectionsResponse;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public boolean hasGetLastKnownLocationRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public boolean hasGetLastKnownLocationResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public boolean hasGetLiveTrackConnectionsRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupLiveTrackServiceOrBuilder
            public boolean hasGetLiveTrackConnectionsResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GroupLiveTrackService_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupLiveTrackService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasGetLiveTrackConnectionsRequest() && !getGetLiveTrackConnectionsRequest().isInitialized()) {
                    return false;
                }
                if (!hasGetLiveTrackConnectionsResponse() || getGetLiveTrackConnectionsResponse().isInitialized()) {
                    return !hasGetLastKnownLocationResponse() || getGetLastKnownLocationResponse().isInitialized();
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
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getGetLiveTrackConnectionsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getGetLiveTrackConnectionsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getGetLastKnownLocationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getGetLastKnownLocationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeGetLastKnownLocationRequest(GetLastKnownLocationRequest getLastKnownLocationRequest) {
                GetLastKnownLocationRequest getLastKnownLocationRequest2;
                SingleFieldBuilderV3<GetLastKnownLocationRequest, GetLastKnownLocationRequest.Builder, GetLastKnownLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getLastKnownLocationRequest);
                } else if ((this.bitField0_ & 4) == 0 || (getLastKnownLocationRequest2 = this.getLastKnownLocationRequest_) == null || getLastKnownLocationRequest2 == GetLastKnownLocationRequest.getDefaultInstance()) {
                    this.getLastKnownLocationRequest_ = getLastKnownLocationRequest;
                } else {
                    getGetLastKnownLocationRequestBuilder().mergeFrom(getLastKnownLocationRequest);
                }
                if (this.getLastKnownLocationRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetLastKnownLocationResponse(GetLastKnownLocationResponse getLastKnownLocationResponse) {
                GetLastKnownLocationResponse getLastKnownLocationResponse2;
                SingleFieldBuilderV3<GetLastKnownLocationResponse, GetLastKnownLocationResponse.Builder, GetLastKnownLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getLastKnownLocationResponse);
                } else if ((this.bitField0_ & 8) == 0 || (getLastKnownLocationResponse2 = this.getLastKnownLocationResponse_) == null || getLastKnownLocationResponse2 == GetLastKnownLocationResponse.getDefaultInstance()) {
                    this.getLastKnownLocationResponse_ = getLastKnownLocationResponse;
                } else {
                    getGetLastKnownLocationResponseBuilder().mergeFrom(getLastKnownLocationResponse);
                }
                if (this.getLastKnownLocationResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetLiveTrackConnectionsRequest(GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest) {
                GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest2;
                SingleFieldBuilderV3<GetLiveTrackConnectionsRequest, GetLiveTrackConnectionsRequest.Builder, GetLiveTrackConnectionsRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getLiveTrackConnectionsRequest);
                } else if ((this.bitField0_ & 1) == 0 || (getLiveTrackConnectionsRequest2 = this.getLiveTrackConnectionsRequest_) == null || getLiveTrackConnectionsRequest2 == GetLiveTrackConnectionsRequest.getDefaultInstance()) {
                    this.getLiveTrackConnectionsRequest_ = getLiveTrackConnectionsRequest;
                } else {
                    getGetLiveTrackConnectionsRequestBuilder().mergeFrom(getLiveTrackConnectionsRequest);
                }
                if (this.getLiveTrackConnectionsRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetLiveTrackConnectionsResponse(GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse) {
                GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse2;
                SingleFieldBuilderV3<GetLiveTrackConnectionsResponse, GetLiveTrackConnectionsResponse.Builder, GetLiveTrackConnectionsResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getLiveTrackConnectionsResponse);
                } else if ((this.bitField0_ & 2) == 0 || (getLiveTrackConnectionsResponse2 = this.getLiveTrackConnectionsResponse_) == null || getLiveTrackConnectionsResponse2 == GetLiveTrackConnectionsResponse.getDefaultInstance()) {
                    this.getLiveTrackConnectionsResponse_ = getLiveTrackConnectionsResponse;
                } else {
                    getGetLiveTrackConnectionsResponseBuilder().mergeFrom(getLiveTrackConnectionsResponse);
                }
                if (this.getLiveTrackConnectionsResponse_ != null) {
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

            public Builder setGetLastKnownLocationRequest(GetLastKnownLocationRequest.Builder builder) {
                SingleFieldBuilderV3<GetLastKnownLocationRequest, GetLastKnownLocationRequest.Builder, GetLastKnownLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getLastKnownLocationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGetLastKnownLocationResponse(GetLastKnownLocationResponse.Builder builder) {
                SingleFieldBuilderV3<GetLastKnownLocationResponse, GetLastKnownLocationResponse.Builder, GetLastKnownLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getLastKnownLocationResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setGetLiveTrackConnectionsRequest(GetLiveTrackConnectionsRequest.Builder builder) {
                SingleFieldBuilderV3<GetLiveTrackConnectionsRequest, GetLiveTrackConnectionsRequest.Builder, GetLiveTrackConnectionsRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getLiveTrackConnectionsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setGetLiveTrackConnectionsResponse(GetLiveTrackConnectionsResponse.Builder builder) {
                SingleFieldBuilderV3<GetLiveTrackConnectionsResponse, GetLiveTrackConnectionsResponse.Builder, GetLiveTrackConnectionsResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getLiveTrackConnectionsResponse_ = builder.build();
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
            public GroupLiveTrackService getDefaultInstanceForType() {
                return GroupLiveTrackService.getDefaultInstance();
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

            public Builder setGetLastKnownLocationRequest(GetLastKnownLocationRequest getLastKnownLocationRequest) {
                SingleFieldBuilderV3<GetLastKnownLocationRequest, GetLastKnownLocationRequest.Builder, GetLastKnownLocationRequestOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getLastKnownLocationRequest.getClass();
                    this.getLastKnownLocationRequest_ = getLastKnownLocationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getLastKnownLocationRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGetLastKnownLocationResponse(GetLastKnownLocationResponse getLastKnownLocationResponse) {
                SingleFieldBuilderV3<GetLastKnownLocationResponse, GetLastKnownLocationResponse.Builder, GetLastKnownLocationResponseOrBuilder> singleFieldBuilderV3 = this.getLastKnownLocationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getLastKnownLocationResponse.getClass();
                    this.getLastKnownLocationResponse_ = getLastKnownLocationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getLastKnownLocationResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setGetLiveTrackConnectionsRequest(GetLiveTrackConnectionsRequest getLiveTrackConnectionsRequest) {
                SingleFieldBuilderV3<GetLiveTrackConnectionsRequest, GetLiveTrackConnectionsRequest.Builder, GetLiveTrackConnectionsRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getLiveTrackConnectionsRequest.getClass();
                    this.getLiveTrackConnectionsRequest_ = getLiveTrackConnectionsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getLiveTrackConnectionsRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setGetLiveTrackConnectionsResponse(GetLiveTrackConnectionsResponse getLiveTrackConnectionsResponse) {
                SingleFieldBuilderV3<GetLiveTrackConnectionsResponse, GetLiveTrackConnectionsResponse.Builder, GetLiveTrackConnectionsResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackConnectionsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getLiveTrackConnectionsResponse.getClass();
                    this.getLiveTrackConnectionsResponse_ = getLiveTrackConnectionsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getLiveTrackConnectionsResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GroupLiveTrackService) {
                    return mergeFrom((GroupLiveTrackService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GroupLiveTrackService groupLiveTrackService) {
                if (groupLiveTrackService == GroupLiveTrackService.getDefaultInstance()) {
                    return this;
                }
                if (groupLiveTrackService.hasGetLiveTrackConnectionsRequest()) {
                    mergeGetLiveTrackConnectionsRequest(groupLiveTrackService.getGetLiveTrackConnectionsRequest());
                }
                if (groupLiveTrackService.hasGetLiveTrackConnectionsResponse()) {
                    mergeGetLiveTrackConnectionsResponse(groupLiveTrackService.getGetLiveTrackConnectionsResponse());
                }
                if (groupLiveTrackService.hasGetLastKnownLocationRequest()) {
                    mergeGetLastKnownLocationRequest(groupLiveTrackService.getGetLastKnownLocationRequest());
                }
                if (groupLiveTrackService.hasGetLastKnownLocationResponse()) {
                    mergeGetLastKnownLocationResponse(groupLiveTrackService.getGetLastKnownLocationResponse());
                }
                mergeUnknownFields(groupLiveTrackService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GroupLiveTrackService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GroupLiveTrackService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GroupLiveTrackService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GroupLiveTrackService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupLiveTrackService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupLiveTrackService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GroupLiveTrackService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GroupLiveTrackService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GroupLiveTrackService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GroupLiveTrackService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GroupLiveTrackService parseFrom(InputStream inputStream) {
            return (GroupLiveTrackService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GroupLiveTrackService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupLiveTrackService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupLiveTrackService parseFrom(CodedInputStream codedInputStream) {
            return (GroupLiveTrackService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GroupLiveTrackService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupLiveTrackService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GroupTrackResponse extends GeneratedMessageV3 implements GroupTrackResponseOrBuilder {
        public static final int FAILURESTATUS_FIELD_NUMBER = 2;
        public static final int SUCCESS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int failureStatus_;
        private byte memoizedIsInitialized;
        private boolean success_;
        private static final GroupTrackResponse DEFAULT_INSTANCE = new GroupTrackResponse();

        @Deprecated
        public static final Parser<GroupTrackResponse> PARSER = new AbstractParser<GroupTrackResponse>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.GroupTrackResponse.1
            @Override // com.google.protobuf.Parser
            public GroupTrackResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GroupTrackResponse.newBuilder();
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

        private GroupTrackResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.success_ = false;
            this.failureStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GroupTrackResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GroupTrackResponse_descriptor;
        }

        public static Builder newBuilder(GroupTrackResponse groupTrackResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(groupTrackResponse);
        }

        public static GroupTrackResponse parseDelimitedFrom(InputStream inputStream) {
            return (GroupTrackResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GroupTrackResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GroupTrackResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GroupTrackResponse)) {
                return super.equals(obj);
            }
            GroupTrackResponse groupTrackResponse = (GroupTrackResponse) obj;
            if (hasSuccess() != groupTrackResponse.hasSuccess()) {
                return false;
            }
            if ((!hasSuccess() || getSuccess() == groupTrackResponse.getSuccess()) && hasFailureStatus() == groupTrackResponse.hasFailureStatus()) {
                return (!hasFailureStatus() || this.failureStatus_ == groupTrackResponse.failureStatus_) && getUnknownFields().equals(groupTrackResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupTrackResponseOrBuilder
        public ResponseFailureStatus getFailureStatus() {
            ResponseFailureStatus responseFailureStatusForNumber = ResponseFailureStatus.forNumber(this.failureStatus_);
            return responseFailureStatusForNumber == null ? ResponseFailureStatus.UNDEFINED : responseFailureStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GroupTrackResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.success_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(2, this.failureStatus_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupTrackResponseOrBuilder
        public boolean getSuccess() {
            return this.success_;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupTrackResponseOrBuilder
        public boolean hasFailureStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupTrackResponseOrBuilder
        public boolean hasSuccess() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSuccess()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getSuccess());
            }
            if (hasFailureStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.failureStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GroupTrackResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupTrackResponse.class, Builder.class);
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
            if (hasSuccess()) {
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
            return new GroupTrackResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.success_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.failureStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GroupTrackResponseOrBuilder {
            private int bitField0_;
            private int failureStatus_;
            private boolean success_;

            private Builder() {
                this.failureStatus_ = 0;
            }

            private void buildPartial0(GroupTrackResponse groupTrackResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    groupTrackResponse.success_ = this.success_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    groupTrackResponse.failureStatus_ = this.failureStatus_;
                    i14 |= 2;
                }
                groupTrackResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GroupTrackResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupTrackResponse build() {
                GroupTrackResponse groupTrackResponseBuildPartial = buildPartial();
                if (groupTrackResponseBuildPartial.isInitialized()) {
                    return groupTrackResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) groupTrackResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupTrackResponse buildPartial() {
                GroupTrackResponse groupTrackResponse = new GroupTrackResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(groupTrackResponse);
                }
                onBuilt();
                return groupTrackResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.success_ = false;
                this.failureStatus_ = 0;
                return this;
            }

            public Builder clearFailureStatus() {
                this.bitField0_ &= -3;
                this.failureStatus_ = 0;
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

            public Builder clearSuccess() {
                this.bitField0_ &= -2;
                this.success_ = false;
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
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GroupTrackResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupTrackResponseOrBuilder
            public ResponseFailureStatus getFailureStatus() {
                ResponseFailureStatus responseFailureStatusForNumber = ResponseFailureStatus.forNumber(this.failureStatus_);
                return responseFailureStatusForNumber == null ? ResponseFailureStatus.UNDEFINED : responseFailureStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupTrackResponseOrBuilder
            public boolean getSuccess() {
                return this.success_;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupTrackResponseOrBuilder
            public boolean hasFailureStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.GroupTrackResponseOrBuilder
            public boolean hasSuccess() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_GroupTrackResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupTrackResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSuccess();
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
                                    this.success_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseFailureStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.failureStatus_ = i14;
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

            public Builder setFailureStatus(ResponseFailureStatus responseFailureStatus) {
                responseFailureStatus.getClass();
                this.bitField0_ |= 2;
                this.failureStatus_ = responseFailureStatus.getNumber();
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

            public Builder setSuccess(boolean z14) {
                this.success_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GroupTrackResponse getDefaultInstanceForType() {
                return GroupTrackResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.failureStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GroupTrackResponse) {
                    return mergeFrom((GroupTrackResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GroupTrackResponse groupTrackResponse) {
                if (groupTrackResponse == GroupTrackResponse.getDefaultInstance()) {
                    return this;
                }
                if (groupTrackResponse.hasSuccess()) {
                    setSuccess(groupTrackResponse.getSuccess());
                }
                if (groupTrackResponse.hasFailureStatus()) {
                    setFailureStatus(groupTrackResponse.getFailureStatus());
                }
                mergeUnknownFields(groupTrackResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GroupTrackResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GroupTrackResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupTrackResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupTrackResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GroupTrackResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GroupTrackResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ GroupTrackResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GroupTrackResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private GroupTrackResponse() {
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.failureStatus_ = 0;
        }

        public static GroupTrackResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GroupTrackResponse parseFrom(InputStream inputStream) {
            return (GroupTrackResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GroupTrackResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupTrackResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupTrackResponse parseFrom(CodedInputStream codedInputStream) {
            return (GroupTrackResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GroupTrackResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupTrackResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LiveConnectionTrackPoint extends GeneratedMessageV3 implements LiveConnectionTrackPointOrBuilder {
        public static final int ACTIVITY_TYPE_FIELD_NUMBER = 6;
        public static final int HEADING_SC_FIELD_NUMBER = 5;
        public static final int POSITION_FIELD_NUMBER = 3;
        public static final int REPORTED_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int SPEED_MPS_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int activityType_;
        private int bitField0_;
        private int headingSc_;
        private byte memoizedIsInitialized;
        private GDIDataTypes.ScPoint position_;
        private long reportedTimestamp_;
        private volatile Object sessionId_;
        private double speedMps_;
        private static final LiveConnectionTrackPoint DEFAULT_INSTANCE = new LiveConnectionTrackPoint();

        @Deprecated
        public static final Parser<LiveConnectionTrackPoint> PARSER = new AbstractParser<LiveConnectionTrackPoint>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPoint.1
            @Override // com.google.protobuf.Parser
            public LiveConnectionTrackPoint parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LiveConnectionTrackPoint.newBuilder();
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

        private LiveConnectionTrackPoint() {
            this.sessionId_ = "";
            this.reportedTimestamp_ = 0L;
            this.speedMps_ = 0.0d;
            this.headingSc_ = 0;
            this.activityType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.sessionId_ = "";
            this.activityType_ = 0;
        }

        public static LiveConnectionTrackPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionTrackPoint_descriptor;
        }

        public static Builder newBuilder(LiveConnectionTrackPoint liveConnectionTrackPoint) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveConnectionTrackPoint);
        }

        public static LiveConnectionTrackPoint parseDelimitedFrom(InputStream inputStream) {
            return (LiveConnectionTrackPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LiveConnectionTrackPoint parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LiveConnectionTrackPoint> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LiveConnectionTrackPoint)) {
                return super.equals(obj);
            }
            LiveConnectionTrackPoint liveConnectionTrackPoint = (LiveConnectionTrackPoint) obj;
            if (hasSessionId() != liveConnectionTrackPoint.hasSessionId()) {
                return false;
            }
            if ((hasSessionId() && !getSessionId().equals(liveConnectionTrackPoint.getSessionId())) || hasReportedTimestamp() != liveConnectionTrackPoint.hasReportedTimestamp()) {
                return false;
            }
            if ((hasReportedTimestamp() && getReportedTimestamp() != liveConnectionTrackPoint.getReportedTimestamp()) || hasPosition() != liveConnectionTrackPoint.hasPosition()) {
                return false;
            }
            if ((hasPosition() && !getPosition().equals(liveConnectionTrackPoint.getPosition())) || hasSpeedMps() != liveConnectionTrackPoint.hasSpeedMps()) {
                return false;
            }
            if ((hasSpeedMps() && Double.doubleToLongBits(getSpeedMps()) != Double.doubleToLongBits(liveConnectionTrackPoint.getSpeedMps())) || hasHeadingSc() != liveConnectionTrackPoint.hasHeadingSc()) {
                return false;
            }
            if ((!hasHeadingSc() || getHeadingSc() == liveConnectionTrackPoint.getHeadingSc()) && hasActivityType() == liveConnectionTrackPoint.hasActivityType()) {
                return (!hasActivityType() || this.activityType_ == liveConnectionTrackPoint.activityType_) && getUnknownFields().equals(liveConnectionTrackPoint.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public FitnessPointData.ActivityType getActivityType() {
            FitnessPointData.ActivityType activityTypeForNumber = FitnessPointData.ActivityType.forNumber(this.activityType_);
            return activityTypeForNumber == null ? FitnessPointData.ActivityType.CYCLING : activityTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public int getHeadingSc() {
            return this.headingSc_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LiveConnectionTrackPoint> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public GDIDataTypes.ScPoint getPosition() {
            GDIDataTypes.ScPoint scPoint = this.position_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public GDIDataTypes.ScPointOrBuilder getPositionOrBuilder() {
            GDIDataTypes.ScPoint scPoint = this.position_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public long getReportedTimestamp() {
            return this.reportedTimestamp_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.sessionId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(2, this.reportedTimestamp_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(3, getPosition());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeDoubleSize(4, this.speedMps_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeSInt32Size(5, this.headingSc_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(6, this.activityType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sessionId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public double getSpeedMps() {
            return this.speedMps_;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public boolean hasActivityType() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public boolean hasHeadingSc() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public boolean hasPosition() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public boolean hasReportedTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
        public boolean hasSpeedMps() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionId().hashCode();
            }
            if (hasReportedTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getReportedTimestamp());
            }
            if (hasPosition()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPosition().hashCode();
            }
            if (hasSpeedMps()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashLong(Double.doubleToLongBits(getSpeedMps()));
            }
            if (hasHeadingSc()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getHeadingSc();
            }
            if (hasActivityType()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + this.activityType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionTrackPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveConnectionTrackPoint.class, Builder.class);
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
            if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPosition() || getPosition().isInitialized()) {
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
            return new LiveConnectionTrackPoint();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.sessionId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.reportedTimestamp_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getPosition());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeDouble(4, this.speedMps_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeSInt32(5, this.headingSc_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeEnum(6, this.activityType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LiveConnectionTrackPointOrBuilder {
            private int activityType_;
            private int bitField0_;
            private int headingSc_;
            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> positionBuilder_;
            private GDIDataTypes.ScPoint position_;
            private long reportedTimestamp_;
            private Object sessionId_;
            private double speedMps_;

            private Builder() {
                this.sessionId_ = "";
                this.activityType_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LiveConnectionTrackPoint liveConnectionTrackPoint) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    liveConnectionTrackPoint.sessionId_ = this.sessionId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    liveConnectionTrackPoint.reportedTimestamp_ = this.reportedTimestamp_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                    liveConnectionTrackPoint.position_ = singleFieldBuilderV3 == null ? this.position_ : (GDIDataTypes.ScPoint) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    liveConnectionTrackPoint.speedMps_ = this.speedMps_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    liveConnectionTrackPoint.headingSc_ = this.headingSc_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    liveConnectionTrackPoint.activityType_ = this.activityType_;
                    i14 |= 32;
                }
                liveConnectionTrackPoint.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionTrackPoint_descriptor;
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
            public LiveConnectionTrackPoint build() {
                LiveConnectionTrackPoint liveConnectionTrackPointBuildPartial = buildPartial();
                if (liveConnectionTrackPointBuildPartial.isInitialized()) {
                    return liveConnectionTrackPointBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) liveConnectionTrackPointBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveConnectionTrackPoint buildPartial() {
                LiveConnectionTrackPoint liveConnectionTrackPoint = new LiveConnectionTrackPoint(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(liveConnectionTrackPoint);
                }
                onBuilt();
                return liveConnectionTrackPoint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionId_ = "";
                this.reportedTimestamp_ = 0L;
                this.position_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                this.speedMps_ = 0.0d;
                this.headingSc_ = 0;
                this.activityType_ = 0;
                return this;
            }

            public Builder clearActivityType() {
                this.bitField0_ &= -33;
                this.activityType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHeadingSc() {
                this.bitField0_ &= -17;
                this.headingSc_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPosition() {
                this.bitField0_ &= -5;
                this.position_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearReportedTimestamp() {
                this.bitField0_ &= -3;
                this.reportedTimestamp_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearSessionId() {
                this.sessionId_ = LiveConnectionTrackPoint.getDefaultInstance().getSessionId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSpeedMps() {
                this.bitField0_ &= -9;
                this.speedMps_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public FitnessPointData.ActivityType getActivityType() {
                FitnessPointData.ActivityType activityTypeForNumber = FitnessPointData.ActivityType.forNumber(this.activityType_);
                return activityTypeForNumber == null ? FitnessPointData.ActivityType.CYCLING : activityTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionTrackPoint_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public int getHeadingSc() {
                return this.headingSc_;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public GDIDataTypes.ScPoint getPosition() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPoint) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.ScPoint scPoint = this.position_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            public GDIDataTypes.ScPoint.Builder getPositionBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GDIDataTypes.ScPoint.Builder) getPositionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public GDIDataTypes.ScPointOrBuilder getPositionOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.ScPoint scPoint = this.position_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public long getReportedTimestamp() {
                return this.reportedTimestamp_;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public String getSessionId() {
                Object obj = this.sessionId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sessionId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public ByteString getSessionIdBytes() {
                Object obj = this.sessionId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public double getSpeedMps() {
                return this.speedMps_;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public boolean hasActivityType() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public boolean hasHeadingSc() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public boolean hasPosition() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public boolean hasReportedTimestamp() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public boolean hasSessionId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionTrackPointOrBuilder
            public boolean hasSpeedMps() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionTrackPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveConnectionTrackPoint.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasSessionId()) {
                    return !hasPosition() || getPosition().isInitialized();
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
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.sessionId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.reportedTimestamp_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getPositionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 33) {
                                    this.speedMps_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.headingSc_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    int i14 = codedInputStream.readEnum();
                                    if (FitnessPointData.ActivityType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(6, i14);
                                    } else {
                                        this.activityType_ = i14;
                                        this.bitField0_ |= 32;
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
                } else if ((this.bitField0_ & 4) == 0 || (scPoint2 = this.position_) == null || scPoint2 == GDIDataTypes.ScPoint.getDefaultInstance()) {
                    this.position_ = scPoint;
                } else {
                    getPositionBuilder().mergeFrom(scPoint);
                }
                if (this.position_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setActivityType(FitnessPointData.ActivityType activityType) {
                activityType.getClass();
                this.bitField0_ |= 32;
                this.activityType_ = activityType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHeadingSc(int i14) {
                this.headingSc_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setPosition(GDIDataTypes.ScPoint.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.position_ = builder.build();
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

            public Builder setReportedTimestamp(long j8) {
                this.reportedTimestamp_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSessionId(String str) {
                str.getClass();
                this.sessionId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                byteString.getClass();
                this.sessionId_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSpeedMps(double d14) {
                this.speedMps_ = d14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LiveConnectionTrackPoint getDefaultInstanceForType() {
                return LiveConnectionTrackPoint.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sessionId_ = "";
                this.activityType_ = 0;
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
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LiveConnectionTrackPoint) {
                    return mergeFrom((LiveConnectionTrackPoint) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LiveConnectionTrackPoint liveConnectionTrackPoint) {
                if (liveConnectionTrackPoint == LiveConnectionTrackPoint.getDefaultInstance()) {
                    return this;
                }
                if (liveConnectionTrackPoint.hasSessionId()) {
                    this.sessionId_ = liveConnectionTrackPoint.sessionId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (liveConnectionTrackPoint.hasReportedTimestamp()) {
                    setReportedTimestamp(liveConnectionTrackPoint.getReportedTimestamp());
                }
                if (liveConnectionTrackPoint.hasPosition()) {
                    mergePosition(liveConnectionTrackPoint.getPosition());
                }
                if (liveConnectionTrackPoint.hasSpeedMps()) {
                    setSpeedMps(liveConnectionTrackPoint.getSpeedMps());
                }
                if (liveConnectionTrackPoint.hasHeadingSc()) {
                    setHeadingSc(liveConnectionTrackPoint.getHeadingSc());
                }
                if (liveConnectionTrackPoint.hasActivityType()) {
                    setActivityType(liveConnectionTrackPoint.getActivityType());
                }
                mergeUnknownFields(liveConnectionTrackPoint.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LiveConnectionTrackPoint getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LiveConnectionTrackPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveConnectionTrackPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveConnectionTrackPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LiveConnectionTrackPoint parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveConnectionTrackPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LiveConnectionTrackPoint parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LiveConnectionTrackPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LiveConnectionTrackPoint parseFrom(InputStream inputStream) {
            return (LiveConnectionTrackPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LiveConnectionTrackPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveConnectionTrackPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveConnectionTrackPoint parseFrom(CodedInputStream codedInputStream) {
            return (LiveConnectionTrackPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LiveConnectionTrackPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveConnectionTrackPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private LiveConnectionTrackPoint(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionId_ = "";
            this.reportedTimestamp_ = 0L;
            this.speedMps_ = 0.0d;
            this.headingSc_ = 0;
            this.activityType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ LiveConnectionTrackPoint(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class LiveConnectionUserTrackPoint extends GeneratedMessageV3 implements LiveConnectionUserTrackPointOrBuilder {
        public static final int IS_LIVETRACK_MESSAGING_AVAILABLE_FIELD_NUMBER = 3;
        public static final int TRACK_POINT_FIELD_NUMBER = 2;
        public static final int USER_DISPLAY_NAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isLivetrackMessagingAvailable_;
        private byte memoizedIsInitialized;
        private LiveConnectionTrackPoint trackPoint_;
        private volatile Object userDisplayName_;
        private static final LiveConnectionUserTrackPoint DEFAULT_INSTANCE = new LiveConnectionUserTrackPoint();

        @Deprecated
        public static final Parser<LiveConnectionUserTrackPoint> PARSER = new AbstractParser<LiveConnectionUserTrackPoint>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPoint.1
            @Override // com.google.protobuf.Parser
            public LiveConnectionUserTrackPoint parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LiveConnectionUserTrackPoint.newBuilder();
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

        private LiveConnectionUserTrackPoint() {
            this.userDisplayName_ = "";
            this.isLivetrackMessagingAvailable_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.userDisplayName_ = "";
        }

        public static LiveConnectionUserTrackPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionUserTrackPoint_descriptor;
        }

        public static Builder newBuilder(LiveConnectionUserTrackPoint liveConnectionUserTrackPoint) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveConnectionUserTrackPoint);
        }

        public static LiveConnectionUserTrackPoint parseDelimitedFrom(InputStream inputStream) {
            return (LiveConnectionUserTrackPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LiveConnectionUserTrackPoint parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LiveConnectionUserTrackPoint> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LiveConnectionUserTrackPoint)) {
                return super.equals(obj);
            }
            LiveConnectionUserTrackPoint liveConnectionUserTrackPoint = (LiveConnectionUserTrackPoint) obj;
            if (hasUserDisplayName() != liveConnectionUserTrackPoint.hasUserDisplayName()) {
                return false;
            }
            if ((hasUserDisplayName() && !getUserDisplayName().equals(liveConnectionUserTrackPoint.getUserDisplayName())) || hasTrackPoint() != liveConnectionUserTrackPoint.hasTrackPoint()) {
                return false;
            }
            if ((!hasTrackPoint() || getTrackPoint().equals(liveConnectionUserTrackPoint.getTrackPoint())) && hasIsLivetrackMessagingAvailable() == liveConnectionUserTrackPoint.hasIsLivetrackMessagingAvailable()) {
                return (!hasIsLivetrackMessagingAvailable() || getIsLivetrackMessagingAvailable() == liveConnectionUserTrackPoint.getIsLivetrackMessagingAvailable()) && getUnknownFields().equals(liveConnectionUserTrackPoint.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
        public boolean getIsLivetrackMessagingAvailable() {
            return this.isLivetrackMessagingAvailable_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LiveConnectionUserTrackPoint> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.userDisplayName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, getTrackPoint());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(3, this.isLivetrackMessagingAvailable_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
        public LiveConnectionTrackPoint getTrackPoint() {
            LiveConnectionTrackPoint liveConnectionTrackPoint = this.trackPoint_;
            return liveConnectionTrackPoint == null ? LiveConnectionTrackPoint.getDefaultInstance() : liveConnectionTrackPoint;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
        public LiveConnectionTrackPointOrBuilder getTrackPointOrBuilder() {
            LiveConnectionTrackPoint liveConnectionTrackPoint = this.trackPoint_;
            return liveConnectionTrackPoint == null ? LiveConnectionTrackPoint.getDefaultInstance() : liveConnectionTrackPoint;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
        public String getUserDisplayName() {
            Object obj = this.userDisplayName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.userDisplayName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
        public ByteString getUserDisplayNameBytes() {
            Object obj = this.userDisplayName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userDisplayName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
        public boolean hasIsLivetrackMessagingAvailable() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
        public boolean hasTrackPoint() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
        public boolean hasUserDisplayName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUserDisplayName()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUserDisplayName().hashCode();
            }
            if (hasTrackPoint()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTrackPoint().hashCode();
            }
            if (hasIsLivetrackMessagingAvailable()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getIsLivetrackMessagingAvailable());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionUserTrackPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveConnectionUserTrackPoint.class, Builder.class);
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
            if (!hasUserDisplayName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTrackPoint() || getTrackPoint().isInitialized()) {
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
            return new LiveConnectionUserTrackPoint();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.userDisplayName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getTrackPoint());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.isLivetrackMessagingAvailable_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* JADX INFO: loaded from: classes5.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LiveConnectionUserTrackPointOrBuilder {
            private int bitField0_;
            private boolean isLivetrackMessagingAvailable_;
            private SingleFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> trackPointBuilder_;
            private LiveConnectionTrackPoint trackPoint_;
            private Object userDisplayName_;

            private Builder() {
                this.userDisplayName_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LiveConnectionUserTrackPoint liveConnectionUserTrackPoint) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    liveConnectionUserTrackPoint.userDisplayName_ = this.userDisplayName_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> singleFieldBuilderV3 = this.trackPointBuilder_;
                    liveConnectionUserTrackPoint.trackPoint_ = singleFieldBuilderV3 == null ? this.trackPoint_ : (LiveConnectionTrackPoint) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    liveConnectionUserTrackPoint.isLivetrackMessagingAvailable_ = this.isLivetrackMessagingAvailable_;
                    i14 |= 4;
                }
                liveConnectionUserTrackPoint.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionUserTrackPoint_descriptor;
            }

            private SingleFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> getTrackPointFieldBuilder() {
                if (this.trackPointBuilder_ == null) {
                    this.trackPointBuilder_ = new SingleFieldBuilderV3<>(getTrackPoint(), getParentForChildren(), isClean());
                    this.trackPoint_ = null;
                }
                return this.trackPointBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getTrackPointFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveConnectionUserTrackPoint build() {
                LiveConnectionUserTrackPoint liveConnectionUserTrackPointBuildPartial = buildPartial();
                if (liveConnectionUserTrackPointBuildPartial.isInitialized()) {
                    return liveConnectionUserTrackPointBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) liveConnectionUserTrackPointBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveConnectionUserTrackPoint buildPartial() {
                LiveConnectionUserTrackPoint liveConnectionUserTrackPoint = new LiveConnectionUserTrackPoint(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(liveConnectionUserTrackPoint);
                }
                onBuilt();
                return liveConnectionUserTrackPoint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.userDisplayName_ = "";
                this.trackPoint_ = null;
                SingleFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> singleFieldBuilderV3 = this.trackPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackPointBuilder_ = null;
                }
                this.isLivetrackMessagingAvailable_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsLivetrackMessagingAvailable() {
                this.bitField0_ &= -5;
                this.isLivetrackMessagingAvailable_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTrackPoint() {
                this.bitField0_ &= -3;
                this.trackPoint_ = null;
                SingleFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> singleFieldBuilderV3 = this.trackPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackPointBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUserDisplayName() {
                this.userDisplayName_ = LiveConnectionUserTrackPoint.getDefaultInstance().getUserDisplayName();
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
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionUserTrackPoint_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
            public boolean getIsLivetrackMessagingAvailable() {
                return this.isLivetrackMessagingAvailable_;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
            public LiveConnectionTrackPoint getTrackPoint() {
                SingleFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> singleFieldBuilderV3 = this.trackPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LiveConnectionTrackPoint) singleFieldBuilderV3.getMessage();
                }
                LiveConnectionTrackPoint liveConnectionTrackPoint = this.trackPoint_;
                return liveConnectionTrackPoint == null ? LiveConnectionTrackPoint.getDefaultInstance() : liveConnectionTrackPoint;
            }

            public LiveConnectionTrackPoint.Builder getTrackPointBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (LiveConnectionTrackPoint.Builder) getTrackPointFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
            public LiveConnectionTrackPointOrBuilder getTrackPointOrBuilder() {
                SingleFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> singleFieldBuilderV3 = this.trackPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LiveConnectionTrackPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LiveConnectionTrackPoint liveConnectionTrackPoint = this.trackPoint_;
                return liveConnectionTrackPoint == null ? LiveConnectionTrackPoint.getDefaultInstance() : liveConnectionTrackPoint;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
            public String getUserDisplayName() {
                Object obj = this.userDisplayName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.userDisplayName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
            public ByteString getUserDisplayNameBytes() {
                Object obj = this.userDisplayName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userDisplayName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
            public boolean hasIsLivetrackMessagingAvailable() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
            public boolean hasTrackPoint() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGroupLiveTrack.LiveConnectionUserTrackPointOrBuilder
            public boolean hasUserDisplayName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGroupLiveTrack.internal_static_GDI_Proto_GroupLiveTrack_LiveConnectionUserTrackPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveConnectionUserTrackPoint.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasUserDisplayName()) {
                    return !hasTrackPoint() || getTrackPoint().isInitialized();
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
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.userDisplayName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getTrackPointFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.isLivetrackMessagingAvailable_ = codedInputStream.readBool();
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

            public Builder mergeTrackPoint(LiveConnectionTrackPoint liveConnectionTrackPoint) {
                LiveConnectionTrackPoint liveConnectionTrackPoint2;
                SingleFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> singleFieldBuilderV3 = this.trackPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(liveConnectionTrackPoint);
                } else if ((this.bitField0_ & 2) == 0 || (liveConnectionTrackPoint2 = this.trackPoint_) == null || liveConnectionTrackPoint2 == LiveConnectionTrackPoint.getDefaultInstance()) {
                    this.trackPoint_ = liveConnectionTrackPoint;
                } else {
                    getTrackPointBuilder().mergeFrom(liveConnectionTrackPoint);
                }
                if (this.trackPoint_ != null) {
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

            public Builder setIsLivetrackMessagingAvailable(boolean z14) {
                this.isLivetrackMessagingAvailable_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTrackPoint(LiveConnectionTrackPoint.Builder builder) {
                SingleFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> singleFieldBuilderV3 = this.trackPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackPoint_ = builder.build();
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

            public Builder setUserDisplayName(String str) {
                str.getClass();
                this.userDisplayName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUserDisplayNameBytes(ByteString byteString) {
                byteString.getClass();
                this.userDisplayName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LiveConnectionUserTrackPoint getDefaultInstanceForType() {
                return LiveConnectionUserTrackPoint.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.userDisplayName_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setTrackPoint(LiveConnectionTrackPoint liveConnectionTrackPoint) {
                SingleFieldBuilderV3<LiveConnectionTrackPoint, LiveConnectionTrackPoint.Builder, LiveConnectionTrackPointOrBuilder> singleFieldBuilderV3 = this.trackPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    liveConnectionTrackPoint.getClass();
                    this.trackPoint_ = liveConnectionTrackPoint;
                } else {
                    singleFieldBuilderV3.setMessage(liveConnectionTrackPoint);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LiveConnectionUserTrackPoint) {
                    return mergeFrom((LiveConnectionUserTrackPoint) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LiveConnectionUserTrackPoint liveConnectionUserTrackPoint) {
                if (liveConnectionUserTrackPoint == LiveConnectionUserTrackPoint.getDefaultInstance()) {
                    return this;
                }
                if (liveConnectionUserTrackPoint.hasUserDisplayName()) {
                    this.userDisplayName_ = liveConnectionUserTrackPoint.userDisplayName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (liveConnectionUserTrackPoint.hasTrackPoint()) {
                    mergeTrackPoint(liveConnectionUserTrackPoint.getTrackPoint());
                }
                if (liveConnectionUserTrackPoint.hasIsLivetrackMessagingAvailable()) {
                    setIsLivetrackMessagingAvailable(liveConnectionUserTrackPoint.getIsLivetrackMessagingAvailable());
                }
                mergeUnknownFields(liveConnectionUserTrackPoint.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LiveConnectionUserTrackPoint getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LiveConnectionUserTrackPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveConnectionUserTrackPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveConnectionUserTrackPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LiveConnectionUserTrackPoint parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveConnectionUserTrackPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LiveConnectionUserTrackPoint parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LiveConnectionUserTrackPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LiveConnectionUserTrackPoint parseFrom(InputStream inputStream) {
            return (LiveConnectionUserTrackPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private LiveConnectionUserTrackPoint(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.userDisplayName_ = "";
            this.isLivetrackMessagingAvailable_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LiveConnectionUserTrackPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveConnectionUserTrackPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveConnectionUserTrackPoint parseFrom(CodedInputStream codedInputStream) {
            return (LiveConnectionUserTrackPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ LiveConnectionUserTrackPoint(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LiveConnectionUserTrackPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveConnectionUserTrackPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    /* JADX INFO: loaded from: classes5.dex */
    public enum ResponseFailureStatus implements ProtocolMessageEnum {
        UNDEFINED(0),
        NO_NETWORK_CONN(1),
        TIMEOUT(2),
        SERVER_ERROR(3),
        EMPTY_SESSION_IDS_LIST(4);

        public static final int EMPTY_SESSION_IDS_LIST_VALUE = 4;
        public static final int NO_NETWORK_CONN_VALUE = 1;
        public static final int SERVER_ERROR_VALUE = 3;
        public static final int TIMEOUT_VALUE = 2;
        public static final int UNDEFINED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ResponseFailureStatus> internalValueMap = new Internal.EnumLiteMap<ResponseFailureStatus>() { // from class: com.garmin.proto.generated.GDIGroupLiveTrack.ResponseFailureStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ResponseFailureStatus findValueByNumber(int i14) {
                return ResponseFailureStatus.forNumber(i14);
            }
        };
        private static final ResponseFailureStatus[] VALUES = values();

        ResponseFailureStatus(int i14) {
            this.value = i14;
        }

        public static ResponseFailureStatus forNumber(int i14) {
            if (i14 == 0) {
                return UNDEFINED;
            }
            if (i14 == 1) {
                return NO_NETWORK_CONN;
            }
            if (i14 == 2) {
                return TIMEOUT;
            }
            if (i14 == 3) {
                return SERVER_ERROR;
            }
            if (i14 != 4) {
                return null;
            }
            return EMPTY_SESSION_IDS_LIST;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIGroupLiveTrack.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ResponseFailureStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static ResponseFailureStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ResponseFailureStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
