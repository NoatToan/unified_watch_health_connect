package xf;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxf/d;", "Lxf/h;", "Lxf/g;", "size", "<init>", "(Lxf/g;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f190612a;

    public d(g gVar) {
        this.f190612a = gVar;
    }

    @Override // xf.h
    public final Object a(t13.d<? super g> dVar) {
        return this.f190612a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && s.g(this.f190612a, ((d) obj).f190612a);
    }

    public final int hashCode() {
        return this.f190612a.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.f190612a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
