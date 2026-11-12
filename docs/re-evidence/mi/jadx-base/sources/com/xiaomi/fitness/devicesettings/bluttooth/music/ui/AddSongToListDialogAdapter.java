package com.xiaomi.fitness.devicesettings.bluttooth.music.ui;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import com.xiaomi.fitness.devicesettings.bluttooth.music.data.AddSongList;
import com.xiaomi.fitness.devicesettings.bluttooth.music.ui.AddSongToListDialogAdapter;
import defpackage.pd6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B-\b\u0007\u0012\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000fj\u0002`\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000fj\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/AddSongToListDialogAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSongList;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lkotlin/Function3;", "Landroid/view/View;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/AddSongToListCallback;", "addSongToListCallback", "Lkotlin/jvm/functions/Function3;", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "AddSongListViewHolder", "DiffCallback", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddSongToListDialogAdapter extends p<AddSongList, RecyclerView.d0> {

    @NotNull
    private final Function3<View, Integer, AddSongList, Unit> addSongToListCallback;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/AddSongToListDialogAdapter$AddSongListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSongList;", "songList", "", "bind", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSongList;)V", "Lpd6;", "binding", "Lpd6;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/AddSongToListDialogAdapter;Lpd6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class AddSongListViewHolder extends RecyclerView.d0 {

        @NotNull
        private final pd6 binding;
        final /* synthetic */ AddSongToListDialogAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddSongListViewHolder(@NotNull AddSongToListDialogAdapter addSongToListDialogAdapter, pd6 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = addSongToListDialogAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(AddSongToListDialogAdapter this$0, AddSongListViewHolder this$1, AddSongList songList, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(songList, "$songList");
            AddSongList addSongList = this$0.getCurrentList().get(this$1.getBindingAdapterPosition());
            if (addSongList.getStatus() == 2) {
                return;
            }
            int size = this$0.getCurrentList().size();
            for (int i = 0; i < size; i++) {
                if (this$0.getCurrentList().get(i).getStatus() != 2) {
                    if (this$0.getCurrentList().get(i).getSongList().c == addSongList.getSongList().c) {
                        this$0.getCurrentList().get(i).setStatus(addSongList.getStatus() == 1 ? 0 : 1);
                    } else {
                        this$0.getCurrentList().get(i).setStatus(0);
                    }
                    this$0.notifyItemChanged(i);
                }
            }
            Function3 function3 = this$0.addSongToListCallback;
            Intrinsics.checkNotNull(view);
            function3.invoke(view, Integer.valueOf(this$1.getBindingAdapterPosition()), songList);
        }

        public final void bind(@NotNull final AddSongList songList) {
            Intrinsics.checkNotNullParameter(songList, "songList");
            this.binding.C0(songList);
            int status = songList.getStatus();
            if (status == 0) {
                this.binding.B.setEnabled(true);
                this.binding.B.setChecked(false);
            } else if (status == 1) {
                this.binding.B.setEnabled(true);
                this.binding.B.setChecked(true);
            } else if (status == 2) {
                this.binding.B.setEnabled(false);
            }
            AppCompatCheckedTextView appCompatCheckedTextView = this.binding.B;
            final AddSongToListDialogAdapter addSongToListDialogAdapter = this.this$0;
            appCompatCheckedTextView.setOnClickListener(new View.OnClickListener() { // from class: tt0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddSongToListDialogAdapter.AddSongListViewHolder.bind$lambda$0(addSongToListDialogAdapter, this, songList, view);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/AddSongToListDialogAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSongList;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSongList;Lcom/xiaomi/fitness/devicesettings/bluttooth/music/data/AddSongList;)Z", "areContentsTheSame", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<AddSongList> {
        @Override // androidx.recyclerview.widget.h.f
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(@NotNull AddSongList oldItem, @NotNull AddSongList newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getSongList().c == newItem.getSongList().c && Intrinsics.areEqual(oldItem.getSongList().d, newItem.getSongList().d) && oldItem.getStatus() == newItem.getStatus();
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull AddSongList oldItem, @NotNull AddSongList newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getSongList().c == newItem.getSongList().c && Intrinsics.areEqual(oldItem.getSongList().d, newItem.getSongList().d) && oldItem.getStatus() == newItem.getStatus();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddSongToListDialogAdapter(@NotNull Function3<? super View, ? super Integer, ? super AddSongList, Unit> addSongToListCallback) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(addSongToListCallback, "addSongToListCallback");
        this.addSongToListCallback = addSongToListCallback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof AddSongListViewHolder) || getCurrentList().get(position) == null) {
            return;
        }
        AddSongList addSongList = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(addSongList, "get(...)");
        ((AddSongListViewHolder) holder).bind(addSongList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        pd6 pd6VarA0 = pd6.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(pd6VarA0, "inflate(...)");
        return new AddSongListViewHolder(this, pd6VarA0);
    }
}
