package com.huami.ai.speech.alexa.entity;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/AlarmParam;", "", "", "component1", "Lcom/huami/ai/speech/alexa/entity/TriggerParam;", "component2", "endpointId", "trigger", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getEndpointId", "()Ljava/lang/String;", "b", "Lcom/huami/ai/speech/alexa/entity/TriggerParam;", "getTrigger", "()Lcom/huami/ai/speech/alexa/entity/TriggerParam;", "<init>", "(Ljava/lang/String;Lcom/huami/ai/speech/alexa/entity/TriggerParam;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AlarmParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("endpointId")
    @NotNull
    private final String endpointId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("trigger")
    @NotNull
    private final TriggerParam trigger;

    public AlarmParam(@NotNull String str, @NotNull TriggerParam triggerParam) {
        this.endpointId = str;
        this.trigger = triggerParam;
    }

    public static /* synthetic */ AlarmParam copy$default(AlarmParam alarmParam, String str, TriggerParam triggerParam, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alarmParam.endpointId;
        }
        if ((i & 2) != 0) {
            triggerParam = alarmParam.trigger;
        }
        return alarmParam.copy(str, triggerParam);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEndpointId() {
        return this.endpointId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TriggerParam getTrigger() {
        return this.trigger;
    }

    @NotNull
    public final AlarmParam copy(@NotNull String endpointId, @NotNull TriggerParam trigger) {
        return new AlarmParam(endpointId, trigger);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlarmParam)) {
            return false;
        }
        AlarmParam alarmParam = (AlarmParam) other;
        return Intrinsics.areEqual(this.endpointId, alarmParam.endpointId) && Intrinsics.areEqual(this.trigger, alarmParam.trigger);
    }

    @NotNull
    public final String getEndpointId() {
        return this.endpointId;
    }

    @NotNull
    public final TriggerParam getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        return (this.endpointId.hashCode() * 31) + this.trigger.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlarmParam(endpointId=" + this.endpointId + ", trigger=" + this.trigger + ')';
    }
}
