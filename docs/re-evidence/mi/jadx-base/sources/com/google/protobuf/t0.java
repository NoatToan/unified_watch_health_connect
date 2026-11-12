package com.google.protobuf;

import defpackage.dcj;
import defpackage.jbq;
import defpackage.trf;
import defpackage.uah;
import defpackage.xdi;
import defpackage.zkg;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
public final class t0<T> implements e1<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f9755r = new int[0];
    public static final Unsafe s = jbq.I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f9756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f9757b;
    public final int c;
    public final int d;
    public final q0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9758k;
    public final int l;
    public final zkg m;
    public final h0 n;
    public final q1<?, ?> o;
    public final u<?> p;
    public final m0 q;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9759a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9759a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9759a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9759a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9759a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9759a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9759a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9759a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9759a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9759a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9759a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9759a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9759a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9759a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9759a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9759a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9759a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9759a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public t0(int[] iArr, Object[] objArr, int i, int i2, q0 q0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, zkg zkgVar, h0 h0Var, q1<?, ?> q1Var, u<?> uVar, m0 m0Var) {
        this.f9756a = iArr;
        this.f9757b = objArr;
        this.c = i;
        this.d = i2;
        this.g = q0Var instanceof GeneratedMessageLite;
        this.h = z;
        this.f = uVar != null && uVar.e(q0Var);
        this.i = z2;
        this.j = iArr2;
        this.f9758k = i3;
        this.l = i4;
        this.m = zkgVar;
        this.n = h0Var;
        this.o = q1Var;
        this.p = uVar;
        this.e = q0Var;
        this.q = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean C(Object obj, int i, e1 e1Var) {
        return e1Var.b(jbq.G(obj, T(i)));
    }

    public static boolean H(int i) {
        return (i & 268435456) != 0;
    }

    public static List<?> I(Object obj, long j) {
        return (List) jbq.G(obj, j);
    }

    public static <T> long J(T t, long j) {
        return jbq.E(t, j);
    }

    public static <T> t0<T> P(Class<T> cls, trf trfVar, zkg zkgVar, h0 h0Var, q1<?, ?> q1Var, u<?> uVar, m0 m0Var) {
        return trfVar instanceof dcj ? R((dcj) trfVar, zkgVar, h0Var, q1Var, uVar, m0Var) : Q((l1) trfVar, zkgVar, h0Var, q1Var, uVar, m0Var);
    }

    public static <T> t0<T> Q(l1 l1Var, zkg zkgVar, h0 h0Var, q1<?, ?> q1Var, u<?> uVar, m0 m0Var) {
        int iS;
        int iS2;
        boolean z = l1Var.c() == ProtoSyntax.PROTO3;
        x[] xVarArrE = l1Var.e();
        if (xVarArrE.length == 0) {
            iS = 0;
            iS2 = 0;
        } else {
            iS = xVarArrE[0].s();
            iS2 = xVarArrE[xVarArrE.length - 1].s();
        }
        int length = xVarArrE.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i = 0;
        int i2 = 0;
        for (x xVar : xVarArrE) {
            if (xVar.A() == FieldType.MAP) {
                i++;
            } else if (xVar.A().id() >= 18 && xVar.A().id() <= 49) {
                i2++;
            }
        }
        int[] iArr2 = i > 0 ? new int[i] : null;
        int[] iArr3 = i2 > 0 ? new int[i2] : null;
        int[] iArrD = l1Var.d();
        if (iArrD == null) {
            iArrD = f9755r;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < xVarArrE.length) {
            x xVar2 = xVarArrE[i3];
            int iS3 = xVar2.s();
            p0(xVar2, iArr, i4, objArr);
            if (i5 < iArrD.length && iArrD[i5] == iS3) {
                iArrD[i5] = i4;
                i5++;
            }
            if (xVar2.A() == FieldType.MAP) {
                iArr2[i6] = i4;
                i6++;
            } else {
                if (xVar2.A().id() >= 18 && xVar2.A().id() <= 49) {
                    iArr3[i7] = (int) jbq.M(xVar2.r());
                    i7++;
                }
                i3++;
                i4 += 3;
            }
            i3++;
            i4 += 3;
        }
        if (iArr2 == null) {
            iArr2 = f9755r;
        }
        if (iArr3 == null) {
            iArr3 = f9755r;
        }
        int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
        System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
        return new t0<>(iArr, objArr, iS, iS2, l1Var.b(), z, true, iArr4, iArrD.length, iArrD.length + iArr2.length, zkgVar, h0Var, q1Var, uVar, m0Var);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x024f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0255  */
    /* JADX WARN: Code duplicated, block: B:127:0x026b  */
    /* JADX WARN: Code duplicated, block: B:129:0x026f  */
    /* JADX WARN: Code duplicated, block: B:163:0x031f  */
    /* JADX WARN: Code duplicated, block: B:179:0x036d  */
    /* JADX WARN: Code duplicated, block: B:182:0x037a  */
    public static <T> t0<T> R(dcj dcjVar, zkg zkgVar, h0 h0Var, q1<?, ?> q1Var, u<?> uVar, m0 m0Var) {
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
        java.lang.reflect.Field fieldL0;
        char cCharAt9;
        int i20;
        int i21;
        int i22;
        Object obj;
        java.lang.reflect.Field fieldL1;
        int i23;
        Object obj2;
        java.lang.reflect.Field fieldL2;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        boolean z = dcjVar.c() == ProtoSyntax.PROTO3;
        String strE = dcjVar.e();
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
            iArr = f9755r;
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
        Object[] objArrD = dcjVar.d();
        Class<?> cls = dcjVar.b().getClass();
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
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldL1 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldL1 = l0(cls, (String) obj);
                        objArrD[i22] = fieldL1;
                    }
                    i15 = iCharAt;
                    i16 = iCharAt2;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldL1);
                    i23 = i22 + 1;
                    obj2 = objArrD[i23];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldL2 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldL2 = l0(cls, (String) obj2);
                        objArrD[i23] = fieldL2;
                    }
                    strE = strE;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldL2);
                    z = z;
                    i18 = i76;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i19 = 0;
                }
                i2 = i21;
                i22 = iCharAt12 * 2;
                obj = objArrD[i22];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldL1 = (java.lang.reflect.Field) obj;
                } else {
                    fieldL1 = l0(cls, (String) obj);
                    objArrD[i22] = fieldL1;
                }
                i15 = iCharAt;
                i16 = iCharAt2;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldL1);
                i23 = i22 + 1;
                obj2 = objArrD[i23];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldL2 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldL2 = l0(cls, (String) obj2);
                    objArrD[i23] = fieldL2;
                }
                strE = strE;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldL2);
                z = z;
                i18 = i76;
                iObjectFieldOffset = iObjectFieldOffset4;
                i19 = 0;
            } else {
                i15 = iCharAt;
                i16 = iCharAt2;
                int i77 = i2 + 1;
                java.lang.reflect.Field fieldL3 = l0(cls, (String) objArrD[i2]);
                if (i69 == 9 || i69 == 17) {
                    objArr[((i60 / 3) * 2) + 1] = fieldL3.getType();
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL3);
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
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldL0 = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldL0 = l0(cls, (String) obj3);
                                objArrD[i84] = fieldL0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldL0);
                            i19 = iCharAt13 % 32;
                        }
                        if (i69 >= 18 && i69 <= 49) {
                            iArr[i58] = iObjectFieldOffset;
                            i58++;
                        }
                    }
                    i17 = i20;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL3);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL3);
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
        return new t0<>(iArr2, objArr, iCharAt, iCharAt2, dcjVar.b(), z, false, iArr, iCharAt5, i56, zkgVar, h0Var, q1Var, uVar, m0Var);
    }

    public static long T(int i) {
        return i & 1048575;
    }

    public static <T> boolean U(T t, long j) {
        return ((Boolean) jbq.G(t, j)).booleanValue();
    }

    public static <T> double V(T t, long j) {
        return ((Double) jbq.G(t, j)).doubleValue();
    }

    public static <T> float W(T t, long j) {
        return ((Float) jbq.G(t, j)).floatValue();
    }

    public static <T> int X(T t, long j) {
        return ((Integer) jbq.G(t, j)).intValue();
    }

    public static <T> long Y(T t, long j) {
        return ((Long) jbq.G(t, j)).longValue();
    }

    public static <T> boolean j(T t, long j) {
        return jbq.t(t, j);
    }

    public static java.lang.reflect.Field l0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static <T> double m(T t, long j) {
        return jbq.A(t, j);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static void p0(x xVar, int[] iArr, int i, Object[] objArr) {
        int iM;
        int iId;
        long jM;
        int iM2;
        int iNumberOfTrailingZeros;
        int i2;
        Class<?> clsW;
        int i3;
        uah uahVarX = xVar.x();
        if (uahVarX == null) {
            FieldType fieldTypeA = xVar.A();
            iM = (int) jbq.M(xVar.r());
            iId = fieldTypeA.id();
            if (!fieldTypeA.isList() && !fieldTypeA.isMap()) {
                java.lang.reflect.Field fieldY = xVar.y();
                iM2 = fieldY == null ? 1048575 : (int) jbq.M(fieldY);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(xVar.z());
            } else if (xVar.o() == null) {
                iM2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jM = jbq.M(xVar.o());
            }
            iArr[i] = xVar.s();
            int i4 = i + 1;
            if (xVar.B()) {
                i2 = 536870912;
            } else {
                i2 = 0;
            }
            iArr[i4] = (xVar.D() ? 268435456 : 0) | i2 | (iId << 20) | iM;
            iArr[i + 2] = iM2 | (iNumberOfTrailingZeros << 20);
            clsW = xVar.w();
            if (xVar.u() != null) {
                if (clsW != null) {
                    objArr[((i / 3) * 2) + 1] = clsW;
                    return;
                } else {
                    if (xVar.p() != null) {
                        objArr[((i / 3) * 2) + 1] = xVar.p();
                        return;
                    }
                    return;
                }
            }
            i3 = (i / 3) * 2;
            objArr[i3] = xVar.u();
            if (clsW != null) {
                objArr[i3 + 1] = clsW;
            } else if (xVar.p() != null) {
                objArr[i3 + 1] = xVar.p();
            }
        }
        iId = xVar.A().id() + 51;
        iM = (int) jbq.M(uahVarX.b());
        jM = jbq.M(uahVarX.a());
        iM2 = (int) jM;
        iNumberOfTrailingZeros = 0;
        iArr[i] = xVar.s();
        int i5 = i + 1;
        if (xVar.B()) {
            i2 = 536870912;
        } else {
            i2 = 0;
        }
        iArr[i5] = (xVar.D() ? 268435456 : 0) | i2 | (iId << 20) | iM;
        iArr[i + 2] = iM2 | (iNumberOfTrailingZeros << 20);
        clsW = xVar.w();
        if (xVar.u() != null) {
            if (clsW != null) {
                objArr[((i / 3) * 2) + 1] = clsW;
                return;
            } else {
                if (xVar.p() != null) {
                    objArr[((i / 3) * 2) + 1] = xVar.p();
                    return;
                }
                return;
            }
        }
        i3 = (i / 3) * 2;
        objArr[i3] = xVar.u();
        if (clsW != null) {
            objArr[i3 + 1] = clsW;
        } else if (xVar.p() != null) {
            objArr[i3 + 1] = xVar.p();
        }
    }

    public static <T> float q(T t, long j) {
        return jbq.B(t, j);
    }

    public static int q0(int i) {
        return (i & 267386880) >>> 20;
    }

    public static s1 u(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        s1 s1Var = generatedMessageLite.unknownFields;
        if (s1Var != s1.c()) {
            return s1Var;
        }
        s1 s1VarN = s1.n();
        generatedMessageLite.unknownFields = s1VarN;
        return s1VarN;
    }

    public static <T> int y(T t, long j) {
        return jbq.C(t, j);
    }

    public static boolean z(int i) {
        return (i & 536870912) != 0;
    }

    public final boolean A(T t, int i) {
        int iG0 = g0(i);
        long j = 1048575 & iG0;
        if (j != 1048575) {
            return (jbq.C(t, j) & (1 << (iG0 >>> 20))) != 0;
        }
        int iR0 = r0(i);
        long jT = T(iR0);
        switch (q0(iR0)) {
            case 0:
                return jbq.A(t, jT) != 0.0d;
            case 1:
                return jbq.B(t, jT) != 0.0f;
            case 2:
                return jbq.E(t, jT) != 0;
            case 3:
                return jbq.E(t, jT) != 0;
            case 4:
                return jbq.C(t, jT) != 0;
            case 5:
                return jbq.E(t, jT) != 0;
            case 6:
                return jbq.C(t, jT) != 0;
            case 7:
                return jbq.t(t, jT);
            case 8:
                Object objG = jbq.G(t, jT);
                if (objG instanceof String) {
                    return !((String) objG).isEmpty();
                }
                if (objG instanceof ByteString) {
                    return !ByteString.EMPTY.equals(objG);
                }
                throw new IllegalArgumentException();
            case 9:
                return jbq.G(t, jT) != null;
            case 10:
                return !ByteString.EMPTY.equals(jbq.G(t, jT));
            case 11:
                return jbq.C(t, jT) != 0;
            case 12:
                return jbq.C(t, jT) != 0;
            case 13:
                return jbq.C(t, jT) != 0;
            case 14:
                return jbq.E(t, jT) != 0;
            case 15:
                return jbq.C(t, jT) != 0;
            case 16:
                return jbq.E(t, jT) != 0;
            case 17:
                return jbq.G(t, jT) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean B(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return A(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N> boolean D(Object obj, int i, int i2) {
        List list = (List) jbq.G(obj, T(i));
        if (list.isEmpty()) {
            return true;
        }
        e1 e1VarT = t(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!e1VarT.b(list.get(i3))) {
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
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.e1] */
    public final boolean E(T t, int i, int i2) {
        Map<?, ?> mapG = this.q.g(jbq.G(t, T(i)));
        if (mapG.isEmpty()) {
            return true;
        }
        if (this.q.b(s(i2)).c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? D = 0;
        for (Object obj : mapG.values()) {
            if (D == 0) {
                D = D;
                D = xdi.a().d(obj.getClass());
            }
            D = D;
            if (!D.b(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean F(T t, T t2, int i) {
        long jG0 = g0(i) & 1048575;
        return jbq.C(t, jG0) == jbq.C(t2, jG0);
    }

    public final boolean G(T t, int i, int i2) {
        return jbq.C(t, (long) (g0(i2) & 1048575)) == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends a0.c<ET>> void K(q1<UT, UB> q1Var, u<ET> uVar, T t, a1 a1Var, t tVar) throws IOException {
        Object objO = null;
        Object objD = null;
        while (true) {
            try {
                int iL = a1Var.l();
                int iE0 = e0(iL);
                if (iE0 >= 0) {
                    int iR0 = r0(iE0);
                    try {
                        switch (q0(iR0)) {
                            case 0:
                                jbq.T(t, T(iR0), a1Var.readDouble());
                                m0(t, iE0);
                                break;
                            case 1:
                                jbq.U(t, T(iR0), a1Var.readFloat());
                                m0(t, iE0);
                                break;
                            case 2:
                                jbq.W(t, T(iR0), a1Var.r());
                                m0(t, iE0);
                                break;
                            case 3:
                                jbq.W(t, T(iR0), a1Var.h());
                                m0(t, iE0);
                                break;
                            case 4:
                                jbq.V(t, T(iR0), a1Var.z());
                                m0(t, iE0);
                                break;
                            case 5:
                                jbq.W(t, T(iR0), a1Var.s());
                                m0(t, iE0);
                                break;
                            case 6:
                                jbq.V(t, T(iR0), a1Var.C());
                                m0(t, iE0);
                                break;
                            case 7:
                                jbq.N(t, T(iR0), a1Var.u());
                                m0(t, iE0);
                                break;
                            case 8:
                                j0(t, iR0, a1Var);
                                m0(t, iE0);
                                break;
                            case 9:
                                if (A(t, iE0)) {
                                    jbq.X(t, T(iR0), d0.k(jbq.G(t, T(iR0)), a1Var.O(t(iE0), tVar)));
                                } else {
                                    jbq.X(t, T(iR0), a1Var.O(t(iE0), tVar));
                                    m0(t, iE0);
                                }
                                break;
                            case 10:
                                jbq.X(t, T(iR0), a1Var.readBytes());
                                m0(t, iE0);
                                break;
                            case 11:
                                jbq.V(t, T(iR0), a1Var.c());
                                m0(t, iE0);
                                break;
                            case 12:
                                int iD = a1Var.d();
                                d0.e eVarR = r(iE0);
                                if (eVarR == null || eVarR.isInRange(iD)) {
                                    jbq.V(t, T(iR0), iD);
                                    m0(t, iE0);
                                } else {
                                    objO = f1.M(iL, iD, objO, q1Var);
                                }
                                break;
                            case 13:
                                jbq.V(t, T(iR0), a1Var.F());
                                m0(t, iE0);
                                break;
                            case 14:
                                jbq.W(t, T(iR0), a1Var.b());
                                m0(t, iE0);
                                break;
                            case 15:
                                jbq.V(t, T(iR0), a1Var.e());
                                m0(t, iE0);
                                break;
                            case 16:
                                jbq.W(t, T(iR0), a1Var.D());
                                m0(t, iE0);
                                break;
                            case 17:
                                if (A(t, iE0)) {
                                    jbq.X(t, T(iR0), d0.k(jbq.G(t, T(iR0)), a1Var.I(t(iE0), tVar)));
                                } else {
                                    jbq.X(t, T(iR0), a1Var.I(t(iE0), tVar));
                                    m0(t, iE0);
                                }
                                break;
                            case 18:
                                a1Var.q(this.n.e(t, T(iR0)));
                                break;
                            case 19:
                                a1Var.n(this.n.e(t, T(iR0)));
                                break;
                            case 20:
                                a1Var.w(this.n.e(t, T(iR0)));
                                break;
                            case 21:
                                a1Var.v(this.n.e(t, T(iR0)));
                                break;
                            case 22:
                                a1Var.j(this.n.e(t, T(iR0)));
                                break;
                            case 23:
                                a1Var.A(this.n.e(t, T(iR0)));
                                break;
                            case 24:
                                a1Var.k(this.n.e(t, T(iR0)));
                                break;
                            case 25:
                                a1Var.f(this.n.e(t, T(iR0)));
                                break;
                            case 26:
                                k0(t, iR0, a1Var);
                                break;
                            case 27:
                                i0(t, iR0, a1Var, t(iE0), tVar);
                                break;
                            case 28:
                                a1Var.p(this.n.e(t, T(iR0)));
                                break;
                            case 29:
                                a1Var.B(this.n.e(t, T(iR0)));
                                break;
                            case 30:
                                List<Integer> listE = this.n.e(t, T(iR0));
                                a1Var.x(listE);
                                objO = f1.A(iL, listE, r(iE0), objO, q1Var);
                                break;
                            case 31:
                                a1Var.t(this.n.e(t, T(iR0)));
                                break;
                            case 32:
                                a1Var.i(this.n.e(t, T(iR0)));
                                break;
                            case 33:
                                a1Var.g(this.n.e(t, T(iR0)));
                                break;
                            case 34:
                                a1Var.a(this.n.e(t, T(iR0)));
                                break;
                            case 35:
                                a1Var.q(this.n.e(t, T(iR0)));
                                break;
                            case 36:
                                a1Var.n(this.n.e(t, T(iR0)));
                                break;
                            case 37:
                                a1Var.w(this.n.e(t, T(iR0)));
                                break;
                            case 38:
                                a1Var.v(this.n.e(t, T(iR0)));
                                break;
                            case 39:
                                a1Var.j(this.n.e(t, T(iR0)));
                                break;
                            case 40:
                                a1Var.A(this.n.e(t, T(iR0)));
                                break;
                            case 41:
                                a1Var.k(this.n.e(t, T(iR0)));
                                break;
                            case 42:
                                a1Var.f(this.n.e(t, T(iR0)));
                                break;
                            case 43:
                                a1Var.B(this.n.e(t, T(iR0)));
                                break;
                            case 44:
                                List<Integer> listE2 = this.n.e(t, T(iR0));
                                a1Var.x(listE2);
                                objO = f1.A(iL, listE2, r(iE0), objO, q1Var);
                                break;
                            case 45:
                                a1Var.t(this.n.e(t, T(iR0)));
                                break;
                            case 46:
                                a1Var.i(this.n.e(t, T(iR0)));
                                break;
                            case 47:
                                a1Var.g(this.n.e(t, T(iR0)));
                                break;
                            case 48:
                                a1Var.a(this.n.e(t, T(iR0)));
                                break;
                            case 49:
                                h0(t, T(iR0), a1Var, t(iE0), tVar);
                                break;
                            case 50:
                                L(t, iE0, s(iE0), tVar, a1Var);
                                break;
                            case 51:
                                jbq.X(t, T(iR0), Double.valueOf(a1Var.readDouble()));
                                n0(t, iL, iE0);
                                break;
                            case 52:
                                jbq.X(t, T(iR0), Float.valueOf(a1Var.readFloat()));
                                n0(t, iL, iE0);
                                break;
                            case 53:
                                jbq.X(t, T(iR0), Long.valueOf(a1Var.r()));
                                n0(t, iL, iE0);
                                break;
                            case 54:
                                jbq.X(t, T(iR0), Long.valueOf(a1Var.h()));
                                n0(t, iL, iE0);
                                break;
                            case 55:
                                jbq.X(t, T(iR0), Integer.valueOf(a1Var.z()));
                                n0(t, iL, iE0);
                                break;
                            case 56:
                                jbq.X(t, T(iR0), Long.valueOf(a1Var.s()));
                                n0(t, iL, iE0);
                                break;
                            case 57:
                                jbq.X(t, T(iR0), Integer.valueOf(a1Var.C()));
                                n0(t, iL, iE0);
                                break;
                            case 58:
                                jbq.X(t, T(iR0), Boolean.valueOf(a1Var.u()));
                                n0(t, iL, iE0);
                                break;
                            case 59:
                                j0(t, iR0, a1Var);
                                n0(t, iL, iE0);
                                break;
                            case 60:
                                if (G(t, iL, iE0)) {
                                    jbq.X(t, T(iR0), d0.k(jbq.G(t, T(iR0)), a1Var.O(t(iE0), tVar)));
                                } else {
                                    jbq.X(t, T(iR0), a1Var.O(t(iE0), tVar));
                                    m0(t, iE0);
                                }
                                n0(t, iL, iE0);
                                break;
                            case 61:
                                jbq.X(t, T(iR0), a1Var.readBytes());
                                n0(t, iL, iE0);
                                break;
                            case 62:
                                jbq.X(t, T(iR0), Integer.valueOf(a1Var.c()));
                                n0(t, iL, iE0);
                                break;
                            case 63:
                                int iD2 = a1Var.d();
                                d0.e eVarR2 = r(iE0);
                                if (eVarR2 == null || eVarR2.isInRange(iD2)) {
                                    jbq.X(t, T(iR0), Integer.valueOf(iD2));
                                    n0(t, iL, iE0);
                                } else {
                                    objO = f1.M(iL, iD2, objO, q1Var);
                                }
                                break;
                            case 64:
                                jbq.X(t, T(iR0), Integer.valueOf(a1Var.F()));
                                n0(t, iL, iE0);
                                break;
                            case 65:
                                jbq.X(t, T(iR0), Long.valueOf(a1Var.b()));
                                n0(t, iL, iE0);
                                break;
                            case 66:
                                jbq.X(t, T(iR0), Integer.valueOf(a1Var.e()));
                                n0(t, iL, iE0);
                                break;
                            case 67:
                                jbq.X(t, T(iR0), Long.valueOf(a1Var.D()));
                                n0(t, iL, iE0);
                                break;
                            case 68:
                                jbq.X(t, T(iR0), a1Var.I(t(iE0), tVar));
                                n0(t, iL, iE0);
                                break;
                            default:
                                if (objO == null) {
                                    objO = q1Var.n();
                                }
                                if (!q1Var.m(objO, a1Var)) {
                                    for (int i = this.f9758k; i < this.l; i++) {
                                        objO = o(t, this.j[i], objO, q1Var);
                                    }
                                    if (objO != null) {
                                        q1Var.o(t, objO);
                                        return;
                                    }
                                    return;
                                }
                                break;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!q1Var.q(a1Var)) {
                            if (objO == null) {
                                objO = q1Var.f(t);
                            }
                            if (!q1Var.m(objO, a1Var)) {
                                for (int i2 = this.f9758k; i2 < this.l; i2++) {
                                    objO = o(t, this.j[i2], objO, q1Var);
                                }
                                if (objO != null) {
                                    q1Var.o(t, objO);
                                    return;
                                }
                                return;
                            }
                        } else if (!a1Var.o()) {
                            for (int i3 = this.f9758k; i3 < this.l; i3++) {
                                objO = o(t, this.j[i3], objO, q1Var);
                            }
                            if (objO != null) {
                                q1Var.o(t, objO);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (iL == Integer.MAX_VALUE) {
                        for (int i4 = this.f9758k; i4 < this.l; i4++) {
                            objO = o(t, this.j[i4], objO, q1Var);
                        }
                        if (objO != null) {
                            q1Var.o(t, objO);
                            return;
                        }
                        return;
                    }
                    Object objB = !this.f ? null : uVar.b(tVar, this.e, iL);
                    if (objB != null) {
                        if (objD == null) {
                            objD = uVar.d(t);
                        }
                        objO = uVar.g(a1Var, objB, tVar, objD, objO, q1Var);
                    } else if (!q1Var.q(a1Var)) {
                        if (objO == null) {
                            objO = q1Var.f(t);
                        }
                        if (q1Var.m(objO, a1Var)) {
                        }
                    } else if (a1Var.o()) {
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.f9758k; i5 < this.l; i5++) {
                    objO = o(t, this.j[i5], objO, q1Var);
                }
                if (objO != null) {
                    q1Var.o(t, objO);
                }
                throw th;
            }
        }
        for (int i6 = this.f9758k; i6 < this.l; i6++) {
            objO = o(t, this.j[i6], objO, q1Var);
        }
        if (objO != null) {
            q1Var.o(t, objO);
        }
    }

    public final <K, V> void L(Object obj, int i, Object obj2, t tVar, a1 a1Var) throws IOException {
        long jT = T(r0(i));
        Object objG = jbq.G(obj, jT);
        if (objG == null) {
            objG = this.q.f(obj2);
            jbq.X(obj, jT, objG);
        } else if (this.q.h(objG)) {
            Object objF = this.q.f(obj2);
            this.q.a(objF, objG);
            jbq.X(obj, jT, objF);
            objG = objF;
        }
        a1Var.H(this.q.e(objG), this.q.b(obj2), tVar);
    }

    public final void M(T t, T t2, int i) {
        long jT = T(r0(i));
        if (A(t2, i)) {
            Object objG = jbq.G(t, jT);
            Object objG2 = jbq.G(t2, jT);
            if (objG != null && objG2 != null) {
                jbq.X(t, jT, d0.k(objG, objG2));
                m0(t, i);
            } else if (objG2 != null) {
                jbq.X(t, jT, objG2);
                m0(t, i);
            }
        }
    }

    public final void N(T t, T t2, int i) {
        int iR0 = r0(i);
        int iS = S(i);
        long jT = T(iR0);
        if (G(t2, iS, i)) {
            Object objG = G(t, iS, i) ? jbq.G(t, jT) : null;
            Object objG2 = jbq.G(t2, jT);
            if (objG != null && objG2 != null) {
                jbq.X(t, jT, d0.k(objG, objG2));
                n0(t, iS, i);
            } else if (objG2 != null) {
                jbq.X(t, jT, objG2);
                n0(t, iS, i);
            }
        }
    }

    public final void O(T t, T t2, int i) {
        int iR0 = r0(i);
        long jT = T(iR0);
        int iS = S(i);
        switch (q0(iR0)) {
            case 0:
                if (A(t2, i)) {
                    jbq.T(t, jT, jbq.A(t2, jT));
                    m0(t, i);
                }
                break;
            case 1:
                if (A(t2, i)) {
                    jbq.U(t, jT, jbq.B(t2, jT));
                    m0(t, i);
                }
                break;
            case 2:
                if (A(t2, i)) {
                    jbq.W(t, jT, jbq.E(t2, jT));
                    m0(t, i);
                }
                break;
            case 3:
                if (A(t2, i)) {
                    jbq.W(t, jT, jbq.E(t2, jT));
                    m0(t, i);
                }
                break;
            case 4:
                if (A(t2, i)) {
                    jbq.V(t, jT, jbq.C(t2, jT));
                    m0(t, i);
                }
                break;
            case 5:
                if (A(t2, i)) {
                    jbq.W(t, jT, jbq.E(t2, jT));
                    m0(t, i);
                }
                break;
            case 6:
                if (A(t2, i)) {
                    jbq.V(t, jT, jbq.C(t2, jT));
                    m0(t, i);
                }
                break;
            case 7:
                if (A(t2, i)) {
                    jbq.N(t, jT, jbq.t(t2, jT));
                    m0(t, i);
                }
                break;
            case 8:
                if (A(t2, i)) {
                    jbq.X(t, jT, jbq.G(t2, jT));
                    m0(t, i);
                }
                break;
            case 9:
                M(t, t2, i);
                break;
            case 10:
                if (A(t2, i)) {
                    jbq.X(t, jT, jbq.G(t2, jT));
                    m0(t, i);
                }
                break;
            case 11:
                if (A(t2, i)) {
                    jbq.V(t, jT, jbq.C(t2, jT));
                    m0(t, i);
                }
                break;
            case 12:
                if (A(t2, i)) {
                    jbq.V(t, jT, jbq.C(t2, jT));
                    m0(t, i);
                }
                break;
            case 13:
                if (A(t2, i)) {
                    jbq.V(t, jT, jbq.C(t2, jT));
                    m0(t, i);
                }
                break;
            case 14:
                if (A(t2, i)) {
                    jbq.W(t, jT, jbq.E(t2, jT));
                    m0(t, i);
                }
                break;
            case 15:
                if (A(t2, i)) {
                    jbq.V(t, jT, jbq.C(t2, jT));
                    m0(t, i);
                }
                break;
            case 16:
                if (A(t2, i)) {
                    jbq.W(t, jT, jbq.E(t2, jT));
                    m0(t, i);
                }
                break;
            case 17:
                M(t, t2, i);
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
                this.n.d(t, t2, jT);
                break;
            case 50:
                f1.G(this.q, t, t2, jT);
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
                if (G(t2, iS, i)) {
                    jbq.X(t, jT, jbq.G(t2, jT));
                    n0(t, iS, i);
                }
                break;
            case 60:
                N(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (G(t2, iS, i)) {
                    jbq.X(t, jT, jbq.G(t2, jT));
                    n0(t, iS, i);
                }
                break;
            case 68:
                N(t, t2, i);
                break;
        }
    }

    public final int S(int i) {
        return this.f9756a[i];
    }

    public final <K, V> int Z(T t, byte[] bArr, int i, int i2, int i3, long j, g.b bVar) throws IOException {
        Unsafe unsafe = s;
        Object objS = s(i3);
        Object object = unsafe.getObject(t, j);
        if (this.q.h(object)) {
            Object objF = this.q.f(objS);
            this.q.a(objF, object);
            unsafe.putObject(t, j, objF);
            object = objF;
        }
        return k(bArr, i, i2, this.q.b(objS), this.q.e(object), bVar);
    }

    @Override // com.google.protobuf.e1
    public void a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f9756a.length; i += 3) {
            O(t, t2, i);
        }
        f1.H(this.o, t, t2);
        if (this.f) {
            f1.F(this.p, t, t2);
        }
    }

    public final int a0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, g.b bVar) throws IOException {
        Unsafe unsafe = s;
        long j2 = this.f9756a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(g.d(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(g.l(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iL = g.L(bArr, i, bVar);
                unsafe.putObject(t, j, Long.valueOf(bVar.f9641b));
                unsafe.putInt(t, j2, i4);
                return iL;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int I = g.I(bArr, i, bVar);
                unsafe.putObject(t, j, Integer.valueOf(bVar.f9640a));
                unsafe.putInt(t, j2, i4);
                return I;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(g.j(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(g.h(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iL2 = g.L(bArr, i, bVar);
                unsafe.putObject(t, j, Boolean.valueOf(bVar.f9641b != 0));
                unsafe.putInt(t, j2, i4);
                return iL2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int I2 = g.I(bArr, i, bVar);
                int i13 = bVar.f9640a;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !v1.t(bArr, I2, I2 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t, j, new String(bArr, I2, i13, d0.f9618a));
                    I2 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return I2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iP = g.p(t(i8), bArr, i, i2, bVar);
                Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, bVar.c);
                } else {
                    unsafe.putObject(t, j, d0.k(object, bVar.c));
                }
                unsafe.putInt(t, j2, i4);
                return iP;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iB = g.b(bArr, i, bVar);
                unsafe.putObject(t, j, bVar.c);
                unsafe.putInt(t, j2, i4);
                return iB;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int I3 = g.I(bArr, i, bVar);
                int i14 = bVar.f9640a;
                d0.e eVarR = r(i8);
                if (eVarR == null || eVarR.isInRange(i14)) {
                    unsafe.putObject(t, j, Integer.valueOf(i14));
                    unsafe.putInt(t, j2, i4);
                } else {
                    u(t).q(i3, Long.valueOf(i14));
                }
                return I3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int I4 = g.I(bArr, i, bVar);
                unsafe.putObject(t, j, Integer.valueOf(j.b(bVar.f9640a)));
                unsafe.putInt(t, j2, i4);
                return I4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iL3 = g.L(bArr, i, bVar);
                unsafe.putObject(t, j, Long.valueOf(j.c(bVar.f9641b)));
                unsafe.putInt(t, j2, i4);
                return iL3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                int iN = g.n(t(i8), bArr, i, i2, (i3 & (-8)) | 4, bVar);
                Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object2 == null) {
                    unsafe.putObject(t, j, bVar.c);
                } else {
                    unsafe.putObject(t, j, d0.k(object2, bVar.c));
                }
                unsafe.putInt(t, j2, i4);
                return iN;
            default:
                return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[SYNTHETIC] */
    @Override // com.google.protobuf.e1
    public final boolean b(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f9758k) {
            int i6 = this.j[i5];
            int iS = S(i6);
            int iR0 = r0(i6);
            int i7 = this.f9756a[i6 + 2];
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
            if (H(iR0) && !B(t, i6, i, i2, i9)) {
                return false;
            }
            int iQ0 = q0(iR0);
            if (iQ0 == 9 || iQ0 == 17) {
                if (B(t, i6, i, i2, i9) && !C(t, iR0, t(i6))) {
                    return false;
                }
            } else if (iQ0 == 27) {
                if (!D(t, iR0, i6)) {
                    return false;
                }
            } else if (iQ0 == 60 || iQ0 == 68) {
                if (G(t, iS, i6) && !C(t, iR0, t(i6))) {
                    return false;
                }
            } else if (iQ0 != 49) {
                if (iQ0 == 50 && !E(t, iR0, i6)) {
                    return false;
                }
            } else if (!D(t, iR0, i6)) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.f || this.p.c(t).C();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x008f. Please report as an issue. */
    public int b0(T t, byte[] bArr, int i, int i2, int i3, g.b bVar) throws IOException {
        Unsafe unsafe;
        t0<T> t0Var;
        int i4;
        T t2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        T t3;
        T t4;
        int i15;
        T t5;
        int i16;
        int i17;
        t0<T> t0Var2 = this;
        T t6 = t;
        byte[] bArr2 = bArr;
        i2 = i2;
        int i18 = i3;
        g.b bVar2 = bVar;
        Unsafe unsafe2 = s;
        int iG = i;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = -1;
        int i23 = 1048575;
        while (true) {
            if (iG < i2) {
                int i24 = iG + 1;
                byte b2 = bArr2[iG];
                if (b2 < 0) {
                    int iH = g.H(b2, bArr2, i24, bVar2);
                    i5 = bVar2.f9640a;
                    i24 = iH;
                } else {
                    i5 = b2;
                }
                int i25 = i5 >>> 3;
                int i26 = i5 & 7;
                int iF0 = i25 > i22 ? t0Var2.f0(i25, i19 / 3) : t0Var2.e0(i25);
                if (iF0 == -1) {
                    i6 = i25;
                    i7 = i24;
                    i8 = i5;
                    i9 = i21;
                    i10 = i23;
                    unsafe = unsafe2;
                    i3 = i18;
                    i11 = 0;
                } else {
                    int i27 = t0Var2.f9756a[iF0 + 1];
                    int iQ0 = q0(i27);
                    long jT = T(i27);
                    int i28 = i5;
                    if (iQ0 <= 17) {
                        int i29 = t0Var2.f9756a[iF0 + 2];
                        int i30 = 1 << (i29 >>> 20);
                        int i31 = i29 & 1048575;
                        if (i31 != i23) {
                            if (i23 != 1048575) {
                                unsafe2.putInt(t6, i23, i21);
                            }
                            i12 = unsafe2.getInt(t6, i31);
                            i10 = i31;
                        } else {
                            i10 = i23;
                            i12 = i21;
                        }
                        switch (iQ0) {
                            case 0:
                                t3 = t6;
                                i13 = iF0;
                                i6 = i25;
                                bArr2 = bArr;
                                i14 = i28;
                                if (i26 == 1) {
                                    jbq.T(t3, jT, g.d(bArr2, i24));
                                    iG = i24 + 8;
                                    i21 = i12 | i30;
                                    t6 = t3;
                                    i19 = i13;
                                    i20 = i14;
                                    i22 = i6;
                                    i23 = i10;
                                    i18 = i3;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 1:
                                t3 = t6;
                                i13 = iF0;
                                i6 = i25;
                                bArr2 = bArr;
                                i14 = i28;
                                if (i26 == 5) {
                                    jbq.U(t3, jT, g.l(bArr2, i24));
                                    iG = i24 + 4;
                                    i21 = i12 | i30;
                                    t6 = t3;
                                    i19 = i13;
                                    i20 = i14;
                                    i22 = i6;
                                    i23 = i10;
                                    i18 = i3;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 2:
                            case 3:
                                T t7 = t6;
                                i13 = iF0;
                                i6 = i25;
                                bArr2 = bArr;
                                i14 = i28;
                                if (i26 == 0) {
                                    int iL = g.L(bArr2, i24, bVar2);
                                    t4 = t7;
                                    unsafe2.putLong(t, jT, bVar2.f9641b);
                                    i21 = i12 | i30;
                                    i19 = i13;
                                    iG = iL;
                                    i20 = i14;
                                    t6 = t4;
                                    i22 = i6;
                                    i23 = i10;
                                    i2 = i2;
                                    i18 = i3;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 4:
                            case 11:
                                t3 = t6;
                                i13 = iF0;
                                i6 = i25;
                                bArr2 = bArr;
                                i14 = i28;
                                if (i26 == 0) {
                                    iG = g.I(bArr2, i24, bVar2);
                                    unsafe2.putInt(t3, jT, bVar2.f9640a);
                                    i21 = i12 | i30;
                                    t6 = t3;
                                    i19 = i13;
                                    i20 = i14;
                                    i22 = i6;
                                    i23 = i10;
                                    i18 = i3;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 5:
                            case 14:
                                T t8 = t6;
                                i13 = iF0;
                                i6 = i25;
                                bArr2 = bArr;
                                i14 = i28;
                                if (i26 == 1) {
                                    t4 = t8;
                                    unsafe2.putLong(t, jT, g.j(bArr2, i24));
                                    iG = i24 + 8;
                                    i21 = i12 | i30;
                                    i19 = i13;
                                    i20 = i14;
                                    t6 = t4;
                                    i22 = i6;
                                    i23 = i10;
                                    i2 = i2;
                                    i18 = i3;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 6:
                            case 13:
                                i15 = i2;
                                t5 = t6;
                                i13 = iF0;
                                i6 = i25;
                                bArr2 = bArr;
                                i14 = i28;
                                if (i26 == 5) {
                                    unsafe2.putInt(t5, jT, g.h(bArr2, i24));
                                    iG = i24 + 4;
                                    int i32 = i12 | i30;
                                    t6 = t5;
                                    i2 = i15;
                                    i19 = i13;
                                    i20 = i14;
                                    i23 = i10;
                                    i18 = i3;
                                    i21 = i32;
                                    i22 = i6;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 7:
                                i15 = i2;
                                t5 = t6;
                                i13 = iF0;
                                i6 = i25;
                                bArr2 = bArr;
                                i14 = i28;
                                if (i26 == 0) {
                                    iG = g.L(bArr2, i24, bVar2);
                                    jbq.N(t5, jT, bVar2.f9641b != 0);
                                    int i33 = i12 | i30;
                                    t6 = t5;
                                    i2 = i15;
                                    i19 = i13;
                                    i20 = i14;
                                    i23 = i10;
                                    i18 = i3;
                                    i21 = i33;
                                    i22 = i6;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 8:
                                i15 = i2;
                                t5 = t6;
                                i13 = iF0;
                                i6 = i25;
                                bArr2 = bArr;
                                i14 = i28;
                                if (i26 == 2) {
                                    iG = (i27 & 536870912) == 0 ? g.C(bArr2, i24, bVar2) : g.F(bArr2, i24, bVar2);
                                    unsafe2.putObject(t5, jT, bVar2.c);
                                    int i34 = i12 | i30;
                                    t6 = t5;
                                    i2 = i15;
                                    i19 = i13;
                                    i20 = i14;
                                    i23 = i10;
                                    i18 = i3;
                                    i21 = i34;
                                    i22 = i6;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 9:
                                t5 = t6;
                                i13 = iF0;
                                i6 = i25;
                                i14 = i28;
                                bArr2 = bArr;
                                if (i26 == 2) {
                                    i15 = i2;
                                    iG = g.p(t0Var2.t(i13), bArr2, i24, i15, bVar2);
                                    if ((i12 & i30) == 0) {
                                        unsafe2.putObject(t5, jT, bVar2.c);
                                    } else {
                                        unsafe2.putObject(t5, jT, d0.k(unsafe2.getObject(t5, jT), bVar2.c));
                                    }
                                    int i35 = i12 | i30;
                                    t6 = t5;
                                    i2 = i15;
                                    i19 = i13;
                                    i20 = i14;
                                    i23 = i10;
                                    i18 = i3;
                                    i21 = i35;
                                    i22 = i6;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 10:
                                t3 = t6;
                                i13 = iF0;
                                i6 = i25;
                                i14 = i28;
                                bArr2 = bArr;
                                if (i26 == 2) {
                                    iG = g.b(bArr2, i24, bVar2);
                                    unsafe2.putObject(t3, jT, bVar2.c);
                                    i21 = i12 | i30;
                                    t6 = t3;
                                    i19 = i13;
                                    i20 = i14;
                                    i22 = i6;
                                    i23 = i10;
                                    i18 = i3;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 12:
                                t3 = t6;
                                i13 = iF0;
                                i6 = i25;
                                i14 = i28;
                                bArr2 = bArr;
                                if (i26 == 0) {
                                    iG = g.I(bArr2, i24, bVar2);
                                    int i36 = bVar2.f9640a;
                                    d0.e eVarR = t0Var2.r(i13);
                                    if (eVarR == null || eVarR.isInRange(i36)) {
                                        unsafe2.putInt(t3, jT, i36);
                                        i21 = i12 | i30;
                                        t6 = t3;
                                    } else {
                                        u(t).q(i14, Long.valueOf(i36));
                                        t6 = t3;
                                        i21 = i12;
                                    }
                                    i19 = i13;
                                    i20 = i14;
                                    i22 = i6;
                                    i23 = i10;
                                    i18 = i3;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 15:
                                i13 = iF0;
                                i14 = i28;
                                bArr2 = bArr;
                                i6 = i25;
                                if (i26 == 0) {
                                    iG = g.I(bArr2, i24, bVar2);
                                    t3 = t;
                                    unsafe2.putInt(t3, jT, j.b(bVar2.f9640a));
                                    i21 = i12 | i30;
                                    t6 = t3;
                                    i19 = i13;
                                    i20 = i14;
                                    i22 = i6;
                                    i23 = i10;
                                    i18 = i3;
                                } else {
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 16:
                                i13 = iF0;
                                i6 = i25;
                                if (i26 == 0) {
                                    bArr2 = bArr;
                                    int iL2 = g.L(bArr2, i24, bVar2);
                                    i14 = i28;
                                    unsafe2.putLong(t, jT, j.c(bVar2.f9641b));
                                    i21 = i12 | i30;
                                    t6 = t;
                                    i2 = i2;
                                    i19 = i13;
                                    iG = iL2;
                                    i20 = i14;
                                    i22 = i6;
                                    i23 = i10;
                                    i18 = i3;
                                } else {
                                    i14 = i28;
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            case 17:
                                if (i26 == 3) {
                                    iG = g.n(t0Var2.t(iF0), bArr, i24, i2, (i25 << 3) | 4, bVar);
                                    if ((i12 & i30) == 0) {
                                        unsafe2.putObject(t6, jT, bVar2.c);
                                    } else {
                                        unsafe2.putObject(t6, jT, d0.k(unsafe2.getObject(t6, jT), bVar2.c));
                                    }
                                    i21 = i12 | i30;
                                    bArr2 = bArr;
                                    i2 = i2;
                                    i18 = i3;
                                    i19 = iF0;
                                    i20 = i28;
                                    i22 = i25;
                                    i23 = i10;
                                } else {
                                    i13 = iF0;
                                    i6 = i25;
                                    i14 = i28;
                                    i3 = i3;
                                    i7 = i24;
                                    i9 = i12;
                                    i11 = i13;
                                    unsafe = unsafe2;
                                    i8 = i14;
                                }
                                break;
                            default:
                                i13 = iF0;
                                i14 = i28;
                                i6 = i25;
                                i3 = i3;
                                i7 = i24;
                                i9 = i12;
                                i11 = i13;
                                unsafe = unsafe2;
                                i8 = i14;
                                break;
                        }
                    } else {
                        i6 = i25;
                        T t9 = t6;
                        bArr2 = bArr;
                        if (iQ0 != 27) {
                            i11 = iF0;
                            i9 = i21;
                            i10 = i23;
                            if (iQ0 <= 49) {
                                int i37 = i24;
                                unsafe = unsafe2;
                                iG = d0(t, bArr, i24, i2, i28, i6, i26, i11, i27, iQ0, jT, bVar);
                                if (iG != i37) {
                                    i17 = i28;
                                    t0Var2 = this;
                                    t6 = t;
                                    bArr2 = bArr;
                                    i2 = i2;
                                    i18 = i3;
                                    bVar2 = bVar;
                                    i22 = i6;
                                    i20 = i17;
                                    i19 = i11;
                                    i21 = i9;
                                    i23 = i10;
                                    unsafe2 = unsafe;
                                } else {
                                    i17 = i28;
                                    i7 = iG;
                                    i8 = i17;
                                }
                            } else {
                                i16 = i24;
                                unsafe = unsafe2;
                                if (iQ0 != 50) {
                                    iG = a0(t, bArr, i16, i2, i17, i6, i26, i27, iQ0, jT, i11, bVar);
                                    if (iG != i16) {
                                        i17 = i28;
                                        t0Var2 = this;
                                        t6 = t;
                                        bArr2 = bArr;
                                        i2 = i2;
                                        i18 = i3;
                                        bVar2 = bVar;
                                        i22 = i6;
                                        i20 = i17;
                                        i19 = i11;
                                        i21 = i9;
                                        i23 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i17 = i28;
                                        i7 = iG;
                                        i8 = i17;
                                    }
                                } else if (i26 == 2) {
                                    iG = Z(t, bArr, i16, i2, i11, jT, bVar);
                                    if (iG != i16) {
                                        i17 = i28;
                                        t0Var2 = this;
                                        t6 = t;
                                        bArr2 = bArr;
                                        i2 = i2;
                                        i18 = i3;
                                        bVar2 = bVar;
                                        i22 = i6;
                                        i20 = i17;
                                        i19 = i11;
                                        i21 = i9;
                                        i23 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i17 = i28;
                                        i7 = iG;
                                        i8 = i17;
                                    }
                                } else {
                                    i17 = i28;
                                }
                            }
                        } else if (i26 == 2) {
                            d0.i iVarA2 = (d0.i) unsafe2.getObject(t9, jT);
                            if (!iVarA2.c()) {
                                int size = iVarA2.size();
                                iVarA2 = iVarA2.a2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t9, jT, iVarA2);
                            }
                            i10 = i23;
                            iG = g.q(t0Var2.t(iF0), i28, bArr, i24, i2, iVarA2, bVar);
                            t6 = t;
                            i2 = i2;
                            i20 = i28;
                            i22 = i6;
                            i19 = iF0;
                            i21 = i21;
                            i23 = i10;
                            i18 = i3;
                        } else {
                            i11 = iF0;
                            i9 = i21;
                            i10 = i23;
                            i16 = i24;
                            unsafe = unsafe2;
                            i17 = i28;
                        }
                        i7 = i16;
                        i8 = i17;
                    }
                }
                if (i8 != i3 || i3 == 0) {
                    iG = (!this.f || bVar.d == t.c()) ? g.G(i8, bArr, i7, i2, u(t), bVar) : g.g(i8, bArr, i7, i2, t, this.e, this.o, bVar);
                    t6 = t;
                    bArr2 = bArr;
                    i2 = i2;
                    i20 = i8;
                    t0Var2 = this;
                    bVar2 = bVar;
                    i22 = i6;
                    i19 = i11;
                    i21 = i9;
                    i23 = i10;
                    unsafe2 = unsafe;
                    i18 = i3;
                } else {
                    i4 = 1048575;
                    t0Var = this;
                    iG = i7;
                    i20 = i8;
                    i21 = i9;
                    i23 = i10;
                }
            } else {
                unsafe = unsafe2;
                i3 = i18;
                t0Var = t0Var2;
                i4 = 1048575;
            }
        }
        if (i23 != i4) {
            t2 = t;
            unsafe.putInt(t2, i23, i21);
        } else {
            t2 = t;
        }
        s1 s1Var = null;
        for (int i38 = t0Var.f9758k; i38 < t0Var.l; i38++) {
            s1Var = (s1) t0Var.o(t2, t0Var.j[i38], s1Var, t0Var.o);
        }
        if (s1Var != null) {
            t0Var.o.o(t2, s1Var);
        }
        if (i3 == 0) {
            if (iG != i2) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (iG > i2 || i20 != i3) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return iG;
    }

    @Override // com.google.protobuf.e1
    public void c(T t) {
        int i;
        int i2 = this.f9758k;
        while (true) {
            i = this.l;
            if (i2 >= i) {
                break;
            }
            long jT = T(r0(this.j[i2]));
            Object objG = jbq.G(t, jT);
            if (objG != null) {
                jbq.X(t, jT, this.q.c(objG));
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

    /* JADX WARN: Code duplicated, block: B:101:0x0299 A[PHI: r0 r19 r23 r26 r27 r28
      0x0299: PHI (r0v53 int) = (r0v48 int), (r0v51 int), (r0v55 int) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r19v5 int) = (r19v3 int), (r19v3 int), (r19v6 int) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r23v3 int) = (r23v1 int), (r23v1 int), (r23v4 int) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r26v2 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r27v6 int) = (r27v4 int), (r27v4 int), (r27v7 int) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r28v7 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x02b1 A[PHI: r0 r19 r23 r26 r27 r28
      0x02b1: PHI (r0v52 int) = (r0v48 int), (r0v51 int), (r0v55 int) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r19v4 int) = (r19v3 int), (r19v3 int), (r19v6 int) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r23v2 int) = (r23v1 int), (r23v1 int), (r23v4 int) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r26v1 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r27v5 int) = (r27v4 int), (r27v4 int), (r27v7 int) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r28v6 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:114:0x0306, B:110:0x02e7, B:100:0x0297] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0086. Please report as an issue. */
    public final int c0(T t, byte[] bArr, int i, int i2, g.b bVar) throws IOException {
        int i3;
        int iH;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int iL;
        int iP;
        int i10;
        int i11;
        int i12;
        this = this;
        t = t;
        bArr = bArr;
        i2 = i2;
        bVar = bVar;
        Unsafe unsafe2 = s;
        int i13 = -1;
        int iG = i;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (iG < i2) {
            int i18 = iG + 1;
            byte b2 = bArr[iG];
            if (b2 < 0) {
                iH = g.H(b2, bArr, i18, bVar);
                i3 = bVar.f9640a;
            } else {
                i3 = b2;
                iH = i18;
            }
            int i19 = i3 >>> 3;
            int i20 = i3 & 7;
            int iF0 = i19 > i14 ? this.f0(i19, i15 / 3) : this.e0(i19);
            if (iF0 == i13) {
                i4 = iH;
                i5 = i19;
                i6 = i13;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int i21 = this.f9756a[iF0 + 1];
                int iQ0 = q0(i21);
                long jT = T(i21);
                if (iQ0 <= 17) {
                    int i22 = this.f9756a[iF0 + 2];
                    int i23 = 1 << (i22 >>> 20);
                    int i24 = 1048575;
                    int i25 = i22 & 1048575;
                    if (i25 != i17) {
                        if (i17 != 1048575) {
                            unsafe2.putInt(t, i17, i16);
                            i24 = 1048575;
                        }
                        if (i25 != i24) {
                            i16 = unsafe2.getInt(t, i25);
                        }
                        i17 = i25;
                    }
                    switch (iQ0) {
                        case 0:
                            i5 = i19;
                            bVar = bVar;
                            i8 = iF0;
                            i9 = i16;
                            if (i20 != 1) {
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                jbq.T(t, jT, g.d(bArr, iH));
                                iG = iH + 8;
                                i16 = i9 | i23;
                                i15 = i8;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 1:
                            i5 = i19;
                            i9 = i16;
                            i8 = iF0;
                            if (i20 != 5) {
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                jbq.U(t, jT, g.l(bArr, iH));
                                iG = iH + 4;
                                i16 = i9 | i23;
                                i15 = i8;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i5 = i19;
                            bVar = bVar;
                            i8 = iF0;
                            i9 = i16;
                            if (i20 != 0) {
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iL = g.L(bArr, iH, bVar);
                                unsafe2.putLong(t, jT, bVar.f9641b);
                                i16 = i9 | i23;
                                i15 = i8;
                                iG = iL;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            i5 = i19;
                            bVar = bVar;
                            i8 = iF0;
                            i9 = i16;
                            if (i20 != 0) {
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iG = g.I(bArr, iH, bVar);
                                unsafe2.putInt(t, jT, bVar.f9640a);
                                i16 = i9 | i23;
                                i15 = i8;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i5 = i19;
                            bVar = bVar;
                            i8 = iF0;
                            i9 = i16;
                            if (i20 != 1) {
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                unsafe2.putLong(t, jT, g.j(bArr, iH));
                                iG = iH + 8;
                                i16 = i9 | i23;
                                i15 = i8;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i5 = i19;
                            i9 = i16;
                            i8 = iF0;
                            if (i20 != 5) {
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                unsafe2.putInt(t, jT, g.h(bArr, iH));
                                iG = iH + 4;
                                i16 = i9 | i23;
                                i15 = i8;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 7:
                            i5 = i19;
                            bVar = bVar;
                            i8 = iF0;
                            i9 = i16;
                            if (i20 != 0) {
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                int iL2 = g.L(bArr, iH, bVar);
                                jbq.N(t, jT, bVar.f9641b != 0);
                                i16 = i9 | i23;
                                iG = iL2;
                                i15 = i8;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 8:
                            i5 = i19;
                            bVar = bVar;
                            i8 = iF0;
                            i9 = i16;
                            if (i20 != 2) {
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iG = (536870912 & i21) == 0 ? g.C(bArr, iH, bVar) : g.F(bArr, iH, bVar);
                                unsafe2.putObject(t, jT, bVar.c);
                                i16 = i9 | i23;
                                i15 = i8;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 9:
                            i5 = i19;
                            bVar = bVar;
                            i8 = iF0;
                            if (i20 != 2) {
                                i9 = i16;
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iP = g.p(this.t(i8), bArr, iH, i2, bVar);
                                Object object = unsafe2.getObject(t, jT);
                                if (object == null) {
                                    unsafe2.putObject(t, jT, bVar.c);
                                } else {
                                    unsafe2.putObject(t, jT, d0.k(object, bVar.c));
                                }
                                i16 |= i23;
                                iG = iP;
                                i15 = i8;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 10:
                            i5 = i19;
                            bVar = bVar;
                            i8 = iF0;
                            if (i20 != 2) {
                                i9 = i16;
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iP = g.b(bArr, iH, bVar);
                                unsafe2.putObject(t, jT, bVar.c);
                                i16 |= i23;
                                iG = iP;
                                i15 = i8;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 12:
                            i5 = i19;
                            bVar = bVar;
                            i8 = iF0;
                            if (i20 != 0) {
                                i9 = i16;
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iP = g.I(bArr, iH, bVar);
                                unsafe2.putInt(t, jT, bVar.f9640a);
                                i16 |= i23;
                                iG = iP;
                                i15 = i8;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 15:
                            i5 = i19;
                            bVar = bVar;
                            i8 = iF0;
                            if (i20 != 0) {
                                i9 = i16;
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                iG = g.I(bArr, iH, bVar);
                                unsafe2.putInt(t, jT, j.b(bVar.f9640a));
                                i16 |= i23;
                                i15 = i8;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        case 16:
                            if (i20 != 0) {
                                i5 = i19;
                                i8 = iF0;
                                i9 = i16;
                                i16 = i9;
                                i4 = iH;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                            } else {
                                bVar = bVar;
                                iL = g.L(bArr, iH, bVar);
                                i8 = iF0;
                                i5 = i19;
                                unsafe2.putLong(t, jT, j.c(bVar.f9641b));
                                i16 |= i23;
                                i15 = i8;
                                iG = iL;
                                i14 = i5;
                                i13 = -1;
                            }
                            break;
                        default:
                            i5 = i19;
                            i8 = iF0;
                            i9 = i16;
                            i16 = i9;
                            i4 = iH;
                            i7 = i8;
                            unsafe = unsafe2;
                            i6 = -1;
                            break;
                    }
                } else {
                    i5 = i19;
                    int i26 = i16;
                    bVar = bVar;
                    if (iQ0 != 27) {
                        if (iQ0 <= 49) {
                            i11 = i26;
                            int i27 = iH;
                            i10 = i17;
                            i7 = iF0;
                            i6 = -1;
                            unsafe = unsafe2;
                            iG = d0(t, bArr, iH, i2, i3, i5, i20, iF0, i21, iQ0, jT, bVar);
                            if (iG != i27) {
                                i14 = i5;
                                i13 = i6;
                                i16 = i11;
                                i17 = i10;
                            } else {
                                i4 = iG;
                                i16 = i11;
                                i17 = i10;
                            }
                        } else {
                            i10 = i17;
                            i7 = iF0;
                            unsafe = unsafe2;
                            i11 = i26;
                            i6 = -1;
                            i12 = iH;
                            if (iQ0 == 50) {
                                if (i20 == 2) {
                                    iG = Z(t, bArr, i12, i2, i7, jT, bVar);
                                    if (iG != i12) {
                                        i14 = i5;
                                        i13 = i6;
                                        i16 = i11;
                                        i17 = i10;
                                    } else {
                                        i4 = iG;
                                    }
                                }
                                i16 = i11;
                                i17 = i10;
                            } else {
                                iG = a0(t, bArr, i12, i2, i3, i5, i20, i21, iQ0, jT, i7, bVar);
                                if (iG != i12) {
                                    i14 = i5;
                                    i13 = i6;
                                    i16 = i11;
                                    i17 = i10;
                                } else {
                                    i4 = iG;
                                    i16 = i11;
                                    i17 = i10;
                                }
                            }
                        }
                        i15 = i7;
                        unsafe2 = unsafe;
                    } else if (i20 == 2) {
                        d0.i iVarA2 = (d0.i) unsafe2.getObject(t, jT);
                        if (!iVarA2.c()) {
                            int size = iVarA2.size();
                            iVarA2 = iVarA2.a2(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(t, jT, iVarA2);
                        }
                        iG = g.q(this.t(iF0), i3, bArr, iH, i2, iVarA2, bVar);
                        i15 = iF0;
                        i16 = i26;
                        i14 = i5;
                        i13 = -1;
                        this = this;
                    } else {
                        i12 = iH;
                        i10 = i17;
                        i7 = iF0;
                        unsafe = unsafe2;
                        i11 = i26;
                        i6 = -1;
                    }
                    i4 = i12;
                    i16 = i11;
                    i17 = i10;
                }
            }
            iG = g.G(i3, bArr, i4, i2, u(t), bVar);
            i14 = i5;
            i13 = i6;
            i15 = i7;
            unsafe2 = unsafe;
        }
        int i28 = i16;
        Unsafe unsafe3 = unsafe2;
        if (i17 != 1048575) {
            unsafe3.putInt(t, i17, i28);
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    @Override // com.google.protobuf.e1
    public int d(T t) {
        return this.h ? w(t) : v(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int d0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, g.b bVar) throws IOException {
        int iJ;
        Unsafe unsafe = s;
        d0.i iVarA2 = (d0.i) unsafe.getObject(t, j2);
        if (!iVarA2.c()) {
            int size = iVarA2.size();
            iVarA2 = iVarA2.a2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, iVarA2);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return g.s(bArr, i, iVarA2, bVar);
                }
                return i5 == 1 ? g.e(i3, bArr, i, i2, iVarA2, bVar) : i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return g.v(bArr, i, iVarA2, bVar);
                }
                return i5 == 5 ? g.m(i3, bArr, i, i2, iVarA2, bVar) : i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return g.z(bArr, i, iVarA2, bVar);
                }
                return i5 == 0 ? g.M(i3, bArr, i, i2, iVarA2, bVar) : i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return g.y(bArr, i, iVarA2, bVar);
                }
                return i5 == 0 ? g.J(i3, bArr, i, i2, iVarA2, bVar) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return g.u(bArr, i, iVarA2, bVar);
                }
                return i5 == 1 ? g.k(i3, bArr, i, i2, iVarA2, bVar) : i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return g.t(bArr, i, iVarA2, bVar);
                }
                return i5 == 5 ? g.i(i3, bArr, i, i2, iVarA2, bVar) : i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return g.r(bArr, i, iVarA2, bVar);
                }
                return i5 == 0 ? g.a(i3, bArr, i, i2, iVarA2, bVar) : i;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? g.D(i3, bArr, i, i2, iVarA2, bVar) : g.E(i3, bArr, i, i2, iVarA2, bVar);
                }
                return i;
            case 27:
                return i5 == 2 ? g.q(t(i6), i3, bArr, i, i2, iVarA2, bVar) : i;
            case 28:
                return i5 == 2 ? g.c(i3, bArr, i, i2, iVarA2, bVar) : i;
            case 30:
            case 44:
                if (i5 == 2) {
                    iJ = g.y(bArr, i, iVarA2, bVar);
                } else {
                    if (i5 != 0) {
                        return i;
                    }
                    iJ = g.J(i3, bArr, i, i2, iVarA2, bVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                s1 s1Var = generatedMessageLite.unknownFields;
                if (s1Var == s1.c()) {
                    s1Var = null;
                }
                s1 s1Var2 = (s1) f1.A(i4, iVarA2, r(i6), s1Var, this.o);
                if (s1Var2 != null) {
                    generatedMessageLite.unknownFields = s1Var2;
                }
                return iJ;
            case 33:
            case 47:
                if (i5 == 2) {
                    return g.w(bArr, i, iVarA2, bVar);
                }
                return i5 == 0 ? g.A(i3, bArr, i, i2, iVarA2, bVar) : i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return g.x(bArr, i, iVarA2, bVar);
                }
                return i5 == 0 ? g.B(i3, bArr, i, i2, iVarA2, bVar) : i;
            case 49:
                return i5 == 3 ? g.o(t(i6), i3, bArr, i, i2, iVarA2, bVar) : i;
            default:
                return i;
        }
    }

    @Override // com.google.protobuf.e1
    public T e() {
        return (T) this.m.a(this.e);
    }

    public final int e0(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return o0(i, 0);
    }

    @Override // com.google.protobuf.e1
    public boolean equals(T t, T t2) {
        int length = this.f9756a.length;
        for (int i = 0; i < length; i += 3) {
            if (!n(t, t2, i)) {
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

    @Override // com.google.protobuf.e1
    public void f(T t, Writer writer) throws IOException {
        if (writer.B() == Writer.FieldOrder.DESCENDING) {
            u0(t, writer);
        } else if (this.h) {
            t0(t, writer);
        } else {
            s0(t, writer);
        }
    }

    public final int f0(int i, int i2) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return o0(i, i2);
    }

    @Override // com.google.protobuf.e1
    public void g(T t, byte[] bArr, int i, int i2, g.b bVar) throws IOException {
        if (this.h) {
            c0(t, bArr, i, i2, bVar);
        } else {
            b0(t, bArr, i, i2, 0, bVar);
        }
    }

    public final int g0(int i) {
        return this.f9756a[i + 2];
    }

    @Override // com.google.protobuf.e1
    public void h(T t, a1 a1Var, t tVar) throws IOException {
        tVar.getClass();
        K(this.o, this.p, t, a1Var, tVar);
    }

    public final <E> void h0(Object obj, long j, a1 a1Var, e1<E> e1Var, t tVar) throws IOException {
        a1Var.K(this.n.e(obj, j), e1Var, tVar);
    }

    @Override // com.google.protobuf.e1
    public int hashCode(T t) {
        int i;
        int i2;
        int length = this.f9756a.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iR0 = r0(i4);
            int iS = S(i4);
            long jT = T(iR0);
            int iHashCode = 37;
            switch (q0(iR0)) {
                case 0:
                    i = i3 * 53;
                    i2 = d0.i(Double.doubleToLongBits(jbq.A(t, jT)));
                    i3 = i + i2;
                    break;
                case 1:
                    i = i3 * 53;
                    i2 = Float.floatToIntBits(jbq.B(t, jT));
                    i3 = i + i2;
                    break;
                case 2:
                    i = i3 * 53;
                    i2 = d0.i(jbq.E(t, jT));
                    i3 = i + i2;
                    break;
                case 3:
                    i = i3 * 53;
                    i2 = d0.i(jbq.E(t, jT));
                    i3 = i + i2;
                    break;
                case 4:
                    i = i3 * 53;
                    i2 = jbq.C(t, jT);
                    i3 = i + i2;
                    break;
                case 5:
                    i = i3 * 53;
                    i2 = d0.i(jbq.E(t, jT));
                    i3 = i + i2;
                    break;
                case 6:
                    i = i3 * 53;
                    i2 = jbq.C(t, jT);
                    i3 = i + i2;
                    break;
                case 7:
                    i = i3 * 53;
                    i2 = d0.d(jbq.t(t, jT));
                    i3 = i + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    i2 = ((String) jbq.G(t, jT)).hashCode();
                    i3 = i + i2;
                    break;
                case 9:
                    Object objG = jbq.G(t, jT);
                    if (objG != null) {
                        iHashCode = objG.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    i2 = jbq.G(t, jT).hashCode();
                    i3 = i + i2;
                    break;
                case 11:
                    i = i3 * 53;
                    i2 = jbq.C(t, jT);
                    i3 = i + i2;
                    break;
                case 12:
                    i = i3 * 53;
                    i2 = jbq.C(t, jT);
                    i3 = i + i2;
                    break;
                case 13:
                    i = i3 * 53;
                    i2 = jbq.C(t, jT);
                    i3 = i + i2;
                    break;
                case 14:
                    i = i3 * 53;
                    i2 = d0.i(jbq.E(t, jT));
                    i3 = i + i2;
                    break;
                case 15:
                    i = i3 * 53;
                    i2 = jbq.C(t, jT);
                    i3 = i + i2;
                    break;
                case 16:
                    i = i3 * 53;
                    i2 = d0.i(jbq.E(t, jT));
                    i3 = i + i2;
                    break;
                case 17:
                    Object objG2 = jbq.G(t, jT);
                    if (objG2 != null) {
                        iHashCode = objG2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
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
                    i = i3 * 53;
                    i2 = jbq.G(t, jT).hashCode();
                    i3 = i + i2;
                    break;
                case 50:
                    i = i3 * 53;
                    i2 = jbq.G(t, jT).hashCode();
                    i3 = i + i2;
                    break;
                case 51:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = d0.i(Double.doubleToLongBits(V(t, jT)));
                        i3 = i + i2;
                    }
                    break;
                case 52:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = Float.floatToIntBits(W(t, jT));
                        i3 = i + i2;
                    }
                    break;
                case 53:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = d0.i(Y(t, jT));
                        i3 = i + i2;
                    }
                    break;
                case 54:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = d0.i(Y(t, jT));
                        i3 = i + i2;
                    }
                    break;
                case 55:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = X(t, jT);
                        i3 = i + i2;
                    }
                    break;
                case 56:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = d0.i(Y(t, jT));
                        i3 = i + i2;
                    }
                    break;
                case 57:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = X(t, jT);
                        i3 = i + i2;
                    }
                    break;
                case 58:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = d0.d(U(t, jT));
                        i3 = i + i2;
                    }
                    break;
                case 59:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = ((String) jbq.G(t, jT)).hashCode();
                        i3 = i + i2;
                    }
                    break;
                case 60:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = jbq.G(t, jT).hashCode();
                        i3 = i + i2;
                    }
                    break;
                case 61:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = jbq.G(t, jT).hashCode();
                        i3 = i + i2;
                    }
                    break;
                case 62:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = X(t, jT);
                        i3 = i + i2;
                    }
                    break;
                case 63:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = X(t, jT);
                        i3 = i + i2;
                    }
                    break;
                case 64:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = X(t, jT);
                        i3 = i + i2;
                    }
                    break;
                case 65:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = d0.i(Y(t, jT));
                        i3 = i + i2;
                    }
                    break;
                case 66:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = X(t, jT);
                        i3 = i + i2;
                    }
                    break;
                case 67:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = d0.i(Y(t, jT));
                        i3 = i + i2;
                    }
                    break;
                case 68:
                    if (G(t, iS, i4)) {
                        i = i3 * 53;
                        i2 = jbq.G(t, jT).hashCode();
                        i3 = i + i2;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + this.o.g(t).hashCode();
        return this.f ? (iHashCode2 * 53) + this.p.c(t).hashCode() : iHashCode2;
    }

    public final boolean i(T t, T t2, int i) {
        return A(t, i) == A(t2, i);
    }

    public final <E> void i0(Object obj, int i, a1 a1Var, e1<E> e1Var, t tVar) throws IOException {
        a1Var.L(this.n.e(obj, T(i)), e1Var, tVar);
    }

    public final void j0(Object obj, int i, a1 a1Var) throws IOException {
        if (z(i)) {
            jbq.X(obj, T(i), a1Var.G());
        } else if (this.g) {
            jbq.X(obj, T(i), a1Var.E());
        } else {
            jbq.X(obj, T(i), a1Var.readBytes());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> int k(byte[] bArr, int i, int i2, k0.b<K, V> bVar, Map<K, V> map, g.b bVar2) throws IOException {
        int iH;
        int I = g.I(bArr, i, bVar2);
        int i3 = bVar2.f9640a;
        if (i3 < 0 || i3 > i2 - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = I + i3;
        Object obj = bVar.f9684b;
        Object obj2 = bVar.d;
        while (I < i4) {
            int i5 = I + 1;
            int i6 = bArr[I];
            if (i6 < 0) {
                iH = g.H(i6, bArr, i5, bVar2);
                i6 = bVar2.f9640a;
            } else {
                iH = i5;
            }
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i7 != 1) {
                if (i7 == 2 && i8 == bVar.c.getWireType()) {
                    I = l(bArr, iH, i2, bVar.c, bVar.d.getClass(), bVar2);
                    obj2 = bVar2.c;
                } else {
                    I = g.N(i6, bArr, iH, i2, bVar2);
                }
            } else if (i8 == bVar.f9683a.getWireType()) {
                I = l(bArr, iH, i2, bVar.f9683a, null, bVar2);
                obj = bVar2.c;
            } else {
                I = g.N(i6, bArr, iH, i2, bVar2);
            }
        }
        if (I != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i4;
    }

    public final void k0(Object obj, int i, a1 a1Var) throws IOException {
        if (z(i)) {
            a1Var.y(this.n.e(obj, T(i)));
        } else {
            a1Var.m(this.n.e(obj, T(i)));
        }
    }

    public final int l(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class<?> cls, g.b bVar) throws IOException {
        switch (a.f9759a[fieldType.ordinal()]) {
            case 1:
                int iL = g.L(bArr, i, bVar);
                bVar.c = Boolean.valueOf(bVar.f9641b != 0);
                return iL;
            case 2:
                return g.b(bArr, i, bVar);
            case 3:
                bVar.c = Double.valueOf(g.d(bArr, i));
                return i + 8;
            case 4:
            case 5:
                bVar.c = Integer.valueOf(g.h(bArr, i));
                return i + 4;
            case 6:
            case 7:
                bVar.c = Long.valueOf(g.j(bArr, i));
                return i + 8;
            case 8:
                bVar.c = Float.valueOf(g.l(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int I = g.I(bArr, i, bVar);
                bVar.c = Integer.valueOf(bVar.f9640a);
                return I;
            case 12:
            case 13:
                int iL2 = g.L(bArr, i, bVar);
                bVar.c = Long.valueOf(bVar.f9641b);
                return iL2;
            case 14:
                return g.p(xdi.a().d(cls), bArr, i, i2, bVar);
            case 15:
                int I2 = g.I(bArr, i, bVar);
                bVar.c = Integer.valueOf(j.b(bVar.f9640a));
                return I2;
            case 16:
                int iL3 = g.L(bArr, i, bVar);
                bVar.c = Long.valueOf(j.c(bVar.f9641b));
                return iL3;
            case 17:
                return g.F(bArr, i, bVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final void m0(T t, int i) {
        int iG0 = g0(i);
        long j = 1048575 & iG0;
        if (j == 1048575) {
            return;
        }
        jbq.V(t, j, (1 << (iG0 >>> 20)) | jbq.C(t, j));
    }

    public final boolean n(T t, T t2, int i) {
        int iR0 = r0(i);
        long jT = T(iR0);
        switch (q0(iR0)) {
            case 0:
                return i(t, t2, i) && Double.doubleToLongBits(jbq.A(t, jT)) == Double.doubleToLongBits(jbq.A(t2, jT));
            case 1:
                return i(t, t2, i) && Float.floatToIntBits(jbq.B(t, jT)) == Float.floatToIntBits(jbq.B(t2, jT));
            case 2:
                return i(t, t2, i) && jbq.E(t, jT) == jbq.E(t2, jT);
            case 3:
                return i(t, t2, i) && jbq.E(t, jT) == jbq.E(t2, jT);
            case 4:
                return i(t, t2, i) && jbq.C(t, jT) == jbq.C(t2, jT);
            case 5:
                return i(t, t2, i) && jbq.E(t, jT) == jbq.E(t2, jT);
            case 6:
                return i(t, t2, i) && jbq.C(t, jT) == jbq.C(t2, jT);
            case 7:
                return i(t, t2, i) && jbq.t(t, jT) == jbq.t(t2, jT);
            case 8:
                return i(t, t2, i) && f1.L(jbq.G(t, jT), jbq.G(t2, jT));
            case 9:
                return i(t, t2, i) && f1.L(jbq.G(t, jT), jbq.G(t2, jT));
            case 10:
                return i(t, t2, i) && f1.L(jbq.G(t, jT), jbq.G(t2, jT));
            case 11:
                return i(t, t2, i) && jbq.C(t, jT) == jbq.C(t2, jT);
            case 12:
                return i(t, t2, i) && jbq.C(t, jT) == jbq.C(t2, jT);
            case 13:
                return i(t, t2, i) && jbq.C(t, jT) == jbq.C(t2, jT);
            case 14:
                return i(t, t2, i) && jbq.E(t, jT) == jbq.E(t2, jT);
            case 15:
                return i(t, t2, i) && jbq.C(t, jT) == jbq.C(t2, jT);
            case 16:
                return i(t, t2, i) && jbq.E(t, jT) == jbq.E(t2, jT);
            case 17:
                return i(t, t2, i) && f1.L(jbq.G(t, jT), jbq.G(t2, jT));
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
                return f1.L(jbq.G(t, jT), jbq.G(t2, jT));
            case 50:
                return f1.L(jbq.G(t, jT), jbq.G(t2, jT));
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
                return F(t, t2, i) && f1.L(jbq.G(t, jT), jbq.G(t2, jT));
            default:
                return true;
        }
    }

    public final void n0(T t, int i, int i2) {
        jbq.V(t, g0(i2) & 1048575, i);
    }

    public final <UT, UB> UB o(Object obj, int i, UB ub, q1<UT, UB> q1Var) {
        d0.e eVarR;
        int iS = S(i);
        Object objG = jbq.G(obj, T(r0(i)));
        return (objG == null || (eVarR = r(i)) == null) ? ub : (UB) p(i, iS, this.q.e(objG), eVarR, ub, q1Var);
    }

    public final int o0(int i, int i2) {
        int length = (this.f9756a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iS = S(i4);
            if (i == iS) {
                return i4;
            }
            if (i < iS) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final <K, V, UT, UB> UB p(int i, int i2, Map<K, V> map, d0.e eVar, UB ub, q1<UT, UB> q1Var) {
        k0.b<?, ?> bVarB = this.q.b(s(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = q1Var.n();
                }
                ByteString.h hVarNewCodedBuilder = ByteString.newCodedBuilder(k0.b(bVarB, next.getKey(), next.getValue()));
                try {
                    k0.f(hVarNewCodedBuilder.b(), bVarB, next.getKey(), next.getValue());
                    q1Var.d(ub, i2, hVarNewCodedBuilder.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final d0.e r(int i) {
        return (d0.e) this.f9757b[((i / 3) * 2) + 1];
    }

    public final int r0(int i) {
        return this.f9756a[i + 1];
    }

    public final Object s(int i) {
        return this.f9757b[(i / 3) * 2];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void s0(T t, Writer writer) throws IOException {
        Iterator itF;
        Map.Entry<?, ?> entry;
        int i;
        if (this.f) {
            a0<T> a0VarC = this.p.c(t);
            if (a0VarC.A()) {
                itF = null;
                entry = null;
            } else {
                itF = a0VarC.F();
                entry = (Map.Entry) itF.next();
            }
        } else {
            itF = null;
            entry = null;
        }
        int length = this.f9756a.length;
        Unsafe unsafe = s;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iR0 = r0(i4);
            int iS = S(i4);
            int iQ0 = q0(iR0);
            if (iQ0 <= 17) {
                int i6 = this.f9756a[i4 + 2];
                int i7 = i6 & i2;
                if (i7 != i3) {
                    i5 = unsafe.getInt(t, i7);
                    i3 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            while (entry != null && this.p.a(entry) <= iS) {
                this.p.j(writer, entry);
                entry = itF.hasNext() ? (Map.Entry) itF.next() : null;
            }
            long jT = T(iR0);
            switch (iQ0) {
                case 0:
                    if ((i & i5) != 0) {
                        writer.z(iS, m(t, jT));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i & i5) != 0) {
                        writer.F(iS, q(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i & i5) != 0) {
                        writer.C(iS, unsafe.getLong(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i & i5) != 0) {
                        writer.e(iS, unsafe.getLong(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i & i5) != 0) {
                        writer.g(iS, unsafe.getInt(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i & i5) != 0) {
                        writer.m(iS, unsafe.getLong(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i & i5) != 0) {
                        writer.c(iS, unsafe.getInt(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i & i5) != 0) {
                        writer.n(iS, j(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i & i5) != 0) {
                        w0(iS, unsafe.getObject(t, jT), writer);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i & i5) != 0) {
                        writer.Q(iS, unsafe.getObject(t, jT), t(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i & i5) != 0) {
                        writer.K(iS, (ByteString) unsafe.getObject(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i & i5) != 0) {
                        writer.k(iS, unsafe.getInt(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i & i5) != 0) {
                        writer.G(iS, unsafe.getInt(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i & i5) != 0) {
                        writer.o(iS, unsafe.getInt(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i & i5) != 0) {
                        writer.w(iS, unsafe.getLong(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i & i5) != 0) {
                        writer.I(iS, unsafe.getInt(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        writer.j(iS, unsafe.getLong(t, jT));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i & i5) != 0) {
                        writer.O(iS, unsafe.getObject(t, jT), t(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    f1.R(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    f1.V(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    f1.Z(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    f1.i0(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    f1.Y(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    f1.U(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    f1.T(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    f1.P(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    f1.g0(S(i4), (List) unsafe.getObject(t, jT), writer);
                    break;
                case 27:
                    f1.b0(S(i4), (List) unsafe.getObject(t, jT), writer, t(i4));
                    break;
                case 28:
                    f1.Q(S(i4), (List) unsafe.getObject(t, jT), writer);
                    break;
                case 29:
                    f1.h0(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    f1.S(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    f1.c0(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    f1.d0(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    f1.e0(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    f1.f0(S(i4), (List) unsafe.getObject(t, jT), writer, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    f1.R(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 36:
                    f1.V(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 37:
                    f1.Z(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 38:
                    f1.i0(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 39:
                    f1.Y(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 40:
                    f1.U(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 41:
                    f1.T(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 42:
                    f1.P(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 43:
                    f1.h0(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 44:
                    f1.S(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 45:
                    f1.c0(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 46:
                    f1.d0(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 47:
                    f1.e0(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 48:
                    f1.f0(S(i4), (List) unsafe.getObject(t, jT), writer, true);
                    break;
                case 49:
                    f1.X(S(i4), (List) unsafe.getObject(t, jT), writer, t(i4));
                    break;
                case 50:
                    v0(writer, iS, unsafe.getObject(t, jT), i4);
                    break;
                case 51:
                    if (G(t, iS, i4)) {
                        writer.z(iS, V(t, jT));
                    }
                    break;
                case 52:
                    if (G(t, iS, i4)) {
                        writer.F(iS, W(t, jT));
                    }
                    break;
                case 53:
                    if (G(t, iS, i4)) {
                        writer.C(iS, Y(t, jT));
                    }
                    break;
                case 54:
                    if (G(t, iS, i4)) {
                        writer.e(iS, Y(t, jT));
                    }
                    break;
                case 55:
                    if (G(t, iS, i4)) {
                        writer.g(iS, X(t, jT));
                    }
                    break;
                case 56:
                    if (G(t, iS, i4)) {
                        writer.m(iS, Y(t, jT));
                    }
                    break;
                case 57:
                    if (G(t, iS, i4)) {
                        writer.c(iS, X(t, jT));
                    }
                    break;
                case 58:
                    if (G(t, iS, i4)) {
                        writer.n(iS, U(t, jT));
                    }
                    break;
                case 59:
                    if (G(t, iS, i4)) {
                        w0(iS, unsafe.getObject(t, jT), writer);
                    }
                    break;
                case 60:
                    if (G(t, iS, i4)) {
                        writer.Q(iS, unsafe.getObject(t, jT), t(i4));
                    }
                    break;
                case 61:
                    if (G(t, iS, i4)) {
                        writer.K(iS, (ByteString) unsafe.getObject(t, jT));
                    }
                    break;
                case 62:
                    if (G(t, iS, i4)) {
                        writer.k(iS, X(t, jT));
                    }
                    break;
                case 63:
                    if (G(t, iS, i4)) {
                        writer.G(iS, X(t, jT));
                    }
                    break;
                case 64:
                    if (G(t, iS, i4)) {
                        writer.o(iS, X(t, jT));
                    }
                    break;
                case 65:
                    if (G(t, iS, i4)) {
                        writer.w(iS, Y(t, jT));
                    }
                    break;
                case 66:
                    if (G(t, iS, i4)) {
                        writer.I(iS, X(t, jT));
                    }
                    break;
                case 67:
                    if (G(t, iS, i4)) {
                        writer.j(iS, Y(t, jT));
                    }
                    break;
                case 68:
                    if (G(t, iS, i4)) {
                        writer.O(iS, unsafe.getObject(t, jT), t(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        while (entry != null) {
            this.p.j(writer, entry);
            entry = itF.hasNext() ? (Map.Entry) itF.next() : null;
        }
        x0(this.o, t, writer);
    }

    public final e1 t(int i) {
        int i2 = (i / 3) * 2;
        e1 e1Var = (e1) this.f9757b[i2];
        if (e1Var != null) {
            return e1Var;
        }
        e1<T> e1VarD = xdi.a().d((Class) this.f9757b[i2 + 1]);
        this.f9757b[i2] = e1VarD;
        return e1VarD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final void t0(T t, Writer writer) throws IOException {
        Iterator itF;
        Map.Entry<?, ?> entry;
        if (this.f) {
            a0<T> a0VarC = this.p.c(t);
            if (a0VarC.A()) {
                itF = null;
                entry = null;
            } else {
                itF = a0VarC.F();
                entry = (Map.Entry) itF.next();
            }
        } else {
            itF = null;
            entry = null;
        }
        int length = this.f9756a.length;
        for (int i = 0; i < length; i += 3) {
            int iR0 = r0(i);
            int iS = S(i);
            while (entry != null && this.p.a(entry) <= iS) {
                this.p.j(writer, entry);
                entry = itF.hasNext() ? (Map.Entry) itF.next() : null;
            }
            switch (q0(iR0)) {
                case 0:
                    if (A(t, i)) {
                        writer.z(iS, m(t, T(iR0)));
                    }
                    break;
                case 1:
                    if (A(t, i)) {
                        writer.F(iS, q(t, T(iR0)));
                    }
                    break;
                case 2:
                    if (A(t, i)) {
                        writer.C(iS, J(t, T(iR0)));
                    }
                    break;
                case 3:
                    if (A(t, i)) {
                        writer.e(iS, J(t, T(iR0)));
                    }
                    break;
                case 4:
                    if (A(t, i)) {
                        writer.g(iS, y(t, T(iR0)));
                    }
                    break;
                case 5:
                    if (A(t, i)) {
                        writer.m(iS, J(t, T(iR0)));
                    }
                    break;
                case 6:
                    if (A(t, i)) {
                        writer.c(iS, y(t, T(iR0)));
                    }
                    break;
                case 7:
                    if (A(t, i)) {
                        writer.n(iS, j(t, T(iR0)));
                    }
                    break;
                case 8:
                    if (A(t, i)) {
                        w0(iS, jbq.G(t, T(iR0)), writer);
                    }
                    break;
                case 9:
                    if (A(t, i)) {
                        writer.Q(iS, jbq.G(t, T(iR0)), t(i));
                    }
                    break;
                case 10:
                    if (A(t, i)) {
                        writer.K(iS, (ByteString) jbq.G(t, T(iR0)));
                    }
                    break;
                case 11:
                    if (A(t, i)) {
                        writer.k(iS, y(t, T(iR0)));
                    }
                    break;
                case 12:
                    if (A(t, i)) {
                        writer.G(iS, y(t, T(iR0)));
                    }
                    break;
                case 13:
                    if (A(t, i)) {
                        writer.o(iS, y(t, T(iR0)));
                    }
                    break;
                case 14:
                    if (A(t, i)) {
                        writer.w(iS, J(t, T(iR0)));
                    }
                    break;
                case 15:
                    if (A(t, i)) {
                        writer.I(iS, y(t, T(iR0)));
                    }
                    break;
                case 16:
                    if (A(t, i)) {
                        writer.j(iS, J(t, T(iR0)));
                    }
                    break;
                case 17:
                    if (A(t, i)) {
                        writer.O(iS, jbq.G(t, T(iR0)), t(i));
                    }
                    break;
                case 18:
                    f1.R(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 19:
                    f1.V(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 20:
                    f1.Z(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 21:
                    f1.i0(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 22:
                    f1.Y(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 23:
                    f1.U(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 24:
                    f1.T(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 25:
                    f1.P(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 26:
                    f1.g0(S(i), (List) jbq.G(t, T(iR0)), writer);
                    break;
                case 27:
                    f1.b0(S(i), (List) jbq.G(t, T(iR0)), writer, t(i));
                    break;
                case 28:
                    f1.Q(S(i), (List) jbq.G(t, T(iR0)), writer);
                    break;
                case 29:
                    f1.h0(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 30:
                    f1.S(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 31:
                    f1.c0(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 32:
                    f1.d0(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 33:
                    f1.e0(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 34:
                    f1.f0(S(i), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 35:
                    f1.R(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 36:
                    f1.V(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 37:
                    f1.Z(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 38:
                    f1.i0(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 39:
                    f1.Y(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 40:
                    f1.U(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 41:
                    f1.T(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 42:
                    f1.P(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 43:
                    f1.h0(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 44:
                    f1.S(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 45:
                    f1.c0(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 46:
                    f1.d0(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 47:
                    f1.e0(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 48:
                    f1.f0(S(i), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 49:
                    f1.X(S(i), (List) jbq.G(t, T(iR0)), writer, t(i));
                    break;
                case 50:
                    v0(writer, iS, jbq.G(t, T(iR0)), i);
                    break;
                case 51:
                    if (G(t, iS, i)) {
                        writer.z(iS, V(t, T(iR0)));
                    }
                    break;
                case 52:
                    if (G(t, iS, i)) {
                        writer.F(iS, W(t, T(iR0)));
                    }
                    break;
                case 53:
                    if (G(t, iS, i)) {
                        writer.C(iS, Y(t, T(iR0)));
                    }
                    break;
                case 54:
                    if (G(t, iS, i)) {
                        writer.e(iS, Y(t, T(iR0)));
                    }
                    break;
                case 55:
                    if (G(t, iS, i)) {
                        writer.g(iS, X(t, T(iR0)));
                    }
                    break;
                case 56:
                    if (G(t, iS, i)) {
                        writer.m(iS, Y(t, T(iR0)));
                    }
                    break;
                case 57:
                    if (G(t, iS, i)) {
                        writer.c(iS, X(t, T(iR0)));
                    }
                    break;
                case 58:
                    if (G(t, iS, i)) {
                        writer.n(iS, U(t, T(iR0)));
                    }
                    break;
                case 59:
                    if (G(t, iS, i)) {
                        w0(iS, jbq.G(t, T(iR0)), writer);
                    }
                    break;
                case 60:
                    if (G(t, iS, i)) {
                        writer.Q(iS, jbq.G(t, T(iR0)), t(i));
                    }
                    break;
                case 61:
                    if (G(t, iS, i)) {
                        writer.K(iS, (ByteString) jbq.G(t, T(iR0)));
                    }
                    break;
                case 62:
                    if (G(t, iS, i)) {
                        writer.k(iS, X(t, T(iR0)));
                    }
                    break;
                case 63:
                    if (G(t, iS, i)) {
                        writer.G(iS, X(t, T(iR0)));
                    }
                    break;
                case 64:
                    if (G(t, iS, i)) {
                        writer.o(iS, X(t, T(iR0)));
                    }
                    break;
                case 65:
                    if (G(t, iS, i)) {
                        writer.w(iS, Y(t, T(iR0)));
                    }
                    break;
                case 66:
                    if (G(t, iS, i)) {
                        writer.I(iS, X(t, T(iR0)));
                    }
                    break;
                case 67:
                    if (G(t, iS, i)) {
                        writer.j(iS, Y(t, T(iR0)));
                    }
                    break;
                case 68:
                    if (G(t, iS, i)) {
                        writer.O(iS, jbq.G(t, T(iR0)), t(i));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.p.j(writer, entry);
            entry = itF.hasNext() ? (Map.Entry) itF.next() : null;
        }
        x0(this.o, t, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void u0(T t, Writer writer) throws IOException {
        Iterator itP;
        Map.Entry<?, ?> entry;
        x0(this.o, t, writer);
        if (this.f) {
            a0<T> a0VarC = this.p.c(t);
            if (a0VarC.A()) {
                itP = null;
                entry = null;
            } else {
                itP = a0VarC.p();
                entry = (Map.Entry) itP.next();
            }
        } else {
            itP = null;
            entry = null;
        }
        for (int length = this.f9756a.length - 3; length >= 0; length -= 3) {
            int iR0 = r0(length);
            int iS = S(length);
            while (entry != null && this.p.a(entry) > iS) {
                this.p.j(writer, entry);
                entry = itP.hasNext() ? (Map.Entry) itP.next() : null;
            }
            switch (q0(iR0)) {
                case 0:
                    if (A(t, length)) {
                        writer.z(iS, m(t, T(iR0)));
                    }
                    break;
                case 1:
                    if (A(t, length)) {
                        writer.F(iS, q(t, T(iR0)));
                    }
                    break;
                case 2:
                    if (A(t, length)) {
                        writer.C(iS, J(t, T(iR0)));
                    }
                    break;
                case 3:
                    if (A(t, length)) {
                        writer.e(iS, J(t, T(iR0)));
                    }
                    break;
                case 4:
                    if (A(t, length)) {
                        writer.g(iS, y(t, T(iR0)));
                    }
                    break;
                case 5:
                    if (A(t, length)) {
                        writer.m(iS, J(t, T(iR0)));
                    }
                    break;
                case 6:
                    if (A(t, length)) {
                        writer.c(iS, y(t, T(iR0)));
                    }
                    break;
                case 7:
                    if (A(t, length)) {
                        writer.n(iS, j(t, T(iR0)));
                    }
                    break;
                case 8:
                    if (A(t, length)) {
                        w0(iS, jbq.G(t, T(iR0)), writer);
                    }
                    break;
                case 9:
                    if (A(t, length)) {
                        writer.Q(iS, jbq.G(t, T(iR0)), t(length));
                    }
                    break;
                case 10:
                    if (A(t, length)) {
                        writer.K(iS, (ByteString) jbq.G(t, T(iR0)));
                    }
                    break;
                case 11:
                    if (A(t, length)) {
                        writer.k(iS, y(t, T(iR0)));
                    }
                    break;
                case 12:
                    if (A(t, length)) {
                        writer.G(iS, y(t, T(iR0)));
                    }
                    break;
                case 13:
                    if (A(t, length)) {
                        writer.o(iS, y(t, T(iR0)));
                    }
                    break;
                case 14:
                    if (A(t, length)) {
                        writer.w(iS, J(t, T(iR0)));
                    }
                    break;
                case 15:
                    if (A(t, length)) {
                        writer.I(iS, y(t, T(iR0)));
                    }
                    break;
                case 16:
                    if (A(t, length)) {
                        writer.j(iS, J(t, T(iR0)));
                    }
                    break;
                case 17:
                    if (A(t, length)) {
                        writer.O(iS, jbq.G(t, T(iR0)), t(length));
                    }
                    break;
                case 18:
                    f1.R(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 19:
                    f1.V(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 20:
                    f1.Z(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 21:
                    f1.i0(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 22:
                    f1.Y(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 23:
                    f1.U(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 24:
                    f1.T(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 25:
                    f1.P(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 26:
                    f1.g0(S(length), (List) jbq.G(t, T(iR0)), writer);
                    break;
                case 27:
                    f1.b0(S(length), (List) jbq.G(t, T(iR0)), writer, t(length));
                    break;
                case 28:
                    f1.Q(S(length), (List) jbq.G(t, T(iR0)), writer);
                    break;
                case 29:
                    f1.h0(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 30:
                    f1.S(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 31:
                    f1.c0(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 32:
                    f1.d0(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 33:
                    f1.e0(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 34:
                    f1.f0(S(length), (List) jbq.G(t, T(iR0)), writer, false);
                    break;
                case 35:
                    f1.R(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 36:
                    f1.V(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 37:
                    f1.Z(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 38:
                    f1.i0(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 39:
                    f1.Y(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 40:
                    f1.U(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 41:
                    f1.T(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 42:
                    f1.P(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 43:
                    f1.h0(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 44:
                    f1.S(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 45:
                    f1.c0(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 46:
                    f1.d0(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 47:
                    f1.e0(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 48:
                    f1.f0(S(length), (List) jbq.G(t, T(iR0)), writer, true);
                    break;
                case 49:
                    f1.X(S(length), (List) jbq.G(t, T(iR0)), writer, t(length));
                    break;
                case 50:
                    v0(writer, iS, jbq.G(t, T(iR0)), length);
                    break;
                case 51:
                    if (G(t, iS, length)) {
                        writer.z(iS, V(t, T(iR0)));
                    }
                    break;
                case 52:
                    if (G(t, iS, length)) {
                        writer.F(iS, W(t, T(iR0)));
                    }
                    break;
                case 53:
                    if (G(t, iS, length)) {
                        writer.C(iS, Y(t, T(iR0)));
                    }
                    break;
                case 54:
                    if (G(t, iS, length)) {
                        writer.e(iS, Y(t, T(iR0)));
                    }
                    break;
                case 55:
                    if (G(t, iS, length)) {
                        writer.g(iS, X(t, T(iR0)));
                    }
                    break;
                case 56:
                    if (G(t, iS, length)) {
                        writer.m(iS, Y(t, T(iR0)));
                    }
                    break;
                case 57:
                    if (G(t, iS, length)) {
                        writer.c(iS, X(t, T(iR0)));
                    }
                    break;
                case 58:
                    if (G(t, iS, length)) {
                        writer.n(iS, U(t, T(iR0)));
                    }
                    break;
                case 59:
                    if (G(t, iS, length)) {
                        w0(iS, jbq.G(t, T(iR0)), writer);
                    }
                    break;
                case 60:
                    if (G(t, iS, length)) {
                        writer.Q(iS, jbq.G(t, T(iR0)), t(length));
                    }
                    break;
                case 61:
                    if (G(t, iS, length)) {
                        writer.K(iS, (ByteString) jbq.G(t, T(iR0)));
                    }
                    break;
                case 62:
                    if (G(t, iS, length)) {
                        writer.k(iS, X(t, T(iR0)));
                    }
                    break;
                case 63:
                    if (G(t, iS, length)) {
                        writer.G(iS, X(t, T(iR0)));
                    }
                    break;
                case 64:
                    if (G(t, iS, length)) {
                        writer.o(iS, X(t, T(iR0)));
                    }
                    break;
                case 65:
                    if (G(t, iS, length)) {
                        writer.w(iS, Y(t, T(iR0)));
                    }
                    break;
                case 66:
                    if (G(t, iS, length)) {
                        writer.I(iS, X(t, T(iR0)));
                    }
                    break;
                case 67:
                    if (G(t, iS, length)) {
                        writer.j(iS, Y(t, T(iR0)));
                    }
                    break;
                case 68:
                    if (G(t, iS, length)) {
                        writer.O(iS, jbq.G(t, T(iR0)), t(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.p.j(writer, entry);
            entry = itP.hasNext() ? (Map.Entry) itP.next() : null;
        }
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
    public final int v(T t) {
        int i;
        int i2;
        int iJ;
        int iE;
        int iN;
        boolean z;
        int iF;
        int i3;
        int iX;
        int iZ;
        Unsafe unsafe = s;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < this.f9756a.length) {
            int iR0 = r0(i6);
            int iS = S(i6);
            int iQ0 = q0(iR0);
            if (iQ0 <= 17) {
                i = this.f9756a[i6 + 2];
                int i9 = i & i4;
                i2 = 1 << (i >>> 20);
                if (i9 != i5) {
                    i8 = unsafe.getInt(t, i9);
                    i5 = i9;
                }
            } else {
                i = (!this.i || iQ0 < FieldType.DOUBLE_LIST_PACKED.id() || iQ0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f9756a[i6 + 2] & i4;
                i2 = 0;
            }
            long jT = T(iR0);
            switch (iQ0) {
                case 0:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.j(iS, 0.0d);
                        i7 += iJ;
                    }
                    break;
                case 1:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.r(iS, 0.0f);
                        i7 += iJ;
                    }
                    break;
                case 2:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.z(iS, unsafe.getLong(t, jT));
                        i7 += iJ;
                    }
                    break;
                case 3:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.a0(iS, unsafe.getLong(t, jT));
                        i7 += iJ;
                    }
                    break;
                case 4:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.x(iS, unsafe.getInt(t, jT));
                        i7 += iJ;
                    }
                    break;
                case 5:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.p(iS, 0L);
                        i7 += iJ;
                    }
                    break;
                case 6:
                    if ((i8 & i2) != 0) {
                        iJ = CodedOutputStream.n(iS, 0);
                        i7 += iJ;
                    }
                    break;
                case 7:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.e(iS, true);
                        i7 += iE;
                    }
                    break;
                case 8:
                    if ((i8 & i2) != 0) {
                        Object object = unsafe.getObject(t, jT);
                        iE = object instanceof ByteString ? CodedOutputStream.h(iS, (ByteString) object) : CodedOutputStream.V(iS, (String) object);
                        i7 += iE;
                    }
                    break;
                case 9:
                    if ((i8 & i2) != 0) {
                        iE = f1.o(iS, unsafe.getObject(t, jT), t(i6));
                        i7 += iE;
                    }
                    break;
                case 10:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.h(iS, (ByteString) unsafe.getObject(t, jT));
                        i7 += iE;
                    }
                    break;
                case 11:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.Y(iS, unsafe.getInt(t, jT));
                        i7 += iE;
                    }
                    break;
                case 12:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.l(iS, unsafe.getInt(t, jT));
                        i7 += iE;
                    }
                    break;
                case 13:
                    if ((i8 & i2) != 0) {
                        iN = CodedOutputStream.N(iS, 0);
                        i7 += iN;
                    }
                    break;
                case 14:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.P(iS, 0L);
                        i7 += iE;
                    }
                    break;
                case 15:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.R(iS, unsafe.getInt(t, jT));
                        i7 += iE;
                    }
                    break;
                case 16:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.T(iS, unsafe.getLong(t, jT));
                        i7 += iE;
                    }
                    break;
                case 17:
                    if ((i8 & i2) != 0) {
                        iE = CodedOutputStream.u(iS, (q0) unsafe.getObject(t, jT), t(i6));
                        i7 += iE;
                    }
                    break;
                case 18:
                    iE = f1.h(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iE;
                    break;
                case 19:
                    z = false;
                    iF = f1.f(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 20:
                    z = false;
                    iF = f1.m(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 21:
                    z = false;
                    iF = f1.x(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 22:
                    z = false;
                    iF = f1.k(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 23:
                    z = false;
                    iF = f1.h(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 24:
                    z = false;
                    iF = f1.f(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 25:
                    z = false;
                    iF = f1.a(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 26:
                    iE = f1.u(iS, (List) unsafe.getObject(t, jT));
                    i7 += iE;
                    break;
                case 27:
                    iE = f1.p(iS, (List) unsafe.getObject(t, jT), t(i6));
                    i7 += iE;
                    break;
                case 28:
                    iE = f1.c(iS, (List) unsafe.getObject(t, jT));
                    i7 += iE;
                    break;
                case 29:
                    iE = f1.v(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iE;
                    break;
                case 30:
                    z = false;
                    iF = f1.d(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 31:
                    z = false;
                    iF = f1.f(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 32:
                    z = false;
                    iF = f1.h(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 33:
                    z = false;
                    iF = f1.q(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 34:
                    z = false;
                    iF = f1.s(iS, (List) unsafe.getObject(t, jT), false);
                    i7 += iF;
                    break;
                case 35:
                    i3 = f1.i((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 36:
                    i3 = f1.g((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 37:
                    i3 = f1.n((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 38:
                    i3 = f1.y((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 39:
                    i3 = f1.l((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 40:
                    i3 = f1.i((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 41:
                    i3 = f1.g((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 42:
                    i3 = f1.b((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 43:
                    i3 = f1.w((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 44:
                    i3 = f1.e((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 45:
                    i3 = f1.g((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 46:
                    i3 = f1.i((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 47:
                    i3 = f1.r((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 48:
                    i3 = f1.t((List) unsafe.getObject(t, jT));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i, i3);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i3);
                        iN = iX + iZ + i3;
                        i7 += iN;
                    }
                    break;
                case 49:
                    iE = f1.j(iS, (List) unsafe.getObject(t, jT), t(i6));
                    i7 += iE;
                    break;
                case 50:
                    iE = this.q.d(iS, unsafe.getObject(t, jT), s(i6));
                    i7 += iE;
                    break;
                case 51:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.j(iS, 0.0d);
                        i7 += iE;
                    }
                    break;
                case 52:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.r(iS, 0.0f);
                        i7 += iE;
                    }
                    break;
                case 53:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.z(iS, Y(t, jT));
                        i7 += iE;
                    }
                    break;
                case 54:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.a0(iS, Y(t, jT));
                        i7 += iE;
                    }
                    break;
                case 55:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.x(iS, X(t, jT));
                        i7 += iE;
                    }
                    break;
                case 56:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.p(iS, 0L);
                        i7 += iE;
                    }
                    break;
                case 57:
                    if (G(t, iS, i6)) {
                        iN = CodedOutputStream.n(iS, 0);
                        i7 += iN;
                    }
                    break;
                case 58:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.e(iS, true);
                        i7 += iE;
                    }
                    break;
                case 59:
                    if (G(t, iS, i6)) {
                        Object object2 = unsafe.getObject(t, jT);
                        iE = object2 instanceof ByteString ? CodedOutputStream.h(iS, (ByteString) object2) : CodedOutputStream.V(iS, (String) object2);
                        i7 += iE;
                    }
                    break;
                case 60:
                    if (G(t, iS, i6)) {
                        iE = f1.o(iS, unsafe.getObject(t, jT), t(i6));
                        i7 += iE;
                    }
                    break;
                case 61:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.h(iS, (ByteString) unsafe.getObject(t, jT));
                        i7 += iE;
                    }
                    break;
                case 62:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.Y(iS, X(t, jT));
                        i7 += iE;
                    }
                    break;
                case 63:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.l(iS, X(t, jT));
                        i7 += iE;
                    }
                    break;
                case 64:
                    if (G(t, iS, i6)) {
                        iN = CodedOutputStream.N(iS, 0);
                        i7 += iN;
                    }
                    break;
                case 65:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.P(iS, 0L);
                        i7 += iE;
                    }
                    break;
                case 66:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.R(iS, X(t, jT));
                        i7 += iE;
                    }
                    break;
                case 67:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.T(iS, Y(t, jT));
                        i7 += iE;
                    }
                    break;
                case 68:
                    if (G(t, iS, i6)) {
                        iE = CodedOutputStream.u(iS, (q0) unsafe.getObject(t, jT), t(i6));
                        i7 += iE;
                    }
                    break;
                default:
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        int iX2 = i7 + x(this.o, t);
        return this.f ? iX2 + this.p.c(t).x() : iX2;
    }

    public final <K, V> void v0(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.M(i, this.q.b(s(i2)), this.q.g(obj));
        }
    }

    public final int w(T t) {
        int iJ;
        int i;
        int iX;
        int iZ;
        Unsafe unsafe = s;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9756a.length; i3 += 3) {
            int iR0 = r0(i3);
            int iQ0 = q0(iR0);
            int iS = S(i3);
            long jT = T(iR0);
            int i4 = (iQ0 < FieldType.DOUBLE_LIST_PACKED.id() || iQ0 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.f9756a[i3 + 2] & 1048575;
            switch (iQ0) {
                case 0:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.j(iS, 0.0d);
                        i2 += iJ;
                    }
                    break;
                case 1:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.r(iS, 0.0f);
                        i2 += iJ;
                    }
                    break;
                case 2:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.z(iS, jbq.E(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 3:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.a0(iS, jbq.E(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 4:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.x(iS, jbq.C(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 5:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.p(iS, 0L);
                        i2 += iJ;
                    }
                    break;
                case 6:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.n(iS, 0);
                        i2 += iJ;
                    }
                    break;
                case 7:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.e(iS, true);
                        i2 += iJ;
                    }
                    break;
                case 8:
                    if (A(t, i3)) {
                        Object objG = jbq.G(t, jT);
                        iJ = objG instanceof ByteString ? CodedOutputStream.h(iS, (ByteString) objG) : CodedOutputStream.V(iS, (String) objG);
                        i2 += iJ;
                    }
                    break;
                case 9:
                    if (A(t, i3)) {
                        iJ = f1.o(iS, jbq.G(t, jT), t(i3));
                        i2 += iJ;
                    }
                    break;
                case 10:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.h(iS, (ByteString) jbq.G(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 11:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.Y(iS, jbq.C(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 12:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.l(iS, jbq.C(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 13:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.N(iS, 0);
                        i2 += iJ;
                    }
                    break;
                case 14:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.P(iS, 0L);
                        i2 += iJ;
                    }
                    break;
                case 15:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.R(iS, jbq.C(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 16:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.T(iS, jbq.E(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 17:
                    if (A(t, i3)) {
                        iJ = CodedOutputStream.u(iS, (q0) jbq.G(t, jT), t(i3));
                        i2 += iJ;
                    }
                    break;
                case 18:
                    iJ = f1.h(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 19:
                    iJ = f1.f(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 20:
                    iJ = f1.m(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 21:
                    iJ = f1.x(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 22:
                    iJ = f1.k(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 23:
                    iJ = f1.h(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 24:
                    iJ = f1.f(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 25:
                    iJ = f1.a(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 26:
                    iJ = f1.u(iS, I(t, jT));
                    i2 += iJ;
                    break;
                case 27:
                    iJ = f1.p(iS, I(t, jT), t(i3));
                    i2 += iJ;
                    break;
                case 28:
                    iJ = f1.c(iS, I(t, jT));
                    i2 += iJ;
                    break;
                case 29:
                    iJ = f1.v(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 30:
                    iJ = f1.d(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 31:
                    iJ = f1.f(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 32:
                    iJ = f1.h(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 33:
                    iJ = f1.q(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 34:
                    iJ = f1.s(iS, I(t, jT), false);
                    i2 += iJ;
                    break;
                case 35:
                    i = f1.i((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 36:
                    i = f1.g((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 37:
                    i = f1.n((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 38:
                    i = f1.y((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 39:
                    i = f1.l((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 40:
                    i = f1.i((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 41:
                    i = f1.g((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 42:
                    i = f1.b((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 43:
                    i = f1.w((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 44:
                    i = f1.e((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 45:
                    i = f1.g((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 46:
                    i = f1.i((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 47:
                    i = f1.r((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 48:
                    i = f1.t((List) unsafe.getObject(t, jT));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t, i4, i);
                        }
                        iX = CodedOutputStream.X(iS);
                        iZ = CodedOutputStream.Z(i);
                        iJ = iX + iZ + i;
                        i2 += iJ;
                    }
                    break;
                case 49:
                    iJ = f1.j(iS, I(t, jT), t(i3));
                    i2 += iJ;
                    break;
                case 50:
                    iJ = this.q.d(iS, jbq.G(t, jT), s(i3));
                    i2 += iJ;
                    break;
                case 51:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.j(iS, 0.0d);
                        i2 += iJ;
                    }
                    break;
                case 52:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.r(iS, 0.0f);
                        i2 += iJ;
                    }
                    break;
                case 53:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.z(iS, Y(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 54:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.a0(iS, Y(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 55:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.x(iS, X(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 56:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.p(iS, 0L);
                        i2 += iJ;
                    }
                    break;
                case 57:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.n(iS, 0);
                        i2 += iJ;
                    }
                    break;
                case 58:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.e(iS, true);
                        i2 += iJ;
                    }
                    break;
                case 59:
                    if (G(t, iS, i3)) {
                        Object objG2 = jbq.G(t, jT);
                        iJ = objG2 instanceof ByteString ? CodedOutputStream.h(iS, (ByteString) objG2) : CodedOutputStream.V(iS, (String) objG2);
                        i2 += iJ;
                    }
                    break;
                case 60:
                    if (G(t, iS, i3)) {
                        iJ = f1.o(iS, jbq.G(t, jT), t(i3));
                        i2 += iJ;
                    }
                    break;
                case 61:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.h(iS, (ByteString) jbq.G(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 62:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.Y(iS, X(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 63:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.l(iS, X(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 64:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.N(iS, 0);
                        i2 += iJ;
                    }
                    break;
                case 65:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.P(iS, 0L);
                        i2 += iJ;
                    }
                    break;
                case 66:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.R(iS, X(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 67:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.T(iS, Y(t, jT));
                        i2 += iJ;
                    }
                    break;
                case 68:
                    if (G(t, iS, i3)) {
                        iJ = CodedOutputStream.u(iS, (q0) jbq.G(t, jT), t(i3));
                        i2 += iJ;
                    }
                    break;
            }
        }
        return i2 + x(this.o, t);
    }

    public final void w0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.d(i, (String) obj);
        } else {
            writer.K(i, (ByteString) obj);
        }
    }

    public final <UT, UB> int x(q1<UT, UB> q1Var, T t) {
        return q1Var.h(q1Var.g(t));
    }

    public final <UT, UB> void x0(q1<UT, UB> q1Var, T t, Writer writer) throws IOException {
        q1Var.t(q1Var.g(t), writer);
    }
}
