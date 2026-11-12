package c2;

import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/v1;", "Lh5/x0;", "Lc2/w1;", "", "weight", "", "fill", "<init>", "(FZ)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v1 extends h5.x0<w1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22905b;

    public v1(float f14, boolean z14) {
        this.f22904a = f14;
        this.f22905b = z14;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new w1(this.f22904a, this.f22905b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        return v1Var != null && this.f22904a == v1Var.f22904a && this.f22905b == v1Var.f22905b;
    }

    @Override // h5.x0
    public final int hashCode() {
        return Boolean.hashCode(this.f22905b) + (Float.hashCode(this.f22904a) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "weight";
        float f14 = this.f22904a;
        m2Var.f91342b = Float.valueOf(f14);
        v3 v3Var = m2Var.f91343c;
        v3Var.c(Float.valueOf(f14), "weight");
        v3Var.c(Boolean.valueOf(this.f22905b), "fill");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        w1 w1Var = (w1) cVar;
        w1Var.f22917a = this.f22904a;
        w1Var.f22918b = this.f22905b;
    }
}
