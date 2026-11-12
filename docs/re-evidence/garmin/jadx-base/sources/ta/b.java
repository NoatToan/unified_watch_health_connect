package ta;

import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.source.j;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163215a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdsMediaSource.b f163216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.b f163217c;

    public /* synthetic */ b(AdsMediaSource.b bVar, j.b bVar2) {
        this.f163216b = bVar;
        this.f163217c = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f163215a;
        j.b bVar = this.f163217c;
        AdsMediaSource.b bVar2 = this.f163216b;
        switch (i14) {
            case 0:
                AdsMediaSource adsMediaSource = AdsMediaSource.this;
                j.b bVar3 = AdsMediaSource.f9405u;
                adsMediaSource.getClass();
                int i15 = bVar.f9520b;
                throw null;
            default:
                AdsMediaSource adsMediaSource2 = AdsMediaSource.this;
                j.b bVar4 = AdsMediaSource.f9405u;
                adsMediaSource2.getClass();
                int i16 = bVar.f9520b;
                throw null;
        }
    }

    public /* synthetic */ b(AdsMediaSource.b bVar, j.b bVar2, IOException iOException) {
        this.f163216b = bVar;
        this.f163217c = bVar2;
    }
}
