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

/* JADX INFO: loaded from: classes6.dex */
public final class GDISDCard {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fGDISDCard.proto\u0012\u0010GDI.Proto.SDCard\u001a\rGDICore.proto\"¤\u0004\n\u0007Service\u0012@\n\u0011sd_format_request\u0018\u0001 \u0001(\u000b2%.GDI.Proto.SDCard.SDCardFormatRequest\u0012B\n\u0012sd_format_response\u0018\u0002 \u0001(\u000b2&.GDI.Proto.SDCard.SDCardFormatResponse\u0012J\n\u0016sd_format_notification\u0018\u0003 \u0001(\u000b2*.GDI.Proto.SDCard.SDCardFormatNotification\u0012H\n\u0015sd_error_notification\u0018\u0004 \u0001(\u000b2).GDI.Proto.SDCard.SDCardErrorNotification\u0012O\n\u0019sd_time_remaining_request\u0018\u0005 \u0001(\u000b2,.GDI.Proto.SDCard.SDCardTimeRemainingRequest\u0012Q\n\u001asd_time_remaining_response\u0018\u0006 \u0001(\u000b2-.GDI.Proto.SDCard.SDCardTimeRemainingResponse\u0012Y\n\u001esd_time_remaining_notification\u0018\u0007 \u0001(\u000b21.GDI.Proto.SDCard.SDCardTimeRemainingNotification\"\u0015\n\u0013SDCardFormatRequest\"\u0099\u0001\n\u0012SDCardFormatStatus\u0012A\n\u0006status\u0018\u0001 \u0001(\u000e21.GDI.Proto.SDCard.SDCardFormatStatus.FormatStatus\"@\n\fFormatStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000f\n\u000bFORMAT_FAIL\u0010\u0001\u0012\u0012\n\u000eFORMAT_SUCCESS\u0010\u0002\"L\n\u0014SDCardFormatResponse\u00124\n\u0006status\u0018\u0001 \u0001(\u000b2$.GDI.Proto.SDCard.SDCardFormatStatus\"P\n\u0018SDCardFormatNotification\u00124\n\u0006status\u0018\u0001 \u0001(\u000b2$.GDI.Proto.SDCard.SDCardFormatStatus\"å\u0001\n\u0017SDCardErrorNotification\u0012>\n\u0005error\u0018\u0001 \u0001(\u000e2/.GDI.Proto.SDCard.SDCardErrorNotification.Error\"\u0089\u0001\n\u0005Error\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\b\n\u0004NONE\u0010\u0001\u0012\u000b\n\u0007NO_CARD\u0010\u0002\u0012\u000e\n\nBAD_FORMAT\u0010\u0003\u0012\b\n\u0004FULL\u0010\u0004\u0012\r\n\tSPACE_LOW\u0010\u0005\u0012\t\n\u0005SPEED\u0010\u0006\u0012\b\n\u0004SIZE\u0010\u0007\u0012\u000e\n\nUNDER_PERF\u0010\b\u0012\u000e\n\nNOT_USABLE\u0010\t\"\u001c\n\u001aSDCardTimeRemainingRequest\"°\u0001\n\u0019SDCardTimeRemainingStatus\u0012O\n\u0006status\u0018\u0001 \u0001(\u000e2?.GDI.Proto.SDCard.SDCardTimeRemainingStatus.TimeRemainingStatus\"B\n\u0013TimeRemainingStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\r\n\tAVAILABLE\u0010\u0001\u0012\u000f\n\u000bUNAVAILABLE\u0010\u0002\"z\n\u001bSDCardTimeRemainingResponse\u0012;\n\u0006status\u0018\u0001 \u0001(\u000b2+.GDI.Proto.SDCard.SDCardTimeRemainingStatus\u0012\u001e\n\u0016time_remaining_minutes\u0018\u0002 \u0001(\r\"~\n\u001fSDCardTimeRemainingNotification\u0012;\n\u0006status\u0018\u0001 \u0001(\u000b2+.GDI.Proto.SDCard.SDCardTimeRemainingStatus\u0012\u001e\n\u0016time_remaining_minutes\u0018\u0002 \u0001(\rB)\n\u001acom.garmin.proto.generatedB\tGDISDCardH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SDCard_SDCardErrorNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SDCard_SDCardErrorNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SDCard_SDCardFormatNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SDCard_SDCardFormatNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SDCard_SDCardFormatRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SDCard_SDCardFormatRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SDCard_SDCardFormatResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SDCard_SDCardFormatResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SDCard_SDCardFormatStatus_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SDCard_SDCardFormatStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SDCard_SDCardTimeRemainingNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SDCard_SDCardTimeRemainingNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SDCard_SDCardTimeRemainingRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SDCard_SDCardTimeRemainingRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SDCard_SDCardTimeRemainingResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SDCard_SDCardTimeRemainingResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SDCard_SDCardTimeRemainingStatus_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SDCard_SDCardTimeRemainingStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SDCard_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SDCard_Service_fieldAccessorTable;

    public interface SDCardErrorNotificationOrBuilder extends MessageOrBuilder {
        SDCardErrorNotification.Error getError();

        boolean hasError();
    }

    public interface SDCardFormatNotificationOrBuilder extends MessageOrBuilder {
        SDCardFormatStatus getStatus();

        SDCardFormatStatusOrBuilder getStatusOrBuilder();

        boolean hasStatus();
    }

    public interface SDCardFormatRequestOrBuilder extends MessageOrBuilder {
    }

    public interface SDCardFormatResponseOrBuilder extends MessageOrBuilder {
        SDCardFormatStatus getStatus();

        SDCardFormatStatusOrBuilder getStatusOrBuilder();

        boolean hasStatus();
    }

    public interface SDCardFormatStatusOrBuilder extends MessageOrBuilder {
        SDCardFormatStatus.FormatStatus getStatus();

        boolean hasStatus();
    }

    public interface SDCardTimeRemainingNotificationOrBuilder extends MessageOrBuilder {
        SDCardTimeRemainingStatus getStatus();

        SDCardTimeRemainingStatusOrBuilder getStatusOrBuilder();

        int getTimeRemainingMinutes();

        boolean hasStatus();

        boolean hasTimeRemainingMinutes();
    }

    public interface SDCardTimeRemainingRequestOrBuilder extends MessageOrBuilder {
    }

    public interface SDCardTimeRemainingResponseOrBuilder extends MessageOrBuilder {
        SDCardTimeRemainingStatus getStatus();

        SDCardTimeRemainingStatusOrBuilder getStatusOrBuilder();

        int getTimeRemainingMinutes();

        boolean hasStatus();

        boolean hasTimeRemainingMinutes();
    }

    public interface SDCardTimeRemainingStatusOrBuilder extends MessageOrBuilder {
        SDCardTimeRemainingStatus.TimeRemainingStatus getStatus();

        boolean hasStatus();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        SDCardErrorNotification getSdErrorNotification();

        SDCardErrorNotificationOrBuilder getSdErrorNotificationOrBuilder();

        SDCardFormatNotification getSdFormatNotification();

        SDCardFormatNotificationOrBuilder getSdFormatNotificationOrBuilder();

        SDCardFormatRequest getSdFormatRequest();

        SDCardFormatRequestOrBuilder getSdFormatRequestOrBuilder();

        SDCardFormatResponse getSdFormatResponse();

        SDCardFormatResponseOrBuilder getSdFormatResponseOrBuilder();

        SDCardTimeRemainingNotification getSdTimeRemainingNotification();

        SDCardTimeRemainingNotificationOrBuilder getSdTimeRemainingNotificationOrBuilder();

        SDCardTimeRemainingRequest getSdTimeRemainingRequest();

        SDCardTimeRemainingRequestOrBuilder getSdTimeRemainingRequestOrBuilder();

        SDCardTimeRemainingResponse getSdTimeRemainingResponse();

        SDCardTimeRemainingResponseOrBuilder getSdTimeRemainingResponseOrBuilder();

        boolean hasSdErrorNotification();

        boolean hasSdFormatNotification();

        boolean hasSdFormatRequest();

        boolean hasSdFormatResponse();

        boolean hasSdTimeRemainingNotification();

        boolean hasSdTimeRemainingRequest();

        boolean hasSdTimeRemainingResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SDCard_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_SDCard_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SdFormatRequest", "SdFormatResponse", "SdFormatNotification", "SdErrorNotification", "SdTimeRemainingRequest", "SdTimeRemainingResponse", "SdTimeRemainingNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_SDCard_SDCardFormatRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_SDCard_SDCardFormatRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_SDCard_SDCardFormatStatus_descriptor = descriptor4;
        internal_static_GDI_Proto_SDCard_SDCardFormatStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_SDCard_SDCardFormatResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_SDCard_SDCardFormatResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Status"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_SDCard_SDCardFormatNotification_descriptor = descriptor6;
        internal_static_GDI_Proto_SDCard_SDCardFormatNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_SDCard_SDCardErrorNotification_descriptor = descriptor7;
        internal_static_GDI_Proto_SDCard_SDCardErrorNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Error"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_SDCard_SDCardTimeRemainingRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_SDCard_SDCardTimeRemainingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[0]);
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_SDCard_SDCardTimeRemainingStatus_descriptor = descriptor9;
        internal_static_GDI_Proto_SDCard_SDCardTimeRemainingStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_SDCard_SDCardTimeRemainingResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_SDCard_SDCardTimeRemainingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Status", "TimeRemainingMinutes"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_SDCard_SDCardTimeRemainingNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_SDCard_SDCardTimeRemainingNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Status", "TimeRemainingMinutes"});
        GDICore.getDescriptor();
    }

    private GDISDCard() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class SDCardFormatRequest extends GeneratedMessageV3 implements SDCardFormatRequestOrBuilder {
        private static final SDCardFormatRequest DEFAULT_INSTANCE = new SDCardFormatRequest();

        @Deprecated
        public static final Parser<SDCardFormatRequest> PARSER = new AbstractParser<SDCardFormatRequest>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardFormatRequest.1
            @Override // com.google.protobuf.Parser
            public SDCardFormatRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SDCardFormatRequest.newBuilder();
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

        private SDCardFormatRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardFormatRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatRequest_descriptor;
        }

        public static Builder newBuilder(SDCardFormatRequest sDCardFormatRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDCardFormatRequest);
        }

        public static SDCardFormatRequest parseDelimitedFrom(InputStream inputStream) {
            return (SDCardFormatRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SDCardFormatRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SDCardFormatRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SDCardFormatRequest) {
                return getUnknownFields().equals(((SDCardFormatRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SDCardFormatRequest> getParserForType() {
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
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardFormatRequest.class, Builder.class);
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
            return new SDCardFormatRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SDCardFormatRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardFormatRequest build() {
                SDCardFormatRequest sDCardFormatRequestBuildPartial = buildPartial();
                if (sDCardFormatRequestBuildPartial.isInitialized()) {
                    return sDCardFormatRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDCardFormatRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardFormatRequest buildPartial() {
                SDCardFormatRequest sDCardFormatRequest = new SDCardFormatRequest(this);
                onBuilt();
                return sDCardFormatRequest;
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
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardFormatRequest.class, Builder.class);
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
            public SDCardFormatRequest getDefaultInstanceForType() {
                return SDCardFormatRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SDCardFormatRequest) {
                    return mergeFrom((SDCardFormatRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SDCardFormatRequest sDCardFormatRequest) {
                if (sDCardFormatRequest == SDCardFormatRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(sDCardFormatRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SDCardFormatRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SDCardFormatRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SDCardFormatRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardFormatRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardFormatRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SDCardFormatRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SDCardFormatRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SDCardFormatRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SDCardFormatRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SDCardFormatRequest parseFrom(InputStream inputStream) {
            return (SDCardFormatRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SDCardFormatRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardFormatRequest parseFrom(CodedInputStream codedInputStream) {
            return (SDCardFormatRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SDCardFormatRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDCardTimeRemainingRequest extends GeneratedMessageV3 implements SDCardTimeRemainingRequestOrBuilder {
        private static final SDCardTimeRemainingRequest DEFAULT_INSTANCE = new SDCardTimeRemainingRequest();

        @Deprecated
        public static final Parser<SDCardTimeRemainingRequest> PARSER = new AbstractParser<SDCardTimeRemainingRequest>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingRequest.1
            @Override // com.google.protobuf.Parser
            public SDCardTimeRemainingRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SDCardTimeRemainingRequest.newBuilder();
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

        private SDCardTimeRemainingRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardTimeRemainingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingRequest_descriptor;
        }

        public static Builder newBuilder(SDCardTimeRemainingRequest sDCardTimeRemainingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDCardTimeRemainingRequest);
        }

        public static SDCardTimeRemainingRequest parseDelimitedFrom(InputStream inputStream) {
            return (SDCardTimeRemainingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SDCardTimeRemainingRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SDCardTimeRemainingRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SDCardTimeRemainingRequest) {
                return getUnknownFields().equals(((SDCardTimeRemainingRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SDCardTimeRemainingRequest> getParserForType() {
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
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardTimeRemainingRequest.class, Builder.class);
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
            return new SDCardTimeRemainingRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SDCardTimeRemainingRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardTimeRemainingRequest build() {
                SDCardTimeRemainingRequest sDCardTimeRemainingRequestBuildPartial = buildPartial();
                if (sDCardTimeRemainingRequestBuildPartial.isInitialized()) {
                    return sDCardTimeRemainingRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDCardTimeRemainingRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardTimeRemainingRequest buildPartial() {
                SDCardTimeRemainingRequest sDCardTimeRemainingRequest = new SDCardTimeRemainingRequest(this);
                onBuilt();
                return sDCardTimeRemainingRequest;
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
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardTimeRemainingRequest.class, Builder.class);
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
            public SDCardTimeRemainingRequest getDefaultInstanceForType() {
                return SDCardTimeRemainingRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SDCardTimeRemainingRequest) {
                    return mergeFrom((SDCardTimeRemainingRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SDCardTimeRemainingRequest sDCardTimeRemainingRequest) {
                if (sDCardTimeRemainingRequest == SDCardTimeRemainingRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(sDCardTimeRemainingRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SDCardTimeRemainingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SDCardTimeRemainingRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SDCardTimeRemainingRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardTimeRemainingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardTimeRemainingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SDCardTimeRemainingRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SDCardTimeRemainingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SDCardTimeRemainingRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SDCardTimeRemainingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SDCardTimeRemainingRequest parseFrom(InputStream inputStream) {
            return (SDCardTimeRemainingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SDCardTimeRemainingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardTimeRemainingRequest parseFrom(CodedInputStream codedInputStream) {
            return (SDCardTimeRemainingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SDCardTimeRemainingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDCardErrorNotification extends GeneratedMessageV3 implements SDCardErrorNotificationOrBuilder {
        public static final int ERROR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int error_;
        private byte memoizedIsInitialized;
        private static final SDCardErrorNotification DEFAULT_INSTANCE = new SDCardErrorNotification();

        @Deprecated
        public static final Parser<SDCardErrorNotification> PARSER = new AbstractParser<SDCardErrorNotification>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardErrorNotification.1
            @Override // com.google.protobuf.Parser
            public SDCardErrorNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SDCardErrorNotification.newBuilder();
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

        private SDCardErrorNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.error_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardErrorNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardErrorNotification_descriptor;
        }

        public static Builder newBuilder(SDCardErrorNotification sDCardErrorNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDCardErrorNotification);
        }

        public static SDCardErrorNotification parseDelimitedFrom(InputStream inputStream) {
            return (SDCardErrorNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SDCardErrorNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SDCardErrorNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SDCardErrorNotification)) {
                return super.equals(obj);
            }
            SDCardErrorNotification sDCardErrorNotification = (SDCardErrorNotification) obj;
            if (hasError() != sDCardErrorNotification.hasError()) {
                return false;
            }
            return (!hasError() || this.error_ == sDCardErrorNotification.error_) && getUnknownFields().equals(sDCardErrorNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardErrorNotificationOrBuilder
        public Error getError() {
            Error errorForNumber = Error.forNumber(this.error_);
            return errorForNumber == null ? Error.UNKNOWN : errorForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SDCardErrorNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.error_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardErrorNotificationOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasError()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.error_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardErrorNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardErrorNotification.class, Builder.class);
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
            return new SDCardErrorNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.error_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SDCardErrorNotificationOrBuilder {
            private int bitField0_;
            private int error_;

            private Builder() {
                this.error_ = 0;
            }

            private void buildPartial0(SDCardErrorNotification sDCardErrorNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sDCardErrorNotification.error_ = this.error_;
                } else {
                    i14 = 0;
                }
                sDCardErrorNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardErrorNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardErrorNotification build() {
                SDCardErrorNotification sDCardErrorNotificationBuildPartial = buildPartial();
                if (sDCardErrorNotificationBuildPartial.isInitialized()) {
                    return sDCardErrorNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDCardErrorNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardErrorNotification buildPartial() {
                SDCardErrorNotification sDCardErrorNotification = new SDCardErrorNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sDCardErrorNotification);
                }
                onBuilt();
                return sDCardErrorNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.error_ = 0;
                return this;
            }

            public Builder clearError() {
                this.bitField0_ &= -2;
                this.error_ = 0;
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
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardErrorNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardErrorNotificationOrBuilder
            public Error getError() {
                Error errorForNumber = Error.forNumber(this.error_);
                return errorForNumber == null ? Error.UNKNOWN : errorForNumber;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardErrorNotificationOrBuilder
            public boolean hasError() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardErrorNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardErrorNotification.class, Builder.class);
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
                                    if (Error.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.error_ = i14;
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

            public Builder setError(Error error) {
                error.getClass();
                this.bitField0_ |= 1;
                this.error_ = error.getNumber();
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
            public SDCardErrorNotification getDefaultInstanceForType() {
                return SDCardErrorNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.error_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SDCardErrorNotification) {
                    return mergeFrom((SDCardErrorNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SDCardErrorNotification sDCardErrorNotification) {
                if (sDCardErrorNotification == SDCardErrorNotification.getDefaultInstance()) {
                    return this;
                }
                if (sDCardErrorNotification.hasError()) {
                    setError(sDCardErrorNotification.getError());
                }
                mergeUnknownFields(sDCardErrorNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SDCardErrorNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SDCardErrorNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardErrorNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardErrorNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SDCardErrorNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SDCardErrorNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SDCardErrorNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.error_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SDCardErrorNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SDCardErrorNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SDCardErrorNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SDCardErrorNotification parseFrom(InputStream inputStream) {
            return (SDCardErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SDCardErrorNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardErrorNotification parseFrom(CodedInputStream codedInputStream) {
            return (SDCardErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SDCardErrorNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Error implements ProtocolMessageEnum {
            UNKNOWN(0),
            NONE(1),
            NO_CARD(2),
            BAD_FORMAT(3),
            FULL(4),
            SPACE_LOW(5),
            SPEED(6),
            SIZE(7),
            UNDER_PERF(8),
            NOT_USABLE(9);

            public static final int BAD_FORMAT_VALUE = 3;
            public static final int FULL_VALUE = 4;
            public static final int NONE_VALUE = 1;
            public static final int NOT_USABLE_VALUE = 9;
            public static final int NO_CARD_VALUE = 2;
            public static final int SIZE_VALUE = 7;
            public static final int SPACE_LOW_VALUE = 5;
            public static final int SPEED_VALUE = 6;
            public static final int UNDER_PERF_VALUE = 8;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Error> internalValueMap = new Internal.EnumLiteMap<Error>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardErrorNotification.Error.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Error findValueByNumber(int i14) {
                    return Error.forNumber(i14);
                }
            };
            private static final Error[] VALUES = values();

            Error(int i14) {
                this.value = i14;
            }

            public static Error forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return NONE;
                    case 2:
                        return NO_CARD;
                    case 3:
                        return BAD_FORMAT;
                    case 4:
                        return FULL;
                    case 5:
                        return SPACE_LOW;
                    case 6:
                        return SPEED;
                    case 7:
                        return SIZE;
                    case 8:
                        return UNDER_PERF;
                    case 9:
                        return NOT_USABLE;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SDCardErrorNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Error> internalGetValueMap() {
                return internalValueMap;
            }

            public static Error valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Error valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class SDCardFormatNotification extends GeneratedMessageV3 implements SDCardFormatNotificationOrBuilder {
        private static final SDCardFormatNotification DEFAULT_INSTANCE = new SDCardFormatNotification();

        @Deprecated
        public static final Parser<SDCardFormatNotification> PARSER = new AbstractParser<SDCardFormatNotification>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardFormatNotification.1
            @Override // com.google.protobuf.Parser
            public SDCardFormatNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SDCardFormatNotification.newBuilder();
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
        private SDCardFormatStatus status_;

        private SDCardFormatNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardFormatNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatNotification_descriptor;
        }

        public static Builder newBuilder(SDCardFormatNotification sDCardFormatNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDCardFormatNotification);
        }

        public static SDCardFormatNotification parseDelimitedFrom(InputStream inputStream) {
            return (SDCardFormatNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SDCardFormatNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SDCardFormatNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SDCardFormatNotification)) {
                return super.equals(obj);
            }
            SDCardFormatNotification sDCardFormatNotification = (SDCardFormatNotification) obj;
            if (hasStatus() != sDCardFormatNotification.hasStatus()) {
                return false;
            }
            return (!hasStatus() || getStatus().equals(sDCardFormatNotification.getStatus())) && getUnknownFields().equals(sDCardFormatNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SDCardFormatNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getStatus()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatNotificationOrBuilder
        public SDCardFormatStatus getStatus() {
            SDCardFormatStatus sDCardFormatStatus = this.status_;
            return sDCardFormatStatus == null ? SDCardFormatStatus.getDefaultInstance() : sDCardFormatStatus;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatNotificationOrBuilder
        public SDCardFormatStatusOrBuilder getStatusOrBuilder() {
            SDCardFormatStatus sDCardFormatStatus = this.status_;
            return sDCardFormatStatus == null ? SDCardFormatStatus.getDefaultInstance() : sDCardFormatStatus;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatNotificationOrBuilder
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
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStatus().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardFormatNotification.class, Builder.class);
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
            return new SDCardFormatNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getStatus());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SDCardFormatNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> statusBuilder_;
            private SDCardFormatStatus status_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SDCardFormatNotification sDCardFormatNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                    sDCardFormatNotification.status_ = singleFieldBuilderV3 == null ? this.status_ : (SDCardFormatStatus) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                sDCardFormatNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatNotification_descriptor;
            }

            private SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> getStatusFieldBuilder() {
                if (this.statusBuilder_ == null) {
                    this.statusBuilder_ = new SingleFieldBuilderV3<>(getStatus(), getParentForChildren(), isClean());
                    this.status_ = null;
                }
                return this.statusBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardFormatNotification build() {
                SDCardFormatNotification sDCardFormatNotificationBuildPartial = buildPartial();
                if (sDCardFormatNotificationBuildPartial.isInitialized()) {
                    return sDCardFormatNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDCardFormatNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardFormatNotification buildPartial() {
                SDCardFormatNotification sDCardFormatNotification = new SDCardFormatNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sDCardFormatNotification);
                }
                onBuilt();
                return sDCardFormatNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = null;
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
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

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = null;
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
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
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatNotificationOrBuilder
            public SDCardFormatStatus getStatus() {
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardFormatStatus) singleFieldBuilderV3.getMessage();
                }
                SDCardFormatStatus sDCardFormatStatus = this.status_;
                return sDCardFormatStatus == null ? SDCardFormatStatus.getDefaultInstance() : sDCardFormatStatus;
            }

            public SDCardFormatStatus.Builder getStatusBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SDCardFormatStatus.Builder) getStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatNotificationOrBuilder
            public SDCardFormatStatusOrBuilder getStatusOrBuilder() {
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardFormatStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SDCardFormatStatus sDCardFormatStatus = this.status_;
                return sDCardFormatStatus == null ? SDCardFormatStatus.getDefaultInstance() : sDCardFormatStatus;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatNotificationOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardFormatNotification.class, Builder.class);
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
                                if (tag == 10) {
                                    codedInputStream.readMessage(getStatusFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeStatus(SDCardFormatStatus sDCardFormatStatus) {
                SDCardFormatStatus sDCardFormatStatus2;
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sDCardFormatStatus);
                } else if ((this.bitField0_ & 1) == 0 || (sDCardFormatStatus2 = this.status_) == null || sDCardFormatStatus2 == SDCardFormatStatus.getDefaultInstance()) {
                    this.status_ = sDCardFormatStatus;
                } else {
                    getStatusBuilder().mergeFrom(sDCardFormatStatus);
                }
                if (this.status_ != null) {
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

            public Builder setStatus(SDCardFormatStatus.Builder builder) {
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.status_ = builder.build();
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
            public SDCardFormatNotification getDefaultInstanceForType() {
                return SDCardFormatNotification.getDefaultInstance();
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

            public Builder setStatus(SDCardFormatStatus sDCardFormatStatus) {
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sDCardFormatStatus.getClass();
                    this.status_ = sDCardFormatStatus;
                } else {
                    singleFieldBuilderV3.setMessage(sDCardFormatStatus);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SDCardFormatNotification) {
                    return mergeFrom((SDCardFormatNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SDCardFormatNotification sDCardFormatNotification) {
                if (sDCardFormatNotification == SDCardFormatNotification.getDefaultInstance()) {
                    return this;
                }
                if (sDCardFormatNotification.hasStatus()) {
                    mergeStatus(sDCardFormatNotification.getStatus());
                }
                mergeUnknownFields(sDCardFormatNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SDCardFormatNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SDCardFormatNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SDCardFormatNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardFormatNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardFormatNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SDCardFormatNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SDCardFormatNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SDCardFormatNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SDCardFormatNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SDCardFormatNotification parseFrom(InputStream inputStream) {
            return (SDCardFormatNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SDCardFormatNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardFormatNotification parseFrom(CodedInputStream codedInputStream) {
            return (SDCardFormatNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SDCardFormatNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDCardFormatResponse extends GeneratedMessageV3 implements SDCardFormatResponseOrBuilder {
        private static final SDCardFormatResponse DEFAULT_INSTANCE = new SDCardFormatResponse();

        @Deprecated
        public static final Parser<SDCardFormatResponse> PARSER = new AbstractParser<SDCardFormatResponse>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardFormatResponse.1
            @Override // com.google.protobuf.Parser
            public SDCardFormatResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SDCardFormatResponse.newBuilder();
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
        private SDCardFormatStatus status_;

        private SDCardFormatResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardFormatResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatResponse_descriptor;
        }

        public static Builder newBuilder(SDCardFormatResponse sDCardFormatResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDCardFormatResponse);
        }

        public static SDCardFormatResponse parseDelimitedFrom(InputStream inputStream) {
            return (SDCardFormatResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SDCardFormatResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SDCardFormatResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SDCardFormatResponse)) {
                return super.equals(obj);
            }
            SDCardFormatResponse sDCardFormatResponse = (SDCardFormatResponse) obj;
            if (hasStatus() != sDCardFormatResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || getStatus().equals(sDCardFormatResponse.getStatus())) && getUnknownFields().equals(sDCardFormatResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SDCardFormatResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getStatus()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatResponseOrBuilder
        public SDCardFormatStatus getStatus() {
            SDCardFormatStatus sDCardFormatStatus = this.status_;
            return sDCardFormatStatus == null ? SDCardFormatStatus.getDefaultInstance() : sDCardFormatStatus;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatResponseOrBuilder
        public SDCardFormatStatusOrBuilder getStatusOrBuilder() {
            SDCardFormatStatus sDCardFormatStatus = this.status_;
            return sDCardFormatStatus == null ? SDCardFormatStatus.getDefaultInstance() : sDCardFormatStatus;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatResponseOrBuilder
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
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStatus().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardFormatResponse.class, Builder.class);
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
            return new SDCardFormatResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getStatus());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SDCardFormatResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> statusBuilder_;
            private SDCardFormatStatus status_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SDCardFormatResponse sDCardFormatResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                    sDCardFormatResponse.status_ = singleFieldBuilderV3 == null ? this.status_ : (SDCardFormatStatus) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                sDCardFormatResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatResponse_descriptor;
            }

            private SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> getStatusFieldBuilder() {
                if (this.statusBuilder_ == null) {
                    this.statusBuilder_ = new SingleFieldBuilderV3<>(getStatus(), getParentForChildren(), isClean());
                    this.status_ = null;
                }
                return this.statusBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardFormatResponse build() {
                SDCardFormatResponse sDCardFormatResponseBuildPartial = buildPartial();
                if (sDCardFormatResponseBuildPartial.isInitialized()) {
                    return sDCardFormatResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDCardFormatResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardFormatResponse buildPartial() {
                SDCardFormatResponse sDCardFormatResponse = new SDCardFormatResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sDCardFormatResponse);
                }
                onBuilt();
                return sDCardFormatResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = null;
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
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

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = null;
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
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
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatResponseOrBuilder
            public SDCardFormatStatus getStatus() {
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardFormatStatus) singleFieldBuilderV3.getMessage();
                }
                SDCardFormatStatus sDCardFormatStatus = this.status_;
                return sDCardFormatStatus == null ? SDCardFormatStatus.getDefaultInstance() : sDCardFormatStatus;
            }

            public SDCardFormatStatus.Builder getStatusBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SDCardFormatStatus.Builder) getStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatResponseOrBuilder
            public SDCardFormatStatusOrBuilder getStatusOrBuilder() {
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardFormatStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SDCardFormatStatus sDCardFormatStatus = this.status_;
                return sDCardFormatStatus == null ? SDCardFormatStatus.getDefaultInstance() : sDCardFormatStatus;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardFormatResponse.class, Builder.class);
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
                                if (tag == 10) {
                                    codedInputStream.readMessage(getStatusFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeStatus(SDCardFormatStatus sDCardFormatStatus) {
                SDCardFormatStatus sDCardFormatStatus2;
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sDCardFormatStatus);
                } else if ((this.bitField0_ & 1) == 0 || (sDCardFormatStatus2 = this.status_) == null || sDCardFormatStatus2 == SDCardFormatStatus.getDefaultInstance()) {
                    this.status_ = sDCardFormatStatus;
                } else {
                    getStatusBuilder().mergeFrom(sDCardFormatStatus);
                }
                if (this.status_ != null) {
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

            public Builder setStatus(SDCardFormatStatus.Builder builder) {
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.status_ = builder.build();
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
            public SDCardFormatResponse getDefaultInstanceForType() {
                return SDCardFormatResponse.getDefaultInstance();
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

            public Builder setStatus(SDCardFormatStatus sDCardFormatStatus) {
                SingleFieldBuilderV3<SDCardFormatStatus, SDCardFormatStatus.Builder, SDCardFormatStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sDCardFormatStatus.getClass();
                    this.status_ = sDCardFormatStatus;
                } else {
                    singleFieldBuilderV3.setMessage(sDCardFormatStatus);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SDCardFormatResponse) {
                    return mergeFrom((SDCardFormatResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SDCardFormatResponse sDCardFormatResponse) {
                if (sDCardFormatResponse == SDCardFormatResponse.getDefaultInstance()) {
                    return this;
                }
                if (sDCardFormatResponse.hasStatus()) {
                    mergeStatus(sDCardFormatResponse.getStatus());
                }
                mergeUnknownFields(sDCardFormatResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SDCardFormatResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SDCardFormatResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SDCardFormatResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardFormatResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardFormatResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SDCardFormatResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SDCardFormatResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SDCardFormatResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SDCardFormatResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SDCardFormatResponse parseFrom(InputStream inputStream) {
            return (SDCardFormatResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SDCardFormatResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardFormatResponse parseFrom(CodedInputStream codedInputStream) {
            return (SDCardFormatResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SDCardFormatResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDCardFormatStatus extends GeneratedMessageV3 implements SDCardFormatStatusOrBuilder {
        private static final SDCardFormatStatus DEFAULT_INSTANCE = new SDCardFormatStatus();

        @Deprecated
        public static final Parser<SDCardFormatStatus> PARSER = new AbstractParser<SDCardFormatStatus>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardFormatStatus.1
            @Override // com.google.protobuf.Parser
            public SDCardFormatStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SDCardFormatStatus.newBuilder();
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

        private SDCardFormatStatus(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardFormatStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatStatus_descriptor;
        }

        public static Builder newBuilder(SDCardFormatStatus sDCardFormatStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDCardFormatStatus);
        }

        public static SDCardFormatStatus parseDelimitedFrom(InputStream inputStream) {
            return (SDCardFormatStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SDCardFormatStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SDCardFormatStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SDCardFormatStatus)) {
                return super.equals(obj);
            }
            SDCardFormatStatus sDCardFormatStatus = (SDCardFormatStatus) obj;
            if (hasStatus() != sDCardFormatStatus.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == sDCardFormatStatus.status_) && getUnknownFields().equals(sDCardFormatStatus.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SDCardFormatStatus> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatStatusOrBuilder
        public FormatStatus getStatus() {
            FormatStatus formatStatusForNumber = FormatStatus.forNumber(this.status_);
            return formatStatusForNumber == null ? FormatStatus.UNKNOWN : formatStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatStatusOrBuilder
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
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardFormatStatus.class, Builder.class);
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
            return new SDCardFormatStatus();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SDCardFormatStatusOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SDCardFormatStatus sDCardFormatStatus) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sDCardFormatStatus.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                sDCardFormatStatus.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatStatus_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardFormatStatus build() {
                SDCardFormatStatus sDCardFormatStatusBuildPartial = buildPartial();
                if (sDCardFormatStatusBuildPartial.isInitialized()) {
                    return sDCardFormatStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDCardFormatStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardFormatStatus buildPartial() {
                SDCardFormatStatus sDCardFormatStatus = new SDCardFormatStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sDCardFormatStatus);
                }
                onBuilt();
                return sDCardFormatStatus;
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
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatStatus_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatStatusOrBuilder
            public FormatStatus getStatus() {
                FormatStatus formatStatusForNumber = FormatStatus.forNumber(this.status_);
                return formatStatusForNumber == null ? FormatStatus.UNKNOWN : formatStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardFormatStatusOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardFormatStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardFormatStatus.class, Builder.class);
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
                                    if (FormatStatus.forNumber(i14) == null) {
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

            public Builder setStatus(FormatStatus formatStatus) {
                formatStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = formatStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SDCardFormatStatus getDefaultInstanceForType() {
                return SDCardFormatStatus.getDefaultInstance();
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
                if (message instanceof SDCardFormatStatus) {
                    return mergeFrom((SDCardFormatStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SDCardFormatStatus sDCardFormatStatus) {
                if (sDCardFormatStatus == SDCardFormatStatus.getDefaultInstance()) {
                    return this;
                }
                if (sDCardFormatStatus.hasStatus()) {
                    setStatus(sDCardFormatStatus.getStatus());
                }
                mergeUnknownFields(sDCardFormatStatus.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SDCardFormatStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SDCardFormatStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardFormatStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SDCardFormatStatus(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SDCardFormatStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SDCardFormatStatus() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SDCardFormatStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SDCardFormatStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SDCardFormatStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SDCardFormatStatus parseFrom(InputStream inputStream) {
            return (SDCardFormatStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SDCardFormatStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardFormatStatus parseFrom(CodedInputStream codedInputStream) {
            return (SDCardFormatStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SDCardFormatStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardFormatStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum FormatStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            FORMAT_FAIL(1),
            FORMAT_SUCCESS(2);

            public static final int FORMAT_FAIL_VALUE = 1;
            public static final int FORMAT_SUCCESS_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<FormatStatus> internalValueMap = new Internal.EnumLiteMap<FormatStatus>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardFormatStatus.FormatStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public FormatStatus findValueByNumber(int i14) {
                    return FormatStatus.forNumber(i14);
                }
            };
            private static final FormatStatus[] VALUES = values();

            FormatStatus(int i14) {
                this.value = i14;
            }

            public static FormatStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return FORMAT_FAIL;
                }
                if (i14 != 2) {
                    return null;
                }
                return FORMAT_SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SDCardFormatStatus.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<FormatStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static FormatStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static FormatStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class SDCardTimeRemainingNotification extends GeneratedMessageV3 implements SDCardTimeRemainingNotificationOrBuilder {
        private static final SDCardTimeRemainingNotification DEFAULT_INSTANCE = new SDCardTimeRemainingNotification();

        @Deprecated
        public static final Parser<SDCardTimeRemainingNotification> PARSER = new AbstractParser<SDCardTimeRemainingNotification>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingNotification.1
            @Override // com.google.protobuf.Parser
            public SDCardTimeRemainingNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SDCardTimeRemainingNotification.newBuilder();
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
        public static final int TIME_REMAINING_MINUTES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SDCardTimeRemainingStatus status_;
        private int timeRemainingMinutes_;

        private SDCardTimeRemainingNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.timeRemainingMinutes_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardTimeRemainingNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingNotification_descriptor;
        }

        public static Builder newBuilder(SDCardTimeRemainingNotification sDCardTimeRemainingNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDCardTimeRemainingNotification);
        }

        public static SDCardTimeRemainingNotification parseDelimitedFrom(InputStream inputStream) {
            return (SDCardTimeRemainingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SDCardTimeRemainingNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SDCardTimeRemainingNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SDCardTimeRemainingNotification)) {
                return super.equals(obj);
            }
            SDCardTimeRemainingNotification sDCardTimeRemainingNotification = (SDCardTimeRemainingNotification) obj;
            if (hasStatus() != sDCardTimeRemainingNotification.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || getStatus().equals(sDCardTimeRemainingNotification.getStatus())) && hasTimeRemainingMinutes() == sDCardTimeRemainingNotification.hasTimeRemainingMinutes()) {
                return (!hasTimeRemainingMinutes() || getTimeRemainingMinutes() == sDCardTimeRemainingNotification.getTimeRemainingMinutes()) && getUnknownFields().equals(sDCardTimeRemainingNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SDCardTimeRemainingNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getStatus()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.timeRemainingMinutes_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingNotificationOrBuilder
        public SDCardTimeRemainingStatus getStatus() {
            SDCardTimeRemainingStatus sDCardTimeRemainingStatus = this.status_;
            return sDCardTimeRemainingStatus == null ? SDCardTimeRemainingStatus.getDefaultInstance() : sDCardTimeRemainingStatus;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingNotificationOrBuilder
        public SDCardTimeRemainingStatusOrBuilder getStatusOrBuilder() {
            SDCardTimeRemainingStatus sDCardTimeRemainingStatus = this.status_;
            return sDCardTimeRemainingStatus == null ? SDCardTimeRemainingStatus.getDefaultInstance() : sDCardTimeRemainingStatus;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingNotificationOrBuilder
        public int getTimeRemainingMinutes() {
            return this.timeRemainingMinutes_;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingNotificationOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingNotificationOrBuilder
        public boolean hasTimeRemainingMinutes() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStatus().hashCode();
            }
            if (hasTimeRemainingMinutes()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTimeRemainingMinutes();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardTimeRemainingNotification.class, Builder.class);
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
            return new SDCardTimeRemainingNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getStatus());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.timeRemainingMinutes_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SDCardTimeRemainingNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> statusBuilder_;
            private SDCardTimeRemainingStatus status_;
            private int timeRemainingMinutes_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SDCardTimeRemainingNotification sDCardTimeRemainingNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                    sDCardTimeRemainingNotification.status_ = singleFieldBuilderV3 == null ? this.status_ : (SDCardTimeRemainingStatus) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sDCardTimeRemainingNotification.timeRemainingMinutes_ = this.timeRemainingMinutes_;
                    i14 |= 2;
                }
                sDCardTimeRemainingNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingNotification_descriptor;
            }

            private SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> getStatusFieldBuilder() {
                if (this.statusBuilder_ == null) {
                    this.statusBuilder_ = new SingleFieldBuilderV3<>(getStatus(), getParentForChildren(), isClean());
                    this.status_ = null;
                }
                return this.statusBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardTimeRemainingNotification build() {
                SDCardTimeRemainingNotification sDCardTimeRemainingNotificationBuildPartial = buildPartial();
                if (sDCardTimeRemainingNotificationBuildPartial.isInitialized()) {
                    return sDCardTimeRemainingNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDCardTimeRemainingNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardTimeRemainingNotification buildPartial() {
                SDCardTimeRemainingNotification sDCardTimeRemainingNotification = new SDCardTimeRemainingNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sDCardTimeRemainingNotification);
                }
                onBuilt();
                return sDCardTimeRemainingNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = null;
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
                }
                this.timeRemainingMinutes_ = 0;
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
                this.status_ = null;
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTimeRemainingMinutes() {
                this.bitField0_ &= -3;
                this.timeRemainingMinutes_ = 0;
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
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingNotificationOrBuilder
            public SDCardTimeRemainingStatus getStatus() {
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardTimeRemainingStatus) singleFieldBuilderV3.getMessage();
                }
                SDCardTimeRemainingStatus sDCardTimeRemainingStatus = this.status_;
                return sDCardTimeRemainingStatus == null ? SDCardTimeRemainingStatus.getDefaultInstance() : sDCardTimeRemainingStatus;
            }

            public SDCardTimeRemainingStatus.Builder getStatusBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SDCardTimeRemainingStatus.Builder) getStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingNotificationOrBuilder
            public SDCardTimeRemainingStatusOrBuilder getStatusOrBuilder() {
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardTimeRemainingStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SDCardTimeRemainingStatus sDCardTimeRemainingStatus = this.status_;
                return sDCardTimeRemainingStatus == null ? SDCardTimeRemainingStatus.getDefaultInstance() : sDCardTimeRemainingStatus;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingNotificationOrBuilder
            public int getTimeRemainingMinutes() {
                return this.timeRemainingMinutes_;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingNotificationOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingNotificationOrBuilder
            public boolean hasTimeRemainingMinutes() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardTimeRemainingNotification.class, Builder.class);
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
                                if (tag == 10) {
                                    codedInputStream.readMessage(getStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.timeRemainingMinutes_ = codedInputStream.readUInt32();
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

            public Builder mergeStatus(SDCardTimeRemainingStatus sDCardTimeRemainingStatus) {
                SDCardTimeRemainingStatus sDCardTimeRemainingStatus2;
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sDCardTimeRemainingStatus);
                } else if ((this.bitField0_ & 1) == 0 || (sDCardTimeRemainingStatus2 = this.status_) == null || sDCardTimeRemainingStatus2 == SDCardTimeRemainingStatus.getDefaultInstance()) {
                    this.status_ = sDCardTimeRemainingStatus;
                } else {
                    getStatusBuilder().mergeFrom(sDCardTimeRemainingStatus);
                }
                if (this.status_ != null) {
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

            public Builder setStatus(SDCardTimeRemainingStatus.Builder builder) {
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.status_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTimeRemainingMinutes(int i14) {
                this.timeRemainingMinutes_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SDCardTimeRemainingNotification getDefaultInstanceForType() {
                return SDCardTimeRemainingNotification.getDefaultInstance();
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

            public Builder setStatus(SDCardTimeRemainingStatus sDCardTimeRemainingStatus) {
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sDCardTimeRemainingStatus.getClass();
                    this.status_ = sDCardTimeRemainingStatus;
                } else {
                    singleFieldBuilderV3.setMessage(sDCardTimeRemainingStatus);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SDCardTimeRemainingNotification) {
                    return mergeFrom((SDCardTimeRemainingNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SDCardTimeRemainingNotification sDCardTimeRemainingNotification) {
                if (sDCardTimeRemainingNotification == SDCardTimeRemainingNotification.getDefaultInstance()) {
                    return this;
                }
                if (sDCardTimeRemainingNotification.hasStatus()) {
                    mergeStatus(sDCardTimeRemainingNotification.getStatus());
                }
                if (sDCardTimeRemainingNotification.hasTimeRemainingMinutes()) {
                    setTimeRemainingMinutes(sDCardTimeRemainingNotification.getTimeRemainingMinutes());
                }
                mergeUnknownFields(sDCardTimeRemainingNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SDCardTimeRemainingNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SDCardTimeRemainingNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardTimeRemainingNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SDCardTimeRemainingNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SDCardTimeRemainingNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SDCardTimeRemainingNotification() {
            this.timeRemainingMinutes_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SDCardTimeRemainingNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SDCardTimeRemainingNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SDCardTimeRemainingNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SDCardTimeRemainingNotification parseFrom(InputStream inputStream) {
            return (SDCardTimeRemainingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SDCardTimeRemainingNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardTimeRemainingNotification parseFrom(CodedInputStream codedInputStream) {
            return (SDCardTimeRemainingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SDCardTimeRemainingNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDCardTimeRemainingResponse extends GeneratedMessageV3 implements SDCardTimeRemainingResponseOrBuilder {
        private static final SDCardTimeRemainingResponse DEFAULT_INSTANCE = new SDCardTimeRemainingResponse();

        @Deprecated
        public static final Parser<SDCardTimeRemainingResponse> PARSER = new AbstractParser<SDCardTimeRemainingResponse>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingResponse.1
            @Override // com.google.protobuf.Parser
            public SDCardTimeRemainingResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SDCardTimeRemainingResponse.newBuilder();
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
        public static final int TIME_REMAINING_MINUTES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SDCardTimeRemainingStatus status_;
        private int timeRemainingMinutes_;

        private SDCardTimeRemainingResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.timeRemainingMinutes_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardTimeRemainingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingResponse_descriptor;
        }

        public static Builder newBuilder(SDCardTimeRemainingResponse sDCardTimeRemainingResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDCardTimeRemainingResponse);
        }

        public static SDCardTimeRemainingResponse parseDelimitedFrom(InputStream inputStream) {
            return (SDCardTimeRemainingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SDCardTimeRemainingResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SDCardTimeRemainingResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SDCardTimeRemainingResponse)) {
                return super.equals(obj);
            }
            SDCardTimeRemainingResponse sDCardTimeRemainingResponse = (SDCardTimeRemainingResponse) obj;
            if (hasStatus() != sDCardTimeRemainingResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || getStatus().equals(sDCardTimeRemainingResponse.getStatus())) && hasTimeRemainingMinutes() == sDCardTimeRemainingResponse.hasTimeRemainingMinutes()) {
                return (!hasTimeRemainingMinutes() || getTimeRemainingMinutes() == sDCardTimeRemainingResponse.getTimeRemainingMinutes()) && getUnknownFields().equals(sDCardTimeRemainingResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SDCardTimeRemainingResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getStatus()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.timeRemainingMinutes_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingResponseOrBuilder
        public SDCardTimeRemainingStatus getStatus() {
            SDCardTimeRemainingStatus sDCardTimeRemainingStatus = this.status_;
            return sDCardTimeRemainingStatus == null ? SDCardTimeRemainingStatus.getDefaultInstance() : sDCardTimeRemainingStatus;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingResponseOrBuilder
        public SDCardTimeRemainingStatusOrBuilder getStatusOrBuilder() {
            SDCardTimeRemainingStatus sDCardTimeRemainingStatus = this.status_;
            return sDCardTimeRemainingStatus == null ? SDCardTimeRemainingStatus.getDefaultInstance() : sDCardTimeRemainingStatus;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingResponseOrBuilder
        public int getTimeRemainingMinutes() {
            return this.timeRemainingMinutes_;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingResponseOrBuilder
        public boolean hasTimeRemainingMinutes() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStatus().hashCode();
            }
            if (hasTimeRemainingMinutes()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTimeRemainingMinutes();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardTimeRemainingResponse.class, Builder.class);
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
            return new SDCardTimeRemainingResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getStatus());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.timeRemainingMinutes_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SDCardTimeRemainingResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> statusBuilder_;
            private SDCardTimeRemainingStatus status_;
            private int timeRemainingMinutes_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SDCardTimeRemainingResponse sDCardTimeRemainingResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                    sDCardTimeRemainingResponse.status_ = singleFieldBuilderV3 == null ? this.status_ : (SDCardTimeRemainingStatus) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sDCardTimeRemainingResponse.timeRemainingMinutes_ = this.timeRemainingMinutes_;
                    i14 |= 2;
                }
                sDCardTimeRemainingResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingResponse_descriptor;
            }

            private SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> getStatusFieldBuilder() {
                if (this.statusBuilder_ == null) {
                    this.statusBuilder_ = new SingleFieldBuilderV3<>(getStatus(), getParentForChildren(), isClean());
                    this.status_ = null;
                }
                return this.statusBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardTimeRemainingResponse build() {
                SDCardTimeRemainingResponse sDCardTimeRemainingResponseBuildPartial = buildPartial();
                if (sDCardTimeRemainingResponseBuildPartial.isInitialized()) {
                    return sDCardTimeRemainingResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDCardTimeRemainingResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardTimeRemainingResponse buildPartial() {
                SDCardTimeRemainingResponse sDCardTimeRemainingResponse = new SDCardTimeRemainingResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sDCardTimeRemainingResponse);
                }
                onBuilt();
                return sDCardTimeRemainingResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = null;
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
                }
                this.timeRemainingMinutes_ = 0;
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
                this.status_ = null;
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTimeRemainingMinutes() {
                this.bitField0_ &= -3;
                this.timeRemainingMinutes_ = 0;
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
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingResponseOrBuilder
            public SDCardTimeRemainingStatus getStatus() {
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardTimeRemainingStatus) singleFieldBuilderV3.getMessage();
                }
                SDCardTimeRemainingStatus sDCardTimeRemainingStatus = this.status_;
                return sDCardTimeRemainingStatus == null ? SDCardTimeRemainingStatus.getDefaultInstance() : sDCardTimeRemainingStatus;
            }

            public SDCardTimeRemainingStatus.Builder getStatusBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SDCardTimeRemainingStatus.Builder) getStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingResponseOrBuilder
            public SDCardTimeRemainingStatusOrBuilder getStatusOrBuilder() {
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardTimeRemainingStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SDCardTimeRemainingStatus sDCardTimeRemainingStatus = this.status_;
                return sDCardTimeRemainingStatus == null ? SDCardTimeRemainingStatus.getDefaultInstance() : sDCardTimeRemainingStatus;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingResponseOrBuilder
            public int getTimeRemainingMinutes() {
                return this.timeRemainingMinutes_;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingResponseOrBuilder
            public boolean hasTimeRemainingMinutes() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardTimeRemainingResponse.class, Builder.class);
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
                                if (tag == 10) {
                                    codedInputStream.readMessage(getStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.timeRemainingMinutes_ = codedInputStream.readUInt32();
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

            public Builder mergeStatus(SDCardTimeRemainingStatus sDCardTimeRemainingStatus) {
                SDCardTimeRemainingStatus sDCardTimeRemainingStatus2;
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sDCardTimeRemainingStatus);
                } else if ((this.bitField0_ & 1) == 0 || (sDCardTimeRemainingStatus2 = this.status_) == null || sDCardTimeRemainingStatus2 == SDCardTimeRemainingStatus.getDefaultInstance()) {
                    this.status_ = sDCardTimeRemainingStatus;
                } else {
                    getStatusBuilder().mergeFrom(sDCardTimeRemainingStatus);
                }
                if (this.status_ != null) {
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

            public Builder setStatus(SDCardTimeRemainingStatus.Builder builder) {
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.status_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTimeRemainingMinutes(int i14) {
                this.timeRemainingMinutes_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SDCardTimeRemainingResponse getDefaultInstanceForType() {
                return SDCardTimeRemainingResponse.getDefaultInstance();
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

            public Builder setStatus(SDCardTimeRemainingStatus sDCardTimeRemainingStatus) {
                SingleFieldBuilderV3<SDCardTimeRemainingStatus, SDCardTimeRemainingStatus.Builder, SDCardTimeRemainingStatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sDCardTimeRemainingStatus.getClass();
                    this.status_ = sDCardTimeRemainingStatus;
                } else {
                    singleFieldBuilderV3.setMessage(sDCardTimeRemainingStatus);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SDCardTimeRemainingResponse) {
                    return mergeFrom((SDCardTimeRemainingResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SDCardTimeRemainingResponse sDCardTimeRemainingResponse) {
                if (sDCardTimeRemainingResponse == SDCardTimeRemainingResponse.getDefaultInstance()) {
                    return this;
                }
                if (sDCardTimeRemainingResponse.hasStatus()) {
                    mergeStatus(sDCardTimeRemainingResponse.getStatus());
                }
                if (sDCardTimeRemainingResponse.hasTimeRemainingMinutes()) {
                    setTimeRemainingMinutes(sDCardTimeRemainingResponse.getTimeRemainingMinutes());
                }
                mergeUnknownFields(sDCardTimeRemainingResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SDCardTimeRemainingResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SDCardTimeRemainingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardTimeRemainingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SDCardTimeRemainingResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SDCardTimeRemainingResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SDCardTimeRemainingResponse() {
            this.timeRemainingMinutes_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SDCardTimeRemainingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SDCardTimeRemainingResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SDCardTimeRemainingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SDCardTimeRemainingResponse parseFrom(InputStream inputStream) {
            return (SDCardTimeRemainingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SDCardTimeRemainingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardTimeRemainingResponse parseFrom(CodedInputStream codedInputStream) {
            return (SDCardTimeRemainingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SDCardTimeRemainingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDCardTimeRemainingStatus extends GeneratedMessageV3 implements SDCardTimeRemainingStatusOrBuilder {
        private static final SDCardTimeRemainingStatus DEFAULT_INSTANCE = new SDCardTimeRemainingStatus();

        @Deprecated
        public static final Parser<SDCardTimeRemainingStatus> PARSER = new AbstractParser<SDCardTimeRemainingStatus>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingStatus.1
            @Override // com.google.protobuf.Parser
            public SDCardTimeRemainingStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SDCardTimeRemainingStatus.newBuilder();
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

        private SDCardTimeRemainingStatus(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SDCardTimeRemainingStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingStatus_descriptor;
        }

        public static Builder newBuilder(SDCardTimeRemainingStatus sDCardTimeRemainingStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDCardTimeRemainingStatus);
        }

        public static SDCardTimeRemainingStatus parseDelimitedFrom(InputStream inputStream) {
            return (SDCardTimeRemainingStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SDCardTimeRemainingStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SDCardTimeRemainingStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SDCardTimeRemainingStatus)) {
                return super.equals(obj);
            }
            SDCardTimeRemainingStatus sDCardTimeRemainingStatus = (SDCardTimeRemainingStatus) obj;
            if (hasStatus() != sDCardTimeRemainingStatus.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == sDCardTimeRemainingStatus.status_) && getUnknownFields().equals(sDCardTimeRemainingStatus.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SDCardTimeRemainingStatus> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingStatusOrBuilder
        public TimeRemainingStatus getStatus() {
            TimeRemainingStatus timeRemainingStatusForNumber = TimeRemainingStatus.forNumber(this.status_);
            return timeRemainingStatusForNumber == null ? TimeRemainingStatus.UNKNOWN : timeRemainingStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingStatusOrBuilder
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
            return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardTimeRemainingStatus.class, Builder.class);
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
            return new SDCardTimeRemainingStatus();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SDCardTimeRemainingStatusOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SDCardTimeRemainingStatus sDCardTimeRemainingStatus) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sDCardTimeRemainingStatus.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                sDCardTimeRemainingStatus.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingStatus_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardTimeRemainingStatus build() {
                SDCardTimeRemainingStatus sDCardTimeRemainingStatusBuildPartial = buildPartial();
                if (sDCardTimeRemainingStatusBuildPartial.isInitialized()) {
                    return sDCardTimeRemainingStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDCardTimeRemainingStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SDCardTimeRemainingStatus buildPartial() {
                SDCardTimeRemainingStatus sDCardTimeRemainingStatus = new SDCardTimeRemainingStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sDCardTimeRemainingStatus);
                }
                onBuilt();
                return sDCardTimeRemainingStatus;
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
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingStatus_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingStatusOrBuilder
            public TimeRemainingStatus getStatus() {
                TimeRemainingStatus timeRemainingStatusForNumber = TimeRemainingStatus.forNumber(this.status_);
                return timeRemainingStatusForNumber == null ? TimeRemainingStatus.UNKNOWN : timeRemainingStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingStatusOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_SDCardTimeRemainingStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(SDCardTimeRemainingStatus.class, Builder.class);
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
                                    if (TimeRemainingStatus.forNumber(i14) == null) {
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

            public Builder setStatus(TimeRemainingStatus timeRemainingStatus) {
                timeRemainingStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = timeRemainingStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SDCardTimeRemainingStatus getDefaultInstanceForType() {
                return SDCardTimeRemainingStatus.getDefaultInstance();
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
                if (message instanceof SDCardTimeRemainingStatus) {
                    return mergeFrom((SDCardTimeRemainingStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SDCardTimeRemainingStatus sDCardTimeRemainingStatus) {
                if (sDCardTimeRemainingStatus == SDCardTimeRemainingStatus.getDefaultInstance()) {
                    return this;
                }
                if (sDCardTimeRemainingStatus.hasStatus()) {
                    setStatus(sDCardTimeRemainingStatus.getStatus());
                }
                mergeUnknownFields(sDCardTimeRemainingStatus.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SDCardTimeRemainingStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SDCardTimeRemainingStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardTimeRemainingStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SDCardTimeRemainingStatus(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SDCardTimeRemainingStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SDCardTimeRemainingStatus() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SDCardTimeRemainingStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SDCardTimeRemainingStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SDCardTimeRemainingStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SDCardTimeRemainingStatus parseFrom(InputStream inputStream) {
            return (SDCardTimeRemainingStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SDCardTimeRemainingStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SDCardTimeRemainingStatus parseFrom(CodedInputStream codedInputStream) {
            return (SDCardTimeRemainingStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SDCardTimeRemainingStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDCardTimeRemainingStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum TimeRemainingStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            AVAILABLE(1),
            UNAVAILABLE(2);

            public static final int AVAILABLE_VALUE = 1;
            public static final int UNAVAILABLE_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<TimeRemainingStatus> internalValueMap = new Internal.EnumLiteMap<TimeRemainingStatus>() { // from class: com.garmin.proto.generated.GDISDCard.SDCardTimeRemainingStatus.TimeRemainingStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public TimeRemainingStatus findValueByNumber(int i14) {
                    return TimeRemainingStatus.forNumber(i14);
                }
            };
            private static final TimeRemainingStatus[] VALUES = values();

            TimeRemainingStatus(int i14) {
                this.value = i14;
            }

            public static TimeRemainingStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return AVAILABLE;
                }
                if (i14 != 2) {
                    return null;
                }
                return UNAVAILABLE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SDCardTimeRemainingStatus.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<TimeRemainingStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static TimeRemainingStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static TimeRemainingStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDISDCard.Service.1
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
        public static final int SD_ERROR_NOTIFICATION_FIELD_NUMBER = 4;
        public static final int SD_FORMAT_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int SD_FORMAT_REQUEST_FIELD_NUMBER = 1;
        public static final int SD_FORMAT_RESPONSE_FIELD_NUMBER = 2;
        public static final int SD_TIME_REMAINING_NOTIFICATION_FIELD_NUMBER = 7;
        public static final int SD_TIME_REMAINING_REQUEST_FIELD_NUMBER = 5;
        public static final int SD_TIME_REMAINING_RESPONSE_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SDCardErrorNotification sdErrorNotification_;
        private SDCardFormatNotification sdFormatNotification_;
        private SDCardFormatRequest sdFormatRequest_;
        private SDCardFormatResponse sdFormatResponse_;
        private SDCardTimeRemainingNotification sdTimeRemainingNotification_;
        private SDCardTimeRemainingRequest sdTimeRemainingRequest_;
        private SDCardTimeRemainingResponse sdTimeRemainingResponse_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_Service_descriptor;
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
            if (hasSdFormatRequest() != service.hasSdFormatRequest()) {
                return false;
            }
            if ((hasSdFormatRequest() && !getSdFormatRequest().equals(service.getSdFormatRequest())) || hasSdFormatResponse() != service.hasSdFormatResponse()) {
                return false;
            }
            if ((hasSdFormatResponse() && !getSdFormatResponse().equals(service.getSdFormatResponse())) || hasSdFormatNotification() != service.hasSdFormatNotification()) {
                return false;
            }
            if ((hasSdFormatNotification() && !getSdFormatNotification().equals(service.getSdFormatNotification())) || hasSdErrorNotification() != service.hasSdErrorNotification()) {
                return false;
            }
            if ((hasSdErrorNotification() && !getSdErrorNotification().equals(service.getSdErrorNotification())) || hasSdTimeRemainingRequest() != service.hasSdTimeRemainingRequest()) {
                return false;
            }
            if ((hasSdTimeRemainingRequest() && !getSdTimeRemainingRequest().equals(service.getSdTimeRemainingRequest())) || hasSdTimeRemainingResponse() != service.hasSdTimeRemainingResponse()) {
                return false;
            }
            if ((!hasSdTimeRemainingResponse() || getSdTimeRemainingResponse().equals(service.getSdTimeRemainingResponse())) && hasSdTimeRemainingNotification() == service.hasSdTimeRemainingNotification()) {
                return (!hasSdTimeRemainingNotification() || getSdTimeRemainingNotification().equals(service.getSdTimeRemainingNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardErrorNotification getSdErrorNotification() {
            SDCardErrorNotification sDCardErrorNotification = this.sdErrorNotification_;
            return sDCardErrorNotification == null ? SDCardErrorNotification.getDefaultInstance() : sDCardErrorNotification;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardErrorNotificationOrBuilder getSdErrorNotificationOrBuilder() {
            SDCardErrorNotification sDCardErrorNotification = this.sdErrorNotification_;
            return sDCardErrorNotification == null ? SDCardErrorNotification.getDefaultInstance() : sDCardErrorNotification;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardFormatNotification getSdFormatNotification() {
            SDCardFormatNotification sDCardFormatNotification = this.sdFormatNotification_;
            return sDCardFormatNotification == null ? SDCardFormatNotification.getDefaultInstance() : sDCardFormatNotification;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardFormatNotificationOrBuilder getSdFormatNotificationOrBuilder() {
            SDCardFormatNotification sDCardFormatNotification = this.sdFormatNotification_;
            return sDCardFormatNotification == null ? SDCardFormatNotification.getDefaultInstance() : sDCardFormatNotification;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardFormatRequest getSdFormatRequest() {
            SDCardFormatRequest sDCardFormatRequest = this.sdFormatRequest_;
            return sDCardFormatRequest == null ? SDCardFormatRequest.getDefaultInstance() : sDCardFormatRequest;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardFormatRequestOrBuilder getSdFormatRequestOrBuilder() {
            SDCardFormatRequest sDCardFormatRequest = this.sdFormatRequest_;
            return sDCardFormatRequest == null ? SDCardFormatRequest.getDefaultInstance() : sDCardFormatRequest;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardFormatResponse getSdFormatResponse() {
            SDCardFormatResponse sDCardFormatResponse = this.sdFormatResponse_;
            return sDCardFormatResponse == null ? SDCardFormatResponse.getDefaultInstance() : sDCardFormatResponse;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardFormatResponseOrBuilder getSdFormatResponseOrBuilder() {
            SDCardFormatResponse sDCardFormatResponse = this.sdFormatResponse_;
            return sDCardFormatResponse == null ? SDCardFormatResponse.getDefaultInstance() : sDCardFormatResponse;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardTimeRemainingNotification getSdTimeRemainingNotification() {
            SDCardTimeRemainingNotification sDCardTimeRemainingNotification = this.sdTimeRemainingNotification_;
            return sDCardTimeRemainingNotification == null ? SDCardTimeRemainingNotification.getDefaultInstance() : sDCardTimeRemainingNotification;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardTimeRemainingNotificationOrBuilder getSdTimeRemainingNotificationOrBuilder() {
            SDCardTimeRemainingNotification sDCardTimeRemainingNotification = this.sdTimeRemainingNotification_;
            return sDCardTimeRemainingNotification == null ? SDCardTimeRemainingNotification.getDefaultInstance() : sDCardTimeRemainingNotification;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardTimeRemainingRequest getSdTimeRemainingRequest() {
            SDCardTimeRemainingRequest sDCardTimeRemainingRequest = this.sdTimeRemainingRequest_;
            return sDCardTimeRemainingRequest == null ? SDCardTimeRemainingRequest.getDefaultInstance() : sDCardTimeRemainingRequest;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardTimeRemainingRequestOrBuilder getSdTimeRemainingRequestOrBuilder() {
            SDCardTimeRemainingRequest sDCardTimeRemainingRequest = this.sdTimeRemainingRequest_;
            return sDCardTimeRemainingRequest == null ? SDCardTimeRemainingRequest.getDefaultInstance() : sDCardTimeRemainingRequest;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardTimeRemainingResponse getSdTimeRemainingResponse() {
            SDCardTimeRemainingResponse sDCardTimeRemainingResponse = this.sdTimeRemainingResponse_;
            return sDCardTimeRemainingResponse == null ? SDCardTimeRemainingResponse.getDefaultInstance() : sDCardTimeRemainingResponse;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public SDCardTimeRemainingResponseOrBuilder getSdTimeRemainingResponseOrBuilder() {
            SDCardTimeRemainingResponse sDCardTimeRemainingResponse = this.sdTimeRemainingResponse_;
            return sDCardTimeRemainingResponse == null ? SDCardTimeRemainingResponse.getDefaultInstance() : sDCardTimeRemainingResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSdFormatRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSdFormatResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getSdFormatNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getSdErrorNotification());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getSdTimeRemainingRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getSdTimeRemainingResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getSdTimeRemainingNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public boolean hasSdErrorNotification() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public boolean hasSdFormatNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public boolean hasSdFormatRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public boolean hasSdFormatResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public boolean hasSdTimeRemainingNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public boolean hasSdTimeRemainingRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
        public boolean hasSdTimeRemainingResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSdFormatRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSdFormatRequest().hashCode();
            }
            if (hasSdFormatResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSdFormatResponse().hashCode();
            }
            if (hasSdFormatNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSdFormatNotification().hashCode();
            }
            if (hasSdErrorNotification()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSdErrorNotification().hashCode();
            }
            if (hasSdTimeRemainingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSdTimeRemainingRequest().hashCode();
            }
            if (hasSdTimeRemainingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getSdTimeRemainingResponse().hashCode();
            }
            if (hasSdTimeRemainingNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getSdTimeRemainingNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISDCard.internal_static_GDI_Proto_SDCard_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSdFormatRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSdFormatResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSdFormatNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSdErrorNotification());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSdTimeRemainingRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getSdTimeRemainingResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getSdTimeRemainingNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SDCardErrorNotification, SDCardErrorNotification.Builder, SDCardErrorNotificationOrBuilder> sdErrorNotificationBuilder_;
            private SDCardErrorNotification sdErrorNotification_;
            private SingleFieldBuilderV3<SDCardFormatNotification, SDCardFormatNotification.Builder, SDCardFormatNotificationOrBuilder> sdFormatNotificationBuilder_;
            private SDCardFormatNotification sdFormatNotification_;
            private SingleFieldBuilderV3<SDCardFormatRequest, SDCardFormatRequest.Builder, SDCardFormatRequestOrBuilder> sdFormatRequestBuilder_;
            private SDCardFormatRequest sdFormatRequest_;
            private SingleFieldBuilderV3<SDCardFormatResponse, SDCardFormatResponse.Builder, SDCardFormatResponseOrBuilder> sdFormatResponseBuilder_;
            private SDCardFormatResponse sdFormatResponse_;
            private SingleFieldBuilderV3<SDCardTimeRemainingNotification, SDCardTimeRemainingNotification.Builder, SDCardTimeRemainingNotificationOrBuilder> sdTimeRemainingNotificationBuilder_;
            private SDCardTimeRemainingNotification sdTimeRemainingNotification_;
            private SingleFieldBuilderV3<SDCardTimeRemainingRequest, SDCardTimeRemainingRequest.Builder, SDCardTimeRemainingRequestOrBuilder> sdTimeRemainingRequestBuilder_;
            private SDCardTimeRemainingRequest sdTimeRemainingRequest_;
            private SingleFieldBuilderV3<SDCardTimeRemainingResponse, SDCardTimeRemainingResponse.Builder, SDCardTimeRemainingResponseOrBuilder> sdTimeRemainingResponseBuilder_;
            private SDCardTimeRemainingResponse sdTimeRemainingResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SDCardFormatRequest, SDCardFormatRequest.Builder, SDCardFormatRequestOrBuilder> singleFieldBuilderV3 = this.sdFormatRequestBuilder_;
                    service.sdFormatRequest_ = singleFieldBuilderV3 == null ? this.sdFormatRequest_ : (SDCardFormatRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SDCardFormatResponse, SDCardFormatResponse.Builder, SDCardFormatResponseOrBuilder> singleFieldBuilderV4 = this.sdFormatResponseBuilder_;
                    service.sdFormatResponse_ = singleFieldBuilderV4 == null ? this.sdFormatResponse_ : (SDCardFormatResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SDCardFormatNotification, SDCardFormatNotification.Builder, SDCardFormatNotificationOrBuilder> singleFieldBuilderV5 = this.sdFormatNotificationBuilder_;
                    service.sdFormatNotification_ = singleFieldBuilderV5 == null ? this.sdFormatNotification_ : (SDCardFormatNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<SDCardErrorNotification, SDCardErrorNotification.Builder, SDCardErrorNotificationOrBuilder> singleFieldBuilderV6 = this.sdErrorNotificationBuilder_;
                    service.sdErrorNotification_ = singleFieldBuilderV6 == null ? this.sdErrorNotification_ : (SDCardErrorNotification) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<SDCardTimeRemainingRequest, SDCardTimeRemainingRequest.Builder, SDCardTimeRemainingRequestOrBuilder> singleFieldBuilderV7 = this.sdTimeRemainingRequestBuilder_;
                    service.sdTimeRemainingRequest_ = singleFieldBuilderV7 == null ? this.sdTimeRemainingRequest_ : (SDCardTimeRemainingRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<SDCardTimeRemainingResponse, SDCardTimeRemainingResponse.Builder, SDCardTimeRemainingResponseOrBuilder> singleFieldBuilderV8 = this.sdTimeRemainingResponseBuilder_;
                    service.sdTimeRemainingResponse_ = singleFieldBuilderV8 == null ? this.sdTimeRemainingResponse_ : (SDCardTimeRemainingResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<SDCardTimeRemainingNotification, SDCardTimeRemainingNotification.Builder, SDCardTimeRemainingNotificationOrBuilder> singleFieldBuilderV9 = this.sdTimeRemainingNotificationBuilder_;
                    service.sdTimeRemainingNotification_ = singleFieldBuilderV9 == null ? this.sdTimeRemainingNotification_ : (SDCardTimeRemainingNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_Service_descriptor;
            }

            private SingleFieldBuilderV3<SDCardErrorNotification, SDCardErrorNotification.Builder, SDCardErrorNotificationOrBuilder> getSdErrorNotificationFieldBuilder() {
                if (this.sdErrorNotificationBuilder_ == null) {
                    this.sdErrorNotificationBuilder_ = new SingleFieldBuilderV3<>(getSdErrorNotification(), getParentForChildren(), isClean());
                    this.sdErrorNotification_ = null;
                }
                return this.sdErrorNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SDCardFormatNotification, SDCardFormatNotification.Builder, SDCardFormatNotificationOrBuilder> getSdFormatNotificationFieldBuilder() {
                if (this.sdFormatNotificationBuilder_ == null) {
                    this.sdFormatNotificationBuilder_ = new SingleFieldBuilderV3<>(getSdFormatNotification(), getParentForChildren(), isClean());
                    this.sdFormatNotification_ = null;
                }
                return this.sdFormatNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SDCardFormatRequest, SDCardFormatRequest.Builder, SDCardFormatRequestOrBuilder> getSdFormatRequestFieldBuilder() {
                if (this.sdFormatRequestBuilder_ == null) {
                    this.sdFormatRequestBuilder_ = new SingleFieldBuilderV3<>(getSdFormatRequest(), getParentForChildren(), isClean());
                    this.sdFormatRequest_ = null;
                }
                return this.sdFormatRequestBuilder_;
            }

            private SingleFieldBuilderV3<SDCardFormatResponse, SDCardFormatResponse.Builder, SDCardFormatResponseOrBuilder> getSdFormatResponseFieldBuilder() {
                if (this.sdFormatResponseBuilder_ == null) {
                    this.sdFormatResponseBuilder_ = new SingleFieldBuilderV3<>(getSdFormatResponse(), getParentForChildren(), isClean());
                    this.sdFormatResponse_ = null;
                }
                return this.sdFormatResponseBuilder_;
            }

            private SingleFieldBuilderV3<SDCardTimeRemainingNotification, SDCardTimeRemainingNotification.Builder, SDCardTimeRemainingNotificationOrBuilder> getSdTimeRemainingNotificationFieldBuilder() {
                if (this.sdTimeRemainingNotificationBuilder_ == null) {
                    this.sdTimeRemainingNotificationBuilder_ = new SingleFieldBuilderV3<>(getSdTimeRemainingNotification(), getParentForChildren(), isClean());
                    this.sdTimeRemainingNotification_ = null;
                }
                return this.sdTimeRemainingNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SDCardTimeRemainingRequest, SDCardTimeRemainingRequest.Builder, SDCardTimeRemainingRequestOrBuilder> getSdTimeRemainingRequestFieldBuilder() {
                if (this.sdTimeRemainingRequestBuilder_ == null) {
                    this.sdTimeRemainingRequestBuilder_ = new SingleFieldBuilderV3<>(getSdTimeRemainingRequest(), getParentForChildren(), isClean());
                    this.sdTimeRemainingRequest_ = null;
                }
                return this.sdTimeRemainingRequestBuilder_;
            }

            private SingleFieldBuilderV3<SDCardTimeRemainingResponse, SDCardTimeRemainingResponse.Builder, SDCardTimeRemainingResponseOrBuilder> getSdTimeRemainingResponseFieldBuilder() {
                if (this.sdTimeRemainingResponseBuilder_ == null) {
                    this.sdTimeRemainingResponseBuilder_ = new SingleFieldBuilderV3<>(getSdTimeRemainingResponse(), getParentForChildren(), isClean());
                    this.sdTimeRemainingResponse_ = null;
                }
                return this.sdTimeRemainingResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSdFormatRequestFieldBuilder();
                    getSdFormatResponseFieldBuilder();
                    getSdFormatNotificationFieldBuilder();
                    getSdErrorNotificationFieldBuilder();
                    getSdTimeRemainingRequestFieldBuilder();
                    getSdTimeRemainingResponseFieldBuilder();
                    getSdTimeRemainingNotificationFieldBuilder();
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
                this.sdFormatRequest_ = null;
                SingleFieldBuilderV3<SDCardFormatRequest, SDCardFormatRequest.Builder, SDCardFormatRequestOrBuilder> singleFieldBuilderV3 = this.sdFormatRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sdFormatRequestBuilder_ = null;
                }
                this.sdFormatResponse_ = null;
                SingleFieldBuilderV3<SDCardFormatResponse, SDCardFormatResponse.Builder, SDCardFormatResponseOrBuilder> singleFieldBuilderV4 = this.sdFormatResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.sdFormatResponseBuilder_ = null;
                }
                this.sdFormatNotification_ = null;
                SingleFieldBuilderV3<SDCardFormatNotification, SDCardFormatNotification.Builder, SDCardFormatNotificationOrBuilder> singleFieldBuilderV5 = this.sdFormatNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.sdFormatNotificationBuilder_ = null;
                }
                this.sdErrorNotification_ = null;
                SingleFieldBuilderV3<SDCardErrorNotification, SDCardErrorNotification.Builder, SDCardErrorNotificationOrBuilder> singleFieldBuilderV6 = this.sdErrorNotificationBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.sdErrorNotificationBuilder_ = null;
                }
                this.sdTimeRemainingRequest_ = null;
                SingleFieldBuilderV3<SDCardTimeRemainingRequest, SDCardTimeRemainingRequest.Builder, SDCardTimeRemainingRequestOrBuilder> singleFieldBuilderV7 = this.sdTimeRemainingRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.sdTimeRemainingRequestBuilder_ = null;
                }
                this.sdTimeRemainingResponse_ = null;
                SingleFieldBuilderV3<SDCardTimeRemainingResponse, SDCardTimeRemainingResponse.Builder, SDCardTimeRemainingResponseOrBuilder> singleFieldBuilderV8 = this.sdTimeRemainingResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.sdTimeRemainingResponseBuilder_ = null;
                }
                this.sdTimeRemainingNotification_ = null;
                SingleFieldBuilderV3<SDCardTimeRemainingNotification, SDCardTimeRemainingNotification.Builder, SDCardTimeRemainingNotificationOrBuilder> singleFieldBuilderV9 = this.sdTimeRemainingNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.sdTimeRemainingNotificationBuilder_ = null;
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

            public Builder clearSdErrorNotification() {
                this.bitField0_ &= -9;
                this.sdErrorNotification_ = null;
                SingleFieldBuilderV3<SDCardErrorNotification, SDCardErrorNotification.Builder, SDCardErrorNotificationOrBuilder> singleFieldBuilderV3 = this.sdErrorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sdErrorNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSdFormatNotification() {
                this.bitField0_ &= -5;
                this.sdFormatNotification_ = null;
                SingleFieldBuilderV3<SDCardFormatNotification, SDCardFormatNotification.Builder, SDCardFormatNotificationOrBuilder> singleFieldBuilderV3 = this.sdFormatNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sdFormatNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSdFormatRequest() {
                this.bitField0_ &= -2;
                this.sdFormatRequest_ = null;
                SingleFieldBuilderV3<SDCardFormatRequest, SDCardFormatRequest.Builder, SDCardFormatRequestOrBuilder> singleFieldBuilderV3 = this.sdFormatRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sdFormatRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSdFormatResponse() {
                this.bitField0_ &= -3;
                this.sdFormatResponse_ = null;
                SingleFieldBuilderV3<SDCardFormatResponse, SDCardFormatResponse.Builder, SDCardFormatResponseOrBuilder> singleFieldBuilderV3 = this.sdFormatResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sdFormatResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSdTimeRemainingNotification() {
                this.bitField0_ &= -65;
                this.sdTimeRemainingNotification_ = null;
                SingleFieldBuilderV3<SDCardTimeRemainingNotification, SDCardTimeRemainingNotification.Builder, SDCardTimeRemainingNotificationOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sdTimeRemainingNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSdTimeRemainingRequest() {
                this.bitField0_ &= -17;
                this.sdTimeRemainingRequest_ = null;
                SingleFieldBuilderV3<SDCardTimeRemainingRequest, SDCardTimeRemainingRequest.Builder, SDCardTimeRemainingRequestOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sdTimeRemainingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSdTimeRemainingResponse() {
                this.bitField0_ &= -33;
                this.sdTimeRemainingResponse_ = null;
                SingleFieldBuilderV3<SDCardTimeRemainingResponse, SDCardTimeRemainingResponse.Builder, SDCardTimeRemainingResponseOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sdTimeRemainingResponseBuilder_ = null;
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
                return GDISDCard.internal_static_GDI_Proto_SDCard_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardErrorNotification getSdErrorNotification() {
                SingleFieldBuilderV3<SDCardErrorNotification, SDCardErrorNotification.Builder, SDCardErrorNotificationOrBuilder> singleFieldBuilderV3 = this.sdErrorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardErrorNotification) singleFieldBuilderV3.getMessage();
                }
                SDCardErrorNotification sDCardErrorNotification = this.sdErrorNotification_;
                return sDCardErrorNotification == null ? SDCardErrorNotification.getDefaultInstance() : sDCardErrorNotification;
            }

            public SDCardErrorNotification.Builder getSdErrorNotificationBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SDCardErrorNotification.Builder) getSdErrorNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardErrorNotificationOrBuilder getSdErrorNotificationOrBuilder() {
                SingleFieldBuilderV3<SDCardErrorNotification, SDCardErrorNotification.Builder, SDCardErrorNotificationOrBuilder> singleFieldBuilderV3 = this.sdErrorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardErrorNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SDCardErrorNotification sDCardErrorNotification = this.sdErrorNotification_;
                return sDCardErrorNotification == null ? SDCardErrorNotification.getDefaultInstance() : sDCardErrorNotification;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardFormatNotification getSdFormatNotification() {
                SingleFieldBuilderV3<SDCardFormatNotification, SDCardFormatNotification.Builder, SDCardFormatNotificationOrBuilder> singleFieldBuilderV3 = this.sdFormatNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardFormatNotification) singleFieldBuilderV3.getMessage();
                }
                SDCardFormatNotification sDCardFormatNotification = this.sdFormatNotification_;
                return sDCardFormatNotification == null ? SDCardFormatNotification.getDefaultInstance() : sDCardFormatNotification;
            }

            public SDCardFormatNotification.Builder getSdFormatNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SDCardFormatNotification.Builder) getSdFormatNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardFormatNotificationOrBuilder getSdFormatNotificationOrBuilder() {
                SingleFieldBuilderV3<SDCardFormatNotification, SDCardFormatNotification.Builder, SDCardFormatNotificationOrBuilder> singleFieldBuilderV3 = this.sdFormatNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardFormatNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SDCardFormatNotification sDCardFormatNotification = this.sdFormatNotification_;
                return sDCardFormatNotification == null ? SDCardFormatNotification.getDefaultInstance() : sDCardFormatNotification;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardFormatRequest getSdFormatRequest() {
                SingleFieldBuilderV3<SDCardFormatRequest, SDCardFormatRequest.Builder, SDCardFormatRequestOrBuilder> singleFieldBuilderV3 = this.sdFormatRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardFormatRequest) singleFieldBuilderV3.getMessage();
                }
                SDCardFormatRequest sDCardFormatRequest = this.sdFormatRequest_;
                return sDCardFormatRequest == null ? SDCardFormatRequest.getDefaultInstance() : sDCardFormatRequest;
            }

            public SDCardFormatRequest.Builder getSdFormatRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SDCardFormatRequest.Builder) getSdFormatRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardFormatRequestOrBuilder getSdFormatRequestOrBuilder() {
                SingleFieldBuilderV3<SDCardFormatRequest, SDCardFormatRequest.Builder, SDCardFormatRequestOrBuilder> singleFieldBuilderV3 = this.sdFormatRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardFormatRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SDCardFormatRequest sDCardFormatRequest = this.sdFormatRequest_;
                return sDCardFormatRequest == null ? SDCardFormatRequest.getDefaultInstance() : sDCardFormatRequest;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardFormatResponse getSdFormatResponse() {
                SingleFieldBuilderV3<SDCardFormatResponse, SDCardFormatResponse.Builder, SDCardFormatResponseOrBuilder> singleFieldBuilderV3 = this.sdFormatResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardFormatResponse) singleFieldBuilderV3.getMessage();
                }
                SDCardFormatResponse sDCardFormatResponse = this.sdFormatResponse_;
                return sDCardFormatResponse == null ? SDCardFormatResponse.getDefaultInstance() : sDCardFormatResponse;
            }

            public SDCardFormatResponse.Builder getSdFormatResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SDCardFormatResponse.Builder) getSdFormatResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardFormatResponseOrBuilder getSdFormatResponseOrBuilder() {
                SingleFieldBuilderV3<SDCardFormatResponse, SDCardFormatResponse.Builder, SDCardFormatResponseOrBuilder> singleFieldBuilderV3 = this.sdFormatResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardFormatResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SDCardFormatResponse sDCardFormatResponse = this.sdFormatResponse_;
                return sDCardFormatResponse == null ? SDCardFormatResponse.getDefaultInstance() : sDCardFormatResponse;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardTimeRemainingNotification getSdTimeRemainingNotification() {
                SingleFieldBuilderV3<SDCardTimeRemainingNotification, SDCardTimeRemainingNotification.Builder, SDCardTimeRemainingNotificationOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardTimeRemainingNotification) singleFieldBuilderV3.getMessage();
                }
                SDCardTimeRemainingNotification sDCardTimeRemainingNotification = this.sdTimeRemainingNotification_;
                return sDCardTimeRemainingNotification == null ? SDCardTimeRemainingNotification.getDefaultInstance() : sDCardTimeRemainingNotification;
            }

            public SDCardTimeRemainingNotification.Builder getSdTimeRemainingNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (SDCardTimeRemainingNotification.Builder) getSdTimeRemainingNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardTimeRemainingNotificationOrBuilder getSdTimeRemainingNotificationOrBuilder() {
                SingleFieldBuilderV3<SDCardTimeRemainingNotification, SDCardTimeRemainingNotification.Builder, SDCardTimeRemainingNotificationOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardTimeRemainingNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SDCardTimeRemainingNotification sDCardTimeRemainingNotification = this.sdTimeRemainingNotification_;
                return sDCardTimeRemainingNotification == null ? SDCardTimeRemainingNotification.getDefaultInstance() : sDCardTimeRemainingNotification;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardTimeRemainingRequest getSdTimeRemainingRequest() {
                SingleFieldBuilderV3<SDCardTimeRemainingRequest, SDCardTimeRemainingRequest.Builder, SDCardTimeRemainingRequestOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardTimeRemainingRequest) singleFieldBuilderV3.getMessage();
                }
                SDCardTimeRemainingRequest sDCardTimeRemainingRequest = this.sdTimeRemainingRequest_;
                return sDCardTimeRemainingRequest == null ? SDCardTimeRemainingRequest.getDefaultInstance() : sDCardTimeRemainingRequest;
            }

            public SDCardTimeRemainingRequest.Builder getSdTimeRemainingRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SDCardTimeRemainingRequest.Builder) getSdTimeRemainingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardTimeRemainingRequestOrBuilder getSdTimeRemainingRequestOrBuilder() {
                SingleFieldBuilderV3<SDCardTimeRemainingRequest, SDCardTimeRemainingRequest.Builder, SDCardTimeRemainingRequestOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardTimeRemainingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SDCardTimeRemainingRequest sDCardTimeRemainingRequest = this.sdTimeRemainingRequest_;
                return sDCardTimeRemainingRequest == null ? SDCardTimeRemainingRequest.getDefaultInstance() : sDCardTimeRemainingRequest;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardTimeRemainingResponse getSdTimeRemainingResponse() {
                SingleFieldBuilderV3<SDCardTimeRemainingResponse, SDCardTimeRemainingResponse.Builder, SDCardTimeRemainingResponseOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardTimeRemainingResponse) singleFieldBuilderV3.getMessage();
                }
                SDCardTimeRemainingResponse sDCardTimeRemainingResponse = this.sdTimeRemainingResponse_;
                return sDCardTimeRemainingResponse == null ? SDCardTimeRemainingResponse.getDefaultInstance() : sDCardTimeRemainingResponse;
            }

            public SDCardTimeRemainingResponse.Builder getSdTimeRemainingResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (SDCardTimeRemainingResponse.Builder) getSdTimeRemainingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public SDCardTimeRemainingResponseOrBuilder getSdTimeRemainingResponseOrBuilder() {
                SingleFieldBuilderV3<SDCardTimeRemainingResponse, SDCardTimeRemainingResponse.Builder, SDCardTimeRemainingResponseOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SDCardTimeRemainingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SDCardTimeRemainingResponse sDCardTimeRemainingResponse = this.sdTimeRemainingResponse_;
                return sDCardTimeRemainingResponse == null ? SDCardTimeRemainingResponse.getDefaultInstance() : sDCardTimeRemainingResponse;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public boolean hasSdErrorNotification() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public boolean hasSdFormatNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public boolean hasSdFormatRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public boolean hasSdFormatResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public boolean hasSdTimeRemainingNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public boolean hasSdTimeRemainingRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDISDCard.ServiceOrBuilder
            public boolean hasSdTimeRemainingResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISDCard.internal_static_GDI_Proto_SDCard_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                                if (tag == 10) {
                                    codedInputStream.readMessage(getSdFormatRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSdFormatResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSdFormatNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getSdErrorNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getSdTimeRemainingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getSdTimeRemainingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getSdTimeRemainingNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSdErrorNotification(SDCardErrorNotification sDCardErrorNotification) {
                SDCardErrorNotification sDCardErrorNotification2;
                SingleFieldBuilderV3<SDCardErrorNotification, SDCardErrorNotification.Builder, SDCardErrorNotificationOrBuilder> singleFieldBuilderV3 = this.sdErrorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sDCardErrorNotification);
                } else if ((this.bitField0_ & 8) == 0 || (sDCardErrorNotification2 = this.sdErrorNotification_) == null || sDCardErrorNotification2 == SDCardErrorNotification.getDefaultInstance()) {
                    this.sdErrorNotification_ = sDCardErrorNotification;
                } else {
                    getSdErrorNotificationBuilder().mergeFrom(sDCardErrorNotification);
                }
                if (this.sdErrorNotification_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSdFormatNotification(SDCardFormatNotification sDCardFormatNotification) {
                SDCardFormatNotification sDCardFormatNotification2;
                SingleFieldBuilderV3<SDCardFormatNotification, SDCardFormatNotification.Builder, SDCardFormatNotificationOrBuilder> singleFieldBuilderV3 = this.sdFormatNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sDCardFormatNotification);
                } else if ((this.bitField0_ & 4) == 0 || (sDCardFormatNotification2 = this.sdFormatNotification_) == null || sDCardFormatNotification2 == SDCardFormatNotification.getDefaultInstance()) {
                    this.sdFormatNotification_ = sDCardFormatNotification;
                } else {
                    getSdFormatNotificationBuilder().mergeFrom(sDCardFormatNotification);
                }
                if (this.sdFormatNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSdFormatRequest(SDCardFormatRequest sDCardFormatRequest) {
                SDCardFormatRequest sDCardFormatRequest2;
                SingleFieldBuilderV3<SDCardFormatRequest, SDCardFormatRequest.Builder, SDCardFormatRequestOrBuilder> singleFieldBuilderV3 = this.sdFormatRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sDCardFormatRequest);
                } else if ((this.bitField0_ & 1) == 0 || (sDCardFormatRequest2 = this.sdFormatRequest_) == null || sDCardFormatRequest2 == SDCardFormatRequest.getDefaultInstance()) {
                    this.sdFormatRequest_ = sDCardFormatRequest;
                } else {
                    getSdFormatRequestBuilder().mergeFrom(sDCardFormatRequest);
                }
                if (this.sdFormatRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSdFormatResponse(SDCardFormatResponse sDCardFormatResponse) {
                SDCardFormatResponse sDCardFormatResponse2;
                SingleFieldBuilderV3<SDCardFormatResponse, SDCardFormatResponse.Builder, SDCardFormatResponseOrBuilder> singleFieldBuilderV3 = this.sdFormatResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sDCardFormatResponse);
                } else if ((this.bitField0_ & 2) == 0 || (sDCardFormatResponse2 = this.sdFormatResponse_) == null || sDCardFormatResponse2 == SDCardFormatResponse.getDefaultInstance()) {
                    this.sdFormatResponse_ = sDCardFormatResponse;
                } else {
                    getSdFormatResponseBuilder().mergeFrom(sDCardFormatResponse);
                }
                if (this.sdFormatResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSdTimeRemainingNotification(SDCardTimeRemainingNotification sDCardTimeRemainingNotification) {
                SDCardTimeRemainingNotification sDCardTimeRemainingNotification2;
                SingleFieldBuilderV3<SDCardTimeRemainingNotification, SDCardTimeRemainingNotification.Builder, SDCardTimeRemainingNotificationOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sDCardTimeRemainingNotification);
                } else if ((this.bitField0_ & 64) == 0 || (sDCardTimeRemainingNotification2 = this.sdTimeRemainingNotification_) == null || sDCardTimeRemainingNotification2 == SDCardTimeRemainingNotification.getDefaultInstance()) {
                    this.sdTimeRemainingNotification_ = sDCardTimeRemainingNotification;
                } else {
                    getSdTimeRemainingNotificationBuilder().mergeFrom(sDCardTimeRemainingNotification);
                }
                if (this.sdTimeRemainingNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSdTimeRemainingRequest(SDCardTimeRemainingRequest sDCardTimeRemainingRequest) {
                SDCardTimeRemainingRequest sDCardTimeRemainingRequest2;
                SingleFieldBuilderV3<SDCardTimeRemainingRequest, SDCardTimeRemainingRequest.Builder, SDCardTimeRemainingRequestOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sDCardTimeRemainingRequest);
                } else if ((this.bitField0_ & 16) == 0 || (sDCardTimeRemainingRequest2 = this.sdTimeRemainingRequest_) == null || sDCardTimeRemainingRequest2 == SDCardTimeRemainingRequest.getDefaultInstance()) {
                    this.sdTimeRemainingRequest_ = sDCardTimeRemainingRequest;
                } else {
                    getSdTimeRemainingRequestBuilder().mergeFrom(sDCardTimeRemainingRequest);
                }
                if (this.sdTimeRemainingRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSdTimeRemainingResponse(SDCardTimeRemainingResponse sDCardTimeRemainingResponse) {
                SDCardTimeRemainingResponse sDCardTimeRemainingResponse2;
                SingleFieldBuilderV3<SDCardTimeRemainingResponse, SDCardTimeRemainingResponse.Builder, SDCardTimeRemainingResponseOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sDCardTimeRemainingResponse);
                } else if ((this.bitField0_ & 32) == 0 || (sDCardTimeRemainingResponse2 = this.sdTimeRemainingResponse_) == null || sDCardTimeRemainingResponse2 == SDCardTimeRemainingResponse.getDefaultInstance()) {
                    this.sdTimeRemainingResponse_ = sDCardTimeRemainingResponse;
                } else {
                    getSdTimeRemainingResponseBuilder().mergeFrom(sDCardTimeRemainingResponse);
                }
                if (this.sdTimeRemainingResponse_ != null) {
                    this.bitField0_ |= 32;
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

            public Builder setSdErrorNotification(SDCardErrorNotification.Builder builder) {
                SingleFieldBuilderV3<SDCardErrorNotification, SDCardErrorNotification.Builder, SDCardErrorNotificationOrBuilder> singleFieldBuilderV3 = this.sdErrorNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sdErrorNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSdFormatNotification(SDCardFormatNotification.Builder builder) {
                SingleFieldBuilderV3<SDCardFormatNotification, SDCardFormatNotification.Builder, SDCardFormatNotificationOrBuilder> singleFieldBuilderV3 = this.sdFormatNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sdFormatNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSdFormatRequest(SDCardFormatRequest.Builder builder) {
                SingleFieldBuilderV3<SDCardFormatRequest, SDCardFormatRequest.Builder, SDCardFormatRequestOrBuilder> singleFieldBuilderV3 = this.sdFormatRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sdFormatRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSdFormatResponse(SDCardFormatResponse.Builder builder) {
                SingleFieldBuilderV3<SDCardFormatResponse, SDCardFormatResponse.Builder, SDCardFormatResponseOrBuilder> singleFieldBuilderV3 = this.sdFormatResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sdFormatResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSdTimeRemainingNotification(SDCardTimeRemainingNotification.Builder builder) {
                SingleFieldBuilderV3<SDCardTimeRemainingNotification, SDCardTimeRemainingNotification.Builder, SDCardTimeRemainingNotificationOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sdTimeRemainingNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSdTimeRemainingRequest(SDCardTimeRemainingRequest.Builder builder) {
                SingleFieldBuilderV3<SDCardTimeRemainingRequest, SDCardTimeRemainingRequest.Builder, SDCardTimeRemainingRequestOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sdTimeRemainingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSdTimeRemainingResponse(SDCardTimeRemainingResponse.Builder builder) {
                SingleFieldBuilderV3<SDCardTimeRemainingResponse, SDCardTimeRemainingResponse.Builder, SDCardTimeRemainingResponseOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sdTimeRemainingResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
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

            public Builder setSdErrorNotification(SDCardErrorNotification sDCardErrorNotification) {
                SingleFieldBuilderV3<SDCardErrorNotification, SDCardErrorNotification.Builder, SDCardErrorNotificationOrBuilder> singleFieldBuilderV3 = this.sdErrorNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sDCardErrorNotification.getClass();
                    this.sdErrorNotification_ = sDCardErrorNotification;
                } else {
                    singleFieldBuilderV3.setMessage(sDCardErrorNotification);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSdFormatNotification(SDCardFormatNotification sDCardFormatNotification) {
                SingleFieldBuilderV3<SDCardFormatNotification, SDCardFormatNotification.Builder, SDCardFormatNotificationOrBuilder> singleFieldBuilderV3 = this.sdFormatNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sDCardFormatNotification.getClass();
                    this.sdFormatNotification_ = sDCardFormatNotification;
                } else {
                    singleFieldBuilderV3.setMessage(sDCardFormatNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSdFormatRequest(SDCardFormatRequest sDCardFormatRequest) {
                SingleFieldBuilderV3<SDCardFormatRequest, SDCardFormatRequest.Builder, SDCardFormatRequestOrBuilder> singleFieldBuilderV3 = this.sdFormatRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sDCardFormatRequest.getClass();
                    this.sdFormatRequest_ = sDCardFormatRequest;
                } else {
                    singleFieldBuilderV3.setMessage(sDCardFormatRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSdFormatResponse(SDCardFormatResponse sDCardFormatResponse) {
                SingleFieldBuilderV3<SDCardFormatResponse, SDCardFormatResponse.Builder, SDCardFormatResponseOrBuilder> singleFieldBuilderV3 = this.sdFormatResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sDCardFormatResponse.getClass();
                    this.sdFormatResponse_ = sDCardFormatResponse;
                } else {
                    singleFieldBuilderV3.setMessage(sDCardFormatResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSdTimeRemainingNotification(SDCardTimeRemainingNotification sDCardTimeRemainingNotification) {
                SingleFieldBuilderV3<SDCardTimeRemainingNotification, SDCardTimeRemainingNotification.Builder, SDCardTimeRemainingNotificationOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sDCardTimeRemainingNotification.getClass();
                    this.sdTimeRemainingNotification_ = sDCardTimeRemainingNotification;
                } else {
                    singleFieldBuilderV3.setMessage(sDCardTimeRemainingNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSdTimeRemainingRequest(SDCardTimeRemainingRequest sDCardTimeRemainingRequest) {
                SingleFieldBuilderV3<SDCardTimeRemainingRequest, SDCardTimeRemainingRequest.Builder, SDCardTimeRemainingRequestOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sDCardTimeRemainingRequest.getClass();
                    this.sdTimeRemainingRequest_ = sDCardTimeRemainingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(sDCardTimeRemainingRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSdTimeRemainingResponse(SDCardTimeRemainingResponse sDCardTimeRemainingResponse) {
                SingleFieldBuilderV3<SDCardTimeRemainingResponse, SDCardTimeRemainingResponse.Builder, SDCardTimeRemainingResponseOrBuilder> singleFieldBuilderV3 = this.sdTimeRemainingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sDCardTimeRemainingResponse.getClass();
                    this.sdTimeRemainingResponse_ = sDCardTimeRemainingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(sDCardTimeRemainingResponse);
                }
                this.bitField0_ |= 32;
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
                if (service.hasSdFormatRequest()) {
                    mergeSdFormatRequest(service.getSdFormatRequest());
                }
                if (service.hasSdFormatResponse()) {
                    mergeSdFormatResponse(service.getSdFormatResponse());
                }
                if (service.hasSdFormatNotification()) {
                    mergeSdFormatNotification(service.getSdFormatNotification());
                }
                if (service.hasSdErrorNotification()) {
                    mergeSdErrorNotification(service.getSdErrorNotification());
                }
                if (service.hasSdTimeRemainingRequest()) {
                    mergeSdTimeRemainingRequest(service.getSdTimeRemainingRequest());
                }
                if (service.hasSdTimeRemainingResponse()) {
                    mergeSdTimeRemainingResponse(service.getSdTimeRemainingResponse());
                }
                if (service.hasSdTimeRemainingNotification()) {
                    mergeSdTimeRemainingNotification(service.getSdTimeRemainingNotification());
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

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
