package fi;

import ci.n;
import java.util.Set;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class a extends w implements e23.a<Set<? extends String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f71633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f71634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f71635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, n nVar, Long l14) {
        super(0);
        this.f71633a = cVar;
        this.f71634b = nVar;
        this.f71635c = l14;
    }

    @Override // e23.a
    public final Set<? extends String> invoke() {
        c cVar = this.f71633a;
        gi.d dVar = cVar.f71641b;
        n nVar = this.f71634b;
        n nVarB = dVar.b(nVar.f27616a);
        Long l14 = this.f71635c;
        if (nVarB == null) {
            dVar.d(c.f(cVar, nVar, l14));
            return nVar.a();
        }
        p<n, Set<String>> pVarB = nVarB.b(nVar, l14);
        n nVar2 = pVarB.f128594a;
        Set<String> set = pVarB.f128595b;
        if (!nVar2.f27617b.isEmpty()) {
            dVar.c(nVar2);
        }
        return set;
    }
}
