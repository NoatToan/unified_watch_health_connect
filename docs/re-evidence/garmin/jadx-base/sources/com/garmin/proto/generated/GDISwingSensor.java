package com.garmin.proto.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class GDISwingSensor {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014GDISwingSensor.proto\u0012\u0015GDI.Proto.SwingSensor\u001a\u0019GDISwingSensorClubs.proto\u001a\u001bGDISwingSensorMetrics.proto\u001a GDISwingSensorUserSettings.proto\"0\n\u0014NewSwingNotification\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012\f\n\u0004size\u0018\u0002 \u0002(\r\"\"\n SwingSensorConnectedNotification\"%\n#SwingSensorDisconnectedNotification\"´\t\n\u0012SwingSensorService\u0012K\n\u0016new_swing_notification\u0018\u0001 \u0001(\u000b2+.GDI.Proto.SwingSensor.NewSwingNotification\u0012M\n\u0015get_club_list_request\u0018\u0004 \u0001(\u000b2..GDI.Proto.SwingSensorClubs.GetClubListRequest\u0012O\n\u0016get_club_list_response\u0018\u0005 \u0001(\u000b2/.GDI.Proto.SwingSensorClubs.GetClubListResponse\u0012Q\n\u0017set_active_club_request\u0018\b \u0001(\u000b20.GDI.Proto.SwingSensorClubs.SetActiveClubRequest\u0012S\n\u0018set_active_club_response\u0018\t \u0001(\u000b21.GDI.Proto.SwingSensorClubs.SetActiveClubResponse\u0012\\\n\u0019get_user_settings_request\u0018\n \u0001(\u000b29.GDI.Proto.SwingSensorUserSettings.GetUserSettingsRequest\u0012^\n\u001aget_user_settings_response\u0018\u000b \u0001(\u000b2:.GDI.Proto.SwingSensorUserSettings.GetUserSettingsResponse\u0012\\\n\u0019set_user_settings_request\u0018\f \u0001(\u000b29.GDI.Proto.SwingSensorUserSettings.SetUserSettingsRequest\u0012^\n\u001aset_user_settings_response\u0018\r \u0001(\u000b2:.GDI.Proto.SwingSensorUserSettings.SetUserSettingsResponse\u0012d\n#swing_sensor_connected_notification\u0018\u000e \u0001(\u000b27.GDI.Proto.SwingSensor.SwingSensorConnectedNotification\u0012j\n&swing_sensor_disconnected_notification\u0018\u000f \u0001(\u000b2:.GDI.Proto.SwingSensor.SwingSensorDisconnectedNotification\u0012Z\n\u001aswing_metrics_notification\u0018\u0012 \u0001(\u000b26.GDI.Proto.SwingSensorMetrics.SwingMetricsNotification\u0012_\n\u001eclub_list_changed_notification\u0018\u0013 \u0001(\u000b27.GDI.Proto.SwingSensorClubs.ClubListChangedNotificationB.\n\u001acom.garmin.proto.generatedB\u000eGDISwingSensorH\u0003"}, new Descriptors.FileDescriptor[]{GDISwingSensorClubs.getDescriptor(), GDISwingSensorMetrics.getDescriptor(), GDISwingSensorUserSettings.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensor_NewSwingNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensor_NewSwingNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensor_SwingSensorConnectedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensor_SwingSensorConnectedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensor_SwingSensorDisconnectedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensor_SwingSensorDisconnectedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensor_SwingSensorService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensor_SwingSensorService_fieldAccessorTable;

    public interface NewSwingNotificationOrBuilder extends MessageOrBuilder {
        int getId();

        int getSize();

        boolean hasId();

        boolean hasSize();
    }

    public interface SwingSensorConnectedNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface SwingSensorDisconnectedNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface SwingSensorServiceOrBuilder extends MessageOrBuilder {
        GDISwingSensorClubs.ClubListChangedNotification getClubListChangedNotification();

        GDISwingSensorClubs.ClubListChangedNotificationOrBuilder getClubListChangedNotificationOrBuilder();

        GDISwingSensorClubs.GetClubListRequest getGetClubListRequest();

        GDISwingSensorClubs.GetClubListRequestOrBuilder getGetClubListRequestOrBuilder();

        GDISwingSensorClubs.GetClubListResponse getGetClubListResponse();

        GDISwingSensorClubs.GetClubListResponseOrBuilder getGetClubListResponseOrBuilder();

        GDISwingSensorUserSettings.GetUserSettingsRequest getGetUserSettingsRequest();

        GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder getGetUserSettingsRequestOrBuilder();

        GDISwingSensorUserSettings.GetUserSettingsResponse getGetUserSettingsResponse();

        GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder getGetUserSettingsResponseOrBuilder();

        NewSwingNotification getNewSwingNotification();

        NewSwingNotificationOrBuilder getNewSwingNotificationOrBuilder();

        GDISwingSensorClubs.SetActiveClubRequest getSetActiveClubRequest();

        GDISwingSensorClubs.SetActiveClubRequestOrBuilder getSetActiveClubRequestOrBuilder();

        GDISwingSensorClubs.SetActiveClubResponse getSetActiveClubResponse();

        GDISwingSensorClubs.SetActiveClubResponseOrBuilder getSetActiveClubResponseOrBuilder();

        GDISwingSensorUserSettings.SetUserSettingsRequest getSetUserSettingsRequest();

        GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder getSetUserSettingsRequestOrBuilder();

        GDISwingSensorUserSettings.SetUserSettingsResponse getSetUserSettingsResponse();

        GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder getSetUserSettingsResponseOrBuilder();

        GDISwingSensorMetrics.SwingMetricsNotification getSwingMetricsNotification();

        GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder getSwingMetricsNotificationOrBuilder();

        SwingSensorConnectedNotification getSwingSensorConnectedNotification();

        SwingSensorConnectedNotificationOrBuilder getSwingSensorConnectedNotificationOrBuilder();

        SwingSensorDisconnectedNotification getSwingSensorDisconnectedNotification();

        SwingSensorDisconnectedNotificationOrBuilder getSwingSensorDisconnectedNotificationOrBuilder();

        boolean hasClubListChangedNotification();

        boolean hasGetClubListRequest();

        boolean hasGetClubListResponse();

        boolean hasGetUserSettingsRequest();

        boolean hasGetUserSettingsResponse();

        boolean hasNewSwingNotification();

        boolean hasSetActiveClubRequest();

        boolean hasSetActiveClubResponse();

        boolean hasSetUserSettingsRequest();

        boolean hasSetUserSettingsResponse();

        boolean hasSwingMetricsNotification();

        boolean hasSwingSensorConnectedNotification();

        boolean hasSwingSensorDisconnectedNotification();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SwingSensor_NewSwingNotification_descriptor = descriptor2;
        internal_static_GDI_Proto_SwingSensor_NewSwingNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Id", "Size"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_SwingSensor_SwingSensorConnectedNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_SwingSensor_SwingSensorConnectedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_SwingSensor_SwingSensorDisconnectedNotification_descriptor = descriptor4;
        internal_static_GDI_Proto_SwingSensor_SwingSensorDisconnectedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_SwingSensor_SwingSensorService_descriptor = descriptor5;
        internal_static_GDI_Proto_SwingSensor_SwingSensorService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"NewSwingNotification", "GetClubListRequest", "GetClubListResponse", "SetActiveClubRequest", "SetActiveClubResponse", "GetUserSettingsRequest", "GetUserSettingsResponse", "SetUserSettingsRequest", "SetUserSettingsResponse", "SwingSensorConnectedNotification", "SwingSensorDisconnectedNotification", "SwingMetricsNotification", "ClubListChangedNotification"});
        GDISwingSensorClubs.getDescriptor();
        GDISwingSensorMetrics.getDescriptor();
        GDISwingSensorUserSettings.getDescriptor();
    }

    private GDISwingSensor() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class NewSwingNotification extends GeneratedMessageV3 implements NewSwingNotificationOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int SIZE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int size_;
        private static final NewSwingNotification DEFAULT_INSTANCE = new NewSwingNotification();

        @Deprecated
        public static final Parser<NewSwingNotification> PARSER = new AbstractParser<NewSwingNotification>() { // from class: com.garmin.proto.generated.GDISwingSensor.NewSwingNotification.1
            @Override // com.google.protobuf.Parser
            public NewSwingNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = NewSwingNotification.newBuilder();
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

        private NewSwingNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.size_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NewSwingNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_NewSwingNotification_descriptor;
        }

        public static Builder newBuilder(NewSwingNotification newSwingNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(newSwingNotification);
        }

        public static NewSwingNotification parseDelimitedFrom(InputStream inputStream) {
            return (NewSwingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NewSwingNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<NewSwingNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NewSwingNotification)) {
                return super.equals(obj);
            }
            NewSwingNotification newSwingNotification = (NewSwingNotification) obj;
            if (hasId() != newSwingNotification.hasId()) {
                return false;
            }
            if ((!hasId() || getId() == newSwingNotification.getId()) && hasSize() == newSwingNotification.hasSize()) {
                return (!hasSize() || getSize() == newSwingNotification.getSize()) && getUnknownFields().equals(newSwingNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.NewSwingNotificationOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NewSwingNotification> getParserForType() {
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
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.size_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.NewSwingNotificationOrBuilder
        public int getSize() {
            return this.size_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.NewSwingNotificationOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.NewSwingNotificationOrBuilder
        public boolean hasSize() {
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
            if (hasSize()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSize();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_NewSwingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(NewSwingNotification.class, Builder.class);
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
            if (hasSize()) {
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
            return new NewSwingNotification();
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
                codedOutputStream.writeUInt32(2, this.size_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NewSwingNotificationOrBuilder {
            private int bitField0_;
            private int id_;
            private int size_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(NewSwingNotification newSwingNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    newSwingNotification.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    newSwingNotification.size_ = this.size_;
                    i14 |= 2;
                }
                newSwingNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_NewSwingNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NewSwingNotification build() {
                NewSwingNotification newSwingNotificationBuildPartial = buildPartial();
                if (newSwingNotificationBuildPartial.isInitialized()) {
                    return newSwingNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) newSwingNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NewSwingNotification buildPartial() {
                NewSwingNotification newSwingNotification = new NewSwingNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(newSwingNotification);
                }
                onBuilt();
                return newSwingNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.size_ = 0;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSize() {
                this.bitField0_ &= -3;
                this.size_ = 0;
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
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_NewSwingNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.NewSwingNotificationOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.NewSwingNotificationOrBuilder
            public int getSize() {
                return this.size_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.NewSwingNotificationOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.NewSwingNotificationOrBuilder
            public boolean hasSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_NewSwingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(NewSwingNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasSize();
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
                                    this.size_ = codedInputStream.readUInt32();
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

            public Builder setId(int i14) {
                this.id_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSize(int i14) {
                this.size_ = i14;
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
            public NewSwingNotification getDefaultInstanceForType() {
                return NewSwingNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NewSwingNotification) {
                    return mergeFrom((NewSwingNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(NewSwingNotification newSwingNotification) {
                if (newSwingNotification == NewSwingNotification.getDefaultInstance()) {
                    return this;
                }
                if (newSwingNotification.hasId()) {
                    setId(newSwingNotification.getId());
                }
                if (newSwingNotification.hasSize()) {
                    setSize(newSwingNotification.getSize());
                }
                mergeUnknownFields(newSwingNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NewSwingNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static NewSwingNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewSwingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NewSwingNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static NewSwingNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NewSwingNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ NewSwingNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static NewSwingNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private NewSwingNotification() {
            this.id_ = 0;
            this.size_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NewSwingNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static NewSwingNotification parseFrom(InputStream inputStream) {
            return (NewSwingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static NewSwingNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewSwingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NewSwingNotification parseFrom(CodedInputStream codedInputStream) {
            return (NewSwingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static NewSwingNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NewSwingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwingSensorConnectedNotification extends GeneratedMessageV3 implements SwingSensorConnectedNotificationOrBuilder {
        private static final SwingSensorConnectedNotification DEFAULT_INSTANCE = new SwingSensorConnectedNotification();

        @Deprecated
        public static final Parser<SwingSensorConnectedNotification> PARSER = new AbstractParser<SwingSensorConnectedNotification>() { // from class: com.garmin.proto.generated.GDISwingSensor.SwingSensorConnectedNotification.1
            @Override // com.google.protobuf.Parser
            public SwingSensorConnectedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwingSensorConnectedNotification.newBuilder();
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

        private SwingSensorConnectedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwingSensorConnectedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorConnectedNotification_descriptor;
        }

        public static Builder newBuilder(SwingSensorConnectedNotification swingSensorConnectedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(swingSensorConnectedNotification);
        }

        public static SwingSensorConnectedNotification parseDelimitedFrom(InputStream inputStream) {
            return (SwingSensorConnectedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwingSensorConnectedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwingSensorConnectedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SwingSensorConnectedNotification) {
                return getUnknownFields().equals(((SwingSensorConnectedNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwingSensorConnectedNotification> getParserForType() {
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
            return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorConnectedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingSensorConnectedNotification.class, Builder.class);
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
            return new SwingSensorConnectedNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwingSensorConnectedNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorConnectedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingSensorConnectedNotification build() {
                SwingSensorConnectedNotification swingSensorConnectedNotificationBuildPartial = buildPartial();
                if (swingSensorConnectedNotificationBuildPartial.isInitialized()) {
                    return swingSensorConnectedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) swingSensorConnectedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingSensorConnectedNotification buildPartial() {
                SwingSensorConnectedNotification swingSensorConnectedNotification = new SwingSensorConnectedNotification(this);
                onBuilt();
                return swingSensorConnectedNotification;
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
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorConnectedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorConnectedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingSensorConnectedNotification.class, Builder.class);
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
            public SwingSensorConnectedNotification getDefaultInstanceForType() {
                return SwingSensorConnectedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwingSensorConnectedNotification) {
                    return mergeFrom((SwingSensorConnectedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwingSensorConnectedNotification swingSensorConnectedNotification) {
                if (swingSensorConnectedNotification == SwingSensorConnectedNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(swingSensorConnectedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwingSensorConnectedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SwingSensorConnectedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwingSensorConnectedNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwingSensorConnectedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingSensorConnectedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingSensorConnectedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwingSensorConnectedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwingSensorConnectedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwingSensorConnectedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwingSensorConnectedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwingSensorConnectedNotification parseFrom(InputStream inputStream) {
            return (SwingSensorConnectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwingSensorConnectedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingSensorConnectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingSensorConnectedNotification parseFrom(CodedInputStream codedInputStream) {
            return (SwingSensorConnectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwingSensorConnectedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingSensorConnectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwingSensorDisconnectedNotification extends GeneratedMessageV3 implements SwingSensorDisconnectedNotificationOrBuilder {
        private static final SwingSensorDisconnectedNotification DEFAULT_INSTANCE = new SwingSensorDisconnectedNotification();

        @Deprecated
        public static final Parser<SwingSensorDisconnectedNotification> PARSER = new AbstractParser<SwingSensorDisconnectedNotification>() { // from class: com.garmin.proto.generated.GDISwingSensor.SwingSensorDisconnectedNotification.1
            @Override // com.google.protobuf.Parser
            public SwingSensorDisconnectedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwingSensorDisconnectedNotification.newBuilder();
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

        private SwingSensorDisconnectedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwingSensorDisconnectedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorDisconnectedNotification_descriptor;
        }

        public static Builder newBuilder(SwingSensorDisconnectedNotification swingSensorDisconnectedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(swingSensorDisconnectedNotification);
        }

        public static SwingSensorDisconnectedNotification parseDelimitedFrom(InputStream inputStream) {
            return (SwingSensorDisconnectedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwingSensorDisconnectedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwingSensorDisconnectedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SwingSensorDisconnectedNotification) {
                return getUnknownFields().equals(((SwingSensorDisconnectedNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwingSensorDisconnectedNotification> getParserForType() {
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
            return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorDisconnectedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingSensorDisconnectedNotification.class, Builder.class);
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
            return new SwingSensorDisconnectedNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwingSensorDisconnectedNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorDisconnectedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingSensorDisconnectedNotification build() {
                SwingSensorDisconnectedNotification swingSensorDisconnectedNotificationBuildPartial = buildPartial();
                if (swingSensorDisconnectedNotificationBuildPartial.isInitialized()) {
                    return swingSensorDisconnectedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) swingSensorDisconnectedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingSensorDisconnectedNotification buildPartial() {
                SwingSensorDisconnectedNotification swingSensorDisconnectedNotification = new SwingSensorDisconnectedNotification(this);
                onBuilt();
                return swingSensorDisconnectedNotification;
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
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorDisconnectedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorDisconnectedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingSensorDisconnectedNotification.class, Builder.class);
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
            public SwingSensorDisconnectedNotification getDefaultInstanceForType() {
                return SwingSensorDisconnectedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwingSensorDisconnectedNotification) {
                    return mergeFrom((SwingSensorDisconnectedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwingSensorDisconnectedNotification swingSensorDisconnectedNotification) {
                if (swingSensorDisconnectedNotification == SwingSensorDisconnectedNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(swingSensorDisconnectedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwingSensorDisconnectedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SwingSensorDisconnectedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwingSensorDisconnectedNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwingSensorDisconnectedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingSensorDisconnectedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingSensorDisconnectedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwingSensorDisconnectedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwingSensorDisconnectedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwingSensorDisconnectedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwingSensorDisconnectedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwingSensorDisconnectedNotification parseFrom(InputStream inputStream) {
            return (SwingSensorDisconnectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwingSensorDisconnectedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingSensorDisconnectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingSensorDisconnectedNotification parseFrom(CodedInputStream codedInputStream) {
            return (SwingSensorDisconnectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwingSensorDisconnectedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingSensorDisconnectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwingSensorService extends GeneratedMessageV3 implements SwingSensorServiceOrBuilder {
        public static final int CLUB_LIST_CHANGED_NOTIFICATION_FIELD_NUMBER = 19;
        public static final int GET_CLUB_LIST_REQUEST_FIELD_NUMBER = 4;
        public static final int GET_CLUB_LIST_RESPONSE_FIELD_NUMBER = 5;
        public static final int GET_USER_SETTINGS_REQUEST_FIELD_NUMBER = 10;
        public static final int GET_USER_SETTINGS_RESPONSE_FIELD_NUMBER = 11;
        public static final int NEW_SWING_NOTIFICATION_FIELD_NUMBER = 1;
        public static final int SET_ACTIVE_CLUB_REQUEST_FIELD_NUMBER = 8;
        public static final int SET_ACTIVE_CLUB_RESPONSE_FIELD_NUMBER = 9;
        public static final int SET_USER_SETTINGS_REQUEST_FIELD_NUMBER = 12;
        public static final int SET_USER_SETTINGS_RESPONSE_FIELD_NUMBER = 13;
        public static final int SWING_METRICS_NOTIFICATION_FIELD_NUMBER = 18;
        public static final int SWING_SENSOR_CONNECTED_NOTIFICATION_FIELD_NUMBER = 14;
        public static final int SWING_SENSOR_DISCONNECTED_NOTIFICATION_FIELD_NUMBER = 15;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GDISwingSensorClubs.ClubListChangedNotification clubListChangedNotification_;
        private GDISwingSensorClubs.GetClubListRequest getClubListRequest_;
        private GDISwingSensorClubs.GetClubListResponse getClubListResponse_;
        private GDISwingSensorUserSettings.GetUserSettingsRequest getUserSettingsRequest_;
        private GDISwingSensorUserSettings.GetUserSettingsResponse getUserSettingsResponse_;
        private byte memoizedIsInitialized;
        private NewSwingNotification newSwingNotification_;
        private GDISwingSensorClubs.SetActiveClubRequest setActiveClubRequest_;
        private GDISwingSensorClubs.SetActiveClubResponse setActiveClubResponse_;
        private GDISwingSensorUserSettings.SetUserSettingsRequest setUserSettingsRequest_;
        private GDISwingSensorUserSettings.SetUserSettingsResponse setUserSettingsResponse_;
        private GDISwingSensorMetrics.SwingMetricsNotification swingMetricsNotification_;
        private SwingSensorConnectedNotification swingSensorConnectedNotification_;
        private SwingSensorDisconnectedNotification swingSensorDisconnectedNotification_;
        private static final SwingSensorService DEFAULT_INSTANCE = new SwingSensorService();

        @Deprecated
        public static final Parser<SwingSensorService> PARSER = new AbstractParser<SwingSensorService>() { // from class: com.garmin.proto.generated.GDISwingSensor.SwingSensorService.1
            @Override // com.google.protobuf.Parser
            public SwingSensorService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwingSensorService.newBuilder();
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

        private SwingSensorService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwingSensorService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorService_descriptor;
        }

        public static Builder newBuilder(SwingSensorService swingSensorService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(swingSensorService);
        }

        public static SwingSensorService parseDelimitedFrom(InputStream inputStream) {
            return (SwingSensorService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwingSensorService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwingSensorService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwingSensorService)) {
                return super.equals(obj);
            }
            SwingSensorService swingSensorService = (SwingSensorService) obj;
            if (hasNewSwingNotification() != swingSensorService.hasNewSwingNotification()) {
                return false;
            }
            if ((hasNewSwingNotification() && !getNewSwingNotification().equals(swingSensorService.getNewSwingNotification())) || hasGetClubListRequest() != swingSensorService.hasGetClubListRequest()) {
                return false;
            }
            if ((hasGetClubListRequest() && !getGetClubListRequest().equals(swingSensorService.getGetClubListRequest())) || hasGetClubListResponse() != swingSensorService.hasGetClubListResponse()) {
                return false;
            }
            if ((hasGetClubListResponse() && !getGetClubListResponse().equals(swingSensorService.getGetClubListResponse())) || hasSetActiveClubRequest() != swingSensorService.hasSetActiveClubRequest()) {
                return false;
            }
            if ((hasSetActiveClubRequest() && !getSetActiveClubRequest().equals(swingSensorService.getSetActiveClubRequest())) || hasSetActiveClubResponse() != swingSensorService.hasSetActiveClubResponse()) {
                return false;
            }
            if ((hasSetActiveClubResponse() && !getSetActiveClubResponse().equals(swingSensorService.getSetActiveClubResponse())) || hasGetUserSettingsRequest() != swingSensorService.hasGetUserSettingsRequest()) {
                return false;
            }
            if ((hasGetUserSettingsRequest() && !getGetUserSettingsRequest().equals(swingSensorService.getGetUserSettingsRequest())) || hasGetUserSettingsResponse() != swingSensorService.hasGetUserSettingsResponse()) {
                return false;
            }
            if ((hasGetUserSettingsResponse() && !getGetUserSettingsResponse().equals(swingSensorService.getGetUserSettingsResponse())) || hasSetUserSettingsRequest() != swingSensorService.hasSetUserSettingsRequest()) {
                return false;
            }
            if ((hasSetUserSettingsRequest() && !getSetUserSettingsRequest().equals(swingSensorService.getSetUserSettingsRequest())) || hasSetUserSettingsResponse() != swingSensorService.hasSetUserSettingsResponse()) {
                return false;
            }
            if ((hasSetUserSettingsResponse() && !getSetUserSettingsResponse().equals(swingSensorService.getSetUserSettingsResponse())) || hasSwingSensorConnectedNotification() != swingSensorService.hasSwingSensorConnectedNotification()) {
                return false;
            }
            if ((hasSwingSensorConnectedNotification() && !getSwingSensorConnectedNotification().equals(swingSensorService.getSwingSensorConnectedNotification())) || hasSwingSensorDisconnectedNotification() != swingSensorService.hasSwingSensorDisconnectedNotification()) {
                return false;
            }
            if ((hasSwingSensorDisconnectedNotification() && !getSwingSensorDisconnectedNotification().equals(swingSensorService.getSwingSensorDisconnectedNotification())) || hasSwingMetricsNotification() != swingSensorService.hasSwingMetricsNotification()) {
                return false;
            }
            if ((!hasSwingMetricsNotification() || getSwingMetricsNotification().equals(swingSensorService.getSwingMetricsNotification())) && hasClubListChangedNotification() == swingSensorService.hasClubListChangedNotification()) {
                return (!hasClubListChangedNotification() || getClubListChangedNotification().equals(swingSensorService.getClubListChangedNotification())) && getUnknownFields().equals(swingSensorService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorClubs.ClubListChangedNotification getClubListChangedNotification() {
            GDISwingSensorClubs.ClubListChangedNotification clubListChangedNotification = this.clubListChangedNotification_;
            return clubListChangedNotification == null ? GDISwingSensorClubs.ClubListChangedNotification.getDefaultInstance() : clubListChangedNotification;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorClubs.ClubListChangedNotificationOrBuilder getClubListChangedNotificationOrBuilder() {
            GDISwingSensorClubs.ClubListChangedNotification clubListChangedNotification = this.clubListChangedNotification_;
            return clubListChangedNotification == null ? GDISwingSensorClubs.ClubListChangedNotification.getDefaultInstance() : clubListChangedNotification;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorClubs.GetClubListRequest getGetClubListRequest() {
            GDISwingSensorClubs.GetClubListRequest getClubListRequest = this.getClubListRequest_;
            return getClubListRequest == null ? GDISwingSensorClubs.GetClubListRequest.getDefaultInstance() : getClubListRequest;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorClubs.GetClubListRequestOrBuilder getGetClubListRequestOrBuilder() {
            GDISwingSensorClubs.GetClubListRequest getClubListRequest = this.getClubListRequest_;
            return getClubListRequest == null ? GDISwingSensorClubs.GetClubListRequest.getDefaultInstance() : getClubListRequest;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorClubs.GetClubListResponse getGetClubListResponse() {
            GDISwingSensorClubs.GetClubListResponse getClubListResponse = this.getClubListResponse_;
            return getClubListResponse == null ? GDISwingSensorClubs.GetClubListResponse.getDefaultInstance() : getClubListResponse;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorClubs.GetClubListResponseOrBuilder getGetClubListResponseOrBuilder() {
            GDISwingSensorClubs.GetClubListResponse getClubListResponse = this.getClubListResponse_;
            return getClubListResponse == null ? GDISwingSensorClubs.GetClubListResponse.getDefaultInstance() : getClubListResponse;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorUserSettings.GetUserSettingsRequest getGetUserSettingsRequest() {
            GDISwingSensorUserSettings.GetUserSettingsRequest getUserSettingsRequest = this.getUserSettingsRequest_;
            return getUserSettingsRequest == null ? GDISwingSensorUserSettings.GetUserSettingsRequest.getDefaultInstance() : getUserSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder getGetUserSettingsRequestOrBuilder() {
            GDISwingSensorUserSettings.GetUserSettingsRequest getUserSettingsRequest = this.getUserSettingsRequest_;
            return getUserSettingsRequest == null ? GDISwingSensorUserSettings.GetUserSettingsRequest.getDefaultInstance() : getUserSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorUserSettings.GetUserSettingsResponse getGetUserSettingsResponse() {
            GDISwingSensorUserSettings.GetUserSettingsResponse getUserSettingsResponse = this.getUserSettingsResponse_;
            return getUserSettingsResponse == null ? GDISwingSensorUserSettings.GetUserSettingsResponse.getDefaultInstance() : getUserSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder getGetUserSettingsResponseOrBuilder() {
            GDISwingSensorUserSettings.GetUserSettingsResponse getUserSettingsResponse = this.getUserSettingsResponse_;
            return getUserSettingsResponse == null ? GDISwingSensorUserSettings.GetUserSettingsResponse.getDefaultInstance() : getUserSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public NewSwingNotification getNewSwingNotification() {
            NewSwingNotification newSwingNotification = this.newSwingNotification_;
            return newSwingNotification == null ? NewSwingNotification.getDefaultInstance() : newSwingNotification;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public NewSwingNotificationOrBuilder getNewSwingNotificationOrBuilder() {
            NewSwingNotification newSwingNotification = this.newSwingNotification_;
            return newSwingNotification == null ? NewSwingNotification.getDefaultInstance() : newSwingNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwingSensorService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getNewSwingNotification()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getGetClubListRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getGetClubListResponse());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getSetActiveClubRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getSetActiveClubResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getGetUserSettingsRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getGetUserSettingsResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getSetUserSettingsRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getSetUserSettingsResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getSwingSensorConnectedNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, getSwingSensorDisconnectedNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(18, getSwingMetricsNotification());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(19, getClubListChangedNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorClubs.SetActiveClubRequest getSetActiveClubRequest() {
            GDISwingSensorClubs.SetActiveClubRequest setActiveClubRequest = this.setActiveClubRequest_;
            return setActiveClubRequest == null ? GDISwingSensorClubs.SetActiveClubRequest.getDefaultInstance() : setActiveClubRequest;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorClubs.SetActiveClubRequestOrBuilder getSetActiveClubRequestOrBuilder() {
            GDISwingSensorClubs.SetActiveClubRequest setActiveClubRequest = this.setActiveClubRequest_;
            return setActiveClubRequest == null ? GDISwingSensorClubs.SetActiveClubRequest.getDefaultInstance() : setActiveClubRequest;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorClubs.SetActiveClubResponse getSetActiveClubResponse() {
            GDISwingSensorClubs.SetActiveClubResponse setActiveClubResponse = this.setActiveClubResponse_;
            return setActiveClubResponse == null ? GDISwingSensorClubs.SetActiveClubResponse.getDefaultInstance() : setActiveClubResponse;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorClubs.SetActiveClubResponseOrBuilder getSetActiveClubResponseOrBuilder() {
            GDISwingSensorClubs.SetActiveClubResponse setActiveClubResponse = this.setActiveClubResponse_;
            return setActiveClubResponse == null ? GDISwingSensorClubs.SetActiveClubResponse.getDefaultInstance() : setActiveClubResponse;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorUserSettings.SetUserSettingsRequest getSetUserSettingsRequest() {
            GDISwingSensorUserSettings.SetUserSettingsRequest setUserSettingsRequest = this.setUserSettingsRequest_;
            return setUserSettingsRequest == null ? GDISwingSensorUserSettings.SetUserSettingsRequest.getDefaultInstance() : setUserSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder getSetUserSettingsRequestOrBuilder() {
            GDISwingSensorUserSettings.SetUserSettingsRequest setUserSettingsRequest = this.setUserSettingsRequest_;
            return setUserSettingsRequest == null ? GDISwingSensorUserSettings.SetUserSettingsRequest.getDefaultInstance() : setUserSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorUserSettings.SetUserSettingsResponse getSetUserSettingsResponse() {
            GDISwingSensorUserSettings.SetUserSettingsResponse setUserSettingsResponse = this.setUserSettingsResponse_;
            return setUserSettingsResponse == null ? GDISwingSensorUserSettings.SetUserSettingsResponse.getDefaultInstance() : setUserSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder getSetUserSettingsResponseOrBuilder() {
            GDISwingSensorUserSettings.SetUserSettingsResponse setUserSettingsResponse = this.setUserSettingsResponse_;
            return setUserSettingsResponse == null ? GDISwingSensorUserSettings.SetUserSettingsResponse.getDefaultInstance() : setUserSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorMetrics.SwingMetricsNotification getSwingMetricsNotification() {
            GDISwingSensorMetrics.SwingMetricsNotification swingMetricsNotification = this.swingMetricsNotification_;
            return swingMetricsNotification == null ? GDISwingSensorMetrics.SwingMetricsNotification.getDefaultInstance() : swingMetricsNotification;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder getSwingMetricsNotificationOrBuilder() {
            GDISwingSensorMetrics.SwingMetricsNotification swingMetricsNotification = this.swingMetricsNotification_;
            return swingMetricsNotification == null ? GDISwingSensorMetrics.SwingMetricsNotification.getDefaultInstance() : swingMetricsNotification;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public SwingSensorConnectedNotification getSwingSensorConnectedNotification() {
            SwingSensorConnectedNotification swingSensorConnectedNotification = this.swingSensorConnectedNotification_;
            return swingSensorConnectedNotification == null ? SwingSensorConnectedNotification.getDefaultInstance() : swingSensorConnectedNotification;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public SwingSensorConnectedNotificationOrBuilder getSwingSensorConnectedNotificationOrBuilder() {
            SwingSensorConnectedNotification swingSensorConnectedNotification = this.swingSensorConnectedNotification_;
            return swingSensorConnectedNotification == null ? SwingSensorConnectedNotification.getDefaultInstance() : swingSensorConnectedNotification;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public SwingSensorDisconnectedNotification getSwingSensorDisconnectedNotification() {
            SwingSensorDisconnectedNotification swingSensorDisconnectedNotification = this.swingSensorDisconnectedNotification_;
            return swingSensorDisconnectedNotification == null ? SwingSensorDisconnectedNotification.getDefaultInstance() : swingSensorDisconnectedNotification;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public SwingSensorDisconnectedNotificationOrBuilder getSwingSensorDisconnectedNotificationOrBuilder() {
            SwingSensorDisconnectedNotification swingSensorDisconnectedNotification = this.swingSensorDisconnectedNotification_;
            return swingSensorDisconnectedNotification == null ? SwingSensorDisconnectedNotification.getDefaultInstance() : swingSensorDisconnectedNotification;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasClubListChangedNotification() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasGetClubListRequest() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasGetClubListResponse() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasGetUserSettingsRequest() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasGetUserSettingsResponse() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasNewSwingNotification() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasSetActiveClubRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasSetActiveClubResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasSetUserSettingsRequest() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasSetUserSettingsResponse() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasSwingMetricsNotification() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasSwingSensorConnectedNotification() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
        public boolean hasSwingSensorDisconnectedNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNewSwingNotification()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getNewSwingNotification().hashCode();
            }
            if (hasGetClubListRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getGetClubListRequest().hashCode();
            }
            if (hasGetClubListResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getGetClubListResponse().hashCode();
            }
            if (hasSetActiveClubRequest()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getSetActiveClubRequest().hashCode();
            }
            if (hasSetActiveClubResponse()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getSetActiveClubResponse().hashCode();
            }
            if (hasGetUserSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getGetUserSettingsRequest().hashCode();
            }
            if (hasGetUserSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getGetUserSettingsResponse().hashCode();
            }
            if (hasSetUserSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getSetUserSettingsRequest().hashCode();
            }
            if (hasSetUserSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getSetUserSettingsResponse().hashCode();
            }
            if (hasSwingSensorConnectedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getSwingSensorConnectedNotification().hashCode();
            }
            if (hasSwingSensorDisconnectedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getSwingSensorDisconnectedNotification().hashCode();
            }
            if (hasSwingMetricsNotification()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + getSwingMetricsNotification().hashCode();
            }
            if (hasClubListChangedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 19, 53) + getClubListChangedNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorService_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingSensorService.class, Builder.class);
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
            if (hasNewSwingNotification() && !getNewSwingNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGetClubListResponse() && !getGetClubListResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSetActiveClubRequest() && !getSetActiveClubRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSetActiveClubResponse() && !getSetActiveClubResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGetUserSettingsResponse() && !getGetUserSettingsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSetUserSettingsRequest() && !getSetUserSettingsRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSetUserSettingsResponse() && !getSetUserSettingsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSwingMetricsNotification() || getSwingMetricsNotification().isInitialized()) {
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
            return new SwingSensorService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getNewSwingNotification());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(4, getGetClubListRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(5, getGetClubListResponse());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(8, getSetActiveClubRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(9, getSetActiveClubResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(10, getGetUserSettingsRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(11, getGetUserSettingsResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(12, getSetUserSettingsRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(13, getSetUserSettingsResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(14, getSwingSensorConnectedNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(15, getSwingSensorDisconnectedNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(18, getSwingMetricsNotification());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(19, getClubListChangedNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwingSensorServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDISwingSensorClubs.ClubListChangedNotification, GDISwingSensorClubs.ClubListChangedNotification.Builder, GDISwingSensorClubs.ClubListChangedNotificationOrBuilder> clubListChangedNotificationBuilder_;
            private GDISwingSensorClubs.ClubListChangedNotification clubListChangedNotification_;
            private SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListRequest, GDISwingSensorClubs.GetClubListRequest.Builder, GDISwingSensorClubs.GetClubListRequestOrBuilder> getClubListRequestBuilder_;
            private GDISwingSensorClubs.GetClubListRequest getClubListRequest_;
            private SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListResponse, GDISwingSensorClubs.GetClubListResponse.Builder, GDISwingSensorClubs.GetClubListResponseOrBuilder> getClubListResponseBuilder_;
            private GDISwingSensorClubs.GetClubListResponse getClubListResponse_;
            private SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsRequest, GDISwingSensorUserSettings.GetUserSettingsRequest.Builder, GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder> getUserSettingsRequestBuilder_;
            private GDISwingSensorUserSettings.GetUserSettingsRequest getUserSettingsRequest_;
            private SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsResponse, GDISwingSensorUserSettings.GetUserSettingsResponse.Builder, GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder> getUserSettingsResponseBuilder_;
            private GDISwingSensorUserSettings.GetUserSettingsResponse getUserSettingsResponse_;
            private SingleFieldBuilderV3<NewSwingNotification, NewSwingNotification.Builder, NewSwingNotificationOrBuilder> newSwingNotificationBuilder_;
            private NewSwingNotification newSwingNotification_;
            private SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubRequest, GDISwingSensorClubs.SetActiveClubRequest.Builder, GDISwingSensorClubs.SetActiveClubRequestOrBuilder> setActiveClubRequestBuilder_;
            private GDISwingSensorClubs.SetActiveClubRequest setActiveClubRequest_;
            private SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubResponse, GDISwingSensorClubs.SetActiveClubResponse.Builder, GDISwingSensorClubs.SetActiveClubResponseOrBuilder> setActiveClubResponseBuilder_;
            private GDISwingSensorClubs.SetActiveClubResponse setActiveClubResponse_;
            private SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsRequest, GDISwingSensorUserSettings.SetUserSettingsRequest.Builder, GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder> setUserSettingsRequestBuilder_;
            private GDISwingSensorUserSettings.SetUserSettingsRequest setUserSettingsRequest_;
            private SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsResponse, GDISwingSensorUserSettings.SetUserSettingsResponse.Builder, GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder> setUserSettingsResponseBuilder_;
            private GDISwingSensorUserSettings.SetUserSettingsResponse setUserSettingsResponse_;
            private SingleFieldBuilderV3<GDISwingSensorMetrics.SwingMetricsNotification, GDISwingSensorMetrics.SwingMetricsNotification.Builder, GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder> swingMetricsNotificationBuilder_;
            private GDISwingSensorMetrics.SwingMetricsNotification swingMetricsNotification_;
            private SingleFieldBuilderV3<SwingSensorConnectedNotification, SwingSensorConnectedNotification.Builder, SwingSensorConnectedNotificationOrBuilder> swingSensorConnectedNotificationBuilder_;
            private SwingSensorConnectedNotification swingSensorConnectedNotification_;
            private SingleFieldBuilderV3<SwingSensorDisconnectedNotification, SwingSensorDisconnectedNotification.Builder, SwingSensorDisconnectedNotificationOrBuilder> swingSensorDisconnectedNotificationBuilder_;
            private SwingSensorDisconnectedNotification swingSensorDisconnectedNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SwingSensorService swingSensorService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<NewSwingNotification, NewSwingNotification.Builder, NewSwingNotificationOrBuilder> singleFieldBuilderV3 = this.newSwingNotificationBuilder_;
                    swingSensorService.newSwingNotification_ = singleFieldBuilderV3 == null ? this.newSwingNotification_ : (NewSwingNotification) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListRequest, GDISwingSensorClubs.GetClubListRequest.Builder, GDISwingSensorClubs.GetClubListRequestOrBuilder> singleFieldBuilderV4 = this.getClubListRequestBuilder_;
                    swingSensorService.getClubListRequest_ = singleFieldBuilderV4 == null ? this.getClubListRequest_ : (GDISwingSensorClubs.GetClubListRequest) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListResponse, GDISwingSensorClubs.GetClubListResponse.Builder, GDISwingSensorClubs.GetClubListResponseOrBuilder> singleFieldBuilderV5 = this.getClubListResponseBuilder_;
                    swingSensorService.getClubListResponse_ = singleFieldBuilderV5 == null ? this.getClubListResponse_ : (GDISwingSensorClubs.GetClubListResponse) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubRequest, GDISwingSensorClubs.SetActiveClubRequest.Builder, GDISwingSensorClubs.SetActiveClubRequestOrBuilder> singleFieldBuilderV6 = this.setActiveClubRequestBuilder_;
                    swingSensorService.setActiveClubRequest_ = singleFieldBuilderV6 == null ? this.setActiveClubRequest_ : (GDISwingSensorClubs.SetActiveClubRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubResponse, GDISwingSensorClubs.SetActiveClubResponse.Builder, GDISwingSensorClubs.SetActiveClubResponseOrBuilder> singleFieldBuilderV7 = this.setActiveClubResponseBuilder_;
                    swingSensorService.setActiveClubResponse_ = singleFieldBuilderV7 == null ? this.setActiveClubResponse_ : (GDISwingSensorClubs.SetActiveClubResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsRequest, GDISwingSensorUserSettings.GetUserSettingsRequest.Builder, GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder> singleFieldBuilderV8 = this.getUserSettingsRequestBuilder_;
                    swingSensorService.getUserSettingsRequest_ = singleFieldBuilderV8 == null ? this.getUserSettingsRequest_ : (GDISwingSensorUserSettings.GetUserSettingsRequest) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsResponse, GDISwingSensorUserSettings.GetUserSettingsResponse.Builder, GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder> singleFieldBuilderV9 = this.getUserSettingsResponseBuilder_;
                    swingSensorService.getUserSettingsResponse_ = singleFieldBuilderV9 == null ? this.getUserSettingsResponse_ : (GDISwingSensorUserSettings.GetUserSettingsResponse) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsRequest, GDISwingSensorUserSettings.SetUserSettingsRequest.Builder, GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder> singleFieldBuilderV10 = this.setUserSettingsRequestBuilder_;
                    swingSensorService.setUserSettingsRequest_ = singleFieldBuilderV10 == null ? this.setUserSettingsRequest_ : (GDISwingSensorUserSettings.SetUserSettingsRequest) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsResponse, GDISwingSensorUserSettings.SetUserSettingsResponse.Builder, GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder> singleFieldBuilderV11 = this.setUserSettingsResponseBuilder_;
                    swingSensorService.setUserSettingsResponse_ = singleFieldBuilderV11 == null ? this.setUserSettingsResponse_ : (GDISwingSensorUserSettings.SetUserSettingsResponse) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<SwingSensorConnectedNotification, SwingSensorConnectedNotification.Builder, SwingSensorConnectedNotificationOrBuilder> singleFieldBuilderV12 = this.swingSensorConnectedNotificationBuilder_;
                    swingSensorService.swingSensorConnectedNotification_ = singleFieldBuilderV12 == null ? this.swingSensorConnectedNotification_ : (SwingSensorConnectedNotification) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<SwingSensorDisconnectedNotification, SwingSensorDisconnectedNotification.Builder, SwingSensorDisconnectedNotificationOrBuilder> singleFieldBuilderV13 = this.swingSensorDisconnectedNotificationBuilder_;
                    swingSensorService.swingSensorDisconnectedNotification_ = singleFieldBuilderV13 == null ? this.swingSensorDisconnectedNotification_ : (SwingSensorDisconnectedNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<GDISwingSensorMetrics.SwingMetricsNotification, GDISwingSensorMetrics.SwingMetricsNotification.Builder, GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder> singleFieldBuilderV14 = this.swingMetricsNotificationBuilder_;
                    swingSensorService.swingMetricsNotification_ = singleFieldBuilderV14 == null ? this.swingMetricsNotification_ : (GDISwingSensorMetrics.SwingMetricsNotification) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<GDISwingSensorClubs.ClubListChangedNotification, GDISwingSensorClubs.ClubListChangedNotification.Builder, GDISwingSensorClubs.ClubListChangedNotificationOrBuilder> singleFieldBuilderV15 = this.clubListChangedNotificationBuilder_;
                    swingSensorService.clubListChangedNotification_ = singleFieldBuilderV15 == null ? this.clubListChangedNotification_ : (GDISwingSensorClubs.ClubListChangedNotification) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                swingSensorService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<GDISwingSensorClubs.ClubListChangedNotification, GDISwingSensorClubs.ClubListChangedNotification.Builder, GDISwingSensorClubs.ClubListChangedNotificationOrBuilder> getClubListChangedNotificationFieldBuilder() {
                if (this.clubListChangedNotificationBuilder_ == null) {
                    this.clubListChangedNotificationBuilder_ = new SingleFieldBuilderV3<>(getClubListChangedNotification(), getParentForChildren(), isClean());
                    this.clubListChangedNotification_ = null;
                }
                return this.clubListChangedNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorService_descriptor;
            }

            private SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListRequest, GDISwingSensorClubs.GetClubListRequest.Builder, GDISwingSensorClubs.GetClubListRequestOrBuilder> getGetClubListRequestFieldBuilder() {
                if (this.getClubListRequestBuilder_ == null) {
                    this.getClubListRequestBuilder_ = new SingleFieldBuilderV3<>(getGetClubListRequest(), getParentForChildren(), isClean());
                    this.getClubListRequest_ = null;
                }
                return this.getClubListRequestBuilder_;
            }

            private SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListResponse, GDISwingSensorClubs.GetClubListResponse.Builder, GDISwingSensorClubs.GetClubListResponseOrBuilder> getGetClubListResponseFieldBuilder() {
                if (this.getClubListResponseBuilder_ == null) {
                    this.getClubListResponseBuilder_ = new SingleFieldBuilderV3<>(getGetClubListResponse(), getParentForChildren(), isClean());
                    this.getClubListResponse_ = null;
                }
                return this.getClubListResponseBuilder_;
            }

            private SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsRequest, GDISwingSensorUserSettings.GetUserSettingsRequest.Builder, GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder> getGetUserSettingsRequestFieldBuilder() {
                if (this.getUserSettingsRequestBuilder_ == null) {
                    this.getUserSettingsRequestBuilder_ = new SingleFieldBuilderV3<>(getGetUserSettingsRequest(), getParentForChildren(), isClean());
                    this.getUserSettingsRequest_ = null;
                }
                return this.getUserSettingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsResponse, GDISwingSensorUserSettings.GetUserSettingsResponse.Builder, GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder> getGetUserSettingsResponseFieldBuilder() {
                if (this.getUserSettingsResponseBuilder_ == null) {
                    this.getUserSettingsResponseBuilder_ = new SingleFieldBuilderV3<>(getGetUserSettingsResponse(), getParentForChildren(), isClean());
                    this.getUserSettingsResponse_ = null;
                }
                return this.getUserSettingsResponseBuilder_;
            }

            private SingleFieldBuilderV3<NewSwingNotification, NewSwingNotification.Builder, NewSwingNotificationOrBuilder> getNewSwingNotificationFieldBuilder() {
                if (this.newSwingNotificationBuilder_ == null) {
                    this.newSwingNotificationBuilder_ = new SingleFieldBuilderV3<>(getNewSwingNotification(), getParentForChildren(), isClean());
                    this.newSwingNotification_ = null;
                }
                return this.newSwingNotificationBuilder_;
            }

            private SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubRequest, GDISwingSensorClubs.SetActiveClubRequest.Builder, GDISwingSensorClubs.SetActiveClubRequestOrBuilder> getSetActiveClubRequestFieldBuilder() {
                if (this.setActiveClubRequestBuilder_ == null) {
                    this.setActiveClubRequestBuilder_ = new SingleFieldBuilderV3<>(getSetActiveClubRequest(), getParentForChildren(), isClean());
                    this.setActiveClubRequest_ = null;
                }
                return this.setActiveClubRequestBuilder_;
            }

            private SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubResponse, GDISwingSensorClubs.SetActiveClubResponse.Builder, GDISwingSensorClubs.SetActiveClubResponseOrBuilder> getSetActiveClubResponseFieldBuilder() {
                if (this.setActiveClubResponseBuilder_ == null) {
                    this.setActiveClubResponseBuilder_ = new SingleFieldBuilderV3<>(getSetActiveClubResponse(), getParentForChildren(), isClean());
                    this.setActiveClubResponse_ = null;
                }
                return this.setActiveClubResponseBuilder_;
            }

            private SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsRequest, GDISwingSensorUserSettings.SetUserSettingsRequest.Builder, GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder> getSetUserSettingsRequestFieldBuilder() {
                if (this.setUserSettingsRequestBuilder_ == null) {
                    this.setUserSettingsRequestBuilder_ = new SingleFieldBuilderV3<>(getSetUserSettingsRequest(), getParentForChildren(), isClean());
                    this.setUserSettingsRequest_ = null;
                }
                return this.setUserSettingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsResponse, GDISwingSensorUserSettings.SetUserSettingsResponse.Builder, GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder> getSetUserSettingsResponseFieldBuilder() {
                if (this.setUserSettingsResponseBuilder_ == null) {
                    this.setUserSettingsResponseBuilder_ = new SingleFieldBuilderV3<>(getSetUserSettingsResponse(), getParentForChildren(), isClean());
                    this.setUserSettingsResponse_ = null;
                }
                return this.setUserSettingsResponseBuilder_;
            }

            private SingleFieldBuilderV3<GDISwingSensorMetrics.SwingMetricsNotification, GDISwingSensorMetrics.SwingMetricsNotification.Builder, GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder> getSwingMetricsNotificationFieldBuilder() {
                if (this.swingMetricsNotificationBuilder_ == null) {
                    this.swingMetricsNotificationBuilder_ = new SingleFieldBuilderV3<>(getSwingMetricsNotification(), getParentForChildren(), isClean());
                    this.swingMetricsNotification_ = null;
                }
                return this.swingMetricsNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SwingSensorConnectedNotification, SwingSensorConnectedNotification.Builder, SwingSensorConnectedNotificationOrBuilder> getSwingSensorConnectedNotificationFieldBuilder() {
                if (this.swingSensorConnectedNotificationBuilder_ == null) {
                    this.swingSensorConnectedNotificationBuilder_ = new SingleFieldBuilderV3<>(getSwingSensorConnectedNotification(), getParentForChildren(), isClean());
                    this.swingSensorConnectedNotification_ = null;
                }
                return this.swingSensorConnectedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SwingSensorDisconnectedNotification, SwingSensorDisconnectedNotification.Builder, SwingSensorDisconnectedNotificationOrBuilder> getSwingSensorDisconnectedNotificationFieldBuilder() {
                if (this.swingSensorDisconnectedNotificationBuilder_ == null) {
                    this.swingSensorDisconnectedNotificationBuilder_ = new SingleFieldBuilderV3<>(getSwingSensorDisconnectedNotification(), getParentForChildren(), isClean());
                    this.swingSensorDisconnectedNotification_ = null;
                }
                return this.swingSensorDisconnectedNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getNewSwingNotificationFieldBuilder();
                    getGetClubListRequestFieldBuilder();
                    getGetClubListResponseFieldBuilder();
                    getSetActiveClubRequestFieldBuilder();
                    getSetActiveClubResponseFieldBuilder();
                    getGetUserSettingsRequestFieldBuilder();
                    getGetUserSettingsResponseFieldBuilder();
                    getSetUserSettingsRequestFieldBuilder();
                    getSetUserSettingsResponseFieldBuilder();
                    getSwingSensorConnectedNotificationFieldBuilder();
                    getSwingSensorDisconnectedNotificationFieldBuilder();
                    getSwingMetricsNotificationFieldBuilder();
                    getClubListChangedNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingSensorService build() {
                SwingSensorService swingSensorServiceBuildPartial = buildPartial();
                if (swingSensorServiceBuildPartial.isInitialized()) {
                    return swingSensorServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) swingSensorServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingSensorService buildPartial() {
                SwingSensorService swingSensorService = new SwingSensorService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(swingSensorService);
                }
                onBuilt();
                return swingSensorService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.newSwingNotification_ = null;
                SingleFieldBuilderV3<NewSwingNotification, NewSwingNotification.Builder, NewSwingNotificationOrBuilder> singleFieldBuilderV3 = this.newSwingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.newSwingNotificationBuilder_ = null;
                }
                this.getClubListRequest_ = null;
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListRequest, GDISwingSensorClubs.GetClubListRequest.Builder, GDISwingSensorClubs.GetClubListRequestOrBuilder> singleFieldBuilderV4 = this.getClubListRequestBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.getClubListRequestBuilder_ = null;
                }
                this.getClubListResponse_ = null;
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListResponse, GDISwingSensorClubs.GetClubListResponse.Builder, GDISwingSensorClubs.GetClubListResponseOrBuilder> singleFieldBuilderV5 = this.getClubListResponseBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.getClubListResponseBuilder_ = null;
                }
                this.setActiveClubRequest_ = null;
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubRequest, GDISwingSensorClubs.SetActiveClubRequest.Builder, GDISwingSensorClubs.SetActiveClubRequestOrBuilder> singleFieldBuilderV6 = this.setActiveClubRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.setActiveClubRequestBuilder_ = null;
                }
                this.setActiveClubResponse_ = null;
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubResponse, GDISwingSensorClubs.SetActiveClubResponse.Builder, GDISwingSensorClubs.SetActiveClubResponseOrBuilder> singleFieldBuilderV7 = this.setActiveClubResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.setActiveClubResponseBuilder_ = null;
                }
                this.getUserSettingsRequest_ = null;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsRequest, GDISwingSensorUserSettings.GetUserSettingsRequest.Builder, GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder> singleFieldBuilderV8 = this.getUserSettingsRequestBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.getUserSettingsRequestBuilder_ = null;
                }
                this.getUserSettingsResponse_ = null;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsResponse, GDISwingSensorUserSettings.GetUserSettingsResponse.Builder, GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder> singleFieldBuilderV9 = this.getUserSettingsResponseBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.getUserSettingsResponseBuilder_ = null;
                }
                this.setUserSettingsRequest_ = null;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsRequest, GDISwingSensorUserSettings.SetUserSettingsRequest.Builder, GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder> singleFieldBuilderV10 = this.setUserSettingsRequestBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.setUserSettingsRequestBuilder_ = null;
                }
                this.setUserSettingsResponse_ = null;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsResponse, GDISwingSensorUserSettings.SetUserSettingsResponse.Builder, GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder> singleFieldBuilderV11 = this.setUserSettingsResponseBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.setUserSettingsResponseBuilder_ = null;
                }
                this.swingSensorConnectedNotification_ = null;
                SingleFieldBuilderV3<SwingSensorConnectedNotification, SwingSensorConnectedNotification.Builder, SwingSensorConnectedNotificationOrBuilder> singleFieldBuilderV12 = this.swingSensorConnectedNotificationBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.swingSensorConnectedNotificationBuilder_ = null;
                }
                this.swingSensorDisconnectedNotification_ = null;
                SingleFieldBuilderV3<SwingSensorDisconnectedNotification, SwingSensorDisconnectedNotification.Builder, SwingSensorDisconnectedNotificationOrBuilder> singleFieldBuilderV13 = this.swingSensorDisconnectedNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.swingSensorDisconnectedNotificationBuilder_ = null;
                }
                this.swingMetricsNotification_ = null;
                SingleFieldBuilderV3<GDISwingSensorMetrics.SwingMetricsNotification, GDISwingSensorMetrics.SwingMetricsNotification.Builder, GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder> singleFieldBuilderV14 = this.swingMetricsNotificationBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.swingMetricsNotificationBuilder_ = null;
                }
                this.clubListChangedNotification_ = null;
                SingleFieldBuilderV3<GDISwingSensorClubs.ClubListChangedNotification, GDISwingSensorClubs.ClubListChangedNotification.Builder, GDISwingSensorClubs.ClubListChangedNotificationOrBuilder> singleFieldBuilderV15 = this.clubListChangedNotificationBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.clubListChangedNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearClubListChangedNotification() {
                this.bitField0_ &= -4097;
                this.clubListChangedNotification_ = null;
                SingleFieldBuilderV3<GDISwingSensorClubs.ClubListChangedNotification, GDISwingSensorClubs.ClubListChangedNotification.Builder, GDISwingSensorClubs.ClubListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.clubListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.clubListChangedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGetClubListRequest() {
                this.bitField0_ &= -3;
                this.getClubListRequest_ = null;
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListRequest, GDISwingSensorClubs.GetClubListRequest.Builder, GDISwingSensorClubs.GetClubListRequestOrBuilder> singleFieldBuilderV3 = this.getClubListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getClubListRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetClubListResponse() {
                this.bitField0_ &= -5;
                this.getClubListResponse_ = null;
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListResponse, GDISwingSensorClubs.GetClubListResponse.Builder, GDISwingSensorClubs.GetClubListResponseOrBuilder> singleFieldBuilderV3 = this.getClubListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getClubListResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetUserSettingsRequest() {
                this.bitField0_ &= -33;
                this.getUserSettingsRequest_ = null;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsRequest, GDISwingSensorUserSettings.GetUserSettingsRequest.Builder, GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getUserSettingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetUserSettingsResponse() {
                this.bitField0_ &= -65;
                this.getUserSettingsResponse_ = null;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsResponse, GDISwingSensorUserSettings.GetUserSettingsResponse.Builder, GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getUserSettingsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearNewSwingNotification() {
                this.bitField0_ &= -2;
                this.newSwingNotification_ = null;
                SingleFieldBuilderV3<NewSwingNotification, NewSwingNotification.Builder, NewSwingNotificationOrBuilder> singleFieldBuilderV3 = this.newSwingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.newSwingNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSetActiveClubRequest() {
                this.bitField0_ &= -9;
                this.setActiveClubRequest_ = null;
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubRequest, GDISwingSensorClubs.SetActiveClubRequest.Builder, GDISwingSensorClubs.SetActiveClubRequestOrBuilder> singleFieldBuilderV3 = this.setActiveClubRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setActiveClubRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetActiveClubResponse() {
                this.bitField0_ &= -17;
                this.setActiveClubResponse_ = null;
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubResponse, GDISwingSensorClubs.SetActiveClubResponse.Builder, GDISwingSensorClubs.SetActiveClubResponseOrBuilder> singleFieldBuilderV3 = this.setActiveClubResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setActiveClubResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetUserSettingsRequest() {
                this.bitField0_ &= -129;
                this.setUserSettingsRequest_ = null;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsRequest, GDISwingSensorUserSettings.SetUserSettingsRequest.Builder, GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.setUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setUserSettingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetUserSettingsResponse() {
                this.bitField0_ &= -257;
                this.setUserSettingsResponse_ = null;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsResponse, GDISwingSensorUserSettings.SetUserSettingsResponse.Builder, GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.setUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setUserSettingsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwingMetricsNotification() {
                this.bitField0_ &= -2049;
                this.swingMetricsNotification_ = null;
                SingleFieldBuilderV3<GDISwingSensorMetrics.SwingMetricsNotification, GDISwingSensorMetrics.SwingMetricsNotification.Builder, GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder> singleFieldBuilderV3 = this.swingMetricsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.swingMetricsNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwingSensorConnectedNotification() {
                this.bitField0_ &= -513;
                this.swingSensorConnectedNotification_ = null;
                SingleFieldBuilderV3<SwingSensorConnectedNotification, SwingSensorConnectedNotification.Builder, SwingSensorConnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorConnectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.swingSensorConnectedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwingSensorDisconnectedNotification() {
                this.bitField0_ &= -1025;
                this.swingSensorDisconnectedNotification_ = null;
                SingleFieldBuilderV3<SwingSensorDisconnectedNotification, SwingSensorDisconnectedNotification.Builder, SwingSensorDisconnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorDisconnectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.swingSensorDisconnectedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorClubs.ClubListChangedNotification getClubListChangedNotification() {
                SingleFieldBuilderV3<GDISwingSensorClubs.ClubListChangedNotification, GDISwingSensorClubs.ClubListChangedNotification.Builder, GDISwingSensorClubs.ClubListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.clubListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorClubs.ClubListChangedNotification) singleFieldBuilderV3.getMessage();
                }
                GDISwingSensorClubs.ClubListChangedNotification clubListChangedNotification = this.clubListChangedNotification_;
                return clubListChangedNotification == null ? GDISwingSensorClubs.ClubListChangedNotification.getDefaultInstance() : clubListChangedNotification;
            }

            public GDISwingSensorClubs.ClubListChangedNotification.Builder getClubListChangedNotificationBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (GDISwingSensorClubs.ClubListChangedNotification.Builder) getClubListChangedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorClubs.ClubListChangedNotificationOrBuilder getClubListChangedNotificationOrBuilder() {
                SingleFieldBuilderV3<GDISwingSensorClubs.ClubListChangedNotification, GDISwingSensorClubs.ClubListChangedNotification.Builder, GDISwingSensorClubs.ClubListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.clubListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorClubs.ClubListChangedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDISwingSensorClubs.ClubListChangedNotification clubListChangedNotification = this.clubListChangedNotification_;
                return clubListChangedNotification == null ? GDISwingSensorClubs.ClubListChangedNotification.getDefaultInstance() : clubListChangedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorClubs.GetClubListRequest getGetClubListRequest() {
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListRequest, GDISwingSensorClubs.GetClubListRequest.Builder, GDISwingSensorClubs.GetClubListRequestOrBuilder> singleFieldBuilderV3 = this.getClubListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorClubs.GetClubListRequest) singleFieldBuilderV3.getMessage();
                }
                GDISwingSensorClubs.GetClubListRequest getClubListRequest = this.getClubListRequest_;
                return getClubListRequest == null ? GDISwingSensorClubs.GetClubListRequest.getDefaultInstance() : getClubListRequest;
            }

            public GDISwingSensorClubs.GetClubListRequest.Builder getGetClubListRequestBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GDISwingSensorClubs.GetClubListRequest.Builder) getGetClubListRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorClubs.GetClubListRequestOrBuilder getGetClubListRequestOrBuilder() {
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListRequest, GDISwingSensorClubs.GetClubListRequest.Builder, GDISwingSensorClubs.GetClubListRequestOrBuilder> singleFieldBuilderV3 = this.getClubListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorClubs.GetClubListRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDISwingSensorClubs.GetClubListRequest getClubListRequest = this.getClubListRequest_;
                return getClubListRequest == null ? GDISwingSensorClubs.GetClubListRequest.getDefaultInstance() : getClubListRequest;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorClubs.GetClubListResponse getGetClubListResponse() {
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListResponse, GDISwingSensorClubs.GetClubListResponse.Builder, GDISwingSensorClubs.GetClubListResponseOrBuilder> singleFieldBuilderV3 = this.getClubListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorClubs.GetClubListResponse) singleFieldBuilderV3.getMessage();
                }
                GDISwingSensorClubs.GetClubListResponse getClubListResponse = this.getClubListResponse_;
                return getClubListResponse == null ? GDISwingSensorClubs.GetClubListResponse.getDefaultInstance() : getClubListResponse;
            }

            public GDISwingSensorClubs.GetClubListResponse.Builder getGetClubListResponseBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GDISwingSensorClubs.GetClubListResponse.Builder) getGetClubListResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorClubs.GetClubListResponseOrBuilder getGetClubListResponseOrBuilder() {
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListResponse, GDISwingSensorClubs.GetClubListResponse.Builder, GDISwingSensorClubs.GetClubListResponseOrBuilder> singleFieldBuilderV3 = this.getClubListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorClubs.GetClubListResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDISwingSensorClubs.GetClubListResponse getClubListResponse = this.getClubListResponse_;
                return getClubListResponse == null ? GDISwingSensorClubs.GetClubListResponse.getDefaultInstance() : getClubListResponse;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorUserSettings.GetUserSettingsRequest getGetUserSettingsRequest() {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsRequest, GDISwingSensorUserSettings.GetUserSettingsRequest.Builder, GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorUserSettings.GetUserSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                GDISwingSensorUserSettings.GetUserSettingsRequest getUserSettingsRequest = this.getUserSettingsRequest_;
                return getUserSettingsRequest == null ? GDISwingSensorUserSettings.GetUserSettingsRequest.getDefaultInstance() : getUserSettingsRequest;
            }

            public GDISwingSensorUserSettings.GetUserSettingsRequest.Builder getGetUserSettingsRequestBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (GDISwingSensorUserSettings.GetUserSettingsRequest.Builder) getGetUserSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder getGetUserSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsRequest, GDISwingSensorUserSettings.GetUserSettingsRequest.Builder, GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDISwingSensorUserSettings.GetUserSettingsRequest getUserSettingsRequest = this.getUserSettingsRequest_;
                return getUserSettingsRequest == null ? GDISwingSensorUserSettings.GetUserSettingsRequest.getDefaultInstance() : getUserSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorUserSettings.GetUserSettingsResponse getGetUserSettingsResponse() {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsResponse, GDISwingSensorUserSettings.GetUserSettingsResponse.Builder, GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorUserSettings.GetUserSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                GDISwingSensorUserSettings.GetUserSettingsResponse getUserSettingsResponse = this.getUserSettingsResponse_;
                return getUserSettingsResponse == null ? GDISwingSensorUserSettings.GetUserSettingsResponse.getDefaultInstance() : getUserSettingsResponse;
            }

            public GDISwingSensorUserSettings.GetUserSettingsResponse.Builder getGetUserSettingsResponseBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (GDISwingSensorUserSettings.GetUserSettingsResponse.Builder) getGetUserSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder getGetUserSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsResponse, GDISwingSensorUserSettings.GetUserSettingsResponse.Builder, GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDISwingSensorUserSettings.GetUserSettingsResponse getUserSettingsResponse = this.getUserSettingsResponse_;
                return getUserSettingsResponse == null ? GDISwingSensorUserSettings.GetUserSettingsResponse.getDefaultInstance() : getUserSettingsResponse;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public NewSwingNotification getNewSwingNotification() {
                SingleFieldBuilderV3<NewSwingNotification, NewSwingNotification.Builder, NewSwingNotificationOrBuilder> singleFieldBuilderV3 = this.newSwingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NewSwingNotification) singleFieldBuilderV3.getMessage();
                }
                NewSwingNotification newSwingNotification = this.newSwingNotification_;
                return newSwingNotification == null ? NewSwingNotification.getDefaultInstance() : newSwingNotification;
            }

            public NewSwingNotification.Builder getNewSwingNotificationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (NewSwingNotification.Builder) getNewSwingNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public NewSwingNotificationOrBuilder getNewSwingNotificationOrBuilder() {
                SingleFieldBuilderV3<NewSwingNotification, NewSwingNotification.Builder, NewSwingNotificationOrBuilder> singleFieldBuilderV3 = this.newSwingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NewSwingNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                NewSwingNotification newSwingNotification = this.newSwingNotification_;
                return newSwingNotification == null ? NewSwingNotification.getDefaultInstance() : newSwingNotification;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorClubs.SetActiveClubRequest getSetActiveClubRequest() {
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubRequest, GDISwingSensorClubs.SetActiveClubRequest.Builder, GDISwingSensorClubs.SetActiveClubRequestOrBuilder> singleFieldBuilderV3 = this.setActiveClubRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorClubs.SetActiveClubRequest) singleFieldBuilderV3.getMessage();
                }
                GDISwingSensorClubs.SetActiveClubRequest setActiveClubRequest = this.setActiveClubRequest_;
                return setActiveClubRequest == null ? GDISwingSensorClubs.SetActiveClubRequest.getDefaultInstance() : setActiveClubRequest;
            }

            public GDISwingSensorClubs.SetActiveClubRequest.Builder getSetActiveClubRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (GDISwingSensorClubs.SetActiveClubRequest.Builder) getSetActiveClubRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorClubs.SetActiveClubRequestOrBuilder getSetActiveClubRequestOrBuilder() {
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubRequest, GDISwingSensorClubs.SetActiveClubRequest.Builder, GDISwingSensorClubs.SetActiveClubRequestOrBuilder> singleFieldBuilderV3 = this.setActiveClubRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorClubs.SetActiveClubRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDISwingSensorClubs.SetActiveClubRequest setActiveClubRequest = this.setActiveClubRequest_;
                return setActiveClubRequest == null ? GDISwingSensorClubs.SetActiveClubRequest.getDefaultInstance() : setActiveClubRequest;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorClubs.SetActiveClubResponse getSetActiveClubResponse() {
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubResponse, GDISwingSensorClubs.SetActiveClubResponse.Builder, GDISwingSensorClubs.SetActiveClubResponseOrBuilder> singleFieldBuilderV3 = this.setActiveClubResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorClubs.SetActiveClubResponse) singleFieldBuilderV3.getMessage();
                }
                GDISwingSensorClubs.SetActiveClubResponse setActiveClubResponse = this.setActiveClubResponse_;
                return setActiveClubResponse == null ? GDISwingSensorClubs.SetActiveClubResponse.getDefaultInstance() : setActiveClubResponse;
            }

            public GDISwingSensorClubs.SetActiveClubResponse.Builder getSetActiveClubResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (GDISwingSensorClubs.SetActiveClubResponse.Builder) getSetActiveClubResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorClubs.SetActiveClubResponseOrBuilder getSetActiveClubResponseOrBuilder() {
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubResponse, GDISwingSensorClubs.SetActiveClubResponse.Builder, GDISwingSensorClubs.SetActiveClubResponseOrBuilder> singleFieldBuilderV3 = this.setActiveClubResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorClubs.SetActiveClubResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDISwingSensorClubs.SetActiveClubResponse setActiveClubResponse = this.setActiveClubResponse_;
                return setActiveClubResponse == null ? GDISwingSensorClubs.SetActiveClubResponse.getDefaultInstance() : setActiveClubResponse;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorUserSettings.SetUserSettingsRequest getSetUserSettingsRequest() {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsRequest, GDISwingSensorUserSettings.SetUserSettingsRequest.Builder, GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.setUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorUserSettings.SetUserSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                GDISwingSensorUserSettings.SetUserSettingsRequest setUserSettingsRequest = this.setUserSettingsRequest_;
                return setUserSettingsRequest == null ? GDISwingSensorUserSettings.SetUserSettingsRequest.getDefaultInstance() : setUserSettingsRequest;
            }

            public GDISwingSensorUserSettings.SetUserSettingsRequest.Builder getSetUserSettingsRequestBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (GDISwingSensorUserSettings.SetUserSettingsRequest.Builder) getSetUserSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder getSetUserSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsRequest, GDISwingSensorUserSettings.SetUserSettingsRequest.Builder, GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.setUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDISwingSensorUserSettings.SetUserSettingsRequest setUserSettingsRequest = this.setUserSettingsRequest_;
                return setUserSettingsRequest == null ? GDISwingSensorUserSettings.SetUserSettingsRequest.getDefaultInstance() : setUserSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorUserSettings.SetUserSettingsResponse getSetUserSettingsResponse() {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsResponse, GDISwingSensorUserSettings.SetUserSettingsResponse.Builder, GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.setUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorUserSettings.SetUserSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                GDISwingSensorUserSettings.SetUserSettingsResponse setUserSettingsResponse = this.setUserSettingsResponse_;
                return setUserSettingsResponse == null ? GDISwingSensorUserSettings.SetUserSettingsResponse.getDefaultInstance() : setUserSettingsResponse;
            }

            public GDISwingSensorUserSettings.SetUserSettingsResponse.Builder getSetUserSettingsResponseBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (GDISwingSensorUserSettings.SetUserSettingsResponse.Builder) getSetUserSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder getSetUserSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsResponse, GDISwingSensorUserSettings.SetUserSettingsResponse.Builder, GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.setUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDISwingSensorUserSettings.SetUserSettingsResponse setUserSettingsResponse = this.setUserSettingsResponse_;
                return setUserSettingsResponse == null ? GDISwingSensorUserSettings.SetUserSettingsResponse.getDefaultInstance() : setUserSettingsResponse;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorMetrics.SwingMetricsNotification getSwingMetricsNotification() {
                SingleFieldBuilderV3<GDISwingSensorMetrics.SwingMetricsNotification, GDISwingSensorMetrics.SwingMetricsNotification.Builder, GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder> singleFieldBuilderV3 = this.swingMetricsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorMetrics.SwingMetricsNotification) singleFieldBuilderV3.getMessage();
                }
                GDISwingSensorMetrics.SwingMetricsNotification swingMetricsNotification = this.swingMetricsNotification_;
                return swingMetricsNotification == null ? GDISwingSensorMetrics.SwingMetricsNotification.getDefaultInstance() : swingMetricsNotification;
            }

            public GDISwingSensorMetrics.SwingMetricsNotification.Builder getSwingMetricsNotificationBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (GDISwingSensorMetrics.SwingMetricsNotification.Builder) getSwingMetricsNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder getSwingMetricsNotificationOrBuilder() {
                SingleFieldBuilderV3<GDISwingSensorMetrics.SwingMetricsNotification, GDISwingSensorMetrics.SwingMetricsNotification.Builder, GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder> singleFieldBuilderV3 = this.swingMetricsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDISwingSensorMetrics.SwingMetricsNotification swingMetricsNotification = this.swingMetricsNotification_;
                return swingMetricsNotification == null ? GDISwingSensorMetrics.SwingMetricsNotification.getDefaultInstance() : swingMetricsNotification;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public SwingSensorConnectedNotification getSwingSensorConnectedNotification() {
                SingleFieldBuilderV3<SwingSensorConnectedNotification, SwingSensorConnectedNotification.Builder, SwingSensorConnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorConnectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwingSensorConnectedNotification) singleFieldBuilderV3.getMessage();
                }
                SwingSensorConnectedNotification swingSensorConnectedNotification = this.swingSensorConnectedNotification_;
                return swingSensorConnectedNotification == null ? SwingSensorConnectedNotification.getDefaultInstance() : swingSensorConnectedNotification;
            }

            public SwingSensorConnectedNotification.Builder getSwingSensorConnectedNotificationBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (SwingSensorConnectedNotification.Builder) getSwingSensorConnectedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public SwingSensorConnectedNotificationOrBuilder getSwingSensorConnectedNotificationOrBuilder() {
                SingleFieldBuilderV3<SwingSensorConnectedNotification, SwingSensorConnectedNotification.Builder, SwingSensorConnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorConnectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwingSensorConnectedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwingSensorConnectedNotification swingSensorConnectedNotification = this.swingSensorConnectedNotification_;
                return swingSensorConnectedNotification == null ? SwingSensorConnectedNotification.getDefaultInstance() : swingSensorConnectedNotification;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public SwingSensorDisconnectedNotification getSwingSensorDisconnectedNotification() {
                SingleFieldBuilderV3<SwingSensorDisconnectedNotification, SwingSensorDisconnectedNotification.Builder, SwingSensorDisconnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorDisconnectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwingSensorDisconnectedNotification) singleFieldBuilderV3.getMessage();
                }
                SwingSensorDisconnectedNotification swingSensorDisconnectedNotification = this.swingSensorDisconnectedNotification_;
                return swingSensorDisconnectedNotification == null ? SwingSensorDisconnectedNotification.getDefaultInstance() : swingSensorDisconnectedNotification;
            }

            public SwingSensorDisconnectedNotification.Builder getSwingSensorDisconnectedNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (SwingSensorDisconnectedNotification.Builder) getSwingSensorDisconnectedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public SwingSensorDisconnectedNotificationOrBuilder getSwingSensorDisconnectedNotificationOrBuilder() {
                SingleFieldBuilderV3<SwingSensorDisconnectedNotification, SwingSensorDisconnectedNotification.Builder, SwingSensorDisconnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorDisconnectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwingSensorDisconnectedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwingSensorDisconnectedNotification swingSensorDisconnectedNotification = this.swingSensorDisconnectedNotification_;
                return swingSensorDisconnectedNotification == null ? SwingSensorDisconnectedNotification.getDefaultInstance() : swingSensorDisconnectedNotification;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasClubListChangedNotification() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasGetClubListRequest() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasGetClubListResponse() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasGetUserSettingsRequest() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasGetUserSettingsResponse() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasNewSwingNotification() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasSetActiveClubRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasSetActiveClubResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasSetUserSettingsRequest() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasSetUserSettingsResponse() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasSwingMetricsNotification() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasSwingSensorConnectedNotification() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensor.SwingSensorServiceOrBuilder
            public boolean hasSwingSensorDisconnectedNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensor.internal_static_GDI_Proto_SwingSensor_SwingSensorService_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingSensorService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasNewSwingNotification() && !getNewSwingNotification().isInitialized()) {
                    return false;
                }
                if (hasGetClubListResponse() && !getGetClubListResponse().isInitialized()) {
                    return false;
                }
                if (hasSetActiveClubRequest() && !getSetActiveClubRequest().isInitialized()) {
                    return false;
                }
                if (hasSetActiveClubResponse() && !getSetActiveClubResponse().isInitialized()) {
                    return false;
                }
                if (hasGetUserSettingsResponse() && !getGetUserSettingsResponse().isInitialized()) {
                    return false;
                }
                if (hasSetUserSettingsRequest() && !getSetUserSettingsRequest().isInitialized()) {
                    return false;
                }
                if (!hasSetUserSettingsResponse() || getSetUserSettingsResponse().isInitialized()) {
                    return !hasSwingMetricsNotification() || getSwingMetricsNotification().isInitialized();
                }
                return false;
            }

            public Builder mergeClubListChangedNotification(GDISwingSensorClubs.ClubListChangedNotification clubListChangedNotification) {
                GDISwingSensorClubs.ClubListChangedNotification clubListChangedNotification2;
                SingleFieldBuilderV3<GDISwingSensorClubs.ClubListChangedNotification, GDISwingSensorClubs.ClubListChangedNotification.Builder, GDISwingSensorClubs.ClubListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.clubListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(clubListChangedNotification);
                } else if ((this.bitField0_ & 4096) == 0 || (clubListChangedNotification2 = this.clubListChangedNotification_) == null || clubListChangedNotification2 == GDISwingSensorClubs.ClubListChangedNotification.getDefaultInstance()) {
                    this.clubListChangedNotification_ = clubListChangedNotification;
                } else {
                    getClubListChangedNotificationBuilder().mergeFrom(clubListChangedNotification);
                }
                if (this.clubListChangedNotification_ != null) {
                    this.bitField0_ |= 4096;
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
                                    codedInputStream.readMessage(getNewSwingNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getGetClubListRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getGetClubListResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getSetActiveClubRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getSetActiveClubResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getGetUserSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getGetUserSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getSetUserSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getSetUserSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getSwingSensorConnectedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 122:
                                    codedInputStream.readMessage(getSwingSensorDisconnectedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 146:
                                    codedInputStream.readMessage(getSwingMetricsNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 154:
                                    codedInputStream.readMessage(getClubListChangedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeGetClubListRequest(GDISwingSensorClubs.GetClubListRequest getClubListRequest) {
                GDISwingSensorClubs.GetClubListRequest getClubListRequest2;
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListRequest, GDISwingSensorClubs.GetClubListRequest.Builder, GDISwingSensorClubs.GetClubListRequestOrBuilder> singleFieldBuilderV3 = this.getClubListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getClubListRequest);
                } else if ((this.bitField0_ & 2) == 0 || (getClubListRequest2 = this.getClubListRequest_) == null || getClubListRequest2 == GDISwingSensorClubs.GetClubListRequest.getDefaultInstance()) {
                    this.getClubListRequest_ = getClubListRequest;
                } else {
                    getGetClubListRequestBuilder().mergeFrom(getClubListRequest);
                }
                if (this.getClubListRequest_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetClubListResponse(GDISwingSensorClubs.GetClubListResponse getClubListResponse) {
                GDISwingSensorClubs.GetClubListResponse getClubListResponse2;
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListResponse, GDISwingSensorClubs.GetClubListResponse.Builder, GDISwingSensorClubs.GetClubListResponseOrBuilder> singleFieldBuilderV3 = this.getClubListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getClubListResponse);
                } else if ((this.bitField0_ & 4) == 0 || (getClubListResponse2 = this.getClubListResponse_) == null || getClubListResponse2 == GDISwingSensorClubs.GetClubListResponse.getDefaultInstance()) {
                    this.getClubListResponse_ = getClubListResponse;
                } else {
                    getGetClubListResponseBuilder().mergeFrom(getClubListResponse);
                }
                if (this.getClubListResponse_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetUserSettingsRequest(GDISwingSensorUserSettings.GetUserSettingsRequest getUserSettingsRequest) {
                GDISwingSensorUserSettings.GetUserSettingsRequest getUserSettingsRequest2;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsRequest, GDISwingSensorUserSettings.GetUserSettingsRequest.Builder, GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getUserSettingsRequest);
                } else if ((this.bitField0_ & 32) == 0 || (getUserSettingsRequest2 = this.getUserSettingsRequest_) == null || getUserSettingsRequest2 == GDISwingSensorUserSettings.GetUserSettingsRequest.getDefaultInstance()) {
                    this.getUserSettingsRequest_ = getUserSettingsRequest;
                } else {
                    getGetUserSettingsRequestBuilder().mergeFrom(getUserSettingsRequest);
                }
                if (this.getUserSettingsRequest_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetUserSettingsResponse(GDISwingSensorUserSettings.GetUserSettingsResponse getUserSettingsResponse) {
                GDISwingSensorUserSettings.GetUserSettingsResponse getUserSettingsResponse2;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsResponse, GDISwingSensorUserSettings.GetUserSettingsResponse.Builder, GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getUserSettingsResponse);
                } else if ((this.bitField0_ & 64) == 0 || (getUserSettingsResponse2 = this.getUserSettingsResponse_) == null || getUserSettingsResponse2 == GDISwingSensorUserSettings.GetUserSettingsResponse.getDefaultInstance()) {
                    this.getUserSettingsResponse_ = getUserSettingsResponse;
                } else {
                    getGetUserSettingsResponseBuilder().mergeFrom(getUserSettingsResponse);
                }
                if (this.getUserSettingsResponse_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeNewSwingNotification(NewSwingNotification newSwingNotification) {
                NewSwingNotification newSwingNotification2;
                SingleFieldBuilderV3<NewSwingNotification, NewSwingNotification.Builder, NewSwingNotificationOrBuilder> singleFieldBuilderV3 = this.newSwingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(newSwingNotification);
                } else if ((this.bitField0_ & 1) == 0 || (newSwingNotification2 = this.newSwingNotification_) == null || newSwingNotification2 == NewSwingNotification.getDefaultInstance()) {
                    this.newSwingNotification_ = newSwingNotification;
                } else {
                    getNewSwingNotificationBuilder().mergeFrom(newSwingNotification);
                }
                if (this.newSwingNotification_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetActiveClubRequest(GDISwingSensorClubs.SetActiveClubRequest setActiveClubRequest) {
                GDISwingSensorClubs.SetActiveClubRequest setActiveClubRequest2;
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubRequest, GDISwingSensorClubs.SetActiveClubRequest.Builder, GDISwingSensorClubs.SetActiveClubRequestOrBuilder> singleFieldBuilderV3 = this.setActiveClubRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setActiveClubRequest);
                } else if ((this.bitField0_ & 8) == 0 || (setActiveClubRequest2 = this.setActiveClubRequest_) == null || setActiveClubRequest2 == GDISwingSensorClubs.SetActiveClubRequest.getDefaultInstance()) {
                    this.setActiveClubRequest_ = setActiveClubRequest;
                } else {
                    getSetActiveClubRequestBuilder().mergeFrom(setActiveClubRequest);
                }
                if (this.setActiveClubRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetActiveClubResponse(GDISwingSensorClubs.SetActiveClubResponse setActiveClubResponse) {
                GDISwingSensorClubs.SetActiveClubResponse setActiveClubResponse2;
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubResponse, GDISwingSensorClubs.SetActiveClubResponse.Builder, GDISwingSensorClubs.SetActiveClubResponseOrBuilder> singleFieldBuilderV3 = this.setActiveClubResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setActiveClubResponse);
                } else if ((this.bitField0_ & 16) == 0 || (setActiveClubResponse2 = this.setActiveClubResponse_) == null || setActiveClubResponse2 == GDISwingSensorClubs.SetActiveClubResponse.getDefaultInstance()) {
                    this.setActiveClubResponse_ = setActiveClubResponse;
                } else {
                    getSetActiveClubResponseBuilder().mergeFrom(setActiveClubResponse);
                }
                if (this.setActiveClubResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetUserSettingsRequest(GDISwingSensorUserSettings.SetUserSettingsRequest setUserSettingsRequest) {
                GDISwingSensorUserSettings.SetUserSettingsRequest setUserSettingsRequest2;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsRequest, GDISwingSensorUserSettings.SetUserSettingsRequest.Builder, GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.setUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setUserSettingsRequest);
                } else if ((this.bitField0_ & 128) == 0 || (setUserSettingsRequest2 = this.setUserSettingsRequest_) == null || setUserSettingsRequest2 == GDISwingSensorUserSettings.SetUserSettingsRequest.getDefaultInstance()) {
                    this.setUserSettingsRequest_ = setUserSettingsRequest;
                } else {
                    getSetUserSettingsRequestBuilder().mergeFrom(setUserSettingsRequest);
                }
                if (this.setUserSettingsRequest_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetUserSettingsResponse(GDISwingSensorUserSettings.SetUserSettingsResponse setUserSettingsResponse) {
                GDISwingSensorUserSettings.SetUserSettingsResponse setUserSettingsResponse2;
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsResponse, GDISwingSensorUserSettings.SetUserSettingsResponse.Builder, GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.setUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setUserSettingsResponse);
                } else if ((this.bitField0_ & 256) == 0 || (setUserSettingsResponse2 = this.setUserSettingsResponse_) == null || setUserSettingsResponse2 == GDISwingSensorUserSettings.SetUserSettingsResponse.getDefaultInstance()) {
                    this.setUserSettingsResponse_ = setUserSettingsResponse;
                } else {
                    getSetUserSettingsResponseBuilder().mergeFrom(setUserSettingsResponse);
                }
                if (this.setUserSettingsResponse_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwingMetricsNotification(GDISwingSensorMetrics.SwingMetricsNotification swingMetricsNotification) {
                GDISwingSensorMetrics.SwingMetricsNotification swingMetricsNotification2;
                SingleFieldBuilderV3<GDISwingSensorMetrics.SwingMetricsNotification, GDISwingSensorMetrics.SwingMetricsNotification.Builder, GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder> singleFieldBuilderV3 = this.swingMetricsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(swingMetricsNotification);
                } else if ((this.bitField0_ & 2048) == 0 || (swingMetricsNotification2 = this.swingMetricsNotification_) == null || swingMetricsNotification2 == GDISwingSensorMetrics.SwingMetricsNotification.getDefaultInstance()) {
                    this.swingMetricsNotification_ = swingMetricsNotification;
                } else {
                    getSwingMetricsNotificationBuilder().mergeFrom(swingMetricsNotification);
                }
                if (this.swingMetricsNotification_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwingSensorConnectedNotification(SwingSensorConnectedNotification swingSensorConnectedNotification) {
                SwingSensorConnectedNotification swingSensorConnectedNotification2;
                SingleFieldBuilderV3<SwingSensorConnectedNotification, SwingSensorConnectedNotification.Builder, SwingSensorConnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorConnectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(swingSensorConnectedNotification);
                } else if ((this.bitField0_ & 512) == 0 || (swingSensorConnectedNotification2 = this.swingSensorConnectedNotification_) == null || swingSensorConnectedNotification2 == SwingSensorConnectedNotification.getDefaultInstance()) {
                    this.swingSensorConnectedNotification_ = swingSensorConnectedNotification;
                } else {
                    getSwingSensorConnectedNotificationBuilder().mergeFrom(swingSensorConnectedNotification);
                }
                if (this.swingSensorConnectedNotification_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwingSensorDisconnectedNotification(SwingSensorDisconnectedNotification swingSensorDisconnectedNotification) {
                SwingSensorDisconnectedNotification swingSensorDisconnectedNotification2;
                SingleFieldBuilderV3<SwingSensorDisconnectedNotification, SwingSensorDisconnectedNotification.Builder, SwingSensorDisconnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorDisconnectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(swingSensorDisconnectedNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (swingSensorDisconnectedNotification2 = this.swingSensorDisconnectedNotification_) == null || swingSensorDisconnectedNotification2 == SwingSensorDisconnectedNotification.getDefaultInstance()) {
                    this.swingSensorDisconnectedNotification_ = swingSensorDisconnectedNotification;
                } else {
                    getSwingSensorDisconnectedNotificationBuilder().mergeFrom(swingSensorDisconnectedNotification);
                }
                if (this.swingSensorDisconnectedNotification_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setClubListChangedNotification(GDISwingSensorClubs.ClubListChangedNotification.Builder builder) {
                SingleFieldBuilderV3<GDISwingSensorClubs.ClubListChangedNotification, GDISwingSensorClubs.ClubListChangedNotification.Builder, GDISwingSensorClubs.ClubListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.clubListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.clubListChangedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGetClubListRequest(GDISwingSensorClubs.GetClubListRequest.Builder builder) {
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListRequest, GDISwingSensorClubs.GetClubListRequest.Builder, GDISwingSensorClubs.GetClubListRequestOrBuilder> singleFieldBuilderV3 = this.getClubListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getClubListRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setGetClubListResponse(GDISwingSensorClubs.GetClubListResponse.Builder builder) {
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListResponse, GDISwingSensorClubs.GetClubListResponse.Builder, GDISwingSensorClubs.GetClubListResponseOrBuilder> singleFieldBuilderV3 = this.getClubListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getClubListResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGetUserSettingsRequest(GDISwingSensorUserSettings.GetUserSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsRequest, GDISwingSensorUserSettings.GetUserSettingsRequest.Builder, GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getUserSettingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setGetUserSettingsResponse(GDISwingSensorUserSettings.GetUserSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsResponse, GDISwingSensorUserSettings.GetUserSettingsResponse.Builder, GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getUserSettingsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setNewSwingNotification(NewSwingNotification.Builder builder) {
                SingleFieldBuilderV3<NewSwingNotification, NewSwingNotification.Builder, NewSwingNotificationOrBuilder> singleFieldBuilderV3 = this.newSwingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.newSwingNotification_ = builder.build();
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

            public Builder setSetActiveClubRequest(GDISwingSensorClubs.SetActiveClubRequest.Builder builder) {
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubRequest, GDISwingSensorClubs.SetActiveClubRequest.Builder, GDISwingSensorClubs.SetActiveClubRequestOrBuilder> singleFieldBuilderV3 = this.setActiveClubRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setActiveClubRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSetActiveClubResponse(GDISwingSensorClubs.SetActiveClubResponse.Builder builder) {
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubResponse, GDISwingSensorClubs.SetActiveClubResponse.Builder, GDISwingSensorClubs.SetActiveClubResponseOrBuilder> singleFieldBuilderV3 = this.setActiveClubResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setActiveClubResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSetUserSettingsRequest(GDISwingSensorUserSettings.SetUserSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsRequest, GDISwingSensorUserSettings.SetUserSettingsRequest.Builder, GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.setUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setUserSettingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSetUserSettingsResponse(GDISwingSensorUserSettings.SetUserSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsResponse, GDISwingSensorUserSettings.SetUserSettingsResponse.Builder, GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.setUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setUserSettingsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSwingMetricsNotification(GDISwingSensorMetrics.SwingMetricsNotification.Builder builder) {
                SingleFieldBuilderV3<GDISwingSensorMetrics.SwingMetricsNotification, GDISwingSensorMetrics.SwingMetricsNotification.Builder, GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder> singleFieldBuilderV3 = this.swingMetricsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.swingMetricsNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSwingSensorConnectedNotification(SwingSensorConnectedNotification.Builder builder) {
                SingleFieldBuilderV3<SwingSensorConnectedNotification, SwingSensorConnectedNotification.Builder, SwingSensorConnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorConnectedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.swingSensorConnectedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSwingSensorDisconnectedNotification(SwingSensorDisconnectedNotification.Builder builder) {
                SingleFieldBuilderV3<SwingSensorDisconnectedNotification, SwingSensorDisconnectedNotification.Builder, SwingSensorDisconnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorDisconnectedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.swingSensorDisconnectedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SwingSensorService getDefaultInstanceForType() {
                return SwingSensorService.getDefaultInstance();
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

            public Builder setClubListChangedNotification(GDISwingSensorClubs.ClubListChangedNotification clubListChangedNotification) {
                SingleFieldBuilderV3<GDISwingSensorClubs.ClubListChangedNotification, GDISwingSensorClubs.ClubListChangedNotification.Builder, GDISwingSensorClubs.ClubListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.clubListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    clubListChangedNotification.getClass();
                    this.clubListChangedNotification_ = clubListChangedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(clubListChangedNotification);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setGetClubListRequest(GDISwingSensorClubs.GetClubListRequest getClubListRequest) {
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListRequest, GDISwingSensorClubs.GetClubListRequest.Builder, GDISwingSensorClubs.GetClubListRequestOrBuilder> singleFieldBuilderV3 = this.getClubListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getClubListRequest.getClass();
                    this.getClubListRequest_ = getClubListRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getClubListRequest);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setGetClubListResponse(GDISwingSensorClubs.GetClubListResponse getClubListResponse) {
                SingleFieldBuilderV3<GDISwingSensorClubs.GetClubListResponse, GDISwingSensorClubs.GetClubListResponse.Builder, GDISwingSensorClubs.GetClubListResponseOrBuilder> singleFieldBuilderV3 = this.getClubListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getClubListResponse.getClass();
                    this.getClubListResponse_ = getClubListResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getClubListResponse);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGetUserSettingsRequest(GDISwingSensorUserSettings.GetUserSettingsRequest getUserSettingsRequest) {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsRequest, GDISwingSensorUserSettings.GetUserSettingsRequest.Builder, GDISwingSensorUserSettings.GetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getUserSettingsRequest.getClass();
                    this.getUserSettingsRequest_ = getUserSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getUserSettingsRequest);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setGetUserSettingsResponse(GDISwingSensorUserSettings.GetUserSettingsResponse getUserSettingsResponse) {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.GetUserSettingsResponse, GDISwingSensorUserSettings.GetUserSettingsResponse.Builder, GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getUserSettingsResponse.getClass();
                    this.getUserSettingsResponse_ = getUserSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getUserSettingsResponse);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setNewSwingNotification(NewSwingNotification newSwingNotification) {
                SingleFieldBuilderV3<NewSwingNotification, NewSwingNotification.Builder, NewSwingNotificationOrBuilder> singleFieldBuilderV3 = this.newSwingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    newSwingNotification.getClass();
                    this.newSwingNotification_ = newSwingNotification;
                } else {
                    singleFieldBuilderV3.setMessage(newSwingNotification);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSetActiveClubRequest(GDISwingSensorClubs.SetActiveClubRequest setActiveClubRequest) {
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubRequest, GDISwingSensorClubs.SetActiveClubRequest.Builder, GDISwingSensorClubs.SetActiveClubRequestOrBuilder> singleFieldBuilderV3 = this.setActiveClubRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setActiveClubRequest.getClass();
                    this.setActiveClubRequest_ = setActiveClubRequest;
                } else {
                    singleFieldBuilderV3.setMessage(setActiveClubRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSetActiveClubResponse(GDISwingSensorClubs.SetActiveClubResponse setActiveClubResponse) {
                SingleFieldBuilderV3<GDISwingSensorClubs.SetActiveClubResponse, GDISwingSensorClubs.SetActiveClubResponse.Builder, GDISwingSensorClubs.SetActiveClubResponseOrBuilder> singleFieldBuilderV3 = this.setActiveClubResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setActiveClubResponse.getClass();
                    this.setActiveClubResponse_ = setActiveClubResponse;
                } else {
                    singleFieldBuilderV3.setMessage(setActiveClubResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSetUserSettingsRequest(GDISwingSensorUserSettings.SetUserSettingsRequest setUserSettingsRequest) {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsRequest, GDISwingSensorUserSettings.SetUserSettingsRequest.Builder, GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder> singleFieldBuilderV3 = this.setUserSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setUserSettingsRequest.getClass();
                    this.setUserSettingsRequest_ = setUserSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(setUserSettingsRequest);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSetUserSettingsResponse(GDISwingSensorUserSettings.SetUserSettingsResponse setUserSettingsResponse) {
                SingleFieldBuilderV3<GDISwingSensorUserSettings.SetUserSettingsResponse, GDISwingSensorUserSettings.SetUserSettingsResponse.Builder, GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder> singleFieldBuilderV3 = this.setUserSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setUserSettingsResponse.getClass();
                    this.setUserSettingsResponse_ = setUserSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(setUserSettingsResponse);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSwingMetricsNotification(GDISwingSensorMetrics.SwingMetricsNotification swingMetricsNotification) {
                SingleFieldBuilderV3<GDISwingSensorMetrics.SwingMetricsNotification, GDISwingSensorMetrics.SwingMetricsNotification.Builder, GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder> singleFieldBuilderV3 = this.swingMetricsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    swingMetricsNotification.getClass();
                    this.swingMetricsNotification_ = swingMetricsNotification;
                } else {
                    singleFieldBuilderV3.setMessage(swingMetricsNotification);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSwingSensorConnectedNotification(SwingSensorConnectedNotification swingSensorConnectedNotification) {
                SingleFieldBuilderV3<SwingSensorConnectedNotification, SwingSensorConnectedNotification.Builder, SwingSensorConnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorConnectedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    swingSensorConnectedNotification.getClass();
                    this.swingSensorConnectedNotification_ = swingSensorConnectedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(swingSensorConnectedNotification);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSwingSensorDisconnectedNotification(SwingSensorDisconnectedNotification swingSensorDisconnectedNotification) {
                SingleFieldBuilderV3<SwingSensorDisconnectedNotification, SwingSensorDisconnectedNotification.Builder, SwingSensorDisconnectedNotificationOrBuilder> singleFieldBuilderV3 = this.swingSensorDisconnectedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    swingSensorDisconnectedNotification.getClass();
                    this.swingSensorDisconnectedNotification_ = swingSensorDisconnectedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(swingSensorDisconnectedNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwingSensorService) {
                    return mergeFrom((SwingSensorService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwingSensorService swingSensorService) {
                if (swingSensorService == SwingSensorService.getDefaultInstance()) {
                    return this;
                }
                if (swingSensorService.hasNewSwingNotification()) {
                    mergeNewSwingNotification(swingSensorService.getNewSwingNotification());
                }
                if (swingSensorService.hasGetClubListRequest()) {
                    mergeGetClubListRequest(swingSensorService.getGetClubListRequest());
                }
                if (swingSensorService.hasGetClubListResponse()) {
                    mergeGetClubListResponse(swingSensorService.getGetClubListResponse());
                }
                if (swingSensorService.hasSetActiveClubRequest()) {
                    mergeSetActiveClubRequest(swingSensorService.getSetActiveClubRequest());
                }
                if (swingSensorService.hasSetActiveClubResponse()) {
                    mergeSetActiveClubResponse(swingSensorService.getSetActiveClubResponse());
                }
                if (swingSensorService.hasGetUserSettingsRequest()) {
                    mergeGetUserSettingsRequest(swingSensorService.getGetUserSettingsRequest());
                }
                if (swingSensorService.hasGetUserSettingsResponse()) {
                    mergeGetUserSettingsResponse(swingSensorService.getGetUserSettingsResponse());
                }
                if (swingSensorService.hasSetUserSettingsRequest()) {
                    mergeSetUserSettingsRequest(swingSensorService.getSetUserSettingsRequest());
                }
                if (swingSensorService.hasSetUserSettingsResponse()) {
                    mergeSetUserSettingsResponse(swingSensorService.getSetUserSettingsResponse());
                }
                if (swingSensorService.hasSwingSensorConnectedNotification()) {
                    mergeSwingSensorConnectedNotification(swingSensorService.getSwingSensorConnectedNotification());
                }
                if (swingSensorService.hasSwingSensorDisconnectedNotification()) {
                    mergeSwingSensorDisconnectedNotification(swingSensorService.getSwingSensorDisconnectedNotification());
                }
                if (swingSensorService.hasSwingMetricsNotification()) {
                    mergeSwingMetricsNotification(swingSensorService.getSwingMetricsNotification());
                }
                if (swingSensorService.hasClubListChangedNotification()) {
                    mergeClubListChangedNotification(swingSensorService.getClubListChangedNotification());
                }
                mergeUnknownFields(swingSensorService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwingSensorService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SwingSensorService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwingSensorService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwingSensorService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingSensorService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingSensorService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwingSensorService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwingSensorService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwingSensorService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwingSensorService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwingSensorService parseFrom(InputStream inputStream) {
            return (SwingSensorService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwingSensorService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingSensorService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingSensorService parseFrom(CodedInputStream codedInputStream) {
            return (SwingSensorService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwingSensorService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingSensorService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
