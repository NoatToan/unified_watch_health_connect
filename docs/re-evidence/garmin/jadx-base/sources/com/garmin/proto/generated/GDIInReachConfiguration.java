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

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachConfiguration {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDIInReachConfiguration.proto\u0012\u001eGDI.Proto.InReachConfiguration\u001a\u0012GDIDataTypes.proto\"µ\u0002\n\u0007Service\u0012K\n\u0011configure_request\u0018\u0001 \u0001(\u000b20.GDI.Proto.InReachConfiguration.ConfigureRequest\u0012M\n\u0012configure_response\u0018\u0002 \u0001(\u000b21.GDI.Proto.InReachConfiguration.ConfigureResponse\u0012E\n\u000estatus_request\u0018\u0003 \u0001(\u000b2-.GDI.Proto.InReachConfiguration.StatusRequest\u0012G\n\u000fstatus_response\u0018\u0004 \u0001(\u000b2..GDI.Proto.InReachConfiguration.StatusResponse\"~\n\u0010ConfigureRequest\u0012'\n\u0004uuid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012A\n\u0012configuration_file\u0018\u0002 \u0001(\u000b2%.GDI.Proto.DataTypes.DataTransferItem\"ê\u0001\n\u0011ConfigureResponse\u0012H\n\u0006status\u0018\u0001 \u0001(\u000e28.GDI.Proto.InReachConfiguration.ConfigureResponse.Status\"\u008a\u0001\n\u0006Status\u0012\u0011\n\rERROR_UNKNOWN\u0010\u0001\u0012\u0016\n\u0012ERROR_INVALID_UUID\u0010\u0002\u0012\u0018\n\u0014ERROR_INVALID_CONFIG\u0010\u0003\u0012\u001e\n\u001aERROR_CURRENTLY_PROCESSING\u0010\u0004\u0012\u0013\n\u000fERROR_SAME_UUID\u0010\u0005\u0012\u0006\n\u0002OK\u0010\u0006\"8\n\rStatusRequest\u0012'\n\u0004uuid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\"Q\n\u000eStatusResponse\u0012?\n\u0006status\u0018\u0001 \u0001(\u000e2/.GDI.Proto.InReachConfiguration.ConfigureStatus*\u008a\u0001\n\u000fConfigureStatus\u0012\u0011\n\rERROR_UNKNOWN\u0010\u0001\u0012\u0016\n\u0012ERROR_INVALID_UUID\u0010\u0002\u0012\u000f\n\u000bDOWNLOADING\u0010\u0003\u0012\u000b\n\u0007PARSING\u0010\u0004\u0012\u000f\n\u000bPARSE_ERROR\u0010\u0005\u0012\u0010\n\fOBJECT_ERROR\u0010\u0006\u0012\u000b\n\u0007SUCCESS\u0010\u0007B7\n\u001acom.garmin.proto.generatedB\u0017GDIInReachConfigurationH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachConfiguration_ConfigureRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachConfiguration_ConfigureRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachConfiguration_ConfigureResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachConfiguration_ConfigureResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachConfiguration_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachConfiguration_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachConfiguration_StatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachConfiguration_StatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachConfiguration_StatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachConfiguration_StatusResponse_fieldAccessorTable;

    public interface ConfigureRequestOrBuilder extends MessageOrBuilder {
        GDIDataTypes.DataTransferItem getConfigurationFile();

        GDIDataTypes.DataTransferItemOrBuilder getConfigurationFileOrBuilder();

        GDIDataTypes.UUID getUuid();

        GDIDataTypes.UUIDOrBuilder getUuidOrBuilder();

        boolean hasConfigurationFile();

        boolean hasUuid();
    }

    public interface ConfigureResponseOrBuilder extends MessageOrBuilder {
        ConfigureResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ConfigureRequest getConfigureRequest();

        ConfigureRequestOrBuilder getConfigureRequestOrBuilder();

        ConfigureResponse getConfigureResponse();

        ConfigureResponseOrBuilder getConfigureResponseOrBuilder();

        StatusRequest getStatusRequest();

        StatusRequestOrBuilder getStatusRequestOrBuilder();

        StatusResponse getStatusResponse();

        StatusResponseOrBuilder getStatusResponseOrBuilder();

        boolean hasConfigureRequest();

        boolean hasConfigureResponse();

        boolean hasStatusRequest();

        boolean hasStatusResponse();
    }

    public interface StatusRequestOrBuilder extends MessageOrBuilder {
        GDIDataTypes.UUID getUuid();

        GDIDataTypes.UUIDOrBuilder getUuidOrBuilder();

        boolean hasUuid();
    }

    public interface StatusResponseOrBuilder extends MessageOrBuilder {
        ConfigureStatus getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_InReachConfiguration_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_InReachConfiguration_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConfigureRequest", "ConfigureResponse", "StatusRequest", "StatusResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_InReachConfiguration_ConfigureRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_InReachConfiguration_ConfigureRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Uuid", "ConfigurationFile"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_InReachConfiguration_ConfigureResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_InReachConfiguration_ConfigureResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_InReachConfiguration_StatusRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_InReachConfiguration_StatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Uuid"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_InReachConfiguration_StatusResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_InReachConfiguration_StatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
        GDIDataTypes.getDescriptor();
    }

    private GDIInReachConfiguration() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class ConfigureRequest extends GeneratedMessageV3 implements ConfigureRequestOrBuilder {
        public static final int CONFIGURATION_FILE_FIELD_NUMBER = 2;
        private static final ConfigureRequest DEFAULT_INSTANCE = new ConfigureRequest();

        @Deprecated
        public static final Parser<ConfigureRequest> PARSER = new AbstractParser<ConfigureRequest>() { // from class: com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequest.1
            @Override // com.google.protobuf.Parser
            public ConfigureRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureRequest.newBuilder();
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
        public static final int UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GDIDataTypes.DataTransferItem configurationFile_;
        private byte memoizedIsInitialized;
        private GDIDataTypes.UUID uuid_;

        private ConfigureRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigureRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_ConfigureRequest_descriptor;
        }

        public static Builder newBuilder(ConfigureRequest configureRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureRequest);
        }

        public static ConfigureRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureRequest)) {
                return super.equals(obj);
            }
            ConfigureRequest configureRequest = (ConfigureRequest) obj;
            if (hasUuid() != configureRequest.hasUuid()) {
                return false;
            }
            if ((!hasUuid() || getUuid().equals(configureRequest.getUuid())) && hasConfigurationFile() == configureRequest.hasConfigurationFile()) {
                return (!hasConfigurationFile() || getConfigurationFile().equals(configureRequest.getConfigurationFile())) && getUnknownFields().equals(configureRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
        public GDIDataTypes.DataTransferItem getConfigurationFile() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.configurationFile_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
        public GDIDataTypes.DataTransferItemOrBuilder getConfigurationFileOrBuilder() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.configurationFile_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUuid()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConfigurationFile());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
        public GDIDataTypes.UUID getUuid() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
        public boolean hasConfigurationFile() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
        public boolean hasUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUuid().hashCode();
            }
            if (hasConfigurationFile()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfigurationFile().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_ConfigureRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureRequest.class, Builder.class);
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
            if (hasUuid() && !getUuid().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasConfigurationFile() || getConfigurationFile().isInitialized()) {
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
            return new ConfigureRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUuid());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConfigurationFile());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> configurationFileBuilder_;
            private GDIDataTypes.DataTransferItem configurationFile_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uuidBuilder_;
            private GDIDataTypes.UUID uuid_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigureRequest configureRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    configureRequest.uuid_ = singleFieldBuilderV3 == null ? this.uuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV4 = this.configurationFileBuilder_;
                    configureRequest.configurationFile_ = singleFieldBuilderV4 == null ? this.configurationFile_ : (GDIDataTypes.DataTransferItem) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                configureRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> getConfigurationFileFieldBuilder() {
                if (this.configurationFileBuilder_ == null) {
                    this.configurationFileBuilder_ = new SingleFieldBuilderV3<>(getConfigurationFile(), getParentForChildren(), isClean());
                    this.configurationFile_ = null;
                }
                return this.configurationFileBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_ConfigureRequest_descriptor;
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
                    getConfigurationFileFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureRequest build() {
                ConfigureRequest configureRequestBuildPartial = buildPartial();
                if (configureRequestBuildPartial.isInitialized()) {
                    return configureRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureRequest buildPartial() {
                ConfigureRequest configureRequest = new ConfigureRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureRequest);
                }
                onBuilt();
                return configureRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.uuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uuidBuilder_ = null;
                }
                this.configurationFile_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV4 = this.configurationFileBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.configurationFileBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfigurationFile() {
                this.bitField0_ &= -3;
                this.configurationFile_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.configurationFileBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configurationFileBuilder_ = null;
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

            public Builder clearUuid() {
                this.bitField0_ &= -2;
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

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
            public GDIDataTypes.DataTransferItem getConfigurationFile() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.configurationFileBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.configurationFile_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            public GDIDataTypes.DataTransferItem.Builder getConfigurationFileBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GDIDataTypes.DataTransferItem.Builder) getConfigurationFileFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
            public GDIDataTypes.DataTransferItemOrBuilder getConfigurationFileOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.configurationFileBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.configurationFile_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_ConfigureRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
            public GDIDataTypes.UUID getUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getUuidBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
            public boolean hasConfigurationFile() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureRequestOrBuilder
            public boolean hasUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_ConfigureRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasUuid() || getUuid().isInitialized()) {
                    return !hasConfigurationFile() || getConfigurationFile().isInitialized();
                }
                return false;
            }

            public Builder mergeConfigurationFile(GDIDataTypes.DataTransferItem dataTransferItem) {
                GDIDataTypes.DataTransferItem dataTransferItem2;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.configurationFileBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTransferItem);
                } else if ((this.bitField0_ & 2) == 0 || (dataTransferItem2 = this.configurationFile_) == null || dataTransferItem2 == GDIDataTypes.DataTransferItem.getDefaultInstance()) {
                    this.configurationFile_ = dataTransferItem;
                } else {
                    getConfigurationFileBuilder().mergeFrom(dataTransferItem);
                }
                if (this.configurationFile_ != null) {
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
                                    codedInputStream.readMessage(getUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConfigurationFileFieldBuilder().getBuilder(), extensionRegistryLite);
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
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.uuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.uuid_ = uuid;
                } else {
                    getUuidBuilder().mergeFrom(uuid);
                }
                if (this.uuid_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setConfigurationFile(GDIDataTypes.DataTransferItem.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.configurationFileBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configurationFile_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
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
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigureRequest getDefaultInstanceForType() {
                return ConfigureRequest.getDefaultInstance();
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

            public Builder setConfigurationFile(GDIDataTypes.DataTransferItem dataTransferItem) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.configurationFileBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTransferItem.getClass();
                    this.configurationFile_ = dataTransferItem;
                } else {
                    singleFieldBuilderV3.setMessage(dataTransferItem);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.uuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureRequest) {
                    return mergeFrom((ConfigureRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigureRequest configureRequest) {
                if (configureRequest == ConfigureRequest.getDefaultInstance()) {
                    return this;
                }
                if (configureRequest.hasUuid()) {
                    mergeUuid(configureRequest.getUuid());
                }
                if (configureRequest.hasConfigurationFile()) {
                    mergeConfigurationFile(configureRequest.getConfigurationFile());
                }
                mergeUnknownFields(configureRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigureRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConfigureRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConfigureRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigureRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigureRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigureRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigureRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigureRequest parseFrom(InputStream inputStream) {
            return (ConfigureRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigureResponse extends GeneratedMessageV3 implements ConfigureResponseOrBuilder {
        private static final ConfigureResponse DEFAULT_INSTANCE = new ConfigureResponse();

        @Deprecated
        public static final Parser<ConfigureResponse> PARSER = new AbstractParser<ConfigureResponse>() { // from class: com.garmin.proto.generated.GDIInReachConfiguration.ConfigureResponse.1
            @Override // com.google.protobuf.Parser
            public ConfigureResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureResponse.newBuilder();
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

        private ConfigureResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigureResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_ConfigureResponse_descriptor;
        }

        public static Builder newBuilder(ConfigureResponse configureResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureResponse);
        }

        public static ConfigureResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureResponse)) {
                return super.equals(obj);
            }
            ConfigureResponse configureResponse = (ConfigureResponse) obj;
            if (hasStatus() != configureResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == configureResponse.status_) && getUnknownFields().equals(configureResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.ERROR_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureResponseOrBuilder
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
            return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_ConfigureResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureResponse.class, Builder.class);
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
            return new ConfigureResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(ConfigureResponse configureResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    configureResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                configureResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_ConfigureResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureResponse build() {
                ConfigureResponse configureResponseBuildPartial = buildPartial();
                if (configureResponseBuildPartial.isInitialized()) {
                    return configureResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureResponse buildPartial() {
                ConfigureResponse configureResponse = new ConfigureResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureResponse);
                }
                onBuilt();
                return configureResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 1;
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
                this.status_ = 1;
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
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_ConfigureResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.ERROR_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ConfigureResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_ConfigureResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureResponse.class, Builder.class);
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
            public ConfigureResponse getDefaultInstanceForType() {
                return ConfigureResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureResponse) {
                    return mergeFrom((ConfigureResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigureResponse configureResponse) {
                if (configureResponse == ConfigureResponse.getDefaultInstance()) {
                    return this;
                }
                if (configureResponse.hasStatus()) {
                    setStatus(configureResponse.getStatus());
                }
                mergeUnknownFields(configureResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigureResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigureResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConfigureResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigureResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConfigureResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigureResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigureResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigureResponse parseFrom(InputStream inputStream) {
            return (ConfigureResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            ERROR_UNKNOWN(1),
            ERROR_INVALID_UUID(2),
            ERROR_INVALID_CONFIG(3),
            ERROR_CURRENTLY_PROCESSING(4),
            ERROR_SAME_UUID(5),
            OK(6);

            public static final int ERROR_CURRENTLY_PROCESSING_VALUE = 4;
            public static final int ERROR_INVALID_CONFIG_VALUE = 3;
            public static final int ERROR_INVALID_UUID_VALUE = 2;
            public static final int ERROR_SAME_UUID_VALUE = 5;
            public static final int ERROR_UNKNOWN_VALUE = 1;
            public static final int OK_VALUE = 6;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachConfiguration.ConfigureResponse.Status.1
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
                switch (i14) {
                    case 1:
                        return ERROR_UNKNOWN;
                    case 2:
                        return ERROR_INVALID_UUID;
                    case 3:
                        return ERROR_INVALID_CONFIG;
                    case 4:
                        return ERROR_CURRENTLY_PROCESSING;
                    case 5:
                        return ERROR_SAME_UUID;
                    case 6:
                        return OK;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConfigureResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CONFIGURE_REQUEST_FIELD_NUMBER = 1;
        public static final int CONFIGURE_RESPONSE_FIELD_NUMBER = 2;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIInReachConfiguration.Service.1
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
        public static final int STATUS_REQUEST_FIELD_NUMBER = 3;
        public static final int STATUS_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ConfigureRequest configureRequest_;
        private ConfigureResponse configureResponse_;
        private byte memoizedIsInitialized;
        private StatusRequest statusRequest_;
        private StatusResponse statusResponse_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_Service_descriptor;
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
            if (hasConfigureRequest() != service.hasConfigureRequest()) {
                return false;
            }
            if ((hasConfigureRequest() && !getConfigureRequest().equals(service.getConfigureRequest())) || hasConfigureResponse() != service.hasConfigureResponse()) {
                return false;
            }
            if ((hasConfigureResponse() && !getConfigureResponse().equals(service.getConfigureResponse())) || hasStatusRequest() != service.hasStatusRequest()) {
                return false;
            }
            if ((!hasStatusRequest() || getStatusRequest().equals(service.getStatusRequest())) && hasStatusResponse() == service.hasStatusResponse()) {
                return (!hasStatusResponse() || getStatusResponse().equals(service.getStatusResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public ConfigureRequest getConfigureRequest() {
            ConfigureRequest configureRequest = this.configureRequest_;
            return configureRequest == null ? ConfigureRequest.getDefaultInstance() : configureRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public ConfigureRequestOrBuilder getConfigureRequestOrBuilder() {
            ConfigureRequest configureRequest = this.configureRequest_;
            return configureRequest == null ? ConfigureRequest.getDefaultInstance() : configureRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public ConfigureResponse getConfigureResponse() {
            ConfigureResponse configureResponse = this.configureResponse_;
            return configureResponse == null ? ConfigureResponse.getDefaultInstance() : configureResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public ConfigureResponseOrBuilder getConfigureResponseOrBuilder() {
            ConfigureResponse configureResponse = this.configureResponse_;
            return configureResponse == null ? ConfigureResponse.getDefaultInstance() : configureResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfigureRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConfigureResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getStatusRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getStatusResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public StatusRequest getStatusRequest() {
            StatusRequest statusRequest = this.statusRequest_;
            return statusRequest == null ? StatusRequest.getDefaultInstance() : statusRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public StatusRequestOrBuilder getStatusRequestOrBuilder() {
            StatusRequest statusRequest = this.statusRequest_;
            return statusRequest == null ? StatusRequest.getDefaultInstance() : statusRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public StatusResponse getStatusResponse() {
            StatusResponse statusResponse = this.statusResponse_;
            return statusResponse == null ? StatusResponse.getDefaultInstance() : statusResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public StatusResponseOrBuilder getStatusResponseOrBuilder() {
            StatusResponse statusResponse = this.statusResponse_;
            return statusResponse == null ? StatusResponse.getDefaultInstance() : statusResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public boolean hasConfigureRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public boolean hasConfigureResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public boolean hasStatusRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
        public boolean hasStatusResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfigureRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfigureRequest().hashCode();
            }
            if (hasConfigureResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfigureResponse().hashCode();
            }
            if (hasStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStatusRequest().hashCode();
            }
            if (hasStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getStatusResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if (hasConfigureRequest() && !getConfigureRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasStatusRequest() || getStatusRequest().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getConfigureRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConfigureResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getStatusRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getStatusResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigureRequest, ConfigureRequest.Builder, ConfigureRequestOrBuilder> configureRequestBuilder_;
            private ConfigureRequest configureRequest_;
            private SingleFieldBuilderV3<ConfigureResponse, ConfigureResponse.Builder, ConfigureResponseOrBuilder> configureResponseBuilder_;
            private ConfigureResponse configureResponse_;
            private SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> statusRequestBuilder_;
            private StatusRequest statusRequest_;
            private SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> statusResponseBuilder_;
            private StatusResponse statusResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConfigureRequest, ConfigureRequest.Builder, ConfigureRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                    service.configureRequest_ = singleFieldBuilderV3 == null ? this.configureRequest_ : (ConfigureRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConfigureResponse, ConfigureResponse.Builder, ConfigureResponseOrBuilder> singleFieldBuilderV4 = this.configureResponseBuilder_;
                    service.configureResponse_ = singleFieldBuilderV4 == null ? this.configureResponse_ : (ConfigureResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV5 = this.statusRequestBuilder_;
                    service.statusRequest_ = singleFieldBuilderV5 == null ? this.statusRequest_ : (StatusRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV6 = this.statusResponseBuilder_;
                    service.statusResponse_ = singleFieldBuilderV6 == null ? this.statusResponse_ : (StatusResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConfigureRequest, ConfigureRequest.Builder, ConfigureRequestOrBuilder> getConfigureRequestFieldBuilder() {
                if (this.configureRequestBuilder_ == null) {
                    this.configureRequestBuilder_ = new SingleFieldBuilderV3<>(getConfigureRequest(), getParentForChildren(), isClean());
                    this.configureRequest_ = null;
                }
                return this.configureRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConfigureResponse, ConfigureResponse.Builder, ConfigureResponseOrBuilder> getConfigureResponseFieldBuilder() {
                if (this.configureResponseBuilder_ == null) {
                    this.configureResponseBuilder_ = new SingleFieldBuilderV3<>(getConfigureResponse(), getParentForChildren(), isClean());
                    this.configureResponse_ = null;
                }
                return this.configureResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_Service_descriptor;
            }

            private SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> getStatusRequestFieldBuilder() {
                if (this.statusRequestBuilder_ == null) {
                    this.statusRequestBuilder_ = new SingleFieldBuilderV3<>(getStatusRequest(), getParentForChildren(), isClean());
                    this.statusRequest_ = null;
                }
                return this.statusRequestBuilder_;
            }

            private SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> getStatusResponseFieldBuilder() {
                if (this.statusResponseBuilder_ == null) {
                    this.statusResponseBuilder_ = new SingleFieldBuilderV3<>(getStatusResponse(), getParentForChildren(), isClean());
                    this.statusResponse_ = null;
                }
                return this.statusResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigureRequestFieldBuilder();
                    getConfigureResponseFieldBuilder();
                    getStatusRequestFieldBuilder();
                    getStatusResponseFieldBuilder();
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
                this.configureRequest_ = null;
                SingleFieldBuilderV3<ConfigureRequest, ConfigureRequest.Builder, ConfigureRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configureRequestBuilder_ = null;
                }
                this.configureResponse_ = null;
                SingleFieldBuilderV3<ConfigureResponse, ConfigureResponse.Builder, ConfigureResponseOrBuilder> singleFieldBuilderV4 = this.configureResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.configureResponseBuilder_ = null;
                }
                this.statusRequest_ = null;
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV5 = this.statusRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.statusRequestBuilder_ = null;
                }
                this.statusResponse_ = null;
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV6 = this.statusResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.statusResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfigureRequest() {
                this.bitField0_ &= -2;
                this.configureRequest_ = null;
                SingleFieldBuilderV3<ConfigureRequest, ConfigureRequest.Builder, ConfigureRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configureRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigureResponse() {
                this.bitField0_ &= -3;
                this.configureResponse_ = null;
                SingleFieldBuilderV3<ConfigureResponse, ConfigureResponse.Builder, ConfigureResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configureResponseBuilder_ = null;
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

            public Builder clearStatusRequest() {
                this.bitField0_ &= -5;
                this.statusRequest_ = null;
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusResponse() {
                this.bitField0_ &= -9;
                this.statusResponse_ = null;
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public ConfigureRequest getConfigureRequest() {
                SingleFieldBuilderV3<ConfigureRequest, ConfigureRequest.Builder, ConfigureRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureRequest) singleFieldBuilderV3.getMessage();
                }
                ConfigureRequest configureRequest = this.configureRequest_;
                return configureRequest == null ? ConfigureRequest.getDefaultInstance() : configureRequest;
            }

            public ConfigureRequest.Builder getConfigureRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigureRequest.Builder) getConfigureRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public ConfigureRequestOrBuilder getConfigureRequestOrBuilder() {
                SingleFieldBuilderV3<ConfigureRequest, ConfigureRequest.Builder, ConfigureRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureRequest configureRequest = this.configureRequest_;
                return configureRequest == null ? ConfigureRequest.getDefaultInstance() : configureRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public ConfigureResponse getConfigureResponse() {
                SingleFieldBuilderV3<ConfigureResponse, ConfigureResponse.Builder, ConfigureResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureResponse) singleFieldBuilderV3.getMessage();
                }
                ConfigureResponse configureResponse = this.configureResponse_;
                return configureResponse == null ? ConfigureResponse.getDefaultInstance() : configureResponse;
            }

            public ConfigureResponse.Builder getConfigureResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConfigureResponse.Builder) getConfigureResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public ConfigureResponseOrBuilder getConfigureResponseOrBuilder() {
                SingleFieldBuilderV3<ConfigureResponse, ConfigureResponse.Builder, ConfigureResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureResponse configureResponse = this.configureResponse_;
                return configureResponse == null ? ConfigureResponse.getDefaultInstance() : configureResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public StatusRequest getStatusRequest() {
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusRequest) singleFieldBuilderV3.getMessage();
                }
                StatusRequest statusRequest = this.statusRequest_;
                return statusRequest == null ? StatusRequest.getDefaultInstance() : statusRequest;
            }

            public StatusRequest.Builder getStatusRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (StatusRequest.Builder) getStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public StatusRequestOrBuilder getStatusRequestOrBuilder() {
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StatusRequest statusRequest = this.statusRequest_;
                return statusRequest == null ? StatusRequest.getDefaultInstance() : statusRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public StatusResponse getStatusResponse() {
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusResponse) singleFieldBuilderV3.getMessage();
                }
                StatusResponse statusResponse = this.statusResponse_;
                return statusResponse == null ? StatusResponse.getDefaultInstance() : statusResponse;
            }

            public StatusResponse.Builder getStatusResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (StatusResponse.Builder) getStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public StatusResponseOrBuilder getStatusResponseOrBuilder() {
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StatusResponse statusResponse = this.statusResponse_;
                return statusResponse == null ? StatusResponse.getDefaultInstance() : statusResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public boolean hasConfigureRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public boolean hasConfigureResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public boolean hasStatusRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.ServiceOrBuilder
            public boolean hasStatusResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasConfigureRequest() || getConfigureRequest().isInitialized()) {
                    return !hasStatusRequest() || getStatusRequest().isInitialized();
                }
                return false;
            }

            public Builder mergeConfigureRequest(ConfigureRequest configureRequest) {
                ConfigureRequest configureRequest2;
                SingleFieldBuilderV3<ConfigureRequest, ConfigureRequest.Builder, ConfigureRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureRequest);
                } else if ((this.bitField0_ & 1) == 0 || (configureRequest2 = this.configureRequest_) == null || configureRequest2 == ConfigureRequest.getDefaultInstance()) {
                    this.configureRequest_ = configureRequest;
                } else {
                    getConfigureRequestBuilder().mergeFrom(configureRequest);
                }
                if (this.configureRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigureResponse(ConfigureResponse configureResponse) {
                ConfigureResponse configureResponse2;
                SingleFieldBuilderV3<ConfigureResponse, ConfigureResponse.Builder, ConfigureResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureResponse);
                } else if ((this.bitField0_ & 2) == 0 || (configureResponse2 = this.configureResponse_) == null || configureResponse2 == ConfigureResponse.getDefaultInstance()) {
                    this.configureResponse_ = configureResponse;
                } else {
                    getConfigureResponseBuilder().mergeFrom(configureResponse);
                }
                if (this.configureResponse_ != null) {
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
                                    codedInputStream.readMessage(getConfigureRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConfigureResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeStatusRequest(StatusRequest statusRequest) {
                StatusRequest statusRequest2;
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(statusRequest);
                } else if ((this.bitField0_ & 4) == 0 || (statusRequest2 = this.statusRequest_) == null || statusRequest2 == StatusRequest.getDefaultInstance()) {
                    this.statusRequest_ = statusRequest;
                } else {
                    getStatusRequestBuilder().mergeFrom(statusRequest);
                }
                if (this.statusRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusResponse(StatusResponse statusResponse) {
                StatusResponse statusResponse2;
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(statusResponse);
                } else if ((this.bitField0_ & 8) == 0 || (statusResponse2 = this.statusResponse_) == null || statusResponse2 == StatusResponse.getDefaultInstance()) {
                    this.statusResponse_ = statusResponse;
                } else {
                    getStatusResponseBuilder().mergeFrom(statusResponse);
                }
                if (this.statusResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setConfigureRequest(ConfigureRequest.Builder builder) {
                SingleFieldBuilderV3<ConfigureRequest, ConfigureRequest.Builder, ConfigureRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configureRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigureResponse(ConfigureResponse.Builder builder) {
                SingleFieldBuilderV3<ConfigureResponse, ConfigureResponse.Builder, ConfigureResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configureResponse_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatusRequest(StatusRequest.Builder builder) {
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStatusResponse(StatusResponse.Builder builder) {
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusResponse_ = builder.build();
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

            public Builder setConfigureRequest(ConfigureRequest configureRequest) {
                SingleFieldBuilderV3<ConfigureRequest, ConfigureRequest.Builder, ConfigureRequestOrBuilder> singleFieldBuilderV3 = this.configureRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureRequest.getClass();
                    this.configureRequest_ = configureRequest;
                } else {
                    singleFieldBuilderV3.setMessage(configureRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigureResponse(ConfigureResponse configureResponse) {
                SingleFieldBuilderV3<ConfigureResponse, ConfigureResponse.Builder, ConfigureResponseOrBuilder> singleFieldBuilderV3 = this.configureResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureResponse.getClass();
                    this.configureResponse_ = configureResponse;
                } else {
                    singleFieldBuilderV3.setMessage(configureResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStatusRequest(StatusRequest statusRequest) {
                SingleFieldBuilderV3<StatusRequest, StatusRequest.Builder, StatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    statusRequest.getClass();
                    this.statusRequest_ = statusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(statusRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStatusResponse(StatusResponse statusResponse) {
                SingleFieldBuilderV3<StatusResponse, StatusResponse.Builder, StatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    statusResponse.getClass();
                    this.statusResponse_ = statusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(statusResponse);
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
                if (service.hasConfigureRequest()) {
                    mergeConfigureRequest(service.getConfigureRequest());
                }
                if (service.hasConfigureResponse()) {
                    mergeConfigureResponse(service.getConfigureResponse());
                }
                if (service.hasStatusRequest()) {
                    mergeStatusRequest(service.getStatusRequest());
                }
                if (service.hasStatusResponse()) {
                    mergeStatusResponse(service.getStatusResponse());
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

    public static final class StatusRequest extends GeneratedMessageV3 implements StatusRequestOrBuilder {
        private static final StatusRequest DEFAULT_INSTANCE = new StatusRequest();

        @Deprecated
        public static final Parser<StatusRequest> PARSER = new AbstractParser<StatusRequest>() { // from class: com.garmin.proto.generated.GDIInReachConfiguration.StatusRequest.1
            @Override // com.google.protobuf.Parser
            public StatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StatusRequest.newBuilder();
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
        public static final int UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private GDIDataTypes.UUID uuid_;

        private StatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_StatusRequest_descriptor;
        }

        public static Builder newBuilder(StatusRequest statusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(statusRequest);
        }

        public static StatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (StatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StatusRequest)) {
                return super.equals(obj);
            }
            StatusRequest statusRequest = (StatusRequest) obj;
            if (hasUuid() != statusRequest.hasUuid()) {
                return false;
            }
            return (!hasUuid() || getUuid().equals(statusRequest.getUuid())) && getUnknownFields().equals(statusRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StatusRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUuid()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.StatusRequestOrBuilder
        public GDIDataTypes.UUID getUuid() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.StatusRequestOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.StatusRequestOrBuilder
        public boolean hasUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUuid().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_StatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusRequest.class, Builder.class);
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
            return new StatusRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUuid());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StatusRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uuidBuilder_;
            private GDIDataTypes.UUID uuid_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(StatusRequest statusRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    statusRequest.uuid_ = singleFieldBuilderV3 == null ? this.uuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                statusRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_StatusRequest_descriptor;
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
            public StatusRequest build() {
                StatusRequest statusRequestBuildPartial = buildPartial();
                if (statusRequestBuildPartial.isInitialized()) {
                    return statusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) statusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StatusRequest buildPartial() {
                StatusRequest statusRequest = new StatusRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(statusRequest);
                }
                onBuilt();
                return statusRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
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

            public Builder clearUuid() {
                this.bitField0_ &= -2;
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
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_StatusRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.StatusRequestOrBuilder
            public GDIDataTypes.UUID getUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getUuidBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.StatusRequestOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.StatusRequestOrBuilder
            public boolean hasUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_StatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasUuid() || getUuid().isInitialized();
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
                                    codedInputStream.readMessage(getUuidFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.uuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.uuid_ = uuid;
                } else {
                    getUuidBuilder().mergeFrom(uuid);
                }
                if (this.uuid_ != null) {
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

            public Builder setUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uuid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StatusRequest getDefaultInstanceForType() {
                return StatusRequest.getDefaultInstance();
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

            public Builder setUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.uuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StatusRequest) {
                    return mergeFrom((StatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StatusRequest statusRequest) {
                if (statusRequest == StatusRequest.getDefaultInstance()) {
                    return this;
                }
                if (statusRequest.hasUuid()) {
                    mergeUuid(statusRequest.getUuid());
                }
                mergeUnknownFields(statusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StatusRequest parseFrom(InputStream inputStream) {
            return (StatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (StatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StatusResponse extends GeneratedMessageV3 implements StatusResponseOrBuilder {
        private static final StatusResponse DEFAULT_INSTANCE = new StatusResponse();

        @Deprecated
        public static final Parser<StatusResponse> PARSER = new AbstractParser<StatusResponse>() { // from class: com.garmin.proto.generated.GDIInReachConfiguration.StatusResponse.1
            @Override // com.google.protobuf.Parser
            public StatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StatusResponse.newBuilder();
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

        private StatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_StatusResponse_descriptor;
        }

        public static Builder newBuilder(StatusResponse statusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(statusResponse);
        }

        public static StatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (StatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StatusResponse)) {
                return super.equals(obj);
            }
            StatusResponse statusResponse = (StatusResponse) obj;
            if (hasStatus() != statusResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == statusResponse.status_) && getUnknownFields().equals(statusResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StatusResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.StatusResponseOrBuilder
        public ConfigureStatus getStatus() {
            ConfigureStatus configureStatusForNumber = ConfigureStatus.forNumber(this.status_);
            return configureStatusForNumber == null ? ConfigureStatus.ERROR_UNKNOWN : configureStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachConfiguration.StatusResponseOrBuilder
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
            return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_StatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusResponse.class, Builder.class);
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
            return new StatusResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StatusResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(StatusResponse statusResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    statusResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                statusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_StatusResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StatusResponse build() {
                StatusResponse statusResponseBuildPartial = buildPartial();
                if (statusResponseBuildPartial.isInitialized()) {
                    return statusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) statusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StatusResponse buildPartial() {
                StatusResponse statusResponse = new StatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(statusResponse);
                }
                onBuilt();
                return statusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 1;
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
                this.status_ = 1;
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
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_StatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.StatusResponseOrBuilder
            public ConfigureStatus getStatus() {
                ConfigureStatus configureStatusForNumber = ConfigureStatus.forNumber(this.status_);
                return configureStatusForNumber == null ? ConfigureStatus.ERROR_UNKNOWN : configureStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachConfiguration.StatusResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachConfiguration.internal_static_GDI_Proto_InReachConfiguration_StatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusResponse.class, Builder.class);
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
                                    if (ConfigureStatus.forNumber(i14) == null) {
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

            public Builder setStatus(ConfigureStatus configureStatus) {
                configureStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = configureStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StatusResponse getDefaultInstanceForType() {
                return StatusResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StatusResponse) {
                    return mergeFrom((StatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StatusResponse statusResponse) {
                if (statusResponse == StatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (statusResponse.hasStatus()) {
                    setStatus(statusResponse.getStatus());
                }
                mergeUnknownFields(statusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StatusResponse parseFrom(InputStream inputStream) {
            return (StatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (StatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum ConfigureStatus implements ProtocolMessageEnum {
        ERROR_UNKNOWN(1),
        ERROR_INVALID_UUID(2),
        DOWNLOADING(3),
        PARSING(4),
        PARSE_ERROR(5),
        OBJECT_ERROR(6),
        SUCCESS(7);

        public static final int DOWNLOADING_VALUE = 3;
        public static final int ERROR_INVALID_UUID_VALUE = 2;
        public static final int ERROR_UNKNOWN_VALUE = 1;
        public static final int OBJECT_ERROR_VALUE = 6;
        public static final int PARSE_ERROR_VALUE = 5;
        public static final int PARSING_VALUE = 4;
        public static final int SUCCESS_VALUE = 7;
        private final int value;
        private static final Internal.EnumLiteMap<ConfigureStatus> internalValueMap = new Internal.EnumLiteMap<ConfigureStatus>() { // from class: com.garmin.proto.generated.GDIInReachConfiguration.ConfigureStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ConfigureStatus findValueByNumber(int i14) {
                return ConfigureStatus.forNumber(i14);
            }
        };
        private static final ConfigureStatus[] VALUES = values();

        ConfigureStatus(int i14) {
            this.value = i14;
        }

        public static ConfigureStatus forNumber(int i14) {
            switch (i14) {
                case 1:
                    return ERROR_UNKNOWN;
                case 2:
                    return ERROR_INVALID_UUID;
                case 3:
                    return DOWNLOADING;
                case 4:
                    return PARSING;
                case 5:
                    return PARSE_ERROR;
                case 6:
                    return OBJECT_ERROR;
                case 7:
                    return SUCCESS;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIInReachConfiguration.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ConfigureStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static ConfigureStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ConfigureStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
