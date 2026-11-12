package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import androidx.core.view.w;
import androidx.core.view.x;
import androidx.core.view.y;
import androidx.core.view.z;
import com.garmin.android.apps.connectmobile.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p1.k1;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements w, x {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<c>>> sConstructors;
    private static final k7.e<Rect> sRectPool;
    private z mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.a<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private m1 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final y mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private g mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    public class a implements z {
        public a() {
        }

        @Override // androidx.core.view.z
        public final m1 onApplyWindowInsets(View view2, m1 m1Var) {
            return CoordinatorLayout.this.setWindowInsets(m1Var);
        }
    }

    public interface b {
        c getBehavior();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view2, View view3) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view2, view3);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view2, View view3) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view2, view3);
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view2, View view3) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            float z14 = view2.getZ();
            float z15 = view3.getZ();
            if (z14 > z15) {
                return -1;
            }
            return z14 < z15 ? 1 : 0;
        }
    }

    static {
        Package r14 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r14 != null ? r14.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new i();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new k7.g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i14) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i14);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new androidx.coordinatorlayout.widget.a<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new y(this);
        int[] iArr = x6.a.f189172a;
        TypedArray typedArrayObtainStyledAttributes = i14 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, 2132149854) : context.obtainStyledAttributes(attributeSet, iArr, i14, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i14 == 0) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 2132149854);
            coordinatorLayout = this;
            context2 = context;
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, i14, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
            float f14 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.mKeylines.length;
            for (int i15 = 0; i15 < length; i15++) {
                int[] iArr2 = coordinatorLayout.mKeylines;
                iArr2[i15] = (int) (iArr2[i15] * f14);
            }
        }
        coordinatorLayout.mStatusBarBackground = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static Rect acquireTempRect() {
        Rect rectAcquire = sRectPool.acquire();
        return rectAcquire == null ? new Rect() : rectAcquire;
    }

    private static int clamp(int i14, int i15, int i16) {
        if (i14 < i15) {
            return i15;
        }
        return i14 > i16 ? i16 : i14;
    }

    private void constrainChildRect(f fVar, Rect rect, int i14, int i15) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i14) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i15) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i14 + iMax, i15 + iMax2);
    }

    private m1 dispatchApplyWindowInsetsToBehaviors(m1 m1Var) {
        c cVar;
        if (m1Var.f6508a.s()) {
            return m1Var;
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (childAt.getFitsSystemWindows() && (cVar = ((f) childAt.getLayoutParams()).f6350a) != null) {
                m1Var = cVar.onApplyWindowInsets(this, childAt, m1Var);
                if (m1Var.f6508a.s()) {
                    return m1Var;
                }
            }
        }
        return m1Var;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view2, int i14, Rect rect, Rect rect2, f fVar, int i15, int i16) {
        int iWidth;
        int iHeight;
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveAnchoredChildGravity(fVar.f6352c), i14);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(resolveGravity(fVar.f6353d), i14);
        int i17 = absoluteGravity & 7;
        int i18 = absoluteGravity & 112;
        int i19 = absoluteGravity2 & 7;
        int i24 = absoluteGravity2 & 112;
        if (i19 != 1) {
            iWidth = i19 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i24 != 16) {
            iHeight = i24 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i17 == 1) {
            iWidth -= i15 / 2;
        } else if (i17 != 5) {
            iWidth -= i15;
        }
        if (i18 == 16) {
            iHeight -= i16 / 2;
        } else if (i18 != 80) {
            iHeight -= i16;
        }
        rect2.set(iWidth, iHeight, i15 + iWidth, i16 + iHeight);
    }

    private int getKeyline(int i14) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            toString();
            return 0;
        }
        if (i14 >= 0 && i14 < iArr.length) {
            return iArr[i14];
        }
        toString();
        return 0;
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i14 = childCount - 1; i14 >= 0; i14--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i14) : i14));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view2) {
        k1<View, ArrayList<View>> k1Var = this.mChildDag.f6371b;
        int i14 = k1Var.f134761c;
        for (int i15 = 0; i15 < i14; i15++) {
            ArrayList<View> arrayListK = k1Var.k(i15);
            if (arrayListK != null && arrayListK.contains(view2)) {
                return true;
            }
        }
        return false;
    }

    private void layoutChild(View view2, int i14) {
        f fVar = (f) view2.getLayoutParams();
        Rect rectAcquireTempRect = acquireTempRect();
        rectAcquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.mLastInsets != null) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (getFitsSystemWindows() && !view2.getFitsSystemWindows()) {
                rectAcquireTempRect.left = this.mLastInsets.b() + rectAcquireTempRect.left;
                rectAcquireTempRect.top = this.mLastInsets.d() + rectAcquireTempRect.top;
                rectAcquireTempRect.right -= this.mLastInsets.c();
                rectAcquireTempRect.bottom -= this.mLastInsets.a();
            }
        }
        Rect rectAcquireTempRect2 = acquireTempRect();
        Gravity.apply(resolveGravity(fVar.f6352c), view2.getMeasuredWidth(), view2.getMeasuredHeight(), rectAcquireTempRect, rectAcquireTempRect2, i14);
        view2.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
    }

    private void layoutChildWithAnchor(View view2, View view3, int i14) {
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view3, rectAcquireTempRect);
            getDesiredAnchoredChildRect(view2, i14, rectAcquireTempRect, rectAcquireTempRect2);
            view2.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view2, int i14, int i15) {
        int i16;
        f fVar = (f) view2.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(resolveKeylineGravity(fVar.f6352c), i15);
        int i17 = absoluteGravity & 7;
        int i18 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view2.getMeasuredWidth();
        int measuredHeight = view2.getMeasuredHeight();
        if (i15 == 1) {
            i14 = width - i14;
        }
        int keyline = getKeyline(i14) - measuredWidth;
        if (i17 == 1) {
            keyline += measuredWidth / 2;
        } else if (i17 == 5) {
            keyline += measuredWidth;
        }
        if (i18 != 16) {
            i16 = i18 != 80 ? 0 : measuredHeight;
        } else {
            i16 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i16, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view2.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void offsetChildByInset(View view2, Rect rect, int i14) {
        boolean z14;
        boolean z15;
        int width;
        int i15;
        int i16;
        int i17;
        int height;
        int i18;
        int i19;
        int i24;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (view2.isLaidOut() && view2.getWidth() > 0 && view2.getHeight() > 0) {
            f fVar = (f) view2.getLayoutParams();
            c cVar = fVar.f6350a;
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            rectAcquireTempRect2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            if (cVar == null || !cVar.getInsetDodgeRect(this, view2, rectAcquireTempRect)) {
                rectAcquireTempRect.set(rectAcquireTempRect2);
            } else if (!rectAcquireTempRect2.contains(rectAcquireTempRect)) {
                org.apache.commons.lang3.e.m("Rect should be within the child's bounds. Rect:", rectAcquireTempRect.toShortString(), " | Bounds:", rectAcquireTempRect2.toShortString());
                return;
            }
            releaseTempRect(rectAcquireTempRect2);
            if (rectAcquireTempRect.isEmpty()) {
                releaseTempRect(rectAcquireTempRect);
                return;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f6357h, i14);
            boolean z16 = true;
            if ((absoluteGravity & 48) != 48 || (i19 = (rectAcquireTempRect.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f6359j) >= (i24 = rect.top)) {
                z14 = false;
            } else {
                setInsetOffsetY(view2, i24 - i19);
                z14 = true;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - rectAcquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f6359j) < (i18 = rect.bottom)) {
                setInsetOffsetY(view2, height - i18);
                z14 = true;
            }
            if (!z14) {
                setInsetOffsetY(view2, 0);
            }
            if ((absoluteGravity & 3) != 3 || (i16 = (rectAcquireTempRect.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f6358i) >= (i17 = rect.left)) {
                z15 = false;
            } else {
                setInsetOffsetX(view2, i17 - i16);
                z15 = true;
            }
            if ((absoluteGravity & 5) != 5 || (width = ((getWidth() - rectAcquireTempRect.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f6358i) >= (i15 = rect.right)) {
                z16 = z15;
            } else {
                setInsetOffsetX(view2, width - i15);
            }
            if (!z16) {
                setInsetOffsetX(view2, 0);
            }
            releaseTempRect(rectAcquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = sConstructors;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e4) {
            q2.v("Could not inflate Behavior subclass ".concat(str), e4);
            return null;
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i14) {
        boolean zBlocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = list.get(i15);
            f fVar = (f) view2.getLayoutParams();
            c cVar = fVar.f6350a;
            if (!(zOnInterceptTouchEvent || z14) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && cVar != null) {
                    if (i14 == 0) {
                        zOnInterceptTouchEvent = cVar.onInterceptTouchEvent(this, view2, motionEvent);
                    } else if (i14 == 1) {
                        zOnInterceptTouchEvent = cVar.onTouchEvent(this, view2, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view2;
                    }
                }
                c cVar2 = fVar.f6350a;
                if (cVar2 == null) {
                    fVar.f6362m = false;
                }
                boolean z15 = fVar.f6362m;
                if (z15) {
                    zBlocksInteractionBelow = true;
                } else {
                    zBlocksInteractionBelow = (cVar2 != null ? cVar2.blocksInteractionBelow(this, view2) : false) | z15;
                    fVar.f6362m = zBlocksInteractionBelow;
                }
                boolean z16 = zBlocksInteractionBelow && !z15;
                if (zBlocksInteractionBelow && !z16) {
                    break;
                }
                z14 = z16;
            } else if (cVar != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i14 == 0) {
                    cVar.onInterceptTouchEvent(this, view2, motionEventObtain);
                } else if (i14 == 1) {
                    cVar.onTouchEvent(this, view2, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v3 java.util.Collection<? extends android.view.View>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    private void prepareChildren() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.prepareChildren():void");
    }

    private static void releaseTempRect(Rect rect) {
        rect.setEmpty();
        sRectPool.a(rect);
    }

    private void resetTouchBehaviors(boolean z14) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            c cVar = ((f) childAt.getLayoutParams()).f6350a;
            if (cVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z14) {
                    cVar.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    cVar.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            ((f) getChildAt(i15).getLayoutParams()).f6362m = false;
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i14) {
        if (i14 == 0) {
            return 17;
        }
        return i14;
    }

    private static int resolveGravity(int i14) {
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        return (i14 & 112) == 0 ? i14 | 48 : i14;
    }

    private static int resolveKeylineGravity(int i14) {
        if (i14 == 0) {
            return 8388661;
        }
        return i14;
    }

    private void setInsetOffsetX(View view2, int i14) {
        f fVar = (f) view2.getLayoutParams();
        int i15 = fVar.f6358i;
        if (i15 != i14) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            view2.offsetLeftAndRight(i14 - i15);
            fVar.f6358i = i14;
        }
    }

    private void setInsetOffsetY(View view2, int i14) {
        f fVar = (f) view2.getLayoutParams();
        int i15 = fVar.f6359j;
        if (i15 != i14) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            view2.offsetTopAndBottom(i14 - i15);
            fVar.f6359j = i14;
        }
    }

    private void setupForInsets() {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (!getFitsSystemWindows()) {
            s0.d.c(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new a();
        }
        s0.d.c(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(View view2) {
        ArrayList<View> arrayList = this.mChildDag.f6371b.get(view2);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            View view3 = arrayList.get(i14);
            c cVar = ((f) view3.getLayoutParams()).f6350a;
            if (cVar != null) {
                cVar.onDependentViewChanged(this, view3, view2);
            }
        }
    }

    public boolean doViewsOverlap(View view2, View view3) {
        boolean z14 = false;
        if (view2.getVisibility() != 0 || view3.getVisibility() != 0) {
            return false;
        }
        Rect rectAcquireTempRect = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, rectAcquireTempRect);
        Rect rectAcquireTempRect2 = acquireTempRect();
        getChildRect(view3, view3.getParent() != this, rectAcquireTempRect2);
        try {
            if (rectAcquireTempRect.left <= rectAcquireTempRect2.right && rectAcquireTempRect.top <= rectAcquireTempRect2.bottom && rectAcquireTempRect.right >= rectAcquireTempRect2.left && rectAcquireTempRect.bottom >= rectAcquireTempRect2.top) {
                z14 = true;
            }
            return z14;
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view2, long j8) {
        f fVar = (f) view2.getLayoutParams();
        c cVar = fVar.f6350a;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view2);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(fVar.f6350a.getScrimColor(this, view2));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view2.isOpaque()) {
                    canvas.clipRect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view2, j8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z14 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            if (hasDependencies(getChildAt(i14))) {
                z14 = true;
                break;
            }
        }
        if (z14 != this.mNeedsPreDrawListener) {
            if (z14) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    @Override // android.view.ViewGroup
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public void getChildRect(View view2, boolean z14, Rect rect) {
        if (view2.isLayoutRequested() || view2.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z14) {
            getDescendantRect(view2, rect);
        } else {
            rect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
        }
    }

    public List<View> getDependencies(View view2) {
        k1<View, ArrayList<View>> k1Var = this.mChildDag.f6371b;
        int i14 = k1Var.f134761c;
        ArrayList arrayList = null;
        for (int i15 = 0; i15 < i14; i15++) {
            ArrayList<View> arrayListK = k1Var.k(i15);
            if (arrayListK != null && arrayListK.contains(view2)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(k1Var.g(i15));
            }
        }
        this.mTempDependenciesList.clear();
        if (arrayList != null) {
            this.mTempDependenciesList.addAll(arrayList);
        }
        return this.mTempDependenciesList;
    }

    public final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    public List<View> getDependents(View view2) {
        ArrayList<View> arrayList = this.mChildDag.f6371b.get(view2);
        this.mTempDependenciesList.clear();
        if (arrayList != null) {
            this.mTempDependenciesList.addAll(arrayList);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view2, Rect rect) {
        ThreadLocal<Matrix> threadLocal = androidx.coordinatorlayout.widget.b.f6374a;
        rect.set(0, 0, view2.getWidth(), view2.getHeight());
        ThreadLocal<Matrix> threadLocal2 = androidx.coordinatorlayout.widget.b.f6374a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        androidx.coordinatorlayout.widget.b.a(this, view2, matrix);
        ThreadLocal<RectF> threadLocal3 = androidx.coordinatorlayout.widget.b.f6375b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public void getDesiredAnchoredChildRect(View view2, int i14, Rect rect, Rect rect2) {
        f fVar = (f) view2.getLayoutParams();
        int measuredWidth = view2.getMeasuredWidth();
        int measuredHeight = view2.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view2, i14, rect, rect2, fVar, measuredWidth, measuredHeight);
        constrainChildRect(fVar, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view2, Rect rect) {
        rect.set(((f) view2.getLayoutParams()).f6366q);
    }

    public final m1 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        y yVar = this.mNestedScrollingParentHelper;
        return yVar.f6588b | yVar.f6587a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f getResolvedLayoutParams(View view2) {
        f fVar = (f) view2.getLayoutParams();
        if (!fVar.f6351b) {
            if (view2 instanceof b) {
                fVar.b(((b) view2).getBehavior());
                fVar.f6351b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view2.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.b(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    dVar.value().getName();
                }
            }
            fVar.f6351b = true;
        }
        return fVar;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public boolean isPointInChildBounds(View view2, int i14, int i15) {
        Rect rectAcquireTempRect = acquireTempRect();
        getDescendantRect(view2, rectAcquireTempRect);
        try {
            return rectAcquireTempRect.contains(i14, i15);
        } finally {
            releaseTempRect(rectAcquireTempRect);
        }
    }

    public void offsetChildToAnchor(View view2, int i14) {
        c cVar;
        f fVar = (f) view2.getLayoutParams();
        if (fVar.f6360k != null) {
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            Rect rectAcquireTempRect3 = acquireTempRect();
            getDescendantRect(fVar.f6360k, rectAcquireTempRect);
            getChildRect(view2, false, rectAcquireTempRect2);
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = view2.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view2, i14, rectAcquireTempRect, rectAcquireTempRect3, fVar, measuredWidth, measuredHeight);
            boolean z14 = (rectAcquireTempRect3.left == rectAcquireTempRect2.left && rectAcquireTempRect3.top == rectAcquireTempRect2.top) ? false : true;
            constrainChildRect(fVar, rectAcquireTempRect3, measuredWidth, measuredHeight);
            int i15 = rectAcquireTempRect3.left - rectAcquireTempRect2.left;
            int i16 = rectAcquireTempRect3.top - rectAcquireTempRect2.top;
            if (i15 != 0) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view2.offsetLeftAndRight(i15);
            }
            if (i16 != 0) {
                WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                view2.offsetTopAndBottom(i16);
            }
            if (z14 && (cVar = fVar.f6350a) != null) {
                cVar.onDependentViewChanged(this, view2, fVar.f6360k);
            }
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
            releaseTempRect(rectAcquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    public final void onChildViewsChanged(int i14) {
        int i15;
        c cVar;
        boolean z14;
        boolean zOnDependentViewChanged;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        Rect rectAcquireTempRect3 = acquireTempRect();
        for (int i16 = 0; i16 < size; i16++) {
            View view2 = this.mDependencySortedChildren.get(i16);
            f fVar = (f) view2.getLayoutParams();
            if (i14 != 0 || view2.getVisibility() != 8) {
                for (int i17 = 0; i17 < i16; i17++) {
                    if (fVar.f6361l == this.mDependencySortedChildren.get(i17)) {
                        offsetChildToAnchor(view2, layoutDirection);
                    }
                }
                boolean z15 = true;
                getChildRect(view2, true, rectAcquireTempRect2);
                if (fVar.f6356g != 0 && !rectAcquireTempRect2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f6356g, layoutDirection);
                    int i18 = absoluteGravity & 112;
                    if (i18 == 48) {
                        rectAcquireTempRect.top = Math.max(rectAcquireTempRect.top, rectAcquireTempRect2.bottom);
                    } else if (i18 == 80) {
                        rectAcquireTempRect.bottom = Math.max(rectAcquireTempRect.bottom, getHeight() - rectAcquireTempRect2.top);
                    }
                    int i19 = absoluteGravity & 7;
                    if (i19 == 3) {
                        rectAcquireTempRect.left = Math.max(rectAcquireTempRect.left, rectAcquireTempRect2.right);
                    } else if (i19 == 5) {
                        rectAcquireTempRect.right = Math.max(rectAcquireTempRect.right, getWidth() - rectAcquireTempRect2.left);
                    }
                }
                if (fVar.f6357h != 0 && view2.getVisibility() == 0) {
                    offsetChildByInset(view2, rectAcquireTempRect, layoutDirection);
                }
                if (i14 != 2) {
                    getLastChildRect(view2, rectAcquireTempRect3);
                    if (!rectAcquireTempRect3.equals(rectAcquireTempRect2)) {
                        recordLastChildRect(view2, rectAcquireTempRect2);
                        i15 = i16 + 1;
                        while (i15 < size) {
                            View view3 = this.mDependencySortedChildren.get(i15);
                            f fVar2 = (f) view3.getLayoutParams();
                            cVar = fVar2.f6350a;
                            if (cVar != null || !cVar.layoutDependsOn(this, view3, view2)) {
                                z14 = z15;
                            } else if (i14 == 0 && fVar2.f6365p) {
                                fVar2.f6365p = false;
                                z14 = true;
                            } else {
                                if (i14 != 2) {
                                    zOnDependentViewChanged = cVar.onDependentViewChanged(this, view3, view2);
                                } else {
                                    cVar.onDependentViewRemoved(this, view3, view2);
                                    zOnDependentViewChanged = true;
                                }
                                z14 = true;
                                if (i14 == 1) {
                                    fVar2.f6365p = zOnDependentViewChanged;
                                }
                            }
                            i15++;
                            z15 = z14;
                        }
                    }
                } else {
                    i15 = i16 + 1;
                    while (i15 < size) {
                        View view4 = this.mDependencySortedChildren.get(i15);
                        f fVar3 = (f) view4.getLayoutParams();
                        cVar = fVar3.f6350a;
                        if (cVar != null) {
                            z14 = z15;
                        } else {
                            z14 = z15;
                        }
                        i15++;
                        z15 = z14;
                    }
                }
            }
        }
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
        releaseTempRect(rectAcquireTempRect3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view2 = this.mNestedScrollingTarget;
        if (view2 != null) {
            onStopNestedScroll(view2);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        m1 m1Var = this.mLastInsets;
        int iD = m1Var != null ? m1Var.d() : 0;
        if (iD > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iD);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean zPerformIntercept = performIntercept(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zPerformIntercept;
        }
        resetTouchBehaviors(true);
        return zPerformIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        c cVar;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i18 = 0; i18 < size; i18++) {
            View view2 = this.mDependencySortedChildren.get(i18);
            if (view2.getVisibility() != 8 && ((cVar = ((f) view2.getLayoutParams()).f6350a) == null || !cVar.onLayoutChild(this, view2, layoutDirection))) {
                onLayoutChild(view2, layoutDirection);
            }
        }
    }

    public void onLayoutChild(View view2, int i14) {
        f fVar = (f) view2.getLayoutParams();
        View view3 = fVar.f6360k;
        if (view3 == null && fVar.f6355f != -1) {
            vb.h.z("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        if (view3 != null) {
            layoutChildWithAnchor(view2, view3, i14);
            return;
        }
        int i15 = fVar.f6354e;
        if (i15 >= 0) {
            layoutChildWithKeyline(view2, i15, i14);
        } else {
            layoutChild(view2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x0100  */
    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:48:0x012e  */
    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        int i16;
        int i17;
        int i18;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVar;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        View view2;
        int i30;
        int i34;
        boolean zOnMeasureChild;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.prepareChildren();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z14 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        int size2 = View.MeasureSpec.getSize(i15);
        int i35 = paddingLeft + paddingRight;
        int i36 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z15 = coordinatorLayout.mLastInsets != null && coordinatorLayout.getFitsSystemWindows();
        int size3 = coordinatorLayout.mDependencySortedChildren.size();
        int i37 = 0;
        int iCombineMeasuredStates = 0;
        while (i37 < size3) {
            View view3 = coordinatorLayout.mDependencySortedChildren.get(i37);
            int i38 = suggestedMinimumWidth;
            if (view3.getVisibility() == 8) {
                i25 = size3;
                i17 = i37;
                i26 = paddingLeft;
                i19 = layoutDirection;
                suggestedMinimumWidth = i38;
                i30 = paddingRight;
            } else {
                f fVar = (f) view3.getLayoutParams();
                int i39 = fVar.f6354e;
                if (i39 < 0 || mode == 0) {
                    i16 = suggestedMinimumHeight;
                } else {
                    int keyline = coordinatorLayout.getKeyline(i39);
                    int absoluteGravity = Gravity.getAbsoluteGravity(resolveKeylineGravity(fVar.f6352c), layoutDirection) & 7;
                    i16 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z14) && !(absoluteGravity == 5 && z14)) {
                        if ((absoluteGravity == 5 && !z14) || (absoluteGravity == 3 && z14)) {
                            iMax = Math.max(0, keyline - paddingLeft);
                        }
                        if (z15 || view3.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i14;
                            iMakeMeasureSpec2 = i15;
                        } else {
                            int iC = coordinatorLayout.mLastInsets.c() + coordinatorLayout.mLastInsets.b();
                            int iA = coordinatorLayout.mLastInsets.a() + coordinatorLayout.mLastInsets.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        cVar = fVar.f6350a;
                        if (cVar != null) {
                            i25 = size3;
                            int i44 = iMakeMeasureSpec;
                            view2 = view3;
                            int i45 = i16;
                            i19 = layoutDirection;
                            i24 = i45;
                            i26 = paddingLeft;
                            i27 = i38;
                            i30 = paddingRight;
                            i34 = iCombineMeasuredStates;
                            int i46 = iMakeMeasureSpec2;
                            zOnMeasureChild = cVar.onMeasureChild(this, view2, i44, i18, i46, 0);
                            i29 = i44;
                            i28 = i46;
                            if (zOnMeasureChild) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i27, view2.getMeasuredWidth() + i35 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax2 = Math.max(i24, view2.getMeasuredHeight() + i36 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i34, view2.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i47 = i16;
                            i19 = layoutDirection;
                            i24 = i47;
                            i25 = size3;
                            i26 = paddingLeft;
                            i27 = i38;
                            i28 = iMakeMeasureSpec2;
                            i29 = iMakeMeasureSpec;
                            view2 = view3;
                            i30 = paddingRight;
                            i34 = iCombineMeasuredStates;
                        }
                        View view4 = view2;
                        coordinatorLayout = this;
                        coordinatorLayout.onMeasureChild(view4, i29, i18, i28, 0);
                        view2 = view4;
                        suggestedMinimumWidth = Math.max(i27, view2.getMeasuredWidth() + i35 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax3 = Math.max(i24, view2.getMeasuredHeight() + i36 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i34, view2.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - keyline);
                    }
                    int i48 = i37;
                    i18 = iMax;
                    i17 = i48;
                    if (z15) {
                        iMakeMeasureSpec = i14;
                        iMakeMeasureSpec2 = i15;
                    } else {
                        iMakeMeasureSpec = i14;
                        iMakeMeasureSpec2 = i15;
                    }
                    cVar = fVar.f6350a;
                    if (cVar != null) {
                        i25 = size3;
                        int i49 = iMakeMeasureSpec;
                        view2 = view3;
                        int i410 = i16;
                        i19 = layoutDirection;
                        i24 = i410;
                        i26 = paddingLeft;
                        i27 = i38;
                        i30 = paddingRight;
                        i34 = iCombineMeasuredStates;
                        int i411 = iMakeMeasureSpec2;
                        zOnMeasureChild = cVar.onMeasureChild(this, view2, i49, i18, i411, 0);
                        i29 = i49;
                        i28 = i411;
                        if (zOnMeasureChild) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i27, view2.getMeasuredWidth() + i35 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax4 = Math.max(i24, view2.getMeasuredHeight() + i36 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i34, view2.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i412 = i16;
                        i19 = layoutDirection;
                        i24 = i412;
                        i25 = size3;
                        i26 = paddingLeft;
                        i27 = i38;
                        i28 = iMakeMeasureSpec2;
                        i29 = iMakeMeasureSpec;
                        view2 = view3;
                        i30 = paddingRight;
                        i34 = iCombineMeasuredStates;
                    }
                    View view5 = view2;
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view5, i29, i18, i28, 0);
                    view2 = view5;
                    suggestedMinimumWidth = Math.max(i27, view2.getMeasuredWidth() + i35 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax5 = Math.max(i24, view2.getMeasuredHeight() + i36 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i34, view2.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i17 = i37;
                i18 = 0;
                if (z15) {
                    iMakeMeasureSpec = i14;
                    iMakeMeasureSpec2 = i15;
                } else {
                    iMakeMeasureSpec = i14;
                    iMakeMeasureSpec2 = i15;
                }
                cVar = fVar.f6350a;
                if (cVar != null) {
                    i25 = size3;
                    int i413 = iMakeMeasureSpec;
                    view2 = view3;
                    int i414 = i16;
                    i19 = layoutDirection;
                    i24 = i414;
                    i26 = paddingLeft;
                    i27 = i38;
                    i30 = paddingRight;
                    i34 = iCombineMeasuredStates;
                    int i415 = iMakeMeasureSpec2;
                    zOnMeasureChild = cVar.onMeasureChild(this, view2, i413, i18, i415, 0);
                    i29 = i413;
                    i28 = i415;
                    if (zOnMeasureChild) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i27, view2.getMeasuredWidth() + i35 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax6 = Math.max(i24, view2.getMeasuredHeight() + i36 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i34, view2.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i416 = i16;
                    i19 = layoutDirection;
                    i24 = i416;
                    i25 = size3;
                    i26 = paddingLeft;
                    i27 = i38;
                    i28 = iMakeMeasureSpec2;
                    i29 = iMakeMeasureSpec;
                    view2 = view3;
                    i30 = paddingRight;
                    i34 = iCombineMeasuredStates;
                }
                View view6 = view2;
                coordinatorLayout = this;
                coordinatorLayout.onMeasureChild(view6, i29, i18, i28, 0);
                view2 = view6;
                suggestedMinimumWidth = Math.max(i27, view2.getMeasuredWidth() + i35 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax7 = Math.max(i24, view2.getMeasuredHeight() + i36 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i34, view2.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i37 = i17 + 1;
            paddingLeft = i26;
            paddingRight = i30;
            layoutDirection = i19;
            size3 = i25;
        }
        int i54 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i14, (-16777216) & i54), View.resolveSizeAndState(suggestedMinimumHeight, i15, i54 << 16));
    }

    public void onMeasureChild(View view2, int i14, int i15, int i16, int i17) {
        measureChildWithMargins(view2, i14, i15, i16, i17);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view2, float f14, float f15, boolean z14) {
        c cVar;
        View view3;
        float f16;
        float f17;
        boolean z15;
        int childCount = getChildCount();
        int i14 = 0;
        boolean zOnNestedFling = false;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                view3 = view2;
                f16 = f14;
                f17 = f15;
                z15 = z14;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f6350a) != null) {
                    view3 = view2;
                    f16 = f14;
                    f17 = f15;
                    z15 = z14;
                    zOnNestedFling |= cVar.onNestedFling(this, childAt, view3, f16, f17, z15);
                } else {
                    view3 = view2;
                    f16 = f14;
                    f17 = f15;
                    z15 = z14;
                }
            }
            i14++;
            view2 = view3;
            f14 = f16;
            f15 = f17;
            z14 = z15;
        }
        if (zOnNestedFling) {
            onChildViewsChanged(1);
        }
        return zOnNestedFling;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view2, float f14, float f15) {
        c cVar;
        View view3;
        float f16;
        float f17;
        int childCount = getChildCount();
        int i14 = 0;
        boolean zOnNestedPreFling = false;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                view3 = view2;
                f16 = f14;
                f17 = f15;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f6350a) != null) {
                    view3 = view2;
                    f16 = f14;
                    f17 = f15;
                    zOnNestedPreFling |= cVar.onNestedPreFling(this, childAt, view3, f16, f17);
                } else {
                    view3 = view2;
                    f16 = f14;
                    f17 = f15;
                }
            }
            i14++;
            view2 = view3;
            f14 = f16;
            f15 = f17;
        }
        return zOnNestedPreFling;
    }

    @Override // androidx.core.view.w
    public void onNestedPreScroll(View view2, int i14, int i15, int[] iArr, int i16) {
        c cVar;
        int childCount = getChildCount();
        boolean z14 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i16) && (cVar = fVar.f6350a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedPreScroll(this, childAt, view2, i14, i15, iArr2, i16);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i14 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i15 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z14 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z14) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.x
    public void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z14 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i18) && (cVar = fVar.f6350a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedScroll(this, childAt, view2, i14, i15, i16, i17, i18, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i16 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i17 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z14 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z14) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.w
    public void onNestedScrollAccepted(View view2, View view3, int i14, int i15) {
        c cVar;
        View view4;
        View view5;
        int i16;
        int i17;
        y yVar = this.mNestedScrollingParentHelper;
        if (i15 == 1) {
            yVar.f6588b = i14;
        } else {
            yVar.f6587a = i14;
        }
        this.mNestedScrollingTarget = view3;
        int childCount = getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i15) && (cVar = fVar.f6350a) != null) {
                view4 = view2;
                view5 = view3;
                i16 = i14;
                i17 = i15;
                cVar.onNestedScrollAccepted(this, childAt, view4, view5, i16, i17);
            } else {
                view4 = view2;
                view5 = view3;
                i16 = i14;
                i17 = i15;
            }
            i18++;
            view2 = view4;
            view3 = view5;
            i14 = i16;
            i15 = i17;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        SparseArray<Parcelable> sparseArray = hVar.f6369a;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            int id3 = childAt.getId();
            c cVar = getResolvedLayoutParams(childAt).f6350a;
            if (id3 != -1 && cVar != null && (parcelable2 = sparseArray.get(id3)) != null) {
                cVar.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            int id3 = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f6350a;
            if (id3 != -1 && cVar != null && (parcelableOnSaveInstanceState = cVar.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id3, parcelableOnSaveInstanceState);
            }
        }
        hVar.f6369a = sparseArray;
        return hVar;
    }

    @Override // androidx.core.view.w
    public boolean onStartNestedScroll(View view2, View view3, int i14, int i15) {
        int childCount = getChildCount();
        boolean z14 = false;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f6350a;
                if (cVar != null) {
                    boolean zOnStartNestedScroll = cVar.onStartNestedScroll(this, childAt, view2, view3, i14, i15);
                    z14 |= zOnStartNestedScroll;
                    if (i15 == 0) {
                        fVar.f6363n = zOnStartNestedScroll;
                    } else if (i15 == 1) {
                        fVar.f6364o = zOnStartNestedScroll;
                    }
                } else if (i15 == 0) {
                    fVar.f6363n = false;
                } else if (i15 == 1) {
                    fVar.f6364o = false;
                }
            }
        }
        return z14;
    }

    @Override // androidx.core.view.w
    public void onStopNestedScroll(View view2, int i14) {
        y yVar = this.mNestedScrollingParentHelper;
        if (i14 == 1) {
            yVar.f6588b = 0;
        } else {
            yVar.f6587a = 0;
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i14)) {
                c cVar = fVar.f6350a;
                if (cVar != null) {
                    cVar.onStopNestedScroll(this, childAt, view2, i14);
                }
                if (i14 == 0) {
                    fVar.f6363n = false;
                } else if (i14 == 1) {
                    fVar.f6364o = false;
                }
                fVar.f6365p = false;
            }
        }
        this.mNestedScrollingTarget = null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zPerformIntercept;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            zPerformIntercept = performIntercept(motionEvent, 1);
            if (!zPerformIntercept) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.mBehaviorTouchView == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zPerformIntercept) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zOnTouchEvent;
            }
            resetTouchBehaviors(false);
            return zOnTouchEvent;
        }
        zPerformIntercept = false;
        c cVar = ((f) this.mBehaviorTouchView.getLayoutParams()).f6350a;
        if (cVar != null) {
            zOnTouchEvent = cVar.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.mBehaviorTouchView == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zPerformIntercept) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        resetTouchBehaviors(false);
        return zOnTouchEvent;
    }

    public void recordLastChildRect(View view2, Rect rect) {
        ((f) view2.getLayoutParams()).f6366q.set(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view2, Rect rect, boolean z14) {
        c cVar = ((f) view2.getLayoutParams()).f6350a;
        if (cVar == null || !cVar.onRequestChildRectangleOnScreen(this, view2, rect, z14)) {
            return super.requestChildRectangleOnScreen(view2, rect, z14);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z14) {
        super.requestDisallowInterceptTouchEvent(z14);
        if (!z14 || this.mDisallowInterceptReset) {
            return;
        }
        resetTouchBehaviors(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z14) {
        super.setFitsSystemWindows(z14);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                Drawable drawable3 = this.mStatusBarBackground;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i14) {
        setStatusBarBackground(new ColorDrawable(i14));
    }

    public void setStatusBarBackgroundResource(int i14) {
        setStatusBarBackground(i14 != 0 ? a7.b.getDrawable(getContext(), i14) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i14) {
        super.setVisibility(i14);
        boolean z14 = i14 == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z14) {
            return;
        }
        this.mStatusBarBackground.setVisible(z14, false);
    }

    public final m1 setWindowInsets(m1 m1Var) {
        if (Objects.equals(this.mLastInsets, m1Var)) {
            return m1Var;
        }
        this.mLastInsets = m1Var;
        boolean z14 = false;
        boolean z15 = m1Var != null && m1Var.d() > 0;
        this.mDrawStatusBarBackground = z15;
        if (!z15 && getBackground() == null) {
            z14 = true;
        }
        setWillNotDraw(z14);
        m1 m1VarDispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(m1Var);
        requestLayout();
        return m1VarDispatchApplyWindowInsetsToBehaviors;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public static Object getTag(View view2) {
            return ((f) view2.getLayoutParams()).f6367r;
        }

        public static void setTag(View view2, Object obj) {
            ((f) view2.getLayoutParams()).f6367r = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v14) {
            return getScrimOpacity(coordinatorLayout, v14) > 0.0f;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v14, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v14) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v14) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v14, View view2) {
            return false;
        }

        public m1 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v14, m1 m1Var) {
            return m1Var;
        }

        public void onAttachedToLayoutParams(f fVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v14, View view2) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v14, View view2) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v14, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v14, int i14) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v14, int i14, int i15, int i16, int i17) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v14, View view2, float f14, float f15, boolean z14) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v14, View view2, float f14, float f15) {
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, int i14, int i15, int[] iArr, int i16) {
            if (i16 == 0) {
                onNestedPreScroll(coordinatorLayout, v14, view2, i14, i15, iArr);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, int i14, int i15, int i16, int i17, int i18, int[] iArr) {
            iArr[0] = iArr[0] + i16;
            iArr[1] = iArr[1] + i17;
            onNestedScroll(coordinatorLayout, v14, view2, i14, i15, i16, i17, i18);
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v14, View view2, View view3, int i14, int i15) {
            if (i15 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v14, view2, view3, i14);
            }
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v14, Rect rect, boolean z14) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v14, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v14) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, View view3, int i14, int i15) {
            if (i15 == 0) {
                return onStartNestedScroll(coordinatorLayout, v14, view2, view3, i14);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, int i14) {
            if (i14 == 0) {
                onStopNestedScroll(coordinatorLayout, v14, view2);
            }
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v14, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, int i14, int i15, int[] iArr) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v14, View view2, View view3, int i14) {
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v14, View view2) {
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, View view3, int i14) {
            return false;
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, int i14, int i15, int i16, int i17, int i18) {
            if (i18 == 0) {
                onNestedScroll(coordinatorLayout, v14, view2, i14, i15, i16, i17);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, int i14, int i15, int i16, int i17) {
        }
    }

    public static class h extends s7.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<Parcelable> f6369a;

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i14 = parcel.readInt();
            int[] iArr = new int[i14];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f6369a = new SparseArray<>(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                this.f6369a.append(iArr[i15], parcelableArray[i15]);
            }
        }

        @Override // s7.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            SparseArray<Parcelable> sparseArray = this.f6369a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i15 = 0; i15 < size; i15++) {
                iArr[i15] = this.f6369a.keyAt(i15);
                parcelableArr[i15] = this.f6369a.valueAt(i15);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i14);
        }

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i14) {
                return new h[i14];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view2, View view3, int i14) {
        onNestedScrollAccepted(view2, view3, i14, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view2) {
        onStopNestedScroll(view2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view2, View view3, int i14) {
        return onStartNestedScroll(view2, view3, i14, 0);
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f6350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6355f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6356g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6357h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6358i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6359j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public View f6360k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View f6361l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f6362m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f6363n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f6364o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f6365p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Rect f6366q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f6367r;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6351b = false;
            this.f6352c = 0;
            this.f6353d = 0;
            this.f6354e = -1;
            this.f6355f = -1;
            this.f6356g = 0;
            this.f6357h = 0;
            this.f6366q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x6.a.f189173b);
            this.f6352c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f6355f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f6353d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f6354e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f6356g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f6357h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f6351b = zHasValue;
            if (zHasValue) {
                this.f6350a = CoordinatorLayout.parseBehavior(context, attributeSet, typedArrayObtainStyledAttributes.getString(3));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f6350a;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }

        public final boolean a(int i14) {
            if (i14 == 0) {
                return this.f6363n;
            }
            if (i14 != 1) {
                return false;
            }
            return this.f6364o;
        }

        public final void b(c cVar) {
            c cVar2 = this.f6350a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.onDetachedFromLayoutParams();
                }
                this.f6350a = cVar;
                this.f6367r = null;
                this.f6351b = true;
                if (cVar != null) {
                    cVar.onAttachedToLayoutParams(this);
                }
            }
        }

        public f(int i14, int i15) {
            super(i14, i15);
            this.f6351b = false;
            this.f6352c = 0;
            this.f6353d = 0;
            this.f6354e = -1;
            this.f6355f = -1;
            this.f6356g = 0;
            this.f6357h = 0;
            this.f6366q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f6351b = false;
            this.f6352c = 0;
            this.f6353d = 0;
            this.f6354e = -1;
            this.f6355f = -1;
            this.f6356g = 0;
            this.f6357h = 0;
            this.f6366q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6351b = false;
            this.f6352c = 0;
            this.f6353d = 0;
            this.f6354e = -1;
            this.f6355f = -1;
            this.f6356g = 0;
            this.f6357h = 0;
            this.f6366q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6351b = false;
            this.f6352c = 0;
            this.f6353d = 0;
            this.f6354e = -1;
            this.f6355f = -1;
            this.f6356g = 0;
            this.f6357h = 0;
            this.f6366q = new Rect();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view2, int i14, int i15, int[] iArr) {
        onNestedPreScroll(view2, i14, i15, iArr, 0);
    }

    @Override // androidx.core.view.w
    public void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18) {
        onNestedScroll(view2, i14, i15, i16, i17, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view2, int i14, int i15, int i16, int i17) {
        onNestedScroll(view2, i14, i15, i16, i17, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
