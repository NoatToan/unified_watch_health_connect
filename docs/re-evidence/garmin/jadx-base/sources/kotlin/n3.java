package kotlin;

import com.nimbusds.jose.HeaderParameterNames;
import h4.r;
import h5.x0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li5/n3;", "Lh5/x0;", "Li5/p3;", "", HeaderParameterNames.AUTHENTICATION_TAG, "<init>", "(Ljava/lang/String;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n3 extends x0<p3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91356a;

    public n3(String str) {
        this.f91356a = str;
    }

    @Override // h5.x0
    public final r.c create() {
        return new p3(this.f91356a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        return s.g(this.f91356a, ((n3) obj).f91356a);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f91356a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "testTag";
        m2Var.f91343c.c(this.f91356a, HeaderParameterNames.AUTHENTICATION_TAG);
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        ((p3) cVar).f91384a = this.f91356a;
    }
}
