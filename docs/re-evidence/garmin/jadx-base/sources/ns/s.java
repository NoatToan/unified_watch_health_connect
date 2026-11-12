package ns;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lns/s;", "Lns/r;", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(l22.b bVar) {
        super(bVar);
        bVar.getClass();
    }

    @Override // ns.r, ns.p, u00.b
    public final /* bridge */ /* synthetic */ String a(int i14, Object obj) {
        return k(((Number) obj).doubleValue(), i14);
    }

    @Override // ns.r, ns.p
    public final String k(double d14, int i14) {
        String strJ = j(Math.rint(d14), c22.m3.METER, !oe2.f.H(i14, 16), true);
        if (oe2.f.H(i14, 2)) {
            return h(strJ, d14 == 1.0d);
        }
        return strJ;
    }
}
