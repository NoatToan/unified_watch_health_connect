package androidx.media3.transformer;

import android.content.Context;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.util.Assertions;
import androidx.media3.effect.Presentation;
import androidx.media3.effect.SingleInputVideoGraph;
import androidx.media3.effect.VideoCompositorSettings;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes21.dex */
final class TransformerSingleInputVideoGraph extends SingleInputVideoGraph implements TransformerVideoGraph {
    private VideoFrameProcessingWrapper videoFrameProcessingWrapper;

    public static final class Factory implements TransformerVideoGraph.Factory {
        private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        @Override // androidx.media3.transformer.TransformerVideoGraph.Factory
        public /* bridge */ /* synthetic */ TransformerVideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, VideoCompositorSettings videoCompositorSettings, List list, long j) throws VideoFrameProcessingException {
            return create(context, colorInfo, debugViewProvider, listener, executor, videoCompositorSettings, (List<Effect>) list, j);
        }

        public Factory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
        }

        @Override // androidx.media3.transformer.TransformerVideoGraph.Factory
        public TransformerSingleInputVideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, VideoCompositorSettings videoCompositorSettings, List<Effect> list, long j) {
            Presentation presentation = null;
            for (int i = 0; i < list.size(); i++) {
                Effect effect = list.get(i);
                if (effect instanceof Presentation) {
                    presentation = (Presentation) effect;
                }
            }
            return new TransformerSingleInputVideoGraph(context, this.videoFrameProcessorFactory, colorInfo, listener, debugViewProvider, executor, videoCompositorSettings, true, presentation, j);
        }
    }

    private TransformerSingleInputVideoGraph(Context context, VideoFrameProcessor.Factory factory, ColorInfo colorInfo, VideoGraph.Listener listener, DebugViewProvider debugViewProvider, Executor executor, VideoCompositorSettings videoCompositorSettings, boolean z, Presentation presentation, long j) {
        super(context, factory, colorInfo, listener, debugViewProvider, executor, videoCompositorSettings, z, presentation, j);
    }

    @Override // androidx.media3.transformer.TransformerVideoGraph
    public GraphInput createInput(int i) throws VideoFrameProcessingException {
        Assertions.checkState(this.videoFrameProcessingWrapper == null);
        registerInput(i);
        VideoFrameProcessingWrapper videoFrameProcessingWrapper = new VideoFrameProcessingWrapper(getProcessor(i), getPresentation(), getInitialTimestampOffsetUs());
        this.videoFrameProcessingWrapper = videoFrameProcessingWrapper;
        return videoFrameProcessingWrapper;
    }
}
