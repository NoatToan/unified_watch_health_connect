package com.loopeer.cardstack;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class CardStackView extends ViewGroup implements ScrollDelegate {
    private static final int A = -1;
    public static final int ALL_DOWN = 0;
    public static final int ANIMATION_STATE_CANCEL = 2;
    public static final int ANIMATION_STATE_END = 1;
    public static final int ANIMATION_STATE_START = 0;
    private static final String B = "CardStackView";
    public static final int INVALID_TYPE = -1;
    public static final int UP_DOWN = 1;
    public static final int UP_DOWN_STACK = 2;
    public static final int z = -1;
    private final f a;
    private final int[] b;
    private int c;
    private int d;
    private int e;
    private int f;
    private StackAdapter<?> g;
    private int h;
    private int i;
    private List<ViewHolder> j;
    private AnimatorAdapter k;
    private int l;
    private OverScroller m;
    private int n;
    private boolean o;
    private VelocityTracker p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private ScrollDelegate x;
    private ItemExpendListener y;

    public static abstract class Adapter<VH extends ViewHolder> {
        private final AdapterDataObservable a = new AdapterDataObservable();

        public VH a(ViewGroup viewGroup, int i) {
            VH vh = (VH) onCreateView(viewGroup, i);
            vh.a = i;
            return vh;
        }

        public void bindViewHolder(VH vh, int i) {
            onBindViewHolder(vh, i);
        }

        public abstract int getItemCount();

        public int getItemViewType(int i) {
            return 0;
        }

        public final void notifyDataSetChanged() {
            this.a.notifyChanged();
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public abstract VH onCreateView(ViewGroup viewGroup, int i);

        public void registerObserver(AdapterDataObserver adapterDataObserver) {
            this.a.registerObserver(adapterDataObserver);
        }
    }

    public static class AdapterDataObservable extends Observable<AdapterDataObserver> {
        public boolean hasObservers() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void notifyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }
    }

    public static abstract class AdapterDataObserver {
        public void onChanged() {
        }
    }

    public interface ItemExpendListener {
        void onItemExpend(boolean z);
    }

    public static abstract class ViewHolder {
        public int a = -1;
        public int b;
        public View itemView;

        public ViewHolder(View view) {
            this.itemView = view;
        }

        public Context getContext() {
            return this.itemView.getContext();
        }

        public void onAnimationStateChange(int i, boolean z) {
        }

        public abstract void onItemExpand(boolean z);
    }

    public class a implements Runnable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int b;

        public a(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.a) {
                CardStackView.this.setDuration(0);
            }
            CardStackView.this.h();
            CardStackView.this.k.expandItem((ViewHolder) CardStackView.this.j.get(this.b), this.b);
            if (this.a) {
                return;
            }
            CardStackView.this.setDuration(400);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.a) {
                CardStackView.this.setDuration(0);
            }
            CardStackView.this.h();
            CardStackView.this.k.collapseItem((ViewHolder) CardStackView.this.j.get(CardStackView.this.getSelectPosition()));
            if (this.a) {
                return;
            }
            CardStackView.this.setDuration(400);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardStackView cardStackView = CardStackView.this;
            cardStackView.j((ViewHolder) cardStackView.j.get(this.a), this.a);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CardStackView.this.w && CardStackView.this.h != -1) {
                CardStackView cardStackView = CardStackView.this;
                cardStackView.performItemClick((ViewHolder) cardStackView.j.get(CardStackView.this.h));
            }
        }
    }

    public class e implements View.OnClickListener {
        public final /* synthetic */ ViewHolder a;

        public e(ViewHolder viewHolder) {
            this.a = viewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CardStackView.this.w) {
                CardStackView.this.performItemClick(this.a);
            }
        }
    }

    public class f extends AdapterDataObserver {
        private f() {
        }

        @Override // com.loopeer.cardstack.CardStackView.AdapterDataObserver
        public void onChanged() {
            CardStackView.this.v();
        }

        public /* synthetic */ f(CardStackView cardStackView, a aVar) {
            this();
        }
    }

    public CardStackView(Context context) {
        this(context, null);
    }

    private int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, this.c - this.i);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        View view = (View) getParent();
        this.i = (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom();
    }

    private static int i(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(ViewHolder viewHolder, int i) {
        h();
        this.k.itemClick(viewHolder, i);
    }

    private int k(int i) {
        return (int) ((i * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void l() {
        this.o = false;
        u();
    }

    private void n(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CardStackView, i, i2);
        setOverlapGaps(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CardStackView_stackOverlapGaps, k(20)));
        setOverlapGapsCollapse(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CardStackView_stackOverlapGapsCollapse, k(20)));
        setDuration(typedArrayObtainStyledAttributes.getInt(R.styleable.CardStackView_stackDuration, 400));
        setAnimationType(typedArrayObtainStyledAttributes.getInt(R.styleable.CardStackView_stackAnimationType, 2));
        setNumBottomShow(typedArrayObtainStyledAttributes.getInt(R.styleable.CardStackView_stackNumBottomShow, 3));
        typedArrayObtainStyledAttributes.recycle();
        this.j = new ArrayList();
        p();
    }

    private void o() {
        VelocityTracker velocityTracker = this.p;
        if (velocityTracker == null) {
            this.p = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void p() {
        this.m = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.q = viewConfiguration.getScaledTouchSlop();
        this.r = viewConfiguration.getScaledMinimumFlingVelocity();
        this.s = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void q() {
        if (this.p == null) {
            this.p = VelocityTracker.obtain();
        }
    }

    private void r() {
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i2 = paddingTop + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            if (i != 0) {
                i2 -= this.d * 2;
                childAt.layout(paddingLeft, i2, measuredWidth + paddingLeft, measuredHeight + i2);
            } else {
                childAt.layout(paddingLeft, i2, measuredWidth + paddingLeft, measuredHeight + i2);
            }
            paddingTop = i2 + layoutParams.mHeaderHeight;
        }
    }

    private void s(int i, int i2) {
        this.c = 0;
        this.c = getPaddingTop() + getPaddingBottom() + 0;
        int iMax = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            measureChildWithMargins(childAt, i, 0, i2, 0);
            int i4 = this.c;
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mHeaderHeight == -1) {
                layoutParams.mHeaderHeight = childAt.getMeasuredHeight();
            }
            int iMax2 = Math.max(i4, layoutParams.mHeaderHeight + i4 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            this.c = iMax2;
            this.c = iMax2 - (this.d * 2);
            iMax = Math.max(iMax, childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        }
        int i5 = this.c + (this.d * 2);
        this.c = i5;
        setMeasuredDimension(ViewGroup.resolveSizeAndState(iMax, i, 0), ViewGroup.resolveSizeAndState(Math.max(i5, this.i), i2, 0));
    }

    private void t(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.t) {
            int i = action == 0 ? 1 : 0;
            this.n = (int) motionEvent.getY(i);
            this.t = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void u() {
        VelocityTracker velocityTracker = this.p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        removeAllViews();
        this.j.clear();
        this.h = -1;
        for (int i = 0; i < this.g.getItemCount(); i++) {
            ViewHolder viewHolderM = m(i);
            viewHolderM.b = i;
            addView(viewHolderM.itemView);
            w(viewHolderM, i);
            this.g.bindViewHolder(viewHolderM, i);
        }
        requestLayout();
    }

    private void w(ViewHolder viewHolder, int i) {
        setOnClickListener(new d());
        viewHolder.itemView.setOnClickListener(new e(viewHolder));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void clearScrollYAndTranslation() {
        if (this.h != -1) {
            clearSelectPosition();
        }
        ScrollDelegate scrollDelegate = this.x;
        if (scrollDelegate != null) {
            scrollDelegate.setViewScrollY(0);
        }
        requestLayout();
    }

    public void clearSelectPosition() {
        updateSelectPosition(this.h);
    }

    public void collapseItem(boolean z2) {
        if (getSelectPosition() == -1) {
            return;
        }
        post(new b(z2));
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.m.computeScrollOffset()) {
            this.x.scrollViewTo(0, this.m.getCurrY());
            postInvalidate();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int i = this.i;
        if (childCount == 0) {
            return i;
        }
        int i2 = this.c;
        int viewScrollY = this.x.getViewScrollY();
        int iMax = Math.max(0, i2 - i);
        if (viewScrollY < 0) {
            return i2 - viewScrollY;
        }
        return viewScrollY > iMax ? i2 + (viewScrollY - iMax) : i2;
    }

    public void expandItem(int i, boolean z2) {
        if (getSelectPosition() != i && i >= 0 && i < this.j.size()) {
            post(new a(z2, i));
        }
    }

    public void fling(int i) {
        if (getChildCount() > 0) {
            int i2 = this.i;
            this.m.fling(this.x.getViewScrollX(), this.x.getViewScrollY(), 0, i, 0, 0, 0, Math.max(0, this.c - i2), 0, 0);
            postInvalidate();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getDuration() {
        if (this.k != null) {
            return this.l;
        }
        return 0;
    }

    public ItemExpendListener getItemExpendListener() {
        return this.y;
    }

    public int getNumBottomShow() {
        return this.f;
    }

    public int getOverlapGaps() {
        return this.d;
    }

    public int getOverlapGapsCollapse() {
        return this.e;
    }

    public ScrollDelegate getScrollDelegate() {
        return this.x;
    }

    public int getSelectPosition() {
        return this.h;
    }

    public int getShowHeight() {
        return this.i;
    }

    public int getTotalLength() {
        return this.c;
    }

    @Override // com.loopeer.cardstack.ScrollDelegate
    public int getViewScrollX() {
        return getScrollX();
    }

    @Override // com.loopeer.cardstack.ScrollDelegate
    public int getViewScrollY() {
        return getScrollY();
    }

    public boolean isExpending() {
        return this.h != -1;
    }

    public ViewHolder m(int i) {
        if (i == -1) {
            return null;
        }
        if (this.j.size() > i && this.j.get(i).a == this.g.getItemViewType(i)) {
            return this.j.get(i);
        }
        StackAdapter<?> stackAdapter = this.g;
        ViewHolder viewHolderA = stackAdapter.a(this, stackAdapter.getItemViewType(i));
        this.j.add(viewHolderA);
        return viewHolderA;
    }

    public void next() {
        int i = this.h;
        if (i == -1 || i == this.j.size() - 1) {
            return;
        }
        performItemClick(this.j.get(this.h + 1));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.o) {
            return true;
        }
        if (getViewScrollY() == 0 && !canScrollVertically(1)) {
            return false;
        }
        int i = action & 255;
        if (i == 0) {
            this.n = (int) motionEvent.getY();
            this.t = motionEvent.getPointerId(0);
            o();
            this.p.addMovement(motionEvent);
            this.o = !this.m.isFinished();
        } else if (i == 1) {
            this.o = false;
            this.t = -1;
            u();
            if (this.m.springBack(getViewScrollX(), getViewScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidate();
            }
        } else if (i == 2) {
            int i2 = this.t;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e(B, "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y - this.n) > this.q) {
                        this.o = true;
                        this.n = y;
                        q();
                        this.p.addMovement(motionEvent);
                        this.u = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.o = false;
            this.t = -1;
            u();
            if (this.m.springBack(getViewScrollX(), getViewScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidate();
            }
        } else if (i == 6) {
            t(motionEvent);
        }
        if (!this.v) {
            this.o = false;
        }
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        r();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        h();
        s(i, i2);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z2, boolean z3) {
        if (this.m.isFinished()) {
            super.scrollTo(i, i2);
            return;
        }
        int viewScrollX = this.x.getViewScrollX();
        int viewScrollY = this.x.getViewScrollY();
        this.x.setViewScrollX(i);
        this.x.setViewScrollY(i2);
        onScrollChanged(this.x.getViewScrollX(), this.x.getViewScrollY(), viewScrollX, viewScrollY);
        if (z3) {
            this.m.springBack(this.x.getViewScrollX(), this.x.getViewScrollY(), 0, 0, 0, getScrollRange());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (!this.o) {
            super.onTouchEvent(motionEvent);
        }
        if (!this.v) {
            return true;
        }
        q();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.o) {
                    VelocityTracker velocityTracker = this.p;
                    velocityTracker.computeCurrentVelocity(1000, this.s);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.t);
                    if (getChildCount() > 0) {
                        if (Math.abs(yVelocity) > this.r) {
                            fling(-yVelocity);
                        } else if (this.m.springBack(getViewScrollX(), this.x.getViewScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidate();
                        }
                        this.t = -1;
                    }
                }
                l();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.t);
                if (iFindPointerIndex == -1) {
                    Log.e(B, "Invalid pointerId=" + this.t + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i = this.n - y;
                    if (!this.o && Math.abs(i) > this.q) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.o = true;
                        i = i > 0 ? i - this.q : i + this.q;
                    }
                    int i2 = i;
                    if (this.o) {
                        this.n = y - this.b[1];
                        int scrollRange = getScrollRange();
                        ScrollDelegate scrollDelegate = this.x;
                        if (scrollDelegate instanceof StackScrollDelegateImpl) {
                            scrollDelegate.scrollViewTo(0, i2 + scrollDelegate.getViewScrollY());
                        } else if (overScrollBy(0, i2, 0, getViewScrollY(), 0, scrollRange, 0, 0, true)) {
                            this.p.clear();
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.o && getChildCount() > 0) {
                    if (this.m.springBack(getViewScrollX(), this.x.getViewScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidate();
                    }
                    this.t = -1;
                }
                l();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.n = (int) motionEvent.getY(actionIndex);
                this.t = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                t(motionEvent);
                this.n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.t));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z2 = !this.m.isFinished();
            this.o = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.m.isFinished()) {
                this.m.abortAnimation();
            }
            this.n = (int) motionEvent.getY();
            this.t = motionEvent.getPointerId(0);
        }
        VelocityTracker velocityTracker2 = this.p;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void performItemClick(ViewHolder viewHolder) {
        j(viewHolder, viewHolder.b);
    }

    public void pre() {
        int i = this.h;
        if (i == -1 || i == 0) {
            return;
        }
        performItemClick(this.j.get(i - 1));
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            int i3 = i(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), getWidth());
            int i4 = i(i2, this.i, this.c);
            if (i3 == this.x.getViewScrollX() && i4 == this.x.getViewScrollY()) {
                return;
            }
            super.scrollTo(i3, i4);
        }
    }

    @Override // com.loopeer.cardstack.ScrollDelegate
    public void scrollViewTo(int i, int i2) {
        scrollTo(i, i2);
    }

    public void setAdapter(StackAdapter stackAdapter) {
        this.g = stackAdapter;
        stackAdapter.registerObserver(this.a);
        v();
    }

    public void setAnimationType(int i) {
        AnimatorAdapter allMoveDownAnimatorAdapter;
        if (i != 0) {
            allMoveDownAnimatorAdapter = i != 1 ? new UpDownStackAnimatorAdapter(this) : new UpDownAnimatorAdapter(this);
        } else {
            allMoveDownAnimatorAdapter = new AllMoveDownAnimatorAdapter(this);
        }
        setAnimatorAdapter(allMoveDownAnimatorAdapter);
    }

    public void setAnimatorAdapter(AnimatorAdapter animatorAdapter) {
        clearScrollYAndTranslation();
        this.k = animatorAdapter;
        if (animatorAdapter instanceof UpDownStackAnimatorAdapter) {
            this.x = new StackScrollDelegateImpl(this);
        } else {
            this.x = this;
        }
    }

    public void setClickEnable(boolean z2) {
        this.w = z2;
    }

    public void setDuration(int i) {
        this.l = i;
    }

    public void setItemExpendListener(ItemExpendListener itemExpendListener) {
        this.y = itemExpendListener;
    }

    public void setNumBottomShow(int i) {
        this.f = i;
    }

    public void setOverlapGaps(int i) {
        this.d = i;
    }

    public void setOverlapGapsCollapse(int i) {
        this.e = i;
    }

    public void setScrollEnable(boolean z2) {
        this.v = z2;
    }

    public void setSelectPosition(int i) {
        this.h = i;
        this.y.onItemExpend(i != -1);
    }

    @Override // com.loopeer.cardstack.ScrollDelegate
    public void setViewScrollX(int i) {
        setScrollX(i);
    }

    @Override // com.loopeer.cardstack.ScrollDelegate
    public void setViewScrollY(int i) {
        setScrollY(i);
    }

    public void updateSelectPosition(int i) {
        post(new c(i));
    }

    public CardStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int mHeaderHeight;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mHeaderHeight = context.obtainStyledAttributes(attributeSet, R.styleable.CardStackView).getDimensionPixelSize(R.styleable.CardStackView_stackHeaderHeight, -1);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public CardStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new f(this, null);
        this.b = new int[2];
        this.h = -1;
        this.o = false;
        this.t = -1;
        this.v = true;
        this.w = true;
        n(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public CardStackView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new f(this, null);
        this.b = new int[2];
        this.h = -1;
        this.o = false;
        this.t = -1;
        this.v = true;
        this.w = true;
        n(context, attributeSet, i, i2);
    }
}
