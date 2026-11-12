package com.huami.ai.speech.alexa.entity;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/TriggerParam;", "", "", "component1", "scheduledTime", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getScheduledTime", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TriggerParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("scheduledTime")
    @NotNull
    private final String scheduledTime;

    public TriggerParam(@NotNull String str) {
        this.scheduledTime = str;
    }

    public static /* synthetic */ TriggerParam copy$default(TriggerParam triggerParam, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = triggerParam.scheduledTime;
        }
        return triggerParam.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    @NotNull
    public final TriggerParam copy(@NotNull String scheduledTime) {
        return new TriggerParam(scheduledTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TriggerParam) && Intrinsics.areEqual(this.scheduledTime, ((TriggerParam) other).scheduledTime);
    }

    @NotNull
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    public int hashCode() {
        return this.scheduledTime.hashCode();
    }

    @NotNull
    public String toString() {
        return "TriggerParam(scheduledTime=" + this.scheduledTime + ')';
    }
}
