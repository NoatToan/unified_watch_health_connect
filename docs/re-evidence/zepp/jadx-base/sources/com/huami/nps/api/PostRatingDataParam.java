package com.huami.nps.api;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/nps/api/PostRatingDataParam;", "", "", "component1", "Lcom/google/gson/JsonObject;", "component2", "tId", "result", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTId", "()Ljava/lang/String;", "b", "Lcom/google/gson/JsonObject;", "getResult", "()Lcom/google/gson/JsonObject;", "<init>", "(Ljava/lang/String;Lcom/google/gson/JsonObject;)V", "nps_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PostRatingDataParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("tid")
    @NotNull
    private final String tId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("result")
    @NotNull
    private final JsonObject result;

    public PostRatingDataParam(@NotNull String str, @NotNull JsonObject jsonObject) {
        this.tId = str;
        this.result = jsonObject;
    }

    public static /* synthetic */ PostRatingDataParam copy$default(PostRatingDataParam postRatingDataParam, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postRatingDataParam.tId;
        }
        if ((i & 2) != 0) {
            jsonObject = postRatingDataParam.result;
        }
        return postRatingDataParam.copy(str, jsonObject);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTId() {
        return this.tId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getResult() {
        return this.result;
    }

    @NotNull
    public final PostRatingDataParam copy(@NotNull String tId, @NotNull JsonObject result) {
        return new PostRatingDataParam(tId, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostRatingDataParam)) {
            return false;
        }
        PostRatingDataParam postRatingDataParam = (PostRatingDataParam) other;
        return Intrinsics.areEqual(this.tId, postRatingDataParam.tId) && Intrinsics.areEqual(this.result, postRatingDataParam.result);
    }

    @NotNull
    public final JsonObject getResult() {
        return this.result;
    }

    @NotNull
    public final String getTId() {
        return this.tId;
    }

    public int hashCode() {
        return (this.tId.hashCode() * 31) + this.result.hashCode();
    }

    @NotNull
    public String toString() {
        return "PostRatingDataParam(tId=" + this.tId + ", result=" + this.result + ")";
    }
}
