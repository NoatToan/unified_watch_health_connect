package com.xiaomi.hm.health.play.card.intelligence;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.databinding.LayoutToolAlarmItemBinding;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.play.card.intelligence.AlarmAdapter;
import com.xiaomi.hm.health.view.SwitchButton;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u001c\u0012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0!¢\u0006\u0004\b$\u0010%J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/AlarmAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/play/card/intelligence/AlarmHolder;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "holder", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "alarm", "", "e", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "position", "onBindViewHolder", "a", "Landroid/content/Context;", "", "b", "Ljava/util/List;", "alarmList", "Lcom/xiaomi/hm/health/device/alarm/AlarmClockManager;", "c", "Lcom/xiaomi/hm/health/device/alarm/AlarmClockManager;", "alarmManager", "Lkotlin/Function2;", "", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function2;", "onDone", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "onEdit", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/xiaomi/hm/health/device/alarm/AlarmClockManager;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AlarmAdapter extends RecyclerView.Adapter<AlarmHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Alarm> alarmList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AlarmClockManager alarmManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function2<Integer, Boolean, Unit> onDone;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function1<Integer, Unit> onEdit;

    /* JADX WARN: Multi-variable type inference failed */
    public AlarmAdapter(@NotNull Context context, @NotNull List<Alarm> list, @NotNull AlarmClockManager alarmClockManager, @NotNull Function2<? super Integer, ? super Boolean, Unit> function2, @NotNull Function1<? super Integer, Unit> function1) {
        this.context = context;
        this.alarmList = list;
        this.alarmManager = alarmClockManager;
        this.onDone = function2;
        this.onEdit = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AlarmAdapter alarmAdapter, int i, View view) {
        alarmAdapter.onEdit.invoke(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AlarmAdapter alarmAdapter, int i, SwitchButton switchButton, boolean z) {
        alarmAdapter.onDone.invoke(Integer.valueOf(i), Boolean.valueOf(z));
    }

    private final void e(Context context, AlarmHolder holder, Alarm alarm) {
        LayoutToolAlarmItemBinding binding = holder.getBinding();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(alarm.getCalendar().longValue());
        Date date = new Date(alarm.getCalendar().longValue());
        if (DateFormat.is24HourFormat(context.getApplicationContext())) {
            binding.toolAlarmAmPm.setVisibility(8);
            binding.toolAlarmTime.setText(TimeUtils.formatDate(context.getResources().getString(R.string.time_HHmm_pattern), calendar.getTime()));
        } else {
            binding.toolAlarmAmPm.setVisibility(0);
            binding.toolAlarmAmPm.setText(TimeUtils.getPrefix_zh(context, date));
            binding.toolAlarmTime.setText(TimeUtils.formatDate12Hour(context, date));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.alarmList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull AlarmHolder holder, final int position) {
        Alarm alarm = this.alarmList.get(position);
        e(this.context, holder, alarm);
        holder.getBinding().toolAlarmRepeat.setText(this.alarmManager.getWeekString(alarm));
        holder.getBinding().toolAlarmEnable.setChecked(alarm.getEnabled().booleanValue());
        holder.getBinding().getRoot().setOnClickListener(new View.OnClickListener() { // from class: na
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlarmAdapter.c(this.a, position, view);
            }
        });
        holder.getBinding().toolAlarmEnable.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() { // from class: oa
            @Override // com.xiaomi.hm.health.view.SwitchButton.OnCheckedChangeListener
            public final void onCheckedChanged(SwitchButton switchButton, boolean z) {
                AlarmAdapter.d(this.a, position, switchButton, z);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public AlarmHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new AlarmHolder(LayoutToolAlarmItemBinding.inflate(LayoutInflater.from(this.context), parent, false));
    }
}
