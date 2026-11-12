package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.i;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import defpackage.euf;
import defpackage.mg2;
import defpackage.u4j;
import defpackage.uf4;
import defpackage.xf4;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static androidx.constraintlayout.widget.b sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected uf4 mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.a mConstraintSet;
    private int mConstraintSetId;
    private xf4 mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected d mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    b mMeasurer;
    private euf mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2006a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f2006a = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2006a[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2006a[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2006a[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class b implements mg2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintLayout f2007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2008b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public b(ConstraintLayout constraintLayout) {
            this.f2007a = constraintLayout;
        }

        @Override // mg2.b
        @SuppressLint({"WrongCall"})
        public final void a(ConstraintWidget constraintWidget, mg2.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int iMakeMeasureSpec3;
            int i;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.X() == 8 && !constraintWidget.l0()) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                return;
            }
            if (constraintWidget.M() == null) {
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f26125a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f26126b;
            int i2 = aVar.c;
            int i3 = aVar.d;
            int i4 = this.f2008b + this.c;
            int i5 = this.d;
            View view = (View) constraintWidget.u();
            int[] iArr = a.f2006a;
            int i6 = iArr[dimensionBehaviour.ordinal()];
            if (i6 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else if (i6 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
            } else if (i6 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5 + constraintWidget.D(), -1);
            } else if (i6 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
                boolean z = constraintWidget.w == 1;
                int i7 = aVar.j;
                if (i7 == mg2.a.l || i7 == mg2.a.m) {
                    boolean z2 = view.getMeasuredHeight() == constraintWidget.z();
                    if (aVar.j == mg2.a.m || !z || ((z && z2) || (view instanceof Placeholder) || constraintWidget.p0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.Y(), 1073741824);
                    }
                }
            }
            int i8 = iArr[dimensionBehaviour2.ordinal()];
            if (i8 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i8 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
            } else if (i8 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4 + constraintWidget.W(), -1);
            } else if (i8 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
                boolean z3 = constraintWidget.x == 1;
                int i9 = aVar.j;
                if (i9 == mg2.a.l || i9 == mg2.a.m) {
                    boolean z4 = view.getMeasuredWidth() == constraintWidget.Y();
                    if (aVar.j == mg2.a.m || !z3 || ((z3 && z4) || (view instanceof Placeholder) || constraintWidget.q0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.z(), 1073741824);
                    }
                }
            }
            d dVar = (d) constraintWidget.M();
            if (dVar != null && g.b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == constraintWidget.Y() && view.getMeasuredWidth() < dVar.Y() && view.getMeasuredHeight() == constraintWidget.z() && view.getMeasuredHeight() < dVar.z() && view.getBaseline() == constraintWidget.r() && !constraintWidget.o0() && d(constraintWidget.E(), iMakeMeasureSpec, constraintWidget.Y()) && d(constraintWidget.F(), iMakeMeasureSpec2, constraintWidget.z())) {
                aVar.e = constraintWidget.Y();
                aVar.f = constraintWidget.z();
                aVar.g = constraintWidget.r();
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z5 = dimensionBehaviour == dimensionBehaviour3;
            boolean z6 = dimensionBehaviour2 == dimensionBehaviour3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            boolean z7 = dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z8 = dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z9 = z5 && constraintWidget.f0 > 0.0f;
            boolean z10 = z6 && constraintWidget.f0 > 0.0f;
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i10 = aVar.j;
            if (i10 != mg2.a.l && i10 != mg2.a.m && z5 && constraintWidget.w == 0 && z6 && constraintWidget.x == 0) {
                i = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof VirtualLayout) && (constraintWidget instanceof i)) {
                    ((VirtualLayout) view).x((i) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                constraintWidget.Z0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i11 = constraintWidget.z;
                iMax = i11 > 0 ? Math.max(i11, measuredWidth) : measuredWidth;
                int i12 = constraintWidget.A;
                if (i12 > 0) {
                    iMax = Math.min(i12, iMax);
                }
                int i13 = constraintWidget.C;
                iMax2 = i13 > 0 ? Math.max(i13, measuredHeight) : measuredHeight;
                int i14 = constraintWidget.D;
                if (i14 > 0) {
                    iMax2 = Math.min(i14, iMax2);
                }
                if (!g.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (z9 && z7) {
                        iMax = (int) ((iMax2 * constraintWidget.f0) + 0.5f);
                    } else if (z10 && z8) {
                        iMax2 = (int) ((iMax / constraintWidget.f0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec3 = iMakeMeasureSpec;
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    iMakeMeasureSpec3 = iMakeMeasureSpec;
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    constraintWidget.Z0(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i = -1;
            }
            boolean z11 = baseline != i;
            aVar.i = (iMax == aVar.c && iMax2 == aVar.d) ? false : true;
            if (layoutParams.g0) {
                z11 = true;
            }
            if (z11 && baseline != -1 && constraintWidget.r() != baseline) {
                aVar.i = true;
            }
            aVar.e = iMax;
            aVar.f = iMax2;
            aVar.h = z11;
            aVar.g = baseline;
        }

        @Override // mg2.b
        public final void b() {
            int childCount = this.f2007a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2007a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).b(this.f2007a);
                }
            }
            int size = this.f2007a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.f2007a.mConstraintHelpers.get(i2)).s(this.f2007a);
                }
            }
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2008b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }

        public final boolean d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static androidx.constraintlayout.widget.b getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new androidx.constraintlayout.widget.b();
        }
        return sSharedValues;
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((LayoutParams) viewFindViewById.getLayoutParams()).v0;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.F0(this);
        this.mLayoutWidget.a2(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u4j.x1, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == u4j.H1) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == u4j.I1) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == u4j.F1) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == u4j.G1) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == u4j.v3) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == u4j.q2) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == u4j.U1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.mConstraintSet = aVar;
                        aVar.L(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.b2(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.v0();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).G0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.a aVar = this.mConstraintSet;
        if (aVar != null) {
            aVar.k(this, true);
        }
        this.mLayoutWidget.y1();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).v(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).c(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.a(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray, int i, ConstraintAnchor.Type type) {
        View view = this.mChildrenByIds.get(i);
        ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.g0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.g0 = true;
            layoutParams2.v0.O0(true);
        }
        constraintWidget.q(type2).b(constraintWidget2.q(type), layoutParams.D, layoutParams.C, true);
        constraintWidget.O0(true);
        constraintWidget.q(ConstraintAnchor.Type.TOP).q();
        constraintWidget.q(ConstraintAnchor.Type.BOTTOM).q();
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    public void applyConstraintsFromLayoutParams(boolean z, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        int i;
        layoutParams.c();
        layoutParams.w0 = false;
        constraintWidget.n1(view.getVisibility());
        if (layoutParams.j0) {
            constraintWidget.X0(true);
            constraintWidget.n1(8);
        }
        constraintWidget.F0(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).q(constraintWidget, this.mLayoutWidget.U1());
        }
        if (layoutParams.h0) {
            f fVar = (f) constraintWidget;
            int i2 = layoutParams.s0;
            int i3 = layoutParams.t0;
            float f = layoutParams.u0;
            if (f != -1.0f) {
                fVar.D1(f);
                return;
            } else if (i2 != -1) {
                fVar.B1(i2);
                return;
            } else {
                if (i3 != -1) {
                    fVar.C1(i3);
                    return;
                }
                return;
            }
        }
        int i4 = layoutParams.l0;
        int i5 = layoutParams.m0;
        int i6 = layoutParams.n0;
        int i7 = layoutParams.o0;
        int i8 = layoutParams.p0;
        int i9 = layoutParams.q0;
        float f2 = layoutParams.r0;
        int i10 = layoutParams.p;
        if (i10 != -1) {
            ConstraintWidget constraintWidget6 = sparseArray.get(i10);
            if (constraintWidget6 != null) {
                constraintWidget.m(constraintWidget6, layoutParams.f2004r, layoutParams.q);
            }
        } else {
            if (i4 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray.get(i4);
                if (constraintWidget7 != null) {
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                    constraintWidget.g0(type, constraintWidget7, type, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
                }
            } else if (i5 != -1 && (constraintWidget2 = sparseArray.get(i5)) != null) {
                constraintWidget.g0(ConstraintAnchor.Type.LEFT, constraintWidget2, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
            }
            if (i6 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i6);
                if (constraintWidget8 != null) {
                    constraintWidget.g0(ConstraintAnchor.Type.RIGHT, constraintWidget8, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
                }
            } else if (i7 != -1 && (constraintWidget3 = sparseArray.get(i7)) != null) {
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.g0(type2, constraintWidget3, type2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
            }
            int i11 = layoutParams.i;
            if (i11 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i11);
                if (constraintWidget9 != null) {
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                    constraintWidget.g0(type3, constraintWidget9, type3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.x);
                }
            } else {
                int i12 = layoutParams.j;
                if (i12 != -1 && (constraintWidget4 = sparseArray.get(i12)) != null) {
                    constraintWidget.g0(ConstraintAnchor.Type.TOP, constraintWidget4, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.x);
                }
            }
            int i13 = layoutParams.f2003k;
            if (i13 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i13);
                if (constraintWidget10 != null) {
                    constraintWidget.g0(ConstraintAnchor.Type.BOTTOM, constraintWidget10, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.z);
                }
            } else {
                int i14 = layoutParams.l;
                if (i14 != -1 && (constraintWidget5 = sparseArray.get(i14)) != null) {
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.g0(type4, constraintWidget5, type4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.z);
                }
            }
            int i15 = layoutParams.m;
            if (i15 != -1) {
                setWidgetBaseline(constraintWidget, layoutParams, sparseArray, i15, ConstraintAnchor.Type.BASELINE);
            } else {
                int i16 = layoutParams.n;
                if (i16 != -1) {
                    setWidgetBaseline(constraintWidget, layoutParams, sparseArray, i16, ConstraintAnchor.Type.TOP);
                } else {
                    int i17 = layoutParams.o;
                    if (i17 != -1) {
                        setWidgetBaseline(constraintWidget, layoutParams, sparseArray, i17, ConstraintAnchor.Type.BOTTOM);
                    }
                }
            }
            if (f2 >= 0.0f) {
                constraintWidget.Q0(f2);
            }
            float f3 = layoutParams.H;
            if (f3 >= 0.0f) {
                constraintWidget.h1(f3);
            }
        }
        if (z && ((i = layoutParams.X) != -1 || layoutParams.Y != -1)) {
            constraintWidget.f1(i, layoutParams.Y);
        }
        if (layoutParams.e0) {
            constraintWidget.T0(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.o1(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                constraintWidget.T0(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.a0) {
                constraintWidget.T0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget.T0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget.q(ConstraintAnchor.Type.LEFT).g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            constraintWidget.q(ConstraintAnchor.Type.RIGHT).g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            constraintWidget.T0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.o1(0);
        }
        if (layoutParams.f0) {
            constraintWidget.k1(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.P0(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                constraintWidget.k1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.b0) {
                constraintWidget.k1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget.k1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget.q(ConstraintAnchor.Type.TOP).g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            constraintWidget.q(ConstraintAnchor.Type.BOTTOM).g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            constraintWidget.k1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.P0(0);
        }
        constraintWidget.H0(layoutParams.I);
        constraintWidget.V0(layoutParams.L);
        constraintWidget.m1(layoutParams.M);
        constraintWidget.R0(layoutParams.N);
        constraintWidget.i1(layoutParams.O);
        constraintWidget.p1(layoutParams.d0);
        constraintWidget.U0(layoutParams.P, layoutParams.R, layoutParams.T, layoutParams.V);
        constraintWidget.l1(layoutParams.Q, layoutParams.S, layoutParams.U, layoutParams.W);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).t(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(MenuBuilder.CATEGORY_MASK);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(euf eufVar) {
        this.mLayoutWidget.M1(eufVar);
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.O1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.o = "parent";
            }
        }
        if (this.mLayoutWidget.v() == null) {
            d dVar = this.mLayoutWidget;
            dVar.G0(dVar.o);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" setDebugName ");
            sb2.append(this.mLayoutWidget.v());
        }
        for (ConstraintWidget constraintWidget : this.mLayoutWidget.v1()) {
            View view = (View) constraintWidget.u();
            if (view != null) {
                if (constraintWidget.o == null && (id = view.getId()) != -1) {
                    constraintWidget.o = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.v() == null) {
                    constraintWidget.G0(constraintWidget.o);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" setDebugName ");
                    sb3.append(constraintWidget.v());
                }
            }
        }
        this.mLayoutWidget.Q(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).v0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new uf4(getContext(), this, i);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.v0;
            if ((childAt.getVisibility() != 8 || layoutParams.h0 || layoutParams.i0 || layoutParams.k0 || zIsInEditMode) && !layoutParams.j0) {
                int iZ = constraintWidget.Z();
                int iA0 = constraintWidget.a0();
                int iY = constraintWidget.Y() + iZ;
                int iZ2 = constraintWidget.z() + iA0;
                childAt.layout(iZ, iA0, iY, iZ2);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iZ, iA0, iY, iZ2);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).r(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOnMeasureWidthMeasureSpec == i) {
            int i3 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.d2(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.f2();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.Y(), this.mLayoutWidget.z(), this.mLayoutWidget.V1(), this.mLayoutWidget.T1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof f)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            f fVar = new f();
            layoutParams.v0 = fVar;
            layoutParams.h0 = true;
            fVar.E1(layoutParams.Z);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.w();
            ((LayoutParams) view.getLayoutParams()).i0 = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.x1(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new uf4(getContext(), this, i);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        b bVar = this.mMeasurer;
        int i5 = bVar.e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + bVar.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void resolveSystem(d dVar, int i, int i2, int i3) {
        int iMax;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax2 = Math.max(0, getPaddingTop());
        int iMax3 = Math.max(0, getPaddingBottom());
        int i4 = iMax2 + iMax3;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.c(i2, i3, iMax2, iMax3, paddingWidth, i4);
        int iMax4 = Math.max(0, getPaddingStart());
        int iMax5 = Math.max(0, getPaddingEnd());
        if (iMax4 > 0 || iMax5 > 0) {
            iMax = isRtl() ? iMax5 : iMax4;
        } else {
            iMax = Math.max(0, getPaddingLeft());
        }
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(dVar, mode, i5, mode2, i6);
        dVar.W1(i, mode, i5, mode2, i6, this.mLastMeasureWidth, this.mLastMeasureHeight, iMax, iMax2);
    }

    public void setConstraintSet(androidx.constraintlayout.widget.a aVar) {
        this.mConstraintSet = aVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(xf4 xf4Var) {
        uf4 uf4Var = this.mConstraintLayoutSpec;
        if (uf4Var != null) {
            uf4Var.c(xf4Var);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.b2(i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
      (r2v3 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
      (r2v0 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
     binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(d dVar, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        b bVar = this.mMeasurer;
        int i5 = bVar.e;
        int i6 = bVar.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        } else if (i == 0) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            i2 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i != 1073741824) {
            dimensionBehaviour = dimensionBehaviour2;
        } else {
            i2 = Math.min(this.mMaxWidth - i6, i2);
            dimensionBehaviour = dimensionBehaviour2;
        }
        if (i3 == Integer.MIN_VALUE) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        } else if (i3 == 0) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            } else {
                i4 = 0;
            }
        } else if (i3 != 1073741824) {
            i4 = 0;
        } else {
            i4 = Math.min(this.mMaxHeight - i5, i4);
        }
        if (i2 != dVar.Y() || i4 != dVar.z()) {
            dVar.S1();
        }
        dVar.q1(0);
        dVar.r1(0);
        dVar.b1(this.mMaxWidth - i6);
        dVar.a1(this.mMaxHeight - i5);
        dVar.e1(0);
        dVar.d1(0);
        dVar.T0(dimensionBehaviour);
        dVar.o1(i2);
        dVar.k1(dimensionBehaviour2);
        dVar.P0(i4);
        dVar.e1(this.mMinWidth - i6);
        dVar.d1(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        uf4 uf4Var = this.mConstraintLayoutSpec;
        if (uf4Var != null) {
            uf4Var.d(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean F;
        public float G;
        public float H;
        public String I;
        public float J;
        public int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2001a;
        public boolean a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2002b;
        public boolean b0;
        public float c;
        public String c0;
        public boolean d;
        public int d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public boolean g0;
        public int h;
        public boolean h0;
        public int i;
        public boolean i0;
        public int j;
        public boolean j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2003k;
        public boolean k0;
        public int l;
        public int l0;
        public int m;
        public int m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public int p0;
        public int q;
        public int q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f2004r;
        public float r0;
        public int s;
        public int s0;
        public int t;
        public int t0;
        public int u;
        public float u0;
        public int v;
        public ConstraintWidget v0;
        public int w;
        public boolean w0;
        public int x;
        public int y;
        public int z;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f2005a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2005a = sparseIntArray;
                sparseIntArray.append(u4j.g3, 64);
                sparseIntArray.append(u4j.J2, 65);
                sparseIntArray.append(u4j.S2, 8);
                sparseIntArray.append(u4j.T2, 9);
                sparseIntArray.append(u4j.V2, 10);
                sparseIntArray.append(u4j.W2, 11);
                sparseIntArray.append(u4j.c3, 12);
                sparseIntArray.append(u4j.b3, 13);
                sparseIntArray.append(u4j.z2, 14);
                sparseIntArray.append(u4j.y2, 15);
                sparseIntArray.append(u4j.u2, 16);
                sparseIntArray.append(u4j.w2, 52);
                sparseIntArray.append(u4j.v2, 53);
                sparseIntArray.append(u4j.A2, 2);
                sparseIntArray.append(u4j.C2, 3);
                sparseIntArray.append(u4j.B2, 4);
                sparseIntArray.append(u4j.l3, 49);
                sparseIntArray.append(u4j.m3, 50);
                sparseIntArray.append(u4j.G2, 5);
                sparseIntArray.append(u4j.H2, 6);
                sparseIntArray.append(u4j.I2, 7);
                sparseIntArray.append(u4j.p2, 67);
                sparseIntArray.append(u4j.y1, 1);
                sparseIntArray.append(u4j.X2, 17);
                sparseIntArray.append(u4j.Y2, 18);
                sparseIntArray.append(u4j.F2, 19);
                sparseIntArray.append(u4j.E2, 20);
                sparseIntArray.append(u4j.q3, 21);
                sparseIntArray.append(u4j.t3, 22);
                sparseIntArray.append(u4j.r3, 23);
                sparseIntArray.append(u4j.o3, 24);
                sparseIntArray.append(u4j.s3, 25);
                sparseIntArray.append(u4j.p3, 26);
                sparseIntArray.append(u4j.n3, 55);
                sparseIntArray.append(u4j.u3, 54);
                sparseIntArray.append(u4j.O2, 29);
                sparseIntArray.append(u4j.d3, 30);
                sparseIntArray.append(u4j.D2, 44);
                sparseIntArray.append(u4j.Q2, 45);
                sparseIntArray.append(u4j.f3, 46);
                sparseIntArray.append(u4j.P2, 47);
                sparseIntArray.append(u4j.e3, 48);
                sparseIntArray.append(u4j.s2, 27);
                sparseIntArray.append(u4j.r2, 28);
                sparseIntArray.append(u4j.h3, 31);
                sparseIntArray.append(u4j.K2, 32);
                sparseIntArray.append(u4j.j3, 33);
                sparseIntArray.append(u4j.i3, 34);
                sparseIntArray.append(u4j.k3, 35);
                sparseIntArray.append(u4j.M2, 36);
                sparseIntArray.append(u4j.L2, 37);
                sparseIntArray.append(u4j.N2, 38);
                sparseIntArray.append(u4j.R2, 39);
                sparseIntArray.append(u4j.a3, 40);
                sparseIntArray.append(u4j.U2, 41);
                sparseIntArray.append(u4j.x2, 42);
                sparseIntArray.append(u4j.t2, 43);
                sparseIntArray.append(u4j.Z2, 51);
                sparseIntArray.append(u4j.w3, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2001a = -1;
            this.f2002b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.f2003k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.f2004r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new ConstraintWidget();
            this.w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4j.x1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = a.f2005a.get(index);
                switch (i2) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f2004r) % 360.0f;
                        this.f2004r = f;
                        if (f < 0.0f) {
                            this.f2004r = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f2001a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2001a);
                        break;
                    case 6:
                        this.f2002b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2002b);
                        break;
                    case 7:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2003k);
                        this.f2003k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2003k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.a0);
                        break;
                    case 28:
                        this.b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.b0);
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        this.P = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.Q = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                androidx.constraintlayout.widget.a.Q(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        androidx.constraintlayout.widget.a.O(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.a.O(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.d0 = typedArrayObtainStyledAttributes.getInt(index, this.d0);
                                        break;
                                    case 67:
                                        this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            c();
        }

        public String a() {
            return this.c0;
        }

        public ConstraintWidget b() {
            return this.v0;
        }

        public void c() {
            this.h0 = false;
            this.e0 = true;
            this.f0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.a0) {
                this.e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.b0) {
                this.f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.e0 = false;
                if (i == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f0 = false;
                if (i2 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.b0 = true;
                }
            }
            if (this.c == -1.0f && this.f2001a == -1 && this.f2002b == -1) {
                return;
            }
            this.h0 = true;
            this.e0 = true;
            this.f0 = true;
            if (!(this.v0 instanceof f)) {
                this.v0 = new f();
            }
            ((f) this.v0).E1(this.Z);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.n0 = -1;
            this.o0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.p0 = this.w;
            this.q0 = this.y;
            float f = this.G;
            this.r0 = f;
            int i8 = this.f2001a;
            this.s0 = i8;
            int i9 = this.f2002b;
            this.t0 = i9;
            float f2 = this.c;
            this.u0 = f2;
            if (z2) {
                int i10 = this.s;
                if (i10 != -1) {
                    this.n0 = i10;
                } else {
                    int i11 = this.t;
                    if (i11 != -1) {
                        this.o0 = i11;
                    } else {
                        i2 = this.u;
                        if (i2 != -1) {
                            this.m0 = i2;
                            z = true;
                        }
                        i3 = this.v;
                        if (i3 != -1) {
                            this.l0 = i3;
                            z = true;
                        }
                        i4 = this.A;
                        if (i4 != Integer.MIN_VALUE) {
                            this.q0 = i4;
                        }
                        i5 = this.B;
                        if (i5 != Integer.MIN_VALUE) {
                            this.p0 = i5;
                        }
                        if (z) {
                            this.r0 = 1.0f - f;
                        }
                        if (this.h0 && this.Z == 1 && this.d) {
                            if (f2 != -1.0f) {
                                this.u0 = 1.0f - f2;
                                this.s0 = -1;
                                this.t0 = -1;
                            } else if (i8 != -1) {
                                this.t0 = i8;
                                this.s0 = -1;
                                this.u0 = -1.0f;
                            } else if (i9 != -1) {
                                this.s0 = i9;
                                this.t0 = -1;
                                this.u0 = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.u;
                if (i2 != -1) {
                    this.m0 = i2;
                    z = true;
                }
                i3 = this.v;
                if (i3 != -1) {
                    this.l0 = i3;
                    z = true;
                }
                i4 = this.A;
                if (i4 != Integer.MIN_VALUE) {
                    this.q0 = i4;
                }
                i5 = this.B;
                if (i5 != Integer.MIN_VALUE) {
                    this.p0 = i5;
                }
                if (z) {
                    this.r0 = 1.0f - f;
                }
                if (this.h0) {
                    if (f2 != -1.0f) {
                        this.u0 = 1.0f - f2;
                        this.s0 = -1;
                        this.t0 = -1;
                    } else if (i8 != -1) {
                        this.t0 = i8;
                        this.s0 = -1;
                        this.u0 = -1.0f;
                    } else if (i9 != -1) {
                        this.s0 = i9;
                        this.t0 = -1;
                        this.u0 = -1.0f;
                    }
                }
            } else {
                int i12 = this.s;
                if (i12 != -1) {
                    this.m0 = i12;
                }
                int i13 = this.t;
                if (i13 != -1) {
                    this.l0 = i13;
                }
                int i14 = this.u;
                if (i14 != -1) {
                    this.n0 = i14;
                }
                int i15 = this.v;
                if (i15 != -1) {
                    this.o0 = i15;
                }
                int i16 = this.A;
                if (i16 != Integer.MIN_VALUE) {
                    this.p0 = i16;
                }
                int i17 = this.B;
                if (i17 != Integer.MIN_VALUE) {
                    this.q0 = i17;
                }
            }
            if (this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
                int i18 = this.g;
                if (i18 != -1) {
                    this.n0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.h;
                    if (i19 != -1) {
                        this.o0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.e;
                if (i20 != -1) {
                    this.l0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f;
                if (i21 != -1) {
                    this.m0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2001a = -1;
            this.f2002b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.f2003k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.f2004r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new ConstraintWidget();
            this.w0 = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2001a = -1;
            this.f2002b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.f2003k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.f2004r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new ConstraintWidget();
            this.w0 = false;
        }
    }
}
