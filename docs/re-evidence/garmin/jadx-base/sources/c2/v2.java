package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lc2/v2;", "Lh5/s1;", "Lh4/r$c;", "<init>", "()V", "a", "Lc2/v2$a;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class v2 extends h4.r.c implements h5.s1 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc2/v2$a;", "Lc2/v2;", "Lf5/a;", "alignmentLine", "<init>", "(Lf5/a;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends v2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f5.a f22906a;

        public a(f5.a aVar) {
            super(null);
            this.f22906a = aVar;
        }

        @Override // h5.s1
        public final Object r(g6.c cVar, Object obj) {
            p2 p2Var = obj instanceof p2 ? (p2) obj : null;
            if (p2Var == null) {
                p2Var = new p2(0.0f, false, null, null, 15, null);
            }
            f0.b bVar = f0.f22642a;
            f.a aVar = new f.a(this.f22906a);
            bVar.getClass();
            p2Var.f22813c = new f0.a(aVar);
            return p2Var;
        }
    }

    public /* synthetic */ v2(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private v2() {
    }
}
