package yt;

import android.media.MediaPlayer;
import android.os.Handler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyt/k;", "Ljava/lang/Runnable;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f199332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f199333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaPlayer f199334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Handler f199335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f199336e;

    public k(p0 p0Var, int i14, MediaPlayer mediaPlayer, Handler handler, long j8) {
        this.f199332a = p0Var;
        this.f199333b = i14;
        this.f199334c = mediaPlayer;
        this.f199335d = handler;
        this.f199336e = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0 p0Var = this.f199332a;
        int i14 = p0Var.f105807a;
        int i15 = this.f199333b;
        MediaPlayer mediaPlayer = this.f199334c;
        if (i14 >= i15) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
        } else {
            float f14 = 1.0f - (i14 / i15);
            mediaPlayer.setVolume(f14, f14);
            p0Var.f105807a++;
            this.f199335d.postDelayed(this, this.f199336e);
        }
    }
}
