package com.huami.worldclock.add.alphabetic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.worldclock.R;
import com.huami.worldclock.utils.RtlUtils;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010E\u001a\u00020D\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0010F\u001a\u00020\u0004\u0012\u0006\u0010A\u001a\u00020\u0004¢\u0006\u0004\bG\u0010HJ0\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002J \u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J \u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J(\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u0010\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\u0004J\u0010\u0010\u001d\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eJ\u0014\u0010$\u001a\u00020\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010)R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010)R\u0018\u0010C\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010.¨\u0006I"}, d2 = {"Lcom/huami/worldclock/add/alphabetic/SuspensionDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Canvas;", "c", "", "left", "right", "Landroid/view/View;", "child", "position", "", "b", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "a", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "onDraw", "onDrawOver", "Landroid/graphics/Rect;", "outRect", ViewHierarchyConstants.VIEW_KEY, "getItemOffsets", "mTitleHeight", "setmTitleHeight", "colorTitleBg", "setColorTitleBg", "colorTitleFont", "setColorTitleFont", "", "mTitleFontSize", "setTitleFontSize", "", "Lcom/huami/worldclock/add/alphabetic/ISuspensionInterface;", "data", "setData", "Ljava/util/List;", "", "Ljava/lang/String;", "TAG", LogUtil.I, GoogleApiAvailabilityLight.a, "e", "Landroid/graphics/Paint;", "f", "Landroid/graphics/Paint;", "mPaint", "g", "Landroid/graphics/Rect;", "mBounds", "Landroid/view/LayoutInflater;", "h", "Landroid/view/LayoutInflater;", "mInflater", "i", "", z.j, "[I", "attrs", "Landroid/graphics/drawable/Drawable;", hl.k, "Landroid/graphics/drawable/Drawable;", "mDivider", "l", "mDividerHeight", "m", "mPaintDivider", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "mDividerColor", "<init>", "(Landroid/content/Context;Ljava/util/List;II)V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class SuspensionDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<? extends ISuspensionInterface> data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int colorTitleBg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int colorTitleFont;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mTitleFontSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Paint mPaint;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Rect mBounds;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LayoutInflater mInflater;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mTitleHeight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final int[] attrs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Drawable mDivider;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int mDividerHeight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private Paint mPaintDivider;

    public /* synthetic */ SuspensionDecoration(Context context, List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? new ArrayList() : list, i, i2);
    }

    private final void a(Canvas canvas, RecyclerView parent, View child) {
        int paddingLeft = parent.getPaddingLeft();
        int measuredWidth = parent.getMeasuredWidth() - parent.getPaddingRight();
        int top = child.getTop() - this.mDividerHeight;
        int top2 = child.getTop();
        Drawable drawable = this.mDivider;
        if (drawable != null) {
            drawable.setBounds(paddingLeft, top, measuredWidth, top2);
            this.mDivider.draw(canvas);
        }
        Paint paint = this.mPaintDivider;
        if (paint != null) {
            canvas.drawRect(paddingLeft, top, measuredWidth, top2, paint);
        }
    }

    private final void b(Canvas c, int left, int right, View child, int position) {
        this.mPaint.setColor(this.colorTitleBg);
        float f = left;
        float f2 = right;
        c.drawRect(f, child.getTop() - this.mTitleHeight, f2, child.getTop(), this.mPaint);
        this.mPaint.setColor(this.colorTitleFont);
        this.mPaint.getTextBounds(this.data.get(position).suspensionTag(), 0, this.data.get(position).suspensionTag().length(), this.mBounds);
        c.drawText(this.data.get(position).suspensionTag(), RtlUtils.INSTANCE.isRTL() ? (f2 - child.getPaddingRight()) - this.mBounds.width() : child.getPaddingLeft(), child.getTop() - ((this.mTitleHeight / 2) - (this.mBounds.height() / 2)), this.mPaint);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int viewLayoutPosition = ((RecyclerView.LayoutParams) layoutParams).getViewLayoutPosition();
        if (this.data.isEmpty() || viewLayoutPosition > this.data.size() - 1 || viewLayoutPosition <= -1) {
            return;
        }
        ISuspensionInterface iSuspensionInterface = this.data.get(viewLayoutPosition);
        if (!iSuspensionInterface.getIsVisibleSuspension()) {
            outRect.set(0, 0, 0, this.mDividerHeight);
            return;
        }
        if (viewLayoutPosition == 0) {
            outRect.set(0, this.mTitleHeight, 0, 0);
        } else if (Intrinsics.areEqual(iSuspensionInterface.suspensionTag(), this.data.get(viewLayoutPosition - 1).suspensionTag())) {
            outRect.set(0, this.mDividerHeight, 0, 0);
        } else {
            outRect.set(0, this.mTitleHeight, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull Canvas c, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        super.onDraw(c, parent, state);
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int childCount = parent.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            View childAt = parent.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int viewLayoutPosition = ((RecyclerView.LayoutParams) layoutParams).getViewLayoutPosition();
            if (this.data.get(viewLayoutPosition).getIsVisibleSuspension()) {
                if (viewLayoutPosition != 0 && Intrinsics.areEqual(this.data.get(viewLayoutPosition).suspensionTag(), this.data.get(viewLayoutPosition - 1).suspensionTag())) {
                    a(c, parent, childAt);
                } else {
                    b(c, paddingLeft, width, childAt, viewLayoutPosition);
                }
            } else if (i < childCount - 1) {
                a(c, parent, childAt);
            }
            if (i2 >= childCount) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009b  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull Canvas c, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        if (this.data.isEmpty()) {
            return;
        }
        boolean z = true;
        if (iFindFirstVisibleItemPosition > this.data.size() - 1 || iFindFirstVisibleItemPosition < 0 || !this.data.get(iFindFirstVisibleItemPosition).getIsVisibleSuspension()) {
            return;
        }
        String strSuspensionTag = this.data.get(iFindFirstVisibleItemPosition).suspensionTag();
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = parent.findViewHolderForLayoutPosition(iFindFirstVisibleItemPosition);
        Objects.requireNonNull(viewHolderFindViewHolderForLayoutPosition);
        View view = viewHolderFindViewHolderForLayoutPosition.itemView;
        int i = iFindFirstVisibleItemPosition + 1;
        if (i >= this.data.size() || Intrinsics.areEqual(strSuspensionTag, this.data.get(i).suspensionTag())) {
            z = false;
        } else {
            Log.d("TAG", Intrinsics.stringPlus("onDrawOver() called with: c = [", Integer.valueOf(view.getTop())));
            if (view.getHeight() + view.getTop() < this.mTitleHeight) {
                c.save();
                c.translate(0.0f, (view.getHeight() + view.getTop()) - this.mTitleHeight);
            } else {
                z = false;
            }
        }
        this.mPaint.setColor(this.colorTitleBg);
        c.drawRect(parent.getPaddingLeft(), parent.getPaddingTop(), parent.getRight() - parent.getPaddingRight(), parent.getPaddingTop() + this.mTitleHeight, this.mPaint);
        this.mPaint.setColor(this.colorTitleFont);
        this.mPaint.getTextBounds(strSuspensionTag, 0, strSuspensionTag.length(), this.mBounds);
        int paddingTop = parent.getPaddingTop();
        int i2 = this.mTitleHeight;
        c.drawText(strSuspensionTag, RtlUtils.INSTANCE.isRTL() ? (view.getRight() - view.getPaddingRight()) - this.mBounds.width() : view.getPaddingLeft(), (paddingTop + i2) - ((i2 / 2) - (this.mBounds.height() / 2)), this.mPaint);
        if (z) {
            c.restore();
        }
    }

    @NotNull
    public final SuspensionDecoration setColorTitleBg(@ColorInt int colorTitleBg) {
        this.colorTitleBg = colorTitleBg;
        return this;
    }

    @NotNull
    public final SuspensionDecoration setColorTitleFont(@ColorInt int colorTitleFont) {
        this.colorTitleFont = colorTitleFont;
        return this;
    }

    @NotNull
    public final SuspensionDecoration setData(@NotNull List<? extends ISuspensionInterface> data) {
        this.data = data;
        return this;
    }

    @NotNull
    public final SuspensionDecoration setTitleFontSize(float mTitleFontSize) {
        this.mPaint.setTextSize(mTitleFontSize);
        return this;
    }

    @NotNull
    public final SuspensionDecoration setmTitleHeight(int mTitleHeight) {
        this.mTitleHeight = mTitleHeight;
        return this;
    }

    public SuspensionDecoration(@NotNull Context context, @NotNull List<? extends ISuspensionInterface> list, int i, int i2) {
        this.data = list;
        this.TAG = SuspensionDecoration.class.getSimpleName();
        this.colorTitleBg = ContextCompat.getColor(context, R.color.cl_fff8f8f8);
        this.colorTitleFont = ContextCompat.getColor(context, R.color.cl_66000000);
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mBounds = new Rect();
        int[] iArr = {android.R.attr.listDivider};
        this.attrs = iArr;
        this.mTitleHeight = (int) TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics());
        int iApplyDimension = (int) TypedValue.applyDimension(2, 13.0f, context.getResources().getDisplayMetrics());
        this.mTitleFontSize = iApplyDimension;
        paint.setTextSize(iApplyDimension);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        this.mDivider = typedArrayObtainStyledAttributes.getDrawable(0);
        Paint paint2 = new Paint(1);
        this.mPaintDivider = paint2;
        this.mDividerHeight = i2;
        paint2.setColor(i);
        Paint paint3 = this.mPaintDivider;
        if (paint3 != null) {
            paint3.setStyle(Paint.Style.FILL);
        }
        this.mInflater = LayoutInflater.from(context);
        typedArrayObtainStyledAttributes.recycle();
    }
}
