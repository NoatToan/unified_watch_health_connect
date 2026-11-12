package com.huami.sleepassistant.lib.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0014R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0017¨\u0006'"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/CustomTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "a", "", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint1", "b", "paint2", "c", LogUtil.I, "mWidth", "Landroid/graphics/LinearGradient;", GoogleApiAvailabilityLight.a, "Landroid/graphics/LinearGradient;", "gradient", "Landroid/graphics/Matrix;", "e", "Landroid/graphics/Matrix;", "matrix2", "f", "deltaX", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CustomTextView extends AppCompatTextView {
    private static final String g = CustomTextView.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Paint paint1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Paint paint2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private LinearGradient gradient;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Matrix matrix2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int deltaX;

    public CustomTextView(@NotNull Context context) {
        super(context, null);
    }

    private final void a(Context context, AttributeSet attrs) {
        Paint paint = new Paint();
        this.paint1 = paint;
        paint.setColor(ContextCompat.getColor(context, R.color.holo_blue_dark));
        this.paint1.setStyle(Paint.Style.FILL);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        if (getMatrix() != null) {
            int i = this.deltaX;
            int i2 = this.mWidth;
            int i3 = i + (i2 / 5);
            this.deltaX = i3;
            if (i3 > i2 * 2) {
                this.deltaX = -i2;
            }
        }
        Matrix matrix = this.matrix2;
        if (matrix != null) {
            matrix.setTranslate(this.deltaX, 0.0f);
        }
        LinearGradient linearGradient = this.gradient;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(this.matrix2);
        }
        postInvalidateDelayed(100L);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (this.mWidth == 0) {
            Log.e(g, "*********************");
            this.mWidth = getMeasuredWidth();
            this.paint2 = getPaint();
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.mWidth, 0.0f, new int[]{-7829368, -1, -7829368}, new float[]{0.3f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
            this.gradient = linearGradient;
            Paint paint = this.paint2;
            if (paint != null) {
                paint.setShader(linearGradient);
            }
            this.matrix2 = new Matrix();
        }
    }

    public CustomTextView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }
}
