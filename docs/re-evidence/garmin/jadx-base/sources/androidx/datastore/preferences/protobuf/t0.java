package androidx.datastore.preferences.protobuf;

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
public final class t0<T> implements g1<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f6853q = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Unsafe f6854r = p1.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f6856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f6859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f6863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v0 f6866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e0 f6867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m1<?, ?> f6868n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p<?> f6869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l0 f6870p;

    private t0(int[] iArr, Object[] objArr, int i14, int i15, q0 q0Var, b1 b1Var, boolean z14, int[] iArr2, int i16, int i17, v0 v0Var, e0 e0Var, m1<?, ?> m1Var, p<?> pVar, l0 l0Var) {
        this.f6855a = iArr;
        this.f6856b = objArr;
        this.f6857c = i14;
        this.f6858d = i15;
        this.f6861g = q0Var instanceof x;
        this.f6860f = pVar != null && pVar.e(q0Var);
        this.f6862h = z14;
        this.f6863i = iArr2;
        this.f6864j = i16;
        this.f6865k = i17;
        this.f6866l = v0Var;
        this.f6867m = e0Var;
        this.f6868n = m1Var;
        this.f6869o = pVar;
        this.f6859e = q0Var;
        this.f6870p = l0Var;
    }

    public static Field C(Class<?> cls, String str) {
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

    public static int H(int i14) {
        return (i14 & 267386880) >>> 20;
    }

    public static void L(int i14, Object obj, u1 u1Var) {
        if (obj instanceof String) {
            ((k) u1Var).f6774a.z(i14, (String) obj);
        } else {
            ((k) u1Var).b(i14, (h) obj);
        }
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof x) {
            return ((x) obj).j();
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
    public static t0 t(o0 o0Var, v0 v0Var, e0 e0Var, m1 m1Var, p pVar, l0 l0Var) {
        int i14;
        int i15;
        z.c cVar;
        Object[] objArr;
        int[] iArr;
        int[] iArr2;
        int i16;
        int i17;
        int i18;
        int iNumberOfTrailingZeros;
        int i19;
        int i24;
        int i25;
        Class<?> type;
        Object obj;
        char c14;
        boolean z14;
        int i26;
        int i27;
        if (o0Var instanceof e1) {
            return u((e1) o0Var, v0Var, e0Var, m1Var, pVar, l0Var);
        }
        k1 k1Var = (k1) o0Var;
        s[] sVarArr = k1Var.f6780d;
        if (sVarArr.length == 0) {
            i14 = 0;
            i15 = 0;
        } else {
            i14 = sVarArr[0].f6814d;
            i15 = sVarArr[sVarArr.length - 1].f6814d;
        }
        int length = sVarArr.length;
        int[] iArr3 = new int[length * 3];
        Object[] objArr2 = new Object[length * 2];
        int i28 = 0;
        int i29 = 0;
        for (s sVar : sVarArr) {
            u uVar = sVar.f6812b;
            if (uVar == u.f6888i) {
                i28++;
            } else {
                int i30 = uVar.f6891a;
                if (i30 >= 18 && i30 <= 49) {
                    i29++;
                }
            }
        }
        int[] iArr4 = i28 > 0 ? new int[i28] : null;
        int[] iArr5 = i29 > 0 ? new int[i29] : null;
        int[] iArr6 = k1Var.f6779c;
        int[] iArr7 = f6853q;
        if (iArr6 == null) {
            iArr6 = iArr7;
        }
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        while (i36 < sVarArr.length) {
            s sVar2 = sVarArr[i36];
            int i39 = sVar2.f6814d;
            u uVar2 = sVar2.f6812b;
            s[] sVarArr2 = sVarArr;
            Field field = sVar2.f6811a;
            int i44 = i14;
            y0 y0Var = sVar2.f6819i;
            int i45 = i15;
            z.c cVar2 = sVar2.f6823m;
            if (y0Var != null) {
                cVar = cVar2;
                int i46 = uVar2.f6891a + 51;
                Field field2 = y0Var.f6935b;
                objArr = objArr2;
                p1.e eVar = p1.f6801c;
                iArr = iArr4;
                iArr2 = iArr5;
                int i47 = (int) eVar.i(field2);
                i16 = (int) eVar.i(y0Var.f6934a);
                i17 = i47;
                i18 = i46;
            } else {
                cVar = cVar2;
                objArr = objArr2;
                iArr = iArr4;
                iArr2 = iArr5;
                p1.e eVar2 = p1.f6801c;
                int i48 = (int) eVar2.i(field);
                int i49 = uVar2.f6891a;
                u.b bVar = uVar2.f6892b;
                if (bVar.f6900a || bVar == u.b.MAP) {
                    Field field3 = sVar2.f6820j;
                    if (field3 == null) {
                        i17 = i48;
                        i18 = i49;
                        i16 = 0;
                    } else {
                        i16 = (int) eVar2.i(field3);
                        i17 = i48;
                        i18 = i49;
                    }
                } else {
                    Field field4 = sVar2.f6815e;
                    i16 = field4 == null ? 1048575 : (int) eVar2.i(field4);
                    iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(sVar2.f6816f);
                    i17 = i48;
                    i18 = i49;
                }
                iArr3[i34] = sVar2.f6814d;
                int i54 = i34 + 1;
                int i55 = i16;
                if (sVar2.f6818h) {
                    i19 = 536870912;
                } else {
                    i19 = 0;
                }
                if (sVar2.f6817g) {
                    i24 = 268435456;
                } else {
                    i24 = 0;
                }
                iArr3[i54] = i19 | i24 | (i18 << 20) | i17;
                iArr3[i34 + 2] = (iNumberOfTrailingZeros << 20) | i55;
                i25 = s.a.f6824a[uVar2.ordinal()];
                if (i25 == 1 && i25 != 2) {
                    type = (i25 == 3 || i25 == 4) ? sVar2.f6813c : null;
                } else if (field != null) {
                    type = field.getType();
                } else {
                    type = sVar2.f6821k;
                }
                obj = sVar2.f6822l;
                if (obj != null) {
                    i27 = (i34 / 3) * 2;
                    objArr[i27] = obj;
                    if (type != null) {
                        objArr[i27 + 1] = type;
                    } else if (cVar != null) {
                        objArr[i27 + 1] = cVar;
                    }
                    c14 = 2;
                    z14 = true;
                } else if (type != null) {
                    c14 = 2;
                    z14 = true;
                    objArr[androidx.core.view.j.v(i34, 3, 2, 1)] = type;
                } else {
                    c14 = 2;
                    z14 = true;
                    if (cVar != null) {
                        objArr[androidx.core.view.j.v(i34, 3, 2, 1)] = cVar;
                    }
                }
                if (i35 < iArr6.length && iArr6[i35] == i39) {
                    iArr6[i35] = i34;
                    i35++;
                }
                if (uVar2 == u.f6888i) {
                    iArr[i37] = i34;
                    i37++;
                } else {
                    i26 = uVar2.f6891a;
                    if (i26 < 18 && i26 <= 49) {
                        iArr2[i38] = (int) p1.f6801c.i(field);
                        i38++;
                    }
                }
                i36++;
                i34 += 3;
                sVarArr = sVarArr2;
                i14 = i44;
                i15 = i45;
                objArr2 = objArr;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
            iNumberOfTrailingZeros = 0;
            iArr3[i34] = sVar2.f6814d;
            int i56 = i34 + 1;
            int i57 = i16;
            if (sVar2.f6818h) {
                i19 = 536870912;
            } else {
                i19 = 0;
            }
            if (sVar2.f6817g) {
                i24 = 268435456;
            } else {
                i24 = 0;
            }
            iArr3[i56] = i19 | i24 | (i18 << 20) | i17;
            iArr3[i34 + 2] = (iNumberOfTrailingZeros << 20) | i57;
            i25 = s.a.f6824a[uVar2.ordinal()];
            if (i25 == 1) {
                if (field != null) {
                    type = field.getType();
                } else {
                    type = sVar2.f6821k;
                }
            } else if (field != null) {
                type = field.getType();
            } else {
                type = sVar2.f6821k;
            }
            obj = sVar2.f6822l;
            if (obj != null) {
                i27 = (i34 / 3) * 2;
                objArr[i27] = obj;
                if (type != null) {
                    objArr[i27 + 1] = type;
                } else if (cVar != null) {
                    objArr[i27 + 1] = cVar;
                }
                c14 = 2;
                z14 = true;
            } else if (type != null) {
                c14 = 2;
                z14 = true;
                objArr[androidx.core.view.j.v(i34, 3, 2, 1)] = type;
            } else {
                c14 = 2;
                z14 = true;
                if (cVar != null) {
                    objArr[androidx.core.view.j.v(i34, 3, 2, 1)] = cVar;
                }
            }
            if (i35 < iArr6.length) {
                iArr6[i35] = i34;
                i35++;
            }
            if (uVar2 == u.f6888i) {
                iArr[i37] = i34;
                i37++;
            } else {
                i26 = uVar2.f6891a;
                if (i26 < 18) {
                }
            }
            i36++;
            i34 += 3;
            sVarArr = sVarArr2;
            i14 = i44;
            i15 = i45;
            objArr2 = objArr;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i58 = i14;
        int i59 = i15;
        Object[] objArr3 = objArr2;
        int[] iArr8 = iArr4;
        int[] iArr9 = iArr5;
        int[] iArr10 = iArr8 == null ? iArr7 : iArr8;
        int[] iArr11 = iArr9 == null ? iArr7 : iArr9;
        int[] iArr12 = new int[iArr6.length + iArr10.length + iArr11.length];
        System.arraycopy(iArr6, 0, iArr12, 0, iArr6.length);
        System.arraycopy(iArr10, 0, iArr12, iArr6.length, iArr10.length);
        System.arraycopy(iArr11, 0, iArr12, iArr6.length + iArr10.length, iArr11.length);
        return new t0(iArr3, objArr3, i58, i59, k1Var.f6781e, k1Var.f6777a, true, iArr12, iArr6.length, iArr6.length + iArr10.length, v0Var, e0Var, m1Var, pVar, l0Var);
    }

    /* JADX WARN: Code duplicated, block: B:166:0x035c  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ba  */
    public static <T> t0<T> u(e1 e1Var, v0 v0Var, e0 e0Var, m1<?, ?> m1Var, p<?> pVar, l0 l0Var) {
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
        Field fieldC;
        char cCharAt9;
        int i47;
        Field fieldC2;
        Field fieldC3;
        int i48;
        char cCharAt10;
        int i49;
        char cCharAt11;
        int i54;
        char cCharAt12;
        int i55;
        char cCharAt13;
        String str = e1Var.f6699b;
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
            iArr = f6853q;
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
        Unsafe unsafe = f6854r;
        Object[] objArr = e1Var.f6700c;
        Class<?> cls = e1Var.f6698a.getClass();
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
                } else if (i118 == 12 && (e1Var.getSyntax().equals(b1.PROTO2) || (iCharAt11 & 2048) != 0)) {
                    objArr2[androidx.core.view.j.v(i103, 3, 2, 1)] = objArr[i15];
                    i15++;
                }
                int i120 = i119 * 2;
                Object obj = objArr[i120];
                if (obj instanceof Field) {
                    fieldC2 = (Field) obj;
                } else {
                    fieldC2 = C(cls, (String) obj);
                    objArr[i120] = fieldC2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldC2);
                int i121 = i120 + 1;
                Object obj2 = objArr[i121];
                if (obj2 instanceof Field) {
                    fieldC3 = (Field) obj2;
                } else {
                    fieldC3 = C(cls, (String) obj2);
                    objArr[i121] = fieldC3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldC3);
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
                Field fieldC4 = C(cls, (String) objArr[i15]);
                if (i113 == 9 || i113 == 17) {
                    i39 = i18;
                    objArr2[androidx.core.view.j.v(i103, 3, 2, 1)] = fieldC4.getType();
                } else {
                    if (i113 == 27 || i113 == 49) {
                        i39 = i18;
                        i47 = i15 + 2;
                        objArr2[androidx.core.view.j.v(i103, 3, 2, 1)] = objArr[i122];
                    } else if (i113 == 12 || i113 == 30 || i113 == 44) {
                        i39 = i18;
                        if (e1Var.getSyntax() == b1.PROTO2 || (iCharAt11 & 2048) != 0) {
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC4);
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
                                fieldC = (Field) obj3;
                            } else {
                                fieldC = C(cls, (String) obj3);
                                objArr[i129] = fieldC;
                            }
                            int i130 = iCharAt13;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldC);
                            i46 = i130 % 32;
                        }
                        if (i113 >= 18 && i113 <= 49) {
                            iArr[i101] = iObjectFieldOffset;
                            i101++;
                        }
                        i57 = i45;
                    }
                    i44 = i47;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC4);
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
        return new t0<>(iArr3, objArr2, i16, i24, e1Var.f6698a, e1Var.getSyntax(), false, iArr, i19, i100, v0Var, e0Var, m1Var, pVar, l0Var);
    }

    public static long v(int i14) {
        return i14 & 1048575;
    }

    public static <T> int w(T t7, long j8) {
        return ((Integer) p1.f6801c.h(t7, j8)).intValue();
    }

    public static <T> long x(T t7, long j8) {
        return ((Long) p1.f6801c.h(t7, j8)).longValue();
    }

    public final void A(Object obj, int i14, j jVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i14) != 0) {
            jVar.y(2);
            p1.o(obj, i14 & 1048575, jVar.f6743a.u());
        } else if (!this.f6861g) {
            p1.o(obj, i14 & 1048575, jVar.f());
        } else {
            jVar.y(2);
            p1.o(obj, i14 & 1048575, jVar.f6743a.t());
        }
    }

    public final void B(Object obj, int i14, j jVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        boolean z14 = (536870912 & i14) != 0;
        e0 e0Var = this.f6867m;
        if (z14) {
            jVar.u(e0Var.a(i14 & 1048575, obj), true);
        } else {
            jVar.u(e0Var.a(i14 & 1048575, obj), false);
        }
    }

    public final void D(T t7, int i14) {
        int i15 = this.f6855a[i14 + 2];
        long j8 = 1048575 & i15;
        if (j8 == 1048575) {
            return;
        }
        p1.m(t7, j8, (1 << (i15 >>> 20)) | p1.f6801c.f(t7, j8));
    }

    public final void E(T t7, int i14, int i15) {
        p1.m(t7, this.f6855a[i15 + 2] & 1048575, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(Object obj, int i14, q0 q0Var) {
        f6854r.putObject(obj, I(i14) & 1048575, q0Var);
        D(obj, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(Object obj, int i14, int i15, q0 q0Var) {
        f6854r.putObject(obj, I(i15) & 1048575, q0Var);
        E(obj, i14, i15);
    }

    public final int I(int i14) {
        return this.f6855a[i14 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void J(T t7, u1 u1Var) {
        Map.Entry<?, ?> entry;
        Iterator it;
        char c14;
        int i14;
        int i15;
        Map.Entry<?, ?> entry2;
        int i16;
        boolean z14;
        t0<T> t0Var = this;
        boolean z15 = t0Var.f6860f;
        p<?> pVar = t0Var.f6869o;
        if (z15) {
            t<T> tVarC = pVar.c(t7);
            if (tVarC.f6848a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itI = tVarC.i();
                entry = (Map.Entry) itI.next();
                it = itI;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = t0Var.f6855a;
        int length = iArr.length;
        Unsafe unsafe = f6854r;
        int i17 = 0;
        int i18 = 1048575;
        int i19 = 0;
        while (i17 < length) {
            int I = t0Var.I(i17);
            int i24 = iArr[i17];
            int iH = H(I);
            Iterator it3 = it;
            if (iH <= 17) {
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
            while (entry2 != null && pVar.a(entry2) <= i24) {
                pVar.j(u1Var, entry2);
                entry2 = it3.hasNext() ? (Map.Entry) it3.next() : null;
            }
            int i28 = I & 1048575;
            Map.Entry<?, ?> entry5 = entry2;
            int[] iArr2 = iArr;
            long j8 = i28;
            switch (iH) {
                case 0:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        double d14 = p1.f6801c.d(t7, j8);
                        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
                        codedOutputStream.getClass();
                        codedOutputStream.r(i24, Double.doubleToRawLongBits(d14));
                    }
                    break;
                case 1:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        float fE = p1.f6801c.e(t7, j8);
                        CodedOutputStream codedOutputStream2 = ((k) u1Var).f6774a;
                        codedOutputStream2.getClass();
                        codedOutputStream2.p(i24, Float.floatToRawIntBits(fE));
                    }
                    t0Var = this;
                    break;
                case 2:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).g(i24, unsafe.getLong(t7, j8));
                    }
                    t0Var = this;
                    break;
                case 3:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).f6774a.E(i24, unsafe.getLong(t7, j8));
                    }
                    t0Var = this;
                    break;
                case 4:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).f(i24, unsafe.getInt(t7, j8));
                    }
                    t0Var = this;
                    break;
                case 5:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).d(i24, unsafe.getLong(t7, j8));
                    }
                    t0Var = this;
                    break;
                case 6:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).c(i24, unsafe.getInt(t7, j8));
                    }
                    t0Var = this;
                    break;
                case 7:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).f6774a.l(i24, p1.f6801c.c(t7, j8));
                    }
                    t0Var = this;
                    break;
                case 8:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        L(i24, unsafe.getObject(t7, j8), u1Var);
                    }
                    t0Var = this;
                    break;
                case 9:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).h(i24, unsafe.getObject(t7, j8), t0Var.j(i17));
                    }
                    break;
                case 10:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).b(i24, (h) unsafe.getObject(t7, j8));
                    }
                    t0Var = this;
                    break;
                case 11:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).f6774a.C(i24, unsafe.getInt(t7, j8));
                    }
                    t0Var = this;
                    break;
                case 12:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).f6774a.t(i24, unsafe.getInt(t7, j8));
                    }
                    t0Var = this;
                    break;
                case 13:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).f6774a.p(i24, unsafe.getInt(t7, j8));
                    }
                    t0Var = this;
                    break;
                case 14:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).f6774a.r(i24, unsafe.getLong(t7, j8));
                    }
                    t0Var = this;
                    break;
                case 15:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        int i29 = unsafe.getInt(t7, j8);
                        ((k) u1Var).f6774a.C(i24, (i29 >> 31) ^ (i29 << 1));
                    }
                    t0Var = this;
                    break;
                case 16:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        long j14 = unsafe.getLong(t7, j8);
                        ((k) u1Var).f6774a.E(i24, (j14 << 1) ^ (j14 >> 63));
                    }
                    t0Var = this;
                    break;
                case 17:
                    if (t0Var.l(t7, i17, i14, i15, i16)) {
                        ((k) u1Var).e(i24, unsafe.getObject(t7, j8), t0Var.j(i17));
                    }
                    break;
                case 18:
                    h1.o(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 19:
                    h1.s(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 20:
                    h1.v(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 21:
                    h1.D(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 22:
                    h1.u(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 23:
                    h1.r(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 24:
                    h1.q(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 25:
                    h1.m(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 26:
                    h1.B(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var);
                    break;
                case 27:
                    h1.w(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, t0Var.j(i17));
                    break;
                case 28:
                    h1.n(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var);
                    break;
                case 29:
                    z14 = false;
                    h1.C(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 30:
                    z14 = false;
                    h1.p(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 31:
                    z14 = false;
                    h1.x(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 32:
                    z14 = false;
                    h1.y(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 33:
                    z14 = false;
                    h1.z(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 34:
                    z14 = false;
                    h1.A(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, false);
                    break;
                case 35:
                    h1.o(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 36:
                    h1.s(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 37:
                    h1.v(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 38:
                    h1.D(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 39:
                    h1.u(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 40:
                    h1.r(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 41:
                    h1.q(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 42:
                    h1.m(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 43:
                    h1.C(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 44:
                    h1.p(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 45:
                    h1.x(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 46:
                    h1.y(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 47:
                    h1.z(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 48:
                    h1.A(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, c14);
                    break;
                case 49:
                    h1.t(iArr2[i17], (List) unsafe.getObject(t7, j8), u1Var, t0Var.j(i17));
                    break;
                case 50:
                    t0Var.K(u1Var, i24, unsafe.getObject(t7, j8), i17);
                    break;
                case 51:
                    if (t0Var.n(t7, i24, i17)) {
                        double dDoubleValue = ((Double) p1.f6801c.h(t7, j8)).doubleValue();
                        CodedOutputStream codedOutputStream3 = ((k) u1Var).f6774a;
                        codedOutputStream3.getClass();
                        codedOutputStream3.r(i24, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (t0Var.n(t7, i24, i17)) {
                        float fFloatValue = ((Float) p1.f6801c.h(t7, j8)).floatValue();
                        CodedOutputStream codedOutputStream4 = ((k) u1Var).f6774a;
                        codedOutputStream4.getClass();
                        codedOutputStream4.p(i24, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).g(i24, x(t7, j8));
                    }
                    break;
                case 54:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).f6774a.E(i24, x(t7, j8));
                    }
                    break;
                case 55:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).f(i24, w(t7, j8));
                    }
                    break;
                case 56:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).d(i24, x(t7, j8));
                    }
                    break;
                case 57:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).c(i24, w(t7, j8));
                    }
                    break;
                case 58:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).f6774a.l(i24, ((Boolean) p1.f6801c.h(t7, j8)).booleanValue());
                    }
                    break;
                case 59:
                    if (t0Var.n(t7, i24, i17)) {
                        L(i24, unsafe.getObject(t7, j8), u1Var);
                    }
                    break;
                case 60:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).h(i24, unsafe.getObject(t7, j8), t0Var.j(i17));
                    }
                    break;
                case 61:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).b(i24, (h) unsafe.getObject(t7, j8));
                    }
                    break;
                case 62:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).f6774a.C(i24, w(t7, j8));
                    }
                    break;
                case 63:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).f6774a.t(i24, w(t7, j8));
                    }
                    break;
                case 64:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).f6774a.p(i24, w(t7, j8));
                    }
                    break;
                case 65:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).f6774a.r(i24, x(t7, j8));
                    }
                    break;
                case 66:
                    if (t0Var.n(t7, i24, i17)) {
                        int iW = w(t7, j8);
                        ((k) u1Var).f6774a.C(i24, (iW >> 31) ^ (iW << 1));
                    }
                    break;
                case 67:
                    if (t0Var.n(t7, i24, i17)) {
                        long jX = x(t7, j8);
                        ((k) u1Var).f6774a.E(i24, (jX << c14) ^ (jX >> 63));
                    }
                    break;
                case 68:
                    if (t0Var.n(t7, i24, i17)) {
                        ((k) u1Var).e(i24, unsafe.getObject(t7, j8), t0Var.j(i17));
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
            pVar.j(u1Var, entry);
            entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
        }
        m1<?, ?> m1Var = t0Var.f6868n;
        m1Var.r(m1Var.g(t7), u1Var);
    }

    public final <K, V> void K(u1 u1Var, int i14, Object obj, int i15) {
        if (obj != null) {
            Object objI = i(i15);
            l0 l0Var = this.f6870p;
            j0.a<?, ?> aVarForMapMetadata = l0Var.forMapMetadata(objI);
            k0 k0VarForMapData = l0Var.forMapData(obj);
            CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
            codedOutputStream.getClass();
            for (Map.Entry<K, V> entry : k0VarForMapData.entrySet()) {
                codedOutputStream.B(i14, 2);
                codedOutputStream.D(j0.a(aVarForMapMetadata, entry.getKey(), entry.getValue()));
                j0.c(codedOutputStream, aVarForMapMetadata, entry.getKey(), entry.getValue());
            }
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
    @Override // androidx.datastore.preferences.protobuf.g1
    public final int a(a aVar) {
        int i14;
        int iG;
        int iG2;
        int iG3;
        int i15;
        int iG4;
        int i16;
        int iG5;
        int iG6;
        int iG7;
        int iD;
        int iH;
        int iG8;
        int iC;
        int iB;
        int iG9;
        int iD2;
        int iC2;
        int iG10;
        int size;
        int i17;
        int iG11;
        int iG12;
        int size2;
        int iG13;
        int iH2;
        int iD3;
        int iG14;
        int iG15;
        int i18;
        t0 t0Var = this;
        a aVar2 = aVar;
        Unsafe unsafe = f6854r;
        int i19 = 1048575;
        int i24 = 1048575;
        int i25 = 0;
        int i26 = 0;
        int iB2 = 0;
        while (true) {
            int[] iArr = t0Var.f6855a;
            if (i25 >= iArr.length) {
                m1<?, ?> m1Var = t0Var.f6868n;
                int iH3 = m1Var.h(m1Var.g(aVar2)) + iB2;
                if (!t0Var.f6860f) {
                    return iH3;
                }
                j1<T, Object> j1Var = t0Var.f6869o.c(aVar2).f6848a;
                int size3 = j1Var.f6756a.size();
                int iD4 = 0;
                for (int i27 = 0; i27 < size3; i27++) {
                    Map.Entry entryC = j1Var.c(i27);
                    iD4 += t.d((t.b) entryC.getKey(), entryC.getValue());
                }
                for (Map.Entry entry : j1Var.d()) {
                    iD4 += t.d((t.b) entry.getKey(), entry.getValue());
                }
                return iH3 + iD4;
            }
            int I = t0Var.I(i25);
            int iH4 = H(I);
            int i28 = iArr[i25];
            int i29 = iArr[i25 + 2];
            int i30 = i29 & i19;
            if (iH4 <= 17) {
                if (i30 != i24) {
                    i26 = i30 == i19 ? 0 : unsafe.getInt(aVar2, i30);
                    i24 = i30;
                }
                i14 = 1 << (i29 >>> 20);
            } else {
                i14 = 0;
            }
            long j8 = I & i19;
            if (iH4 < u.f6885f.f6891a || iH4 > u.f6886g.f6891a) {
                i30 = 0;
            }
            boolean z14 = t0Var.f6862h;
            switch (iH4) {
                case 0:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        iG = CodedOutputStream.g(i28);
                        iC2 = iG + 8;
                        iB2 += iC2;
                    }
                    break;
                case 1:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        iG2 = CodedOutputStream.g(i28);
                        iG6 = iG2 + 4;
                        iB2 += iG6;
                    }
                    t0Var = this;
                    aVar2 = aVar;
                    break;
                case 2:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        long j14 = unsafe.getLong(aVar2, j8);
                        iG3 = CodedOutputStream.g(i28);
                        i15 = CodedOutputStream.i(j14);
                        iB2 += i15 + iG3;
                    }
                    t0Var = this;
                    break;
                case 3:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        long j15 = unsafe.getLong(aVar2, j8);
                        iG3 = CodedOutputStream.g(i28);
                        i15 = CodedOutputStream.i(j15);
                        iB2 += i15 + iG3;
                    }
                    t0Var = this;
                    break;
                case 4:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        int i34 = unsafe.getInt(aVar2, j8);
                        iG4 = CodedOutputStream.g(i28);
                        i16 = CodedOutputStream.i(i34);
                        iB = i16 + iG4;
                        iB2 += iB;
                    }
                    t0Var = this;
                    break;
                case 5:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        iG5 = CodedOutputStream.g(i28);
                        iG6 = iG5 + 8;
                        iB2 += iG6;
                    }
                    t0Var = this;
                    aVar2 = aVar;
                    break;
                case 6:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        iG2 = CodedOutputStream.g(i28);
                        iG6 = iG2 + 4;
                        iB2 += iG6;
                    }
                    t0Var = this;
                    aVar2 = aVar;
                    break;
                case 7:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        iG6 = CodedOutputStream.g(i28) + 1;
                        iB2 += iG6;
                    }
                    t0Var = this;
                    aVar2 = aVar;
                    break;
                case 8:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        Object object = unsafe.getObject(aVar2, j8);
                        iB2 = (object instanceof h ? CodedOutputStream.b(i28, (h) object) : CodedOutputStream.f((String) object) + CodedOutputStream.g(i28)) + iB2;
                    }
                    t0Var = this;
                    break;
                case 9:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        Object object2 = unsafe.getObject(aVar2, j8);
                        g1 g1VarJ = t0Var.j(i25);
                        Class<?> cls = h1.f6717a;
                        if (object2 instanceof c0) {
                            iG8 = CodedOutputStream.g(i28);
                            iC = CodedOutputStream.c((c0) object2);
                            iC2 = iC + iG8;
                            iB2 += iC2;
                        } else {
                            iG7 = CodedOutputStream.g(i28);
                            iD = ((a) ((q0) object2)).d(g1VarJ);
                            iH = CodedOutputStream.h(iD);
                            iC2 = iH + iD + iG7;
                            iB2 += iC2;
                        }
                    }
                    break;
                case 10:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        iB = CodedOutputStream.b(i28, (h) unsafe.getObject(aVar2, j8));
                        iB2 += iB;
                    }
                    t0Var = this;
                    break;
                case 11:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        int i35 = unsafe.getInt(aVar2, j8);
                        iG4 = CodedOutputStream.g(i28);
                        i16 = CodedOutputStream.h(i35);
                        iB = i16 + iG4;
                        iB2 += iB;
                    }
                    t0Var = this;
                    break;
                case 12:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        int i36 = unsafe.getInt(aVar2, j8);
                        iG4 = CodedOutputStream.g(i28);
                        i16 = CodedOutputStream.i(i36);
                        iB = i16 + iG4;
                        iB2 += iB;
                    }
                    t0Var = this;
                    break;
                case 13:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        iG2 = CodedOutputStream.g(i28);
                        iG6 = iG2 + 4;
                        iB2 += iG6;
                    }
                    t0Var = this;
                    aVar2 = aVar;
                    break;
                case 14:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        iG5 = CodedOutputStream.g(i28);
                        iG6 = iG5 + 8;
                        iB2 += iG6;
                    }
                    t0Var = this;
                    aVar2 = aVar;
                    break;
                case 15:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        int i37 = unsafe.getInt(aVar2, j8);
                        iG4 = CodedOutputStream.g(i28);
                        i16 = CodedOutputStream.d(i37);
                        iB = i16 + iG4;
                        iB2 += iB;
                    }
                    t0Var = this;
                    break;
                case 16:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        long j16 = unsafe.getLong(aVar2, j8);
                        iG3 = CodedOutputStream.g(i28);
                        i15 = CodedOutputStream.e(j16);
                        iB2 += i15 + iG3;
                    }
                    t0Var = this;
                    break;
                case 17:
                    if (t0Var.l(aVar2, i25, i24, i26, i14)) {
                        q0 q0Var = (q0) unsafe.getObject(aVar2, j8);
                        g1 g1VarJ2 = t0Var.j(i25);
                        iG9 = CodedOutputStream.g(i28) * 2;
                        iD2 = ((a) q0Var).d(g1VarJ2);
                        iC2 = iD2 + iG9;
                        iB2 += iC2;
                    }
                    break;
                case 18:
                    iC2 = h1.c(i28, (List) unsafe.getObject(aVar2, j8));
                    iB2 += iC2;
                    break;
                case 19:
                    iC2 = h1.b(i28, (List) unsafe.getObject(aVar2, j8));
                    iB2 += iC2;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls2 = h1.f6717a;
                    if (list.size() == 0) {
                        iG10 = 0;
                    } else {
                        iG10 = (CodedOutputStream.g(i28) * list.size()) + h1.e(list);
                    }
                    iB2 += iG10;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls3 = h1.f6717a;
                    size = list2.size();
                    if (size == 0) {
                        iG10 = 0;
                    } else {
                        i17 = h1.i(list2);
                        iG11 = CodedOutputStream.g(i28);
                        iG10 = (iG11 * size) + i17;
                    }
                    iB2 += iG10;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls4 = h1.f6717a;
                    size = list3.size();
                    if (size == 0) {
                        iG10 = 0;
                    } else {
                        i17 = h1.d(list3);
                        iG11 = CodedOutputStream.g(i28);
                        iG10 = (iG11 * size) + i17;
                    }
                    iB2 += iG10;
                    break;
                case 23:
                    iC2 = h1.c(i28, (List) unsafe.getObject(aVar2, j8));
                    iB2 += iC2;
                    break;
                case 24:
                    iC2 = h1.b(i28, (List) unsafe.getObject(aVar2, j8));
                    iB2 += iC2;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls5 = h1.f6717a;
                    int size4 = list4.size();
                    iB2 += size4 == 0 ? 0 : (CodedOutputStream.g(i28) + 1) * size4;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls6 = h1.f6717a;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iG10 = 0;
                    } else {
                        iG10 = CodedOutputStream.g(i28) * size5;
                        if (list5 instanceof d0) {
                            d0 d0Var = (d0) list5;
                            for (int i38 = 0; i38 < size5; i38++) {
                                Object objK = d0Var.k();
                                if (objK instanceof h) {
                                    int size6 = ((h) objK).size();
                                    iG10 = CodedOutputStream.h(size6) + size6 + iG10;
                                } else {
                                    iG10 = CodedOutputStream.f((String) objK) + iG10;
                                }
                            }
                        } else {
                            for (int i39 = 0; i39 < size5; i39++) {
                                Object obj = list5.get(i39);
                                if (obj instanceof h) {
                                    int size7 = ((h) obj).size();
                                    iG10 = CodedOutputStream.h(size7) + size7 + iG10;
                                } else {
                                    iG10 = CodedOutputStream.f((String) obj) + iG10;
                                }
                            }
                        }
                    }
                    iB2 += iG10;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(aVar2, j8);
                    g1 g1VarJ3 = t0Var.j(i25);
                    Class<?> cls7 = h1.f6717a;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        iG12 = 0;
                    } else {
                        iG12 = CodedOutputStream.g(i28) * size8;
                        for (int i44 = 0; i44 < size8; i44++) {
                            Object obj2 = list6.get(i44);
                            if (obj2 instanceof c0) {
                                iG12 = CodedOutputStream.c((c0) obj2) + iG12;
                            } else {
                                int iD5 = ((a) ((q0) obj2)).d(g1VarJ3);
                                iG12 = CodedOutputStream.h(iD5) + iD5 + iG12;
                            }
                        }
                    }
                    iB2 += iG12;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls8 = h1.f6717a;
                    int size9 = list7.size();
                    if (size9 == 0) {
                        iG10 = 0;
                    } else {
                        iG10 = CodedOutputStream.g(i28) * size9;
                        for (int i45 = 0; i45 < list7.size(); i45++) {
                            int size10 = ((h) list7.get(i45)).size();
                            iG10 += CodedOutputStream.h(size10) + size10;
                        }
                    }
                    iB2 += iG10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls9 = h1.f6717a;
                    size = list8.size();
                    if (size == 0) {
                        iG10 = 0;
                    } else {
                        i17 = h1.h(list8);
                        iG11 = CodedOutputStream.g(i28);
                        iG10 = (iG11 * size) + i17;
                    }
                    iB2 += iG10;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls10 = h1.f6717a;
                    size = list9.size();
                    if (size == 0) {
                        iG10 = 0;
                    } else {
                        i17 = h1.a(list9);
                        iG11 = CodedOutputStream.g(i28);
                        iG10 = (iG11 * size) + i17;
                    }
                    iB2 += iG10;
                    break;
                case 31:
                    iC2 = h1.b(i28, (List) unsafe.getObject(aVar2, j8));
                    iB2 += iC2;
                    break;
                case 32:
                    iC2 = h1.c(i28, (List) unsafe.getObject(aVar2, j8));
                    iB2 += iC2;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls11 = h1.f6717a;
                    size = list10.size();
                    if (size == 0) {
                        iG10 = 0;
                    } else {
                        i17 = h1.f(list10);
                        iG11 = CodedOutputStream.g(i28);
                        iG10 = (iG11 * size) + i17;
                    }
                    iB2 += iG10;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls12 = h1.f6717a;
                    size = list11.size();
                    if (size == 0) {
                        iG10 = 0;
                    } else {
                        i17 = h1.g(list11);
                        iG11 = CodedOutputStream.g(i28);
                        iG10 = (iG11 * size) + i17;
                    }
                    iB2 += iG10;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls13 = h1.f6717a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls14 = h1.f6717a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 37:
                    size2 = h1.e((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 38:
                    size2 = h1.i((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 39:
                    size2 = h1.d((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls15 = h1.f6717a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls16 = h1.f6717a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls17 = h1.f6717a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 43:
                    size2 = h1.h((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 44:
                    size2 = h1.a((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls18 = h1.f6717a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(aVar2, j8);
                    Class<?> cls19 = h1.f6717a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 47:
                    size2 = h1.f((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 48:
                    size2 = h1.g((List) unsafe.getObject(aVar2, j8));
                    if (size2 > 0) {
                        if (z14) {
                            unsafe.putInt(aVar2, i30, size2);
                        }
                        iG13 = CodedOutputStream.g(i28);
                        iH2 = CodedOutputStream.h(size2);
                        iB2 += iH2 + iG13 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(aVar2, j8);
                    g1 g1VarJ4 = t0Var.j(i25);
                    Class<?> cls20 = h1.f6717a;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        iD3 = 0;
                    } else {
                        iD3 = 0;
                        for (int i46 = 0; i46 < size11; i46++) {
                            iD3 += ((a) ((q0) list19.get(i46))).d(g1VarJ4) + (CodedOutputStream.g(i28) * 2);
                        }
                    }
                    iB2 += iD3;
                    break;
                case 50:
                    iC2 = t0Var.f6870p.getSerializedSize(i28, unsafe.getObject(aVar2, j8), t0Var.i(i25));
                    iB2 += iC2;
                    break;
                case 51:
                    if (t0Var.n(aVar2, i28, i25)) {
                        iG = CodedOutputStream.g(i28);
                        iC2 = iG + 8;
                        iB2 += iC2;
                    }
                    break;
                case 52:
                    if (t0Var.n(aVar2, i28, i25)) {
                        iG14 = CodedOutputStream.g(i28);
                        iC2 = iG14 + 4;
                        iB2 += iC2;
                    }
                    break;
                case 53:
                    if (t0Var.n(aVar2, i28, i25)) {
                        long jX = x(aVar2, j8);
                        iG15 = CodedOutputStream.g(i28);
                        i18 = CodedOutputStream.i(jX);
                        iB2 += i18 + iG15;
                    }
                    break;
                case 54:
                    if (t0Var.n(aVar2, i28, i25)) {
                        long jX2 = x(aVar2, j8);
                        iG15 = CodedOutputStream.g(i28);
                        i18 = CodedOutputStream.i(jX2);
                        iB2 += i18 + iG15;
                    }
                    break;
                case 55:
                    if (t0Var.n(aVar2, i28, i25)) {
                        int iW = w(aVar2, j8);
                        iG8 = CodedOutputStream.g(i28);
                        iC = CodedOutputStream.i(iW);
                        iC2 = iC + iG8;
                        iB2 += iC2;
                    }
                    break;
                case 56:
                    if (t0Var.n(aVar2, i28, i25)) {
                        iG = CodedOutputStream.g(i28);
                        iC2 = iG + 8;
                        iB2 += iC2;
                    }
                    break;
                case 57:
                    if (t0Var.n(aVar2, i28, i25)) {
                        iG14 = CodedOutputStream.g(i28);
                        iC2 = iG14 + 4;
                        iB2 += iC2;
                    }
                    break;
                case 58:
                    if (t0Var.n(aVar2, i28, i25)) {
                        iC2 = CodedOutputStream.g(i28) + 1;
                        iB2 += iC2;
                    }
                    break;
                case 59:
                    if (t0Var.n(aVar2, i28, i25)) {
                        Object object3 = unsafe.getObject(aVar2, j8);
                        iB2 = (object3 instanceof h ? CodedOutputStream.b(i28, (h) object3) : CodedOutputStream.f((String) object3) + CodedOutputStream.g(i28)) + iB2;
                    }
                    break;
                case 60:
                    if (t0Var.n(aVar2, i28, i25)) {
                        Object object4 = unsafe.getObject(aVar2, j8);
                        g1 g1VarJ5 = t0Var.j(i25);
                        Class<?> cls21 = h1.f6717a;
                        if (object4 instanceof c0) {
                            iG8 = CodedOutputStream.g(i28);
                            iC = CodedOutputStream.c((c0) object4);
                            iC2 = iC + iG8;
                            iB2 += iC2;
                        } else {
                            iG7 = CodedOutputStream.g(i28);
                            iD = ((a) ((q0) object4)).d(g1VarJ5);
                            iH = CodedOutputStream.h(iD);
                            iC2 = iH + iD + iG7;
                            iB2 += iC2;
                        }
                    }
                    break;
                case 61:
                    if (t0Var.n(aVar2, i28, i25)) {
                        iC2 = CodedOutputStream.b(i28, (h) unsafe.getObject(aVar2, j8));
                        iB2 += iC2;
                    }
                    break;
                case 62:
                    if (t0Var.n(aVar2, i28, i25)) {
                        int iW2 = w(aVar2, j8);
                        iG8 = CodedOutputStream.g(i28);
                        iC = CodedOutputStream.h(iW2);
                        iC2 = iC + iG8;
                        iB2 += iC2;
                    }
                    break;
                case 63:
                    if (t0Var.n(aVar2, i28, i25)) {
                        int iW3 = w(aVar2, j8);
                        iG8 = CodedOutputStream.g(i28);
                        iC = CodedOutputStream.i(iW3);
                        iC2 = iC + iG8;
                        iB2 += iC2;
                    }
                    break;
                case 64:
                    if (t0Var.n(aVar2, i28, i25)) {
                        iG14 = CodedOutputStream.g(i28);
                        iC2 = iG14 + 4;
                        iB2 += iC2;
                    }
                    break;
                case 65:
                    if (t0Var.n(aVar2, i28, i25)) {
                        iG = CodedOutputStream.g(i28);
                        iC2 = iG + 8;
                        iB2 += iC2;
                    }
                    break;
                case 66:
                    if (t0Var.n(aVar2, i28, i25)) {
                        int iW4 = w(aVar2, j8);
                        iG8 = CodedOutputStream.g(i28);
                        iC = CodedOutputStream.d(iW4);
                        iC2 = iC + iG8;
                        iB2 += iC2;
                    }
                    break;
                case 67:
                    if (t0Var.n(aVar2, i28, i25)) {
                        long jX3 = x(aVar2, j8);
                        iG15 = CodedOutputStream.g(i28);
                        i18 = CodedOutputStream.e(jX3);
                        iB2 += i18 + iG15;
                    }
                    break;
                case 68:
                    if (t0Var.n(aVar2, i28, i25)) {
                        q0 q0Var2 = (q0) unsafe.getObject(aVar2, j8);
                        g1 g1VarJ6 = t0Var.j(i25);
                        iG9 = CodedOutputStream.g(i28) * 2;
                        iD2 = ((a) q0Var2).d(g1VarJ6);
                        iC2 = iD2 + iG9;
                        iB2 += iC2;
                    }
                    break;
            }
            i25 += 3;
            i19 = 1048575;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 24081. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // androidx.datastore.preferences.protobuf.g1
    public final void b(java.lang.Object r21, androidx.datastore.preferences.protobuf.j r22, androidx.datastore.preferences.protobuf.o r23) {
        /*
            Method dump skipped, instruction units count: 2408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.b(java.lang.Object, androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.o):void");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean c(x xVar, x xVar2) {
        int[] iArr = this.f6855a;
        int length = iArr.length;
        int i14 = 0;
        while (true) {
            boolean zL = true;
            if (i14 < length) {
                int I = I(i14);
                long j8 = I & 1048575;
                switch (H(I)) {
                    case 0:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar = p1.f6801c;
                            if (Double.doubleToLongBits(eVar.d(xVar, j8)) != Double.doubleToLongBits(eVar.d(xVar2, j8))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar2 = p1.f6801c;
                            if (Float.floatToIntBits(eVar2.e(xVar, j8)) != Float.floatToIntBits(eVar2.e(xVar2, j8))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar3 = p1.f6801c;
                            if (eVar3.g(xVar, j8) != eVar3.g(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar4 = p1.f6801c;
                            if (eVar4.g(xVar, j8) != eVar4.g(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar5 = p1.f6801c;
                            if (eVar5.f(xVar, j8) != eVar5.f(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar6 = p1.f6801c;
                            if (eVar6.g(xVar, j8) != eVar6.g(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar7 = p1.f6801c;
                            if (eVar7.f(xVar, j8) != eVar7.f(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar8 = p1.f6801c;
                            if (eVar8.c(xVar, j8) != eVar8.c(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar9 = p1.f6801c;
                            if (!h1.l(eVar9.h(xVar, j8), eVar9.h(xVar2, j8))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar10 = p1.f6801c;
                            if (!h1.l(eVar10.h(xVar, j8), eVar10.h(xVar2, j8))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar11 = p1.f6801c;
                            if (!h1.l(eVar11.h(xVar, j8), eVar11.h(xVar2, j8))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar12 = p1.f6801c;
                            if (eVar12.f(xVar, j8) != eVar12.f(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar13 = p1.f6801c;
                            if (eVar13.f(xVar, j8) != eVar13.f(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar14 = p1.f6801c;
                            if (eVar14.f(xVar, j8) != eVar14.f(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar15 = p1.f6801c;
                            if (eVar15.g(xVar, j8) != eVar15.g(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar16 = p1.f6801c;
                            if (eVar16.f(xVar, j8) != eVar16.f(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar17 = p1.f6801c;
                            if (eVar17.g(xVar, j8) != eVar17.g(xVar2, j8)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!f(xVar, xVar2, i14)) {
                            zL = false;
                        } else {
                            p1.e eVar18 = p1.f6801c;
                            if (!h1.l(eVar18.h(xVar, j8), eVar18.h(xVar2, j8))) {
                                zL = false;
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
                        p1.e eVar19 = p1.f6801c;
                        zL = h1.l(eVar19.h(xVar, j8), eVar19.h(xVar2, j8));
                        break;
                    case 50:
                        p1.e eVar20 = p1.f6801c;
                        zL = h1.l(eVar20.h(xVar, j8), eVar20.h(xVar2, j8));
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
                        p1.e eVar21 = p1.f6801c;
                        if (eVar21.f(xVar, j14) != eVar21.f(xVar2, j14) || !h1.l(eVar21.h(xVar, j8), eVar21.h(xVar2, j8))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i14 += 3;
                }
            } else {
                m1<?, ?> m1Var = this.f6868n;
                if (m1Var.g(xVar).equals(m1Var.g(xVar2))) {
                    if (!this.f6860f) {
                        return true;
                    }
                    p<?> pVar = this.f6869o;
                    return pVar.c(xVar).equals(pVar.c(xVar2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    @Override // androidx.datastore.preferences.protobuf.g1
    public final void d(T t7, u1 u1Var) {
        Iterator it;
        Map.Entry<?, ?> entry;
        Map.Entry<?, ?> entry2;
        k kVar = (k) u1Var;
        kVar.getClass();
        if (u1.a.ASCENDING != u1.a.DESCENDING) {
            J(t7, u1Var);
            return;
        }
        p<?> pVar = this.f6869o;
        int[] iArr = this.f6855a;
        m1<?, ?> m1Var = this.f6868n;
        m1Var.r(m1Var.g(t7), u1Var);
        Map.Entry<?, ?> entry3 = null;
        if (this.f6860f) {
            t<T> tVarC = pVar.c(t7);
            if (tVarC.f6848a.isEmpty()) {
                it = null;
                entry = null;
            } else {
                j1<T, Object> j1Var = tVarC.f6848a;
                if (j1Var.isEmpty()) {
                    it = Collections.emptyIterator();
                } else {
                    boolean z14 = tVarC.f6850c;
                    j1<K, V>.b bVar = j1Var.f6761f;
                    if (z14) {
                        if (bVar == null) {
                            j1Var.f6761f = new j1.b(j1Var, null);
                        }
                        it = new b0.c(j1Var.f6761f.iterator());
                    } else {
                        if (bVar == null) {
                            j1Var.f6761f = new j1.b(j1Var, null);
                        }
                        it = j1Var.f6761f.iterator();
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
            int I = I(length);
            int i14 = iArr[length];
            while (entry != null && pVar.a(entry) > i14) {
                pVar.j(u1Var, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : entry3;
            }
            switch (H(I)) {
                case 0:
                    entry2 = entry;
                    if (k(t7, length)) {
                        double d14 = p1.f6801c.d(t7, I & 1048575);
                        CodedOutputStream codedOutputStream = kVar.f6774a;
                        codedOutputStream.getClass();
                        codedOutputStream.r(i14, Double.doubleToRawLongBits(d14));
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 1:
                    entry2 = entry;
                    if (k(t7, length)) {
                        float fE = p1.f6801c.e(t7, I & 1048575);
                        CodedOutputStream codedOutputStream2 = kVar.f6774a;
                        codedOutputStream2.getClass();
                        codedOutputStream2.p(i14, Float.floatToRawIntBits(fE));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 2:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.g(i14, p1.f6801c.g(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 3:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.f6774a.E(i14, p1.f6801c.g(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 4:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.f(i14, p1.f6801c.f(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 5:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.d(i14, p1.f6801c.g(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 6:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.c(i14, p1.f6801c.f(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 7:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.f6774a.l(i14, p1.f6801c.c(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 8:
                    entry2 = entry;
                    if (k(t7, length)) {
                        L(i14, p1.f6801c.h(t7, I & 1048575), u1Var);
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 9:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.h(i14, p1.f6801c.h(t7, I & 1048575), j(length));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 10:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.b(i14, (h) p1.f6801c.h(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 11:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.f6774a.C(i14, p1.f6801c.f(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 12:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.f6774a.t(i14, p1.f6801c.f(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 13:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.f6774a.p(i14, p1.f6801c.f(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 14:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.f6774a.r(i14, p1.f6801c.g(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 15:
                    entry2 = entry;
                    if (k(t7, length)) {
                        int iF = p1.f6801c.f(t7, I & 1048575);
                        kVar.f6774a.C(i14, (iF >> 31) ^ (iF << 1));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 16:
                    entry2 = entry;
                    if (k(t7, length)) {
                        long jG = p1.f6801c.g(t7, I & 1048575);
                        kVar.f6774a.E(i14, (jG >> 63) ^ (jG << 1));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 17:
                    entry2 = entry;
                    if (k(t7, length)) {
                        kVar.e(i14, p1.f6801c.h(t7, I & 1048575), j(length));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 18:
                    entry2 = entry;
                    h1.o(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 19:
                    entry2 = entry;
                    h1.s(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 20:
                    entry2 = entry;
                    h1.v(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 21:
                    entry2 = entry;
                    h1.D(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 22:
                    entry2 = entry;
                    h1.u(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 23:
                    entry2 = entry;
                    h1.r(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 24:
                    entry2 = entry;
                    h1.q(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 25:
                    entry2 = entry;
                    h1.m(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 26:
                    entry2 = entry;
                    h1.B(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 27:
                    entry2 = entry;
                    h1.w(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, j(length));
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 28:
                    entry2 = entry;
                    h1.n(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 29:
                    entry2 = entry;
                    h1.C(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 30:
                    entry2 = entry;
                    h1.p(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 31:
                    entry2 = entry;
                    h1.x(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 32:
                    entry2 = entry;
                    h1.y(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 33:
                    entry2 = entry;
                    h1.z(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 34:
                    entry2 = entry;
                    h1.A(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, false);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 35:
                    entry2 = entry;
                    h1.o(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 36:
                    entry2 = entry;
                    h1.s(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 37:
                    entry2 = entry;
                    h1.v(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 38:
                    entry2 = entry;
                    h1.D(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 39:
                    entry2 = entry;
                    h1.u(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 40:
                    entry2 = entry;
                    h1.r(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 41:
                    entry2 = entry;
                    h1.q(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 42:
                    entry2 = entry;
                    h1.m(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 43:
                    entry2 = entry;
                    h1.C(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 44:
                    entry2 = entry;
                    h1.p(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 45:
                    entry2 = entry;
                    h1.x(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 46:
                    entry2 = entry;
                    h1.y(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 47:
                    entry2 = entry;
                    h1.z(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 48:
                    entry2 = entry;
                    h1.A(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, true);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 49:
                    entry2 = entry;
                    h1.t(iArr[length], (List) p1.f6801c.h(t7, I & 1048575), u1Var, j(length));
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 50:
                    entry2 = entry;
                    K(u1Var, i14, p1.f6801c.h(t7, I & 1048575), length);
                    continue;
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 51:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        double dDoubleValue = ((Double) p1.f6801c.h(t7, I & 1048575)).doubleValue();
                        CodedOutputStream codedOutputStream3 = kVar.f6774a;
                        codedOutputStream3.getClass();
                        codedOutputStream3.r(i14, Double.doubleToRawLongBits(dDoubleValue));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 52:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        float fFloatValue = ((Float) p1.f6801c.h(t7, I & 1048575)).floatValue();
                        CodedOutputStream codedOutputStream4 = kVar.f6774a;
                        codedOutputStream4.getClass();
                        codedOutputStream4.p(i14, Float.floatToRawIntBits(fFloatValue));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 53:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.g(i14, x(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 54:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.f6774a.E(i14, x(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 55:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.f(i14, w(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 56:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.d(i14, x(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 57:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.c(i14, w(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 58:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.f6774a.l(i14, ((Boolean) p1.f6801c.h(t7, I & 1048575)).booleanValue());
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 59:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        L(i14, p1.f6801c.h(t7, I & 1048575), u1Var);
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 60:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.h(i14, p1.f6801c.h(t7, I & 1048575), j(length));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 61:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.b(i14, (h) p1.f6801c.h(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 62:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.f6774a.C(i14, w(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 63:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.f6774a.t(i14, w(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 64:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.f6774a.p(i14, w(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 65:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        kVar.f6774a.r(i14, x(t7, I & 1048575));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 66:
                    entry2 = entry;
                    if (n(t7, i14, length)) {
                        int iW = w(t7, I & 1048575);
                        kVar.f6774a.C(i14, (iW >> 31) ^ (iW << 1));
                    } else {
                        continue;
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 67:
                    if (n(t7, i14, length)) {
                        entry2 = entry;
                        long jX = x(t7, I & 1048575);
                        kVar.f6774a.E(i14, (jX >> 63) ^ (jX << 1));
                    }
                    length -= 3;
                    entry = entry2;
                    entry3 = null;
                    break;
                case 68:
                    if (n(t7, i14, length)) {
                        kVar.e(i14, p1.f6801c.h(t7, I & 1048575), j(length));
                    }
                    break;
            }
            entry2 = entry;
            length -= 3;
            entry = entry2;
            entry3 = null;
        }
        while (entry != null) {
            pVar.j(u1Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.g1
    public final int e(x xVar) {
        int i14;
        int iB;
        int i15;
        int[] iArr = this.f6855a;
        int length = iArr.length;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17 += 3) {
            int I = I(i17);
            int i18 = iArr[i17];
            long j8 = 1048575 & I;
            int i19 = 1237;
            int iHashCode = 37;
            switch (H(I)) {
                case 0:
                    i14 = i16 * 53;
                    iB = z.b(Double.doubleToLongBits(p1.f6801c.d(xVar, j8)));
                    i16 = iB + i14;
                    break;
                case 1:
                    i14 = i16 * 53;
                    iB = Float.floatToIntBits(p1.f6801c.e(xVar, j8));
                    i16 = iB + i14;
                    break;
                case 2:
                    i14 = i16 * 53;
                    iB = z.b(p1.f6801c.g(xVar, j8));
                    i16 = iB + i14;
                    break;
                case 3:
                    i14 = i16 * 53;
                    iB = z.b(p1.f6801c.g(xVar, j8));
                    i16 = iB + i14;
                    break;
                case 4:
                    i14 = i16 * 53;
                    iB = p1.f6801c.f(xVar, j8);
                    i16 = iB + i14;
                    break;
                case 5:
                    i14 = i16 * 53;
                    iB = z.b(p1.f6801c.g(xVar, j8));
                    i16 = iB + i14;
                    break;
                case 6:
                    i14 = i16 * 53;
                    iB = p1.f6801c.f(xVar, j8);
                    i16 = iB + i14;
                    break;
                case 7:
                    i15 = i16 * 53;
                    boolean zC = p1.f6801c.c(xVar, j8);
                    Charset charset = z.f6936a;
                    if (zC) {
                        i19 = 1231;
                    }
                    i16 = i19 + i15;
                    break;
                case 8:
                    i14 = i16 * 53;
                    iB = ((String) p1.f6801c.h(xVar, j8)).hashCode();
                    i16 = iB + i14;
                    break;
                case 9:
                    Object objH = p1.f6801c.h(xVar, j8);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i16 = (i16 * 53) + iHashCode;
                    break;
                case 10:
                    i14 = i16 * 53;
                    iB = p1.f6801c.h(xVar, j8).hashCode();
                    i16 = iB + i14;
                    break;
                case 11:
                    i14 = i16 * 53;
                    iB = p1.f6801c.f(xVar, j8);
                    i16 = iB + i14;
                    break;
                case 12:
                    i14 = i16 * 53;
                    iB = p1.f6801c.f(xVar, j8);
                    i16 = iB + i14;
                    break;
                case 13:
                    i14 = i16 * 53;
                    iB = p1.f6801c.f(xVar, j8);
                    i16 = iB + i14;
                    break;
                case 14:
                    i14 = i16 * 53;
                    iB = z.b(p1.f6801c.g(xVar, j8));
                    i16 = iB + i14;
                    break;
                case 15:
                    i14 = i16 * 53;
                    iB = p1.f6801c.f(xVar, j8);
                    i16 = iB + i14;
                    break;
                case 16:
                    i14 = i16 * 53;
                    iB = z.b(p1.f6801c.g(xVar, j8));
                    i16 = iB + i14;
                    break;
                case 17:
                    Object objH2 = p1.f6801c.h(xVar, j8);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
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
                    iB = p1.f6801c.h(xVar, j8).hashCode();
                    i16 = iB + i14;
                    break;
                case 50:
                    i14 = i16 * 53;
                    iB = p1.f6801c.h(xVar, j8).hashCode();
                    i16 = iB + i14;
                    break;
                case 51:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = z.b(Double.doubleToLongBits(((Double) p1.f6801c.h(xVar, j8)).doubleValue()));
                        i16 = iB + i14;
                    }
                    break;
                case 52:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = Float.floatToIntBits(((Float) p1.f6801c.h(xVar, j8)).floatValue());
                        i16 = iB + i14;
                    }
                    break;
                case 53:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = z.b(x(xVar, j8));
                        i16 = iB + i14;
                    }
                    break;
                case 54:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = z.b(x(xVar, j8));
                        i16 = iB + i14;
                    }
                    break;
                case 55:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = w(xVar, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 56:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = z.b(x(xVar, j8));
                        i16 = iB + i14;
                    }
                    break;
                case 57:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = w(xVar, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 58:
                    if (n(xVar, i18, i17)) {
                        i15 = i16 * 53;
                        boolean zBooleanValue = ((Boolean) p1.f6801c.h(xVar, j8)).booleanValue();
                        Charset charset2 = z.f6936a;
                        if (zBooleanValue) {
                            i19 = 1231;
                        }
                        i16 = i19 + i15;
                    }
                    break;
                case 59:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = ((String) p1.f6801c.h(xVar, j8)).hashCode();
                        i16 = iB + i14;
                    }
                    break;
                case 60:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = p1.f6801c.h(xVar, j8).hashCode();
                        i16 = iB + i14;
                    }
                    break;
                case 61:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = p1.f6801c.h(xVar, j8).hashCode();
                        i16 = iB + i14;
                    }
                    break;
                case 62:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = w(xVar, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 63:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = w(xVar, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 64:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = w(xVar, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 65:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = z.b(x(xVar, j8));
                        i16 = iB + i14;
                    }
                    break;
                case 66:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = w(xVar, j8);
                        i16 = iB + i14;
                    }
                    break;
                case 67:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = z.b(x(xVar, j8));
                        i16 = iB + i14;
                    }
                    break;
                case 68:
                    if (n(xVar, i18, i17)) {
                        i14 = i16 * 53;
                        iB = p1.f6801c.h(xVar, j8).hashCode();
                        i16 = iB + i14;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f6868n.g(xVar).hashCode() + (i16 * 53);
        if (!this.f6860f) {
            return iHashCode2;
        }
        return this.f6869o.c(xVar).f6848a.hashCode() + (iHashCode2 * 53);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(x xVar, x xVar2, int i14) {
        return k(xVar, i14) == k(xVar2, i14);
    }

    public final <UT, UB> UB g(Object obj, int i14, UB ub3, m1<UT, UB> m1Var, Object obj2) {
        z.c cVarH;
        int i15 = this.f6855a[i14];
        Object objH = p1.f6801c.h(obj, I(i14) & 1048575);
        if (objH == null || (cVarH = h(i14)) == null) {
            return ub3;
        }
        l0 l0Var = this.f6870p;
        k0 k0VarForMutableMapData = l0Var.forMutableMapData(objH);
        j0.a<?, ?> aVarForMapMetadata = l0Var.forMapMetadata(i(i14));
        Iterator it = k0VarForMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).getClass();
            if (!cVarH.a()) {
                if (ub3 == null) {
                    ub3 = (UB) m1Var.f(obj2);
                }
                h.f fVar = new h.f(j0.a(aVarForMapMetadata, entry.getKey(), entry.getValue()), null);
                CodedOutputStream.c cVar = fVar.f6712a;
                try {
                    j0.c(cVar, aVarForMapMetadata, entry.getKey(), entry.getValue());
                    if (cVar.f6661e - cVar.f6662f != 0) {
                        vb.h.z("Did not write as much data as expected.");
                        return null;
                    }
                    m1Var.d(ub3, i15, new h.C0094h(fVar.f6713b));
                    it.remove();
                } catch (IOException e4) {
                    o2.c.p(e4);
                    return null;
                }
            }
        }
        return ub3;
    }

    public final z.c h(int i14) {
        return (z.c) this.f6856b[androidx.core.view.j.v(i14, 3, 2, 1)];
    }

    public final Object i(int i14) {
        return this.f6856b[(i14 / 3) * 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.datastore.preferences.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.datastore.preferences.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.datastore.preferences.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [androidx.datastore.preferences.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean isInitialized(T t7) {
        int i14;
        int i15;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        while (i18 < this.f6864j) {
            int i19 = this.f6863i[i18];
            int[] iArr = this.f6855a;
            int i24 = iArr[i19];
            int I = I(i19);
            int i25 = iArr[i19 + 2];
            int i26 = i25 & 1048575;
            int i27 = 1 << (i25 >>> 20);
            if (i26 != i16) {
                if (i26 != 1048575) {
                    i17 = f6854r.getInt(t7, i26);
                }
                i15 = i17;
                i14 = i26;
            } else {
                int i28 = i17;
                i14 = i16;
                i15 = i28;
            }
            if ((268435456 & I) == 0 || l(t7, i19, i14, i15, i27)) {
                int iH = H(I);
                if (iH == 9 || iH == 17) {
                    if (!l(t7, i19, i14, i15, i27)) {
                        continue;
                    } else if (!j(i19).isInitialized(p1.f6801c.h(t7, I & 1048575))) {
                    }
                    i18++;
                    i16 = i14;
                    i17 = i15;
                } else {
                    if (iH != 27) {
                        if (iH == 60 || iH == 68) {
                            if (!n(t7, i24, i19)) {
                                continue;
                            } else if (!j(i19).isInitialized(p1.f6801c.h(t7, I & 1048575))) {
                            }
                            i18++;
                            i16 = i14;
                            i17 = i15;
                        } else if (iH != 49) {
                            if (iH != 50) {
                                continue;
                            } else {
                                Object objH = p1.f6801c.h(t7, I & 1048575);
                                l0 l0Var = this.f6870p;
                                k0 k0VarForMapData = l0Var.forMapData(objH);
                                if (!k0VarForMapData.isEmpty() && l0Var.forMapMetadata(i(i19)).f6753c.f6845a == t1.MESSAGE) {
                                    ?? A = 0;
                                    for (Object obj : k0VarForMapData.values()) {
                                        if (A == 0) {
                                            A = A;
                                            A = c1.f6688c.a(obj.getClass());
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
                    List list = (List) p1.f6801c.h(t7, I & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? J = j(i19);
                        for (int i29 = 0; i29 < list.size(); i29++) {
                            if (J.isInitialized(list.get(i29))) {
                            }
                        }
                    }
                    i18++;
                    i16 = i14;
                    i17 = i15;
                }
            }
        }
        return !this.f6860f || this.f6869o.c(t7).g();
    }

    public final g1 j(int i14) {
        int i15 = (i14 / 3) * 2;
        Object[] objArr = this.f6856b;
        g1 g1Var = (g1) objArr[i15];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> g1VarA = c1.f6688c.a((Class) objArr[i15 + 1]);
        objArr[i15] = g1VarA;
        return g1VarA;
    }

    public final boolean k(T t7, int i14) {
        int i15 = this.f6855a[i14 + 2];
        long j8 = i15 & 1048575;
        if (j8 == 1048575) {
            int I = I(i14);
            long j14 = I & 1048575;
            switch (H(I)) {
                case 0:
                    if (Double.doubleToRawLongBits(p1.f6801c.d(t7, j14)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(p1.f6801c.e(t7, j14)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (p1.f6801c.g(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (p1.f6801c.g(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (p1.f6801c.f(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (p1.f6801c.g(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (p1.f6801c.f(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return p1.f6801c.c(t7, j14);
                case 8:
                    Object objH = p1.f6801c.h(t7, j14);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof h) {
                        return !h.f6707b.equals(objH);
                    }
                    vb.h.w();
                    return false;
                case 9:
                    if (p1.f6801c.h(t7, j14) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !h.f6707b.equals(p1.f6801c.h(t7, j14));
                case 11:
                    if (p1.f6801c.f(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (p1.f6801c.f(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (p1.f6801c.f(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (p1.f6801c.g(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (p1.f6801c.f(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (p1.f6801c.g(t7, j14) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (p1.f6801c.h(t7, j14) == null) {
                        return false;
                    }
                    break;
                default:
                    vb.h.w();
                    return false;
            }
        } else {
            if ((p1.f6801c.f(t7, j8) & (1 << (i15 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean l(T t7, int i14, int i15, int i16, int i17) {
        if (i15 == 1048575) {
            return k(t7, i14);
        }
        return (i16 & i17) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.g1
    public final void makeImmutable(T t7) {
        if (m(t7)) {
            if (t7 instanceof x) {
                x xVar = (x) t7;
                xVar.e(Integer.MAX_VALUE);
                xVar.memoizedHashCode = 0;
                xVar.k();
            }
            int[] iArr = this.f6855a;
            int length = iArr.length;
            for (int i14 = 0; i14 < length; i14 += 3) {
                int I = I(i14);
                long j8 = 1048575 & I;
                int iH = H(I);
                if (iH != 9) {
                    if (iH != 60 && iH != 68) {
                        switch (iH) {
                            case 17:
                                if (k(t7, i14)) {
                                    j(i14).makeImmutable(f6854r.getObject(t7, j8));
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
                                this.f6867m.c(t7, j8);
                                break;
                            case 50:
                                Unsafe unsafe = f6854r;
                                Object object = unsafe.getObject(t7, j8);
                                if (object != null) {
                                    unsafe.putObject(t7, j8, this.f6870p.toImmutable(object));
                                }
                                break;
                        }
                    } else if (n(t7, iArr[i14], i14)) {
                        j(i14).makeImmutable(f6854r.getObject(t7, j8));
                    }
                } else if (k(t7, i14)) {
                    j(i14).makeImmutable(f6854r.getObject(t7, j8));
                }
            }
            this.f6868n.j(t7);
            if (this.f6860f) {
                this.f6869o.f(t7);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.g1
    public final void mergeFrom(T t7, T t14) {
        T t15;
        if (!m(t7)) {
            vb.h.s(e5.f(t7, "Mutating immutable message: "));
            return;
        }
        t14.getClass();
        int i14 = 0;
        while (true) {
            int[] iArr = this.f6855a;
            if (i14 >= iArr.length) {
                T t16 = t7;
                Class<?> cls = h1.f6717a;
                m1<?, ?> m1Var = this.f6868n;
                m1Var.o(t16, m1Var.k(m1Var.g(t16), m1Var.g(t14)));
                if (this.f6860f) {
                    h1.k(this.f6869o, t16, t14);
                    return;
                }
                return;
            }
            int I = I(i14);
            long j8 = 1048575 & I;
            int i15 = iArr[i14];
            switch (H(I)) {
                case 0:
                    if (!k(t14, i14)) {
                        t15 = t7;
                    } else {
                        p1.e eVar = p1.f6801c;
                        t15 = t7;
                        eVar.l(t15, j8, eVar.d(t14, j8));
                        D(t15, i14);
                    }
                    break;
                case 1:
                    if (k(t14, i14)) {
                        p1.e eVar2 = p1.f6801c;
                        eVar2.m(t7, j8, eVar2.e(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 2:
                    if (k(t14, i14)) {
                        p1.n(t7, j8, p1.f6801c.g(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 3:
                    if (k(t14, i14)) {
                        p1.n(t7, j8, p1.f6801c.g(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 4:
                    if (k(t14, i14)) {
                        p1.m(t7, j8, p1.f6801c.f(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 5:
                    if (k(t14, i14)) {
                        p1.n(t7, j8, p1.f6801c.g(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 6:
                    if (k(t14, i14)) {
                        p1.m(t7, j8, p1.f6801c.f(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 7:
                    if (k(t14, i14)) {
                        p1.e eVar3 = p1.f6801c;
                        eVar3.j(t7, j8, eVar3.c(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 8:
                    if (k(t14, i14)) {
                        p1.o(t7, j8, p1.f6801c.h(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 9:
                    p(t7, t14, i14);
                    t15 = t7;
                    break;
                case 10:
                    if (k(t14, i14)) {
                        p1.o(t7, j8, p1.f6801c.h(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 11:
                    if (k(t14, i14)) {
                        p1.m(t7, j8, p1.f6801c.f(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 12:
                    if (k(t14, i14)) {
                        p1.m(t7, j8, p1.f6801c.f(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 13:
                    if (k(t14, i14)) {
                        p1.m(t7, j8, p1.f6801c.f(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 14:
                    if (k(t14, i14)) {
                        p1.n(t7, j8, p1.f6801c.g(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 15:
                    if (k(t14, i14)) {
                        p1.m(t7, j8, p1.f6801c.f(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 16:
                    if (k(t14, i14)) {
                        p1.n(t7, j8, p1.f6801c.g(t14, j8));
                        D(t7, i14);
                    }
                    t15 = t7;
                    break;
                case 17:
                    p(t7, t14, i14);
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
                    this.f6867m.b(t7, t14, j8);
                    t15 = t7;
                    break;
                case 50:
                    Class<?> cls2 = h1.f6717a;
                    p1.e eVar4 = p1.f6801c;
                    p1.o(t7, j8, this.f6870p.mergeFrom(eVar4.h(t7, j8), eVar4.h(t14, j8)));
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
                    if (n(t14, i15, i14)) {
                        p1.o(t7, j8, p1.f6801c.h(t14, j8));
                        E(t7, i15, i14);
                    }
                    t15 = t7;
                    break;
                case 60:
                    q(t7, t14, i14);
                    t15 = t7;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (n(t14, i15, i14)) {
                        p1.o(t7, j8, p1.f6801c.h(t14, j8));
                        E(t7, i15, i14);
                    }
                    t15 = t7;
                    break;
                case 68:
                    q(t7, t14, i14);
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

    public final boolean n(T t7, int i14, int i15) {
        return p1.f6801c.f(t7, (long) (this.f6855a[i15 + 2] & 1048575)) == i14;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final T newInstance() {
        return (T) this.f6866l.newInstance(this.f6859e);
    }

    public final void o(Object obj, int i14, Object obj2, o oVar, j jVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        long jI = I(i14) & 1048575;
        Object objH = p1.f6801c.h(obj, jI);
        l0 l0Var = this.f6870p;
        if (objH == null) {
            objH = l0Var.a();
            p1.o(obj, jI, objH);
        } else if (l0Var.isImmutable(objH)) {
            k0 k0VarA = l0Var.a();
            l0Var.mergeFrom(k0VarA, objH);
            p1.o(obj, jI, k0VarA);
            objH = k0VarA;
        }
        k0 k0VarForMutableMapData = l0Var.forMutableMapData(objH);
        j0.a<?, ?> aVarForMapMetadata = l0Var.forMapMetadata(obj2);
        jVar.y(2);
        i iVar = jVar.f6743a;
        int iF = iVar.f(iVar.w());
        Object objJ = aVarForMapMetadata.f6752b;
        Object obj3 = aVarForMapMetadata.f6754d;
        Object objJ2 = obj3;
        while (true) {
            try {
                int iB = jVar.b();
                if (iB == Integer.MAX_VALUE || iVar.c()) {
                    break;
                }
                if (iB == 1) {
                    objJ = jVar.j(aVarForMapMetadata.f6751a, null, null);
                } else if (iB != 2) {
                    try {
                        if (!jVar.z()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!jVar.z()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objJ2 = jVar.j(aVarForMapMetadata.f6753c, obj3.getClass(), oVar);
                }
            } catch (Throwable th3) {
                iVar.e(iF);
                throw th3;
            }
        }
        k0VarForMutableMapData.put(objJ, objJ2);
        iVar.e(iF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(T t7, T t14, int i14) {
        if (k(t14, i14)) {
            long jI = I(i14) & 1048575;
            Unsafe unsafe = f6854r;
            Object object = unsafe.getObject(t14, jI);
            if (object == null) {
                com.google.protobuf.a.f(this.f6855a[i14], t14);
                return;
            }
            g1 g1VarJ = j(i14);
            if (!k(t7, i14)) {
                if (m(object)) {
                    Object objNewInstance = g1VarJ.newInstance();
                    g1VarJ.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t7, jI, objNewInstance);
                } else {
                    unsafe.putObject(t7, jI, object);
                }
                D(t7, i14);
                return;
            }
            Object object2 = unsafe.getObject(t7, jI);
            if (!m(object2)) {
                Object objNewInstance2 = g1VarJ.newInstance();
                g1VarJ.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t7, jI, objNewInstance2);
                object2 = objNewInstance2;
            }
            g1VarJ.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(T t7, T t14, int i14) {
        int[] iArr = this.f6855a;
        int i15 = iArr[i14];
        if (n(t14, i15, i14)) {
            long jI = I(i14) & 1048575;
            Unsafe unsafe = f6854r;
            Object object = unsafe.getObject(t14, jI);
            if (object == null) {
                com.google.protobuf.a.f(iArr[i14], t14);
                return;
            }
            g1 g1VarJ = j(i14);
            if (!n(t7, i15, i14)) {
                if (m(object)) {
                    Object objNewInstance = g1VarJ.newInstance();
                    g1VarJ.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t7, jI, objNewInstance);
                } else {
                    unsafe.putObject(t7, jI, object);
                }
                E(t7, i15, i14);
                return;
            }
            Object object2 = unsafe.getObject(t7, jI);
            if (!m(object2)) {
                Object objNewInstance2 = g1VarJ.newInstance();
                g1VarJ.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t7, jI, objNewInstance2);
                object2 = objNewInstance2;
            }
            g1VarJ.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object r(T t7, int i14) {
        g1 g1VarJ = j(i14);
        long jI = I(i14) & 1048575;
        if (!k(t7, i14)) {
            return g1VarJ.newInstance();
        }
        Object object = f6854r.getObject(t7, jI);
        if (m(object)) {
            return object;
        }
        Object objNewInstance = g1VarJ.newInstance();
        if (object != null) {
            g1VarJ.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object s(T t7, int i14, int i15) {
        g1 g1VarJ = j(i15);
        if (!n(t7, i14, i15)) {
            return g1VarJ.newInstance();
        }
        Object object = f6854r.getObject(t7, I(i15) & 1048575);
        if (m(object)) {
            return object;
        }
        Object objNewInstance = g1VarJ.newInstance();
        if (object != null) {
            g1VarJ.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(Object obj, long j8, j jVar, g1 g1Var, o oVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iV;
        z.d dVarA = this.f6867m.a(j8, obj);
        i iVar = jVar.f6743a;
        int i14 = jVar.f6744b;
        if ((i14 & 7) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object objNewInstance = g1Var.newInstance();
            jVar.c(objNewInstance, g1Var, oVar);
            g1Var.makeImmutable(objNewInstance);
            dVarA.add(objNewInstance);
            if (iVar.c() || jVar.f6746d != 0) {
                return;
            } else {
                iV = iVar.v();
            }
        } while (iV == i14);
        jVar.f6746d = iV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(Object obj, int i14, j jVar, g1 g1Var, o oVar) throws InvalidProtocolBufferException {
        int iV;
        z.d dVarA = this.f6867m.a(i14 & 1048575, obj);
        i iVar = jVar.f6743a;
        int i15 = jVar.f6744b;
        if ((i15 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Object objNewInstance = g1Var.newInstance();
            jVar.d(objNewInstance, g1Var, oVar);
            g1Var.makeImmutable(objNewInstance);
            dVarA.add(objNewInstance);
            if (iVar.c() || jVar.f6746d != 0) {
                return;
            } else {
                iV = iVar.v();
            }
        } while (iV == i15);
        jVar.f6746d = iV;
    }
}
