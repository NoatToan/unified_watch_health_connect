package com.xiaomi.fitness.training_plan.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.util.CalendarUtilsKt;
import com.xiaomi.fitness.training_plan.widget.AbilityWeekCourseLayout;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import defpackage.csi;
import defpackage.eki;
import defpackage.ioi;
import defpackage.jvi;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001 Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00126\u0010\n\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\bH\u0002J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\bJ&\u0010\u001b\u001a\b\u0018\u00010\u0016R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\n\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\u0016R\u00020\u00000\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilityWeekCourseLayout;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "dayPlans", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "weekPosition", "", "initDayOfWeek", "onDaySelectListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "dayOfWeek", "", "dateTime", "", "<init>", "(Landroid/content/Context;Ljava/util/List;IILkotlin/jvm/functions/Function2;)V", "weekDayViewInfo", "Ljava/util/HashMap;", "Lcom/xiaomi/fitness/training_plan/widget/AbilityWeekCourseLayout$DayViewHolder;", "initView", "calcCurDayOfWeek", "day", "updateDayOfWeek", "generateDayViewHolder", "weekDayView", "Landroid/view/View;", "dataTime", "updateWeekViewHolder", "DayViewHolder", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nAbilityWeekCourseLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityWeekCourseLayout.kt\ncom/xiaomi/fitness/training_plan/widget/AbilityWeekCourseLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1872#2,3:206\n1872#2,3:209\n*S KotlinDebug\n*F\n+ 1 AbilityWeekCourseLayout.kt\ncom/xiaomi/fitness/training_plan/widget/AbilityWeekCourseLayout\n*L\n35#1:206,3\n157#1:209,3\n*E\n"})
public final class AbilityWeekCourseLayout extends FrameLayout {

    @NotNull
    private final Context ctx;
    private int dayOfWeek;

    @NotNull
    private final List<AbilityDayPlan> dayPlans;

    @NotNull
    private final Function2<Integer, Long, Unit> onDaySelectListener;

    @NotNull
    private final HashMap<Integer, DayViewHolder> weekDayViewInfo;
    private final int weekPosition;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilityWeekCourseLayout$DayViewHolder;", "", "<init>", "(Lcom/xiaomi/fitness/training_plan/widget/AbilityWeekCourseLayout;)V", "dayOfMonthTV", "Landroid/widget/TextView;", "getDayOfMonthTV", "()Landroid/widget/TextView;", "setDayOfMonthTV", "(Landroid/widget/TextView;)V", "courseIndicator", "Landroid/view/View;", "getCourseIndicator", "()Landroid/view/View;", "setCourseIndicator", "(Landroid/view/View;)V", "restTipTV", "getRestTipTV", "setRestTipTV", "dateTime", "", "getDateTime", "()J", "setDateTime", "(J)V", "selfDayOfWeek", "", "getSelfDayOfWeek", "()I", "setSelfDayOfWeek", "(I)V", "updateStatus", "", "selected", "", "isRestDay", "outOfDate", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DayViewHolder {

        @Nullable
        private View courseIndicator;

        @Nullable
        private TextView dayOfMonthTV;

        @Nullable
        private TextView restTipTV;
        private long dateTime = -1;
        private int selfDayOfWeek = -1;

        public DayViewHolder() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void updateStatus$lambda$0(AbilityWeekCourseLayout this$0, DayViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            int i = this$0.dayOfWeek;
            int i2 = this$1.selfDayOfWeek;
            if (i != i2) {
                this$0.dayOfWeek = i2;
                this$0.onDaySelectListener.invoke(Integer.valueOf(this$0.dayOfWeek), Long.valueOf(this$1.dateTime));
                this$0.updateWeekViewHolder();
            }
        }

        @Nullable
        public final View getCourseIndicator() {
            return this.courseIndicator;
        }

        public final long getDateTime() {
            return this.dateTime;
        }

        @Nullable
        public final TextView getDayOfMonthTV() {
            return this.dayOfMonthTV;
        }

        @Nullable
        public final TextView getRestTipTV() {
            return this.restTipTV;
        }

        public final int getSelfDayOfWeek() {
            return this.selfDayOfWeek;
        }

        public final void setCourseIndicator(@Nullable View view) {
            this.courseIndicator = view;
        }

        public final void setDateTime(long j) {
            this.dateTime = j;
        }

        public final void setDayOfMonthTV(@Nullable TextView textView) {
            this.dayOfMonthTV = textView;
        }

        public final void setRestTipTV(@Nullable TextView textView) {
            this.restTipTV = textView;
        }

        public final void setSelfDayOfWeek(int i) {
            this.selfDayOfWeek = i;
        }

        public final void updateStatus(boolean selected, boolean isRestDay, boolean outOfDate) {
            int color;
            TextView textView = this.dayOfMonthTV;
            if (textView != null) {
                textView.setText(CalendarUtilsKt.getDayOfMonth(this.dateTime));
            }
            if (outOfDate) {
                TextView textView2 = this.dayOfMonthTV;
                if (textView2 != null) {
                    Context context = AbilityWeekCourseLayout.this.getContext();
                    Intrinsics.checkNotNull(context);
                    textView2.setTextColor(context.getColor(eki.f));
                }
                View view = this.courseIndicator;
                if (view != null) {
                    ViewExtKt.gone(view);
                }
                TextView textView3 = this.restTipTV;
                if (textView3 != null) {
                    ViewExtKt.gone(textView3);
                    return;
                }
                return;
            }
            View view2 = this.courseIndicator;
            if (view2 != null) {
                view2.setVisibility(isRestDay ? 8 : 0);
            }
            TextView textView4 = this.restTipTV;
            if (textView4 != null) {
                textView4.setVisibility(isRestDay ? 0 : 8);
            }
            TextView textView5 = this.dayOfMonthTV;
            if (textView5 != null) {
                final AbilityWeekCourseLayout abilityWeekCourseLayout = AbilityWeekCourseLayout.this;
                textView5.setOnClickListener(new View.OnClickListener() { // from class: qu
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        AbilityWeekCourseLayout.DayViewHolder.updateStatus$lambda$0(abilityWeekCourseLayout, this, view3);
                    }
                });
            }
            TextView textView6 = this.dayOfMonthTV;
            if (textView6 != null) {
                if (selected) {
                    color = Color.parseColor("#FF612E");
                } else {
                    Context context2 = AbilityWeekCourseLayout.this.getContext();
                    Intrinsics.checkNotNull(context2);
                    color = context2.getColor(eki.d);
                }
                textView6.setTextColor(color);
            }
            View view3 = this.courseIndicator;
            if (view3 != null) {
                view3.setBackgroundResource(selected ? ioi.c : ioi.e);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbilityWeekCourseLayout(@NotNull Context ctx, @NotNull List<AbilityDayPlan> dayPlans, int i, int i2, @NotNull Function2<? super Integer, ? super Long, Unit> onDaySelectListener) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(dayPlans, "dayPlans");
        Intrinsics.checkNotNullParameter(onDaySelectListener, "onDaySelectListener");
        this.ctx = ctx;
        this.dayPlans = dayPlans;
        this.weekPosition = i;
        this.onDaySelectListener = onDaySelectListener;
        this.dayOfWeek = i2;
        this.weekDayViewInfo = new HashMap<>();
        initView();
    }

    private final void calcCurDayOfWeek(int day) {
        boolean z;
        int i;
        if (this.dayPlans.get(day - 1).getOutOfDate()) {
            int i2 = day;
            while (true) {
                if (i2 >= 8) {
                    z = false;
                    i = day;
                    break;
                } else {
                    if (!this.dayPlans.get(i2 - 1).getOutOfDate()) {
                        i = i2;
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (!z && 1 <= i) {
                int i3 = 1;
                while (true) {
                    if (!this.dayPlans.get(i3 - 1).getOutOfDate()) {
                        i = i3;
                        break;
                    } else if (i3 == i) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            int i4 = this.dayOfWeek;
            if (i != i4 || day != i4) {
                this.dayOfWeek = i;
            }
        } else {
            this.dayOfWeek = day;
        }
        this.onDaySelectListener.invoke(Integer.valueOf(this.dayOfWeek), Long.valueOf(this.dayPlans.get(this.dayOfWeek - 1).getDate()));
    }

    private final DayViewHolder generateDayViewHolder(View weekDayView, int dayOfWeek, long dataTime) {
        DayViewHolder dayViewHolder;
        DayViewHolder dayViewHolder2;
        switch (dayOfWeek) {
            case 1:
                dayViewHolder = new DayViewHolder();
                dayViewHolder.setDayOfMonthTV((TextView) weekDayView.findViewById(csi.I1));
                dayViewHolder.setCourseIndicator(weekDayView.findViewById(csi.J1));
                dayViewHolder.setRestTipTV((TextView) weekDayView.findViewById(csi.K1));
                dayViewHolder2 = dayViewHolder;
                break;
            case 2:
                dayViewHolder = new DayViewHolder();
                dayViewHolder.setDayOfMonthTV((TextView) weekDayView.findViewById(csi.M4));
                dayViewHolder.setCourseIndicator(weekDayView.findViewById(csi.N4));
                dayViewHolder.setRestTipTV((TextView) weekDayView.findViewById(csi.O4));
                dayViewHolder2 = dayViewHolder;
                break;
            case 3:
                dayViewHolder = new DayViewHolder();
                dayViewHolder.setDayOfMonthTV((TextView) weekDayView.findViewById(csi.h5));
                dayViewHolder.setCourseIndicator(weekDayView.findViewById(csi.i5));
                dayViewHolder.setRestTipTV((TextView) weekDayView.findViewById(csi.j5));
                dayViewHolder2 = dayViewHolder;
                break;
            case 4:
                dayViewHolder = new DayViewHolder();
                dayViewHolder.setDayOfMonthTV((TextView) weekDayView.findViewById(csi.B3));
                dayViewHolder.setCourseIndicator(weekDayView.findViewById(csi.C3));
                dayViewHolder.setRestTipTV((TextView) weekDayView.findViewById(csi.D3));
                dayViewHolder2 = dayViewHolder;
                break;
            case 5:
                dayViewHolder = new DayViewHolder();
                dayViewHolder.setDayOfMonthTV((TextView) weekDayView.findViewById(csi.h0));
                dayViewHolder.setCourseIndicator(weekDayView.findViewById(csi.i0));
                dayViewHolder.setRestTipTV((TextView) weekDayView.findViewById(csi.j0));
                dayViewHolder2 = dayViewHolder;
                break;
            case 6:
                dayViewHolder = new DayViewHolder();
                dayViewHolder.setDayOfMonthTV((TextView) weekDayView.findViewById(csi.M2));
                dayViewHolder.setCourseIndicator(weekDayView.findViewById(csi.N2));
                dayViewHolder.setRestTipTV((TextView) weekDayView.findViewById(csi.O2));
                dayViewHolder2 = dayViewHolder;
                break;
            case 7:
                dayViewHolder = new DayViewHolder();
                dayViewHolder.setDayOfMonthTV((TextView) weekDayView.findViewById(csi.v3));
                dayViewHolder.setCourseIndicator(weekDayView.findViewById(csi.w3));
                dayViewHolder.setRestTipTV((TextView) weekDayView.findViewById(csi.x3));
                dayViewHolder2 = dayViewHolder;
                break;
            default:
                dayViewHolder2 = null;
                break;
        }
        if (dayViewHolder2 != null) {
            dayViewHolder2.setSelfDayOfWeek(dayOfWeek);
        }
        if (dayViewHolder2 != null) {
            dayViewHolder2.setDateTime(dataTime);
        }
        return dayViewHolder2;
    }

    private final void initView() {
        View viewInflate = LayoutInflater.from(this.ctx).inflate(jvi.f23184a, this);
        int i = 0;
        for (Object obj : this.dayPlans) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            HashMap<Integer, DayViewHolder> map = this.weekDayViewInfo;
            Integer numValueOf = Integer.valueOf(i2);
            Intrinsics.checkNotNull(viewInflate);
            DayViewHolder dayViewHolderGenerateDayViewHolder = generateDayViewHolder(viewInflate, i2, ((AbilityDayPlan) obj).getDate());
            Intrinsics.checkNotNull(dayViewHolderGenerateDayViewHolder);
            map.put(numValueOf, dayViewHolderGenerateDayViewHolder);
            i = i2;
        }
        calcCurDayOfWeek(this.dayOfWeek);
        updateWeekViewHolder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWeekViewHolder() {
        int i = 0;
        for (Object obj : this.dayPlans) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            AbilityDayPlan abilityDayPlan = (AbilityDayPlan) obj;
            DayViewHolder dayViewHolder = this.weekDayViewInfo.get(Integer.valueOf(i2));
            if (dayViewHolder != null) {
                dayViewHolder.updateStatus(i2 == this.dayOfWeek, abilityDayPlan.isRestDay(), abilityDayPlan.getOutOfDate());
            }
            i = i2;
        }
    }

    public final void updateDayOfWeek(int day) {
        calcCurDayOfWeek(day);
        updateWeekViewHolder();
    }
}
