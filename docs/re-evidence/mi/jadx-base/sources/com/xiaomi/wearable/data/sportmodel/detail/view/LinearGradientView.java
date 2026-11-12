package com.xiaomi.wearable.data.sportmodel.detail.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import defpackage.dki;
import defpackage.x44;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J(\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/wearable/data/sportmodel/detail/view/LinearGradientView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mRectF", "Landroid/graphics/RectF;", "mPaint", "Landroid/graphics/Paint;", "colorArray", "", "positionArray", "", "initPaint", "", "initPositionArrayLTR", "itemPosition", "", "initPositionArrayRTL", "initColorArrayRTL", "initColorArrayLTR", "onSizeChanged", "width", "height", "oldWidth", "oldHeight", "onDraw", "canvas", "Landroid/graphics/Canvas;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LinearGradientView extends View {
    private int[] colorArray;
    private Paint mPaint;
    private RectF mRectF;
    private float[] positionArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearGradientView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initPaint();
    }

    private final void initColorArrayLTR() {
        int[] iArr = this.colorArray;
        int[] iArr2 = null;
        if (iArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr = null;
        }
        iArr[14] = x44.a(dki.Z);
        int[] iArr3 = this.colorArray;
        if (iArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr3 = null;
        }
        iArr3[13] = x44.a(dki.Y);
        int[] iArr4 = this.colorArray;
        if (iArr4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr4 = null;
        }
        iArr4[12] = x44.a(dki.X);
        int[] iArr5 = this.colorArray;
        if (iArr5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr5 = null;
        }
        iArr5[11] = x44.a(dki.W);
        int[] iArr6 = this.colorArray;
        if (iArr6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr6 = null;
        }
        iArr6[10] = x44.a(dki.V);
        int[] iArr7 = this.colorArray;
        if (iArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr7 = null;
        }
        iArr7[9] = x44.a(dki.U);
        int[] iArr8 = this.colorArray;
        if (iArr8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr8 = null;
        }
        iArr8[8] = x44.a(dki.h0);
        int[] iArr9 = this.colorArray;
        if (iArr9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr9 = null;
        }
        iArr9[7] = x44.a(dki.g0);
        int[] iArr10 = this.colorArray;
        if (iArr10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr10 = null;
        }
        iArr10[6] = x44.a(dki.f0);
        int[] iArr11 = this.colorArray;
        if (iArr11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr11 = null;
        }
        iArr11[5] = x44.a(dki.e0);
        int[] iArr12 = this.colorArray;
        if (iArr12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr12 = null;
        }
        iArr12[4] = x44.a(dki.d0);
        int[] iArr13 = this.colorArray;
        if (iArr13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr13 = null;
        }
        iArr13[3] = x44.a(dki.c0);
        int[] iArr14 = this.colorArray;
        if (iArr14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr14 = null;
        }
        iArr14[2] = x44.a(dki.b0);
        int[] iArr15 = this.colorArray;
        if (iArr15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr15 = null;
        }
        iArr15[1] = x44.a(dki.a0);
        int[] iArr16 = this.colorArray;
        if (iArr16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
        } else {
            iArr2 = iArr16;
        }
        iArr2[0] = x44.a(dki.T);
    }

    private final void initColorArrayRTL() {
        int[] iArr = this.colorArray;
        int[] iArr2 = null;
        if (iArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr = null;
        }
        iArr[0] = x44.a(dki.Z);
        int[] iArr3 = this.colorArray;
        if (iArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr3 = null;
        }
        iArr3[1] = x44.a(dki.Y);
        int[] iArr4 = this.colorArray;
        if (iArr4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr4 = null;
        }
        iArr4[2] = x44.a(dki.X);
        int[] iArr5 = this.colorArray;
        if (iArr5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr5 = null;
        }
        iArr5[3] = x44.a(dki.W);
        int[] iArr6 = this.colorArray;
        if (iArr6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr6 = null;
        }
        iArr6[4] = x44.a(dki.V);
        int[] iArr7 = this.colorArray;
        if (iArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr7 = null;
        }
        iArr7[5] = x44.a(dki.U);
        int[] iArr8 = this.colorArray;
        if (iArr8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr8 = null;
        }
        iArr8[6] = x44.a(dki.h0);
        int[] iArr9 = this.colorArray;
        if (iArr9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr9 = null;
        }
        iArr9[7] = x44.a(dki.g0);
        int[] iArr10 = this.colorArray;
        if (iArr10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr10 = null;
        }
        iArr10[8] = x44.a(dki.f0);
        int[] iArr11 = this.colorArray;
        if (iArr11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr11 = null;
        }
        iArr11[9] = x44.a(dki.e0);
        int[] iArr12 = this.colorArray;
        if (iArr12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr12 = null;
        }
        iArr12[10] = x44.a(dki.d0);
        int[] iArr13 = this.colorArray;
        if (iArr13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr13 = null;
        }
        iArr13[11] = x44.a(dki.c0);
        int[] iArr14 = this.colorArray;
        if (iArr14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr14 = null;
        }
        iArr14[12] = x44.a(dki.b0);
        int[] iArr15 = this.colorArray;
        if (iArr15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr15 = null;
        }
        iArr15[13] = x44.a(dki.a0);
        int[] iArr16 = this.colorArray;
        if (iArr16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
        } else {
            iArr2 = iArr16;
        }
        iArr2[14] = x44.a(dki.T);
    }

    private final void initPaint() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.mPaint;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.FILL);
        this.colorArray = new int[15];
        initColorArrayLTR();
        this.positionArray = new float[15];
        initPositionArrayLTR(0.06666667f);
    }

    private final void initPositionArrayLTR(float itemPosition) {
        float[] fArr = this.positionArray;
        float[] fArr2 = null;
        if (fArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr = null;
        }
        fArr[0] = itemPosition;
        float[] fArr3 = this.positionArray;
        if (fArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr3 = null;
        }
        fArr3[1] = 2 * itemPosition;
        float[] fArr4 = this.positionArray;
        if (fArr4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr4 = null;
        }
        fArr4[2] = 3 * itemPosition;
        float[] fArr5 = this.positionArray;
        if (fArr5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr5 = null;
        }
        fArr5[3] = 4 * itemPosition;
        float[] fArr6 = this.positionArray;
        if (fArr6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr6 = null;
        }
        fArr6[4] = 5 * itemPosition;
        float[] fArr7 = this.positionArray;
        if (fArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr7 = null;
        }
        fArr7[5] = 6 * itemPosition;
        float[] fArr8 = this.positionArray;
        if (fArr8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr8 = null;
        }
        fArr8[6] = 7 * itemPosition;
        float[] fArr9 = this.positionArray;
        if (fArr9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr9 = null;
        }
        fArr9[7] = 8 * itemPosition;
        float[] fArr10 = this.positionArray;
        if (fArr10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr10 = null;
        }
        fArr10[8] = 9 * itemPosition;
        float[] fArr11 = this.positionArray;
        if (fArr11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr11 = null;
        }
        fArr11[9] = 10 * itemPosition;
        float[] fArr12 = this.positionArray;
        if (fArr12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr12 = null;
        }
        fArr12[10] = 11 * itemPosition;
        float[] fArr13 = this.positionArray;
        if (fArr13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr13 = null;
        }
        fArr13[11] = 12 * itemPosition;
        float[] fArr14 = this.positionArray;
        if (fArr14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr14 = null;
        }
        fArr14[12] = 13 * itemPosition;
        float[] fArr15 = this.positionArray;
        if (fArr15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr15 = null;
        }
        fArr15[13] = 14 * itemPosition;
        float[] fArr16 = this.positionArray;
        if (fArr16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
        } else {
            fArr2 = fArr16;
        }
        fArr2[14] = itemPosition * 15;
    }

    private final void initPositionArrayRTL(float itemPosition) {
        float[] fArr;
        float[] fArr2 = this.positionArray;
        if (fArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr2 = null;
        }
        fArr2[14] = itemPosition;
        float[] fArr3 = this.positionArray;
        if (fArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr3 = null;
        }
        fArr3[13] = 2 * itemPosition;
        float[] fArr4 = this.positionArray;
        if (fArr4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr4 = null;
        }
        fArr4[12] = 3 * itemPosition;
        float[] fArr5 = this.positionArray;
        if (fArr5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr5 = null;
        }
        fArr5[11] = 4 * itemPosition;
        float[] fArr6 = this.positionArray;
        if (fArr6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr6 = null;
        }
        fArr6[10] = 5 * itemPosition;
        float[] fArr7 = this.positionArray;
        if (fArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr7 = null;
        }
        fArr7[9] = 6 * itemPosition;
        float[] fArr8 = this.positionArray;
        if (fArr8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr8 = null;
        }
        fArr8[8] = 7 * itemPosition;
        float[] fArr9 = this.positionArray;
        if (fArr9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr9 = null;
        }
        fArr9[7] = 8 * itemPosition;
        float[] fArr10 = this.positionArray;
        if (fArr10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr10 = null;
        }
        fArr10[6] = 9 * itemPosition;
        float[] fArr11 = this.positionArray;
        if (fArr11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr11 = null;
        }
        fArr11[5] = 10 * itemPosition;
        float[] fArr12 = this.positionArray;
        if (fArr12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr12 = null;
        }
        fArr12[4] = 11 * itemPosition;
        float[] fArr13 = this.positionArray;
        if (fArr13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr13 = null;
        }
        fArr13[3] = 12 * itemPosition;
        float[] fArr14 = this.positionArray;
        if (fArr14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr14 = null;
        }
        fArr14[2] = 13 * itemPosition;
        float[] fArr15 = this.positionArray;
        if (fArr15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr15 = null;
        }
        fArr15[1] = 14 * itemPosition;
        float[] fArr16 = this.positionArray;
        if (fArr16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr = null;
        } else {
            fArr = fArr16;
        }
        fArr[0] = 15 * itemPosition;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.mRectF;
        Paint paint = null;
        if (rectF == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRectF");
            rectF = null;
        }
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        float fDip2pxF = displayUtil.dip2pxF(3.0f);
        float fDip2pxF2 = displayUtil.dip2pxF(3.0f);
        Paint paint2 = this.mPaint;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
        } else {
            paint = paint2;
        }
        canvas.drawRoundRect(rectF, fDip2pxF, fDip2pxF2, paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        float f;
        float f2;
        int[] iArr;
        float[] fArr;
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        this.mRectF = new RectF(0.0f, 0.0f, width, height);
        if (getLayoutDirection() == 1) {
            RectF rectF = this.mRectF;
            if (rectF == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRectF");
                rectF = null;
            }
            f = rectF.right;
        } else {
            RectF rectF2 = this.mRectF;
            if (rectF2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRectF");
                rectF2 = null;
            }
            f = rectF2.left;
        }
        float f3 = f;
        if (getLayoutDirection() == 1) {
            RectF rectF3 = this.mRectF;
            if (rectF3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRectF");
                rectF3 = null;
            }
            f2 = rectF3.left;
        } else {
            RectF rectF4 = this.mRectF;
            if (rectF4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRectF");
                rectF4 = null;
            }
            f2 = rectF4.right;
        }
        float f4 = f2;
        Paint paint = this.mPaint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
            paint = null;
        }
        int[] iArr2 = this.colorArray;
        if (iArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorArray");
            iArr = null;
        } else {
            iArr = iArr2;
        }
        float[] fArr2 = this.positionArray;
        if (fArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("positionArray");
            fArr = null;
        } else {
            fArr = fArr2;
        }
        paint.setShader(new LinearGradient(f3, 0.0f, f4, 0.0f, iArr, fArr, Shader.TileMode.MIRROR));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearGradientView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearGradientView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
