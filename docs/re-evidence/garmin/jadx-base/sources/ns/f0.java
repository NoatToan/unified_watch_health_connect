package ns;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/f0;", "Lns/g3;", "Ll22/b;", "resourceResolver", "Lu00/c;", "", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends g3 {
    public /* synthetic */ f0(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.a0() : cVar);
    }

    @Override // ns.g3, u00.b
    public final /* bridge */ /* synthetic */ String a(int i14, Object obj) {
        return h(((Number) obj).doubleValue(), i14);
    }

    @Override // ns.g3
    public final String h(double d14, int i14) {
        c22.l3.f23124b.getClass();
        return c22.l3.a.p1(((double) ((int) ((Math.ceil(d14) + 59.0d) / 60.0d))) * 60.0d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(l22.b bVar) {
        this(bVar, null, 2, 0 == true ? 1 : 0);
        bVar.getClass();
    }
}
