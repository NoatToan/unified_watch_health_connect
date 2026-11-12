package ja;

import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import fa.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fa.j.a, fa.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f97954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f97956c;

    public /* synthetic */ c(b.a aVar, int i14, long j8, long j14) {
        this.f97956c = aVar;
        this.f97955b = i14;
        this.f97954a = j8;
    }

    @Override // fa.g
    public void accept(Object obj) {
        yb.p pVar = (yb.p) this.f97956c;
        yb.c cVar = (yb.c) obj;
        fa.a.f(pVar.f195677i);
        yb.b bVar = pVar.f195671c;
        ImmutableList<ea.a> immutableList = cVar.f195638a;
        long j8 = cVar.f195640c;
        bVar.getClass();
        byte[] bArrA = yb.b.a(j8, immutableList);
        r rVar = pVar.f195672d;
        rVar.getClass();
        rVar.E(bArrA, bArrA.length);
        pVar.f195669a.f(bArrA.length, rVar);
        long j14 = cVar.f195639b;
        androidx.media3.common.q qVar = pVar.f195677i;
        long j15 = this.f97954a;
        if (j14 == C.TIME_UNSET) {
            fa.a.d(qVar.f8391s == Long.MAX_VALUE);
        } else {
            long j16 = qVar.f8391s;
            j15 = j16 == Long.MAX_VALUE ? j15 + j14 : j14 + j16;
        }
        pVar.f195669a.c(j15, this.f97955b, bArrA.length, 0, null);
    }

    @Override // fa.j.a
    public void invoke(Object obj) {
        b.a aVar = (b.a) this.f97956c;
        ((b) obj).w(this.f97955b, this.f97954a, aVar);
    }

    public /* synthetic */ c(yb.p pVar, long j8, int i14) {
        this.f97956c = pVar;
        this.f97954a = j8;
        this.f97955b = i14;
    }
}
