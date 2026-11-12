package com.xiaomi.hm.health.play.card.intelligence;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.databinding.LayoutToolReminderItemBinding;
import com.xiaomi.hm.health.play.card.intelligence.ReminderAdapter;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/ReminderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/play/card/intelligence/ReminderHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/xiaomi/hm/health/databases/model/Reminder;", "b", "Ljava/util/List;", "reminderList", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "onEdit", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ReminderAdapter extends RecyclerView.Adapter<ReminderHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Reminder> reminderList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function1<Integer, Unit> onEdit;

    /* JADX WARN: Multi-variable type inference failed */
    public ReminderAdapter(@NotNull Context context, @NotNull List<Reminder> list, @NotNull Function1<? super Integer, Unit> function1) {
        this.context = context;
        this.reminderList = list;
        this.onEdit = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ReminderAdapter reminderAdapter, int i, View view) {
        reminderAdapter.onEdit.invoke(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.reminderList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ReminderHolder holder, final int position) {
        Reminder reminder = this.reminderList.get(position);
        holder.getBinding().toolReminderTitle.setText(reminder.getBody());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(this.context.getResources().getString(R.string.play_tool_subtitle_line), Arrays.copyOf(new Object[]{EventRemindManager.getRepeatDescription(this.context, reminder), EventRemindManager.getTimeDescription(reminder)}, 2));
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, "丨", 0, false, 6, (Object) null);
        if (iIndexOf$default > 0) {
            int i = iIndexOf$default + 1;
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#B2B2B2")), iIndexOf$default, i, 33);
            spannableString.setSpan(new StyleSpan(1), iIndexOf$default, i, 33);
            spannableString.setSpan(new RelativeSizeSpan(0.9f), iIndexOf$default, i, 33);
            holder.getBinding().toolReminderSubTitle.setText(spannableString);
        }
        holder.getBinding().getRoot().setOnClickListener(new View.OnClickListener() { // from class: db6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReminderAdapter.b(this.a, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ReminderHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ReminderHolder(LayoutToolReminderItemBinding.inflate(LayoutInflater.from(this.context), parent, false));
    }
}
