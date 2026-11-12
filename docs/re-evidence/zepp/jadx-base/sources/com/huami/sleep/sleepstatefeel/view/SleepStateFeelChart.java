package com.huami.sleep.sleepstatefeel.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.model.DataConstant;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.sleep.util.ExteranelKt;
import com.huami.sleep.util.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.h;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010[\u001a\u00020Z\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\\\u0012\b\b\u0002\u0010^\u001a\u00020\u0004¢\u0006\u0004\b_\u0010`J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u001b\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0016\u001a\u00020\b22\u0010\u0014\u001a.\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00120\u0012j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0013`\u00132\u0006\u0010\u0015\u001a\u00020\u000eJ\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0014J\u0012\u0010\u001a\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001c\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010(\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\"\u00105\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u00104R\"\u0010@\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\"\u0010H\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010;\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R\"\u0010L\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010;\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R\"\u0010P\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010;\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R\"\u0010T\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010;\u001a\u0004\bR\u0010=\"\u0004\bS\u0010?RN\u0010W\u001a:\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00130\u0012j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0013`\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR&\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0012j\b\u0012\u0004\u0012\u00020\u000e`\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010V¨\u0006a"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/view/SleepStateFeelChart;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "yIndex", "left", "resId", "", "a", "", "getViewHeight", "getMaxSize", "", "", "data", "setXAxis", "([Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "yData", "type", "setData", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "Ljava/lang/String;", "mType", "b", "getMTag", "()Ljava/lang/String;", "mTag", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "textPaint", GoogleApiAvailabilityLight.a, "picPaint", "e", "circleBgPaint", "Landroid/graphics/Rect;", "f", "Landroid/graphics/Rect;", "srcRect", "g", "dstRect", "h", LogUtil.I, "getMWidth", "()I", "setMWidth", "(I)V", "mWidth", "i", "getMHeight", "setMHeight", "mHeight", z.j, "F", "getYDivider", "()F", "setYDivider", "(F)V", "yDivider", hl.k, "getPicHeight", "setPicHeight", "picHeight", "l", "getIconHeight", "setIconHeight", "iconHeight", "m", "getIconOffsetHeight", "setIconOffsetHeight", "iconOffsetHeight", GoogleApiAvailabilityLight.b, "getBottomHeight", "setBottomHeight", "bottomHeight", "o", "getEmptyHeight", "setEmptyHeight", "emptyHeight", com.google.android.exoplayer2.text.ttml.b.r, "Ljava/util/ArrayList;", "mData", DTransferConstants.SEARCH_KEY, "xAxis", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepStateFeelChart extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private String mType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String mTag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Paint textPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Paint picPaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Paint circleBgPaint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Rect srcRect;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Rect dstRect;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mHeight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float yDivider;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float picHeight;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float iconHeight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float iconOffsetHeight;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private float bottomHeight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private float emptyHeight;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<ArrayList<Integer>> mData;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> xAxis;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "size  " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return SleepStateFeelChart.this.getMHeight() + "  " + SleepStateFeelChart.this.getMWidth();
        }
    }

    @JvmOverloads
    public SleepStateFeelChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SleepStateFeelChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SleepStateFeelChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a(Canvas canvas, int yIndex, int left, int resId) {
        float f = (this.mHeight - ((this.yDivider + this.picHeight) * yIndex)) - this.bottomHeight;
        Bitmap bitmapVectorDrawableToBitmap = ChartTransmitUtil.INSTANCE.vectorDrawableToBitmap(getContext(), resId);
        this.srcRect.set(0, 0, bitmapVectorDrawableToBitmap.getWidth(), bitmapVectorDrawableToBitmap.getHeight());
        String str = this.mType;
        if (Intrinsics.areEqual(str, DataConstant.TYPE_SLEEP_STATE)) {
            Rect rect = this.dstRect;
            float f2 = left;
            float f3 = this.iconOffsetHeight;
            float f4 = this.iconHeight;
            rect.set((int) (f2 + f3), (int) (((int) f) + f3), (int) (f2 + f4 + f3), (int) (f3 + f + f4));
            if (canvas != null) {
                float f5 = this.picHeight;
                float f6 = 2;
                canvas.drawCircle(f2 + (f5 / f6), f + (f5 / f6), f5 / f6, this.circleBgPaint);
            }
        } else if (Intrinsics.areEqual(str, DataConstant.TYPE_SLEEP_FEEL)) {
            float f7 = this.picHeight;
            this.dstRect.set(left, (int) f, (int) (left + f7), (int) (f + f7));
        }
        if (canvas == null) {
            return;
        }
        canvas.drawBitmap(bitmapVectorDrawableToBitmap, this.srcRect, this.dstRect, this.picPaint);
    }

    private final int getMaxSize() {
        Ref.IntRef intRef = new Ref.IntRef();
        int size = this.mData.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (this.mData.get(i) != null) {
                    if (this.mData.get(i).size() > intRef.element) {
                        intRef.element = this.mData.get(i).size();
                    }
                    HMLog.verbose(this.mTag, new a(intRef));
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return intRef.element;
    }

    private final float getViewHeight() {
        int maxSize = getMaxSize();
        return maxSize == 0 ? this.emptyHeight : (maxSize * (this.picHeight + this.yDivider)) + this.bottomHeight;
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final float getBottomHeight() {
        return this.bottomHeight;
    }

    public final float getEmptyHeight() {
        return this.emptyHeight;
    }

    public final float getIconHeight() {
        return this.iconHeight;
    }

    public final float getIconOffsetHeight() {
        return this.iconOffsetHeight;
    }

    public final int getMHeight() {
        return this.mHeight;
    }

    @NotNull
    public final String getMTag() {
        return this.mTag;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    public final float getPicHeight() {
        return this.picHeight;
    }

    public final float getYDivider() {
        return this.yDivider;
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.textPaint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ExteranelKt.getDp(1.0f));
        paint.setColor(ContextCompat.getColor(getContext(), R.color.s4));
        Resources resources = getContext().getResources();
        int i = R.dimen.sleep_state_feel_bottom_text_size;
        resources.getDimension(i);
        if (canvas != null) {
            int i2 = this.mHeight;
            float f = this.bottomHeight;
            canvas.drawLine(0.0f, i2 - f, this.mWidth, i2 - f, this.textPaint);
        }
        Paint paint2 = this.textPaint;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setStrokeWidth(3.0f);
        paint2.setColor(ContextCompat.getColor(getContext(), R.color.s3));
        getContext().getResources().getDimension(i);
        int size = this.mData.size() - 1;
        if (size >= 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                float f2 = this.picHeight;
                double size2 = (((double) f2) * 0.5d) + ((double) ((i3 * (this.mWidth - f2)) / (this.xAxis.size() - 1)));
                if (canvas != null) {
                    canvas.drawText(this.xAxis.get(i3), (float) size2, (this.mHeight - this.bottomHeight) + ViewUtils.dp2px(getContext(), 15.0f), this.textPaint);
                }
                if (i4 > size) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        if (getMaxSize() == 0) {
            Paint paint3 = this.textPaint;
            Context context = getContext();
            int i5 = R.color.s1;
            paint3.setColor(ContextCompat.getColor(context, i5));
            Paint paint4 = this.textPaint;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setStrokeWidth(3.0f);
            paint4.setColor(ContextCompat.getColor(getContext(), i5));
            getContext().getResources().getDimension(R.dimen.slp_size_13sp);
            if (canvas == null) {
                return;
            }
            canvas.drawText(getContext().getResources().getString(R.string.sleep_no_record), this.mWidth / 2.0f, this.textPaint.getTextSize(), this.textPaint);
            return;
        }
        int size3 = this.mData.size() - 1;
        if (size3 < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            int i7 = i6 + 1;
            ArrayList<Integer> arrayList = this.mData.get(i6);
            if (!(arrayList == null || arrayList.isEmpty())) {
                float size4 = (i6 * (this.mWidth - this.picHeight)) / (this.xAxis.size() - 1);
                int size5 = arrayList.size() - 1;
                if (size5 >= 0) {
                    int i8 = 0;
                    while (true) {
                        int i9 = i8 + 1;
                        a(canvas, i9, (int) size4, arrayList.get(i8).intValue());
                        if (i9 > size5) {
                            break;
                        } else {
                            i8 = i9;
                        }
                    }
                }
            }
            if (i7 > size3) {
                return;
            } else {
                i6 = i7;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mHeight = View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824 ? getMeasuredHeight() : (int) getViewHeight();
        int measuredWidth = getMeasuredWidth();
        this.mWidth = measuredWidth;
        setMeasuredDimension(measuredWidth, this.mHeight);
        HMLog.verbose(this.mTag, new b());
    }

    public final void setBottomHeight(float f) {
        this.bottomHeight = f;
    }

    public final void setData(@NotNull ArrayList<ArrayList<Integer>> yData, @NotNull String type) {
        if (yData.isEmpty()) {
            return;
        }
        ArrayList<ArrayList<Integer>> arrayList = this.mData;
        arrayList.clear();
        arrayList.addAll(yData);
        this.mType = type;
        requestLayout();
        invalidate();
    }

    public final void setEmptyHeight(float f) {
        this.emptyHeight = f;
    }

    public final void setIconHeight(float f) {
        this.iconHeight = f;
    }

    public final void setIconOffsetHeight(float f) {
        this.iconOffsetHeight = f;
    }

    public final void setMHeight(int i) {
        this.mHeight = i;
    }

    public final void setMWidth(int i) {
        this.mWidth = i;
    }

    public final void setPicHeight(float f) {
        this.picHeight = f;
    }

    public final void setXAxis(@NotNull String[] data) {
        ArrayList<String> arrayList = this.xAxis;
        arrayList.clear();
        h.addAll(arrayList, data);
        requestLayout();
        invalidate();
    }

    public final void setYDivider(float f) {
        this.yDivider = f;
    }

    @JvmOverloads
    public SleepStateFeelChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mType = "";
        this.mTag = "SleepStateFeelChart";
        Paint paint = new Paint(1);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(ViewExKt.addAlpha(ContextCompat.getColor(context, R.color.s44), 0.26d));
        paint.setTextSize(context.getResources().getDimension(R.dimen.sleep_state_feel_bottom_text_size));
        paint.setStrokeWidth(3.0f);
        paint.setAntiAlias(true);
        Unit unit = Unit.INSTANCE;
        this.textPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setAntiAlias(true);
        this.picPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setColor(ContextCompat.getColor(context, R.color.s4));
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        paint3.setAntiAlias(true);
        this.circleBgPaint = paint3;
        this.srcRect = new Rect(0, 0, 0, 0);
        this.dstRect = new Rect(0, 0, 0, 0);
        this.yDivider = ViewUtils.dp2px(context, 10.0f);
        this.picHeight = ViewUtils.dp2px(context, 44.0f);
        this.iconHeight = ViewUtils.dp2px(context, 30.0f);
        this.iconOffsetHeight = ViewUtils.dp2px(context, 7.0f);
        this.bottomHeight = ViewUtils.dp2px(context, 20.0f);
        this.emptyHeight = ViewUtils.dp2px(context, 75.0f);
        this.mData = new ArrayList<>();
        this.xAxis = new ArrayList<>();
    }
}
