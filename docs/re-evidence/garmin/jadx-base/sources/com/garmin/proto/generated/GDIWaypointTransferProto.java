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

/* JADX INFO: loaded from: classes13.dex */
public final class GDIWaypointTransferProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019GDIWaypointTransfer.proto\u0012\u001aGDI.Proto.WaypointTransfer\u001a\u0012GDIDataTypes.proto\"©\u0001\n\u0017WaypointTransferService\u0012E\n\u0010waypoint_request\u0018\u0001 \u0001(\u000b2+.GDI.Proto.WaypointTransfer.WaypointRequest\u0012G\n\u0011waypoint_response\u0018\u0002 \u0001(\u000b2,.GDI.Proto.WaypointTransfer.WaypointResponse\"\u0091\u0001\n\u000fWaypointRequest\u0012.\n\blocation\u0018\u0001 \u0002(\u000b2\u001c.GDI.Proto.DataTypes.ScPoint\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012@\n\u0011coordinate_system\u0018\u0003 \u0001(\u000e2%.GDI.Proto.DataTypes.CoordinateSystem\"µ\u0001\n\u0010WaypointResponse\u0012K\n\u0006status\u0018\u0001 \u0002(\u000e2;.GDI.Proto.WaypointTransfer.WaypointResponse.ResponseStatus\"T\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0012\n\u000eALREADY_EXISTS\u0010\u0002\u0012\t\n\u0005ERROR\u0010\u0003B8\n\u001acom.garmin.proto.generatedB\u0018GDIWaypointTransferProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WaypointTransfer_WaypointRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WaypointTransfer_WaypointRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WaypointTransfer_WaypointResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WaypointTransfer_WaypointResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WaypointTransfer_WaypointTransferService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WaypointTransfer_WaypointTransferService_fieldAccessorTable;

    public interface WaypointRequestOrBuilder extends MessageOrBuilder {
        GDIDataTypes.CoordinateSystem getCoordinateSystem();

        GDIDataTypes.ScPoint getLocation();

        GDIDataTypes.ScPointOrBuilder getLocationOrBuilder();

        String getName();

        ByteString getNameBytes();

        boolean hasCoordinateSystem();

        boolean hasLocation();

        boolean hasName();
    }

    public interface WaypointResponseOrBuilder extends MessageOrBuilder {
        WaypointResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface WaypointTransferServiceOrBuilder extends MessageOrBuilder {
        WaypointRequest getWaypointRequest();

        WaypointRequestOrBuilder getWaypointRequestOrBuilder();

        WaypointResponse getWaypointResponse();

        WaypointResponseOrBuilder getWaypointResponseOrBuilder();

        boolean hasWaypointRequest();

        boolean hasWaypointResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_WaypointTransfer_WaypointTransferService_descriptor = descriptor2;
        internal_static_GDI_Proto_WaypointTransfer_WaypointTransferService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"WaypointRequest", "WaypointResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_WaypointTransfer_WaypointRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_WaypointTransfer_WaypointRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{HttpHeaders.LOCATION, "Name", "CoordinateSystem"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_WaypointTransfer_WaypointResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_WaypointTransfer_WaypointResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
        GDIDataTypes.getDescriptor();
    }

    private GDIWaypointTransferProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class WaypointRequest extends GeneratedMessageV3 implements WaypointRequestOrBuilder {
        public static final int COORDINATE_SYSTEM_FIELD_NUMBER = 3;
        public static final int LOCATION_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int coordinateSystem_;
        private GDIDataTypes.ScPoint location_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private static final WaypointRequest DEFAULT_INSTANCE = new WaypointRequest();

        @Deprecated
        public static final Parser<WaypointRequest> PARSER = new AbstractParser<WaypointRequest>() { // from class: com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequest.1
            @Override // com.google.protobuf.Parser
            public WaypointRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WaypointRequest.newBuilder();
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

        private WaypointRequest() {
            this.name_ = "";
            this.coordinateSystem_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.coordinateSystem_ = 0;
        }

        public static WaypointRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointRequest_descriptor;
        }

        public static Builder newBuilder(WaypointRequest waypointRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(waypointRequest);
        }

        public static WaypointRequest parseDelimitedFrom(InputStream inputStream) {
            return (WaypointRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WaypointRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WaypointRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WaypointRequest)) {
                return super.equals(obj);
            }
            WaypointRequest waypointRequest = (WaypointRequest) obj;
            if (hasLocation() != waypointRequest.hasLocation()) {
                return false;
            }
            if ((hasLocation() && !getLocation().equals(waypointRequest.getLocation())) || hasName() != waypointRequest.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(waypointRequest.getName())) && hasCoordinateSystem() == waypointRequest.hasCoordinateSystem()) {
                return (!hasCoordinateSystem() || this.coordinateSystem_ == waypointRequest.coordinateSystem_) && getUnknownFields().equals(waypointRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
        public GDIDataTypes.CoordinateSystem getCoordinateSystem() {
            GDIDataTypes.CoordinateSystem coordinateSystemForNumber = GDIDataTypes.CoordinateSystem.forNumber(this.coordinateSystem_);
            return coordinateSystemForNumber == null ? GDIDataTypes.CoordinateSystem.WGS84 : coordinateSystemForNumber;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
        public GDIDataTypes.ScPoint getLocation() {
            GDIDataTypes.ScPoint scPoint = this.location_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
        public GDIDataTypes.ScPointOrBuilder getLocationOrBuilder() {
            GDIDataTypes.ScPoint scPoint = this.location_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WaypointRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLocation()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(3, this.coordinateSystem_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
        public boolean hasCoordinateSystem() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
        public boolean hasLocation() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLocation()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLocation().hashCode();
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getName().hashCode();
            }
            if (hasCoordinateSystem()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.coordinateSystem_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(WaypointRequest.class, Builder.class);
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
            if (!hasLocation()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getLocation().isInitialized()) {
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
            return new WaypointRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getLocation());
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.coordinateSystem_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WaypointRequestOrBuilder {
            private int bitField0_;
            private int coordinateSystem_;
            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> locationBuilder_;
            private GDIDataTypes.ScPoint location_;
            private Object name_;

            private Builder() {
                this.name_ = "";
                this.coordinateSystem_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WaypointRequest waypointRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                    waypointRequest.location_ = singleFieldBuilderV3 == null ? this.location_ : (GDIDataTypes.ScPoint) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    waypointRequest.name_ = this.name_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    waypointRequest.coordinateSystem_ = this.coordinateSystem_;
                    i14 |= 4;
                }
                waypointRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointRequest_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> getLocationFieldBuilder() {
                if (this.locationBuilder_ == null) {
                    this.locationBuilder_ = new SingleFieldBuilderV3<>(getLocation(), getParentForChildren(), isClean());
                    this.location_ = null;
                }
                return this.locationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLocationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WaypointRequest build() {
                WaypointRequest waypointRequestBuildPartial = buildPartial();
                if (waypointRequestBuildPartial.isInitialized()) {
                    return waypointRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) waypointRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WaypointRequest buildPartial() {
                WaypointRequest waypointRequest = new WaypointRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(waypointRequest);
                }
                onBuilt();
                return waypointRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.location_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationBuilder_ = null;
                }
                this.name_ = "";
                this.coordinateSystem_ = 0;
                return this;
            }

            public Builder clearCoordinateSystem() {
                this.bitField0_ &= -5;
                this.coordinateSystem_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLocation() {
                this.bitField0_ &= -2;
                this.location_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = WaypointRequest.getDefaultInstance().getName();
                this.bitField0_ &= -3;
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

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
            public GDIDataTypes.CoordinateSystem getCoordinateSystem() {
                GDIDataTypes.CoordinateSystem coordinateSystemForNumber = GDIDataTypes.CoordinateSystem.forNumber(this.coordinateSystem_);
                return coordinateSystemForNumber == null ? GDIDataTypes.CoordinateSystem.WGS84 : coordinateSystemForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
            public GDIDataTypes.ScPoint getLocation() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPoint) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.ScPoint scPoint = this.location_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            public GDIDataTypes.ScPoint.Builder getLocationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.ScPoint.Builder) getLocationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
            public GDIDataTypes.ScPointOrBuilder getLocationOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.ScPoint scPoint = this.location_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
            public boolean hasCoordinateSystem() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointRequestOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(WaypointRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasLocation() && getLocation().isInitialized();
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
                                    codedInputStream.readMessage(getLocationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (GDIDataTypes.CoordinateSystem.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.coordinateSystem_ = i14;
                                        this.bitField0_ |= 4;
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

            public Builder mergeLocation(GDIDataTypes.ScPoint scPoint) {
                GDIDataTypes.ScPoint scPoint2;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 1) == 0 || (scPoint2 = this.location_) == null || scPoint2 == GDIDataTypes.ScPoint.getDefaultInstance()) {
                    this.location_ = scPoint;
                } else {
                    getLocationBuilder().mergeFrom(scPoint);
                }
                if (this.location_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCoordinateSystem(GDIDataTypes.CoordinateSystem coordinateSystem) {
                coordinateSystem.getClass();
                this.bitField0_ |= 4;
                this.coordinateSystem_ = coordinateSystem.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLocation(GDIDataTypes.ScPoint.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.location_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 2;
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
            public WaypointRequest getDefaultInstanceForType() {
                return WaypointRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.coordinateSystem_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setLocation(GDIDataTypes.ScPoint scPoint) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scPoint.getClass();
                    this.location_ = scPoint;
                } else {
                    singleFieldBuilderV3.setMessage(scPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WaypointRequest) {
                    return mergeFrom((WaypointRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WaypointRequest waypointRequest) {
                if (waypointRequest == WaypointRequest.getDefaultInstance()) {
                    return this;
                }
                if (waypointRequest.hasLocation()) {
                    mergeLocation(waypointRequest.getLocation());
                }
                if (waypointRequest.hasName()) {
                    this.name_ = waypointRequest.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (waypointRequest.hasCoordinateSystem()) {
                    setCoordinateSystem(waypointRequest.getCoordinateSystem());
                }
                mergeUnknownFields(waypointRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WaypointRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static WaypointRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WaypointRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WaypointRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WaypointRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WaypointRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WaypointRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WaypointRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WaypointRequest parseFrom(InputStream inputStream) {
            return (WaypointRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WaypointRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WaypointRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private WaypointRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.coordinateSystem_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WaypointRequest parseFrom(CodedInputStream codedInputStream) {
            return (WaypointRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WaypointRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WaypointRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ WaypointRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class WaypointResponse extends GeneratedMessageV3 implements WaypointResponseOrBuilder {
        private static final WaypointResponse DEFAULT_INSTANCE = new WaypointResponse();

        @Deprecated
        public static final Parser<WaypointResponse> PARSER = new AbstractParser<WaypointResponse>() { // from class: com.garmin.proto.generated.GDIWaypointTransferProto.WaypointResponse.1
            @Override // com.google.protobuf.Parser
            public WaypointResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WaypointResponse.newBuilder();
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

        private WaypointResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WaypointResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointResponse_descriptor;
        }

        public static Builder newBuilder(WaypointResponse waypointResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(waypointResponse);
        }

        public static WaypointResponse parseDelimitedFrom(InputStream inputStream) {
            return (WaypointResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WaypointResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WaypointResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WaypointResponse)) {
                return super.equals(obj);
            }
            WaypointResponse waypointResponse = (WaypointResponse) obj;
            if (hasStatus() != waypointResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == waypointResponse.status_) && getUnknownFields().equals(waypointResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WaypointResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointResponseOrBuilder
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
            return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(WaypointResponse.class, Builder.class);
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
            if (hasStatus()) {
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
            return new WaypointResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WaypointResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(WaypointResponse waypointResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    waypointResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                waypointResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WaypointResponse build() {
                WaypointResponse waypointResponseBuildPartial = buildPartial();
                if (waypointResponseBuildPartial.isInitialized()) {
                    return waypointResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) waypointResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WaypointResponse buildPartial() {
                WaypointResponse waypointResponse = new WaypointResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(waypointResponse);
                }
                onBuilt();
                return waypointResponse;
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
                return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(WaypointResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus();
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
                                    if (ResponseStatus.forNumber(i14) == null) {
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

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WaypointResponse getDefaultInstanceForType() {
                return WaypointResponse.getDefaultInstance();
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
                if (message instanceof WaypointResponse) {
                    return mergeFrom((WaypointResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WaypointResponse waypointResponse) {
                if (waypointResponse == WaypointResponse.getDefaultInstance()) {
                    return this;
                }
                if (waypointResponse.hasStatus()) {
                    setStatus(waypointResponse.getStatus());
                }
                mergeUnknownFields(waypointResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WaypointResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static WaypointResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WaypointResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WaypointResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ WaypointResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static WaypointResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private WaypointResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WaypointResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WaypointResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WaypointResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WaypointResponse parseFrom(InputStream inputStream) {
            return (WaypointResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WaypointResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WaypointResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WaypointResponse parseFrom(CodedInputStream codedInputStream) {
            return (WaypointResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WaypointResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WaypointResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(1),
            ALREADY_EXISTS(2),
            ERROR(3);

            public static final int ALREADY_EXISTS_VALUE = 2;
            public static final int ERROR_VALUE = 3;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIWaypointTransferProto.WaypointResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 == 2) {
                    return ALREADY_EXISTS;
                }
                if (i14 != 3) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return WaypointResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class WaypointTransferService extends GeneratedMessageV3 implements WaypointTransferServiceOrBuilder {
        private static final WaypointTransferService DEFAULT_INSTANCE = new WaypointTransferService();

        @Deprecated
        public static final Parser<WaypointTransferService> PARSER = new AbstractParser<WaypointTransferService>() { // from class: com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferService.1
            @Override // com.google.protobuf.Parser
            public WaypointTransferService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WaypointTransferService.newBuilder();
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
        public static final int WAYPOINT_REQUEST_FIELD_NUMBER = 1;
        public static final int WAYPOINT_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private WaypointRequest waypointRequest_;
        private WaypointResponse waypointResponse_;

        private WaypointTransferService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WaypointTransferService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointTransferService_descriptor;
        }

        public static Builder newBuilder(WaypointTransferService waypointTransferService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(waypointTransferService);
        }

        public static WaypointTransferService parseDelimitedFrom(InputStream inputStream) {
            return (WaypointTransferService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WaypointTransferService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WaypointTransferService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WaypointTransferService)) {
                return super.equals(obj);
            }
            WaypointTransferService waypointTransferService = (WaypointTransferService) obj;
            if (hasWaypointRequest() != waypointTransferService.hasWaypointRequest()) {
                return false;
            }
            if ((!hasWaypointRequest() || getWaypointRequest().equals(waypointTransferService.getWaypointRequest())) && hasWaypointResponse() == waypointTransferService.hasWaypointResponse()) {
                return (!hasWaypointResponse() || getWaypointResponse().equals(waypointTransferService.getWaypointResponse())) && getUnknownFields().equals(waypointTransferService.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WaypointTransferService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getWaypointRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getWaypointResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
        public WaypointRequest getWaypointRequest() {
            WaypointRequest waypointRequest = this.waypointRequest_;
            return waypointRequest == null ? WaypointRequest.getDefaultInstance() : waypointRequest;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
        public WaypointRequestOrBuilder getWaypointRequestOrBuilder() {
            WaypointRequest waypointRequest = this.waypointRequest_;
            return waypointRequest == null ? WaypointRequest.getDefaultInstance() : waypointRequest;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
        public WaypointResponse getWaypointResponse() {
            WaypointResponse waypointResponse = this.waypointResponse_;
            return waypointResponse == null ? WaypointResponse.getDefaultInstance() : waypointResponse;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
        public WaypointResponseOrBuilder getWaypointResponseOrBuilder() {
            WaypointResponse waypointResponse = this.waypointResponse_;
            return waypointResponse == null ? WaypointResponse.getDefaultInstance() : waypointResponse;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
        public boolean hasWaypointRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
        public boolean hasWaypointResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWaypointRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getWaypointRequest().hashCode();
            }
            if (hasWaypointResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getWaypointResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointTransferService_fieldAccessorTable.ensureFieldAccessorsInitialized(WaypointTransferService.class, Builder.class);
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
            if (hasWaypointRequest() && !getWaypointRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasWaypointResponse() || getWaypointResponse().isInitialized()) {
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
            return new WaypointTransferService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getWaypointRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getWaypointResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WaypointTransferServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<WaypointRequest, WaypointRequest.Builder, WaypointRequestOrBuilder> waypointRequestBuilder_;
            private WaypointRequest waypointRequest_;
            private SingleFieldBuilderV3<WaypointResponse, WaypointResponse.Builder, WaypointResponseOrBuilder> waypointResponseBuilder_;
            private WaypointResponse waypointResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WaypointTransferService waypointTransferService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<WaypointRequest, WaypointRequest.Builder, WaypointRequestOrBuilder> singleFieldBuilderV3 = this.waypointRequestBuilder_;
                    waypointTransferService.waypointRequest_ = singleFieldBuilderV3 == null ? this.waypointRequest_ : (WaypointRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<WaypointResponse, WaypointResponse.Builder, WaypointResponseOrBuilder> singleFieldBuilderV4 = this.waypointResponseBuilder_;
                    waypointTransferService.waypointResponse_ = singleFieldBuilderV4 == null ? this.waypointResponse_ : (WaypointResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                waypointTransferService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointTransferService_descriptor;
            }

            private SingleFieldBuilderV3<WaypointRequest, WaypointRequest.Builder, WaypointRequestOrBuilder> getWaypointRequestFieldBuilder() {
                if (this.waypointRequestBuilder_ == null) {
                    this.waypointRequestBuilder_ = new SingleFieldBuilderV3<>(getWaypointRequest(), getParentForChildren(), isClean());
                    this.waypointRequest_ = null;
                }
                return this.waypointRequestBuilder_;
            }

            private SingleFieldBuilderV3<WaypointResponse, WaypointResponse.Builder, WaypointResponseOrBuilder> getWaypointResponseFieldBuilder() {
                if (this.waypointResponseBuilder_ == null) {
                    this.waypointResponseBuilder_ = new SingleFieldBuilderV3<>(getWaypointResponse(), getParentForChildren(), isClean());
                    this.waypointResponse_ = null;
                }
                return this.waypointResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getWaypointRequestFieldBuilder();
                    getWaypointResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WaypointTransferService build() {
                WaypointTransferService waypointTransferServiceBuildPartial = buildPartial();
                if (waypointTransferServiceBuildPartial.isInitialized()) {
                    return waypointTransferServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) waypointTransferServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WaypointTransferService buildPartial() {
                WaypointTransferService waypointTransferService = new WaypointTransferService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(waypointTransferService);
                }
                onBuilt();
                return waypointTransferService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.waypointRequest_ = null;
                SingleFieldBuilderV3<WaypointRequest, WaypointRequest.Builder, WaypointRequestOrBuilder> singleFieldBuilderV3 = this.waypointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.waypointRequestBuilder_ = null;
                }
                this.waypointResponse_ = null;
                SingleFieldBuilderV3<WaypointResponse, WaypointResponse.Builder, WaypointResponseOrBuilder> singleFieldBuilderV4 = this.waypointResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.waypointResponseBuilder_ = null;
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

            public Builder clearWaypointRequest() {
                this.bitField0_ &= -2;
                this.waypointRequest_ = null;
                SingleFieldBuilderV3<WaypointRequest, WaypointRequest.Builder, WaypointRequestOrBuilder> singleFieldBuilderV3 = this.waypointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.waypointRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWaypointResponse() {
                this.bitField0_ &= -3;
                this.waypointResponse_ = null;
                SingleFieldBuilderV3<WaypointResponse, WaypointResponse.Builder, WaypointResponseOrBuilder> singleFieldBuilderV3 = this.waypointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.waypointResponseBuilder_ = null;
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
                return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointTransferService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
            public WaypointRequest getWaypointRequest() {
                SingleFieldBuilderV3<WaypointRequest, WaypointRequest.Builder, WaypointRequestOrBuilder> singleFieldBuilderV3 = this.waypointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WaypointRequest) singleFieldBuilderV3.getMessage();
                }
                WaypointRequest waypointRequest = this.waypointRequest_;
                return waypointRequest == null ? WaypointRequest.getDefaultInstance() : waypointRequest;
            }

            public WaypointRequest.Builder getWaypointRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (WaypointRequest.Builder) getWaypointRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
            public WaypointRequestOrBuilder getWaypointRequestOrBuilder() {
                SingleFieldBuilderV3<WaypointRequest, WaypointRequest.Builder, WaypointRequestOrBuilder> singleFieldBuilderV3 = this.waypointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WaypointRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WaypointRequest waypointRequest = this.waypointRequest_;
                return waypointRequest == null ? WaypointRequest.getDefaultInstance() : waypointRequest;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
            public WaypointResponse getWaypointResponse() {
                SingleFieldBuilderV3<WaypointResponse, WaypointResponse.Builder, WaypointResponseOrBuilder> singleFieldBuilderV3 = this.waypointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WaypointResponse) singleFieldBuilderV3.getMessage();
                }
                WaypointResponse waypointResponse = this.waypointResponse_;
                return waypointResponse == null ? WaypointResponse.getDefaultInstance() : waypointResponse;
            }

            public WaypointResponse.Builder getWaypointResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (WaypointResponse.Builder) getWaypointResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
            public WaypointResponseOrBuilder getWaypointResponseOrBuilder() {
                SingleFieldBuilderV3<WaypointResponse, WaypointResponse.Builder, WaypointResponseOrBuilder> singleFieldBuilderV3 = this.waypointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WaypointResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WaypointResponse waypointResponse = this.waypointResponse_;
                return waypointResponse == null ? WaypointResponse.getDefaultInstance() : waypointResponse;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
            public boolean hasWaypointRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWaypointTransferProto.WaypointTransferServiceOrBuilder
            public boolean hasWaypointResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWaypointTransferProto.internal_static_GDI_Proto_WaypointTransfer_WaypointTransferService_fieldAccessorTable.ensureFieldAccessorsInitialized(WaypointTransferService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasWaypointRequest() || getWaypointRequest().isInitialized()) {
                    return !hasWaypointResponse() || getWaypointResponse().isInitialized();
                }
                return false;
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
                                    codedInputStream.readMessage(getWaypointRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getWaypointResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeWaypointRequest(WaypointRequest waypointRequest) {
                WaypointRequest waypointRequest2;
                SingleFieldBuilderV3<WaypointRequest, WaypointRequest.Builder, WaypointRequestOrBuilder> singleFieldBuilderV3 = this.waypointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(waypointRequest);
                } else if ((this.bitField0_ & 1) == 0 || (waypointRequest2 = this.waypointRequest_) == null || waypointRequest2 == WaypointRequest.getDefaultInstance()) {
                    this.waypointRequest_ = waypointRequest;
                } else {
                    getWaypointRequestBuilder().mergeFrom(waypointRequest);
                }
                if (this.waypointRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeWaypointResponse(WaypointResponse waypointResponse) {
                WaypointResponse waypointResponse2;
                SingleFieldBuilderV3<WaypointResponse, WaypointResponse.Builder, WaypointResponseOrBuilder> singleFieldBuilderV3 = this.waypointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(waypointResponse);
                } else if ((this.bitField0_ & 2) == 0 || (waypointResponse2 = this.waypointResponse_) == null || waypointResponse2 == WaypointResponse.getDefaultInstance()) {
                    this.waypointResponse_ = waypointResponse;
                } else {
                    getWaypointResponseBuilder().mergeFrom(waypointResponse);
                }
                if (this.waypointResponse_ != null) {
                    this.bitField0_ |= 2;
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

            public Builder setWaypointRequest(WaypointRequest.Builder builder) {
                SingleFieldBuilderV3<WaypointRequest, WaypointRequest.Builder, WaypointRequestOrBuilder> singleFieldBuilderV3 = this.waypointRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.waypointRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setWaypointResponse(WaypointResponse.Builder builder) {
                SingleFieldBuilderV3<WaypointResponse, WaypointResponse.Builder, WaypointResponseOrBuilder> singleFieldBuilderV3 = this.waypointResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.waypointResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WaypointTransferService getDefaultInstanceForType() {
                return WaypointTransferService.getDefaultInstance();
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

            public Builder setWaypointRequest(WaypointRequest waypointRequest) {
                SingleFieldBuilderV3<WaypointRequest, WaypointRequest.Builder, WaypointRequestOrBuilder> singleFieldBuilderV3 = this.waypointRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    waypointRequest.getClass();
                    this.waypointRequest_ = waypointRequest;
                } else {
                    singleFieldBuilderV3.setMessage(waypointRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setWaypointResponse(WaypointResponse waypointResponse) {
                SingleFieldBuilderV3<WaypointResponse, WaypointResponse.Builder, WaypointResponseOrBuilder> singleFieldBuilderV3 = this.waypointResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    waypointResponse.getClass();
                    this.waypointResponse_ = waypointResponse;
                } else {
                    singleFieldBuilderV3.setMessage(waypointResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WaypointTransferService) {
                    return mergeFrom((WaypointTransferService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WaypointTransferService waypointTransferService) {
                if (waypointTransferService == WaypointTransferService.getDefaultInstance()) {
                    return this;
                }
                if (waypointTransferService.hasWaypointRequest()) {
                    mergeWaypointRequest(waypointTransferService.getWaypointRequest());
                }
                if (waypointTransferService.hasWaypointResponse()) {
                    mergeWaypointResponse(waypointTransferService.getWaypointResponse());
                }
                mergeUnknownFields(waypointTransferService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WaypointTransferService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WaypointTransferService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WaypointTransferService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WaypointTransferService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WaypointTransferService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WaypointTransferService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WaypointTransferService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WaypointTransferService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WaypointTransferService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WaypointTransferService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WaypointTransferService parseFrom(InputStream inputStream) {
            return (WaypointTransferService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WaypointTransferService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WaypointTransferService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WaypointTransferService parseFrom(CodedInputStream codedInputStream) {
            return (WaypointTransferService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WaypointTransferService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WaypointTransferService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
