package defpackage;

import com.facebook.react.uimanager.NativeKind;
import com.facebook.react.uimanager.e;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class pej implements oej<pej> {
    private static final i0s sYogaConfig = zfj.a();
    private ArrayList<pej> mChildren;
    private Integer mHeightMeasureSpec;
    private boolean mIsLayoutOnly;
    private pej mLayoutParent;
    private ArrayList<pej> mNativeChildren;
    private pej mNativeParent;
    private final float[] mPadding;
    private pej mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    private g9p mThemedContext;
    private String mViewClassName;
    private Integer mWidthMeasureSpec;
    private l0s mYogaNode;
    private boolean mNodeUpdated = true;
    private int mTotalNativeChildren = 0;
    private final boolean[] mPaddingIsPercent = new boolean[9];
    private final y4n mDefaultPadding = new y4n(0.0f);

    public pej() {
        float[] fArr = new float[9];
        this.mPadding = fArr;
        if (isVirtual()) {
            this.mYogaNode = null;
            return;
        }
        l0s l0sVarAcquire = n0s.a().acquire();
        l0sVarAcquire = l0sVarAcquire == null ? l0s.c(sYogaConfig) : l0sVarAcquire;
        this.mYogaNode = l0sVarAcquire;
        l0sVarAcquire.B(this);
        Arrays.fill(fArr, Float.NaN);
    }

    private void getHierarchyInfoWithIndentation(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(" view='");
        sb.append(getViewClass());
        sb.append("' tag=");
        sb.append(getReactTag());
        if (this.mYogaNode != null) {
            sb.append(" layout='x:");
            sb.append(getScreenX());
            sb.append(" y:");
            sb.append(getScreenY());
            sb.append(" w:");
            sb.append(getLayoutWidth());
            sb.append(" h:");
            sb.append(getLayoutHeight());
            sb.append("'");
        } else {
            sb.append("(virtual node)");
        }
        sb.append(">\n");
        if (getChildCount() == 0) {
            return;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).getHierarchyInfoWithIndentation(sb, i + 1);
        }
    }

    private int getTotalNativeNodeContributionToParent() {
        NativeKind nativeKind = getNativeKind();
        if (nativeKind == NativeKind.NONE) {
            return this.mTotalNativeChildren;
        }
        if (nativeKind == NativeKind.LEAF) {
            return this.mTotalNativeChildren + 1;
        }
        return 1;
    }

    private void updateNativeChildrenCountInParent(int i) {
        if (getNativeKind() != NativeKind.PARENT) {
            for (pej parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.mTotalNativeChildren += i;
                if (parent.getNativeKind() == NativeKind.PARENT) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    private void updatePadding() {
        for (int i = 0; i <= 8; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 5) {
                if (j0s.a(this.mPadding[i]) && j0s.a(this.mPadding[6]) && j0s.a(this.mPadding[8])) {
                    this.mYogaNode.e0(YogaEdge.fromInt(i), this.mDefaultPadding.b(i));
                } else if (this.mPaddingIsPercent[i]) {
                    this.mYogaNode.f0(YogaEdge.fromInt(i), this.mPadding[i]);
                } else {
                    this.mYogaNode.e0(YogaEdge.fromInt(i), this.mPadding[i]);
                }
            } else if (i == 1 || i == 3) {
                if (j0s.a(this.mPadding[i]) && j0s.a(this.mPadding[7]) && j0s.a(this.mPadding[8])) {
                    this.mYogaNode.e0(YogaEdge.fromInt(i), this.mDefaultPadding.b(i));
                } else if (this.mPaddingIsPercent[i]) {
                    this.mYogaNode.f0(YogaEdge.fromInt(i), this.mPadding[i]);
                } else {
                    this.mYogaNode.e0(YogaEdge.fromInt(i), this.mPadding[i]);
                }
            } else if (j0s.a(this.mPadding[i])) {
                this.mYogaNode.e0(YogaEdge.fromInt(i), this.mDefaultPadding.b(i));
            } else if (this.mPaddingIsPercent[i]) {
                this.mYogaNode.f0(YogaEdge.fromInt(i), this.mPadding[i]);
            } else {
                this.mYogaNode.e0(YogaEdge.fromInt(i), this.mPadding[i]);
            }
        }
    }

    @Override // defpackage.oej
    public void calculateLayout() {
        calculateLayout(Float.NaN, Float.NaN);
    }

    @Override // defpackage.oej
    public Iterable<? extends oej> calculateLayoutOnChildren() {
        if (isVirtualAnchor()) {
            return null;
        }
        return this.mChildren;
    }

    @Override // defpackage.oej
    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.d();
        } else if (getParent() != null) {
            getParent().dirty();
        }
    }

    @Override // defpackage.oej
    public boolean dispatchUpdates(float f, float f2, e eVar, aig aigVar) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(eVar);
        }
        boolean z = false;
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f3 = f + layoutX;
            int iRound = Math.round(f3);
            float f4 = f2 + layoutY;
            int iRound2 = Math.round(f4);
            int iRound3 = Math.round(f3 + getLayoutWidth());
            int iRound4 = Math.round(f4 + getLayoutHeight());
            int iRound5 = Math.round(layoutX);
            int iRound6 = Math.round(layoutY);
            int i = iRound3 - iRound;
            int i2 = iRound4 - iRound2;
            z = (iRound5 == this.mScreenX && iRound6 == this.mScreenY && i == this.mScreenWidth && i2 == this.mScreenHeight) ? false : true;
            this.mScreenX = iRound5;
            this.mScreenY = iRound6;
            this.mScreenWidth = i;
            this.mScreenHeight = i2;
            if (z) {
                if (aigVar != null) {
                    aigVar.l(this);
                } else {
                    eVar.L(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight());
                }
            }
        }
        return z;
    }

    @Override // defpackage.oej
    public void dispose() {
        l0s l0sVar = this.mYogaNode;
        if (l0sVar != null) {
            l0sVar.u();
            n0s.a().release(this.mYogaNode);
        }
    }

    @Override // defpackage.oej
    public final int getChildCount() {
        ArrayList<pej> arrayList = this.mChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // defpackage.oej
    public Integer getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    public String getHierarchyInfo() {
        StringBuilder sb = new StringBuilder();
        getHierarchyInfoWithIndentation(sb, 0);
        return sb.toString();
    }

    public final YogaDirection getLayoutDirection() {
        return this.mYogaNode.f();
    }

    @Override // defpackage.oej
    public final float getLayoutHeight() {
        return this.mYogaNode.g();
    }

    @Override // defpackage.oej
    public final float getLayoutWidth() {
        return this.mYogaNode.i();
    }

    @Override // defpackage.oej
    public final float getLayoutX() {
        return this.mYogaNode.j();
    }

    @Override // defpackage.oej
    public final float getLayoutY() {
        return this.mYogaNode.k();
    }

    @Override // defpackage.oej
    public final int getNativeChildCount() {
        ArrayList<pej> arrayList = this.mNativeChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // defpackage.oej
    public NativeKind getNativeKind() {
        if (isVirtual() || isLayoutOnly()) {
            return NativeKind.NONE;
        }
        return hoistNativeChildren() ? NativeKind.LEAF : NativeKind.PARENT;
    }

    @Override // defpackage.oej
    public final int getNativeOffsetForChild(pej pejVar) {
        int totalNativeNodeContributionToParent = 0;
        for (int i = 0; i < getChildCount(); i++) {
            pej childAt = getChildAt(i);
            if (pejVar == childAt) {
                return totalNativeNodeContributionToParent;
            }
            totalNativeNodeContributionToParent += childAt.getTotalNativeNodeContributionToParent();
        }
        throw new RuntimeException("Child " + pejVar.getReactTag() + " was not a child of " + this.mReactTag);
    }

    public final float getPadding(int i) {
        return this.mYogaNode.h(YogaEdge.fromInt(i));
    }

    @Override // defpackage.oej
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // defpackage.oej
    public final int getRootTag() {
        sk1.a(this.mRootTag != 0);
        return this.mRootTag;
    }

    @Override // defpackage.oej
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    @Override // defpackage.oej
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // defpackage.oej
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // defpackage.oej
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // defpackage.oej
    public final o0s getStyleHeight() {
        return this.mYogaNode.e();
    }

    public final o0s getStylePadding(int i) {
        return this.mYogaNode.l(YogaEdge.fromInt(i));
    }

    @Override // defpackage.oej
    public final o0s getStyleWidth() {
        return this.mYogaNode.n();
    }

    @Override // defpackage.oej
    public final g9p getThemedContext() {
        return (g9p) sk1.c(this.mThemedContext);
    }

    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // defpackage.oej
    public final String getViewClass() {
        return (String) sk1.c(this.mViewClassName);
    }

    @Override // defpackage.oej
    public Integer getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    public final boolean hasNewLayout() {
        l0s l0sVar = this.mYogaNode;
        return l0sVar != null && l0sVar.p();
    }

    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // defpackage.oej
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    public boolean hoistNativeChildren() {
        return false;
    }

    public final boolean isDirty() {
        l0s l0sVar = this.mYogaNode;
        return l0sVar != null && l0sVar.q();
    }

    @Override // defpackage.oej
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    public boolean isMeasureDefined() {
        return this.mYogaNode.r();
    }

    @Override // defpackage.oej
    public boolean isVirtual() {
        return false;
    }

    public boolean isVirtualAnchor() {
        return false;
    }

    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    public final void markLayoutSeen() {
        l0s l0sVar = this.mYogaNode;
        if (l0sVar != null) {
            l0sVar.s();
        }
    }

    @Override // defpackage.oej
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    public void markUpdated() {
        if (this.mNodeUpdated) {
            return;
        }
        this.mNodeUpdated = true;
        pej parent = getParent();
        if (parent != null) {
            parent.markUpdated();
        }
    }

    public void onAfterUpdateTransaction() {
    }

    @Override // defpackage.oej
    public void onBeforeLayout(aig aigVar) {
    }

    public void onCollectExtraUpdates(e eVar) {
    }

    @Override // defpackage.oej
    public final void removeAllNativeChildren() {
        ArrayList<pej> arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // defpackage.oej
    public void removeAndDisposeAllChildren() {
        if (getChildCount() == 0) {
            return;
        }
        int totalNativeNodeContributionToParent = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.t(childCount);
            }
            pej childAt = getChildAt(childCount);
            childAt.mParent = null;
            totalNativeNodeContributionToParent += childAt.getTotalNativeNodeContributionToParent();
            childAt.dispose();
        }
        ((ArrayList) sk1.c(this.mChildren)).clear();
        markUpdated();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
    }

    public void setAlignContent(YogaAlign yogaAlign) {
        this.mYogaNode.v(yogaAlign);
    }

    public void setAlignItems(YogaAlign yogaAlign) {
        this.mYogaNode.w(yogaAlign);
    }

    public void setAlignSelf(YogaAlign yogaAlign) {
        this.mYogaNode.x(yogaAlign);
    }

    public void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        this.mYogaNode.z(yogaBaselineFunction);
    }

    public void setBorder(int i, float f) {
        this.mYogaNode.A(YogaEdge.fromInt(i), f);
    }

    public void setDefaultPadding(int i, float f) {
        this.mDefaultPadding.d(i, f);
        updatePadding();
    }

    public void setDisplay(YogaDisplay yogaDisplay) {
        this.mYogaNode.D(yogaDisplay);
    }

    public void setFlex(float f) {
        this.mYogaNode.F(f);
    }

    public void setFlexBasis(float f) {
        this.mYogaNode.G(f);
    }

    public void setFlexBasisAuto() {
        this.mYogaNode.H();
    }

    public void setFlexBasisPercent(float f) {
        this.mYogaNode.I(f);
    }

    public void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        this.mYogaNode.J(yogaFlexDirection);
    }

    public void setFlexGrow(float f) {
        this.mYogaNode.K(f);
    }

    public void setFlexShrink(float f) {
        this.mYogaNode.L(f);
    }

    public void setFlexWrap(YogaWrap yogaWrap) {
        this.mYogaNode.m0(yogaWrap);
    }

    @Override // defpackage.oej
    public final void setIsLayoutOnly(boolean z) {
        sk1.b(getParent() == null, "Must remove from no opt parent first");
        sk1.b(this.mNativeParent == null, "Must remove from native parent first");
        sk1.b(getNativeChildCount() == 0, "Must remove all native children first");
        this.mIsLayoutOnly = z;
    }

    public void setJustifyContent(YogaJustify yogaJustify) {
        this.mYogaNode.Q(yogaJustify);
    }

    @Override // defpackage.oej
    public void setLayoutDirection(YogaDirection yogaDirection) {
        this.mYogaNode.C(yogaDirection);
    }

    @Override // defpackage.oej
    public void setLocalData(Object obj) {
    }

    public void setMargin(int i, float f) {
        this.mYogaNode.R(YogaEdge.fromInt(i), f);
    }

    public void setMarginAuto(int i) {
        this.mYogaNode.S(YogaEdge.fromInt(i));
    }

    public void setMarginPercent(int i, float f) {
        this.mYogaNode.T(YogaEdge.fromInt(i), f);
    }

    public void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        this.mYogaNode.Y(yogaMeasureFunction);
    }

    @Override // defpackage.oej
    public void setMeasureSpecs(int i, int i2) {
        this.mWidthMeasureSpec = Integer.valueOf(i);
        this.mHeightMeasureSpec = Integer.valueOf(i2);
    }

    public void setOverflow(YogaOverflow yogaOverflow) {
        this.mYogaNode.d0(yogaOverflow);
    }

    public void setPadding(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = false;
        updatePadding();
    }

    public void setPaddingPercent(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = !j0s.a(f);
        updatePadding();
    }

    public void setPosition(int i, float f) {
        this.mYogaNode.g0(YogaEdge.fromInt(i), f);
    }

    public void setPositionPercent(int i, float f) {
        this.mYogaNode.h0(YogaEdge.fromInt(i), f);
    }

    public void setPositionType(YogaPositionType yogaPositionType) {
        this.mYogaNode.i0(yogaPositionType);
    }

    @Override // defpackage.oej
    public void setReactTag(int i) {
        this.mReactTag = i;
    }

    @Override // defpackage.oej
    public final void setRootTag(int i) {
        this.mRootTag = i;
    }

    public void setShouldNotifyOnLayout(boolean z) {
        this.mShouldNotifyOnLayout = z;
    }

    public void setStyleAspectRatio(float f) {
        this.mYogaNode.y(f);
    }

    @Override // defpackage.oej
    public void setStyleHeight(float f) {
        this.mYogaNode.M(f);
    }

    public void setStyleHeightAuto() {
        this.mYogaNode.N();
    }

    public void setStyleHeightPercent(float f) {
        this.mYogaNode.O(f);
    }

    public void setStyleMaxHeight(float f) {
        this.mYogaNode.U(f);
    }

    public void setStyleMaxHeightPercent(float f) {
        this.mYogaNode.V(f);
    }

    public void setStyleMaxWidth(float f) {
        this.mYogaNode.W(f);
    }

    public void setStyleMaxWidthPercent(float f) {
        this.mYogaNode.X(f);
    }

    public void setStyleMinHeight(float f) {
        this.mYogaNode.Z(f);
    }

    public void setStyleMinHeightPercent(float f) {
        this.mYogaNode.a0(f);
    }

    public void setStyleMinWidth(float f) {
        this.mYogaNode.b0(f);
    }

    public void setStyleMinWidthPercent(float f) {
        this.mYogaNode.c0(f);
    }

    @Override // defpackage.oej
    public void setStyleWidth(float f) {
        this.mYogaNode.j0(f);
    }

    public void setStyleWidthAuto() {
        this.mYogaNode.k0();
    }

    public void setStyleWidthPercent(float f) {
        this.mYogaNode.l0(f);
    }

    @Override // defpackage.oej
    public void setThemedContext(g9p g9pVar) {
        this.mThemedContext = g9pVar;
    }

    @Override // defpackage.oej
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    @Override // defpackage.oej
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return "[" + this.mViewClassName + " " + getReactTag() + "]";
    }

    @Override // defpackage.oej
    public final void updateProperties(yej yejVar) {
        bvq.f(this, yejVar);
        onAfterUpdateTransaction();
    }

    @Override // defpackage.oej
    public void addChildAt(pej pejVar, int i) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i, pejVar);
        pejVar.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            l0s l0sVar = pejVar.mYogaNode;
            if (l0sVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + pejVar.toString() + "' to a '" + toString() + "')");
            }
            this.mYogaNode.a(l0sVar, i);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = pejVar.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren += totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(totalNativeNodeContributionToParent);
    }

    @Override // defpackage.oej
    public final void addNativeChildAt(pej pejVar, int i) {
        sk1.a(getNativeKind() == NativeKind.PARENT);
        sk1.a(pejVar.getNativeKind() != NativeKind.NONE);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i, pejVar);
        pejVar.mNativeParent = this;
    }

    @Override // defpackage.oej
    public final pej getChildAt(int i) {
        ArrayList<pej> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    @Override // defpackage.oej
    public final pej getLayoutParent() {
        pej pejVar = this.mLayoutParent;
        return pejVar != null ? pejVar : getNativeParent();
    }

    @Override // defpackage.oej
    public final pej getNativeParent() {
        return this.mNativeParent;
    }

    @Override // defpackage.oej
    public final pej getParent() {
        return this.mParent;
    }

    @Override // defpackage.oej
    public final int indexOf(pej pejVar) {
        ArrayList<pej> arrayList = this.mChildren;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(pejVar);
    }

    @Override // defpackage.oej
    public final int indexOfNativeChild(pej pejVar) {
        sk1.c(this.mNativeChildren);
        return this.mNativeChildren.indexOf(pejVar);
    }

    @Override // defpackage.oej
    public boolean isDescendantOf(pej pejVar) {
        for (pej parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == pejVar) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oej
    public pej removeChildAt(int i) {
        ArrayList<pej> arrayList = this.mChildren;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
        }
        pej pejVarRemove = arrayList.remove(i);
        pejVarRemove.mParent = null;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            this.mYogaNode.t(i);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = pejVarRemove.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
        return pejVarRemove;
    }

    @Override // defpackage.oej
    public final pej removeNativeChildAt(int i) {
        sk1.c(this.mNativeChildren);
        pej pejVarRemove = this.mNativeChildren.remove(i);
        pejVarRemove.mNativeParent = null;
        return pejVarRemove;
    }

    @Override // defpackage.oej
    public final void setLayoutParent(pej pejVar) {
        this.mLayoutParent = pejVar;
    }

    @Override // defpackage.oej
    public void calculateLayout(float f, float f2) {
        this.mYogaNode.b(f, f2);
    }
}
