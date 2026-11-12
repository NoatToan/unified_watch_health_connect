package d6;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u00020\u0007¨\u0006\b"}, d2 = {"Ld6/e;", "", "a", "b", "c", "d", "mask", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f57712b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57713c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57714a;

    static {
        b.f57715b.getClass();
        int i14 = b.f57716c;
        c.f57720b.getClass();
        int i15 = c.f57723e;
        d.f57726b.getClass();
        f57713c = i14 | (i15 << 8) | (d.f57727c << 16);
    }

    private /* synthetic */ e(int i14) {
        this.f57714a = i14;
    }

    public static final /* synthetic */ e a(int i14) {
        return new e(i14);
    }

    public static String b(int i14) {
        String str;
        StringBuilder sb3 = new StringBuilder("LineBreak(strategy=");
        sb3.append((Object) b.a(i14 & 255));
        sb3.append(", strictness=");
        sb3.append((Object) c.a((i14 >> 8) & 255));
        sb3.append(", wordBreak=");
        int i15 = (i14 >> 16) & 255;
        if (i15 == d.f57727c) {
            str = "WordBreak.None";
        } else if (i15 == d.f57728d) {
            str = "WordBreak.Phrase";
        } else {
            str = i15 == 0 ? "WordBreak.Unspecified" : "Invalid";
        }
        sb3.append((Object) str);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f57714a == ((e) obj).f57714a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57714a);
    }

    public final String toString() {
        return b(this.f57714a);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ld6/e$b;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @d23.a
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f57715b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f57716c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f57717d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f57718e = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57719a;

        public static String a(int i14) {
            if (i14 == f57716c) {
                return "Strategy.Simple";
            }
            if (i14 == f57717d) {
                return "Strategy.HighQuality";
            }
            if (i14 == f57718e) {
                return "Strategy.Balanced";
            }
            return i14 == 0 ? "Strategy.Unspecified" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f57719a == ((b) obj).f57719a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57719a);
        }

        public final String toString() {
            return a(this.f57719a);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/e$b$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ld6/e$c;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @d23.a
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f57720b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f57721c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f57722d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f57723e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f57724f = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57725a;

        public static String a(int i14) {
            if (i14 == f57721c) {
                return "Strictness.None";
            }
            if (i14 == f57722d) {
                return "Strictness.Loose";
            }
            if (i14 == f57723e) {
                return "Strictness.Normal";
            }
            if (i14 == f57724f) {
                return "Strictness.Strict";
            }
            return i14 == 0 ? "Strictness.Unspecified" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f57725a == ((c) obj).f57725a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57725a);
        }

        public final String toString() {
            return a(this.f57725a);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/e$c$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ld6/e$d;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @d23.a
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f57726b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f57727c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f57728d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f57729a;

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f57729a == ((d) obj).f57729a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57729a);
        }

        public final String toString() {
            int i14 = f57727c;
            int i15 = this.f57729a;
            if (i15 == i14) {
                return "WordBreak.None";
            }
            if (i15 == f57728d) {
                return "WordBreak.Phrase";
            }
            return i15 == 0 ? "WordBreak.Unspecified" : "Invalid";
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/e$d$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/e$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
