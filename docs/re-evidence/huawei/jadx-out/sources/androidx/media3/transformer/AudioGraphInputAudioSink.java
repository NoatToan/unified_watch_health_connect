package androidx.media3.transformer;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.audio.AudioSink;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
final class AudioGraphInputAudioSink implements AudioSink {
    private final Controller controller;
    private EditedMediaItemInfo currentEditedMediaItemInfo;
    private Format currentInputFormat;
    private boolean inputStreamEnded;
    private long offsetToCompositionTimeUs;
    private AudioGraphInput outputGraphInput;
    private boolean signalledEndOfStream;

    public interface Controller {
        AudioGraphInput getAudioGraphInput(EditedMediaItem editedMediaItem, Format format) throws ExportException;

        long getCurrentPositionUs();

        boolean isEnded();

        default void onPause() {
        }

        default void onPlay() {
        }

        default void onReset() {
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioAttributes getAudioAttributes() {
        return null;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f) {
    }

    public AudioGraphInputAudioSink(Controller controller) {
        this.controller = controller;
    }

    public void onMediaItemChanged(EditedMediaItem editedMediaItem, long j, boolean z) {
        this.currentEditedMediaItemInfo = new EditedMediaItemInfo(editedMediaItem, z);
        this.offsetToCompositionTimeUs = j;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(Format format, int i, int[] iArr) throws AudioSink.ConfigurationException {
        Assertions.checkArgument(supportsFormat(format));
        EditedMediaItem editedMediaItem = ((EditedMediaItemInfo) Assertions.checkStateNotNull(this.currentEditedMediaItemInfo)).editedMediaItem;
        Assertions.checkArgument(iArr == null);
        this.currentInputFormat = format;
        if (this.outputGraphInput == null) {
            try {
                this.outputGraphInput = this.controller.getAudioGraphInput(editedMediaItem, format);
            } catch (ExportException e) {
                throw new AudioSink.ConfigurationException(e, this.currentInputFormat);
            }
        }
        this.outputGraphInput.onMediaItemChanged(editedMediaItem, C.TIME_UNSET, this.currentInputFormat, false);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        if (this.currentInputFormat == null) {
            return this.inputStreamEnded;
        }
        if (this.inputStreamEnded) {
            return !((EditedMediaItemInfo) Assertions.checkStateNotNull(this.currentEditedMediaItemInfo)).isLastInSequence || this.controller.isEnded();
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) {
        Assertions.checkState(!this.inputStreamEnded);
        return handleBufferInternal(byteBuffer, j, 0);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() {
        this.inputStreamEnded = true;
        if (this.currentInputFormat == null || this.signalledEndOfStream || !((EditedMediaItemInfo) Assertions.checkStateNotNull(this.currentEditedMediaItemInfo)).isLastInSequence) {
            return;
        }
        this.signalledEndOfStream = handleBufferInternal(AudioProcessor.EMPTY_BUFFER, Long.MIN_VALUE, 4);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(Format format) {
        return (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_RAW) && format.pcmEncoding == 2) ? 2 : 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(Format format) {
        return getFormatSupport(format) == 2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        long currentPositionUs = this.controller.getCurrentPositionUs();
        return currentPositionUs != Long.MIN_VALUE ? currentPositionUs - this.offsetToCompositionTimeUs : currentPositionUs;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.controller.onPlay();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.controller.onPause();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        this.inputStreamEnded = false;
        this.signalledEndOfStream = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        this.currentInputFormat = null;
        this.currentEditedMediaItemInfo = null;
        this.controller.onReset();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return PlaybackParameters.DEFAULT;
    }

    private boolean handleBufferInternal(ByteBuffer byteBuffer, long j, int i) {
        Assertions.checkStateNotNull(this.currentInputFormat);
        Assertions.checkState(!this.signalledEndOfStream);
        AudioGraphInput audioGraphInput = (AudioGraphInput) Assertions.checkNotNull(this.outputGraphInput);
        DecoderInputBuffer inputBuffer = audioGraphInput.getInputBuffer();
        if (inputBuffer == null) {
            return false;
        }
        inputBuffer.ensureSpaceForWrite(byteBuffer.remaining());
        ((ByteBuffer) Assertions.checkNotNull(inputBuffer.data)).put(byteBuffer).flip();
        inputBuffer.timeUs = j != Long.MIN_VALUE ? this.offsetToCompositionTimeUs + j : Long.MIN_VALUE;
        inputBuffer.setFlags(i);
        return audioGraphInput.queueInputBuffer();
    }

    static final class EditedMediaItemInfo {
        public final EditedMediaItem editedMediaItem;
        public final boolean isLastInSequence;

        public EditedMediaItemInfo(EditedMediaItem editedMediaItem, boolean z) {
            this.editedMediaItem = editedMediaItem;
            this.isLastInSequence = z;
        }
    }
}
