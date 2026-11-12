package d6;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ld6/o;", "", "Ld6/o$b;", "linearity", "", "subpixelTextPositioning", "<init>", "(IZLkotlin/jvm/internal/j;)V", "a", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f57783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f57784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f57785e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57787b;

    static {
        p005kotlin.jvm.internal.j jVar = null;
        f57783c = new a(jVar);
        b.a aVar = b.f57788b;
        aVar.getClass();
        f57784d = new o(b.f57790d, false, jVar);
        aVar.getClass();
        f57785e = new o(b.f57789c, true, jVar);
    }

    private o(int i14, boolean z14) {
        this.f57786a = i14;
        this.f57787b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        int i14 = oVar.f57786a;
        b.a aVar = b.f57788b;
        return this.f57786a == i14 && this.f57787b == oVar.f57787b;
    }

    public final int hashCode() {
        b.a aVar = b.f57788b;
        return Boolean.hashCode(this.f57787b) + (Integer.hashCode(this.f57786a) * 31);
    }

    public final String toString() {
        if (equals(f57784d)) {
            return "TextMotion.Static";
        }
        return equals(f57785e) ? "TextMotion.Animated" : "Invalid";
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ld6/o$b;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @d23.a
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f57788b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f57789c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f57790d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f57791e = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57792a;

        private /* synthetic */ b(int i14) {
            this.f57792a = i14;
        }

        public static final /* synthetic */ b a(int i14) {
            return new b(i14);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f57792a == ((b) obj).f57792a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57792a);
        }

        public final String toString() {
            int i14 = f57789c;
            int i15 = this.f57792a;
            if (i15 == i14) {
                return "Linearity.Linear";
            }
            if (i15 == f57790d) {
                return "Linearity.FontHinting";
            }
            return i15 == f57791e ? "Linearity.None" : "Invalid";
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/o$b$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/o$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ o(int i14, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(i14, z14);
    }
}
