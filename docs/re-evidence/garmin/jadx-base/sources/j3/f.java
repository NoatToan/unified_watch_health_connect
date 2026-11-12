package j3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj3/f;", "", "Lne/a;", "windowSizeClass", "Lj3/e;", "windowPosture", "<init>", "(Lne/a;Lj3/e;)V", "adaptive"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne.a f96834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f96835b;

    public f(ne.a aVar, e eVar) {
        this.f96834a = aVar;
        this.f96835b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f96834a, fVar.f96834a) && s.g(this.f96835b, fVar.f96835b);
    }

    public final int hashCode() {
        return this.f96835b.hashCode() + (this.f96834a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.f96834a + ", windowPosture=" + this.f96835b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
