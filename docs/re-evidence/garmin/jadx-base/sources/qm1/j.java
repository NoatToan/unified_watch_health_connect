package qm1;

import java.util.List;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B+\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqm1/j;", "Ln70/a0;", "Lr53/i;", "Lqm1/k;", "Lj70/d;", "", "", "data", "Lbv/d;", "userPreferences", "<init>", "(Lr53/i;Lbv/d;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements a0<r53.i<? extends k>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<j70.d<List<String>>> f145618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv.d f145619b;

    public j(r53.i<j70.d<List<String>>> iVar, bv.d dVar) {
        iVar.getClass();
        dVar.getClass();
        this.f145618a = iVar;
        this.f145619b = dVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetSleepDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends k> invoke() {
        return s.A(new f(this.f145618a, this), s0.f129406a);
    }
}
