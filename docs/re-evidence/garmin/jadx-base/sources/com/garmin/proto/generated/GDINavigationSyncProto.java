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
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes6.dex */
public final class GDINavigationSyncProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017GDINavigationSync.proto\u0012\u0018GDI.Proto.NavigationSync\u001a\u0015GDIEventSharing.proto\u001a\u0012GDIDataTypes.proto\"\u00ad\u0002\n\u0007Service\u0012G\n\rstart_request\u0018\u0001 \u0001(\u000b20.GDI.Proto.NavigationSync.StartNavigationRequest\u0012I\n\u000estart_response\u0018\u0002 \u0001(\u000b21.GDI.Proto.NavigationSync.StartNavigationResponse\u0012E\n\fstop_request\u0018\u0003 \u0001(\u000b2/.GDI.Proto.NavigationSync.StopNavigationRequest\u0012G\n\rstop_response\u0018\u0004 \u0001(\u000b20.GDI.Proto.NavigationSync.StopNavigationResponse\"[\n\u0016StartNavigationRequest\u0012A\n\u000fnavigation_item\u0018\u0001 \u0001(\u000b2(.GDI.Proto.NavigationSync.NavigationItem\"c\n\u0017StartNavigationResponse\u0012H\n\u0013nav_response_status\u0018\u0001 \u0001(\u000e2+.GDI.Proto.NavigationSync.NavResponseStatus\"\u0017\n\u0015StopNavigationRequest\"-\n\u0016StopNavigationResponse\u0012\u0013\n\u000bnav_stopped\u0018\u0001 \u0001(\b\"¸\u0001\n\u0011NavigationDetails\u0012.\n\u0005state\u0018\u0001 \u0001(\u000b2\u001f.GDI.Proto.NavigationSync.State2s\n\u0012navigation_details\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ê\u0007 \u0001(\u000b2+.GDI.Proto.NavigationSync.NavigationDetails\"Ü\u0003\n\u0005State\u00128\n\u0005state\u0018\u0001 \u0001(\u000e2).GDI.Proto.NavigationSync.State.StateType\u0012\u0016\n\u000enext_nav_index\u0018\u0002 \u0001(\r\u0012\u0018\n\u0010distance_to_dest\u0018\u0003 \u0001(\r\u0012\u0014\n\ftime_to_dest\u0018\u0004 \u0001(\r\u0012\u000f\n\u0007bearing\u0018\u0005 \u0001(\r\u0012\u0012\n\nmoving_avg\u0018\u0006 \u0001(\u0002\u0012\r\n\u0005speed\u0018\u0007 \u0001(\u0002\u0012\u0013\n\u000bmoving_time\u0018\b \u0001(\r\u0012\u0012\n\noff_course\u0018\t \u0001(\b\u0012\u0017\n\u000foff_course_dist\u0018\n \u0001(\u0002\u0012\u000f\n\u0007heading\u0018\u000b \u0001(\r\"É\u0001\n\tStateType\u0012\r\n\tSTART_NAV\u0010\u0000\u0012\f\n\bSTOP_NAV\u0010\u0001\u0012\u000f\n\u000bCALCULATING\u0010\u0002\u0012\n\n\u0006FAILED\u0010\u0003\u0012\u000f\n\u000bDEVICE_BUSY\u0010\u0004\u0012\u000b\n\u0007GPS_OFF\u0010\u0005\u0012\u000e\n\nGPS_NO_FIX\u0010\u0006\u0012\u0012\n\u000eCALC_TRUNCATED\u0010\u0007\u0012\u0011\n\rCALC_OVERFLOW\u0010\b\u0012\u0011\n\rCALC_CANCELED\u0010\t\u0012\r\n\tINV_START\u0010\n\u0012\u000b\n\u0007INV_END\u0010\u000b\"\u0087\u0001\n\u000eNavigationItem\u0012:\n\u000fnavigation_type\u0018\u0001 \u0001(\u000e2!.GDI.Proto.NavigationSync.NavType\u0012.\n\bposition\u0018\u0002 \u0001(\u000b2\u001c.GDI.Proto.DataTypes.ScPoint*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002*I\n\u0007NavType\u0012\f\n\bPOSITION\u0010\u0000\u0012\u0012\n\u000eSAVED_WAYPOINT\u0010\u0001\u0012\u000e\n\nSAVED_LINE\u0010\u0002\u0012\f\n\bTRACBACK\u0010\u0003*?\n\u0011NavResponseStatus\u0012\r\n\tNEED_ITEM\u0010\u0000\u0012\u000f\n\u000bCALCULATING\u0010\u0001\u0012\n\n\u0006FAILED\u0010\u0002B6\n\u001acom.garmin.proto.generatedB\u0016GDINavigationSyncProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor(), GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_NavigationSync_NavigationDetails_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_NavigationSync_NavigationDetails_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_NavigationSync_NavigationItem_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_NavigationSync_NavigationItem_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_NavigationSync_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_NavigationSync_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_NavigationSync_StartNavigationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_NavigationSync_StartNavigationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_NavigationSync_StartNavigationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_NavigationSync_StartNavigationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_NavigationSync_State_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_NavigationSync_State_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_NavigationSync_StopNavigationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_NavigationSync_StopNavigationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_NavigationSync_StopNavigationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_NavigationSync_StopNavigationResponse_fieldAccessorTable;

    public interface NavigationDetailsOrBuilder extends MessageOrBuilder {
        State getState();

        StateOrBuilder getStateOrBuilder();

        boolean hasState();
    }

    public interface NavigationItemOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder<NavigationItem> {
        NavType getNavigationType();

        GDIDataTypes.ScPoint getPosition();

        GDIDataTypes.ScPointOrBuilder getPositionOrBuilder();

        boolean hasNavigationType();

        boolean hasPosition();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        StartNavigationRequest getStartRequest();

        StartNavigationRequestOrBuilder getStartRequestOrBuilder();

        StartNavigationResponse getStartResponse();

        StartNavigationResponseOrBuilder getStartResponseOrBuilder();

        StopNavigationRequest getStopRequest();

        StopNavigationRequestOrBuilder getStopRequestOrBuilder();

        StopNavigationResponse getStopResponse();

        StopNavigationResponseOrBuilder getStopResponseOrBuilder();

        boolean hasStartRequest();

        boolean hasStartResponse();

        boolean hasStopRequest();

        boolean hasStopResponse();
    }

    public interface StartNavigationRequestOrBuilder extends MessageOrBuilder {
        NavigationItem getNavigationItem();

        NavigationItemOrBuilder getNavigationItemOrBuilder();

        boolean hasNavigationItem();
    }

    public interface StartNavigationResponseOrBuilder extends MessageOrBuilder {
        NavResponseStatus getNavResponseStatus();

        boolean hasNavResponseStatus();
    }

    public interface StateOrBuilder extends MessageOrBuilder {
        int getBearing();

        int getDistanceToDest();

        int getHeading();

        float getMovingAvg();

        int getMovingTime();

        int getNextNavIndex();

        boolean getOffCourse();

        float getOffCourseDist();

        float getSpeed();

        State.StateType getState();

        int getTimeToDest();

        boolean hasBearing();

        boolean hasDistanceToDest();

        boolean hasHeading();

        boolean hasMovingAvg();

        boolean hasMovingTime();

        boolean hasNextNavIndex();

        boolean hasOffCourse();

        boolean hasOffCourseDist();

        boolean hasSpeed();

        boolean hasState();

        boolean hasTimeToDest();
    }

    public interface StopNavigationRequestOrBuilder extends MessageOrBuilder {
    }

    public interface StopNavigationResponseOrBuilder extends MessageOrBuilder {
        boolean getNavStopped();

        boolean hasNavStopped();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_NavigationSync_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_NavigationSync_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"StartRequest", "StartResponse", "StopRequest", "StopResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_NavigationSync_StartNavigationRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_NavigationSync_StartNavigationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"NavigationItem"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_NavigationSync_StartNavigationResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_NavigationSync_StartNavigationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"NavResponseStatus"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_NavigationSync_StopNavigationRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_NavigationSync_StopNavigationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_NavigationSync_StopNavigationResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_NavigationSync_StopNavigationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"NavStopped"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_NavigationSync_NavigationDetails_descriptor = descriptor7;
        internal_static_GDI_Proto_NavigationSync_NavigationDetails_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"State"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_NavigationSync_State_descriptor = descriptor8;
        internal_static_GDI_Proto_NavigationSync_State_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"State", "NextNavIndex", "DistanceToDest", "TimeToDest", "Bearing", "MovingAvg", "Speed", "MovingTime", "OffCourse", "OffCourseDist", "Heading"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_NavigationSync_NavigationItem_descriptor = descriptor9;
        internal_static_GDI_Proto_NavigationSync_NavigationItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"NavigationType", "Position"});
        GDIEventSharingProto.getDescriptor();
        GDIDataTypes.getDescriptor();
    }

    private GDINavigationSyncProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(NavigationDetails.navigationDetails);
    }

    public static final class StopNavigationRequest extends GeneratedMessageV3 implements StopNavigationRequestOrBuilder {
        private static final StopNavigationRequest DEFAULT_INSTANCE = new StopNavigationRequest();

        @Deprecated
        public static final Parser<StopNavigationRequest> PARSER = new AbstractParser<StopNavigationRequest>() { // from class: com.garmin.proto.generated.GDINavigationSyncProto.StopNavigationRequest.1
            @Override // com.google.protobuf.Parser
            public StopNavigationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StopNavigationRequest.newBuilder();
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

        private StopNavigationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StopNavigationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StopNavigationRequest_descriptor;
        }

        public static Builder newBuilder(StopNavigationRequest stopNavigationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stopNavigationRequest);
        }

        public static StopNavigationRequest parseDelimitedFrom(InputStream inputStream) {
            return (StopNavigationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StopNavigationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StopNavigationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof StopNavigationRequest) {
                return getUnknownFields().equals(((StopNavigationRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StopNavigationRequest> getParserForType() {
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
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StopNavigationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StopNavigationRequest.class, Builder.class);
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
            return new StopNavigationRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StopNavigationRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StopNavigationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopNavigationRequest build() {
                StopNavigationRequest stopNavigationRequestBuildPartial = buildPartial();
                if (stopNavigationRequestBuildPartial.isInitialized()) {
                    return stopNavigationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stopNavigationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopNavigationRequest buildPartial() {
                StopNavigationRequest stopNavigationRequest = new StopNavigationRequest(this);
                onBuilt();
                return stopNavigationRequest;
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
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StopNavigationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StopNavigationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StopNavigationRequest.class, Builder.class);
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
            public StopNavigationRequest getDefaultInstanceForType() {
                return StopNavigationRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StopNavigationRequest) {
                    return mergeFrom((StopNavigationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StopNavigationRequest stopNavigationRequest) {
                if (stopNavigationRequest == StopNavigationRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(stopNavigationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StopNavigationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StopNavigationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StopNavigationRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StopNavigationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopNavigationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopNavigationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StopNavigationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StopNavigationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StopNavigationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StopNavigationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StopNavigationRequest parseFrom(InputStream inputStream) {
            return (StopNavigationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StopNavigationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopNavigationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopNavigationRequest parseFrom(CodedInputStream codedInputStream) {
            return (StopNavigationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StopNavigationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopNavigationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StopNavigationResponse extends GeneratedMessageV3 implements StopNavigationResponseOrBuilder {
        public static final int NAV_STOPPED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean navStopped_;
        private static final StopNavigationResponse DEFAULT_INSTANCE = new StopNavigationResponse();

        @Deprecated
        public static final Parser<StopNavigationResponse> PARSER = new AbstractParser<StopNavigationResponse>() { // from class: com.garmin.proto.generated.GDINavigationSyncProto.StopNavigationResponse.1
            @Override // com.google.protobuf.Parser
            public StopNavigationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StopNavigationResponse.newBuilder();
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

        private StopNavigationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.navStopped_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StopNavigationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StopNavigationResponse_descriptor;
        }

        public static Builder newBuilder(StopNavigationResponse stopNavigationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stopNavigationResponse);
        }

        public static StopNavigationResponse parseDelimitedFrom(InputStream inputStream) {
            return (StopNavigationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StopNavigationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StopNavigationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StopNavigationResponse)) {
                return super.equals(obj);
            }
            StopNavigationResponse stopNavigationResponse = (StopNavigationResponse) obj;
            if (hasNavStopped() != stopNavigationResponse.hasNavStopped()) {
                return false;
            }
            return (!hasNavStopped() || getNavStopped() == stopNavigationResponse.getNavStopped()) && getUnknownFields().equals(stopNavigationResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StopNavigationResponseOrBuilder
        public boolean getNavStopped() {
            return this.navStopped_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StopNavigationResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.navStopped_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StopNavigationResponseOrBuilder
        public boolean hasNavStopped() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNavStopped()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getNavStopped());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StopNavigationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StopNavigationResponse.class, Builder.class);
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
            return new StopNavigationResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.navStopped_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StopNavigationResponseOrBuilder {
            private int bitField0_;
            private boolean navStopped_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(StopNavigationResponse stopNavigationResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stopNavigationResponse.navStopped_ = this.navStopped_;
                } else {
                    i14 = 0;
                }
                stopNavigationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StopNavigationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopNavigationResponse build() {
                StopNavigationResponse stopNavigationResponseBuildPartial = buildPartial();
                if (stopNavigationResponseBuildPartial.isInitialized()) {
                    return stopNavigationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stopNavigationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StopNavigationResponse buildPartial() {
                StopNavigationResponse stopNavigationResponse = new StopNavigationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stopNavigationResponse);
                }
                onBuilt();
                return stopNavigationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.navStopped_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNavStopped() {
                this.bitField0_ &= -2;
                this.navStopped_ = false;
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
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StopNavigationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StopNavigationResponseOrBuilder
            public boolean getNavStopped() {
                return this.navStopped_;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StopNavigationResponseOrBuilder
            public boolean hasNavStopped() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StopNavigationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StopNavigationResponse.class, Builder.class);
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
                                    this.navStopped_ = codedInputStream.readBool();
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

            public Builder setNavStopped(boolean z14) {
                this.navStopped_ = z14;
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
            public StopNavigationResponse getDefaultInstanceForType() {
                return StopNavigationResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StopNavigationResponse) {
                    return mergeFrom((StopNavigationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StopNavigationResponse stopNavigationResponse) {
                if (stopNavigationResponse == StopNavigationResponse.getDefaultInstance()) {
                    return this;
                }
                if (stopNavigationResponse.hasNavStopped()) {
                    setNavStopped(stopNavigationResponse.getNavStopped());
                }
                mergeUnknownFields(stopNavigationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StopNavigationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StopNavigationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopNavigationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopNavigationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StopNavigationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StopNavigationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StopNavigationResponse() {
            this.navStopped_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StopNavigationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StopNavigationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StopNavigationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StopNavigationResponse parseFrom(InputStream inputStream) {
            return (StopNavigationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StopNavigationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopNavigationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StopNavigationResponse parseFrom(CodedInputStream codedInputStream) {
            return (StopNavigationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StopNavigationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StopNavigationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class NavigationDetails extends GeneratedMessageV3 implements NavigationDetailsOrBuilder {
        public static final int NAVIGATION_DETAILS_FIELD_NUMBER = 1002;
        public static final int STATE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private State state_;
        private static final NavigationDetails DEFAULT_INSTANCE = new NavigationDetails();

        @Deprecated
        public static final Parser<NavigationDetails> PARSER = new AbstractParser<NavigationDetails>() { // from class: com.garmin.proto.generated.GDINavigationSyncProto.NavigationDetails.1
            @Override // com.google.protobuf.Parser
            public NavigationDetails parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = NavigationDetails.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, NavigationDetails> navigationDetails = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, NavigationDetails.class, getDefaultInstance());

        private NavigationDetails(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NavigationDetails getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_NavigationDetails_descriptor;
        }

        public static Builder newBuilder(NavigationDetails navigationDetails2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(navigationDetails2);
        }

        public static NavigationDetails parseDelimitedFrom(InputStream inputStream) {
            return (NavigationDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NavigationDetails parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<NavigationDetails> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NavigationDetails)) {
                return super.equals(obj);
            }
            NavigationDetails navigationDetails2 = (NavigationDetails) obj;
            if (hasState() != navigationDetails2.hasState()) {
                return false;
            }
            return (!hasState() || getState().equals(navigationDetails2.getState())) && getUnknownFields().equals(navigationDetails2.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NavigationDetails> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getState()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationDetailsOrBuilder
        public State getState() {
            State state = this.state_;
            return state == null ? State.getDefaultInstance() : state;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationDetailsOrBuilder
        public StateOrBuilder getStateOrBuilder() {
            State state = this.state_;
            return state == null ? State.getDefaultInstance() : state;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationDetailsOrBuilder
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
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getState().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_NavigationDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(NavigationDetails.class, Builder.class);
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
            return new NavigationDetails();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getState());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NavigationDetailsOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> stateBuilder_;
            private State state_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(NavigationDetails navigationDetails) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                    navigationDetails.state_ = singleFieldBuilderV3 == null ? this.state_ : (State) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                navigationDetails.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_NavigationDetails_descriptor;
            }

            private SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> getStateFieldBuilder() {
                if (this.stateBuilder_ == null) {
                    this.stateBuilder_ = new SingleFieldBuilderV3<>(getState(), getParentForChildren(), isClean());
                    this.state_ = null;
                }
                return this.stateBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStateFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NavigationDetails build() {
                NavigationDetails navigationDetailsBuildPartial = buildPartial();
                if (navigationDetailsBuildPartial.isInitialized()) {
                    return navigationDetailsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) navigationDetailsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NavigationDetails buildPartial() {
                NavigationDetails navigationDetails = new NavigationDetails(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(navigationDetails);
                }
                onBuilt();
                return navigationDetails;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = null;
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stateBuilder_ = null;
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

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = null;
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stateBuilder_ = null;
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
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_NavigationDetails_descriptor;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationDetailsOrBuilder
            public State getState() {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (State) singleFieldBuilderV3.getMessage();
                }
                State state = this.state_;
                return state == null ? State.getDefaultInstance() : state;
            }

            public State.Builder getStateBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (State.Builder) getStateFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationDetailsOrBuilder
            public StateOrBuilder getStateOrBuilder() {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StateOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                State state = this.state_;
                return state == null ? State.getDefaultInstance() : state;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationDetailsOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_NavigationDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(NavigationDetails.class, Builder.class);
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
                                    codedInputStream.readMessage(getStateFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeState(State state) {
                State state2;
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(state);
                } else if ((this.bitField0_ & 1) == 0 || (state2 = this.state_) == null || state2 == State.getDefaultInstance()) {
                    this.state_ = state;
                } else {
                    getStateBuilder().mergeFrom(state);
                }
                if (this.state_ != null) {
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

            public Builder setState(State.Builder builder) {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.state_ = builder.build();
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
            public NavigationDetails getDefaultInstanceForType() {
                return NavigationDetails.getDefaultInstance();
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

            public Builder setState(State state) {
                SingleFieldBuilderV3<State, State.Builder, StateOrBuilder> singleFieldBuilderV3 = this.stateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    state.getClass();
                    this.state_ = state;
                } else {
                    singleFieldBuilderV3.setMessage(state);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NavigationDetails) {
                    return mergeFrom((NavigationDetails) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(NavigationDetails navigationDetails) {
                if (navigationDetails == NavigationDetails.getDefaultInstance()) {
                    return this;
                }
                if (navigationDetails.hasState()) {
                    mergeState(navigationDetails.getState());
                }
                mergeUnknownFields(navigationDetails.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NavigationDetails getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ NavigationDetails(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private NavigationDetails() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NavigationDetails parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NavigationDetails parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static NavigationDetails parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NavigationDetails parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NavigationDetails parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NavigationDetails parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static NavigationDetails parseFrom(InputStream inputStream) {
            return (NavigationDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static NavigationDetails parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NavigationDetails parseFrom(CodedInputStream codedInputStream) {
            return (NavigationDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static NavigationDetails parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class NavigationItem extends GeneratedMessageV3.ExtendableMessage<NavigationItem> implements NavigationItemOrBuilder {
        public static final int NAVIGATION_TYPE_FIELD_NUMBER = 1;
        public static final int POSITION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int navigationType_;
        private GDIDataTypes.ScPoint position_;
        private static final NavigationItem DEFAULT_INSTANCE = new NavigationItem();

        @Deprecated
        public static final Parser<NavigationItem> PARSER = new AbstractParser<NavigationItem>() { // from class: com.garmin.proto.generated.GDINavigationSyncProto.NavigationItem.1
            @Override // com.google.protobuf.Parser
            public NavigationItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = NavigationItem.newBuilder();
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

        private NavigationItem(GeneratedMessageV3.ExtendableBuilder<NavigationItem, ?> extendableBuilder) {
            super(extendableBuilder);
            this.navigationType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NavigationItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_NavigationItem_descriptor;
        }

        public static Builder newBuilder(NavigationItem navigationItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(navigationItem);
        }

        public static NavigationItem parseDelimitedFrom(InputStream inputStream) {
            return (NavigationItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NavigationItem parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<NavigationItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NavigationItem)) {
                return super.equals(obj);
            }
            NavigationItem navigationItem = (NavigationItem) obj;
            if (hasNavigationType() != navigationItem.hasNavigationType()) {
                return false;
            }
            if ((!hasNavigationType() || this.navigationType_ == navigationItem.navigationType_) && hasPosition() == navigationItem.hasPosition()) {
                return (!hasPosition() || getPosition().equals(navigationItem.getPosition())) && getUnknownFields().equals(navigationItem.getUnknownFields()) && getExtensionFields().equals(navigationItem.getExtensionFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationItemOrBuilder
        public NavType getNavigationType() {
            NavType navTypeForNumber = NavType.forNumber(this.navigationType_);
            return navTypeForNumber == null ? NavType.POSITION : navTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NavigationItem> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationItemOrBuilder
        public GDIDataTypes.ScPoint getPosition() {
            GDIDataTypes.ScPoint scPoint = this.position_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationItemOrBuilder
        public GDIDataTypes.ScPointOrBuilder getPositionOrBuilder() {
            GDIDataTypes.ScPoint scPoint = this.position_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.navigationType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getPosition());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationItemOrBuilder
        public boolean hasNavigationType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationItemOrBuilder
        public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNavigationType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.navigationType_;
            }
            if (hasPosition()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPosition().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (AbstractMessage.hashFields(iHashCode, getExtensionFields()) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_NavigationItem_fieldAccessorTable.ensureFieldAccessorsInitialized(NavigationItem.class, Builder.class);
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
            if (hasPosition() && !getPosition().isInitialized()) {
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
            return new NavigationItem();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.navigationType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getPosition());
            }
            extensionWriterNewExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<NavigationItem, Builder> implements NavigationItemOrBuilder {
            private int bitField0_;
            private int navigationType_;
            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> positionBuilder_;
            private GDIDataTypes.ScPoint position_;

            private Builder() {
                this.navigationType_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(NavigationItem navigationItem) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    navigationItem.navigationType_ = this.navigationType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                    navigationItem.position_ = singleFieldBuilderV3 == null ? this.position_ : (GDIDataTypes.ScPoint) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                navigationItem.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_NavigationItem_descriptor;
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

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder addExtension(GeneratedMessage.GeneratedExtension<NavigationItem, List<Type>> generatedExtension, Type type) {
                return (Builder) super.addExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NavigationItem build() {
                NavigationItem navigationItemBuildPartial = buildPartial();
                if (navigationItemBuildPartial.isInitialized()) {
                    return navigationItemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) navigationItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NavigationItem buildPartial() {
                NavigationItem navigationItem = new NavigationItem(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(navigationItem);
                }
                onBuilt();
                return navigationItem;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.navigationType_ = 0;
                this.position_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <T> Builder clearExtension(GeneratedMessage.GeneratedExtension<NavigationItem, T> generatedExtension) {
                return (Builder) super.clearExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNavigationType() {
                this.bitField0_ &= -2;
                this.navigationType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPosition() {
                this.bitField0_ &= -3;
                this.position_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
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
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_NavigationItem_descriptor;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationItemOrBuilder
            public NavType getNavigationType() {
                NavType navTypeForNumber = NavType.forNumber(this.navigationType_);
                return navTypeForNumber == null ? NavType.POSITION : navTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationItemOrBuilder
            public GDIDataTypes.ScPoint getPosition() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPoint) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.ScPoint scPoint = this.position_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            public GDIDataTypes.ScPoint.Builder getPositionBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GDIDataTypes.ScPoint.Builder) getPositionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationItemOrBuilder
            public GDIDataTypes.ScPointOrBuilder getPositionOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.ScPoint scPoint = this.position_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationItemOrBuilder
            public boolean hasNavigationType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.NavigationItemOrBuilder
            public boolean hasPosition() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_NavigationItem_fieldAccessorTable.ensureFieldAccessorsInitialized(NavigationItem.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return (!hasPosition() || getPosition().isInitialized()) && extensionsAreInitialized();
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
                                    if (NavType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.navigationType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getPositionFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergePosition(GDIDataTypes.ScPoint scPoint) {
                GDIDataTypes.ScPoint scPoint2;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 2) == 0 || (scPoint2 = this.position_) == null || scPoint2 == GDIDataTypes.ScPoint.getDefaultInstance()) {
                    this.position_ = scPoint;
                } else {
                    getPositionBuilder().mergeFrom(scPoint);
                }
                if (this.position_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<NavigationItem, Type> generatedExtension, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, Type>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setNavigationType(NavType navType) {
                navType.getClass();
                this.bitField0_ |= 1;
                this.navigationType_ = navType.getNumber();
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
                this.bitField0_ |= 2;
                onChanged();
                return this;
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
            public NavigationItem getDefaultInstanceForType() {
                return NavigationItem.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return addExtension((GeneratedMessage.GeneratedExtension<NavigationItem, List<Object>>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<NavigationItem, Object>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, int i14, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<NavigationItem, List<Object>>) generatedExtension, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<NavigationItem, List<Type>> generatedExtension, int i14, Type type) {
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
                this.navigationType_ = 0;
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
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NavigationItem) {
                    return mergeFrom((NavigationItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(NavigationItem navigationItem) {
                if (navigationItem == NavigationItem.getDefaultInstance()) {
                    return this;
                }
                if (navigationItem.hasNavigationType()) {
                    setNavigationType(navigationItem.getNavigationType());
                }
                if (navigationItem.hasPosition()) {
                    mergePosition(navigationItem.getPosition());
                }
                mergeExtensionFields(navigationItem);
                mergeUnknownFields(navigationItem.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NavigationItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static NavigationItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NavigationItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ NavigationItem(Builder builder) {
            this((GeneratedMessageV3.ExtendableBuilder<NavigationItem, ?>) builder);
        }

        public static NavigationItem parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private NavigationItem() {
            this.memoizedIsInitialized = (byte) -1;
            this.navigationType_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NavigationItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NavigationItem parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NavigationItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static NavigationItem parseFrom(InputStream inputStream) {
            return (NavigationItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static NavigationItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NavigationItem parseFrom(CodedInputStream codedInputStream) {
            return (NavigationItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static NavigationItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDINavigationSyncProto.Service.1
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
        public static final int START_REQUEST_FIELD_NUMBER = 1;
        public static final int START_RESPONSE_FIELD_NUMBER = 2;
        public static final int STOP_REQUEST_FIELD_NUMBER = 3;
        public static final int STOP_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private StartNavigationRequest startRequest_;
        private StartNavigationResponse startResponse_;
        private StopNavigationRequest stopRequest_;
        private StopNavigationResponse stopResponse_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_Service_descriptor;
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
            if (hasStartRequest() != service.hasStartRequest()) {
                return false;
            }
            if ((hasStartRequest() && !getStartRequest().equals(service.getStartRequest())) || hasStartResponse() != service.hasStartResponse()) {
                return false;
            }
            if ((hasStartResponse() && !getStartResponse().equals(service.getStartResponse())) || hasStopRequest() != service.hasStopRequest()) {
                return false;
            }
            if ((!hasStopRequest() || getStopRequest().equals(service.getStopRequest())) && hasStopResponse() == service.hasStopResponse()) {
                return (!hasStopResponse() || getStopResponse().equals(service.getStopResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getStartRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getStartResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getStopRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getStopResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public StartNavigationRequest getStartRequest() {
            StartNavigationRequest startNavigationRequest = this.startRequest_;
            return startNavigationRequest == null ? StartNavigationRequest.getDefaultInstance() : startNavigationRequest;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public StartNavigationRequestOrBuilder getStartRequestOrBuilder() {
            StartNavigationRequest startNavigationRequest = this.startRequest_;
            return startNavigationRequest == null ? StartNavigationRequest.getDefaultInstance() : startNavigationRequest;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public StartNavigationResponse getStartResponse() {
            StartNavigationResponse startNavigationResponse = this.startResponse_;
            return startNavigationResponse == null ? StartNavigationResponse.getDefaultInstance() : startNavigationResponse;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public StartNavigationResponseOrBuilder getStartResponseOrBuilder() {
            StartNavigationResponse startNavigationResponse = this.startResponse_;
            return startNavigationResponse == null ? StartNavigationResponse.getDefaultInstance() : startNavigationResponse;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public StopNavigationRequest getStopRequest() {
            StopNavigationRequest stopNavigationRequest = this.stopRequest_;
            return stopNavigationRequest == null ? StopNavigationRequest.getDefaultInstance() : stopNavigationRequest;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public StopNavigationRequestOrBuilder getStopRequestOrBuilder() {
            StopNavigationRequest stopNavigationRequest = this.stopRequest_;
            return stopNavigationRequest == null ? StopNavigationRequest.getDefaultInstance() : stopNavigationRequest;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public StopNavigationResponse getStopResponse() {
            StopNavigationResponse stopNavigationResponse = this.stopResponse_;
            return stopNavigationResponse == null ? StopNavigationResponse.getDefaultInstance() : stopNavigationResponse;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public StopNavigationResponseOrBuilder getStopResponseOrBuilder() {
            StopNavigationResponse stopNavigationResponse = this.stopResponse_;
            return stopNavigationResponse == null ? StopNavigationResponse.getDefaultInstance() : stopNavigationResponse;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public boolean hasStartRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public boolean hasStartResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public boolean hasStopRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
        public boolean hasStopResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStartRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStartRequest().hashCode();
            }
            if (hasStartResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStartResponse().hashCode();
            }
            if (hasStopRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStopRequest().hashCode();
            }
            if (hasStopResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getStopResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if (!hasStartRequest() || getStartRequest().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getStartRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getStartResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getStopRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getStopResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<StartNavigationRequest, StartNavigationRequest.Builder, StartNavigationRequestOrBuilder> startRequestBuilder_;
            private StartNavigationRequest startRequest_;
            private SingleFieldBuilderV3<StartNavigationResponse, StartNavigationResponse.Builder, StartNavigationResponseOrBuilder> startResponseBuilder_;
            private StartNavigationResponse startResponse_;
            private SingleFieldBuilderV3<StopNavigationRequest, StopNavigationRequest.Builder, StopNavigationRequestOrBuilder> stopRequestBuilder_;
            private StopNavigationRequest stopRequest_;
            private SingleFieldBuilderV3<StopNavigationResponse, StopNavigationResponse.Builder, StopNavigationResponseOrBuilder> stopResponseBuilder_;
            private StopNavigationResponse stopResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<StartNavigationRequest, StartNavigationRequest.Builder, StartNavigationRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                    service.startRequest_ = singleFieldBuilderV3 == null ? this.startRequest_ : (StartNavigationRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<StartNavigationResponse, StartNavigationResponse.Builder, StartNavigationResponseOrBuilder> singleFieldBuilderV4 = this.startResponseBuilder_;
                    service.startResponse_ = singleFieldBuilderV4 == null ? this.startResponse_ : (StartNavigationResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<StopNavigationRequest, StopNavigationRequest.Builder, StopNavigationRequestOrBuilder> singleFieldBuilderV5 = this.stopRequestBuilder_;
                    service.stopRequest_ = singleFieldBuilderV5 == null ? this.stopRequest_ : (StopNavigationRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<StopNavigationResponse, StopNavigationResponse.Builder, StopNavigationResponseOrBuilder> singleFieldBuilderV6 = this.stopResponseBuilder_;
                    service.stopResponse_ = singleFieldBuilderV6 == null ? this.stopResponse_ : (StopNavigationResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_Service_descriptor;
            }

            private SingleFieldBuilderV3<StartNavigationRequest, StartNavigationRequest.Builder, StartNavigationRequestOrBuilder> getStartRequestFieldBuilder() {
                if (this.startRequestBuilder_ == null) {
                    this.startRequestBuilder_ = new SingleFieldBuilderV3<>(getStartRequest(), getParentForChildren(), isClean());
                    this.startRequest_ = null;
                }
                return this.startRequestBuilder_;
            }

            private SingleFieldBuilderV3<StartNavigationResponse, StartNavigationResponse.Builder, StartNavigationResponseOrBuilder> getStartResponseFieldBuilder() {
                if (this.startResponseBuilder_ == null) {
                    this.startResponseBuilder_ = new SingleFieldBuilderV3<>(getStartResponse(), getParentForChildren(), isClean());
                    this.startResponse_ = null;
                }
                return this.startResponseBuilder_;
            }

            private SingleFieldBuilderV3<StopNavigationRequest, StopNavigationRequest.Builder, StopNavigationRequestOrBuilder> getStopRequestFieldBuilder() {
                if (this.stopRequestBuilder_ == null) {
                    this.stopRequestBuilder_ = new SingleFieldBuilderV3<>(getStopRequest(), getParentForChildren(), isClean());
                    this.stopRequest_ = null;
                }
                return this.stopRequestBuilder_;
            }

            private SingleFieldBuilderV3<StopNavigationResponse, StopNavigationResponse.Builder, StopNavigationResponseOrBuilder> getStopResponseFieldBuilder() {
                if (this.stopResponseBuilder_ == null) {
                    this.stopResponseBuilder_ = new SingleFieldBuilderV3<>(getStopResponse(), getParentForChildren(), isClean());
                    this.stopResponse_ = null;
                }
                return this.stopResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStartRequestFieldBuilder();
                    getStartResponseFieldBuilder();
                    getStopRequestFieldBuilder();
                    getStopResponseFieldBuilder();
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
                this.startRequest_ = null;
                SingleFieldBuilderV3<StartNavigationRequest, StartNavigationRequest.Builder, StartNavigationRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startRequestBuilder_ = null;
                }
                this.startResponse_ = null;
                SingleFieldBuilderV3<StartNavigationResponse, StartNavigationResponse.Builder, StartNavigationResponseOrBuilder> singleFieldBuilderV4 = this.startResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.startResponseBuilder_ = null;
                }
                this.stopRequest_ = null;
                SingleFieldBuilderV3<StopNavigationRequest, StopNavigationRequest.Builder, StopNavigationRequestOrBuilder> singleFieldBuilderV5 = this.stopRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.stopRequestBuilder_ = null;
                }
                this.stopResponse_ = null;
                SingleFieldBuilderV3<StopNavigationResponse, StopNavigationResponse.Builder, StopNavigationResponseOrBuilder> singleFieldBuilderV6 = this.stopResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.stopResponseBuilder_ = null;
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

            public Builder clearStartRequest() {
                this.bitField0_ &= -2;
                this.startRequest_ = null;
                SingleFieldBuilderV3<StartNavigationRequest, StartNavigationRequest.Builder, StartNavigationRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartResponse() {
                this.bitField0_ &= -3;
                this.startResponse_ = null;
                SingleFieldBuilderV3<StartNavigationResponse, StartNavigationResponse.Builder, StartNavigationResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStopRequest() {
                this.bitField0_ &= -5;
                this.stopRequest_ = null;
                SingleFieldBuilderV3<StopNavigationRequest, StopNavigationRequest.Builder, StopNavigationRequestOrBuilder> singleFieldBuilderV3 = this.stopRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stopRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStopResponse() {
                this.bitField0_ &= -9;
                this.stopResponse_ = null;
                SingleFieldBuilderV3<StopNavigationResponse, StopNavigationResponse.Builder, StopNavigationResponseOrBuilder> singleFieldBuilderV3 = this.stopResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stopResponseBuilder_ = null;
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
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public StartNavigationRequest getStartRequest() {
                SingleFieldBuilderV3<StartNavigationRequest, StartNavigationRequest.Builder, StartNavigationRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartNavigationRequest) singleFieldBuilderV3.getMessage();
                }
                StartNavigationRequest startNavigationRequest = this.startRequest_;
                return startNavigationRequest == null ? StartNavigationRequest.getDefaultInstance() : startNavigationRequest;
            }

            public StartNavigationRequest.Builder getStartRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (StartNavigationRequest.Builder) getStartRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public StartNavigationRequestOrBuilder getStartRequestOrBuilder() {
                SingleFieldBuilderV3<StartNavigationRequest, StartNavigationRequest.Builder, StartNavigationRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartNavigationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartNavigationRequest startNavigationRequest = this.startRequest_;
                return startNavigationRequest == null ? StartNavigationRequest.getDefaultInstance() : startNavigationRequest;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public StartNavigationResponse getStartResponse() {
                SingleFieldBuilderV3<StartNavigationResponse, StartNavigationResponse.Builder, StartNavigationResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartNavigationResponse) singleFieldBuilderV3.getMessage();
                }
                StartNavigationResponse startNavigationResponse = this.startResponse_;
                return startNavigationResponse == null ? StartNavigationResponse.getDefaultInstance() : startNavigationResponse;
            }

            public StartNavigationResponse.Builder getStartResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (StartNavigationResponse.Builder) getStartResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public StartNavigationResponseOrBuilder getStartResponseOrBuilder() {
                SingleFieldBuilderV3<StartNavigationResponse, StartNavigationResponse.Builder, StartNavigationResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartNavigationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartNavigationResponse startNavigationResponse = this.startResponse_;
                return startNavigationResponse == null ? StartNavigationResponse.getDefaultInstance() : startNavigationResponse;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public StopNavigationRequest getStopRequest() {
                SingleFieldBuilderV3<StopNavigationRequest, StopNavigationRequest.Builder, StopNavigationRequestOrBuilder> singleFieldBuilderV3 = this.stopRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopNavigationRequest) singleFieldBuilderV3.getMessage();
                }
                StopNavigationRequest stopNavigationRequest = this.stopRequest_;
                return stopNavigationRequest == null ? StopNavigationRequest.getDefaultInstance() : stopNavigationRequest;
            }

            public StopNavigationRequest.Builder getStopRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (StopNavigationRequest.Builder) getStopRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public StopNavigationRequestOrBuilder getStopRequestOrBuilder() {
                SingleFieldBuilderV3<StopNavigationRequest, StopNavigationRequest.Builder, StopNavigationRequestOrBuilder> singleFieldBuilderV3 = this.stopRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopNavigationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StopNavigationRequest stopNavigationRequest = this.stopRequest_;
                return stopNavigationRequest == null ? StopNavigationRequest.getDefaultInstance() : stopNavigationRequest;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public StopNavigationResponse getStopResponse() {
                SingleFieldBuilderV3<StopNavigationResponse, StopNavigationResponse.Builder, StopNavigationResponseOrBuilder> singleFieldBuilderV3 = this.stopResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopNavigationResponse) singleFieldBuilderV3.getMessage();
                }
                StopNavigationResponse stopNavigationResponse = this.stopResponse_;
                return stopNavigationResponse == null ? StopNavigationResponse.getDefaultInstance() : stopNavigationResponse;
            }

            public StopNavigationResponse.Builder getStopResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (StopNavigationResponse.Builder) getStopResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public StopNavigationResponseOrBuilder getStopResponseOrBuilder() {
                SingleFieldBuilderV3<StopNavigationResponse, StopNavigationResponse.Builder, StopNavigationResponseOrBuilder> singleFieldBuilderV3 = this.stopResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StopNavigationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StopNavigationResponse stopNavigationResponse = this.stopResponse_;
                return stopNavigationResponse == null ? StopNavigationResponse.getDefaultInstance() : stopNavigationResponse;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public boolean hasStartRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public boolean hasStartResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public boolean hasStopRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.ServiceOrBuilder
            public boolean hasStopResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasStartRequest() || getStartRequest().isInitialized();
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
                                    codedInputStream.readMessage(getStartRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getStartResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getStopRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getStopResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeStartRequest(StartNavigationRequest startNavigationRequest) {
                StartNavigationRequest startNavigationRequest2;
                SingleFieldBuilderV3<StartNavigationRequest, StartNavigationRequest.Builder, StartNavigationRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startNavigationRequest);
                } else if ((this.bitField0_ & 1) == 0 || (startNavigationRequest2 = this.startRequest_) == null || startNavigationRequest2 == StartNavigationRequest.getDefaultInstance()) {
                    this.startRequest_ = startNavigationRequest;
                } else {
                    getStartRequestBuilder().mergeFrom(startNavigationRequest);
                }
                if (this.startRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartResponse(StartNavigationResponse startNavigationResponse) {
                StartNavigationResponse startNavigationResponse2;
                SingleFieldBuilderV3<StartNavigationResponse, StartNavigationResponse.Builder, StartNavigationResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startNavigationResponse);
                } else if ((this.bitField0_ & 2) == 0 || (startNavigationResponse2 = this.startResponse_) == null || startNavigationResponse2 == StartNavigationResponse.getDefaultInstance()) {
                    this.startResponse_ = startNavigationResponse;
                } else {
                    getStartResponseBuilder().mergeFrom(startNavigationResponse);
                }
                if (this.startResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStopRequest(StopNavigationRequest stopNavigationRequest) {
                StopNavigationRequest stopNavigationRequest2;
                SingleFieldBuilderV3<StopNavigationRequest, StopNavigationRequest.Builder, StopNavigationRequestOrBuilder> singleFieldBuilderV3 = this.stopRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stopNavigationRequest);
                } else if ((this.bitField0_ & 4) == 0 || (stopNavigationRequest2 = this.stopRequest_) == null || stopNavigationRequest2 == StopNavigationRequest.getDefaultInstance()) {
                    this.stopRequest_ = stopNavigationRequest;
                } else {
                    getStopRequestBuilder().mergeFrom(stopNavigationRequest);
                }
                if (this.stopRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStopResponse(StopNavigationResponse stopNavigationResponse) {
                StopNavigationResponse stopNavigationResponse2;
                SingleFieldBuilderV3<StopNavigationResponse, StopNavigationResponse.Builder, StopNavigationResponseOrBuilder> singleFieldBuilderV3 = this.stopResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stopNavigationResponse);
                } else if ((this.bitField0_ & 8) == 0 || (stopNavigationResponse2 = this.stopResponse_) == null || stopNavigationResponse2 == StopNavigationResponse.getDefaultInstance()) {
                    this.stopResponse_ = stopNavigationResponse;
                } else {
                    getStopResponseBuilder().mergeFrom(stopNavigationResponse);
                }
                if (this.stopResponse_ != null) {
                    this.bitField0_ |= 8;
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

            public Builder setStartRequest(StartNavigationRequest.Builder builder) {
                SingleFieldBuilderV3<StartNavigationRequest, StartNavigationRequest.Builder, StartNavigationRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStartResponse(StartNavigationResponse.Builder builder) {
                SingleFieldBuilderV3<StartNavigationResponse, StartNavigationResponse.Builder, StartNavigationResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStopRequest(StopNavigationRequest.Builder builder) {
                SingleFieldBuilderV3<StopNavigationRequest, StopNavigationRequest.Builder, StopNavigationRequestOrBuilder> singleFieldBuilderV3 = this.stopRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stopRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStopResponse(StopNavigationResponse.Builder builder) {
                SingleFieldBuilderV3<StopNavigationResponse, StopNavigationResponse.Builder, StopNavigationResponseOrBuilder> singleFieldBuilderV3 = this.stopResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stopResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
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

            public Builder setStartRequest(StartNavigationRequest startNavigationRequest) {
                SingleFieldBuilderV3<StartNavigationRequest, StartNavigationRequest.Builder, StartNavigationRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startNavigationRequest.getClass();
                    this.startRequest_ = startNavigationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(startNavigationRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStartResponse(StartNavigationResponse startNavigationResponse) {
                SingleFieldBuilderV3<StartNavigationResponse, StartNavigationResponse.Builder, StartNavigationResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startNavigationResponse.getClass();
                    this.startResponse_ = startNavigationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(startNavigationResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStopRequest(StopNavigationRequest stopNavigationRequest) {
                SingleFieldBuilderV3<StopNavigationRequest, StopNavigationRequest.Builder, StopNavigationRequestOrBuilder> singleFieldBuilderV3 = this.stopRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stopNavigationRequest.getClass();
                    this.stopRequest_ = stopNavigationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(stopNavigationRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStopResponse(StopNavigationResponse stopNavigationResponse) {
                SingleFieldBuilderV3<StopNavigationResponse, StopNavigationResponse.Builder, StopNavigationResponseOrBuilder> singleFieldBuilderV3 = this.stopResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stopNavigationResponse.getClass();
                    this.stopResponse_ = stopNavigationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(stopNavigationResponse);
                }
                this.bitField0_ |= 8;
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
                if (service.hasStartRequest()) {
                    mergeStartRequest(service.getStartRequest());
                }
                if (service.hasStartResponse()) {
                    mergeStartResponse(service.getStartResponse());
                }
                if (service.hasStopRequest()) {
                    mergeStopRequest(service.getStopRequest());
                }
                if (service.hasStopResponse()) {
                    mergeStopResponse(service.getStopResponse());
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

    public static final class StartNavigationRequest extends GeneratedMessageV3 implements StartNavigationRequestOrBuilder {
        public static final int NAVIGATION_ITEM_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private NavigationItem navigationItem_;
        private static final StartNavigationRequest DEFAULT_INSTANCE = new StartNavigationRequest();

        @Deprecated
        public static final Parser<StartNavigationRequest> PARSER = new AbstractParser<StartNavigationRequest>() { // from class: com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationRequest.1
            @Override // com.google.protobuf.Parser
            public StartNavigationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartNavigationRequest.newBuilder();
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

        private StartNavigationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartNavigationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StartNavigationRequest_descriptor;
        }

        public static Builder newBuilder(StartNavigationRequest startNavigationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startNavigationRequest);
        }

        public static StartNavigationRequest parseDelimitedFrom(InputStream inputStream) {
            return (StartNavigationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartNavigationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartNavigationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartNavigationRequest)) {
                return super.equals(obj);
            }
            StartNavigationRequest startNavigationRequest = (StartNavigationRequest) obj;
            if (hasNavigationItem() != startNavigationRequest.hasNavigationItem()) {
                return false;
            }
            return (!hasNavigationItem() || getNavigationItem().equals(startNavigationRequest.getNavigationItem())) && getUnknownFields().equals(startNavigationRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationRequestOrBuilder
        public NavigationItem getNavigationItem() {
            NavigationItem navigationItem = this.navigationItem_;
            return navigationItem == null ? NavigationItem.getDefaultInstance() : navigationItem;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationRequestOrBuilder
        public NavigationItemOrBuilder getNavigationItemOrBuilder() {
            NavigationItem navigationItem = this.navigationItem_;
            return navigationItem == null ? NavigationItem.getDefaultInstance() : navigationItem;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartNavigationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getNavigationItem()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationRequestOrBuilder
        public boolean hasNavigationItem() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNavigationItem()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getNavigationItem().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StartNavigationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartNavigationRequest.class, Builder.class);
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
            if (!hasNavigationItem() || getNavigationItem().isInitialized()) {
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
            return new StartNavigationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getNavigationItem());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartNavigationRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<NavigationItem, NavigationItem.Builder, NavigationItemOrBuilder> navigationItemBuilder_;
            private NavigationItem navigationItem_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(StartNavigationRequest startNavigationRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<NavigationItem, NavigationItem.Builder, NavigationItemOrBuilder> singleFieldBuilderV3 = this.navigationItemBuilder_;
                    startNavigationRequest.navigationItem_ = singleFieldBuilderV3 == null ? this.navigationItem_ : (NavigationItem) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                startNavigationRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StartNavigationRequest_descriptor;
            }

            private SingleFieldBuilderV3<NavigationItem, NavigationItem.Builder, NavigationItemOrBuilder> getNavigationItemFieldBuilder() {
                if (this.navigationItemBuilder_ == null) {
                    this.navigationItemBuilder_ = new SingleFieldBuilderV3<>(getNavigationItem(), getParentForChildren(), isClean());
                    this.navigationItem_ = null;
                }
                return this.navigationItemBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getNavigationItemFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartNavigationRequest build() {
                StartNavigationRequest startNavigationRequestBuildPartial = buildPartial();
                if (startNavigationRequestBuildPartial.isInitialized()) {
                    return startNavigationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startNavigationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartNavigationRequest buildPartial() {
                StartNavigationRequest startNavigationRequest = new StartNavigationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startNavigationRequest);
                }
                onBuilt();
                return startNavigationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.navigationItem_ = null;
                SingleFieldBuilderV3<NavigationItem, NavigationItem.Builder, NavigationItemOrBuilder> singleFieldBuilderV3 = this.navigationItemBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.navigationItemBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNavigationItem() {
                this.bitField0_ &= -2;
                this.navigationItem_ = null;
                SingleFieldBuilderV3<NavigationItem, NavigationItem.Builder, NavigationItemOrBuilder> singleFieldBuilderV3 = this.navigationItemBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.navigationItemBuilder_ = null;
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
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StartNavigationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationRequestOrBuilder
            public NavigationItem getNavigationItem() {
                SingleFieldBuilderV3<NavigationItem, NavigationItem.Builder, NavigationItemOrBuilder> singleFieldBuilderV3 = this.navigationItemBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NavigationItem) singleFieldBuilderV3.getMessage();
                }
                NavigationItem navigationItem = this.navigationItem_;
                return navigationItem == null ? NavigationItem.getDefaultInstance() : navigationItem;
            }

            public NavigationItem.Builder getNavigationItemBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (NavigationItem.Builder) getNavigationItemFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationRequestOrBuilder
            public NavigationItemOrBuilder getNavigationItemOrBuilder() {
                SingleFieldBuilderV3<NavigationItem, NavigationItem.Builder, NavigationItemOrBuilder> singleFieldBuilderV3 = this.navigationItemBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NavigationItemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                NavigationItem navigationItem = this.navigationItem_;
                return navigationItem == null ? NavigationItem.getDefaultInstance() : navigationItem;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationRequestOrBuilder
            public boolean hasNavigationItem() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StartNavigationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartNavigationRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasNavigationItem() || getNavigationItem().isInitialized();
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
                                    codedInputStream.readMessage(getNavigationItemFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeNavigationItem(NavigationItem navigationItem) {
                NavigationItem navigationItem2;
                SingleFieldBuilderV3<NavigationItem, NavigationItem.Builder, NavigationItemOrBuilder> singleFieldBuilderV3 = this.navigationItemBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(navigationItem);
                } else if ((this.bitField0_ & 1) == 0 || (navigationItem2 = this.navigationItem_) == null || navigationItem2 == NavigationItem.getDefaultInstance()) {
                    this.navigationItem_ = navigationItem;
                } else {
                    getNavigationItemBuilder().mergeFrom(navigationItem);
                }
                if (this.navigationItem_ != null) {
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

            public Builder setNavigationItem(NavigationItem.Builder builder) {
                SingleFieldBuilderV3<NavigationItem, NavigationItem.Builder, NavigationItemOrBuilder> singleFieldBuilderV3 = this.navigationItemBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.navigationItem_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StartNavigationRequest getDefaultInstanceForType() {
                return StartNavigationRequest.getDefaultInstance();
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

            public Builder setNavigationItem(NavigationItem navigationItem) {
                SingleFieldBuilderV3<NavigationItem, NavigationItem.Builder, NavigationItemOrBuilder> singleFieldBuilderV3 = this.navigationItemBuilder_;
                if (singleFieldBuilderV3 == null) {
                    navigationItem.getClass();
                    this.navigationItem_ = navigationItem;
                } else {
                    singleFieldBuilderV3.setMessage(navigationItem);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartNavigationRequest) {
                    return mergeFrom((StartNavigationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartNavigationRequest startNavigationRequest) {
                if (startNavigationRequest == StartNavigationRequest.getDefaultInstance()) {
                    return this;
                }
                if (startNavigationRequest.hasNavigationItem()) {
                    mergeNavigationItem(startNavigationRequest.getNavigationItem());
                }
                mergeUnknownFields(startNavigationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartNavigationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StartNavigationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StartNavigationRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartNavigationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartNavigationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartNavigationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StartNavigationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartNavigationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartNavigationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartNavigationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartNavigationRequest parseFrom(InputStream inputStream) {
            return (StartNavigationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartNavigationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartNavigationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartNavigationRequest parseFrom(CodedInputStream codedInputStream) {
            return (StartNavigationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartNavigationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartNavigationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StartNavigationResponse extends GeneratedMessageV3 implements StartNavigationResponseOrBuilder {
        public static final int NAV_RESPONSE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int navResponseStatus_;
        private static final StartNavigationResponse DEFAULT_INSTANCE = new StartNavigationResponse();

        @Deprecated
        public static final Parser<StartNavigationResponse> PARSER = new AbstractParser<StartNavigationResponse>() { // from class: com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationResponse.1
            @Override // com.google.protobuf.Parser
            public StartNavigationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartNavigationResponse.newBuilder();
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

        private StartNavigationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.navResponseStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartNavigationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StartNavigationResponse_descriptor;
        }

        public static Builder newBuilder(StartNavigationResponse startNavigationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startNavigationResponse);
        }

        public static StartNavigationResponse parseDelimitedFrom(InputStream inputStream) {
            return (StartNavigationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartNavigationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartNavigationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartNavigationResponse)) {
                return super.equals(obj);
            }
            StartNavigationResponse startNavigationResponse = (StartNavigationResponse) obj;
            if (hasNavResponseStatus() != startNavigationResponse.hasNavResponseStatus()) {
                return false;
            }
            return (!hasNavResponseStatus() || this.navResponseStatus_ == startNavigationResponse.navResponseStatus_) && getUnknownFields().equals(startNavigationResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationResponseOrBuilder
        public NavResponseStatus getNavResponseStatus() {
            NavResponseStatus navResponseStatusForNumber = NavResponseStatus.forNumber(this.navResponseStatus_);
            return navResponseStatusForNumber == null ? NavResponseStatus.NEED_ITEM : navResponseStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartNavigationResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.navResponseStatus_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationResponseOrBuilder
        public boolean hasNavResponseStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNavResponseStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.navResponseStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StartNavigationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartNavigationResponse.class, Builder.class);
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
            return new StartNavigationResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.navResponseStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartNavigationResponseOrBuilder {
            private int bitField0_;
            private int navResponseStatus_;

            private Builder() {
                this.navResponseStatus_ = 0;
            }

            private void buildPartial0(StartNavigationResponse startNavigationResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    startNavigationResponse.navResponseStatus_ = this.navResponseStatus_;
                } else {
                    i14 = 0;
                }
                startNavigationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StartNavigationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartNavigationResponse build() {
                StartNavigationResponse startNavigationResponseBuildPartial = buildPartial();
                if (startNavigationResponseBuildPartial.isInitialized()) {
                    return startNavigationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startNavigationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartNavigationResponse buildPartial() {
                StartNavigationResponse startNavigationResponse = new StartNavigationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startNavigationResponse);
                }
                onBuilt();
                return startNavigationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.navResponseStatus_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNavResponseStatus() {
                this.bitField0_ &= -2;
                this.navResponseStatus_ = 0;
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
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StartNavigationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationResponseOrBuilder
            public NavResponseStatus getNavResponseStatus() {
                NavResponseStatus navResponseStatusForNumber = NavResponseStatus.forNumber(this.navResponseStatus_);
                return navResponseStatusForNumber == null ? NavResponseStatus.NEED_ITEM : navResponseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StartNavigationResponseOrBuilder
            public boolean hasNavResponseStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_StartNavigationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartNavigationResponse.class, Builder.class);
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
                                    if (NavResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.navResponseStatus_ = i14;
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

            public Builder setNavResponseStatus(NavResponseStatus navResponseStatus) {
                navResponseStatus.getClass();
                this.bitField0_ |= 1;
                this.navResponseStatus_ = navResponseStatus.getNumber();
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
            public StartNavigationResponse getDefaultInstanceForType() {
                return StartNavigationResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.navResponseStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartNavigationResponse) {
                    return mergeFrom((StartNavigationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartNavigationResponse startNavigationResponse) {
                if (startNavigationResponse == StartNavigationResponse.getDefaultInstance()) {
                    return this;
                }
                if (startNavigationResponse.hasNavResponseStatus()) {
                    setNavResponseStatus(startNavigationResponse.getNavResponseStatus());
                }
                mergeUnknownFields(startNavigationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartNavigationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StartNavigationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartNavigationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartNavigationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StartNavigationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StartNavigationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StartNavigationResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.navResponseStatus_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartNavigationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartNavigationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartNavigationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartNavigationResponse parseFrom(InputStream inputStream) {
            return (StartNavigationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartNavigationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartNavigationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartNavigationResponse parseFrom(CodedInputStream codedInputStream) {
            return (StartNavigationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartNavigationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartNavigationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class State extends GeneratedMessageV3 implements StateOrBuilder {
        public static final int BEARING_FIELD_NUMBER = 5;
        public static final int DISTANCE_TO_DEST_FIELD_NUMBER = 3;
        public static final int HEADING_FIELD_NUMBER = 11;
        public static final int MOVING_AVG_FIELD_NUMBER = 6;
        public static final int MOVING_TIME_FIELD_NUMBER = 8;
        public static final int NEXT_NAV_INDEX_FIELD_NUMBER = 2;
        public static final int OFF_COURSE_DIST_FIELD_NUMBER = 10;
        public static final int OFF_COURSE_FIELD_NUMBER = 9;
        public static final int SPEED_FIELD_NUMBER = 7;
        public static final int STATE_FIELD_NUMBER = 1;
        public static final int TIME_TO_DEST_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bearing_;
        private int bitField0_;
        private int distanceToDest_;
        private int heading_;
        private byte memoizedIsInitialized;
        private float movingAvg_;
        private int movingTime_;
        private int nextNavIndex_;
        private float offCourseDist_;
        private boolean offCourse_;
        private float speed_;
        private int state_;
        private int timeToDest_;
        private static final State DEFAULT_INSTANCE = new State();

        @Deprecated
        public static final Parser<State> PARSER = new AbstractParser<State>() { // from class: com.garmin.proto.generated.GDINavigationSyncProto.State.1
            @Override // com.google.protobuf.Parser
            public State parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = State.newBuilder();
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

        private State(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.state_ = 0;
            this.nextNavIndex_ = 0;
            this.distanceToDest_ = 0;
            this.timeToDest_ = 0;
            this.bearing_ = 0;
            this.movingAvg_ = 0.0f;
            this.speed_ = 0.0f;
            this.movingTime_ = 0;
            this.offCourse_ = false;
            this.offCourseDist_ = 0.0f;
            this.heading_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static State getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_State_descriptor;
        }

        public static Builder newBuilder(State state) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(state);
        }

        public static State parseDelimitedFrom(InputStream inputStream) {
            return (State) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static State parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<State> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof State)) {
                return super.equals(obj);
            }
            State state = (State) obj;
            if (hasState() != state.hasState()) {
                return false;
            }
            if ((hasState() && this.state_ != state.state_) || hasNextNavIndex() != state.hasNextNavIndex()) {
                return false;
            }
            if ((hasNextNavIndex() && getNextNavIndex() != state.getNextNavIndex()) || hasDistanceToDest() != state.hasDistanceToDest()) {
                return false;
            }
            if ((hasDistanceToDest() && getDistanceToDest() != state.getDistanceToDest()) || hasTimeToDest() != state.hasTimeToDest()) {
                return false;
            }
            if ((hasTimeToDest() && getTimeToDest() != state.getTimeToDest()) || hasBearing() != state.hasBearing()) {
                return false;
            }
            if ((hasBearing() && getBearing() != state.getBearing()) || hasMovingAvg() != state.hasMovingAvg()) {
                return false;
            }
            if ((hasMovingAvg() && Float.floatToIntBits(getMovingAvg()) != Float.floatToIntBits(state.getMovingAvg())) || hasSpeed() != state.hasSpeed()) {
                return false;
            }
            if ((hasSpeed() && Float.floatToIntBits(getSpeed()) != Float.floatToIntBits(state.getSpeed())) || hasMovingTime() != state.hasMovingTime()) {
                return false;
            }
            if ((hasMovingTime() && getMovingTime() != state.getMovingTime()) || hasOffCourse() != state.hasOffCourse()) {
                return false;
            }
            if ((hasOffCourse() && getOffCourse() != state.getOffCourse()) || hasOffCourseDist() != state.hasOffCourseDist()) {
                return false;
            }
            if ((!hasOffCourseDist() || Float.floatToIntBits(getOffCourseDist()) == Float.floatToIntBits(state.getOffCourseDist())) && hasHeading() == state.hasHeading()) {
                return (!hasHeading() || getHeading() == state.getHeading()) && getUnknownFields().equals(state.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public int getBearing() {
            return this.bearing_;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public int getDistanceToDest() {
            return this.distanceToDest_;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public int getHeading() {
            return this.heading_;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public float getMovingAvg() {
            return this.movingAvg_;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public int getMovingTime() {
            return this.movingTime_;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public int getNextNavIndex() {
            return this.nextNavIndex_;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean getOffCourse() {
            return this.offCourse_;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public float getOffCourseDist() {
            return this.offCourseDist_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<State> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.state_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.nextNavIndex_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.distanceToDest_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(4, this.timeToDest_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(5, this.bearing_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(6, this.movingAvg_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(7, this.speed_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(8, this.movingTime_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(9, this.offCourse_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(10, this.offCourseDist_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(11, this.heading_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public float getSpeed() {
            return this.speed_;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public StateType getState() {
            StateType stateTypeForNumber = StateType.forNumber(this.state_);
            return stateTypeForNumber == null ? StateType.START_NAV : stateTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public int getTimeToDest() {
            return this.timeToDest_;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean hasBearing() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean hasDistanceToDest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean hasHeading() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean hasMovingAvg() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean hasMovingTime() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean hasNextNavIndex() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean hasOffCourse() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean hasOffCourseDist() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean hasSpeed() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
        public boolean hasTimeToDest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasState()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.state_;
            }
            if (hasNextNavIndex()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getNextNavIndex();
            }
            if (hasDistanceToDest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDistanceToDest();
            }
            if (hasTimeToDest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getTimeToDest();
            }
            if (hasBearing()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getBearing();
            }
            if (hasMovingAvg()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Float.floatToIntBits(getMovingAvg());
            }
            if (hasSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Float.floatToIntBits(getSpeed());
            }
            if (hasMovingTime()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getMovingTime();
            }
            if (hasOffCourse()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Internal.hashBoolean(getOffCourse());
            }
            if (hasOffCourseDist()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + Float.floatToIntBits(getOffCourseDist());
            }
            if (hasHeading()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getHeading();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_State_fieldAccessorTable.ensureFieldAccessorsInitialized(State.class, Builder.class);
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
            return new State();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.state_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.nextNavIndex_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.distanceToDest_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.timeToDest_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.bearing_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeFloat(6, this.movingAvg_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeFloat(7, this.speed_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.movingTime_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeBool(9, this.offCourse_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeFloat(10, this.offCourseDist_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeUInt32(11, this.heading_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StateOrBuilder {
            private int bearing_;
            private int bitField0_;
            private int distanceToDest_;
            private int heading_;
            private float movingAvg_;
            private int movingTime_;
            private int nextNavIndex_;
            private float offCourseDist_;
            private boolean offCourse_;
            private float speed_;
            private int state_;
            private int timeToDest_;

            private Builder() {
                this.state_ = 0;
            }

            private void buildPartial0(State state) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    state.state_ = this.state_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    state.nextNavIndex_ = this.nextNavIndex_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    state.distanceToDest_ = this.distanceToDest_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    state.timeToDest_ = this.timeToDest_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    state.bearing_ = this.bearing_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    state.movingAvg_ = this.movingAvg_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    state.speed_ = this.speed_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    state.movingTime_ = this.movingTime_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    state.offCourse_ = this.offCourse_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    state.offCourseDist_ = this.offCourseDist_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    state.heading_ = this.heading_;
                    i14 |= 1024;
                }
                state.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_State_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public State build() {
                State stateBuildPartial = buildPartial();
                if (stateBuildPartial.isInitialized()) {
                    return stateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public State buildPartial() {
                State state = new State(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(state);
                }
                onBuilt();
                return state;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = 0;
                this.nextNavIndex_ = 0;
                this.distanceToDest_ = 0;
                this.timeToDest_ = 0;
                this.bearing_ = 0;
                this.movingAvg_ = 0.0f;
                this.speed_ = 0.0f;
                this.movingTime_ = 0;
                this.offCourse_ = false;
                this.offCourseDist_ = 0.0f;
                this.heading_ = 0;
                return this;
            }

            public Builder clearBearing() {
                this.bitField0_ &= -17;
                this.bearing_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDistanceToDest() {
                this.bitField0_ &= -5;
                this.distanceToDest_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHeading() {
                this.bitField0_ &= -1025;
                this.heading_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMovingAvg() {
                this.bitField0_ &= -33;
                this.movingAvg_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMovingTime() {
                this.bitField0_ &= -129;
                this.movingTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNextNavIndex() {
                this.bitField0_ &= -3;
                this.nextNavIndex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOffCourse() {
                this.bitField0_ &= -257;
                this.offCourse_ = false;
                onChanged();
                return this;
            }

            public Builder clearOffCourseDist() {
                this.bitField0_ &= -513;
                this.offCourseDist_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSpeed() {
                this.bitField0_ &= -65;
                this.speed_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimeToDest() {
                this.bitField0_ &= -9;
                this.timeToDest_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public int getBearing() {
                return this.bearing_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_State_descriptor;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public int getDistanceToDest() {
                return this.distanceToDest_;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public int getHeading() {
                return this.heading_;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public float getMovingAvg() {
                return this.movingAvg_;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public int getMovingTime() {
                return this.movingTime_;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public int getNextNavIndex() {
                return this.nextNavIndex_;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean getOffCourse() {
                return this.offCourse_;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public float getOffCourseDist() {
                return this.offCourseDist_;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public float getSpeed() {
                return this.speed_;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public StateType getState() {
                StateType stateTypeForNumber = StateType.forNumber(this.state_);
                return stateTypeForNumber == null ? StateType.START_NAV : stateTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public int getTimeToDest() {
                return this.timeToDest_;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean hasBearing() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean hasDistanceToDest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean hasHeading() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean hasMovingAvg() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean hasMovingTime() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean hasNextNavIndex() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean hasOffCourse() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean hasOffCourseDist() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean hasSpeed() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDINavigationSyncProto.StateOrBuilder
            public boolean hasTimeToDest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDINavigationSyncProto.internal_static_GDI_Proto_NavigationSync_State_fieldAccessorTable.ensureFieldAccessorsInitialized(State.class, Builder.class);
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
                                case 8:
                                    int i14 = codedInputStream.readEnum();
                                    if (StateType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.state_ = i14;
                                        this.bitField0_ |= 1;
                                        continue;
                                    }
                                    break;
                                case 16:
                                    this.nextNavIndex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.distanceToDest_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.timeToDest_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.bearing_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 53:
                                    this.movingAvg_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 61:
                                    this.speed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.movingTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    this.offCourse_ = codedInputStream.readBool();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 85:
                                    this.offCourseDist_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 88:
                                    this.heading_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1024;
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

            public Builder setBearing(int i14) {
                this.bearing_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDistanceToDest(int i14) {
                this.distanceToDest_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHeading(int i14) {
                this.heading_ = i14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setMovingAvg(float f14) {
                this.movingAvg_ = f14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMovingTime(int i14) {
                this.movingTime_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setNextNavIndex(int i14) {
                this.nextNavIndex_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOffCourse(boolean z14) {
                this.offCourse_ = z14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setOffCourseDist(float f14) {
                this.offCourseDist_ = f14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSpeed(float f14) {
                this.speed_ = f14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setState(StateType stateType) {
                stateType.getClass();
                this.bitField0_ |= 1;
                this.state_ = stateType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTimeToDest(int i14) {
                this.timeToDest_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public State getDefaultInstanceForType() {
                return State.getDefaultInstance();
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
                if (message instanceof State) {
                    return mergeFrom((State) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(State state) {
                if (state == State.getDefaultInstance()) {
                    return this;
                }
                if (state.hasState()) {
                    setState(state.getState());
                }
                if (state.hasNextNavIndex()) {
                    setNextNavIndex(state.getNextNavIndex());
                }
                if (state.hasDistanceToDest()) {
                    setDistanceToDest(state.getDistanceToDest());
                }
                if (state.hasTimeToDest()) {
                    setTimeToDest(state.getTimeToDest());
                }
                if (state.hasBearing()) {
                    setBearing(state.getBearing());
                }
                if (state.hasMovingAvg()) {
                    setMovingAvg(state.getMovingAvg());
                }
                if (state.hasSpeed()) {
                    setSpeed(state.getSpeed());
                }
                if (state.hasMovingTime()) {
                    setMovingTime(state.getMovingTime());
                }
                if (state.hasOffCourse()) {
                    setOffCourse(state.getOffCourse());
                }
                if (state.hasOffCourseDist()) {
                    setOffCourseDist(state.getOffCourseDist());
                }
                if (state.hasHeading()) {
                    setHeading(state.getHeading());
                }
                mergeUnknownFields(state.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public State getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static State parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (State) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static State parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static State parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static State parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static State parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static State parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static State parseFrom(InputStream inputStream) {
            return (State) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static State parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (State) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static State parseFrom(CodedInputStream codedInputStream) {
            return (State) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static State parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (State) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum StateType implements ProtocolMessageEnum {
            START_NAV(0),
            STOP_NAV(1),
            CALCULATING(2),
            FAILED(3),
            DEVICE_BUSY(4),
            GPS_OFF(5),
            GPS_NO_FIX(6),
            CALC_TRUNCATED(7),
            CALC_OVERFLOW(8),
            CALC_CANCELED(9),
            INV_START(10),
            INV_END(11);

            public static final int CALCULATING_VALUE = 2;
            public static final int CALC_CANCELED_VALUE = 9;
            public static final int CALC_OVERFLOW_VALUE = 8;
            public static final int CALC_TRUNCATED_VALUE = 7;
            public static final int DEVICE_BUSY_VALUE = 4;
            public static final int FAILED_VALUE = 3;
            public static final int GPS_NO_FIX_VALUE = 6;
            public static final int GPS_OFF_VALUE = 5;
            public static final int INV_END_VALUE = 11;
            public static final int INV_START_VALUE = 10;
            public static final int START_NAV_VALUE = 0;
            public static final int STOP_NAV_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<StateType> internalValueMap = new Internal.EnumLiteMap<StateType>() { // from class: com.garmin.proto.generated.GDINavigationSyncProto.State.StateType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public StateType findValueByNumber(int i14) {
                    return StateType.forNumber(i14);
                }
            };
            private static final StateType[] VALUES = values();

            StateType(int i14) {
                this.value = i14;
            }

            public static StateType forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return START_NAV;
                    case 1:
                        return STOP_NAV;
                    case 2:
                        return CALCULATING;
                    case 3:
                        return FAILED;
                    case 4:
                        return DEVICE_BUSY;
                    case 5:
                        return GPS_OFF;
                    case 6:
                        return GPS_NO_FIX;
                    case 7:
                        return CALC_TRUNCATED;
                    case 8:
                        return CALC_OVERFLOW;
                    case 9:
                        return CALC_CANCELED;
                    case 10:
                        return INV_START;
                    case 11:
                        return INV_END;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return State.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<StateType> internalGetValueMap() {
                return internalValueMap;
            }

            public static StateType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static StateType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public /* synthetic */ State(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private State() {
            this.nextNavIndex_ = 0;
            this.distanceToDest_ = 0;
            this.timeToDest_ = 0;
            this.bearing_ = 0;
            this.movingAvg_ = 0.0f;
            this.speed_ = 0.0f;
            this.movingTime_ = 0;
            this.offCourse_ = false;
            this.offCourseDist_ = 0.0f;
            this.heading_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.state_ = 0;
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum NavResponseStatus implements ProtocolMessageEnum {
        NEED_ITEM(0),
        CALCULATING(1),
        FAILED(2);

        public static final int CALCULATING_VALUE = 1;
        public static final int FAILED_VALUE = 2;
        public static final int NEED_ITEM_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<NavResponseStatus> internalValueMap = new Internal.EnumLiteMap<NavResponseStatus>() { // from class: com.garmin.proto.generated.GDINavigationSyncProto.NavResponseStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public NavResponseStatus findValueByNumber(int i14) {
                return NavResponseStatus.forNumber(i14);
            }
        };
        private static final NavResponseStatus[] VALUES = values();

        NavResponseStatus(int i14) {
            this.value = i14;
        }

        public static NavResponseStatus forNumber(int i14) {
            if (i14 == 0) {
                return NEED_ITEM;
            }
            if (i14 == 1) {
                return CALCULATING;
            }
            if (i14 != 2) {
                return null;
            }
            return FAILED;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDINavigationSyncProto.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<NavResponseStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static NavResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static NavResponseStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum NavType implements ProtocolMessageEnum {
        POSITION(0),
        SAVED_WAYPOINT(1),
        SAVED_LINE(2),
        TRACBACK(3);

        public static final int POSITION_VALUE = 0;
        public static final int SAVED_LINE_VALUE = 2;
        public static final int SAVED_WAYPOINT_VALUE = 1;
        public static final int TRACBACK_VALUE = 3;
        private final int value;
        private static final Internal.EnumLiteMap<NavType> internalValueMap = new Internal.EnumLiteMap<NavType>() { // from class: com.garmin.proto.generated.GDINavigationSyncProto.NavType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public NavType findValueByNumber(int i14) {
                return NavType.forNumber(i14);
            }
        };
        private static final NavType[] VALUES = values();

        NavType(int i14) {
            this.value = i14;
        }

        public static NavType forNumber(int i14) {
            if (i14 == 0) {
                return POSITION;
            }
            if (i14 == 1) {
                return SAVED_WAYPOINT;
            }
            if (i14 == 2) {
                return SAVED_LINE;
            }
            if (i14 != 3) {
                return null;
            }
            return TRACBACK;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDINavigationSyncProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<NavType> internalGetValueMap() {
            return internalValueMap;
        }

        public static NavType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static NavType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
