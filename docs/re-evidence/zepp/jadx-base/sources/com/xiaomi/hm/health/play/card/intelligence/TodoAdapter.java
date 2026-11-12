package com.xiaomi.hm.health.play.card.intelligence;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.databinding.LayoutToolTodoItemBinding;
import com.xiaomi.hm.health.device.settings.todo.TodoRepeat;
import com.xiaomi.hm.health.play.card.intelligence.TodoAdapter;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001b\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u001e¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/TodoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/play/card/intelligence/TodoHolder;", "holder", "", "isDone", "", "f", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "todo", "c", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "position", "onBindViewHolder", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Ljava/util/List;", "todoList", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "onDone", "Lkotlin/Function1;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "onEdit", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TodoAdapter extends RecyclerView.Adapter<TodoHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Todo> todoList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function2<Integer, Boolean, Unit> onDone;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function1<Integer, Unit> onEdit;

    /* JADX WARN: Multi-variable type inference failed */
    public TodoAdapter(@NotNull Context context, @NotNull List<Todo> list, @NotNull Function2<? super Integer, ? super Boolean, Unit> function2, @NotNull Function1<? super Integer, Unit> function1) {
        this.context = context;
        this.todoList = list;
        this.onDone = function2;
        this.onEdit = function1;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    private final void c(TodoHolder holder, Todo todo) {
        String dateTime;
        Integer numValueOf = Integer.valueOf(todo.getRepeat());
        int iIntValue = numValueOf.intValue();
        String dateTime2 = null;
        if (!((iIntValue == 0 || iIntValue == 1) ? false : true)) {
            numValueOf = null;
        }
        String str = "";
        if (numValueOf != null) {
            numValueOf.intValue();
            String desc$default = TodoRepeat.getDesc$default(this.context, todo.getRepeat(), false, 4, null);
            if (desc$default != null) {
                str = desc$default;
            }
        }
        Long date = todo.getDate();
        if (date != null) {
            if (!(date.longValue() > 0)) {
                date = null;
            }
            if (date == null) {
                dateTime = null;
            } else {
                dateTime = DateUtils.formatDateTime(this.context, TodoRepeat.checkDate(date.longValue(), todo.getRepeat()), 20);
            }
        } else {
            dateTime = null;
        }
        Long time = todo.getTime();
        if (time != null) {
            if (!(time.longValue() > 0)) {
                time = null;
            }
            if (time != null) {
                dateTime2 = DateUtils.formatDateTime(this.context, time.longValue(), 129);
            }
        }
        if (dateTime == null || dateTime.length() == 0) {
            holder.getBinding().toolTodoSubtitle.setVisibility(8);
            return;
        }
        holder.getBinding().toolTodoSubtitle.setVisibility(0);
        StringBuilder sb = new StringBuilder();
        sb.append(dateTime);
        if (!(dateTime2 == null || dateTime2.length() == 0)) {
            sb.append(" ");
            sb.append(dateTime2);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(this.context.getResources().getString(R.string.play_tool_subtitle_line), Arrays.copyOf(new Object[]{str, sb}, 2));
        SpannableString spannableString = new SpannableString(str2);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str2, "丨", 0, false, 6, (Object) null);
        if (iIndexOf$default > 0) {
            if (TextUtils.isEmpty(str)) {
                holder.getBinding().toolTodoSubtitle.setText(str2.substring(iIndexOf$default + 2, str2.length()));
                return;
            }
            int i = iIndexOf$default + 1;
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#B2B2B2")), iIndexOf$default, i, 33);
            spannableString.setSpan(new StyleSpan(1), iIndexOf$default, i, 33);
            spannableString.setSpan(new RelativeSizeSpan(0.9f), iIndexOf$default, i, 33);
            holder.getBinding().toolTodoSubtitle.setText(spannableString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(TodoAdapter todoAdapter, TodoHolder todoHolder, int i, boolean z, View view) {
        todoAdapter.f(todoHolder, true);
        todoAdapter.onDone.invoke(Integer.valueOf(i), Boolean.valueOf(!z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z, TodoAdapter todoAdapter, int i, View view) {
        if (z) {
            return;
        }
        todoAdapter.onEdit.invoke(Integer.valueOf(i));
    }

    private final void f(TodoHolder holder, boolean isDone) {
        holder.getBinding().toolTodoCheck.setImageResource(isDone ? R.drawable.play_todo_done : R.drawable.play_todo_not_done);
        if (isDone) {
            holder.getBinding().toolTodoContent.setTextColor(Color.parseColor("#B2B2B2"));
            holder.getBinding().toolTodoContent.setPaintFlags(17);
            holder.getBinding().toolTodoSubtitle.setTextColor(Color.parseColor("#B2B2B2"));
        } else {
            holder.getBinding().toolTodoContent.setTextColor(ContextCompat.getColor(this.context, R.color.play_title_color));
            holder.getBinding().toolTodoContent.setPaintFlags(1);
            holder.getBinding().toolTodoSubtitle.setTextColor(ContextCompat.getColor(this.context, R.color.play_sub_title_color));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.todoList.size();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0021  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final TodoHolder holder, final int position) {
        Todo todo = this.todoList.get(position);
        holder.getBinding().toolTodoContent.setText(todo.getContent());
        c(holder, todo);
        Long completeTime = todo.getCompleteTime();
        if (completeTime != null) {
            if (!(completeTime.longValue() > 0)) {
                completeTime = null;
            }
        } else {
            completeTime = null;
        }
        final boolean z = completeTime != null;
        f(holder, z);
        holder.getBinding().toolTodoCheck.setOnClickListener(new View.OnClickListener() { // from class: op7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoAdapter.d(this.a, holder, position, z, view);
            }
        });
        holder.getBinding().getRoot().setOnClickListener(new View.OnClickListener() { // from class: pp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoAdapter.e(z, this, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TodoHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new TodoHolder(LayoutToolTodoItemBinding.inflate(LayoutInflater.from(this.context), parent, false));
    }
}
