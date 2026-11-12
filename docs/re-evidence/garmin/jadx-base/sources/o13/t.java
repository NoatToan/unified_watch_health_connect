package o13;

import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo13/t;", "T", "Lo13/l;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "", "lock", "<init>", "(Le23/a;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t<T> implements l<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a<? extends T> f128602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f128603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f128604c;

    public t(e23.a<? extends T> aVar, Object obj) {
        aVar.getClass();
        this.f128602a = aVar;
        this.f128603b = b0.f128566a;
        this.f128604c = obj == null ? this : obj;
    }

    @Override // o13.l
    public final T getValue() {
        T tInvoke;
        T t7 = (T) this.f128603b;
        b0 b0Var = b0.f128566a;
        if (t7 != b0Var) {
            return t7;
        }
        synchronized (this.f128604c) {
            tInvoke = (T) this.f128603b;
            if (tInvoke == b0Var) {
                e23.a<? extends T> aVar = this.f128602a;
                aVar.getClass();
                tInvoke = aVar.invoke();
                this.f128603b = tInvoke;
                this.f128602a = null;
            }
        }
        return tInvoke;
    }

    @Override // o13.l
    public final boolean isInitialized() {
        return this.f128603b != b0.f128566a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ t(e23.a aVar, Object obj, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i14 & 2) != 0 ? null : obj);
    }
}
