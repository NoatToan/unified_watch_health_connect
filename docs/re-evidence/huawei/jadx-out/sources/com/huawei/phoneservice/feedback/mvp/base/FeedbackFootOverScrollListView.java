package com.huawei.phoneservice.feedback.mvp.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.ListView;
import com.huawei.phoneservice.faq.base.util.FaqRefectUtils;
import com.huawei.phoneservice.feedback.R;

/* JADX INFO: loaded from: classes41.dex */
public class FeedbackFootOverScrollListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21669c;
    private float d;
    private int e;
    private boolean f;
    private int g;
    private a j;

    /* JADX INFO: loaded from: classes13.dex */
    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ListView
    public void setOverscrollFooter(Drawable drawable) {
        super.setOverscrollFooter(drawable);
        if (drawable instanceof a) {
            a aVar = (a) drawable;
            this.j = aVar;
            aVar.a(getWidth(), getHeight(), getWidth(), getHeight());
        }
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (this.f21667a) {
            this.f21667a = false;
        }
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, this.e, z);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (motionEvent.getAction() == 0) {
            int i = this.f21668b;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int iPointToPosition = pointToPosition((int) motionEvent.getX(iFindPointerIndex), (int) motionEvent.getY(iFindPointerIndex));
                this.g = iPointToPosition;
                if (iPointToPosition == -1) {
                    FaqRefectUtils.b(this, AbsListView.class, "mTouchMode", 5);
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        this.f21667a = true;
    }

    @Override // android.widget.AbsListView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (i2 < 0 && !this.f) {
            i2 = 0;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.d = motionEvent.getY();
            this.f21668b = motionEvent.getPointerId(0);
        } else if (action == 1) {
            this.f21668b = -1;
            this.g = -1;
        } else if (action == 2) {
            int i = this.f21668b;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                this.f21668b = iFindPointerIndex;
                if (Math.abs(((int) motionEvent.getY(iFindPointerIndex)) - ((int) this.d)) > this.f21669c) {
                    return true;
                }
            }
        } else if (action == 3) {
            this.f21668b = -1;
            this.g = -1;
        }
        if (!zOnInterceptTouchEvent) {
            onTouchEvent(motionEvent);
        }
        return zOnInterceptTouchEvent;
    }

    private void a(Context context) {
        this.f21669c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.e = (int) (context.getResources().getDisplayMetrics().density * 140.0f);
        setOverScrollMode(0);
    }

    public FeedbackFootOverScrollListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21668b = -1;
        this.f21667a = false;
        this.f = true;
        this.g = -1;
        a(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FeedbackFootOverScrollListView);
            this.f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FeedbackFootOverScrollListView_feedbacksdkheadOverScroll, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FeedbackFootOverScrollListView(Context context) {
        super(context);
        this.f21668b = -1;
        this.f21667a = false;
        this.f = true;
        this.g = -1;
        a(context);
    }
}
