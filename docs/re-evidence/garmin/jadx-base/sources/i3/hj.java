package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/hj;", "Li3/gj;", "Lkotlin/Function0;", "Lf5/c0;", "getAnchorBounds", "Lk6/c0;", "positionProvider", "<init>", "(Le23/a;Lk6/c0;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hj implements gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<f5.c0> f88376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p004k6.c0 f88377b;

    /* JADX WARN: Multi-variable type inference failed */
    public hj(e23.a<? extends f5.c0> aVar, p004k6.c0 c0Var) {
        this.f88376a = aVar;
        this.f88377b = c0Var;
    }

    @Override // i3.gj
    /* JADX INFO: renamed from: a, reason: from getter */
    public final p004k6.c0 getF88377b() {
        return this.f88377b;
    }

    @Override // i3.gj
    public final f5.c0 b() {
        return this.f88376a.invoke();
    }
}
