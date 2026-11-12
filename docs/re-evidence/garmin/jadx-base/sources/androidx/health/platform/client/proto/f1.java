package androidx.health.platform.client.proto;

import i3.e5;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class f1<T> implements n2<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f7610q = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Unsafe f7611r = y2.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f7612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f7613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c1 f7616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f7620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h1 f7623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q0 f7624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v2<?, ?> f7625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0<?> f7626o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x0 f7627p;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7628a;

        static {
            int[] iArr = new int[b3.values().length];
            f7628a = iArr;
            try {
                iArr[b3.f7547j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7628a[b3.f7551n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7628a[b3.f7540c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7628a[b3.f7546i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7628a[b3.f7554q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7628a[b3.f7545h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7628a[b3.f7555r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7628a[b3.f7541d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7628a[b3.f7553p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7628a[b3.f7544g.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7628a[b3.f7552o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7628a[b3.f7542e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7628a[b3.f7543f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7628a[b3.f7550m.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7628a[b3.f7556t.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7628a[b3.f7557v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7628a[b3.f7548k.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private f1(int[] iArr, Object[] objArr, int i14, int i15, c1 c1Var, q1 q1Var, boolean z14, int[] iArr2, int i16, int i17, h1 h1Var, q0 q0Var, v2<?, ?> v2Var, b0<?> b0Var, x0 x0Var) {
        this.f7612a = iArr;
        this.f7613b = objArr;
        this.f7614c = i14;
        this.f7615d = i15;
        this.f7618g = c1Var instanceof j0;
        this.f7617f = b0Var != null && b0Var.e(c1Var);
        this.f7619h = z14;
        this.f7620i = iArr2;
        this.f7621j = i16;
        this.f7622k = i17;
        this.f7623l = h1Var;
        this.f7624m = q0Var;
        this.f7625n = v2Var;
        this.f7626o = b0Var;
        this.f7616e = c1Var;
        this.f7627p = x0Var;
    }

    public static <T> int A(T t7, long j8) {
        return ((Integer) y2.f7815c.i(t7, j8)).intValue();
    }

    public static <T> long B(T t7, long j8) {
        return ((Long) y2.f7815c.i(t7, j8)).longValue();
    }

    public static Field K(Class<?> cls, String str) {
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
            androidx.core.view.j.o(cls, sbL, " not found. Known fields are ");
            sbL.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbL.toString());
        }
    }

    public static int Q(int i14) {
        return (i14 & 267386880) >>> 20;
    }

    public static void U(int i14, Object obj, d3 d3Var) {
        if (obj instanceof String) {
            ((l) d3Var).f7707a.x(i14, (String) obj);
        } else {
            ((l) d3Var).b(i14, (i) obj);
        }
    }

    public static void h(Object obj) {
        if (q(obj)) {
            return;
        }
        vb.h.s(e5.f(obj, "Mutating immutable message: "));
    }

    public static int i(byte[] bArr, int i14, int i15, b3 b3Var, Class cls, e.b bVar) throws InvalidProtocolBufferException {
        switch (a.f7628a[b3Var.ordinal()]) {
            case 1:
                int iS = e.s(bArr, i14, bVar);
                bVar.f7584c = Boolean.valueOf(bVar.f7583b != 0);
                return iS;
            case 2:
                return e.a(bArr, i14, bVar);
            case 3:
                bVar.f7584c = Double.valueOf(Double.longBitsToDouble(e.c(bArr, i14)));
                return i14 + 8;
            case 4:
            case 5:
                bVar.f7584c = Integer.valueOf(e.b(bArr, i14));
                return i14 + 4;
            case 6:
            case 7:
                bVar.f7584c = Long.valueOf(e.c(bArr, i14));
                return i14 + 8;
            case 8:
                bVar.f7584c = Float.valueOf(Float.intBitsToFloat(e.b(bArr, i14)));
                return i14 + 4;
            case 9:
            case 10:
            case 11:
                int iQ = e.q(bArr, i14, bVar);
                bVar.f7584c = Integer.valueOf(bVar.f7582a);
                return iQ;
            case 12:
            case 13:
                int iS2 = e.s(bArr, i14, bVar);
                bVar.f7584c = Long.valueOf(bVar.f7583b);
                return iS2;
            case 14:
                return e.d(r1.f7767c.a(cls), bArr, i14, i15, bVar);
            case 15:
                int iQ2 = e.q(bArr, i14, bVar);
                bVar.f7584c = Integer.valueOf(j.b(bVar.f7582a));
                return iQ2;
            case 16:
                int iS3 = e.s(bArr, i14, bVar);
                bVar.f7584c = Long.valueOf(j.c(bVar.f7583b));
                return iS3;
            case 17:
                int iQ3 = e.q(bArr, i14, bVar);
                int i16 = bVar.f7582a;
                if (i16 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if (i16 == 0) {
                    bVar.f7584c = "";
                    return iQ3;
                }
                bVar.f7584c = z2.f7824a.a(bArr, iQ3, i16);
                return iQ3 + i16;
            default:
                kg.f.n("unsupported field type.");
                return 0;
        }
    }

    public static w2 n(Object obj) {
        j0 j0Var = (j0) obj;
        w2 w2Var = j0Var.unknownFields;
        if (w2Var != w2.f7807f) {
            return w2Var;
        }
        w2 w2VarD = w2.d();
        j0Var.unknownFields = w2VarD;
        return w2VarD;
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof j0) {
            return ((j0) obj).m();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Code duplicated, block: B:75:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0157  */
    /* JADX WARN: Code duplicated, block: B:79:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x015e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0167  */
    /* JADX WARN: Code duplicated, block: B:83:0x016b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:92:0x018b  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a4  */
    public static f1 x(a1 a1Var, h1 h1Var, q0 q0Var, v2 v2Var, b0 b0Var, x0 x0Var) {
        int i14;
        int i15;
        l0.c cVar;
        Object[] objArr;
        int[] iArr;
        int[] iArr2;
        int iJ;
        int i16;
        int i17;
        int iNumberOfTrailingZeros;
        int i18;
        int i19;
        int i24;
        Class<?> type;
        Object obj;
        char c14;
        boolean z14;
        int i25;
        int i26;
        if (a1Var instanceof t1) {
            return y((t1) a1Var, h1Var, q0Var, v2Var, b0Var, x0Var);
        }
        r2 r2Var = (r2) a1Var;
        e0[] e0VarArr = r2Var.f7773d;
        if (e0VarArr.length == 0) {
            i14 = 0;
            i15 = 0;
        } else {
            i14 = e0VarArr[0].f7590d;
            i15 = e0VarArr[e0VarArr.length - 1].f7590d;
        }
        int length = e0VarArr.length;
        int[] iArr3 = new int[length * 3];
        Object[] objArr2 = new Object[length * 2];
        int i27 = 0;
        int i28 = 0;
        for (e0 e0Var : e0VarArr) {
            g0 g0Var = e0Var.f7588b;
            if (g0Var == g0.f7635i) {
                i27++;
            } else {
                int i29 = g0Var.f7638a;
                if (i29 >= 18 && i29 <= 49) {
                    i28++;
                }
            }
        }
        int[] iArr4 = i27 > 0 ? new int[i27] : null;
        int[] iArr5 = i28 > 0 ? new int[i28] : null;
        int[] iArr6 = r2Var.f7772c;
        int[] iArr7 = f7610q;
        if (iArr6 == null) {
            iArr6 = iArr7;
        }
        int i30 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        while (i35 < e0VarArr.length) {
            e0 e0Var2 = e0VarArr[i35];
            int i38 = e0Var2.f7590d;
            g0 g0Var2 = e0Var2.f7588b;
            e0[] e0VarArr2 = e0VarArr;
            Field field = e0Var2.f7587a;
            int i39 = i14;
            k1 k1Var = e0Var2.f7595i;
            int i44 = i15;
            l0.c cVar2 = e0Var2.f7599m;
            if (k1Var != null) {
                cVar = cVar2;
                int i45 = g0Var2.f7638a + 51;
                Field field2 = k1Var.f7706b;
                objArr = objArr2;
                y2.e eVar = y2.f7815c;
                iArr = iArr4;
                iArr2 = iArr5;
                int iJ2 = (int) eVar.j(field2);
                iJ = (int) eVar.j(k1Var.f7705a);
                i16 = iJ2;
                i17 = i45;
            } else {
                cVar = cVar2;
                objArr = objArr2;
                iArr = iArr4;
                iArr2 = iArr5;
                y2.e eVar2 = y2.f7815c;
                int iJ3 = (int) eVar2.j(field);
                int i46 = g0Var2.f7638a;
                g0.b bVar = g0Var2.f7639b;
                if (bVar.f7647a || bVar == g0.b.MAP) {
                    Field field3 = e0Var2.f7596j;
                    if (field3 == null) {
                        i16 = iJ3;
                        i17 = i46;
                        iJ = 0;
                    } else {
                        iJ = (int) eVar2.j(field3);
                        i16 = iJ3;
                        i17 = i46;
                    }
                } else {
                    Field field4 = e0Var2.f7591e;
                    iJ = field4 == null ? 1048575 : (int) eVar2.j(field4);
                    iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(e0Var2.f7592f);
                    i16 = iJ3;
                    i17 = i46;
                }
                iArr3[i30] = e0Var2.f7590d;
                int i47 = i30 + 1;
                int i48 = iJ;
                if (e0Var2.f7594h) {
                    i18 = 536870912;
                } else {
                    i18 = 0;
                }
                if (e0Var2.f7593g) {
                    i19 = 268435456;
                } else {
                    i19 = 0;
                }
                iArr3[i47] = i18 | i19 | (i17 << 20) | i16;
                iArr3[i30 + 2] = (iNumberOfTrailingZeros << 20) | i48;
                i24 = e0.a.f7600a[g0Var2.ordinal()];
                if (i24 == 1 && i24 != 2) {
                    type = (i24 == 3 || i24 == 4) ? e0Var2.f7589c : null;
                } else if (field != null) {
                    type = field.getType();
                } else {
                    type = e0Var2.f7597k;
                }
                obj = e0Var2.f7598l;
                if (obj != null) {
                    i26 = (i30 / 3) * 2;
                    objArr[i26] = obj;
                    if (type != null) {
                        objArr[i26 + 1] = type;
                    } else if (cVar != null) {
                        objArr[i26 + 1] = cVar;
                    }
                    c14 = 2;
                    z14 = true;
                } else if (type != null) {
                    c14 = 2;
                    z14 = true;
                    objArr[androidx.core.view.j.v(i30, 3, 2, 1)] = type;
                } else {
                    c14 = 2;
                    z14 = true;
                    if (cVar != null) {
                        objArr[androidx.core.view.j.v(i30, 3, 2, 1)] = cVar;
                    }
                }
                if (i34 < iArr6.length && iArr6[i34] == i38) {
                    iArr6[i34] = i30;
                    i34++;
                }
                if (g0Var2 == g0.f7635i) {
                    iArr[i36] = i30;
                    i36++;
                } else {
                    i25 = g0Var2.f7638a;
                    if (i25 < 18 && i25 <= 49) {
                        iArr2[i37] = (int) y2.f7815c.j(field);
                        i37++;
                    }
                }
                i35++;
                i30 += 3;
                e0VarArr = e0VarArr2;
                i14 = i39;
                i15 = i44;
                objArr2 = objArr;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
            iNumberOfTrailingZeros = 0;
            iArr3[i30] = e0Var2.f7590d;
            int i49 = i30 + 1;
            int i410 = iJ;
            if (e0Var2.f7594h) {
                i18 = 536870912;
            } else {
                i18 = 0;
            }
            if (e0Var2.f7593g) {
                i19 = 268435456;
            } else {
                i19 = 0;
            }
            iArr3[i49] = i18 | i19 | (i17 << 20) | i16;
            iArr3[i30 + 2] = (iNumberOfTrailingZeros << 20) | i410;
            i24 = e0.a.f7600a[g0Var2.ordinal()];
            if (i24 == 1) {
                if (field != null) {
                    type = field.getType();
                } else {
                    type = e0Var2.f7597k;
                }
            } else if (field != null) {
                type = field.getType();
            } else {
                type = e0Var2.f7597k;
            }
            obj = e0Var2.f7598l;
            if (obj != null) {
                i26 = (i30 / 3) * 2;
                objArr[i26] = obj;
                if (type != null) {
                    objArr[i26 + 1] = type;
                } else if (cVar != null) {
                    objArr[i26 + 1] = cVar;
                }
                c14 = 2;
                z14 = true;
            } else if (type != null) {
                c14 = 2;
                z14 = true;
                objArr[androidx.core.view.j.v(i30, 3, 2, 1)] = type;
            } else {
                c14 = 2;
                z14 = true;
                if (cVar != null) {
                    objArr[androidx.core.view.j.v(i30, 3, 2, 1)] = cVar;
                }
            }
            if (i34 < iArr6.length) {
                iArr6[i34] = i30;
                i34++;
            }
            if (g0Var2 == g0.f7635i) {
                iArr[i36] = i30;
                i36++;
            } else {
                i25 = g0Var2.f7638a;
                if (i25 < 18) {
                }
            }
            i35++;
            i30 += 3;
            e0VarArr = e0VarArr2;
            i14 = i39;
            i15 = i44;
            objArr2 = objArr;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i54 = i14;
        int i55 = i15;
        Object[] objArr3 = objArr2;
        int[] iArr8 = iArr4;
        int[] iArr9 = iArr5;
        int[] iArr10 = iArr8 == null ? iArr7 : iArr8;
        int[] iArr11 = iArr9 == null ? iArr7 : iArr9;
        int[] iArr12 = new int[iArr6.length + iArr10.length + iArr11.length];
        System.arraycopy(iArr6, 0, iArr12, 0, iArr6.length);
        System.arraycopy(iArr10, 0, iArr12, iArr6.length, iArr10.length);
        System.arraycopy(iArr11, 0, iArr12, iArr6.length + iArr10.length, iArr11.length);
        return new f1(iArr3, objArr3, i54, i55, r2Var.f7774e, r2Var.f7770a, true, iArr12, iArr6.length, iArr6.length + iArr10.length, h1Var, q0Var, v2Var, b0Var, x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:166:0x035c  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ba  */
    public static <T> f1<T> y(t1 t1Var, h1 h1Var, q0 q0Var, v2<?, ?> v2Var, b0<?> b0Var, x0 x0Var) {
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
        Field fieldK;
        char cCharAt9;
        int i47;
        Field fieldK2;
        Field fieldK3;
        int i48;
        char cCharAt10;
        int i49;
        char cCharAt11;
        int i54;
        char cCharAt12;
        int i55;
        char cCharAt13;
        String str = t1Var.f7786b;
        int length = str.length();
        char c15 = 55296;
        if (str.charAt(0) >= 55296) {
            int i56 = 1;
            while (true) {
                i14 = i56 + 1;
                if (str.charAt(i56) < 55296) {
                    break;
                }
                i56 = i14;
            }
        } else {
            i14 = 1;
        }
        int i57 = i14 + 1;
        int iCharAt2 = str.charAt(i14);
        if (iCharAt2 >= 55296) {
            int i58 = iCharAt2 & 8191;
            int i59 = 13;
            while (true) {
                i55 = i57 + 1;
                cCharAt13 = str.charAt(i57);
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
            iArr = f7610q;
            i18 = 0;
        } else {
            int i64 = i57 + 1;
            int iCharAt3 = str.charAt(i57);
            if (iCharAt3 >= 55296) {
                int i65 = iCharAt3 & 8191;
                int i66 = 13;
                while (true) {
                    i35 = i64 + 1;
                    cCharAt8 = str.charAt(i64);
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
            int iCharAt4 = str.charAt(i64);
            if (iCharAt4 >= 55296) {
                int i68 = iCharAt4 & 8191;
                int i69 = 13;
                while (true) {
                    i34 = i67 + 1;
                    cCharAt7 = str.charAt(i67);
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
            int iCharAt5 = str.charAt(i67);
            if (iCharAt5 >= 55296) {
                int i75 = iCharAt5 & 8191;
                int i76 = 13;
                while (true) {
                    i30 = i74 + 1;
                    cCharAt6 = str.charAt(i74);
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
            int iCharAt6 = str.charAt(i74);
            if (iCharAt6 >= 55296) {
                int i78 = iCharAt6 & 8191;
                int i79 = 13;
                while (true) {
                    i29 = i77 + 1;
                    cCharAt5 = str.charAt(i77);
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
            iCharAt = str.charAt(i77);
            if (iCharAt >= 55296) {
                int i85 = iCharAt & 8191;
                int i86 = 13;
                while (true) {
                    i28 = i84 + 1;
                    cCharAt4 = str.charAt(i84);
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
            int iCharAt7 = str.charAt(i84);
            if (iCharAt7 >= 55296) {
                int i88 = iCharAt7 & 8191;
                int i89 = 13;
                while (true) {
                    i27 = i87 + 1;
                    cCharAt3 = str.charAt(i87);
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
            int iCharAt8 = str.charAt(i87);
            if (iCharAt8 >= 55296) {
                int i94 = iCharAt8 & 8191;
                int i95 = 13;
                while (true) {
                    i26 = i93 + 1;
                    cCharAt2 = str.charAt(i93);
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
            int iCharAt9 = str.charAt(i93);
            if (iCharAt9 >= 55296) {
                int i97 = iCharAt9 & 8191;
                int i98 = 13;
                while (true) {
                    i25 = i96 + 1;
                    cCharAt = str.charAt(i96);
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
        Unsafe unsafe = f7611r;
        Object[] objArr = t1Var.f7787c;
        Class<?> cls = t1Var.f7785a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i100 = i19 + i17;
        int i101 = i100;
        int i102 = i19;
        int i103 = 0;
        int i104 = 0;
        while (i57 < length) {
            int i105 = i57 + 1;
            int iCharAt10 = str.charAt(i57);
            if (iCharAt10 >= c15) {
                int i106 = iCharAt10 & 8191;
                int i107 = i105;
                int i108 = 13;
                while (true) {
                    i54 = i107 + 1;
                    cCharAt12 = str.charAt(i107);
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
            int iCharAt11 = str.charAt(i36);
            if (iCharAt11 >= c15) {
                int i110 = iCharAt11 & 8191;
                int i111 = i109;
                int i112 = 13;
                while (true) {
                    i49 = i111 + 1;
                    cCharAt11 = str.charAt(i111);
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
                int iCharAt12 = str.charAt(i38);
                char c16 = 55296;
                if (iCharAt12 >= 55296) {
                    int i116 = iCharAt12 & 8191;
                    int i117 = 13;
                    while (true) {
                        i48 = i115 + 1;
                        cCharAt10 = str.charAt(i115);
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
                    objArr2[androidx.core.view.j.v(i103, 3, 2, 1)] = objArr[i15];
                    i15++;
                } else if (i118 == 12 && (t1Var.getSyntax().equals(q1.PROTO2) || (iCharAt11 & 2048) != 0)) {
                    objArr2[androidx.core.view.j.v(i103, 3, 2, 1)] = objArr[i15];
                    i15++;
                }
                int i120 = i119 * 2;
                Object obj = objArr[i120];
                if (obj instanceof Field) {
                    fieldK2 = (Field) obj;
                } else {
                    fieldK2 = K(cls, (String) obj);
                    objArr[i120] = fieldK2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldK2);
                int i121 = i120 + 1;
                Object obj2 = objArr[i121];
                if (obj2 instanceof Field) {
                    fieldK3 = (Field) obj2;
                } else {
                    fieldK3 = K(cls, (String) obj2);
                    objArr[i121] = fieldK3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldK3);
                i100 = i100;
                i57 = i115;
                iObjectFieldOffset = iObjectFieldOffset3;
                c14 = 2;
                str = str;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i39 = i18;
                i44 = i15;
                i46 = 0;
            } else {
                int i122 = i15 + 1;
                Field fieldK4 = K(cls, (String) objArr[i15]);
                if (i113 == 9 || i113 == 17) {
                    i39 = i18;
                    objArr2[androidx.core.view.j.v(i103, 3, 2, 1)] = fieldK4.getType();
                } else {
                    if (i113 == 27 || i113 == 49) {
                        i39 = i18;
                        i47 = i15 + 2;
                        objArr2[androidx.core.view.j.v(i103, 3, 2, 1)] = objArr[i122];
                    } else if (i113 == 12 || i113 == 30 || i113 == 44) {
                        i39 = i18;
                        if (t1Var.getSyntax() == q1.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i47 = i15 + 2;
                            objArr2[androidx.core.view.j.v(i103, 3, 2, 1)] = objArr[i122];
                        }
                    } else {
                        if (i113 == 50) {
                            int i123 = i102 + 1;
                            iArr[i102] = i103;
                            int i124 = (i103 / 3) * 2;
                            int i125 = i15 + 2;
                            objArr2[i124] = objArr[i122];
                            if ((iCharAt11 & 2048) != 0) {
                                objArr2[i124 + 1] = objArr[i125];
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                        if ((iCharAt11 & 4096) != 0 || i113 > 17) {
                            c14 = 2;
                            iObjectFieldOffset2 = 1048575;
                            i45 = i38;
                            i46 = 0;
                        } else {
                            int i126 = i38 + 1;
                            int iCharAt13 = str.charAt(i38);
                            if (iCharAt13 >= 55296) {
                                int i127 = iCharAt13 & 8191;
                                int i128 = 13;
                                while (true) {
                                    i45 = i126 + 1;
                                    cCharAt9 = str.charAt(i126);
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
                            Object obj3 = objArr[i129];
                            if (obj3 instanceof Field) {
                                fieldK = (Field) obj3;
                            } else {
                                fieldK = K(cls, (String) obj3);
                                objArr[i129] = fieldK;
                            }
                            int i130 = iCharAt13;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK);
                            i46 = i130 % 32;
                        }
                        if (i113 >= 18 && i113 <= 49) {
                            iArr[i101] = iObjectFieldOffset;
                            i101++;
                        }
                        i57 = i45;
                    }
                    i44 = i47;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
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
            iArr4[i131] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i113 << 20) | iObjectFieldOffset;
            i103 += 3;
            iArr4[i132] = (i46 << 20) | i133;
            i15 = i44;
            str = str;
            i100 = i100;
            iArr3 = iArr4;
            i18 = i39;
            length = i37;
            c15 = 55296;
        }
        return new f1<>(iArr3, objArr2, i16, i24, t1Var.f7785a, t1Var.getSyntax(), false, iArr, i19, i100, h1Var, q0Var, v2Var, b0Var, x0Var);
    }

    public static long z(int i14) {
        return i14 & 1048575;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> int C(T t7, byte[] bArr, int i14, int i15, int i16, long j8, e.b bVar) throws InvalidProtocolBufferException {
        int i17;
        Unsafe unsafe = f7611r;
        Object objL = l(i16);
        Object object = unsafe.getObject(t7, j8);
        x0 x0Var = this.f7627p;
        if (x0Var.isImmutable(object)) {
            w0 w0VarA = x0Var.a();
            x0Var.mergeFrom(w0VarA, object);
            unsafe.putObject(t7, j8, w0VarA);
            object = w0VarA;
        }
        v0.a<?, ?> aVarForMapMetadata = x0Var.forMapMetadata(objL);
        w0 w0VarForMutableMapData = x0Var.forMutableMapData(object);
        int iQ = e.q(bArr, i14, bVar);
        int i18 = bVar.f7582a;
        if (i18 < 0 || i18 > i15 - iQ) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i19 = iQ + i18;
        K k14 = aVarForMapMetadata.f7800b;
        V v14 = aVarForMapMetadata.f7802d;
        Object obj = k14;
        Object obj2 = v14;
        while (iQ < i19) {
            int iP = iQ + 1;
            int i24 = bArr[iQ];
            if (i24 < 0) {
                iP = e.p(i24, bArr, iP, bVar);
                i24 = bVar.f7582a;
            }
            int i25 = i24 >>> 3;
            int i26 = i24 & 7;
            if (i25 != 1) {
                if (i25 == 2) {
                    b3 b3Var = aVarForMapMetadata.f7801c;
                    if (i26 == b3Var.f7560b) {
                        i17 = i(bArr, iP, i15, b3Var, v14.getClass(), bVar);
                        obj2 = bVar.f7584c;
                        iQ = i17;
                    }
                }
                iQ = e.v(i24, bArr, iP, i15, bVar);
            } else {
                b3 b3Var2 = aVarForMapMetadata.f7799a;
                if (i26 == b3Var2.f7560b) {
                    i17 = i(bArr, iP, i15, b3Var2, null, bVar);
                    obj = bVar.f7584c;
                    iQ = i17;
                } else {
                    iQ = e.v(i24, bArr, iP, i15, bVar);
                }
            }
        }
        if (iQ != i19) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        w0VarForMutableMapData.put(obj, obj2);
        return i19;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 22741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int D(T r34, byte[] r35, int r36, int r37, int r38, androidx.health.platform.client.proto.e.b r39) {
        /*
            Method dump skipped, instruction units count: 2274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.platform.client.proto.f1.D(java.lang.Object, byte[], int, int, int, androidx.health.platform.client.proto.e$b):int");
    }

    public final int E(T t7, byte[] bArr, int i14, int i15, int i16, int i17, int i18, int i19, int i24, long j8, int i25, e.b bVar) throws InvalidProtocolBufferException {
        Unsafe unsafe = f7611r;
        long j14 = this.f7612a[i25 + 2] & 1048575;
        switch (i24) {
            case 51:
                if (i18 != 1) {
                    return i14;
                }
                unsafe.putObject(t7, j8, Double.valueOf(Double.longBitsToDouble(e.c(bArr, i14))));
                int i26 = i14 + 8;
                unsafe.putInt(t7, j14, i17);
                return i26;
            case 52:
                if (i18 != 5) {
                    return i14;
                }
                unsafe.putObject(t7, j8, Float.valueOf(Float.intBitsToFloat(e.b(bArr, i14))));
                int i27 = i14 + 4;
                unsafe.putInt(t7, j14, i17);
                return i27;
            case 53:
            case 54:
                if (i18 != 0) {
                    return i14;
                }
                int iS = e.s(bArr, i14, bVar);
                unsafe.putObject(t7, j8, Long.valueOf(bVar.f7583b));
                unsafe.putInt(t7, j14, i17);
                return iS;
            case 55:
            case 62:
                if (i18 != 0) {
                    return i14;
                }
                int iQ = e.q(bArr, i14, bVar);
                unsafe.putObject(t7, j8, Integer.valueOf(bVar.f7582a));
                unsafe.putInt(t7, j14, i17);
                return iQ;
            case 56:
            case 65:
                if (i18 != 1) {
                    return i14;
                }
                unsafe.putObject(t7, j8, Long.valueOf(e.c(bArr, i14)));
                int i28 = i14 + 8;
                unsafe.putInt(t7, j14, i17);
                return i28;
            case 57:
            case 64:
                if (i18 != 5) {
                    return i14;
                }
                unsafe.putObject(t7, j8, Integer.valueOf(e.b(bArr, i14)));
                int i29 = i14 + 4;
                unsafe.putInt(t7, j14, i17);
                return i29;
            case 58:
                if (i18 != 0) {
                    return i14;
                }
                int iS2 = e.s(bArr, i14, bVar);
                unsafe.putObject(t7, j8, Boolean.valueOf(bVar.f7583b != 0));
                unsafe.putInt(t7, j14, i17);
                return iS2;
            case 59:
                if (i18 != 2) {
                    return i14;
                }
                int iQ2 = e.q(bArr, i14, bVar);
                int i30 = bVar.f7582a;
                if (i30 == 0) {
                    unsafe.putObject(t7, j8, "");
                } else {
                    if ((i19 & 536870912) != 0) {
                        if (z2.f7824a.c(bArr, iQ2, iQ2 + i30) != 0) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    unsafe.putObject(t7, j8, new String(bArr, iQ2, i30, l0.f7708a));
                    iQ2 += i30;
                }
                unsafe.putInt(t7, j14, i17);
                return iQ2;
            case 60:
                if (i18 != 2) {
                    return i14;
                }
                Object objW = w(t7, i17, i25);
                int iU = e.u(objW, m(i25), bArr, i14, i15, bVar);
                P(t7, i17, i25, objW);
                return iU;
            case 61:
                if (i18 != 2) {
                    return i14;
                }
                int iA = e.a(bArr, i14, bVar);
                unsafe.putObject(t7, j8, bVar.f7584c);
                unsafe.putInt(t7, j14, i17);
                return iA;
            case 63:
                if (i18 != 0) {
                    return i14;
                }
                int iQ3 = e.q(bArr, i14, bVar);
                int i34 = bVar.f7582a;
                l0.c cVarK = k(i25);
                if (cVarK != null && !cVarK.isInRange(i34)) {
                    n(t7).e(i16, Long.valueOf(i34));
                    return iQ3;
                }
                unsafe.putObject(t7, j8, Integer.valueOf(i34));
                unsafe.putInt(t7, j14, i17);
                return iQ3;
            case 66:
                if (i18 != 0) {
                    return i14;
                }
                int iQ4 = e.q(bArr, i14, bVar);
                unsafe.putObject(t7, j8, Integer.valueOf(j.b(bVar.f7582a)));
                unsafe.putInt(t7, j14, i17);
                return iQ4;
            case 67:
                if (i18 != 0) {
                    return i14;
                }
                int iS3 = e.s(bArr, i14, bVar);
                unsafe.putObject(t7, j8, Long.valueOf(j.c(bVar.f7583b)));
                unsafe.putInt(t7, j14, i17);
                return iS3;
            case 68:
                if (i18 == 3) {
                    Object objW2 = w(t7, i17, i25);
                    int iT = e.t(objW2, m(i25), bArr, i14, i15, (i16 & (-8)) | 4, bVar);
                    P(t7, i17, i25, objW2);
                    return iT;
                }
                break;
        }
        return i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int F(T t7, byte[] bArr, int i14, int i15, int i16, int i17, int i18, int i19, long j8, int i24, long j14, e.b bVar) throws InvalidProtocolBufferException {
        int i25;
        int iR;
        n2 n2Var;
        Unsafe unsafe = f7611r;
        l0.d dVarMutableCopyWithCapacity = (l0.d) unsafe.getObject(t7, j14);
        if (!dVarMutableCopyWithCapacity.isModifiable()) {
            int size = dVarMutableCopyWithCapacity.size();
            dVarMutableCopyWithCapacity = dVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t7, j14, dVarMutableCopyWithCapacity);
        }
        l0.d dVar = dVarMutableCopyWithCapacity;
        switch (i24) {
            case 18:
            case 35:
                if (i18 == 2) {
                    return e.g(bArr, i14, dVar, bVar);
                }
                if (i18 != 1) {
                    return i14;
                }
                v vVar = (v) dVar;
                vVar.addDouble(Double.longBitsToDouble(e.c(bArr, i14)));
                int i26 = i14 + 8;
                while (i26 < i15) {
                    int iQ = e.q(bArr, i26, bVar);
                    if (i16 != bVar.f7582a) {
                        return i26;
                    }
                    vVar.addDouble(Double.longBitsToDouble(e.c(bArr, iQ)));
                    i26 = iQ + 8;
                }
                return i26;
            case 19:
            case 36:
                if (i18 == 2) {
                    return e.j(bArr, i14, dVar, bVar);
                }
                if (i18 != 5) {
                    return i14;
                }
                h0 h0Var = (h0) dVar;
                h0Var.addFloat(Float.intBitsToFloat(e.b(bArr, i14)));
                int i27 = i14 + 4;
                while (i27 < i15) {
                    int iQ2 = e.q(bArr, i27, bVar);
                    if (i16 != bVar.f7582a) {
                        return i27;
                    }
                    h0Var.addFloat(Float.intBitsToFloat(e.b(bArr, iQ2)));
                    i27 = iQ2 + 4;
                }
                return i27;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i18 == 2) {
                    t0 t0Var = (t0) dVar;
                    int iQ3 = e.q(bArr, i14, bVar);
                    int i28 = bVar.f7582a + iQ3;
                    while (iQ3 < i28) {
                        iQ3 = e.s(bArr, iQ3, bVar);
                        t0Var.addLong(bVar.f7583b);
                    }
                    if (iQ3 == i28) {
                        return iQ3;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i18 != 0) {
                    return i14;
                }
                t0 t0Var2 = (t0) dVar;
                int iS = e.s(bArr, i14, bVar);
                t0Var2.addLong(bVar.f7583b);
                while (iS < i15) {
                    int iQ4 = e.q(bArr, iS, bVar);
                    if (i16 != bVar.f7582a) {
                        return iS;
                    }
                    iS = e.s(bArr, iQ4, bVar);
                    t0Var2.addLong(bVar.f7583b);
                }
                return iS;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i18 == 2) {
                    return e.m(bArr, i14, dVar, bVar);
                }
                return i18 == 0 ? e.r(i16, bArr, i14, i15, dVar, bVar) : i14;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i18 == 2) {
                    return e.i(bArr, i14, dVar, bVar);
                }
                if (i18 != 1) {
                    return i14;
                }
                t0 t0Var3 = (t0) dVar;
                t0Var3.addLong(e.c(bArr, i14));
                int i29 = i14 + 8;
                while (i29 < i15) {
                    int iQ5 = e.q(bArr, i29, bVar);
                    if (i16 != bVar.f7582a) {
                        return i29;
                    }
                    t0Var3.addLong(e.c(bArr, iQ5));
                    i29 = iQ5 + 8;
                }
                return i29;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i18 == 2) {
                    return e.h(bArr, i14, dVar, bVar);
                }
                if (i18 != 5) {
                    return i14;
                }
                k0 k0Var = (k0) dVar;
                k0Var.addInt(e.b(bArr, i14));
                int i30 = i14 + 4;
                while (i30 < i15) {
                    int iQ6 = e.q(bArr, i30, bVar);
                    if (i16 != bVar.f7582a) {
                        return i30;
                    }
                    k0Var.addInt(e.b(bArr, iQ6));
                    i30 = iQ6 + 4;
                }
                return i30;
            case 25:
            case 42:
                if (i18 == 2) {
                    return e.f(bArr, i14, dVar, bVar);
                }
                if (i18 != 0) {
                    return i14;
                }
                f fVar = (f) dVar;
                int iS2 = e.s(bArr, i14, bVar);
                fVar.addBoolean(bVar.f7583b != 0);
                while (iS2 < i15) {
                    int iQ7 = e.q(bArr, iS2, bVar);
                    if (i16 != bVar.f7582a) {
                        return iS2;
                    }
                    iS2 = e.s(bArr, iQ7, bVar);
                    fVar.addBoolean(bVar.f7583b != 0);
                }
                return iS2;
            case 26:
                if (i18 != 2) {
                    return i14;
                }
                if ((j8 & 536870912) == 0) {
                    int iQ8 = e.q(bArr, i14, bVar);
                    int i34 = bVar.f7582a;
                    if (i34 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i34 == 0) {
                        dVar.add("");
                    } else {
                        dVar.add(new String(bArr, iQ8, i34, l0.f7708a));
                        iQ8 += i34;
                    }
                    while (iQ8 < i15) {
                        int iQ9 = e.q(bArr, iQ8, bVar);
                        if (i16 != bVar.f7582a) {
                            return iQ8;
                        }
                        iQ8 = e.q(bArr, iQ9, bVar);
                        int i35 = bVar.f7582a;
                        if (i35 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i35 == 0) {
                            dVar.add("");
                        } else {
                            dVar.add(new String(bArr, iQ8, i35, l0.f7708a));
                            iQ8 += i35;
                        }
                    }
                    return iQ8;
                }
                int iQ10 = e.q(bArr, i14, bVar);
                int i36 = bVar.f7582a;
                if (i36 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if (i36 == 0) {
                    dVar.add("");
                } else {
                    int i37 = iQ10 + i36;
                    if (z2.f7824a.c(bArr, iQ10, i37) != 0) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    dVar.add(new String(bArr, iQ10, i36, l0.f7708a));
                    iQ10 = i37;
                }
                while (iQ10 < i15) {
                    int iQ11 = e.q(bArr, iQ10, bVar);
                    if (i16 != bVar.f7582a) {
                        return iQ10;
                    }
                    iQ10 = e.q(bArr, iQ11, bVar);
                    int i38 = bVar.f7582a;
                    if (i38 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i38 == 0) {
                        dVar.add("");
                    } else {
                        int i39 = iQ10 + i38;
                        if (z2.f7824a.c(bArr, iQ10, i39) != 0) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        dVar.add(new String(bArr, iQ10, i38, l0.f7708a));
                        iQ10 = i39;
                    }
                }
                return iQ10;
            case 27:
                i25 = i14;
                if (i18 == 2) {
                    return e.e(m(i19), i16, bArr, i25, i15, dVar, bVar);
                }
                break;
            case 28:
                i25 = i14;
                if (i18 == 2) {
                    int iQ12 = e.q(bArr, i25, bVar);
                    int i44 = bVar.f7582a;
                    if (i44 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i44 > bArr.length - iQ12) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    if (i44 == 0) {
                        dVar.add(i.f7657b);
                    } else {
                        dVar.add(i.c(iQ12, i44, bArr));
                        iQ12 += i44;
                    }
                    while (iQ12 < i15) {
                        int iQ13 = e.q(bArr, iQ12, bVar);
                        if (i16 != bVar.f7582a) {
                            return iQ12;
                        }
                        iQ12 = e.q(bArr, iQ13, bVar);
                        int i45 = bVar.f7582a;
                        if (i45 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i45 > bArr.length - iQ12) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                        if (i45 == 0) {
                            dVar.add(i.f7657b);
                        } else {
                            dVar.add(i.c(iQ12, i45, bArr));
                            iQ12 += i45;
                        }
                    }
                    return iQ12;
                }
                break;
            case 30:
            case 44:
                if (i18 == 2) {
                    iR = e.m(bArr, i14, dVar, bVar);
                } else {
                    if (i18 != 0) {
                        return i14;
                    }
                    iR = e.r(i16, bArr, i14, i15, dVar, bVar);
                }
                o2.k(t7, i17, dVar, k(i19), null, this.f7625n);
                return iR;
            case 33:
            case 47:
                if (i18 == 2) {
                    return e.k(bArr, i14, dVar, bVar);
                }
                if (i18 != 0) {
                    return i14;
                }
                k0 k0Var2 = (k0) dVar;
                int iQ14 = e.q(bArr, i14, bVar);
                k0Var2.addInt(j.b(bVar.f7582a));
                while (iQ14 < i15) {
                    int iQ15 = e.q(bArr, iQ14, bVar);
                    if (i16 != bVar.f7582a) {
                        return iQ14;
                    }
                    iQ14 = e.q(bArr, iQ15, bVar);
                    k0Var2.addInt(j.b(bVar.f7582a));
                }
                return iQ14;
            case 34:
            case 48:
                if (i18 == 2) {
                    return e.l(bArr, i14, dVar, bVar);
                }
                if (i18 != 0) {
                    return i14;
                }
                t0 t0Var4 = (t0) dVar;
                int iS3 = e.s(bArr, i14, bVar);
                t0Var4.addLong(j.c(bVar.f7583b));
                while (iS3 < i15) {
                    int iQ16 = e.q(bArr, iS3, bVar);
                    if (i16 != bVar.f7582a) {
                        return iS3;
                    }
                    iS3 = e.s(bArr, iQ16, bVar);
                    t0Var4.addLong(j.c(bVar.f7583b));
                }
                return iS3;
            case 49:
                if (i18 == 3) {
                    n2 n2VarM = m(i19);
                    int i46 = (i16 & (-8)) | 4;
                    Object objNewInstance = n2VarM.newInstance();
                    int iT = e.t(objNewInstance, n2VarM, bArr, i14, i15, i46, bVar);
                    n2 n2Var2 = n2VarM;
                    byte[] bArr2 = bArr;
                    n2Var2.makeImmutable(objNewInstance);
                    bVar.f7584c = objNewInstance;
                    dVar.add(objNewInstance);
                    while (iT < i15) {
                        int iQ17 = e.q(bArr2, iT, bVar);
                        if (i16 != bVar.f7582a) {
                            n2Var = n2Var2;
                            return iT;
                        }
                        n2Var = n2Var2;
                        Object objNewInstance2 = n2Var.newInstance();
                        byte[] bArr3 = bArr2;
                        n2 n2Var3 = n2Var;
                        iT = e.t(objNewInstance2, n2Var3, bArr3, iQ17, i15, i46, bVar);
                        n2Var3.makeImmutable(objNewInstance2);
                        bVar.f7584c = objNewInstance2;
                        dVar.add(objNewInstance2);
                        n2Var = n2Var3;
                        bArr2 = bArr3;
                    }
                    n2Var = n2Var2;
                    return iT;
                }
            default:
                return i14;
        }
        return i25;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(Object obj, long j8, k kVar, n2 n2Var, a0 a0Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iW;
        l0.d dVarA = this.f7624m.a(j8, obj);
        j jVar = kVar.f7698a;
        int i14 = kVar.f7699b;
        if ((i14 & 7) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object objNewInstance = n2Var.newInstance();
            kVar.c(objNewInstance, n2Var, a0Var);
            n2Var.makeImmutable(objNewInstance);
            dVarA.add(objNewInstance);
            if (jVar.e() || kVar.f7701d != 0) {
                return;
            } else {
                iW = jVar.w();
            }
        } while (iW == i14);
        kVar.f7701d = iW;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Object obj, int i14, k kVar, n2 n2Var, a0 a0Var) throws InvalidProtocolBufferException {
        int iW;
        l0.d dVarA = this.f7624m.a(i14 & 1048575, obj);
        j jVar = kVar.f7698a;
        int i15 = kVar.f7699b;
        if ((i15 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object objNewInstance = n2Var.newInstance();
            kVar.d(objNewInstance, n2Var, a0Var);
            n2Var.makeImmutable(objNewInstance);
            dVarA.add(objNewInstance);
            if (jVar.e() || kVar.f7701d != 0) {
                return;
            } else {
                iW = jVar.w();
            }
        } while (iW == i15);
        kVar.f7701d = iW;
    }

    public final void I(Object obj, int i14, k kVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i14) != 0) {
            kVar.y(2);
            y2.p(obj, i14 & 1048575, kVar.f7698a.v());
        } else if (!this.f7618g) {
            y2.p(obj, i14 & 1048575, kVar.f());
        } else {
            kVar.y(2);
            y2.p(obj, i14 & 1048575, kVar.f7698a.u());
        }
    }

    public final void J(Object obj, int i14, k kVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        boolean z14 = (536870912 & i14) != 0;
        q0 q0Var = this.f7624m;
        if (z14) {
            kVar.u(q0Var.a(i14 & 1048575, obj), true);
        } else {
            kVar.u(q0Var.a(i14 & 1048575, obj), false);
        }
    }

    public final void L(T t7, int i14) {
        int i15 = this.f7612a[i14 + 2];
        long j8 = 1048575 & i15;
        if (j8 == 1048575) {
            return;
        }
        y2.n(t7, j8, (1 << (i15 >>> 20)) | y2.f7815c.g(t7, j8));
    }

    public final void M(T t7, int i14, int i15) {
        y2.n(t7, this.f7612a[i15 + 2] & 1048575, i14);
    }

    public final int N(int i14, int i15) {
        int[] iArr = this.f7612a;
        int length = (iArr.length / 3) - 1;
        while (i15 <= length) {
            int i16 = (length + i15) >>> 1;
            int i17 = i16 * 3;
            int i18 = iArr[i17];
            if (i14 == i18) {
                return i17;
            }
            if (i14 < i18) {
                length = i16 - 1;
            } else {
                i15 = i16 + 1;
            }
        }
        return -1;
    }

    public final void O(T t7, int i14, Object obj) {
        f7611r.putObject(t7, R(i14) & 1048575, obj);
        L(t7, i14);
    }

    public final void P(T t7, int i14, int i15, Object obj) {
        f7611r.putObject(t7, R(i15) & 1048575, obj);
        M(t7, i14, i15);
    }

    public final int R(int i14) {
        return this.f7612a[i14 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void S(T t7, d3 d3Var) {
        Map.Entry<?, ?> entry;
        Iterator it;
        char c14;
        int i14;
        int i15;
        Map.Entry<?, ?> entry2;
        int i16;
        boolean z14;
        f1<T> f1Var = this;
        boolean z15 = f1Var.f7617f;
        b0<?> b0Var = f1Var.f7626o;
        if (z15) {
            f0<T> f0VarC = b0Var.c(t7);
            if (f0VarC.f7605a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itJ = f0VarC.j();
                entry = (Map.Entry) itJ.next();
                it = itJ;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = f1Var.f7612a;
        int length = iArr.length;
        Unsafe unsafe = f7611r;
        int i17 = 0;
        int i18 = 1048575;
        int i19 = 0;
        while (i17 < length) {
            int iR = f1Var.R(i17);
            int i24 = iArr[i17];
            int iQ = Q(iR);
            Iterator it3 = it;
            if (iQ <= 17) {
                int i25 = iArr[i17 + 2];
                c14 = 1;
                int i26 = i25 & 1048575;
                Map.Entry<?, ?> entry3 = entry;
                if (i26 != i18) {
                    i19 = i26 == 1048575 ? 0 : unsafe.getInt(t7, i26);
                    i18 = i26;
                }
                int i27 = i19;
                i16 = 1 << (i25 >>> 20);
                i14 = i18;
                i15 = i27;
                entry2 = entry3;
            } else {
                Map.Entry<?, ?> entry4 = entry;
                c14 = 1;
                i14 = i18;
                i15 = i19;
                entry2 = entry4;
                i16 = 0;
            }
            while (entry2 != null && b0Var.a(entry2) <= i24) {
                b0Var.j(d3Var, entry2);
                entry2 = it3.hasNext() ? (Map.Entry) it3.next() : null;
            }
            int i28 = iR & 1048575;
            Map.Entry<?, ?> entry5 = entry2;
            int[] iArr2 = iArr;
            long j8 = i28;
            switch (iQ) {
                case 0:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        double dE = y2.f7815c.e(t7, j8);
                        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
                        codedOutputStream.getClass();
                        codedOutputStream.p(i24, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        float f14 = y2.f7815c.f(t7, j8);
                        CodedOutputStream codedOutputStream2 = ((l) d3Var).f7707a;
                        codedOutputStream2.getClass();
                        codedOutputStream2.n(i24, Float.floatToRawIntBits(f14));
                    }
                    f1Var = this;
                    break;
                case 2:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).g(i24, unsafe.getLong(t7, j8));
                    }
                    f1Var = this;
                    break;
                case 3:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).f7707a.C(i24, unsafe.getLong(t7, j8));
                    }
                    f1Var = this;
                    break;
                case 4:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).f(i24, unsafe.getInt(t7, j8));
                    }
                    f1Var = this;
                    break;
                case 5:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).d(i24, unsafe.getLong(t7, j8));
                    }
                    f1Var = this;
                    break;
                case 6:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).c(i24, unsafe.getInt(t7, j8));
                    }
                    f1Var = this;
                    break;
                case 7:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).f7707a.j(i24, y2.f7815c.c(t7, j8));
                    }
                    f1Var = this;
                    break;
                case 8:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        U(i24, unsafe.getObject(t7, j8), d3Var);
                    }
                    f1Var = this;
                    break;
                case 9:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).h(i24, unsafe.getObject(t7, j8), f1Var.m(i17));
                    }
                    break;
                case 10:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).b(i24, (i) unsafe.getObject(t7, j8));
                    }
                    f1Var = this;
                    break;
                case 11:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).f7707a.A(i24, unsafe.getInt(t7, j8));
                    }
                    f1Var = this;
                    break;
                case 12:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).f7707a.r(i24, unsafe.getInt(t7, j8));
                    }
                    f1Var = this;
                    break;
                case 13:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).f7707a.n(i24, unsafe.getInt(t7, j8));
                    }
                    f1Var = this;
                    break;
                case 14:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).f7707a.p(i24, unsafe.getLong(t7, j8));
                    }
                    f1Var = this;
                    break;
                case 15:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        int i29 = unsafe.getInt(t7, j8);
                        ((l) d3Var).f7707a.A(i24, (i29 >> 31) ^ (i29 << 1));
                    }
                    f1Var = this;
                    break;
                case 16:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        long j14 = unsafe.getLong(t7, j8);
                        ((l) d3Var).f7707a.C(i24, (j14 << 1) ^ (j14 >> 63));
                    }
                    f1Var = this;
                    break;
                case 17:
                    if (f1Var.p(t7, i17, i14, i15, i16)) {
                        ((l) d3Var).e(i24, unsafe.getObject(t7, j8), f1Var.m(i17));
                    }
                    break;
                case 18:
                    o2.q(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 19:
                    o2.u(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 20:
                    o2.x(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 21:
                    o2.F(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 22:
                    o2.w(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 23:
                    o2.t(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 24:
                    o2.s(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 25:
                    o2.o(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 26:
                    o2.D(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var);
                    break;
                case 27:
                    o2.y(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, f1Var.m(i17));
                    break;
                case 28:
                    o2.p(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var);
                    break;
                case 29:
                    z14 = false;
                    o2.E(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 30:
                    z14 = false;
                    o2.r(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 31:
                    z14 = false;
                    o2.z(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 32:
                    z14 = false;
                    o2.A(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 33:
                    z14 = false;
                    o2.B(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 34:
                    z14 = false;
                    o2.C(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, false);
                    break;
                case 35:
                    o2.q(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 36:
                    o2.u(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 37:
                    o2.x(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 38:
                    o2.F(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 39:
                    o2.w(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 40:
                    o2.t(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 41:
                    o2.s(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 42:
                    o2.o(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 43:
                    o2.E(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 44:
                    o2.r(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 45:
                    o2.z(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 46:
                    o2.A(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 47:
                    o2.B(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 48:
                    o2.C(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, c14);
                    break;
                case 49:
                    o2.v(iArr2[i17], (List) unsafe.getObject(t7, j8), d3Var, f1Var.m(i17));
                    break;
                case 50:
                    f1Var.T(d3Var, i24, unsafe.getObject(t7, j8), i17);
                    break;
                case 51:
                    if (f1Var.r(t7, i24, i17)) {
                        double dDoubleValue = ((Double) y2.f7815c.i(t7, j8)).doubleValue();
                        CodedOutputStream codedOutputStream3 = ((l) d3Var).f7707a;
                        codedOutputStream3.getClass();
                        codedOutputStream3.p(i24, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (f1Var.r(t7, i24, i17)) {
                        float fFloatValue = ((Float) y2.f7815c.i(t7, j8)).floatValue();
                        CodedOutputStream codedOutputStream4 = ((l) d3Var).f7707a;
                        codedOutputStream4.getClass();
                        codedOutputStream4.n(i24, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).g(i24, B(t7, j8));
                    }
                    break;
                case 54:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).f7707a.C(i24, B(t7, j8));
                    }
                    break;
                case 55:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).f(i24, A(t7, j8));
                    }
                    break;
                case 56:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).d(i24, B(t7, j8));
                    }
                    break;
                case 57:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).c(i24, A(t7, j8));
                    }
                    break;
                case 58:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).f7707a.j(i24, ((Boolean) y2.f7815c.i(t7, j8)).booleanValue());
                    }
                    break;
                case 59:
                    if (f1Var.r(t7, i24, i17)) {
                        U(i24, unsafe.getObject(t7, j8), d3Var);
                    }
                    break;
                case 60:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).h(i24, unsafe.getObject(t7, j8), f1Var.m(i17));
                    }
                    break;
                case 61:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).b(i24, (i) unsafe.getObject(t7, j8));
                    }
                    break;
                case 62:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).f7707a.A(i24, A(t7, j8));
                    }
                    break;
                case 63:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).f7707a.r(i24, A(t7, j8));
                    }
                    break;
                case 64:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).f7707a.n(i24, A(t7, j8));
                    }
                    break;
                case 65:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).f7707a.p(i24, B(t7, j8));
                    }
                    break;
                case 66:
                    if (f1Var.r(t7, i24, i17)) {
                        int iA = A(t7, j8);
                        ((l) d3Var).f7707a.A(i24, (iA >> 31) ^ (iA << 1));
                    }
                    break;
                case 67:
                    if (f1Var.r(t7, i24, i17)) {
                        long jB = B(t7, j8);
                        ((l) d3Var).f7707a.C(i24, (jB << c14) ^ (jB >> 63));
                    }
                    break;
                case 68:
                    if (f1Var.r(t7, i24, i17)) {
                        ((l) d3Var).e(i24, unsafe.getObject(t7, j8), f1Var.m(i17));
                    }
                    break;
                default:
                    break;
            }
            i17 += 3;
            i19 = i15;
            iArr = iArr2;
            it = it3;
            i18 = i14;
            entry = entry5;
        }
        Iterator it4 = it;
        while (entry != null) {
            b0Var.j(d3Var, entry);
            entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
        }
        v2<?, ?> v2Var = f1Var.f7625n;
        v2Var.r(v2Var.g(t7), d3Var);
    }

    public final <K, V> void T(d3 d3Var, int i14, Object obj, int i15) {
        if (obj != null) {
            Object objL = l(i15);
            x0 x0Var = this.f7627p;
            v0.a<?, ?> aVarForMapMetadata = x0Var.forMapMetadata(objL);
            w0 w0VarForMapData = x0Var.forMapData(obj);
            CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
            codedOutputStream.getClass();
            for (Map.Entry<K, V> entry : w0VarForMapData.entrySet()) {
                codedOutputStream.z(i14, 2);
                codedOutputStream.B(v0.a(aVarForMapMetadata, entry.getKey(), entry.getValue()));
                v0.c(codedOutputStream, aVarForMapMetadata, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // androidx.health.platform.client.proto.n2
    public final void a(T t7, byte[] bArr, int i14, int i15, e.b bVar) {
        D(t7, bArr, i14, i15, 0, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.health.platform.client.proto.n2
    public final int b(j0 j0Var) {
        int i14;
        int iB;
        int i15;
        int[] iArr = this.f7612a;
        int length = iArr.length;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17 += 3) {
            int iR = R(i17);
            int i18 = iArr[i17];
            long j8 = 1048575 & iR;
            int i19 = 1237;
            int iHashCode = 37;
            switch (Q(iR)) {
                case 0:
                    i14 = i16 * 53;
                    iB = l0.b(Double.doubleToLongBits(y2.f7815c.e(j0Var, j8)));
                    i16 = iB + i14;
                    break;
                case 1:
                    i14 = i16 * 53;
                    iB = Float.floatToIntBits(y2.f7815c.f(j0Var, j8));
                    i16 = iB + i14;
                    break;
                case 2:
                    i14 = i16 * 53;
                    iB = l0.b(y2.f7815c.h(j0Var, j8));
                    i16 = iB + i14;
                    break;
                case 3:
                    i14 = i16 * 53;
                    iB = l0.b(y2.f7815c.h(j0Var, j8));
                    i16 = iB + i14;
                    break;
                case 4:
                    i14 = i16 * 53;
                    iB = y2.f7815c.g(j0Var, j8);
                    i16 = iB + i14;
                    break;
                case 5:
                    i14 = i16 * 53;
                    iB = l0.b(y2.f7815c.h(j0Var, j8));
                    i16 = iB + i14;
                    break;
                case 6:
                    i14 = i16 * 53;
                    iB = y2.f7815c.g(j0Var, j8);
                    i16 = iB + i14;
                    break;
                case 7:
                    i15 = i16 * 53;
                    boolean zC = y2.f7815c.c(j0Var, j8);
                    Charset charset = l0.f7708a;
                    if (zC) {
                        i19 = 1231;
                    }
                    i16 = i19 + i15;
                    break;
                case 8:
                    i14 = i16 * 53;
                    iB = ((String) y2.f7815c.i(j0Var, j8)).hashCode();
                    i16 = iB + i14;
                    break;
                case 9:
                    Object objI = y2.f7815c.i(j0Var, j8);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i16 = (i16 * 53) + iHashCode;
                    break;
                case 10:
                    i14 = i16 * 53;
                    iB = y2.f7815c.i(j0Var, j8).hashCode();
                    i16 = iB + i14;
                    break;
                case 11:
                    i14 = i16 * 53;
                    iB = y2.f7815c.g(j0Var, j8);
                    i16 = iB + i14;
                    break;
                case 12:
                    i14 = i16 * 53;
                    iB = y2.f7815c.g(j0Var, j8);
                    i16 = iB + i14;
                    break;
                case 13:
                    i14 = i16 * 53;
                    iB = y2.f7815c.g(j0Var, j8);
                    i16 = iB + i14;
                    break;
                case 14:
                    i14 = i16 * 53;
                    iB = l0.b(y2.f7815c.h(j0Var, j8));
                    i16 = iB + i14;
                    break;
                case 15:
                    i14 = i16 * 53;
                    iB = y2.f7815c.g(j0Var, j8);
                    i16 = iB + i14;
                    break;
                case 16:
                    i14 = i16 * 53;
                    iB = l0.b(y2.f7815c.h(j0Var, j8));
                    i16 = iB + i14;
                    break;
                case 17:
                    Object objI2 = y2.f7815c.i(j0Var, j8);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
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
                    iB = y2.f7815c.i(j0Var, j8).hashCode();
                    i16 = iB + i14;
                    break;
                case 50:
                    i14 = i16 * 53;
                    iB = y2.f7815c.i(j0Var, j8).hashCode();
                    i16 = iB + i14;
                    break;
                case 51:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = l0.b(Double.doubleToLongBits(((Double) y2.f7815c.i(j0Var, j8)).doubleValue()));
                        i16 = iB + i14;
                    }
                    break;
                case 52:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = Float.floatToIntBits(((Float) y2.f7815c.i(j0Var, j8)).floatValue());
                        i16 = iB + i14;
                    }
                    break;
                case 53:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = l0.b(B(j0Var, j8));
                        i16 = iB + i14;
                    }
                    break;
                case 54:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = l0.b(B(j0Var, j8));
                        i16 = iB + i14;
                    }
                    break;
                case 55:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = A(j0Var, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 56:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = l0.b(B(j0Var, j8));
                        i16 = iB + i14;
                    }
                    break;
                case 57:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = A(j0Var, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 58:
                    if (r(j0Var, i18, i17)) {
                        i15 = i16 * 53;
                        boolean zBooleanValue = ((Boolean) y2.f7815c.i(j0Var, j8)).booleanValue();
                        Charset charset2 = l0.f7708a;
                        if (zBooleanValue) {
                            i19 = 1231;
                        }
                        i16 = i19 + i15;
                    }
                    break;
                case 59:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = ((String) y2.f7815c.i(j0Var, j8)).hashCode();
                        i16 = iB + i14;
                    }
                    break;
                case 60:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = y2.f7815c.i(j0Var, j8).hashCode();
                        i16 = iB + i14;
                    }
                    break;
                case 61:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = y2.f7815c.i(j0Var, j8).hashCode();
                        i16 = iB + i14;
                    }
                    break;
                case 62:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = A(j0Var, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 63:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = A(j0Var, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 64:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = A(j0Var, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 65:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = l0.b(B(j0Var, j8));
                        i16 = iB + i14;
                    }
                    break;
                case 66:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = A(j0Var, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 67:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = l0.b(B(j0Var, j8));
                        i16 = iB + i14;
                    }
                    break;
                case 68:
                    if (r(j0Var, i18, i17)) {
                        i14 = i16 * 53;
                        iB = y2.f7815c.i(j0Var, j8).hashCode();
                        i16 = iB + i14;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f7625n.g(j0Var).hashCode() + (i16 * 53);
        if (!this.f7617f) {
            return iHashCode2;
        }
        return this.f7626o.c(j0Var).f7605a.hashCode() + (iHashCode2 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    @Override // androidx.health.platform.client.proto.n2
    public final void c(T t7, d3 d3Var) {
        Iterator it;
        Map.Entry<?, ?> entry;
        Map.Entry<?, ?> entry2;
        l lVar = (l) d3Var;
        lVar.getClass();
        if (d3.a.ASCENDING != d3.a.DESCENDING) {
            S(t7, d3Var);
            return;
        }
        b0<?> b0Var = this.f7626o;
        int[] iArr = this.f7612a;
        v2<?, ?> v2Var = this.f7625n;
        v2Var.r(v2Var.g(t7), d3Var);
        Map.Entry<?, ?> entry3 = null;
        if (this.f7617f) {
            f0<T> f0VarC = b0Var.c(t7);
            if (f0VarC.f7605a.isEmpty()) {
                it = null;
                entry = null;
            } else {
                q2<T, Object> q2Var = f0VarC.f7605a;
                if (q2Var.isEmpty()) {
                    it = Collections.emptyIterator();
                } else {
                    boolean z14 = f0VarC.f7607c;
                    q2<K, V>.b bVar = q2Var.f7754f;
                    if (z14) {
                        if (bVar == null) {
                            q2Var.f7754f = new q2.b(q2Var, null);
                        }
                        it = new n0.c(q2Var.f7754f.iterator());
                    } else {
                        if (bVar == null) {
                            q2Var.f7754f = new q2.b(q2Var, null);
                        }
                        it = q2Var.f7754f.iterator();
                    }
                }
                entry = (Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length = iArr.length - 3;
        while (length >= 0) {
            int iR = R(length);
            int i14 = iArr[length];
            while (entry != null && b0Var.a(entry) > i14) {
                b0Var.j(d3Var, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : entry3;
            }
            switch (Q(iR)) {
                case 0:
                    entry2 = entry;
                    if (o(t7, length)) {
                        double dE = y2.f7815c.e(t7, iR & 1048575);
                        CodedOutputStream codedOutputStream = lVar.f7707a;
                        codedOutputStream.getClass();
                        codedOutputStream.p(i14, Double.doubleToRawLongBits(dE));
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 1:
                    entry2 = entry;
                    if (o(t7, length)) {
                        float f14 = y2.f7815c.f(t7, iR & 1048575);
                        CodedOutputStream codedOutputStream2 = lVar.f7707a;
                        codedOutputStream2.getClass();
                        codedOutputStream2.n(i14, Float.floatToRawIntBits(f14));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 2:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.g(i14, y2.f7815c.h(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 3:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.f7707a.C(i14, y2.f7815c.h(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 4:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.f(i14, y2.f7815c.g(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 5:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.d(i14, y2.f7815c.h(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 6:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.c(i14, y2.f7815c.g(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 7:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.f7707a.j(i14, y2.f7815c.c(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 8:
                    entry2 = entry;
                    if (o(t7, length)) {
                        U(i14, y2.f7815c.i(t7, iR & 1048575), d3Var);
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 9:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.h(i14, y2.f7815c.i(t7, iR & 1048575), m(length));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 10:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.b(i14, (i) y2.f7815c.i(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 11:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.f7707a.A(i14, y2.f7815c.g(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 12:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.f7707a.r(i14, y2.f7815c.g(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 13:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.f7707a.n(i14, y2.f7815c.g(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 14:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.f7707a.p(i14, y2.f7815c.h(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 15:
                    entry2 = entry;
                    if (o(t7, length)) {
                        int iG = y2.f7815c.g(t7, iR & 1048575);
                        lVar.f7707a.A(i14, (iG >> 31) ^ (iG << 1));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 16:
                    entry2 = entry;
                    if (o(t7, length)) {
                        long jH = y2.f7815c.h(t7, iR & 1048575);
                        lVar.f7707a.C(i14, (jH >> 63) ^ (jH << 1));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 17:
                    entry2 = entry;
                    if (o(t7, length)) {
                        lVar.e(i14, y2.f7815c.i(t7, iR & 1048575), m(length));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 18:
                    entry2 = entry;
                    o2.q(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 19:
                    entry2 = entry;
                    o2.u(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 20:
                    entry2 = entry;
                    o2.x(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 21:
                    entry2 = entry;
                    o2.F(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 22:
                    entry2 = entry;
                    o2.w(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 23:
                    entry2 = entry;
                    o2.t(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 24:
                    entry2 = entry;
                    o2.s(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 25:
                    entry2 = entry;
                    o2.o(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 26:
                    entry2 = entry;
                    o2.D(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 27:
                    entry2 = entry;
                    o2.y(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, m(length));
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 28:
                    entry2 = entry;
                    o2.p(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 29:
                    entry2 = entry;
                    o2.E(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 30:
                    entry2 = entry;
                    o2.r(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 31:
                    entry2 = entry;
                    o2.z(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 32:
                    entry2 = entry;
                    o2.A(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 33:
                    entry2 = entry;
                    o2.B(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 34:
                    entry2 = entry;
                    o2.C(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 35:
                    entry2 = entry;
                    o2.q(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 36:
                    entry2 = entry;
                    o2.u(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 37:
                    entry2 = entry;
                    o2.x(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 38:
                    entry2 = entry;
                    o2.F(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 39:
                    entry2 = entry;
                    o2.w(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 40:
                    entry2 = entry;
                    o2.t(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 41:
                    entry2 = entry;
                    o2.s(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 42:
                    entry2 = entry;
                    o2.o(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 43:
                    entry2 = entry;
                    o2.E(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 44:
                    entry2 = entry;
                    o2.r(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 45:
                    entry2 = entry;
                    o2.z(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 46:
                    entry2 = entry;
                    o2.A(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 47:
                    entry2 = entry;
                    o2.B(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 48:
                    entry2 = entry;
                    o2.C(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 49:
                    entry2 = entry;
                    o2.v(iArr[length], (List) y2.f7815c.i(t7, iR & 1048575), d3Var, m(length));
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 50:
                    entry2 = entry;
                    T(d3Var, i14, y2.f7815c.i(t7, iR & 1048575), length);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 51:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        double dDoubleValue = ((Double) y2.f7815c.i(t7, iR & 1048575)).doubleValue();
                        CodedOutputStream codedOutputStream3 = lVar.f7707a;
                        codedOutputStream3.getClass();
                        codedOutputStream3.p(i14, Double.doubleToRawLongBits(dDoubleValue));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 52:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        float fFloatValue = ((Float) y2.f7815c.i(t7, iR & 1048575)).floatValue();
                        CodedOutputStream codedOutputStream4 = lVar.f7707a;
                        codedOutputStream4.getClass();
                        codedOutputStream4.n(i14, Float.floatToRawIntBits(fFloatValue));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 53:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.g(i14, B(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 54:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.f7707a.C(i14, B(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 55:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.f(i14, A(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 56:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.d(i14, B(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 57:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.c(i14, A(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 58:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.f7707a.j(i14, ((Boolean) y2.f7815c.i(t7, iR & 1048575)).booleanValue());
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 59:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        U(i14, y2.f7815c.i(t7, iR & 1048575), d3Var);
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 60:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.h(i14, y2.f7815c.i(t7, iR & 1048575), m(length));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 61:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.b(i14, (i) y2.f7815c.i(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 62:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.f7707a.A(i14, A(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 63:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.f7707a.r(i14, A(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 64:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.f7707a.n(i14, A(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 65:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        lVar.f7707a.p(i14, B(t7, iR & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 66:
                    entry2 = entry;
                    if (r(t7, i14, length)) {
                        int iA = A(t7, iR & 1048575);
                        lVar.f7707a.A(i14, (iA >> 31) ^ (iA << 1));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 67:
                    if (r(t7, i14, length)) {
                        entry2 = entry;
                        long jB = B(t7, iR & 1048575);
                        lVar.f7707a.C(i14, (jB >> 63) ^ (jB << 1));
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 68:
                    if (r(t7, i14, length)) {
                        lVar.e(i14, y2.f7815c.i(t7, iR & 1048575), m(length));
                    }
                    break;
            }
            entry2 = entry;
            length -= 3;
            entry = entry2;
            entry3 = null;
        }
        while (entry != null) {
            b0Var.j(d3Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x03b0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.health.platform.client.proto.n2
    public final int d(androidx.health.platform.client.proto.a aVar) {
        int i14;
        int iF;
        int iF2;
        int iF3;
        int iH;
        int iF4;
        int iH2;
        int iF5;
        int iF6;
        int iF7;
        int iE;
        int iG;
        int iF8;
        int iB;
        int iA;
        int iF9;
        int iE2;
        int iC;
        int iF10;
        int size;
        int i15;
        int iF11;
        int iF12;
        int size2;
        int iF13;
        int iG2;
        int iE3;
        int iF14;
        int iF15;
        int iH3;
        f1 f1Var = this;
        androidx.health.platform.client.proto.a aVar2 = aVar;
        Unsafe unsafe = f7611r;
        int i16 = 1048575;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        int iA2 = 0;
        while (true) {
            int[] iArr = f1Var.f7612a;
            if (i18 >= iArr.length) {
                v2<?, ?> v2Var = f1Var.f7625n;
                int iH4 = v2Var.h(v2Var.g(aVar2)) + iA2;
                if (!f1Var.f7617f) {
                    return iH4;
                }
                q2<T, Object> q2Var = f1Var.f7626o.c(aVar2).f7605a;
                int size3 = q2Var.f7749a.size();
                int iE4 = 0;
                for (int i24 = 0; i24 < size3; i24++) {
                    Map.Entry entryC = q2Var.c(i24);
                    iE4 += f0.e((f0.b) entryC.getKey(), entryC.getValue());
                }
                for (Map.Entry entry : q2Var.d()) {
                    iE4 += f0.e((f0.b) entry.getKey(), entry.getValue());
                }
                return iH4 + iE4;
            }
            int iR = f1Var.R(i18);
            int iQ = Q(iR);
            int i25 = iArr[i18];
            int i26 = iArr[i18 + 2];
            int i27 = i26 & i16;
            if (iQ <= 17) {
                if (i27 != i17) {
                    i19 = i27 == i16 ? 0 : unsafe.getInt(aVar2, i27);
                    i17 = i27;
                }
                i14 = 1 << (i26 >>> 20);
            } else {
                i14 = 0;
            }
            long j8 = iR & i16;
            if (iQ < g0.f7632f.f7638a || iQ > g0.f7633g.f7638a) {
                i27 = 0;
            }
            boolean z14 = f1Var.f7619h;
            switch (iQ) {
                case 0:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        iF = CodedOutputStream.f(i25);
                        iC = iF + 8;
                        iA2 += iC;
                    }
                    break;
                case 1:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        iF2 = CodedOutputStream.f(i25);
                        iF6 = iF2 + 4;
                        iA2 += iF6;
                    }
                    f1Var = this;
                    aVar2 = aVar;
                    break;
                case 2:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        long j14 = unsafe.getLong(aVar2, j8);
                        iF3 = CodedOutputStream.f(i25);
                        iH = CodedOutputStream.h(j14);
                        iA2 += iH + iF3;
                    }
                    f1Var = this;
                    break;
                case 3:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        long j15 = unsafe.getLong(aVar2, j8);
                        iF3 = CodedOutputStream.f(i25);
                        iH = CodedOutputStream.h(j15);
                        iA2 += iH + iF3;
                    }
                    f1Var = this;
                    break;
                case 4:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        int i28 = unsafe.getInt(aVar2, j8);
                        iF4 = CodedOutputStream.f(i25);
                        iH2 = CodedOutputStream.h(i28);
                        iA = iH2 + iF4;
                        iA2 += iA;
                    }
                    f1Var = this;
                    break;
                case 5:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        iF5 = CodedOutputStream.f(i25);
                        iF6 = iF5 + 8;
                        iA2 += iF6;
                    }
                    f1Var = this;
                    aVar2 = aVar;
                    break;
                case 6:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        iF2 = CodedOutputStream.f(i25);
                        iF6 = iF2 + 4;
                        iA2 += iF6;
                    }
                    f1Var = this;
                    aVar2 = aVar;
                    break;
                case 7:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        iF6 = CodedOutputStream.f(i25) + 1;
                        iA2 += iF6;
                    }
                    f1Var = this;
                    aVar2 = aVar;
                    break;
                case 8:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        Object object = unsafe.getObject(aVar2, j8);
                        iA2 = (object instanceof i ? CodedOutputStream.a(i25, (i) object) : CodedOutputStream.e((String) object) + CodedOutputStream.f(i25)) + iA2;
                    }
                    f1Var = this;
                    break;
                case 9:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        Object object2 = unsafe.getObject(aVar2, j8);
                        n2 n2VarM = f1Var.m(i18);
                        Class<?> cls = o2.f7739a;
                        if (object2 instanceof o0) {
                            iF8 = CodedOutputStream.f(i25);
                            iB = CodedOutputStream.b((o0) object2);
                            iC = iB + iF8;
                            iA2 += iC;
                        } else {
                            iF7 = CodedOutputStream.f(i25);
                            iE = ((androidx.health.platform.client.proto.a) ((c1) object2)).e(n2VarM);
                            iG = CodedOutputStream.g(iE);
                            iC = iG + iE + iF7;
                            iA2 += iC;
                        }
                    }
                    break;
                case 10:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        iA = CodedOutputStream.a(i25, (i) unsafe.getObject(aVar2, j8));
                        iA2 += iA;
                    }
                    f1Var = this;
                    break;
                case 11:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        int i29 = unsafe.getInt(aVar2, j8);
                        iF4 = CodedOutputStream.f(i25);
                        iH2 = CodedOutputStream.g(i29);
                        iA = iH2 + iF4;
                        iA2 += iA;
                    }
                    f1Var = this;
                    break;
                case 12:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        int i30 = unsafe.getInt(aVar2, j8);
                        iF4 = CodedOutputStream.f(i25);
                        iH2 = CodedOutputStream.h(i30);
                        iA = iH2 + iF4;
                        iA2 += iA;
                    }
                    f1Var = this;
                    break;
                case 13:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        iF2 = CodedOutputStream.f(i25);
                        iF6 = iF2 + 4;
                        iA2 += iF6;
                    }
                    f1Var = this;
                    aVar2 = aVar;
                    break;
                case 14:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        iF5 = CodedOutputStream.f(i25);
                        iF6 = iF5 + 8;
                        iA2 += iF6;
                    }
                    f1Var = this;
                    aVar2 = aVar;
                    break;
                case 15:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        int i34 = unsafe.getInt(aVar2, j8);
                        iF4 = CodedOutputStream.f(i25);
                        iH2 = CodedOutputStream.c(i34);
                        iA = iH2 + iF4;
                        iA2 += iA;
                    }
                    f1Var = this;
                    break;
                case 16:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        long j16 = unsafe.getLong(aVar2, j8);
                        iF3 = CodedOutputStream.f(i25);
                        iH = CodedOutputStream.d(j16);
                        iA2 += iH + iF3;
                    }
                    f1Var = this;
                    break;
                case 17:
                    if (f1Var.p(aVar2, i18, i17, i19, i14)) {
                        c1 c1Var = (c1) unsafe.getObject(aVar2, j8);
                        n2 n2VarM2 = f1Var.m(i18);
                        iF9 = CodedOutputStream.f(i25) * 2;
                        iE2 = ((androidx.health.platform.client.proto.a) c1Var).e(n2VarM2);
                        iC = iE2 + iF9;
                        iA2 += iC;
                    }
                    break;
                case 18:
                    iC = o2.c(i25, (List) unsafe.getObject(aVar2, j8));
                    iA2 += iC;
                    break;
                case 19:
                    iC = o2.b(i25, (List) unsafe.getObject(aVar2, j8));
                    iA2 += iC;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls2 = o2.f7739a;
                    if (list.size() == 0) {
                        iF10 = 0;
                    } else {
                        iF10 = (CodedOutputStream.f(i25) * list.size()) + o2.e(list);
                    }
                    iA2 += iF10;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls3 = o2.f7739a;
                    size = list2.size();
                    if (size == 0) {
                        iF10 = 0;
                    } else {
                        i15 = o2.i(list2);
                        iF11 = CodedOutputStream.f(i25);
                        iF10 = (iF11 * size) + i15;
                    }
                    iA2 += iF10;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls4 = o2.f7739a;
                    size = list3.size();
                    if (size == 0) {
                        iF10 = 0;
                    } else {
                        i15 = o2.d(list3);
                        iF11 = CodedOutputStream.f(i25);
                        iF10 = (iF11 * size) + i15;
                    }
                    iA2 += iF10;
                    break;
                case 23:
                    iC = o2.c(i25, (List) unsafe.getObject(aVar2, j8));
                    iA2 += iC;
                    break;
                case 24:
                    iC = o2.b(i25, (List) unsafe.getObject(aVar2, j8));
                    iA2 += iC;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls5 = o2.f7739a;
                    int size4 = list4.size();
                    iA2 += size4 == 0 ? 0 : (CodedOutputStream.f(i25) + 1) * size4;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls6 = o2.f7739a;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iF10 = 0;
                    } else {
                        iF10 = CodedOutputStream.f(i25) * size5;
                        if (list5 instanceof p0) {
                            p0 p0Var = (p0) list5;
                            for (int i35 = 0; i35 < size5; i35++) {
                                Object objK = p0Var.k();
                                if (objK instanceof i) {
                                    int size6 = ((i) objK).size();
                                    iF10 = CodedOutputStream.g(size6) + size6 + iF10;
                                } else {
                                    iF10 = CodedOutputStream.e((String) objK) + iF10;
                                }
                            }
                        } else {
                            for (int i36 = 0; i36 < size5; i36++) {
                                Object obj = list5.get(i36);
                                if (obj instanceof i) {
                                    int size7 = ((i) obj).size();
                                    iF10 = CodedOutputStream.g(size7) + size7 + iF10;
                                } else {
                                    iF10 = CodedOutputStream.e((String) obj) + iF10;
                                }
                            }
                        }
                    }
                    iA2 += iF10;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(aVar2, j8);
                    n2 n2VarM3 = f1Var.m(i18);
                    Class<?> cls7 = o2.f7739a;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iF12 = 0;
                    } else {
                        iF12 = CodedOutputStream.f(i25) * size8;
                        for (int i37 = 0; i37 < size8; i37++) {
                            Object obj2 = list6.get(i37);
                            if (obj2 instanceof o0) {
                                iF12 = CodedOutputStream.b((o0) obj2) + iF12;
                            } else {
                                int iE5 = ((androidx.health.platform.client.proto.a) ((c1) obj2)).e(n2VarM3);
                                iF12 = CodedOutputStream.g(iE5) + iE5 + iF12;
                            }
                        }
                    }
                    iA2 += iF12;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls8 = o2.f7739a;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iF10 = 0;
                    } else {
                        iF10 = CodedOutputStream.f(i25) * size9;
                        for (int i38 = 0; i38 < list7.size(); i38++) {
                            int size10 = ((i) list7.get(i38)).size();
                            iF10 += CodedOutputStream.g(size10) + size10;
                        }
                    }
                    iA2 += iF10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls9 = o2.f7739a;
                    size = list8.size();
                    if (size == 0) {
                        iF10 = 0;
                    } else {
                        i15 = o2.h(list8);
                        iF11 = CodedOutputStream.f(i25);
                        iF10 = (iF11 * size) + i15;
                    }
                    iA2 += iF10;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls10 = o2.f7739a;
                    size = list9.size();
                    if (size == 0) {
                        iF10 = 0;
                    } else {
                        i15 = o2.a(list9);
                        iF11 = CodedOutputStream.f(i25);
                        iF10 = (iF11 * size) + i15;
                    }
                    iA2 += iF10;
                    break;
                case 31:
                    iC = o2.b(i25, (List) unsafe.getObject(aVar2, j8));
                    iA2 += iC;
                    break;
                case 32:
                    iC = o2.c(i25, (List) unsafe.getObject(aVar2, j8));
                    iA2 += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls11 = o2.f7739a;
                    size = list10.size();
                    if (size == 0) {
                        iF10 = 0;
                    } else {
                        i15 = o2.f(list10);
                        iF11 = CodedOutputStream.f(i25);
                        iF10 = (iF11 * size) + i15;
                    }
                    iA2 += iF10;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls12 = o2.f7739a;
                    size = list11.size();
                    if (size == 0) {
                        iF10 = 0;
                    } else {
                        i15 = o2.g(list11);
                        iF11 = CodedOutputStream.f(i25);
                        iF10 = (iF11 * size) + i15;
                    }
                    iA2 += iF10;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls13 = o2.f7739a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls14 = o2.f7739a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 37:
                    size2 = o2.e((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 38:
                    size2 = o2.i((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 39:
                    size2 = o2.d((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls15 = o2.f7739a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls16 = o2.f7739a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls17 = o2.f7739a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 43:
                    size2 = o2.h((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 44:
                    size2 = o2.a((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls18 = o2.f7739a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls19 = o2.f7739a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 47:
                    size2 = o2.f((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 48:
                    size2 = o2.g((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i27, size2);
                        }
                        iF13 = CodedOutputStream.f(i25);
                        iG2 = CodedOutputStream.g(size2);
                        iA2 += iG2 + iF13 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(aVar2, j8);
                    n2 n2VarM4 = f1Var.m(i18);
                    Class<?> cls20 = o2.f7739a;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        iE3 = 0;
                    } else {
                        iE3 = 0;
                        for (int i39 = 0; i39 < size11; i39++) {
                            iE3 += ((androidx.health.platform.client.proto.a) ((c1) list19.get(i39))).e(n2VarM4) + (CodedOutputStream.f(i25) * 2);
                        }
                    }
                    iA2 += iE3;
                    break;
                case 50:
                    iC = f1Var.f7627p.getSerializedSize(i25, unsafe.getObject(aVar2, j8), f1Var.l(i18));
                    iA2 += iC;
                    break;
                case 51:
                    if (f1Var.r(aVar2, i25, i18)) {
                        iF = CodedOutputStream.f(i25);
                        iC = iF + 8;
                        iA2 += iC;
                    }
                    break;
                case 52:
                    if (f1Var.r(aVar2, i25, i18)) {
                        iF14 = CodedOutputStream.f(i25);
                        iC = iF14 + 4;
                        iA2 += iC;
                    }
                    break;
                case 53:
                    if (f1Var.r(aVar2, i25, i18)) {
                        long jB = B(aVar2, j8);
                        iF15 = CodedOutputStream.f(i25);
                        iH3 = CodedOutputStream.h(jB);
                        iA2 += iH3 + iF15;
                    }
                    break;
                case 54:
                    if (f1Var.r(aVar2, i25, i18)) {
                        long jB2 = B(aVar2, j8);
                        iF15 = CodedOutputStream.f(i25);
                        iH3 = CodedOutputStream.h(jB2);
                        iA2 += iH3 + iF15;
                    }
                    break;
                case 55:
                    if (f1Var.r(aVar2, i25, i18)) {
                        int iA3 = A(aVar2, j8);
                        iF8 = CodedOutputStream.f(i25);
                        iB = CodedOutputStream.h(iA3);
                        iC = iB + iF8;
                        iA2 += iC;
                    }
                    break;
                case 56:
                    if (f1Var.r(aVar2, i25, i18)) {
                        iF = CodedOutputStream.f(i25);
                        iC = iF + 8;
                        iA2 += iC;
                    }
                    break;
                case 57:
                    if (f1Var.r(aVar2, i25, i18)) {
                        iF14 = CodedOutputStream.f(i25);
                        iC = iF14 + 4;
                        iA2 += iC;
                    }
                    break;
                case 58:
                    if (f1Var.r(aVar2, i25, i18)) {
                        iC = CodedOutputStream.f(i25) + 1;
                        iA2 += iC;
                    }
                    break;
                case 59:
                    if (f1Var.r(aVar2, i25, i18)) {
                        Object object3 = unsafe.getObject(aVar2, j8);
                        iA2 = (object3 instanceof i ? CodedOutputStream.a(i25, (i) object3) : CodedOutputStream.e((String) object3) + CodedOutputStream.f(i25)) + iA2;
                    }
                    break;
                case 60:
                    if (f1Var.r(aVar2, i25, i18)) {
                        Object object4 = unsafe.getObject(aVar2, j8);
                        n2 n2VarM5 = f1Var.m(i18);
                        Class<?> cls21 = o2.f7739a;
                        if (object4 instanceof o0) {
                            iF8 = CodedOutputStream.f(i25);
                            iB = CodedOutputStream.b((o0) object4);
                            iC = iB + iF8;
                            iA2 += iC;
                        } else {
                            iF7 = CodedOutputStream.f(i25);
                            iE = ((androidx.health.platform.client.proto.a) ((c1) object4)).e(n2VarM5);
                            iG = CodedOutputStream.g(iE);
                            iC = iG + iE + iF7;
                            iA2 += iC;
                        }
                    }
                    break;
                case 61:
                    if (f1Var.r(aVar2, i25, i18)) {
                        iC = CodedOutputStream.a(i25, (i) unsafe.getObject(aVar2, j8));
                        iA2 += iC;
                    }
                    break;
                case 62:
                    if (f1Var.r(aVar2, i25, i18)) {
                        int iA4 = A(aVar2, j8);
                        iF8 = CodedOutputStream.f(i25);
                        iB = CodedOutputStream.g(iA4);
                        iC = iB + iF8;
                        iA2 += iC;
                    }
                    break;
                case 63:
                    if (f1Var.r(aVar2, i25, i18)) {
                        int iA5 = A(aVar2, j8);
                        iF8 = CodedOutputStream.f(i25);
                        iB = CodedOutputStream.h(iA5);
                        iC = iB + iF8;
                        iA2 += iC;
                    }
                    break;
                case 64:
                    if (f1Var.r(aVar2, i25, i18)) {
                        iF14 = CodedOutputStream.f(i25);
                        iC = iF14 + 4;
                        iA2 += iC;
                    }
                    break;
                case 65:
                    if (f1Var.r(aVar2, i25, i18)) {
                        iF = CodedOutputStream.f(i25);
                        iC = iF + 8;
                        iA2 += iC;
                    }
                    break;
                case 66:
                    if (f1Var.r(aVar2, i25, i18)) {
                        int iA6 = A(aVar2, j8);
                        iF8 = CodedOutputStream.f(i25);
                        iB = CodedOutputStream.c(iA6);
                        iC = iB + iF8;
                        iA2 += iC;
                    }
                    break;
                case 67:
                    if (f1Var.r(aVar2, i25, i18)) {
                        long jB3 = B(aVar2, j8);
                        iF15 = CodedOutputStream.f(i25);
                        iH3 = CodedOutputStream.d(jB3);
                        iA2 += iH3 + iF15;
                    }
                    break;
                case 68:
                    if (f1Var.r(aVar2, i25, i18)) {
                        c1 c1Var2 = (c1) unsafe.getObject(aVar2, j8);
                        n2 n2VarM6 = f1Var.m(i18);
                        iF9 = CodedOutputStream.f(i25) * 2;
                        iE2 = ((androidx.health.platform.client.proto.a) c1Var2).e(n2VarM6);
                        iC = iE2 + iF9;
                        iA2 += iC;
                    }
                    break;
            }
            i18 += 3;
            i16 = 1048575;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23621. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // androidx.health.platform.client.proto.n2
    public final void e(java.lang.Object r21, androidx.health.platform.client.proto.k r22, androidx.health.platform.client.proto.a0 r23) {
        /*
            Method dump skipped, instruction units count: 2362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.platform.client.proto.f1.e(java.lang.Object, androidx.health.platform.client.proto.k, androidx.health.platform.client.proto.a0):void");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.health.platform.client.proto.n2
    public final boolean f(j0 j0Var, j0 j0Var2) {
        int[] iArr = this.f7612a;
        int length = iArr.length;
        int i14 = 0;
        while (true) {
            boolean zM = true;
            if (i14 < length) {
                int iR = R(i14);
                long j8 = iR & 1048575;
                switch (Q(iR)) {
                    case 0:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar = y2.f7815c;
                            if (Double.doubleToLongBits(eVar.e(j0Var, j8)) != Double.doubleToLongBits(eVar.e(j0Var2, j8))) {
                                zM = false;
                            }
                        }
                        break;
                    case 1:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar2 = y2.f7815c;
                            if (Float.floatToIntBits(eVar2.f(j0Var, j8)) != Float.floatToIntBits(eVar2.f(j0Var2, j8))) {
                                zM = false;
                            }
                        }
                        break;
                    case 2:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar3 = y2.f7815c;
                            if (eVar3.h(j0Var, j8) != eVar3.h(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 3:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar4 = y2.f7815c;
                            if (eVar4.h(j0Var, j8) != eVar4.h(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 4:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar5 = y2.f7815c;
                            if (eVar5.g(j0Var, j8) != eVar5.g(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 5:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar6 = y2.f7815c;
                            if (eVar6.h(j0Var, j8) != eVar6.h(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 6:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar7 = y2.f7815c;
                            if (eVar7.g(j0Var, j8) != eVar7.g(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 7:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar8 = y2.f7815c;
                            if (eVar8.c(j0Var, j8) != eVar8.c(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 8:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar9 = y2.f7815c;
                            if (!o2.m(eVar9.i(j0Var, j8), eVar9.i(j0Var2, j8))) {
                                zM = false;
                            }
                        }
                        break;
                    case 9:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar10 = y2.f7815c;
                            if (!o2.m(eVar10.i(j0Var, j8), eVar10.i(j0Var2, j8))) {
                                zM = false;
                            }
                        }
                        break;
                    case 10:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar11 = y2.f7815c;
                            if (!o2.m(eVar11.i(j0Var, j8), eVar11.i(j0Var2, j8))) {
                                zM = false;
                            }
                        }
                        break;
                    case 11:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar12 = y2.f7815c;
                            if (eVar12.g(j0Var, j8) != eVar12.g(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 12:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar13 = y2.f7815c;
                            if (eVar13.g(j0Var, j8) != eVar13.g(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 13:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar14 = y2.f7815c;
                            if (eVar14.g(j0Var, j8) != eVar14.g(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 14:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar15 = y2.f7815c;
                            if (eVar15.h(j0Var, j8) != eVar15.h(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 15:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar16 = y2.f7815c;
                            if (eVar16.g(j0Var, j8) != eVar16.g(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 16:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar17 = y2.f7815c;
                            if (eVar17.h(j0Var, j8) != eVar17.h(j0Var2, j8)) {
                                zM = false;
                            }
                        }
                        break;
                    case 17:
                        if (!g(j0Var, j0Var2, i14)) {
                            zM = false;
                        } else {
                            y2.e eVar18 = y2.f7815c;
                            if (!o2.m(eVar18.i(j0Var, j8), eVar18.i(j0Var2, j8))) {
                                zM = false;
                            }
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
                        y2.e eVar19 = y2.f7815c;
                        zM = o2.m(eVar19.i(j0Var, j8), eVar19.i(j0Var2, j8));
                        break;
                    case 50:
                        y2.e eVar20 = y2.f7815c;
                        zM = o2.m(eVar20.i(j0Var, j8), eVar20.i(j0Var2, j8));
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
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j14 = iArr[i14 + 2] & 1048575;
                        y2.e eVar21 = y2.f7815c;
                        if (eVar21.g(j0Var, j14) != eVar21.g(j0Var2, j14) || !o2.m(eVar21.i(j0Var, j8), eVar21.i(j0Var2, j8))) {
                            zM = false;
                        }
                        break;
                }
                if (zM) {
                    i14 += 3;
                }
            } else {
                v2<?, ?> v2Var = this.f7625n;
                if (v2Var.g(j0Var).equals(v2Var.g(j0Var2))) {
                    if (!this.f7617f) {
                        return true;
                    }
                    b0<?> b0Var = this.f7626o;
                    return b0Var.c(j0Var).equals(b0Var.c(j0Var2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(j0 j0Var, j0 j0Var2, int i14) {
        return o(j0Var, i14) == o(j0Var2, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.health.platform.client.proto.n2] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.health.platform.client.proto.n2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.health.platform.client.proto.n2] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [androidx.health.platform.client.proto.n2] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // androidx.health.platform.client.proto.n2
    public final boolean isInitialized(T t7) {
        int i14;
        int i15;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        while (i18 < this.f7621j) {
            int i19 = this.f7620i[i18];
            int[] iArr = this.f7612a;
            int i24 = iArr[i19];
            int iR = R(i19);
            int i25 = iArr[i19 + 2];
            int i26 = i25 & 1048575;
            int i27 = 1 << (i25 >>> 20);
            if (i26 != i16) {
                if (i26 != 1048575) {
                    i17 = f7611r.getInt(t7, i26);
                }
                i15 = i17;
                i14 = i26;
            } else {
                int i28 = i17;
                i14 = i16;
                i15 = i28;
            }
            if ((268435456 & iR) == 0 || p(t7, i19, i14, i15, i27)) {
                int iQ = Q(iR);
                if (iQ == 9 || iQ == 17) {
                    if (!p(t7, i19, i14, i15, i27)) {
                        continue;
                    } else if (!m(i19).isInitialized(y2.f7815c.i(t7, iR & 1048575))) {
                    }
                    i18++;
                    i16 = i14;
                    i17 = i15;
                } else {
                    if (iQ != 27) {
                        if (iQ == 60 || iQ == 68) {
                            if (!r(t7, i24, i19)) {
                                continue;
                            } else if (!m(i19).isInitialized(y2.f7815c.i(t7, iR & 1048575))) {
                            }
                            i18++;
                            i16 = i14;
                            i17 = i15;
                        } else if (iQ != 49) {
                            if (iQ != 50) {
                                continue;
                            } else {
                                Object objI = y2.f7815c.i(t7, iR & 1048575);
                                x0 x0Var = this.f7627p;
                                w0 w0VarForMapData = x0Var.forMapData(objI);
                                if (!w0VarForMapData.isEmpty() && x0Var.forMapMetadata(l(i19)).f7801c.f7559a == c3.MESSAGE) {
                                    ?? A = 0;
                                    for (Object obj : w0VarForMapData.values()) {
                                        if (A == 0) {
                                            A = A;
                                            A = r1.f7767c.a(obj.getClass());
                                        }
                                        A = A;
                                        if (!A.isInitialized(obj)) {
                                        }
                                    }
                                }
                            }
                            i18++;
                            i16 = i14;
                            i17 = i15;
                        }
                    }
                    List list = (List) y2.f7815c.i(t7, iR & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? M = m(i19);
                        for (int i29 = 0; i29 < list.size(); i29++) {
                            if (M.isInitialized(list.get(i29))) {
                            }
                        }
                    }
                    i18++;
                    i16 = i14;
                    i17 = i15;
                }
            }
        }
        return !this.f7617f || this.f7626o.c(t7).h();
    }

    public final <UT, UB> UB j(Object obj, int i14, UB ub3, v2<UT, UB> v2Var, Object obj2) {
        l0.c cVarK;
        int i15 = this.f7612a[i14];
        Object objI = y2.f7815c.i(obj, R(i14) & 1048575);
        if (objI == null || (cVarK = k(i14)) == null) {
            return ub3;
        }
        x0 x0Var = this.f7627p;
        w0 w0VarForMutableMapData = x0Var.forMutableMapData(objI);
        v0.a<?, ?> aVarForMapMetadata = x0Var.forMapMetadata(l(i14));
        Iterator it = w0VarForMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!cVarK.isInRange(((Integer) entry.getValue()).intValue())) {
                if (ub3 == null) {
                    ub3 = (UB) v2Var.f(obj2);
                }
                i.f fVar = new i.f(v0.a(aVarForMapMetadata, entry.getKey(), entry.getValue()), null);
                CodedOutputStream.b bVar = fVar.f7662a;
                try {
                    v0.c(bVar, aVarForMapMetadata, entry.getKey(), entry.getValue());
                    if (bVar.E() != 0) {
                        vb.h.z("Did not write as much data as expected.");
                        return null;
                    }
                    v2Var.d(ub3, i15, new i.h(fVar.f7663b));
                    it.remove();
                } catch (IOException e4) {
                    o2.c.p(e4);
                    return null;
                }
            }
        }
        return ub3;
    }

    public final l0.c k(int i14) {
        return (l0.c) this.f7613b[androidx.core.view.j.v(i14, 3, 2, 1)];
    }

    public final Object l(int i14) {
        return this.f7613b[(i14 / 3) * 2];
    }

    public final n2 m(int i14) {
        int i15 = (i14 / 3) * 2;
        Object[] objArr = this.f7613b;
        n2 n2Var = (n2) objArr[i15];
        if (n2Var != null) {
            return n2Var;
        }
        n2<T> n2VarA = r1.f7767c.a((Class) objArr[i15 + 1]);
        objArr[i15] = n2VarA;
        return n2VarA;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.health.platform.client.proto.n2
    public final void makeImmutable(T t7) {
        if (q(t7)) {
            if (t7 instanceof j0) {
                j0 j0Var = (j0) t7;
                j0Var.g(Integer.MAX_VALUE);
                j0Var.memoizedHashCode = 0;
                j0Var.n();
            }
            int[] iArr = this.f7612a;
            int length = iArr.length;
            for (int i14 = 0; i14 < length; i14 += 3) {
                int iR = R(i14);
                long j8 = 1048575 & iR;
                int iQ = Q(iR);
                if (iQ != 9) {
                    if (iQ != 60 && iQ != 68) {
                        switch (iQ) {
                            case 17:
                                if (o(t7, i14)) {
                                    m(i14).makeImmutable(f7611r.getObject(t7, j8));
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
                                this.f7624m.c(t7, j8);
                                break;
                            case 50:
                                Unsafe unsafe = f7611r;
                                Object object = unsafe.getObject(t7, j8);
                                if (object != null) {
                                    unsafe.putObject(t7, j8, this.f7627p.toImmutable(object));
                                }
                                break;
                        }
                    } else if (r(t7, iArr[i14], i14)) {
                        m(i14).makeImmutable(f7611r.getObject(t7, j8));
                    }
                } else if (o(t7, i14)) {
                    m(i14).makeImmutable(f7611r.getObject(t7, j8));
                }
            }
            this.f7625n.j(t7);
            if (this.f7617f) {
                this.f7626o.f(t7);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // androidx.health.platform.client.proto.n2
    public final void mergeFrom(T t7, T t14) {
        T t15;
        h(t7);
        t14.getClass();
        int i14 = 0;
        while (true) {
            int[] iArr = this.f7612a;
            if (i14 >= iArr.length) {
                T t16 = t7;
                Class<?> cls = o2.f7739a;
                v2<?, ?> v2Var = this.f7625n;
                v2Var.o(t16, v2Var.k(v2Var.g(t16), v2Var.g(t14)));
                if (this.f7617f) {
                    o2.l(this.f7626o, t16, t14);
                    return;
                }
                return;
            }
            int iR = R(i14);
            long j8 = 1048575 & iR;
            int i15 = iArr[i14];
            switch (Q(iR)) {
                case 0:
                    if (!o(t14, i14)) {
                        t15 = t7;
                    } else {
                        y2.e eVar = y2.f7815c;
                        t15 = t7;
                        eVar.m(t15, j8, eVar.e(t14, j8));
                        L(t15, i14);
                    }
                    break;
                case 1:
                    if (o(t14, i14)) {
                        y2.e eVar2 = y2.f7815c;
                        eVar2.n(t7, j8, eVar2.f(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 2:
                    if (o(t14, i14)) {
                        y2.o(t7, j8, y2.f7815c.h(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 3:
                    if (o(t14, i14)) {
                        y2.o(t7, j8, y2.f7815c.h(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 4:
                    if (o(t14, i14)) {
                        y2.n(t7, j8, y2.f7815c.g(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 5:
                    if (o(t14, i14)) {
                        y2.o(t7, j8, y2.f7815c.h(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 6:
                    if (o(t14, i14)) {
                        y2.n(t7, j8, y2.f7815c.g(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 7:
                    if (o(t14, i14)) {
                        y2.e eVar3 = y2.f7815c;
                        eVar3.k(t7, j8, eVar3.c(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 8:
                    if (o(t14, i14)) {
                        y2.p(t7, j8, y2.f7815c.i(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 9:
                    t(t7, t14, i14);
                    t15 = t7;
                    break;
                case 10:
                    if (o(t14, i14)) {
                        y2.p(t7, j8, y2.f7815c.i(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 11:
                    if (o(t14, i14)) {
                        y2.n(t7, j8, y2.f7815c.g(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 12:
                    if (o(t14, i14)) {
                        y2.n(t7, j8, y2.f7815c.g(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 13:
                    if (o(t14, i14)) {
                        y2.n(t7, j8, y2.f7815c.g(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 14:
                    if (o(t14, i14)) {
                        y2.o(t7, j8, y2.f7815c.h(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 15:
                    if (o(t14, i14)) {
                        y2.n(t7, j8, y2.f7815c.g(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 16:
                    if (o(t14, i14)) {
                        y2.o(t7, j8, y2.f7815c.h(t14, j8));
                        L(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 17:
                    t(t7, t14, i14);
                    t15 = t7;
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
                    this.f7624m.b(t7, t14, j8);
                    t15 = t7;
                    break;
                case 50:
                    Class<?> cls2 = o2.f7739a;
                    y2.e eVar4 = y2.f7815c;
                    y2.p(t7, j8, this.f7627p.mergeFrom(eVar4.i(t7, j8), eVar4.i(t14, j8)));
                    t15 = t7;
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
                    if (r(t14, i15, i14)) {
                        y2.p(t7, j8, y2.f7815c.i(t14, j8));
                        M(t7, i15, i14);
                    }
                    t15 = t7;
                    break;
                case 60:
                    u(t7, t14, i14);
                    t15 = t7;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(t14, i15, i14)) {
                        y2.p(t7, j8, y2.f7815c.i(t14, j8));
                        M(t7, i15, i14);
                    }
                    t15 = t7;
                    break;
                case 68:
                    u(t7, t14, i14);
                    t15 = t7;
                    break;
                default:
                    t15 = t7;
                    break;
            }
            i14 += 3;
            t7 = t15;
        }
    }

    @Override // androidx.health.platform.client.proto.n2
    public final T newInstance() {
        return (T) this.f7623l.newInstance(this.f7616e);
    }

    public final boolean o(T t7, int i14) {
        int i15 = this.f7612a[i14 + 2];
        long j8 = i15 & 1048575;
        if (j8 == 1048575) {
            int iR = R(i14);
            long j14 = iR & 1048575;
            switch (Q(iR)) {
                case 0:
                    if (Double.doubleToRawLongBits(y2.f7815c.e(t7, j14)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(y2.f7815c.f(t7, j14)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (y2.f7815c.h(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (y2.f7815c.h(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (y2.f7815c.g(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (y2.f7815c.h(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (y2.f7815c.g(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return y2.f7815c.c(t7, j14);
                case 8:
                    Object objI = y2.f7815c.i(t7, j14);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof i) {
                        return !i.f7657b.equals(objI);
                    }
                    vb.h.w();
                    return false;
                case 9:
                    if (y2.f7815c.i(t7, j14) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !i.f7657b.equals(y2.f7815c.i(t7, j14));
                case 11:
                    if (y2.f7815c.g(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (y2.f7815c.g(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (y2.f7815c.g(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (y2.f7815c.h(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (y2.f7815c.g(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (y2.f7815c.h(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (y2.f7815c.i(t7, j14) == null) {
                        return false;
                    }
                    break;
                default:
                    vb.h.w();
                    return false;
            }
        } else {
            if ((y2.f7815c.g(t7, j8) & (1 << (i15 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean p(T t7, int i14, int i15, int i16, int i17) {
        if (i15 == 1048575) {
            return o(t7, i14);
        }
        return (i16 & i17) != 0;
    }

    public final boolean r(T t7, int i14, int i15) {
        return y2.f7815c.g(t7, (long) (this.f7612a[i15 + 2] & 1048575)) == i14;
    }

    public final void s(Object obj, int i14, Object obj2, a0 a0Var, k kVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        long jR = R(i14) & 1048575;
        Object objI = y2.f7815c.i(obj, jR);
        x0 x0Var = this.f7627p;
        if (objI == null) {
            objI = x0Var.a();
            y2.p(obj, jR, objI);
        } else if (x0Var.isImmutable(objI)) {
            w0 w0VarA = x0Var.a();
            x0Var.mergeFrom(w0VarA, objI);
            y2.p(obj, jR, w0VarA);
            objI = w0VarA;
        }
        w0 w0VarForMutableMapData = x0Var.forMutableMapData(objI);
        v0.a<?, ?> aVarForMapMetadata = x0Var.forMapMetadata(obj2);
        kVar.y(2);
        j jVar = kVar.f7698a;
        int iG = jVar.g(jVar.x());
        Object objJ = aVarForMapMetadata.f7800b;
        Object obj3 = aVarForMapMetadata.f7802d;
        Object objJ2 = obj3;
        while (true) {
            try {
                int iB = kVar.b();
                if (iB == Integer.MAX_VALUE || jVar.e()) {
                    break;
                }
                if (iB == 1) {
                    objJ = kVar.j(aVarForMapMetadata.f7799a, null, null);
                } else if (iB != 2) {
                    try {
                        if (!kVar.z()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!kVar.z()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objJ2 = kVar.j(aVarForMapMetadata.f7801c, obj3.getClass(), a0Var);
                }
            } catch (Throwable th3) {
                jVar.f(iG);
                throw th3;
            }
        }
        w0VarForMutableMapData.put(objJ, objJ2);
        jVar.f(iG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(T t7, T t14, int i14) {
        if (o(t14, i14)) {
            long jR = R(i14) & 1048575;
            Unsafe unsafe = f7611r;
            Object object = unsafe.getObject(t14, jR);
            if (object == null) {
                com.google.protobuf.a.f(this.f7612a[i14], t14);
                return;
            }
            n2 n2VarM = m(i14);
            if (!o(t7, i14)) {
                if (q(object)) {
                    Object objNewInstance = n2VarM.newInstance();
                    n2VarM.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t7, jR, objNewInstance);
                } else {
                    unsafe.putObject(t7, jR, object);
                }
                L(t7, i14);
                return;
            }
            Object object2 = unsafe.getObject(t7, jR);
            if (!q(object2)) {
                Object objNewInstance2 = n2VarM.newInstance();
                n2VarM.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t7, jR, objNewInstance2);
                object2 = objNewInstance2;
            }
            n2VarM.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(T t7, T t14, int i14) {
        int[] iArr = this.f7612a;
        int i15 = iArr[i14];
        if (r(t14, i15, i14)) {
            long jR = R(i14) & 1048575;
            Unsafe unsafe = f7611r;
            Object object = unsafe.getObject(t14, jR);
            if (object == null) {
                com.google.protobuf.a.f(iArr[i14], t14);
                return;
            }
            n2 n2VarM = m(i14);
            if (!r(t7, i15, i14)) {
                if (q(object)) {
                    Object objNewInstance = n2VarM.newInstance();
                    n2VarM.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t7, jR, objNewInstance);
                } else {
                    unsafe.putObject(t7, jR, object);
                }
                M(t7, i15, i14);
                return;
            }
            Object object2 = unsafe.getObject(t7, jR);
            if (!q(object2)) {
                Object objNewInstance2 = n2VarM.newInstance();
                n2VarM.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t7, jR, objNewInstance2);
                object2 = objNewInstance2;
            }
            n2VarM.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object v(T t7, int i14) {
        n2 n2VarM = m(i14);
        long jR = R(i14) & 1048575;
        if (!o(t7, i14)) {
            return n2VarM.newInstance();
        }
        Object object = f7611r.getObject(t7, jR);
        if (q(object)) {
            return object;
        }
        Object objNewInstance = n2VarM.newInstance();
        if (object != null) {
            n2VarM.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object w(T t7, int i14, int i15) {
        n2 n2VarM = m(i15);
        if (!r(t7, i14, i15)) {
            return n2VarM.newInstance();
        }
        Object object = f7611r.getObject(t7, R(i15) & 1048575);
        if (q(object)) {
            return object;
        }
        Object objNewInstance = n2VarM.newInstance();
        if (object != null) {
            n2VarM.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }
}
