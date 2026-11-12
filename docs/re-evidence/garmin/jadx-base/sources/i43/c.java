package i43;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f91025a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f91026b;

        static {
            d.a aVar = d.f91028c;
            aVar.getClass();
            int i14 = d.f91035j;
            aVar.getClass();
            int i15 = d.f91033h;
            aVar.getClass();
            f91026b = (~(d.f91034i | i15)) & i14;
        }

        private a() {
        }

        @Override // i43.c
        public final int a() {
            return f91026b;
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f91027a = new b();

        private b() {
        }

        @Override // i43.c
        public final int a() {
            return 0;
        }
    }

    public abstract int a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
