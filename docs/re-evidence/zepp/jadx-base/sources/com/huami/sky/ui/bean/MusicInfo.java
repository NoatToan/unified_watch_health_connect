package com.huami.sky.ui.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicTags;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b4\u00105J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JW\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u0011\u0010$\"\u0004\b%\u0010&R\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R!\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/huami/sky/ui/bean/MusicInfo;", "", "", "component1", "component2", "component3", "", "component4", "", "component5", "component6", "", "Lcom/huami/sky/lib/entity/MusicTags;", "component7", WebConstant.QueryParam.CLIP_ID, "musicUrl", "animUrl", "isLiked", "playStatus", "musicTag", "tags", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getClipId", "()Ljava/lang/String;", "b", "getMusicUrl", "c", "getAnimUrl", GoogleApiAvailabilityLight.a, "Z", "()Z", "setLiked", "(Z)V", "e", LogUtil.I, "getPlayStatus", "()I", "setPlayStatus", "(I)V", "f", "getMusicTag", "setMusicTag", "g", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/util/List;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String clipId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String musicUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String animUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean isLiked;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int playStatus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private int musicTag;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<MusicTags> tags;

    public MusicInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, int i, int i2, @Nullable List<MusicTags> list) {
        this.clipId = str;
        this.musicUrl = str2;
        this.animUrl = str3;
        this.isLiked = z;
        this.playStatus = i;
        this.musicTag = i2;
        this.tags = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicInfo copy$default(MusicInfo musicInfo, String str, String str2, String str3, boolean z, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = musicInfo.clipId;
        }
        if ((i3 & 2) != 0) {
            str2 = musicInfo.musicUrl;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = musicInfo.animUrl;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            z = musicInfo.isLiked;
        }
        boolean z2 = z;
        if ((i3 & 16) != 0) {
            i = musicInfo.playStatus;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = musicInfo.musicTag;
        }
        int i5 = i2;
        if ((i3 & 64) != 0) {
            list = musicInfo.tags;
        }
        return musicInfo.copy(str, str4, str5, z2, i4, i5, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClipId() {
        return this.clipId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMusicUrl() {
        return this.musicUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAnimUrl() {
        return this.animUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsLiked() {
        return this.isLiked;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPlayStatus() {
        return this.playStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMusicTag() {
        return this.musicTag;
    }

    @Nullable
    public final List<MusicTags> component7() {
        return this.tags;
    }

    @NotNull
    public final MusicInfo copy(@NotNull String clipId, @NotNull String musicUrl, @NotNull String animUrl, boolean isLiked, int playStatus, int musicTag, @Nullable List<MusicTags> tags) {
        return new MusicInfo(clipId, musicUrl, animUrl, isLiked, playStatus, musicTag, tags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicInfo)) {
            return false;
        }
        MusicInfo musicInfo = (MusicInfo) other;
        return Intrinsics.areEqual(this.clipId, musicInfo.clipId) && Intrinsics.areEqual(this.musicUrl, musicInfo.musicUrl) && Intrinsics.areEqual(this.animUrl, musicInfo.animUrl) && this.isLiked == musicInfo.isLiked && this.playStatus == musicInfo.playStatus && this.musicTag == musicInfo.musicTag && Intrinsics.areEqual(this.tags, musicInfo.tags);
    }

    @NotNull
    public final String getAnimUrl() {
        return this.animUrl;
    }

    @NotNull
    public final String getClipId() {
        return this.clipId;
    }

    public final int getMusicTag() {
        return this.musicTag;
    }

    @NotNull
    public final String getMusicUrl() {
        return this.musicUrl;
    }

    public final int getPlayStatus() {
        return this.playStatus;
    }

    @Nullable
    public final List<MusicTags> getTags() {
        return this.tags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.clipId.hashCode() * 31) + this.musicUrl.hashCode()) * 31) + this.animUrl.hashCode()) * 31;
        boolean z = this.isLiked;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (((((iHashCode + r1) * 31) + this.playStatus) * 31) + this.musicTag) * 31;
        List<MusicTags> list = this.tags;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public final void setLiked(boolean z) {
        this.isLiked = z;
    }

    public final void setMusicTag(int i) {
        this.musicTag = i;
    }

    public final void setPlayStatus(int i) {
        this.playStatus = i;
    }

    @NotNull
    public String toString() {
        return "MusicInfo(clipId=" + this.clipId + ", musicUrl=" + this.musicUrl + ", animUrl=" + this.animUrl + ", isLiked=" + this.isLiked + ", playStatus=" + this.playStatus + ", musicTag=" + this.musicTag + ", tags=" + this.tags + ")";
    }

    public /* synthetic */ MusicInfo(String str, String str2, String str3, boolean z, int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, list);
    }
}
