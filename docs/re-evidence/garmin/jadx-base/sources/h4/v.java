package h4;

import ch.qos.logback.core.CoreConstants;
import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh4/v;", "Lh5/x0;", "Lh4/w;", "", "zIndex", "<init>", "(F)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class v extends x0<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f81585a;

    public v(float f14) {
        this.f81585a = f14;
    }

    @Override // h5.x0
    public final r.c create() {
        return new w(this.f81585a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Float.compare(this.f81585a, ((v) obj).f81585a) == 0;
    }

    @Override // h5.x0
    public final int hashCode() {
        return Float.hashCode(this.f81585a);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "zIndex";
        m2Var.f91343c.c(Float.valueOf(this.f81585a), "zIndex");
    }

    public final String toString() {
        return q6.f.p(new StringBuilder("ZIndexElement(zIndex="), this.f81585a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        ((w) cVar).f81586a = this.f81585a;
    }
}
