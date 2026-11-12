package c9;

import c22.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lc9/g;", "", "", "value", "<init>", "(D)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements Comparable<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25997b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f25998a;

    static {
        new g(0.0d);
    }

    private g(double d14) {
        this.f25998a = d14;
    }

    @Override // java.lang.Comparable
    public final int compareTo(g gVar) {
        g gVar2 = gVar;
        gVar2.getClass();
        return Double.compare(this.f25998a, gVar2.f25998a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f25998a == ((g) obj).f25998a;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f25998a);
    }

    public final String toString() {
        return t.d(this.f25998a, " mmHg", new StringBuilder());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc9/g$a;", "", "<init>", "()V", "Lc9/g;", "ZERO", "Lc9/g;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static g a(double d14) {
            return new g(d14, null);
        }

        private a() {
        }
    }

    public /* synthetic */ g(double d14, p005kotlin.jvm.internal.j jVar) {
        this(d14);
    }
}
