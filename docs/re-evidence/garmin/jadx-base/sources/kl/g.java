package kl;

import f12.l;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkl/g;", "Ln70/a0;", "Lr53/i;", "Ljl/b;", "Lkl/c;", "data", "Lf12/l;", "userSettings", "<init>", "(Lkl/c;Lf12/l;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements a0<i<? extends jl.b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f105211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f105212b;

    public g(c cVar, l lVar) {
        cVar.getClass();
        lVar.getClass();
        this.f105211a = cVar;
        this.f105212b = lVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetHeatAcclimationDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends jl.b> invoke() {
        c cVar = this.f105211a;
        a aVar = new a(cVar.f105194a, cVar);
        x53.c cVar2 = s0.f129406a;
        return s.A(new f(s.A(aVar, cVar2), this), cVar2);
    }
}
