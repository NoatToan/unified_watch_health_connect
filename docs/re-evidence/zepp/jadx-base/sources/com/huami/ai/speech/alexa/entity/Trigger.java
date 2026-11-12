package com.huami.ai.speech.alexa.entity;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Trigger;", "", "", "component1", "component2", "Lcom/huami/ai/speech/alexa/entity/Recurrence;", "component3", "scheduledTime", "timeZoneId", "recurrence", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getScheduledTime", "()Ljava/lang/String;", "b", "getTimeZoneId", "c", "Lcom/huami/ai/speech/alexa/entity/Recurrence;", "getRecurrence", "()Lcom/huami/ai/speech/alexa/entity/Recurrence;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/ai/speech/alexa/entity/Recurrence;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Trigger {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("scheduledTime")
    @NotNull
    private final String scheduledTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("timeZoneId")
    @NotNull
    private final String timeZoneId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("recurrence")
    @Nullable
    private final Recurrence recurrence;

    public Trigger(@NotNull String str, @NotNull String str2, @Nullable Recurrence recurrence) {
        this.scheduledTime = str;
        this.timeZoneId = str2;
        this.recurrence = recurrence;
    }

    public static /* synthetic */ Trigger copy$default(Trigger trigger, String str, String str2, Recurrence recurrence, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trigger.scheduledTime;
        }
        if ((i & 2) != 0) {
            str2 = trigger.timeZoneId;
        }
        if ((i & 4) != 0) {
            recurrence = trigger.recurrence;
        }
        return trigger.copy(str, str2, recurrence);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Recurrence getRecurrence() {
        return this.recurrence;
    }

    @NotNull
    public final Trigger copy(@NotNull String scheduledTime, @NotNull String timeZoneId, @Nullable Recurrence recurrence) {
        return new Trigger(scheduledTime, timeZoneId, recurrence);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Trigger)) {
            return false;
        }
        Trigger trigger = (Trigger) other;
        return Intrinsics.areEqual(this.scheduledTime, trigger.scheduledTime) && Intrinsics.areEqual(this.timeZoneId, trigger.timeZoneId) && Intrinsics.areEqual(this.recurrence, trigger.recurrence);
    }

    @Nullable
    public final Recurrence getRecurrence() {
        return this.recurrence;
    }

    @NotNull
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    @NotNull
    public final String getTimeZoneId() {
        return this.timeZoneId;
    }

    public int hashCode() {
        int iHashCode = ((this.scheduledTime.hashCode() * 31) + this.timeZoneId.hashCode()) * 31;
        Recurrence recurrence = this.recurrence;
        return iHashCode + (recurrence == null ? 0 : recurrence.hashCode());
    }

    @NotNull
    public String toString() {
        return "Trigger(scheduledTime=" + this.scheduledTime + ", timeZoneId=" + this.timeZoneId + ", recurrence=" + this.recurrence + ')';
    }
}
