package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0.a f9200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f9201c;

    public /* synthetic */ l0(o0.a aVar, Pair pair, int i14) {
        this.f9199a = i14;
        this.f9200b = aVar;
        this.f9201c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9199a) {
            case 0:
                ja.a aVar = this.f9200b.f9306b.f9300h;
                Pair pair = this.f9201c;
                aVar.a(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.j.b) pair.second);
                break;
            case 1:
                ja.a aVar2 = this.f9200b.f9306b.f9300h;
                Pair pair2 = this.f9201c;
                aVar2.b(((Integer) pair2.first).intValue(), (androidx.media3.exoplayer.source.j.b) pair2.second);
                break;
            case 2:
                ja.a aVar3 = this.f9200b.f9306b.f9300h;
                Pair pair3 = this.f9201c;
                aVar3.l(((Integer) pair3.first).intValue(), (androidx.media3.exoplayer.source.j.b) pair3.second);
                break;
            default:
                ja.a aVar4 = this.f9200b.f9306b.f9300h;
                Pair pair4 = this.f9201c;
                aVar4.f(((Integer) pair4.first).intValue(), (androidx.media3.exoplayer.source.j.b) pair4.second);
                break;
        }
    }
}
