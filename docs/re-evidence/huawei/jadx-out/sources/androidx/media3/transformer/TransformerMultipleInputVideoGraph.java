package androidx.media3.transformer;

import android.content.Context;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoGraph;
import androidx.media3.effect.MultipleInputVideoGraph;
import androidx.media3.effect.VideoCompositorSettings;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes21.dex */
final class TransformerMultipleInputVideoGraph extends MultipleInputVideoGraph implements TransformerVideoGraph {

    public static final class Factory implements TransformerVideoGraph.Factory {
        @Override // androidx.media3.transformer.TransformerVideoGraph.Factory
        public /* bridge */ /* synthetic */ TransformerVideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, VideoCompositorSettings videoCompositorSettings, List list, long j) throws VideoFrameProcessingException {
            return create(context, colorInfo, debugViewProvider, listener, executor, videoCompositorSettings, (List<Effect>) list, j);
        }

        @Override // androidx.media3.transformer.TransformerVideoGraph.Factory
        public TransformerMultipleInputVideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, VideoCompositorSettings videoCompositorSettings, List<Effect> list, long j) {
            return new TransformerMultipleInputVideoGraph(context, colorInfo, debugViewProvider, listener, executor, videoCompositorSettings, list, j);
        }
    }

    private TransformerMultipleInputVideoGraph(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, VideoCompositorSettings videoCompositorSettings, List<Effect> list, long j) {
        super(context, colorInfo, debugViewProvider, listener, executor, videoCompositorSettings, list, j);
    }

    @Override // androidx.media3.transformer.TransformerVideoGraph
    public GraphInput createInput(int i) throws VideoFrameProcessingException {
        registerInput(i);
        return new VideoFrameProcessingWrapper(getProcessor(i), null, getInitialTimestampOffsetUs());
    }
}
