package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorGuideActivity;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.byo;
import defpackage.cji;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b*\u0001&\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0003WXYB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\f\u0010(\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0006\u0010)\u001a\u00020\u001bJ\u0006\u0010*\u001a\u00020\u001bJ3\u0010+\u001a\u00020,2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `.2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0002\u0010/J\u000e\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u000eJ \u00102\u001a\u00020,2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001bH\u0002J \u00107\u001a\u00020,2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001bH\u0002J\u0018\u00108\u001a\u00020,2\u0006\u00103\u001a\u0002042\u0006\u00109\u001a\u00020\u001bH\u0002J\u0010\u0010:\u001a\u00020,2\u0006\u00103\u001a\u000204H\u0014J\u0018\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\bH\u0014J\u0006\u0010?\u001a\u00020,J\u0006\u0010@\u001a\u00020,J\u000e\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020\bJ\u0010\u0010E\u001a\u00020\u000e2\b\u0010G\u001a\u0004\u0018\u00010HJ\b\u0010I\u001a\u00020,H\u0014J\u0006\u0010J\u001a\u00020,J\u0006\u0010K\u001a\u00020,J\u0006\u0010L\u001a\u00020,J\u0010\u0010O\u001a\u00020,2\b\u0010M\u001a\u0004\u0018\u00010NJ\b\u0010P\u001a\u00020,H\u0016J\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020 0RJ\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020 0R2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020 0RJ\b\u0010U\u001a\u00020\bH\u0002J\u0010\u0010V\u001a\u00020\b2\u0006\u0010F\u001a\u00020\bH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u000e\u0010>\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010M\u001a\u0004\u0018\u00010NX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeProgressBar;", "Landroid/view/View;", "Ljava/lang/Runnable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sLongVibrate", "", "supportCustom", "", "paint", "Landroid/graphics/Paint;", "cursorPaint", "uHeight", "uWidth", "pathBg", "Landroid/graphics/Path;", "pathProgress", "isPress", "isEnd", "isPlaying", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "endProgress", "currentMode", "pressList", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeProgressBar$VibrateDataItem;", "vibrate", "Landroid/os/Vibrator;", "handler", "Landroid/os/Handler;", "vibrateRunnable", "com/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeProgressBar$vibrateRunnable$1", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeProgressBar$vibrateRunnable$1;", "getData", "getProgress", "getEndProgress", "setData", "", "data", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;FF)V", "setSupportCustom", "support", "drawRecordProgress", "canvas", "Landroid/graphics/Canvas;", "fWidth", "fHeight", "drawPlayProgress", "drawCursor", "preX", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "isFirst", StatConstants.PARAM_START, OneTrack.Event.PLAY, "isNextInValid", "hasLongRunnable", "longRunnable", "toLongRunnable", "touch", "intensity", "motionEvent", "Landroid/view/MotionEvent;", "onDetachedFromWindow", "pause", BroadcastsKt.SILENT_PUSHING_STOP, "reset", "onProgressBarChangeListener", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeProgressBar$OnProgressBarChangeListener;", "setOnProgressBarChangeListener", "run", "getVibrateTimes", "", "processData", "rawData", "getNormalColor", "getPressColor", "Companion", "OnProgressBarChangeListener", "VibrateDataItem", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVibrateModeProgressBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateModeProgressBar.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeProgressBar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,611:1\n1863#2,2:612\n1863#2,2:614\n1863#2,2:616\n*S KotlinDebug\n*F\n+ 1 VibrateModeProgressBar.kt\ncom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeProgressBar\n*L\n109#1:612,2\n177#1:614,2\n529#1:616,2\n*E\n"})
public final class VibrateModeProgressBar extends View implements Runnable {

    @NotNull
    public static final String TAG = "VibrateModeProgressBar";
    public static final int sDelayTime = 100;
    public static final long sLongToLong = 2000;
    private int currentMode;

    @NotNull
    private final Paint cursorPaint;
    private float endProgress;

    @NotNull
    private Handler handler;
    private boolean hasLongRunnable;
    private boolean isEnd;
    private boolean isFirst;
    private boolean isNextInValid;
    private boolean isPlaying;
    private boolean isPress;

    @NotNull
    private Runnable longRunnable;

    @Nullable
    private OnProgressBarChangeListener onProgressBarChangeListener;

    @NotNull
    private final Paint paint;

    @NotNull
    private Path pathBg;

    @NotNull
    private Path pathProgress;

    @NotNull
    private ArrayList<VibrateDataItem> pressList;
    private float progress;
    private long sLongVibrate;
    private boolean supportCustom;

    @NotNull
    private Runnable toLongRunnable;
    private int uHeight;
    private int uWidth;

    @Nullable
    private Vibrator vibrate;

    @NotNull
    private VibrateModeProgressBar$vibrateRunnable$1 vibrateRunnable;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeProgressBar$OnProgressBarChangeListener;", "", "onProgressStart", "", "onProgressStop", "onProgressReset", "onToLong", "onVibrateStatusChange", "isVibrate", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnProgressBarChangeListener {
        void onProgressReset();

        void onProgressStart();

        void onProgressStop();

        void onToLong();

        void onVibrateStatusChange(boolean isVibrate);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeProgressBar$VibrateDataItem;", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "intensity", "", "<init>", "(FI)V", "getProgress", "()F", "setProgress", "(F)V", "getIntensity", "()I", "setIntensity", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VibrateDataItem {
        public static final int INTENSITY_HIGH = 4;
        public static final int INTENSITY_LOW = 2;
        public static final int INTENSITY_MID = 3;
        public static final int INTENSITY_STOP = 1;
        public static final int INTENSITY_UNKNOWN = 0;
        private int intensity;
        private float progress;

        public VibrateDataItem() {
            this(0.0f, 0, 3, null);
        }

        public static /* synthetic */ VibrateDataItem copy$default(VibrateDataItem vibrateDataItem, float f, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = vibrateDataItem.progress;
            }
            if ((i2 & 2) != 0) {
                i = vibrateDataItem.intensity;
            }
            return vibrateDataItem.copy(f, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getIntensity() {
            return this.intensity;
        }

        @NotNull
        public final VibrateDataItem copy(float progress, int intensity) {
            return new VibrateDataItem(progress, intensity);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VibrateDataItem)) {
                return false;
            }
            VibrateDataItem vibrateDataItem = (VibrateDataItem) other;
            return Float.compare(this.progress, vibrateDataItem.progress) == 0 && this.intensity == vibrateDataItem.intensity;
        }

        public final int getIntensity() {
            return this.intensity;
        }

        public final float getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return (Float.hashCode(this.progress) * 31) + Integer.hashCode(this.intensity);
        }

        public final void setIntensity(int i) {
            this.intensity = i;
        }

        public final void setProgress(float f) {
            this.progress = f;
        }

        @NotNull
        public String toString() {
            return "VibrateDataItem(progress=" + this.progress + ", intensity=" + this.intensity + ")";
        }

        public VibrateDataItem(float f, int i) {
            this.progress = f;
            this.intensity = i;
        }

        public /* synthetic */ VibrateDataItem(float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0 : i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VibrateModeProgressBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawCursor(Canvas canvas, float preX) {
        if (this.supportCustom) {
            this.cursorPaint.setStyle(Paint.Style.FILL);
            this.cursorPaint.setColor(getContext().getColor(cji.d));
            RectF rectF = new RectF(preX, 0.0f, ExtUtilsKt.getDp(Double.valueOf(3.33d)) + preX, this.uHeight);
            canvas.drawRect(rectF, this.cursorPaint);
            this.cursorPaint.setStyle(Paint.Style.STROKE);
            this.cursorPaint.setColor(getContext().getColor(cji.n));
            this.cursorPaint.setStrokeWidth(ExtUtilsKt.getDp(Double.valueOf(1.66d)));
            canvas.drawRect(rectF, this.cursorPaint);
        }
    }

    private final void drawPlayProgress(Canvas canvas, float fWidth, float fHeight) {
        if (this.progress == 0.0f) {
            return;
        }
        ArrayList<Triple> arrayList = new ArrayList();
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.pressList);
        mutableList.add(new VibrateDataItem(this.endProgress, this.currentMode));
        int size = mutableList.size();
        int i = 1;
        float progress = 0.0f;
        boolean z = true;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            VibrateDataItem vibrateDataItem = (VibrateDataItem) mutableList.get(i2);
            if (vibrateDataItem.getProgress() > this.progress) {
                break;
            }
            if (i2 != 0) {
                z = vibrateDataItem.getIntensity() != 1;
            }
            arrayList.add(new Triple(Float.valueOf(progress), vibrateDataItem, Boolean.valueOf(z)));
            progress = vibrateDataItem.getProgress();
            i2++;
        }
        float f = 0.0f;
        for (Triple triple : arrayList) {
            this.pathProgress.reset();
            this.pathProgress.moveTo(f, 0.0f);
            float fFloatValue = ((Number) triple.getFirst()).floatValue();
            float progress2 = ((VibrateDataItem) triple.getSecond()).getProgress();
            if (getLayoutDirection() == i) {
                float f2 = 100;
                fFloatValue = f2 - fFloatValue;
                progress2 = f2 - progress2;
            }
            this.paint.setColor(getContext().getColor(getPressColor(((VibrateDataItem) triple.getSecond()).getIntensity())));
            float f3 = (progress2 / 100.0f) * fWidth;
            int i3 = this.uHeight;
            float f4 = 2;
            this.pathProgress.addRect(new RectF((fFloatValue / 100.0f) * fWidth, (i3 - fHeight) / f4, f3, (i3 + fHeight) / f4), Path.Direction.CW);
            this.pathProgress.op(this.pathBg, Path.Op.INTERSECT);
            canvas.drawPath(this.pathProgress, this.paint);
            this.isEnd = progress2 == 100.0f;
            f = f3;
            i = 1;
        }
        this.pathProgress.reset();
        this.pathProgress.moveTo(f, 0.0f);
        float f5 = this.progress;
        if (progress > f5 || f5 > this.endProgress || i2 <= -1) {
            return;
        }
        VibrateDataItem vibrateDataItem2 = (VibrateDataItem) mutableList.get(i2);
        this.paint.setColor(vibrateDataItem2.getIntensity() == 1 ? getContext().getColor(cji.o) : getContext().getColor(getPressColor(vibrateDataItem2.getIntensity())));
        float f6 = (this.progress / 100.0f) * fWidth;
        if (getLayoutDirection() == 1) {
            f6 = ((100 - this.progress) / 100.0f) * fWidth;
            if (f == 0.0f) {
                f = fWidth;
            }
        }
        int i4 = this.uHeight;
        float f7 = 2;
        this.pathProgress.addRect(new RectF(f, (i4 - fHeight) / f7, f6, (i4 + fHeight) / f7), Path.Direction.CW);
        this.pathProgress.op(this.pathBg, Path.Op.INTERSECT);
        canvas.drawPath(this.pathProgress, this.paint);
        drawCursor(canvas, f6);
    }

    private final void drawRecordProgress(Canvas canvas, float fWidth, float fHeight) {
        if (this.progress == 0.0f) {
            return;
        }
        ArrayList<Triple> arrayList = new ArrayList();
        int size = this.pressList.size();
        float progress = 0.0f;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                z = this.pressList.get(i).getIntensity() != 1;
            }
            VibrateDataItem vibrateDataItem = this.pressList.get(i);
            Intrinsics.checkNotNullExpressionValue(vibrateDataItem, "get(...)");
            VibrateDataItem vibrateDataItem2 = vibrateDataItem;
            arrayList.add(new Triple(Float.valueOf(progress), vibrateDataItem2, Boolean.valueOf(z)));
            progress = vibrateDataItem2.getProgress();
        }
        float f = 0.0f;
        boolean z2 = false;
        for (Triple triple : arrayList) {
            this.pathProgress.reset();
            this.pathProgress.moveTo(f, 0.0f);
            float fFloatValue = ((Number) triple.getFirst()).floatValue();
            float progress2 = ((VibrateDataItem) triple.getSecond()).getProgress();
            if (getLayoutDirection() == 1) {
                float f2 = 100;
                fFloatValue = f2 - fFloatValue;
                progress2 = f2 - progress2;
            }
            if (((Boolean) triple.getThird()).booleanValue()) {
                this.paint.setColor(getContext().getColor(getPressColor(((VibrateDataItem) triple.getSecond()).getIntensity())));
            } else {
                this.paint.setColor(getContext().getColor(cji.o));
            }
            float f3 = (progress2 / 100.0f) * fWidth;
            int i2 = this.uHeight;
            float f4 = 2;
            this.pathProgress.addRect(new RectF((fFloatValue / 100.0f) * fWidth, (i2 - fHeight) / f4, f3, (i2 + fHeight) / f4), Path.Direction.CW);
            this.pathProgress.op(this.pathBg, Path.Op.INTERSECT);
            canvas.drawPath(this.pathProgress, this.paint);
            z2 = progress2 == 100.0f;
            f = f3;
        }
        this.pathProgress.reset();
        this.pathProgress.moveTo(f, 0.0f);
        if (z2) {
            return;
        }
        if (this.isPress) {
            this.paint.setColor(getContext().getColor(getPressColor(this.currentMode)));
        } else {
            this.paint.setColor(getContext().getColor(cji.o));
        }
        float f5 = (this.progress / 100.0f) * fWidth;
        if (getLayoutDirection() == 1) {
            f5 = ((100 - this.progress) / 100.0f) * fWidth;
            if (f == 0.0f) {
                f = fWidth;
            }
        }
        int i3 = this.uHeight;
        float f6 = 2;
        this.pathProgress.addRect(new RectF(f, (i3 - fHeight) / f6, f5, (i3 + fHeight) / f6), Path.Direction.CW);
        this.pathProgress.op(this.pathBg, Path.Op.INTERSECT);
        canvas.drawPath(this.pathProgress, this.paint);
        drawCursor(canvas, f5);
    }

    private final int getNormalColor() {
        return this.supportCustom ? cji.q : cji.p;
    }

    private final int getPressColor(int intensity) {
        if (!this.supportCustom) {
            return cji.s;
        }
        if (intensity == 2) {
            return cji.t;
        }
        if (intensity != 3) {
            return intensity != 4 ? cji.o : cji.s;
        }
        return cji.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void longRunnable$lambda$2(VibrateModeProgressBar this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isNextInValid = true;
        this$0.isPress = false;
        this$0.pressList.add(new VibrateDataItem(this$0.progress, this$0.currentMode));
        this$0.currentMode = 1;
        Vibrator vibrator = this$0.vibrate;
        Intrinsics.checkNotNull(vibrator);
        if (vibrator.hasVibrator()) {
            OnProgressBarChangeListener onProgressBarChangeListener = this$0.onProgressBarChangeListener;
            if (onProgressBarChangeListener != null) {
                onProgressBarChangeListener.onVibrateStatusChange(false);
            }
            Vibrator vibrator2 = this$0.vibrate;
            Intrinsics.checkNotNull(vibrator2);
            vibrator2.cancel();
            Logger.i(TAG, "longRunnable cancel vibrate");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toLongRunnable$lambda$3(VibrateModeProgressBar this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnProgressBarChangeListener onProgressBarChangeListener = this$0.onProgressBarChangeListener;
        if (onProgressBarChangeListener != null) {
            onProgressBarChangeListener.onToLong();
        }
    }

    @NotNull
    public final ArrayList<VibrateDataItem> getData() {
        return this.pressList;
    }

    public final float getEndProgress() {
        return this.endProgress;
    }

    public final float getProgress() {
        return this.progress;
    }

    @NotNull
    public final List<VibrateDataItem> getVibrateTimes() {
        ArrayList<VibrateDataItem> arrayList = new ArrayList();
        int i = 0;
        VibrateDataItem vibrateDataItem = new VibrateDataItem(0.0f, i, 3, null);
        int size = this.pressList.size();
        while (i < size) {
            VibrateDataItem vibrateDataItem2 = this.pressList.get(i);
            Intrinsics.checkNotNullExpressionValue(vibrateDataItem2, "get(...)");
            VibrateDataItem vibrateDataItem3 = vibrateDataItem2;
            float progress = vibrateDataItem3.getProgress() - vibrateDataItem.getProgress();
            if (progress == 0.0f) {
                arrayList.add(new VibrateDataItem(0.0f, vibrateDataItem3.getIntensity()));
            } else {
                float f = ((progress * 100) * 6) / 5;
                long j = this.sLongVibrate;
                if (f > j) {
                    f = j;
                }
                arrayList.add(new VibrateDataItem(f, vibrateDataItem3.getIntensity()));
            }
            i++;
            vibrateDataItem = vibrateDataItem3;
        }
        if (vibrateDataItem.getProgress() != 100.0f) {
            float f2 = 100;
            float progress2 = f2 - vibrateDataItem.getProgress();
            if (progress2 != 0.0f) {
                float f3 = progress2 * f2;
                long j2 = this.sLongVibrate;
                if (f3 > j2) {
                    f3 = j2;
                }
                arrayList.add(new VibrateDataItem(f3, this.currentMode));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z = true;
        for (VibrateDataItem vibrateDataItem4 : arrayList) {
            byo.a aVar = new byo.a();
            aVar.c = z;
            aVar.d = (int) vibrateDataItem4.getProgress();
            aVar.e = vibrateDataItem4.getIntensity();
            z = !z;
            arrayList2.add(aVar);
        }
        return processData(arrayList);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.pathBg.reset();
        this.pathProgress.reset();
        float f = this.uWidth;
        float f2 = this.uHeight;
        float dp = ExtUtilsKt.getDp(20);
        Paint paint = this.paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.paint.setColor(getContext().getColor(getNormalColor()));
        float f3 = 2;
        float f4 = (f2 - dp) / f3;
        float f5 = (f2 + dp) / f3;
        float f6 = dp / f3;
        this.pathBg.addRoundRect(new RectF(0.0f, f4, f, f5), f6, f6, Path.Direction.CW);
        canvas.drawPath(this.pathBg, this.paint);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(ExtUtilsKt.getDp(Double.valueOf(0.67d)));
        this.paint.setColor(getContext().getColor(cji.f5406r));
        canvas.drawRoundRect(0.0f, f4, f, f5, f6, f6, this.paint);
        this.paint.setStyle(style);
        if (this.isPlaying) {
            drawPlayProgress(canvas, f, dp);
        } else {
            drawRecordProgress(canvas, f, dp);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            size = 0;
        }
        this.uWidth = size;
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            size2 = ExtUtilsKt.getDp(26);
        }
        this.uHeight = size2;
        setMeasuredDimension(this.uWidth, size2);
    }

    public final void pause() {
        this.isPlaying = false;
        removeCallbacks(this);
    }

    public final void play() {
        this.isPlaying = true;
        this.progress = 0.0f;
        invalidate();
        postDelayed(this, 100L);
    }

    @NotNull
    public final List<VibrateDataItem> processData(@NotNull List<VibrateDataItem> rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        ArrayList arrayList = new ArrayList();
        for (VibrateDataItem vibrateDataItem : rawData) {
            if (vibrateDataItem.getProgress() > 0.0f) {
                arrayList.add(vibrateDataItem);
            }
        }
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList();
        VibrateDataItem vibrateDataItem2 = (VibrateDataItem) arrayList.get(0);
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            VibrateDataItem vibrateDataItem3 = (VibrateDataItem) arrayList.get(i);
            if (vibrateDataItem2.getIntensity() == vibrateDataItem3.getIntensity()) {
                vibrateDataItem2.setProgress(vibrateDataItem2.getProgress() + vibrateDataItem3.getProgress());
            } else {
                arrayList2.add(vibrateDataItem2);
                vibrateDataItem2 = vibrateDataItem3;
            }
        }
        arrayList2.add(vibrateDataItem2);
        return arrayList2;
    }

    public final void reset() {
        removeCallbacks(this);
        removeCallbacks(this.longRunnable);
        removeCallbacks(this.toLongRunnable);
        this.pressList.clear();
        this.progress = 0.0f;
        invalidate();
        this.isFirst = true;
        this.isEnd = false;
        this.isPlaying = false;
        this.hasLongRunnable = false;
        OnProgressBarChangeListener onProgressBarChangeListener = this.onProgressBarChangeListener;
        if (onProgressBarChangeListener != null) {
            onProgressBarChangeListener.onProgressReset();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        float f = this.progress + 0.8333333f;
        this.progress = f;
        if (f > 100.0f || (this.isPlaying && f > this.endProgress)) {
            stop();
        } else {
            invalidate();
            postDelayed(this, 100L);
        }
    }

    public final void setData(@NotNull ArrayList<VibrateDataItem> data, float progress, float endProgress) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.progress = progress;
        this.endProgress = endProgress;
        this.pressList = data;
        this.currentMode = 1;
        invalidate();
    }

    public final void setOnProgressBarChangeListener(@Nullable OnProgressBarChangeListener onProgressBarChangeListener) {
        this.onProgressBarChangeListener = onProgressBarChangeListener;
    }

    public final void setSupportCustom(boolean support) {
        this.supportCustom = support;
        if (support) {
            this.sLongVibrate = 12000L;
        }
    }

    public final void start() {
        this.isPlaying = false;
        this.pressList.clear();
        this.progress = 0.0f;
        post(this);
        OnProgressBarChangeListener onProgressBarChangeListener = this.onProgressBarChangeListener;
        if (onProgressBarChangeListener != null) {
            onProgressBarChangeListener.onProgressStart();
        }
    }

    public final void stop() {
        this.isEnd = true;
        this.endProgress = this.progress;
        this.hasLongRunnable = false;
        removeCallbacks(this);
        removeCallbacks(this.longRunnable);
        removeCallbacks(this.toLongRunnable);
        Vibrator vibrator = this.vibrate;
        Intrinsics.checkNotNull(vibrator);
        if (vibrator.hasVibrator()) {
            OnProgressBarChangeListener onProgressBarChangeListener = this.onProgressBarChangeListener;
            if (onProgressBarChangeListener != null) {
                onProgressBarChangeListener.onVibrateStatusChange(false);
            }
            Vibrator vibrator2 = this.vibrate;
            Intrinsics.checkNotNull(vibrator2);
            vibrator2.cancel();
        }
        OnProgressBarChangeListener onProgressBarChangeListener2 = this.onProgressBarChangeListener;
        if (onProgressBarChangeListener2 != null) {
            onProgressBarChangeListener2.onProgressStop();
        }
    }

    public final void touch(int intensity) {
        if (this.isEnd || this.isPlaying) {
            return;
        }
        if (intensity == 1) {
            if (!this.isNextInValid) {
                this.pressList.add(new VibrateDataItem(this.progress, this.currentMode));
            }
            this.isNextInValid = false;
            this.isPress = false;
            Vibrator vibrator = this.vibrate;
            Intrinsics.checkNotNull(vibrator);
            if (vibrator.hasVibrator()) {
                OnProgressBarChangeListener onProgressBarChangeListener = this.onProgressBarChangeListener;
                if (onProgressBarChangeListener != null) {
                    onProgressBarChangeListener.onVibrateStatusChange(false);
                }
                this.handler.removeCallbacks(this.vibrateRunnable);
                Vibrator vibrator2 = this.vibrate;
                Intrinsics.checkNotNull(vibrator2);
                vibrator2.cancel();
                Logger.i(TAG, "cancel vibrate");
            }
            removeCallbacks(this.longRunnable);
            removeCallbacks(this.toLongRunnable);
            this.hasLongRunnable = false;
            if (this.isEnd) {
                return;
            }
            this.currentMode = intensity;
            return;
        }
        if (intensity == 2 || intensity == 3 || intensity == 4) {
            this.isPress = true;
            this.isNextInValid = false;
            if (this.isFirst) {
                this.isFirst = false;
                start();
            } else {
                this.pressList.add(new VibrateDataItem(this.progress, this.currentMode));
            }
            Vibrator vibrator3 = this.vibrate;
            Intrinsics.checkNotNull(vibrator3);
            if (vibrator3.hasVibrator()) {
                if (this.sLongVibrate > 5000) {
                    Vibrator vibrator4 = this.vibrate;
                    Intrinsics.checkNotNull(vibrator4);
                    vibrator4.vibrate(7000L);
                    this.handler.postDelayed(this.vibrateRunnable, SleepRhythmMonitorGuideActivity.INDICATOR_DELAY_DURATION);
                } else {
                    Vibrator vibrator5 = this.vibrate;
                    Intrinsics.checkNotNull(vibrator5);
                    vibrator5.vibrate(this.sLongVibrate);
                }
                Logger.i(TAG, "start vibrate " + this.sLongVibrate);
                OnProgressBarChangeListener onProgressBarChangeListener2 = this.onProgressBarChangeListener;
                if (onProgressBarChangeListener2 != null) {
                    onProgressBarChangeListener2.onVibrateStatusChange(true);
                }
            }
            if (!this.hasLongRunnable) {
                this.hasLongRunnable = true;
                postDelayed(this.longRunnable, this.sLongVibrate);
                postDelayed(this.toLongRunnable, sLongToLong);
            }
            this.currentMode = intensity;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VibrateModeProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VibrateModeProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar$vibrateRunnable$1] */
    @JvmOverloads
    public VibrateModeProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.sLongVibrate = 5000L;
        this.paint = new Paint();
        this.cursorPaint = new Paint();
        this.pathBg = new Path();
        this.pathProgress = new Path();
        this.pressList = new ArrayList<>();
        this.handler = new Handler(Looper.getMainLooper());
        this.vibrateRunnable = new Runnable() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar$vibrateRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                Vibrator vibrator = this.this$0.vibrate;
                if (vibrator == null || !vibrator.hasVibrator()) {
                    return;
                }
                Vibrator vibrator2 = this.this$0.vibrate;
                if (vibrator2 != null) {
                    vibrator2.cancel();
                }
                Vibrator vibrator3 = this.this$0.vibrate;
                if (vibrator3 != null) {
                    vibrator3.vibrate(SleepRhythmMonitorGuideActivity.INDICATOR_DELAY_DURATION);
                }
                Logger.i(VibrateModeProgressBar.TAG, "vibrateRunnable cancel vibrate restart");
            }
        };
        Object systemService = context.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.vibrate = (Vibrator) systemService;
        this.isFirst = true;
        this.longRunnable = new Runnable() { // from class: vpq
            @Override // java.lang.Runnable
            public final void run() {
                VibrateModeProgressBar.longRunnable$lambda$2(this.f37114a);
            }
        };
        this.toLongRunnable = new Runnable() { // from class: wpq
            @Override // java.lang.Runnable
            public final void run() {
                VibrateModeProgressBar.toLongRunnable$lambda$3(this.f38235a);
            }
        };
    }

    public final boolean touch(@Nullable MotionEvent motionEvent) {
        if (this.isEnd) {
            return true;
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.isPress = true;
            if (this.isFirst) {
                this.isFirst = false;
                start();
            } else {
                this.pressList.add(new VibrateDataItem(this.progress, this.currentMode));
            }
            Vibrator vibrator = this.vibrate;
            Intrinsics.checkNotNull(vibrator);
            if (vibrator.hasVibrator()) {
                Vibrator vibrator2 = this.vibrate;
                Intrinsics.checkNotNull(vibrator2);
                vibrator2.vibrate(this.sLongVibrate);
                OnProgressBarChangeListener onProgressBarChangeListener = this.onProgressBarChangeListener;
                if (onProgressBarChangeListener != null) {
                    onProgressBarChangeListener.onVibrateStatusChange(true);
                }
            }
            postDelayed(this.longRunnable, this.sLongVibrate);
            postDelayed(this.toLongRunnable, sLongToLong);
            this.currentMode = 0;
        } else if (numValueOf == null || numValueOf.intValue() != 2) {
            if (!this.isNextInValid) {
                this.pressList.add(new VibrateDataItem(this.progress, this.currentMode));
            }
            this.isNextInValid = false;
            this.isPress = false;
            Vibrator vibrator3 = this.vibrate;
            Intrinsics.checkNotNull(vibrator3);
            if (vibrator3.hasVibrator()) {
                OnProgressBarChangeListener onProgressBarChangeListener2 = this.onProgressBarChangeListener;
                if (onProgressBarChangeListener2 != null) {
                    onProgressBarChangeListener2.onVibrateStatusChange(false);
                }
                Vibrator vibrator4 = this.vibrate;
                Intrinsics.checkNotNull(vibrator4);
                vibrator4.cancel();
            }
            removeCallbacks(this.longRunnable);
            removeCallbacks(this.toLongRunnable);
            this.currentMode = 1;
        }
        return true;
    }
}
