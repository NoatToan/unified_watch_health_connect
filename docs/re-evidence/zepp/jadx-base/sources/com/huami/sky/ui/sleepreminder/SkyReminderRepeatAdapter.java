package com.huami.sky.ui.sleepreminder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.SkyItemReminderRepeatBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.sleepreminder.SkyReminderRepeatAdapter;
import com.huami.sky.ui.utils.ExtFuncKt;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/sky/ui/sleepreminder/SkyReminderRepeatAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/sky/ui/sleepreminder/SkyReminderRepeatHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "Lcom/huami/sky/ui/sleepreminder/SkyRepeatBean;", "repeatDatas", "setData", "getData", "Lcom/huami/sky/ui/sleepreminder/OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "", "hasDaySelected", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Ljava/util/List;", "repeatList", "c", "Lcom/huami/sky/ui/sleepreminder/OnItemClickListener;", "onItemClickListener", "<init>", "(Landroid/content/Context;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyReminderRepeatAdapter extends RecyclerView.Adapter<SkyReminderRepeatHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<SkyRepeatBean> repeatList = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OnItemClickListener onItemClickListener;

    public SkyReminderRepeatAdapter(@NotNull Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SkyRepeatBean skyRepeatBean, SkyReminderRepeatAdapter skyReminderRepeatAdapter, int i, View view) {
        skyRepeatBean.setChecked(!skyRepeatBean.isChecked());
        skyReminderRepeatAdapter.repeatList.set(i, skyRepeatBean);
        skyReminderRepeatAdapter.notifyItemChanged(i);
        OnItemClickListener onItemClickListener = skyReminderRepeatAdapter.onItemClickListener;
        if (onItemClickListener == null) {
            return;
        }
        onItemClickListener.onItemClick(i);
    }

    @NotNull
    public final List<SkyRepeatBean> getData() {
        return this.repeatList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.repeatList.size();
    }

    public final boolean hasDaySelected() {
        Iterator<T> it2 = this.repeatList.iterator();
        while (it2.hasNext()) {
            if (((SkyRepeatBean) it2.next()).isChecked()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(@NotNull List<SkyRepeatBean> repeatDatas) {
        this.repeatList.clear();
        this.repeatList.addAll(repeatDatas);
        notifyDataSetChanged();
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SkyReminderRepeatHolder holder, final int position) {
        final SkyRepeatBean skyRepeatBean = this.repeatList.get(position);
        AppCompatTextView appCompatTextView = holder.getBinding().repeatContent;
        appCompatTextView.setText(skyRepeatBean.getWeekDay());
        Drawable background = appCompatTextView.getBackground();
        Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (skyRepeatBean.isChecked()) {
            gradientDrawable.setStroke(SkyExtKt.getDp(1), ContextCompat.getColor(appCompatTextView.getContext(), R.color.s46));
        } else {
            gradientDrawable.setStroke(SkyExtKt.getDp(1), ExtFuncKt.addAlpha(ContextCompat.getColor(appCompatTextView.getContext(), R.color.s46), 0.25d));
        }
        appCompatTextView.setBackground(gradientDrawable);
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: wy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyReminderRepeatAdapter.b(skyRepeatBean, this, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SkyReminderRepeatHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new SkyReminderRepeatHolder(SkyItemReminderRepeatBinding.inflate(LayoutInflater.from(this.context), parent, false));
    }
}
