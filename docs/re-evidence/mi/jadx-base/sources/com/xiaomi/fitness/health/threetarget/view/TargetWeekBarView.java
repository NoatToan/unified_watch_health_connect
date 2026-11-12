package com.xiaomi.fitness.health.threetarget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.threetarget.view.TargetWeekBarItemView;
import com.xiaomi.fitness.health.threetarget.view.TargetWeekBarView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.ohi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J,\u0010\u001c\u001a\u00020\u00172\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0013J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010%\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView;", "Landroid/widget/LinearLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "monItemView", "Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarItemView;", "tueItemView", "wedItemView", "thuItemView", "friItemView", "satItemView", "sunItemView", "mSelectedDate", "Lorg/joda/time/LocalDate;", "onItemSelectedListener", "Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView$OnWeekBarItemSelectedListener;", "onFinishInflate", "", "setListener", "getWeekTargetItemView", "weekDay", "currentDay", "bindData", "targetReportMap", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "monday", "selectedDate", "getDataStatus", "", "report", "setOnItemSelectedListener", "OnWeekBarItemSelectedListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TargetWeekBarView extends LinearLayout {

    @Nullable
    private TargetWeekBarItemView friItemView;

    @NotNull
    private final Context mContext;

    @Nullable
    private LocalDate mSelectedDate;

    @Nullable
    private TargetWeekBarItemView monItemView;

    @Nullable
    private OnWeekBarItemSelectedListener onItemSelectedListener;

    @Nullable
    private TargetWeekBarItemView satItemView;

    @Nullable
    private TargetWeekBarItemView sunItemView;

    @Nullable
    private TargetWeekBarItemView thuItemView;

    @Nullable
    private TargetWeekBarItemView tueItemView;

    @Nullable
    private TargetWeekBarItemView wedItemView;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView$OnWeekBarItemSelectedListener;", "", "onWeekItemSelected", "", "index", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnWeekBarItemSelectedListener {
        void onWeekItemSelected(int index);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TargetWeekBarView(@NotNull Context mContext) {
        this(mContext, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    private final boolean getDataStatus(DailyGoalReport report) {
        if (report == null || !(!report.goalList().isEmpty())) {
            return false;
        }
        for (GoalItem goalItem : report.goalList()) {
            if (goalItem.getAchievedValue() < goalItem.getGoalValue()) {
                return false;
            }
        }
        return true;
    }

    private final TargetWeekBarItemView getWeekTargetItemView(int weekDay, LocalDate currentDay) {
        if (weekDay == 0) {
            TargetWeekBarItemView targetWeekBarItemView = this.monItemView;
            if (targetWeekBarItemView != null) {
                targetWeekBarItemView.setContentDescription(ApplicationExtKt.getApplication().getString(c0j.Rq, ApplicationExtKt.getApplication().getString(c0j.iq)) + currentDay);
            }
            return this.monItemView;
        }
        if (weekDay == 1) {
            TargetWeekBarItemView targetWeekBarItemView2 = this.tueItemView;
            if (targetWeekBarItemView2 != null) {
                targetWeekBarItemView2.setContentDescription(ApplicationExtKt.getApplication().getString(c0j.Rq, ApplicationExtKt.getApplication().getString(c0j.Uq)) + currentDay);
            }
            return this.tueItemView;
        }
        if (weekDay == 2) {
            TargetWeekBarItemView targetWeekBarItemView3 = this.wedItemView;
            if (targetWeekBarItemView3 != null) {
                targetWeekBarItemView3.setContentDescription(ApplicationExtKt.getApplication().getString(c0j.Rq, ApplicationExtKt.getApplication().getString(c0j.br)) + currentDay);
            }
            return this.wedItemView;
        }
        if (weekDay == 3) {
            TargetWeekBarItemView targetWeekBarItemView4 = this.thuItemView;
            if (targetWeekBarItemView4 != null) {
                targetWeekBarItemView4.setContentDescription(ApplicationExtKt.getApplication().getString(c0j.Rq, ApplicationExtKt.getApplication().getString(c0j.Tq)) + currentDay);
            }
            return this.thuItemView;
        }
        if (weekDay == 4) {
            TargetWeekBarItemView targetWeekBarItemView5 = this.friItemView;
            if (targetWeekBarItemView5 != null) {
                targetWeekBarItemView5.setContentDescription(ApplicationExtKt.getApplication().getString(c0j.Rq, ApplicationExtKt.getApplication().getString(c0j.u)) + currentDay);
            }
            return this.friItemView;
        }
        if (weekDay != 5) {
            TargetWeekBarItemView targetWeekBarItemView6 = this.sunItemView;
            if (targetWeekBarItemView6 != null) {
                targetWeekBarItemView6.setContentDescription(ApplicationExtKt.getApplication().getString(c0j.Rq, ApplicationExtKt.getApplication().getString(c0j.zq)) + currentDay);
            }
            return this.sunItemView;
        }
        TargetWeekBarItemView targetWeekBarItemView7 = this.satItemView;
        if (targetWeekBarItemView7 != null) {
            targetWeekBarItemView7.setContentDescription(ApplicationExtKt.getApplication().getString(c0j.Rq, ApplicationExtKt.getApplication().getString(c0j.sq)) + currentDay);
        }
        return this.satItemView;
    }

    private final void setListener() {
        TargetWeekBarItemView targetWeekBarItemView = this.monItemView;
        if (targetWeekBarItemView != null) {
            ViewExtKt.clickWithTrigger$default(targetWeekBarItemView, 0L, new Function1() { // from class: d1p
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TargetWeekBarView.setListener$lambda$0(this.f14975a, (TargetWeekBarItemView) obj);
                }
            }, 1, null);
        }
        TargetWeekBarItemView targetWeekBarItemView2 = this.tueItemView;
        if (targetWeekBarItemView2 != null) {
            ViewExtKt.clickWithTrigger$default(targetWeekBarItemView2, 0L, new Function1() { // from class: e1p
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TargetWeekBarView.setListener$lambda$1(this.f16172a, (TargetWeekBarItemView) obj);
                }
            }, 1, null);
        }
        TargetWeekBarItemView targetWeekBarItemView3 = this.wedItemView;
        if (targetWeekBarItemView3 != null) {
            ViewExtKt.clickWithTrigger$default(targetWeekBarItemView3, 0L, new Function1() { // from class: f1p
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TargetWeekBarView.setListener$lambda$2(this.f17302a, (TargetWeekBarItemView) obj);
                }
            }, 1, null);
        }
        TargetWeekBarItemView targetWeekBarItemView4 = this.thuItemView;
        if (targetWeekBarItemView4 != null) {
            ViewExtKt.clickWithTrigger$default(targetWeekBarItemView4, 0L, new Function1() { // from class: g1p
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TargetWeekBarView.setListener$lambda$3(this.f18478a, (TargetWeekBarItemView) obj);
                }
            }, 1, null);
        }
        TargetWeekBarItemView targetWeekBarItemView5 = this.friItemView;
        if (targetWeekBarItemView5 != null) {
            ViewExtKt.clickWithTrigger$default(targetWeekBarItemView5, 0L, new Function1() { // from class: h1p
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TargetWeekBarView.setListener$lambda$4(this.f19585a, (TargetWeekBarItemView) obj);
                }
            }, 1, null);
        }
        TargetWeekBarItemView targetWeekBarItemView6 = this.satItemView;
        if (targetWeekBarItemView6 != null) {
            ViewExtKt.clickWithTrigger$default(targetWeekBarItemView6, 0L, new Function1() { // from class: i1p
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TargetWeekBarView.setListener$lambda$5(this.f20667a, (TargetWeekBarItemView) obj);
                }
            }, 1, null);
        }
        TargetWeekBarItemView targetWeekBarItemView7 = this.sunItemView;
        if (targetWeekBarItemView7 != null) {
            ViewExtKt.clickWithTrigger$default(targetWeekBarItemView7, 0L, new Function1() { // from class: j1p
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TargetWeekBarView.setListener$lambda$6(this.f22334a, (TargetWeekBarItemView) obj);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$0(TargetWeekBarView this$0, TargetWeekBarItemView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        OnWeekBarItemSelectedListener onWeekBarItemSelectedListener = this$0.onItemSelectedListener;
        if (onWeekBarItemSelectedListener != null) {
            Intrinsics.checkNotNull(onWeekBarItemSelectedListener);
            onWeekBarItemSelectedListener.onWeekItemSelected(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$1(TargetWeekBarView this$0, TargetWeekBarItemView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        OnWeekBarItemSelectedListener onWeekBarItemSelectedListener = this$0.onItemSelectedListener;
        if (onWeekBarItemSelectedListener != null) {
            Intrinsics.checkNotNull(onWeekBarItemSelectedListener);
            onWeekBarItemSelectedListener.onWeekItemSelected(1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$2(TargetWeekBarView this$0, TargetWeekBarItemView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        OnWeekBarItemSelectedListener onWeekBarItemSelectedListener = this$0.onItemSelectedListener;
        if (onWeekBarItemSelectedListener != null) {
            Intrinsics.checkNotNull(onWeekBarItemSelectedListener);
            onWeekBarItemSelectedListener.onWeekItemSelected(2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3(TargetWeekBarView this$0, TargetWeekBarItemView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        OnWeekBarItemSelectedListener onWeekBarItemSelectedListener = this$0.onItemSelectedListener;
        if (onWeekBarItemSelectedListener != null) {
            Intrinsics.checkNotNull(onWeekBarItemSelectedListener);
            onWeekBarItemSelectedListener.onWeekItemSelected(3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$4(TargetWeekBarView this$0, TargetWeekBarItemView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        OnWeekBarItemSelectedListener onWeekBarItemSelectedListener = this$0.onItemSelectedListener;
        if (onWeekBarItemSelectedListener != null) {
            Intrinsics.checkNotNull(onWeekBarItemSelectedListener);
            onWeekBarItemSelectedListener.onWeekItemSelected(4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$5(TargetWeekBarView this$0, TargetWeekBarItemView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        OnWeekBarItemSelectedListener onWeekBarItemSelectedListener = this$0.onItemSelectedListener;
        if (onWeekBarItemSelectedListener != null) {
            Intrinsics.checkNotNull(onWeekBarItemSelectedListener);
            onWeekBarItemSelectedListener.onWeekItemSelected(5);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$6(TargetWeekBarView this$0, TargetWeekBarItemView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        OnWeekBarItemSelectedListener onWeekBarItemSelectedListener = this$0.onItemSelectedListener;
        if (onWeekBarItemSelectedListener != null) {
            Intrinsics.checkNotNull(onWeekBarItemSelectedListener);
            onWeekBarItemSelectedListener.onWeekItemSelected(6);
        }
        return Unit.INSTANCE;
    }

    public final void bindData(@NotNull Map<LocalDate, DailyGoalReport> targetReportMap, @NotNull LocalDate monday, @Nullable LocalDate selectedDate) {
        Intrinsics.checkNotNullParameter(targetReportMap, "targetReportMap");
        Intrinsics.checkNotNullParameter(monday, "monday");
        Intrinsics.checkNotNullExpressionValue(this.mContext.getResources().getStringArray(ohi.f29178a), "getStringArray(...)");
        this.mSelectedDate = selectedDate;
        for (int i = 0; i < 7; i++) {
            LocalDate localDatePlusDays = monday.plusDays(i);
            DailyGoalReport dailyGoalReport = targetReportMap.get(localDatePlusDays);
            Intrinsics.checkNotNull(localDatePlusDays);
            TargetWeekBarItemView weekTargetItemView = getWeekTargetItemView(i, localDatePlusDays);
            String strValueOf = String.valueOf(localDatePlusDays.getDayOfMonth());
            if (dailyGoalReport != null) {
                Intrinsics.checkNotNull(weekTargetItemView);
                Intrinsics.checkNotNull(selectedDate);
                weekTargetItemView.a(strValueOf, dailyGoalReport, TimeDateUtil.isSameLocalDate(localDatePlusDays, selectedDate));
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.monItemView = (TargetWeekBarItemView) findViewById(eri.gi);
        this.tueItemView = (TargetWeekBarItemView) findViewById(eri.mi);
        this.wedItemView = (TargetWeekBarItemView) findViewById(eri.oi);
        this.thuItemView = (TargetWeekBarItemView) findViewById(eri.li);
        this.friItemView = (TargetWeekBarItemView) findViewById(eri.ei);
        this.satItemView = (TargetWeekBarItemView) findViewById(eri.ji);
        this.sunItemView = (TargetWeekBarItemView) findViewById(eri.ki);
        setListener();
    }

    public final void setOnItemSelectedListener(@Nullable OnWeekBarItemSelectedListener onItemSelectedListener) {
        this.onItemSelectedListener = onItemSelectedListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TargetWeekBarView(@NotNull Context mContext, @Nullable AttributeSet attributeSet) {
        this(mContext, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    public /* synthetic */ TargetWeekBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TargetWeekBarView(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        LayoutInflater.from(mContext).inflate(jui.K8, this);
    }
}
