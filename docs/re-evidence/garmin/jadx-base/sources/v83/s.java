package v83;

/* JADX INFO: loaded from: classes11.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile g f176257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile h f176258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile i f176259d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile e f176268m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile j f176256a = new j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile k f176260e = new k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile l f176264i = new l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile m f176261f = new m();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile n f176265j = new n();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile o f176262g = new o();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile p f176263h = new p();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile q f176266k = new q();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile r f176269n = new r();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile c f176267l = new c();

    static {
        new d();
        f176268m = new e();
        new f();
        f176257b = new g();
        f176258c = new h();
        f176259d = new i();
    }

    private s() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(Throwable th3) {
        j jVar = f176256a;
        if (jVar != null) {
            try {
                jVar.call(th3);
                return;
            } catch (Throwable th4) {
                System.err.println("The onError handler threw an Exception. It shouldn't. => " + th4.getMessage());
                th4.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th4);
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
    }

    public static Throwable b(Throwable th3) {
        q qVar = f176266k;
        return qVar != null ? (Throwable) qVar.call(th3) : th3;
    }

    public static n83.a c(n83.a aVar) {
        p pVar = f176263h;
        return pVar != null ? (n83.a) pVar.call(aVar) : aVar;
    }
}
