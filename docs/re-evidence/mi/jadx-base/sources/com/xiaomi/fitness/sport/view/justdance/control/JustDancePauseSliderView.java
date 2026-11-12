package com.xiaomi.fitness.sport.view.justdance.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.psq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u0006\u001a\u00020\u00032\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\tR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDancePauseSliderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function0;", "", "Lcom/xiaomi/fitness/sport/view/justdance/control/OnPauseSliderTriggerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnPauseSliderTriggerListener", "(Lkotlin/jvm/functions/Function0;)V", "onAttachedToWindow", "()V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "event", "onTouchEvent", "computeScroll", "Lpsq;", "mViewDragHelper", "Lpsq;", "onPauseSliderTriggerListener", "Lkotlin/jvm/functions/Function0;", "scrollToEnd", "Z", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DragCallback", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class JustDancePauseSliderView extends ConstraintLayout {

    @Nullable
    private psq mViewDragHelper;

    @Nullable
    private Function0<Unit> onPauseSliderTriggerListener;
    private boolean scrollToEnd;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\fJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDancePauseSliderView$DragCallback;", "Lpsq$c;", "Landroid/view/View;", "child", "", "pointerId", "", "tryCaptureView", "(Landroid/view/View;I)Z", "left", "dx", "clampViewPositionHorizontal", "(Landroid/view/View;II)I", "top", "dy", "clampViewPositionVertical", "releasedChild", "", "xvel", "yvel", "", "onViewReleased", "(Landroid/view/View;FF)V", "<init>", "(Lcom/xiaomi/fitness/sport/view/justdance/control/JustDancePauseSliderView;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class DragCallback extends psq.c {
        public DragCallback() {
        }

        @Override // psq.c
        public int clampViewPositionHorizontal(@NotNull View child, int left, int dx) {
            Intrinsics.checkNotNullParameter(child, "child");
            int paddingLeft = JustDancePauseSliderView.this.getPaddingLeft() + ExtUtilsKt.getDp(8);
            int width = (JustDancePauseSliderView.this.getWidth() - child.getWidth()) - ExtUtilsKt.getDp(8);
            int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(left, paddingLeft), width);
            JustDancePauseSliderView.this.scrollToEnd = iCoerceAtMost == width;
            return iCoerceAtMost;
        }

        @Override // psq.c
        public int clampViewPositionVertical(@NotNull View child, int top, int dy) {
            Intrinsics.checkNotNullParameter(child, "child");
            return ExtUtilsKt.getDp(8);
        }

        @Override // psq.c
        public void onViewReleased(@NotNull View releasedChild, float xvel, float yvel) {
            Function0 function0;
            Intrinsics.checkNotNullParameter(releasedChild, "releasedChild");
            psq psqVar = JustDancePauseSliderView.this.mViewDragHelper;
            if (psqVar != null) {
                psqVar.P(ExtUtilsKt.getDp(8), ExtUtilsKt.getDp(8));
            }
            if (JustDancePauseSliderView.this.scrollToEnd && (function0 = JustDancePauseSliderView.this.onPauseSliderTriggerListener) != null) {
                function0.invoke();
            }
            JustDancePauseSliderView.this.scrollToEnd = false;
            JustDancePauseSliderView.this.postInvalidate();
        }

        @Override // psq.c
        public boolean tryCaptureView(@NotNull View child, int pointerId) {
            Intrinsics.checkNotNullParameter(child, "child");
            return child instanceof ImageView;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JustDancePauseSliderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void computeScroll() {
        psq psqVar = this.mViewDragHelper;
        if (psqVar == null || !psqVar.n(true)) {
            return;
        }
        androidx.core.view.c.h0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mViewDragHelper = psq.o(this, 1.0f, new DragCallback());
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent ev) {
        if (ev != null) {
            int actionMasked = ev.getActionMasked();
            if (actionMasked != 1 && actionMasked != 3) {
                psq psqVar = this.mViewDragHelper;
                return psqVar != null && psqVar.Q(ev);
            }
            psq psqVar2 = this.mViewDragHelper;
            if (psqVar2 != null) {
                psqVar2.b();
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        psq psqVar = this.mViewDragHelper;
        if (psqVar == null) {
            return true;
        }
        psqVar.G(event);
        return true;
    }

    public final void setOnPauseSliderTriggerListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPauseSliderTriggerListener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JustDancePauseSliderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ JustDancePauseSliderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JustDancePauseSliderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
