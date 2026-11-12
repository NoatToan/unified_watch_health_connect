package com.xiaomi.fitness.watch.face.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 :2\u00020\u0001:\u0001:B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0016J\u000e\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0007J\u0012\u0010)\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0016J\u000e\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u000bJ\u0010\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0011H\u0002J\u000e\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0007J/\u00104\u001a\u00020\u00172\"\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u0002`\u0014¢\u0006\u0002\u00106J)\u00107\u001a\u00020\u00172\u001c\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u001bj\u0002`\u001a¢\u0006\u0002\u00108J\b\u00109\u001a\u00020\u0017H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R*\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001bj\u0004\u0018\u0001`\u001aX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/watch/face/widget/FaceEditScrollLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mHeaderView", "Landroid/view/View;", "mHeaderHeight", "originHeaderHeight", "maxPullHeight", "minHeaderHeight", "mInitX", "", "mInitY", "onPreviewResizeListener", "Lcom/xiaomi/fitness/watch/face/widget/OnPreviewResizeListener;", "Lkotlin/Function3;", "", "", "Lkotlin/jvm/functions/Function3;", "onScrollListener", "Lcom/xiaomi/fitness/watch/face/widget/OnScrollListener;", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "canScrollVertically", "bottomViewHeight", "needScrollAnimator", "animatorOn", "getAnimatorOn", "()Z", "setAnimatorOn", "(Z)V", "setCanScrollVertically", "value", "setBottomViewHeight", "height", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "onTouchEvent", "setHeader", "header", "changeHeaderHeight", "y", "onScrollEnd", "current", "setOnPreviewResizeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lkotlin/jvm/functions/Function3;)V", "setOnScrollListener", "(Lkotlin/jvm/functions/Function2;)V", "runAnimator", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditScrollLayout extends ConstraintLayout {

    @NotNull
    private static final String TAG = "FaceEditScrollLayout";
    private boolean animatorOn;
    private int bottomViewHeight;
    private boolean canScrollVertically;
    private int mHeaderHeight;

    @Nullable
    private View mHeaderView;
    private float mInitX;
    private float mInitY;
    private int maxPullHeight;
    private int minHeaderHeight;
    private boolean needScrollAnimator;

    @Nullable
    private Function3<? super Integer, ? super Integer, ? super Boolean, Unit> onPreviewResizeListener;

    @Nullable
    private Function2<? super Integer, ? super Integer, Unit> onScrollListener;
    private int originHeaderHeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceEditScrollLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void changeHeaderHeight(float y) {
        int i = (int) y;
        int i2 = this.mHeaderHeight + i;
        if ((i2 < ExtUtilsKt.getDp(240) || this.bottomViewHeight <= 0) && (this.bottomViewHeight != 0 || y >= 0.0f)) {
            return;
        }
        View view = this.mHeaderView;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = i2;
        }
        View view2 = this.mHeaderView;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        View view3 = this.mHeaderView;
        if (view3 != null) {
            view3.requestLayout();
        }
        Function3<? super Integer, ? super Integer, ? super Boolean, Unit> function3 = this.onPreviewResizeListener;
        if (function3 != null) {
            function3.invoke(Integer.valueOf(i), Integer.valueOf(i2 - this.originHeaderHeight), Boolean.FALSE);
        }
    }

    private final void runAnimator() {
        Function2<? super Integer, ? super Integer, Unit> function2 = this.onScrollListener;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(this.mHeaderHeight), Integer.valueOf(this.bottomViewHeight));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        Integer numValueOf = ev != null ? Integer.valueOf(ev.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.mInitY = ev.getY();
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            int i = this.bottomViewHeight;
            if (i < 0) {
                i = 0;
            }
            this.bottomViewHeight = i;
        }
        return super.dispatchTouchEvent(ev);
    }

    public final boolean getAnimatorOn() {
        return this.animatorOn;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getActionMasked() != 2) {
            return super.onInterceptTouchEvent(ev);
        }
        float y = ev.getY() - this.mInitY;
        float f = this.mHeaderHeight + y;
        if (y > 0.0f) {
            boolean z = this.canScrollVertically;
            this.needScrollAnimator = z;
            return z;
        }
        if (y < 0.0f) {
            this.needScrollAnimator = f > ((float) ExtUtilsKt.getDp(262));
            if (this.canScrollVertically && f > ExtUtilsKt.getDp(262)) {
                return true;
            }
        }
        return false;
    }

    public final void onScrollEnd(int current) {
        this.animatorOn = false;
        this.mHeaderHeight = current;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        View view = this.mHeaderView;
        if (view != null) {
            Intrinsics.checkNotNull(view);
            if (view.getHeight() > 0) {
                int actionMasked = ev.getActionMasked();
                if (actionMasked == 0) {
                    Logger.i(TAG, "onTouchEvent: " + ev.getY());
                    int screenHeight = DisplayUtil.getScreenHeight();
                    int i = this.bottomViewHeight;
                    int i2 = screenHeight - i;
                    Logger.i(TAG, "screenHeight: " + screenHeight + " bottomViewHeight: " + i);
                    return ev.getY() <= ((float) i2) && !this.animatorOn;
                }
                if (actionMasked == 1) {
                    View view2 = this.mHeaderView;
                    Intrinsics.checkNotNull(view2);
                    this.mHeaderHeight = view2.getLayoutParams().height;
                    Function3<? super Integer, ? super Integer, ? super Boolean, Unit> function3 = this.onPreviewResizeListener;
                    if (function3 != null) {
                        function3.invoke(0, 0, Boolean.TRUE);
                    }
                    if (this.needScrollAnimator && !this.animatorOn) {
                        runAnimator();
                    }
                } else if (actionMasked == 2) {
                    this.needScrollAnimator = true;
                    float y = ev.getY() - this.mInitY;
                    changeHeaderHeight(y);
                    return (this.animatorOn || y == 0.0f) ? false : true;
                }
            }
        }
        return super.onTouchEvent(ev);
    }

    public final void setAnimatorOn(boolean z) {
        this.animatorOn = z;
    }

    public final void setBottomViewHeight(int height) {
        this.bottomViewHeight = height;
    }

    public final void setCanScrollVertically(boolean value) {
        this.canScrollVertically = !value;
    }

    public final void setHeader(@NotNull View header) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.mHeaderView = header;
        Intrinsics.checkNotNull(header);
        this.mHeaderHeight = header.getLayoutParams().height;
        int i = header.getLayoutParams().height;
        this.originHeaderHeight = i;
        this.minHeaderHeight = i - 540;
    }

    public final void setOnPreviewResizeListener(@NotNull Function3<? super Integer, ? super Integer, ? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPreviewResizeListener = listener;
    }

    public final void setOnScrollListener(@NotNull Function2<? super Integer, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onScrollListener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceEditScrollLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FaceEditScrollLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceEditScrollLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxPullHeight = 200;
        this.canScrollVertically = true;
    }
}
