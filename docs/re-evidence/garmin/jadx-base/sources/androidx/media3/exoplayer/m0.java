package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0.a f9205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f9206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sa.i f9207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sa.j f9208e;

    public /* synthetic */ m0(o0.a aVar, Pair pair, sa.i iVar, sa.j jVar, int i14) {
        this.f9204a = i14;
        this.f9205b = aVar;
        this.f9206c = pair;
        this.f9207d = iVar;
        this.f9208e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9204a) {
            case 0:
                ja.a aVar = this.f9205b.f9306b.f9300h;
                Pair pair = this.f9206c;
                aVar.c(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.j.b) pair.second, this.f9207d, this.f9208e);
                break;
            case 1:
                ja.a aVar2 = this.f9205b.f9306b.f9300h;
                Pair pair2 = this.f9206c;
                aVar2.i(((Integer) pair2.first).intValue(), (androidx.media3.exoplayer.source.j.b) pair2.second, this.f9207d, this.f9208e);
                break;
            default:
                ja.a aVar3 = this.f9205b.f9306b.f9300h;
                Pair pair3 = this.f9206c;
                aVar3.h(((Integer) pair3.first).intValue(), (androidx.media3.exoplayer.source.j.b) pair3.second, this.f9207d, this.f9208e);
                break;
        }
    }
}
