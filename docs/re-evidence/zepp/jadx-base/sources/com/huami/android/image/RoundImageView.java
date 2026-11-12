package com.huami.android.image;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 X2\u00020\u0001:\u0002XYB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bV\u0010WJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014J(\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0014J\u0018\u0010%\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0014R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0016\u0010*\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010+R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R$\u00101\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0014\u0010+\"\u0004\b/\u00100R$\u00106\u001a\u0002022\u0006\u0010.\u001a\u0002028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\n\u00103\"\u0004\b4\u00105R$\u00108\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000e\u0010+\"\u0004\b7\u00100R$\u0010;\u001a\u0002022\u0006\u0010.\u001a\u0002028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b9\u00103\"\u0004\b:\u00105R$\u0010>\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b<\u0010+\"\u0004\b=\u00100R$\u0010D\u001a\u00020?2\u0006\u0010.\u001a\u00020?8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010J\u001a\u00020E2\u0006\u0010.\u001a\u00020E8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010O\u001a\u0004\u0018\u00010\u00152\b\u0010.\u001a\u0004\u0018\u00010\u00158\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006Z"}, d2 = {"Lcom/huami/android/image/RoundImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "c", "g", "e", GoogleApiAvailabilityLight.a, "a", "h", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/Bitmap;", "b", "measureSpec", "f", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "scaleType", "setScaleType", "Landroid/graphics/Canvas;", "canvas", "onDraw", "w", "oldw", "oldh", "onSizeChanged", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "paintBorder", "paintBackground", LogUtil.I, "circleCenter", "heightCircle", "value", "setRoundColor", "(I)V", "roundColor", "", "F", "setBorderWidth", "(F)V", "borderWidth", "setBorderColor", "borderColor", "i", "setShadowRadius", "shadowRadius", z.j, "setShadowColor", "shadowColor", "Lcom/huami/android/image/RoundImageView$ShadowGravity;", hl.k, "Lcom/huami/android/image/RoundImageView$ShadowGravity;", "setShadowGravity", "(Lcom/huami/android/image/RoundImageView$ShadowGravity;)V", "shadowGravity", "", "l", "Z", "setShadowEnable", "(Z)V", "shadowEnable", "m", "Landroid/graphics/ColorFilter;", "setCivColorFilter", "(Landroid/graphics/ColorFilter;)V", "civColorFilter", GoogleApiAvailabilityLight.b, "Landroid/graphics/Bitmap;", "civImage", "o", "Landroid/graphics/drawable/Drawable;", "civDrawable", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "ShadowGravity", "image_release"}, k = 1, mv = {1, 4, 0})
public final class RoundImageView extends AppCompatImageView {
    private static final float p = 4.0f;
    private static final float q = 8.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Paint paintBorder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Paint paintBackground;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int circleCenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int heightCircle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int roundColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float borderWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int borderColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float shadowRadius;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int shadowColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private ShadowGravity shadowGravity;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean shadowEnable;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private ColorFilter civColorFilter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private Bitmap civImage;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private Drawable civDrawable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/android/image/RoundImageView$ShadowGravity;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "CENTER", "TOP", "BOTTOM", "START", "END", "image_release"}, k = 1, mv = {1, 4, 0})
    public enum ShadowGravity {
        CENTER(1),
        TOP(2),
        BOTTOM(3),
        START(4),
        END(5);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/android/image/RoundImageView$ShadowGravity$Companion;", "", "", "value", "Lcom/huami/android/image/RoundImageView$ShadowGravity;", "fromValue", "<init>", "()V", "image_release"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final ShadowGravity fromValue(int value) {
                if (value == 1) {
                    return ShadowGravity.CENTER;
                }
                if (value == 2) {
                    return ShadowGravity.TOP;
                }
                if (value == 3) {
                    return ShadowGravity.BOTTOM;
                }
                if (value == 4) {
                    return ShadowGravity.START;
                }
                if (value == 5) {
                    return ShadowGravity.END;
                }
                throw new IllegalArgumentException("ShadowGravity不支持该值: " + value);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        ShadowGravity(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShadowGravity.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ShadowGravity.CENTER.ordinal()] = 1;
            iArr[ShadowGravity.TOP.ordinal()] = 2;
            iArr[ShadowGravity.BOTTOM.ordinal()] = 3;
            iArr[ShadowGravity.START.ordinal()] = 4;
            iArr[ShadowGravity.END.ordinal()] = 5;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
        }
    }

    @JvmOverloads
    public RoundImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a() {
        float f;
        float f2;
        float f3;
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, this.paintBorder);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.shadowGravity.ordinal()];
        float f4 = 0.0f;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        f3 = this.shadowRadius;
                    }
                    f2 = 0.0f;
                } else {
                    f3 = -this.shadowRadius;
                }
                f4 = f3 / 2;
                f2 = 0.0f;
            } else {
                f = this.shadowRadius;
            }
            this.paintBorder.setShadowLayer(this.shadowRadius, f4, f2, this.shadowColor);
        }
        f = -this.shadowRadius;
        f2 = f / 2;
        this.paintBorder.setShadowLayer(this.shadowRadius, f4, f2, this.shadowColor);
    }

    private final Bitmap b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final void c(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.RoundImageView, defStyleAttr, 0);
        setRoundColor(typedArrayObtainStyledAttributes.getColor(R.styleable.RoundImageView_riv_round_color, -1));
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.RoundImageView_riv_border, true)) {
            setBorderWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundImageView_riv_border_width, getContext().getResources().getDisplayMetrics().density * 4.0f));
            setBorderColor(typedArrayObtainStyledAttributes.getColor(R.styleable.RoundImageView_riv_border_color, -1));
        }
        setShadowEnable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.RoundImageView_riv_shadow, this.shadowEnable));
        if (this.shadowEnable) {
            setShadowGravity(ShadowGravity.INSTANCE.fromValue(typedArrayObtainStyledAttributes.getInteger(R.styleable.RoundImageView_riv_shadow_gravity, ShadowGravity.BOTTOM.getValue())));
            setShadowRadius(typedArrayObtainStyledAttributes.getFloat(R.styleable.RoundImageView_riv_shadow_radius, 8.0f));
            setShadowColor(typedArrayObtainStyledAttributes.getColor(R.styleable.RoundImageView_riv_shadow_color, this.shadowColor));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void d() {
        if (Intrinsics.areEqual(this.civDrawable, getDrawable())) {
            return;
        }
        Drawable drawable = getDrawable();
        this.civDrawable = drawable;
        this.civImage = b(drawable);
        h();
    }

    private final void e() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(!this.shadowEnable ? new ViewOutlineProvider() { // from class: com.huami.android.image.RoundImageView$manageElevation$1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(@Nullable View view, @Nullable Outline outline) {
                    if (outline != null) {
                        outline.setOval(0, 0, this.a.heightCircle, this.a.heightCircle);
                    }
                }
            } : null);
        }
    }

    private final int f(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : this.heightCircle;
    }

    private final void g() {
        if (this.civImage != null) {
            h();
        }
        int iMin = Math.min(getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        this.heightCircle = iMin;
        float f = this.borderWidth;
        this.circleCenter = ((int) (iMin - (2 * f))) / 2;
        this.paintBorder.setColor(f == 0.0f ? this.roundColor : this.borderColor);
        e();
        invalidate();
    }

    private final void h() {
        float width;
        float height;
        int height2;
        float height3;
        float width2;
        int width3;
        float f;
        float f2;
        Bitmap bitmap = this.civImage;
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            int i = WhenMappings.$EnumSwitchMapping$1[getScaleType().ordinal()];
            float f3 = 0.0f;
            if (i != 1) {
                if (i != 2) {
                    f = 0.0f;
                } else if (bitmap.getWidth() * getHeight() < getWidth() * bitmap.getHeight()) {
                    height3 = getHeight() / bitmap.getHeight();
                    width2 = getWidth();
                    width3 = bitmap.getWidth();
                    f2 = (width2 - (width3 * height3)) * 0.5f;
                    f3 = height3;
                    f = 0.0f;
                } else {
                    width = getWidth() / bitmap.getWidth();
                    height = getHeight();
                    height2 = bitmap.getHeight();
                    f3 = width;
                    f = (height - (height2 * width)) * 0.5f;
                }
                f2 = 0.0f;
            } else if (bitmap.getWidth() * getHeight() > getWidth() * bitmap.getHeight()) {
                height3 = getHeight() / bitmap.getHeight();
                width2 = getWidth();
                width3 = bitmap.getWidth();
                f2 = (width2 - (width3 * height3)) * 0.5f;
                f3 = height3;
                f = 0.0f;
            } else {
                width = getWidth() / bitmap.getWidth();
                height = getHeight();
                height2 = bitmap.getHeight();
                f3 = width;
                f = (height - (height2 * width)) * 0.5f;
                f2 = 0.0f;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f3, f3);
            matrix.postTranslate(f2, f);
            bitmapShader.setLocalMatrix(matrix);
            this.paint.setShader(bitmapShader);
            this.paint.setColorFilter(this.civColorFilter);
        }
    }

    private final void setBorderColor(int i) {
        this.borderColor = i;
        g();
    }

    private final void setBorderWidth(float f) {
        this.borderWidth = f;
        g();
    }

    private final void setCivColorFilter(ColorFilter colorFilter) {
        if (!Intrinsics.areEqual(this.civColorFilter, colorFilter)) {
            this.civColorFilter = colorFilter;
            if (colorFilter != null) {
                this.civDrawable = null;
                invalidate();
            }
        }
    }

    private final void setRoundColor(int i) {
        this.roundColor = i;
        this.paintBackground.setColor(i);
        invalidate();
    }

    private final void setShadowColor(int i) {
        this.shadowColor = i;
        invalidate();
    }

    private final void setShadowEnable(boolean z) {
        this.shadowEnable = z;
        if (z && this.shadowRadius == 0.0f) {
            setShadowRadius(8.0f);
        }
        g();
    }

    private final void setShadowGravity(ShadowGravity shadowGravity) {
        this.shadowGravity = shadowGravity;
        invalidate();
    }

    private final void setShadowRadius(float f) {
        this.shadowRadius = f;
        setShadowEnable(f > 0.0f);
    }

    @Override // android.widget.ImageView
    @NotNull
    public ImageView.ScaleType getScaleType() {
        ImageView.ScaleType scaleType = super.getScaleType();
        return (scaleType == null || scaleType != ImageView.ScaleType.CENTER_INSIDE) ? ImageView.ScaleType.CENTER_CROP : scaleType;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        d();
        if (this.civImage == null) {
            return;
        }
        float f = this.circleCenter + this.borderWidth;
        boolean z = this.shadowEnable;
        float f2 = z ? this.shadowRadius * 2 : 0.0f;
        if (z) {
            a();
        }
        canvas.drawCircle(f, f, f - f2, this.paintBorder);
        canvas.drawCircle(f, f, this.circleCenter - f2, this.paintBackground);
        canvas.drawCircle(f, f, this.circleCenter - f2, this.paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(f(widthMeasureSpec), f(heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        g();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(@NotNull ColorFilter colorFilter) {
        setCivColorFilter(colorFilter);
    }

    @Override // android.widget.ImageView
    public void setScaleType(@NotNull ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.CENTER_CROP || scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            super.setScaleType(scaleType);
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            throw new IllegalArgumentException(String.format("%s not supported. ", Arrays.copyOf(new Object[]{scaleType}, 1)));
        }
    }

    @JvmOverloads
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.paint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.paintBorder = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        this.paintBackground = paint3;
        this.roundColor = -1;
        this.borderColor = -16777216;
        this.shadowColor = -16777216;
        this.shadowGravity = ShadowGravity.BOTTOM;
        c(context, attributeSet, i);
    }
}
