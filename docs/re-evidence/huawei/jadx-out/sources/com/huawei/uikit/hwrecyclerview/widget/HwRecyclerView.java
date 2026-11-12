package com.huawei.uikit.hwrecyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.OverScroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.huawei.dynamicanimation.DynamicAnimation;
import com.huawei.uikit.hwrecyclerview.R;
import com.huawei.uikit.hwrecyclerview.layoutmanager.HwFloatingBubblesLayoutManager;
import com.huawei.uikit.hwunifiedinteract.widget.HwCompoundEventDetector;
import com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector;
import com.huawei.uikit.hwunifiedinteract.widget.HwKeyEventDetector;
import com.huawei.uikit.hwunifiedinteract.widget.HwRotaryConverter;
import defpackage.crd;
import defpackage.crg;
import defpackage.xeh;
import defpackage.xfj;
import defpackage.xfq;
import defpackage.xfr;
import defpackage.xfs;
import defpackage.xfv;
import defpackage.xgl;
import defpackage.xgo;
import huawei.android.widget.HwSafeInsetsShareable;
import huawei.android.widget.ScrollCallback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class HwRecyclerView extends RecyclerView implements ScrollCallback, HwSafeInsetsShareable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Interpolator f29646b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xfq f29647a;
    private long aa;
    private GestureDetector ab;
    private ContextMenu.ContextMenuInfo ac;
    private DeleteAnimatorCallback ad;
    private HwGenericEventDetector ae;
    private boolean af;
    private List<c> ag;
    private boolean ah;
    private int ai;
    private HwOnOverScrollListener aj;
    private int ak;
    private Runnable al;
    private HwKeyEventDetector am;
    private OrientationHelper an;
    private float ao;
    private List<HwOnOverScrollListener> ap;
    private int aq;
    private int ar;
    private boolean as;
    private Method at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private float az;
    private boolean ba;
    private bqmxo bb;
    private HwCompoundEventDetector bc;
    private float bd;
    private int be;
    private boolean bf;
    private boolean bg;
    private VelocityTracker bh;
    private boolean bi;
    private boolean bj;
    private boolean bk;
    private boolean bl;
    private boolean bm;
    private int bn;
    private xgl bo;
    private int bp;
    private xgo bq;
    private a br;
    private Rect bs;
    private HwChainAnimationListener bt;
    private boolean bu;
    private Rect bv;
    private final ViewTreeObserver.OnPreDrawListener bw;
    private ValueAnimator bx;
    private Interpolator by;
    private boolean bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29648c;
    private Map<Integer, Rect> cb;
    private xfj d;
    private int e;
    private boolean f;
    private boolean g;
    private int h;
    private RecyclerView.OnScrollListener i;
    private int j;
    private d k;
    private int l;
    private Field m;
    private f n;
    private HwLinkedViewCallBack o;
    private int p;
    private int q;
    private boolean r;
    private OverScroller s;
    private boolean t;
    private int u;
    private boolean v;
    private final int[] w;
    private int x;
    private int y;
    private int z;

    /* JADX INFO: loaded from: classes20.dex */
    public interface DeleteAnimatorCallback {
        int getItemPosition(Object obj);

        int getPositionByView(View view);

        void notifyResult(boolean z);

        void remove(Object obj);
    }

    /* JADX INFO: loaded from: classes20.dex */
    public interface MultiChoiceModeListener extends ActionMode.Callback {
        void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z);
    }

    /* JADX INFO: loaded from: classes44.dex */
    @Deprecated
    public interface OnItemClickListener {
        boolean onItemClick(View view, int i, long j);
    }

    /* JADX INFO: loaded from: classes44.dex */
    @Deprecated
    public interface OnItemLongClickListener {
        boolean onItemLongClick(View view, int i, long j);
    }

    /* JADX INFO: loaded from: classes20.dex */
    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29649b;

        private a() {
        }

        protected void c(int i) {
            d();
            this.f29649b = i;
            HwRecyclerView.this.postOnAnimation(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            HwRecyclerView.this.smoothScrollBy(0, this.f29649b, new LinearInterpolator());
            HwRecyclerView.this.postOnAnimation(this);
        }

        /* synthetic */ a(HwRecyclerView hwRecyclerView, g gVar) {
            this();
        }

        protected void d() {
            HwRecyclerView.this.removeCallbacks(this);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HwRecyclerView.this.l();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            HwRecyclerView.this.o();
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f29655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29656c;
        private int e;
        private boolean h;
        private long j;

        private d() {
            this.f29655b = new int[2];
            this.f29656c = 0;
            this.h = true;
            this.j = 0L;
        }

        private void c() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (HwRecyclerView.this.aa == 0) {
                long j = this.j;
                if (jCurrentAnimationTimeMillis != j) {
                    HwRecyclerView.this.aa = jCurrentAnimationTimeMillis - j;
                }
            }
            int[] iArr = this.f29655b;
            int currY = HwRecyclerView.this.s.getCurrY();
            int i = currY - HwRecyclerView.this.l;
            HwRecyclerView.this.l = currY;
            if (i == 0 && HwRecyclerView.this.l == 0) {
                HwRecyclerView.this.postOnAnimation(this);
                return;
            }
            int iLinkedViewHeight = HwRecyclerView.this.o.linkedViewHeight();
            HwRecyclerView.this.startNestedScroll(2, 0);
            if (HwRecyclerView.this.dispatchNestedPreScroll(0, i, iArr, null, 0)) {
                i -= iArr[1];
            }
            if (i != 0 && HwRecyclerView.this.dispatchNestedScroll(0, 0, 0, i, null, 0)) {
                int currVelocity = (int) HwRecyclerView.this.s.getCurrVelocity();
                int iLinkedViewState = HwRecyclerView.this.o.linkedViewState();
                boolean z = currVelocity > 0;
                boolean z2 = (iLinkedViewState == 0 && this.f29654a < 0) || (iLinkedViewState == 2 && this.f29654a > 0);
                if (z && z2) {
                    int iLinkedViewHeight2 = (HwRecyclerView.this.o.linkedViewHeight() - iLinkedViewHeight) + i;
                    this.e = iLinkedViewHeight2;
                    if (iLinkedViewHeight2 < 0) {
                        this.f29656c = 2;
                        run();
                    } else {
                        HwRecyclerView hwRecyclerView = HwRecyclerView.this;
                        hwRecyclerView.e(hwRecyclerView.s, 0, this.f29654a, HwRecyclerView.this.aa);
                        b();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.h) {
                return;
            }
            if (HwRecyclerView.this.o == null) {
                b();
                return;
            }
            int i = this.e;
            if (i < 0 && this.f29656c == 2) {
                HwRecyclerView.this.b(Math.abs(i));
                HwRecyclerView hwRecyclerView = HwRecyclerView.this;
                hwRecyclerView.e(hwRecyclerView.s, 0, this.f29654a, HwRecyclerView.this.aa);
                b();
                this.e = 0;
                return;
            }
            if (!HwRecyclerView.this.s.computeScrollOffset()) {
                b();
                return;
            }
            c();
            if (HwRecyclerView.this.s.isFinished()) {
                b();
            } else {
                HwRecyclerView.this.postOnAnimation(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            return this.h;
        }

        void d(OverScroller overScroller, int i) {
            this.f29654a = i;
            this.f29656c = 1;
            this.h = false;
            this.j = AnimationUtils.currentAnimationTimeMillis();
            run();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            HwRecyclerView.this.stopNestedScroll();
            HwRecyclerView.this.t = false;
            this.f29656c = 0;
            HwRecyclerView.this.l = 0;
            this.h = true;
        }

        /* synthetic */ d(HwRecyclerView hwRecyclerView, g gVar) {
            this();
        }
    }

    class e extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29659c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29657a = 0;
        private int d = 0;

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            OverScroller overScroller;
            if (!HwRecyclerView.this.canScrollVertically(-1)) {
                HwRecyclerView.this.aq = 0;
            }
            int i2 = this.f29659c;
            this.f29659c = i;
            if (i2 == 2 && i == 0) {
                if (HwRecyclerView.this.bx == null || !HwRecyclerView.this.bx.isRunning()) {
                    RecyclerView.LayoutManager layoutManager = HwRecyclerView.this.getLayoutManager();
                    if (layoutManager == null) {
                        Log.e("HwRecyclerView", "onScrollStateChanged: call getLayoutManager failed");
                        return;
                    }
                    if (!layoutManager.canScrollVertically() || HwRecyclerView.this.aj()) {
                        if ((layoutManager.canScrollHorizontally() && !HwRecyclerView.this.af()) || (overScroller = HwRecyclerView.this.getOverScroller()) == null || HwRecyclerView.this.v) {
                            return;
                        }
                        HwRecyclerView.this.e(overScroller, this.f29657a, this.d, 0L);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            this.f29657a = i;
            this.d = i2;
            HwRecyclerView.c(HwRecyclerView.this, i2);
            HwRecyclerView.this.u();
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f29662c;
        private xfr e;

        private f() {
            this.f29662c = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29662c || this.e == null || HwRecyclerView.this.ag()) {
                return;
            }
            this.f29662c = this.e.e();
            float fD = this.e.d();
            if (HwRecyclerView.this.g()) {
                HwRecyclerView.this.g((int) ((this.f29661b == 1 ? HwRecyclerView.this.getTranslationY() : HwRecyclerView.this.getTranslationX()) - fD));
            }
            HwRecyclerView.this.a(this.f29661b, fD);
            HwRecyclerView.this.invalidate();
            if (this.f29662c) {
                HwRecyclerView.this.l();
            } else {
                HwRecyclerView.this.b(fD);
                HwRecyclerView.this.postOnAnimation(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            return this.f29662c;
        }

        protected void e(int i, float f, int i2, int i3, long j) {
            if (Float.compare(f, 0.0f) == 0) {
                this.f29662c = true;
                return;
            }
            xfr xfrVar = new xfr(!HwRecyclerView.this.g() ? 228.0f : 200.0f, !HwRecyclerView.this.g() ? 30.0f : 28.0f, i2, i3, f);
            this.e = xfrVar;
            xfrVar.b(j);
            this.f29662c = false;
            this.f29661b = i;
            HwRecyclerView.this.o();
            run();
        }

        /* synthetic */ f(HwRecyclerView hwRecyclerView, g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            this.f29662c = true;
        }
    }

    class g implements Interpolator {
        g() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    class h implements HwGenericEventDetector.OnScrollListener {
        h() {
        }

        @Override // com.huawei.uikit.hwunifiedinteract.widget.HwGenericEventDetector.OnScrollListener
        public boolean onScrollBy(float f, float f2, MotionEvent motionEvent) {
            return HwRecyclerView.this.e(f, f2);
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29665b;

        i() {
            this.f29665b = (int) (HwRecyclerView.this.k() ? HwRecyclerView.this.getTranslationY() : HwRecyclerView.this.getTranslationX());
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator == null) {
                Log.e("HwRecyclerView", "mSpringBackAnimator: onAnimationUpdate: animation is null");
                return;
            }
            if (HwRecyclerView.this.g()) {
                int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                HwRecyclerView.this.g(this.f29665b - iFloatValue);
                this.f29665b = iFloatValue;
            }
            HwRecyclerView.this.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
            HwRecyclerView.this.invalidate();
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwRecyclerView.this.aq();
            HwRecyclerView.this.smoothScrollToPosition(0);
            if (HwRecyclerView.this.bg) {
                return;
            }
            HwRecyclerView.this.f29647a.b();
            HwRecyclerView.this.bg = true;
        }
    }

    class k extends RecyclerView.OnScrollListener {
        k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int childCount;
            View viewFindViewByPosition;
            RecyclerView.LayoutManager layoutManager = HwRecyclerView.this.getLayoutManager();
            if (layoutManager == null || (childCount = layoutManager.getChildCount()) < 1 || (viewFindViewByPosition = layoutManager.findViewByPosition(childCount - 1)) == null) {
                return;
            }
            int height = (int) ((HwRecyclerView.this.getHeight() * 0.5f) - (viewFindViewByPosition.getHeight() * 0.5f));
            if (HwRecyclerView.this.getPaddingBottom() == height || height <= 0) {
                return;
            }
            HwRecyclerView hwRecyclerView = HwRecyclerView.this;
            hwRecyclerView.bn = hwRecyclerView.getPaddingBottom();
            HwRecyclerView hwRecyclerView2 = HwRecyclerView.this;
            hwRecyclerView2.setPadding(hwRecyclerView2.getPaddingLeft(), HwRecyclerView.this.getPaddingTop(), HwRecyclerView.this.getPaddingRight(), height);
        }
    }

    class l implements HwRollbackRuleDetector.RollBackScrollListener {
        l() {
        }

        @Override // com.huawei.uikit.hwrecyclerview.widget.HwRollbackRuleDetector.RollBackScrollListener
        public int getScrollYDistance() {
            return HwRecyclerView.this.computeVerticalScrollOffset();
        }
    }

    class n extends AnimatorListenerAdapter {
        n() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HwRecyclerView.this.an();
        }
    }

    class o implements ViewTreeObserver.OnPreDrawListener {
        o() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!HwRecyclerView.this.bl || HwRecyclerView.this.getChildCount() <= 0) {
                return true;
            }
            HwRecyclerView.this.p();
            HwRecyclerView.this.bl = false;
            return true;
        }
    }

    public HwRecyclerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean af() {
        return (canScrollHorizontally(1) && canScrollHorizontally(-1)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ag() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return true;
        }
        if (!layoutManager.canScrollVertically() || computeVerticalScrollRange() == 0) {
            return !layoutManager.canScrollHorizontally() || computeHorizontalScrollRange() == 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean aj() {
        return (canScrollVertically(1) && canScrollVertically(-1)) ? false : true;
    }

    private boolean ak() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        return !this.bq.a() && (layoutManager != null && layoutManager.getClass().isAssignableFrom(LinearLayoutManager.class));
    }

    private void al() {
        this.e = 0;
        this.h = 0;
    }

    private void am() {
        a aVar = this.br;
        if (aVar != null) {
            aVar.d();
            stopScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        xfv xfvVar;
        List<c> list = this.ag;
        if (list == null) {
            Log.e("HwRecyclerView", "getDisappearAnimatorListener: onAnimationEnd: mVisibleItemInfos is null");
            aa();
            this.ad.notifyResult(false);
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.ag.get(i2);
            if (cVar.o) {
                ViewGroupOverlay viewGroupOverlay = cVar.i;
                if (viewGroupOverlay == null || (xfvVar = cVar.j) == null) {
                    Log.w("HwRecyclerView", "getDisappearAnimatorListener: onAnimationEnd: mViewOverlay/mAnimDrawable is null.");
                } else {
                    viewGroupOverlay.remove(xfvVar);
                }
                cVar.o = false;
            }
        }
        aa();
        this.ad.notifyResult(true);
    }

    private Class<?> ao() {
        Class<?> superclass = getClass();
        String name = RecyclerView.class.getName();
        for (int i2 = 0; i2 < 5; i2++) {
            if (name.equals(superclass.getName())) {
                return superclass;
            }
            superclass = superclass.getSuperclass();
        }
        return null;
    }

    private void ap() {
        OverScroller overScroller = this.s;
        if (overScroller != null) {
            overScroller.abortAnimation();
        }
        if (!this.n.a()) {
            this.n.e();
        }
        if (this.k.e()) {
            return;
        }
        this.k.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        int i2 = ((int) ((this.ar * this.ao) + 0.5f)) - this.aq;
        if (h(i2)) {
            scrollBy(0, i2);
        }
    }

    private void c() {
        HwLinkedViewCallBack hwLinkedViewCallBack = this.o;
        if (hwLinkedViewCallBack == null || this.q != Integer.MIN_VALUE) {
            return;
        }
        this.q = hwLinkedViewCallBack.linkedViewHeight();
    }

    private void e() {
        addOnScrollListener(new e());
    }

    private ValueAnimator.AnimatorUpdateListener getAlphaListener() {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: xfm
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.e.a(valueAnimator);
            }
        };
    }

    private Animator.AnimatorListener getDisappearAnimatorListener() {
        return new n();
    }

    private View getFirstVisibleView() {
        int firstVisibleViewIndex = getFirstVisibleViewIndex();
        if (firstVisibleViewIndex < 0) {
            return null;
        }
        return getChildAt(firstVisibleViewIndex);
    }

    private Field getFlingerField() {
        try {
            Field declaredField = RecyclerView.class.getDeclaredField("mViewFlinger");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (ClassNotFoundException unused) {
            Log.e("HwRecyclerView", "getFlingerField: class not found.");
            return null;
        } catch (NoSuchFieldException unused2) {
            Log.e("HwRecyclerView", "getFlingerField: no such field.");
            return null;
        }
    }

    private ValueAnimator.AnimatorUpdateListener getHeightListener() {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: xfo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f52844c.d(valueAnimator);
            }
        };
    }

    private void h(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.y) {
            try {
                this.y = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
            } catch (IllegalArgumentException unused) {
                Log.e("HwRecyclerView", "HwRecyclerView get pointerId error!");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (getChildCount() < 1 || !this.bj) {
            return;
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int height = (int) ((getHeight() * 0.5f) - (childAt.getHeight() * 0.5f));
        if (getPaddingTop() == height || height <= 0) {
            return;
        }
        this.bp = getPaddingTop();
        setPadding(getPaddingLeft(), height, getPaddingRight(), getPaddingBottom());
        View focusedChild = getFocusedChild();
        getLayoutManager().scrollToPosition(focusedChild != null ? getLayoutManager().getPosition(focusedChild) : 0);
    }

    private void r() {
        if (this.bo == null || !ak()) {
            return;
        }
        this.bo.d(this.bq);
    }

    private void setFirstItemCenteringEnabledInternal(boolean z) {
        this.bj = z;
        if (!z) {
            t();
            this.bl = false;
        } else if (getChildCount() > 0) {
            p();
        } else {
            this.bl = true;
        }
    }

    private void setIntegerTranslationX(float f2) {
        setTranslationX((int) f2);
    }

    private void setIntegerTranslationY(float f2) {
        setTranslationY((int) f2);
    }

    private void setSensitivityMode(int i2) {
        if (i2 == 0) {
            this.bd = 1.0f;
        } else if (i2 == 2) {
            this.bd = 0.6f;
        } else {
            this.bd = 0.6f;
        }
    }

    private void setValueFromPlume(Context context) {
        Method methodC = xeh.c("getBoolean", new Class[]{Context.class, View.class, String.class, Boolean.TYPE}, "huawei.android.widget.HwPlume");
        if (methodC == null) {
            return;
        }
        Object objC = xeh.c((Object) null, methodC, new Object[]{context, this, "listScrollEnabled", Boolean.TRUE});
        if (objC instanceof Boolean) {
            setExtendScrollEnabled(((Boolean) objC).booleanValue());
        }
    }

    private void t() {
        if (this.bp != Integer.MIN_VALUE) {
            setPadding(getPaddingLeft(), this.bp, getPaddingRight(), this.bn);
        }
    }

    protected HwGenericEventDetector a() {
        return new HwGenericEventDetector(getContext());
    }

    public boolean a(int i2) {
        HwLinkedViewCallBack hwLinkedViewCallBack;
        if (!this.v || (hwLinkedViewCallBack = this.o) == null) {
            return true;
        }
        int iLinkedViewState = hwLinkedViewCallBack.linkedViewState();
        if ((iLinkedViewState == 0 || ae()) && getTranslationY() >= 0.0f) {
            return true;
        }
        if (iLinkedViewState != 2 || getTranslationY() > 0.0f) {
            return iLinkedViewState == 0 && getTranslationY() <= 0.0f && i2 > 0;
        }
        return true;
    }

    @Override // huawei.android.widget.HwSafeInsetsShareable
    public void addSharedView(View view, int i2) {
        if (view == null || this.bq == null || !ak()) {
            return;
        }
        z();
        this.bo.addSharedView(view, i2);
        if (isAttachedToWindow()) {
            this.bo.c(view, this.bq);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof RecyclerView.LayoutParams;
        if (ak() && z) {
            Object objC = xeh.c(layoutParams, "mViewHolder", (Class<?>) RecyclerView.LayoutParams.class);
            if (objC instanceof RecyclerView.ViewHolder) {
                e(view, ((RecyclerView.ViewHolder) objC).getItemViewType());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    protected float b(int i2, boolean z) {
        float translationY = z ? getTranslationY() : getTranslationX();
        return translationY + d(i2, Math.abs(translationY), (int) ((z ? getHeight() : getWidth()) * this.az));
    }

    public void b() {
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar != null) {
            bqmxoVar.b();
        }
    }

    protected void b(float f2) {
        if (this.f) {
            HwOnOverScrollListener hwOnOverScrollListener = this.aj;
            if (hwOnOverScrollListener != null) {
                hwOnOverScrollListener.onOverScrolled(f2);
            }
            List<HwOnOverScrollListener> list = this.ap;
            if (list != null) {
                Iterator<HwOnOverScrollListener> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onOverScrolled(f2);
                }
            }
        }
    }

    public void b(boolean z) {
        this.as = z;
    }

    protected boolean b(int i2, int i3) {
        if (this.as && !this.f) {
            HwLinkedViewCallBack hwLinkedViewCallBack = this.o;
            if (hwLinkedViewCallBack != null) {
                if (hwLinkedViewCallBack.linkedViewState() != 2 && i2 < 0) {
                    this.h = i3;
                    return false;
                }
                if (this.o.linkedViewState() != 0 && i2 > 0 && getTranslationY() >= 0.0f) {
                    this.h = i3;
                    return false;
                }
            }
            c(i2);
        }
        return this.f;
    }

    public void c(boolean z) {
        this.au = z;
    }

    protected boolean c(float f2, float f3) {
        return ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) < 0 && (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)) >= 0) || ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) > 0 && (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)) <= 0);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        RecyclerView.Adapter adapter = getAdapter();
        if (this.an == null || adapter == null) {
            return super.canScrollHorizontally(i2);
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return super.canScrollHorizontally(i2);
        }
        return i2 > 0 ? b(adapter) : w();
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        RecyclerView.Adapter adapter = getAdapter();
        if (getLayoutManager() instanceof HwFloatingBubblesLayoutManager) {
            return ((HwFloatingBubblesLayoutManager) getLayoutManager()).e(this, i2);
        }
        if (this.an == null || adapter == null) {
            return super.canScrollVertically(i2);
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return super.canScrollVertically(i2);
        }
        return i2 > 0 ? b(adapter) : w();
    }

    protected HwCompoundEventDetector d() {
        return new HwCompoundEventDetector(getContext());
    }

    public void d(boolean z) {
        this.ax = z;
    }

    protected boolean d(int i2) {
        if (this.as && !this.f) {
            if (i2 < 0 && !canScrollHorizontally(1) && this.au) {
                o();
            } else if (i2 <= 0 || canScrollHorizontally(-1) || !this.ax) {
                Log.e("HwRecyclerView", "invalid scroll, do not onOverScrollStart");
            } else {
                o();
            }
        }
        return this.f;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!this.ah) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        HwChainAnimationListener hwChainAnimationListener = this.bt;
        if (hwChainAnimationListener != null) {
            hwChainAnimationListener.dispatchGenericMotionEvent(motionEvent);
        }
        HwGenericEventDetector hwGenericEventDetector = this.ae;
        if (hwGenericEventDetector == null || !hwGenericEventDetector.a(motionEvent)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        HwKeyEventDetector hwKeyEventDetector;
        List<c> list = this.ag;
        if (list != null && list.size() != 0) {
            return true;
        }
        if (keyEvent == null) {
            return false;
        }
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        return (zDispatchKeyEvent || (hwKeyEventDetector = this.am) == null) ? zDispatchKeyEvent : hwKeyEventDetector.e(keyEvent.getKeyCode(), keyEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        boolean zDispatchNestedPreScroll = super.dispatchNestedPreScroll(i2, i3, iArr, iArr2, i4);
        if (this.v && zDispatchNestedPreScroll && iArr2 != null) {
            int[] iArr3 = this.w;
            iArr3[0] = iArr3[0] + iArr2[0];
            iArr3[1] = iArr3[1] + iArr2[1];
        }
        return zDispatchNestedPreScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        boolean zDispatchNestedScroll = super.dispatchNestedScroll(i2, i3, i4, i5, iArr, i6);
        if (this.v && zDispatchNestedScroll && iArr != null) {
            int[] iArr2 = this.w;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        }
        return zDispatchNestedScroll;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        List<c> list = this.ag;
        if (list != null && list.size() != 0) {
            return true;
        }
        HwChainAnimationListener hwChainAnimationListener = this.bt;
        if (hwChainAnimationListener != null) {
            hwChainAnimationListener.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        d(canvas);
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar != null) {
            bqmxoVar.o();
        }
        super.draw(canvas);
    }

    public void e(HwOnOverScrollListener hwOnOverScrollListener) {
        if (this.ap == null) {
            this.ap = new ArrayList();
        }
        if (hwOnOverScrollListener != null) {
            this.ap.add(hwOnOverScrollListener);
        }
    }

    public void e(boolean z) {
        this.ba = z;
    }

    protected boolean e(float f2, float f3) {
        if (k()) {
            scrollBy(0, (int) f3);
            return true;
        }
        if (Float.compare(f2, 0.0f) == 0) {
            f2 = f3;
        }
        scrollBy((int) f2, 0);
        return true;
    }

    protected HwGenericEventDetector.OnScrollListener f() {
        return new h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i2, int i3) {
        if (this.v && this.s.isFinished()) {
            VelocityTracker velocityTracker = this.bh;
            if (velocityTracker == null) {
                Log.w("HwRecyclerView", "fling without velocityTracker");
                return super.fling(i2, i3);
            }
            velocityTracker.computeCurrentVelocity(1000, this.x);
            int i4 = (int) (-this.bh.getYVelocity(this.y));
            this.z = i4;
            this.s.fling(0, 0, 0, i4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager == null) {
                return super.fling(i2, i3);
            }
            if (layoutManager.canScrollVertically()) {
                if (((!canScrollVertically(-1) && this.z < 0) || (!canScrollVertically(-1) && !canScrollVertically(1) && this.z > 0)) && !this.t && Math.abs(this.z) >= this.u && getTranslationY() == 0.0f) {
                    int i5 = this.z > 0 ? 1 : -1;
                    this.t = true;
                    this.l = 0;
                    d(this.s, i5);
                }
            }
        }
        if (!this.bm) {
            return super.fling(i2, i3);
        }
        this.bm = false;
        return super.fling(0, 0);
    }

    public boolean g() {
        return this.bt != null && this.bu;
    }

    public HwChainAnimationListener getChainAnimationListener() {
        return this.bt;
    }

    public int getCheckedItemCount() {
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar == null) {
            return 0;
        }
        return bqmxoVar.c();
    }

    public long[] getCheckedItemIds() {
        bqmxo bqmxoVar = this.bb;
        return bqmxoVar == null ? new long[0] : bqmxoVar.d();
    }

    public SparseBooleanArray getCheckedItemPositions() {
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar != null) {
            return bqmxoVar.g();
        }
        Log.e("HwRecyclerView", "mHwMultipleChoiceModeHelper: is null");
        return null;
    }

    public ActionMode getChoiceActionMode() {
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar != null) {
            return bqmxoVar.h();
        }
        Log.e("HwRecyclerView", "mHwMultipleChoiceModeHelper: is null");
        return null;
    }

    public int getChoiceMode() {
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar == null) {
            return 0;
        }
        return bqmxoVar.j();
    }

    @Override // android.view.View
    protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
        return this.ac;
    }

    public int getFirstVisibleViewIndex() {
        int childCount = getChildCount();
        if (childCount == 0 || this.ag == null) {
            return -1;
        }
        int paddingTop = getPaddingTop();
        int size = this.ag.size();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && !childAt.isDirty() && childAt.getBottom() >= paddingTop) {
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = 0;
                        break;
                    }
                    if (this.ag.get(i3).f29653c == childAt) {
                        break;
                    }
                    i3++;
                }
                if (i3 == size || !this.ag.get(i3).f29652b) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public HwLinkedViewCallBack getLinkedViewCallBack() {
        return this.o;
    }

    public MultiChoiceModeListener getMultiChoiceModeListener() {
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar != null) {
            return bqmxoVar.i();
        }
        Log.e("HwRecyclerView", "mHwMultipleChoiceModeHelper: is null");
        return null;
    }

    public HwKeyEventDetector.OnEditEventListener getOnEditEventListener() {
        HwKeyEventDetector hwKeyEventDetector = this.am;
        if (hwKeyEventDetector != null) {
            return hwKeyEventDetector.c();
        }
        return null;
    }

    @Deprecated
    public OnItemClickListener getOnItemClickListener() {
        return null;
    }

    @Deprecated
    public OnItemLongClickListener getOnItemLongClickListener() {
        return null;
    }

    public HwKeyEventDetector.OnSearchEventListener getOnSearchEventListener() {
        HwKeyEventDetector hwKeyEventDetector = this.am;
        if (hwKeyEventDetector != null) {
            return hwKeyEventDetector.a();
        }
        return null;
    }

    public float getOverScrollFactor() {
        return this.az;
    }

    @Deprecated
    public HwOnOverScrollListener getOverScrollListener() {
        return this.aj;
    }

    OverScroller getOverScroller() {
        Field field = this.m;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            Object objC = xeh.c(obj, "mScroller", this.m.getType());
            if (objC == null) {
                objC = xeh.c(obj, "mOverScroller", this.m.getType());
            }
            if (objC instanceof OverScroller) {
                return (OverScroller) objC;
            }
        } catch (IllegalAccessException unused) {
            Log.e("HwRecyclerView", "getOverScroller: illegal access.");
        }
        return null;
    }

    public float getScrollTopFactor() {
        return this.ao;
    }

    public float getSensitivity() {
        HwGenericEventDetector hwGenericEventDetector = this.ae;
        if (hwGenericEventDetector != null) {
            return hwGenericEventDetector.e();
        }
        return 0.6f;
    }

    public void h() {
        ValueAnimator valueAnimator = this.bx;
        if ((valueAnimator == null || !valueAnimator.isRunning()) && k() && canScrollVertically(-1) && getWindowVisibility() == 0 && hasWindowFocus()) {
            post(new j());
        }
    }

    protected HwKeyEventDetector i() {
        return new HwKeyEventDetector(getContext());
    }

    protected HwRotaryConverter j() {
        Log.i("HwRecyclerView", "Overwrite createRotaryConverter in the watch package.");
        return null;
    }

    protected boolean k() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        return (layoutManager == null || !layoutManager.canScrollVertically() || layoutManager.canScrollHorizontally()) ? false : true;
    }

    protected void l() {
        if (getTranslationY() == 0.0f && getTranslationX() == 0.0f && this.f) {
            this.f = false;
            HwOnOverScrollListener hwOnOverScrollListener = this.aj;
            if (hwOnOverScrollListener != null) {
                hwOnOverScrollListener.onOverScrollEnd();
            }
            List<HwOnOverScrollListener> list = this.ap;
            if (list != null) {
                Iterator<HwOnOverScrollListener> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onOverScrollEnd();
                }
            }
            setScrollStateExtend(0);
        }
    }

    protected boolean n() {
        return true;
    }

    protected void o() {
        if (this.f) {
            return;
        }
        this.f = true;
        HwOnOverScrollListener hwOnOverScrollListener = this.aj;
        if (hwOnOverScrollListener != null) {
            hwOnOverScrollListener.onOverScrollStart();
        }
        List<HwOnOverScrollListener> list = this.ap;
        if (list != null) {
            Iterator<HwOnOverScrollListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onOverScrollStart();
            }
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (ak()) {
            this.bq.c(windowInsets);
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        HwCompoundEventDetector hwCompoundEventDetector;
        super.onAttachedToWindow();
        this.bq.c(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.bs.set(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        x();
        if (this.bc == null) {
            this.bc = d();
        }
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar != null && (hwCompoundEventDetector = this.bc) != null) {
            hwCompoundEventDetector.c(this, bqmxoVar.f());
        }
        if (this.bj) {
            getViewTreeObserver().addOnPreDrawListener(this.bw);
        }
        HwChainAnimationListener hwChainAnimationListener = this.bt;
        if (hwChainAnimationListener != null) {
            hwChainAnimationListener.onAttachedToWindow();
            addOnScrollListener(this.bt);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (getLayoutManager() instanceof HwFloatingBubblesLayoutManager) {
            ((HwFloatingBubblesLayoutManager) getLayoutManager()).b(this);
        }
        xgl xglVar = this.bo;
        if (xglVar != null) {
            xglVar.e(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29647a.a();
        y();
        HwCompoundEventDetector hwCompoundEventDetector = this.bc;
        if (hwCompoundEventDetector != null) {
            hwCompoundEventDetector.e();
        }
        if (this.bj) {
            getViewTreeObserver().removeOnPreDrawListener(this.bw);
        }
        HwChainAnimationListener hwChainAnimationListener = this.bt;
        if (hwChainAnimationListener != null) {
            hwChainAnimationListener.onDetachedFromWindow();
            removeOnScrollListener(this.bt);
        }
    }

    @Override // android.view.View
    public void onDrawForeground(Canvas canvas) {
        float[] fArr = {0.0f, 0.0f};
        if (!d(fArr)) {
            super.onDrawForeground(canvas);
            return;
        }
        float scrollX = getScrollX() - fArr[0];
        float scrollY = getScrollY() - fArr[1];
        canvas.translate(scrollX, scrollY);
        super.onDrawForeground(canvas);
        canvas.translate(-scrollX, -scrollY);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        HwGenericEventDetector hwGenericEventDetector;
        if (motionEvent == null) {
            return false;
        }
        HwCompoundEventDetector hwCompoundEventDetector = this.bc;
        if (hwCompoundEventDetector != null && hwCompoundEventDetector.a(motionEvent)) {
            return true;
        }
        if (this.ah && (hwGenericEventDetector = this.ae) != null && hwGenericEventDetector.c(motionEvent)) {
            return this.aw;
        }
        if (motionEvent.getAction() == 11 && motionEvent.isFromSource(2)) {
            int buttonState = motionEvent.getButtonState();
            bqmxo bqmxoVar = this.bb;
            if (bqmxoVar != null && (buttonState == 32 || buttonState == 2)) {
                bqmxoVar.c(motionEvent);
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.e("HwRecyclerView", "onInterceptTouchEvent: motionEvent is null");
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        this.p = actionMasked;
        if (actionMasked == 0) {
            if (this.bz) {
                this.d.a(motionEvent);
            }
            ap();
        }
        if ((actionMasked == 2 && this.g) || super.onInterceptTouchEvent(motionEvent) || this.f) {
            return true;
        }
        if (!this.as) {
            return false;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (!aj() && !af()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        e(motionEvent, actionMasked, actionIndex);
        return this.g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        RecyclerView.Adapter adapter;
        super.onLayout(z, i2, i3, i4, i5);
        if (ak() && (adapter = getAdapter()) != null) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt != null) {
                    int childAdapterPosition = getChildAdapterPosition(childAt);
                    if (childAdapterPosition == -1 || childAdapterPosition >= adapter.getItemCount()) {
                        Log.w("HwRecyclerView", "the position is " + childAdapterPosition);
                        break;
                    }
                    e(childAt, adapter.getItemViewType(childAdapterPosition));
                    bqmxo bqmxoVar = this.bb;
                    if (bqmxoVar != null) {
                        bqmxoVar.b(childAt, childAdapterPosition);
                    }
                }
            }
            Rect rectE = this.bq.e(this);
            if (rectE != null) {
                this.bv.set(rectE);
            }
            c();
            r();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        bqmxo bqmxoVar = this.bb;
        Parcelable parcelableB = bqmxoVar != null ? bqmxoVar.b(parcelable) : null;
        if (parcelableB != null) {
            super.onRestoreInstanceState(parcelableB);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        bqmxo bqmxoVar = this.bb;
        return bqmxoVar == null ? parcelableOnSaveInstanceState : bqmxoVar.c(parcelableOnSaveInstanceState);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.w("HwRecyclerView", "onTouchEvent(): motionEvent can not be null!");
            return false;
        }
        this.f29647a.d(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        this.p = actionMasked;
        if (c(motionEvent, actionMasked)) {
            return true;
        }
        int actionIndex = motionEvent.getActionIndex();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        b(actionMasked);
        int[] iArr = this.w;
        motionEventObtain.offsetLocation(iArr[0], iArr[1]);
        return a(motionEvent, actionMasked, actionIndex, motionEventObtain);
    }

    protected boolean q() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        return layoutManager.canScrollVertically() ? a("translationY", 0.0f, 0.0f) : a("translationX", 0.0f, 0.0f);
    }

    @Override // huawei.android.widget.HwSafeInsetsShareable
    public void removeSharedView(View view) {
        xgl xglVar = this.bo;
        if (xglVar != null) {
            xglVar.removeSharedView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        View childAt;
        if (g() && (childAt = getChildAt(i2)) != null) {
            childAt.setTranslationY(0.0f);
            childAt.setTranslationX(0.0f);
        }
        super.removeViewAt(i2);
    }

    protected void s() {
    }

    @Override // huawei.android.widget.ScrollCallback
    public void scrollToTop() {
        h();
    }

    public void setAdaptOverScrollEnabled(boolean z) {
        this.av = z;
        if (z) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).setClipChildren(false);
            } else {
                Log.w("HwRecyclerView", "setAdaptScrollBarEnabled: parent is invalid.");
                this.av = false;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar != null) {
            bqmxoVar.a(adapter);
        }
        super.setAdapter(adapter);
    }

    public void setAutoScrollEnable(boolean z) {
        this.bf = z;
    }

    public void setChainAnimationEnabled(boolean z) {
        if (this.bu == z) {
            return;
        }
        this.bu = z;
        if (z) {
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                childAt.setTranslationY(0.0f);
                childAt.setTranslationX(0.0f);
            }
        }
    }

    public void setChainAnimationListener(HwChainAnimationListener hwChainAnimationListener) {
        this.bt = hwChainAnimationListener;
    }

    public void setChoiceMode(int i2) {
        if (this.bb == null) {
            this.bb = new bqmxo(this);
        }
        this.bb.a(i2);
    }

    void setDetectoredLongpressEnabled(boolean z) {
        GestureDetector gestureDetector = this.ab;
        if (gestureDetector != null) {
            gestureDetector.setIsLongpressEnabled(z);
        }
    }

    public void setExtendScrollConsumedEvent(boolean z) {
        this.aw = z;
    }

    public void setExtendScrollEnabled(boolean z) {
        this.ah = z;
    }

    public void setExtendedMultiChoiceEnabled(boolean z, boolean z2) {
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar == null) {
            Log.e("HwRecyclerView", "mHwMultipleChoiceModeHelper: is null");
        } else {
            bqmxoVar.c(z, z2);
        }
    }

    public void setFirstItemCenteringEnabled(boolean z) {
        setFirstItemCenteringEnabledInternal(z);
    }

    public void setItemChecked(int i2, boolean z) {
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar == null) {
            Log.e("HwRecyclerView", "mHwMultipleChoiceModeHelper: is null");
        } else {
            bqmxoVar.d(i2, z);
        }
    }

    public void setLastItemCenteringEnabled(boolean z) {
        this.bi = z;
        removeOnScrollListener(this.i);
        if (this.bi) {
            addOnScrollListener(this.i);
        } else if (this.bn != Integer.MIN_VALUE) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.bn);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            this.an = OrientationHelper.createOrientationHelper(layoutManager, ((StaggeredGridLayoutManager) layoutManager).getOrientation());
        } else {
            this.an = null;
        }
        super.setLayoutManager(layoutManager);
    }

    public void setLinkedViewCallBack(HwLinkedViewCallBack hwLinkedViewCallBack) {
        this.o = hwLinkedViewCallBack;
        x();
    }

    public void setMaxFlingVelocity(int i2) {
        Class<?> clsAo;
        if (this.x == i2 || (clsAo = ao()) == null) {
            return;
        }
        try {
            Field declaredField = clsAo.getDeclaredField("mMaxFlingVelocity");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(i2));
            this.x = getMaxFlingVelocity();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            Log.e("HwRecyclerView", "set max fling velocity failed.");
        }
    }

    public void setMinFlingVelocity(int i2) {
        Class<?> clsAo;
        if (this.u == i2 || (clsAo = ao()) == null) {
            return;
        }
        try {
            Field declaredField = clsAo.getDeclaredField("mMinFlingVelocity");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(i2));
            this.u = getMinFlingVelocity();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            Log.e("HwRecyclerView", "set min fling velocity failed.");
        }
    }

    public void setMultiChoiceModeListener(MultiChoiceModeListener multiChoiceModeListener) {
        if (this.bb == null) {
            this.bb = new bqmxo(this);
        }
        this.bb.e(multiChoiceModeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        if (this.v && isAttachedToWindow() && !this.r) {
            return;
        }
        super.setNestedScrollingEnabled(z);
    }

    public void setOnEditEventListener(HwKeyEventDetector.OnEditEventListener onEditEventListener) {
        ad();
        HwKeyEventDetector hwKeyEventDetector = this.am;
        if (hwKeyEventDetector != null) {
            hwKeyEventDetector.e(onEditEventListener);
        }
    }

    @Deprecated
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
    }

    @Deprecated
    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
    }

    public void setOnSearchEventListener(HwKeyEventDetector.OnSearchEventListener onSearchEventListener) {
        ad();
        HwKeyEventDetector hwKeyEventDetector = this.am;
        if (hwKeyEventDetector != null) {
            hwKeyEventDetector.a(onSearchEventListener);
        }
    }

    public void setOverScrollFactor(float f2) {
        if (Float.compare(f2, 0.0f) <= 0 || Float.compare(f2, 1.0f) > 0) {
            Log.w("HwRecyclerView", "setOverScrollFactor: input is invalid.");
        } else {
            this.az = f2;
        }
    }

    @Deprecated
    public void setOverScrollListener(HwOnOverScrollListener hwOnOverScrollListener) {
        this.aj = hwOnOverScrollListener;
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        this.bq.c(i2, i3, i4, i5);
    }

    public void setPageTurningScrollEnabled(boolean z) {
        this.bz = z;
        if (z && this.d == null) {
            this.d = new xfj(this);
        }
    }

    public void setPageTurningThresholdRatioHorizontal(float f2) {
        if (Float.compare(f2, 0.0f) < 0 || Float.compare(f2, 1.0f) > 0) {
            Log.e("HwRecyclerView", "Please ensure that the value of ratio is greater than 0.0f and less than 1.0f.");
            return;
        }
        xfj xfjVar = this.d;
        if (xfjVar != null) {
            xfjVar.b(f2);
        }
    }

    public void setPageTurningThresholdRatioVertical(float f2) {
        if (Float.compare(f2, 0.0f) < 0 || Float.compare(f2, 1.0f) > 0) {
            Log.e("HwRecyclerView", "Please ensure that the value of ratio is greater than 0.0f and less than 1.0f.");
            return;
        }
        xfj xfjVar = this.d;
        if (xfjVar != null) {
            xfjVar.d(f2);
        }
    }

    protected void setScrollStateExtend(int i2) {
        if (this.at == null) {
            try {
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("setScrollState", Integer.TYPE);
                this.at = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                Log.w("HwRecyclerView", "setScrollStateExtend not found method");
            } catch (NoSuchMethodException unused2) {
                Log.w("HwRecyclerView", "setScrollStateExtend no such method");
            }
        }
        Method method = this.at;
        if (method == null) {
            return;
        }
        try {
            method.invoke(this, Integer.valueOf(i2));
        } catch (IllegalAccessException unused3) {
            Log.w("HwRecyclerView", "setScrollStateExtend illegal access");
        } catch (InvocationTargetException unused4) {
            Log.w("HwRecyclerView", "setScrollStateExtend invocation target");
        }
    }

    public void setScrollTopEnable(boolean z) {
    }

    public void setScrollTopFactor(float f2) {
        this.ao = f2;
    }

    public void setScroller(OverScroller overScroller) {
        if (overScroller == null) {
            return;
        }
        this.s = overScroller;
    }

    public void setSensitivity(float f2) {
        HwGenericEventDetector hwGenericEventDetector = this.ae;
        if (hwGenericEventDetector != null) {
            hwGenericEventDetector.d(f2);
        }
    }

    public void setSmoothScrollInterpolator(Interpolator interpolator) {
        this.by = interpolator;
    }

    public void setSubHeaderDeleteUpdate(Runnable runnable) {
        this.al = runnable;
    }

    @Override // android.view.View
    public boolean showContextMenu() {
        return c(0.0f, 0.0f, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean showContextMenuForChild(View view) {
        if (this.af) {
            return false;
        }
        return d(view, 0.0f, 0.0f, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(int i2, int i3) {
        OverScroller overScroller;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            super.smoothScrollBy(i2, i3);
            return;
        }
        Interpolator interpolator = this.by;
        if (interpolator != null) {
            if (interpolator instanceof crd) {
                super.smoothScrollBy(i2, i3, interpolator, (int) ((crd) interpolator).getDuration());
                return;
            } else {
                super.smoothScrollBy(i2, i3, interpolator);
                return;
            }
        }
        if ((!layoutManager.canScrollHorizontally() || i2 == 0) && (!layoutManager.canScrollVertically() || i3 == 0)) {
            super.smoothScrollBy(i2, i3);
            return;
        }
        if (n() && (overScroller = getOverScroller()) != null) {
            overScroller.fling(0, 0, 0, 0, 0, 0, 0, 0);
            overScroller.abortAnimation();
        }
        super.smoothScrollBy(i2, i3);
    }

    public HwRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwRecyclerViewStyle);
    }

    private void ab() {
        this.f29647a = new xfq(new l());
    }

    private void ac() {
        Field flingerField = getFlingerField();
        this.m = flingerField;
        if (flingerField == null) {
            Log.e("HwRecyclerView", "mFlingerField: getFlingerField failed!");
        } else {
            e();
        }
    }

    private void ad() {
        if (this.am == null) {
            this.am = i();
        }
    }

    private boolean ae() {
        HwLinkedViewCallBack hwLinkedViewCallBack = this.o;
        return hwLinkedViewCallBack != null && hwLinkedViewCallBack.linkedViewHeight() > this.q;
    }

    private boolean ah() {
        return this.k.e() && this.n.a();
    }

    private boolean ai() {
        return getLayoutDirection() == 1;
    }

    static /* synthetic */ int c(HwRecyclerView hwRecyclerView, int i2) {
        int i3 = hwRecyclerView.aq + i2;
        hwRecyclerView.aq = i3;
        return i3;
    }

    private boolean i(MotionEvent motionEvent) {
        if (!this.bz) {
            return false;
        }
        setScrollStateExtend(1);
        motionEvent.recycle();
        return true;
    }

    private void z() {
        if (this.bo == null) {
            this.bo = new xgl();
        }
    }

    boolean m() {
        return this.g;
    }

    @Override // android.view.View
    public boolean showContextMenu(float f2, float f3) {
        return c(f2, f3, true);
    }

    /* JADX INFO: loaded from: classes44.dex */
    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f29652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f29653c;
        int d;
        int e;
        float f;
        int g;
        int h;
        ViewGroupOverlay i;
        xfv j;
        boolean k;
        final /* synthetic */ HwRecyclerView l;
        boolean o;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(float f) {
            this.f = f;
            if (this.h == 0) {
                this.f = 0.0f;
            }
            xfv xfvVar = this.j;
            if (xfvVar != null) {
                xfvVar.setAlpha(((int) this.f) * 255);
            }
            View view = this.f29653c;
            if (view != null) {
                if (this.o) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(this.f);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c(int i, int i2) {
            xfv xfvVar;
            int i3 = this.h;
            this.h = i;
            View view = this.f29653c;
            if (view == null) {
                return 0;
            }
            int top = view.getTop();
            ViewGroupOverlay viewGroupOverlay = this.i;
            if (viewGroupOverlay != null && (xfvVar = this.j) != null) {
                int i4 = this.h;
                if (i4 > 0) {
                    if (!this.o) {
                        viewGroupOverlay.add(xfvVar);
                        this.o = true;
                        this.f29653c.setAlpha(0.0f);
                    }
                    int i5 = this.g;
                    if (i5 > top) {
                        this.j.c(this.f29653c.getLeft(), top - i2);
                    } else if (i5 < top) {
                        this.j.c(this.f29653c.getLeft(), (i3 - this.h) + top);
                    } else {
                        this.j.c(this.f29653c.getLeft(), top);
                    }
                    this.j.a(0, this.h - this.f29651a);
                    i3 -= this.h;
                } else if (i4 == 0 && this.o) {
                    viewGroupOverlay.remove(xfvVar);
                    this.j = null;
                } else {
                    Log.e("HwRecyclerView", "invalid height");
                }
                i2 += i3;
            }
            if (this.h == 0) {
                RecyclerView.ViewHolder childViewHolder = this.l.getChildViewHolder(this.f29653c);
                this.k = childViewHolder.isRecyclable();
                childViewHolder.setIsRecyclable(false);
            }
            this.g = top;
            this.f29653c.getLayoutParams().height = this.h;
            this.f29653c.requestLayout();
            return i2;
        }
    }

    public HwRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(c(context, i2), attributeSet, i2);
        g gVar = null;
        this.ad = null;
        this.ag = null;
        this.ai = -1;
        this.ak = -1;
        this.al = null;
        this.as = true;
        this.ax = true;
        this.au = true;
        this.av = false;
        this.ba = true;
        this.bq = new xgo(this);
        this.bs = new Rect();
        this.bv = new Rect();
        this.cb = new HashMap(0);
        this.f29648c = -1;
        this.f = false;
        this.g = false;
        this.n = new f(this, gVar);
        this.k = new d(this, gVar);
        this.s = new OverScroller(getContext(), f29646b);
        this.t = false;
        this.q = Integer.MIN_VALUE;
        this.r = false;
        this.v = false;
        this.w = new int[2];
        this.y = -1;
        this.z = Integer.MIN_VALUE;
        this.aa = 0L;
        this.ac = null;
        this.af = false;
        this.ah = true;
        this.am = null;
        this.an = null;
        this.aq = 0;
        this.ao = 8.0f;
        this.aw = false;
        this.at = null;
        this.az = 0.5f;
        this.bd = 0.6f;
        this.bp = Integer.MIN_VALUE;
        this.bn = Integer.MIN_VALUE;
        this.bu = false;
        this.bw = new o();
        this.i = new k();
        e(super.getContext(), attributeSet, i2);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.x = viewConfiguration.getScaledMaximumFlingVelocity();
        this.u = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    private boolean h(int i2) {
        return this.ao >= 0.0f && this.aq > 0 && i2 < 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        boolean z = !this.t && this.s.getCurrVelocity() > 0.0f;
        boolean z2 = this.p == 1 && Math.abs(this.z) >= this.u;
        boolean z3 = getTranslationY() == 0.0f;
        boolean z4 = !canScrollVertically(-1) && this.z < 0;
        boolean z5 = !canScrollVertically(1) && this.z > 0;
        boolean z6 = z && z2 && z3;
        boolean z7 = z4 || z5;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null && this.v && layoutManager.canScrollVertically()) {
            if (!aj()) {
                this.s.computeScrollOffset();
                this.l = this.s.getCurrY();
            } else if (z6 && z7) {
                this.t = true;
                d(this.s, this.z <= 0 ? -1 : 1);
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        if (this.f || !this.bf || motionEvent == null) {
            return;
        }
        int y = (int) motionEvent.getY(motionEvent.getActionIndex());
        double dApplyDimension = TypedValue.applyDimension(1, 90.0f, getContext().getResources().getDisplayMetrics());
        double d2 = y;
        if (((double) getHeight()) - dApplyDimension < d2) {
            this.bk = true;
            this.bm = true;
            i(b(false, y));
        } else if (d2 < dApplyDimension) {
            this.bk = true;
            this.bm = true;
            i(b(true, y));
        } else if (this.bk) {
            am();
        }
    }

    private void b(Context context, AttributeSet attributeSet, int i2) {
        if (attributeSet == null) {
            Log.w("HwRecyclerView", "Attribute set is null");
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwRecyclerView, i2, 0);
        this.be = typedArrayObtainStyledAttributes.getInt(R.styleable.HwRecyclerView_hwSensitivityMode, 1);
        int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.HwRecyclerView_android_choiceMode, 0);
        if (i3 != 0) {
            setChoiceMode(i3);
        }
        typedArrayObtainStyledAttributes.recycle();
        HwGenericEventDetector hwGenericEventDetectorA = a();
        this.ae = hwGenericEventDetectorA;
        if (hwGenericEventDetectorA != null) {
            setSensitivityMode(this.be);
            this.ae.d(this.bd);
            this.ae.c(this, f());
            this.ae.a(j());
        }
    }

    private void y() {
        ValueAnimator valueAnimator = this.bx;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.bx.cancel();
        }
        f fVar = this.n;
        if (fVar != null) {
            fVar.e();
        }
    }

    private void aa() {
        List<c> list = this.ag;
        if (list != null) {
            list.clear();
        }
        bqmxo bqmxoVar = this.bb;
        if (bqmxoVar != null) {
            bqmxoVar.a();
        }
        this.ai = -1;
        this.ak = -1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean showContextMenuForChild(View view, float f2, float f3) {
        return d(view, f2, f3, true);
    }

    private void b(MotionEvent motionEvent) {
        h(motionEvent);
        al();
    }

    private static Context c(Context context, int i2) {
        return xfs.c(context, i2, R.style.Theme_Emui_HwRecyclerView);
    }

    private void e(Context context, AttributeSet attributeSet, int i2) {
        b(context, attributeSet, i2);
        if (isInEditMode() && super.getLayoutManager() == null) {
            super.setLayoutManager(new LinearLayoutManager(context, 1, false));
        }
        this.ay = true;
        this.ar = context.getResources().getDisplayMetrics().densityDpi;
        this.j = ViewConfiguration.get(context).getScaledTouchSlop();
        this.bq.d(context, attributeSet);
        ab();
        ac();
        setValueFromPlume(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwRecyclerView, i2, R.style.Widget_Emui_HwRecyclerView);
        this.bz = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwRecyclerView_hwPageTurningScrollEnabled, false);
        float f2 = typedArrayObtainStyledAttributes.getFloat(R.styleable.HwRecyclerView_hwPageTurningThresholdRatioVertical, 0.125f);
        float f3 = typedArrayObtainStyledAttributes.getFloat(R.styleable.HwRecyclerView_hwPageTurningThresholdRatioHorizontal, 0.125f);
        typedArrayObtainStyledAttributes.recycle();
        if (this.bz) {
            xfj xfjVar = new xfj(this);
            this.d = xfjVar;
            xfjVar.d(f2);
            this.d.b(f3);
        }
    }

    private void c(int i2, MotionEvent motionEvent) {
        this.f29648c = motionEvent.getPointerId(i2);
        this.e = (int) motionEvent.getRawX();
        this.h = (int) motionEvent.getRawY();
        int i3 = getTranslationY() > 0.0f ? 1 : -1;
        if ((getTranslationY() > 0.0f && a(i3)) || getTranslationX() > 0.0f) {
            this.g = true;
            this.f = true;
        } else if ((getTranslationY() < 0.0f && a(i3)) || getTranslationX() < 0.0f) {
            this.g = true;
            this.f = true;
        } else {
            this.g = false;
            this.f = false;
        }
        if (this.bh == null) {
            this.bh = VelocityTracker.obtain();
        }
        y();
        this.bh.clear();
        this.bh.addMovement(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i2) {
        if (k()) {
            this.bt.onScrolled(this, 0, i2);
        } else {
            this.bt.onScrolled(this, i2, 0);
        }
    }

    private boolean e(int i2) {
        a aVar;
        if (this.bk && i2 == 1) {
            this.bk = false;
            am();
        }
        if ((!this.bk || i2 == 1) && (aVar = this.br) != null) {
            aVar.d();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(ValueAnimator valueAnimator) {
        int i2;
        if (valueAnimator == null) {
            Log.e("HwRecyclerView", "getHeightListener: onAnimationUpdate: animation is null");
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int size = this.ag.size();
        int iC = 0;
        for (int i3 = 0; i3 < size; i3++) {
            c cVar = this.ag.get(i3);
            if (cVar.f29652b) {
                int i4 = cVar.d;
                if (i4 > 0 && (i2 = cVar.f29651a) > 0) {
                    int i5 = (int) (i4 * fFloatValue);
                    int i6 = cVar.e;
                    if (i5 > i6) {
                        if (cVar.f29653c == null) {
                            Log.e("HwRecyclerView", "getHeightListener: view is null.");
                        } else {
                            int i7 = (i6 + i2) - i5;
                            if (i7 > 0) {
                                iC = cVar.c(i7, iC);
                            } else if (cVar.h > 0) {
                                iC = cVar.c(0, iC);
                            }
                        }
                    }
                } else {
                    Log.e("HwRecyclerView", "getHeightListener: mHeightTotal or mHeightOriginal is invalid.");
                }
            }
        }
        Runnable runnable = this.al;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void d(MotionEvent motionEvent) {
        int rawY = (int) motionEvent.getRawY();
        int rawX = (int) motionEvent.getRawX();
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = layoutManager.canScrollVertically();
        if (Math.abs(rawY - this.h) > this.j && zCanScrollVertically) {
            this.g = true;
        }
        if (Math.abs(rawX - this.e) <= this.j || !zCanScrollHorizontally) {
            return;
        }
        this.g = true;
    }

    private void e(MotionEvent motionEvent, int i2, MotionEvent motionEvent2) {
        this.y = motionEvent.getPointerId(0);
        y();
        c(i2, motionEvent2);
        if (!motionEvent.isFromSource(8194) || (motionEvent.getButtonState() & 2) == 0) {
            return;
        }
        showContextMenu(motionEvent.getX(), motionEvent.getY());
    }

    private void c(int i2) {
        if (i2 < 0 && !canScrollVertically(1) && this.au) {
            o();
        } else if (i2 > 0 && !canScrollVertically(-1) && this.ax) {
            o();
        } else {
            Log.d("HwRecyclerView", "do nothing.");
        }
    }

    private boolean d(int i2, MotionEvent motionEvent) {
        int iD = d(i2, this.h);
        if (this.g && this.as) {
            if (c(motionEvent)) {
                return true;
            }
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (computeVerticalScrollRange() != 0 && b(iD, i2)) {
                float translationY = getTranslationY();
                float fB = b(iD, true);
                int i3 = (int) fB;
                if (c(translationY, i3)) {
                    setIntegerTranslationY(0.0f);
                    if (this.bt != null) {
                        g((int) translationY);
                    }
                    scrollBy(0, -i3);
                    l();
                    setScrollStateExtend(1);
                    invalidate();
                    int[] iArr = this.w;
                    iArr[1] = (int) (iArr[1] - translationY);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(0);
                    return super.onTouchEvent(motionEventObtain);
                }
                this.h = i2;
                float fAbs = Math.abs(getTranslationY());
                setIntegerTranslationY(fB);
                HwChainAnimationListener hwChainAnimationListener = this.bt;
                if (hwChainAnimationListener != null) {
                    hwChainAnimationListener.onOverScroll(iD, (int) fAbs);
                }
                int[] iArr2 = this.w;
                iArr2[1] = (int) (iArr2[1] - (translationY - fB));
                b(fB);
                invalidate();
                return true;
            }
            this.h = i2;
        }
        return false;
    }

    private void e(int i2, MotionEvent motionEvent) {
        a aVar;
        VelocityTracker velocityTracker = this.bh;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
            this.bh.computeCurrentVelocity(1000, this.x);
        }
        if (i2 < 0) {
            return;
        }
        if (!this.bk && (aVar = this.br) != null) {
            aVar.d();
        }
        if (getLayoutManager() == null) {
            return;
        }
        q();
        this.g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(OverScroller overScroller, int i2, int i3, long j2) {
        if (this.as && this.ba) {
            if (i3 >= 0 || this.ax) {
                if (i3 <= 0 || this.au) {
                    if (i2 >= 0 || this.ax) {
                        if (i2 <= 0 || this.au) {
                            float currVelocity = overScroller.getCurrVelocity();
                            if (Float.isNaN(currVelocity)) {
                                return;
                            }
                            RecyclerView.LayoutManager layoutManager = getLayoutManager();
                            if (layoutManager == null) {
                                Log.e("HwRecyclerView", "startOverFling: call getLayoutManager failed");
                                return;
                            }
                            if (layoutManager.canScrollHorizontally()) {
                                if (i2 < 0) {
                                    currVelocity = -currVelocity;
                                }
                                this.n.e(0, -currVelocity, 0, 0, 0L);
                                overScroller.abortAnimation();
                            }
                            if (layoutManager.canScrollVertically()) {
                                if (i3 < 0) {
                                    currVelocity = -currVelocity;
                                }
                                this.n.e(1, -currVelocity, 0, 0, j2);
                                overScroller.abortAnimation();
                            }
                        }
                    }
                }
            }
        }
    }

    private void i(int i2) {
        if (this.br == null) {
            this.br = new a(this, null);
        }
        this.br.c(i2);
    }

    private boolean c(MotionEvent motionEvent) {
        if (canScrollVertically(1) && getTranslationY() < 0.0f && this.f) {
            e(motionEvent);
            return true;
        }
        if (!(getLayoutManager() instanceof HwFloatingBubblesLayoutManager) || !canScrollVertically(-1) || getTranslationY() <= 0.0f || !this.f) {
            return false;
        }
        e(motionEvent);
        return true;
    }

    private void d(OverScroller overScroller, int i2) {
        if (!ah()) {
            ap();
        }
        OverScroller overScroller2 = getOverScroller();
        if (overScroller2 != null) {
            overScroller2.abortAnimation();
        }
        startNestedScroll(2, 0);
        this.k.d(overScroller, i2);
    }

    private void e(View view, int i2) {
        Rect rect;
        if (view == null) {
            return;
        }
        int layoutDirection = getLayoutDirection();
        if (view.getLayoutDirection() != layoutDirection) {
            view.setLayoutDirection(layoutDirection);
        }
        Rect rect2 = this.cb.get(Integer.valueOf(i2));
        if (rect2 == null) {
            rect = new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            this.cb.put(Integer.valueOf(i2), rect);
            rect2 = rect;
        } else {
            rect = new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
        Rect rectE = this.bq.e(this, rect2);
        if (rectE == null) {
            rectE = new Rect(rect2);
            Log.w("HwRecyclerView", "HwWidgetSafeInsets.getDisplaySafeInsets() is null!");
        }
        Rect rect3 = new Rect(rectE.left, view.getPaddingTop(), rectE.right, view.getPaddingBottom());
        if (rect.equals(rect3)) {
            return;
        }
        this.bq.e(view, rect3, false);
    }

    private void x() {
        HwLinkedViewCallBack hwLinkedViewCallBack = this.o;
        if (hwLinkedViewCallBack == null) {
            this.v = false;
        } else if (hwLinkedViewCallBack.linkedViewState() != -1 && getOverScrollMode() != 2 && isNestedScrollingEnabled()) {
            this.v = true;
        } else {
            this.v = false;
        }
    }

    private void e(MotionEvent motionEvent, int i2, int i3) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (getLayoutManager() == null) {
                        return;
                    }
                    d(motionEvent);
                    return;
                } else if (i2 != 3) {
                    if (i2 == 5) {
                        this.y = motionEvent.getPointerId(i3);
                        return;
                    } else {
                        if (i2 != 6) {
                            return;
                        }
                        h(motionEvent);
                        return;
                    }
                }
            }
            this.f29648c = -1;
            if (this.g) {
                return;
            }
            q();
            return;
        }
        this.y = motionEvent.getPointerId(0);
        c(i3, motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        if (valueAnimator == null) {
            Log.e("HwRecyclerView", "getAlphaListener: onAnimationUpdate: animation is null");
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int size = this.ag.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.ag.get(i2);
            if (cVar.f29652b) {
                View view = cVar.f29653c;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                cVar.b(fFloatValue);
            }
        }
    }

    private boolean c(MotionEvent motionEvent, int i2) {
        if (e(i2)) {
            return true;
        }
        if (motionEvent.getActionMasked() != 2) {
            return false;
        }
        a(motionEvent);
        return false;
    }

    private boolean a(MotionEvent motionEvent, int i2, int i3, MotionEvent motionEvent2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 5) {
                            b(motionEvent, i3, motionEvent2);
                        } else if (i2 == 6) {
                            b(motionEvent2);
                        }
                    }
                } else {
                    if (i(motionEvent2)) {
                        return false;
                    }
                    if (b(i3, motionEvent, motionEvent2)) {
                        motionEvent2.recycle();
                        return true;
                    }
                }
            } else if (c(motionEvent, motionEvent2)) {
                return true;
            }
            e(i3, motionEvent2);
        } else {
            e(motionEvent, i3, motionEvent2);
            if (this.bz) {
                this.d.a(motionEvent);
            }
        }
        motionEvent2.recycle();
        GestureDetector gestureDetector = this.ab;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    private boolean c(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (!this.bz) {
            return false;
        }
        this.d.c(motionEvent);
        setScrollStateExtend(0);
        motionEvent2.recycle();
        return true;
    }

    private void b(int i2) {
        if (i2 == 0) {
            int[] iArr = this.w;
            iArr[0] = 0;
            iArr[1] = 0;
        }
    }

    private void b(MotionEvent motionEvent, int i2, MotionEvent motionEvent2) {
        this.y = motionEvent.getPointerId(i2);
        y();
        c(i2, motionEvent2);
    }

    private boolean b(int i2, MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent.getButtonState() == 2 || i2 < 0 || getLayoutManager() == null) {
            return false;
        }
        VelocityTracker velocityTracker = this.bh;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent2);
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (this.h == 0 && this.e == 0) {
            this.h = rawY;
            this.e = rawX;
        }
        boolean zCanScrollHorizontally = getLayoutManager().canScrollHorizontally();
        if (getLayoutManager().canScrollVertically()) {
            return d(rawY, motionEvent);
        }
        if (zCanScrollHorizontally) {
            return b(rawX, motionEvent);
        }
        return false;
    }

    private boolean b(int i2, MotionEvent motionEvent) {
        if (this.g && this.as) {
            if (v() && this.f) {
                int i3 = -((int) getTranslationX());
                setTranslationX(0.0f);
                scrollBy(i3, 0);
                l();
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getEventTime(), motionEvent.getEventTime(), 0, motionEvent.getX() - i3, motionEvent.getY(), 0);
                motionEventObtain.setAction(0);
                super.onTouchEvent(motionEventObtain);
                return true;
            }
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            int iD = d(i2, this.e);
            if (computeHorizontalScrollRange() != 0 && d(iD)) {
                float translationX = getTranslationX();
                float fB = b(iD, false);
                int i4 = (int) fB;
                if (c(translationX, i4)) {
                    setIntegerTranslationX(0.0f);
                    if (this.bt != null) {
                        g((int) translationX);
                    }
                    scrollBy(-i4, 0);
                    l();
                    setScrollStateExtend(1);
                    invalidate();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(0);
                    return super.onTouchEvent(motionEventObtain2);
                }
                this.e = i2;
                float fAbs = Math.abs(getTranslationX());
                setIntegerTranslationX(fB);
                HwChainAnimationListener hwChainAnimationListener = this.bt;
                if (hwChainAnimationListener != null) {
                    hwChainAnimationListener.onOverScroll(iD, (int) fAbs);
                }
                b(fB);
                invalidate();
                return true;
            }
            this.e = i2;
        }
        return false;
    }

    private boolean w() {
        int startAfterPadding = this.an.getStartAfterPadding();
        int childCount = getChildCount();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                if (this.an.getDecoratedStart(childAt) < startAfterPadding) {
                    return true;
                }
                int childAdapterPosition = getChildAdapterPosition(childAt);
                if (i2 > childAdapterPosition) {
                    i2 = childAdapterPosition;
                }
            }
        }
        return i2 > 0;
    }

    private boolean v() {
        if (ai()) {
            if (!canScrollHorizontally(-1) || getTranslationX() <= 0.0f) {
                return false;
            }
        } else if (!canScrollHorizontally(1) || getTranslationX() >= 0.0f) {
            return false;
        }
        return true;
    }

    private void e(MotionEvent motionEvent) {
        int i2 = -((int) getTranslationY());
        setTranslationY(0.0f);
        scrollBy(0, i2);
        l();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getEventTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY() - i2, 0);
        motionEventObtain.setAction(0);
        super.onTouchEvent(motionEventObtain);
    }

    private int d(int i2, int i3) {
        int i4 = i2 - i3;
        if (this.g) {
            return i4;
        }
        int iAbs = Math.abs(i4);
        int i5 = this.j;
        if (iAbs <= i5) {
            return i4;
        }
        this.g = true;
        return i4 > 0 ? i4 - i5 : i4 + i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, float f2) {
        if (i2 == 1) {
            setIntegerTranslationY(f2);
        } else {
            setIntegerTranslationX(f2);
        }
    }

    private int b(boolean z, int i2) {
        int height = getHeight();
        int iApplyDimension = (int) TypedValue.applyDimension(1, 90.0f, getContext().getResources().getDisplayMetrics());
        double dApplyDimension = TypedValue.applyDimension(1, 4.0f, getContext().getResources().getDisplayMetrics());
        double dApplyDimension2 = TypedValue.applyDimension(1, 0.0f, getContext().getResources().getDisplayMetrics());
        if (z) {
            double d2 = ((double) i2) + dApplyDimension2;
            double dDoubleValue = BigDecimal.valueOf(height).divide(BigDecimal.valueOf((dApplyDimension / (((d2 > 0.0d ? d2 / ((double) iApplyDimension) : 0.0d) * 38.0d) + 10.0d)) * 300.0d), 6, 4).doubleValue();
            if (dDoubleValue != 1.0d) {
                return -((int) (((double) height) / (dDoubleValue - 1.0d)));
            }
            return 0;
        }
        double dDoubleValue2 = BigDecimal.valueOf(height).divide(BigDecimal.valueOf((dApplyDimension / (((((double) (getHeight() - i2)) + dApplyDimension2 > 0.0d ? (((double) (getHeight() - i2)) + dApplyDimension2) / ((double) iApplyDimension) : 0.0d) * 38.0d) + 10.0d)) * 300.0d), 6, 4).doubleValue();
        if (dDoubleValue2 != 1.0d) {
            return (int) (((double) height) / (dDoubleValue2 - 1.0d));
        }
        return 0;
    }

    private float d(int i2, float f2, int i3) {
        return i2 * new crg(i3).getRate(f2);
    }

    private boolean a(final String str, float f2, float f3) {
        float fAbs;
        DynamicAnimation.ViewProperty viewProperty;
        if ("translationY".equals(str)) {
            fAbs = Math.abs(getTranslationY());
            viewProperty = DynamicAnimation.TRANSLATION_Y;
        } else {
            fAbs = Math.abs(getTranslationX());
            viewProperty = DynamicAnimation.TRANSLATION_X;
        }
        DynamicAnimation.ViewProperty viewProperty2 = viewProperty;
        if (Float.compare(fAbs, 0.0f) == 0) {
            return false;
        }
        ValueAnimator valueAnimator = this.bx;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if ("translationY".equals(str)) {
            this.bx = ValueAnimator.ofFloat(getTranslationY(), f3);
        } else {
            this.bx = ValueAnimator.ofFloat(getTranslationX(), f3);
        }
        this.bx.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xfl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f52843a.a(str, valueAnimator2);
            }
        });
        crd crdVar = new crd(viewProperty2, !g() ? 228.0f : 200.0f, !g() ? 30.0f : 28.0f, Math.abs(fAbs), f2);
        this.bx.setInterpolator(crdVar);
        this.bx.setDuration((long) crdVar.getDuration());
        this.bx.addListener(new b());
        e(this.bx);
        this.bx.start();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if ("translationY".equals(str)) {
            setIntegerTranslationY(fFloatValue);
        } else {
            setIntegerTranslationX(fFloatValue);
        }
        invalidate();
    }

    private void e(ValueAnimator valueAnimator) {
        valueAnimator.addUpdateListener(new i());
    }

    private ContextMenu.ContextMenuInfo d(View view, int i2, long j2) {
        return new AdapterView.AdapterContextMenuInfo(view, i2, j2);
    }

    private boolean c(float f2, float f3, boolean z) {
        View viewFindChildViewUnder = findChildViewUnder(f2, f3);
        int childAdapterPosition = viewFindChildViewUnder != null ? getChildAdapterPosition(viewFindChildViewUnder) : -1;
        this.ac = null;
        if (childAdapterPosition != -1 && viewFindChildViewUnder != null) {
            this.ac = d(viewFindChildViewUnder, childAdapterPosition, getChildItemId(viewFindChildViewUnder));
            if (z && this.ay) {
                this.af = true;
                return super.showContextMenuForChild(this, f2, f3);
            }
            return super.showContextMenuForChild(this);
        }
        Log.e("HwRecyclerView", "position: invalid position");
        if (z && this.ay) {
            return super.showContextMenu(f2, f3);
        }
        return super.showContextMenu();
    }

    private boolean d(View view, float f2, float f3, boolean z) {
        View viewC = c(view);
        int childAdapterPosition = viewC == null ? -1 : getChildAdapterPosition(viewC);
        this.ac = null;
        if (childAdapterPosition >= 0) {
            this.ac = d(viewC, childAdapterPosition, getChildItemId(viewC));
        } else {
            Log.e("HwRecyclerView", "longPressPosition: invalid longPressPosition");
        }
        if (z && this.ay) {
            this.af = true;
            return super.showContextMenuForChild(view, f2, f3);
        }
        return super.showContextMenuForChild(view);
    }

    private View c(View view) {
        if (view == null || !(view.getParent() instanceof View)) {
            return null;
        }
        View view2 = (View) view.getParent();
        while (view2 != null && !view2.equals(this)) {
            if (!(view2.getParent() instanceof View)) {
                return null;
            }
            View view3 = view2;
            view2 = (View) view2.getParent();
            view = view3;
        }
        return view;
    }

    private boolean b(RecyclerView.Adapter adapter) {
        int endAfterPadding = this.an.getEndAfterPadding();
        int i2 = Integer.MIN_VALUE;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                if (this.an.getDecoratedEnd(childAt) > endAfterPadding) {
                    return true;
                }
                int childAdapterPosition = getChildAdapterPosition(childAt);
                if (i2 < childAdapterPosition) {
                    i2 = childAdapterPosition;
                }
            }
        }
        return i2 < adapter.getItemCount() - 1;
    }

    private boolean d(float[] fArr) {
        float translationX;
        float translationY;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!this.as || !this.av || layoutManager == null) {
            return false;
        }
        if (layoutManager.canScrollVertically()) {
            translationY = getTranslationY();
            translationX = 0.0f;
        } else {
            translationX = getTranslationX();
            translationY = 0.0f;
        }
        if (Float.compare(translationX, 0.0f) == 0 && Float.compare(translationY, 0.0f) == 0) {
            return false;
        }
        fArr[0] = translationX;
        fArr[1] = translationY;
        return true;
    }

    private void d(Canvas canvas) {
        Drawable background;
        float[] fArr = {0.0f, 0.0f};
        if (!d(fArr) || (background = getBackground()) == null) {
            return;
        }
        float scrollX = getScrollX() - fArr[0];
        float scrollY = getScrollY() - fArr[1];
        canvas.translate(scrollX, scrollY);
        background.draw(canvas);
        canvas.translate(-scrollX, -scrollY);
    }
}
