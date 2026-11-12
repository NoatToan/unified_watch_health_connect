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
public final class GDIHandCalibration {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018GDIHandCalibration.proto\u0012\u0019GDI.Proto.HandCalibration\"\u0090\u0001\n\u000eCommandRequest\u0012B\n\u0007command\u0018\u0001 \u0001(\u000e21.GDI.Proto.HandCalibration.CommandRequest.Command\":\n\u0007Command\u0012\t\n\u0005START\u0010\u0001\u0012\t\n\u0005ABORT\u0010\u0002\u0012\b\n\u0004SAVE\u0010\u0003\u0012\u000f\n\u000bIMAGE_START\u0010\u0004\"\u0080\u0001\n\u000fCommandResponse\u0012A\n\u0006status\u0018\u0001 \u0001(\u000e21.GDI.Proto.HandCalibration.CommandResponse.Status\"*\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\b\n\u0004BUSY\u0010\u0002\u0012\t\n\u0005ERROR\u0010\u0003\"\u0095\u0001\n\u000bStepRequest\u00126\n\thand_type\u0018\u0001 \u0001(\u000e2#.GDI.Proto.HandCalibration.HandType\u0012:\n\bhand_dir\u0018\u0002 \u0001(\u000e2(.GDI.Proto.HandCalibration.HandDirection\u0012\u0012\n\nhand_steps\u0018\u0003 \u0001(\r\"p\n\fStepResponse\u0012>\n\u0006status\u0018\u0001 \u0001(\u000e2..GDI.Proto.HandCalibration.StepResponse.Status\" \n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\t\n\u0005ERROR\u0010\u0002\"M\n\rRotateRequest\u0012\u0013\n\u000bsec_degrees\u0018\u0001 \u0001(\u0002\u0012\u0013\n\u000bmin_degrees\u0018\u0002 \u0001(\u0002\u0012\u0012\n\nhr_degrees\u0018\u0003 \u0001(\u0002\"t\n\u000eRotateResponse\u0012@\n\u0006status\u0018\u0001 \u0001(\u000e20.GDI.Proto.HandCalibration.RotateResponse.Status\" \n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\t\n\u0005ERROR\u0010\u0002\"|\n\u0012RotateNotification\u0012D\n\u0006status\u0018\u0001 \u0001(\u000e24.GDI.Proto.HandCalibration.RotateNotification.Status\" \n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\t\n\u0005ERROR\u0010\u0002\"ò\u0003\n\u0016HandCalibrationService\u0012B\n\u000fcommand_request\u0018\u0001 \u0001(\u000b2).GDI.Proto.HandCalibration.CommandRequest\u0012D\n\u0010command_response\u0018\u0002 \u0001(\u000b2*.GDI.Proto.HandCalibration.CommandResponse\u0012<\n\fstep_request\u0018\u0003 \u0001(\u000b2&.GDI.Proto.HandCalibration.StepRequest\u0012>\n\rstep_response\u0018\u0004 \u0001(\u000b2'.GDI.Proto.HandCalibration.StepResponse\u0012@\n\u000erotate_request\u0018\u0005 \u0001(\u000b2(.GDI.Proto.HandCalibration.RotateRequest\u0012B\n\u000frotate_response\u0018\u0006 \u0001(\u000b2).GDI.Proto.HandCalibration.RotateResponse\u0012J\n\u0013rotate_notification\u0018\u0007 \u0001(\u000b2-.GDI.Proto.HandCalibration.RotateNotification*,\n\bHandType\u0012\b\n\u0004HOUR\u0010\u0001\u0012\n\n\u0006MINUTE\u0010\u0002\u0012\n\n\u0006SECOND\u0010\u0003*4\n\rHandDirection\u0012\r\n\tCLOCKWISE\u0010\u0001\u0012\u0014\n\u0010COUNTERCLOCKWISE\u0010\u0002B2\n\u001acom.garmin.proto.generatedB\u0012GDIHandCalibrationH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HandCalibration_CommandRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HandCalibration_CommandRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HandCalibration_CommandResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HandCalibration_CommandResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HandCalibration_HandCalibrationService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HandCalibration_HandCalibrationService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HandCalibration_RotateNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HandCalibration_RotateNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HandCalibration_RotateRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HandCalibration_RotateRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HandCalibration_RotateResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HandCalibration_RotateResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HandCalibration_StepRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HandCalibration_StepRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HandCalibration_StepResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HandCalibration_StepResponse_fieldAccessorTable;

    public interface CommandRequestOrBuilder extends MessageOrBuilder {
        CommandRequest.Command getCommand();

        boolean hasCommand();
    }

    public interface CommandResponseOrBuilder extends MessageOrBuilder {
        CommandResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface HandCalibrationServiceOrBuilder extends MessageOrBuilder {
        CommandRequest getCommandRequest();

        CommandRequestOrBuilder getCommandRequestOrBuilder();

        CommandResponse getCommandResponse();

        CommandResponseOrBuilder getCommandResponseOrBuilder();

        RotateNotification getRotateNotification();

        RotateNotificationOrBuilder getRotateNotificationOrBuilder();

        RotateRequest getRotateRequest();

        RotateRequestOrBuilder getRotateRequestOrBuilder();

        RotateResponse getRotateResponse();

        RotateResponseOrBuilder getRotateResponseOrBuilder();

        StepRequest getStepRequest();

        StepRequestOrBuilder getStepRequestOrBuilder();

        StepResponse getStepResponse();

        StepResponseOrBuilder getStepResponseOrBuilder();

        boolean hasCommandRequest();

        boolean hasCommandResponse();

        boolean hasRotateNotification();

        boolean hasRotateRequest();

        boolean hasRotateResponse();

        boolean hasStepRequest();

        boolean hasStepResponse();
    }

    public interface RotateNotificationOrBuilder extends MessageOrBuilder {
        RotateNotification.Status getStatus();

        boolean hasStatus();
    }

    public interface RotateRequestOrBuilder extends MessageOrBuilder {
        float getHrDegrees();

        float getMinDegrees();

        float getSecDegrees();

        boolean hasHrDegrees();

        boolean hasMinDegrees();

        boolean hasSecDegrees();
    }

    public interface RotateResponseOrBuilder extends MessageOrBuilder {
        RotateResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface StepRequestOrBuilder extends MessageOrBuilder {
        HandDirection getHandDir();

        int getHandSteps();

        HandType getHandType();

        boolean hasHandDir();

        boolean hasHandSteps();

        boolean hasHandType();
    }

    public interface StepResponseOrBuilder extends MessageOrBuilder {
        StepResponse.Status getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_HandCalibration_CommandRequest_descriptor = descriptor2;
        internal_static_GDI_Proto_HandCalibration_CommandRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Command"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_HandCalibration_CommandResponse_descriptor = descriptor3;
        internal_static_GDI_Proto_HandCalibration_CommandResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Status"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_HandCalibration_StepRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_HandCalibration_StepRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"HandType", "HandDir", "HandSteps"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_HandCalibration_StepResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_HandCalibration_StepResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Status"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_HandCalibration_RotateRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_HandCalibration_RotateRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"SecDegrees", "MinDegrees", "HrDegrees"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_HandCalibration_RotateResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_HandCalibration_RotateResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Status"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_HandCalibration_RotateNotification_descriptor = descriptor8;
        internal_static_GDI_Proto_HandCalibration_RotateNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Status"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_HandCalibration_HandCalibrationService_descriptor = descriptor9;
        internal_static_GDI_Proto_HandCalibration_HandCalibrationService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"CommandRequest", "CommandResponse", "StepRequest", "StepResponse", "RotateRequest", "RotateResponse", "RotateNotification"});
    }

    private GDIHandCalibration() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class RotateRequest extends GeneratedMessageV3 implements RotateRequestOrBuilder {
        public static final int HR_DEGREES_FIELD_NUMBER = 3;
        public static final int MIN_DEGREES_FIELD_NUMBER = 2;
        public static final int SEC_DEGREES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private float hrDegrees_;
        private byte memoizedIsInitialized;
        private float minDegrees_;
        private float secDegrees_;
        private static final RotateRequest DEFAULT_INSTANCE = new RotateRequest();

        @Deprecated
        public static final Parser<RotateRequest> PARSER = new AbstractParser<RotateRequest>() { // from class: com.garmin.proto.generated.GDIHandCalibration.RotateRequest.1
            @Override // com.google.protobuf.Parser
            public RotateRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RotateRequest.newBuilder();
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

        private RotateRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.secDegrees_ = 0.0f;
            this.minDegrees_ = 0.0f;
            this.hrDegrees_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RotateRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateRequest_descriptor;
        }

        public static Builder newBuilder(RotateRequest rotateRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rotateRequest);
        }

        public static RotateRequest parseDelimitedFrom(InputStream inputStream) {
            return (RotateRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RotateRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RotateRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RotateRequest)) {
                return super.equals(obj);
            }
            RotateRequest rotateRequest = (RotateRequest) obj;
            if (hasSecDegrees() != rotateRequest.hasSecDegrees()) {
                return false;
            }
            if ((hasSecDegrees() && Float.floatToIntBits(getSecDegrees()) != Float.floatToIntBits(rotateRequest.getSecDegrees())) || hasMinDegrees() != rotateRequest.hasMinDegrees()) {
                return false;
            }
            if ((!hasMinDegrees() || Float.floatToIntBits(getMinDegrees()) == Float.floatToIntBits(rotateRequest.getMinDegrees())) && hasHrDegrees() == rotateRequest.hasHrDegrees()) {
                return (!hasHrDegrees() || Float.floatToIntBits(getHrDegrees()) == Float.floatToIntBits(rotateRequest.getHrDegrees())) && getUnknownFields().equals(rotateRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
        public float getHrDegrees() {
            return this.hrDegrees_;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
        public float getMinDegrees() {
            return this.minDegrees_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RotateRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
        public float getSecDegrees() {
            return this.secDegrees_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.secDegrees_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.minDegrees_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.hrDegrees_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
        public boolean hasHrDegrees() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
        public boolean hasMinDegrees() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
        public boolean hasSecDegrees() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSecDegrees()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getSecDegrees());
            }
            if (hasMinDegrees()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getMinDegrees());
            }
            if (hasHrDegrees()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getHrDegrees());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RotateRequest.class, Builder.class);
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
            return new RotateRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.secDegrees_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.minDegrees_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.hrDegrees_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RotateRequestOrBuilder {
            private int bitField0_;
            private float hrDegrees_;
            private float minDegrees_;
            private float secDegrees_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(RotateRequest rotateRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    rotateRequest.secDegrees_ = this.secDegrees_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    rotateRequest.minDegrees_ = this.minDegrees_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    rotateRequest.hrDegrees_ = this.hrDegrees_;
                    i14 |= 4;
                }
                rotateRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RotateRequest build() {
                RotateRequest rotateRequestBuildPartial = buildPartial();
                if (rotateRequestBuildPartial.isInitialized()) {
                    return rotateRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rotateRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RotateRequest buildPartial() {
                RotateRequest rotateRequest = new RotateRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(rotateRequest);
                }
                onBuilt();
                return rotateRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.secDegrees_ = 0.0f;
                this.minDegrees_ = 0.0f;
                this.hrDegrees_ = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHrDegrees() {
                this.bitField0_ &= -5;
                this.hrDegrees_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMinDegrees() {
                this.bitField0_ &= -3;
                this.minDegrees_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSecDegrees() {
                this.bitField0_ &= -2;
                this.secDegrees_ = 0.0f;
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
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
            public float getHrDegrees() {
                return this.hrDegrees_;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
            public float getMinDegrees() {
                return this.minDegrees_;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
            public float getSecDegrees() {
                return this.secDegrees_;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
            public boolean hasHrDegrees() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
            public boolean hasMinDegrees() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.RotateRequestOrBuilder
            public boolean hasSecDegrees() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RotateRequest.class, Builder.class);
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
                                    this.secDegrees_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.minDegrees_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.hrDegrees_ = codedInputStream.readFloat();
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

            public Builder setHrDegrees(float f14) {
                this.hrDegrees_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMinDegrees(float f14) {
                this.minDegrees_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSecDegrees(float f14) {
                this.secDegrees_ = f14;
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
            public RotateRequest getDefaultInstanceForType() {
                return RotateRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RotateRequest) {
                    return mergeFrom((RotateRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RotateRequest rotateRequest) {
                if (rotateRequest == RotateRequest.getDefaultInstance()) {
                    return this;
                }
                if (rotateRequest.hasSecDegrees()) {
                    setSecDegrees(rotateRequest.getSecDegrees());
                }
                if (rotateRequest.hasMinDegrees()) {
                    setMinDegrees(rotateRequest.getMinDegrees());
                }
                if (rotateRequest.hasHrDegrees()) {
                    setHrDegrees(rotateRequest.getHrDegrees());
                }
                mergeUnknownFields(rotateRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RotateRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RotateRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RotateRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RotateRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RotateRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RotateRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RotateRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RotateRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ RotateRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RotateRequest parseFrom(InputStream inputStream) {
            return (RotateRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private RotateRequest() {
            this.secDegrees_ = 0.0f;
            this.minDegrees_ = 0.0f;
            this.hrDegrees_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RotateRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RotateRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RotateRequest parseFrom(CodedInputStream codedInputStream) {
            return (RotateRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RotateRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RotateRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CommandRequest extends GeneratedMessageV3 implements CommandRequestOrBuilder {
        public static final int COMMAND_FIELD_NUMBER = 1;
        private static final CommandRequest DEFAULT_INSTANCE = new CommandRequest();

        @Deprecated
        public static final Parser<CommandRequest> PARSER = new AbstractParser<CommandRequest>() { // from class: com.garmin.proto.generated.GDIHandCalibration.CommandRequest.1
            @Override // com.google.protobuf.Parser
            public CommandRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CommandRequest.newBuilder();
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
        private int command_;
        private byte memoizedIsInitialized;

        private CommandRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.command_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CommandRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_CommandRequest_descriptor;
        }

        public static Builder newBuilder(CommandRequest commandRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(commandRequest);
        }

        public static CommandRequest parseDelimitedFrom(InputStream inputStream) {
            return (CommandRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CommandRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CommandRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CommandRequest)) {
                return super.equals(obj);
            }
            CommandRequest commandRequest = (CommandRequest) obj;
            if (hasCommand() != commandRequest.hasCommand()) {
                return false;
            }
            return (!hasCommand() || this.command_ == commandRequest.command_) && getUnknownFields().equals(commandRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.CommandRequestOrBuilder
        public Command getCommand() {
            Command commandForNumber = Command.forNumber(this.command_);
            return commandForNumber == null ? Command.START : commandForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CommandRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.command_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.CommandRequestOrBuilder
        public boolean hasCommand() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCommand()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.command_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_CommandRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CommandRequest.class, Builder.class);
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
            return new CommandRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.command_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CommandRequestOrBuilder {
            private int bitField0_;
            private int command_;

            private Builder() {
                this.command_ = 1;
            }

            private void buildPartial0(CommandRequest commandRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    commandRequest.command_ = this.command_;
                } else {
                    i14 = 0;
                }
                commandRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_CommandRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CommandRequest build() {
                CommandRequest commandRequestBuildPartial = buildPartial();
                if (commandRequestBuildPartial.isInitialized()) {
                    return commandRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) commandRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CommandRequest buildPartial() {
                CommandRequest commandRequest = new CommandRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(commandRequest);
                }
                onBuilt();
                return commandRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.command_ = 1;
                return this;
            }

            public Builder clearCommand() {
                this.bitField0_ &= -2;
                this.command_ = 1;
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

            @Override // com.garmin.proto.generated.GDIHandCalibration.CommandRequestOrBuilder
            public Command getCommand() {
                Command commandForNumber = Command.forNumber(this.command_);
                return commandForNumber == null ? Command.START : commandForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_CommandRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.CommandRequestOrBuilder
            public boolean hasCommand() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_CommandRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CommandRequest.class, Builder.class);
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
                                    if (Command.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.command_ = i14;
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

            public Builder setCommand(Command command) {
                command.getClass();
                this.bitField0_ |= 1;
                this.command_ = command.getNumber();
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
            public CommandRequest getDefaultInstanceForType() {
                return CommandRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.command_ = 1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CommandRequest) {
                    return mergeFrom((CommandRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CommandRequest commandRequest) {
                if (commandRequest == CommandRequest.getDefaultInstance()) {
                    return this;
                }
                if (commandRequest.hasCommand()) {
                    setCommand(commandRequest.getCommand());
                }
                mergeUnknownFields(commandRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CommandRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CommandRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CommandRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CommandRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CommandRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CommandRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CommandRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.command_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CommandRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CommandRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CommandRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CommandRequest parseFrom(InputStream inputStream) {
            return (CommandRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CommandRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CommandRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CommandRequest parseFrom(CodedInputStream codedInputStream) {
            return (CommandRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CommandRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CommandRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Command implements ProtocolMessageEnum {
            START(1),
            ABORT(2),
            SAVE(3),
            IMAGE_START(4);

            public static final int ABORT_VALUE = 2;
            public static final int IMAGE_START_VALUE = 4;
            public static final int SAVE_VALUE = 3;
            public static final int START_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Command> internalValueMap = new Internal.EnumLiteMap<Command>() { // from class: com.garmin.proto.generated.GDIHandCalibration.CommandRequest.Command.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Command findValueByNumber(int i14) {
                    return Command.forNumber(i14);
                }
            };
            private static final Command[] VALUES = values();

            Command(int i14) {
                this.value = i14;
            }

            public static Command forNumber(int i14) {
                if (i14 == 1) {
                    return START;
                }
                if (i14 == 2) {
                    return ABORT;
                }
                if (i14 == 3) {
                    return SAVE;
                }
                if (i14 != 4) {
                    return null;
                }
                return IMAGE_START;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CommandRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Command> internalGetValueMap() {
                return internalValueMap;
            }

            public static Command valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Command valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class CommandResponse extends GeneratedMessageV3 implements CommandResponseOrBuilder {
        private static final CommandResponse DEFAULT_INSTANCE = new CommandResponse();

        @Deprecated
        public static final Parser<CommandResponse> PARSER = new AbstractParser<CommandResponse>() { // from class: com.garmin.proto.generated.GDIHandCalibration.CommandResponse.1
            @Override // com.google.protobuf.Parser
            public CommandResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CommandResponse.newBuilder();
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

        private CommandResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CommandResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_CommandResponse_descriptor;
        }

        public static Builder newBuilder(CommandResponse commandResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(commandResponse);
        }

        public static CommandResponse parseDelimitedFrom(InputStream inputStream) {
            return (CommandResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CommandResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CommandResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CommandResponse)) {
                return super.equals(obj);
            }
            CommandResponse commandResponse = (CommandResponse) obj;
            if (hasStatus() != commandResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == commandResponse.status_) && getUnknownFields().equals(commandResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CommandResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIHandCalibration.CommandResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.CommandResponseOrBuilder
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
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_CommandResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CommandResponse.class, Builder.class);
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
            return new CommandResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CommandResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(CommandResponse commandResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    commandResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                commandResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_CommandResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CommandResponse build() {
                CommandResponse commandResponseBuildPartial = buildPartial();
                if (commandResponseBuildPartial.isInitialized()) {
                    return commandResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) commandResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CommandResponse buildPartial() {
                CommandResponse commandResponse = new CommandResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(commandResponse);
                }
                onBuilt();
                return commandResponse;
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
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_CommandResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.CommandResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.CommandResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_CommandResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CommandResponse.class, Builder.class);
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
            public CommandResponse getDefaultInstanceForType() {
                return CommandResponse.getDefaultInstance();
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
                if (message instanceof CommandResponse) {
                    return mergeFrom((CommandResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CommandResponse commandResponse) {
                if (commandResponse == CommandResponse.getDefaultInstance()) {
                    return this;
                }
                if (commandResponse.hasStatus()) {
                    setStatus(commandResponse.getStatus());
                }
                mergeUnknownFields(commandResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CommandResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CommandResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CommandResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CommandResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CommandResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CommandResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CommandResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CommandResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CommandResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CommandResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CommandResponse parseFrom(InputStream inputStream) {
            return (CommandResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CommandResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CommandResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CommandResponse parseFrom(CodedInputStream codedInputStream) {
            return (CommandResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CommandResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CommandResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(1),
            BUSY(2),
            ERROR(3);

            public static final int BUSY_VALUE = 2;
            public static final int ERROR_VALUE = 3;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIHandCalibration.CommandResponse.Status.1
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
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 == 2) {
                    return BUSY;
                }
                if (i14 != 3) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CommandResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class HandCalibrationService extends GeneratedMessageV3 implements HandCalibrationServiceOrBuilder {
        public static final int COMMAND_REQUEST_FIELD_NUMBER = 1;
        public static final int COMMAND_RESPONSE_FIELD_NUMBER = 2;
        private static final HandCalibrationService DEFAULT_INSTANCE = new HandCalibrationService();

        @Deprecated
        public static final Parser<HandCalibrationService> PARSER = new AbstractParser<HandCalibrationService>() { // from class: com.garmin.proto.generated.GDIHandCalibration.HandCalibrationService.1
            @Override // com.google.protobuf.Parser
            public HandCalibrationService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HandCalibrationService.newBuilder();
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
        public static final int ROTATE_NOTIFICATION_FIELD_NUMBER = 7;
        public static final int ROTATE_REQUEST_FIELD_NUMBER = 5;
        public static final int ROTATE_RESPONSE_FIELD_NUMBER = 6;
        public static final int STEP_REQUEST_FIELD_NUMBER = 3;
        public static final int STEP_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CommandRequest commandRequest_;
        private CommandResponse commandResponse_;
        private byte memoizedIsInitialized;
        private RotateNotification rotateNotification_;
        private RotateRequest rotateRequest_;
        private RotateResponse rotateResponse_;
        private StepRequest stepRequest_;
        private StepResponse stepResponse_;

        private HandCalibrationService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HandCalibrationService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_HandCalibrationService_descriptor;
        }

        public static Builder newBuilder(HandCalibrationService handCalibrationService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(handCalibrationService);
        }

        public static HandCalibrationService parseDelimitedFrom(InputStream inputStream) {
            return (HandCalibrationService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HandCalibrationService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HandCalibrationService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HandCalibrationService)) {
                return super.equals(obj);
            }
            HandCalibrationService handCalibrationService = (HandCalibrationService) obj;
            if (hasCommandRequest() != handCalibrationService.hasCommandRequest()) {
                return false;
            }
            if ((hasCommandRequest() && !getCommandRequest().equals(handCalibrationService.getCommandRequest())) || hasCommandResponse() != handCalibrationService.hasCommandResponse()) {
                return false;
            }
            if ((hasCommandResponse() && !getCommandResponse().equals(handCalibrationService.getCommandResponse())) || hasStepRequest() != handCalibrationService.hasStepRequest()) {
                return false;
            }
            if ((hasStepRequest() && !getStepRequest().equals(handCalibrationService.getStepRequest())) || hasStepResponse() != handCalibrationService.hasStepResponse()) {
                return false;
            }
            if ((hasStepResponse() && !getStepResponse().equals(handCalibrationService.getStepResponse())) || hasRotateRequest() != handCalibrationService.hasRotateRequest()) {
                return false;
            }
            if ((hasRotateRequest() && !getRotateRequest().equals(handCalibrationService.getRotateRequest())) || hasRotateResponse() != handCalibrationService.hasRotateResponse()) {
                return false;
            }
            if ((!hasRotateResponse() || getRotateResponse().equals(handCalibrationService.getRotateResponse())) && hasRotateNotification() == handCalibrationService.hasRotateNotification()) {
                return (!hasRotateNotification() || getRotateNotification().equals(handCalibrationService.getRotateNotification())) && getUnknownFields().equals(handCalibrationService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public CommandRequest getCommandRequest() {
            CommandRequest commandRequest = this.commandRequest_;
            return commandRequest == null ? CommandRequest.getDefaultInstance() : commandRequest;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public CommandRequestOrBuilder getCommandRequestOrBuilder() {
            CommandRequest commandRequest = this.commandRequest_;
            return commandRequest == null ? CommandRequest.getDefaultInstance() : commandRequest;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public CommandResponse getCommandResponse() {
            CommandResponse commandResponse = this.commandResponse_;
            return commandResponse == null ? CommandResponse.getDefaultInstance() : commandResponse;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public CommandResponseOrBuilder getCommandResponseOrBuilder() {
            CommandResponse commandResponse = this.commandResponse_;
            return commandResponse == null ? CommandResponse.getDefaultInstance() : commandResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HandCalibrationService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public RotateNotification getRotateNotification() {
            RotateNotification rotateNotification = this.rotateNotification_;
            return rotateNotification == null ? RotateNotification.getDefaultInstance() : rotateNotification;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public RotateNotificationOrBuilder getRotateNotificationOrBuilder() {
            RotateNotification rotateNotification = this.rotateNotification_;
            return rotateNotification == null ? RotateNotification.getDefaultInstance() : rotateNotification;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public RotateRequest getRotateRequest() {
            RotateRequest rotateRequest = this.rotateRequest_;
            return rotateRequest == null ? RotateRequest.getDefaultInstance() : rotateRequest;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public RotateRequestOrBuilder getRotateRequestOrBuilder() {
            RotateRequest rotateRequest = this.rotateRequest_;
            return rotateRequest == null ? RotateRequest.getDefaultInstance() : rotateRequest;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public RotateResponse getRotateResponse() {
            RotateResponse rotateResponse = this.rotateResponse_;
            return rotateResponse == null ? RotateResponse.getDefaultInstance() : rotateResponse;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public RotateResponseOrBuilder getRotateResponseOrBuilder() {
            RotateResponse rotateResponse = this.rotateResponse_;
            return rotateResponse == null ? RotateResponse.getDefaultInstance() : rotateResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCommandRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getCommandResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getStepRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getStepResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getRotateRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getRotateResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getRotateNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public StepRequest getStepRequest() {
            StepRequest stepRequest = this.stepRequest_;
            return stepRequest == null ? StepRequest.getDefaultInstance() : stepRequest;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public StepRequestOrBuilder getStepRequestOrBuilder() {
            StepRequest stepRequest = this.stepRequest_;
            return stepRequest == null ? StepRequest.getDefaultInstance() : stepRequest;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public StepResponse getStepResponse() {
            StepResponse stepResponse = this.stepResponse_;
            return stepResponse == null ? StepResponse.getDefaultInstance() : stepResponse;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public StepResponseOrBuilder getStepResponseOrBuilder() {
            StepResponse stepResponse = this.stepResponse_;
            return stepResponse == null ? StepResponse.getDefaultInstance() : stepResponse;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public boolean hasCommandRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public boolean hasCommandResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public boolean hasRotateNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public boolean hasRotateRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public boolean hasRotateResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public boolean hasStepRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
        public boolean hasStepResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCommandRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCommandRequest().hashCode();
            }
            if (hasCommandResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCommandResponse().hashCode();
            }
            if (hasStepRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStepRequest().hashCode();
            }
            if (hasStepResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getStepResponse().hashCode();
            }
            if (hasRotateRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getRotateRequest().hashCode();
            }
            if (hasRotateResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getRotateResponse().hashCode();
            }
            if (hasRotateNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getRotateNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_HandCalibrationService_fieldAccessorTable.ensureFieldAccessorsInitialized(HandCalibrationService.class, Builder.class);
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
            return new HandCalibrationService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCommandRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getCommandResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getStepRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getStepResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getRotateRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getRotateResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getRotateNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HandCalibrationServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CommandRequest, CommandRequest.Builder, CommandRequestOrBuilder> commandRequestBuilder_;
            private CommandRequest commandRequest_;
            private SingleFieldBuilderV3<CommandResponse, CommandResponse.Builder, CommandResponseOrBuilder> commandResponseBuilder_;
            private CommandResponse commandResponse_;
            private SingleFieldBuilderV3<RotateNotification, RotateNotification.Builder, RotateNotificationOrBuilder> rotateNotificationBuilder_;
            private RotateNotification rotateNotification_;
            private SingleFieldBuilderV3<RotateRequest, RotateRequest.Builder, RotateRequestOrBuilder> rotateRequestBuilder_;
            private RotateRequest rotateRequest_;
            private SingleFieldBuilderV3<RotateResponse, RotateResponse.Builder, RotateResponseOrBuilder> rotateResponseBuilder_;
            private RotateResponse rotateResponse_;
            private SingleFieldBuilderV3<StepRequest, StepRequest.Builder, StepRequestOrBuilder> stepRequestBuilder_;
            private StepRequest stepRequest_;
            private SingleFieldBuilderV3<StepResponse, StepResponse.Builder, StepResponseOrBuilder> stepResponseBuilder_;
            private StepResponse stepResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(HandCalibrationService handCalibrationService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<CommandRequest, CommandRequest.Builder, CommandRequestOrBuilder> singleFieldBuilderV3 = this.commandRequestBuilder_;
                    handCalibrationService.commandRequest_ = singleFieldBuilderV3 == null ? this.commandRequest_ : (CommandRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<CommandResponse, CommandResponse.Builder, CommandResponseOrBuilder> singleFieldBuilderV4 = this.commandResponseBuilder_;
                    handCalibrationService.commandResponse_ = singleFieldBuilderV4 == null ? this.commandResponse_ : (CommandResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<StepRequest, StepRequest.Builder, StepRequestOrBuilder> singleFieldBuilderV5 = this.stepRequestBuilder_;
                    handCalibrationService.stepRequest_ = singleFieldBuilderV5 == null ? this.stepRequest_ : (StepRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<StepResponse, StepResponse.Builder, StepResponseOrBuilder> singleFieldBuilderV6 = this.stepResponseBuilder_;
                    handCalibrationService.stepResponse_ = singleFieldBuilderV6 == null ? this.stepResponse_ : (StepResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<RotateRequest, RotateRequest.Builder, RotateRequestOrBuilder> singleFieldBuilderV7 = this.rotateRequestBuilder_;
                    handCalibrationService.rotateRequest_ = singleFieldBuilderV7 == null ? this.rotateRequest_ : (RotateRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<RotateResponse, RotateResponse.Builder, RotateResponseOrBuilder> singleFieldBuilderV8 = this.rotateResponseBuilder_;
                    handCalibrationService.rotateResponse_ = singleFieldBuilderV8 == null ? this.rotateResponse_ : (RotateResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<RotateNotification, RotateNotification.Builder, RotateNotificationOrBuilder> singleFieldBuilderV9 = this.rotateNotificationBuilder_;
                    handCalibrationService.rotateNotification_ = singleFieldBuilderV9 == null ? this.rotateNotification_ : (RotateNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                handCalibrationService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CommandRequest, CommandRequest.Builder, CommandRequestOrBuilder> getCommandRequestFieldBuilder() {
                if (this.commandRequestBuilder_ == null) {
                    this.commandRequestBuilder_ = new SingleFieldBuilderV3<>(getCommandRequest(), getParentForChildren(), isClean());
                    this.commandRequest_ = null;
                }
                return this.commandRequestBuilder_;
            }

            private SingleFieldBuilderV3<CommandResponse, CommandResponse.Builder, CommandResponseOrBuilder> getCommandResponseFieldBuilder() {
                if (this.commandResponseBuilder_ == null) {
                    this.commandResponseBuilder_ = new SingleFieldBuilderV3<>(getCommandResponse(), getParentForChildren(), isClean());
                    this.commandResponse_ = null;
                }
                return this.commandResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_HandCalibrationService_descriptor;
            }

            private SingleFieldBuilderV3<RotateNotification, RotateNotification.Builder, RotateNotificationOrBuilder> getRotateNotificationFieldBuilder() {
                if (this.rotateNotificationBuilder_ == null) {
                    this.rotateNotificationBuilder_ = new SingleFieldBuilderV3<>(getRotateNotification(), getParentForChildren(), isClean());
                    this.rotateNotification_ = null;
                }
                return this.rotateNotificationBuilder_;
            }

            private SingleFieldBuilderV3<RotateRequest, RotateRequest.Builder, RotateRequestOrBuilder> getRotateRequestFieldBuilder() {
                if (this.rotateRequestBuilder_ == null) {
                    this.rotateRequestBuilder_ = new SingleFieldBuilderV3<>(getRotateRequest(), getParentForChildren(), isClean());
                    this.rotateRequest_ = null;
                }
                return this.rotateRequestBuilder_;
            }

            private SingleFieldBuilderV3<RotateResponse, RotateResponse.Builder, RotateResponseOrBuilder> getRotateResponseFieldBuilder() {
                if (this.rotateResponseBuilder_ == null) {
                    this.rotateResponseBuilder_ = new SingleFieldBuilderV3<>(getRotateResponse(), getParentForChildren(), isClean());
                    this.rotateResponse_ = null;
                }
                return this.rotateResponseBuilder_;
            }

            private SingleFieldBuilderV3<StepRequest, StepRequest.Builder, StepRequestOrBuilder> getStepRequestFieldBuilder() {
                if (this.stepRequestBuilder_ == null) {
                    this.stepRequestBuilder_ = new SingleFieldBuilderV3<>(getStepRequest(), getParentForChildren(), isClean());
                    this.stepRequest_ = null;
                }
                return this.stepRequestBuilder_;
            }

            private SingleFieldBuilderV3<StepResponse, StepResponse.Builder, StepResponseOrBuilder> getStepResponseFieldBuilder() {
                if (this.stepResponseBuilder_ == null) {
                    this.stepResponseBuilder_ = new SingleFieldBuilderV3<>(getStepResponse(), getParentForChildren(), isClean());
                    this.stepResponse_ = null;
                }
                return this.stepResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCommandRequestFieldBuilder();
                    getCommandResponseFieldBuilder();
                    getStepRequestFieldBuilder();
                    getStepResponseFieldBuilder();
                    getRotateRequestFieldBuilder();
                    getRotateResponseFieldBuilder();
                    getRotateNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HandCalibrationService build() {
                HandCalibrationService handCalibrationServiceBuildPartial = buildPartial();
                if (handCalibrationServiceBuildPartial.isInitialized()) {
                    return handCalibrationServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) handCalibrationServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HandCalibrationService buildPartial() {
                HandCalibrationService handCalibrationService = new HandCalibrationService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(handCalibrationService);
                }
                onBuilt();
                return handCalibrationService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.commandRequest_ = null;
                SingleFieldBuilderV3<CommandRequest, CommandRequest.Builder, CommandRequestOrBuilder> singleFieldBuilderV3 = this.commandRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.commandRequestBuilder_ = null;
                }
                this.commandResponse_ = null;
                SingleFieldBuilderV3<CommandResponse, CommandResponse.Builder, CommandResponseOrBuilder> singleFieldBuilderV4 = this.commandResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.commandResponseBuilder_ = null;
                }
                this.stepRequest_ = null;
                SingleFieldBuilderV3<StepRequest, StepRequest.Builder, StepRequestOrBuilder> singleFieldBuilderV5 = this.stepRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.stepRequestBuilder_ = null;
                }
                this.stepResponse_ = null;
                SingleFieldBuilderV3<StepResponse, StepResponse.Builder, StepResponseOrBuilder> singleFieldBuilderV6 = this.stepResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.stepResponseBuilder_ = null;
                }
                this.rotateRequest_ = null;
                SingleFieldBuilderV3<RotateRequest, RotateRequest.Builder, RotateRequestOrBuilder> singleFieldBuilderV7 = this.rotateRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.rotateRequestBuilder_ = null;
                }
                this.rotateResponse_ = null;
                SingleFieldBuilderV3<RotateResponse, RotateResponse.Builder, RotateResponseOrBuilder> singleFieldBuilderV8 = this.rotateResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.rotateResponseBuilder_ = null;
                }
                this.rotateNotification_ = null;
                SingleFieldBuilderV3<RotateNotification, RotateNotification.Builder, RotateNotificationOrBuilder> singleFieldBuilderV9 = this.rotateNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.rotateNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearCommandRequest() {
                this.bitField0_ &= -2;
                this.commandRequest_ = null;
                SingleFieldBuilderV3<CommandRequest, CommandRequest.Builder, CommandRequestOrBuilder> singleFieldBuilderV3 = this.commandRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.commandRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCommandResponse() {
                this.bitField0_ &= -3;
                this.commandResponse_ = null;
                SingleFieldBuilderV3<CommandResponse, CommandResponse.Builder, CommandResponseOrBuilder> singleFieldBuilderV3 = this.commandResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.commandResponseBuilder_ = null;
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

            public Builder clearRotateNotification() {
                this.bitField0_ &= -65;
                this.rotateNotification_ = null;
                SingleFieldBuilderV3<RotateNotification, RotateNotification.Builder, RotateNotificationOrBuilder> singleFieldBuilderV3 = this.rotateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.rotateNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRotateRequest() {
                this.bitField0_ &= -17;
                this.rotateRequest_ = null;
                SingleFieldBuilderV3<RotateRequest, RotateRequest.Builder, RotateRequestOrBuilder> singleFieldBuilderV3 = this.rotateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.rotateRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRotateResponse() {
                this.bitField0_ &= -33;
                this.rotateResponse_ = null;
                SingleFieldBuilderV3<RotateResponse, RotateResponse.Builder, RotateResponseOrBuilder> singleFieldBuilderV3 = this.rotateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.rotateResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStepRequest() {
                this.bitField0_ &= -5;
                this.stepRequest_ = null;
                SingleFieldBuilderV3<StepRequest, StepRequest.Builder, StepRequestOrBuilder> singleFieldBuilderV3 = this.stepRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stepRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStepResponse() {
                this.bitField0_ &= -9;
                this.stepResponse_ = null;
                SingleFieldBuilderV3<StepResponse, StepResponse.Builder, StepResponseOrBuilder> singleFieldBuilderV3 = this.stepResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stepResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public CommandRequest getCommandRequest() {
                SingleFieldBuilderV3<CommandRequest, CommandRequest.Builder, CommandRequestOrBuilder> singleFieldBuilderV3 = this.commandRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommandRequest) singleFieldBuilderV3.getMessage();
                }
                CommandRequest commandRequest = this.commandRequest_;
                return commandRequest == null ? CommandRequest.getDefaultInstance() : commandRequest;
            }

            public CommandRequest.Builder getCommandRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CommandRequest.Builder) getCommandRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public CommandRequestOrBuilder getCommandRequestOrBuilder() {
                SingleFieldBuilderV3<CommandRequest, CommandRequest.Builder, CommandRequestOrBuilder> singleFieldBuilderV3 = this.commandRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommandRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CommandRequest commandRequest = this.commandRequest_;
                return commandRequest == null ? CommandRequest.getDefaultInstance() : commandRequest;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public CommandResponse getCommandResponse() {
                SingleFieldBuilderV3<CommandResponse, CommandResponse.Builder, CommandResponseOrBuilder> singleFieldBuilderV3 = this.commandResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommandResponse) singleFieldBuilderV3.getMessage();
                }
                CommandResponse commandResponse = this.commandResponse_;
                return commandResponse == null ? CommandResponse.getDefaultInstance() : commandResponse;
            }

            public CommandResponse.Builder getCommandResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (CommandResponse.Builder) getCommandResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public CommandResponseOrBuilder getCommandResponseOrBuilder() {
                SingleFieldBuilderV3<CommandResponse, CommandResponse.Builder, CommandResponseOrBuilder> singleFieldBuilderV3 = this.commandResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CommandResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CommandResponse commandResponse = this.commandResponse_;
                return commandResponse == null ? CommandResponse.getDefaultInstance() : commandResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_HandCalibrationService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public RotateNotification getRotateNotification() {
                SingleFieldBuilderV3<RotateNotification, RotateNotification.Builder, RotateNotificationOrBuilder> singleFieldBuilderV3 = this.rotateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RotateNotification) singleFieldBuilderV3.getMessage();
                }
                RotateNotification rotateNotification = this.rotateNotification_;
                return rotateNotification == null ? RotateNotification.getDefaultInstance() : rotateNotification;
            }

            public RotateNotification.Builder getRotateNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (RotateNotification.Builder) getRotateNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public RotateNotificationOrBuilder getRotateNotificationOrBuilder() {
                SingleFieldBuilderV3<RotateNotification, RotateNotification.Builder, RotateNotificationOrBuilder> singleFieldBuilderV3 = this.rotateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RotateNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RotateNotification rotateNotification = this.rotateNotification_;
                return rotateNotification == null ? RotateNotification.getDefaultInstance() : rotateNotification;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public RotateRequest getRotateRequest() {
                SingleFieldBuilderV3<RotateRequest, RotateRequest.Builder, RotateRequestOrBuilder> singleFieldBuilderV3 = this.rotateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RotateRequest) singleFieldBuilderV3.getMessage();
                }
                RotateRequest rotateRequest = this.rotateRequest_;
                return rotateRequest == null ? RotateRequest.getDefaultInstance() : rotateRequest;
            }

            public RotateRequest.Builder getRotateRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (RotateRequest.Builder) getRotateRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public RotateRequestOrBuilder getRotateRequestOrBuilder() {
                SingleFieldBuilderV3<RotateRequest, RotateRequest.Builder, RotateRequestOrBuilder> singleFieldBuilderV3 = this.rotateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RotateRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RotateRequest rotateRequest = this.rotateRequest_;
                return rotateRequest == null ? RotateRequest.getDefaultInstance() : rotateRequest;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public RotateResponse getRotateResponse() {
                SingleFieldBuilderV3<RotateResponse, RotateResponse.Builder, RotateResponseOrBuilder> singleFieldBuilderV3 = this.rotateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RotateResponse) singleFieldBuilderV3.getMessage();
                }
                RotateResponse rotateResponse = this.rotateResponse_;
                return rotateResponse == null ? RotateResponse.getDefaultInstance() : rotateResponse;
            }

            public RotateResponse.Builder getRotateResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (RotateResponse.Builder) getRotateResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public RotateResponseOrBuilder getRotateResponseOrBuilder() {
                SingleFieldBuilderV3<RotateResponse, RotateResponse.Builder, RotateResponseOrBuilder> singleFieldBuilderV3 = this.rotateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RotateResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RotateResponse rotateResponse = this.rotateResponse_;
                return rotateResponse == null ? RotateResponse.getDefaultInstance() : rotateResponse;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public StepRequest getStepRequest() {
                SingleFieldBuilderV3<StepRequest, StepRequest.Builder, StepRequestOrBuilder> singleFieldBuilderV3 = this.stepRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StepRequest) singleFieldBuilderV3.getMessage();
                }
                StepRequest stepRequest = this.stepRequest_;
                return stepRequest == null ? StepRequest.getDefaultInstance() : stepRequest;
            }

            public StepRequest.Builder getStepRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (StepRequest.Builder) getStepRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public StepRequestOrBuilder getStepRequestOrBuilder() {
                SingleFieldBuilderV3<StepRequest, StepRequest.Builder, StepRequestOrBuilder> singleFieldBuilderV3 = this.stepRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StepRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StepRequest stepRequest = this.stepRequest_;
                return stepRequest == null ? StepRequest.getDefaultInstance() : stepRequest;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public StepResponse getStepResponse() {
                SingleFieldBuilderV3<StepResponse, StepResponse.Builder, StepResponseOrBuilder> singleFieldBuilderV3 = this.stepResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StepResponse) singleFieldBuilderV3.getMessage();
                }
                StepResponse stepResponse = this.stepResponse_;
                return stepResponse == null ? StepResponse.getDefaultInstance() : stepResponse;
            }

            public StepResponse.Builder getStepResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (StepResponse.Builder) getStepResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public StepResponseOrBuilder getStepResponseOrBuilder() {
                SingleFieldBuilderV3<StepResponse, StepResponse.Builder, StepResponseOrBuilder> singleFieldBuilderV3 = this.stepResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StepResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StepResponse stepResponse = this.stepResponse_;
                return stepResponse == null ? StepResponse.getDefaultInstance() : stepResponse;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public boolean hasCommandRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public boolean hasCommandResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public boolean hasRotateNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public boolean hasRotateRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public boolean hasRotateResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public boolean hasStepRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.HandCalibrationServiceOrBuilder
            public boolean hasStepResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_HandCalibrationService_fieldAccessorTable.ensureFieldAccessorsInitialized(HandCalibrationService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCommandRequest(CommandRequest commandRequest) {
                CommandRequest commandRequest2;
                SingleFieldBuilderV3<CommandRequest, CommandRequest.Builder, CommandRequestOrBuilder> singleFieldBuilderV3 = this.commandRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(commandRequest);
                } else if ((this.bitField0_ & 1) == 0 || (commandRequest2 = this.commandRequest_) == null || commandRequest2 == CommandRequest.getDefaultInstance()) {
                    this.commandRequest_ = commandRequest;
                } else {
                    getCommandRequestBuilder().mergeFrom(commandRequest);
                }
                if (this.commandRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCommandResponse(CommandResponse commandResponse) {
                CommandResponse commandResponse2;
                SingleFieldBuilderV3<CommandResponse, CommandResponse.Builder, CommandResponseOrBuilder> singleFieldBuilderV3 = this.commandResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(commandResponse);
                } else if ((this.bitField0_ & 2) == 0 || (commandResponse2 = this.commandResponse_) == null || commandResponse2 == CommandResponse.getDefaultInstance()) {
                    this.commandResponse_ = commandResponse;
                } else {
                    getCommandResponseBuilder().mergeFrom(commandResponse);
                }
                if (this.commandResponse_ != null) {
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
                                    codedInputStream.readMessage(getCommandRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getCommandResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getStepRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getStepResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getRotateRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getRotateResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getRotateNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
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

            public Builder mergeRotateNotification(RotateNotification rotateNotification) {
                RotateNotification rotateNotification2;
                SingleFieldBuilderV3<RotateNotification, RotateNotification.Builder, RotateNotificationOrBuilder> singleFieldBuilderV3 = this.rotateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(rotateNotification);
                } else if ((this.bitField0_ & 64) == 0 || (rotateNotification2 = this.rotateNotification_) == null || rotateNotification2 == RotateNotification.getDefaultInstance()) {
                    this.rotateNotification_ = rotateNotification;
                } else {
                    getRotateNotificationBuilder().mergeFrom(rotateNotification);
                }
                if (this.rotateNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRotateRequest(RotateRequest rotateRequest) {
                RotateRequest rotateRequest2;
                SingleFieldBuilderV3<RotateRequest, RotateRequest.Builder, RotateRequestOrBuilder> singleFieldBuilderV3 = this.rotateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(rotateRequest);
                } else if ((this.bitField0_ & 16) == 0 || (rotateRequest2 = this.rotateRequest_) == null || rotateRequest2 == RotateRequest.getDefaultInstance()) {
                    this.rotateRequest_ = rotateRequest;
                } else {
                    getRotateRequestBuilder().mergeFrom(rotateRequest);
                }
                if (this.rotateRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRotateResponse(RotateResponse rotateResponse) {
                RotateResponse rotateResponse2;
                SingleFieldBuilderV3<RotateResponse, RotateResponse.Builder, RotateResponseOrBuilder> singleFieldBuilderV3 = this.rotateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(rotateResponse);
                } else if ((this.bitField0_ & 32) == 0 || (rotateResponse2 = this.rotateResponse_) == null || rotateResponse2 == RotateResponse.getDefaultInstance()) {
                    this.rotateResponse_ = rotateResponse;
                } else {
                    getRotateResponseBuilder().mergeFrom(rotateResponse);
                }
                if (this.rotateResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStepRequest(StepRequest stepRequest) {
                StepRequest stepRequest2;
                SingleFieldBuilderV3<StepRequest, StepRequest.Builder, StepRequestOrBuilder> singleFieldBuilderV3 = this.stepRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stepRequest);
                } else if ((this.bitField0_ & 4) == 0 || (stepRequest2 = this.stepRequest_) == null || stepRequest2 == StepRequest.getDefaultInstance()) {
                    this.stepRequest_ = stepRequest;
                } else {
                    getStepRequestBuilder().mergeFrom(stepRequest);
                }
                if (this.stepRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStepResponse(StepResponse stepResponse) {
                StepResponse stepResponse2;
                SingleFieldBuilderV3<StepResponse, StepResponse.Builder, StepResponseOrBuilder> singleFieldBuilderV3 = this.stepResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stepResponse);
                } else if ((this.bitField0_ & 8) == 0 || (stepResponse2 = this.stepResponse_) == null || stepResponse2 == StepResponse.getDefaultInstance()) {
                    this.stepResponse_ = stepResponse;
                } else {
                    getStepResponseBuilder().mergeFrom(stepResponse);
                }
                if (this.stepResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCommandRequest(CommandRequest.Builder builder) {
                SingleFieldBuilderV3<CommandRequest, CommandRequest.Builder, CommandRequestOrBuilder> singleFieldBuilderV3 = this.commandRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.commandRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCommandResponse(CommandResponse.Builder builder) {
                SingleFieldBuilderV3<CommandResponse, CommandResponse.Builder, CommandResponseOrBuilder> singleFieldBuilderV3 = this.commandResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.commandResponse_ = builder.build();
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

            public Builder setRotateNotification(RotateNotification.Builder builder) {
                SingleFieldBuilderV3<RotateNotification, RotateNotification.Builder, RotateNotificationOrBuilder> singleFieldBuilderV3 = this.rotateNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rotateNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setRotateRequest(RotateRequest.Builder builder) {
                SingleFieldBuilderV3<RotateRequest, RotateRequest.Builder, RotateRequestOrBuilder> singleFieldBuilderV3 = this.rotateRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rotateRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setRotateResponse(RotateResponse.Builder builder) {
                SingleFieldBuilderV3<RotateResponse, RotateResponse.Builder, RotateResponseOrBuilder> singleFieldBuilderV3 = this.rotateResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rotateResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStepRequest(StepRequest.Builder builder) {
                SingleFieldBuilderV3<StepRequest, StepRequest.Builder, StepRequestOrBuilder> singleFieldBuilderV3 = this.stepRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stepRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStepResponse(StepResponse.Builder builder) {
                SingleFieldBuilderV3<StepResponse, StepResponse.Builder, StepResponseOrBuilder> singleFieldBuilderV3 = this.stepResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stepResponse_ = builder.build();
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
            public HandCalibrationService getDefaultInstanceForType() {
                return HandCalibrationService.getDefaultInstance();
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

            public Builder setCommandRequest(CommandRequest commandRequest) {
                SingleFieldBuilderV3<CommandRequest, CommandRequest.Builder, CommandRequestOrBuilder> singleFieldBuilderV3 = this.commandRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    commandRequest.getClass();
                    this.commandRequest_ = commandRequest;
                } else {
                    singleFieldBuilderV3.setMessage(commandRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCommandResponse(CommandResponse commandResponse) {
                SingleFieldBuilderV3<CommandResponse, CommandResponse.Builder, CommandResponseOrBuilder> singleFieldBuilderV3 = this.commandResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    commandResponse.getClass();
                    this.commandResponse_ = commandResponse;
                } else {
                    singleFieldBuilderV3.setMessage(commandResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRotateNotification(RotateNotification rotateNotification) {
                SingleFieldBuilderV3<RotateNotification, RotateNotification.Builder, RotateNotificationOrBuilder> singleFieldBuilderV3 = this.rotateNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    rotateNotification.getClass();
                    this.rotateNotification_ = rotateNotification;
                } else {
                    singleFieldBuilderV3.setMessage(rotateNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setRotateRequest(RotateRequest rotateRequest) {
                SingleFieldBuilderV3<RotateRequest, RotateRequest.Builder, RotateRequestOrBuilder> singleFieldBuilderV3 = this.rotateRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    rotateRequest.getClass();
                    this.rotateRequest_ = rotateRequest;
                } else {
                    singleFieldBuilderV3.setMessage(rotateRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setRotateResponse(RotateResponse rotateResponse) {
                SingleFieldBuilderV3<RotateResponse, RotateResponse.Builder, RotateResponseOrBuilder> singleFieldBuilderV3 = this.rotateResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    rotateResponse.getClass();
                    this.rotateResponse_ = rotateResponse;
                } else {
                    singleFieldBuilderV3.setMessage(rotateResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStepRequest(StepRequest stepRequest) {
                SingleFieldBuilderV3<StepRequest, StepRequest.Builder, StepRequestOrBuilder> singleFieldBuilderV3 = this.stepRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stepRequest.getClass();
                    this.stepRequest_ = stepRequest;
                } else {
                    singleFieldBuilderV3.setMessage(stepRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStepResponse(StepResponse stepResponse) {
                SingleFieldBuilderV3<StepResponse, StepResponse.Builder, StepResponseOrBuilder> singleFieldBuilderV3 = this.stepResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stepResponse.getClass();
                    this.stepResponse_ = stepResponse;
                } else {
                    singleFieldBuilderV3.setMessage(stepResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HandCalibrationService) {
                    return mergeFrom((HandCalibrationService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HandCalibrationService handCalibrationService) {
                if (handCalibrationService == HandCalibrationService.getDefaultInstance()) {
                    return this;
                }
                if (handCalibrationService.hasCommandRequest()) {
                    mergeCommandRequest(handCalibrationService.getCommandRequest());
                }
                if (handCalibrationService.hasCommandResponse()) {
                    mergeCommandResponse(handCalibrationService.getCommandResponse());
                }
                if (handCalibrationService.hasStepRequest()) {
                    mergeStepRequest(handCalibrationService.getStepRequest());
                }
                if (handCalibrationService.hasStepResponse()) {
                    mergeStepResponse(handCalibrationService.getStepResponse());
                }
                if (handCalibrationService.hasRotateRequest()) {
                    mergeRotateRequest(handCalibrationService.getRotateRequest());
                }
                if (handCalibrationService.hasRotateResponse()) {
                    mergeRotateResponse(handCalibrationService.getRotateResponse());
                }
                if (handCalibrationService.hasRotateNotification()) {
                    mergeRotateNotification(handCalibrationService.getRotateNotification());
                }
                mergeUnknownFields(handCalibrationService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HandCalibrationService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ HandCalibrationService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private HandCalibrationService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HandCalibrationService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HandCalibrationService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HandCalibrationService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HandCalibrationService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HandCalibrationService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HandCalibrationService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HandCalibrationService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HandCalibrationService parseFrom(InputStream inputStream) {
            return (HandCalibrationService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HandCalibrationService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HandCalibrationService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HandCalibrationService parseFrom(CodedInputStream codedInputStream) {
            return (HandCalibrationService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HandCalibrationService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HandCalibrationService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RotateNotification extends GeneratedMessageV3 implements RotateNotificationOrBuilder {
        private static final RotateNotification DEFAULT_INSTANCE = new RotateNotification();

        @Deprecated
        public static final Parser<RotateNotification> PARSER = new AbstractParser<RotateNotification>() { // from class: com.garmin.proto.generated.GDIHandCalibration.RotateNotification.1
            @Override // com.google.protobuf.Parser
            public RotateNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RotateNotification.newBuilder();
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

        private RotateNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RotateNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateNotification_descriptor;
        }

        public static Builder newBuilder(RotateNotification rotateNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rotateNotification);
        }

        public static RotateNotification parseDelimitedFrom(InputStream inputStream) {
            return (RotateNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RotateNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RotateNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RotateNotification)) {
                return super.equals(obj);
            }
            RotateNotification rotateNotification = (RotateNotification) obj;
            if (hasStatus() != rotateNotification.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == rotateNotification.status_) && getUnknownFields().equals(rotateNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RotateNotification> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIHandCalibration.RotateNotificationOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.RotateNotificationOrBuilder
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
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(RotateNotification.class, Builder.class);
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
            return new RotateNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RotateNotificationOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(RotateNotification rotateNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    rotateNotification.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                rotateNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RotateNotification build() {
                RotateNotification rotateNotificationBuildPartial = buildPartial();
                if (rotateNotificationBuildPartial.isInitialized()) {
                    return rotateNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rotateNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RotateNotification buildPartial() {
                RotateNotification rotateNotification = new RotateNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(rotateNotification);
                }
                onBuilt();
                return rotateNotification;
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
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.RotateNotificationOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.RotateNotificationOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(RotateNotification.class, Builder.class);
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
            public RotateNotification getDefaultInstanceForType() {
                return RotateNotification.getDefaultInstance();
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
                if (message instanceof RotateNotification) {
                    return mergeFrom((RotateNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RotateNotification rotateNotification) {
                if (rotateNotification == RotateNotification.getDefaultInstance()) {
                    return this;
                }
                if (rotateNotification.hasStatus()) {
                    setStatus(rotateNotification.getStatus());
                }
                mergeUnknownFields(rotateNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RotateNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RotateNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RotateNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RotateNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ RotateNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RotateNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private RotateNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RotateNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RotateNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RotateNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RotateNotification parseFrom(InputStream inputStream) {
            return (RotateNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RotateNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RotateNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RotateNotification parseFrom(CodedInputStream codedInputStream) {
            return (RotateNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RotateNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RotateNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(1),
            ERROR(2);

            public static final int ERROR_VALUE = 2;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIHandCalibration.RotateNotification.Status.1
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
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return RotateNotification.getDescriptor().getEnumTypes().get(0);
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

    public static final class RotateResponse extends GeneratedMessageV3 implements RotateResponseOrBuilder {
        private static final RotateResponse DEFAULT_INSTANCE = new RotateResponse();

        @Deprecated
        public static final Parser<RotateResponse> PARSER = new AbstractParser<RotateResponse>() { // from class: com.garmin.proto.generated.GDIHandCalibration.RotateResponse.1
            @Override // com.google.protobuf.Parser
            public RotateResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RotateResponse.newBuilder();
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

        private RotateResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RotateResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateResponse_descriptor;
        }

        public static Builder newBuilder(RotateResponse rotateResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rotateResponse);
        }

        public static RotateResponse parseDelimitedFrom(InputStream inputStream) {
            return (RotateResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RotateResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RotateResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RotateResponse)) {
                return super.equals(obj);
            }
            RotateResponse rotateResponse = (RotateResponse) obj;
            if (hasStatus() != rotateResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == rotateResponse.status_) && getUnknownFields().equals(rotateResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RotateResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIHandCalibration.RotateResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.RotateResponseOrBuilder
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
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RotateResponse.class, Builder.class);
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
            return new RotateResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RotateResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(RotateResponse rotateResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    rotateResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                rotateResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RotateResponse build() {
                RotateResponse rotateResponseBuildPartial = buildPartial();
                if (rotateResponseBuildPartial.isInitialized()) {
                    return rotateResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rotateResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RotateResponse buildPartial() {
                RotateResponse rotateResponse = new RotateResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(rotateResponse);
                }
                onBuilt();
                return rotateResponse;
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
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.RotateResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.RotateResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_RotateResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RotateResponse.class, Builder.class);
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
            public RotateResponse getDefaultInstanceForType() {
                return RotateResponse.getDefaultInstance();
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
                if (message instanceof RotateResponse) {
                    return mergeFrom((RotateResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RotateResponse rotateResponse) {
                if (rotateResponse == RotateResponse.getDefaultInstance()) {
                    return this;
                }
                if (rotateResponse.hasStatus()) {
                    setStatus(rotateResponse.getStatus());
                }
                mergeUnknownFields(rotateResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RotateResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RotateResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RotateResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RotateResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ RotateResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RotateResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private RotateResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RotateResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RotateResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RotateResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RotateResponse parseFrom(InputStream inputStream) {
            return (RotateResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RotateResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RotateResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RotateResponse parseFrom(CodedInputStream codedInputStream) {
            return (RotateResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RotateResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RotateResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(1),
            ERROR(2);

            public static final int ERROR_VALUE = 2;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIHandCalibration.RotateResponse.Status.1
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
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return RotateResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class StepRequest extends GeneratedMessageV3 implements StepRequestOrBuilder {
        public static final int HAND_DIR_FIELD_NUMBER = 2;
        public static final int HAND_STEPS_FIELD_NUMBER = 3;
        public static final int HAND_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int handDir_;
        private int handSteps_;
        private int handType_;
        private byte memoizedIsInitialized;
        private static final StepRequest DEFAULT_INSTANCE = new StepRequest();

        @Deprecated
        public static final Parser<StepRequest> PARSER = new AbstractParser<StepRequest>() { // from class: com.garmin.proto.generated.GDIHandCalibration.StepRequest.1
            @Override // com.google.protobuf.Parser
            public StepRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StepRequest.newBuilder();
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

        private StepRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.handType_ = 1;
            this.handDir_ = 1;
            this.handSteps_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StepRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_StepRequest_descriptor;
        }

        public static Builder newBuilder(StepRequest stepRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stepRequest);
        }

        public static StepRequest parseDelimitedFrom(InputStream inputStream) {
            return (StepRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StepRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StepRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StepRequest)) {
                return super.equals(obj);
            }
            StepRequest stepRequest = (StepRequest) obj;
            if (hasHandType() != stepRequest.hasHandType()) {
                return false;
            }
            if ((hasHandType() && this.handType_ != stepRequest.handType_) || hasHandDir() != stepRequest.hasHandDir()) {
                return false;
            }
            if ((!hasHandDir() || this.handDir_ == stepRequest.handDir_) && hasHandSteps() == stepRequest.hasHandSteps()) {
                return (!hasHandSteps() || getHandSteps() == stepRequest.getHandSteps()) && getUnknownFields().equals(stepRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
        public HandDirection getHandDir() {
            HandDirection handDirectionForNumber = HandDirection.forNumber(this.handDir_);
            return handDirectionForNumber == null ? HandDirection.CLOCKWISE : handDirectionForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
        public int getHandSteps() {
            return this.handSteps_;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
        public HandType getHandType() {
            HandType handTypeForNumber = HandType.forNumber(this.handType_);
            return handTypeForNumber == null ? HandType.HOUR : handTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StepRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.handType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.handDir_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.handSteps_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
        public boolean hasHandDir() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
        public boolean hasHandSteps() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
        public boolean hasHandType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasHandType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.handType_;
            }
            if (hasHandDir()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.handDir_;
            }
            if (hasHandSteps()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getHandSteps();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_StepRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StepRequest.class, Builder.class);
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
            return new StepRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.handType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.handDir_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.handSteps_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StepRequestOrBuilder {
            private int bitField0_;
            private int handDir_;
            private int handSteps_;
            private int handType_;

            private Builder() {
                this.handType_ = 1;
                this.handDir_ = 1;
            }

            private void buildPartial0(StepRequest stepRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    stepRequest.handType_ = this.handType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    stepRequest.handDir_ = this.handDir_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    stepRequest.handSteps_ = this.handSteps_;
                    i14 |= 4;
                }
                stepRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_StepRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StepRequest build() {
                StepRequest stepRequestBuildPartial = buildPartial();
                if (stepRequestBuildPartial.isInitialized()) {
                    return stepRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stepRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StepRequest buildPartial() {
                StepRequest stepRequest = new StepRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stepRequest);
                }
                onBuilt();
                return stepRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.handType_ = 1;
                this.handDir_ = 1;
                this.handSteps_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHandDir() {
                this.bitField0_ &= -3;
                this.handDir_ = 1;
                onChanged();
                return this;
            }

            public Builder clearHandSteps() {
                this.bitField0_ &= -5;
                this.handSteps_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHandType() {
                this.bitField0_ &= -2;
                this.handType_ = 1;
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
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_StepRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
            public HandDirection getHandDir() {
                HandDirection handDirectionForNumber = HandDirection.forNumber(this.handDir_);
                return handDirectionForNumber == null ? HandDirection.CLOCKWISE : handDirectionForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
            public int getHandSteps() {
                return this.handSteps_;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
            public HandType getHandType() {
                HandType handTypeForNumber = HandType.forNumber(this.handType_);
                return handTypeForNumber == null ? HandType.HOUR : handTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
            public boolean hasHandDir() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
            public boolean hasHandSteps() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.StepRequestOrBuilder
            public boolean hasHandType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_StepRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StepRequest.class, Builder.class);
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
                                    if (HandType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.handType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (HandDirection.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.handDir_ = i15;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    this.handSteps_ = codedInputStream.readUInt32();
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

            public Builder setHandDir(HandDirection handDirection) {
                handDirection.getClass();
                this.bitField0_ |= 2;
                this.handDir_ = handDirection.getNumber();
                onChanged();
                return this;
            }

            public Builder setHandSteps(int i14) {
                this.handSteps_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setHandType(HandType handType) {
                handType.getClass();
                this.bitField0_ |= 1;
                this.handType_ = handType.getNumber();
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
            public StepRequest getDefaultInstanceForType() {
                return StepRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.handType_ = 1;
                this.handDir_ = 1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StepRequest) {
                    return mergeFrom((StepRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StepRequest stepRequest) {
                if (stepRequest == StepRequest.getDefaultInstance()) {
                    return this;
                }
                if (stepRequest.hasHandType()) {
                    setHandType(stepRequest.getHandType());
                }
                if (stepRequest.hasHandDir()) {
                    setHandDir(stepRequest.getHandDir());
                }
                if (stepRequest.hasHandSteps()) {
                    setHandSteps(stepRequest.getHandSteps());
                }
                mergeUnknownFields(stepRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StepRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StepRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StepRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StepRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StepRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StepRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StepRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StepRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StepRequest parseFrom(InputStream inputStream) {
            return (StepRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ StepRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StepRequest() {
            this.handSteps_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.handType_ = 1;
            this.handDir_ = 1;
        }

        public static StepRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StepRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StepRequest parseFrom(CodedInputStream codedInputStream) {
            return (StepRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StepRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StepRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StepResponse extends GeneratedMessageV3 implements StepResponseOrBuilder {
        private static final StepResponse DEFAULT_INSTANCE = new StepResponse();

        @Deprecated
        public static final Parser<StepResponse> PARSER = new AbstractParser<StepResponse>() { // from class: com.garmin.proto.generated.GDIHandCalibration.StepResponse.1
            @Override // com.google.protobuf.Parser
            public StepResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StepResponse.newBuilder();
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

        private StepResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StepResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_StepResponse_descriptor;
        }

        public static Builder newBuilder(StepResponse stepResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stepResponse);
        }

        public static StepResponse parseDelimitedFrom(InputStream inputStream) {
            return (StepResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StepResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StepResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StepResponse)) {
                return super.equals(obj);
            }
            StepResponse stepResponse = (StepResponse) obj;
            if (hasStatus() != stepResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == stepResponse.status_) && getUnknownFields().equals(stepResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StepResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIHandCalibration.StepResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHandCalibration.StepResponseOrBuilder
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
            return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_StepResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StepResponse.class, Builder.class);
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
            return new StepResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StepResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(StepResponse stepResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stepResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                stepResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_StepResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StepResponse build() {
                StepResponse stepResponseBuildPartial = buildPartial();
                if (stepResponseBuildPartial.isInitialized()) {
                    return stepResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stepResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StepResponse buildPartial() {
                StepResponse stepResponse = new StepResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stepResponse);
                }
                onBuilt();
                return stepResponse;
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
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_StepResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.StepResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHandCalibration.StepResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHandCalibration.internal_static_GDI_Proto_HandCalibration_StepResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StepResponse.class, Builder.class);
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
            public StepResponse getDefaultInstanceForType() {
                return StepResponse.getDefaultInstance();
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
                if (message instanceof StepResponse) {
                    return mergeFrom((StepResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StepResponse stepResponse) {
                if (stepResponse == StepResponse.getDefaultInstance()) {
                    return this;
                }
                if (stepResponse.hasStatus()) {
                    setStatus(stepResponse.getStatus());
                }
                mergeUnknownFields(stepResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StepResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StepResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StepResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StepResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StepResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StepResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StepResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StepResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StepResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StepResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StepResponse parseFrom(InputStream inputStream) {
            return (StepResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StepResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StepResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StepResponse parseFrom(CodedInputStream codedInputStream) {
            return (StepResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StepResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StepResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(1),
            ERROR(2);

            public static final int ERROR_VALUE = 2;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIHandCalibration.StepResponse.Status.1
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
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StepResponse.getDescriptor().getEnumTypes().get(0);
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

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum HandDirection implements ProtocolMessageEnum {
        CLOCKWISE(1),
        COUNTERCLOCKWISE(2);

        public static final int CLOCKWISE_VALUE = 1;
        public static final int COUNTERCLOCKWISE_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<HandDirection> internalValueMap = new Internal.EnumLiteMap<HandDirection>() { // from class: com.garmin.proto.generated.GDIHandCalibration.HandDirection.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public HandDirection findValueByNumber(int i14) {
                return HandDirection.forNumber(i14);
            }
        };
        private static final HandDirection[] VALUES = values();

        HandDirection(int i14) {
            this.value = i14;
        }

        public static HandDirection forNumber(int i14) {
            if (i14 == 1) {
                return CLOCKWISE;
            }
            if (i14 != 2) {
                return null;
            }
            return COUNTERCLOCKWISE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIHandCalibration.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<HandDirection> internalGetValueMap() {
            return internalValueMap;
        }

        public static HandDirection valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static HandDirection valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum HandType implements ProtocolMessageEnum {
        HOUR(1),
        MINUTE(2),
        SECOND(3);

        public static final int HOUR_VALUE = 1;
        public static final int MINUTE_VALUE = 2;
        public static final int SECOND_VALUE = 3;
        private final int value;
        private static final Internal.EnumLiteMap<HandType> internalValueMap = new Internal.EnumLiteMap<HandType>() { // from class: com.garmin.proto.generated.GDIHandCalibration.HandType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public HandType findValueByNumber(int i14) {
                return HandType.forNumber(i14);
            }
        };
        private static final HandType[] VALUES = values();

        HandType(int i14) {
            this.value = i14;
        }

        public static HandType forNumber(int i14) {
            if (i14 == 1) {
                return HOUR;
            }
            if (i14 == 2) {
                return MINUTE;
            }
            if (i14 != 3) {
                return null;
            }
            return SECOND;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIHandCalibration.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<HandType> internalGetValueMap() {
            return internalValueMap;
        }

        public static HandType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static HandType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
