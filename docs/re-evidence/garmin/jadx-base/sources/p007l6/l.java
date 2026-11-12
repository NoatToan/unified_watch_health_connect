package p007l6;

import ch.qos.logback.core.joran.action.ActionConst;
import f5.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll6/l;", "Lf5/i0;", "Ll6/e;", ActionConst.REF_ATTRIBUTE, "Lkotlin/Function1;", "Ll6/d;", "", "constrain", "<init>", "(Ll6/e;Le23/l;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f110480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<d, Unit> f110481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f110482c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(e eVar, e23.l<? super d, Unit> lVar) {
        this.f110480a = eVar;
        this.f110481b = lVar;
        this.f110482c = eVar.f110465b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f110480a.f110465b, lVar.f110480a.f110465b) && this.f110481b == lVar.f110481b;
    }

    public final int hashCode() {
        return this.f110481b.hashCode() + (this.f110480a.f110465b.hashCode() * 31);
    }

    @Override // f5.i0
    /* JADX INFO: renamed from: m0, reason: from getter */
    public final Object getF110482c() {
        return this.f110482c;
    }
}
