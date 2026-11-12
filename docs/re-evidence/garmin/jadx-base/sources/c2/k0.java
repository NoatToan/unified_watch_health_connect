package c2;

import p005kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lc2/k0;", "Lh5/x0;", "Lc2/l0;", "Lc2/i0;", "direction", "", "fraction", "", "inspectorName", "<init>", "(Lc2/i0;FLjava/lang/String;)V", "a", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 extends h5.x0<l0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22721d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f22722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22724c;

    public k0(i0 i0Var, float f14, String str) {
        this.f22722a = i0Var;
        this.f22723b = f14;
        this.f22724c = str;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new l0(this.f22722a, this.f22723b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f22722a == k0Var.f22722a && this.f22723b == k0Var.f22723b;
    }

    @Override // h5.x0
    public final int hashCode() {
        return Float.hashCode(this.f22723b) + (this.f22722a.hashCode() * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = this.f22724c;
        m2Var.f91343c.c(Float.valueOf(this.f22723b), "fraction");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        l0 l0Var = (l0) cVar;
        l0Var.f22732a = this.f22722a;
        l0Var.f22733b = this.f22723b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc2/k0$a;", "", "<init>", "()V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
