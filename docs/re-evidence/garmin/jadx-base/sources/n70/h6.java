package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln70/h6;", "Ln70/a0;", "Lr53/i;", "Lo70/c0;", "Lj70/w;", "dashboardData", "<init>", "(Lr53/i;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h6 implements a0<r53.i<? extends o70.c0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<j70.w> f124265a;

    public h6(r53.i<j70.w> iVar) {
        iVar.getClass();
        this.f124265a = iVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetTrainingPlansDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends o70.c0> invoke() {
        return r53.s.A(new d6(this.f124265a, this), o53.s0.f129406a);
    }
}
