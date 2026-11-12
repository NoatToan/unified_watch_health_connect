package com.mi.health.sleep.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.xiaomi.fit.data.common.data.annotation.SleepState;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import defpackage.cli;
import defpackage.rmi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u001e\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0012\u0010!\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/mi/health/sleep/widget/SleepWidgetHelper;", "", "<init>", "()V", "TAG", "", "context", "Landroid/content/Context;", "paint", "Landroid/graphics/Paint;", "mainArea", "Landroid/graphics/RectF;", "outRoundPath", "Landroid/graphics/Path;", "innerPath", "radius", "", "width", "height", "getSleepStateBitmap", "Landroid/graphics/Bitmap;", "ctx", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "doDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawSleepTimes", "segList", "", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "drawSleepStates", "getStateColor", "", "state", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepWidgetHelper {
    private Context context;
    private float height;
    private float radius;
    private float width;

    @NotNull
    private final String TAG = SleepWidgetConstants.TAG;

    @NotNull
    private final Paint paint = new Paint(1);

    @NotNull
    private final RectF mainArea = new RectF();

    @NotNull
    private final Path outRoundPath = new Path();

    @NotNull
    private final Path innerPath = new Path();

    private final void doDraw(Canvas canvas, AllDaySleepReport report) {
        List<SleepSegmentReport> sleepSegments = report.getSleepSegments();
        Intrinsics.checkNotNull(sleepSegments);
        this.outRoundPath.reset();
        Path path = this.outRoundPath;
        RectF rectF = this.mainArea;
        float f = this.radius;
        path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        Paint paint = this.paint;
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        paint.setColor(context.getColor(cli.m));
        canvas.drawPath(this.outRoundPath, this.paint);
        if (sleepSegments.size() == 1) {
            drawSleepStates(canvas, sleepSegments);
        } else {
            drawSleepTimes(canvas, sleepSegments);
        }
    }

    private final void drawSleepStates(Canvas canvas, List<SleepSegmentReport> segList) {
        Context context;
        long jMin = Long.MAX_VALUE;
        long jMax = Long.MIN_VALUE;
        for (SleepSegmentReport sleepSegmentReport : segList) {
            jMin = Math.min(jMin, sleepSegmentReport.getBedTime());
            jMax = Math.max(jMax, sleepSegmentReport.getWakeupTime());
        }
        RectF rectF = this.mainArea;
        float f = rectF.left;
        float fWidth = rectF.width() / (jMax - jMin);
        for (SleepSegmentReport sleepSegmentReport2 : segList) {
            List<SleepStateItem> sleepItems = sleepSegmentReport2.getSleepItems();
            List<SleepStateItem> list = sleepItems;
            if (list == null || list.isEmpty()) {
                this.innerPath.reset();
                this.innerPath.addRect(new RectF(((sleepSegmentReport2.getBedTime() - jMin) * fWidth) + f, 0.0f, ((sleepSegmentReport2.getWakeupTime() - jMin) * fWidth) + f, this.height), Path.Direction.CCW);
                this.outRoundPath.op(this.innerPath, Path.Op.INTERSECT);
                Paint paint = this.paint;
                Context context2 = this.context;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                } else {
                    context = context2;
                }
                paint.setColor(context.getColor(cli.i));
                canvas.drawPath(this.outRoundPath, this.paint);
            } else {
                for (SleepStateItem sleepStateItem : sleepItems) {
                    this.outRoundPath.reset();
                    Path path = this.outRoundPath;
                    RectF rectF2 = this.mainArea;
                    float f2 = this.radius;
                    Path.Direction direction = Path.Direction.CCW;
                    path.addRoundRect(rectF2, f2, f2, direction);
                    this.innerPath.reset();
                    this.innerPath.addRect(new RectF(((sleepStateItem.getStartTime() - jMin) * fWidth) + f, 0.0f, ((sleepStateItem.getEndTime() - jMin) * fWidth) + f, this.height), direction);
                    this.outRoundPath.op(this.innerPath, Path.Op.INTERSECT);
                    Paint paint2 = this.paint;
                    Context context3 = this.context;
                    if (context3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("context");
                        context3 = null;
                    }
                    paint2.setColor(context3.getColor(getStateColor(sleepStateItem.getSleepState())));
                    canvas.drawPath(this.outRoundPath, this.paint);
                }
            }
        }
    }

    private final void drawSleepTimes(Canvas canvas, List<SleepSegmentReport> segList) {
        this.innerPath.reset();
        float f = this.mainArea.left;
        long jMin = Long.MAX_VALUE;
        long jMax = Long.MIN_VALUE;
        for (SleepSegmentReport sleepSegmentReport : segList) {
            jMin = Math.min(jMin, sleepSegmentReport.getBedTime());
            jMax = Math.max(jMax, sleepSegmentReport.getWakeupTime());
        }
        float fWidth = this.mainArea.width() / (jMax - jMin);
        for (SleepSegmentReport sleepSegmentReport2 : segList) {
            this.innerPath.addRect(new RectF(((sleepSegmentReport2.getBedTime() - jMin) * fWidth) + f, 0.0f, ((sleepSegmentReport2.getWakeupTime() - jMin) * fWidth) + f, this.height), Path.Direction.CCW);
        }
        this.outRoundPath.op(this.innerPath, Path.Op.INTERSECT);
        Paint paint = this.paint;
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        paint.setColor(context.getColor(cli.i));
        canvas.drawPath(this.outRoundPath, this.paint);
    }

    private final int getStateColor(@SleepState int state) {
        if (state == 2) {
            return cli.i;
        }
        if (state == 3) {
            return cli.l;
        }
        if (state == 4) {
            return cli.j;
        }
        if (state != 5) {
            return state != 6 ? cli.f5459k : cli.i;
        }
        return cli.n;
    }

    @NotNull
    public final Bitmap getSleepStateBitmap(@NotNull Context ctx, @NotNull AllDaySleepReport report) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(report, "report");
        this.context = ctx;
        if (ctx == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            ctx = null;
        }
        Resources resources = ctx.getResources();
        this.width = resources.getDimension(rmi.f32708b);
        this.height = resources.getDimension(rmi.f32707a);
        this.radius = resources.getDimension(rmi.d);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) this.width, (int) this.height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.mainArea.set(0.0f, 0.0f, this.width, this.height);
        doDraw(new Canvas(bitmapCreateBitmap), report);
        return bitmapCreateBitmap;
    }
}
