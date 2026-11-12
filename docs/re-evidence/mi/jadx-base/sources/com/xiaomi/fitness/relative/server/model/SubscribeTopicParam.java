package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/SubscribeTopicParam;", "", "relativeId", "", "topic", "", "act", "", "<init>", "(JLjava/lang/String;I)V", "getRelativeId", "()J", "getTopic", "()Ljava/lang/String;", "getAct", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SubscribeTopicParam {

    @SerializedName("act")
    private final int act;

    @SerializedName("relative_uid")
    private final long relativeId;

    @SerializedName("topic")
    @NotNull
    private final String topic;

    public SubscribeTopicParam(long j, @NotNull String topic, int i) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        this.relativeId = j;
        this.topic = topic;
        this.act = i;
    }

    public static /* synthetic */ SubscribeTopicParam copy$default(SubscribeTopicParam subscribeTopicParam, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = subscribeTopicParam.relativeId;
        }
        if ((i2 & 2) != 0) {
            str = subscribeTopicParam.topic;
        }
        if ((i2 & 4) != 0) {
            i = subscribeTopicParam.act;
        }
        return subscribeTopicParam.copy(j, str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRelativeId() {
        return this.relativeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAct() {
        return this.act;
    }

    @NotNull
    public final SubscribeTopicParam copy(long relativeId, @NotNull String topic, int act) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        return new SubscribeTopicParam(relativeId, topic, act);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeTopicParam)) {
            return false;
        }
        SubscribeTopicParam subscribeTopicParam = (SubscribeTopicParam) other;
        return this.relativeId == subscribeTopicParam.relativeId && Intrinsics.areEqual(this.topic, subscribeTopicParam.topic) && this.act == subscribeTopicParam.act;
    }

    public final int getAct() {
        return this.act;
    }

    public final long getRelativeId() {
        return this.relativeId;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return (((Long.hashCode(this.relativeId) * 31) + this.topic.hashCode()) * 31) + Integer.hashCode(this.act);
    }

    @NotNull
    public String toString() {
        return "SubscribeTopicParam(relativeId=" + this.relativeId + ", topic=" + this.topic + ", act=" + this.act + ")";
    }
}
