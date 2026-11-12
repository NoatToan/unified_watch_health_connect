package com.xiaomi.fitness.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.DrawableKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.b5j;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J \u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0018\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u000fH\u0002R\u000e\u0010\u000b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/widget/view/RoundImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DEFAULT_RADIUS", "paint", "Landroid/graphics/Paint;", "cornerRadius", "", "innerStrokeWidth", "getInnerStrokeWidth", "()F", "setInnerStrokeWidth", "(F)V", "mInnerStrokeColor", "getMInnerStrokeColor", "()I", "setMInnerStrokeColor", "(I)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawBorderStroke", "width", "height", "scaleBitmap", "Landroid/graphics/Bitmap;", "bitmap", "toRoundCorner", "radius", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoundImageView extends AppCompatImageView {
    private final int DEFAULT_RADIUS;
    private float cornerRadius;
    private float innerStrokeWidth;
    private int mInnerStrokeColor;

    @NotNull
    private final Paint paint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawBorderStroke(Canvas canvas, int width, int height) {
        if (this.innerStrokeWidth <= 0.0f) {
            return;
        }
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(this.mInnerStrokeColor);
        paint.setStrokeWidth(this.innerStrokeWidth);
        float f = width / 2.0f;
        canvas.drawCircle(f, height / 2.0f, f - (this.innerStrokeWidth / 2), paint);
    }

    private final Bitmap scaleBitmap(Bitmap bitmap) {
        int width = getWidth();
        int height = getHeight();
        float width2 = width / bitmap.getWidth();
        float height2 = height / bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(width2, height2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    private final Bitmap toRoundCorner(Bitmap bitmap, float radius) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        this.paint.setColor(-12434878);
        bitmap.getWidth();
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), radius, radius, this.paint);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, this.paint);
        return bitmapCreateBitmap;
    }

    public final float getInnerStrokeWidth() {
        return this.innerStrokeWidth;
    }

    public final int getMInnerStrokeColor() {
        return this.mInnerStrokeColor;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap roundCorner = toRoundCorner(scaleBitmap(DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null)), this.cornerRadius);
        Rect rect = new Rect(0, 0, roundCorner.getWidth(), roundCorner.getHeight());
        this.paint.reset();
        canvas.drawBitmap(roundCorner, rect, rect, this.paint);
        if (this.innerStrokeWidth > 0.0f) {
            drawBorderStroke(canvas, roundCorner.getWidth(), roundCorner.getHeight());
        }
    }

    public final void setInnerStrokeWidth(float f) {
        this.innerStrokeWidth = f;
    }

    public final void setMInnerStrokeColor(int i) {
        this.mInnerStrokeColor = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundImageView(@Nullable Context context) {
        super(context);
        Intrinsics.checkNotNull(context);
        this.DEFAULT_RADIUS = 30;
        this.paint = new Paint();
        this.mInnerStrokeColor = Color.parseColor("#0D000000");
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.DEFAULT_RADIUS = 30;
        this.paint = new Paint();
        this.mInnerStrokeColor = Color.parseColor("#0D000000");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.m4, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.cornerRadius = typedArrayObtainStyledAttributes.getDimension(b5j.n4, ExtUtilsKt.getDp(30));
        this.innerStrokeWidth = typedArrayObtainStyledAttributes.getDimension(b5j.p4, 0.0f);
        this.mInnerStrokeColor = typedArrayObtainStyledAttributes.getColor(b5j.o4, Color.parseColor("#0D000000"));
        typedArrayObtainStyledAttributes.recycle();
    }
}
