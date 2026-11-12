package to2;

import d13.q;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import tn2.n0;
import tn2.p0;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lto2/f;", "", "Lzn2/g1;", "userDataManager", "Lto2/i;", "userStreamEventListener", "<init>", "(Lzn2/g1;Lto2/i;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f165901f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f165902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f165903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y03.i f165904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lz2.c f165905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OkHttpClient f165906e;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f165901f = gt2.b.f79005a.h("PAY#NEW_FITPAY#UserStreamEvent");
    }

    public f(g1 g1Var, i iVar) {
        g1Var.getClass();
        iVar.getClass();
        this.f165902a = g1Var;
        this.f165903b = iVar;
    }

    public final void a() {
        synchronized (this) {
            try {
                OkHttpClient okHttpClient = this.f165906e;
                if (okHttpClient != null) {
                    okHttpClient.dispatcher().executorService().shutdown();
                    okHttpClient.connectionPool().evictAll();
                }
                this.f165906e = null;
                lz2.c cVar = this.f165905d;
                if (cVar != null) {
                    f165901f.debug("closing " + cVar);
                    Call call = cVar.f115414d;
                    if (call != null && !call.getCanceled()) {
                        cVar.f115414d.cancel();
                    }
                }
                this.f165905d = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final d13.e b() {
        e eVar = new e(this, 1);
        int i14 = w03.b.f181178a;
        int i15 = 2;
        q qVar = new q(new d13.c(eVar), new p0(new d(this, i15), 27));
        p0 p0Var = new p0(new n0(7), 28);
        w03.a.c cVar = w03.a.f181171b;
        w03.b.a(p0Var, "onSubscribe is null");
        w03.b.a(cVar, "onDispose is null");
        d13.e eVar2 = new d13.e(qVar, p0Var, cVar);
        e eVar3 = new e(this, i15);
        w03.a.d dVar = w03.a.f181172c;
        w03.b.a(dVar, "onSubscribe is null");
        w03.b.a(eVar3, "onDispose is null");
        return new d13.e(eVar2, dVar, eVar3);
    }

    public final void c() {
        synchronized (this) {
            try {
                f165901f.debug("subscribe");
                y03.i iVar = this.f165904c;
                if (iVar == null || iVar.b()) {
                    this.f165904c = b().g(l13.a.f108327b).d(new p0(new d(this, 0), 25), new p0(new d(this, 1), 26));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lto2/f$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
