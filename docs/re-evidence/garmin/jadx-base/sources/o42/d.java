package o42;

import java.util.List;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B+\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo42/d;", "Ln70/a0;", "Lr53/i;", "Lo42/e;", "Lj70/d;", "", "", "data", "Lae0/e;", "getUserGoalsDataUseCase", "<init>", "(Lr53/i;Lae0/e;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements a0<i<? extends e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j70.d<List<String>>> f129080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.e f129081b;

    public d(i<j70.d<List<String>>> iVar, ae0.e eVar) {
        iVar.getClass();
        eVar.getClass();
        this.f129080a = iVar;
        this.f129081b = eVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetWeightDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends e> invoke() {
        return s.A(new a(this.f129080a, this), s0.f129406a);
    }
}
