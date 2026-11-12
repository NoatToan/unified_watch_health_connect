package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.huawei.hms.ads.jsb.constant.Constant;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    private boolean OPTIMIZE_WRAP;
    private boolean OPTIMIZE_WRAP_ON_RESOLVED;
    public WidgetFrame frame;
    private boolean hasBaseline;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    public HorizontalWidgetRun horizontalRun;
    private boolean horizontalSolvingPass;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected ArrayList<ConstraintAnchor> mAnchors;
    private boolean mAnimated;
    public ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    public ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    private int mHeightOverride;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtualLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    private int mLastHorizontalMeasureSpec;
    private int mLastVerticalMeasureSpec;
    public ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    private boolean mMeasureRequested;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    private int mWidthOverride;
    private int mWrapBehaviorInParent;
    protected int mX;
    protected int mY;
    public boolean measured;
    private boolean resolvedHorizontal;
    private boolean resolvedVertical;
    public WidgetRun[] run;
    public String stringId;
    public ChainRun verticalChainRun;
    public int verticalGroup;
    public VerticalWidgetRun verticalRun;
    private boolean verticalSolvingPass;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public WidgetRun getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public void setFinalFrame(int i, int i2, int i3, int i4, int i5, int i6) {
        setFrame(i, i2, i3, i4);
        setBaselineDistance(i5);
        if (i6 == 0) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = false;
        } else if (i6 == 1) {
            this.resolvedHorizontal = false;
            this.resolvedVertical = true;
        } else if (i6 == 2) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = true;
        } else {
            this.resolvedHorizontal = false;
            this.resolvedVertical = false;
        }
    }

    public void setFinalLeft(int i) {
        this.mLeft.setFinalValue(i);
        this.mX = i;
    }

    public void setFinalTop(int i) {
        this.mTop.setFinalValue(i);
        this.mY = i;
    }

    public void resetSolvingPassFlag() {
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.horizontalSolvingPass;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.verticalSolvingPass;
    }

    public void markHorizontalSolvingPassDone() {
        this.horizontalSolvingPass = true;
    }

    public void markVerticalSolvingPassDone() {
        this.verticalSolvingPass = true;
    }

    public void setFinalHorizontal(int i, int i2) {
        if (this.resolvedHorizontal) {
            return;
        }
        this.mLeft.setFinalValue(i);
        this.mRight.setFinalValue(i2);
        this.mX = i;
        this.mWidth = i2 - i;
        this.resolvedHorizontal = true;
    }

    public void setFinalVertical(int i, int i2) {
        if (this.resolvedVertical) {
            return;
        }
        this.mTop.setFinalValue(i);
        this.mBottom.setFinalValue(i2);
        this.mY = i;
        this.mHeight = i2 - i;
        if (this.hasBaseline) {
            this.mBaseline.setFinalValue(i + this.mBaselineDistance);
        }
        this.resolvedVertical = true;
    }

    public void setFinalBaseline(int i) {
        if (this.hasBaseline) {
            int i2 = i - this.mBaselineDistance;
            int i3 = this.mHeight;
            this.mY = i2;
            this.mTop.setFinalValue(i2);
            this.mBottom.setFinalValue(i3 + i2);
            this.mBaseline.setFinalValue(i);
            this.resolvedVertical = true;
        }
    }

    public boolean isResolvedHorizontally() {
        if (this.resolvedHorizontal) {
            return true;
        }
        return this.mLeft.hasFinalValue() && this.mRight.hasFinalValue();
    }

    public boolean isResolvedVertically() {
        if (this.resolvedVertical) {
            return true;
        }
        return this.mTop.hasFinalValue() && this.mBottom.hasFinalValue();
    }

    public void resetFinalResolution() {
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).resetFinalResolution();
        }
    }

    public void ensureMeasureRequested() {
        this.mMeasureRequested = true;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            if (this.mAnchors.get(i).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDanglingDimension(int i) {
        if (i == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        return ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0)) + (this.mBaseline.mTarget != null ? 1 : 0) < 2;
    }

    public boolean hasResolvedTargets(int i, int i2) {
        if (i == 0) {
            if (this.mLeft.mTarget != null && this.mLeft.mTarget.hasFinalValue() && this.mRight.mTarget != null && this.mRight.mTarget.hasFinalValue()) {
                return (this.mRight.mTarget.getFinalValue() - this.mRight.getMargin()) - (this.mLeft.mTarget.getFinalValue() + this.mLeft.getMargin()) >= i2;
            }
        } else if (this.mTop.mTarget != null && this.mTop.mTarget.hasFinalValue() && this.mBottom.mTarget != null && this.mBottom.mTarget.hasFinalValue()) {
            if ((this.mBottom.mTarget.getFinalValue() - this.mBottom.getMargin()) - (this.mTop.mTarget.getFinalValue() + this.mTop.getMargin()) >= i2) {
                return true;
            }
        }
        return false;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtualLayout;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtualLayout = z;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    protected void setInBarrier(int i, boolean z) {
        this.mIsInBarrier[i] = z;
    }

    public boolean isInBarrier(int i) {
        return this.mIsInBarrier[i];
    }

    public void setMeasureRequested(boolean z) {
        this.mMeasureRequested = z;
    }

    public boolean isMeasureRequested() {
        return this.mMeasureRequested && this.mVisibility != 8;
    }

    public void setWrapBehaviorInParent(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.mWrapBehaviorInParent = i;
    }

    public int getWrapBehaviorInParent() {
        return this.mWrapBehaviorInParent;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.mLastHorizontalMeasureSpec;
    }

    public int getLastVerticalMeasureSpec() {
        return this.mLastVerticalMeasureSpec;
    }

    public void setLastMeasureSpec(int i, int i2) {
        this.mLastHorizontalMeasureSpec = i;
        this.mLastVerticalMeasureSpec = i2;
        setMeasureRequested(false);
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtualLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.mMeasureRequested = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
    }

    private void serializeAnchor(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("',");
        sb.append(constraintAnchor.mMargin);
        sb.append(",");
        sb.append(constraintAnchor.mGoneMargin);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private void serializeCircle(StringBuilder sb, ConstraintAnchor constraintAnchor, float f) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append("circle : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("',");
        sb.append(constraintAnchor.mMargin);
        sb.append(",");
        sb.append(f);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private void serializeAttribute(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    private void serializeAttribute(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    private void serializeDimensionRatio(StringBuilder sb, String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }

    private void serializeSize(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        serializeAttribute(sb, "size", i, Integer.MIN_VALUE);
        serializeAttribute(sb, "min", i2, 0);
        serializeAttribute(sb, "max", i3, Integer.MAX_VALUE);
        serializeAttribute(sb, "matchMin", i5, 0);
        serializeAttribute(sb, "matchDef", i6, 0);
        serializeAttribute(sb, "matchPercent", i6, 1);
        sb.append("},\n");
    }

    public StringBuilder serialize(StringBuilder sb) {
        sb.append("{\n");
        serializeAnchor(sb, "left", this.mLeft);
        serializeAnchor(sb, Constant.MAP_KEY_TOP, this.mTop);
        serializeAnchor(sb, "right", this.mRight);
        serializeAnchor(sb, "bottom", this.mBottom);
        serializeAnchor(sb, "baseline", this.mBaseline);
        serializeAnchor(sb, "centerX", this.mCenterX);
        serializeAnchor(sb, "centerY", this.mCenterY);
        serializeCircle(sb, this.mCenter, this.mCircleConstraintAngle);
        serializeSize(sb, "width", this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        serializeSize(sb, "height", this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        serializeDimensionRatio(sb, "dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb, "horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        sb.append("}\n");
        return sb;
    }

    public boolean oppositeDimensionDependsOn(int i) {
        char c2 = i == 0 ? (char) 1 : (char) 0;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        return dimensionBehaviourArr[i] == DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviourArr[c2] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean oppositeDimensionsTied() {
        return this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean hasDimensionOverride() {
        return (this.mWidthOverride == -1 && this.mHeightOverride == -1) ? false : true;
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
    }

    public ConstraintWidget(String str) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = null;
        this.verticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP = false;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        this.horizontalSolvingPass = false;
        this.verticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.mX = i;
        this.mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public ConstraintWidget(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public void ensureWidgetRuns() {
        if (this.horizontalRun == null) {
            this.horizontalRun = new HorizontalWidgetRun(this);
        }
        if (this.verticalRun == null) {
            this.verticalRun = new VerticalWidgetRun(this);
        }
    }

    public ConstraintWidget(String str, int i, int i2) {
        this(i, i2);
        setDebugName(str);
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        immediateConnect(ConstraintAnchor.Type.CENTER, constraintWidget, ConstraintAnchor.Type.CENTER, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public String getType() {
        return this.mType;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public void setAnimated(boolean z) {
        this.mAnimated = z;
    }

    public boolean isAnimated() {
        return this.mAnimated;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        solverVariableCreateObjectVariable.setName(str + ".left");
        solverVariableCreateObjectVariable2.setName(str + ".top");
        solverVariableCreateObjectVariable3.setName(str + ".right");
        solverVariableCreateObjectVariable4.setName(str + ".bottom");
        linearSystem.createObjectVariable(this.mBaseline).setName(str + ".baseline");
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.mType != null) {
            str = "type: " + this.mType + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.mDebugName != null) {
            str2 = "id: " + this.mDebugName + " ";
        }
        sb.append(str2);
        sb.append(Constants.LEFT_BRACKET_ONLY);
        sb.append(this.mX);
        sb.append(", ");
        sb.append(this.mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        sb.append(this.mHeight);
        sb.append(Constants.RIGHT_BRACKET_ONLY);
        return sb.toString();
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.mX;
        }
        return this.mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.mY;
        }
        return this.mY;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getOptimizerWrapWidth() {
        int i = this.mWidth;
        int iMax = 0;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            iMax = Math.max(this.mMatchConstraintMinWidth, i);
        } else {
            int i2 = this.mMatchConstraintMinWidth;
            if (i2 > 0) {
                this.mWidth = i2;
                iMax = i2;
            }
        }
        int i3 = this.mMatchConstraintMaxWidth;
        return (i3 <= 0 || i3 >= iMax) ? iMax : i3;
    }

    public int getOptimizerWrapHeight() {
        int iMax = this.mHeight;
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultHeight == 1) {
                iMax = Math.max(this.mMatchConstraintMinHeight, iMax);
            } else {
                iMax = this.mMatchConstraintMinHeight;
                if (iMax > 0) {
                    this.mHeight = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i = this.mMatchConstraintMaxHeight;
            if (i > 0 && i < iMax) {
                return i;
            }
        }
        return iMax;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    protected int getRootX() {
        return this.mX + this.mOffsetX;
    }

    protected int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getLeft() {
        return getX();
    }

    public int getTop() {
        return getY();
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i = constraintAnchor != null ? constraintAnchor.mMargin : 0;
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i + constraintAnchor2.mMargin : i;
    }

    public int getVerticalMargin() {
        int i = this.mLeft != null ? this.mTop.mMargin : 0;
        return this.mRight != null ? i + this.mBottom.mMargin : i;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public void setOrigin(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i) {
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[type.ordinal()];
        if (i2 == 1) {
            this.mLeft.mGoneMargin = i;
            return;
        }
        if (i2 == 2) {
            this.mTop.mGoneMargin = i;
            return;
        }
        if (i2 == 3) {
            this.mRight.mGoneMargin = i;
        } else if (i2 == 4) {
            this.mBottom.mGoneMargin = i;
        } else {
            if (i2 != 5) {
                return;
            }
            this.mBaseline.mGoneMargin = i;
        }
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[PHI: r0
      0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    public void setDimensionRatio(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = -1;
        int i3 = 0;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (strSubstring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (strSubstring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                String strSubstring2 = str.substring(i3, iIndexOf2);
                String strSubstring3 = str.substring(iIndexOf2 + 1);
                if (strSubstring2.length() <= 0 || strSubstring3.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = Float.parseFloat(strSubstring2);
                    float f2 = Float.parseFloat(strSubstring3);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else if (i2 == 1) {
                        fAbs = Math.abs(f2 / f);
                    } else {
                        fAbs = Math.abs(f / f2);
                    }
                }
            } else {
                String strSubstring4 = str.substring(i3);
                if (strSubstring4.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring4);
                } else {
                    fAbs = i;
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.mDimensionRatio = fAbs;
            this.mDimensionRatioSide = i2;
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
        }
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.mX = i;
        this.mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.mWidth = i10;
        }
        if (this.mMatchConstraintMaxWidth > 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mWidth = Math.min(this.mWidth, this.mMatchConstraintMaxWidth);
        }
        if (this.mMatchConstraintMaxHeight > 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mHeight = Math.min(this.mHeight, this.mMatchConstraintMaxHeight);
        }
        int i11 = this.mWidth;
        if (i7 != i11) {
            this.mWidthOverride = i11;
        }
        int i12 = this.mHeight;
        if (i8 != i12) {
            this.mHeightOverride = i12;
        }
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
    }

    public void setHorizontalDimension(int i, int i2) {
        this.mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setVerticalDimension(int i, int i2) {
        this.mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
        this.hasBaseline = i > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        boolean z;
        if (type == ConstraintAnchor.Type.CENTER) {
            if (type2 == ConstraintAnchor.Type.CENTER) {
                ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
                ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
                ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(ConstraintAnchor.Type.LEFT, constraintWidget, ConstraintAnchor.Type.LEFT, 0);
                    connect(ConstraintAnchor.Type.RIGHT, constraintWidget, ConstraintAnchor.Type.RIGHT, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(ConstraintAnchor.Type.TOP, constraintWidget, ConstraintAnchor.Type.TOP, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, ConstraintAnchor.Type.BOTTOM, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER), 0);
                    return;
                } else if (z) {
                    getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER_X), 0);
                    return;
                } else {
                    if (z2) {
                        getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.CENTER_Y), 0);
                        return;
                    }
                    return;
                }
            }
            if (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT) {
                connect(ConstraintAnchor.Type.LEFT, constraintWidget, type2, 0);
                connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                return;
            } else {
                if (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM) {
                    connect(ConstraintAnchor.Type.TOP, constraintWidget, type2, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                    return;
                }
                return;
            }
        }
        if (type == ConstraintAnchor.Type.CENTER_X && (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(anchor6, 0);
            return;
        }
        if (type == ConstraintAnchor.Type.CENTER_Y && (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(ConstraintAnchor.Type.TOP).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(anchor8, 0);
            return;
        }
        if (type == ConstraintAnchor.Type.CENTER_X && type2 == ConstraintAnchor.Type.CENTER_X) {
            getAnchor(ConstraintAnchor.Type.LEFT).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT), 0);
            getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT), 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        if (type == ConstraintAnchor.Type.CENTER_Y && type2 == ConstraintAnchor.Type.CENTER_Y) {
            getAnchor(ConstraintAnchor.Type.TOP).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.TOP), 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM), 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        ConstraintAnchor anchor9 = getAnchor(type);
        ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
        if (anchor9.isValidConnection(anchor10)) {
            if (type == ConstraintAnchor.Type.BASELINE) {
                ConstraintAnchor anchor11 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor12 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor anchor13 = getAnchor(ConstraintAnchor.Type.BASELINE);
                if (anchor13 != null) {
                    anchor13.reset();
                }
                ConstraintAnchor anchor14 = getAnchor(ConstraintAnchor.Type.CENTER);
                if (anchor14.getTarget() != anchor10) {
                    anchor14.reset();
                }
                ConstraintAnchor opposite = getAnchor(type).getOpposite();
                ConstraintAnchor anchor15 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
                if (anchor15.isConnected()) {
                    opposite.reset();
                    anchor15.reset();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor anchor16 = getAnchor(ConstraintAnchor.Type.CENTER);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                ConstraintAnchor anchor17 = getAnchor(ConstraintAnchor.Type.CENTER_X);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i);
        }
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
        ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
            if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor5.reset();
            }
        } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
            anchor5.reset();
        }
        constraintAnchor.reset();
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).reset();
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public boolean isInHorizontalChain() {
        if (this.mLeft.mTarget == null || this.mLeft.mTarget.mTarget != this.mLeft) {
            return this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight;
        }
        return true;
    }

    public ConstraintWidget getPreviousChainMember(int i) {
        if (i == 0) {
            if (this.mLeft.mTarget == null) {
                return null;
            }
            ConstraintAnchor constraintAnchor = this.mLeft.mTarget.mTarget;
            ConstraintAnchor constraintAnchor2 = this.mLeft;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mTop.mTarget == null) {
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mTop.mTarget.mTarget;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public ConstraintWidget getNextChainMember(int i) {
        if (i == 0) {
            if (this.mRight.mTarget == null) {
                return null;
            }
            ConstraintAnchor constraintAnchor = this.mRight.mTarget.mTarget;
            ConstraintAnchor constraintAnchor2 = this.mRight;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mBottom.mTarget == null) {
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom.mTarget.mTarget;
        ConstraintAnchor constraintAnchor4 = this.mBottom;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public boolean isInVerticalChain() {
        if (this.mTop.mTarget == null || this.mTop.mTarget.mTarget != this.mTop) {
            return this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom;
        }
        return true;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    private boolean isChainHead(int i) {
        int i2 = i * 2;
        if (this.mListAnchors[i2].mTarget == null) {
            return false;
        }
        ConstraintAnchor constraintAnchor = this.mListAnchors[i2].mTarget.mTarget;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        if (constraintAnchor == constraintAnchorArr[i2]) {
            return false;
        }
        int i3 = i2 + 1;
        return constraintAnchorArr[i3].mTarget != null && this.mListAnchors[i3].mTarget.mTarget == this.mListAnchors[i3];
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0326  */
    /* JADX WARN: Code duplicated, block: B:209:0x0338  */
    /* JADX WARN: Code duplicated, block: B:211:0x033c  */
    /* JADX WARN: Code duplicated, block: B:212:0x033f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:247:0x0448  */
    /* JADX WARN: Code duplicated, block: B:249:0x045a  */
    /* JADX WARN: Code duplicated, block: B:266:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:271:0x04da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:279:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:281:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:284:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:285:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:288:0x0505  */
    /* JADX WARN: Code duplicated, block: B:289:0x050d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0513  */
    /* JADX WARN: Code duplicated, block: B:294:0x0517  */
    /* JADX WARN: Code duplicated, block: B:296:0x051d  */
    /* JADX WARN: Code duplicated, block: B:298:0x0537  */
    /* JADX WARN: Code duplicated, block: B:300:0x0544  */
    /* JADX WARN: Code duplicated, block: B:302:0x0548  */
    /* JADX WARN: Code duplicated, block: B:303:0x0552  */
    /* JADX WARN: Code duplicated, block: B:307:0x0579  */
    /* JADX WARN: Code duplicated, block: B:308:0x057c  */
    /* JADX WARN: Code duplicated, block: B:310:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:313:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:315:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:316:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:319:0x05f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r50v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        boolean z2;
        boolean z3;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z6;
        int i5;
        boolean z7;
        boolean z8;
        int i6;
        boolean z9;
        boolean z10;
        int i7;
        int i8;
        int i9;
        ?? r15;
        int i10;
        ?? r16;
        ?? r9;
        ConstraintWidget constraintWidget3;
        SolverVariable solverVariableCreateObjectVariable;
        ConstraintWidget constraintWidget4;
        SolverVariable solverVariableCreateObjectVariable2;
        ?? r27;
        DimensionBehaviour[] dimensionBehaviourArr;
        boolean z11;
        ?? r17;
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int i11;
        boolean zIsInHorizontalChain;
        boolean zIsInVerticalChain;
        HorizontalWidgetRun horizontalWidgetRun2;
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(this.mBottom);
        SolverVariable solverVariableCreateObjectVariable7 = linearSystem.createObjectVariable(this.mBaseline);
        ConstraintWidget constraintWidget5 = this.mParent;
        if (constraintWidget5 == null) {
            z2 = false;
            z3 = false;
        } else {
            boolean z12 = constraintWidget5 != null && constraintWidget5.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
            ConstraintWidget constraintWidget6 = this.mParent;
            boolean z13 = constraintWidget6 != null && constraintWidget6.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
            int i12 = this.mWrapBehaviorInParent;
            if (i12 == 1) {
                z2 = z12;
                z3 = false;
            } else if (i12 == 2) {
                z3 = z13;
                z2 = false;
            } else if (i12 != 3) {
                z2 = z12;
                z3 = z13;
            } else {
                z2 = false;
                z3 = false;
            }
        }
        if (this.mVisibility == 8 && !this.mAnimated && !hasDependencies()) {
            boolean[] zArr = this.mIsInBarrier;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z14 = this.resolvedHorizontal;
        if (z14 || this.resolvedVertical) {
            if (z14) {
                linearSystem.addEquality(solverVariableCreateObjectVariable3, this.mX);
                linearSystem.addEquality(solverVariableCreateObjectVariable4, this.mX + this.mWidth);
                if (z2 && (constraintWidget2 = this.mParent) != null) {
                    if (this.OPTIMIZE_WRAP_ON_RESOLVED) {
                        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget2;
                        constraintWidgetContainer.addHorizontalWrapMinVariable(this.mLeft);
                        constraintWidgetContainer.addHorizontalWrapMaxVariable(this.mRight);
                    } else {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget2.mRight), solverVariableCreateObjectVariable4, 0, 5);
                    }
                }
            }
            if (this.resolvedVertical) {
                linearSystem.addEquality(solverVariableCreateObjectVariable5, this.mY);
                linearSystem.addEquality(solverVariableCreateObjectVariable6, this.mY + this.mHeight);
                if (this.mBaseline.hasDependents()) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable7, this.mY + this.mBaselineDistance);
                }
                if (z3 && (constraintWidget = this.mParent) != null) {
                    if (this.OPTIMIZE_WRAP_ON_RESOLVED) {
                        ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget;
                        constraintWidgetContainer2.addVerticalWrapMinVariable(this.mTop);
                        constraintWidgetContainer2.addVerticalWrapMaxVariable(this.mBottom);
                    } else {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget.mBottom), solverVariableCreateObjectVariable6, 0, 5);
                    }
                }
            }
            if (this.resolvedHorizontal && this.resolvedVertical) {
                this.resolvedHorizontal = false;
                this.resolvedVertical = false;
                return;
            }
        }
        if (LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.widgets++;
        }
        if (z && (horizontalWidgetRun2 = this.horizontalRun) != null && this.verticalRun != null && horizontalWidgetRun2.start.resolved && this.horizontalRun.end.resolved && this.verticalRun.start.resolved && this.verticalRun.end.resolved) {
            if (LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.graphSolved++;
            }
            linearSystem.addEquality(solverVariableCreateObjectVariable3, this.horizontalRun.start.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable4, this.horizontalRun.end.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable5, this.verticalRun.start.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable6, this.verticalRun.end.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable7, this.verticalRun.baseline.value);
            if (this.mParent != null) {
                if (z2 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), solverVariableCreateObjectVariable4, 0, 8);
                }
                if (z3 && this.isTerminalWidget[1] && !isInVerticalChain()) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), solverVariableCreateObjectVariable6, 0, 8);
                }
            }
            this.resolvedHorizontal = false;
            this.resolvedVertical = false;
            return;
        }
        if (LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.linearSolved++;
        }
        if (this.mParent != null) {
            if (isChainHead(0)) {
                ((ConstraintWidgetContainer) this.mParent).addChain(this, 0);
                zIsInHorizontalChain = true;
            } else {
                zIsInHorizontalChain = isInHorizontalChain();
            }
            if (isChainHead(1)) {
                ((ConstraintWidgetContainer) this.mParent).addChain(this, 1);
                zIsInVerticalChain = true;
            } else {
                zIsInVerticalChain = isInVerticalChain();
            }
            if (!zIsInHorizontalChain && z2 && this.mVisibility != 8 && this.mLeft.mTarget == null && this.mRight.mTarget == null) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), solverVariableCreateObjectVariable4, 0, 1);
            }
            if (!zIsInVerticalChain && z3 && this.mVisibility != 8 && this.mTop.mTarget == null && this.mBottom.mTarget == null && this.mBaseline == null) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), solverVariableCreateObjectVariable6, 0, 1);
            }
            z5 = zIsInHorizontalChain;
            z4 = zIsInVerticalChain;
        } else {
            z4 = false;
            z5 = false;
        }
        int i13 = this.mWidth;
        int i14 = this.mMinWidth;
        if (i13 < i14) {
            i13 = i14;
        }
        int i15 = this.mHeight;
        int i16 = this.mMinHeight;
        if (i15 < i16) {
            i15 = i16;
        }
        boolean z15 = this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z16 = this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT;
        this.mResolvedDimensionRatioSide = this.mDimensionRatioSide;
        float f = this.mDimensionRatio;
        this.mResolvedDimensionRatio = f;
        int i17 = this.mMatchConstraintDefaultWidth;
        int i18 = this.mMatchConstraintDefaultHeight;
        int i19 = i13;
        if (f <= 0.0f || this.mVisibility == 8) {
            i = i19;
            i2 = i15;
            i3 = i18;
            i4 = i17;
            z6 = false;
        } else {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && i17 == 0) {
                i17 = 3;
            }
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i18 == 0) {
                i18 = 3;
            }
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i17 == 3 && i18 == 3) {
                setupDimensionRatio(z2, z3, z15, z16);
            } else if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && i17 == 3) {
                this.mResolvedDimensionRatioSide = 0;
                i = (int) (this.mResolvedDimensionRatio * this.mHeight);
                if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
                    i17 = 4;
                    i2 = i15;
                    i3 = i18;
                    i4 = i17;
                    z6 = false;
                } else {
                    i2 = i15;
                    i3 = i18;
                    i4 = i17;
                    z6 = true;
                }
            } else if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i18 == 3) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
                i15 = (int) (this.mResolvedDimensionRatio * this.mWidth);
                if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
                    i18 = 4;
                    i = i19;
                    i2 = i15;
                    i3 = i18;
                    i4 = i17;
                    z6 = false;
                }
            }
            i2 = i15;
            i3 = i18;
            i4 = i17;
            i = i19;
            z6 = true;
        }
        int[] iArr = this.mResolvedMatchConstraintDefault;
        iArr[0] = i4;
        iArr[1] = i3;
        this.mResolvedHasRatio = z6;
        if (z6) {
            int i20 = this.mResolvedDimensionRatioSide;
            i5 = -1;
            boolean z17 = i20 == 0 || i20 == -1;
            if (z6 || !((i11 = this.mResolvedDimensionRatioSide) == 1 || i11 == i5)) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT || !(this instanceof ConstraintWidgetContainer)) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (z8) {
                i6 = 0;
            } else {
                i6 = i;
            }
            z9 = !this.mCenter.isConnected();
            boolean[] zArr2 = this.mIsInBarrier;
            boolean z18 = zArr2[0];
            z10 = zArr2[1];
            if (this.mHorizontalResolution == 2 && !this.resolvedHorizontal) {
                if (!z || (horizontalWidgetRun = this.horizontalRun) == null || !horizontalWidgetRun.start.resolved || !this.horizontalRun.end.resolved) {
                    ConstraintWidget constraintWidget7 = this.mParent;
                    SolverVariable solverVariableCreateObjectVariable8 = constraintWidget7 != null ? linearSystem.createObjectVariable(constraintWidget7.mRight) : null;
                    ConstraintWidget constraintWidget8 = this.mParent;
                    SolverVariable solverVariableCreateObjectVariable9 = constraintWidget8 != null ? linearSystem.createObjectVariable(constraintWidget8.mLeft) : null;
                    boolean z19 = this.isTerminalWidget[0];
                    DimensionBehaviour[] dimensionBehaviourArr2 = this.mListDimensionBehaviors;
                    applyConstraints(linearSystem, true, z2, z3, z19, solverVariableCreateObjectVariable9, solverVariableCreateObjectVariable8, dimensionBehaviourArr2[0], z8, this.mLeft, this.mRight, this.mX, i6, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, z17, dimensionBehaviourArr2[1] == DimensionBehaviour.MATCH_CONSTRAINT, z5, z4, z18, i4, i3, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z9);
                } else if (z) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, this.horizontalRun.start.value);
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, this.horizontalRun.end.value);
                    if (this.mParent != null && z2 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), solverVariableCreateObjectVariable4, 0, 8);
                    }
                }
            }
            if (z) {
                r17 = this;
                verticalWidgetRun = r17.verticalRun;
                if (verticalWidgetRun == null && verticalWidgetRun.start.resolved && r17.verticalRun.end.resolved) {
                    linearSystem = linearSystem;
                    solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                    linearSystem.addEquality(solverVariableCreateObjectVariable5, r17.verticalRun.start.value);
                    solverVariableCreateObjectVariable6 = solverVariableCreateObjectVariable6;
                    linearSystem.addEquality(solverVariableCreateObjectVariable6, r17.verticalRun.end.value);
                    solverVariableCreateObjectVariable7 = solverVariableCreateObjectVariable7;
                    linearSystem.addEquality(solverVariableCreateObjectVariable7, r17.verticalRun.baseline.value);
                    ConstraintWidget constraintWidget9 = r17.mParent;
                    if (constraintWidget9 == null || z4 || !z3) {
                        i7 = 8;
                        i8 = 0;
                        i9 = 1;
                    } else {
                        i9 = 1;
                        if (r17.isTerminalWidget[1]) {
                            i7 = 8;
                            i8 = 0;
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget9.mBottom), solverVariableCreateObjectVariable6, 0, 8);
                        } else {
                            i7 = 8;
                            i8 = 0;
                        }
                    }
                    i10 = i8;
                    r16 = r17;
                } else {
                    i7 = 8;
                    i8 = 0;
                    i9 = 1;
                    r15 = r17;
                }
                if (r16.mVerticalResolution == 2 && i10 != 0 && !r16.resolvedVertical) {
                    if (r16.mListDimensionBehaviors[i9] == DimensionBehaviour.WRAP_CONTENT || !(r16 instanceof ConstraintWidgetContainer)) {
                        r9 = i8;
                    } else {
                        r9 = i9;
                    }
                    if (r9 != 0) {
                        i2 = i8;
                    }
                    constraintWidget3 = r16.mParent;
                    if (constraintWidget3 != null) {
                        solverVariableCreateObjectVariable = linearSystem.createObjectVariable(constraintWidget3.mBottom);
                    } else {
                        solverVariableCreateObjectVariable = null;
                    }
                    constraintWidget4 = r16.mParent;
                    if (constraintWidget4 != null) {
                        solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(constraintWidget4.mTop);
                    } else {
                        solverVariableCreateObjectVariable2 = null;
                    }
                    if (r16.mBaselineDistance > 0 && r16.mVisibility != i7) {
                        r27 = z9;
                    } else if (r16.mBaseline.mTarget != null) {
                        linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, getBaselineDistance(), i7);
                        linearSystem.addEquality(solverVariableCreateObjectVariable7, linearSystem.createObjectVariable(r16.mBaseline.mTarget), r16.mBaseline.getMargin(), i7);
                        if (z3 != 0) {
                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable, linearSystem.createObjectVariable(r16.mBottom), i8, 5);
                        }
                        r27 = i8;
                    } else {
                        if (r16.mVisibility == i7) {
                            linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, r16.mBaseline.getMargin(), i7);
                        } else {
                            linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, getBaselineDistance(), i7);
                        }
                        r27 = z9;
                    }
                    boolean z20 = r16.isTerminalWidget[i9];
                    dimensionBehaviourArr = r16.mListDimensionBehaviors;
                    DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i9];
                    ConstraintAnchor constraintAnchor = r16.mTop;
                    ConstraintAnchor constraintAnchor2 = r16.mBottom;
                    int i21 = r16.mY;
                    int i22 = r16.mMinHeight;
                    int i23 = r16.mMaxDimension[i9];
                    float f2 = r16.mVerticalBiasPercent;
                    if (dimensionBehaviourArr[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    applyConstraints(linearSystem, false, z3, z2, z20, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, dimensionBehaviour, r9, constraintAnchor, constraintAnchor2, i21, i2, i22, i23, f2, z7, z11, z4, z5, z10, i3, i4, r16.mMatchConstraintMinHeight, r16.mMatchConstraintMaxHeight, r16.mMatchConstraintPercentHeight, r27);
                }
                if (z6) {
                    if (this.mResolvedDimensionRatioSide == 1) {
                        linearSystem.addRatio(solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, this.mResolvedDimensionRatio, 8);
                    } else {
                        linearSystem.addRatio(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable5, this.mResolvedDimensionRatio, 8);
                    }
                }
                if (this.mCenter.isConnected()) {
                    linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                }
                this.resolvedHorizontal = false;
                this.resolvedVertical = false;
            }
            i7 = 8;
            i8 = 0;
            i9 = 1;
            r15 = this;
            i10 = i9;
            r16 = r15;
            if (r16.mVerticalResolution == 2) {
                if (r16.mListDimensionBehaviors[i9] == DimensionBehaviour.WRAP_CONTENT) {
                    r9 = i8;
                } else {
                    r9 = i8;
                }
                if (r9 != 0) {
                    i2 = i8;
                }
                constraintWidget3 = r16.mParent;
                if (constraintWidget3 != null) {
                    solverVariableCreateObjectVariable = linearSystem.createObjectVariable(constraintWidget3.mBottom);
                } else {
                    solverVariableCreateObjectVariable = null;
                }
                constraintWidget4 = r16.mParent;
                if (constraintWidget4 != null) {
                    solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(constraintWidget4.mTop);
                } else {
                    solverVariableCreateObjectVariable2 = null;
                }
                if (r16.mBaselineDistance > 0) {
                    if (r16.mBaseline.mTarget != null) {
                        linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, getBaselineDistance(), i7);
                        linearSystem.addEquality(solverVariableCreateObjectVariable7, linearSystem.createObjectVariable(r16.mBaseline.mTarget), r16.mBaseline.getMargin(), i7);
                        if (z3 != 0) {
                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable, linearSystem.createObjectVariable(r16.mBottom), i8, 5);
                        }
                        r27 = i8;
                    } else {
                        if (r16.mVisibility == i7) {
                            linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, r16.mBaseline.getMargin(), i7);
                        } else {
                            linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, getBaselineDistance(), i7);
                        }
                        r27 = z9;
                    }
                } else if (r16.mBaseline.mTarget != null) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, getBaselineDistance(), i7);
                    linearSystem.addEquality(solverVariableCreateObjectVariable7, linearSystem.createObjectVariable(r16.mBaseline.mTarget), r16.mBaseline.getMargin(), i7);
                    if (z3 != 0) {
                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable, linearSystem.createObjectVariable(r16.mBottom), i8, 5);
                    }
                    r27 = i8;
                } else {
                    if (r16.mVisibility == i7) {
                        linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, r16.mBaseline.getMargin(), i7);
                    } else {
                        linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, getBaselineDistance(), i7);
                    }
                    r27 = z9;
                }
                boolean z21 = r16.isTerminalWidget[i9];
                dimensionBehaviourArr = r16.mListDimensionBehaviors;
                DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[i9];
                ConstraintAnchor constraintAnchor3 = r16.mTop;
                ConstraintAnchor constraintAnchor4 = r16.mBottom;
                int i24 = r16.mY;
                int i25 = r16.mMinHeight;
                int i26 = r16.mMaxDimension[i9];
                float f3 = r16.mVerticalBiasPercent;
                if (dimensionBehaviourArr[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                applyConstraints(linearSystem, false, z3, z2, z21, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, dimensionBehaviour2, r9, constraintAnchor3, constraintAnchor4, i24, i2, i25, i26, f3, z7, z11, z4, z5, z10, i3, i4, r16.mMatchConstraintMinHeight, r16.mMatchConstraintMaxHeight, r16.mMatchConstraintPercentHeight, r27);
            }
            if (z6) {
                if (this.mResolvedDimensionRatioSide == 1) {
                    linearSystem.addRatio(solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, this.mResolvedDimensionRatio, 8);
                } else {
                    linearSystem.addRatio(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable5, this.mResolvedDimensionRatio, 8);
                }
            }
            if (this.mCenter.isConnected()) {
                linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
            }
            this.resolvedHorizontal = false;
            this.resolvedVertical = false;
        }
        i5 = -1;
        if (z6) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (this.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (z8) {
            i6 = 0;
        } else {
            i6 = i;
        }
        z9 = !this.mCenter.isConnected();
        boolean[] zArr3 = this.mIsInBarrier;
        boolean z110 = zArr3[0];
        z10 = zArr3[1];
        if (this.mHorizontalResolution == 2) {
        }
        if (z) {
            r17 = this;
            verticalWidgetRun = r17.verticalRun;
            if (verticalWidgetRun == null) {
            }
            i7 = 8;
            i8 = 0;
            i9 = 1;
            r15 = r17;
        } else {
            i7 = 8;
            i8 = 0;
            i9 = 1;
            r15 = this;
        }
        i10 = i9;
        r16 = r15;
        if (r16.mVerticalResolution == 2) {
            if (r16.mListDimensionBehaviors[i9] == DimensionBehaviour.WRAP_CONTENT) {
                r9 = i8;
            } else {
                r9 = i8;
            }
            if (r9 != 0) {
                i2 = i8;
            }
            constraintWidget3 = r16.mParent;
            if (constraintWidget3 != null) {
                solverVariableCreateObjectVariable = linearSystem.createObjectVariable(constraintWidget3.mBottom);
            } else {
                solverVariableCreateObjectVariable = null;
            }
            constraintWidget4 = r16.mParent;
            if (constraintWidget4 != null) {
                solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(constraintWidget4.mTop);
            } else {
                solverVariableCreateObjectVariable2 = null;
            }
            if (r16.mBaselineDistance > 0) {
                if (r16.mBaseline.mTarget != null) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, getBaselineDistance(), i7);
                    linearSystem.addEquality(solverVariableCreateObjectVariable7, linearSystem.createObjectVariable(r16.mBaseline.mTarget), r16.mBaseline.getMargin(), i7);
                    if (z3 != 0) {
                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable, linearSystem.createObjectVariable(r16.mBottom), i8, 5);
                    }
                    r27 = i8;
                } else {
                    if (r16.mVisibility == i7) {
                        linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, r16.mBaseline.getMargin(), i7);
                    } else {
                        linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, getBaselineDistance(), i7);
                    }
                    r27 = z9;
                }
            } else if (r16.mBaseline.mTarget != null) {
                linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, getBaselineDistance(), i7);
                linearSystem.addEquality(solverVariableCreateObjectVariable7, linearSystem.createObjectVariable(r16.mBaseline.mTarget), r16.mBaseline.getMargin(), i7);
                if (z3 != 0) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable, linearSystem.createObjectVariable(r16.mBottom), i8, 5);
                }
                r27 = i8;
            } else {
                if (r16.mVisibility == i7) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, r16.mBaseline.getMargin(), i7);
                } else {
                    linearSystem.addEquality(solverVariableCreateObjectVariable7, solverVariableCreateObjectVariable5, getBaselineDistance(), i7);
                }
                r27 = z9;
            }
            boolean z22 = r16.isTerminalWidget[i9];
            dimensionBehaviourArr = r16.mListDimensionBehaviors;
            DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[i9];
            ConstraintAnchor constraintAnchor5 = r16.mTop;
            ConstraintAnchor constraintAnchor6 = r16.mBottom;
            int i27 = r16.mY;
            int i28 = r16.mMinHeight;
            int i29 = r16.mMaxDimension[i9];
            float f4 = r16.mVerticalBiasPercent;
            if (dimensionBehaviourArr[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
                z11 = true;
            } else {
                z11 = false;
            }
            applyConstraints(linearSystem, false, z3, z2, z22, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, dimensionBehaviour3, r9, constraintAnchor5, constraintAnchor6, i27, i2, i28, i29, f4, z7, z11, z4, z5, z10, i3, i4, r16.mMatchConstraintMinHeight, r16.mMatchConstraintMaxHeight, r16.mMatchConstraintPercentHeight, r27);
        }
        if (z6) {
            if (this.mResolvedDimensionRatioSide == 1) {
                linearSystem.addRatio(solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, this.mResolvedDimensionRatio, 8);
            } else {
                linearSystem.addRatio(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable5, this.mResolvedDimensionRatio, 8);
            }
        }
        if (this.mCenter.isConnected()) {
            linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
        }
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
    }

    boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else {
                if (i != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x018c  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:273:0x0437  */
    /* JADX WARN: Code duplicated, block: B:280:0x0444  */
    /* JADX WARN: Code duplicated, block: B:285:0x044e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0457  */
    /* JADX WARN: Code duplicated, block: B:292:0x045a  */
    /* JADX WARN: Code duplicated, block: B:295:0x0461  */
    /* JADX WARN: Code duplicated, block: B:303:0x047f  */
    /* JADX WARN: Code duplicated, block: B:305:0x0483  */
    /* JADX WARN: Code duplicated, block: B:306:0x0488  */
    /* JADX WARN: Code duplicated, block: B:308:0x048b  */
    /* JADX WARN: Code duplicated, block: B:319:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:345:0x04e9 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:347:0x04f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:375:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    /* JADX WARN: Code duplicated, block: B:84:0x012a  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x013a  */
    /* JADX WARN: Code duplicated, block: B:92:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0141  */
    /* JADX WARN: Code duplicated, block: B:94:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x015e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0162  */
    private void applyConstraints(LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int iMin;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        SolverVariable solverVariableCreateObjectVariable;
        SolverVariable solverVariableCreateObjectVariable2;
        int i14;
        char c2;
        int i15;
        boolean z16;
        int i16;
        int i17;
        boolean z17;
        boolean z18;
        boolean z19;
        int i18;
        ConstraintWidget constraintWidget;
        boolean z20;
        int i19;
        boolean z21;
        SolverVariable solverVariable3;
        ConstraintWidget constraintWidget2;
        int iMin2;
        int i20;
        int i21;
        int i22;
        int margin;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z22;
        boolean z23;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z24;
        boolean z25;
        int i33;
        int i34;
        boolean z26;
        ConstraintWidget constraintWidget3;
        int i35;
        ConstraintWidget constraintWidget4;
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintAnchor);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintAnchor2);
        SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(constraintAnchor.getTarget());
        SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(constraintAnchor2.getTarget());
        if (LinearSystem.getMetrics() != null) {
            LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean zIsConnected = constraintAnchor.isConnected();
        boolean zIsConnected2 = constraintAnchor2.isConnected();
        boolean zIsConnected3 = this.mCenter.isConnected();
        int i36 = zIsConnected2 ? (zIsConnected ? 1 : 0) + 1 : zIsConnected ? 1 : 0;
        if (zIsConnected3) {
            i36++;
        }
        int i37 = z6 ? 3 : i5;
        int i38 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour.ordinal()];
        if (i38 != 1 && i38 != 2 && i38 != 3 && i38 == 4) {
            i9 = i37;
            z12 = i9 != 4;
            iMin = this.mWidthOverride;
            if (iMin == -1 && z) {
                this.mWidthOverride = -1;
                z12 = false;
            } else {
                iMin = i2;
            }
            i10 = this.mHeightOverride;
            if (i10 != -1 && !z) {
                this.mHeightOverride = -1;
                iMin = i10;
                z12 = false;
            }
            if (this.mVisibility == 8) {
                iMin = 0;
                z12 = false;
            }
            if (z11) {
                if (zIsConnected && !zIsConnected2 && !zIsConnected3) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, i);
                } else if (zIsConnected && !zIsConnected2) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
                }
            }
            if (!z12) {
                if (i36 == 2 && !z6 && (i9 == 1 || i9 == 0)) {
                    int iMax = Math.max(i7, iMin);
                    if (i8 > 0) {
                        iMax = Math.min(i8, iMax);
                    }
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMax, 8);
                    z12 = false;
                } else {
                    if (i7 == -2) {
                        i11 = iMin;
                    } else {
                        i11 = i7;
                    }
                    if (i8 == -2) {
                        i12 = iMin;
                    } else {
                        i12 = i8;
                    }
                    if (iMin > 0 && i9 != 1) {
                        iMin = 0;
                    }
                    if (i11 > 0) {
                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i11, 8);
                        iMin = Math.max(iMin, i11);
                    }
                    if (i12 > 0) {
                        if (z2 || i9 != 1) {
                            linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i12, 8);
                        }
                        iMin = Math.min(iMin, i12);
                    }
                    if (i9 == 1) {
                        if (z2) {
                            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                        } else if (z8) {
                            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                            linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                        } else {
                            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                            linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                        }
                        i13 = i36;
                        solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                        solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                        z14 = z12;
                        solverVariableCreateObjectVariable6 = solverVariableCreateObjectVariable6;
                        z15 = z4;
                        i11 = i11;
                    } else {
                        if (i9 == 2) {
                            if (constraintAnchor.getType() != ConstraintAnchor.Type.TOP || constraintAnchor.getType() == ConstraintAnchor.Type.BOTTOM) {
                                solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.TOP));
                                solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                            } else {
                                solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.LEFT));
                                solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.RIGHT));
                            }
                            SolverVariable solverVariable4 = solverVariableCreateObjectVariable;
                            ArrayRow arrayRowCreateRow = linearSystem.createRow();
                            i13 = i36 == true ? 1 : 0;
                            linearSystem.addConstraint(arrayRowCreateRow.createRowDimensionRatio(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, solverVariable4, f2));
                            if (z2) {
                                z12 = false;
                            }
                            z13 = z4;
                        } else {
                            i13 = i36;
                            z13 = true;
                        }
                        z14 = z12;
                        z15 = z13;
                    }
                }
                if (z11 || z8) {
                    i14 = 0;
                    c2 = 2;
                    if (i13 >= c2 && z2 && z15) {
                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, i14, 8);
                        int i39 = (z || this.mBaseline.mTarget == null) ? 1 : i14;
                        if (!z && this.mBaseline.mTarget != null) {
                            ConstraintWidget constraintWidget5 = this.mBaseline.mTarget.mOwner;
                            if (constraintWidget5.mDimensionRatio == 0.0f || constraintWidget5.mListDimensionBehaviors[i14] != DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget5.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
                                return;
                            }
                        } else if (i39 == 0) {
                            return;
                        }
                        linearSystem.addGreaterThan(solverVariable2, solverVariableCreateObjectVariable4, i14, 8);
                        return;
                    }
                    return;
                }
                if (zIsConnected || zIsConnected2 || zIsConnected3) {
                    if (!zIsConnected || zIsConnected2) {
                        if (zIsConnected || !zIsConnected2) {
                            if (zIsConnected && zIsConnected2) {
                                ConstraintWidget constraintWidget6 = constraintAnchor.mTarget.mOwner;
                                ConstraintWidget constraintWidget7 = constraintAnchor2.mTarget.mOwner;
                                ConstraintWidget parent = getParent();
                                if (z14) {
                                    if (i9 == 0) {
                                        if (i12 != 0 || i11 != 0) {
                                            z25 = false;
                                            i33 = 5;
                                            i34 = 5;
                                            z26 = true;
                                            z17 = true;
                                        } else if (solverVariableCreateObjectVariable5.isFinalValue && solverVariableCreateObjectVariable6.isFinalValue) {
                                            linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
                                            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), 8);
                                            return;
                                        } else {
                                            z26 = false;
                                            z17 = false;
                                            i33 = 8;
                                            i34 = 8;
                                            z25 = true;
                                        }
                                        if ((constraintWidget6 instanceof Barrier) || (constraintWidget7 instanceof Barrier)) {
                                            i34 = 4;
                                        }
                                        z18 = z25;
                                        i16 = i34;
                                        i15 = 6;
                                        boolean z27 = z26;
                                        i17 = i33;
                                        z16 = z27;
                                    } else {
                                        if (i9 == 2) {
                                            i25 = ((constraintWidget6 instanceof Barrier) || (constraintWidget7 instanceof Barrier)) ? 4 : 5;
                                            i26 = 5;
                                        } else {
                                            if (i9 == 1) {
                                                i25 = 4;
                                                i26 = 8;
                                            } else if (i9 == 3) {
                                                if (this.mResolvedDimensionRatioSide == -1) {
                                                    if (z9) {
                                                        i31 = z2 ? 5 : 4;
                                                    } else {
                                                        i31 = 8;
                                                    }
                                                    i32 = 8;
                                                    i30 = 5;
                                                } else {
                                                    if (!z6) {
                                                        if (i12 > 0) {
                                                            i27 = 5;
                                                        } else if (i12 != 0 || i11 != 0) {
                                                            i27 = 4;
                                                        } else if (z9) {
                                                            i28 = (constraintWidget6 == parent || constraintWidget7 == parent) ? 5 : 4;
                                                            i29 = 4;
                                                        } else {
                                                            i27 = 8;
                                                        }
                                                        i30 = i27;
                                                        i31 = 6;
                                                        i32 = 5;
                                                    } else if (i6 == 2 || i6 == 1) {
                                                        i29 = 4;
                                                        i28 = 5;
                                                    } else {
                                                        i29 = 5;
                                                        i28 = 8;
                                                    }
                                                    i16 = i29;
                                                    i17 = i28;
                                                    i15 = 6;
                                                    z16 = true;
                                                    z22 = true;
                                                    z24 = true;
                                                }
                                                i17 = i32;
                                                i16 = i30;
                                                z22 = true;
                                                z24 = true;
                                                i15 = i31;
                                                z16 = true;
                                            } else {
                                                i25 = 4;
                                                i26 = 5;
                                                z22 = false;
                                                z23 = false;
                                                i17 = i26;
                                                i15 = 6;
                                                z24 = false;
                                                boolean z28 = z23;
                                                i16 = i25;
                                                z16 = z28;
                                            }
                                            z18 = z24;
                                            z17 = z22;
                                        }
                                        z22 = true;
                                        z23 = true;
                                        i17 = i26;
                                        i15 = 6;
                                        z24 = false;
                                        boolean z29 = z23;
                                        i16 = i25;
                                        z16 = z29;
                                        z18 = z24;
                                        z17 = z22;
                                    }
                                } else {
                                    if (solverVariableCreateObjectVariable5.isFinalValue && solverVariableCreateObjectVariable6.isFinalValue) {
                                        linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable4, constraintAnchor2.getMargin(), 8);
                                        if (z2 && z15) {
                                            int margin2 = constraintAnchor2.mTarget != null ? constraintAnchor2.getMargin() : 0;
                                            if (solverVariableCreateObjectVariable6 != solverVariable2) {
                                                linearSystem.addGreaterThan(solverVariable2, solverVariableCreateObjectVariable4, margin2, 5);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    i15 = 6;
                                    z16 = true;
                                    i16 = 4;
                                    i17 = 5;
                                    z17 = true;
                                    z18 = false;
                                }
                                if (z17 && solverVariableCreateObjectVariable5 == solverVariableCreateObjectVariable6 && constraintWidget6 != parent) {
                                    z17 = false;
                                    z19 = false;
                                } else {
                                    z19 = true;
                                }
                                if (z16) {
                                    if (z14 || z7 || z9 || solverVariableCreateObjectVariable5 != solverVariable || solverVariableCreateObjectVariable6 != solverVariable2) {
                                        i24 = i15;
                                        z20 = z19;
                                        i19 = i17;
                                        z21 = z2;
                                    } else {
                                        z21 = false;
                                        i19 = 8;
                                        i24 = 8;
                                        z20 = false;
                                    }
                                    i18 = i9;
                                    constraintWidget = parent;
                                    linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable4, constraintAnchor2.getMargin(), i24);
                                } else {
                                    i18 = i9;
                                    constraintWidget = parent;
                                    z20 = z19;
                                    i19 = i17;
                                    z21 = z2;
                                }
                                if (this.mVisibility == 8 && !constraintAnchor2.hasDependents()) {
                                    return;
                                }
                                if (z17) {
                                    int i40 = (!z21 || solverVariableCreateObjectVariable5 == solverVariableCreateObjectVariable6 || z14 || !((constraintWidget6 instanceof Barrier) || (constraintWidget7 instanceof Barrier))) ? i19 : 6;
                                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), i40);
                                    solverVariable3 = solverVariableCreateObjectVariable4;
                                    linearSystem.addLowerThan(solverVariable3, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), i40);
                                    i19 = i40;
                                } else {
                                    solverVariable3 = solverVariableCreateObjectVariable4;
                                }
                                if (!z21 || !z10 || (constraintWidget6 instanceof Barrier) || (constraintWidget7 instanceof Barrier)) {
                                    constraintWidget2 = constraintWidget;
                                } else {
                                    constraintWidget2 = constraintWidget;
                                    if (constraintWidget7 != constraintWidget2) {
                                        iMin2 = 6;
                                        i20 = 6;
                                        z20 = true;
                                    }
                                    if (z20) {
                                        if (z18 && (!z9 || z3)) {
                                            if (constraintWidget6 != constraintWidget2 || constraintWidget7 == constraintWidget2) {
                                                i23 = 6;
                                            } else {
                                                i23 = iMin2;
                                            }
                                            if ((constraintWidget6 instanceof Guideline) || (constraintWidget7 instanceof Guideline)) {
                                                i23 = 5;
                                            }
                                            if ((constraintWidget6 instanceof Barrier) || (constraintWidget7 instanceof Barrier)) {
                                                i23 = 5;
                                            }
                                            if (z9) {
                                                i23 = 5;
                                            }
                                            iMin2 = Math.max(i23, iMin2);
                                        }
                                        if (z21) {
                                            iMin2 = Math.min(i20, iMin2);
                                            if (z6 && !z9 && (constraintWidget6 == constraintWidget2 || constraintWidget7 == constraintWidget2)) {
                                                iMin2 = 4;
                                            }
                                        }
                                        linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), iMin2);
                                        linearSystem.addEquality(solverVariable3, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), iMin2);
                                    }
                                    if (z21) {
                                        if (solverVariable == solverVariableCreateObjectVariable5) {
                                            margin = constraintAnchor.getMargin();
                                        } else {
                                            margin = 0;
                                        }
                                        if (solverVariableCreateObjectVariable5 != solverVariable) {
                                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, margin, 5);
                                        }
                                    }
                                    if (z21 || !z14) {
                                        solverVariableCreateObjectVariable4 = solverVariable3;
                                    } else {
                                        solverVariableCreateObjectVariable4 = solverVariable3;
                                        if (i3 == 0 && i11 == 0) {
                                            if (z14 && i18 == 3) {
                                                i22 = 0;
                                                linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 8);
                                                i21 = 5;
                                            } else {
                                                i22 = 0;
                                                i21 = 5;
                                                linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 5);
                                            }
                                        }
                                    }
                                    i21 = 5;
                                    i22 = 0;
                                }
                                iMin2 = i16;
                                i20 = i19;
                                if (z20) {
                                    if (z18) {
                                        if (constraintWidget6 != constraintWidget2) {
                                            i23 = 6;
                                        } else {
                                            i23 = 6;
                                        }
                                        if (constraintWidget6 instanceof Guideline) {
                                            i23 = 5;
                                        } else {
                                            i23 = 5;
                                        }
                                        if (constraintWidget6 instanceof Barrier) {
                                            i23 = 5;
                                        } else {
                                            i23 = 5;
                                        }
                                        if (z9) {
                                            i23 = 5;
                                        }
                                        iMin2 = Math.max(i23, iMin2);
                                    }
                                    if (z21) {
                                        iMin2 = Math.min(i20, iMin2);
                                        if (z6) {
                                            iMin2 = 4;
                                        }
                                    }
                                    linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), iMin2);
                                    linearSystem.addEquality(solverVariable3, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), iMin2);
                                }
                                if (z21) {
                                    if (solverVariable == solverVariableCreateObjectVariable5) {
                                        margin = constraintAnchor.getMargin();
                                    } else {
                                        margin = 0;
                                    }
                                    if (solverVariableCreateObjectVariable5 != solverVariable) {
                                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, margin, 5);
                                    }
                                }
                                if (z21) {
                                    solverVariableCreateObjectVariable4 = solverVariable3;
                                    i21 = 5;
                                    i22 = 0;
                                } else {
                                    solverVariableCreateObjectVariable4 = solverVariable3;
                                    i21 = 5;
                                    i22 = 0;
                                }
                            }
                            i35 = i21;
                        } else {
                            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), 8);
                            if (z2) {
                                if (this.OPTIMIZE_WRAP && solverVariableCreateObjectVariable3.isFinalValue && (constraintWidget3 = this.mParent) != null) {
                                    ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget3;
                                    if (z) {
                                        constraintWidgetContainer.addHorizontalWrapMinVariable(constraintAnchor);
                                    } else {
                                        constraintWidgetContainer.addVerticalWrapMinVariable(constraintAnchor);
                                    }
                                } else {
                                    i21 = 5;
                                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, 0, 5);
                                    i22 = 0;
                                }
                            }
                        }
                        i22 = 0;
                        i21 = 5;
                    } else {
                        z21 = z2;
                        i22 = 0;
                        i35 = (z2 && (constraintAnchor.mTarget.mOwner instanceof Barrier)) ? 8 : 5;
                        solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                    }
                    if (z21 || !z15) {
                        return;
                    }
                    int margin3 = constraintAnchor2.mTarget != null ? constraintAnchor2.getMargin() : i22;
                    if (solverVariableCreateObjectVariable6 != solverVariable2) {
                        if (this.OPTIMIZE_WRAP && solverVariableCreateObjectVariable4.isFinalValue && (constraintWidget4 = this.mParent) != null) {
                            ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget4;
                            if (z) {
                                constraintWidgetContainer2.addHorizontalWrapMaxVariable(constraintAnchor2);
                                return;
                            } else {
                                constraintWidgetContainer2.addVerticalWrapMaxVariable(constraintAnchor2);
                                return;
                            }
                        }
                        linearSystem.addGreaterThan(solverVariable2, solverVariableCreateObjectVariable4, margin3, i35);
                        return;
                    }
                    return;
                }
                i21 = 5;
                i22 = 0;
                z21 = z2;
                i35 = i21;
                if (z21) {
                    return;
                } else {
                    return;
                }
            }
            if (z5) {
                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 3);
                if (i3 > 0) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i3, 8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i4, 8);
                }
            } else {
                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
            }
            i12 = i8;
            i13 = i36;
            solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
            solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
            z14 = z12;
            solverVariableCreateObjectVariable6 = solverVariableCreateObjectVariable6;
            z15 = z4;
            i11 = i7;
            if (z11) {
                i14 = 0;
                c2 = 2;
            } else {
                i14 = 0;
                c2 = 2;
            }
            if (i13 >= c2) {
            }
        }
        i9 = i37;
        iMin = this.mWidthOverride;
        if (iMin == -1) {
            iMin = i2;
        } else {
            iMin = i2;
        }
        i10 = this.mHeightOverride;
        if (i10 != -1) {
            this.mHeightOverride = -1;
            iMin = i10;
            z12 = false;
        }
        if (this.mVisibility == 8) {
            iMin = 0;
            z12 = false;
        }
        if (z11) {
            if (zIsConnected) {
                if (zIsConnected) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
                }
            } else if (zIsConnected) {
                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
            }
        }
        if (!z12) {
            if (i36 == 2) {
            }
            if (i7 == -2) {
                i11 = iMin;
            } else {
                i11 = i7;
            }
            if (i8 == -2) {
                i12 = iMin;
            } else {
                i12 = i8;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i11 > 0) {
                linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i11, 8);
                iMin = Math.max(iMin, i11);
            }
            if (i12 > 0) {
                if (z2) {
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i12, 8);
                } else {
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i12, 8);
                }
                iMin = Math.min(iMin, i12);
            }
            if (i9 == 1) {
                if (z2) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                } else if (z8) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                } else {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                }
                i13 = i36;
                solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                z14 = z12;
                solverVariableCreateObjectVariable6 = solverVariableCreateObjectVariable6;
                z15 = z4;
                i11 = i11;
            } else {
                if (i9 == 2) {
                    if (constraintAnchor.getType() != ConstraintAnchor.Type.TOP) {
                        solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.TOP));
                        solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                    } else {
                        solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.TOP));
                        solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                    }
                    SolverVariable solverVariable5 = solverVariableCreateObjectVariable;
                    ArrayRow arrayRowCreateRow2 = linearSystem.createRow();
                    i13 = i36 == true ? 1 : 0;
                    linearSystem.addConstraint(arrayRowCreateRow2.createRowDimensionRatio(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, solverVariable5, f2));
                    if (z2) {
                        z12 = false;
                    }
                    z13 = z4;
                } else {
                    i13 = i36;
                    z13 = true;
                }
                z14 = z12;
                z15 = z13;
            }
            if (z11) {
                i14 = 0;
                c2 = 2;
            } else {
                i14 = 0;
                c2 = 2;
            }
            if (i13 >= c2) {
            }
        }
        if (z5) {
            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 3);
            if (i3 > 0) {
                linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i3, 8);
            }
            if (i4 < Integer.MAX_VALUE) {
                linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i4, 8);
            }
        } else {
            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
        }
        i12 = i8;
        i13 = i36;
        solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
        solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
        z14 = z12;
        solverVariableCreateObjectVariable6 = solverVariableCreateObjectVariable6;
        z15 = z4;
        i11 = i7;
        if (z11) {
            i14 = 0;
            c2 = 2;
        } else {
            i14 = 0;
            c2 = 2;
        }
        if (i13 >= c2) {
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z) {
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z && (horizontalWidgetRun = this.horizontalRun) != null && horizontalWidgetRun.start.resolved && this.horizontalRun.end.resolved) {
            objectVariableValue = this.horizontalRun.start.value;
            objectVariableValue3 = this.horizontalRun.end.value;
        }
        if (z && (verticalWidgetRun = this.verticalRun) != null && verticalWidgetRun.start.resolved && this.verticalRun.end.resolved) {
            objectVariableValue2 = this.verticalRun.start.value;
            objectVariableValue4 = this.verticalRun.end.value;
        }
        if (objectVariableValue3 - objectVariableValue < 0 || objectVariableValue4 - objectVariableValue2 < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.hasBaseline = constraintWidget.hasBaseline;
        this.inPlaceholder = constraintWidget.inPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : map.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.mX = constraintWidget.mX;
        this.mY = constraintWidget.mY;
        this.mRelX = constraintWidget.mRelX;
        this.mRelY = constraintWidget.mRelY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
        this.mVisibility = constraintWidget.mVisibility;
        this.mAnimated = constraintWidget.mAnimated;
        this.mDebugName = constraintWidget.mDebugName;
        this.mType = constraintWidget.mType;
        this.mDistToTop = constraintWidget.mDistToTop;
        this.mDistToLeft = constraintWidget.mDistToLeft;
        this.mDistToRight = constraintWidget.mDistToRight;
        this.mDistToBottom = constraintWidget.mDistToBottom;
        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
        this.mRightHasCentered = constraintWidget.mRightHasCentered;
        this.mTopHasCentered = constraintWidget.mTopHasCentered;
        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget2 == null ? null : map.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.mVerticalNextWidget;
        this.mVerticalNextWidget = constraintWidget3 != null ? map.get(constraintWidget3) : null;
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean zIsResolved = z & this.horizontalRun.isResolved();
        boolean zIsResolved2 = z2 & this.verticalRun.isResolved();
        int i3 = this.horizontalRun.start.value;
        int i4 = this.verticalRun.start.value;
        int i5 = this.horizontalRun.end.value;
        int i6 = this.verticalRun.end.value;
        if (i5 - i3 < 0 || i6 - i4 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i7 = i5 - i3;
        int i8 = i6 - i4;
        if (zIsResolved) {
            this.mX = i3;
        }
        if (zIsResolved2) {
            this.mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (zIsResolved) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i7 < (i2 = this.mWidth)) {
                i7 = i2;
            }
            this.mWidth = i7;
            int i9 = this.mMinWidth;
            if (i7 < i9) {
                this.mWidth = i9;
            }
        }
        if (zIsResolved2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i8 < (i = this.mHeight)) {
                i8 = i;
            }
            this.mHeight = i8;
            int i10 = this.mMinHeight;
            if (i8 < i10) {
                this.mHeight = i10;
            }
        }
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.checkMatchParent(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                Iterator<ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                Iterator<ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            Iterator<ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            Iterator<ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            Iterator<ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    public void getSceneString(StringBuilder sb) {
        sb.append("  " + this.stringId + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.mWidth);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.mHeight);
        sb.append("\n");
        sb.append("    actualLeft:" + this.mX);
        sb.append("\n");
        sb.append("    actualTop:" + this.mY);
        sb.append("\n");
        getSceneString(sb, "left", this.mLeft);
        getSceneString(sb, Constant.MAP_KEY_TOP, this.mTop);
        getSceneString(sb, "right", this.mRight);
        getSceneString(sb, "bottom", this.mBottom);
        getSceneString(sb, "baseline", this.mBaseline);
        getSceneString(sb, "centerX", this.mCenterX);
        getSceneString(sb, "centerY", this.mCenterY);
        getSceneString(sb, "    width", this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        getSceneString(sb, "    height", this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        serializeDimensionRatio(sb, "    dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb, "    horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb, "    horizontalChainStyle", this.mHorizontalChainStyle, 0);
        serializeAttribute(sb, "    verticalChainStyle", this.mVerticalChainStyle, 0);
        sb.append("  }");
    }

    private void getSceneString(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        serializeAttribute(sb, "      size", i, 0);
        serializeAttribute(sb, "      min", i2, 0);
        serializeAttribute(sb, "      max", i3, Integer.MAX_VALUE);
        serializeAttribute(sb, "      matchMin", i5, 0);
        serializeAttribute(sb, "      matchDef", i6, 0);
        serializeAttribute(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    private void getSceneString(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("'");
        if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE || constraintAnchor.mMargin != 0) {
            sb.append(",");
            sb.append(constraintAnchor.mMargin);
            if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.mGoneMargin);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }
}
