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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIHeartRate {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012GDIHeartRate.proto\u0012\u0013GDI.Proto.HeartRate\u001a\u0015GDIEventSharing.proto\"\t\n\u0007Service\"\u0088\u0001\n\fSwimInterval\u0012'\n\u001finterval_average_heart_rate_bpm\u0018\u0001 \u0001(\r\u0012'\n\u001finterval_maximum_heart_rate_bpm\u0018\u0002 \u0001(\r\u0012&\n\u001esession_average_heart_rate_bpm\u0018\u0003 \u0001(\r\"\u0092\u0002\n\u0017MeasurementNotification\u0012\u0016\n\u000eheart_rate_bpm\u0018\u0001 \u0001(\r\u0012\u0017\n\u000fis_hr_confident\u0018\u0002 \u0001(\b\u0012\u001f\n\u0017beat_period_1_1024ths_s\u0018\u0003 \u0001(\r\u0012=\n\u0012swim_interval_data\u0018\u0004 \u0001(\u000b2!.GDI.Proto.HeartRate.SwimInterval2f\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018õ\u0007 \u0001(\u000b2,.GDI.Proto.HeartRate.MeasurementNotificationB,\n\u001acom.garmin.proto.generatedB\fGDIHeartRateH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HeartRate_MeasurementNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HeartRate_MeasurementNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HeartRate_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HeartRate_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HeartRate_SwimInterval_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HeartRate_SwimInterval_fieldAccessorTable;

    public interface MeasurementNotificationOrBuilder extends MessageOrBuilder {
        int getBeatPeriod11024ThsS();

        int getHeartRateBpm();

        boolean getIsHrConfident();

        SwimInterval getSwimIntervalData();

        SwimIntervalOrBuilder getSwimIntervalDataOrBuilder();

        boolean hasBeatPeriod11024ThsS();

        boolean hasHeartRateBpm();

        boolean hasIsHrConfident();

        boolean hasSwimIntervalData();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
    }

    public interface SwimIntervalOrBuilder extends MessageOrBuilder {
        int getIntervalAverageHeartRateBpm();

        int getIntervalMaximumHeartRateBpm();

        int getSessionAverageHeartRateBpm();

        boolean hasIntervalAverageHeartRateBpm();

        boolean hasIntervalMaximumHeartRateBpm();

        boolean hasSessionAverageHeartRateBpm();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_HeartRate_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_HeartRate_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[0]);
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_HeartRate_SwimInterval_descriptor = descriptor3;
        internal_static_GDI_Proto_HeartRate_SwimInterval_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"IntervalAverageHeartRateBpm", "IntervalMaximumHeartRateBpm", "SessionAverageHeartRateBpm"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_HeartRate_MeasurementNotification_descriptor = descriptor4;
        internal_static_GDI_Proto_HeartRate_MeasurementNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"HeartRateBpm", "IsHrConfident", "BeatPeriod11024ThsS", "SwimIntervalData"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDIHeartRate() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(MeasurementNotification.data);
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIHeartRate.Service.1
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
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHeartRate.internal_static_GDI_Proto_HeartRate_Service_descriptor;
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
            if (obj instanceof Service) {
                return getUnknownFields().equals(((Service) obj).getUnknownFields());
            }
            return super.equals(obj);
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
            return GDIHeartRate.internal_static_GDI_Proto_HeartRate_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            return new Service();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHeartRate.internal_static_GDI_Proto_HeartRate_Service_descriptor;
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
                onBuilt();
                return service;
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
                return GDIHeartRate.internal_static_GDI_Proto_HeartRate_Service_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHeartRate.internal_static_GDI_Proto_HeartRate_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            public Service getDefaultInstanceForType() {
                return Service.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
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

    public static final class SwimInterval extends GeneratedMessageV3 implements SwimIntervalOrBuilder {
        public static final int INTERVAL_AVERAGE_HEART_RATE_BPM_FIELD_NUMBER = 1;
        public static final int INTERVAL_MAXIMUM_HEART_RATE_BPM_FIELD_NUMBER = 2;
        public static final int SESSION_AVERAGE_HEART_RATE_BPM_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int intervalAverageHeartRateBpm_;
        private int intervalMaximumHeartRateBpm_;
        private byte memoizedIsInitialized;
        private int sessionAverageHeartRateBpm_;
        private static final SwimInterval DEFAULT_INSTANCE = new SwimInterval();

        @Deprecated
        public static final Parser<SwimInterval> PARSER = new AbstractParser<SwimInterval>() { // from class: com.garmin.proto.generated.GDIHeartRate.SwimInterval.1
            @Override // com.google.protobuf.Parser
            public SwimInterval parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwimInterval.newBuilder();
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

        private SwimInterval(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.intervalAverageHeartRateBpm_ = 0;
            this.intervalMaximumHeartRateBpm_ = 0;
            this.sessionAverageHeartRateBpm_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwimInterval getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHeartRate.internal_static_GDI_Proto_HeartRate_SwimInterval_descriptor;
        }

        public static Builder newBuilder(SwimInterval swimInterval) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(swimInterval);
        }

        public static SwimInterval parseDelimitedFrom(InputStream inputStream) {
            return (SwimInterval) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwimInterval parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwimInterval> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwimInterval)) {
                return super.equals(obj);
            }
            SwimInterval swimInterval = (SwimInterval) obj;
            if (hasIntervalAverageHeartRateBpm() != swimInterval.hasIntervalAverageHeartRateBpm()) {
                return false;
            }
            if ((hasIntervalAverageHeartRateBpm() && getIntervalAverageHeartRateBpm() != swimInterval.getIntervalAverageHeartRateBpm()) || hasIntervalMaximumHeartRateBpm() != swimInterval.hasIntervalMaximumHeartRateBpm()) {
                return false;
            }
            if ((!hasIntervalMaximumHeartRateBpm() || getIntervalMaximumHeartRateBpm() == swimInterval.getIntervalMaximumHeartRateBpm()) && hasSessionAverageHeartRateBpm() == swimInterval.hasSessionAverageHeartRateBpm()) {
                return (!hasSessionAverageHeartRateBpm() || getSessionAverageHeartRateBpm() == swimInterval.getSessionAverageHeartRateBpm()) && getUnknownFields().equals(swimInterval.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
        public int getIntervalAverageHeartRateBpm() {
            return this.intervalAverageHeartRateBpm_;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
        public int getIntervalMaximumHeartRateBpm() {
            return this.intervalMaximumHeartRateBpm_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwimInterval> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.intervalAverageHeartRateBpm_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.intervalMaximumHeartRateBpm_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.sessionAverageHeartRateBpm_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
        public int getSessionAverageHeartRateBpm() {
            return this.sessionAverageHeartRateBpm_;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
        public boolean hasIntervalAverageHeartRateBpm() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
        public boolean hasIntervalMaximumHeartRateBpm() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
        public boolean hasSessionAverageHeartRateBpm() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIntervalAverageHeartRateBpm()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getIntervalAverageHeartRateBpm();
            }
            if (hasIntervalMaximumHeartRateBpm()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getIntervalMaximumHeartRateBpm();
            }
            if (hasSessionAverageHeartRateBpm()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSessionAverageHeartRateBpm();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHeartRate.internal_static_GDI_Proto_HeartRate_SwimInterval_fieldAccessorTable.ensureFieldAccessorsInitialized(SwimInterval.class, Builder.class);
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
            return new SwimInterval();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.intervalAverageHeartRateBpm_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.intervalMaximumHeartRateBpm_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.sessionAverageHeartRateBpm_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwimIntervalOrBuilder {
            private int bitField0_;
            private int intervalAverageHeartRateBpm_;
            private int intervalMaximumHeartRateBpm_;
            private int sessionAverageHeartRateBpm_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SwimInterval swimInterval) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    swimInterval.intervalAverageHeartRateBpm_ = this.intervalAverageHeartRateBpm_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    swimInterval.intervalMaximumHeartRateBpm_ = this.intervalMaximumHeartRateBpm_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    swimInterval.sessionAverageHeartRateBpm_ = this.sessionAverageHeartRateBpm_;
                    i14 |= 4;
                }
                swimInterval.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHeartRate.internal_static_GDI_Proto_HeartRate_SwimInterval_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwimInterval build() {
                SwimInterval swimIntervalBuildPartial = buildPartial();
                if (swimIntervalBuildPartial.isInitialized()) {
                    return swimIntervalBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) swimIntervalBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwimInterval buildPartial() {
                SwimInterval swimInterval = new SwimInterval(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(swimInterval);
                }
                onBuilt();
                return swimInterval;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.intervalAverageHeartRateBpm_ = 0;
                this.intervalMaximumHeartRateBpm_ = 0;
                this.sessionAverageHeartRateBpm_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIntervalAverageHeartRateBpm() {
                this.bitField0_ &= -2;
                this.intervalAverageHeartRateBpm_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIntervalMaximumHeartRateBpm() {
                this.bitField0_ &= -3;
                this.intervalMaximumHeartRateBpm_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionAverageHeartRateBpm() {
                this.bitField0_ &= -5;
                this.sessionAverageHeartRateBpm_ = 0;
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
                return GDIHeartRate.internal_static_GDI_Proto_HeartRate_SwimInterval_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
            public int getIntervalAverageHeartRateBpm() {
                return this.intervalAverageHeartRateBpm_;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
            public int getIntervalMaximumHeartRateBpm() {
                return this.intervalMaximumHeartRateBpm_;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
            public int getSessionAverageHeartRateBpm() {
                return this.sessionAverageHeartRateBpm_;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
            public boolean hasIntervalAverageHeartRateBpm() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
            public boolean hasIntervalMaximumHeartRateBpm() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.SwimIntervalOrBuilder
            public boolean hasSessionAverageHeartRateBpm() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHeartRate.internal_static_GDI_Proto_HeartRate_SwimInterval_fieldAccessorTable.ensureFieldAccessorsInitialized(SwimInterval.class, Builder.class);
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
                                    this.intervalAverageHeartRateBpm_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.intervalMaximumHeartRateBpm_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.sessionAverageHeartRateBpm_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIntervalAverageHeartRateBpm(int i14) {
                this.intervalAverageHeartRateBpm_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIntervalMaximumHeartRateBpm(int i14) {
                this.intervalMaximumHeartRateBpm_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionAverageHeartRateBpm(int i14) {
                this.sessionAverageHeartRateBpm_ = i14;
                this.bitField0_ |= 4;
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
            public SwimInterval getDefaultInstanceForType() {
                return SwimInterval.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwimInterval) {
                    return mergeFrom((SwimInterval) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwimInterval swimInterval) {
                if (swimInterval == SwimInterval.getDefaultInstance()) {
                    return this;
                }
                if (swimInterval.hasIntervalAverageHeartRateBpm()) {
                    setIntervalAverageHeartRateBpm(swimInterval.getIntervalAverageHeartRateBpm());
                }
                if (swimInterval.hasIntervalMaximumHeartRateBpm()) {
                    setIntervalMaximumHeartRateBpm(swimInterval.getIntervalMaximumHeartRateBpm());
                }
                if (swimInterval.hasSessionAverageHeartRateBpm()) {
                    setSessionAverageHeartRateBpm(swimInterval.getSessionAverageHeartRateBpm());
                }
                mergeUnknownFields(swimInterval.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwimInterval getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SwimInterval parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwimInterval) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwimInterval parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwimInterval parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwimInterval parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwimInterval parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwimInterval parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ SwimInterval(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SwimInterval parseFrom(InputStream inputStream) {
            return (SwimInterval) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private SwimInterval() {
            this.intervalAverageHeartRateBpm_ = 0;
            this.intervalMaximumHeartRateBpm_ = 0;
            this.sessionAverageHeartRateBpm_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwimInterval parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwimInterval) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwimInterval parseFrom(CodedInputStream codedInputStream) {
            return (SwimInterval) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwimInterval parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwimInterval) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MeasurementNotification extends GeneratedMessageV3 implements MeasurementNotificationOrBuilder {
        public static final int BEAT_PERIOD_1_1024THS_S_FIELD_NUMBER = 3;
        public static final int DATA_FIELD_NUMBER = 1013;
        public static final int HEART_RATE_BPM_FIELD_NUMBER = 1;
        public static final int IS_HR_CONFIDENT_FIELD_NUMBER = 2;
        public static final int SWIM_INTERVAL_DATA_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int beatPeriod11024ThsS_;
        private int bitField0_;
        private int heartRateBpm_;
        private boolean isHrConfident_;
        private byte memoizedIsInitialized;
        private SwimInterval swimIntervalData_;
        private static final MeasurementNotification DEFAULT_INSTANCE = new MeasurementNotification();

        @Deprecated
        public static final Parser<MeasurementNotification> PARSER = new AbstractParser<MeasurementNotification>() { // from class: com.garmin.proto.generated.GDIHeartRate.MeasurementNotification.1
            @Override // com.google.protobuf.Parser
            public MeasurementNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MeasurementNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, MeasurementNotification> data = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, MeasurementNotification.class, getDefaultInstance());

        private MeasurementNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.heartRateBpm_ = 0;
            this.isHrConfident_ = false;
            this.beatPeriod11024ThsS_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MeasurementNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHeartRate.internal_static_GDI_Proto_HeartRate_MeasurementNotification_descriptor;
        }

        public static Builder newBuilder(MeasurementNotification measurementNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(measurementNotification);
        }

        public static MeasurementNotification parseDelimitedFrom(InputStream inputStream) {
            return (MeasurementNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MeasurementNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MeasurementNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MeasurementNotification)) {
                return super.equals(obj);
            }
            MeasurementNotification measurementNotification = (MeasurementNotification) obj;
            if (hasHeartRateBpm() != measurementNotification.hasHeartRateBpm()) {
                return false;
            }
            if ((hasHeartRateBpm() && getHeartRateBpm() != measurementNotification.getHeartRateBpm()) || hasIsHrConfident() != measurementNotification.hasIsHrConfident()) {
                return false;
            }
            if ((hasIsHrConfident() && getIsHrConfident() != measurementNotification.getIsHrConfident()) || hasBeatPeriod11024ThsS() != measurementNotification.hasBeatPeriod11024ThsS()) {
                return false;
            }
            if ((!hasBeatPeriod11024ThsS() || getBeatPeriod11024ThsS() == measurementNotification.getBeatPeriod11024ThsS()) && hasSwimIntervalData() == measurementNotification.hasSwimIntervalData()) {
                return (!hasSwimIntervalData() || getSwimIntervalData().equals(measurementNotification.getSwimIntervalData())) && getUnknownFields().equals(measurementNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
        public int getBeatPeriod11024ThsS() {
            return this.beatPeriod11024ThsS_;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
        public int getHeartRateBpm() {
            return this.heartRateBpm_;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
        public boolean getIsHrConfident() {
            return this.isHrConfident_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MeasurementNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.heartRateBpm_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.isHrConfident_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.beatPeriod11024ThsS_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, getSwimIntervalData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
        public SwimInterval getSwimIntervalData() {
            SwimInterval swimInterval = this.swimIntervalData_;
            return swimInterval == null ? SwimInterval.getDefaultInstance() : swimInterval;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
        public SwimIntervalOrBuilder getSwimIntervalDataOrBuilder() {
            SwimInterval swimInterval = this.swimIntervalData_;
            return swimInterval == null ? SwimInterval.getDefaultInstance() : swimInterval;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
        public boolean hasBeatPeriod11024ThsS() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
        public boolean hasHeartRateBpm() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
        public boolean hasIsHrConfident() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
        public boolean hasSwimIntervalData() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasHeartRateBpm()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getHeartRateBpm();
            }
            if (hasIsHrConfident()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getIsHrConfident());
            }
            if (hasBeatPeriod11024ThsS()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getBeatPeriod11024ThsS();
            }
            if (hasSwimIntervalData()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSwimIntervalData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHeartRate.internal_static_GDI_Proto_HeartRate_MeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MeasurementNotification.class, Builder.class);
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
            return new MeasurementNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.heartRateBpm_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.isHrConfident_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.beatPeriod11024ThsS_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSwimIntervalData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MeasurementNotificationOrBuilder {
            private int beatPeriod11024ThsS_;
            private int bitField0_;
            private int heartRateBpm_;
            private boolean isHrConfident_;
            private SingleFieldBuilderV3<SwimInterval, SwimInterval.Builder, SwimIntervalOrBuilder> swimIntervalDataBuilder_;
            private SwimInterval swimIntervalData_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(MeasurementNotification measurementNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    measurementNotification.heartRateBpm_ = this.heartRateBpm_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    measurementNotification.isHrConfident_ = this.isHrConfident_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    measurementNotification.beatPeriod11024ThsS_ = this.beatPeriod11024ThsS_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<SwimInterval, SwimInterval.Builder, SwimIntervalOrBuilder> singleFieldBuilderV3 = this.swimIntervalDataBuilder_;
                    measurementNotification.swimIntervalData_ = singleFieldBuilderV3 == null ? this.swimIntervalData_ : (SwimInterval) singleFieldBuilderV3.build();
                    i14 |= 8;
                }
                measurementNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHeartRate.internal_static_GDI_Proto_HeartRate_MeasurementNotification_descriptor;
            }

            private SingleFieldBuilderV3<SwimInterval, SwimInterval.Builder, SwimIntervalOrBuilder> getSwimIntervalDataFieldBuilder() {
                if (this.swimIntervalDataBuilder_ == null) {
                    this.swimIntervalDataBuilder_ = new SingleFieldBuilderV3<>(getSwimIntervalData(), getParentForChildren(), isClean());
                    this.swimIntervalData_ = null;
                }
                return this.swimIntervalDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSwimIntervalDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MeasurementNotification build() {
                MeasurementNotification measurementNotificationBuildPartial = buildPartial();
                if (measurementNotificationBuildPartial.isInitialized()) {
                    return measurementNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) measurementNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MeasurementNotification buildPartial() {
                MeasurementNotification measurementNotification = new MeasurementNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(measurementNotification);
                }
                onBuilt();
                return measurementNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.heartRateBpm_ = 0;
                this.isHrConfident_ = false;
                this.beatPeriod11024ThsS_ = 0;
                this.swimIntervalData_ = null;
                SingleFieldBuilderV3<SwimInterval, SwimInterval.Builder, SwimIntervalOrBuilder> singleFieldBuilderV3 = this.swimIntervalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.swimIntervalDataBuilder_ = null;
                }
                return this;
            }

            public Builder clearBeatPeriod11024ThsS() {
                this.bitField0_ &= -5;
                this.beatPeriod11024ThsS_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHeartRateBpm() {
                this.bitField0_ &= -2;
                this.heartRateBpm_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIsHrConfident() {
                this.bitField0_ &= -3;
                this.isHrConfident_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSwimIntervalData() {
                this.bitField0_ &= -9;
                this.swimIntervalData_ = null;
                SingleFieldBuilderV3<SwimInterval, SwimInterval.Builder, SwimIntervalOrBuilder> singleFieldBuilderV3 = this.swimIntervalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.swimIntervalDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
            public int getBeatPeriod11024ThsS() {
                return this.beatPeriod11024ThsS_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIHeartRate.internal_static_GDI_Proto_HeartRate_MeasurementNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
            public int getHeartRateBpm() {
                return this.heartRateBpm_;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
            public boolean getIsHrConfident() {
                return this.isHrConfident_;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
            public SwimInterval getSwimIntervalData() {
                SingleFieldBuilderV3<SwimInterval, SwimInterval.Builder, SwimIntervalOrBuilder> singleFieldBuilderV3 = this.swimIntervalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwimInterval) singleFieldBuilderV3.getMessage();
                }
                SwimInterval swimInterval = this.swimIntervalData_;
                return swimInterval == null ? SwimInterval.getDefaultInstance() : swimInterval;
            }

            public SwimInterval.Builder getSwimIntervalDataBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SwimInterval.Builder) getSwimIntervalDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
            public SwimIntervalOrBuilder getSwimIntervalDataOrBuilder() {
                SingleFieldBuilderV3<SwimInterval, SwimInterval.Builder, SwimIntervalOrBuilder> singleFieldBuilderV3 = this.swimIntervalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwimIntervalOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwimInterval swimInterval = this.swimIntervalData_;
                return swimInterval == null ? SwimInterval.getDefaultInstance() : swimInterval;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
            public boolean hasBeatPeriod11024ThsS() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
            public boolean hasHeartRateBpm() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
            public boolean hasIsHrConfident() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHeartRate.MeasurementNotificationOrBuilder
            public boolean hasSwimIntervalData() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHeartRate.internal_static_GDI_Proto_HeartRate_MeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MeasurementNotification.class, Builder.class);
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
                                    this.heartRateBpm_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.isHrConfident_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.beatPeriod11024ThsS_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getSwimIntervalDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSwimIntervalData(SwimInterval swimInterval) {
                SwimInterval swimInterval2;
                SingleFieldBuilderV3<SwimInterval, SwimInterval.Builder, SwimIntervalOrBuilder> singleFieldBuilderV3 = this.swimIntervalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(swimInterval);
                } else if ((this.bitField0_ & 8) == 0 || (swimInterval2 = this.swimIntervalData_) == null || swimInterval2 == SwimInterval.getDefaultInstance()) {
                    this.swimIntervalData_ = swimInterval;
                } else {
                    getSwimIntervalDataBuilder().mergeFrom(swimInterval);
                }
                if (this.swimIntervalData_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBeatPeriod11024ThsS(int i14) {
                this.beatPeriod11024ThsS_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHeartRateBpm(int i14) {
                this.heartRateBpm_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIsHrConfident(boolean z14) {
                this.isHrConfident_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSwimIntervalData(SwimInterval.Builder builder) {
                SingleFieldBuilderV3<SwimInterval, SwimInterval.Builder, SwimIntervalOrBuilder> singleFieldBuilderV3 = this.swimIntervalDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.swimIntervalData_ = builder.build();
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
            public MeasurementNotification getDefaultInstanceForType() {
                return MeasurementNotification.getDefaultInstance();
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

            public Builder setSwimIntervalData(SwimInterval swimInterval) {
                SingleFieldBuilderV3<SwimInterval, SwimInterval.Builder, SwimIntervalOrBuilder> singleFieldBuilderV3 = this.swimIntervalDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    swimInterval.getClass();
                    this.swimIntervalData_ = swimInterval;
                } else {
                    singleFieldBuilderV3.setMessage(swimInterval);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MeasurementNotification) {
                    return mergeFrom((MeasurementNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MeasurementNotification measurementNotification) {
                if (measurementNotification == MeasurementNotification.getDefaultInstance()) {
                    return this;
                }
                if (measurementNotification.hasHeartRateBpm()) {
                    setHeartRateBpm(measurementNotification.getHeartRateBpm());
                }
                if (measurementNotification.hasIsHrConfident()) {
                    setIsHrConfident(measurementNotification.getIsHrConfident());
                }
                if (measurementNotification.hasBeatPeriod11024ThsS()) {
                    setBeatPeriod11024ThsS(measurementNotification.getBeatPeriod11024ThsS());
                }
                if (measurementNotification.hasSwimIntervalData()) {
                    mergeSwimIntervalData(measurementNotification.getSwimIntervalData());
                }
                mergeUnknownFields(measurementNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MeasurementNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static MeasurementNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MeasurementNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MeasurementNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MeasurementNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MeasurementNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MeasurementNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MeasurementNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ MeasurementNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static MeasurementNotification parseFrom(InputStream inputStream) {
            return (MeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private MeasurementNotification() {
            this.heartRateBpm_ = 0;
            this.isHrConfident_ = false;
            this.beatPeriod11024ThsS_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MeasurementNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MeasurementNotification parseFrom(CodedInputStream codedInputStream) {
            return (MeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MeasurementNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
