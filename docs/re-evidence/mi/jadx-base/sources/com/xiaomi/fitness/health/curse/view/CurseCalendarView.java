package com.xiaomi.fitness.health.curse.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
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
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.data.DayData;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.onetrack.api.b;
import defpackage.iji;
import defpackage.m80;
import defpackage.mj8;
import defpackage.ni4;
import defpackage.ohi;
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
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001QB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ7\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\f2\"\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160/j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016`.¢\u0006\u0002\u00100J\u000e\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\u0007J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0017J\u0010\u00109\u001a\u00020\r2\u0006\u0010-\u001a\u00020\fH\u0002J\u0010\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020<H\u0014J\b\u0010=\u001a\u00020!H\u0002J\b\u0010>\u001a\u00020#H\u0002J\b\u0010?\u001a\u00020!H\u0002J\u0018\u0010@\u001a\u00020!2\u0006\u0010A\u001a\u0002042\u0006\u0010B\u001a\u000204H\u0002J(\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u0007H\u0014J\b\u0010H\u001a\u00020!H\u0002J\u0012\u0010I\u001a\u00020\u00072\b\b\u0001\u0010J\u001a\u00020\u0007H\u0002J\u0018\u0010K\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0007H\u0002J\u001a\u0010N\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\u000e\u0010O\u001a\u00020\r2\u0006\u0010-\u001a\u00020\fJ\u0012\u0010P\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0014R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u000e\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010 \u0011*\u0012\u0012\u000e\b\u0001\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f0\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082.¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\f0\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0012\u0010*\u001a\u00060+R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/CurseCalendarView;", "Landroid/view/View;", "ctx", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onDayClicked", "Lkotlin/Function1;", "Lorg/joda/time/LocalDate;", "", "weeks", "", "", "kotlin.jvm.PlatformType", "[Ljava/lang/String;", "dataRecords", "", "", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "curDate", "Lorg/joda/time/LocalDate;", "month", "days", "", "lines", "daysRect", "", "Landroid/graphics/Rect;", "paint", "Landroid/graphics/Paint;", "textPaint", "Landroid/text/TextPaint;", "paintBorder", "columnSpace", "rectBorder", "viewHeight", "getViewHeight", "()I", "accessHelper", "Lcom/xiaomi/fitness/health/curse/view/CurseCalendarView$MonthViewAccessHelper;", "initDate", DialWidgetType.DATE, "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(Lorg/joda/time/LocalDate;Ljava/util/HashMap;)V", "setDayOfMonth", "day", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "mGestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "onDayClick", "onDraw", "canvas", "Landroid/graphics/Canvas;", "disablePaint", "weekPaint", "dataPaint", "normalTextPaint", "isInCurMonth", "selected", "onSizeChanged", Constants.DEVICE_TYPE_WEAR, "h", "oldw", "oldh", "dataEmptyPaint", "getColor", "colorRes", "getRect", "line", "column", "setOnDayClicked", "setDate", "dispatchHoverEvent", "MonthViewAccessHelper", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCurseCalendarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseCalendarView.kt\ncom/xiaomi/fitness/health/curse/view/CurseCalendarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,330:1\n1#2:331\n*E\n"})
public final class CurseCalendarView extends View {

    @NotNull
    private MonthViewAccessHelper accessHelper;
    private int columnSpace;
    private LocalDate curDate;
    private Map<Long, DayData> dataRecords;

    @NotNull
    private List<LocalDate> days;

    @NotNull
    private final List<Rect> daysRect;
    private int lines;

    @NotNull
    private final GestureDetectorCompat mGestureDetector;
    private int month;

    @Nullable
    private Function1<? super LocalDate, Unit> onDayClicked;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Paint paintBorder;

    @NotNull
    private final Rect rectBorder;

    @NotNull
    private final TextPaint textPaint;

    @NotNull
    private String[] weeks;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/CurseCalendarView$MonthViewAccessHelper;", "Lmj8;", "", "x", "y", "", "getVirtualViewAt", "(FF)I", "", "virtualViewIds", "", "getVisibleVirtualViews", "(Ljava/util/List;)V", "virtualViewId", "Lm80;", "node", "onPopulateNodeForVirtualView", "(ILm80;)V", "action", "Landroid/os/Bundle;", "arguments", "", "onPerformActionForVirtualView", "(IILandroid/os/Bundle;)Z", "Landroid/graphics/Rect;", "mRectBounds", "Landroid/graphics/Rect;", "Landroid/view/View;", b.E, "<init>", "(Lcom/xiaomi/fitness/health/curse/view/CurseCalendarView;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nCurseCalendarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseCalendarView.kt\ncom/xiaomi/fitness/health/curse/view/CurseCalendarView$MonthViewAccessHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,330:1\n1872#2,3:331\n*S KotlinDebug\n*F\n+ 1 CurseCalendarView.kt\ncom/xiaomi/fitness/health/curse/view/CurseCalendarView$MonthViewAccessHelper\n*L\n291#1:331,3\n*E\n"})
    public final class MonthViewAccessHelper extends mj8 {

        @NotNull
        private Rect mRectBounds;
        final /* synthetic */ CurseCalendarView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MonthViewAccessHelper(@NotNull CurseCalendarView curseCalendarView, View host) {
            super(host);
            Intrinsics.checkNotNullParameter(host, "host");
            this.this$0 = curseCalendarView;
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
            CurseCalendarView curseCalendarView = this.this$0;
            curseCalendarView.onDayClick((LocalDate) curseCalendarView.days.get(virtualViewId));
            return false;
        }

        @Override // defpackage.mj8
        public void onPopulateNodeForVirtualView(int virtualViewId, @NotNull m80 node) {
            Intrinsics.checkNotNullParameter(node, "node");
            Logger.i("CurseCalendarView", "onPopulateNodeForVirtualView id " + virtualViewId);
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
    public CurseCalendarView(@NotNull Context ctx) {
        this(ctx, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final Paint dataEmptyPaint() {
        Paint paint = this.paint;
        paint.setColor(getColor(iji.e0));
        return paint;
    }

    private final Paint dataPaint() {
        Paint paint = this.paint;
        paint.setColor(getColor(iji.d0));
        return paint;
    }

    private final Paint disablePaint() {
        Paint paint = this.paint;
        paint.setColor(getColor(iji.u3));
        return paint;
    }

    private final int getColor(int colorRes) {
        return ni4.c(ApplicationExtKt.getApplication(), colorRes);
    }

    private final Rect getRect(int line, int column) {
        if (AppUtil.isRTLDirection()) {
            int right = getRight() - ((column * (CurseCalendarViewKt.ITEM_SIZE + this.columnSpace)) + CurseCalendarViewKt.PADDING_START);
            int i = right - CurseCalendarViewKt.ITEM_SIZE;
            int i2 = (line * (CurseCalendarViewKt.ITEM_SIZE + CurseCalendarViewKt.LINE_SPACE)) + CurseCalendarViewKt.DAY_TO_WEEK + (CurseCalendarViewKt.LINE_SPACE / 2);
            return new Rect(i, i2, right, CurseCalendarViewKt.ITEM_SIZE + i2);
        }
        int i3 = (column * (CurseCalendarViewKt.ITEM_SIZE + this.columnSpace)) + CurseCalendarViewKt.PADDING_START;
        int i4 = CurseCalendarViewKt.ITEM_SIZE + i3;
        int i5 = (line * (CurseCalendarViewKt.ITEM_SIZE + CurseCalendarViewKt.LINE_SPACE)) + CurseCalendarViewKt.DAY_TO_WEEK + (CurseCalendarViewKt.LINE_SPACE / 2);
        return new Rect(i3, i5, i4, CurseCalendarViewKt.ITEM_SIZE + i5);
    }

    private final Paint normalTextPaint(boolean isInCurMonth, boolean selected) {
        int i;
        Paint paint = this.paint;
        if (selected) {
            i = iji.f0;
        } else {
            i = isInCurMonth ? iji.e0 : iji.u3;
        }
        paint.setColor(getColor(i));
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDayClick(LocalDate date) {
        Logger.d("CurseCalendarView", "onDayClick: " + date);
        Function1<? super LocalDate, Unit> function1 = this.onDayClicked;
        if (function1 != null) {
            function1.invoke2(date);
        }
        this.curDate = date;
    }

    private final TextPaint weekPaint() {
        TextPaint textPaint = this.textPaint;
        textPaint.setColor(getColor(iji.g0));
        textPaint.setTextSize(CurseCalendarViewKt.WEEK_TXT_SIZE);
        return textPaint;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@Nullable MotionEvent event) {
        MonthViewAccessHelper monthViewAccessHelper = this.accessHelper;
        Intrinsics.checkNotNull(event);
        return monthViewAccessHelper.dispatchHoverEvent(event) || super.dispatchHoverEvent(event);
    }

    public final int getViewHeight() {
        return (this.lines * (CurseCalendarViewKt.ITEM_SIZE + CurseCalendarViewKt.LINE_SPACE)) + CurseCalendarViewKt.DAY_TO_WEEK;
    }

    public final void initDate(@NotNull LocalDate date, @NotNull HashMap<Long, DayData> dataRecords) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(dataRecords, "dataRecords");
        this.curDate = date;
        this.month = date.getMonthOfYear();
        LocalDate curDate = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
        List<LocalDate> monthLocalDateCalendar = TimeDateUtil.getMonthLocalDateCalendar(curDate);
        this.days = monthLocalDateCalendar;
        this.lines = monthLocalDateCalendar.size() / 7;
        Logger.d("CurseCalendarView", "initDate: data = " + date + "; cur =" + this.curDate + "; viewHeight = " + getViewHeight());
        this.dataRecords = dataRecords;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00a0  */
    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        boolean zIsIn;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Logger.d("CurseCalendarView", "onDraw " + this.curDate);
        this.daysRect.clear();
        int i = this.lines;
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < 7; i3++) {
                Rect rect = getRect(i2, i3);
                this.daysRect.add(rect);
                float fCenterX = rect.centerX();
                float fCenterY = rect.centerY();
                float fWidth = rect.width() / 2.0f;
                if (i2 == 0) {
                    canvas.drawText(TextUtils.ellipsize(this.weeks[i3], weekPaint(), rect.width() - 4, TextUtils.TruncateAt.END).toString(), fCenterX, CurseCalendarViewKt.WEEK_Y, weekPaint());
                }
                LocalDate localDate = this.days.get((i2 * 7) + i3);
                this.paint.setTextSize(DisplayUtil.dip2px(14.0f));
                float fCenterY2 = rect.centerY() + CurseCalendarViewKt.DAY_Y_OFFSET;
                LocalDate curDate = this.curDate;
                Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
                boolean zIsSameLocalDate = TimeDateUtil.isSameLocalDate(localDate, curDate);
                Map<Long, DayData> map = this.dataRecords;
                if (map != null) {
                    if (map == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dataRecords");
                        map = null;
                    }
                    DayData dayData = map.get(Long.valueOf(CurseExtKt.getZeroMills(ExtUtilKt.getMills(localDate))));
                    if (dayData != null) {
                        zIsIn = dayData.isIn();
                    } else {
                        zIsIn = false;
                    }
                } else {
                    zIsIn = false;
                }
                CurseManager.Companion companion = CurseManager.INSTANCE;
                Drawable dayBg = companion.getInstance().getDayBg(localDate, zIsIn, zIsSameLocalDate);
                if (zIsSameLocalDate) {
                    canvas.drawCircle(fCenterX, fCenterY, fWidth, this.paintBorder);
                    if (dayBg != null) {
                        Rect rect2 = this.rectBorder;
                        rect2.set(rect);
                        rect2.inset(CurseCalendarViewKt.BORDER_WIDTH, CurseCalendarViewKt.BORDER_WIDTH);
                        dayBg.setBounds(rect2);
                        dayBg.draw(canvas);
                    }
                } else if (dayBg != null) {
                    dayBg.setBounds(rect);
                    dayBg.draw(canvas);
                }
                canvas.drawText(String.valueOf(localDate.getDayOfMonth()), fCenterX, fCenterY2, companion.getInstance().isNormalDay(localDate, zIsIn) ? normalTextPaint(this.month == localDate.getMonthOfYear(), zIsSameLocalDate) : dayBg != null ? dataPaint() : dataEmptyPaint());
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.columnSpace = (int) (((w - (CurseCalendarViewKt.ITEM_SIZE * 7)) - (CurseCalendarViewKt.PADDING_START * 2)) / 6.0f);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.mGestureDetector.a(event);
    }

    public final void setDate(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Logger.d("CurseCalendarView", "setDate " + date);
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
        LocalDate localDateWithDayOfMonth = this.curDate.withDayOfMonth(Math.min(timeDateUtil.getDaysOfMonth(ExtUtilKt.getMills(curDate)), day));
        this.curDate = localDateWithDayOfMonth;
        Logger.d("CurseCalendarView", "setDayOfMonth " + localDateWithDayOfMonth);
        invalidate();
    }

    public final void setOnDayClicked(@NotNull Function1<? super LocalDate, Unit> onDayClicked) {
        Intrinsics.checkNotNullParameter(onDayClicked, "onDayClicked");
        this.onDayClicked = onDayClicked;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseCalendarView(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        this(ctx, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    public /* synthetic */ CurseCalendarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseCalendarView(@NotNull Context ctx, @Nullable AttributeSet attributeSet, int i) {
        super(ctx, attributeSet, i);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        String[] stringArray = getContext().getResources().getStringArray(ohi.f29179b);
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
        this.rectBorder = new Rect();
        paint.setColor(-16777216);
        paint.setTextSize(DisplayUtil.dip2px(14.0f));
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint2.setColor(getColor(iji.g0));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(DisplayUtil.dip2px(1.0f));
        textPaint.setTextAlign(align);
        MonthViewAccessHelper monthViewAccessHelper = new MonthViewAccessHelper(this, this);
        this.accessHelper = monthViewAccessHelper;
        c.r0(this, monthViewAccessHelper);
        this.mGestureDetector = new GestureDetectorCompat(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.xiaomi.fitness.health.curse.view.CurseCalendarView$mGestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                int size = this.this$0.daysRect.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((Rect) this.this$0.daysRect.get(i2)).contains((int) e.getX(), (int) e.getY())) {
                        LocalDate localDate = (LocalDate) this.this$0.days.get(i2);
                        LocalDate localDate2 = this.this$0.curDate;
                        Intrinsics.checkNotNullExpressionValue(localDate2, "access$getCurDate$p(...)");
                        if (TimeDateUtil.isSameLocalDate(localDate, localDate2)) {
                            return false;
                        }
                        this.this$0.onDayClick(localDate);
                        return true;
                    }
                }
                return super.onSingleTapUp(e);
            }
        });
    }
}
