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
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static j sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.b> mConstraintHelpers;
    protected androidx.constraintlayout.widget.c mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.d mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected t6.f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private m6.e mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<d> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<t6.e> mTempMapIdToWidget;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6095a;

        static {
            int[] iArr = new int[t6.e.b.values().length];
            f6095a = iArr;
            try {
                iArr[t6.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6095a[t6.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6095a[t6.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6095a[t6.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements u6.b.InterfaceC3163b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f6140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6145f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6146g;

        public c(ConstraintLayout constraintLayout) {
            this.f6140a = constraintLayout;
        }

        public static boolean c(int i14, int i15, int i16) {
            if (i14 == i15) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i14);
            int mode2 = View.MeasureSpec.getMode(i15);
            int size = View.MeasureSpec.getSize(i15);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i16 == size;
            }
            return false;
        }

        @Override // u6.b.InterfaceC3163b
        @SuppressLint({"WrongCall"})
        public final void a(t6.e eVar, u6.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            int iMax2;
            boolean z14;
            int baseline;
            int i14;
            int childMeasureSpec;
            if (eVar == null) {
                return;
            }
            t6.d dVar = eVar.N;
            t6.d dVar2 = eVar.L;
            if (eVar.f162623k0 == 8 && !eVar.H) {
                aVar.f168787e = 0;
                aVar.f168788f = 0;
                aVar.f168789g = 0;
                return;
            }
            if (eVar.X == null) {
                return;
            }
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (constraintLayout.mMetrics != null) {
                constraintLayout.mMetrics.getClass();
                System.nanoTime();
            }
            t6.e.b bVar = aVar.f168783a;
            t6.e.b bVar2 = aVar.f168784b;
            int i15 = aVar.f168785c;
            int i16 = aVar.f168786d;
            int i17 = this.f6141b + this.f6142c;
            int i18 = this.f6143d;
            View view2 = (View) eVar.f162621j0;
            int[] iArr = a.f6095a;
            int i19 = iArr[bVar.ordinal()];
            if (i19 != 1) {
                if (i19 == 2) {
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6145f, i18, -2);
                } else if (i19 == 3) {
                    int i24 = this.f6145f;
                    int i25 = dVar2 != null ? dVar2.f162589g : 0;
                    if (dVar != null) {
                        i25 += dVar.f162589g;
                    }
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i24, i18 + i25, -1);
                } else if (i19 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6145f, i18, -2);
                    boolean z15 = eVar.f162640t == 1;
                    int i26 = aVar.f168792j;
                    if (i26 == 1 || i26 == 2) {
                        boolean z16 = view2.getMeasuredHeight() == eVar.m();
                        if (aVar.f168792j == 2 || !z15 || ((z15 && z16) || (view2 instanceof g) || eVar.C())) {
                            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.s(), 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec = childMeasureSpec;
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            }
            int i27 = iArr[bVar2.ordinal()];
            if (i27 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
            } else if (i27 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f6146g, i17, -2);
            } else if (i27 == 3) {
                int i28 = this.f6146g;
                int i29 = dVar2 != null ? eVar.M.f162589g : 0;
                if (dVar != null) {
                    i29 += eVar.O.f162589g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i28, i17 + i29, -1);
            } else if (i27 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f6146g, i17, -2);
                boolean z17 = eVar.f162642u == 1;
                int i30 = aVar.f168792j;
                if (i30 == 1 || i30 == 2) {
                    boolean z18 = view2.getMeasuredWidth() == eVar.s();
                    if (aVar.f168792j == 2 || !z17 || ((z17 && z18) || (view2 instanceof g) || eVar.D())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.m(), 1073741824);
                    }
                }
            }
            t6.f fVar = (t6.f) eVar.X;
            if (fVar != null && t6.j.b(constraintLayout.mOptimizationLevel, 256) && view2.getMeasuredWidth() == eVar.s() && view2.getMeasuredWidth() < fVar.s() && view2.getMeasuredHeight() == eVar.m() && view2.getMeasuredHeight() < fVar.m() && view2.getBaseline() == eVar.f162611e0 && !eVar.B() && c(eVar.J, iMakeMeasureSpec, eVar.s()) && c(eVar.K, iMakeMeasureSpec2, eVar.m())) {
                aVar.f168787e = eVar.s();
                aVar.f168788f = eVar.m();
                aVar.f168789g = eVar.f162611e0;
                return;
            }
            t6.e.b bVar3 = t6.e.b.MATCH_CONSTRAINT;
            boolean z19 = bVar == bVar3;
            boolean z24 = bVar2 == bVar3;
            t6.e.b bVar4 = t6.e.b.MATCH_PARENT;
            boolean z25 = bVar2 == bVar4 || bVar2 == t6.e.b.FIXED;
            boolean z26 = bVar == bVar4 || bVar == t6.e.b.FIXED;
            boolean z27 = z19 && eVar.f162603a0 > 0.0f;
            boolean z28 = z24 && eVar.f162603a0 > 0.0f;
            if (view2 == null) {
                return;
            }
            b bVar5 = (b) view2.getLayoutParams();
            int i34 = aVar.f168792j;
            if (i34 != 1 && i34 != 2 && z19 && eVar.f162640t == 0 && z24 && eVar.f162642u == 0) {
                i14 = -1;
                z14 = false;
                baseline = 0;
                iMax = 0;
                iMax2 = 0;
            } else {
                if ((view2 instanceof l) && (eVar instanceof t6.l)) {
                    ((l) view2).n((t6.l) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.J = iMakeMeasureSpec;
                eVar.K = iMakeMeasureSpec2;
                eVar.f162614g = false;
                int measuredWidth = view2.getMeasuredWidth();
                int measuredHeight = view2.getMeasuredHeight();
                int baseline2 = view2.getBaseline();
                int i35 = eVar.f162646w;
                iMax = i35 > 0 ? Math.max(i35, measuredWidth) : measuredWidth;
                int i36 = eVar.f162647x;
                if (i36 > 0) {
                    iMax = Math.min(i36, iMax);
                }
                int i37 = eVar.f162649z;
                iMax2 = i37 > 0 ? Math.max(i37, measuredHeight) : measuredHeight;
                int i38 = eVar.A;
                if (i38 > 0) {
                    iMax2 = Math.min(i38, iMax2);
                }
                int i39 = iMakeMeasureSpec2;
                if (!t6.j.b(constraintLayout.mOptimizationLevel, 1)) {
                    if (z27 && z25) {
                        iMax = (int) ((iMax2 * eVar.f162603a0) + 0.5f);
                    } else if (z28 && z26) {
                        iMax2 = (int) ((iMax / eVar.f162603a0) + 0.5f);
                    }
                }
                if (measuredWidth == iMax && measuredHeight == iMax2) {
                    baseline = baseline2;
                    i14 = -1;
                    z14 = false;
                } else {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i39;
                    view2.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    eVar.J = iMakeMeasureSpec;
                    eVar.K = iMakeMeasureSpec3;
                    z14 = false;
                    eVar.f162614g = false;
                    int measuredWidth2 = view2.getMeasuredWidth();
                    int measuredHeight2 = view2.getMeasuredHeight();
                    baseline = view2.getBaseline();
                    iMax = measuredWidth2;
                    iMax2 = measuredHeight2;
                    i14 = -1;
                }
            }
            boolean z29 = baseline != i14 ? true : z14;
            aVar.f168791i = (iMax == aVar.f168785c && iMax2 == aVar.f168786d) ? z14 : true;
            if (bVar5.f6101c0) {
                z29 = true;
            }
            if (z29 && baseline != -1 && eVar.f162611e0 != baseline) {
                aVar.f168791i = true;
            }
            aVar.f168787e = iMax;
            aVar.f168788f = iMax2;
            aVar.f168790h = z29;
            aVar.f168789g = baseline;
            if (constraintLayout.mMetrics != null) {
                System.nanoTime();
                constraintLayout.mMetrics.getClass();
            }
        }

        @Override // u6.b.InterfaceC3163b
        public final void b() {
            ConstraintLayout constraintLayout = this.f6140a;
            int childCount = constraintLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = constraintLayout.getChildAt(i14);
                if (childAt instanceof g) {
                    g gVar = (g) childAt;
                    if (gVar.f6307b != null) {
                        b bVar = (b) gVar.getLayoutParams();
                        b bVar2 = (b) gVar.f6307b.getLayoutParams();
                        t6.e eVar = bVar2.f6129q0;
                        eVar.f162623k0 = 0;
                        t6.e eVar2 = bVar.f6129q0;
                        t6.e.b bVar3 = eVar2.W[0];
                        t6.e.b bVar4 = t6.e.b.FIXED;
                        if (bVar3 != bVar4) {
                            eVar2.T(eVar.s());
                        }
                        t6.e eVar3 = bVar.f6129q0;
                        if (eVar3.W[1] != bVar4) {
                            eVar3.O(bVar2.f6129q0.m());
                        }
                        bVar2.f6129q0.f162623k0 = 8;
                    }
                }
            }
            int size = constraintLayout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i15 = 0; i15 < size; i15++) {
                    ((androidx.constraintlayout.widget.b) constraintLayout.mConstraintHelpers.get(i15)).getClass();
                }
            }
        }
    }

    public interface d {
        boolean a();
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new t6.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = TsExtractor.TS_STREAM_TYPE_AIT;
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
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static j getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new j();
        }
        return sSharedValues;
    }

    private t6.e getTargetWidget(int i14) {
        if (i14 == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i14);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i14)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f6129q0;
    }

    private void init(AttributeSet attributeSet, int i14, int i15) {
        t6.f fVar = this.mLayoutWidget;
        fVar.f162621j0 = this;
        c cVar = this.mMeasurer;
        fVar.A0 = cVar;
        fVar.f162657y0.f168800f = cVar;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f6310b, i14, i15);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i16 = 0; i16 < indexCount; i16++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i16);
                if (index == 16) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        this.mConstraintSet = dVar;
                        dVar.m(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        t6.f fVar2 = this.mLayoutWidget;
        fVar2.K0 = this.mOptimizationLevel;
        m6.d.f116819q = fVar2.d0(512);
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
        String str;
        int iG;
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            t6.e viewWidget = getViewWidget(getChildAt(i14));
            if (viewWidget != null) {
                viewWidget.E();
            }
        }
        if (zIsInEditMode) {
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).f162627m0 = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt2 = getChildAt(i16);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof e)) {
                    this.mConstraintSet = ((e) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.d dVar = this.mConstraintSet;
        if (dVar != null) {
            dVar.c(this);
        }
        this.mLayoutWidget.f162695w0.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i17 = 0; i17 < size; i17++) {
                androidx.constraintlayout.widget.b bVar = this.mConstraintHelpers.get(i17);
                HashMap<Integer, String> map = bVar.f6173h;
                if (bVar.isInEditMode()) {
                    bVar.setIds(bVar.f6170e);
                }
                t6.i iVar = bVar.f6169d;
                if (iVar != null) {
                    iVar.Y();
                    for (int i18 = 0; i18 < bVar.f6167b; i18++) {
                        int i19 = bVar.f6166a[i18];
                        View viewById = getViewById(i19);
                        if (viewById == null && (iG = bVar.g(this, (str = map.get(Integer.valueOf(i19))))) != 0) {
                            bVar.f6166a[i18] = iG;
                            map.put(Integer.valueOf(iG), str);
                            viewById = getViewById(iG);
                        }
                        if (viewById != null) {
                            bVar.f6169d.W(getViewWidget(viewById));
                        }
                    }
                    bVar.f6169d.Z();
                }
            }
        }
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt3 = getChildAt(i24);
            if (childAt3 instanceof g) {
                g gVar = (g) childAt3;
                if (gVar.f6306a == -1 && !gVar.isInEditMode()) {
                    gVar.setVisibility(gVar.f6308c);
                }
                View viewFindViewById = findViewById(gVar.f6306a);
                gVar.f6307b = viewFindViewById;
                if (viewFindViewById != null) {
                    ((b) viewFindViewById.getLayoutParams()).f6107f0 = true;
                    gVar.f6307b.setVisibility(0);
                    gVar.setVisibility(0);
                }
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt5 = getChildAt(i26);
            t6.e viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                b bVar2 = (b) childAt5.getLayoutParams();
                this.mLayoutWidget.W(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, bVar2, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(t6.e eVar, b bVar, SparseArray<t6.e> sparseArray, int i14, t6.d.a aVar) {
        View view2 = this.mChildrenByIds.get(i14);
        t6.e eVar2 = sparseArray.get(i14);
        if (eVar2 == null || view2 == null || !(view2.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f6101c0 = true;
        t6.d.a aVar2 = t6.d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view2.getLayoutParams();
            bVar2.f6101c0 = true;
            bVar2.f6129q0.G = true;
        }
        eVar.k(aVar2).b(eVar2.k(aVar), bVar.D, bVar.C, true);
        eVar.G = true;
        eVar.k(t6.d.a.TOP).j();
        eVar.k(t6.d.a.BOTTOM).j();
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z14 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            if (getChildAt(i14).isLayoutRequested()) {
                z14 = true;
                break;
            }
        }
        if (z14) {
            setChildrenConstraints();
        }
        return z14;
    }

    public void addValueModifier(d dVar) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0184  */
    /* JADX WARN: Code duplicated, block: B:81:0x018c  */
    public void applyConstraintsFromLayoutParams(boolean z14, View view2, t6.e eVar, b bVar, SparseArray<t6.e> sparseArray) {
        t6.e eVar2;
        t6.e eVar3;
        t6.e eVar4;
        t6.e eVar5;
        b bVar2;
        t6.e eVar6;
        float f14;
        int i14;
        t6.e eVar7 = eVar;
        bVar.a();
        eVar7.f162623k0 = view2.getVisibility();
        if (bVar.f6107f0) {
            eVar7.H = true;
            eVar7.f162623k0 = 8;
        }
        eVar7.f162621j0 = view2;
        if (view2 instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view2).k(eVar7, this.mLayoutWidget.B0);
        }
        if (bVar.f6103d0) {
            t6.h hVar = (t6.h) eVar7;
            int i15 = bVar.f6123n0;
            int i16 = bVar.f6125o0;
            float f15 = bVar.f6127p0;
            if (f15 != -1.0f) {
                if (f15 > -1.0f) {
                    hVar.f162685w0 = f15;
                    hVar.f162686x0 = -1;
                    hVar.f162687y0 = -1;
                    return;
                }
                return;
            }
            if (i15 != -1) {
                if (i15 > -1) {
                    hVar.f162685w0 = -1.0f;
                    hVar.f162686x0 = i15;
                    hVar.f162687y0 = -1;
                    return;
                }
                return;
            }
            if (i16 == -1 || i16 <= -1) {
                return;
            }
            hVar.f162685w0 = -1.0f;
            hVar.f162686x0 = -1;
            hVar.f162687y0 = i16;
            return;
        }
        int i17 = bVar.f6109g0;
        int i18 = bVar.f6111h0;
        int i19 = bVar.f6113i0;
        int i24 = bVar.f6115j0;
        int i25 = bVar.f6117k0;
        int i26 = bVar.f6119l0;
        float f16 = bVar.f6121m0;
        int i27 = bVar.f6126p;
        if (i27 != -1) {
            t6.e eVar8 = sparseArray.get(i27);
            if (eVar8 != null) {
                float f17 = bVar.f6130r;
                int i28 = bVar.f6128q;
                t6.d.a aVar = t6.d.a.CENTER;
                eVar.x(aVar, eVar8, aVar, i28, 0);
                eVar7 = eVar;
                eVar7.F = f17;
            }
            eVar6 = eVar7;
            bVar2 = bVar;
        } else {
            if (i17 != -1) {
                t6.e eVar9 = sparseArray.get(i17);
                if (eVar9 != null) {
                    t6.d.a aVar2 = t6.d.a.LEFT;
                    eVar.x(aVar2, eVar9, aVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i25);
                }
            } else if (i18 != -1 && (eVar2 = sparseArray.get(i18)) != null) {
                eVar.x(t6.d.a.LEFT, eVar2, t6.d.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i25);
            }
            if (i19 != -1) {
                t6.e eVar10 = sparseArray.get(i19);
                if (eVar10 != null) {
                    eVar.x(t6.d.a.RIGHT, eVar10, t6.d.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i26);
                }
            } else if (i24 != -1 && (eVar3 = sparseArray.get(i24)) != null) {
                t6.d.a aVar3 = t6.d.a.RIGHT;
                eVar.x(aVar3, eVar3, aVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i26);
            }
            int i29 = bVar.f6112i;
            if (i29 != -1) {
                t6.e eVar11 = sparseArray.get(i29);
                if (eVar11 != null) {
                    t6.d.a aVar4 = t6.d.a.TOP;
                    eVar.x(aVar4, eVar11, aVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f6136x);
                }
            } else {
                int i30 = bVar.f6114j;
                if (i30 != -1 && (eVar4 = sparseArray.get(i30)) != null) {
                    eVar.x(t6.d.a.TOP, eVar4, t6.d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f6136x);
                }
            }
            int i34 = bVar.f6116k;
            if (i34 != -1) {
                t6.e eVar12 = sparseArray.get(i34);
                if (eVar12 != null) {
                    eVar.x(t6.d.a.BOTTOM, eVar12, t6.d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f6138z);
                }
            } else {
                int i35 = bVar.f6118l;
                if (i35 != -1 && (eVar5 = sparseArray.get(i35)) != null) {
                    t6.d.a aVar5 = t6.d.a.BOTTOM;
                    eVar.x(aVar5, eVar5, aVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f6138z);
                }
            }
            int i36 = bVar.f6120m;
            if (i36 != -1) {
                bVar2 = bVar;
                setWidgetBaseline(eVar, bVar2, sparseArray, i36, t6.d.a.BASELINE);
            } else {
                bVar2 = bVar;
                int i37 = bVar2.f6122n;
                if (i37 != -1) {
                    setWidgetBaseline(eVar, bVar2, sparseArray, i37, t6.d.a.TOP);
                } else {
                    int i38 = bVar2.f6124o;
                    if (i38 != -1) {
                        setWidgetBaseline(eVar, bVar2, sparseArray, i38, t6.d.a.BOTTOM);
                        eVar6 = eVar;
                    }
                    if (f16 >= 0.0f) {
                        eVar6.f162617h0 = f16;
                    }
                    f14 = bVar2.F;
                    if (f14 >= 0.0f) {
                        eVar6.f162619i0 = f14;
                    }
                }
            }
            eVar6 = eVar;
            if (f16 >= 0.0f) {
                eVar6.f162617h0 = f16;
            }
            f14 = bVar2.F;
            if (f14 >= 0.0f) {
                eVar6.f162619i0 = f14;
            }
        }
        if (z14 && ((i14 = bVar2.T) != -1 || bVar2.U != -1)) {
            int i39 = bVar2.U;
            eVar6.f162607c0 = i14;
            eVar6.f162609d0 = i39;
        }
        if (bVar2.f6097a0) {
            eVar6.P(t6.e.b.FIXED);
            eVar6.T(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                eVar6.P(t6.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.W) {
                eVar6.P(t6.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.P(t6.e.b.MATCH_PARENT);
            }
            eVar6.k(t6.d.a.LEFT).f162589g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            eVar6.k(t6.d.a.RIGHT).f162589g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            eVar6.P(t6.e.b.MATCH_CONSTRAINT);
            eVar6.T(0);
        }
        if (bVar2.f6099b0) {
            eVar6.R(t6.e.b.FIXED);
            eVar6.O(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                eVar6.R(t6.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.X) {
                eVar6.R(t6.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.R(t6.e.b.MATCH_PARENT);
            }
            eVar6.k(t6.d.a.TOP).f162589g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            eVar6.k(t6.d.a.BOTTOM).f162589g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            eVar6.R(t6.e.b.MATCH_CONSTRAINT);
            eVar6.O(0);
        }
        eVar6.L(bVar2.G);
        float f18 = bVar2.H;
        float[] fArr = eVar6.f162633p0;
        fArr[0] = f18;
        fArr[1] = bVar2.I;
        eVar6.f162629n0 = bVar2.J;
        eVar6.f162631o0 = bVar2.K;
        int i44 = bVar2.Z;
        if (i44 >= 0 && i44 <= 3) {
            eVar6.f162638s = i44;
        }
        eVar6.Q(bVar2.L, bVar2.R, bVar2.N, bVar2.P);
        eVar6.S(bVar2.M, bVar2.S, bVar2.O, bVar2.Q);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.mConstraintHelpers.get(i14).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i16 = Integer.parseInt(strArrSplit[0]);
                        int i17 = Integer.parseInt(strArrSplit[1]);
                        int i18 = Integer.parseInt(strArrSplit[2]);
                        int i19 = (int) ((i16 / 1080.0f) * width);
                        int i24 = (int) ((i17 / 1920.0f) * height);
                        int i25 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f14 = i19;
                        float f15 = i24;
                        float f16 = i19 + ((int) ((i18 / 1080.0f) * width));
                        canvas.drawLine(f14, f15, f16, f15, paint);
                        float f17 = i24 + i25;
                        canvas.drawLine(f16, f15, f16, f17, paint);
                        canvas.drawLine(f16, f17, f14, f17, paint);
                        canvas.drawLine(f14, f17, f14, f15, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f14, f15, f16, f17, paint);
                        canvas.drawLine(f14, f17, f16, f15, paint);
                    }
                }
            }
        }
    }

    public boolean dynamicUpdateConstraints(int i14, int i15) {
        boolean zA = false;
        if (this.mModifiers == null) {
            return false;
        }
        View.MeasureSpec.getSize(i14);
        View.MeasureSpec.getSize(i15);
        for (d dVar : this.mModifiers) {
            Iterator<t6.e> it = this.mLayoutWidget.f162695w0.iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next().f162621j0;
                view2.getId();
                zA |= dVar.a();
            }
        }
        return zA;
    }

    public void fillMetrics(m6.e eVar) {
        this.mMetrics = eVar;
        t6.f fVar = this.mLayoutWidget;
        fVar.C0 = eVar;
        fVar.D0.getClass();
        m6.d.f116820r = eVar;
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object getDesignInformation(int i14, Object obj) {
        if (i14 != 0 || !(obj instanceof String)) {
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
        return this.mLayoutWidget.K0;
    }

    public String getSceneString() {
        int id3;
        StringBuilder sb3 = new StringBuilder();
        if (this.mLayoutWidget.f162624l == null) {
            int id4 = getId();
            if (id4 != -1) {
                this.mLayoutWidget.f162624l = getContext().getResources().getResourceEntryName(id4);
            } else {
                this.mLayoutWidget.f162624l = "parent";
            }
        }
        t6.f fVar = this.mLayoutWidget;
        if (fVar.f162627m0 == null) {
            fVar.f162627m0 = fVar.f162624l;
        }
        for (t6.e eVar : fVar.f162695w0) {
            View view2 = (View) eVar.f162621j0;
            if (view2 != null) {
                if (eVar.f162624l == null && (id3 = view2.getId()) != -1) {
                    eVar.f162624l = getContext().getResources().getResourceEntryName(id3);
                }
                if (eVar.f162627m0 == null) {
                    eVar.f162627m0 = eVar.f162624l;
                }
            }
        }
        this.mLayoutWidget.p(sb3);
        return sb3.toString();
    }

    public View getViewById(int i14) {
        return this.mChildrenByIds.get(i14);
    }

    public final t6.e getViewWidget(View view2) {
        if (view2 == this) {
            return this.mLayoutWidget;
        }
        if (view2 == null) {
            return null;
        }
        if (view2.getLayoutParams() instanceof b) {
            return ((b) view2.getLayoutParams()).f6129q0;
        }
        view2.setLayoutParams(generateLayoutParams(view2.getLayoutParams()));
        if (view2.getLayoutParams() instanceof b) {
            return ((b) view2.getLayoutParams()).f6129q0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i14) {
        if (i14 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i14);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            b bVar = (b) childAt.getLayoutParams();
            t6.e eVar = bVar.f6129q0;
            if ((childAt.getVisibility() != 8 || bVar.f6103d0 || bVar.f6105e0 || zIsInEditMode) && !bVar.f6107f0) {
                int iT = eVar.t();
                int iU = eVar.u();
                int iS = eVar.s() + iT;
                int iM = eVar.m() + iU;
                childAt.layout(iT, iU, iS, iM);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iT, iU, iS, iM);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i19 = 0; i19 < size; i19++) {
                this.mConstraintHelpers.get(i19).l();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        if (this.mMetrics != null) {
            System.nanoTime();
            m6.e eVar = this.mMetrics;
            getChildCount();
            eVar.getClass();
            this.mMetrics.getClass();
        }
        boolean zDynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i14, i15);
        this.mDirtyHierarchy = zDynamicUpdateConstraints;
        if (!zDynamicUpdateConstraints) {
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                if (getChildAt(i16).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i14;
        this.mOnMeasureHeightMeasureSpec = i15;
        this.mLayoutWidget.B0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                t6.f fVar = this.mLayoutWidget;
                fVar.f162656x0.c(fVar);
            }
        }
        t6.f fVar2 = this.mLayoutWidget;
        m6.e eVar2 = this.mMetrics;
        fVar2.C0 = eVar2;
        fVar2.D0.getClass();
        m6.d.f116820r = eVar2;
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i14, i15);
        int iS = this.mLayoutWidget.s();
        int iM = this.mLayoutWidget.m();
        t6.f fVar3 = this.mLayoutWidget;
        resolveMeasuredDimension(i14, i15, iS, iM, fVar3.L0, fVar3.M0);
        if (this.mMetrics != null) {
            System.nanoTime();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view2) {
        super.onViewAdded(view2);
        t6.e viewWidget = getViewWidget(view2);
        if ((view2 instanceof Guideline) && !(viewWidget instanceof t6.h)) {
            b bVar = (b) view2.getLayoutParams();
            t6.h hVar = new t6.h();
            bVar.f6129q0 = hVar;
            bVar.f6103d0 = true;
            hVar.X(bVar.V);
        }
        if (view2 instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view2;
            bVar2.m();
            ((b) view2.getLayoutParams()).f6105e0 = true;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view2.getId(), view2);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view2) {
        super.onViewRemoved(view2);
        this.mChildrenByIds.remove(view2.getId());
        t6.e viewWidget = getViewWidget(view2);
        this.mLayoutWidget.f162695w0.remove(viewWidget);
        viewWidget.E();
        this.mConstraintHelpers.remove(view2);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i14) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i14);
    }

    public void removeValueModifier(d dVar) {
        if (dVar == null) {
            return;
        }
        this.mModifiers.remove(dVar);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i14, int i15, int i16, int i17, boolean z14, boolean z15) {
        c cVar = this.mMeasurer;
        int i18 = cVar.f6144e;
        int iResolveSizeAndState = View.resolveSizeAndState(i16 + cVar.f6143d, i14, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i17 + i18, i15, 0);
        int i19 = iResolveSizeAndState & FlexItem.MAX_SIZE;
        int i24 = iResolveSizeAndState2 & FlexItem.MAX_SIZE;
        int iMin = Math.min(this.mMaxWidth, i19);
        int iMin2 = Math.min(this.mMaxHeight, i24);
        if (z14) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z15) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void resolveSystem(t6.f fVar, int i14, int i15, int i16) {
        int mode = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i15);
        int mode2 = View.MeasureSpec.getMode(i16);
        int size2 = View.MeasureSpec.getSize(i16);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i17 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        c cVar = this.mMeasurer;
        cVar.f6141b = iMax;
        cVar.f6142c = iMax2;
        cVar.f6143d = paddingWidth;
        cVar.f6144e = i17;
        cVar.f6145f = i15;
        cVar.f6146g = i16;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 <= 0 && iMax4 <= 0) {
            iMax3 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            iMax3 = iMax4;
        }
        int i18 = size - paddingWidth;
        int i19 = size2 - i17;
        setSelfDimensionBehaviour(fVar, mode, i18, mode2, i19);
        fVar.b0(i14, mode, i18, mode2, i19, iMax3, iMax);
    }

    public void setConstraintSet(androidx.constraintlayout.widget.d dVar) {
        this.mConstraintSet = dVar;
    }

    public void setDesignInformation(int i14, Object obj, Object obj2) {
        if (i14 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i14) {
        this.mChildrenByIds.remove(getId());
        super.setId(i14);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i14) {
        if (i14 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i14;
        requestLayout();
    }

    public void setMaxWidth(int i14) {
        if (i14 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i14;
        requestLayout();
    }

    public void setMinHeight(int i14) {
        if (i14 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i14;
        requestLayout();
    }

    public void setMinWidth(int i14) {
        if (i14 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i14;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
    }

    public void setOptimizationLevel(int i14) {
        this.mOptimizationLevel = i14;
        t6.f fVar = this.mLayoutWidget;
        fVar.K0 = i14;
        m6.d.f116819q = fVar.d0(512);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 t6.e$b) = (r2v3 t6.e$b), (r2v0 t6.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(t6.f fVar, int i14, int i15, int i16, int i17) {
        t6.e.b bVar;
        c cVar = this.mMeasurer;
        int i18 = cVar.f6144e;
        int i19 = cVar.f6143d;
        t6.e.b bVar2 = t6.e.b.FIXED;
        int childCount = getChildCount();
        if (i14 == Integer.MIN_VALUE) {
            bVar = t6.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i15 = Math.max(0, this.mMinWidth);
            }
        } else if (i14 == 0) {
            bVar = t6.e.b.WRAP_CONTENT;
            i15 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i14 != 1073741824) {
            bVar = bVar2;
        } else {
            i15 = Math.min(this.mMaxWidth - i19, i15);
            bVar = bVar2;
        }
        if (i16 == Integer.MIN_VALUE) {
            bVar2 = t6.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i17 = Math.max(0, this.mMinHeight);
            }
        } else if (i16 == 0) {
            bVar2 = t6.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i17 = Math.max(0, this.mMinHeight);
            } else {
                i17 = 0;
            }
        } else if (i16 != 1073741824) {
            i17 = 0;
        } else {
            i17 = Math.min(this.mMaxHeight - i18, i17);
        }
        if (i15 != fVar.s() || i17 != fVar.m()) {
            fVar.f162657y0.f168797c = true;
        }
        fVar.f162607c0 = 0;
        fVar.f162609d0 = 0;
        int i24 = this.mMaxWidth - i19;
        int[] iArr = fVar.E;
        iArr[0] = i24;
        iArr[1] = this.mMaxHeight - i18;
        fVar.f162613f0 = 0;
        fVar.f162615g0 = 0;
        fVar.P(bVar);
        fVar.T(i15);
        fVar.R(bVar2);
        fVar.O(i17);
        int i25 = this.mMinWidth - i19;
        if (i25 < 0) {
            fVar.f162613f0 = 0;
        } else {
            fVar.f162613f0 = i25;
        }
        int i26 = this.mMinHeight - i18;
        if (i26 < 0) {
            fVar.f162615g0 = 0;
        } else {
            fVar.f162615g0 = i26;
        }
    }

    public void setState(int i14, int i15, int i16) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.b(i15, i16, i14);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new t6.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = TsExtractor.TS_STREAM_TYPE_AIT;
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
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new t6.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = TsExtractor.TS_STREAM_TYPE_AIT;
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
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i14, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new t6.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = TsExtractor.TS_STREAM_TYPE_AIT;
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
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i14, i15);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6096a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f6097a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6098b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f6099b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f6100c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public boolean f6101c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f6102d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public boolean f6103d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6104e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public boolean f6105e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6106f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public boolean f6107f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6108g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f6109g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6110h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f6111h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6112i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f6113i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6114j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f6115j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f6116k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int f6117k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f6118l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f6119l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f6120m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public float f6121m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f6122n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public int f6123n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f6124o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public int f6125o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f6126p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public float f6127p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f6128q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public t6.e f6129q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f6130r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f6131s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f6132t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f6133u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6134v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f6135w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f6136x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f6137y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f6138z;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f6139a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f6139a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }

            private a() {
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6096a = -1;
            this.f6098b = -1;
            this.f6100c = -1.0f;
            this.f6102d = true;
            this.f6104e = -1;
            this.f6106f = -1;
            this.f6108g = -1;
            this.f6110h = -1;
            this.f6112i = -1;
            this.f6114j = -1;
            this.f6116k = -1;
            this.f6118l = -1;
            this.f6120m = -1;
            this.f6122n = -1;
            this.f6124o = -1;
            this.f6126p = -1;
            this.f6128q = 0;
            this.f6130r = 0.0f;
            this.f6131s = -1;
            this.f6132t = -1;
            this.f6133u = -1;
            this.f6134v = -1;
            this.f6135w = Integer.MIN_VALUE;
            this.f6136x = Integer.MIN_VALUE;
            this.f6137y = Integer.MIN_VALUE;
            this.f6138z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f6097a0 = true;
            this.f6099b0 = true;
            this.f6101c0 = false;
            this.f6103d0 = false;
            this.f6105e0 = false;
            this.f6107f0 = false;
            this.f6109g0 = -1;
            this.f6111h0 = -1;
            this.f6113i0 = -1;
            this.f6115j0 = -1;
            this.f6117k0 = Integer.MIN_VALUE;
            this.f6119l0 = Integer.MIN_VALUE;
            this.f6121m0 = 0.5f;
            this.f6129q0 = new t6.e();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f6310b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                int i15 = a.f6139a.get(index);
                switch (i15) {
                    case 1:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f6126p);
                        this.f6126p = resourceId;
                        if (resourceId == -1) {
                            this.f6126p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f6128q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6128q);
                        break;
                    case 4:
                        float f14 = typedArrayObtainStyledAttributes.getFloat(index, this.f6130r) % 360.0f;
                        this.f6130r = f14;
                        if (f14 < 0.0f) {
                            this.f6130r = (360.0f - f14) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f6096a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6096a);
                        break;
                    case 6:
                        this.f6098b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6098b);
                        break;
                    case 7:
                        this.f6100c = typedArrayObtainStyledAttributes.getFloat(index, this.f6100c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6104e);
                        this.f6104e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f6104e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6106f);
                        this.f6106f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f6106f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6108g);
                        this.f6108g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f6108g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6110h);
                        this.f6110h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f6110h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6112i);
                        this.f6112i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f6112i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6114j);
                        this.f6114j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f6114j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6116k);
                        this.f6116k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f6116k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6118l);
                        this.f6118l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f6118l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6120m);
                        this.f6120m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f6120m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6131s);
                        this.f6131s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f6131s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6132t);
                        this.f6132t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f6132t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6133u);
                        this.f6133u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f6133u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6134v);
                        this.f6134v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f6134v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f6135w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6135w);
                        break;
                    case 22:
                        this.f6136x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6136x);
                        break;
                    case 23:
                        this.f6137y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6137y);
                        break;
                    case 24:
                        this.f6138z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6138z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = typedArrayObtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        this.L = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                        break;
                    case 35:
                        this.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                        break;
                    case 38:
                        this.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i15) {
                            case 44:
                                androidx.constraintlayout.widget.d.q(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = typedArrayObtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6122n);
                                this.f6122n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f6122n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6124o);
                                this.f6124o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f6124o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i15) {
                                    case 64:
                                        androidx.constraintlayout.widget.d.p(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.d.p(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.f6102d = typedArrayObtainStyledAttributes.getBoolean(index, this.f6102d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f6103d0 = false;
            this.f6097a0 = true;
            this.f6099b0 = true;
            int i14 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i14 == -2 && this.W) {
                this.f6097a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i15 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i15 == -2 && this.X) {
                this.f6099b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i14 == 0 || i14 == -1) {
                this.f6097a0 = false;
                if (i14 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i15 == 0 || i15 == -1) {
                this.f6099b0 = false;
                if (i15 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f6100c == -1.0f && this.f6096a == -1 && this.f6098b == -1) {
                return;
            }
            this.f6103d0 = true;
            this.f6097a0 = true;
            this.f6099b0 = true;
            if (!(this.f6129q0 instanceof t6.h)) {
                this.f6129q0 = new t6.h();
            }
            ((t6.h) this.f6129q0).X(this.V);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x0051  */
        /* JADX WARN: Code duplicated, block: B:22:0x0058  */
        /* JADX WARN: Code duplicated, block: B:25:0x005e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0064  */
        /* JADX WARN: Code duplicated, block: B:37:0x007a  */
        /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x0084  */
        /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public final void resolveLayoutDirection(int i14) {
            int i15;
            int i16;
            int i17;
            int i18;
            int i19 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i24 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i14);
            boolean z14 = false;
            boolean z15 = 1 == getLayoutDirection();
            this.f6113i0 = -1;
            this.f6115j0 = -1;
            this.f6109g0 = -1;
            this.f6111h0 = -1;
            this.f6117k0 = this.f6135w;
            this.f6119l0 = this.f6137y;
            float f14 = this.E;
            this.f6121m0 = f14;
            int i25 = this.f6096a;
            this.f6123n0 = i25;
            int i26 = this.f6098b;
            this.f6125o0 = i26;
            float f15 = this.f6100c;
            this.f6127p0 = f15;
            int i27 = this.f6131s;
            if (z15) {
                if (i27 != -1) {
                    this.f6113i0 = i27;
                } else {
                    int i28 = this.f6132t;
                    if (i28 != -1) {
                        this.f6115j0 = i28;
                    } else {
                        i15 = this.f6133u;
                        if (i15 != -1) {
                            this.f6111h0 = i15;
                            z14 = true;
                        }
                        i16 = this.f6134v;
                        if (i16 != -1) {
                            this.f6109g0 = i16;
                            z14 = true;
                        }
                        i17 = this.A;
                        if (i17 != Integer.MIN_VALUE) {
                            this.f6119l0 = i17;
                        }
                        i18 = this.B;
                        if (i18 != Integer.MIN_VALUE) {
                            this.f6117k0 = i18;
                        }
                        if (z14) {
                            this.f6121m0 = 1.0f - f14;
                        }
                        if (this.f6103d0 && this.V == 1 && this.f6102d) {
                            if (f15 != -1.0f) {
                                this.f6127p0 = 1.0f - f15;
                                this.f6123n0 = -1;
                                this.f6125o0 = -1;
                            } else if (i25 != -1) {
                                this.f6125o0 = i25;
                                this.f6123n0 = -1;
                                this.f6127p0 = -1.0f;
                            } else if (i26 != -1) {
                                this.f6123n0 = i26;
                                this.f6125o0 = -1;
                                this.f6127p0 = -1.0f;
                            }
                        }
                    }
                }
                z14 = true;
                i15 = this.f6133u;
                if (i15 != -1) {
                    this.f6111h0 = i15;
                    z14 = true;
                }
                i16 = this.f6134v;
                if (i16 != -1) {
                    this.f6109g0 = i16;
                    z14 = true;
                }
                i17 = this.A;
                if (i17 != Integer.MIN_VALUE) {
                    this.f6119l0 = i17;
                }
                i18 = this.B;
                if (i18 != Integer.MIN_VALUE) {
                    this.f6117k0 = i18;
                }
                if (z14) {
                    this.f6121m0 = 1.0f - f14;
                }
                if (this.f6103d0) {
                    if (f15 != -1.0f) {
                        this.f6127p0 = 1.0f - f15;
                        this.f6123n0 = -1;
                        this.f6125o0 = -1;
                    } else if (i25 != -1) {
                        this.f6125o0 = i25;
                        this.f6123n0 = -1;
                        this.f6127p0 = -1.0f;
                    } else if (i26 != -1) {
                        this.f6123n0 = i26;
                        this.f6125o0 = -1;
                        this.f6127p0 = -1.0f;
                    }
                }
            } else {
                if (i27 != -1) {
                    this.f6111h0 = i27;
                }
                int i29 = this.f6132t;
                if (i29 != -1) {
                    this.f6109g0 = i29;
                }
                int i30 = this.f6133u;
                if (i30 != -1) {
                    this.f6113i0 = i30;
                }
                int i34 = this.f6134v;
                if (i34 != -1) {
                    this.f6115j0 = i34;
                }
                int i35 = this.A;
                if (i35 != Integer.MIN_VALUE) {
                    this.f6117k0 = i35;
                }
                int i36 = this.B;
                if (i36 != Integer.MIN_VALUE) {
                    this.f6119l0 = i36;
                }
            }
            if (this.f6133u == -1 && this.f6134v == -1 && this.f6132t == -1 && i27 == -1) {
                int i37 = this.f6108g;
                if (i37 != -1) {
                    this.f6113i0 = i37;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i24 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i24;
                    }
                } else {
                    int i38 = this.f6110h;
                    if (i38 != -1) {
                        this.f6115j0 = i38;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i24 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i24;
                        }
                    }
                }
                int i39 = this.f6104e;
                if (i39 != -1) {
                    this.f6109g0 = i39;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i19 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i19;
                    return;
                }
                int i44 = this.f6106f;
                if (i44 != -1) {
                    this.f6111h0 = i44;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i19 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i19;
                }
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6096a = -1;
            this.f6098b = -1;
            this.f6100c = -1.0f;
            this.f6102d = true;
            this.f6104e = -1;
            this.f6106f = -1;
            this.f6108g = -1;
            this.f6110h = -1;
            this.f6112i = -1;
            this.f6114j = -1;
            this.f6116k = -1;
            this.f6118l = -1;
            this.f6120m = -1;
            this.f6122n = -1;
            this.f6124o = -1;
            this.f6126p = -1;
            this.f6128q = 0;
            this.f6130r = 0.0f;
            this.f6131s = -1;
            this.f6132t = -1;
            this.f6133u = -1;
            this.f6134v = -1;
            this.f6135w = Integer.MIN_VALUE;
            this.f6136x = Integer.MIN_VALUE;
            this.f6137y = Integer.MIN_VALUE;
            this.f6138z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f6097a0 = true;
            this.f6099b0 = true;
            this.f6101c0 = false;
            this.f6103d0 = false;
            this.f6105e0 = false;
            this.f6107f0 = false;
            this.f6109g0 = -1;
            this.f6111h0 = -1;
            this.f6113i0 = -1;
            this.f6115j0 = -1;
            this.f6117k0 = Integer.MIN_VALUE;
            this.f6119l0 = Integer.MIN_VALUE;
            this.f6121m0 = 0.5f;
            this.f6129q0 = new t6.e();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f6096a = bVar.f6096a;
                this.f6098b = bVar.f6098b;
                this.f6100c = bVar.f6100c;
                this.f6102d = bVar.f6102d;
                this.f6104e = bVar.f6104e;
                this.f6106f = bVar.f6106f;
                this.f6108g = bVar.f6108g;
                this.f6110h = bVar.f6110h;
                this.f6112i = bVar.f6112i;
                this.f6114j = bVar.f6114j;
                this.f6116k = bVar.f6116k;
                this.f6118l = bVar.f6118l;
                this.f6120m = bVar.f6120m;
                this.f6122n = bVar.f6122n;
                this.f6124o = bVar.f6124o;
                this.f6126p = bVar.f6126p;
                this.f6128q = bVar.f6128q;
                this.f6130r = bVar.f6130r;
                this.f6131s = bVar.f6131s;
                this.f6132t = bVar.f6132t;
                this.f6133u = bVar.f6133u;
                this.f6134v = bVar.f6134v;
                this.f6135w = bVar.f6135w;
                this.f6136x = bVar.f6136x;
                this.f6137y = bVar.f6137y;
                this.f6138z = bVar.f6138z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.E = bVar.E;
                this.F = bVar.F;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.W = bVar.W;
                this.X = bVar.X;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.P = bVar.P;
                this.O = bVar.O;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.S = bVar.S;
                this.T = bVar.T;
                this.U = bVar.U;
                this.V = bVar.V;
                this.f6097a0 = bVar.f6097a0;
                this.f6099b0 = bVar.f6099b0;
                this.f6101c0 = bVar.f6101c0;
                this.f6103d0 = bVar.f6103d0;
                this.f6109g0 = bVar.f6109g0;
                this.f6111h0 = bVar.f6111h0;
                this.f6113i0 = bVar.f6113i0;
                this.f6115j0 = bVar.f6115j0;
                this.f6117k0 = bVar.f6117k0;
                this.f6119l0 = bVar.f6119l0;
                this.f6121m0 = bVar.f6121m0;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.f6129q0 = bVar.f6129q0;
            }
        }

        public b(int i14, int i15) {
            super(i14, i15);
            this.f6096a = -1;
            this.f6098b = -1;
            this.f6100c = -1.0f;
            this.f6102d = true;
            this.f6104e = -1;
            this.f6106f = -1;
            this.f6108g = -1;
            this.f6110h = -1;
            this.f6112i = -1;
            this.f6114j = -1;
            this.f6116k = -1;
            this.f6118l = -1;
            this.f6120m = -1;
            this.f6122n = -1;
            this.f6124o = -1;
            this.f6126p = -1;
            this.f6128q = 0;
            this.f6130r = 0.0f;
            this.f6131s = -1;
            this.f6132t = -1;
            this.f6133u = -1;
            this.f6134v = -1;
            this.f6135w = Integer.MIN_VALUE;
            this.f6136x = Integer.MIN_VALUE;
            this.f6137y = Integer.MIN_VALUE;
            this.f6138z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f6097a0 = true;
            this.f6099b0 = true;
            this.f6101c0 = false;
            this.f6103d0 = false;
            this.f6105e0 = false;
            this.f6107f0 = false;
            this.f6109g0 = -1;
            this.f6111h0 = -1;
            this.f6113i0 = -1;
            this.f6115j0 = -1;
            this.f6117k0 = Integer.MIN_VALUE;
            this.f6119l0 = Integer.MIN_VALUE;
            this.f6121m0 = 0.5f;
            this.f6129q0 = new t6.e();
        }
    }
}
