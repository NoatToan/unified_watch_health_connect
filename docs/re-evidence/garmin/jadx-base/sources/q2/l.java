package q2;

import p004k6.c0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lq2/l;", "Lk6/c0;", "popupPositionProvider", "<init>", "(Lk6/c0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f142183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g6.m f142184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g6.o f142185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g6.m f142186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g6.k f142187e;

    public l(c0 c0Var) {
        this.f142183a = c0Var;
    }

    @Override // p004k6.c0
    public final long a(g6.l lVar, long j8, g6.o oVar, long j14) {
        g6.k kVar = this.f142187e;
        if (kVar != null) {
            g6.m mVar = this.f142184b;
            if ((mVar == null ? false : g6.m.c(mVar.f76013a, j8)) && this.f142185c == oVar) {
                g6.m mVar2 = this.f142186d;
                if (mVar2 != null ? g6.m.c(mVar2.f76013a, j14) : false) {
                    return kVar.f76005a;
                }
            }
        }
        long jA = this.f142183a.a(lVar, j8, oVar, j14);
        this.f142184b = g6.m.a(j8);
        this.f142185c = oVar;
        this.f142186d = g6.m.a(j14);
        this.f142187e = g6.k.a(jA);
        return jA;
    }
}
