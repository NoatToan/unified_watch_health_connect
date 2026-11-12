package com.xiaomi.fitness.devicesettings.bluttooth.music.bean;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicListBean;", "", "pageType", "", "name", "", "desc", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getPageType", "()I", "getName", "()Ljava/lang/String;", "getDesc", "isSelect", "", "()Z", "setSelect", "(Z)V", "musicList", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "getMusicList", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MusicListBean {

    @NotNull
    private final String desc;
    private boolean isSelect;

    @NotNull
    private final ArrayList<MusicBean> musicList;

    @NotNull
    private final String name;
    private final int pageType;

    public MusicListBean(int i, @NotNull String name, @NotNull String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.pageType = i;
        this.name = name;
        this.desc = desc;
        this.musicList = new ArrayList<>();
    }

    public static /* synthetic */ MusicListBean copy$default(MusicListBean musicListBean, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = musicListBean.pageType;
        }
        if ((i2 & 2) != 0) {
            str = musicListBean.name;
        }
        if ((i2 & 4) != 0) {
            str2 = musicListBean.desc;
        }
        return musicListBean.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPageType() {
        return this.pageType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final MusicListBean copy(int pageType, @NotNull String name, @NotNull String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new MusicListBean(pageType, name, desc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicListBean)) {
            return false;
        }
        MusicListBean musicListBean = (MusicListBean) other;
        return this.pageType == musicListBean.pageType && Intrinsics.areEqual(this.name, musicListBean.name) && Intrinsics.areEqual(this.desc, musicListBean.desc);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final ArrayList<MusicBean> getMusicList() {
        return this.musicList;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPageType() {
        return this.pageType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.pageType) * 31) + this.name.hashCode()) * 31) + this.desc.hashCode();
    }

    /* JADX INFO: renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    @NotNull
    public String toString() {
        return "MusicListBean(pageType=" + this.pageType + ", name=" + this.name + ", desc=" + this.desc + ")";
    }
}
