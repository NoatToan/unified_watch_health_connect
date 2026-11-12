package com.google.protobuf;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class b {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static int A(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int I = I(bArr, i2, c0256b);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(c0256b.a));
        while (I < i3) {
            int I2 = I(bArr, I, c0256b);
            if (i != c0256b.a) {
                break;
            }
            I = I(bArr, I2, c0256b);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(c0256b.a));
        }
        return I;
    }

    public static int B(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iL = L(bArr, i2, c0256b);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(c0256b.b));
        while (iL < i3) {
            int I = I(bArr, iL, c0256b);
            if (i != c0256b.a) {
                break;
            }
            iL = L(bArr, I, c0256b);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(c0256b.b));
        }
        return iL;
    }

    public static int C(byte[] bArr, int i, C0256b c0256b) throws InvalidProtocolBufferException {
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            c0256b.c = "";
            return I;
        }
        c0256b.c = new String(bArr, I, i2, Internal.a);
        return I + i2;
    }

    public static int D(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, c0256b);
        int i4 = c0256b.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, I, i4, Internal.a));
            I += i4;
        }
        while (I < i3) {
            int I2 = I(bArr, I, c0256b);
            if (i != c0256b.a) {
                break;
            }
            I = I(bArr, I2, c0256b);
            int i5 = c0256b.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, I, i5, Internal.a));
                I += i5;
            }
        }
        return I;
    }

    public static int E(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, c0256b);
        int i4 = c0256b.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            int i5 = I + i4;
            if (!Utf8.u(bArr, I, i5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new String(bArr, I, i4, Internal.a));
            I = i5;
        }
        while (I < i3) {
            int I2 = I(bArr, I, c0256b);
            if (i != c0256b.a) {
                break;
            }
            I = I(bArr, I2, c0256b);
            int i6 = c0256b.a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                protobufList.add("");
            } else {
                int i7 = I + i6;
                if (!Utf8.u(bArr, I, i7)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new String(bArr, I, i6, Internal.a));
                I = i7;
            }
        }
        return I;
    }

    public static int F(byte[] bArr, int i, C0256b c0256b) throws InvalidProtocolBufferException {
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            c0256b.c = "";
            return I;
        }
        c0256b.c = Utf8.h(bArr, I, i2);
        return I + i2;
    }

    public static int G(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, C0256b c0256b) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            int iL = L(bArr, i2, c0256b);
            unknownFieldSetLite.m(i, Long.valueOf(c0256b.b));
            return iL;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.m(i, Long.valueOf(j(bArr, i2)));
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int I = I(bArr, i2, c0256b);
            int i4 = c0256b.a;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                unknownFieldSetLite.m(i, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.m(i, ByteString.copyFrom(bArr, I, i4));
            }
            return I + i4;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.m(i, Integer.valueOf(h(bArr, i2)));
            return i2 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteJ = UnknownFieldSetLite.j();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            int I2 = I(bArr, i2, c0256b);
            int i7 = c0256b.a;
            if (i7 == i5) {
                i6 = i7;
                i2 = I2;
                break;
            }
            i6 = i7;
            i2 = G(i7, bArr, I2, i3, unknownFieldSetLiteJ, c0256b);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.m(i, unknownFieldSetLiteJ);
        return i2;
    }

    public static int H(int i, byte[] bArr, int i2, C0256b c0256b) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c0256b.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c0256b.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c0256b.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c0256b.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c0256b.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int I(byte[] bArr, int i, C0256b c0256b) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return H(b, bArr, i2, c0256b);
        }
        c0256b.a = b;
        return i2;
    }

    public static int J(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int I = I(bArr, i2, c0256b);
        intArrayList.addInt(c0256b.a);
        while (I < i3) {
            int I2 = I(bArr, I, c0256b);
            if (i != c0256b.a) {
                break;
            }
            I = I(bArr, I2, c0256b);
            intArrayList.addInt(c0256b.a);
        }
        return I;
    }

    public static int K(long j, byte[] bArr, int i, C0256b c0256b) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b2 & 127)) << i3;
            i2 = i4;
            b = b2;
        }
        c0256b.b = j2;
        return i2;
    }

    public static int L(byte[] bArr, int i, C0256b c0256b) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return K(j, bArr, i2, c0256b);
        }
        c0256b.b = j;
        return i2;
    }

    public static int M(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iL = L(bArr, i2, c0256b);
        longArrayList.addLong(c0256b.b);
        while (iL < i3) {
            int I = I(bArr, iL, c0256b);
            if (i != c0256b.a) {
                break;
            }
            iL = L(bArr, I, c0256b);
            longArrayList.addLong(c0256b.b);
        }
        return iL;
    }

    public static int N(int i, byte[] bArr, int i2, int i3, C0256b c0256b) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            return L(bArr, i2, c0256b);
        }
        if (tagWireType == 1) {
            return i2 + 8;
        }
        if (tagWireType == 2) {
            return I(bArr, i2, c0256b) + c0256b.a;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = I(bArr, i2, c0256b);
            i5 = c0256b.a;
            if (i5 == i4) {
                break;
            }
            i2 = N(i5, bArr, i2, i3, c0256b);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iL = L(bArr, i2, c0256b);
        booleanArrayList.addBoolean(c0256b.b != 0);
        while (iL < i3) {
            int I = I(bArr, iL, c0256b);
            if (i != c0256b.a) {
                break;
            }
            iL = L(bArr, I, c0256b);
            booleanArrayList.addBoolean(c0256b.b != 0);
        }
        return iL;
    }

    public static int b(byte[] bArr, int i, C0256b c0256b) throws InvalidProtocolBufferException {
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            c0256b.c = ByteString.EMPTY;
            return I;
        }
        c0256b.c = ByteString.copyFrom(bArr, I, i2);
        return I + i2;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, c0256b);
        int i4 = c0256b.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 > bArr.length - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i4 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, I, i4));
            I += i4;
        }
        while (I < i3) {
            int I2 = I(bArr, I, c0256b);
            if (i != c0256b.a) {
                break;
            }
            I = I(bArr, I2, c0256b);
            int i5 = c0256b.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                protobufList.add(ByteString.EMPTY);
            } else {
                protobufList.add(ByteString.copyFrom(bArr, I, i5));
                I += i5;
            }
        }
        return I;
    }

    public static double d(byte[] bArr, int i) {
        return Double.longBitsToDouble(j(bArr, i));
    }

    public static int e(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.addDouble(d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, c0256b);
            if (i != c0256b.a) {
                break;
            }
            doubleArrayList.addDouble(d(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int f(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, w<UnknownFieldSetLite, UnknownFieldSetLite> wVar, C0256b c0256b) throws IOException {
        Object objU;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i4 = i >>> 3;
        Object objValueOf = null;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (a.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int iS = s(bArr, i2, doubleArrayList, c0256b);
                    fieldSet.O(generatedExtension.descriptor, doubleArrayList);
                    return iS;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int iV = v(bArr, i2, floatArrayList, c0256b);
                    fieldSet.O(generatedExtension.descriptor, floatArrayList);
                    return iV;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int iZ = z(bArr, i2, longArrayList, c0256b);
                    fieldSet.O(generatedExtension.descriptor, longArrayList);
                    return iZ;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int iY = y(bArr, i2, intArrayList, c0256b);
                    fieldSet.O(generatedExtension.descriptor, intArrayList);
                    return iY;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int iU = u(bArr, i2, longArrayList2, c0256b);
                    fieldSet.O(generatedExtension.descriptor, longArrayList2);
                    return iU;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int iT = t(bArr, i2, intArrayList2, c0256b);
                    fieldSet.O(generatedExtension.descriptor, intArrayList2);
                    return iT;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int iR = r(bArr, i2, booleanArrayList, c0256b);
                    fieldSet.O(generatedExtension.descriptor, booleanArrayList);
                    return iR;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int iW = w(bArr, i2, intArrayList3, c0256b);
                    fieldSet.O(generatedExtension.descriptor, intArrayList3);
                    return iW;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int iX = x(bArr, i2, longArrayList3, c0256b);
                    fieldSet.O(generatedExtension.descriptor, longArrayList3);
                    return iX;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int iY2 = y(bArr, i2, intArrayList4, c0256b);
                    UnknownFieldSetLite unknownFieldSetLite = extendableMessage.unknownFields;
                    UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) v.B(i4, intArrayList4, generatedExtension.descriptor.getEnumType(), unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance() ? unknownFieldSetLite : null, wVar);
                    if (unknownFieldSetLite2 != null) {
                        extendableMessage.unknownFields = unknownFieldSetLite2;
                    }
                    fieldSet.O(generatedExtension.descriptor, intArrayList4);
                    return iY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
            switch (a.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(d(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(l(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = L(bArr, i2, c0256b);
                    objValueOf = Long.valueOf(c0256b.b);
                    break;
                case 5:
                case 6:
                    i2 = I(bArr, i2, c0256b);
                    objValueOf = Integer.valueOf(c0256b.a);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(j(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(h(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = L(bArr, i2, c0256b);
                    objValueOf = Boolean.valueOf(c0256b.b != 0);
                    break;
                case 12:
                    i2 = I(bArr, i2, c0256b);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(c0256b.a));
                    break;
                case 13:
                    i2 = L(bArr, i2, c0256b);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(c0256b.b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = b(bArr, i2, c0256b);
                    objValueOf = c0256b.c;
                    break;
                case 16:
                    i2 = C(bArr, i2, c0256b);
                    objValueOf = c0256b.c;
                    break;
                case 17:
                    i2 = n(q.a().i(generatedExtension.getMessageDefaultInstance().getClass()), bArr, i2, i3, (i4 << 3) | 4, c0256b);
                    objValueOf = c0256b.c;
                    break;
                case 18:
                    i2 = p(q.a().i(generatedExtension.getMessageDefaultInstance().getClass()), bArr, i2, i3, c0256b);
                    objValueOf = c0256b.c;
                    break;
            }
        } else {
            i2 = I(bArr, i2, c0256b);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(c0256b.a) == null) {
                UnknownFieldSetLite unknownFieldSetLiteJ = extendableMessage.unknownFields;
                if (unknownFieldSetLiteJ == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLiteJ = UnknownFieldSetLite.j();
                    extendableMessage.unknownFields = unknownFieldSetLiteJ;
                }
                v.Q(i4, c0256b.a, unknownFieldSetLiteJ, wVar);
                return i2;
            }
            objValueOf = Integer.valueOf(c0256b.a);
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.h(generatedExtension.descriptor, objValueOf);
        } else {
            int i5 = a.a[generatedExtension.getLiteType().ordinal()];
            if ((i5 == 17 || i5 == 18) && (objU = fieldSet.u(generatedExtension.descriptor)) != null) {
                objValueOf = Internal.d(objU, objValueOf);
            }
            fieldSet.O(generatedExtension.descriptor, objValueOf);
        }
        return i2;
    }

    public static int g(int i, byte[] bArr, int i2, int i3, Object obj, MessageLite messageLite, w<UnknownFieldSetLite, UnknownFieldSetLite> wVar, C0256b c0256b) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = c0256b.d.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return G(i, bArr, i2, i3, MessageSchema.getMutableUnknownFields(obj), c0256b);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return f(i, bArr, i2, i3, extendableMessage, generatedExtensionFindLiteExtensionByNumber, wVar, c0256b);
    }

    public static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int i(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.addInt(h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, c0256b);
            if (i != c0256b.a) {
                break;
            }
            intArrayList.addInt(h(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    public static long j(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int k(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.addLong(j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, c0256b);
            if (i != c0256b.a) {
                break;
            }
            longArrayList.addLong(j(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    public static float l(byte[] bArr, int i) {
        return Float.intBitsToFloat(h(bArr, i));
    }

    public static int m(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.addFloat(l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, c0256b);
            if (i != c0256b.a) {
                break;
            }
            floatArrayList.addFloat(l(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    public static int n(t tVar, byte[] bArr, int i, int i2, int i3, C0256b c0256b) throws IOException {
        MessageSchema messageSchema = (MessageSchema) tVar;
        Object objNewInstance = messageSchema.newInstance();
        int proto2Message = messageSchema.parseProto2Message(objNewInstance, bArr, i, i2, i3, c0256b);
        messageSchema.makeImmutable(objNewInstance);
        c0256b.c = objNewInstance;
        return proto2Message;
    }

    public static int o(t tVar, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws IOException {
        int i4 = (i & (-8)) | 4;
        int iN = n(tVar, bArr, i2, i3, i4, c0256b);
        protobufList.add(c0256b.c);
        while (iN < i3) {
            int I = I(bArr, iN, c0256b);
            if (i != c0256b.a) {
                break;
            }
            iN = n(tVar, bArr, I, i3, i4, c0256b);
            protobufList.add(c0256b.c);
        }
        return iN;
    }

    public static int p(t tVar, byte[] bArr, int i, int i2, C0256b c0256b) throws IOException {
        int iH = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iH = H(i3, bArr, iH, c0256b);
            i3 = c0256b.a;
        }
        int i4 = iH;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        Object objNewInstance = tVar.newInstance();
        int i5 = i3 + i4;
        tVar.mergeFrom(objNewInstance, bArr, i4, i5, c0256b);
        tVar.makeImmutable(objNewInstance);
        c0256b.c = objNewInstance;
        return i5;
    }

    public static int q(t<?> tVar, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws IOException {
        int iP = p(tVar, bArr, i2, i3, c0256b);
        protobufList.add(c0256b.c);
        while (iP < i3) {
            int I = I(bArr, iP, c0256b);
            if (i != c0256b.a) {
                break;
            }
            iP = p(tVar, bArr, I, i3, c0256b);
            protobufList.add(c0256b.c);
        }
        return iP;
    }

    public static int r(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws IOException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a + I;
        while (I < i2) {
            I = L(bArr, I, c0256b);
            booleanArrayList.addBoolean(c0256b.b != 0);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int s(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws IOException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a + I;
        while (I < i2) {
            doubleArrayList.addDouble(d(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int t(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a + I;
        while (I < i2) {
            intArrayList.addInt(h(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int u(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a + I;
        while (I < i2) {
            longArrayList.addLong(j(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int v(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws IOException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a + I;
        while (I < i2) {
            floatArrayList.addFloat(l(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int w(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a + I;
        while (I < i2) {
            I = I(bArr, I, c0256b);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(c0256b.a));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int x(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a + I;
        while (I < i2) {
            I = L(bArr, I, c0256b);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(c0256b.b));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int y(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a + I;
        while (I < i2) {
            I = I(bArr, I, c0256b);
            intArrayList.addInt(c0256b.a);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int z(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0256b c0256b) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int I = I(bArr, i, c0256b);
        int i2 = c0256b.a + I;
        while (I < i2) {
            I = L(bArr, I, c0256b);
            longArrayList.addLong(c0256b.b);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: renamed from: com.google.protobuf.b$b, reason: collision with other inner class name */
    public static final class C0256b {
        public int a;
        public long b;
        public Object c;
        public final ExtensionRegistryLite d;

        public C0256b() {
            this.d = ExtensionRegistryLite.getEmptyRegistry();
        }

        public C0256b(ExtensionRegistryLite extensionRegistryLite) {
            Objects.requireNonNull(extensionRegistryLite);
            this.d = extensionRegistryLite;
        }
    }
}
