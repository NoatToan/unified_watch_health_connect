package com.huami.sky.lib.entity;

import com.huami.sky.lib.constant.WebConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/sky/lib/entity/MusicInfo;", "", "", "component1", "component2", WebConstant.QueryParam.CLIP_ID, "url", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getClipId", "()Ljava/lang/String;", "getUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicInfo {

    @NotNull
    private final String clipId;

    @NotNull
    private final String url;

    public MusicInfo(@NotNull String str, @NotNull String str2) {
        this.clipId = str;
        this.url = str2;
    }

    public static /* synthetic */ MusicInfo copy$default(MusicInfo musicInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicInfo.clipId;
        }
        if ((i & 2) != 0) {
            str2 = musicInfo.url;
        }
        return musicInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClipId() {
        return this.clipId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final MusicInfo copy(@NotNull String clipId, @NotNull String url) {
        return new MusicInfo(clipId, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicInfo)) {
            return false;
        }
        MusicInfo musicInfo = (MusicInfo) other;
        return Intrinsics.areEqual(this.clipId, musicInfo.clipId) && Intrinsics.areEqual(this.url, musicInfo.url);
    }

    @NotNull
    public final String getClipId() {
        return this.clipId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.clipId.hashCode() * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "MusicInfo(clipId=" + this.clipId + ", url=" + this.url + ")";
    }
}
