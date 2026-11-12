package androidx.health.platform.client.proto;

import defpackage.bcj;
import defpackage.hbq;
import defpackage.rrf;
import defpackage.ulo;
import defpackage.vdi;
import defpackage.xkg;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class q0<T> implements w1<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f2523r = new int[0];
    public static final Unsafe s = hbq.H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f2525b;
    public final int c;
    public final int d;
    public final o0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2526k;
    public final int l;
    public final xkg m;
    public final j0 n;
    public final b2<?, ?> o;
    public final z<?> p;
    public final m0 q;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2527a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2527a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2527a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2527a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2527a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2527a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2527a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2527a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2527a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2527a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2527a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2527a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2527a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2527a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2527a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2527a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2527a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2527a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public q0(int[] iArr, Object[] objArr, int i, int i2, o0 o0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, xkg xkgVar, j0 j0Var, b2<?, ?> b2Var, z<?> zVar, m0 m0Var) {
        this.f2524a = iArr;
        this.f2525b = objArr;
        this.c = i;
        this.d = i2;
        this.g = o0Var instanceof GeneratedMessageLite;
        this.h = z;
        this.f = zVar != null && zVar.e(o0Var);
        this.i = z2;
        this.j = iArr2;
        this.f2526k = i3;
        this.l = i4;
        this.m = xkgVar;
        this.n = j0Var;
        this.o = b2Var;
        this.p = zVar;
        this.e = o0Var;
        this.q = m0Var;
    }

    public static boolean A(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean D(Object obj, int i, w1 w1Var) {
        return w1Var.b(hbq.G(obj, X(i)));
    }

    public static boolean G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).A();
        }
        return true;
    }

    public static boolean J(int i) {
        return (i & 268435456) != 0;
    }

    public static List<?> K(Object obj, long j) {
        return (List) hbq.G(obj, j);
    }

    public static <T> long L(T t, long j) {
        return hbq.E(t, j);
    }

    public static <T> q0<T> T(Class<T> cls, rrf rrfVar, xkg xkgVar, j0 j0Var, b2<?, ?> b2Var, z<?> zVar, m0 m0Var) {
        return rrfVar instanceof bcj ? V((bcj) rrfVar, xkgVar, j0Var, b2Var, zVar, m0Var) : U((ulo) rrfVar, xkgVar, j0Var, b2Var, zVar, m0Var);
    }

    public static <T> q0<T> U(ulo uloVar, xkg xkgVar, j0 j0Var, b2<?, ?> b2Var, z<?> zVar, m0 m0Var) {
        boolean z = uloVar.c() == ProtoSyntax.PROTO3;
        b0[] b0VarArrE = uloVar.e();
        if (b0VarArrE.length != 0) {
            b0 b0Var = b0VarArrE[0];
            throw null;
        }
        int length = b0VarArrE.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (b0VarArrE.length > 0) {
            b0 b0Var2 = b0VarArrE[0];
            throw null;
        }
        int[] iArrD = uloVar.d();
        if (iArrD == null) {
            iArrD = f2523r;
        }
        if (b0VarArrE.length > 0) {
            b0 b0Var3 = b0VarArrE[0];
            throw null;
        }
        int[] iArr2 = f2523r;
        int[] iArr3 = f2523r;
        int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
        System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
        return new q0<>(iArr, objArr, 0, 0, uloVar.b(), z, true, iArr4, iArrD.length, iArrD.length + iArr2.length, xkgVar, j0Var, b2Var, zVar, m0Var);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x024f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0255  */
    /* JADX WARN: Code duplicated, block: B:127:0x026b  */
    /* JADX WARN: Code duplicated, block: B:129:0x026f  */
    /* JADX WARN: Code duplicated, block: B:163:0x031f  */
    /* JADX WARN: Code duplicated, block: B:179:0x036d  */
    /* JADX WARN: Code duplicated, block: B:182:0x037a  */
    public static <T> q0<T> V(bcj bcjVar, xkg xkgVar, j0 j0Var, b2<?, ?> b2Var, z<?> zVar, m0 m0Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        int i7;
        char cCharAt4;
        int i8;
        char cCharAt5;
        int i9;
        char cCharAt6;
        int i10;
        char cCharAt7;
        int i11;
        char cCharAt8;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        Field fieldP0;
        char cCharAt9;
        int i20;
        int i21;
        int i22;
        Object obj;
        Field fieldP1;
        int i23;
        Object obj2;
        Field fieldP2;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        boolean z = bcjVar.c() == ProtoSyntax.PROTO3;
        String strE = bcjVar.e();
        int length = strE.length();
        char c = 55296;
        if (strE.charAt(0) >= 55296) {
            int i28 = 1;
            while (true) {
                i = i28 + 1;
                if (strE.charAt(i28) < 55296) {
                    break;
                }
                i28 = i;
            }
        } else {
            i = 1;
        }
        int i29 = i + 1;
        int iCharAt6 = strE.charAt(i);
        if (iCharAt6 >= 55296) {
            int i30 = iCharAt6 & 8191;
            int i31 = 13;
            while (true) {
                i27 = i29 + 1;
                cCharAt13 = strE.charAt(i29);
                if (cCharAt13 < 55296) {
                    break;
                }
                i30 |= (cCharAt13 & 8191) << i31;
                i31 += 13;
                i29 = i27;
            }
            iCharAt6 = i30 | (cCharAt13 << i31);
            i29 = i27;
        }
        if (iCharAt6 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            iCharAt5 = 0;
            i2 = 0;
            iArr = f2523r;
            i3 = 0;
        } else {
            int i32 = i29 + 1;
            int iCharAt7 = strE.charAt(i29);
            if (iCharAt7 >= 55296) {
                int i33 = iCharAt7 & 8191;
                int i34 = 13;
                while (true) {
                    i11 = i32 + 1;
                    cCharAt8 = strE.charAt(i32);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt8 & 8191) << i34;
                    i34 += 13;
                    i32 = i11;
                }
                iCharAt7 = i33 | (cCharAt8 << i34);
                i32 = i11;
            }
            int i35 = i32 + 1;
            int iCharAt8 = strE.charAt(i32);
            if (iCharAt8 >= 55296) {
                int i36 = iCharAt8 & 8191;
                int i37 = 13;
                while (true) {
                    i10 = i35 + 1;
                    cCharAt7 = strE.charAt(i35);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt7 & 8191) << i37;
                    i37 += 13;
                    i35 = i10;
                }
                iCharAt8 = i36 | (cCharAt7 << i37);
                i35 = i10;
            }
            int i38 = i35 + 1;
            iCharAt = strE.charAt(i35);
            if (iCharAt >= 55296) {
                int i39 = iCharAt & 8191;
                int i40 = 13;
                while (true) {
                    i9 = i38 + 1;
                    cCharAt6 = strE.charAt(i38);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt6 & 8191) << i40;
                    i40 += 13;
                    i38 = i9;
                }
                iCharAt = i39 | (cCharAt6 << i40);
                i38 = i9;
            }
            int i41 = i38 + 1;
            iCharAt2 = strE.charAt(i38);
            if (iCharAt2 >= 55296) {
                int i42 = iCharAt2 & 8191;
                int i43 = 13;
                while (true) {
                    i8 = i41 + 1;
                    cCharAt5 = strE.charAt(i41);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt5 & 8191) << i43;
                    i43 += 13;
                    i41 = i8;
                }
                iCharAt2 = i42 | (cCharAt5 << i43);
                i41 = i8;
            }
            int i44 = i41 + 1;
            iCharAt3 = strE.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i7 = i44 + 1;
                    cCharAt4 = strE.charAt(i44);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt4 & 8191) << i46;
                    i46 += 13;
                    i44 = i7;
                }
                iCharAt3 = i45 | (cCharAt4 << i46);
                i44 = i7;
            }
            int i47 = i44 + 1;
            iCharAt4 = strE.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i6 = i47 + 1;
                    cCharAt3 = strE.charAt(i47);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt3 & 8191) << i49;
                    i49 += 13;
                    i47 = i6;
                }
                iCharAt4 = i48 | (cCharAt3 << i49);
                i47 = i6;
            }
            int i50 = i47 + 1;
            int iCharAt9 = strE.charAt(i47);
            if (iCharAt9 >= 55296) {
                int i51 = iCharAt9 & 8191;
                int i52 = 13;
                while (true) {
                    i5 = i50 + 1;
                    cCharAt2 = strE.charAt(i50);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt2 & 8191) << i52;
                    i52 += 13;
                    i50 = i5;
                }
                iCharAt9 = i51 | (cCharAt2 << i52);
                i50 = i5;
            }
            int i53 = i50 + 1;
            iCharAt5 = strE.charAt(i50);
            if (iCharAt5 >= 55296) {
                int i54 = iCharAt5 & 8191;
                int i55 = 13;
                while (true) {
                    i4 = i53 + 1;
                    cCharAt = strE.charAt(i53);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i54 |= (cCharAt & 8191) << i55;
                    i55 += 13;
                    i53 = i4;
                }
                iCharAt5 = i54 | (cCharAt << i55);
                i53 = i4;
            }
            iArr = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i2 = (iCharAt7 * 2) + iCharAt8;
            i3 = iCharAt7;
            i29 = i53;
        }
        Unsafe unsafe = s;
        Object[] objArrD = bcjVar.d();
        Class<?> cls = bcjVar.b().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 * 2];
        int i56 = iCharAt5 + iCharAt4;
        int i57 = iCharAt5;
        int i58 = i56;
        int i59 = 0;
        int i60 = 0;
        while (i29 < length) {
            int i61 = i29 + 1;
            int iCharAt10 = strE.charAt(i29);
            if (iCharAt10 >= c) {
                int i62 = iCharAt10 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i26 = i63 + 1;
                    cCharAt12 = strE.charAt(i63);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i62 |= (cCharAt12 & 8191) << i64;
                    i64 += 13;
                    i63 = i26;
                }
                iCharAt10 = i62 | (cCharAt12 << i64);
                i12 = i26;
            } else {
                i12 = i61;
            }
            int i65 = i12 + 1;
            int iCharAt11 = strE.charAt(i12);
            if (iCharAt11 >= c) {
                int i66 = iCharAt11 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i25 = i67 + 1;
                    cCharAt11 = strE.charAt(i67);
                    i13 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt11 & 8191) << i68;
                    i68 += 13;
                    i67 = i25;
                    length = i13;
                }
                iCharAt11 = i66 | (cCharAt11 << i68);
                i14 = i25;
            } else {
                i13 = length;
                i14 = i65;
            }
            int i69 = iCharAt11 & 255;
            int i70 = iCharAt5;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i59] = i60;
                i59++;
            }
            int i71 = i59;
            if (i69 >= 51) {
                int i72 = i14 + 1;
                int iCharAt12 = strE.charAt(i14);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i73 = iCharAt12 & 8191;
                    int i74 = 13;
                    while (true) {
                        i24 = i72 + 1;
                        cCharAt10 = strE.charAt(i72);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i73 |= (cCharAt10 & 8191) << i74;
                        i74 += 13;
                        i72 = i24;
                        c2 = 55296;
                    }
                    iCharAt12 = i73 | (cCharAt10 << i74);
                    i72 = i24;
                }
                int i75 = i69 - 51;
                int i76 = i72;
                if (i75 == 9 || i75 == 17) {
                    i21 = i2 + 1;
                    objArr[((i60 / 3) * 2) + 1] = objArrD[i2];
                } else {
                    if (i75 == 12 && !z) {
                        i21 = i2 + 1;
                        objArr[((i60 / 3) * 2) + 1] = objArrD[i2];
                    }
                    i22 = iCharAt12 * 2;
                    obj = objArrD[i22];
                    if (obj instanceof Field) {
                        fieldP1 = (Field) obj;
                    } else {
                        fieldP1 = p0(cls, (String) obj);
                        objArrD[i22] = fieldP1;
                    }
                    i15 = iCharAt;
                    i16 = iCharAt2;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldP1);
                    i23 = i22 + 1;
                    obj2 = objArrD[i23];
                    if (obj2 instanceof Field) {
                        fieldP2 = (Field) obj2;
                    } else {
                        fieldP2 = p0(cls, (String) obj2);
                        objArrD[i23] = fieldP2;
                    }
                    strE = strE;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP2);
                    z = z;
                    i18 = i76;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i19 = 0;
                }
                i2 = i21;
                i22 = iCharAt12 * 2;
                obj = objArrD[i22];
                if (obj instanceof Field) {
                    fieldP1 = (Field) obj;
                } else {
                    fieldP1 = p0(cls, (String) obj);
                    objArrD[i22] = fieldP1;
                }
                i15 = iCharAt;
                i16 = iCharAt2;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldP1);
                i23 = i22 + 1;
                obj2 = objArrD[i23];
                if (obj2 instanceof Field) {
                    fieldP2 = (Field) obj2;
                } else {
                    fieldP2 = p0(cls, (String) obj2);
                    objArrD[i23] = fieldP2;
                }
                strE = strE;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP2);
                z = z;
                i18 = i76;
                iObjectFieldOffset = iObjectFieldOffset4;
                i19 = 0;
            } else {
                i15 = iCharAt;
                i16 = iCharAt2;
                int i77 = i2 + 1;
                Field fieldP3 = p0(cls, (String) objArrD[i2]);
                if (i69 == 9 || i69 == 17) {
                    objArr[((i60 / 3) * 2) + 1] = fieldP3.getType();
                } else {
                    if (i69 == 27 || i69 == 49) {
                        i20 = i2 + 2;
                        objArr[((i60 / 3) * 2) + 1] = objArrD[i77];
                    } else if (i69 == 12 || i69 == 30 || i69 == 44) {
                        if (!z) {
                            i20 = i2 + 2;
                            objArr[((i60 / 3) * 2) + 1] = objArrD[i77];
                        }
                    } else if (i69 == 50) {
                        int i78 = i57 + 1;
                        iArr[i57] = i60;
                        int i79 = (i60 / 3) * 2;
                        int i80 = i2 + 2;
                        objArr[i79] = objArrD[i77];
                        if ((iCharAt11 & 2048) != 0) {
                            i77 = i2 + 3;
                            objArr[i79 + 1] = objArrD[i80];
                            i57 = i78;
                        } else {
                            i57 = i78;
                            i17 = i80;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP3);
                        i2 = i17;
                        if ((iCharAt11 & 4096) == 4096 || i69 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i18 = i14;
                            i19 = 0;
                        } else {
                            int i81 = i14 + 1;
                            int iCharAt13 = strE.charAt(i14);
                            if (iCharAt13 >= 55296) {
                                int i82 = iCharAt13 & 8191;
                                int i83 = 13;
                                while (true) {
                                    i18 = i81 + 1;
                                    cCharAt9 = strE.charAt(i81);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i82 |= (cCharAt9 & 8191) << i83;
                                    i83 += 13;
                                    i81 = i18;
                                }
                                iCharAt13 = i82 | (cCharAt9 << i83);
                            } else {
                                i18 = i81;
                            }
                            int i84 = (i3 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrD[i84];
                            if (obj3 instanceof Field) {
                                fieldP0 = (Field) obj3;
                            } else {
                                fieldP0 = p0(cls, (String) obj3);
                                objArrD[i84] = fieldP0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP0);
                            i19 = iCharAt13 % 32;
                        }
                        if (i69 >= 18 && i69 <= 49) {
                            iArr[i58] = iObjectFieldOffset;
                            i58++;
                        }
                    }
                    i17 = i20;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP3);
                    i2 = i17;
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i18 = i14;
                        i19 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i18 = i14;
                        i19 = 0;
                    }
                    if (i69 >= 18) {
                        iArr[i58] = iObjectFieldOffset;
                        i58++;
                    }
                }
                i17 = i77;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP3);
                i2 = i17;
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i18 = i14;
                    i19 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i18 = i14;
                    i19 = 0;
                }
                if (i69 >= 18) {
                    iArr[i58] = iObjectFieldOffset;
                    i58++;
                }
            }
            int i85 = i60 + 1;
            iArr2[i60] = iCharAt10;
            int i86 = i60 + 2;
            iArr2[i85] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i69 << 20) | iObjectFieldOffset;
            i60 += 3;
            iArr2[i86] = (i19 << 20) | iObjectFieldOffset2;
            z = z;
            iCharAt = i15;
            iCharAt5 = i70;
            i29 = i18;
            length = i13;
            strE = strE;
            i59 = i71;
            iCharAt2 = i16;
            c = 55296;
        }
        return new q0<>(iArr2, objArr, iCharAt, iCharAt2, bcjVar.b(), z, false, iArr, iCharAt5, i56, xkgVar, j0Var, b2Var, zVar, m0Var);
    }

    public static long X(int i) {
        return i & 1048575;
    }

    public static <T> boolean Y(T t, long j) {
        return ((Boolean) hbq.G(t, j)).booleanValue();
    }

    public static <T> double Z(T t, long j) {
        return ((Double) hbq.G(t, j)).doubleValue();
    }

    public static <T> float a0(T t, long j) {
        return ((Float) hbq.G(t, j)).floatValue();
    }

    public static <T> int b0(T t, long j) {
        return ((Integer) hbq.G(t, j)).intValue();
    }

    public static <T> long c0(T t, long j) {
        return ((Long) hbq.G(t, j)).longValue();
    }

    public static <T> boolean j(T t, long j) {
        return hbq.t(t, j);
    }

    public static void k(Object obj) {
        if (G(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static <T> double n(T t, long j) {
        return hbq.A(t, j);
    }

    public static Field p0(Class<?> cls, String str) {
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

    public static <T> float r(T t, long j) {
        return hbq.B(t, j);
    }

    public static c2 v(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        c2 c2Var = generatedMessageLite.unknownFields;
        if (c2Var != c2.c()) {
            return c2Var;
        }
        c2 c2VarK = c2.k();
        generatedMessageLite.unknownFields = c2VarK;
        return c2VarK;
    }

    public static int v0(int i) {
        return (i & 267386880) >>> 20;
    }

    public static <T> int z(T t, long j) {
        return hbq.C(t, j);
    }

    public final <K, V> void A0(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.N(i, this.q.b(t(i2)), this.q.g(obj));
        }
    }

    public final boolean B(T t, int i) {
        int iK0 = k0(i);
        long j = 1048575 & iK0;
        if (j != 1048575) {
            return (hbq.C(t, j) & (1 << (iK0 >>> 20))) != 0;
        }
        int iW0 = w0(i);
        long jX = X(iW0);
        switch (v0(iW0)) {
            case 0:
                return Double.doubleToRawLongBits(hbq.A(t, jX)) != 0;
            case 1:
                return Float.floatToRawIntBits(hbq.B(t, jX)) != 0;
            case 2:
                return hbq.E(t, jX) != 0;
            case 3:
                return hbq.E(t, jX) != 0;
            case 4:
                return hbq.C(t, jX) != 0;
            case 5:
                return hbq.E(t, jX) != 0;
            case 6:
                return hbq.C(t, jX) != 0;
            case 7:
                return hbq.t(t, jX);
            case 8:
                Object objG = hbq.G(t, jX);
                if (objG instanceof String) {
                    return !((String) objG).isEmpty();
                }
                if (objG instanceof ByteString) {
                    return !ByteString.EMPTY.equals(objG);
                }
                throw new IllegalArgumentException();
            case 9:
                return hbq.G(t, jX) != null;
            case 10:
                return !ByteString.EMPTY.equals(hbq.G(t, jX));
            case 11:
                return hbq.C(t, jX) != 0;
            case 12:
                return hbq.C(t, jX) != 0;
            case 13:
                return hbq.C(t, jX) != 0;
            case 14:
                return hbq.E(t, jX) != 0;
            case 15:
                return hbq.C(t, jX) != 0;
            case 16:
                return hbq.E(t, jX) != 0;
            case 17:
                return hbq.G(t, jX) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void B0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.d(i, (String) obj);
        } else {
            writer.J(i, (ByteString) obj);
        }
    }

    public final boolean C(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return B(t, i);
        }
        return (i3 & i4) != 0;
    }

    public final <UT, UB> void C0(b2<UT, UB> b2Var, T t, Writer writer) throws IOException {
        b2Var.t(b2Var.g(t), writer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N> boolean E(Object obj, int i, int i2) {
        List list = (List) hbq.G(obj, X(i));
        if (list.isEmpty()) {
            return true;
        }
        w1 w1VarU = u(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!w1VarU.b(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.health.platform.client.proto.w1] */
    public final boolean F(T t, int i, int i2) {
        Map<?, ?> mapG = this.q.g(hbq.G(t, X(i)));
        if (mapG.isEmpty()) {
            return true;
        }
        if (this.q.b(t(i2)).c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? C = 0;
        for (Object obj : mapG.values()) {
            if (C == 0) {
                C = C;
                C = vdi.a().c(obj.getClass());
            }
            C = C;
            if (!C.b(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean H(T t, T t2, int i) {
        long jK0 = k0(i) & 1048575;
        return hbq.C(t, jK0) == hbq.C(t2, jK0);
    }

    public final boolean I(T t, int i, int i2) {
        return hbq.C(t, (long) (k0(i2) & 1048575)) == i;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x064f A[Catch: all -> 0x0675, TRY_LEAVE, TryCatch #8 {all -> 0x0675, blocks: (B:170:0x0649, B:172:0x064f, B:184:0x0679, B:185:0x067e), top: B:212:0x0649 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x065c A[LOOP:2: B:175:0x0658->B:177:0x065c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x0671  */
    /* JADX WARN: Code duplicated, block: B:183:0x0677 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0679 A[Catch: all -> 0x0675, TRY_ENTER, TryCatch #8 {all -> 0x0675, blocks: (B:170:0x0649, B:172:0x064f, B:184:0x0679, B:185:0x067e), top: B:212:0x0649 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x068b A[LOOP:3: B:188:0x0687->B:190:0x068b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:200:0x06b5 A[LOOP:4: B:198:0x06b1->B:200:0x06b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:231:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0684 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends c0.b<ET>> void M(b2<UT, UB> b2Var, z<ET> zVar, T t, w0 w0Var, y yVar) throws Throwable {
        b2 b2Var2;
        T t2;
        int i;
        Object objP;
        T t3;
        Object objD;
        y yVar2;
        int i2;
        Object objP2;
        int i3;
        Object objP3;
        Object obj;
        b2 b2Var3 = b2Var;
        T t4 = t;
        y yVar3 = yVar;
        Object objF = null;
        Object obj2 = null;
        while (true) {
            try {
                int iL = w0Var.l();
                int iI0 = i0(iL);
                if (iI0 >= 0) {
                    t2 = t4;
                    try {
                        int iW0 = w0(iI0);
                        try {
                            switch (v0(iW0)) {
                                case 0:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.S(t2, X(iW0), w0Var.readDouble());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 1:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.T(t2, X(iW0), w0Var.readFloat());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 2:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.V(t2, X(iW0), w0Var.r());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 3:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.V(t2, X(iW0), w0Var.h());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 4:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.U(t2, X(iW0), w0Var.z());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 5:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.V(t2, X(iW0), w0Var.s());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 6:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.U(t2, X(iW0), w0Var.C());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 7:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.M(t2, X(iW0), w0Var.u());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 8:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    n0(t2, iW0, w0Var);
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 9:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    o0 o0Var = (o0) R(t2, iI0);
                                    w0Var.I(o0Var, u(iI0), yVar2);
                                    t0(t2, iI0, o0Var);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 10:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.W(t2, X(iW0), w0Var.readBytes());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 11:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.U(t2, X(iW0), w0Var.c());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 12:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    int iD = w0Var.d();
                                    f0.e eVarS = s(iI0);
                                    if (eVarS == null || eVarS.isInRange(iD)) {
                                        hbq.U(t2, X(iW0), iD);
                                        q0(t2, iI0);
                                        objF = obj;
                                    } else {
                                        objF = x1.L(t2, iL, iD, obj, b2Var2);
                                    }
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 13:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.U(t2, X(iW0), w0Var.F());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 14:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.V(t2, X(iW0), w0Var.b());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 15:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.U(t2, X(iW0), w0Var.e());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 16:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    hbq.V(t2, X(iW0), w0Var.D());
                                    q0(t2, iI0);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 17:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    o0 o0Var2 = (o0) R(t2, iI0);
                                    w0Var.J(o0Var2, u(iI0), yVar2);
                                    t0(t2, iI0, o0Var2);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 18:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.q(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 19:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.n(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 20:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.w(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 21:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.v(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 22:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.j(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 23:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.A(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 24:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.k(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 25:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.f(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 26:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    o0(t2, iW0, w0Var);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 27:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    m0(t, iW0, w0Var, u(iI0), yVar);
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 28:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.p(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 29:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.B(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 30:
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    List<Integer> listE = this.n.e(t2, X(iW0));
                                    w0Var.x(listE);
                                    objF = x1.A(t, iL, listE, s(iI0), objF, b2Var);
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 31:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.t(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 32:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.i(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 33:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.g(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 34:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.a(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 35:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.q(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 36:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.n(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 37:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.w(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 38:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.v(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 39:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.j(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 40:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.A(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 41:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.k(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 42:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.f(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 43:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.B(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 44:
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    List<Integer> listE2 = this.n.e(t2, X(iW0));
                                    w0Var.x(listE2);
                                    objF = x1.A(t, iL, listE2, s(iI0), objF, b2Var);
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 45:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.t(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 46:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.i(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 47:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.g(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 48:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    w0Var.a(this.n.e(t2, X(iW0)));
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 49:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    try {
                                        l0(t, X(iW0), w0Var, u(iI0), yVar);
                                        objF = obj;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                        objF = obj;
                                        try {
                                            if (!b2Var2.q(w0Var)) {
                                                if (objF == null) {
                                                    objF = b2Var2.f(t2);
                                                }
                                                if (!b2Var2.m(objF, w0Var)) {
                                                    objP2 = objF;
                                                    for (i2 = this.f2526k; i2 < this.l; i2++) {
                                                        objP2 = p(t, this.j[i2], objP2, b2Var, t);
                                                    }
                                                    if (objP2 != null) {
                                                        b2Var2.o(t2, objP2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!w0Var.o()) {
                                                objP3 = objF;
                                                for (i3 = this.f2526k; i3 < this.l; i3++) {
                                                    objP3 = p(t, this.j[i3], objP3, b2Var, t);
                                                }
                                                if (objP3 != null) {
                                                    b2Var2.o(t2, objP3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        objF = obj;
                                        objP = objF;
                                        for (i = this.f2526k; i < this.l; i++) {
                                            objP = p(t, this.j[i], objP, b2Var, t);
                                        }
                                        if (objP != null) {
                                            b2Var2.o(t2, objP);
                                        }
                                        throw th;
                                    }
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 50:
                                    obj = objF;
                                    yVar2 = yVar3;
                                    try {
                                        N(t, iI0, t(iI0), yVar, w0Var);
                                        b2Var2 = b2Var3;
                                        objF = obj;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        b2Var2 = b2Var3;
                                        objF = obj;
                                        if (!b2Var2.q(w0Var)) {
                                            if (objF == null) {
                                                objF = b2Var2.f(t2);
                                            }
                                            if (!b2Var2.m(objF, w0Var)) {
                                                objP2 = objF;
                                                while (i2 < this.l) {
                                                    objP2 = p(t, this.j[i2], objP2, b2Var, t);
                                                }
                                                if (objP2 != null) {
                                                    b2Var2.o(t2, objP2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else if (!w0Var.o()) {
                                            objP3 = objF;
                                            while (i3 < this.l) {
                                                objP3 = p(t, this.j[i3], objP3, b2Var, t);
                                            }
                                            if (objP3 != null) {
                                                b2Var2.o(t2, objP3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        b2Var2 = b2Var3;
                                        objF = obj;
                                        objP = objF;
                                        while (i < this.l) {
                                            objP = p(t, this.j[i], objP, b2Var, t);
                                        }
                                        if (objP != null) {
                                            b2Var2.o(t2, objP);
                                        }
                                        throw th;
                                    }
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 51:
                                    hbq.W(t2, X(iW0), Double.valueOf(w0Var.readDouble()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 52:
                                    hbq.W(t2, X(iW0), Float.valueOf(w0Var.readFloat()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 53:
                                    hbq.W(t2, X(iW0), Long.valueOf(w0Var.r()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 54:
                                    hbq.W(t2, X(iW0), Long.valueOf(w0Var.h()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 55:
                                    hbq.W(t2, X(iW0), Integer.valueOf(w0Var.z()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 56:
                                    hbq.W(t2, X(iW0), Long.valueOf(w0Var.s()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 57:
                                    hbq.W(t2, X(iW0), Integer.valueOf(w0Var.C()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 58:
                                    hbq.W(t2, X(iW0), Boolean.valueOf(w0Var.u()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 59:
                                    n0(t2, iW0, w0Var);
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 60:
                                    o0 o0Var3 = (o0) S(t2, iL, iI0);
                                    w0Var.I(o0Var3, u(iI0), yVar3);
                                    u0(t2, iL, iI0, o0Var3);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 61:
                                    hbq.W(t2, X(iW0), w0Var.readBytes());
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 62:
                                    hbq.W(t2, X(iW0), Integer.valueOf(w0Var.c()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 63:
                                    int iD2 = w0Var.d();
                                    f0.e eVarS2 = s(iI0);
                                    if (eVarS2 != null && !eVarS2.isInRange(iD2)) {
                                        objF = x1.L(t2, iL, iD2, objF, b2Var3);
                                        yVar2 = yVar3;
                                        b2Var2 = b2Var3;
                                        t4 = t2;
                                        yVar3 = yVar2;
                                        b2Var3 = b2Var2;
                                    }
                                    hbq.W(t2, X(iW0), Integer.valueOf(iD2));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 64:
                                    hbq.W(t2, X(iW0), Integer.valueOf(w0Var.F()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 65:
                                    hbq.W(t2, X(iW0), Long.valueOf(w0Var.b()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 66:
                                    hbq.W(t2, X(iW0), Integer.valueOf(w0Var.e()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 67:
                                    hbq.W(t2, X(iW0), Long.valueOf(w0Var.D()));
                                    r0(t2, iL, iI0);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                case 68:
                                    o0 o0Var4 = (o0) S(t2, iL, iI0);
                                    w0Var.J(o0Var4, u(iI0), yVar3);
                                    u0(t2, iL, iI0, o0Var4);
                                    obj = objF;
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    objF = obj;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                                default:
                                    if (objF == null) {
                                        try {
                                            objF = b2Var3.f(t2);
                                            break;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            yVar2 = yVar3;
                                            b2Var2 = b2Var3;
                                            if (!b2Var2.q(w0Var)) {
                                                if (objF == null) {
                                                    objF = b2Var2.f(t2);
                                                }
                                                if (!b2Var2.m(objF, w0Var)) {
                                                    objP2 = objF;
                                                    while (i2 < this.l) {
                                                        objP2 = p(t, this.j[i2], objP2, b2Var, t);
                                                    }
                                                    if (objP2 != null) {
                                                        b2Var2.o(t2, objP2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!w0Var.o()) {
                                                objP3 = objF;
                                                while (i3 < this.l) {
                                                    objP3 = p(t, this.j[i3], objP3, b2Var, t);
                                                }
                                                if (objP3 != null) {
                                                    b2Var2.o(t2, objP3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            b2Var2 = b2Var3;
                                            objP = objF;
                                            while (i < this.l) {
                                                objP = p(t, this.j[i], objP, b2Var, t);
                                            }
                                            if (objP != null) {
                                                b2Var2.o(t2, objP);
                                            }
                                            throw th;
                                        }
                                    }
                                    if (!b2Var3.m(objF, w0Var)) {
                                        Object objP4 = objF;
                                        for (int i4 = this.f2526k; i4 < this.l; i4++) {
                                            objP4 = p(t, this.j[i4], objP4, b2Var, t);
                                        }
                                        if (objP4 != null) {
                                            b2Var3.o(t2, objP4);
                                            return;
                                        }
                                        return;
                                    }
                                    yVar2 = yVar3;
                                    b2Var2 = b2Var3;
                                    t4 = t2;
                                    yVar3 = yVar2;
                                    b2Var3 = b2Var2;
                                    break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } else {
                    if (iL == Integer.MAX_VALUE) {
                        Object objP5 = objF;
                        for (int i5 = this.f2526k; i5 < this.l; i5++) {
                            objP5 = p(t, this.j[i5], objP5, b2Var, t);
                        }
                        if (objP5 != null) {
                            b2Var3.o(t4, objP5);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objB = !this.f ? null : zVar.b(yVar3, this.e, iL);
                        if (objB != null) {
                            if (obj2 == null) {
                                try {
                                    objD = zVar.d(t);
                                } catch (Throwable th6) {
                                    th = th6;
                                    b2Var2 = b2Var3;
                                    t2 = t4;
                                    objP = objF;
                                    while (i < this.l) {
                                        objP = p(t, this.j[i], objP, b2Var, t);
                                    }
                                    if (objP != null) {
                                        b2Var2.o(t2, objP);
                                    }
                                    throw th;
                                }
                            } else {
                                objD = obj2;
                            }
                            t3 = t4;
                            try {
                                objF = zVar.g(t, w0Var, objB, yVar, objD, objF, b2Var);
                                obj2 = objD;
                            } catch (Throwable th7) {
                                th = th7;
                                t2 = t3;
                                b2Var2 = b2Var3;
                                objP = objF;
                                while (i < this.l) {
                                    objP = p(t, this.j[i], objP, b2Var, t);
                                }
                                if (objP != null) {
                                    b2Var2.o(t2, objP);
                                }
                                throw th;
                            }
                        } else {
                            t3 = t4;
                            if (!b2Var3.q(w0Var)) {
                                if (objF == null) {
                                    objF = b2Var3.f(t3);
                                }
                                if (!b2Var3.m(objF, w0Var)) {
                                }
                            } else if (!w0Var.o()) {
                            }
                        }
                        t4 = t3;
                    } catch (Throwable th8) {
                        th = th8;
                        t2 = t4;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
            }
            objP = objF;
            while (i < this.l) {
                objP = p(t, this.j[i], objP, b2Var, t);
            }
            if (objP != null) {
                b2Var2.o(t2, objP);
            }
            throw th;
        }
        int i6 = this.f2526k;
        Object objP6 = objF;
        while (i6 < this.l) {
            objP6 = p(t, this.j[i6], objP6, b2Var, t);
            i6++;
            t3 = t3;
        }
        T t5 = t3;
        if (objP6 != null) {
            b2Var3.o(t5, objP6);
        }
    }

    public final <K, V> void N(Object obj, int i, Object obj2, y yVar, w0 w0Var) throws IOException {
        long jX = X(w0(i));
        Object objG = hbq.G(obj, jX);
        if (objG == null) {
            objG = this.q.f(obj2);
            hbq.W(obj, jX, objG);
        } else if (this.q.h(objG)) {
            Object objF = this.q.f(obj2);
            this.q.a(objF, objG);
            hbq.W(obj, jX, objF);
            objG = objF;
        }
        w0Var.H(this.q.e(objG), this.q.b(obj2), yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(T t, T t2, int i) {
        if (B(t2, i)) {
            long jX = X(w0(i));
            Unsafe unsafe = s;
            Object object = unsafe.getObject(t2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + W(i) + " is present but null: " + t2);
            }
            w1 w1VarU = u(i);
            if (!B(t, i)) {
                if (G(object)) {
                    Object objE = w1VarU.e();
                    w1VarU.a(objE, object);
                    unsafe.putObject(t, jX, objE);
                } else {
                    unsafe.putObject(t, jX, object);
                }
                q0(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jX);
            if (!G(object2)) {
                Object objE2 = w1VarU.e();
                w1VarU.a(objE2, object2);
                unsafe.putObject(t, jX, objE2);
                object2 = objE2;
            }
            w1VarU.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(T t, T t2, int i) {
        int iW = W(i);
        if (I(t2, iW, i)) {
            long jX = X(w0(i));
            Unsafe unsafe = s;
            Object object = unsafe.getObject(t2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + W(i) + " is present but null: " + t2);
            }
            w1 w1VarU = u(i);
            if (!I(t, iW, i)) {
                if (G(object)) {
                    Object objE = w1VarU.e();
                    w1VarU.a(objE, object);
                    unsafe.putObject(t, jX, objE);
                } else {
                    unsafe.putObject(t, jX, object);
                }
                r0(t, iW, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jX);
            if (!G(object2)) {
                Object objE2 = w1VarU.e();
                w1VarU.a(objE2, object2);
                unsafe.putObject(t, jX, objE2);
                object2 = objE2;
            }
            w1VarU.a(object2, object);
        }
    }

    public final void Q(T t, T t2, int i) {
        int iW0 = w0(i);
        long jX = X(iW0);
        int iW = W(i);
        switch (v0(iW0)) {
            case 0:
                if (B(t2, i)) {
                    hbq.S(t, jX, hbq.A(t2, jX));
                    q0(t, i);
                }
                break;
            case 1:
                if (B(t2, i)) {
                    hbq.T(t, jX, hbq.B(t2, jX));
                    q0(t, i);
                }
                break;
            case 2:
                if (B(t2, i)) {
                    hbq.V(t, jX, hbq.E(t2, jX));
                    q0(t, i);
                }
                break;
            case 3:
                if (B(t2, i)) {
                    hbq.V(t, jX, hbq.E(t2, jX));
                    q0(t, i);
                }
                break;
            case 4:
                if (B(t2, i)) {
                    hbq.U(t, jX, hbq.C(t2, jX));
                    q0(t, i);
                }
                break;
            case 5:
                if (B(t2, i)) {
                    hbq.V(t, jX, hbq.E(t2, jX));
                    q0(t, i);
                }
                break;
            case 6:
                if (B(t2, i)) {
                    hbq.U(t, jX, hbq.C(t2, jX));
                    q0(t, i);
                }
                break;
            case 7:
                if (B(t2, i)) {
                    hbq.M(t, jX, hbq.t(t2, jX));
                    q0(t, i);
                }
                break;
            case 8:
                if (B(t2, i)) {
                    hbq.W(t, jX, hbq.G(t2, jX));
                    q0(t, i);
                }
                break;
            case 9:
                O(t, t2, i);
                break;
            case 10:
                if (B(t2, i)) {
                    hbq.W(t, jX, hbq.G(t2, jX));
                    q0(t, i);
                }
                break;
            case 11:
                if (B(t2, i)) {
                    hbq.U(t, jX, hbq.C(t2, jX));
                    q0(t, i);
                }
                break;
            case 12:
                if (B(t2, i)) {
                    hbq.U(t, jX, hbq.C(t2, jX));
                    q0(t, i);
                }
                break;
            case 13:
                if (B(t2, i)) {
                    hbq.U(t, jX, hbq.C(t2, jX));
                    q0(t, i);
                }
                break;
            case 14:
                if (B(t2, i)) {
                    hbq.V(t, jX, hbq.E(t2, jX));
                    q0(t, i);
                }
                break;
            case 15:
                if (B(t2, i)) {
                    hbq.U(t, jX, hbq.C(t2, jX));
                    q0(t, i);
                }
                break;
            case 16:
                if (B(t2, i)) {
                    hbq.V(t, jX, hbq.E(t2, jX));
                    q0(t, i);
                }
                break;
            case 17:
                O(t, t2, i);
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
                this.n.d(t, t2, jX);
                break;
            case 50:
                x1.F(this.q, t, t2, jX);
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
                if (I(t2, iW, i)) {
                    hbq.W(t, jX, hbq.G(t2, jX));
                    r0(t, iW, i);
                }
                break;
            case 60:
                P(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (I(t2, iW, i)) {
                    hbq.W(t, jX, hbq.G(t2, jX));
                    r0(t, iW, i);
                }
                break;
            case 68:
                P(t, t2, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object R(T t, int i) {
        w1 w1VarU = u(i);
        long jX = X(w0(i));
        if (!B(t, i)) {
            return w1VarU.e();
        }
        Object object = s.getObject(t, jX);
        if (G(object)) {
            return object;
        }
        Object objE = w1VarU.e();
        if (object != null) {
            w1VarU.a(objE, object);
        }
        return objE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object S(T t, int i, int i2) {
        w1 w1VarU = u(i2);
        if (!I(t, i, i2)) {
            return w1VarU.e();
        }
        Object object = s.getObject(t, X(w0(i2)));
        if (G(object)) {
            return object;
        }
        Object objE = w1VarU.e();
        if (object != null) {
            w1VarU.a(objE, object);
        }
        return objE;
    }

    public final int W(int i) {
        return this.f2524a[i];
    }

    @Override // androidx.health.platform.client.proto.w1
    public void a(T t, T t2) {
        k(t);
        t2.getClass();
        for (int i = 0; i < this.f2524a.length; i += 3) {
            Q(t, t2, i);
        }
        x1.G(this.o, t, t2);
        if (this.f) {
            x1.E(this.p, t, t2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[SYNTHETIC] */
    @Override // androidx.health.platform.client.proto.w1
    public final boolean b(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f2526k) {
            int i6 = this.j[i5];
            int iW = W(i6);
            int iW0 = w0(i6);
            int i7 = this.f2524a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = s.getInt(t, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (J(iW0) && !C(t, i6, i, i2, i9)) {
                return false;
            }
            int iV0 = v0(iW0);
            if (iV0 == 9 || iV0 == 17) {
                if (C(t, i6, i, i2, i9) && !D(t, iW0, u(i6))) {
                    return false;
                }
            } else if (iV0 == 27) {
                if (!E(t, iW0, i6)) {
                    return false;
                }
            } else if (iV0 == 60 || iV0 == 68) {
                if (I(t, iW, i6) && !D(t, iW0, u(i6))) {
                    return false;
                }
            } else if (iV0 != 49) {
                if (iV0 == 50 && !F(t, iW0, i6)) {
                    return false;
                }
            } else if (!E(t, iW0, i6)) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.f || this.p.c(t).p();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.health.platform.client.proto.w1
    public void c(T t) {
        if (G(t)) {
            if (t instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                generatedMessageLite.l();
                generatedMessageLite.k();
                generatedMessageLite.C();
            }
            int length = this.f2524a.length;
            for (int i = 0; i < length; i += 3) {
                int iW0 = w0(i);
                long jX = X(iW0);
                int iV0 = v0(iW0);
                if (iV0 != 9) {
                    if (iV0 != 60 && iV0 != 68) {
                        switch (iV0) {
                            case 17:
                                if (B(t, i)) {
                                    u(i).c(s.getObject(t, jX));
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
                                this.n.c(t, jX);
                                break;
                            case 50:
                                Unsafe unsafe = s;
                                Object object = unsafe.getObject(t, jX);
                                if (object != null) {
                                    unsafe.putObject(t, jX, this.q.c(object));
                                }
                                break;
                        }
                    } else if (I(t, W(i), i)) {
                        u(i).c(s.getObject(t, jX));
                    }
                } else if (B(t, i)) {
                    u(i).c(s.getObject(t, jX));
                }
            }
            this.o.j(t);
            if (this.f) {
                this.p.f(t);
            }
        }
    }

    @Override // androidx.health.platform.client.proto.w1
    public int d(T t) {
        return this.h ? x(t) : w(t);
    }

    public final <K, V> int d0(T t, byte[] bArr, int i, int i2, int i3, long j, d.b bVar) throws IOException {
        Unsafe unsafe = s;
        Object objT = t(i3);
        Object object = unsafe.getObject(t, j);
        if (this.q.h(object)) {
            Object objF = this.q.f(objT);
            this.q.a(objF, object);
            unsafe.putObject(t, j, objF);
            object = objF;
        }
        return l(bArr, i, i2, this.q.b(objT), this.q.e(object), bVar);
    }

    @Override // androidx.health.platform.client.proto.w1
    public T e() {
        return (T) this.m.a(this.e);
    }

    public final int e0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, d.b bVar) throws IOException {
        Unsafe unsafe = s;
        long j2 = this.f2524a[i8 + 2] & 1048575;
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
                unsafe.putObject(t, j, Long.valueOf(bVar.f2483b));
                unsafe.putInt(t, j2, i4);
                return iL;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int I = d.I(bArr, i, bVar);
                unsafe.putObject(t, j, Integer.valueOf(bVar.f2482a));
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
                unsafe.putObject(t, j, Boolean.valueOf(bVar.f2483b != 0));
                unsafe.putInt(t, j2, i4);
                return iL2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int I2 = d.I(bArr, i, bVar);
                int i13 = bVar.f2482a;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !e2.t(bArr, I2, I2 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t, j, new String(bArr, I2, i13, f0.f2490b));
                    I2 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return I2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objS = S(t, i4, i8);
                int iO = d.O(objS, u(i8), bArr, i, i2, bVar);
                u0(t, i4, i8, objS);
                return iO;
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
                int i14 = bVar.f2482a;
                f0.e eVarS = s(i8);
                if (eVarS == null || eVarS.isInRange(i14)) {
                    unsafe.putObject(t, j, Integer.valueOf(i14));
                    unsafe.putInt(t, j2, i4);
                } else {
                    v(t).n(i3, Long.valueOf(i14));
                }
                return I3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int I4 = d.I(bArr, i, bVar);
                unsafe.putObject(t, j, Integer.valueOf(h.b(bVar.f2482a)));
                unsafe.putInt(t, j2, i4);
                return I4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iL3 = d.L(bArr, i, bVar);
                unsafe.putObject(t, j, Long.valueOf(h.c(bVar.f2483b)));
                unsafe.putInt(t, j2, i4);
                return iL3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                Object objS2 = S(t, i4, i8);
                int iN = d.N(objS2, u(i8), bArr, i, i2, (i3 & (-8)) | 4, bVar);
                u0(t, i4, i8, objS2);
                return iN;
            default:
                return i;
        }
    }

    @Override // androidx.health.platform.client.proto.w1
    public boolean equals(T t, T t2) {
        int length = this.f2524a.length;
        for (int i = 0; i < length; i += 3) {
            if (!o(t, t2, i)) {
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

    @Override // androidx.health.platform.client.proto.w1
    public void f(T t, byte[] bArr, int i, int i2, d.b bVar) throws IOException {
        if (this.h) {
            g0(t, bArr, i, i2, bVar);
        } else {
            f0(t, bArr, i, i2, 0, bVar);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0090. Please report as an issue. */
    public int f0(T t, byte[] bArr, int i, int i2, int i3, d.b bVar) throws IOException {
        Unsafe unsafe;
        q0<T> q0Var;
        int i4;
        int i5;
        int i6;
        int i7;
        T t2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr2;
        int iL;
        int i19;
        int i20;
        q0<T> q0Var2 = this;
        T t3 = t;
        byte[] bArr3 = bArr;
        int i21 = i2;
        i3 = i3;
        d.b bVar2 = bVar;
        k(t);
        Unsafe unsafe2 = s;
        int iG = i;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = -1;
        int i26 = 1048575;
        while (true) {
            if (iG < i21) {
                int i27 = iG + 1;
                byte b2 = bArr3[iG];
                if (b2 < 0) {
                    int iH = d.H(b2, bArr3, i27, bVar2);
                    i8 = bVar2.f2482a;
                    i27 = iH;
                } else {
                    i8 = b2;
                }
                int i28 = i8 >>> 3;
                int i29 = i8 & 7;
                int iJ0 = i28 > i25 ? q0Var2.j0(i28, i22 / 3) : q0Var2.i0(i28);
                if (iJ0 == -1) {
                    i9 = i28;
                    i10 = i27;
                    i5 = i8;
                    i11 = i24;
                    i12 = i26;
                    unsafe = unsafe2;
                    i3 = i3;
                    i13 = 0;
                } else {
                    int i30 = q0Var2.f2524a[iJ0 + 1];
                    int iV0 = v0(i30);
                    long jX = X(i30);
                    int i31 = i8;
                    if (iV0 <= 17) {
                        int i32 = q0Var2.f2524a[iJ0 + 2];
                        int i33 = 1 << (i32 >>> 20);
                        int i34 = i32 & 1048575;
                        if (i34 != i26) {
                            if (i26 != 1048575) {
                                unsafe2.putInt(t3, i26, i24);
                            }
                            i15 = i34;
                            i14 = unsafe2.getInt(t3, i34);
                        } else {
                            i14 = i24;
                            i15 = i26;
                        }
                        switch (iV0) {
                            case 0:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 1) {
                                    hbq.S(t3, jX, d.d(bArr2, i27));
                                    iG = i27 + 8;
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 5) {
                                    hbq.T(t3, jX, d.l(bArr2, i27));
                                    iG = i27 + 4;
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 0) {
                                    iL = d.L(bArr2, i27, bVar2);
                                    unsafe2.putLong(t, jX, bVar2.f2483b);
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    iG = iL;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 0) {
                                    iG = d.I(bArr2, i27, bVar2);
                                    unsafe2.putInt(t3, jX, bVar2.f2482a);
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 1) {
                                    unsafe2.putLong(t, jX, d.j(bArr2, i27));
                                    iG = i27 + 8;
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 5) {
                                    unsafe2.putInt(t3, jX, d.h(bArr2, i27));
                                    iG = i27 + 4;
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 0) {
                                    iG = d.L(bArr2, i27, bVar2);
                                    hbq.M(t3, jX, bVar2.f2483b != 0);
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 2) {
                                    iG = (536870912 & i30) == 0 ? d.C(bArr2, i27, bVar2) : d.F(bArr2, i27, bVar2);
                                    unsafe2.putObject(t3, jX, bVar2.c);
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 2) {
                                    Object objR = q0Var2.R(t3, i18);
                                    iG = d.O(objR, q0Var2.u(i18), bArr, i27, i2, bVar);
                                    q0Var2.t0(t3, i18, objR);
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 2) {
                                    iG = d.b(bArr2, i27, bVar2);
                                    unsafe2.putObject(t3, jX, bVar2.c);
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 12:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 0) {
                                    iG = d.I(bArr2, i27, bVar2);
                                    int i35 = bVar2.f2482a;
                                    f0.e eVarS = q0Var2.s(i18);
                                    if (eVarS == null || eVarS.isInRange(i35)) {
                                        unsafe2.putInt(t3, jX, i35);
                                        i24 = i14 | i33;
                                        i22 = i18;
                                        i23 = i17;
                                        i25 = i9;
                                        i26 = i16;
                                    } else {
                                        v(t).n(i17, Long.valueOf(i35));
                                        i22 = i18;
                                        i24 = i14;
                                        i23 = i17;
                                        i25 = i9;
                                        i26 = i16;
                                        i3 = i3;
                                    }
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                if (i29 == 0) {
                                    iG = d.I(bArr2, i27, bVar2);
                                    unsafe2.putInt(t3, jX, h.b(bVar2.f2482a));
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 16:
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                bArr2 = bArr;
                                if (i29 == 0) {
                                    iL = d.L(bArr2, i27, bVar2);
                                    unsafe2.putLong(t, jX, h.c(bVar2.f2483b));
                                    i24 = i14 | i33;
                                    i22 = i18;
                                    iG = iL;
                                    i23 = i17;
                                    i25 = i9;
                                    i26 = i16;
                                    bArr3 = bArr2;
                                } else {
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            case 17:
                                if (i29 == 3) {
                                    Object objR2 = q0Var2.R(t3, iJ0);
                                    iG = d.N(objR2, q0Var2.u(iJ0), bArr, i27, i2, (i28 << 3) | 4, bVar);
                                    q0Var2.t0(t3, iJ0, objR2);
                                    i24 = i14 | i33;
                                    i26 = i15;
                                    i3 = i3;
                                    i22 = iJ0;
                                    i23 = i31;
                                    i25 = i28;
                                    bArr3 = bArr;
                                } else {
                                    i9 = i28;
                                    i16 = i15;
                                    i17 = i31;
                                    i18 = iJ0;
                                    i12 = i16;
                                    i3 = i3;
                                    i10 = i27;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i11 = i14;
                                    i5 = i17;
                                }
                                break;
                            default:
                                i9 = i28;
                                i18 = iJ0;
                                i16 = i15;
                                i17 = i31;
                                i12 = i16;
                                i3 = i3;
                                i10 = i27;
                                i13 = i18;
                                unsafe = unsafe2;
                                i11 = i14;
                                i5 = i17;
                                break;
                        }
                    } else {
                        i9 = i28;
                        i12 = i26;
                        i11 = i24;
                        if (iV0 == 27) {
                            if (i29 == 2) {
                                f0.i iVarA = (f0.i) unsafe2.getObject(t3, jX);
                                if (!iVarA.c()) {
                                    int size = iVarA.size();
                                    iVarA = iVarA.a(size == 0 ? 10 : size * 2);
                                    unsafe2.putObject(t3, jX, iVarA);
                                }
                                iG = d.q(q0Var2.u(iJ0), i31, bArr, i27, i2, iVarA, bVar);
                                i22 = iJ0;
                                i23 = i31;
                                i26 = i12;
                                i24 = i11;
                                i25 = i9;
                                bArr3 = bArr;
                                i3 = i3;
                            } else {
                                i19 = i27;
                                unsafe = unsafe2;
                                i13 = iJ0;
                                i20 = i31;
                                i10 = i19;
                                i5 = i20;
                            }
                        } else if (iV0 <= 49) {
                            int i36 = i27;
                            unsafe = unsafe2;
                            i13 = iJ0;
                            i20 = i31;
                            iG = h0(t, bArr, i27, i2, i31, i9, i29, iJ0, i30, iV0, jX, bVar);
                            if (iG != i36) {
                                q0Var2 = this;
                                t3 = t;
                                bArr3 = bArr;
                                i21 = i2;
                                i3 = i3;
                                bVar2 = bVar;
                                i26 = i12;
                                i24 = i11;
                                i22 = i13;
                                i23 = i20;
                                i25 = i9;
                                unsafe2 = unsafe;
                            } else {
                                i10 = iG;
                                i5 = i20;
                            }
                        } else {
                            i19 = i27;
                            unsafe = unsafe2;
                            i13 = iJ0;
                            i20 = i31;
                            if (iV0 != 50) {
                                iG = e0(t, bArr, i19, i2, i20, i9, i29, i30, iV0, jX, i13, bVar);
                                if (iG != i19) {
                                    q0Var2 = this;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i21 = i2;
                                    i3 = i3;
                                    bVar2 = bVar;
                                    i26 = i12;
                                    i24 = i11;
                                    i22 = i13;
                                    i23 = i20;
                                    i25 = i9;
                                    unsafe2 = unsafe;
                                } else {
                                    i10 = iG;
                                    i5 = i20;
                                }
                            } else if (i29 == 2) {
                                iG = d0(t, bArr, i19, i2, i13, jX, bVar);
                                if (iG != i19) {
                                    q0Var2 = this;
                                    t3 = t;
                                    bArr3 = bArr;
                                    i21 = i2;
                                    i3 = i3;
                                    bVar2 = bVar;
                                    i26 = i12;
                                    i24 = i11;
                                    i22 = i13;
                                    i23 = i20;
                                    i25 = i9;
                                    unsafe2 = unsafe;
                                } else {
                                    i10 = iG;
                                    i5 = i20;
                                }
                            } else {
                                i10 = i19;
                                i5 = i20;
                            }
                        }
                    }
                }
                if (i5 != i3 || i3 == 0) {
                    iG = (!this.f || bVar.d == y.b()) ? d.G(i5, bArr, i10, i2, v(t), bVar) : d.g(i5, bArr, i10, i2, t, this.e, this.o, bVar);
                    t3 = t;
                    bArr3 = bArr;
                    i21 = i2;
                    i23 = i5;
                    q0Var2 = this;
                    bVar2 = bVar;
                    i26 = i12;
                    i24 = i11;
                    i22 = i13;
                    i25 = i9;
                    unsafe2 = unsafe;
                    i3 = i3;
                } else {
                    i7 = 1048575;
                    q0Var = this;
                    i4 = i10;
                    i6 = i12;
                    i24 = i11;
                }
            } else {
                int i37 = i26;
                unsafe = unsafe2;
                i3 = i3;
                q0Var = q0Var2;
                i4 = iG;
                i5 = i23;
                i6 = i37;
                i7 = 1048575;
            }
        }
        if (i6 != i7) {
            t2 = t;
            unsafe.putInt(t2, i6, i24);
        } else {
            t2 = t;
        }
        c2 c2Var = null;
        for (int i38 = q0Var.f2526k; i38 < q0Var.l; i38++) {
            c2Var = (c2) p(t, q0Var.j[i38], c2Var, q0Var.o, t);
        }
        if (c2Var != null) {
            q0Var.o.o(t2, c2Var);
        }
        if (i3 == 0) {
            if (i4 != i2) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i4 > i2 || i5 != i3) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i4;
    }

    @Override // androidx.health.platform.client.proto.w1
    public void g(T t, Writer writer) throws IOException {
        if (writer.B() == Writer.FieldOrder.DESCENDING) {
            z0(t, writer);
        } else if (this.h) {
            y0(t, writer);
        } else {
            x0(t, writer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b2 A[PHI: r0 r19 r22 r26 r27 r28
      0x02b2: PHI (r0v18 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v5 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r22v1 int) = (r22v0 int), (r22v0 int), (r22v3 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r26v2 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r27v4 int) = (r27v3 int), (r27v3 int), (r27v6 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r28v5 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x029a A[PHI: r0 r19 r22 r26 r27 r28
      0x029a: PHI (r0v19 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r19v4 int) = (r19v2 int), (r19v2 int), (r19v5 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r22v2 int) = (r22v0 int), (r22v0 int), (r22v3 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r26v3 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r27v5 int) = (r27v3 int), (r27v3 int), (r27v6 int) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r28v6 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:112:0x0307, B:108:0x02e8, B:98:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0089. Please report as an issue. */
    public final int g0(T t, byte[] bArr, int i, int i2, d.b bVar) throws IOException {
        int i3;
        int iH;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iB;
        this = this;
        t = t;
        bArr = bArr;
        i2 = i2;
        bVar = bVar;
        k(t);
        Unsafe unsafe2 = s;
        int i14 = -1;
        int iG = i;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (iG < i2) {
            int i19 = iG + 1;
            byte b2 = bArr[iG];
            if (b2 < 0) {
                iH = d.H(b2, bArr, i19, bVar);
                i3 = bVar.f2482a;
            } else {
                i3 = b2;
                iH = i19;
            }
            int i20 = i3 >>> 3;
            int i21 = i3 & 7;
            int iJ0 = i20 > i15 ? this.j0(i20, i16 / 3) : this.i0(i20);
            if (iJ0 == i14) {
                i4 = iH;
                i5 = i20;
                i6 = i14;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int i22 = this.f2524a[iJ0 + 1];
                int iV0 = v0(i22);
                long jX = X(i22);
                if (iV0 <= 17) {
                    int i23 = this.f2524a[iJ0 + 2];
                    int i24 = 1 << (i23 >>> 20);
                    int i25 = 1048575;
                    int i26 = i23 & 1048575;
                    if (i26 != i18) {
                        if (i18 != 1048575) {
                            unsafe2.putInt(t, i18, i17);
                            i25 = 1048575;
                        }
                        if (i26 != i25) {
                            i17 = unsafe2.getInt(t, i26);
                        }
                        i18 = i26;
                    }
                    switch (iV0) {
                        case 0:
                            i5 = i20;
                            i11 = iJ0;
                            i12 = iH;
                            i13 = i17;
                            if (i21 != 1) {
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                hbq.S(t, jX, d.d(bArr, i12));
                                iG = i12 + 8;
                                i17 = i13 | i24;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 1:
                            i5 = i20;
                            bVar = bVar;
                            i12 = iH;
                            i13 = i17;
                            i11 = iJ0;
                            if (i21 != 5) {
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                hbq.T(t, jX, d.l(bArr, i12));
                                iG = i12 + 4;
                                i17 = i13 | i24;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i5 = i20;
                            bVar = bVar;
                            i11 = iJ0;
                            i12 = iH;
                            i13 = i17;
                            if (i21 != 0) {
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                int iL = d.L(bArr, i12, bVar);
                                unsafe2.putLong(t, jX, bVar.f2483b);
                                i17 = i13 | i24;
                                i16 = i11;
                                iG = iL;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            i5 = i20;
                            bVar = bVar;
                            i11 = iJ0;
                            i12 = iH;
                            i13 = i17;
                            if (i21 != 0) {
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                iG = d.I(bArr, i12, bVar);
                                unsafe2.putInt(t, jX, bVar.f2482a);
                                i17 = i13 | i24;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i5 = i20;
                            i11 = iJ0;
                            i13 = i17;
                            if (i21 != 1) {
                                i12 = iH;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                i12 = iH;
                                unsafe2.putLong(t, jX, d.j(bArr, iH));
                                iG = i12 + 8;
                                i17 = i13 | i24;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i5 = i20;
                            bVar = bVar;
                            i13 = i17;
                            i11 = iJ0;
                            if (i21 != 5) {
                                i12 = iH;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                unsafe2.putInt(t, jX, d.h(bArr, iH));
                                iG = iH + 4;
                                i17 = i13 | i24;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 7:
                            i5 = i20;
                            bVar = bVar;
                            i11 = iJ0;
                            i13 = i17;
                            if (i21 != 0) {
                                i12 = iH;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                int iL2 = d.L(bArr, iH, bVar);
                                hbq.M(t, jX, bVar.f2483b != 0);
                                i17 = i13 | i24;
                                iG = iL2;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 8:
                            i5 = i20;
                            bVar = bVar;
                            i11 = iJ0;
                            i13 = i17;
                            if (i21 != 2) {
                                i12 = iH;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                iG = (536870912 & i22) == 0 ? d.C(bArr, iH, bVar) : d.F(bArr, iH, bVar);
                                unsafe2.putObject(t, jX, bVar.c);
                                i17 = i13 | i24;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 9:
                            i5 = i20;
                            bVar = bVar;
                            i11 = iJ0;
                            if (i21 != 2) {
                                i12 = iH;
                                i13 = i17;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                Object objR = this.R(t, i11);
                                iG = d.O(objR, this.u(i11), bArr, iH, i2, bVar);
                                this.t0(t, i11, objR);
                                i17 |= i24;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 10:
                            i5 = i20;
                            bVar = bVar;
                            i11 = iJ0;
                            if (i21 != 2) {
                                i12 = iH;
                                i13 = i17;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                iB = d.b(bArr, iH, bVar);
                                unsafe2.putObject(t, jX, bVar.c);
                                i17 |= i24;
                                iG = iB;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 12:
                            i5 = i20;
                            bVar = bVar;
                            i11 = iJ0;
                            if (i21 != 0) {
                                i12 = iH;
                                i13 = i17;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                iB = d.I(bArr, iH, bVar);
                                unsafe2.putInt(t, jX, bVar.f2482a);
                                i17 |= i24;
                                iG = iB;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 15:
                            i5 = i20;
                            bVar = bVar;
                            i11 = iJ0;
                            if (i21 != 0) {
                                i12 = iH;
                                i13 = i17;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                iG = d.I(bArr, iH, bVar);
                                unsafe2.putInt(t, jX, h.b(bVar.f2482a));
                                i17 |= i24;
                                i16 = i11;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        case 16:
                            if (i21 != 0) {
                                i5 = i20;
                                i11 = iJ0;
                                i12 = iH;
                                i13 = i17;
                                i17 = i13;
                                i7 = i11;
                                unsafe = unsafe2;
                                i4 = i12;
                                i6 = -1;
                            } else {
                                bVar = bVar;
                                int iL3 = d.L(bArr, iH, bVar);
                                i5 = i20;
                                unsafe2.putLong(t, jX, h.c(bVar.f2483b));
                                i17 |= i24;
                                i16 = iJ0;
                                iG = iL3;
                                i15 = i5;
                                i14 = -1;
                            }
                            break;
                        default:
                            i5 = i20;
                            i11 = iJ0;
                            i12 = iH;
                            i13 = i17;
                            i17 = i13;
                            i7 = i11;
                            unsafe = unsafe2;
                            i4 = i12;
                            i6 = -1;
                            break;
                    }
                } else {
                    i5 = i20;
                    int i27 = i17;
                    bVar = bVar;
                    int i28 = iH;
                    if (iV0 != 27) {
                        if (iV0 <= 49) {
                            i8 = i27;
                            i7 = iJ0;
                            i6 = -1;
                            unsafe = unsafe2;
                            i9 = i18;
                            iG = h0(t, bArr, i28, i2, i3, i5, i21, iJ0, i22, iV0, jX, bVar);
                            if (iG != i28) {
                                i15 = i5;
                                i14 = i6;
                                i18 = i9;
                                i17 = i8;
                            } else {
                                i4 = iG;
                                i18 = i9;
                                i17 = i8;
                            }
                        } else {
                            i8 = i27;
                            i9 = i18;
                            i7 = iJ0;
                            unsafe = unsafe2;
                            i10 = i28;
                            i6 = -1;
                            if (iV0 == 50) {
                                if (i21 == 2) {
                                    iG = d0(t, bArr, i10, i2, i7, jX, bVar);
                                    if (iG != i10) {
                                        i15 = i5;
                                        i14 = i6;
                                        i18 = i9;
                                        i17 = i8;
                                    } else {
                                        i4 = iG;
                                    }
                                }
                                i18 = i9;
                                i17 = i8;
                            } else {
                                iG = e0(t, bArr, i10, i2, i3, i5, i21, i22, iV0, jX, i7, bVar);
                                if (iG != i10) {
                                    i15 = i5;
                                    i14 = i6;
                                    i18 = i9;
                                    i17 = i8;
                                } else {
                                    i4 = iG;
                                    i18 = i9;
                                    i17 = i8;
                                }
                            }
                        }
                        i16 = i7;
                        unsafe2 = unsafe;
                    } else if (i21 == 2) {
                        f0.i iVarA = (f0.i) unsafe2.getObject(t, jX);
                        if (!iVarA.c()) {
                            int size = iVarA.size();
                            iVarA = iVarA.a(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(t, jX, iVarA);
                        }
                        iG = d.q(this.u(iJ0), i3, bArr, i28, i2, iVarA, bVar);
                        i16 = iJ0;
                        i17 = i27;
                        i15 = i5;
                        i14 = -1;
                    } else {
                        i9 = i18;
                        i7 = iJ0;
                        unsafe = unsafe2;
                        i10 = i28;
                        i8 = i27;
                        i6 = -1;
                    }
                    i4 = i10;
                    i18 = i9;
                    i17 = i8;
                }
            }
            iG = d.G(i3, bArr, i4, i2, v(t), bVar);
            i15 = i5;
            i14 = i6;
            i16 = i7;
            unsafe2 = unsafe;
        }
        int i29 = i17;
        Unsafe unsafe3 = unsafe2;
        if (i18 != 1048575) {
            unsafe3.putInt(t, i18, i29);
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    @Override // androidx.health.platform.client.proto.w1
    public void h(T t, w0 w0Var, y yVar) throws Throwable {
        yVar.getClass();
        k(t);
        M(this.o, this.p, t, w0Var, yVar);
    }

    public final int h0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, d.b bVar) throws IOException {
        int iJ;
        Unsafe unsafe = s;
        f0.i iVarA = (f0.i) unsafe.getObject(t, j2);
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
                return i5 == 2 ? d.q(u(i6), i3, bArr, i, i2, iVarA, bVar) : i;
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
                x1.A(t, i4, iVarA, s(i6), null, this.o);
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
                return i5 == 3 ? d.o(u(i6), i3, bArr, i, i2, iVarA, bVar) : i;
            default:
                return i;
        }
    }

    @Override // androidx.health.platform.client.proto.w1
    public int hashCode(T t) {
        int i;
        int iF;
        int length = this.f2524a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iW0 = w0(i3);
            int iW = W(i3);
            long jX = X(iW0);
            int iHashCode = 37;
            switch (v0(iW0)) {
                case 0:
                    i = i2 * 53;
                    iF = f0.f(Double.doubleToLongBits(hbq.A(t, jX)));
                    i2 = i + iF;
                    break;
                case 1:
                    i = i2 * 53;
                    iF = Float.floatToIntBits(hbq.B(t, jX));
                    i2 = i + iF;
                    break;
                case 2:
                    i = i2 * 53;
                    iF = f0.f(hbq.E(t, jX));
                    i2 = i + iF;
                    break;
                case 3:
                    i = i2 * 53;
                    iF = f0.f(hbq.E(t, jX));
                    i2 = i + iF;
                    break;
                case 4:
                    i = i2 * 53;
                    iF = hbq.C(t, jX);
                    i2 = i + iF;
                    break;
                case 5:
                    i = i2 * 53;
                    iF = f0.f(hbq.E(t, jX));
                    i2 = i + iF;
                    break;
                case 6:
                    i = i2 * 53;
                    iF = hbq.C(t, jX);
                    i2 = i + iF;
                    break;
                case 7:
                    i = i2 * 53;
                    iF = f0.c(hbq.t(t, jX));
                    i2 = i + iF;
                    break;
                case 8:
                    i = i2 * 53;
                    iF = ((String) hbq.G(t, jX)).hashCode();
                    i2 = i + iF;
                    break;
                case 9:
                    Object objG = hbq.G(t, jX);
                    if (objG != null) {
                        iHashCode = objG.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iF = hbq.G(t, jX).hashCode();
                    i2 = i + iF;
                    break;
                case 11:
                    i = i2 * 53;
                    iF = hbq.C(t, jX);
                    i2 = i + iF;
                    break;
                case 12:
                    i = i2 * 53;
                    iF = hbq.C(t, jX);
                    i2 = i + iF;
                    break;
                case 13:
                    i = i2 * 53;
                    iF = hbq.C(t, jX);
                    i2 = i + iF;
                    break;
                case 14:
                    i = i2 * 53;
                    iF = f0.f(hbq.E(t, jX));
                    i2 = i + iF;
                    break;
                case 15:
                    i = i2 * 53;
                    iF = hbq.C(t, jX);
                    i2 = i + iF;
                    break;
                case 16:
                    i = i2 * 53;
                    iF = f0.f(hbq.E(t, jX));
                    i2 = i + iF;
                    break;
                case 17:
                    Object objG2 = hbq.G(t, jX);
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
                    iF = hbq.G(t, jX).hashCode();
                    i2 = i + iF;
                    break;
                case 50:
                    i = i2 * 53;
                    iF = hbq.G(t, jX).hashCode();
                    i2 = i + iF;
                    break;
                case 51:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = f0.f(Double.doubleToLongBits(Z(t, jX)));
                        i2 = i + iF;
                    }
                    break;
                case 52:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = Float.floatToIntBits(a0(t, jX));
                        i2 = i + iF;
                    }
                    break;
                case 53:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = f0.f(c0(t, jX));
                        i2 = i + iF;
                    }
                    break;
                case 54:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = f0.f(c0(t, jX));
                        i2 = i + iF;
                    }
                    break;
                case 55:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = b0(t, jX);
                        i2 = i + iF;
                    }
                    break;
                case 56:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = f0.f(c0(t, jX));
                        i2 = i + iF;
                    }
                    break;
                case 57:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = b0(t, jX);
                        i2 = i + iF;
                    }
                    break;
                case 58:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = f0.c(Y(t, jX));
                        i2 = i + iF;
                    }
                    break;
                case 59:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = ((String) hbq.G(t, jX)).hashCode();
                        i2 = i + iF;
                    }
                    break;
                case 60:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = hbq.G(t, jX).hashCode();
                        i2 = i + iF;
                    }
                    break;
                case 61:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = hbq.G(t, jX).hashCode();
                        i2 = i + iF;
                    }
                    break;
                case 62:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = b0(t, jX);
                        i2 = i + iF;
                    }
                    break;
                case 63:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = b0(t, jX);
                        i2 = i + iF;
                    }
                    break;
                case 64:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = b0(t, jX);
                        i2 = i + iF;
                    }
                    break;
                case 65:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = f0.f(c0(t, jX));
                        i2 = i + iF;
                    }
                    break;
                case 66:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = b0(t, jX);
                        i2 = i + iF;
                    }
                    break;
                case 67:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = f0.f(c0(t, jX));
                        i2 = i + iF;
                    }
                    break;
                case 68:
                    if (I(t, iW, i3)) {
                        i = i2 * 53;
                        iF = hbq.G(t, jX).hashCode();
                        i2 = i + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.o.g(t).hashCode();
        return this.f ? (iHashCode2 * 53) + this.p.c(t).hashCode() : iHashCode2;
    }

    public final boolean i(T t, T t2, int i) {
        return B(t, i) == B(t2, i);
    }

    public final int i0(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return s0(i, 0);
    }

    public final int j0(int i, int i2) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return s0(i, i2);
    }

    public final int k0(int i) {
        return this.f2524a[i + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> int l(byte[] bArr, int i, int i2, l0.a<K, V> aVar, Map<K, V> map, d.b bVar) throws IOException {
        int iH;
        int I = d.I(bArr, i, bVar);
        int i3 = bVar.f2482a;
        if (i3 < 0 || i3 > i2 - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = I + i3;
        Object obj = aVar.f2517b;
        Object obj2 = aVar.d;
        while (I < i4) {
            int i5 = I + 1;
            int i6 = bArr[I];
            if (i6 < 0) {
                iH = d.H(i6, bArr, i5, bVar);
                i6 = bVar.f2482a;
            } else {
                iH = i5;
            }
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i7 != 1) {
                if (i7 == 2 && i8 == aVar.c.getWireType()) {
                    I = m(bArr, iH, i2, aVar.c, aVar.d.getClass(), bVar);
                    obj2 = bVar.c;
                } else {
                    I = d.P(i6, bArr, iH, i2, bVar);
                }
            } else if (i8 == aVar.f2516a.getWireType()) {
                I = m(bArr, iH, i2, aVar.f2516a, null, bVar);
                obj = bVar.c;
            } else {
                I = d.P(i6, bArr, iH, i2, bVar);
            }
        }
        if (I != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i4;
    }

    public final <E> void l0(Object obj, long j, w0 w0Var, w1<E> w1Var, y yVar) throws IOException {
        w0Var.K(this.n.e(obj, j), w1Var, yVar);
    }

    public final int m(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class<?> cls, d.b bVar) throws IOException {
        switch (a.f2527a[fieldType.ordinal()]) {
            case 1:
                int iL = d.L(bArr, i, bVar);
                bVar.c = Boolean.valueOf(bVar.f2483b != 0);
                return iL;
            case 2:
                return d.b(bArr, i, bVar);
            case 3:
                bVar.c = Double.valueOf(d.d(bArr, i));
                return i + 8;
            case 4:
            case 5:
                bVar.c = Integer.valueOf(d.h(bArr, i));
                return i + 4;
            case 6:
            case 7:
                bVar.c = Long.valueOf(d.j(bArr, i));
                return i + 8;
            case 8:
                bVar.c = Float.valueOf(d.l(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int I = d.I(bArr, i, bVar);
                bVar.c = Integer.valueOf(bVar.f2482a);
                return I;
            case 12:
            case 13:
                int iL2 = d.L(bArr, i, bVar);
                bVar.c = Long.valueOf(bVar.f2483b);
                return iL2;
            case 14:
                return d.p(vdi.a().c(cls), bArr, i, i2, bVar);
            case 15:
                int I2 = d.I(bArr, i, bVar);
                bVar.c = Integer.valueOf(h.b(bVar.f2482a));
                return I2;
            case 16:
                int iL3 = d.L(bArr, i, bVar);
                bVar.c = Long.valueOf(h.c(bVar.f2483b));
                return iL3;
            case 17:
                return d.F(bArr, i, bVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final <E> void m0(Object obj, int i, w0 w0Var, w1<E> w1Var, y yVar) throws IOException {
        w0Var.M(this.n.e(obj, X(i)), w1Var, yVar);
    }

    public final void n0(Object obj, int i, w0 w0Var) throws IOException {
        if (A(i)) {
            hbq.W(obj, X(i), w0Var.G());
        } else if (this.g) {
            hbq.W(obj, X(i), w0Var.E());
        } else {
            hbq.W(obj, X(i), w0Var.readBytes());
        }
    }

    public final boolean o(T t, T t2, int i) {
        int iW0 = w0(i);
        long jX = X(iW0);
        switch (v0(iW0)) {
            case 0:
                return i(t, t2, i) && Double.doubleToLongBits(hbq.A(t, jX)) == Double.doubleToLongBits(hbq.A(t2, jX));
            case 1:
                return i(t, t2, i) && Float.floatToIntBits(hbq.B(t, jX)) == Float.floatToIntBits(hbq.B(t2, jX));
            case 2:
                return i(t, t2, i) && hbq.E(t, jX) == hbq.E(t2, jX);
            case 3:
                return i(t, t2, i) && hbq.E(t, jX) == hbq.E(t2, jX);
            case 4:
                return i(t, t2, i) && hbq.C(t, jX) == hbq.C(t2, jX);
            case 5:
                return i(t, t2, i) && hbq.E(t, jX) == hbq.E(t2, jX);
            case 6:
                return i(t, t2, i) && hbq.C(t, jX) == hbq.C(t2, jX);
            case 7:
                return i(t, t2, i) && hbq.t(t, jX) == hbq.t(t2, jX);
            case 8:
                return i(t, t2, i) && x1.K(hbq.G(t, jX), hbq.G(t2, jX));
            case 9:
                return i(t, t2, i) && x1.K(hbq.G(t, jX), hbq.G(t2, jX));
            case 10:
                return i(t, t2, i) && x1.K(hbq.G(t, jX), hbq.G(t2, jX));
            case 11:
                return i(t, t2, i) && hbq.C(t, jX) == hbq.C(t2, jX);
            case 12:
                return i(t, t2, i) && hbq.C(t, jX) == hbq.C(t2, jX);
            case 13:
                return i(t, t2, i) && hbq.C(t, jX) == hbq.C(t2, jX);
            case 14:
                return i(t, t2, i) && hbq.E(t, jX) == hbq.E(t2, jX);
            case 15:
                return i(t, t2, i) && hbq.C(t, jX) == hbq.C(t2, jX);
            case 16:
                return i(t, t2, i) && hbq.E(t, jX) == hbq.E(t2, jX);
            case 17:
                return i(t, t2, i) && x1.K(hbq.G(t, jX), hbq.G(t2, jX));
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
                return x1.K(hbq.G(t, jX), hbq.G(t2, jX));
            case 50:
                return x1.K(hbq.G(t, jX), hbq.G(t2, jX));
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
                return H(t, t2, i) && x1.K(hbq.G(t, jX), hbq.G(t2, jX));
            default:
                return true;
        }
    }

    public final void o0(Object obj, int i, w0 w0Var) throws IOException {
        if (A(i)) {
            w0Var.y(this.n.e(obj, X(i)));
        } else {
            w0Var.m(this.n.e(obj, X(i)));
        }
    }

    public final <UT, UB> UB p(Object obj, int i, UB ub, b2<UT, UB> b2Var, Object obj2) {
        f0.e eVarS;
        int iW = W(i);
        Object objG = hbq.G(obj, X(w0(i)));
        return (objG == null || (eVarS = s(i)) == null) ? ub : (UB) q(i, iW, this.q.e(objG), eVarS, ub, b2Var, obj2);
    }

    public final <K, V, UT, UB> UB q(int i, int i2, Map<K, V> map, f0.e eVar, UB ub, b2<UT, UB> b2Var, Object obj) {
        l0.a<?, ?> aVarB = this.q.b(t(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = b2Var.f(obj);
                }
                ByteString.h hVarNewCodedBuilder = ByteString.newCodedBuilder(l0.b(aVarB, next.getKey(), next.getValue()));
                try {
                    l0.e(hVarNewCodedBuilder.b(), aVarB, next.getKey(), next.getValue());
                    b2Var.d(ub, i2, hVarNewCodedBuilder.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final void q0(T t, int i) {
        int iK0 = k0(i);
        long j = 1048575 & iK0;
        if (j == 1048575) {
            return;
        }
        hbq.U(t, j, (1 << (iK0 >>> 20)) | hbq.C(t, j));
    }

    public final void r0(T t, int i, int i2) {
        hbq.U(t, k0(i2) & 1048575, i);
    }

    public final f0.e s(int i) {
        return (f0.e) this.f2525b[((i / 3) * 2) + 1];
    }

    public final int s0(int i, int i2) {
        int length = (this.f2524a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iW = W(i4);
            if (i == iW) {
                return i4;
            }
            if (i < iW) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final Object t(int i) {
        return this.f2525b[(i / 3) * 2];
    }

    public final void t0(T t, int i, Object obj) {
        s.putObject(t, X(w0(i)), obj);
        q0(t, i);
    }

    public final w1 u(int i) {
        int i2 = (i / 3) * 2;
        w1 w1Var = (w1) this.f2525b[i2];
        if (w1Var != null) {
            return w1Var;
        }
        w1<T> w1VarC = vdi.a().c((Class) this.f2525b[i2 + 1]);
        this.f2525b[i2] = w1VarC;
        return w1VarC;
    }

    public final void u0(T t, int i, int i2, Object obj) {
        s.putObject(t, X(w0(i2)), obj);
        r0(t, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[PHI: r6
      0x0077: PHI (r6v4 int) = 
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
     binds: [B:20:0x005e, B:224:0x04c8, B:221:0x04bd, B:215:0x04a1, B:212:0x048f, B:209:0x047f, B:206:0x0471, B:203:0x0463, B:200:0x0458, B:197:0x044e, B:194:0x0440, B:191:0x0432, B:188:0x041e, B:164:0x032d, B:158:0x030f, B:152:0x02f1, B:146:0x02d3, B:140:0x02b5, B:134:0x0297, B:128:0x0279, B:122:0x025b, B:116:0x023d, B:110:0x0220, B:104:0x0203, B:98:0x01e6, B:92:0x01c9, B:85:0x01a9, B:80:0x0175, B:77:0x0169, B:74:0x0159, B:71:0x0149, B:68:0x0139, B:65:0x012d, B:62:0x0121, B:59:0x0114, B:53:0x00f6, B:50:0x00e3, B:47:0x00d2, B:44:0x00c3, B:41:0x00b4, B:39:0x00ae, B:37:0x00a7, B:34:0x009c, B:31:0x008d, B:28:0x007e, B:25:0x0076, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    public final int w(T t) {
        int i;
        int i2;
        int iJ;
        int iE;
        int iK;
        boolean z;
        int iF;
        int i3;
        int iU;
        int iW;
        Unsafe unsafe = s;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < this.f2524a.length) {
            int iW0 = w0(i6);
            int iW2 = W(i6);
            int iV0 = v0(iW0);
            if (iV0 <= 17) {
                i = this.f2524a[i6 + 2];
                int i9 = i & i4;
                i2 = 1 << (i >>> 20);
                if (i9 != i5) {
                    i8 = unsafe.getInt(t, i9);
                    i5 = i9;
                }
            } else {
                i = (!this.i || iV0 < FieldType.DOUBLE_LIST_PACKED.id() || iV0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f2524a[i6 + 2] & i4;
                i2 = 0;
            }
            long jX = X(iW0);
            switch (iV0) {
                case 0:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.j(iW2, 0.0d);
                        i7 += iJ;
                    }
                    break;
                case 1:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.r(iW2, 0.0f);
                        i7 += iJ;
                    }
                    break;
                case 2:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.y(iW2, unsafe.getLong(t, jX));
                        i7 += iJ;
                    }
                    break;
                case 3:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.X(iW2, unsafe.getLong(t, jX));
                        i7 += iJ;
                    }
                    break;
                case 4:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.w(iW2, unsafe.getInt(t, jX));
                        i7 += iJ;
                    }
                    break;
                case 5:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.p(iW2, 0L);
                        i7 += iJ;
                    }
                    break;
                case 6:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.n(iW2, 0);
                        i7 += iJ;
                    }
                    break;
                case 7:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.e(iW2, true);
                        i7 += iE;
                    }
                    break;
                case 8:
                    if ((i8 & i2) != 0) {
                        Object object = unsafe.getObject(t, jX);
                        iE = object instanceof ByteString ? CodedOutputStream.h(iW2, (ByteString) object) : CodedOutputStream.S(iW2, (String) object);
                        i7 += iE;
                    }
                    break;
                case 9:
                    if ((i8 & i2) != 0) {
                        iE = x1.o(iW2, unsafe.getObject(t, jX), u(i6));
                        i7 += iE;
                    }
                    break;
                case 10:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.h(iW2, (ByteString) unsafe.getObject(t, jX));
                        i7 += iE;
                    }
                    break;
                case 11:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.V(iW2, unsafe.getInt(t, jX));
                        i7 += iE;
                    }
                    break;
                case 12:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.l(iW2, unsafe.getInt(t, jX));
                        i7 += iE;
                    }
                    break;
                case 13:
                    if ((i8 & i2) != 0) {
                        iK = CodedOutputStream.K(iW2, 0);
                        i7 += iK;
                    }
                    break;
                case 14:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.M(iW2, 0L);
                        i7 += iE;
                    }
                    break;
                case 15:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.O(iW2, unsafe.getInt(t, jX));
                        i7 += iE;
                    }
                    break;
                case 16:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.Q(iW2, unsafe.getLong(t, jX));
                        i7 += iE;
                    }
                    break;
                case 17:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.t(iW2, (o0) unsafe.getObject(t, jX), u(i6));
                        i7 += iE;
                    }
                    break;
                case 18:
                    iE = x1.h(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iE;
                    break;
                case 19:
                    z = false;
                    iF = x1.f(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 20:
                    z = false;
                    iF = x1.m(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 21:
                    z = false;
                    iF = x1.x(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 22:
                    z = false;
                    iF = x1.k(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 23:
                    z = false;
                    iF = x1.h(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 24:
                    z = false;
                    iF = x1.f(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 25:
                    z = false;
                    iF = x1.a(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 26:
                    iE = x1.u(iW2, (List) unsafe.getObject(t, jX));
                    i7 += iE;
                    break;
                case 27:
                    iE = x1.p(iW2, (List) unsafe.getObject(t, jX), u(i6));
                    i7 += iE;
                    break;
                case 28:
                    iE = x1.c(iW2, (List) unsafe.getObject(t, jX));
                    i7 += iE;
                    break;
                case 29:
                    iE = x1.v(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iE;
                    break;
                case 30:
                    z = false;
                    iF = x1.d(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 31:
                    z = false;
                    iF = x1.f(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 32:
                    z = false;
                    iF = x1.h(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 33:
                    z = false;
                    iF = x1.q(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 34:
                    z = false;
                    iF = x1.s(iW2, (List) unsafe.getObject(t, jX), false);
                    i7 += iF;
                    break;
                case 35:
                    i3 = x1.i((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 36:
                    i3 = x1.g((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 37:
                    i3 = x1.n((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 38:
                    i3 = x1.y((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 39:
                    i3 = x1.l((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 40:
                    i3 = x1.i((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 41:
                    i3 = x1.g((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 42:
                    i3 = x1.b((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 43:
                    i3 = x1.w((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 44:
                    i3 = x1.e((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 45:
                    i3 = x1.g((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 46:
                    i3 = x1.i((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 47:
                    i3 = x1.r((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 48:
                    i3 = x1.t((List) unsafe.getObject(t, jX));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i3);
                        iK = iU + iW + i3;
                        i7 += iK;
                    }
                    break;
                case 49:
                    iE = x1.j(iW2, (List) unsafe.getObject(t, jX), u(i6));
                    i7 += iE;
                    break;
                case 50:
                    iE = this.q.d(iW2, unsafe.getObject(t, jX), t(i6));
                    i7 += iE;
                    break;
                case 51:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.j(iW2, 0.0d);
                        i7 += iE;
                    }
                    break;
                case 52:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.r(iW2, 0.0f);
                        i7 += iE;
                    }
                    break;
                case 53:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.y(iW2, c0(t, jX));
                        i7 += iE;
                    }
                    break;
                case 54:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.X(iW2, c0(t, jX));
                        i7 += iE;
                    }
                    break;
                case 55:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.w(iW2, b0(t, jX));
                        i7 += iE;
                    }
                    break;
                case 56:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.p(iW2, 0L);
                        i7 += iE;
                    }
                    break;
                case 57:
                    if (I(t, iW2, i6)) {
                        iK = CodedOutputStream.n(iW2, 0);
                        i7 += iK;
                    }
                    break;
                case 58:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.e(iW2, true);
                        i7 += iE;
                    }
                    break;
                case 59:
                    if (I(t, iW2, i6)) {
                        Object object2 = unsafe.getObject(t, jX);
                        iE = object2 instanceof ByteString ? CodedOutputStream.h(iW2, (ByteString) object2) : CodedOutputStream.S(iW2, (String) object2);
                        i7 += iE;
                    }
                    break;
                case 60:
                    if (I(t, iW2, i6)) {
                        iE = x1.o(iW2, unsafe.getObject(t, jX), u(i6));
                        i7 += iE;
                    }
                    break;
                case 61:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.h(iW2, (ByteString) unsafe.getObject(t, jX));
                        i7 += iE;
                    }
                    break;
                case 62:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.V(iW2, b0(t, jX));
                        i7 += iE;
                    }
                    break;
                case 63:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.l(iW2, b0(t, jX));
                        i7 += iE;
                    }
                    break;
                case 64:
                    if (I(t, iW2, i6)) {
                        iK = CodedOutputStream.K(iW2, 0);
                        i7 += iK;
                    }
                    break;
                case 65:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.M(iW2, 0L);
                        i7 += iE;
                    }
                    break;
                case 66:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.O(iW2, b0(t, jX));
                        i7 += iE;
                    }
                    break;
                case 67:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.Q(iW2, c0(t, jX));
                        i7 += iE;
                    }
                    break;
                case 68:
                    if (I(t, iW2, i6)) {
                        iE = CodedOutputStream.t(iW2, (o0) unsafe.getObject(t, jX), u(i6));
                        i7 += iE;
                    }
                    break;
                default:
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        int iY = i7 + y(this.o, t);
        return this.f ? iY + this.p.c(t).l() : iY;
    }

    public final int w0(int i) {
        return this.f2524a[i + 1];
    }

    public final int x(T t) {
        int iJ;
        int i;
        int iU;
        int iW;
        Unsafe unsafe = s;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f2524a.length; i3 += 3) {
            int iW0 = w0(i3);
            int iV0 = v0(iW0);
            int iW2 = W(i3);
            long jX = X(iW0);
            int i4 = (iV0 < FieldType.DOUBLE_LIST_PACKED.id() || iV0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f2524a[i3 + 2] & 1048575;
            switch (iV0) {
                case 0:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.j(iW2, 0.0d);
                        i2 += iJ;
                    }
                    break;
                case 1:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.r(iW2, 0.0f);
                        i2 += iJ;
                    }
                    break;
                case 2:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.y(iW2, hbq.E(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 3:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.X(iW2, hbq.E(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 4:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.w(iW2, hbq.C(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 5:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.p(iW2, 0L);
                        i2 += iJ;
                    }
                    break;
                case 6:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.n(iW2, 0);
                        i2 += iJ;
                    }
                    break;
                case 7:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.e(iW2, true);
                        i2 += iJ;
                    }
                    break;
                case 8:
                    if (B(t, i3)) {
                        Object objG = hbq.G(t, jX);
                        iJ = objG instanceof ByteString ? CodedOutputStream.h(iW2, (ByteString) objG) : CodedOutputStream.S(iW2, (String) objG);
                        i2 += iJ;
                    }
                    break;
                case 9:
                    if (B(t, i3)) {
                        iJ = x1.o(iW2, hbq.G(t, jX), u(i3));
                        i2 += iJ;
                    }
                    break;
                case 10:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.h(iW2, (ByteString) hbq.G(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 11:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.V(iW2, hbq.C(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 12:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.l(iW2, hbq.C(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 13:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.K(iW2, 0);
                        i2 += iJ;
                    }
                    break;
                case 14:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.M(iW2, 0L);
                        i2 += iJ;
                    }
                    break;
                case 15:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.O(iW2, hbq.C(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 16:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.Q(iW2, hbq.E(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 17:
                    if (B(t, i3)) {
                        iJ = CodedOutputStream.t(iW2, (o0) hbq.G(t, jX), u(i3));
                        i2 += iJ;
                    }
                    break;
                case 18:
                    iJ = x1.h(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 19:
                    iJ = x1.f(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 20:
                    iJ = x1.m(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 21:
                    iJ = x1.x(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 22:
                    iJ = x1.k(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 23:
                    iJ = x1.h(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 24:
                    iJ = x1.f(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 25:
                    iJ = x1.a(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 26:
                    iJ = x1.u(iW2, K(t, jX));
                    i2 += iJ;
                    break;
                case 27:
                    iJ = x1.p(iW2, K(t, jX), u(i3));
                    i2 += iJ;
                    break;
                case 28:
                    iJ = x1.c(iW2, K(t, jX));
                    i2 += iJ;
                    break;
                case 29:
                    iJ = x1.v(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 30:
                    iJ = x1.d(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 31:
                    iJ = x1.f(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 32:
                    iJ = x1.h(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 33:
                    iJ = x1.q(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 34:
                    iJ = x1.s(iW2, K(t, jX), false);
                    i2 += iJ;
                    break;
                case 35:
                    i = x1.i((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 36:
                    i = x1.g((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 37:
                    i = x1.n((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 38:
                    i = x1.y((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 39:
                    i = x1.l((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 40:
                    i = x1.i((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 41:
                    i = x1.g((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 42:
                    i = x1.b((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 43:
                    i = x1.w((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 44:
                    i = x1.e((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 45:
                    i = x1.g((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 46:
                    i = x1.i((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 47:
                    i = x1.r((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 48:
                    i = x1.t((List) unsafe.getObject(t, jX));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iU = CodedOutputStream.U(iW2);
                        iW = CodedOutputStream.W(i);
                        iJ = iU + iW + i;
                        i2 += iJ;
                    }
                    break;
                case 49:
                    iJ = x1.j(iW2, K(t, jX), u(i3));
                    i2 += iJ;
                    break;
                case 50:
                    iJ = this.q.d(iW2, hbq.G(t, jX), t(i3));
                    i2 += iJ;
                    break;
                case 51:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.j(iW2, 0.0d);
                        i2 += iJ;
                    }
                    break;
                case 52:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.r(iW2, 0.0f);
                        i2 += iJ;
                    }
                    break;
                case 53:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.y(iW2, c0(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 54:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.X(iW2, c0(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 55:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.w(iW2, b0(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 56:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.p(iW2, 0L);
                        i2 += iJ;
                    }
                    break;
                case 57:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.n(iW2, 0);
                        i2 += iJ;
                    }
                    break;
                case 58:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.e(iW2, true);
                        i2 += iJ;
                    }
                    break;
                case 59:
                    if (I(t, iW2, i3)) {
                        Object objG2 = hbq.G(t, jX);
                        iJ = objG2 instanceof ByteString ? CodedOutputStream.h(iW2, (ByteString) objG2) : CodedOutputStream.S(iW2, (String) objG2);
                        i2 += iJ;
                    }
                    break;
                case 60:
                    if (I(t, iW2, i3)) {
                        iJ = x1.o(iW2, hbq.G(t, jX), u(i3));
                        i2 += iJ;
                    }
                    break;
                case 61:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.h(iW2, (ByteString) hbq.G(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 62:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.V(iW2, b0(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 63:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.l(iW2, b0(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 64:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.K(iW2, 0);
                        i2 += iJ;
                    }
                    break;
                case 65:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.M(iW2, 0L);
                        i2 += iJ;
                    }
                    break;
                case 66:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.O(iW2, b0(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 67:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.Q(iW2, c0(t, jX));
                        i2 += iJ;
                    }
                    break;
                case 68:
                    if (I(t, iW2, i3)) {
                        iJ = CodedOutputStream.t(iW2, (o0) hbq.G(t, jX), u(i3));
                        i2 += iJ;
                    }
                    break;
            }
        }
        return i2 + y(this.o, t);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void x0(T t, Writer writer) throws IOException {
        Iterator itT;
        Map.Entry<?, ?> entry;
        int i;
        if (this.f) {
            c0<T> c0VarC = this.p.c(t);
            if (c0VarC.n()) {
                itT = null;
                entry = null;
            } else {
                itT = c0VarC.t();
                entry = (Map.Entry) itT.next();
            }
        } else {
            itT = null;
            entry = null;
        }
        int length = this.f2524a.length;
        Unsafe unsafe = s;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iW0 = w0(i4);
            int iW = W(i4);
            int iV0 = v0(iW0);
            if (iV0 <= 17) {
                int i6 = this.f2524a[i4 + 2];
                int i7 = i6 & i2;
                if (i7 != i3) {
                    i5 = unsafe.getInt(t, i7);
                    i3 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            while (entry != null && this.p.a(entry) <= iW) {
                this.p.j(writer, entry);
                entry = itT.hasNext() ? (Map.Entry) itT.next() : null;
            }
            long jX = X(iW0);
            switch (iV0) {
                case 0:
                    if ((i & i5) != 0) {
                        writer.z(iW, n(t, jX));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i & i5) != 0) {
                        writer.F(iW, r(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i & i5) != 0) {
                        writer.C(iW, unsafe.getLong(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i & i5) != 0) {
                        writer.e(iW, unsafe.getLong(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i & i5) != 0) {
                        writer.g(iW, unsafe.getInt(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i & i5) != 0) {
                        writer.m(iW, unsafe.getLong(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i & i5) != 0) {
                        writer.c(iW, unsafe.getInt(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i & i5) != 0) {
                        writer.n(iW, j(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i & i5) != 0) {
                        B0(iW, unsafe.getObject(t, jX), writer);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i & i5) != 0) {
                        writer.K(iW, unsafe.getObject(t, jX), u(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i & i5) != 0) {
                        writer.J(iW, (ByteString) unsafe.getObject(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i & i5) != 0) {
                        writer.k(iW, unsafe.getInt(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i & i5) != 0) {
                        writer.G(iW, unsafe.getInt(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i & i5) != 0) {
                        writer.o(iW, unsafe.getInt(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i & i5) != 0) {
                        writer.w(iW, unsafe.getLong(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i & i5) != 0) {
                        writer.I(iW, unsafe.getInt(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        writer.j(iW, unsafe.getLong(t, jX));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i & i5) != 0) {
                        writer.M(iW, unsafe.getObject(t, jX), u(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    x1.P(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    x1.T(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    x1.W(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    x1.e0(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    x1.V(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    x1.S(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    x1.R(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    x1.N(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    x1.c0(W(i4), (List) unsafe.getObject(t, jX), writer);
                    break;
                case 27:
                    x1.X(W(i4), (List) unsafe.getObject(t, jX), writer, u(i4));
                    break;
                case 28:
                    x1.O(W(i4), (List) unsafe.getObject(t, jX), writer);
                    break;
                case 29:
                    x1.d0(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    x1.Q(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    x1.Y(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    x1.Z(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    x1.a0(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    x1.b0(W(i4), (List) unsafe.getObject(t, jX), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    x1.P(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 36:
                    x1.T(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 37:
                    x1.W(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 38:
                    x1.e0(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 39:
                    x1.V(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 40:
                    x1.S(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 41:
                    x1.R(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 42:
                    x1.N(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 43:
                    x1.d0(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 44:
                    x1.Q(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 45:
                    x1.Y(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 46:
                    x1.Z(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 47:
                    x1.a0(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 48:
                    x1.b0(W(i4), (List) unsafe.getObject(t, jX), writer, true);
                    break;
                case 49:
                    x1.U(W(i4), (List) unsafe.getObject(t, jX), writer, u(i4));
                    break;
                case 50:
                    A0(writer, iW, unsafe.getObject(t, jX), i4);
                    break;
                case 51:
                    if (I(t, iW, i4)) {
                        writer.z(iW, Z(t, jX));
                    }
                    break;
                case 52:
                    if (I(t, iW, i4)) {
                        writer.F(iW, a0(t, jX));
                    }
                    break;
                case 53:
                    if (I(t, iW, i4)) {
                        writer.C(iW, c0(t, jX));
                    }
                    break;
                case 54:
                    if (I(t, iW, i4)) {
                        writer.e(iW, c0(t, jX));
                    }
                    break;
                case 55:
                    if (I(t, iW, i4)) {
                        writer.g(iW, b0(t, jX));
                    }
                    break;
                case 56:
                    if (I(t, iW, i4)) {
                        writer.m(iW, c0(t, jX));
                    }
                    break;
                case 57:
                    if (I(t, iW, i4)) {
                        writer.c(iW, b0(t, jX));
                    }
                    break;
                case 58:
                    if (I(t, iW, i4)) {
                        writer.n(iW, Y(t, jX));
                    }
                    break;
                case 59:
                    if (I(t, iW, i4)) {
                        B0(iW, unsafe.getObject(t, jX), writer);
                    }
                    break;
                case 60:
                    if (I(t, iW, i4)) {
                        writer.K(iW, unsafe.getObject(t, jX), u(i4));
                    }
                    break;
                case 61:
                    if (I(t, iW, i4)) {
                        writer.J(iW, (ByteString) unsafe.getObject(t, jX));
                    }
                    break;
                case 62:
                    if (I(t, iW, i4)) {
                        writer.k(iW, b0(t, jX));
                    }
                    break;
                case 63:
                    if (I(t, iW, i4)) {
                        writer.G(iW, b0(t, jX));
                    }
                    break;
                case 64:
                    if (I(t, iW, i4)) {
                        writer.o(iW, b0(t, jX));
                    }
                    break;
                case 65:
                    if (I(t, iW, i4)) {
                        writer.w(iW, c0(t, jX));
                    }
                    break;
                case 66:
                    if (I(t, iW, i4)) {
                        writer.I(iW, b0(t, jX));
                    }
                    break;
                case 67:
                    if (I(t, iW, i4)) {
                        writer.j(iW, c0(t, jX));
                    }
                    break;
                case 68:
                    if (I(t, iW, i4)) {
                        writer.M(iW, unsafe.getObject(t, jX), u(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        while (entry != null) {
            this.p.j(writer, entry);
            entry = itT.hasNext() ? (Map.Entry) itT.next() : null;
        }
        C0(this.o, t, writer);
    }

    public final <UT, UB> int y(b2<UT, UB> b2Var, T t) {
        return b2Var.h(b2Var.g(t));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final void y0(T t, Writer writer) throws IOException {
        Iterator itT;
        Map.Entry<?, ?> entry;
        if (this.f) {
            c0<T> c0VarC = this.p.c(t);
            if (c0VarC.n()) {
                itT = null;
                entry = null;
            } else {
                itT = c0VarC.t();
                entry = (Map.Entry) itT.next();
            }
        } else {
            itT = null;
            entry = null;
        }
        int length = this.f2524a.length;
        for (int i = 0; i < length; i += 3) {
            int iW0 = w0(i);
            int iW = W(i);
            while (entry != null && this.p.a(entry) <= iW) {
                this.p.j(writer, entry);
                entry = itT.hasNext() ? (Map.Entry) itT.next() : null;
            }
            switch (v0(iW0)) {
                case 0:
                    if (B(t, i)) {
                        writer.z(iW, n(t, X(iW0)));
                    }
                    break;
                case 1:
                    if (B(t, i)) {
                        writer.F(iW, r(t, X(iW0)));
                    }
                    break;
                case 2:
                    if (B(t, i)) {
                        writer.C(iW, L(t, X(iW0)));
                    }
                    break;
                case 3:
                    if (B(t, i)) {
                        writer.e(iW, L(t, X(iW0)));
                    }
                    break;
                case 4:
                    if (B(t, i)) {
                        writer.g(iW, z(t, X(iW0)));
                    }
                    break;
                case 5:
                    if (B(t, i)) {
                        writer.m(iW, L(t, X(iW0)));
                    }
                    break;
                case 6:
                    if (B(t, i)) {
                        writer.c(iW, z(t, X(iW0)));
                    }
                    break;
                case 7:
                    if (B(t, i)) {
                        writer.n(iW, j(t, X(iW0)));
                    }
                    break;
                case 8:
                    if (B(t, i)) {
                        B0(iW, hbq.G(t, X(iW0)), writer);
                    }
                    break;
                case 9:
                    if (B(t, i)) {
                        writer.K(iW, hbq.G(t, X(iW0)), u(i));
                    }
                    break;
                case 10:
                    if (B(t, i)) {
                        writer.J(iW, (ByteString) hbq.G(t, X(iW0)));
                    }
                    break;
                case 11:
                    if (B(t, i)) {
                        writer.k(iW, z(t, X(iW0)));
                    }
                    break;
                case 12:
                    if (B(t, i)) {
                        writer.G(iW, z(t, X(iW0)));
                    }
                    break;
                case 13:
                    if (B(t, i)) {
                        writer.o(iW, z(t, X(iW0)));
                    }
                    break;
                case 14:
                    if (B(t, i)) {
                        writer.w(iW, L(t, X(iW0)));
                    }
                    break;
                case 15:
                    if (B(t, i)) {
                        writer.I(iW, z(t, X(iW0)));
                    }
                    break;
                case 16:
                    if (B(t, i)) {
                        writer.j(iW, L(t, X(iW0)));
                    }
                    break;
                case 17:
                    if (B(t, i)) {
                        writer.M(iW, hbq.G(t, X(iW0)), u(i));
                    }
                    break;
                case 18:
                    x1.P(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 19:
                    x1.T(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 20:
                    x1.W(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 21:
                    x1.e0(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 22:
                    x1.V(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 23:
                    x1.S(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 24:
                    x1.R(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 25:
                    x1.N(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 26:
                    x1.c0(W(i), (List) hbq.G(t, X(iW0)), writer);
                    break;
                case 27:
                    x1.X(W(i), (List) hbq.G(t, X(iW0)), writer, u(i));
                    break;
                case 28:
                    x1.O(W(i), (List) hbq.G(t, X(iW0)), writer);
                    break;
                case 29:
                    x1.d0(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 30:
                    x1.Q(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 31:
                    x1.Y(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 32:
                    x1.Z(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 33:
                    x1.a0(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 34:
                    x1.b0(W(i), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 35:
                    x1.P(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 36:
                    x1.T(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 37:
                    x1.W(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 38:
                    x1.e0(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 39:
                    x1.V(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 40:
                    x1.S(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 41:
                    x1.R(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 42:
                    x1.N(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 43:
                    x1.d0(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 44:
                    x1.Q(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 45:
                    x1.Y(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 46:
                    x1.Z(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 47:
                    x1.a0(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 48:
                    x1.b0(W(i), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 49:
                    x1.U(W(i), (List) hbq.G(t, X(iW0)), writer, u(i));
                    break;
                case 50:
                    A0(writer, iW, hbq.G(t, X(iW0)), i);
                    break;
                case 51:
                    if (I(t, iW, i)) {
                        writer.z(iW, Z(t, X(iW0)));
                    }
                    break;
                case 52:
                    if (I(t, iW, i)) {
                        writer.F(iW, a0(t, X(iW0)));
                    }
                    break;
                case 53:
                    if (I(t, iW, i)) {
                        writer.C(iW, c0(t, X(iW0)));
                    }
                    break;
                case 54:
                    if (I(t, iW, i)) {
                        writer.e(iW, c0(t, X(iW0)));
                    }
                    break;
                case 55:
                    if (I(t, iW, i)) {
                        writer.g(iW, b0(t, X(iW0)));
                    }
                    break;
                case 56:
                    if (I(t, iW, i)) {
                        writer.m(iW, c0(t, X(iW0)));
                    }
                    break;
                case 57:
                    if (I(t, iW, i)) {
                        writer.c(iW, b0(t, X(iW0)));
                    }
                    break;
                case 58:
                    if (I(t, iW, i)) {
                        writer.n(iW, Y(t, X(iW0)));
                    }
                    break;
                case 59:
                    if (I(t, iW, i)) {
                        B0(iW, hbq.G(t, X(iW0)), writer);
                    }
                    break;
                case 60:
                    if (I(t, iW, i)) {
                        writer.K(iW, hbq.G(t, X(iW0)), u(i));
                    }
                    break;
                case 61:
                    if (I(t, iW, i)) {
                        writer.J(iW, (ByteString) hbq.G(t, X(iW0)));
                    }
                    break;
                case 62:
                    if (I(t, iW, i)) {
                        writer.k(iW, b0(t, X(iW0)));
                    }
                    break;
                case 63:
                    if (I(t, iW, i)) {
                        writer.G(iW, b0(t, X(iW0)));
                    }
                    break;
                case 64:
                    if (I(t, iW, i)) {
                        writer.o(iW, b0(t, X(iW0)));
                    }
                    break;
                case 65:
                    if (I(t, iW, i)) {
                        writer.w(iW, c0(t, X(iW0)));
                    }
                    break;
                case 66:
                    if (I(t, iW, i)) {
                        writer.I(iW, b0(t, X(iW0)));
                    }
                    break;
                case 67:
                    if (I(t, iW, i)) {
                        writer.j(iW, c0(t, X(iW0)));
                    }
                    break;
                case 68:
                    if (I(t, iW, i)) {
                        writer.M(iW, hbq.G(t, X(iW0)), u(i));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.p.j(writer, entry);
            entry = itT.hasNext() ? (Map.Entry) itT.next() : null;
        }
        C0(this.o, t, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void z0(T t, Writer writer) throws IOException {
        Iterator itG;
        Map.Entry<?, ?> entry;
        C0(this.o, t, writer);
        if (this.f) {
            c0<T> c0VarC = this.p.c(t);
            if (c0VarC.n()) {
                itG = null;
                entry = null;
            } else {
                itG = c0VarC.g();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        for (int length = this.f2524a.length - 3; length >= 0; length -= 3) {
            int iW0 = w0(length);
            int iW = W(length);
            while (entry != null && this.p.a(entry) > iW) {
                this.p.j(writer, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            switch (v0(iW0)) {
                case 0:
                    if (B(t, length)) {
                        writer.z(iW, n(t, X(iW0)));
                    }
                    break;
                case 1:
                    if (B(t, length)) {
                        writer.F(iW, r(t, X(iW0)));
                    }
                    break;
                case 2:
                    if (B(t, length)) {
                        writer.C(iW, L(t, X(iW0)));
                    }
                    break;
                case 3:
                    if (B(t, length)) {
                        writer.e(iW, L(t, X(iW0)));
                    }
                    break;
                case 4:
                    if (B(t, length)) {
                        writer.g(iW, z(t, X(iW0)));
                    }
                    break;
                case 5:
                    if (B(t, length)) {
                        writer.m(iW, L(t, X(iW0)));
                    }
                    break;
                case 6:
                    if (B(t, length)) {
                        writer.c(iW, z(t, X(iW0)));
                    }
                    break;
                case 7:
                    if (B(t, length)) {
                        writer.n(iW, j(t, X(iW0)));
                    }
                    break;
                case 8:
                    if (B(t, length)) {
                        B0(iW, hbq.G(t, X(iW0)), writer);
                    }
                    break;
                case 9:
                    if (B(t, length)) {
                        writer.K(iW, hbq.G(t, X(iW0)), u(length));
                    }
                    break;
                case 10:
                    if (B(t, length)) {
                        writer.J(iW, (ByteString) hbq.G(t, X(iW0)));
                    }
                    break;
                case 11:
                    if (B(t, length)) {
                        writer.k(iW, z(t, X(iW0)));
                    }
                    break;
                case 12:
                    if (B(t, length)) {
                        writer.G(iW, z(t, X(iW0)));
                    }
                    break;
                case 13:
                    if (B(t, length)) {
                        writer.o(iW, z(t, X(iW0)));
                    }
                    break;
                case 14:
                    if (B(t, length)) {
                        writer.w(iW, L(t, X(iW0)));
                    }
                    break;
                case 15:
                    if (B(t, length)) {
                        writer.I(iW, z(t, X(iW0)));
                    }
                    break;
                case 16:
                    if (B(t, length)) {
                        writer.j(iW, L(t, X(iW0)));
                    }
                    break;
                case 17:
                    if (B(t, length)) {
                        writer.M(iW, hbq.G(t, X(iW0)), u(length));
                    }
                    break;
                case 18:
                    x1.P(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 19:
                    x1.T(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 20:
                    x1.W(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 21:
                    x1.e0(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 22:
                    x1.V(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 23:
                    x1.S(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 24:
                    x1.R(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 25:
                    x1.N(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 26:
                    x1.c0(W(length), (List) hbq.G(t, X(iW0)), writer);
                    break;
                case 27:
                    x1.X(W(length), (List) hbq.G(t, X(iW0)), writer, u(length));
                    break;
                case 28:
                    x1.O(W(length), (List) hbq.G(t, X(iW0)), writer);
                    break;
                case 29:
                    x1.d0(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 30:
                    x1.Q(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 31:
                    x1.Y(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 32:
                    x1.Z(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 33:
                    x1.a0(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 34:
                    x1.b0(W(length), (List) hbq.G(t, X(iW0)), writer, false);
                    break;
                case 35:
                    x1.P(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 36:
                    x1.T(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 37:
                    x1.W(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 38:
                    x1.e0(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 39:
                    x1.V(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 40:
                    x1.S(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 41:
                    x1.R(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 42:
                    x1.N(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 43:
                    x1.d0(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 44:
                    x1.Q(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 45:
                    x1.Y(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 46:
                    x1.Z(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 47:
                    x1.a0(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 48:
                    x1.b0(W(length), (List) hbq.G(t, X(iW0)), writer, true);
                    break;
                case 49:
                    x1.U(W(length), (List) hbq.G(t, X(iW0)), writer, u(length));
                    break;
                case 50:
                    A0(writer, iW, hbq.G(t, X(iW0)), length);
                    break;
                case 51:
                    if (I(t, iW, length)) {
                        writer.z(iW, Z(t, X(iW0)));
                    }
                    break;
                case 52:
                    if (I(t, iW, length)) {
                        writer.F(iW, a0(t, X(iW0)));
                    }
                    break;
                case 53:
                    if (I(t, iW, length)) {
                        writer.C(iW, c0(t, X(iW0)));
                    }
                    break;
                case 54:
                    if (I(t, iW, length)) {
                        writer.e(iW, c0(t, X(iW0)));
                    }
                    break;
                case 55:
                    if (I(t, iW, length)) {
                        writer.g(iW, b0(t, X(iW0)));
                    }
                    break;
                case 56:
                    if (I(t, iW, length)) {
                        writer.m(iW, c0(t, X(iW0)));
                    }
                    break;
                case 57:
                    if (I(t, iW, length)) {
                        writer.c(iW, b0(t, X(iW0)));
                    }
                    break;
                case 58:
                    if (I(t, iW, length)) {
                        writer.n(iW, Y(t, X(iW0)));
                    }
                    break;
                case 59:
                    if (I(t, iW, length)) {
                        B0(iW, hbq.G(t, X(iW0)), writer);
                    }
                    break;
                case 60:
                    if (I(t, iW, length)) {
                        writer.K(iW, hbq.G(t, X(iW0)), u(length));
                    }
                    break;
                case 61:
                    if (I(t, iW, length)) {
                        writer.J(iW, (ByteString) hbq.G(t, X(iW0)));
                    }
                    break;
                case 62:
                    if (I(t, iW, length)) {
                        writer.k(iW, b0(t, X(iW0)));
                    }
                    break;
                case 63:
                    if (I(t, iW, length)) {
                        writer.G(iW, b0(t, X(iW0)));
                    }
                    break;
                case 64:
                    if (I(t, iW, length)) {
                        writer.o(iW, b0(t, X(iW0)));
                    }
                    break;
                case 65:
                    if (I(t, iW, length)) {
                        writer.w(iW, c0(t, X(iW0)));
                    }
                    break;
                case 66:
                    if (I(t, iW, length)) {
                        writer.I(iW, b0(t, X(iW0)));
                    }
                    break;
                case 67:
                    if (I(t, iW, length)) {
                        writer.j(iW, c0(t, X(iW0)));
                    }
                    break;
                case 68:
                    if (I(t, iW, length)) {
                        writer.M(iW, hbq.G(t, X(iW0)), u(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.p.j(writer, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
    }
}
