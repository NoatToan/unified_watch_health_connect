package com.huami.sleepassistant.apilib.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b:\u0010;J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0007HÆ\u0003JY\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b\u0013\u00104\"\u0004\b5\u00106R\"\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010*\u001a\u0004\b8\u0010,\"\u0004\b9\u0010.¨\u0006<"}, d2 = {"Lcom/huami/sleepassistant/apilib/db/po/LiveMusic;", "", "", "component1", "component2", "component3", "component4", "", "component5", "component6", "", "component7", "component8", "sid", "userId", "name", "description", WebConst.QueryParam.PLAY_TIME, "itemImgUrl", "isDown", "progress", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "b", "getUserId", "setUserId", "c", "getName", "setName", GoogleApiAvailabilityLight.a, "getDescription", "setDescription", "e", LogUtil.I, "getPlayTime", "()I", "setPlayTime", "(I)V", "f", "getItemImgUrl", "setItemImgUrl", "g", "Z", "()Z", "setDown", "(Z)V", "h", "getProgress", "setProgress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZI)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LiveMusic {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @NotNull
    private String sid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int playTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private String itemImgUrl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private boolean isDown;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private int progress;

    public LiveMusic(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, boolean z, int i2) {
        this.sid = str;
        this.userId = str2;
        this.name = str3;
        this.description = str4;
        this.playTime = i;
        this.itemImgUrl = str5;
        this.isDown = z;
        this.progress = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPlayTime() {
        return this.playTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getItemImgUrl() {
        return this.itemImgUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsDown() {
        return this.isDown;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final LiveMusic copy(@NotNull String sid, @NotNull String userId, @NotNull String name, @NotNull String description, int playTime, @NotNull String itemImgUrl, boolean isDown, int progress) {
        return new LiveMusic(sid, userId, name, description, playTime, itemImgUrl, isDown, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveMusic)) {
            return false;
        }
        LiveMusic liveMusic = (LiveMusic) other;
        return Intrinsics.areEqual(this.sid, liveMusic.sid) && Intrinsics.areEqual(this.userId, liveMusic.userId) && Intrinsics.areEqual(this.name, liveMusic.name) && Intrinsics.areEqual(this.description, liveMusic.description) && this.playTime == liveMusic.playTime && Intrinsics.areEqual(this.itemImgUrl, liveMusic.itemImgUrl) && this.isDown == liveMusic.isDown && this.progress == liveMusic.progress;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getItemImgUrl() {
        return this.itemImgUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPlayTime() {
        return this.playTime;
    }

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    public int hashCode() {
        int iHashCode = ((((((((((this.sid.hashCode() * 31) + this.userId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.playTime) * 31) + this.itemImgUrl.hashCode()) * 31;
        boolean z = this.isDown;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.progress;
    }

    public final boolean isDown() {
        return this.isDown;
    }

    public final void setDescription(@NotNull String str) {
        this.description = str;
    }

    public final void setDown(boolean z) {
        this.isDown = z;
    }

    public final void setItemImgUrl(@NotNull String str) {
        this.itemImgUrl = str;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setPlayTime(int i) {
        this.playTime = i;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setSid(@NotNull String str) {
        this.sid = str;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "LiveMusic(sid=" + this.sid + ", userId=" + this.userId + ", name=" + this.name + ", description=" + this.description + ", playTime=" + this.playTime + ", itemImgUrl=" + this.itemImgUrl + ", isDown=" + this.isDown + ", progress=" + this.progress + ')';
    }

    public /* synthetic */ LiveMusic(String str, String str2, String str3, String str4, int i, String str5, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, str2, str3, str4, i, str5, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? 0 : i2);
    }
}
