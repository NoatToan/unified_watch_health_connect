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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

/* JADX INFO: loaded from: classes13.dex */
public final class GDISwingSensorClubs {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019GDISwingSensorClubs.proto\u0012\u001aGDI.Proto.SwingSensorClubs\"¤\u0001\n\u0004Club\u0012\u0011\n\ttimestamp\u0018\u0001 \u0002(\u0004\u0012\u000f\n\u0007club_id\u0018\u0002 \u0002(\u0004\u0012\u0011\n\tclub_type\u0018\u0003 \u0002(\r\u0012\u0015\n\rclub_nickname\u0018\u0004 \u0002(\t\u0012\u0012\n\nshaft_flex\u0018\u0005 \u0002(\r\u0012\u0015\n\rlength_offset\u0018\u0006 \u0002(\u0002\u0012\u0011\n\tclub_loft\u0018\u0007 \u0002(\u0002\u0012\u0010\n\bclub_lie\u0018\b \u0002(\u0002\"\u001d\n\u001bClubListChangedNotification\"\u0014\n\u0012GetClubListRequest\"û\u0001\n\u0013GetClubListResponse\u0012N\n\u0006status\u0018\u0001 \u0002(\u000e2>.GDI.Proto.SwingSensorClubs.GetClubListResponse.ResponseStatus\u0012\u0016\n\u000eactive_club_id\u0018\u0002 \u0001(\u0004\u0012/\n\u0005clubs\u0018\u0003 \u0003(\u000b2 .GDI.Proto.SwingSensorClubs.Club\"K\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0014\n\u0010NO_REMOTE_DEVICE\u0010\u0002\"'\n\u0014SetActiveClubRequest\u0012\u000f\n\u0007club_id\u0018\u0001 \u0002(\u0004\"Ë\u0001\n\u0015SetActiveClubResponse\u0012P\n\u0006status\u0018\u0001 \u0002(\u000e2@.GDI.Proto.SwingSensorClubs.SetActiveClubResponse.ResponseStatus\"`\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0013\n\u000fINVALID_CLUB_ID\u0010\u0002\u0012\u0014\n\u0010NO_REMOTE_DEVICE\u0010\u0003B3\n\u001acom.garmin.proto.generatedB\u0013GDISwingSensorClubsH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorClubs_ClubListChangedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorClubs_ClubListChangedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorClubs_Club_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorClubs_Club_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorClubs_GetClubListRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorClubs_GetClubListRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorClubs_GetClubListResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorClubs_GetClubListResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubResponse_fieldAccessorTable;

    public interface ClubListChangedNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface ClubOrBuilder extends MessageOrBuilder {
        long getClubId();

        float getClubLie();

        float getClubLoft();

        String getClubNickname();

        ByteString getClubNicknameBytes();

        int getClubType();

        float getLengthOffset();

        int getShaftFlex();

        long getTimestamp();

        boolean hasClubId();

        boolean hasClubLie();

        boolean hasClubLoft();

        boolean hasClubNickname();

        boolean hasClubType();

        boolean hasLengthOffset();

        boolean hasShaftFlex();

        boolean hasTimestamp();
    }

    public interface GetClubListRequestOrBuilder extends MessageOrBuilder {
    }

    public interface GetClubListResponseOrBuilder extends MessageOrBuilder {
        long getActiveClubId();

        Club getClubs(int i14);

        int getClubsCount();

        List<Club> getClubsList();

        ClubOrBuilder getClubsOrBuilder(int i14);

        List<? extends ClubOrBuilder> getClubsOrBuilderList();

        GetClubListResponse.ResponseStatus getStatus();

        boolean hasActiveClubId();

        boolean hasStatus();
    }

    public interface SetActiveClubRequestOrBuilder extends MessageOrBuilder {
        long getClubId();

        boolean hasClubId();
    }

    public interface SetActiveClubResponseOrBuilder extends MessageOrBuilder {
        SetActiveClubResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SwingSensorClubs_Club_descriptor = descriptor2;
        internal_static_GDI_Proto_SwingSensorClubs_Club_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Timestamp", "ClubId", "ClubType", "ClubNickname", "ShaftFlex", "LengthOffset", "ClubLoft", "ClubLie"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_SwingSensorClubs_ClubListChangedNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_SwingSensorClubs_ClubListChangedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_SwingSensorClubs_GetClubListRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_SwingSensorClubs_GetClubListRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_SwingSensorClubs_GetClubListResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_SwingSensorClubs_GetClubListResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Status", "ActiveClubId", "Clubs"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"ClubId"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Status"});
    }

    private GDISwingSensorClubs() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class ClubListChangedNotification extends GeneratedMessageV3 implements ClubListChangedNotificationOrBuilder {
        private static final ClubListChangedNotification DEFAULT_INSTANCE = new ClubListChangedNotification();

        @Deprecated
        public static final Parser<ClubListChangedNotification> PARSER = new AbstractParser<ClubListChangedNotification>() { // from class: com.garmin.proto.generated.GDISwingSensorClubs.ClubListChangedNotification.1
            @Override // com.google.protobuf.Parser
            public ClubListChangedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ClubListChangedNotification.newBuilder();
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

        private ClubListChangedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ClubListChangedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_ClubListChangedNotification_descriptor;
        }

        public static Builder newBuilder(ClubListChangedNotification clubListChangedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(clubListChangedNotification);
        }

        public static ClubListChangedNotification parseDelimitedFrom(InputStream inputStream) {
            return (ClubListChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ClubListChangedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ClubListChangedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ClubListChangedNotification) {
                return getUnknownFields().equals(((ClubListChangedNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ClubListChangedNotification> getParserForType() {
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
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_ClubListChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ClubListChangedNotification.class, Builder.class);
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
            return new ClubListChangedNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClubListChangedNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_ClubListChangedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClubListChangedNotification build() {
                ClubListChangedNotification clubListChangedNotificationBuildPartial = buildPartial();
                if (clubListChangedNotificationBuildPartial.isInitialized()) {
                    return clubListChangedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) clubListChangedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClubListChangedNotification buildPartial() {
                ClubListChangedNotification clubListChangedNotification = new ClubListChangedNotification(this);
                onBuilt();
                return clubListChangedNotification;
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
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_ClubListChangedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_ClubListChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ClubListChangedNotification.class, Builder.class);
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
            public ClubListChangedNotification getDefaultInstanceForType() {
                return ClubListChangedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ClubListChangedNotification) {
                    return mergeFrom((ClubListChangedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ClubListChangedNotification clubListChangedNotification) {
                if (clubListChangedNotification == ClubListChangedNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(clubListChangedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ClubListChangedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ClubListChangedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ClubListChangedNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ClubListChangedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubListChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClubListChangedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ClubListChangedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ClubListChangedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ClubListChangedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ClubListChangedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ClubListChangedNotification parseFrom(InputStream inputStream) {
            return (ClubListChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ClubListChangedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubListChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClubListChangedNotification parseFrom(CodedInputStream codedInputStream) {
            return (ClubListChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ClubListChangedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubListChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetClubListRequest extends GeneratedMessageV3 implements GetClubListRequestOrBuilder {
        private static final GetClubListRequest DEFAULT_INSTANCE = new GetClubListRequest();

        @Deprecated
        public static final Parser<GetClubListRequest> PARSER = new AbstractParser<GetClubListRequest>() { // from class: com.garmin.proto.generated.GDISwingSensorClubs.GetClubListRequest.1
            @Override // com.google.protobuf.Parser
            public GetClubListRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetClubListRequest.newBuilder();
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

        private GetClubListRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetClubListRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_GetClubListRequest_descriptor;
        }

        public static Builder newBuilder(GetClubListRequest getClubListRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getClubListRequest);
        }

        public static GetClubListRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetClubListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetClubListRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetClubListRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof GetClubListRequest) {
                return getUnknownFields().equals(((GetClubListRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetClubListRequest> getParserForType() {
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
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_GetClubListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetClubListRequest.class, Builder.class);
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
            return new GetClubListRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetClubListRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_GetClubListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetClubListRequest build() {
                GetClubListRequest getClubListRequestBuildPartial = buildPartial();
                if (getClubListRequestBuildPartial.isInitialized()) {
                    return getClubListRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getClubListRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetClubListRequest buildPartial() {
                GetClubListRequest getClubListRequest = new GetClubListRequest(this);
                onBuilt();
                return getClubListRequest;
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
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_GetClubListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_GetClubListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetClubListRequest.class, Builder.class);
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
            public GetClubListRequest getDefaultInstanceForType() {
                return GetClubListRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetClubListRequest) {
                    return mergeFrom((GetClubListRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetClubListRequest getClubListRequest) {
                if (getClubListRequest == GetClubListRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(getClubListRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetClubListRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GetClubListRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GetClubListRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetClubListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetClubListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetClubListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetClubListRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetClubListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetClubListRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetClubListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetClubListRequest parseFrom(InputStream inputStream) {
            return (GetClubListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetClubListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetClubListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetClubListRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetClubListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetClubListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetClubListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetActiveClubRequest extends GeneratedMessageV3 implements SetActiveClubRequestOrBuilder {
        public static final int CLUB_ID_FIELD_NUMBER = 1;
        private static final SetActiveClubRequest DEFAULT_INSTANCE = new SetActiveClubRequest();

        @Deprecated
        public static final Parser<SetActiveClubRequest> PARSER = new AbstractParser<SetActiveClubRequest>() { // from class: com.garmin.proto.generated.GDISwingSensorClubs.SetActiveClubRequest.1
            @Override // com.google.protobuf.Parser
            public SetActiveClubRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetActiveClubRequest.newBuilder();
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
        private long clubId_;
        private byte memoizedIsInitialized;

        private SetActiveClubRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.clubId_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetActiveClubRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubRequest_descriptor;
        }

        public static Builder newBuilder(SetActiveClubRequest setActiveClubRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setActiveClubRequest);
        }

        public static SetActiveClubRequest parseDelimitedFrom(InputStream inputStream) {
            return (SetActiveClubRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetActiveClubRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetActiveClubRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetActiveClubRequest)) {
                return super.equals(obj);
            }
            SetActiveClubRequest setActiveClubRequest = (SetActiveClubRequest) obj;
            if (hasClubId() != setActiveClubRequest.hasClubId()) {
                return false;
            }
            return (!hasClubId() || getClubId() == setActiveClubRequest.getClubId()) && getUnknownFields().equals(setActiveClubRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.SetActiveClubRequestOrBuilder
        public long getClubId() {
            return this.clubId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetActiveClubRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.clubId_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.SetActiveClubRequestOrBuilder
        public boolean hasClubId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasClubId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getClubId());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetActiveClubRequest.class, Builder.class);
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
            if (hasClubId()) {
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
            return new SetActiveClubRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(1, this.clubId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetActiveClubRequestOrBuilder {
            private int bitField0_;
            private long clubId_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SetActiveClubRequest setActiveClubRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    setActiveClubRequest.clubId_ = this.clubId_;
                } else {
                    i14 = 0;
                }
                setActiveClubRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetActiveClubRequest build() {
                SetActiveClubRequest setActiveClubRequestBuildPartial = buildPartial();
                if (setActiveClubRequestBuildPartial.isInitialized()) {
                    return setActiveClubRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setActiveClubRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetActiveClubRequest buildPartial() {
                SetActiveClubRequest setActiveClubRequest = new SetActiveClubRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setActiveClubRequest);
                }
                onBuilt();
                return setActiveClubRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.clubId_ = 0L;
                return this;
            }

            public Builder clearClubId() {
                this.bitField0_ &= -2;
                this.clubId_ = 0L;
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

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.SetActiveClubRequestOrBuilder
            public long getClubId() {
                return this.clubId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.SetActiveClubRequestOrBuilder
            public boolean hasClubId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetActiveClubRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasClubId();
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
                                    this.clubId_ = codedInputStream.readUInt64();
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

            public Builder setClubId(long j8) {
                this.clubId_ = j8;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SetActiveClubRequest getDefaultInstanceForType() {
                return SetActiveClubRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetActiveClubRequest) {
                    return mergeFrom((SetActiveClubRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetActiveClubRequest setActiveClubRequest) {
                if (setActiveClubRequest == SetActiveClubRequest.getDefaultInstance()) {
                    return this;
                }
                if (setActiveClubRequest.hasClubId()) {
                    setClubId(setActiveClubRequest.getClubId());
                }
                mergeUnknownFields(setActiveClubRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetActiveClubRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetActiveClubRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetActiveClubRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetActiveClubRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetActiveClubRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ SetActiveClubRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetActiveClubRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private SetActiveClubRequest() {
            this.clubId_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetActiveClubRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetActiveClubRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetActiveClubRequest parseFrom(InputStream inputStream) {
            return (SetActiveClubRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetActiveClubRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetActiveClubRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetActiveClubRequest parseFrom(CodedInputStream codedInputStream) {
            return (SetActiveClubRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetActiveClubRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetActiveClubRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Club extends GeneratedMessageV3 implements ClubOrBuilder {
        public static final int CLUB_ID_FIELD_NUMBER = 2;
        public static final int CLUB_LIE_FIELD_NUMBER = 8;
        public static final int CLUB_LOFT_FIELD_NUMBER = 7;
        public static final int CLUB_NICKNAME_FIELD_NUMBER = 4;
        public static final int CLUB_TYPE_FIELD_NUMBER = 3;
        public static final int LENGTH_OFFSET_FIELD_NUMBER = 6;
        public static final int SHAFT_FLEX_FIELD_NUMBER = 5;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long clubId_;
        private float clubLie_;
        private float clubLoft_;
        private volatile Object clubNickname_;
        private int clubType_;
        private float lengthOffset_;
        private byte memoizedIsInitialized;
        private int shaftFlex_;
        private long timestamp_;
        private static final Club DEFAULT_INSTANCE = new Club();

        @Deprecated
        public static final Parser<Club> PARSER = new AbstractParser<Club>() { // from class: com.garmin.proto.generated.GDISwingSensorClubs.Club.1
            @Override // com.google.protobuf.Parser
            public Club parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Club.newBuilder();
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

        private Club() {
            this.timestamp_ = 0L;
            this.clubId_ = 0L;
            this.clubType_ = 0;
            this.clubNickname_ = "";
            this.shaftFlex_ = 0;
            this.lengthOffset_ = 0.0f;
            this.clubLoft_ = 0.0f;
            this.clubLie_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
            this.clubNickname_ = "";
        }

        public static Club getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_Club_descriptor;
        }

        public static Builder newBuilder(Club club) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(club);
        }

        public static Club parseDelimitedFrom(InputStream inputStream) {
            return (Club) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Club parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Club> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Club)) {
                return super.equals(obj);
            }
            Club club = (Club) obj;
            if (hasTimestamp() != club.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && getTimestamp() != club.getTimestamp()) || hasClubId() != club.hasClubId()) {
                return false;
            }
            if ((hasClubId() && getClubId() != club.getClubId()) || hasClubType() != club.hasClubType()) {
                return false;
            }
            if ((hasClubType() && getClubType() != club.getClubType()) || hasClubNickname() != club.hasClubNickname()) {
                return false;
            }
            if ((hasClubNickname() && !getClubNickname().equals(club.getClubNickname())) || hasShaftFlex() != club.hasShaftFlex()) {
                return false;
            }
            if ((hasShaftFlex() && getShaftFlex() != club.getShaftFlex()) || hasLengthOffset() != club.hasLengthOffset()) {
                return false;
            }
            if ((hasLengthOffset() && Float.floatToIntBits(getLengthOffset()) != Float.floatToIntBits(club.getLengthOffset())) || hasClubLoft() != club.hasClubLoft()) {
                return false;
            }
            if ((!hasClubLoft() || Float.floatToIntBits(getClubLoft()) == Float.floatToIntBits(club.getClubLoft())) && hasClubLie() == club.hasClubLie()) {
                return (!hasClubLie() || Float.floatToIntBits(getClubLie()) == Float.floatToIntBits(club.getClubLie())) && getUnknownFields().equals(club.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public long getClubId() {
            return this.clubId_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public float getClubLie() {
            return this.clubLie_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public float getClubLoft() {
            return this.clubLoft_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public String getClubNickname() {
            Object obj = this.clubNickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.clubNickname_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public ByteString getClubNicknameBytes() {
            Object obj = this.clubNickname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.clubNickname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public int getClubType() {
            return this.clubType_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public float getLengthOffset() {
            return this.lengthOffset_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Club> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.timestamp_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt64Size(2, this.clubId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(3, this.clubType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt64Size += GeneratedMessageV3.computeStringSize(4, this.clubNickname_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(5, this.shaftFlex_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeFloatSize(6, this.lengthOffset_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeFloatSize(7, this.clubLoft_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeFloatSize(8, this.clubLie_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public int getShaftFlex() {
            return this.shaftFlex_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public boolean hasClubId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public boolean hasClubLie() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public boolean hasClubLoft() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public boolean hasClubNickname() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public boolean hasClubType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public boolean hasLengthOffset() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public boolean hasShaftFlex() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getTimestamp());
            }
            if (hasClubId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getClubId());
            }
            if (hasClubType()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getClubType();
            }
            if (hasClubNickname()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getClubNickname().hashCode();
            }
            if (hasShaftFlex()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getShaftFlex();
            }
            if (hasLengthOffset()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Float.floatToIntBits(getLengthOffset());
            }
            if (hasClubLoft()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Float.floatToIntBits(getClubLoft());
            }
            if (hasClubLie()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Float.floatToIntBits(getClubLie());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_Club_fieldAccessorTable.ensureFieldAccessorsInitialized(Club.class, Builder.class);
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
            if (!hasTimestamp()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasClubId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasClubType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasClubNickname()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasShaftFlex()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLengthOffset()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasClubLoft()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasClubLie()) {
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
            return new Club();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(1, this.timestamp_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.clubId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.clubType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.clubNickname_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.shaftFlex_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeFloat(6, this.lengthOffset_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeFloat(7, this.clubLoft_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeFloat(8, this.clubLie_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClubOrBuilder {
            private int bitField0_;
            private long clubId_;
            private float clubLie_;
            private float clubLoft_;
            private Object clubNickname_;
            private int clubType_;
            private float lengthOffset_;
            private int shaftFlex_;
            private long timestamp_;

            private Builder() {
                this.clubNickname_ = "";
            }

            private void buildPartial0(Club club) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    club.timestamp_ = this.timestamp_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    club.clubId_ = this.clubId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    club.clubType_ = this.clubType_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    club.clubNickname_ = this.clubNickname_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    club.shaftFlex_ = this.shaftFlex_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    club.lengthOffset_ = this.lengthOffset_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    club.clubLoft_ = this.clubLoft_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    club.clubLie_ = this.clubLie_;
                    i14 |= 128;
                }
                club.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_Club_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Club build() {
                Club clubBuildPartial = buildPartial();
                if (clubBuildPartial.isInitialized()) {
                    return clubBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) clubBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Club buildPartial() {
                Club club = new Club(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(club);
                }
                onBuilt();
                return club;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.timestamp_ = 0L;
                this.clubId_ = 0L;
                this.clubType_ = 0;
                this.clubNickname_ = "";
                this.shaftFlex_ = 0;
                this.lengthOffset_ = 0.0f;
                this.clubLoft_ = 0.0f;
                this.clubLie_ = 0.0f;
                return this;
            }

            public Builder clearClubId() {
                this.bitField0_ &= -3;
                this.clubId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearClubLie() {
                this.bitField0_ &= -129;
                this.clubLie_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearClubLoft() {
                this.bitField0_ &= -65;
                this.clubLoft_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearClubNickname() {
                this.clubNickname_ = Club.getDefaultInstance().getClubNickname();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearClubType() {
                this.bitField0_ &= -5;
                this.clubType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLengthOffset() {
                this.bitField0_ &= -33;
                this.lengthOffset_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearShaftFlex() {
                this.bitField0_ &= -17;
                this.shaftFlex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -2;
                this.timestamp_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public long getClubId() {
                return this.clubId_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public float getClubLie() {
                return this.clubLie_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public float getClubLoft() {
                return this.clubLoft_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public String getClubNickname() {
                Object obj = this.clubNickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.clubNickname_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public ByteString getClubNicknameBytes() {
                Object obj = this.clubNickname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.clubNickname_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public int getClubType() {
                return this.clubType_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_Club_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public float getLengthOffset() {
                return this.lengthOffset_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public int getShaftFlex() {
                return this.shaftFlex_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public boolean hasClubId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public boolean hasClubLie() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public boolean hasClubLoft() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public boolean hasClubNickname() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public boolean hasClubType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public boolean hasLengthOffset() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public boolean hasShaftFlex() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.ClubOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_Club_fieldAccessorTable.ensureFieldAccessorsInitialized(Club.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTimestamp() && hasClubId() && hasClubType() && hasClubNickname() && hasShaftFlex() && hasLengthOffset() && hasClubLoft() && hasClubLie();
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
                                    this.timestamp_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.clubId_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.clubType_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.clubNickname_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.shaftFlex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 53) {
                                    this.lengthOffset_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 32;
                                } else if (tag == 61) {
                                    this.clubLoft_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 64;
                                } else if (tag == 69) {
                                    this.clubLie_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 128;
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

            public Builder setClubId(long j8) {
                this.clubId_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setClubLie(float f14) {
                this.clubLie_ = f14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setClubLoft(float f14) {
                this.clubLoft_ = f14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setClubNickname(String str) {
                str.getClass();
                this.clubNickname_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setClubNicknameBytes(ByteString byteString) {
                byteString.getClass();
                this.clubNickname_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setClubType(int i14) {
                this.clubType_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLengthOffset(float f14) {
                this.lengthOffset_ = f14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setShaftFlex(int i14) {
                this.shaftFlex_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTimestamp(long j8) {
                this.timestamp_ = j8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Club getDefaultInstanceForType() {
                return Club.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.clubNickname_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Club) {
                    return mergeFrom((Club) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Club club) {
                if (club == Club.getDefaultInstance()) {
                    return this;
                }
                if (club.hasTimestamp()) {
                    setTimestamp(club.getTimestamp());
                }
                if (club.hasClubId()) {
                    setClubId(club.getClubId());
                }
                if (club.hasClubType()) {
                    setClubType(club.getClubType());
                }
                if (club.hasClubNickname()) {
                    this.clubNickname_ = club.clubNickname_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (club.hasShaftFlex()) {
                    setShaftFlex(club.getShaftFlex());
                }
                if (club.hasLengthOffset()) {
                    setLengthOffset(club.getLengthOffset());
                }
                if (club.hasClubLoft()) {
                    setClubLoft(club.getClubLoft());
                }
                if (club.hasClubLie()) {
                    setClubLie(club.getClubLie());
                }
                mergeUnknownFields(club.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Club getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Club parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Club) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Club parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Club parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Club parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Club parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Club parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Club parseFrom(InputStream inputStream) {
            return (Club) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Club parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Club) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Club parseFrom(CodedInputStream codedInputStream) {
            return (Club) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Club parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Club) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Club(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.timestamp_ = 0L;
            this.clubId_ = 0L;
            this.clubType_ = 0;
            this.clubNickname_ = "";
            this.shaftFlex_ = 0;
            this.lengthOffset_ = 0.0f;
            this.clubLoft_ = 0.0f;
            this.clubLie_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ Club(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class GetClubListResponse extends GeneratedMessageV3 implements GetClubListResponseOrBuilder {
        public static final int ACTIVE_CLUB_ID_FIELD_NUMBER = 2;
        public static final int CLUBS_FIELD_NUMBER = 3;
        private static final GetClubListResponse DEFAULT_INSTANCE = new GetClubListResponse();

        @Deprecated
        public static final Parser<GetClubListResponse> PARSER = new AbstractParser<GetClubListResponse>() { // from class: com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponse.1
            @Override // com.google.protobuf.Parser
            public GetClubListResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetClubListResponse.newBuilder();
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
        private long activeClubId_;
        private int bitField0_;
        private List<Club> clubs_;
        private byte memoizedIsInitialized;
        private int status_;

        private GetClubListResponse() {
            this.activeClubId_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.clubs_ = Collections.EMPTY_LIST;
        }

        public static GetClubListResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_GetClubListResponse_descriptor;
        }

        public static Builder newBuilder(GetClubListResponse getClubListResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getClubListResponse);
        }

        public static GetClubListResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetClubListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetClubListResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetClubListResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetClubListResponse)) {
                return super.equals(obj);
            }
            GetClubListResponse getClubListResponse = (GetClubListResponse) obj;
            if (hasStatus() != getClubListResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == getClubListResponse.status_) && hasActiveClubId() == getClubListResponse.hasActiveClubId()) {
                return (!hasActiveClubId() || getActiveClubId() == getClubListResponse.getActiveClubId()) && getClubsList().equals(getClubListResponse.getClubsList()) && getUnknownFields().equals(getClubListResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
        public long getActiveClubId() {
            return this.activeClubId_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
        public Club getClubs(int i14) {
            return this.clubs_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
        public int getClubsCount() {
            return this.clubs_.size();
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
        public List<Club> getClubsList() {
            return this.clubs_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
        public ClubOrBuilder getClubsOrBuilder(int i14) {
            return this.clubs_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
        public List<? extends ClubOrBuilder> getClubsOrBuilderList() {
            return this.clubs_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetClubListResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeUInt64Size(2, this.activeClubId_);
            }
            for (int i15 = 0; i15 < this.clubs_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, this.clubs_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
        public boolean hasActiveClubId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
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
            if (hasActiveClubId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getActiveClubId());
            }
            if (getClubsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getClubsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_GetClubListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetClubListResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getClubsCount(); i14++) {
                if (!getClubs(i14).isInitialized()) {
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
            return new GetClubListResponse();
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
                codedOutputStream.writeUInt64(2, this.activeClubId_);
            }
            for (int i14 = 0; i14 < this.clubs_.size(); i14++) {
                codedOutputStream.writeMessage(3, this.clubs_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetClubListResponseOrBuilder {
            private long activeClubId_;
            private int bitField0_;
            private RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> clubsBuilder_;
            private List<Club> clubs_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.clubs_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(GetClubListResponse getClubListResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    getClubListResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    getClubListResponse.activeClubId_ = this.activeClubId_;
                    i14 |= 2;
                }
                getClubListResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(GetClubListResponse getClubListResponse) {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    getClubListResponse.clubs_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.clubs_ = Collections.unmodifiableList(this.clubs_);
                    this.bitField0_ &= -5;
                }
                getClubListResponse.clubs_ = this.clubs_;
            }

            private void ensureClubsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.clubs_ = new ArrayList(this.clubs_);
                    this.bitField0_ |= 4;
                }
            }

            private RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> getClubsFieldBuilder() {
                if (this.clubsBuilder_ == null) {
                    this.clubsBuilder_ = new RepeatedFieldBuilderV3<>(this.clubs_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.clubs_ = null;
                }
                return this.clubsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_GetClubListResponse_descriptor;
            }

            public Builder addAllClubs(Iterable<? extends Club> iterable) {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureClubsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.clubs_);
                onChanged();
                return this;
            }

            public Builder addClubs(Club.Builder builder) {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureClubsIsMutable();
                this.clubs_.add(builder.build());
                onChanged();
                return this;
            }

            public Club.Builder addClubsBuilder() {
                return (Club.Builder) getClubsFieldBuilder().addBuilder(Club.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetClubListResponse build() {
                GetClubListResponse getClubListResponseBuildPartial = buildPartial();
                if (getClubListResponseBuildPartial.isInitialized()) {
                    return getClubListResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getClubListResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetClubListResponse buildPartial() {
                GetClubListResponse getClubListResponse = new GetClubListResponse(this);
                buildPartialRepeatedFields(getClubListResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(getClubListResponse);
                }
                onBuilt();
                return getClubListResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.activeClubId_ = 0L;
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.clubs_ = Collections.EMPTY_LIST;
                } else {
                    this.clubs_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public Builder clearActiveClubId() {
                this.bitField0_ &= -3;
                this.activeClubId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearClubs() {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.clubs_ = Collections.EMPTY_LIST;
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

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
            public long getActiveClubId() {
                return this.activeClubId_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
            public Club getClubs(int i14) {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.clubs_.get(i14) : (Club) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Club.Builder getClubsBuilder(int i14) {
                return (Club.Builder) getClubsFieldBuilder().getBuilder(i14);
            }

            public List<Club.Builder> getClubsBuilderList() {
                return getClubsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
            public int getClubsCount() {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.clubs_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
            public List<Club> getClubsList() {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.clubs_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
            public ClubOrBuilder getClubsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.clubs_.get(i14) : (ClubOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
            public List<? extends ClubOrBuilder> getClubsOrBuilderList() {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.clubs_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_GetClubListResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
            public boolean hasActiveClubId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_GetClubListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetClubListResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasStatus()) {
                    return false;
                }
                for (int i14 = 0; i14 < getClubsCount(); i14++) {
                    if (!getClubs(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(GetClubListResponse getClubListResponse) {
                if (getClubListResponse == GetClubListResponse.getDefaultInstance()) {
                    return this;
                }
                if (getClubListResponse.hasStatus()) {
                    setStatus(getClubListResponse.getStatus());
                }
                if (getClubListResponse.hasActiveClubId()) {
                    setActiveClubId(getClubListResponse.getActiveClubId());
                }
                if (this.clubsBuilder_ == null) {
                    if (!getClubListResponse.clubs_.isEmpty()) {
                        if (this.clubs_.isEmpty()) {
                            this.clubs_ = getClubListResponse.clubs_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureClubsIsMutable();
                            this.clubs_.addAll(getClubListResponse.clubs_);
                        }
                        onChanged();
                    }
                } else if (!getClubListResponse.clubs_.isEmpty()) {
                    boolean zIsEmpty = this.clubsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.clubsBuilder_ = null;
                        this.clubs_ = getClubListResponse.clubs_;
                        this.bitField0_ &= -5;
                        this.clubsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getClubsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(getClubListResponse.clubs_);
                    }
                }
                mergeUnknownFields(getClubListResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeClubs(int i14) {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureClubsIsMutable();
                this.clubs_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setActiveClubId(long j8) {
                this.activeClubId_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setClubs(int i14, Club.Builder builder) {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureClubsIsMutable();
                this.clubs_.set(i14, builder.build());
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
            public GetClubListResponse getDefaultInstanceForType() {
                return GetClubListResponse.getDefaultInstance();
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
                this.clubs_ = Collections.EMPTY_LIST;
            }

            public Club.Builder addClubsBuilder(int i14) {
                return (Club.Builder) getClubsFieldBuilder().addBuilder(i14, Club.getDefaultInstance());
            }

            public Builder addClubs(int i14, Club club) {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    club.getClass();
                    ensureClubsIsMutable();
                    this.clubs_.add(i14, club);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, club);
                return this;
            }

            public Builder setClubs(int i14, Club club) {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    club.getClass();
                    ensureClubsIsMutable();
                    this.clubs_.set(i14, club);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, club);
                return this;
            }

            public Builder addClubs(Club club) {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    club.getClass();
                    ensureClubsIsMutable();
                    this.clubs_.add(club);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(club);
                return this;
            }

            public Builder addClubs(int i14, Club.Builder builder) {
                RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureClubsIsMutable();
                    this.clubs_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetClubListResponse) {
                    return mergeFrom((GetClubListResponse) message);
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
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.activeClubId_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Club club = (Club) codedInputStream.readMessage(Club.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Club, Club.Builder, ClubOrBuilder> repeatedFieldBuilderV3 = this.clubsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureClubsIsMutable();
                                        this.clubs_.add(club);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(club);
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
        public GetClubListResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetClubListResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetClubListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetClubListResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetClubListResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetClubListResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetClubListResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetClubListResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetClubListResponse parseFrom(InputStream inputStream) {
            return (GetClubListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetClubListResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetClubListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private GetClubListResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.activeClubId_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetClubListResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetClubListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetClubListResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetClubListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ GetClubListResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(1),
            NO_REMOTE_DEVICE(2);

            public static final int NO_REMOTE_DEVICE_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDISwingSensorClubs.GetClubListResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return NO_REMOTE_DEVICE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return GetClubListResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class SetActiveClubResponse extends GeneratedMessageV3 implements SetActiveClubResponseOrBuilder {
        private static final SetActiveClubResponse DEFAULT_INSTANCE = new SetActiveClubResponse();

        @Deprecated
        public static final Parser<SetActiveClubResponse> PARSER = new AbstractParser<SetActiveClubResponse>() { // from class: com.garmin.proto.generated.GDISwingSensorClubs.SetActiveClubResponse.1
            @Override // com.google.protobuf.Parser
            public SetActiveClubResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetActiveClubResponse.newBuilder();
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

        private SetActiveClubResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetActiveClubResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubResponse_descriptor;
        }

        public static Builder newBuilder(SetActiveClubResponse setActiveClubResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setActiveClubResponse);
        }

        public static SetActiveClubResponse parseDelimitedFrom(InputStream inputStream) {
            return (SetActiveClubResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetActiveClubResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetActiveClubResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetActiveClubResponse)) {
                return super.equals(obj);
            }
            SetActiveClubResponse setActiveClubResponse = (SetActiveClubResponse) obj;
            if (hasStatus() != setActiveClubResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == setActiveClubResponse.status_) && getUnknownFields().equals(setActiveClubResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetActiveClubResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.SetActiveClubResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorClubs.SetActiveClubResponseOrBuilder
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
            return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetActiveClubResponse.class, Builder.class);
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
            return new SetActiveClubResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetActiveClubResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SetActiveClubResponse setActiveClubResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    setActiveClubResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                setActiveClubResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetActiveClubResponse build() {
                SetActiveClubResponse setActiveClubResponseBuildPartial = buildPartial();
                if (setActiveClubResponseBuildPartial.isInitialized()) {
                    return setActiveClubResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setActiveClubResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetActiveClubResponse buildPartial() {
                SetActiveClubResponse setActiveClubResponse = new SetActiveClubResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setActiveClubResponse);
                }
                onBuilt();
                return setActiveClubResponse;
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
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.SetActiveClubResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorClubs.SetActiveClubResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorClubs.internal_static_GDI_Proto_SwingSensorClubs_SetActiveClubResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetActiveClubResponse.class, Builder.class);
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
            public SetActiveClubResponse getDefaultInstanceForType() {
                return SetActiveClubResponse.getDefaultInstance();
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
                if (message instanceof SetActiveClubResponse) {
                    return mergeFrom((SetActiveClubResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetActiveClubResponse setActiveClubResponse) {
                if (setActiveClubResponse == SetActiveClubResponse.getDefaultInstance()) {
                    return this;
                }
                if (setActiveClubResponse.hasStatus()) {
                    setStatus(setActiveClubResponse.getStatus());
                }
                mergeUnknownFields(setActiveClubResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetActiveClubResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetActiveClubResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetActiveClubResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetActiveClubResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SetActiveClubResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SetActiveClubResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SetActiveClubResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetActiveClubResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetActiveClubResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetActiveClubResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetActiveClubResponse parseFrom(InputStream inputStream) {
            return (SetActiveClubResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetActiveClubResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetActiveClubResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetActiveClubResponse parseFrom(CodedInputStream codedInputStream) {
            return (SetActiveClubResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetActiveClubResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetActiveClubResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(1),
            INVALID_CLUB_ID(2),
            NO_REMOTE_DEVICE(3);

            public static final int INVALID_CLUB_ID_VALUE = 2;
            public static final int NO_REMOTE_DEVICE_VALUE = 3;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDISwingSensorClubs.SetActiveClubResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 == 2) {
                    return INVALID_CLUB_ID;
                }
                if (i14 != 3) {
                    return null;
                }
                return NO_REMOTE_DEVICE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SetActiveClubResponse.getDescriptor().getEnumTypes().get(0);
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
