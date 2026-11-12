package com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.adapter;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.adapter.TodoRemindAdapter;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.data.TodoRemindItem;
import com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.an6;
import defpackage.cji;
import defpackage.lhi;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014J\u0014\u0010\u0018\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u001aJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\rJ\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020!H\u0016J\"\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010)H\u0002J\b\u0010*\u001a\u00020!H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/adapter/TodoRemindAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/adapter/TodoRemindAdapter$TodoRemindViewHolder;", "<init>", "()V", "adapterList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;", "getAdapterList", "()Ljava/util/List;", "selectDeleteItemList", "getSelectDeleteItemList", "value", "", "editMode", "getEditMode", "()Z", "setEditMode", "(Z)V", "onItemListener", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/adapter/TodoRemindAdapter$OnItemListener;", "setOnItemListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "updateData", "srcList", "", "setSelectAll", "selectAllStatus", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "setCheckedNoEvent", "checkBox", "Landroid/widget/CompoundButton;", "checked", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getItemCount", "TodoRemindViewHolder", "OnItemListener", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TodoRemindAdapter extends RecyclerView.Adapter<TodoRemindViewHolder> {
    private boolean editMode;

    @Nullable
    private OnItemListener onItemListener;

    @NotNull
    private final List<TodoRemindItem> adapterList = new ArrayList();

    @NotNull
    private final List<TodoRemindItem> selectDeleteItemList = new ArrayList();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/adapter/TodoRemindAdapter$OnItemListener;", "", "onLongClickTrigger", "", "onItemClick", "", "todoRemindItem", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;", "onItemMark", "markStatus", "onItemDeleteSelectUpdate", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemListener {
        void onItemClick(@NotNull TodoRemindItem todoRemindItem);

        void onItemDeleteSelectUpdate();

        void onItemMark(boolean markStatus, @NotNull TodoRemindItem todoRemindItem);

        boolean onLongClickTrigger();
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/adapter/TodoRemindAdapter$TodoRemindViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/content/Context;", "context", "Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;", "mindItem", "", "getSubtitleDes", "(Landroid/content/Context;Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;)Ljava/lang/String;", "todoRemindItem", "", "editMode", "preRemindItem", "", "updateView", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;ZLcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRemindItem;)V", "Landroid/widget/CheckBox;", "checkBoxMark", "Landroid/widget/CheckBox;", "getCheckBoxMark", "()Landroid/widget/CheckBox;", "checkBoxDelete", "getCheckBoxDelete", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "getTvTitle", "()Landroid/widget/TextView;", "tvSubTitle", "getTvSubTitle", "tvCategory", "getTvCategory", "Lan6;", "binding", "<init>", "(Lan6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nTodoRemindAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodoRemindAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/adapter/TodoRemindAdapter$TodoRemindViewHolder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,212:1\n37#2:213\n36#2,3:214\n*S KotlinDebug\n*F\n+ 1 TodoRemindAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/adapter/TodoRemindAdapter$TodoRemindViewHolder\n*L\n176#1:213\n176#1:214,3\n*E\n"})
    public static final class TodoRemindViewHolder extends RecyclerView.d0 {

        @NotNull
        private final CheckBox checkBoxDelete;

        @NotNull
        private final CheckBox checkBoxMark;

        @NotNull
        private final TextView tvCategory;

        @NotNull
        private final TextView tvSubTitle;

        @NotNull
        private final TextView tvTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TodoRemindViewHolder(@NotNull an6 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            CheckBox checkBoxMark = binding.B;
            Intrinsics.checkNotNullExpressionValue(checkBoxMark, "checkBoxMark");
            this.checkBoxMark = checkBoxMark;
            CheckBox checkBoxDelete = binding.A;
            Intrinsics.checkNotNullExpressionValue(checkBoxDelete, "checkBoxDelete");
            this.checkBoxDelete = checkBoxDelete;
            TextView tvTitle = binding.E;
            Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
            this.tvTitle = tvTitle;
            TextView tvSubtitle = binding.D;
            Intrinsics.checkNotNullExpressionValue(tvSubtitle, "tvSubtitle");
            this.tvSubTitle = tvSubtitle;
            TextView tvCategoryLabel = binding.C;
            Intrinsics.checkNotNullExpressionValue(tvCategoryLabel, "tvCategoryLabel");
            this.tvCategory = tvCategoryLabel;
        }

        private final String getSubtitleDes(Context context, TodoRemindItem mindItem) {
            List listSplit$default;
            boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
            String str = "";
            if (!mindItem.getRemindEnable()) {
                return "";
            }
            long j = 1000;
            long remindTimeSecond = mindItem.getRemindTimeSecond() * j;
            int repeatMode = mindItem.getRepeatMode();
            if (repeatMode == 0) {
                str = context.getString(wzi.K6) + " " + EventMinderUtil.INSTANCE.getEventMinderYearMonthDayTime(context, remindTimeSecond, zIs24HourFormat);
            } else if (repeatMode != 1) {
                String[] strArr = null;
                if (repeatMode == 2) {
                    String customDayStr = mindItem.getCustomDayStr();
                    if (customDayStr != null && !StringsKt__StringsKt.contains$default((CharSequence) customDayStr, (CharSequence) ",", false, 2, (Object) null)) {
                        int i = Integer.parseInt(customDayStr);
                        String[] stringArray = context.getResources().getStringArray(lhi.i);
                        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                        int length = stringArray.length;
                        int i2 = i - 1;
                        if (i2 >= 0 && i2 < length) {
                            str = stringArray[i2];
                        }
                    }
                    str = context.getString(wzi.U1) + " " + str;
                } else if (repeatMode == 3) {
                    str = context.getString(wzi.T1) + " " + TimeDateUtil.getDayFormat(TimeDateUtil.timestampToLocalDate(mindItem.getRemindTimeSecond())) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getRemindTimeSecond() * j, zIs24HourFormat);
                } else if (repeatMode == 4) {
                    str = context.getString(wzi.V1) + " " + TimeDateUtil.getDateMMddSimpleFormat(TimeDateUtil.timestampToLocalDate(mindItem.getRemindTimeSecond())) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(mindItem.getRemindTimeSecond() * j, zIs24HourFormat);
                } else if (repeatMode == 5) {
                    String customDayStr2 = mindItem.getCustomDayStr();
                    if (customDayStr2 != null && (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) customDayStr2, new String[]{","}, false, 0, 6, (Object) null)) != null) {
                        strArr = (String[]) listSplit$default.toArray(new String[0]);
                    }
                    String string = context.getString(wzi.U1);
                    EventMinderUtil eventMinderUtil = EventMinderUtil.INSTANCE;
                    str = string + " " + eventMinderUtil.getWeeksByType(context, strArr) + " " + eventMinderUtil.getEventMinderTime(mindItem.getRemindTimeSecond() * j, zIs24HourFormat);
                }
            } else {
                str = context.getString(wzi.S1) + " " + EventMinderUtil.INSTANCE.getEventMinderTime(remindTimeSecond, zIs24HourFormat);
            }
            if ((System.currentTimeMillis() / j) - mindItem.getRemindTimeSecond() <= 0) {
                return str;
            }
            return str + " " + context.getString(wzi.t8);
        }

        @NotNull
        public final CheckBox getCheckBoxDelete() {
            return this.checkBoxDelete;
        }

        @NotNull
        public final CheckBox getCheckBoxMark() {
            return this.checkBoxMark;
        }

        @NotNull
        public final TextView getTvCategory() {
            return this.tvCategory;
        }

        @NotNull
        public final TextView getTvSubTitle() {
            return this.tvSubTitle;
        }

        @NotNull
        public final TextView getTvTitle() {
            return this.tvTitle;
        }

        public final void updateView(@NotNull TodoRemindItem todoRemindItem, boolean editMode, @Nullable TodoRemindItem preRemindItem) {
            Intrinsics.checkNotNullParameter(todoRemindItem, "todoRemindItem");
            boolean zIsFinish = todoRemindItem.isFinish();
            if (preRemindItem == null || preRemindItem.getStatus() != todoRemindItem.getStatus()) {
                this.tvCategory.setText(ResourceExtKt.getString(zIsFinish ? wzi.s8 : wzi.v8));
                ViewExtKt.setVisible(this.tvCategory, true);
            } else {
                ViewExtKt.setVisible(this.tvCategory, false);
            }
            ViewExtKt.setVisible(this.checkBoxDelete, editMode);
            ViewExtKt.setVisible(this.checkBoxMark, !editMode);
            this.tvTitle.setTextColor(ExtUtilsKt.getColor(!zIsFinish ? cji.D : cji.common_text_color_gray));
            TextView textView = this.tvTitle;
            String content = todoRemindItem.getContent();
            if (content == null) {
                content = "";
            }
            textView.setText(content);
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String subtitleDes = getSubtitleDes(context, todoRemindItem);
            if (subtitleDes.length() == 0) {
                ViewExtKt.setVisible(this.tvSubTitle, false);
            } else {
                ViewExtKt.setVisible(this.tvSubTitle, true);
                this.tvSubTitle.setText(subtitleDes);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(TodoRemindAdapter this$0, TodoRemindItem todoRemindItem, TodoRemindViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(todoRemindItem, "$todoRemindItem");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (this$0.editMode) {
            holder.getCheckBoxDelete().setChecked(!holder.getCheckBoxDelete().isChecked());
            return;
        }
        OnItemListener onItemListener = this$0.onItemListener;
        if (onItemListener != null) {
            onItemListener.onItemClick(todoRemindItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$1(TodoRemindAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnItemListener onItemListener = this$0.onItemListener;
        if (onItemListener != null) {
            return onItemListener.onLongClickTrigger();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(TodoRemindAdapter this$0, TodoRemindItem todoRemindItem, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(todoRemindItem, "$todoRemindItem");
        OnItemListener onItemListener = this$0.onItemListener;
        if (onItemListener != null) {
            onItemListener.onItemMark(z, todoRemindItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(TodoRemindAdapter this$0, TodoRemindItem todoRemindItem, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(todoRemindItem, "$todoRemindItem");
        if (z) {
            this$0.selectDeleteItemList.add(todoRemindItem);
        } else {
            this$0.selectDeleteItemList.remove(todoRemindItem);
        }
        OnItemListener onItemListener = this$0.onItemListener;
        if (onItemListener != null) {
            onItemListener.onItemDeleteSelectUpdate();
        }
    }

    private final void setCheckedNoEvent(CompoundButton checkBox, boolean checked, CompoundButton.OnCheckedChangeListener listener) {
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(checked);
        checkBox.setOnCheckedChangeListener(listener);
    }

    @NotNull
    public final List<TodoRemindItem> getAdapterList() {
        return this.adapterList;
    }

    public final boolean getEditMode() {
        return this.editMode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.adapterList.size();
    }

    @NotNull
    public final List<TodoRemindItem> getSelectDeleteItemList() {
        return this.selectDeleteItemList;
    }

    public final void setEditMode(boolean z) {
        this.editMode = z;
        this.selectDeleteItemList.clear();
        notifyDataSetChanged();
    }

    public final void setOnItemListener(@NotNull OnItemListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemListener = listener;
    }

    public final void setSelectAll(boolean selectAllStatus) {
        this.selectDeleteItemList.clear();
        if (selectAllStatus) {
            this.selectDeleteItemList.addAll(this.adapterList);
        }
        notifyDataSetChanged();
    }

    public final void updateData(@NotNull List<TodoRemindItem> srcList) {
        Intrinsics.checkNotNullParameter(srcList, "srcList");
        this.adapterList.clear();
        this.adapterList.addAll(srcList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final TodoRemindViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final TodoRemindItem todoRemindItem = this.adapterList.get(position);
        int i = position - 1;
        holder.updateView(todoRemindItem, this.editMode, (i < 0 || i >= this.adapterList.size()) ? null : this.adapterList.get(i));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: hhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TodoRemindAdapter.onBindViewHolder$lambda$0(this.f20079a, todoRemindItem, holder, view);
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: ihp
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return TodoRemindAdapter.onBindViewHolder$lambda$1(this.f21156a, view);
            }
        });
        setCheckedNoEvent(holder.getCheckBoxMark(), todoRemindItem.isFinish(), new CompoundButton.OnCheckedChangeListener() { // from class: jhp
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                TodoRemindAdapter.onBindViewHolder$lambda$2(this.f22816a, todoRemindItem, compoundButton, z);
            }
        });
        if (!this.editMode) {
            holder.getCheckBoxDelete().setOnCheckedChangeListener(null);
            return;
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: khp
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                TodoRemindAdapter.onBindViewHolder$lambda$3(this.f23859a, todoRemindItem, compoundButton, z);
            }
        };
        if (this.selectDeleteItemList.contains(todoRemindItem)) {
            setCheckedNoEvent(holder.getCheckBoxDelete(), true, onCheckedChangeListener);
        } else {
            setCheckedNoEvent(holder.getCheckBoxDelete(), false, onCheckedChangeListener);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TodoRemindViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        an6 an6VarA0 = an6.A0(ExtUtilsKt.getInflater(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(an6VarA0, "inflate(...)");
        return new TodoRemindViewHolder(an6VarA0);
    }
}
