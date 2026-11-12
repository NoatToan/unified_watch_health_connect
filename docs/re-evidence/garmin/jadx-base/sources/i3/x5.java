package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li3/x5;", "Lh4/r$c;", "Lkotlin/Function0;", "", "updateStateOnAttach", "<init>", "(Le23/a;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x5 extends h4.r.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a<Unit> f90282a;

    public x5(e23.a<Unit> aVar) {
        this.f90282a = aVar;
    }

    @Override // h4.r.c
    public final void onAttach() {
        this.f90282a.invoke();
    }
}
