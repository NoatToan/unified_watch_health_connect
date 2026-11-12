package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/GetTopSubscriptionParam;", "", "relativeId", "", "topics", "", "", "<init>", "(JLjava/util/List;)V", "getRelativeId", "()J", "getTopics", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetTopSubscriptionParam {

    @SerializedName("relative_uid")
    private final long relativeId;

    @SerializedName("topics")
    @NotNull
    private final List<String> topics;

    public GetTopSubscriptionParam(long j, @NotNull List<String> topics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        this.relativeId = j;
        this.topics = topics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetTopSubscriptionParam copy$default(GetTopSubscriptionParam getTopSubscriptionParam, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = getTopSubscriptionParam.relativeId;
        }
        if ((i & 2) != 0) {
            list = getTopSubscriptionParam.topics;
        }
        return getTopSubscriptionParam.copy(j, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRelativeId() {
        return this.relativeId;
    }

    @NotNull
    public final List<String> component2() {
        return this.topics;
    }

    @NotNull
    public final GetTopSubscriptionParam copy(long relativeId, @NotNull List<String> topics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        return new GetTopSubscriptionParam(relativeId, topics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTopSubscriptionParam)) {
            return false;
        }
        GetTopSubscriptionParam getTopSubscriptionParam = (GetTopSubscriptionParam) other;
        return this.relativeId == getTopSubscriptionParam.relativeId && Intrinsics.areEqual(this.topics, getTopSubscriptionParam.topics);
    }

    public final long getRelativeId() {
        return this.relativeId;
    }

    @NotNull
    public final List<String> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        return (Long.hashCode(this.relativeId) * 31) + this.topics.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetTopSubscriptionParam(relativeId=" + this.relativeId + ", topics=" + this.topics + ")";
    }
}
