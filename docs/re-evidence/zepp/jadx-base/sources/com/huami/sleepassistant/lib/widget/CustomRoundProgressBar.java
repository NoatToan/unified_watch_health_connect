package com.huami.sleepassistant.lib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.lib.R;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.Regex;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010n\u001a\u00020m\u0012\u0006\u0010p\u001a\u00020o¢\u0006\u0004\bq\u0010rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0014J(\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0016\u0010&\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0016\u0010(\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0018\u0010)\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010+\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u0017R\u0016\u0010-\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0017R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001dR\u0018\u00101\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010!R\u0016\u00103\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\u0017R\u0016\u00105\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u0017R\u0016\u00107\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\u001dR\u0018\u00109\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010!R\u0016\u0010;\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\u0017R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010\u001dR\u0016\u0010D\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\u0017R\u0016\u0010F\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010\u001dR\u0018\u0010H\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010!R\u0016\u0010I\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0016\u0010K\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010\u001dR\u0016\u0010M\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010\u001dR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010!R$\u0010T\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010Y\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR$\u0010\\\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010a\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010V\"\u0004\bc\u0010XR$\u0010d\u001a\u00020\u00162\u0006\u0010d\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010^\"\u0004\bf\u0010`R$\u0010g\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010V\"\u0004\bi\u0010XR$\u0010j\u001a\u00020\u00162\u0006\u0010j\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010^\"\u0004\bl\u0010`¨\u0006s"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/CustomRoundProgressBar;", "Landroid/widget/ImageView;", "", "a", "b", "", "getBackgroundColor", b.H, "setBackgroundColor", "textColor", "setTextColor", "Landroid/graphics/Canvas;", "canvas", "onDraw", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "w", "h", "oldw", "oldh", "onSizeChanged", "", "F", "mActualRadius", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "mArcBound", "c", LogUtil.I, "mBackgroundColor", "Landroid/graphics/Paint;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Paint;", "mBackgroundPaint", "e", "mBound", "f", "mProgress", "g", "mProgressColor", "mProgressPaint", "i", "mProgressWidth", z.j, "mRadius", hl.k, "mStrokeColor", "l", "mStrokePaint", "m", "mStrokeWidth", GoogleApiAvailabilityLight.b, "mSweepAngle", "o", "mTextColor", b.r, "mTextPaint", DTransferConstants.SEARCH_KEY, "mTextSize", "", "", "r", "[Ljava/lang/String;", "lines", SOAP.XMLNS, "total", "t", "mProgressBackgroundWidth", "u", "mProgressBackgroundColor", "v", "mProgressBackgroundPaint", "mSizeWidth", "x", "mSizeHeight", "y", "centerDrawableId", "Landroid/graphics/Bitmap;", "z", "Landroid/graphics/Bitmap;", "centerImg", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "imgPaint", "progress", "getProgress", "()I", "setProgress", "(I)V", "progressBackgroundColor", "getProgressBackgroundColor", "setProgressBackgroundColor", "progressBackgroundWidth", "getProgressBackgroundWidth", "()F", "setProgressBackgroundWidth", "(F)V", "progressColor", "getProgressColor", "setProgressColor", "progressWidth", "getProgressWidth", "setProgressWidth", "strokeColor", "getStrokeColor", "setStrokeColor", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CustomRoundProgressBar extends ImageView {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private Paint imgPaint;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float mActualRadius;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private RectF mArcBound;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mBackgroundColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Paint mBackgroundPaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private RectF mBound;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mProgress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mProgressColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Paint mProgressPaint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float mProgressWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float mRadius;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mStrokeColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Paint mStrokePaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float mStrokeWidth;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float mSweepAngle;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int mTextColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private Paint mTextPaint;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float mTextSize;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private String[] lines;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int total;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private float mProgressBackgroundWidth;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private int mProgressBackgroundColor;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    private Paint mProgressBackgroundPaint;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int mSizeWidth;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int mSizeHeight;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int centerDrawableId;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private Bitmap centerImg;

    public CustomRoundProgressBar(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        List listEmptyList;
        super(context, attributeSet);
        this.mActualRadius = 345.0f;
        this.mProgressColor = -16777216;
        this.mRadius = 345.0f;
        this.mStrokeColor = 36557;
        this.mStrokeWidth = 3.0f;
        this.mTextColor = -4539718;
        this.mTextSize = 45.0f;
        this.total = 100;
        this.mProgressBackgroundWidth = 10.0f;
        this.mProgressBackgroundColor = DefaultTimeBar.DEFAULT_UNPLAYED_COLOR;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SlsCustomRoundProgressBar, 0, 0);
        this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarBackgroundColor, this.mBackgroundColor);
        this.mStrokeColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarStrokeColor, this.mStrokeColor);
        this.mProgress = typedArrayObtainStyledAttributes.getInt(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarProgress, this.mProgress);
        this.mProgressColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarProgressColor, this.mProgressColor);
        this.mProgressWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarProgressWidth, this.mProgressWidth);
        this.total = typedArrayObtainStyledAttributes.getInt(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarTotal, this.total);
        this.mStrokeWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarStrokeWidth, this.mStrokeWidth);
        this.mRadius = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarRadius, this.mRadius);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarText);
        this.mTextSize = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarTextSize, this.mTextSize);
        this.mTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarTextColor, this.mTextColor);
        if (string != null) {
            List<String> listSplit = new Regex("\n").split(string, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        break;
                    } else {
                        if (!(listIterator.previous().length() == 0)) {
                            listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                break;
            }
            Object[] array = listEmptyList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            this.lines = (String[]) array;
        }
        this.mProgressBackgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarProgressBgColor, this.mProgressBackgroundColor);
        this.mProgressBackgroundWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarProgressBgWidth, this.mProgressBackgroundWidth);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SlsCustomRoundProgressBar_SlsRoundProgressBarCenterDrawable, this.centerDrawableId);
        this.centerDrawableId = resourceId;
        if (resourceId != 0) {
            this.centerImg = BitmapFactory.decodeResource(getResources(), this.centerDrawableId);
        }
        typedArrayObtainStyledAttributes.recycle();
        b();
        a();
    }

    private final void a() {
        this.mBackgroundPaint.setColor(this.mBackgroundColor);
        this.mStrokePaint.setColor(this.mStrokeColor);
        this.mStrokePaint.setStrokeWidth(this.mStrokeWidth);
        this.mProgressPaint.setColor(this.mProgressColor);
        this.mProgressPaint.setStrokeWidth(this.mProgressWidth);
        this.mTextPaint.setColor(this.mTextColor);
        this.mTextPaint.setTextSize(this.mTextSize);
        this.mSweepAngle = (this.mProgress / this.total) * 360;
        this.mProgressBackgroundPaint.setStrokeWidth(this.mProgressBackgroundWidth);
        this.mProgressBackgroundPaint.setColor(this.mProgressBackgroundColor);
    }

    private final void b() {
        Paint paint = new Paint();
        this.mBackgroundPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.mStrokePaint = paint2;
        paint2.setAntiAlias(true);
        this.mStrokePaint.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.mProgressPaint = paint3;
        paint3.setAntiAlias(true);
        this.mProgressPaint.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.mTextPaint = paint4;
        paint4.setTextAlign(Paint.Align.CENTER);
        Paint paint5 = new Paint();
        this.mProgressBackgroundPaint = paint5;
        paint5.setAntiAlias(true);
        this.mProgressBackgroundPaint.setStyle(Paint.Style.STROKE);
        this.imgPaint = new Paint();
    }

    public void _$_clearFindViewByIdCache() {
    }

    /* JADX INFO: renamed from: getBackgroundColor, reason: from getter */
    public final int getMBackgroundColor() {
        return this.mBackgroundColor;
    }

    /* JADX INFO: renamed from: getProgress, reason: from getter */
    public final int getMProgress() {
        return this.mProgress;
    }

    /* JADX INFO: renamed from: getProgressBackgroundColor, reason: from getter */
    public final int getMProgressBackgroundColor() {
        return this.mProgressBackgroundColor;
    }

    /* JADX INFO: renamed from: getProgressBackgroundWidth, reason: from getter */
    public final float getMProgressBackgroundWidth() {
        return this.mProgressBackgroundWidth;
    }

    /* JADX INFO: renamed from: getProgressColor, reason: from getter */
    public final int getMProgressColor() {
        return this.mProgressColor;
    }

    /* JADX INFO: renamed from: getProgressWidth, reason: from getter */
    public final float getMProgressWidth() {
        return this.mProgressWidth;
    }

    /* JADX INFO: renamed from: getStrokeColor, reason: from getter */
    public final int getMStrokeColor() {
        return this.mStrokeColor;
    }

    /* JADX INFO: renamed from: getStrokeWidth, reason: from getter */
    public final float getMStrokeWidth() {
        return this.mStrokeWidth;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        a();
        canvas.drawOval(this.mBound, this.mBackgroundPaint);
        if (this.mProgress == 0) {
            canvas.drawCircle(this.mSizeWidth, this.mSizeHeight, this.mActualRadius, this.mStrokePaint);
        } else {
            canvas.drawCircle(this.mSizeWidth, this.mSizeHeight, this.mActualRadius, this.mProgressBackgroundPaint);
            canvas.drawArc(this.mArcBound, -90.0f, this.mSweepAngle, false, this.mProgressPaint);
        }
        String[] strArr = this.lines;
        if (strArr != null) {
            int i = 0;
            if (!(strArr.length == 0)) {
                float f = 2;
                float fAscent = (this.mSizeHeight - ((this.mTextPaint.ascent() + this.mTextPaint.descent()) / f)) - (((this.lines.length - 1) * (this.mTextPaint.descent() - this.mTextPaint.ascent())) / f);
                String[] strArr2 = this.lines;
                int length = strArr2.length;
                while (i < length) {
                    String str = strArr2[i];
                    i++;
                    if (str != null) {
                        canvas.drawText(str, this.mSizeWidth, fAscent, this.mTextPaint);
                        fAscent += this.mTextPaint.descent() - this.mTextPaint.ascent();
                    }
                }
                return;
            }
        }
        if (this.centerImg != null) {
            canvas.drawBitmap(this.centerImg, (getWidth() - this.centerImg.getWidth()) / 2, (getHeight() - this.centerImg.getHeight()) / 2, this.imgPaint);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iMax = (int) ((this.mRadius * 2) + Math.max(this.mProgressWidth, this.mStrokeWidth));
        setMeasuredDimension(View.resolveSize(getPaddingLeft() + getPaddingRight() + iMax, widthMeasureSpec), View.resolveSize(getPaddingTop() + getPaddingBottom() + iMax, heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float fMax = Math.max(this.mProgressWidth, this.mStrokeWidth);
        float f = 2;
        this.mActualRadius = Math.min((((w - getPaddingLeft()) - getPaddingRight()) - fMax) / f, (((h - getPaddingTop()) - getPaddingBottom()) - fMax) / f);
        this.mSizeWidth = w / 2;
        this.mSizeHeight = h / 2;
        int i = this.mSizeWidth;
        float f2 = this.mActualRadius;
        int i2 = this.mSizeHeight;
        this.mBound = new RectF(i - f2, i2 - f2, i + f2, i2 + f2);
        int i3 = this.mSizeWidth;
        float f3 = this.mActualRadius;
        int i4 = this.mSizeHeight;
        this.mArcBound = new RectF(i3 - f3, i4 - f3, i3 + f3, i4 + f3);
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        this.mBackgroundColor = backgroundColor;
        invalidate();
    }

    public final void setProgress(int i) {
        this.mProgress = i;
        invalidate();
    }

    public final void setProgressBackgroundColor(int i) {
        this.mProgressBackgroundColor = i;
        invalidate();
    }

    public final void setProgressBackgroundWidth(float f) {
        this.mProgressBackgroundWidth = f;
        invalidate();
    }

    public final void setProgressColor(int i) {
        this.mProgressColor = i;
        invalidate();
    }

    public final void setProgressWidth(float f) {
        this.mProgressWidth = f;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.mStrokeColor = i;
        invalidate();
    }

    public final void setStrokeWidth(float f) {
        this.mStrokeWidth = f;
        invalidate();
    }

    public final void setTextColor(int textColor) {
        this.mTextColor = textColor;
        invalidate();
    }
}
