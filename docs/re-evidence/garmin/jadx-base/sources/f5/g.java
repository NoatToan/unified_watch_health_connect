package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    public interface a {
        boolean a();
    }

    <T> T J0(int i14, e23.l<? super a, ? extends T> lVar);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lf5/g$b;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @d23.a
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f68944b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f68945c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f68946d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f68947e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f68948f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f68949g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f68950h = 6;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68951a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f68951a == ((b) obj).f68951a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f68951a);
        }

        public final String toString() {
            int i14 = f68945c;
            int i15 = this.f68951a;
            if (i15 == i14) {
                return "Before";
            }
            if (i15 == f68946d) {
                return "After";
            }
            if (i15 == f68947e) {
                return "Left";
            }
            if (i15 == f68948f) {
                return "Right";
            }
            if (i15 == f68949g) {
                return "Above";
            }
            return i15 == f68950h ? "Below" : "invalid LayoutDirection";
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf5/g$b$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }
}
