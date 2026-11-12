package j83;

import rx.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f97740a = c.f97743a;

    /* JADX INFO: renamed from: j83.a$a, reason: collision with other inner class name */
    public static final class C1864a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f97741a = 0;

        static {
            new C1864a();
        }

        private C1864a() {
        }

        @Override // j83.a.d
        public final boolean a() {
            return false;
        }
    }

    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f97742a = 0;

        static {
            new b();
        }

        private b() {
        }

        @Override // j83.a.d
        public final boolean a() {
            return true;
        }
    }

    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f97743a = new c();

        private c() {
        }

        @Override // j83.a.d
        public final boolean a() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    public interface d {
        boolean a();
    }

    static {
        int i14 = b.f97742a;
        int i15 = C1864a.f97741a;
    }

    private a() {
        throw new IllegalStateException("No instances!");
    }
}
