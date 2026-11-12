package x71;

import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx71/d;", "Ln70/a0;", "Lr53/i;", "Lx71/a;", "Lj70/d;", "", "data", "<init>", "(Lr53/i;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements a0<i<? extends a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j70.d<String>> f189431a;

    public d(i<j70.d<String>> iVar) {
        iVar.getClass();
        this.f189431a = iVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetEnduranceScoreDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends a> invoke() {
        return s.A(new c(this.f189431a, this), s0.f129406a);
    }
}
