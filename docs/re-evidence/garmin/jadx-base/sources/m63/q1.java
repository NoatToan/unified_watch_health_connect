package m63;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm63/q1;", "Lk63/e;", "", "serialName", "Lk63/d;", "kind", "<init>", "(Ljava/lang/String;Lk63/d;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q1 implements k63.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k63.d f117010b;

    public q1(String str, k63.d dVar) {
        str.getClass();
        dVar.getClass();
        this.f117009a = str;
        this.f117010b = dVar;
    }

    public final void a() {
        throw new IllegalStateException(am.j.o(this.f117009a, " does not have elements", new StringBuilder("Primitive descriptor ")));
    }

    @Override // k63.e
    /* JADX INFO: renamed from: c */
    public final int getF116985c() {
        return 0;
    }

    @Override // k63.e
    public final String d(int i14) {
        a();
        throw null;
    }

    @Override // k63.e
    public final List<Annotation> e(int i14) {
        a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.f117009a.equals(q1Var.f117009a) && this.f117010b.equals(q1Var.f117010b);
    }

    @Override // k63.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF116983a() {
        return this.f117009a;
    }

    @Override // k63.e
    public final int g(String str) {
        str.getClass();
        a();
        throw null;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: getKind */
    public final k63.l getF103234b() {
        return this.f117010b;
    }

    @Override // k63.e
    public final k63.e h(int i14) {
        a();
        throw null;
    }

    public final int hashCode() {
        return (this.f117010b.hashCode() * 31) + this.f117009a.hashCode();
    }

    @Override // k63.e
    public final boolean i(int i14) {
        a();
        throw null;
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("PrimitiveDescriptor("), this.f117009a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
