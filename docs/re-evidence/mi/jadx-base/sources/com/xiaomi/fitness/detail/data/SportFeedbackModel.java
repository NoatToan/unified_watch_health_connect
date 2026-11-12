package com.xiaomi.fitness.detail.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/data/SportFeedbackModel;", "", "timestamp", "", "starValue", "", "<init>", "(JF)V", "getTimestamp", "()J", "getStarValue", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportFeedbackModel {
    private final float starValue;
    private final long timestamp;

    public SportFeedbackModel(long j, float f) {
        this.timestamp = j;
        this.starValue = f;
    }

    public static /* synthetic */ SportFeedbackModel copy$default(SportFeedbackModel sportFeedbackModel, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sportFeedbackModel.timestamp;
        }
        if ((i & 2) != 0) {
            f = sportFeedbackModel.starValue;
        }
        return sportFeedbackModel.copy(j, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getStarValue() {
        return this.starValue;
    }

    @NotNull
    public final SportFeedbackModel copy(long timestamp, float starValue) {
        return new SportFeedbackModel(timestamp, starValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportFeedbackModel)) {
            return false;
        }
        SportFeedbackModel sportFeedbackModel = (SportFeedbackModel) other;
        return this.timestamp == sportFeedbackModel.timestamp && Float.compare(this.starValue, sportFeedbackModel.starValue) == 0;
    }

    public final float getStarValue() {
        return this.starValue;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (Long.hashCode(this.timestamp) * 31) + Float.hashCode(this.starValue);
    }

    @NotNull
    public String toString() {
        return "SportFeedbackModel(timestamp=" + this.timestamp + ", starValue=" + this.starValue + ")";
    }
}
