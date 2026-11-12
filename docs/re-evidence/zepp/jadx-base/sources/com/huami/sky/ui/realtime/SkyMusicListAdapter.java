package com.huami.sky.ui.realtime;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sky.lib.entity.MusicEntity;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.SkyMusicListItemBinding;
import com.huami.sky.ui.realtime.SkyMusicListAdapter;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/sky/ui/realtime/SkyMusicListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/sky/ui/realtime/SkyMusicListViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "Lcom/huami/sky/lib/entity/MusicEntity;", "list", "setData", "", "a", "Ljava/util/List;", "musicList", "<init>", "(Ljava/util/List;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyMusicListAdapter extends RecyclerView.Adapter<SkyMusicListViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<MusicEntity> musicList;

    public SkyMusicListAdapter(@NotNull List<MusicEntity> list) {
        this.musicList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SkyMusicListAdapter skyMusicListAdapter, int i, View view) {
        Object systemService = view.getContext().getSystemService("clipboard");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", skyMusicListAdapter.musicList.get(i).getMusicClip().getClipId()));
        Toast.makeText(view.getContext(), R.string.sky_copy_clipboard, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SkyMusicListAdapter skyMusicListAdapter, int i, View view) {
        Object systemService = view.getContext().getSystemService("clipboard");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", skyMusicListAdapter.musicList.get(i).getMusicClip().getUrl()));
        Toast.makeText(view.getContext(), R.string.sky_copy_clipboard, 1).show();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.musicList.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(@NotNull List<MusicEntity> list) {
        this.musicList.clear();
        this.musicList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SkyMusicListViewHolder holder, final int position) {
        holder.getBinding().textId.setText("id: " + this.musicList.get(position).getMusicClip().getClipId());
        holder.getBinding().textId.setOnClickListener(new View.OnClickListener() { // from class: hx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyMusicListAdapter.c(this.a, position, view);
            }
        });
        String date = TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", this.musicList.get(position).getTime());
        SpannableString spannableString = new SpannableString(date + ": " + this.musicList.get(position).getMusicClip().getUrl());
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(holder.getBinding().getRoot().getContext(), R.color.s46)), 0, date.length() + 1, 33);
        holder.getBinding().textUrl.setText(spannableString);
        holder.getBinding().textUrl.setOnClickListener(new View.OnClickListener() { // from class: gx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyMusicListAdapter.d(this.a, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SkyMusicListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new SkyMusicListViewHolder(SkyMusicListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
