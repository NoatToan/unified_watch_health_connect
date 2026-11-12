package al2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o13.r;
import o13.t;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.f0;
import p13.l0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lal2/f;", "Lal2/e;", "Lal2/p;", "", "initialListeners", "<init>", "(Ljava/util/Set;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e, p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3791c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f3792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f3793e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet<e> f3794b;

    static {
        Logger logger = LoggerFactory.getLogger("CFT#EventNotifier");
        logger.getClass();
        f3792d = logger;
        f3793e = o13.m.b(new ak0.t(3));
    }

    public f(Set<? extends e> set) {
        set.getClass();
        this.f3794b = new CopyOnWriteArraySet<>(set);
    }

    @Override // al2.m
    public final void B(n nVar) {
        Iterator<e> it = this.f3794b.iterator();
        while (it.hasNext()) {
            a11.n nVar2 = new a11.n(25, it.next(), nVar);
            f3791c.getClass();
            a.a(nVar2);
        }
    }

    @Override // al2.p
    public final void C(rs2.c cVar) {
        cVar.getClass();
        ArrayList arrayListK = f0.K(this.f3794b);
        if (arrayListK.isEmpty()) {
            return;
        }
        a11.n nVar = new a11.n(26, arrayListK, cVar);
        f3791c.getClass();
        a.a(nVar);
    }

    @Override // al2.p
    public final void g(rs2.c cVar, String str, b bVar) {
        cVar.getClass();
        bVar.getClass();
        ArrayList arrayListK = f0.K(this.f3794b);
        if (arrayListK.isEmpty()) {
            return;
        }
        af0.e eVar = new af0.e(arrayListK, cVar, str, bVar, 1);
        f3791c.getClass();
        a.a(eVar);
    }

    @Override // al2.e
    public final void s(al2.a aVar) {
        Iterator<e> it = this.f3794b.iterator();
        while (it.hasNext()) {
            a11.n nVar = new a11.n(22, it.next(), aVar);
            f3791c.getClass();
            a.a(nVar);
        }
    }

    @Override // al2.m
    public final void u(l lVar) {
        lVar.getClass();
        Iterator<e> it = this.f3794b.iterator();
        while (it.hasNext()) {
            a11.n nVar = new a11.n(24, it.next(), lVar);
            f3791c.getClass();
            a.a(nVar);
        }
    }

    @Override // al2.e
    public final void y(c cVar) {
        Iterator<e> it = this.f3794b.iterator();
        while (it.hasNext()) {
            a11.n nVar = new a11.n(23, it.next(), cVar);
            f3791c.getClass();
            a.a(nVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lal2/f$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: al2.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.device.filetransfer.core.result.EventNotifier$Companion$dispatchToMain$1", f = "EventNotifier.kt", l = {}, m = "invokeSuspend")
        public static final class C0067a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f3795a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0067a(e23.a<Unit> aVar, t13.d<? super C0067a> dVar) {
                super(2, dVar);
                this.f3795a = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0067a(this.f3795a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C0067a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                try {
                    this.f3795a.invoke();
                } catch (Exception e4) {
                    f.f3792d.error("callback failed", (Throwable) e4);
                }
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(e23.a aVar) {
            aVar.getClass();
            b0 b0Var = (b0) f.f3793e.getValue();
            x53.c cVar = s0.f129406a;
            ge1.b.T(b0Var, u53.o.f168762a, null, new C0067a(aVar, null), 2);
        }

        private a() {
        }
    }

    public f(Set set, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? l0.f134950a : set);
    }

    public f() {
        this(null, 1, null);
    }
}
