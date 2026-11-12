package xf;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lxf/g;", "", "Lxf/a;", "width", "height", "<init>", "(Lxf/a;Lxf/a;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f190618c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xf.a f190619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xf.a f190620b;

    static {
        new a(null);
        xf.a.b bVar = xf.a.b.f190608a;
        f190618c = new g(bVar, bVar);
    }

    public g(xf.a aVar, xf.a aVar2) {
        this.f190619a = aVar;
        this.f190620b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f190619a, gVar.f190619a) && s.g(this.f190620b, gVar.f190620b);
    }

    public final int hashCode() {
        return this.f190620b.hashCode() + (this.f190619a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f190619a + ", height=" + this.f190620b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxf/g$a;", "", "<init>", "()V", "Lxf/g;", "ORIGINAL", "Lxf/g;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
