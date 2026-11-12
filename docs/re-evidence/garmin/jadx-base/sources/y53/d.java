package y53;

import e23.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012(\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004j\u0002`\t\u0012J\b\u0002\u0010\u000e\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly53/d;", "Q", "", "clauseObject", "Lkotlin/Function3;", "Ly53/h;", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "", "Lt13/g;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Le23/q;Le23/q;Le23/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<Q> implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f194552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q<Object, h<?>, Object, Unit> f194553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q<Object, Object, Object, Object> f194554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q<h<?>, Object, Object, q<Throwable, Object, t13.g, Unit>> f194555d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Object obj, q<Object, ? super h<?>, Object, Unit> qVar, q<Object, Object, Object, ? extends Object> qVar2, q<? super h<?>, Object, Object, ? extends q<? super Throwable, Object, ? super t13.g, Unit>> qVar3) {
        this.f194552a = obj;
        this.f194553b = qVar;
        this.f194554c = qVar2;
        this.f194555d = qVar3;
    }

    @Override // y53.e
    public final q<h<?>, Object, Object, q<Throwable, Object, t13.g, Unit>> a() {
        return this.f194555d;
    }

    @Override // y53.e
    public final q<Object, h<?>, Object, Unit> b() {
        return this.f194553b;
    }

    @Override // y53.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getF194552a() {
        return this.f194552a;
    }

    @Override // y53.e
    public final q<Object, Object, Object, Object> d() {
        return this.f194554c;
    }

    public /* synthetic */ d(Object obj, q qVar, q qVar2, q qVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(obj, qVar, qVar2, (i14 & 8) != 0 ? null : qVar3);
    }
}
