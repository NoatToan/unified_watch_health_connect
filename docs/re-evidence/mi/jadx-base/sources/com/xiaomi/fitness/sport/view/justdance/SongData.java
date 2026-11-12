package com.xiaomi.fitness.sport.view.justdance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/SongData;", "", "songName", "", "shareUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSongName", "()Ljava/lang/String;", "setSongName", "(Ljava/lang/String;)V", "getShareUrl", "setShareUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SongData {

    @Nullable
    private String shareUrl;

    @Nullable
    private String songName;

    /* JADX WARN: Multi-variable type inference failed */
    public SongData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SongData copy$default(SongData songData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = songData.songName;
        }
        if ((i & 2) != 0) {
            str2 = songData.shareUrl;
        }
        return songData.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSongName() {
        return this.songName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    @NotNull
    public final SongData copy(@Nullable String songName, @Nullable String shareUrl) {
        return new SongData(songName, shareUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SongData)) {
            return false;
        }
        SongData songData = (SongData) other;
        return Intrinsics.areEqual(this.songName, songData.songName) && Intrinsics.areEqual(this.shareUrl, songData.shareUrl);
    }

    @Nullable
    public final String getShareUrl() {
        return this.shareUrl;
    }

    @Nullable
    public final String getSongName() {
        return this.songName;
    }

    public int hashCode() {
        String str = this.songName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shareUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setShareUrl(@Nullable String str) {
        this.shareUrl = str;
    }

    public final void setSongName(@Nullable String str) {
        this.songName = str;
    }

    @NotNull
    public String toString() {
        return "SongData(songName=" + this.songName + ", shareUrl=" + this.shareUrl + ")";
    }

    public SongData(@Nullable String str, @Nullable String str2) {
        this.songName = str;
        this.shareUrl = str2;
    }

    public /* synthetic */ SongData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
