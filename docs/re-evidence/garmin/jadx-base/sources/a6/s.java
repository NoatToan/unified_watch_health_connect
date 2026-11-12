package a6;

import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La6/s;", "", "Lp3/x3;", "resolveResult", "next", "<init>", "(Lp3/x3;La6/s;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3<Object> f1521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f1522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1523c;

    public s(x3<? extends Object> x3Var, s sVar) {
        this.f1521a = x3Var;
        this.f1522b = sVar;
        this.f1523c = x3Var.getValue();
    }

    public final boolean a() {
        if (this.f1521a.getValue() != this.f1523c) {
            return true;
        }
        s sVar = this.f1522b;
        return sVar != null && sVar.a();
    }

    public /* synthetic */ s(x3 x3Var, s sVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(x3Var, (i14 & 2) != 0 ? null : sVar);
    }
}
