package com.google.protobuf;

import androidx.room.a0;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
final class ArrayDecoders {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    /* JADX INFO: renamed from: com.google.protobuf.ArrayDecoders$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private ArrayDecoders() {
    }

    private static void checkRecursionLimit(int i14) throws InvalidProtocolBufferException {
        if (i14 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public static int decodeBoolList(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i15, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (iDecodeVarint64 < i16) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i14 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return iDecodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i14, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1;
        if (i15 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i15 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i15 == 0) {
            registers.object1 = ByteString.EMPTY;
            return iDecodeVarint32;
        }
        registers.object1 = ByteString.copyFrom(bArr, iDecodeVarint32, i15);
        return iDecodeVarint32 + i15;
    }

    public static int decodeBytesList(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i15, registers);
        int i17 = registers.int1;
        if (i17 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i17 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i17 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i17));
            iDecodeVarint32 += i17;
        }
        while (iDecodeVarint32 < i16) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i14 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            int i18 = registers.int1;
            if (i18 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i18 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i18 == 0) {
                protobufList.add(ByteString.EMPTY);
            } else {
                protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i18));
                iDecodeVarint32 += i18;
            }
        }
        return iDecodeVarint32;
    }

    public static double decodeDouble(byte[] bArr, int i14) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i14));
    }

    public static int decodeDoubleList(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.addDouble(decodeDouble(bArr, i15));
        int i17 = i15 + 8;
        while (i17 < i16) {
            int iDecodeVarint32 = decodeVarint32(bArr, i17, registers);
            if (i14 != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i17 = iDecodeVarint32 + 8;
        }
        return i17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int decodeExtension(int i14, byte[] bArr, int i15, int i16, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws InvalidProtocolBufferException {
        int i17;
        int i18;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i19 = i14 >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, i15, doubleArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, doubleArrayList);
                    return iDecodePackedDoubleList;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, i15, floatArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, floatArrayList);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, i15, longArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, i15, intArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, i15, longArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, i15, intArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList2);
                    return iDecodePackedFixed32List;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, i15, booleanArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, booleanArrayList);
                    return iDecodePackedBoolList;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, i15, intArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList3);
                    return iDecodePackedSInt32List;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, i15, longArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList3);
                    return iDecodePackedSInt64List;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, i15, intArrayList4, registers);
                    SchemaUtil.filterUnknownEnumList((Object) extendableMessage, i19, (List<Integer>) intArrayList4, generatedExtension.descriptor.getEnumType(), (Object) null, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList4);
                    return iDecodePackedVarint32List2;
                default:
                    a0.s(generatedExtension.descriptor.getLiteType(), "Type cannot be packed: ");
                    return 0;
            }
        }
        Object objValueOf = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i15 = decodeVarint32(bArr, i15, registers);
            Internal.EnumLite enumLiteFindValueByNumber = generatedExtension.descriptor.getEnumType().findValueByNumber(registers.int1);
            int i24 = registers.int1;
            if (enumLiteFindValueByNumber == null) {
                SchemaUtil.storeUnknownEnum(extendableMessage, i19, i24, null, unknownFieldSchema);
                return i15;
            }
            objValueOf = Integer.valueOf(i24);
        } else {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    i17 = i15;
                    objValueOf = Double.valueOf(decodeDouble(bArr, i17));
                    i15 = i17 + 8;
                    break;
                case 2:
                    i18 = i15;
                    objValueOf = Float.valueOf(decodeFloat(bArr, i18));
                    i15 = i18 + 4;
                    break;
                case 3:
                case 4:
                    i15 = decodeVarint64(bArr, i15, registers);
                    objValueOf = Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    i15 = decodeVarint32(bArr, i15, registers);
                    objValueOf = Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    i17 = i15;
                    objValueOf = Long.valueOf(decodeFixed64(bArr, i17));
                    i15 = i17 + 8;
                    break;
                case 9:
                case 10:
                    i18 = i15;
                    objValueOf = Integer.valueOf(decodeFixed32(bArr, i18));
                    i15 = i18 + 4;
                    break;
                case 11:
                    i15 = decodeVarint64(bArr, i15, registers);
                    objValueOf = Boolean.valueOf(registers.long1 != 0);
                    break;
                case 12:
                    i15 = decodeVarint32(bArr, i15, registers);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    i15 = decodeVarint64(bArr, i15, registers);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    h.z("Shouldn't reach here.");
                    return 0;
                case 15:
                    i15 = decodeBytes(bArr, i15, registers);
                    objValueOf = registers.object1;
                    break;
                case 16:
                    i15 = decodeString(bArr, i15, registers);
                    objValueOf = registers.object1;
                    break;
                case 17:
                    int i25 = (i19 << 3) | 4;
                    Schema schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(schemaSchemaFor, bArr, i15, i16, i25, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeGroupField;
                    }
                    Object field = fieldSet.getField(generatedExtension.descriptor);
                    if (field == null) {
                        field = schemaSchemaFor.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field);
                    }
                    return mergeGroupField(field, schemaSchemaFor, bArr, i15, i16, i25, registers);
                case 18:
                    Schema schemaSchemaFor2 = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(schemaSchemaFor2, bArr, i15, i16, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeMessageField;
                    }
                    Object field2 = fieldSet.getField(generatedExtension.descriptor);
                    if (field2 == null) {
                        field2 = schemaSchemaFor2.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaSchemaFor2, bArr, i15, i16, registers);
            }
        }
        boolean zIsRepeated = generatedExtension.isRepeated();
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.descriptor;
        if (zIsRepeated) {
            fieldSet.addRepeatedField(extensionDescriptor, objValueOf);
            return i15;
        }
        fieldSet.setField(extensionDescriptor, objValueOf);
        return i15;
    }

    public static int decodeExtensionOrUnknownField(int i14, byte[] bArr, int i15, int i16, Object obj, MessageLite messageLite, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(messageLite, i14 >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return decodeUnknownField(i14, bArr, i15, i16, MessageSchema.getMutableUnknownFields(obj), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i14, bArr, i15, i16, extendableMessage, generatedExtensionFindLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    public static int decodeFixed32(byte[] bArr, int i14) {
        return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static int decodeFixed32List(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.addInt(decodeFixed32(bArr, i15));
        int i17 = i15 + 4;
        while (i17 < i16) {
            int iDecodeVarint32 = decodeVarint32(bArr, i17, registers);
            if (i14 != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i17 = iDecodeVarint32 + 4;
        }
        return i17;
    }

    public static long decodeFixed64(byte[] bArr, int i14) {
        return ((((long) bArr[i14 + 7]) & 255) << 56) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48);
    }

    public static int decodeFixed64List(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.addLong(decodeFixed64(bArr, i15));
        int i17 = i15 + 8;
        while (i17 < i16) {
            int iDecodeVarint32 = decodeVarint32(bArr, i17, registers);
            if (i14 != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i17 = iDecodeVarint32 + 8;
        }
        return i17;
    }

    public static float decodeFloat(byte[] bArr, int i14) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i14));
    }

    public static int decodeFloatList(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.addFloat(decodeFloat(bArr, i15));
        int i17 = i15 + 4;
        while (i17 < i16) {
            int iDecodeVarint32 = decodeVarint32(bArr, i17, registers);
            if (i14 != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i17 = iDecodeVarint32 + 4;
        }
        return i17;
    }

    public static int decodeGroupField(Schema schema, byte[] bArr, int i14, int i15, int i16, Registers registers) throws InvalidProtocolBufferException {
        Object objNewInstance = schema.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, schema, bArr, i14, i15, i16, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeGroupField;
    }

    public static int decodeGroupList(Schema schema, int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int i17 = (i14 & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(schema, bArr, i15, i16, i17, registers);
        protobufList.add(registers.object1);
        while (iDecodeGroupField < i16) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, registers);
            if (i14 != registers.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(schema, bArr, iDecodeVarint32, i16, i17, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeGroupField;
    }

    public static int decodeMessageField(Schema schema, byte[] bArr, int i14, int i15, Registers registers) throws InvalidProtocolBufferException {
        Object objNewInstance = schema.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, schema, bArr, i14, i15, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeMessageField;
    }

    public static int decodeMessageList(Schema<?> schema, int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeMessageField = decodeMessageField(schema, bArr, i15, i16, registers);
        protobufList.add(registers.object1);
        while (iDecodeMessageField < i16) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, registers);
            if (i14 != registers.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(schema, bArr, iDecodeVarint32, i16, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i14, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i15) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (iDecodeVarint32 == i15) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i14, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i15) {
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i15) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i14, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i15) {
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i15) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i14, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i15) {
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i15) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i14, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i15) {
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i15) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i14, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i15) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (iDecodeVarint32 == i15) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i14, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i15) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (iDecodeVarint32 == i15) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i14, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i15) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (iDecodeVarint32 == i15) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i14, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i15) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (iDecodeVarint32 == i15) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodeSInt32List(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i15, registers);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        while (iDecodeVarint32 < i16) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i14 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        return iDecodeVarint32;
    }

    public static int decodeSInt64List(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i15, registers);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        while (iDecodeVarint64 < i16) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i14 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        return iDecodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i14, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1;
        if (i15 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i15 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = new String(bArr, iDecodeVarint32, i15, Internal.UTF_8);
        return iDecodeVarint32 + i15;
    }

    public static int decodeStringList(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i15, registers);
        int i17 = registers.int1;
        if (i17 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i17 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, iDecodeVarint32, i17, Internal.UTF_8));
            iDecodeVarint32 += i17;
        }
        while (iDecodeVarint32 < i16) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i14 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            int i18 = registers.int1;
            if (i18 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i18 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, iDecodeVarint32, i18, Internal.UTF_8));
                iDecodeVarint32 += i18;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringListRequireUtf8(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i15, registers);
        int i17 = registers.int1;
        if (i17 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i17 == 0) {
            protobufList.add("");
        } else {
            int i18 = iDecodeVarint32 + i17;
            if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i18)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new String(bArr, iDecodeVarint32, i17, Internal.UTF_8));
            iDecodeVarint32 = i18;
        }
        while (iDecodeVarint32 < i16) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i14 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            int i19 = registers.int1;
            if (i19 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i19 == 0) {
                protobufList.add("");
            } else {
                int i24 = iDecodeVarint32 + i19;
                if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i24)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new String(bArr, iDecodeVarint32, i19, Internal.UTF_8));
                iDecodeVarint32 = i24;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i14, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i14, registers);
        int i15 = registers.int1;
        if (i15 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i15 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = Utf8.decodeUtf8(bArr, iDecodeVarint32, i15);
        return iDecodeVarint32 + i15;
    }

    public static int decodeUnknownField(int i14, byte[] bArr, int i15, int i16, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i14) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i14);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(bArr, i15, registers);
            unknownFieldSetLite.storeField(i14, Long.valueOf(registers.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i14, Long.valueOf(decodeFixed64(bArr, i15)));
            return i15 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint32 = decodeVarint32(bArr, i15, registers);
            int i17 = registers.int1;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i17 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i17 == 0) {
                unknownFieldSetLite.storeField(i14, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i14, ByteString.copyFrom(bArr, iDecodeVarint32, i17));
            }
            return iDecodeVarint32 + i17;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i14, Integer.valueOf(decodeFixed32(bArr, i15)));
            return i15 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int i18 = (i14 & (-8)) | 4;
        int i19 = registers.recursionDepth + 1;
        registers.recursionDepth = i19;
        checkRecursionLimit(i19);
        int i24 = 0;
        while (i15 < i16) {
            int iDecodeVarint33 = decodeVarint32(bArr, i15, registers);
            i24 = registers.int1;
            if (i24 == i18) {
                i15 = iDecodeVarint33;
                break;
            }
            i15 = decodeUnknownField(i24, bArr, iDecodeVarint33, i16, unknownFieldSetLiteNewInstance, registers);
        }
        registers.recursionDepth--;
        if (i15 > i16 || i24 != i18) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i14, unknownFieldSetLiteNewInstance);
        return i15;
    }

    public static int decodeVarint32(int i14, byte[] bArr, int i15, Registers registers) {
        int i16 = i14 & 127;
        int i17 = i15 + 1;
        byte b14 = bArr[i15];
        if (b14 >= 0) {
            registers.int1 = i16 | (b14 << 7);
            return i17;
        }
        int i18 = i16 | ((b14 & Ascii.DEL) << 7);
        int i19 = i15 + 2;
        byte b15 = bArr[i17];
        if (b15 >= 0) {
            registers.int1 = i18 | (b15 << Ascii.SO);
            return i19;
        }
        int i24 = i18 | ((b15 & Ascii.DEL) << 14);
        int i25 = i15 + 3;
        byte b16 = bArr[i19];
        if (b16 >= 0) {
            registers.int1 = i24 | (b16 << Ascii.NAK);
            return i25;
        }
        int i26 = i24 | ((b16 & Ascii.DEL) << 21);
        int i27 = i15 + 4;
        byte b17 = bArr[i25];
        if (b17 >= 0) {
            registers.int1 = i26 | (b17 << Ascii.FS);
            return i27;
        }
        int i28 = i26 | ((b17 & Ascii.DEL) << 28);
        while (true) {
            int i29 = i27 + 1;
            if (bArr[i27] >= 0) {
                registers.int1 = i28;
                return i29;
            }
            i27 = i29;
        }
    }

    public static int decodeVarint32List(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i15, registers);
        intArrayList.addInt(registers.int1);
        while (iDecodeVarint32 < i16) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i14 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, registers);
            intArrayList.addInt(registers.int1);
        }
        return iDecodeVarint32;
    }

    public static int decodeVarint64(long j8, byte[] bArr, int i14, Registers registers) {
        int i15 = i14 + 1;
        byte b14 = bArr[i14];
        long j14 = (j8 & 127) | (((long) (b14 & Ascii.DEL)) << 7);
        int i16 = 7;
        while (b14 < 0) {
            int i17 = i15 + 1;
            byte b15 = bArr[i15];
            i16 += 7;
            j14 |= ((long) (b15 & Ascii.DEL)) << i16;
            i15 = i17;
            b14 = b15;
        }
        registers.long1 = j14;
        return i15;
    }

    public static int decodeVarint64List(int i14, byte[] bArr, int i15, int i16, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i15, registers);
        longArrayList.addLong(registers.long1);
        while (iDecodeVarint64 < i16) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i14 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return iDecodeVarint64;
    }

    public static int mergeGroupField(Object obj, Schema schema, byte[] bArr, int i14, int i15, int i16, Registers registers) throws InvalidProtocolBufferException {
        int i17 = registers.recursionDepth + 1;
        registers.recursionDepth = i17;
        checkRecursionLimit(i17);
        int message = ((MessageSchema) schema).parseMessage(obj, bArr, i14, i15, i16, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return message;
    }

    public static int mergeMessageField(Object obj, Schema schema, byte[] bArr, int i14, int i15, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = i14 + 1;
        int i16 = bArr[i14];
        if (i16 < 0) {
            iDecodeVarint32 = decodeVarint32(i16, bArr, iDecodeVarint32, registers);
            i16 = registers.int1;
        }
        int i17 = iDecodeVarint32;
        if (i16 < 0 || i16 > i15 - i17) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i18 = registers.recursionDepth + 1;
        registers.recursionDepth = i18;
        checkRecursionLimit(i18);
        int i19 = i17 + i16;
        schema.mergeFrom(obj, bArr, i17, i19, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return i19;
    }

    public static void setRecursionLimit(int i14) {
        recursionLimit = i14;
    }

    public static int skipField(int i14, byte[] bArr, int i15, int i16, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i14) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i14);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i15, registers);
        }
        if (tagWireType == 1) {
            return i15 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i15, registers) + registers.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i15 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i17 = (i14 & (-8)) | 4;
        int i18 = 0;
        while (i15 < i16) {
            i15 = decodeVarint32(bArr, i15, registers);
            i18 = registers.int1;
            if (i18 == i17) {
                break;
            }
            i15 = skipField(i18, bArr, i15, i16, registers);
        }
        if (i15 > i16 || i18 != i17) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i15;
    }

    public static final class Registers {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;
        public int recursionDepth;

        public Registers() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        public Registers(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    public static int decodeVarint64(byte[] bArr, int i14, Registers registers) {
        int i15 = i14 + 1;
        long j8 = bArr[i14];
        if (j8 >= 0) {
            registers.long1 = j8;
            return i15;
        }
        return decodeVarint64(j8, bArr, i15, registers);
    }

    public static int decodeVarint32(byte[] bArr, int i14, Registers registers) {
        int i15 = i14 + 1;
        byte b14 = bArr[i14];
        if (b14 >= 0) {
            registers.int1 = b14;
            return i15;
        }
        return decodeVarint32(b14, bArr, i15, registers);
    }
}
