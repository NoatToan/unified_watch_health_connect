package np0;

import ae0.e;
import j70.d;
import java.util.List;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B3\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnp0/b;", "Ln70/a0;", "Lr53/i;", "Lyz1/a0$a;", "Lj70/d;", "", "", "data", "Lae0/b;", "userSummariesUseCase", "Lae0/e;", "getUserGoalsDataUseCase", "<init>", "(Lr53/i;Lae0/b;Lae0/e;)V", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a0<i<? extends yz1.a0.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<d<List<String>>> f126840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.b f126841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f126842c;

    public b(i<d<List<String>>> iVar, ae0.b bVar, e eVar) {
        iVar.getClass();
        bVar.getClass();
        eVar.getClass();
        this.f126840a = iVar;
        this.f126841b = bVar;
        this.f126842c = eVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetHydrationDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends yz1.a0.a> invoke() {
        return s.A(new a(this.f126840a, this), s0.f129406a);
    }
}
