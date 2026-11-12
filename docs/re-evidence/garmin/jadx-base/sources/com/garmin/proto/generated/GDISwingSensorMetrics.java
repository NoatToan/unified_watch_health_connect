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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class GDISwingSensorMetrics {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bGDISwingSensorMetrics.proto\u0012\u001cGDI.Proto.SwingSensorMetrics\"°\u0003\n\fSwingMetrics\u0012\u0013\n\u000bswing_speed\u0018\u0001 \u0001(\u0002\u0012\u0016\n\u000ebackswing_time\u0018\u0002 \u0001(\u0002\u0012\u0016\n\u000edownswing_time\u0018\u0003 \u0001(\u0002\u0012\u001d\n\u0015shaft_lean_at_address\u0018\u0004 \u0001(\u0002\u0012\u001e\n\u0016shaft_angle_at_address\u0018\u0005 \u0001(\u0002\u0012\u001b\n\u0013club_path_at_impact\u0018\u0006 \u0001(\u0002\u0012\u001c\n\u0014face_angle_at_impact\u0018\u0007 \u0001(\u0002\u0012\u001b\n\u0013club_loft_at_impact\u0018\b \u0001(\u0002\u0012\u001c\n\u0014shaft_lean_at_impact\u0018\t \u0001(\u0002\u0012\u001d\n\u0015shaft_angle_at_impact\u0018\n \u0001(\u0002\u0012\u000f\n\u0007club_id\u0018\u000b \u0001(\u0004\u0012\u0017\n\u000fangle_of_attack\u0018\f \u0001(\u0002\u0012 \n\u0018face_to_target_at_impact\u0018\r \u0001(\u0002\u0012\"\n\u001aclub_loft_offset_at_impact\u0018\u000e \u0001(\u0002\u0012\u0017\n\u000fimpact_was_made\u0018\u000f \u0001(\b\"]\n\u0018SwingMetricsNotification\u0012A\n\rswing_metrics\u0018\u0001 \u0002(\u000b2*.GDI.Proto.SwingSensorMetrics.SwingMetricsB5\n\u001acom.garmin.proto.generatedB\u0015GDISwingSensorMetricsH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorMetrics_SwingMetricsNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorMetrics_SwingMetricsNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SwingSensorMetrics_SwingMetrics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SwingSensorMetrics_SwingMetrics_fieldAccessorTable;

    public interface SwingMetricsNotificationOrBuilder extends MessageOrBuilder {
        SwingMetrics getSwingMetrics();

        SwingMetricsOrBuilder getSwingMetricsOrBuilder();

        boolean hasSwingMetrics();
    }

    public interface SwingMetricsOrBuilder extends MessageOrBuilder {
        float getAngleOfAttack();

        float getBackswingTime();

        long getClubId();

        float getClubLoftAtImpact();

        float getClubLoftOffsetAtImpact();

        float getClubPathAtImpact();

        float getDownswingTime();

        float getFaceAngleAtImpact();

        float getFaceToTargetAtImpact();

        boolean getImpactWasMade();

        float getShaftAngleAtAddress();

        float getShaftAngleAtImpact();

        float getShaftLeanAtAddress();

        float getShaftLeanAtImpact();

        float getSwingSpeed();

        boolean hasAngleOfAttack();

        boolean hasBackswingTime();

        boolean hasClubId();

        boolean hasClubLoftAtImpact();

        boolean hasClubLoftOffsetAtImpact();

        boolean hasClubPathAtImpact();

        boolean hasDownswingTime();

        boolean hasFaceAngleAtImpact();

        boolean hasFaceToTargetAtImpact();

        boolean hasImpactWasMade();

        boolean hasShaftAngleAtAddress();

        boolean hasShaftAngleAtImpact();

        boolean hasShaftLeanAtAddress();

        boolean hasShaftLeanAtImpact();

        boolean hasSwingSpeed();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SwingSensorMetrics_SwingMetrics_descriptor = descriptor2;
        internal_static_GDI_Proto_SwingSensorMetrics_SwingMetrics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SwingSpeed", "BackswingTime", "DownswingTime", "ShaftLeanAtAddress", "ShaftAngleAtAddress", "ClubPathAtImpact", "FaceAngleAtImpact", "ClubLoftAtImpact", "ShaftLeanAtImpact", "ShaftAngleAtImpact", "ClubId", "AngleOfAttack", "FaceToTargetAtImpact", "ClubLoftOffsetAtImpact", "ImpactWasMade"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_SwingSensorMetrics_SwingMetricsNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_SwingSensorMetrics_SwingMetricsNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"SwingMetrics"});
    }

    private GDISwingSensorMetrics() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class SwingMetrics extends GeneratedMessageV3 implements SwingMetricsOrBuilder {
        public static final int ANGLE_OF_ATTACK_FIELD_NUMBER = 12;
        public static final int BACKSWING_TIME_FIELD_NUMBER = 2;
        public static final int CLUB_ID_FIELD_NUMBER = 11;
        public static final int CLUB_LOFT_AT_IMPACT_FIELD_NUMBER = 8;
        public static final int CLUB_LOFT_OFFSET_AT_IMPACT_FIELD_NUMBER = 14;
        public static final int CLUB_PATH_AT_IMPACT_FIELD_NUMBER = 6;
        public static final int DOWNSWING_TIME_FIELD_NUMBER = 3;
        public static final int FACE_ANGLE_AT_IMPACT_FIELD_NUMBER = 7;
        public static final int FACE_TO_TARGET_AT_IMPACT_FIELD_NUMBER = 13;
        public static final int IMPACT_WAS_MADE_FIELD_NUMBER = 15;
        public static final int SHAFT_ANGLE_AT_ADDRESS_FIELD_NUMBER = 5;
        public static final int SHAFT_ANGLE_AT_IMPACT_FIELD_NUMBER = 10;
        public static final int SHAFT_LEAN_AT_ADDRESS_FIELD_NUMBER = 4;
        public static final int SHAFT_LEAN_AT_IMPACT_FIELD_NUMBER = 9;
        public static final int SWING_SPEED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private float angleOfAttack_;
        private float backswingTime_;
        private int bitField0_;
        private long clubId_;
        private float clubLoftAtImpact_;
        private float clubLoftOffsetAtImpact_;
        private float clubPathAtImpact_;
        private float downswingTime_;
        private float faceAngleAtImpact_;
        private float faceToTargetAtImpact_;
        private boolean impactWasMade_;
        private byte memoizedIsInitialized;
        private float shaftAngleAtAddress_;
        private float shaftAngleAtImpact_;
        private float shaftLeanAtAddress_;
        private float shaftLeanAtImpact_;
        private float swingSpeed_;
        private static final SwingMetrics DEFAULT_INSTANCE = new SwingMetrics();

        @Deprecated
        public static final Parser<SwingMetrics> PARSER = new AbstractParser<SwingMetrics>() { // from class: com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetrics.1
            @Override // com.google.protobuf.Parser
            public SwingMetrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwingMetrics.newBuilder();
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

        private SwingMetrics(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.swingSpeed_ = 0.0f;
            this.backswingTime_ = 0.0f;
            this.downswingTime_ = 0.0f;
            this.shaftLeanAtAddress_ = 0.0f;
            this.shaftAngleAtAddress_ = 0.0f;
            this.clubPathAtImpact_ = 0.0f;
            this.faceAngleAtImpact_ = 0.0f;
            this.clubLoftAtImpact_ = 0.0f;
            this.shaftLeanAtImpact_ = 0.0f;
            this.shaftAngleAtImpact_ = 0.0f;
            this.clubId_ = 0L;
            this.angleOfAttack_ = 0.0f;
            this.faceToTargetAtImpact_ = 0.0f;
            this.clubLoftOffsetAtImpact_ = 0.0f;
            this.impactWasMade_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwingMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorMetrics.internal_static_GDI_Proto_SwingSensorMetrics_SwingMetrics_descriptor;
        }

        public static Builder newBuilder(SwingMetrics swingMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(swingMetrics);
        }

        public static SwingMetrics parseDelimitedFrom(InputStream inputStream) {
            return (SwingMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwingMetrics parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwingMetrics> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwingMetrics)) {
                return super.equals(obj);
            }
            SwingMetrics swingMetrics = (SwingMetrics) obj;
            if (hasSwingSpeed() != swingMetrics.hasSwingSpeed()) {
                return false;
            }
            if ((hasSwingSpeed() && Float.floatToIntBits(getSwingSpeed()) != Float.floatToIntBits(swingMetrics.getSwingSpeed())) || hasBackswingTime() != swingMetrics.hasBackswingTime()) {
                return false;
            }
            if ((hasBackswingTime() && Float.floatToIntBits(getBackswingTime()) != Float.floatToIntBits(swingMetrics.getBackswingTime())) || hasDownswingTime() != swingMetrics.hasDownswingTime()) {
                return false;
            }
            if ((hasDownswingTime() && Float.floatToIntBits(getDownswingTime()) != Float.floatToIntBits(swingMetrics.getDownswingTime())) || hasShaftLeanAtAddress() != swingMetrics.hasShaftLeanAtAddress()) {
                return false;
            }
            if ((hasShaftLeanAtAddress() && Float.floatToIntBits(getShaftLeanAtAddress()) != Float.floatToIntBits(swingMetrics.getShaftLeanAtAddress())) || hasShaftAngleAtAddress() != swingMetrics.hasShaftAngleAtAddress()) {
                return false;
            }
            if ((hasShaftAngleAtAddress() && Float.floatToIntBits(getShaftAngleAtAddress()) != Float.floatToIntBits(swingMetrics.getShaftAngleAtAddress())) || hasClubPathAtImpact() != swingMetrics.hasClubPathAtImpact()) {
                return false;
            }
            if ((hasClubPathAtImpact() && Float.floatToIntBits(getClubPathAtImpact()) != Float.floatToIntBits(swingMetrics.getClubPathAtImpact())) || hasFaceAngleAtImpact() != swingMetrics.hasFaceAngleAtImpact()) {
                return false;
            }
            if ((hasFaceAngleAtImpact() && Float.floatToIntBits(getFaceAngleAtImpact()) != Float.floatToIntBits(swingMetrics.getFaceAngleAtImpact())) || hasClubLoftAtImpact() != swingMetrics.hasClubLoftAtImpact()) {
                return false;
            }
            if ((hasClubLoftAtImpact() && Float.floatToIntBits(getClubLoftAtImpact()) != Float.floatToIntBits(swingMetrics.getClubLoftAtImpact())) || hasShaftLeanAtImpact() != swingMetrics.hasShaftLeanAtImpact()) {
                return false;
            }
            if ((hasShaftLeanAtImpact() && Float.floatToIntBits(getShaftLeanAtImpact()) != Float.floatToIntBits(swingMetrics.getShaftLeanAtImpact())) || hasShaftAngleAtImpact() != swingMetrics.hasShaftAngleAtImpact()) {
                return false;
            }
            if ((hasShaftAngleAtImpact() && Float.floatToIntBits(getShaftAngleAtImpact()) != Float.floatToIntBits(swingMetrics.getShaftAngleAtImpact())) || hasClubId() != swingMetrics.hasClubId()) {
                return false;
            }
            if ((hasClubId() && getClubId() != swingMetrics.getClubId()) || hasAngleOfAttack() != swingMetrics.hasAngleOfAttack()) {
                return false;
            }
            if ((hasAngleOfAttack() && Float.floatToIntBits(getAngleOfAttack()) != Float.floatToIntBits(swingMetrics.getAngleOfAttack())) || hasFaceToTargetAtImpact() != swingMetrics.hasFaceToTargetAtImpact()) {
                return false;
            }
            if ((hasFaceToTargetAtImpact() && Float.floatToIntBits(getFaceToTargetAtImpact()) != Float.floatToIntBits(swingMetrics.getFaceToTargetAtImpact())) || hasClubLoftOffsetAtImpact() != swingMetrics.hasClubLoftOffsetAtImpact()) {
                return false;
            }
            if ((!hasClubLoftOffsetAtImpact() || Float.floatToIntBits(getClubLoftOffsetAtImpact()) == Float.floatToIntBits(swingMetrics.getClubLoftOffsetAtImpact())) && hasImpactWasMade() == swingMetrics.hasImpactWasMade()) {
                return (!hasImpactWasMade() || getImpactWasMade() == swingMetrics.getImpactWasMade()) && getUnknownFields().equals(swingMetrics.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getAngleOfAttack() {
            return this.angleOfAttack_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getBackswingTime() {
            return this.backswingTime_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public long getClubId() {
            return this.clubId_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getClubLoftAtImpact() {
            return this.clubLoftAtImpact_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getClubLoftOffsetAtImpact() {
            return this.clubLoftOffsetAtImpact_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getClubPathAtImpact() {
            return this.clubPathAtImpact_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getDownswingTime() {
            return this.downswingTime_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getFaceAngleAtImpact() {
            return this.faceAngleAtImpact_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getFaceToTargetAtImpact() {
            return this.faceToTargetAtImpact_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean getImpactWasMade() {
            return this.impactWasMade_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwingMetrics> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.swingSpeed_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.backswingTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.downswingTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.shaftLeanAtAddress_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(5, this.shaftAngleAtAddress_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(6, this.clubPathAtImpact_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(7, this.faceAngleAtImpact_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(8, this.clubLoftAtImpact_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(9, this.shaftLeanAtImpact_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(10, this.shaftAngleAtImpact_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeFloatSize += CodedOutputStream.computeUInt64Size(11, this.clubId_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(12, this.angleOfAttack_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(13, this.faceToTargetAtImpact_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(14, this.clubLoftOffsetAtImpact_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeFloatSize += CodedOutputStream.computeBoolSize(15, this.impactWasMade_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getShaftAngleAtAddress() {
            return this.shaftAngleAtAddress_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getShaftAngleAtImpact() {
            return this.shaftAngleAtImpact_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getShaftLeanAtAddress() {
            return this.shaftLeanAtAddress_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getShaftLeanAtImpact() {
            return this.shaftLeanAtImpact_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public float getSwingSpeed() {
            return this.swingSpeed_;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasAngleOfAttack() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasBackswingTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasClubId() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasClubLoftAtImpact() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasClubLoftOffsetAtImpact() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasClubPathAtImpact() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasDownswingTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasFaceAngleAtImpact() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasFaceToTargetAtImpact() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasImpactWasMade() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasShaftAngleAtAddress() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasShaftAngleAtImpact() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasShaftLeanAtAddress() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasShaftLeanAtImpact() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
        public boolean hasSwingSpeed() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSwingSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getSwingSpeed());
            }
            if (hasBackswingTime()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getBackswingTime());
            }
            if (hasDownswingTime()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getDownswingTime());
            }
            if (hasShaftLeanAtAddress()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getShaftLeanAtAddress());
            }
            if (hasShaftAngleAtAddress()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getShaftAngleAtAddress());
            }
            if (hasClubPathAtImpact()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Float.floatToIntBits(getClubPathAtImpact());
            }
            if (hasFaceAngleAtImpact()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Float.floatToIntBits(getFaceAngleAtImpact());
            }
            if (hasClubLoftAtImpact()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Float.floatToIntBits(getClubLoftAtImpact());
            }
            if (hasShaftLeanAtImpact()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Float.floatToIntBits(getShaftLeanAtImpact());
            }
            if (hasShaftAngleAtImpact()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + Float.floatToIntBits(getShaftAngleAtImpact());
            }
            if (hasClubId()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + Internal.hashLong(getClubId());
            }
            if (hasAngleOfAttack()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + Float.floatToIntBits(getAngleOfAttack());
            }
            if (hasFaceToTargetAtImpact()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + Float.floatToIntBits(getFaceToTargetAtImpact());
            }
            if (hasClubLoftOffsetAtImpact()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + Float.floatToIntBits(getClubLoftOffsetAtImpact());
            }
            if (hasImpactWasMade()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + Internal.hashBoolean(getImpactWasMade());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwingSensorMetrics.internal_static_GDI_Proto_SwingSensorMetrics_SwingMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingMetrics.class, Builder.class);
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
            return new SwingMetrics();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.swingSpeed_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.backswingTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.downswingTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.shaftLeanAtAddress_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.shaftAngleAtAddress_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeFloat(6, this.clubPathAtImpact_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeFloat(7, this.faceAngleAtImpact_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeFloat(8, this.clubLoftAtImpact_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeFloat(9, this.shaftLeanAtImpact_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeFloat(10, this.shaftAngleAtImpact_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeUInt64(11, this.clubId_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeFloat(12, this.angleOfAttack_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeFloat(13, this.faceToTargetAtImpact_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeFloat(14, this.clubLoftOffsetAtImpact_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeBool(15, this.impactWasMade_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwingMetricsOrBuilder {
            private float angleOfAttack_;
            private float backswingTime_;
            private int bitField0_;
            private long clubId_;
            private float clubLoftAtImpact_;
            private float clubLoftOffsetAtImpact_;
            private float clubPathAtImpact_;
            private float downswingTime_;
            private float faceAngleAtImpact_;
            private float faceToTargetAtImpact_;
            private boolean impactWasMade_;
            private float shaftAngleAtAddress_;
            private float shaftAngleAtImpact_;
            private float shaftLeanAtAddress_;
            private float shaftLeanAtImpact_;
            private float swingSpeed_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SwingMetrics swingMetrics) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    swingMetrics.swingSpeed_ = this.swingSpeed_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    swingMetrics.backswingTime_ = this.backswingTime_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    swingMetrics.downswingTime_ = this.downswingTime_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    swingMetrics.shaftLeanAtAddress_ = this.shaftLeanAtAddress_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    swingMetrics.shaftAngleAtAddress_ = this.shaftAngleAtAddress_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    swingMetrics.clubPathAtImpact_ = this.clubPathAtImpact_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    swingMetrics.faceAngleAtImpact_ = this.faceAngleAtImpact_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    swingMetrics.clubLoftAtImpact_ = this.clubLoftAtImpact_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    swingMetrics.shaftLeanAtImpact_ = this.shaftLeanAtImpact_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    swingMetrics.shaftAngleAtImpact_ = this.shaftAngleAtImpact_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    swingMetrics.clubId_ = this.clubId_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    swingMetrics.angleOfAttack_ = this.angleOfAttack_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    swingMetrics.faceToTargetAtImpact_ = this.faceToTargetAtImpact_;
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    swingMetrics.clubLoftOffsetAtImpact_ = this.clubLoftOffsetAtImpact_;
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    swingMetrics.impactWasMade_ = this.impactWasMade_;
                    i14 |= 16384;
                }
                swingMetrics.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorMetrics.internal_static_GDI_Proto_SwingSensorMetrics_SwingMetrics_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingMetrics build() {
                SwingMetrics swingMetricsBuildPartial = buildPartial();
                if (swingMetricsBuildPartial.isInitialized()) {
                    return swingMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) swingMetricsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingMetrics buildPartial() {
                SwingMetrics swingMetrics = new SwingMetrics(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(swingMetrics);
                }
                onBuilt();
                return swingMetrics;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.swingSpeed_ = 0.0f;
                this.backswingTime_ = 0.0f;
                this.downswingTime_ = 0.0f;
                this.shaftLeanAtAddress_ = 0.0f;
                this.shaftAngleAtAddress_ = 0.0f;
                this.clubPathAtImpact_ = 0.0f;
                this.faceAngleAtImpact_ = 0.0f;
                this.clubLoftAtImpact_ = 0.0f;
                this.shaftLeanAtImpact_ = 0.0f;
                this.shaftAngleAtImpact_ = 0.0f;
                this.clubId_ = 0L;
                this.angleOfAttack_ = 0.0f;
                this.faceToTargetAtImpact_ = 0.0f;
                this.clubLoftOffsetAtImpact_ = 0.0f;
                this.impactWasMade_ = false;
                return this;
            }

            public Builder clearAngleOfAttack() {
                this.bitField0_ &= -2049;
                this.angleOfAttack_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearBackswingTime() {
                this.bitField0_ &= -3;
                this.backswingTime_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearClubId() {
                this.bitField0_ &= -1025;
                this.clubId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearClubLoftAtImpact() {
                this.bitField0_ &= -129;
                this.clubLoftAtImpact_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearClubLoftOffsetAtImpact() {
                this.bitField0_ &= -8193;
                this.clubLoftOffsetAtImpact_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearClubPathAtImpact() {
                this.bitField0_ &= -33;
                this.clubPathAtImpact_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearDownswingTime() {
                this.bitField0_ &= -5;
                this.downswingTime_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearFaceAngleAtImpact() {
                this.bitField0_ &= -65;
                this.faceAngleAtImpact_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearFaceToTargetAtImpact() {
                this.bitField0_ &= -4097;
                this.faceToTargetAtImpact_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearImpactWasMade() {
                this.bitField0_ &= -16385;
                this.impactWasMade_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearShaftAngleAtAddress() {
                this.bitField0_ &= -17;
                this.shaftAngleAtAddress_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearShaftAngleAtImpact() {
                this.bitField0_ &= -513;
                this.shaftAngleAtImpact_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearShaftLeanAtAddress() {
                this.bitField0_ &= -9;
                this.shaftLeanAtAddress_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearShaftLeanAtImpact() {
                this.bitField0_ &= -257;
                this.shaftLeanAtImpact_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearSwingSpeed() {
                this.bitField0_ &= -2;
                this.swingSpeed_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getAngleOfAttack() {
                return this.angleOfAttack_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getBackswingTime() {
                return this.backswingTime_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public long getClubId() {
                return this.clubId_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getClubLoftAtImpact() {
                return this.clubLoftAtImpact_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getClubLoftOffsetAtImpact() {
                return this.clubLoftOffsetAtImpact_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getClubPathAtImpact() {
                return this.clubPathAtImpact_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISwingSensorMetrics.internal_static_GDI_Proto_SwingSensorMetrics_SwingMetrics_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getDownswingTime() {
                return this.downswingTime_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getFaceAngleAtImpact() {
                return this.faceAngleAtImpact_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getFaceToTargetAtImpact() {
                return this.faceToTargetAtImpact_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean getImpactWasMade() {
                return this.impactWasMade_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getShaftAngleAtAddress() {
                return this.shaftAngleAtAddress_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getShaftAngleAtImpact() {
                return this.shaftAngleAtImpact_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getShaftLeanAtAddress() {
                return this.shaftLeanAtAddress_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getShaftLeanAtImpact() {
                return this.shaftLeanAtImpact_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public float getSwingSpeed() {
                return this.swingSpeed_;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasAngleOfAttack() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasBackswingTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasClubId() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasClubLoftAtImpact() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasClubLoftOffsetAtImpact() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasClubPathAtImpact() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasDownswingTime() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasFaceAngleAtImpact() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasFaceToTargetAtImpact() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasImpactWasMade() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasShaftAngleAtAddress() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasShaftAngleAtImpact() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasShaftLeanAtAddress() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasShaftLeanAtImpact() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsOrBuilder
            public boolean hasSwingSpeed() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorMetrics.internal_static_GDI_Proto_SwingSensorMetrics_SwingMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingMetrics.class, Builder.class);
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 13:
                                    this.swingSpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 21:
                                    this.backswingTime_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 29:
                                    this.downswingTime_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 37:
                                    this.shaftLeanAtAddress_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 45:
                                    this.shaftAngleAtAddress_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 53:
                                    this.clubPathAtImpact_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 61:
                                    this.faceAngleAtImpact_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 69:
                                    this.clubLoftAtImpact_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 77:
                                    this.shaftLeanAtImpact_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 85:
                                    this.shaftAngleAtImpact_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 88:
                                    this.clubId_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 101:
                                    this.angleOfAttack_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 109:
                                    this.faceToTargetAtImpact_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 117:
                                    this.clubLoftOffsetAtImpact_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 120:
                                    this.impactWasMade_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16384;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAngleOfAttack(float f14) {
                this.angleOfAttack_ = f14;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setBackswingTime(float f14) {
                this.backswingTime_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setClubId(long j8) {
                this.clubId_ = j8;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setClubLoftAtImpact(float f14) {
                this.clubLoftAtImpact_ = f14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setClubLoftOffsetAtImpact(float f14) {
                this.clubLoftOffsetAtImpact_ = f14;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setClubPathAtImpact(float f14) {
                this.clubPathAtImpact_ = f14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setDownswingTime(float f14) {
                this.downswingTime_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFaceAngleAtImpact(float f14) {
                this.faceAngleAtImpact_ = f14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setFaceToTargetAtImpact(float f14) {
                this.faceToTargetAtImpact_ = f14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setImpactWasMade(boolean z14) {
                this.impactWasMade_ = z14;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setShaftAngleAtAddress(float f14) {
                this.shaftAngleAtAddress_ = f14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setShaftAngleAtImpact(float f14) {
                this.shaftAngleAtImpact_ = f14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setShaftLeanAtAddress(float f14) {
                this.shaftLeanAtAddress_ = f14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setShaftLeanAtImpact(float f14) {
                this.shaftLeanAtImpact_ = f14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSwingSpeed(float f14) {
                this.swingSpeed_ = f14;
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
            public SwingMetrics getDefaultInstanceForType() {
                return SwingMetrics.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwingMetrics) {
                    return mergeFrom((SwingMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwingMetrics swingMetrics) {
                if (swingMetrics == SwingMetrics.getDefaultInstance()) {
                    return this;
                }
                if (swingMetrics.hasSwingSpeed()) {
                    setSwingSpeed(swingMetrics.getSwingSpeed());
                }
                if (swingMetrics.hasBackswingTime()) {
                    setBackswingTime(swingMetrics.getBackswingTime());
                }
                if (swingMetrics.hasDownswingTime()) {
                    setDownswingTime(swingMetrics.getDownswingTime());
                }
                if (swingMetrics.hasShaftLeanAtAddress()) {
                    setShaftLeanAtAddress(swingMetrics.getShaftLeanAtAddress());
                }
                if (swingMetrics.hasShaftAngleAtAddress()) {
                    setShaftAngleAtAddress(swingMetrics.getShaftAngleAtAddress());
                }
                if (swingMetrics.hasClubPathAtImpact()) {
                    setClubPathAtImpact(swingMetrics.getClubPathAtImpact());
                }
                if (swingMetrics.hasFaceAngleAtImpact()) {
                    setFaceAngleAtImpact(swingMetrics.getFaceAngleAtImpact());
                }
                if (swingMetrics.hasClubLoftAtImpact()) {
                    setClubLoftAtImpact(swingMetrics.getClubLoftAtImpact());
                }
                if (swingMetrics.hasShaftLeanAtImpact()) {
                    setShaftLeanAtImpact(swingMetrics.getShaftLeanAtImpact());
                }
                if (swingMetrics.hasShaftAngleAtImpact()) {
                    setShaftAngleAtImpact(swingMetrics.getShaftAngleAtImpact());
                }
                if (swingMetrics.hasClubId()) {
                    setClubId(swingMetrics.getClubId());
                }
                if (swingMetrics.hasAngleOfAttack()) {
                    setAngleOfAttack(swingMetrics.getAngleOfAttack());
                }
                if (swingMetrics.hasFaceToTargetAtImpact()) {
                    setFaceToTargetAtImpact(swingMetrics.getFaceToTargetAtImpact());
                }
                if (swingMetrics.hasClubLoftOffsetAtImpact()) {
                    setClubLoftOffsetAtImpact(swingMetrics.getClubLoftOffsetAtImpact());
                }
                if (swingMetrics.hasImpactWasMade()) {
                    setImpactWasMade(swingMetrics.getImpactWasMade());
                }
                mergeUnknownFields(swingMetrics.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwingMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SwingMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwingMetrics parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwingMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwingMetrics parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwingMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwingMetrics parseFrom(InputStream inputStream) {
            return (SwingMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwingMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingMetrics parseFrom(CodedInputStream codedInputStream) {
            return (SwingMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwingMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ SwingMetrics(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwingMetrics() {
            this.swingSpeed_ = 0.0f;
            this.backswingTime_ = 0.0f;
            this.downswingTime_ = 0.0f;
            this.shaftLeanAtAddress_ = 0.0f;
            this.shaftAngleAtAddress_ = 0.0f;
            this.clubPathAtImpact_ = 0.0f;
            this.faceAngleAtImpact_ = 0.0f;
            this.clubLoftAtImpact_ = 0.0f;
            this.shaftLeanAtImpact_ = 0.0f;
            this.shaftAngleAtImpact_ = 0.0f;
            this.clubId_ = 0L;
            this.angleOfAttack_ = 0.0f;
            this.faceToTargetAtImpact_ = 0.0f;
            this.clubLoftOffsetAtImpact_ = 0.0f;
            this.impactWasMade_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class SwingMetricsNotification extends GeneratedMessageV3 implements SwingMetricsNotificationOrBuilder {
        private static final SwingMetricsNotification DEFAULT_INSTANCE = new SwingMetricsNotification();

        @Deprecated
        public static final Parser<SwingMetricsNotification> PARSER = new AbstractParser<SwingMetricsNotification>() { // from class: com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsNotification.1
            @Override // com.google.protobuf.Parser
            public SwingMetricsNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwingMetricsNotification.newBuilder();
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
        public static final int SWING_METRICS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SwingMetrics swingMetrics_;

        private SwingMetricsNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwingMetricsNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwingSensorMetrics.internal_static_GDI_Proto_SwingSensorMetrics_SwingMetricsNotification_descriptor;
        }

        public static Builder newBuilder(SwingMetricsNotification swingMetricsNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(swingMetricsNotification);
        }

        public static SwingMetricsNotification parseDelimitedFrom(InputStream inputStream) {
            return (SwingMetricsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwingMetricsNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwingMetricsNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwingMetricsNotification)) {
                return super.equals(obj);
            }
            SwingMetricsNotification swingMetricsNotification = (SwingMetricsNotification) obj;
            if (hasSwingMetrics() != swingMetricsNotification.hasSwingMetrics()) {
                return false;
            }
            return (!hasSwingMetrics() || getSwingMetrics().equals(swingMetricsNotification.getSwingMetrics())) && getUnknownFields().equals(swingMetricsNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwingMetricsNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSwingMetrics()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder
        public SwingMetrics getSwingMetrics() {
            SwingMetrics swingMetrics = this.swingMetrics_;
            return swingMetrics == null ? SwingMetrics.getDefaultInstance() : swingMetrics;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder
        public SwingMetricsOrBuilder getSwingMetricsOrBuilder() {
            SwingMetrics swingMetrics = this.swingMetrics_;
            return swingMetrics == null ? SwingMetrics.getDefaultInstance() : swingMetrics;
        }

        @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder
        public boolean hasSwingMetrics() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSwingMetrics()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSwingMetrics().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwingSensorMetrics.internal_static_GDI_Proto_SwingSensorMetrics_SwingMetricsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingMetricsNotification.class, Builder.class);
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
            if (hasSwingMetrics()) {
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
            return new SwingMetricsNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSwingMetrics());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwingMetricsNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> swingMetricsBuilder_;
            private SwingMetrics swingMetrics_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SwingMetricsNotification swingMetricsNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                    swingMetricsNotification.swingMetrics_ = singleFieldBuilderV3 == null ? this.swingMetrics_ : (SwingMetrics) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                swingMetricsNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwingSensorMetrics.internal_static_GDI_Proto_SwingSensorMetrics_SwingMetricsNotification_descriptor;
            }

            private SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> getSwingMetricsFieldBuilder() {
                if (this.swingMetricsBuilder_ == null) {
                    this.swingMetricsBuilder_ = new SingleFieldBuilderV3<>(getSwingMetrics(), getParentForChildren(), isClean());
                    this.swingMetrics_ = null;
                }
                return this.swingMetricsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSwingMetricsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingMetricsNotification build() {
                SwingMetricsNotification swingMetricsNotificationBuildPartial = buildPartial();
                if (swingMetricsNotificationBuildPartial.isInitialized()) {
                    return swingMetricsNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) swingMetricsNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwingMetricsNotification buildPartial() {
                SwingMetricsNotification swingMetricsNotification = new SwingMetricsNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(swingMetricsNotification);
                }
                onBuilt();
                return swingMetricsNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.swingMetrics_ = null;
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.swingMetricsBuilder_ = null;
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

            public Builder clearSwingMetrics() {
                this.bitField0_ &= -2;
                this.swingMetrics_ = null;
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.swingMetricsBuilder_ = null;
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
                return GDISwingSensorMetrics.internal_static_GDI_Proto_SwingSensorMetrics_SwingMetricsNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder
            public SwingMetrics getSwingMetrics() {
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwingMetrics) singleFieldBuilderV3.getMessage();
                }
                SwingMetrics swingMetrics = this.swingMetrics_;
                return swingMetrics == null ? SwingMetrics.getDefaultInstance() : swingMetrics;
            }

            public SwingMetrics.Builder getSwingMetricsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SwingMetrics.Builder) getSwingMetricsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder
            public SwingMetricsOrBuilder getSwingMetricsOrBuilder() {
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwingMetricsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwingMetrics swingMetrics = this.swingMetrics_;
                return swingMetrics == null ? SwingMetrics.getDefaultInstance() : swingMetrics;
            }

            @Override // com.garmin.proto.generated.GDISwingSensorMetrics.SwingMetricsNotificationOrBuilder
            public boolean hasSwingMetrics() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwingSensorMetrics.internal_static_GDI_Proto_SwingSensorMetrics_SwingMetricsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SwingMetricsNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSwingMetrics();
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
                                    codedInputStream.readMessage(getSwingMetricsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSwingMetrics(SwingMetrics swingMetrics) {
                SwingMetrics swingMetrics2;
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(swingMetrics);
                } else if ((this.bitField0_ & 1) == 0 || (swingMetrics2 = this.swingMetrics_) == null || swingMetrics2 == SwingMetrics.getDefaultInstance()) {
                    this.swingMetrics_ = swingMetrics;
                } else {
                    getSwingMetricsBuilder().mergeFrom(swingMetrics);
                }
                if (this.swingMetrics_ != null) {
                    this.bitField0_ |= 1;
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

            public Builder setSwingMetrics(SwingMetrics.Builder builder) {
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.swingMetrics_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SwingMetricsNotification getDefaultInstanceForType() {
                return SwingMetricsNotification.getDefaultInstance();
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

            public Builder setSwingMetrics(SwingMetrics swingMetrics) {
                SingleFieldBuilderV3<SwingMetrics, SwingMetrics.Builder, SwingMetricsOrBuilder> singleFieldBuilderV3 = this.swingMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    swingMetrics.getClass();
                    this.swingMetrics_ = swingMetrics;
                } else {
                    singleFieldBuilderV3.setMessage(swingMetrics);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwingMetricsNotification) {
                    return mergeFrom((SwingMetricsNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwingMetricsNotification swingMetricsNotification) {
                if (swingMetricsNotification == SwingMetricsNotification.getDefaultInstance()) {
                    return this;
                }
                if (swingMetricsNotification.hasSwingMetrics()) {
                    mergeSwingMetrics(swingMetricsNotification.getSwingMetrics());
                }
                mergeUnknownFields(swingMetricsNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwingMetricsNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SwingMetricsNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwingMetricsNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwingMetricsNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingMetricsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingMetricsNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwingMetricsNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwingMetricsNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwingMetricsNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwingMetricsNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwingMetricsNotification parseFrom(InputStream inputStream) {
            return (SwingMetricsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwingMetricsNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingMetricsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwingMetricsNotification parseFrom(CodedInputStream codedInputStream) {
            return (SwingMetricsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwingMetricsNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwingMetricsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
