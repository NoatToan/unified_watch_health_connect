package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e7e<T> extends nno {
    public static int e = 0;
    public static int f = 4;
    public static int g = 10;
    public static int h = 65536;
    public final boolean d;

    public static abstract class a<T> extends nno.a<e7e<T>> {
        public int g;

        public a(jgj jgjVar, boolean z) {
            super(jgjVar);
        }

        @Override // xz9.a
        public boolean r() {
            return true;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            if (this.g == 0) {
                return 0;
            }
            aprVar.O(e7e.e, e7e.h);
            int i = e7e.g;
            aprVar.Q(e7e.f, i);
            aprVar.z(i);
            throw null;
        }
    }

    public e7e(jgj jgjVar, boolean z) {
        super(jgjVar);
        this.d = z;
    }
}
