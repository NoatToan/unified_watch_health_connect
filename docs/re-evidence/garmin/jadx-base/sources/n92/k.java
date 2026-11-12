package n92;

import java.util.Map;
import lc.u0;
import m92.h0;
import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.k0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ln92/k;", "", "<init>", "()V", "a", "b", "Ln92/k$a;", "Ln92/k$b;", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class k {
    public /* synthetic */ k(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public final boolean a() {
        if (this instanceof a) {
            return ((a) this).f125086a.isEmpty();
        }
        if (this instanceof b) {
            return ((b) this).f125087a.isEmpty();
        }
        u0.r();
        return false;
    }

    private k() {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln92/k$a;", "Ln92/k;", "", "", "Lo4/v0;", "images", "<init>", "(Ljava/util/Map;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Integer, v0> f125086a;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Map map, int i14, p005kotlin.jvm.internal.j jVar) {
            if ((i14 & 1) != 0) {
                map = k0.f134949a;
                map.getClass();
            }
            this(map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f125086a, ((a) obj).f125086a);
        }

        public final int hashCode() {
            return this.f125086a.hashCode();
        }

        public final String toString() {
            return "TimelineEntriesBitmaps(images=" + this.f125086a + ")";
        }

        public a() {
            this(null, 1, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<Integer, ? extends v0> map) {
            super(null);
            map.getClass();
            this.f125086a = map;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln92/k$b;", "Ln92/k;", "Li53/c;", "Lm92/h0$e$e;", "timelineEntries", "Lg6/f;", "shapeSize", "<init>", "(Li53/c;FLkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i53.c<h0.e.C2226e> f125087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f125088b;

        public b(i53.c cVar, float f14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? j53.l.b() : cVar, f14, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f125087a, bVar.f125087a) && g6.f.c(this.f125088b, bVar.f125088b);
        }

        public final int hashCode() {
            int iHashCode = this.f125087a.hashCode() * 31;
            g6.f.a aVar = g6.f.f75994b;
            return Float.hashCode(this.f125088b) + iHashCode;
        }

        public final String toString() {
            return "TimelineEntriesItems(timelineEntries=" + this.f125087a + ", shapeSize=" + g6.f.d(this.f125088b) + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private b(i53.c<h0.e.C2226e> cVar, float f14) {
            super(null);
            cVar.getClass();
            this.f125087a = cVar;
            this.f125088b = f14;
        }

        public /* synthetic */ b(i53.c cVar, float f14, p005kotlin.jvm.internal.j jVar) {
            this(cVar, f14);
        }
    }
}
