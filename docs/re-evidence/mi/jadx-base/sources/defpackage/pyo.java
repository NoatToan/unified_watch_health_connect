package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class pyo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f30916a = new c();

    public static abstract class b {
        public abstract b a(String str, int i);

        public abstract b b(String str, Object obj);

        public abstract void c();
    }

    public static class c extends b {
        public c() {
        }

        @Override // pyo.b
        public b a(String str, int i) {
            return this;
        }

        @Override // pyo.b
        public b b(String str, Object obj) {
            return this;
        }

        @Override // pyo.b
        public void c() {
        }
    }

    public static b a(long j, String str) {
        return f30916a;
    }

    public static b b(long j) {
        return f30916a;
    }
}
