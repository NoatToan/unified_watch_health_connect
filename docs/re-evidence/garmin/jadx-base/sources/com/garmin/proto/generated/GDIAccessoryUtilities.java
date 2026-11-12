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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes12.dex */
public final class GDIAccessoryUtilities {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bGDIAccessoryUtilities.proto\u0012\u001cGDI.Proto.AccessoryUtilities\u001a\rGDICore.proto\u001a\u0012GDIDataTypes.proto\u001a\u0015GDIEventSharing.proto\"\u0080\u0002\n\u0007Service\u0012K\n\u0012error_notification\u0018\u0001 \u0001(\u000b2/.GDI.Proto.AccessoryUtilities.ErrorNotification\u0012R\n\u0016activity_start_request\u0018\u0002 \u0001(\u000b22.GDI.Proto.AccessoryUtilities.ActivityStartRequest\u0012T\n\u0017activity_start_response\u0018\u0003 \u0001(\u000b23.GDI.Proto.AccessoryUtilities.ActivityStartResponse\"\u009e\u0003\n\u0019ActivityStateNotification\u0012\u0015\n\rcurrent_sport\u0018\u0001 \u0001(\r\u0012\u0019\n\u0011current_sub_sport\u0018\u0002 \u0001(\r\u0012]\n\u000eactivity_state\u0018\u0003 \u0001(\u000e2E.GDI.Proto.AccessoryUtilities.ActivityStateNotification.ActivityState\"}\n\rActivityState\u0012\u0014\n\u0010ACTIVITY_STARTED\u0010\u0000\u0012\u0014\n\u0010ACTIVITY_STOPPED\u0010\u0001\u0012\u0014\n\u0010ACTIVITY_RESUMED\u0010\u0002\u0012\u0012\n\u000eACTIVITY_SAVED\u0010\u0003\u0012\u0016\n\u0012ACTIVITY_DISCARDED\u0010\u00042q\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018÷\u0007 \u0001(\u000b27.GDI.Proto.AccessoryUtilities.ActivityStateNotification\"Ø\u0001\n\u0011ErrorNotification\u0012O\n\u000berror_level\u0018\u0001 \u0001(\u000e2:.GDI.Proto.AccessoryUtilities.ErrorNotification.ErrorLevel\u0012\u0017\n\u000fcomponent_index\u0018\u0002 \u0001(\r\u0012\u0012\n\nerror_code\u0018\u0003 \u0001(\r\u0012\u0012\n\nerror_data\u0018\u0004 \u0001(\r\"1\n\nErrorLevel\u0012\b\n\u0004INFO\u0010\u0000\u0012\u000b\n\u0007WARNING\u0010\u0001\u0012\f\n\bCRITICAL\u0010\u0002\"\u008e\u0001\n\u0013CapabilitiesRequest2w\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u001b \u0001(\u000b21.GDI.Proto.AccessoryUtilities.CapabilitiesRequest\"b\n\u001eAccessoryUtilitiesCapabilities\u0012\u0013\n\u000bchannel_ids\u0018\u0001 \u0003(\r\u0012+\n#is_activity_start_request_supported\u0018\u0002 \u0001(\b\"ú\u0001\n\u0014CapabilitiesResponse\u0012f\n accessory_utilities_capabilities\u0018\u0001 \u0001(\u000b2<.GDI.Proto.AccessoryUtilities.AccessoryUtilitiesCapabilities2z\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u001b \u0001(\u000b22.GDI.Proto.AccessoryUtilities.CapabilitiesResponse\"\u0016\n\u0014ActivityStartRequest\"Ë\u0001\n\u0015ActivityStartResponse\u0012R\n\u0006status\u0018\u0001 \u0002(\u000e2B.GDI.Proto.AccessoryUtilities.ActivityStartResponse.ResponseStatus\u0012'\n\u0004uuid\u0018\u0002 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\"5\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\t\n\u0005ERROR\u0010\u0001\u0012\u000b\n\u0007SUCCESS\u0010\u0002B5\n\u001acom.garmin.proto.generatedB\u0015GDIAccessoryUtilitiesH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIDataTypes.getDescriptor(), GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AccessoryUtilities_AccessoryUtilitiesCapabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AccessoryUtilities_AccessoryUtilitiesCapabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AccessoryUtilities_ActivityStartRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AccessoryUtilities_ActivityStartRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AccessoryUtilities_ActivityStartResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AccessoryUtilities_ActivityStartResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AccessoryUtilities_ActivityStateNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AccessoryUtilities_ActivityStateNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AccessoryUtilities_ErrorNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AccessoryUtilities_ErrorNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AccessoryUtilities_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AccessoryUtilities_Service_fieldAccessorTable;

    public interface AccessoryUtilitiesCapabilitiesOrBuilder extends MessageOrBuilder {
        int getChannelIds(int i14);

        int getChannelIdsCount();

        List<Integer> getChannelIdsList();

        boolean getIsActivityStartRequestSupported();

        boolean hasIsActivityStartRequestSupported();
    }

    public interface ActivityStartRequestOrBuilder extends MessageOrBuilder {
    }

    public interface ActivityStartResponseOrBuilder extends MessageOrBuilder {
        ActivityStartResponse.ResponseStatus getStatus();

        GDIDataTypes.UUID getUuid();

        GDIDataTypes.UUIDOrBuilder getUuidOrBuilder();

        boolean hasStatus();

        boolean hasUuid();
    }

    public interface ActivityStateNotificationOrBuilder extends MessageOrBuilder {
        ActivityStateNotification.ActivityState getActivityState();

        int getCurrentSport();

        int getCurrentSubSport();

        boolean hasActivityState();

        boolean hasCurrentSport();

        boolean hasCurrentSubSport();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        AccessoryUtilitiesCapabilities getAccessoryUtilitiesCapabilities();

        AccessoryUtilitiesCapabilitiesOrBuilder getAccessoryUtilitiesCapabilitiesOrBuilder();

        boolean hasAccessoryUtilitiesCapabilities();
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface ErrorNotificationOrBuilder extends MessageOrBuilder {
        int getComponentIndex();

        int getErrorCode();

        int getErrorData();

        ErrorNotification.ErrorLevel getErrorLevel();

        boolean hasComponentIndex();

        boolean hasErrorCode();

        boolean hasErrorData();

        boolean hasErrorLevel();
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface ServiceOrBuilder extends MessageOrBuilder {
        ActivityStartRequest getActivityStartRequest();

        ActivityStartRequestOrBuilder getActivityStartRequestOrBuilder();

        ActivityStartResponse getActivityStartResponse();

        ActivityStartResponseOrBuilder getActivityStartResponseOrBuilder();

        ErrorNotification getErrorNotification();

        ErrorNotificationOrBuilder getErrorNotificationOrBuilder();

        boolean hasActivityStartRequest();

        boolean hasActivityStartResponse();

        boolean hasErrorNotification();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_AccessoryUtilities_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_AccessoryUtilities_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ErrorNotification", "ActivityStartRequest", "ActivityStartResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_AccessoryUtilities_ActivityStateNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_AccessoryUtilities_ActivityStateNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"CurrentSport", "CurrentSubSport", "ActivityState"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_AccessoryUtilities_ErrorNotification_descriptor = descriptor4;
        internal_static_GDI_Proto_AccessoryUtilities_ErrorNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"ErrorLevel", "ComponentIndex", "ErrorCode", "ErrorData"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_AccessoryUtilities_AccessoryUtilitiesCapabilities_descriptor = descriptor6;
        internal_static_GDI_Proto_AccessoryUtilities_AccessoryUtilitiesCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"ChannelIds", "IsActivityStartRequestSupported"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"AccessoryUtilitiesCapabilities"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_AccessoryUtilities_ActivityStartRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_AccessoryUtilities_ActivityStartRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[0]);
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_AccessoryUtilities_ActivityStartResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_AccessoryUtilities_ActivityStartResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status", "Uuid"});
        GDICore.getDescriptor();
        GDIDataTypes.getDescriptor();
        GDIEventSharingProto.getDescriptor();
    }

    private GDIAccessoryUtilities() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(ActivityStateNotification.data);
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class ActivityStartRequest extends GeneratedMessageV3 implements ActivityStartRequestOrBuilder {
        private static final ActivityStartRequest DEFAULT_INSTANCE = new ActivityStartRequest();

        @Deprecated
        public static final Parser<ActivityStartRequest> PARSER = new AbstractParser<ActivityStartRequest>() { // from class: com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartRequest.1
            @Override // com.google.protobuf.Parser
            public ActivityStartRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ActivityStartRequest.newBuilder();
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

        private ActivityStartRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActivityStartRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStartRequest_descriptor;
        }

        public static Builder newBuilder(ActivityStartRequest activityStartRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(activityStartRequest);
        }

        public static ActivityStartRequest parseDelimitedFrom(InputStream inputStream) {
            return (ActivityStartRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActivityStartRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ActivityStartRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ActivityStartRequest) {
                return getUnknownFields().equals(((ActivityStartRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActivityStartRequest> getParserForType() {
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
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStartRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityStartRequest.class, Builder.class);
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
            return new ActivityStartRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActivityStartRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStartRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActivityStartRequest build() {
                ActivityStartRequest activityStartRequestBuildPartial = buildPartial();
                if (activityStartRequestBuildPartial.isInitialized()) {
                    return activityStartRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) activityStartRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActivityStartRequest buildPartial() {
                ActivityStartRequest activityStartRequest = new ActivityStartRequest(this);
                onBuilt();
                return activityStartRequest;
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
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStartRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStartRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityStartRequest.class, Builder.class);
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
            public ActivityStartRequest getDefaultInstanceForType() {
                return ActivityStartRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActivityStartRequest) {
                    return mergeFrom((ActivityStartRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActivityStartRequest activityStartRequest) {
                if (activityStartRequest == ActivityStartRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(activityStartRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActivityStartRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ActivityStartRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ActivityStartRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActivityStartRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityStartRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActivityStartRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ActivityStartRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActivityStartRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ActivityStartRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ActivityStartRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ActivityStartRequest parseFrom(InputStream inputStream) {
            return (ActivityStartRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ActivityStartRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityStartRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActivityStartRequest parseFrom(CodedInputStream codedInputStream) {
            return (ActivityStartRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActivityStartRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityStartRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 27;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIAccessoryUtilities.CapabilitiesRequest.1
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
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesRequest_descriptor;
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
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesRequest_descriptor;
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
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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

    public static final class AccessoryUtilitiesCapabilities extends GeneratedMessageV3 implements AccessoryUtilitiesCapabilitiesOrBuilder {
        public static final int CHANNEL_IDS_FIELD_NUMBER = 1;
        public static final int IS_ACTIVITY_START_REQUEST_SUPPORTED_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Internal.IntList channelIds_;
        private boolean isActivityStartRequestSupported_;
        private byte memoizedIsInitialized;
        private static final AccessoryUtilitiesCapabilities DEFAULT_INSTANCE = new AccessoryUtilitiesCapabilities();

        @Deprecated
        public static final Parser<AccessoryUtilitiesCapabilities> PARSER = new AbstractParser<AccessoryUtilitiesCapabilities>() { // from class: com.garmin.proto.generated.GDIAccessoryUtilities.AccessoryUtilitiesCapabilities.1
            @Override // com.google.protobuf.Parser
            public AccessoryUtilitiesCapabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AccessoryUtilitiesCapabilities.newBuilder();
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

        private AccessoryUtilitiesCapabilities() {
            this.channelIds_ = GeneratedMessageV3.emptyIntList();
            this.isActivityStartRequestSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.channelIds_ = GeneratedMessageV3.emptyIntList();
        }

        public static AccessoryUtilitiesCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_AccessoryUtilitiesCapabilities_descriptor;
        }

        public static Builder newBuilder(AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(accessoryUtilitiesCapabilities);
        }

        public static AccessoryUtilitiesCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (AccessoryUtilitiesCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AccessoryUtilitiesCapabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AccessoryUtilitiesCapabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccessoryUtilitiesCapabilities)) {
                return super.equals(obj);
            }
            AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities = (AccessoryUtilitiesCapabilities) obj;
            if (getChannelIdsList().equals(accessoryUtilitiesCapabilities.getChannelIdsList()) && hasIsActivityStartRequestSupported() == accessoryUtilitiesCapabilities.hasIsActivityStartRequestSupported()) {
                return (!hasIsActivityStartRequestSupported() || getIsActivityStartRequestSupported() == accessoryUtilitiesCapabilities.getIsActivityStartRequestSupported()) && getUnknownFields().equals(accessoryUtilitiesCapabilities.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.AccessoryUtilitiesCapabilitiesOrBuilder
        public int getChannelIds(int i14) {
            return this.channelIds_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.AccessoryUtilitiesCapabilitiesOrBuilder
        public int getChannelIdsCount() {
            return this.channelIds_.size();
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.AccessoryUtilitiesCapabilitiesOrBuilder
        public List<Integer> getChannelIdsList() {
            return this.channelIds_;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.AccessoryUtilitiesCapabilitiesOrBuilder
        public boolean getIsActivityStartRequestSupported() {
            return this.isActivityStartRequestSupported_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AccessoryUtilitiesCapabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iB = 0;
            for (int i15 = 0; i15 < this.channelIds_.size(); i15++) {
                iB = f3.b(this.channelIds_, i15, iB);
            }
            int size = getChannelIdsList().size() + iB;
            if ((this.bitField0_ & 1) != 0) {
                size += CodedOutputStream.computeBoolSize(2, this.isActivityStartRequestSupported_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.AccessoryUtilitiesCapabilitiesOrBuilder
        public boolean hasIsActivityStartRequestSupported() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getChannelIdsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getChannelIdsList().hashCode();
            }
            if (hasIsActivityStartRequestSupported()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getIsActivityStartRequestSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_AccessoryUtilitiesCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessoryUtilitiesCapabilities.class, Builder.class);
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
            return new AccessoryUtilitiesCapabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iC = 0;
            while (iC < this.channelIds_.size()) {
                iC = f3.c(this.channelIds_, iC, codedOutputStream, 1, iC, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(2, this.isActivityStartRequestSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AccessoryUtilitiesCapabilitiesOrBuilder {
            private int bitField0_;
            private Internal.IntList channelIds_;
            private boolean isActivityStartRequestSupported_;

            private Builder() {
                this.channelIds_ = GeneratedMessageV3.emptyIntList();
            }

            private void buildPartial0(AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    this.channelIds_.makeImmutable();
                    accessoryUtilitiesCapabilities.channelIds_ = this.channelIds_;
                }
                if ((i15 & 2) != 0) {
                    accessoryUtilitiesCapabilities.isActivityStartRequestSupported_ = this.isActivityStartRequestSupported_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                accessoryUtilitiesCapabilities.bitField0_ = i14 | accessoryUtilitiesCapabilities.bitField0_;
            }

            private void ensureChannelIdsIsMutable() {
                if (!this.channelIds_.isModifiable()) {
                    this.channelIds_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.channelIds_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_AccessoryUtilitiesCapabilities_descriptor;
            }

            public Builder addAllChannelIds(Iterable<? extends Integer> iterable) {
                ensureChannelIdsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.channelIds_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addChannelIds(int i14) {
                ensureChannelIdsIsMutable();
                this.channelIds_.addInt(i14);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessoryUtilitiesCapabilities build() {
                AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilitiesBuildPartial = buildPartial();
                if (accessoryUtilitiesCapabilitiesBuildPartial.isInitialized()) {
                    return accessoryUtilitiesCapabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) accessoryUtilitiesCapabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessoryUtilitiesCapabilities buildPartial() {
                AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities = new AccessoryUtilitiesCapabilities(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(accessoryUtilitiesCapabilities);
                }
                onBuilt();
                return accessoryUtilitiesCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.channelIds_ = GeneratedMessageV3.emptyIntList();
                this.isActivityStartRequestSupported_ = false;
                return this;
            }

            public Builder clearChannelIds() {
                this.channelIds_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsActivityStartRequestSupported() {
                this.bitField0_ &= -3;
                this.isActivityStartRequestSupported_ = false;
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

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.AccessoryUtilitiesCapabilitiesOrBuilder
            public int getChannelIds(int i14) {
                return this.channelIds_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.AccessoryUtilitiesCapabilitiesOrBuilder
            public int getChannelIdsCount() {
                return this.channelIds_.size();
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.AccessoryUtilitiesCapabilitiesOrBuilder
            public List<Integer> getChannelIdsList() {
                this.channelIds_.makeImmutable();
                return this.channelIds_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_AccessoryUtilitiesCapabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.AccessoryUtilitiesCapabilitiesOrBuilder
            public boolean getIsActivityStartRequestSupported() {
                return this.isActivityStartRequestSupported_;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.AccessoryUtilitiesCapabilitiesOrBuilder
            public boolean hasIsActivityStartRequestSupported() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_AccessoryUtilitiesCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessoryUtilitiesCapabilities.class, Builder.class);
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
                                    ensureChannelIdsIsMutable();
                                    this.channelIds_.addInt(uInt32);
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureChannelIdsIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.channelIds_.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 16) {
                                    this.isActivityStartRequestSupported_ = codedInputStream.readBool();
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

            public Builder setChannelIds(int i14, int i15) {
                ensureChannelIdsIsMutable();
                this.channelIds_.setInt(i14, i15);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIsActivityStartRequestSupported(boolean z14) {
                this.isActivityStartRequestSupported_ = z14;
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
            public AccessoryUtilitiesCapabilities getDefaultInstanceForType() {
                return AccessoryUtilitiesCapabilities.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.channelIds_ = GeneratedMessageV3.emptyIntList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AccessoryUtilitiesCapabilities) {
                    return mergeFrom((AccessoryUtilitiesCapabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities) {
                if (accessoryUtilitiesCapabilities == AccessoryUtilitiesCapabilities.getDefaultInstance()) {
                    return this;
                }
                if (!accessoryUtilitiesCapabilities.channelIds_.isEmpty()) {
                    if (this.channelIds_.isEmpty()) {
                        Internal.IntList intList = accessoryUtilitiesCapabilities.channelIds_;
                        this.channelIds_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 1;
                    } else {
                        ensureChannelIdsIsMutable();
                        this.channelIds_.addAll(accessoryUtilitiesCapabilities.channelIds_);
                    }
                    onChanged();
                }
                if (accessoryUtilitiesCapabilities.hasIsActivityStartRequestSupported()) {
                    setIsActivityStartRequestSupported(accessoryUtilitiesCapabilities.getIsActivityStartRequestSupported());
                }
                mergeUnknownFields(accessoryUtilitiesCapabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AccessoryUtilitiesCapabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AccessoryUtilitiesCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryUtilitiesCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessoryUtilitiesCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AccessoryUtilitiesCapabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AccessoryUtilitiesCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AccessoryUtilitiesCapabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AccessoryUtilitiesCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AccessoryUtilitiesCapabilities parseFrom(InputStream inputStream) {
            return (AccessoryUtilitiesCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AccessoryUtilitiesCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryUtilitiesCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessoryUtilitiesCapabilities parseFrom(CodedInputStream codedInputStream) {
            return (AccessoryUtilitiesCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AccessoryUtilitiesCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessoryUtilitiesCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private AccessoryUtilitiesCapabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.channelIds_ = GeneratedMessageV3.emptyIntList();
            this.isActivityStartRequestSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ AccessoryUtilitiesCapabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ActivityStartResponse extends GeneratedMessageV3 implements ActivityStartResponseOrBuilder {
        private static final ActivityStartResponse DEFAULT_INSTANCE = new ActivityStartResponse();

        @Deprecated
        public static final Parser<ActivityStartResponse> PARSER = new AbstractParser<ActivityStartResponse>() { // from class: com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponse.1
            @Override // com.google.protobuf.Parser
            public ActivityStartResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ActivityStartResponse.newBuilder();
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
        public static final int UUID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;
        private GDIDataTypes.UUID uuid_;

        private ActivityStartResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActivityStartResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStartResponse_descriptor;
        }

        public static Builder newBuilder(ActivityStartResponse activityStartResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(activityStartResponse);
        }

        public static ActivityStartResponse parseDelimitedFrom(InputStream inputStream) {
            return (ActivityStartResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActivityStartResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ActivityStartResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityStartResponse)) {
                return super.equals(obj);
            }
            ActivityStartResponse activityStartResponse = (ActivityStartResponse) obj;
            if (hasStatus() != activityStartResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == activityStartResponse.status_) && hasUuid() == activityStartResponse.hasUuid()) {
                return (!hasUuid() || getUuid().equals(activityStartResponse.getUuid())) && getUnknownFields().equals(activityStartResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActivityStartResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getUuid());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponseOrBuilder
        public GDIDataTypes.UUID getUuid() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponseOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponseOrBuilder
        public boolean hasUuid() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasUuid()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getUuid().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStartResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityStartResponse.class, Builder.class);
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
            if (!hasStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasUuid() || getUuid().isInitialized()) {
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
            return new ActivityStartResponse();
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
                codedOutputStream.writeMessage(2, getUuid());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActivityStartResponseOrBuilder {
            private int bitField0_;
            private int status_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uuidBuilder_;
            private GDIDataTypes.UUID uuid_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ActivityStartResponse activityStartResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    activityStartResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    activityStartResponse.uuid_ = singleFieldBuilderV3 == null ? this.uuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                activityStartResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStartResponse_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getUuidFieldBuilder() {
                if (this.uuidBuilder_ == null) {
                    this.uuidBuilder_ = new SingleFieldBuilderV3<>(getUuid(), getParentForChildren(), isClean());
                    this.uuid_ = null;
                }
                return this.uuidBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUuidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActivityStartResponse build() {
                ActivityStartResponse activityStartResponseBuildPartial = buildPartial();
                if (activityStartResponseBuildPartial.isInitialized()) {
                    return activityStartResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) activityStartResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActivityStartResponse buildPartial() {
                ActivityStartResponse activityStartResponse = new ActivityStartResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(activityStartResponse);
                }
                onBuilt();
                return activityStartResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.uuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uuidBuilder_ = null;
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

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUuid() {
                this.bitField0_ &= -3;
                this.uuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uuidBuilder_ = null;
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
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStartResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponseOrBuilder
            public GDIDataTypes.UUID getUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getUuidBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponseOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponseOrBuilder
            public boolean hasUuid() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStartResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityStartResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasStatus()) {
                    return !hasUuid() || getUuid().isInitialized();
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
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getUuidFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 2) == 0 || (uuid2 = this.uuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.uuid_ = uuid;
                } else {
                    getUuidBuilder().mergeFrom(uuid);
                }
                if (this.uuid_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
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

            public Builder setUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uuid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActivityStartResponse getDefaultInstanceForType() {
                return ActivityStartResponse.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            public Builder setUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.uuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActivityStartResponse) {
                    return mergeFrom((ActivityStartResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActivityStartResponse activityStartResponse) {
                if (activityStartResponse == ActivityStartResponse.getDefaultInstance()) {
                    return this;
                }
                if (activityStartResponse.hasStatus()) {
                    setStatus(activityStartResponse.getStatus());
                }
                if (activityStartResponse.hasUuid()) {
                    mergeUuid(activityStartResponse.getUuid());
                }
                mergeUnknownFields(activityStartResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActivityStartResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ActivityStartResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityStartResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActivityStartResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ActivityStartResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ActivityStartResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ActivityStartResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActivityStartResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ActivityStartResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ActivityStartResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ActivityStartResponse parseFrom(InputStream inputStream) {
            return (ActivityStartResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ActivityStartResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityStartResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActivityStartResponse parseFrom(CodedInputStream codedInputStream) {
            return (ActivityStartResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActivityStartResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityStartResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            ERROR(1),
            SUCCESS(2);

            public static final int ERROR_VALUE = 1;
            public static final int SUCCESS_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStartResponse.ResponseStatus.1
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
                if (i14 == 1) {
                    return ERROR;
                }
                if (i14 != 2) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ActivityStartResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class ActivityStateNotification extends GeneratedMessageV3 implements ActivityStateNotificationOrBuilder {
        public static final int ACTIVITY_STATE_FIELD_NUMBER = 3;
        public static final int CURRENT_SPORT_FIELD_NUMBER = 1;
        public static final int CURRENT_SUB_SPORT_FIELD_NUMBER = 2;
        public static final int DATA_FIELD_NUMBER = 1015;
        private static final ActivityStateNotification DEFAULT_INSTANCE = new ActivityStateNotification();

        @Deprecated
        public static final Parser<ActivityStateNotification> PARSER = new AbstractParser<ActivityStateNotification>() { // from class: com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotification.1
            @Override // com.google.protobuf.Parser
            public ActivityStateNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ActivityStateNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, ActivityStateNotification> data = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, ActivityStateNotification.class, getDefaultInstance());
        private static final long serialVersionUID = 0;
        private int activityState_;
        private int bitField0_;
        private int currentSport_;
        private int currentSubSport_;
        private byte memoizedIsInitialized;

        private ActivityStateNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.currentSport_ = 0;
            this.currentSubSport_ = 0;
            this.activityState_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActivityStateNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStateNotification_descriptor;
        }

        public static Builder newBuilder(ActivityStateNotification activityStateNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(activityStateNotification);
        }

        public static ActivityStateNotification parseDelimitedFrom(InputStream inputStream) {
            return (ActivityStateNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActivityStateNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ActivityStateNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityStateNotification)) {
                return super.equals(obj);
            }
            ActivityStateNotification activityStateNotification = (ActivityStateNotification) obj;
            if (hasCurrentSport() != activityStateNotification.hasCurrentSport()) {
                return false;
            }
            if ((hasCurrentSport() && getCurrentSport() != activityStateNotification.getCurrentSport()) || hasCurrentSubSport() != activityStateNotification.hasCurrentSubSport()) {
                return false;
            }
            if ((!hasCurrentSubSport() || getCurrentSubSport() == activityStateNotification.getCurrentSubSport()) && hasActivityState() == activityStateNotification.hasActivityState()) {
                return (!hasActivityState() || this.activityState_ == activityStateNotification.activityState_) && getUnknownFields().equals(activityStateNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
        public ActivityState getActivityState() {
            ActivityState activityStateForNumber = ActivityState.forNumber(this.activityState_);
            return activityStateForNumber == null ? ActivityState.ACTIVITY_STARTED : activityStateForNumber;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
        public int getCurrentSport() {
            return this.currentSport_;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
        public int getCurrentSubSport() {
            return this.currentSubSport_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActivityStateNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.currentSport_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.currentSubSport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(3, this.activityState_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
        public boolean hasActivityState() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
        public boolean hasCurrentSport() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
        public boolean hasCurrentSubSport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCurrentSport()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCurrentSport();
            }
            if (hasCurrentSubSport()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCurrentSubSport();
            }
            if (hasActivityState()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.activityState_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStateNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityStateNotification.class, Builder.class);
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
            return new ActivityStateNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.currentSport_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.currentSubSport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.activityState_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActivityStateNotificationOrBuilder {
            private int activityState_;
            private int bitField0_;
            private int currentSport_;
            private int currentSubSport_;

            private Builder() {
                this.activityState_ = 0;
            }

            private void buildPartial0(ActivityStateNotification activityStateNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    activityStateNotification.currentSport_ = this.currentSport_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    activityStateNotification.currentSubSport_ = this.currentSubSport_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    activityStateNotification.activityState_ = this.activityState_;
                    i14 |= 4;
                }
                activityStateNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStateNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActivityStateNotification build() {
                ActivityStateNotification activityStateNotificationBuildPartial = buildPartial();
                if (activityStateNotificationBuildPartial.isInitialized()) {
                    return activityStateNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) activityStateNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActivityStateNotification buildPartial() {
                ActivityStateNotification activityStateNotification = new ActivityStateNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(activityStateNotification);
                }
                onBuilt();
                return activityStateNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.currentSport_ = 0;
                this.currentSubSport_ = 0;
                this.activityState_ = 0;
                return this;
            }

            public Builder clearActivityState() {
                this.bitField0_ &= -5;
                this.activityState_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCurrentSport() {
                this.bitField0_ &= -2;
                this.currentSport_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCurrentSubSport() {
                this.bitField0_ &= -3;
                this.currentSubSport_ = 0;
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

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
            public ActivityState getActivityState() {
                ActivityState activityStateForNumber = ActivityState.forNumber(this.activityState_);
                return activityStateForNumber == null ? ActivityState.ACTIVITY_STARTED : activityStateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
            public int getCurrentSport() {
                return this.currentSport_;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
            public int getCurrentSubSport() {
                return this.currentSubSport_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStateNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
            public boolean hasActivityState() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
            public boolean hasCurrentSport() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotificationOrBuilder
            public boolean hasCurrentSubSport() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ActivityStateNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityStateNotification.class, Builder.class);
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
                                    this.currentSport_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.currentSubSport_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ActivityState.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.activityState_ = i14;
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

            public Builder setActivityState(ActivityState activityState) {
                activityState.getClass();
                this.bitField0_ |= 4;
                this.activityState_ = activityState.getNumber();
                onChanged();
                return this;
            }

            public Builder setCurrentSport(int i14) {
                this.currentSport_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCurrentSubSport(int i14) {
                this.currentSubSport_ = i14;
                this.bitField0_ |= 2;
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
            public ActivityStateNotification getDefaultInstanceForType() {
                return ActivityStateNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.activityState_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActivityStateNotification) {
                    return mergeFrom((ActivityStateNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActivityStateNotification activityStateNotification) {
                if (activityStateNotification == ActivityStateNotification.getDefaultInstance()) {
                    return this;
                }
                if (activityStateNotification.hasCurrentSport()) {
                    setCurrentSport(activityStateNotification.getCurrentSport());
                }
                if (activityStateNotification.hasCurrentSubSport()) {
                    setCurrentSubSport(activityStateNotification.getCurrentSubSport());
                }
                if (activityStateNotification.hasActivityState()) {
                    setActivityState(activityStateNotification.getActivityState());
                }
                mergeUnknownFields(activityStateNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActivityStateNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ActivityStateNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityStateNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActivityStateNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ActivityStateNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActivityStateNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ActivityStateNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ActivityStateNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ ActivityStateNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ActivityStateNotification parseFrom(InputStream inputStream) {
            return (ActivityStateNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private ActivityStateNotification() {
            this.currentSport_ = 0;
            this.currentSubSport_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.activityState_ = 0;
        }

        public static ActivityStateNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityStateNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActivityStateNotification parseFrom(CodedInputStream codedInputStream) {
            return (ActivityStateNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActivityStateNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActivityStateNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ActivityState implements ProtocolMessageEnum {
            ACTIVITY_STARTED(0),
            ACTIVITY_STOPPED(1),
            ACTIVITY_RESUMED(2),
            ACTIVITY_SAVED(3),
            ACTIVITY_DISCARDED(4);

            public static final int ACTIVITY_DISCARDED_VALUE = 4;
            public static final int ACTIVITY_RESUMED_VALUE = 2;
            public static final int ACTIVITY_SAVED_VALUE = 3;
            public static final int ACTIVITY_STARTED_VALUE = 0;
            public static final int ACTIVITY_STOPPED_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<ActivityState> internalValueMap = new Internal.EnumLiteMap<ActivityState>() { // from class: com.garmin.proto.generated.GDIAccessoryUtilities.ActivityStateNotification.ActivityState.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ActivityState findValueByNumber(int i14) {
                    return ActivityState.forNumber(i14);
                }
            };
            private static final ActivityState[] VALUES = values();

            ActivityState(int i14) {
                this.value = i14;
            }

            public static ActivityState forNumber(int i14) {
                if (i14 == 0) {
                    return ACTIVITY_STARTED;
                }
                if (i14 == 1) {
                    return ACTIVITY_STOPPED;
                }
                if (i14 == 2) {
                    return ACTIVITY_RESUMED;
                }
                if (i14 == 3) {
                    return ACTIVITY_SAVED;
                }
                if (i14 != 4) {
                    return null;
                }
                return ACTIVITY_DISCARDED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ActivityStateNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ActivityState> internalGetValueMap() {
                return internalValueMap;
            }

            public static ActivityState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ActivityState valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int ACCESSORY_UTILITIES_CAPABILITIES_FIELD_NUMBER = 1;
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 27;
        private static final long serialVersionUID = 0;
        private AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIAccessoryUtilities.CapabilitiesResponse.1
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
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesResponse_descriptor;
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
            if (hasAccessoryUtilitiesCapabilities() != capabilitiesResponse.hasAccessoryUtilitiesCapabilities()) {
                return false;
            }
            return (!hasAccessoryUtilitiesCapabilities() || getAccessoryUtilitiesCapabilities().equals(capabilitiesResponse.getAccessoryUtilitiesCapabilities())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.CapabilitiesResponseOrBuilder
        public AccessoryUtilitiesCapabilities getAccessoryUtilitiesCapabilities() {
            AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities = this.accessoryUtilitiesCapabilities_;
            return accessoryUtilitiesCapabilities == null ? AccessoryUtilitiesCapabilities.getDefaultInstance() : accessoryUtilitiesCapabilities;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.CapabilitiesResponseOrBuilder
        public AccessoryUtilitiesCapabilitiesOrBuilder getAccessoryUtilitiesCapabilitiesOrBuilder() {
            AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities = this.accessoryUtilitiesCapabilities_;
            return accessoryUtilitiesCapabilities == null ? AccessoryUtilitiesCapabilities.getDefaultInstance() : accessoryUtilitiesCapabilities;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getAccessoryUtilitiesCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.CapabilitiesResponseOrBuilder
        public boolean hasAccessoryUtilitiesCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAccessoryUtilitiesCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAccessoryUtilitiesCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getAccessoryUtilitiesCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* JADX INFO: loaded from: classes13.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private SingleFieldBuilderV3<AccessoryUtilitiesCapabilities, AccessoryUtilitiesCapabilities.Builder, AccessoryUtilitiesCapabilitiesOrBuilder> accessoryUtilitiesCapabilitiesBuilder_;
            private AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities_;
            private int bitField0_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<AccessoryUtilitiesCapabilities, AccessoryUtilitiesCapabilities.Builder, AccessoryUtilitiesCapabilitiesOrBuilder> singleFieldBuilderV3 = this.accessoryUtilitiesCapabilitiesBuilder_;
                    capabilitiesResponse.accessoryUtilitiesCapabilities_ = singleFieldBuilderV3 == null ? this.accessoryUtilitiesCapabilities_ : (AccessoryUtilitiesCapabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AccessoryUtilitiesCapabilities, AccessoryUtilitiesCapabilities.Builder, AccessoryUtilitiesCapabilitiesOrBuilder> getAccessoryUtilitiesCapabilitiesFieldBuilder() {
                if (this.accessoryUtilitiesCapabilitiesBuilder_ == null) {
                    this.accessoryUtilitiesCapabilitiesBuilder_ = new SingleFieldBuilderV3<>(getAccessoryUtilitiesCapabilities(), getParentForChildren(), isClean());
                    this.accessoryUtilitiesCapabilities_ = null;
                }
                return this.accessoryUtilitiesCapabilitiesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAccessoryUtilitiesCapabilitiesFieldBuilder();
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
                this.accessoryUtilitiesCapabilities_ = null;
                SingleFieldBuilderV3<AccessoryUtilitiesCapabilities, AccessoryUtilitiesCapabilities.Builder, AccessoryUtilitiesCapabilitiesOrBuilder> singleFieldBuilderV3 = this.accessoryUtilitiesCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessoryUtilitiesCapabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearAccessoryUtilitiesCapabilities() {
                this.bitField0_ &= -2;
                this.accessoryUtilitiesCapabilities_ = null;
                SingleFieldBuilderV3<AccessoryUtilitiesCapabilities, AccessoryUtilitiesCapabilities.Builder, AccessoryUtilitiesCapabilitiesOrBuilder> singleFieldBuilderV3 = this.accessoryUtilitiesCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessoryUtilitiesCapabilitiesBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.CapabilitiesResponseOrBuilder
            public AccessoryUtilitiesCapabilities getAccessoryUtilitiesCapabilities() {
                SingleFieldBuilderV3<AccessoryUtilitiesCapabilities, AccessoryUtilitiesCapabilities.Builder, AccessoryUtilitiesCapabilitiesOrBuilder> singleFieldBuilderV3 = this.accessoryUtilitiesCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessoryUtilitiesCapabilities) singleFieldBuilderV3.getMessage();
                }
                AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities = this.accessoryUtilitiesCapabilities_;
                return accessoryUtilitiesCapabilities == null ? AccessoryUtilitiesCapabilities.getDefaultInstance() : accessoryUtilitiesCapabilities;
            }

            public AccessoryUtilitiesCapabilities.Builder getAccessoryUtilitiesCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AccessoryUtilitiesCapabilities.Builder) getAccessoryUtilitiesCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.CapabilitiesResponseOrBuilder
            public AccessoryUtilitiesCapabilitiesOrBuilder getAccessoryUtilitiesCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<AccessoryUtilitiesCapabilities, AccessoryUtilitiesCapabilities.Builder, AccessoryUtilitiesCapabilitiesOrBuilder> singleFieldBuilderV3 = this.accessoryUtilitiesCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessoryUtilitiesCapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities = this.accessoryUtilitiesCapabilities_;
                return accessoryUtilitiesCapabilities == null ? AccessoryUtilitiesCapabilities.getDefaultInstance() : accessoryUtilitiesCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.CapabilitiesResponseOrBuilder
            public boolean hasAccessoryUtilitiesCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAccessoryUtilitiesCapabilities(AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities) {
                AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities2;
                SingleFieldBuilderV3<AccessoryUtilitiesCapabilities, AccessoryUtilitiesCapabilities.Builder, AccessoryUtilitiesCapabilitiesOrBuilder> singleFieldBuilderV3 = this.accessoryUtilitiesCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(accessoryUtilitiesCapabilities);
                } else if ((this.bitField0_ & 1) == 0 || (accessoryUtilitiesCapabilities2 = this.accessoryUtilitiesCapabilities_) == null || accessoryUtilitiesCapabilities2 == AccessoryUtilitiesCapabilities.getDefaultInstance()) {
                    this.accessoryUtilitiesCapabilities_ = accessoryUtilitiesCapabilities;
                } else {
                    getAccessoryUtilitiesCapabilitiesBuilder().mergeFrom(accessoryUtilitiesCapabilities);
                }
                if (this.accessoryUtilitiesCapabilities_ != null) {
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
                                    codedInputStream.readMessage(getAccessoryUtilitiesCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setAccessoryUtilitiesCapabilities(AccessoryUtilitiesCapabilities.Builder builder) {
                SingleFieldBuilderV3<AccessoryUtilitiesCapabilities, AccessoryUtilitiesCapabilities.Builder, AccessoryUtilitiesCapabilitiesOrBuilder> singleFieldBuilderV3 = this.accessoryUtilitiesCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.accessoryUtilitiesCapabilities_ = builder.build();
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

            public Builder setAccessoryUtilitiesCapabilities(AccessoryUtilitiesCapabilities accessoryUtilitiesCapabilities) {
                SingleFieldBuilderV3<AccessoryUtilitiesCapabilities, AccessoryUtilitiesCapabilities.Builder, AccessoryUtilitiesCapabilitiesOrBuilder> singleFieldBuilderV3 = this.accessoryUtilitiesCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    accessoryUtilitiesCapabilities.getClass();
                    this.accessoryUtilitiesCapabilities_ = accessoryUtilitiesCapabilities;
                } else {
                    singleFieldBuilderV3.setMessage(accessoryUtilitiesCapabilities);
                }
                this.bitField0_ |= 1;
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
                if (capabilitiesResponse.hasAccessoryUtilitiesCapabilities()) {
                    mergeAccessoryUtilitiesCapabilities(capabilitiesResponse.getAccessoryUtilitiesCapabilities());
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

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CapabilitiesResponse() {
            this.memoizedIsInitialized = (byte) -1;
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

    /* JADX INFO: loaded from: classes13.dex */
    public static final class ErrorNotification extends GeneratedMessageV3 implements ErrorNotificationOrBuilder {
        public static final int COMPONENT_INDEX_FIELD_NUMBER = 2;
        public static final int ERROR_CODE_FIELD_NUMBER = 3;
        public static final int ERROR_DATA_FIELD_NUMBER = 4;
        public static final int ERROR_LEVEL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int componentIndex_;
        private int errorCode_;
        private int errorData_;
        private int errorLevel_;
        private byte memoizedIsInitialized;
        private static final ErrorNotification DEFAULT_INSTANCE = new ErrorNotification();

        @Deprecated
        public static final Parser<ErrorNotification> PARSER = new AbstractParser<ErrorNotification>() { // from class: com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotification.1
            @Override // com.google.protobuf.Parser
            public ErrorNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ErrorNotification.newBuilder();
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

        private ErrorNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.errorLevel_ = 0;
            this.componentIndex_ = 0;
            this.errorCode_ = 0;
            this.errorData_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ErrorNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ErrorNotification_descriptor;
        }

        public static Builder newBuilder(ErrorNotification errorNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(errorNotification);
        }

        public static ErrorNotification parseDelimitedFrom(InputStream inputStream) {
            return (ErrorNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ErrorNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ErrorNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ErrorNotification)) {
                return super.equals(obj);
            }
            ErrorNotification errorNotification = (ErrorNotification) obj;
            if (hasErrorLevel() != errorNotification.hasErrorLevel()) {
                return false;
            }
            if ((hasErrorLevel() && this.errorLevel_ != errorNotification.errorLevel_) || hasComponentIndex() != errorNotification.hasComponentIndex()) {
                return false;
            }
            if ((hasComponentIndex() && getComponentIndex() != errorNotification.getComponentIndex()) || hasErrorCode() != errorNotification.hasErrorCode()) {
                return false;
            }
            if ((!hasErrorCode() || getErrorCode() == errorNotification.getErrorCode()) && hasErrorData() == errorNotification.hasErrorData()) {
                return (!hasErrorData() || getErrorData() == errorNotification.getErrorData()) && getUnknownFields().equals(errorNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
        public int getComponentIndex() {
            return this.componentIndex_;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
        public int getErrorCode() {
            return this.errorCode_;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
        public int getErrorData() {
            return this.errorData_;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
        public ErrorLevel getErrorLevel() {
            ErrorLevel errorLevelForNumber = ErrorLevel.forNumber(this.errorLevel_);
            return errorLevelForNumber == null ? ErrorLevel.INFO : errorLevelForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ErrorNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.errorLevel_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.componentIndex_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.errorCode_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(4, this.errorData_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
        public boolean hasComponentIndex() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
        public boolean hasErrorCode() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
        public boolean hasErrorData() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
        public boolean hasErrorLevel() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasErrorLevel()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.errorLevel_;
            }
            if (hasComponentIndex()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getComponentIndex();
            }
            if (hasErrorCode()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getErrorCode();
            }
            if (hasErrorData()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getErrorData();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ErrorNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ErrorNotification.class, Builder.class);
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
            return new ErrorNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.errorLevel_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.componentIndex_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.errorCode_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.errorData_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ErrorNotificationOrBuilder {
            private int bitField0_;
            private int componentIndex_;
            private int errorCode_;
            private int errorData_;
            private int errorLevel_;

            private Builder() {
                this.errorLevel_ = 0;
            }

            private void buildPartial0(ErrorNotification errorNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    errorNotification.errorLevel_ = this.errorLevel_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    errorNotification.componentIndex_ = this.componentIndex_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    errorNotification.errorCode_ = this.errorCode_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    errorNotification.errorData_ = this.errorData_;
                    i14 |= 8;
                }
                errorNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ErrorNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ErrorNotification build() {
                ErrorNotification errorNotificationBuildPartial = buildPartial();
                if (errorNotificationBuildPartial.isInitialized()) {
                    return errorNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) errorNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ErrorNotification buildPartial() {
                ErrorNotification errorNotification = new ErrorNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(errorNotification);
                }
                onBuilt();
                return errorNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.errorLevel_ = 0;
                this.componentIndex_ = 0;
                this.errorCode_ = 0;
                this.errorData_ = 0;
                return this;
            }

            public Builder clearComponentIndex() {
                this.bitField0_ &= -3;
                this.componentIndex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearErrorCode() {
                this.bitField0_ &= -5;
                this.errorCode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearErrorData() {
                this.bitField0_ &= -9;
                this.errorData_ = 0;
                onChanged();
                return this;
            }

            public Builder clearErrorLevel() {
                this.bitField0_ &= -2;
                this.errorLevel_ = 0;
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

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
            public int getComponentIndex() {
                return this.componentIndex_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ErrorNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
            public int getErrorCode() {
                return this.errorCode_;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
            public int getErrorData() {
                return this.errorData_;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
            public ErrorLevel getErrorLevel() {
                ErrorLevel errorLevelForNumber = ErrorLevel.forNumber(this.errorLevel_);
                return errorLevelForNumber == null ? ErrorLevel.INFO : errorLevelForNumber;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
            public boolean hasComponentIndex() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
            public boolean hasErrorCode() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
            public boolean hasErrorData() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotificationOrBuilder
            public boolean hasErrorLevel() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_ErrorNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ErrorNotification.class, Builder.class);
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
                                    if (ErrorLevel.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.errorLevel_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.componentIndex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.errorCode_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.errorData_ = codedInputStream.readUInt32();
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

            public Builder setComponentIndex(int i14) {
                this.componentIndex_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setErrorCode(int i14) {
                this.errorCode_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setErrorData(int i14) {
                this.errorData_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setErrorLevel(ErrorLevel errorLevel) {
                errorLevel.getClass();
                this.bitField0_ |= 1;
                this.errorLevel_ = errorLevel.getNumber();
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
            public ErrorNotification getDefaultInstanceForType() {
                return ErrorNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.errorLevel_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ErrorNotification) {
                    return mergeFrom((ErrorNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ErrorNotification errorNotification) {
                if (errorNotification == ErrorNotification.getDefaultInstance()) {
                    return this;
                }
                if (errorNotification.hasErrorLevel()) {
                    setErrorLevel(errorNotification.getErrorLevel());
                }
                if (errorNotification.hasComponentIndex()) {
                    setComponentIndex(errorNotification.getComponentIndex());
                }
                if (errorNotification.hasErrorCode()) {
                    setErrorCode(errorNotification.getErrorCode());
                }
                if (errorNotification.hasErrorData()) {
                    setErrorData(errorNotification.getErrorData());
                }
                mergeUnknownFields(errorNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ErrorNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ErrorNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ErrorNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ErrorNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ErrorNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ErrorNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ErrorNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ErrorNotification parseFrom(InputStream inputStream) {
            return (ErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ ErrorNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ErrorNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ErrorNotification() {
            this.componentIndex_ = 0;
            this.errorCode_ = 0;
            this.errorData_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.errorLevel_ = 0;
        }

        public static ErrorNotification parseFrom(CodedInputStream codedInputStream) {
            return (ErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ErrorNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ErrorLevel implements ProtocolMessageEnum {
            INFO(0),
            WARNING(1),
            CRITICAL(2);

            public static final int CRITICAL_VALUE = 2;
            public static final int INFO_VALUE = 0;
            public static final int WARNING_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<ErrorLevel> internalValueMap = new Internal.EnumLiteMap<ErrorLevel>() { // from class: com.garmin.proto.generated.GDIAccessoryUtilities.ErrorNotification.ErrorLevel.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ErrorLevel findValueByNumber(int i14) {
                    return ErrorLevel.forNumber(i14);
                }
            };
            private static final ErrorLevel[] VALUES = values();

            ErrorLevel(int i14) {
                this.value = i14;
            }

            public static ErrorLevel forNumber(int i14) {
                if (i14 == 0) {
                    return INFO;
                }
                if (i14 == 1) {
                    return WARNING;
                }
                if (i14 != 2) {
                    return null;
                }
                return CRITICAL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ErrorNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ErrorLevel> internalGetValueMap() {
                return internalValueMap;
            }

            public static ErrorLevel valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ErrorLevel valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int ACTIVITY_START_REQUEST_FIELD_NUMBER = 2;
        public static final int ACTIVITY_START_RESPONSE_FIELD_NUMBER = 3;
        public static final int ERROR_NOTIFICATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private ActivityStartRequest activityStartRequest_;
        private ActivityStartResponse activityStartResponse_;
        private int bitField0_;
        private ErrorNotification errorNotification_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIAccessoryUtilities.Service.1
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
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_Service_descriptor;
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
            if (hasErrorNotification() != service.hasErrorNotification()) {
                return false;
            }
            if ((hasErrorNotification() && !getErrorNotification().equals(service.getErrorNotification())) || hasActivityStartRequest() != service.hasActivityStartRequest()) {
                return false;
            }
            if ((!hasActivityStartRequest() || getActivityStartRequest().equals(service.getActivityStartRequest())) && hasActivityStartResponse() == service.hasActivityStartResponse()) {
                return (!hasActivityStartResponse() || getActivityStartResponse().equals(service.getActivityStartResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
        public ActivityStartRequest getActivityStartRequest() {
            ActivityStartRequest activityStartRequest = this.activityStartRequest_;
            return activityStartRequest == null ? ActivityStartRequest.getDefaultInstance() : activityStartRequest;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
        public ActivityStartRequestOrBuilder getActivityStartRequestOrBuilder() {
            ActivityStartRequest activityStartRequest = this.activityStartRequest_;
            return activityStartRequest == null ? ActivityStartRequest.getDefaultInstance() : activityStartRequest;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
        public ActivityStartResponse getActivityStartResponse() {
            ActivityStartResponse activityStartResponse = this.activityStartResponse_;
            return activityStartResponse == null ? ActivityStartResponse.getDefaultInstance() : activityStartResponse;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
        public ActivityStartResponseOrBuilder getActivityStartResponseOrBuilder() {
            ActivityStartResponse activityStartResponse = this.activityStartResponse_;
            return activityStartResponse == null ? ActivityStartResponse.getDefaultInstance() : activityStartResponse;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
        public ErrorNotification getErrorNotification() {
            ErrorNotification errorNotification = this.errorNotification_;
            return errorNotification == null ? ErrorNotification.getDefaultInstance() : errorNotification;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
        public ErrorNotificationOrBuilder getErrorNotificationOrBuilder() {
            ErrorNotification errorNotification = this.errorNotification_;
            return errorNotification == null ? ErrorNotification.getDefaultInstance() : errorNotification;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getErrorNotification()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getActivityStartRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getActivityStartResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
        public boolean hasActivityStartRequest() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
        public boolean hasActivityStartResponse() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
        public boolean hasErrorNotification() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasErrorNotification()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getErrorNotification().hashCode();
            }
            if (hasActivityStartRequest()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getActivityStartRequest().hashCode();
            }
            if (hasActivityStartResponse()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getActivityStartResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if (!hasActivityStartResponse() || getActivityStartResponse().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getErrorNotification());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getActivityStartRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getActivityStartResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private SingleFieldBuilderV3<ActivityStartRequest, ActivityStartRequest.Builder, ActivityStartRequestOrBuilder> activityStartRequestBuilder_;
            private ActivityStartRequest activityStartRequest_;
            private SingleFieldBuilderV3<ActivityStartResponse, ActivityStartResponse.Builder, ActivityStartResponseOrBuilder> activityStartResponseBuilder_;
            private ActivityStartResponse activityStartResponse_;
            private int bitField0_;
            private SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> errorNotificationBuilder_;
            private ErrorNotification errorNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                    service.errorNotification_ = singleFieldBuilderV3 == null ? this.errorNotification_ : (ErrorNotification) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ActivityStartRequest, ActivityStartRequest.Builder, ActivityStartRequestOrBuilder> singleFieldBuilderV4 = this.activityStartRequestBuilder_;
                    service.activityStartRequest_ = singleFieldBuilderV4 == null ? this.activityStartRequest_ : (ActivityStartRequest) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ActivityStartResponse, ActivityStartResponse.Builder, ActivityStartResponseOrBuilder> singleFieldBuilderV5 = this.activityStartResponseBuilder_;
                    service.activityStartResponse_ = singleFieldBuilderV5 == null ? this.activityStartResponse_ : (ActivityStartResponse) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ActivityStartRequest, ActivityStartRequest.Builder, ActivityStartRequestOrBuilder> getActivityStartRequestFieldBuilder() {
                if (this.activityStartRequestBuilder_ == null) {
                    this.activityStartRequestBuilder_ = new SingleFieldBuilderV3<>(getActivityStartRequest(), getParentForChildren(), isClean());
                    this.activityStartRequest_ = null;
                }
                return this.activityStartRequestBuilder_;
            }

            private SingleFieldBuilderV3<ActivityStartResponse, ActivityStartResponse.Builder, ActivityStartResponseOrBuilder> getActivityStartResponseFieldBuilder() {
                if (this.activityStartResponseBuilder_ == null) {
                    this.activityStartResponseBuilder_ = new SingleFieldBuilderV3<>(getActivityStartResponse(), getParentForChildren(), isClean());
                    this.activityStartResponse_ = null;
                }
                return this.activityStartResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_Service_descriptor;
            }

            private SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> getErrorNotificationFieldBuilder() {
                if (this.errorNotificationBuilder_ == null) {
                    this.errorNotificationBuilder_ = new SingleFieldBuilderV3<>(getErrorNotification(), getParentForChildren(), isClean());
                    this.errorNotification_ = null;
                }
                return this.errorNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getErrorNotificationFieldBuilder();
                    getActivityStartRequestFieldBuilder();
                    getActivityStartResponseFieldBuilder();
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
                this.errorNotification_ = null;
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.errorNotificationBuilder_ = null;
                }
                this.activityStartRequest_ = null;
                SingleFieldBuilderV3<ActivityStartRequest, ActivityStartRequest.Builder, ActivityStartRequestOrBuilder> singleFieldBuilderV4 = this.activityStartRequestBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.activityStartRequestBuilder_ = null;
                }
                this.activityStartResponse_ = null;
                SingleFieldBuilderV3<ActivityStartResponse, ActivityStartResponse.Builder, ActivityStartResponseOrBuilder> singleFieldBuilderV5 = this.activityStartResponseBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.activityStartResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearActivityStartRequest() {
                this.bitField0_ &= -3;
                this.activityStartRequest_ = null;
                SingleFieldBuilderV3<ActivityStartRequest, ActivityStartRequest.Builder, ActivityStartRequestOrBuilder> singleFieldBuilderV3 = this.activityStartRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.activityStartRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearActivityStartResponse() {
                this.bitField0_ &= -5;
                this.activityStartResponse_ = null;
                SingleFieldBuilderV3<ActivityStartResponse, ActivityStartResponse.Builder, ActivityStartResponseOrBuilder> singleFieldBuilderV3 = this.activityStartResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.activityStartResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearErrorNotification() {
                this.bitField0_ &= -2;
                this.errorNotification_ = null;
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.errorNotificationBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
            public ActivityStartRequest getActivityStartRequest() {
                SingleFieldBuilderV3<ActivityStartRequest, ActivityStartRequest.Builder, ActivityStartRequestOrBuilder> singleFieldBuilderV3 = this.activityStartRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActivityStartRequest) singleFieldBuilderV3.getMessage();
                }
                ActivityStartRequest activityStartRequest = this.activityStartRequest_;
                return activityStartRequest == null ? ActivityStartRequest.getDefaultInstance() : activityStartRequest;
            }

            public ActivityStartRequest.Builder getActivityStartRequestBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ActivityStartRequest.Builder) getActivityStartRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
            public ActivityStartRequestOrBuilder getActivityStartRequestOrBuilder() {
                SingleFieldBuilderV3<ActivityStartRequest, ActivityStartRequest.Builder, ActivityStartRequestOrBuilder> singleFieldBuilderV3 = this.activityStartRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActivityStartRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ActivityStartRequest activityStartRequest = this.activityStartRequest_;
                return activityStartRequest == null ? ActivityStartRequest.getDefaultInstance() : activityStartRequest;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
            public ActivityStartResponse getActivityStartResponse() {
                SingleFieldBuilderV3<ActivityStartResponse, ActivityStartResponse.Builder, ActivityStartResponseOrBuilder> singleFieldBuilderV3 = this.activityStartResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActivityStartResponse) singleFieldBuilderV3.getMessage();
                }
                ActivityStartResponse activityStartResponse = this.activityStartResponse_;
                return activityStartResponse == null ? ActivityStartResponse.getDefaultInstance() : activityStartResponse;
            }

            public ActivityStartResponse.Builder getActivityStartResponseBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ActivityStartResponse.Builder) getActivityStartResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
            public ActivityStartResponseOrBuilder getActivityStartResponseOrBuilder() {
                SingleFieldBuilderV3<ActivityStartResponse, ActivityStartResponse.Builder, ActivityStartResponseOrBuilder> singleFieldBuilderV3 = this.activityStartResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActivityStartResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ActivityStartResponse activityStartResponse = this.activityStartResponse_;
                return activityStartResponse == null ? ActivityStartResponse.getDefaultInstance() : activityStartResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
            public ErrorNotification getErrorNotification() {
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ErrorNotification) singleFieldBuilderV3.getMessage();
                }
                ErrorNotification errorNotification = this.errorNotification_;
                return errorNotification == null ? ErrorNotification.getDefaultInstance() : errorNotification;
            }

            public ErrorNotification.Builder getErrorNotificationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ErrorNotification.Builder) getErrorNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
            public ErrorNotificationOrBuilder getErrorNotificationOrBuilder() {
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ErrorNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ErrorNotification errorNotification = this.errorNotification_;
                return errorNotification == null ? ErrorNotification.getDefaultInstance() : errorNotification;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
            public boolean hasActivityStartRequest() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
            public boolean hasActivityStartResponse() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAccessoryUtilities.ServiceOrBuilder
            public boolean hasErrorNotification() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAccessoryUtilities.internal_static_GDI_Proto_AccessoryUtilities_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasActivityStartResponse() || getActivityStartResponse().isInitialized();
            }

            public Builder mergeActivityStartRequest(ActivityStartRequest activityStartRequest) {
                ActivityStartRequest activityStartRequest2;
                SingleFieldBuilderV3<ActivityStartRequest, ActivityStartRequest.Builder, ActivityStartRequestOrBuilder> singleFieldBuilderV3 = this.activityStartRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(activityStartRequest);
                } else if ((this.bitField0_ & 2) == 0 || (activityStartRequest2 = this.activityStartRequest_) == null || activityStartRequest2 == ActivityStartRequest.getDefaultInstance()) {
                    this.activityStartRequest_ = activityStartRequest;
                } else {
                    getActivityStartRequestBuilder().mergeFrom(activityStartRequest);
                }
                if (this.activityStartRequest_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeActivityStartResponse(ActivityStartResponse activityStartResponse) {
                ActivityStartResponse activityStartResponse2;
                SingleFieldBuilderV3<ActivityStartResponse, ActivityStartResponse.Builder, ActivityStartResponseOrBuilder> singleFieldBuilderV3 = this.activityStartResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(activityStartResponse);
                } else if ((this.bitField0_ & 4) == 0 || (activityStartResponse2 = this.activityStartResponse_) == null || activityStartResponse2 == ActivityStartResponse.getDefaultInstance()) {
                    this.activityStartResponse_ = activityStartResponse;
                } else {
                    getActivityStartResponseBuilder().mergeFrom(activityStartResponse);
                }
                if (this.activityStartResponse_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeErrorNotification(ErrorNotification errorNotification) {
                ErrorNotification errorNotification2;
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(errorNotification);
                } else if ((this.bitField0_ & 1) == 0 || (errorNotification2 = this.errorNotification_) == null || errorNotification2 == ErrorNotification.getDefaultInstance()) {
                    this.errorNotification_ = errorNotification;
                } else {
                    getErrorNotificationBuilder().mergeFrom(errorNotification);
                }
                if (this.errorNotification_ != null) {
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
                                    codedInputStream.readMessage(getErrorNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getActivityStartRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getActivityStartResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setActivityStartRequest(ActivityStartRequest.Builder builder) {
                SingleFieldBuilderV3<ActivityStartRequest, ActivityStartRequest.Builder, ActivityStartRequestOrBuilder> singleFieldBuilderV3 = this.activityStartRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.activityStartRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setActivityStartResponse(ActivityStartResponse.Builder builder) {
                SingleFieldBuilderV3<ActivityStartResponse, ActivityStartResponse.Builder, ActivityStartResponseOrBuilder> singleFieldBuilderV3 = this.activityStartResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.activityStartResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setErrorNotification(ErrorNotification.Builder builder) {
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.errorNotification_ = builder.build();
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

            public Builder setActivityStartRequest(ActivityStartRequest activityStartRequest) {
                SingleFieldBuilderV3<ActivityStartRequest, ActivityStartRequest.Builder, ActivityStartRequestOrBuilder> singleFieldBuilderV3 = this.activityStartRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    activityStartRequest.getClass();
                    this.activityStartRequest_ = activityStartRequest;
                } else {
                    singleFieldBuilderV3.setMessage(activityStartRequest);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setActivityStartResponse(ActivityStartResponse activityStartResponse) {
                SingleFieldBuilderV3<ActivityStartResponse, ActivityStartResponse.Builder, ActivityStartResponseOrBuilder> singleFieldBuilderV3 = this.activityStartResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    activityStartResponse.getClass();
                    this.activityStartResponse_ = activityStartResponse;
                } else {
                    singleFieldBuilderV3.setMessage(activityStartResponse);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setErrorNotification(ErrorNotification errorNotification) {
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    errorNotification.getClass();
                    this.errorNotification_ = errorNotification;
                } else {
                    singleFieldBuilderV3.setMessage(errorNotification);
                }
                this.bitField0_ |= 1;
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
                if (service.hasErrorNotification()) {
                    mergeErrorNotification(service.getErrorNotification());
                }
                if (service.hasActivityStartRequest()) {
                    mergeActivityStartRequest(service.getActivityStartRequest());
                }
                if (service.hasActivityStartResponse()) {
                    mergeActivityStartResponse(service.getActivityStartResponse());
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
