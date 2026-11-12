package i71;

import java.util.List;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B;\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li71/n;", "Ln70/a0;", "Lr53/i;", "Li71/w;", "Lj70/d;", "", "", "data", "Li71/a;", "getLatestTrainingStatusDataUseCase", "Li71/p;", "getTrainingStatusSummariesDataUseCase", "Lf12/l;", "userSettings", "<init>", "(Lr53/i;Li71/a;Li71/p;Lf12/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements a0<r53.i<? extends w>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<j70.d<List<String>>> f91988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f91989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f91990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f91991d;

    public n(r53.i<j70.d<List<String>>> iVar, a aVar, p pVar, f12.l lVar) {
        iVar.getClass();
        aVar.getClass();
        pVar.getClass();
        lVar.getClass();
        this.f91988a = iVar;
        this.f91989b = aVar;
        this.f91990c = pVar;
        this.f91991d = lVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetTrainingStatusSecondaryStatsDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends w> invoke() {
        return r53.s.A(new m(this.f91988a, this), s0.f129406a);
    }
}
