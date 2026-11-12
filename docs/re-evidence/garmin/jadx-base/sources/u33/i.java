package u33;

import r1.q2;
import s33.x;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f168331f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f168332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x.d f168333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.f f168334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f168335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f168336e;

    public i(b bVar, x.d dVar, o13.f fVar, Integer num, String str) {
        bVar.getClass();
        dVar.getClass();
        fVar.getClass();
        this.f168332a = bVar;
        this.f168333b = dVar;
        this.f168334c = fVar;
        this.f168335d = num;
        this.f168336e = str;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("since ");
        sb3.append(this.f168332a);
        sb3.append(' ');
        sb3.append(this.f168334c);
        Integer num = this.f168335d;
        if (num != null) {
            str = " error " + num.intValue();
        } else {
            str = "";
        }
        sb3.append(str);
        String str2 = this.f168336e;
        sb3.append(str2 != null ? ": ".concat(str2) : "");
        return sb3.toString();
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f168338d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f168339e = new b(256, 256, 256);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f168340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f168341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f168342c;

        public b(int i14, int i15, int i16) {
            this.f168340a = i14;
            this.f168341b = i15;
            this.f168342c = i16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f168340a == bVar.f168340a && this.f168341b == bVar.f168341b && this.f168342c == bVar.f168342c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f168342c) + q2.d(this.f168341b, Integer.hashCode(this.f168340a) * 31, 31);
        }

        public final String toString() {
            int i14 = this.f168341b;
            int i15 = this.f168342c;
            int i16 = this.f168340a;
            if (i15 == 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i16);
                sb3.append('.');
                sb3.append(i14);
                return sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i16);
            sb4.append('.');
            sb4.append(i14);
            sb4.append('.');
            sb4.append(i15);
            return sb4.toString();
        }

        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: u33.i$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3158a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f168337a;

            static {
                int[] iArr = new int[x.c.values().length];
                try {
                    iArr[x.c.WARNING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[x.c.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[x.c.HIDDEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f168337a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
