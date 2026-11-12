package com.google.android.exoplayer2.audio;

import fa.z;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f52961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f52962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f52963e;

    public /* synthetic */ a(Object obj, int i14, long j8, long j14, int i15) {
        this.f52959a = i15;
        this.f52963e = obj;
        this.f52960b = i14;
        this.f52961c = j8;
        this.f52962d = j14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f52959a;
        Object obj = this.f52963e;
        switch (i14) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj).lambda$underrun$4(this.f52960b, this.f52961c, this.f52962d);
                break;
            case 1:
                androidx.media3.exoplayer.audio.b bVar = ((androidx.media3.exoplayer.audio.b.a) obj).f8767b;
                int i15 = z.f70071a;
                bVar.onAudioUnderrun(this.f52960b, this.f52961c, this.f52962d);
                break;
            default:
                ((xa.c.a.C3528a.C3529a) obj).f189669b.onBandwidthSample(this.f52960b, this.f52961c, this.f52962d);
                break;
        }
    }
}
