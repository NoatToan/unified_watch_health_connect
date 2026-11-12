package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lc2/f;", "", "<init>", "()V", "a", "Lc2/f$a;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class f {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc2/f$a;", "Lc2/f;", "Lf5/a;", "alignmentLine", "<init>", "(Lf5/a;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5.a f22641a;

        public a(f5.a aVar) {
            super(null);
            this.f22641a = aVar;
        }

        @Override // c2.f
        public final int a(f5.v1 v1Var) {
            return v1Var.E(this.f22641a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f22641a, ((a) obj).f22641a);
        }

        public final int hashCode() {
            return this.f22641a.hashCode();
        }

        public final String toString() {
            return "Value(alignmentLine=" + this.f22641a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract int a(f5.v1 v1Var);

    private f() {
    }
}
