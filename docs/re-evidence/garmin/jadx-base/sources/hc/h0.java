package hc;

import bb.l0;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<androidx.media3.common.q> f82952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0[] f82953b;

    public h0(List<androidx.media3.common.q> list) {
        this.f82952a = list;
        this.f82953b = new l0[list.size()];
    }

    public final void a(long j8, fa.r rVar) {
        if (rVar.a() < 9) {
            return;
        }
        int iG = rVar.g();
        int iG2 = rVar.g();
        int iU = rVar.u();
        if (iG == 434 && iG2 == 1195456820 && iU == 3) {
            bb.f.b(j8, rVar, this.f82953b);
        }
    }

    public final void b(bb.p pVar, f0.d dVar) {
        int i14 = 0;
        while (true) {
            l0[] l0VarArr = this.f82953b;
            if (i14 >= l0VarArr.length) {
                return;
            }
            dVar.a();
            dVar.b();
            l0 l0VarTrack = pVar.track(dVar.f82932d, 3);
            androidx.media3.common.q qVar = this.f82952a.get(i14);
            String str = qVar.f8386n;
            fa.a.b(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
            dVar.b();
            bVar.f8399a = dVar.f82933e;
            bVar.f8411m = androidx.media3.common.x.n(str);
            bVar.f8403e = qVar.f8377e;
            bVar.f8402d = qVar.f8376d;
            bVar.G = qVar.H;
            bVar.f8414p = qVar.f8389q;
            l0VarTrack.d(bVar.a());
            l0VarArr[i14] = l0VarTrack;
            i14++;
        }
    }
}
