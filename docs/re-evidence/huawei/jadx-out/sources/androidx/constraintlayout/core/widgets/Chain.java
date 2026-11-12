package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            if (arrayList == null || (arrayList != null && arrayList.contains(chainHead.mFirst))) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:202:0x0381  */
    /* JADX WARN: Code duplicated, block: B:223:0x03da  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[PHI: r8 r15
      0x004c: PHI (r8v3 boolean) = (r8v1 boolean), (r8v44 boolean) binds: [B:28:0x004a, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r15v3 boolean) = (r15v1 boolean), (r15v34 boolean) binds: [B:28:0x004a, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050 A[PHI: r8 r15
      0x0050: PHI (r8v41 boolean) = (r8v1 boolean), (r8v44 boolean) binds: [B:28:0x004a, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r15v31 boolean) = (r15v1 boolean), (r15v34 boolean) binds: [B:28:0x004a, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:326:0x03dc A[SYNTHETIC] */
    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, int i2, ChainHead chainHead) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        ConstraintWidget constraintWidget;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        float f;
        int size;
        int i5;
        int i6 = i;
        ConstraintWidget constraintWidget2 = chainHead.mFirst;
        ConstraintWidget constraintWidget3 = chainHead.mLast;
        ConstraintWidget constraintWidget4 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget5 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget6 = chainHead.mHead;
        float f2 = chainHead.mTotalWeight;
        ConstraintWidget constraintWidget7 = chainHead.mFirstMatchConstraintWidget;
        ConstraintWidget constraintWidget8 = chainHead.mLastMatchConstraintWidget;
        boolean z5 = constraintWidgetContainer.mListDimensionBehaviors[i6] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i6 == 0) {
            z = constraintWidget6.mHorizontalChainStyle == 0;
            z2 = constraintWidget6.mHorizontalChainStyle == 1;
            if (constraintWidget6.mHorizontalChainStyle == 2) {
                z3 = true;
                z4 = z2;
            } else {
                z4 = z2;
                z3 = false;
            }
        } else {
            z = constraintWidget6.mVerticalChainStyle == 0;
            z2 = constraintWidget6.mVerticalChainStyle == 1;
            if (constraintWidget6.mVerticalChainStyle == 2) {
                z3 = true;
                z4 = z2;
            } else {
                z4 = z2;
                z3 = false;
            }
        }
        boolean z6 = z;
        ConstraintWidget constraintWidget9 = constraintWidget2;
        boolean z7 = false;
        while (true) {
            ConstraintWidget constraintWidget10 = null;
            if (z7) {
                break;
            }
            ConstraintAnchor constraintAnchor3 = constraintWidget9.mListAnchors[i2];
            int i7 = z3 ? 1 : 4;
            int margin = constraintAnchor3.getMargin();
            float f3 = f2;
            boolean z8 = z7;
            boolean z9 = constraintWidget9.mListDimensionBehaviors[i6] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget9.mResolvedMatchConstraintDefault[i6] == 0;
            if (constraintAnchor3.mTarget != null && constraintWidget9 != constraintWidget2) {
                margin += constraintAnchor3.mTarget.getMargin();
            }
            int i8 = margin;
            if (z3 && constraintWidget9 != constraintWidget2 && constraintWidget9 != constraintWidget4) {
                i7 = 8;
            }
            if (constraintAnchor3.mTarget != null) {
                if (constraintWidget9 == constraintWidget4) {
                    linearSystem.addGreaterThan(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i8, 6);
                } else {
                    linearSystem.addGreaterThan(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i8, 8);
                }
                if (z9 && !z3) {
                    i7 = 5;
                }
                linearSystem.addEquality(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i8, (constraintWidget9 == constraintWidget4 && z3 && constraintWidget9.isInBarrier(i6)) ? 5 : i7);
            } else {
                constraintWidget6 = constraintWidget6;
                constraintWidget2 = constraintWidget2;
            }
            if (z5) {
                if (constraintWidget9.getVisibility() == 8 || constraintWidget9.mListDimensionBehaviors[i6] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i5 = 0;
                } else {
                    i5 = 0;
                    linearSystem.addGreaterThan(constraintWidget9.mListAnchors[i2 + 1].mSolverVariable, constraintWidget9.mListAnchors[i2].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(constraintWidget9.mListAnchors[i2].mSolverVariable, constraintWidgetContainer.mListAnchors[i2].mSolverVariable, i5, 8);
            }
            ConstraintAnchor constraintAnchor4 = constraintWidget9.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor4 != null) {
                ConstraintWidget constraintWidget11 = constraintAnchor4.mOwner;
                if (constraintWidget11.mListAnchors[i2].mTarget != null && constraintWidget11.mListAnchors[i2].mTarget.mOwner == constraintWidget9) {
                    constraintWidget10 = constraintWidget11;
                }
            }
            if (constraintWidget10 != null) {
                constraintWidget9 = constraintWidget10;
                z7 = z8;
            } else {
                z7 = true;
            }
            z6 = z6;
            f2 = f3;
            constraintWidget6 = constraintWidget6;
            constraintWidget2 = constraintWidget2;
        }
        ConstraintWidget constraintWidget12 = constraintWidget6;
        float f4 = f2;
        ConstraintWidget constraintWidget13 = constraintWidget2;
        boolean z10 = z6;
        if (constraintWidget5 != null) {
            int i9 = i2 + 1;
            if (constraintWidget3.mListAnchors[i9].mTarget != null) {
                ConstraintAnchor constraintAnchor5 = constraintWidget5.mListAnchors[i9];
                if (constraintWidget5.mListDimensionBehaviors[i6] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget5.mResolvedMatchConstraintDefault[i6] == 0 && !z3 && constraintAnchor5.mTarget.mOwner == constraintWidgetContainer) {
                    linearSystem.addEquality(constraintAnchor5.mSolverVariable, constraintAnchor5.mTarget.mSolverVariable, -constraintAnchor5.getMargin(), 5);
                } else if (z3 && constraintAnchor5.mTarget.mOwner == constraintWidgetContainer) {
                    linearSystem.addEquality(constraintAnchor5.mSolverVariable, constraintAnchor5.mTarget.mSolverVariable, -constraintAnchor5.getMargin(), 4);
                }
                linearSystem.addLowerThan(constraintAnchor5.mSolverVariable, constraintWidget3.mListAnchors[i9].mTarget.mSolverVariable, -constraintAnchor5.getMargin(), 6);
            }
        }
        if (z5) {
            int i10 = i2 + 1;
            linearSystem.addGreaterThan(constraintWidgetContainer.mListAnchors[i10].mSolverVariable, constraintWidget3.mListAnchors[i10].mSolverVariable, constraintWidget3.mListAnchors[i10].getMargin(), 8);
        }
        ArrayList<ConstraintWidget> arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f5 = (!chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f4 : chainHead.mWidgetsMatchCount;
            float f6 = 0.0f;
            float f7 = 0.0f;
            ConstraintWidget constraintWidget14 = null;
            int i11 = 0;
            while (i11 < size) {
                ConstraintWidget constraintWidget15 = arrayList.get(i11);
                float f8 = constraintWidget15.mWeight[i6];
                if (f8 < f6) {
                    if (chainHead.mHasComplexMatchWeights) {
                        linearSystem.addEquality(constraintWidget15.mListAnchors[i2 + 1].mSolverVariable, constraintWidget15.mListAnchors[i2].mSolverVariable, 0, 4);
                    } else {
                        f8 = 1.0f;
                        f6 = 0.0f;
                    }
                    arrayList = arrayList;
                    size = size;
                    i11++;
                    size = size;
                    arrayList = arrayList;
                    f6 = 0.0f;
                }
                if (f8 == f6) {
                    linearSystem.addEquality(constraintWidget15.mListAnchors[i2 + 1].mSolverVariable, constraintWidget15.mListAnchors[i2].mSolverVariable, 0, 8);
                    arrayList = arrayList;
                    size = size;
                } else {
                    if (constraintWidget14 != null) {
                        SolverVariable solverVariable5 = constraintWidget14.mListAnchors[i2].mSolverVariable;
                        int i12 = i2 + 1;
                        SolverVariable solverVariable6 = constraintWidget14.mListAnchors[i12].mSolverVariable;
                        SolverVariable solverVariable7 = constraintWidget15.mListAnchors[i2].mSolverVariable;
                        SolverVariable solverVariable8 = constraintWidget15.mListAnchors[i12].mSolverVariable;
                        ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        arrayRowCreateRow.createRowEqualMatchDimensions(f7, f5, f8, solverVariable5, solverVariable6, solverVariable7, solverVariable8);
                        linearSystem.addConstraint(arrayRowCreateRow);
                    }
                    f7 = f8;
                    constraintWidget14 = constraintWidget15;
                }
                i11++;
                size = size;
                arrayList = arrayList;
                f6 = 0.0f;
            }
        }
        if (constraintWidget4 != null && (constraintWidget4 == constraintWidget5 || z3)) {
            ConstraintAnchor constraintAnchor6 = constraintWidget13.mListAnchors[i2];
            int i13 = i2 + 1;
            ConstraintAnchor constraintAnchor7 = constraintWidget3.mListAnchors[i13];
            SolverVariable solverVariable9 = constraintAnchor6.mTarget != null ? constraintAnchor6.mTarget.mSolverVariable : null;
            SolverVariable solverVariable10 = constraintAnchor7.mTarget != null ? constraintAnchor7.mTarget.mSolverVariable : null;
            ConstraintAnchor constraintAnchor8 = constraintWidget4.mListAnchors[i2];
            if (constraintWidget5 != null) {
                constraintAnchor7 = constraintWidget5.mListAnchors[i13];
            }
            if (solverVariable9 != null && solverVariable10 != null) {
                if (i6 == 0) {
                    f = constraintWidget12.mHorizontalBiasPercent;
                } else {
                    f = constraintWidget12.mVerticalBiasPercent;
                }
                linearSystem.addCentering(constraintAnchor8.mSolverVariable, solverVariable9, constraintAnchor8.getMargin(), f, solverVariable10, constraintAnchor7.mSolverVariable, constraintAnchor7.getMargin(), 7);
            }
        } else if (!z10 || constraintWidget4 == null) {
            int i14 = 8;
            if (z4 && constraintWidget4 != null) {
                boolean z11 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                ConstraintWidget constraintWidget16 = constraintWidget4;
                ConstraintWidget constraintWidget17 = constraintWidget16;
                while (constraintWidget17 != null) {
                    ConstraintWidget constraintWidget18 = constraintWidget17.mNextChainWidget[i6];
                    while (constraintWidget18 != null && constraintWidget18.getVisibility() == i14) {
                        constraintWidget18 = constraintWidget18.mNextChainWidget[i6];
                    }
                    if (constraintWidget17 == constraintWidget4 || constraintWidget17 == constraintWidget5 || constraintWidget18 == null) {
                        constraintWidget16 = constraintWidget16;
                        i4 = i14;
                    } else {
                        ConstraintWidget constraintWidget19 = constraintWidget18 == constraintWidget5 ? null : constraintWidget18;
                        ConstraintAnchor constraintAnchor9 = constraintWidget17.mListAnchors[i2];
                        SolverVariable solverVariable11 = constraintAnchor9.mSolverVariable;
                        if (constraintAnchor9.mTarget != null) {
                            SolverVariable solverVariable12 = constraintAnchor9.mTarget.mSolverVariable;
                        }
                        int i15 = i2 + 1;
                        SolverVariable solverVariable13 = constraintWidget16.mListAnchors[i15].mSolverVariable;
                        int margin2 = constraintAnchor9.getMargin();
                        int margin3 = constraintWidget17.mListAnchors[i15].getMargin();
                        if (constraintWidget19 != null) {
                            constraintAnchor = constraintWidget19.mListAnchors[i2];
                            solverVariable = constraintAnchor.mSolverVariable;
                            constraintWidget = constraintWidget19;
                            solverVariable2 = constraintAnchor.mTarget != null ? constraintAnchor.mTarget.mSolverVariable : null;
                        } else {
                            constraintWidget = constraintWidget19;
                            constraintAnchor = constraintWidget5.mListAnchors[i2];
                            solverVariable = constraintAnchor != null ? constraintAnchor.mSolverVariable : null;
                            solverVariable2 = constraintWidget17.mListAnchors[i15].mSolverVariable;
                        }
                        if (constraintAnchor != null) {
                            margin3 += constraintAnchor.getMargin();
                        }
                        int i16 = margin3;
                        int margin4 = constraintWidget16.mListAnchors[i15].getMargin();
                        int i17 = z11 ? 8 : 4;
                        if (solverVariable11 == null || solverVariable13 == null || solverVariable == null || solverVariable2 == null) {
                            i4 = 8;
                        } else {
                            i4 = 8;
                            linearSystem.addCentering(solverVariable11, solverVariable13, margin4 + margin2, 0.5f, solverVariable, solverVariable2, i16, i17);
                        }
                        constraintWidget18 = constraintWidget;
                    }
                    constraintWidget16 = constraintWidget17.getVisibility() != i4 ? constraintWidget17 : constraintWidget16;
                    constraintWidget17 = constraintWidget18;
                    i14 = i4;
                    i6 = i;
                }
                ConstraintAnchor constraintAnchor10 = constraintWidget4.mListAnchors[i2];
                ConstraintAnchor constraintAnchor11 = constraintWidget13.mListAnchors[i2].mTarget;
                int i18 = i2 + 1;
                ConstraintAnchor constraintAnchor12 = constraintWidget5.mListAnchors[i18];
                ConstraintAnchor constraintAnchor13 = constraintWidget3.mListAnchors[i18].mTarget;
                if (constraintAnchor11 == null) {
                    i3 = 5;
                } else if (constraintWidget4 != constraintWidget5) {
                    i3 = 5;
                    linearSystem.addEquality(constraintAnchor10.mSolverVariable, constraintAnchor11.mSolverVariable, constraintAnchor10.getMargin(), 5);
                } else {
                    i3 = 5;
                    if (constraintAnchor13 != null) {
                        linearSystem.addCentering(constraintAnchor10.mSolverVariable, constraintAnchor11.mSolverVariable, constraintAnchor10.getMargin(), 0.5f, constraintAnchor12.mSolverVariable, constraintAnchor13.mSolverVariable, constraintAnchor12.getMargin(), 5);
                    }
                }
                if (constraintAnchor13 != null && constraintWidget4 != constraintWidget5) {
                    linearSystem.addEquality(constraintAnchor12.mSolverVariable, constraintAnchor13.mSolverVariable, -constraintAnchor12.getMargin(), i3);
                }
            }
        } else {
            boolean z12 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
            ConstraintWidget constraintWidget20 = constraintWidget4;
            ConstraintWidget constraintWidget21 = constraintWidget20;
            while (constraintWidget21 != null) {
                ConstraintWidget constraintWidget22 = constraintWidget21.mNextChainWidget[i6];
                while (constraintWidget22 != null && constraintWidget22.getVisibility() == 8) {
                    constraintWidget22 = constraintWidget22.mNextChainWidget[i6];
                }
                if (constraintWidget22 != null || constraintWidget21 == constraintWidget5) {
                    ConstraintAnchor constraintAnchor14 = constraintWidget21.mListAnchors[i2];
                    SolverVariable solverVariable14 = constraintAnchor14.mSolverVariable;
                    SolverVariable solverVariable15 = constraintAnchor14.mTarget != null ? constraintAnchor14.mTarget.mSolverVariable : null;
                    if (constraintWidget20 != constraintWidget21) {
                        solverVariable15 = constraintWidget20.mListAnchors[i2 + 1].mSolverVariable;
                    } else if (constraintWidget21 == constraintWidget4) {
                        solverVariable15 = constraintWidget13.mListAnchors[i2].mTarget != null ? constraintWidget13.mListAnchors[i2].mTarget.mSolverVariable : null;
                    }
                    int margin5 = constraintAnchor14.getMargin();
                    int i19 = i2 + 1;
                    int margin6 = constraintWidget21.mListAnchors[i19].getMargin();
                    if (constraintWidget22 != null) {
                        constraintAnchor2 = constraintWidget22.mListAnchors[i2];
                        solverVariable3 = constraintAnchor2.mSolverVariable;
                    } else {
                        constraintAnchor2 = constraintWidget3.mListAnchors[i19].mTarget;
                        if (constraintAnchor2 != null) {
                            solverVariable3 = constraintAnchor2.mSolverVariable;
                        } else {
                            solverVariable3 = null;
                        }
                        SolverVariable solverVariable16 = constraintWidget21.mListAnchors[i19].mSolverVariable;
                        if (constraintAnchor2 != null) {
                            margin6 += constraintAnchor2.getMargin();
                        }
                        int margin7 = margin5 + constraintWidget20.mListAnchors[i19].getMargin();
                        if (solverVariable14 == null && solverVariable15 != null && solverVariable3 != null && solverVariable16 != null) {
                            if (constraintWidget21 == constraintWidget4) {
                                margin7 = constraintWidget4.mListAnchors[i2].getMargin();
                            }
                            constraintWidget22 = constraintWidget22;
                            linearSystem.addCentering(solverVariable14, solverVariable15, margin7, 0.5f, solverVariable3, solverVariable16, constraintWidget21 == constraintWidget5 ? constraintWidget5.mListAnchors[i19].getMargin() : margin6, z12 ? 8 : 5);
                        }
                        if (constraintWidget21.getVisibility() != 8) {
                            constraintWidget21 = constraintWidget20;
                        }
                        constraintWidget20 = constraintWidget21;
                        constraintWidget21 = constraintWidget22;
                    }
                    SolverVariable solverVariable17 = constraintWidget21.mListAnchors[i19].mSolverVariable;
                    if (constraintAnchor2 != null) {
                        margin6 += constraintAnchor2.getMargin();
                    }
                    int margin8 = margin5 + constraintWidget20.mListAnchors[i19].getMargin();
                    if (solverVariable14 == null) {
                    }
                }
                if (constraintWidget21.getVisibility() != 8) {
                    constraintWidget21 = constraintWidget20;
                }
                constraintWidget20 = constraintWidget21;
                constraintWidget21 = constraintWidget22;
            }
        }
        if ((!z10 && !z4) || constraintWidget4 == null || constraintWidget4 == constraintWidget5) {
            return;
        }
        ConstraintAnchor constraintAnchor15 = constraintWidget4.mListAnchors[i2];
        if (constraintWidget5 == null) {
            constraintWidget5 = constraintWidget4;
        }
        int i20 = i2 + 1;
        ConstraintAnchor constraintAnchor16 = constraintWidget5.mListAnchors[i20];
        SolverVariable solverVariable18 = constraintAnchor15.mTarget != null ? constraintAnchor15.mTarget.mSolverVariable : null;
        SolverVariable solverVariable19 = constraintAnchor16.mTarget != null ? constraintAnchor16.mTarget.mSolverVariable : null;
        if (constraintWidget3 != constraintWidget5) {
            ConstraintAnchor constraintAnchor17 = constraintWidget3.mListAnchors[i20];
            if (constraintAnchor17.mTarget != null) {
                solverVariable19 = constraintAnchor17.mTarget.mSolverVariable;
                solverVariable4 = solverVariable19;
            } else {
                solverVariable4 = null;
            }
        } else {
            solverVariable4 = solverVariable19;
        }
        if (constraintWidget4 == constraintWidget5) {
            constraintAnchor15 = constraintWidget4.mListAnchors[i2];
            constraintAnchor16 = constraintWidget4.mListAnchors[i20];
        }
        if (solverVariable18 == null || solverVariable4 == null) {
            return;
        }
        linearSystem.addCentering(constraintAnchor15.mSolverVariable, solverVariable18, constraintAnchor15.getMargin(), 0.5f, solverVariable4, constraintAnchor16.mSolverVariable, constraintWidget5.mListAnchors[i20].getMargin(), 5);
    }
}
