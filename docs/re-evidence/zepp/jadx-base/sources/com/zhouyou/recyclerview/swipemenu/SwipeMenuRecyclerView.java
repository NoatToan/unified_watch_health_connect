package com.zhouyou.recyclerview.swipemenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.zhouyou.recyclerview.XRecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public class SwipeMenuRecyclerView extends XRecyclerView {
    public static final int DIRECTION_LEFT = 1;
    public static final int DIRECTION_RIGHT = -1;
    public static final int TOUCH_STATE_NONE = 0;
    public static final int TOUCH_STATE_X = 1;
    public static final int TOUCH_STATE_Y = 2;
    public float dx;
    public float dy;
    public Interpolator mCloseInterpolator;
    public int mDirection;
    public float mDownX;
    public float mDownY;
    public RecyclerView.LayoutManager mLlm;
    public OnSwipeListener mOnSwipeListener;
    public Interpolator mOpenInterpolator;
    public int mTouchPosition;
    public int mTouchState;
    public SwipeMenuLayout mTouchView;
    public ViewConfiguration mViewConfiguration;
    public long startClickTime;

    public interface OnSwipeListener {
        void onSwipeEnd(int i);

        void onSwipeStart(int i);
    }

    public SwipeMenuRecyclerView(Context context) {
        this(context, null);
    }

    public Interpolator getCloseInterpolator() {
        return this.mCloseInterpolator;
    }

    public Interpolator getOpenInterpolator() {
        return this.mOpenInterpolator;
    }

    public SwipeMenuLayout getTouchView() {
        return this.mTouchView;
    }

    public void init() {
        this.mTouchState = 0;
        this.mViewConfiguration = ViewConfiguration.get(getContext());
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        if (r0 != false) goto L75;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SwipeMenuLayout swipeMenuLayout;
        SwipeMenuLayout swipeMenuLayout2;
        boolean z;
        SwipeMenuLayout swipeMenuLayout3;
        if (motionEvent.getAction() != 0 && this.mTouchView == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.dx = 0.0f;
            this.dy = 0.0f;
            this.startClickTime = System.currentTimeMillis();
            int i = this.mTouchPosition;
            this.mDownX = motionEvent.getX();
            this.mDownY = motionEvent.getY();
            this.mTouchState = 0;
            int childAdapterPosition = getChildAdapterPosition(findChildViewUnder((int) motionEvent.getX(), (int) motionEvent.getY()));
            this.mTouchPosition = childAdapterPosition;
            if (childAdapterPosition == i && (swipeMenuLayout2 = this.mTouchView) != null && swipeMenuLayout2.isOpen()) {
                this.mTouchState = 1;
                this.mTouchView.onSwipe(motionEvent);
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(this.mTouchPosition);
            View view = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null;
            if (this.mTouchPosition != i && (swipeMenuLayout = this.mTouchView) != null && swipeMenuLayout.isOpen()) {
                this.mTouchView.smoothCloseMenu();
                this.mTouchView = null;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setAction(3);
                super.onTouchEvent(motionEventObtain);
                return true;
            }
            if (view instanceof SwipeMenuLayout) {
                SwipeMenuLayout swipeMenuLayout4 = (SwipeMenuLayout) view;
                this.mTouchView = swipeMenuLayout4;
                swipeMenuLayout4.setSwipeDirection(this.mDirection);
            }
            SwipeMenuLayout swipeMenuLayout5 = this.mTouchView;
            if (swipeMenuLayout5 != null) {
                swipeMenuLayout5.onSwipe(motionEvent);
            }
        } else {
            if (action == 1) {
                if (this.mTouchState == 1 && this.mTouchView.isSwipeEnable()) {
                    z = !this.mTouchView.onSwipe(motionEvent);
                    OnSwipeListener onSwipeListener = this.mOnSwipeListener;
                    if (onSwipeListener != null) {
                        onSwipeListener.onSwipeEnd(this.mTouchPosition);
                    }
                    if (!this.mTouchView.isOpen()) {
                        this.mTouchPosition = -1;
                        this.mTouchView = null;
                    }
                    motionEvent.setAction(3);
                    super.onTouchEvent(motionEvent);
                } else {
                    z = false;
                }
                boolean z2 = System.currentTimeMillis() - this.startClickTime > ((long) ViewConfiguration.getLongPressTimeout());
                boolean z3 = this.dx > ((float) this.mViewConfiguration.getScaledTouchSlop());
                boolean z4 = this.dy > ((float) this.mViewConfiguration.getScaledTouchSlop());
                if (!z2 && !z3 && !z4) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    View viewFindChildViewUnder = findChildViewUnder(x, y);
                    if (viewFindChildViewUnder instanceof SwipeMenuLayout) {
                        SwipeMenuLayout swipeMenuLayout6 = (SwipeMenuLayout) viewFindChildViewUnder;
                        int left = ((int) x) - swipeMenuLayout6.getLeft();
                        int top = ((int) y) - swipeMenuLayout6.getTop();
                        View menuView = swipeMenuLayout6.getMenuView();
                        float translationX = ViewCompat.getTranslationX(menuView);
                        float translationY = ViewCompat.getTranslationY(menuView);
                        float f = left;
                        if (f >= menuView.getLeft() + translationX && f <= menuView.getRight() + translationX) {
                            float f2 = top;
                            if (f2 < menuView.getTop() + translationY || f2 > menuView.getBottom() + translationY) {
                            }
                        }
                    }
                }
                return true;
            }
            if (action == 2) {
                this.dy = Math.abs(motionEvent.getY() - this.mDownY);
                this.dx = Math.abs(motionEvent.getX() - this.mDownX);
                if (this.mTouchState == 1 && this.mTouchView.isSwipeEnable()) {
                    this.mTouchView.onSwipe(motionEvent);
                    motionEvent.setAction(3);
                    super.onTouchEvent(motionEvent);
                } else if (this.mTouchState == 0 && this.mTouchView.isSwipeEnable()) {
                    if (Math.abs(this.dy) > this.mViewConfiguration.getScaledTouchSlop()) {
                        this.mTouchState = 2;
                    } else if (this.dx > this.mViewConfiguration.getScaledTouchSlop()) {
                        this.mTouchState = 1;
                        OnSwipeListener onSwipeListener2 = this.mOnSwipeListener;
                        if (onSwipeListener2 != null) {
                            onSwipeListener2.onSwipeStart(this.mTouchPosition);
                        }
                    }
                }
            } else if (action == 3 && (swipeMenuLayout3 = this.mTouchView) != null && swipeMenuLayout3.isSwipeEnable()) {
                motionEvent.setAction(1);
                this.mTouchView.onSwipe(motionEvent);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setCloseInterpolator(Interpolator interpolator) {
        this.mCloseInterpolator = interpolator;
    }

    @Override // com.zhouyou.recyclerview.XRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        this.mLlm = layoutManager;
    }

    public void setOnSwipeListener(OnSwipeListener onSwipeListener) {
        this.mOnSwipeListener = onSwipeListener;
    }

    public void setOpenInterpolator(Interpolator interpolator) {
        this.mOpenInterpolator = interpolator;
    }

    public void setSwipeDirection(int i) {
        this.mDirection = i;
    }

    public void smoothCloseMenu() {
        SwipeMenuLayout swipeMenuLayout = this.mTouchView;
        if (swipeMenuLayout == null || !swipeMenuLayout.isOpen()) {
            return;
        }
        this.mTouchView.smoothCloseMenu();
    }

    public void smoothOpenMenu(int i) {
        View viewFindViewByPosition = this.mLlm.findViewByPosition(i);
        if (viewFindViewByPosition instanceof SwipeMenuLayout) {
            this.mTouchPosition = i;
            SwipeMenuLayout swipeMenuLayout = this.mTouchView;
            if (swipeMenuLayout != null && swipeMenuLayout.isOpen()) {
                this.mTouchView.smoothCloseMenu();
            }
            SwipeMenuLayout swipeMenuLayout2 = (SwipeMenuLayout) viewFindViewByPosition;
            this.mTouchView = swipeMenuLayout2;
            swipeMenuLayout2.setSwipeDirection(this.mDirection);
            this.mTouchView.smoothOpenMenu();
        }
    }

    public SwipeMenuRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeMenuRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDirection = 1;
        init();
    }
}
