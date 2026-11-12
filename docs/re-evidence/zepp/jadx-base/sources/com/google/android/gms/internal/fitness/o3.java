package com.google.android.gms.internal.fitness;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class o3<T> implements x3<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = s4.s();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final zzik e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final p3 m;
    private final z2 n;
    private final n4<?, ?> o;
    private final m2<?> p;
    private final h3 q;

    private o3(int[] iArr, Object[] objArr, int i, int i2, zzik zzikVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, p3 p3Var, z2 z2Var, n4<?, ?> n4Var, m2<?> m2Var, h3 h3Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = zzikVar instanceof zzgy;
        this.h = z;
        this.f = m2Var != null && m2Var.f(zzikVar);
        this.i = false;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = p3Var;
        this.n = z2Var;
        this.o = n4Var;
        this.p = m2Var;
        this.e = zzikVar;
        this.q = h3Var;
    }

    private static <T> double A(T t, long j) {
        return ((Double) s4.G(t, j)).doubleValue();
    }

    private static <T> float B(T t, long j) {
        return ((Float) s4.G(t, j)).floatValue();
    }

    private static <T> int C(T t, long j) {
        return ((Integer) s4.G(t, j)).intValue();
    }

    private static <T> long D(T t, long j) {
        return ((Long) s4.G(t, j)).longValue();
    }

    private static <T> boolean E(T t, long j) {
        return ((Boolean) s4.G(t, j)).booleanValue();
    }

    private static <UT, UB> int f(n4<UT, UB> n4Var, T t) {
        return n4Var.f(n4Var.g(t));
    }

    /* JADX WARN: Code duplicated, block: B:163:0x033a  */
    /* JADX WARN: Code duplicated, block: B:177:0x038c  */
    /* JADX WARN: Code duplicated, block: B:180:0x039c  */
    public static <T> o3<T> g(Class<T> cls, l3 l3Var, p3 p3Var, z2 z2Var, n4<?, ?> n4Var, m2<?> m2Var, h3 h3Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int i2;
        int[] iArr;
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        int i5;
        char cCharAt3;
        int i6;
        char cCharAt4;
        int i7;
        char cCharAt5;
        int i8;
        char cCharAt6;
        int i9;
        char cCharAt7;
        int i10;
        char cCharAt8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i16;
        int i17;
        Field fieldH;
        int i18;
        char cCharAt9;
        int i19;
        int i20;
        Field fieldH2;
        Field fieldH3;
        int i21;
        char cCharAt10;
        int i22;
        char cCharAt11;
        int i23;
        char cCharAt12;
        int i24;
        char cCharAt13;
        if (!(l3Var instanceof u3)) {
            ((i4) l3Var).a();
            int i25 = zziw.zzaax;
            throw new NoSuchMethodError();
        }
        u3 u3Var = (u3) l3Var;
        int i26 = 0;
        boolean z = u3Var.a() == zziw.zzaax;
        String strD = u3Var.d();
        int length = strD.length();
        if (strD.charAt(0) >= 55296) {
            int i27 = 1;
            while (true) {
                i = i27 + 1;
                if (strD.charAt(i27) < 55296) {
                    break;
                }
                i27 = i;
            }
        } else {
            i = 1;
        }
        int i28 = i + 1;
        int iCharAt6 = strD.charAt(i);
        if (iCharAt6 >= 55296) {
            int i29 = iCharAt6 & 8191;
            int i30 = 13;
            while (true) {
                i24 = i28 + 1;
                cCharAt13 = strD.charAt(i28);
                if (cCharAt13 < 55296) {
                    break;
                }
                i29 |= (cCharAt13 & 8191) << i30;
                i30 += 13;
                i28 = i24;
            }
            iCharAt6 = i29 | (cCharAt13 << i30);
            i28 = i24;
        }
        if (iCharAt6 == 0) {
            iArr = r;
            i2 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            iCharAt5 = 0;
        } else {
            int i31 = i28 + 1;
            int iCharAt7 = strD.charAt(i28);
            if (iCharAt7 >= 55296) {
                int i32 = iCharAt7 & 8191;
                int i33 = 13;
                while (true) {
                    i10 = i31 + 1;
                    cCharAt8 = strD.charAt(i31);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i32 |= (cCharAt8 & 8191) << i33;
                    i33 += 13;
                    i31 = i10;
                }
                iCharAt7 = i32 | (cCharAt8 << i33);
                i31 = i10;
            }
            int i34 = i31 + 1;
            int iCharAt8 = strD.charAt(i31);
            if (iCharAt8 >= 55296) {
                int i35 = iCharAt8 & 8191;
                int i36 = 13;
                while (true) {
                    i9 = i34 + 1;
                    cCharAt7 = strD.charAt(i34);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt7 & 8191) << i36;
                    i36 += 13;
                    i34 = i9;
                }
                iCharAt8 = i35 | (cCharAt7 << i36);
                i34 = i9;
            }
            int i37 = i34 + 1;
            iCharAt = strD.charAt(i34);
            if (iCharAt >= 55296) {
                int i38 = iCharAt & 8191;
                int i39 = 13;
                while (true) {
                    i8 = i37 + 1;
                    cCharAt6 = strD.charAt(i37);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt6 & 8191) << i39;
                    i39 += 13;
                    i37 = i8;
                }
                iCharAt = i38 | (cCharAt6 << i39);
                i37 = i8;
            }
            int i40 = i37 + 1;
            iCharAt2 = strD.charAt(i37);
            if (iCharAt2 >= 55296) {
                int i41 = iCharAt2 & 8191;
                int i42 = 13;
                while (true) {
                    i7 = i40 + 1;
                    cCharAt5 = strD.charAt(i40);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt5 & 8191) << i42;
                    i42 += 13;
                    i40 = i7;
                }
                iCharAt2 = i41 | (cCharAt5 << i42);
                i40 = i7;
            }
            int i43 = i40 + 1;
            iCharAt3 = strD.charAt(i40);
            if (iCharAt3 >= 55296) {
                int i44 = iCharAt3 & 8191;
                int i45 = 13;
                while (true) {
                    i6 = i43 + 1;
                    cCharAt4 = strD.charAt(i43);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt4 & 8191) << i45;
                    i45 += 13;
                    i43 = i6;
                }
                iCharAt3 = i44 | (cCharAt4 << i45);
                i43 = i6;
            }
            int i46 = i43 + 1;
            iCharAt4 = strD.charAt(i43);
            if (iCharAt4 >= 55296) {
                int i47 = iCharAt4 & 8191;
                int i48 = 13;
                while (true) {
                    i5 = i46 + 1;
                    cCharAt3 = strD.charAt(i46);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt3 & 8191) << i48;
                    i48 += 13;
                    i46 = i5;
                }
                iCharAt4 = i47 | (cCharAt3 << i48);
                i46 = i5;
            }
            int i49 = i46 + 1;
            int iCharAt9 = strD.charAt(i46);
            if (iCharAt9 >= 55296) {
                int i50 = iCharAt9 & 8191;
                int i51 = 13;
                while (true) {
                    i4 = i49 + 1;
                    cCharAt2 = strD.charAt(i49);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt2 & 8191) << i51;
                    i51 += 13;
                    i49 = i4;
                }
                iCharAt9 = i50 | (cCharAt2 << i51);
                i49 = i4;
            }
            int i52 = i49 + 1;
            iCharAt5 = strD.charAt(i49);
            if (iCharAt5 >= 55296) {
                int i53 = iCharAt5 & 8191;
                int i54 = i52;
                int i55 = 13;
                while (true) {
                    i3 = i54 + 1;
                    cCharAt = strD.charAt(i54);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i53 |= (cCharAt & 8191) << i55;
                    i55 += 13;
                    i54 = i3;
                }
                iCharAt5 = i53 | (cCharAt << i55);
                i52 = i3;
            }
            i2 = (iCharAt7 << 1) + iCharAt8;
            iArr = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i26 = iCharAt7;
            i28 = i52;
        }
        Unsafe unsafe = s;
        Object[] objArrE = u3Var.e();
        Class<?> cls2 = u3Var.c().getClass();
        int i56 = i28;
        int[] iArr2 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 << 1];
        int i57 = iCharAt5 + iCharAt4;
        int i58 = i2;
        int i59 = iCharAt5;
        int i60 = i56;
        int i61 = i57;
        int i62 = 0;
        int i63 = 0;
        while (i60 < length) {
            int i64 = i60 + 1;
            int iCharAt10 = strD.charAt(i60);
            if (iCharAt10 >= 55296) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i23 = i66 + 1;
                    cCharAt12 = strD.charAt(i66);
                    i11 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt12 & 8191) << i67;
                    i67 += 13;
                    i66 = i23;
                    length = i11;
                }
                iCharAt10 = i65 | (cCharAt12 << i67);
                i12 = i23;
            } else {
                i11 = length;
                i12 = i64;
            }
            int i68 = i12 + 1;
            int iCharAt11 = strD.charAt(i12);
            if (iCharAt11 >= 55296) {
                int i69 = iCharAt11 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i22 = i70 + 1;
                    cCharAt11 = strD.charAt(i70);
                    i13 = iCharAt5;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i22;
                    iCharAt5 = i13;
                }
                iCharAt11 = i69 | (cCharAt11 << i71);
                i14 = i22;
            } else {
                i13 = iCharAt5;
                i14 = i68;
            }
            int i72 = iCharAt11 & 255;
            int i73 = iCharAt2;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            int i74 = iCharAt;
            if (i72 >= 51) {
                int i75 = i14 + 1;
                int iCharAt12 = strD.charAt(i14);
                char c = 55296;
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = 13;
                    while (true) {
                        i21 = i75 + 1;
                        cCharAt10 = strD.charAt(i75);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i76 |= (cCharAt10 & 8191) << i77;
                        i77 += 13;
                        i75 = i21;
                        c = 55296;
                    }
                    iCharAt12 = i76 | (cCharAt10 << i77);
                    i75 = i21;
                }
                int i78 = i72 - 51;
                int i79 = i75;
                if (i78 == 9 || i78 == 17) {
                    i20 = 1;
                    objArr[((i63 / 3) << 1) + 1] = objArrE[i58];
                    i58++;
                } else {
                    if (i78 == 12 && !z) {
                        objArr[((i63 / 3) << 1) + 1] = objArrE[i58];
                        i58++;
                    }
                    i20 = 1;
                }
                int i80 = iCharAt12 << i20;
                Object obj = objArrE[i80];
                if (obj instanceof Field) {
                    fieldH2 = (Field) obj;
                } else {
                    fieldH2 = h(cls2, (String) obj);
                    objArrE[i80] = fieldH2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldH2);
                int i81 = i80 + 1;
                Object obj2 = objArrE[i81];
                if (obj2 instanceof Field) {
                    fieldH3 = (Field) obj2;
                } else {
                    fieldH3 = h(cls2, (String) obj2);
                    objArrE[i81] = fieldH3;
                }
                strD = strD;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH3);
                z = z;
                objArr = objArr;
                iObjectFieldOffset = iObjectFieldOffset3;
                i16 = i79;
                i17 = 0;
            } else {
                int i82 = i58 + 1;
                Field fieldH4 = h(cls2, (String) objArrE[i58]);
                if (i72 == 9 || i72 == 17) {
                    objArr[((i63 / 3) << 1) + 1] = fieldH4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        i19 = i82 + 1;
                        objArr[((i63 / 3) << 1) + 1] = objArrE[i82];
                    } else {
                        if (i72 == 12 || i72 == 30 || i72 == 44) {
                            if (!z) {
                                i19 = i82 + 1;
                                objArr[((i63 / 3) << 1) + 1] = objArrE[i82];
                            }
                        } else if (i72 == 50) {
                            int i83 = i59 + 1;
                            iArr[i59] = i63;
                            int i84 = (i63 / 3) << 1;
                            i19 = i82 + 1;
                            objArr[i84] = objArrE[i82];
                            if ((iCharAt11 & 2048) != 0) {
                                i82 = i19 + 1;
                                objArr[i84 + 1] = objArrE[i19];
                                i59 = i83;
                            } else {
                                i59 = i83;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
                        int i85 = i15;
                        if ((iCharAt11 & 4096) == 4096 || i72 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i16 = i14;
                            i17 = 0;
                        } else {
                            int i86 = i14 + 1;
                            int iCharAt13 = strD.charAt(i14);
                            if (iCharAt13 >= 55296) {
                                int i87 = iCharAt13 & 8191;
                                int i88 = 13;
                                while (true) {
                                    i18 = i86 + 1;
                                    cCharAt9 = strD.charAt(i86);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i87 |= (cCharAt9 & 8191) << i88;
                                    i88 += 13;
                                    i86 = i18;
                                }
                                iCharAt13 = i87 | (cCharAt9 << i88);
                                i86 = i18;
                            }
                            int i89 = (i26 << 1) + (iCharAt13 / 32);
                            Object obj3 = objArrE[i89];
                            if (obj3 instanceof Field) {
                                fieldH = (Field) obj3;
                            } else {
                                fieldH = h(cls2, (String) obj3);
                                objArrE[i89] = fieldH;
                            }
                            i17 = iCharAt13 % 32;
                            i16 = i86;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH);
                        }
                        if (i72 >= 18 && i72 <= 49) {
                            iArr[i61] = iObjectFieldOffset;
                            i61++;
                        }
                        i58 = i85;
                    }
                    i15 = i19;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
                    int i810 = i15;
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i16 = i14;
                        i17 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i16 = i14;
                        i17 = 0;
                    }
                    if (i72 >= 18) {
                        iArr[i61] = iObjectFieldOffset;
                        i61++;
                    }
                    i58 = i810;
                }
                i15 = i82;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
                int i811 = i15;
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i16 = i14;
                    i17 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i16 = i14;
                    i17 = 0;
                }
                if (i72 >= 18) {
                    iArr[i61] = iObjectFieldOffset;
                    i61++;
                }
                i58 = i811;
            }
            int i90 = i63 + 1;
            iArr2[i63] = iCharAt10;
            int i91 = i90 + 1;
            int i92 = i26;
            iArr2[i90] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i72 << 20) | iObjectFieldOffset;
            int i93 = i91 + 1;
            iArr2[i91] = (i17 << 20) | iObjectFieldOffset2;
            i60 = i16;
            i26 = i92;
            iCharAt2 = i73;
            objArr = objArr;
            iCharAt5 = i13;
            iCharAt = i74;
            z = z;
            i63 = i93;
            length = i11;
            strD = strD;
        }
        return new o3<>(iArr2, objArr, iCharAt, iCharAt2, u3Var.c(), z, false, iArr, iCharAt5, i57, p3Var, z2Var, n4Var, m2Var, h3Var);
    }

    private static Field h(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    private static void i(int i, Object obj, d5 d5Var) throws IOException {
        if (obj instanceof String) {
            d5Var.t(i, (String) obj);
        } else {
            d5Var.K(i, (zzfx) obj);
        }
    }

    private static <UT, UB> void j(n4<UT, UB> n4Var, T t, d5 d5Var) throws IOException {
        n4Var.a(n4Var.g(t), d5Var);
    }

    private final <K, V> void k(d5 d5Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            d5Var.N(i, this.q.a(q(i2)), this.q.e(obj));
        }
    }

    private final void l(T t, T t2, int i) {
        long jR = r(i) & 1048575;
        if (w(t2, i)) {
            Object objG = s4.G(t, jR);
            Object objG2 = s4.G(t2, jR);
            if (objG != null && objG2 != null) {
                s4.g(t, jR, zzhc.d(objG, objG2));
                x(t, i);
            } else if (objG2 != null) {
                s4.g(t, jR, objG2);
                x(t, i);
            }
        }
    }

    private final boolean m(T t, int i, int i2) {
        return s4.A(t, (long) (s(i2) & 1048575)) == i;
    }

    private final boolean n(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return w(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean o(Object obj, int i, x3 x3Var) {
        return x3Var.d(s4.G(obj, i & 1048575));
    }

    private final x3 p(int i) {
        int i2 = (i / 3) << 1;
        x3 x3Var = (x3) this.b[i2];
        if (x3Var != null) {
            return x3Var;
        }
        x3<T> x3VarB = t3.a().b((Class) this.b[i2 + 1]);
        this.b[i2] = x3VarB;
        return x3VarB;
    }

    private final Object q(int i) {
        return this.b[(i / 3) << 1];
    }

    private final int r(int i) {
        return this.a[i + 1];
    }

    private final int s(int i) {
        return this.a[i + 2];
    }

    private final void t(T t, int i, int i2) {
        s4.e(t, s(i2) & 1048575, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    private final void u(T t, d5 d5Var) throws IOException {
        Iterator itD;
        Map.Entry<?, ?> entry;
        int i;
        if (this.f) {
            q2<T> q2VarC = this.p.c(t);
            if (q2VarC.a.isEmpty()) {
                itD = null;
                entry = null;
            } else {
                itD = q2VarC.d();
                entry = (Map.Entry) itD.next();
            }
        } else {
            itD = null;
            entry = null;
        }
        int length = this.a.length;
        Unsafe unsafe = s;
        int i2 = 1048575;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iR = r(i4);
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int i6 = (iR & 267386880) >>> 20;
            if (i6 <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i2) {
                    i3 = unsafe.getInt(t, i8);
                    i2 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            while (entry != null && this.p.a(entry) <= i5) {
                this.p.b(d5Var, entry);
                entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
            }
            long j = iR & 1048575;
            switch (i6) {
                case 0:
                    if ((i & i3) != 0) {
                        d5Var.i(i5, s4.F(t, j));
                        continue;
                    }
                    break;
                case 1:
                    if ((i & i3) != 0) {
                        d5Var.j(i5, s4.E(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    if ((i & i3) != 0) {
                        d5Var.s(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    if ((i & i3) != 0) {
                        d5Var.h(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if ((i & i3) != 0) {
                        d5Var.m(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    if ((i & i3) != 0) {
                        d5Var.d(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    if ((i & i3) != 0) {
                        d5Var.q(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 7:
                    if ((i & i3) != 0) {
                        d5Var.a(i5, s4.D(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    if ((i & i3) != 0) {
                        i(i5, unsafe.getObject(t, j), d5Var);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    if ((i & i3) != 0) {
                        d5Var.H(i5, unsafe.getObject(t, j), p(i4));
                    } else {
                        continue;
                    }
                    break;
                case 10:
                    if ((i & i3) != 0) {
                        d5Var.K(i5, (zzfx) unsafe.getObject(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 11:
                    if ((i & i3) != 0) {
                        d5Var.k(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 12:
                    if ((i & i3) != 0) {
                        d5Var.A(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 13:
                    if ((i & i3) != 0) {
                        d5Var.x(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 14:
                    if ((i & i3) != 0) {
                        d5Var.n(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 15:
                    if ((i & i3) != 0) {
                        d5Var.l(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 16:
                    if ((i & i3) != 0) {
                        d5Var.b(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    break;
                case 17:
                    if ((i & i3) != 0) {
                        d5Var.F(i5, unsafe.getObject(t, j), p(i4));
                    } else {
                        continue;
                    }
                    break;
                case 18:
                    z3.c(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 19:
                    z3.j(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 20:
                    z3.o(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 21:
                    z3.t(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 22:
                    z3.I(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 23:
                    z3.D(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 24:
                    z3.O(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 25:
                    z3.R(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 26:
                    z3.a(this.a[i4], (List) unsafe.getObject(t, j), d5Var);
                    break;
                case 27:
                    z3.b(this.a[i4], (List) unsafe.getObject(t, j), d5Var, p(i4));
                    break;
                case 28:
                    z3.h(this.a[i4], (List) unsafe.getObject(t, j), d5Var);
                    break;
                case 29:
                    z3.K(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 30:
                    z3.Q(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 31:
                    z3.P(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 32:
                    z3.G(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 33:
                    z3.M(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 34:
                    z3.A(this.a[i4], (List) unsafe.getObject(t, j), d5Var, false);
                    break;
                case 35:
                    z3.c(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 36:
                    z3.j(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 37:
                    z3.o(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 38:
                    z3.t(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 39:
                    z3.I(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 40:
                    z3.D(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 41:
                    z3.O(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 42:
                    z3.R(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 43:
                    z3.K(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 44:
                    z3.Q(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 45:
                    z3.P(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 46:
                    z3.G(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 47:
                    z3.M(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 48:
                    z3.A(this.a[i4], (List) unsafe.getObject(t, j), d5Var, true);
                    break;
                case 49:
                    z3.i(this.a[i4], (List) unsafe.getObject(t, j), d5Var, p(i4));
                    break;
                case 50:
                    k(d5Var, i5, unsafe.getObject(t, j), i4);
                    break;
                case 51:
                    if (m(t, i5, i4)) {
                        d5Var.i(i5, A(t, j));
                    }
                    break;
                case 52:
                    if (m(t, i5, i4)) {
                        d5Var.j(i5, B(t, j));
                    }
                    break;
                case 53:
                    if (m(t, i5, i4)) {
                        d5Var.s(i5, D(t, j));
                    }
                    break;
                case 54:
                    if (m(t, i5, i4)) {
                        d5Var.h(i5, D(t, j));
                    }
                    break;
                case 55:
                    if (m(t, i5, i4)) {
                        d5Var.m(i5, C(t, j));
                    }
                    break;
                case 56:
                    if (m(t, i5, i4)) {
                        d5Var.d(i5, D(t, j));
                    }
                    break;
                case 57:
                    if (m(t, i5, i4)) {
                        d5Var.q(i5, C(t, j));
                    }
                    break;
                case 58:
                    if (m(t, i5, i4)) {
                        d5Var.a(i5, E(t, j));
                    }
                    break;
                case 59:
                    if (m(t, i5, i4)) {
                        i(i5, unsafe.getObject(t, j), d5Var);
                    }
                    break;
                case 60:
                    if (m(t, i5, i4)) {
                        d5Var.H(i5, unsafe.getObject(t, j), p(i4));
                    }
                    break;
                case 61:
                    if (m(t, i5, i4)) {
                        d5Var.K(i5, (zzfx) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (m(t, i5, i4)) {
                        d5Var.k(i5, C(t, j));
                    }
                    break;
                case 63:
                    if (m(t, i5, i4)) {
                        d5Var.A(i5, C(t, j));
                    }
                    break;
                case 64:
                    if (m(t, i5, i4)) {
                        d5Var.x(i5, C(t, j));
                    }
                    break;
                case 65:
                    if (m(t, i5, i4)) {
                        d5Var.n(i5, D(t, j));
                    }
                    break;
                case 66:
                    if (m(t, i5, i4)) {
                        d5Var.l(i5, C(t, j));
                    }
                    break;
                case 67:
                    if (m(t, i5, i4)) {
                        d5Var.b(i5, D(t, j));
                    }
                    break;
                case 68:
                    if (m(t, i5, i4)) {
                        d5Var.F(i5, unsafe.getObject(t, j), p(i4));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.p.b(d5Var, entry);
            entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
        }
        j(this.o, t, d5Var);
    }

    private final void v(T t, T t2, int i) {
        int iR = r(i);
        int i2 = this.a[i];
        long j = iR & 1048575;
        if (m(t2, i2, i)) {
            Object objG = m(t, i2, i) ? s4.G(t, j) : null;
            Object objG2 = s4.G(t2, j);
            if (objG != null && objG2 != null) {
                s4.g(t, j, zzhc.d(objG, objG2));
                t(t, i2, i);
            } else if (objG2 != null) {
                s4.g(t, j, objG2);
                t(t, i2, i);
            }
        }
    }

    private final boolean w(T t, int i) {
        int iS = s(i);
        long j = iS & 1048575;
        if (j != 1048575) {
            return (s4.A(t, j) & (1 << (iS >>> 20))) != 0;
        }
        int iR = r(i);
        long j2 = iR & 1048575;
        switch ((iR & 267386880) >>> 20) {
            case 0:
                return s4.F(t, j2) != 0.0d;
            case 1:
                return s4.E(t, j2) != 0.0f;
            case 2:
                return s4.C(t, j2) != 0;
            case 3:
                return s4.C(t, j2) != 0;
            case 4:
                return s4.A(t, j2) != 0;
            case 5:
                return s4.C(t, j2) != 0;
            case 6:
                return s4.A(t, j2) != 0;
            case 7:
                return s4.D(t, j2);
            case 8:
                Object objG = s4.G(t, j2);
                if (objG instanceof String) {
                    return !((String) objG).isEmpty();
                }
                if (objG instanceof zzfx) {
                    return !zzfx.zzub.equals(objG);
                }
                throw new IllegalArgumentException();
            case 9:
                return s4.G(t, j2) != null;
            case 10:
                return !zzfx.zzub.equals(s4.G(t, j2));
            case 11:
                return s4.A(t, j2) != 0;
            case 12:
                return s4.A(t, j2) != 0;
            case 13:
                return s4.A(t, j2) != 0;
            case 14:
                return s4.C(t, j2) != 0;
            case 15:
                return s4.A(t, j2) != 0;
            case 16:
                return s4.C(t, j2) != 0;
            case 17:
                return s4.G(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void x(T t, int i) {
        int iS = s(i);
        long j = 1048575 & iS;
        if (j == 1048575) {
            return;
        }
        s4.e(t, j, (1 << (iS >>> 20)) | s4.A(t, j));
    }

    private final boolean y(T t, T t2, int i) {
        return w(t, i) == w(t2, i);
    }

    private static List<?> z(Object obj, long j) {
        return (List) s4.G(obj, j);
    }

    @Override // com.google.android.gms.internal.fitness.x3
    public final void a(T t) {
        int i;
        int i2 = this.k;
        while (true) {
            i = this.l;
            if (i2 >= i) {
                break;
            }
            long jR = r(this.j[i2]) & 1048575;
            Object objG = s4.G(t, jR);
            if (objG != null) {
                s4.g(t, jR, this.q.d(objG));
            }
            i2++;
        }
        int length = this.j.length;
        while (i < length) {
            this.n.a(t, this.j[i]);
            i++;
        }
        this.o.c(t);
        if (this.f) {
            this.p.e(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:328:0x080b A[PHI: r5
      0x080b: PHI (r5v4 int) = 
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v16 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v17 int)
      (r5v1 int)
     binds: [B:204:0x04b4, B:366:0x08af, B:360:0x0893, B:357:0x0881, B:354:0x0872, B:351:0x0865, B:348:0x0858, B:344:0x084d, B:341:0x0842, B:338:0x0835, B:335:0x0828, B:332:0x0815, B:305:0x0724, B:302:0x070f, B:299:0x06fa, B:296:0x06e5, B:293:0x06d0, B:290:0x06bb, B:287:0x06a5, B:284:0x068f, B:281:0x0679, B:278:0x0663, B:275:0x064d, B:272:0x0637, B:269:0x0621, B:266:0x060b, B:261:0x05d7, B:258:0x05ca, B:255:0x05ba, B:252:0x05aa, B:249:0x059a, B:246:0x058c, B:243:0x057f, B:240:0x0572, B:234:0x0554, B:231:0x0540, B:228:0x052e, B:225:0x051e, B:222:0x050e, B:346:0x0854, B:219:0x0501, B:216:0x04f3, B:213:0x04e3, B:210:0x04d3, B:327:0x080a, B:207:0x04bd] A[DONT_GENERATE, DONT_INLINE]] */
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
    @Override // com.google.android.gms.internal.fitness.x3
    public final int b(T t) {
        int i;
        long j;
        int iZzd;
        int iZzc;
        int iZzm;
        int iZ;
        int iL;
        int iZzr;
        int iZzt;
        int iZzb;
        int iL2;
        int iZzr2;
        int iZzt2;
        int i2 = 267386880;
        int i3 = 1048575;
        int i4 = 1;
        if (!this.h) {
            Unsafe unsafe = s;
            int i5 = 0;
            int iZzb2 = 0;
            int i6 = 1048575;
            int i7 = 0;
            while (i5 < this.a.length) {
                int iR = r(i5);
                int[] iArr = this.a;
                int i8 = iArr[i5];
                int i9 = (iR & 267386880) >>> 20;
                if (i9 <= 17) {
                    int i10 = iArr[i5 + 2];
                    int i11 = i10 & i3;
                    i = i4 << (i10 >>> 20);
                    if (i11 != i6) {
                        i7 = unsafe.getInt(t, i11);
                        i6 = i11;
                    }
                } else {
                    i = 0;
                }
                long j2 = iR & i3;
                switch (i9) {
                    case 0:
                        j = 0;
                        if ((i7 & i) != 0) {
                            iZzb2 += zzgk.zzb(i8, 0.0d);
                        }
                        break;
                    case 1:
                        j = 0;
                        if ((i7 & i) != 0) {
                            iZzb2 += zzgk.zzb(i8, 0.0f);
                        }
                        break;
                    case 2:
                        j = 0;
                        if ((i & i7) != 0) {
                            iZzd = zzgk.zzd(i8, unsafe.getLong(t, j2));
                            iZzb2 += iZzd;
                        }
                        break;
                    case 3:
                        j = 0;
                        if ((i & i7) != 0) {
                            iZzd = zzgk.zze(i8, unsafe.getLong(t, j2));
                            iZzb2 += iZzd;
                        }
                        break;
                    case 4:
                        j = 0;
                        if ((i & i7) != 0) {
                            iZzd = zzgk.zzi(i8, unsafe.getInt(t, j2));
                            iZzb2 += iZzd;
                        }
                        break;
                    case 5:
                        j = 0;
                        if ((i7 & i) != 0) {
                            iZzd = zzgk.zzg(i8, 0L);
                            iZzb2 += iZzd;
                        }
                        break;
                    case 6:
                        if ((i7 & i) != 0) {
                            iZzb2 += zzgk.zzl(i8, 0);
                        }
                        j = 0;
                        break;
                    case 7:
                        if ((i7 & i) != 0) {
                            iZzb2 += zzgk.zzb(i8, true);
                        }
                        j = 0;
                        break;
                    case 8:
                        if ((i7 & i) != 0) {
                            Object object = unsafe.getObject(t, j2);
                            iZzc = object instanceof zzfx ? zzgk.zzc(i8, (zzfx) object) : zzgk.zzb(i8, (String) object);
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 9:
                        if ((i7 & i) != 0) {
                            iZzc = z3.k(i8, unsafe.getObject(t, j2), p(i5));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 10:
                        if ((i7 & i) != 0) {
                            iZzc = zzgk.zzc(i8, (zzfx) unsafe.getObject(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 11:
                        if ((i7 & i) != 0) {
                            iZzc = zzgk.zzj(i8, unsafe.getInt(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 12:
                        if ((i7 & i) != 0) {
                            iZzc = zzgk.zzn(i8, unsafe.getInt(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 13:
                        if ((i7 & i) != 0) {
                            iZzm = zzgk.zzm(i8, 0);
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 14:
                        if ((i7 & i) != 0) {
                            iZzc = zzgk.zzh(i8, 0L);
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 15:
                        if ((i7 & i) != 0) {
                            iZzc = zzgk.zzk(i8, unsafe.getInt(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 16:
                        if ((i7 & i) != 0) {
                            iZzc = zzgk.zzf(i8, unsafe.getLong(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 17:
                        if ((i7 & i) != 0) {
                            iZzc = zzgk.g(i8, (zzik) unsafe.getObject(t, j2), p(i5));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 18:
                        iZzc = z3.a0(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZzc;
                        j = 0;
                        break;
                    case 19:
                        iZ = z3.Z(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 20:
                        iZ = z3.S(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 21:
                        iZ = z3.T(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 22:
                        iZ = z3.W(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 23:
                        iZ = z3.a0(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 24:
                        iZ = z3.Z(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 25:
                        iZ = z3.b0(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 26:
                        iZzc = z3.l(i8, (List) unsafe.getObject(t, j2));
                        iZzb2 += iZzc;
                        j = 0;
                        break;
                    case 27:
                        iZzc = z3.m(i8, (List) unsafe.getObject(t, j2), p(i5));
                        iZzb2 += iZzc;
                        j = 0;
                        break;
                    case 28:
                        iZzc = z3.p(i8, (List) unsafe.getObject(t, j2));
                        iZzb2 += iZzc;
                        j = 0;
                        break;
                    case 29:
                        iZzc = z3.X(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZzc;
                        j = 0;
                        break;
                    case 30:
                        iZ = z3.V(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 31:
                        iZ = z3.Z(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 32:
                        iZ = z3.a0(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 33:
                        iZ = z3.Y(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 34:
                        iZ = z3.U(i8, (List) unsafe.getObject(t, j2), false);
                        iZzb2 += iZ;
                        j = 0;
                        break;
                    case 35:
                        iL = z3.L((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 36:
                        iL = z3.J((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 37:
                        iL = z3.g((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 38:
                        iL = z3.n((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 39:
                        iL = z3.C((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 40:
                        iL = z3.L((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 41:
                        iL = z3.J((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 42:
                        iL = z3.N((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 43:
                        iL = z3.F((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 44:
                        iL = z3.z((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 45:
                        iL = z3.J((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 46:
                        iL = z3.L((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 47:
                        iL = z3.H((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 48:
                        iL = z3.r((List) unsafe.getObject(t, j2));
                        if (iL > 0) {
                            iZzr = zzgk.zzr(i8);
                            iZzt = zzgk.zzt(iL);
                            iZzm = iZzr + iZzt + iL;
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 49:
                        iZzc = z3.q(i8, (List) unsafe.getObject(t, j2), p(i5));
                        iZzb2 += iZzc;
                        j = 0;
                        break;
                    case 50:
                        iZzc = this.q.b(i8, unsafe.getObject(t, j2), q(i5));
                        iZzb2 += iZzc;
                        j = 0;
                        break;
                    case 51:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.zzb(i8, 0.0d);
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 52:
                        if (m(t, i8, i5)) {
                            iZzm = zzgk.zzb(i8, 0.0f);
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 53:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.zzd(i8, D(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 54:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.zze(i8, D(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 55:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.zzi(i8, C(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 56:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.zzg(i8, 0L);
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 57:
                        if (m(t, i8, i5)) {
                            iZzm = zzgk.zzl(i8, 0);
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 58:
                        if (m(t, i8, i5)) {
                            iZzm = zzgk.zzb(i8, true);
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 59:
                        if (m(t, i8, i5)) {
                            Object object2 = unsafe.getObject(t, j2);
                            iZzc = object2 instanceof zzfx ? zzgk.zzc(i8, (zzfx) object2) : zzgk.zzb(i8, (String) object2);
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 60:
                        if (m(t, i8, i5)) {
                            iZzc = z3.k(i8, unsafe.getObject(t, j2), p(i5));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 61:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.zzc(i8, (zzfx) unsafe.getObject(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 62:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.zzj(i8, C(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 63:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.zzn(i8, C(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 64:
                        if (m(t, i8, i5)) {
                            iZzm = zzgk.zzm(i8, 0);
                            iZzb2 += iZzm;
                        }
                        j = 0;
                        break;
                    case 65:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.zzh(i8, 0L);
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 66:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.zzk(i8, C(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 67:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.zzf(i8, D(t, j2));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    case 68:
                        if (m(t, i8, i5)) {
                            iZzc = zzgk.g(i8, (zzik) unsafe.getObject(t, j2), p(i5));
                            iZzb2 += iZzc;
                        }
                        j = 0;
                        break;
                    default:
                        j = 0;
                        break;
                }
                i5 += 3;
                i3 = 1048575;
                i4 = 1;
            }
            int iL3 = 0;
            int iF = iZzb2 + f(this.o, t);
            if (!this.f) {
                return iF;
            }
            q2<T> q2VarC = this.p.c(t);
            for (int i12 = 0; i12 < q2VarC.a.n(); i12++) {
                Map.Entry entryH = q2VarC.a.h(i12);
                iL3 += q2.l((zzgv) entryH.getKey(), entryH.getValue());
            }
            for (Map.Entry entry : q2VarC.a.o()) {
                iL3 += q2.l((zzgv) entry.getKey(), entry.getValue());
            }
            return iF + iL3;
        }
        Unsafe unsafe2 = s;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.a.length) {
            int iR2 = r(i13);
            int i15 = (iR2 & i2) >>> 20;
            int i16 = this.a[i13];
            long j3 = iR2 & 1048575;
            if (i15 >= zzgu.zzwo.id() && i15 <= zzgu.zzxb.id()) {
                int i17 = this.a[i13 + 2];
            }
            switch (i15) {
                case 0:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzb(i16, 0.0d);
                        i14 += iZzb;
                    }
                    break;
                case 1:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzb(i16, 0.0f);
                        i14 += iZzb;
                    }
                    break;
                case 2:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzd(i16, s4.C(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 3:
                    if (w(t, i13)) {
                        iZzb = zzgk.zze(i16, s4.C(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 4:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzi(i16, s4.A(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 5:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzg(i16, 0L);
                        i14 += iZzb;
                    }
                    break;
                case 6:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzl(i16, 0);
                        i14 += iZzb;
                    }
                    break;
                case 7:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzb(i16, true);
                        i14 += iZzb;
                    }
                    break;
                case 8:
                    if (w(t, i13)) {
                        Object objG = s4.G(t, j3);
                        iZzb = objG instanceof zzfx ? zzgk.zzc(i16, (zzfx) objG) : zzgk.zzb(i16, (String) objG);
                        i14 += iZzb;
                    }
                    break;
                case 9:
                    if (w(t, i13)) {
                        iZzb = z3.k(i16, s4.G(t, j3), p(i13));
                        i14 += iZzb;
                    }
                    break;
                case 10:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzc(i16, (zzfx) s4.G(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 11:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzj(i16, s4.A(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 12:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzn(i16, s4.A(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 13:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzm(i16, 0);
                        i14 += iZzb;
                    }
                    break;
                case 14:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzh(i16, 0L);
                        i14 += iZzb;
                    }
                    break;
                case 15:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzk(i16, s4.A(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 16:
                    if (w(t, i13)) {
                        iZzb = zzgk.zzf(i16, s4.C(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 17:
                    if (w(t, i13)) {
                        iZzb = zzgk.g(i16, (zzik) s4.G(t, j3), p(i13));
                        i14 += iZzb;
                    }
                    break;
                case 18:
                    iZzb = z3.a0(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 19:
                    iZzb = z3.Z(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 20:
                    iZzb = z3.S(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 21:
                    iZzb = z3.T(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 22:
                    iZzb = z3.W(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 23:
                    iZzb = z3.a0(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 24:
                    iZzb = z3.Z(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 25:
                    iZzb = z3.b0(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 26:
                    iZzb = z3.l(i16, z(t, j3));
                    i14 += iZzb;
                    break;
                case 27:
                    iZzb = z3.m(i16, z(t, j3), p(i13));
                    i14 += iZzb;
                    break;
                case 28:
                    iZzb = z3.p(i16, z(t, j3));
                    i14 += iZzb;
                    break;
                case 29:
                    iZzb = z3.X(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 30:
                    iZzb = z3.V(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 31:
                    iZzb = z3.Z(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 32:
                    iZzb = z3.a0(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 33:
                    iZzb = z3.Y(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 34:
                    iZzb = z3.U(i16, z(t, j3), false);
                    i14 += iZzb;
                    break;
                case 35:
                    iL2 = z3.L((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 36:
                    iL2 = z3.J((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 37:
                    iL2 = z3.g((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 38:
                    iL2 = z3.n((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 39:
                    iL2 = z3.C((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 40:
                    iL2 = z3.L((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 41:
                    iL2 = z3.J((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 42:
                    iL2 = z3.N((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 43:
                    iL2 = z3.F((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 44:
                    iL2 = z3.z((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 45:
                    iL2 = z3.J((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 46:
                    iL2 = z3.L((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 47:
                    iL2 = z3.H((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 48:
                    iL2 = z3.r((List) unsafe2.getObject(t, j3));
                    if (iL2 > 0) {
                        iZzr2 = zzgk.zzr(i16);
                        iZzt2 = zzgk.zzt(iL2);
                        iZzb = iZzr2 + iZzt2 + iL2;
                        i14 += iZzb;
                    }
                    break;
                case 49:
                    iZzb = z3.q(i16, z(t, j3), p(i13));
                    i14 += iZzb;
                    break;
                case 50:
                    iZzb = this.q.b(i16, s4.G(t, j3), q(i13));
                    i14 += iZzb;
                    break;
                case 51:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzb(i16, 0.0d);
                        i14 += iZzb;
                    }
                    break;
                case 52:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzb(i16, 0.0f);
                        i14 += iZzb;
                    }
                    break;
                case 53:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzd(i16, D(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 54:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zze(i16, D(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 55:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzi(i16, C(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 56:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzg(i16, 0L);
                        i14 += iZzb;
                    }
                    break;
                case 57:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzl(i16, 0);
                        i14 += iZzb;
                    }
                    break;
                case 58:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzb(i16, true);
                        i14 += iZzb;
                    }
                    break;
                case 59:
                    if (m(t, i16, i13)) {
                        Object objG2 = s4.G(t, j3);
                        iZzb = objG2 instanceof zzfx ? zzgk.zzc(i16, (zzfx) objG2) : zzgk.zzb(i16, (String) objG2);
                        i14 += iZzb;
                    }
                    break;
                case 60:
                    if (m(t, i16, i13)) {
                        iZzb = z3.k(i16, s4.G(t, j3), p(i13));
                        i14 += iZzb;
                    }
                    break;
                case 61:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzc(i16, (zzfx) s4.G(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 62:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzj(i16, C(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 63:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzn(i16, C(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 64:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzm(i16, 0);
                        i14 += iZzb;
                    }
                    break;
                case 65:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzh(i16, 0L);
                        i14 += iZzb;
                    }
                    break;
                case 66:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzk(i16, C(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 67:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.zzf(i16, D(t, j3));
                        i14 += iZzb;
                    }
                    break;
                case 68:
                    if (m(t, i16, i13)) {
                        iZzb = zzgk.g(i16, (zzik) s4.G(t, j3), p(i13));
                        i14 += iZzb;
                    }
                    break;
            }
            i13 += 3;
            i2 = 267386880;
        }
        return i14 + f(this.o, t);
    }

    @Override // com.google.android.gms.internal.fitness.x3
    public final void c(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.a.length; i += 3) {
            int iR = r(i);
            long j = 1048575 & iR;
            int i2 = this.a[i];
            switch ((iR & 267386880) >>> 20) {
                case 0:
                    if (w(t2, i)) {
                        s4.c(t, j, s4.F(t2, j));
                        x(t, i);
                    }
                    break;
                case 1:
                    if (w(t2, i)) {
                        s4.d(t, j, s4.E(t2, j));
                        x(t, i);
                    }
                    break;
                case 2:
                    if (w(t2, i)) {
                        s4.f(t, j, s4.C(t2, j));
                        x(t, i);
                    }
                    break;
                case 3:
                    if (w(t2, i)) {
                        s4.f(t, j, s4.C(t2, j));
                        x(t, i);
                    }
                    break;
                case 4:
                    if (w(t2, i)) {
                        s4.e(t, j, s4.A(t2, j));
                        x(t, i);
                    }
                    break;
                case 5:
                    if (w(t2, i)) {
                        s4.f(t, j, s4.C(t2, j));
                        x(t, i);
                    }
                    break;
                case 6:
                    if (w(t2, i)) {
                        s4.e(t, j, s4.A(t2, j));
                        x(t, i);
                    }
                    break;
                case 7:
                    if (w(t2, i)) {
                        s4.h(t, j, s4.D(t2, j));
                        x(t, i);
                    }
                    break;
                case 8:
                    if (w(t2, i)) {
                        s4.g(t, j, s4.G(t2, j));
                        x(t, i);
                    }
                    break;
                case 9:
                    l(t, t2, i);
                    break;
                case 10:
                    if (w(t2, i)) {
                        s4.g(t, j, s4.G(t2, j));
                        x(t, i);
                    }
                    break;
                case 11:
                    if (w(t2, i)) {
                        s4.e(t, j, s4.A(t2, j));
                        x(t, i);
                    }
                    break;
                case 12:
                    if (w(t2, i)) {
                        s4.e(t, j, s4.A(t2, j));
                        x(t, i);
                    }
                    break;
                case 13:
                    if (w(t2, i)) {
                        s4.e(t, j, s4.A(t2, j));
                        x(t, i);
                    }
                    break;
                case 14:
                    if (w(t2, i)) {
                        s4.f(t, j, s4.C(t2, j));
                        x(t, i);
                    }
                    break;
                case 15:
                    if (w(t2, i)) {
                        s4.e(t, j, s4.A(t2, j));
                        x(t, i);
                    }
                    break;
                case 16:
                    if (w(t2, i)) {
                        s4.f(t, j, s4.C(t2, j));
                        x(t, i);
                    }
                    break;
                case 17:
                    l(t, t2, i);
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
                    this.n.b(t, t2, j);
                    break;
                case 50:
                    z3.e(this.q, t, t2, j);
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
                    if (m(t2, i2, i)) {
                        s4.g(t, j, s4.G(t2, j));
                        t(t, i2, i);
                    }
                    break;
                case 60:
                    v(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m(t2, i2, i)) {
                        s4.g(t, j, s4.G(t2, j));
                        t(t, i2, i);
                    }
                    break;
                case 68:
                    v(t, t2, i);
                    break;
            }
        }
        z3.f(this.o, t, t2);
        if (this.f) {
            z3.d(this.p, t, t2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0105 A[LOOP:2: B:57:0x00f3->B:62:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.fitness.x3] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.fitness.x3] */
    @Override // com.google.android.gms.internal.fitness.x3
    public final boolean d(T t) {
        int i;
        int i2;
        List list;
        ?? P;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.k) {
                return !this.f || this.p.c(t).c();
            }
            int i7 = this.j[i6];
            int i8 = this.a[i7];
            int iR = r(i7);
            int i9 = this.a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = s.getInt(t, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i4;
                i2 = i5;
            }
            if (((268435456 & iR) != 0) && !n(t, i7, i, i2, i11)) {
                return false;
            }
            int i12 = (267386880 & iR) >>> 20;
            if (i12 == 9 || i12 == 17) {
                if (n(t, i7, i, i2, i11) && !o(t, iR, p(i7))) {
                    return false;
                }
            } else if (i12 == 27) {
                list = (List) s4.G(t, iR & 1048575);
                if (!list.isEmpty()) {
                    P = p(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!P.d(list.get(i3))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i12 == 60 || i12 == 68) {
                if (m(t, i8, i7) && !o(t, iR, p(i7))) {
                    return false;
                }
            } else if (i12 == 49) {
                list = (List) s4.G(t, iR & 1048575);
                if (!list.isEmpty()) {
                    P = p(i7);
                    while (i3 < list.size()) {
                        if (!P.d(list.get(i3))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i12 != 50) {
                continue;
            } else {
                Map<?, ?> mapE = this.q.e(s4.G(t, iR & 1048575));
                if (!mapE.isEmpty()) {
                    if (this.q.a(q(i7)).b.zzdx() == zzkj.MESSAGE) {
                        ?? B = 0;
                        for (Object obj : mapE.values()) {
                            if (B == 0) {
                                B = B;
                                B = t3.a().b(obj.getClass());
                            }
                            B = B;
                            if (!B.d(obj)) {
                                z = false;
                                break;
                            }
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x054a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.fitness.x3
    public final void e(T t, d5 d5Var) throws IOException {
        Iterator itD;
        Map.Entry<?, ?> entry;
        Iterator itA;
        Map.Entry<?, ?> entry2;
        if (d5Var.D() == zzkl.zzaeb) {
            j(this.o, t, d5Var);
            if (this.f) {
                q2<T> q2VarC = this.p.c(t);
                if (q2VarC.a.isEmpty()) {
                    itA = null;
                    entry2 = null;
                } else {
                    itA = q2VarC.a();
                    entry2 = (Map.Entry) itA.next();
                }
            } else {
                itA = null;
                entry2 = null;
            }
            for (int length = this.a.length - 3; length >= 0; length -= 3) {
                int iR = r(length);
                int i = this.a[length];
                while (entry2 != null && this.p.a(entry2) > i) {
                    this.p.b(d5Var, entry2);
                    entry2 = itA.hasNext() ? (Map.Entry) itA.next() : null;
                }
                switch ((iR & 267386880) >>> 20) {
                    case 0:
                        if (w(t, length)) {
                            d5Var.i(i, s4.F(t, iR & 1048575));
                        }
                        break;
                    case 1:
                        if (w(t, length)) {
                            d5Var.j(i, s4.E(t, iR & 1048575));
                        }
                        break;
                    case 2:
                        if (w(t, length)) {
                            d5Var.s(i, s4.C(t, iR & 1048575));
                        }
                        break;
                    case 3:
                        if (w(t, length)) {
                            d5Var.h(i, s4.C(t, iR & 1048575));
                        }
                        break;
                    case 4:
                        if (w(t, length)) {
                            d5Var.m(i, s4.A(t, iR & 1048575));
                        }
                        break;
                    case 5:
                        if (w(t, length)) {
                            d5Var.d(i, s4.C(t, iR & 1048575));
                        }
                        break;
                    case 6:
                        if (w(t, length)) {
                            d5Var.q(i, s4.A(t, iR & 1048575));
                        }
                        break;
                    case 7:
                        if (w(t, length)) {
                            d5Var.a(i, s4.D(t, iR & 1048575));
                        }
                        break;
                    case 8:
                        if (w(t, length)) {
                            i(i, s4.G(t, iR & 1048575), d5Var);
                        }
                        break;
                    case 9:
                        if (w(t, length)) {
                            d5Var.H(i, s4.G(t, iR & 1048575), p(length));
                        }
                        break;
                    case 10:
                        if (w(t, length)) {
                            d5Var.K(i, (zzfx) s4.G(t, iR & 1048575));
                        }
                        break;
                    case 11:
                        if (w(t, length)) {
                            d5Var.k(i, s4.A(t, iR & 1048575));
                        }
                        break;
                    case 12:
                        if (w(t, length)) {
                            d5Var.A(i, s4.A(t, iR & 1048575));
                        }
                        break;
                    case 13:
                        if (w(t, length)) {
                            d5Var.x(i, s4.A(t, iR & 1048575));
                        }
                        break;
                    case 14:
                        if (w(t, length)) {
                            d5Var.n(i, s4.C(t, iR & 1048575));
                        }
                        break;
                    case 15:
                        if (w(t, length)) {
                            d5Var.l(i, s4.A(t, iR & 1048575));
                        }
                        break;
                    case 16:
                        if (w(t, length)) {
                            d5Var.b(i, s4.C(t, iR & 1048575));
                        }
                        break;
                    case 17:
                        if (w(t, length)) {
                            d5Var.F(i, s4.G(t, iR & 1048575), p(length));
                        }
                        break;
                    case 18:
                        z3.c(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 19:
                        z3.j(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 20:
                        z3.o(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 21:
                        z3.t(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 22:
                        z3.I(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 23:
                        z3.D(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 24:
                        z3.O(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 25:
                        z3.R(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 26:
                        z3.a(this.a[length], (List) s4.G(t, iR & 1048575), d5Var);
                        break;
                    case 27:
                        z3.b(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, p(length));
                        break;
                    case 28:
                        z3.h(this.a[length], (List) s4.G(t, iR & 1048575), d5Var);
                        break;
                    case 29:
                        z3.K(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 30:
                        z3.Q(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 31:
                        z3.P(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 32:
                        z3.G(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 33:
                        z3.M(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 34:
                        z3.A(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, false);
                        break;
                    case 35:
                        z3.c(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 36:
                        z3.j(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 37:
                        z3.o(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 38:
                        z3.t(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 39:
                        z3.I(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 40:
                        z3.D(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 41:
                        z3.O(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 42:
                        z3.R(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 43:
                        z3.K(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 44:
                        z3.Q(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 45:
                        z3.P(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 46:
                        z3.G(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 47:
                        z3.M(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 48:
                        z3.A(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, true);
                        break;
                    case 49:
                        z3.i(this.a[length], (List) s4.G(t, iR & 1048575), d5Var, p(length));
                        break;
                    case 50:
                        k(d5Var, i, s4.G(t, iR & 1048575), length);
                        break;
                    case 51:
                        if (m(t, i, length)) {
                            d5Var.i(i, A(t, iR & 1048575));
                        }
                        break;
                    case 52:
                        if (m(t, i, length)) {
                            d5Var.j(i, B(t, iR & 1048575));
                        }
                        break;
                    case 53:
                        if (m(t, i, length)) {
                            d5Var.s(i, D(t, iR & 1048575));
                        }
                        break;
                    case 54:
                        if (m(t, i, length)) {
                            d5Var.h(i, D(t, iR & 1048575));
                        }
                        break;
                    case 55:
                        if (m(t, i, length)) {
                            d5Var.m(i, C(t, iR & 1048575));
                        }
                        break;
                    case 56:
                        if (m(t, i, length)) {
                            d5Var.d(i, D(t, iR & 1048575));
                        }
                        break;
                    case 57:
                        if (m(t, i, length)) {
                            d5Var.q(i, C(t, iR & 1048575));
                        }
                        break;
                    case 58:
                        if (m(t, i, length)) {
                            d5Var.a(i, E(t, iR & 1048575));
                        }
                        break;
                    case 59:
                        if (m(t, i, length)) {
                            i(i, s4.G(t, iR & 1048575), d5Var);
                        }
                        break;
                    case 60:
                        if (m(t, i, length)) {
                            d5Var.H(i, s4.G(t, iR & 1048575), p(length));
                        }
                        break;
                    case 61:
                        if (m(t, i, length)) {
                            d5Var.K(i, (zzfx) s4.G(t, iR & 1048575));
                        }
                        break;
                    case 62:
                        if (m(t, i, length)) {
                            d5Var.k(i, C(t, iR & 1048575));
                        }
                        break;
                    case 63:
                        if (m(t, i, length)) {
                            d5Var.A(i, C(t, iR & 1048575));
                        }
                        break;
                    case 64:
                        if (m(t, i, length)) {
                            d5Var.x(i, C(t, iR & 1048575));
                        }
                        break;
                    case 65:
                        if (m(t, i, length)) {
                            d5Var.n(i, D(t, iR & 1048575));
                        }
                        break;
                    case 66:
                        if (m(t, i, length)) {
                            d5Var.l(i, C(t, iR & 1048575));
                        }
                        break;
                    case 67:
                        if (m(t, i, length)) {
                            d5Var.b(i, D(t, iR & 1048575));
                        }
                        break;
                    case 68:
                        if (m(t, i, length)) {
                            d5Var.F(i, s4.G(t, iR & 1048575), p(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.p.b(d5Var, entry2);
                entry2 = itA.hasNext() ? (Map.Entry) itA.next() : null;
            }
            return;
        }
        if (!this.h) {
            u(t, d5Var);
            return;
        }
        if (this.f) {
            q2<T> q2VarC2 = this.p.c(t);
            if (q2VarC2.a.isEmpty()) {
                itD = null;
                entry = null;
            } else {
                itD = q2VarC2.d();
                entry = (Map.Entry) itD.next();
            }
        } else {
            itD = null;
            entry = null;
        }
        int length2 = this.a.length;
        for (int i2 = 0; i2 < length2; i2 += 3) {
            int iR2 = r(i2);
            int i3 = this.a[i2];
            while (entry != null && this.p.a(entry) <= i3) {
                this.p.b(d5Var, entry);
                entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
            }
            switch ((iR2 & 267386880) >>> 20) {
                case 0:
                    if (w(t, i2)) {
                        d5Var.i(i3, s4.F(t, iR2 & 1048575));
                    }
                    break;
                case 1:
                    if (w(t, i2)) {
                        d5Var.j(i3, s4.E(t, iR2 & 1048575));
                    }
                    break;
                case 2:
                    if (w(t, i2)) {
                        d5Var.s(i3, s4.C(t, iR2 & 1048575));
                    }
                    break;
                case 3:
                    if (w(t, i2)) {
                        d5Var.h(i3, s4.C(t, iR2 & 1048575));
                    }
                    break;
                case 4:
                    if (w(t, i2)) {
                        d5Var.m(i3, s4.A(t, iR2 & 1048575));
                    }
                    break;
                case 5:
                    if (w(t, i2)) {
                        d5Var.d(i3, s4.C(t, iR2 & 1048575));
                    }
                    break;
                case 6:
                    if (w(t, i2)) {
                        d5Var.q(i3, s4.A(t, iR2 & 1048575));
                    }
                    break;
                case 7:
                    if (w(t, i2)) {
                        d5Var.a(i3, s4.D(t, iR2 & 1048575));
                    }
                    break;
                case 8:
                    if (w(t, i2)) {
                        i(i3, s4.G(t, iR2 & 1048575), d5Var);
                    }
                    break;
                case 9:
                    if (w(t, i2)) {
                        d5Var.H(i3, s4.G(t, iR2 & 1048575), p(i2));
                    }
                    break;
                case 10:
                    if (w(t, i2)) {
                        d5Var.K(i3, (zzfx) s4.G(t, iR2 & 1048575));
                    }
                    break;
                case 11:
                    if (w(t, i2)) {
                        d5Var.k(i3, s4.A(t, iR2 & 1048575));
                    }
                    break;
                case 12:
                    if (w(t, i2)) {
                        d5Var.A(i3, s4.A(t, iR2 & 1048575));
                    }
                    break;
                case 13:
                    if (w(t, i2)) {
                        d5Var.x(i3, s4.A(t, iR2 & 1048575));
                    }
                    break;
                case 14:
                    if (w(t, i2)) {
                        d5Var.n(i3, s4.C(t, iR2 & 1048575));
                    }
                    break;
                case 15:
                    if (w(t, i2)) {
                        d5Var.l(i3, s4.A(t, iR2 & 1048575));
                    }
                    break;
                case 16:
                    if (w(t, i2)) {
                        d5Var.b(i3, s4.C(t, iR2 & 1048575));
                    }
                    break;
                case 17:
                    if (w(t, i2)) {
                        d5Var.F(i3, s4.G(t, iR2 & 1048575), p(i2));
                    }
                    break;
                case 18:
                    z3.c(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 19:
                    z3.j(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 20:
                    z3.o(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 21:
                    z3.t(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 22:
                    z3.I(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 23:
                    z3.D(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 24:
                    z3.O(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 25:
                    z3.R(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 26:
                    z3.a(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var);
                    break;
                case 27:
                    z3.b(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, p(i2));
                    break;
                case 28:
                    z3.h(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var);
                    break;
                case 29:
                    z3.K(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 30:
                    z3.Q(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 31:
                    z3.P(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 32:
                    z3.G(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 33:
                    z3.M(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 34:
                    z3.A(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, false);
                    break;
                case 35:
                    z3.c(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 36:
                    z3.j(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 37:
                    z3.o(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 38:
                    z3.t(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 39:
                    z3.I(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 40:
                    z3.D(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 41:
                    z3.O(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 42:
                    z3.R(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 43:
                    z3.K(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 44:
                    z3.Q(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 45:
                    z3.P(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 46:
                    z3.G(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 47:
                    z3.M(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 48:
                    z3.A(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, true);
                    break;
                case 49:
                    z3.i(this.a[i2], (List) s4.G(t, iR2 & 1048575), d5Var, p(i2));
                    break;
                case 50:
                    k(d5Var, i3, s4.G(t, iR2 & 1048575), i2);
                    break;
                case 51:
                    if (m(t, i3, i2)) {
                        d5Var.i(i3, A(t, iR2 & 1048575));
                    }
                    break;
                case 52:
                    if (m(t, i3, i2)) {
                        d5Var.j(i3, B(t, iR2 & 1048575));
                    }
                    break;
                case 53:
                    if (m(t, i3, i2)) {
                        d5Var.s(i3, D(t, iR2 & 1048575));
                    }
                    break;
                case 54:
                    if (m(t, i3, i2)) {
                        d5Var.h(i3, D(t, iR2 & 1048575));
                    }
                    break;
                case 55:
                    if (m(t, i3, i2)) {
                        d5Var.m(i3, C(t, iR2 & 1048575));
                    }
                    break;
                case 56:
                    if (m(t, i3, i2)) {
                        d5Var.d(i3, D(t, iR2 & 1048575));
                    }
                    break;
                case 57:
                    if (m(t, i3, i2)) {
                        d5Var.q(i3, C(t, iR2 & 1048575));
                    }
                    break;
                case 58:
                    if (m(t, i3, i2)) {
                        d5Var.a(i3, E(t, iR2 & 1048575));
                    }
                    break;
                case 59:
                    if (m(t, i3, i2)) {
                        i(i3, s4.G(t, iR2 & 1048575), d5Var);
                    }
                    break;
                case 60:
                    if (m(t, i3, i2)) {
                        d5Var.H(i3, s4.G(t, iR2 & 1048575), p(i2));
                    }
                    break;
                case 61:
                    if (m(t, i3, i2)) {
                        d5Var.K(i3, (zzfx) s4.G(t, iR2 & 1048575));
                    }
                    break;
                case 62:
                    if (m(t, i3, i2)) {
                        d5Var.k(i3, C(t, iR2 & 1048575));
                    }
                    break;
                case 63:
                    if (m(t, i3, i2)) {
                        d5Var.A(i3, C(t, iR2 & 1048575));
                    }
                    break;
                case 64:
                    if (m(t, i3, i2)) {
                        d5Var.x(i3, C(t, iR2 & 1048575));
                    }
                    break;
                case 65:
                    if (m(t, i3, i2)) {
                        d5Var.n(i3, D(t, iR2 & 1048575));
                    }
                    break;
                case 66:
                    if (m(t, i3, i2)) {
                        d5Var.l(i3, C(t, iR2 & 1048575));
                    }
                    break;
                case 67:
                    if (m(t, i3, i2)) {
                        d5Var.b(i3, D(t, iR2 & 1048575));
                    }
                    break;
                case 68:
                    if (m(t, i3, i2)) {
                        d5Var.F(i3, s4.G(t, iR2 & 1048575), p(i2));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.p.b(d5Var, entry);
            entry = itD.hasNext() ? (Map.Entry) itD.next() : null;
        }
        j(this.o, t, d5Var);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.fitness.x3
    public final boolean equals(T t, T t2) {
        int length = this.a.length;
        int i = 0;
        while (true) {
            boolean zB = true;
            if (i >= length) {
                if (!this.o.g(t).equals(this.o.g(t2))) {
                    return false;
                }
                if (this.f) {
                    return this.p.c(t).equals(this.p.c(t2));
                }
                return true;
            }
            int iR = r(i);
            long j = iR & 1048575;
            switch ((iR & 267386880) >>> 20) {
                case 0:
                    if (!y(t, t2, i) || Double.doubleToLongBits(s4.F(t, j)) != Double.doubleToLongBits(s4.F(t2, j))) {
                        zB = false;
                    }
                    break;
                case 1:
                    if (!y(t, t2, i) || Float.floatToIntBits(s4.E(t, j)) != Float.floatToIntBits(s4.E(t2, j))) {
                        zB = false;
                    }
                    break;
                case 2:
                    if (!y(t, t2, i) || s4.C(t, j) != s4.C(t2, j)) {
                        zB = false;
                    }
                    break;
                case 3:
                    if (!y(t, t2, i) || s4.C(t, j) != s4.C(t2, j)) {
                        zB = false;
                    }
                    break;
                case 4:
                    if (!y(t, t2, i) || s4.A(t, j) != s4.A(t2, j)) {
                        zB = false;
                    }
                    break;
                case 5:
                    if (!y(t, t2, i) || s4.C(t, j) != s4.C(t2, j)) {
                        zB = false;
                    }
                    break;
                case 6:
                    if (!y(t, t2, i) || s4.A(t, j) != s4.A(t2, j)) {
                        zB = false;
                    }
                    break;
                case 7:
                    if (!y(t, t2, i) || s4.D(t, j) != s4.D(t2, j)) {
                        zB = false;
                    }
                    break;
                case 8:
                    if (!y(t, t2, i) || !z3.B(s4.G(t, j), s4.G(t2, j))) {
                        zB = false;
                    }
                    break;
                case 9:
                    if (!y(t, t2, i) || !z3.B(s4.G(t, j), s4.G(t2, j))) {
                        zB = false;
                    }
                    break;
                case 10:
                    if (!y(t, t2, i) || !z3.B(s4.G(t, j), s4.G(t2, j))) {
                        zB = false;
                    }
                    break;
                case 11:
                    if (!y(t, t2, i) || s4.A(t, j) != s4.A(t2, j)) {
                        zB = false;
                    }
                    break;
                case 12:
                    if (!y(t, t2, i) || s4.A(t, j) != s4.A(t2, j)) {
                        zB = false;
                    }
                    break;
                case 13:
                    if (!y(t, t2, i) || s4.A(t, j) != s4.A(t2, j)) {
                        zB = false;
                    }
                    break;
                case 14:
                    if (!y(t, t2, i) || s4.C(t, j) != s4.C(t2, j)) {
                        zB = false;
                    }
                    break;
                case 15:
                    if (!y(t, t2, i) || s4.A(t, j) != s4.A(t2, j)) {
                        zB = false;
                    }
                    break;
                case 16:
                    if (!y(t, t2, i) || s4.C(t, j) != s4.C(t2, j)) {
                        zB = false;
                    }
                    break;
                case 17:
                    if (!y(t, t2, i) || !z3.B(s4.G(t, j), s4.G(t2, j))) {
                        zB = false;
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
                    zB = z3.B(s4.G(t, j), s4.G(t2, j));
                    break;
                case 50:
                    zB = z3.B(s4.G(t, j), s4.G(t2, j));
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
                    long jS = s(i) & 1048575;
                    if (s4.A(t, jS) != s4.A(t2, jS) || !z3.B(s4.G(t, j), s4.G(t2, j))) {
                        zB = false;
                    }
                    break;
            }
            if (!zB) {
                return false;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.fitness.x3
    public final int hashCode(T t) {
        int i;
        int iZzj;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iR = r(i3);
            int i4 = this.a[i3];
            long j = 1048575 & iR;
            int iHashCode = 37;
            switch ((iR & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iZzj = zzhc.zzj(Double.doubleToLongBits(s4.F(t, j)));
                    i2 = i + iZzj;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzj = Float.floatToIntBits(s4.E(t, j));
                    i2 = i + iZzj;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzj = zzhc.zzj(s4.C(t, j));
                    i2 = i + iZzj;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzj = zzhc.zzj(s4.C(t, j));
                    i2 = i + iZzj;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzj = s4.A(t, j);
                    i2 = i + iZzj;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzj = zzhc.zzj(s4.C(t, j));
                    i2 = i + iZzj;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzj = s4.A(t, j);
                    i2 = i + iZzj;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzj = zzhc.zzc(s4.D(t, j));
                    i2 = i + iZzj;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzj = ((String) s4.G(t, j)).hashCode();
                    i2 = i + iZzj;
                    break;
                case 9:
                    Object objG = s4.G(t, j);
                    if (objG != null) {
                        iHashCode = objG.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzj = s4.G(t, j).hashCode();
                    i2 = i + iZzj;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzj = s4.A(t, j);
                    i2 = i + iZzj;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzj = s4.A(t, j);
                    i2 = i + iZzj;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzj = s4.A(t, j);
                    i2 = i + iZzj;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzj = zzhc.zzj(s4.C(t, j));
                    i2 = i + iZzj;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzj = s4.A(t, j);
                    i2 = i + iZzj;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzj = zzhc.zzj(s4.C(t, j));
                    i2 = i + iZzj;
                    break;
                case 17:
                    Object objG2 = s4.G(t, j);
                    if (objG2 != null) {
                        iHashCode = objG2.hashCode();
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
                    iZzj = s4.G(t, j).hashCode();
                    i2 = i + iZzj;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzj = s4.G(t, j).hashCode();
                    i2 = i + iZzj;
                    break;
                case 51:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzhc.zzj(Double.doubleToLongBits(A(t, j)));
                        i2 = i + iZzj;
                    }
                    break;
                case 52:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = Float.floatToIntBits(B(t, j));
                        i2 = i + iZzj;
                    }
                    break;
                case 53:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzhc.zzj(D(t, j));
                        i2 = i + iZzj;
                    }
                    break;
                case 54:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzhc.zzj(D(t, j));
                        i2 = i + iZzj;
                    }
                    break;
                case 55:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = C(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 56:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzhc.zzj(D(t, j));
                        i2 = i + iZzj;
                    }
                    break;
                case 57:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = C(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 58:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzhc.zzc(E(t, j));
                        i2 = i + iZzj;
                    }
                    break;
                case 59:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = ((String) s4.G(t, j)).hashCode();
                        i2 = i + iZzj;
                    }
                    break;
                case 60:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = s4.G(t, j).hashCode();
                        i2 = i + iZzj;
                    }
                    break;
                case 61:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = s4.G(t, j).hashCode();
                        i2 = i + iZzj;
                    }
                    break;
                case 62:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = C(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 63:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = C(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 64:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = C(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 65:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzhc.zzj(D(t, j));
                        i2 = i + iZzj;
                    }
                    break;
                case 66:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = C(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 67:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzhc.zzj(D(t, j));
                        i2 = i + iZzj;
                    }
                    break;
                case 68:
                    if (m(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = s4.G(t, j).hashCode();
                        i2 = i + iZzj;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.o.g(t).hashCode();
        return this.f ? (iHashCode2 * 53) + this.p.c(t).hashCode() : iHashCode2;
    }
}
