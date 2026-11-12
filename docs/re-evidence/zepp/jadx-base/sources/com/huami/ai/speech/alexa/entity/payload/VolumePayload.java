package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/VolumePayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "component1", "volume", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getVolume", "()J", "<init>", "(J)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VolumePayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("volume")
    private final long volume;

    public VolumePayload(long j) {
        this.volume = j;
    }

    public static /* synthetic */ VolumePayload copy$default(VolumePayload volumePayload, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = volumePayload.volume;
        }
        return volumePayload.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getVolume() {
        return this.volume;
    }

    @NotNull
    public final VolumePayload copy(long volume) {
        return new VolumePayload(volume);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VolumePayload) && this.volume == ((VolumePayload) other).volume;
    }

    public final long getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return b.a(this.volume);
    }

    @NotNull
    public String toString() {
        return "VolumePayload(volume=" + this.volume + ')';
    }
}
