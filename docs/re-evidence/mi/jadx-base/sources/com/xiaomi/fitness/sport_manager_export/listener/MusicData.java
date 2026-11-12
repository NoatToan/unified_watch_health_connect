package com.xiaomi.fitness.sport_manager_export.listener;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;", "", "name", "", "url", "id", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getUrl", "getId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MusicData {
    private final long id;

    @NotNull
    private final String name;

    @NotNull
    private final String url;

    public MusicData(@NotNull String name, @NotNull String url, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        this.name = name;
        this.url = url;
        this.id = j;
    }

    public static /* synthetic */ MusicData copy$default(MusicData musicData, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicData.name;
        }
        if ((i & 2) != 0) {
            str2 = musicData.url;
        }
        if ((i & 4) != 0) {
            j = musicData.id;
        }
        return musicData.copy(str, str2, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    public final MusicData copy(@NotNull String name, @NotNull String url, long id) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        return new MusicData(name, url, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicData)) {
            return false;
        }
        MusicData musicData = (MusicData) other;
        return Intrinsics.areEqual(this.name, musicData.name) && Intrinsics.areEqual(this.url, musicData.url) && this.id == musicData.id;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.url.hashCode()) * 31) + Long.hashCode(this.id);
    }

    @NotNull
    public String toString() {
        return "MusicData(name=" + this.name + ", url=" + this.url + ", id=" + this.id + ")";
    }

    public /* synthetic */ MusicData(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? -1L : j);
    }
}
