package com.huami.sleepassistant.apilib.bean;

import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003Jc\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0013\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b\u0015\u0010)R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b*\u0010\u001f¨\u0006-"}, d2 = {"Lcom/huami/sleepassistant/apilib/bean/SleepMusicBean;", "", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "", "component8", "component9", "id", "title", "url", "bgSrc", "logoSrc", "time", "status", "isLike", "collectionId", "copy", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "getUrl", "getBgSrc", "getLogoSrc", "J", "getTime", "()J", "getStatus", "Z", "()Z", "getCollectionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;)V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepMusicBean {

    @NotNull
    private final String bgSrc;

    @NotNull
    private final String collectionId;

    @NotNull
    private final String id;
    private final boolean isLike;

    @NotNull
    private final String logoSrc;

    @NotNull
    private final String status;
    private final long time;

    @NotNull
    private final String title;

    @NotNull
    private final String url;

    public SleepMusicBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull String str6, boolean z, @NotNull String str7) {
        this.id = str;
        this.title = str2;
        this.url = str3;
        this.bgSrc = str4;
        this.logoSrc = str5;
        this.time = j;
        this.status = str6;
        this.isLike = z;
        this.collectionId = str7;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBgSrc() {
        return this.bgSrc;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLogoSrc() {
        return this.logoSrc;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsLike() {
        return this.isLike;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    @NotNull
    public final SleepMusicBean copy(@NotNull String id, @NotNull String title, @NotNull String url, @NotNull String bgSrc, @NotNull String logoSrc, long time, @NotNull String status, boolean isLike, @NotNull String collectionId) {
        return new SleepMusicBean(id, title, url, bgSrc, logoSrc, time, status, isLike, collectionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepMusicBean)) {
            return false;
        }
        SleepMusicBean sleepMusicBean = (SleepMusicBean) other;
        return Intrinsics.areEqual(this.id, sleepMusicBean.id) && Intrinsics.areEqual(this.title, sleepMusicBean.title) && Intrinsics.areEqual(this.url, sleepMusicBean.url) && Intrinsics.areEqual(this.bgSrc, sleepMusicBean.bgSrc) && Intrinsics.areEqual(this.logoSrc, sleepMusicBean.logoSrc) && this.time == sleepMusicBean.time && Intrinsics.areEqual(this.status, sleepMusicBean.status) && this.isLike == sleepMusicBean.isLike && Intrinsics.areEqual(this.collectionId, sleepMusicBean.collectionId);
    }

    @NotNull
    public final String getBgSrc() {
        return this.bgSrc;
    }

    @NotNull
    public final String getCollectionId() {
        return this.collectionId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLogoSrc() {
        return this.logoSrc;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    public int hashCode() {
        int iHashCode = ((((((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31) + this.bgSrc.hashCode()) * 31) + this.logoSrc.hashCode()) * 31) + b.a(this.time)) * 31) + this.status.hashCode()) * 31;
        boolean z = this.isLike;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.collectionId.hashCode();
    }

    public final boolean isLike() {
        return this.isLike;
    }

    @NotNull
    public String toString() {
        return "SleepMusicBean(id=" + this.id + ", title=" + this.title + ", url=" + this.url + ", bgSrc=" + this.bgSrc + ", logoSrc=" + this.logoSrc + ", time=" + this.time + ", status=" + this.status + ", isLike=" + this.isLike + ", collectionId=" + this.collectionId + ')';
    }
}
