package androidx.health.platform.client.proto;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.vdi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2481a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2481a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2481a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2481a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2481a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2481a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2481a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2481a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2481a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2481a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2481a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2481a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2481a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2481a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2481a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2481a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2481a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2481a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2481a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f2483b;
        public Object c;
        public final y d;

        public b(y yVar) {
            yVar.getClass();
            this.d = yVar;
        }
    }

    public static int A(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) {
        e0 e0Var = (e0) iVar;
        int I = I(bArr, i2, bVar);
        e0Var.Q(h.b(bVar.f2482a));
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            I = I(bArr, I2, bVar);
            e0Var.Q(h.b(bVar.f2482a));
        }
        return I;
    }

    public static int B(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) {
        k0 k0Var = (k0) iVar;
        int iL = L(bArr, i2, bVar);
        k0Var.i(h.c(bVar.f2483b));
        while (iL < i3) {
            int I = I(bArr, iL, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            iL = L(bArr, I, bVar);
            k0Var.i(h.c(bVar.f2483b));
        }
        return iL;
    }

    public static int C(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.c = "";
            return I;
        }
        bVar.c = new String(bArr, I, i2, f0.f2490b);
        return I + i2;
    }

    public static int D(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, bVar);
        int i4 = bVar.f2482a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            iVar.add("");
        } else {
            iVar.add(new String(bArr, I, i4, f0.f2490b));
            I += i4;
        }
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i5 = bVar.f2482a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, I, i5, f0.f2490b));
                I += i5;
            }
        }
        return I;
    }

    public static int E(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, bVar);
        int i4 = bVar.f2482a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            iVar.add("");
        } else {
            int i5 = I + i4;
            if (!e2.t(bArr, I, i5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            iVar.add(new String(bArr, I, i4, f0.f2490b));
            I = i5;
        }
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i6 = bVar.f2482a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                iVar.add("");
            } else {
                int i7 = I + i6;
                if (!e2.t(bArr, I, i7)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                iVar.add(new String(bArr, I, i6, f0.f2490b));
                I = i7;
            }
        }
        return I;
    }

    public static int F(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.c = "";
            return I;
        }
        bVar.c = e2.h(bArr, I, i2);
        return I + i2;
    }

    public static int G(int i, byte[] bArr, int i2, int i3, c2 c2Var, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.a(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iB = WireFormat.b(i);
        if (iB == 0) {
            int iL = L(bArr, i2, bVar);
            c2Var.n(i, Long.valueOf(bVar.f2483b));
            return iL;
        }
        if (iB == 1) {
            c2Var.n(i, Long.valueOf(j(bArr, i2)));
            return i2 + 8;
        }
        if (iB == 2) {
            int I = I(bArr, i2, bVar);
            int i4 = bVar.f2482a;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                c2Var.n(i, ByteString.EMPTY);
            } else {
                c2Var.n(i, ByteString.copyFrom(bArr, I, i4));
            }
            return I + i4;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            c2Var.n(i, Integer.valueOf(h(bArr, i2)));
            return i2 + 4;
        }
        c2 c2VarK = c2.k();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            int I2 = I(bArr, i2, bVar);
            int i7 = bVar.f2482a;
            if (i7 == i5) {
                i6 = i7;
                i2 = I2;
                break;
            }
            i6 = i7;
            i2 = G(i7, bArr, I2, i3, c2VarK, bVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        c2Var.n(i, c2VarK);
        return i2;
    }

    public static int H(int i, byte[] bArr, int i2, b bVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            bVar.f2482a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            bVar.f2482a = i5 | (b3 << HMProSyncDataBaseProfile.DATA_TYPE_COACHING);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            bVar.f2482a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            bVar.f2482a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                bVar.f2482a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int I(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return H(b2, bArr, i2, bVar);
        }
        bVar.f2482a = b2;
        return i2;
    }

    public static int J(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) {
        e0 e0Var = (e0) iVar;
        int I = I(bArr, i2, bVar);
        e0Var.Q(bVar.f2482a);
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            I = I(bArr, I2, bVar);
            e0Var.Q(bVar.f2482a);
        }
        return I;
    }

    public static int K(long j, byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i3 = 7;
        while (b2 < 0) {
            int i4 = i2 + 1;
            byte b3 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b3 & 127)) << i3;
            i2 = i4;
            b2 = b3;
        }
        bVar.f2483b = j2;
        return i2;
    }

    public static int L(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return K(j, bArr, i2, bVar);
        }
        bVar.f2483b = j;
        return i2;
    }

    public static int M(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) {
        k0 k0Var = (k0) iVar;
        int iL = L(bArr, i2, bVar);
        k0Var.i(bVar.f2483b);
        while (iL < i3) {
            int I = I(bArr, iL, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            iL = L(bArr, I, bVar);
            k0Var.i(bVar.f2483b);
        }
        return iL;
    }

    public static int N(Object obj, w1 w1Var, byte[] bArr, int i, int i2, int i3, b bVar) throws IOException {
        int iF0 = ((q0) w1Var).f0(obj, bArr, i, i2, i3, bVar);
        bVar.c = obj;
        return iF0;
    }

    public static int O(Object obj, w1 w1Var, byte[] bArr, int i, int i2, b bVar) throws IOException {
        int iH = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iH = H(i3, bArr, iH, bVar);
            i3 = bVar.f2482a;
        }
        int i4 = iH;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = i3 + i4;
        w1Var.f(obj, bArr, i4, i5, bVar);
        bVar.c = obj;
        return i5;
    }

    public static int P(int i, byte[] bArr, int i2, int i3, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.a(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iB = WireFormat.b(i);
        if (iB == 0) {
            return L(bArr, i2, bVar);
        }
        if (iB == 1) {
            return i2 + 8;
        }
        if (iB == 2) {
            return I(bArr, i2, bVar) + bVar.f2482a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = I(bArr, i2, bVar);
            i5 = bVar.f2482a;
            if (i5 == i4) {
                break;
            }
            i2 = P(i5, bArr, i2, i3, bVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) {
        e eVar = (e) iVar;
        int iL = L(bArr, i2, bVar);
        eVar.p(bVar.f2483b != 0);
        while (iL < i3) {
            int I = I(bArr, iL, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            iL = L(bArr, I, bVar);
            eVar.p(bVar.f2483b != 0);
        }
        return iL;
    }

    public static int b(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            bVar.c = ByteString.EMPTY;
            return I;
        }
        bVar.c = ByteString.copyFrom(bArr, I, i2);
        return I + i2;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, bVar);
        int i4 = bVar.f2482a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 > bArr.length - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i4 == 0) {
            iVar.add(ByteString.EMPTY);
        } else {
            iVar.add(ByteString.copyFrom(bArr, I, i4));
            I += i4;
        }
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i5 = bVar.f2482a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                iVar.add(ByteString.EMPTY);
            } else {
                iVar.add(ByteString.copyFrom(bArr, I, i5));
                I += i5;
            }
        }
        return I;
    }

    public static double d(byte[] bArr, int i) {
        return Double.longBitsToDouble(j(bArr, i));
    }

    public static int e(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) {
        u uVar = (u) iVar;
        uVar.h(d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            uVar.h(d(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int f(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.c<?, ?> cVar, GeneratedMessageLite.e<?, ?> eVar, b2<c2, c2> b2Var, b bVar) throws IOException {
        c0<GeneratedMessageLite.d> c0Var = cVar.extensions;
        int i4 = i >>> 3;
        if (eVar.f2466b.isRepeated() && eVar.f2466b.isPacked()) {
            switch (a.f2481a[eVar.a().ordinal()]) {
                case 1:
                    u uVar = new u();
                    int iS = s(bArr, i2, uVar, bVar);
                    c0Var.y(eVar.f2466b, uVar);
                    return iS;
                case 2:
                    d0 d0Var = new d0();
                    int iV = v(bArr, i2, d0Var, bVar);
                    c0Var.y(eVar.f2466b, d0Var);
                    return iV;
                case 3:
                case 4:
                    k0 k0Var = new k0();
                    int iZ = z(bArr, i2, k0Var, bVar);
                    c0Var.y(eVar.f2466b, k0Var);
                    return iZ;
                case 5:
                case 6:
                    e0 e0Var = new e0();
                    int iY = y(bArr, i2, e0Var, bVar);
                    c0Var.y(eVar.f2466b, e0Var);
                    return iY;
                case 7:
                case 8:
                    k0 k0Var2 = new k0();
                    int iU = u(bArr, i2, k0Var2, bVar);
                    c0Var.y(eVar.f2466b, k0Var2);
                    return iU;
                case 9:
                case 10:
                    e0 e0Var2 = new e0();
                    int iT = t(bArr, i2, e0Var2, bVar);
                    c0Var.y(eVar.f2466b, e0Var2);
                    return iT;
                case 11:
                    e eVar2 = new e();
                    int iR = r(bArr, i2, eVar2, bVar);
                    c0Var.y(eVar.f2466b, eVar2);
                    return iR;
                case 12:
                    e0 e0Var3 = new e0();
                    int iW = w(bArr, i2, e0Var3, bVar);
                    c0Var.y(eVar.f2466b, e0Var3);
                    return iW;
                case 13:
                    k0 k0Var3 = new k0();
                    int iX = x(bArr, i2, k0Var3, bVar);
                    c0Var.y(eVar.f2466b, k0Var3);
                    return iX;
                case 14:
                    e0 e0Var4 = new e0();
                    int iY2 = y(bArr, i2, e0Var4, bVar);
                    x1.z(cVar, i4, e0Var4, eVar.f2466b.b(), null, b2Var);
                    c0Var.y(eVar.f2466b, e0Var4);
                    return iY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f2466b.getLiteType());
            }
        }
        Object objValueOf = null;
        if (eVar.a() == WireFormat.FieldType.ENUM) {
            i2 = I(bArr, i2, bVar);
            if (eVar.f2466b.b().findValueByNumber(bVar.f2482a) == null) {
                x1.L(cVar, i4, bVar.f2482a, null, b2Var);
                return i2;
            }
            objValueOf = Integer.valueOf(bVar.f2482a);
        } else {
            switch (a.f2481a[eVar.a().ordinal()]) {
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
                    i2 = L(bArr, i2, bVar);
                    objValueOf = Long.valueOf(bVar.f2483b);
                    break;
                case 5:
                case 6:
                    i2 = I(bArr, i2, bVar);
                    objValueOf = Integer.valueOf(bVar.f2482a);
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
                    i2 = L(bArr, i2, bVar);
                    objValueOf = Boolean.valueOf(bVar.f2483b != 0);
                    break;
                case 12:
                    i2 = I(bArr, i2, bVar);
                    objValueOf = Integer.valueOf(h.b(bVar.f2482a));
                    break;
                case 13:
                    i2 = L(bArr, i2, bVar);
                    objValueOf = Long.valueOf(h.c(bVar.f2483b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = b(bArr, i2, bVar);
                    objValueOf = bVar.c;
                    break;
                case 16:
                    i2 = C(bArr, i2, bVar);
                    objValueOf = bVar.c;
                    break;
                case 17:
                    int i5 = (i4 << 3) | 4;
                    w1 w1VarC = vdi.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int iN = n(w1VarC, bArr, i2, i3, i5, bVar);
                        c0Var.a(eVar.f2466b, bVar.c);
                        return iN;
                    }
                    Object objI = c0Var.i(eVar.f2466b);
                    if (objI == null) {
                        objI = w1VarC.e();
                        c0Var.y(eVar.f2466b, objI);
                    }
                    return N(objI, w1VarC, bArr, i2, i3, i5, bVar);
                case 18:
                    w1 w1VarC2 = vdi.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int iP = p(w1VarC2, bArr, i2, i3, bVar);
                        c0Var.a(eVar.f2466b, bVar.c);
                        return iP;
                    }
                    Object objI2 = c0Var.i(eVar.f2466b);
                    if (objI2 == null) {
                        objI2 = w1VarC2.e();
                        c0Var.y(eVar.f2466b, objI2);
                    }
                    return O(objI2, w1VarC2, bArr, i2, i3, bVar);
            }
        }
        if (eVar.d()) {
            c0Var.a(eVar.f2466b, objValueOf);
        } else {
            c0Var.y(eVar.f2466b, objValueOf);
        }
        return i2;
    }

    public static int g(int i, byte[] bArr, int i2, int i3, Object obj, o0 o0Var, b2<c2, c2> b2Var, b bVar) throws IOException {
        GeneratedMessageLite.e eVarA = bVar.d.a(o0Var, i >>> 3);
        if (eVarA == null) {
            return G(i, bArr, i2, i3, q0.v(obj), bVar);
        }
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) obj;
        cVar.N();
        return f(i, bArr, i2, i3, cVar, eVarA, b2Var, bVar);
    }

    public static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int i(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) {
        e0 e0Var = (e0) iVar;
        e0Var.Q(h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            e0Var.Q(h(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    public static long j(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int k(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) {
        k0 k0Var = (k0) iVar;
        k0Var.i(j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            k0Var.i(j(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    public static float l(byte[] bArr, int i) {
        return Float.intBitsToFloat(h(bArr, i));
    }

    public static int m(int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) {
        d0 d0Var = (d0) iVar;
        d0Var.J(l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            d0Var.J(l(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    public static int n(w1 w1Var, byte[] bArr, int i, int i2, int i3, b bVar) throws IOException {
        Object objE = w1Var.e();
        int iN = N(objE, w1Var, bArr, i, i2, i3, bVar);
        w1Var.c(objE);
        bVar.c = objE;
        return iN;
    }

    public static int o(w1 w1Var, int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int iN = n(w1Var, bArr, i2, i3, i4, bVar);
        iVar.add(bVar.c);
        while (iN < i3) {
            int I = I(bArr, iN, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            iN = n(w1Var, bArr, I, i3, i4, bVar);
            iVar.add(bVar.c);
        }
        return iN;
    }

    public static int p(w1 w1Var, byte[] bArr, int i, int i2, b bVar) throws IOException {
        Object objE = w1Var.e();
        int iO = O(objE, w1Var, bArr, i, i2, bVar);
        w1Var.c(objE);
        bVar.c = objE;
        return iO;
    }

    public static int q(w1<?> w1Var, int i, byte[] bArr, int i2, int i3, f0.i<?> iVar, b bVar) throws IOException {
        int iP = p(w1Var, bArr, i2, i3, bVar);
        iVar.add(bVar.c);
        while (iP < i3) {
            int I = I(bArr, iP, bVar);
            if (i != bVar.f2482a) {
                break;
            }
            iP = p(w1Var, bArr, I, i3, bVar);
            iVar.add(bVar.c);
        }
        return iP;
    }

    public static int r(byte[] bArr, int i, f0.i<?> iVar, b bVar) throws IOException {
        e eVar = (e) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            eVar.p(bVar.f2483b != 0);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int s(byte[] bArr, int i, f0.i<?> iVar, b bVar) throws IOException {
        u uVar = (u) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a + I;
        while (I < i2) {
            uVar.h(d(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int t(byte[] bArr, int i, f0.i<?> iVar, b bVar) throws IOException {
        e0 e0Var = (e0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a + I;
        while (I < i2) {
            e0Var.Q(h(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int u(byte[] bArr, int i, f0.i<?> iVar, b bVar) throws IOException {
        k0 k0Var = (k0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a + I;
        while (I < i2) {
            k0Var.i(j(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int v(byte[] bArr, int i, f0.i<?> iVar, b bVar) throws IOException {
        d0 d0Var = (d0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a + I;
        while (I < i2) {
            d0Var.J(l(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int w(byte[] bArr, int i, f0.i<?> iVar, b bVar) throws IOException {
        e0 e0Var = (e0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a + I;
        while (I < i2) {
            I = I(bArr, I, bVar);
            e0Var.Q(h.b(bVar.f2482a));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int x(byte[] bArr, int i, f0.i<?> iVar, b bVar) throws IOException {
        k0 k0Var = (k0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            k0Var.i(h.c(bVar.f2483b));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int y(byte[] bArr, int i, f0.i<?> iVar, b bVar) throws IOException {
        e0 e0Var = (e0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a + I;
        while (I < i2) {
            I = I(bArr, I, bVar);
            e0Var.Q(bVar.f2482a);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int z(byte[] bArr, int i, f0.i<?> iVar, b bVar) throws IOException {
        k0 k0Var = (k0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f2482a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            k0Var.i(bVar.f2483b);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
