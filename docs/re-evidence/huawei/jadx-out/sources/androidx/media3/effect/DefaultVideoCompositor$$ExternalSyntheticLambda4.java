package androidx.media3.effect;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class DefaultVideoCompositor$$ExternalSyntheticLambda4 implements VideoFrameProcessingTaskExecutor.Task {
    public final /* synthetic */ DefaultVideoCompositor f$0;

    public /* synthetic */ DefaultVideoCompositor$$ExternalSyntheticLambda4(DefaultVideoCompositor defaultVideoCompositor) {
        this.f$0 = defaultVideoCompositor;
    }

    @Override // androidx.media3.effect.VideoFrameProcessingTaskExecutor.Task
    public final void run() throws VideoFrameProcessingException, GlUtil.GlException {
        this.f$0.maybeComposite();
    }
}
