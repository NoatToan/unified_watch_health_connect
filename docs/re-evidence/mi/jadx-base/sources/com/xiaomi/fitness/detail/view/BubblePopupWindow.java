package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eJ\u001e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/detail/view/BubblePopupWindow;", "Landroid/widget/PopupWindow;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "bubbleView", "Lcom/xiaomi/fitness/detail/view/BubbleRelativeLayout;", "setBubbleView", "", "view", "Landroid/view/View;", "setParam", "width", "", "height", "show", "parent", "gravity", "bubbleOffset", "", "measureHeight", "getMeasureHeight", "()I", "measuredWidth", "getMeasuredWidth", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BubblePopupWindow extends PopupWindow {

    @Nullable
    private BubbleRelativeLayout bubbleView;

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubblePopupWindow(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        setWidth(-2);
        setHeight(-2);
        setFocusable(true);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    public final int getMeasureHeight() {
        View contentView = getContentView();
        Intrinsics.checkNotNull(contentView);
        contentView.measure(0, 0);
        View contentView2 = getContentView();
        Intrinsics.checkNotNull(contentView2);
        return contentView2.getMeasuredHeight();
    }

    public final int getMeasuredWidth() {
        View contentView = getContentView();
        Intrinsics.checkNotNull(contentView);
        contentView.measure(0, 0);
        View contentView2 = getContentView();
        Intrinsics.checkNotNull(contentView2);
        return contentView2.getMeasuredWidth();
    }

    public final void setBubbleView(@Nullable View view) {
        BubbleRelativeLayout bubbleRelativeLayout = new BubbleRelativeLayout(this.context);
        this.bubbleView = bubbleRelativeLayout;
        Intrinsics.checkNotNull(bubbleRelativeLayout);
        bubbleRelativeLayout.setBackgroundColor(0);
        BubbleRelativeLayout bubbleRelativeLayout2 = this.bubbleView;
        Intrinsics.checkNotNull(bubbleRelativeLayout2);
        bubbleRelativeLayout2.addView(view);
        setContentView(this.bubbleView);
    }

    public final void setParam(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public final void show(@NotNull View parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        show(parent, 80, getMeasuredWidth() / 2);
    }

    public final void show(@NotNull View parent, int gravity) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        show(parent, gravity, getMeasuredWidth() / 2);
    }

    public final void show(@NotNull View parent, int gravity, float bubbleOffset) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        BubbleRelativeLayout.BubbleLegOrientation bubbleLegOrientation = BubbleRelativeLayout.BubbleLegOrientation.LEFT;
        if (!isShowing()) {
            if (gravity == 3) {
                bubbleLegOrientation = BubbleRelativeLayout.BubbleLegOrientation.RIGHT;
            } else if (gravity != 5) {
                if (gravity == 48) {
                    bubbleLegOrientation = BubbleRelativeLayout.BubbleLegOrientation.BOTTOM;
                } else if (gravity == 80) {
                    bubbleLegOrientation = BubbleRelativeLayout.BubbleLegOrientation.TOP;
                }
            }
            BubbleRelativeLayout bubbleRelativeLayout = this.bubbleView;
            if (bubbleRelativeLayout != null) {
                bubbleRelativeLayout.setBubbleParams(bubbleLegOrientation, bubbleOffset);
            }
            int[] iArr = new int[2];
            parent.getLocationOnScreen(iArr);
            if (gravity == 3) {
                showAtLocation(parent, 0, iArr[0] - getMeasuredWidth(), iArr[1] - (parent.getHeight() / 2));
                return;
            }
            if (gravity == 5) {
                showAtLocation(parent, 0, iArr[0] + parent.getWidth(), iArr[1] - (parent.getHeight() / 2));
                return;
            } else if (gravity == 48) {
                showAtLocation(parent, 0, iArr[0], iArr[1] - getMeasureHeight());
                return;
            } else {
                if (gravity != 80) {
                    return;
                }
                showAtLocation(parent, 0, (iArr[0] - (getMeasuredWidth() / 2)) + (parent.getWidth() / 2), iArr[1] + parent.getHeight());
                return;
            }
        }
        dismiss();
    }
}
