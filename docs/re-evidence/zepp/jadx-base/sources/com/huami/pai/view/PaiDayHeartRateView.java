package com.huami.pai.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.baseflow.permissionhandler.m;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.pai.ext.StrExKt;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.lib.R;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.tencent.connect.common.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b`\u0010aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u001e\u0010\u001d\u001a\u00020\u00042\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0015H\u0014J(\u0010%\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0015H\u0014R\u0016\u0010'\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0016\u0010(\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0016\u0010)\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0016\u0010*\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010+R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00158\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u0010&R\u0016\u00104\u001a\u00020\t8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00103R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00103R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00103R\u0016\u0010>\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00103R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010F\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010AR\u0016\u0010H\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010AR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010NR\u0016\u0010S\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010NR\u0018\u0010U\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010NR\u0018\u0010W\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010NR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^¨\u0006b"}, d2 = {"Lcom/huami/pai/view/PaiDayHeartRateView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "c", GoogleApiAvailabilityLight.a, "Lcom/huami/chart/data/ChartData;", "chartData", "", "e", "b", "x1", "y1", "x2", "y2", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "initView", "onDraw", "Landroid/util/SparseArray;", "data", "", "hrTagValue", "setData", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "oldw", "oldh", "onSizeChanged", LogUtil.I, "HEART_TOTAL", "BOTTOM_HEIGHT", "END_WIDTH", "mLineWidth", "Landroid/content/Context;", "mContext", "f", "Landroid/util/SparseArray;", "mData", "g", "mMaxHr", "h", "F", "mBottomHeight", "i", "mWidth", z.j, "mHeight", hl.k, "mViewHeight", "l", "mViewWidth", "m", "mItemWidth", "Landroid/graphics/Paint;", GoogleApiAvailabilityLight.b, "Landroid/graphics/Paint;", "mFontPaint", "o", "mLinePaint", b.r, "mShaderPaint", DTransferConstants.SEARCH_KEY, "mDottedLine", "Landroid/graphics/PathEffect;", "r", "Landroid/graphics/PathEffect;", "effects", SOAP.XMLNS, "[I", "mHrTagValue", "t", "lineColor", "u", "rectColor", "v", "mLineColors", "w", "mRectColors", "", "x", "[F", "mPos", "", "y", "Z", "isRtl", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiDayHeartRateView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int HEART_TOTAL;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int BOTTOM_HEIGHT;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int END_WIDTH;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int mLineWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Context mContext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private SparseArray<ChartData> mData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int mMaxHr;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float mBottomHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float mWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float mHeight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float mViewHeight;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float mViewWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float mItemWidth;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private Paint mFontPaint;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private Paint mLinePaint;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Paint mShaderPaint;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Paint mDottedLine;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private PathEffect effects;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    private int[] mHrTagValue;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int[] lineColor;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private int[] rectColor;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    private int[] mLineColors;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    private int[] mRectColors;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private float[] mPos;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean isRtl;

    @JvmOverloads
    public PaiDayHeartRateView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PaiDayHeartRateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PaiDayHeartRateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a(Canvas canvas, float x1, float y1, float x2, float y2) {
        Path path = new Path();
        path.moveTo(x1, y1);
        path.lineTo(x2, y2);
        Paint paint = this.mDottedLine;
        Objects.requireNonNull(paint);
        canvas.drawPath(path, paint);
    }

    private final void b(Canvas canvas) {
        if (this.mHrTagValue == null) {
            return;
        }
        Paint paint = this.mFontPaint;
        Objects.requireNonNull(paint);
        Context context = this.mContext;
        Objects.requireNonNull(context);
        paint.setColor(ContextCompat.getColor(context, R.color.pai_black_10_percent));
        Paint paint2 = this.mFontPaint;
        Objects.requireNonNull(paint2);
        paint2.setTextAlign(Paint.Align.LEFT);
        float fDip2px = ViewExKt.dip2px(this, 10.0f) + this.mViewHeight;
        float f = this.mViewWidth;
        float fDip2px2 = ViewExKt.dip2px(this, 10.0f) + this.mViewHeight;
        Paint paint3 = this.mFontPaint;
        Objects.requireNonNull(paint3);
        canvas.drawLine(0.0f, fDip2px, f, fDip2px2, paint3);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            float f2 = this.mViewWidth;
            float f3 = 12;
            float f4 = i;
            float f5 = (f2 / f3) * f4;
            if (i == 0) {
                f5 = ((f2 / f3) * f4) + 2;
            } else if (i == 12) {
                f5 = ((f2 / f3) * f4) - 2;
            }
            float f6 = f5;
            Paint paint4 = this.mFontPaint;
            Objects.requireNonNull(paint4);
            Context context2 = this.mContext;
            Objects.requireNonNull(context2);
            paint4.setColor(ContextCompat.getColor(context2, R.color.pai_black_10_percent));
            float fDip2px3 = this.mViewHeight + ViewExKt.dip2px(this, 6.0f);
            float fDip2px4 = this.mViewHeight + ViewExKt.dip2px(this, 10.0f);
            Paint paint5 = this.mFontPaint;
            Objects.requireNonNull(paint5);
            canvas.drawLine(f6, fDip2px3, f6, fDip2px4, paint5);
            Paint paint6 = this.mFontPaint;
            Objects.requireNonNull(paint6);
            Context context3 = this.mContext;
            Objects.requireNonNull(context3);
            int i3 = R.color.pai_black_40_percent;
            paint6.setColor(ContextCompat.getColor(context3, i3));
            if (i > 0 && i % 2 == 0 && i != 12) {
                String strValueOf = String.valueOf(i * 2);
                if (i < 5) {
                    strValueOf = "0" + strValueOf;
                }
                Paint paint7 = this.mFontPaint;
                Objects.requireNonNull(paint7);
                float fStrWidth = f6 - (StrExKt.strWidth(strValueOf, paint7) / 2);
                float fDip2px5 = this.mHeight - ViewExKt.dip2px(this, 2.0f);
                Paint paint8 = this.mFontPaint;
                Objects.requireNonNull(paint8);
                canvas.drawText(strValueOf, fStrWidth, fDip2px5, paint8);
            } else if (i == 0) {
                float fDip2px6 = this.mHeight - ViewExKt.dip2px(this, 2.0f);
                Paint paint9 = this.mFontPaint;
                Objects.requireNonNull(paint9);
                canvas.drawText("00", 0.0f, fDip2px6, paint9);
            } else if (i == 12) {
                float f7 = this.mViewWidth;
                Paint paint10 = this.mFontPaint;
                Objects.requireNonNull(paint10);
                float fStrWidth2 = f7 - StrExKt.strWidth(Constants.VIA_REPORT_TYPE_CHAT_AIO, paint10);
                float f8 = this.mHeight;
                Context context4 = this.mContext;
                Objects.requireNonNull(context4);
                float fDip2px7 = f8 - ViewExKt.dip2px(2, context4);
                Paint paint11 = this.mFontPaint;
                Objects.requireNonNull(paint11);
                canvas.drawText(Constants.VIA_REPORT_TYPE_CHAT_AIO, fStrWidth2, fDip2px7, paint11);
            }
            if (i2 > 12) {
                Paint paint12 = this.mFontPaint;
                Objects.requireNonNull(paint12);
                int strHeight = ViewExKt.getStrHeight(paint12, String.valueOf(this.mHrTagValue[1])) + ((int) ViewExKt.dip2px(this, 4.0f));
                Paint paint13 = this.mFontPaint;
                Objects.requireNonNull(paint13);
                int strWidth = (int) (ViewExKt.getStrWidth(paint13, "BPM") + ViewExKt.dip2px(this, 4.0f));
                Paint paint14 = this.mFontPaint;
                Objects.requireNonNull(paint14);
                Context context5 = this.mContext;
                Objects.requireNonNull(context5);
                paint14.setColor(ContextCompat.getColor(context5, i3));
                Paint paint15 = this.mFontPaint;
                Objects.requireNonNull(paint15);
                paint15.setTextAlign(Paint.Align.RIGHT);
                float f9 = strWidth;
                float f10 = this.mViewWidth + f9;
                float f11 = this.mViewHeight;
                Paint paint16 = this.mFontPaint;
                Objects.requireNonNull(paint16);
                canvas.drawText("BPM", f10, f11, paint16);
                Paint paint17 = this.mDottedLine;
                Objects.requireNonNull(paint17);
                Context context6 = this.mContext;
                Objects.requireNonNull(context6);
                int i4 = R.color.pai_low_hr;
                paint17.setColor(ViewExKt.addAlpha(ContextCompat.getColor(context6, i4), 0.1d));
                Paint paint18 = this.mFontPaint;
                Objects.requireNonNull(paint18);
                Context context7 = this.mContext;
                Objects.requireNonNull(context7);
                paint18.setColor(ContextCompat.getColor(context7, i4));
                float f12 = 1;
                a(canvas, 0.0f, this.mViewHeight * (f12 - (this.mHrTagValue[0] / this.mMaxHr)), this.mViewWidth, this.mViewHeight * (f12 - (this.mHrTagValue[0] / this.mMaxHr)));
                float f13 = strHeight;
                float fMax = Math.max(Math.abs(this.mViewHeight * ((this.mHrTagValue[0] - this.mHrTagValue[1]) / this.mMaxHr)), f13);
                float fMax2 = Math.max(Math.abs(this.mViewHeight * ((this.mHrTagValue[1] - this.mHrTagValue[2]) / this.mMaxHr)), f13);
                String strValueOf2 = String.valueOf(this.mHrTagValue[0]);
                float f14 = this.mViewWidth + f9;
                float fDip2px8 = (this.mViewHeight * (f12 - (this.mHrTagValue[1] / this.mMaxHr))) + ViewExKt.dip2px(this, 4.0f) + fMax;
                Paint paint19 = this.mFontPaint;
                Objects.requireNonNull(paint19);
                canvas.drawText(strValueOf2, f14, fDip2px8, paint19);
                Paint paint20 = this.mDottedLine;
                Objects.requireNonNull(paint20);
                Context context8 = this.mContext;
                Objects.requireNonNull(context8);
                int i5 = R.color.pai_mid_hr;
                paint20.setColor(ViewExKt.addAlpha(ContextCompat.getColor(context8, i5), 0.1d));
                Paint paint21 = this.mFontPaint;
                Objects.requireNonNull(paint21);
                Context context9 = this.mContext;
                Objects.requireNonNull(context9);
                paint21.setColor(ContextCompat.getColor(context9, i5));
                a(canvas, 0.0f, this.mViewHeight * (f12 - (this.mHrTagValue[1] / this.mMaxHr)), this.mViewWidth, (f12 - (this.mHrTagValue[1] / this.mMaxHr)) * this.mViewHeight);
                String strValueOf3 = String.valueOf(this.mHrTagValue[1]);
                float f15 = this.mViewWidth + f9;
                float fDip2px9 = (this.mViewHeight * (f12 - (this.mHrTagValue[1] / this.mMaxHr))) + ViewExKt.dip2px(this, 4.0f);
                Paint paint22 = this.mFontPaint;
                Objects.requireNonNull(paint22);
                canvas.drawText(strValueOf3, f15, fDip2px9, paint22);
                Paint paint23 = this.mDottedLine;
                Objects.requireNonNull(paint23);
                Context context10 = this.mContext;
                Objects.requireNonNull(context10);
                int i6 = R.color.pai_high_hr;
                paint23.setColor(ViewExKt.addAlpha(ContextCompat.getColor(context10, i6), 0.1d));
                Paint paint24 = this.mFontPaint;
                Objects.requireNonNull(paint24);
                Context context11 = this.mContext;
                Objects.requireNonNull(context11);
                paint24.setColor(ContextCompat.getColor(context11, i6));
                a(canvas, 0.0f, this.mViewHeight * (f12 - (this.mHrTagValue[2] / this.mMaxHr)), this.mViewWidth, (f12 - (this.mHrTagValue[2] / this.mMaxHr)) * this.mViewHeight);
                String strValueOf4 = String.valueOf(this.mHrTagValue[2]);
                float f16 = this.mViewWidth + f9;
                float fDip2px10 = ((this.mViewHeight * (f12 - (this.mHrTagValue[1] / this.mMaxHr))) + ViewExKt.dip2px(this, 4.0f)) - fMax2;
                Paint paint25 = this.mFontPaint;
                Objects.requireNonNull(paint25);
                canvas.drawText(strValueOf4, f16, fDip2px10, paint25);
                return;
            }
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    private final void c(Canvas canvas) {
        int[] iArr;
        int size;
        SparseArray<ChartData> sparseArray = this.mData;
        if (sparseArray == null) {
            return;
        }
        if ((sparseArray != null && sparseArray.size() == 0) || (iArr = this.mHrTagValue) == null) {
            return;
        }
        float[] fArr = new float[4];
        if (iArr != null) {
            float f = 1;
            float f2 = iArr[2];
            int i = this.mMaxHr;
            fArr[0] = f - (f2 / i);
            fArr[1] = f - (iArr[1] / i);
            fArr[2] = f - (iArr[0] / i);
        }
        fArr[3] = 1.0f;
        this.mPos = new float[8];
        int[] iArr2 = this.lineColor;
        Objects.requireNonNull(iArr2);
        this.mLineColors = new int[iArr2.length * 2];
        Objects.requireNonNull(iArr2);
        this.mRectColors = new int[iArr2.length * 2];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            int[] iArr3 = this.mLineColors;
            if (iArr3 != null) {
                int[] iArr4 = this.lineColor;
                Objects.requireNonNull(iArr4);
                iArr3[i3] = iArr4[i2];
                Objects.requireNonNull(iArr4);
                iArr3[i3 + 1] = iArr4[i2];
            }
            int[] iArr5 = this.mRectColors;
            if (iArr5 != null) {
                int[] iArr6 = this.rectColor;
                Objects.requireNonNull(iArr6);
                iArr5[i3] = iArr6[i2];
                Objects.requireNonNull(iArr6);
                iArr5[i3 + 1] = iArr6[i2];
            }
            float[] fArr2 = this.mPos;
            if (fArr2 != null) {
                if (i2 == 0) {
                    fArr2[i3] = 0.0f;
                    fArr2[i3 + 1] = fArr[i2];
                } else {
                    fArr2[i3] = fArr[i2 - 1];
                    fArr2[i3 + 1] = fArr[i2];
                }
            }
            i3 += 2;
            if (i4 > 3) {
                break;
            } else {
                i2 = i4;
            }
        }
        d(canvas);
        Paint paint = this.mLinePaint;
        Objects.requireNonNull(paint);
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.mViewHeight, this.mLineColors, this.mPos, Shader.TileMode.CLAMP));
        SparseArray<ChartData> sparseArray2 = this.mData;
        if (sparseArray2 == null || (size = sparseArray2.size() - 1) <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            if (e(sparseArray2.get(i5)) == 0.0f) {
                if (!(e(sparseArray2.get(i6)) == 0.0f)) {
                    float f3 = i5 * this.mItemWidth;
                    float f4 = 1;
                    float fE = this.mViewHeight * (f4 - (e(sparseArray2.get(i5)) / this.mMaxHr));
                    float f5 = i6 * this.mItemWidth;
                    float fE2 = this.mViewHeight * (f4 - (e(sparseArray2.get(i6)) / this.mMaxHr));
                    Paint paint2 = this.mLinePaint;
                    Objects.requireNonNull(paint2);
                    canvas.drawLine(f3, fE, f5, fE2, paint2);
                }
            } else {
                float f6 = i5 * this.mItemWidth;
                float f7 = 1;
                float fE3 = this.mViewHeight * (f7 - (e(sparseArray2.get(i5)) / this.mMaxHr));
                float f8 = i6 * this.mItemWidth;
                float fE4 = this.mViewHeight * (f7 - (e(sparseArray2.get(i6)) / this.mMaxHr));
                Paint paint3 = this.mLinePaint;
                Objects.requireNonNull(paint3);
                canvas.drawLine(f6, fE3, f8, fE4, paint3);
            }
            if (i6 >= size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    private final void d(Canvas canvas) {
        int size;
        SparseArray<ChartData> sparseArray = this.mData;
        if (sparseArray == null) {
            return;
        }
        if ((sparseArray != null && sparseArray.size() == 0) || this.mHrTagValue == null || (size = this.mData.size() - 1) <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (e(this.mData.get(i)) >= 0.0f) {
                float fE = e(this.mData.get(i));
                if (fE >= 30.0f) {
                    if (fE < this.mHrTagValue[0]) {
                        Paint paint = this.mShaderPaint;
                        Objects.requireNonNull(paint);
                        int[] iArr = this.rectColor;
                        Objects.requireNonNull(iArr);
                        paint.setColor(iArr[3]);
                        float f = i;
                        float f2 = this.mItemWidth;
                        float f3 = this.mViewHeight;
                        float fDip2px = f3 + ViewExKt.dip2px(this, 10.0f);
                        Paint paint2 = this.mShaderPaint;
                        Objects.requireNonNull(paint2);
                        canvas.drawLine(f * f2, (1 - (fE / this.mMaxHr)) * f3, f * f2, fDip2px, paint2);
                    } else if (fE < this.mHrTagValue[1]) {
                        Paint paint3 = this.mShaderPaint;
                        Objects.requireNonNull(paint3);
                        int[] iArr2 = this.rectColor;
                        Objects.requireNonNull(iArr2);
                        paint3.setColor(iArr2[3]);
                        float f4 = i;
                        float f5 = f4 * this.mItemWidth;
                        float fDip2px2 = this.mViewHeight + ViewExKt.dip2px(this, 10.0f);
                        float f6 = f4 * this.mItemWidth;
                        float f7 = 1;
                        float f8 = this.mViewHeight * (f7 - (this.mHrTagValue[0] / this.mMaxHr));
                        Paint paint4 = this.mShaderPaint;
                        Objects.requireNonNull(paint4);
                        canvas.drawLine(f5, fDip2px2, f6, f8, paint4);
                        Paint paint5 = this.mShaderPaint;
                        Objects.requireNonNull(paint5);
                        int[] iArr3 = this.rectColor;
                        Objects.requireNonNull(iArr3);
                        paint5.setColor(iArr3[2]);
                        float f9 = this.mItemWidth;
                        float f10 = this.mViewHeight;
                        float f11 = f10 * (f7 - (this.mHrTagValue[0] / this.mMaxHr));
                        Paint paint6 = this.mShaderPaint;
                        Objects.requireNonNull(paint6);
                        canvas.drawLine(f4 * f9, f10 * (f7 - (fE / this.mMaxHr)), f4 * f9, f11, paint6);
                    } else if (fE < this.mHrTagValue[2]) {
                        Paint paint7 = this.mShaderPaint;
                        Objects.requireNonNull(paint7);
                        int[] iArr4 = this.rectColor;
                        Objects.requireNonNull(iArr4);
                        paint7.setColor(iArr4[3]);
                        float f12 = i;
                        float f13 = f12 * this.mItemWidth;
                        float f14 = 1;
                        float f15 = this.mViewHeight * (f14 - (this.mHrTagValue[0] / this.mMaxHr));
                        float f16 = f12 * this.mItemWidth;
                        float fDip2px3 = this.mViewHeight + ViewExKt.dip2px(this, 10.0f);
                        Paint paint8 = this.mShaderPaint;
                        Objects.requireNonNull(paint8);
                        canvas.drawLine(f13, f15, f16, fDip2px3, paint8);
                        Paint paint9 = this.mShaderPaint;
                        Objects.requireNonNull(paint9);
                        int[] iArr5 = this.rectColor;
                        Objects.requireNonNull(iArr5);
                        paint9.setColor(iArr5[2]);
                        float f17 = f12 * this.mItemWidth;
                        float f18 = this.mViewHeight * (f14 - (this.mHrTagValue[1] / this.mMaxHr));
                        float f19 = f12 * this.mItemWidth;
                        float f20 = this.mViewHeight * (f14 - (this.mHrTagValue[0] / this.mMaxHr));
                        Paint paint10 = this.mShaderPaint;
                        Objects.requireNonNull(paint10);
                        canvas.drawLine(f17, f18, f19, f20, paint10);
                        Paint paint11 = this.mShaderPaint;
                        Objects.requireNonNull(paint11);
                        int[] iArr6 = this.rectColor;
                        Objects.requireNonNull(iArr6);
                        paint11.setColor(iArr6[1]);
                        float f21 = f12 * this.mItemWidth;
                        float f22 = this.mViewHeight;
                        float f23 = this.mHrTagValue[1];
                        int i3 = this.mMaxHr;
                        float f24 = f12 * this.mItemWidth;
                        float f25 = this.mViewHeight * (f14 - (fE / i3));
                        Paint paint12 = this.mShaderPaint;
                        Objects.requireNonNull(paint12);
                        canvas.drawLine(f21, f22 * (f14 - (f23 / i3)), f24, f25, paint12);
                    } else {
                        Paint paint13 = this.mShaderPaint;
                        Objects.requireNonNull(paint13);
                        int[] iArr7 = this.rectColor;
                        Objects.requireNonNull(iArr7);
                        paint13.setColor(iArr7[3]);
                        float f26 = i;
                        float f27 = f26 * this.mItemWidth;
                        float f28 = 1;
                        float f29 = this.mViewHeight * (f28 - (this.mHrTagValue[0] / this.mMaxHr));
                        float f30 = f26 * this.mItemWidth;
                        float fDip2px4 = this.mViewHeight + ViewExKt.dip2px(this, 10.0f);
                        Paint paint14 = this.mShaderPaint;
                        Objects.requireNonNull(paint14);
                        canvas.drawLine(f27, f29, f30, fDip2px4, paint14);
                        Paint paint15 = this.mShaderPaint;
                        Objects.requireNonNull(paint15);
                        int[] iArr8 = this.rectColor;
                        Objects.requireNonNull(iArr8);
                        paint15.setColor(iArr8[2]);
                        float f31 = f26 * this.mItemWidth;
                        float f32 = this.mViewHeight * (f28 - (this.mHrTagValue[1] / this.mMaxHr));
                        float f33 = f26 * this.mItemWidth;
                        float f34 = this.mViewHeight * (f28 - (this.mHrTagValue[0] / this.mMaxHr));
                        Paint paint16 = this.mShaderPaint;
                        Objects.requireNonNull(paint16);
                        canvas.drawLine(f31, f32, f33, f34, paint16);
                        Paint paint17 = this.mShaderPaint;
                        Objects.requireNonNull(paint17);
                        int[] iArr9 = this.rectColor;
                        Objects.requireNonNull(iArr9);
                        paint17.setColor(iArr9[1]);
                        float f35 = f26 * this.mItemWidth;
                        float f36 = this.mViewHeight * (f28 - (this.mHrTagValue[1] / this.mMaxHr));
                        float f37 = f26 * this.mItemWidth;
                        float f38 = this.mViewHeight * (f28 - (this.mHrTagValue[2] / this.mMaxHr));
                        Paint paint18 = this.mShaderPaint;
                        Objects.requireNonNull(paint18);
                        canvas.drawLine(f35, f36, f37, f38, paint18);
                        Paint paint19 = this.mShaderPaint;
                        Objects.requireNonNull(paint19);
                        int[] iArr10 = this.rectColor;
                        Objects.requireNonNull(iArr10);
                        paint19.setColor(iArr10[0]);
                        float f39 = this.mItemWidth;
                        float f40 = f26 * f39;
                        float f41 = this.mViewHeight;
                        float f42 = f41 * (f28 - (fE / this.mMaxHr));
                        float f43 = f26 * f39;
                        float f44 = f41 * (f28 - (this.mHrTagValue[2] / this.mMaxHr));
                        Paint paint20 = this.mShaderPaint;
                        Objects.requireNonNull(paint20);
                        canvas.drawLine(f40, f42, f43, f44, paint20);
                    }
                }
            }
            if (i2 >= size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    private final float e(ChartData chartData) {
        float[] values;
        if (chartData == null || (values = chartData.getValues()) == null) {
            return 0.0f;
        }
        return values[0];
    }

    public final void initView(@NotNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this.mContext = context;
        Paint paint = new Paint();
        this.mLinePaint = paint;
        Objects.requireNonNull(paint);
        Context context2 = this.mContext;
        Objects.requireNonNull(context2);
        paint.setColor(ContextCompat.getColor(context2, 17170444));
        Paint paint2 = this.mLinePaint;
        Objects.requireNonNull(paint2);
        paint2.setStrokeWidth(ViewExKt.dip2px(this, this.mLineWidth));
        Paint paint3 = this.mLinePaint;
        Objects.requireNonNull(paint3);
        paint3.setAntiAlias(true);
        Paint paint4 = this.mLinePaint;
        Objects.requireNonNull(paint4);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        Paint paint5 = new Paint();
        this.mShaderPaint = paint5;
        Objects.requireNonNull(paint5);
        Context context3 = this.mContext;
        Objects.requireNonNull(context3);
        paint5.setStrokeWidth(ViewExKt.dip2px(2, context3));
        Paint paint6 = this.mShaderPaint;
        Objects.requireNonNull(paint6);
        paint6.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint7 = this.mShaderPaint;
        Objects.requireNonNull(paint7);
        paint7.setAntiAlias(true);
        Paint paint8 = new Paint();
        this.mFontPaint = paint8;
        Objects.requireNonNull(paint8);
        paint8.setStrokeWidth(ViewExKt.dip2px(this, 1.0f));
        Paint paint9 = this.mFontPaint;
        Objects.requireNonNull(paint9);
        Context context4 = this.mContext;
        Objects.requireNonNull(context4);
        paint9.setColor(ContextCompat.getColor(context4, R.color.pai_black_40_percent));
        Paint paint10 = this.mFontPaint;
        Objects.requireNonNull(paint10);
        Context context5 = this.mContext;
        Objects.requireNonNull(context5);
        paint10.setTextSize(ViewExKt.sp2px(context5, 12.0f));
        Paint paint11 = this.mFontPaint;
        Objects.requireNonNull(paint11);
        paint11.setAntiAlias(true);
        Paint paint12 = new Paint();
        this.mDottedLine = paint12;
        Objects.requireNonNull(paint12);
        paint12.setAntiAlias(true);
        Paint paint13 = this.mDottedLine;
        Objects.requireNonNull(paint13);
        paint13.setStyle(Paint.Style.STROKE);
        Paint paint14 = this.mDottedLine;
        Objects.requireNonNull(paint14);
        Context context6 = this.mContext;
        Objects.requireNonNull(context6);
        paint14.setColor(ContextCompat.getColor(context6, R.color.gray_de));
        Paint paint15 = this.mDottedLine;
        Objects.requireNonNull(paint15);
        paint15.setStrokeWidth(2.0f);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{ViewExKt.dip2px(this, 2.0f), ViewExKt.dip2px(this, 2.0f)}, 0.0f);
        this.effects = dashPathEffect;
        Paint paint16 = this.mDottedLine;
        Objects.requireNonNull(paint16);
        Objects.requireNonNull(dashPathEffect);
        paint16.setPathEffect(dashPathEffect);
        Context context7 = this.mContext;
        Objects.requireNonNull(context7);
        int i = R.color.pai_high_hr;
        Context context8 = this.mContext;
        Objects.requireNonNull(context8);
        int i2 = R.color.pai_mid_hr;
        Context context9 = this.mContext;
        Objects.requireNonNull(context9);
        int i3 = R.color.pai_low_hr;
        Context context10 = this.mContext;
        Objects.requireNonNull(context10);
        int i4 = R.color.gray_fa;
        this.lineColor = new int[]{ContextCompat.getColor(context7, i), ContextCompat.getColor(context8, i2), ContextCompat.getColor(context9, i3), ContextCompat.getColor(context10, i4)};
        Context context11 = this.mContext;
        Objects.requireNonNull(context11);
        Context context12 = this.mContext;
        Objects.requireNonNull(context12);
        Context context13 = this.mContext;
        Objects.requireNonNull(context13);
        Context context14 = this.mContext;
        Objects.requireNonNull(context14);
        this.rectColor = new int[]{ViewExKt.addAlpha(ContextCompat.getColor(context11, i), 0.1d), ViewExKt.addAlpha(ContextCompat.getColor(context12, i2), 0.1d), ViewExKt.addAlpha(ContextCompat.getColor(context13, i3), 0.1d), ViewExKt.addAlpha(ContextCompat.getColor(context14, i4), 0.1d)};
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (getLayoutParams().width == -2 && getLayoutParams().height == -2) {
            setMeasuredDimension(400, 400);
        } else if (getLayoutParams().width == -2) {
            setMeasuredDimension(400, size2);
        } else if (getLayoutParams().height == -2) {
            setMeasuredDimension(size, 400);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        this.mWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        this.mHeight = measuredHeight;
        this.mViewHeight = measuredHeight - ViewExKt.dip2px(this, this.BOTTOM_HEIGHT);
        float fDip2px = this.mWidth - ViewExKt.dip2px(this, this.END_WIDTH);
        this.mViewWidth = fDip2px;
        this.mItemWidth = fDip2px / this.HEART_TOTAL;
    }

    public final void setData(@Nullable SparseArray<ChartData> data, @NotNull int[] hrTagValue) {
        this.mData = data;
        this.mLineColors = null;
        this.mRectColors = null;
        this.mPos = null;
        this.mHrTagValue = hrTagValue;
        invalidate();
    }

    @JvmOverloads
    public PaiDayHeartRateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.HEART_TOTAL = 288;
        this.BOTTOM_HEIGHT = 26;
        this.END_WIDTH = 35;
        this.mLineWidth = 1;
        this.mMaxHr = m.d;
        setWillNotDraw(false);
        initView(context, attributeSet, i);
        this.isRtl = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
