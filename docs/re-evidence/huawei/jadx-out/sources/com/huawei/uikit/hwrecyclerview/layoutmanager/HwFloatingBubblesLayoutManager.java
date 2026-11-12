package com.huawei.uikit.hwrecyclerview.layoutmanager;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.uikit.hwcommon.anim.HwCubicBezierInterpolator;
import com.huawei.uikit.hwrecyclerview.layoutmanager.HwFloatingBubblesLayoutManager;
import defpackage.xfe;
import defpackage.xff;
import defpackage.xfg;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class HwFloatingBubblesLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f29553b = {1, 2, 0, 1, 0, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29554a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HwFloatingBubblesScrollFinishedCallback f29555c;
    private int d;
    private final int e;
    private int f;
    private SparseArray<Rect> g;
    private int h;
    private xfg i;
    private int j;
    private int k;
    private int l;
    private int m;
    private HwLayoutFinishedCallback n;
    private int o;
    private int p;
    private int q;
    private ValueAnimator r;
    private int s;
    private SparseArray<e> t;

    public static abstract class HwFloatingBubblesScrollFinishedCallback {
        public abstract void onScrollByFinished(View view, RecyclerView recyclerView);
    }

    public static abstract class HwLayoutFinishedCallback {
        public abstract void onLayoutFinished(boolean z);
    }

    static class d extends LinearSmoothScroller {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HwCubicBezierInterpolator f29556a;

        d(Context context) {
            super(context);
            this.f29556a = new HwCubicBezierInterpolator(0.4f, 0.0f, 0.4f, 1.0f);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return (int) ((i3 + ((i4 - i3) / 2.0f)) - (i + ((i2 - i) / 2.0f)));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForDeceleration(int i) {
            return 1000;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForScrolling(int i) {
            return 1000;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
            int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iCalculateDxToMakeVisible * iCalculateDxToMakeVisible) + (iCalculateDyToMakeVisible * iCalculateDyToMakeVisible)));
            if (iCalculateTimeForDeceleration > 0) {
                action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iCalculateTimeForDeceleration, this.f29556a);
            }
        }
    }

    class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f29559c;
        int d;
        int e;

        e(int i, int i2, int i3, int i4, float f) {
            this.e = i;
            this.f29558b = i2;
            this.d = i3;
            this.f29557a = i4;
            this.f29559c = f;
        }
    }

    private void a(RecyclerView.Recycler recycler, int i) {
        int position;
        ArrayList arrayList = new ArrayList();
        int itemCount = getItemCount();
        boolean zH = h();
        boolean zJ = j();
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                float translationY = childAt.getTranslationY();
                if (i <= 0 || (getDecoratedBottom(childAt) - i) + (translationY * 0.5f) >= 0.0f) {
                    if (i >= 0 || (getDecoratedTop(childAt) - i) + (translationY * 0.5f) <= a()) {
                        int position2 = getPosition(childAt);
                        if (position2 > i2) {
                            i2 = position2;
                        }
                        if (position2 < itemCount) {
                            itemCount = position2;
                        }
                    } else if (!zH) {
                        arrayList.add(childAt);
                    }
                } else if (!zJ) {
                    arrayList.add(childAt);
                }
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            View view = (View) arrayList.get(i3);
            if (view != null && ((position = getPosition(view)) < itemCount || position > i2)) {
                removeAndRecycleView(view, recycler);
            }
        }
    }

    private void a(boolean z, int i, boolean z2) {
        if (getChildCount() == 0 || getHeight() == 0) {
            return;
        }
        boolean zC = true;
        for (int i2 = 0; zC && i2 < 10; i2++) {
            zC = c(z2, xfe.b(z, i, this, this.i));
        }
    }

    private void d(RecyclerView.Recycler recycler, int i) {
        int itemCount = getItemCount();
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                int position = getPosition(childAt);
                if (position > i2) {
                    i2 = position;
                }
                if (position < itemCount) {
                    itemCount = position;
                }
            }
        }
        a(recycler, i);
        Rect rectB = b(i);
        if (i > 0) {
            for (int i4 = i2 + 1; i4 < getItemCount(); i4++) {
                c(recycler, rectB, i4, false);
            }
            return;
        }
        for (int i5 = itemCount - 1; i5 >= 0; i5--) {
            c(recycler, rectB, i5, true);
        }
    }

    private void e(RecyclerView.Recycler recycler, int i) {
        for (int i2 = this.h; i2 < getItemCount(); i2++) {
            Rect rect = this.g.get(i2);
            if (rect != null) {
                Rect rect2 = new Rect(rect.left, rect.top + i, rect.right, rect.bottom + i);
                if (Rect.intersects(b(0), rect2)) {
                    e(false, rect2, recycler.getViewForPosition(i2), i2);
                }
            }
        }
        a(false, 0, true);
        e(true);
    }

    private boolean g() {
        ValueAnimator valueAnimator = this.r;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    private boolean h() {
        Pair<Boolean, Integer> pairB = b();
        if (((Boolean) pairB.first).booleanValue()) {
            return ((Integer) pairB.second).intValue() >= ((int) (((float) getHeight()) * 0.5f));
        }
        return false;
    }

    private boolean j() {
        Pair<Boolean, Integer> pairD = d();
        if (((Boolean) pairD.first).booleanValue()) {
            return ((Integer) pairD.second).intValue() <= ((int) (((float) getHeight()) * 0.5f));
        }
        return false;
    }

    public void b(RecyclerView recyclerView) {
        a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        int top = this.d;
        if (getChildCount() == 0) {
            return 0;
        }
        int bottom = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                if (childAt.getTop() < top) {
                    top = childAt.getTop();
                }
                if (childAt.getBottom() > bottom) {
                    bottom = childAt.getBottom();
                }
            }
        }
        return bottom - top;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return this.j;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return (this.d - getPaddingTop()) - getPaddingBottom();
    }

    public void d(boolean z, int i) {
        a(z, i, false);
    }

    void e() {
        int top = Integer.MAX_VALUE;
        int bottom = Integer.MIN_VALUE;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                if (childAt.getTop() + this.j < top) {
                    top = childAt.getTop() + this.j;
                }
                if (childAt.getBottom() + this.j > bottom) {
                    bottom = childAt.getBottom() + this.j;
                }
            }
        }
        if (top == Integer.MAX_VALUE || bottom == Integer.MIN_VALUE) {
            return;
        }
        if (this.j + top < getPaddingTop()) {
            this.j = getPaddingTop() - top;
        }
        if (getPaddingBottom() + bottom > this.f29554a) {
            this.d = bottom + getPaddingBottom();
        } else {
            if (getPaddingBottom() + bottom >= this.f29554a || !((Boolean) d().first).booleanValue()) {
                return;
            }
            this.d = bottom + getPaddingBottom();
        }
    }

    public boolean e(RecyclerView recyclerView, int i) {
        if (getChildCount() == 0 || recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent() == 0) {
            return false;
        }
        if (i > 0) {
            return this.j + getHeight() < this.d;
        }
        return this.j > 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingBottom() {
        return super.getPaddingBottom() + c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getPaddingTop() {
        return super.getPaddingTop() + c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.g.clear();
        this.j = 0;
        this.d = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        a(recyclerView);
        super.onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getItemCount() == 0) {
            detachAndScrapAttachedViews(recycler);
            return;
        }
        if (state.getItemCount() == 0 || state.isPreLayout()) {
            return;
        }
        if (this.s != 0 && getItemCount() != 1) {
            Log.w("HwFloatingBubblesLayoutManager", "Scroll state illegal.");
            return;
        }
        this.q = getItemCount();
        detachAndScrapAttachedViews(recycler);
        int i = 0;
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
        this.p = getDecoratedMeasuredHeight(viewForPosition);
        a(decoratedMeasuredWidth);
        if (this.g.size() > 0) {
            Rect rect = this.g.get(0);
            SparseArray<Rect> sparseArray = this.g;
            Rect rect2 = sparseArray.get(sparseArray.size() - 1);
            if (rect == null || rect2 == null) {
                return;
            }
            int i2 = rect2.bottom;
            int i3 = rect.top;
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            d(rect);
            if (this.t.size() != 0) {
                b(recycler, paddingTop);
            } else {
                e(recycler, paddingTop);
            }
            i = (i2 - i3) + paddingTop + paddingBottom;
        }
        int iMax = Math.max(a(), i);
        this.f29554a = iMax;
        this.d = Math.max(iMax, this.d);
        if (this.t.size() != 0) {
            this.t.clear();
        }
        e();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        HwLayoutFinishedCallback hwLayoutFinishedCallback = this.n;
        if (hwLayoutFinishedCallback != null) {
            hwLayoutFinishedCallback.onLayoutFinished(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        this.s = i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getItemCount() != 0 && recycler != null) {
            recycler.clear();
            int i2 = this.j;
            int i3 = i2 + i;
            int i4 = this.f;
            if (i3 < i4) {
                i = i4 - i2;
            } else if (i3 > this.d - a()) {
                i = (this.d - a()) - this.j;
            }
            d(recycler, i);
            this.j += i;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        d dVar = new d(recyclerView.getContext());
        dVar.setTargetPosition(i);
        startSmoothScroll(dVar);
    }

    private boolean c(boolean z, int[][] iArr) {
        boolean z2 = false;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                if (z && (iArr[0][i] != 0 || iArr[1][i] != 0)) {
                    z2 = true;
                }
                childAt.offsetLeftAndRight(iArr[0][i]);
                childAt.offsetTopAndBottom(iArr[1][i]);
            }
        }
        return z2;
    }

    private void a(int i) {
        boolean z = (this.k == getWidth() && this.o == getHeight()) ? false : true;
        boolean z2 = (this.m == getPaddingLeft() && this.l == getPaddingRight()) ? false : true;
        if (this.g.size() == 0 || z || z2) {
            this.o = getHeight();
            this.k = getWidth();
            this.m = getPaddingLeft();
            this.l = getPaddingRight();
            this.g.clear();
            List<xff> listB = xfe.b(getItemCount() - 1, (getWidth() - getPaddingLeft()) - getPaddingRight(), getHeight(), i, this.e);
            for (int i2 = 0; i2 < listB.size(); i2++) {
                xff xffVar = listB.get(i2);
                this.g.put(i2, new Rect((xffVar.b() - xffVar.a()) + getPaddingLeft(), xffVar.e() - xffVar.a(), xffVar.b() + xffVar.a() + getPaddingLeft(), xffVar.e() + xffVar.a()));
            }
        }
    }

    private void c(RecyclerView.Recycler recycler, Rect rect, int i, boolean z) {
        Rect rect2 = this.g.get(i);
        if (rect2 == null) {
            return;
        }
        int paddingTop = getPaddingTop();
        Rect rect3 = new Rect(rect2.left, rect2.top + paddingTop, rect2.right, rect2.bottom + paddingTop);
        if (Rect.intersects(rect, rect3)) {
            e(z, rect3, recycler.getViewForPosition(i), -1);
        }
    }

    private Pair<Boolean, Integer> b() {
        int decoratedBottom;
        int childCount = getChildCount();
        if (childCount == 0) {
            return new Pair<>(Boolean.TRUE, Integer.valueOf(getHeight()));
        }
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && getPosition(childAt) == 0) {
                z = true;
                decoratedBottom = getDecoratedBottom(childAt);
                return new Pair<>(Boolean.valueOf(z), Integer.valueOf(decoratedBottom));
            }
        }
        decoratedBottom = 0;
        return new Pair<>(Boolean.valueOf(z), Integer.valueOf(decoratedBottom));
    }

    private int c() {
        return (int) ((getHeight() * 0.5f) - (this.p * 0.5f));
    }

    private void e(boolean z, Rect rect, View view, int i) {
        SparseArray<e> sparseArray;
        int i2 = rect.bottom - rect.top;
        if (view instanceof ViewGroup) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams.width != i2 || layoutParams.height != i2) {
                layoutParams.width = i2;
                layoutParams.height = i2;
                view.setLayoutParams(layoutParams);
            }
        }
        if (z) {
            addView(view, 0);
        } else {
            addView(view);
        }
        int i3 = rect.top;
        int iE = e(view, getWidth(), i2);
        measureChildWithMargins(view, 0, 0);
        if (i != -1 && (sparseArray = this.t) != null && sparseArray.get(i) != null) {
            e eVar = this.t.get(i);
            layoutDecorated(view, eVar.e, eVar.f29558b, eVar.d, eVar.f29557a);
        } else {
            int i4 = this.j;
            layoutDecorated(view, iE, i3 - i4, iE + i2, (i3 + i2) - i4);
        }
    }

    private int a() {
        return getHeight();
    }

    private int e(View view, int i, int i2) {
        float fNextFloat;
        int position = view == null ? 0 : getPosition(view);
        if (position == this.i.d()) {
            fNextFloat = i * 0.5f;
        } else {
            int[] iArr = f29553b;
            fNextFloat = (((iArr[position % iArr.length] + 0.5f) + new SecureRandom().nextFloat()) * i) / 4.0f;
        }
        return (int) (fNextFloat - (i2 * 0.5f));
    }

    private Rect b(int i) {
        return new Rect(getPaddingLeft(), this.j + i, getWidth() - getPaddingRight(), a() + this.j + i);
    }

    private void b(RecyclerView.Recycler recycler, int i) {
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            int iKeyAt = this.t.keyAt(i2);
            Rect rect = this.g.get(iKeyAt);
            if (rect != null) {
                Rect rect2 = new Rect(rect.left, rect.top + i, rect.right, rect.bottom + i);
                View viewForPosition = recycler.getViewForPosition(iKeyAt);
                e(false, rect2, viewForPosition, iKeyAt);
                e eVar = this.t.get(iKeyAt);
                if (eVar != null) {
                    float f = eVar.f29559c;
                    viewForPosition.setScaleX(f);
                    viewForPosition.setScaleY(f);
                    xfe.b(viewForPosition, getWidth());
                }
            }
        }
    }

    private void a(RecyclerView recyclerView) {
        this.t.clear();
        if (recyclerView.getAdapter() != null && recyclerView.getAdapter().getItemCount() == this.q) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != null) {
                    this.t.put(getPosition(childAt), new e(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), childAt.getScaleX()));
                }
            }
            return;
        }
        removeAllViews();
        this.g.clear();
        this.j = 0;
        this.d = 0;
    }

    private void d(Rect rect) {
        Rect rect2;
        int iD = this.i.d();
        if (iD >= getItemCount() || iD < 0 || (rect2 = this.g.get(iD)) == null) {
            return;
        }
        this.j = rect2.top - rect.top;
    }

    private Pair<Boolean, Integer> d() {
        int decoratedTop;
        int childCount = getChildCount();
        boolean z = false;
        if (childCount == 0) {
            return new Pair<>(Boolean.TRUE, 0);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && getPosition(childAt) == getItemCount() - 1) {
                decoratedTop = getDecoratedTop(childAt);
                z = true;
                return new Pair<>(Boolean.valueOf(z), Integer.valueOf(decoratedTop));
            }
        }
        decoratedTop = 0;
        return new Pair<>(Boolean.valueOf(z), Integer.valueOf(decoratedTop));
    }

    void e(boolean z) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        View childAt = getChildAt(0);
        if (childAt != null && (childAt.getParent() instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) childAt.getParent();
            float height = getHeight() / 2.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt2 = getChildAt(i);
                if (childAt2 != null) {
                    if (!c(z, childAt2, height)) {
                        xfe.e(this, childAt2, height, this.i);
                    }
                    HwFloatingBubblesScrollFinishedCallback hwFloatingBubblesScrollFinishedCallback = this.f29555c;
                    if (hwFloatingBubblesScrollFinishedCallback != null) {
                        hwFloatingBubblesScrollFinishedCallback.onScrollByFinished(childAt2, recyclerView);
                    }
                }
            }
        }
    }

    private boolean c(boolean z, View view, float f) {
        float translationY = view.getTranslationY() + (view.getHeight() * 0.5f) + view.getTop();
        if (z || !view.isSelected() || Float.compare(translationY, getHeight()) >= 0 || Float.compare(translationY, 0.0f) <= 0) {
            return false;
        }
        float fB = xfe.b(this.i, view, Math.abs(translationY - f) / f);
        if (e((0.005f + fB) - view.getScaleX(), (this.i.b() - 1.0f) * this.i.e())) {
            e(view, fB, getWidth());
            return true;
        }
        return g();
    }

    private boolean e(float f, float f2) {
        return SystemClock.uptimeMillis() - this.i.c() < 500 && Float.compare(f, f2) >= 0 && !g();
    }

    private void e(final View view, float f, final int i) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getScaleX(), f);
            this.r = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(200L);
            this.r.setInterpolator(new LinearInterpolator());
            this.r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xfd
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    HwFloatingBubblesLayoutManager.c(view, i, valueAnimator2);
                }
            });
            this.r.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(View view, int i, ValueAnimator valueAnimator) {
        if (valueAnimator == null) {
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            float fFloatValue = ((Float) animatedValue).floatValue();
            view.setScaleX(fFloatValue);
            view.setScaleY(fFloatValue);
            xfe.b(view, i);
        }
    }
}
