package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import com.huami.ai.speech.alexa.entity.AudioContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/PlayPayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "Lcom/huami/ai/speech/alexa/entity/payload/AudioItem;", "component1", "", "component2", "audioItem", "playBehavior", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/huami/ai/speech/alexa/entity/payload/AudioItem;", "getAudioItem", "()Lcom/huami/ai/speech/alexa/entity/payload/AudioItem;", "b", "Ljava/lang/String;", "getPlayBehavior", "()Ljava/lang/String;", "Lcom/huami/ai/speech/alexa/entity/AudioContent;", "c", "Lcom/huami/ai/speech/alexa/entity/AudioContent;", "getAudio", "()Lcom/huami/ai/speech/alexa/entity/AudioContent;", "setAudio", "(Lcom/huami/ai/speech/alexa/entity/AudioContent;)V", "audio", "<init>", "(Lcom/huami/ai/speech/alexa/entity/payload/AudioItem;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PlayPayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("audioItem")
    @NotNull
    private final AudioItem audioItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("playBehavior")
    @NotNull
    private final String playBehavior;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private AudioContent audio;

    public PlayPayload(@NotNull AudioItem audioItem, @NotNull String str) {
        this.audioItem = audioItem;
        this.playBehavior = str;
    }

    public static /* synthetic */ PlayPayload copy$default(PlayPayload playPayload, AudioItem audioItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            audioItem = playPayload.audioItem;
        }
        if ((i & 2) != 0) {
            str = playPayload.playBehavior;
        }
        return playPayload.copy(audioItem, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AudioItem getAudioItem() {
        return this.audioItem;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlayBehavior() {
        return this.playBehavior;
    }

    @NotNull
    public final PlayPayload copy(@NotNull AudioItem audioItem, @NotNull String playBehavior) {
        return new PlayPayload(audioItem, playBehavior);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayPayload)) {
            return false;
        }
        PlayPayload playPayload = (PlayPayload) other;
        return Intrinsics.areEqual(this.audioItem, playPayload.audioItem) && Intrinsics.areEqual(this.playBehavior, playPayload.playBehavior);
    }

    @Nullable
    public final AudioContent getAudio() {
        return this.audio;
    }

    @NotNull
    public final AudioItem getAudioItem() {
        return this.audioItem;
    }

    @NotNull
    public final String getPlayBehavior() {
        return this.playBehavior;
    }

    public int hashCode() {
        return (this.audioItem.hashCode() * 31) + this.playBehavior.hashCode();
    }

    public final void setAudio(@Nullable AudioContent audioContent) {
        this.audio = audioContent;
    }

    @NotNull
    public String toString() {
        return "PlayPayload(audioItem=" + this.audioItem + ", playBehavior=" + this.playBehavior + ')';
    }
}
