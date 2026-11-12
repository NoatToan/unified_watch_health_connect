package com.huami.ai.speech.alexa.entity;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/EventEntityWrapper;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/huami/ai/speech/alexa/entity/EventEntity;", "component1", "event", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/ai/speech/alexa/entity/EventEntity;", "getEvent", "()Lcom/huami/ai/speech/alexa/entity/EventEntity;", "<init>", "(Lcom/huami/ai/speech/alexa/entity/EventEntity;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EventEntityWrapper<T extends Payload> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("event")
    @NotNull
    private final EventEntity<T> event;

    public EventEntityWrapper(@NotNull EventEntity<T> eventEntity) {
        this.event = eventEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventEntityWrapper copy$default(EventEntityWrapper eventEntityWrapper, EventEntity eventEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            eventEntity = eventEntityWrapper.event;
        }
        return eventEntityWrapper.copy(eventEntity);
    }

    @NotNull
    public final EventEntity<T> component1() {
        return this.event;
    }

    @NotNull
    public final EventEntityWrapper<T> copy(@NotNull EventEntity<T> event) {
        return new EventEntityWrapper<>(event);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EventEntityWrapper) && Intrinsics.areEqual(this.event, ((EventEntityWrapper) other).event);
    }

    @NotNull
    public final EventEntity<T> getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.event.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventEntityWrapper(event=" + this.event + ')';
    }
}
