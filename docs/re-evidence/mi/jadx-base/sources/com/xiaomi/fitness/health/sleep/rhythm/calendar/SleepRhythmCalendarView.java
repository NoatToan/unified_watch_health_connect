package com.xiaomi.fitness.health.sleep.rhythm.calendar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.c;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.onetrack.api.b;
import defpackage.c0j;
import defpackage.iji;
import defpackage.m80;
import defpackage.mj8;
import defpackage.ni4;
import defpackage.ohi;
import defpackage.pni;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 l2\u00020\u0001:\u0002lmB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ7\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020\f2\"\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160?j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016`>¢\u0006\u0002\u0010@J\u000e\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u0007J\u000e\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020)J\u0010\u0010E\u001a\u00020)2\u0006\u0010F\u001a\u00020GH\u0017J\u0010\u0010J\u001a\u00020\r2\u0006\u0010=\u001a\u00020\fH\u0002J\u0010\u0010K\u001a\u00020\r2\u0006\u0010L\u001a\u00020MH\u0014J\u0018\u0010N\u001a\u00020\r2\u0006\u0010L\u001a\u00020M2\u0006\u0010O\u001a\u00020PH\u0002J\u0014\u0010Q\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010T\u001a\u00020!H\u0002J\b\u0010U\u001a\u00020#H\u0002J\u0010\u0010V\u001a\u00020!2\u0006\u0010W\u001a\u00020\u0007H\u0002J\u0018\u0010X\u001a\u00020!2\u0006\u0010Y\u001a\u00020)2\u0006\u0010Z\u001a\u00020)H\u0002J\u0018\u0010[\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u0007H\u0014J(\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u00072\u0006\u0010a\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u0007H\u0014J\b\u0010c\u001a\u00020!H\u0002J\u0012\u0010d\u001a\u00020\u00072\b\b\u0001\u0010e\u001a\u00020\u0007H\u0002J\u0018\u0010f\u001a\u00020\u001f2\u0006\u0010g\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u0007H\u0002J\u001a\u0010i\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\u000e\u0010j\u001a\u00020\r2\u0006\u0010=\u001a\u00020\fJ\u0012\u0010k\u001a\u00020)2\b\u0010F\u001a\u0004\u0018\u00010GH\u0014R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u000e\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010 \u0011*\u0012\u0012\u000e\b\u0001\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f0\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082.¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\f0\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0012\u0010-\u001a\u00060.R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006n"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onDayClicked", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "", "weeks", "", "", "kotlin.jvm.PlatformType", "[Ljava/lang/String;", "dataRecords", "", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarDayData;", "curDate", "Lorg/joda/time/LocalDate;", "month", "days", "", "lines", "daysRect", "", "Landroid/graphics/Rect;", "paint", "Landroid/graphics/Paint;", "textPaint", "Landroid/text/TextPaint;", "paintBorder", "dotPaint", "columnSpace", "rectBorder", "showSelectCircle", "", "viewHeight", "getViewHeight", "()I", "accessHelper", "Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarView$MonthViewAccessHelper;", "paddingStartEnd", "bubblePaddingLeftEnd", "bubblePaddingTopBottom", "bubblePath", "Landroid/graphics/Path;", "bubbleColorRes", "bubbleStrokeColorRes", "showPopupViewEnable", "bubbleTextPaint", "bubblePaint", "bubbleStrokePaint", "bubbleHelpRect", "Landroid/graphics/RectF;", "initDate", DialWidgetType.DATE, "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(Lorg/joda/time/LocalDate;Ljava/util/HashMap;)V", "setDayOfMonth", "day", "setShowPopViewEnable", "enable", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "mGestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "onDayClick", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawBubble", "calendarViewItem", "Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/CalendarViewItem;", "getDayItemBackground", "Landroid/graphics/drawable/Drawable;", "data", "disablePaint", "weekPaint", "dataPaint", "type", "normalTextPaint", "isInMonth", "selected", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", Constants.DEVICE_TYPE_WEAR, "h", "oldw", "oldh", "dataEmptyPaint", "getColor", "colorRes", "getRect", "line", "column", "setOnDayClicked", "setDate", "dispatchHoverEvent", "Companion", "MonthViewAccessHelper", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmCalendarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmCalendarView.kt\ncom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,504:1\n1#2:505\n*E\n"})
public final class SleepRhythmCalendarView extends View {
    private static final int DAYS_IN_WEEK = 7;

    @NotNull
    private static final String TAG = "SleepRhythmCalendarView";

    @NotNull
    private MonthViewAccessHelper accessHelper;
    private final int bubbleColorRes;

    @NotNull
    private RectF bubbleHelpRect;
    private int bubblePaddingLeftEnd;
    private int bubblePaddingTopBottom;

    @NotNull
    private final Paint bubblePaint;

    @NotNull
    private final Path bubblePath;
    private final int bubbleStrokeColorRes;

    @NotNull
    private final Paint bubbleStrokePaint;

    @NotNull
    private final TextPaint bubbleTextPaint;
    private int columnSpace;
    private LocalDate curDate;
    private Map<Long, SleepRhythmCalendarDayData> dataRecords;

    @NotNull
    private List<LocalDate> days;

    @NotNull
    private final List<Rect> daysRect;

    @NotNull
    private final Paint dotPaint;
    private int lines;

    @NotNull
    private final GestureDetectorCompat mGestureDetector;
    private int month;

    @Nullable
    private Function1<? super LocalDate, Unit> onDayClicked;
    private int paddingStartEnd;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Paint paintBorder;

    @NotNull
    private final Rect rectBorder;
    private boolean showPopupViewEnable;
    private boolean showSelectCircle;

    @NotNull
    private final TextPaint textPaint;

    @NotNull
    private String[] weeks;
    private static final int ITEM_SIZE = ExtUtilsKt.getDp(28);
    private static final int LINE_SPACE = ExtUtilsKt.getDp(14);
    private static final int DAY_Y_OFFSET = ExtUtilsKt.getDp(5);
    private static final float WEEK_Y = ExtUtilsKt.getDp(26);
    private static final int DAY_TO_WEEK = ExtUtilsKt.getDp(36);
    private static final int BORDER_WIDTH = ExtUtilsKt.getDp(1) / 4;
    private static final int WEEK_TXT_SIZE = ExtUtilsKt.getDp(12);

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarView$MonthViewAccessHelper;", "Lmj8;", "", "x", "y", "", "getVirtualViewAt", "(FF)I", "", "virtualViewIds", "", "getVisibleVirtualViews", "(Ljava/util/List;)V", "virtualViewId", "Lm80;", "node", "onPopulateNodeForVirtualView", "(ILm80;)V", "action", "Landroid/os/Bundle;", "arguments", "", "onPerformActionForVirtualView", "(IILandroid/os/Bundle;)Z", "Landroid/graphics/Rect;", "mRectBounds", "Landroid/graphics/Rect;", "Landroid/view/View;", b.E, "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarView;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSleepRhythmCalendarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmCalendarView.kt\ncom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarView$MonthViewAccessHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,504:1\n1872#2,3:505\n*S KotlinDebug\n*F\n+ 1 SleepRhythmCalendarView.kt\ncom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarView$MonthViewAccessHelper\n*L\n455#1:505,3\n*E\n"})
    public final class MonthViewAccessHelper extends mj8 {

        @NotNull
        private Rect mRectBounds;
        final /* synthetic */ SleepRhythmCalendarView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MonthViewAccessHelper(@NotNull SleepRhythmCalendarView sleepRhythmCalendarView, View host) {
            super(host);
            Intrinsics.checkNotNullParameter(host, "host");
            this.this$0 = sleepRhythmCalendarView;
            this.mRectBounds = new Rect();
        }

        @Override // defpackage.mj8
        public int getVirtualViewAt(float x, float y) {
            int size = this.this$0.daysRect.size();
            for (int i = 0; i < size; i++) {
                if (((Rect) this.this$0.daysRect.get(i)).contains((int) x, (int) y)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // defpackage.mj8
        public void getVisibleVirtualViews(@Nullable List<Integer> virtualViewIds) {
            int i = 0;
            for (Object obj : this.this$0.daysRect) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (virtualViewIds != null) {
                    virtualViewIds.add(Integer.valueOf(i));
                }
                i = i2;
            }
        }

        @Override // defpackage.mj8
        public boolean onPerformActionForVirtualView(int virtualViewId, int action, @Nullable Bundle arguments) {
            if (action != 16 || virtualViewId < 0 || virtualViewId >= this.this$0.daysRect.size() || virtualViewId >= this.this$0.days.size()) {
                return false;
            }
            SleepRhythmCalendarView sleepRhythmCalendarView = this.this$0;
            sleepRhythmCalendarView.onDayClick((LocalDate) sleepRhythmCalendarView.days.get(virtualViewId));
            return false;
        }

        @Override // defpackage.mj8
        public void onPopulateNodeForVirtualView(int virtualViewId, @NotNull m80 node) {
            Intrinsics.checkNotNullParameter(node, "node");
            Logger.i(SleepRhythmCalendarView.TAG, "onPopulateNodeForVirtualView id " + virtualViewId);
            if (virtualViewId < 0 || virtualViewId >= this.this$0.daysRect.size() || virtualViewId >= this.this$0.days.size()) {
                this.mRectBounds.setEmpty();
                node.d0(this.mRectBounds);
                node.m0("");
                node.j0(false);
                return;
            }
            this.mRectBounds.set((Rect) this.this$0.daysRect.get(virtualViewId));
            node.d0(this.mRectBounds);
            String dateSimpleLocalFormat = TimeDateUtil.getDateSimpleLocalFormat((LocalDate) this.this$0.days.get(virtualViewId));
            node.j0(true);
            node.m0(dateSimpleLocalFormat);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmCalendarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Paint dataEmptyPaint() {
        Paint paint = this.paint;
        paint.setColor(getColor(iji.e0));
        return paint;
    }

    private final Paint dataPaint(int type) {
        Paint paint = this.paint;
        paint.setColor((type == 0 || type == 2) ? getColor(iji.H1) : getColor(iji.d0));
        return paint;
    }

    private final Paint disablePaint() {
        Paint paint = this.paint;
        paint.setColor(getColor(iji.u3));
        return paint;
    }

    private final void drawBubble(Canvas canvas, CalendarViewItem calendarViewItem) {
        Rect rect = calendarViewItem.getRect();
        String string = getContext().getString(c0j.rj);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Rect rect2 = new Rect();
        this.bubbleTextPaint.getTextBounds(string, 0, string.length(), rect2);
        int iWidth = rect2.width() + (this.bubblePaddingLeftEnd * 2);
        int dp = ExtUtilsKt.getDp(50);
        float f = iWidth;
        float f2 = f / 2.0f;
        float fCenterX = rect.centerX();
        float f3 = fCenterX - f2;
        float width = f2 + fCenterX;
        float dp2 = ExtUtilsKt.getDp(5);
        if (f3 < dp2) {
            width = dp2 + f;
            f3 = dp2;
        }
        if (width > getWidth() - dp2) {
            width = getWidth() - dp2;
            f3 = width - f;
        }
        boolean z = !calendarViewItem.isLastLine();
        int dp3 = ExtUtilsKt.getDp(10);
        int dp4 = ExtUtilsKt.getDp(22);
        int i = z ? rect.bottom + dp3 + 5 : ((rect.top - dp3) - dp) - 5;
        int i2 = dp + i;
        RectF rectF = new RectF(f3, i, width, i2);
        this.bubbleHelpRect = rectF;
        float f4 = dp4;
        float f5 = fCenterX - (f4 / 2.0f);
        float f6 = f4 + f5;
        float f7 = z ? rectF.top - dp3 : rectF.bottom + dp3;
        float f8 = dp3;
        float f9 = z ? f8 + f7 : f7 - f8;
        this.bubblePath.reset();
        float dp5 = ExtUtilsKt.getDp(16);
        this.bubblePath.addRoundRect(this.bubbleHelpRect, dp5, dp5, Path.Direction.CCW);
        PointF pointF = new PointF(f5, f9);
        float f10 = z ? 5 + f7 : f7 - 5;
        PointF pointF2 = new PointF(fCenterX - 5.0f, f10);
        PointF pointF3 = new PointF(fCenterX, f7);
        PointF pointF4 = new PointF(fCenterX + 5.0f, f10);
        PointF pointF5 = new PointF(f6, f9);
        this.bubblePath.moveTo(pointF.x, pointF.y);
        this.bubblePath.lineTo(pointF2.x, pointF2.y);
        this.bubblePath.quadTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y);
        this.bubblePath.lineTo(pointF5.x, pointF5.y);
        canvas.drawPath(this.bubblePath, this.bubblePaint);
        this.bubbleStrokePaint.setColor(getColor(this.bubbleStrokeColorRes));
        this.bubbleStrokePaint.setStrokeWidth(1.0f);
        canvas.drawPath(this.bubblePath, this.bubbleStrokePaint);
        this.bubblePath.reset();
        this.bubblePath.moveTo(f5, f9);
        this.bubblePath.lineTo(f6, f9);
        this.bubbleStrokePaint.setColor(getColor(this.bubbleColorRes));
        this.bubbleStrokePaint.setStrokeWidth(2.0f);
        canvas.drawPath(this.bubblePath, this.bubbleStrokePaint);
        canvas.drawText(string, f3 + (this.bubbleHelpRect.width() / 2), (i2 - this.bubblePaddingTopBottom) - this.bubbleTextPaint.getFontMetrics().descent, this.bubbleTextPaint);
    }

    private final int getColor(int colorRes) {
        return ni4.c(ApplicationExtKt.getApplication(), colorRes);
    }

    private final Drawable getDayItemBackground(SleepRhythmCalendarDayData data) {
        if (data == null || data.getRhythmInfo() == null) {
            return null;
        }
        int type = data.getType();
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        return null;
                    }
                }
            }
            return ni4.e(getContext(), pni.e2);
        }
        return ni4.e(getContext(), pni.c2);
    }

    private final Rect getRect(int line, int column) {
        if (!AppUtil.isRTLDirection()) {
            int i = ITEM_SIZE;
            int i2 = (column * (this.columnSpace + i)) + this.paddingStartEnd;
            int i3 = LINE_SPACE;
            int i4 = (line * (i + i3)) + DAY_TO_WEEK + (i3 / 2);
            return new Rect(i2, i4, i2 + i, i + i4);
        }
        int right = getRight();
        int i5 = ITEM_SIZE;
        int i6 = right - ((column * (this.columnSpace + i5)) + this.paddingStartEnd);
        int i7 = LINE_SPACE;
        int i8 = (line * (i5 + i7)) + DAY_TO_WEEK + (i7 / 2);
        return new Rect(i6 - i5, i8, i6, i5 + i8);
    }

    private final int getViewHeight() {
        return (this.lines * (ITEM_SIZE + LINE_SPACE)) + DAY_TO_WEEK;
    }

    private final Paint normalTextPaint(boolean isInMonth, boolean selected) {
        Paint paint = this.paint;
        paint.setColor(getColor(isInMonth ? iji.e0 : iji.u3));
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDayClick(LocalDate date) {
        Logger.d(TAG, "onDayClick: " + date);
        Function1<? super LocalDate, Unit> function1 = this.onDayClicked;
        if (function1 != null) {
            function1.invoke2(date);
        }
        this.curDate = date;
    }

    private final TextPaint weekPaint() {
        TextPaint textPaint = this.textPaint;
        textPaint.setColor(getColor(iji.g0));
        textPaint.setTextSize(WEEK_TXT_SIZE);
        return textPaint;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@Nullable MotionEvent event) {
        MonthViewAccessHelper monthViewAccessHelper = this.accessHelper;
        Intrinsics.checkNotNull(event);
        return monthViewAccessHelper.dispatchHoverEvent(event) || super.dispatchHoverEvent(event);
    }

    public final void initDate(@NotNull LocalDate date, @NotNull HashMap<Long, SleepRhythmCalendarDayData> dataRecords) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(dataRecords, "dataRecords");
        this.curDate = date;
        this.month = date.getMonthOfYear();
        LocalDate curDate = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
        List<LocalDate> monthLocalDateCalendar = TimeDateUtil.getMonthLocalDateCalendar(curDate);
        this.days = monthLocalDateCalendar;
        this.lines = monthLocalDateCalendar.size() / 7;
        this.dataRecords = dataRecords;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Paint paintDataPaint;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.daysRect.clear();
        int i = this.lines;
        CalendarViewItem calendarViewItem = null;
        int i2 = 0;
        while (i2 < i) {
            int i3 = 0;
            while (i3 < 7) {
                Rect rect = getRect(i2, i3);
                this.daysRect.add(rect);
                float fCenterX = rect.centerX();
                float fCenterY = rect.centerY();
                float fWidth = rect.width() / 2.0f;
                if (i2 == 0) {
                    canvas.drawText(TextUtils.ellipsize(this.weeks[i3], weekPaint(), rect.width() - 4, TextUtils.TruncateAt.END).toString(), fCenterX, WEEK_Y, weekPaint());
                }
                LocalDate localDate = this.days.get((i2 * 7) + i3);
                this.paint.setTextSize(DisplayUtil.dip2px(14.0f));
                float fCenterY2 = rect.centerY() + DAY_Y_OFFSET;
                LocalDate curDate = this.curDate;
                Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
                boolean zIsSameLocalDate = TimeDateUtil.isSameLocalDate(localDate, curDate);
                Map<Long, SleepRhythmCalendarDayData> map = this.dataRecords;
                if (map == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dataRecords");
                    map = null;
                }
                int i4 = i2;
                SleepRhythmCalendarDayData sleepRhythmCalendarDayData = map.get(Long.valueOf(CurseExtKt.getZeroMills(ExtUtilKt.getMills(localDate)) / ((long) 1000)));
                Drawable dayItemBackground = getDayItemBackground(sleepRhythmCalendarDayData);
                if (zIsSameLocalDate) {
                    canvas.drawCircle(fCenterX, fCenterY, fWidth, this.paintBorder);
                    if (dayItemBackground != null) {
                        Rect rect2 = this.rectBorder;
                        rect2.set(rect);
                        int i5 = BORDER_WIDTH;
                        rect2.inset(i5, i5);
                        dayItemBackground.setBounds(rect2);
                        dayItemBackground.draw(canvas);
                    }
                } else if (dayItemBackground != null) {
                    dayItemBackground.setBounds(rect);
                    dayItemBackground.draw(canvas);
                }
                if ((sleepRhythmCalendarDayData != null && sleepRhythmCalendarDayData.getType() == 2) || (sleepRhythmCalendarDayData != null && sleepRhythmCalendarDayData.getType() == 3)) {
                    canvas.drawCircle(rect.centerX(), rect.bottom + ExtUtilsKt.getDp(4), ExtUtilsKt.getDp(2), this.dotPaint);
                }
                boolean zIsToday = TimeDateUtil.isToday(localDate);
                String string = (zIsToday && LocaleUtil.INSTANCE.isSimplifiedChinese()) ? ResourceExtKt.getString(c0j.y5) : String.valueOf(localDate.getDayOfMonth());
                if ((sleepRhythmCalendarDayData != null ? sleepRhythmCalendarDayData.getRhythmInfo() : null) == null) {
                    paintDataPaint = normalTextPaint(this.month == localDate.getMonthOfYear(), zIsSameLocalDate);
                } else {
                    paintDataPaint = dayItemBackground != null ? dataPaint(sleepRhythmCalendarDayData.getType()) : dataEmptyPaint();
                }
                canvas.drawText(string, fCenterX, fCenterY2, paintDataPaint);
                if (zIsToday) {
                    calendarViewItem = new CalendarViewItem(rect, i4, i3, this.lines, 7);
                }
                i3++;
                i2 = i4;
            }
            i2++;
        }
        if (calendarViewItem == null || !this.showPopupViewEnable) {
            return;
        }
        drawBubble(canvas, calendarViewItem);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), getViewHeight());
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.columnSpace = (int) (((w - (ITEM_SIZE * 7)) - (this.paddingStartEnd * 2)) / 6.0f);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.mGestureDetector.a(event);
    }

    public final void setDate(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        if (date.isEqual(this.curDate)) {
            return;
        }
        this.curDate = date;
        invalidate();
    }

    public final void setDayOfMonth(int day) {
        TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
        LocalDate curDate = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
        this.curDate = this.curDate.withDayOfMonth(Math.min(timeDateUtil.getDaysOfMonth(ExtUtilKt.getMills(curDate)), day));
        invalidate();
    }

    public final void setOnDayClicked(@NotNull Function1<? super LocalDate, Unit> onDayClicked) {
        Intrinsics.checkNotNullParameter(onDayClicked, "onDayClicked");
        this.onDayClicked = onDayClicked;
    }

    public final void setShowPopViewEnable(boolean enable) {
        this.showPopupViewEnable = enable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmCalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SleepRhythmCalendarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmCalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        String[] stringArray = context.getResources().getStringArray(ohi.f29179b);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        this.weeks = stringArray;
        LocalDate localDateNow = LocalDate.now();
        this.curDate = localDateNow;
        this.month = localDateNow.getMonthOfYear();
        LocalDate curDate = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
        List<LocalDate> monthLocalDateCalendar = TimeDateUtil.getMonthLocalDateCalendar(curDate);
        this.days = monthLocalDateCalendar;
        this.lines = monthLocalDateCalendar.size() / 7;
        this.daysRect = new ArrayList();
        Paint paint = new Paint(1);
        this.paint = paint;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        Paint paint2 = new Paint(1);
        this.paintBorder = paint2;
        Paint paint3 = new Paint(1);
        this.dotPaint = paint3;
        this.rectBorder = new Rect();
        this.paddingStartEnd = ExtUtilsKt.getDp(20);
        this.bubblePaddingLeftEnd = ExtUtilsKt.getDp(20);
        this.bubblePaddingTopBottom = ExtUtilsKt.getDp(15);
        this.bubblePath = new Path();
        int i2 = iji.U2;
        this.bubbleColorRes = i2;
        this.bubbleStrokeColorRes = iji.s3;
        TextPaint textPaint2 = new TextPaint(1);
        this.bubbleTextPaint = textPaint2;
        Paint paint4 = new Paint(1);
        this.bubblePaint = paint4;
        Paint paint5 = new Paint(1);
        this.bubbleStrokePaint = paint5;
        this.bubbleHelpRect = new RectF();
        paint.setColor(-16777216);
        paint.setTextSize(ExtUtilsKt.getDp(14));
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint2.setColor(getColor(iji.N1));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(ExtUtilsKt.getDp(1));
        textPaint.setTextAlign(align);
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setColor(getColor(iji.N1));
        MonthViewAccessHelper monthViewAccessHelper = new MonthViewAccessHelper(this, this);
        this.accessHelper = monthViewAccessHelper;
        c.r0(this, monthViewAccessHelper);
        textPaint2.setTextAlign(align);
        textPaint2.setColor(getColor(iji.x3));
        textPaint2.setTextSize(ExtUtilsKt.getDp(14));
        paint4.setColor(getColor(i2));
        paint4.setStyle(style2);
        paint4.setShadowLayer(ExtUtilsKt.getDp(16), ExtUtilsKt.getDp(14), ExtUtilsKt.getDp(20), getColor(iji.v3));
        paint5.setStyle(style);
        this.mGestureDetector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.calendar.SleepRhythmCalendarView$mGestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                int size = this.this$0.daysRect.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (((Rect) this.this$0.daysRect.get(i3)).contains((int) e.getX(), (int) e.getY())) {
                        this.this$0.onDayClick((LocalDate) this.this$0.days.get(i3));
                        return true;
                    }
                }
                return super.onSingleTapUp(e);
            }
        });
    }
}
