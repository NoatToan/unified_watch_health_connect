package androidx.media3.exoplayer.video;

import android.os.Handler;
import androidx.media3.common.k0;
import androidx.media3.common.q;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.h;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f9869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f9870b;

        public a(Handler handler, f fVar) {
            if (fVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f9869a = handler;
            this.f9870b = fVar;
        }

        public final void a(k0 k0Var) {
            Handler handler = this.f9869a;
            if (handler != null) {
                handler.post(new vg1.d(28, this, k0Var));
            }
        }
    }

    default void A(g gVar) {
    }

    default void k(k0 k0Var) {
    }

    default void onDroppedFrames(int i14, long j8) {
    }

    default void onRenderedFirstFrame(Object obj, long j8) {
    }

    default void onVideoCodecError(Exception exc) {
    }

    default void onVideoDecoderInitialized(String str, long j8, long j14) {
    }

    default void onVideoDecoderReleased(String str) {
    }

    default void onVideoFrameProcessingOffset(long j8, int i14) {
    }

    default void p(g gVar) {
    }

    default void z(q qVar, h hVar) {
    }
}
