package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/ExpectSpeechPayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "component1", "Lcom/huami/ai/speech/alexa/entity/payload/Initiator;", "component2", "timeoutInMilliseconds", "initiator", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getTimeoutInMilliseconds", "()J", "b", "Lcom/huami/ai/speech/alexa/entity/payload/Initiator;", "getInitiator", "()Lcom/huami/ai/speech/alexa/entity/payload/Initiator;", "<init>", "(JLcom/huami/ai/speech/alexa/entity/payload/Initiator;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ExpectSpeechPayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("timeoutInMilliseconds")
    private final long timeoutInMilliseconds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("initiator")
    @NotNull
    private final Initiator initiator;

    public ExpectSpeechPayload(long j, @NotNull Initiator initiator) {
        this.timeoutInMilliseconds = j;
        this.initiator = initiator;
    }

    public static /* synthetic */ ExpectSpeechPayload copy$default(ExpectSpeechPayload expectSpeechPayload, long j, Initiator initiator, int i, Object obj) {
        if ((i & 1) != 0) {
            j = expectSpeechPayload.timeoutInMilliseconds;
        }
        if ((i & 2) != 0) {
            initiator = expectSpeechPayload.initiator;
        }
        return expectSpeechPayload.copy(j, initiator);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Initiator getInitiator() {
        return this.initiator;
    }

    @NotNull
    public final ExpectSpeechPayload copy(long timeoutInMilliseconds, @NotNull Initiator initiator) {
        return new ExpectSpeechPayload(timeoutInMilliseconds, initiator);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpectSpeechPayload)) {
            return false;
        }
        ExpectSpeechPayload expectSpeechPayload = (ExpectSpeechPayload) other;
        return this.timeoutInMilliseconds == expectSpeechPayload.timeoutInMilliseconds && Intrinsics.areEqual(this.initiator, expectSpeechPayload.initiator);
    }

    @NotNull
    public final Initiator getInitiator() {
        return this.initiator;
    }

    public final long getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    public int hashCode() {
        return (b.a(this.timeoutInMilliseconds) * 31) + this.initiator.hashCode();
    }

    @NotNull
    public String toString() {
        return "ExpectSpeechPayload(timeoutInMilliseconds=" + this.timeoutInMilliseconds + ", initiator=" + this.initiator + ')';
    }
}
