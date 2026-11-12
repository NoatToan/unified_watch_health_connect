package com.huami.nps.api;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/nps/api/PostRatingTimeParam;", "", "", "component1", "", "component2", "timeZone", "time", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getTimeZone", "()I", "b", "J", "getTime", "()J", "<init>", "(IJ)V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PostRatingTimeParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("timezone")
    private final int timeZone;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("time")
    private final long time;

    public PostRatingTimeParam(int i, long j) {
        this.timeZone = i;
        this.time = j;
    }

    public static /* synthetic */ PostRatingTimeParam copy$default(PostRatingTimeParam postRatingTimeParam, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = postRatingTimeParam.timeZone;
        }
        if ((i2 & 2) != 0) {
            j = postRatingTimeParam.time;
        }
        return postRatingTimeParam.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final PostRatingTimeParam copy(int timeZone, long time) {
        return new PostRatingTimeParam(timeZone, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostRatingTimeParam)) {
            return false;
        }
        PostRatingTimeParam postRatingTimeParam = (PostRatingTimeParam) other;
        return this.timeZone == postRatingTimeParam.timeZone && this.time == postRatingTimeParam.time;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (this.timeZone * 31) + b.a(this.time);
    }

    @NotNull
    public String toString() {
        return "PostRatingTimeParam(timeZone=" + this.timeZone + ", time=" + this.time + ")";
    }
}
