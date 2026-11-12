package com.google.crypto.tink.shaded.protobuf;

import androidx.core.view.j;
import com.google.android.gms.internal.measurement.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg.f;
import o2.c;
import sun.misc.Unsafe;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class MessageSchema<T> implements Schema<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i14, int i15, MessageLite messageLite, boolean z14, boolean z15, int[] iArr2, int i16, int i17, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i14;
        this.maxFieldNumber = i15;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z14;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z15;
        this.intArray = iArr2;
        this.checkInitializedCount = i16;
        this.repeatedFieldOffsetStart = i17;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t7, T t14, int i14) {
        return isFieldPresent(t7, i14) == isFieldPresent(t14, i14);
    }

    private static <T> boolean booleanAt(T t7, long j8) {
        return UnsafeUtil.getBoolean(t7, j8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i14, int i15, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i14, registers);
        int i16 = registers.int1;
        if (i16 < 0 || i16 > i15 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i17 = iDecodeVarint32 + i16;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint32 < i17) {
            int iDecodeVarint33 = iDecodeVarint32 + 1;
            int i18 = bArr[iDecodeVarint32];
            if (i18 < 0) {
                iDecodeVarint33 = ArrayDecoders.decodeVarint32(i18, bArr, iDecodeVarint33, registers);
                i18 = registers.int1;
            }
            int i19 = iDecodeVarint33;
            int i24 = i18 >>> 3;
            int i25 = i18 & 7;
            if (i24 != 1) {
                if (i24 == 2 && i25 == metadata.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i19, i15, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint32 = ArrayDecoders.skipField(i18, bArr, i19, i15, registers);
                }
            } else if (i25 == metadata.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i19, i15, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint32 = ArrayDecoders.skipField(i18, bArr, i19, i15, registers);
            }
        }
        if (iDecodeVarint32 != i17) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i17;
    }

    private int decodeMapEntryValue(byte[] bArr, int i14, int i15, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i14, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i14, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i14));
                return i14 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i14));
                return i14 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i14));
                return i14 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i14));
                return i14 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i14, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i14, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint65;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i14, i15, registers);
            case 15:
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i14, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i14, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint66;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i14, registers);
            default:
                f.n("unsupported field type.");
                return 0;
        }
    }

    private static <T> double doubleAt(T t7, long j8) {
        return UnsafeUtil.getDouble(t7, j8);
    }

    private boolean equals(T t7, T t14, int i14) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i14);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t7, t14, i14) && Double.doubleToLongBits(UnsafeUtil.getDouble(t7, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t14, jOffset));
            case 1:
                return arePresentForEquals(t7, t14, i14) && Float.floatToIntBits(UnsafeUtil.getFloat(t7, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t14, jOffset));
            case 2:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getLong(t7, jOffset) == UnsafeUtil.getLong(t14, jOffset);
            case 3:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getLong(t7, jOffset) == UnsafeUtil.getLong(t14, jOffset);
            case 4:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getInt(t7, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 5:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getLong(t7, jOffset) == UnsafeUtil.getLong(t14, jOffset);
            case 6:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getInt(t7, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 7:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getBoolean(t7, jOffset) == UnsafeUtil.getBoolean(t14, jOffset);
            case 8:
                return arePresentForEquals(t7, t14, i14) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t7, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case 9:
                return arePresentForEquals(t7, t14, i14) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t7, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case 10:
                return arePresentForEquals(t7, t14, i14) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t7, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case 11:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getInt(t7, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 12:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getInt(t7, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 13:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getInt(t7, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 14:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getLong(t7, jOffset) == UnsafeUtil.getLong(t14, jOffset);
            case 15:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getInt(t7, jOffset) == UnsafeUtil.getInt(t14, jOffset);
            case 16:
                return arePresentForEquals(t7, t14, i14) && UnsafeUtil.getLong(t7, jOffset) == UnsafeUtil.getLong(t14, jOffset);
            case 17:
                return arePresentForEquals(t7, t14, i14) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t7, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t7, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t7, jOffset), UnsafeUtil.getObject(t14, jOffset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t7, t14, i14) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t7, jOffset), UnsafeUtil.getObject(t14, jOffset));
            default:
                return true;
        }
    }

    private final <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i14, UB ub3, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i14);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i14)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i14)) == null) ? ub3 : (UB) filterUnknownEnumMap(i14, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub3, unknownFieldSchema);
    }

    private final <K, V, UT, UB> UB filterUnknownEnumMap(int i14, int i15, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub3, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i14));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub3 == null) {
                    ub3 = unknownFieldSchema.newBuilder();
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub3, i15, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e4) {
                    c.p(e4);
                    return null;
                }
            }
        }
        return ub3;
    }

    private static <T> float floatAt(T t7, long j8) {
        return UnsafeUtil.getFloat(t7, j8);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i14) {
        return (Internal.EnumVerifier) this.objects[j.v(i14, 3, 2, 1)];
    }

    private Object getMapFieldDefaultEntry(int i14) {
        return this.objects[(i14 / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i14) {
        int i15 = (i14 / 3) * 2;
        Schema schema = (Schema) this.objects[i15];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i15 + 1]);
        this.objects[i15] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[PHI: r6
      0x007c: PHI (r6v4 int) = 
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v8 int)
      (r6v1 int)
      (r6v9 int)
      (r6v1 int)
      (r6v10 int)
      (r6v1 int)
      (r6v11 int)
      (r6v1 int)
      (r6v12 int)
      (r6v1 int)
      (r6v13 int)
      (r6v1 int)
      (r6v14 int)
      (r6v1 int)
      (r6v15 int)
      (r6v1 int)
      (r6v16 int)
      (r6v1 int)
      (r6v17 int)
      (r6v1 int)
      (r6v18 int)
      (r6v1 int)
      (r6v19 int)
      (r6v1 int)
      (r6v20 int)
      (r6v1 int)
      (r6v21 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v22 int)
      (r6v1 int)
      (r6v23 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v24 int)
      (r6v1 int)
     binds: [B:21:0x0063, B:225:0x04d1, B:222:0x04c6, B:216:0x04aa, B:213:0x0498, B:210:0x0488, B:207:0x047a, B:204:0x046c, B:201:0x0461, B:198:0x0457, B:195:0x0449, B:192:0x043b, B:189:0x0427, B:165:0x0336, B:169:0x0340, B:159:0x0318, B:163:0x0322, B:153:0x02fa, B:157:0x0304, B:147:0x02dc, B:151:0x02e6, B:141:0x02be, B:145:0x02c8, B:135:0x02a0, B:139:0x02aa, B:129:0x0282, B:133:0x028c, B:123:0x0264, B:127:0x026e, B:117:0x0246, B:121:0x0250, B:111:0x0228, B:115:0x0232, B:105:0x020a, B:109:0x0214, B:99:0x01ec, B:103:0x01f6, B:93:0x01ce, B:97:0x01d8, B:87:0x01b0, B:91:0x01ba, B:82:0x017c, B:79:0x0170, B:76:0x0160, B:73:0x0150, B:70:0x0140, B:67:0x0134, B:64:0x0127, B:61:0x011a, B:58:0x010b, B:54:0x00fb, B:52:0x00f5, B:50:0x00e7, B:47:0x00d6, B:44:0x00c7, B:41:0x00b8, B:38:0x00ac, B:35:0x00a1, B:32:0x0092, B:29:0x0083, B:26:0x007b, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    private int getSerializedSizeProto2(T t7) {
        int i14;
        int i15;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeBytesSize;
        int iComputeSizeMessage;
        boolean z14;
        int iComputeSizeFixed32List;
        Unsafe unsafe = UNSAFE;
        int i16 = -1;
        int i17 = 0;
        int iB = 0;
        int i18 = 0;
        while (i17 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i17);
            int iNumberAt = numberAt(i17);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                i14 = this.buffer[i17 + 2];
                int i19 = OFFSET_MASK & i14;
                int i24 = 1 << (i14 >>> 20);
                if (i19 != i16) {
                    i18 = unsafe.getInt(t7, i19);
                    i16 = i19;
                }
                i15 = i24;
            } else {
                i14 = (!this.useCachedSizeField || iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i17 + 2] & OFFSET_MASK;
                i15 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            int i25 = i16;
            switch (iType) {
                case 0:
                    if ((i18 & i15) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if ((i18 & i15) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if ((i18 & i15) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if ((i18 & i15) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if ((i18 & i15) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if ((i18 & i15) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if ((i18 & i15) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if ((i18 & i15) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iB += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if ((i18 & i15) != 0) {
                        Object object = unsafe.getObject(t7, jOffset);
                        iComputeBytesSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        iB = iComputeBytesSize + iB;
                    }
                    break;
                case 9:
                    if ((i18 & i15) != 0) {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t7, jOffset), getMessageFieldSchema(i17));
                        iB += iComputeSizeMessage;
                    }
                    break;
                case 10:
                    if ((i18 & i15) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if ((i18 & i15) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if ((i18 & i15) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if ((i18 & i15) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iB += iComputeBoolSize;
                    }
                    break;
                case 14:
                    if ((i18 & i15) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iB += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if ((i18 & i15) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if ((i18 & i15) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if ((i18 & i15) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t7, jOffset), getMessageFieldSchema(i17));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 19:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 20:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 21:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 22:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 23:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 24:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 25:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 26:
                    iComputeSizeMessage = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t7, jOffset));
                    iB += iComputeSizeMessage;
                    break;
                case 27:
                    iComputeSizeMessage = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t7, jOffset), getMessageFieldSchema(i17));
                    iB += iComputeSizeMessage;
                    break;
                case 28:
                    iComputeSizeMessage = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t7, jOffset));
                    iB += iComputeSizeMessage;
                    break;
                case 29:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 30:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 31:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 32:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 33:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 34:
                    z14 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t7, jOffset), false);
                    iB += iComputeSizeFixed32List;
                    break;
                case 35:
                    int iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeFixed64ListNoTag);
                        }
                        iB = a.b(iComputeSizeFixed64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag, iB);
                    }
                    break;
                case 36:
                    int iComputeSizeFixed32ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeFixed32ListNoTag);
                        }
                        iB = a.b(iComputeSizeFixed32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag, iB);
                    }
                    break;
                case 37:
                    int iComputeSizeInt64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeInt64ListNoTag);
                        }
                        iB = a.b(iComputeSizeInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt64ListNoTag, iB);
                    }
                    break;
                case 38:
                    int iComputeSizeUInt64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeUInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeUInt64ListNoTag);
                        }
                        iB = a.b(iComputeSizeUInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt64ListNoTag, iB);
                    }
                    break;
                case 39:
                    int iComputeSizeInt32ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeInt32ListNoTag);
                        }
                        iB = a.b(iComputeSizeInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt32ListNoTag, iB);
                    }
                    break;
                case 40:
                    int iComputeSizeFixed64ListNoTag2 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed64ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeFixed64ListNoTag2);
                        }
                        iB = a.b(iComputeSizeFixed64ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag2, iB);
                    }
                    break;
                case 41:
                    int iComputeSizeFixed32ListNoTag2 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed32ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeFixed32ListNoTag2);
                        }
                        iB = a.b(iComputeSizeFixed32ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag2, iB);
                    }
                    break;
                case 42:
                    int iComputeSizeBoolListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeBoolListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeBoolListNoTag);
                        }
                        iB = a.b(iComputeSizeBoolListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeBoolListNoTag, iB);
                    }
                    break;
                case 43:
                    int iComputeSizeUInt32ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeUInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeUInt32ListNoTag);
                        }
                        iB = a.b(iComputeSizeUInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt32ListNoTag, iB);
                    }
                    break;
                case 44:
                    int iComputeSizeEnumListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeEnumListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeEnumListNoTag);
                        }
                        iB = a.b(iComputeSizeEnumListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeEnumListNoTag, iB);
                    }
                    break;
                case 45:
                    int iComputeSizeFixed32ListNoTag3 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed32ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeFixed32ListNoTag3);
                        }
                        iB = a.b(iComputeSizeFixed32ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag3, iB);
                    }
                    break;
                case 46:
                    int iComputeSizeFixed64ListNoTag3 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed64ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeFixed64ListNoTag3);
                        }
                        iB = a.b(iComputeSizeFixed64ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag3, iB);
                    }
                    break;
                case 47:
                    int iComputeSizeSInt32ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeSInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeSInt32ListNoTag);
                        }
                        iB = a.b(iComputeSizeSInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt32ListNoTag, iB);
                    }
                    break;
                case 48:
                    int iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i14, iComputeSizeSInt64ListNoTag);
                        }
                        iB = a.b(iComputeSizeSInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt64ListNoTag, iB);
                    }
                    break;
                case 49:
                    iComputeSizeMessage = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t7, jOffset), getMessageFieldSchema(i17));
                    iB += iComputeSizeMessage;
                    break;
                case 50:
                    iComputeSizeMessage = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t7, jOffset), getMapFieldDefaultEntry(i17));
                    iB += iComputeSizeMessage;
                    break;
                case 51:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iB += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iB += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iB += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iB += iComputeBoolSize;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iB += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        Object object2 = unsafe.getObject(t7, jOffset);
                        iComputeBytesSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        iB = iComputeBytesSize + iB;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t7, jOffset), getMessageFieldSchema(i17));
                        iB += iComputeSizeMessage;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iB += iComputeBoolSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iB += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t7, jOffset));
                        iB += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t7, jOffset), getMessageFieldSchema(i17));
                        iB += iComputeBoolSize;
                    }
                    break;
                default:
                    break;
            }
            i17 += 3;
            i16 = i25;
        }
        int unknownFieldsSerializedSize = iB + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t7);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t7).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(T t7) {
        int iComputeDoubleSize;
        int iComputeBytesSize;
        int iComputeSizeMessage;
        Unsafe unsafe = UNSAFE;
        int iB = 0;
        for (int i14 = 0; i14 < this.buffer.length; i14 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i14);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i14);
            long jOffset = offset(iTypeAndOffsetAt);
            int i15 = (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i14 + 2] & OFFSET_MASK;
            switch (iType) {
                case 0:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, UnsafeUtil.getLong(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, UnsafeUtil.getLong(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, UnsafeUtil.getInt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(t7, i14)) {
                        Object object = UnsafeUtil.getObject(t7, jOffset);
                        iComputeBytesSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        iB = iComputeBytesSize + iB;
                    }
                    break;
                case 9:
                    if (isFieldPresent(t7, i14)) {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, UnsafeUtil.getObject(t7, jOffset), getMessageFieldSchema(i14));
                        iB += iComputeSizeMessage;
                    }
                    break;
                case 10:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) UnsafeUtil.getObject(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, UnsafeUtil.getInt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, UnsafeUtil.getInt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 14:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, UnsafeUtil.getInt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, UnsafeUtil.getLong(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(t7, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) UnsafeUtil.getObject(t7, jOffset), getMessageFieldSchema(i14));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 18:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 19:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 20:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt64List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 21:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt64List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 22:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt32List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 23:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 24:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 25:
                    iComputeSizeMessage = SchemaUtil.computeSizeBoolList(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 26:
                    iComputeSizeMessage = SchemaUtil.computeSizeStringList(iNumberAt, listAt(t7, jOffset));
                    iB += iComputeSizeMessage;
                    break;
                case 27:
                    iComputeSizeMessage = SchemaUtil.computeSizeMessageList(iNumberAt, listAt(t7, jOffset), getMessageFieldSchema(i14));
                    iB += iComputeSizeMessage;
                    break;
                case 28:
                    iComputeSizeMessage = SchemaUtil.computeSizeByteStringList(iNumberAt, listAt(t7, jOffset));
                    iB += iComputeSizeMessage;
                    break;
                case 29:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt32List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 30:
                    iComputeSizeMessage = SchemaUtil.computeSizeEnumList(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 31:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 32:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 33:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt32List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 34:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt64List(iNumberAt, listAt(t7, jOffset), false);
                    iB += iComputeSizeMessage;
                    break;
                case 35:
                    int iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeFixed64ListNoTag);
                        }
                        iB = a.b(iComputeSizeFixed64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag, iB);
                    }
                    break;
                case 36:
                    int iComputeSizeFixed32ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeFixed32ListNoTag);
                        }
                        iB = a.b(iComputeSizeFixed32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag, iB);
                    }
                    break;
                case 37:
                    int iComputeSizeInt64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeInt64ListNoTag);
                        }
                        iB = a.b(iComputeSizeInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt64ListNoTag, iB);
                    }
                    break;
                case 38:
                    int iComputeSizeUInt64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeUInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeUInt64ListNoTag);
                        }
                        iB = a.b(iComputeSizeUInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt64ListNoTag, iB);
                    }
                    break;
                case 39:
                    int iComputeSizeInt32ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeInt32ListNoTag);
                        }
                        iB = a.b(iComputeSizeInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt32ListNoTag, iB);
                    }
                    break;
                case 40:
                    int iComputeSizeFixed64ListNoTag2 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed64ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeFixed64ListNoTag2);
                        }
                        iB = a.b(iComputeSizeFixed64ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag2, iB);
                    }
                    break;
                case 41:
                    int iComputeSizeFixed32ListNoTag2 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed32ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeFixed32ListNoTag2);
                        }
                        iB = a.b(iComputeSizeFixed32ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag2, iB);
                    }
                    break;
                case 42:
                    int iComputeSizeBoolListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeBoolListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeBoolListNoTag);
                        }
                        iB = a.b(iComputeSizeBoolListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeBoolListNoTag, iB);
                    }
                    break;
                case 43:
                    int iComputeSizeUInt32ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeUInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeUInt32ListNoTag);
                        }
                        iB = a.b(iComputeSizeUInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt32ListNoTag, iB);
                    }
                    break;
                case 44:
                    int iComputeSizeEnumListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeEnumListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeEnumListNoTag);
                        }
                        iB = a.b(iComputeSizeEnumListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeEnumListNoTag, iB);
                    }
                    break;
                case 45:
                    int iComputeSizeFixed32ListNoTag3 = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed32ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeFixed32ListNoTag3);
                        }
                        iB = a.b(iComputeSizeFixed32ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag3, iB);
                    }
                    break;
                case 46:
                    int iComputeSizeFixed64ListNoTag3 = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeFixed64ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeFixed64ListNoTag3);
                        }
                        iB = a.b(iComputeSizeFixed64ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag3, iB);
                    }
                    break;
                case 47:
                    int iComputeSizeSInt32ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeSInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeSInt32ListNoTag);
                        }
                        iB = a.b(iComputeSizeSInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt32ListNoTag, iB);
                    }
                    break;
                case 48:
                    int iComputeSizeSInt64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t7, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t7, i15, iComputeSizeSInt64ListNoTag);
                        }
                        iB = a.b(iComputeSizeSInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt64ListNoTag, iB);
                    }
                    break;
                case 49:
                    iComputeSizeMessage = SchemaUtil.computeSizeGroupList(iNumberAt, listAt(t7, jOffset), getMessageFieldSchema(i14));
                    iB += iComputeSizeMessage;
                    break;
                case 50:
                    iComputeSizeMessage = this.mapFieldSchema.getSerializedSize(iNumberAt, UnsafeUtil.getObject(t7, jOffset), getMapFieldDefaultEntry(i14));
                    iB += iComputeSizeMessage;
                    break;
                case 51:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        Object object2 = UnsafeUtil.getObject(t7, jOffset);
                        iComputeBytesSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        iB = iComputeBytesSize + iB;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, UnsafeUtil.getObject(t7, jOffset), getMessageFieldSchema(i14));
                        iB += iComputeSizeMessage;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) UnsafeUtil.getObject(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t7, jOffset));
                        iB += iComputeDoubleSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) UnsafeUtil.getObject(t7, jOffset), getMessageFieldSchema(i14));
                        iB += iComputeDoubleSize;
                    }
                    break;
            }
        }
        return iB + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t7);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t7) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t7));
    }

    private static <T> int intAt(T t7, long j8) {
        return UnsafeUtil.getInt(t7, j8);
    }

    private static boolean isEnforceUtf8(int i14) {
        return (i14 & 536870912) != 0;
    }

    private boolean isFieldPresent(T t7, int i14) {
        if (!this.proto3) {
            int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i14);
            return (UnsafeUtil.getInt(t7, (long) (iPresenceMaskAndOffsetAt & OFFSET_MASK)) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i14);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return UnsafeUtil.getDouble(t7, jOffset) != 0.0d;
            case 1:
                return UnsafeUtil.getFloat(t7, jOffset) != 0.0f;
            case 2:
                return UnsafeUtil.getLong(t7, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t7, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t7, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t7, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t7, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t7, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t7, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                h.w();
                return false;
            case 9:
                return UnsafeUtil.getObject(t7, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t7, jOffset));
            case 11:
                return UnsafeUtil.getInt(t7, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(t7, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t7, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t7, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t7, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t7, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(t7, jOffset) != null;
            default:
                h.w();
                return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i14, int i15) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i14));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i15);
        for (int i16 = 0; i16 < list.size(); i16++) {
            if (!messageFieldSchema.isInitialized(list.get(i16))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.crypto.tink.shaded.protobuf.Schema] */
    private boolean isMapInitialized(T t7, int i14, int i15) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t7, offset(i14)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i15)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            if (SchemaFor == 0) {
                SchemaFor = SchemaFor;
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            SchemaFor = SchemaFor;
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t7, T t14, int i14) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i14) & OFFSET_MASK;
        return UnsafeUtil.getInt(t7, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t14, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t7, int i14, int i15) {
        return UnsafeUtil.getInt(t7, (long) (presenceMaskAndOffsetAt(i15) & OFFSET_MASK)) == i14;
    }

    private static boolean isRequired(int i14) {
        return (i14 & 268435456) != 0;
    }

    private static List<?> listAt(Object obj, long j8) {
        return (List) UnsafeUtil.getObject(obj, j8);
    }

    private static <T> long longAt(T t7, long j8) {
        return UnsafeUtil.getLong(t7, j8);
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0600 A[LOOP:2: B:180:0x05fc->B:182:0x0600, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x0611 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #9 {all -> 0x004e, blocks: (B:19:0x0042, B:40:0x007c, B:58:0x00b0, B:175:0x05ee, B:177:0x05f4, B:186:0x0611, B:187:0x0616), top: B:218:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0622 A[LOOP:1: B:190:0x061e->B:192:0x0622, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x0638 A[LOOP:3: B:197:0x0634->B:199:0x0638, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x0645  */
    /* JADX WARN: Code duplicated, block: B:308:0x060f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x05f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB>] */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t7, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        int i14;
        ExtensionSchema<ET> extensionSchema2;
        Object objFindExtensionByNumber;
        Object obj;
        int i15;
        int i16;
        T t14 = t7;
        ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
        Object objFilterMapUnknownEnumValues = null;
        FieldSet mutableExtensions = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                int iPositionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (iPositionForFieldNumber < 0) {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        for (int i17 = this.checkInitializedCount; i17 < this.repeatedFieldOffsetStart; i17++) {
                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i17], objFilterMapUnknownEnumValues, unknownFieldSchema);
                        }
                        if (objFilterMapUnknownEnumValues == null) {
                            return;
                        }
                    } else {
                        if (this.hasExtensions) {
                            extensionSchema2 = extensionSchema;
                            objFindExtensionByNumber = extensionSchema2.findExtensionByNumber(extensionRegistryLite2, this.defaultInstance, fieldNumber);
                        } else {
                            extensionSchema2 = extensionSchema;
                            objFindExtensionByNumber = null;
                        }
                        if (objFindExtensionByNumber != null) {
                            if (mutableExtensions == null) {
                                try {
                                    mutableExtensions = extensionSchema.getMutableExtensions(t7);
                                } catch (Throwable th3) {
                                    th = th3;
                                    for (i14 = this.checkInitializedCount; i14 < this.repeatedFieldOffsetStart; i14++) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i14], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                    }
                                    if (objFilterMapUnknownEnumValues != null) {
                                        unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                    }
                                    throw th;
                                }
                            }
                            FieldSet fieldSet = mutableExtensions;
                            objFilterMapUnknownEnumValues = extensionSchema2.parseExtension(reader, objFindExtensionByNumber, extensionRegistryLite2, fieldSet, objFilterMapUnknownEnumValues, unknownFieldSchema);
                            mutableExtensions = fieldSet;
                        } else {
                            obj = objFilterMapUnknownEnumValues;
                            try {
                                if (unknownFieldSchema.shouldDiscardUnknownFields(reader)) {
                                    if (!reader.skipField()) {
                                        objFilterMapUnknownEnumValues = obj;
                                    }
                                    objFilterMapUnknownEnumValues = obj;
                                } else {
                                    objFilterMapUnknownEnumValues = obj == null ? unknownFieldSchema.getBuilderFromMessage(t14) : obj;
                                    if (unknownFieldSchema.mergeOneFieldFrom(objFilterMapUnknownEnumValues, reader)) {
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                objFilterMapUnknownEnumValues = obj;
                                while (i14 < this.repeatedFieldOffsetStart) {
                                    objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i14], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                }
                                if (objFilterMapUnknownEnumValues != null) {
                                    unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                }
                                throw th;
                            }
                        }
                    }
                    unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                }
                Reader reader2 = reader;
                obj = objFilterMapUnknownEnumValues;
                int iTypeAndOffsetAt = typeAndOffsetAt(iPositionForFieldNumber);
                try {
                    switch (type(iTypeAndOffsetAt)) {
                        case 0:
                            UnsafeUtil.putDouble(t14, offset(iTypeAndOffsetAt), reader2.readDouble());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 1:
                            UnsafeUtil.putFloat(t14, offset(iTypeAndOffsetAt), reader2.readFloat());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 2:
                            UnsafeUtil.putLong(t14, offset(iTypeAndOffsetAt), reader2.readInt64());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 3:
                            UnsafeUtil.putLong(t14, offset(iTypeAndOffsetAt), reader2.readUInt64());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 4:
                            UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), reader2.readInt32());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 5:
                            UnsafeUtil.putLong(t14, offset(iTypeAndOffsetAt), reader2.readFixed64());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 6:
                            UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), reader2.readFixed32());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 7:
                            UnsafeUtil.putBoolean(t14, offset(iTypeAndOffsetAt), reader2.readBool());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 8:
                            readString(t14, iTypeAndOffsetAt, reader2);
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 9:
                            if (isFieldPresent(t14, iPositionForFieldNumber)) {
                                UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(t14, offset(iTypeAndOffsetAt)), reader2.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2)));
                            } else {
                                UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), reader2.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2));
                                setFieldPresent(t14, iPositionForFieldNumber);
                            }
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 10:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), reader2.readBytes());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 11:
                            UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), reader2.readUInt32());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 12:
                            int i18 = reader2.readEnum();
                            Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(iPositionForFieldNumber);
                            if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i18)) {
                                UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), i18);
                                setFieldPresent(t14, iPositionForFieldNumber);
                                objFilterMapUnknownEnumValues = obj;
                            } else {
                                objFilterMapUnknownEnumValues = SchemaUtil.storeUnknownEnum(fieldNumber, i18, obj, unknownFieldSchema);
                            }
                            break;
                        case 13:
                            UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), reader2.readSFixed32());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 14:
                            UnsafeUtil.putLong(t14, offset(iTypeAndOffsetAt), reader2.readSFixed64());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 15:
                            UnsafeUtil.putInt(t14, offset(iTypeAndOffsetAt), reader2.readSInt32());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 16:
                            UnsafeUtil.putLong(t14, offset(iTypeAndOffsetAt), reader2.readSInt64());
                            setFieldPresent(t14, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 17:
                            if (isFieldPresent(t14, iPositionForFieldNumber)) {
                                UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(t14, offset(iTypeAndOffsetAt)), reader2.readGroupBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2)));
                            } else {
                                UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), reader2.readGroupBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2));
                                setFieldPresent(t14, iPositionForFieldNumber);
                            }
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 18:
                            reader2.readDoubleList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 19:
                            reader2.readFloatList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 20:
                            reader2.readInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 21:
                            reader2.readUInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 22:
                            reader2.readInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 23:
                            reader2.readFixed64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 24:
                            reader2.readFixed32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 25:
                            reader2.readBoolList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 26:
                            readStringList(t14, iTypeAndOffsetAt, reader2);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 27:
                            T t15 = t14;
                            try {
                                readMessageList(t15, iTypeAndOffsetAt, reader2, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                t14 = t15;
                                extensionRegistryLite2 = extensionRegistryLite;
                                objFilterMapUnknownEnumValues = obj;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                t14 = t15;
                                extensionRegistryLite2 = extensionRegistryLite;
                                objFilterMapUnknownEnumValues = obj;
                                if (!unknownFieldSchema.shouldDiscardUnknownFields(reader2)) {
                                    if (objFilterMapUnknownEnumValues == null) {
                                        objFilterMapUnknownEnumValues = unknownFieldSchema.getBuilderFromMessage(t14);
                                    }
                                    if (!unknownFieldSchema.mergeOneFieldFrom(objFilterMapUnknownEnumValues, reader2)) {
                                        for (i16 = this.checkInitializedCount; i16 < this.repeatedFieldOffsetStart; i16++) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i16], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                        }
                                        if (objFilterMapUnknownEnumValues == null) {
                                            return;
                                        }
                                        unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                    }
                                } else if (!reader2.skipField()) {
                                    for (i15 = this.checkInitializedCount; i15 < this.repeatedFieldOffsetStart; i15++) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i15], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                    }
                                    if (objFilterMapUnknownEnumValues == null) {
                                        return;
                                    }
                                    unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                }
                            }
                            break;
                        case 28:
                            reader2.readBytesList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 29:
                            reader2.readUInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 30:
                            List<Integer> listMutableListAt = this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt));
                            reader2.readEnumList(listMutableListAt);
                            objFilterMapUnknownEnumValues = SchemaUtil.filterUnknownEnumList(fieldNumber, listMutableListAt, getEnumFieldVerifier(iPositionForFieldNumber), obj, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                            extensionRegistryLite2 = extensionRegistryLite;
                            break;
                        case 31:
                            reader2.readSFixed32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 32:
                            reader2.readSFixed64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 33:
                            reader2.readSInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 34:
                            reader2.readSInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 35:
                            reader2.readDoubleList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 36:
                            reader2.readFloatList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 37:
                            reader2.readInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 38:
                            reader2.readUInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 39:
                            reader2.readInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 40:
                            reader2.readFixed64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 41:
                            reader2.readFixed32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 42:
                            reader2.readBoolList(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 43:
                            reader2.readUInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 44:
                            List<Integer> listMutableListAt2 = this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt));
                            reader2.readEnumList(listMutableListAt2);
                            objFilterMapUnknownEnumValues = SchemaUtil.filterUnknownEnumList(fieldNumber, listMutableListAt2, getEnumFieldVerifier(iPositionForFieldNumber), obj, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                            extensionRegistryLite2 = extensionRegistryLite;
                            break;
                        case 45:
                            reader2.readSFixed32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 46:
                            reader2.readSFixed64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 47:
                            reader2.readSInt32List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                            extensionRegistryLite2 = extensionRegistryLite;
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 48:
                            try {
                                reader2.readSInt64List(this.listFieldSchema.mutableListAt(t14, offset(iTypeAndOffsetAt)));
                                extensionRegistryLite2 = extensionRegistryLite;
                                objFilterMapUnknownEnumValues = obj;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                extensionRegistryLite2 = extensionRegistryLite;
                                objFilterMapUnknownEnumValues = obj;
                                if (!unknownFieldSchema.shouldDiscardUnknownFields(reader2)) {
                                    if (objFilterMapUnknownEnumValues == null) {
                                        objFilterMapUnknownEnumValues = unknownFieldSchema.getBuilderFromMessage(t14);
                                    }
                                    if (!unknownFieldSchema.mergeOneFieldFrom(objFilterMapUnknownEnumValues, reader2)) {
                                        while (i16 < this.repeatedFieldOffsetStart) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i16], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                        }
                                        if (objFilterMapUnknownEnumValues == null) {
                                            return;
                                        }
                                        unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                    }
                                } else if (!reader2.skipField()) {
                                    while (i15 < this.repeatedFieldOffsetStart) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i15], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                    }
                                    if (objFilterMapUnknownEnumValues == null) {
                                        return;
                                    }
                                    unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                }
                            }
                            break;
                        case 49:
                            try {
                                try {
                                    readGroupList(t7, offset(iTypeAndOffsetAt), reader, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                    t14 = t7;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    objFilterMapUnknownEnumValues = obj;
                                } catch (Throwable th5) {
                                    th = th5;
                                    t14 = t7;
                                    objFilterMapUnknownEnumValues = obj;
                                    while (i14 < this.repeatedFieldOffsetStart) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i14], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                    }
                                    if (objFilterMapUnknownEnumValues != null) {
                                        unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                    }
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                t14 = t7;
                                reader2 = reader;
                                objFilterMapUnknownEnumValues = obj;
                                extensionRegistryLite2 = extensionRegistryLite;
                                if (!unknownFieldSchema.shouldDiscardUnknownFields(reader2)) {
                                    if (objFilterMapUnknownEnumValues == null) {
                                        objFilterMapUnknownEnumValues = unknownFieldSchema.getBuilderFromMessage(t14);
                                    }
                                    if (!unknownFieldSchema.mergeOneFieldFrom(objFilterMapUnknownEnumValues, reader2)) {
                                        while (i16 < this.repeatedFieldOffsetStart) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i16], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                        }
                                        if (objFilterMapUnknownEnumValues == null) {
                                            return;
                                        }
                                        unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                    }
                                } else if (!reader2.skipField()) {
                                    while (i15 < this.repeatedFieldOffsetStart) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i15], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                    }
                                    if (objFilterMapUnknownEnumValues == null) {
                                        return;
                                    }
                                    unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                }
                            }
                            break;
                        case 50:
                            try {
                                mergeMap(t14, iPositionForFieldNumber, getMapFieldDefaultEntry(iPositionForFieldNumber), extensionRegistryLite2, reader);
                                t14 = t7;
                                extensionRegistryLite2 = extensionRegistryLite;
                                objFilterMapUnknownEnumValues = obj;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                t14 = t7;
                                reader2 = reader;
                                extensionRegistryLite2 = extensionRegistryLite;
                                objFilterMapUnknownEnumValues = obj;
                                if (!unknownFieldSchema.shouldDiscardUnknownFields(reader2)) {
                                    if (objFilterMapUnknownEnumValues == null) {
                                        objFilterMapUnknownEnumValues = unknownFieldSchema.getBuilderFromMessage(t14);
                                    }
                                    if (!unknownFieldSchema.mergeOneFieldFrom(objFilterMapUnknownEnumValues, reader2)) {
                                        while (i16 < this.repeatedFieldOffsetStart) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i16], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                        }
                                        if (objFilterMapUnknownEnumValues == null) {
                                            return;
                                        }
                                        unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                    }
                                } else if (!reader2.skipField()) {
                                    while (i15 < this.repeatedFieldOffsetStart) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i15], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                    }
                                    if (objFilterMapUnknownEnumValues == null) {
                                        return;
                                    }
                                    unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                t14 = t7;
                                objFilterMapUnknownEnumValues = obj;
                                while (i14 < this.repeatedFieldOffsetStart) {
                                    objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i14], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                }
                                if (objFilterMapUnknownEnumValues != null) {
                                    unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                }
                                throw th;
                            }
                            break;
                        case 51:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Double.valueOf(reader2.readDouble()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 52:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Float.valueOf(reader2.readFloat()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 53:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Long.valueOf(reader2.readInt64()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 54:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Long.valueOf(reader2.readUInt64()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 55:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(reader2.readInt32()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 56:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Long.valueOf(reader2.readFixed64()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 57:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(reader2.readFixed32()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 58:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Boolean.valueOf(reader2.readBool()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 59:
                            readString(t14, iTypeAndOffsetAt, reader2);
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 60:
                            if (isOneofPresent(t14, fieldNumber, iPositionForFieldNumber)) {
                                UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(t14, offset(iTypeAndOffsetAt)), reader2.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2)));
                            } else {
                                UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), reader2.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2));
                                setFieldPresent(t14, iPositionForFieldNumber);
                            }
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 61:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), reader2.readBytes());
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 62:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(reader2.readUInt32()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 63:
                            int i19 = reader2.readEnum();
                            Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(iPositionForFieldNumber);
                            if (enumFieldVerifier2 == null || enumFieldVerifier2.isInRange(i19)) {
                                UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(i19));
                                setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                                objFilterMapUnknownEnumValues = obj;
                            } else {
                                objFilterMapUnknownEnumValues = SchemaUtil.storeUnknownEnum(fieldNumber, i19, obj, unknownFieldSchema);
                            }
                            break;
                        case 64:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(reader2.readSFixed32()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 65:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Long.valueOf(reader2.readSFixed64()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 66:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Integer.valueOf(reader2.readSInt32()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 67:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), Long.valueOf(reader2.readSInt64()));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        case 68:
                            UnsafeUtil.putObject(t14, offset(iTypeAndOffsetAt), reader2.readGroupBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2));
                            setOneofPresent(t14, fieldNumber, iPositionForFieldNumber);
                            objFilterMapUnknownEnumValues = obj;
                            break;
                        default:
                            objFilterMapUnknownEnumValues = obj == null ? unknownFieldSchema.newBuilder() : obj;
                            try {
                                if (!unknownFieldSchema.mergeOneFieldFrom(objFilterMapUnknownEnumValues, reader2)) {
                                    for (int i24 = this.checkInitializedCount; i24 < this.repeatedFieldOffsetStart; i24++) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i24], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                    }
                                    if (objFilterMapUnknownEnumValues == null) {
                                        return;
                                    }
                                    unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                }
                                break;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                if (!unknownFieldSchema.shouldDiscardUnknownFields(reader2)) {
                                    if (objFilterMapUnknownEnumValues == null) {
                                        objFilterMapUnknownEnumValues = unknownFieldSchema.getBuilderFromMessage(t14);
                                    }
                                    if (!unknownFieldSchema.mergeOneFieldFrom(objFilterMapUnknownEnumValues, reader2)) {
                                        while (i16 < this.repeatedFieldOffsetStart) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i16], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                        }
                                        if (objFilterMapUnknownEnumValues == null) {
                                            return;
                                        }
                                        unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                    }
                                } else if (!reader2.skipField()) {
                                    while (i15 < this.repeatedFieldOffsetStart) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i15], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                    }
                                    if (objFilterMapUnknownEnumValues == null) {
                                        return;
                                    }
                                    unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
                                }
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
        for (int i25 = this.checkInitializedCount; i25 < this.repeatedFieldOffsetStart; i25++) {
            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t14, this.intArray[i25], objFilterMapUnknownEnumValues, unknownFieldSchema);
        }
        if (objFilterMapUnknownEnumValues == null) {
            return;
        }
        unknownFieldSchema.setBuilderToMessage(t14, objFilterMapUnknownEnumValues);
    }

    private final <K, V> void mergeMap(Object obj, int i14, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long jOffset = offset(typeAndOffsetAt(i14));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        MapFieldSchema mapFieldSchema = this.mapFieldSchema;
        if (object == null) {
            object = mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private void mergeMessage(T t7, T t14, int i14) {
        long jOffset = offset(typeAndOffsetAt(i14));
        if (isFieldPresent(t14, i14)) {
            Object object = UnsafeUtil.getObject(t7, jOffset);
            Object object2 = UnsafeUtil.getObject(t14, jOffset);
            if (object != null && object2 != null) {
                UnsafeUtil.putObject(t7, jOffset, Internal.mergeMessage(object, object2));
                setFieldPresent(t7, i14);
            } else if (object2 != null) {
                UnsafeUtil.putObject(t7, jOffset, object2);
                setFieldPresent(t7, i14);
            }
        }
    }

    private void mergeOneofMessage(T t7, T t14, int i14) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i14);
        int iNumberAt = numberAt(i14);
        long jOffset = offset(iTypeAndOffsetAt);
        if (isOneofPresent(t14, iNumberAt, i14)) {
            Object object = UnsafeUtil.getObject(t7, jOffset);
            Object object2 = UnsafeUtil.getObject(t14, jOffset);
            if (object != null && object2 != null) {
                UnsafeUtil.putObject(t7, jOffset, Internal.mergeMessage(object, object2));
                setOneofPresent(t7, iNumberAt, i14);
            } else if (object2 != null) {
                UnsafeUtil.putObject(t7, jOffset, object2);
                setOneofPresent(t7, iNumberAt, i14);
            }
        }
    }

    private void mergeSingleField(T t7, T t14, int i14) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i14);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i14);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putDouble(t7, jOffset, UnsafeUtil.getDouble(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 1:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putFloat(t7, jOffset, UnsafeUtil.getFloat(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 2:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putLong(t7, jOffset, UnsafeUtil.getLong(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 3:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putLong(t7, jOffset, UnsafeUtil.getLong(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 4:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putInt(t7, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 5:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putLong(t7, jOffset, UnsafeUtil.getLong(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 6:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putInt(t7, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 7:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putBoolean(t7, jOffset, UnsafeUtil.getBoolean(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 8:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putObject(t7, jOffset, UnsafeUtil.getObject(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 9:
                mergeMessage(t7, t14, i14);
                break;
            case 10:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putObject(t7, jOffset, UnsafeUtil.getObject(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 11:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putInt(t7, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 12:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putInt(t7, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 13:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putInt(t7, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 14:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putLong(t7, jOffset, UnsafeUtil.getLong(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 15:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putInt(t7, jOffset, UnsafeUtil.getInt(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 16:
                if (isFieldPresent(t14, i14)) {
                    UnsafeUtil.putLong(t7, jOffset, UnsafeUtil.getLong(t14, jOffset));
                    setFieldPresent(t7, i14);
                }
                break;
            case 17:
                mergeMessage(t7, t14, i14);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t7, t14, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t7, t14, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t14, iNumberAt, i14)) {
                    UnsafeUtil.putObject(t7, jOffset, UnsafeUtil.getObject(t14, jOffset));
                    setOneofPresent(t7, iNumberAt, i14);
                }
                break;
            case 60:
                mergeOneofMessage(t7, t14, i14);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t14, iNumberAt, i14)) {
                    UnsafeUtil.putObject(t7, jOffset, UnsafeUtil.getObject(t14, jOffset));
                    setOneofPresent(t7, iNumberAt, i14);
                }
                break;
            case 68:
                mergeOneofMessage(t7, t14, i14);
                break;
        }
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        boolean z14 = structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i14 = 0;
        int i15 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i14++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i15++;
            }
        }
        int[] iArr2 = i14 > 0 ? new int[i14] : null;
        int[] iArr3 = i15 > 0 ? new int[i15] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i24 = 0;
        while (i16 < fields.length) {
            FieldInfo fieldInfo2 = fields[i16];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i17, z14, objArr);
            if (i18 < checkInitialized.length && checkInitialized[i18] == fieldNumber3) {
                checkInitialized[i18] = i17;
                i18++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i19] = i17;
                i19++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    iArr3[i24] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i24++;
                }
                i16++;
                i17 += 3;
            }
            i16++;
            i17 += 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z14, true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0369  */
    /* JADX WARN: Code duplicated, block: B:182:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:185:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:188:0x03d0  */
    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i14;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i15;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        char cCharAt;
        int i19;
        char cCharAt2;
        int i24;
        char cCharAt3;
        int i25;
        char cCharAt4;
        int i26;
        char cCharAt5;
        int i27;
        char cCharAt6;
        int i28;
        char cCharAt7;
        int i29;
        char cCharAt8;
        int i30;
        int i34;
        int i35;
        int i36;
        boolean z14;
        int i37;
        int iObjectFieldOffset;
        int i38;
        int i39;
        int iObjectFieldOffset2;
        int i44;
        int i45;
        Field fieldReflectField;
        char cCharAt9;
        int i46;
        int i47;
        Field fieldReflectField2;
        Field fieldReflectField3;
        int i48;
        char cCharAt10;
        int i49;
        char cCharAt11;
        int i54;
        int i55;
        char cCharAt12;
        int i56;
        char cCharAt13;
        char cCharAt14;
        int i57 = 0;
        boolean z15 = rawMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        int iCharAt4 = stringInfo.charAt(0);
        if (iCharAt4 >= 55296) {
            int i58 = iCharAt4 & 8191;
            int i59 = 1;
            int i64 = 13;
            while (true) {
                i14 = i59 + 1;
                cCharAt14 = stringInfo.charAt(i59);
                if (cCharAt14 < 55296) {
                    break;
                }
                i58 |= (cCharAt14 & 8191) << i64;
                i64 += 13;
                i59 = i14;
            }
            iCharAt4 = i58 | (cCharAt14 << i64);
        } else {
            i14 = 1;
        }
        int i65 = i14 + 1;
        int iCharAt5 = stringInfo.charAt(i14);
        if (iCharAt5 >= 55296) {
            int i66 = iCharAt5 & 8191;
            int i67 = 13;
            while (true) {
                i56 = i65 + 1;
                cCharAt13 = stringInfo.charAt(i65);
                if (cCharAt13 < 55296) {
                    break;
                }
                i66 |= (cCharAt13 & 8191) << i67;
                i67 += 13;
                i65 = i56;
            }
            iCharAt5 = i66 | (cCharAt13 << i67);
            i65 = i56;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            i17 = 0;
            iCharAt2 = 0;
            i15 = 0;
            iCharAt3 = 0;
            iArr = EMPTY_INT_ARRAY;
            i16 = 0;
        } else {
            int i68 = i65 + 1;
            int iCharAt6 = stringInfo.charAt(i65);
            if (iCharAt6 >= 55296) {
                int i69 = iCharAt6 & 8191;
                int i74 = 13;
                while (true) {
                    i29 = i68 + 1;
                    cCharAt8 = stringInfo.charAt(i68);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt8 & 8191) << i74;
                    i74 += 13;
                    i68 = i29;
                }
                iCharAt6 = i69 | (cCharAt8 << i74);
                i68 = i29;
            }
            int i75 = i68 + 1;
            int iCharAt7 = stringInfo.charAt(i68);
            if (iCharAt7 >= 55296) {
                int i76 = iCharAt7 & 8191;
                int i77 = 13;
                while (true) {
                    i28 = i75 + 1;
                    cCharAt7 = stringInfo.charAt(i75);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt7 & 8191) << i77;
                    i77 += 13;
                    i75 = i28;
                }
                iCharAt7 = i76 | (cCharAt7 << i77);
                i75 = i28;
            }
            int i78 = i75 + 1;
            iCharAt = stringInfo.charAt(i75);
            if (iCharAt >= 55296) {
                int i79 = iCharAt & 8191;
                int i84 = 13;
                while (true) {
                    i27 = i78 + 1;
                    cCharAt6 = stringInfo.charAt(i78);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt6 & 8191) << i84;
                    i84 += 13;
                    i78 = i27;
                }
                iCharAt = i79 | (cCharAt6 << i84);
                i78 = i27;
            }
            int i85 = i78 + 1;
            int iCharAt8 = stringInfo.charAt(i78);
            if (iCharAt8 >= 55296) {
                int i86 = iCharAt8 & 8191;
                int i87 = 13;
                while (true) {
                    i26 = i85 + 1;
                    cCharAt5 = stringInfo.charAt(i85);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i86 |= (cCharAt5 & 8191) << i87;
                    i87 += 13;
                    i85 = i26;
                }
                iCharAt8 = i86 | (cCharAt5 << i87);
                i85 = i26;
            }
            int i88 = i85 + 1;
            int iCharAt9 = stringInfo.charAt(i85);
            if (iCharAt9 >= 55296) {
                int i89 = iCharAt9 & 8191;
                int i93 = 13;
                while (true) {
                    i25 = i88 + 1;
                    cCharAt4 = stringInfo.charAt(i88);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i89 |= (cCharAt4 & 8191) << i93;
                    i93 += 13;
                    i88 = i25;
                }
                iCharAt9 = i89 | (cCharAt4 << i93);
                i88 = i25;
            }
            int i94 = i88 + 1;
            iCharAt2 = stringInfo.charAt(i88);
            if (iCharAt2 >= 55296) {
                int i95 = iCharAt2 & 8191;
                int i96 = 13;
                while (true) {
                    i24 = i94 + 1;
                    cCharAt3 = stringInfo.charAt(i94);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i95 |= (cCharAt3 & 8191) << i96;
                    i96 += 13;
                    i94 = i24;
                }
                iCharAt2 = i95 | (cCharAt3 << i96);
                i94 = i24;
            }
            int i97 = i94 + 1;
            int iCharAt10 = stringInfo.charAt(i94);
            if (iCharAt10 >= 55296) {
                int i98 = iCharAt10 & 8191;
                int i99 = 13;
                while (true) {
                    i19 = i97 + 1;
                    cCharAt2 = stringInfo.charAt(i97);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i98 |= (cCharAt2 & 8191) << i99;
                    i99 += 13;
                    i97 = i19;
                }
                iCharAt10 = i98 | (cCharAt2 << i99);
                i97 = i19;
            }
            int i100 = i97 + 1;
            iCharAt3 = stringInfo.charAt(i97);
            if (iCharAt3 >= 55296) {
                int i101 = iCharAt3 & 8191;
                int i102 = i100;
                int i103 = 13;
                while (true) {
                    i18 = i102 + 1;
                    cCharAt = stringInfo.charAt(i102);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i101 |= (cCharAt & 8191) << i103;
                    i103 += 13;
                    i102 = i18;
                }
                iCharAt3 = i101 | (cCharAt << i103);
                i100 = i18;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt10];
            i15 = (iCharAt6 * 2) + iCharAt7;
            i16 = iCharAt8;
            i17 = iCharAt9;
            iArr = iArr2;
            i57 = iCharAt6;
            i65 = i100;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[i17 * 3];
        int i104 = i57;
        Object[] objArr = new Object[i17 * 2];
        int i105 = iCharAt2 + iCharAt3;
        int i106 = i105;
        int i107 = iCharAt3;
        int i108 = 0;
        int i109 = 0;
        while (i65 < length) {
            int i110 = i65 + 1;
            int iCharAt11 = stringInfo.charAt(i65);
            int i111 = length;
            if (iCharAt11 >= 55296) {
                int i112 = iCharAt11 & 8191;
                int i113 = i110;
                int i114 = 13;
                while (true) {
                    i55 = i113 + 1;
                    cCharAt12 = stringInfo.charAt(i113);
                    i30 = iCharAt4;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i112 |= (cCharAt12 & 8191) << i114;
                    i114 += 13;
                    i113 = i55;
                    iCharAt4 = i30;
                }
                iCharAt11 = i112 | (cCharAt12 << i114);
                i34 = i55;
            } else {
                i30 = iCharAt4;
                i34 = i110;
            }
            int i115 = i34 + 1;
            int iCharAt12 = stringInfo.charAt(i34);
            if (iCharAt12 >= 55296) {
                int i116 = iCharAt12 & 8191;
                int i117 = i115;
                int i118 = 13;
                while (true) {
                    i49 = i117 + 1;
                    cCharAt11 = stringInfo.charAt(i117);
                    i54 = i116;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i116 = i54 | ((cCharAt11 & 8191) << i118);
                    i118 += 13;
                    i117 = i49;
                }
                iCharAt12 = i54 | (cCharAt11 << i118);
                i35 = i49;
            } else {
                i35 = i115;
            }
            int[] iArr4 = iArr3;
            int i119 = iCharAt12 & 255;
            int i120 = iCharAt11;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i109] = i108;
                i109++;
            }
            int i121 = i16;
            if (i119 >= 51) {
                int i122 = i35 + 1;
                int iCharAt13 = stringInfo.charAt(i35);
                char c14 = 55296;
                if (iCharAt13 >= 55296) {
                    int i123 = iCharAt13 & 8191;
                    int i124 = 13;
                    while (true) {
                        i48 = i122 + 1;
                        cCharAt10 = stringInfo.charAt(i122);
                        if (cCharAt10 < c14) {
                            break;
                        }
                        i123 |= (cCharAt10 & 8191) << i124;
                        i124 += 13;
                        i122 = i48;
                        c14 = 55296;
                    }
                    iCharAt13 = i123 | (cCharAt10 << i124);
                    i122 = i48;
                }
                int i125 = i119 - 51;
                int i126 = iCharAt13;
                if (i125 == 9 || i125 == 17) {
                    i47 = i122;
                    objArr[j.v(i108, 3, 2, 1)] = objects[i15];
                    i15++;
                } else if (i125 == 12) {
                    i47 = i122;
                    if ((i30 & 1) == 1) {
                        objArr[j.v(i108, 3, 2, 1)] = objects[i15];
                        i15++;
                    }
                } else {
                    i47 = i122;
                }
                int i127 = i126 * 2;
                Object obj = objects[i127];
                if (obj instanceof Field) {
                    fieldReflectField2 = (Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i127] = fieldReflectField2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                int i128 = i127 + 1;
                Object obj2 = objects[i128];
                if (obj2 instanceof Field) {
                    fieldReflectField3 = (Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i128] = fieldReflectField3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                z14 = z15;
                i44 = i15;
                i38 = i47;
                i36 = iCharAt;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i45 = iObjectFieldOffset3;
                i39 = 0;
            } else {
                int i129 = i15 + 1;
                Field fieldReflectField4 = reflectField(cls, (String) objects[i15]);
                if (i119 == 9 || i119 == 17) {
                    i36 = iCharAt;
                    z14 = z15;
                    objArr[j.v(i108, 3, 2, 1)] = fieldReflectField4.getType();
                } else {
                    if (i119 == 27 || i119 == 49) {
                        i36 = iCharAt;
                        z14 = z15;
                        i46 = i15 + 2;
                        objArr[j.v(i108, 3, 2, 1)] = objects[i129];
                    } else if (i119 == 12 || i119 == 30 || i119 == 44) {
                        i36 = iCharAt;
                        z14 = z15;
                        if ((i30 & 1) == 1) {
                            i46 = i15 + 2;
                            objArr[j.v(i108, 3, 2, 1)] = objects[i129];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((i30 & 1) == 1 || i119 > 17) {
                            i38 = i35;
                            i39 = 0;
                            iObjectFieldOffset2 = 0;
                        } else {
                            int i130 = i35 + 1;
                            int iCharAt14 = stringInfo.charAt(i35);
                            if (iCharAt14 >= 55296) {
                                int i131 = iCharAt14 & 8191;
                                int i132 = 13;
                                while (true) {
                                    i38 = i130 + 1;
                                    cCharAt9 = stringInfo.charAt(i130);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i131 |= (cCharAt9 & 8191) << i132;
                                    i132 += 13;
                                    i130 = i38;
                                }
                                iCharAt14 = i131 | (cCharAt9 << i132);
                            } else {
                                i38 = i130;
                            }
                            int i133 = (iCharAt14 / 32) + (i104 * 2);
                            Object obj3 = objects[i133];
                            if (obj3 instanceof Field) {
                                fieldReflectField = (Field) obj3;
                            } else {
                                fieldReflectField = reflectField(cls, (String) obj3);
                                objects[i133] = fieldReflectField;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                            i39 = iCharAt14 % 32;
                        }
                        if (i119 >= 18 || i119 > 49) {
                            i44 = i37;
                            i45 = iObjectFieldOffset;
                        } else {
                            iArr[i106] = iObjectFieldOffset;
                            i44 = i37;
                            i45 = iObjectFieldOffset;
                            i106++;
                        }
                    } else {
                        if (i119 == 50) {
                            int i134 = i107 + 1;
                            iArr[i107] = i108;
                            int i135 = (i108 / 3) * 2;
                            int i136 = i15 + 2;
                            objArr[i135] = objects[i129];
                            if ((iCharAt12 & 2048) != 0) {
                                i37 = i15 + 3;
                                objArr[i135 + 1] = objects[i136];
                                i36 = iCharAt;
                                z14 = z15;
                                i107 = i134;
                            } else {
                                z14 = z15;
                                i37 = i136;
                                i107 = i134;
                                i36 = iCharAt;
                            }
                        } else {
                            i36 = iCharAt;
                            z14 = z15;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((i30 & 1) == 1) {
                            i38 = i35;
                            i39 = 0;
                            iObjectFieldOffset2 = 0;
                        } else {
                            i38 = i35;
                            i39 = 0;
                            iObjectFieldOffset2 = 0;
                        }
                        if (i119 >= 18) {
                            i44 = i37;
                            i45 = iObjectFieldOffset;
                        } else {
                            i44 = i37;
                            i45 = iObjectFieldOffset;
                        }
                    }
                    i37 = i46;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    if ((i30 & 1) == 1) {
                        i38 = i35;
                        i39 = 0;
                        iObjectFieldOffset2 = 0;
                    } else {
                        i38 = i35;
                        i39 = 0;
                        iObjectFieldOffset2 = 0;
                    }
                    if (i119 >= 18) {
                        i44 = i37;
                        i45 = iObjectFieldOffset;
                    } else {
                        i44 = i37;
                        i45 = iObjectFieldOffset;
                    }
                }
                i37 = i129;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((i30 & 1) == 1) {
                    i38 = i35;
                    i39 = 0;
                    iObjectFieldOffset2 = 0;
                } else {
                    i38 = i35;
                    i39 = 0;
                    iObjectFieldOffset2 = 0;
                }
                if (i119 >= 18) {
                    i44 = i37;
                    i45 = iObjectFieldOffset;
                } else {
                    i44 = i37;
                    i45 = iObjectFieldOffset;
                }
            }
            int i137 = i108 + 1;
            iArr4[i108] = i120;
            int i138 = i108 + 2;
            iArr4[i137] = ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & 512) != 0 ? 536870912 : 0) | (i119 << 20) | i45;
            i108 += 3;
            iArr4[i138] = (i39 << 20) | iObjectFieldOffset2;
            i15 = i44;
            z15 = z14;
            iArr3 = iArr4;
            length = i111;
            iCharAt4 = i30;
            iCharAt = i36;
            i65 = i38;
            i16 = i121;
        }
        return new MessageSchema<>(iArr3, objArr, iCharAt, i16, rawMessageInfo.getDefaultInstance(), z15, false, iArr, iCharAt3, i105, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int numberAt(int i14) {
        return this.buffer[i14];
    }

    private static long offset(int i14) {
        return i14 & OFFSET_MASK;
    }

    private static <T> boolean oneofBooleanAt(T t7, long j8) {
        return ((Boolean) UnsafeUtil.getObject(t7, j8)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t7, long j8) {
        return ((Double) UnsafeUtil.getObject(t7, j8)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t7, long j8) {
        return ((Float) UnsafeUtil.getObject(t7, j8)).floatValue();
    }

    private static <T> int oneofIntAt(T t7, long j8) {
        return ((Integer) UnsafeUtil.getObject(t7, j8)).intValue();
    }

    private static <T> long oneofLongAt(T t7, long j8) {
        return ((Long) UnsafeUtil.getObject(t7, j8)).longValue();
    }

    private <K, V> int parseMapField(T t7, byte[] bArr, int i14, int i15, int i16, long j8, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i16);
        Object object = unsafe.getObject(t7, j8);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t7, j8, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i14, i15, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t7, byte[] bArr, int i14, int i15, int i16, int i17, int i18, int i19, int i24, long j8, int i25, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        Object object;
        Unsafe unsafe = UNSAFE;
        long j14 = this.buffer[i25 + 2] & OFFSET_MASK;
        switch (i24) {
            case 51:
                if (i18 != 1) {
                    return i14;
                }
                unsafe.putObject(t7, j8, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i14)));
                int i26 = i14 + 8;
                unsafe.putInt(t7, j14, i17);
                return i26;
            case 52:
                if (i18 != 5) {
                    return i14;
                }
                unsafe.putObject(t7, j8, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i14)));
                int i27 = i14 + 4;
                unsafe.putInt(t7, j14, i17);
                return i27;
            case 53:
            case 54:
                if (i18 != 0) {
                    return i14;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i14, registers);
                unsafe.putObject(t7, j8, Long.valueOf(registers.long1));
                unsafe.putInt(t7, j14, i17);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i18 != 0) {
                    return i14;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i14, registers);
                unsafe.putObject(t7, j8, Integer.valueOf(registers.int1));
                unsafe.putInt(t7, j14, i17);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i18 != 1) {
                    return i14;
                }
                unsafe.putObject(t7, j8, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i14)));
                int i28 = i14 + 8;
                unsafe.putInt(t7, j14, i17);
                return i28;
            case 57:
            case 64:
                if (i18 != 5) {
                    return i14;
                }
                unsafe.putObject(t7, j8, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i14)));
                int i29 = i14 + 4;
                unsafe.putInt(t7, j14, i17);
                return i29;
            case 58:
                if (i18 != 0) {
                    return i14;
                }
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i14, registers);
                unsafe.putObject(t7, j8, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t7, j14, i17);
                return iDecodeVarint65;
            case 59:
                if (i18 != 2) {
                    return i14;
                }
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i14, registers);
                int i30 = registers.int1;
                if (i30 == 0) {
                    unsafe.putObject(t7, j8, "");
                } else {
                    if ((i19 & 536870912) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint33, iDecodeVarint33 + i30)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t7, j8, new String(bArr, iDecodeVarint33, i30, Internal.UTF_8));
                    iDecodeVarint33 += i30;
                }
                unsafe.putInt(t7, j14, i17);
                return iDecodeVarint33;
            case 60:
                if (i18 != 2) {
                    return i14;
                }
                int iDecodeMessageField = ArrayDecoders.decodeMessageField(getMessageFieldSchema(i25), bArr, i14, i15, registers);
                object = unsafe.getInt(t7, j14) == i17 ? unsafe.getObject(t7, j8) : null;
                if (object == null) {
                    unsafe.putObject(t7, j8, registers.object1);
                } else {
                    unsafe.putObject(t7, j8, Internal.mergeMessage(object, registers.object1));
                }
                unsafe.putInt(t7, j14, i17);
                return iDecodeMessageField;
            case 61:
                if (i18 != 2) {
                    return i14;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i14, registers);
                unsafe.putObject(t7, j8, registers.object1);
                unsafe.putInt(t7, j14, i17);
                return iDecodeBytes;
            case 63:
                if (i18 != 0) {
                    return i14;
                }
                int iDecodeVarint34 = ArrayDecoders.decodeVarint32(bArr, i14, registers);
                int i34 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i25);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i34)) {
                    getMutableUnknownFields(t7).storeField(i16, Long.valueOf(i34));
                    return iDecodeVarint34;
                }
                unsafe.putObject(t7, j8, Integer.valueOf(i34));
                unsafe.putInt(t7, j14, i17);
                return iDecodeVarint34;
            case 66:
                if (i18 != 0) {
                    return i14;
                }
                int iDecodeVarint35 = ArrayDecoders.decodeVarint32(bArr, i14, registers);
                unsafe.putObject(t7, j8, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t7, j14, i17);
                return iDecodeVarint35;
            case 67:
                if (i18 != 0) {
                    return i14;
                }
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i14, registers);
                unsafe.putObject(t7, j8, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t7, j14, i17);
                return iDecodeVarint66;
            case 68:
                if (i18 == 3) {
                    int iDecodeGroupField = ArrayDecoders.decodeGroupField(getMessageFieldSchema(i25), bArr, i14, i15, (i16 & (-8)) | 4, registers);
                    object = unsafe.getInt(t7, j14) == i17 ? unsafe.getObject(t7, j8) : null;
                    if (object == null) {
                        unsafe.putObject(t7, j8, registers.object1);
                    } else {
                        unsafe.putObject(t7, j8, Internal.mergeMessage(object, registers.object1));
                    }
                    unsafe.putInt(t7, j14, i17);
                    return iDecodeGroupField;
                }
                break;
        }
        return i14;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0053. Please report as an issue. */
    private int parseProto3Message(T t7, byte[] bArr, int i14, int i15, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        Unsafe unsafe;
        int i16;
        int i17;
        Unsafe unsafe2;
        int iDecodeVarint64;
        int i18;
        int i19;
        int i24;
        this = this;
        bArr = bArr;
        i15 = i15;
        registers = registers;
        Unsafe unsafe3 = UNSAFE;
        int i25 = -1;
        int iDecodeUnknownField = i14;
        int i26 = -1;
        int i27 = 0;
        while (iDecodeUnknownField < i15) {
            int iDecodeVarint32 = iDecodeUnknownField + 1;
            int i28 = bArr[iDecodeUnknownField];
            if (i28 < 0) {
                iDecodeVarint32 = ArrayDecoders.decodeVarint32(i28, bArr, iDecodeVarint32, registers);
                i28 = registers.int1;
            }
            int i29 = iDecodeVarint32;
            int i30 = i28;
            int i34 = (i30 == true ? 1 : 0) >>> 3;
            int i35 = (i30 == true ? 1 : 0) & 7;
            int iPositionForFieldNumber = i34 > i26 ? this.positionForFieldNumber(i34, i27 / 3) : this.positionForFieldNumber(i34);
            if (iPositionForFieldNumber == i25) {
                unsafe = unsafe3;
                i16 = i29;
                i17 = i34;
                iPositionForFieldNumber = 0;
            } else {
                int i36 = this.buffer[iPositionForFieldNumber + 1];
                int iType = type(i36);
                long jOffset = offset(i36);
                if (iType <= 17) {
                    switch (iType) {
                        case 0:
                            i30 = i30 == true ? 1 : 0;
                            if (i35 == 1) {
                                UnsafeUtil.putDouble(t7, jOffset, ArrayDecoders.decodeDouble(bArr, i29));
                                iDecodeUnknownField = i29 + 8;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            unsafe = unsafe3;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                        case 1:
                            i30 = i30 == true ? 1 : 0;
                            if (i35 == 5) {
                                UnsafeUtil.putFloat(t7, jOffset, ArrayDecoders.decodeFloat(bArr, i29));
                                iDecodeUnknownField = i29 + 4;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            unsafe = unsafe3;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                        case 2:
                        case 3:
                            unsafe2 = unsafe3;
                            if (i35 != 0) {
                                unsafe = unsafe2;
                                i18 = i29;
                                i19 = i34;
                                i24 = i30;
                                i16 = i18;
                                i17 = i19;
                                i30 = i24;
                            } else {
                                iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i29, registers);
                                unsafe3 = unsafe2;
                                unsafe3.putLong(t7, jOffset, registers.long1);
                                iDecodeUnknownField = iDecodeVarint64;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            break;
                        case 4:
                        case 11:
                            unsafe2 = unsafe3;
                            if (i35 == 0) {
                                iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, i29, registers);
                                unsafe2.putInt(t7, jOffset, registers.int1);
                                unsafe3 = unsafe2;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            unsafe = unsafe2;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                        case 5:
                        case 14:
                            unsafe2 = unsafe3;
                            if (i35 == 1) {
                                unsafe2.putLong(t7, jOffset, ArrayDecoders.decodeFixed64(bArr, i29));
                                unsafe2 = unsafe2;
                                iDecodeUnknownField = i29 + 8;
                                unsafe3 = unsafe2;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            unsafe = unsafe2;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                        case 6:
                        case 13:
                            unsafe2 = unsafe3;
                            if (i35 == 5) {
                                unsafe2.putInt(t7, jOffset, ArrayDecoders.decodeFixed32(bArr, i29));
                                iDecodeUnknownField = i29 + 4;
                                unsafe3 = unsafe2;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            unsafe = unsafe2;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                        case 7:
                            unsafe2 = unsafe3;
                            if (i35 == 0) {
                                iDecodeUnknownField = ArrayDecoders.decodeVarint64(bArr, i29, registers);
                                UnsafeUtil.putBoolean(t7, jOffset, registers.long1 != 0);
                                unsafe3 = unsafe2;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            unsafe = unsafe2;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                        case 8:
                            unsafe2 = unsafe3;
                            if (i35 == 2) {
                                iDecodeUnknownField = (536870912 & i36) == 0 ? ArrayDecoders.decodeString(bArr, i29, registers) : ArrayDecoders.decodeStringRequireUtf8(bArr, i29, registers);
                                unsafe2.putObject(t7, jOffset, registers.object1);
                                unsafe3 = unsafe2;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            unsafe = unsafe2;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                        case 9:
                            unsafe2 = unsafe3;
                            if (i35 == 2) {
                                iDecodeUnknownField = ArrayDecoders.decodeMessageField(this.getMessageFieldSchema(iPositionForFieldNumber), bArr, i29, i15, registers);
                                Object object = unsafe2.getObject(t7, jOffset);
                                if (object == null) {
                                    unsafe2.putObject(t7, jOffset, registers.object1);
                                } else {
                                    unsafe2.putObject(t7, jOffset, Internal.mergeMessage(object, registers.object1));
                                }
                                unsafe3 = unsafe2;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            unsafe = unsafe2;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                        case 10:
                            unsafe2 = unsafe3;
                            if (i35 == 2) {
                                iDecodeUnknownField = ArrayDecoders.decodeBytes(bArr, i29, registers);
                                unsafe2.putObject(t7, jOffset, registers.object1);
                                unsafe3 = unsafe2;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            unsafe = unsafe2;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                        case 12:
                            unsafe2 = unsafe3;
                            if (i35 == 0) {
                                iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, i29, registers);
                                unsafe2.putInt(t7, jOffset, registers.int1);
                                unsafe3 = unsafe2;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            unsafe = unsafe2;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30 == true ? 1 : 0;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                        case 15:
                            unsafe2 = unsafe3;
                            if (i35 == 0) {
                                iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, i29, registers);
                                unsafe2.putInt(t7, jOffset, CodedInputStream.decodeZigZag32(registers.int1));
                                unsafe3 = unsafe2;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            unsafe = unsafe2;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30 == true ? 1 : 0;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                        case 16:
                            if (i35 != 0) {
                                unsafe2 = unsafe3;
                                unsafe = unsafe2;
                                i18 = i29;
                                i19 = i34;
                                i24 = i30 == true ? 1 : 0;
                                i16 = i18;
                                i17 = i19;
                                i30 = i24;
                            } else {
                                iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i29, registers);
                                unsafe3.putLong(t7, jOffset, CodedInputStream.decodeZigZag64(registers.long1));
                                unsafe3 = unsafe3;
                                iDecodeUnknownField = iDecodeVarint64;
                                i26 = i34;
                                i27 = iPositionForFieldNumber;
                            }
                            break;
                        default:
                            unsafe = unsafe3;
                            i18 = i29;
                            i19 = i34;
                            i24 = i30 == true ? 1 : 0;
                            i16 = i18;
                            i17 = i19;
                            i30 = i24;
                            break;
                    }
                    i25 = -1;
                } else {
                    i30 = i30 == true ? 1 : 0;
                    if (iType != 27) {
                        unsafe = unsafe3;
                        if (iType <= 49) {
                            int repeatedField = this.parseRepeatedField(t7, bArr, i29, i15, i30 == true ? 1 : 0, i34, i35, iPositionForFieldNumber, i36, iType, jOffset, registers);
                            i24 = i30 == true ? 1 : 0;
                            i19 = i34;
                            if (repeatedField != i29) {
                                iPositionForFieldNumber = iPositionForFieldNumber;
                                iDecodeUnknownField = repeatedField;
                                i26 = i19;
                                i27 = iPositionForFieldNumber;
                                unsafe3 = unsafe;
                                i25 = -1;
                                bArr = bArr;
                            } else {
                                iPositionForFieldNumber = iPositionForFieldNumber;
                                i16 = repeatedField;
                                i17 = i19;
                                i30 = i24;
                            }
                        } else {
                            i19 = i34;
                            i24 = i30 == true ? 1 : 0;
                            i18 = i29;
                            if (iType == 50) {
                                if (i35 == 2) {
                                    int mapField = parseMapField(t7, bArr, i18, i15, iPositionForFieldNumber, jOffset, registers);
                                    if (mapField != i18) {
                                        this = this;
                                        i15 = i15;
                                        iDecodeUnknownField = mapField;
                                        i26 = i19;
                                    } else {
                                        i16 = mapField;
                                    }
                                } else {
                                    i16 = i18;
                                }
                                i17 = i19;
                                i30 = i24;
                            } else {
                                i17 = i19;
                                i30 = i24 == true ? 1 : 0;
                                int oneofField = parseOneofField(t7, bArr, i18, i15, i30 == true ? 1 : 0, i17, i35, i36, iType, jOffset, iPositionForFieldNumber, registers);
                                if (oneofField != i18) {
                                    i26 = i17;
                                    iDecodeUnknownField = oneofField;
                                    i27 = iPositionForFieldNumber;
                                    unsafe3 = unsafe;
                                    i25 = -1;
                                    bArr = bArr;
                                } else {
                                    i16 = oneofField;
                                }
                            }
                        }
                    } else if (i35 == 2) {
                        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe3.getObject(t7, jOffset);
                        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                            int size = protobufListMutableCopyWithCapacity2.size();
                            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                            unsafe3.putObject(t7, jOffset, protobufListMutableCopyWithCapacity2);
                        }
                        unsafe = unsafe3;
                        iDecodeUnknownField = ArrayDecoders.decodeMessageList(this.getMessageFieldSchema(iPositionForFieldNumber), i30 == true ? 1 : 0, bArr, i29, i15, protobufListMutableCopyWithCapacity2, registers);
                        i15 = i15;
                        i26 = i34;
                    } else {
                        unsafe = unsafe3;
                        i18 = i29;
                        i19 = i34;
                        i24 = i30;
                        i16 = i18;
                        i17 = i19;
                        i30 = i24;
                    }
                    i27 = iPositionForFieldNumber;
                    unsafe3 = unsafe;
                    i25 = -1;
                }
            }
            iDecodeUnknownField = ArrayDecoders.decodeUnknownField(i30 == true ? 1 : 0, bArr, i16, i15, getMutableUnknownFields(t7), registers);
            this = this;
            i15 = i15;
            i26 = i17;
            i27 = iPositionForFieldNumber;
            unsafe3 = unsafe;
            i25 = -1;
        }
        if (iDecodeUnknownField == i15) {
            return iDecodeUnknownField;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private int parseRepeatedField(T t7, byte[] bArr, int i14, int i15, int i16, int i17, int i18, int i19, long j8, int i24, long j14, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t7, j14);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t7, j14, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (i24) {
            case 18:
            case 35:
                if (i18 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i14, protobufList, registers);
                }
                if (i18 == 1) {
                    return ArrayDecoders.decodeDoubleList(i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 19:
            case 36:
                if (i18 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i14, protobufList, registers);
                }
                if (i18 == 5) {
                    return ArrayDecoders.decodeFloatList(i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i18 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i14, protobufList, registers);
                }
                if (i18 == 0) {
                    return ArrayDecoders.decodeVarint64List(i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i18 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i14, protobufList, registers);
                }
                if (i18 == 0) {
                    return ArrayDecoders.decodeVarint32List(i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i18 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i14, protobufList, registers);
                }
                if (i18 == 1) {
                    return ArrayDecoders.decodeFixed64List(i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i18 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i14, protobufList, registers);
                }
                if (i18 == 5) {
                    return ArrayDecoders.decodeFixed32List(i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 25:
            case 42:
                if (i18 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i14, protobufList, registers);
                }
                if (i18 == 0) {
                    return ArrayDecoders.decodeBoolList(i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 26:
                if (i18 == 2) {
                    return (j8 & 536870912) == 0 ? ArrayDecoders.decodeStringList(i16, bArr, i14, i15, protobufList, registers) : ArrayDecoders.decodeStringListRequireUtf8(i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 27:
                if (i18 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i19), i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 28:
                if (i18 == 2) {
                    return ArrayDecoders.decodeBytesList(i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 30:
            case 44:
                if (i18 != 2) {
                    if (i18 == 0) {
                        iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i16, bArr, i14, i15, protobufList, registers);
                    }
                    return i14;
                }
                iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i14, protobufList, registers);
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t7;
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLite = null;
                }
                UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) SchemaUtil.filterUnknownEnumList(i17, (List<Integer>) protobufList, getEnumFieldVerifier(i19), unknownFieldSetLite, (UnknownFieldSchema<UT, UnknownFieldSetLite>) this.unknownFieldSchema);
                if (unknownFieldSetLite2 != null) {
                    generatedMessageLite.unknownFields = unknownFieldSetLite2;
                }
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i18 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i14, protobufList, registers);
                }
                if (i18 == 0) {
                    return ArrayDecoders.decodeSInt32List(i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 34:
            case 48:
                if (i18 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i14, protobufList, registers);
                }
                if (i18 == 0) {
                    return ArrayDecoders.decodeSInt64List(i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            case 49:
                if (i18 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i19), i16, bArr, i14, i15, protobufList, registers);
                }
                return i14;
            default:
                return i14;
        }
    }

    private int positionForFieldNumber(int i14) {
        if (i14 < this.minFieldNumber || i14 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i14, 0);
    }

    private int presenceMaskAndOffsetAt(int i14) {
        return this.buffer[i14 + 2];
    }

    private <E> void readGroupList(Object obj, long j8, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j8), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i14, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i14)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i14, Reader reader) {
        if (isEnforceUtf8(i14)) {
            UnsafeUtil.putObject(obj, offset(i14), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i14), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i14), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i14, Reader reader) {
        boolean zIsEnforceUtf8 = isEnforceUtf8(i14);
        ListFieldSchema listFieldSchema = this.listFieldSchema;
        if (zIsEnforceUtf8) {
            reader.readStringListRequireUtf8(listFieldSchema.mutableListAt(obj, offset(i14)));
        } else {
            reader.readStringList(listFieldSchema.mutableListAt(obj, offset(i14)));
        }
    }

    private static Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbL = hb.a.l("Field ", str, " for ");
            j.o(cls, sbL, " not found. Known fields are ");
            sbL.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbL.toString());
        }
    }

    private void setFieldPresent(T t7, int i14) {
        if (this.proto3) {
            return;
        }
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i14);
        long j8 = iPresenceMaskAndOffsetAt & OFFSET_MASK;
        UnsafeUtil.putInt(t7, j8, UnsafeUtil.getInt(t7, j8) | (1 << (iPresenceMaskAndOffsetAt >>> 20)));
    }

    private void setOneofPresent(T t7, int i14, int i15) {
        UnsafeUtil.putInt(t7, presenceMaskAndOffsetAt(i15) & OFFSET_MASK, i14);
    }

    private int slowPositionForFieldNumber(int i14, int i15) {
        int length = (this.buffer.length / 3) - 1;
        while (i15 <= length) {
            int i16 = (length + i15) >>> 1;
            int i17 = i16 * 3;
            int iNumberAt = numberAt(i17);
            if (i14 == iNumberAt) {
                return i17;
            }
            if (i14 < iNumberAt) {
                length = i16 - 1;
            } else {
                i15 = i16 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i14, boolean z14, Object[] objArr) {
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int iId;
        int iNumberOfTrailingZeros;
        int i15;
        int i16;
        int i17;
        Class<?> messageFieldClass;
        int i18;
        OneofInfo oneof = fieldInfo.getOneof();
        if (oneof == null) {
            FieldType type = fieldInfo.getType();
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            int iId2 = type.id();
            if (!z14 && !type.isList() && !type.isMap()) {
                int iObjectFieldOffset3 = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getPresenceField());
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
                iId = iId2;
                i15 = iObjectFieldOffset;
                i16 = iObjectFieldOffset3;
            } else if (fieldInfo.getCachedSizeField() == null) {
                iNumberOfTrailingZeros = 0;
                iId = iId2;
                i15 = iObjectFieldOffset;
                i16 = 0;
            } else {
                iObjectFieldOffset2 = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
                iId = iId2;
            }
            iArr[i14] = fieldInfo.getFieldNumber();
            int i19 = i14 + 1;
            if (fieldInfo.isEnforceUtf8()) {
                i17 = 536870912;
            } else {
                i17 = 0;
            }
            iArr[i19] = (iId << 20) | (fieldInfo.isRequired() ? 268435456 : 0) | i17 | i15;
            iArr[i14 + 2] = (iNumberOfTrailingZeros << 20) | i16;
            messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[j.v(i14, 3, 2, 1)] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[j.v(i14, 3, 2, 1)] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            i18 = (i14 / 3) * 2;
            objArr[i18] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i18 + 1] = messageFieldClass;
            } else if (fieldInfo.getEnumVerifier() != null) {
                objArr[i18 + 1] = fieldInfo.getEnumVerifier();
            }
        }
        iId = fieldInfo.getType().id() + 51;
        iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
        iObjectFieldOffset2 = (int) UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        i15 = iObjectFieldOffset;
        i16 = iObjectFieldOffset2;
        iNumberOfTrailingZeros = 0;
        iArr[i14] = fieldInfo.getFieldNumber();
        int i110 = i14 + 1;
        if (fieldInfo.isEnforceUtf8()) {
            i17 = 536870912;
        } else {
            i17 = 0;
        }
        iArr[i110] = (iId << 20) | (fieldInfo.isRequired() ? 268435456 : 0) | i17 | i15;
        iArr[i14 + 2] = (iNumberOfTrailingZeros << 20) | i16;
        messageFieldClass = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
            if (messageFieldClass != null) {
                objArr[j.v(i14, 3, 2, 1)] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[j.v(i14, 3, 2, 1)] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i18 = (i14 / 3) * 2;
        objArr[i18] = fieldInfo.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i18 + 1] = messageFieldClass;
        } else if (fieldInfo.getEnumVerifier() != null) {
            objArr[i18 + 1] = fieldInfo.getEnumVerifier();
        }
    }

    private static int type(int i14) {
        return (i14 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i14) {
        return this.buffer[i14 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInAscendingOrderProto2(T t7, Writer writer) {
        Iterator it;
        Map.Entry<?, ?> entry;
        boolean z14;
        int i14;
        boolean z15;
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t7);
            if (extensions.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = extensions.iterator();
                entry = (Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length = this.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        while (i16 < length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i16);
            int iNumberAt = numberAt(i16);
            int iType = type(iTypeAndOffsetAt);
            if (this.proto3 || iType > 17) {
                z14 = true;
                entry = entry;
                i14 = 0;
            } else {
                int i18 = this.buffer[i16 + 2];
                int i19 = i18 & OFFSET_MASK;
                Map.Entry<?, ?> entry2 = entry;
                z14 = true;
                if (i19 != i15) {
                    i17 = unsafe.getInt(t7, i19);
                    i15 = i19;
                }
                i14 = 1 << (i18 >>> 20);
                entry = entry2;
            }
            while (entry != null && this.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            Iterator it3 = it;
            int i24 = i14;
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i17 & i24) != 0) {
                        writer.writeDouble(iNumberAt, doubleAt(t7, jOffset));
                    }
                    break;
                case 1:
                    if ((i17 & i24) != 0) {
                        writer.writeFloat(iNumberAt, floatAt(t7, jOffset));
                    }
                    break;
                case 2:
                    if ((i17 & i24) != 0) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t7, jOffset));
                    }
                    break;
                case 3:
                    if ((i17 & i24) != 0) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t7, jOffset));
                    }
                    break;
                case 4:
                    if ((i17 & i24) != 0) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    break;
                case 5:
                    if ((i17 & i24) != 0) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t7, jOffset));
                    }
                    break;
                case 6:
                    if ((i17 & i24) != 0) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    break;
                case 7:
                    if ((i17 & i24) != 0) {
                        writer.writeBool(iNumberAt, booleanAt(t7, jOffset));
                    }
                    break;
                case 8:
                    if ((i17 & i24) != 0) {
                        writeString(iNumberAt, unsafe.getObject(t7, jOffset), writer);
                    }
                    break;
                case 9:
                    if ((i17 & i24) != 0) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t7, jOffset), getMessageFieldSchema(i16));
                    }
                    break;
                case 10:
                    if ((i17 & i24) != 0) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t7, jOffset));
                    }
                    break;
                case 11:
                    if ((i17 & i24) != 0) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    break;
                case 12:
                    if ((i17 & i24) != 0) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    break;
                case 13:
                    if ((i17 & i24) != 0) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    break;
                case 14:
                    if ((i17 & i24) != 0) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t7, jOffset));
                    }
                    break;
                case 15:
                    if ((i17 & i24) != 0) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    break;
                case 16:
                    if ((i17 & i24) != 0) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t7, jOffset));
                    }
                    break;
                case 17:
                    if ((i17 & i24) != 0) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t7, jOffset), getMessageFieldSchema(i16));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, getMessageFieldSchema(i16));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer);
                    break;
                case 29:
                    z15 = false;
                    SchemaUtil.writeUInt32List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 30:
                    z15 = false;
                    SchemaUtil.writeEnumList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 31:
                    z15 = false;
                    SchemaUtil.writeSFixed32List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 32:
                    z15 = false;
                    SchemaUtil.writeSFixed64List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 33:
                    z15 = false;
                    SchemaUtil.writeSInt32List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 34:
                    z15 = false;
                    SchemaUtil.writeSInt64List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(i16), (List) unsafe.getObject(t7, jOffset), writer, getMessageFieldSchema(i16));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, unsafe.getObject(t7, jOffset), i16);
                    break;
                case 51:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t7, jOffset));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t7, jOffset));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t7, jOffset));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t7, jOffset));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t7, jOffset));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t7, jOffset));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writeString(iNumberAt, unsafe.getObject(t7, jOffset), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t7, jOffset), getMessageFieldSchema(i16));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t7, jOffset));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t7, jOffset));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t7, jOffset));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t7, iNumberAt, i16)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t7, jOffset), getMessageFieldSchema(i16));
                    }
                    break;
                default:
                    break;
            }
            i16 += 3;
            it = it3;
        }
        Iterator it4 = it;
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t7, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void writeFieldsInAscendingOrderProto3(T t7, Writer writer) {
        Iterator it;
        Map.Entry<?, ?> entry;
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t7);
            if (extensions.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = extensions.iterator();
                entry = (Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length = this.buffer.length;
        for (int i14 = 0; i14 < length; i14 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i14);
            int iNumberAt = numberAt(i14);
            while (entry != null && this.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeDouble(iNumberAt, doubleAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeFloat(iNumberAt, floatAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeInt64(iNumberAt, longAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeUInt64(iNumberAt, longAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeInt32(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeFixed64(iNumberAt, longAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeFixed32(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeBool(iNumberAt, booleanAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t7, i14)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i14));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeUInt32(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeEnum(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeSFixed32(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeSFixed64(iNumberAt, longAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeSInt32(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeSInt64(iNumberAt, longAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t7, i14)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i14));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(i14));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    SchemaUtil.writeUInt32List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    SchemaUtil.writeEnumList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    SchemaUtil.writeSFixed32List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    SchemaUtil.writeSFixed64List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    SchemaUtil.writeSInt64List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(i14), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(i14));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), i14);
                    break;
                case 51:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i14));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t7, iNumberAt, i14)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i14));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t7, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInDescendingOrder(T t7, Writer writer) {
        Iterator itDescendingIterator;
        Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, t7, writer);
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t7);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                entry = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                entry = (Map.Entry) itDescendingIterator.next();
            }
        } else {
            itDescendingIterator = null;
            entry = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t7, length)) {
                        writer.writeDouble(iNumberAt, doubleAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t7, length)) {
                        writer.writeFloat(iNumberAt, floatAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t7, length)) {
                        writer.writeInt64(iNumberAt, longAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t7, length)) {
                        writer.writeUInt64(iNumberAt, longAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t7, length)) {
                        writer.writeInt32(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t7, length)) {
                        writer.writeFixed64(iNumberAt, longAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t7, length)) {
                        writer.writeFixed32(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t7, length)) {
                        writer.writeBool(iNumberAt, booleanAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t7, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t7, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t7, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t7, length)) {
                        writer.writeUInt32(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t7, length)) {
                        writer.writeEnum(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t7, length)) {
                        writer.writeSFixed32(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t7, length)) {
                        writer.writeSFixed64(iNumberAt, longAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t7, length)) {
                        writer.writeSInt32(iNumberAt, intAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t7, length)) {
                        writer.writeSInt64(iNumberAt, longAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t7, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t7, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t7, iNumberAt, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t7, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(Writer writer, int i14, Object obj, int i15) {
        if (obj != null) {
            writer.writeMap(i14, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i15)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i14, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i14, (String) obj);
        } else {
            writer.writeBytes(i14, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t7, Writer writer) {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t7), writer);
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int getSerializedSize(T t7) {
        return this.proto3 ? getSerializedSizeProto3(t7) : getSerializedSizeProto2(t7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int hashCode(T t7) {
        int i14;
        int iHashLong;
        int i15;
        int iOneofIntAt;
        int length = this.buffer.length;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i17);
            int iNumberAt = numberAt(i17);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i14 = i16 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t7, jOffset)));
                    i16 = iHashLong + i14;
                    break;
                case 1:
                    i14 = i16 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t7, jOffset));
                    i16 = iHashLong + i14;
                    break;
                case 2:
                    i14 = i16 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t7, jOffset));
                    i16 = iHashLong + i14;
                    break;
                case 3:
                    i14 = i16 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t7, jOffset));
                    i16 = iHashLong + i14;
                    break;
                case 4:
                    i15 = i16 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t7, jOffset);
                    i16 = i15 + iOneofIntAt;
                    break;
                case 5:
                    i14 = i16 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t7, jOffset));
                    i16 = iHashLong + i14;
                    break;
                case 6:
                    i15 = i16 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t7, jOffset);
                    i16 = i15 + iOneofIntAt;
                    break;
                case 7:
                    i14 = i16 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t7, jOffset));
                    i16 = iHashLong + i14;
                    break;
                case 8:
                    i14 = i16 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t7, jOffset)).hashCode();
                    i16 = iHashLong + i14;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t7, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i16 = (i16 * 53) + iHashCode;
                    break;
                case 10:
                    i14 = i16 * 53;
                    iHashLong = UnsafeUtil.getObject(t7, jOffset).hashCode();
                    i16 = iHashLong + i14;
                    break;
                case 11:
                    i15 = i16 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t7, jOffset);
                    i16 = i15 + iOneofIntAt;
                    break;
                case 12:
                    i15 = i16 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t7, jOffset);
                    i16 = i15 + iOneofIntAt;
                    break;
                case 13:
                    i15 = i16 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t7, jOffset);
                    i16 = i15 + iOneofIntAt;
                    break;
                case 14:
                    i14 = i16 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t7, jOffset));
                    i16 = iHashLong + i14;
                    break;
                case 15:
                    i15 = i16 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t7, jOffset);
                    i16 = i15 + iOneofIntAt;
                    break;
                case 16:
                    i14 = i16 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t7, jOffset));
                    i16 = iHashLong + i14;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t7, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i16 = (i16 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i14 = i16 * 53;
                    iHashLong = UnsafeUtil.getObject(t7, jOffset).hashCode();
                    i16 = iHashLong + i14;
                    break;
                case 50:
                    i14 = i16 * 53;
                    iHashLong = UnsafeUtil.getObject(t7, jOffset).hashCode();
                    i16 = iHashLong + i14;
                    break;
                case 51:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t7, jOffset)));
                        i16 = iHashLong + i14;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t7, jOffset));
                        i16 = iHashLong + i14;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t7, jOffset));
                        i16 = iHashLong + i14;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t7, jOffset));
                        i16 = iHashLong + i14;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i15 = i16 * 53;
                        iOneofIntAt = oneofIntAt(t7, jOffset);
                        i16 = i15 + iOneofIntAt;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t7, jOffset));
                        i16 = iHashLong + i14;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i15 = i16 * 53;
                        iOneofIntAt = oneofIntAt(t7, jOffset);
                        i16 = i15 + iOneofIntAt;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t7, jOffset));
                        i16 = iHashLong + i14;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(t7, jOffset)).hashCode();
                        i16 = iHashLong + i14;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = UnsafeUtil.getObject(t7, jOffset).hashCode();
                        i16 = iHashLong + i14;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = UnsafeUtil.getObject(t7, jOffset).hashCode();
                        i16 = iHashLong + i14;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i15 = i16 * 53;
                        iOneofIntAt = oneofIntAt(t7, jOffset);
                        i16 = i15 + iOneofIntAt;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i15 = i16 * 53;
                        iOneofIntAt = oneofIntAt(t7, jOffset);
                        i16 = i15 + iOneofIntAt;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i15 = i16 * 53;
                        iOneofIntAt = oneofIntAt(t7, jOffset);
                        i16 = i15 + iOneofIntAt;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t7, jOffset));
                        i16 = iHashLong + i14;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i15 = i16 * 53;
                        iOneofIntAt = oneofIntAt(t7, jOffset);
                        i16 = i15 + iOneofIntAt;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t7, jOffset));
                        i16 = iHashLong + i14;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t7, iNumberAt, i17)) {
                        i14 = i16 * 53;
                        iHashLong = UnsafeUtil.getObject(t7, jOffset).hashCode();
                        i16 = iHashLong + i14;
                    }
                    break;
            }
        }
        int iHashCode2 = this.unknownFieldSchema.getFromMessage(t7).hashCode() + (i16 * 53);
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t7).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:58:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0090 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final boolean isInitialized(T t7) {
        int i14;
        int i15 = -1;
        int i16 = 0;
        for (int i17 = 0; i17 < this.checkInitializedCount; i17++) {
            int i18 = this.intArray[i17];
            int iNumberAt = numberAt(i18);
            int iTypeAndOffsetAt = typeAndOffsetAt(i18);
            if (this.proto3) {
                i14 = 0;
            } else {
                int i19 = this.buffer[i18 + 2];
                int i24 = OFFSET_MASK & i19;
                i14 = 1 << (i19 >>> 20);
                if (i24 != i15) {
                    i16 = UNSAFE.getInt(t7, i24);
                    i15 = i24;
                }
            }
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t7, i18, i16, i14)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t7, i18, i16, i14) && !isInitialized(t7, iTypeAndOffsetAt, getMessageFieldSchema(i18))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t7, iTypeAndOffsetAt, i18)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t7, iNumberAt, i18) && !isInitialized(t7, iTypeAndOffsetAt, getMessageFieldSchema(i18))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(t7, iTypeAndOffsetAt, i18)) {
                    return false;
                }
            } else if (!isListInitialized(t7, iTypeAndOffsetAt, i18)) {
                return false;
            }
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t7).isInitialized();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void makeImmutable(T t7) {
        int i14;
        int[] iArr;
        int i15 = this.checkInitializedCount;
        while (true) {
            i14 = this.repeatedFieldOffsetStart;
            iArr = this.intArray;
            if (i15 >= i14) {
                break;
            }
            long jOffset = offset(typeAndOffsetAt(iArr[i15]));
            Object object = UnsafeUtil.getObject(t7, jOffset);
            if (object != null) {
                UnsafeUtil.putObject(t7, jOffset, this.mapFieldSchema.toImmutable(object));
            }
            i15++;
        }
        int length = iArr.length;
        while (i14 < length) {
            this.listFieldSchema.makeImmutableListAt(t7, this.intArray[i14]);
            i14++;
        }
        this.unknownFieldSchema.makeImmutable(t7);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(t7);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T t7, T t14) {
        t14.getClass();
        for (int i14 = 0; i14 < this.buffer.length; i14 += 3) {
            mergeSingleField(t7, t14, i14);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t7, t14);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t7, t14);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public int parseProto2Message(T r29, byte[] r30, int r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r34) {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.parseProto2Message(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void writeTo(T t7, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t7, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t7, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t7, writer);
        }
    }

    private int positionForFieldNumber(int i14, int i15) {
        if (i14 < this.minFieldNumber || i14 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i14, i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T t7, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t7, reader, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T t7, byte[] bArr, int i14, int i15, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        if (this.proto3) {
            parseProto3Message(t7, bArr, i14, i15, registers);
        } else {
            parseProto2Message(t7, bArr, i14, i15, 0, registers);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i14, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i14)));
    }

    private boolean isFieldPresent(T t7, int i14, int i15, int i16) {
        if (this.proto3) {
            return isFieldPresent(t7, i14);
        }
        return (i15 & i16) != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public boolean equals(T t7, T t14) {
        int length = this.buffer.length;
        for (int i14 = 0; i14 < length; i14 += 3) {
            if (!equals(t7, t14, i14)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t7).equals(this.unknownFieldSchema.getFromMessage(t14))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t7).equals(this.extensionSchema.getExtensions(t14));
        }
        return true;
    }
}
