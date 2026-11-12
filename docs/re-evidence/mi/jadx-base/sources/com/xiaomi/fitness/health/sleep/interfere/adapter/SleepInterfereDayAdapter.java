package com.xiaomi.fitness.health.sleep.interfere.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.interfere.adapter.SleepInterfereDayAdapter;
import com.xiaomi.fitness.health.sleep.interfere.net.ModelsKt;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereDayTask;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereTaskItem;
import com.xiaomi.fitness.health.sleep.interfere.utils.CalendarUtils;
import com.xiaomi.fitness.health.sleep.interfere.widget.ProgressCircle;
import defpackage.aod;
import defpackage.iji;
import defpackage.ohi;
import defpackage.pni;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001&B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0018\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\bJ\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0007H\u0007J\u001c\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007H\u0016J\b\u0010#\u001a\u00020\u0007H\u0016J\u001c\u0010$\u001a\u00020\t2\n\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereDayAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereDayAdapter$SleepInterfereDayViewHolder;", "ctx", "Landroid/content/Context;", "onItemSelected", "Lkotlin/Function2;", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "getCtx", "()Landroid/content/Context;", "getOnItemSelected", "()Lkotlin/jvm/functions/Function2;", "daysTasks", "Ljava/util/ArrayList;", "dayArray", "", "", "getDayArray", "()[Ljava/lang/String;", "[Ljava/lang/String;", "setTasks", "tasks", "", "updateDayTask", "dTask", "updateSelectedDay", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "SleepInterfereDayViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepInterfereDayAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereDayAdapter.kt\ncom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereDayAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n1872#2,3:129\n1872#2,3:132\n*S KotlinDebug\n*F\n+ 1 SleepInterfereDayAdapter.kt\ncom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereDayAdapter\n*L\n36#1:129,3\n50#1:132,3\n*E\n"})
public final class SleepInterfereDayAdapter extends RecyclerView.Adapter<SleepInterfereDayViewHolder> {

    @NotNull
    private final Context ctx;

    @NotNull
    private final String[] dayArray;

    @NotNull
    private final ArrayList<SleepInterfereDayTask> daysTasks;

    @NotNull
    private final Function2<Integer, SleepInterfereDayTask, Unit> onItemSelected;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereDayAdapter$SleepInterfereDayViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", "task", "Lkotlin/Pair;", "", "collectTaskStatus", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;)Lkotlin/Pair;", "position", "", "bindData", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;I)V", "Laod;", "binding", "Laod;", "getBinding", "()Laod;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereDayAdapter;Laod;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSleepInterfereDayAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereDayAdapter.kt\ncom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereDayAdapter$SleepInterfereDayViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n1863#2,2:129\n*S KotlinDebug\n*F\n+ 1 SleepInterfereDayAdapter.kt\ncom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereDayAdapter$SleepInterfereDayViewHolder\n*L\n120#1:129,2\n*E\n"})
    public final class SleepInterfereDayViewHolder extends RecyclerView.d0 {

        @NotNull
        private final aod binding;
        final /* synthetic */ SleepInterfereDayAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepInterfereDayViewHolder(@NotNull SleepInterfereDayAdapter sleepInterfereDayAdapter, aod binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = sleepInterfereDayAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(SleepInterfereDayAdapter this$0, int i, SleepInterfereDayTask task, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(task, "$task");
            this$0.getOnItemSelected().invoke(Integer.valueOf(i), task);
        }

        private final Pair<Integer, Integer> collectTaskStatus(SleepInterfereDayTask task) {
            List<SleepInterfereTaskItem> tasks = task.getTasks();
            int i = 0;
            int size = tasks != null ? tasks.size() : 0;
            List<SleepInterfereTaskItem> tasks2 = task.getTasks();
            if (tasks2 != null) {
                Iterator<T> it = tasks2.iterator();
                while (it.hasNext()) {
                    if (ModelsKt.isCompleted((SleepInterfereTaskItem) it.next())) {
                        i++;
                    }
                }
            }
            return new Pair<>(Integer.valueOf(size), Integer.valueOf(i));
        }

        public final void bindData(@NotNull final SleepInterfereDayTask task, final int position) {
            Intrinsics.checkNotNullParameter(task, "task");
            Pair<Integer, Integer> pairCollectTaskStatus = collectTaskStatus(task);
            int iIntValue = pairCollectTaskStatus.getFirst().intValue();
            int iIntValue2 = pairCollectTaskStatus.getSecond().intValue();
            CalendarUtils calendarUtils = CalendarUtils.INSTANCE;
            int iCalcMonthDay = calendarUtils.calcMonthDay(task.getDate());
            int iCalcWeekDay = calendarUtils.calcWeekDay(task.getDate());
            this.binding.C.setText(String.valueOf(iCalcMonthDay));
            this.binding.E.setText(iCalcWeekDay == 1 ? this.this$0.getDayArray()[6] : this.this$0.getDayArray()[iCalcWeekDay - 2]);
            if (iIntValue == 0 || iIntValue2 == 0) {
                ProgressCircle progress = this.binding.D;
                Intrinsics.checkNotNullExpressionValue(progress, "progress");
                ViewExtKt.gone(progress);
                TextView monthDay = this.binding.C;
                Intrinsics.checkNotNullExpressionValue(monthDay, "monthDay");
                ViewExtKt.visible(monthDay);
                ImageView completeDay = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(completeDay, "completeDay");
                ViewExtKt.gone(completeDay);
                View defaultDayBg = this.binding.B;
                Intrinsics.checkNotNullExpressionValue(defaultDayBg, "defaultDayBg");
                ViewExtKt.visible(defaultDayBg);
            } else if (iIntValue == iIntValue2) {
                ProgressCircle progress2 = this.binding.D;
                Intrinsics.checkNotNullExpressionValue(progress2, "progress");
                ViewExtKt.gone(progress2);
                TextView monthDay2 = this.binding.C;
                Intrinsics.checkNotNullExpressionValue(monthDay2, "monthDay");
                ViewExtKt.gone(monthDay2);
                ImageView completeDay2 = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(completeDay2, "completeDay");
                ViewExtKt.visible(completeDay2);
                View defaultDayBg2 = this.binding.B;
                Intrinsics.checkNotNullExpressionValue(defaultDayBg2, "defaultDayBg");
                ViewExtKt.visible(defaultDayBg2);
            } else {
                ProgressCircle progress3 = this.binding.D;
                Intrinsics.checkNotNullExpressionValue(progress3, "progress");
                ViewExtKt.visible(progress3);
                TextView monthDay3 = this.binding.C;
                Intrinsics.checkNotNullExpressionValue(monthDay3, "monthDay");
                ViewExtKt.visible(monthDay3);
                ImageView completeDay3 = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(completeDay3, "completeDay");
                ViewExtKt.gone(completeDay3);
                View defaultDayBg3 = this.binding.B;
                Intrinsics.checkNotNullExpressionValue(defaultDayBg3, "defaultDayBg");
                ViewExtKt.invisible(defaultDayBg3);
                this.binding.D.updateProgress(iIntValue2 / iIntValue);
            }
            if (task.getSelected()) {
                View weekDaySelectedBg = this.binding.F;
                Intrinsics.checkNotNullExpressionValue(weekDaySelectedBg, "weekDaySelectedBg");
                ViewExtKt.visible(weekDaySelectedBg);
                this.binding.E.setTextColor(this.this$0.getCtx().getColor(iji.I3));
                this.binding.getRoot().setBackgroundResource(pni.u3);
            } else {
                View weekDaySelectedBg2 = this.binding.F;
                Intrinsics.checkNotNullExpressionValue(weekDaySelectedBg2, "weekDaySelectedBg");
                ViewExtKt.invisible(weekDaySelectedBg2);
                this.binding.E.setTextColor(this.this$0.getCtx().getColor(iji.y3));
                this.binding.getRoot().setBackground(null);
            }
            View root = this.binding.getRoot();
            final SleepInterfereDayAdapter sleepInterfereDayAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: inm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepInterfereDayAdapter.SleepInterfereDayViewHolder.bindData$lambda$0(sleepInterfereDayAdapter, position, task, view);
                }
            });
        }

        @NotNull
        public final aod getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepInterfereDayAdapter(@NotNull Context ctx, @NotNull Function2<? super Integer, ? super SleepInterfereDayTask, Unit> onItemSelected) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        this.ctx = ctx;
        this.onItemSelected = onItemSelected;
        this.daysTasks = new ArrayList<>();
        this.dayArray = ResourceExtKt.getStringArray(ctx, ohi.f29178a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int setTasks$lambda$0(SleepInterfereDayTask sleepInterfereDayTask, SleepInterfereDayTask sleepInterfereDayTask2) {
        return (int) ((sleepInterfereDayTask != null ? sleepInterfereDayTask.getDate() : 0L) - (sleepInterfereDayTask2 != null ? sleepInterfereDayTask2.getDate() : 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int setTasks$lambda$1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }

    @NotNull
    public final String[] getDayArray() {
        return this.dayArray;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.daysTasks.size();
    }

    @NotNull
    public final Function2<Integer, SleepInterfereDayTask, Unit> getOnItemSelected() {
        return this.onItemSelected;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setTasks(@NotNull List<SleepInterfereDayTask> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.daysTasks.clear();
        this.daysTasks.addAll(tasks);
        ArrayList<SleepInterfereDayTask> arrayList = this.daysTasks;
        final Function2 function2 = new Function2() { // from class: gnm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SleepInterfereDayAdapter.setTasks$lambda$0((SleepInterfereDayTask) obj, (SleepInterfereDayTask) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: hnm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepInterfereDayAdapter.setTasks$lambda$1(function2, obj, obj2);
            }
        });
        notifyDataSetChanged();
    }

    public final void updateDayTask(@NotNull SleepInterfereDayTask dTask) {
        Intrinsics.checkNotNullParameter(dTask, "dTask");
        int i = 0;
        int i2 = -1;
        for (Object obj : this.daysTasks) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (dTask.getDate() == ((SleepInterfereDayTask) obj).getDate()) {
                i2 = i;
            }
            i = i3;
        }
        if (i2 > -1) {
            this.daysTasks.set(i2, dTask);
            notifyItemChanged(i2);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateSelectedDay(int position) {
        int i = 0;
        for (Object obj : this.daysTasks) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((SleepInterfereDayTask) obj).setSelected(i == position);
            i = i2;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepInterfereDayViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SleepInterfereDayTask sleepInterfereDayTask = this.daysTasks.get(position);
        Intrinsics.checkNotNullExpressionValue(sleepInterfereDayTask, "get(...)");
        holder.bindData(sleepInterfereDayTask, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepInterfereDayViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        aod aodVarA0 = aod.A0(LayoutInflater.from(this.ctx));
        Intrinsics.checkNotNullExpressionValue(aodVarA0, "inflate(...)");
        return new SleepInterfereDayViewHolder(this, aodVarA0);
    }
}
