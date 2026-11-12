package com.xiaomi.fitness.devicesettings.bluttooth.music.ui;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.music.data.AddSong;
import com.xiaomi.fitness.devicesettings.bluttooth.music.ui.AddSongToListAdapter;
import defpackage.ul6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001d\u001eB'\b\u0007\u0012\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/AddSongToListAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSong;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "mutableList", "", "updateCurrentList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lkotlin/Function2;", "Landroid/view/View;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/SelectSongToListCallback;", "selectSongToListCallback", "Lkotlin/jvm/functions/Function2;", "Ljava/util/List;", "getUpdateCurrentList", "()Ljava/util/List;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "AddSongListViewHolder", "DiffCallback", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddSongToListAdapter extends p<AddSong, RecyclerView.d0> {

    @NotNull
    private final Function2<View, AddSong, Unit> selectSongToListCallback;

    @NotNull
    private final List<AddSong> updateCurrentList;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/AddSongToListAdapter$AddSongListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSong;", "songList", "", "bind", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSong;)V", "Lul6;", "binding", "Lul6;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/AddSongToListAdapter;Lul6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class AddSongListViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ul6 binding;
        final /* synthetic */ AddSongToListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddSongListViewHolder(@NotNull AddSongToListAdapter addSongToListAdapter, ul6 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = addSongToListAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(AddSongToListAdapter this$0, AddSongListViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            AddSong addSong = this$0.getCurrentList().get(this$1.getBindingAdapterPosition());
            if (addSong.getStatus() == 2) {
                return;
            }
            addSong.setStatus(addSong.getStatus() == 1 ? 0 : 1);
            this$0.notifyItemChanged(this$1.getBindingAdapterPosition());
            Function2 function2 = this$0.selectSongToListCallback;
            Intrinsics.checkNotNull(view);
            Intrinsics.checkNotNull(addSong);
            function2.invoke(view, addSong);
        }

        public final void bind(@NotNull AddSong songList) {
            Intrinsics.checkNotNullParameter(songList, "songList");
            this.binding.C0(songList);
            this.binding.A.setText(songList.getSong().h + " - " + songList.getSong().g);
            int status = songList.getStatus();
            if (status == 0) {
                this.binding.C.setEnabled(true);
                this.binding.C.setChecked(false);
            } else if (status == 1) {
                this.binding.C.setEnabled(true);
                this.binding.C.setChecked(true);
            } else if (status == 2) {
                this.binding.C.setEnabled(false);
            }
            AppCompatCheckedTextView appCompatCheckedTextView = this.binding.C;
            final AddSongToListAdapter addSongToListAdapter = this.this$0;
            appCompatCheckedTextView.setOnClickListener(new View.OnClickListener() { // from class: st0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddSongToListAdapter.AddSongListViewHolder.bind$lambda$0(addSongToListAdapter, this, view);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/AddSongToListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSong;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSong;Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSong;)Z", "areContentsTheSame", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<AddSong> {
        @Override // androidx.recyclerview.widget.h.f
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(@NotNull AddSong oldItem, @NotNull AddSong newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull AddSong oldItem, @NotNull AddSong newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getSong().c, newItem.getSong().c) && Intrinsics.areEqual(oldItem.getSong().d, newItem.getSong().d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddSongToListAdapter(@NotNull Function2<? super View, ? super AddSong, Unit> selectSongToListCallback) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(selectSongToListCallback, "selectSongToListCallback");
        this.selectSongToListCallback = selectSongToListCallback;
        this.updateCurrentList = new ArrayList();
    }

    @NotNull
    public final List<AddSong> getUpdateCurrentList() {
        return this.updateCurrentList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof AddSongListViewHolder) || getCurrentList().get(position) == null) {
            return;
        }
        AddSong addSong = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(addSong, "get(...)");
        ((AddSongListViewHolder) holder).bind(addSong);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ul6 ul6VarA0 = ul6.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(ul6VarA0, "inflate(...)");
        return new AddSongListViewHolder(this, ul6VarA0);
    }

    public final void updateCurrentList(@NotNull List<AddSong> mutableList) {
        Intrinsics.checkNotNullParameter(mutableList, "mutableList");
        this.updateCurrentList.clear();
        this.updateCurrentList.addAll(mutableList);
        submitList(ListExtKt.toArrayList(mutableList));
    }
}
