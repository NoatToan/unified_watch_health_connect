package com.xiaomi.fitness.devicesettings.bluttooth.music.ui;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.music.ui.MusicSettingsSongAdapter;
import defpackage.clf;
import defpackage.wl6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001d\u001eB-\b\u0007\u0012\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongAdapter;", "Landroidx/recyclerview/widget/p;", "Lclf;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "mutableList", "", "updateCurrentList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lkotlin/Function3;", "Landroid/view/View;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/SongMoreSettingsCallback;", "songMoreSettingsCallback", "Lkotlin/jvm/functions/Function3;", "Ljava/util/List;", "getUpdateCurrentList", "()Ljava/util/List;", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "SongViewHolder", "DiffCallback", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MusicSettingsSongAdapter extends p<clf, RecyclerView.d0> {

    @NotNull
    private final Function3<View, Integer, clf, Unit> songMoreSettingsCallback;

    @NotNull
    private final List<clf> updateCurrentList;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lclf;", "oldItem", "newItem", "", "areItemsTheSame", "(Lclf;Lclf;)Z", "areContentsTheSame", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<clf> {
        @Override // androidx.recyclerview.widget.h.f
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(@NotNull clf oldItem, @NotNull clf newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull clf oldItem, @NotNull clf newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.d, newItem.d) && Arrays.equals(oldItem.c, newItem.c);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongAdapter$SongViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "Lclf;", "song", "", "bind", "(ILclf;)V", "Lwl6;", "binding", "Lwl6;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongAdapter;Lwl6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SongViewHolder extends RecyclerView.d0 {

        @NotNull
        private final wl6 binding;
        final /* synthetic */ MusicSettingsSongAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SongViewHolder(@NotNull MusicSettingsSongAdapter musicSettingsSongAdapter, wl6 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = musicSettingsSongAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(SongViewHolder this$0, clf song, MusicSettingsSongAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(song, "$song");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Logger.d("MUSIC_SET", "HANDLE SONG position = " + this$0.getBindingAdapterPosition() + " song = " + song);
            Function3 function3 = this$1.songMoreSettingsCallback;
            Intrinsics.checkNotNull(view);
            function3.invoke(view, Integer.valueOf(this$0.getBindingAdapterPosition()), song);
        }

        public final void bind(int position, @NotNull final clf song) {
            Intrinsics.checkNotNullParameter(song, "song");
            this.binding.C0(song);
            this.binding.A.setText(song.h + " - " + song.g);
            AppCompatImageView appCompatImageView = this.binding.B;
            final MusicSettingsSongAdapter musicSettingsSongAdapter = this.this$0;
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: ucg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicSettingsSongAdapter.SongViewHolder.bind$lambda$0(this.f35619a, song, musicSettingsSongAdapter, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MusicSettingsSongAdapter(@NotNull Function3<? super View, ? super Integer, ? super clf, Unit> songMoreSettingsCallback) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(songMoreSettingsCallback, "songMoreSettingsCallback");
        this.songMoreSettingsCallback = songMoreSettingsCallback;
        this.updateCurrentList = new ArrayList();
    }

    @NotNull
    public final List<clf> getUpdateCurrentList() {
        return this.updateCurrentList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof SongViewHolder) || getCurrentList().get(position) == null) {
            return;
        }
        clf clfVar = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(clfVar, "get(...)");
        ((SongViewHolder) holder).bind(position, clfVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        wl6 wl6VarA0 = wl6.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(wl6VarA0, "inflate(...)");
        return new SongViewHolder(this, wl6VarA0);
    }

    public final void updateCurrentList(@NotNull List<clf> mutableList) {
        Intrinsics.checkNotNullParameter(mutableList, "mutableList");
        this.updateCurrentList.clear();
        this.updateCurrentList.addAll(mutableList);
        submitList(ListExtKt.toArrayList(mutableList));
    }
}
