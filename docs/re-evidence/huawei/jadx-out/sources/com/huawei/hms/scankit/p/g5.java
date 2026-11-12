package com.huawei.hms.scankit.p;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g5 implements o6 {
    public abstract s6 a(int i, r rVar, Map map);

    private s6 b(p pVar, Map map) throws a {
        int iE = pVar.e();
        int iC = pVar.c();
        r rVar = new r(iE);
        int iMax = Math.max(1, iC >> 5);
        int iIntValue = iC / 2;
        if (map != null) {
            m1 m1Var = m1.e;
            if (map.containsKey(m1Var)) {
                iIntValue += (((Integer) map.get(m1Var)).intValue() * iMax) / 3;
            }
        }
        int i = iIntValue;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            int i4 = i3 / 2;
            if ((i2 & 1) != 0) {
                i4 = -i4;
            }
            int i5 = i + (i4 * iMax);
            if (i5 < 0 || i5 >= iC) {
                break;
            }
            s6 s6VarA = a(pVar, rVar, map, i5, iE);
            if (s6VarA != null && s6VarA.k() != null) {
                return s6VarA;
            }
            i2 = i3;
        }
        throw a.a();
    }

    private static boolean a(s6 s6Var, int i) {
        u6[] u6VarArrJ = s6Var.j();
        return Math.abs(((double) u6VarArrJ[1].b()) - ((double) u6VarArrJ[0].b())) / ((double) i) > 0.4d;
    }

    private static boolean a(int[] iArr) {
        int iBitCount = 0;
        int i = 0;
        for (int i2 = 0; i2 < iArr.length && iBitCount < 20; i2++) {
            int i3 = iArr[i2];
            iBitCount += Integer.bitCount((i | (i3 << 1)) ^ i3);
            i = (iArr[i2] >> 31) & 1;
        }
        return iBitCount >= 20;
    }

    @Override // com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map map) {
        return b(pVar, map);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0033  */
    /* JADX WARN: Code duplicated, block: B:23:0x0035  */
    /* JADX WARN: Code duplicated, block: B:40:0x0048 A[SYNTHETIC] */
    private s6 a(p pVar, r rVar, Map map, int i, int i2) throws a {
        int i3;
        s6 s6VarA;
        int i4 = 0;
        while (true) {
            int i5 = 3;
            if (i4 >= 3) {
                return null;
            }
            if (i4 == 0) {
                try {
                    rVar = pVar.a(i, rVar);
                    if (a(rVar.c())) {
                        if (r3.f16302c) {
                            i3 = i5;
                        } else {
                            i3 = 1;
                        }
                        s6VarA = a(rVar, i3, map, i, i2);
                        if (s6VarA != null && s6VarA.k() != null) {
                            return s6VarA;
                        }
                    } else {
                        continue;
                    }
                } catch (a unused) {
                    continue;
                }
            } else {
                if (i4 == 1) {
                    rVar = pVar.b().a(i, rVar);
                    i5 = 1;
                } else if (i4 == 2) {
                    if (r3.t) {
                        rVar = pVar.a(i, 1);
                    } else {
                        continue;
                    }
                }
                if (a(rVar.c())) {
                    if (r3.f16302c) {
                        i3 = 1;
                    } else {
                        i3 = i5;
                    }
                    s6VarA = a(rVar, i3, map, i, i2);
                    if (s6VarA != null) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i4++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    private s6 a(r rVar, int i, Map map, int i2, int i3) {
        u6[] u6VarArrJ;
        Map map2 = map;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 == 0) {
                rVar.b();
            }
            if (i4 == 1) {
                rVar.h();
            }
            if (i4 == 2) {
                rVar.f();
                rVar.i();
            }
            int i5 = 0;
            for (int i6 = 2; i5 < i6; i6 = 2) {
                if (i5 == 1) {
                    rVar.g();
                    if (map2 != null) {
                        m1 m1Var = m1.j;
                        if (map2.containsKey(m1Var)) {
                            EnumMap enumMap = new EnumMap(m1.class);
                            enumMap.putAll(map2);
                            enumMap.remove(m1Var);
                            map2 = enumMap;
                        }
                    }
                }
                try {
                    s6 s6VarA = a(i2, rVar, map2);
                    if (i5 == 1 && (u6VarArrJ = s6VarA.j()) != null) {
                        float f = i3;
                        u6VarArrJ[0] = new u6((f - u6VarArrJ[0].b()) - 1.0f, u6VarArrJ[0].c());
                        u6VarArrJ[1] = new u6((f - u6VarArrJ[1].b()) - 1.0f, u6VarArrJ[1].c());
                    }
                    if (a(s6VarA, i3)) {
                        return s6VarA;
                    }
                    i5++;
                } catch (a unused) {
                    if (i5 == 1) {
                        rVar.g();
                    }
                }
            }
        }
        return null;
    }

    protected static float a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f5 = iArr2[i4] * f3;
            float f6 = i5;
            float f7 = f6 > f5 ? f6 - f5 : f5 - f6;
            if (f7 > f * f3) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f7;
        }
        return f4 / f2;
    }

    protected static void a(r rVar, int i, int[] iArr) throws a {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int iD = rVar.d();
        if (i < iD) {
            boolean z = !rVar.b(i);
            while (i < iD) {
                if (rVar.b(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    if (i2 >= 0 && i2 < iArr.length) {
                        iArr[i2] = 1;
                        z = !z;
                    } else {
                        throw a.a();
                    }
                } else if (i2 >= 0 && i2 < iArr.length) {
                    iArr[i2] = iArr[i2] + 1;
                } else {
                    throw a.a();
                }
                i++;
            }
            if (i2 != length) {
                if (i2 != length - 1 || i != iD) {
                    throw a.a();
                }
                return;
            }
            return;
        }
        throw a.a();
    }
}
