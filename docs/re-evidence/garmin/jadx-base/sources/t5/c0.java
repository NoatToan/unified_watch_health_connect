package t5;

import android.graphics.RectF;
import android.text.Layout;
import java.text.Bidi;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final float a(float[] fArr, int i14, int i15) {
        return fArr[b71.i.b(i14, i15, 2, 1)];
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0259 A[EDGE_INSN: B:144:0x0259->B:171:0x02b6 BREAK  A[LOOP:5: B:154:0x0275->B:206:0x0275]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a1  */
    public static final int b(b0 b0Var, Layout layout, n nVar, int i14, RectF rectF, u5.f fVar, s5.a aVar, boolean z14) {
        n.a[] aVarArr;
        n.a[] aVarArr2;
        int i15;
        int i16;
        int iD;
        int i17;
        int i18;
        int iC;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i14);
        int lineBottom = layout.getLineBottom(i14);
        int lineStart = layout.getLineStart(i14);
        int lineEnd = layout.getLineEnd(i14);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i19 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i19];
        Layout layout2 = b0Var.f162408g;
        int lineStart2 = layout2.getLineStart(i14);
        int iF = b0Var.f(i14);
        if (i19 < (iF - lineStart2) * 2) {
            y5.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        l lVar = new l(b0Var);
        boolean z15 = false;
        boolean z16 = layout2.getParagraphDirection(i14) == 1;
        int i24 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z16 && !zIsRtlCharAt) {
                fA = lVar.a(lineStart2, z15, z15, true);
                fA3 = lVar.a(lineStart2 + 1, true, true, true);
            } else if (z16 && zIsRtlCharAt) {
                fA3 = lVar.a(lineStart2, false, false, false);
                fA = lVar.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = lVar.a(lineStart2, false, false, true);
                    fA = lVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = lVar.a(lineStart2, false, false, false);
                    fA2 = lVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i24] = fA;
            fArr[i24 + 1] = fA3;
            i24 += 2;
            lineStart2++;
            z16 = z16;
            z15 = false;
        }
        Layout layout3 = nVar.f162439a;
        int lineStart3 = layout3.getLineStart(i14);
        int lineEnd2 = layout3.getLineEnd(i14);
        int iD2 = nVar.d(lineStart3, false);
        int iE = nVar.e(iD2);
        int i25 = lineStart3 - iE;
        int i26 = lineEnd2 - iE;
        Bidi bidiA = nVar.a(iD2);
        if (bidiA == null || (bidiCreateLineBidi = bidiA.createLineBidi(i25, i26)) == null) {
            aVarArr = new n.a[]{new n.a(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            aVarArr = new n.a[runCount];
            int i27 = 0;
            while (i27 < runCount) {
                int i28 = runCount;
                aVarArr[i27] = new n.a(bidiCreateLineBidi.getRunStart(i27) + lineStart3, bidiCreateLineBidi.getRunLimit(i27) + lineStart3, bidiCreateLineBidi.getRunLevel(i27) % 2 == 1);
                i27++;
                runCount = i28;
            }
        }
        j23.j lVar2 = z14 ? new j23.l(0, aVarArr.length - 1) : j23.t.l(aVarArr.length - 1, 0);
        int i29 = lVar2.f96796a;
        int i30 = lVar2.f96797b;
        int i34 = lVar2.f96798c;
        if ((i34 <= 0 || i29 > i30) && (i34 >= 0 || i30 > i29)) {
            return -1;
        }
        while (true) {
            n.a aVar2 = aVarArr[i29];
            boolean z17 = aVar2.f162446c;
            int iB = aVar2.f162444a;
            int iA = aVar2.f162445b;
            float f14 = z17 ? fArr[((iA - 1) - lineStart) * 2] : fArr[(iB - lineStart) * 2];
            float fA4 = z17 ? a(fArr, iB, lineStart) : a(fArr, iA - 1, lineStart);
            float f15 = rectF.left;
            int i35 = i34;
            if (!z14) {
                aVarArr2 = aVarArr;
                if (fA4 < f15) {
                    i15 = -1;
                    break;
                }
                float f16 = rectF.right;
                if (f14 <= f16) {
                    if ((z17 || f16 < fA4) && (!z17 || f15 > f14)) {
                        int i36 = iA;
                        int i37 = iB;
                        while (i36 - i37 > 1) {
                            int i38 = (i36 + i37) / 2;
                            float f17 = fArr[(i38 - lineStart) * 2];
                            int i39 = i36;
                            if ((z17 || f17 <= rectF.right) && (!z17 || f17 >= rectF.left)) {
                                i36 = i39;
                                i37 = i38;
                            } else {
                                i36 = i38;
                            }
                        }
                        i16 = z17 ? i36 : i37;
                    } else {
                        i16 = iA - 1;
                    }
                    int iC2 = fVar.c(i16 + 1);
                    if (iC2 == -1 || (iD = fVar.d(iC2)) <= iB) {
                        i15 = -1;
                        break;
                    }
                    if (iC2 < iB) {
                        iC2 = iB;
                    }
                    if (iD <= iA) {
                        iA = iD;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iC3 = iC2;
                    while (true) {
                        rectF2.left = z17 ? fArr[((iA - 1) - lineStart) * 2] : fArr[(iC3 - lineStart) * 2];
                        rectF2.right = z17 ? a(fArr, iC3, lineStart) : a(fArr, iA - 1, lineStart);
                        if (((Boolean) aVar.invoke(rectF2, rectF)).booleanValue()) {
                            i15 = iA;
                            break;
                        }
                        iA = fVar.a(iA);
                        if (iA == -1 || iA <= iB) {
                            i15 = -1;
                            break;
                        }
                        iC3 = fVar.c(iA);
                        if (iC3 < iB) {
                            iC3 = iB;
                        }
                    }
                } else {
                    i15 = -1;
                    break;
                }
                iB = i15;
            } else {
                if (fA4 < f15) {
                    aVarArr2 = aVarArr;
                    iB = -1;
                    break;
                }
                float f18 = rectF.right;
                if (f14 <= f18) {
                    if ((z17 || f15 > f14) && (!z17 || f18 < fA4)) {
                        int i44 = iA;
                        int i45 = iB;
                        while (true) {
                            i17 = i44;
                            if (i44 - i45 <= 1) {
                                break;
                            }
                            int i46 = (i17 + i45) / 2;
                            float f19 = fArr[(i46 - lineStart) * 2];
                            if ((z17 || f19 <= rectF.left) && (!z17 || f19 >= rectF.right)) {
                                i44 = i17;
                                i45 = i46;
                            } else {
                                i44 = i46;
                            }
                        }
                        i18 = z17 ? i17 : i45;
                    } else {
                        i18 = iB;
                    }
                    int iD3 = fVar.d(i18);
                    if (iD3 != -1 && (iC = fVar.c(iD3)) < iA) {
                        if (iC >= iB) {
                            iB = iC;
                        }
                        if (iD3 > iA) {
                            iD3 = iA;
                        }
                        aVarArr2 = aVarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iD4 = iD3;
                        while (true) {
                            rectF3.left = z17 ? fArr[((iD4 - 1) - lineStart) * 2] : fArr[(iB - lineStart) * 2];
                            rectF3.right = z17 ? a(fArr, iB, lineStart) : a(fArr, iD4 - 1, lineStart);
                            if (((Boolean) aVar.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iB = fVar.b(iB);
                            if (iB != -1 && iB < iA) {
                                iD4 = fVar.d(iB);
                                if (iD4 > iA) {
                                    iD4 = iA;
                                }
                            }
                        }
                    } else {
                        aVarArr2 = aVarArr;
                    }
                    iB = -1;
                    break;
                } else {
                    aVarArr2 = aVarArr;
                    iB = -1;
                    break;
                }
            }
            if (iB >= 0) {
                return iB;
            }
            if (i29 == i30) {
                return -1;
            }
            i29 += i35;
            i34 = i35;
            aVarArr = aVarArr2;
        }
    }
}
