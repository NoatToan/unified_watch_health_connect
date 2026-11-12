package com.huami.ai.speech.alexa.entity.payload;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/VolumeStatePayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "component1", "", "component2", "muted", "volume", "copy", "", "toString", "hashCode", "", "other", "equals", "a", "Z", "getMuted", "()Z", "b", LogUtil.I, "getVolume", "()I", "<init>", "(ZI)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VolumeStatePayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("muted")
    private final boolean muted;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("volume")
    private final int volume;

    /* JADX WARN: Multi-variable type inference failed */
    public VolumeStatePayload() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public VolumeStatePayload(boolean z, int i) {
        this.muted = z;
        this.volume = i;
    }

    public static /* synthetic */ VolumeStatePayload copy$default(VolumeStatePayload volumeStatePayload, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = volumeStatePayload.muted;
        }
        if ((i2 & 2) != 0) {
            i = volumeStatePayload.volume;
        }
        return volumeStatePayload.copy(z, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getMuted() {
        return this.muted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVolume() {
        return this.volume;
    }

    @NotNull
    public final VolumeStatePayload copy(boolean muted, int volume) {
        return new VolumeStatePayload(muted, volume);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolumeStatePayload)) {
            return false;
        }
        VolumeStatePayload volumeStatePayload = (VolumeStatePayload) other;
        return this.muted == volumeStatePayload.muted && this.volume == volumeStatePayload.volume;
    }

    public final boolean getMuted() {
        return this.muted;
    }

    public final int getVolume() {
        return this.volume;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.muted;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.volume;
    }

    @NotNull
    public String toString() {
        return "VolumeStatePayload(muted=" + this.muted + ", volume=" + this.volume + ')';
    }

    public /* synthetic */ VolumeStatePayload(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 100 : i);
    }
}
