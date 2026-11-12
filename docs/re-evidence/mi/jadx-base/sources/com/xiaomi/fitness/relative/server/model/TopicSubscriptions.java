package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/TopicSubscriptions;", "", "topic", "", "subscribed", "", "<init>", "(Ljava/lang/String;Z)V", "getTopic", "()Ljava/lang/String;", "getSubscribed", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TopicSubscriptions {

    @SerializedName("subscribed")
    private final boolean subscribed;

    @SerializedName("topic")
    @NotNull
    private final String topic;

    public TopicSubscriptions(@SubscriptTopic @NotNull String topic, boolean z) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        this.topic = topic;
        this.subscribed = z;
    }

    public static /* synthetic */ TopicSubscriptions copy$default(TopicSubscriptions topicSubscriptions, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topicSubscriptions.topic;
        }
        if ((i & 2) != 0) {
            z = topicSubscriptions.subscribed;
        }
        return topicSubscriptions.copy(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSubscribed() {
        return this.subscribed;
    }

    @NotNull
    public final TopicSubscriptions copy(@SubscriptTopic @NotNull String topic, boolean subscribed) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        return new TopicSubscriptions(topic, subscribed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicSubscriptions)) {
            return false;
        }
        TopicSubscriptions topicSubscriptions = (TopicSubscriptions) other;
        return Intrinsics.areEqual(this.topic, topicSubscriptions.topic) && this.subscribed == topicSubscriptions.subscribed;
    }

    public final boolean getSubscribed() {
        return this.subscribed;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return (this.topic.hashCode() * 31) + Boolean.hashCode(this.subscribed);
    }

    @NotNull
    public String toString() {
        return "TopicSubscriptions(topic=" + this.topic + ", subscribed=" + this.subscribed + ")";
    }
}
