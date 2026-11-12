package w43;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182012a;

    public static final class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f182013b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // w43.f
        public final boolean a(j33.e eVar) {
            return eVar.f181728j != null;
        }
    }

    public static final class b extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f182014b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // w43.f
        public final boolean a(j33.e eVar) {
            return (eVar.f181728j == null && eVar.f181727i == null) ? false : true;
        }
    }

    private k(String str) {
        this.f182012a = str;
    }

    @Override // w43.f
    public final /* bridge */ String b(j33.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // w43.f
    public final String getDescription() {
        return this.f182012a;
    }

    public /* synthetic */ k(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
