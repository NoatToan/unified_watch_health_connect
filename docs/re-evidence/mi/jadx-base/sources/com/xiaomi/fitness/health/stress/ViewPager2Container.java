package com.xiaomi.fitness.health.stress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J \u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/health/stress/ViewPager2Container;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mViewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "disallowParentInterceptDownEvent", "", "startX", "startY", "onFinishInflate", "", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onHorizontalActionMove", "endX", "disX", "disY", "onVerticalActionMove", "endY", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewPager2Container extends RelativeLayout {
    private boolean disallowParentInterceptDownEvent;

    @Nullable
    private ViewPager2 mViewPager2;
    private int startX;
    private int startY;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ViewPager2Container(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void onHorizontalActionMove(int endX, int disX, int disY) {
        ViewPager2 viewPager2 = this.mViewPager2;
        if ((viewPager2 != null ? viewPager2.getAdapter() : null) == null) {
            return;
        }
        if (disX <= disY) {
            if (disY > disX) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        ViewPager2 viewPager3 = this.mViewPager2;
        Integer numValueOf = viewPager3 != null ? Integer.valueOf(viewPager3.getCurrentItem()) : null;
        ViewPager2 viewPager4 = this.mViewPager2;
        RecyclerView.Adapter adapter = viewPager4 != null ? viewPager4.getAdapter() : null;
        Intrinsics.checkNotNull(adapter);
        int itemCount = adapter.getItemCount();
        if (numValueOf != null && numValueOf.intValue() == 0 && endX - this.startX > 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            getParent().requestDisallowInterceptTouchEvent(numValueOf == null || numValueOf.intValue() != itemCount - 1 || endX - this.startX >= 0);
        }
    }

    private final void onVerticalActionMove(int endY, int disX, int disY) {
        ViewPager2 viewPager2 = this.mViewPager2;
        if ((viewPager2 != null ? viewPager2.getAdapter() : null) == null) {
            return;
        }
        ViewPager2 viewPager3 = this.mViewPager2;
        Integer numValueOf = viewPager3 != null ? Integer.valueOf(viewPager3.getCurrentItem()) : null;
        ViewPager2 viewPager4 = this.mViewPager2;
        RecyclerView.Adapter adapter = viewPager4 != null ? viewPager4.getAdapter() : null;
        Intrinsics.checkNotNull(adapter);
        int itemCount = adapter.getItemCount();
        if (disY <= disX) {
            if (disX > disY) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 0 && endY - this.startY > 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            getParent().requestDisallowInterceptTouchEvent(numValueOf == null || numValueOf.intValue() != itemCount - 1 || endY - this.startY >= 0);
        }
    }

    public final void disallowParentInterceptDownEvent(boolean disallowParentInterceptDownEvent) {
        this.disallowParentInterceptDownEvent = disallowParentInterceptDownEvent;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ViewPager2) {
                this.mViewPager2 = (ViewPager2) childAt;
                break;
            }
        }
        if (this.mViewPager2 == null) {
            throw new IllegalStateException("The root child of ViewPager2Container must contains a ViewPager2");
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.getItemCount() <= 1) goto L34;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.viewpager2.widget.ViewPager2 r0 = r6.mViewPager2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r0.f()
            if (r0 == 0) goto L9d
            androidx.viewpager2.widget.ViewPager2 r0 = r6.mViewPager2
            r1 = 0
            if (r0 == 0) goto L1a
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            goto L1b
        L1a:
            r0 = r1
        L1b:
            r2 = 1
            if (r0 == 0) goto L30
            androidx.viewpager2.widget.ViewPager2 r0 = r6.mViewPager2
            if (r0 == 0) goto L26
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r0.getAdapter()
        L26:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r0 = r1.getItemCount()
            if (r0 > r2) goto L30
            goto L9d
        L30:
            int r0 = r7.getAction()
            if (r0 == 0) goto L80
            if (r0 == r2) goto L77
            r1 = 2
            if (r0 == r1) goto L3f
            r1 = 3
            if (r0 == r1) goto L77
            goto L98
        L3f:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r3 = r6.startX
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r4 = r6.startY
            int r4 = r1 - r4
            int r4 = java.lang.Math.abs(r4)
            androidx.viewpager2.widget.ViewPager2 r5 = r6.mViewPager2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r5 = r5.getOrientation()
            if (r5 != r2) goto L68
            r6.onVerticalActionMove(r1, r3, r4)
            goto L98
        L68:
            androidx.viewpager2.widget.ViewPager2 r1 = r6.mViewPager2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.getOrientation()
            if (r1 != 0) goto L98
            r6.onHorizontalActionMove(r0, r3, r4)
            goto L98
        L77:
            android.view.ViewParent r0 = r6.getParent()
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L98
        L80:
            float r0 = r7.getX()
            int r0 = (int) r0
            r6.startX = r0
            float r0 = r7.getY()
            int r0 = (int) r0
            r6.startY = r0
            android.view.ViewParent r0 = r6.getParent()
            boolean r1 = r6.disallowParentInterceptDownEvent
            r1 = r1 ^ r2
            r0.requestDisallowInterceptTouchEvent(r1)
        L98:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        L9d:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.health.stress.ViewPager2Container.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ViewPager2Container(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ViewPager2Container(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ViewPager2Container(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.disallowParentInterceptDownEvent = true;
    }
}
