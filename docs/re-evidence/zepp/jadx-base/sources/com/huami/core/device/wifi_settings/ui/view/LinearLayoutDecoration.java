package com.huami.core.device.wifi_settings.ui.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import org.cybergarage.upnp.std.av.server.object.container.ContainerNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b:\u0010;B!\b\u0016\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010<\u001a\u00020\t¢\u0006\u0004\b:\u0010=B-\b\u0016\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\b\u0001\u0010>\u001a\u00020\t\u0012\b\b\u0001\u0010?\u001a\u00020\t¢\u0006\u0004\b:\u0010@J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J0\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J0\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\tJ \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\tJ\u0010\u0010!\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\tJ\u0010\u0010#\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020\tR\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010.R\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010.R\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010.R\u0018\u00109\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00102¨\u0006A"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/view/LinearLayoutDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "drawVertical", "drawHorizontal", "", "left", "right", "top", "bottom", "a", "b", "position", ContainerNode.CHILD_COUNT, "", "c", "orientation", "setOrientation", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "onDraw", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "getItemOffsets", "extraPaddingStart", "setExtraPaddingStart", "extraPaddingEnd", "setExtraPaddingEnd", "extraColorRes", "setExtraColor", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "[I", "ATTRS", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "mDivider", GoogleApiAvailabilityLight.a, LogUtil.I, "mOrientation", "Landroid/graphics/Paint;", "e", "Landroid/graphics/Paint;", "mPaint", "f", "mDividerSize", "g", "h", "i", "extraPaint", "<init>", "(Landroid/content/Context;I)V", "drawableId", "(Landroid/content/Context;II)V", "dividerDimenRes", "dividerColorRes", "(Landroid/content/Context;III)V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class LinearLayoutDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final int[] ATTRS;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Drawable mDivider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mOrientation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Paint mPaint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mDividerSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int extraPaddingStart;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int extraPaddingEnd;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Paint extraPaint;

    public LinearLayoutDecoration(@NotNull Context context, int i) {
        int[] iArr = {R.attr.listDivider};
        this.ATTRS = iArr;
        this.mDividerSize = 2;
        this.context = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        this.mDivider = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(i);
    }

    private final void a(Canvas canvas, int left, int right, int top, int bottom) {
        Drawable drawable = this.mDivider;
        if (drawable != null) {
            drawable.setBounds(left, top, right, bottom);
            drawable.draw(canvas);
        }
        Paint paint = this.mPaint;
        if (paint == null) {
            return;
        }
        canvas.drawRect(left, top, right, bottom, paint);
    }

    private final void b(Canvas canvas, int left, int right, int top, int bottom) {
        Paint paint = this.extraPaint;
        if (paint == null) {
            return;
        }
        canvas.drawRect(left, top, right, bottom, paint);
    }

    private final boolean c(int position, int childCount) {
        return childCount == 0 || (position + 1) % childCount == 0;
    }

    private final void drawHorizontal(Canvas canvas, RecyclerView parent) {
        int paddingTop = parent.getPaddingTop();
        int height = parent.getHeight() - parent.getPaddingBottom();
        int childCount = parent.getChildCount() - 1;
        if (childCount <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            View childAt = parent.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).rightMargin;
            int i3 = right + this.mDividerSize;
            a(canvas, right, i3, paddingTop, height);
            b(canvas, right, i3, 0, this.extraPaddingStart);
            b(canvas, right, i3, height - this.extraPaddingEnd, height);
            if (i2 >= childCount) {
                return;
            } else {
                i = i2;
            }
        }
    }

    private final void drawVertical(Canvas canvas, RecyclerView parent) {
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int childCount = parent.getChildCount() - 1;
        if (childCount <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            View childAt = parent.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
            int i3 = bottom + this.mDividerSize;
            a(canvas, paddingLeft, width, bottom, i3);
            b(canvas, 0, this.extraPaddingStart, bottom, i3);
            b(canvas, width - this.extraPaddingEnd, width, bottom, i3);
            if (i2 >= childCount) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter == null || c(parent.getChildLayoutPosition(view), adapter.getA())) {
            return;
        }
        if (this.mOrientation == 1) {
            outRect.set(0, 0, 0, this.mDividerSize);
        } else {
            outRect.set(0, 0, this.mDividerSize, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull Canvas c, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        super.onDraw(c, parent, state);
        if (this.mOrientation == 1) {
            drawVertical(c, parent);
        } else {
            drawHorizontal(c, parent);
        }
    }

    public final void setExtraColor(@ColorRes int extraColorRes) {
        Paint paint = new Paint(1);
        this.extraPaint = paint;
        paint.setColor(ContextCompat.getColor(this.context, extraColorRes));
        Paint paint2 = this.extraPaint;
        if (paint2 == null) {
            return;
        }
        paint2.setStyle(Paint.Style.FILL);
    }

    public final void setExtraPaddingEnd(@DimenRes int extraPaddingEnd) {
        this.extraPaddingEnd = this.context.getResources().getDimensionPixelOffset(extraPaddingEnd);
    }

    public final void setExtraPaddingStart(@DimenRes int extraPaddingStart) {
        this.extraPaddingStart = this.context.getResources().getDimensionPixelOffset(extraPaddingStart);
    }

    public final void setOrientation(int orientation) {
        boolean z = true;
        if (orientation != 0 && orientation != 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("invalid orientation".toString());
        }
        this.mOrientation = orientation;
    }

    public LinearLayoutDecoration(@NotNull Context context, int i, int i2) {
        this(context, i);
        Drawable drawable = ContextCompat.getDrawable(context, i2);
        this.mDivider = drawable;
        this.mDividerSize = drawable.getIntrinsicHeight();
    }

    public LinearLayoutDecoration(@NotNull Context context, int i, @DimenRes int i2, @ColorRes int i3) {
        this(context, i);
        this.mDivider = null;
        this.mDividerSize = context.getResources().getDimensionPixelSize(i2);
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setColor(ContextCompat.getColor(context, i3));
        Paint paint2 = this.mPaint;
        if (paint2 == null) {
            return;
        }
        paint2.setStyle(Paint.Style.FILL);
    }
}
