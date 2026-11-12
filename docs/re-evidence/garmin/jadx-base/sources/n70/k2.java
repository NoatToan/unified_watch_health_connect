package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln70/k2;", "Ln70/a0;", "Lr53/i;", "Lj70/q;", "Lo70/k;", "dashboardData", "<init>", "(Lr53/i;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k2 implements a0<r53.i<? extends j70.q>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<o70.k> f124358a;

    public k2(r53.i<o70.k> iVar) {
        iVar.getClass();
        this.f124358a = iVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetEventsDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends j70.q> invoke() {
        return r53.s.A(new g2(this.f124358a, this), o53.s0.f129406a);
    }
}
