package w43;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f181998a;

    public static final class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f181999b = new a();

        private a() {
            super(false, null);
        }
    }

    public static final class b extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, null);
            str.getClass();
        }
    }

    public static final class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f182000b = new c();

        private c() {
            super(true, null);
        }
    }

    private g(boolean z14) {
        this.f181998a = z14;
    }

    public /* synthetic */ g(boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(z14);
    }
}
