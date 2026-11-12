package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/Initiator;", "", "", "component1", "Lcom/huami/ai/speech/alexa/entity/payload/InitiatorPayload;", "component2", "type", "payload", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "Lcom/huami/ai/speech/alexa/entity/payload/InitiatorPayload;", "getPayload", "()Lcom/huami/ai/speech/alexa/entity/payload/InitiatorPayload;", "<init>", "(Ljava/lang/String;Lcom/huami/ai/speech/alexa/entity/payload/InitiatorPayload;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Initiator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("payload")
    @Nullable
    private final InitiatorPayload payload;

    /* JADX WARN: Multi-variable type inference failed */
    public Initiator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public Initiator(@NotNull String str, @Nullable InitiatorPayload initiatorPayload) {
        this.type = str;
        this.payload = initiatorPayload;
    }

    public static /* synthetic */ Initiator copy$default(Initiator initiator, String str, InitiatorPayload initiatorPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initiator.type;
        }
        if ((i & 2) != 0) {
            initiatorPayload = initiator.payload;
        }
        return initiator.copy(str, initiatorPayload);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InitiatorPayload getPayload() {
        return this.payload;
    }

    @NotNull
    public final Initiator copy(@NotNull String type, @Nullable InitiatorPayload payload) {
        return new Initiator(type, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Initiator)) {
            return false;
        }
        Initiator initiator = (Initiator) other;
        return Intrinsics.areEqual(this.type, initiator.type) && Intrinsics.areEqual(this.payload, initiator.payload);
    }

    @Nullable
    public final InitiatorPayload getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        InitiatorPayload initiatorPayload = this.payload;
        return iHashCode + (initiatorPayload == null ? 0 : initiatorPayload.hashCode());
    }

    @NotNull
    public String toString() {
        return "Initiator(type=" + this.type + ", payload=" + this.payload + ')';
    }

    public /* synthetic */ Initiator(String str, InitiatorPayload initiatorPayload, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "TAP" : str, (i & 2) != 0 ? null : initiatorPayload);
    }
}
