package com.xiaomi.fitness.health.sleep.view.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.iji;
import defpackage.pni;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 72\u00020\u0001:\u0003789B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020%J\u0010\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0014J\u0010\u00100\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00101\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00102\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u0010H\u0002J\u0012\u00105\u001a\f\u0012\b\u0012\u00060'R\u00020\u000006H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\f\u0012\b\u0012\u00060\fR\u00020\u00000\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\f\u0012\b\u0012\u00060'R\u00020\u00000\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/view/widget/SleepStageProgressBarView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mPaint", "Landroid/graphics/Paint;", "mSortedPointModels", "", "Lcom/xiaomi/fitness/health/sleep/view/widget/SleepStageProgressBarView$PointModel;", "destRect", "Landroid/graphics/Rect;", "totalSleepSegmentDurationInSec", "", "sleepSegmentStartTime", "goToBedTagBitmap", "Landroid/graphics/Bitmap;", "fallAsleepBitmap", "wakeUpBitmap", "progressBarPaint", "barY", "", "tagIconHalfWidth", "", "halfProgressBarWidth", "rectF", "Landroid/graphics/RectF;", "mTextPaint", "Landroid/text/TextPaint;", "validWidth", "screenStartOffset", "roundRectRadius", "topTagHeight", "mSegmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "barModelList", "Lcom/xiaomi/fitness/health/sleep/view/widget/SleepStageProgressBarView$BarModel;", "lightPurple", "mediumPurple", "updateSleepSegmentReport", "", "segmentReport", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawStageProgressBar", "drawStageBottomText", "drawStageTopTag", "getStartXOffsetRatioByTimestamp", "timestampInSec", "getBarModelList", "", "Companion", "PointModel", "BarModel", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepStageProgressBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepStageProgressBarView.kt\ncom/xiaomi/fitness/health/sleep/view/widget/SleepStageProgressBarView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,424:1\n1863#2,2:425\n1053#2:427\n1872#2,3:432\n1863#2,2:435\n1872#2,3:437\n1872#2,3:440\n1872#2,3:443\n1053#2:446\n1863#2,2:447\n375#3,2:428\n387#3,2:430\n*S KotlinDebug\n*F\n+ 1 SleepStageProgressBarView.kt\ncom/xiaomi/fitness/health/sleep/view/widget/SleepStageProgressBarView\n*L\n135#1:425,2\n144#1:427\n169#1:432,3\n319#1:435,2\n328#1:437,3\n388#1:440,3\n262#1:443,3\n292#1:446\n300#1:447,2\n154#1:428,2\n155#1:430,2\n*E\n"})
public final class SleepStageProgressBarView extends View {
    public static final int POINT_TYPE_FALL_ASLEEP_TIME = 1;
    public static final int POINT_TYPE_GET_UP_TIME = 3;
    public static final int POINT_TYPE_GO_TO_BED_TIME = 0;
    public static final int POINT_TYPE_WAKE_UP_TIME = 2;

    @NotNull
    public static final String TAG = "SleepStageProgressBarView";

    @NotNull
    private final List<BarModel> barModelList;
    private final float barY;

    @NotNull
    private final Rect destRect;

    @Nullable
    private Bitmap fallAsleepBitmap;

    @Nullable
    private Bitmap goToBedTagBitmap;
    private final int halfProgressBarWidth;
    private int lightPurple;

    @NotNull
    private Paint mPaint;

    @Nullable
    private SleepSegmentReport mSegmentReport;

    @NotNull
    private List<PointModel> mSortedPointModels;

    @NotNull
    private TextPaint mTextPaint;
    private int mediumPurple;

    @NotNull
    private Paint progressBarPaint;

    @NotNull
    private final RectF rectF;
    private float roundRectRadius;
    private int screenStartOffset;
    private long sleepSegmentStartTime;
    private final int tagIconHalfWidth;
    private int topTagHeight;
    private long totalSleepSegmentDurationInSec;
    private int validWidth;

    @Nullable
    private Bitmap wakeUpBitmap;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/view/widget/SleepStageProgressBarView$PointModel;", "", "timestampInSec", "", "pointType", "", "<init>", "(Lcom/xiaomi/fitness/health/sleep/view/widget/SleepStageProgressBarView;JI)V", "getTimestampInSec", "()J", "getPointType", "()I", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class PointModel {
        private final int pointType;
        private final long timestampInSec;

        public PointModel(long j, int i) {
            this.timestampInSec = j;
            this.pointType = i;
        }

        public final int getPointType() {
            return this.pointType;
        }

        public final long getTimestampInSec() {
            return this.timestampInSec;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepStageProgressBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mPaint = new Paint(1);
        this.mSortedPointModels = new ArrayList();
        this.destRect = new Rect();
        this.barY = ExtUtilsKt.getDp(38);
        this.tagIconHalfWidth = ExtUtilsKt.getDp(11);
        this.halfProgressBarWidth = ExtUtilsKt.getDp(5);
        this.rectF = new RectF();
        this.mTextPaint = new TextPaint();
        this.roundRectRadius = ExtUtilsKt.getDp(1);
        this.topTagHeight = ExtUtilsKt.getDp(31);
        this.barModelList = new ArrayList();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStrokeWidth(ExtUtilsKt.getDp(10));
        setWillNotDraw(false);
        this.goToBedTagBitmap = BitmapFactory.decodeResource(getResources(), pni.g2);
        this.fallAsleepBitmap = BitmapFactory.decodeResource(getResources(), pni.f2);
        this.wakeUpBitmap = BitmapFactory.decodeResource(getResources(), pni.h2);
        Paint paint = new Paint(1);
        this.progressBarPaint = paint;
        paint.setDither(true);
        this.progressBarPaint.setStrokeWidth(ExtUtilsKt.getDp(10));
        Paint paint2 = this.progressBarPaint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.progressBarPaint.setColor(this.lightPurple);
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.setDither(true);
        this.mTextPaint.setTypeface(Typeface.create("mipro-regular", 1));
        this.mTextPaint.setTextSize(ExtUtilsKt.getSp(12));
        this.mTextPaint.setColor(ApplicationExtKt.getApplication().getResources().getColor(iji.w3, null));
        this.mTextPaint.setStyle(style);
        this.lightPurple = getResources().getColor(iji.G1, null);
        this.mediumPurple = getResources().getColor(iji.F1, null);
    }

    private final void drawStageBottomText(Canvas canvas) {
        float sp = ExtUtilsKt.getSp(12);
        float sp2 = ExtUtilsKt.getSp(3);
        float sp3 = ExtUtilsKt.getSp(1);
        this.mTextPaint.setTextSize(sp);
        List<Pair<String, RectF>> listDrawStageBottomText$collectLabelBounds = drawStageBottomText$collectLabelBounds(this);
        while (drawStageBottomText$hasOverlap(listDrawStageBottomText$collectLabelBounds) && sp > sp2) {
            sp -= sp3;
            if (sp < sp2) {
                sp = sp2;
            }
            this.mTextPaint.setTextSize(sp);
            listDrawStageBottomText$collectLabelBounds = drawStageBottomText$collectLabelBounds(this);
        }
        Paint.FontMetrics fontMetrics = this.mTextPaint.getFontMetrics();
        float dp = this.barY + ExtUtilsKt.getDp(8) + (fontMetrics.descent - fontMetrics.ascent);
        Iterator<T> it = listDrawStageBottomText$collectLabelBounds.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            canvas.drawText((String) pair.component1(), ((RectF) pair.component2()).left, dp, this.mTextPaint);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    private static final List<Pair<String, RectF>> drawStageBottomText$collectLabelBounds(SleepStageProgressBarView sleepStageProgressBarView) {
        String hHmmLocalFormat;
        SleepSegmentReport sleepSegmentReport;
        Long goBedTime;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : sleepStageProgressBarView.barModelList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            BarModel barModel = (BarModel) obj;
            if (barModel.getStartPointType() != 2) {
                if (barModel.getStartPointType() != 0) {
                    hHmmLocalFormat = TimeDateUtil.getHHmmLocalFormat(barModel.getStartPointTimestampInSec());
                } else {
                    SleepSegmentReport sleepSegmentReport2 = sleepStageProgressBarView.mSegmentReport;
                    if ((sleepSegmentReport2 != null ? sleepSegmentReport2.getGoBedTime() : null) == null || !((sleepSegmentReport = sleepStageProgressBarView.mSegmentReport) == null || (goBedTime = sleepSegmentReport.getGoBedTime()) == null || goBedTime.longValue() != 0)) {
                        hHmmLocalFormat = "--:--";
                    } else {
                        hHmmLocalFormat = TimeDateUtil.getHHmmLocalFormat(barModel.getStartPointTimestampInSec());
                    }
                }
                float fMeasureText = sleepStageProgressBarView.mTextPaint.measureText(hHmmLocalFormat);
                int startPointType = barModel.getStartPointType();
                float startRatio = sleepStageProgressBarView.screenStartOffset + (barModel.getStartRatio() * sleepStageProgressBarView.validWidth) + ((startPointType == 0 || startPointType != 3) ? 0.0f : -fMeasureText);
                arrayList.add(TuplesKt.to(hHmmLocalFormat, new RectF(startRatio, 0.0f, fMeasureText + startRatio, 0.0f)));
            }
            if (i == sleepStageProgressBarView.barModelList.size() - 1) {
                String hHmmLocalFormat2 = TimeDateUtil.getHHmmLocalFormat(barModel.getEndPointTimestampInSec());
                float fMeasureText2 = sleepStageProgressBarView.mTextPaint.measureText(hHmmLocalFormat2);
                float f = (sleepStageProgressBarView.screenStartOffset + sleepStageProgressBarView.validWidth) - fMeasureText2;
                arrayList.add(TuplesKt.to(hHmmLocalFormat2, new RectF(f, 0.0f, fMeasureText2 + f, 0.0f)));
            }
            i = i2;
        }
        return CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.view.widget.SleepStageProgressBarView$drawStageBottomText$collectLabelBounds$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((RectF) ((Pair) t).getSecond()).left), Float.valueOf(((RectF) ((Pair) t2).getSecond()).left));
            }
        });
    }

    private static final boolean drawStageBottomText$hasOverlap(List<? extends Pair<String, ? extends RectF>> list) {
        Iterator<T> it = list.iterator();
        float f = -3.4028235E38f;
        while (it.hasNext()) {
            RectF rectF = (RectF) ((Pair) it.next()).component2();
            if (rectF.left - ExtUtilsKt.getDp(3) < f) {
                return true;
            }
            f = rectF.right;
        }
        return false;
    }

    private final void drawStageProgressBar(Canvas canvas) {
        float startRatio;
        int dp;
        float[] fArr;
        float startRatio2;
        int dp2;
        float f = 0.0f;
        int size = this.barModelList.size();
        int i = 0;
        for (Object obj : this.barModelList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            BarModel barModel = (BarModel) obj;
            if (i == 0 && size != 1) {
                float startRatio3 = (this.validWidth * barModel.getStartRatio()) + this.screenStartOffset;
                float endRatio = (this.validWidth * barModel.getEndRatio()) + this.screenStartOffset;
                RectF rectF = this.rectF;
                rectF.left = startRatio3;
                rectF.right = endRatio;
                float f2 = this.barY;
                int i3 = this.halfProgressBarWidth;
                rectF.top = f2 - i3;
                rectF.bottom = f2 + i3;
                Path path = new Path();
                path.addRoundRect(this.rectF, new float[]{i3, i3, f, f, f, f, i3, i3}, Path.Direction.CW);
                this.progressBarPaint.setColor(this.lightPurple);
                canvas.drawPath(path, this.progressBarPaint);
            } else if (i == 0 || i == size - 1) {
                if (i == size - 1) {
                    if (i == 1) {
                        startRatio = this.validWidth * barModel.getStartRatio();
                        dp = this.screenStartOffset;
                    } else {
                        startRatio = (this.validWidth * barModel.getStartRatio()) + this.screenStartOffset;
                        dp = ExtUtilsKt.getDp(1);
                    }
                    float f3 = startRatio + dp;
                    float endRatio2 = (this.validWidth * barModel.getEndRatio()) + this.screenStartOffset;
                    RectF rectF2 = this.rectF;
                    rectF2.left = f3;
                    rectF2.right = endRatio2;
                    float f4 = this.barY;
                    int i4 = this.halfProgressBarWidth;
                    rectF2.top = f4 - i4;
                    rectF2.bottom = f4 + i4;
                    if (i == 1) {
                        fArr = new float[]{f, f, i4, i4, i4, i4, f, f};
                    } else {
                        float f5 = this.roundRectRadius;
                        fArr = new float[]{f5, f5, i4, i4, i4, i4, f5, f5};
                    }
                    Path path2 = new Path();
                    path2.addRoundRect(this.rectF, fArr, Path.Direction.CW);
                    this.progressBarPaint.setColor(this.mediumPurple);
                    canvas.drawPath(path2, this.progressBarPaint);
                }
                i = i2;
                f = 0.0f;
            } else {
                if (i == 1) {
                    startRatio2 = this.validWidth * barModel.getStartRatio();
                    dp2 = this.screenStartOffset;
                } else {
                    startRatio2 = (this.validWidth * barModel.getStartRatio()) + this.screenStartOffset;
                    dp2 = ExtUtilsKt.getDp(1);
                }
                float f6 = startRatio2 + dp2;
                float endRatio3 = ((this.validWidth * barModel.getEndRatio()) + this.screenStartOffset) - ExtUtilsKt.getDp(1);
                RectF rectF3 = this.rectF;
                rectF3.left = f6;
                rectF3.right = endRatio3;
                float f7 = this.barY;
                int i5 = this.halfProgressBarWidth;
                rectF3.top = f7 - i5;
                rectF3.bottom = f7 + i5;
                this.progressBarPaint.setColor(this.mediumPurple);
                Path path3 = new Path();
                float f8 = this.roundRectRadius;
                path3.addRoundRect(this.rectF, new float[]{f, f, f8, f8, f8, f8, f, f}, Path.Direction.CW);
                this.progressBarPaint.setColor(this.mediumPurple);
                canvas.drawPath(path3, this.progressBarPaint);
            }
            i = i2;
            f = 0.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:30:0x0118  */
    /* JADX WARN: Code duplicated, block: B:35:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x011d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00d7, please report this as an issue */
    private final void drawStageTopTag(Canvas canvas) {
        Bitmap bitmap;
        int i;
        int dp;
        int i2;
        Bitmap bitmap2;
        int i3 = 0;
        for (Object obj : this.barModelList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            BarModel barModel = (BarModel) obj;
            int startPointType = barModel.getStartPointType();
            if (startPointType == 0) {
                bitmap = this.goToBedTagBitmap;
            } else if (startPointType != 1) {
                bitmap = startPointType != 3 ? null : this.wakeUpBitmap;
            } else {
                bitmap = this.fallAsleepBitmap;
            }
            int startPointType2 = barModel.getStartPointType();
            if (startPointType2 != 0) {
                if (startPointType2 != 3) {
                    i2 = -this.tagIconHalfWidth;
                } else {
                    i = this.tagIconHalfWidth * (-2);
                    dp = ExtUtilsKt.getDp(4);
                }
                float startRatio = this.screenStartOffset + (barModel.getStartRatio() * this.validWidth) + i2;
                float dp2 = ExtUtilsKt.getDp(22) + startRatio;
                Rect rect = this.destRect;
                rect.top = 0;
                rect.bottom = this.topTagHeight;
                rect.left = (int) startRatio;
                rect.right = (int) dp2;
                Logger.d(TAG, "drawStageTopTag bitmapStartX=" + startRatio + " bitmapEndX=" + dp2 + " top=" + ExtUtilsKt.getDp(57) + " bottom=" + ExtUtilsKt.getDp(150));
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, this.destRect, (Paint) null);
                }
                if (i3 == this.barModelList.size() - 1) {
                    bitmap2 = this.wakeUpBitmap;
                    int i5 = ((this.screenStartOffset + this.validWidth) - (this.tagIconHalfWidth * 2)) + 2;
                    int dp3 = ExtUtilsKt.getDp(22) + i5;
                    Rect rect2 = this.destRect;
                    rect2.top = 0;
                    rect2.bottom = this.topTagHeight;
                    rect2.left = i5;
                    rect2.right = dp3;
                    Logger.d(TAG, "drawStageTopTag endPointStartX=" + i5 + " endPointEndX=" + dp3);
                    if (bitmap2 != null) {
                        canvas.drawBitmap(bitmap2, (Rect) null, this.destRect, (Paint) null);
                    }
                }
                i3 = i4;
            } else {
                i = -this.tagIconHalfWidth;
                dp = ExtUtilsKt.getDp(8);
            }
            i2 = i + dp;
            float startRatio2 = this.screenStartOffset + (barModel.getStartRatio() * this.validWidth) + i2;
            float dp4 = ExtUtilsKt.getDp(22) + startRatio2;
            Rect rect3 = this.destRect;
            rect3.top = 0;
            rect3.bottom = this.topTagHeight;
            rect3.left = (int) startRatio2;
            rect3.right = (int) dp4;
            Logger.d(TAG, "drawStageTopTag bitmapStartX=" + startRatio2 + " bitmapEndX=" + dp4 + " top=" + ExtUtilsKt.getDp(57) + " bottom=" + ExtUtilsKt.getDp(150));
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.destRect, (Paint) null);
            }
            if (i3 == this.barModelList.size() - 1) {
                bitmap2 = this.wakeUpBitmap;
                int i6 = ((this.screenStartOffset + this.validWidth) - (this.tagIconHalfWidth * 2)) + 2;
                int dp5 = ExtUtilsKt.getDp(22) + i6;
                Rect rect4 = this.destRect;
                rect4.top = 0;
                rect4.bottom = this.topTagHeight;
                rect4.left = i6;
                rect4.right = dp5;
                Logger.d(TAG, "drawStageTopTag endPointStartX=" + i6 + " endPointEndX=" + dp5);
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, (Rect) null, this.destRect, (Paint) null);
                }
            }
            i3 = i4;
        }
    }

    private final List<BarModel> getBarModelList() {
        SleepStageProgressBarView sleepStageProgressBarView = this;
        ArrayList arrayList = new ArrayList();
        int size = sleepStageProgressBarView.mSortedPointModels.size();
        int i = 0;
        float f = 0.0f;
        for (Object obj : sleepStageProgressBarView.mSortedPointModels) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            PointModel pointModel = (PointModel) obj;
            Logger.d(TAG, "getBarPeriodList index=" + i + " timestamp=" + pointModel.getTimestampInSec() + " pointType=" + pointModel.getPointType());
            if (i != size - 1) {
                float startXOffsetRatioByTimestamp = sleepStageProgressBarView.getStartXOffsetRatioByTimestamp(sleepStageProgressBarView.mSortedPointModels.get(i2).getTimestampInSec());
                Logger.d(TAG, "getBarPeriodList curtStartXOffset=" + f + " nextStartXOffset=" + startXOffsetRatioByTimestamp);
                if (i == 0 && pointModel.getPointType() == 0 && sleepStageProgressBarView.mSortedPointModels.get(1).getPointType() == 1 && startXOffsetRatioByTimestamp - f < 0.15f) {
                    startXOffsetRatioByTimestamp = f + 0.15f;
                }
                float f2 = startXOffsetRatioByTimestamp;
                arrayList.add(new BarModel(f, f2, pointModel.getPointType(), pointModel.getTimestampInSec(), i == size + (-2) ? sleepStageProgressBarView.mSortedPointModels.get(i2).getTimestampInSec() : 0L));
                Logger.d(TAG, "getBarPeriodList prevRatio=" + f + " nextStartXOffsetRatio=" + f2);
                f = f2;
            }
            sleepStageProgressBarView = this;
            i = i2;
            size = size;
        }
        return arrayList;
    }

    private final float getStartXOffsetRatioByTimestamp(long timestampInSec) {
        long j = this.sleepSegmentStartTime;
        float f = (timestampInSec - j) / this.totalSleepSegmentDurationInSec;
        Logger.d(TAG, "getStartXOffsetByTimestamp timestampInSec=" + timestampInSec + " sleepSegmentStartTime=" + j);
        return f;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int paddingStart = getPaddingStart();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        this.screenStartOffset = paddingStart + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        int width = (getWidth() - this.screenStartOffset) - getPaddingEnd();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        this.validWidth = width - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
        drawStageProgressBar(canvas);
        drawStageTopTag(canvas);
        drawStageBottomText(canvas);
    }

    public final void updateSleepSegmentReport(@NotNull SleepSegmentReport segmentReport) {
        long bedTime;
        Long goBedTime;
        Intrinsics.checkNotNullParameter(segmentReport, "segmentReport");
        this.mSegmentReport = segmentReport;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        if (segmentReport.getGoBedTime() == null || ((goBedTime = segmentReport.getGoBedTime()) != null && goBedTime.longValue() == 0)) {
            bedTime = segmentReport.getBedTime() - ((long) (((double) segmentReport.getSleepDuration()) * 0.15d));
        } else {
            Long goBedTime2 = segmentReport.getGoBedTime();
            bedTime = goBedTime2 != null ? goBedTime2.longValue() : segmentReport.getBedTime() - 10;
        }
        arrayList.add(new PointModel(bedTime, 0));
        arrayList.add(new PointModel(segmentReport.getBedTime(), 1));
        List<SleepStateItem> sleepItems = segmentReport.getSleepItems();
        if (sleepItems != null) {
            for (SleepStateItem sleepStateItem : sleepItems) {
                if (sleepStateItem.getSleepState() == 5) {
                    arrayList.add(new PointModel(sleepStateItem.getStartTime(), 2));
                }
            }
        }
        arrayList.add(new PointModel(segmentReport.getWakeupTime(), 3));
        this.mSortedPointModels.clear();
        this.mSortedPointModels.addAll(CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.view.widget.SleepStageProgressBarView$updateSleepSegmentReport$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SleepStageProgressBarView.PointModel) t).getTimestampInSec()), Long.valueOf(((SleepStageProgressBarView.PointModel) t2).getTimestampInSec()));
            }
        }));
        this.sleepSegmentStartTime = bedTime;
        this.totalSleepSegmentDurationInSec = segmentReport.getWakeupTime() - this.sleepSegmentStartTime;
        this.barModelList.clear();
        this.barModelList.addAll(getBarModelList());
        invalidate();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/view/widget/SleepStageProgressBarView$BarModel;", "", "startRatio", "", "endRatio", "startPointType", "", "startPointTimestampInSec", "", "endPointTimestampInSec", "<init>", "(Lcom/xiaomi/fitness/health/sleep/view/widget/SleepStageProgressBarView;FFIJJ)V", "getStartRatio", "()F", "getEndRatio", "getStartPointType", "()I", "getStartPointTimestampInSec", "()J", "getEndPointTimestampInSec", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class BarModel {
        private final long endPointTimestampInSec;
        private final float endRatio;
        private final long startPointTimestampInSec;
        private final int startPointType;
        private final float startRatio;

        public BarModel(float f, float f2, int i, long j, long j2) {
            this.startRatio = f;
            this.endRatio = f2;
            this.startPointType = i;
            this.startPointTimestampInSec = j;
            this.endPointTimestampInSec = j2;
        }

        public final long getEndPointTimestampInSec() {
            return this.endPointTimestampInSec;
        }

        public final float getEndRatio() {
            return this.endRatio;
        }

        public final long getStartPointTimestampInSec() {
            return this.startPointTimestampInSec;
        }

        public final int getStartPointType() {
            return this.startPointType;
        }

        public final float getStartRatio() {
            return this.startRatio;
        }

        public /* synthetic */ BarModel(SleepStageProgressBarView sleepStageProgressBarView, float f, float f2, int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, i, j, (i2 & 16) != 0 ? 0L : j2);
        }
    }
}
