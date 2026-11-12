package xa;

import com.google.common.collect.ImmutableList;
import fa.o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements o.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f189680a;

    public /* synthetic */ g(h hVar) {
        this.f189680a = hVar;
    }

    @Override // fa.o.b
    public final void onNetworkTypeChanged(int i14) {
        h hVar = this.f189680a;
        ImmutableList<Long> immutableList = h.f189681n;
        synchronized (hVar) {
            int i15 = hVar.f189700m;
            if (i15 == 0 || hVar.f189691d) {
                if (i15 == i14) {
                    return;
                }
                hVar.f189700m = i14;
                if (i14 != 1 && i14 != 0 && i14 != 8) {
                    hVar.f189698k = hVar.f(i14);
                    long jElapsedRealtime = hVar.f189690c.elapsedRealtime();
                    hVar.h(hVar.f189693f > 0 ? (int) (jElapsedRealtime - hVar.f189694g) : 0, hVar.f189695h, hVar.f189698k);
                    hVar.f189694g = jElapsedRealtime;
                    hVar.f189695h = 0L;
                    hVar.f189697j = 0L;
                    hVar.f189696i = 0L;
                    i iVar = hVar.f189692e;
                    iVar.f189709b.clear();
                    iVar.f189711d = -1;
                    iVar.f189712e = 0;
                    iVar.f189713f = 0;
                }
            }
        }
    }
}
