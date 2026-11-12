package uv0;

import j70.d;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import pb2.e;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Luv0/b;", "Ln70/a0;", "Lr53/i;", "Lyz1/a0$a;", "Lj70/d;", "Lpb2/e$o;", "data", "<init>", "(Lr53/i;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a0<i<? extends yz1.a0.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<d<e.o>> f172911a;

    public b(i<d<e.o>> iVar) {
        iVar.getClass();
        this.f172911a = iVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetLifestyleLoggingDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends yz1.a0.a> invoke() {
        return s.A(new a(this.f172911a, this), s0.f129406a);
    }
}
