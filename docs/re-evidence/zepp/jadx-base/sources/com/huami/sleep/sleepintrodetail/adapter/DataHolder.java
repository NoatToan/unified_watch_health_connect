package com.huami.sleep.sleepintrodetail.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.R;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroItemVo;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/adapter/DataHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroItemVo;", "item", "", "bindTo", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class DataHolder extends RecyclerView.ViewHolder {
    public DataHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.include_item_increate_sleep_breath_quality, viewGroup, false));
    }

    public final void bindTo(@Nullable SleepIntroItemVo item) {
        View view = this.itemView;
        ((TypefaceTextView) view.findViewById(R.id.title)).setText(item == null ? null : item.getTitle());
        ((TypefaceTextView) view.findViewById(R.id.desc)).setText(item != null ? item.getInfo() : null);
    }
}
