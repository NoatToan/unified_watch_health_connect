package com.huami.ai.speech.alexa.entity.payload;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\t\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/RecognizePayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "component1", "component2", "Lcom/huami/ai/speech/alexa/entity/payload/Initiator;", "component3", Scopes.PROFILE, TrainingWebConst.QueryParam.VIDEO_FORMAT, "initiator", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getProfile", "()Ljava/lang/String;", "b", "getFormat", "c", "Lcom/huami/ai/speech/alexa/entity/payload/Initiator;", "getInitiator", "()Lcom/huami/ai/speech/alexa/entity/payload/Initiator;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/ai/speech/alexa/entity/payload/Initiator;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RecognizePayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(Scopes.PROFILE)
    @NotNull
    private final String profile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(TrainingWebConst.QueryParam.VIDEO_FORMAT)
    @NotNull
    private final String format;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("initiator")
    @NotNull
    private final Initiator initiator;

    public RecognizePayload(@NotNull String str, @NotNull String str2, @NotNull Initiator initiator) {
        this.profile = str;
        this.format = str2;
        this.initiator = initiator;
    }

    public static /* synthetic */ RecognizePayload copy$default(RecognizePayload recognizePayload, String str, String str2, Initiator initiator, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recognizePayload.profile;
        }
        if ((i & 2) != 0) {
            str2 = recognizePayload.format;
        }
        if ((i & 4) != 0) {
            initiator = recognizePayload.initiator;
        }
        return recognizePayload.copy(str, str2, initiator);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProfile() {
        return this.profile;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Initiator getInitiator() {
        return this.initiator;
    }

    @NotNull
    public final RecognizePayload copy(@NotNull String profile, @NotNull String format, @NotNull Initiator initiator) {
        return new RecognizePayload(profile, format, initiator);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecognizePayload)) {
            return false;
        }
        RecognizePayload recognizePayload = (RecognizePayload) other;
        return Intrinsics.areEqual(this.profile, recognizePayload.profile) && Intrinsics.areEqual(this.format, recognizePayload.format) && Intrinsics.areEqual(this.initiator, recognizePayload.initiator);
    }

    @NotNull
    public final String getFormat() {
        return this.format;
    }

    @NotNull
    public final Initiator getInitiator() {
        return this.initiator;
    }

    @NotNull
    public final String getProfile() {
        return this.profile;
    }

    public int hashCode() {
        return (((this.profile.hashCode() * 31) + this.format.hashCode()) * 31) + this.initiator.hashCode();
    }

    @NotNull
    public String toString() {
        return "RecognizePayload(profile=" + this.profile + ", format=" + this.format + ", initiator=" + this.initiator + ')';
    }
}
