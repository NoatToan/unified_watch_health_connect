package com.xiaomi.fitness.health.sleep.interfere.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.health.sleep.interfere.adapter.SleepInterfereTaskAdapter;
import com.xiaomi.fitness.health.sleep.interfere.net.ModelsKt;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereDayTask;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereTaskItem;
import com.xiaomi.fitness.health.sleep.interfere.utils.SleepInterferePreference;
import com.xiaomi.fitness.health.sleep.interfere.utils.TaskInfoUtils;
import defpackage.c0j;
import defpackage.cod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002./Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012V\u0010\u0005\u001aR\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bJ\u0012\u0010\"\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0007J\b\u0010%\u001a\u00020\u000fH\u0002J\u001c\u0010&\u001a\u00060\u0002R\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001bH\u0016J\b\u0010*\u001a\u00020\u001bH\u0016J\u001c\u0010+\u001a\u00020\u000f2\n\u0010,\u001a\u00060\u0002R\u00020\u00002\u0006\u0010-\u001a\u00020\u001bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ra\u0010\u0005\u001aR\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereTaskAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereTaskAdapter$SleepInterfereDayTaskViewHolder;", "ctx", "Landroid/content/Context;", "onCheckChanged", "Lkotlin/Function4;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", "", "Lkotlin/ParameterName;", "name", "type", "", "checked", "Lkotlin/Function2;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function4;)V", "getCtx", "()Landroid/content/Context;", "getOnCheckChanged", "()Lkotlin/jvm/functions/Function4;", "sleepInterfereTaskItems", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereTaskItem;", "sleepInterfereDayTask", "targetBedHour", "", "targetBedMinute", "targetWakeHour", "targetWakeMinute", "updateTargetTime", "bedTime", "wakeTime", "setTasks", "updateTaskStatus", "status", "reOrderTaskList", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "Companion", "SleepInterfereDayTaskViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepInterfereTaskAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereTaskAdapter.kt\ncom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereTaskAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1872#2,3:172\n774#2:175\n865#2,2:176\n*S KotlinDebug\n*F\n+ 1 SleepInterfereTaskAdapter.kt\ncom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereTaskAdapter\n*L\n66#1:172,3\n80#1:175\n80#1:176,2\n*E\n"})
public final class SleepInterfereTaskAdapter extends RecyclerView.Adapter<SleepInterfereDayTaskViewHolder> {

    @NotNull
    private static final String TAG = "SleepInterfereTaskAdapter";

    @NotNull
    private final Context ctx;

    @NotNull
    private final Function4<SleepInterfereDayTask, String, Boolean, Function2<? super Boolean, ? super Boolean, Unit>, Unit> onCheckChanged;

    @Nullable
    private SleepInterfereDayTask sleepInterfereDayTask;

    @NotNull
    private final List<SleepInterfereTaskItem> sleepInterfereTaskItems;
    private int targetBedHour;
    private int targetBedMinute;
    private int targetWakeHour;
    private int targetWakeMinute;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereTaskAdapter$SleepInterfereDayTaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereTaskItem;", "item", "", "bind", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereTaskItem;)V", "Lcod;", "binding", "Lcod;", "getBinding", "()Lcod;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereTaskItem;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "onCheckChangedListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Lkotlin/Function2;", "", "updateStatusCallback", "Lkotlin/jvm/functions/Function2;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereTaskAdapter;Lcod;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SleepInterfereDayTaskViewHolder extends RecyclerView.d0 {

        @NotNull
        private final cod binding;

        @Nullable
        private SleepInterfereTaskItem item;

        @NotNull
        private final CompoundButton.OnCheckedChangeListener onCheckChangedListener;
        final /* synthetic */ SleepInterfereTaskAdapter this$0;

        @NotNull
        private final Function2<Boolean, Boolean, Unit> updateStatusCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepInterfereDayTaskViewHolder(@NotNull final SleepInterfereTaskAdapter sleepInterfereTaskAdapter, cod binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = sleepInterfereTaskAdapter;
            this.binding = binding;
            this.onCheckChangedListener = new CompoundButton.OnCheckedChangeListener() { // from class: epm
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    SleepInterfereTaskAdapter.SleepInterfereDayTaskViewHolder.onCheckChangedListener$lambda$0(this.f16940a, sleepInterfereTaskAdapter, compoundButton, z);
                }
            };
            this.updateStatusCallback = new Function2() { // from class: fpm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SleepInterfereTaskAdapter.SleepInterfereDayTaskViewHolder.updateStatusCallback$lambda$1(this.f18066a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$2(SleepInterfereDayTaskViewHolder this$0, SleepInterfereTaskItem item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            ToastUtil.INSTANCE.showToast(c0j.kg);
            this$0.binding.B.setChecked(ModelsKt.isCompleted(item));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCheckChangedListener$lambda$0(SleepInterfereDayTaskViewHolder this$0, SleepInterfereTaskAdapter this$1, CompoundButton compoundButton, boolean z) {
            String type;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            SleepInterfereTaskItem sleepInterfereTaskItem = this$0.item;
            String type2 = sleepInterfereTaskItem != null ? sleepInterfereTaskItem.getType() : null;
            SleepInterfereTaskItem sleepInterfereTaskItem2 = this$0.item;
            Logger.i(SleepInterfereTaskAdapter.TAG, "click-task:" + type2 + "-" + (sleepInterfereTaskItem2 != null ? Integer.valueOf(sleepInterfereTaskItem2.getStatus()) : null));
            SleepInterfereTaskItem sleepInterfereTaskItem3 = this$0.item;
            if (sleepInterfereTaskItem3 != null && ModelsKt.isCompleteFail(sleepInterfereTaskItem3)) {
                SleepInterfereTaskItem sleepInterfereTaskItem4 = this$0.item;
                if (TextUtils.equals("LIMIT_NAPS", sleepInterfereTaskItem4 != null ? sleepInterfereTaskItem4.getType() : null)) {
                    ToastUtil.INSTANCE.showToast(c0j.lg);
                }
            }
            SleepInterfereTaskItem sleepInterfereTaskItem5 = this$0.item;
            if (sleepInterfereTaskItem5 != null && ModelsKt.isSleepCompleteFail(sleepInterfereTaskItem5)) {
                SleepInterfereTaskItem sleepInterfereTaskItem6 = this$0.item;
                Intrinsics.checkNotNull(sleepInterfereTaskItem6);
                String type3 = sleepInterfereTaskItem6.getType();
                if (Intrinsics.areEqual(type3, "TIMELY_SLEEP")) {
                    ToastUtil.INSTANCE.showToast(c0j.gg);
                } else if (Intrinsics.areEqual(type3, "TIMELY_WAKE_UP")) {
                    ToastUtil.INSTANCE.showToast(c0j.Tg);
                }
            }
            Function4<SleepInterfereDayTask, String, Boolean, Function2<? super Boolean, ? super Boolean, Unit>, Unit> onCheckChanged = this$1.getOnCheckChanged();
            SleepInterfereDayTask sleepInterfereDayTask = this$1.sleepInterfereDayTask;
            Intrinsics.checkNotNull(sleepInterfereDayTask);
            SleepInterfereTaskItem sleepInterfereTaskItem7 = this$0.item;
            if (sleepInterfereTaskItem7 == null || (type = sleepInterfereTaskItem7.getType()) == null) {
                type = "";
            }
            onCheckChanged.invoke(sleepInterfereDayTask, type, Boolean.valueOf(z), this$0.updateStatusCallback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit updateStatusCallback$lambda$1(SleepInterfereDayTaskViewHolder this$0, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (!z2) {
                this$0.binding.B.setOnCheckedChangeListener(null);
                this$0.binding.B.setChecked(z);
                this$0.binding.B.setOnCheckedChangeListener(this$0.onCheckChangedListener);
            }
            return Unit.INSTANCE;
        }

        public final void bind(@NotNull final SleepInterfereTaskItem item) {
            String first;
            String second;
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.binding.B.setOnCheckedChangeListener(null);
            Pair<String, String> taskTitleAndDescByType = TaskInfoUtils.INSTANCE.getTaskTitleAndDescByType(item.getType());
            TextView textView = this.binding.D;
            String str = "";
            if (taskTitleAndDescByType == null || (first = taskTitleAndDescByType.getFirst()) == null) {
                first = "";
            }
            textView.setText(first);
            TextView textView2 = this.binding.C;
            if (taskTitleAndDescByType != null && (second = taskTitleAndDescByType.getSecond()) != null) {
                str = second;
            }
            textView2.setText(str);
            this.binding.B.setChecked(ModelsKt.isCompleted(item));
            if (SleepInterferePreference.INSTANCE.getFutureTaskComplete()) {
                this.binding.B.setOnCheckedChangeListener(this.onCheckChangedListener);
                return;
            }
            SleepInterfereDayTask sleepInterfereDayTask = this.this$0.sleepInterfereDayTask;
            Intrinsics.checkNotNull(sleepInterfereDayTask);
            if (ModelsKt.isPast(sleepInterfereDayTask)) {
                this.binding.B.setOnClickListener(new View.OnClickListener() { // from class: gpm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SleepInterfereTaskAdapter.SleepInterfereDayTaskViewHolder.bind$lambda$2(this.f19218a, item, view);
                    }
                });
                return;
            }
            if (ModelsKt.isCompleted(item)) {
                this.binding.B.setEnabled(false);
                return;
            }
            SleepInterfereDayTask sleepInterfereDayTask2 = this.this$0.sleepInterfereDayTask;
            Intrinsics.checkNotNull(sleepInterfereDayTask2);
            if (ModelsKt.isToday(sleepInterfereDayTask2)) {
                this.binding.B.setOnCheckedChangeListener(this.onCheckChangedListener);
            } else {
                Logger.e(SleepInterfereTaskAdapter.TAG, "adapter show error status task!!!");
            }
        }

        @NotNull
        public final cod getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepInterfereTaskAdapter(@NotNull Context ctx, @NotNull Function4<? super SleepInterfereDayTask, ? super String, ? super Boolean, ? super Function2<? super Boolean, ? super Boolean, Unit>, Unit> onCheckChanged) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(onCheckChanged, "onCheckChanged");
        this.ctx = ctx;
        this.onCheckChanged = onCheckChanged;
        this.sleepInterfereTaskItems = new ArrayList();
        this.targetBedHour = -1;
        this.targetBedMinute = -1;
        this.targetWakeHour = -1;
        this.targetWakeMinute = -1;
    }

    private final void reOrderTaskList() {
        List<SleepInterfereTaskItem> list = this.sleepInterfereTaskItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ModelsKt.isCompleted((SleepInterfereTaskItem) obj)) {
                arrayList.add(obj);
            }
        }
        List listMinus = CollectionsKt___CollectionsKt.minus((Iterable) this.sleepInterfereTaskItems, (Iterable) CollectionsKt___CollectionsKt.toSet(arrayList));
        this.sleepInterfereTaskItems.clear();
        this.sleepInterfereTaskItems.addAll(listMinus);
        this.sleepInterfereTaskItems.addAll(arrayList);
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.sleepInterfereTaskItems.size();
    }

    @NotNull
    public final Function4<SleepInterfereDayTask, String, Boolean, Function2<? super Boolean, ? super Boolean, Unit>, Unit> getOnCheckChanged() {
        return this.onCheckChanged;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setTasks(@Nullable SleepInterfereDayTask sleepInterfereDayTask) {
        this.sleepInterfereDayTask = sleepInterfereDayTask;
        this.sleepInterfereTaskItems.clear();
        if (sleepInterfereDayTask != null) {
            List<SleepInterfereTaskItem> list = this.sleepInterfereTaskItems;
            List<SleepInterfereTaskItem> tasks = sleepInterfereDayTask.getTasks();
            if (tasks == null) {
                tasks = CollectionsKt__CollectionsKt.emptyList();
            }
            list.addAll(tasks);
        }
        reOrderTaskList();
        notifyDataSetChanged();
    }

    public final void updateTargetTime(int bedTime, int wakeTime) {
        int i = bedTime / 3600;
        this.targetBedHour = i;
        this.targetBedMinute = (bedTime - (i * 3600)) / 60;
        int i2 = wakeTime / 3600;
        this.targetWakeHour = i2;
        this.targetWakeMinute = (wakeTime - (i2 * 3600)) / 60;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateTaskStatus(@NotNull String type, int status) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = 0;
        for (Object obj : this.sleepInterfereTaskItems) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SleepInterfereTaskItem sleepInterfereTaskItem = (SleepInterfereTaskItem) obj;
            if (TextUtils.equals(type, sleepInterfereTaskItem.getType())) {
                sleepInterfereTaskItem.setStatus(status);
            }
            i = i2;
        }
        reOrderTaskList();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepInterfereDayTaskViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.sleepInterfereTaskItems.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepInterfereDayTaskViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        cod codVarA0 = cod.A0(LayoutInflater.from(this.ctx), parent, false);
        Intrinsics.checkNotNullExpressionValue(codVarA0, "inflate(...)");
        return new SleepInterfereDayTaskViewHolder(this, codVarA0);
    }
}
