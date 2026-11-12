package com.huami.sleepassistant.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.squareup.picasso.u;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001?B#\b\u0007\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\b\b\u0002\u0010<\u001a\u00020\b¢\u0006\u0004\b=\u0010>J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J0\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014J\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R.\u0010\u001b\u001a\u0004\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010!R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010!R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010!R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u00106\u001a\u00020\u00068B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u00105R\u0016\u00107\u001a\u00020\u00068B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u00105¨\u0006@"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/SlidingFinishLayout;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnTouchListener;", "", GoogleApiAvailabilityLight.a, "c", "", u.q, "", "l", "t", "r", "b", "onLayout", "Lcom/huami/sleepassistant/lib/widget/SlidingFinishLayout$OnSlidingFinishListener;", "onSlidingFinishListener", "setOnSlidingFinishListener", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "onTouch", "computeScroll", "Landroid/view/ViewGroup;", "a", "Landroid/view/ViewGroup;", "mParentView", "touchView", "Landroid/view/View;", "getTouchView", "()Landroid/view/View;", "setTouchView", "(Landroid/view/View;)V", LogUtil.I, "mTouchSlop", "downX", "e", "downY", "f", "tempX", "Landroid/widget/Scroller;", "g", "Landroid/widget/Scroller;", "mScroller", "h", "viewWidth", "i", "Z", "isSliding", z.j, "Lcom/huami/sleepassistant/lib/widget/SlidingFinishLayout$OnSlidingFinishListener;", hl.k, "isFinish", "()Z", "isTouchOnAbsListView", "isTouchOnScrollView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OnSlidingFinishListener", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SlidingFinishLayout extends RelativeLayout implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ViewGroup mParentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View touchView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int mTouchSlop;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int downX;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int downY;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int tempX;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Scroller mScroller;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int viewWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isSliding;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private OnSlidingFinishListener onSlidingFinishListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isFinish;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/SlidingFinishLayout$OnSlidingFinishListener;", "", "", "onSlidingFinish", "lib_release"}, k = 1, mv = {1, 5, 1})
    public interface OnSlidingFinishListener {
        void onSlidingFinish();
    }

    @JvmOverloads
    public SlidingFinishLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SlidingFinishLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final boolean a() {
        return this.touchView instanceof AbsListView;
    }

    private final boolean b() {
        return this.touchView instanceof ScrollView;
    }

    private final void c() {
        int scrollX = this.mParentView.getScrollX();
        this.mScroller.startScroll(this.mParentView.getScrollX(), 0, -scrollX, 0, Math.abs(scrollX));
        postInvalidate();
    }

    private final void d() {
        int scrollX = this.viewWidth + this.mParentView.getScrollX();
        this.mScroller.startScroll(this.mParentView.getScrollX(), 0, (-scrollX) + 1, 0, Math.abs(scrollX));
        postInvalidate();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public void computeScroll() {
        OnSlidingFinishListener onSlidingFinishListener;
        if (this.mScroller.computeScrollOffset()) {
            this.mParentView.scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
            postInvalidate();
            if (this.mScroller.isFinished() && (onSlidingFinishListener = this.onSlidingFinishListener) != null && this.isFinish) {
                onSlidingFinishListener.onSlidingFinish();
            }
        }
    }

    @Nullable
    public final View getTouchView() {
        return this.touchView;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if (changed) {
            ViewParent parent = getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            this.mParentView = (ViewGroup) parent;
            this.viewWidth = getWidth();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View v, @NotNull MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            int rawX = (int) event.getRawX();
            this.tempX = rawX;
            this.downX = rawX;
            this.downY = (int) event.getRawY();
        } else if (action == 1) {
            this.isSliding = false;
            if (this.mParentView.getScrollX() <= (-this.viewWidth) / 2) {
                this.isFinish = true;
                d();
            } else {
                c();
                this.isFinish = false;
            }
        } else if (action == 2) {
            int rawX2 = (int) event.getRawX();
            int i = this.tempX - rawX2;
            this.tempX = rawX2;
            if (Math.abs(rawX2 - this.downX) > this.mTouchSlop && Math.abs(((int) event.getRawY()) - this.downY) < this.mTouchSlop) {
                this.isSliding = true;
                if (a()) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(event);
                    motionEventObtain.setAction((event.getActionIndex() << 8) | 3);
                    v.onTouchEvent(motionEventObtain);
                }
            }
            if (rawX2 - this.downX >= 0 && this.isSliding) {
                this.mParentView.scrollBy(i, 0);
                if (b() || a()) {
                    return true;
                }
            }
        }
        if (b() || a()) {
            return v.onTouchEvent(event);
        }
        return true;
    }

    public final void setOnSlidingFinishListener(@NotNull OnSlidingFinishListener onSlidingFinishListener) {
        this.onSlidingFinishListener = onSlidingFinishListener;
    }

    public final void setTouchView(@Nullable View view) {
        this.touchView = view;
        if (view == null) {
            return;
        }
        view.setOnTouchListener(this);
    }

    @JvmOverloads
    public SlidingFinishLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mScroller = new Scroller(context);
    }
}
