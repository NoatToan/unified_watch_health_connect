package androidx.media3.transformer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.CompositingVideoSinkProvider;
import com.huawei.openalliance.ad.constant.VastAttribute;

/* JADX INFO: loaded from: classes21.dex */
final class CompositionPlayerInternal implements Handler.Callback {
    private static final int MSG_CLEAR_OUTPUT_SURFACE = 2;
    private static final int MSG_END_SEEK = 4;
    private static final int MSG_RELEASE = 5;
    private static final int MSG_SET_OUTPUT_SURFACE_INFO = 1;
    private static final int MSG_START_SEEK = 3;
    private static final String TAG = "CompPlayerInternal";
    private final Clock clock;
    private final CompositingVideoSinkProvider compositingVideoSinkProvider;
    private final HandlerWrapper handler;
    private final Listener listener;
    private final HandlerWrapper listenerHandler;
    private final PreviewAudioPipeline previewAudioPipeline;
    private boolean released;

    public interface Listener {
        void onError(String str, Exception exc, int i);
    }

    public CompositionPlayerInternal(Looper looper, Clock clock, PreviewAudioPipeline previewAudioPipeline, CompositingVideoSinkProvider compositingVideoSinkProvider, Listener listener, HandlerWrapper handlerWrapper) {
        this.clock = clock;
        this.handler = clock.createHandler(looper, this);
        this.previewAudioPipeline = previewAudioPipeline;
        this.compositingVideoSinkProvider = compositingVideoSinkProvider;
        this.listener = listener;
        this.listenerHandler = handlerWrapper;
    }

    public void setOutputSurfaceInfo(Surface surface, Size size) {
        this.handler.obtainMessage(1, new OutputSurfaceInfo(surface, size)).sendToTarget();
    }

    public void clearOutputSurface() {
        this.handler.obtainMessage(2).sendToTarget();
    }

    public void startSeek(long j) {
        this.handler.obtainMessage(3, Long.valueOf(j)).sendToTarget();
    }

    public void endSeek() {
        this.handler.obtainMessage(4).sendToTarget();
    }

    public void release() {
        Assertions.checkState(!this.released);
        this.released = true;
        ConditionVariable conditionVariable = new ConditionVariable();
        this.handler.obtainMessage(5, conditionVariable).sendToTarget();
        this.clock.onThreadBlocked();
        try {
            conditionVariable.block();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            int i = message.what;
            if (i == 1) {
                setOutputSurfaceInfoOnInternalThread((OutputSurfaceInfo) message.obj);
            } else if (i == 2) {
                clearOutputSurfaceInternal();
            } else if (i == 3) {
                this.previewAudioPipeline.startSeek(Util.msToUs(((Long) message.obj).longValue()));
            } else if (i == 4) {
                this.previewAudioPipeline.endSeek();
            } else if (i == 5) {
                releaseInternal((ConditionVariable) message.obj);
            } else {
                maybeRaiseError("Unknown message", new IllegalStateException(String.valueOf(message.what)), 1000);
            }
        } catch (RuntimeException e) {
            maybeRaiseError("Unknown error", e, 1000);
        }
        return true;
    }

    private void releaseInternal(ConditionVariable conditionVariable) {
        try {
            this.previewAudioPipeline.release();
            this.compositingVideoSinkProvider.clearOutputSurfaceInfo();
            this.compositingVideoSinkProvider.release();
        } catch (RuntimeException e) {
            Log.e(TAG, "error while releasing the player", e);
        } finally {
            conditionVariable.open();
        }
    }

    private void clearOutputSurfaceInternal() {
        try {
            this.compositingVideoSinkProvider.clearOutputSurfaceInfo();
        } catch (RuntimeException e) {
            maybeRaiseError("error clearing video output", e, 7001);
        }
    }

    private void setOutputSurfaceInfoOnInternalThread(OutputSurfaceInfo outputSurfaceInfo) {
        try {
            this.compositingVideoSinkProvider.setOutputSurfaceInfo(outputSurfaceInfo.surface, outputSurfaceInfo.size);
        } catch (RuntimeException e) {
            maybeRaiseError("error setting surface view", e, 7001);
        }
    }

    private void maybeRaiseError(final String str, final Exception exc, final int i) {
        try {
            this.listenerHandler.post(new Runnable() { // from class: androidx.media3.transformer.CompositionPlayerInternal$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m672xfd13a429(str, exc, i);
                }
            });
        } catch (RuntimeException e) {
            Log.e(TAG, VastAttribute.ERROR, e);
        }
    }

    /* JADX INFO: renamed from: lambda$maybeRaiseError$0$androidx-media3-transformer-CompositionPlayerInternal, reason: not valid java name */
    /* synthetic */ void m672xfd13a429(String str, Exception exc, int i) {
        if (this.released) {
            return;
        }
        this.listener.onError(str, exc, i);
    }

    static final class OutputSurfaceInfo {
        public final Size size;
        public final Surface surface;

        public OutputSurfaceInfo(Surface surface, Size size) {
            this.surface = surface;
            this.size = size;
        }
    }
}
