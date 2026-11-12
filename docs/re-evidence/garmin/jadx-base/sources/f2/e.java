package f2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import p005kotlin.Metadata;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf2/e;", "Lg2/r;", "Lf2/p0;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Lf2/p0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements g2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f68197a;

    public e(p0 p0Var) {
        this.f68197a = p0Var;
    }

    @Override // g2.r
    public final boolean a() {
        return !this.f68197a.i().e().isEmpty();
    }

    @Override // g2.r
    public final int b() {
        return this.f68197a.g();
    }

    @Override // g2.r
    public final int c() {
        int i14;
        p0 p0Var = this.f68197a;
        int f68343t = 0;
        if (p0Var.i().e().isEmpty()) {
            return 0;
        }
        y yVarI = p0Var.i();
        b2 f68341r = yVarI.getF68341r();
        b2 b2Var = b2.Vertical;
        int iA = (int) (f68341r == b2Var ? yVarI.a() & 4294967295L : yVarI.a() >> 32);
        y yVarI2 = p0Var.i();
        boolean z14 = yVarI2.getF68341r() == b2Var;
        List<m> listE = yVarI2.e();
        if (!listE.isEmpty()) {
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i15 < listE.size()) {
                m mVar = yVarI2.e().get(i15);
                int f68170w = z14 ? mVar.getF68170w() : mVar.getF68171x();
                if (f68170w == -1) {
                    i15++;
                } else {
                    int iMax = f68343t;
                    while (i15 < listE.size()) {
                        m mVar2 = yVarI2.e().get(i15);
                        if ((z14 ? mVar2.getF68170w() : mVar2.getF68171x()) != f68170w) {
                            break;
                        }
                        iMax = Math.max(iMax, (int) (z14 ? listE.get(i15).getF68168u() & 4294967295L : listE.get(i15).getF68168u() >> 32));
                        i15++;
                        z14 = z14;
                    }
                    i16 += iMax;
                    i17++;
                    z14 = z14;
                    f68343t = 0;
                }
            }
            f68343t = yVarI2.getF68343t() + (i16 / i17);
        }
        if (f68343t != 0 && (i14 = iA / f68343t) >= 1) {
            return i14;
        }
        return 1;
    }

    @Override // g2.r
    public final int d() {
        return ((m) p13.h0.m0(this.f68197a.i().e())).getF62559a();
    }

    @Override // g2.r
    public final int getItemCount() {
        return this.f68197a.i().getF68339p();
    }
}
