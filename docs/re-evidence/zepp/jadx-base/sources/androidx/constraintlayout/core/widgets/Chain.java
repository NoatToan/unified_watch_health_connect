package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        ChainHead[] chainHeadArr;
        int i2;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            int i4 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i2 = i4;
            i3 = 2;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            ChainHead chainHead = chainHeadArr[i5];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0174  */
    /* JADX WARN: Code duplicated, block: B:103:0x0177  */
    /* JADX WARN: Code duplicated, block: B:105:0x017d  */
    /* JADX WARN: Code duplicated, block: B:107:0x019e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0359  */
    /* JADX WARN: Code duplicated, block: B:222:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[PHI: r15 r16
      0x0044: PHI (r15v3 boolean) = (r15v1 boolean), (r15v32 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[PHI: r15 r16
      0x0046: PHI (r15v30 boolean) = (r15v1 boolean), (r15v32 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:325:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r39v0, types: [androidx.constraintlayout.core.LinearSystem] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [androidx.constraintlayout.core.SolverVariable] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, int i2, ChainHead chainHead) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        int i3;
        int i4;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        ?? r5;
        SolverVariable solverVariable4;
        float f;
        int size;
        ConstraintAnchor constraintAnchor3;
        int i5;
        int i6 = i;
        ConstraintWidget constraintWidget = chainHead.mFirst;
        ConstraintWidget constraintWidget2 = chainHead.mLast;
        ConstraintWidget constraintWidget3 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget4 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget5 = chainHead.mHead;
        float f2 = chainHead.mTotalWeight;
        boolean z4 = constraintWidgetContainer.mListDimensionBehaviors[i6] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i6 == 0) {
            int i7 = constraintWidget5.mHorizontalChainStyle;
            z = i7 == 0;
            z2 = i7 == 1;
            if (i7 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            int i8 = constraintWidget5.mVerticalChainStyle;
            z = i8 == 0;
            z2 = i8 == 1;
            if (i8 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        ?? r7 = constraintWidget;
        boolean z5 = false;
        while (true) {
            obj = null;
            if (z5) {
                break;
            }
            ConstraintAnchor constraintAnchor4 = r7.mListAnchors[i2];
            int i9 = z3 ? 1 : 4;
            int margin = constraintAnchor4.getMargin();
            float f3 = f2;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r7.mListDimensionBehaviors[i6];
            boolean z6 = z5;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z7 = dimensionBehaviour == dimensionBehaviour2 && r7.mResolvedMatchConstraintDefault[i6] == 0;
            ConstraintAnchor constraintAnchor5 = constraintAnchor4.mTarget;
            if (constraintAnchor5 != null && r7 != constraintWidget) {
                margin += constraintAnchor5.getMargin();
            }
            int i10 = margin;
            if (z3 && r7 != constraintWidget && r7 != constraintWidget3) {
                i9 = 8;
            }
            ConstraintAnchor constraintAnchor6 = constraintAnchor4.mTarget;
            if (constraintAnchor6 != null) {
                if (r7 == constraintWidget3) {
                    linearSystem.addGreaterThan(constraintAnchor4.mSolverVariable, constraintAnchor6.mSolverVariable, i10, 6);
                } else {
                    linearSystem.addGreaterThan(constraintAnchor4.mSolverVariable, constraintAnchor6.mSolverVariable, i10, 8);
                }
                if (z7 && !z3) {
                    i9 = 5;
                }
                linearSystem.addEquality(constraintAnchor4.mSolverVariable, constraintAnchor4.mTarget.mSolverVariable, i10, (r7 == constraintWidget3 && z3 && r7.isInBarrier(i6)) ? 5 : i9);
            } else {
                constraintWidget = constraintWidget;
            }
            if (z4) {
                if (r7.getVisibility() == 8 || r7.mListDimensionBehaviors[i6] != dimensionBehaviour2) {
                    i5 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = r7.mListAnchors;
                    i5 = 0;
                    linearSystem.addGreaterThan(constraintAnchorArr[i2 + 1].mSolverVariable, constraintAnchorArr[i2].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r7.mListAnchors[i2].mSolverVariable, constraintWidgetContainer.mListAnchors[i2].mSolverVariable, i5, 8);
            }
            ConstraintAnchor constraintAnchor7 = r7.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor7 != null) {
                ConstraintWidget constraintWidget6 = constraintAnchor7.mOwner;
                ConstraintAnchor[] constraintAnchorArr2 = constraintWidget6.mListAnchors;
                if (constraintAnchorArr2[i2].mTarget != null && constraintAnchorArr2[i2].mTarget.mOwner == r7) {
                    obj = constraintWidget6;
                }
            }
            if (obj != null) {
                r7 = obj;
                z5 = z6;
            } else {
                z5 = true;
            }
            constraintWidget5 = constraintWidget5;
            f2 = f3;
            z = z;
            constraintWidget = constraintWidget;
            r7 = r7;
        }
        ConstraintWidget constraintWidget7 = constraintWidget5;
        float f4 = f2;
        ConstraintWidget constraintWidget8 = constraintWidget;
        boolean z8 = z;
        if (constraintWidget4 != null) {
            int i11 = i2 + 1;
            if (constraintWidget2.mListAnchors[i11].mTarget != null) {
                ConstraintAnchor constraintAnchor8 = constraintWidget4.mListAnchors[i11];
                if ((constraintWidget4.mListDimensionBehaviors[i6] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget4.mResolvedMatchConstraintDefault[i6] == 0) && !z3) {
                    ConstraintAnchor constraintAnchor9 = constraintAnchor8.mTarget;
                    if (constraintAnchor9.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor8.mSolverVariable, constraintAnchor9.mSolverVariable, -constraintAnchor8.getMargin(), 5);
                    } else if (z3) {
                        constraintAnchor3 = constraintAnchor8.mTarget;
                        if (constraintAnchor3.mOwner == constraintWidgetContainer) {
                            linearSystem.addEquality(constraintAnchor8.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor8.getMargin(), 4);
                        }
                    }
                } else if (z3) {
                    constraintAnchor3 = constraintAnchor8.mTarget;
                    if (constraintAnchor3.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor8.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor8.getMargin(), 4);
                    }
                }
                linearSystem.addLowerThan(constraintAnchor8.mSolverVariable, constraintWidget2.mListAnchors[i11].mTarget.mSolverVariable, -constraintAnchor8.getMargin(), 6);
            }
        }
        if (z4) {
            int i12 = i2 + 1;
            SolverVariable solverVariable5 = constraintWidgetContainer.mListAnchors[i12].mSolverVariable;
            ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
            linearSystem.addGreaterThan(solverVariable5, constraintAnchorArr3[i12].mSolverVariable, constraintAnchorArr3[i12].getMargin(), 8);
        }
        ArrayList<ConstraintWidget> arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f5 = (!chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f4 : chainHead.mWidgetsMatchCount;
            float f6 = 0.0f;
            ConstraintWidget constraintWidget9 = null;
            int i13 = 0;
            float f7 = 0.0f;
            while (i13 < size) {
                ConstraintWidget constraintWidget10 = arrayList.get(i13);
                float f8 = constraintWidget10.mWeight[i6];
                if (f8 < f6) {
                    if (chainHead.mHasComplexMatchWeights) {
                        ConstraintAnchor[] constraintAnchorArr4 = constraintWidget10.mListAnchors;
                        linearSystem.addEquality(constraintAnchorArr4[i2 + 1].mSolverVariable, constraintAnchorArr4[i2].mSolverVariable, 0, 4);
                    } else {
                        f8 = 1.0f;
                        f6 = 0.0f;
                    }
                    arrayList = arrayList;
                    size = size;
                    i13++;
                    size = size;
                    arrayList = arrayList;
                    f6 = 0.0f;
                }
                if (f8 == f6) {
                    ConstraintAnchor[] constraintAnchorArr5 = constraintWidget10.mListAnchors;
                    linearSystem.addEquality(constraintAnchorArr5[i2 + 1].mSolverVariable, constraintAnchorArr5[i2].mSolverVariable, 0, 8);
                    arrayList = arrayList;
                    size = size;
                } else {
                    if (constraintWidget9 != null) {
                        ConstraintAnchor[] constraintAnchorArr6 = constraintWidget9.mListAnchors;
                        SolverVariable solverVariable6 = constraintAnchorArr6[i2].mSolverVariable;
                        int i14 = i2 + 1;
                        SolverVariable solverVariable7 = constraintAnchorArr6[i14].mSolverVariable;
                        ConstraintAnchor[] constraintAnchorArr7 = constraintWidget10.mListAnchors;
                        SolverVariable solverVariable8 = constraintAnchorArr7[i2].mSolverVariable;
                        SolverVariable solverVariable9 = constraintAnchorArr7[i14].mSolverVariable;
                        ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        arrayRowCreateRow.createRowEqualMatchDimensions(f7, f5, f8, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                        linearSystem.addConstraint(arrayRowCreateRow);
                    }
                    f7 = f8;
                    constraintWidget9 = constraintWidget10;
                }
                i13++;
                size = size;
                arrayList = arrayList;
                f6 = 0.0f;
            }
        }
        if (constraintWidget3 != null && (constraintWidget3 == constraintWidget4 || z3)) {
            ConstraintAnchor constraintAnchor10 = constraintWidget8.mListAnchors[i2];
            int i15 = i2 + 1;
            ConstraintAnchor constraintAnchor11 = constraintWidget2.mListAnchors[i15];
            ConstraintAnchor constraintAnchor12 = constraintAnchor10.mTarget;
            SolverVariable solverVariable10 = constraintAnchor12 != null ? constraintAnchor12.mSolverVariable : null;
            ConstraintAnchor constraintAnchor13 = constraintAnchor11.mTarget;
            SolverVariable solverVariable11 = constraintAnchor13 != null ? constraintAnchor13.mSolverVariable : null;
            ConstraintAnchor constraintAnchor14 = constraintWidget3.mListAnchors[i2];
            if (constraintWidget4 != null) {
                constraintAnchor11 = constraintWidget4.mListAnchors[i15];
            }
            if (solverVariable10 != null && solverVariable11 != null) {
                if (i6 == 0) {
                    f = constraintWidget7.mHorizontalBiasPercent;
                } else {
                    f = constraintWidget7.mVerticalBiasPercent;
                }
                linearSystem.addCentering(constraintAnchor14.mSolverVariable, solverVariable10, constraintAnchor14.getMargin(), f, solverVariable11, constraintAnchor11.mSolverVariable, constraintAnchor11.getMargin(), 7);
            }
        } else if (!z8 || constraintWidget3 == null) {
            int i16 = 8;
            if (z2 && constraintWidget3 != null) {
                int i17 = chainHead.mWidgetsMatchCount;
                boolean z9 = i17 > 0 && chainHead.mWidgetsCount == i17;
                ConstraintWidget constraintWidget11 = constraintWidget3;
                ConstraintWidget constraintWidget12 = constraintWidget11;
                while (constraintWidget12 != null) {
                    ConstraintWidget constraintWidget13 = constraintWidget12.mNextChainWidget[i6];
                    while (constraintWidget13 != null && constraintWidget13.getVisibility() == i16) {
                        constraintWidget13 = constraintWidget13.mNextChainWidget[i6];
                    }
                    if (constraintWidget12 == constraintWidget3 || constraintWidget12 == constraintWidget4 || constraintWidget13 == null) {
                        constraintWidget11 = constraintWidget11;
                        i4 = 8;
                    } else {
                        ConstraintWidget constraintWidget14 = constraintWidget13 == constraintWidget4 ? null : constraintWidget13;
                        ConstraintAnchor constraintAnchor15 = constraintWidget12.mListAnchors[i2];
                        SolverVariable solverVariable12 = constraintAnchor15.mSolverVariable;
                        ConstraintAnchor constraintAnchor16 = constraintAnchor15.mTarget;
                        if (constraintAnchor16 != null) {
                            SolverVariable solverVariable13 = constraintAnchor16.mSolverVariable;
                        }
                        int i18 = i2 + 1;
                        SolverVariable solverVariable14 = constraintWidget11.mListAnchors[i18].mSolverVariable;
                        int margin2 = constraintAnchor15.getMargin();
                        int margin3 = constraintWidget12.mListAnchors[i18].getMargin();
                        if (constraintWidget14 != null) {
                            constraintAnchor = constraintWidget14.mListAnchors[i2];
                            SolverVariable solverVariable15 = constraintAnchor.mSolverVariable;
                            ConstraintAnchor constraintAnchor17 = constraintAnchor.mTarget;
                            solverVariable2 = constraintAnchor17 != null ? constraintAnchor17.mSolverVariable : null;
                            solverVariable = solverVariable15;
                        } else {
                            constraintAnchor = constraintWidget4.mListAnchors[i2];
                            solverVariable = constraintAnchor != null ? constraintAnchor.mSolverVariable : null;
                            solverVariable2 = constraintWidget12.mListAnchors[i18].mSolverVariable;
                        }
                        if (constraintAnchor != null) {
                            margin3 += constraintAnchor.getMargin();
                        }
                        int i19 = margin3;
                        int margin4 = constraintWidget11.mListAnchors[i18].getMargin() + margin2;
                        int i20 = z9 ? 8 : 4;
                        if (solverVariable12 == null || solverVariable14 == null || solverVariable == null || solverVariable2 == null) {
                            i4 = 8;
                        } else {
                            i4 = 8;
                            linearSystem.addCentering(solverVariable12, solverVariable14, margin4, 0.5f, solverVariable, solverVariable2, i19, i20);
                        }
                        constraintWidget13 = constraintWidget14;
                    }
                    constraintWidget11 = constraintWidget12.getVisibility() != i4 ? constraintWidget12 : constraintWidget11;
                    i6 = i;
                    constraintWidget12 = constraintWidget13;
                    i16 = 8;
                }
                ConstraintAnchor constraintAnchor18 = constraintWidget3.mListAnchors[i2];
                ConstraintAnchor constraintAnchor19 = constraintWidget8.mListAnchors[i2].mTarget;
                int i21 = i2 + 1;
                ConstraintAnchor constraintAnchor20 = constraintWidget4.mListAnchors[i21];
                ConstraintAnchor constraintAnchor21 = constraintWidget2.mListAnchors[i21].mTarget;
                if (constraintAnchor19 == null) {
                    i3 = 5;
                } else if (constraintWidget3 != constraintWidget4) {
                    i3 = 5;
                    linearSystem.addEquality(constraintAnchor18.mSolverVariable, constraintAnchor19.mSolverVariable, constraintAnchor18.getMargin(), 5);
                } else {
                    i3 = 5;
                    if (constraintAnchor21 != null) {
                        linearSystem.addCentering(constraintAnchor18.mSolverVariable, constraintAnchor19.mSolverVariable, constraintAnchor18.getMargin(), 0.5f, constraintAnchor20.mSolverVariable, constraintAnchor21.mSolverVariable, constraintAnchor20.getMargin(), 5);
                    }
                }
                if (constraintAnchor21 != null && constraintWidget3 != constraintWidget4) {
                    linearSystem.addEquality(constraintAnchor20.mSolverVariable, constraintAnchor21.mSolverVariable, -constraintAnchor20.getMargin(), i3);
                }
            }
        } else {
            int i22 = chainHead.mWidgetsMatchCount;
            boolean z10 = i22 > 0 && chainHead.mWidgetsCount == i22;
            ConstraintWidget constraintWidget15 = constraintWidget3;
            ConstraintWidget constraintWidget16 = constraintWidget15;
            while (constraintWidget16 != null) {
                ConstraintWidget constraintWidget17 = constraintWidget16.mNextChainWidget[i6];
                while (constraintWidget17 != null && constraintWidget17.getVisibility() == 8) {
                    constraintWidget17 = constraintWidget17.mNextChainWidget[i6];
                }
                if (constraintWidget17 != null || constraintWidget16 == constraintWidget4) {
                    ConstraintAnchor constraintAnchor22 = constraintWidget16.mListAnchors[i2];
                    SolverVariable solverVariable16 = constraintAnchor22.mSolverVariable;
                    ConstraintAnchor constraintAnchor23 = constraintAnchor22.mTarget;
                    SolverVariable solverVariable17 = constraintAnchor23 != null ? constraintAnchor23.mSolverVariable : null;
                    if (constraintWidget15 != constraintWidget16) {
                        solverVariable17 = constraintWidget15.mListAnchors[i2 + 1].mSolverVariable;
                    } else if (constraintWidget16 == constraintWidget3) {
                        ConstraintAnchor[] constraintAnchorArr8 = constraintWidget8.mListAnchors;
                        solverVariable17 = constraintAnchorArr8[i2].mTarget != null ? constraintAnchorArr8[i2].mTarget.mSolverVariable : null;
                    }
                    int margin5 = constraintAnchor22.getMargin();
                    int i23 = i2 + 1;
                    int margin6 = constraintWidget16.mListAnchors[i23].getMargin();
                    if (constraintWidget17 != null) {
                        constraintAnchor2 = constraintWidget17.mListAnchors[i2];
                        solverVariable3 = constraintAnchor2.mSolverVariable;
                    } else {
                        constraintAnchor2 = constraintWidget2.mListAnchors[i23].mTarget;
                        if (constraintAnchor2 != null) {
                            solverVariable3 = constraintAnchor2.mSolverVariable;
                        } else {
                            solverVariable3 = null;
                        }
                        SolverVariable solverVariable18 = constraintWidget16.mListAnchors[i23].mSolverVariable;
                        if (constraintAnchor2 != null) {
                            margin6 += constraintAnchor2.getMargin();
                        }
                        int margin7 = margin5 + constraintWidget15.mListAnchors[i23].getMargin();
                        if (solverVariable16 == null && solverVariable17 != null && solverVariable3 != null && solverVariable18 != null) {
                            if (constraintWidget16 == constraintWidget3) {
                                margin7 = constraintWidget3.mListAnchors[i2].getMargin();
                            }
                            constraintWidget17 = constraintWidget17;
                            linearSystem.addCentering(solverVariable16, solverVariable17, margin7, 0.5f, solverVariable3, solverVariable18, constraintWidget16 == constraintWidget4 ? constraintWidget4.mListAnchors[i23].getMargin() : margin6, z10 ? 8 : 5);
                        }
                        if (constraintWidget16.getVisibility() != 8) {
                            constraintWidget16 = constraintWidget15;
                        }
                        constraintWidget15 = constraintWidget16;
                        constraintWidget16 = constraintWidget17;
                    }
                    SolverVariable solverVariable19 = constraintWidget16.mListAnchors[i23].mSolverVariable;
                    if (constraintAnchor2 != null) {
                        margin6 += constraintAnchor2.getMargin();
                    }
                    int margin8 = margin5 + constraintWidget15.mListAnchors[i23].getMargin();
                    if (solverVariable16 == null) {
                    }
                }
                if (constraintWidget16.getVisibility() != 8) {
                    constraintWidget16 = constraintWidget15;
                }
                constraintWidget15 = constraintWidget16;
                constraintWidget16 = constraintWidget17;
            }
        }
        if ((!z8 && !z2) || constraintWidget3 == null || constraintWidget3 == constraintWidget4) {
            return;
        }
        ConstraintAnchor[] constraintAnchorArr9 = constraintWidget3.mListAnchors;
        ConstraintAnchor constraintAnchor24 = constraintAnchorArr9[i2];
        if (constraintWidget4 == null) {
            constraintWidget4 = constraintWidget3;
        }
        int i24 = i2 + 1;
        ConstraintAnchor constraintAnchor25 = constraintWidget4.mListAnchors[i24];
        ConstraintAnchor constraintAnchor26 = constraintAnchor24.mTarget;
        SolverVariable solverVariable20 = constraintAnchor26 != null ? constraintAnchor26.mSolverVariable : null;
        ConstraintAnchor constraintAnchor27 = constraintAnchor25.mTarget;
        if (constraintAnchor27 != null) {
            solverVariable4 = constraintAnchor27.mSolverVariable;
        } else {
            r5 = 0;
        }
        if (constraintWidget2 != constraintWidget4) {
            ConstraintAnchor constraintAnchor28 = constraintWidget2.mListAnchors[i24].mTarget;
            if (constraintAnchor28 != null) {
                r5 = solverVariable4;
                obj = constraintAnchor28.mSolverVariable;
            }
            r5 = solverVariable4;
            r5 = obj;
        }
        if (constraintWidget3 == constraintWidget4) {
            constraintAnchor24 = constraintAnchorArr9[i2];
            constraintAnchor25 = constraintAnchorArr9[i24];
        }
        if (solverVariable20 == null || r5 == 0) {
            return;
        }
        linearSystem.addCentering(constraintAnchor24.mSolverVariable, solverVariable20, constraintAnchor24.getMargin(), 0.5f, r5, constraintAnchor25.mSolverVariable, constraintWidget4.mListAnchors[i24].getMargin(), 5);
    }
}
