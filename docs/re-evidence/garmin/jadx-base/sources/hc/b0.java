package hc;

import bb.l0;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<androidx.media3.common.q> f82827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0[] f82828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ga.g f82829c = new ga.g(new gw.j(this, 4));

    public b0(List<androidx.media3.common.q> list) {
        this.f82827a = list;
        this.f82828b = new l0[list.size()];
    }

    public final void a(bb.p pVar, f0.d dVar) {
        int i14 = 0;
        while (true) {
            l0[] l0VarArr = this.f82828b;
            if (i14 >= l0VarArr.length) {
                return;
            }
            dVar.a();
            dVar.b();
            l0 l0VarTrack = pVar.track(dVar.f82932d, 3);
            androidx.media3.common.q qVar = this.f82827a.get(i14);
            String str = qVar.f8386n;
            fa.a.b(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            String str2 = qVar.f8373a;
            if (str2 == null) {
                dVar.b();
                str2 = dVar.f82933e;
            }
            androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
            bVar.f8399a = str2;
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
