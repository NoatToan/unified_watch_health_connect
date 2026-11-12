package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr1/g;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f4.s f149083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f149085c;

    public g(f4.s sVar, Object obj, q qVar) {
        this.f149083a = sVar;
        this.f149084b = obj;
        this.f149085c = qVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p3.h0
    public final void dispose() {
        f4.s sVar = this.f149083a;
        Object obj = this.f149084b;
        sVar.remove(obj);
        this.f149085c.f149195e.k((S) obj);
    }
}
