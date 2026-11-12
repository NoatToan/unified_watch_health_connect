package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f53016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaCodecAdapter f53017c;

    public /* synthetic */ a(MediaCodecAdapter mediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i14) {
        this.f53015a = i14;
        this.f53017c = mediaCodecAdapter;
        this.f53016b = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j8, long j14) {
        switch (this.f53015a) {
            case 0:
                ((AsynchronousMediaCodecAdapter) this.f53017c).lambda$setOnFrameRenderedListener$0(this.f53016b, mediaCodec, j8, j14);
                break;
            default:
                ((SynchronousMediaCodecAdapter) this.f53017c).lambda$setOnFrameRenderedListener$0(this.f53016b, mediaCodec, j8, j14);
                break;
        }
    }
}
