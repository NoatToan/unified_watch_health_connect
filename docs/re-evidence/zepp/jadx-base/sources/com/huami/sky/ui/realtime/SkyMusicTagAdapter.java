package com.huami.sky.ui.realtime;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sky.ui.databinding.SkyRealtimeMusicTagItemBinding;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/sky/ui/realtime/SkyMusicTagAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/sky/ui/realtime/SkyMusicTagHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "", "musicTags", "setNewData", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Ljava/util/List;", "musicTagList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyMusicTagAdapter extends RecyclerView.Adapter<SkyMusicTagHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<String> musicTagList;

    public SkyMusicTagAdapter(@NotNull Context context, @NotNull List<String> list) {
        this.context = context;
        this.musicTagList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.musicTagList.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setNewData(@NotNull List<String> musicTags) {
        this.musicTagList = musicTags;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SkyMusicTagHolder holder, int position) {
        holder.getBinding().skyMusicTag.setText(this.musicTagList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SkyMusicTagHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new SkyMusicTagHolder(SkyRealtimeMusicTagItemBinding.inflate(LayoutInflater.from(this.context), parent, false));
    }
}
