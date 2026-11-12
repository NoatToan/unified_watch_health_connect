package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0.a f9192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f9193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sa.j f9194d;

    public /* synthetic */ k0(o0.a aVar, Pair pair, sa.j jVar, int i14) {
        this.f9191a = i14;
        this.f9192b = aVar;
        this.f9193c = pair;
        this.f9194d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9191a) {
            case 0:
                ja.a aVar = this.f9192b.f9306b.f9300h;
                Pair pair = this.f9193c;
                int iIntValue = ((Integer) pair.first).intValue();
                androidx.media3.exoplayer.source.j.b bVar = (androidx.media3.exoplayer.source.j.b) pair.second;
                bVar.getClass();
                aVar.g(iIntValue, bVar, this.f9194d);
                break;
            default:
                ja.a aVar2 = this.f9192b.f9306b.f9300h;
                Pair pair2 = this.f9193c;
                aVar2.e(((Integer) pair2.first).intValue(), (androidx.media3.exoplayer.source.j.b) pair2.second, this.f9194d);
                break;
        }
    }
}
