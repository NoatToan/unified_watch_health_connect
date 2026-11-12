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

/* JADX INFO: loaded from: classes6.dex */
public final class GDISimpleSetup {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014GDISimpleSetup.proto\u0012\u0015GDI.Proto.SimpleSetup\"²\u0004\n\u0012SimpleSetupService\u0012[\n\u001esupported_feature_list_request\u0018\u0001 \u0001(\u000b23.GDI.Proto.SimpleSetup.SupportedFeaturesListRequest\u0012]\n\u001fsupported_feature_list_response\u0018\u0002 \u0001(\u000b24.GDI.Proto.SimpleSetup.SupportedFeaturesListResponse\u0012b\n\"selected_restore_list_notification\u0018\u0003 \u0001(\u000b26.GDI.Proto.SimpleSetup.SelectedRestoreListNotification\u0012`\n!selected_sensor_list_notification\u0018\u0004 \u0001(\u000b25.GDI.Proto.SimpleSetup.SelectedSensorListNotification\u0012K\n\u0016alternate_mode_request\u0018\u0005 \u0001(\u000b2+.GDI.Proto.SimpleSetup.AlternateModeRequest\u0012M\n\u0017alternate_mode_response\u0018\u0006 \u0001(\u000b2,.GDI.Proto.SimpleSetup.AlternateModeResponse\"\u001e\n\u001cSupportedFeaturesListRequest\"P\n\u001dSupportedFeaturesListResponse\u0012/\n\u0007feature\u0018\u0001 \u0003(\u000b2\u001e.GDI.Proto.SimpleSetup.Feature\"[\n\u001fSelectedRestoreListNotification\u00128\n\ffeature_type\u0018\u0001 \u0003(\u000e2\".GDI.Proto.SimpleSetup.FeatureType\"X\n\u001eSelectedSensorListNotification\u00126\n\u000bsensor_type\u0018\u0001 \u0003(\u000e2!.GDI.Proto.SimpleSetup.SensorType\"T\n\u0014AlternateModeRequest\u0012<\n\u000erequested_mode\u0018\u0001 \u0001(\u000e2$.GDI.Proto.SimpleSetup.AlternateMode\"S\n\u0015AlternateModeResponse\u0012:\n\fcurrent_mode\u0018\u0001 \u0001(\u000e2$.GDI.Proto.SimpleSetup.AlternateMode\"]\n\u0007Feature\u00128\n\ffeature_type\u0018\u0001 \u0002(\u000e2\".GDI.Proto.SimpleSetup.FeatureType\u0012\u0018\n\u0010compatibility_id\u0018\u0002 \u0003(\u0005*l\n\u000bFeatureType\u0012\u001e\n\u001aACTIVITY_PROFILE_MIGRATION\u0010\u0001\u0012\u0013\n\u000fSENSOR_PRE_PAIR\u0010\u0002\u0012\u0014\n\u0010POPULAR_PROFILES\u0010\u0003\u0012\u0012\n\u000eALTERNATE_MODE\u0010\u0004*4\n\nSensorType\u0012\u000e\n\nHEART_RATE\u0010\u0001\u0012\t\n\u0005POWER\u0010\u0002\u0012\u000b\n\u0007CADENCE\u0010\u0003*\"\n\rAlternateMode\u0012\b\n\u0004NONE\u0010\u0000\u0012\u0007\n\u0003GYM\u0010\u0001B.\n\u001acom.garmin.proto.generatedB\u000eGDISimpleSetupH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SimpleSetup_AlternateModeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SimpleSetup_AlternateModeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SimpleSetup_AlternateModeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SimpleSetup_AlternateModeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SimpleSetup_Feature_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SimpleSetup_Feature_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SimpleSetup_SelectedRestoreListNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SimpleSetup_SelectedRestoreListNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SimpleSetup_SelectedSensorListNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SimpleSetup_SelectedSensorListNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SimpleSetup_SimpleSetupService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SimpleSetup_SimpleSetupService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListResponse_fieldAccessorTable;

    public interface AlternateModeRequestOrBuilder extends MessageOrBuilder {
        AlternateMode getRequestedMode();

        boolean hasRequestedMode();
    }

    public interface AlternateModeResponseOrBuilder extends MessageOrBuilder {
        AlternateMode getCurrentMode();

        boolean hasCurrentMode();
    }

    public interface FeatureOrBuilder extends MessageOrBuilder {
        int getCompatibilityId(int i14);

        int getCompatibilityIdCount();

        List<Integer> getCompatibilityIdList();

        FeatureType getFeatureType();

        boolean hasFeatureType();
    }

    public interface SelectedRestoreListNotificationOrBuilder extends MessageOrBuilder {
        FeatureType getFeatureType(int i14);

        int getFeatureTypeCount();

        List<FeatureType> getFeatureTypeList();
    }

    public interface SelectedSensorListNotificationOrBuilder extends MessageOrBuilder {
        SensorType getSensorType(int i14);

        int getSensorTypeCount();

        List<SensorType> getSensorTypeList();
    }

    public interface SimpleSetupServiceOrBuilder extends MessageOrBuilder {
        AlternateModeRequest getAlternateModeRequest();

        AlternateModeRequestOrBuilder getAlternateModeRequestOrBuilder();

        AlternateModeResponse getAlternateModeResponse();

        AlternateModeResponseOrBuilder getAlternateModeResponseOrBuilder();

        SelectedRestoreListNotification getSelectedRestoreListNotification();

        SelectedRestoreListNotificationOrBuilder getSelectedRestoreListNotificationOrBuilder();

        SelectedSensorListNotification getSelectedSensorListNotification();

        SelectedSensorListNotificationOrBuilder getSelectedSensorListNotificationOrBuilder();

        SupportedFeaturesListRequest getSupportedFeatureListRequest();

        SupportedFeaturesListRequestOrBuilder getSupportedFeatureListRequestOrBuilder();

        SupportedFeaturesListResponse getSupportedFeatureListResponse();

        SupportedFeaturesListResponseOrBuilder getSupportedFeatureListResponseOrBuilder();

        boolean hasAlternateModeRequest();

        boolean hasAlternateModeResponse();

        boolean hasSelectedRestoreListNotification();

        boolean hasSelectedSensorListNotification();

        boolean hasSupportedFeatureListRequest();

        boolean hasSupportedFeatureListResponse();
    }

    public interface SupportedFeaturesListRequestOrBuilder extends MessageOrBuilder {
    }

    public interface SupportedFeaturesListResponseOrBuilder extends MessageOrBuilder {
        Feature getFeature(int i14);

        int getFeatureCount();

        List<Feature> getFeatureList();

        FeatureOrBuilder getFeatureOrBuilder(int i14);

        List<? extends FeatureOrBuilder> getFeatureOrBuilderList();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SimpleSetup_SimpleSetupService_descriptor = descriptor2;
        internal_static_GDI_Proto_SimpleSetup_SimpleSetupService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SupportedFeatureListRequest", "SupportedFeatureListResponse", "SelectedRestoreListNotification", "SelectedSensorListNotification", "AlternateModeRequest", "AlternateModeResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Feature"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_SimpleSetup_SelectedRestoreListNotification_descriptor = descriptor5;
        internal_static_GDI_Proto_SimpleSetup_SelectedRestoreListNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"FeatureType"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_SimpleSetup_SelectedSensorListNotification_descriptor = descriptor6;
        internal_static_GDI_Proto_SimpleSetup_SelectedSensorListNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"SensorType"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_SimpleSetup_AlternateModeRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_SimpleSetup_AlternateModeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"RequestedMode"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_SimpleSetup_AlternateModeResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_SimpleSetup_AlternateModeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"CurrentMode"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_SimpleSetup_Feature_descriptor = descriptor9;
        internal_static_GDI_Proto_SimpleSetup_Feature_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"FeatureType", "CompatibilityId"});
    }

    private GDISimpleSetup() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class SupportedFeaturesListRequest extends GeneratedMessageV3 implements SupportedFeaturesListRequestOrBuilder {
        private static final SupportedFeaturesListRequest DEFAULT_INSTANCE = new SupportedFeaturesListRequest();

        @Deprecated
        public static final Parser<SupportedFeaturesListRequest> PARSER = new AbstractParser<SupportedFeaturesListRequest>() { // from class: com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListRequest.1
            @Override // com.google.protobuf.Parser
            public SupportedFeaturesListRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SupportedFeaturesListRequest.newBuilder();
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

        private SupportedFeaturesListRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SupportedFeaturesListRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListRequest_descriptor;
        }

        public static Builder newBuilder(SupportedFeaturesListRequest supportedFeaturesListRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(supportedFeaturesListRequest);
        }

        public static SupportedFeaturesListRequest parseDelimitedFrom(InputStream inputStream) {
            return (SupportedFeaturesListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SupportedFeaturesListRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SupportedFeaturesListRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SupportedFeaturesListRequest) {
                return getUnknownFields().equals(((SupportedFeaturesListRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SupportedFeaturesListRequest> getParserForType() {
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
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedFeaturesListRequest.class, Builder.class);
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
            return new SupportedFeaturesListRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportedFeaturesListRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedFeaturesListRequest build() {
                SupportedFeaturesListRequest supportedFeaturesListRequestBuildPartial = buildPartial();
                if (supportedFeaturesListRequestBuildPartial.isInitialized()) {
                    return supportedFeaturesListRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) supportedFeaturesListRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedFeaturesListRequest buildPartial() {
                SupportedFeaturesListRequest supportedFeaturesListRequest = new SupportedFeaturesListRequest(this);
                onBuilt();
                return supportedFeaturesListRequest;
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
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedFeaturesListRequest.class, Builder.class);
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
            public SupportedFeaturesListRequest getDefaultInstanceForType() {
                return SupportedFeaturesListRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SupportedFeaturesListRequest) {
                    return mergeFrom((SupportedFeaturesListRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SupportedFeaturesListRequest supportedFeaturesListRequest) {
                if (supportedFeaturesListRequest == SupportedFeaturesListRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(supportedFeaturesListRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SupportedFeaturesListRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SupportedFeaturesListRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SupportedFeaturesListRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SupportedFeaturesListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedFeaturesListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedFeaturesListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SupportedFeaturesListRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SupportedFeaturesListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SupportedFeaturesListRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SupportedFeaturesListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SupportedFeaturesListRequest parseFrom(InputStream inputStream) {
            return (SupportedFeaturesListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SupportedFeaturesListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedFeaturesListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedFeaturesListRequest parseFrom(CodedInputStream codedInputStream) {
            return (SupportedFeaturesListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SupportedFeaturesListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedFeaturesListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AlternateModeRequest extends GeneratedMessageV3 implements AlternateModeRequestOrBuilder {
        private static final AlternateModeRequest DEFAULT_INSTANCE = new AlternateModeRequest();

        @Deprecated
        public static final Parser<AlternateModeRequest> PARSER = new AbstractParser<AlternateModeRequest>() { // from class: com.garmin.proto.generated.GDISimpleSetup.AlternateModeRequest.1
            @Override // com.google.protobuf.Parser
            public AlternateModeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlternateModeRequest.newBuilder();
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
        public static final int REQUESTED_MODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int requestedMode_;

        private AlternateModeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.requestedMode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlternateModeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_AlternateModeRequest_descriptor;
        }

        public static Builder newBuilder(AlternateModeRequest alternateModeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alternateModeRequest);
        }

        public static AlternateModeRequest parseDelimitedFrom(InputStream inputStream) {
            return (AlternateModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlternateModeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlternateModeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlternateModeRequest)) {
                return super.equals(obj);
            }
            AlternateModeRequest alternateModeRequest = (AlternateModeRequest) obj;
            if (hasRequestedMode() != alternateModeRequest.hasRequestedMode()) {
                return false;
            }
            return (!hasRequestedMode() || this.requestedMode_ == alternateModeRequest.requestedMode_) && getUnknownFields().equals(alternateModeRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlternateModeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.AlternateModeRequestOrBuilder
        public AlternateMode getRequestedMode() {
            AlternateMode alternateModeForNumber = AlternateMode.forNumber(this.requestedMode_);
            return alternateModeForNumber == null ? AlternateMode.NONE : alternateModeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.requestedMode_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.AlternateModeRequestOrBuilder
        public boolean hasRequestedMode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRequestedMode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.requestedMode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_AlternateModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AlternateModeRequest.class, Builder.class);
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
            return new AlternateModeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.requestedMode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlternateModeRequestOrBuilder {
            private int bitField0_;
            private int requestedMode_;

            private Builder() {
                this.requestedMode_ = 0;
            }

            private void buildPartial0(AlternateModeRequest alternateModeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    alternateModeRequest.requestedMode_ = this.requestedMode_;
                } else {
                    i14 = 0;
                }
                alternateModeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_AlternateModeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlternateModeRequest build() {
                AlternateModeRequest alternateModeRequestBuildPartial = buildPartial();
                if (alternateModeRequestBuildPartial.isInitialized()) {
                    return alternateModeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alternateModeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlternateModeRequest buildPartial() {
                AlternateModeRequest alternateModeRequest = new AlternateModeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(alternateModeRequest);
                }
                onBuilt();
                return alternateModeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.requestedMode_ = 0;
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

            public Builder clearRequestedMode() {
                this.bitField0_ &= -2;
                this.requestedMode_ = 0;
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
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_AlternateModeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.AlternateModeRequestOrBuilder
            public AlternateMode getRequestedMode() {
                AlternateMode alternateModeForNumber = AlternateMode.forNumber(this.requestedMode_);
                return alternateModeForNumber == null ? AlternateMode.NONE : alternateModeForNumber;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.AlternateModeRequestOrBuilder
            public boolean hasRequestedMode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_AlternateModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AlternateModeRequest.class, Builder.class);
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
                                    if (AlternateMode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.requestedMode_ = i14;
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

            public Builder setRequestedMode(AlternateMode alternateMode) {
                alternateMode.getClass();
                this.bitField0_ |= 1;
                this.requestedMode_ = alternateMode.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlternateModeRequest getDefaultInstanceForType() {
                return AlternateModeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.requestedMode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlternateModeRequest) {
                    return mergeFrom((AlternateModeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlternateModeRequest alternateModeRequest) {
                if (alternateModeRequest == AlternateModeRequest.getDefaultInstance()) {
                    return this;
                }
                if (alternateModeRequest.hasRequestedMode()) {
                    setRequestedMode(alternateModeRequest.getRequestedMode());
                }
                mergeUnknownFields(alternateModeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlternateModeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AlternateModeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlternateModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlternateModeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ AlternateModeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AlternateModeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AlternateModeRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.requestedMode_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlternateModeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlternateModeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlternateModeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AlternateModeRequest parseFrom(InputStream inputStream) {
            return (AlternateModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AlternateModeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlternateModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlternateModeRequest parseFrom(CodedInputStream codedInputStream) {
            return (AlternateModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlternateModeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlternateModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AlternateModeResponse extends GeneratedMessageV3 implements AlternateModeResponseOrBuilder {
        public static final int CURRENT_MODE_FIELD_NUMBER = 1;
        private static final AlternateModeResponse DEFAULT_INSTANCE = new AlternateModeResponse();

        @Deprecated
        public static final Parser<AlternateModeResponse> PARSER = new AbstractParser<AlternateModeResponse>() { // from class: com.garmin.proto.generated.GDISimpleSetup.AlternateModeResponse.1
            @Override // com.google.protobuf.Parser
            public AlternateModeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlternateModeResponse.newBuilder();
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
        private int currentMode_;
        private byte memoizedIsInitialized;

        private AlternateModeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.currentMode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlternateModeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_AlternateModeResponse_descriptor;
        }

        public static Builder newBuilder(AlternateModeResponse alternateModeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alternateModeResponse);
        }

        public static AlternateModeResponse parseDelimitedFrom(InputStream inputStream) {
            return (AlternateModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlternateModeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlternateModeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlternateModeResponse)) {
                return super.equals(obj);
            }
            AlternateModeResponse alternateModeResponse = (AlternateModeResponse) obj;
            if (hasCurrentMode() != alternateModeResponse.hasCurrentMode()) {
                return false;
            }
            return (!hasCurrentMode() || this.currentMode_ == alternateModeResponse.currentMode_) && getUnknownFields().equals(alternateModeResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.AlternateModeResponseOrBuilder
        public AlternateMode getCurrentMode() {
            AlternateMode alternateModeForNumber = AlternateMode.forNumber(this.currentMode_);
            return alternateModeForNumber == null ? AlternateMode.NONE : alternateModeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlternateModeResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.currentMode_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.AlternateModeResponseOrBuilder
        public boolean hasCurrentMode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCurrentMode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.currentMode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_AlternateModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AlternateModeResponse.class, Builder.class);
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
            return new AlternateModeResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.currentMode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlternateModeResponseOrBuilder {
            private int bitField0_;
            private int currentMode_;

            private Builder() {
                this.currentMode_ = 0;
            }

            private void buildPartial0(AlternateModeResponse alternateModeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    alternateModeResponse.currentMode_ = this.currentMode_;
                } else {
                    i14 = 0;
                }
                alternateModeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_AlternateModeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlternateModeResponse build() {
                AlternateModeResponse alternateModeResponseBuildPartial = buildPartial();
                if (alternateModeResponseBuildPartial.isInitialized()) {
                    return alternateModeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alternateModeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlternateModeResponse buildPartial() {
                AlternateModeResponse alternateModeResponse = new AlternateModeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(alternateModeResponse);
                }
                onBuilt();
                return alternateModeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.currentMode_ = 0;
                return this;
            }

            public Builder clearCurrentMode() {
                this.bitField0_ &= -2;
                this.currentMode_ = 0;
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

            @Override // com.garmin.proto.generated.GDISimpleSetup.AlternateModeResponseOrBuilder
            public AlternateMode getCurrentMode() {
                AlternateMode alternateModeForNumber = AlternateMode.forNumber(this.currentMode_);
                return alternateModeForNumber == null ? AlternateMode.NONE : alternateModeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_AlternateModeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.AlternateModeResponseOrBuilder
            public boolean hasCurrentMode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_AlternateModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AlternateModeResponse.class, Builder.class);
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
                                    if (AlternateMode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.currentMode_ = i14;
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

            public Builder setCurrentMode(AlternateMode alternateMode) {
                alternateMode.getClass();
                this.bitField0_ |= 1;
                this.currentMode_ = alternateMode.getNumber();
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
            public AlternateModeResponse getDefaultInstanceForType() {
                return AlternateModeResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.currentMode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlternateModeResponse) {
                    return mergeFrom((AlternateModeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlternateModeResponse alternateModeResponse) {
                if (alternateModeResponse == AlternateModeResponse.getDefaultInstance()) {
                    return this;
                }
                if (alternateModeResponse.hasCurrentMode()) {
                    setCurrentMode(alternateModeResponse.getCurrentMode());
                }
                mergeUnknownFields(alternateModeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlternateModeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AlternateModeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlternateModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlternateModeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ AlternateModeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AlternateModeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AlternateModeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.currentMode_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlternateModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlternateModeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlternateModeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AlternateModeResponse parseFrom(InputStream inputStream) {
            return (AlternateModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AlternateModeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlternateModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlternateModeResponse parseFrom(CodedInputStream codedInputStream) {
            return (AlternateModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlternateModeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlternateModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Feature extends GeneratedMessageV3 implements FeatureOrBuilder {
        public static final int COMPATIBILITY_ID_FIELD_NUMBER = 2;
        public static final int FEATURE_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Internal.IntList compatibilityId_;
        private int featureType_;
        private byte memoizedIsInitialized;
        private static final Feature DEFAULT_INSTANCE = new Feature();

        @Deprecated
        public static final Parser<Feature> PARSER = new AbstractParser<Feature>() { // from class: com.garmin.proto.generated.GDISimpleSetup.Feature.1
            @Override // com.google.protobuf.Parser
            public Feature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Feature.newBuilder();
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

        private Feature() {
            this.featureType_ = 1;
            this.compatibilityId_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
            this.featureType_ = 1;
            this.compatibilityId_ = GeneratedMessageV3.emptyIntList();
        }

        public static Feature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_Feature_descriptor;
        }

        public static Builder newBuilder(Feature feature) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(feature);
        }

        public static Feature parseDelimitedFrom(InputStream inputStream) {
            return (Feature) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Feature parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Feature> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Feature)) {
                return super.equals(obj);
            }
            Feature feature = (Feature) obj;
            if (hasFeatureType() != feature.hasFeatureType()) {
                return false;
            }
            return (!hasFeatureType() || this.featureType_ == feature.featureType_) && getCompatibilityIdList().equals(feature.getCompatibilityIdList()) && getUnknownFields().equals(feature.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.FeatureOrBuilder
        public int getCompatibilityId(int i14) {
            return this.compatibilityId_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.FeatureOrBuilder
        public int getCompatibilityIdCount() {
            return this.compatibilityId_.size();
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.FeatureOrBuilder
        public List<Integer> getCompatibilityIdList() {
            return this.compatibilityId_;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.FeatureOrBuilder
        public FeatureType getFeatureType() {
            FeatureType featureTypeForNumber = FeatureType.forNumber(this.featureType_);
            return featureTypeForNumber == null ? FeatureType.ACTIVITY_PROFILE_MIGRATION : featureTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Feature> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.featureType_) : 0;
            int iComputeInt32SizeNoTag = 0;
            for (int i15 = 0; i15 < this.compatibilityId_.size(); i15++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.compatibilityId_.getInt(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getCompatibilityIdList().size() + iComputeEnumSize + iComputeInt32SizeNoTag;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.FeatureOrBuilder
        public boolean hasFeatureType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFeatureType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.featureType_;
            }
            if (getCompatibilityIdCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCompatibilityIdList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_Feature_fieldAccessorTable.ensureFieldAccessorsInitialized(Feature.class, Builder.class);
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
            if (hasFeatureType()) {
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
            return new Feature();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.featureType_);
            }
            for (int i14 = 0; i14 < this.compatibilityId_.size(); i14++) {
                codedOutputStream.writeInt32(2, this.compatibilityId_.getInt(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FeatureOrBuilder {
            private int bitField0_;
            private Internal.IntList compatibilityId_;
            private int featureType_;

            private Builder() {
                this.featureType_ = 1;
                this.compatibilityId_ = GeneratedMessageV3.emptyIntList();
            }

            private void buildPartial0(Feature feature) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    feature.featureType_ = this.featureType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    this.compatibilityId_.makeImmutable();
                    feature.compatibilityId_ = this.compatibilityId_;
                }
                feature.bitField0_ |= i14;
            }

            private void ensureCompatibilityIdIsMutable() {
                if (!this.compatibilityId_.isModifiable()) {
                    this.compatibilityId_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.compatibilityId_);
                }
                this.bitField0_ |= 2;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_Feature_descriptor;
            }

            public Builder addAllCompatibilityId(Iterable<? extends Integer> iterable) {
                ensureCompatibilityIdIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.compatibilityId_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addCompatibilityId(int i14) {
                ensureCompatibilityIdIsMutable();
                this.compatibilityId_.addInt(i14);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Feature build() {
                Feature featureBuildPartial = buildPartial();
                if (featureBuildPartial.isInitialized()) {
                    return featureBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) featureBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Feature buildPartial() {
                Feature feature = new Feature(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(feature);
                }
                onBuilt();
                return feature;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.featureType_ = 1;
                this.compatibilityId_ = GeneratedMessageV3.emptyIntList();
                return this;
            }

            public Builder clearCompatibilityId() {
                this.compatibilityId_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearFeatureType() {
                this.bitField0_ &= -2;
                this.featureType_ = 1;
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

            @Override // com.garmin.proto.generated.GDISimpleSetup.FeatureOrBuilder
            public int getCompatibilityId(int i14) {
                return this.compatibilityId_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.FeatureOrBuilder
            public int getCompatibilityIdCount() {
                return this.compatibilityId_.size();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.FeatureOrBuilder
            public List<Integer> getCompatibilityIdList() {
                this.compatibilityId_.makeImmutable();
                return this.compatibilityId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_Feature_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.FeatureOrBuilder
            public FeatureType getFeatureType() {
                FeatureType featureTypeForNumber = FeatureType.forNumber(this.featureType_);
                return featureTypeForNumber == null ? FeatureType.ACTIVITY_PROFILE_MIGRATION : featureTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.FeatureOrBuilder
            public boolean hasFeatureType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_Feature_fieldAccessorTable.ensureFieldAccessorsInitialized(Feature.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasFeatureType();
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
                                    if (FeatureType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.featureType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int int32 = codedInputStream.readInt32();
                                    ensureCompatibilityIdIsMutable();
                                    this.compatibilityId_.addInt(int32);
                                } else if (tag == 18) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureCompatibilityIdIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.compatibilityId_.addInt(codedInputStream.readInt32());
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

            public Builder setCompatibilityId(int i14, int i15) {
                ensureCompatibilityIdIsMutable();
                this.compatibilityId_.setInt(i14, i15);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFeatureType(FeatureType featureType) {
                featureType.getClass();
                this.bitField0_ |= 1;
                this.featureType_ = featureType.getNumber();
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
            public Feature getDefaultInstanceForType() {
                return Feature.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.featureType_ = 1;
                this.compatibilityId_ = GeneratedMessageV3.emptyIntList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Feature) {
                    return mergeFrom((Feature) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Feature feature) {
                if (feature == Feature.getDefaultInstance()) {
                    return this;
                }
                if (feature.hasFeatureType()) {
                    setFeatureType(feature.getFeatureType());
                }
                if (!feature.compatibilityId_.isEmpty()) {
                    if (this.compatibilityId_.isEmpty()) {
                        Internal.IntList intList = feature.compatibilityId_;
                        this.compatibilityId_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 2;
                    } else {
                        ensureCompatibilityIdIsMutable();
                        this.compatibilityId_.addAll(feature.compatibilityId_);
                    }
                    onChanged();
                }
                mergeUnknownFields(feature.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Feature getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Feature parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Feature) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Feature parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Feature parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Feature parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Feature parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Feature parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Feature parseFrom(InputStream inputStream) {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Feature parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Feature parseFrom(CodedInputStream codedInputStream) {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Feature parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Feature(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.featureType_ = 1;
            this.compatibilityId_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ Feature(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SelectedRestoreListNotification extends GeneratedMessageV3 implements SelectedRestoreListNotificationOrBuilder {
        public static final int FEATURE_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Integer> featureType_;
        private byte memoizedIsInitialized;
        private static final Internal.ListAdapter.Converter<Integer, FeatureType> featureType_converter_ = new Internal.ListAdapter.Converter<Integer, FeatureType>() { // from class: com.garmin.proto.generated.GDISimpleSetup.SelectedRestoreListNotification.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public FeatureType convert(Integer num) {
                FeatureType featureTypeForNumber = FeatureType.forNumber(num.intValue());
                return featureTypeForNumber == null ? FeatureType.ACTIVITY_PROFILE_MIGRATION : featureTypeForNumber;
            }
        };
        private static final SelectedRestoreListNotification DEFAULT_INSTANCE = new SelectedRestoreListNotification();

        @Deprecated
        public static final Parser<SelectedRestoreListNotification> PARSER = new AbstractParser<SelectedRestoreListNotification>() { // from class: com.garmin.proto.generated.GDISimpleSetup.SelectedRestoreListNotification.2
            @Override // com.google.protobuf.Parser
            public SelectedRestoreListNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SelectedRestoreListNotification.newBuilder();
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

        private SelectedRestoreListNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.featureType_ = Collections.EMPTY_LIST;
        }

        public static SelectedRestoreListNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SelectedRestoreListNotification_descriptor;
        }

        public static Builder newBuilder(SelectedRestoreListNotification selectedRestoreListNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(selectedRestoreListNotification);
        }

        public static SelectedRestoreListNotification parseDelimitedFrom(InputStream inputStream) {
            return (SelectedRestoreListNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SelectedRestoreListNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SelectedRestoreListNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectedRestoreListNotification)) {
                return super.equals(obj);
            }
            SelectedRestoreListNotification selectedRestoreListNotification = (SelectedRestoreListNotification) obj;
            return this.featureType_.equals(selectedRestoreListNotification.featureType_) && getUnknownFields().equals(selectedRestoreListNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedRestoreListNotificationOrBuilder
        public FeatureType getFeatureType(int i14) {
            return featureType_converter_.convert(this.featureType_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedRestoreListNotificationOrBuilder
        public int getFeatureTypeCount() {
            return this.featureType_.size();
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedRestoreListNotificationOrBuilder
        public List<FeatureType> getFeatureTypeList() {
            return new Internal.ListAdapter(this.featureType_, featureType_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SelectedRestoreListNotification> getParserForType() {
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
                int size = this.featureType_.size();
                List<Integer> list = this.featureType_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getFeatureTypeCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.featureType_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SelectedRestoreListNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectedRestoreListNotification.class, Builder.class);
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
            return new SelectedRestoreListNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.featureType_.size()) {
                iF = f3.f(this.featureType_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SelectedRestoreListNotificationOrBuilder {
            private int bitField0_;
            private List<Integer> featureType_;

            private Builder() {
                this.featureType_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SelectedRestoreListNotification selectedRestoreListNotification) {
            }

            private void buildPartialRepeatedFields(SelectedRestoreListNotification selectedRestoreListNotification) {
                if ((this.bitField0_ & 1) != 0) {
                    this.featureType_ = Collections.unmodifiableList(this.featureType_);
                    this.bitField0_ &= -2;
                }
                selectedRestoreListNotification.featureType_ = this.featureType_;
            }

            private void ensureFeatureTypeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.featureType_ = new ArrayList(this.featureType_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SelectedRestoreListNotification_descriptor;
            }

            public Builder addAllFeatureType(Iterable<? extends FeatureType> iterable) {
                ensureFeatureTypeIsMutable();
                Iterator<? extends FeatureType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.featureType_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addFeatureType(FeatureType featureType) {
                featureType.getClass();
                ensureFeatureTypeIsMutable();
                this.featureType_.add(Integer.valueOf(featureType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SelectedRestoreListNotification build() {
                SelectedRestoreListNotification selectedRestoreListNotificationBuildPartial = buildPartial();
                if (selectedRestoreListNotificationBuildPartial.isInitialized()) {
                    return selectedRestoreListNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) selectedRestoreListNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SelectedRestoreListNotification buildPartial() {
                SelectedRestoreListNotification selectedRestoreListNotification = new SelectedRestoreListNotification(this);
                buildPartialRepeatedFields(selectedRestoreListNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(selectedRestoreListNotification);
                }
                onBuilt();
                return selectedRestoreListNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.featureType_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                return this;
            }

            public Builder clearFeatureType() {
                this.featureType_ = Collections.EMPTY_LIST;
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
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SelectedRestoreListNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedRestoreListNotificationOrBuilder
            public FeatureType getFeatureType(int i14) {
                return (FeatureType) SelectedRestoreListNotification.featureType_converter_.convert(this.featureType_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedRestoreListNotificationOrBuilder
            public int getFeatureTypeCount() {
                return this.featureType_.size();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedRestoreListNotificationOrBuilder
            public List<FeatureType> getFeatureTypeList() {
                return new Internal.ListAdapter(this.featureType_, SelectedRestoreListNotification.featureType_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SelectedRestoreListNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectedRestoreListNotification.class, Builder.class);
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
                                    if (FeatureType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureFeatureTypeIsMutable();
                                        this.featureType_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (FeatureType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureFeatureTypeIsMutable();
                                            this.featureType_.add(Integer.valueOf(i15));
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

            public Builder setFeatureType(int i14, FeatureType featureType) {
                featureType.getClass();
                ensureFeatureTypeIsMutable();
                this.featureType_.set(i14, Integer.valueOf(featureType.getNumber()));
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
            public SelectedRestoreListNotification getDefaultInstanceForType() {
                return SelectedRestoreListNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.featureType_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SelectedRestoreListNotification) {
                    return mergeFrom((SelectedRestoreListNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SelectedRestoreListNotification selectedRestoreListNotification) {
                if (selectedRestoreListNotification == SelectedRestoreListNotification.getDefaultInstance()) {
                    return this;
                }
                if (!selectedRestoreListNotification.featureType_.isEmpty()) {
                    if (this.featureType_.isEmpty()) {
                        this.featureType_ = selectedRestoreListNotification.featureType_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFeatureTypeIsMutable();
                        this.featureType_.addAll(selectedRestoreListNotification.featureType_);
                    }
                    onChanged();
                }
                mergeUnknownFields(selectedRestoreListNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SelectedRestoreListNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SelectedRestoreListNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectedRestoreListNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SelectedRestoreListNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SelectedRestoreListNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SelectedRestoreListNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SelectedRestoreListNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SelectedRestoreListNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SelectedRestoreListNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SelectedRestoreListNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SelectedRestoreListNotification parseFrom(InputStream inputStream) {
            return (SelectedRestoreListNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SelectedRestoreListNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectedRestoreListNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SelectedRestoreListNotification parseFrom(CodedInputStream codedInputStream) {
            return (SelectedRestoreListNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SelectedRestoreListNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectedRestoreListNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SelectedSensorListNotification extends GeneratedMessageV3 implements SelectedSensorListNotificationOrBuilder {
        public static final int SENSOR_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<Integer> sensorType_;
        private static final Internal.ListAdapter.Converter<Integer, SensorType> sensorType_converter_ = new Internal.ListAdapter.Converter<Integer, SensorType>() { // from class: com.garmin.proto.generated.GDISimpleSetup.SelectedSensorListNotification.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public SensorType convert(Integer num) {
                SensorType sensorTypeForNumber = SensorType.forNumber(num.intValue());
                return sensorTypeForNumber == null ? SensorType.HEART_RATE : sensorTypeForNumber;
            }
        };
        private static final SelectedSensorListNotification DEFAULT_INSTANCE = new SelectedSensorListNotification();

        @Deprecated
        public static final Parser<SelectedSensorListNotification> PARSER = new AbstractParser<SelectedSensorListNotification>() { // from class: com.garmin.proto.generated.GDISimpleSetup.SelectedSensorListNotification.2
            @Override // com.google.protobuf.Parser
            public SelectedSensorListNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SelectedSensorListNotification.newBuilder();
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

        private SelectedSensorListNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.sensorType_ = Collections.EMPTY_LIST;
        }

        public static SelectedSensorListNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SelectedSensorListNotification_descriptor;
        }

        public static Builder newBuilder(SelectedSensorListNotification selectedSensorListNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(selectedSensorListNotification);
        }

        public static SelectedSensorListNotification parseDelimitedFrom(InputStream inputStream) {
            return (SelectedSensorListNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SelectedSensorListNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SelectedSensorListNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectedSensorListNotification)) {
                return super.equals(obj);
            }
            SelectedSensorListNotification selectedSensorListNotification = (SelectedSensorListNotification) obj;
            return this.sensorType_.equals(selectedSensorListNotification.sensorType_) && getUnknownFields().equals(selectedSensorListNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SelectedSensorListNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedSensorListNotificationOrBuilder
        public SensorType getSensorType(int i14) {
            return sensorType_converter_.convert(this.sensorType_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedSensorListNotificationOrBuilder
        public int getSensorTypeCount() {
            return this.sensorType_.size();
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedSensorListNotificationOrBuilder
        public List<SensorType> getSensorTypeList() {
            return new Internal.ListAdapter(this.sensorType_, sensorType_converter_);
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
                int size = this.sensorType_.size();
                List<Integer> list = this.sensorType_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSensorTypeCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.sensorType_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SelectedSensorListNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectedSensorListNotification.class, Builder.class);
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
            return new SelectedSensorListNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.sensorType_.size()) {
                iF = f3.f(this.sensorType_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SelectedSensorListNotificationOrBuilder {
            private int bitField0_;
            private List<Integer> sensorType_;

            private Builder() {
                this.sensorType_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SelectedSensorListNotification selectedSensorListNotification) {
            }

            private void buildPartialRepeatedFields(SelectedSensorListNotification selectedSensorListNotification) {
                if ((this.bitField0_ & 1) != 0) {
                    this.sensorType_ = Collections.unmodifiableList(this.sensorType_);
                    this.bitField0_ &= -2;
                }
                selectedSensorListNotification.sensorType_ = this.sensorType_;
            }

            private void ensureSensorTypeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.sensorType_ = new ArrayList(this.sensorType_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SelectedSensorListNotification_descriptor;
            }

            public Builder addAllSensorType(Iterable<? extends SensorType> iterable) {
                ensureSensorTypeIsMutable();
                Iterator<? extends SensorType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.sensorType_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSensorType(SensorType sensorType) {
                sensorType.getClass();
                ensureSensorTypeIsMutable();
                this.sensorType_.add(Integer.valueOf(sensorType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SelectedSensorListNotification build() {
                SelectedSensorListNotification selectedSensorListNotificationBuildPartial = buildPartial();
                if (selectedSensorListNotificationBuildPartial.isInitialized()) {
                    return selectedSensorListNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) selectedSensorListNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SelectedSensorListNotification buildPartial() {
                SelectedSensorListNotification selectedSensorListNotification = new SelectedSensorListNotification(this);
                buildPartialRepeatedFields(selectedSensorListNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(selectedSensorListNotification);
                }
                onBuilt();
                return selectedSensorListNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sensorType_ = Collections.EMPTY_LIST;
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

            public Builder clearSensorType() {
                this.sensorType_ = Collections.EMPTY_LIST;
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
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SelectedSensorListNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedSensorListNotificationOrBuilder
            public SensorType getSensorType(int i14) {
                return (SensorType) SelectedSensorListNotification.sensorType_converter_.convert(this.sensorType_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedSensorListNotificationOrBuilder
            public int getSensorTypeCount() {
                return this.sensorType_.size();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SelectedSensorListNotificationOrBuilder
            public List<SensorType> getSensorTypeList() {
                return new Internal.ListAdapter(this.sensorType_, SelectedSensorListNotification.sensorType_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SelectedSensorListNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectedSensorListNotification.class, Builder.class);
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
                                    if (SensorType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureSensorTypeIsMutable();
                                        this.sensorType_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (SensorType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureSensorTypeIsMutable();
                                            this.sensorType_.add(Integer.valueOf(i15));
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

            public Builder setSensorType(int i14, SensorType sensorType) {
                sensorType.getClass();
                ensureSensorTypeIsMutable();
                this.sensorType_.set(i14, Integer.valueOf(sensorType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SelectedSensorListNotification getDefaultInstanceForType() {
                return SelectedSensorListNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sensorType_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SelectedSensorListNotification) {
                    return mergeFrom((SelectedSensorListNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SelectedSensorListNotification selectedSensorListNotification) {
                if (selectedSensorListNotification == SelectedSensorListNotification.getDefaultInstance()) {
                    return this;
                }
                if (!selectedSensorListNotification.sensorType_.isEmpty()) {
                    if (this.sensorType_.isEmpty()) {
                        this.sensorType_ = selectedSensorListNotification.sensorType_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSensorTypeIsMutable();
                        this.sensorType_.addAll(selectedSensorListNotification.sensorType_);
                    }
                    onChanged();
                }
                mergeUnknownFields(selectedSensorListNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SelectedSensorListNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SelectedSensorListNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectedSensorListNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SelectedSensorListNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SelectedSensorListNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SelectedSensorListNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SelectedSensorListNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SelectedSensorListNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SelectedSensorListNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SelectedSensorListNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SelectedSensorListNotification parseFrom(InputStream inputStream) {
            return (SelectedSensorListNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SelectedSensorListNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectedSensorListNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SelectedSensorListNotification parseFrom(CodedInputStream codedInputStream) {
            return (SelectedSensorListNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SelectedSensorListNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectedSensorListNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SimpleSetupService extends GeneratedMessageV3 implements SimpleSetupServiceOrBuilder {
        public static final int ALTERNATE_MODE_REQUEST_FIELD_NUMBER = 5;
        public static final int ALTERNATE_MODE_RESPONSE_FIELD_NUMBER = 6;
        private static final SimpleSetupService DEFAULT_INSTANCE = new SimpleSetupService();

        @Deprecated
        public static final Parser<SimpleSetupService> PARSER = new AbstractParser<SimpleSetupService>() { // from class: com.garmin.proto.generated.GDISimpleSetup.SimpleSetupService.1
            @Override // com.google.protobuf.Parser
            public SimpleSetupService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SimpleSetupService.newBuilder();
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
        public static final int SELECTED_RESTORE_LIST_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int SELECTED_SENSOR_LIST_NOTIFICATION_FIELD_NUMBER = 4;
        public static final int SUPPORTED_FEATURE_LIST_REQUEST_FIELD_NUMBER = 1;
        public static final int SUPPORTED_FEATURE_LIST_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private AlternateModeRequest alternateModeRequest_;
        private AlternateModeResponse alternateModeResponse_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SelectedRestoreListNotification selectedRestoreListNotification_;
        private SelectedSensorListNotification selectedSensorListNotification_;
        private SupportedFeaturesListRequest supportedFeatureListRequest_;
        private SupportedFeaturesListResponse supportedFeatureListResponse_;

        private SimpleSetupService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SimpleSetupService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SimpleSetupService_descriptor;
        }

        public static Builder newBuilder(SimpleSetupService simpleSetupService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(simpleSetupService);
        }

        public static SimpleSetupService parseDelimitedFrom(InputStream inputStream) {
            return (SimpleSetupService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SimpleSetupService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SimpleSetupService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SimpleSetupService)) {
                return super.equals(obj);
            }
            SimpleSetupService simpleSetupService = (SimpleSetupService) obj;
            if (hasSupportedFeatureListRequest() != simpleSetupService.hasSupportedFeatureListRequest()) {
                return false;
            }
            if ((hasSupportedFeatureListRequest() && !getSupportedFeatureListRequest().equals(simpleSetupService.getSupportedFeatureListRequest())) || hasSupportedFeatureListResponse() != simpleSetupService.hasSupportedFeatureListResponse()) {
                return false;
            }
            if ((hasSupportedFeatureListResponse() && !getSupportedFeatureListResponse().equals(simpleSetupService.getSupportedFeatureListResponse())) || hasSelectedRestoreListNotification() != simpleSetupService.hasSelectedRestoreListNotification()) {
                return false;
            }
            if ((hasSelectedRestoreListNotification() && !getSelectedRestoreListNotification().equals(simpleSetupService.getSelectedRestoreListNotification())) || hasSelectedSensorListNotification() != simpleSetupService.hasSelectedSensorListNotification()) {
                return false;
            }
            if ((hasSelectedSensorListNotification() && !getSelectedSensorListNotification().equals(simpleSetupService.getSelectedSensorListNotification())) || hasAlternateModeRequest() != simpleSetupService.hasAlternateModeRequest()) {
                return false;
            }
            if ((!hasAlternateModeRequest() || getAlternateModeRequest().equals(simpleSetupService.getAlternateModeRequest())) && hasAlternateModeResponse() == simpleSetupService.hasAlternateModeResponse()) {
                return (!hasAlternateModeResponse() || getAlternateModeResponse().equals(simpleSetupService.getAlternateModeResponse())) && getUnknownFields().equals(simpleSetupService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public AlternateModeRequest getAlternateModeRequest() {
            AlternateModeRequest alternateModeRequest = this.alternateModeRequest_;
            return alternateModeRequest == null ? AlternateModeRequest.getDefaultInstance() : alternateModeRequest;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public AlternateModeRequestOrBuilder getAlternateModeRequestOrBuilder() {
            AlternateModeRequest alternateModeRequest = this.alternateModeRequest_;
            return alternateModeRequest == null ? AlternateModeRequest.getDefaultInstance() : alternateModeRequest;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public AlternateModeResponse getAlternateModeResponse() {
            AlternateModeResponse alternateModeResponse = this.alternateModeResponse_;
            return alternateModeResponse == null ? AlternateModeResponse.getDefaultInstance() : alternateModeResponse;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public AlternateModeResponseOrBuilder getAlternateModeResponseOrBuilder() {
            AlternateModeResponse alternateModeResponse = this.alternateModeResponse_;
            return alternateModeResponse == null ? AlternateModeResponse.getDefaultInstance() : alternateModeResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SimpleSetupService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public SelectedRestoreListNotification getSelectedRestoreListNotification() {
            SelectedRestoreListNotification selectedRestoreListNotification = this.selectedRestoreListNotification_;
            return selectedRestoreListNotification == null ? SelectedRestoreListNotification.getDefaultInstance() : selectedRestoreListNotification;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public SelectedRestoreListNotificationOrBuilder getSelectedRestoreListNotificationOrBuilder() {
            SelectedRestoreListNotification selectedRestoreListNotification = this.selectedRestoreListNotification_;
            return selectedRestoreListNotification == null ? SelectedRestoreListNotification.getDefaultInstance() : selectedRestoreListNotification;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public SelectedSensorListNotification getSelectedSensorListNotification() {
            SelectedSensorListNotification selectedSensorListNotification = this.selectedSensorListNotification_;
            return selectedSensorListNotification == null ? SelectedSensorListNotification.getDefaultInstance() : selectedSensorListNotification;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public SelectedSensorListNotificationOrBuilder getSelectedSensorListNotificationOrBuilder() {
            SelectedSensorListNotification selectedSensorListNotification = this.selectedSensorListNotification_;
            return selectedSensorListNotification == null ? SelectedSensorListNotification.getDefaultInstance() : selectedSensorListNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSupportedFeatureListRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSupportedFeatureListResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getSelectedRestoreListNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getSelectedSensorListNotification());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getAlternateModeRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getAlternateModeResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public SupportedFeaturesListRequest getSupportedFeatureListRequest() {
            SupportedFeaturesListRequest supportedFeaturesListRequest = this.supportedFeatureListRequest_;
            return supportedFeaturesListRequest == null ? SupportedFeaturesListRequest.getDefaultInstance() : supportedFeaturesListRequest;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public SupportedFeaturesListRequestOrBuilder getSupportedFeatureListRequestOrBuilder() {
            SupportedFeaturesListRequest supportedFeaturesListRequest = this.supportedFeatureListRequest_;
            return supportedFeaturesListRequest == null ? SupportedFeaturesListRequest.getDefaultInstance() : supportedFeaturesListRequest;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public SupportedFeaturesListResponse getSupportedFeatureListResponse() {
            SupportedFeaturesListResponse supportedFeaturesListResponse = this.supportedFeatureListResponse_;
            return supportedFeaturesListResponse == null ? SupportedFeaturesListResponse.getDefaultInstance() : supportedFeaturesListResponse;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public SupportedFeaturesListResponseOrBuilder getSupportedFeatureListResponseOrBuilder() {
            SupportedFeaturesListResponse supportedFeaturesListResponse = this.supportedFeatureListResponse_;
            return supportedFeaturesListResponse == null ? SupportedFeaturesListResponse.getDefaultInstance() : supportedFeaturesListResponse;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public boolean hasAlternateModeRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public boolean hasAlternateModeResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public boolean hasSelectedRestoreListNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public boolean hasSelectedSensorListNotification() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public boolean hasSupportedFeatureListRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
        public boolean hasSupportedFeatureListResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSupportedFeatureListRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSupportedFeatureListRequest().hashCode();
            }
            if (hasSupportedFeatureListResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSupportedFeatureListResponse().hashCode();
            }
            if (hasSelectedRestoreListNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSelectedRestoreListNotification().hashCode();
            }
            if (hasSelectedSensorListNotification()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSelectedSensorListNotification().hashCode();
            }
            if (hasAlternateModeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getAlternateModeRequest().hashCode();
            }
            if (hasAlternateModeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getAlternateModeResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SimpleSetupService_fieldAccessorTable.ensureFieldAccessorsInitialized(SimpleSetupService.class, Builder.class);
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
            if (!hasSupportedFeatureListResponse() || getSupportedFeatureListResponse().isInitialized()) {
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
            return new SimpleSetupService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSupportedFeatureListRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSupportedFeatureListResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSelectedRestoreListNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSelectedSensorListNotification());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getAlternateModeRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getAlternateModeResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SimpleSetupServiceOrBuilder {
            private SingleFieldBuilderV3<AlternateModeRequest, AlternateModeRequest.Builder, AlternateModeRequestOrBuilder> alternateModeRequestBuilder_;
            private AlternateModeRequest alternateModeRequest_;
            private SingleFieldBuilderV3<AlternateModeResponse, AlternateModeResponse.Builder, AlternateModeResponseOrBuilder> alternateModeResponseBuilder_;
            private AlternateModeResponse alternateModeResponse_;
            private int bitField0_;
            private SingleFieldBuilderV3<SelectedRestoreListNotification, SelectedRestoreListNotification.Builder, SelectedRestoreListNotificationOrBuilder> selectedRestoreListNotificationBuilder_;
            private SelectedRestoreListNotification selectedRestoreListNotification_;
            private SingleFieldBuilderV3<SelectedSensorListNotification, SelectedSensorListNotification.Builder, SelectedSensorListNotificationOrBuilder> selectedSensorListNotificationBuilder_;
            private SelectedSensorListNotification selectedSensorListNotification_;
            private SingleFieldBuilderV3<SupportedFeaturesListRequest, SupportedFeaturesListRequest.Builder, SupportedFeaturesListRequestOrBuilder> supportedFeatureListRequestBuilder_;
            private SupportedFeaturesListRequest supportedFeatureListRequest_;
            private SingleFieldBuilderV3<SupportedFeaturesListResponse, SupportedFeaturesListResponse.Builder, SupportedFeaturesListResponseOrBuilder> supportedFeatureListResponseBuilder_;
            private SupportedFeaturesListResponse supportedFeatureListResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SimpleSetupService simpleSetupService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SupportedFeaturesListRequest, SupportedFeaturesListRequest.Builder, SupportedFeaturesListRequestOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListRequestBuilder_;
                    simpleSetupService.supportedFeatureListRequest_ = singleFieldBuilderV3 == null ? this.supportedFeatureListRequest_ : (SupportedFeaturesListRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SupportedFeaturesListResponse, SupportedFeaturesListResponse.Builder, SupportedFeaturesListResponseOrBuilder> singleFieldBuilderV4 = this.supportedFeatureListResponseBuilder_;
                    simpleSetupService.supportedFeatureListResponse_ = singleFieldBuilderV4 == null ? this.supportedFeatureListResponse_ : (SupportedFeaturesListResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SelectedRestoreListNotification, SelectedRestoreListNotification.Builder, SelectedRestoreListNotificationOrBuilder> singleFieldBuilderV5 = this.selectedRestoreListNotificationBuilder_;
                    simpleSetupService.selectedRestoreListNotification_ = singleFieldBuilderV5 == null ? this.selectedRestoreListNotification_ : (SelectedRestoreListNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<SelectedSensorListNotification, SelectedSensorListNotification.Builder, SelectedSensorListNotificationOrBuilder> singleFieldBuilderV6 = this.selectedSensorListNotificationBuilder_;
                    simpleSetupService.selectedSensorListNotification_ = singleFieldBuilderV6 == null ? this.selectedSensorListNotification_ : (SelectedSensorListNotification) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<AlternateModeRequest, AlternateModeRequest.Builder, AlternateModeRequestOrBuilder> singleFieldBuilderV7 = this.alternateModeRequestBuilder_;
                    simpleSetupService.alternateModeRequest_ = singleFieldBuilderV7 == null ? this.alternateModeRequest_ : (AlternateModeRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<AlternateModeResponse, AlternateModeResponse.Builder, AlternateModeResponseOrBuilder> singleFieldBuilderV8 = this.alternateModeResponseBuilder_;
                    simpleSetupService.alternateModeResponse_ = singleFieldBuilderV8 == null ? this.alternateModeResponse_ : (AlternateModeResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                simpleSetupService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AlternateModeRequest, AlternateModeRequest.Builder, AlternateModeRequestOrBuilder> getAlternateModeRequestFieldBuilder() {
                if (this.alternateModeRequestBuilder_ == null) {
                    this.alternateModeRequestBuilder_ = new SingleFieldBuilderV3<>(getAlternateModeRequest(), getParentForChildren(), isClean());
                    this.alternateModeRequest_ = null;
                }
                return this.alternateModeRequestBuilder_;
            }

            private SingleFieldBuilderV3<AlternateModeResponse, AlternateModeResponse.Builder, AlternateModeResponseOrBuilder> getAlternateModeResponseFieldBuilder() {
                if (this.alternateModeResponseBuilder_ == null) {
                    this.alternateModeResponseBuilder_ = new SingleFieldBuilderV3<>(getAlternateModeResponse(), getParentForChildren(), isClean());
                    this.alternateModeResponse_ = null;
                }
                return this.alternateModeResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SimpleSetupService_descriptor;
            }

            private SingleFieldBuilderV3<SelectedRestoreListNotification, SelectedRestoreListNotification.Builder, SelectedRestoreListNotificationOrBuilder> getSelectedRestoreListNotificationFieldBuilder() {
                if (this.selectedRestoreListNotificationBuilder_ == null) {
                    this.selectedRestoreListNotificationBuilder_ = new SingleFieldBuilderV3<>(getSelectedRestoreListNotification(), getParentForChildren(), isClean());
                    this.selectedRestoreListNotification_ = null;
                }
                return this.selectedRestoreListNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SelectedSensorListNotification, SelectedSensorListNotification.Builder, SelectedSensorListNotificationOrBuilder> getSelectedSensorListNotificationFieldBuilder() {
                if (this.selectedSensorListNotificationBuilder_ == null) {
                    this.selectedSensorListNotificationBuilder_ = new SingleFieldBuilderV3<>(getSelectedSensorListNotification(), getParentForChildren(), isClean());
                    this.selectedSensorListNotification_ = null;
                }
                return this.selectedSensorListNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SupportedFeaturesListRequest, SupportedFeaturesListRequest.Builder, SupportedFeaturesListRequestOrBuilder> getSupportedFeatureListRequestFieldBuilder() {
                if (this.supportedFeatureListRequestBuilder_ == null) {
                    this.supportedFeatureListRequestBuilder_ = new SingleFieldBuilderV3<>(getSupportedFeatureListRequest(), getParentForChildren(), isClean());
                    this.supportedFeatureListRequest_ = null;
                }
                return this.supportedFeatureListRequestBuilder_;
            }

            private SingleFieldBuilderV3<SupportedFeaturesListResponse, SupportedFeaturesListResponse.Builder, SupportedFeaturesListResponseOrBuilder> getSupportedFeatureListResponseFieldBuilder() {
                if (this.supportedFeatureListResponseBuilder_ == null) {
                    this.supportedFeatureListResponseBuilder_ = new SingleFieldBuilderV3<>(getSupportedFeatureListResponse(), getParentForChildren(), isClean());
                    this.supportedFeatureListResponse_ = null;
                }
                return this.supportedFeatureListResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSupportedFeatureListRequestFieldBuilder();
                    getSupportedFeatureListResponseFieldBuilder();
                    getSelectedRestoreListNotificationFieldBuilder();
                    getSelectedSensorListNotificationFieldBuilder();
                    getAlternateModeRequestFieldBuilder();
                    getAlternateModeResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SimpleSetupService build() {
                SimpleSetupService simpleSetupServiceBuildPartial = buildPartial();
                if (simpleSetupServiceBuildPartial.isInitialized()) {
                    return simpleSetupServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) simpleSetupServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SimpleSetupService buildPartial() {
                SimpleSetupService simpleSetupService = new SimpleSetupService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(simpleSetupService);
                }
                onBuilt();
                return simpleSetupService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.supportedFeatureListRequest_ = null;
                SingleFieldBuilderV3<SupportedFeaturesListRequest, SupportedFeaturesListRequest.Builder, SupportedFeaturesListRequestOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportedFeatureListRequestBuilder_ = null;
                }
                this.supportedFeatureListResponse_ = null;
                SingleFieldBuilderV3<SupportedFeaturesListResponse, SupportedFeaturesListResponse.Builder, SupportedFeaturesListResponseOrBuilder> singleFieldBuilderV4 = this.supportedFeatureListResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.supportedFeatureListResponseBuilder_ = null;
                }
                this.selectedRestoreListNotification_ = null;
                SingleFieldBuilderV3<SelectedRestoreListNotification, SelectedRestoreListNotification.Builder, SelectedRestoreListNotificationOrBuilder> singleFieldBuilderV5 = this.selectedRestoreListNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.selectedRestoreListNotificationBuilder_ = null;
                }
                this.selectedSensorListNotification_ = null;
                SingleFieldBuilderV3<SelectedSensorListNotification, SelectedSensorListNotification.Builder, SelectedSensorListNotificationOrBuilder> singleFieldBuilderV6 = this.selectedSensorListNotificationBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.selectedSensorListNotificationBuilder_ = null;
                }
                this.alternateModeRequest_ = null;
                SingleFieldBuilderV3<AlternateModeRequest, AlternateModeRequest.Builder, AlternateModeRequestOrBuilder> singleFieldBuilderV7 = this.alternateModeRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.alternateModeRequestBuilder_ = null;
                }
                this.alternateModeResponse_ = null;
                SingleFieldBuilderV3<AlternateModeResponse, AlternateModeResponse.Builder, AlternateModeResponseOrBuilder> singleFieldBuilderV8 = this.alternateModeResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.alternateModeResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearAlternateModeRequest() {
                this.bitField0_ &= -17;
                this.alternateModeRequest_ = null;
                SingleFieldBuilderV3<AlternateModeRequest, AlternateModeRequest.Builder, AlternateModeRequestOrBuilder> singleFieldBuilderV3 = this.alternateModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.alternateModeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAlternateModeResponse() {
                this.bitField0_ &= -33;
                this.alternateModeResponse_ = null;
                SingleFieldBuilderV3<AlternateModeResponse, AlternateModeResponse.Builder, AlternateModeResponseOrBuilder> singleFieldBuilderV3 = this.alternateModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.alternateModeResponseBuilder_ = null;
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

            public Builder clearSelectedRestoreListNotification() {
                this.bitField0_ &= -5;
                this.selectedRestoreListNotification_ = null;
                SingleFieldBuilderV3<SelectedRestoreListNotification, SelectedRestoreListNotification.Builder, SelectedRestoreListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedRestoreListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.selectedRestoreListNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSelectedSensorListNotification() {
                this.bitField0_ &= -9;
                this.selectedSensorListNotification_ = null;
                SingleFieldBuilderV3<SelectedSensorListNotification, SelectedSensorListNotification.Builder, SelectedSensorListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSensorListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.selectedSensorListNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSupportedFeatureListRequest() {
                this.bitField0_ &= -2;
                this.supportedFeatureListRequest_ = null;
                SingleFieldBuilderV3<SupportedFeaturesListRequest, SupportedFeaturesListRequest.Builder, SupportedFeaturesListRequestOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportedFeatureListRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSupportedFeatureListResponse() {
                this.bitField0_ &= -3;
                this.supportedFeatureListResponse_ = null;
                SingleFieldBuilderV3<SupportedFeaturesListResponse, SupportedFeaturesListResponse.Builder, SupportedFeaturesListResponseOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportedFeatureListResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public AlternateModeRequest getAlternateModeRequest() {
                SingleFieldBuilderV3<AlternateModeRequest, AlternateModeRequest.Builder, AlternateModeRequestOrBuilder> singleFieldBuilderV3 = this.alternateModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlternateModeRequest) singleFieldBuilderV3.getMessage();
                }
                AlternateModeRequest alternateModeRequest = this.alternateModeRequest_;
                return alternateModeRequest == null ? AlternateModeRequest.getDefaultInstance() : alternateModeRequest;
            }

            public AlternateModeRequest.Builder getAlternateModeRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (AlternateModeRequest.Builder) getAlternateModeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public AlternateModeRequestOrBuilder getAlternateModeRequestOrBuilder() {
                SingleFieldBuilderV3<AlternateModeRequest, AlternateModeRequest.Builder, AlternateModeRequestOrBuilder> singleFieldBuilderV3 = this.alternateModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlternateModeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlternateModeRequest alternateModeRequest = this.alternateModeRequest_;
                return alternateModeRequest == null ? AlternateModeRequest.getDefaultInstance() : alternateModeRequest;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public AlternateModeResponse getAlternateModeResponse() {
                SingleFieldBuilderV3<AlternateModeResponse, AlternateModeResponse.Builder, AlternateModeResponseOrBuilder> singleFieldBuilderV3 = this.alternateModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlternateModeResponse) singleFieldBuilderV3.getMessage();
                }
                AlternateModeResponse alternateModeResponse = this.alternateModeResponse_;
                return alternateModeResponse == null ? AlternateModeResponse.getDefaultInstance() : alternateModeResponse;
            }

            public AlternateModeResponse.Builder getAlternateModeResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (AlternateModeResponse.Builder) getAlternateModeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public AlternateModeResponseOrBuilder getAlternateModeResponseOrBuilder() {
                SingleFieldBuilderV3<AlternateModeResponse, AlternateModeResponse.Builder, AlternateModeResponseOrBuilder> singleFieldBuilderV3 = this.alternateModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlternateModeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlternateModeResponse alternateModeResponse = this.alternateModeResponse_;
                return alternateModeResponse == null ? AlternateModeResponse.getDefaultInstance() : alternateModeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SimpleSetupService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public SelectedRestoreListNotification getSelectedRestoreListNotification() {
                SingleFieldBuilderV3<SelectedRestoreListNotification, SelectedRestoreListNotification.Builder, SelectedRestoreListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedRestoreListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SelectedRestoreListNotification) singleFieldBuilderV3.getMessage();
                }
                SelectedRestoreListNotification selectedRestoreListNotification = this.selectedRestoreListNotification_;
                return selectedRestoreListNotification == null ? SelectedRestoreListNotification.getDefaultInstance() : selectedRestoreListNotification;
            }

            public SelectedRestoreListNotification.Builder getSelectedRestoreListNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SelectedRestoreListNotification.Builder) getSelectedRestoreListNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public SelectedRestoreListNotificationOrBuilder getSelectedRestoreListNotificationOrBuilder() {
                SingleFieldBuilderV3<SelectedRestoreListNotification, SelectedRestoreListNotification.Builder, SelectedRestoreListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedRestoreListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SelectedRestoreListNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SelectedRestoreListNotification selectedRestoreListNotification = this.selectedRestoreListNotification_;
                return selectedRestoreListNotification == null ? SelectedRestoreListNotification.getDefaultInstance() : selectedRestoreListNotification;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public SelectedSensorListNotification getSelectedSensorListNotification() {
                SingleFieldBuilderV3<SelectedSensorListNotification, SelectedSensorListNotification.Builder, SelectedSensorListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSensorListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SelectedSensorListNotification) singleFieldBuilderV3.getMessage();
                }
                SelectedSensorListNotification selectedSensorListNotification = this.selectedSensorListNotification_;
                return selectedSensorListNotification == null ? SelectedSensorListNotification.getDefaultInstance() : selectedSensorListNotification;
            }

            public SelectedSensorListNotification.Builder getSelectedSensorListNotificationBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SelectedSensorListNotification.Builder) getSelectedSensorListNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public SelectedSensorListNotificationOrBuilder getSelectedSensorListNotificationOrBuilder() {
                SingleFieldBuilderV3<SelectedSensorListNotification, SelectedSensorListNotification.Builder, SelectedSensorListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSensorListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SelectedSensorListNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SelectedSensorListNotification selectedSensorListNotification = this.selectedSensorListNotification_;
                return selectedSensorListNotification == null ? SelectedSensorListNotification.getDefaultInstance() : selectedSensorListNotification;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public SupportedFeaturesListRequest getSupportedFeatureListRequest() {
                SingleFieldBuilderV3<SupportedFeaturesListRequest, SupportedFeaturesListRequest.Builder, SupportedFeaturesListRequestOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedFeaturesListRequest) singleFieldBuilderV3.getMessage();
                }
                SupportedFeaturesListRequest supportedFeaturesListRequest = this.supportedFeatureListRequest_;
                return supportedFeaturesListRequest == null ? SupportedFeaturesListRequest.getDefaultInstance() : supportedFeaturesListRequest;
            }

            public SupportedFeaturesListRequest.Builder getSupportedFeatureListRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SupportedFeaturesListRequest.Builder) getSupportedFeatureListRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public SupportedFeaturesListRequestOrBuilder getSupportedFeatureListRequestOrBuilder() {
                SingleFieldBuilderV3<SupportedFeaturesListRequest, SupportedFeaturesListRequest.Builder, SupportedFeaturesListRequestOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedFeaturesListRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SupportedFeaturesListRequest supportedFeaturesListRequest = this.supportedFeatureListRequest_;
                return supportedFeaturesListRequest == null ? SupportedFeaturesListRequest.getDefaultInstance() : supportedFeaturesListRequest;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public SupportedFeaturesListResponse getSupportedFeatureListResponse() {
                SingleFieldBuilderV3<SupportedFeaturesListResponse, SupportedFeaturesListResponse.Builder, SupportedFeaturesListResponseOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedFeaturesListResponse) singleFieldBuilderV3.getMessage();
                }
                SupportedFeaturesListResponse supportedFeaturesListResponse = this.supportedFeatureListResponse_;
                return supportedFeaturesListResponse == null ? SupportedFeaturesListResponse.getDefaultInstance() : supportedFeaturesListResponse;
            }

            public SupportedFeaturesListResponse.Builder getSupportedFeatureListResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SupportedFeaturesListResponse.Builder) getSupportedFeatureListResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public SupportedFeaturesListResponseOrBuilder getSupportedFeatureListResponseOrBuilder() {
                SingleFieldBuilderV3<SupportedFeaturesListResponse, SupportedFeaturesListResponse.Builder, SupportedFeaturesListResponseOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedFeaturesListResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SupportedFeaturesListResponse supportedFeaturesListResponse = this.supportedFeatureListResponse_;
                return supportedFeaturesListResponse == null ? SupportedFeaturesListResponse.getDefaultInstance() : supportedFeaturesListResponse;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public boolean hasAlternateModeRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public boolean hasAlternateModeResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public boolean hasSelectedRestoreListNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public boolean hasSelectedSensorListNotification() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public boolean hasSupportedFeatureListRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SimpleSetupServiceOrBuilder
            public boolean hasSupportedFeatureListResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SimpleSetupService_fieldAccessorTable.ensureFieldAccessorsInitialized(SimpleSetupService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasSupportedFeatureListResponse() || getSupportedFeatureListResponse().isInitialized();
            }

            public Builder mergeAlternateModeRequest(AlternateModeRequest alternateModeRequest) {
                AlternateModeRequest alternateModeRequest2;
                SingleFieldBuilderV3<AlternateModeRequest, AlternateModeRequest.Builder, AlternateModeRequestOrBuilder> singleFieldBuilderV3 = this.alternateModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(alternateModeRequest);
                } else if ((this.bitField0_ & 16) == 0 || (alternateModeRequest2 = this.alternateModeRequest_) == null || alternateModeRequest2 == AlternateModeRequest.getDefaultInstance()) {
                    this.alternateModeRequest_ = alternateModeRequest;
                } else {
                    getAlternateModeRequestBuilder().mergeFrom(alternateModeRequest);
                }
                if (this.alternateModeRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAlternateModeResponse(AlternateModeResponse alternateModeResponse) {
                AlternateModeResponse alternateModeResponse2;
                SingleFieldBuilderV3<AlternateModeResponse, AlternateModeResponse.Builder, AlternateModeResponseOrBuilder> singleFieldBuilderV3 = this.alternateModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(alternateModeResponse);
                } else if ((this.bitField0_ & 32) == 0 || (alternateModeResponse2 = this.alternateModeResponse_) == null || alternateModeResponse2 == AlternateModeResponse.getDefaultInstance()) {
                    this.alternateModeResponse_ = alternateModeResponse;
                } else {
                    getAlternateModeResponseBuilder().mergeFrom(alternateModeResponse);
                }
                if (this.alternateModeResponse_ != null) {
                    this.bitField0_ |= 32;
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
                                    codedInputStream.readMessage(getSupportedFeatureListRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSupportedFeatureListResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSelectedRestoreListNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getSelectedSensorListNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getAlternateModeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getAlternateModeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSelectedRestoreListNotification(SelectedRestoreListNotification selectedRestoreListNotification) {
                SelectedRestoreListNotification selectedRestoreListNotification2;
                SingleFieldBuilderV3<SelectedRestoreListNotification, SelectedRestoreListNotification.Builder, SelectedRestoreListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedRestoreListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(selectedRestoreListNotification);
                } else if ((this.bitField0_ & 4) == 0 || (selectedRestoreListNotification2 = this.selectedRestoreListNotification_) == null || selectedRestoreListNotification2 == SelectedRestoreListNotification.getDefaultInstance()) {
                    this.selectedRestoreListNotification_ = selectedRestoreListNotification;
                } else {
                    getSelectedRestoreListNotificationBuilder().mergeFrom(selectedRestoreListNotification);
                }
                if (this.selectedRestoreListNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSelectedSensorListNotification(SelectedSensorListNotification selectedSensorListNotification) {
                SelectedSensorListNotification selectedSensorListNotification2;
                SingleFieldBuilderV3<SelectedSensorListNotification, SelectedSensorListNotification.Builder, SelectedSensorListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSensorListNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(selectedSensorListNotification);
                } else if ((this.bitField0_ & 8) == 0 || (selectedSensorListNotification2 = this.selectedSensorListNotification_) == null || selectedSensorListNotification2 == SelectedSensorListNotification.getDefaultInstance()) {
                    this.selectedSensorListNotification_ = selectedSensorListNotification;
                } else {
                    getSelectedSensorListNotificationBuilder().mergeFrom(selectedSensorListNotification);
                }
                if (this.selectedSensorListNotification_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSupportedFeatureListRequest(SupportedFeaturesListRequest supportedFeaturesListRequest) {
                SupportedFeaturesListRequest supportedFeaturesListRequest2;
                SingleFieldBuilderV3<SupportedFeaturesListRequest, SupportedFeaturesListRequest.Builder, SupportedFeaturesListRequestOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(supportedFeaturesListRequest);
                } else if ((this.bitField0_ & 1) == 0 || (supportedFeaturesListRequest2 = this.supportedFeatureListRequest_) == null || supportedFeaturesListRequest2 == SupportedFeaturesListRequest.getDefaultInstance()) {
                    this.supportedFeatureListRequest_ = supportedFeaturesListRequest;
                } else {
                    getSupportedFeatureListRequestBuilder().mergeFrom(supportedFeaturesListRequest);
                }
                if (this.supportedFeatureListRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSupportedFeatureListResponse(SupportedFeaturesListResponse supportedFeaturesListResponse) {
                SupportedFeaturesListResponse supportedFeaturesListResponse2;
                SingleFieldBuilderV3<SupportedFeaturesListResponse, SupportedFeaturesListResponse.Builder, SupportedFeaturesListResponseOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(supportedFeaturesListResponse);
                } else if ((this.bitField0_ & 2) == 0 || (supportedFeaturesListResponse2 = this.supportedFeatureListResponse_) == null || supportedFeaturesListResponse2 == SupportedFeaturesListResponse.getDefaultInstance()) {
                    this.supportedFeatureListResponse_ = supportedFeaturesListResponse;
                } else {
                    getSupportedFeatureListResponseBuilder().mergeFrom(supportedFeaturesListResponse);
                }
                if (this.supportedFeatureListResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAlternateModeRequest(AlternateModeRequest.Builder builder) {
                SingleFieldBuilderV3<AlternateModeRequest, AlternateModeRequest.Builder, AlternateModeRequestOrBuilder> singleFieldBuilderV3 = this.alternateModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.alternateModeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAlternateModeResponse(AlternateModeResponse.Builder builder) {
                SingleFieldBuilderV3<AlternateModeResponse, AlternateModeResponse.Builder, AlternateModeResponseOrBuilder> singleFieldBuilderV3 = this.alternateModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.alternateModeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
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

            public Builder setSelectedRestoreListNotification(SelectedRestoreListNotification.Builder builder) {
                SingleFieldBuilderV3<SelectedRestoreListNotification, SelectedRestoreListNotification.Builder, SelectedRestoreListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedRestoreListNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.selectedRestoreListNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSelectedSensorListNotification(SelectedSensorListNotification.Builder builder) {
                SingleFieldBuilderV3<SelectedSensorListNotification, SelectedSensorListNotification.Builder, SelectedSensorListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSensorListNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.selectedSensorListNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSupportedFeatureListRequest(SupportedFeaturesListRequest.Builder builder) {
                SingleFieldBuilderV3<SupportedFeaturesListRequest, SupportedFeaturesListRequest.Builder, SupportedFeaturesListRequestOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.supportedFeatureListRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSupportedFeatureListResponse(SupportedFeaturesListResponse.Builder builder) {
                SingleFieldBuilderV3<SupportedFeaturesListResponse, SupportedFeaturesListResponse.Builder, SupportedFeaturesListResponseOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.supportedFeatureListResponse_ = builder.build();
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
            public SimpleSetupService getDefaultInstanceForType() {
                return SimpleSetupService.getDefaultInstance();
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

            public Builder setAlternateModeRequest(AlternateModeRequest alternateModeRequest) {
                SingleFieldBuilderV3<AlternateModeRequest, AlternateModeRequest.Builder, AlternateModeRequestOrBuilder> singleFieldBuilderV3 = this.alternateModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alternateModeRequest.getClass();
                    this.alternateModeRequest_ = alternateModeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(alternateModeRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAlternateModeResponse(AlternateModeResponse alternateModeResponse) {
                SingleFieldBuilderV3<AlternateModeResponse, AlternateModeResponse.Builder, AlternateModeResponseOrBuilder> singleFieldBuilderV3 = this.alternateModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alternateModeResponse.getClass();
                    this.alternateModeResponse_ = alternateModeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(alternateModeResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSelectedRestoreListNotification(SelectedRestoreListNotification selectedRestoreListNotification) {
                SingleFieldBuilderV3<SelectedRestoreListNotification, SelectedRestoreListNotification.Builder, SelectedRestoreListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedRestoreListNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    selectedRestoreListNotification.getClass();
                    this.selectedRestoreListNotification_ = selectedRestoreListNotification;
                } else {
                    singleFieldBuilderV3.setMessage(selectedRestoreListNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSelectedSensorListNotification(SelectedSensorListNotification selectedSensorListNotification) {
                SingleFieldBuilderV3<SelectedSensorListNotification, SelectedSensorListNotification.Builder, SelectedSensorListNotificationOrBuilder> singleFieldBuilderV3 = this.selectedSensorListNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    selectedSensorListNotification.getClass();
                    this.selectedSensorListNotification_ = selectedSensorListNotification;
                } else {
                    singleFieldBuilderV3.setMessage(selectedSensorListNotification);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSupportedFeatureListRequest(SupportedFeaturesListRequest supportedFeaturesListRequest) {
                SingleFieldBuilderV3<SupportedFeaturesListRequest, SupportedFeaturesListRequest.Builder, SupportedFeaturesListRequestOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    supportedFeaturesListRequest.getClass();
                    this.supportedFeatureListRequest_ = supportedFeaturesListRequest;
                } else {
                    singleFieldBuilderV3.setMessage(supportedFeaturesListRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSupportedFeatureListResponse(SupportedFeaturesListResponse supportedFeaturesListResponse) {
                SingleFieldBuilderV3<SupportedFeaturesListResponse, SupportedFeaturesListResponse.Builder, SupportedFeaturesListResponseOrBuilder> singleFieldBuilderV3 = this.supportedFeatureListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    supportedFeaturesListResponse.getClass();
                    this.supportedFeatureListResponse_ = supportedFeaturesListResponse;
                } else {
                    singleFieldBuilderV3.setMessage(supportedFeaturesListResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SimpleSetupService) {
                    return mergeFrom((SimpleSetupService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SimpleSetupService simpleSetupService) {
                if (simpleSetupService == SimpleSetupService.getDefaultInstance()) {
                    return this;
                }
                if (simpleSetupService.hasSupportedFeatureListRequest()) {
                    mergeSupportedFeatureListRequest(simpleSetupService.getSupportedFeatureListRequest());
                }
                if (simpleSetupService.hasSupportedFeatureListResponse()) {
                    mergeSupportedFeatureListResponse(simpleSetupService.getSupportedFeatureListResponse());
                }
                if (simpleSetupService.hasSelectedRestoreListNotification()) {
                    mergeSelectedRestoreListNotification(simpleSetupService.getSelectedRestoreListNotification());
                }
                if (simpleSetupService.hasSelectedSensorListNotification()) {
                    mergeSelectedSensorListNotification(simpleSetupService.getSelectedSensorListNotification());
                }
                if (simpleSetupService.hasAlternateModeRequest()) {
                    mergeAlternateModeRequest(simpleSetupService.getAlternateModeRequest());
                }
                if (simpleSetupService.hasAlternateModeResponse()) {
                    mergeAlternateModeResponse(simpleSetupService.getAlternateModeResponse());
                }
                mergeUnknownFields(simpleSetupService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SimpleSetupService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SimpleSetupService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SimpleSetupService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SimpleSetupService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SimpleSetupService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SimpleSetupService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SimpleSetupService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SimpleSetupService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SimpleSetupService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SimpleSetupService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SimpleSetupService parseFrom(InputStream inputStream) {
            return (SimpleSetupService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SimpleSetupService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SimpleSetupService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SimpleSetupService parseFrom(CodedInputStream codedInputStream) {
            return (SimpleSetupService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SimpleSetupService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SimpleSetupService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SupportedFeaturesListResponse extends GeneratedMessageV3 implements SupportedFeaturesListResponseOrBuilder {
        public static final int FEATURE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Feature> feature_;
        private byte memoizedIsInitialized;
        private static final SupportedFeaturesListResponse DEFAULT_INSTANCE = new SupportedFeaturesListResponse();

        @Deprecated
        public static final Parser<SupportedFeaturesListResponse> PARSER = new AbstractParser<SupportedFeaturesListResponse>() { // from class: com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListResponse.1
            @Override // com.google.protobuf.Parser
            public SupportedFeaturesListResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SupportedFeaturesListResponse.newBuilder();
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

        private SupportedFeaturesListResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.feature_ = Collections.EMPTY_LIST;
        }

        public static SupportedFeaturesListResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListResponse_descriptor;
        }

        public static Builder newBuilder(SupportedFeaturesListResponse supportedFeaturesListResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(supportedFeaturesListResponse);
        }

        public static SupportedFeaturesListResponse parseDelimitedFrom(InputStream inputStream) {
            return (SupportedFeaturesListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SupportedFeaturesListResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SupportedFeaturesListResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SupportedFeaturesListResponse)) {
                return super.equals(obj);
            }
            SupportedFeaturesListResponse supportedFeaturesListResponse = (SupportedFeaturesListResponse) obj;
            return getFeatureList().equals(supportedFeaturesListResponse.getFeatureList()) && getUnknownFields().equals(supportedFeaturesListResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListResponseOrBuilder
        public Feature getFeature(int i14) {
            return this.feature_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListResponseOrBuilder
        public int getFeatureCount() {
            return this.feature_.size();
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListResponseOrBuilder
        public List<Feature> getFeatureList() {
            return this.feature_;
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListResponseOrBuilder
        public FeatureOrBuilder getFeatureOrBuilder(int i14) {
            return this.feature_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListResponseOrBuilder
        public List<? extends FeatureOrBuilder> getFeatureOrBuilderList() {
            return this.feature_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SupportedFeaturesListResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.feature_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.feature_.get(i15));
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
            if (getFeatureCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getFeatureList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedFeaturesListResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getFeatureCount(); i14++) {
                if (!getFeature(i14).isInitialized()) {
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
            return new SupportedFeaturesListResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.feature_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.feature_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportedFeaturesListResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> featureBuilder_;
            private List<Feature> feature_;

            private Builder() {
                this.feature_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SupportedFeaturesListResponse supportedFeaturesListResponse) {
            }

            private void buildPartialRepeatedFields(SupportedFeaturesListResponse supportedFeaturesListResponse) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    supportedFeaturesListResponse.feature_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.feature_ = Collections.unmodifiableList(this.feature_);
                    this.bitField0_ &= -2;
                }
                supportedFeaturesListResponse.feature_ = this.feature_;
            }

            private void ensureFeatureIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.feature_ = new ArrayList(this.feature_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> getFeatureFieldBuilder() {
                if (this.featureBuilder_ == null) {
                    this.featureBuilder_ = new RepeatedFieldBuilderV3<>(this.feature_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.feature_ = null;
                }
                return this.featureBuilder_;
            }

            public Builder addAllFeature(Iterable<? extends Feature> iterable) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureFeatureIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.feature_);
                onChanged();
                return this;
            }

            public Builder addFeature(Feature.Builder builder) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureFeatureIsMutable();
                this.feature_.add(builder.build());
                onChanged();
                return this;
            }

            public Feature.Builder addFeatureBuilder() {
                return (Feature.Builder) getFeatureFieldBuilder().addBuilder(Feature.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedFeaturesListResponse build() {
                SupportedFeaturesListResponse supportedFeaturesListResponseBuildPartial = buildPartial();
                if (supportedFeaturesListResponseBuildPartial.isInitialized()) {
                    return supportedFeaturesListResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) supportedFeaturesListResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedFeaturesListResponse buildPartial() {
                SupportedFeaturesListResponse supportedFeaturesListResponse = new SupportedFeaturesListResponse(this);
                buildPartialRepeatedFields(supportedFeaturesListResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(supportedFeaturesListResponse);
                }
                onBuilt();
                return supportedFeaturesListResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.feature_ = Collections.EMPTY_LIST;
                } else {
                    this.feature_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearFeature() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.feature_ = Collections.EMPTY_LIST;
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
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListResponseOrBuilder
            public Feature getFeature(int i14) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                return repeatedFieldBuilderV3 == null ? this.feature_.get(i14) : (Feature) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Feature.Builder getFeatureBuilder(int i14) {
                return (Feature.Builder) getFeatureFieldBuilder().getBuilder(i14);
            }

            public List<Feature.Builder> getFeatureBuilderList() {
                return getFeatureFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListResponseOrBuilder
            public int getFeatureCount() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                return repeatedFieldBuilderV3 == null ? this.feature_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListResponseOrBuilder
            public List<Feature> getFeatureList() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.feature_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListResponseOrBuilder
            public FeatureOrBuilder getFeatureOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                return repeatedFieldBuilderV3 == null ? this.feature_.get(i14) : (FeatureOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDISimpleSetup.SupportedFeaturesListResponseOrBuilder
            public List<? extends FeatureOrBuilder> getFeatureOrBuilderList() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.feature_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISimpleSetup.internal_static_GDI_Proto_SimpleSetup_SupportedFeaturesListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedFeaturesListResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getFeatureCount(); i14++) {
                    if (!getFeature(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(SupportedFeaturesListResponse supportedFeaturesListResponse) {
                if (supportedFeaturesListResponse == SupportedFeaturesListResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.featureBuilder_ == null) {
                    if (!supportedFeaturesListResponse.feature_.isEmpty()) {
                        if (this.feature_.isEmpty()) {
                            this.feature_ = supportedFeaturesListResponse.feature_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFeatureIsMutable();
                            this.feature_.addAll(supportedFeaturesListResponse.feature_);
                        }
                        onChanged();
                    }
                } else if (!supportedFeaturesListResponse.feature_.isEmpty()) {
                    boolean zIsEmpty = this.featureBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.featureBuilder_ = null;
                        this.feature_ = supportedFeaturesListResponse.feature_;
                        this.bitField0_ &= -2;
                        this.featureBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFeatureFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(supportedFeaturesListResponse.feature_);
                    }
                }
                mergeUnknownFields(supportedFeaturesListResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeFeature(int i14) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureFeatureIsMutable();
                this.feature_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setFeature(int i14, Feature.Builder builder) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureFeatureIsMutable();
                this.feature_.set(i14, builder.build());
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
            public SupportedFeaturesListResponse getDefaultInstanceForType() {
                return SupportedFeaturesListResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.feature_ = Collections.EMPTY_LIST;
            }

            public Feature.Builder addFeatureBuilder(int i14) {
                return (Feature.Builder) getFeatureFieldBuilder().addBuilder(i14, Feature.getDefaultInstance());
            }

            public Builder addFeature(int i14, Feature feature) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    feature.getClass();
                    ensureFeatureIsMutable();
                    this.feature_.add(i14, feature);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, feature);
                return this;
            }

            public Builder setFeature(int i14, Feature feature) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    feature.getClass();
                    ensureFeatureIsMutable();
                    this.feature_.set(i14, feature);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, feature);
                return this;
            }

            public Builder addFeature(Feature feature) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    feature.getClass();
                    ensureFeatureIsMutable();
                    this.feature_.add(feature);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(feature);
                return this;
            }

            public Builder addFeature(int i14, Feature.Builder builder) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFeatureIsMutable();
                    this.feature_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SupportedFeaturesListResponse) {
                    return mergeFrom((SupportedFeaturesListResponse) message);
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
                                    Feature feature = (Feature) codedInputStream.readMessage(Feature.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featureBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureFeatureIsMutable();
                                        this.feature_.add(feature);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(feature);
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
        public SupportedFeaturesListResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SupportedFeaturesListResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedFeaturesListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedFeaturesListResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SupportedFeaturesListResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SupportedFeaturesListResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SupportedFeaturesListResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SupportedFeaturesListResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SupportedFeaturesListResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SupportedFeaturesListResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SupportedFeaturesListResponse parseFrom(InputStream inputStream) {
            return (SupportedFeaturesListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SupportedFeaturesListResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedFeaturesListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedFeaturesListResponse parseFrom(CodedInputStream codedInputStream) {
            return (SupportedFeaturesListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SupportedFeaturesListResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedFeaturesListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum AlternateMode implements ProtocolMessageEnum {
        NONE(0),
        GYM(1);

        public static final int GYM_VALUE = 1;
        public static final int NONE_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<AlternateMode> internalValueMap = new Internal.EnumLiteMap<AlternateMode>() { // from class: com.garmin.proto.generated.GDISimpleSetup.AlternateMode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AlternateMode findValueByNumber(int i14) {
                return AlternateMode.forNumber(i14);
            }
        };
        private static final AlternateMode[] VALUES = values();

        AlternateMode(int i14) {
            this.value = i14;
        }

        public static AlternateMode forNumber(int i14) {
            if (i14 == 0) {
                return NONE;
            }
            if (i14 != 1) {
                return null;
            }
            return GYM;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDISimpleSetup.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<AlternateMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static AlternateMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static AlternateMode valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum FeatureType implements ProtocolMessageEnum {
        ACTIVITY_PROFILE_MIGRATION(1),
        SENSOR_PRE_PAIR(2),
        POPULAR_PROFILES(3),
        ALTERNATE_MODE(4);

        public static final int ACTIVITY_PROFILE_MIGRATION_VALUE = 1;
        public static final int ALTERNATE_MODE_VALUE = 4;
        public static final int POPULAR_PROFILES_VALUE = 3;
        public static final int SENSOR_PRE_PAIR_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<FeatureType> internalValueMap = new Internal.EnumLiteMap<FeatureType>() { // from class: com.garmin.proto.generated.GDISimpleSetup.FeatureType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public FeatureType findValueByNumber(int i14) {
                return FeatureType.forNumber(i14);
            }
        };
        private static final FeatureType[] VALUES = values();

        FeatureType(int i14) {
            this.value = i14;
        }

        public static FeatureType forNumber(int i14) {
            if (i14 == 1) {
                return ACTIVITY_PROFILE_MIGRATION;
            }
            if (i14 == 2) {
                return SENSOR_PRE_PAIR;
            }
            if (i14 == 3) {
                return POPULAR_PROFILES;
            }
            if (i14 != 4) {
                return null;
            }
            return ALTERNATE_MODE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDISimpleSetup.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<FeatureType> internalGetValueMap() {
            return internalValueMap;
        }

        public static FeatureType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static FeatureType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum SensorType implements ProtocolMessageEnum {
        HEART_RATE(1),
        POWER(2),
        CADENCE(3);

        public static final int CADENCE_VALUE = 3;
        public static final int HEART_RATE_VALUE = 1;
        public static final int POWER_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<SensorType> internalValueMap = new Internal.EnumLiteMap<SensorType>() { // from class: com.garmin.proto.generated.GDISimpleSetup.SensorType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SensorType findValueByNumber(int i14) {
                return SensorType.forNumber(i14);
            }
        };
        private static final SensorType[] VALUES = values();

        SensorType(int i14) {
            this.value = i14;
        }

        public static SensorType forNumber(int i14) {
            if (i14 == 1) {
                return HEART_RATE;
            }
            if (i14 == 2) {
                return POWER;
            }
            if (i14 != 3) {
                return null;
            }
            return CADENCE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDISimpleSetup.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<SensorType> internalGetValueMap() {
            return internalValueMap;
        }

        public static SensorType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static SensorType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
