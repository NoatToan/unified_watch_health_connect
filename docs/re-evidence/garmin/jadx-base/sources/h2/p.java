package h2;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh2/p;", "Lg2/u$a;", "Lkotlin/Function1;", "", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function2;", "Lh2/c0;", "", "item", "<init>", "(Le23/l;Le23/r;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p implements g2.u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<Integer, Object> f80987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.r<c0, Integer, p3.m, Integer, Unit> f80988b;

    /* JADX WARN: Multi-variable type inference failed */
    public p(e23.l<? super Integer, ? extends Object> lVar, e23.r<? super c0, ? super Integer, ? super p3.m, ? super Integer, Unit> rVar) {
        this.f80987a = lVar;
        this.f80988b = rVar;
    }

    @Override // g2.u.a
    public final e23.l<Integer, Object> getKey() {
        return this.f80987a;
    }
}
