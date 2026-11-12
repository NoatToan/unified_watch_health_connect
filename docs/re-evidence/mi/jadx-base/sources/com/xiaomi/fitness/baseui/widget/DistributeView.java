package com.xiaomi.fitness.baseui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.gki;
import defpackage.x44;
import defpackage.xz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003B#\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)B\u0013\b\u0016\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b(\u0010+B\u001d\b\u0016\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b(\u0010,J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\nR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0010R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/baseui/widget/DistributeView;", "Lxz;", "T", "Landroid/view/View;", "", "initColorBlockPaint", "()V", "Landroid/graphics/Canvas;", "canvas", "onDrawEmpty", "(Landroid/graphics/Canvas;)V", "onDrawLTR", "onDrawRTL", "", "modelList", "setDataList", "(Ljava/util/List;)V", "onDraw", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "mDataList", "Ljava/util/List;", "getMDataList", "()Ljava/util/List;", "setMDataList", "Landroid/graphics/Paint;", "mColorPaint", "Landroid/graphics/Paint;", "", "showEmptyDistribute", "Z", "getShowEmptyDistribute", "()Z", "setShowEmptyDistribute", "(Z)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "context", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class DistributeView<T extends xz> extends View {

    @Nullable
    private Paint mColorPaint;

    @Nullable
    private Context mContext;

    @Nullable
    private List<? extends T> mDataList;
    private boolean showEmptyDistribute;

    public DistributeView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        initColorBlockPaint();
    }

    private final void initColorBlockPaint() {
        Paint paint = new Paint();
        this.mColorPaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.reset();
        Paint paint2 = this.mColorPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setAntiAlias(true);
        Paint paint3 = this.mColorPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setStyle(Paint.Style.FILL);
        Paint paint4 = this.mColorPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setColor(-16777216);
    }

    private final void onDrawEmpty(Canvas canvas) {
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), DisplayUtil.dip2px(20.0f) + 0.0f);
        Paint paint = this.mColorPaint;
        Intrinsics.checkNotNull(paint);
        paint.setColor(x44.a(gki.f));
        Paint paint2 = this.mColorPaint;
        Intrinsics.checkNotNull(paint2);
        canvas.drawRect(rectF, paint2);
    }

    private final void onDrawLTR(Canvas canvas) {
        int iDip2px;
        float width = getWidth();
        List<? extends T> list = this.mDataList;
        Intrinsics.checkNotNull(list);
        int size = list.size();
        float fDip2px = DisplayUtil.dip2px(20.0f) + 0.0f;
        int i = 0;
        Logger.i("DistributeView success thisLTR", new Object[0]);
        float f = 0.0f;
        while (i < size) {
            List<? extends T> list2 = this.mDataList;
            Intrinsics.checkNotNull(list2);
            T t = list2.get(i);
            Intrinsics.checkNotNull(t);
            float fB = (((t.b() * 1.0f) / 100.0f) * width) + f;
            if (fB > width) {
                fB = width;
            }
            if (t.f39602b == 2) {
                fB = (getWidth() - getPaddingRight()) - getPaddingLeft();
            }
            RectF rectF = new RectF();
            if (t.b() > 0) {
                int i2 = t.f39602b;
                if (i2 == 0) {
                    fB -= DisplayUtil.dip2px(1.0f);
                    iDip2px = DisplayUtil.dip2px(1.0f);
                } else if (i2 == 1) {
                    fB -= DisplayUtil.dip2px(1.0f);
                } else if (i2 == 2) {
                    iDip2px = DisplayUtil.dip2px(1.0f);
                }
                f += iDip2px;
            }
            rectF.set(f, 0.0f, fB, fDip2px);
            Paint paint = this.mColorPaint;
            Intrinsics.checkNotNull(paint);
            paint.setColor(t.a());
            Paint paint2 = this.mColorPaint;
            Intrinsics.checkNotNull(paint2);
            canvas.drawRect(rectF, paint2);
            i++;
            f = fB;
        }
    }

    private final void onDrawRTL(Canvas canvas) {
        int iDip2px;
        float width = getWidth();
        List<? extends T> list = this.mDataList;
        Intrinsics.checkNotNull(list);
        int size = list.size();
        float fDip2px = DisplayUtil.dip2px(20.0f) + 0.0f;
        Logger.i("DistributeView success thisRTL", new Object[0]);
        float fDip2px2 = width;
        for (int i = 0; i < size; i++) {
            List<? extends T> list2 = this.mDataList;
            Intrinsics.checkNotNull(list2);
            T t = list2.get(i);
            Intrinsics.checkNotNull(t);
            float fB = fDip2px2 - (((t.b() * 1.0f) / 100.0f) * width);
            if (fB < 0.0f) {
                fB = 0.0f;
            }
            RectF rectF = new RectF();
            if (t.b() > 0) {
                int i2 = t.f39602b;
                if (i2 == 0) {
                    fDip2px2 -= DisplayUtil.dip2px(1.0f);
                    iDip2px = DisplayUtil.dip2px(1.0f);
                } else if (i2 == 1) {
                    iDip2px = DisplayUtil.dip2px(1.0f);
                } else if (i2 == 2) {
                    fDip2px2 -= DisplayUtil.dip2px(1.0f);
                    fB -= DisplayUtil.dip2px(1.0f);
                }
                fB += iDip2px;
            }
            float f = fB;
            float f2 = fDip2px2;
            fDip2px2 = f;
            rectF.set(fDip2px2, 0.0f, f2, fDip2px);
            Paint paint = this.mColorPaint;
            Intrinsics.checkNotNull(paint);
            paint.setColor(t.a());
            Paint paint2 = this.mColorPaint;
            Intrinsics.checkNotNull(paint2);
            canvas.drawRect(rectF, paint2);
        }
    }

    @Nullable
    public final List<T> getMDataList() {
        return this.mDataList;
    }

    public final boolean getShowEmptyDistribute() {
        return this.showEmptyDistribute;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Logger.i("DistributeView success this_onDraw", new Object[0]);
        List<? extends T> list = this.mDataList;
        if (list == null) {
            return;
        }
        Intrinsics.checkNotNull(list);
        if (list.isEmpty() || this.showEmptyDistribute) {
            onDrawEmpty(canvas);
        }
        if (AppUtil.isRTLDirection()) {
            onDrawRTL(canvas);
        } else {
            onDrawLTR(canvas);
        }
    }

    public final void setDataList(@Nullable List<? extends T> modelList) {
        Logger.i("DistributeView success setDataList", new Object[0]);
        this.mDataList = modelList;
        invalidate();
    }

    public final void setMDataList(@Nullable List<? extends T> list) {
        this.mDataList = list;
    }

    public final void setShowEmptyDistribute(boolean z) {
        this.showEmptyDistribute = z;
    }

    public DistributeView(@Nullable Context context) {
        this(context, null);
        this.mContext = context;
        initColorBlockPaint();
    }

    public DistributeView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.mContext = context;
    }
}
