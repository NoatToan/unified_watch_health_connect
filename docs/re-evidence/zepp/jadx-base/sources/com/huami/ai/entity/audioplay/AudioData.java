package com.huami.ai.entity.audioplay;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/ai/entity/audioplay/AudioData;", "", "Lcom/huami/ai/entity/audioplay/PlayBehavior;", "component1", "", "Lcom/huami/ai/entity/audioplay/AudioItem;", "component2", "playBehavior", "audioItems", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/ai/entity/audioplay/PlayBehavior;", "getPlayBehavior", "()Lcom/huami/ai/entity/audioplay/PlayBehavior;", "b", "Ljava/util/List;", "getAudioItems", "()Ljava/util/List;", "<init>", "(Lcom/huami/ai/entity/audioplay/PlayBehavior;Ljava/util/List;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AudioData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final PlayBehavior playBehavior;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<AudioItem> audioItems;

    public AudioData(@NotNull PlayBehavior playBehavior, @NotNull List<AudioItem> list) {
        this.playBehavior = playBehavior;
        this.audioItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioData copy$default(AudioData audioData, PlayBehavior playBehavior, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            playBehavior = audioData.playBehavior;
        }
        if ((i & 2) != 0) {
            list = audioData.audioItems;
        }
        return audioData.copy(playBehavior, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PlayBehavior getPlayBehavior() {
        return this.playBehavior;
    }

    @NotNull
    public final List<AudioItem> component2() {
        return this.audioItems;
    }

    @NotNull
    public final AudioData copy(@NotNull PlayBehavior playBehavior, @NotNull List<AudioItem> audioItems) {
        return new AudioData(playBehavior, audioItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioData)) {
            return false;
        }
        AudioData audioData = (AudioData) other;
        return this.playBehavior == audioData.playBehavior && Intrinsics.areEqual(this.audioItems, audioData.audioItems);
    }

    @NotNull
    public final List<AudioItem> getAudioItems() {
        return this.audioItems;
    }

    @NotNull
    public final PlayBehavior getPlayBehavior() {
        return this.playBehavior;
    }

    public int hashCode() {
        return (this.playBehavior.hashCode() * 31) + this.audioItems.hashCode();
    }

    @NotNull
    public String toString() {
        return "AudioData(playBehavior=" + this.playBehavior + ", audioItems=" + this.audioItems + ')';
    }
}
