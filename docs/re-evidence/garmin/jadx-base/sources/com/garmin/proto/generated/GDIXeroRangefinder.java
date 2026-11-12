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

/* JADX INFO: loaded from: classes13.dex */
public final class GDIXeroRangefinder {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018GDIXeroRangefinder.proto\u0012\u0019GDI.Proto.XeroRangefinder\u001a\u0015GDIEventSharing.proto\"\t\n\u0007Service\"ï\u0002\n\u0017MeasurementNotification\u0012\u001b\n\u0013measured_distance_m\u0018\u0001 \u0001(\u0002\u0012\u0013\n\u000bheading_deg\u0018\u0002 \u0001(\u0002\u0012\u0017\n\u000finclination_deg\u0018\u0003 \u0001(\u0002\u0012\u0015\n\rtemperature_c\u0018\u0004 \u0001(\u0002\u0012\u0013\n\u000bpressure_mb\u0018\u0005 \u0001(\u0002\u0012\u0018\n\u0010humidity_percent\u0018\u0006 \u0001(\u0002\u0012\u0018\n\u0010wind_speed_1_mps\u0018\u0007 \u0001(\u0002\u0012\u0018\n\u0010wind_speed_2_mps\u0018\b \u0001(\u0002\u0012\u001a\n\u0012wind_direction_deg\u0018\t \u0001(\u00022s\n\u000bmeasurement\u0012).GDI.Proto.EventSharing.AlertNotification\u0018\u0082\b \u0001(\u000b22.GDI.Proto.XeroRangefinder.MeasurementNotificationB2\n\u001acom.garmin.proto.generatedB\u0012GDIXeroRangefinderH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroRangefinder_MeasurementNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroRangefinder_MeasurementNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroRangefinder_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroRangefinder_Service_fieldAccessorTable;

    public interface MeasurementNotificationOrBuilder extends MessageOrBuilder {
        float getHeadingDeg();

        float getHumidityPercent();

        float getInclinationDeg();

        float getMeasuredDistanceM();

        float getPressureMb();

        float getTemperatureC();

        float getWindDirectionDeg();

        float getWindSpeed1Mps();

        float getWindSpeed2Mps();

        boolean hasHeadingDeg();

        boolean hasHumidityPercent();

        boolean hasInclinationDeg();

        boolean hasMeasuredDistanceM();

        boolean hasPressureMb();

        boolean hasTemperatureC();

        boolean hasWindDirectionDeg();

        boolean hasWindSpeed1Mps();

        boolean hasWindSpeed2Mps();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_XeroRangefinder_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_XeroRangefinder_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[0]);
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_XeroRangefinder_MeasurementNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_XeroRangefinder_MeasurementNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MeasuredDistanceM", "HeadingDeg", "InclinationDeg", "TemperatureC", "PressureMb", "HumidityPercent", "WindSpeed1Mps", "WindSpeed2Mps", "WindDirectionDeg"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDIXeroRangefinder() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(MeasurementNotification.measurement);
    }

    public static final class MeasurementNotification extends GeneratedMessageV3 implements MeasurementNotificationOrBuilder {
        public static final int HEADING_DEG_FIELD_NUMBER = 2;
        public static final int HUMIDITY_PERCENT_FIELD_NUMBER = 6;
        public static final int INCLINATION_DEG_FIELD_NUMBER = 3;
        public static final int MEASURED_DISTANCE_M_FIELD_NUMBER = 1;
        public static final int MEASUREMENT_FIELD_NUMBER = 1026;
        public static final int PRESSURE_MB_FIELD_NUMBER = 5;
        public static final int TEMPERATURE_C_FIELD_NUMBER = 4;
        public static final int WIND_DIRECTION_DEG_FIELD_NUMBER = 9;
        public static final int WIND_SPEED_1_MPS_FIELD_NUMBER = 7;
        public static final int WIND_SPEED_2_MPS_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private float headingDeg_;
        private float humidityPercent_;
        private float inclinationDeg_;
        private float measuredDistanceM_;
        private byte memoizedIsInitialized;
        private float pressureMb_;
        private float temperatureC_;
        private float windDirectionDeg_;
        private float windSpeed1Mps_;
        private float windSpeed2Mps_;
        private static final MeasurementNotification DEFAULT_INSTANCE = new MeasurementNotification();

        @Deprecated
        public static final Parser<MeasurementNotification> PARSER = new AbstractParser<MeasurementNotification>() { // from class: com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotification.1
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, MeasurementNotification> measurement = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, MeasurementNotification.class, getDefaultInstance());

        private MeasurementNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.measuredDistanceM_ = 0.0f;
            this.headingDeg_ = 0.0f;
            this.inclinationDeg_ = 0.0f;
            this.temperatureC_ = 0.0f;
            this.pressureMb_ = 0.0f;
            this.humidityPercent_ = 0.0f;
            this.windSpeed1Mps_ = 0.0f;
            this.windSpeed2Mps_ = 0.0f;
            this.windDirectionDeg_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MeasurementNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroRangefinder.internal_static_GDI_Proto_XeroRangefinder_MeasurementNotification_descriptor;
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
            if (hasMeasuredDistanceM() != measurementNotification.hasMeasuredDistanceM()) {
                return false;
            }
            if ((hasMeasuredDistanceM() && Float.floatToIntBits(getMeasuredDistanceM()) != Float.floatToIntBits(measurementNotification.getMeasuredDistanceM())) || hasHeadingDeg() != measurementNotification.hasHeadingDeg()) {
                return false;
            }
            if ((hasHeadingDeg() && Float.floatToIntBits(getHeadingDeg()) != Float.floatToIntBits(measurementNotification.getHeadingDeg())) || hasInclinationDeg() != measurementNotification.hasInclinationDeg()) {
                return false;
            }
            if ((hasInclinationDeg() && Float.floatToIntBits(getInclinationDeg()) != Float.floatToIntBits(measurementNotification.getInclinationDeg())) || hasTemperatureC() != measurementNotification.hasTemperatureC()) {
                return false;
            }
            if ((hasTemperatureC() && Float.floatToIntBits(getTemperatureC()) != Float.floatToIntBits(measurementNotification.getTemperatureC())) || hasPressureMb() != measurementNotification.hasPressureMb()) {
                return false;
            }
            if ((hasPressureMb() && Float.floatToIntBits(getPressureMb()) != Float.floatToIntBits(measurementNotification.getPressureMb())) || hasHumidityPercent() != measurementNotification.hasHumidityPercent()) {
                return false;
            }
            if ((hasHumidityPercent() && Float.floatToIntBits(getHumidityPercent()) != Float.floatToIntBits(measurementNotification.getHumidityPercent())) || hasWindSpeed1Mps() != measurementNotification.hasWindSpeed1Mps()) {
                return false;
            }
            if ((hasWindSpeed1Mps() && Float.floatToIntBits(getWindSpeed1Mps()) != Float.floatToIntBits(measurementNotification.getWindSpeed1Mps())) || hasWindSpeed2Mps() != measurementNotification.hasWindSpeed2Mps()) {
                return false;
            }
            if ((!hasWindSpeed2Mps() || Float.floatToIntBits(getWindSpeed2Mps()) == Float.floatToIntBits(measurementNotification.getWindSpeed2Mps())) && hasWindDirectionDeg() == measurementNotification.hasWindDirectionDeg()) {
                return (!hasWindDirectionDeg() || Float.floatToIntBits(getWindDirectionDeg()) == Float.floatToIntBits(measurementNotification.getWindDirectionDeg())) && getUnknownFields().equals(measurementNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public float getHeadingDeg() {
            return this.headingDeg_;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public float getHumidityPercent() {
            return this.humidityPercent_;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public float getInclinationDeg() {
            return this.inclinationDeg_;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public float getMeasuredDistanceM() {
            return this.measuredDistanceM_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MeasurementNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public float getPressureMb() {
            return this.pressureMb_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.measuredDistanceM_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.headingDeg_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.inclinationDeg_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.temperatureC_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(5, this.pressureMb_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(6, this.humidityPercent_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(7, this.windSpeed1Mps_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(8, this.windSpeed2Mps_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(9, this.windDirectionDeg_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public float getTemperatureC() {
            return this.temperatureC_;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public float getWindDirectionDeg() {
            return this.windDirectionDeg_;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public float getWindSpeed1Mps() {
            return this.windSpeed1Mps_;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public float getWindSpeed2Mps() {
            return this.windSpeed2Mps_;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public boolean hasHeadingDeg() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public boolean hasHumidityPercent() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public boolean hasInclinationDeg() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public boolean hasMeasuredDistanceM() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public boolean hasPressureMb() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public boolean hasTemperatureC() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public boolean hasWindDirectionDeg() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public boolean hasWindSpeed1Mps() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
        public boolean hasWindSpeed2Mps() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMeasuredDistanceM()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getMeasuredDistanceM());
            }
            if (hasHeadingDeg()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getHeadingDeg());
            }
            if (hasInclinationDeg()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getInclinationDeg());
            }
            if (hasTemperatureC()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getTemperatureC());
            }
            if (hasPressureMb()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getPressureMb());
            }
            if (hasHumidityPercent()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Float.floatToIntBits(getHumidityPercent());
            }
            if (hasWindSpeed1Mps()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Float.floatToIntBits(getWindSpeed1Mps());
            }
            if (hasWindSpeed2Mps()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Float.floatToIntBits(getWindSpeed2Mps());
            }
            if (hasWindDirectionDeg()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Float.floatToIntBits(getWindDirectionDeg());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroRangefinder.internal_static_GDI_Proto_XeroRangefinder_MeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MeasurementNotification.class, Builder.class);
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
                codedOutputStream.writeFloat(1, this.measuredDistanceM_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.headingDeg_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.inclinationDeg_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.temperatureC_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.pressureMb_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeFloat(6, this.humidityPercent_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeFloat(7, this.windSpeed1Mps_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeFloat(8, this.windSpeed2Mps_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeFloat(9, this.windDirectionDeg_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MeasurementNotificationOrBuilder {
            private int bitField0_;
            private float headingDeg_;
            private float humidityPercent_;
            private float inclinationDeg_;
            private float measuredDistanceM_;
            private float pressureMb_;
            private float temperatureC_;
            private float windDirectionDeg_;
            private float windSpeed1Mps_;
            private float windSpeed2Mps_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(MeasurementNotification measurementNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    measurementNotification.measuredDistanceM_ = this.measuredDistanceM_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    measurementNotification.headingDeg_ = this.headingDeg_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    measurementNotification.inclinationDeg_ = this.inclinationDeg_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    measurementNotification.temperatureC_ = this.temperatureC_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    measurementNotification.pressureMb_ = this.pressureMb_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    measurementNotification.humidityPercent_ = this.humidityPercent_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    measurementNotification.windSpeed1Mps_ = this.windSpeed1Mps_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    measurementNotification.windSpeed2Mps_ = this.windSpeed2Mps_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    measurementNotification.windDirectionDeg_ = this.windDirectionDeg_;
                    i14 |= 256;
                }
                measurementNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroRangefinder.internal_static_GDI_Proto_XeroRangefinder_MeasurementNotification_descriptor;
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
                this.measuredDistanceM_ = 0.0f;
                this.headingDeg_ = 0.0f;
                this.inclinationDeg_ = 0.0f;
                this.temperatureC_ = 0.0f;
                this.pressureMb_ = 0.0f;
                this.humidityPercent_ = 0.0f;
                this.windSpeed1Mps_ = 0.0f;
                this.windSpeed2Mps_ = 0.0f;
                this.windDirectionDeg_ = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHeadingDeg() {
                this.bitField0_ &= -3;
                this.headingDeg_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearHumidityPercent() {
                this.bitField0_ &= -33;
                this.humidityPercent_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearInclinationDeg() {
                this.bitField0_ &= -5;
                this.inclinationDeg_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMeasuredDistanceM() {
                this.bitField0_ &= -2;
                this.measuredDistanceM_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPressureMb() {
                this.bitField0_ &= -17;
                this.pressureMb_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearTemperatureC() {
                this.bitField0_ &= -9;
                this.temperatureC_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearWindDirectionDeg() {
                this.bitField0_ &= -257;
                this.windDirectionDeg_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearWindSpeed1Mps() {
                this.bitField0_ &= -65;
                this.windSpeed1Mps_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearWindSpeed2Mps() {
                this.bitField0_ &= -129;
                this.windSpeed2Mps_ = 0.0f;
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
                return GDIXeroRangefinder.internal_static_GDI_Proto_XeroRangefinder_MeasurementNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public float getHeadingDeg() {
                return this.headingDeg_;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public float getHumidityPercent() {
                return this.humidityPercent_;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public float getInclinationDeg() {
                return this.inclinationDeg_;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public float getMeasuredDistanceM() {
                return this.measuredDistanceM_;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public float getPressureMb() {
                return this.pressureMb_;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public float getTemperatureC() {
                return this.temperatureC_;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public float getWindDirectionDeg() {
                return this.windDirectionDeg_;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public float getWindSpeed1Mps() {
                return this.windSpeed1Mps_;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public float getWindSpeed2Mps() {
                return this.windSpeed2Mps_;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public boolean hasHeadingDeg() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public boolean hasHumidityPercent() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public boolean hasInclinationDeg() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public boolean hasMeasuredDistanceM() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public boolean hasPressureMb() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public boolean hasTemperatureC() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public boolean hasWindDirectionDeg() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public boolean hasWindSpeed1Mps() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroRangefinder.MeasurementNotificationOrBuilder
            public boolean hasWindSpeed2Mps() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroRangefinder.internal_static_GDI_Proto_XeroRangefinder_MeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MeasurementNotification.class, Builder.class);
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
                                    this.measuredDistanceM_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.headingDeg_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.inclinationDeg_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                } else if (tag == 37) {
                                    this.temperatureC_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8;
                                } else if (tag == 45) {
                                    this.pressureMb_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 16;
                                } else if (tag == 53) {
                                    this.humidityPercent_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 32;
                                } else if (tag == 61) {
                                    this.windSpeed1Mps_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 64;
                                } else if (tag == 69) {
                                    this.windSpeed2Mps_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 128;
                                } else if (tag == 77) {
                                    this.windDirectionDeg_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 256;
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

            public Builder setHeadingDeg(float f14) {
                this.headingDeg_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setHumidityPercent(float f14) {
                this.humidityPercent_ = f14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setInclinationDeg(float f14) {
                this.inclinationDeg_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMeasuredDistanceM(float f14) {
                this.measuredDistanceM_ = f14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPressureMb(float f14) {
                this.pressureMb_ = f14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTemperatureC(float f14) {
                this.temperatureC_ = f14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWindDirectionDeg(float f14) {
                this.windDirectionDeg_ = f14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setWindSpeed1Mps(float f14) {
                this.windSpeed1Mps_ = f14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setWindSpeed2Mps(float f14) {
                this.windSpeed2Mps_ = f14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
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
            public MeasurementNotification getDefaultInstanceForType() {
                return MeasurementNotification.getDefaultInstance();
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
                if (measurementNotification.hasMeasuredDistanceM()) {
                    setMeasuredDistanceM(measurementNotification.getMeasuredDistanceM());
                }
                if (measurementNotification.hasHeadingDeg()) {
                    setHeadingDeg(measurementNotification.getHeadingDeg());
                }
                if (measurementNotification.hasInclinationDeg()) {
                    setInclinationDeg(measurementNotification.getInclinationDeg());
                }
                if (measurementNotification.hasTemperatureC()) {
                    setTemperatureC(measurementNotification.getTemperatureC());
                }
                if (measurementNotification.hasPressureMb()) {
                    setPressureMb(measurementNotification.getPressureMb());
                }
                if (measurementNotification.hasHumidityPercent()) {
                    setHumidityPercent(measurementNotification.getHumidityPercent());
                }
                if (measurementNotification.hasWindSpeed1Mps()) {
                    setWindSpeed1Mps(measurementNotification.getWindSpeed1Mps());
                }
                if (measurementNotification.hasWindSpeed2Mps()) {
                    setWindSpeed2Mps(measurementNotification.getWindSpeed2Mps());
                }
                if (measurementNotification.hasWindDirectionDeg()) {
                    setWindDirectionDeg(measurementNotification.getWindDirectionDeg());
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

        public static MeasurementNotification parseFrom(InputStream inputStream) {
            return (MeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
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

        public /* synthetic */ MeasurementNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private MeasurementNotification() {
            this.measuredDistanceM_ = 0.0f;
            this.headingDeg_ = 0.0f;
            this.inclinationDeg_ = 0.0f;
            this.temperatureC_ = 0.0f;
            this.pressureMb_ = 0.0f;
            this.humidityPercent_ = 0.0f;
            this.windSpeed1Mps_ = 0.0f;
            this.windSpeed2Mps_ = 0.0f;
            this.windDirectionDeg_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIXeroRangefinder.Service.1
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
            return GDIXeroRangefinder.internal_static_GDI_Proto_XeroRangefinder_Service_descriptor;
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
            return GDIXeroRangefinder.internal_static_GDI_Proto_XeroRangefinder_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                return GDIXeroRangefinder.internal_static_GDI_Proto_XeroRangefinder_Service_descriptor;
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
                return GDIXeroRangefinder.internal_static_GDI_Proto_XeroRangefinder_Service_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroRangefinder.internal_static_GDI_Proto_XeroRangefinder_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
