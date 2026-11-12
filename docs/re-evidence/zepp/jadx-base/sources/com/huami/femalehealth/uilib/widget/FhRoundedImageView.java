package com.huami.femalehealth.uilib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.uilib.R;
import com.huami.tools.analytics.DbUtils;
import com.squareup.picasso.u;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\"\u0010&J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006'"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/FhRoundedImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", u.q, "", "left", "top", "right", "bottom", "", "onLayout", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "a", "F", "upRadius", "b", "bottomRadius", "", "c", "[F", "radiusArray", "Landroid/graphics/Path;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Path;", "path", "Landroid/graphics/RectF;", "e", "Landroid/graphics/RectF;", "rectF", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attributeSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FhRoundedImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float upRadius;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float bottomRadius;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float[] radiusArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Path path;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final RectF rectF;

    public FhRoundedImageView(@NotNull Context context) {
        this(context, null);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        this.path.reset();
        Path path = this.path;
        RectF rectF = this.rectF;
        float[] fArr = this.radiusArray;
        Objects.requireNonNull(fArr);
        path.addRoundRect(rectF, fArr, Path.Direction.CCW);
        if (canvas == null) {
            return;
        }
        canvas.clipPath(this.path);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.rectF.set(left, top, right, bottom);
    }

    public FhRoundedImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.path = new Path();
        this.rectF = new RectF();
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FhRoundedImageView);
        this.upRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FhRoundedImageView_fh_riv_up_radius, 0);
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FhRoundedImageView_fh_riv_bottom_radius, 0);
        this.bottomRadius = dimensionPixelSize;
        float f = this.upRadius;
        this.radiusArray = new float[]{f, f, f, f, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize};
        typedArrayObtainStyledAttributes.recycle();
    }
}
