package com.huami.ai.speech.alexa.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J/\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/AlexaEntity;", "", "", "Lcom/huami/ai/speech/alexa/entity/ContextEntity;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "component1", "Lcom/huami/ai/speech/alexa/entity/EventEntity;", "component2", "contexts", "event", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getContexts", "()Ljava/util/List;", "b", "Lcom/huami/ai/speech/alexa/entity/EventEntity;", "getEvent", "()Lcom/huami/ai/speech/alexa/entity/EventEntity;", "<init>", "(Ljava/util/List;Lcom/huami/ai/speech/alexa/entity/EventEntity;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AlexaEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(DbUtils.Const.Table.CONTEXT)
    @NotNull
    private final List<ContextEntity<Payload>> contexts;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("event")
    @NotNull
    private final EventEntity<Payload> event;

    public AlexaEntity(@NotNull List<ContextEntity<Payload>> list, @NotNull EventEntity<Payload> eventEntity) {
        this.contexts = list;
        this.event = eventEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlexaEntity copy$default(AlexaEntity alexaEntity, List list, EventEntity eventEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            list = alexaEntity.contexts;
        }
        if ((i & 2) != 0) {
            eventEntity = alexaEntity.event;
        }
        return alexaEntity.copy(list, eventEntity);
    }

    @NotNull
    public final List<ContextEntity<Payload>> component1() {
        return this.contexts;
    }

    @NotNull
    public final EventEntity<Payload> component2() {
        return this.event;
    }

    @NotNull
    public final AlexaEntity copy(@NotNull List<ContextEntity<Payload>> contexts, @NotNull EventEntity<Payload> event) {
        return new AlexaEntity(contexts, event);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaEntity)) {
            return false;
        }
        AlexaEntity alexaEntity = (AlexaEntity) other;
        return Intrinsics.areEqual(this.contexts, alexaEntity.contexts) && Intrinsics.areEqual(this.event, alexaEntity.event);
    }

    @NotNull
    public final List<ContextEntity<Payload>> getContexts() {
        return this.contexts;
    }

    @NotNull
    public final EventEntity<Payload> getEvent() {
        return this.event;
    }

    public int hashCode() {
        return (this.contexts.hashCode() * 31) + this.event.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlexaEntity(contexts=" + this.contexts + ", event=" + this.event + ')';
    }
}
