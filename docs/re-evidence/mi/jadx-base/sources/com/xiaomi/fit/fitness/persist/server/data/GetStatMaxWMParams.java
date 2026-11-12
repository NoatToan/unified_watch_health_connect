package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetStatMaxWMParams;", "", "tag", "", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetStatMaxWMParams {

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("tag")
    @NotNull
    private final String tag;

    public GetStatMaxWMParams(@NotNull String tag, @NotNull String key) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        this.tag = tag;
        this.key = key;
    }

    public static /* synthetic */ GetStatMaxWMParams copy$default(GetStatMaxWMParams getStatMaxWMParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getStatMaxWMParams.tag;
        }
        if ((i & 2) != 0) {
            str2 = getStatMaxWMParams.key;
        }
        return getStatMaxWMParams.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final GetStatMaxWMParams copy(@NotNull String tag, @NotNull String key) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        return new GetStatMaxWMParams(tag, key);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetStatMaxWMParams)) {
            return false;
        }
        GetStatMaxWMParams getStatMaxWMParams = (GetStatMaxWMParams) other;
        return Intrinsics.areEqual(this.tag, getStatMaxWMParams.tag) && Intrinsics.areEqual(this.key, getStatMaxWMParams.key);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.key.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetStatMaxWMParams(tag=" + this.tag + ", key=" + this.key + ")";
    }
}
