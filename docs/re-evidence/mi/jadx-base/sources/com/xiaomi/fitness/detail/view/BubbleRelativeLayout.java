package com.xiaomi.fitness.detail.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.dki;
import defpackage.ez5;
import defpackage.hoi;
import defpackage.w4j;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0002'(B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0013J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0002J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&H\u0015R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/detail/view/BubbleRelativeLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mPath", "Landroid/graphics/Path;", "mBubbleLegPrototype", "mBubbleLegStroke", "mPaint", "Landroid/graphics/Paint;", "mBubbleLegOffset", "", "mBubbleOrientation", "Lcom/xiaomi/fitness/detail/view/BubbleRelativeLayout$BubbleLegOrientation;", "init", "", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "renderBubbleLegPrototype", "renderBubbleLegStroke", "setBubbleParams", "bubbleOrientation", "bubbleOffset", "renderBubbleLegMatrix", "Landroid/graphics/Matrix;", "width", "height", "onDraw", "canvas", "Landroid/graphics/Canvas;", "BubbleLegOrientation", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BubbleRelativeLayout extends RelativeLayout {
    private float mBubbleLegOffset;

    @NotNull
    private final Path mBubbleLegPrototype;

    @NotNull
    private final Path mBubbleLegStroke;

    @NotNull
    private BubbleLegOrientation mBubbleOrientation;

    @NotNull
    private final Paint mPaint;

    @NotNull
    private final Path mPath;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int PADDING = ez5.a(10);
    private static int LEG_HALF_BASE = 30;
    private static float STROKE_WIDTH = ez5.a(1);
    private static float CORNER_RADIUS = 15.0f;
    private static int SHADOW_COLOR = ExtUtilsKt.getColor(dki.H0);
    private static float MIN_LEG_DISTANCE = PADDING + LEG_HALF_BASE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/detail/view/BubbleRelativeLayout$BubbleLegOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "LEFT", "RIGHT", "BOTTOM", "NONE", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum BubbleLegOrientation {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM,
        NONE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<BubbleLegOrientation> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/detail/view/BubbleRelativeLayout$Companion;", "", "<init>", "()V", "PADDING", "", "getPADDING", "()I", "setPADDING", "(I)V", "LEG_HALF_BASE", "getLEG_HALF_BASE", "setLEG_HALF_BASE", "STROKE_WIDTH", "", "getSTROKE_WIDTH", "()F", "setSTROKE_WIDTH", "(F)V", "CORNER_RADIUS", "getCORNER_RADIUS", "setCORNER_RADIUS", "SHADOW_COLOR", "getSHADOW_COLOR", "setSHADOW_COLOR", "MIN_LEG_DISTANCE", "getMIN_LEG_DISTANCE", "setMIN_LEG_DISTANCE", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCORNER_RADIUS() {
            return BubbleRelativeLayout.CORNER_RADIUS;
        }

        public final int getLEG_HALF_BASE() {
            return BubbleRelativeLayout.LEG_HALF_BASE;
        }

        public final float getMIN_LEG_DISTANCE() {
            return BubbleRelativeLayout.MIN_LEG_DISTANCE;
        }

        public final int getPADDING() {
            return BubbleRelativeLayout.PADDING;
        }

        public final int getSHADOW_COLOR() {
            return BubbleRelativeLayout.SHADOW_COLOR;
        }

        public final float getSTROKE_WIDTH() {
            return BubbleRelativeLayout.STROKE_WIDTH;
        }

        public final void setCORNER_RADIUS(float f) {
            BubbleRelativeLayout.CORNER_RADIUS = f;
        }

        public final void setLEG_HALF_BASE(int i) {
            BubbleRelativeLayout.LEG_HALF_BASE = i;
        }

        public final void setMIN_LEG_DISTANCE(float f) {
            BubbleRelativeLayout.MIN_LEG_DISTANCE = f;
        }

        public final void setPADDING(int i) {
            BubbleRelativeLayout.PADDING = i;
        }

        public final void setSHADOW_COLOR(int i) {
            BubbleRelativeLayout.SHADOW_COLOR = i;
        }

        public final void setSTROKE_WIDTH(float f) {
            BubbleRelativeLayout.STROKE_WIDTH = f;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BubbleLegOrientation.values().length];
            try {
                iArr[BubbleLegOrientation.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BubbleLegOrientation.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BubbleLegOrientation.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleRelativeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mPath = new Path();
        this.mBubbleLegPrototype = new Path();
        this.mBubbleLegStroke = new Path();
        this.mPaint = new Paint(4);
        this.mBubbleLegOffset = 0.75f;
        this.mBubbleOrientation = BubbleLegOrientation.LEFT;
        init(context, attributeSet);
    }

    private final void init(Context context, AttributeSet attrs) {
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, w4j.p5);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                PADDING = typedArrayObtainStyledAttributes.getDimensionPixelSize(w4j.s5, PADDING);
                SHADOW_COLOR = typedArrayObtainStyledAttributes.getInt(w4j.t5, SHADOW_COLOR);
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(w4j.r5, LEG_HALF_BASE);
                LEG_HALF_BASE = dimensionPixelSize;
                MIN_LEG_DISTANCE = PADDING + dimensionPixelSize;
                STROKE_WIDTH = typedArrayObtainStyledAttributes.getFloat(w4j.u5, STROKE_WIDTH);
                CORNER_RADIUS = typedArrayObtainStyledAttributes.getFloat(w4j.q5, CORNER_RADIUS);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.mPaint.setColor(ExtUtilsKt.getColor(dki.n2));
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setStrokeWidth(STROKE_WIDTH);
        this.mPaint.setStrokeJoin(Paint.Join.MITER);
        this.mPaint.setPathEffect(new CornerPathEffect(CORNER_RADIUS));
        this.mPaint.setAntiAlias(true);
        setLayerType(1, this.mPaint);
        renderBubbleLegPrototype();
        renderBubbleLegStroke();
        int i = PADDING;
        setPadding(i, i, i, i);
    }

    private final Matrix renderBubbleLegMatrix(int width, int height) {
        float fMax = Math.max(this.mBubbleLegOffset, MIN_LEG_DISTANCE);
        float fMin = height;
        float fMin2 = Math.min(fMax, fMin - MIN_LEG_DISTANCE);
        Matrix matrix = new Matrix();
        int i = WhenMappings.$EnumSwitchMapping$0[this.mBubbleOrientation.ordinal()];
        float f = 0.0f;
        if (i == 1) {
            matrix.postRotate(90.0f);
            fMin = 0.0f;
            f = width / 2;
        } else if (i == 2) {
            f = width;
            fMin = Math.min(fMax, fMin - MIN_LEG_DISTANCE);
            matrix.postRotate(180.0f);
        } else if (i != 3) {
            fMin = fMin2;
        } else {
            f = width / 2;
            matrix.postRotate(270.0f);
        }
        matrix.postTranslate(f, fMin);
        return matrix;
    }

    private final void renderBubbleLegPrototype() {
        this.mBubbleLegPrototype.moveTo(0.0f, 0.0f);
        Path path = this.mBubbleLegPrototype;
        int i = PADDING;
        path.lineTo(i * 1.5f, (-i) * 1.5f);
        Path path2 = this.mBubbleLegPrototype;
        int i2 = PADDING;
        path2.lineTo(i2 * 1.5f, i2 * 1.5f);
        this.mBubbleLegPrototype.close();
    }

    private final void renderBubbleLegStroke() {
        this.mBubbleLegStroke.moveTo(0.0f, 0.0f);
        Path path = this.mBubbleLegStroke;
        int i = PADDING;
        path.lineTo(i * 1.5f, (-i) * 1.5f);
        Path path2 = this.mBubbleLegStroke;
        int i2 = PADDING;
        path2.lineTo(i2 * 1.5f, i2 * 1.5f);
        this.mBubbleLegStroke.lineTo(0.0f, 0.0f);
        this.mBubbleLegStroke.close();
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int width = getWidth();
        int height = getHeight();
        this.mPath.rewind();
        Path path = new Path();
        path.addPath(this.mBubbleLegStroke, renderBubbleLegMatrix(width, height));
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setColor(ExtUtilsKt.getColor(dki.H0));
        canvas.drawPath(path, this.mPaint);
        this.mPaint.setColor(ExtUtilsKt.getColor(dki.n2));
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setStrokeWidth(STROKE_WIDTH);
        Drawable drawable = ViewExtKt.getDrawable(this, hoi.m0);
        Intrinsics.checkNotNull(drawable);
        int i = PADDING;
        drawable.setBounds(i, i, width - (i * 2), height - i);
        drawable.draw(canvas);
        this.mPath.addPath(this.mBubbleLegPrototype, renderBubbleLegMatrix(width, height));
        canvas.drawPath(this.mPath, this.mPaint);
        float f = width;
        float f2 = STROKE_WIDTH;
        float f3 = height;
        canvas.scale((f - f2) / f, (f3 - f2) / f3, f / 2.0f, f3 / 2.0f);
    }

    public final void setBubbleParams(@NotNull BubbleLegOrientation bubbleOrientation, float bubbleOffset) {
        Intrinsics.checkNotNullParameter(bubbleOrientation, "bubbleOrientation");
        this.mBubbleLegOffset = bubbleOffset;
        this.mBubbleOrientation = bubbleOrientation;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BubbleRelativeLayout(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BubbleRelativeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
