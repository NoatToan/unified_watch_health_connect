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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class GDICompanionRangefinder {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDICompanionRangefinder.proto\u0012\u001eGDI.Proto.CompanionRangefinder\u001a\u0015GDIEventSharing.proto\"\u001d\n\u001bCompanionRangefinderService\"°\u0002\n\"RangefinderMeasurementNotification\u0012\u0019\n\u0011measured_distance\u0018\u0001 \u0001(\u0002\u0012\u0013\n\u000bflag_locked\u0018\u0002 \u0001(\b\u0012\u001b\n\u0013plays_like_distance\u0018\u0003 \u0001(\u0002\u0012\u0015\n\rflat_distance\u0018\u0004 \u0001(\u0002\u0012\u0014\n\fdevice_pitch\u0018\u0005 \u0001(\u00022\u008f\u0001\n\u0017rangefinder_measurement\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ï\u0007 \u0001(\u000b2B.GDI.Proto.CompanionRangefinder.RangefinderMeasurementNotificationB7\n\u001acom.garmin.proto.generatedB\u0017GDICompanionRangefinderH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_CompanionRangefinder_CompanionRangefinderService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_CompanionRangefinder_CompanionRangefinderService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_CompanionRangefinder_RangefinderMeasurementNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_CompanionRangefinder_RangefinderMeasurementNotification_fieldAccessorTable;

    public interface CompanionRangefinderServiceOrBuilder extends MessageOrBuilder {
    }

    public interface RangefinderMeasurementNotificationOrBuilder extends MessageOrBuilder {
        float getDevicePitch();

        boolean getFlagLocked();

        float getFlatDistance();

        float getMeasuredDistance();

        float getPlaysLikeDistance();

        boolean hasDevicePitch();

        boolean hasFlagLocked();

        boolean hasFlatDistance();

        boolean hasMeasuredDistance();

        boolean hasPlaysLikeDistance();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_CompanionRangefinder_CompanionRangefinderService_descriptor = descriptor2;
        internal_static_GDI_Proto_CompanionRangefinder_CompanionRangefinderService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[0]);
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_CompanionRangefinder_RangefinderMeasurementNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_CompanionRangefinder_RangefinderMeasurementNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MeasuredDistance", "FlagLocked", "PlaysLikeDistance", "FlatDistance", "DevicePitch"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDICompanionRangefinder() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(RangefinderMeasurementNotification.rangefinderMeasurement);
    }

    public static final class CompanionRangefinderService extends GeneratedMessageV3 implements CompanionRangefinderServiceOrBuilder {
        private static final CompanionRangefinderService DEFAULT_INSTANCE = new CompanionRangefinderService();

        @Deprecated
        public static final Parser<CompanionRangefinderService> PARSER = new AbstractParser<CompanionRangefinderService>() { // from class: com.garmin.proto.generated.GDICompanionRangefinder.CompanionRangefinderService.1
            @Override // com.google.protobuf.Parser
            public CompanionRangefinderService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CompanionRangefinderService.newBuilder();
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

        private CompanionRangefinderService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CompanionRangefinderService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICompanionRangefinder.internal_static_GDI_Proto_CompanionRangefinder_CompanionRangefinderService_descriptor;
        }

        public static Builder newBuilder(CompanionRangefinderService companionRangefinderService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(companionRangefinderService);
        }

        public static CompanionRangefinderService parseDelimitedFrom(InputStream inputStream) {
            return (CompanionRangefinderService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CompanionRangefinderService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CompanionRangefinderService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CompanionRangefinderService) {
                return getUnknownFields().equals(((CompanionRangefinderService) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CompanionRangefinderService> getParserForType() {
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
            return GDICompanionRangefinder.internal_static_GDI_Proto_CompanionRangefinder_CompanionRangefinderService_fieldAccessorTable.ensureFieldAccessorsInitialized(CompanionRangefinderService.class, Builder.class);
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
            return new CompanionRangefinderService();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CompanionRangefinderServiceOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICompanionRangefinder.internal_static_GDI_Proto_CompanionRangefinder_CompanionRangefinderService_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CompanionRangefinderService build() {
                CompanionRangefinderService companionRangefinderServiceBuildPartial = buildPartial();
                if (companionRangefinderServiceBuildPartial.isInitialized()) {
                    return companionRangefinderServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) companionRangefinderServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CompanionRangefinderService buildPartial() {
                CompanionRangefinderService companionRangefinderService = new CompanionRangefinderService(this);
                onBuilt();
                return companionRangefinderService;
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
                return GDICompanionRangefinder.internal_static_GDI_Proto_CompanionRangefinder_CompanionRangefinderService_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICompanionRangefinder.internal_static_GDI_Proto_CompanionRangefinder_CompanionRangefinderService_fieldAccessorTable.ensureFieldAccessorsInitialized(CompanionRangefinderService.class, Builder.class);
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
            public CompanionRangefinderService getDefaultInstanceForType() {
                return CompanionRangefinderService.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CompanionRangefinderService) {
                    return mergeFrom((CompanionRangefinderService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CompanionRangefinderService companionRangefinderService) {
                if (companionRangefinderService == CompanionRangefinderService.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(companionRangefinderService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CompanionRangefinderService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CompanionRangefinderService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CompanionRangefinderService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CompanionRangefinderService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CompanionRangefinderService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CompanionRangefinderService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CompanionRangefinderService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CompanionRangefinderService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CompanionRangefinderService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CompanionRangefinderService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CompanionRangefinderService parseFrom(InputStream inputStream) {
            return (CompanionRangefinderService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CompanionRangefinderService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CompanionRangefinderService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CompanionRangefinderService parseFrom(CodedInputStream codedInputStream) {
            return (CompanionRangefinderService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CompanionRangefinderService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CompanionRangefinderService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RangefinderMeasurementNotification extends GeneratedMessageV3 implements RangefinderMeasurementNotificationOrBuilder {
        public static final int DEVICE_PITCH_FIELD_NUMBER = 5;
        public static final int FLAG_LOCKED_FIELD_NUMBER = 2;
        public static final int FLAT_DISTANCE_FIELD_NUMBER = 4;
        public static final int MEASURED_DISTANCE_FIELD_NUMBER = 1;
        public static final int PLAYS_LIKE_DISTANCE_FIELD_NUMBER = 3;
        public static final int RANGEFINDER_MEASUREMENT_FIELD_NUMBER = 1007;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private float devicePitch_;
        private boolean flagLocked_;
        private float flatDistance_;
        private float measuredDistance_;
        private byte memoizedIsInitialized;
        private float playsLikeDistance_;
        private static final RangefinderMeasurementNotification DEFAULT_INSTANCE = new RangefinderMeasurementNotification();

        @Deprecated
        public static final Parser<RangefinderMeasurementNotification> PARSER = new AbstractParser<RangefinderMeasurementNotification>() { // from class: com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotification.1
            @Override // com.google.protobuf.Parser
            public RangefinderMeasurementNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RangefinderMeasurementNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, RangefinderMeasurementNotification> rangefinderMeasurement = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, RangefinderMeasurementNotification.class, getDefaultInstance());

        private RangefinderMeasurementNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.measuredDistance_ = 0.0f;
            this.flagLocked_ = false;
            this.playsLikeDistance_ = 0.0f;
            this.flatDistance_ = 0.0f;
            this.devicePitch_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RangefinderMeasurementNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICompanionRangefinder.internal_static_GDI_Proto_CompanionRangefinder_RangefinderMeasurementNotification_descriptor;
        }

        public static Builder newBuilder(RangefinderMeasurementNotification rangefinderMeasurementNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rangefinderMeasurementNotification);
        }

        public static RangefinderMeasurementNotification parseDelimitedFrom(InputStream inputStream) {
            return (RangefinderMeasurementNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RangefinderMeasurementNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RangefinderMeasurementNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RangefinderMeasurementNotification)) {
                return super.equals(obj);
            }
            RangefinderMeasurementNotification rangefinderMeasurementNotification = (RangefinderMeasurementNotification) obj;
            if (hasMeasuredDistance() != rangefinderMeasurementNotification.hasMeasuredDistance()) {
                return false;
            }
            if ((hasMeasuredDistance() && Float.floatToIntBits(getMeasuredDistance()) != Float.floatToIntBits(rangefinderMeasurementNotification.getMeasuredDistance())) || hasFlagLocked() != rangefinderMeasurementNotification.hasFlagLocked()) {
                return false;
            }
            if ((hasFlagLocked() && getFlagLocked() != rangefinderMeasurementNotification.getFlagLocked()) || hasPlaysLikeDistance() != rangefinderMeasurementNotification.hasPlaysLikeDistance()) {
                return false;
            }
            if ((hasPlaysLikeDistance() && Float.floatToIntBits(getPlaysLikeDistance()) != Float.floatToIntBits(rangefinderMeasurementNotification.getPlaysLikeDistance())) || hasFlatDistance() != rangefinderMeasurementNotification.hasFlatDistance()) {
                return false;
            }
            if ((!hasFlatDistance() || Float.floatToIntBits(getFlatDistance()) == Float.floatToIntBits(rangefinderMeasurementNotification.getFlatDistance())) && hasDevicePitch() == rangefinderMeasurementNotification.hasDevicePitch()) {
                return (!hasDevicePitch() || Float.floatToIntBits(getDevicePitch()) == Float.floatToIntBits(rangefinderMeasurementNotification.getDevicePitch())) && getUnknownFields().equals(rangefinderMeasurementNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
        public float getDevicePitch() {
            return this.devicePitch_;
        }

        @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
        public boolean getFlagLocked() {
            return this.flagLocked_;
        }

        @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
        public float getFlatDistance() {
            return this.flatDistance_;
        }

        @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
        public float getMeasuredDistance() {
            return this.measuredDistance_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RangefinderMeasurementNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
        public float getPlaysLikeDistance() {
            return this.playsLikeDistance_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.measuredDistance_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeBoolSize(2, this.flagLocked_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.playsLikeDistance_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.flatDistance_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(5, this.devicePitch_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
        public boolean hasDevicePitch() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
        public boolean hasFlagLocked() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
        public boolean hasFlatDistance() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
        public boolean hasMeasuredDistance() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
        public boolean hasPlaysLikeDistance() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMeasuredDistance()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getMeasuredDistance());
            }
            if (hasFlagLocked()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getFlagLocked());
            }
            if (hasPlaysLikeDistance()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getPlaysLikeDistance());
            }
            if (hasFlatDistance()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getFlatDistance());
            }
            if (hasDevicePitch()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getDevicePitch());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICompanionRangefinder.internal_static_GDI_Proto_CompanionRangefinder_RangefinderMeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(RangefinderMeasurementNotification.class, Builder.class);
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
            return new RangefinderMeasurementNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.measuredDistance_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.flagLocked_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.playsLikeDistance_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.flatDistance_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.devicePitch_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RangefinderMeasurementNotificationOrBuilder {
            private int bitField0_;
            private float devicePitch_;
            private boolean flagLocked_;
            private float flatDistance_;
            private float measuredDistance_;
            private float playsLikeDistance_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(RangefinderMeasurementNotification rangefinderMeasurementNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    rangefinderMeasurementNotification.measuredDistance_ = this.measuredDistance_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    rangefinderMeasurementNotification.flagLocked_ = this.flagLocked_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    rangefinderMeasurementNotification.playsLikeDistance_ = this.playsLikeDistance_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    rangefinderMeasurementNotification.flatDistance_ = this.flatDistance_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    rangefinderMeasurementNotification.devicePitch_ = this.devicePitch_;
                    i14 |= 16;
                }
                rangefinderMeasurementNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICompanionRangefinder.internal_static_GDI_Proto_CompanionRangefinder_RangefinderMeasurementNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RangefinderMeasurementNotification build() {
                RangefinderMeasurementNotification rangefinderMeasurementNotificationBuildPartial = buildPartial();
                if (rangefinderMeasurementNotificationBuildPartial.isInitialized()) {
                    return rangefinderMeasurementNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rangefinderMeasurementNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RangefinderMeasurementNotification buildPartial() {
                RangefinderMeasurementNotification rangefinderMeasurementNotification = new RangefinderMeasurementNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(rangefinderMeasurementNotification);
                }
                onBuilt();
                return rangefinderMeasurementNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.measuredDistance_ = 0.0f;
                this.flagLocked_ = false;
                this.playsLikeDistance_ = 0.0f;
                this.flatDistance_ = 0.0f;
                this.devicePitch_ = 0.0f;
                return this;
            }

            public Builder clearDevicePitch() {
                this.bitField0_ &= -17;
                this.devicePitch_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFlagLocked() {
                this.bitField0_ &= -3;
                this.flagLocked_ = false;
                onChanged();
                return this;
            }

            public Builder clearFlatDistance() {
                this.bitField0_ &= -9;
                this.flatDistance_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMeasuredDistance() {
                this.bitField0_ &= -2;
                this.measuredDistance_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPlaysLikeDistance() {
                this.bitField0_ &= -5;
                this.playsLikeDistance_ = 0.0f;
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
                return GDICompanionRangefinder.internal_static_GDI_Proto_CompanionRangefinder_RangefinderMeasurementNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
            public float getDevicePitch() {
                return this.devicePitch_;
            }

            @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
            public boolean getFlagLocked() {
                return this.flagLocked_;
            }

            @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
            public float getFlatDistance() {
                return this.flatDistance_;
            }

            @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
            public float getMeasuredDistance() {
                return this.measuredDistance_;
            }

            @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
            public float getPlaysLikeDistance() {
                return this.playsLikeDistance_;
            }

            @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
            public boolean hasDevicePitch() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
            public boolean hasFlagLocked() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
            public boolean hasFlatDistance() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
            public boolean hasMeasuredDistance() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICompanionRangefinder.RangefinderMeasurementNotificationOrBuilder
            public boolean hasPlaysLikeDistance() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICompanionRangefinder.internal_static_GDI_Proto_CompanionRangefinder_RangefinderMeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(RangefinderMeasurementNotification.class, Builder.class);
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
                                if (tag == 13) {
                                    this.measuredDistance_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.flagLocked_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.playsLikeDistance_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                } else if (tag == 37) {
                                    this.flatDistance_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8;
                                } else if (tag == 45) {
                                    this.devicePitch_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 16;
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

            public Builder setDevicePitch(float f14) {
                this.devicePitch_ = f14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFlagLocked(boolean z14) {
                this.flagLocked_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFlatDistance(float f14) {
                this.flatDistance_ = f14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMeasuredDistance(float f14) {
                this.measuredDistance_ = f14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPlaysLikeDistance(float f14) {
                this.playsLikeDistance_ = f14;
                this.bitField0_ |= 4;
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
            public RangefinderMeasurementNotification getDefaultInstanceForType() {
                return RangefinderMeasurementNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RangefinderMeasurementNotification) {
                    return mergeFrom((RangefinderMeasurementNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RangefinderMeasurementNotification rangefinderMeasurementNotification) {
                if (rangefinderMeasurementNotification == RangefinderMeasurementNotification.getDefaultInstance()) {
                    return this;
                }
                if (rangefinderMeasurementNotification.hasMeasuredDistance()) {
                    setMeasuredDistance(rangefinderMeasurementNotification.getMeasuredDistance());
                }
                if (rangefinderMeasurementNotification.hasFlagLocked()) {
                    setFlagLocked(rangefinderMeasurementNotification.getFlagLocked());
                }
                if (rangefinderMeasurementNotification.hasPlaysLikeDistance()) {
                    setPlaysLikeDistance(rangefinderMeasurementNotification.getPlaysLikeDistance());
                }
                if (rangefinderMeasurementNotification.hasFlatDistance()) {
                    setFlatDistance(rangefinderMeasurementNotification.getFlatDistance());
                }
                if (rangefinderMeasurementNotification.hasDevicePitch()) {
                    setDevicePitch(rangefinderMeasurementNotification.getDevicePitch());
                }
                mergeUnknownFields(rangefinderMeasurementNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RangefinderMeasurementNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RangefinderMeasurementNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RangefinderMeasurementNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RangefinderMeasurementNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RangefinderMeasurementNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RangefinderMeasurementNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RangefinderMeasurementNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RangefinderMeasurementNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RangefinderMeasurementNotification parseFrom(InputStream inputStream) {
            return (RangefinderMeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RangefinderMeasurementNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RangefinderMeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RangefinderMeasurementNotification parseFrom(CodedInputStream codedInputStream) {
            return (RangefinderMeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ RangefinderMeasurementNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private RangefinderMeasurementNotification() {
            this.measuredDistance_ = 0.0f;
            this.flagLocked_ = false;
            this.playsLikeDistance_ = 0.0f;
            this.flatDistance_ = 0.0f;
            this.devicePitch_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RangefinderMeasurementNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RangefinderMeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
