package com.xiaomi.fitness.devicesettings.bluttooth.music.ui;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.music.ui.MusicSettingsSongListAdapter;
import defpackage.elf;
import defpackage.qyi;
import defpackage.yl6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f BQ\b\u0007\u0012\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0015\u0012\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R0\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongListAdapter;", "Landroidx/recyclerview/widget/p;", "Lelf;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "mutableList", "", "updateCurrentList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lkotlin/Function3;", "Landroid/view/View;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/SongListMoreSettingsCallback;", "songListMoreSettingsCallback", "Lkotlin/jvm/functions/Function3;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/SongListClickCallback;", "songListClickCallback", "Ljava/util/List;", "getUpdateCurrentList", "()Ljava/util/List;", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "SongListViewHolder", "DiffCallback", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MusicSettingsSongListAdapter extends p<elf, RecyclerView.d0> {

    @NotNull
    private final Function3<View, Integer, elf, Unit> songListClickCallback;

    @NotNull
    private final Function3<View, Integer, elf, Unit> songListMoreSettingsCallback;

    @NotNull
    private final List<elf> updateCurrentList;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lelf;", "oldItem", "newItem", "", "areItemsTheSame", "(Lelf;Lelf;)Z", "areContentsTheSame", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<elf> {
        @Override // androidx.recyclerview.widget.h.f
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(@NotNull elf oldItem, @NotNull elf newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull elf oldItem, @NotNull elf newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.d, newItem.d) && oldItem.e == newItem.e;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongListAdapter$SongListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lelf;", "songList", "", "bind", "(Lelf;)V", "Lyl6;", "binding", "Lyl6;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongListAdapter;Lyl6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SongListViewHolder extends RecyclerView.d0 {

        @NotNull
        private final yl6 binding;
        final /* synthetic */ MusicSettingsSongListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SongListViewHolder(@NotNull MusicSettingsSongListAdapter musicSettingsSongListAdapter, yl6 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = musicSettingsSongListAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(MusicSettingsSongListAdapter this$0, SongListViewHolder this$1, elf songList, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(songList, "$songList");
            Function3 function3 = this$0.songListMoreSettingsCallback;
            Intrinsics.checkNotNull(view);
            function3.invoke(view, Integer.valueOf(this$1.getBindingAdapterPosition()), songList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1(MusicSettingsSongListAdapter this$0, SongListViewHolder this$1, elf songList, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(songList, "$songList");
            Function3 function3 = this$0.songListClickCallback;
            Intrinsics.checkNotNull(view);
            function3.invoke(view, Integer.valueOf(this$1.getBindingAdapterPosition()), songList);
        }

        public final void bind(@NotNull final elf songList) {
            Intrinsics.checkNotNullParameter(songList, "songList");
            this.binding.C0(songList);
            TextView textView = this.binding.E;
            Resources resources = ApplicationExtKt.getApplication().getResources();
            int i = qyi.o;
            int i2 = songList.e;
            textView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
            AppCompatImageView appCompatImageView = this.binding.C;
            final MusicSettingsSongListAdapter musicSettingsSongListAdapter = this.this$0;
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: vcg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicSettingsSongListAdapter.SongListViewHolder.bind$lambda$0(musicSettingsSongListAdapter, this, songList, view);
                }
            });
            ConstraintLayout constraintLayout = this.binding.A;
            final MusicSettingsSongListAdapter musicSettingsSongListAdapter2 = this.this$0;
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: wcg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicSettingsSongListAdapter.SongListViewHolder.bind$lambda$1(musicSettingsSongListAdapter2, this, songList, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MusicSettingsSongListAdapter(@NotNull Function3<? super View, ? super Integer, ? super elf, Unit> songListMoreSettingsCallback, @NotNull Function3<? super View, ? super Integer, ? super elf, Unit> songListClickCallback) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(songListMoreSettingsCallback, "songListMoreSettingsCallback");
        Intrinsics.checkNotNullParameter(songListClickCallback, "songListClickCallback");
        this.songListMoreSettingsCallback = songListMoreSettingsCallback;
        this.songListClickCallback = songListClickCallback;
        this.updateCurrentList = new ArrayList();
    }

    @NotNull
    public final List<elf> getUpdateCurrentList() {
        return this.updateCurrentList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof SongListViewHolder) || getCurrentList().get(position) == null) {
            return;
        }
        elf elfVar = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(elfVar, "get(...)");
        ((SongListViewHolder) holder).bind(elfVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        yl6 yl6VarA0 = yl6.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(yl6VarA0, "inflate(...)");
        return new SongListViewHolder(this, yl6VarA0);
    }

    public final void updateCurrentList(@NotNull List<elf> mutableList) {
        Intrinsics.checkNotNullParameter(mutableList, "mutableList");
        this.updateCurrentList.clear();
        this.updateCurrentList.addAll(mutableList);
        submitList(ListExtKt.toArrayList(mutableList));
    }
}
