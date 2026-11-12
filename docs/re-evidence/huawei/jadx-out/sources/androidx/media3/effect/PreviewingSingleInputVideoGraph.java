package androidx.media3.effect;

import android.content.Context;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class PreviewingSingleInputVideoGraph extends SingleInputVideoGraph implements PreviewingVideoGraph {

    public static final class Factory implements PreviewingVideoGraph.Factory {
        private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public Factory() {
            this(new DefaultVideoFrameProcessor.Factory.Builder().build());
        }

        public Factory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
        }

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        public PreviewingVideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, List<Effect> list, long j) {
            Presentation presentation = null;
            for (int i = 0; i < list.size(); i++) {
                Effect effect = list.get(i);
                if (effect instanceof Presentation) {
                    presentation = (Presentation) effect;
                }
            }
            return new PreviewingSingleInputVideoGraph(context, this.videoFrameProcessorFactory, colorInfo, debugViewProvider, listener, executor, presentation, j);
        }
    }

    private PreviewingSingleInputVideoGraph(Context context, VideoFrameProcessor.Factory factory, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, Presentation presentation, long j) {
        super(context, factory, colorInfo, listener, debugViewProvider, executor, VideoCompositorSettings.DEFAULT, false, presentation, j);
    }

    @Override // androidx.media3.common.PreviewingVideoGraph
    public void renderOutputFrame(long j) {
        getProcessor(getInputIndex()).renderOutputFrame(j);
    }
}
