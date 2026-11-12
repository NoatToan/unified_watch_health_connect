package bl2;

import b21.s4;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.util.concurrent.atomic.AtomicBoolean;
import ok2.g0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lbl2/o;", "", "Lbl2/o$b;", "delegate", "<init>", "(Lbl2/o$b;)V", "b", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f18693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.p<? super al2.b, ? super CoreTransferException, Unit> f18694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f18695c;

    public interface b extends ok2.z {
        void a(al2.l lVar, al2.m mVar);

        void i(wk2.i iVar, al2.l lVar);

        void k(wk2.i iVar, s4 s4Var);

        void m(wk2.i iVar, long j8, long j14);
    }

    public o(b bVar) {
        bVar.getClass();
        this.f18693a = bVar;
        this.f18695c = new AtomicBoolean(false);
    }

    public final void a(bl2.b bVar, pk2.x xVar) {
        wk2.i iVar = bVar.f18603d;
        AtomicBoolean atomicBoolean = this.f18695c;
        boolean z14 = atomicBoolean.get();
        z zVar = bVar.f18609j;
        bVar.f18604e.j(iVar, xVar);
        pk2.x f205158h = iVar.getF205158h();
        pk2.x xVar2 = f205158h == null ? xVar : f205158h;
        al2.k.f3808b.getClass();
        al2.k kVarA = al2.k.a.a(xVar2, z14);
        rs2.c cVar = bVar.f18602c;
        g0 f205155e = iVar.getF205155e();
        wk2.f f205152b = iVar.getF205152b();
        Long lB = zVar.b();
        Integer numC = zVar.c();
        lk2.b0 b0Var = bVar.f18608i;
        al2.l lVar = new al2.l(cVar, f205155e, f205152b, kVarA, xVar2, lB, numC, null, b0Var != null ? b0Var.getF113168f() : null, iVar.e(bVar.f18600a.a()), 128, null);
        boolean z15 = lVar.f3822d.f3817a;
        b bVar2 = this.f18693a;
        if (z15 && atomicBoolean.compareAndSet(false, true)) {
            bVar2.k(iVar, new s4(this, 17));
        }
        bVar2.i(iVar, lVar);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lbl2/o$a;", "Lbl2/o$b;", "Lok2/z;", "Lrs2/c;", "device", "syncStatus", "Lorg/slf4j/Logger;", "logger", "", "caller", "<init>", "(Lrs2/c;Lok2/z;Lorg/slf4j/Logger;Ljava/lang/String;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class a implements b, ok2.z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rs2.c f18696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ok2.z f18697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Logger f18698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f18699d;

        public a(rs2.c cVar, ok2.z zVar, Logger logger, String str) {
            cVar.getClass();
            zVar.getClass();
            logger.getClass();
            str.getClass();
            this.f18696a = cVar;
            this.f18697b = zVar;
            this.f18698c = logger;
            this.f18699d = str;
        }

        @Override // bl2.o.b
        public final void a(al2.l lVar, al2.m mVar) {
            ok2.g.b bVar = ok2.g.f132677s;
            Logger logger = this.f18698c;
            String str = this.f18699d;
            bVar.getClass();
            ok2.g.b.a(logger, str, lVar);
            if (mVar != null) {
                synchronized (this) {
                    mVar.u(lVar);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        @Override // ok2.z
        public final g0 c() {
            return this.f18697b.c();
        }

        @Override // bl2.o.b
        public final void i(wk2.i iVar, al2.l lVar) {
            iVar.getClass();
            a(lVar, iVar.getF205159i());
        }

        @Override // bl2.o.b
        public final void k(wk2.i iVar, s4 s4Var) {
            iVar.getClass();
            a(new al2.l(this.f18696a, iVar, al2.k.STARTED), iVar.getF205159i());
        }

        @Override // bl2.o.b
        public final void m(wk2.i iVar, long j8, long j14) {
            iVar.getClass();
            al2.n nVar = new al2.n(this.f18696a, iVar.getF205155e(), iVar.getF205152b(), j8, j14);
            al2.m f205159i = iVar.getF205159i();
            if (f205159i != null) {
                f205159i.B(nVar);
            }
        }

        public /* synthetic */ a(rs2.c cVar, ok2.z zVar, Logger logger, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(cVar, zVar, logger, (i14 & 8) != 0 ? "notifyFileEvent" : str);
        }
    }
}
