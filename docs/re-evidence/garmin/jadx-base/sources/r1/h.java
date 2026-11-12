package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/i0;", "Lp3/h0;", "invoke", "(Lp3/i0;)Lp3/h0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class h extends p005kotlin.jvm.internal.w implements e23.l<p3.i0, p3.h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f4.s<Object> f149091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<Object> f149093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f4.s<Object> sVar, Object obj, q<Object> qVar) {
        super(1);
        this.f149091a = sVar;
        this.f149092b = obj;
        this.f149093c = qVar;
    }

    @Override // e23.l
    public final p3.h0 invoke(p3.i0 i0Var) {
        return new g(this.f149091a, this.f149092b, this.f149093c);
    }
}
