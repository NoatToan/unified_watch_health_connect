package com.google.protobuf;

import androidx.core.view.j;
import i3.e5;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg.f;
import o2.c;
import sun.misc.Unsafe;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
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
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX INFO: renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
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

    private MessageSchema(int[] iArr, Object[] objArr, int i14, int i15, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z14, int[] iArr2, int i16, int i17, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i14;
        this.maxFieldNumber = i15;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z14;
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

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        h.s(e5.f(obj, "Mutating immutable message: "));
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

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i14, UB ub3, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i14);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i14)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i14)) == null) ? ub3 : (UB) filterUnknownEnumMap(i14, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub3, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i14, int i15, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub3, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i14));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub3 == null) {
                    ub3 = unknownFieldSchema.getBuilderFromMessage(obj);
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
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i14);
        long j8 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j8 != 1048575) {
            return (UnsafeUtil.getInt(t7, j8) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i14);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t7, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t7, jOffset)) != 0;
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

    private static boolean isLegacyEnumIsClosed(int i14) {
        return (i14 & Integer.MIN_VALUE) != 0;
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
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
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

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t7, T t14, int i14) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i14) & 1048575;
        return UnsafeUtil.getInt(t7, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t14, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t7, int i14, int i15) {
        return UnsafeUtil.getInt(t7, (long) (presenceMaskAndOffsetAt(i15) & 1048575)) == i14;
    }

    private static boolean isRequired(int i14) {
        return (i14 & 268435456) != 0;
    }

    private static <T> long longAt(T t7, long j8) {
        return UnsafeUtil.getLong(t7, j8);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r18, com.google.protobuf.ExtensionSchema<ET> r19, T r20, com.google.protobuf.Reader r21, com.google.protobuf.ExtensionRegistryLite r22) {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
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

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t7, T t14, int i14) {
        if (isFieldPresent(t14, i14)) {
            long jOffset = offset(typeAndOffsetAt(i14));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t14, jOffset);
            if (object == null) {
                a.f(numberAt(i14), t14);
                return;
            }
            Schema messageFieldSchema = getMessageFieldSchema(i14);
            if (!isFieldPresent(t7, i14)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t7, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t7, jOffset, object);
                }
                setFieldPresent(t7, i14);
                return;
            }
            Object object2 = unsafe.getObject(t7, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t7, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t7, T t14, int i14) {
        int iNumberAt = numberAt(i14);
        if (isOneofPresent(t14, iNumberAt, i14)) {
            long jOffset = offset(typeAndOffsetAt(i14));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t14, jOffset);
            if (object == null) {
                a.f(numberAt(i14), t14);
                return;
            }
            Schema messageFieldSchema = getMessageFieldSchema(i14);
            if (!isOneofPresent(t7, iNumberAt, i14)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t7, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t7, jOffset, object);
                }
                setOneofPresent(t7, iNumberAt, i14);
                return;
            }
            Object object2 = unsafe.getObject(t7, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t7, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
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

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t7, int i14) {
        Schema messageFieldSchema = getMessageFieldSchema(i14);
        long jOffset = offset(typeAndOffsetAt(i14));
        if (!isFieldPresent(t7, i14)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t7, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t7, int i14, int i15) {
        Schema messageFieldSchema = getMessageFieldSchema(i15);
        if (!isOneofPresent(t7, i14, i15)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t7, offset(typeAndOffsetAt(i15)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
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
            storeFieldData(fieldInfo2, iArr, i17, objArr);
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
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0359  */
    /* JADX WARN: Code duplicated, block: B:183:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ba  */
    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i14;
        int iCharAt;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int i24;
        int i25;
        char cCharAt;
        int i26;
        char cCharAt2;
        int i27;
        char cCharAt3;
        int i28;
        char cCharAt4;
        int i29;
        char cCharAt5;
        int i30;
        char cCharAt6;
        int i34;
        char cCharAt7;
        int i35;
        char cCharAt8;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int iObjectFieldOffset;
        char c14;
        int iObjectFieldOffset2;
        int i45;
        int i46;
        java.lang.reflect.Field fieldReflectField;
        char cCharAt9;
        int i47;
        java.lang.reflect.Field fieldReflectField2;
        java.lang.reflect.Field fieldReflectField3;
        int i48;
        char cCharAt10;
        int i49;
        char cCharAt11;
        int i54;
        char cCharAt12;
        int i55;
        char cCharAt13;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c15 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i56 = 1;
            while (true) {
                i14 = i56 + 1;
                if (stringInfo.charAt(i56) < 55296) {
                    break;
                }
                i56 = i14;
            }
        } else {
            i14 = 1;
        }
        int i57 = i14 + 1;
        int iCharAt2 = stringInfo.charAt(i14);
        if (iCharAt2 >= 55296) {
            int i58 = iCharAt2 & 8191;
            int i59 = 13;
            while (true) {
                i55 = i57 + 1;
                cCharAt13 = stringInfo.charAt(i57);
                if (cCharAt13 < 55296) {
                    break;
                }
                i58 |= (cCharAt13 & 8191) << i59;
                i59 += 13;
                i57 = i55;
            }
            iCharAt2 = i58 | (cCharAt13 << i59);
            i57 = i55;
        }
        if (iCharAt2 == 0) {
            i17 = 0;
            iCharAt = 0;
            i16 = 0;
            i24 = 0;
            i15 = 0;
            i19 = 0;
            iArr = EMPTY_INT_ARRAY;
            i18 = 0;
        } else {
            int i64 = i57 + 1;
            int iCharAt3 = stringInfo.charAt(i57);
            if (iCharAt3 >= 55296) {
                int i65 = iCharAt3 & 8191;
                int i66 = 13;
                while (true) {
                    i35 = i64 + 1;
                    cCharAt8 = stringInfo.charAt(i64);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt8 & 8191) << i66;
                    i66 += 13;
                    i64 = i35;
                }
                iCharAt3 = i65 | (cCharAt8 << i66);
                i64 = i35;
            }
            int i67 = i64 + 1;
            int iCharAt4 = stringInfo.charAt(i64);
            if (iCharAt4 >= 55296) {
                int i68 = iCharAt4 & 8191;
                int i69 = 13;
                while (true) {
                    i34 = i67 + 1;
                    cCharAt7 = stringInfo.charAt(i67);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt7 & 8191) << i69;
                    i69 += 13;
                    i67 = i34;
                }
                iCharAt4 = i68 | (cCharAt7 << i69);
                i67 = i34;
            }
            int i74 = i67 + 1;
            int iCharAt5 = stringInfo.charAt(i67);
            if (iCharAt5 >= 55296) {
                int i75 = iCharAt5 & 8191;
                int i76 = 13;
                while (true) {
                    i30 = i74 + 1;
                    cCharAt6 = stringInfo.charAt(i74);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt6 & 8191) << i76;
                    i76 += 13;
                    i74 = i30;
                }
                iCharAt5 = i75 | (cCharAt6 << i76);
                i74 = i30;
            }
            int i77 = i74 + 1;
            int iCharAt6 = stringInfo.charAt(i74);
            if (iCharAt6 >= 55296) {
                int i78 = iCharAt6 & 8191;
                int i79 = 13;
                while (true) {
                    i29 = i77 + 1;
                    cCharAt5 = stringInfo.charAt(i77);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i78 |= (cCharAt5 & 8191) << i79;
                    i79 += 13;
                    i77 = i29;
                }
                iCharAt6 = i78 | (cCharAt5 << i79);
                i77 = i29;
            }
            int i84 = i77 + 1;
            iCharAt = stringInfo.charAt(i77);
            if (iCharAt >= 55296) {
                int i85 = iCharAt & 8191;
                int i86 = 13;
                while (true) {
                    i28 = i84 + 1;
                    cCharAt4 = stringInfo.charAt(i84);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i85 |= (cCharAt4 & 8191) << i86;
                    i86 += 13;
                    i84 = i28;
                }
                iCharAt = i85 | (cCharAt4 << i86);
                i84 = i28;
            }
            int i87 = i84 + 1;
            int iCharAt7 = stringInfo.charAt(i84);
            if (iCharAt7 >= 55296) {
                int i88 = iCharAt7 & 8191;
                int i89 = 13;
                while (true) {
                    i27 = i87 + 1;
                    cCharAt3 = stringInfo.charAt(i87);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i88 |= (cCharAt3 & 8191) << i89;
                    i89 += 13;
                    i87 = i27;
                }
                iCharAt7 = i88 | (cCharAt3 << i89);
                i87 = i27;
            }
            int i93 = i87 + 1;
            int iCharAt8 = stringInfo.charAt(i87);
            if (iCharAt8 >= 55296) {
                int i94 = iCharAt8 & 8191;
                int i95 = 13;
                while (true) {
                    i26 = i93 + 1;
                    cCharAt2 = stringInfo.charAt(i93);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i94 |= (cCharAt2 & 8191) << i95;
                    i95 += 13;
                    i93 = i26;
                }
                iCharAt8 = i94 | (cCharAt2 << i95);
                i93 = i26;
            }
            int i96 = i93 + 1;
            int iCharAt9 = stringInfo.charAt(i93);
            if (iCharAt9 >= 55296) {
                int i97 = iCharAt9 & 8191;
                int i98 = 13;
                while (true) {
                    i25 = i96 + 1;
                    cCharAt = stringInfo.charAt(i96);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i97 |= (cCharAt & 8191) << i98;
                    i98 += 13;
                    i96 = i25;
                }
                iCharAt9 = i97 | (cCharAt << i98);
                i96 = i25;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i15 = (iCharAt3 * 2) + iCharAt4;
            int i99 = iCharAt7;
            i16 = iCharAt5;
            i17 = i99;
            i18 = iCharAt3;
            iArr = iArr2;
            i19 = iCharAt9;
            i57 = i96;
            i24 = iCharAt6;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i100 = i19 + i17;
        int i101 = i100;
        int i102 = i19;
        int i103 = 0;
        int i104 = 0;
        while (i57 < length) {
            int i105 = i57 + 1;
            int iCharAt10 = stringInfo.charAt(i57);
            if (iCharAt10 >= c15) {
                int i106 = iCharAt10 & 8191;
                int i107 = i105;
                int i108 = 13;
                while (true) {
                    i54 = i107 + 1;
                    cCharAt12 = stringInfo.charAt(i107);
                    if (cCharAt12 < c15) {
                        break;
                    }
                    i106 |= (cCharAt12 & 8191) << i108;
                    i108 += 13;
                    i107 = i54;
                }
                iCharAt10 = i106 | (cCharAt12 << i108);
                i36 = i54;
            } else {
                i36 = i105;
            }
            int i109 = i36 + 1;
            int iCharAt11 = stringInfo.charAt(i36);
            if (iCharAt11 >= c15) {
                int i110 = iCharAt11 & 8191;
                int i111 = i109;
                int i112 = 13;
                while (true) {
                    i49 = i111 + 1;
                    cCharAt11 = stringInfo.charAt(i111);
                    i37 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i110 |= (cCharAt11 & 8191) << i112;
                    i112 += 13;
                    i111 = i49;
                    length = i37;
                }
                iCharAt11 = i110 | (cCharAt11 << i112);
                i38 = i49;
            } else {
                i37 = length;
                i38 = i109;
            }
            int i113 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i104] = i103;
                i104++;
            }
            int i114 = iCharAt10;
            if (i113 >= 51) {
                int i115 = i38 + 1;
                int iCharAt12 = stringInfo.charAt(i38);
                char c16 = 55296;
                if (iCharAt12 >= 55296) {
                    int i116 = iCharAt12 & 8191;
                    int i117 = 13;
                    while (true) {
                        i48 = i115 + 1;
                        cCharAt10 = stringInfo.charAt(i115);
                        if (cCharAt10 < c16) {
                            break;
                        }
                        i116 |= (cCharAt10 & 8191) << i117;
                        i117 += 13;
                        i115 = i48;
                        c16 = 55296;
                    }
                    iCharAt12 = i116 | (cCharAt10 << i117);
                    i115 = i48;
                }
                int i118 = i113 - 51;
                int i119 = iCharAt12;
                if (i118 == 9 || i118 == 17) {
                    objArr[j.v(i103, 3, 2, 1)] = objects[i15];
                    i15++;
                } else if (i118 == 12 && (rawMessageInfo.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & 2048) != 0)) {
                    objArr[j.v(i103, 3, 2, 1)] = objects[i15];
                    i15++;
                }
                int i120 = i119 * 2;
                Object obj = objects[i120];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i120] = fieldReflectField2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                int i121 = i120 + 1;
                Object obj2 = objects[i121];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i121] = fieldReflectField3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i100 = i100;
                i57 = i115;
                iObjectFieldOffset = iObjectFieldOffset3;
                c14 = 2;
                stringInfo = stringInfo;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i39 = i18;
                i44 = i15;
                i46 = 0;
            } else {
                int i122 = i15 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i15]);
                if (i113 == 9 || i113 == 17) {
                    i39 = i18;
                    objArr[j.v(i103, 3, 2, 1)] = fieldReflectField4.getType();
                } else {
                    if (i113 == 27 || i113 == 49) {
                        i39 = i18;
                        i47 = i15 + 2;
                        objArr[j.v(i103, 3, 2, 1)] = objects[i122];
                    } else if (i113 == 12 || i113 == 30 || i113 == 44) {
                        i39 = i18;
                        if (rawMessageInfo.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i47 = i15 + 2;
                            objArr[j.v(i103, 3, 2, 1)] = objects[i122];
                        }
                    } else {
                        if (i113 == 50) {
                            int i123 = i102 + 1;
                            iArr[i102] = i103;
                            int i124 = (i103 / 3) * 2;
                            int i125 = i15 + 2;
                            objArr[i124] = objects[i122];
                            if ((iCharAt11 & 2048) != 0) {
                                objArr[i124 + 1] = objects[i125];
                                i39 = i18;
                                i100 = i100;
                                i102 = i123;
                                i44 = i15 + 3;
                            } else {
                                i39 = i18;
                                i44 = i125;
                                i100 = i100;
                                i102 = i123;
                            }
                        } else {
                            i39 = i18;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((iCharAt11 & 4096) != 0 || i113 > 17) {
                            c14 = 2;
                            iObjectFieldOffset2 = 1048575;
                            i45 = i38;
                            i46 = 0;
                        } else {
                            int i126 = i38 + 1;
                            int iCharAt13 = stringInfo.charAt(i38);
                            if (iCharAt13 >= 55296) {
                                int i127 = iCharAt13 & 8191;
                                int i128 = 13;
                                while (true) {
                                    i45 = i126 + 1;
                                    cCharAt9 = stringInfo.charAt(i126);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i127 |= (cCharAt9 & 8191) << i128;
                                    i128 += 13;
                                    i126 = i45;
                                }
                                iCharAt13 = i127 | (cCharAt9 << i128);
                            } else {
                                i45 = i126;
                            }
                            c14 = 2;
                            int i129 = (iCharAt13 / 32) + (i39 * 2);
                            Object obj3 = objects[i129];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldReflectField = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldReflectField = reflectField(cls, (String) obj3);
                                objects[i129] = fieldReflectField;
                            }
                            int i130 = iCharAt13;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                            i46 = i130 % 32;
                        }
                        if (i113 >= 18 && i113 <= 49) {
                            iArr[i101] = iObjectFieldOffset;
                            i101++;
                        }
                        i57 = i45;
                    }
                    i44 = i47;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    if ((iCharAt11 & 4096) != 0) {
                        c14 = 2;
                        iObjectFieldOffset2 = 1048575;
                        i45 = i38;
                        i46 = 0;
                    } else {
                        c14 = 2;
                        iObjectFieldOffset2 = 1048575;
                        i45 = i38;
                        i46 = 0;
                    }
                    if (i113 >= 18) {
                        iArr[i101] = iObjectFieldOffset;
                        i101++;
                    }
                    i57 = i45;
                }
                i44 = i122;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((iCharAt11 & 4096) != 0) {
                    c14 = 2;
                    iObjectFieldOffset2 = 1048575;
                    i45 = i38;
                    i46 = 0;
                } else {
                    c14 = 2;
                    iObjectFieldOffset2 = 1048575;
                    i45 = i38;
                    i46 = 0;
                }
                if (i113 >= 18) {
                    iArr[i101] = iObjectFieldOffset;
                    i101++;
                }
                i57 = i45;
            }
            int i131 = i103 + 1;
            iArr4[i103] = i114;
            int i132 = i103 + 2;
            int i133 = iObjectFieldOffset2;
            iArr4[i131] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i113 << 20) | iObjectFieldOffset;
            i103 += 3;
            iArr4[i132] = (i46 << 20) | i133;
            i15 = i44;
            stringInfo = stringInfo;
            i100 = i100;
            iArr3 = iArr4;
            i18 = i39;
            length = i37;
            c15 = 55296;
        }
        return new MessageSchema<>(iArr3, objArr, i16, i24, rawMessageInfo.getDefaultInstance(), rawMessageInfo.getSyntax(), false, iArr, i19, i100, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int numberAt(int i14) {
        return this.buffer[i14];
    }

    private static long offset(int i14) {
        return i14 & 1048575;
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
        Unsafe unsafe = UNSAFE;
        long j14 = this.buffer[i25 + 2] & 1048575;
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
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t7, i17, i25);
                int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i25), bArr, i14, i15, registers);
                storeOneofMessageField(t7, i17, i25, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
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
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t7, i17, i25);
                    int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i25), bArr, i14, i15, (i16 & (-8)) | 4, registers);
                    storeOneofMessageField(t7, i17, i25, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
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
                SchemaUtil.filterUnknownEnumList((Object) t7, i17, (List<Integer>) protobufList, getEnumFieldVerifier(i19), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
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

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
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
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i14);
        long j8 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j8 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t7, j8, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t7, j8));
    }

    private void setOneofPresent(T t7, int i14, int i15) {
        UnsafeUtil.putInt(t7, presenceMaskAndOffsetAt(i15) & 1048575, i14);
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

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i14, Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i15;
        Class<?> messageFieldClass;
        int i16;
        OneofInfo oneof = fieldInfo.getOneof();
        if (oneof == null) {
            FieldType type = fieldInfo.getType();
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i14] = fieldInfo.getFieldNumber();
            int i17 = i14 + 1;
            if (fieldInfo.isEnforceUtf8()) {
                i15 = 536870912;
            } else {
                i15 = 0;
            }
            iArr[i17] = (fieldInfo.isRequired() ? 268435456 : 0) | i15 | (iId << 20) | iObjectFieldOffset;
            iArr[i14 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
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
            i16 = (i14 / 3) * 2;
            objArr[i16] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i16 + 1] = messageFieldClass;
            } else if (fieldInfo.getEnumVerifier() != null) {
                objArr[i16 + 1] = fieldInfo.getEnumVerifier();
            }
        }
        iId = fieldInfo.getType().id() + 51;
        iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
        jObjectFieldOffset = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i14] = fieldInfo.getFieldNumber();
        int i18 = i14 + 1;
        if (fieldInfo.isEnforceUtf8()) {
            i15 = 536870912;
        } else {
            i15 = 0;
        }
        iArr[i18] = (fieldInfo.isRequired() ? 268435456 : 0) | i15 | (iId << 20) | iObjectFieldOffset;
        iArr[i14 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
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
        i16 = (i14 / 3) * 2;
        objArr[i16] = fieldInfo.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i16 + 1] = messageFieldClass;
        } else if (fieldInfo.getEnumVerifier() != null) {
            objArr[i16 + 1] = fieldInfo.getEnumVerifier();
        }
    }

    private void storeMessageField(T t7, int i14, Object obj) {
        UNSAFE.putObject(t7, offset(typeAndOffsetAt(i14)), obj);
        setFieldPresent(t7, i14);
    }

    private void storeOneofMessageField(T t7, int i14, int i15, Object obj) {
        UNSAFE.putObject(t7, offset(typeAndOffsetAt(i15)), obj);
        setOneofPresent(t7, i14, i15);
    }

    private static int type(int i14) {
        return (i14 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i14) {
        return this.buffer[i14 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void writeFieldsInAscendingOrder(T t7, Writer writer) {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z14;
        int i14;
        int i15;
        int i16;
        boolean z15;
        MessageSchema<T> messageSchema = this;
        if (messageSchema.hasExtensions) {
            FieldSet<T> extensions = messageSchema.extensionSchema.getExtensions(t7);
            if (extensions.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator it3 = extensions.iterator();
                entry = (Map.Entry) it3.next();
                it = it3;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = messageSchema.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i18);
            int iNumberAt = messageSchema.numberAt(i18);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i24 = messageSchema.buffer[i18 + 2];
                z14 = true;
                int i25 = i24 & 1048575;
                if (i25 != i17) {
                    i19 = i25 == 1048575 ? 0 : unsafe.getInt(t7, i25);
                    i17 = i25;
                }
                i14 = i17;
                i15 = i19;
                i16 = 1 << (i24 >>> 20);
            } else {
                z14 = true;
                i14 = i17;
                i15 = i19;
                i16 = 0;
            }
            while (entry != null && messageSchema.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                messageSchema.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeDouble(iNumberAt, doubleAt(t7, jOffset));
                    }
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeFloat(iNumberAt, floatAt(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeBool(iNumberAt, booleanAt(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(t7, jOffset), writer);
                    }
                    break;
                case 9:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t7, jOffset), messageSchema.getMessageFieldSchema(i18));
                    }
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t7, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 17:
                    if (messageSchema.isFieldPresent(t7, i18, i14, i15, i16)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t7, jOffset), messageSchema.getMessageFieldSchema(i18));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, messageSchema.getMessageFieldSchema(i18));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer);
                    break;
                case 29:
                    z15 = false;
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 30:
                    z15 = false;
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 31:
                    z15 = false;
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 32:
                    z15 = false;
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 33:
                    z15 = false;
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 34:
                    z15 = false;
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, z14);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(messageSchema.numberAt(i18), (List) unsafe.getObject(t7, jOffset), writer, messageSchema.getMessageFieldSchema(i18));
                    break;
                case 50:
                    messageSchema.writeMapHelper(writer, iNumberAt, unsafe.getObject(t7, jOffset), i18);
                    break;
                case 51:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t7, jOffset));
                    }
                    break;
                case 52:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t7, jOffset));
                    }
                    break;
                case 53:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t7, jOffset));
                    }
                    break;
                case 54:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t7, jOffset));
                    }
                    break;
                case 55:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 56:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t7, jOffset));
                    }
                    break;
                case 57:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 58:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t7, jOffset));
                    }
                    break;
                case 59:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(t7, jOffset), writer);
                    }
                    break;
                case 60:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t7, jOffset), messageSchema.getMessageFieldSchema(i18));
                    }
                    break;
                case 61:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t7, jOffset));
                    }
                    break;
                case 62:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 63:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 64:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 65:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t7, jOffset));
                    }
                    break;
                case 66:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t7, jOffset));
                    }
                    break;
                case 67:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t7, jOffset));
                    }
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(t7, iNumberAt, i18)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t7, jOffset), messageSchema.getMessageFieldSchema(i18));
                    }
                    break;
                default:
                    break;
            }
            i18 += 3;
            i19 = i15;
            i17 = i14;
            entry = entry;
        }
        while (entry != null) {
            messageSchema.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, t7, writer);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:251:0x0559 A[PHI: r0 r1
      0x0559: PHI (r0v2 com.google.protobuf.MessageSchema<T>) = 
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v26 com.google.protobuf.MessageSchema<T>)
      (r0v32 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
     binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0559: PHI (r1v4 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v5 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t7) {
        int i14;
        int iComputeDoubleSize;
        int iComputeFloatSize;
        int iComputeInt64Size;
        int iComputeSizeMessage;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        MessageSchema<T> messageSchema = this;
        T t14 = t7;
        Unsafe unsafe = UNSAFE;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int iComputeBytesSize = 0;
        int i18 = 1048575;
        while (i16 < messageSchema.buffer.length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i16);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = messageSchema.numberAt(i16);
            int i19 = messageSchema.buffer[i16 + 2];
            int i24 = i19 & i15;
            if (iType <= 17) {
                if (i24 != i18) {
                    i17 = i24 == i15 ? 0 : unsafe.getInt(t14, i24);
                    i18 = i24;
                }
                i14 = 1 << (i19 >>> 20);
            } else {
                i14 = 0;
            }
            int i25 = iComputeBytesSize;
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i24 = 0;
            }
            switch (iType) {
                case 0:
                    if (!messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeFloatSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeBytesSize = iComputeFloatSize + i25;
                        messageSchema = this;
                        t14 = t7;
                    }
                    messageSchema = this;
                    t14 = t7;
                    iComputeBytesSize = i25;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeInt64Size = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t14, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i25;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i25;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t14, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i25;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i25;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeInt64Size = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t14, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i25;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i25;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeFloatSize + i25;
                        messageSchema = this;
                        t14 = t7;
                    }
                    messageSchema = this;
                    t14 = t7;
                    iComputeBytesSize = i25;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeFloatSize + i25;
                        messageSchema = this;
                        t14 = t7;
                    }
                    messageSchema = this;
                    t14 = t7;
                    iComputeBytesSize = i25;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeFloatSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeBytesSize = iComputeFloatSize + i25;
                        messageSchema = this;
                        t14 = t7;
                    }
                    messageSchema = this;
                    t14 = t7;
                    iComputeBytesSize = i25;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        Object object = unsafe.getObject(t14, jOffset);
                        iComputeBytesSize = (object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object)) + i25;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i25;
                    break;
                case 9:
                    if (!messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t14, jOffset), messageSchema.getMessageFieldSchema(i16));
                        iComputeBytesSize = i25 + iComputeSizeMessage;
                    }
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeInt64Size = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t14, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i25;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i25;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t14, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i25;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i25;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeInt64Size = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t14, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i25;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i25;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeFloatSize + i25;
                        messageSchema = this;
                        t14 = t7;
                    }
                    messageSchema = this;
                    t14 = t7;
                    iComputeBytesSize = i25;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeFloatSize + i25;
                        messageSchema = this;
                        t14 = t7;
                    }
                    messageSchema = this;
                    t14 = t7;
                    iComputeBytesSize = i25;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t14, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i25;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i25;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t14, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i25;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i25;
                    break;
                case 17:
                    if (!messageSchema.isFieldPresent(t14, i16, i18, i17, i14)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t14, jOffset), messageSchema.getMessageFieldSchema(i16));
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 18:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 19:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 20:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 21:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 22:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 23:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 24:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 25:
                    iComputeSizeMessage = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 26:
                    iComputeSizeMessage = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t14, jOffset));
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 27:
                    iComputeSizeMessage = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t14, jOffset), messageSchema.getMessageFieldSchema(i16));
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 28:
                    iComputeSizeMessage = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t14, jOffset));
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 29:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 30:
                    iComputeSizeMessage = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 31:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 32:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 33:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 34:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t14, jOffset), false);
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t14, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i25;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t14, i24, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i25;
                    }
                    break;
                case 49:
                    iComputeSizeMessage = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t14, jOffset), messageSchema.getMessageFieldSchema(i16));
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 50:
                    iComputeSizeMessage = messageSchema.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t14, jOffset), messageSchema.getMapFieldDefaultEntry(i16));
                    iComputeBytesSize = i25 + iComputeSizeMessage;
                    break;
                case 51:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 52:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 53:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t14, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 54:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t14, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 55:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t14, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 56:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 57:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 58:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 59:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        Object object2 = unsafe.getObject(t14, jOffset);
                        iComputeBytesSize = (object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2)) + i25;
                    }
                    break;
                case 60:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t14, jOffset), messageSchema.getMessageFieldSchema(i16));
                        iComputeBytesSize = i25 + iComputeSizeMessage;
                    }
                    break;
                case 61:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t14, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 62:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t14, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 63:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t14, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 64:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 65:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 66:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t14, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 67:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t14, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                case 68:
                    if (!messageSchema.isOneofPresent(t14, iNumberAt, i16)) {
                        iComputeBytesSize = i25;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t14, jOffset), messageSchema.getMessageFieldSchema(i16));
                        iComputeBytesSize = iComputeDoubleSize + i25;
                    }
                    break;
                default:
                    iComputeBytesSize = i25;
                    break;
            }
            i16 += 3;
            i15 = 1048575;
        }
        int unknownFieldsSerializedSize = iComputeBytesSize + messageSchema.getUnknownFieldsSerializedSize(messageSchema.unknownFieldSchema, t14);
        return messageSchema.hasExtensions ? unknownFieldsSerializedSize + messageSchema.extensionSchema.getExtensions(t14).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
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

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t7) {
        int i14;
        int i15;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        while (i17 < this.checkInitializedCount) {
            int i19 = this.intArray[i17];
            int iNumberAt = numberAt(i19);
            int iTypeAndOffsetAt = typeAndOffsetAt(i19);
            int i24 = this.buffer[i19 + 2];
            int i25 = i24 & 1048575;
            int i26 = 1 << (i24 >>> 20);
            if (i25 != i16) {
                if (i25 != 1048575) {
                    i18 = UNSAFE.getInt(t7, i25);
                }
                i15 = i18;
                i14 = i25;
            } else {
                i14 = i16;
                i15 = i18;
            }
            T t14 = t7;
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t14, i19, i14, i15, i26)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t14, i19, i14, i15, i26) && !isInitialized(t14, iTypeAndOffsetAt, getMessageFieldSchema(i19))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t14, iTypeAndOffsetAt, i19)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t14, iNumberAt, i19) && !isInitialized(t14, iTypeAndOffsetAt, getMessageFieldSchema(i19))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(t14, iTypeAndOffsetAt, i19)) {
                    return false;
                }
            } else if (!isListInitialized(t14, iTypeAndOffsetAt, i19)) {
                return false;
            }
            i17++;
            t7 = t14;
            i16 = i14;
            i18 = i15;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t7).isInitialized();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t7) {
        if (isMutable(t7)) {
            if (t7 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t7;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i14 = 0; i14 < length; i14 += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i14);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    if (iType != 60 && iType != 68) {
                        switch (iType) {
                            case 17:
                                if (isFieldPresent(t7, i14)) {
                                    getMessageFieldSchema(i14).makeImmutable(UNSAFE.getObject(t7, jOffset));
                                }
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
                                this.listFieldSchema.makeImmutableListAt(t7, jOffset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(t7, jOffset);
                                if (object != null) {
                                    unsafe.putObject(t7, jOffset, this.mapFieldSchema.toImmutable(object));
                                }
                                break;
                        }
                    } else if (isOneofPresent(t7, numberAt(i14), i14)) {
                        getMessageFieldSchema(i14).makeImmutable(UNSAFE.getObject(t7, jOffset));
                    }
                } else if (isFieldPresent(t7, i14)) {
                    getMessageFieldSchema(i14).makeImmutable(UNSAFE.getObject(t7, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t7);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t7);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t7, T t14) {
        checkMutable(t7);
        t14.getClass();
        for (int i14 = 0; i14 < this.buffer.length; i14 += 3) {
            mergeSingleField(t7, t14, i14);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t7, t14);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t7, t14);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @com.google.protobuf.CanIgnoreReturnValue
    public int parseMessage(T r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.ArrayDecoders.Registers r32) {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.parseMessage(java.lang.Object, byte[], int, int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t7, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t7, writer);
        } else {
            writeFieldsInAscendingOrder(t7, writer);
        }
    }

    private int positionForFieldNumber(int i14, int i15) {
        if (i14 < this.minFieldNumber || i14 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i14, i15);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t7, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        checkMutable(t7);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t7, reader, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t7, byte[] bArr, int i14, int i15, ArrayDecoders.Registers registers) {
        parseMessage(t7, bArr, i14, i15, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i14, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i14)));
    }

    private boolean isFieldPresent(T t7, int i14, int i15, int i16, int i17) {
        if (i15 == 1048575) {
            return isFieldPresent(t7, i14);
        }
        return (i16 & i17) != 0;
    }

    @Override // com.google.protobuf.Schema
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
