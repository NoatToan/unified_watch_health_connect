package o13;

import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo13/e0;", "T", "Lo13/l;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Le23/a;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0<T> implements l<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a<? extends T> f128576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f128577b;

    public e0(e23.a<? extends T> aVar) {
        aVar.getClass();
        this.f128576a = aVar;
        this.f128577b = b0.f128566a;
    }

    @Override // o13.l
    public final T getValue() {
        if (this.f128577b == b0.f128566a) {
            e23.a<? extends T> aVar = this.f128576a;
            aVar.getClass();
            this.f128577b = aVar.invoke();
            this.f128576a = null;
        }
        return (T) this.f128577b;
    }

    @Override // o13.l
    public final boolean isInitialized() {
        return this.f128577b != b0.f128566a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
