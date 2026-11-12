package com.google.crypto.tink.shaded.protobuf;

import defpackage.ccj;
import defpackage.ibq;
import defpackage.srf;
import defpackage.vlo;
import defpackage.wdi;
import defpackage.ykg;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
public final class d0<T> implements k0<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f9374r = new int[0];
    public static final Unsafe s = ibq.F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f9375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f9376b;
    public final int c;
    public final int d;
    public final b0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9377k;
    public final int l;
    public final ykg m;
    public final w n;
    public final n0<?, ?> o;
    public final m<?> p;
    public final z q;

    public d0(int[] iArr, Object[] objArr, int i, int i2, b0 b0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, ykg ykgVar, w wVar, n0<?, ?> n0Var, m<?> mVar, z zVar) {
        this.f9375a = iArr;
        this.f9376b = objArr;
        this.c = i;
        this.d = i2;
        this.g = b0Var instanceof GeneratedMessageLite;
        this.h = z;
        this.f = mVar != null && mVar.e(b0Var);
        this.i = z2;
        this.j = iArr2;
        this.f9377k = i3;
        this.l = i4;
        this.m = ykgVar;
        this.n = wVar;
        this.o = n0Var;
        this.p = mVar;
        this.e = b0Var;
        this.q = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean B(Object obj, int i, k0 k0Var) {
        return k0Var.b(ibq.E(obj, S(i)));
    }

    public static boolean G(int i) {
        return (i & 268435456) != 0;
    }

    public static List<?> H(Object obj, long j) {
        return (List) ibq.E(obj, j);
    }

    public static <T> long I(T t, long j) {
        return ibq.C(t, j);
    }

    public static <T> d0<T> O(Class<T> cls, srf srfVar, ykg ykgVar, w wVar, n0<?, ?> n0Var, m<?> mVar, z zVar) {
        return srfVar instanceof ccj ? Q((ccj) srfVar, ykgVar, wVar, n0Var, mVar, zVar) : P((vlo) srfVar, ykgVar, wVar, n0Var, mVar, zVar);
    }

    public static <T> d0<T> P(vlo vloVar, ykg ykgVar, w wVar, n0<?, ?> n0Var, m<?> mVar, z zVar) {
        boolean z = vloVar.c() == ProtoSyntax.PROTO3;
        o[] oVarArrE = vloVar.e();
        if (oVarArrE.length != 0) {
            o oVar = oVarArrE[0];
            throw null;
        }
        int length = oVarArrE.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (oVarArrE.length > 0) {
            o oVar2 = oVarArrE[0];
            throw null;
        }
        int[] iArrD = vloVar.d();
        if (iArrD == null) {
            iArrD = f9374r;
        }
        if (oVarArrE.length > 0) {
            o oVar3 = oVarArrE[0];
            throw null;
        }
        int[] iArr2 = f9374r;
        int[] iArr3 = f9374r;
        int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
        System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
        return new d0<>(iArr, objArr, 0, 0, vloVar.b(), z, true, iArr4, iArrD.length, iArrD.length + iArr2.length, ykgVar, wVar, n0Var, mVar, zVar);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0278  */
    /* JADX WARN: Code duplicated, block: B:126:0x027e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0294  */
    /* JADX WARN: Code duplicated, block: B:131:0x0298  */
    /* JADX WARN: Code duplicated, block: B:166:0x034f  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ab  */
    public static <T> d0<T> Q(ccj ccjVar, ykg ykgVar, w wVar, n0<?, ?> n0Var, m<?> mVar, z zVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        char cCharAt5;
        int i10;
        char cCharAt6;
        int i11;
        char cCharAt7;
        int i12;
        char cCharAt8;
        int i13;
        int i14;
        boolean z;
        int i15;
        int i16;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i17;
        int i18;
        int i19;
        Field fieldK0;
        int i20;
        char cCharAt9;
        int i21;
        int i22;
        int i23;
        Object obj;
        Field fieldK1;
        int i24;
        Object obj2;
        Field fieldK2;
        int i25;
        char cCharAt10;
        int i26;
        char cCharAt11;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        char cCharAt14;
        int i29 = 0;
        boolean z2 = ccjVar.c() == ProtoSyntax.PROTO3;
        String strE = ccjVar.e();
        int length = strE.length();
        int iCharAt4 = strE.charAt(0);
        if (iCharAt4 >= 55296) {
            int i30 = iCharAt4 & 8191;
            int i31 = 1;
            int i32 = 13;
            while (true) {
                i = i31 + 1;
                cCharAt14 = strE.charAt(i31);
                if (cCharAt14 < 55296) {
                    break;
                }
                i30 |= (cCharAt14 & 8191) << i32;
                i32 += 13;
                i31 = i;
            }
            iCharAt4 = i30 | (cCharAt14 << i32);
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt5 = strE.charAt(i);
        if (iCharAt5 >= 55296) {
            int i34 = iCharAt5 & 8191;
            int i35 = 13;
            while (true) {
                i28 = i33 + 1;
                cCharAt13 = strE.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i28;
            }
            iCharAt5 = i34 | (cCharAt13 << i35);
            i33 = i28;
        }
        if (iCharAt5 == 0) {
            i4 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i2 = 0;
            iCharAt3 = 0;
            iArr = f9374r;
            i3 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt6 = strE.charAt(i33);
            if (iCharAt6 >= 55296) {
                int i37 = iCharAt6 & 8191;
                int i38 = 13;
                while (true) {
                    i12 = i36 + 1;
                    cCharAt8 = strE.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i12;
                }
                iCharAt6 = i37 | (cCharAt8 << i38);
                i36 = i12;
            }
            int i39 = i36 + 1;
            int iCharAt7 = strE.charAt(i36);
            if (iCharAt7 >= 55296) {
                int i40 = iCharAt7 & 8191;
                int i41 = 13;
                while (true) {
                    i11 = i39 + 1;
                    cCharAt7 = strE.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i11;
                }
                iCharAt7 = i40 | (cCharAt7 << i41);
                i39 = i11;
            }
            int i42 = i39 + 1;
            int iCharAt8 = strE.charAt(i39);
            if (iCharAt8 >= 55296) {
                int i43 = iCharAt8 & 8191;
                int i44 = 13;
                while (true) {
                    i10 = i42 + 1;
                    cCharAt6 = strE.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i10;
                }
                iCharAt8 = i43 | (cCharAt6 << i44);
                i42 = i10;
            }
            int i45 = i42 + 1;
            iCharAt = strE.charAt(i42);
            if (iCharAt >= 55296) {
                int i46 = iCharAt & 8191;
                int i47 = 13;
                while (true) {
                    i9 = i45 + 1;
                    cCharAt5 = strE.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i9;
                }
                iCharAt = i46 | (cCharAt5 << i47);
                i45 = i9;
            }
            int i48 = i45 + 1;
            iCharAt2 = strE.charAt(i45);
            if (iCharAt2 >= 55296) {
                int i49 = iCharAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i8 = i48 + 1;
                    cCharAt4 = strE.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i8;
                }
                iCharAt2 = i49 | (cCharAt4 << i50);
                i48 = i8;
            }
            int i51 = i48 + 1;
            int iCharAt9 = strE.charAt(i48);
            if (iCharAt9 >= 55296) {
                int i52 = iCharAt9 & 8191;
                int i53 = 13;
                while (true) {
                    i7 = i51 + 1;
                    cCharAt3 = strE.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i7;
                }
                iCharAt9 = i52 | (cCharAt3 << i53);
                i51 = i7;
            }
            int i54 = i51 + 1;
            int iCharAt10 = strE.charAt(i51);
            if (iCharAt10 >= 55296) {
                int i55 = iCharAt10 & 8191;
                int i56 = 13;
                while (true) {
                    i6 = i54 + 1;
                    cCharAt2 = strE.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i6;
                }
                iCharAt10 = i55 | (cCharAt2 << i56);
                i54 = i6;
            }
            int i57 = i54 + 1;
            iCharAt3 = strE.charAt(i54);
            if (iCharAt3 >= 55296) {
                int i58 = iCharAt3 & 8191;
                int i59 = i57;
                int i60 = 13;
                while (true) {
                    i5 = i59 + 1;
                    cCharAt = strE.charAt(i59);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i59 = i5;
                }
                iCharAt3 = i58 | (cCharAt << i60);
                i57 = i5;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt9 + iCharAt10];
            i2 = (iCharAt6 * 2) + iCharAt7;
            i3 = iCharAt6;
            i33 = i57;
            int i61 = iCharAt9;
            iArr = iArr2;
            i29 = iCharAt8;
            i4 = i61;
        }
        Unsafe unsafe = s;
        Object[] objArrD = ccjVar.d();
        Class<?> cls = ccjVar.b().getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 * 2];
        int i62 = iCharAt3 + i4;
        int i63 = iCharAt3;
        int i64 = i62;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int iCharAt11 = strE.charAt(i33);
            int i68 = length;
            if (iCharAt11 >= 55296) {
                int i69 = iCharAt11 & 8191;
                int i70 = i67;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt12 = strE.charAt(i70);
                    i13 = iCharAt3;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                    iCharAt3 = i13;
                }
                iCharAt11 = i69 | (cCharAt12 << i71);
                i14 = i27;
            } else {
                i13 = iCharAt3;
                i14 = i67;
            }
            int i72 = i14 + 1;
            int iCharAt12 = strE.charAt(i14);
            if (iCharAt12 >= 55296) {
                int i73 = iCharAt12 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i26 = i74 + 1;
                    cCharAt11 = strE.charAt(i74);
                    z = z2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i26;
                    z2 = z;
                }
                iCharAt12 = i73 | (cCharAt11 << i75);
                i15 = i26;
            } else {
                z = z2;
                i15 = i72;
            }
            int i76 = iCharAt12 & 255;
            int i77 = iCharAt;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int i78 = i65;
            if (i76 >= 51) {
                int i79 = i15 + 1;
                int iCharAt13 = strE.charAt(i15);
                char c = 55296;
                if (iCharAt13 >= 55296) {
                    int i80 = iCharAt13 & 8191;
                    int i81 = 13;
                    while (true) {
                        i25 = i79 + 1;
                        cCharAt10 = strE.charAt(i79);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i80 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i79 = i25;
                        c = 55296;
                    }
                    iCharAt13 = i80 | (cCharAt10 << i81);
                    i79 = i25;
                }
                int i82 = i76 - 51;
                int i83 = i79;
                if (i82 == 9 || i82 == 17) {
                    i22 = i2 + 1;
                    objArr[((i66 / 3) * 2) + 1] = objArrD[i2];
                } else {
                    if (i82 == 12 && (iCharAt4 & 1) == 1) {
                        i22 = i2 + 1;
                        objArr[((i66 / 3) * 2) + 1] = objArrD[i2];
                    }
                    i23 = iCharAt13 * 2;
                    obj = objArrD[i23];
                    if (obj instanceof Field) {
                        fieldK1 = (Field) obj;
                    } else {
                        fieldK1 = k0(cls, (String) obj);
                        objArrD[i23] = fieldK1;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldK1);
                    i24 = i23 + 1;
                    obj2 = objArrD[i24];
                    if (obj2 instanceof Field) {
                        fieldK2 = (Field) obj2;
                    } else {
                        fieldK2 = k0(cls, (String) obj2);
                        objArrD[i24] = fieldK2;
                    }
                    i16 = i29;
                    iCharAt4 = iCharAt4;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK2);
                    i18 = iObjectFieldOffset3;
                    i19 = i2;
                    i33 = i83;
                    i17 = 0;
                    cls = cls;
                }
                i2 = i22;
                i23 = iCharAt13 * 2;
                obj = objArrD[i23];
                if (obj instanceof Field) {
                    fieldK1 = (Field) obj;
                } else {
                    fieldK1 = k0(cls, (String) obj);
                    objArrD[i23] = fieldK1;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldK1);
                i24 = i23 + 1;
                obj2 = objArrD[i24];
                if (obj2 instanceof Field) {
                    fieldK2 = (Field) obj2;
                } else {
                    fieldK2 = k0(cls, (String) obj2);
                    objArrD[i24] = fieldK2;
                }
                i16 = i29;
                iCharAt4 = iCharAt4;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK2);
                i18 = iObjectFieldOffset4;
                i19 = i2;
                i33 = i83;
                i17 = 0;
                cls = cls;
            } else {
                int i84 = i2 + 1;
                Field fieldK3 = k0(cls, (String) objArrD[i2]);
                if (i76 == 9 || i76 == 17) {
                    i16 = i29;
                    objArr[((i66 / 3) * 2) + 1] = fieldK3.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        i16 = i29;
                        i21 = i2 + 2;
                        objArr[((i66 / 3) * 2) + 1] = objArrD[i84];
                    } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                        i16 = i29;
                        if ((iCharAt4 & 1) == 1) {
                            i21 = i2 + 2;
                            objArr[((i66 / 3) * 2) + 1] = objArrD[i84];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK3);
                        if ((iCharAt4 & 1) == 1 || i76 > 17) {
                            iObjectFieldOffset2 = 0;
                            i17 = 0;
                        } else {
                            int i85 = i15 + 1;
                            int iCharAt14 = strE.charAt(i15);
                            if (iCharAt14 >= 55296) {
                                int i86 = iCharAt14 & 8191;
                                int i87 = 13;
                                while (true) {
                                    i20 = i85 + 1;
                                    cCharAt9 = strE.charAt(i85);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i86 |= (cCharAt9 & 8191) << i87;
                                    i87 += 13;
                                    i85 = i20;
                                }
                                iCharAt14 = i86 | (cCharAt9 << i87);
                                i85 = i20;
                            }
                            int i88 = (i3 * 2) + (iCharAt14 / 32);
                            Object obj3 = objArrD[i88];
                            if (obj3 instanceof Field) {
                                fieldK0 = (Field) obj3;
                            } else {
                                fieldK0 = k0(cls, (String) obj3);
                                objArrD[i88] = fieldK0;
                            }
                            i15 = i85;
                            i17 = iCharAt14 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK0);
                        }
                        if (i76 >= 18 && i76 <= 49) {
                            iArr[i64] = iObjectFieldOffset;
                            i64++;
                        }
                        i33 = i15;
                        int i89 = i84;
                        i18 = iObjectFieldOffset;
                        i19 = i89;
                    } else if (i76 == 50) {
                        int i90 = i63 + 1;
                        iArr[i63] = i66;
                        int i91 = (i66 / 3) * 2;
                        int i92 = i2 + 2;
                        objArr[i91] = objArrD[i84];
                        if ((iCharAt12 & 2048) != 0) {
                            i84 = i2 + 3;
                            objArr[i91 + 1] = objArrD[i92];
                            i16 = i29;
                            i63 = i90;
                        } else {
                            i63 = i90;
                            i84 = i92;
                            i16 = i29;
                        }
                    } else {
                        i16 = i29;
                    }
                    i84 = i21;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK3);
                    if ((iCharAt4 & 1) == 1) {
                        iObjectFieldOffset2 = 0;
                        i17 = 0;
                    } else {
                        iObjectFieldOffset2 = 0;
                        i17 = 0;
                    }
                    if (i76 >= 18) {
                        iArr[i64] = iObjectFieldOffset;
                        i64++;
                    }
                    i33 = i15;
                    int i810 = i84;
                    i18 = iObjectFieldOffset;
                    i19 = i810;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK3);
                if ((iCharAt4 & 1) == 1) {
                    iObjectFieldOffset2 = 0;
                    i17 = 0;
                } else {
                    iObjectFieldOffset2 = 0;
                    i17 = 0;
                }
                if (i76 >= 18) {
                    iArr[i64] = iObjectFieldOffset;
                    i64++;
                }
                i33 = i15;
                int i811 = i84;
                i18 = iObjectFieldOffset;
                i19 = i811;
            }
            int i93 = i66 + 1;
            iArr3[i66] = iCharAt11;
            int i94 = i66 + 2;
            iArr3[i93] = ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & 512) != 0 ? 536870912 : 0) | (i76 << 20) | i18;
            i66 += 3;
            iArr3[i94] = (i17 << 20) | iObjectFieldOffset2;
            i2 = i19;
            cls = cls;
            iArr3 = iArr3;
            iCharAt4 = iCharAt4;
            iCharAt = i77;
            length = i68;
            i29 = i16;
            iCharAt3 = i13;
            z2 = z;
            i65 = i78;
        }
        return new d0<>(iArr3, objArr, i29, iCharAt, ccjVar.b(), z2, false, iArr, iCharAt3, i62, ykgVar, wVar, n0Var, mVar, zVar);
    }

    public static long S(int i) {
        return i & 1048575;
    }

    public static <T> boolean T(T t, long j) {
        return ((Boolean) ibq.E(t, j)).booleanValue();
    }

    public static <T> double U(T t, long j) {
        return ((Double) ibq.E(t, j)).doubleValue();
    }

    public static <T> float V(T t, long j) {
        return ((Float) ibq.E(t, j)).floatValue();
    }

    public static <T> int W(T t, long j) {
        return ((Integer) ibq.E(t, j)).intValue();
    }

    public static <T> long X(T t, long j) {
        return ((Long) ibq.E(t, j)).longValue();
    }

    public static <T> boolean j(T t, long j) {
        return ibq.r(t, j);
    }

    public static Field k0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static <T> double l(T t, long j) {
        return ibq.y(t, j);
    }

    public static int o0(int i) {
        return (i & 267386880) >>> 20;
    }

    public static <T> float p(T t, long j) {
        return ibq.z(t, j);
    }

    public static o0 t(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        o0 o0Var = generatedMessageLite.unknownFields;
        if (o0Var != o0.e()) {
            return o0Var;
        }
        o0 o0VarL = o0.l();
        generatedMessageLite.unknownFields = o0VarL;
        return o0VarL;
    }

    public static <T> int x(T t, long j) {
        return ibq.A(t, j);
    }

    public static boolean y(int i) {
        return (i & 536870912) != 0;
    }

    public final boolean A(T t, int i, int i2, int i3) {
        if (this.h) {
            return z(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N> boolean C(Object obj, int i, int i2) {
        List list = (List) ibq.E(obj, S(i));
        if (list.isEmpty()) {
            return true;
        }
        k0 k0VarS = s(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!k0VarS.b(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final boolean D(T t, int i, int i2) {
        if (this.q.g(ibq.E(t, S(i))).isEmpty()) {
            return true;
        }
        this.q.b(r(i2));
        throw null;
    }

    public final boolean E(T t, T t2, int i) {
        long jF0 = f0(i) & 1048575;
        return ibq.A(t, jF0) == ibq.A(t2, jF0);
    }

    public final boolean F(T t, int i, int i2) {
        return ibq.A(t, (long) (f0(i2) & 1048575)) == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends p.b<ET>> void J(n0<UT, UB> n0Var, m<ET> mVar, T t, i0 i0Var, l lVar) throws IOException {
        Object objN = null;
        Object objD = null;
        while (true) {
            try {
                int iL = i0Var.l();
                int iD0 = d0(iL);
                if (iD0 >= 0) {
                    int iP0 = p0(iD0);
                    try {
                        switch (o0(iP0)) {
                            case 0:
                                ibq.P(t, S(iP0), i0Var.readDouble());
                                l0(t, iD0);
                                break;
                            case 1:
                                ibq.Q(t, S(iP0), i0Var.readFloat());
                                l0(t, iD0);
                                break;
                            case 2:
                                ibq.S(t, S(iP0), i0Var.r());
                                l0(t, iD0);
                                break;
                            case 3:
                                ibq.S(t, S(iP0), i0Var.h());
                                l0(t, iD0);
                                break;
                            case 4:
                                ibq.R(t, S(iP0), i0Var.z());
                                l0(t, iD0);
                                break;
                            case 5:
                                ibq.S(t, S(iP0), i0Var.s());
                                l0(t, iD0);
                                break;
                            case 6:
                                ibq.R(t, S(iP0), i0Var.C());
                                l0(t, iD0);
                                break;
                            case 7:
                                ibq.J(t, S(iP0), i0Var.u());
                                l0(t, iD0);
                                break;
                            case 8:
                                i0(t, iP0, i0Var);
                                l0(t, iD0);
                                break;
                            case 9:
                                if (z(t, iD0)) {
                                    ibq.T(t, S(iP0), s.h(ibq.E(t, S(iP0)), i0Var.L(s(iD0), lVar)));
                                } else {
                                    ibq.T(t, S(iP0), i0Var.L(s(iD0), lVar));
                                    l0(t, iD0);
                                }
                                break;
                            case 10:
                                ibq.T(t, S(iP0), i0Var.readBytes());
                                l0(t, iD0);
                                break;
                            case 11:
                                ibq.R(t, S(iP0), i0Var.c());
                                l0(t, iD0);
                                break;
                            case 12:
                                int iD = i0Var.d();
                                s.e eVarQ = q(iD0);
                                if (eVarQ == null || eVarQ.isInRange(iD)) {
                                    ibq.R(t, S(iP0), iD);
                                    l0(t, iD0);
                                } else {
                                    objN = l0.L(iL, iD, objN, n0Var);
                                }
                                break;
                            case 13:
                                ibq.R(t, S(iP0), i0Var.F());
                                l0(t, iD0);
                                break;
                            case 14:
                                ibq.S(t, S(iP0), i0Var.b());
                                l0(t, iD0);
                                break;
                            case 15:
                                ibq.R(t, S(iP0), i0Var.e());
                                l0(t, iD0);
                                break;
                            case 16:
                                ibq.S(t, S(iP0), i0Var.D());
                                l0(t, iD0);
                                break;
                            case 17:
                                if (z(t, iD0)) {
                                    ibq.T(t, S(iP0), s.h(ibq.E(t, S(iP0)), i0Var.H(s(iD0), lVar)));
                                } else {
                                    ibq.T(t, S(iP0), i0Var.H(s(iD0), lVar));
                                    l0(t, iD0);
                                }
                                break;
                            case 18:
                                i0Var.q(this.n.e(t, S(iP0)));
                                break;
                            case 19:
                                i0Var.n(this.n.e(t, S(iP0)));
                                break;
                            case 20:
                                i0Var.w(this.n.e(t, S(iP0)));
                                break;
                            case 21:
                                i0Var.v(this.n.e(t, S(iP0)));
                                break;
                            case 22:
                                i0Var.j(this.n.e(t, S(iP0)));
                                break;
                            case 23:
                                i0Var.A(this.n.e(t, S(iP0)));
                                break;
                            case 24:
                                i0Var.k(this.n.e(t, S(iP0)));
                                break;
                            case 25:
                                i0Var.f(this.n.e(t, S(iP0)));
                                break;
                            case 26:
                                j0(t, iP0, i0Var);
                                break;
                            case 27:
                                h0(t, iP0, i0Var, s(iD0), lVar);
                                break;
                            case 28:
                                i0Var.p(this.n.e(t, S(iP0)));
                                break;
                            case 29:
                                i0Var.B(this.n.e(t, S(iP0)));
                                break;
                            case 30:
                                List<Integer> listE = this.n.e(t, S(iP0));
                                i0Var.x(listE);
                                objN = l0.A(iL, listE, q(iD0), objN, n0Var);
                                break;
                            case 31:
                                i0Var.t(this.n.e(t, S(iP0)));
                                break;
                            case 32:
                                i0Var.i(this.n.e(t, S(iP0)));
                                break;
                            case 33:
                                i0Var.g(this.n.e(t, S(iP0)));
                                break;
                            case 34:
                                i0Var.a(this.n.e(t, S(iP0)));
                                break;
                            case 35:
                                i0Var.q(this.n.e(t, S(iP0)));
                                break;
                            case 36:
                                i0Var.n(this.n.e(t, S(iP0)));
                                break;
                            case 37:
                                i0Var.w(this.n.e(t, S(iP0)));
                                break;
                            case 38:
                                i0Var.v(this.n.e(t, S(iP0)));
                                break;
                            case 39:
                                i0Var.j(this.n.e(t, S(iP0)));
                                break;
                            case 40:
                                i0Var.A(this.n.e(t, S(iP0)));
                                break;
                            case 41:
                                i0Var.k(this.n.e(t, S(iP0)));
                                break;
                            case 42:
                                i0Var.f(this.n.e(t, S(iP0)));
                                break;
                            case 43:
                                i0Var.B(this.n.e(t, S(iP0)));
                                break;
                            case 44:
                                List<Integer> listE2 = this.n.e(t, S(iP0));
                                i0Var.x(listE2);
                                objN = l0.A(iL, listE2, q(iD0), objN, n0Var);
                                break;
                            case 45:
                                i0Var.t(this.n.e(t, S(iP0)));
                                break;
                            case 46:
                                i0Var.i(this.n.e(t, S(iP0)));
                                break;
                            case 47:
                                i0Var.g(this.n.e(t, S(iP0)));
                                break;
                            case 48:
                                i0Var.a(this.n.e(t, S(iP0)));
                                break;
                            case 49:
                                g0(t, S(iP0), i0Var, s(iD0), lVar);
                                break;
                            case 50:
                                K(t, iD0, r(iD0), lVar, i0Var);
                                break;
                            case 51:
                                ibq.T(t, S(iP0), Double.valueOf(i0Var.readDouble()));
                                m0(t, iL, iD0);
                                break;
                            case 52:
                                ibq.T(t, S(iP0), Float.valueOf(i0Var.readFloat()));
                                m0(t, iL, iD0);
                                break;
                            case 53:
                                ibq.T(t, S(iP0), Long.valueOf(i0Var.r()));
                                m0(t, iL, iD0);
                                break;
                            case 54:
                                ibq.T(t, S(iP0), Long.valueOf(i0Var.h()));
                                m0(t, iL, iD0);
                                break;
                            case 55:
                                ibq.T(t, S(iP0), Integer.valueOf(i0Var.z()));
                                m0(t, iL, iD0);
                                break;
                            case 56:
                                ibq.T(t, S(iP0), Long.valueOf(i0Var.s()));
                                m0(t, iL, iD0);
                                break;
                            case 57:
                                ibq.T(t, S(iP0), Integer.valueOf(i0Var.C()));
                                m0(t, iL, iD0);
                                break;
                            case 58:
                                ibq.T(t, S(iP0), Boolean.valueOf(i0Var.u()));
                                m0(t, iL, iD0);
                                break;
                            case 59:
                                i0(t, iP0, i0Var);
                                m0(t, iL, iD0);
                                break;
                            case 60:
                                if (F(t, iL, iD0)) {
                                    ibq.T(t, S(iP0), s.h(ibq.E(t, S(iP0)), i0Var.L(s(iD0), lVar)));
                                } else {
                                    ibq.T(t, S(iP0), i0Var.L(s(iD0), lVar));
                                    l0(t, iD0);
                                }
                                m0(t, iL, iD0);
                                break;
                            case 61:
                                ibq.T(t, S(iP0), i0Var.readBytes());
                                m0(t, iL, iD0);
                                break;
                            case 62:
                                ibq.T(t, S(iP0), Integer.valueOf(i0Var.c()));
                                m0(t, iL, iD0);
                                break;
                            case 63:
                                int iD2 = i0Var.d();
                                s.e eVarQ2 = q(iD0);
                                if (eVarQ2 == null || eVarQ2.isInRange(iD2)) {
                                    ibq.T(t, S(iP0), Integer.valueOf(iD2));
                                    m0(t, iL, iD0);
                                } else {
                                    objN = l0.L(iL, iD2, objN, n0Var);
                                }
                                break;
                            case 64:
                                ibq.T(t, S(iP0), Integer.valueOf(i0Var.F()));
                                m0(t, iL, iD0);
                                break;
                            case 65:
                                ibq.T(t, S(iP0), Long.valueOf(i0Var.b()));
                                m0(t, iL, iD0);
                                break;
                            case 66:
                                ibq.T(t, S(iP0), Integer.valueOf(i0Var.e()));
                                m0(t, iL, iD0);
                                break;
                            case 67:
                                ibq.T(t, S(iP0), Long.valueOf(i0Var.D()));
                                m0(t, iL, iD0);
                                break;
                            case 68:
                                ibq.T(t, S(iP0), i0Var.H(s(iD0), lVar));
                                m0(t, iL, iD0);
                                break;
                            default:
                                if (objN == null) {
                                    objN = n0Var.n();
                                }
                                if (!n0Var.m(objN, i0Var)) {
                                    for (int i = this.f9377k; i < this.l; i++) {
                                        objN = n(t, this.j[i], objN, n0Var);
                                    }
                                    if (objN != null) {
                                        n0Var.o(t, objN);
                                        return;
                                    }
                                    return;
                                }
                                break;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!n0Var.q(i0Var)) {
                            if (objN == null) {
                                objN = n0Var.f(t);
                            }
                            if (!n0Var.m(objN, i0Var)) {
                                for (int i2 = this.f9377k; i2 < this.l; i2++) {
                                    objN = n(t, this.j[i2], objN, n0Var);
                                }
                                if (objN != null) {
                                    n0Var.o(t, objN);
                                    return;
                                }
                                return;
                            }
                        } else if (!i0Var.o()) {
                            for (int i3 = this.f9377k; i3 < this.l; i3++) {
                                objN = n(t, this.j[i3], objN, n0Var);
                            }
                            if (objN != null) {
                                n0Var.o(t, objN);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (iL == Integer.MAX_VALUE) {
                        for (int i4 = this.f9377k; i4 < this.l; i4++) {
                            objN = n(t, this.j[i4], objN, n0Var);
                        }
                        if (objN != null) {
                            n0Var.o(t, objN);
                            return;
                        }
                        return;
                    }
                    Object objB = !this.f ? null : mVar.b(lVar, this.e, iL);
                    if (objB != null) {
                        if (objD == null) {
                            objD = mVar.d(t);
                        }
                        objN = mVar.g(i0Var, objB, lVar, objD, objN, n0Var);
                    } else if (!n0Var.q(i0Var)) {
                        if (objN == null) {
                            objN = n0Var.f(t);
                        }
                        if (n0Var.m(objN, i0Var)) {
                        }
                    } else if (i0Var.o()) {
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.f9377k; i5 < this.l; i5++) {
                    objN = n(t, this.j[i5], objN, n0Var);
                }
                if (objN != null) {
                    n0Var.o(t, objN);
                }
                throw th;
            }
        }
        for (int i6 = this.f9377k; i6 < this.l; i6++) {
            objN = n(t, this.j[i6], objN, n0Var);
        }
        if (objN != null) {
            n0Var.o(t, objN);
        }
    }

    public final <K, V> void K(Object obj, int i, Object obj2, l lVar, i0 i0Var) throws IOException {
        long jS = S(p0(i));
        Object objE = ibq.E(obj, jS);
        if (objE == null) {
            objE = this.q.f(obj2);
            ibq.T(obj, jS, objE);
        } else if (this.q.h(objE)) {
            Object objF = this.q.f(obj2);
            this.q.a(objF, objE);
            ibq.T(obj, jS, objF);
            objE = objF;
        }
        Map<?, ?> mapE = this.q.e(objE);
        this.q.b(obj2);
        i0Var.J(mapE, null, lVar);
    }

    public final void L(T t, T t2, int i) {
        long jS = S(p0(i));
        if (z(t2, i)) {
            Object objE = ibq.E(t, jS);
            Object objE2 = ibq.E(t2, jS);
            if (objE != null && objE2 != null) {
                ibq.T(t, jS, s.h(objE, objE2));
                l0(t, i);
            } else if (objE2 != null) {
                ibq.T(t, jS, objE2);
                l0(t, i);
            }
        }
    }

    public final void M(T t, T t2, int i) {
        int iP0 = p0(i);
        int iR = R(i);
        long jS = S(iP0);
        if (F(t2, iR, i)) {
            Object objE = ibq.E(t, jS);
            Object objE2 = ibq.E(t2, jS);
            if (objE != null && objE2 != null) {
                ibq.T(t, jS, s.h(objE, objE2));
                m0(t, iR, i);
            } else if (objE2 != null) {
                ibq.T(t, jS, objE2);
                m0(t, iR, i);
            }
        }
    }

    public final void N(T t, T t2, int i) {
        int iP0 = p0(i);
        long jS = S(iP0);
        int iR = R(i);
        switch (o0(iP0)) {
            case 0:
                if (z(t2, i)) {
                    ibq.P(t, jS, ibq.y(t2, jS));
                    l0(t, i);
                }
                break;
            case 1:
                if (z(t2, i)) {
                    ibq.Q(t, jS, ibq.z(t2, jS));
                    l0(t, i);
                }
                break;
            case 2:
                if (z(t2, i)) {
                    ibq.S(t, jS, ibq.C(t2, jS));
                    l0(t, i);
                }
                break;
            case 3:
                if (z(t2, i)) {
                    ibq.S(t, jS, ibq.C(t2, jS));
                    l0(t, i);
                }
                break;
            case 4:
                if (z(t2, i)) {
                    ibq.R(t, jS, ibq.A(t2, jS));
                    l0(t, i);
                }
                break;
            case 5:
                if (z(t2, i)) {
                    ibq.S(t, jS, ibq.C(t2, jS));
                    l0(t, i);
                }
                break;
            case 6:
                if (z(t2, i)) {
                    ibq.R(t, jS, ibq.A(t2, jS));
                    l0(t, i);
                }
                break;
            case 7:
                if (z(t2, i)) {
                    ibq.J(t, jS, ibq.r(t2, jS));
                    l0(t, i);
                }
                break;
            case 8:
                if (z(t2, i)) {
                    ibq.T(t, jS, ibq.E(t2, jS));
                    l0(t, i);
                }
                break;
            case 9:
                L(t, t2, i);
                break;
            case 10:
                if (z(t2, i)) {
                    ibq.T(t, jS, ibq.E(t2, jS));
                    l0(t, i);
                }
                break;
            case 11:
                if (z(t2, i)) {
                    ibq.R(t, jS, ibq.A(t2, jS));
                    l0(t, i);
                }
                break;
            case 12:
                if (z(t2, i)) {
                    ibq.R(t, jS, ibq.A(t2, jS));
                    l0(t, i);
                }
                break;
            case 13:
                if (z(t2, i)) {
                    ibq.R(t, jS, ibq.A(t2, jS));
                    l0(t, i);
                }
                break;
            case 14:
                if (z(t2, i)) {
                    ibq.S(t, jS, ibq.C(t2, jS));
                    l0(t, i);
                }
                break;
            case 15:
                if (z(t2, i)) {
                    ibq.R(t, jS, ibq.A(t2, jS));
                    l0(t, i);
                }
                break;
            case 16:
                if (z(t2, i)) {
                    ibq.S(t, jS, ibq.C(t2, jS));
                    l0(t, i);
                }
                break;
            case 17:
                L(t, t2, i);
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
                this.n.d(t, t2, jS);
                break;
            case 50:
                l0.F(this.q, t, t2, jS);
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
                if (F(t2, iR, i)) {
                    ibq.T(t, jS, ibq.E(t2, jS));
                    m0(t, iR, i);
                }
                break;
            case 60:
                M(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (F(t2, iR, i)) {
                    ibq.T(t, jS, ibq.E(t2, jS));
                    m0(t, iR, i);
                }
                break;
            case 68:
                M(t, t2, i);
                break;
        }
    }

    public final int R(int i) {
        return this.f9375a[i];
    }

    public final <K, V> int Y(T t, byte[] bArr, int i, int i2, int i3, long j, d.b bVar) throws IOException {
        Unsafe unsafe = s;
        Object objR = r(i3);
        Object object = unsafe.getObject(t, j);
        if (this.q.h(object)) {
            Object objF = this.q.f(objR);
            this.q.a(objF, object);
            unsafe.putObject(t, j, objF);
            object = objF;
        }
        this.q.b(objR);
        return k(bArr, i, i2, null, this.q.e(object), bVar);
    }

    public final int Z(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, d.b bVar) throws IOException {
        Unsafe unsafe = s;
        long j2 = this.f9375a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(d.d(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(d.l(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iL = d.L(bArr, i, bVar);
                unsafe.putObject(t, j, Long.valueOf(bVar.f9373b));
                unsafe.putInt(t, j2, i4);
                return iL;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int I = d.I(bArr, i, bVar);
                unsafe.putObject(t, j, Integer.valueOf(bVar.f9372a));
                unsafe.putInt(t, j2, i4);
                return I;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(d.j(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(d.h(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iL2 = d.L(bArr, i, bVar);
                unsafe.putObject(t, j, Boolean.valueOf(bVar.f9373b != 0));
                unsafe.putInt(t, j2, i4);
                return iL2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int I2 = d.I(bArr, i, bVar);
                int i13 = bVar.f9372a;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !q0.t(bArr, I2, I2 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t, j, new String(bArr, I2, i13, s.f9434a));
                    I2 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return I2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iP = d.p(s(i8), bArr, i, i2, bVar);
                Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, bVar.c);
                } else {
                    unsafe.putObject(t, j, s.h(object, bVar.c));
                }
                unsafe.putInt(t, j2, i4);
                return iP;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iB = d.b(bArr, i, bVar);
                unsafe.putObject(t, j, bVar.c);
                unsafe.putInt(t, j2, i4);
                return iB;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int I3 = d.I(bArr, i, bVar);
                int i14 = bVar.f9372a;
                s.e eVarQ = q(i8);
                if (eVarQ == null || eVarQ.isInRange(i14)) {
                    unsafe.putObject(t, j, Integer.valueOf(i14));
                    unsafe.putInt(t, j2, i4);
                } else {
                    t(t).n(i3, Long.valueOf(i14));
                }
                return I3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int I4 = d.I(bArr, i, bVar);
                unsafe.putObject(t, j, Integer.valueOf(g.b(bVar.f9372a)));
                unsafe.putInt(t, j2, i4);
                return I4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iL3 = d.L(bArr, i, bVar);
                unsafe.putObject(t, j, Long.valueOf(g.c(bVar.f9373b)));
                unsafe.putInt(t, j2, i4);
                return iL3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                int iN = d.n(s(i8), bArr, i, i2, (i3 & (-8)) | 4, bVar);
                Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object2 == null) {
                    unsafe.putObject(t, j, bVar.c);
                } else {
                    unsafe.putObject(t, j, s.h(object2, bVar.c));
                }
                unsafe.putInt(t, j2, i4);
                return iN;
            default:
                return i;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public void a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f9375a.length; i += 3) {
            N(t, t2, i);
        }
        l0.G(this.o, t, t2);
        if (this.f) {
            l0.E(this.p, t, t2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0353 A[PHI: r0 r19 r25 r27
      0x0353: PHI (r0v27 int) = (r0v21 int), (r0v24 int), (r0v29 int) binds: [B:132:0x03c4, B:128:0x03a1, B:119:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r19v6 int) = (r19v4 int), (r19v4 int), (r19v7 int) binds: [B:132:0x03c4, B:128:0x03a1, B:119:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r25v2 int) = (r25v0 int), (r25v0 int), (r25v4 int) binds: [B:132:0x03c4, B:128:0x03a1, B:119:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r27v7 sun.misc.Unsafe) = (r27v5 sun.misc.Unsafe), (r27v5 sun.misc.Unsafe), (r27v8 sun.misc.Unsafe) binds: [B:132:0x03c4, B:128:0x03a1, B:119:0x0351] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x036d A[PHI: r0 r19 r25 r27
      0x036d: PHI (r0v25 int) = (r0v21 int), (r0v24 int), (r0v29 int) binds: [B:132:0x03c4, B:128:0x03a1, B:119:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x036d: PHI (r19v5 int) = (r19v4 int), (r19v4 int), (r19v7 int) binds: [B:132:0x03c4, B:128:0x03a1, B:119:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x036d: PHI (r25v1 int) = (r25v0 int), (r25v0 int), (r25v4 int) binds: [B:132:0x03c4, B:128:0x03a1, B:119:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x036d: PHI (r27v6 sun.misc.Unsafe) = (r27v5 sun.misc.Unsafe), (r27v5 sun.misc.Unsafe), (r27v8 sun.misc.Unsafe) binds: [B:132:0x03c4, B:128:0x03a1, B:119:0x0351] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x008d. Please report as an issue. */
    public int a0(T t, byte[] bArr, int i, int i2, int i3, d.b bVar) throws IOException {
        Unsafe unsafe;
        int i4;
        d0<T> d0Var;
        T t2;
        int i5;
        int iH;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        byte b2;
        int i15;
        int i16;
        int i17;
        int iL;
        int i18;
        d0<T> d0Var2 = this;
        t = t;
        bArr = bArr;
        i2 = i2;
        i3 = i3;
        d.b bVar2 = bVar;
        Unsafe unsafe2 = s;
        int iG = i;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -1;
        int i23 = -1;
        while (true) {
            if (iG < i2) {
                int i24 = iG + 1;
                byte b3 = bArr[iG];
                if (b3 < 0) {
                    iH = d.H(b3, bArr, i24, bVar2);
                    i5 = bVar2.f9372a;
                } else {
                    i5 = b3;
                    iH = i24;
                }
                int i25 = i5 >>> 3;
                int i26 = i5 & 7;
                int iE0 = i25 > i22 ? d0Var2.e0(i25, i19 / 3) : d0Var2.d0(i25);
                if (iE0 == -1) {
                    i6 = i25;
                    i7 = iH;
                    i8 = i5;
                    i9 = i21;
                    i10 = i23;
                    unsafe = unsafe2;
                    i11 = i3;
                    i12 = 0;
                } else {
                    int i27 = d0Var2.f9375a[iE0 + 1];
                    int iO0 = o0(i27);
                    long jS = S(i27);
                    int i28 = i5;
                    if (iO0 <= 17) {
                        int i29 = d0Var2.f9375a[iE0 + 2];
                        int i30 = 1 << (i29 >>> 20);
                        int i31 = i29 & 1048575;
                        if (i31 != i23) {
                            b2 = -1;
                            if (i23 != -1) {
                                unsafe2.putInt(t, i23, i21);
                            }
                            i21 = unsafe2.getInt(t, i31);
                            i23 = i31;
                        } else {
                            b2 = -1;
                        }
                        switch (iO0) {
                            case 0:
                                i15 = iE0;
                                i6 = i25;
                                bArr = bArr;
                                i16 = iH;
                                i17 = i28;
                                if (i26 == 1) {
                                    ibq.P(t, jS, d.d(bArr, i16));
                                    iG = i16 + 8;
                                    i21 |= i30;
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i2;
                                } else {
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 1:
                                i15 = iE0;
                                i6 = i25;
                                bArr = bArr;
                                i16 = iH;
                                i17 = i28;
                                if (i26 == 5) {
                                    ibq.Q(t, jS, d.l(bArr, i16));
                                    iG = i16 + 4;
                                    i21 |= i30;
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i2;
                                } else {
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 2:
                            case 3:
                                i15 = iE0;
                                i6 = i25;
                                bArr = bArr;
                                i16 = iH;
                                i17 = i28;
                                if (i26 == 0) {
                                    iL = d.L(bArr, i16, bVar2);
                                    unsafe2.putLong(t, jS, bVar2.f9373b);
                                    i21 |= i30;
                                    i19 = i15;
                                    iG = iL;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i2;
                                    i3 = i3;
                                } else {
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 4:
                            case 11:
                                i15 = iE0;
                                i6 = i25;
                                bArr = bArr;
                                i16 = iH;
                                i17 = i28;
                                if (i26 == 0) {
                                    iG = d.I(bArr, i16, bVar2);
                                    unsafe2.putInt(t, jS, bVar2.f9372a);
                                    i21 |= i30;
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i2;
                                } else {
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 5:
                            case 14:
                                i15 = iE0;
                                i6 = i25;
                                bArr = bArr;
                                i17 = i28;
                                if (i26 == 1) {
                                    i16 = iH;
                                    unsafe2.putLong(t, jS, d.j(bArr, iH));
                                    iG = i16 + 8;
                                    i21 |= i30;
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i2;
                                } else {
                                    i16 = iH;
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 6:
                            case 13:
                                i15 = iE0;
                                i6 = i25;
                                bArr = bArr;
                                i18 = i2;
                                i17 = i28;
                                if (i26 == 5) {
                                    unsafe2.putInt(t, jS, d.h(bArr, iH));
                                    iG = iH + 4;
                                    i21 |= i30;
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i18;
                                    i3 = i3;
                                } else {
                                    i16 = iH;
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 7:
                                i15 = iE0;
                                i6 = i25;
                                bArr = bArr;
                                i18 = i2;
                                i17 = i28;
                                if (i26 == 0) {
                                    iG = d.L(bArr, iH, bVar2);
                                    ibq.J(t, jS, bVar2.f9373b != 0);
                                    i21 |= i30;
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i18;
                                    i3 = i3;
                                } else {
                                    i16 = iH;
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 8:
                                i15 = iE0;
                                i6 = i25;
                                bArr = bArr;
                                i18 = i2;
                                i17 = i28;
                                if (i26 == 2) {
                                    iG = (i27 & 536870912) == 0 ? d.C(bArr, iH, bVar2) : d.F(bArr, iH, bVar2);
                                    unsafe2.putObject(t, jS, bVar2.c);
                                    i21 |= i30;
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i18;
                                    i3 = i3;
                                } else {
                                    i16 = iH;
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 9:
                                i15 = iE0;
                                i17 = i28;
                                i6 = i25;
                                bArr = bArr;
                                if (i26 == 2) {
                                    i18 = i2;
                                    iG = d.p(d0Var2.s(i15), bArr, iH, i18, bVar2);
                                    if ((i21 & i30) == 0) {
                                        unsafe2.putObject(t, jS, bVar2.c);
                                    } else {
                                        unsafe2.putObject(t, jS, s.h(unsafe2.getObject(t, jS), bVar2.c));
                                    }
                                    i21 |= i30;
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i18;
                                    i3 = i3;
                                } else {
                                    i16 = iH;
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 10:
                                i15 = iE0;
                                i17 = i28;
                                i6 = i25;
                                bArr = bArr;
                                if (i26 == 2) {
                                    iG = d.b(bArr, iH, bVar2);
                                    unsafe2.putObject(t, jS, bVar2.c);
                                    i21 |= i30;
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i2;
                                } else {
                                    i16 = iH;
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 12:
                                i15 = iE0;
                                i17 = i28;
                                i6 = i25;
                                bArr = bArr;
                                if (i26 == 0) {
                                    iG = d.I(bArr, iH, bVar2);
                                    int i32 = bVar2.f9372a;
                                    s.e eVarQ = d0Var2.q(i15);
                                    if (eVarQ == null || eVarQ.isInRange(i32)) {
                                        unsafe2.putInt(t, jS, i32);
                                        i21 |= i30;
                                    } else {
                                        t(t).n(i17, Long.valueOf(i32));
                                    }
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i2;
                                } else {
                                    i16 = iH;
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 15:
                                i15 = iE0;
                                i17 = i28;
                                i6 = i25;
                                bArr = bArr;
                                if (i26 == 0) {
                                    iG = d.I(bArr, iH, bVar2);
                                    unsafe2.putInt(t, jS, g.b(bVar2.f9372a));
                                    i21 |= i30;
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i2;
                                } else {
                                    i16 = iH;
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 16:
                                i15 = iE0;
                                i17 = i28;
                                i6 = i25;
                                if (i26 == 0) {
                                    bArr = bArr;
                                    iL = d.L(bArr, iH, bVar2);
                                    unsafe2.putLong(t, jS, g.c(bVar2.f9373b));
                                    i21 |= i30;
                                    i19 = i15;
                                    iG = iL;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i2;
                                    i3 = i3;
                                } else {
                                    i16 = iH;
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            case 17:
                                if (i26 == 3) {
                                    i15 = iE0;
                                    i6 = i25;
                                    i17 = i28;
                                    iG = d.n(d0Var2.s(iE0), bArr, iH, i2, (i25 << 3) | 4, bVar);
                                    if ((i21 & i30) == 0) {
                                        unsafe2.putObject(t, jS, bVar2.c);
                                    } else {
                                        unsafe2.putObject(t, jS, s.h(unsafe2.getObject(t, jS), bVar2.c));
                                    }
                                    i21 |= i30;
                                    bArr = bArr;
                                    i19 = i15;
                                    i20 = i17;
                                    i22 = i6;
                                    i2 = i2;
                                } else {
                                    i15 = iE0;
                                    i17 = i28;
                                    i6 = i25;
                                    i16 = iH;
                                    i11 = i3;
                                    i9 = i21;
                                    i10 = i23;
                                    i12 = i15;
                                    unsafe = unsafe2;
                                    i7 = i16;
                                    i8 = i17;
                                }
                                break;
                            default:
                                i16 = iH;
                                i15 = iE0;
                                i6 = i25;
                                i17 = i28;
                                i11 = i3;
                                i9 = i21;
                                i10 = i23;
                                i12 = i15;
                                unsafe = unsafe2;
                                i7 = i16;
                                i8 = i17;
                                break;
                        }
                    } else {
                        i6 = i25;
                        bArr = bArr;
                        int i33 = iH;
                        if (iO0 != 27) {
                            i12 = iE0;
                            i9 = i21;
                            if (iO0 <= 49) {
                                i10 = i23;
                                unsafe = unsafe2;
                                i14 = i28;
                                iG = c0(t, bArr, i33, i2, i28, i6, i26, i12, i27, iO0, jS, bVar);
                                if (iG != i33) {
                                    d0Var2 = this;
                                    i3 = i3;
                                    bVar2 = bVar;
                                    i22 = i6;
                                    i23 = i10;
                                    i19 = i12;
                                    i21 = i9;
                                    i20 = i14;
                                } else {
                                    i7 = iG;
                                    i8 = i14;
                                    i11 = i3;
                                }
                                unsafe2 = unsafe;
                            } else {
                                unsafe = unsafe2;
                                i13 = i33;
                                i14 = i28;
                                i10 = i23;
                                if (iO0 != 50) {
                                    iG = Z(t, bArr, i13, i2, i14, i6, i26, i27, iO0, jS, i12, bVar);
                                    if (iG != i13) {
                                        d0Var2 = this;
                                        i3 = i3;
                                        bVar2 = bVar;
                                        i22 = i6;
                                        i23 = i10;
                                        i19 = i12;
                                        i21 = i9;
                                        i20 = i14;
                                    } else {
                                        i7 = iG;
                                        i8 = i14;
                                        i11 = i3;
                                    }
                                    unsafe2 = unsafe;
                                } else if (i26 == 2) {
                                    iG = Y(t, bArr, i13, i2, i12, jS, bVar);
                                    if (iG != i13) {
                                        d0Var2 = this;
                                        i3 = i3;
                                        bVar2 = bVar;
                                        i22 = i6;
                                        i23 = i10;
                                        i19 = i12;
                                        i21 = i9;
                                        i20 = i14;
                                    } else {
                                        i7 = iG;
                                        i8 = i14;
                                        i11 = i3;
                                    }
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i26 == 2) {
                            s.i iVarA = (s.i) unsafe2.getObject(t, jS);
                            if (!iVarA.c()) {
                                int size = iVarA.size();
                                iVarA = iVarA.a(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t, jS, iVarA);
                            }
                            iG = d.q(d0Var2.s(iE0), i28, bArr, i33, i2, iVarA, bVar);
                            i20 = i28;
                            i22 = i6;
                            i19 = iE0;
                            i21 = i21;
                            i2 = i2;
                        } else {
                            i12 = iE0;
                            i9 = i21;
                            i10 = i23;
                            unsafe = unsafe2;
                            i13 = i33;
                            i14 = i28;
                        }
                        i11 = i3;
                        i7 = i13;
                        i8 = i14;
                    }
                }
                if (i8 != i11 || i11 == 0) {
                    int i34 = i11;
                    iG = (!this.f || bVar.d == l.b()) ? d.G(i8, bArr, i7, i2, t(t), bVar) : d.g(i8, bArr, i7, i2, t, this.e, this.o, bVar);
                    i20 = i8;
                    d0Var2 = this;
                    bVar2 = bVar;
                    i22 = i6;
                    i23 = i10;
                    i19 = i12;
                    i21 = i9;
                    i3 = i34;
                    unsafe2 = unsafe;
                } else {
                    d0Var = this;
                    i4 = i11;
                    iG = i7;
                    i20 = i8;
                    i23 = i10;
                    i21 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i3;
                d0Var = d0Var2;
            }
        }
        if (i23 != -1) {
            t2 = t;
            unsafe.putInt(t2, i23, i21);
        } else {
            t2 = t;
        }
        o0 o0Var = null;
        for (int i35 = d0Var.f9377k; i35 < d0Var.l; i35++) {
            o0Var = (o0) d0Var.n(t2, d0Var.j[i35], o0Var, d0Var.o);
        }
        if (o0Var != null) {
            d0Var.o.o(t2, o0Var);
        }
        if (i4 == 0) {
            if (iG != i2) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (iG > i2 || i20 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return iG;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:58:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0090 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final boolean b(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9377k; i4++) {
            int i5 = this.j[i4];
            int iR = R(i5);
            int iP0 = p0(i5);
            if (this.h) {
                i = 0;
            } else {
                int i6 = this.f9375a[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = s.getInt(t, i7);
                    i2 = i7;
                }
            }
            if (G(iP0) && !A(t, i5, i3, i)) {
                return false;
            }
            int iO0 = o0(iP0);
            if (iO0 == 9 || iO0 == 17) {
                if (A(t, i5, i3, i) && !B(t, iP0, s(i5))) {
                    return false;
                }
            } else if (iO0 == 27) {
                if (!C(t, iP0, i5)) {
                    return false;
                }
            } else if (iO0 == 60 || iO0 == 68) {
                if (F(t, iR, i5) && !B(t, iP0, s(i5))) {
                    return false;
                }
            } else if (iO0 != 49) {
                if (iO0 == 50 && !D(t, iP0, i5)) {
                    return false;
                }
            } else if (!C(t, iP0, i5)) {
                return false;
            }
        }
        return !this.f || this.p.c(t).o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x023e, code lost:
    
        if (r0 != r15) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01dd, code lost:
    
        if (r0 != r15) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f3, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x021f, code lost:
    
        if (r0 != r15) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x005d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b0(T r28, byte[] r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.d.b r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.d0.b0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.d$b):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public void c(T t) {
        int i;
        int i2 = this.f9377k;
        while (true) {
            i = this.l;
            if (i2 >= i) {
                break;
            }
            long jS = S(p0(this.j[i2]));
            Object objE = ibq.E(t, jS);
            if (objE != null) {
                ibq.T(t, jS, this.q.c(objE));
            }
            i2++;
        }
        int length = this.j.length;
        while (i < length) {
            this.n.c(t, this.j[i]);
            i++;
        }
        this.o.j(t);
        if (this.f) {
            this.p.f(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int c0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, d.b bVar) throws IOException {
        int iJ;
        Unsafe unsafe = s;
        s.i iVarA = (s.i) unsafe.getObject(t, j2);
        if (!iVarA.c()) {
            int size = iVarA.size();
            iVarA = iVarA.a(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, iVarA);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return d.s(bArr, i, iVarA, bVar);
                }
                return i5 == 1 ? d.e(i3, bArr, i, i2, iVarA, bVar) : i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return d.v(bArr, i, iVarA, bVar);
                }
                return i5 == 5 ? d.m(i3, bArr, i, i2, iVarA, bVar) : i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return d.z(bArr, i, iVarA, bVar);
                }
                return i5 == 0 ? d.M(i3, bArr, i, i2, iVarA, bVar) : i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return d.y(bArr, i, iVarA, bVar);
                }
                return i5 == 0 ? d.J(i3, bArr, i, i2, iVarA, bVar) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return d.u(bArr, i, iVarA, bVar);
                }
                return i5 == 1 ? d.k(i3, bArr, i, i2, iVarA, bVar) : i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return d.t(bArr, i, iVarA, bVar);
                }
                return i5 == 5 ? d.i(i3, bArr, i, i2, iVarA, bVar) : i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return d.r(bArr, i, iVarA, bVar);
                }
                return i5 == 0 ? d.a(i3, bArr, i, i2, iVarA, bVar) : i;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? d.D(i3, bArr, i, i2, iVarA, bVar) : d.E(i3, bArr, i, i2, iVarA, bVar);
                }
                return i;
            case 27:
                return i5 == 2 ? d.q(s(i6), i3, bArr, i, i2, iVarA, bVar) : i;
            case 28:
                return i5 == 2 ? d.c(i3, bArr, i, i2, iVarA, bVar) : i;
            case 30:
            case 44:
                if (i5 == 2) {
                    iJ = d.y(bArr, i, iVarA, bVar);
                } else {
                    if (i5 != 0) {
                        return i;
                    }
                    iJ = d.J(i3, bArr, i, i2, iVarA, bVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                o0 o0Var = generatedMessageLite.unknownFields;
                if (o0Var == o0.e()) {
                    o0Var = null;
                }
                o0 o0Var2 = (o0) l0.A(i4, iVarA, q(i6), o0Var, this.o);
                if (o0Var2 != null) {
                    generatedMessageLite.unknownFields = o0Var2;
                }
                return iJ;
            case 33:
            case 47:
                if (i5 == 2) {
                    return d.w(bArr, i, iVarA, bVar);
                }
                return i5 == 0 ? d.A(i3, bArr, i, i2, iVarA, bVar) : i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return d.x(bArr, i, iVarA, bVar);
                }
                return i5 == 0 ? d.B(i3, bArr, i, i2, iVarA, bVar) : i;
            case 49:
                return i5 == 3 ? d.o(s(i6), i3, bArr, i, i2, iVarA, bVar) : i;
            default:
                return i;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public int d(T t) {
        return this.h ? v(t) : u(t);
    }

    public final int d0(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return n0(i, 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public T e() {
        return (T) this.m.a(this.e);
    }

    public final int e0(int i, int i2) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return n0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public boolean equals(T t, T t2) {
        int length = this.f9375a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m(t, t2, i)) {
                return false;
            }
        }
        if (!this.o.g(t).equals(this.o.g(t2))) {
            return false;
        }
        if (this.f) {
            return this.p.c(t).equals(this.p.c(t2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public void f(T t, byte[] bArr, int i, int i2, d.b bVar) throws IOException {
        if (this.h) {
            b0(t, bArr, i, i2, bVar);
        } else {
            a0(t, bArr, i, i2, 0, bVar);
        }
    }

    public final int f0(int i) {
        return this.f9375a[i + 2];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public void g(T t, i0 i0Var, l lVar) throws IOException {
        lVar.getClass();
        J(this.o, this.p, t, i0Var, lVar);
    }

    public final <E> void g0(Object obj, long j, i0 i0Var, k0<E> k0Var, l lVar) throws IOException {
        i0Var.N(this.n.e(obj, j), k0Var, lVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public void h(T t, Writer writer) throws IOException {
        if (writer.B() == Writer.FieldOrder.DESCENDING) {
            s0(t, writer);
        } else if (this.h) {
            r0(t, writer);
        } else {
            q0(t, writer);
        }
    }

    public final <E> void h0(Object obj, int i, i0 i0Var, k0<E> k0Var, l lVar) throws IOException {
        i0Var.K(this.n.e(obj, S(i)), k0Var, lVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public int hashCode(T t) {
        int i;
        int iF;
        int length = this.f9375a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iP0 = p0(i3);
            int iR = R(i3);
            long jS = S(iP0);
            int iHashCode = 37;
            switch (o0(iP0)) {
                case 0:
                    i = i2 * 53;
                    iF = s.f(Double.doubleToLongBits(ibq.y(t, jS)));
                    i2 = i + iF;
                    break;
                case 1:
                    i = i2 * 53;
                    iF = Float.floatToIntBits(ibq.z(t, jS));
                    i2 = i + iF;
                    break;
                case 2:
                    i = i2 * 53;
                    iF = s.f(ibq.C(t, jS));
                    i2 = i + iF;
                    break;
                case 3:
                    i = i2 * 53;
                    iF = s.f(ibq.C(t, jS));
                    i2 = i + iF;
                    break;
                case 4:
                    i = i2 * 53;
                    iF = ibq.A(t, jS);
                    i2 = i + iF;
                    break;
                case 5:
                    i = i2 * 53;
                    iF = s.f(ibq.C(t, jS));
                    i2 = i + iF;
                    break;
                case 6:
                    i = i2 * 53;
                    iF = ibq.A(t, jS);
                    i2 = i + iF;
                    break;
                case 7:
                    i = i2 * 53;
                    iF = s.c(ibq.r(t, jS));
                    i2 = i + iF;
                    break;
                case 8:
                    i = i2 * 53;
                    iF = ((String) ibq.E(t, jS)).hashCode();
                    i2 = i + iF;
                    break;
                case 9:
                    Object objE = ibq.E(t, jS);
                    if (objE != null) {
                        iHashCode = objE.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iF = ibq.E(t, jS).hashCode();
                    i2 = i + iF;
                    break;
                case 11:
                    i = i2 * 53;
                    iF = ibq.A(t, jS);
                    i2 = i + iF;
                    break;
                case 12:
                    i = i2 * 53;
                    iF = ibq.A(t, jS);
                    i2 = i + iF;
                    break;
                case 13:
                    i = i2 * 53;
                    iF = ibq.A(t, jS);
                    i2 = i + iF;
                    break;
                case 14:
                    i = i2 * 53;
                    iF = s.f(ibq.C(t, jS));
                    i2 = i + iF;
                    break;
                case 15:
                    i = i2 * 53;
                    iF = ibq.A(t, jS);
                    i2 = i + iF;
                    break;
                case 16:
                    i = i2 * 53;
                    iF = s.f(ibq.C(t, jS));
                    i2 = i + iF;
                    break;
                case 17:
                    Object objE2 = ibq.E(t, jS);
                    if (objE2 != null) {
                        iHashCode = objE2.hashCode();
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
                    iF = ibq.E(t, jS).hashCode();
                    i2 = i + iF;
                    break;
                case 50:
                    i = i2 * 53;
                    iF = ibq.E(t, jS).hashCode();
                    i2 = i + iF;
                    break;
                case 51:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = s.f(Double.doubleToLongBits(U(t, jS)));
                        i2 = i + iF;
                    }
                    break;
                case 52:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = Float.floatToIntBits(V(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 53:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = s.f(X(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 54:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = s.f(X(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 55:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 56:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = s.f(X(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 57:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 58:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = s.c(T(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 59:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = ((String) ibq.E(t, jS)).hashCode();
                        i2 = i + iF;
                    }
                    break;
                case 60:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = ibq.E(t, jS).hashCode();
                        i2 = i + iF;
                    }
                    break;
                case 61:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = ibq.E(t, jS).hashCode();
                        i2 = i + iF;
                    }
                    break;
                case 62:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 63:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 64:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 65:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = s.f(X(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 66:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = W(t, jS);
                        i2 = i + iF;
                    }
                    break;
                case 67:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = s.f(X(t, jS));
                        i2 = i + iF;
                    }
                    break;
                case 68:
                    if (F(t, iR, i3)) {
                        i = i2 * 53;
                        iF = ibq.E(t, jS).hashCode();
                        i2 = i + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.o.g(t).hashCode();
        return this.f ? (iHashCode2 * 53) + this.p.c(t).hashCode() : iHashCode2;
    }

    public final boolean i(T t, T t2, int i) {
        return z(t, i) == z(t2, i);
    }

    public final void i0(Object obj, int i, i0 i0Var) throws IOException {
        if (y(i)) {
            ibq.T(obj, S(i), i0Var.G());
        } else if (this.g) {
            ibq.T(obj, S(i), i0Var.E());
        } else {
            ibq.T(obj, S(i), i0Var.readBytes());
        }
    }

    public final void j0(Object obj, int i, i0 i0Var) throws IOException {
        if (y(i)) {
            i0Var.y(this.n.e(obj, S(i)));
        } else {
            i0Var.m(this.n.e(obj, S(i)));
        }
    }

    public final <K, V> int k(byte[] bArr, int i, int i2, y.a<K, V> aVar, Map<K, V> map, d.b bVar) throws IOException {
        int I = d.I(bArr, i, bVar);
        int i3 = bVar.f9372a;
        if (i3 < 0 || i3 > i2 - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw null;
    }

    public final void l0(T t, int i) {
        if (this.h) {
            return;
        }
        int iF0 = f0(i);
        long j = iF0 & 1048575;
        ibq.R(t, j, ibq.A(t, j) | (1 << (iF0 >>> 20)));
    }

    public final boolean m(T t, T t2, int i) {
        int iP0 = p0(i);
        long jS = S(iP0);
        switch (o0(iP0)) {
            case 0:
                return i(t, t2, i) && Double.doubleToLongBits(ibq.y(t, jS)) == Double.doubleToLongBits(ibq.y(t2, jS));
            case 1:
                return i(t, t2, i) && Float.floatToIntBits(ibq.z(t, jS)) == Float.floatToIntBits(ibq.z(t2, jS));
            case 2:
                return i(t, t2, i) && ibq.C(t, jS) == ibq.C(t2, jS);
            case 3:
                return i(t, t2, i) && ibq.C(t, jS) == ibq.C(t2, jS);
            case 4:
                return i(t, t2, i) && ibq.A(t, jS) == ibq.A(t2, jS);
            case 5:
                return i(t, t2, i) && ibq.C(t, jS) == ibq.C(t2, jS);
            case 6:
                return i(t, t2, i) && ibq.A(t, jS) == ibq.A(t2, jS);
            case 7:
                return i(t, t2, i) && ibq.r(t, jS) == ibq.r(t2, jS);
            case 8:
                return i(t, t2, i) && l0.K(ibq.E(t, jS), ibq.E(t2, jS));
            case 9:
                return i(t, t2, i) && l0.K(ibq.E(t, jS), ibq.E(t2, jS));
            case 10:
                return i(t, t2, i) && l0.K(ibq.E(t, jS), ibq.E(t2, jS));
            case 11:
                return i(t, t2, i) && ibq.A(t, jS) == ibq.A(t2, jS);
            case 12:
                return i(t, t2, i) && ibq.A(t, jS) == ibq.A(t2, jS);
            case 13:
                return i(t, t2, i) && ibq.A(t, jS) == ibq.A(t2, jS);
            case 14:
                return i(t, t2, i) && ibq.C(t, jS) == ibq.C(t2, jS);
            case 15:
                return i(t, t2, i) && ibq.A(t, jS) == ibq.A(t2, jS);
            case 16:
                return i(t, t2, i) && ibq.C(t, jS) == ibq.C(t2, jS);
            case 17:
                return i(t, t2, i) && l0.K(ibq.E(t, jS), ibq.E(t2, jS));
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
                return l0.K(ibq.E(t, jS), ibq.E(t2, jS));
            case 50:
                return l0.K(ibq.E(t, jS), ibq.E(t2, jS));
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
                return E(t, t2, i) && l0.K(ibq.E(t, jS), ibq.E(t2, jS));
            default:
                return true;
        }
    }

    public final void m0(T t, int i, int i2) {
        ibq.R(t, f0(i2) & 1048575, i);
    }

    public final <UT, UB> UB n(Object obj, int i, UB ub, n0<UT, UB> n0Var) {
        s.e eVarQ;
        int iR = R(i);
        Object objE = ibq.E(obj, S(p0(i)));
        return (objE == null || (eVarQ = q(i)) == null) ? ub : (UB) o(i, iR, this.q.e(objE), eVarQ, ub, n0Var);
    }

    public final int n0(int i, int i2) {
        int length = (this.f9375a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iR = R(i4);
            if (i == iR) {
                return i4;
            }
            if (i < iR) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final <K, V, UT, UB> UB o(int i, int i2, Map<K, V> map, s.e eVar, UB ub, n0<UT, UB> n0Var) {
        this.q.b(r(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = n0Var.n();
                }
                ByteString.h hVarNewCodedBuilder = ByteString.newCodedBuilder(y.b(null, next.getKey(), next.getValue()));
                try {
                    y.d(hVarNewCodedBuilder.b(), null, next.getKey(), next.getValue());
                    n0Var.d(ub, i2, hVarNewCodedBuilder.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final int p0(int i) {
        return this.f9375a[i + 1];
    }

    public final s.e q(int i) {
        return (s.e) this.f9376b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void q0(T t, Writer writer) throws IOException {
        Iterator itR;
        Map.Entry<?, ?> entry;
        Map.Entry<?, ?> entry2;
        int i;
        if (this.f) {
            p<T> pVarC = this.p.c(t);
            if (pVarC.m()) {
                itR = null;
                entry = null;
            } else {
                itR = pVarC.r();
                entry = (Map.Entry) itR.next();
            }
        } else {
            itR = null;
            entry = null;
        }
        int length = this.f9375a.length;
        Unsafe unsafe = s;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int iP0 = p0(i3);
            int iR = R(i3);
            int iO0 = o0(iP0);
            if (this.h || iO0 > 17) {
                entry2 = entry;
                i = 0;
            } else {
                int i5 = this.f9375a[i3 + 2];
                int i6 = i5 & 1048575;
                Map.Entry<?, ?> entry3 = entry;
                if (i6 != i2) {
                    i4 = unsafe.getInt(t, i6);
                    i2 = i6;
                }
                i = 1 << (i5 >>> 20);
                entry2 = entry3;
            }
            while (entry2 != null && this.p.a(entry2) <= iR) {
                this.p.j(writer, entry2);
                entry2 = itR.hasNext() ? (Map.Entry) itR.next() : null;
            }
            Map.Entry<?, ?> entry4 = entry2;
            int i7 = length;
            long jS = S(iP0);
            switch (iO0) {
                case 0:
                    if ((i & i4) != 0) {
                        writer.z(iR, l(t, jS));
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 1:
                    if ((i & i4) != 0) {
                        writer.F(iR, p(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 2:
                    if ((i & i4) != 0) {
                        writer.C(iR, unsafe.getLong(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 3:
                    if ((i & i4) != 0) {
                        writer.e(iR, unsafe.getLong(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 4:
                    if ((i & i4) != 0) {
                        writer.g(iR, unsafe.getInt(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 5:
                    if ((i & i4) != 0) {
                        writer.m(iR, unsafe.getLong(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 6:
                    if ((i & i4) != 0) {
                        writer.c(iR, unsafe.getInt(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 7:
                    if ((i & i4) != 0) {
                        writer.n(iR, j(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 8:
                    if ((i & i4) != 0) {
                        u0(iR, unsafe.getObject(t, jS), writer);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 9:
                    if ((i & i4) != 0) {
                        writer.M(iR, unsafe.getObject(t, jS), s(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 10:
                    if ((i & i4) != 0) {
                        writer.O(iR, (ByteString) unsafe.getObject(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 11:
                    if ((i & i4) != 0) {
                        writer.k(iR, unsafe.getInt(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 12:
                    if ((i & i4) != 0) {
                        writer.G(iR, unsafe.getInt(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 13:
                    if ((i & i4) != 0) {
                        writer.o(iR, unsafe.getInt(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 14:
                    if ((i & i4) != 0) {
                        writer.w(iR, unsafe.getLong(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 15:
                    if ((i & i4) != 0) {
                        writer.I(iR, unsafe.getInt(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 16:
                    if ((i & i4) != 0) {
                        writer.j(iR, unsafe.getLong(t, jS));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 17:
                    if ((i & i4) != 0) {
                        writer.K(iR, unsafe.getObject(t, jS), s(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 18:
                    l0.P(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 19:
                    l0.T(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 20:
                    l0.W(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 21:
                    l0.e0(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 22:
                    l0.V(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 23:
                    l0.S(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 24:
                    l0.R(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 25:
                    l0.N(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 26:
                    l0.c0(R(i3), (List) unsafe.getObject(t, jS), writer);
                    break;
                case 27:
                    l0.X(R(i3), (List) unsafe.getObject(t, jS), writer, s(i3));
                    break;
                case 28:
                    l0.O(R(i3), (List) unsafe.getObject(t, jS), writer);
                    break;
                case 29:
                    l0.d0(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 30:
                    l0.Q(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 31:
                    l0.Y(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 32:
                    l0.Z(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 33:
                    l0.a0(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 34:
                    l0.b0(R(i3), (List) unsafe.getObject(t, jS), writer, false);
                    continue;
                    i3 += 3;
                    length = i7;
                    entry = entry4;
                    break;
                case 35:
                    l0.P(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 36:
                    l0.T(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 37:
                    l0.W(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 38:
                    l0.e0(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 39:
                    l0.V(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 40:
                    l0.S(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 41:
                    l0.R(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 42:
                    l0.N(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 43:
                    l0.d0(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 44:
                    l0.Q(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 45:
                    l0.Y(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 46:
                    l0.Z(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 47:
                    l0.a0(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 48:
                    l0.b0(R(i3), (List) unsafe.getObject(t, jS), writer, true);
                    break;
                case 49:
                    l0.U(R(i3), (List) unsafe.getObject(t, jS), writer, s(i3));
                    break;
                case 50:
                    t0(writer, iR, unsafe.getObject(t, jS), i3);
                    break;
                case 51:
                    if (F(t, iR, i3)) {
                        writer.z(iR, U(t, jS));
                    }
                    break;
                case 52:
                    if (F(t, iR, i3)) {
                        writer.F(iR, V(t, jS));
                    }
                    break;
                case 53:
                    if (F(t, iR, i3)) {
                        writer.C(iR, X(t, jS));
                    }
                    break;
                case 54:
                    if (F(t, iR, i3)) {
                        writer.e(iR, X(t, jS));
                    }
                    break;
                case 55:
                    if (F(t, iR, i3)) {
                        writer.g(iR, W(t, jS));
                    }
                    break;
                case 56:
                    if (F(t, iR, i3)) {
                        writer.m(iR, X(t, jS));
                    }
                    break;
                case 57:
                    if (F(t, iR, i3)) {
                        writer.c(iR, W(t, jS));
                    }
                    break;
                case 58:
                    if (F(t, iR, i3)) {
                        writer.n(iR, T(t, jS));
                    }
                    break;
                case 59:
                    if (F(t, iR, i3)) {
                        u0(iR, unsafe.getObject(t, jS), writer);
                    }
                    break;
                case 60:
                    if (F(t, iR, i3)) {
                        writer.M(iR, unsafe.getObject(t, jS), s(i3));
                    }
                    break;
                case 61:
                    if (F(t, iR, i3)) {
                        writer.O(iR, (ByteString) unsafe.getObject(t, jS));
                    }
                    break;
                case 62:
                    if (F(t, iR, i3)) {
                        writer.k(iR, W(t, jS));
                    }
                    break;
                case 63:
                    if (F(t, iR, i3)) {
                        writer.G(iR, W(t, jS));
                    }
                    break;
                case 64:
                    if (F(t, iR, i3)) {
                        writer.o(iR, W(t, jS));
                    }
                    break;
                case 65:
                    if (F(t, iR, i3)) {
                        writer.w(iR, X(t, jS));
                    }
                    break;
                case 66:
                    if (F(t, iR, i3)) {
                        writer.I(iR, W(t, jS));
                    }
                    break;
                case 67:
                    if (F(t, iR, i3)) {
                        writer.j(iR, X(t, jS));
                    }
                    break;
                case 68:
                    if (F(t, iR, i3)) {
                        writer.K(iR, unsafe.getObject(t, jS), s(i3));
                    }
                    break;
            }
            i3 += 3;
            length = i7;
            entry = entry4;
        }
        while (entry != null) {
            this.p.j(writer, entry);
            entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
        }
        v0(this.o, t, writer);
    }

    public final Object r(int i) {
        return this.f9376b[(i / 3) * 2];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final void r0(T t, Writer writer) throws IOException {
        Iterator itR;
        Map.Entry<?, ?> entry;
        if (this.f) {
            p<T> pVarC = this.p.c(t);
            if (pVarC.m()) {
                itR = null;
                entry = null;
            } else {
                itR = pVarC.r();
                entry = (Map.Entry) itR.next();
            }
        } else {
            itR = null;
            entry = null;
        }
        int length = this.f9375a.length;
        for (int i = 0; i < length; i += 3) {
            int iP0 = p0(i);
            int iR = R(i);
            while (entry != null && this.p.a(entry) <= iR) {
                this.p.j(writer, entry);
                entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
            }
            switch (o0(iP0)) {
                case 0:
                    if (z(t, i)) {
                        writer.z(iR, l(t, S(iP0)));
                    }
                    break;
                case 1:
                    if (z(t, i)) {
                        writer.F(iR, p(t, S(iP0)));
                    }
                    break;
                case 2:
                    if (z(t, i)) {
                        writer.C(iR, I(t, S(iP0)));
                    }
                    break;
                case 3:
                    if (z(t, i)) {
                        writer.e(iR, I(t, S(iP0)));
                    }
                    break;
                case 4:
                    if (z(t, i)) {
                        writer.g(iR, x(t, S(iP0)));
                    }
                    break;
                case 5:
                    if (z(t, i)) {
                        writer.m(iR, I(t, S(iP0)));
                    }
                    break;
                case 6:
                    if (z(t, i)) {
                        writer.c(iR, x(t, S(iP0)));
                    }
                    break;
                case 7:
                    if (z(t, i)) {
                        writer.n(iR, j(t, S(iP0)));
                    }
                    break;
                case 8:
                    if (z(t, i)) {
                        u0(iR, ibq.E(t, S(iP0)), writer);
                    }
                    break;
                case 9:
                    if (z(t, i)) {
                        writer.M(iR, ibq.E(t, S(iP0)), s(i));
                    }
                    break;
                case 10:
                    if (z(t, i)) {
                        writer.O(iR, (ByteString) ibq.E(t, S(iP0)));
                    }
                    break;
                case 11:
                    if (z(t, i)) {
                        writer.k(iR, x(t, S(iP0)));
                    }
                    break;
                case 12:
                    if (z(t, i)) {
                        writer.G(iR, x(t, S(iP0)));
                    }
                    break;
                case 13:
                    if (z(t, i)) {
                        writer.o(iR, x(t, S(iP0)));
                    }
                    break;
                case 14:
                    if (z(t, i)) {
                        writer.w(iR, I(t, S(iP0)));
                    }
                    break;
                case 15:
                    if (z(t, i)) {
                        writer.I(iR, x(t, S(iP0)));
                    }
                    break;
                case 16:
                    if (z(t, i)) {
                        writer.j(iR, I(t, S(iP0)));
                    }
                    break;
                case 17:
                    if (z(t, i)) {
                        writer.K(iR, ibq.E(t, S(iP0)), s(i));
                    }
                    break;
                case 18:
                    l0.P(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 19:
                    l0.T(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 20:
                    l0.W(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 21:
                    l0.e0(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 22:
                    l0.V(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 23:
                    l0.S(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 24:
                    l0.R(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 25:
                    l0.N(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 26:
                    l0.c0(R(i), (List) ibq.E(t, S(iP0)), writer);
                    break;
                case 27:
                    l0.X(R(i), (List) ibq.E(t, S(iP0)), writer, s(i));
                    break;
                case 28:
                    l0.O(R(i), (List) ibq.E(t, S(iP0)), writer);
                    break;
                case 29:
                    l0.d0(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 30:
                    l0.Q(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 31:
                    l0.Y(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 32:
                    l0.Z(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 33:
                    l0.a0(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 34:
                    l0.b0(R(i), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 35:
                    l0.P(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 36:
                    l0.T(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 37:
                    l0.W(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 38:
                    l0.e0(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 39:
                    l0.V(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 40:
                    l0.S(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 41:
                    l0.R(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 42:
                    l0.N(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 43:
                    l0.d0(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 44:
                    l0.Q(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 45:
                    l0.Y(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 46:
                    l0.Z(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 47:
                    l0.a0(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 48:
                    l0.b0(R(i), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 49:
                    l0.U(R(i), (List) ibq.E(t, S(iP0)), writer, s(i));
                    break;
                case 50:
                    t0(writer, iR, ibq.E(t, S(iP0)), i);
                    break;
                case 51:
                    if (F(t, iR, i)) {
                        writer.z(iR, U(t, S(iP0)));
                    }
                    break;
                case 52:
                    if (F(t, iR, i)) {
                        writer.F(iR, V(t, S(iP0)));
                    }
                    break;
                case 53:
                    if (F(t, iR, i)) {
                        writer.C(iR, X(t, S(iP0)));
                    }
                    break;
                case 54:
                    if (F(t, iR, i)) {
                        writer.e(iR, X(t, S(iP0)));
                    }
                    break;
                case 55:
                    if (F(t, iR, i)) {
                        writer.g(iR, W(t, S(iP0)));
                    }
                    break;
                case 56:
                    if (F(t, iR, i)) {
                        writer.m(iR, X(t, S(iP0)));
                    }
                    break;
                case 57:
                    if (F(t, iR, i)) {
                        writer.c(iR, W(t, S(iP0)));
                    }
                    break;
                case 58:
                    if (F(t, iR, i)) {
                        writer.n(iR, T(t, S(iP0)));
                    }
                    break;
                case 59:
                    if (F(t, iR, i)) {
                        u0(iR, ibq.E(t, S(iP0)), writer);
                    }
                    break;
                case 60:
                    if (F(t, iR, i)) {
                        writer.M(iR, ibq.E(t, S(iP0)), s(i));
                    }
                    break;
                case 61:
                    if (F(t, iR, i)) {
                        writer.O(iR, (ByteString) ibq.E(t, S(iP0)));
                    }
                    break;
                case 62:
                    if (F(t, iR, i)) {
                        writer.k(iR, W(t, S(iP0)));
                    }
                    break;
                case 63:
                    if (F(t, iR, i)) {
                        writer.G(iR, W(t, S(iP0)));
                    }
                    break;
                case 64:
                    if (F(t, iR, i)) {
                        writer.o(iR, W(t, S(iP0)));
                    }
                    break;
                case 65:
                    if (F(t, iR, i)) {
                        writer.w(iR, X(t, S(iP0)));
                    }
                    break;
                case 66:
                    if (F(t, iR, i)) {
                        writer.I(iR, W(t, S(iP0)));
                    }
                    break;
                case 67:
                    if (F(t, iR, i)) {
                        writer.j(iR, X(t, S(iP0)));
                    }
                    break;
                case 68:
                    if (F(t, iR, i)) {
                        writer.K(iR, ibq.E(t, S(iP0)), s(i));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.p.j(writer, entry);
            entry = itR.hasNext() ? (Map.Entry) itR.next() : null;
        }
        v0(this.o, t, writer);
    }

    public final k0 s(int i) {
        int i2 = (i / 3) * 2;
        k0 k0Var = (k0) this.f9376b[i2];
        if (k0Var != null) {
            return k0Var;
        }
        k0<T> k0VarD = wdi.a().d((Class) this.f9376b[i2 + 1]);
        this.f9376b[i2] = k0VarD;
        return k0VarD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void s0(T t, Writer writer) throws IOException {
        Iterator itG;
        Map.Entry<?, ?> entry;
        v0(this.o, t, writer);
        if (this.f) {
            p<T> pVarC = this.p.c(t);
            if (pVarC.m()) {
                itG = null;
                entry = null;
            } else {
                itG = pVarC.g();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        for (int length = this.f9375a.length - 3; length >= 0; length -= 3) {
            int iP0 = p0(length);
            int iR = R(length);
            while (entry != null && this.p.a(entry) > iR) {
                this.p.j(writer, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            switch (o0(iP0)) {
                case 0:
                    if (z(t, length)) {
                        writer.z(iR, l(t, S(iP0)));
                    }
                    break;
                case 1:
                    if (z(t, length)) {
                        writer.F(iR, p(t, S(iP0)));
                    }
                    break;
                case 2:
                    if (z(t, length)) {
                        writer.C(iR, I(t, S(iP0)));
                    }
                    break;
                case 3:
                    if (z(t, length)) {
                        writer.e(iR, I(t, S(iP0)));
                    }
                    break;
                case 4:
                    if (z(t, length)) {
                        writer.g(iR, x(t, S(iP0)));
                    }
                    break;
                case 5:
                    if (z(t, length)) {
                        writer.m(iR, I(t, S(iP0)));
                    }
                    break;
                case 6:
                    if (z(t, length)) {
                        writer.c(iR, x(t, S(iP0)));
                    }
                    break;
                case 7:
                    if (z(t, length)) {
                        writer.n(iR, j(t, S(iP0)));
                    }
                    break;
                case 8:
                    if (z(t, length)) {
                        u0(iR, ibq.E(t, S(iP0)), writer);
                    }
                    break;
                case 9:
                    if (z(t, length)) {
                        writer.M(iR, ibq.E(t, S(iP0)), s(length));
                    }
                    break;
                case 10:
                    if (z(t, length)) {
                        writer.O(iR, (ByteString) ibq.E(t, S(iP0)));
                    }
                    break;
                case 11:
                    if (z(t, length)) {
                        writer.k(iR, x(t, S(iP0)));
                    }
                    break;
                case 12:
                    if (z(t, length)) {
                        writer.G(iR, x(t, S(iP0)));
                    }
                    break;
                case 13:
                    if (z(t, length)) {
                        writer.o(iR, x(t, S(iP0)));
                    }
                    break;
                case 14:
                    if (z(t, length)) {
                        writer.w(iR, I(t, S(iP0)));
                    }
                    break;
                case 15:
                    if (z(t, length)) {
                        writer.I(iR, x(t, S(iP0)));
                    }
                    break;
                case 16:
                    if (z(t, length)) {
                        writer.j(iR, I(t, S(iP0)));
                    }
                    break;
                case 17:
                    if (z(t, length)) {
                        writer.K(iR, ibq.E(t, S(iP0)), s(length));
                    }
                    break;
                case 18:
                    l0.P(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 19:
                    l0.T(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 20:
                    l0.W(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 21:
                    l0.e0(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 22:
                    l0.V(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 23:
                    l0.S(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 24:
                    l0.R(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 25:
                    l0.N(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 26:
                    l0.c0(R(length), (List) ibq.E(t, S(iP0)), writer);
                    break;
                case 27:
                    l0.X(R(length), (List) ibq.E(t, S(iP0)), writer, s(length));
                    break;
                case 28:
                    l0.O(R(length), (List) ibq.E(t, S(iP0)), writer);
                    break;
                case 29:
                    l0.d0(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 30:
                    l0.Q(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 31:
                    l0.Y(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 32:
                    l0.Z(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 33:
                    l0.a0(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 34:
                    l0.b0(R(length), (List) ibq.E(t, S(iP0)), writer, false);
                    break;
                case 35:
                    l0.P(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 36:
                    l0.T(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 37:
                    l0.W(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 38:
                    l0.e0(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 39:
                    l0.V(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 40:
                    l0.S(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 41:
                    l0.R(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 42:
                    l0.N(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 43:
                    l0.d0(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 44:
                    l0.Q(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 45:
                    l0.Y(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 46:
                    l0.Z(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 47:
                    l0.a0(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 48:
                    l0.b0(R(length), (List) ibq.E(t, S(iP0)), writer, true);
                    break;
                case 49:
                    l0.U(R(length), (List) ibq.E(t, S(iP0)), writer, s(length));
                    break;
                case 50:
                    t0(writer, iR, ibq.E(t, S(iP0)), length);
                    break;
                case 51:
                    if (F(t, iR, length)) {
                        writer.z(iR, U(t, S(iP0)));
                    }
                    break;
                case 52:
                    if (F(t, iR, length)) {
                        writer.F(iR, V(t, S(iP0)));
                    }
                    break;
                case 53:
                    if (F(t, iR, length)) {
                        writer.C(iR, X(t, S(iP0)));
                    }
                    break;
                case 54:
                    if (F(t, iR, length)) {
                        writer.e(iR, X(t, S(iP0)));
                    }
                    break;
                case 55:
                    if (F(t, iR, length)) {
                        writer.g(iR, W(t, S(iP0)));
                    }
                    break;
                case 56:
                    if (F(t, iR, length)) {
                        writer.m(iR, X(t, S(iP0)));
                    }
                    break;
                case 57:
                    if (F(t, iR, length)) {
                        writer.c(iR, W(t, S(iP0)));
                    }
                    break;
                case 58:
                    if (F(t, iR, length)) {
                        writer.n(iR, T(t, S(iP0)));
                    }
                    break;
                case 59:
                    if (F(t, iR, length)) {
                        u0(iR, ibq.E(t, S(iP0)), writer);
                    }
                    break;
                case 60:
                    if (F(t, iR, length)) {
                        writer.M(iR, ibq.E(t, S(iP0)), s(length));
                    }
                    break;
                case 61:
                    if (F(t, iR, length)) {
                        writer.O(iR, (ByteString) ibq.E(t, S(iP0)));
                    }
                    break;
                case 62:
                    if (F(t, iR, length)) {
                        writer.k(iR, W(t, S(iP0)));
                    }
                    break;
                case 63:
                    if (F(t, iR, length)) {
                        writer.G(iR, W(t, S(iP0)));
                    }
                    break;
                case 64:
                    if (F(t, iR, length)) {
                        writer.o(iR, W(t, S(iP0)));
                    }
                    break;
                case 65:
                    if (F(t, iR, length)) {
                        writer.w(iR, X(t, S(iP0)));
                    }
                    break;
                case 66:
                    if (F(t, iR, length)) {
                        writer.I(iR, W(t, S(iP0)));
                    }
                    break;
                case 67:
                    if (F(t, iR, length)) {
                        writer.j(iR, X(t, S(iP0)));
                    }
                    break;
                case 68:
                    if (F(t, iR, length)) {
                        writer.K(iR, ibq.E(t, S(iP0)), s(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.p.j(writer, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
    }

    public final <K, V> void t0(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.q.b(r(i2));
            writer.J(i, null, this.q.g(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[PHI: r6
      0x0079: PHI (r6v4 int) = 
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
      (r6v8 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v9 int)
      (r6v1 int)
     binds: [B:21:0x0060, B:225:0x04ca, B:222:0x04bf, B:216:0x04a3, B:213:0x0491, B:210:0x0481, B:207:0x0473, B:204:0x0465, B:201:0x045a, B:198:0x0450, B:195:0x0442, B:192:0x0434, B:189:0x0420, B:165:0x032f, B:159:0x0311, B:153:0x02f3, B:147:0x02d5, B:141:0x02b7, B:135:0x0299, B:129:0x027b, B:123:0x025d, B:117:0x023f, B:111:0x0222, B:105:0x0205, B:99:0x01e8, B:93:0x01cb, B:86:0x01ab, B:81:0x0177, B:78:0x016b, B:75:0x015b, B:72:0x014b, B:69:0x013b, B:66:0x012f, B:63:0x0123, B:60:0x0116, B:54:0x00f8, B:51:0x00e5, B:48:0x00d4, B:45:0x00c5, B:42:0x00b6, B:40:0x00b0, B:38:0x00a9, B:35:0x009e, B:32:0x008f, B:29:0x0080, B:26:0x0078, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    public final int u(T t) {
        int i;
        int i2;
        int iJ;
        int iE;
        int iL;
        boolean z;
        int iF;
        int i3;
        int iV;
        int iX;
        Unsafe unsafe = s;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.f9375a.length) {
            int iP0 = p0(i5);
            int iR = R(i5);
            int iO0 = o0(iP0);
            if (iO0 <= 17) {
                i = this.f9375a[i5 + 2];
                int i8 = 1048575 & i;
                int i9 = 1 << (i >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(t, i8);
                    i4 = i8;
                }
                i2 = i9;
            } else {
                i = (!this.i || iO0 < FieldType.DOUBLE_LIST_PACKED.id() || iO0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f9375a[i5 + 2] & 1048575;
                i2 = 0;
            }
            long jS = S(iP0);
            int i10 = i4;
            switch (iO0) {
                case 0:
                    if ((i7 & i2) != 0) {
                        iJ = CodedOutputStream.j(iR, 0.0d);
                        i6 += iJ;
                    }
                    break;
                case 1:
                    if ((i7 & i2) != 0) {
                        iJ = CodedOutputStream.r(iR, 0.0f);
                        i6 += iJ;
                    }
                    break;
                case 2:
                    if ((i7 & i2) != 0) {
                        iJ = CodedOutputStream.y(iR, unsafe.getLong(t, jS));
                        i6 += iJ;
                    }
                    break;
                case 3:
                    if ((i7 & i2) != 0) {
                        iJ = CodedOutputStream.Y(iR, unsafe.getLong(t, jS));
                        i6 += iJ;
                    }
                    break;
                case 4:
                    if ((i7 & i2) != 0) {
                        iJ = CodedOutputStream.w(iR, unsafe.getInt(t, jS));
                        i6 += iJ;
                    }
                    break;
                case 5:
                    if ((i7 & i2) != 0) {
                        iJ = CodedOutputStream.p(iR, 0L);
                        i6 += iJ;
                    }
                    break;
                case 6:
                    if ((i7 & i2) != 0) {
                        iJ = CodedOutputStream.n(iR, 0);
                        i6 += iJ;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        iE = CodedOutputStream.e(iR, true);
                        i6 += iE;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(t, jS);
                        iE = object instanceof ByteString ? CodedOutputStream.h(iR, (ByteString) object) : CodedOutputStream.T(iR, (String) object);
                        i6 += iE;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        iE = l0.o(iR, unsafe.getObject(t, jS), s(i5));
                        i6 += iE;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        iE = CodedOutputStream.h(iR, (ByteString) unsafe.getObject(t, jS));
                        i6 += iE;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        iE = CodedOutputStream.W(iR, unsafe.getInt(t, jS));
                        i6 += iE;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        iE = CodedOutputStream.l(iR, unsafe.getInt(t, jS));
                        i6 += iE;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        iL = CodedOutputStream.L(iR, 0);
                        i6 += iL;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        iE = CodedOutputStream.N(iR, 0L);
                        i6 += iE;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        iE = CodedOutputStream.P(iR, unsafe.getInt(t, jS));
                        i6 += iE;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        iE = CodedOutputStream.R(iR, unsafe.getLong(t, jS));
                        i6 += iE;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        iE = CodedOutputStream.t(iR, (b0) unsafe.getObject(t, jS), s(i5));
                        i6 += iE;
                    }
                    break;
                case 18:
                    iE = l0.h(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iE;
                    break;
                case 19:
                    z = false;
                    iF = l0.f(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 20:
                    z = false;
                    iF = l0.m(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 21:
                    z = false;
                    iF = l0.x(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 22:
                    z = false;
                    iF = l0.k(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 23:
                    z = false;
                    iF = l0.h(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 24:
                    z = false;
                    iF = l0.f(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 25:
                    z = false;
                    iF = l0.a(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 26:
                    iE = l0.u(iR, (List) unsafe.getObject(t, jS));
                    i6 += iE;
                    break;
                case 27:
                    iE = l0.p(iR, (List) unsafe.getObject(t, jS), s(i5));
                    i6 += iE;
                    break;
                case 28:
                    iE = l0.c(iR, (List) unsafe.getObject(t, jS));
                    i6 += iE;
                    break;
                case 29:
                    iE = l0.v(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iE;
                    break;
                case 30:
                    z = false;
                    iF = l0.d(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 31:
                    z = false;
                    iF = l0.f(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 32:
                    z = false;
                    iF = l0.h(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 33:
                    z = false;
                    iF = l0.q(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 34:
                    z = false;
                    iF = l0.s(iR, (List) unsafe.getObject(t, jS), false);
                    i6 += iF;
                    break;
                case 35:
                    i3 = l0.i((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 36:
                    i3 = l0.g((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 37:
                    i3 = l0.n((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 38:
                    i3 = l0.y((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 39:
                    i3 = l0.l((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 40:
                    i3 = l0.i((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 41:
                    i3 = l0.g((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 42:
                    i3 = l0.b((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 43:
                    i3 = l0.w((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 44:
                    i3 = l0.e((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 45:
                    i3 = l0.g((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 46:
                    i3 = l0.i((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 47:
                    i3 = l0.r((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 48:
                    i3 = l0.t((List) unsafe.getObject(t, jS));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i3);
                        iL = iV + iX + i3;
                        i6 += iL;
                    }
                    break;
                case 49:
                    iE = l0.j(iR, (List) unsafe.getObject(t, jS), s(i5));
                    i6 += iE;
                    break;
                case 50:
                    iE = this.q.d(iR, unsafe.getObject(t, jS), r(i5));
                    i6 += iE;
                    break;
                case 51:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.j(iR, 0.0d);
                        i6 += iE;
                    }
                    break;
                case 52:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.r(iR, 0.0f);
                        i6 += iE;
                    }
                    break;
                case 53:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.y(iR, X(t, jS));
                        i6 += iE;
                    }
                    break;
                case 54:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.Y(iR, X(t, jS));
                        i6 += iE;
                    }
                    break;
                case 55:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.w(iR, W(t, jS));
                        i6 += iE;
                    }
                    break;
                case 56:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.p(iR, 0L);
                        i6 += iE;
                    }
                    break;
                case 57:
                    if (F(t, iR, i5)) {
                        iL = CodedOutputStream.n(iR, 0);
                        i6 += iL;
                    }
                    break;
                case 58:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.e(iR, true);
                        i6 += iE;
                    }
                    break;
                case 59:
                    if (F(t, iR, i5)) {
                        Object object2 = unsafe.getObject(t, jS);
                        iE = object2 instanceof ByteString ? CodedOutputStream.h(iR, (ByteString) object2) : CodedOutputStream.T(iR, (String) object2);
                        i6 += iE;
                    }
                    break;
                case 60:
                    if (F(t, iR, i5)) {
                        iE = l0.o(iR, unsafe.getObject(t, jS), s(i5));
                        i6 += iE;
                    }
                    break;
                case 61:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.h(iR, (ByteString) unsafe.getObject(t, jS));
                        i6 += iE;
                    }
                    break;
                case 62:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.W(iR, W(t, jS));
                        i6 += iE;
                    }
                    break;
                case 63:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.l(iR, W(t, jS));
                        i6 += iE;
                    }
                    break;
                case 64:
                    if (F(t, iR, i5)) {
                        iL = CodedOutputStream.L(iR, 0);
                        i6 += iL;
                    }
                    break;
                case 65:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.N(iR, 0L);
                        i6 += iE;
                    }
                    break;
                case 66:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.P(iR, W(t, jS));
                        i6 += iE;
                    }
                    break;
                case 67:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.R(iR, X(t, jS));
                        i6 += iE;
                    }
                    break;
                case 68:
                    if (F(t, iR, i5)) {
                        iE = CodedOutputStream.t(iR, (b0) unsafe.getObject(t, jS), s(i5));
                        i6 += iE;
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i4 = i10;
        }
        int iW = i6 + w(this.o, t);
        return this.f ? iW + this.p.c(t).l() : iW;
    }

    public final void u0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.d(i, (String) obj);
        } else {
            writer.O(i, (ByteString) obj);
        }
    }

    public final int v(T t) {
        int iJ;
        int i;
        int iV;
        int iX;
        Unsafe unsafe = s;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9375a.length; i3 += 3) {
            int iP0 = p0(i3);
            int iO0 = o0(iP0);
            int iR = R(i3);
            long jS = S(iP0);
            int i4 = (iO0 < FieldType.DOUBLE_LIST_PACKED.id() || iO0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f9375a[i3 + 2] & 1048575;
            switch (iO0) {
                case 0:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.j(iR, 0.0d);
                        i2 += iJ;
                    }
                    break;
                case 1:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.r(iR, 0.0f);
                        i2 += iJ;
                    }
                    break;
                case 2:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.y(iR, ibq.C(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 3:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.Y(iR, ibq.C(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 4:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.w(iR, ibq.A(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 5:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.p(iR, 0L);
                        i2 += iJ;
                    }
                    break;
                case 6:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.n(iR, 0);
                        i2 += iJ;
                    }
                    break;
                case 7:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.e(iR, true);
                        i2 += iJ;
                    }
                    break;
                case 8:
                    if (z(t, i3)) {
                        Object objE = ibq.E(t, jS);
                        iJ = objE instanceof ByteString ? CodedOutputStream.h(iR, (ByteString) objE) : CodedOutputStream.T(iR, (String) objE);
                        i2 += iJ;
                    }
                    break;
                case 9:
                    if (z(t, i3)) {
                        iJ = l0.o(iR, ibq.E(t, jS), s(i3));
                        i2 += iJ;
                    }
                    break;
                case 10:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.h(iR, (ByteString) ibq.E(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 11:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.W(iR, ibq.A(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 12:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.l(iR, ibq.A(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 13:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.L(iR, 0);
                        i2 += iJ;
                    }
                    break;
                case 14:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.N(iR, 0L);
                        i2 += iJ;
                    }
                    break;
                case 15:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.P(iR, ibq.A(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 16:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.R(iR, ibq.C(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 17:
                    if (z(t, i3)) {
                        iJ = CodedOutputStream.t(iR, (b0) ibq.E(t, jS), s(i3));
                        i2 += iJ;
                    }
                    break;
                case 18:
                    iJ = l0.h(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 19:
                    iJ = l0.f(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 20:
                    iJ = l0.m(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 21:
                    iJ = l0.x(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 22:
                    iJ = l0.k(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 23:
                    iJ = l0.h(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 24:
                    iJ = l0.f(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 25:
                    iJ = l0.a(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 26:
                    iJ = l0.u(iR, H(t, jS));
                    i2 += iJ;
                    break;
                case 27:
                    iJ = l0.p(iR, H(t, jS), s(i3));
                    i2 += iJ;
                    break;
                case 28:
                    iJ = l0.c(iR, H(t, jS));
                    i2 += iJ;
                    break;
                case 29:
                    iJ = l0.v(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 30:
                    iJ = l0.d(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 31:
                    iJ = l0.f(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 32:
                    iJ = l0.h(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 33:
                    iJ = l0.q(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 34:
                    iJ = l0.s(iR, H(t, jS), false);
                    i2 += iJ;
                    break;
                case 35:
                    i = l0.i((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 36:
                    i = l0.g((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 37:
                    i = l0.n((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 38:
                    i = l0.y((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 39:
                    i = l0.l((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 40:
                    i = l0.i((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 41:
                    i = l0.g((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 42:
                    i = l0.b((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 43:
                    i = l0.w((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 44:
                    i = l0.e((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 45:
                    i = l0.g((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 46:
                    i = l0.i((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 47:
                    i = l0.r((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 48:
                    i = l0.t((List) unsafe.getObject(t, jS));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iV = CodedOutputStream.V(iR);
                        iX = CodedOutputStream.X(i);
                        iJ = iV + iX + i;
                        i2 += iJ;
                    }
                    break;
                case 49:
                    iJ = l0.j(iR, H(t, jS), s(i3));
                    i2 += iJ;
                    break;
                case 50:
                    iJ = this.q.d(iR, ibq.E(t, jS), r(i3));
                    i2 += iJ;
                    break;
                case 51:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.j(iR, 0.0d);
                        i2 += iJ;
                    }
                    break;
                case 52:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.r(iR, 0.0f);
                        i2 += iJ;
                    }
                    break;
                case 53:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.y(iR, X(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 54:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.Y(iR, X(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 55:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.w(iR, W(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 56:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.p(iR, 0L);
                        i2 += iJ;
                    }
                    break;
                case 57:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.n(iR, 0);
                        i2 += iJ;
                    }
                    break;
                case 58:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.e(iR, true);
                        i2 += iJ;
                    }
                    break;
                case 59:
                    if (F(t, iR, i3)) {
                        Object objE2 = ibq.E(t, jS);
                        iJ = objE2 instanceof ByteString ? CodedOutputStream.h(iR, (ByteString) objE2) : CodedOutputStream.T(iR, (String) objE2);
                        i2 += iJ;
                    }
                    break;
                case 60:
                    if (F(t, iR, i3)) {
                        iJ = l0.o(iR, ibq.E(t, jS), s(i3));
                        i2 += iJ;
                    }
                    break;
                case 61:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.h(iR, (ByteString) ibq.E(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 62:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.W(iR, W(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 63:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.l(iR, W(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 64:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.L(iR, 0);
                        i2 += iJ;
                    }
                    break;
                case 65:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.N(iR, 0L);
                        i2 += iJ;
                    }
                    break;
                case 66:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.P(iR, W(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 67:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.R(iR, X(t, jS));
                        i2 += iJ;
                    }
                    break;
                case 68:
                    if (F(t, iR, i3)) {
                        iJ = CodedOutputStream.t(iR, (b0) ibq.E(t, jS), s(i3));
                        i2 += iJ;
                    }
                    break;
            }
        }
        return i2 + w(this.o, t);
    }

    public final <UT, UB> void v0(n0<UT, UB> n0Var, T t, Writer writer) throws IOException {
        n0Var.t(n0Var.g(t), writer);
    }

    public final <UT, UB> int w(n0<UT, UB> n0Var, T t) {
        return n0Var.h(n0Var.g(t));
    }

    public final boolean z(T t, int i) {
        if (!this.h) {
            int iF0 = f0(i);
            return (ibq.A(t, (long) (iF0 & 1048575)) & (1 << (iF0 >>> 20))) != 0;
        }
        int iP0 = p0(i);
        long jS = S(iP0);
        switch (o0(iP0)) {
            case 0:
                return ibq.y(t, jS) != 0.0d;
            case 1:
                return ibq.z(t, jS) != 0.0f;
            case 2:
                return ibq.C(t, jS) != 0;
            case 3:
                return ibq.C(t, jS) != 0;
            case 4:
                return ibq.A(t, jS) != 0;
            case 5:
                return ibq.C(t, jS) != 0;
            case 6:
                return ibq.A(t, jS) != 0;
            case 7:
                return ibq.r(t, jS);
            case 8:
                Object objE = ibq.E(t, jS);
                if (objE instanceof String) {
                    return !((String) objE).isEmpty();
                }
                if (objE instanceof ByteString) {
                    return !ByteString.EMPTY.equals(objE);
                }
                throw new IllegalArgumentException();
            case 9:
                return ibq.E(t, jS) != null;
            case 10:
                return !ByteString.EMPTY.equals(ibq.E(t, jS));
            case 11:
                return ibq.A(t, jS) != 0;
            case 12:
                return ibq.A(t, jS) != 0;
            case 13:
                return ibq.A(t, jS) != 0;
            case 14:
                return ibq.C(t, jS) != 0;
            case 15:
                return ibq.A(t, jS) != 0;
            case 16:
                return ibq.C(t, jS) != 0;
            case 17:
                return ibq.E(t, jS) != null;
            default:
                throw new IllegalArgumentException();
        }
    }
}
