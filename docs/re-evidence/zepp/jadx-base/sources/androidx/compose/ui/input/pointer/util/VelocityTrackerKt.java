package androidx.compose.ui.input.pointer.util;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a,\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t\"\u0016\u0010\r\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "", "x", "y", "", "degree", "Landroidx/compose/ui/input/pointer/util/PolynomialFit;", "polyFitLeastSquares", "AssumePointerMoveStoppedMilliseconds", LogUtil.I, "HistorySize", "HorizonMilliseconds", "MinSampleSize", "DefaultWeight", "F", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static final int MinSampleSize = 3;

    @NotNull
    public static final PolynomialFit polyFitLeastSquares(@NotNull List<Float> list, @NotNull List<Float> list2, int i) {
        float fFloatValue;
        float f;
        float f2;
        if (i < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = i >= list.size() ? list.size() - 1 : i;
        int i2 = i + 1;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(0.0f));
        }
        int size2 = list.size();
        int i4 = size + 1;
        Matrix matrix = new Matrix(i4, size2);
        if (size2 > 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                matrix.set(0, i5, 1.0f);
                if (1 < i4) {
                    int i7 = 1;
                    while (true) {
                        int i8 = i7 + 1;
                        matrix.set(i7, i5, matrix.get(i7 - 1, i5) * list.get(i5).floatValue());
                        if (i8 >= i4) {
                            break;
                        }
                        i7 = i8;
                    }
                }
                if (i6 >= size2) {
                    break;
                }
                i5 = i6;
            }
        }
        Matrix matrix2 = new Matrix(i4, size2);
        Matrix matrix3 = new Matrix(i4, i4);
        if (i4 > 0) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                if (size2 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        matrix2.set(i9, i11, matrix.get(i9, i11));
                        if (i12 >= size2) {
                            break;
                        }
                        i11 = i12;
                    }
                }
                if (i9 > 0) {
                    int i13 = 0;
                    while (true) {
                        int i14 = i13 + 1;
                        float fTimes = matrix2.getRow(i9).times(matrix2.getRow(i13));
                        if (size2 > 0) {
                            int i15 = 0;
                            while (true) {
                                int i16 = i15 + 1;
                                matrix2.set(i9, i15, matrix2.get(i9, i15) - (matrix2.get(i13, i15) * fTimes));
                                if (i16 >= size2) {
                                    break;
                                }
                                i15 = i16;
                            }
                        }
                        if (i14 >= i9) {
                            break;
                        }
                        i13 = i14;
                    }
                }
                float fNorm = matrix2.getRow(i9).norm();
                if (fNorm < 1.0E-6d) {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
                float f3 = 1.0f / fNorm;
                if (size2 > 0) {
                    int i17 = 0;
                    while (true) {
                        int i18 = i17 + 1;
                        matrix2.set(i9, i17, matrix2.get(i9, i17) * f3);
                        if (i18 >= size2) {
                            break;
                        }
                        i17 = i18;
                    }
                }
                if (i4 > 0) {
                    int i19 = 0;
                    while (true) {
                        int i20 = i19 + 1;
                        matrix3.set(i9, i19, i19 < i9 ? 0.0f : matrix2.getRow(i9).times(matrix.getRow(i19)));
                        if (i20 >= i4) {
                            break;
                        }
                        i19 = i20;
                    }
                }
                if (i10 >= i4) {
                    break;
                }
                i9 = i10;
            }
        }
        Vector vector = new Vector(size2);
        if (size2 > 0) {
            int i21 = 0;
            while (true) {
                int i22 = i21 + 1;
                vector.set(i21, list2.get(i21).floatValue() * 1.0f);
                if (i22 >= size2) {
                    break;
                }
                i21 = i22;
            }
        }
        int i23 = i4 - 1;
        if (i23 >= 0) {
            int i24 = i23;
            while (true) {
                int i25 = i24 - 1;
                arrayList.set(i24, Float.valueOf(matrix2.getRow(i24).times(vector)));
                int i26 = i24 + 1;
                if (i26 <= i23) {
                    int i27 = i23;
                    while (true) {
                        int i28 = i27 - 1;
                        arrayList.set(i24, Float.valueOf(((Number) arrayList.get(i24)).floatValue() - (matrix3.get(i24, i27) * ((Number) arrayList.get(i27)).floatValue())));
                        if (i27 == i26) {
                            break;
                        }
                        i27 = i28;
                    }
                }
                arrayList.set(i24, Float.valueOf(((Number) arrayList.get(i24)).floatValue() / matrix3.get(i24, i24)));
                if (i25 < 0) {
                    break;
                }
                i24 = i25;
            }
        }
        if (size2 > 0) {
            int i29 = 0;
            fFloatValue = 0.0f;
            while (true) {
                int i30 = i29 + 1;
                fFloatValue += list2.get(i29).floatValue();
                if (i30 >= size2) {
                    break;
                }
                i29 = i30;
            }
        } else {
            fFloatValue = 0.0f;
        }
        float f4 = fFloatValue / size2;
        if (size2 > 0) {
            float f5 = 0.0f;
            int i31 = 0;
            float f6 = 0.0f;
            while (true) {
                int i32 = i31 + 1;
                float fFloatValue2 = list2.get(i31).floatValue() - ((Number) arrayList.get(0)).floatValue();
                if (1 < i4) {
                    float fFloatValue3 = 1.0f;
                    int i33 = 1;
                    while (true) {
                        int i34 = i33 + 1;
                        fFloatValue3 *= list.get(i31).floatValue();
                        fFloatValue2 -= ((Number) arrayList.get(i33)).floatValue() * fFloatValue3;
                        if (i34 >= i4) {
                            break;
                        }
                        i33 = i34;
                    }
                }
                f6 += fFloatValue2 * 1.0f * fFloatValue2;
                float fFloatValue4 = list2.get(i31).floatValue() - f4;
                f5 += fFloatValue4 * 1.0f * fFloatValue4;
                if (i32 >= size2) {
                    break;
                }
                i31 = i32;
            }
            f = f6;
            f2 = f5;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new PolynomialFit(arrayList, f2 <= 1.0E-6f ? 1.0f : 1.0f - (f / f2));
    }
}
