package com.huawei.phoneservice.feedback.mvp.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.phoneservice.feedback.R;

/* JADX INFO: loaded from: classes13.dex */
public class FeedbackCITListView extends RecyclerView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView.ItemDecoration f21666c;
    private boolean e;

    public void setmDisableScroll(boolean z) {
        this.e = z;
    }

    public void setColumnCount(int i) {
        RecyclerView.ItemDecoration itemDecoration = this.f21666c;
        if (itemDecoration instanceof com.huawei.phoneservice.feedback.widget.decortion.a) {
            ((com.huawei.phoneservice.feedback.widget.decortion.a) itemDecoration).b(i);
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).setSpanCount(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (!isInEditMode() && !(adapter instanceof com.huawei.phoneservice.feedback.widget.b)) {
            throw new IllegalArgumentException("MUST use CITListAdapter!");
        }
        super.setAdapter(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e = getLayoutParams().height == -2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public com.huawei.phoneservice.feedback.widget.b getAdapter() {
        return (com.huawei.phoneservice.feedback.widget.b) super.getAdapter();
    }

    public void e(int i, int i2) {
        RecyclerView.ItemDecoration itemDecoration = this.f21666c;
        if (itemDecoration instanceof com.huawei.phoneservice.feedback.widget.decortion.a) {
            ((com.huawei.phoneservice.feedback.widget.decortion.a) itemDecoration).e(i);
            ((com.huawei.phoneservice.feedback.widget.decortion.a) this.f21666c).a(i2);
        }
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FeedbackCITListView, i, 0);
        if (typedArrayObtainStyledAttributes.getInteger(R.styleable.FeedbackCITListView_fbsdkListMode, 0) != 1) {
            setLayoutManager(new LinearLayoutManager(context));
        } else {
            this.f21666c = new com.huawei.phoneservice.feedback.widget.decortion.a();
            int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.FeedbackCITListView_fbsdkColumns, 2);
            setLayoutManager(new GridLayoutManager(context, integer));
            addItemDecoration(this.f21666c);
            setColumnCount(integer);
            e(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.FeedbackCITListView_fbsdkVerticalGap, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.FeedbackCITListView_fbsdkHorizontalGap, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public FeedbackCITListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        this.f21666c = null;
        a(context, attributeSet, i);
    }

    public FeedbackCITListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.f21666c = null;
        a(context, attributeSet, 0);
    }

    public FeedbackCITListView(Context context) {
        super(context);
        this.e = false;
        this.f21666c = null;
        a(context, null, 0);
    }
}
