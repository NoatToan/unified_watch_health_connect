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
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class GDISwingSensorUserSettings {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n GDISwingSensorUserSettings.proto\u0012!GDI.Proto.SwingSensorUserSettings\"£\u0002\n\fUserSettings\u0012F\n\u0006gender\u0018\u0001 \u0001(\u000e26.GDI.Proto.SwingSensorUserSettings.UserSettings.Gender\u0012N\n\nhandedness\u0018\u0002 \u0001(\u000e2:.GDI.Proto.SwingSensorUserSettings.UserSettings.Handedness\"2\n\u0006Gender\u0012\u0012\n\u000eUNKNOWN_GENDER\u0010\u0000\u0012\b\n\u0004MALE\u0010\u0001\u0012\n\n\u0006FEMALE\u0010\u0002\"G\n\nHandedness\u0012\u0016\n\u0012UNKNOWN_HANDEDNESS\u0010\u0000\u0012\u000f\n\u000bLEFT_HANDED\u0010\u0001\u0012\u0010\n\fRIGHT_HANDED\u0010\u0002\"\u0018\n\u0016GetUserSettingsRequest\"a\n\u0017GetUserSettingsResponse\u0012F\n\ruser_settings\u0018\u0001 \u0002(\u000b2/.GDI.Proto.SwingSensorUserSettings.UserSettings\"`\n\u0016SetUserSettingsRequest\u0012F\n\ruser_settings\u0018\u0001 \u0002(\u000b2/.GDI.Proto.SwingSensorUserSettings.UserSettings\"Á\u0001\n\u0017SetUserSettingsResponse\u0012Y\n\u0006status\u0018\u0001 \u0002(\u000e2I.GDI.Proto.SwingSensorUserSettings.SetUserSettingsResponse.ResponseStatus\"K\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0014\n\u0010NO_REMOTE_DEVICE\u0010\u0002B:\n\u001acom.garmin.proto.generatedB\u001aGDISwingSensorUserSettingsH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorUserSettings_UserSettings_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorUserSettings_UserSettings_fieldAccessorTable;

    public interface GetUserSettingsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface GetUserSettingsResponseOrBuilder extends MessageOrBuilder {
        UserSettings getUserSettings();

        UserSettingsOrBuilder getUserSettingsOrBuilder();

        boolean hasUserSettings();
    }

    public interface SetUserSettingsRequestOrBuilder extends MessageOrBuilder {
        UserSettings getUserSettings();

        UserSettingsOrBuilder getUserSettingsOrBuilder();

        boolean hasUserSettings();
    }

    public interface SetUserSettingsResponseOrBuilder extends MessageOrBuilder {
        SetUserSettingsResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface UserSettingsOrBuilder extends MessageOrBuilder {
        UserSettings.Gender getGender();

        UserSettings.Handedness getHandedness();

        boolean hasGender();

        boolean hasHandedness();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SwingSensorUserSettings_UserSettings_descriptor = descriptor2;
        internal_static_GDI_Proto_SwingSensorUserSettings_UserSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Gender", "Handedness"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"UserSettings"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"UserSettings"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
    }

    private GDISwingSensorUserSettings() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class GetUserSettingsRequest extends GeneratedMessageV3 implements GetUserSettingsRequestOrBuilder {
        private static final GetUserSettingsRequest DEFAULT_INSTANCE = new GetUserSettingsRequest();

        @Deprecated
        public static final Parser<GetUserSettingsRequest> PARSER = new AbstractParser<GetUserSettingsRequest>() { // from class: com.garmin.proto.generated.GDISwingSensorUserSettings.GetUserSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public GetUserSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetUserSettingsRequest.newBuilder();
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

        private GetUserSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetUserSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsRequest_descriptor;
        }

        public static Builder newBuilder(GetUserSettingsRequest getUserSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getUserSettingsRequest);
        }

        public static GetUserSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetUserSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetUserSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetUserSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof GetUserSettingsRequest) {
                return getUnknownFields().equals(((GetUserSettingsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetUserSettingsRequest> getParserForType() {
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
            return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetUserSettingsRequest.class, Builder.class);
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
            return new GetUserSettingsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetUserSettingsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetUserSettingsRequest build() {
                GetUserSettingsRequest getUserSettingsRequestBuildPartial = buildPartial();
                if (getUserSettingsRequestBuildPartial.isInitialized()) {
                    return getUserSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getUserSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetUserSettingsRequest buildPartial() {
                GetUserSettingsRequest getUserSettingsRequest = new GetUserSettingsRequest(this);
                onBuilt();
                return getUserSettingsRequest;
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
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetUserSettingsRequest.class, Builder.class);
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
            public GetUserSettingsRequest getDefaultInstanceForType() {
                return GetUserSettingsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetUserSettingsRequest) {
                    return mergeFrom((GetUserSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetUserSettingsRequest getUserSettingsRequest) {
                if (getUserSettingsRequest == GetUserSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(getUserSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetUserSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GetUserSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GetUserSettingsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetUserSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetUserSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetUserSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetUserSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetUserSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetUserSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetUserSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetUserSettingsRequest parseFrom(InputStream inputStream) {
            return (GetUserSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetUserSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetUserSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetUserSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetUserSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetUserSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetUserSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetUserSettingsResponse extends GeneratedMessageV3 implements GetUserSettingsResponseOrBuilder {
        private static final GetUserSettingsResponse DEFAULT_INSTANCE = new GetUserSettingsResponse();

        @Deprecated
        public static final Parser<GetUserSettingsResponse> PARSER = new AbstractParser<GetUserSettingsResponse>() { // from class: com.garmin.proto.generated.GDISwingSensorUserSettings.GetUserSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public GetUserSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetUserSettingsResponse.newBuilder();
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
        public static final int USER_SETTINGS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private UserSettings userSettings_;

        private GetUserSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetUserSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsResponse_descriptor;
        }

        public static Builder newBuilder(GetUserSettingsResponse getUserSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getUserSettingsResponse);
        }

        public static GetUserSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetUserSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetUserSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetUserSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetUserSettingsResponse)) {
                return super.equals(obj);
            }
            GetUserSettingsResponse getUserSettingsResponse = (GetUserSettingsResponse) obj;
            if (hasUserSettings() != getUserSettingsResponse.hasUserSettings()) {
                return false;
            }
            return (!hasUserSettings() || getUserSettings().equals(getUserSettingsResponse.getUserSettings())) && getUnknownFields().equals(getUserSettingsResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetUserSettingsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUserSettings()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder
        public UserSettings getUserSettings() {
            UserSettings userSettings = this.userSettings_;
            return userSettings == null ? UserSettings.getDefaultInstance() : userSettings;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder
        public UserSettingsOrBuilder getUserSettingsOrBuilder() {
            UserSettings userSettings = this.userSettings_;
            return userSettings == null ? UserSettings.getDefaultInstance() : userSettings;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder
        public boolean hasUserSettings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUserSettings()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUserSettings().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetUserSettingsResponse.class, Builder.class);
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
            if (hasUserSettings()) {
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
            return new GetUserSettingsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUserSettings());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetUserSettingsResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> userSettingsBuilder_;
            private UserSettings userSettings_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GetUserSettingsResponse getUserSettingsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                    getUserSettingsResponse.userSettings_ = singleFieldBuilderV3 == null ? this.userSettings_ : (UserSettings) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                getUserSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsResponse_descriptor;
            }

            private SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> getUserSettingsFieldBuilder() {
                if (this.userSettingsBuilder_ == null) {
                    this.userSettingsBuilder_ = new SingleFieldBuilderV3<>(getUserSettings(), getParentForChildren(), isClean());
                    this.userSettings_ = null;
                }
                return this.userSettingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUserSettingsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetUserSettingsResponse build() {
                GetUserSettingsResponse getUserSettingsResponseBuildPartial = buildPartial();
                if (getUserSettingsResponseBuildPartial.isInitialized()) {
                    return getUserSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getUserSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetUserSettingsResponse buildPartial() {
                GetUserSettingsResponse getUserSettingsResponse = new GetUserSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getUserSettingsResponse);
                }
                onBuilt();
                return getUserSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.userSettings_ = null;
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.userSettingsBuilder_ = null;
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

            public Builder clearUserSettings() {
                this.bitField0_ &= -2;
                this.userSettings_ = null;
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.userSettingsBuilder_ = null;
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
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder
            public UserSettings getUserSettings() {
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserSettings) singleFieldBuilderV3.getMessage();
                }
                UserSettings userSettings = this.userSettings_;
                return userSettings == null ? UserSettings.getDefaultInstance() : userSettings;
            }

            public UserSettings.Builder getUserSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (UserSettings.Builder) getUserSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder
            public UserSettingsOrBuilder getUserSettingsOrBuilder() {
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UserSettings userSettings = this.userSettings_;
                return userSettings == null ? UserSettings.getDefaultInstance() : userSettings;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.GetUserSettingsResponseOrBuilder
            public boolean hasUserSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_GetUserSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetUserSettingsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasUserSettings();
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
                                    codedInputStream.readMessage(getUserSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeUserSettings(UserSettings userSettings) {
                UserSettings userSettings2;
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(userSettings);
                } else if ((this.bitField0_ & 1) == 0 || (userSettings2 = this.userSettings_) == null || userSettings2 == UserSettings.getDefaultInstance()) {
                    this.userSettings_ = userSettings;
                } else {
                    getUserSettingsBuilder().mergeFrom(userSettings);
                }
                if (this.userSettings_ != null) {
                    this.bitField0_ |= 1;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUserSettings(UserSettings.Builder builder) {
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.userSettings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetUserSettingsResponse getDefaultInstanceForType() {
                return GetUserSettingsResponse.getDefaultInstance();
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

            public Builder setUserSettings(UserSettings userSettings) {
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    userSettings.getClass();
                    this.userSettings_ = userSettings;
                } else {
                    singleFieldBuilderV3.setMessage(userSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetUserSettingsResponse) {
                    return mergeFrom((GetUserSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetUserSettingsResponse getUserSettingsResponse) {
                if (getUserSettingsResponse == GetUserSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (getUserSettingsResponse.hasUserSettings()) {
                    mergeUserSettings(getUserSettingsResponse.getUserSettings());
                }
                mergeUnknownFields(getUserSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetUserSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GetUserSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GetUserSettingsResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetUserSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetUserSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetUserSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetUserSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetUserSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetUserSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetUserSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetUserSettingsResponse parseFrom(InputStream inputStream) {
            return (GetUserSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetUserSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetUserSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetUserSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetUserSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetUserSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetUserSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetUserSettingsRequest extends GeneratedMessageV3 implements SetUserSettingsRequestOrBuilder {
        private static final SetUserSettingsRequest DEFAULT_INSTANCE = new SetUserSettingsRequest();

        @Deprecated
        public static final Parser<SetUserSettingsRequest> PARSER = new AbstractParser<SetUserSettingsRequest>() { // from class: com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public SetUserSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetUserSettingsRequest.newBuilder();
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
        public static final int USER_SETTINGS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private UserSettings userSettings_;

        private SetUserSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetUserSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsRequest_descriptor;
        }

        public static Builder newBuilder(SetUserSettingsRequest setUserSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setUserSettingsRequest);
        }

        public static SetUserSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (SetUserSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetUserSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetUserSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetUserSettingsRequest)) {
                return super.equals(obj);
            }
            SetUserSettingsRequest setUserSettingsRequest = (SetUserSettingsRequest) obj;
            if (hasUserSettings() != setUserSettingsRequest.hasUserSettings()) {
                return false;
            }
            return (!hasUserSettings() || getUserSettings().equals(setUserSettingsRequest.getUserSettings())) && getUnknownFields().equals(setUserSettingsRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetUserSettingsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUserSettings()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder
        public UserSettings getUserSettings() {
            UserSettings userSettings = this.userSettings_;
            return userSettings == null ? UserSettings.getDefaultInstance() : userSettings;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder
        public UserSettingsOrBuilder getUserSettingsOrBuilder() {
            UserSettings userSettings = this.userSettings_;
            return userSettings == null ? UserSettings.getDefaultInstance() : userSettings;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder
        public boolean hasUserSettings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUserSettings()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUserSettings().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetUserSettingsRequest.class, Builder.class);
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
            if (hasUserSettings()) {
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
            return new SetUserSettingsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUserSettings());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetUserSettingsRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> userSettingsBuilder_;
            private UserSettings userSettings_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SetUserSettingsRequest setUserSettingsRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                    setUserSettingsRequest.userSettings_ = singleFieldBuilderV3 == null ? this.userSettings_ : (UserSettings) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                setUserSettingsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsRequest_descriptor;
            }

            private SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> getUserSettingsFieldBuilder() {
                if (this.userSettingsBuilder_ == null) {
                    this.userSettingsBuilder_ = new SingleFieldBuilderV3<>(getUserSettings(), getParentForChildren(), isClean());
                    this.userSettings_ = null;
                }
                return this.userSettingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUserSettingsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetUserSettingsRequest build() {
                SetUserSettingsRequest setUserSettingsRequestBuildPartial = buildPartial();
                if (setUserSettingsRequestBuildPartial.isInitialized()) {
                    return setUserSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setUserSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetUserSettingsRequest buildPartial() {
                SetUserSettingsRequest setUserSettingsRequest = new SetUserSettingsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setUserSettingsRequest);
                }
                onBuilt();
                return setUserSettingsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.userSettings_ = null;
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.userSettingsBuilder_ = null;
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

            public Builder clearUserSettings() {
                this.bitField0_ &= -2;
                this.userSettings_ = null;
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.userSettingsBuilder_ = null;
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
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder
            public UserSettings getUserSettings() {
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserSettings) singleFieldBuilderV3.getMessage();
                }
                UserSettings userSettings = this.userSettings_;
                return userSettings == null ? UserSettings.getDefaultInstance() : userSettings;
            }

            public UserSettings.Builder getUserSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (UserSettings.Builder) getUserSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder
            public UserSettingsOrBuilder getUserSettingsOrBuilder() {
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UserSettings userSettings = this.userSettings_;
                return userSettings == null ? UserSettings.getDefaultInstance() : userSettings;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsRequestOrBuilder
            public boolean hasUserSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetUserSettingsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasUserSettings();
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
                                    codedInputStream.readMessage(getUserSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeUserSettings(UserSettings userSettings) {
                UserSettings userSettings2;
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(userSettings);
                } else if ((this.bitField0_ & 1) == 0 || (userSettings2 = this.userSettings_) == null || userSettings2 == UserSettings.getDefaultInstance()) {
                    this.userSettings_ = userSettings;
                } else {
                    getUserSettingsBuilder().mergeFrom(userSettings);
                }
                if (this.userSettings_ != null) {
                    this.bitField0_ |= 1;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUserSettings(UserSettings.Builder builder) {
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.userSettings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SetUserSettingsRequest getDefaultInstanceForType() {
                return SetUserSettingsRequest.getDefaultInstance();
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

            public Builder setUserSettings(UserSettings userSettings) {
                SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    userSettings.getClass();
                    this.userSettings_ = userSettings;
                } else {
                    singleFieldBuilderV3.setMessage(userSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetUserSettingsRequest) {
                    return mergeFrom((SetUserSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetUserSettingsRequest setUserSettingsRequest) {
                if (setUserSettingsRequest == SetUserSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                if (setUserSettingsRequest.hasUserSettings()) {
                    mergeUserSettings(setUserSettingsRequest.getUserSettings());
                }
                mergeUnknownFields(setUserSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetUserSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SetUserSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SetUserSettingsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetUserSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetUserSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetUserSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetUserSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetUserSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetUserSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetUserSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetUserSettingsRequest parseFrom(InputStream inputStream) {
            return (SetUserSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetUserSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetUserSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetUserSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (SetUserSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetUserSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetUserSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetUserSettingsResponse extends GeneratedMessageV3 implements SetUserSettingsResponseOrBuilder {
        private static final SetUserSettingsResponse DEFAULT_INSTANCE = new SetUserSettingsResponse();

        @Deprecated
        public static final Parser<SetUserSettingsResponse> PARSER = new AbstractParser<SetUserSettingsResponse>() { // from class: com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public SetUserSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetUserSettingsResponse.newBuilder();
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

        private SetUserSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetUserSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsResponse_descriptor;
        }

        public static Builder newBuilder(SetUserSettingsResponse setUserSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setUserSettingsResponse);
        }

        public static SetUserSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (SetUserSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetUserSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetUserSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetUserSettingsResponse)) {
                return super.equals(obj);
            }
            SetUserSettingsResponse setUserSettingsResponse = (SetUserSettingsResponse) obj;
            if (hasStatus() != setUserSettingsResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == setUserSettingsResponse.status_) && getUnknownFields().equals(setUserSettingsResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetUserSettingsResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder
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
            return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetUserSettingsResponse.class, Builder.class);
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
            return new SetUserSettingsResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetUserSettingsResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SetUserSettingsResponse setUserSettingsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    setUserSettingsResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                setUserSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetUserSettingsResponse build() {
                SetUserSettingsResponse setUserSettingsResponseBuildPartial = buildPartial();
                if (setUserSettingsResponseBuildPartial.isInitialized()) {
                    return setUserSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setUserSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetUserSettingsResponse buildPartial() {
                SetUserSettingsResponse setUserSettingsResponse = new SetUserSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setUserSettingsResponse);
                }
                onBuilt();
                return setUserSettingsResponse;
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
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_SetUserSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetUserSettingsResponse.class, Builder.class);
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
            public SetUserSettingsResponse getDefaultInstanceForType() {
                return SetUserSettingsResponse.getDefaultInstance();
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
                if (message instanceof SetUserSettingsResponse) {
                    return mergeFrom((SetUserSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetUserSettingsResponse setUserSettingsResponse) {
                if (setUserSettingsResponse == SetUserSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (setUserSettingsResponse.hasStatus()) {
                    setStatus(setUserSettingsResponse.getStatus());
                }
                mergeUnknownFields(setUserSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetUserSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetUserSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetUserSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetUserSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SetUserSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SetUserSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SetUserSettingsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetUserSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetUserSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetUserSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetUserSettingsResponse parseFrom(InputStream inputStream) {
            return (SetUserSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetUserSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetUserSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetUserSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (SetUserSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetUserSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetUserSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(1),
            NO_REMOTE_DEVICE(2);

            public static final int NO_REMOTE_DEVICE_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDISwingSensorUserSettings.SetUserSettingsResponse.ResponseStatus.1
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
                return SetUserSettingsResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class UserSettings extends GeneratedMessageV3 implements UserSettingsOrBuilder {
        public static final int GENDER_FIELD_NUMBER = 1;
        public static final int HANDEDNESS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int gender_;
        private int handedness_;
        private byte memoizedIsInitialized;
        private static final UserSettings DEFAULT_INSTANCE = new UserSettings();

        @Deprecated
        public static final Parser<UserSettings> PARSER = new AbstractParser<UserSettings>() { // from class: com.garmin.proto.generated.GDISwingSensorUserSettings.UserSettings.1
            @Override // com.google.protobuf.Parser
            public UserSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UserSettings.newBuilder();
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

        private UserSettings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.gender_ = 0;
            this.handedness_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_UserSettings_descriptor;
        }

        public static Builder newBuilder(UserSettings userSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userSettings);
        }

        public static UserSettings parseDelimitedFrom(InputStream inputStream) {
            return (UserSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserSettings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UserSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserSettings)) {
                return super.equals(obj);
            }
            UserSettings userSettings = (UserSettings) obj;
            if (hasGender() != userSettings.hasGender()) {
                return false;
            }
            if ((!hasGender() || this.gender_ == userSettings.gender_) && hasHandedness() == userSettings.hasHandedness()) {
                return (!hasHandedness() || this.handedness_ == userSettings.handedness_) && getUnknownFields().equals(userSettings.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.UserSettingsOrBuilder
        public Gender getGender() {
            Gender genderForNumber = Gender.forNumber(this.gender_);
            return genderForNumber == null ? Gender.UNKNOWN_GENDER : genderForNumber;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.UserSettingsOrBuilder
        public Handedness getHandedness() {
            Handedness handednessForNumber = Handedness.forNumber(this.handedness_);
            return handednessForNumber == null ? Handedness.UNKNOWN_HANDEDNESS : handednessForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UserSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.gender_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.handedness_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.UserSettingsOrBuilder
        public boolean hasGender() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.UserSettingsOrBuilder
        public boolean hasHandedness() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGender()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.gender_;
            }
            if (hasHandedness()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.handedness_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_UserSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(UserSettings.class, Builder.class);
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
            return new UserSettings();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.gender_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.handedness_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UserSettingsOrBuilder {
            private int bitField0_;
            private int gender_;
            private int handedness_;

            private Builder() {
                this.gender_ = 0;
                this.handedness_ = 0;
            }

            private void buildPartial0(UserSettings userSettings) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    userSettings.gender_ = this.gender_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    userSettings.handedness_ = this.handedness_;
                    i14 |= 2;
                }
                userSettings.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_UserSettings_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserSettings build() {
                UserSettings userSettingsBuildPartial = buildPartial();
                if (userSettingsBuildPartial.isInitialized()) {
                    return userSettingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userSettingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserSettings buildPartial() {
                UserSettings userSettings = new UserSettings(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(userSettings);
                }
                onBuilt();
                return userSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.gender_ = 0;
                this.handedness_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGender() {
                this.bitField0_ &= -2;
                this.gender_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHandedness() {
                this.bitField0_ &= -3;
                this.handedness_ = 0;
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
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_UserSettings_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.UserSettingsOrBuilder
            public Gender getGender() {
                Gender genderForNumber = Gender.forNumber(this.gender_);
                return genderForNumber == null ? Gender.UNKNOWN_GENDER : genderForNumber;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.UserSettingsOrBuilder
            public Handedness getHandedness() {
                Handedness handednessForNumber = Handedness.forNumber(this.handedness_);
                return handednessForNumber == null ? Handedness.UNKNOWN_HANDEDNESS : handednessForNumber;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.UserSettingsOrBuilder
            public boolean hasGender() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorUserSettings.UserSettingsOrBuilder
            public boolean hasHandedness() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorUserSettings.internal_static_GDI_Proto_SwingSensorUserSettings_UserSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(UserSettings.class, Builder.class);
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
                                    if (Gender.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.gender_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (Handedness.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.handedness_ = i15;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGender(Gender gender) {
                gender.getClass();
                this.bitField0_ |= 1;
                this.gender_ = gender.getNumber();
                onChanged();
                return this;
            }

            public Builder setHandedness(Handedness handedness) {
                handedness.getClass();
                this.bitField0_ |= 2;
                this.handedness_ = handedness.getNumber();
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
            public UserSettings getDefaultInstanceForType() {
                return UserSettings.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.gender_ = 0;
                this.handedness_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UserSettings) {
                    return mergeFrom((UserSettings) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UserSettings userSettings) {
                if (userSettings == UserSettings.getDefaultInstance()) {
                    return this;
                }
                if (userSettings.hasGender()) {
                    setGender(userSettings.getGender());
                }
                if (userSettings.hasHandedness()) {
                    setHandedness(userSettings.getHandedness());
                }
                mergeUnknownFields(userSettings.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UserSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UserSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UserSettings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ UserSettings(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UserSettings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private UserSettings() {
            this.memoizedIsInitialized = (byte) -1;
            this.gender_ = 0;
            this.handedness_ = 0;
        }

        public static UserSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserSettings parseFrom(InputStream inputStream) {
            return (UserSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UserSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserSettings parseFrom(CodedInputStream codedInputStream) {
            return (UserSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UserSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Gender implements ProtocolMessageEnum {
            UNKNOWN_GENDER(0),
            MALE(1),
            FEMALE(2);

            public static final int FEMALE_VALUE = 2;
            public static final int MALE_VALUE = 1;
            public static final int UNKNOWN_GENDER_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Gender> internalValueMap = new Internal.EnumLiteMap<Gender>() { // from class: com.garmin.proto.generated.GDISwingSensorUserSettings.UserSettings.Gender.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Gender findValueByNumber(int i14) {
                    return Gender.forNumber(i14);
                }
            };
            private static final Gender[] VALUES = values();

            Gender(int i14) {
                this.value = i14;
            }

            public static Gender forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_GENDER;
                }
                if (i14 == 1) {
                    return MALE;
                }
                if (i14 != 2) {
                    return null;
                }
                return FEMALE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UserSettings.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Gender> internalGetValueMap() {
                return internalValueMap;
            }

            public static Gender valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Gender valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum Handedness implements ProtocolMessageEnum {
            UNKNOWN_HANDEDNESS(0),
            LEFT_HANDED(1),
            RIGHT_HANDED(2);

            public static final int LEFT_HANDED_VALUE = 1;
            public static final int RIGHT_HANDED_VALUE = 2;
            public static final int UNKNOWN_HANDEDNESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Handedness> internalValueMap = new Internal.EnumLiteMap<Handedness>() { // from class: com.garmin.proto.generated.GDISwingSensorUserSettings.UserSettings.Handedness.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Handedness findValueByNumber(int i14) {
                    return Handedness.forNumber(i14);
                }
            };
            private static final Handedness[] VALUES = values();

            Handedness(int i14) {
                this.value = i14;
            }

            public static Handedness forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_HANDEDNESS;
                }
                if (i14 == 1) {
                    return LEFT_HANDED;
                }
                if (i14 != 2) {
                    return null;
                }
                return RIGHT_HANDED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UserSettings.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<Handedness> internalGetValueMap() {
                return internalValueMap;
            }

            public static Handedness valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Handedness valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
