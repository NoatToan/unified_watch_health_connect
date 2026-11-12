package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H&¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/BaseTalkAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "index", "", "setCurrentPositionIndex", "(II)V", "Lkotlin/Pair;", "getHighlightOffset", "()Lkotlin/Pair;", "getTargetPosition", "()I", "curPosition", "I", "getCurPosition", "setCurPosition", "(I)V", "curIndex", "getCurIndex", "setCurIndex", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseTalkAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    private int curPosition = -1;
    private int curIndex = -1;

    public final int getCurIndex() {
        return this.curIndex;
    }

    public final int getCurPosition() {
        return this.curPosition;
    }

    @NotNull
    public Pair<Integer, Integer> getHighlightOffset() {
        return new Pair<>(0, 0);
    }

    public abstract int getTargetPosition();

    public final void setCurIndex(int i) {
        this.curIndex = i;
    }

    public final void setCurPosition(int i) {
        this.curPosition = i;
    }

    public final void setCurrentPositionIndex(int position, int index) {
        this.curPosition = position;
        this.curIndex = index;
        notifyDataSetChanged();
    }
}
