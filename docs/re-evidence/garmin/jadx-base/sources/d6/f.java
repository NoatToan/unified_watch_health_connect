package d6;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000f"}, d2 = {"Ld6/f;", "", "Ld6/f$a;", "alignment", "Ld6/f$d;", "trim", "Ld6/f$c;", "mode", "<init>", "(FIILkotlin/jvm/internal/j;)V", "(FILkotlin/jvm/internal/j;)V", "b", "d", "a", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f57730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f57731e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57734c;

    static {
        p005kotlin.jvm.internal.j jVar = null;
        f57730d = new b(jVar);
        a.f57735b.getClass();
        float f14 = a.f57737d;
        d.f57744b.getClass();
        int i14 = d.f57747e;
        c.f57740b.getClass();
        f57731e = new f(f14, i14, 0, jVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private f(float f14, int i14) {
        this(f14, i14, 0, null);
        c.f57740b.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        float f14 = fVar.f57732a;
        a.C1235a c1235a = a.f57735b;
        if (Float.compare(this.f57732a, f14) == 0) {
            int i14 = fVar.f57733b;
            d.a aVar = d.f57744b;
            if (this.f57733b == i14) {
                int i15 = fVar.f57734c;
                c.a aVar2 = c.f57740b;
                if (this.f57734c == i15) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        a.C1235a c1235a = a.f57735b;
        int iHashCode = Float.hashCode(this.f57732a) * 31;
        d.a aVar = d.f57744b;
        int iD = q2.d(this.f57733b, iHashCode, 31);
        c.a aVar2 = c.f57740b;
        return Integer.hashCode(this.f57734c) + iD;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("LineHeightStyle(alignment=");
        sb3.append((Object) a.c(this.f57732a));
        sb3.append(", trim=");
        sb3.append((Object) d.b(this.f57733b));
        sb3.append(",mode=");
        int i14 = this.f57734c;
        if (i14 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i14 == c.f57741c) {
            str = "LineHeightStyle.Mode.Minimum";
        } else {
            str = i14 == c.f57742d ? "LineHeightStyle.Mode.Tight" : "Invalid";
        }
        sb3.append((Object) str);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ld6/f$a;", "", "a", "topRatio", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @d23.a
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1235a f57735b = new C1235a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final float f57736c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float f57737d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final float f57738e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f57739a;

        static {
            b(0.0f);
            b(0.5f);
            f57736c = 0.5f;
            b(-1.0f);
            f57737d = -1.0f;
            b(1.0f);
            f57738e = 1.0f;
        }

        private /* synthetic */ a(float f14) {
            this.f57739a = f14;
        }

        public static final /* synthetic */ a a(float f14) {
            return new a(f14);
        }

        public static void b(float f14) {
            if ((0.0f > f14 || f14 > 1.0f) && f14 != -1.0f) {
                y5.a.c("topRatio should be in [0..1] range or -1");
            }
        }

        public static String c(float f14) {
            if (f14 == 0.0f) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f14 == f57736c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f14 == f57737d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f14 == f57738e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f14 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Float.compare(this.f57739a, ((a) obj).f57739a) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f57739a);
        }

        public final String toString() {
            return c(this.f57739a);
        }

        /* JADX INFO: renamed from: d6.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/f$a$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1235a {
            public /* synthetic */ C1235a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C1235a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ld6/f$c;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @d23.a
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f57740b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f57741c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f57742d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57743a;

        private /* synthetic */ c(int i14) {
            this.f57743a = i14;
        }

        public static final /* synthetic */ c a(int i14) {
            return new c(i14);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f57743a == ((c) obj).f57743a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57743a);
        }

        public final String toString() {
            int i14 = this.f57743a;
            if (i14 == 0) {
                return "LineHeightStyle.Mode.Fixed";
            }
            if (i14 == f57741c) {
                return "LineHeightStyle.Mode.Minimum";
            }
            return i14 == f57742d ? "LineHeightStyle.Mode.Tight" : "Invalid";
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/f$c$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ld6/f$d;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @d23.a
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f57744b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f57745c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f57746d = 16;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f57747e = 17;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57748a;

        private /* synthetic */ d(int i14) {
            this.f57748a = i14;
        }

        public static final /* synthetic */ d a(int i14) {
            return new d(i14);
        }

        public static String b(int i14) {
            if (i14 == f57745c) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i14 == f57746d) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i14 == f57747e) {
                return "LineHeightStyle.Trim.Both";
            }
            return i14 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f57748a == ((d) obj).f57748a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57748a);
        }

        public final String toString() {
            return b(this.f57748a);
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ld6/f$d$a;", "", "<init>", "()V", "", "FlagTrimTop", "I", "FlagTrimBottom", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/f$b;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ f(float f14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(f14, i14);
    }

    private f(float f14, int i14, int i15) {
        this.f57732a = f14;
        this.f57733b = i14;
        this.f57734c = i15;
    }

    public /* synthetic */ f(float f14, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(f14, i14, i15);
    }
}
