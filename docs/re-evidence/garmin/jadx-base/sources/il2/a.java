package il2;

import al2.m;
import al2.n;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.filetransfer.core.LegacySyncNotSupportedException;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.device.filetransfer.core.util.DeviceNotConnectedException;
import com.garmin.proto.generated.GDICore;
import com.google.mlkit.common.MlKitException;
import e23.p;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import o13.r;
import o53.b0;
import o53.j2;
import o53.s;
import o53.s0;
import ok2.a0;
import ok2.g0;
import ok2.w;
import ok2.y;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lil2/a;", "Lok2/w;", "Lrs2/c;", "device", "Lil2/e;", "shim", "Lda2/i;", "registry", "Lok2/a0;", "transferHelper", "<init>", "(Lrs2/c;Lil2/e;Lda2/i;Lok2/a0;)V", "a", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a implements w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1796a f94004g = new C1796a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g0 f94005h = g0.AUTOMATIC_ALLOWED;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final UUID f94006i = new UUID(0, 65533);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.c f94007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final il2.e f94008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final da2.i f94009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f94010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f94011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u53.d f94012f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.legacy.LegacySyncManager$requestBackgroundSync$1", f = "LegacySyncManager.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "invokeSuspend")
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94013a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f94015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<al2.b, CoreTransferException, Unit> f94016d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(y yVar, p<? super al2.b, ? super CoreTransferException, Unit> pVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f94015c = yVar;
            this.f94016d = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new b(this.f94015c, this.f94016d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94013a;
            if (i14 == 0) {
                r.b(obj);
                this.f94013a = 1;
                C1796a c1796a = a.f94004g;
                obj = a.this.h(this.f94015c, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            al2.c cVar = (al2.c) obj;
            p<al2.b, CoreTransferException, Unit> pVar = this.f94016d;
            if (pVar != null) {
                al2.f.a aVar2 = al2.f.f3791c;
                i91.c cVar2 = new i91.c(9, pVar, cVar);
                aVar2.getClass();
                al2.f.a.a(cVar2);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.device.filetransfer.legacy.LegacySyncManager", f = "LegacySyncManager.kt", l = {173, 183}, m = "requestSync")
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f94017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f94018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f94019c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f94021e;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f94019c = obj;
            this.f94021e |= Integer.MIN_VALUE;
            C1796a c1796a = a.f94004g;
            return a.this.h(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"il2/a$d", "Lal2/e;", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements al2.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f94022b = gl.b.b();

        public d() {
        }

        @Override // al2.m
        public final void B(n nVar) {
        }

        /* JADX WARN: Code duplicated, block: B:35:0x006e A[Catch: all -> 0x0029, TRY_ENTER, TryCatch #3 {all -> 0x0029, blocks: (B:12:0x0025, B:25:0x004b, B:32:0x005a, B:35:0x006e, B:36:0x007a), top: B:41:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x007a A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #3 {all -> 0x0029, blocks: (B:12:0x0025, B:25:0x004b, B:32:0x005a, B:35:0x006e, B:36:0x007a), top: B:41:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(v13.c cVar) throws Throwable {
            il2.c cVar2;
            d dVar;
            DeviceProfile deviceProfileD;
            a aVar;
            al2.c cVarE;
            if (cVar instanceof il2.c) {
                cVar2 = (il2.c) cVar;
                int i14 = cVar2.f94036d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    cVar2.f94036d = i14 - Integer.MIN_VALUE;
                } else {
                    cVar2 = new il2.c(this, cVar);
                }
            } else {
                cVar2 = new il2.c(this, cVar);
            }
            Object objB = cVar2.f94034b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = cVar2.f94036d;
            if (i15 != 0) {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = cVar2.f94033a;
                try {
                    try {
                        r.b(objB);
                        al2.c cVar3 = (al2.c) objB;
                        a.this.f94010d.j(dVar);
                        return cVar3;
                    } catch (Exception e4) {
                        e = e4;
                        a aVar3 = a.this;
                        deviceProfileD = ((da2.b) aVar3.f94009c).d(aVar3.f94007a.getF92741e());
                        aVar = a.this;
                        if (deviceProfileD != null) {
                            cVarE = aVar.e(new CoreTransferException(ok2.e.f132646n, e));
                        } else {
                            cVarE = aVar.e(new CoreTransferException(ok2.e.f132635c, e));
                        }
                        a.this.f94010d.j(dVar);
                        return cVarE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a.this.f94010d.j(dVar);
                    throw th;
                }
            }
            r.b(objB);
            try {
                il2.d dVar2 = new il2.d(this, null);
                cVar2.f94033a = this;
                cVar2.f94036d = 1;
                objB = j2.b(25000L, dVar2, cVar2);
                if (objB == aVar2) {
                    return aVar2;
                }
                dVar = this;
                al2.c cVar4 = (al2.c) objB;
                a.this.f94010d.j(dVar);
                return cVar4;
            } catch (Exception e14) {
                e = e14;
                dVar = this;
                a aVar4 = a.this;
                deviceProfileD = ((da2.b) aVar4.f94009c).d(aVar4.f94007a.getF92741e());
                aVar = a.this;
                if (deviceProfileD != null) {
                    cVarE = aVar.e(new CoreTransferException(ok2.e.f132646n, e));
                } else {
                    cVarE = aVar.e(new CoreTransferException(ok2.e.f132635c, e));
                }
                a.this.f94010d.j(dVar);
                return cVarE;
            } catch (Throwable th4) {
                th = th4;
                dVar = this;
                a.this.f94010d.j(dVar);
                throw th;
            }
        }

        @Override // al2.e
        public final void s(al2.a aVar) {
        }

        @Override // al2.m
        public final void u(al2.l lVar) {
            lVar.getClass();
        }

        @Override // al2.e
        public final void y(al2.c cVar) {
            if (cVar.f3775a.getF92746j() == a.this.f94007a.getF92746j()) {
                this.f94022b.g0(cVar);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.legacy.LegacySyncManager$requestUserSync$2", f = "LegacySyncManager.kt", l = {196}, m = "invokeSuspend")
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94024a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f94026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<al2.c, Unit> f94027d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(y yVar, e23.l<? super al2.c, Unit> lVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f94026c = yVar;
            this.f94027d = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new e(this.f94026c, this.f94027d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94024a;
            if (i14 == 0) {
                r.b(obj);
                this.f94024a = 1;
                C1796a c1796a = a.f94004g;
                obj = a.this.h(this.f94026c, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            al2.c cVar = (al2.c) obj;
            e23.l<al2.c, Unit> lVar = this.f94027d;
            if (lVar != null) {
                al2.f.a aVar2 = al2.f.f3791c;
                i91.c cVar2 = new i91.c(10, lVar, cVar);
                aVar2.getClass();
                al2.f.a.a(cVar2);
            }
            return Unit.INSTANCE;
        }
    }

    public a(rs2.c cVar, il2.e eVar, da2.i iVar, a0 a0Var) {
        cVar.getClass();
        iVar.getClass();
        a0Var.getClass();
        this.f94007a = cVar;
        this.f94008b = eVar;
        this.f94009c = iVar;
        this.f94010d = a0Var;
        Logger logger = LoggerFactory.getLogger("CFT#LegacySyncManager@" + cVar.getF92741e());
        logger.getClass();
        this.f94011e = logger;
        x53.c cVar2 = s0.f129406a;
        this.f94012f = zl.a.e("LegacySyncManager", x53.b.f189152a.plus(ge1.b.h()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Serializable g(a aVar, m mVar, v13.c cVar) throws DeviceNotConnectedException {
        il2.b bVar;
        if (cVar instanceof il2.b) {
            bVar = (il2.b) cVar;
            int i14 = bVar.f94032e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f94032e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new il2.b(aVar, cVar);
            }
        } else {
            bVar = new il2.b(aVar, cVar);
        }
        Object objA = bVar.f94030c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f94032e;
        if (i15 == 0) {
            r.b(objA);
            ea2.f fVar = (ea2.f) da2.d.b().getCapability(aVar.f94007a.getF92741e(), ea2.f.class);
            if (fVar == null) {
                aVar.f94011e.warn("Unable to read Device XML, device capability is unavailable");
                throw new DeviceNotConnectedException();
            }
            bVar.f94028a = mVar;
            bVar.f94029b = fVar;
            bVar.f94032e = 1;
            t13.i iVar = new t13.i(u13.f.b(bVar));
            fVar.readGarminDeviceXml(new l(aVar.f94007a, aVar.f94012f, iVar, mVar));
            objA = iVar.a();
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        return new o13.p(objA, null);
    }

    @Override // ok2.w
    public final Object b(boolean z14, fm2.c.b.a aVar, v13.c cVar) {
        return g(this, aVar, cVar);
    }

    @Override // ok2.z
    public final g0 c() {
        wb2.r rVarF = wb2.r.f();
        rs2.c cVar = this.f94007a;
        if (!rVarF.i(cVar.getF92741e())) {
            return null;
        }
        wb2.a aVarB = wb2.r.f().f184104a.b(cVar.getF92741e());
        return (aVarB != null && aVarB.m() && aVarB.h() == wb2.j.INVISIBLE) ? g0.UTILITY_SILENT : g0.USER_INITIATED_GENERAL;
    }

    @Override // xk2.b
    public final Object d(xk2.a aVar, xk2.e eVar, uf2.b bVar) throws LegacySyncNotSupportedException {
        throw new LegacySyncNotSupportedException("Device cannot read individual file. Queue with Connect and request sync");
    }

    public final al2.c e(CoreTransferException coreTransferException) {
        return new al2.c(this.f94007a, g0.USER_INITIATED_GENERAL, al2.b.REJECTED, coreTransferException, null, 0, false, true, 112, null);
    }

    @Override // ok2.w
    public final void f(y yVar, e23.l<? super al2.c, Unit> lVar) {
        ge1.b.T(this.f94012f, null, null, new e(yVar, lVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ba A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:17:0x003b, B:39:0x00ae, B:43:0x00b6, B:45:0x00ba), top: B:58:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(y yVar, t13.d<? super al2.c> dVar) throws Throwable {
        c cVar;
        d dVar2;
        a aVar;
        GDICore.SyncResponse.ResponseStatus responseStatus;
        a aVar2;
        al2.c cVar2;
        il2.e eVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f94021e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f94021e = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar3 = cVar;
        Object objB = cVar3.f94019c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f94021e;
        if (i15 != 0) {
            if (i15 == 1) {
                dVar2 = cVar3.f94018b;
                aVar = cVar3.f94017a;
                try {
                    r.b(objB);
                } catch (Exception e4) {
                    e = e4;
                    aVar.f94011e.error("Failed to requestSync", (Throwable) e);
                    dVar2.f94022b.g0(aVar.e(new CoreTransferException(ok2.e.f132646n, "Failed to send syncNow request", e)));
                }
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = cVar3.f94017a;
                r.b(objB);
            }
            cVar2 = (al2.c) objB;
            if (cVar2.f3777c == al2.b.REJECTED && (eVar = aVar2.f94008b) != null) {
                eVar.k(aVar2.f94007a.getF92746j(), null);
            }
            return cVar2;
        }
        r.b(objB);
        g0 g0VarC = c();
        il2.e eVar2 = this.f94008b;
        rs2.c cVar4 = this.f94007a;
        if (g0VarC == null && eVar2 != null) {
            eVar2.k(cVar4.getF92746j(), yVar);
        }
        if (((da2.b) this.f94009c).d(cVar4.getF92741e()) == null) {
            com.airbnb.lottie.animation.keyframe.a.A("Cannot start sync with disconnected device ", cVar4.getF92741e(), this.f94011e);
            if (eVar2 != null) {
                eVar2.k(cVar4.getF92746j(), null);
            }
            return e(new DeviceNotConnectedException());
        }
        dVar2 = new d();
        this.f94010d.b(dVar2);
        try {
            vs2.i iVar = (vs2.i) da2.d.b().getCapability(cVar4.getF92741e(), vs2.i.class);
            if (iVar != null) {
                cVar3.f94017a = this;
                cVar3.f94018b = dVar2;
                cVar3.f94021e = 1;
                objB = iVar.b(cVar3);
                if (objB != aVar3) {
                    aVar = this;
                }
            } else {
                aVar = this;
                responseStatus = null;
                if (responseStatus == GDICore.SyncResponse.ResponseStatus.BUSY_WITH_ANOTHER_APP) {
                    dVar2.f94022b.g0(aVar.e(new CoreTransferException(ok2.e.f132637e, "syncNow responded that device is busy", null, 4, null)));
                }
                cVar3.f94017a = aVar;
                cVar3.f94018b = null;
                cVar3.f94021e = 2;
                objB = dVar2.a(cVar3);
                if (objB != aVar3) {
                    aVar2 = aVar;
                    cVar2 = (al2.c) objB;
                    if (cVar2.f3777c == al2.b.REJECTED) {
                        eVar.k(aVar2.f94007a.getF92746j(), null);
                    }
                    return cVar2;
                }
            }
        } catch (Exception e14) {
            e = e14;
            aVar = this;
            aVar.f94011e.error("Failed to requestSync", (Throwable) e);
            dVar2.f94022b.g0(aVar.e(new CoreTransferException(ok2.e.f132646n, "Failed to send syncNow request", e)));
        }
        return aVar3;
        responseStatus = (GDICore.SyncResponse.ResponseStatus) objB;
        if (responseStatus == GDICore.SyncResponse.ResponseStatus.BUSY_WITH_ANOTHER_APP) {
            dVar2.f94022b.g0(aVar.e(new CoreTransferException(ok2.e.f132637e, "syncNow responded that device is busy", null, 4, null)));
        }
        cVar3.f94017a = aVar;
        cVar3.f94018b = null;
        cVar3.f94021e = 2;
        objB = dVar2.a(cVar3);
        if (objB != aVar3) {
            aVar2 = aVar;
            cVar2 = (al2.c) objB;
            if (cVar2.f3777c == al2.b.REJECTED) {
                eVar.k(aVar2.f94007a.getF92746j(), null);
            }
            return cVar2;
        }
        return aVar3;
    }

    @Override // ok2.w
    public final boolean l() {
        return false;
    }

    @Override // ok2.w
    public final void p() {
        w.a.a(this, y.c.a(y.f132805h, null, null, y.d.BLOCKED, y.d.FORCED, 19), null, 2);
    }

    @Override // ok2.w
    public final Object q(y yVar, t13.d<? super al2.c> dVar) {
        return h(yVar, dVar);
    }

    @Override // ok2.w
    public final void r(y yVar, p<? super al2.b, ? super CoreTransferException, Unit> pVar) {
        yVar.getClass();
        ge1.b.T(this.f94012f, null, null, new b(yVar, pVar, null), 3);
    }

    @Override // ok2.w
    public final Object s(UUID uuid, List list, gl2.g gVar) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: il2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lil2/a$a;", "", "<init>", "()V", "", "SYNC_START_TIMEOUT", "J", "file-transfer-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1796a {
        public /* synthetic */ C1796a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1796a() {
        }
    }

    public a(rs2.c cVar, il2.e eVar, da2.i iVar, a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, (i14 & 2) != 0 ? null : eVar, (i14 & 4) != 0 ? da2.d.b().f58886a.f111646e : iVar, (i14 & 8) != 0 ? a0.f132585h.a() : a0Var);
    }
}
