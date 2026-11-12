package com.huami.pai.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.ext.I18nKt;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.lib.R;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b=\u0010>J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000fJ\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0014J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\"R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\"R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\"R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lcom/huami/pai/view/PaiSectionPartView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "rectTop", "", "c", "a", GoogleApiAvailabilityLight.a, "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "initView", "value", "setValue", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "", "str", "Landroid/graphics/Paint;", "paint", "getStrWidth", "getStrHeight", "Landroid/graphics/Paint;", "mPaint", "Landroid/content/Context;", "mContext", "F", "mWidth", "mHeight", "e", "mNodeHeight", "f", "mViewWidth", "Landroid/graphics/RectF;", "g", "Landroid/graphics/RectF;", "mCircleRectf", "Landroid/graphics/PorterDuffXfermode;", "h", "Landroid/graphics/PorterDuffXfermode;", "mXmode", "Landroid/graphics/Bitmap;", "i", "Landroid/graphics/Bitmap;", "mCurrentProgressBmp", z.j, "mRoundRectArg", hl.k, LogUtil.I, "", "l", "Z", "isRtl", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiSectionPartView extends View {
    private static final int m = 500;
    private static final int n = 30;
    private static final int o = 50;
    private static final int p = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Paint mPaint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Context mContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float mWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float mHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float mNodeHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float mViewWidth;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private RectF mCircleRectf;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private PorterDuffXfermode mXmode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Bitmap mCurrentProgressBmp;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float mRoundRectArg;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int value;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isRtl;

    @JvmOverloads
    public PaiSectionPartView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PaiSectionPartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PaiSectionPartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    private final void a(Canvas canvas, float rectTop) {
        int i;
        float f;
        int i2;
        float f2;
        Bitmap bitmap;
        Paint paint;
        String strI18n;
        Bitmap bitmap2;
        if (this.value == 0) {
            return;
        }
        d();
        float f3 = this.mWidth / 8;
        Bitmap bitmap3 = this.mCurrentProgressBmp;
        float width = bitmap3 == null ? 0.0f : bitmap3.getWidth() / 2.0f;
        float fDip2px = (rectTop - width) + ViewExKt.dip2px(this, 6.0f);
        int i3 = this.value;
        if (i3 < 30) {
            f = f3;
        } else {
            if (i3 < 50) {
                i = 3;
            } else {
                i = i3 < 100 ? 5 : 7;
            }
            f = i * f3;
        }
        if (i3 == 30) {
            f2 = 2;
        } else {
            if (i3 != 50) {
                i2 = i3 == 100 ? 6 : 4;
                if (this.isRtl) {
                    bitmap2 = this.mCurrentProgressBmp;
                    if (bitmap2 != null) {
                        canvas.drawBitmap(bitmap2, (this.mWidth - f) - width, fDip2px, this.mPaint);
                    }
                } else {
                    bitmap = this.mCurrentProgressBmp;
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, f - width, fDip2px, this.mPaint);
                    }
                }
                paint = this.mPaint;
                if (paint == null) {
                    return;
                }
                paint.setColor(ContextCompat.getColor(this.mContext, R.color.s5));
                strI18n = I18nKt.i18n(this.value);
                paint.setTextSize(ViewExKt.sp2px(this.mContext, 20.0f));
                paint.setTextAlign(Paint.Align.CENTER);
                if (this.isRtl) {
                    float f4 = 2;
                    canvas.drawText(strI18n, this.mWidth - f, (this.mHeight / f4) + (getStrHeight(strI18n, paint) / f4), paint);
                } else {
                    float f5 = 2;
                    canvas.drawText(strI18n, f, (this.mHeight / f5) + (getStrHeight(strI18n, paint) / f5), paint);
                }
                paint.setTextAlign(Paint.Align.LEFT);
            }
            f2 = i2;
        }
        f = f3 * f2;
        if (this.isRtl) {
            bitmap2 = this.mCurrentProgressBmp;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, (this.mWidth - f) - width, fDip2px, this.mPaint);
            }
        } else {
            bitmap = this.mCurrentProgressBmp;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, f - width, fDip2px, this.mPaint);
            }
        }
        paint = this.mPaint;
        if (paint == null) {
            return;
        }
        paint.setColor(ContextCompat.getColor(this.mContext, R.color.s5));
        strI18n = I18nKt.i18n(this.value);
        paint.setTextSize(ViewExKt.sp2px(this.mContext, 20.0f));
        paint.setTextAlign(Paint.Align.CENTER);
        if (this.isRtl) {
            float f6 = 2;
            canvas.drawText(strI18n, this.mWidth - f, (this.mHeight / f6) + (getStrHeight(strI18n, paint) / f6), paint);
        } else {
            float f7 = 2;
            canvas.drawText(strI18n, f, (this.mHeight / f7) + (getStrHeight(strI18n, paint) / f7), paint);
        }
        paint.setTextAlign(Paint.Align.LEFT);
    }

    private final void b(Canvas canvas) {
        String strI18n = I18nKt.i18n(30);
        float fDip2px = ViewExKt.dip2px(this, 8.0f);
        float fDip2px2 = ViewExKt.dip2px(this, 2.0f);
        float fSp2px = ViewExKt.sp2px(getContext(), 11.0f);
        Paint paint = this.mPaint;
        Context context = this.mContext;
        int i = R.color.s2;
        paint.setColor(ContextCompat.getColor(context, i));
        float f = this.mWidth;
        float f2 = 4;
        float f3 = f / f2;
        float f4 = 3;
        float f5 = (f / f2) * f4;
        if (this.isRtl) {
            f3 = f - (f / f2);
            f5 = f - ((f / f2) * f4);
        }
        this.mPaint.setTextSize(fSp2px);
        float f6 = 2;
        float f7 = fDip2px * f6;
        canvas.drawText(strI18n, f3 - (getStrWidth(strI18n, this.mPaint) / f6), (this.mHeight / f6) + f7 + fDip2px2, this.mPaint);
        if (this.value >= 30) {
            this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.yellow_f0));
        } else {
            this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.gray_ed));
        }
        canvas.drawCircle(f3, this.mHeight / f6, fDip2px, this.mPaint);
        this.mPaint.setColor(ContextCompat.getColor(this.mContext, i));
        String strI18n2 = I18nKt.i18n(50);
        float f8 = (this.mWidth / f2) * f6;
        this.mPaint.setTextSize(fSp2px);
        canvas.drawText(strI18n2, f8 - (getStrWidth(strI18n2, this.mPaint) / f6), (this.mHeight / f6) + f7 + fDip2px2, this.mPaint);
        if (this.value >= 50) {
            this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.blue_f9));
        } else {
            this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.gray_ed));
        }
        canvas.drawCircle(f8, this.mHeight / f6, fDip2px, this.mPaint);
        String strI18n3 = I18nKt.i18n(100);
        this.mPaint.setTextSize(fSp2px);
        this.mPaint.setColor(ContextCompat.getColor(this.mContext, i));
        canvas.drawText(strI18n3, f5 - (getStrWidth(strI18n3, this.mPaint) / f6), (this.mHeight / f6) + f7 + fDip2px2, this.mPaint);
        if (this.value >= 100) {
            this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.green_f7));
        } else {
            this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.gray_ed));
        }
        canvas.drawCircle(f5, this.mHeight / f6, fDip2px, this.mPaint);
    }

    private final void c(Canvas canvas, float rectTop) {
        int i = this.value;
        if (i <= 0) {
            return;
        }
        if (!this.isRtl) {
            if (i < 30) {
                this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.yellow_f0));
                RectF rectF = new RectF(0.0f, rectTop, this.mWidth / 8, this.mNodeHeight + rectTop);
                float f = this.mRoundRectArg;
                canvas.drawRoundRect(rectF, f, f, this.mPaint);
                return;
            }
            if (i < 50) {
                Paint paint = this.mPaint;
                Context context = this.mContext;
                int i2 = R.color.yellow_f0;
                paint.setColor(ContextCompat.getColor(context, i2));
                float f2 = 4;
                RectF rectF2 = new RectF(0.0f, rectTop, this.mWidth / f2, this.mNodeHeight + rectTop);
                float f3 = this.mRoundRectArg;
                canvas.drawRoundRect(rectF2, f3, f3, this.mPaint);
                if (this.value != 30) {
                    this.mPaint.setColor(ContextCompat.getColor(this.mContext, i2));
                    float f4 = this.mWidth;
                    RectF rectF3 = new RectF(f4 / f2, rectTop, (f4 / 8) * 3, this.mNodeHeight + rectTop);
                    float f5 = this.mRoundRectArg;
                    canvas.drawRoundRect(rectF3, f5, f5, this.mPaint);
                    return;
                }
                return;
            }
            if (i < 100) {
                this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.yellow_f0));
                float f6 = 4;
                RectF rectF4 = new RectF(0.0f, rectTop, this.mWidth / f6, this.mNodeHeight + rectTop);
                float f7 = this.mRoundRectArg;
                canvas.drawRoundRect(rectF4, f7, f7, this.mPaint);
                float f8 = this.mWidth;
                float f9 = 2;
                RectF rectF5 = new RectF(f8 / f6, rectTop, f8 / f9, this.mNodeHeight + rectTop);
                float f10 = this.mRoundRectArg;
                canvas.drawRoundRect(rectF5, f10, f10, this.mPaint);
                if (this.value != 50) {
                    this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.blue_f9));
                    float f11 = this.mWidth;
                    RectF rectF6 = new RectF(f11 / f9, rectTop, (f11 / 8) * 5, this.mNodeHeight + rectTop);
                    float f12 = this.mRoundRectArg;
                    canvas.drawRoundRect(rectF6, f12, f12, this.mPaint);
                    return;
                }
                return;
            }
            this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.yellow_f0));
            float f13 = 4;
            RectF rectF7 = new RectF(0.0f, rectTop, this.mWidth / f13, this.mNodeHeight + rectTop);
            float f14 = this.mRoundRectArg;
            canvas.drawRoundRect(rectF7, f14, f14, this.mPaint);
            float f15 = this.mWidth;
            float f16 = 2;
            RectF rectF8 = new RectF(f15 / f13, rectTop, f15 / f16, this.mNodeHeight + rectTop);
            float f17 = this.mRoundRectArg;
            canvas.drawRoundRect(rectF8, f17, f17, this.mPaint);
            this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.blue_f9));
            float f18 = this.mWidth;
            float f19 = 3;
            RectF rectF9 = new RectF(f18 / f16, rectTop, (f18 / f13) * f19, this.mNodeHeight + rectTop);
            float f20 = this.mRoundRectArg;
            canvas.drawRoundRect(rectF9, f20, f20, this.mPaint);
            this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.green_f7));
            float f21 = this.mWidth;
            RectF rectF10 = new RectF((f21 / f13) * f19, rectTop, f21, this.mNodeHeight + rectTop);
            float f22 = this.mRoundRectArg;
            canvas.drawRoundRect(rectF10, f22, f22, this.mPaint);
            return;
        }
        if (i < 30) {
            this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.yellow_f0));
            float f23 = this.mWidth;
            RectF rectF11 = new RectF(f23 - 0.0f, rectTop, f23 - (f23 / 8), this.mNodeHeight + rectTop);
            float f24 = this.mRoundRectArg;
            canvas.drawRoundRect(rectF11, f24, f24, this.mPaint);
            return;
        }
        if (i < 50) {
            Paint paint2 = this.mPaint;
            Context context2 = this.mContext;
            int i3 = R.color.yellow_f0;
            paint2.setColor(ContextCompat.getColor(context2, i3));
            float f25 = this.mWidth;
            float f26 = 4;
            RectF rectF12 = new RectF(f25 - 0.0f, rectTop, f25 - (f25 / f26), this.mNodeHeight + rectTop);
            float f27 = this.mRoundRectArg;
            canvas.drawRoundRect(rectF12, f27, f27, this.mPaint);
            if (this.value != 30) {
                this.mPaint.setColor(ContextCompat.getColor(this.mContext, i3));
                float f28 = this.mWidth;
                RectF rectF13 = new RectF(f28 - (f28 / f26), rectTop, f28 - ((f28 / 8) * 3), this.mNodeHeight + rectTop);
                float f29 = this.mRoundRectArg;
                canvas.drawRoundRect(rectF13, f29, f29, this.mPaint);
                return;
            }
            return;
        }
        if (i < 100) {
            this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.yellow_f0));
            float f30 = this.mWidth;
            float f31 = 4;
            RectF rectF14 = new RectF(f30 - 0.0f, rectTop, f30 - (f30 / f31), this.mNodeHeight + rectTop);
            float f32 = this.mRoundRectArg;
            canvas.drawRoundRect(rectF14, f32, f32, this.mPaint);
            float f33 = this.mWidth;
            float f34 = f33 - (f33 / f31);
            float f35 = 2;
            RectF rectF15 = new RectF(f34, rectTop, f33 - (f33 / f35), this.mNodeHeight + rectTop);
            float f36 = this.mRoundRectArg;
            canvas.drawRoundRect(rectF15, f36, f36, this.mPaint);
            if (this.value != 50) {
                this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.blue_f9));
                float f37 = this.mWidth;
                RectF rectF16 = new RectF(f37 - (f37 / f35), rectTop, f37 - ((f37 / 8) * 5), this.mNodeHeight + rectTop);
                float f38 = this.mRoundRectArg;
                canvas.drawRoundRect(rectF16, f38, f38, this.mPaint);
                return;
            }
            return;
        }
        this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.yellow_f0));
        float f39 = this.mWidth;
        float f40 = 4;
        RectF rectF17 = new RectF(f39 - 0.0f, rectTop, f39 - (f39 / f40), this.mNodeHeight + rectTop);
        float f41 = this.mRoundRectArg;
        canvas.drawRoundRect(rectF17, f41, f41, this.mPaint);
        float f42 = this.mWidth;
        float f43 = 2;
        RectF rectF18 = new RectF(f42 - (f42 / f40), rectTop, f42 - (f42 / f43), this.mNodeHeight + rectTop);
        float f44 = this.mRoundRectArg;
        canvas.drawRoundRect(rectF18, f44, f44, this.mPaint);
        this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.blue_f9));
        float f45 = this.mWidth;
        float f46 = 3;
        RectF rectF19 = new RectF(f45 - (f45 / f43), rectTop, f45 - ((f45 / f40) * f46), this.mNodeHeight + rectTop);
        float f47 = this.mRoundRectArg;
        canvas.drawRoundRect(rectF19, f47, f47, this.mPaint);
        this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.green_f7));
        float f48 = this.mWidth;
        RectF rectF20 = new RectF(f48 - ((f48 / f40) * f46), rectTop, f48 - f48, this.mNodeHeight + rectTop);
        float f49 = this.mRoundRectArg;
        canvas.drawRoundRect(rectF20, f49, f49, this.mPaint);
    }

    private final void d() {
        Bitmap bitmapFromVectorDrawable;
        int i = this.value;
        if (i < 50) {
            bitmapFromVectorDrawable = ViewExKt.getBitmapFromVectorDrawable(getContext(), R.drawable.pai_secition_orange);
        } else {
            bitmapFromVectorDrawable = i < 100 ? ViewExKt.getBitmapFromVectorDrawable(getContext(), R.drawable.pai_secition_blue) : ViewExKt.getBitmapFromVectorDrawable(getContext(), R.drawable.pai_secition_green);
        }
        this.mCurrentProgressBmp = bitmapFromVectorDrawable;
    }

    public final float getStrHeight(@NotNull String str, @Nullable Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public final float getStrWidth(@NotNull String str, @Nullable Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    public final void initView(@NotNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this.mContext = context;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(ContextCompat.getColor(context, R.color.gray_ed));
        this.mPaint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.PaiSectionPartView, defStyleAttr, 0);
        this.mNodeHeight = typedArrayObtainStyledAttributes.getDimension(R.styleable.PaiSectionPartView_pai_section_part_view_height, ViewExKt.dip2px(this, 8.0f));
        typedArrayObtainStyledAttributes.recycle();
        this.mCircleRectf = new RectF();
        this.mXmode = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.isRtl = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        this.mPaint.setColor(ContextCompat.getColor(this.mContext, R.color.gray_ed));
        float f = this.mHeight;
        float f2 = this.mNodeHeight;
        float f3 = (f - f2) / 2;
        RectF rectF = this.mCircleRectf;
        Objects.requireNonNull(rectF);
        rectF.set(0.0f, f3, this.mWidth, f2 + f3);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.mWidth, this.mHeight, null);
        this.mPaint.setStyle(Paint.Style.FILL);
        RectF rectF2 = this.mCircleRectf;
        Objects.requireNonNull(rectF2);
        float f4 = this.mRoundRectArg;
        canvas.drawRoundRect(rectF2, f4, f4, this.mPaint);
        this.mPaint.setXfermode(this.mXmode);
        this.mPaint.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
        c(canvas, f3);
        b(canvas);
        a(canvas, f3);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mHeight = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        this.mWidth = measuredWidth;
        if (this.mViewWidth == 0.0f) {
            this.mViewWidth = measuredWidth;
        }
    }

    public final void setValue(int value) {
        if (value > 500) {
            value = 500;
        }
        this.value = value;
        invalidate();
    }

    @JvmOverloads
    public PaiSectionPartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRoundRectArg = ViewExKt.dip2px(this, 6.0f);
        initView(context, attributeSet, i);
    }
}
