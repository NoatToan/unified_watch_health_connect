package k2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk2/e;", "Lk2/b;", "", "Lg6/f;", "size", "<init>", "(FLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f102403a;

    private e(float f14) {
        this.f102403a = f14;
    }

    @Override // k2.b
    public final float a(g6.c cVar, long j8) {
        return cVar.s0(this.f102403a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && g6.f.c(this.f102403a, ((e) obj).f102403a);
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f102403a);
    }

    public final String toString() {
        return e0.e(this.f102403a, ".dp)", new StringBuilder("CornerSize(size = "));
    }

    public /* synthetic */ e(float f14, j jVar) {
        this(f14);
    }
}
