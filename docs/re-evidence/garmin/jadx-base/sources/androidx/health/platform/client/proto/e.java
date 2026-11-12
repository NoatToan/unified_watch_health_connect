package androidx.health.platform.client.proto;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7581a;

        static {
            int[] iArr = new int[b3.values().length];
            f7581a = iArr;
            try {
                iArr[b3.f7540c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7581a[b3.f7541d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7581a[b3.f7542e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7581a[b3.f7543f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7581a[b3.f7544g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7581a[b3.f7552o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7581a[b3.f7545h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7581a[b3.f7555r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7581a[b3.f7546i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7581a[b3.f7554q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7581a[b3.f7547j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7581a[b3.f7556t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7581a[b3.f7557v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7581a[b3.f7553p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7581a[b3.f7551n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7581a[b3.f7548k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7581a[b3.f7549l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7581a[b3.f7550m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private e() {
    }

    public static int a(byte[] bArr, int i14, b bVar) throws InvalidProtocolBufferException {
        int iQ = q(bArr, i14, bVar);
        int i15 = bVar.f7582a;
        if (i15 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i15 > bArr.length - iQ) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i15 == 0) {
            bVar.f7584c = i.f7657b;
            return iQ;
        }
        bVar.f7584c = i.c(iQ, i15, bArr);
        return iQ + i15;
    }

    public static int b(byte[] bArr, int i14) {
        return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static long c(byte[] bArr, int i14) {
        return ((((long) bArr[i14 + 7]) & 255) << 56) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48);
    }

    public static int d(n2 n2Var, byte[] bArr, int i14, int i15, b bVar) throws InvalidProtocolBufferException {
        Object objNewInstance = n2Var.newInstance();
        int iU = u(objNewInstance, n2Var, bArr, i14, i15, bVar);
        n2Var.makeImmutable(objNewInstance);
        bVar.f7584c = objNewInstance;
        return iU;
    }

    public static int e(n2<?> n2Var, int i14, byte[] bArr, int i15, int i16, l0.d<?> dVar, b bVar) throws InvalidProtocolBufferException {
        int iD = d(n2Var, bArr, i15, i16, bVar);
        dVar.add(bVar.f7584c);
        while (iD < i16) {
            int iQ = q(bArr, iD, bVar);
            if (i14 != bVar.f7582a) {
                break;
            }
            iD = d(n2Var, bArr, iQ, i16, bVar);
            dVar.add(bVar.f7584c);
        }
        return iD;
    }

    public static int f(byte[] bArr, int i14, l0.d<?> dVar, b bVar) throws InvalidProtocolBufferException {
        f fVar = (f) dVar;
        int iQ = q(bArr, i14, bVar);
        int i15 = bVar.f7582a + iQ;
        while (iQ < i15) {
            iQ = s(bArr, iQ, bVar);
            fVar.addBoolean(bVar.f7583b != 0);
        }
        if (iQ == i15) {
            return iQ;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int g(byte[] bArr, int i14, l0.d<?> dVar, b bVar) throws InvalidProtocolBufferException {
        v vVar = (v) dVar;
        int iQ = q(bArr, i14, bVar);
        int i15 = bVar.f7582a + iQ;
        while (iQ < i15) {
            vVar.addDouble(Double.longBitsToDouble(c(bArr, iQ)));
            iQ += 8;
        }
        if (iQ == i15) {
            return iQ;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int h(byte[] bArr, int i14, l0.d<?> dVar, b bVar) throws InvalidProtocolBufferException {
        k0 k0Var = (k0) dVar;
        int iQ = q(bArr, i14, bVar);
        int i15 = bVar.f7582a + iQ;
        while (iQ < i15) {
            k0Var.addInt(b(bArr, iQ));
            iQ += 4;
        }
        if (iQ == i15) {
            return iQ;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int i(byte[] bArr, int i14, l0.d<?> dVar, b bVar) throws InvalidProtocolBufferException {
        t0 t0Var = (t0) dVar;
        int iQ = q(bArr, i14, bVar);
        int i15 = bVar.f7582a + iQ;
        while (iQ < i15) {
            t0Var.addLong(c(bArr, iQ));
            iQ += 8;
        }
        if (iQ == i15) {
            return iQ;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int j(byte[] bArr, int i14, l0.d<?> dVar, b bVar) throws InvalidProtocolBufferException {
        h0 h0Var = (h0) dVar;
        int iQ = q(bArr, i14, bVar);
        int i15 = bVar.f7582a + iQ;
        while (iQ < i15) {
            h0Var.addFloat(Float.intBitsToFloat(b(bArr, iQ)));
            iQ += 4;
        }
        if (iQ == i15) {
            return iQ;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int k(byte[] bArr, int i14, l0.d<?> dVar, b bVar) throws InvalidProtocolBufferException {
        k0 k0Var = (k0) dVar;
        int iQ = q(bArr, i14, bVar);
        int i15 = bVar.f7582a + iQ;
        while (iQ < i15) {
            iQ = q(bArr, iQ, bVar);
            k0Var.addInt(j.b(bVar.f7582a));
        }
        if (iQ == i15) {
            return iQ;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int l(byte[] bArr, int i14, l0.d<?> dVar, b bVar) throws InvalidProtocolBufferException {
        t0 t0Var = (t0) dVar;
        int iQ = q(bArr, i14, bVar);
        int i15 = bVar.f7582a + iQ;
        while (iQ < i15) {
            iQ = s(bArr, iQ, bVar);
            t0Var.addLong(j.c(bVar.f7583b));
        }
        if (iQ == i15) {
            return iQ;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int m(byte[] bArr, int i14, l0.d<?> dVar, b bVar) throws InvalidProtocolBufferException {
        k0 k0Var = (k0) dVar;
        int iQ = q(bArr, i14, bVar);
        int i15 = bVar.f7582a + iQ;
        while (iQ < i15) {
            iQ = q(bArr, iQ, bVar);
            k0Var.addInt(bVar.f7582a);
        }
        if (iQ == i15) {
            return iQ;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int n(byte[] bArr, int i14, b bVar) throws InvalidProtocolBufferException {
        int iQ = q(bArr, i14, bVar);
        int i15 = bVar.f7582a;
        if (i15 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i15 == 0) {
            bVar.f7584c = "";
            return iQ;
        }
        bVar.f7584c = new String(bArr, iQ, i15, l0.f7708a);
        return iQ + i15;
    }

    public static int o(int i14, byte[] bArr, int i15, int i16, w2 w2Var, b bVar) throws InvalidProtocolBufferException {
        if ((i14 >>> 3) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i17 = i14 & 7;
        if (i17 == 0) {
            int iS = s(bArr, i15, bVar);
            w2Var.e(i14, Long.valueOf(bVar.f7583b));
            return iS;
        }
        if (i17 == 1) {
            w2Var.e(i14, Long.valueOf(c(bArr, i15)));
            return i15 + 8;
        }
        if (i17 == 2) {
            int iQ = q(bArr, i15, bVar);
            int i18 = bVar.f7582a;
            if (i18 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i18 > bArr.length - iQ) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i18 == 0) {
                w2Var.e(i14, i.f7657b);
            } else {
                w2Var.e(i14, i.c(iQ, i18, bArr));
            }
            return iQ + i18;
        }
        if (i17 != 3) {
            if (i17 != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            w2Var.e(i14, Integer.valueOf(b(bArr, i15)));
            return i15 + 4;
        }
        w2 w2VarD = w2.d();
        int i19 = (i14 & (-8)) | 4;
        int i24 = bVar.f7586e + 1;
        bVar.f7586e = i24;
        if (i24 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i25 = 0;
        while (i15 < i16) {
            int iQ2 = q(bArr, i15, bVar);
            i25 = bVar.f7582a;
            if (i25 == i19) {
                i15 = iQ2;
                break;
            }
            i15 = o(i25, bArr, iQ2, i16, w2VarD, bVar);
        }
        bVar.f7586e--;
        if (i15 > i16 || i25 != i19) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        w2Var.e(i14, w2VarD);
        return i15;
    }

    public static int p(int i14, byte[] bArr, int i15, b bVar) {
        int i16 = i14 & 127;
        int i17 = i15 + 1;
        byte b14 = bArr[i15];
        if (b14 >= 0) {
            bVar.f7582a = i16 | (b14 << 7);
            return i17;
        }
        int i18 = i16 | ((b14 & Ascii.DEL) << 7);
        int i19 = i15 + 2;
        byte b15 = bArr[i17];
        if (b15 >= 0) {
            bVar.f7582a = i18 | (b15 << Ascii.SO);
            return i19;
        }
        int i24 = i18 | ((b15 & Ascii.DEL) << 14);
        int i25 = i15 + 3;
        byte b16 = bArr[i19];
        if (b16 >= 0) {
            bVar.f7582a = i24 | (b16 << Ascii.NAK);
            return i25;
        }
        int i26 = i24 | ((b16 & Ascii.DEL) << 21);
        int i27 = i15 + 4;
        byte b17 = bArr[i25];
        if (b17 >= 0) {
            bVar.f7582a = i26 | (b17 << Ascii.FS);
            return i27;
        }
        int i28 = i26 | ((b17 & Ascii.DEL) << 28);
        while (true) {
            int i29 = i27 + 1;
            if (bArr[i27] >= 0) {
                bVar.f7582a = i28;
                return i29;
            }
            i27 = i29;
        }
    }

    public static int q(byte[] bArr, int i14, b bVar) {
        int i15 = i14 + 1;
        byte b14 = bArr[i14];
        if (b14 < 0) {
            return p(b14, bArr, i15, bVar);
        }
        bVar.f7582a = b14;
        return i15;
    }

    public static int r(int i14, byte[] bArr, int i15, int i16, l0.d<?> dVar, b bVar) {
        k0 k0Var = (k0) dVar;
        int iQ = q(bArr, i15, bVar);
        k0Var.addInt(bVar.f7582a);
        while (iQ < i16) {
            int iQ2 = q(bArr, iQ, bVar);
            if (i14 != bVar.f7582a) {
                break;
            }
            iQ = q(bArr, iQ2, bVar);
            k0Var.addInt(bVar.f7582a);
        }
        return iQ;
    }

    public static int s(byte[] bArr, int i14, b bVar) {
        int i15 = i14 + 1;
        long j8 = bArr[i14];
        if (j8 >= 0) {
            bVar.f7583b = j8;
            return i15;
        }
        int i16 = i14 + 2;
        byte b14 = bArr[i15];
        long j14 = (j8 & 127) | (((long) (b14 & Ascii.DEL)) << 7);
        int i17 = 7;
        while (b14 < 0) {
            int i18 = i16 + 1;
            byte b15 = bArr[i16];
            i17 += 7;
            j14 |= ((long) (b15 & Ascii.DEL)) << i17;
            b14 = b15;
            i16 = i18;
        }
        bVar.f7583b = j14;
        return i16;
    }

    public static int t(Object obj, n2 n2Var, byte[] bArr, int i14, int i15, int i16, b bVar) throws InvalidProtocolBufferException {
        f1 f1Var = (f1) n2Var;
        int i17 = bVar.f7586e + 1;
        bVar.f7586e = i17;
        if (i17 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iD = f1Var.D(obj, bArr, i14, i15, i16, bVar);
        bVar.f7586e--;
        bVar.f7584c = obj;
        return iD;
    }

    public static int u(Object obj, n2 n2Var, byte[] bArr, int i14, int i15, b bVar) throws InvalidProtocolBufferException {
        int iP = i14 + 1;
        int i16 = bArr[i14];
        if (i16 < 0) {
            iP = p(i16, bArr, iP, bVar);
            i16 = bVar.f7582a;
        }
        int i17 = iP;
        if (i16 < 0 || i16 > i15 - i17) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i18 = bVar.f7586e + 1;
        bVar.f7586e = i18;
        if (i18 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i19 = i17 + i16;
        n2Var.a(obj, bArr, i17, i19, bVar);
        bVar.f7586e--;
        bVar.f7584c = obj;
        return i19;
    }

    public static int v(int i14, byte[] bArr, int i15, int i16, b bVar) throws InvalidProtocolBufferException {
        if ((i14 >>> 3) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i17 = i14 & 7;
        if (i17 == 0) {
            return s(bArr, i15, bVar);
        }
        if (i17 == 1) {
            return i15 + 8;
        }
        if (i17 == 2) {
            return q(bArr, i15, bVar) + bVar.f7582a;
        }
        if (i17 != 3) {
            if (i17 == 5) {
                return i15 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i18 = (i14 & (-8)) | 4;
        int i19 = 0;
        while (i15 < i16) {
            i15 = q(bArr, i15, bVar);
            i19 = bVar.f7582a;
            if (i19 == i18) {
                break;
            }
            i15 = v(i19, bArr, i15, i16, bVar);
        }
        if (i15 > i16 || i19 != i18) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i15;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f7583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f7584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a0 f7585d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7586e;

        public b() {
            this.f7585d = a0.a();
        }

        public b(a0 a0Var) {
            a0Var.getClass();
            this.f7585d = a0Var;
        }
    }
}
