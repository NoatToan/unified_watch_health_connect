package com.huami.ai.entity.audioplay;

import com.huami.sleepassistant.apilib.utils.WebConst;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/ai/entity/audioplay/AudioItem;", "", "", "component1", "component2", "Ljava/io/InputStream;", "component3", WebConst.QueryParam.AUDIO_ID, "audioUrl", "audioInputStream", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAudioId", "()Ljava/lang/String;", "b", "getAudioUrl", "c", "Ljava/io/InputStream;", "getAudioInputStream", "()Ljava/io/InputStream;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AudioItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String audioId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String audioUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final InputStream audioInputStream;

    public AudioItem(@NotNull String str, @NotNull String str2, @Nullable InputStream inputStream) {
        this.audioId = str;
        this.audioUrl = str2;
        this.audioInputStream = inputStream;
    }

    public static /* synthetic */ AudioItem copy$default(AudioItem audioItem, String str, String str2, InputStream inputStream, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioItem.audioId;
        }
        if ((i & 2) != 0) {
            str2 = audioItem.audioUrl;
        }
        if ((i & 4) != 0) {
            inputStream = audioItem.audioInputStream;
        }
        return audioItem.copy(str, str2, inputStream);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAudioId() {
        return this.audioId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final InputStream getAudioInputStream() {
        return this.audioInputStream;
    }

    @NotNull
    public final AudioItem copy(@NotNull String audioId, @NotNull String audioUrl, @Nullable InputStream audioInputStream) {
        return new AudioItem(audioId, audioUrl, audioInputStream);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioItem)) {
            return false;
        }
        AudioItem audioItem = (AudioItem) other;
        return Intrinsics.areEqual(this.audioId, audioItem.audioId) && Intrinsics.areEqual(this.audioUrl, audioItem.audioUrl) && Intrinsics.areEqual(this.audioInputStream, audioItem.audioInputStream);
    }

    @NotNull
    public final String getAudioId() {
        return this.audioId;
    }

    @Nullable
    public final InputStream getAudioInputStream() {
        return this.audioInputStream;
    }

    @NotNull
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public int hashCode() {
        int iHashCode = ((this.audioId.hashCode() * 31) + this.audioUrl.hashCode()) * 31;
        InputStream inputStream = this.audioInputStream;
        return iHashCode + (inputStream == null ? 0 : inputStream.hashCode());
    }

    @NotNull
    public String toString() {
        return "AudioItem(audioId=" + this.audioId + ", audioUrl=" + this.audioUrl + ", audioInputStream=" + this.audioInputStream + ')';
    }

    public /* synthetic */ AudioItem(String str, String str2, InputStream inputStream, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : inputStream);
    }
}
