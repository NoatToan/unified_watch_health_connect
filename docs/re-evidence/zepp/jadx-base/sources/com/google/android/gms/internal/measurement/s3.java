package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class s3<T> implements a4<T> {
    private static final int[] p = new int[0];
    private static final Unsafe q = w4.l();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final zzlc e;
    private final boolean f;
    private final boolean g;
    private final int[] h;
    private final int i;
    private final int j;
    private final i3 k;
    private final o4<?, ?> l;
    private final x2<?> m;
    private final u3 n;
    private final n3 o;

    /* JADX WARN: Multi-variable type inference failed */
    private s3(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, zzlc zzlcVar, boolean z, boolean z2, int[] iArr3, int i3, int i4, u3 u3Var, i3 i3Var, o4<?, ?> o4Var, x2<?> x2Var, n3 n3Var) {
        this.a = iArr;
        this.b = iArr2;
        this.c = objArr;
        this.d = i;
        this.g = zzlcVar;
        boolean z3 = false;
        if (o4Var != 0 && o4Var.c((zzlc) i2)) {
            z3 = true;
        }
        this.f = z3;
        this.h = z2;
        this.i = iArr3;
        this.j = i3;
        this.n = i4;
        this.k = u3Var;
        this.l = i3Var;
        this.m = o4Var;
        this.e = i2;
        this.o = x2Var;
    }

    private final <K, V> void A(u2 u2Var, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void B(int i, Object obj, u2 u2Var) throws IOException {
        if (obj instanceof String) {
            u2Var.f(i, (String) obj);
        } else {
            u2Var.o(i, (zzix) obj);
        }
    }

    public static zzmc D(Object obj) {
        zzjx zzjxVar = (zzjx) obj;
        zzmc zzmcVar = zzjxVar.zzc;
        if (zzmcVar != zzmc.zzc()) {
            return zzmcVar;
        }
        zzmc zzmcVarB = zzmc.b();
        zzjxVar.zzc = zzmcVarB;
        return zzmcVarB;
    }

    public static <T> s3<T> E(Class<T> cls, p3 p3Var, u3 u3Var, i3 i3Var, o4<?, ?> o4Var, x2<?> x2Var, n3 n3Var) {
        if (p3Var instanceof z3) {
            return F((z3) p3Var, u3Var, i3Var, o4Var, x2Var, n3Var);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0260  */
    /* JADX WARN: Code duplicated, block: B:127:0x0278  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:162:0x032b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0378  */
    /* JADX WARN: Code duplicated, block: B:180:0x0385  */
    public static <T> s3<T> F(z3 z3Var, u3 u3Var, i3 i3Var, o4<?, ?> o4Var, x2<?> x2Var, n3 n3Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int iObjectFieldOffset2;
        int i20;
        Field fieldO;
        char cCharAt9;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldO2;
        int i25;
        Object obj2;
        Field fieldO3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        boolean z = z3Var.zzc() == 2;
        String strA = z3Var.a();
        int length = strA.length();
        char c = 55296;
        if (strA.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (strA.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int iCharAt4 = strA.charAt(i);
        if (iCharAt4 >= 55296) {
            int i32 = iCharAt4 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                cCharAt13 = strA.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            iCharAt4 = i32 | (cCharAt13 << i33);
            i31 = i29;
        }
        if (iCharAt4 == 0) {
            iArr = p;
            i3 = 0;
            iCharAt = 0;
            i5 = 0;
            iCharAt2 = 0;
            i4 = 0;
            iCharAt3 = 0;
            i2 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt5 = strA.charAt(i31);
            if (iCharAt5 >= 55296) {
                int i35 = iCharAt5 & 8191;
                int i36 = 13;
                while (true) {
                    i13 = i34 + 1;
                    cCharAt8 = strA.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i13;
                }
                iCharAt5 = i35 | (cCharAt8 << i36);
                i34 = i13;
            }
            int i37 = i34 + 1;
            int iCharAt6 = strA.charAt(i34);
            if (iCharAt6 >= 55296) {
                int i38 = iCharAt6 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    cCharAt7 = strA.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i12;
                }
                iCharAt6 = i38 | (cCharAt7 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            iCharAt = strA.charAt(i37);
            if (iCharAt >= 55296) {
                int i41 = iCharAt & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    cCharAt6 = strA.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i11;
                }
                iCharAt = i41 | (cCharAt6 << i42);
                i40 = i11;
            }
            int i43 = i40 + 1;
            int iCharAt7 = strA.charAt(i40);
            if (iCharAt7 >= 55296) {
                int i44 = iCharAt7 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    cCharAt5 = strA.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i10;
                }
                iCharAt7 = i44 | (cCharAt5 << i45);
                i43 = i10;
            }
            int i46 = i43 + 1;
            iCharAt2 = strA.charAt(i43);
            if (iCharAt2 >= 55296) {
                int i47 = iCharAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    cCharAt4 = strA.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i9;
                }
                iCharAt2 = i47 | (cCharAt4 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            int iCharAt8 = strA.charAt(i46);
            if (iCharAt8 >= 55296) {
                int i50 = iCharAt8 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    cCharAt3 = strA.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i8;
                }
                iCharAt8 = i50 | (cCharAt3 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int iCharAt9 = strA.charAt(i49);
            if (iCharAt9 >= 55296) {
                int i53 = iCharAt9 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    cCharAt2 = strA.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i7;
                }
                iCharAt9 = i53 | (cCharAt2 << i54);
                i52 = i7;
            }
            int i55 = i52 + 1;
            iCharAt3 = strA.charAt(i52);
            if (iCharAt3 >= 55296) {
                int i56 = iCharAt3 & 8191;
                int i57 = 13;
                while (true) {
                    i6 = i55 + 1;
                    cCharAt = strA.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i55 = i6;
                }
                iCharAt3 = i56 | (cCharAt << i57);
                i55 = i6;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i2 = iCharAt5 + iCharAt5 + iCharAt6;
            i3 = iCharAt5;
            i31 = i55;
            int i58 = iCharAt8;
            i4 = iCharAt7;
            i5 = i58;
        }
        Unsafe unsafe = q;
        Object[] objArrB = z3Var.b();
        Class<?> cls = z3Var.zza().getClass();
        int[] iArr2 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 + iCharAt2];
        int i59 = iCharAt3 + i5;
        int i60 = iCharAt3;
        int i61 = i59;
        int i62 = 0;
        int i63 = 0;
        while (i31 < length) {
            int i64 = i31 + 1;
            int iCharAt10 = strA.charAt(i31);
            if (iCharAt10 >= c) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    cCharAt12 = strA.charAt(i66);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i65 |= (cCharAt12 & 8191) << i67;
                    i67 += 13;
                    i66 = i28;
                }
                iCharAt10 = i65 | (cCharAt12 << i67);
                i14 = i28;
            } else {
                i14 = i64;
            }
            int i68 = i14 + 1;
            int iCharAt11 = strA.charAt(i14);
            if (iCharAt11 >= c) {
                int i69 = iCharAt11 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt11 = strA.charAt(i70);
                    i15 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                    length = i15;
                }
                iCharAt11 = i69 | (cCharAt11 << i71);
                i16 = i27;
            } else {
                i15 = length;
                i16 = i68;
            }
            int i72 = iCharAt11 & 255;
            int i73 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            if (i72 >= 51) {
                int i74 = i16 + 1;
                int iCharAt12 = strA.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i26 = i76 + 1;
                        cCharAt10 = strA.charAt(i76);
                        i17 = i4;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i75 |= (cCharAt10 & 8191) << i77;
                        i77 += 13;
                        i76 = i26;
                        i4 = i17;
                    }
                    iCharAt12 = i75 | (cCharAt10 << i77);
                    i22 = i26;
                } else {
                    i17 = i4;
                    i22 = i74;
                }
                int i78 = i72 - 51;
                i19 = i22;
                if (i78 == 9 || i78 == 17) {
                    int i79 = i62 / 3;
                    i23 = i2 + 1;
                    objArr[i79 + i79 + 1] = objArrB[i2];
                } else {
                    if (i78 == 12 && !z) {
                        int i80 = i62 / 3;
                        i23 = i2 + 1;
                        objArr[i80 + i80 + 1] = objArrB[i2];
                    }
                    i24 = iCharAt12 + iCharAt12;
                    obj = objArrB[i24];
                    if (obj instanceof Field) {
                        fieldO2 = (Field) obj;
                    } else {
                        fieldO2 = o(cls, (String) obj);
                        objArrB[i24] = fieldO2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO2);
                    i25 = i24 + 1;
                    obj2 = objArrB[i25];
                    if (obj2 instanceof Field) {
                        fieldO3 = (Field) obj2;
                    } else {
                        fieldO3 = o(cls, (String) obj2);
                        objArrB[i25] = fieldO3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldO3);
                    strA = strA;
                    cls = cls;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i20 = 0;
                }
                i2 = i23;
                i24 = iCharAt12 + iCharAt12;
                obj = objArrB[i24];
                if (obj instanceof Field) {
                    fieldO2 = (Field) obj;
                } else {
                    fieldO2 = o(cls, (String) obj);
                    objArrB[i24] = fieldO2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldO2);
                i25 = i24 + 1;
                obj2 = objArrB[i25];
                if (obj2 instanceof Field) {
                    fieldO3 = (Field) obj2;
                } else {
                    fieldO3 = o(cls, (String) obj2);
                    objArrB[i25] = fieldO3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldO3);
                strA = strA;
                cls = cls;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                iObjectFieldOffset = iObjectFieldOffset5;
                i20 = 0;
            } else {
                i17 = i4;
                int i81 = i2 + 1;
                Field fieldO4 = o(cls, (String) objArrB[i2]);
                if (i72 == 9 || i72 == 17) {
                    int i82 = i62 / 3;
                    objArr[i82 + i82 + 1] = fieldO4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        int i83 = i62 / 3;
                        i21 = i81 + 1;
                        objArr[i83 + i83 + 1] = objArrB[i81];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        if (!z) {
                            int i84 = i62 / 3;
                            i21 = i81 + 1;
                            objArr[i84 + i84 + 1] = objArrB[i81];
                        }
                    } else if (i72 == 50) {
                        int i85 = i60 + 1;
                        iArr[i60] = i62;
                        int i86 = i62 / 3;
                        int i87 = i86 + i86;
                        int i88 = i81 + 1;
                        objArr[i87] = objArrB[i81];
                        if ((iCharAt11 & 2048) != 0) {
                            i81 = i88 + 1;
                            objArr[i87 + 1] = objArrB[i88];
                            i60 = i85;
                        } else {
                            i60 = i85;
                            i18 = i88;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                        if ((iCharAt11 & 4096) == 4096 || i72 > 17) {
                            i19 = i16;
                            iObjectFieldOffset2 = 1048575;
                            i20 = 0;
                        } else {
                            int i89 = i16 + 1;
                            int iCharAt13 = strA.charAt(i16);
                            if (iCharAt13 >= 55296) {
                                int i90 = iCharAt13 & 8191;
                                int i91 = 13;
                                while (true) {
                                    i19 = i89 + 1;
                                    cCharAt9 = strA.charAt(i89);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i90 |= (cCharAt9 & 8191) << i91;
                                    i91 += 13;
                                    i89 = i19;
                                }
                                iCharAt13 = i90 | (cCharAt9 << i91);
                            } else {
                                i19 = i89;
                            }
                            int i92 = i3 + i3 + (iCharAt13 / 32);
                            Object obj3 = objArrB[i92];
                            if (obj3 instanceof Field) {
                                fieldO = (Field) obj3;
                            } else {
                                fieldO = o(cls, (String) obj3);
                                objArrB[i92] = fieldO;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO);
                            i20 = iCharAt13 % 32;
                        }
                        if (i72 >= 18 && i72 <= 49) {
                            iArr[i61] = iObjectFieldOffset;
                            i61++;
                        }
                        i2 = i18;
                    }
                    i18 = i21;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                    if ((iCharAt11 & 4096) == 4096) {
                        i19 = i16;
                        iObjectFieldOffset2 = 1048575;
                        i20 = 0;
                    } else {
                        i19 = i16;
                        iObjectFieldOffset2 = 1048575;
                        i20 = 0;
                    }
                    if (i72 >= 18) {
                        iArr[i61] = iObjectFieldOffset;
                        i61++;
                    }
                    i2 = i18;
                }
                i18 = i81;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                if ((iCharAt11 & 4096) == 4096) {
                    i19 = i16;
                    iObjectFieldOffset2 = 1048575;
                    i20 = 0;
                } else {
                    i19 = i16;
                    iObjectFieldOffset2 = 1048575;
                    i20 = 0;
                }
                if (i72 >= 18) {
                    iArr[i61] = iObjectFieldOffset;
                    i61++;
                }
                i2 = i18;
            }
            int i93 = i62 + 1;
            iArr2[i62] = iCharAt10;
            int i94 = i93 + 1;
            iArr2[i93] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i72 << 20) | iObjectFieldOffset;
            i62 = i94 + 1;
            iArr2[i94] = (i20 << 20) | iObjectFieldOffset2;
            cls = cls;
            iCharAt = iCharAt;
            iCharAt3 = i73;
            i31 = i19;
            length = i15;
            objArr = objArr;
            strA = strA;
            iArr2 = iArr2;
            i4 = i17;
            c = 55296;
        }
        return new s3<>(iArr2, objArr, iCharAt, i4, z3Var.zza(), z, false, iArr, iCharAt3, i59, u3Var, i3Var, o4Var, x2Var, n3Var, null);
    }

    private static <T> double G(T t, long j) {
        return ((Double) w4.k(t, j)).doubleValue();
    }

    private static <T> float H(T t, long j) {
        return ((Float) w4.k(t, j)).floatValue();
    }

    private final int I(T t) {
        int i;
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iQ;
        int iZzz;
        int iZzA8;
        int i2;
        Unsafe unsafe = q;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        for (int i6 = 0; i6 < this.a.length; i6 += 3) {
            int iJ = j(i6);
            int i7 = this.a[i6];
            int i8 = i(iJ);
            if (i8 <= 17) {
                int i9 = this.a[i6 + 2];
                int i10 = i9 & 1048575;
                i = 1 << (i9 >>> 20);
                if (i10 != i5) {
                    i4 = unsafe.getInt(t, i10);
                    i5 = i10;
                }
            } else {
                i = 0;
            }
            long j = iJ & 1048575;
            switch (i8) {
                case 0:
                    if ((i4 & i) != 0) {
                        iZzA = zzje.zzA(i7 << 3);
                        iQ = iZzA + 8;
                        i3 += iQ;
                    }
                    break;
                case 1:
                    if ((i4 & i) != 0) {
                        iZzA2 = zzje.zzA(i7 << 3);
                        iQ = iZzA2 + 4;
                        i3 += iQ;
                    }
                    break;
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        iZzA3 = zzje.zzA(i7 << 3);
                        iZzB = zzje.zzB(j2);
                        iQ = iZzA3 + iZzB;
                        i3 += iQ;
                    }
                    break;
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        iZzA3 = zzje.zzA(i7 << 3);
                        iZzB = zzje.zzB(j3);
                        iQ = iZzA3 + iZzB;
                        i3 += iQ;
                    }
                    break;
                case 4:
                    if ((i4 & i) != 0) {
                        int i11 = unsafe.getInt(t, j);
                        iZzA4 = zzje.zzA(i7 << 3);
                        iZzv = zzje.zzv(i11);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 5:
                    if ((i4 & i) != 0) {
                        iZzA = zzje.zzA(i7 << 3);
                        iQ = iZzA + 8;
                        i3 += iQ;
                    }
                    break;
                case 6:
                    if ((i4 & i) != 0) {
                        iZzA2 = zzje.zzA(i7 << 3);
                        iQ = iZzA2 + 4;
                        i3 += iQ;
                    }
                    break;
                case 7:
                    if ((i4 & i) != 0) {
                        iZzA5 = zzje.zzA(i7 << 3);
                        iQ = iZzA5 + 1;
                        i3 += iQ;
                    }
                    break;
                case 8:
                    if ((i4 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof zzix) {
                            iZzA6 = zzje.zzA(i7 << 3);
                            iZzd = ((zzix) object).zzd();
                            iZzA7 = zzje.zzA(iZzd);
                            i2 = iZzA6 + iZzA7 + iZzd;
                            i3 += i2;
                        } else {
                            iZzA4 = zzje.zzA(i7 << 3);
                            iZzv = zzje.zzy((String) object);
                            i2 = iZzA4 + iZzv;
                            i3 += i2;
                        }
                    }
                    break;
                case 9:
                    if ((i4 & i) != 0) {
                        iQ = c4.Q(i7, unsafe.getObject(t, j), m(i6));
                        i3 += iQ;
                    }
                    break;
                case 10:
                    if ((i4 & i) != 0) {
                        zzix zzixVar = (zzix) unsafe.getObject(t, j);
                        iZzA6 = zzje.zzA(i7 << 3);
                        iZzd = zzixVar.zzd();
                        iZzA7 = zzje.zzA(iZzd);
                        i2 = iZzA6 + iZzA7 + iZzd;
                        i3 += i2;
                    }
                    break;
                case 11:
                    if ((i4 & i) != 0) {
                        int i12 = unsafe.getInt(t, j);
                        iZzA4 = zzje.zzA(i7 << 3);
                        iZzv = zzje.zzA(i12);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 12:
                    if ((i4 & i) != 0) {
                        int i13 = unsafe.getInt(t, j);
                        iZzA4 = zzje.zzA(i7 << 3);
                        iZzv = zzje.zzv(i13);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 13:
                    if ((i4 & i) != 0) {
                        iZzA2 = zzje.zzA(i7 << 3);
                        iQ = iZzA2 + 4;
                        i3 += iQ;
                    }
                    break;
                case 14:
                    if ((i4 & i) != 0) {
                        iZzA = zzje.zzA(i7 << 3);
                        iQ = iZzA + 8;
                        i3 += iQ;
                    }
                    break;
                case 15:
                    if ((i4 & i) != 0) {
                        int i14 = unsafe.getInt(t, j);
                        iZzA4 = zzje.zzA(i7 << 3);
                        iZzv = zzje.zzA((i14 >> 31) ^ (i14 + i14));
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 16:
                    if ((i4 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        iZzA4 = zzje.zzA(i7 << 3);
                        iZzv = zzje.zzB((j4 >> 63) ^ (j4 + j4));
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 17:
                    if ((i4 & i) != 0) {
                        iQ = zzje.c(i7, (zzlc) unsafe.getObject(t, j), m(i6));
                        i3 += iQ;
                    }
                    break;
                case 18:
                    iQ = c4.J(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 19:
                    iQ = c4.H(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 20:
                    iQ = c4.O(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 21:
                    iQ = c4.Z(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 22:
                    iQ = c4.M(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 23:
                    iQ = c4.J(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 24:
                    iQ = c4.H(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 25:
                    iQ = c4.A(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 26:
                    iQ = c4.W(i7, (List) unsafe.getObject(t, j));
                    i3 += iQ;
                    break;
                case 27:
                    iQ = c4.R(i7, (List) unsafe.getObject(t, j), m(i6));
                    i3 += iQ;
                    break;
                case 28:
                    iQ = c4.E(i7, (List) unsafe.getObject(t, j));
                    i3 += iQ;
                    break;
                case 29:
                    iQ = c4.X(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 30:
                    iQ = c4.F(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 31:
                    iQ = c4.H(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 32:
                    iQ = c4.J(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 33:
                    iQ = c4.S(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 34:
                    iQ = c4.U(i7, (List) unsafe.getObject(t, j), false);
                    i3 += iQ;
                    break;
                case 35:
                    iZzv = c4.K((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 36:
                    iZzv = c4.I((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 37:
                    iZzv = c4.P((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 38:
                    iZzv = c4.a0((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 39:
                    iZzv = c4.N((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 40:
                    iZzv = c4.K((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 41:
                    iZzv = c4.I((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 42:
                    iZzv = c4.D((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 43:
                    iZzv = c4.Y((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 44:
                    iZzv = c4.G((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 45:
                    iZzv = c4.I((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 46:
                    iZzv = c4.K((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 47:
                    iZzv = c4.T((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 48:
                    iZzv = c4.V((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i7);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 49:
                    iQ = c4.L(i7, (List) unsafe.getObject(t, j), m(i6));
                    i3 += iQ;
                    break;
                case 50:
                    n3.a(i7, unsafe.getObject(t, j), n(i6));
                    break;
                case 51:
                    if (x(t, i7, i6)) {
                        iZzA = zzje.zzA(i7 << 3);
                        iQ = iZzA + 8;
                        i3 += iQ;
                    }
                    break;
                case 52:
                    if (x(t, i7, i6)) {
                        iZzA2 = zzje.zzA(i7 << 3);
                        iQ = iZzA2 + 4;
                        i3 += iQ;
                    }
                    break;
                case 53:
                    if (x(t, i7, i6)) {
                        long jK = k(t, j);
                        iZzA3 = zzje.zzA(i7 << 3);
                        iZzB = zzje.zzB(jK);
                        iQ = iZzA3 + iZzB;
                        i3 += iQ;
                    }
                    break;
                case 54:
                    if (x(t, i7, i6)) {
                        long jK2 = k(t, j);
                        iZzA3 = zzje.zzA(i7 << 3);
                        iZzB = zzje.zzB(jK2);
                        iQ = iZzA3 + iZzB;
                        i3 += iQ;
                    }
                    break;
                case 55:
                    if (x(t, i7, i6)) {
                        int iK = K(t, j);
                        iZzA4 = zzje.zzA(i7 << 3);
                        iZzv = zzje.zzv(iK);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 56:
                    if (x(t, i7, i6)) {
                        iZzA = zzje.zzA(i7 << 3);
                        iQ = iZzA + 8;
                        i3 += iQ;
                    }
                    break;
                case 57:
                    if (x(t, i7, i6)) {
                        iZzA2 = zzje.zzA(i7 << 3);
                        iQ = iZzA2 + 4;
                        i3 += iQ;
                    }
                    break;
                case 58:
                    if (x(t, i7, i6)) {
                        iZzA5 = zzje.zzA(i7 << 3);
                        iQ = iZzA5 + 1;
                        i3 += iQ;
                    }
                    break;
                case 59:
                    if (x(t, i7, i6)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof zzix) {
                            iZzA6 = zzje.zzA(i7 << 3);
                            iZzd = ((zzix) object2).zzd();
                            iZzA7 = zzje.zzA(iZzd);
                            i2 = iZzA6 + iZzA7 + iZzd;
                            i3 += i2;
                        } else {
                            iZzA4 = zzje.zzA(i7 << 3);
                            iZzv = zzje.zzy((String) object2);
                            i2 = iZzA4 + iZzv;
                            i3 += i2;
                        }
                    }
                    break;
                case 60:
                    if (x(t, i7, i6)) {
                        iQ = c4.Q(i7, unsafe.getObject(t, j), m(i6));
                        i3 += iQ;
                    }
                    break;
                case 61:
                    if (x(t, i7, i6)) {
                        zzix zzixVar2 = (zzix) unsafe.getObject(t, j);
                        iZzA6 = zzje.zzA(i7 << 3);
                        iZzd = zzixVar2.zzd();
                        iZzA7 = zzje.zzA(iZzd);
                        i2 = iZzA6 + iZzA7 + iZzd;
                        i3 += i2;
                    }
                    break;
                case 62:
                    if (x(t, i7, i6)) {
                        int iK2 = K(t, j);
                        iZzA4 = zzje.zzA(i7 << 3);
                        iZzv = zzje.zzA(iK2);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 63:
                    if (x(t, i7, i6)) {
                        int iK3 = K(t, j);
                        iZzA4 = zzje.zzA(i7 << 3);
                        iZzv = zzje.zzv(iK3);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 64:
                    if (x(t, i7, i6)) {
                        iZzA2 = zzje.zzA(i7 << 3);
                        iQ = iZzA2 + 4;
                        i3 += iQ;
                    }
                    break;
                case 65:
                    if (x(t, i7, i6)) {
                        iZzA = zzje.zzA(i7 << 3);
                        iQ = iZzA + 8;
                        i3 += iQ;
                    }
                    break;
                case 66:
                    if (x(t, i7, i6)) {
                        int iK4 = K(t, j);
                        iZzA4 = zzje.zzA(i7 << 3);
                        iZzv = zzje.zzA((iK4 >> 31) ^ (iK4 + iK4));
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 67:
                    if (x(t, i7, i6)) {
                        long jK3 = k(t, j);
                        iZzA4 = zzje.zzA(i7 << 3);
                        iZzv = zzje.zzB((jK3 >> 63) ^ (jK3 + jK3));
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 68:
                    if (x(t, i7, i6)) {
                        iQ = zzje.c(i7, (zzlc) unsafe.getObject(t, j), m(i6));
                        i3 += iQ;
                    }
                    break;
            }
        }
        o4<?, ?> o4Var = this.l;
        int iA = i3 + o4Var.a(o4Var.c(t));
        if (!this.f) {
            return iA;
        }
        this.m.a(t);
        throw null;
    }

    private final int J(T t) {
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iQ;
        int iZzz;
        int iZzA8;
        int i;
        Unsafe unsafe = q;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.length; i3 += 3) {
            int iJ = j(i3);
            int i4 = i(iJ);
            int i5 = this.a[i3];
            long j = iJ & 1048575;
            if (i4 >= zzjp.zzJ.zza() && i4 <= zzjp.zzW.zza()) {
                int i6 = this.a[i3 + 2];
            }
            switch (i4) {
                case 0:
                    if (u(t, i3)) {
                        iZzA = zzje.zzA(i5 << 3);
                        iQ = iZzA + 8;
                        i2 += iQ;
                    }
                    break;
                case 1:
                    if (u(t, i3)) {
                        iZzA2 = zzje.zzA(i5 << 3);
                        iQ = iZzA2 + 4;
                        i2 += iQ;
                    }
                    break;
                case 2:
                    if (u(t, i3)) {
                        long jI = w4.i(t, j);
                        iZzA3 = zzje.zzA(i5 << 3);
                        iZzB = zzje.zzB(jI);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case 3:
                    if (u(t, i3)) {
                        long jI2 = w4.i(t, j);
                        iZzA3 = zzje.zzA(i5 << 3);
                        iZzB = zzje.zzB(jI2);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case 4:
                    if (u(t, i3)) {
                        int iH = w4.h(t, j);
                        iZzA4 = zzje.zzA(i5 << 3);
                        iZzv = zzje.zzv(iH);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 5:
                    if (u(t, i3)) {
                        iZzA = zzje.zzA(i5 << 3);
                        iQ = iZzA + 8;
                        i2 += iQ;
                    }
                    break;
                case 6:
                    if (u(t, i3)) {
                        iZzA2 = zzje.zzA(i5 << 3);
                        iQ = iZzA2 + 4;
                        i2 += iQ;
                    }
                    break;
                case 7:
                    if (u(t, i3)) {
                        iZzA5 = zzje.zzA(i5 << 3);
                        iQ = iZzA5 + 1;
                        i2 += iQ;
                    }
                    break;
                case 8:
                    if (u(t, i3)) {
                        Object objK = w4.k(t, j);
                        if (objK instanceof zzix) {
                            iZzA6 = zzje.zzA(i5 << 3);
                            iZzd = ((zzix) objK).zzd();
                            iZzA7 = zzje.zzA(iZzd);
                            i = iZzA6 + iZzA7 + iZzd;
                            i2 += i;
                        } else {
                            iZzA4 = zzje.zzA(i5 << 3);
                            iZzv = zzje.zzy((String) objK);
                            i = iZzA4 + iZzv;
                            i2 += i;
                        }
                    }
                    break;
                case 9:
                    if (u(t, i3)) {
                        iQ = c4.Q(i5, w4.k(t, j), m(i3));
                        i2 += iQ;
                    }
                    break;
                case 10:
                    if (u(t, i3)) {
                        zzix zzixVar = (zzix) w4.k(t, j);
                        iZzA6 = zzje.zzA(i5 << 3);
                        iZzd = zzixVar.zzd();
                        iZzA7 = zzje.zzA(iZzd);
                        i = iZzA6 + iZzA7 + iZzd;
                        i2 += i;
                    }
                    break;
                case 11:
                    if (u(t, i3)) {
                        int iH2 = w4.h(t, j);
                        iZzA4 = zzje.zzA(i5 << 3);
                        iZzv = zzje.zzA(iH2);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 12:
                    if (u(t, i3)) {
                        int iH3 = w4.h(t, j);
                        iZzA4 = zzje.zzA(i5 << 3);
                        iZzv = zzje.zzv(iH3);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 13:
                    if (u(t, i3)) {
                        iZzA2 = zzje.zzA(i5 << 3);
                        iQ = iZzA2 + 4;
                        i2 += iQ;
                    }
                    break;
                case 14:
                    if (u(t, i3)) {
                        iZzA = zzje.zzA(i5 << 3);
                        iQ = iZzA + 8;
                        i2 += iQ;
                    }
                    break;
                case 15:
                    if (u(t, i3)) {
                        int iH4 = w4.h(t, j);
                        iZzA4 = zzje.zzA(i5 << 3);
                        iZzv = zzje.zzA((iH4 >> 31) ^ (iH4 + iH4));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 16:
                    if (u(t, i3)) {
                        long jI3 = w4.i(t, j);
                        iZzA4 = zzje.zzA(i5 << 3);
                        iZzv = zzje.zzB((jI3 >> 63) ^ (jI3 + jI3));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 17:
                    if (u(t, i3)) {
                        iQ = zzje.c(i5, (zzlc) w4.k(t, j), m(i3));
                        i2 += iQ;
                    }
                    break;
                case 18:
                    iQ = c4.J(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 19:
                    iQ = c4.H(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 20:
                    iQ = c4.O(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 21:
                    iQ = c4.Z(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 22:
                    iQ = c4.M(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 23:
                    iQ = c4.J(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 24:
                    iQ = c4.H(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 25:
                    iQ = c4.A(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 26:
                    iQ = c4.W(i5, (List) w4.k(t, j));
                    i2 += iQ;
                    break;
                case 27:
                    iQ = c4.R(i5, (List) w4.k(t, j), m(i3));
                    i2 += iQ;
                    break;
                case 28:
                    iQ = c4.E(i5, (List) w4.k(t, j));
                    i2 += iQ;
                    break;
                case 29:
                    iQ = c4.X(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 30:
                    iQ = c4.F(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 31:
                    iQ = c4.H(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 32:
                    iQ = c4.J(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 33:
                    iQ = c4.S(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 34:
                    iQ = c4.U(i5, (List) w4.k(t, j), false);
                    i2 += iQ;
                    break;
                case 35:
                    iZzv = c4.K((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 36:
                    iZzv = c4.I((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 37:
                    iZzv = c4.P((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 38:
                    iZzv = c4.a0((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 39:
                    iZzv = c4.N((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 40:
                    iZzv = c4.K((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 41:
                    iZzv = c4.I((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 42:
                    iZzv = c4.D((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 43:
                    iZzv = c4.Y((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 44:
                    iZzv = c4.G((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 45:
                    iZzv = c4.I((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 46:
                    iZzv = c4.K((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 47:
                    iZzv = c4.T((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 48:
                    iZzv = c4.V((List) unsafe.getObject(t, j));
                    if (iZzv > 0) {
                        iZzz = zzje.zzz(i5);
                        iZzA8 = zzje.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 49:
                    iQ = c4.L(i5, (List) w4.k(t, j), m(i3));
                    i2 += iQ;
                    break;
                case 50:
                    n3.a(i5, w4.k(t, j), n(i3));
                    break;
                case 51:
                    if (x(t, i5, i3)) {
                        iZzA = zzje.zzA(i5 << 3);
                        iQ = iZzA + 8;
                        i2 += iQ;
                    }
                    break;
                case 52:
                    if (x(t, i5, i3)) {
                        iZzA2 = zzje.zzA(i5 << 3);
                        iQ = iZzA2 + 4;
                        i2 += iQ;
                    }
                    break;
                case 53:
                    if (x(t, i5, i3)) {
                        long jK = k(t, j);
                        iZzA3 = zzje.zzA(i5 << 3);
                        iZzB = zzje.zzB(jK);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case 54:
                    if (x(t, i5, i3)) {
                        long jK2 = k(t, j);
                        iZzA3 = zzje.zzA(i5 << 3);
                        iZzB = zzje.zzB(jK2);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case 55:
                    if (x(t, i5, i3)) {
                        int iK = K(t, j);
                        iZzA4 = zzje.zzA(i5 << 3);
                        iZzv = zzje.zzv(iK);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 56:
                    if (x(t, i5, i3)) {
                        iZzA = zzje.zzA(i5 << 3);
                        iQ = iZzA + 8;
                        i2 += iQ;
                    }
                    break;
                case 57:
                    if (x(t, i5, i3)) {
                        iZzA2 = zzje.zzA(i5 << 3);
                        iQ = iZzA2 + 4;
                        i2 += iQ;
                    }
                    break;
                case 58:
                    if (x(t, i5, i3)) {
                        iZzA5 = zzje.zzA(i5 << 3);
                        iQ = iZzA5 + 1;
                        i2 += iQ;
                    }
                    break;
                case 59:
                    if (x(t, i5, i3)) {
                        Object objK2 = w4.k(t, j);
                        if (objK2 instanceof zzix) {
                            iZzA6 = zzje.zzA(i5 << 3);
                            iZzd = ((zzix) objK2).zzd();
                            iZzA7 = zzje.zzA(iZzd);
                            i = iZzA6 + iZzA7 + iZzd;
                            i2 += i;
                        } else {
                            iZzA4 = zzje.zzA(i5 << 3);
                            iZzv = zzje.zzy((String) objK2);
                            i = iZzA4 + iZzv;
                            i2 += i;
                        }
                    }
                    break;
                case 60:
                    if (x(t, i5, i3)) {
                        iQ = c4.Q(i5, w4.k(t, j), m(i3));
                        i2 += iQ;
                    }
                    break;
                case 61:
                    if (x(t, i5, i3)) {
                        zzix zzixVar2 = (zzix) w4.k(t, j);
                        iZzA6 = zzje.zzA(i5 << 3);
                        iZzd = zzixVar2.zzd();
                        iZzA7 = zzje.zzA(iZzd);
                        i = iZzA6 + iZzA7 + iZzd;
                        i2 += i;
                    }
                    break;
                case 62:
                    if (x(t, i5, i3)) {
                        int iK2 = K(t, j);
                        iZzA4 = zzje.zzA(i5 << 3);
                        iZzv = zzje.zzA(iK2);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 63:
                    if (x(t, i5, i3)) {
                        int iK3 = K(t, j);
                        iZzA4 = zzje.zzA(i5 << 3);
                        iZzv = zzje.zzv(iK3);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 64:
                    if (x(t, i5, i3)) {
                        iZzA2 = zzje.zzA(i5 << 3);
                        iQ = iZzA2 + 4;
                        i2 += iQ;
                    }
                    break;
                case 65:
                    if (x(t, i5, i3)) {
                        iZzA = zzje.zzA(i5 << 3);
                        iQ = iZzA + 8;
                        i2 += iQ;
                    }
                    break;
                case 66:
                    if (x(t, i5, i3)) {
                        int iK4 = K(t, j);
                        iZzA4 = zzje.zzA(i5 << 3);
                        iZzv = zzje.zzA((iK4 >> 31) ^ (iK4 + iK4));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 67:
                    if (x(t, i5, i3)) {
                        long jK3 = k(t, j);
                        iZzA4 = zzje.zzA(i5 << 3);
                        iZzv = zzje.zzB((jK3 >> 63) ^ (jK3 + jK3));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 68:
                    if (x(t, i5, i3)) {
                        iQ = zzje.c(i5, (zzlc) w4.k(t, j), m(i3));
                        i2 += iQ;
                    }
                    break;
            }
        }
        o4<?, ?> o4Var = this.l;
        return i2 + o4Var.a(o4Var.c(t));
    }

    private static <T> int K(T t, long j) {
        return ((Integer) w4.k(t, j)).intValue();
    }

    private final <K, V> int L(T t, byte[] bArr, int i, int i2, int i3, long j, g2 g2Var) throws IOException {
        Unsafe unsafe = q;
        Object objN = n(i3);
        Object object = unsafe.getObject(t, j);
        if (!((zzkw) object).zze()) {
            zzkw<K, V> zzkwVarZzb = zzkw.zza().zzb();
            n3.b(zzkwVarZzb, object);
            unsafe.putObject(t, j, zzkwVarZzb);
        }
        throw null;
    }

    private final int M(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, g2 g2Var) throws IOException {
        Unsafe unsafe = q;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(h2.n(bArr, i))));
                unsafe.putInt(t, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(h2.b(bArr, i))));
                unsafe.putInt(t, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iM = h2.m(bArr, i, g2Var);
                unsafe.putObject(t, j, Long.valueOf(g2Var.b));
                unsafe.putInt(t, j2, i4);
                return iM;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iJ = h2.j(bArr, i, g2Var);
                unsafe.putObject(t, j, Integer.valueOf(g2Var.a));
                unsafe.putInt(t, j2, i4);
                return iJ;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(h2.n(bArr, i)));
                unsafe.putInt(t, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(h2.b(bArr, i)));
                unsafe.putInt(t, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM2 = h2.m(bArr, i, g2Var);
                unsafe.putObject(t, j, Boolean.valueOf(g2Var.b != 0));
                unsafe.putInt(t, j2, i4);
                return iM2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iJ2 = h2.j(bArr, i, g2Var);
                int i9 = g2Var.a;
                if (i9 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !b5.f(bArr, iJ2, iJ2 + i9)) {
                        throw zzkh.c();
                    }
                    unsafe.putObject(t, j, new String(bArr, iJ2, i9, zzkf.b));
                    iJ2 += i9;
                }
                unsafe.putInt(t, j2, i4);
                return iJ2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iD = h2.d(m(i8), bArr, i, i2, g2Var);
                Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, g2Var.c);
                } else {
                    unsafe.putObject(t, j, zzkf.d(object, g2Var.c));
                }
                unsafe.putInt(t, j2, i4);
                return iD;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iA = h2.a(bArr, i, g2Var);
                unsafe.putObject(t, j, g2Var.c);
                unsafe.putInt(t, j2, i4);
                return iA;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iJ3 = h2.j(bArr, i, g2Var);
                int i10 = g2Var.a;
                zzkb zzkbVarL = l(i8);
                if (zzkbVarL == null || zzkbVarL.zza(i10)) {
                    unsafe.putObject(t, j, Integer.valueOf(i10));
                    unsafe.putInt(t, j2, i4);
                } else {
                    D(t).d(i3, Long.valueOf(i10));
                }
                return iJ3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iJ4 = h2.j(bArr, i, g2Var);
                unsafe.putObject(t, j, Integer.valueOf(zzja.zzb(g2Var.a)));
                unsafe.putInt(t, j2, i4);
                return iJ4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iM3 = h2.m(bArr, i, g2Var);
                unsafe.putObject(t, j, Long.valueOf(zzja.zzc(g2Var.b)));
                unsafe.putInt(t, j2, i4);
                return iM3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                int iC = h2.c(m(i8), bArr, i, i2, (i3 & (-8)) | 4, g2Var);
                Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object2 == null) {
                    unsafe.putObject(t, j, g2Var.c);
                } else {
                    unsafe.putObject(t, j, zzkf.d(object2, g2Var.c));
                }
                unsafe.putInt(t, j2, i4);
                return iC;
            default:
                return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02aa A[PHI: r0 r19 r24 r25 r28
      0x02aa: PHI (r0v19 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:117:0x0314, B:112:0x02f1, B:104:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r19v6 int) = (r19v4 int), (r19v4 int), (r19v7 int) binds: [B:117:0x0314, B:112:0x02f1, B:104:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r24v3 int) = (r24v1 int), (r24v1 int), (r24v4 int) binds: [B:117:0x0314, B:112:0x02f1, B:104:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r25v2 int) = (r25v0 int), (r25v0 int), (r25v3 int) binds: [B:117:0x0314, B:112:0x02f1, B:104:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r28v6 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:117:0x0314, B:112:0x02f1, B:104:0x02a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x02be A[PHI: r0 r19 r24 r25 r28
      0x02be: PHI (r0v18 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:117:0x0314, B:112:0x02f1, B:104:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r19v5 int) = (r19v4 int), (r19v4 int), (r19v7 int) binds: [B:117:0x0314, B:112:0x02f1, B:104:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r24v2 int) = (r24v1 int), (r24v1 int), (r24v4 int) binds: [B:117:0x0314, B:112:0x02f1, B:104:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r25v1 int) = (r25v0 int), (r25v0 int), (r25v3 int) binds: [B:117:0x0314, B:112:0x02f1, B:104:0x02a8] A[DONT_GENERATE, DONT_INLINE]
      0x02be: PHI (r28v5 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:117:0x0314, B:112:0x02f1, B:104:0x02a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0097. Please report as an issue. */
    private final int N(T t, byte[] bArr, int i, int i2, g2 g2Var) throws IOException {
        int i3;
        int iK;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        Unsafe unsafe2;
        int i8;
        int i9;
        int i10;
        int iM;
        int i11;
        Unsafe unsafe3;
        this = this;
        t = t;
        bArr = bArr;
        i2 = i2;
        g2Var = g2Var;
        Unsafe unsafe4 = q;
        int i12 = -1;
        int i13 = 1048575;
        int i14 = i;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i14 < i2) {
            int i19 = i14 + 1;
            byte b = bArr[i14];
            if (b < 0) {
                iK = h2.k(b, bArr, i19, g2Var);
                i3 = g2Var.a;
            } else {
                i3 = b;
                iK = i19;
            }
            int i20 = i3 >>> 3;
            int i21 = i3 & 7;
            int iQ = i20 > i15 ? this.Q(i20, i16 / 3) : this.P(i20);
            if (iQ == i12) {
                i4 = iK;
                i5 = i20;
                unsafe = unsafe4;
                i6 = 0;
            } else {
                int i22 = this.a[iQ + 1];
                int i23 = i(i22);
                Unsafe unsafe5 = unsafe4;
                long j = i22 & i13;
                if (i23 <= 17) {
                    int i24 = this.a[iQ + 2];
                    int i25 = 1 << (i24 >>> 20);
                    int i26 = i24 & 1048575;
                    if (i26 != i18) {
                        if (i18 != 1048575) {
                            long j2 = i18;
                            unsafe3 = unsafe5;
                            unsafe3.putInt(t, j2, i17);
                        } else {
                            unsafe3 = unsafe5;
                        }
                        if (i26 != 1048575) {
                            i17 = unsafe3.getInt(t, i26);
                        }
                        unsafe2 = unsafe3;
                        i18 = i26;
                    } else {
                        unsafe2 = unsafe5;
                    }
                    switch (i23) {
                        case 0:
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 1) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                w4.t(t, j, Double.longBitsToDouble(h2.n(bArr, iK)));
                                i14 = iK + 8;
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i16 = i7;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 1:
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 5) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                w4.u(t, j, Float.intBitsToFloat(h2.b(bArr, iK)));
                                i14 = iK + 4;
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i16 = i7;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 2:
                        case 3:
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 0) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iM = h2.m(bArr, iK, g2Var);
                                unsafe2.putLong(t, j, g2Var.b);
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i16 = i7;
                                i14 = iM;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 4:
                        case 11:
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 0) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                i14 = h2.j(bArr, iK, g2Var);
                                unsafe2.putInt(t, j, g2Var.a);
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i16 = i7;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 5:
                        case 14:
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 1) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                unsafe2.putLong(t, j, h2.n(bArr, iK));
                                i14 = iK + 8;
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i16 = i7;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 6:
                        case 13:
                            i11 = i2;
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 5) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                unsafe2.putInt(t, j, h2.b(bArr, iK));
                                i14 = iK + 4;
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                int i27 = i7;
                                i2 = i11;
                                i16 = i27;
                            }
                            break;
                        case 7:
                            i11 = i2;
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 0) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                i14 = h2.m(bArr, iK, g2Var);
                                w4.r(t, j, g2Var.b != 0);
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                int i28 = i7;
                                i2 = i11;
                                i16 = i28;
                            }
                            break;
                        case 8:
                            i11 = i2;
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 2) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                i14 = (i22 & 536870912) == 0 ? h2.g(bArr, iK, g2Var) : h2.h(bArr, iK, g2Var);
                                unsafe2.putObject(t, j, g2Var.c);
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                int i29 = i7;
                                i2 = i11;
                                i16 = i29;
                            }
                            break;
                        case 9:
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 2) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                i11 = i2;
                                i14 = h2.d(this.m(i7), bArr, iK, i11, g2Var);
                                Object object = unsafe2.getObject(t, j);
                                if (object == null) {
                                    unsafe2.putObject(t, j, g2Var.c);
                                } else {
                                    unsafe2.putObject(t, j, zzkf.d(object, g2Var.c));
                                }
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                int i210 = i7;
                                i2 = i11;
                                i16 = i210;
                            }
                            break;
                        case 10:
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 2) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                i14 = h2.a(bArr, iK, g2Var);
                                unsafe2.putObject(t, j, g2Var.c);
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i16 = i7;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 12:
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 0) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                i14 = h2.j(bArr, iK, g2Var);
                                unsafe2.putInt(t, j, g2Var.a);
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i16 = i7;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 15:
                            i7 = iQ;
                            i5 = i20;
                            if (i21 != 0) {
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                i14 = h2.j(bArr, iK, g2Var);
                                unsafe2.putInt(t, j, zzja.zzb(g2Var.a));
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i16 = i7;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        case 16:
                            if (i21 != 0) {
                                i7 = iQ;
                                i5 = i20;
                                i4 = iK;
                                unsafe = unsafe2;
                                i6 = i7;
                            } else {
                                iM = h2.m(bArr, iK, g2Var);
                                i7 = iQ;
                                i5 = i20;
                                unsafe2.putLong(t, j, zzja.zzc(g2Var.b));
                                i17 |= i25;
                                unsafe4 = unsafe2;
                                i16 = i7;
                                i14 = iM;
                                i15 = i5;
                                i13 = 1048575;
                                i12 = -1;
                                i2 = i2;
                            }
                            break;
                        default:
                            i7 = iQ;
                            i5 = i20;
                            i4 = iK;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                    }
                } else {
                    i5 = i20;
                    i7 = iQ;
                    unsafe2 = unsafe5;
                    if (i23 != 27) {
                        if (i23 <= 49) {
                            int i30 = iK;
                            i9 = i17;
                            i10 = i18;
                            unsafe = unsafe2;
                            i6 = i7;
                            i14 = O(t, bArr, iK, i2, i3, i5, i21, i7, i22, i23, j, g2Var);
                            if (i14 != i30) {
                                i16 = i6;
                                i15 = i5;
                                i17 = i9;
                                i18 = i10;
                            } else {
                                i4 = i14;
                                i17 = i9;
                                i18 = i10;
                            }
                        } else {
                            i8 = iK;
                            i9 = i17;
                            i10 = i18;
                            unsafe = unsafe2;
                            i6 = i7;
                            if (i23 == 50) {
                                if (i21 == 2) {
                                    i14 = L(t, bArr, i8, i2, i6, j, g2Var);
                                    if (i14 != i8) {
                                        i16 = i6;
                                        i15 = i5;
                                        i17 = i9;
                                        i18 = i10;
                                    } else {
                                        i4 = i14;
                                    }
                                }
                                i17 = i9;
                                i18 = i10;
                            } else {
                                i14 = M(t, bArr, i8, i2, i3, i5, i21, i22, i23, j, i6, g2Var);
                                if (i14 != i8) {
                                    i16 = i6;
                                    i15 = i5;
                                    i17 = i9;
                                    i18 = i10;
                                } else {
                                    i4 = i14;
                                    i17 = i9;
                                    i18 = i10;
                                }
                            }
                        }
                        unsafe4 = unsafe;
                        i13 = 1048575;
                        i12 = -1;
                    } else if (i21 == 2) {
                        zzke zzkeVarZzd = (zzke) unsafe2.getObject(t, j);
                        if (!zzkeVarZzd.zzc()) {
                            int size = zzkeVarZzd.size();
                            zzkeVarZzd = zzkeVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(t, j, zzkeVarZzd);
                        }
                        i14 = h2.e(this.m(i7), i3, bArr, iK, i2, zzkeVarZzd, g2Var);
                        i17 = i17;
                        unsafe4 = unsafe2;
                        i16 = i7;
                        i15 = i5;
                        i13 = 1048575;
                        i12 = -1;
                        i2 = i2;
                    } else {
                        i8 = iK;
                        i9 = i17;
                        i10 = i18;
                        unsafe = unsafe2;
                        i6 = i7;
                    }
                    i4 = i8;
                    i17 = i9;
                    i18 = i10;
                }
            }
            i14 = h2.i(i3, bArr, i4, i2, D(t), g2Var);
            i16 = i6;
            i15 = i5;
            unsafe4 = unsafe;
            i13 = 1048575;
            i12 = -1;
        }
        int i31 = i17;
        Unsafe unsafe6 = unsafe4;
        if (i18 != 1048575) {
            unsafe6.putInt(t, i18, i31);
        }
        if (i14 == i2) {
            return i14;
        }
        throw zzkh.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int O(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, g2 g2Var) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iJ;
        int iJ2 = i;
        Unsafe unsafe = q;
        zzke zzkeVarZzd = (zzke) unsafe.getObject(t, j2);
        if (!zzkeVarZzd.zzc()) {
            int size = zzkeVarZzd.size();
            zzkeVarZzd = zzkeVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(t, j2, zzkeVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    v2 v2Var = (v2) zzkeVarZzd;
                    int iJ3 = h2.j(bArr, iJ2, g2Var);
                    int i12 = g2Var.a + iJ3;
                    while (iJ3 < i12) {
                        v2Var.a(Double.longBitsToDouble(h2.n(bArr, iJ3)));
                        iJ3 += 8;
                    }
                    if (iJ3 == i12) {
                        return iJ3;
                    }
                    throw zzkh.g();
                }
                if (i5 == 1) {
                    v2 v2Var2 = (v2) zzkeVarZzd;
                    v2Var2.a(Double.longBitsToDouble(h2.n(bArr, i)));
                    while (true) {
                        i8 = iJ2 + 8;
                        if (i8 < i2) {
                            iJ2 = h2.j(bArr, i8, g2Var);
                            if (i3 == g2Var.a) {
                                v2Var2.a(Double.longBitsToDouble(h2.n(bArr, iJ2)));
                            }
                        }
                    }
                    return i8;
                }
                return iJ2;
            case 19:
            case 36:
                if (i5 == 2) {
                    b3 b3Var = (b3) zzkeVarZzd;
                    int iJ4 = h2.j(bArr, iJ2, g2Var);
                    int i13 = g2Var.a + iJ4;
                    while (iJ4 < i13) {
                        b3Var.a(Float.intBitsToFloat(h2.b(bArr, iJ4)));
                        iJ4 += 4;
                    }
                    if (iJ4 == i13) {
                        return iJ4;
                    }
                    throw zzkh.g();
                }
                if (i5 == 5) {
                    b3 b3Var2 = (b3) zzkeVarZzd;
                    b3Var2.a(Float.intBitsToFloat(h2.b(bArr, i)));
                    while (true) {
                        i9 = iJ2 + 4;
                        if (i9 < i2) {
                            iJ2 = h2.j(bArr, i9, g2Var);
                            if (i3 == g2Var.a) {
                                b3Var2.a(Float.intBitsToFloat(h2.b(bArr, iJ2)));
                            }
                        }
                    }
                    return i9;
                }
                return iJ2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    j3 j3Var = (j3) zzkeVarZzd;
                    int iJ5 = h2.j(bArr, iJ2, g2Var);
                    int i14 = g2Var.a + iJ5;
                    while (iJ5 < i14) {
                        iJ5 = h2.m(bArr, iJ5, g2Var);
                        j3Var.b(g2Var.b);
                    }
                    if (iJ5 == i14) {
                        return iJ5;
                    }
                    throw zzkh.g();
                }
                if (i5 == 0) {
                    j3 j3Var2 = (j3) zzkeVarZzd;
                    int iM = h2.m(bArr, iJ2, g2Var);
                    j3Var2.b(g2Var.b);
                    while (iM < i2) {
                        int iJ6 = h2.j(bArr, iM, g2Var);
                        if (i3 != g2Var.a) {
                            return iM;
                        }
                        iM = h2.m(bArr, iJ6, g2Var);
                        j3Var2.b(g2Var.b);
                    }
                    return iM;
                }
                return iJ2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return h2.f(bArr, iJ2, zzkeVarZzd, g2Var);
                }
                if (i5 == 0) {
                    return h2.l(i3, bArr, i, i2, zzkeVarZzd, g2Var);
                }
                return iJ2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    j3 j3Var3 = (j3) zzkeVarZzd;
                    int iJ7 = h2.j(bArr, iJ2, g2Var);
                    int i15 = g2Var.a + iJ7;
                    while (iJ7 < i15) {
                        j3Var3.b(h2.n(bArr, iJ7));
                        iJ7 += 8;
                    }
                    if (iJ7 == i15) {
                        return iJ7;
                    }
                    throw zzkh.g();
                }
                if (i5 == 1) {
                    j3 j3Var4 = (j3) zzkeVarZzd;
                    j3Var4.b(h2.n(bArr, i));
                    while (true) {
                        i10 = iJ2 + 8;
                        if (i10 < i2) {
                            iJ2 = h2.j(bArr, i10, g2Var);
                            if (i3 == g2Var.a) {
                                j3Var4.b(h2.n(bArr, iJ2));
                            }
                        }
                    }
                    return i10;
                }
                return iJ2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    e3 e3Var = (e3) zzkeVarZzd;
                    int iJ8 = h2.j(bArr, iJ2, g2Var);
                    int i16 = g2Var.a + iJ8;
                    while (iJ8 < i16) {
                        e3Var.c(h2.b(bArr, iJ8));
                        iJ8 += 4;
                    }
                    if (iJ8 == i16) {
                        return iJ8;
                    }
                    throw zzkh.g();
                }
                if (i5 == 5) {
                    e3 e3Var2 = (e3) zzkeVarZzd;
                    e3Var2.c(h2.b(bArr, i));
                    while (true) {
                        i11 = iJ2 + 4;
                        if (i11 < i2) {
                            iJ2 = h2.j(bArr, i11, g2Var);
                            if (i3 == g2Var.a) {
                                e3Var2.c(h2.b(bArr, iJ2));
                            }
                        }
                    }
                    return i11;
                }
                return iJ2;
            case 25:
            case 42:
                if (i5 == 2) {
                    i2 i2Var = (i2) zzkeVarZzd;
                    iJ = h2.j(bArr, iJ2, g2Var);
                    int i17 = g2Var.a + iJ;
                    while (iJ < i17) {
                        iJ = h2.m(bArr, iJ, g2Var);
                        i2Var.a(g2Var.b != 0);
                    }
                    if (iJ != i17) {
                        throw zzkh.g();
                    }
                    return iJ;
                }
                if (i5 == 0) {
                    i2 i2Var2 = (i2) zzkeVarZzd;
                    int iM2 = h2.m(bArr, iJ2, g2Var);
                    i2Var2.a(g2Var.b != 0);
                    while (iM2 < i2) {
                        int iJ9 = h2.j(bArr, iM2, g2Var);
                        if (i3 != g2Var.a) {
                            return iM2;
                        }
                        iM2 = h2.m(bArr, iJ9, g2Var);
                        i2Var2.a(g2Var.b != 0);
                    }
                    return iM2;
                }
                return iJ2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iJ2 = h2.j(bArr, iJ2, g2Var);
                        int i18 = g2Var.a;
                        if (i18 < 0) {
                            throw zzkh.e();
                        }
                        if (i18 == 0) {
                            zzkeVarZzd.add("");
                        } else {
                            zzkeVarZzd.add(new String(bArr, iJ2, i18, zzkf.b));
                            iJ2 += i18;
                        }
                        while (iJ2 < i2) {
                            int iJ10 = h2.j(bArr, iJ2, g2Var);
                            if (i3 == g2Var.a) {
                                iJ2 = h2.j(bArr, iJ10, g2Var);
                                int i19 = g2Var.a;
                                if (i19 < 0) {
                                    throw zzkh.e();
                                }
                                if (i19 == 0) {
                                    zzkeVarZzd.add("");
                                } else {
                                    zzkeVarZzd.add(new String(bArr, iJ2, i19, zzkf.b));
                                    iJ2 += i19;
                                }
                            }
                        }
                    } else {
                        iJ2 = h2.j(bArr, iJ2, g2Var);
                        int i20 = g2Var.a;
                        if (i20 < 0) {
                            throw zzkh.e();
                        }
                        if (i20 == 0) {
                            zzkeVarZzd.add("");
                        } else {
                            int i21 = iJ2 + i20;
                            if (!b5.f(bArr, iJ2, i21)) {
                                throw zzkh.c();
                            }
                            zzkeVarZzd.add(new String(bArr, iJ2, i20, zzkf.b));
                            iJ2 = i21;
                        }
                        while (iJ2 < i2) {
                            int iJ11 = h2.j(bArr, iJ2, g2Var);
                            if (i3 == g2Var.a) {
                                iJ2 = h2.j(bArr, iJ11, g2Var);
                                int i22 = g2Var.a;
                                if (i22 < 0) {
                                    throw zzkh.e();
                                }
                                if (i22 == 0) {
                                    zzkeVarZzd.add("");
                                } else {
                                    int i23 = iJ2 + i22;
                                    if (!b5.f(bArr, iJ2, i23)) {
                                        throw zzkh.c();
                                    }
                                    zzkeVarZzd.add(new String(bArr, iJ2, i22, zzkf.b));
                                    iJ2 = i23;
                                }
                            }
                        }
                    }
                }
                return iJ2;
            case 27:
                if (i5 == 2) {
                    return h2.e(m(i6), i3, bArr, i, i2, zzkeVarZzd, g2Var);
                }
                return iJ2;
            case 28:
                if (i5 == 2) {
                    int iJ12 = h2.j(bArr, iJ2, g2Var);
                    int i24 = g2Var.a;
                    if (i24 < 0) {
                        throw zzkh.e();
                    }
                    if (i24 > bArr.length - iJ12) {
                        throw zzkh.g();
                    }
                    if (i24 == 0) {
                        zzkeVarZzd.add(zzix.zzb);
                    } else {
                        zzkeVarZzd.add(zzix.zzl(bArr, iJ12, i24));
                        iJ12 += i24;
                    }
                    while (iJ12 < i2) {
                        int iJ13 = h2.j(bArr, iJ12, g2Var);
                        if (i3 != g2Var.a) {
                            return iJ12;
                        }
                        iJ12 = h2.j(bArr, iJ13, g2Var);
                        int i25 = g2Var.a;
                        if (i25 < 0) {
                            throw zzkh.e();
                        }
                        if (i25 > bArr.length - iJ12) {
                            throw zzkh.g();
                        }
                        if (i25 == 0) {
                            zzkeVarZzd.add(zzix.zzb);
                        } else {
                            zzkeVarZzd.add(zzix.zzl(bArr, iJ12, i25));
                            iJ12 += i25;
                        }
                    }
                    return iJ12;
                }
                return iJ2;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iJ = h2.l(i3, bArr, i, i2, zzkeVarZzd, g2Var);
                    }
                    return iJ2;
                }
                iJ = h2.f(bArr, iJ2, zzkeVarZzd, g2Var);
                zzjx zzjxVar = (zzjx) t;
                zzmc zzmcVar = zzjxVar.zzc;
                if (zzmcVar == zzmc.zzc()) {
                    zzmcVar = null;
                }
                Object objC = c4.c(i4, zzkeVarZzd, l(i6), zzmcVar, this.l);
                if (objC != null) {
                    zzjxVar.zzc = (zzmc) objC;
                    return iJ;
                }
                return iJ;
            case 33:
            case 47:
                if (i5 == 2) {
                    e3 e3Var3 = (e3) zzkeVarZzd;
                    int iJ14 = h2.j(bArr, iJ2, g2Var);
                    int i26 = g2Var.a + iJ14;
                    while (iJ14 < i26) {
                        iJ14 = h2.j(bArr, iJ14, g2Var);
                        e3Var3.c(zzja.zzb(g2Var.a));
                    }
                    if (iJ14 == i26) {
                        return iJ14;
                    }
                    throw zzkh.g();
                }
                if (i5 == 0) {
                    e3 e3Var4 = (e3) zzkeVarZzd;
                    int iJ15 = h2.j(bArr, iJ2, g2Var);
                    e3Var4.c(zzja.zzb(g2Var.a));
                    while (iJ15 < i2) {
                        int iJ16 = h2.j(bArr, iJ15, g2Var);
                        if (i3 != g2Var.a) {
                            return iJ15;
                        }
                        iJ15 = h2.j(bArr, iJ16, g2Var);
                        e3Var4.c(zzja.zzb(g2Var.a));
                    }
                    return iJ15;
                }
                return iJ2;
            case 34:
            case 48:
                if (i5 == 2) {
                    j3 j3Var5 = (j3) zzkeVarZzd;
                    int iJ17 = h2.j(bArr, iJ2, g2Var);
                    int i27 = g2Var.a + iJ17;
                    while (iJ17 < i27) {
                        iJ17 = h2.m(bArr, iJ17, g2Var);
                        j3Var5.b(zzja.zzc(g2Var.b));
                    }
                    if (iJ17 == i27) {
                        return iJ17;
                    }
                    throw zzkh.g();
                }
                if (i5 == 0) {
                    j3 j3Var6 = (j3) zzkeVarZzd;
                    int iM3 = h2.m(bArr, iJ2, g2Var);
                    j3Var6.b(zzja.zzc(g2Var.b));
                    while (iM3 < i2) {
                        int iJ18 = h2.j(bArr, iM3, g2Var);
                        if (i3 != g2Var.a) {
                            return iM3;
                        }
                        iM3 = h2.m(bArr, iJ18, g2Var);
                        j3Var6.b(zzja.zzc(g2Var.b));
                    }
                    return iM3;
                }
                return iJ2;
            default:
                if (i5 == 3) {
                    a4 a4VarM = m(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iC = h2.c(a4VarM, bArr, i, i2, i28, g2Var);
                    zzkeVarZzd.add(g2Var.c);
                    while (iC < i2) {
                        int iJ19 = h2.j(bArr, iC, g2Var);
                        if (i3 != g2Var.a) {
                            return iC;
                        }
                        iC = h2.c(a4VarM, bArr, iJ19, i2, i28, g2Var);
                        zzkeVarZzd.add(g2Var.c);
                    }
                    return iC;
                }
                return iJ2;
        }
    }

    private final int P(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return S(i, 0);
    }

    private final int Q(int i, int i2) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return S(i, i2);
    }

    private final int R(int i) {
        return this.a[i + 2];
    }

    private final int S(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int i(int i) {
        return (i >>> 20) & 255;
    }

    private final int j(int i) {
        return this.a[i + 1];
    }

    private static <T> long k(T t, long j) {
        return ((Long) w4.k(t, j)).longValue();
    }

    private final zzkb l(int i) {
        int i2 = i / 3;
        return (zzkb) this.b[i2 + i2 + 1];
    }

    private final a4 m(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        a4 a4Var = (a4) this.b[i3];
        if (a4Var != null) {
            return a4Var;
        }
        a4<T> a4VarB = x3.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = a4VarB;
        return a4VarB;
    }

    private final Object n(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    private static Field o(Class<?> cls, String str) {
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

    private final void p(T t, T t2, int i) {
        long j = j(i) & 1048575;
        if (u(t2, i)) {
            Object objK = w4.k(t, j);
            Object objK2 = w4.k(t2, j);
            if (objK != null && objK2 != null) {
                w4.x(t, j, zzkf.d(objK, objK2));
                r(t, i);
            } else if (objK2 != null) {
                w4.x(t, j, objK2);
                r(t, i);
            }
        }
    }

    private final void q(T t, T t2, int i) {
        int iJ = j(i);
        int i2 = this.a[i];
        long j = iJ & 1048575;
        if (x(t2, i2, i)) {
            Object objK = x(t, i2, i) ? w4.k(t, j) : null;
            Object objK2 = w4.k(t2, j);
            if (objK != null && objK2 != null) {
                w4.x(t, j, zzkf.d(objK, objK2));
                s(t, i2, i);
            } else if (objK2 != null) {
                w4.x(t, j, objK2);
                s(t, i2, i);
            }
        }
    }

    private final void r(T t, int i) {
        int iR = R(i);
        long j = 1048575 & iR;
        if (j == 1048575) {
            return;
        }
        w4.v(t, j, (1 << (iR >>> 20)) | w4.h(t, j));
    }

    private final void s(T t, int i, int i2) {
        w4.v(t, R(i2) & 1048575, i);
    }

    private final boolean t(T t, T t2, int i) {
        return u(t, i) == u(t2, i);
    }

    private final boolean u(T t, int i) {
        int iR = R(i);
        long j = iR & 1048575;
        if (j != 1048575) {
            return (w4.h(t, j) & (1 << (iR >>> 20))) != 0;
        }
        int iJ = j(i);
        long j2 = iJ & 1048575;
        switch (i(iJ)) {
            case 0:
                return Double.doubleToRawLongBits(w4.f(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(w4.g(t, j2)) != 0;
            case 2:
                return w4.i(t, j2) != 0;
            case 3:
                return w4.i(t, j2) != 0;
            case 4:
                return w4.h(t, j2) != 0;
            case 5:
                return w4.i(t, j2) != 0;
            case 6:
                return w4.h(t, j2) != 0;
            case 7:
                return w4.B(t, j2);
            case 8:
                Object objK = w4.k(t, j2);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof zzix) {
                    return !zzix.zzb.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return w4.k(t, j2) != null;
            case 10:
                return !zzix.zzb.equals(w4.k(t, j2));
            case 11:
                return w4.h(t, j2) != 0;
            case 12:
                return w4.h(t, j2) != 0;
            case 13:
                return w4.h(t, j2) != 0;
            case 14:
                return w4.i(t, j2) != 0;
            case 15:
                return w4.h(t, j2) != 0;
            case 16:
                return w4.i(t, j2) != 0;
            case 17:
                return w4.k(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean v(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return u(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean w(Object obj, int i, a4 a4Var) {
        return a4Var.a(w4.k(obj, i & 1048575));
    }

    private final boolean x(T t, int i, int i2) {
        return w4.h(t, (long) (R(i2) & 1048575)) == i;
    }

    private static <T> boolean y(T t, long j) {
        return ((Boolean) w4.k(t, j)).booleanValue();
    }

    private final void z(T t, u2 u2Var) throws IOException {
        int i;
        if (this.f) {
            this.m.a(t);
            throw null;
        }
        int length = this.a.length;
        Unsafe unsafe = q;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < length) {
            int iJ = j(i3);
            int i6 = this.a[i3];
            int i7 = i(iJ);
            if (i7 <= 17) {
                int i8 = this.a[i3 + 2];
                int i9 = i8 & i2;
                if (i9 != i5) {
                    i4 = unsafe.getInt(t, i9);
                    i5 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = iJ & i2;
            switch (i7) {
                case 0:
                    if ((i4 & i) != 0) {
                        u2Var.q(i6, w4.f(t, j));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i4 & i) != 0) {
                        u2Var.z(i6, w4.g(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i4 & i) != 0) {
                        u2Var.E(i6, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i4 & i) != 0) {
                        u2Var.j(i6, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i4 & i) != 0) {
                        u2Var.C(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i4 & i) != 0) {
                        u2Var.x(i6, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i4 & i) != 0) {
                        u2Var.v(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i4 & i) != 0) {
                        u2Var.m(i6, w4.B(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i4 & i) != 0) {
                        B(i6, unsafe.getObject(t, j), u2Var);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i4 & i) != 0) {
                        u2Var.G(i6, unsafe.getObject(t, j), m(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i4 & i) != 0) {
                        u2Var.o(i6, (zzix) unsafe.getObject(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i4 & i) != 0) {
                        u2Var.h(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i4 & i) != 0) {
                        u2Var.t(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i4 & i) != 0) {
                        u2Var.H(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i4 & i) != 0) {
                        u2Var.J(i6, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i4 & i) != 0) {
                        u2Var.a(i6, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i4 & i) != 0) {
                        u2Var.c(i6, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i4 & i) != 0) {
                        u2Var.B(i6, unsafe.getObject(t, j), m(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    c4.l(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    c4.p(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    c4.s(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    c4.B(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    c4.r(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    c4.o(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    c4.n(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    c4.j(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    c4.y(this.a[i3], (List) unsafe.getObject(t, j), u2Var);
                    break;
                case 27:
                    c4.t(this.a[i3], (List) unsafe.getObject(t, j), u2Var, m(i3));
                    break;
                case 28:
                    c4.k(this.a[i3], (List) unsafe.getObject(t, j), u2Var);
                    break;
                case 29:
                    c4.z(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    break;
                case 30:
                    c4.m(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    break;
                case 31:
                    c4.u(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    break;
                case 32:
                    c4.v(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    break;
                case 33:
                    c4.w(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    break;
                case 34:
                    c4.x(this.a[i3], (List) unsafe.getObject(t, j), u2Var, false);
                    break;
                case 35:
                    c4.l(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 36:
                    c4.p(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 37:
                    c4.s(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 38:
                    c4.B(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 39:
                    c4.r(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 40:
                    c4.o(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 41:
                    c4.n(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 42:
                    c4.j(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 43:
                    c4.z(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 44:
                    c4.m(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 45:
                    c4.u(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 46:
                    c4.v(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 47:
                    c4.w(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 48:
                    c4.x(this.a[i3], (List) unsafe.getObject(t, j), u2Var, true);
                    break;
                case 49:
                    c4.q(this.a[i3], (List) unsafe.getObject(t, j), u2Var, m(i3));
                    break;
                case 50:
                    A(u2Var, i6, unsafe.getObject(t, j), i3);
                    break;
                case 51:
                    if (x(t, i6, i3)) {
                        u2Var.q(i6, G(t, j));
                    }
                    break;
                case 52:
                    if (x(t, i6, i3)) {
                        u2Var.z(i6, H(t, j));
                    }
                    break;
                case 53:
                    if (x(t, i6, i3)) {
                        u2Var.E(i6, k(t, j));
                    }
                    break;
                case 54:
                    if (x(t, i6, i3)) {
                        u2Var.j(i6, k(t, j));
                    }
                    break;
                case 55:
                    if (x(t, i6, i3)) {
                        u2Var.C(i6, K(t, j));
                    }
                    break;
                case 56:
                    if (x(t, i6, i3)) {
                        u2Var.x(i6, k(t, j));
                    }
                    break;
                case 57:
                    if (x(t, i6, i3)) {
                        u2Var.v(i6, K(t, j));
                    }
                    break;
                case 58:
                    if (x(t, i6, i3)) {
                        u2Var.m(i6, y(t, j));
                    }
                    break;
                case 59:
                    if (x(t, i6, i3)) {
                        B(i6, unsafe.getObject(t, j), u2Var);
                    }
                    break;
                case 60:
                    if (x(t, i6, i3)) {
                        u2Var.G(i6, unsafe.getObject(t, j), m(i3));
                    }
                    break;
                case 61:
                    if (x(t, i6, i3)) {
                        u2Var.o(i6, (zzix) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (x(t, i6, i3)) {
                        u2Var.h(i6, K(t, j));
                    }
                    break;
                case 63:
                    if (x(t, i6, i3)) {
                        u2Var.t(i6, K(t, j));
                    }
                    break;
                case 64:
                    if (x(t, i6, i3)) {
                        u2Var.H(i6, K(t, j));
                    }
                    break;
                case 65:
                    if (x(t, i6, i3)) {
                        u2Var.J(i6, k(t, j));
                    }
                    break;
                case 66:
                    if (x(t, i6, i3)) {
                        u2Var.a(i6, K(t, j));
                    }
                    break;
                case 67:
                    if (x(t, i6, i3)) {
                        u2Var.c(i6, k(t, j));
                    }
                    break;
                case 68:
                    if (x(t, i6, i3)) {
                        u2Var.B(i6, unsafe.getObject(t, j), m(i3));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        o4<?, ?> o4Var = this.l;
        o4Var.i(o4Var.c(t), u2Var);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11621. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int C(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.g2 r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s3.C(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.g2):int");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[LOOP:1: B:45:0x00b4->B:50:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.a4
    public final boolean a(T t) {
        int i;
        int i2;
        List list;
        a4 a4VarM;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.i) {
            int i7 = this.h[i6];
            int i8 = this.a[i7];
            int iJ = j(i7);
            int i9 = this.a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = q.getInt(t, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i4;
                i2 = i5;
            }
            if ((268435456 & iJ) != 0 && !v(t, i7, i, i2, i11)) {
                return false;
            }
            int i12 = i(iJ);
            if (i12 == 9 || i12 == 17) {
                if (v(t, i7, i, i2, i11) && !w(t, iJ, m(i7))) {
                    return false;
                }
            } else if (i12 == 27) {
                list = (List) w4.k(t, iJ & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    a4VarM = m(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!a4VarM.a(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (i12 == 60 || i12 == 68) {
                if (x(t, i8, i7) && !w(t, iJ, m(i7))) {
                    return false;
                }
            } else if (i12 == 49) {
                list = (List) w4.k(t, iJ & 1048575);
                if (list.isEmpty()) {
                    a4VarM = m(i7);
                    while (i3 < list.size()) {
                        if (!a4VarM.a(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i12 == 50 && !((zzkw) w4.k(t, iJ & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        if (!this.f) {
            return true;
        }
        this.m.a(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final void b(T t) {
        int i;
        int i2 = this.i;
        while (true) {
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long j = j(this.h[i2]) & 1048575;
            Object objK = w4.k(t, j);
            if (objK != null) {
                ((zzkw) objK).zzc();
                w4.x(t, j, objK);
            }
            i2++;
        }
        int length = this.h.length;
        while (i < length) {
            this.k.a(t, this.h[i]);
            i++;
        }
        this.l.g(t);
        if (this.f) {
            this.m.b(t);
        }
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final int c(T t) {
        int i;
        int iZzc;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iJ = j(i3);
            int i4 = this.a[i3];
            long j = 1048575 & iJ;
            int iHashCode = 37;
            switch (i(iJ)) {
                case 0:
                    i = i2 * 53;
                    iZzc = zzkf.zzc(Double.doubleToLongBits(w4.f(t, j)));
                    i2 = i + iZzc;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzc = Float.floatToIntBits(w4.g(t, j));
                    i2 = i + iZzc;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzc = zzkf.zzc(w4.i(t, j));
                    i2 = i + iZzc;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzc = zzkf.zzc(w4.i(t, j));
                    i2 = i + iZzc;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzc = w4.h(t, j);
                    i2 = i + iZzc;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzc = zzkf.zzc(w4.i(t, j));
                    i2 = i + iZzc;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzc = w4.h(t, j);
                    i2 = i + iZzc;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzc = zzkf.zza(w4.B(t, j));
                    i2 = i + iZzc;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzc = ((String) w4.k(t, j)).hashCode();
                    i2 = i + iZzc;
                    break;
                case 9:
                    Object objK = w4.k(t, j);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzc = w4.k(t, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzc = w4.h(t, j);
                    i2 = i + iZzc;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzc = w4.h(t, j);
                    i2 = i + iZzc;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzc = w4.h(t, j);
                    i2 = i + iZzc;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzc = zzkf.zzc(w4.i(t, j));
                    i2 = i + iZzc;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzc = w4.h(t, j);
                    i2 = i + iZzc;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzc = zzkf.zzc(w4.i(t, j));
                    i2 = i + iZzc;
                    break;
                case 17:
                    Object objK2 = w4.k(t, j);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
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
                    iZzc = w4.k(t, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzc = w4.k(t, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 51:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkf.zzc(Double.doubleToLongBits(G(t, j)));
                        i2 = i + iZzc;
                    }
                    break;
                case 52:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Float.floatToIntBits(H(t, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 53:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkf.zzc(k(t, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 54:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkf.zzc(k(t, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 55:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = K(t, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 56:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkf.zzc(k(t, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 57:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = K(t, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 58:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkf.zza(y(t, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 59:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = ((String) w4.k(t, j)).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case 60:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = w4.k(t, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case 61:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = w4.k(t, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case 62:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = K(t, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 63:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = K(t, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 64:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = K(t, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 65:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkf.zzc(k(t, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 66:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = K(t, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 67:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkf.zzc(k(t, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 68:
                    if (x(t, i4, i3)) {
                        i = i2 * 53;
                        iZzc = w4.k(t, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.l.c(t).hashCode();
        if (!this.f) {
            return iHashCode2;
        }
        this.m.a(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final int d(T t) {
        return this.g ? J(t) : I(t);
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final void e(T t, byte[] bArr, int i, int i2, g2 g2Var) throws IOException {
        if (this.g) {
            N(t, bArr, i, i2, g2Var);
        } else {
            C(t, bArr, i, i2, 0, g2Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final void f(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.a.length; i += 3) {
            int iJ = j(i);
            long j = 1048575 & iJ;
            int i2 = this.a[i];
            switch (i(iJ)) {
                case 0:
                    if (u(t2, i)) {
                        w4.t(t, j, w4.f(t2, j));
                        r(t, i);
                    }
                    break;
                case 1:
                    if (u(t2, i)) {
                        w4.u(t, j, w4.g(t2, j));
                        r(t, i);
                    }
                    break;
                case 2:
                    if (u(t2, i)) {
                        w4.w(t, j, w4.i(t2, j));
                        r(t, i);
                    }
                    break;
                case 3:
                    if (u(t2, i)) {
                        w4.w(t, j, w4.i(t2, j));
                        r(t, i);
                    }
                    break;
                case 4:
                    if (u(t2, i)) {
                        w4.v(t, j, w4.h(t2, j));
                        r(t, i);
                    }
                    break;
                case 5:
                    if (u(t2, i)) {
                        w4.w(t, j, w4.i(t2, j));
                        r(t, i);
                    }
                    break;
                case 6:
                    if (u(t2, i)) {
                        w4.v(t, j, w4.h(t2, j));
                        r(t, i);
                    }
                    break;
                case 7:
                    if (u(t2, i)) {
                        w4.r(t, j, w4.B(t2, j));
                        r(t, i);
                    }
                    break;
                case 8:
                    if (u(t2, i)) {
                        w4.x(t, j, w4.k(t2, j));
                        r(t, i);
                    }
                    break;
                case 9:
                    p(t, t2, i);
                    break;
                case 10:
                    if (u(t2, i)) {
                        w4.x(t, j, w4.k(t2, j));
                        r(t, i);
                    }
                    break;
                case 11:
                    if (u(t2, i)) {
                        w4.v(t, j, w4.h(t2, j));
                        r(t, i);
                    }
                    break;
                case 12:
                    if (u(t2, i)) {
                        w4.v(t, j, w4.h(t2, j));
                        r(t, i);
                    }
                    break;
                case 13:
                    if (u(t2, i)) {
                        w4.v(t, j, w4.h(t2, j));
                        r(t, i);
                    }
                    break;
                case 14:
                    if (u(t2, i)) {
                        w4.w(t, j, w4.i(t2, j));
                        r(t, i);
                    }
                    break;
                case 15:
                    if (u(t2, i)) {
                        w4.v(t, j, w4.h(t2, j));
                        r(t, i);
                    }
                    break;
                case 16:
                    if (u(t2, i)) {
                        w4.w(t, j, w4.i(t2, j));
                        r(t, i);
                    }
                    break;
                case 17:
                    p(t, t2, i);
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
                    this.k.b(t, t2, j);
                    break;
                case 50:
                    c4.i(this.o, t, t2, j);
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
                    if (x(t2, i2, i)) {
                        w4.x(t, j, w4.k(t2, j));
                        s(t, i2, i);
                    }
                    break;
                case 60:
                    q(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (x(t2, i2, i)) {
                        w4.x(t, j, w4.k(t2, j));
                        s(t, i2, i);
                    }
                    break;
                case 68:
                    q(t, t2, i);
                    break;
            }
        }
        c4.f(this.l, t, t2);
        if (this.f) {
            c4.e(this.m, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final boolean g(T t, T t2) {
        boolean zH;
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int iJ = j(i);
            long j = iJ & 1048575;
            switch (i(iJ)) {
                case 0:
                    if (!t(t, t2, i) || Double.doubleToLongBits(w4.f(t, j)) != Double.doubleToLongBits(w4.f(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!t(t, t2, i) || Float.floatToIntBits(w4.g(t, j)) != Float.floatToIntBits(w4.g(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!t(t, t2, i) || w4.i(t, j) != w4.i(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!t(t, t2, i) || w4.i(t, j) != w4.i(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!t(t, t2, i) || w4.h(t, j) != w4.h(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!t(t, t2, i) || w4.i(t, j) != w4.i(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!t(t, t2, i) || w4.h(t, j) != w4.h(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!t(t, t2, i) || w4.B(t, j) != w4.B(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!t(t, t2, i) || !c4.h(w4.k(t, j), w4.k(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!t(t, t2, i) || !c4.h(w4.k(t, j), w4.k(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!t(t, t2, i) || !c4.h(w4.k(t, j), w4.k(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!t(t, t2, i) || w4.h(t, j) != w4.h(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!t(t, t2, i) || w4.h(t, j) != w4.h(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!t(t, t2, i) || w4.h(t, j) != w4.h(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!t(t, t2, i) || w4.i(t, j) != w4.i(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!t(t, t2, i) || w4.h(t, j) != w4.h(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!t(t, t2, i) || w4.i(t, j) != w4.i(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!t(t, t2, i) || !c4.h(w4.k(t, j), w4.k(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zH = c4.h(w4.k(t, j), w4.k(t2, j));
                    break;
                case 50:
                    zH = c4.h(w4.k(t, j), w4.k(t2, j));
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
                    long jR = R(i) & 1048575;
                    if (w4.h(t, jR) != w4.h(t2, jR) || !c4.h(w4.k(t, j), w4.k(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zH) {
                return false;
            }
        }
        if (!this.l.c(t).equals(this.l.c(t2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.m.a(t);
        this.m.a(t2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final void h(T t, u2 u2Var) throws IOException {
        if (!this.g) {
            z(t, u2Var);
            return;
        }
        if (this.f) {
            this.m.a(t);
            throw null;
        }
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int iJ = j(i);
            int i2 = this.a[i];
            switch (i(iJ)) {
                case 0:
                    if (u(t, i)) {
                        u2Var.q(i2, w4.f(t, iJ & 1048575));
                    }
                    break;
                case 1:
                    if (u(t, i)) {
                        u2Var.z(i2, w4.g(t, iJ & 1048575));
                    }
                    break;
                case 2:
                    if (u(t, i)) {
                        u2Var.E(i2, w4.i(t, iJ & 1048575));
                    }
                    break;
                case 3:
                    if (u(t, i)) {
                        u2Var.j(i2, w4.i(t, iJ & 1048575));
                    }
                    break;
                case 4:
                    if (u(t, i)) {
                        u2Var.C(i2, w4.h(t, iJ & 1048575));
                    }
                    break;
                case 5:
                    if (u(t, i)) {
                        u2Var.x(i2, w4.i(t, iJ & 1048575));
                    }
                    break;
                case 6:
                    if (u(t, i)) {
                        u2Var.v(i2, w4.h(t, iJ & 1048575));
                    }
                    break;
                case 7:
                    if (u(t, i)) {
                        u2Var.m(i2, w4.B(t, iJ & 1048575));
                    }
                    break;
                case 8:
                    if (u(t, i)) {
                        B(i2, w4.k(t, iJ & 1048575), u2Var);
                    }
                    break;
                case 9:
                    if (u(t, i)) {
                        u2Var.G(i2, w4.k(t, iJ & 1048575), m(i));
                    }
                    break;
                case 10:
                    if (u(t, i)) {
                        u2Var.o(i2, (zzix) w4.k(t, iJ & 1048575));
                    }
                    break;
                case 11:
                    if (u(t, i)) {
                        u2Var.h(i2, w4.h(t, iJ & 1048575));
                    }
                    break;
                case 12:
                    if (u(t, i)) {
                        u2Var.t(i2, w4.h(t, iJ & 1048575));
                    }
                    break;
                case 13:
                    if (u(t, i)) {
                        u2Var.H(i2, w4.h(t, iJ & 1048575));
                    }
                    break;
                case 14:
                    if (u(t, i)) {
                        u2Var.J(i2, w4.i(t, iJ & 1048575));
                    }
                    break;
                case 15:
                    if (u(t, i)) {
                        u2Var.a(i2, w4.h(t, iJ & 1048575));
                    }
                    break;
                case 16:
                    if (u(t, i)) {
                        u2Var.c(i2, w4.i(t, iJ & 1048575));
                    }
                    break;
                case 17:
                    if (u(t, i)) {
                        u2Var.B(i2, w4.k(t, iJ & 1048575), m(i));
                    }
                    break;
                case 18:
                    c4.l(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 19:
                    c4.p(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 20:
                    c4.s(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 21:
                    c4.B(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 22:
                    c4.r(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 23:
                    c4.o(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 24:
                    c4.n(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 25:
                    c4.j(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 26:
                    c4.y(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var);
                    break;
                case 27:
                    c4.t(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, m(i));
                    break;
                case 28:
                    c4.k(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var);
                    break;
                case 29:
                    c4.z(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 30:
                    c4.m(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 31:
                    c4.u(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 32:
                    c4.v(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 33:
                    c4.w(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 34:
                    c4.x(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, false);
                    break;
                case 35:
                    c4.l(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 36:
                    c4.p(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 37:
                    c4.s(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 38:
                    c4.B(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 39:
                    c4.r(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 40:
                    c4.o(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 41:
                    c4.n(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 42:
                    c4.j(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 43:
                    c4.z(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 44:
                    c4.m(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 45:
                    c4.u(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 46:
                    c4.v(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 47:
                    c4.w(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 48:
                    c4.x(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, true);
                    break;
                case 49:
                    c4.q(this.a[i], (List) w4.k(t, iJ & 1048575), u2Var, m(i));
                    break;
                case 50:
                    A(u2Var, i2, w4.k(t, iJ & 1048575), i);
                    break;
                case 51:
                    if (x(t, i2, i)) {
                        u2Var.q(i2, G(t, iJ & 1048575));
                    }
                    break;
                case 52:
                    if (x(t, i2, i)) {
                        u2Var.z(i2, H(t, iJ & 1048575));
                    }
                    break;
                case 53:
                    if (x(t, i2, i)) {
                        u2Var.E(i2, k(t, iJ & 1048575));
                    }
                    break;
                case 54:
                    if (x(t, i2, i)) {
                        u2Var.j(i2, k(t, iJ & 1048575));
                    }
                    break;
                case 55:
                    if (x(t, i2, i)) {
                        u2Var.C(i2, K(t, iJ & 1048575));
                    }
                    break;
                case 56:
                    if (x(t, i2, i)) {
                        u2Var.x(i2, k(t, iJ & 1048575));
                    }
                    break;
                case 57:
                    if (x(t, i2, i)) {
                        u2Var.v(i2, K(t, iJ & 1048575));
                    }
                    break;
                case 58:
                    if (x(t, i2, i)) {
                        u2Var.m(i2, y(t, iJ & 1048575));
                    }
                    break;
                case 59:
                    if (x(t, i2, i)) {
                        B(i2, w4.k(t, iJ & 1048575), u2Var);
                    }
                    break;
                case 60:
                    if (x(t, i2, i)) {
                        u2Var.G(i2, w4.k(t, iJ & 1048575), m(i));
                    }
                    break;
                case 61:
                    if (x(t, i2, i)) {
                        u2Var.o(i2, (zzix) w4.k(t, iJ & 1048575));
                    }
                    break;
                case 62:
                    if (x(t, i2, i)) {
                        u2Var.h(i2, K(t, iJ & 1048575));
                    }
                    break;
                case 63:
                    if (x(t, i2, i)) {
                        u2Var.t(i2, K(t, iJ & 1048575));
                    }
                    break;
                case 64:
                    if (x(t, i2, i)) {
                        u2Var.H(i2, K(t, iJ & 1048575));
                    }
                    break;
                case 65:
                    if (x(t, i2, i)) {
                        u2Var.J(i2, k(t, iJ & 1048575));
                    }
                    break;
                case 66:
                    if (x(t, i2, i)) {
                        u2Var.a(i2, K(t, iJ & 1048575));
                    }
                    break;
                case 67:
                    if (x(t, i2, i)) {
                        u2Var.c(i2, k(t, iJ & 1048575));
                    }
                    break;
                case 68:
                    if (x(t, i2, i)) {
                        u2Var.B(i2, w4.k(t, iJ & 1048575), m(i));
                    }
                    break;
            }
        }
        o4<?, ?> o4Var = this.l;
        o4Var.i(o4Var.c(t), u2Var);
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final T zze() {
        return (T) ((zzjx) this.e).zzl(4, null, null);
    }
}
