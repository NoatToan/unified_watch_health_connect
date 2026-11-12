package e63;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le63/e;", "T", "Le63/s;", "Le63/l;", "directive", "<init>", "(Le63/l;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T> f63243a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super T> lVar) {
        lVar.getClass();
        this.f63243a = lVar;
    }

    @Override // e63.o
    public final f63.e<T> a() {
        return this.f63243a.a();
    }

    @Override // e63.o
    public final g63.o<T> b() {
        return this.f63243a.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f63243a.equals(((e) obj).f63243a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f63243a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.f63243a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
