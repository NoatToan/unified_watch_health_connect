package i3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Li3/fh;", "", "<init>", "()V", "b", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class fh {
    public /* synthetic */ fh(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private fh() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li3/fh$a;", "Li3/fh;", "Lh4/d$b;", "alignment", "<init>", "(Lh4/d$b;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends fh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h4.d.b f88118a;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(h4.d.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
            if ((i14 & 1) != 0) {
                h4.d.f81522a.getClass();
                bVar = h4.d.a.f81536n;
            }
            this(bVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return p005kotlin.jvm.internal.s.g(this.f88118a, ((a) obj).f88118a);
        }

        public final int hashCode() {
            return this.f88118a.hashCode();
        }

        public final String toString() {
            return "Above(alignment=" + this.f88118a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public a(h4.d.b bVar) {
            super(null);
            this.f88118a = bVar;
        }

        public a() {
            this(null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/fh$b;", "Li3/fh;", "", "alwaysMinimize", "Lh4/d$b;", "minimizedAlignment", "expandedAlignment", "<init>", "(ZLh4/d$b;Lh4/d$b;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends fh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f88119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h4.d.b f88120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h4.d.b f88121c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(boolean z14, h4.d.b bVar, h4.d.b bVar2, int i14, p005kotlin.jvm.internal.j jVar) {
            z14 = (i14 & 1) != 0 ? false : z14;
            if ((i14 & 2) != 0) {
                h4.d.f81522a.getClass();
                bVar = h4.d.a.f81536n;
            }
            if ((i14 & 4) != 0) {
                h4.d.f81522a.getClass();
                bVar2 = h4.d.a.f81536n;
            }
            this(z14, bVar, bVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f88119a == bVar.f88119a && p005kotlin.jvm.internal.s.g(this.f88120b, bVar.f88120b) && p005kotlin.jvm.internal.s.g(this.f88121c, bVar.f88121c);
        }

        public final int hashCode() {
            return this.f88121c.hashCode() + ((this.f88120b.hashCode() + (Boolean.hashCode(this.f88119a) * 31)) * 31);
        }

        public final String toString() {
            return "Attached(alwaysMinimize=" + this.f88119a + ", minimizedAlignment=" + this.f88120b + ", expandedAlignment=" + this.f88121c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public b() {
            this(false, null, null, 7, null);
        }

        public b(boolean z14, h4.d.b bVar, h4.d.b bVar2) {
            super(null);
            this.f88119a = z14;
            this.f88120b = bVar;
            this.f88121c = bVar2;
        }
    }
}
