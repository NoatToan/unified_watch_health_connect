package com.xiaomi.fitness.baseui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.ez5;
import defpackage.gki;
import defpackage.k47;
import defpackage.loi;
import defpackage.z4j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000fJ\u0016\u0010\u001f\u001a\u00020\u001c2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010!J(\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014J\b\u0010'\u001a\u00020\u001cH\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0014J\u0012\u0010+\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0012\u0010,\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/baseui/widget/LevelPercentBarView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDividerWidth", "mArrowWidth", "mArrowHeight", "mSelectPosition", "mSelectPositionPercent", "", "mLevelItemRect", "Landroid/graphics/Rect;", "mArrowBounds", "itemWidthList", "", "mLevels", "Lcom/xiaomi/fitness/baseui/widget/PercentLevel;", "mLevelPaint", "Landroid/graphics/Paint;", "mTextPaint", "mItemHeight", "setLevelWithChildPercent", "", "pos", "percent", "setLevels", "levels", "", "onSizeChanged", Constants.DEVICE_TYPE_WEAR, "h", "oldw", "oldh", "updateItemWidthList", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawDownArrow", "drawLevelBar", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLevelPercentBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelPercentBarView.kt\ncom/xiaomi/fitness/baseui/widget/LevelPercentBarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1#2:245\n1863#3,2:246\n*S KotlinDebug\n*F\n+ 1 LevelPercentBarView.kt\ncom/xiaomi/fitness/baseui/widget/LevelPercentBarView\n*L\n122#1:246,2\n*E\n"})
public final class LevelPercentBarView extends View {

    @NotNull
    private final List<Integer> itemWidthList;

    @NotNull
    private final Rect mArrowBounds;
    private int mArrowHeight;
    private int mArrowWidth;
    private final int mDividerWidth;
    private int mItemHeight;

    @NotNull
    private final Rect mLevelItemRect;

    @NotNull
    private Paint mLevelPaint;

    @NotNull
    private final List<PercentLevel> mLevels;
    private int mSelectPosition;
    private float mSelectPositionPercent;

    @NotNull
    private final Paint mTextPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LevelPercentBarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawDownArrow(Canvas canvas) {
        Drawable drawable;
        if (this.mLevels.isEmpty()) {
            return;
        }
        float percent = 0.0f;
        if (this.mSelectPositionPercent >= 0.0f && (drawable = getResources().getDrawable(loi.f25270a)) != null) {
            int width = getWidth() - (this.mDividerWidth * (this.mLevels.size() - 1));
            Iterator it = CollectionsKt___CollectionsKt.toList(this.mLevels).iterator();
            int i = 0;
            while (it.hasNext()) {
                percent += ((PercentLevel) it.next()).getPercent();
                if (this.mSelectPositionPercent > percent) {
                    i++;
                }
            }
            Logger.d("LevelPercentBarView", "mSelectPositionPercent " + this.mSelectPositionPercent + ";dividerNum:" + i);
            int paddingStart = ((int) ((((float) getPaddingStart()) + (((float) width) * this.mSelectPositionPercent)) - ((float) (this.mArrowWidth / 2)))) + (this.mDividerWidth * i);
            this.mArrowBounds.left = Math.min((getWidth() + (-10)) - this.mArrowWidth, Math.max(getPaddingLeft() + 10, paddingStart));
            Rect rect = this.mArrowBounds;
            rect.right = rect.left + this.mArrowWidth;
            rect.bottom = getPaddingTop() + this.mArrowHeight;
            this.mArrowBounds.top = getPaddingTop();
            drawable.setBounds(this.mArrowBounds);
            Intrinsics.checkNotNull(canvas);
            drawable.draw(canvas);
        }
    }

    private final void drawLevelBar(Canvas canvas) {
        int size = this.mLevels.size();
        int i = 0;
        while (i < size) {
            PercentLevel percentLevel = this.mLevels.get(i);
            int i2 = i - 1;
            int iIntValue = (i2 < 0 || i2 >= this.mLevels.size()) ? 0 : this.itemWidthList.get(i2).intValue();
            int iIntValue2 = this.itemWidthList.get(i).intValue();
            this.mLevelItemRect.left += i == 0 ? getPaddingStart() : iIntValue + this.mDividerWidth;
            this.mLevelItemRect.top = (getPaddingTop() + this.mArrowWidth) - ExtUtilsKt.getDp(4);
            Rect rect = this.mLevelItemRect;
            rect.right = rect.left + iIntValue2;
            rect.bottom = rect.top + this.mItemHeight;
            int color = getContext().getResources().getColor(percentLevel.getColor());
            float f = this.mItemHeight;
            if (i == 0) {
                Drawable drawable = getResources().getDrawable(loi.f25273r);
                if (drawable instanceof GradientDrawable) {
                    ((GradientDrawable) drawable).setCornerRadii(new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f});
                }
                k47.n(drawable, color);
                drawable.setBounds(this.mLevelItemRect);
                Intrinsics.checkNotNull(canvas);
                drawable.draw(canvas);
            } else if (i == this.mLevels.size() - 1) {
                Drawable drawable2 = getResources().getDrawable(loi.q);
                if (drawable2 instanceof GradientDrawable) {
                    ((GradientDrawable) drawable2).setCornerRadii(new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f});
                }
                k47.n(drawable2, color);
                drawable2.setBounds(this.mLevelItemRect);
                Intrinsics.checkNotNull(canvas);
                drawable2.draw(canvas);
            } else {
                this.mLevelPaint.setColor(color);
                Intrinsics.checkNotNull(canvas);
                canvas.drawRect(this.mLevelItemRect, this.mLevelPaint);
            }
            if (!TextUtils.isEmpty(percentLevel.getItemEndIndexStr())) {
                String itemEndIndexStr = percentLevel.getItemEndIndexStr();
                Intrinsics.checkNotNull(itemEndIndexStr);
                Rect rect2 = this.mLevelItemRect;
                canvas.drawText(itemEndIndexStr, rect2.right, rect2.bottom + ExtUtilsKt.getDp(Double.valueOf(21.6d)), this.mTextPaint);
            }
            i++;
        }
    }

    private final void updateItemWidthList() {
        if (this.mLevels.isEmpty()) {
            return;
        }
        this.itemWidthList.clear();
        int width = getWidth() - (this.mDividerWidth * (this.mLevels.size() - 1));
        Iterator<PercentLevel> it = this.mLevels.iterator();
        while (it.hasNext()) {
            this.itemWidthList.add(Integer.valueOf((int) (width * it.next().getPercent())));
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.mLevelItemRect.left = 0;
        this.mArrowBounds.left = 0;
        if (this.mLevels.isEmpty()) {
            return;
        }
        drawLevelBar(canvas);
        drawDownArrow(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateItemWidthList();
    }

    public final void setLevelWithChildPercent(int pos, float percent) {
        if (pos < 0) {
            pos = 0;
        }
        if (pos >= this.mLevels.size()) {
            pos = this.mLevels.size() - 1;
        }
        this.mSelectPosition = pos;
        this.mSelectPositionPercent = percent;
        invalidate();
    }

    public final void setLevels(@Nullable List<? extends PercentLevel> levels) {
        if (levels == null) {
            throw new IllegalArgumentException("error params".toString());
        }
        this.mLevels.clear();
        if (AppUtil.isRTLDirection()) {
            int size = levels.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    this.mLevels.add(levels.get(size));
                    if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
        } else {
            this.mLevels.addAll(levels);
        }
        if (!this.mLevels.isEmpty()) {
            updateItemWidthList();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LevelPercentBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LevelPercentBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LevelPercentBarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDividerWidth = 4;
        this.mSelectPositionPercent = 0.5f;
        this.mLevelItemRect = new Rect(0, 0, 0, 0);
        this.mArrowBounds = new Rect(0, 0, 0, 0);
        this.itemWidthList = new ArrayList();
        this.mLevels = new ArrayList();
        this.mLevelPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.mTextPaint = paint;
        this.mItemHeight = ez5.a(20);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4j.A1);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.mItemHeight = (int) typedArrayObtainStyledAttributes.getDimension(z4j.B1, ExtUtilsKt.getDp(20));
            typedArrayObtainStyledAttributes.recycle();
        }
        paint.setTextSize(ExtUtilsKt.getSp(12));
        paint.setColor(getContext().getResources().getColor(gki.q));
        paint.setTextAlign(Paint.Align.CENTER);
        this.mArrowWidth = ExtUtilsKt.getDp(12);
        this.mArrowHeight = ExtUtilsKt.getDp(12);
    }
}
