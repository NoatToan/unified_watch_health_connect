package com.google.android.exoplayer2.mediacodec;

import android.os.HandlerThread;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Striped;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53019b;

    public /* synthetic */ b(int i14, int i15) {
        this.f53018a = i15;
        this.f53019b = i14;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f53018a) {
            case 0:
                return AsynchronousMediaCodecAdapter.Factory.lambda$new$0(this.f53019b);
            case 1:
                return AsynchronousMediaCodecAdapter.Factory.lambda$new$1(this.f53019b);
            case 2:
                return Striped.lambda$semaphore$1(this.f53019b);
            case 3:
                return Striped.lambda$lazyWeakSemaphore$2(this.f53019b);
            case 4:
                return new HandlerThread(androidx.media3.exoplayer.mediacodec.a.h(this.f53019b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(androidx.media3.exoplayer.mediacodec.a.h(this.f53019b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
