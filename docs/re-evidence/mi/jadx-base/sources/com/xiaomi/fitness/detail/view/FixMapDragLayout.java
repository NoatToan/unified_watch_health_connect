package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import defpackage.w4j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/view/FixMapDragLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "downX", "", "downY", "isDragged", "", "touchSlop", "HORIZONTAL", "VERTICAL", "orientation", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixMapDragLayout extends FrameLayout {
    private final int HORIZONTAL;
    private final int VERTICAL;
    private float downX;
    private float downY;
    private boolean isDragged;
    private int orientation;
    private final int touchSlop;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixMapDragLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int actionMasked = ev.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            this.downX = ev.getX();
            this.downY = ev.getY();
            this.isDragged = false;
        } else if (actionMasked == 1) {
            this.isDragged = false;
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (actionMasked == 2) {
            if (!this.isDragged) {
                float fAbs = Math.abs(ev.getX() - this.downX);
                float fAbs2 = Math.abs(ev.getY() - this.downY);
                int i = this.orientation;
                if (i == this.HORIZONTAL) {
                    if (fAbs > this.touchSlop && fAbs > fAbs2) {
                        z = true;
                    }
                    this.isDragged = z;
                } else if (i == this.VERTICAL) {
                    if (fAbs2 > this.touchSlop && fAbs2 > fAbs) {
                        z = true;
                    }
                    this.isDragged = z;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(this.isDragged);
        } else if (actionMasked == 3) {
            this.isDragged = false;
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (actionMasked == 5) {
            this.isDragged = true;
        } else if (actionMasked == 6) {
            this.isDragged = ev.getPointerCount() > 1;
            getParent().requestDisallowInterceptTouchEvent(this.isDragged);
        }
        return super.onInterceptTouchEvent(ev);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixMapDragLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FixMapDragLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixMapDragLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.VERTICAL = 1;
        this.orientation = this.HORIZONTAL;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w4j.W0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.orientation = typedArrayObtainStyledAttributes.getInt(w4j.X0, this.HORIZONTAL);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
