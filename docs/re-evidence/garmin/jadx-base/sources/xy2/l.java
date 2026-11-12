package xy2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxy2/l;", "ReturnType", "ArgumentType", "Lxy2/j;", "next", "Lxy2/k;", "interceptor", "<init>", "(Lxy2/j;Lxy2/k;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l<ReturnType, ArgumentType> implements j<ReturnType, ArgumentType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<ReturnType, ArgumentType> f192727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k<ReturnType, ArgumentType> f192728b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(j<? extends ReturnType, ? super ArgumentType> jVar, k<ReturnType, ArgumentType> kVar) {
        jVar.getClass();
        kVar.getClass();
        this.f192727a = jVar;
        this.f192728b = kVar;
    }

    @Override // xy2.j
    public final ReturnType invoke(ArgumentType argumenttype) {
        return this.f192728b.a(new d<>(this.f192727a, argumenttype));
    }
}
