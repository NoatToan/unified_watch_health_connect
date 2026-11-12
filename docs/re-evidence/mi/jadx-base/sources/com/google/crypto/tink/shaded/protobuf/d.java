package com.google.crypto.tink.shaded.protobuf;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.wdi;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9371a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9371a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9371a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9371a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9371a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9371a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9371a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9371a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9371a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9371a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9371a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9371a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9371a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9371a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9371a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9371a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9371a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9371a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9371a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f9373b;
        public Object c;
        public final l d;

        public b(l lVar) {
            lVar.getClass();
            this.d = lVar;
        }
    }

    public static int A(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) {
        r rVar = (r) iVar;
        int I = I(bArr, i2, bVar);
        rVar.Q(g.b(bVar.f9372a));
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            I = I(bArr, I2, bVar);
            rVar.Q(g.b(bVar.f9372a));
        }
        return I;
    }

    public static int B(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        int iL = L(bArr, i2, bVar);
        xVar.i(g.c(bVar.f9373b));
        while (iL < i3) {
            int I = I(bArr, iL, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            iL = L(bArr, I, bVar);
            xVar.i(g.c(bVar.f9373b));
        }
        return iL;
    }

    public static int C(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.c = "";
            return I;
        }
        bVar.c = new String(bArr, I, i2, s.f9434a);
        return I + i2;
    }

    public static int D(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, bVar);
        int i4 = bVar.f9372a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            iVar.add("");
        } else {
            iVar.add(new String(bArr, I, i4, s.f9434a));
            I += i4;
        }
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i5 = bVar.f9372a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, I, i5, s.f9434a));
                I += i5;
            }
        }
        return I;
    }

    public static int E(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, bVar);
        int i4 = bVar.f9372a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            iVar.add("");
        } else {
            int i5 = I + i4;
            if (!q0.t(bArr, I, i5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            iVar.add(new String(bArr, I, i4, s.f9434a));
            I = i5;
        }
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i6 = bVar.f9372a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                iVar.add("");
            } else {
                int i7 = I + i6;
                if (!q0.t(bArr, I, i7)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                iVar.add(new String(bArr, I, i6, s.f9434a));
                I = i7;
            }
        }
        return I;
    }

    public static int F(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            bVar.c = "";
            return I;
        }
        bVar.c = q0.h(bArr, I, i2);
        return I + i2;
    }

    public static int G(int i, byte[] bArr, int i2, int i3, o0 o0Var, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.a(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iB = WireFormat.b(i);
        if (iB == 0) {
            int iL = L(bArr, i2, bVar);
            o0Var.n(i, Long.valueOf(bVar.f9373b));
            return iL;
        }
        if (iB == 1) {
            o0Var.n(i, Long.valueOf(j(bArr, i2)));
            return i2 + 8;
        }
        if (iB == 2) {
            int I = I(bArr, i2, bVar);
            int i4 = bVar.f9372a;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - I) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                o0Var.n(i, ByteString.EMPTY);
            } else {
                o0Var.n(i, ByteString.copyFrom(bArr, I, i4));
            }
            return I + i4;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            o0Var.n(i, Integer.valueOf(h(bArr, i2)));
            return i2 + 4;
        }
        o0 o0VarL = o0.l();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            int I2 = I(bArr, i2, bVar);
            int i7 = bVar.f9372a;
            if (i7 == i5) {
                i6 = i7;
                i2 = I2;
                break;
            }
            i6 = i7;
            i2 = G(i7, bArr, I2, i3, o0VarL, bVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        o0Var.n(i, o0VarL);
        return i2;
    }

    public static int H(int i, byte[] bArr, int i2, b bVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            bVar.f9372a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            bVar.f9372a = i5 | (b3 << HMProSyncDataBaseProfile.DATA_TYPE_COACHING);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            bVar.f9372a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            bVar.f9372a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                bVar.f9372a = i11;
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
        bVar.f9372a = b2;
        return i2;
    }

    public static int J(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) {
        r rVar = (r) iVar;
        int I = I(bArr, i2, bVar);
        rVar.Q(bVar.f9372a);
        while (I < i3) {
            int I2 = I(bArr, I, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            I = I(bArr, I2, bVar);
            rVar.Q(bVar.f9372a);
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
        bVar.f9373b = j2;
        return i2;
    }

    public static int L(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return K(j, bArr, i2, bVar);
        }
        bVar.f9373b = j;
        return i2;
    }

    public static int M(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        int iL = L(bArr, i2, bVar);
        xVar.i(bVar.f9373b);
        while (iL < i3) {
            int I = I(bArr, iL, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            iL = L(bArr, I, bVar);
            xVar.i(bVar.f9373b);
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
            return I(bArr, i2, bVar) + bVar.f9372a;
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
            i5 = bVar.f9372a;
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

    public static int a(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) {
        f fVar = (f) iVar;
        int iL = L(bArr, i2, bVar);
        fVar.p(bVar.f9373b != 0);
        while (iL < i3) {
            int I = I(bArr, iL, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            iL = L(bArr, I, bVar);
            fVar.p(bVar.f9373b != 0);
        }
        return iL;
    }

    public static int b(byte[] bArr, int i, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a;
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

    public static int c(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i2, bVar);
        int i4 = bVar.f9372a;
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
            if (i != bVar.f9372a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i5 = bVar.f9372a;
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

    public static int e(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) {
        j jVar = (j) iVar;
        jVar.h(d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            jVar.h(d(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int f(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.c<?, ?> cVar, GeneratedMessageLite.e<?, ?> eVar, n0<o0, o0> n0Var, b bVar) throws IOException {
        Object objI;
        p<GeneratedMessageLite.d> pVar = cVar.extensions;
        int i4 = i >>> 3;
        Object objValueOf = null;
        if (eVar.f9366b.isRepeated() && eVar.f9366b.isPacked()) {
            switch (a.f9371a[eVar.a().ordinal()]) {
                case 1:
                    j jVar = new j();
                    int iS = s(bArr, i2, jVar, bVar);
                    pVar.w(eVar.f9366b, jVar);
                    return iS;
                case 2:
                    q qVar = new q();
                    int iV = v(bArr, i2, qVar, bVar);
                    pVar.w(eVar.f9366b, qVar);
                    return iV;
                case 3:
                case 4:
                    x xVar = new x();
                    int iZ = z(bArr, i2, xVar, bVar);
                    pVar.w(eVar.f9366b, xVar);
                    return iZ;
                case 5:
                case 6:
                    r rVar = new r();
                    int iY = y(bArr, i2, rVar, bVar);
                    pVar.w(eVar.f9366b, rVar);
                    return iY;
                case 7:
                case 8:
                    x xVar2 = new x();
                    int iU = u(bArr, i2, xVar2, bVar);
                    pVar.w(eVar.f9366b, xVar2);
                    return iU;
                case 9:
                case 10:
                    r rVar2 = new r();
                    int iT = t(bArr, i2, rVar2, bVar);
                    pVar.w(eVar.f9366b, rVar2);
                    return iT;
                case 11:
                    f fVar = new f();
                    int iR = r(bArr, i2, fVar, bVar);
                    pVar.w(eVar.f9366b, fVar);
                    return iR;
                case 12:
                    r rVar3 = new r();
                    int iW = w(bArr, i2, rVar3, bVar);
                    pVar.w(eVar.f9366b, rVar3);
                    return iW;
                case 13:
                    x xVar3 = new x();
                    int iX = x(bArr, i2, xVar3, bVar);
                    pVar.w(eVar.f9366b, xVar3);
                    return iX;
                case 14:
                    r rVar4 = new r();
                    int iY2 = y(bArr, i2, rVar4, bVar);
                    o0 o0Var = cVar.unknownFields;
                    o0 o0Var2 = (o0) l0.z(i4, rVar4, eVar.f9366b.b(), o0Var != o0.e() ? o0Var : null, n0Var);
                    if (o0Var2 != null) {
                        cVar.unknownFields = o0Var2;
                    }
                    pVar.w(eVar.f9366b, rVar4);
                    return iY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f9366b.getLiteType());
            }
        }
        if (eVar.a() != WireFormat.FieldType.ENUM) {
            switch (a.f9371a[eVar.a().ordinal()]) {
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
                    objValueOf = Long.valueOf(bVar.f9373b);
                    break;
                case 5:
                case 6:
                    i2 = I(bArr, i2, bVar);
                    objValueOf = Integer.valueOf(bVar.f9372a);
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
                    objValueOf = Boolean.valueOf(bVar.f9373b != 0);
                    break;
                case 12:
                    i2 = I(bArr, i2, bVar);
                    objValueOf = Integer.valueOf(g.b(bVar.f9372a));
                    break;
                case 13:
                    i2 = L(bArr, i2, bVar);
                    objValueOf = Long.valueOf(g.c(bVar.f9373b));
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
                    i2 = n(wdi.a().d(eVar.b().getClass()), bArr, i2, i3, (i4 << 3) | 4, bVar);
                    objValueOf = bVar.c;
                    break;
                case 18:
                    i2 = p(wdi.a().d(eVar.b().getClass()), bArr, i2, i3, bVar);
                    objValueOf = bVar.c;
                    break;
            }
        } else {
            i2 = I(bArr, i2, bVar);
            if (eVar.f9366b.b().findValueByNumber(bVar.f9372a) == null) {
                o0 o0VarL = cVar.unknownFields;
                if (o0VarL == o0.e()) {
                    o0VarL = o0.l();
                    cVar.unknownFields = o0VarL;
                }
                l0.L(i4, bVar.f9372a, o0VarL, n0Var);
                return i2;
            }
            objValueOf = Integer.valueOf(bVar.f9372a);
        }
        if (eVar.d()) {
            pVar.a(eVar.f9366b, objValueOf);
        } else {
            int i5 = a.f9371a[eVar.a().ordinal()];
            if ((i5 == 17 || i5 == 18) && (objI = pVar.i(eVar.f9366b)) != null) {
                objValueOf = s.h(objI, objValueOf);
            }
            pVar.w(eVar.f9366b, objValueOf);
        }
        return i2;
    }

    public static int g(int i, byte[] bArr, int i2, int i3, Object obj, b0 b0Var, n0<o0, o0> n0Var, b bVar) throws IOException {
        GeneratedMessageLite.e eVarA = bVar.d.a(b0Var, i >>> 3);
        if (eVarA == null) {
            return G(i, bArr, i2, i3, d0.t(obj), bVar);
        }
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) obj;
        cVar.C();
        return f(i, bArr, i2, i3, cVar, eVarA, n0Var, bVar);
    }

    public static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int i(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) {
        r rVar = (r) iVar;
        rVar.Q(h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            rVar.Q(h(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    public static long j(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int k(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        xVar.i(j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            xVar.i(j(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    public static float l(byte[] bArr, int i) {
        return Float.intBitsToFloat(h(bArr, i));
    }

    public static int m(int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) {
        q qVar = (q) iVar;
        qVar.J(l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = I(bArr, i4, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            qVar.J(l(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    public static int n(k0 k0Var, byte[] bArr, int i, int i2, int i3, b bVar) throws IOException {
        d0 d0Var = (d0) k0Var;
        Object objE = d0Var.e();
        int iA0 = d0Var.a0(objE, bArr, i, i2, i3, bVar);
        d0Var.c(objE);
        bVar.c = objE;
        return iA0;
    }

    public static int o(k0 k0Var, int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int iN = n(k0Var, bArr, i2, i3, i4, bVar);
        iVar.add(bVar.c);
        while (iN < i3) {
            int I = I(bArr, iN, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            iN = n(k0Var, bArr, I, i3, i4, bVar);
            iVar.add(bVar.c);
        }
        return iN;
    }

    public static int p(k0 k0Var, byte[] bArr, int i, int i2, b bVar) throws IOException {
        int iH = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iH = H(i3, bArr, iH, bVar);
            i3 = bVar.f9372a;
        }
        int i4 = iH;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        Object objE = k0Var.e();
        int i5 = i3 + i4;
        k0Var.f(objE, bArr, i4, i5, bVar);
        k0Var.c(objE);
        bVar.c = objE;
        return i5;
    }

    public static int q(k0<?> k0Var, int i, byte[] bArr, int i2, int i3, s.i<?> iVar, b bVar) throws IOException {
        int iP = p(k0Var, bArr, i2, i3, bVar);
        iVar.add(bVar.c);
        while (iP < i3) {
            int I = I(bArr, iP, bVar);
            if (i != bVar.f9372a) {
                break;
            }
            iP = p(k0Var, bArr, I, i3, bVar);
            iVar.add(bVar.c);
        }
        return iP;
    }

    public static int r(byte[] bArr, int i, s.i<?> iVar, b bVar) throws IOException {
        f fVar = (f) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            fVar.p(bVar.f9373b != 0);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int s(byte[] bArr, int i, s.i<?> iVar, b bVar) throws IOException {
        j jVar = (j) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a + I;
        while (I < i2) {
            jVar.h(d(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int t(byte[] bArr, int i, s.i<?> iVar, b bVar) throws IOException {
        r rVar = (r) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a + I;
        while (I < i2) {
            rVar.Q(h(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int u(byte[] bArr, int i, s.i<?> iVar, b bVar) throws IOException {
        x xVar = (x) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a + I;
        while (I < i2) {
            xVar.i(j(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int v(byte[] bArr, int i, s.i<?> iVar, b bVar) throws IOException {
        q qVar = (q) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a + I;
        while (I < i2) {
            qVar.J(l(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int w(byte[] bArr, int i, s.i<?> iVar, b bVar) throws IOException {
        r rVar = (r) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a + I;
        while (I < i2) {
            I = I(bArr, I, bVar);
            rVar.Q(g.b(bVar.f9372a));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int x(byte[] bArr, int i, s.i<?> iVar, b bVar) throws IOException {
        x xVar = (x) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            xVar.i(g.c(bVar.f9373b));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int y(byte[] bArr, int i, s.i<?> iVar, b bVar) throws IOException {
        r rVar = (r) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a + I;
        while (I < i2) {
            I = I(bArr, I, bVar);
            rVar.Q(bVar.f9372a);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int z(byte[] bArr, int i, s.i<?> iVar, b bVar) throws IOException {
        x xVar = (x) iVar;
        int I = I(bArr, i, bVar);
        int i2 = bVar.f9372a + I;
        while (I < i2) {
            I = L(bArr, I, bVar);
            xVar.i(bVar.f9373b);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
