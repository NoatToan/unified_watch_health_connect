package o4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lo4/b1;", "", "<init>", "()V", "b", "c", "a", "Lo4/b1$a;", "Lo4/b1$b;", "Lo4/b1$c;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b1 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo4/b1$a;", "Lo4/b1;", "Lo4/f1;", "path", "<init>", "(Lo4/f1;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f1 f128811a;

        public a(f1 f1Var) {
            super(null);
            this.f128811a = f1Var;
        }

        @Override // o4.b1
        /* JADX INFO: renamed from: a */
        public final n4.d getF128812a() {
            return this.f128811a.getBounds();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo4/b1$b;", "Lo4/b1;", "Ln4/d;", "rect", "<init>", "(Ln4/d;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n4.d f128812a;

        public b(n4.d dVar) {
            super(null);
            this.f128812a = dVar;
        }

        @Override // o4.b1
        /* JADX INFO: renamed from: a, reason: from getter */
        public final n4.d getF128812a() {
            return this.f128812a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return p005kotlin.jvm.internal.s.g(this.f128812a, ((b) obj).f128812a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f128812a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo4/b1$c;", "Lo4/b1;", "Ln4/e;", "roundRect", "<init>", "(Ln4/e;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n4.e f128813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f128814b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(n4.e eVar) {
            super(0 == true ? 1 : 0);
            j jVarA = null;
            this.f128813a = eVar;
            if (!n4.f.d(eVar)) {
                jVarA = m.a();
                jVarA.k(eVar, f1.b.CounterClockwise);
            }
            this.f128814b = jVarA;
        }

        @Override // o4.b1
        /* JADX INFO: renamed from: a */
        public final n4.d getF128812a() {
            n4.e eVar = this.f128813a;
            return new n4.d(eVar.f123551a, eVar.f123552b, eVar.f123553c, eVar.f123554d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return p005kotlin.jvm.internal.s.g(this.f128813a, ((c) obj).f128813a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f128813a.hashCode();
        }
    }

    public /* synthetic */ b1(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract n4.d getF128812a();

    private b1() {
    }
}
