package wr2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwr2/s;", "T", "Lo13/l;", "Lkotlin/Function0;", "valueProducer", "<init>", "(Le23/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s<T> implements o13.l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<T> f186885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o13.t f186886b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(e23.a<? extends T> aVar) {
        aVar.getClass();
        this.f186885a = aVar;
        this.f186886b = o13.m.b(aVar);
    }

    public final void a() {
        synchronized (this) {
            this.f186886b = o13.m.b(this.f186885a);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // o13.l
    public final T getValue() {
        T t7;
        synchronized (this) {
            t7 = (T) this.f186886b.getValue();
        }
        return t7;
    }

    @Override // o13.l
    public final boolean isInitialized() {
        boolean zIsInitialized;
        synchronized (this) {
            zIsInitialized = this.f186886b.isInitialized();
        }
        return zIsInitialized;
    }
}
