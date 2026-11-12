package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class Nanopb {
    public static final int NANOPB_ENUMOPT_FIELD_NUMBER = 1010;
    public static final int NANOPB_FIELD_NUMBER = 1010;
    public static final int NANOPB_FILEOPT_FIELD_NUMBER = 1010;
    public static final int NANOPB_MSGOPT_FIELD_NUMBER = 1010;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.FieldOptions, NanoPBOptions> nanopb;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.EnumOptions, NanoPBOptions> nanopbEnumopt;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.FileOptions, NanoPBOptions> nanopbFileopt;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.MessageOptions, NanoPBOptions> nanopbMsgopt;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Nanopb$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum FieldType implements Internal.EnumLite {
        FT_DEFAULT(0),
        FT_CALLBACK(1),
        FT_POINTER(4),
        FT_STATIC(2),
        FT_IGNORE(3),
        FT_INLINE(5);

        public static final int FT_CALLBACK_VALUE = 1;
        public static final int FT_DEFAULT_VALUE = 0;
        public static final int FT_IGNORE_VALUE = 3;
        public static final int FT_INLINE_VALUE = 5;
        public static final int FT_POINTER_VALUE = 4;
        public static final int FT_STATIC_VALUE = 2;
        private static final Internal.EnumLiteMap<FieldType> internalValueMap = new Internal.EnumLiteMap<FieldType>() { // from class: com.xiaomi.hm.health.bt.proto.Nanopb.FieldType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public FieldType findValueByNumber(int number) {
                return FieldType.forNumber(number);
            }
        };
        private final int value;

        public static final class FieldTypeVerifier implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier INSTANCE = new FieldTypeVerifier();

            private FieldTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int number) {
                return FieldType.forNumber(number) != null;
            }
        }

        FieldType(int value) {
            this.value = value;
        }

        public static FieldType forNumber(int value) {
            if (value == 0) {
                return FT_DEFAULT;
            }
            if (value == 1) {
                return FT_CALLBACK;
            }
            if (value == 2) {
                return FT_STATIC;
            }
            if (value == 3) {
                return FT_IGNORE;
            }
            if (value == 4) {
                return FT_POINTER;
            }
            if (value != 5) {
                return null;
            }
            return FT_INLINE;
        }

        public static Internal.EnumLiteMap<FieldType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return FieldTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FieldType valueOf(int value) {
            return forNumber(value);
        }
    }

    public enum IntSize implements Internal.EnumLite {
        IS_DEFAULT(0),
        IS_8(8),
        IS_16(16),
        IS_32(32),
        IS_64(64);

        public static final int IS_16_VALUE = 16;
        public static final int IS_32_VALUE = 32;
        public static final int IS_64_VALUE = 64;
        public static final int IS_8_VALUE = 8;
        public static final int IS_DEFAULT_VALUE = 0;
        private static final Internal.EnumLiteMap<IntSize> internalValueMap = new Internal.EnumLiteMap<IntSize>() { // from class: com.xiaomi.hm.health.bt.proto.Nanopb.IntSize.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public IntSize findValueByNumber(int number) {
                return IntSize.forNumber(number);
            }
        };
        private final int value;

        public static final class IntSizeVerifier implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier INSTANCE = new IntSizeVerifier();

            private IntSizeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int number) {
                return IntSize.forNumber(number) != null;
            }
        }

        IntSize(int value) {
            this.value = value;
        }

        public static IntSize forNumber(int value) {
            if (value == 0) {
                return IS_DEFAULT;
            }
            if (value == 8) {
                return IS_8;
            }
            if (value == 16) {
                return IS_16;
            }
            if (value == 32) {
                return IS_32;
            }
            if (value != 64) {
                return null;
            }
            return IS_64;
        }

        public static Internal.EnumLiteMap<IntSize> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return IntSizeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IntSize valueOf(int value) {
            return forNumber(value);
        }
    }

    public static final class NanoPBOptions extends GeneratedMessageLite<NanoPBOptions, Builder> implements NanoPBOptionsOrBuilder {
        public static final int ANONYMOUS_ONEOF_FIELD_NUMBER = 11;
        private static final NanoPBOptions DEFAULT_INSTANCE;
        public static final int ENUM_TO_STRING_FIELD_NUMBER = 13;
        public static final int FIXED_COUNT_FIELD_NUMBER = 16;
        public static final int FIXED_LENGTH_FIELD_NUMBER = 15;
        public static final int INT_SIZE_FIELD_NUMBER = 7;
        public static final int LONG_NAMES_FIELD_NUMBER = 4;
        public static final int MANGLE_NAMES_FIELD_NUMBER = 17;
        public static final int MAX_COUNT_FIELD_NUMBER = 2;
        public static final int MAX_LENGTH_FIELD_NUMBER = 14;
        public static final int MAX_SIZE_FIELD_NUMBER = 1;
        public static final int MSGID_FIELD_NUMBER = 9;
        public static final int NO_UNIONS_FIELD_NUMBER = 8;
        public static final int PACKED_ENUM_FIELD_NUMBER = 10;
        public static final int PACKED_STRUCT_FIELD_NUMBER = 5;
        private static volatile Parser<NanoPBOptions> PARSER = null;
        public static final int PROTO3_FIELD_NUMBER = 12;
        public static final int SKIP_MESSAGE_FIELD_NUMBER = 6;
        public static final int TYPE_FIELD_NUMBER = 3;
        private boolean anonymousOneof_;
        private int bitField0_;
        private boolean enumToString_;
        private boolean fixedCount_;
        private boolean fixedLength_;
        private int intSize_;
        private boolean longNames_ = true;
        private int mangleNames_;
        private int maxCount_;
        private int maxLength_;
        private int maxSize_;
        private int msgid_;
        private boolean noUnions_;
        private boolean packedEnum_;
        private boolean packedStruct_;
        private boolean proto3_;
        private boolean skipMessage_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<NanoPBOptions, Builder> implements NanoPBOptionsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAnonymousOneof() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearAnonymousOneof();
                return this;
            }

            public Builder clearEnumToString() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearEnumToString();
                return this;
            }

            public Builder clearFixedCount() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearFixedCount();
                return this;
            }

            public Builder clearFixedLength() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearFixedLength();
                return this;
            }

            public Builder clearIntSize() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearIntSize();
                return this;
            }

            public Builder clearLongNames() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearLongNames();
                return this;
            }

            public Builder clearMangleNames() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearMangleNames();
                return this;
            }

            public Builder clearMaxCount() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearMaxCount();
                return this;
            }

            public Builder clearMaxLength() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearMaxLength();
                return this;
            }

            public Builder clearMaxSize() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearMaxSize();
                return this;
            }

            public Builder clearMsgid() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearMsgid();
                return this;
            }

            public Builder clearNoUnions() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearNoUnions();
                return this;
            }

            public Builder clearPackedEnum() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearPackedEnum();
                return this;
            }

            public Builder clearPackedStruct() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearPackedStruct();
                return this;
            }

            public Builder clearProto3() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearProto3();
                return this;
            }

            public Builder clearSkipMessage() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearSkipMessage();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((NanoPBOptions) this.instance).clearType();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean getAnonymousOneof() {
                return ((NanoPBOptions) this.instance).getAnonymousOneof();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean getEnumToString() {
                return ((NanoPBOptions) this.instance).getEnumToString();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean getFixedCount() {
                return ((NanoPBOptions) this.instance).getFixedCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean getFixedLength() {
                return ((NanoPBOptions) this.instance).getFixedLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public IntSize getIntSize() {
                return ((NanoPBOptions) this.instance).getIntSize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean getLongNames() {
                return ((NanoPBOptions) this.instance).getLongNames();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public TypenameMangling getMangleNames() {
                return ((NanoPBOptions) this.instance).getMangleNames();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public int getMaxCount() {
                return ((NanoPBOptions) this.instance).getMaxCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public int getMaxLength() {
                return ((NanoPBOptions) this.instance).getMaxLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public int getMaxSize() {
                return ((NanoPBOptions) this.instance).getMaxSize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public int getMsgid() {
                return ((NanoPBOptions) this.instance).getMsgid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean getNoUnions() {
                return ((NanoPBOptions) this.instance).getNoUnions();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean getPackedEnum() {
                return ((NanoPBOptions) this.instance).getPackedEnum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean getPackedStruct() {
                return ((NanoPBOptions) this.instance).getPackedStruct();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean getProto3() {
                return ((NanoPBOptions) this.instance).getProto3();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean getSkipMessage() {
                return ((NanoPBOptions) this.instance).getSkipMessage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public FieldType getType() {
                return ((NanoPBOptions) this.instance).getType();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasAnonymousOneof() {
                return ((NanoPBOptions) this.instance).hasAnonymousOneof();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasEnumToString() {
                return ((NanoPBOptions) this.instance).hasEnumToString();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasFixedCount() {
                return ((NanoPBOptions) this.instance).hasFixedCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasFixedLength() {
                return ((NanoPBOptions) this.instance).hasFixedLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasIntSize() {
                return ((NanoPBOptions) this.instance).hasIntSize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasLongNames() {
                return ((NanoPBOptions) this.instance).hasLongNames();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasMangleNames() {
                return ((NanoPBOptions) this.instance).hasMangleNames();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasMaxCount() {
                return ((NanoPBOptions) this.instance).hasMaxCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasMaxLength() {
                return ((NanoPBOptions) this.instance).hasMaxLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasMaxSize() {
                return ((NanoPBOptions) this.instance).hasMaxSize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasMsgid() {
                return ((NanoPBOptions) this.instance).hasMsgid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasNoUnions() {
                return ((NanoPBOptions) this.instance).hasNoUnions();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasPackedEnum() {
                return ((NanoPBOptions) this.instance).hasPackedEnum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasPackedStruct() {
                return ((NanoPBOptions) this.instance).hasPackedStruct();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasProto3() {
                return ((NanoPBOptions) this.instance).hasProto3();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasSkipMessage() {
                return ((NanoPBOptions) this.instance).hasSkipMessage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
            public boolean hasType() {
                return ((NanoPBOptions) this.instance).hasType();
            }

            public Builder setAnonymousOneof(boolean value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setAnonymousOneof(value);
                return this;
            }

            public Builder setEnumToString(boolean value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setEnumToString(value);
                return this;
            }

            public Builder setFixedCount(boolean value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setFixedCount(value);
                return this;
            }

            public Builder setFixedLength(boolean value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setFixedLength(value);
                return this;
            }

            public Builder setIntSize(IntSize value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setIntSize(value);
                return this;
            }

            public Builder setLongNames(boolean value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setLongNames(value);
                return this;
            }

            public Builder setMangleNames(TypenameMangling value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setMangleNames(value);
                return this;
            }

            public Builder setMaxCount(int value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setMaxCount(value);
                return this;
            }

            public Builder setMaxLength(int value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setMaxLength(value);
                return this;
            }

            public Builder setMaxSize(int value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setMaxSize(value);
                return this;
            }

            public Builder setMsgid(int value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setMsgid(value);
                return this;
            }

            public Builder setNoUnions(boolean value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setNoUnions(value);
                return this;
            }

            public Builder setPackedEnum(boolean value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setPackedEnum(value);
                return this;
            }

            public Builder setPackedStruct(boolean value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setPackedStruct(value);
                return this;
            }

            public Builder setProto3(boolean value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setProto3(value);
                return this;
            }

            public Builder setSkipMessage(boolean value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setSkipMessage(value);
                return this;
            }

            public Builder setType(FieldType value) {
                copyOnWrite();
                ((NanoPBOptions) this.instance).setType(value);
                return this;
            }

            private Builder() {
                super(NanoPBOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            NanoPBOptions nanoPBOptions = new NanoPBOptions();
            DEFAULT_INSTANCE = nanoPBOptions;
            GeneratedMessageLite.registerDefaultInstance(NanoPBOptions.class, nanoPBOptions);
        }

        private NanoPBOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnonymousOneof() {
            this.bitField0_ &= -2049;
            this.anonymousOneof_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumToString() {
            this.bitField0_ &= -8193;
            this.enumToString_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFixedCount() {
            this.bitField0_ &= -32769;
            this.fixedCount_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFixedLength() {
            this.bitField0_ &= -16385;
            this.fixedLength_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntSize() {
            this.bitField0_ &= -9;
            this.intSize_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongNames() {
            this.bitField0_ &= -33;
            this.longNames_ = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMangleNames() {
            this.bitField0_ &= -65537;
            this.mangleNames_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxCount() {
            this.bitField0_ &= -5;
            this.maxCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxLength() {
            this.bitField0_ &= -3;
            this.maxLength_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxSize() {
            this.bitField0_ &= -2;
            this.maxSize_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgid() {
            this.bitField0_ &= -1025;
            this.msgid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoUnions() {
            this.bitField0_ &= -513;
            this.noUnions_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPackedEnum() {
            this.bitField0_ &= -129;
            this.packedEnum_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPackedStruct() {
            this.bitField0_ &= -65;
            this.packedStruct_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProto3() {
            this.bitField0_ &= -4097;
            this.proto3_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkipMessage() {
            this.bitField0_ &= -257;
            this.skipMessage_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -17;
            this.type_ = 0;
        }

        public static NanoPBOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NanoPBOptions parseDelimitedFrom(InputStream input) throws IOException {
            return (NanoPBOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static NanoPBOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (NanoPBOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<NanoPBOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnonymousOneof(boolean value) {
            this.bitField0_ |= 2048;
            this.anonymousOneof_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumToString(boolean value) {
            this.bitField0_ |= 8192;
            this.enumToString_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFixedCount(boolean value) {
            this.bitField0_ |= 32768;
            this.fixedCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFixedLength(boolean value) {
            this.bitField0_ |= 16384;
            this.fixedLength_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntSize(IntSize value) {
            this.intSize_ = value.getNumber();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongNames(boolean value) {
            this.bitField0_ |= 32;
            this.longNames_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMangleNames(TypenameMangling value) {
            this.mangleNames_ = value.getNumber();
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxCount(int value) {
            this.bitField0_ |= 4;
            this.maxCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxLength(int value) {
            this.bitField0_ |= 2;
            this.maxLength_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxSize(int value) {
            this.bitField0_ |= 1;
            this.maxSize_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgid(int value) {
            this.bitField0_ |= 1024;
            this.msgid_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoUnions(boolean value) {
            this.bitField0_ |= 512;
            this.noUnions_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackedEnum(boolean value) {
            this.bitField0_ |= 128;
            this.packedEnum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackedStruct(boolean value) {
            this.bitField0_ |= 64;
            this.packedStruct_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto3(boolean value) {
            this.bitField0_ |= 4096;
            this.proto3_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkipMessage(boolean value) {
            this.bitField0_ |= 256;
            this.skipMessage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(FieldType value) {
            this.type_ = value.getNumber();
            this.bitField0_ |= 16;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new NanoPBOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001င\u0000\u0002င\u0002\u0003ဌ\u0004\u0004ဇ\u0005\u0005ဇ\u0006\u0006ဇ\b\u0007ဌ\u0003\bဇ\t\tဋ\n\nဇ\u0007\u000bဇ\u000b\fဇ\f\rဇ\r\u000eင\u0001\u000fဇ\u000e\u0010ဇ\u000f\u0011ဌ\u0010", new Object[]{"bitField0_", "maxSize_", "maxCount_", "type_", FieldType.internalGetVerifier(), "longNames_", "packedStruct_", "skipMessage_", "intSize_", IntSize.internalGetVerifier(), "noUnions_", "msgid_", "packedEnum_", "anonymousOneof_", "proto3_", "enumToString_", "maxLength_", "fixedLength_", "fixedCount_", "mangleNames_", TypenameMangling.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NanoPBOptions> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NanoPBOptions.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean getAnonymousOneof() {
            return this.anonymousOneof_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean getEnumToString() {
            return this.enumToString_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean getFixedCount() {
            return this.fixedCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean getFixedLength() {
            return this.fixedLength_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public IntSize getIntSize() {
            IntSize intSizeForNumber = IntSize.forNumber(this.intSize_);
            return intSizeForNumber == null ? IntSize.IS_DEFAULT : intSizeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean getLongNames() {
            return this.longNames_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public TypenameMangling getMangleNames() {
            TypenameMangling typenameManglingForNumber = TypenameMangling.forNumber(this.mangleNames_);
            return typenameManglingForNumber == null ? TypenameMangling.M_NONE : typenameManglingForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public int getMaxCount() {
            return this.maxCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public int getMaxLength() {
            return this.maxLength_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public int getMaxSize() {
            return this.maxSize_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public int getMsgid() {
            return this.msgid_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean getNoUnions() {
            return this.noUnions_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean getPackedEnum() {
            return this.packedEnum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean getPackedStruct() {
            return this.packedStruct_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean getProto3() {
            return this.proto3_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean getSkipMessage() {
            return this.skipMessage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public FieldType getType() {
            FieldType fieldTypeForNumber = FieldType.forNumber(this.type_);
            return fieldTypeForNumber == null ? FieldType.FT_DEFAULT : fieldTypeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasAnonymousOneof() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasEnumToString() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasFixedCount() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasFixedLength() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasIntSize() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasLongNames() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasMangleNames() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasMaxCount() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasMaxLength() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasMaxSize() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasMsgid() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasNoUnions() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasPackedEnum() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasPackedStruct() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasProto3() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasSkipMessage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nanopb.NanoPBOptionsOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(NanoPBOptions prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static NanoPBOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NanoPBOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NanoPBOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NanoPBOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NanoPBOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (NanoPBOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NanoPBOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NanoPBOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NanoPBOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (NanoPBOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NanoPBOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NanoPBOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NanoPBOptions parseFrom(InputStream input) throws IOException {
            return (NanoPBOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NanoPBOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NanoPBOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NanoPBOptions parseFrom(CodedInputStream input) throws IOException {
            return (NanoPBOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NanoPBOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NanoPBOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface NanoPBOptionsOrBuilder extends MessageLiteOrBuilder {
        boolean getAnonymousOneof();

        boolean getEnumToString();

        boolean getFixedCount();

        boolean getFixedLength();

        IntSize getIntSize();

        boolean getLongNames();

        TypenameMangling getMangleNames();

        int getMaxCount();

        int getMaxLength();

        int getMaxSize();

        int getMsgid();

        boolean getNoUnions();

        boolean getPackedEnum();

        boolean getPackedStruct();

        boolean getProto3();

        boolean getSkipMessage();

        FieldType getType();

        boolean hasAnonymousOneof();

        boolean hasEnumToString();

        boolean hasFixedCount();

        boolean hasFixedLength();

        boolean hasIntSize();

        boolean hasLongNames();

        boolean hasMangleNames();

        boolean hasMaxCount();

        boolean hasMaxLength();

        boolean hasMaxSize();

        boolean hasMsgid();

        boolean hasNoUnions();

        boolean hasPackedEnum();

        boolean hasPackedStruct();

        boolean hasProto3();

        boolean hasSkipMessage();

        boolean hasType();
    }

    public enum TypenameMangling implements Internal.EnumLite {
        M_NONE(0),
        M_STRIP_PACKAGE(1),
        M_FLATTEN(2);

        public static final int M_FLATTEN_VALUE = 2;
        public static final int M_NONE_VALUE = 0;
        public static final int M_STRIP_PACKAGE_VALUE = 1;
        private static final Internal.EnumLiteMap<TypenameMangling> internalValueMap = new Internal.EnumLiteMap<TypenameMangling>() { // from class: com.xiaomi.hm.health.bt.proto.Nanopb.TypenameMangling.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TypenameMangling findValueByNumber(int number) {
                return TypenameMangling.forNumber(number);
            }
        };
        private final int value;

        public static final class TypenameManglingVerifier implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier INSTANCE = new TypenameManglingVerifier();

            private TypenameManglingVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int number) {
                return TypenameMangling.forNumber(number) != null;
            }
        }

        TypenameMangling(int value) {
            this.value = value;
        }

        public static TypenameMangling forNumber(int value) {
            if (value == 0) {
                return M_NONE;
            }
            if (value == 1) {
                return M_STRIP_PACKAGE;
            }
            if (value != 2) {
                return null;
            }
            return M_FLATTEN;
        }

        public static Internal.EnumLiteMap<TypenameMangling> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return TypenameManglingVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TypenameMangling valueOf(int value) {
            return forNumber(value);
        }
    }

    static {
        DescriptorProtos.FileOptions defaultInstance = DescriptorProtos.FileOptions.getDefaultInstance();
        NanoPBOptions defaultInstance2 = NanoPBOptions.getDefaultInstance();
        NanoPBOptions defaultInstance3 = NanoPBOptions.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        nanopbFileopt = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, null, 1010, fieldType, NanoPBOptions.class);
        nanopbMsgopt = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos.MessageOptions.getDefaultInstance(), NanoPBOptions.getDefaultInstance(), NanoPBOptions.getDefaultInstance(), null, 1010, fieldType, NanoPBOptions.class);
        nanopbEnumopt = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos.EnumOptions.getDefaultInstance(), NanoPBOptions.getDefaultInstance(), NanoPBOptions.getDefaultInstance(), null, 1010, fieldType, NanoPBOptions.class);
        nanopb = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos.FieldOptions.getDefaultInstance(), NanoPBOptions.getDefaultInstance(), NanoPBOptions.getDefaultInstance(), null, 1010, fieldType, NanoPBOptions.class);
    }

    private Nanopb() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
        registry.add((GeneratedMessageLite.GeneratedExtension<?, ?>) nanopbFileopt);
        registry.add((GeneratedMessageLite.GeneratedExtension<?, ?>) nanopbMsgopt);
        registry.add((GeneratedMessageLite.GeneratedExtension<?, ?>) nanopbEnumopt);
        registry.add((GeneratedMessageLite.GeneratedExtension<?, ?>) nanopb);
    }
}
