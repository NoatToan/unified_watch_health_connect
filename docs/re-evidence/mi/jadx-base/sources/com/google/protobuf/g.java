package com.google.protobuf;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.xdi;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9639a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9639a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9639a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9639a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9639a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9639a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9639a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9639a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9639a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9639a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9639a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9639a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9639a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9639a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9639a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9639a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9639a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9639a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9639a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f9641b;
        public Object c;
        public final t d;

        public b(t tVar) {
            tVar.getClass();
            this.d = tVar;
        }
    }

    public static int A(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, i2, bVar);
        c0Var.Q(j.b(bVar.f9640a));
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            I = I(bArr, I2, bVar);
            c0Var.Q(j.b(bVar.f9640a));
        }
        return I;
    }

    public static int B(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) {
        i0 i0Var = (i0) iVar;
        int iL = L(bArr, i2, bVar);
        i0Var.i(j.c(bVar.f9641b));
        while (iL < i3) {
            int I = I(bArr, iL, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            iL = L(bArr, I, bVar);
            i0Var.i(j.c(bVar.f9641b));
        }
        return iL;
    }

    public static int C(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.c = "";
            return I;
        }
        bVar.c = new String(bArr, I, i2, d0.f9618a);
        return I + i2;
    }

    public static int D(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, bVar);
        int i4 = bVar.f9640a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            iVar.add("");
        } else {
            iVar.add(new String(bArr, I, i4, d0.f9618a));
            I += i4;
        }
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i5 = bVar.f9640a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, I, i5, d0.f9618a));
                I += i5;
            }
        }
        return I;
    }

    public static int E(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, bVar);
        int i4 = bVar.f9640a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            iVar.add("");
        } else {
            int i5 = I + i4;
            if (!v1.t(bArr, I, i5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            iVar.add(new String(bArr, I, i4, d0.f9618a));
            I = i5;
        }
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i6 = bVar.f9640a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                iVar.add("");
            } else {
                int i7 = I + i6;
                if (!v1.t(bArr, I, i7)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                iVar.add(new String(bArr, I, i6, d0.f9618a));
                I = i7;
            }
        }
        return I;
    }

    public static int F(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.c = "";
            return I;
        }
        bVar.c = v1.h(bArr, I, i2);
        return I + i2;
    }

    public static int G(int i, byte[] bArr, int i2, int i3, s1 s1Var, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.a(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iB = WireFormat.b(i);
        if (iB == 0) {
            int iL = L(bArr, i2, bVar);
            s1Var.q(i, Long.valueOf(bVar.f9641b));
            return iL;
        }
        if (iB == 1) {
            s1Var.q(i, Long.valueOf(j(bArr, i2)));
            return i2 + 8;
        }
        if (iB == 2) {
            int I = I(bArr, i2, bVar);
            int i4 = bVar.f9640a;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                s1Var.q(i, ByteString.EMPTY);
            } else {
                s1Var.q(i, ByteString.copyFrom(bArr, I, i4));
            }
            return I + i4;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            s1Var.q(i, Integer.valueOf(h(bArr, i2)));
            return i2 + 4;
        }
        s1 s1VarN = s1.n();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            int I2 = I(bArr, i2, bVar);
            int i7 = bVar.f9640a;
            if (i7 == i5) {
                i6 = i7;
                i2 = I2;
                break;
            }
            i6 = i7;
            i2 = G(i7, bArr, I2, i3, s1VarN, bVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        s1Var.q(i, s1VarN);
        return i2;
    }

    public static int H(int i, byte[] bArr, int i2, b bVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            bVar.f9640a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            bVar.f9640a = i5 | (b3 << HMProSyncDataBaseProfile.DATA_TYPE_COACHING);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            bVar.f9640a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            bVar.f9640a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                bVar.f9640a = i11;
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
        bVar.f9640a = b2;
        return i2;
    }

    public static int J(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, i2, bVar);
        c0Var.Q(bVar.f9640a);
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            I = I(bArr, I2, bVar);
            c0Var.Q(bVar.f9640a);
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
        bVar.f9641b = j2;
        return i2;
    }

    public static int L(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return K(j, bArr, i2, bVar);
        }
        bVar.f9641b = j;
        return i2;
    }

    public static int M(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) {
        i0 i0Var = (i0) iVar;
        int iL = L(bArr, i2, bVar);
        i0Var.i(bVar.f9641b);
        while (iL < i3) {
            int I = I(bArr, iL, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            iL = L(bArr, I, bVar);
            i0Var.i(bVar.f9641b);
        }
        return iL;
    }

    public static int N(int i, byte[] bArr, int i2, int i3, b bVar) throws InvalidProtocolBufferException {
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
            return I(bArr, i2, bVar) + bVar.f9640a;
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
            i5 = bVar.f9640a;
            if (i5 == i4) {
                break;
            }
            i2 = N(i5, bArr, i2, i3, bVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) {
        i iVar2 = (i) iVar;
        int iL = L(bArr, i2, bVar);
        iVar2.p(bVar.f9641b != 0);
        while (iL < i3) {
            int I = I(bArr, iL, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            iL = L(bArr, I, bVar);
            iVar2.p(bVar.f9641b != 0);
        }
        return iL;
    }

    public static int b(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a;
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

    public static int c(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, bVar);
        int i4 = bVar.f9640a;
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
            if (i != bVar.f9640a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i5 = bVar.f9640a;
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

    public static int e(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) {
        n nVar = (n) iVar;
        nVar.h(d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            nVar.h(d(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int f(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.c<?, ?> cVar, GeneratedMessageLite.e<?, ?> eVar, q1<s1, s1> q1Var, b bVar) throws IOException {
        Object objS;
        a0<GeneratedMessageLite.d> a0Var = cVar.f9544a;
        int i4 = i >>> 3;
        Object objValueOf = null;
        if (eVar.d.isRepeated() && eVar.d.isPacked()) {
            switch (a.f9639a[eVar.c().ordinal()]) {
                case 1:
                    n nVar = new n();
                    int iS = s(bArr, i2, nVar, bVar);
                    a0Var.M(eVar.d, nVar);
                    return iS;
                case 2:
                    b0 b0Var = new b0();
                    int iV = v(bArr, i2, b0Var, bVar);
                    a0Var.M(eVar.d, b0Var);
                    return iV;
                case 3:
                case 4:
                    i0 i0Var = new i0();
                    int iZ = z(bArr, i2, i0Var, bVar);
                    a0Var.M(eVar.d, i0Var);
                    return iZ;
                case 5:
                case 6:
                    c0 c0Var = new c0();
                    int iY = y(bArr, i2, c0Var, bVar);
                    a0Var.M(eVar.d, c0Var);
                    return iY;
                case 7:
                case 8:
                    i0 i0Var2 = new i0();
                    int iU = u(bArr, i2, i0Var2, bVar);
                    a0Var.M(eVar.d, i0Var2);
                    return iU;
                case 9:
                case 10:
                    c0 c0Var2 = new c0();
                    int iT = t(bArr, i2, c0Var2, bVar);
                    a0Var.M(eVar.d, c0Var2);
                    return iT;
                case 11:
                    i iVar = new i();
                    int iR = r(bArr, i2, iVar, bVar);
                    a0Var.M(eVar.d, iVar);
                    return iR;
                case 12:
                    c0 c0Var3 = new c0();
                    int iW = w(bArr, i2, c0Var3, bVar);
                    a0Var.M(eVar.d, c0Var3);
                    return iW;
                case 13:
                    i0 i0Var3 = new i0();
                    int iX = x(bArr, i2, i0Var3, bVar);
                    a0Var.M(eVar.d, i0Var3);
                    return iX;
                case 14:
                    c0 c0Var4 = new c0();
                    int iY2 = y(bArr, i2, c0Var4, bVar);
                    s1 s1Var = cVar.unknownFields;
                    s1 s1Var2 = (s1) f1.z(i4, c0Var4, eVar.d.b(), s1Var != s1.c() ? s1Var : null, q1Var);
                    if (s1Var2 != null) {
                        cVar.unknownFields = s1Var2;
                    }
                    a0Var.M(eVar.d, c0Var4);
                    return iY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.d.getLiteType());
            }
        }
        if (eVar.c() != WireFormat.FieldType.ENUM) {
            switch (a.f9639a[eVar.c().ordinal()]) {
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
                    objValueOf = Long.valueOf(bVar.f9641b);
                    break;
                case 5:
                case 6:
                    i2 = I(bArr, i2, bVar);
                    objValueOf = Integer.valueOf(bVar.f9640a);
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
                    objValueOf = Boolean.valueOf(bVar.f9641b != 0);
                    break;
                case 12:
                    i2 = I(bArr, i2, bVar);
                    objValueOf = Integer.valueOf(j.b(bVar.f9640a));
                    break;
                case 13:
                    i2 = L(bArr, i2, bVar);
                    objValueOf = Long.valueOf(j.c(bVar.f9641b));
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
                    i2 = n(xdi.a().d(eVar.d().getClass()), bArr, i2, i3, (i4 << 3) | 4, bVar);
                    objValueOf = bVar.c;
                    break;
                case 18:
                    i2 = p(xdi.a().d(eVar.d().getClass()), bArr, i2, i3, bVar);
                    objValueOf = bVar.c;
                    break;
            }
        } else {
            i2 = I(bArr, i2, bVar);
            if (eVar.d.b().findValueByNumber(bVar.f9640a) == null) {
                s1 s1VarN = cVar.unknownFields;
                if (s1VarN == s1.c()) {
                    s1VarN = s1.n();
                    cVar.unknownFields = s1VarN;
                }
                f1.M(i4, bVar.f9640a, s1VarN, q1Var);
                return i2;
            }
            objValueOf = Integer.valueOf(bVar.f9640a);
        }
        if (eVar.f()) {
            a0Var.f(eVar.d, objValueOf);
        } else {
            int i5 = a.f9639a[eVar.c().ordinal()];
            if ((i5 == 17 || i5 == 18) && (objS = a0Var.s(eVar.d)) != null) {
                objValueOf = d0.k(objS, objValueOf);
            }
            a0Var.M(eVar.d, objValueOf);
        }
        return i2;
    }

    public static int g(int i, byte[] bArr, int i2, int i3, Object obj, q0 q0Var, q1<s1, s1> q1Var, b bVar) throws IOException {
        GeneratedMessageLite.e eVarB = bVar.d.b(q0Var, i >>> 3);
        if (eVarB == null) {
            return G(i, bArr, i2, i3, t0.u(obj), bVar);
        }
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) obj;
        cVar.a();
        return f(i, bArr, i2, i3, cVar, eVarB, q1Var, bVar);
    }

    public static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int i(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        c0Var.Q(h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            c0Var.Q(h(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    public static long j(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int k(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) {
        i0 i0Var = (i0) iVar;
        i0Var.i(j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            i0Var.i(j(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    public static float l(byte[] bArr, int i) {
        return Float.intBitsToFloat(h(bArr, i));
    }

    public static int m(int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) {
        b0 b0Var = (b0) iVar;
        b0Var.J(l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            b0Var.J(l(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    public static int n(e1 e1Var, byte[] bArr, int i, int i2, int i3, b bVar) throws IOException {
        t0 t0Var = (t0) e1Var;
        Object objE = t0Var.e();
        int iB0 = t0Var.b0(objE, bArr, i, i2, i3, bVar);
        t0Var.c(objE);
        bVar.c = objE;
        return iB0;
    }

    public static int o(e1 e1Var, int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int iN = n(e1Var, bArr, i2, i3, i4, bVar);
        iVar.add(bVar.c);
        while (iN < i3) {
            int I = I(bArr, iN, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            iN = n(e1Var, bArr, I, i3, i4, bVar);
            iVar.add(bVar.c);
        }
        return iN;
    }

    public static int p(e1 e1Var, byte[] bArr, int i, int i2, b bVar) throws IOException {
        int iH = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iH = H(i3, bArr, iH, bVar);
            i3 = bVar.f9640a;
        }
        int i4 = iH;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        Object objE = e1Var.e();
        int i5 = i3 + i4;
        e1Var.g(objE, bArr, i4, i5, bVar);
        e1Var.c(objE);
        bVar.c = objE;
        return i5;
    }

    public static int q(e1<?> e1Var, int i, byte[] bArr, int i2, int i3, d0.i<?> iVar, b bVar) throws IOException {
        int iP = p(e1Var, bArr, i2, i3, bVar);
        iVar.add(bVar.c);
        while (iP < i3) {
            int I = I(bArr, iP, bVar);
            if (i != bVar.f9640a) {
                break;
            }
            iP = p(e1Var, bArr, I, i3, bVar);
            iVar.add(bVar.c);
        }
        return iP;
    }

    public static int r(byte[] bArr, int i, d0.i<?> iVar, b bVar) throws IOException {
        i iVar2 = (i) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            iVar2.p(bVar.f9641b != 0);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int s(byte[] bArr, int i, d0.i<?> iVar, b bVar) throws IOException {
        n nVar = (n) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a + I;
        while (I < i2) {
            nVar.h(d(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int t(byte[] bArr, int i, d0.i<?> iVar, b bVar) throws IOException {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a + I;
        while (I < i2) {
            c0Var.Q(h(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int u(byte[] bArr, int i, d0.i<?> iVar, b bVar) throws IOException {
        i0 i0Var = (i0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a + I;
        while (I < i2) {
            i0Var.i(j(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int v(byte[] bArr, int i, d0.i<?> iVar, b bVar) throws IOException {
        b0 b0Var = (b0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a + I;
        while (I < i2) {
            b0Var.J(l(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int w(byte[] bArr, int i, d0.i<?> iVar, b bVar) throws IOException {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a + I;
        while (I < i2) {
            I = I(bArr, I, bVar);
            c0Var.Q(j.b(bVar.f9640a));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int x(byte[] bArr, int i, d0.i<?> iVar, b bVar) throws IOException {
        i0 i0Var = (i0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            i0Var.i(j.c(bVar.f9641b));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int y(byte[] bArr, int i, d0.i<?> iVar, b bVar) throws IOException {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a + I;
        while (I < i2) {
            I = I(bArr, I, bVar);
            c0Var.Q(bVar.f9640a);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int z(byte[] bArr, int i, d0.i<?> iVar, b bVar) throws IOException {
        i0 i0Var = (i0) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9640a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            i0Var.i(bVar.f9641b);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
