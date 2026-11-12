package jl2;

import al2.l;
import al2.n;
import al2.p;
import android.content.Context;
import java.util.Locale;
import o13.r;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import u53.d;
import v.h;
import v13.e;
import v13.i;
import wb2.l0;
import wb2.p0;
import wb2.q0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ljl2/b;", "Lal2/p;", "Lok2/d;", "config", "", "logUserReject", "<init>", "(Lok2/d;Z)V", "a", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f99539f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f99540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f99541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f99542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f99543e;

    /* JADX INFO: renamed from: jl2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.device.filetransfer.legacy.result.LegacySyncAuditSaver$saveSyncAudit$2", f = "LegacySyncAuditSaver.kt", l = {}, m = "invokeSuspend")
    public static final class C1913b extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rs2.c f99545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f99546c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1913b(rs2.c cVar, String str, t13.d<? super C1913b> dVar) {
            super(2, dVar);
            this.f99545b = cVar;
            this.f99546c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C1913b(this.f99545b, this.f99546c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1913b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rs2.c cVar = this.f99545b;
            b bVar = b.this;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            try {
                boolean zC = bVar.f99543e.c(cVar.getF92746j());
                q0 q0Var = bVar.f99543e;
                if (zC) {
                    q0Var.e(cVar.getF92746j(), this.f99546c);
                } else {
                    q0Var.getClass();
                }
                ic2.a.b().a();
                p0.b().a();
            } catch (Exception unused) {
                Logger logger = b.f99539f;
                bVar.f99543e.getClass();
                ic2.a.b().a();
                p0.b().a();
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        Logger logger = LoggerFactory.getLogger("CFT#LegacySyncAuditSaver");
        logger.getClass();
        f99539f = logger;
    }

    public b(ok2.d dVar, boolean z14) {
        dVar.getClass();
        this.f99540b = z14;
        x53.c cVar = s0.f129406a;
        this.f99541c = zl.a.e("LegacySyncAuditSaver", x53.b.f189152a.plus(ge1.b.h()));
        Context context = dVar.f132622b;
        context.getClass();
        this.f99542d = new l0(context);
        this.f99543e = new q0(context);
    }

    @Override // al2.m
    public final void B(n nVar) {
    }

    @Override // al2.p
    public final void C(rs2.c cVar) {
        cVar.getClass();
        this.f99543e.getClass();
        q0.g();
    }

    @Override // al2.p
    public final void g(rs2.c cVar, String str, al2.b bVar) {
        cVar.getClass();
        bVar.getClass();
        if (bVar != al2.b.REJECTED || this.f99540b) {
            String strU = h.u(cVar.getF92746j(), "Save the execution result in DeviceSyncAudit ", "/", cVar.getF92741e());
            Logger logger = f99539f;
            logger.getClass();
            if (bVar != al2.b.SUCCESS) {
                logger.warn(strU);
            } else {
                logger.debug(strU);
            }
            l0 l0Var = this.f99542d;
            l0Var.getClass();
            l0Var.f184059a.e(String.format(Locale.ENGLISH, "[device information] unit id: %1$d, product number: %2$d, software version: %3$d, device name: %4$s", Long.valueOf(cVar.getF92746j()), Integer.valueOf(cVar.getF92744h()), Integer.valueOf(cVar.getF92745i()), cVar.getF92742f()), str, ec2.e.a());
            if (bVar != al2.b.SUCCESS && bVar.f3774a) {
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(this.f99541c, x53.b.f189152a, null, new C1913b(cVar, str, null), 2);
            } else {
                this.f99543e.getClass();
                ic2.a.b().a();
                p0.b().a();
            }
        }
    }

    @Override // al2.e
    public final void s(al2.a aVar) {
    }

    @Override // al2.m
    public final void u(l lVar) {
        lVar.getClass();
    }

    @Override // al2.e
    public final void y(al2.c cVar) {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljl2/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(ok2.d dVar, boolean z14, int i14, j jVar) {
        this(dVar, (i14 & 2) != 0 ? false : z14);
    }
}
