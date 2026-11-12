package y53;

import e23.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012(\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012J\b\u0002\u0010\u000b\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ly53/c;", "", "clauseObject", "Lkotlin/Function3;", "Ly53/h;", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "", "Lt13/g;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Le23/q;Le23/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f194548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q<Object, h<?>, Object, Unit> f194549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q<h<?>, Object, Object, q<Throwable, Object, t13.g, Unit>> f194550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f194551d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Object obj, q<Object, ? super h<?>, Object, Unit> qVar, q<? super h<?>, Object, Object, ? extends q<? super Throwable, Object, ? super t13.g, Unit>> qVar2) {
        this.f194548a = obj;
        this.f194549b = qVar;
        this.f194550c = qVar2;
        this.f194551d = i.f194575a;
    }

    @Override // y53.e
    public final q<h<?>, Object, Object, q<Throwable, Object, t13.g, Unit>> a() {
        return this.f194550c;
    }

    @Override // y53.e
    public final q<Object, h<?>, Object, Unit> b() {
        return this.f194549b;
    }

    @Override // y53.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getF194548a() {
        return this.f194548a;
    }

    @Override // y53.e
    public final q<Object, Object, Object, Object> d() {
        return this.f194551d;
    }

    public /* synthetic */ c(Object obj, q qVar, q qVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(obj, qVar, (i14 & 4) != 0 ? null : qVar2);
    }
}
