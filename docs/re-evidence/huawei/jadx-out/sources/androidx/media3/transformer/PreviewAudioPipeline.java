package androidx.media3.transformer;

import androidx.media3.common.Format;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioSink;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
final class PreviewAudioPipeline {
    private final AudioGraph audioGraph;
    private int audioGraphInputsCreated;
    private final AudioSink finalAudioSink;
    private int inputAudioSinksCreated;
    private int inputAudioSinksPlaying;
    private AudioProcessor.AudioFormat outputAudioFormat = AudioProcessor.AudioFormat.NOT_SET;
    private long outputFramesWritten;
    private long seekPositionUs;

    static /* synthetic */ int access$008(PreviewAudioPipeline previewAudioPipeline) {
        int i = previewAudioPipeline.inputAudioSinksCreated;
        previewAudioPipeline.inputAudioSinksCreated = i + 1;
        return i;
    }

    static /* synthetic */ int access$208(PreviewAudioPipeline previewAudioPipeline) {
        int i = previewAudioPipeline.audioGraphInputsCreated;
        previewAudioPipeline.audioGraphInputsCreated = i + 1;
        return i;
    }

    static /* synthetic */ int access$408(PreviewAudioPipeline previewAudioPipeline) {
        int i = previewAudioPipeline.inputAudioSinksPlaying;
        previewAudioPipeline.inputAudioSinksPlaying = i + 1;
        return i;
    }

    static /* synthetic */ int access$410(PreviewAudioPipeline previewAudioPipeline) {
        int i = previewAudioPipeline.inputAudioSinksPlaying;
        previewAudioPipeline.inputAudioSinksPlaying = i - 1;
        return i;
    }

    public PreviewAudioPipeline(AudioMixer.Factory factory, ImmutableList<AudioProcessor> immutableList, AudioSink audioSink) {
        this.audioGraph = new AudioGraph(factory, immutableList);
        this.finalAudioSink = audioSink;
    }

    public void release() {
        this.audioGraph.reset();
        this.finalAudioSink.reset();
        this.finalAudioSink.release();
        this.audioGraphInputsCreated = 0;
        this.inputAudioSinksCreated = 0;
        this.inputAudioSinksPlaying = 0;
    }

    public AudioGraphInputAudioSink createInput() {
        return new AudioGraphInputAudioSink(new SinkController());
    }

    public boolean processData() throws ExportException, AudioSink.WriteException, AudioSink.InitializationException, AudioSink.ConfigurationException {
        int i = this.inputAudioSinksCreated;
        if (i == 0 || i != this.audioGraphInputsCreated) {
            return false;
        }
        if (Objects.equals(this.outputAudioFormat, AudioProcessor.AudioFormat.NOT_SET)) {
            AudioProcessor.AudioFormat outputAudioFormat = this.audioGraph.getOutputAudioFormat();
            if (Objects.equals(outputAudioFormat, AudioProcessor.AudioFormat.NOT_SET)) {
                return false;
            }
            this.finalAudioSink.configure(Util.getPcmFormat(outputAudioFormat), 0, null);
            this.outputAudioFormat = outputAudioFormat;
        }
        if (this.audioGraph.isEnded()) {
            if (this.finalAudioSink.isEnded()) {
                return false;
            }
            this.finalAudioSink.playToEndOfStream();
            return false;
        }
        ByteBuffer output = this.audioGraph.getOutput();
        if (!output.hasRemaining()) {
            return false;
        }
        int iRemaining = output.remaining();
        boolean zHandleBuffer = this.finalAudioSink.handleBuffer(output, getBufferPresentationTimeUs(), 1);
        this.outputFramesWritten += (long) ((iRemaining - output.remaining()) / this.outputAudioFormat.bytesPerFrame);
        return zHandleBuffer;
    }

    private long getBufferPresentationTimeUs() {
        return this.seekPositionUs + Util.sampleCountToDurationUs(this.outputFramesWritten, this.outputAudioFormat.sampleRate);
    }

    public void startSeek(long j) {
        this.finalAudioSink.pause();
        this.audioGraph.blockInput();
        this.audioGraph.setPendingStartTimeUs(j);
        this.audioGraph.flush();
        this.finalAudioSink.flush();
        this.outputFramesWritten = 0L;
        this.seekPositionUs = j;
    }

    public void endSeek() {
        this.audioGraph.unblockInput();
    }

    final class SinkController implements AudioGraphInputAudioSink.Controller {
        private boolean playing;

        public SinkController() {
            PreviewAudioPipeline.access$008(PreviewAudioPipeline.this);
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public AudioGraphInput getAudioGraphInput(EditedMediaItem editedMediaItem, Format format) throws ExportException {
            AudioGraphInput audioGraphInputRegisterInput = PreviewAudioPipeline.this.audioGraph.registerInput(editedMediaItem, format);
            PreviewAudioPipeline.access$208(PreviewAudioPipeline.this);
            return audioGraphInputRegisterInput;
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public long getCurrentPositionUs() {
            return PreviewAudioPipeline.this.finalAudioSink.getCurrentPositionUs(false);
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public boolean isEnded() {
            return PreviewAudioPipeline.this.finalAudioSink.isEnded();
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public void onPlay() {
            if (this.playing) {
                return;
            }
            this.playing = true;
            PreviewAudioPipeline.access$408(PreviewAudioPipeline.this);
            if (PreviewAudioPipeline.this.inputAudioSinksCreated == PreviewAudioPipeline.this.inputAudioSinksPlaying) {
                PreviewAudioPipeline.this.finalAudioSink.play();
            }
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public void onPause() {
            if (this.playing) {
                this.playing = false;
                if (PreviewAudioPipeline.this.inputAudioSinksCreated == PreviewAudioPipeline.this.inputAudioSinksPlaying) {
                    PreviewAudioPipeline.this.finalAudioSink.pause();
                }
                PreviewAudioPipeline.access$410(PreviewAudioPipeline.this);
            }
        }

        @Override // androidx.media3.transformer.AudioGraphInputAudioSink.Controller
        public void onReset() {
            onPause();
        }
    }
}
