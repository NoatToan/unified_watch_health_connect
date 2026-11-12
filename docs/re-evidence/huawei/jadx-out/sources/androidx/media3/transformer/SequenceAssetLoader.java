package androidx.media3.transformer;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.OnInputFrameProcessedListener;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.effect.DebugTraceUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
final class SequenceAssetLoader implements AssetLoader, AssetLoader.Listener {
    private static final Format FORCE_AUDIO_TRACK_FORMAT = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_AAC).setSampleRate(44100).setChannelCount(2).build();
    private final AssetLoader.Factory assetLoaderFactory;
    private final AssetLoader.CompositionSettings compositionSettings;
    private volatile long currentAssetDurationAfterEffectsAppliedUs;
    private volatile long currentAssetDurationUs;
    private AssetLoader currentAssetLoader;
    private int currentMediaItemIndex;
    private boolean decodeAudio;
    private boolean decodeVideo;
    private final List<EditedMediaItem> editedMediaItems;
    private final boolean forceAudioTrack;
    private final HandlerWrapper handler;
    private boolean isCurrentAssetFirstAsset;
    private final boolean isLooping;
    private volatile boolean isMaxSequenceDurationUsFinal;
    private boolean isTrackCountReported;
    private volatile long maxSequenceDurationUs;
    private final Map<Integer, OnMediaItemChangedListener> mediaItemChangedListenersByTrackType;
    private final AtomicInteger nonEndedTrackCount;
    private final ImmutableList.c<ExportResult.ProcessedInput> processedInputsBuilder;
    private int processedInputsSize;
    private volatile boolean released;
    private final AtomicInteger reportedTrackCount;
    private final Map<Integer, SampleConsumerWrapper> sampleConsumersByTrackType;
    private final AssetLoader.Listener sequenceAssetLoaderListener;
    private int sequenceLoopCount;

    static /* synthetic */ int access$1308(SequenceAssetLoader sequenceAssetLoader) {
        int i = sequenceAssetLoader.sequenceLoopCount;
        sequenceAssetLoader.sequenceLoopCount = i + 1;
        return i;
    }

    static /* synthetic */ int access$408(SequenceAssetLoader sequenceAssetLoader) {
        int i = sequenceAssetLoader.currentMediaItemIndex;
        sequenceAssetLoader.currentMediaItemIndex = i + 1;
        return i;
    }

    public SequenceAssetLoader(EditedMediaItemSequence editedMediaItemSequence, boolean z, AssetLoader.Factory factory, AssetLoader.CompositionSettings compositionSettings, AssetLoader.Listener listener, Clock clock, Looper looper) {
        ImmutableList<EditedMediaItem> immutableList = editedMediaItemSequence.editedMediaItems;
        this.editedMediaItems = immutableList;
        this.isLooping = editedMediaItemSequence.isLooping;
        this.forceAudioTrack = z;
        this.assetLoaderFactory = factory;
        this.compositionSettings = compositionSettings;
        this.sequenceAssetLoaderListener = listener;
        this.handler = clock.createHandler(looper, null);
        this.sampleConsumersByTrackType = new HashMap();
        this.mediaItemChangedListenersByTrackType = new HashMap();
        this.processedInputsBuilder = new ImmutableList.c<>();
        this.reportedTrackCount = new AtomicInteger();
        this.nonEndedTrackCount = new AtomicInteger();
        this.isCurrentAssetFirstAsset = true;
        this.currentAssetLoader = factory.createAssetLoader(immutableList.get(0), looper, this, compositionSettings);
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void start() {
        this.currentAssetLoader.start();
        if (this.editedMediaItems.size() > 1 || this.isLooping) {
            this.sequenceAssetLoaderListener.onDurationUs(C.TIME_UNSET);
        }
    }

    @Override // androidx.media3.transformer.AssetLoader
    public int getProgress(ProgressHolder progressHolder) {
        if (this.isLooping) {
            return 3;
        }
        int progress = this.currentAssetLoader.getProgress(progressHolder);
        int size = this.editedMediaItems.size();
        if (size == 1 || progress == 0) {
            return progress;
        }
        int i = (this.currentMediaItemIndex * 100) / size;
        if (progress == 2) {
            i += progressHolder.progress / size;
        }
        progressHolder.progress = i;
        return 2;
    }

    @Override // androidx.media3.transformer.AssetLoader
    public ImmutableMap<Integer, String> getDecoderNames() {
        return this.currentAssetLoader.getDecoderNames();
    }

    public ImmutableList<ExportResult.ProcessedInput> getProcessedInputs() {
        addCurrentProcessedInput();
        return this.processedInputsBuilder.build();
    }

    @Override // androidx.media3.transformer.AssetLoader
    public void release() {
        this.currentAssetLoader.release();
        this.released = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentProcessedInput() {
        int i = this.sequenceLoopCount;
        int size = this.editedMediaItems.size();
        int i2 = this.currentMediaItemIndex;
        if ((i * size) + i2 >= this.processedInputsSize) {
            MediaItem mediaItem = this.editedMediaItems.get(i2).mediaItem;
            ImmutableMap<Integer, String> decoderNames = this.currentAssetLoader.getDecoderNames();
            this.processedInputsBuilder.add(new ExportResult.ProcessedInput(mediaItem, decoderNames.get(1), decoderNames.get(2)));
            this.processedInputsSize++;
        }
    }

    public void addOnMediaItemChangedListener(OnMediaItemChangedListener onMediaItemChangedListener, int i) {
        Assertions.checkArgument(i == 1 || i == 2);
        Assertions.checkArgument(this.mediaItemChangedListenersByTrackType.get(Integer.valueOf(i)) == null);
        this.mediaItemChangedListenersByTrackType.put(Integer.valueOf(i), onMediaItemChangedListener);
    }

    @Override // androidx.media3.transformer.AssetLoader.Listener
    public boolean onTrackAdded(Format format, int i) {
        int i2 = 0;
        boolean z = TransformerUtil.getProcessedTrackType(format.sampleMimeType) == 1;
        DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_ASSET_LOADER, DebugTraceUtil.EVENT_INPUT_FORMAT, C.TIME_UNSET, "%s:%s", z ? "audio" : "video", format);
        if (!this.isCurrentAssetFirstAsset) {
            return z ? this.decodeAudio : this.decodeVideo;
        }
        if (this.forceAudioTrack && this.reportedTrackCount.get() == 1 && !z) {
            i2 = 1;
        }
        if (!this.isTrackCountReported) {
            this.sequenceAssetLoaderListener.onTrackCount(this.reportedTrackCount.get() + i2);
            this.isTrackCountReported = true;
        }
        boolean zOnTrackAdded = this.sequenceAssetLoaderListener.onTrackAdded(format, i);
        if (z) {
            this.decodeAudio = zOnTrackAdded;
        } else {
            this.decodeVideo = zOnTrackAdded;
        }
        if (i2 != 0) {
            this.sequenceAssetLoaderListener.onTrackAdded(FORCE_AUDIO_TRACK_FORMAT, 2);
            this.decodeAudio = true;
        }
        return zOnTrackAdded;
    }

    @Override // androidx.media3.transformer.AssetLoader.Listener
    public SampleConsumerWrapper onOutputFormat(Format format) throws ExportException {
        SampleConsumerWrapper sampleConsumerWrapper;
        int processedTrackType = TransformerUtil.getProcessedTrackType(format.sampleMimeType);
        DebugTraceUtil.logEvent(DebugTraceUtil.COMPONENT_ASSET_LOADER, DebugTraceUtil.EVENT_OUTPUT_FORMAT, C.TIME_UNSET, "%s:%s", Util.getTrackTypeString(processedTrackType), format);
        if (this.isCurrentAssetFirstAsset) {
            SampleConsumer sampleConsumerOnOutputFormat = this.sequenceAssetLoaderListener.onOutputFormat(format);
            if (sampleConsumerOnOutputFormat == null) {
                return null;
            }
            sampleConsumerWrapper = new SampleConsumerWrapper(sampleConsumerOnOutputFormat, processedTrackType);
            this.sampleConsumersByTrackType.put(Integer.valueOf(processedTrackType), sampleConsumerWrapper);
            if (this.forceAudioTrack && this.reportedTrackCount.get() == 1 && processedTrackType == 2) {
                this.sampleConsumersByTrackType.put(1, new SampleConsumerWrapper((SampleConsumer) Assertions.checkStateNotNull(this.sequenceAssetLoaderListener.onOutputFormat(FORCE_AUDIO_TRACK_FORMAT.buildUpon().setSampleMimeType(MimeTypes.AUDIO_RAW).setPcmEncoding(2).build())), processedTrackType));
            }
        } else {
            Assertions.checkState(!(this.reportedTrackCount.get() == 1 && processedTrackType == 1 && this.sampleConsumersByTrackType.size() == 2), "Inputs with no video track are not supported when the output contains a video track");
            sampleConsumerWrapper = (SampleConsumerWrapper) Assertions.checkStateNotNull(this.sampleConsumersByTrackType.get(Integer.valueOf(processedTrackType)), Util.formatInvariant("The preceding MediaItem does not contain any track of type %d. If the Composition contains a sequence that starts with items without audio tracks (like images), followed by items with audio tracks, Composition.Builder.experimentalSetForceAudioTrack() needs to be set to true.", Integer.valueOf(processedTrackType)));
        }
        onMediaItemChanged(processedTrackType, format);
        if (this.reportedTrackCount.get() == 1 && this.sampleConsumersByTrackType.size() == 2) {
            Iterator<Map.Entry<Integer, SampleConsumerWrapper>> it = this.sampleConsumersByTrackType.entrySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().getKey().intValue();
                if (processedTrackType != iIntValue) {
                    onMediaItemChanged(iIntValue, null);
                }
            }
        }
        return sampleConsumerWrapper;
    }

    private void onMediaItemChanged(int i, Format format) {
        OnMediaItemChangedListener onMediaItemChangedListener = this.mediaItemChangedListenersByTrackType.get(Integer.valueOf(i));
        if (onMediaItemChangedListener == null) {
            return;
        }
        onMediaItemChangedListener.onMediaItemChanged(this.editedMediaItems.get(this.currentMediaItemIndex), (i == 1 && this.isLooping && this.decodeAudio) ? C.TIME_UNSET : this.currentAssetDurationUs, format, this.currentMediaItemIndex == this.editedMediaItems.size() - 1);
    }

    public void setMaxSequenceDurationUs(long j, boolean z) {
        this.maxSequenceDurationUs = j;
        this.isMaxSequenceDurationUsFinal = z;
    }

    @Override // androidx.media3.transformer.AssetLoader.Listener
    public void onDurationUs(long j) {
        Assertions.checkArgument(j != C.TIME_UNSET || this.currentMediaItemIndex == this.editedMediaItems.size() - 1, "Could not retrieve required duration for EditedMediaItem " + this.currentMediaItemIndex);
        this.currentAssetDurationAfterEffectsAppliedUs = this.editedMediaItems.get(this.currentMediaItemIndex).getDurationAfterEffectsApplied(j);
        this.currentAssetDurationUs = j;
        if (this.editedMediaItems.size() != 1 || this.isLooping) {
            return;
        }
        this.sequenceAssetLoaderListener.onDurationUs(this.currentAssetDurationAfterEffectsAppliedUs);
    }

    @Override // androidx.media3.transformer.AssetLoader.Listener
    public void onTrackCount(int i) {
        this.reportedTrackCount.set(i);
        this.nonEndedTrackCount.set(i);
    }

    @Override // androidx.media3.transformer.AssetLoader.Listener
    public void onError(ExportException exportException) {
        this.sequenceAssetLoaderListener.onError(exportException);
    }

    final class SampleConsumerWrapper implements SampleConsumer {
        private boolean audioLoopingEnded;
        private final SampleConsumer sampleConsumer;
        private long totalDurationUs;
        private final int trackType;
        private boolean videoLoopingEnded;

        public SampleConsumerWrapper(SampleConsumer sampleConsumer, int i) {
            this.sampleConsumer = sampleConsumer;
            this.trackType = i;
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public DecoderInputBuffer getInputBuffer() {
            return this.sampleConsumer.getInputBuffer();
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public boolean queueInputBuffer() {
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) Assertions.checkStateNotNull(this.sampleConsumer.getInputBuffer());
            long j = this.totalDurationUs;
            long j2 = decoderInputBuffer.timeUs;
            if (SequenceAssetLoader.this.isLooping && (j + j2 >= SequenceAssetLoader.this.maxSequenceDurationUs || this.audioLoopingEnded)) {
                if (SequenceAssetLoader.this.isMaxSequenceDurationUsFinal && !this.audioLoopingEnded) {
                    ((ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data)).limit(0);
                    decoderInputBuffer.setFlags(4);
                    Assertions.checkState(this.sampleConsumer.queueInputBuffer());
                    this.audioLoopingEnded = true;
                    SequenceAssetLoader.this.nonEndedTrackCount.decrementAndGet();
                }
                return false;
            }
            if (decoderInputBuffer.isEndOfStream()) {
                SequenceAssetLoader.this.nonEndedTrackCount.decrementAndGet();
                if (SequenceAssetLoader.this.currentMediaItemIndex < SequenceAssetLoader.this.editedMediaItems.size() - 1 || SequenceAssetLoader.this.isLooping) {
                    if (this.trackType == 1 && !SequenceAssetLoader.this.isLooping && SequenceAssetLoader.this.decodeAudio) {
                        Assertions.checkState(this.sampleConsumer.queueInputBuffer());
                    } else {
                        decoderInputBuffer.clear();
                        decoderInputBuffer.timeUs = 0L;
                    }
                    if (SequenceAssetLoader.this.nonEndedTrackCount.get() == 0) {
                        switchAssetLoader();
                    }
                    return true;
                }
            }
            Assertions.checkState(this.sampleConsumer.queueInputBuffer());
            return true;
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public int queueInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
            if (SequenceAssetLoader.this.isLooping) {
                long j = -9223372036854775807L;
                while (timestampIterator.hasNext()) {
                    long next = timestampIterator.next();
                    if (this.totalDurationUs + next > SequenceAssetLoader.this.maxSequenceDurationUs) {
                        if (!SequenceAssetLoader.this.isMaxSequenceDurationUsFinal) {
                            return 2;
                        }
                        if (j == C.TIME_UNSET) {
                            if (this.videoLoopingEnded) {
                                return 2;
                            }
                            this.videoLoopingEnded = true;
                            signalEndOfVideoInput();
                            return 3;
                        }
                        ClippingIterator clippingIterator = new ClippingIterator(timestampIterator.copyOf(), j);
                        this.videoLoopingEnded = true;
                        timestampIterator = clippingIterator;
                        break;
                    }
                    j = next;
                }
            }
            return this.sampleConsumer.queueInputBitmap(bitmap, timestampIterator.copyOf());
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public void setOnInputFrameProcessedListener(OnInputFrameProcessedListener onInputFrameProcessedListener) {
            this.sampleConsumer.setOnInputFrameProcessedListener(onInputFrameProcessedListener);
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public int queueInputTexture(int i, long j) {
            long j2 = this.totalDurationUs;
            if (SequenceAssetLoader.this.isLooping && j2 + j >= SequenceAssetLoader.this.maxSequenceDurationUs) {
                if (!SequenceAssetLoader.this.isMaxSequenceDurationUsFinal || this.videoLoopingEnded) {
                    return 2;
                }
                this.videoLoopingEnded = true;
                signalEndOfVideoInput();
                return 3;
            }
            return this.sampleConsumer.queueInputTexture(i, j);
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public Surface getInputSurface() {
            return this.sampleConsumer.getInputSurface();
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public int getPendingVideoFrameCount() {
            return this.sampleConsumer.getPendingVideoFrameCount();
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public boolean registerVideoFrame(long j) {
            long j2 = this.totalDurationUs;
            if (SequenceAssetLoader.this.isLooping && j2 + j >= SequenceAssetLoader.this.maxSequenceDurationUs) {
                if (!SequenceAssetLoader.this.isMaxSequenceDurationUsFinal || this.videoLoopingEnded) {
                    return false;
                }
                this.videoLoopingEnded = true;
                signalEndOfVideoInput();
                return false;
            }
            return this.sampleConsumer.registerVideoFrame(j);
        }

        @Override // androidx.media3.transformer.SampleConsumer
        public void signalEndOfVideoInput() {
            SequenceAssetLoader.this.nonEndedTrackCount.decrementAndGet();
            if (!SequenceAssetLoader.this.isLooping ? SequenceAssetLoader.this.currentMediaItemIndex != SequenceAssetLoader.this.editedMediaItems.size() - 1 : !this.videoLoopingEnded) {
                if (SequenceAssetLoader.this.nonEndedTrackCount.get() == 0) {
                    switchAssetLoader();
                    return;
                }
                return;
            }
            this.sampleConsumer.signalEndOfVideoInput();
        }

        private void switchAssetLoader() {
            SequenceAssetLoader.this.handler.post(new Runnable() { // from class: androidx.media3.transformer.SequenceAssetLoader$SampleConsumerWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m679x77936abd();
                }
            });
        }

        /* JADX INFO: renamed from: lambda$switchAssetLoader$0$androidx-media3-transformer-SequenceAssetLoader$SampleConsumerWrapper, reason: not valid java name */
        /* synthetic */ void m679x77936abd() {
            try {
                if (SequenceAssetLoader.this.released) {
                    return;
                }
                SequenceAssetLoader.this.addCurrentProcessedInput();
                this.totalDurationUs += SequenceAssetLoader.this.currentAssetDurationAfterEffectsAppliedUs;
                SequenceAssetLoader.this.currentAssetLoader.release();
                SequenceAssetLoader.this.isCurrentAssetFirstAsset = false;
                SequenceAssetLoader.access$408(SequenceAssetLoader.this);
                if (SequenceAssetLoader.this.currentMediaItemIndex == SequenceAssetLoader.this.editedMediaItems.size()) {
                    SequenceAssetLoader.this.currentMediaItemIndex = 0;
                    SequenceAssetLoader.access$1308(SequenceAssetLoader.this);
                }
                EditedMediaItem editedMediaItem = (EditedMediaItem) SequenceAssetLoader.this.editedMediaItems.get(SequenceAssetLoader.this.currentMediaItemIndex);
                SequenceAssetLoader sequenceAssetLoader = SequenceAssetLoader.this;
                AssetLoader.Factory factory = sequenceAssetLoader.assetLoaderFactory;
                Looper looper = (Looper) Assertions.checkNotNull(Looper.myLooper());
                SequenceAssetLoader sequenceAssetLoader2 = SequenceAssetLoader.this;
                sequenceAssetLoader.currentAssetLoader = factory.createAssetLoader(editedMediaItem, looper, sequenceAssetLoader2, sequenceAssetLoader2.compositionSettings);
                SequenceAssetLoader.this.currentAssetLoader.start();
            } catch (RuntimeException e) {
                SequenceAssetLoader.this.onError(ExportException.createForAssetLoader(e, 1000));
            }
        }
    }

    static final class ClippingIterator implements TimestampIterator {
        private final long clippingValue;
        private boolean hasReachedClippingValue;
        private final TimestampIterator iterator;

        public ClippingIterator(TimestampIterator timestampIterator, long j) {
            this.iterator = timestampIterator;
            this.clippingValue = j;
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public boolean hasNext() {
            return !this.hasReachedClippingValue && this.iterator.hasNext();
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public long next() {
            Assertions.checkState(hasNext());
            long next = this.iterator.next();
            if (this.clippingValue <= next) {
                this.hasReachedClippingValue = true;
            }
            return next;
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public TimestampIterator copyOf() {
            return new ClippingIterator(this.iterator.copyOf(), this.clippingValue);
        }
    }
}
