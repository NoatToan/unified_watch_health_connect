package com.xiaomi.hm.health.bodyfat.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bodyfat.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/view/SquareView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "b", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "path", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attributes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class SquareView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Paint paint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Path path;

    public SquareView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.paint = paint;
        this.path = new Path();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SquareView);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.SquareView_SquareView_fillColor, SupportMenu.CATEGORY_MASK));
        typedArrayObtainStyledAttributes.recycle();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    public final Path getPath() {
        return this.path;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        this.path.moveTo(getWidth() / 2.0f, getHeight() * 0.2f);
        this.path.lineTo(0.0f, getHeight());
        this.path.lineTo(getWidth(), getHeight());
        this.path.close();
        if (canvas == null) {
            return;
        }
        canvas.drawPath(this.path, this.paint);
    }
}
