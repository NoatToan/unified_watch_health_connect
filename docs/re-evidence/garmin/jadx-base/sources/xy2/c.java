package xy2;

import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003BG\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxy2/c;", "ReturnType", "ArgumentType", "Lxy2/j;", "default", "", "Lxy2/k;", "interceptors", "<init>", "(Lxy2/j;[Lxy2/k;)V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c<ReturnType, ArgumentType> implements j<ReturnType, ArgumentType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f192721a;

    public c(j<? extends ReturnType, ? super ArgumentType> jVar, k<ReturnType, ArgumentType>... kVarArr) {
        jVar.getClass();
        kVarArr.getClass();
        this.f192721a = o13.m.b(new xr.a(6, kVarArr, jVar));
    }

    @Override // xy2.j
    public final ReturnType invoke(ArgumentType argumenttype) {
        return (ReturnType) ((j) this.f192721a.getValue()).invoke(argumenttype);
    }
}
