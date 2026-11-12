package bl2;

import java.util.concurrent.atomic.AtomicBoolean;
import o53.c2;
import o53.j2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lbl2/a0;", "", "Lo53/b0;", "coroutineScope", "Lbl2/b$b;", "queueDelegate", "<init>", "(Lo53/b0;Lbl2/b$b;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f18595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.InterfaceC0272b f18596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f18597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f18598d;

    static {
        new a(null);
    }

    public a0(o53.b0 b0Var, b.InterfaceC0272b interfaceC0272b) {
        b0Var.getClass();
        interfaceC0272b.getClass();
        this.f18595a = b0Var;
        this.f18596b = interfaceC0272b;
        this.f18598d = new AtomicBoolean(false);
    }

    public final Object a(lk2.b bVar, wk2.i iVar, boolean z14, v13.c cVar) {
        if (this.f18598d.compareAndSet(false, true) && bVar != null) {
            c2 c2VarT = ge1.b.T(this.f18595a, null, null, new c0(z14, bVar, iVar, this, null), 3);
            this.f18597c = c2VarT;
            Object objC = j2.c(25000L, new b0(c2VarT, null), cVar);
            if (objC == u13.a.COROUTINE_SUSPENDED) {
                return objC;
            }
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbl2/a0$a;", "", "<init>", "()V", "", "MAX_TRANSFER_STATUS_DELAY_MILLIS", "J", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
