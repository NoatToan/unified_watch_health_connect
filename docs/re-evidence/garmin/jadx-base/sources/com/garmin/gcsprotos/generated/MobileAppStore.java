package com.garmin.gcsprotos.generated;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes12.dex */
public final class MobileAppStore {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014mobileappstore.proto\u0012\u0018CSM.Proto.MobileAppStore\"®\u0001\n\u000fPurchaseReceipt\u0012@\n\u0006vendor\u0018\u0001 \u0002(\u000e20.CSM.Proto.MobileAppStore.PurchaseReceipt.Vendor\u0012\u0014\n\fvendor_token\u0018\u0002 \u0002(\f\"C\n\u0006Vendor\u0012\t\n\u0005APPLE\u0010\u0000\u0012\u0016\n\u0012RESEARCH_IN_MOTION\u0010\u0001\u0012\n\n\u0006GARMIN\u0010\u0003\u0012\n\n\u0006GOOGLE\u0010\u0004B2\n\u001ecom.garmin.gcsprotos.generatedB\u000eMobileAppStoreH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_CSM_Proto_MobileAppStore_PurchaseReceipt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_MobileAppStore_PurchaseReceipt_fieldAccessorTable;

    public interface PurchaseReceiptOrBuilder extends MessageOrBuilder {
        PurchaseReceipt.Vendor getVendor();

        ByteString getVendorToken();

        boolean hasVendor();

        boolean hasVendorToken();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_CSM_Proto_MobileAppStore_PurchaseReceipt_descriptor = descriptor2;
        internal_static_CSM_Proto_MobileAppStore_PurchaseReceipt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Vendor", "VendorToken"});
    }

    private MobileAppStore() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class PurchaseReceipt extends GeneratedMessageV3 implements PurchaseReceiptOrBuilder {
        private static final PurchaseReceipt DEFAULT_INSTANCE = new PurchaseReceipt();

        @Deprecated
        public static final Parser<PurchaseReceipt> PARSER = new AbstractParser<PurchaseReceipt>() { // from class: com.garmin.gcsprotos.generated.MobileAppStore.PurchaseReceipt.1
            @Override // com.google.protobuf.Parser
            public PurchaseReceipt parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PurchaseReceipt.newBuilder();
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
        public static final int VENDOR_FIELD_NUMBER = 1;
        public static final int VENDOR_TOKEN_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString vendorToken_;
        private int vendor_;

        private PurchaseReceipt() {
            this.vendor_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.vendor_ = 0;
            this.vendorToken_ = byteString;
        }

        public static PurchaseReceipt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MobileAppStore.internal_static_CSM_Proto_MobileAppStore_PurchaseReceipt_descriptor;
        }

        public static Builder newBuilder(PurchaseReceipt purchaseReceipt) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(purchaseReceipt);
        }

        public static PurchaseReceipt parseDelimitedFrom(InputStream inputStream) {
            return (PurchaseReceipt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PurchaseReceipt parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PurchaseReceipt> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PurchaseReceipt)) {
                return super.equals(obj);
            }
            PurchaseReceipt purchaseReceipt = (PurchaseReceipt) obj;
            if (hasVendor() != purchaseReceipt.hasVendor()) {
                return false;
            }
            if ((!hasVendor() || this.vendor_ == purchaseReceipt.vendor_) && hasVendorToken() == purchaseReceipt.hasVendorToken()) {
                return (!hasVendorToken() || getVendorToken().equals(purchaseReceipt.getVendorToken())) && getUnknownFields().equals(purchaseReceipt.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PurchaseReceipt> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.vendor_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(2, this.vendorToken_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.MobileAppStore.PurchaseReceiptOrBuilder
        public Vendor getVendor() {
            Vendor vendorForNumber = Vendor.forNumber(this.vendor_);
            return vendorForNumber == null ? Vendor.APPLE : vendorForNumber;
        }

        @Override // com.garmin.gcsprotos.generated.MobileAppStore.PurchaseReceiptOrBuilder
        public ByteString getVendorToken() {
            return this.vendorToken_;
        }

        @Override // com.garmin.gcsprotos.generated.MobileAppStore.PurchaseReceiptOrBuilder
        public boolean hasVendor() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.MobileAppStore.PurchaseReceiptOrBuilder
        public boolean hasVendorToken() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasVendor()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.vendor_;
            }
            if (hasVendorToken()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getVendorToken().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MobileAppStore.internal_static_CSM_Proto_MobileAppStore_PurchaseReceipt_fieldAccessorTable.ensureFieldAccessorsInitialized(PurchaseReceipt.class, Builder.class);
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
            if (!hasVendor()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVendorToken()) {
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
            return new PurchaseReceipt();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.vendor_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.vendorToken_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PurchaseReceiptOrBuilder {
            private int bitField0_;
            private ByteString vendorToken_;
            private int vendor_;

            private Builder() {
                this.vendor_ = 0;
                this.vendorToken_ = ByteString.EMPTY;
            }

            private void buildPartial0(PurchaseReceipt purchaseReceipt) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    purchaseReceipt.vendor_ = this.vendor_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    purchaseReceipt.vendorToken_ = this.vendorToken_;
                    i14 |= 2;
                }
                purchaseReceipt.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MobileAppStore.internal_static_CSM_Proto_MobileAppStore_PurchaseReceipt_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PurchaseReceipt build() {
                PurchaseReceipt purchaseReceiptBuildPartial = buildPartial();
                if (purchaseReceiptBuildPartial.isInitialized()) {
                    return purchaseReceiptBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) purchaseReceiptBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PurchaseReceipt buildPartial() {
                PurchaseReceipt purchaseReceipt = new PurchaseReceipt(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(purchaseReceipt);
                }
                onBuilt();
                return purchaseReceipt;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.vendor_ = 0;
                this.vendorToken_ = ByteString.EMPTY;
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

            public Builder clearVendor() {
                this.bitField0_ &= -2;
                this.vendor_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVendorToken() {
                this.bitField0_ &= -3;
                this.vendorToken_ = PurchaseReceipt.getDefaultInstance().getVendorToken();
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
                return MobileAppStore.internal_static_CSM_Proto_MobileAppStore_PurchaseReceipt_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.MobileAppStore.PurchaseReceiptOrBuilder
            public Vendor getVendor() {
                Vendor vendorForNumber = Vendor.forNumber(this.vendor_);
                return vendorForNumber == null ? Vendor.APPLE : vendorForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.MobileAppStore.PurchaseReceiptOrBuilder
            public ByteString getVendorToken() {
                return this.vendorToken_;
            }

            @Override // com.garmin.gcsprotos.generated.MobileAppStore.PurchaseReceiptOrBuilder
            public boolean hasVendor() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.MobileAppStore.PurchaseReceiptOrBuilder
            public boolean hasVendorToken() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MobileAppStore.internal_static_CSM_Proto_MobileAppStore_PurchaseReceipt_fieldAccessorTable.ensureFieldAccessorsInitialized(PurchaseReceipt.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasVendor() && hasVendorToken();
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
                                    if (Vendor.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.vendor_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.vendorToken_ = codedInputStream.readBytes();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setVendor(Vendor vendor) {
                vendor.getClass();
                this.bitField0_ |= 1;
                this.vendor_ = vendor.getNumber();
                onChanged();
                return this;
            }

            public Builder setVendorToken(ByteString byteString) {
                byteString.getClass();
                this.vendorToken_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PurchaseReceipt getDefaultInstanceForType() {
                return PurchaseReceipt.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.vendor_ = 0;
                this.vendorToken_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PurchaseReceipt) {
                    return mergeFrom((PurchaseReceipt) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PurchaseReceipt purchaseReceipt) {
                if (purchaseReceipt == PurchaseReceipt.getDefaultInstance()) {
                    return this;
                }
                if (purchaseReceipt.hasVendor()) {
                    setVendor(purchaseReceipt.getVendor());
                }
                if (purchaseReceipt.hasVendorToken()) {
                    setVendorToken(purchaseReceipt.getVendorToken());
                }
                mergeUnknownFields(purchaseReceipt.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PurchaseReceipt getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PurchaseReceipt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PurchaseReceipt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PurchaseReceipt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PurchaseReceipt parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PurchaseReceipt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PurchaseReceipt parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PurchaseReceipt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PurchaseReceipt parseFrom(InputStream inputStream) {
            return (PurchaseReceipt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private PurchaseReceipt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.vendor_ = 0;
            this.vendorToken_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PurchaseReceipt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PurchaseReceipt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PurchaseReceipt parseFrom(CodedInputStream codedInputStream) {
            return (PurchaseReceipt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ PurchaseReceipt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PurchaseReceipt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PurchaseReceipt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Vendor implements ProtocolMessageEnum {
            APPLE(0),
            RESEARCH_IN_MOTION(1),
            GARMIN(3),
            GOOGLE(4);

            public static final int APPLE_VALUE = 0;
            public static final int GARMIN_VALUE = 3;
            public static final int GOOGLE_VALUE = 4;
            public static final int RESEARCH_IN_MOTION_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Vendor> internalValueMap = new Internal.EnumLiteMap<Vendor>() { // from class: com.garmin.gcsprotos.generated.MobileAppStore.PurchaseReceipt.Vendor.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Vendor findValueByNumber(int i14) {
                    return Vendor.forNumber(i14);
                }
            };
            private static final Vendor[] VALUES = values();

            Vendor(int i14) {
                this.value = i14;
            }

            public static Vendor forNumber(int i14) {
                if (i14 == 0) {
                    return APPLE;
                }
                if (i14 == 1) {
                    return RESEARCH_IN_MOTION;
                }
                if (i14 == 3) {
                    return GARMIN;
                }
                if (i14 != 4) {
                    return null;
                }
                return GOOGLE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PurchaseReceipt.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Vendor> internalGetValueMap() {
                return internalValueMap;
            }

            public static Vendor valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Vendor valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
