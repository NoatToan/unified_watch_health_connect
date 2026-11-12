package com.huami.sleepassistant.lib.ui.temperament.sort;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleepassistant.apilib.vo.LiveMusicVo;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J \u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/sleepassistant/lib/ui/temperament/sort/MyCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "", "getMovementFlags", "target", "", "onMove", "direction", "", "onSwiped", "current", "canDropOver", "isLongPressDragEnabled", "Lcom/huami/sleepassistant/lib/ui/temperament/sort/LiveMusicListAdapter;", "a", "Lcom/huami/sleepassistant/lib/ui/temperament/sort/LiveMusicListAdapter;", "adapter", "", "Lcom/huami/sleepassistant/apilib/vo/LiveMusicVo;", "b", "Ljava/util/List;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "list", "<init>", "(Lcom/huami/sleepassistant/lib/ui/temperament/sort/LiveMusicListAdapter;Ljava/util/List;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MyCallback extends ItemTouchHelper.Callback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private LiveMusicListAdapter adapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<LiveMusicVo> list;

    public MyCallback(@Nullable LiveMusicListAdapter liveMusicListAdapter, @NotNull List<LiveMusicVo> list) {
        this.adapter = liveMusicListAdapter;
        this.list = list;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean canDropOver(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder current, @NotNull RecyclerView.ViewHolder target) {
        return true;
    }

    @NotNull
    public final List<LiveMusicVo> getList() {
        return this.list;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* JADX INFO: renamed from: isLongPressDragEnabled */
    public boolean getIsEnableDrag() {
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder target) {
        LiveMusicListAdapter liveMusicListAdapter = this.adapter;
        if (liveMusicListAdapter != null) {
            liveMusicListAdapter.notifyItemMoved(viewHolder.getAdapterPosition(), target.getAdapterPosition());
        }
        Collections.swap(this.list, viewHolder.getAdapterPosition(), target.getAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int direction) {
    }

    public final void setList(@NotNull List<LiveMusicVo> list) {
        this.list = list;
    }
}
