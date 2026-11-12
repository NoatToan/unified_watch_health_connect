package com.garmin.proto.generated;

import com.google.common.net.HttpHeaders;
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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class GDIBluetoothClassic {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019GDIBluetoothClassic.proto\u0012\u001aGDI.Proto.BluetoothClassic\u001a\u0015GDIEventSharing.proto\"õ\u0001\n\u0011ProfileConnection\u0012F\n\u0007profile\u0018\u0001 \u0001(\u000e25.GDI.Proto.BluetoothClassic.ProfileConnection.Profile\u0012B\n\u0005state\u0018\u0002 \u0001(\u000e23.GDI.Proto.BluetoothClassic.ProfileConnection.State\"*\n\u0007Profile\u0012\u0007\n\u0003HFP\u0010\u0000\u0012\r\n\tA2DP_SINK\u0010\u0001\u0012\u0007\n\u0003SPP\u0010\u0002\"(\n\u0005State\u0012\r\n\tCONNECTED\u0010\u0000\u0012\u0010\n\fDISCONNECTED\u0010\u0001\"æ\u0001\n\tHandsfree\u0012:\n\u0005state\u0018\u0001 \u0001(\u000e2+.GDI.Proto.BluetoothClassic.Handsfree.State\"\u009c\u0001\n\u0005State\u0012\"\n\u001eHFP_VOICE_RECOGNITION_STARTING\u0010\u0000\u0012!\n\u001dHFP_VOICE_RECOGNITION_STARTED\u0010\u0001\u0012!\n\u001dHFP_VOICE_RECOGNITION_STOPPED\u0010\u0002\u0012)\n%HFP_VOICE_RECOGNITION_FAILED_TO_START\u0010\u0003\"\u0094\u0002\n\u000bStateChange\u0012\u001d\n\u0015connection_identifier\u0018\u0001 \u0001(\f\u0012A\n\nconnection\u0018\u0002 \u0001(\u000b2-.GDI.Proto.BluetoothClassic.ProfileConnection\u00128\n\thandsfree\u0018\u0003 \u0001(\u000b2%.GDI.Proto.BluetoothClassic.Handsfree2i\n\fstate_change\u0012).GDI.Proto.EventSharing.AlertNotification\u0018í\u0007 \u0001(\u000b2'.GDI.Proto.BluetoothClassic.StateChangeB3\n\u001acom.garmin.proto.generatedB\u0013GDIBluetoothClassicH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BluetoothClassic_Handsfree_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BluetoothClassic_Handsfree_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BluetoothClassic_ProfileConnection_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BluetoothClassic_ProfileConnection_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BluetoothClassic_StateChange_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BluetoothClassic_StateChange_fieldAccessorTable;

    public interface HandsfreeOrBuilder extends MessageOrBuilder {
        Handsfree.State getState();

        boolean hasState();
    }

    public interface ProfileConnectionOrBuilder extends MessageOrBuilder {
        ProfileConnection.Profile getProfile();

        ProfileConnection.State getState();

        boolean hasProfile();

        boolean hasState();
    }

    public interface StateChangeOrBuilder extends MessageOrBuilder {
        ProfileConnection getConnection();

        ByteString getConnectionIdentifier();

        ProfileConnectionOrBuilder getConnectionOrBuilder();

        Handsfree getHandsfree();

        HandsfreeOrBuilder getHandsfreeOrBuilder();

        boolean hasConnection();

        boolean hasConnectionIdentifier();

        boolean hasHandsfree();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_BluetoothClassic_ProfileConnection_descriptor = descriptor2;
        internal_static_GDI_Proto_BluetoothClassic_ProfileConnection_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Profile", "State"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_BluetoothClassic_Handsfree_descriptor = descriptor3;
        internal_static_GDI_Proto_BluetoothClassic_Handsfree_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"State"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_BluetoothClassic_StateChange_descriptor = descriptor4;
        internal_static_GDI_Proto_BluetoothClassic_StateChange_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"ConnectionIdentifier", HttpHeaders.CONNECTION, "Handsfree"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDIBluetoothClassic() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(StateChange.stateChange);
    }

    public static final class Handsfree extends GeneratedMessageV3 implements HandsfreeOrBuilder {
        private static final Handsfree DEFAULT_INSTANCE = new Handsfree();

        @Deprecated
        public static final Parser<Handsfree> PARSER = new AbstractParser<Handsfree>() { // from class: com.garmin.proto.generated.GDIBluetoothClassic.Handsfree.1
            @Override // com.google.protobuf.Parser
            public Handsfree parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Handsfree.newBuilder();
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
        public static final int STATE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int state_;

        private Handsfree(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.state_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Handsfree getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_Handsfree_descriptor;
        }

        public static Builder newBuilder(Handsfree handsfree) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(handsfree);
        }

        public static Handsfree parseDelimitedFrom(InputStream inputStream) {
            return (Handsfree) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Handsfree parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Handsfree> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Handsfree)) {
                return super.equals(obj);
            }
            Handsfree handsfree = (Handsfree) obj;
            if (hasState() != handsfree.hasState()) {
                return false;
            }
            return (!hasState() || this.state_ == handsfree.state_) && getUnknownFields().equals(handsfree.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Handsfree> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.state_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.HandsfreeOrBuilder
        public State getState() {
            State stateForNumber = State.forNumber(this.state_);
            return stateForNumber == null ? State.HFP_VOICE_RECOGNITION_STARTING : stateForNumber;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.HandsfreeOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasState()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.state_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_Handsfree_fieldAccessorTable.ensureFieldAccessorsInitialized(Handsfree.class, Builder.class);
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
            return new Handsfree();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.state_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HandsfreeOrBuilder {
            private int bitField0_;
            private int state_;

            private Builder() {
                this.state_ = 0;
            }

            private void buildPartial0(Handsfree handsfree) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    handsfree.state_ = this.state_;
                } else {
                    i14 = 0;
                }
                handsfree.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_Handsfree_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Handsfree build() {
                Handsfree handsfreeBuildPartial = buildPartial();
                if (handsfreeBuildPartial.isInitialized()) {
                    return handsfreeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) handsfreeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Handsfree buildPartial() {
                Handsfree handsfree = new Handsfree(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(handsfree);
                }
                onBuilt();
                return handsfree;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = 0;
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

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = 0;
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
                return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_Handsfree_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.HandsfreeOrBuilder
            public State getState() {
                State stateForNumber = State.forNumber(this.state_);
                return stateForNumber == null ? State.HFP_VOICE_RECOGNITION_STARTING : stateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.HandsfreeOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_Handsfree_fieldAccessorTable.ensureFieldAccessorsInitialized(Handsfree.class, Builder.class);
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
                                    if (State.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.state_ = i14;
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

            public Builder setState(State state) {
                state.getClass();
                this.bitField0_ |= 1;
                this.state_ = state.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Handsfree getDefaultInstanceForType() {
                return Handsfree.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.state_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Handsfree) {
                    return mergeFrom((Handsfree) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Handsfree handsfree) {
                if (handsfree == Handsfree.getDefaultInstance()) {
                    return this;
                }
                if (handsfree.hasState()) {
                    setState(handsfree.getState());
                }
                mergeUnknownFields(handsfree.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Handsfree getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Handsfree parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Handsfree) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Handsfree parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ Handsfree(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Handsfree parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private Handsfree() {
            this.memoizedIsInitialized = (byte) -1;
            this.state_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Handsfree parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Handsfree parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Handsfree parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Handsfree parseFrom(InputStream inputStream) {
            return (Handsfree) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Handsfree parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Handsfree) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Handsfree parseFrom(CodedInputStream codedInputStream) {
            return (Handsfree) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Handsfree parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Handsfree) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum State implements ProtocolMessageEnum {
            HFP_VOICE_RECOGNITION_STARTING(0),
            HFP_VOICE_RECOGNITION_STARTED(1),
            HFP_VOICE_RECOGNITION_STOPPED(2),
            HFP_VOICE_RECOGNITION_FAILED_TO_START(3);

            public static final int HFP_VOICE_RECOGNITION_FAILED_TO_START_VALUE = 3;
            public static final int HFP_VOICE_RECOGNITION_STARTED_VALUE = 1;
            public static final int HFP_VOICE_RECOGNITION_STARTING_VALUE = 0;
            public static final int HFP_VOICE_RECOGNITION_STOPPED_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<State> internalValueMap = new Internal.EnumLiteMap<State>() { // from class: com.garmin.proto.generated.GDIBluetoothClassic.Handsfree.State.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public State findValueByNumber(int i14) {
                    return State.forNumber(i14);
                }
            };
            private static final State[] VALUES = values();

            State(int i14) {
                this.value = i14;
            }

            public static State forNumber(int i14) {
                if (i14 == 0) {
                    return HFP_VOICE_RECOGNITION_STARTING;
                }
                if (i14 == 1) {
                    return HFP_VOICE_RECOGNITION_STARTED;
                }
                if (i14 == 2) {
                    return HFP_VOICE_RECOGNITION_STOPPED;
                }
                if (i14 != 3) {
                    return null;
                }
                return HFP_VOICE_RECOGNITION_FAILED_TO_START;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Handsfree.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<State> internalGetValueMap() {
                return internalValueMap;
            }

            public static State valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static State valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ProfileConnection extends GeneratedMessageV3 implements ProfileConnectionOrBuilder {
        private static final ProfileConnection DEFAULT_INSTANCE = new ProfileConnection();

        @Deprecated
        public static final Parser<ProfileConnection> PARSER = new AbstractParser<ProfileConnection>() { // from class: com.garmin.proto.generated.GDIBluetoothClassic.ProfileConnection.1
            @Override // com.google.protobuf.Parser
            public ProfileConnection parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ProfileConnection.newBuilder();
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
        public static final int PROFILE_FIELD_NUMBER = 1;
        public static final int STATE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int profile_;
        private int state_;

        private ProfileConnection(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.profile_ = 0;
            this.state_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ProfileConnection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_ProfileConnection_descriptor;
        }

        public static Builder newBuilder(ProfileConnection profileConnection) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(profileConnection);
        }

        public static ProfileConnection parseDelimitedFrom(InputStream inputStream) {
            return (ProfileConnection) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ProfileConnection parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ProfileConnection> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProfileConnection)) {
                return super.equals(obj);
            }
            ProfileConnection profileConnection = (ProfileConnection) obj;
            if (hasProfile() != profileConnection.hasProfile()) {
                return false;
            }
            if ((!hasProfile() || this.profile_ == profileConnection.profile_) && hasState() == profileConnection.hasState()) {
                return (!hasState() || this.state_ == profileConnection.state_) && getUnknownFields().equals(profileConnection.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ProfileConnection> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.ProfileConnectionOrBuilder
        public Profile getProfile() {
            Profile profileForNumber = Profile.forNumber(this.profile_);
            return profileForNumber == null ? Profile.HFP : profileForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.profile_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.state_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.ProfileConnectionOrBuilder
        public State getState() {
            State stateForNumber = State.forNumber(this.state_);
            return stateForNumber == null ? State.CONNECTED : stateForNumber;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.ProfileConnectionOrBuilder
        public boolean hasProfile() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.ProfileConnectionOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasProfile()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.profile_;
            }
            if (hasState()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.state_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_ProfileConnection_fieldAccessorTable.ensureFieldAccessorsInitialized(ProfileConnection.class, Builder.class);
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
            return new ProfileConnection();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.profile_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.state_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ProfileConnectionOrBuilder {
            private int bitField0_;
            private int profile_;
            private int state_;

            private Builder() {
                this.profile_ = 0;
                this.state_ = 0;
            }

            private void buildPartial0(ProfileConnection profileConnection) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    profileConnection.profile_ = this.profile_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    profileConnection.state_ = this.state_;
                    i14 |= 2;
                }
                profileConnection.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_ProfileConnection_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ProfileConnection build() {
                ProfileConnection profileConnectionBuildPartial = buildPartial();
                if (profileConnectionBuildPartial.isInitialized()) {
                    return profileConnectionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) profileConnectionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ProfileConnection buildPartial() {
                ProfileConnection profileConnection = new ProfileConnection(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(profileConnection);
                }
                onBuilt();
                return profileConnection;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.profile_ = 0;
                this.state_ = 0;
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

            public Builder clearProfile() {
                this.bitField0_ &= -2;
                this.profile_ = 0;
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= -3;
                this.state_ = 0;
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
                return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_ProfileConnection_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.ProfileConnectionOrBuilder
            public Profile getProfile() {
                Profile profileForNumber = Profile.forNumber(this.profile_);
                return profileForNumber == null ? Profile.HFP : profileForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.ProfileConnectionOrBuilder
            public State getState() {
                State stateForNumber = State.forNumber(this.state_);
                return stateForNumber == null ? State.CONNECTED : stateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.ProfileConnectionOrBuilder
            public boolean hasProfile() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.ProfileConnectionOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_ProfileConnection_fieldAccessorTable.ensureFieldAccessorsInitialized(ProfileConnection.class, Builder.class);
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
                                    if (Profile.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.profile_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (State.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.state_ = i15;
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

            public Builder setProfile(Profile profile) {
                profile.getClass();
                this.bitField0_ |= 1;
                this.profile_ = profile.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setState(State state) {
                state.getClass();
                this.bitField0_ |= 2;
                this.state_ = state.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ProfileConnection getDefaultInstanceForType() {
                return ProfileConnection.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.profile_ = 0;
                this.state_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ProfileConnection) {
                    return mergeFrom((ProfileConnection) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ProfileConnection profileConnection) {
                if (profileConnection == ProfileConnection.getDefaultInstance()) {
                    return this;
                }
                if (profileConnection.hasProfile()) {
                    setProfile(profileConnection.getProfile());
                }
                if (profileConnection.hasState()) {
                    setState(profileConnection.getState());
                }
                mergeUnknownFields(profileConnection.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ProfileConnection getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ProfileConnection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProfileConnection) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ProfileConnection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ProfileConnection parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ProfileConnection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ProfileConnection(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ProfileConnection parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ProfileConnection() {
            this.memoizedIsInitialized = (byte) -1;
            this.profile_ = 0;
            this.state_ = 0;
        }

        public static ProfileConnection parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ProfileConnection parseFrom(InputStream inputStream) {
            return (ProfileConnection) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ProfileConnection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProfileConnection) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ProfileConnection parseFrom(CodedInputStream codedInputStream) {
            return (ProfileConnection) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ProfileConnection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ProfileConnection) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Profile implements ProtocolMessageEnum {
            HFP(0),
            A2DP_SINK(1),
            SPP(2);

            public static final int A2DP_SINK_VALUE = 1;
            public static final int HFP_VALUE = 0;
            public static final int SPP_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Profile> internalValueMap = new Internal.EnumLiteMap<Profile>() { // from class: com.garmin.proto.generated.GDIBluetoothClassic.ProfileConnection.Profile.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Profile findValueByNumber(int i14) {
                    return Profile.forNumber(i14);
                }
            };
            private static final Profile[] VALUES = values();

            Profile(int i14) {
                this.value = i14;
            }

            public static Profile forNumber(int i14) {
                if (i14 == 0) {
                    return HFP;
                }
                if (i14 == 1) {
                    return A2DP_SINK;
                }
                if (i14 != 2) {
                    return null;
                }
                return SPP;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ProfileConnection.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Profile> internalGetValueMap() {
                return internalValueMap;
            }

            public static Profile valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Profile valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum State implements ProtocolMessageEnum {
            CONNECTED(0),
            DISCONNECTED(1);

            public static final int CONNECTED_VALUE = 0;
            public static final int DISCONNECTED_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<State> internalValueMap = new Internal.EnumLiteMap<State>() { // from class: com.garmin.proto.generated.GDIBluetoothClassic.ProfileConnection.State.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public State findValueByNumber(int i14) {
                    return State.forNumber(i14);
                }
            };
            private static final State[] VALUES = values();

            State(int i14) {
                this.value = i14;
            }

            public static State forNumber(int i14) {
                if (i14 == 0) {
                    return CONNECTED;
                }
                if (i14 != 1) {
                    return null;
                }
                return DISCONNECTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ProfileConnection.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<State> internalGetValueMap() {
                return internalValueMap;
            }

            public static State valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static State valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class StateChange extends GeneratedMessageV3 implements StateChangeOrBuilder {
        public static final int CONNECTION_FIELD_NUMBER = 2;
        public static final int CONNECTION_IDENTIFIER_FIELD_NUMBER = 1;
        public static final int HANDSFREE_FIELD_NUMBER = 3;
        public static final int STATE_CHANGE_FIELD_NUMBER = 1005;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString connectionIdentifier_;
        private ProfileConnection connection_;
        private Handsfree handsfree_;
        private byte memoizedIsInitialized;
        private static final StateChange DEFAULT_INSTANCE = new StateChange();

        @Deprecated
        public static final Parser<StateChange> PARSER = new AbstractParser<StateChange>() { // from class: com.garmin.proto.generated.GDIBluetoothClassic.StateChange.1
            @Override // com.google.protobuf.Parser
            public StateChange parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StateChange.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, StateChange> stateChange = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, StateChange.class, getDefaultInstance());

        private StateChange(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.connectionIdentifier_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StateChange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_StateChange_descriptor;
        }

        public static Builder newBuilder(StateChange stateChange2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stateChange2);
        }

        public static StateChange parseDelimitedFrom(InputStream inputStream) {
            return (StateChange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StateChange parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StateChange> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StateChange)) {
                return super.equals(obj);
            }
            StateChange stateChange2 = (StateChange) obj;
            if (hasConnectionIdentifier() != stateChange2.hasConnectionIdentifier()) {
                return false;
            }
            if ((hasConnectionIdentifier() && !getConnectionIdentifier().equals(stateChange2.getConnectionIdentifier())) || hasConnection() != stateChange2.hasConnection()) {
                return false;
            }
            if ((!hasConnection() || getConnection().equals(stateChange2.getConnection())) && hasHandsfree() == stateChange2.hasHandsfree()) {
                return (!hasHandsfree() || getHandsfree().equals(stateChange2.getHandsfree())) && getUnknownFields().equals(stateChange2.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
        public ProfileConnection getConnection() {
            ProfileConnection profileConnection = this.connection_;
            return profileConnection == null ? ProfileConnection.getDefaultInstance() : profileConnection;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
        public ByteString getConnectionIdentifier() {
            return this.connectionIdentifier_;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
        public ProfileConnectionOrBuilder getConnectionOrBuilder() {
            ProfileConnection profileConnection = this.connection_;
            return profileConnection == null ? ProfileConnection.getDefaultInstance() : profileConnection;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
        public Handsfree getHandsfree() {
            Handsfree handsfree = this.handsfree_;
            return handsfree == null ? Handsfree.getDefaultInstance() : handsfree;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
        public HandsfreeOrBuilder getHandsfreeOrBuilder() {
            Handsfree handsfree = this.handsfree_;
            return handsfree == null ? Handsfree.getDefaultInstance() : handsfree;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StateChange> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.connectionIdentifier_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeMessageSize(2, getConnection());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBytesSize += CodedOutputStream.computeMessageSize(3, getHandsfree());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
        public boolean hasConnection() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
        public boolean hasConnectionIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
        public boolean hasHandsfree() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConnectionIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConnectionIdentifier().hashCode();
            }
            if (hasConnection()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConnection().hashCode();
            }
            if (hasHandsfree()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getHandsfree().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_StateChange_fieldAccessorTable.ensureFieldAccessorsInitialized(StateChange.class, Builder.class);
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
            return new StateChange();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.connectionIdentifier_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConnection());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getHandsfree());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StateChangeOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ProfileConnection, ProfileConnection.Builder, ProfileConnectionOrBuilder> connectionBuilder_;
            private ByteString connectionIdentifier_;
            private ProfileConnection connection_;
            private SingleFieldBuilderV3<Handsfree, Handsfree.Builder, HandsfreeOrBuilder> handsfreeBuilder_;
            private Handsfree handsfree_;

            private Builder() {
                this.connectionIdentifier_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(StateChange stateChange) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    stateChange.connectionIdentifier_ = this.connectionIdentifier_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ProfileConnection, ProfileConnection.Builder, ProfileConnectionOrBuilder> singleFieldBuilderV3 = this.connectionBuilder_;
                    stateChange.connection_ = singleFieldBuilderV3 == null ? this.connection_ : (ProfileConnection) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<Handsfree, Handsfree.Builder, HandsfreeOrBuilder> singleFieldBuilderV4 = this.handsfreeBuilder_;
                    stateChange.handsfree_ = singleFieldBuilderV4 == null ? this.handsfree_ : (Handsfree) singleFieldBuilderV4.build();
                    i14 |= 4;
                }
                stateChange.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ProfileConnection, ProfileConnection.Builder, ProfileConnectionOrBuilder> getConnectionFieldBuilder() {
                if (this.connectionBuilder_ == null) {
                    this.connectionBuilder_ = new SingleFieldBuilderV3<>(getConnection(), getParentForChildren(), isClean());
                    this.connection_ = null;
                }
                return this.connectionBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_StateChange_descriptor;
            }

            private SingleFieldBuilderV3<Handsfree, Handsfree.Builder, HandsfreeOrBuilder> getHandsfreeFieldBuilder() {
                if (this.handsfreeBuilder_ == null) {
                    this.handsfreeBuilder_ = new SingleFieldBuilderV3<>(getHandsfree(), getParentForChildren(), isClean());
                    this.handsfree_ = null;
                }
                return this.handsfreeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConnectionFieldBuilder();
                    getHandsfreeFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StateChange build() {
                StateChange stateChangeBuildPartial = buildPartial();
                if (stateChangeBuildPartial.isInitialized()) {
                    return stateChangeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stateChangeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StateChange buildPartial() {
                StateChange stateChange = new StateChange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stateChange);
                }
                onBuilt();
                return stateChange;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.connectionIdentifier_ = ByteString.EMPTY;
                this.connection_ = null;
                SingleFieldBuilderV3<ProfileConnection, ProfileConnection.Builder, ProfileConnectionOrBuilder> singleFieldBuilderV3 = this.connectionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionBuilder_ = null;
                }
                this.handsfree_ = null;
                SingleFieldBuilderV3<Handsfree, Handsfree.Builder, HandsfreeOrBuilder> singleFieldBuilderV4 = this.handsfreeBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.handsfreeBuilder_ = null;
                }
                return this;
            }

            public Builder clearConnection() {
                this.bitField0_ &= -3;
                this.connection_ = null;
                SingleFieldBuilderV3<ProfileConnection, ProfileConnection.Builder, ProfileConnectionOrBuilder> singleFieldBuilderV3 = this.connectionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectionIdentifier() {
                this.bitField0_ &= -2;
                this.connectionIdentifier_ = StateChange.getDefaultInstance().getConnectionIdentifier();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHandsfree() {
                this.bitField0_ &= -5;
                this.handsfree_ = null;
                SingleFieldBuilderV3<Handsfree, Handsfree.Builder, HandsfreeOrBuilder> singleFieldBuilderV3 = this.handsfreeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.handsfreeBuilder_ = null;
                }
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

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
            public ProfileConnection getConnection() {
                SingleFieldBuilderV3<ProfileConnection, ProfileConnection.Builder, ProfileConnectionOrBuilder> singleFieldBuilderV3 = this.connectionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ProfileConnection) singleFieldBuilderV3.getMessage();
                }
                ProfileConnection profileConnection = this.connection_;
                return profileConnection == null ? ProfileConnection.getDefaultInstance() : profileConnection;
            }

            public ProfileConnection.Builder getConnectionBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ProfileConnection.Builder) getConnectionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
            public ByteString getConnectionIdentifier() {
                return this.connectionIdentifier_;
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
            public ProfileConnectionOrBuilder getConnectionOrBuilder() {
                SingleFieldBuilderV3<ProfileConnection, ProfileConnection.Builder, ProfileConnectionOrBuilder> singleFieldBuilderV3 = this.connectionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ProfileConnectionOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ProfileConnection profileConnection = this.connection_;
                return profileConnection == null ? ProfileConnection.getDefaultInstance() : profileConnection;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_StateChange_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
            public Handsfree getHandsfree() {
                SingleFieldBuilderV3<Handsfree, Handsfree.Builder, HandsfreeOrBuilder> singleFieldBuilderV3 = this.handsfreeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Handsfree) singleFieldBuilderV3.getMessage();
                }
                Handsfree handsfree = this.handsfree_;
                return handsfree == null ? Handsfree.getDefaultInstance() : handsfree;
            }

            public Handsfree.Builder getHandsfreeBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (Handsfree.Builder) getHandsfreeFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
            public HandsfreeOrBuilder getHandsfreeOrBuilder() {
                SingleFieldBuilderV3<Handsfree, Handsfree.Builder, HandsfreeOrBuilder> singleFieldBuilderV3 = this.handsfreeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HandsfreeOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Handsfree handsfree = this.handsfree_;
                return handsfree == null ? Handsfree.getDefaultInstance() : handsfree;
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
            public boolean hasConnection() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
            public boolean hasConnectionIdentifier() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBluetoothClassic.StateChangeOrBuilder
            public boolean hasHandsfree() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBluetoothClassic.internal_static_GDI_Proto_BluetoothClassic_StateChange_fieldAccessorTable.ensureFieldAccessorsInitialized(StateChange.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConnection(ProfileConnection profileConnection) {
                ProfileConnection profileConnection2;
                SingleFieldBuilderV3<ProfileConnection, ProfileConnection.Builder, ProfileConnectionOrBuilder> singleFieldBuilderV3 = this.connectionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(profileConnection);
                } else if ((this.bitField0_ & 2) == 0 || (profileConnection2 = this.connection_) == null || profileConnection2 == ProfileConnection.getDefaultInstance()) {
                    this.connection_ = profileConnection;
                } else {
                    getConnectionBuilder().mergeFrom(profileConnection);
                }
                if (this.connection_ != null) {
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
                                    this.connectionIdentifier_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConnectionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getHandsfreeFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeHandsfree(Handsfree handsfree) {
                Handsfree handsfree2;
                SingleFieldBuilderV3<Handsfree, Handsfree.Builder, HandsfreeOrBuilder> singleFieldBuilderV3 = this.handsfreeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(handsfree);
                } else if ((this.bitField0_ & 4) == 0 || (handsfree2 = this.handsfree_) == null || handsfree2 == Handsfree.getDefaultInstance()) {
                    this.handsfree_ = handsfree;
                } else {
                    getHandsfreeBuilder().mergeFrom(handsfree);
                }
                if (this.handsfree_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setConnection(ProfileConnection.Builder builder) {
                SingleFieldBuilderV3<ProfileConnection, ProfileConnection.Builder, ProfileConnectionOrBuilder> singleFieldBuilderV3 = this.connectionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connection_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setConnectionIdentifier(ByteString byteString) {
                byteString.getClass();
                this.connectionIdentifier_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHandsfree(Handsfree.Builder builder) {
                SingleFieldBuilderV3<Handsfree, Handsfree.Builder, HandsfreeOrBuilder> singleFieldBuilderV3 = this.handsfreeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.handsfree_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StateChange getDefaultInstanceForType() {
                return StateChange.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.connectionIdentifier_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            public Builder setConnection(ProfileConnection profileConnection) {
                SingleFieldBuilderV3<ProfileConnection, ProfileConnection.Builder, ProfileConnectionOrBuilder> singleFieldBuilderV3 = this.connectionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    profileConnection.getClass();
                    this.connection_ = profileConnection;
                } else {
                    singleFieldBuilderV3.setMessage(profileConnection);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setHandsfree(Handsfree handsfree) {
                SingleFieldBuilderV3<Handsfree, Handsfree.Builder, HandsfreeOrBuilder> singleFieldBuilderV3 = this.handsfreeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    handsfree.getClass();
                    this.handsfree_ = handsfree;
                } else {
                    singleFieldBuilderV3.setMessage(handsfree);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StateChange) {
                    return mergeFrom((StateChange) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StateChange stateChange) {
                if (stateChange == StateChange.getDefaultInstance()) {
                    return this;
                }
                if (stateChange.hasConnectionIdentifier()) {
                    setConnectionIdentifier(stateChange.getConnectionIdentifier());
                }
                if (stateChange.hasConnection()) {
                    mergeConnection(stateChange.getConnection());
                }
                if (stateChange.hasHandsfree()) {
                    mergeHandsfree(stateChange.getHandsfree());
                }
                mergeUnknownFields(stateChange.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StateChange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StateChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateChange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StateChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StateChange parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ StateChange(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StateChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private StateChange() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.connectionIdentifier_ = byteString;
        }

        public static StateChange parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StateChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StateChange parseFrom(InputStream inputStream) {
            return (StateChange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StateChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateChange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StateChange parseFrom(CodedInputStream codedInputStream) {
            return (StateChange) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StateChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateChange) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
