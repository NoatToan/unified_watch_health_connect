package com.huami.sleep.sleepintrodetail.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.R;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroItemVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/adapter/SleepIntroAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/sleep/sleepintrodetail/adapter/SleepIntroHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroItemVo;", "list", "setNewData", "", "a", "Ljava/util/List;", "dataList", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepIntroAdapter extends RecyclerView.Adapter<SleepIntroHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<SleepIntroItemVo> dataList = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.dataList.size();
    }

    public final void setNewData(@NotNull List<SleepIntroItemVo> list) {
        this.dataList.clear();
        this.dataList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepIntroHolder holder, int position) {
        SleepIntroItemVo sleepIntroItemVo = this.dataList.get(position);
        holder.getTitle().setText(sleepIntroItemVo.getTitle());
        holder.getDetail().setText(sleepIntroItemVo.getInfo());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepIntroHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new SleepIntroHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sleep_intro, parent, false));
    }
}
