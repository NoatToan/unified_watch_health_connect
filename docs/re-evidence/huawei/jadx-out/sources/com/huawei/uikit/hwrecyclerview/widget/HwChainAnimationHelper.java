package com.huawei.uikit.hwrecyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.animation.physical2.SimpleSpringChain;
import com.huawei.animation.physical2.SimpleSpringNodeEx;
import com.huawei.animation.physical2.SpringNode;
import defpackage.bdg;
import defpackage.bdh;
import defpackage.bdj;

/* JADX INFO: loaded from: classes44.dex */
public class HwChainAnimationHelper extends HwChainAnimationListener implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RecyclerView.LayoutManager f29560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29562c;
    private int d;
    private HwRecyclerView e;
    private int f;
    private bdh g;
    private float h;
    private float i;
    private boolean j;
    private bdj k;
    private float l;
    private SimpleSpringChain m;
    private float n;
    private float o;
    private int p;
    private int q;
    private SparseArray<Float> r;
    private SparseArray<Float> s;
    private float t;
    private int x;
    private boolean y;

    class b extends SimpleSpringNodeEx {
        b(int i) {
            super(i);
        }

        @Override // com.huawei.animation.physical2.SpringNode
        public void onUpdate(float f, float f2) {
            if (HwChainAnimationHelper.this.j) {
                HwChainAnimationHelper.this.e.invalidate();
                HwChainAnimationHelper.this.j = false;
            }
            HwChainAnimationHelper.this.s.put(getIndex() - HwChainAnimationHelper.this.g.a(), Float.valueOf(f));
        }
    }

    private void k() {
        this.r.clear();
        this.t = 0.0f;
    }

    private void l() {
        if (b()) {
            this.f29561b = this.d;
            boolean zO = o();
            View viewD = d(zO);
            int position = viewD == null ? this.d : this.f29560a.getPosition(viewD);
            this.d = position;
            if (this.x != 2) {
                if (this.f29561b != position) {
                    c();
                }
            } else {
                b(this.r.get(0, Float.valueOf(m())).floatValue());
                e(zO);
                k();
                this.x = 1;
            }
        }
    }

    private float m() {
        return this.f29562c ? this.e.getTranslationY() : this.e.getTranslationX();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    private void n() {
        int iCeil;
        int iG = g();
        if (iG > 0) {
            iCeil = ((int) Math.ceil((this.f29562c ? this.f29560a.getHeight() : this.f29560a.getWidth()) / iG)) * 2;
            if (iCeil == 0) {
                iCeil = 20;
            }
        } else {
            iCeil = 20;
        }
        this.k = bdj.a(iCeil, 1800, 1.848f, new bdg(-1.0f));
    }

    private boolean o() {
        if (this.f29562c) {
            return this.e.getTranslationY() > 0.0f;
        }
        return this.e.getTranslationX() > 0.0f;
    }

    private void t() {
        int childCount = this.f29560a.getChildCount();
        if (this.s.size() <= 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f29560a.getChildAt(i);
            if (childAt != null) {
                int position = this.f29560a.getPosition(childAt) - this.d;
                a(childAt, (this.s.indexOfKey(position) < 0 ? -this.f : this.s.get(position).floatValue()) + this.f);
            }
        }
    }

    public boolean a() {
        HwRecyclerView hwRecyclerView = this.e;
        return hwRecyclerView != null && hwRecyclerView.m();
    }

    public boolean b() {
        if (this.f29562c) {
            return this.e.getTranslationY() != 0.0f;
        }
        return this.e.getTranslationX() != 0.0f;
    }

    public void c() {
        this.s.clear();
        this.j = true;
        this.m.b(this.d - this.f29561b);
        if (this.s.indexOfKey(0) < 0) {
            Log.w("HwChainHelper", "relocate: control node hasn't data.");
            return;
        }
        int iRound = Math.round(this.s.get(0).floatValue());
        int i = this.f + iRound;
        if (i != 0) {
            if (!b()) {
                if (this.f29562c) {
                    this.e.scrollBy(0, -i);
                    return;
                } else {
                    this.e.scrollBy(-i, 0);
                    return;
                }
            }
            float fM = i + m();
            this.f = -iRound;
            if (e((int) fM)) {
                fM = 0.0f;
            }
            b(fM);
        }
    }

    protected boolean d() {
        return true;
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwChainAnimationListener
    public void dispatchGenericMotionEvent(MotionEvent motionEvent) {
        this.y = motionEvent != null && motionEvent.getAction() == 8;
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwChainAnimationListener
    public void dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.w("HwChainHelper", "dispatchTouchEvent: event is null.");
            return;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            b(motionEvent);
        } else if (action == 1 || action == 3) {
            l();
        }
    }

    protected View e(float f, float f2) {
        int childCount = this.f29560a.getChildCount();
        float height = this.f29560a.getHeight();
        int i = 0;
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = this.f29560a.getChildAt(i2);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof RecyclerView.LayoutParams) {
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                    float translationX = childAt.getTranslationX();
                    float translationY = childAt.getTranslationY();
                    float decoratedLeft = (this.f29560a.getDecoratedLeft(childAt) + translationX) - layoutParams2.leftMargin;
                    float decoratedRight = this.f29560a.getDecoratedRight(childAt) + translationX + layoutParams2.rightMargin;
                    float decoratedTop = (this.f29560a.getDecoratedTop(childAt) + translationY) - layoutParams2.topMargin;
                    float decoratedBottom = this.f29560a.getDecoratedBottom(childAt) + translationY + layoutParams2.bottomMargin;
                    if (f >= decoratedLeft && f <= decoratedRight && f2 >= decoratedTop && f2 <= decoratedBottom) {
                        return childAt;
                    }
                    if (this.f29562c) {
                        float f3 = (((int) (decoratedBottom + decoratedTop)) / 2) - f2;
                        if (height > Math.abs(f3)) {
                            height = Math.abs(f3);
                            i = i2;
                        }
                    } else {
                        float f4 = (((int) (decoratedLeft + decoratedRight)) / 2) - f;
                        if (height > Math.abs(f4)) {
                            height = Math.abs(f4);
                            i = i2;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return this.f29560a.getChildAt(i);
    }

    public void e() {
        if (this.m == null) {
            this.s.clear();
            int iF = f();
            Log.i("HwChainHelper", "init SpringChain: nodes:" + iF);
            c(iF);
        }
        if (this.k == null) {
            this.r.clear();
            n();
        }
    }

    public void h() {
        if (this.x != 1) {
            return;
        }
        t();
        this.j = true;
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwChainAnimationListener
    public void onAttachedToWindow() {
        this.e.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwChainAnimationListener
    public void onDetachedFromWindow() {
        this.e.getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwChainAnimationListener
    public void onOverScroll(float f, float f2) {
        HwRecyclerView hwRecyclerView = this.e;
        if (hwRecyclerView == null || hwRecyclerView.g()) {
            if (this.y) {
                this.y = false;
                return;
            }
            if (this.m == null || this.k == null) {
                Log.w("HwChainHelper", "onOverScroll: mSpringChain or mCurveChain is null");
                e();
            }
            int i = this.x;
            if (i != 2) {
                if (i == 1) {
                    j();
                }
                k();
            }
            this.x = 2;
            d(f, f2);
        }
    }

    public boolean onPreDraw() {
        e();
        if ((b() && this.e.m()) || !this.e.g()) {
            return true;
        }
        h();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (this.y) {
            this.y = false;
            return;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (this.m == null) {
            Log.w("HwChainHelper", "onScrolled: spring chain is null.");
            e();
        }
        int i3 = this.f;
        if (this.f29562c) {
            i = i2;
        }
        int i4 = i3 + i;
        this.f = i4;
        this.m.c(-i4);
        this.x = 1;
    }

    private void a(int i) {
        this.g = new bdh();
        for (int i2 = 0; i2 < i; i2++) {
            this.g.c(b(i2));
        }
    }

    private void c(int i) {
        a(i);
        this.m = new SimpleSpringChain(this.g).a(new bdg(this.i)).d(new bdg(this.h)).b(this.o).e(this.l).d(this.n).a(this.q, this.p).b();
    }

    private int f() {
        int finalX;
        int width;
        OverScroller overScroller = new OverScroller(this.e.getContext());
        if (this.f29562c) {
            overScroller.fling(0, 0, 0, this.e.getMaxFlingVelocity(), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        } else {
            overScroller.fling(0, 0, this.e.getMaxFlingVelocity(), 0, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        overScroller.forceFinished(true);
        int childCount = this.f29560a.getChildCount();
        if (childCount == 0) {
            Log.w("HwChainHelper", "getNodesNum: child count is 0.");
            return 101;
        }
        View childAt = this.f29560a.getChildAt(0);
        View childAt2 = this.f29560a.getChildAt(childCount - 1);
        if (childAt == null || childAt2 == null) {
            Log.w("HwChainHelper", "getNodesNum: firstView or lastView is null.");
            return 101;
        }
        int iG = g();
        if (iG <= 0 || iG == this.f29560a.getHeight()) {
            return 101;
        }
        if (this.f29562c) {
            finalX = overScroller.getFinalY();
            width = this.f29560a.getHeight();
        } else {
            finalX = overScroller.getFinalX();
            width = this.f29560a.getWidth();
        }
        return ((((int) Math.ceil((finalX + width) / iG)) + 1 + childCount) * 2) + 1;
    }

    private SimpleSpringNodeEx b(int i) {
        b bVar = new b(i);
        bVar.setFixMode(0);
        bVar.setValueAccuracy(0.2f);
        return bVar;
    }

    private void e(boolean z) {
        int size = this.r.size();
        int iA = this.g.a();
        for (int i = 0; i < size; i++) {
            int i2 = z ? i : (this.d - 1) - i;
            int i3 = (iA + i2) - this.d;
            SpringNode node = this.g.getNode(i3);
            if (node instanceof SimpleSpringNodeEx) {
                SimpleSpringNodeEx simpleSpringNodeEx = (SimpleSpringNodeEx) node;
                simpleSpringNodeEx.resetNode((simpleSpringNodeEx.getValue() + this.r.valueAt(i).floatValue()) - m(), 0.0f);
            } else {
                Log.w("HwChainHelper", "transferData: index = " + i2 + ", nodeIndex = " + i3 + ", isOverStartEdge = " + z);
            }
        }
    }

    private int g() {
        int height = this.f29560a.getHeight();
        for (int i = 0; i < this.f29560a.getChildCount(); i++) {
            View childAt = this.f29560a.getChildAt(i);
            if (childAt != null) {
                if (this.f29562c && childAt.getHeight() < height) {
                    height = childAt.getHeight();
                } else if (!this.f29562c && childAt.getWidth() < height) {
                    height = childAt.getWidth();
                }
            }
        }
        return height;
    }

    private void b(MotionEvent motionEvent) {
        this.x = 0;
        View viewE = e(motionEvent.getX(), motionEvent.getY());
        if (viewE == null) {
            Log.w("HwChainHelper", "onTouchDown: control item is null.");
            this.d = -1;
            return;
        }
        this.f29561b = this.d;
        this.d = this.e.getChildLayoutPosition(viewE);
        if (this.m == null || this.k == null) {
            Log.w("HwChainHelper", "onTouchDown: mSpringChain or mCurveChain is null:");
            e();
        }
        int i = this.f29561b;
        if (i != -1 && i != this.d && this.m.e() && d()) {
            c();
        }
        SpringNode springNodeD = this.m.d();
        if (springNodeD != null) {
            springNodeD.cancel();
        }
    }

    private void j() {
        this.m.c();
        this.f = 0;
        int size = this.g.getSize();
        for (int i = 0; i < size; i++) {
            SpringNode node = this.g.getNode(i);
            if (node != null) {
                node.resetValue(0.0f);
            }
        }
        this.s.clear();
    }

    private boolean e(int i) {
        if (!this.f29562c) {
            return i();
        }
        if (!this.e.canScrollVertically(1) || i >= 0) {
            return this.e.canScrollVertically(-1) && i > 0;
        }
        return true;
    }

    private View d(boolean z) {
        if (z) {
            return this.f29560a.getChildAt(0);
        }
        RecyclerView.LayoutManager layoutManager = this.f29560a;
        return layoutManager.getChildAt(layoutManager.getChildCount() - 1);
    }

    private boolean i() {
        if (this.e.getLayoutDirection() == 1) {
            if (!this.e.canScrollHorizontally(-1) || this.e.getTranslationX() <= 0.0f) {
                return false;
            }
        } else if (!this.e.canScrollHorizontally(1) || this.e.getTranslationX() >= 0.0f) {
            return false;
        }
        return true;
    }

    private void d(float f, float f2) {
        boolean zO = o();
        int childCount = this.f29560a.getChildCount();
        int iE = e(zO, childCount, this.d);
        this.k.e(iE);
        float fM = m();
        e(iE, fM, f, f2, 0);
        for (int i = iE - 1; i >= 0; i--) {
            e(i, fM, f, f2, 1);
        }
        while (true) {
            iE++;
            if (iE < childCount) {
                e(iE, fM, f, f2, -1);
            } else {
                this.t = fM;
                return;
            }
        }
    }

    private int e(boolean z, int i, int i2) {
        View childAt;
        return (z || (childAt = this.f29560a.getChildAt(i + (-1))) == null) ? i2 : this.e.getChildLayoutPosition(childAt) - i2;
    }

    private void e(int i, float f, float f2, float f3, int i2) {
        View childAt = this.f29560a.getChildAt(o() ? i : (this.f29560a.getChildCount() - 1) - i);
        if (childAt == null) {
            return;
        }
        float fE = e(i, f3, i2);
        float translationY = this.f29562c ? childAt.getTranslationY() : childAt.getTranslationX();
        float fB = b(i, c(f, translationY, this.r.get(i, Float.valueOf(f + translationY)).floatValue() + (fE * f2)), i2, o());
        this.r.put(i, Float.valueOf(fB));
        a(childAt, fB - f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private float e(int i, float f, int i2) {
        try {
            return this.k.e(i, f);
        } catch (IllegalArgumentException unused) {
            try {
                if (i2 != 1) {
                    if (i2 == -1) {
                        i = this.k.e(i - 1, f);
                    }
                    return 1.0f;
                }
                i = this.k.e(i + 1, f);
                return i;
            } catch (IllegalArgumentException unused2) {
                Log.e("HwChainHelper", "getCurrentRate: get rate from curve chain failed. index = " + i + ", rate = 1.0");
            }
        }
    }

    private float c(float f, float f2, float f3) {
        return (Float.compare(Math.abs(f), 200.0f) >= 0 || Math.abs(this.t) <= Math.abs(f)) ? f3 : ((f2 * f) / this.t) + f;
    }

    private float b(int i, float f, int i2, boolean z) {
        if (i2 == 1) {
            float fFloatValue = this.r.get(i + 1, Float.valueOf(f)).floatValue();
            if (z) {
                return Math.min(fFloatValue + this.q, f);
            }
            return Math.max(fFloatValue - this.q, f);
        }
        if (i2 != -1) {
            return f;
        }
        float fFloatValue2 = this.r.get(i - 1, Float.valueOf(f)).floatValue();
        if (z) {
            return Math.max(fFloatValue2 - this.q, f);
        }
        return Math.min(fFloatValue2 + this.q, f);
    }

    private void a(View view, float f) {
        if (this.f29562c) {
            view.setTranslationY(f);
        } else {
            view.setTranslationX(f);
        }
    }

    private void b(float f) {
        if (this.f29562c) {
            this.e.setTranslationY(f);
        } else {
            this.e.setTranslationX(f);
        }
    }
}
