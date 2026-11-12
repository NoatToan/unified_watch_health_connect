package com.xiaomi.fitness.devicesettings.bluttooth.music.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/ItemPushStartBean;", "", "musicBean", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "currentIndex", "", "allSize", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;II)V", "getMusicBean", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "getCurrentIndex", "()I", "getAllSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ItemPushStartBean {
    private final int allSize;
    private final int currentIndex;

    @NotNull
    private final MusicBean musicBean;

    public ItemPushStartBean(@NotNull MusicBean musicBean, int i, int i2) {
        Intrinsics.checkNotNullParameter(musicBean, "musicBean");
        this.musicBean = musicBean;
        this.currentIndex = i;
        this.allSize = i2;
    }

    public static /* synthetic */ ItemPushStartBean copy$default(ItemPushStartBean itemPushStartBean, MusicBean musicBean, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            musicBean = itemPushStartBean.musicBean;
        }
        if ((i3 & 2) != 0) {
            i = itemPushStartBean.currentIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = itemPushStartBean.allSize;
        }
        return itemPushStartBean.copy(musicBean, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MusicBean getMusicBean() {
        return this.musicBean;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAllSize() {
        return this.allSize;
    }

    @NotNull
    public final ItemPushStartBean copy(@NotNull MusicBean musicBean, int currentIndex, int allSize) {
        Intrinsics.checkNotNullParameter(musicBean, "musicBean");
        return new ItemPushStartBean(musicBean, currentIndex, allSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemPushStartBean)) {
            return false;
        }
        ItemPushStartBean itemPushStartBean = (ItemPushStartBean) other;
        return Intrinsics.areEqual(this.musicBean, itemPushStartBean.musicBean) && this.currentIndex == itemPushStartBean.currentIndex && this.allSize == itemPushStartBean.allSize;
    }

    public final int getAllSize() {
        return this.allSize;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    @NotNull
    public final MusicBean getMusicBean() {
        return this.musicBean;
    }

    public int hashCode() {
        return (((this.musicBean.hashCode() * 31) + Integer.hashCode(this.currentIndex)) * 31) + Integer.hashCode(this.allSize);
    }

    @NotNull
    public String toString() {
        return "ItemPushStartBean(musicBean=" + this.musicBean + ", currentIndex=" + this.currentIndex + ", allSize=" + this.allSize + ")";
    }
}
