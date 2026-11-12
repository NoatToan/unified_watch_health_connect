package c2;

import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lc2/s3;", "Lh5/x0;", "Lc2/t3;", "Lc2/i0;", "direction", "", "unbounded", "Lkotlin/Function2;", "Lg6/m;", "Lg6/o;", "Lg6/k;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(Lc2/i0;ZLe23/p;Ljava/lang/Object;Ljava/lang/String;)V", "a", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class s3 extends h5.x0<t3> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f22873f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f22874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.p<g6.m, g6.o, g6.k> f22876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f22877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22878e;

    /* JADX WARN: Multi-variable type inference failed */
    public s3(i0 i0Var, boolean z14, e23.p<? super g6.m, ? super g6.o, g6.k> pVar, Object obj, String str) {
        this.f22874a = i0Var;
        this.f22875b = z14;
        this.f22876c = pVar;
        this.f22877d = obj;
        this.f22878e = str;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new t3(this.f22874a, this.f22875b, this.f22876c);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s3.class != obj.getClass()) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return this.f22874a == s3Var.f22874a && this.f22875b == s3Var.f22875b && p005kotlin.jvm.internal.s.g(this.f22877d, s3Var.f22877d);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f22877d.hashCode() + q6.f.g(this.f22874a.hashCode() * 31, 31, this.f22875b);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = this.f22878e;
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f22877d, "align");
        v3Var.c(Boolean.valueOf(this.f22875b), "unbounded");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        t3 t3Var = (t3) cVar;
        t3Var.f22882a = this.f22874a;
        t3Var.f22883b = this.f22875b;
        t3Var.f22884c = this.f22876c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc2/s3$a;", "", "<init>", "()V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
