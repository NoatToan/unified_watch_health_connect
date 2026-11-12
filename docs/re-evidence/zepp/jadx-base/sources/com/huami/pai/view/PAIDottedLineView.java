package com.huami.pai.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.lib.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/huami/pai/view/PAIDottedLineView;", "Landroid/view/View;", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "oldw", "oldh", "", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "a", "F", "mHeight", "b", "mWidth", "Landroid/graphics/Path;", "c", "Landroid/graphics/Path;", "mPath", "Landroid/graphics/DashPathEffect;", GoogleApiAvailabilityLight.a, "Landroid/graphics/DashPathEffect;", "effects", "Landroid/graphics/Paint;", "e", "Landroid/graphics/Paint;", "mDottedLinePaint", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PAIDottedLineView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float mHeight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float mWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private Path mPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private DashPathEffect effects;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private Paint mDottedLinePaint;

    @JvmOverloads
    public PAIDottedLineView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PAIDottedLineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PAIDottedLineView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        this.mPath.reset();
        this.mPath.lineTo(this.mWidth, this.mHeight);
        canvas.drawPath(this.mPath, this.mDottedLinePaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        this.mWidth = getMeasuredWidth();
        this.mHeight = getMeasuredHeight();
    }

    @JvmOverloads
    public PAIDottedLineView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.mDottedLinePaint = paint;
        paint.setAntiAlias(true);
        this.mDottedLinePaint.setStyle(Paint.Style.STROKE);
        this.mDottedLinePaint.setColor(ContextCompat.getColor(context, R.color.s4));
        this.mDottedLinePaint.setStrokeWidth(4.0f);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{8.0f, 11.0f, 8.0f, 11.0f}, 0.0f);
        this.effects = dashPathEffect;
        this.mDottedLinePaint.setPathEffect(dashPathEffect);
        this.mPath = new Path();
    }
}
