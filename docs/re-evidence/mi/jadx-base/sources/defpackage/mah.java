package defpackage;

import com.amap.api.maps.utils.SpatialRelationUtil;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class mah implements sgj {
    public static float d(int[] iArr, int[] iArr2, float f) {
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
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = iArr2[i4] * f3;
            float f7 = i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static void e(zo2 zo2Var, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int iK = zo2Var.k();
        if (i >= iK) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z = !zo2Var.g(i);
        while (i < iK) {
            if (zo2Var.g(i) == z) {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                z = !z;
            } else {
                iArr[i2] = iArr[i2] + 1;
            }
            i++;
        }
        if (i2 != length) {
            if (i2 != length - 1 || i != iK) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public static void f(zo2 zo2Var, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean zG = zo2Var.g(i);
        while (i > 0 && length >= 0) {
            i--;
            if (zo2Var.g(i) != zG) {
                length--;
                zG = !zG;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        e(zo2Var, i + 1, iArr);
    }

    @Override // defpackage.sgj
    public wsk a(cj2 cj2Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return c(cj2Var, map);
        } catch (NotFoundException e) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !cj2Var.e()) {
                throw e;
            }
            cj2 cj2VarF = cj2Var.f();
            wsk wskVarC = c(cj2VarF, map);
            Map<ResultMetadataType, Object> mapD = wskVarC.d();
            int iIntValue = 270;
            if (mapD != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (mapD.containsKey(resultMetadataType)) {
                    iIntValue = (((Integer) mapD.get(resultMetadataType)).intValue() + 270) % SpatialRelationUtil.A_CIRCLE_DEGREE;
                }
            }
            wskVarC.h(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            atk[] atkVarArrE = wskVarC.e();
            if (atkVarArrE != null) {
                int iC = cj2VarF.c();
                for (int i = 0; i < atkVarArrE.length; i++) {
                    atkVarArrE[i] = new atk((iC - atkVarArrE[i].d()) - 1.0f, atkVarArrE[i].c());
                }
            }
            return wskVarC;
        }
    }

    public abstract wsk b(int i, zo2 zo2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    public final wsk c(cj2 cj2Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        Map<DecodeHintType, ?> map2;
        int i;
        int i2;
        Map<DecodeHintType, ?> map3 = map;
        int iD = cj2Var.d();
        int iC = cj2Var.c();
        zo2 zo2Var = new zo2(iD);
        int i3 = 0;
        int i4 = 1;
        boolean z = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int iMax = Math.max(1, iC >> (z ? 8 : 5));
        int i5 = z ? iC : 15;
        int i6 = iC / 2;
        int i7 = 0;
        while (i7 < i5) {
            int i8 = i7 + 1;
            int i9 = i8 / 2;
            if ((i7 & 1) != 0) {
                i9 = -i9;
            }
            int i10 = (i9 * iMax) + i6;
            if (i10 < 0 || i10 >= iC) {
                break;
            }
            try {
                zo2Var = cj2Var.b(i10, zo2Var);
                int i11 = i3;
                while (i11 < 2) {
                    if (i11 == i4) {
                        zo2Var.q();
                        if (map3 != null) {
                            DecodeHintType decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
                            if (map3.containsKey(decodeHintType)) {
                                EnumMap enumMap = new EnumMap(DecodeHintType.class);
                                enumMap.putAll(map3);
                                enumMap.remove(decodeHintType);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        wsk wskVarB = b(i10, zo2Var, map3);
                        if (i11 == i4) {
                            try {
                                wskVarB.h(ResultMetadataType.ORIENTATION, 180);
                                atk[] atkVarArrE = wskVarB.e();
                                if (atkVarArrE != null) {
                                    map2 = map3;
                                    float f = iD;
                                    try {
                                        i = iD;
                                        try {
                                            atkVarArrE[0] = new atk((f - atkVarArrE[i3].c()) - 1.0f, atkVarArrE[i3].d());
                                            i2 = 1;
                                            try {
                                                atkVarArrE[1] = new atk((f - atkVarArrE[1].c()) - 1.0f, atkVarArrE[1].d());
                                            } catch (ReaderException unused) {
                                                continue;
                                                i11++;
                                                i4 = i2;
                                                map3 = map2;
                                                iD = i;
                                                i3 = 0;
                                            }
                                        } catch (ReaderException unused2) {
                                            i2 = 1;
                                            i11++;
                                            i4 = i2;
                                            map3 = map2;
                                            iD = i;
                                            i3 = 0;
                                        }
                                    } catch (ReaderException unused3) {
                                        i = iD;
                                        i2 = 1;
                                        i11++;
                                        i4 = i2;
                                        map3 = map2;
                                        iD = i;
                                        i3 = 0;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                map2 = map3;
                            }
                        }
                        return wskVarB;
                    } catch (ReaderException unused5) {
                        map2 = map3;
                        i = iD;
                        i2 = i4;
                    }
                }
            } catch (NotFoundException unused6) {
            }
            i7 = i8;
            i4 = i4;
            iD = iD;
            i3 = 0;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // defpackage.sgj
    public void reset() {
    }
}
