package com.garmin.proto.generated;

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
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
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

/* JADX INFO: loaded from: classes13.dex */
public final class GDISportProfileSetup {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001aGDISportProfileSetup.proto\u0012\u001bGDI.Proto.SportProfileSetup\"¾\u0002\n\u0018SportProfileSetupService\u0012\\\n\u001csupported_sport_list_request\u0018\u0001 \u0001(\u000b26.GDI.Proto.SportProfileSetup.SupportedSportListRequest\u0012^\n\u001dsupported_sport_list_response\u0018\u0002 \u0001(\u000b27.GDI.Proto.SportProfileSetup.SupportedSportListResponse\u0012d\n selected_sport_list_notification\u0018\u0003 \u0001(\u000b2:.GDI.Proto.SportProfileSetup.SelectedSportListNotification\"\u001b\n\u0019SupportedSportListRequest\"v\n\u001aSupportedSportListResponse\u00121\n\u0005sport\u0018\u0001 \u0003(\u000b2\".GDI.Proto.SportProfileSetup.Sport\u0012%\n\u0016profile_setup_complete\u0018\u0002 \u0001(\b:\u0005false\"R\n\u001dSelectedSportListNotification\u00121\n\u0005sport\u0018\u0001 \u0003(\u000b2\".GDI.Proto.SportProfileSetup.Sport\"L\n\u0005Sport\u0012\u0016\n\u000esport_fit_type\u0018\u0001 \u0002(\r\u0012\u001a\n\u0012sport_fit_sub_type\u0018\u0002 \u0002(\r\u0012\u000f\n\u0007enabled\u0018\u0003 \u0002(\bB4\n\u001acom.garmin.proto.generatedB\u0014GDISportProfileSetupH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SportProfileSetup_SelectedSportListNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SportProfileSetup_SelectedSportListNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SportProfileSetup_SportProfileSetupService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SportProfileSetup_SportProfileSetupService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SportProfileSetup_Sport_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SportProfileSetup_Sport_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SportProfileSetup_SupportedSportListRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SportProfileSetup_SupportedSportListRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SportProfileSetup_SupportedSportListResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SportProfileSetup_SupportedSportListResponse_fieldAccessorTable;

    public interface SelectedSportListNotificationOrBuilder extends MessageOrBuilder {
        Sport getSport(int i14);

        int getSportCount();

        List<Sport> getSportList();

        SportOrBuilder getSportOrBuilder(int i14);

        List<? extends SportOrBuilder> getSportOrBuilderList();
    }

    public interface SportOrBuilder extends MessageOrBuilder {
        boolean getEnabled();

        int getSportFitSubType();

        int getSportFitType();

        boolean hasEnabled();

        boolean hasSportFitSubType();

        boolean hasSportFitType();
    }

    public interface SportProfileSetupServiceOrBuilder extends MessageOrBuilder {
        SelectedSportListNotification getSelectedSportListNotification();

        SelectedSportListNotificationOrBuilder getSelectedSportListNotificationOrBuilder();

        SupportedSportListRequest getSupportedSportListRequest();

        SupportedSportListRequestOrBuilder getSupportedSportListRequestOrBuilder();

        SupportedSportListResponse getSupportedSportListResponse();

        SupportedSportListResponseOrBuilder getSupportedSportListResponseOrBuilder();

        boolean hasSelectedSportListNotification();

        boolean hasSupportedSportListRequest();

        boolean hasSupportedSportListResponse();
    }

    public interface SupportedSportListRequestOrBuilder extends MessageOrBuilder {
    }

    public interface SupportedSportListResponseOrBuilder extends MessageOrBuilder {
        boolean getProfileSetupComplete();

        Sport getSport(int i14);

        int getSportCount();

        List<Sport> getSportList();

        SportOrBuilder getSportOrBuilder(int i14);

        List<? extends SportOrBuilder> getSportOrBuilderList();

        boolean hasProfileSetupComplete();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SportProfileSetup_SportProfileSetupService_descriptor = descriptor2;
        internal_static_GDI_Proto_SportProfileSetup_SportProfileSetupService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SupportedSportListRequest", "SupportedSportListResponse", "SelectedSportListNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_SportProfileSetup_SupportedSportListRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_SportProfileSetup_SupportedSportListRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_SportProfileSetup_SupportedSportListResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_SportProfileSetup_SupportedSportListResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Sport", "ProfileSetupComplete"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_SportProfileSetup_SelectedSportListNotification_descriptor = descriptor5;
        internal_static_GDI_Proto_SportProfileSetup_SelectedSportListNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Sport"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_SportProfileSetup_Sport_descriptor = descriptor6;
        internal_static_GDI_Proto_SportProfileSetup_Sport_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"SportFitType", "SportFitSubType", "Enabled"});
    }

    private GDISportProfileSetup() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class Sport extends GeneratedMessageV3 implements SportOrBuilder {
        public static final int ENABLED_FIELD_NUMBER = 3;
        public static final int SPORT_FIT_SUB_TYPE_FIELD_NUMBER = 2;
        public static final int SPORT_FIT_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enabled_;
        private byte memoizedIsInitialized;
        private int sportFitSubType_;
        private int sportFitType_;
        private static final Sport DEFAULT_INSTANCE = new Sport();

        @Deprecated
        public static final Parser<Sport> PARSER = new AbstractParser<Sport>() { // from class: com.garmin.proto.generated.GDISportProfileSetup.Sport.1
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

        private Sport(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sportFitType_ = 0;
            this.sportFitSubType_ = 0;
            this.enabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Sport getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_Sport_descriptor;
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
            if ((hasSportFitType() && getSportFitType() != sport.getSportFitType()) || hasSportFitSubType() != sport.hasSportFitSubType()) {
                return false;
            }
            if ((!hasSportFitSubType() || getSportFitSubType() == sport.getSportFitSubType()) && hasEnabled() == sport.hasEnabled()) {
                return (!hasEnabled() || getEnabled() == sport.getEnabled()) && getUnknownFields().equals(sport.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
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
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(3, this.enabled_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
        public int getSportFitSubType() {
            return this.sportFitSubType_;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
        public int getSportFitType() {
            return this.sportFitType_;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
        public boolean hasSportFitSubType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
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
            if (hasEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getEnabled());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_Sport_fieldAccessorTable.ensureFieldAccessorsInitialized(Sport.class, Builder.class);
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
            if (!hasSportFitSubType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEnabled()) {
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
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.enabled_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SportOrBuilder {
            private int bitField0_;
            private boolean enabled_;
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
                if ((i15 & 4) != 0) {
                    sport.enabled_ = this.enabled_;
                    i14 |= 4;
                }
                sport.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_Sport_descriptor;
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
                this.enabled_ = false;
                return this;
            }

            public Builder clearEnabled() {
                this.bitField0_ &= -5;
                this.enabled_ = false;
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
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_Sport_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
            public int getSportFitSubType() {
                return this.sportFitSubType_;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
            public int getSportFitType() {
                return this.sportFitType_;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
            public boolean hasEnabled() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
            public boolean hasSportFitSubType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportOrBuilder
            public boolean hasSportFitType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_Sport_fieldAccessorTable.ensureFieldAccessorsInitialized(Sport.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSportFitType() && hasSportFitSubType() && hasEnabled();
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
                                } else if (tag == 24) {
                                    this.enabled_ = codedInputStream.readBool();
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

            public Builder setEnabled(boolean z14) {
                this.enabled_ = z14;
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
                if (sport.hasEnabled()) {
                    setEnabled(sport.getEnabled());
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

        public static Sport parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Sport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ Sport(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Sport parseFrom(InputStream inputStream) {
            return (Sport) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private Sport() {
            this.sportFitType_ = 0;
            this.sportFitSubType_ = 0;
            this.enabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
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

    public static final class SupportedSportListRequest extends GeneratedMessageV3 implements SupportedSportListRequestOrBuilder {
        private static final SupportedSportListRequest DEFAULT_INSTANCE = new SupportedSportListRequest();

        @Deprecated
        public static final Parser<SupportedSportListRequest> PARSER = new AbstractParser<SupportedSportListRequest>() { // from class: com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListRequest.1
            @Override // com.google.protobuf.Parser
            public SupportedSportListRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SupportedSportListRequest.newBuilder();
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

        private SupportedSportListRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SupportedSportListRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SupportedSportListRequest_descriptor;
        }

        public static Builder newBuilder(SupportedSportListRequest supportedSportListRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(supportedSportListRequest);
        }

        public static SupportedSportListRequest parseDelimitedFrom(InputStream inputStream) {
            return (SupportedSportListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SupportedSportListRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SupportedSportListRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SupportedSportListRequest) {
                return getUnknownFields().equals(((SupportedSportListRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SupportedSportListRequest> getParserForType() {
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
            return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SupportedSportListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedSportListRequest.class, Builder.class);
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
            return new SupportedSportListRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportedSportListRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SupportedSportListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedSportListRequest build() {
                SupportedSportListRequest supportedSportListRequestBuildPartial = buildPartial();
                if (supportedSportListRequestBuildPartial.isInitialized()) {
                    return supportedSportListRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) supportedSportListRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedSportListRequest buildPartial() {
                SupportedSportListRequest supportedSportListRequest = new SupportedSportListRequest(this);
                onBuilt();
                return supportedSportListRequest;
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
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SupportedSportListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SupportedSportListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedSportListRequest.class, Builder.class);
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
            public SupportedSportListRequest getDefaultInstanceForType() {
                return SupportedSportListRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SupportedSportListRequest) {
                    return mergeFrom((SupportedSportListRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SupportedSportListRequest supportedSportListRequest) {
                if (supportedSportListRequest == SupportedSportListRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(supportedSportListRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SupportedSportListRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SupportedSportListRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SupportedSportListRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SupportedSportListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedSportListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedSportListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SupportedSportListRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SupportedSportListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SupportedSportListRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SupportedSportListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SupportedSportListRequest parseFrom(InputStream inputStream) {
            return (SupportedSportListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SupportedSportListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedSportListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedSportListRequest parseFrom(CodedInputStream codedInputStream) {
            return (SupportedSportListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SupportedSportListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedSportListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SelectedSportListNotification extends GeneratedMessageV3 implements SelectedSportListNotificationOrBuilder {
        private static final SelectedSportListNotification DEFAULT_INSTANCE = new SelectedSportListNotification();

        @Deprecated
        public static final Parser<SelectedSportListNotification> PARSER = new AbstractParser<SelectedSportListNotification>() { // from class: com.garmin.proto.generated.GDISportProfileSetup.SelectedSportListNotification.1
            @Override // com.google.protobuf.Parser
            public SelectedSportListNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SelectedSportListNotification.newBuilder();
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
        public static final int SPORT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<Sport> sport_;

        private SelectedSportListNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.sport_ = Collections.EMPTY_LIST;
        }

        public static SelectedSportListNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SelectedSportListNotification_descriptor;
        }

        public static Builder newBuilder(SelectedSportListNotification selectedSportListNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(selectedSportListNotification);
        }

        public static SelectedSportListNotification parseDelimitedFrom(InputStream inputStream) {
            return (SelectedSportListNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SelectedSportListNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SelectedSportListNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectedSportListNotification)) {
                return super.equals(obj);
            }
            SelectedSportListNotification selectedSportListNotification = (SelectedSportListNotification) obj;
            return getSportList().equals(selectedSportListNotification.getSportList()) && getUnknownFields().equals(selectedSportListNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SelectedSportListNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.sport_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.sport_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SelectedSportListNotificationOrBuilder
        public Sport getSport(int i14) {
            return this.sport_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SelectedSportListNotificationOrBuilder
        public int getSportCount() {
            return this.sport_.size();
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SelectedSportListNotificationOrBuilder
        public List<Sport> getSportList() {
            return this.sport_;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SelectedSportListNotificationOrBuilder
        public SportOrBuilder getSportOrBuilder(int i14) {
            return this.sport_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SelectedSportListNotificationOrBuilder
        public List<? extends SportOrBuilder> getSportOrBuilderList() {
            return this.sport_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSportCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSportList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SelectedSportListNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectedSportListNotification.class, Builder.class);
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
            for (int i14 = 0; i14 < getSportCount(); i14++) {
                if (!getSport(i14).isInitialized()) {
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
            return new SelectedSportListNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.sport_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.sport_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SelectedSportListNotificationOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> sportBuilder_;
            private List<Sport> sport_;

            private Builder() {
                this.sport_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SelectedSportListNotification selectedSportListNotification) {
            }

            private void buildPartialRepeatedFields(SelectedSportListNotification selectedSportListNotification) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    selectedSportListNotification.sport_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.sport_ = Collections.unmodifiableList(this.sport_);
                    this.bitField0_ &= -2;
                }
                selectedSportListNotification.sport_ = this.sport_;
            }

            private void ensureSportIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.sport_ = new ArrayList(this.sport_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SelectedSportListNotification_descriptor;
            }

            private RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> getSportFieldBuilder() {
                if (this.sportBuilder_ == null) {
                    this.sportBuilder_ = new RepeatedFieldBuilderV3<>(this.sport_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.sport_ = null;
                }
                return this.sportBuilder_;
            }

            public Builder addAllSport(Iterable<? extends Sport> iterable) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureSportIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sport_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSport(Sport.Builder builder) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureSportIsMutable();
                this.sport_.add(builder.build());
                onChanged();
                return this;
            }

            public Sport.Builder addSportBuilder() {
                return (Sport.Builder) getSportFieldBuilder().addBuilder(Sport.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SelectedSportListNotification build() {
                SelectedSportListNotification selectedSportListNotificationBuildPartial = buildPartial();
                if (selectedSportListNotificationBuildPartial.isInitialized()) {
                    return selectedSportListNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) selectedSportListNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SelectedSportListNotification buildPartial() {
                SelectedSportListNotification selectedSportListNotification = new SelectedSportListNotification(this);
                buildPartialRepeatedFields(selectedSportListNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(selectedSportListNotification);
                }
                onBuilt();
                return selectedSportListNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.sport_ = Collections.EMPTY_LIST;
                } else {
                    this.sport_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
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

            public Builder clearSport() {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.sport_ = Collections.EMPTY_LIST;
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
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SelectedSportListNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SelectedSportListNotificationOrBuilder
            public Sport getSport(int i14) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sport_.get(i14) : (Sport) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Sport.Builder getSportBuilder(int i14) {
                return (Sport.Builder) getSportFieldBuilder().getBuilder(i14);
            }

            public List<Sport.Builder> getSportBuilderList() {
                return getSportFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SelectedSportListNotificationOrBuilder
            public int getSportCount() {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sport_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SelectedSportListNotificationOrBuilder
            public List<Sport> getSportList() {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.sport_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SelectedSportListNotificationOrBuilder
            public SportOrBuilder getSportOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sport_.get(i14) : (SportOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SelectedSportListNotificationOrBuilder
            public List<? extends SportOrBuilder> getSportOrBuilderList() {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.sport_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SelectedSportListNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectedSportListNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getSportCount(); i14++) {
                    if (!getSport(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(SelectedSportListNotification selectedSportListNotification) {
                if (selectedSportListNotification == SelectedSportListNotification.getDefaultInstance()) {
                    return this;
                }
                if (this.sportBuilder_ == null) {
                    if (!selectedSportListNotification.sport_.isEmpty()) {
                        if (this.sport_.isEmpty()) {
                            this.sport_ = selectedSportListNotification.sport_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureSportIsMutable();
                            this.sport_.addAll(selectedSportListNotification.sport_);
                        }
                        onChanged();
                    }
                } else if (!selectedSportListNotification.sport_.isEmpty()) {
                    boolean zIsEmpty = this.sportBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.sportBuilder_ = null;
                        this.sport_ = selectedSportListNotification.sport_;
                        this.bitField0_ &= -2;
                        this.sportBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getSportFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(selectedSportListNotification.sport_);
                    }
                }
                mergeUnknownFields(selectedSportListNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeSport(int i14) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureSportIsMutable();
                this.sport_.remove(i14);
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

            public Builder setSport(int i14, Sport.Builder builder) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureSportIsMutable();
                this.sport_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SelectedSportListNotification getDefaultInstanceForType() {
                return SelectedSportListNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sport_ = Collections.EMPTY_LIST;
            }

            public Sport.Builder addSportBuilder(int i14) {
                return (Sport.Builder) getSportFieldBuilder().addBuilder(i14, Sport.getDefaultInstance());
            }

            public Builder addSport(int i14, Sport sport) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sport.getClass();
                    ensureSportIsMutable();
                    this.sport_.add(i14, sport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, sport);
                return this;
            }

            public Builder setSport(int i14, Sport sport) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sport.getClass();
                    ensureSportIsMutable();
                    this.sport_.set(i14, sport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, sport);
                return this;
            }

            public Builder addSport(Sport sport) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sport.getClass();
                    ensureSportIsMutable();
                    this.sport_.add(sport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(sport);
                return this;
            }

            public Builder addSport(int i14, Sport.Builder builder) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSportIsMutable();
                    this.sport_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SelectedSportListNotification) {
                    return mergeFrom((SelectedSportListNotification) message);
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
                                    Sport sport = (Sport) codedInputStream.readMessage(Sport.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureSportIsMutable();
                                        this.sport_.add(sport);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(sport);
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
        public SelectedSportListNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SelectedSportListNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectedSportListNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SelectedSportListNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SelectedSportListNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SelectedSportListNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SelectedSportListNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SelectedSportListNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SelectedSportListNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SelectedSportListNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SelectedSportListNotification parseFrom(InputStream inputStream) {
            return (SelectedSportListNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SelectedSportListNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectedSportListNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SelectedSportListNotification parseFrom(CodedInputStream codedInputStream) {
            return (SelectedSportListNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SelectedSportListNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectedSportListNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SportProfileSetupService extends GeneratedMessageV3 implements SportProfileSetupServiceOrBuilder {
        private static final SportProfileSetupService DEFAULT_INSTANCE = new SportProfileSetupService();

        @Deprecated
        public static final Parser<SportProfileSetupService> PARSER = new AbstractParser<SportProfileSetupService>() { // from class: com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupService.1
            @Override // com.google.protobuf.Parser
            public SportProfileSetupService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SportProfileSetupService.newBuilder();
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
        public static final int SELECTED_SPORT_LIST_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int SUPPORTED_SPORT_LIST_REQUEST_FIELD_NUMBER = 1;
        public static final int SUPPORTED_SPORT_LIST_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SelectedSportListNotification selectedSportListNotification_;
        private SupportedSportListRequest supportedSportListRequest_;
        private SupportedSportListResponse supportedSportListResponse_;

        private SportProfileSetupService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SportProfileSetupService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SportProfileSetupService_descriptor;
        }

        public static Builder newBuilder(SportProfileSetupService sportProfileSetupService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sportProfileSetupService);
        }

        public static SportProfileSetupService parseDelimitedFrom(InputStream inputStream) {
            return (SportProfileSetupService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SportProfileSetupService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SportProfileSetupService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SportProfileSetupService)) {
                return super.equals(obj);
            }
            SportProfileSetupService sportProfileSetupService = (SportProfileSetupService) obj;
            if (hasSupportedSportListRequest() != sportProfileSetupService.hasSupportedSportListRequest()) {
                return false;
            }
            if ((hasSupportedSportListRequest() && !getSupportedSportListRequest().equals(sportProfileSetupService.getSupportedSportListRequest())) || hasSupportedSportListResponse() != sportProfileSetupService.hasSupportedSportListResponse()) {
                return false;
            }
            if ((!hasSupportedSportListResponse() || getSupportedSportListResponse().equals(sportProfileSetupService.getSupportedSportListResponse())) && hasSelectedSportListNotification() == sportProfileSetupService.hasSelectedSportListNotification()) {
                return (!hasSelectedSportListNotification() || getSelectedSportListNotification().equals(sportProfileSetupService.getSelectedSportListNotification())) && getUnknownFields().equals(sportProfileSetupService.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SportProfileSetupService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
        public SelectedSportListNotification getSelectedSportListNotification() {
            SelectedSportListNotification selectedSportListNotification = this.selectedSportListNotification_;
            return selectedSportListNotification == null ? SelectedSportListNotification.getDefaultInstance() : selectedSportListNotification;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
        public SelectedSportListNotificationOrBuilder getSelectedSportListNotificationOrBuilder() {
            SelectedSportListNotification selectedSportListNotification = this.selectedSportListNotification_;
            return selectedSportListNotification == null ? SelectedSportListNotification.getDefaultInstance() : selectedSportListNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSupportedSportListRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSupportedSportListResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getSelectedSportListNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
        public SupportedSportListRequest getSupportedSportListRequest() {
            SupportedSportListRequest supportedSportListRequest = this.supportedSportListRequest_;
            return supportedSportListRequest == null ? SupportedSportListRequest.getDefaultInstance() : supportedSportListRequest;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
        public SupportedSportListRequestOrBuilder getSupportedSportListRequestOrBuilder() {
            SupportedSportListRequest supportedSportListRequest = this.supportedSportListRequest_;
            return supportedSportListRequest == null ? SupportedSportListRequest.getDefaultInstance() : supportedSportListRequest;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
        public SupportedSportListResponse getSupportedSportListResponse() {
            SupportedSportListResponse supportedSportListResponse = this.supportedSportListResponse_;
            return supportedSportListResponse == null ? SupportedSportListResponse.getDefaultInstance() : supportedSportListResponse;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
        public SupportedSportListResponseOrBuilder getSupportedSportListResponseOrBuilder() {
            SupportedSportListResponse supportedSportListResponse = this.supportedSportListResponse_;
            return supportedSportListResponse == null ? SupportedSportListResponse.getDefaultInstance() : supportedSportListResponse;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
        public boolean hasSelectedSportListNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
        public boolean hasSupportedSportListRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
        public boolean hasSupportedSportListResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSupportedSportListRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSupportedSportListRequest().hashCode();
            }
            if (hasSupportedSportListResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSupportedSportListResponse().hashCode();
            }
            if (hasSelectedSportListNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSelectedSportListNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SportProfileSetupService_fieldAccessorTable.ensureFieldAccessorsInitialized(SportProfileSetupService.class, Builder.class);
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
            if (hasSupportedSportListResponse() && !getSupportedSportListResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSelectedSportListNotification() || getSelectedSportListNotification().isInitialized()) {
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
            return new SportProfileSetupService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSupportedSportListRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSupportedSportListResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSelectedSportListNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SportProfileSetupServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SelectedSportListNotification, SelectedSportListNotification.Builder, SelectedSportListNotificationOrBuilder> selectedSportListNotificationBuilder_;
            private SelectedSportListNotification selectedSportListNotification_;
            private SingleFieldBuilderV3<SupportedSportListRequest, SupportedSportListRequest.Builder, SupportedSportListRequestOrBuilder> supportedSportListRequestBuilder_;
            private SupportedSportListRequest supportedSportListRequest_;
            private SingleFieldBuilderV3<SupportedSportListResponse, SupportedSportListResponse.Builder, SupportedSportListResponseOrBuilder> supportedSportListResponseBuilder_;
            private SupportedSportListResponse supportedSportListResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SportProfileSetupService sportProfileSetupService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SupportedSportListRequest, SupportedSportListRequest.Builder, SupportedSportListRequestOrBuilder> singleFieldBuilderV3 = this.supportedSportListRequestBuilder_;
                    sportProfileSetupService.supportedSportListRequest_ = singleFieldBuilderV3 == null ? this.supportedSportListRequest_ : (SupportedSportListRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SupportedSportListResponse, SupportedSportListResponse.Builder, SupportedSportListResponseOrBuilder> singleFieldBuilderV4 = this.supportedSportListResponseBuilder_;
                    sportProfileSetupService.supportedSportListResponse_ = singleFieldBuilderV4 == null ? this.supportedSportListResponse_ : (SupportedSportListResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SelectedSportListNotification, SelectedSportListNotification.Builder, SelectedSportListNotificationOrBuilder> singleFieldBuilderV5 = this.selectedSportListNotificationBuilder_;
                    sportProfileSetupService.selectedSportListNotification_ = singleFieldBuilderV5 == null ? this.selectedSportListNotification_ : (SelectedSportListNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                sportProfileSetupService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SportProfileSetupService_descriptor;
            }

            private SingleFieldBuilderV3<SelectedSportListNotification, SelectedSportListNotification.Builder, SelectedSportListNotificationOrBuilder> getSelectedSportListNotificationFieldBuilder() {
                if (this.selectedSportListNotificationBuilder_ == null) {
                    this.selectedSportListNotificationBuilder_ = new SingleFieldBuilderV3<>(getSelectedSportListNotification(), getParentForChildren(), isClean());
                    this.selectedSportListNotification_ = null;
                }
                return this.selectedSportListNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SupportedSportListRequest, SupportedSportListRequest.Builder, SupportedSportListRequestOrBuilder> getSupportedSportListRequestFieldBuilder() {
                if (this.supportedSportListRequestBuilder_ == null) {
                    this.supportedSportListRequestBuilder_ = new SingleFieldBuilderV3<>(getSupportedSportListRequest(), getParentForChildren(), isClean());
                    this.supportedSportListRequest_ = null;
                }
                return this.supportedSportListRequestBuilder_;
            }

            private SingleFieldBuilderV3<SupportedSportListResponse, SupportedSportListResponse.Builder, SupportedSportListResponseOrBuilder> getSupportedSportListResponseFieldBuilder() {
                if (this.supportedSportListResponseBuilder_ == null) {
                    this.supportedSportListResponseBuilder_ = new SingleFieldBuilderV3<>(getSupportedSportListResponse(), getParentForChildren(), isClean());
                    this.supportedSportListResponse_ = null;
                }
                return this.supportedSportListResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSupportedSportListRequestFieldBuilder();
                    getSupportedSportListResponseFieldBuilder();
                    getSelectedSportListNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SportProfileSetupService build() {
                SportProfileSetupService sportProfileSetupServiceBuildPartial = buildPartial();
                if (sportProfileSetupServiceBuildPartial.isInitialized()) {
                    return sportProfileSetupServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sportProfileSetupServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SportProfileSetupService buildPartial() {
                SportProfileSetupService sportProfileSetupService = new SportProfileSetupService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sportProfileSetupService);
                }
                onBuilt();
                return sportProfileSetupService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.supportedSportListRequest_ = null;
                SingleFieldBuilderV3<SupportedSportListRequest, SupportedSportListRequest.Builder, SupportedSportListRequestOrBuilder> singleFieldBuilderV3 = this.supportedSportListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportedSportListRequestBuilder_ = null;
                }
                this.supportedSportListResponse_ = null;
                SingleFieldBuilderV3<SupportedSportListResponse, SupportedSportListResponse.Builder, SupportedSportListResponseOrBuilder> singleFieldBuilderV4 = this.supportedSportListResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.supportedSportListResponseBuilder_ = null;
                }
                this.selectedSportListNotification_ = null;
                SingleFieldBuilderV3<SelectedSportListNotification, SelectedSportListNotification.Builder, SelectedSportListNotificationOrBuilder> singleFieldBuilderV5 = this.selectedSportListNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.selectedSportListNotificationBuilder_ = null;
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

            public Builder clearSelectedSportListNotification() {
                this.bitField0_ &= -5;
                this.selectedSportListNotification_ = null;
                SingleFieldBuilderV3<SelectedSportListNotification, SelectedSportListNotification.Builder, SelectedSportListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSportListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.selectedSportListNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSupportedSportListRequest() {
                this.bitField0_ &= -2;
                this.supportedSportListRequest_ = null;
                SingleFieldBuilderV3<SupportedSportListRequest, SupportedSportListRequest.Builder, SupportedSportListRequestOrBuilder> singleFieldBuilderV3 = this.supportedSportListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportedSportListRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSupportedSportListResponse() {
                this.bitField0_ &= -3;
                this.supportedSportListResponse_ = null;
                SingleFieldBuilderV3<SupportedSportListResponse, SupportedSportListResponse.Builder, SupportedSportListResponseOrBuilder> singleFieldBuilderV3 = this.supportedSportListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportedSportListResponseBuilder_ = null;
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
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SportProfileSetupService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
            public SelectedSportListNotification getSelectedSportListNotification() {
                SingleFieldBuilderV3<SelectedSportListNotification, SelectedSportListNotification.Builder, SelectedSportListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSportListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SelectedSportListNotification) singleFieldBuilderV3.getMessage();
                }
                SelectedSportListNotification selectedSportListNotification = this.selectedSportListNotification_;
                return selectedSportListNotification == null ? SelectedSportListNotification.getDefaultInstance() : selectedSportListNotification;
            }

            public SelectedSportListNotification.Builder getSelectedSportListNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SelectedSportListNotification.Builder) getSelectedSportListNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
            public SelectedSportListNotificationOrBuilder getSelectedSportListNotificationOrBuilder() {
                SingleFieldBuilderV3<SelectedSportListNotification, SelectedSportListNotification.Builder, SelectedSportListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSportListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SelectedSportListNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SelectedSportListNotification selectedSportListNotification = this.selectedSportListNotification_;
                return selectedSportListNotification == null ? SelectedSportListNotification.getDefaultInstance() : selectedSportListNotification;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
            public SupportedSportListRequest getSupportedSportListRequest() {
                SingleFieldBuilderV3<SupportedSportListRequest, SupportedSportListRequest.Builder, SupportedSportListRequestOrBuilder> singleFieldBuilderV3 = this.supportedSportListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedSportListRequest) singleFieldBuilderV3.getMessage();
                }
                SupportedSportListRequest supportedSportListRequest = this.supportedSportListRequest_;
                return supportedSportListRequest == null ? SupportedSportListRequest.getDefaultInstance() : supportedSportListRequest;
            }

            public SupportedSportListRequest.Builder getSupportedSportListRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SupportedSportListRequest.Builder) getSupportedSportListRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
            public SupportedSportListRequestOrBuilder getSupportedSportListRequestOrBuilder() {
                SingleFieldBuilderV3<SupportedSportListRequest, SupportedSportListRequest.Builder, SupportedSportListRequestOrBuilder> singleFieldBuilderV3 = this.supportedSportListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedSportListRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SupportedSportListRequest supportedSportListRequest = this.supportedSportListRequest_;
                return supportedSportListRequest == null ? SupportedSportListRequest.getDefaultInstance() : supportedSportListRequest;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
            public SupportedSportListResponse getSupportedSportListResponse() {
                SingleFieldBuilderV3<SupportedSportListResponse, SupportedSportListResponse.Builder, SupportedSportListResponseOrBuilder> singleFieldBuilderV3 = this.supportedSportListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedSportListResponse) singleFieldBuilderV3.getMessage();
                }
                SupportedSportListResponse supportedSportListResponse = this.supportedSportListResponse_;
                return supportedSportListResponse == null ? SupportedSportListResponse.getDefaultInstance() : supportedSportListResponse;
            }

            public SupportedSportListResponse.Builder getSupportedSportListResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SupportedSportListResponse.Builder) getSupportedSportListResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
            public SupportedSportListResponseOrBuilder getSupportedSportListResponseOrBuilder() {
                SingleFieldBuilderV3<SupportedSportListResponse, SupportedSportListResponse.Builder, SupportedSportListResponseOrBuilder> singleFieldBuilderV3 = this.supportedSportListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedSportListResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SupportedSportListResponse supportedSportListResponse = this.supportedSportListResponse_;
                return supportedSportListResponse == null ? SupportedSportListResponse.getDefaultInstance() : supportedSportListResponse;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
            public boolean hasSelectedSportListNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
            public boolean hasSupportedSportListRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SportProfileSetupServiceOrBuilder
            public boolean hasSupportedSportListResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SportProfileSetupService_fieldAccessorTable.ensureFieldAccessorsInitialized(SportProfileSetupService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasSupportedSportListResponse() || getSupportedSportListResponse().isInitialized()) {
                    return !hasSelectedSportListNotification() || getSelectedSportListNotification().isInitialized();
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
                                    codedInputStream.readMessage(getSupportedSportListRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSupportedSportListResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSelectedSportListNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSelectedSportListNotification(SelectedSportListNotification selectedSportListNotification) {
                SelectedSportListNotification selectedSportListNotification2;
                SingleFieldBuilderV3<SelectedSportListNotification, SelectedSportListNotification.Builder, SelectedSportListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSportListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(selectedSportListNotification);
                } else if ((this.bitField0_ & 4) == 0 || (selectedSportListNotification2 = this.selectedSportListNotification_) == null || selectedSportListNotification2 == SelectedSportListNotification.getDefaultInstance()) {
                    this.selectedSportListNotification_ = selectedSportListNotification;
                } else {
                    getSelectedSportListNotificationBuilder().mergeFrom(selectedSportListNotification);
                }
                if (this.selectedSportListNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSupportedSportListRequest(SupportedSportListRequest supportedSportListRequest) {
                SupportedSportListRequest supportedSportListRequest2;
                SingleFieldBuilderV3<SupportedSportListRequest, SupportedSportListRequest.Builder, SupportedSportListRequestOrBuilder> singleFieldBuilderV3 = this.supportedSportListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(supportedSportListRequest);
                } else if ((this.bitField0_ & 1) == 0 || (supportedSportListRequest2 = this.supportedSportListRequest_) == null || supportedSportListRequest2 == SupportedSportListRequest.getDefaultInstance()) {
                    this.supportedSportListRequest_ = supportedSportListRequest;
                } else {
                    getSupportedSportListRequestBuilder().mergeFrom(supportedSportListRequest);
                }
                if (this.supportedSportListRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSupportedSportListResponse(SupportedSportListResponse supportedSportListResponse) {
                SupportedSportListResponse supportedSportListResponse2;
                SingleFieldBuilderV3<SupportedSportListResponse, SupportedSportListResponse.Builder, SupportedSportListResponseOrBuilder> singleFieldBuilderV3 = this.supportedSportListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(supportedSportListResponse);
                } else if ((this.bitField0_ & 2) == 0 || (supportedSportListResponse2 = this.supportedSportListResponse_) == null || supportedSportListResponse2 == SupportedSportListResponse.getDefaultInstance()) {
                    this.supportedSportListResponse_ = supportedSportListResponse;
                } else {
                    getSupportedSportListResponseBuilder().mergeFrom(supportedSportListResponse);
                }
                if (this.supportedSportListResponse_ != null) {
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

            public Builder setSelectedSportListNotification(SelectedSportListNotification.Builder builder) {
                SingleFieldBuilderV3<SelectedSportListNotification, SelectedSportListNotification.Builder, SelectedSportListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSportListNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.selectedSportListNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSupportedSportListRequest(SupportedSportListRequest.Builder builder) {
                SingleFieldBuilderV3<SupportedSportListRequest, SupportedSportListRequest.Builder, SupportedSportListRequestOrBuilder> singleFieldBuilderV3 = this.supportedSportListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.supportedSportListRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSupportedSportListResponse(SupportedSportListResponse.Builder builder) {
                SingleFieldBuilderV3<SupportedSportListResponse, SupportedSportListResponse.Builder, SupportedSportListResponseOrBuilder> singleFieldBuilderV3 = this.supportedSportListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.supportedSportListResponse_ = builder.build();
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
            public SportProfileSetupService getDefaultInstanceForType() {
                return SportProfileSetupService.getDefaultInstance();
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

            public Builder setSelectedSportListNotification(SelectedSportListNotification selectedSportListNotification) {
                SingleFieldBuilderV3<SelectedSportListNotification, SelectedSportListNotification.Builder, SelectedSportListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSportListNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    selectedSportListNotification.getClass();
                    this.selectedSportListNotification_ = selectedSportListNotification;
                } else {
                    singleFieldBuilderV3.setMessage(selectedSportListNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSupportedSportListRequest(SupportedSportListRequest supportedSportListRequest) {
                SingleFieldBuilderV3<SupportedSportListRequest, SupportedSportListRequest.Builder, SupportedSportListRequestOrBuilder> singleFieldBuilderV3 = this.supportedSportListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    supportedSportListRequest.getClass();
                    this.supportedSportListRequest_ = supportedSportListRequest;
                } else {
                    singleFieldBuilderV3.setMessage(supportedSportListRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSupportedSportListResponse(SupportedSportListResponse supportedSportListResponse) {
                SingleFieldBuilderV3<SupportedSportListResponse, SupportedSportListResponse.Builder, SupportedSportListResponseOrBuilder> singleFieldBuilderV3 = this.supportedSportListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    supportedSportListResponse.getClass();
                    this.supportedSportListResponse_ = supportedSportListResponse;
                } else {
                    singleFieldBuilderV3.setMessage(supportedSportListResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SportProfileSetupService) {
                    return mergeFrom((SportProfileSetupService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SportProfileSetupService sportProfileSetupService) {
                if (sportProfileSetupService == SportProfileSetupService.getDefaultInstance()) {
                    return this;
                }
                if (sportProfileSetupService.hasSupportedSportListRequest()) {
                    mergeSupportedSportListRequest(sportProfileSetupService.getSupportedSportListRequest());
                }
                if (sportProfileSetupService.hasSupportedSportListResponse()) {
                    mergeSupportedSportListResponse(sportProfileSetupService.getSupportedSportListResponse());
                }
                if (sportProfileSetupService.hasSelectedSportListNotification()) {
                    mergeSelectedSportListNotification(sportProfileSetupService.getSelectedSportListNotification());
                }
                mergeUnknownFields(sportProfileSetupService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SportProfileSetupService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SportProfileSetupService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SportProfileSetupService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SportProfileSetupService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SportProfileSetupService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SportProfileSetupService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SportProfileSetupService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SportProfileSetupService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SportProfileSetupService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SportProfileSetupService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SportProfileSetupService parseFrom(InputStream inputStream) {
            return (SportProfileSetupService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SportProfileSetupService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SportProfileSetupService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SportProfileSetupService parseFrom(CodedInputStream codedInputStream) {
            return (SportProfileSetupService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SportProfileSetupService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SportProfileSetupService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SupportedSportListResponse extends GeneratedMessageV3 implements SupportedSportListResponseOrBuilder {
        private static final SupportedSportListResponse DEFAULT_INSTANCE = new SupportedSportListResponse();

        @Deprecated
        public static final Parser<SupportedSportListResponse> PARSER = new AbstractParser<SupportedSportListResponse>() { // from class: com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponse.1
            @Override // com.google.protobuf.Parser
            public SupportedSportListResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SupportedSportListResponse.newBuilder();
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
        public static final int PROFILE_SETUP_COMPLETE_FIELD_NUMBER = 2;
        public static final int SPORT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean profileSetupComplete_;
        private List<Sport> sport_;

        private SupportedSportListResponse() {
            this.profileSetupComplete_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.sport_ = Collections.EMPTY_LIST;
        }

        public static SupportedSportListResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SupportedSportListResponse_descriptor;
        }

        public static Builder newBuilder(SupportedSportListResponse supportedSportListResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(supportedSportListResponse);
        }

        public static SupportedSportListResponse parseDelimitedFrom(InputStream inputStream) {
            return (SupportedSportListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SupportedSportListResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SupportedSportListResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SupportedSportListResponse)) {
                return super.equals(obj);
            }
            SupportedSportListResponse supportedSportListResponse = (SupportedSportListResponse) obj;
            if (getSportList().equals(supportedSportListResponse.getSportList()) && hasProfileSetupComplete() == supportedSportListResponse.hasProfileSetupComplete()) {
                return (!hasProfileSetupComplete() || getProfileSetupComplete() == supportedSportListResponse.getProfileSetupComplete()) && getUnknownFields().equals(supportedSportListResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SupportedSportListResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
        public boolean getProfileSetupComplete() {
            return this.profileSetupComplete_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = 0;
            for (int i15 = 0; i15 < this.sport_.size(); i15++) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(1, this.sport_.get(i15));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.profileSetupComplete_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
        public Sport getSport(int i14) {
            return this.sport_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
        public int getSportCount() {
            return this.sport_.size();
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
        public List<Sport> getSportList() {
            return this.sport_;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
        public SportOrBuilder getSportOrBuilder(int i14) {
            return this.sport_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
        public List<? extends SportOrBuilder> getSportOrBuilderList() {
            return this.sport_;
        }

        @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
        public boolean hasProfileSetupComplete() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSportCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSportList().hashCode();
            }
            if (hasProfileSetupComplete()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getProfileSetupComplete());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SupportedSportListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedSportListResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getSportCount(); i14++) {
                if (!getSport(i14).isInitialized()) {
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
            return new SupportedSportListResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.sport_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.sport_.get(i14));
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(2, this.profileSetupComplete_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportedSportListResponseOrBuilder {
            private int bitField0_;
            private boolean profileSetupComplete_;
            private RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> sportBuilder_;
            private List<Sport> sport_;

            private Builder() {
                this.sport_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SupportedSportListResponse supportedSportListResponse) {
                int i14;
                if ((this.bitField0_ & 2) != 0) {
                    supportedSportListResponse.profileSetupComplete_ = this.profileSetupComplete_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                supportedSportListResponse.bitField0_ = i14 | supportedSportListResponse.bitField0_;
            }

            private void buildPartialRepeatedFields(SupportedSportListResponse supportedSportListResponse) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    supportedSportListResponse.sport_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.sport_ = Collections.unmodifiableList(this.sport_);
                    this.bitField0_ &= -2;
                }
                supportedSportListResponse.sport_ = this.sport_;
            }

            private void ensureSportIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.sport_ = new ArrayList(this.sport_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SupportedSportListResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> getSportFieldBuilder() {
                if (this.sportBuilder_ == null) {
                    this.sportBuilder_ = new RepeatedFieldBuilderV3<>(this.sport_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.sport_ = null;
                }
                return this.sportBuilder_;
            }

            public Builder addAllSport(Iterable<? extends Sport> iterable) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureSportIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sport_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSport(Sport.Builder builder) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureSportIsMutable();
                this.sport_.add(builder.build());
                onChanged();
                return this;
            }

            public Sport.Builder addSportBuilder() {
                return (Sport.Builder) getSportFieldBuilder().addBuilder(Sport.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedSportListResponse build() {
                SupportedSportListResponse supportedSportListResponseBuildPartial = buildPartial();
                if (supportedSportListResponseBuildPartial.isInitialized()) {
                    return supportedSportListResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) supportedSportListResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedSportListResponse buildPartial() {
                SupportedSportListResponse supportedSportListResponse = new SupportedSportListResponse(this);
                buildPartialRepeatedFields(supportedSportListResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(supportedSportListResponse);
                }
                onBuilt();
                return supportedSportListResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.sport_ = Collections.EMPTY_LIST;
                } else {
                    this.sport_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                this.profileSetupComplete_ = false;
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

            public Builder clearProfileSetupComplete() {
                this.bitField0_ &= -3;
                this.profileSetupComplete_ = false;
                onChanged();
                return this;
            }

            public Builder clearSport() {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.sport_ = Collections.EMPTY_LIST;
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
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SupportedSportListResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
            public boolean getProfileSetupComplete() {
                return this.profileSetupComplete_;
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
            public Sport getSport(int i14) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sport_.get(i14) : (Sport) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Sport.Builder getSportBuilder(int i14) {
                return (Sport.Builder) getSportFieldBuilder().getBuilder(i14);
            }

            public List<Sport.Builder> getSportBuilderList() {
                return getSportFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
            public int getSportCount() {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sport_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
            public List<Sport> getSportList() {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.sport_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
            public SportOrBuilder getSportOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sport_.get(i14) : (SportOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
            public List<? extends SportOrBuilder> getSportOrBuilderList() {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.sport_);
            }

            @Override // com.garmin.proto.generated.GDISportProfileSetup.SupportedSportListResponseOrBuilder
            public boolean hasProfileSetupComplete() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISportProfileSetup.internal_static_GDI_Proto_SportProfileSetup_SupportedSportListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedSportListResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getSportCount(); i14++) {
                    if (!getSport(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(SupportedSportListResponse supportedSportListResponse) {
                if (supportedSportListResponse == SupportedSportListResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.sportBuilder_ == null) {
                    if (!supportedSportListResponse.sport_.isEmpty()) {
                        if (this.sport_.isEmpty()) {
                            this.sport_ = supportedSportListResponse.sport_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureSportIsMutable();
                            this.sport_.addAll(supportedSportListResponse.sport_);
                        }
                        onChanged();
                    }
                } else if (!supportedSportListResponse.sport_.isEmpty()) {
                    boolean zIsEmpty = this.sportBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.sportBuilder_ = null;
                        this.sport_ = supportedSportListResponse.sport_;
                        this.bitField0_ &= -2;
                        this.sportBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getSportFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(supportedSportListResponse.sport_);
                    }
                }
                if (supportedSportListResponse.hasProfileSetupComplete()) {
                    setProfileSetupComplete(supportedSportListResponse.getProfileSetupComplete());
                }
                mergeUnknownFields(supportedSportListResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeSport(int i14) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureSportIsMutable();
                this.sport_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setProfileSetupComplete(boolean z14) {
                this.profileSetupComplete_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSport(int i14, Sport.Builder builder) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureSportIsMutable();
                this.sport_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SupportedSportListResponse getDefaultInstanceForType() {
                return SupportedSportListResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sport_ = Collections.EMPTY_LIST;
            }

            public Sport.Builder addSportBuilder(int i14) {
                return (Sport.Builder) getSportFieldBuilder().addBuilder(i14, Sport.getDefaultInstance());
            }

            public Builder addSport(int i14, Sport sport) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sport.getClass();
                    ensureSportIsMutable();
                    this.sport_.add(i14, sport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, sport);
                return this;
            }

            public Builder setSport(int i14, Sport sport) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sport.getClass();
                    ensureSportIsMutable();
                    this.sport_.set(i14, sport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, sport);
                return this;
            }

            public Builder addSport(Sport sport) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sport.getClass();
                    ensureSportIsMutable();
                    this.sport_.add(sport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(sport);
                return this;
            }

            public Builder addSport(int i14, Sport.Builder builder) {
                RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSportIsMutable();
                    this.sport_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SupportedSportListResponse) {
                    return mergeFrom((SupportedSportListResponse) message);
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
                                    Sport sport = (Sport) codedInputStream.readMessage(Sport.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Sport, Sport.Builder, SportOrBuilder> repeatedFieldBuilderV3 = this.sportBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureSportIsMutable();
                                        this.sport_.add(sport);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(sport);
                                    }
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.profileSetupComplete_ = codedInputStream.readBool();
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
        public SupportedSportListResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SupportedSportListResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedSportListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedSportListResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SupportedSportListResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SupportedSportListResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SupportedSportListResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SupportedSportListResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SupportedSportListResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.profileSetupComplete_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SupportedSportListResponse parseFrom(InputStream inputStream) {
            return (SupportedSportListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SupportedSportListResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedSportListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ SupportedSportListResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SupportedSportListResponse parseFrom(CodedInputStream codedInputStream) {
            return (SupportedSportListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SupportedSportListResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedSportListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
