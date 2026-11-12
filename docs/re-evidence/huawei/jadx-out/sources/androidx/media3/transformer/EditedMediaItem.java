package androidx.media3.transformer;

import androidx.media3.common.C;
import androidx.media3.common.Effect;
import androidx.media3.common.MediaItem;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import com.google.common.collect.UnmodifiableIterator;

/* JADX INFO: loaded from: classes21.dex */
public final class EditedMediaItem {
    public final long durationUs;
    public final Effects effects;
    public final boolean flattenForSlowMotion;
    public final int frameRate;
    public final MediaItem mediaItem;
    private long presentationDurationUs;
    public final boolean removeAudio;
    public final boolean removeVideo;

    public static final class Builder {
        private long durationUs;
        private Effects effects;
        private boolean flattenForSlowMotion;
        private int frameRate;
        private MediaItem mediaItem;
        private boolean removeAudio;
        private boolean removeVideo;

        public Builder(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            this.durationUs = C.TIME_UNSET;
            this.frameRate = C.RATE_UNSET_INT;
            this.effects = Effects.EMPTY;
        }

        private Builder(EditedMediaItem editedMediaItem) {
            this.mediaItem = editedMediaItem.mediaItem;
            this.removeAudio = editedMediaItem.removeAudio;
            this.removeVideo = editedMediaItem.removeVideo;
            this.flattenForSlowMotion = editedMediaItem.flattenForSlowMotion;
            this.durationUs = editedMediaItem.durationUs;
            this.frameRate = editedMediaItem.frameRate;
            this.effects = editedMediaItem.effects;
        }

        public Builder setRemoveAudio(boolean z) {
            this.removeAudio = z;
            return this;
        }

        public Builder setRemoveVideo(boolean z) {
            this.removeVideo = z;
            return this;
        }

        public Builder setFlattenForSlowMotion(boolean z) {
            Assertions.checkArgument(this.mediaItem.clippingConfiguration.equals(MediaItem.ClippingConfiguration.UNSET) || !z, "Slow motion flattening is not supported when clipping is requested");
            this.flattenForSlowMotion = z;
            return this;
        }

        public Builder setDurationUs(long j) {
            Assertions.checkArgument(j > 0);
            this.durationUs = j;
            return this;
        }

        public Builder setFrameRate(int i) {
            Assertions.checkArgument(i > 0);
            this.frameRate = i;
            return this;
        }

        public Builder setEffects(Effects effects) {
            this.effects = effects;
            return this;
        }

        public EditedMediaItem build() {
            return new EditedMediaItem(this.mediaItem, this.removeAudio, this.removeVideo, this.flattenForSlowMotion, this.durationUs, this.frameRate, this.effects);
        }

        Builder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }
    }

    private EditedMediaItem(MediaItem mediaItem, boolean z, boolean z2, boolean z3, long j, int i, Effects effects) {
        Assertions.checkState((z && z2) ? false : true, "Audio and video cannot both be removed");
        this.mediaItem = mediaItem;
        this.removeAudio = z;
        this.removeVideo = z2;
        this.flattenForSlowMotion = z3;
        this.durationUs = j;
        this.frameRate = i;
        this.effects = effects;
        this.presentationDurationUs = C.TIME_UNSET;
    }

    Builder buildUpon() {
        return new Builder();
    }

    long getPresentationDurationUs() {
        if (this.presentationDurationUs == C.TIME_UNSET) {
            if (this.mediaItem.clippingConfiguration.equals(MediaItem.ClippingConfiguration.UNSET) || this.durationUs == C.TIME_UNSET) {
                this.presentationDurationUs = this.durationUs;
            } else {
                MediaItem.ClippingConfiguration clippingConfiguration = this.mediaItem.clippingConfiguration;
                Assertions.checkArgument(!clippingConfiguration.relativeToDefaultPosition);
                if (clippingConfiguration.endPositionUs == Long.MIN_VALUE) {
                    this.presentationDurationUs = this.durationUs - clippingConfiguration.startPositionUs;
                } else {
                    Assertions.checkArgument(clippingConfiguration.endPositionUs <= this.durationUs);
                    this.presentationDurationUs = clippingConfiguration.endPositionUs - clippingConfiguration.startPositionUs;
                }
            }
        }
        return this.presentationDurationUs;
    }

    long getDurationAfterEffectsApplied(long j) {
        long durationAfterProcessorApplied;
        boolean z = this.removeAudio;
        long j2 = C.TIME_UNSET;
        if (z) {
            durationAfterProcessorApplied = -9223372036854775807L;
        } else {
            UnmodifiableIterator<AudioProcessor> it = this.effects.audioProcessors.iterator();
            durationAfterProcessorApplied = j;
            while (it.hasNext()) {
                durationAfterProcessorApplied = it.next().getDurationAfterProcessorApplied(durationAfterProcessorApplied);
            }
        }
        if (!this.removeVideo) {
            UnmodifiableIterator<Effect> it2 = this.effects.videoEffects.iterator();
            while (it2.hasNext()) {
                j = it2.next().getDurationAfterEffectApplied(j);
            }
            j2 = j;
        }
        return Math.max(durationAfterProcessorApplied, j2);
    }
}
