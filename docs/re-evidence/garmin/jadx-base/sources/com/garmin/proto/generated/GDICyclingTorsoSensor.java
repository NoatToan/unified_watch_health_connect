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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class GDICyclingTorsoSensor {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bGDICyclingTorsoSensor.proto\u0012\u001cGDI.Proto.CyclingTorsoSensor\u001a\u0015GDIEventSharing.proto\"\t\n\u0007Service\"M\n\tPitchRoll\u0012\f\n\u0004ts_s\u0018\u0001 \u0001(\r\u0012\r\n\u0005pitch\u0018\u0002 \u0001(\u0002\u0012\f\n\u0004roll\u0018\u0003 \u0001(\u0002\u0012\u0015\n\rahrs_residual\u0018\u0004 \u0001(\u0002\"6\n\bStanding\u0012\f\n\u0004ts_s\u0018\u0001 \u0001(\r\u0012\u001c\n\u0014vertical_oscillation\u0018\u0002 \u0001(\u0002\"\u008f\u0002\n\u0017MeasurementNotification\u0012\f\n\u0004ts_c\u0018\u0001 \u0001(\r\u0012;\n\npitch_roll\u0018\u0002 \u0001(\u000b2'.GDI.Proto.CyclingTorsoSensor.PitchRoll\u00128\n\bstanding\u0018\u0003 \u0001(\u000b2&.GDI.Proto.CyclingTorsoSensor.Standing2o\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018þ\u0007 \u0001(\u000b25.GDI.Proto.CyclingTorsoSensor.MeasurementNotificationB5\n\u001acom.garmin.proto.generatedB\u0015GDICyclingTorsoSensorH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_CyclingTorsoSensor_MeasurementNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_CyclingTorsoSensor_MeasurementNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_CyclingTorsoSensor_PitchRoll_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_CyclingTorsoSensor_PitchRoll_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_CyclingTorsoSensor_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_CyclingTorsoSensor_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_CyclingTorsoSensor_Standing_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_CyclingTorsoSensor_Standing_fieldAccessorTable;

    public interface MeasurementNotificationOrBuilder extends MessageOrBuilder {
        PitchRoll getPitchRoll();

        PitchRollOrBuilder getPitchRollOrBuilder();

        Standing getStanding();

        StandingOrBuilder getStandingOrBuilder();

        int getTsC();

        boolean hasPitchRoll();

        boolean hasStanding();

        boolean hasTsC();
    }

    public interface PitchRollOrBuilder extends MessageOrBuilder {
        float getAhrsResidual();

        float getPitch();

        float getRoll();

        int getTsS();

        boolean hasAhrsResidual();

        boolean hasPitch();

        boolean hasRoll();

        boolean hasTsS();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
    }

    public interface StandingOrBuilder extends MessageOrBuilder {
        int getTsS();

        float getVerticalOscillation();

        boolean hasTsS();

        boolean hasVerticalOscillation();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_CyclingTorsoSensor_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_CyclingTorsoSensor_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[0]);
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_CyclingTorsoSensor_PitchRoll_descriptor = descriptor3;
        internal_static_GDI_Proto_CyclingTorsoSensor_PitchRoll_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"TsS", "Pitch", "Roll", "AhrsResidual"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_CyclingTorsoSensor_Standing_descriptor = descriptor4;
        internal_static_GDI_Proto_CyclingTorsoSensor_Standing_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"TsS", "VerticalOscillation"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_CyclingTorsoSensor_MeasurementNotification_descriptor = descriptor5;
        internal_static_GDI_Proto_CyclingTorsoSensor_MeasurementNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"TsC", "PitchRoll", "Standing"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDICyclingTorsoSensor() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(MeasurementNotification.data);
    }

    public static final class PitchRoll extends GeneratedMessageV3 implements PitchRollOrBuilder {
        public static final int AHRS_RESIDUAL_FIELD_NUMBER = 4;
        private static final PitchRoll DEFAULT_INSTANCE = new PitchRoll();

        @Deprecated
        public static final Parser<PitchRoll> PARSER = new AbstractParser<PitchRoll>() { // from class: com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRoll.1
            @Override // com.google.protobuf.Parser
            public PitchRoll parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PitchRoll.newBuilder();
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
        public static final int PITCH_FIELD_NUMBER = 2;
        public static final int ROLL_FIELD_NUMBER = 3;
        public static final int TS_S_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private float ahrsResidual_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private float pitch_;
        private float roll_;
        private int tsS_;

        private PitchRoll(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.tsS_ = 0;
            this.pitch_ = 0.0f;
            this.roll_ = 0.0f;
            this.ahrsResidual_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PitchRoll getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_PitchRoll_descriptor;
        }

        public static Builder newBuilder(PitchRoll pitchRoll) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pitchRoll);
        }

        public static PitchRoll parseDelimitedFrom(InputStream inputStream) {
            return (PitchRoll) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PitchRoll parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PitchRoll> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PitchRoll)) {
                return super.equals(obj);
            }
            PitchRoll pitchRoll = (PitchRoll) obj;
            if (hasTsS() != pitchRoll.hasTsS()) {
                return false;
            }
            if ((hasTsS() && getTsS() != pitchRoll.getTsS()) || hasPitch() != pitchRoll.hasPitch()) {
                return false;
            }
            if ((hasPitch() && Float.floatToIntBits(getPitch()) != Float.floatToIntBits(pitchRoll.getPitch())) || hasRoll() != pitchRoll.hasRoll()) {
                return false;
            }
            if ((!hasRoll() || Float.floatToIntBits(getRoll()) == Float.floatToIntBits(pitchRoll.getRoll())) && hasAhrsResidual() == pitchRoll.hasAhrsResidual()) {
                return (!hasAhrsResidual() || Float.floatToIntBits(getAhrsResidual()) == Float.floatToIntBits(pitchRoll.getAhrsResidual())) && getUnknownFields().equals(pitchRoll.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
        public float getAhrsResidual() {
            return this.ahrsResidual_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PitchRoll> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
        public float getPitch() {
            return this.pitch_;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
        public float getRoll() {
            return this.roll_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.tsS_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(2, this.pitch_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(3, this.roll_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(4, this.ahrsResidual_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
        public int getTsS() {
            return this.tsS_;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
        public boolean hasAhrsResidual() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
        public boolean hasPitch() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
        public boolean hasRoll() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
        public boolean hasTsS() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTsS()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTsS();
            }
            if (hasPitch()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getPitch());
            }
            if (hasRoll()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getRoll());
            }
            if (hasAhrsResidual()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getAhrsResidual());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_PitchRoll_fieldAccessorTable.ensureFieldAccessorsInitialized(PitchRoll.class, Builder.class);
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
            return new PitchRoll();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.tsS_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.pitch_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.roll_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.ahrsResidual_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PitchRollOrBuilder {
            private float ahrsResidual_;
            private int bitField0_;
            private float pitch_;
            private float roll_;
            private int tsS_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(PitchRoll pitchRoll) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    pitchRoll.tsS_ = this.tsS_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    pitchRoll.pitch_ = this.pitch_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    pitchRoll.roll_ = this.roll_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    pitchRoll.ahrsResidual_ = this.ahrsResidual_;
                    i14 |= 8;
                }
                pitchRoll.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_PitchRoll_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PitchRoll build() {
                PitchRoll pitchRollBuildPartial = buildPartial();
                if (pitchRollBuildPartial.isInitialized()) {
                    return pitchRollBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pitchRollBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PitchRoll buildPartial() {
                PitchRoll pitchRoll = new PitchRoll(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pitchRoll);
                }
                onBuilt();
                return pitchRoll;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.tsS_ = 0;
                this.pitch_ = 0.0f;
                this.roll_ = 0.0f;
                this.ahrsResidual_ = 0.0f;
                return this;
            }

            public Builder clearAhrsResidual() {
                this.bitField0_ &= -9;
                this.ahrsResidual_ = 0.0f;
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

            public Builder clearPitch() {
                this.bitField0_ &= -3;
                this.pitch_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearRoll() {
                this.bitField0_ &= -5;
                this.roll_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearTsS() {
                this.bitField0_ &= -2;
                this.tsS_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
            public float getAhrsResidual() {
                return this.ahrsResidual_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_PitchRoll_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
            public float getPitch() {
                return this.pitch_;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
            public float getRoll() {
                return this.roll_;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
            public int getTsS() {
                return this.tsS_;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
            public boolean hasAhrsResidual() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
            public boolean hasPitch() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
            public boolean hasRoll() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.PitchRollOrBuilder
            public boolean hasTsS() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_PitchRoll_fieldAccessorTable.ensureFieldAccessorsInitialized(PitchRoll.class, Builder.class);
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
                                    this.tsS_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.pitch_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.roll_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                } else if (tag == 37) {
                                    this.ahrsResidual_ = codedInputStream.readFloat();
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

            public Builder setAhrsResidual(float f14) {
                this.ahrsResidual_ = f14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPitch(float f14) {
                this.pitch_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRoll(float f14) {
                this.roll_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTsS(int i14) {
                this.tsS_ = i14;
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
            public PitchRoll getDefaultInstanceForType() {
                return PitchRoll.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PitchRoll) {
                    return mergeFrom((PitchRoll) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PitchRoll pitchRoll) {
                if (pitchRoll == PitchRoll.getDefaultInstance()) {
                    return this;
                }
                if (pitchRoll.hasTsS()) {
                    setTsS(pitchRoll.getTsS());
                }
                if (pitchRoll.hasPitch()) {
                    setPitch(pitchRoll.getPitch());
                }
                if (pitchRoll.hasRoll()) {
                    setRoll(pitchRoll.getRoll());
                }
                if (pitchRoll.hasAhrsResidual()) {
                    setAhrsResidual(pitchRoll.getAhrsResidual());
                }
                mergeUnknownFields(pitchRoll.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PitchRoll getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PitchRoll parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PitchRoll) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PitchRoll parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PitchRoll parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PitchRoll parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PitchRoll parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PitchRoll parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PitchRoll parseFrom(InputStream inputStream) {
            return (PitchRoll) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PitchRoll parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PitchRoll) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ PitchRoll(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private PitchRoll() {
            this.tsS_ = 0;
            this.pitch_ = 0.0f;
            this.roll_ = 0.0f;
            this.ahrsResidual_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PitchRoll parseFrom(CodedInputStream codedInputStream) {
            return (PitchRoll) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PitchRoll parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PitchRoll) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDICyclingTorsoSensor.Service.1
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
            return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_Service_descriptor;
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
            return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_Service_descriptor;
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
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_Service_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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

    public static final class Standing extends GeneratedMessageV3 implements StandingOrBuilder {
        private static final Standing DEFAULT_INSTANCE = new Standing();

        @Deprecated
        public static final Parser<Standing> PARSER = new AbstractParser<Standing>() { // from class: com.garmin.proto.generated.GDICyclingTorsoSensor.Standing.1
            @Override // com.google.protobuf.Parser
            public Standing parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Standing.newBuilder();
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
        public static final int TS_S_FIELD_NUMBER = 1;
        public static final int VERTICAL_OSCILLATION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int tsS_;
        private float verticalOscillation_;

        private Standing(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.tsS_ = 0;
            this.verticalOscillation_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Standing getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_Standing_descriptor;
        }

        public static Builder newBuilder(Standing standing) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(standing);
        }

        public static Standing parseDelimitedFrom(InputStream inputStream) {
            return (Standing) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Standing parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Standing> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Standing)) {
                return super.equals(obj);
            }
            Standing standing = (Standing) obj;
            if (hasTsS() != standing.hasTsS()) {
                return false;
            }
            if ((!hasTsS() || getTsS() == standing.getTsS()) && hasVerticalOscillation() == standing.hasVerticalOscillation()) {
                return (!hasVerticalOscillation() || Float.floatToIntBits(getVerticalOscillation()) == Float.floatToIntBits(standing.getVerticalOscillation())) && getUnknownFields().equals(standing.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Standing> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.tsS_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(2, this.verticalOscillation_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.StandingOrBuilder
        public int getTsS() {
            return this.tsS_;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.StandingOrBuilder
        public float getVerticalOscillation() {
            return this.verticalOscillation_;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.StandingOrBuilder
        public boolean hasTsS() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.StandingOrBuilder
        public boolean hasVerticalOscillation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTsS()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTsS();
            }
            if (hasVerticalOscillation()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getVerticalOscillation());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_Standing_fieldAccessorTable.ensureFieldAccessorsInitialized(Standing.class, Builder.class);
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
            return new Standing();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.tsS_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.verticalOscillation_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StandingOrBuilder {
            private int bitField0_;
            private int tsS_;
            private float verticalOscillation_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(Standing standing) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    standing.tsS_ = this.tsS_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    standing.verticalOscillation_ = this.verticalOscillation_;
                    i14 |= 2;
                }
                standing.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_Standing_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Standing build() {
                Standing standingBuildPartial = buildPartial();
                if (standingBuildPartial.isInitialized()) {
                    return standingBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) standingBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Standing buildPartial() {
                Standing standing = new Standing(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(standing);
                }
                onBuilt();
                return standing;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.tsS_ = 0;
                this.verticalOscillation_ = 0.0f;
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

            public Builder clearTsS() {
                this.bitField0_ &= -2;
                this.tsS_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVerticalOscillation() {
                this.bitField0_ &= -3;
                this.verticalOscillation_ = 0.0f;
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
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_Standing_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.StandingOrBuilder
            public int getTsS() {
                return this.tsS_;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.StandingOrBuilder
            public float getVerticalOscillation() {
                return this.verticalOscillation_;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.StandingOrBuilder
            public boolean hasTsS() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.StandingOrBuilder
            public boolean hasVerticalOscillation() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_Standing_fieldAccessorTable.ensureFieldAccessorsInitialized(Standing.class, Builder.class);
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
                                    this.tsS_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.verticalOscillation_ = codedInputStream.readFloat();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTsS(int i14) {
                this.tsS_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setVerticalOscillation(float f14) {
                this.verticalOscillation_ = f14;
                this.bitField0_ |= 2;
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
            public Standing getDefaultInstanceForType() {
                return Standing.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Standing) {
                    return mergeFrom((Standing) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Standing standing) {
                if (standing == Standing.getDefaultInstance()) {
                    return this;
                }
                if (standing.hasTsS()) {
                    setTsS(standing.getTsS());
                }
                if (standing.hasVerticalOscillation()) {
                    setVerticalOscillation(standing.getVerticalOscillation());
                }
                mergeUnknownFields(standing.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Standing getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Standing parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Standing) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Standing parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Standing parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Standing parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Standing parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ Standing(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Standing parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private Standing() {
            this.tsS_ = 0;
            this.verticalOscillation_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Standing parseFrom(InputStream inputStream) {
            return (Standing) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Standing parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Standing) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Standing parseFrom(CodedInputStream codedInputStream) {
            return (Standing) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Standing parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Standing) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MeasurementNotification extends GeneratedMessageV3 implements MeasurementNotificationOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1022;
        public static final int PITCH_ROLL_FIELD_NUMBER = 2;
        public static final int STANDING_FIELD_NUMBER = 3;
        public static final int TS_C_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private PitchRoll pitchRoll_;
        private Standing standing_;
        private int tsC_;
        private static final MeasurementNotification DEFAULT_INSTANCE = new MeasurementNotification();

        @Deprecated
        public static final Parser<MeasurementNotification> PARSER = new AbstractParser<MeasurementNotification>() { // from class: com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotification.1
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
            this.tsC_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MeasurementNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_MeasurementNotification_descriptor;
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
            if (hasTsC() != measurementNotification.hasTsC()) {
                return false;
            }
            if ((hasTsC() && getTsC() != measurementNotification.getTsC()) || hasPitchRoll() != measurementNotification.hasPitchRoll()) {
                return false;
            }
            if ((!hasPitchRoll() || getPitchRoll().equals(measurementNotification.getPitchRoll())) && hasStanding() == measurementNotification.hasStanding()) {
                return (!hasStanding() || getStanding().equals(measurementNotification.getStanding())) && getUnknownFields().equals(measurementNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MeasurementNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
        public PitchRoll getPitchRoll() {
            PitchRoll pitchRoll = this.pitchRoll_;
            return pitchRoll == null ? PitchRoll.getDefaultInstance() : pitchRoll;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
        public PitchRollOrBuilder getPitchRollOrBuilder() {
            PitchRoll pitchRoll = this.pitchRoll_;
            return pitchRoll == null ? PitchRoll.getDefaultInstance() : pitchRoll;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.tsC_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getPitchRoll());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getStanding());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
        public Standing getStanding() {
            Standing standing = this.standing_;
            return standing == null ? Standing.getDefaultInstance() : standing;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
        public StandingOrBuilder getStandingOrBuilder() {
            Standing standing = this.standing_;
            return standing == null ? Standing.getDefaultInstance() : standing;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
        public int getTsC() {
            return this.tsC_;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
        public boolean hasPitchRoll() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
        public boolean hasStanding() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
        public boolean hasTsC() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTsC()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTsC();
            }
            if (hasPitchRoll()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPitchRoll().hashCode();
            }
            if (hasStanding()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStanding().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_MeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MeasurementNotification.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.tsC_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getPitchRoll());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getStanding());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MeasurementNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<PitchRoll, PitchRoll.Builder, PitchRollOrBuilder> pitchRollBuilder_;
            private PitchRoll pitchRoll_;
            private SingleFieldBuilderV3<Standing, Standing.Builder, StandingOrBuilder> standingBuilder_;
            private Standing standing_;
            private int tsC_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(MeasurementNotification measurementNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    measurementNotification.tsC_ = this.tsC_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<PitchRoll, PitchRoll.Builder, PitchRollOrBuilder> singleFieldBuilderV3 = this.pitchRollBuilder_;
                    measurementNotification.pitchRoll_ = singleFieldBuilderV3 == null ? this.pitchRoll_ : (PitchRoll) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<Standing, Standing.Builder, StandingOrBuilder> singleFieldBuilderV4 = this.standingBuilder_;
                    measurementNotification.standing_ = singleFieldBuilderV4 == null ? this.standing_ : (Standing) singleFieldBuilderV4.build();
                    i14 |= 4;
                }
                measurementNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_MeasurementNotification_descriptor;
            }

            private SingleFieldBuilderV3<PitchRoll, PitchRoll.Builder, PitchRollOrBuilder> getPitchRollFieldBuilder() {
                if (this.pitchRollBuilder_ == null) {
                    this.pitchRollBuilder_ = new SingleFieldBuilderV3<>(getPitchRoll(), getParentForChildren(), isClean());
                    this.pitchRoll_ = null;
                }
                return this.pitchRollBuilder_;
            }

            private SingleFieldBuilderV3<Standing, Standing.Builder, StandingOrBuilder> getStandingFieldBuilder() {
                if (this.standingBuilder_ == null) {
                    this.standingBuilder_ = new SingleFieldBuilderV3<>(getStanding(), getParentForChildren(), isClean());
                    this.standing_ = null;
                }
                return this.standingBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPitchRollFieldBuilder();
                    getStandingFieldBuilder();
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
                this.tsC_ = 0;
                this.pitchRoll_ = null;
                SingleFieldBuilderV3<PitchRoll, PitchRoll.Builder, PitchRollOrBuilder> singleFieldBuilderV3 = this.pitchRollBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pitchRollBuilder_ = null;
                }
                this.standing_ = null;
                SingleFieldBuilderV3<Standing, Standing.Builder, StandingOrBuilder> singleFieldBuilderV4 = this.standingBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.standingBuilder_ = null;
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

            public Builder clearPitchRoll() {
                this.bitField0_ &= -3;
                this.pitchRoll_ = null;
                SingleFieldBuilderV3<PitchRoll, PitchRoll.Builder, PitchRollOrBuilder> singleFieldBuilderV3 = this.pitchRollBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pitchRollBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStanding() {
                this.bitField0_ &= -5;
                this.standing_ = null;
                SingleFieldBuilderV3<Standing, Standing.Builder, StandingOrBuilder> singleFieldBuilderV3 = this.standingBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.standingBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTsC() {
                this.bitField0_ &= -2;
                this.tsC_ = 0;
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
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_MeasurementNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
            public PitchRoll getPitchRoll() {
                SingleFieldBuilderV3<PitchRoll, PitchRoll.Builder, PitchRollOrBuilder> singleFieldBuilderV3 = this.pitchRollBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PitchRoll) singleFieldBuilderV3.getMessage();
                }
                PitchRoll pitchRoll = this.pitchRoll_;
                return pitchRoll == null ? PitchRoll.getDefaultInstance() : pitchRoll;
            }

            public PitchRoll.Builder getPitchRollBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (PitchRoll.Builder) getPitchRollFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
            public PitchRollOrBuilder getPitchRollOrBuilder() {
                SingleFieldBuilderV3<PitchRoll, PitchRoll.Builder, PitchRollOrBuilder> singleFieldBuilderV3 = this.pitchRollBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PitchRollOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PitchRoll pitchRoll = this.pitchRoll_;
                return pitchRoll == null ? PitchRoll.getDefaultInstance() : pitchRoll;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
            public Standing getStanding() {
                SingleFieldBuilderV3<Standing, Standing.Builder, StandingOrBuilder> singleFieldBuilderV3 = this.standingBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Standing) singleFieldBuilderV3.getMessage();
                }
                Standing standing = this.standing_;
                return standing == null ? Standing.getDefaultInstance() : standing;
            }

            public Standing.Builder getStandingBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (Standing.Builder) getStandingFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
            public StandingOrBuilder getStandingOrBuilder() {
                SingleFieldBuilderV3<Standing, Standing.Builder, StandingOrBuilder> singleFieldBuilderV3 = this.standingBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StandingOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Standing standing = this.standing_;
                return standing == null ? Standing.getDefaultInstance() : standing;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
            public int getTsC() {
                return this.tsC_;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
            public boolean hasPitchRoll() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
            public boolean hasStanding() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICyclingTorsoSensor.MeasurementNotificationOrBuilder
            public boolean hasTsC() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICyclingTorsoSensor.internal_static_GDI_Proto_CyclingTorsoSensor_MeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MeasurementNotification.class, Builder.class);
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
                                    this.tsC_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getPitchRollFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getStandingFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergePitchRoll(PitchRoll pitchRoll) {
                PitchRoll pitchRoll2;
                SingleFieldBuilderV3<PitchRoll, PitchRoll.Builder, PitchRollOrBuilder> singleFieldBuilderV3 = this.pitchRollBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pitchRoll);
                } else if ((this.bitField0_ & 2) == 0 || (pitchRoll2 = this.pitchRoll_) == null || pitchRoll2 == PitchRoll.getDefaultInstance()) {
                    this.pitchRoll_ = pitchRoll;
                } else {
                    getPitchRollBuilder().mergeFrom(pitchRoll);
                }
                if (this.pitchRoll_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStanding(Standing standing) {
                Standing standing2;
                SingleFieldBuilderV3<Standing, Standing.Builder, StandingOrBuilder> singleFieldBuilderV3 = this.standingBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(standing);
                } else if ((this.bitField0_ & 4) == 0 || (standing2 = this.standing_) == null || standing2 == Standing.getDefaultInstance()) {
                    this.standing_ = standing;
                } else {
                    getStandingBuilder().mergeFrom(standing);
                }
                if (this.standing_ != null) {
                    this.bitField0_ |= 4;
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

            public Builder setPitchRoll(PitchRoll.Builder builder) {
                SingleFieldBuilderV3<PitchRoll, PitchRoll.Builder, PitchRollOrBuilder> singleFieldBuilderV3 = this.pitchRollBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pitchRoll_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStanding(Standing.Builder builder) {
                SingleFieldBuilderV3<Standing, Standing.Builder, StandingOrBuilder> singleFieldBuilderV3 = this.standingBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.standing_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTsC(int i14) {
                this.tsC_ = i14;
                this.bitField0_ |= 1;
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

            public Builder setPitchRoll(PitchRoll pitchRoll) {
                SingleFieldBuilderV3<PitchRoll, PitchRoll.Builder, PitchRollOrBuilder> singleFieldBuilderV3 = this.pitchRollBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pitchRoll.getClass();
                    this.pitchRoll_ = pitchRoll;
                } else {
                    singleFieldBuilderV3.setMessage(pitchRoll);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStanding(Standing standing) {
                SingleFieldBuilderV3<Standing, Standing.Builder, StandingOrBuilder> singleFieldBuilderV3 = this.standingBuilder_;
                if (singleFieldBuilderV3 == null) {
                    standing.getClass();
                    this.standing_ = standing;
                } else {
                    singleFieldBuilderV3.setMessage(standing);
                }
                this.bitField0_ |= 4;
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
                if (measurementNotification.hasTsC()) {
                    setTsC(measurementNotification.getTsC());
                }
                if (measurementNotification.hasPitchRoll()) {
                    mergePitchRoll(measurementNotification.getPitchRoll());
                }
                if (measurementNotification.hasStanding()) {
                    mergeStanding(measurementNotification.getStanding());
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

        public /* synthetic */ MeasurementNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static MeasurementNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private MeasurementNotification() {
            this.tsC_ = 0;
            this.memoizedIsInitialized = (byte) -1;
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
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
