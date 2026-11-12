package com.huami.treadmill.ext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.widget.NestedScrollView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001(B\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b!\u0010%B#\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b!\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0014R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/huami/treadmill/ext/AutoNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "Lcom/huami/treadmill/ext/AutoNestedScrollView$OnScrollListener;", "onScrollListener", "", "setOnScrollListener", "", "l", "t", "oldl", "oldt", "onScrollChanged", "", "a", "F", "xDistance", "b", "yDistance", "c", "xLast", GoogleApiAvailabilityLight.a, "yLast", "e", LogUtil.I, "scaledTouchSlop", "f", "Lcom/huami/treadmill/ext/AutoNestedScrollView$OnScrollListener;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OnScrollListener", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class AutoNestedScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float xDistance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float yDistance;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float xLast;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float yLast;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int scaledTouchSlop;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private OnScrollListener onScrollListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/treadmill/ext/AutoNestedScrollView$OnScrollListener;", "", "", "scrollY", "", "onScroll", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public interface OnScrollListener {
        void onScroll(int scrollY);
    }

    public AutoNestedScrollView(@NotNull Context context) {
        super(context);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        int action = ev.getAction();
        if (action == 0) {
            this.yDistance = 0.0f;
            this.xDistance = 0.0f;
            this.xLast = ev.getX();
            this.yLast = ev.getY();
        } else if (action == 2) {
            float x = ev.getX();
            float y = ev.getY();
            this.xDistance += Math.abs(x - this.xLast);
            float fAbs = this.yDistance + Math.abs(y - this.yLast);
            this.yDistance = fAbs;
            this.xLast = x;
            this.yLast = y;
            return this.xDistance < fAbs && fAbs >= ((float) this.scaledTouchSlop);
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        int scrollY = getScrollY();
        OnScrollListener onScrollListener = this.onScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScroll(scrollY);
        }
    }

    public final void setOnScrollListener(@NotNull OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }

    public AutoNestedScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AutoNestedScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
