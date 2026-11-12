package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class MessageSchema<T> implements t<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    public static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final e<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final h mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final m newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final w<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.R();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, m mVar, ListFieldSchema listFieldSchema, w<?, ?> wVar, e<?> eVar, h hVar) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z;
        this.hasExtensions = eVar != null && eVar.hasExtensions(messageLite);
        this.useCachedSizeField = z2;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = mVar;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = wVar;
        this.extensionSchema = eVar;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = hVar;
    }

    private boolean arePresentForEquals(T t, T t2, int i) {
        return isFieldPresent(t, i) == isFieldPresent(t2, i);
    }

    private static <T> boolean booleanAt(T t, long j) {
        return UnsafeUtil.u(t, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i2, MapEntryLite.b<K, V> bVar, Map<K, V> map, b.C0256b c0256b) throws IOException {
        int iH;
        int I = b.I(bArr, i, c0256b);
        int i3 = c0256b.a;
        if (i3 < 0 || i3 > i2 - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = I + i3;
        Object obj = bVar.b;
        Object obj2 = bVar.d;
        while (I < i4) {
            int i5 = I + 1;
            int i6 = bArr[I];
            if (i6 < 0) {
                iH = b.H(i6, bArr, i5, c0256b);
                i6 = c0256b.a;
            } else {
                iH = i5;
            }
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i7 != 1) {
                if (i7 == 2 && i8 == bVar.c.getWireType()) {
                    I = decodeMapEntryValue(bArr, iH, i2, bVar.c, bVar.d.getClass(), c0256b);
                    obj2 = c0256b.c;
                } else {
                    I = b.N(i6, bArr, iH, i2, c0256b);
                }
            } else if (i8 == bVar.a.getWireType()) {
                I = decodeMapEntryValue(bArr, iH, i2, bVar.a, null, c0256b);
                obj = c0256b.c;
            } else {
                I = b.N(i6, bArr, iH, i2, c0256b);
            }
        }
        if (I != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i4;
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class<?> cls, b.C0256b c0256b) throws IOException {
        switch (a.a[fieldType.ordinal()]) {
            case 1:
                int iL = b.L(bArr, i, c0256b);
                c0256b.c = Boolean.valueOf(c0256b.b != 0);
                return iL;
            case 2:
                return b.b(bArr, i, c0256b);
            case 3:
                c0256b.c = Double.valueOf(b.d(bArr, i));
                return i + 8;
            case 4:
            case 5:
                c0256b.c = Integer.valueOf(b.h(bArr, i));
                return i + 4;
            case 6:
            case 7:
                c0256b.c = Long.valueOf(b.j(bArr, i));
                return i + 8;
            case 8:
                c0256b.c = Float.valueOf(b.l(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int I = b.I(bArr, i, c0256b);
                c0256b.c = Integer.valueOf(c0256b.a);
                return I;
            case 12:
            case 13:
                int iL2 = b.L(bArr, i, c0256b);
                c0256b.c = Long.valueOf(c0256b.b);
                return iL2;
            case 14:
                return b.p(q.a().i(cls), bArr, i, i2, c0256b);
            case 15:
                int I2 = b.I(bArr, i, c0256b);
                c0256b.c = Integer.valueOf(CodedInputStream.decodeZigZag32(c0256b.a));
                return I2;
            case 16:
                int iL3 = b.L(bArr, i, c0256b);
                c0256b.c = Long.valueOf(CodedInputStream.decodeZigZag64(c0256b.b));
                return iL3;
            case 17:
                return b.F(bArr, i, c0256b);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t, long j) {
        return UnsafeUtil.D(t, j);
    }

    private final <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, w<UT, UB> wVar) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i);
        Object objO = UnsafeUtil.O(obj, offset(typeAndOffsetAt(i)));
        return (objO == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, this.mapFieldSchema.forMutableMapData(objO), enumFieldVerifier, ub, wVar);
    }

    private final <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, w<UT, UB> wVar) {
        MapEntryLite.b<?, ?> bVarForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = wVar.newBuilder();
                }
                ByteString.c cVarNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.a(bVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.e(cVarNewCodedBuilder.b(), bVarForMapMetadata, next.getKey(), next.getValue());
                    wVar.addLengthDelimited(ub, i2, cVarNewCodedBuilder.a());
                    it2.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t, long j) {
        return UnsafeUtil.F(t, j);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private t getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        t tVar = (t) this.objects[i2];
        if (tVar != null) {
            return tVar;
        }
        t<T> tVarI = q.a().i((Class) this.objects[i2 + 1]);
        this.objects[i2] = tVarI;
        return tVarI;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteJ = UnknownFieldSetLite.j();
        generatedMessageLite.unknownFields = unknownFieldSetLiteJ;
        return unknownFieldSetLiteJ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x041e A[PHI: r6
      0x041e: PHI (r6v4 int) = 
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
      (r6v7 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v8 int)
      (r6v1 int)
     binds: [B:20:0x005f, B:223:0x04c5, B:220:0x04ba, B:214:0x049e, B:211:0x048d, B:208:0x047e, B:205:0x0471, B:202:0x0464, B:198:0x0459, B:195:0x0450, B:192:0x0443, B:189:0x0436, B:186:0x0423, B:160:0x0334, B:154:0x0317, B:148:0x02fa, B:142:0x02dd, B:136:0x02bf, B:130:0x02a1, B:124:0x0283, B:118:0x0265, B:112:0x0247, B:106:0x0229, B:100:0x020b, B:94:0x01ed, B:88:0x01cf, B:82:0x01b1, B:77:0x017d, B:74:0x0171, B:71:0x0161, B:68:0x0151, B:65:0x0141, B:62:0x0135, B:59:0x0128, B:56:0x011b, B:50:0x00fd, B:47:0x00e9, B:44:0x00d7, B:41:0x00c7, B:38:0x00b7, B:200:0x0460, B:35:0x00aa, B:32:0x009e, B:29:0x008e, B:26:0x007e, B:183:0x041d, B:23:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    private int getSerializedSizeProto2(T t) {
        int i;
        int i2;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeSFixed32Size;
        int i3;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        int i8 = 0;
        while (i5 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i5);
            int iNumberAt = numberAt(i5);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                i = this.buffer[i5 + 2];
                int i9 = i & i4;
                i2 = 1 << (i >>> 20);
                if (i9 != i7) {
                    i8 = unsafe.getInt(t, i9);
                    i7 = i9;
                }
            } else {
                i = (!this.useCachedSizeField || iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i5 + 2] & i4;
                i2 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i8 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if ((i8 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if ((i8 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t, jOffset));
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if ((i8 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t, jOffset));
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if ((i8 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t, jOffset));
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if ((i8 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if ((i8 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i6 += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if ((i8 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if ((i8 & i2) != 0) {
                        Object object = unsafe.getObject(t, jOffset);
                        iComputeBoolSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 9:
                    if ((i8 & i2) != 0) {
                        iComputeBoolSize = v.p(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if ((i8 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if ((i8 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if ((i8 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if ((i8 & i2) != 0) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i8 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if ((i8 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if ((i8 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if ((i8 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = v.h(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 19:
                    iComputeBoolSize = v.f(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 20:
                    iComputeBoolSize = v.n(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 21:
                    iComputeBoolSize = v.z(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 22:
                    iComputeBoolSize = v.l(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 23:
                    iComputeBoolSize = v.h(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 24:
                    iComputeBoolSize = v.f(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 25:
                    iComputeBoolSize = v.a(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 26:
                    iComputeBoolSize = v.w(iNumberAt, (List) unsafe.getObject(t, jOffset));
                    i6 += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = v.r(iNumberAt, (List) unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                    i6 += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = v.c(iNumberAt, (List) unsafe.getObject(t, jOffset));
                    i6 += iComputeBoolSize;
                    break;
                case 29:
                    iComputeBoolSize = v.x(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 30:
                    iComputeBoolSize = v.d(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 31:
                    iComputeBoolSize = v.f(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 32:
                    iComputeBoolSize = v.h(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 33:
                    iComputeBoolSize = v.s(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 34:
                    iComputeBoolSize = v.u(iNumberAt, (List) unsafe.getObject(t, jOffset), false);
                    i6 += iComputeBoolSize;
                    break;
                case 35:
                    i3 = v.i((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 36:
                    i3 = v.g((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 37:
                    i3 = v.o((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 38:
                    i3 = v.A((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 39:
                    i3 = v.m((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 40:
                    i3 = v.i((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 41:
                    i3 = v.g((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 42:
                    i3 = v.b((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 43:
                    i3 = v.y((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 44:
                    i3 = v.e((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 45:
                    i3 = v.g((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 46:
                    i3 = v.i((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 47:
                    i3 = v.t((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 48:
                    i3 = v.v((List) unsafe.getObject(t, jOffset));
                    if (i3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i, i3);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i3);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + i3;
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 49:
                    iComputeBoolSize = v.k(iNumberAt, (List) unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                    i6 += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t, jOffset), getMapFieldDefaultEntry(i5));
                    i6 += iComputeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeSFixed32Size = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        Object object2 = unsafe.getObject(t, jOffset);
                        iComputeBoolSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = v.p(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i6 += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i6 += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t, jOffset), getMessageFieldSchema(i5));
                        i6 += iComputeBoolSize;
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i4 = 1048575;
        }
        int unknownFieldsSerializedSize = i6 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t).z() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(T t) {
        int iComputeDoubleSize;
        int i;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i2 = 0;
        for (int i3 = 0; i3 < this.buffer.length; i3 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i3);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i3);
            long jOffset = offset(iTypeAndOffsetAt);
            int i4 = (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i3 + 2] & 1048575;
            switch (iType) {
                case 0:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, UnsafeUtil.L(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, UnsafeUtil.L(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, UnsafeUtil.I(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(t, i3)) {
                        Object objO = UnsafeUtil.O(t, jOffset);
                        iComputeDoubleSize = objO instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) objO) : CodedOutputStream.computeStringSize(iNumberAt, (String) objO);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 9:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = v.p(iNumberAt, UnsafeUtil.O(t, jOffset), getMessageFieldSchema(i3));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) UnsafeUtil.O(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, UnsafeUtil.I(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, UnsafeUtil.I(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 14:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, UnsafeUtil.I(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, UnsafeUtil.L(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(t, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) UnsafeUtil.O(t, jOffset), getMessageFieldSchema(i3));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 18:
                    iComputeDoubleSize = v.h(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = v.f(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = v.n(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = v.z(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = v.l(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = v.h(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = v.f(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = v.a(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = v.w(iNumberAt, listAt(t, jOffset));
                    i2 += iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = v.r(iNumberAt, listAt(t, jOffset), getMessageFieldSchema(i3));
                    i2 += iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = v.c(iNumberAt, listAt(t, jOffset));
                    i2 += iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = v.x(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = v.d(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = v.f(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = v.h(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = v.s(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = v.u(iNumberAt, listAt(t, jOffset), false);
                    i2 += iComputeDoubleSize;
                    break;
                case 35:
                    i = v.i((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 36:
                    i = v.g((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 37:
                    i = v.o((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 38:
                    i = v.A((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 39:
                    i = v.m((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 40:
                    i = v.i((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 41:
                    i = v.g((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 42:
                    i = v.b((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 43:
                    i = v.y((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 44:
                    i = v.e((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 45:
                    i = v.g((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 46:
                    i = v.i((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 47:
                    i = v.t((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 48:
                    i = v.v((List) unsafe.getObject(t, jOffset));
                    if (i > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t, i4, i);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(i);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + i;
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 49:
                    iComputeDoubleSize = v.k(iNumberAt, listAt(t, jOffset), getMessageFieldSchema(i3));
                    i2 += iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = this.mapFieldSchema.getSerializedSize(iNumberAt, UnsafeUtil.O(t, jOffset), getMapFieldDefaultEntry(i3));
                    i2 += iComputeDoubleSize;
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        Object objO2 = UnsafeUtil.O(t, jOffset);
                        iComputeDoubleSize = objO2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) objO2) : CodedOutputStream.computeStringSize(iNumberAt, (String) objO2);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = v.p(iNumberAt, UnsafeUtil.O(t, jOffset), getMessageFieldSchema(i3));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) UnsafeUtil.O(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t, jOffset));
                        i2 += iComputeDoubleSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) UnsafeUtil.O(t, jOffset), getMessageFieldSchema(i3));
                        i2 += iComputeDoubleSize;
                    }
                    break;
            }
        }
        return i2 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(w<UT, UB> wVar, T t) {
        return wVar.getSerializedSize(wVar.getFromMessage(t));
    }

    private static <T> int intAt(T t, long j) {
        return UnsafeUtil.I(t, j);
    }

    private static boolean isEnforceUtf8(int i) {
        return (i & 536870912) != 0;
    }

    private boolean isFieldPresent(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return isFieldPresent(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i, int i2) {
        List list = (List) UnsafeUtil.O(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        t messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
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
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.t] */
    private boolean isMapInitialized(T t, int i, int i2) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.O(t, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? I = 0;
        for (Object obj : mapForMapData.values()) {
            if (I == 0) {
                I = I;
                I = q.a().i(obj.getClass());
            }
            I = I;
            if (!I.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t, T t2, int i) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return UnsafeUtil.I(t, jPresenceMaskAndOffsetAt) == UnsafeUtil.I(t2, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t, int i, int i2) {
        return UnsafeUtil.I(t, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private static boolean isRequired(int i) {
        return (i & 268435456) != 0;
    }

    private static List<?> listAt(Object obj, long j) {
        return (List) UnsafeUtil.O(obj, j);
    }

    private static <T> long longAt(T t, long j) {
        return UnsafeUtil.L(t, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(w<UT, UB> wVar, e<ET> eVar, T t, s sVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object objFilterMapUnknownEnumValues = null;
        Object mutableExtensions = null;
        while (true) {
            try {
                int fieldNumber = sVar.getFieldNumber();
                int iPositionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (iPositionForFieldNumber >= 0) {
                    int iTypeAndOffsetAt = typeAndOffsetAt(iPositionForFieldNumber);
                    try {
                        switch (type(iTypeAndOffsetAt)) {
                            case 0:
                                UnsafeUtil.g0(t, offset(iTypeAndOffsetAt), sVar.readDouble());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 1:
                                UnsafeUtil.i0(t, offset(iTypeAndOffsetAt), sVar.readFloat());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 2:
                                UnsafeUtil.o0(t, offset(iTypeAndOffsetAt), sVar.readInt64());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 3:
                                UnsafeUtil.o0(t, offset(iTypeAndOffsetAt), sVar.readUInt64());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 4:
                                UnsafeUtil.l0(t, offset(iTypeAndOffsetAt), sVar.readInt32());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 5:
                                UnsafeUtil.o0(t, offset(iTypeAndOffsetAt), sVar.readFixed64());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 6:
                                UnsafeUtil.l0(t, offset(iTypeAndOffsetAt), sVar.readFixed32());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 7:
                                UnsafeUtil.X(t, offset(iTypeAndOffsetAt), sVar.readBool());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 8:
                                readString(t, iTypeAndOffsetAt, sVar);
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 9:
                                if (isFieldPresent(t, iPositionForFieldNumber)) {
                                    UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Internal.d(UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), sVar.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite)));
                                } else {
                                    UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), sVar.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite));
                                    setFieldPresent(t, iPositionForFieldNumber);
                                }
                                break;
                            case 10:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), sVar.readBytes());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 11:
                                UnsafeUtil.l0(t, offset(iTypeAndOffsetAt), sVar.readUInt32());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 12:
                                int i = sVar.readEnum();
                                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(iPositionForFieldNumber);
                                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i)) {
                                    UnsafeUtil.l0(t, offset(iTypeAndOffsetAt), i);
                                    setFieldPresent(t, iPositionForFieldNumber);
                                } else {
                                    objFilterMapUnknownEnumValues = v.Q(fieldNumber, i, objFilterMapUnknownEnumValues, wVar);
                                }
                                break;
                            case 13:
                                UnsafeUtil.l0(t, offset(iTypeAndOffsetAt), sVar.readSFixed32());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 14:
                                UnsafeUtil.o0(t, offset(iTypeAndOffsetAt), sVar.readSFixed64());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 15:
                                UnsafeUtil.l0(t, offset(iTypeAndOffsetAt), sVar.readSInt32());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 16:
                                UnsafeUtil.o0(t, offset(iTypeAndOffsetAt), sVar.readSInt64());
                                setFieldPresent(t, iPositionForFieldNumber);
                                break;
                            case 17:
                                if (isFieldPresent(t, iPositionForFieldNumber)) {
                                    UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Internal.d(UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), sVar.readGroupBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite)));
                                } else {
                                    UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), sVar.readGroupBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite));
                                    setFieldPresent(t, iPositionForFieldNumber);
                                }
                                break;
                            case 18:
                                sVar.readDoubleList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 19:
                                sVar.readFloatList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 20:
                                sVar.readInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 21:
                                sVar.readUInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 22:
                                sVar.readInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 23:
                                sVar.readFixed64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 24:
                                sVar.readFixed32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 25:
                                sVar.readBoolList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 26:
                                readStringList(t, iTypeAndOffsetAt, sVar);
                                break;
                            case 27:
                                readMessageList(t, iTypeAndOffsetAt, sVar, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                break;
                            case 28:
                                sVar.readBytesList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 29:
                                sVar.readUInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 30:
                                List<Integer> listMutableListAt = this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt));
                                sVar.readEnumList(listMutableListAt);
                                objFilterMapUnknownEnumValues = v.C(fieldNumber, listMutableListAt, getEnumFieldVerifier(iPositionForFieldNumber), objFilterMapUnknownEnumValues, wVar);
                                break;
                            case 31:
                                sVar.readSFixed32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 32:
                                sVar.readSFixed64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 33:
                                sVar.readSInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 34:
                                sVar.readSInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 35:
                                sVar.readDoubleList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 36:
                                sVar.readFloatList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 37:
                                sVar.readInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 38:
                                sVar.readUInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 39:
                                sVar.readInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 40:
                                sVar.readFixed64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 41:
                                sVar.readFixed32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 42:
                                sVar.readBoolList(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 43:
                                sVar.readUInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 44:
                                List<Integer> listMutableListAt2 = this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt));
                                sVar.readEnumList(listMutableListAt2);
                                objFilterMapUnknownEnumValues = v.C(fieldNumber, listMutableListAt2, getEnumFieldVerifier(iPositionForFieldNumber), objFilterMapUnknownEnumValues, wVar);
                                break;
                            case 45:
                                sVar.readSFixed32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 46:
                                sVar.readSFixed64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 47:
                                sVar.readSInt32List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 48:
                                sVar.readSInt64List(this.listFieldSchema.mutableListAt(t, offset(iTypeAndOffsetAt)));
                                break;
                            case 49:
                                readGroupList(t, offset(iTypeAndOffsetAt), sVar, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                break;
                            case 50:
                                mergeMap(t, iPositionForFieldNumber, getMapFieldDefaultEntry(iPositionForFieldNumber), extensionRegistryLite, sVar);
                                break;
                            case 51:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Double.valueOf(sVar.readDouble()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 52:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Float.valueOf(sVar.readFloat()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 53:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Long.valueOf(sVar.readInt64()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 54:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Long.valueOf(sVar.readUInt64()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 55:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Integer.valueOf(sVar.readInt32()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 56:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Long.valueOf(sVar.readFixed64()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 57:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Integer.valueOf(sVar.readFixed32()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 58:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Boolean.valueOf(sVar.readBool()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 59:
                                readString(t, iTypeAndOffsetAt, sVar);
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 60:
                                if (isOneofPresent(t, fieldNumber, iPositionForFieldNumber)) {
                                    UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Internal.d(UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), sVar.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite)));
                                } else {
                                    UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), sVar.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite));
                                    setFieldPresent(t, iPositionForFieldNumber);
                                }
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 61:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), sVar.readBytes());
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 62:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Integer.valueOf(sVar.readUInt32()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 63:
                                int i2 = sVar.readEnum();
                                Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(iPositionForFieldNumber);
                                if (enumFieldVerifier2 == null || enumFieldVerifier2.isInRange(i2)) {
                                    UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Integer.valueOf(i2));
                                    setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                } else {
                                    objFilterMapUnknownEnumValues = v.Q(fieldNumber, i2, objFilterMapUnknownEnumValues, wVar);
                                }
                                break;
                            case 64:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Integer.valueOf(sVar.readSFixed32()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 65:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Long.valueOf(sVar.readSFixed64()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 66:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Integer.valueOf(sVar.readSInt32()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 67:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), Long.valueOf(sVar.readSInt64()));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 68:
                                UnsafeUtil.q0(t, offset(iTypeAndOffsetAt), sVar.readGroupBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite));
                                setOneofPresent(t, fieldNumber, iPositionForFieldNumber);
                                break;
                            default:
                                if (objFilterMapUnknownEnumValues == null) {
                                    objFilterMapUnknownEnumValues = wVar.newBuilder();
                                }
                                if (!wVar.mergeOneFieldFrom(objFilterMapUnknownEnumValues, sVar)) {
                                    for (int i3 = this.checkInitializedCount; i3 < this.repeatedFieldOffsetStart; i3++) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t, this.intArray[i3], objFilterMapUnknownEnumValues, wVar);
                                    }
                                    if (objFilterMapUnknownEnumValues != null) {
                                        wVar.setBuilderToMessage(t, objFilterMapUnknownEnumValues);
                                        return;
                                    }
                                    return;
                                }
                                break;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!wVar.shouldDiscardUnknownFields(sVar)) {
                            if (objFilterMapUnknownEnumValues == null) {
                                objFilterMapUnknownEnumValues = wVar.getBuilderFromMessage(t);
                            }
                            if (!wVar.mergeOneFieldFrom(objFilterMapUnknownEnumValues, sVar)) {
                                for (int i4 = this.checkInitializedCount; i4 < this.repeatedFieldOffsetStart; i4++) {
                                    objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t, this.intArray[i4], objFilterMapUnknownEnumValues, wVar);
                                }
                                if (objFilterMapUnknownEnumValues != null) {
                                    wVar.setBuilderToMessage(t, objFilterMapUnknownEnumValues);
                                    return;
                                }
                                return;
                            }
                        } else if (!sVar.skipField()) {
                            for (int i5 = this.checkInitializedCount; i5 < this.repeatedFieldOffsetStart; i5++) {
                                objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t, this.intArray[i5], objFilterMapUnknownEnumValues, wVar);
                            }
                            if (objFilterMapUnknownEnumValues != null) {
                                wVar.setBuilderToMessage(t, objFilterMapUnknownEnumValues);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        for (int i6 = this.checkInitializedCount; i6 < this.repeatedFieldOffsetStart; i6++) {
                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t, this.intArray[i6], objFilterMapUnknownEnumValues, wVar);
                        }
                        if (objFilterMapUnknownEnumValues != null) {
                            wVar.setBuilderToMessage(t, objFilterMapUnknownEnumValues);
                            return;
                        }
                        return;
                    }
                    Object objFindExtensionByNumber = !this.hasExtensions ? null : eVar.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, fieldNumber);
                    if (objFindExtensionByNumber != null) {
                        if (mutableExtensions == null) {
                            mutableExtensions = eVar.getMutableExtensions(t);
                        }
                        objFilterMapUnknownEnumValues = eVar.parseExtension(sVar, objFindExtensionByNumber, extensionRegistryLite, mutableExtensions, objFilterMapUnknownEnumValues, wVar);
                    } else if (!wVar.shouldDiscardUnknownFields(sVar)) {
                        if (objFilterMapUnknownEnumValues == null) {
                            objFilterMapUnknownEnumValues = wVar.getBuilderFromMessage(t);
                        }
                        if (wVar.mergeOneFieldFrom(objFilterMapUnknownEnumValues, sVar)) {
                        }
                    } else if (sVar.skipField()) {
                    }
                }
            } catch (Throwable th) {
                for (int i7 = this.checkInitializedCount; i7 < this.repeatedFieldOffsetStart; i7++) {
                    objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t, this.intArray[i7], objFilterMapUnknownEnumValues, wVar);
                }
                if (objFilterMapUnknownEnumValues != null) {
                    wVar.setBuilderToMessage(t, objFilterMapUnknownEnumValues);
                }
                throw th;
            }
        }
        for (int i8 = this.checkInitializedCount; i8 < this.repeatedFieldOffsetStart; i8++) {
            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t, this.intArray[i8], objFilterMapUnknownEnumValues, wVar);
        }
        if (objFilterMapUnknownEnumValues != null) {
            wVar.setBuilderToMessage(t, objFilterMapUnknownEnumValues);
        }
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, s sVar) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i));
        Object objO = UnsafeUtil.O(obj, jOffset);
        if (objO == null) {
            objO = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.q0(obj, jOffset, objO);
        } else if (this.mapFieldSchema.isImmutable(objO)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, objO);
            UnsafeUtil.q0(obj, jOffset, objNewMapField);
            objO = objNewMapField;
        }
        sVar.readMap(this.mapFieldSchema.forMutableMapData(objO), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private void mergeMessage(T t, T t2, int i) {
        long jOffset = offset(typeAndOffsetAt(i));
        if (isFieldPresent(t2, i)) {
            Object objO = UnsafeUtil.O(t, jOffset);
            Object objO2 = UnsafeUtil.O(t2, jOffset);
            if (objO != null && objO2 != null) {
                UnsafeUtil.q0(t, jOffset, Internal.d(objO, objO2));
                setFieldPresent(t, i);
            } else if (objO2 != null) {
                UnsafeUtil.q0(t, jOffset, objO2);
                setFieldPresent(t, i);
            }
        }
    }

    private void mergeOneofMessage(T t, T t2, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        int iNumberAt = numberAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        if (isOneofPresent(t2, iNumberAt, i)) {
            Object objO = isOneofPresent(t, iNumberAt, i) ? UnsafeUtil.O(t, jOffset) : null;
            Object objO2 = UnsafeUtil.O(t2, jOffset);
            if (objO != null && objO2 != null) {
                UnsafeUtil.q0(t, jOffset, Internal.d(objO, objO2));
                setOneofPresent(t, iNumberAt, i);
            } else if (objO2 != null) {
                UnsafeUtil.q0(t, jOffset, objO2);
                setOneofPresent(t, iNumberAt, i);
            }
        }
    }

    private void mergeSingleField(T t, T t2, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.g0(t, jOffset, UnsafeUtil.D(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 1:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.i0(t, jOffset, UnsafeUtil.F(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 2:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.o0(t, jOffset, UnsafeUtil.L(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 3:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.o0(t, jOffset, UnsafeUtil.L(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 4:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.l0(t, jOffset, UnsafeUtil.I(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 5:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.o0(t, jOffset, UnsafeUtil.L(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 6:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.l0(t, jOffset, UnsafeUtil.I(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 7:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.X(t, jOffset, UnsafeUtil.u(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 8:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.q0(t, jOffset, UnsafeUtil.O(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 9:
                mergeMessage(t, t2, i);
                break;
            case 10:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.q0(t, jOffset, UnsafeUtil.O(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 11:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.l0(t, jOffset, UnsafeUtil.I(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 12:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.l0(t, jOffset, UnsafeUtil.I(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 13:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.l0(t, jOffset, UnsafeUtil.I(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 14:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.o0(t, jOffset, UnsafeUtil.L(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 15:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.l0(t, jOffset, UnsafeUtil.I(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 16:
                if (isFieldPresent(t2, i)) {
                    UnsafeUtil.o0(t, jOffset, UnsafeUtil.L(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 17:
                mergeMessage(t, t2, i);
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
                this.listFieldSchema.mergeListsAt(t, t2, jOffset);
                break;
            case 50:
                v.I(this.mapFieldSchema, t, t2, jOffset);
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
                if (isOneofPresent(t2, iNumberAt, i)) {
                    UnsafeUtil.q0(t, jOffset, UnsafeUtil.O(t2, jOffset));
                    setOneofPresent(t, iNumberAt, i);
                }
                break;
            case 60:
                mergeOneofMessage(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t2, iNumberAt, i)) {
                    UnsafeUtil.q0(t, jOffset, UnsafeUtil.O(t2, jOffset));
                    setOneofPresent(t, iNumberAt, i);
                }
                break;
            case 68:
                mergeOneofMessage(t, t2, i);
                break;
        }
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, j jVar, m mVar, ListFieldSchema listFieldSchema, w<?, ?> wVar, e<?> eVar, h hVar) {
        return jVar instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) jVar, mVar, listFieldSchema, wVar, eVar, hVar) : newSchemaForMessageInfo((StructuralMessageInfo) jVar, mVar, listFieldSchema, wVar, eVar, hVar);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, m mVar, ListFieldSchema listFieldSchema, w<?, ?> wVar, e<?> eVar, h hVar) {
        int iO;
        int iO2;
        boolean z = structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            iO = 0;
            iO2 = 0;
        } else {
            iO = fields[0].o();
            iO2 = fields[fields.length - 1].o();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i = 0;
        int i2 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.w() == FieldType.MAP) {
                i++;
            } else if (fieldInfo.w().id() >= 18 && fieldInfo.w().id() <= 49) {
                i2++;
            }
        }
        int[] iArr2 = i > 0 ? new int[i] : null;
        int[] iArr3 = i2 > 0 ? new int[i2] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < fields.length) {
            FieldInfo fieldInfo2 = fields[i3];
            int iO3 = fieldInfo2.o();
            storeFieldData(fieldInfo2, iArr, i4, objArr);
            if (i5 < checkInitialized.length && checkInitialized[i5] == iO3) {
                checkInitialized[i5] = i4;
                i5++;
            }
            if (fieldInfo2.w() == FieldType.MAP) {
                iArr2[i6] = i4;
                i6++;
            } else {
                if (fieldInfo2.w().id() >= 18 && fieldInfo2.w().id() <= 49) {
                    iArr3[i7] = (int) UnsafeUtil.W(fieldInfo2.n());
                    i7++;
                }
                i3++;
                i4 += 3;
            }
            i3++;
            i4 += 3;
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
        return new MessageSchema<>(iArr, objArr, iO, iO2, structuralMessageInfo.getDefaultInstance(), z, true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, mVar, listFieldSchema, wVar, eVar, hVar);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x024d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0250  */
    /* JADX WARN: Code duplicated, block: B:126:0x0268  */
    /* JADX WARN: Code duplicated, block: B:127:0x026b  */
    /* JADX WARN: Code duplicated, block: B:161:0x031a  */
    /* JADX WARN: Code duplicated, block: B:162:0x031c  */
    /* JADX WARN: Code duplicated, block: B:164:0x031f  */
    /* JADX WARN: Code duplicated, block: B:179:0x036e  */
    /* JADX WARN: Code duplicated, block: B:182:0x037c  */
    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, m mVar, ListFieldSchema listFieldSchema, w<?, ?> wVar, e<?> eVar, h hVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        int i7;
        char cCharAt4;
        int i8;
        char cCharAt5;
        int i9;
        char cCharAt6;
        int i10;
        char cCharAt7;
        int i11;
        char cCharAt8;
        int i12;
        int i13;
        int i14;
        int i15;
        int iObjectFieldOffset;
        boolean z;
        int iObjectFieldOffset2;
        int i16;
        int i17;
        java.lang.reflect.Field fieldReflectField;
        char cCharAt9;
        int i18;
        int i19;
        int i20;
        Object obj;
        java.lang.reflect.Field fieldReflectField2;
        int i21;
        Object obj2;
        java.lang.reflect.Field fieldReflectField3;
        int i22;
        char cCharAt10;
        int i23;
        char cCharAt11;
        int i24;
        char cCharAt12;
        int i25;
        char cCharAt13;
        boolean z2 = rawMessageInfo.getSyntax() == ProtoSyntax.PROTO3;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i26 = 1;
            while (true) {
                i = i26 + 1;
                if (stringInfo.charAt(i26) < 55296) {
                    break;
                }
                i26 = i;
            }
        } else {
            i = 1;
        }
        int i27 = i + 1;
        int iCharAt6 = stringInfo.charAt(i);
        if (iCharAt6 >= 55296) {
            int i28 = iCharAt6 & 8191;
            int i29 = 13;
            while (true) {
                i25 = i27 + 1;
                cCharAt13 = stringInfo.charAt(i27);
                if (cCharAt13 < 55296) {
                    break;
                }
                i28 |= (cCharAt13 & 8191) << i29;
                i29 += 13;
                i27 = i25;
            }
            iCharAt6 = i28 | (cCharAt13 << i29);
            i27 = i25;
        }
        if (iCharAt6 == 0) {
            iArr = EMPTY_INT_ARRAY;
            i3 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            iCharAt5 = 0;
            i2 = 0;
        } else {
            int i30 = i27 + 1;
            int iCharAt7 = stringInfo.charAt(i27);
            if (iCharAt7 >= 55296) {
                int i31 = iCharAt7 & 8191;
                int i32 = 13;
                while (true) {
                    i11 = i30 + 1;
                    cCharAt8 = stringInfo.charAt(i30);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i31 |= (cCharAt8 & 8191) << i32;
                    i32 += 13;
                    i30 = i11;
                }
                iCharAt7 = i31 | (cCharAt8 << i32);
                i30 = i11;
            }
            int i33 = i30 + 1;
            int iCharAt8 = stringInfo.charAt(i30);
            if (iCharAt8 >= 55296) {
                int i34 = iCharAt8 & 8191;
                int i35 = 13;
                while (true) {
                    i10 = i33 + 1;
                    cCharAt7 = stringInfo.charAt(i33);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt7 & 8191) << i35;
                    i35 += 13;
                    i33 = i10;
                }
                iCharAt8 = i34 | (cCharAt7 << i35);
                i33 = i10;
            }
            int i36 = i33 + 1;
            iCharAt = stringInfo.charAt(i33);
            if (iCharAt >= 55296) {
                int i37 = iCharAt & 8191;
                int i38 = 13;
                while (true) {
                    i9 = i36 + 1;
                    cCharAt6 = stringInfo.charAt(i36);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt6 & 8191) << i38;
                    i38 += 13;
                    i36 = i9;
                }
                iCharAt = i37 | (cCharAt6 << i38);
                i36 = i9;
            }
            int i39 = i36 + 1;
            iCharAt2 = stringInfo.charAt(i36);
            if (iCharAt2 >= 55296) {
                int i40 = iCharAt2 & 8191;
                int i41 = 13;
                while (true) {
                    i8 = i39 + 1;
                    cCharAt5 = stringInfo.charAt(i39);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt5 & 8191) << i41;
                    i41 += 13;
                    i39 = i8;
                }
                iCharAt2 = i40 | (cCharAt5 << i41);
                i39 = i8;
            }
            int i42 = i39 + 1;
            iCharAt3 = stringInfo.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i7 = i42 + 1;
                    cCharAt4 = stringInfo.charAt(i42);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt4 & 8191) << i44;
                    i44 += 13;
                    i42 = i7;
                }
                iCharAt3 = i43 | (cCharAt4 << i44);
                i42 = i7;
            }
            int i45 = i42 + 1;
            iCharAt4 = stringInfo.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i6 = i45 + 1;
                    cCharAt3 = stringInfo.charAt(i45);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt3 & 8191) << i47;
                    i47 += 13;
                    i45 = i6;
                }
                iCharAt4 = i46 | (cCharAt3 << i47);
                i45 = i6;
            }
            int i48 = i45 + 1;
            int iCharAt9 = stringInfo.charAt(i45);
            if (iCharAt9 >= 55296) {
                int i49 = iCharAt9 & 8191;
                int i50 = 13;
                while (true) {
                    i5 = i48 + 1;
                    cCharAt2 = stringInfo.charAt(i48);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt2 & 8191) << i50;
                    i50 += 13;
                    i48 = i5;
                }
                iCharAt9 = i49 | (cCharAt2 << i50);
                i48 = i5;
            }
            int i51 = i48 + 1;
            iCharAt5 = stringInfo.charAt(i48);
            if (iCharAt5 >= 55296) {
                int i52 = iCharAt5 & 8191;
                int i53 = 13;
                while (true) {
                    i4 = i51 + 1;
                    cCharAt = stringInfo.charAt(i51);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i52 |= (cCharAt & 8191) << i53;
                    i53 += 13;
                    i51 = i4;
                }
                iCharAt5 = i52 | (cCharAt << i53);
                i51 = i4;
            }
            iArr = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i2 = (iCharAt7 * 2) + iCharAt8;
            i3 = iCharAt7;
            i27 = i51;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 * 2];
        int i54 = iCharAt5 + iCharAt4;
        int i55 = iCharAt5;
        int i56 = i54;
        int i57 = 0;
        int i58 = 0;
        while (i27 < length) {
            int i59 = i27 + 1;
            int iCharAt10 = stringInfo.charAt(i27);
            if (iCharAt10 >= c) {
                int i60 = iCharAt10 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i24 = i61 + 1;
                    cCharAt12 = stringInfo.charAt(i61);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i60 |= (cCharAt12 & 8191) << i62;
                    i62 += 13;
                    i61 = i24;
                }
                iCharAt10 = i60 | (cCharAt12 << i62);
                i12 = i24;
            } else {
                i12 = i59;
            }
            int i63 = i12 + 1;
            int iCharAt11 = stringInfo.charAt(i12);
            if (iCharAt11 >= c) {
                int i64 = iCharAt11 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i23 = i65 + 1;
                    cCharAt11 = stringInfo.charAt(i65);
                    i13 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt11 & 8191) << i66;
                    i66 += 13;
                    i65 = i23;
                    length = i13;
                }
                iCharAt11 = i64 | (cCharAt11 << i66);
                i14 = i23;
            } else {
                i13 = length;
                i14 = i63;
            }
            int i67 = iCharAt11 & 255;
            int i68 = iCharAt5;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i57] = i58;
                i57++;
            }
            int i69 = i57;
            if (i67 >= 51) {
                int i70 = i14 + 1;
                int iCharAt12 = stringInfo.charAt(i14);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i71 = iCharAt12 & 8191;
                    int i72 = 13;
                    while (true) {
                        i22 = i70 + 1;
                        cCharAt10 = stringInfo.charAt(i70);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i71 |= (cCharAt10 & 8191) << i72;
                        i72 += 13;
                        i70 = i22;
                        c2 = 55296;
                    }
                    iCharAt12 = i71 | (cCharAt10 << i72);
                    i70 = i22;
                }
                int i73 = i67 - 51;
                int i74 = i70;
                if (i73 == 9 || i73 == 17) {
                    i19 = i2 + 1;
                    objArr[((i58 / 3) * 2) + 1] = objects[i2];
                } else {
                    if (i73 == 12 && !z2) {
                        i19 = i2 + 1;
                        objArr[((i58 / 3) * 2) + 1] = objects[i2];
                    }
                    i20 = iCharAt12 * 2;
                    obj = objects[i20];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldReflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldReflectField2 = reflectField(cls, (String) obj);
                        objects[i20] = fieldReflectField2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                    i21 = i20 + 1;
                    obj2 = objects[i21];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldReflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldReflectField3 = reflectField(cls, (String) obj2);
                        objects[i21] = fieldReflectField3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                    stringInfo = stringInfo;
                    z2 = z2;
                    objArr = objArr;
                    i16 = i74;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i17 = 0;
                }
                i2 = i19;
                i20 = iCharAt12 * 2;
                obj = objects[i20];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i20] = fieldReflectField2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                i21 = i20 + 1;
                obj2 = objects[i21];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i21] = fieldReflectField3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                stringInfo = stringInfo;
                z2 = z2;
                objArr = objArr;
                i16 = i74;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                iObjectFieldOffset = iObjectFieldOffset5;
                i17 = 0;
            } else {
                int i75 = i2 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i2]);
                if (i67 == 9 || i67 == 17) {
                    objArr[((i58 / 3) * 2) + 1] = fieldReflectField4.getType();
                } else {
                    if (i67 == 27 || i67 == 49) {
                        i18 = i75 + 1;
                        objArr[((i58 / 3) * 2) + 1] = objects[i75];
                    } else if (i67 == 12 || i67 == 30 || i67 == 44) {
                        if (!z2) {
                            i18 = i75 + 1;
                            objArr[((i58 / 3) * 2) + 1] = objects[i75];
                        }
                    } else if (i67 == 50) {
                        int i76 = i55 + 1;
                        iArr[i55] = i58;
                        int i77 = (i58 / 3) * 2;
                        int i78 = i75 + 1;
                        objArr[i77] = objects[i75];
                        if ((iCharAt11 & 2048) != 0) {
                            i75 = i78 + 1;
                            objArr[i77 + 1] = objects[i78];
                            i55 = i76;
                        } else {
                            i55 = i76;
                            i15 = i78;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        int i79 = i15;
                        if ((iCharAt11 & 4096) == 4096) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z || i67 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i16 = i14;
                            i17 = 0;
                        } else {
                            int i80 = i14 + 1;
                            int iCharAt13 = stringInfo.charAt(i14);
                            if (iCharAt13 >= 55296) {
                                int i81 = iCharAt13 & 8191;
                                int i82 = 13;
                                while (true) {
                                    i16 = i80 + 1;
                                    cCharAt9 = stringInfo.charAt(i80);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i81 |= (cCharAt9 & 8191) << i82;
                                    i82 += 13;
                                    i80 = i16;
                                }
                                iCharAt13 = i81 | (cCharAt9 << i82);
                            } else {
                                i16 = i80;
                            }
                            int i83 = (i3 * 2) + (iCharAt13 / 32);
                            Object obj3 = objects[i83];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldReflectField = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldReflectField = reflectField(cls, (String) obj3);
                                objects[i83] = fieldReflectField;
                            }
                            i17 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                        }
                        if (i67 >= 18 && i67 <= 49) {
                            iArr[i56] = iObjectFieldOffset;
                            i56++;
                        }
                        i2 = i79;
                    }
                    i15 = i18;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    int i710 = i15;
                    if ((iCharAt11 & 4096) == 4096) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        iObjectFieldOffset2 = 1048575;
                        i16 = i14;
                        i17 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i16 = i14;
                        i17 = 0;
                    }
                    if (i67 >= 18) {
                        iArr[i56] = iObjectFieldOffset;
                        i56++;
                    }
                    i2 = i710;
                }
                i15 = i75;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                int i711 = i15;
                if ((iCharAt11 & 4096) == 4096) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    iObjectFieldOffset2 = 1048575;
                    i16 = i14;
                    i17 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i16 = i14;
                    i17 = 0;
                }
                if (i67 >= 18) {
                    iArr[i56] = iObjectFieldOffset;
                    i56++;
                }
                i2 = i711;
            }
            int i84 = i58 + 1;
            iArr2[i58] = iCharAt10;
            int i85 = i84 + 1;
            iArr2[i84] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i67 << 20) | iObjectFieldOffset;
            i58 = i85 + 1;
            iArr2[i85] = (i17 << 20) | iObjectFieldOffset2;
            z2 = z2;
            objArr = objArr;
            iCharAt = iCharAt;
            iCharAt5 = i68;
            length = i13;
            i27 = i16;
            i57 = i69;
            stringInfo = stringInfo;
            iCharAt2 = iCharAt2;
            c = 55296;
        }
        return new MessageSchema<>(iArr2, objArr, iCharAt, iCharAt2, rawMessageInfo.getDefaultInstance(), z2, false, iArr, iCharAt5, i54, mVar, listFieldSchema, wVar, eVar, hVar);
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((Boolean) UnsafeUtil.O(t, j)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((Double) UnsafeUtil.O(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((Float) UnsafeUtil.O(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((Integer) UnsafeUtil.O(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((Long) UnsafeUtil.O(t, j)).longValue();
    }

    private <K, V> int parseMapField(T t, byte[] bArr, int i, int i2, int i3, long j, b.C0256b c0256b) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i3);
        Object object = unsafe.getObject(t, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t, j, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i, i2, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), c0256b);
    }

    private int parseOneofField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, b.C0256b c0256b) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(b.d(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(b.l(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iL = b.L(bArr, i, c0256b);
                unsafe.putObject(t, j, Long.valueOf(c0256b.b));
                unsafe.putInt(t, j2, i4);
                return iL;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int I = b.I(bArr, i, c0256b);
                unsafe.putObject(t, j, Integer.valueOf(c0256b.a));
                unsafe.putInt(t, j2, i4);
                return I;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(b.j(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(b.h(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iL2 = b.L(bArr, i, c0256b);
                unsafe.putObject(t, j, Boolean.valueOf(c0256b.b != 0));
                unsafe.putInt(t, j2, i4);
                return iL2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int I2 = b.I(bArr, i, c0256b);
                int i13 = c0256b.a;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !Utf8.u(bArr, I2, I2 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t, j, new String(bArr, I2, i13, Internal.a));
                    I2 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return I2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iP = b.p(getMessageFieldSchema(i8), bArr, i, i2, c0256b);
                Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, c0256b.c);
                } else {
                    unsafe.putObject(t, j, Internal.d(object, c0256b.c));
                }
                unsafe.putInt(t, j2, i4);
                return iP;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iB = b.b(bArr, i, c0256b);
                unsafe.putObject(t, j, c0256b.c);
                unsafe.putInt(t, j2, i4);
                return iB;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int I3 = b.I(bArr, i, c0256b);
                int i14 = c0256b.a;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i8);
                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i14)) {
                    unsafe.putObject(t, j, Integer.valueOf(i14));
                    unsafe.putInt(t, j2, i4);
                } else {
                    getMutableUnknownFields(t).m(i3, Long.valueOf(i14));
                }
                return I3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int I4 = b.I(bArr, i, c0256b);
                unsafe.putObject(t, j, Integer.valueOf(CodedInputStream.decodeZigZag32(c0256b.a)));
                unsafe.putInt(t, j2, i4);
                return I4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iL3 = b.L(bArr, i, c0256b);
                unsafe.putObject(t, j, Long.valueOf(CodedInputStream.decodeZigZag64(c0256b.b)));
                unsafe.putInt(t, j2, i4);
                return iL3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                int iN = b.n(getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, c0256b);
                Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object2 == null) {
                    unsafe.putObject(t, j, c0256b.c);
                } else {
                    unsafe.putObject(t, j, Internal.d(object2, c0256b.c));
                }
                unsafe.putInt(t, j2, i4);
                return iN;
            default:
                return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0298 A[PHI: r0 r20 r24 r25 r28
      0x0298: PHI (r0v19 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:115:0x0300, B:110:0x02dd, B:103:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r20v4 int) = (r20v2 int), (r20v2 int), (r20v5 int) binds: [B:115:0x0300, B:110:0x02dd, B:103:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r24v3 int) = (r24v1 int), (r24v1 int), (r24v4 int) binds: [B:115:0x0300, B:110:0x02dd, B:103:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r25v2 int) = (r25v0 int), (r25v0 int), (r25v3 int) binds: [B:115:0x0300, B:110:0x02dd, B:103:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r28v6 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:115:0x0300, B:110:0x02dd, B:103:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0303 A[PHI: r0 r20 r24 r25 r28
      0x0303: PHI (r0v18 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:115:0x0300, B:110:0x02dd, B:103:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r20v3 int) = (r20v2 int), (r20v2 int), (r20v5 int) binds: [B:115:0x0300, B:110:0x02dd, B:103:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r24v2 int) = (r24v1 int), (r24v1 int), (r24v4 int) binds: [B:115:0x0300, B:110:0x02dd, B:103:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r25v1 int) = (r25v0 int), (r25v0 int), (r25v3 int) binds: [B:115:0x0300, B:110:0x02dd, B:103:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x0303: PHI (r28v5 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:115:0x0300, B:110:0x02dd, B:103:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0092. Please report as an issue. */
    private int parseProto3Message(T t, byte[] bArr, int i, int i2, b.C0256b c0256b) throws IOException {
        int i3;
        int iH;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        Unsafe unsafe2;
        int i8;
        int i9;
        int i10;
        int iL;
        int i11;
        Unsafe unsafe3;
        this = this;
        t = t;
        bArr = bArr;
        i2 = i2;
        c0256b = c0256b;
        Unsafe unsafe4 = UNSAFE;
        int i12 = -1;
        int iG = i;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (iG < i2) {
            int i17 = iG + 1;
            byte b = bArr[iG];
            if (b < 0) {
                iH = b.H(b, bArr, i17, c0256b);
                i3 = c0256b.a;
            } else {
                i3 = b;
                iH = i17;
            }
            int i18 = i3 >>> 3;
            int i19 = i3 & 7;
            int iPositionForFieldNumber = i18 > i13 ? this.positionForFieldNumber(i18, i14 / 3) : this.positionForFieldNumber(i18);
            if (iPositionForFieldNumber == i12) {
                i4 = iH;
                i5 = i18;
                unsafe = unsafe4;
                i6 = 0;
            } else {
                int i20 = this.buffer[iPositionForFieldNumber + 1];
                int iType = type(i20);
                Unsafe unsafe5 = unsafe4;
                long jOffset = offset(i20);
                if (iType <= 17) {
                    int i21 = this.buffer[iPositionForFieldNumber + 2];
                    int i22 = 1 << (i21 >>> 20);
                    int i23 = i21 & 1048575;
                    if (i23 != i16) {
                        if (i16 != 1048575) {
                            long j = i16;
                            unsafe3 = unsafe5;
                            unsafe3.putInt(t, j, i15);
                        } else {
                            unsafe3 = unsafe5;
                        }
                        if (i23 != 1048575) {
                            i15 = unsafe3.getInt(t, i23);
                        }
                        unsafe2 = unsafe3;
                        i16 = i23;
                    } else {
                        unsafe2 = unsafe5;
                    }
                    switch (iType) {
                        case 0:
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 1) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                UnsafeUtil.g0(t, jOffset, b.d(bArr, iH));
                                iG = iH + 8;
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 1:
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 5) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                UnsafeUtil.i0(t, jOffset, b.l(bArr, iH));
                                iG = iH + 4;
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 2:
                        case 3:
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iL = b.L(bArr, iH, c0256b);
                                unsafe2.putLong(t, jOffset, c0256b.b);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                iG = iL;
                                i13 = i5;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 4:
                        case 11:
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iG = b.I(bArr, iH, c0256b);
                                unsafe2.putInt(t, jOffset, c0256b.a);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 5:
                        case 14:
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 1) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                unsafe2.putLong(t, jOffset, b.j(bArr, iH));
                                iG = iH + 8;
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 6:
                        case 13:
                            i11 = i2;
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 5) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                unsafe2.putInt(t, jOffset, b.h(bArr, iH));
                                iG = iH + 4;
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i13 = i5;
                                i12 = -1;
                                int i24 = i7;
                                i2 = i11;
                                i14 = i24;
                            }
                            break;
                        case 7:
                            i11 = i2;
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iG = b.L(bArr, iH, c0256b);
                                UnsafeUtil.X(t, jOffset, c0256b.b != 0);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i13 = i5;
                                i12 = -1;
                                int i25 = i7;
                                i2 = i11;
                                i14 = i25;
                            }
                            break;
                        case 8:
                            i11 = i2;
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 2) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iG = (i20 & 536870912) == 0 ? b.C(bArr, iH, c0256b) : b.F(bArr, iH, c0256b);
                                unsafe2.putObject(t, jOffset, c0256b.c);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i13 = i5;
                                i12 = -1;
                                int i26 = i7;
                                i2 = i11;
                                i14 = i26;
                            }
                            break;
                        case 9:
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 2) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                i11 = i2;
                                iG = b.p(this.getMessageFieldSchema(i7), bArr, iH, i11, c0256b);
                                Object object = unsafe2.getObject(t, jOffset);
                                if (object == null) {
                                    unsafe2.putObject(t, jOffset, c0256b.c);
                                } else {
                                    unsafe2.putObject(t, jOffset, Internal.d(object, c0256b.c));
                                }
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i13 = i5;
                                i12 = -1;
                                int i27 = i7;
                                i2 = i11;
                                i14 = i27;
                            }
                            break;
                        case 10:
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 2) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iG = b.b(bArr, iH, c0256b);
                                unsafe2.putObject(t, jOffset, c0256b.c);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 12:
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iG = b.I(bArr, iH, c0256b);
                                unsafe2.putInt(t, jOffset, c0256b.a);
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 15:
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iG = b.I(bArr, iH, c0256b);
                                unsafe2.putInt(t, jOffset, CodedInputStream.decodeZigZag32(c0256b.a));
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                i13 = i5;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 16:
                            if (i19 != 0) {
                                i7 = iPositionForFieldNumber;
                                i5 = i18;
                                i4 = iH;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iL = b.L(bArr, iH, c0256b);
                                i7 = iPositionForFieldNumber;
                                i5 = i18;
                                unsafe2.putLong(t, jOffset, CodedInputStream.decodeZigZag64(c0256b.b));
                                i15 |= i22;
                                unsafe4 = unsafe2;
                                i14 = i7;
                                iG = iL;
                                i13 = i5;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        default:
                            i7 = iPositionForFieldNumber;
                            i5 = i18;
                            i4 = iH;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                    }
                } else {
                    i5 = i18;
                    i7 = iPositionForFieldNumber;
                    unsafe2 = unsafe5;
                    if (iType != 27) {
                        if (iType <= 49) {
                            int i28 = iH;
                            i9 = i15;
                            i10 = i16;
                            unsafe = unsafe2;
                            i6 = i7;
                            iG = parseRepeatedField(t, bArr, iH, i2, i3, i5, i19, i7, i20, iType, jOffset, c0256b);
                            if (iG != i28) {
                                i13 = i5;
                                i14 = i6;
                                i15 = i9;
                                i16 = i10;
                            } else {
                                i4 = iG;
                                i15 = i9;
                                i16 = i10;
                            }
                        } else {
                            i8 = iH;
                            i9 = i15;
                            i10 = i16;
                            unsafe = unsafe2;
                            i6 = i7;
                            if (iType == 50) {
                                if (i19 == 2) {
                                    iG = parseMapField(t, bArr, i8, i2, i6, jOffset, c0256b);
                                    if (iG != i8) {
                                        i13 = i5;
                                        i14 = i6;
                                        i15 = i9;
                                        i16 = i10;
                                    } else {
                                        i4 = iG;
                                    }
                                }
                                i15 = i9;
                                i16 = i10;
                            } else {
                                iG = parseOneofField(t, bArr, i8, i2, i3, i5, i19, i20, iType, jOffset, i6, c0256b);
                                if (iG != i8) {
                                    i13 = i5;
                                    i14 = i6;
                                    i15 = i9;
                                    i16 = i10;
                                } else {
                                    i4 = iG;
                                    i15 = i9;
                                    i16 = i10;
                                }
                            }
                        }
                        unsafe4 = unsafe;
                        i12 = -1;
                    } else if (i19 == 2) {
                        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(t, jOffset);
                        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                            int size = protobufListMutableCopyWithCapacity2.size();
                            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(t, jOffset, protobufListMutableCopyWithCapacity2);
                        }
                        iG = b.q(this.getMessageFieldSchema(i7), i3, bArr, iH, i2, protobufListMutableCopyWithCapacity2, c0256b);
                        i15 = i15;
                        unsafe4 = unsafe2;
                        i14 = i7;
                        i13 = i5;
                        i12 = -1;
                        i2 = i2;
                    } else {
                        i8 = iH;
                        i9 = i15;
                        i10 = i16;
                        unsafe = unsafe2;
                        i6 = i7;
                    }
                    i4 = i8;
                    i15 = i9;
                    i16 = i10;
                }
            }
            iG = b.G(i3, bArr, i4, i2, getMutableUnknownFields(t), c0256b);
            i13 = i5;
            i14 = i6;
            unsafe4 = unsafe;
            i12 = -1;
        }
        int i29 = i15;
        Unsafe unsafe6 = unsafe4;
        if (i16 != 1048575) {
            unsafe6.putInt(t, i16, i29);
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int parseRepeatedField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, b.C0256b c0256b) throws IOException {
        int iJ;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t, j2);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, protobufListMutableCopyWithCapacity2);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return b.s(bArr, i, protobufListMutableCopyWithCapacity2, c0256b);
                }
                return i5 == 1 ? b.e(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return b.v(bArr, i, protobufListMutableCopyWithCapacity2, c0256b);
                }
                return i5 == 5 ? b.m(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return b.z(bArr, i, protobufListMutableCopyWithCapacity2, c0256b);
                }
                return i5 == 0 ? b.M(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return b.y(bArr, i, protobufListMutableCopyWithCapacity2, c0256b);
                }
                return i5 == 0 ? b.J(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return b.u(bArr, i, protobufListMutableCopyWithCapacity2, c0256b);
                }
                return i5 == 1 ? b.k(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return b.t(bArr, i, protobufListMutableCopyWithCapacity2, c0256b);
                }
                return i5 == 5 ? b.i(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return b.r(bArr, i, protobufListMutableCopyWithCapacity2, c0256b);
                }
                return i5 == 0 ? b.a(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? b.D(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : b.E(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b);
                }
                return i;
            case 27:
                return i5 == 2 ? b.q(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            case 28:
                return i5 == 2 ? b.c(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            case 30:
            case 44:
                if (i5 == 2) {
                    iJ = b.y(bArr, i, protobufListMutableCopyWithCapacity2, c0256b);
                } else {
                    if (i5 != 0) {
                        return i;
                    }
                    iJ = b.J(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLite = null;
                }
                UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) v.C(i4, protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(i6), unknownFieldSetLite, this.unknownFieldSchema);
                if (unknownFieldSetLite2 != null) {
                    generatedMessageLite.unknownFields = unknownFieldSetLite2;
                }
                return iJ;
            case 33:
            case 47:
                if (i5 == 2) {
                    return b.w(bArr, i, protobufListMutableCopyWithCapacity2, c0256b);
                }
                return i5 == 0 ? b.A(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return b.x(bArr, i, protobufListMutableCopyWithCapacity2, c0256b);
                }
                return i5 == 0 ? b.B(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            case 49:
                return i5 == 3 ? b.o(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, c0256b) : i;
            default:
                return i;
        }
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj, long j, s sVar, t<E> tVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        sVar.readGroupList(this.listFieldSchema.mutableListAt(obj, j), tVar, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i, s sVar, t<E> tVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        sVar.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), tVar, extensionRegistryLite);
    }

    private void readString(Object obj, int i, s sVar) throws IOException {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.q0(obj, offset(i), sVar.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.q0(obj, offset(i), sVar.readString());
        } else {
            UnsafeUtil.q0(obj, offset(i), sVar.readBytes());
        }
    }

    private void readStringList(Object obj, int i, s sVar) throws IOException {
        if (isEnforceUtf8(i)) {
            sVar.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            sVar.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
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
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.l0(t, j, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.I(t, j));
    }

    private void setOneofPresent(T t, int i, int i2) {
        UnsafeUtil.l0(t, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iNumberAt = numberAt(i4);
            if (i == iNumberAt) {
                return i4;
            }
            if (i < iNumberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i, Object[] objArr) {
        int iW;
        int iId;
        long jW;
        int iW2;
        int iNumberOfTrailingZeros;
        int i2;
        Class<?> clsR;
        int i3;
        o oVarS = fieldInfo.s();
        if (oVarS == null) {
            FieldType fieldTypeW = fieldInfo.w();
            iW = (int) UnsafeUtil.W(fieldInfo.n());
            iId = fieldTypeW.id();
            if (fieldTypeW.isList() || fieldTypeW.isMap()) {
                if (fieldInfo.l() == null) {
                    iW2 = 0;
                } else {
                    jW = UnsafeUtil.W(fieldInfo.l());
                }
                iNumberOfTrailingZeros = 0;
            } else {
                java.lang.reflect.Field fieldU = fieldInfo.u();
                iW2 = fieldU == null ? 1048575 : (int) UnsafeUtil.W(fieldU);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.v());
            }
            iArr[i] = fieldInfo.o();
            int i4 = i + 1;
            if (fieldInfo.x()) {
                i2 = 536870912;
            } else {
                i2 = 0;
            }
            iArr[i4] = (fieldInfo.z() ? 268435456 : 0) | i2 | (iId << 20) | iW;
            iArr[i + 2] = iW2 | (iNumberOfTrailingZeros << 20);
            clsR = fieldInfo.r();
            if (fieldInfo.q() != null) {
                if (clsR != null) {
                    objArr[((i / 3) * 2) + 1] = clsR;
                    return;
                } else {
                    if (fieldInfo.m() != null) {
                        objArr[((i / 3) * 2) + 1] = fieldInfo.m();
                        return;
                    }
                    return;
                }
            }
            i3 = (i / 3) * 2;
            objArr[i3] = fieldInfo.q();
            if (clsR != null) {
                objArr[i3 + 1] = clsR;
            } else if (fieldInfo.m() != null) {
                objArr[i3 + 1] = fieldInfo.m();
            }
        }
        iId = fieldInfo.w().id() + 51;
        iW = (int) UnsafeUtil.W(oVarS.c());
        jW = UnsafeUtil.W(oVarS.a());
        iW2 = (int) jW;
        iNumberOfTrailingZeros = 0;
        iArr[i] = fieldInfo.o();
        int i5 = i + 1;
        if (fieldInfo.x()) {
            i2 = 536870912;
        } else {
            i2 = 0;
        }
        iArr[i5] = (fieldInfo.z() ? 268435456 : 0) | i2 | (iId << 20) | iW;
        iArr[i + 2] = iW2 | (iNumberOfTrailingZeros << 20);
        clsR = fieldInfo.r();
        if (fieldInfo.q() != null) {
            if (clsR != null) {
                objArr[((i / 3) * 2) + 1] = clsR;
                return;
            } else {
                if (fieldInfo.m() != null) {
                    objArr[((i / 3) * 2) + 1] = fieldInfo.m();
                    return;
                }
                return;
            }
        }
        i3 = (i / 3) * 2;
        objArr[i3] = fieldInfo.q();
        if (clsR != null) {
            objArr[i3 + 1] = clsR;
        } else if (fieldInfo.m() != null) {
            objArr[i3 + 1] = fieldInfo.m();
        }
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInAscendingOrderProto2(T t, Writer writer) throws IOException {
        Iterator itH;
        Map.Entry<?, ?> entry;
        int i;
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t);
            if (extensions.C()) {
                itH = null;
                entry = null;
            } else {
                itH = extensions.H();
                entry = (Map.Entry) itH.next();
            }
        } else {
            itH = null;
            entry = null;
        }
        int length = this.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i3);
            int iNumberAt = numberAt(i3);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i6 = this.buffer[i3 + 2];
                int i7 = i6 & i2;
                if (i7 != i4) {
                    i5 = unsafe.getInt(t, i7);
                    i4 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            while (entry != null && this.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itH.hasNext() ? (Map.Entry) itH.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i & i5) != 0) {
                        writer.writeDouble(iNumberAt, doubleAt(t, jOffset));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i & i5) != 0) {
                        writer.writeFloat(iNumberAt, floatAt(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i & i5) != 0) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i & i5) != 0) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i & i5) != 0) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i & i5) != 0) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i & i5) != 0) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i & i5) != 0) {
                        writer.writeBool(iNumberAt, booleanAt(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i & i5) != 0) {
                        writeString(iNumberAt, unsafe.getObject(t, jOffset), writer);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i & i5) != 0) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i & i5) != 0) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i & i5) != 0) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i & i5) != 0) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i & i5) != 0) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i & i5) != 0) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i & i5) != 0) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i & i5) != 0) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    v.Y(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    v.g0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    v.m0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    v.F0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    v.k0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    v.e0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    v.c0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    v.U(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    v.B0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer);
                    break;
                case 27:
                    v.q0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, getMessageFieldSchema(i3));
                    break;
                case 28:
                    v.W(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer);
                    break;
                case 29:
                    v.D0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    v.a0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    v.s0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    v.u0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    v.w0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    v.y0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    v.Y(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 36:
                    v.g0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 37:
                    v.m0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 38:
                    v.F0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 39:
                    v.k0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 40:
                    v.e0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 41:
                    v.c0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 42:
                    v.U(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 43:
                    v.D0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 44:
                    v.a0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 45:
                    v.s0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 46:
                    v.u0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 47:
                    v.w0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 48:
                    v.y0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, true);
                    break;
                case 49:
                    v.i0(numberAt(i3), (List) unsafe.getObject(t, jOffset), writer, getMessageFieldSchema(i3));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, unsafe.getObject(t, jOffset), i3);
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t, jOffset));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t, jOffset));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t, jOffset));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writeString(iNumberAt, unsafe.getObject(t, jOffset), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i3));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t, jOffset));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t, jOffset), getMessageFieldSchema(i3));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itH.hasNext() ? (Map.Entry) itH.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void writeFieldsInAscendingOrderProto3(T t, Writer writer) throws IOException {
        Iterator itH;
        Map.Entry<?, ?> entry;
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t);
            if (extensions.C()) {
                itH = null;
                entry = null;
            } else {
                itH = extensions.H();
                entry = (Map.Entry) itH.next();
            }
        } else {
            itH = null;
            entry = null;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i);
            int iNumberAt = numberAt(i);
            while (entry != null && this.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itH.hasNext() ? (Map.Entry) itH.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t, i)) {
                        writer.writeDouble(iNumberAt, doubleAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t, i)) {
                        writer.writeFloat(iNumberAt, floatAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t, i)) {
                        writer.writeInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t, i)) {
                        writer.writeUInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t, i)) {
                        writer.writeInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t, i)) {
                        writer.writeFixed64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t, i)) {
                        writer.writeFixed32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t, i)) {
                        writer.writeBool(iNumberAt, booleanAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t, i)) {
                        writeString(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t, i)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t, i)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t, i)) {
                        writer.writeUInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t, i)) {
                        writer.writeEnum(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t, i)) {
                        writer.writeSFixed32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t, i)) {
                        writer.writeSFixed64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t, i)) {
                        writer.writeSInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t, i)) {
                        writer.writeSInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t, i)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
                case 18:
                    v.Y(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    v.g0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    v.m0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    v.F0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    v.k0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    v.e0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    v.c0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    v.U(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    v.B0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    v.q0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(i));
                    break;
                case 28:
                    v.W(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    v.D0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    v.a0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    v.s0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    v.u0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    v.w0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    v.y0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    v.Y(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    v.g0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    v.m0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    v.F0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    v.k0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    v.e0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    v.c0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    v.U(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    v.D0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    v.a0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    v.s0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    v.u0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    v.w0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    v.y0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    v.i0(numberAt(i), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(i));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), i);
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writeString(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itH.hasNext() ? (Map.Entry) itH.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInDescendingOrder(T t, Writer writer) throws IOException {
        Iterator itR;
        Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t);
            if (extensions.C()) {
                itR = null;
                entry = null;
            } else {
                itR = extensions.r();
                entry = (Map.Entry) itR.next();
            }
        } else {
            itR = null;
            entry = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t, length)) {
                        writer.writeDouble(iNumberAt, doubleAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t, length)) {
                        writer.writeFloat(iNumberAt, floatAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t, length)) {
                        writer.writeInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t, length)) {
                        writer.writeUInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t, length)) {
                        writer.writeInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t, length)) {
                        writer.writeFixed64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t, length)) {
                        writer.writeFixed32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t, length)) {
                        writer.writeBool(iNumberAt, booleanAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t, length)) {
                        writeString(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t, length)) {
                        writer.writeUInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t, length)) {
                        writer.writeEnum(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t, length)) {
                        writer.writeSFixed32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t, length)) {
                        writer.writeSFixed64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t, length)) {
                        writer.writeSInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t, length)) {
                        writer.writeSInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    v.Y(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    v.g0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    v.m0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    v.F0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    v.k0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    v.e0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    v.c0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    v.U(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    v.B0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    v.q0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    v.W(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    v.D0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    v.a0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    v.s0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    v.u0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    v.w0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    v.y0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    v.Y(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    v.g0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    v.m0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    v.F0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    v.k0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    v.e0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    v.c0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    v.U(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    v.D0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    v.a0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    v.s0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    v.u0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    v.w0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    v.y0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    v.i0(numberAt(length), (List) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writeString(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.O(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.O(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
        }
    }

    private <K, V> void writeMapHelper(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i, (String) obj);
        } else {
            writer.writeBytes(i, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(w<UT, UB> wVar, T t, Writer writer) throws IOException {
        wVar.writeTo(wVar.getFromMessage(t), writer);
    }

    @Override // com.google.protobuf.t
    public boolean equals(T t, T t2) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t, t2, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t).equals(this.unknownFieldSchema.getFromMessage(t2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t).equals(this.extensionSchema.getExtensions(t2));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // com.google.protobuf.t
    public int getSerializedSize(T t) {
        return this.proto3 ? getSerializedSizeProto3(t) : getSerializedSizeProto2(t);
    }

    @Override // com.google.protobuf.t
    public int hashCode(T t) {
        int i;
        int iHashLong;
        int length = this.buffer.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i3);
            int iNumberAt = numberAt(i3);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.D(t, jOffset)));
                    i2 = i + iHashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.F(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.L(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.L(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.I(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.L(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.I(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.u(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    iHashLong = ((String) UnsafeUtil.O(t, jOffset)).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 9:
                    Object objO = UnsafeUtil.O(t, jOffset);
                    if (objO != null) {
                        iHashCode = objO.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.O(t, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.I(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.I(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.I(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.L(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.I(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.L(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 17:
                    Object objO2 = UnsafeUtil.O(t, jOffset);
                    if (objO2 != null) {
                        iHashCode = objO2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.O(t, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    iHashLong = UnsafeUtil.O(t, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t, jOffset)));
                        i2 = i + iHashLong;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = ((String) UnsafeUtil.O(t, jOffset)).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = UnsafeUtil.O(t, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = UnsafeUtil.O(t, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = UnsafeUtil.O(t, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.unknownFieldSchema.getFromMessage(t).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac A[SYNTHETIC] */
    @Override // com.google.protobuf.t
    public final boolean isInitialized(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.checkInitializedCount) {
            int i6 = this.intArray[i5];
            int iNumberAt = numberAt(i6);
            int iTypeAndOffsetAt = typeAndOffsetAt(i6);
            int i7 = this.buffer[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = UNSAFE.getInt(t, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t, i6, i, i2, i9)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t, i6, i, i2, i9) && !isInitialized(t, iTypeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t, iTypeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t, iNumberAt, i6) && !isInitialized(t, iTypeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(t, iTypeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (!isListInitialized(t, iTypeAndOffsetAt, i6)) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t).E();
    }

    @Override // com.google.protobuf.t
    public void makeImmutable(T t) {
        int i;
        int i2 = this.checkInitializedCount;
        while (true) {
            i = this.repeatedFieldOffsetStart;
            if (i2 >= i) {
                break;
            }
            long jOffset = offset(typeAndOffsetAt(this.intArray[i2]));
            Object objO = UnsafeUtil.O(t, jOffset);
            if (objO != null) {
                UnsafeUtil.q0(t, jOffset, this.mapFieldSchema.toImmutable(objO));
            }
            i2++;
        }
        int length = this.intArray.length;
        while (i < length) {
            this.listFieldSchema.makeImmutableListAt(t, this.intArray[i]);
            i++;
        }
        this.unknownFieldSchema.makeImmutable(t);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(t);
        }
    }

    @Override // com.google.protobuf.t
    public void mergeFrom(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t, t2, i);
        }
        v.J(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            v.H(this.extensionSchema, t, t2);
        }
    }

    @Override // com.google.protobuf.t
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x008c. Please report as an issue. */
    public int parseProto2Message(T t, byte[] bArr, int i, int i2, int i3, b.C0256b c0256b) throws IOException {
        Unsafe unsafe;
        MessageSchema<T> messageSchema;
        int i4;
        T t2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        T t3;
        T t4;
        int i14;
        T t5;
        int i15;
        int i16;
        MessageSchema<T> messageSchema2 = this;
        T t6 = t;
        byte[] bArr2 = bArr;
        i2 = i2;
        int i17 = i3;
        b.C0256b c0256b2 = c0256b;
        Unsafe unsafe2 = UNSAFE;
        int iG = i;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1048575;
        while (true) {
            if (iG < i2) {
                int i23 = iG + 1;
                byte b = bArr2[iG];
                if (b < 0) {
                    int iH = b.H(b, bArr2, i23, c0256b2);
                    i5 = c0256b2.a;
                    i23 = iH;
                } else {
                    i5 = b;
                }
                int i24 = i5 >>> 3;
                int i25 = i5 & 7;
                int iPositionForFieldNumber = i24 > i18 ? messageSchema2.positionForFieldNumber(i24, i19 / 3) : messageSchema2.positionForFieldNumber(i24);
                if (iPositionForFieldNumber == -1) {
                    i6 = i24;
                    i7 = i23;
                    i8 = i5;
                    i9 = i21;
                    i10 = i22;
                    unsafe = unsafe2;
                    i3 = i17;
                    i11 = 0;
                } else {
                    int i26 = messageSchema2.buffer[iPositionForFieldNumber + 1];
                    int iType = type(i26);
                    long jOffset = offset(i26);
                    int i27 = i5;
                    if (iType <= 17) {
                        int i28 = messageSchema2.buffer[iPositionForFieldNumber + 2];
                        int i29 = 1 << (i28 >>> 20);
                        int i30 = i28 & 1048575;
                        if (i30 != i22) {
                            if (i22 != 1048575) {
                                unsafe2.putInt(t6, i22, i21);
                            }
                            i21 = unsafe2.getInt(t6, i30);
                            i10 = i30;
                        } else {
                            i10 = i22;
                        }
                        int i31 = i21;
                        switch (iType) {
                            case 0:
                                t3 = t6;
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i25 == 1) {
                                    UnsafeUtil.g0(t3, jOffset, b.d(bArr2, i23));
                                    iG = i23 + 8;
                                    i21 = i31 | i29;
                                    t6 = t3;
                                    i19 = i12;
                                    i20 = i13;
                                    i18 = i6;
                                    i22 = i10;
                                    i17 = i3;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 1:
                                t3 = t6;
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i25 == 5) {
                                    UnsafeUtil.i0(t3, jOffset, b.l(bArr2, i23));
                                    iG = i23 + 4;
                                    i21 = i31 | i29;
                                    t6 = t3;
                                    i19 = i12;
                                    i20 = i13;
                                    i18 = i6;
                                    i22 = i10;
                                    i17 = i3;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 2:
                            case 3:
                                T t7 = t6;
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i25 == 0) {
                                    int iL = b.L(bArr2, i23, c0256b2);
                                    t4 = t7;
                                    unsafe2.putLong(t, jOffset, c0256b2.b);
                                    i21 = i31 | i29;
                                    iG = iL;
                                    i19 = i12;
                                    i20 = i13;
                                    t6 = t4;
                                    i18 = i6;
                                    i22 = i10;
                                    i2 = i2;
                                    i17 = i3;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 4:
                            case 11:
                                t3 = t6;
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i25 == 0) {
                                    iG = b.I(bArr2, i23, c0256b2);
                                    unsafe2.putInt(t3, jOffset, c0256b2.a);
                                    i21 = i31 | i29;
                                    t6 = t3;
                                    i19 = i12;
                                    i20 = i13;
                                    i18 = i6;
                                    i22 = i10;
                                    i17 = i3;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 5:
                            case 14:
                                T t8 = t6;
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i25 == 1) {
                                    t4 = t8;
                                    unsafe2.putLong(t, jOffset, b.j(bArr2, i23));
                                    iG = i23 + 8;
                                    i21 = i31 | i29;
                                    i19 = i12;
                                    i20 = i13;
                                    t6 = t4;
                                    i18 = i6;
                                    i22 = i10;
                                    i2 = i2;
                                    i17 = i3;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 6:
                            case 13:
                                i14 = i2;
                                t5 = t6;
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i25 == 5) {
                                    unsafe2.putInt(t5, jOffset, b.h(bArr2, i23));
                                    iG = i23 + 4;
                                    int i32 = i31 | i29;
                                    t6 = t5;
                                    i2 = i14;
                                    i19 = i12;
                                    i20 = i13;
                                    i22 = i10;
                                    i17 = i3;
                                    i21 = i32;
                                    i18 = i6;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 7:
                                i14 = i2;
                                t5 = t6;
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i25 == 0) {
                                    iG = b.L(bArr2, i23, c0256b2);
                                    UnsafeUtil.X(t5, jOffset, c0256b2.b != 0);
                                    int i33 = i31 | i29;
                                    t6 = t5;
                                    i2 = i14;
                                    i19 = i12;
                                    i20 = i13;
                                    i22 = i10;
                                    i17 = i3;
                                    i21 = i33;
                                    i18 = i6;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 8:
                                i14 = i2;
                                t5 = t6;
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i25 == 2) {
                                    iG = (i26 & 536870912) == 0 ? b.C(bArr2, i23, c0256b2) : b.F(bArr2, i23, c0256b2);
                                    unsafe2.putObject(t5, jOffset, c0256b2.c);
                                    int i34 = i31 | i29;
                                    t6 = t5;
                                    i2 = i14;
                                    i19 = i12;
                                    i20 = i13;
                                    i22 = i10;
                                    i17 = i3;
                                    i21 = i34;
                                    i18 = i6;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 9:
                                t5 = t6;
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i25 == 2) {
                                    i14 = i2;
                                    iG = b.p(messageSchema2.getMessageFieldSchema(i12), bArr2, i23, i14, c0256b2);
                                    if ((i31 & i29) == 0) {
                                        unsafe2.putObject(t5, jOffset, c0256b2.c);
                                    } else {
                                        unsafe2.putObject(t5, jOffset, Internal.d(unsafe2.getObject(t5, jOffset), c0256b2.c));
                                    }
                                    int i35 = i31 | i29;
                                    t6 = t5;
                                    i2 = i14;
                                    i19 = i12;
                                    i20 = i13;
                                    i22 = i10;
                                    i17 = i3;
                                    i21 = i35;
                                    i18 = i6;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 10:
                                t3 = t6;
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i25 == 2) {
                                    iG = b.b(bArr2, i23, c0256b2);
                                    unsafe2.putObject(t3, jOffset, c0256b2.c);
                                    i21 = i31 | i29;
                                    t6 = t3;
                                    i19 = i12;
                                    i20 = i13;
                                    i18 = i6;
                                    i22 = i10;
                                    i17 = i3;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 12:
                                t3 = t6;
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i25 == 0) {
                                    iG = b.I(bArr2, i23, c0256b2);
                                    int i36 = c0256b2.a;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i12);
                                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i36)) {
                                        unsafe2.putInt(t3, jOffset, i36);
                                        i21 = i31 | i29;
                                        t6 = t3;
                                    } else {
                                        getMutableUnknownFields(t).m(i13, Long.valueOf(i36));
                                        t6 = t3;
                                        i21 = i31;
                                    }
                                    i19 = i12;
                                    i20 = i13;
                                    i18 = i6;
                                    i22 = i10;
                                    i17 = i3;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 15:
                                i12 = iPositionForFieldNumber;
                                i13 = i27;
                                bArr2 = bArr;
                                i6 = i24;
                                if (i25 == 0) {
                                    iG = b.I(bArr2, i23, c0256b2);
                                    t3 = t;
                                    unsafe2.putInt(t3, jOffset, CodedInputStream.decodeZigZag32(c0256b2.a));
                                    i21 = i31 | i29;
                                    t6 = t3;
                                    i19 = i12;
                                    i20 = i13;
                                    i18 = i6;
                                    i22 = i10;
                                    i17 = i3;
                                } else {
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 16:
                                i12 = iPositionForFieldNumber;
                                i6 = i24;
                                if (i25 == 0) {
                                    bArr2 = bArr;
                                    int iL2 = b.L(bArr2, i23, c0256b2);
                                    i13 = i27;
                                    unsafe2.putLong(t, jOffset, CodedInputStream.decodeZigZag64(c0256b2.b));
                                    i21 = i31 | i29;
                                    t6 = t;
                                    iG = iL2;
                                    i19 = i12;
                                    i20 = i13;
                                    i18 = i6;
                                    i22 = i10;
                                    i17 = i3;
                                } else {
                                    i13 = i27;
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            case 17:
                                if (i25 == 3) {
                                    iG = b.n(messageSchema2.getMessageFieldSchema(iPositionForFieldNumber), bArr, i23, i2, (i24 << 3) | 4, c0256b);
                                    if ((i31 & i29) == 0) {
                                        unsafe2.putObject(t6, jOffset, c0256b2.c);
                                    } else {
                                        unsafe2.putObject(t6, jOffset, Internal.d(unsafe2.getObject(t6, jOffset), c0256b2.c));
                                    }
                                    i21 = i31 | i29;
                                    bArr2 = bArr;
                                    i2 = i2;
                                    i17 = i3;
                                    i20 = i27;
                                    i19 = iPositionForFieldNumber;
                                    i18 = i24;
                                    i22 = i10;
                                } else {
                                    i12 = iPositionForFieldNumber;
                                    i6 = i24;
                                    i13 = i27;
                                    i7 = i23;
                                    i9 = i31;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    i3 = i3;
                                }
                                break;
                            default:
                                i12 = iPositionForFieldNumber;
                                i13 = i27;
                                i6 = i24;
                                i7 = i23;
                                i9 = i31;
                                i11 = i12;
                                unsafe = unsafe2;
                                i8 = i13;
                                i3 = i3;
                                break;
                        }
                    } else {
                        i6 = i24;
                        T t9 = t6;
                        bArr2 = bArr;
                        if (iType != 27) {
                            i11 = iPositionForFieldNumber;
                            i9 = i21;
                            i10 = i22;
                            if (iType <= 49) {
                                int i37 = i23;
                                unsafe = unsafe2;
                                iG = parseRepeatedField(t, bArr, i23, i2, i27, i6, i25, i11, i26, iType, jOffset, c0256b);
                                if (iG != i37) {
                                    i16 = i27;
                                    messageSchema2 = this;
                                    t6 = t;
                                    bArr2 = bArr;
                                    i2 = i2;
                                    i17 = i3;
                                    c0256b2 = c0256b;
                                    i18 = i6;
                                    i20 = i16;
                                    i19 = i11;
                                    i21 = i9;
                                    i22 = i10;
                                    unsafe2 = unsafe;
                                } else {
                                    i16 = i27;
                                    i7 = iG;
                                    i8 = i16;
                                }
                            } else {
                                i15 = i23;
                                unsafe = unsafe2;
                                if (iType != 50) {
                                    iG = parseOneofField(t, bArr, i15, i2, i16, i6, i25, i26, iType, jOffset, i11, c0256b);
                                    if (iG != i15) {
                                        i16 = i27;
                                        messageSchema2 = this;
                                        t6 = t;
                                        bArr2 = bArr;
                                        i2 = i2;
                                        i17 = i3;
                                        c0256b2 = c0256b;
                                        i18 = i6;
                                        i20 = i16;
                                        i19 = i11;
                                        i21 = i9;
                                        i22 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i16 = i27;
                                        i7 = iG;
                                        i8 = i16;
                                    }
                                } else if (i25 == 2) {
                                    iG = parseMapField(t, bArr, i15, i2, i11, jOffset, c0256b);
                                    if (iG != i15) {
                                        i16 = i27;
                                        messageSchema2 = this;
                                        t6 = t;
                                        bArr2 = bArr;
                                        i2 = i2;
                                        i17 = i3;
                                        c0256b2 = c0256b;
                                        i18 = i6;
                                        i20 = i16;
                                        i19 = i11;
                                        i21 = i9;
                                        i22 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i16 = i27;
                                        i7 = iG;
                                        i8 = i16;
                                    }
                                } else {
                                    i16 = i27;
                                }
                            }
                        } else if (i25 == 2) {
                            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(t9, jOffset);
                            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                int size = protobufListMutableCopyWithCapacity2.size();
                                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t9, jOffset, protobufListMutableCopyWithCapacity2);
                            }
                            i10 = i22;
                            iG = b.q(messageSchema2.getMessageFieldSchema(iPositionForFieldNumber), i27, bArr, i23, i2, protobufListMutableCopyWithCapacity2, c0256b);
                            t6 = t;
                            i2 = i2;
                            i20 = i27;
                            i18 = i6;
                            i19 = iPositionForFieldNumber;
                            i21 = i21;
                            i22 = i10;
                            i17 = i3;
                        } else {
                            i11 = iPositionForFieldNumber;
                            i9 = i21;
                            i10 = i22;
                            i15 = i23;
                            unsafe = unsafe2;
                            i16 = i27;
                        }
                        i7 = i15;
                        i8 = i16;
                    }
                }
                if (i8 != i3 || i3 == 0) {
                    iG = (!this.hasExtensions || c0256b.d == ExtensionRegistryLite.getEmptyRegistry()) ? b.G(i8, bArr, i7, i2, getMutableUnknownFields(t), c0256b) : b.g(i8, bArr, i7, i2, t, this.defaultInstance, this.unknownFieldSchema, c0256b);
                    t6 = t;
                    bArr2 = bArr;
                    i2 = i2;
                    i20 = i8;
                    messageSchema2 = this;
                    c0256b2 = c0256b;
                    i18 = i6;
                    i19 = i11;
                    i21 = i9;
                    i22 = i10;
                    unsafe2 = unsafe;
                    i17 = i3;
                } else {
                    i4 = 1048575;
                    messageSchema = this;
                    iG = i7;
                    i20 = i8;
                    i21 = i9;
                    i22 = i10;
                }
            } else {
                unsafe = unsafe2;
                i3 = i17;
                messageSchema = messageSchema2;
                i4 = 1048575;
            }
        }
        if (i22 != i4) {
            t2 = t;
            unsafe.putInt(t2, i22, i21);
        } else {
            t2 = t;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i38 = messageSchema.checkInitializedCount; i38 < messageSchema.repeatedFieldOffsetStart; i38++) {
            unknownFieldSetLite = (UnknownFieldSetLite) messageSchema.filterMapUnknownEnumValues(t2, messageSchema.intArray[i38], unknownFieldSetLite, messageSchema.unknownFieldSchema);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t2, unknownFieldSetLite);
        }
        if (i3 == 0) {
            if (iG != i2) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (iG > i2 || i20 != i3) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return iG;
    }

    @Override // com.google.protobuf.t
    public void writeTo(T t, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t, writer);
        }
    }

    private boolean isFieldPresent(T t, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (UnsafeUtil.I(t, j) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return UnsafeUtil.D(t, jOffset) != 0.0d;
            case 1:
                return UnsafeUtil.F(t, jOffset) != 0.0f;
            case 2:
                return UnsafeUtil.L(t, jOffset) != 0;
            case 3:
                return UnsafeUtil.L(t, jOffset) != 0;
            case 4:
                return UnsafeUtil.I(t, jOffset) != 0;
            case 5:
                return UnsafeUtil.L(t, jOffset) != 0;
            case 6:
                return UnsafeUtil.I(t, jOffset) != 0;
            case 7:
                return UnsafeUtil.u(t, jOffset);
            case 8:
                Object objO = UnsafeUtil.O(t, jOffset);
                if (objO instanceof String) {
                    return !((String) objO).isEmpty();
                }
                if (objO instanceof ByteString) {
                    return !ByteString.EMPTY.equals(objO);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.O(t, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.O(t, jOffset));
            case 11:
                return UnsafeUtil.I(t, jOffset) != 0;
            case 12:
                return UnsafeUtil.I(t, jOffset) != 0;
            case 13:
                return UnsafeUtil.I(t, jOffset) != 0;
            case 14:
                return UnsafeUtil.L(t, jOffset) != 0;
            case 15:
                return UnsafeUtil.I(t, jOffset) != 0;
            case 16:
                return UnsafeUtil.L(t, jOffset) != 0;
            case 17:
                return UnsafeUtil.O(t, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i, int i2) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i2);
    }

    @Override // com.google.protobuf.t
    public void mergeFrom(T t, s sVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Objects.requireNonNull(extensionRegistryLite);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, sVar, extensionRegistryLite);
    }

    @Override // com.google.protobuf.t
    public void mergeFrom(T t, byte[] bArr, int i, int i2, b.C0256b c0256b) throws IOException {
        if (this.proto3) {
            parseProto3Message(t, bArr, i, i2, c0256b);
        } else {
            parseProto2Message(t, bArr, i, i2, 0, c0256b);
        }
    }

    private boolean equals(T t, T t2, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t, t2, i) && Double.doubleToLongBits(UnsafeUtil.D(t, jOffset)) == Double.doubleToLongBits(UnsafeUtil.D(t2, jOffset));
            case 1:
                return arePresentForEquals(t, t2, i) && Float.floatToIntBits(UnsafeUtil.F(t, jOffset)) == Float.floatToIntBits(UnsafeUtil.F(t2, jOffset));
            case 2:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.L(t, jOffset) == UnsafeUtil.L(t2, jOffset);
            case 3:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.L(t, jOffset) == UnsafeUtil.L(t2, jOffset);
            case 4:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.I(t, jOffset) == UnsafeUtil.I(t2, jOffset);
            case 5:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.L(t, jOffset) == UnsafeUtil.L(t2, jOffset);
            case 6:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.I(t, jOffset) == UnsafeUtil.I(t2, jOffset);
            case 7:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.u(t, jOffset) == UnsafeUtil.u(t2, jOffset);
            case 8:
                return arePresentForEquals(t, t2, i) && v.N(UnsafeUtil.O(t, jOffset), UnsafeUtil.O(t2, jOffset));
            case 9:
                return arePresentForEquals(t, t2, i) && v.N(UnsafeUtil.O(t, jOffset), UnsafeUtil.O(t2, jOffset));
            case 10:
                return arePresentForEquals(t, t2, i) && v.N(UnsafeUtil.O(t, jOffset), UnsafeUtil.O(t2, jOffset));
            case 11:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.I(t, jOffset) == UnsafeUtil.I(t2, jOffset);
            case 12:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.I(t, jOffset) == UnsafeUtil.I(t2, jOffset);
            case 13:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.I(t, jOffset) == UnsafeUtil.I(t2, jOffset);
            case 14:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.L(t, jOffset) == UnsafeUtil.L(t2, jOffset);
            case 15:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.I(t, jOffset) == UnsafeUtil.I(t2, jOffset);
            case 16:
                return arePresentForEquals(t, t2, i) && UnsafeUtil.L(t, jOffset) == UnsafeUtil.L(t2, jOffset);
            case 17:
                return arePresentForEquals(t, t2, i) && v.N(UnsafeUtil.O(t, jOffset), UnsafeUtil.O(t2, jOffset));
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
                return v.N(UnsafeUtil.O(t, jOffset), UnsafeUtil.O(t2, jOffset));
            case 50:
                return v.N(UnsafeUtil.O(t, jOffset), UnsafeUtil.O(t2, jOffset));
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
                return isOneofCaseEqual(t, t2, i) && v.N(UnsafeUtil.O(t, jOffset), UnsafeUtil.O(t2, jOffset));
            default:
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i, t tVar) {
        return tVar.isInitialized(UnsafeUtil.O(obj, offset(i)));
    }
}
