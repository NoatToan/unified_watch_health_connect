package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lc2/f0;", "", "<init>", "()V", "b", "a", "d", "c", "Lc2/f0$a;", "Lc2/f0$c;", "Lc2/f0$d;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f22642a = new b(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc2/f0$a;", "Lc2/f0;", "Lc2/f;", "alignmentLineProvider", "<init>", "(Lc2/f;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f22643b;

        public a(f fVar) {
            super(null);
            this.f22643b = fVar;
        }

        @Override // c2.f0
        public final int a(int i14, g6.o oVar, f5.v1 v1Var, int i15) {
            int iA = this.f22643b.a(v1Var);
            if (iA == Integer.MIN_VALUE) {
                return 0;
            }
            int i16 = i15 - iA;
            return oVar == g6.o.Rtl ? (i14 - v1Var.f69144a) - i16 : i16;
        }

        @Override // c2.f0
        public final Integer b(f5.v1 v1Var) {
            return Integer.valueOf(this.f22643b.a(v1Var));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc2/f0$c;", "Lc2/f0;", "Lh4/d$b;", "horizontal", "<init>", "(Lh4/d$b;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c extends f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h4.d.b f22644b;

        public c(h4.d.b bVar) {
            super(null);
            this.f22644b = bVar;
        }

        @Override // c2.f0
        public final int a(int i14, g6.o oVar, f5.v1 v1Var, int i15) {
            return this.f22644b.a(v1Var.f69144a, i14, oVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f22644b, ((c) obj).f22644b);
        }

        public final int hashCode() {
            return this.f22644b.hashCode();
        }

        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f22644b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc2/f0$d;", "Lc2/f0;", "Lh4/d$c;", "vertical", "<init>", "(Lh4/d$c;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class d extends f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h4.d.c f22645b;

        public d(h4.d.c cVar) {
            super(null);
            this.f22645b = cVar;
        }

        @Override // c2.f0
        public final int a(int i14, g6.o oVar, f5.v1 v1Var, int i15) {
            return this.f22645b.a(v1Var.f69145b, i14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f22645b, ((d) obj).f22645b);
        }

        public final int hashCode() {
            return this.f22645b.hashCode();
        }

        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f22645b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ f0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract int a(int i14, g6.o oVar, f5.v1 v1Var, int i15);

    public Integer b(f5.v1 v1Var) {
        return null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc2/f0$b;", "", "<init>", "()V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    private f0() {
    }
}
