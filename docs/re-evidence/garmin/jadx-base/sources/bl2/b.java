package bl2;

import com.garmin.device.filetransfer.DataTypeSpecificException;
import com.garmin.device.filetransfer.FileTransferException;
import com.garmin.device.filetransfer.ItemAccessException;
import com.garmin.device.filetransfer.TransferCancelledException;
import com.garmin.device.filetransfer.TransferStatusException;
import com.garmin.device.filetransfer.core.util.CiqNoSlotsException;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.device.filetransfer.core.util.DeviceDataTypeException;
import com.garmin.device.filetransfer.core.util.DeviceNotConnectedException;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import o53.c2;
import o53.m0;
import ok2.g0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001:\u0002\u0013\u0014B9\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0012¨\u0006\u0015"}, d2 = {"Lbl2/b;", "", "Lok2/b;", "helper", "Lo53/b0;", "coroutineScope", "Lrs2/c;", "device", "Lwk2/i;", "item", "Lbl2/b$b;", "queueDelegate", "Lbl2/o$b;", "notificationDelegate", "<init>", "(Lok2/b;Lo53/b0;Lrs2/c;Lwk2/i;Lbl2/b$b;Lbl2/o$b;)V", "Lok2/g;", "manager", "(Lok2/g;Lwk2/i;)V", "a", "b", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f18599l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ok2.b f18600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.b0 f18601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rs2.c f18602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wk2.i f18603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0272b f18604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f18605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f18606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f18607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public lk2.b0 f18608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f18609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c2 f18610k;

    /* JADX INFO: renamed from: bl2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0272b {
        boolean h(int i14, UUID uuid);

        Unit j(wk2.i iVar, pk2.x xVar);

        Integer o(wk2.i iVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.tasks.AbstractActiveTransfer$terminate$1", f = "AbstractActiveTransfer.kt", l = {277, 285}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f18611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18613c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ok2.e f18615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f18616f;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18617a;

            static {
                int[] iArr = new int[ok2.e.values().length];
                try {
                    iArr[ok2.e.f132636d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ok2.e.f132640h.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ok2.e.I.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ok2.e.E.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f18617a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ok2.e eVar, boolean z14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f18615e = eVar;
            this.f18616f = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new c(this.f18615e, this.f18616f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0057  */
        /* JADX WARN: Code duplicated, block: B:27:0x0067  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        
            if (r12.b(r11) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
        
            if (r12.a(r1, r11) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
        
            return r0;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:27:0x0067, please report this as an issue */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            b bVar;
            wk2.i iVar;
            rs2.c cVar;
            lk2.b bVarC;
            b bVar2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f18613c;
            b bVar3 = b.this;
            if (i14 == 0) {
                o13.r.b(obj);
                lk2.b0 b0Var = bVar3.f18608i;
                if (b0Var != null) {
                    boolean zE = bVar3.e();
                    boolean z15 = this.f18616f;
                    if (!zE && bVar3.f18600a.c(bVar3.f18602c.getF92741e()) != null) {
                        this.f18611a = bVar3;
                        this.f18612b = z15;
                        this.f18613c = 1;
                    }
                    z14 = z15;
                    bVar = bVar3;
                    if (z14) {
                        ok2.b bVar4 = bVar.f18600a;
                        iVar = bVar.f18603d;
                        cVar = bVar.f18602c;
                        bVarC = bVar4.c(cVar.getF92741e());
                        if (bVarC != null) {
                            bVar.d().info("Cancel " + iVar.getId() + " on device " + cl2.c.p(cVar));
                            UUID id3 = iVar.getId();
                            this.f18611a = bVar;
                            this.f18613c = 2;
                        }
                    }
                }
            } else if (i14 == 1) {
                z14 = this.f18612b;
                bVar = this.f18611a;
                o13.r.b(obj);
                if (z14) {
                    ok2.b bVar5 = bVar.f18600a;
                    iVar = bVar.f18603d;
                    cVar = bVar.f18602c;
                    bVarC = bVar5.c(cVar.getF92741e());
                    if (bVarC != null) {
                        bVar.d().info("Cancel " + iVar.getId() + " on device " + cl2.c.p(cVar));
                        try {
                            UUID id4 = iVar.getId();
                            this.f18611a = bVar;
                            this.f18613c = 2;
                        } catch (Exception e4) {
                            e = e4;
                            bVar2 = bVar;
                            bVar2.d().error("Cancel " + bVar2.f18603d.getId() + " failed: " + e.getMessage());
                        }
                    }
                }
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar2 = this.f18611a;
                try {
                    o13.r.b(obj);
                } catch (Exception e14) {
                    e = e14;
                    bVar2.d().error("Cancel " + bVar2.f18603d.getId() + " failed: " + e.getMessage());
                }
            }
            lk2.b0 b0Var2 = bVar3.f18608i;
            o13.t tVar = bVar3.f18606g;
            if (b0Var2 != null) {
                b0Var2.cancel();
            }
            ok2.e eVar = this.f18615e;
            int i15 = eVar == null ? -1 : a.f18617a[eVar.ordinal()];
            if (i15 == 1) {
                c2 c2Var = ((a0) tVar.getValue()).f18597c;
                if (c2Var != null) {
                    c2Var.c(null);
                }
            } else if (i15 == 2 || i15 == 3) {
                c2 c2Var2 = ((a0) tVar.getValue()).f18597c;
                if (c2Var2 != null) {
                    c2Var2.c(null);
                }
                bVar3.n(eVar);
            } else if (i15 == 4) {
                bVar3.n(eVar);
            }
            return Unit.INSTANCE;
        }
    }

    public b(ok2.b bVar, o53.b0 b0Var, rs2.c cVar, wk2.i iVar, InterfaceC0272b interfaceC0272b, o.b bVar2) {
        bVar.getClass();
        b0Var.getClass();
        cVar.getClass();
        iVar.getClass();
        interfaceC0272b.getClass();
        bVar2.getClass();
        this.f18600a = bVar;
        this.f18601b = b0Var;
        this.f18602c = cVar;
        this.f18603d = iVar;
        this.f18604e = interfaceC0272b;
        final int i14 = 0;
        this.f18605f = o13.m.b(new e23.a(this) { // from class: bl2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f18594b;

            {
                this.f18594b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                b bVar3 = this.f18594b;
                switch (i15) {
                    case 0:
                        return LoggerFactory.getLogger("CFT#ActiveTransfer@" + bVar3.f18602c.getF92741e());
                    default:
                        b.a aVar = b.f18599l;
                        return new a0(bVar3.f18601b, bVar3.f18604e);
                }
            }
        });
        final int i15 = 1;
        this.f18606g = o13.m.b(new e23.a(this) { // from class: bl2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f18594b;

            {
                this.f18594b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                b bVar3 = this.f18594b;
                switch (i16) {
                    case 0:
                        return LoggerFactory.getLogger("CFT#ActiveTransfer@" + bVar3.f18602c.getF92741e());
                    default:
                        b.a aVar = b.f18599l;
                        return new a0(bVar3.f18601b, bVar3.f18604e);
                }
            }
        });
        this.f18607h = new o(bVar2);
        this.f18609j = new z(iVar, bVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object a(b bVar, v13.c cVar) {
        d dVar;
        ok2.e eVar;
        pk2.x f205158h;
        ok2.e eVar2;
        bVar.getClass();
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f18632d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f18632d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar, cVar);
            }
        } else {
            dVar = new d(bVar, cVar);
        }
        Object objC = dVar.f18630b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f18632d;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    bVar = dVar.f18629a;
                    o13.r.b(objC);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = dVar.f18629a;
                    o13.r.b(objC);
                }
                if (bVar.f18603d.getF205158h() == null && ((f205158h = bVar.f18603d.getF205158h()) == null || (eVar2 = f205158h.f138498c) == null || !eVar2.a())) {
                    return Unit.INSTANCE;
                }
                throw new CancellationException("Batch cancelled");
            }
            o13.r.b(objC);
            a61.d dVar2 = new a61.d(bVar, 18);
            bVar.d().info("execute start: " + bVar.f18603d.getId());
            dVar.f18629a = bVar;
            dVar.f18632d = 1;
            objC = bVar.c(dVar2, dVar);
            if (objC == aVar) {
                return aVar;
            }
            pk2.x xVar = (pk2.x) objC;
            if (xVar.f138496a.f138508a) {
                bVar.d().warn("execute failed: " + bVar.f18603d.getId() + StringUtils.SPACE + xVar);
            } else {
                bVar.d().info("execute complete: " + bVar.f18603d.getId() + StringUtils.SPACE + xVar);
            }
            bVar.f18607h.a(bVar, xVar);
        } catch (Exception e4) {
            bVar.d().error("execute unexpected failure: " + bVar.f18603d.getId(), (Throwable) e4);
            bVar.f18607h.a(bVar, pk2.x.a.b(pk2.x.f138495e, new CoreTransferException(ok2.e.f132644l, e4)));
        }
        a0 a0Var = (a0) bVar.f18606g.getValue();
        lk2.b bVarC = bVar.f18600a.c(bVar.f18602c.getF92741e());
        wk2.i iVar = bVar.f18603d;
        pk2.x f205158h2 = iVar.getF205158h();
        boolean z14 = ((f205158h2 == null || (eVar = f205158h2.f138498c) == null) ? null : eVar.f132657a) != ok2.e.a.DEVICE_INTERRUPT;
        dVar.f18629a = bVar;
        dVar.f18632d = 2;
        if (a0Var.a(bVarC, iVar, z14, dVar) == aVar) {
            return aVar;
        }
        if (bVar.f18603d.getF205158h() == null) {
        }
        throw new CancellationException("Batch cancelled");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(v13.c cVar) {
        bl2.c cVar2;
        b bVar;
        if (cVar instanceof bl2.c) {
            cVar2 = (bl2.c) cVar;
            int i14 = cVar2.f18623d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f18623d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new bl2.c(this, cVar);
            }
        } else {
            cVar2 = new bl2.c(this, cVar);
        }
        Object obj = cVar2.f18621b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f18623d;
        if (i15 == 0) {
            o13.r.b(obj);
            try {
                c2 c2Var = this.f18610k;
                if (c2Var != null) {
                    cVar2.f18620a = this;
                    cVar2.f18623d = 1;
                    if (c2Var.P(cVar2) == aVar) {
                        return aVar;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                bVar = this;
                bVar.d().error("job for " + bVar.f18603d.getId() + " completed with " + e.getMessage());
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = cVar2.f18620a;
            try {
                o13.r.b(obj);
            } catch (Exception e14) {
                e = e14;
                bVar.d().error("job for " + bVar.f18603d.getId() + " completed with " + e.getMessage());
            }
        }
        return Unit.INSTANCE;
    }

    public abstract Object c(a61.d dVar, t13.d dVar2);

    public final Logger d() {
        Object value = this.f18605f.getValue();
        value.getClass();
        return (Logger) value;
    }

    public final boolean e() {
        c2 c2Var = this.f18610k;
        return (c2Var == null || c2Var.isActive()) ? false : true;
    }

    public final void f(FileTransferException fileTransferException) {
        wk2.i iVar = this.f18603d;
        iVar.i(iVar.getF205166p() + 1);
        CoreTransferException coreTransferException = new CoreTransferException(ok2.e.f132646n, "Compression failed", fileTransferException);
        g0 f205155e = iVar.getF205155e();
        wk2.f f205152b = iVar.getF205152b();
        al2.k kVar = al2.k.FAILURE;
        pk2.x.a aVar = pk2.x.f138495e;
        pk2.y yVar = pk2.y.TREAT_AS_SUCCESS;
        aVar.getClass();
        pk2.x xVarA = pk2.x.a.a(yVar, coreTransferException);
        z zVar = this.f18609j;
        Long lB = zVar.b();
        Integer numC = zVar.c();
        lk2.b0 b0Var = this.f18608i;
        al2.l lVar = new al2.l(this.f18602c, f205155e, f205152b, kVar, xVarA, lB, numC, null, b0Var != null ? b0Var.getF113168f() : null, null, 640, null);
        o oVar = this.f18607h;
        oVar.getClass();
        oVar.f18693a.a(lVar, null);
        oVar.f18695c.set(false);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x023c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0246  */
    /* JADX WARN: Code duplicated, block: B:109:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x024d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0252  */
    /* JADX WARN: Code duplicated, block: B:113:0x0258  */
    public final pk2.x g(Exception exc) {
        ok2.e failure;
        CoreTransferException coreTransferException;
        pk2.y yVarA;
        CoreTransferException coreTransferException2;
        String strZ;
        exc.getClass();
        this.f18609j.a();
        n nVar = n.f18688a;
        Logger loggerD = d();
        nVar.getClass();
        ok2.b bVar = this.f18600a;
        bVar.getClass();
        rs2.c cVar = this.f18602c;
        cVar.getClass();
        wk2.i iVar = this.f18603d;
        iVar.getClass();
        StringBuilder sb3 = new StringBuilder("parseException(" + iVar.getId() + "): " + exc.getClass().getName() + ": " + exc.getMessage());
        if (exc.getCause() != null) {
            Throwable cause = exc.getCause();
            sb3.append(": " + (cause != null ? cause.getMessage() : null));
        }
        boolean z14 = exc instanceof CoreTransferException;
        CoreTransferException coreTransferException3 = z14 ? (CoreTransferException) exc : null;
        if (coreTransferException3 != null && (strZ = lg.d.z(coreTransferException3)) != null) {
            sb3.append("\n(" + lg.d.y(exc) + ") from " + strZ);
        }
        loggerD.error(sb3.toString());
        boolean z15 = exc instanceof FileTransferException;
        if (z15 || (exc.getCause() instanceof FileTransferException)) {
            failure = ok2.e.f132646n;
        } else {
            failure = iVar.getDirection() == wk2.h.PHONE_TO_DEVICE ? ok2.e.f132652v : ok2.e.A;
        }
        pk2.y yVar = pk2.y.NON_BLOCKING_FAILURE;
        if (cVar.getF92744h() != 4525 || !(exc instanceof TransferCancelledException) || !p005kotlin.jvm.internal.s.g(iVar.getF205152b().f185843b, "software-update")) {
            if (exc instanceof DataTypeSpecificException) {
                DataTypeSpecificException dataTypeSpecificException = (DataTypeSpecificException) exc;
                coreTransferException = new DeviceDataTypeException(dataTypeSpecificException.getSource(), dataTypeSpecificException.getCode());
                int source = dataTypeSpecificException.getSource();
                if (source == 1) {
                    int code = dataTypeSpecificException.getCode();
                    if (code == 1) {
                        coreTransferException = new CoreTransferException(ok2.e.f132654x, fb1.c.n("CIQ No Space failure: ", exc.getMessage()), exc);
                    } else if (code == 2) {
                        coreTransferException = new CiqNoSlotsException();
                    }
                } else if (source == 2 && dataTypeSpecificException.getCode() == 1) {
                    yVar = pk2.y.FILE_TYPE_BLOCKING_FAILURE;
                    coreTransferException = new CoreTransferException(ok2.e.f132648p, fb1.c.n("SW Update disabled: ", exc.getMessage()), exc);
                }
            } else if (exc instanceof ItemAccessException) {
                switch (n.b.f18691a[((ItemAccessException) exc).getItemAccessResult().ordinal()]) {
                    case 1:
                        failure = ok2.e.f132653w;
                        yVar = pk2.y.NO_RETRY_FAILURE;
                        break;
                    case 2:
                    case 3:
                        failure = ok2.e.f132637e;
                        break;
                    case 4:
                        failure = ok2.e.f132654x;
                        break;
                    case 5:
                        failure = ok2.e.f132653w;
                        yVar = pk2.y.NO_RETRY_FAILURE;
                        break;
                    case 6:
                        failure = ok2.e.f132649q;
                        yVar = pk2.y.NO_RETRY_FAILURE;
                        break;
                }
            } else if (exc instanceof TransferStatusException) {
                int i14 = n.b.f18692b[((TransferStatusException) exc).getStatus().ordinal()];
                if (i14 == 1) {
                    failure = ok2.e.F;
                } else if (i14 == 2) {
                    failure = ok2.e.E;
                } else if (i14 == 3) {
                    failure = ok2.e.f132638f;
                } else if (i14 == 4) {
                    failure = ok2.e.F;
                    yVar = pk2.y.NO_RETRY_FAILURE;
                }
            } else if (exc instanceof CancellationException) {
                pk2.x f205158h = iVar.getF205158h();
                if (f205158h != null) {
                    return f205158h;
                }
                if (bVar.c(cVar.getF92741e()) == null) {
                    failure = ok2.e.f132636d;
                }
            } else if (!z15 && !z14) {
                failure = ok2.e.f132644l;
                loggerD.error("Task failure " + failure + " for " + iVar.getId(), (Throwable) exc);
            } else if (z15 && bVar.c(cVar.getF92741e()) == null) {
                failure = ok2.e.f132636d;
            } else if (z14 && ((CoreTransferException) exc).getFailure() == ok2.e.f132642j && !hb2.i.a(bVar.getConfiguration().f132622b)) {
                coreTransferException = new CoreTransferException(ok2.e.f132643k, exc);
            }
            if (coreTransferException != null) {
                failure = coreTransferException.getFailure();
            }
            yVarA = n.a(bVar, cVar, iVar, yVar, failure);
            if (yVarA != null) {
                yVar = yVarA;
            }
            if (coreTransferException == null) {
                coreTransferException2 = z14 ? (CoreTransferException) exc : null;
                if (coreTransferException2 == null) {
                    coreTransferException = new CoreTransferException(failure, exc);
                } else {
                    coreTransferException = coreTransferException2;
                }
            }
            return new pk2.x(yVar, coreTransferException);
        }
        zk2.k kVar = iVar instanceof zk2.k ? (zk2.k) iVar : null;
        if (kVar != null && kVar.d() / kVar.getTotalSize() >= 0.99d) {
            loggerD.warn("Rally X10 SW Update hack: Treating cancel after 99% complete as success");
            yVar = pk2.y.NO_RETRY_FAILURE;
        }
        coreTransferException = null;
        if (coreTransferException != null) {
            failure = coreTransferException.getFailure();
        }
        yVarA = n.a(bVar, cVar, iVar, yVar, failure);
        if (yVarA != null) {
            yVar = yVarA;
        }
        if (coreTransferException == null) {
            if (z14) {
            }
            if (coreTransferException2 == null) {
                coreTransferException = new CoreTransferException(failure, exc);
            } else {
                coreTransferException = coreTransferException2;
            }
        }
        return new pk2.x(yVar, coreTransferException);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object h(lk2.b bVar, wk2.i iVar, e23.p pVar, boolean z14, Long l14, v13.c cVar) throws IllegalAccessException {
        e eVar;
        b bVar2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f18645d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f18645d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f18643b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f18645d;
        if (i15 == 0) {
            o13.r.b(obj);
            wk2.d f205154d = iVar.getF205154d();
            if (f205154d == null || iVar.getDirection() != wk2.h.DEVICE_TO_PHONE) {
                com.nimbusds.jose.shaded.gson.internal.a.t("Attempted to read a download item");
                return null;
            }
            this.f18609j.d();
            lk2.c0 c0VarJ = bVar.j(iVar.getF205152b().f185842a, this.f18603d.getF205155e().a(), iVar.getTotalSize(), l14 != null ? l14.longValue() : f205154d.getSize(), f205154d, z14);
            c0VarJ.e(pVar);
            this.f18608i = c0VarJ;
            eVar.f18642a = this;
            eVar.f18645d = 1;
            if (c0VarJ.f(eVar) == aVar) {
                return aVar;
            }
            bVar2 = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar2 = eVar.f18642a;
            o13.r.b(obj);
        }
        bVar2.f18609j.a();
        return Unit.INSTANCE;
    }

    public final Object i(lk2.b bVar, wk2.i iVar, e23.p pVar, t tVar) throws FileTransferException, DeviceNotConnectedException {
        Object objJ = j(bVar, iVar, pVar, this.f18600a.getConfiguration().f132626f.invoke(iVar.getF205152b()).booleanValue() && iVar.getF205166p() < 2, tVar);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0129  */
    /* JADX WARN: Code duplicated, block: B:66:0x0132  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:82:0x017b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a8 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    
        if (r1.h(r2, r19, r20, r21, null, r10) == r12) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0170, code lost:
    
        if (r5.h(r6, r7, r3, r13, r0, r10) == r12) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019c, code lost:
    
        if (r5.j(r6, r7, r3, r9, r10) == r12) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(lk2.b bVar, wk2.i iVar, e23.p pVar, boolean z14, v13.c cVar) throws FileTransferException, DeviceNotConnectedException {
        f fVar;
        wk2.i iVar2;
        e23.p pVar2;
        FileTransferException fileTransferException;
        boolean z15;
        Long l14;
        n.a aVarB;
        ?? r14;
        b bVar2;
        FileTransferException fileTransferException2;
        lk2.b bVar3;
        ?? r15;
        wk2.i iVar3;
        n.a aVar;
        boolean z16;
        lk2.b bVar4;
        ?? r16;
        e23.p pVar3;
        b bVar5;
        b bVar6 = this;
        lk2.b bVar7 = bVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f18657k;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f18657k = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar6, cVar);
            }
        } else {
            fVar = new f(bVar6, cVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f18655i;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar2.f18657k;
        if (i15 != 0) {
            if (i15 == 1) {
                boolean z17 = fVar2.f18653g;
                pVar2 = fVar2.f18650d;
                iVar2 = fVar2.f18649c;
                lk2.b bVar8 = fVar2.f18648b;
                b bVar9 = fVar2.f18647a;
                try {
                    o13.r.b(obj);
                } catch (FileTransferException e4) {
                    fileTransferException = e4;
                    z15 = z17;
                    bVar7 = bVar8;
                    bVar6 = bVar9;
                    n nVar = n.f18688a;
                    Logger loggerD = bVar6.d();
                    nVar.getClass();
                    aVarB = n.b(iVar2, fileTransferException, loggerD);
                    if (aVarB == null && aVarB.f18690b) {
                        r14 = 0;
                    } else {
                        r14 = z15;
                    }
                    if (aVarB != null || !aVarB.f18689a) {
                        FileTransferException fileTransferException3 = fileTransferException;
                        bVar2 = bVar6;
                        fileTransferException2 = fileTransferException3;
                        bVar3 = bVar7;
                        r15 = r14;
                        iVar3 = iVar2;
                        aVar = aVarB;
                        if (aVar == null) {
                        }
                        if (aVar != null) {
                            throw fileTransferException2;
                        }
                        throw fileTransferException2;
                    }
                    wk2.d f205154d = iVar2.getF205154d();
                    fVar2.f18647a = bVar6;
                    fVar2.f18648b = bVar7;
                    fVar2.f18649c = iVar2;
                    fVar2.f18650d = pVar2;
                    fVar2.f18651e = fileTransferException;
                    fVar2.f18652f = aVarB;
                    fVar2.f18653g = z15;
                    fVar2.f18654h = r14;
                    fVar2.f18657k = 2;
                    Object objK = bVar6.k(f205154d, "restartTransfer", fVar2);
                    if (objK != aVar2) {
                        e23.p pVar4 = pVar2;
                        z16 = z15;
                        obj = objK;
                        bVar4 = bVar7;
                        r16 = r14;
                        iVar3 = iVar2;
                        aVar = aVarB;
                        pVar3 = pVar4;
                        bVar5 = bVar6;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z16) {
                                throw fileTransferException;
                            }
                            iVar3.i(iVar3.getF205166p() + 1);
                            throw fileTransferException;
                        }
                        z15 = z16;
                        fileTransferException2 = fileTransferException;
                        pVar2 = pVar3;
                        bVar3 = bVar4;
                        bVar2 = bVar5;
                        if (aVar == null) {
                        }
                        if (aVar != null) {
                            throw fileTransferException2;
                        }
                        throw fileTransferException2;
                    }
                    return aVar2;
                }
            } else if (i15 == 2) {
                int i16 = fVar2.f18654h;
                z16 = fVar2.f18653g;
                aVar = fVar2.f18652f;
                fileTransferException = fVar2.f18651e;
                pVar3 = fVar2.f18650d;
                iVar3 = fVar2.f18649c;
                bVar4 = fVar2.f18648b;
                bVar5 = fVar2.f18647a;
                o13.r.b(obj);
                r16 = i16;
                if (!((Boolean) obj).booleanValue()) {
                    if (z16) {
                        throw fileTransferException;
                    }
                    iVar3.i(iVar3.getF205166p() + 1);
                    throw fileTransferException;
                }
                z15 = z16;
                fileTransferException2 = fileTransferException;
                pVar2 = pVar3;
                bVar3 = bVar4;
                bVar2 = bVar5;
                if (aVar == null && aVar.f18689a && r15 == z15) {
                    if (bVar3 == null) {
                        throw new DeviceNotConnectedException();
                    }
                    boolean z18 = r15 != 0;
                    Long l15 = new Long(0L);
                    fVar2.f18647a = null;
                    fVar2.f18648b = null;
                    fVar2.f18649c = null;
                    fVar2.f18650d = null;
                    fVar2.f18651e = null;
                    fVar2.f18652f = null;
                    fVar2.f18657k = 3;
                } else {
                    if (aVar != null || !aVar.f18690b) {
                        throw fileTransferException2;
                    }
                    bVar2.f(fileTransferException2);
                    if (bVar3 == null) {
                        throw new DeviceNotConnectedException();
                    }
                    boolean z19 = r15 != 0;
                    fVar2.f18647a = null;
                    fVar2.f18648b = null;
                    fVar2.f18649c = null;
                    fVar2.f18650d = null;
                    fVar2.f18651e = null;
                    fVar2.f18652f = null;
                    fVar2.f18657k = 4;
                }
            } else {
                if (i15 != 3 && i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        try {
            Logger loggerD2 = bVar6.d();
            UUID id3 = iVar.getId();
            wk2.d f205154d2 = iVar.getF205154d();
            if (f205154d2 != null) {
                try {
                    l14 = new Long(f205154d2.getSize());
                } catch (FileTransferException e14) {
                    e = e14;
                    iVar2 = iVar;
                    pVar2 = pVar;
                    fileTransferException = e;
                    z15 = z14;
                    n nVar2 = n.f18688a;
                    Logger loggerD3 = bVar6.d();
                    nVar2.getClass();
                    aVarB = n.b(iVar2, fileTransferException, loggerD3);
                    if (aVarB == null) {
                        r14 = z15;
                    } else {
                        r14 = z15;
                    }
                    if (aVarB != null) {
                    }
                    FileTransferException fileTransferException4 = fileTransferException;
                    bVar2 = bVar6;
                    fileTransferException2 = fileTransferException4;
                    bVar3 = bVar7;
                    r15 = r14;
                    iVar3 = iVar2;
                    aVar = aVarB;
                    if (aVar == null) {
                    }
                    if (aVar != null) {
                        throw fileTransferException2;
                    }
                    throw fileTransferException2;
                }
            } else {
                l14 = null;
            }
            loggerD2.debug("Start read for " + id3 + " from offset " + l14);
            if (bVar7 == null) {
                throw new DeviceNotConnectedException();
            }
            fVar2.f18647a = bVar6;
            fVar2.f18648b = bVar7;
            fVar2.f18649c = iVar;
            fVar2.f18650d = pVar;
            fVar2.f18653g = z14;
            fVar2.f18657k = 1;
            try {
            } catch (FileTransferException e15) {
                e = e15;
                fVar2 = fVar2;
                bVar6 = this;
                bVar7 = bVar;
                iVar2 = iVar;
                pVar2 = pVar;
                fileTransferException = e;
                z15 = z14;
                n nVar3 = n.f18688a;
                Logger loggerD4 = bVar6.d();
                nVar3.getClass();
                aVarB = n.b(iVar2, fileTransferException, loggerD4);
                if (aVarB == null) {
                    r14 = z15;
                } else {
                    r14 = z15;
                }
                if (aVarB != null) {
                }
                FileTransferException fileTransferException5 = fileTransferException;
                bVar2 = bVar6;
                fileTransferException2 = fileTransferException5;
                bVar3 = bVar7;
                r15 = r14;
                iVar3 = iVar2;
                aVar = aVarB;
                if (aVar == null) {
                }
                if (aVar != null) {
                    throw fileTransferException2;
                }
                throw fileTransferException2;
            }
        } catch (FileTransferException e16) {
            e = e16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0073 -> B:21:0x0076). Please report as a decompilation issue!!! */
    public final Object k(wk2.d dVar, String str, v13.c cVar) {
        g gVar;
        b bVar;
        wk2.d dVar2;
        int i14;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i15 = gVar.f18663f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                gVar.f18663f = i15 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f18661d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = gVar.f18663f;
        if (i16 == 0) {
            o13.r.b(obj);
            if (dVar == null) {
                return Boolean.TRUE;
            }
            d().warn("Attempt resetDataSink(" + str + ") for " + this.f18603d.getId());
            bVar = this;
            dVar2 = dVar;
            i14 = 2;
            if (2 != 2) {
                dVar2.a();
                gVar.f18658a = bVar;
                gVar.f18659b = dVar2;
                gVar.f18660c = i14;
                gVar.f18663f = 1;
                if (m0.b(500L, gVar) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = gVar.f18660c;
            dVar2 = gVar.f18659b;
            bVar = gVar.f18658a;
            o13.r.b(obj);
        }
        while (!dVar2.reset()) {
            i14--;
            Logger loggerD = bVar.d();
            wk2.i iVar = bVar.f18603d;
            loggerD.warn("Failed to delete file " + iVar.getId() + ". Attempts remaining: " + i14);
            if (i14 <= 0) {
                if ((dVar2 instanceof wk2.g) || iVar.getF205152b().f185845d >= 1000000 || !(iVar instanceof zk2.k)) {
                    return Boolean.FALSE;
                }
                bVar.d().warn("Unable to delete file " + iVar.getId() + ". Retry in memory");
                dVar2.close();
                wk2.d.f185837a.getClass();
                ((zk2.k) iVar).f205154d = new wk2.g();
                return Boolean.TRUE;
            }
            if (i14 != 2) {
                dVar2.a();
                gVar.f18658a = bVar;
                gVar.f18659b = dVar2;
                gVar.f18660c = i14;
                gVar.f18663f = 1;
                if (m0.b(500L, gVar) == aVar) {
                    return aVar;
                }
            }
        }
        return Boolean.TRUE;
    }

    public final c2 l(e23.l lVar, e23.l lVar2, e23.a aVar) throws IllegalAccessException {
        if (this.f18610k != null) {
            com.nimbusds.jose.shaded.gson.internal.a.t("ActiveTransfer has already been launched");
            return null;
        }
        c2 c2VarT = ge1.b.T(this.f18601b, null, null, new j(lVar, this, lVar2, aVar, null), 3);
        this.f18610k = c2VarT;
        return c2VarT;
    }

    public final void m(boolean z14, ok2.e eVar) {
        ge1.b.T(this.f18601b, null, null, new c(eVar, z14, null), 3);
    }

    public void n(ok2.e eVar) {
        eVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:55:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object o(lk2.b bVar, wk2.i iVar, e23.p pVar, boolean z14, boolean z15, v13.c cVar) throws IllegalAccessException, CoreTransferException {
        l lVar;
        wk2.e f205153c;
        wk2.i iVar2;
        e23.p pVar2;
        boolean z16;
        b bVar2;
        b bVar3;
        e23.p pVar3;
        lk2.b bVar4;
        wk2.i iVar3;
        String str;
        lk2.c0 c0VarE;
        b bVar5;
        lk2.b bVar6 = bVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f18679i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f18679i = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.f18677g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f18679i;
        if (i15 != 0) {
            if (i15 == 1) {
                boolean z17 = lVar.f18676f;
                f205153c = lVar.f18675e;
                pVar3 = lVar.f18674d;
                iVar2 = lVar.f18673c;
                bVar4 = lVar.f18672b;
                b bVar7 = lVar.f18671a;
                try {
                    o13.r.b(obj);
                    bVar3 = bVar7;
                    z16 = z17;
                    bVar6 = bVar4;
                    pVar2 = pVar3;
                } catch (Exception e4) {
                    e = e4;
                    z16 = z17;
                    bVar6 = bVar4;
                    pVar2 = pVar3;
                    bVar2 = bVar7;
                    bVar2.d().error("Failed to delete partially written file " + iVar2.getId(), (Throwable) e);
                    bVar3 = bVar2;
                }
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar5 = lVar.f18671a;
                o13.r.b(obj);
            }
            bVar5.f18609j.a();
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        f205153c = iVar.getF205153c();
        if (f205153c == null || iVar.getDirection() != wk2.h.PHONE_TO_DEVICE) {
            com.nimbusds.jose.shaded.gson.internal.a.t("Attempted to write an upload item");
            return null;
        }
        if (z15) {
            iVar2 = iVar;
            pVar2 = pVar;
            z16 = z14;
            bVar3 = this;
        } else {
            try {
                UUID uuid = iVar.getF205152b().f185842a;
                lVar.f18671a = this;
                lVar.f18672b = bVar6;
                iVar2 = iVar;
                try {
                    lVar.f18673c = iVar2;
                    pVar2 = pVar;
                    try {
                        lVar.f18674d = pVar2;
                        lVar.f18675e = f205153c;
                        z16 = z14;
                        try {
                            lVar.f18676f = z16;
                            lVar.f18679i = 1;
                            if (bVar6.k(uuid, lVar) != aVar) {
                                bVar3 = this;
                                pVar3 = pVar2;
                                bVar4 = bVar6;
                                bVar6 = bVar4;
                                pVar2 = pVar3;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            bVar2 = this;
                            bVar2.d().error("Failed to delete partially written file " + iVar2.getId(), (Throwable) e);
                            bVar3 = bVar2;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        z16 = z14;
                        bVar2 = this;
                        bVar2.d().error("Failed to delete partially written file " + iVar2.getId(), (Throwable) e);
                        bVar3 = bVar2;
                        z zVar = bVar3.f18609j;
                        iVar3 = bVar3.f18603d;
                        zVar.d();
                        if (p005kotlin.jvm.internal.s.g(iVar2.getF205152b().f185843b, "software-update")) {
                            str = iVar2.getF205152b().f185847f.get("PATH_ON_DEVICE_PROPERTY_KEY");
                            if (str == null) {
                                throw new CoreTransferException(ok2.e.f132641i, "Path name not currently available", null, 4, null);
                            }
                            c0VarE = bVar6.e(iVar2.getId(), str, iVar3.getF205155e().a(), f205153c, z16);
                        } else {
                            c0VarE = bVar6.b(iVar2.getF205152b().f185842a, iVar2.getDataType(), iVar3.getF205155e().a(), f205153c, z16);
                        }
                        c0VarE.e(pVar2);
                        bVar3.f18608i = c0VarE;
                        lVar.f18671a = bVar3;
                        lVar.f18672b = null;
                        lVar.f18673c = null;
                        lVar.f18674d = null;
                        lVar.f18675e = null;
                        lVar.f18679i = 2;
                        if (c0VarE.f(lVar) != aVar) {
                            bVar5 = bVar3;
                            bVar5.f18609j.a();
                            return Unit.INSTANCE;
                        }
                        return aVar;
                    }
                } catch (Exception e16) {
                    e = e16;
                    pVar2 = pVar;
                    z16 = z14;
                    bVar2 = this;
                    bVar2.d().error("Failed to delete partially written file " + iVar2.getId(), (Throwable) e);
                    bVar3 = bVar2;
                    z zVar2 = bVar3.f18609j;
                    iVar3 = bVar3.f18603d;
                    zVar2.d();
                    if (p005kotlin.jvm.internal.s.g(iVar2.getF205152b().f185843b, "software-update")) {
                        c0VarE = bVar6.b(iVar2.getF205152b().f185842a, iVar2.getDataType(), iVar3.getF205155e().a(), f205153c, z16);
                    } else {
                        str = iVar2.getF205152b().f185847f.get("PATH_ON_DEVICE_PROPERTY_KEY");
                        if (str == null) {
                            throw new CoreTransferException(ok2.e.f132641i, "Path name not currently available", null, 4, null);
                        }
                        c0VarE = bVar6.e(iVar2.getId(), str, iVar3.getF205155e().a(), f205153c, z16);
                    }
                    c0VarE.e(pVar2);
                    bVar3.f18608i = c0VarE;
                    lVar.f18671a = bVar3;
                    lVar.f18672b = null;
                    lVar.f18673c = null;
                    lVar.f18674d = null;
                    lVar.f18675e = null;
                    lVar.f18679i = 2;
                    if (c0VarE.f(lVar) != aVar) {
                        bVar5 = bVar3;
                        bVar5.f18609j.a();
                        return Unit.INSTANCE;
                    }
                    return aVar;
                }
            } catch (Exception e17) {
                e = e17;
                iVar2 = iVar;
            }
        }
        return aVar;
        z zVar3 = bVar3.f18609j;
        iVar3 = bVar3.f18603d;
        zVar3.d();
        if (p005kotlin.jvm.internal.s.g(iVar2.getF205152b().f185843b, "software-update")) {
            c0VarE = bVar6.b(iVar2.getF205152b().f185842a, iVar2.getDataType(), iVar3.getF205155e().a(), f205153c, z16);
        } else {
            str = iVar2.getF205152b().f185847f.get("PATH_ON_DEVICE_PROPERTY_KEY");
            if (str == null) {
                throw new CoreTransferException(ok2.e.f132641i, "Path name not currently available", null, 4, null);
            }
            c0VarE = bVar6.e(iVar2.getId(), str, iVar3.getF205155e().a(), f205153c, z16);
        }
        c0VarE.e(pVar2);
        bVar3.f18608i = c0VarE;
        lVar.f18671a = bVar3;
        lVar.f18672b = null;
        lVar.f18673c = null;
        lVar.f18674d = null;
        lVar.f18675e = null;
        lVar.f18679i = 2;
        if (c0VarE.f(lVar) != aVar) {
            bVar5 = bVar3;
            bVar5.f18609j.a();
            return Unit.INSTANCE;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        if (r2.o(r3, r4, r5, r6, false, r8) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fa, code lost:
    
        if (r2.o(r3, r4, r5, false, true, r8) == r1) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(lk2.b bVar, wk2.i iVar, e23.p pVar, v13.c cVar) throws FileTransferException, DeviceNotConnectedException {
        m mVar;
        b bVar2;
        lk2.b bVar3;
        wk2.i iVar2;
        e23.p pVar2;
        boolean z14;
        n.a aVarB;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f18687h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f18687h = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        m mVar2 = mVar;
        Object obj = mVar2.f18685f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar2.f18687h;
        if (i15 == 0) {
            o13.r.b(obj);
            boolean zBooleanValue = this.f18600a.getConfiguration().f132626f.invoke(iVar.getF205152b()).booleanValue();
            try {
                if (bVar == null) {
                    throw new DeviceNotConnectedException();
                }
                mVar2.f18680a = this;
                mVar2.f18681b = bVar;
                mVar2.f18682c = iVar;
                mVar2.f18683d = pVar;
                mVar2.f18684e = zBooleanValue;
                mVar2.f18687h = 1;
                if (o(bVar, iVar, pVar, zBooleanValue, true, mVar2) == aVar) {
                    return aVar;
                }
            } catch (FileTransferException e4) {
                e = e4;
                bVar2 = this;
                bVar3 = bVar;
                iVar2 = iVar;
                pVar2 = pVar;
                z14 = zBooleanValue;
                n nVar = n.f18688a;
                Logger loggerD = bVar2.d();
                nVar.getClass();
                aVarB = n.b(iVar2, e, loggerD);
                if (aVarB == null) {
                }
                if (aVarB != null) {
                }
                throw e;
            }
        } else if (i15 == 1) {
            z14 = mVar2.f18684e;
            e23.p pVar3 = mVar2.f18683d;
            wk2.i iVar3 = mVar2.f18682c;
            lk2.b bVar4 = mVar2.f18681b;
            b bVar5 = mVar2.f18680a;
            try {
                o13.r.b(obj);
            } catch (FileTransferException e14) {
                e = e14;
                pVar2 = pVar3;
                bVar2 = bVar5;
                iVar2 = iVar3;
                bVar3 = bVar4;
                n nVar2 = n.f18688a;
                Logger loggerD2 = bVar2.d();
                nVar2.getClass();
                aVarB = n.b(iVar2, e, loggerD2);
                if (aVarB == null && aVarB.f18689a) {
                    if (aVarB.f18690b) {
                        z14 = false;
                    }
                    boolean z15 = z14;
                    if (iVar2.getF205153c() != null) {
                        zk2.k kVar = iVar2 instanceof zk2.k ? (zk2.k) iVar2 : null;
                        if (kVar != null) {
                            kVar.f205165o = 0L;
                        }
                    }
                    if (bVar3 == null) {
                        throw new DeviceNotConnectedException();
                    }
                    mVar2.f18680a = null;
                    mVar2.f18681b = null;
                    mVar2.f18682c = null;
                    mVar2.f18683d = null;
                    mVar2.f18687h = 2;
                } else {
                    if (aVarB != null || !aVarB.f18690b) {
                        throw e;
                    }
                    bVar2.f(e);
                    if (bVar3 == null) {
                        throw new DeviceNotConnectedException();
                    }
                    mVar2.f18680a = null;
                    mVar2.f18681b = null;
                    mVar2.f18682c = null;
                    mVar2.f18683d = null;
                    mVar2.f18687h = 3;
                }
            }
        } else {
            if (i15 != 2 && i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lbl2/b$a;", "", "<init>", "()V", "", "MAX_FILE_RESET_RETRIES", "I", "MAX_BYTES_FOR_IN_MEMORY_RETRY", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a(ok2.b bVar, o53.b0 b0Var, rs2.c cVar, wk2.i iVar, InterfaceC0272b interfaceC0272b, o.b bVar2) {
            bVar.getClass();
            b0Var.getClass();
            cVar.getClass();
            iVar.getClass();
            interfaceC0272b.getClass();
            bVar2.getClass();
            return iVar.getDirection() == wk2.h.PHONE_TO_DEVICE ? new e0(bVar, b0Var, cVar, iVar, interfaceC0272b, bVar2) : new r(bVar, b0Var, cVar, iVar, interfaceC0272b, bVar2);
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(ok2.g gVar, wk2.i iVar) {
        this(gVar.f132683b, gVar.f132687f, gVar.f132682a, iVar, gVar, gVar);
        gVar.getClass();
        iVar.getClass();
    }
}
