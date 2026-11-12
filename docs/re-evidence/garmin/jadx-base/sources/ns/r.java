package ns;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lns/r;", "Lns/p;", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class r extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l22.b f127745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(l22.b bVar) {
        super(bVar, false, false, null, null, 30, null);
        bVar.getClass();
        this.f127745g = bVar;
    }

    @Override // ns.p, u00.b
    public /* bridge */ /* synthetic */ String a(int i14, Object obj) {
        return k(((Number) obj).doubleValue(), i14);
    }

    @Override // ns.p
    public final String h(String str, boolean z14) {
        str.getClass();
        l22.b bVar = this.f127745g;
        if (z14) {
            oi0.b bVar2 = new oi0.b(bVar, str);
            bVar2.x();
            return bVar2.f132238b;
        }
        oi0.b bVar3 = new oi0.b(bVar, str);
        bVar3.y();
        return bVar3.f132238b;
    }

    @Override // ns.p
    public String k(double d14, int i14) {
        String strJ = j(d14, c22.m3.METER, !oe2.f.H(i14, 16), oe2.f.H(i14, 256));
        if (oe2.f.H(i14, 2)) {
            return h(strJ, d14 == 1.0d);
        }
        return strJ;
    }

    @Override // ns.p
    public final String l(int i14, Double d14) {
        String string = this.f127745g.getString(c22.m3.METER.f23164e);
        return u00.b.g(1) ? string : h(string, p005kotlin.jvm.internal.s.c(d14, 1.0d));
    }

    @Override // ns.p
    public final /* bridge */ /* synthetic */ String m(Object obj) {
        return l(1, (Double) obj);
    }
}
